package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
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
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bj;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.dj;
import org.telegram.messenger.ej;
import org.telegram.messenger.ep;
import org.telegram.messenger.gj;
import org.telegram.messenger.h20;
import org.telegram.messenger.hc;
import org.telegram.messenger.hj;
import org.telegram.messenger.ib;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.mc;
import org.telegram.messenger.mu;
import org.telegram.messenger.qu;
import org.telegram.messenger.qz;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.vv;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.qn0;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u21;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.km;
import org.telegram.ui.qs0;
import org.telegram.ui.zh0;
public class q1 extends z implements jn0, mc, org.telegram.messenger.z5, r9, us, fe.e, r4 {
    public static final float[] f22482ed = new float[8];
    public static TextPaint f22483fd;
    public static TextPaint f22484gd;
    public boolean A0;
    public boolean A1;
    public int A2;
    public int A3;
    public boolean A4;
    public int A5;
    public boolean A6;
    public boolean A7;
    public t80 A8;
    public int A9;
    public org.telegram.ui.Components.k5 Aa;
    public float Ab;
    public Runnable Ac;
    public boolean B0;
    public int B1;
    public int B2;
    public qz0 B3;
    public final i1 B4;
    public int B5;
    public boolean B6;
    public boolean B7;
    public ArrayList B8;
    public int B9;
    public org.telegram.ui.Components.k5 Ba;
    public float Bb;
    public Runnable Bc;
    public final Rect C0;
    public float C1;
    public boolean C2;
    public qz0 C3;
    public final qn0 C4;
    public boolean C5;
    public boolean C6;
    public boolean C7;
    public boolean C8;
    public CharSequence C9;
    public org.telegram.ui.Components.k5 Ca;
    public long Cb;
    public int Cc;
    public final fe.b D;
    public int D0;
    public boolean D1;
    public boolean D2;
    public qz0 D3;
    public final org.telegram.ui.ActionBar.w0 D4;
    public boolean D5;
    public boolean D6;
    public final ImageReceiver D7;
    public int D8;
    public boolean D9;
    public dc Da;
    public float Db;
    public int Dc;
    public boolean E;
    public int E0;
    public int E1;
    public boolean E2;
    public boolean E3;
    public int E4;
    public float E5;
    public boolean E6;
    public int E7;
    public boolean E8;
    public boolean E9;
    public dc Ea;
    public float Eb;
    public boolean Ec;
    public boolean F;
    public int F0;
    public float F1;
    public dc F2;
    public boolean F3;
    public int F4;
    public boolean F5;
    public boolean F6;
    public Drawable[] F7;
    public int F8;
    public Paint F9;
    public dc Fa;
    public int Fb;
    public float Fc;
    public boolean G;
    public int G0;
    public int G1;
    public int G2;
    public boolean G3;
    public boolean G4;
    public final ArrayList G5;
    public boolean G6;
    public int[] G7;
    public boolean G8;
    public Path G9;
    public float Ga;
    public float Gb;
    public Paint Gc;
    public boolean H;
    public int H0;
    public int H1;
    public final Drawable[] H2;
    public boolean H3;
    public z0 H4;
    public d1 H5;
    public int H6;
    public Drawable H7;
    public boolean H8;
    public final Path H9;
    public float Ha;
    public float Hb;
    public Drawable Hc;
    public boolean I;
    public boolean I0;
    public long I1;
    public final org.telegram.ui.ActionBar.g6[] I2;
    public int I3;
    public a1 I4;
    public int I5;
    public boolean I6;
    public Drawable I7;
    public boolean I8;
    public final float[] I9;
    public y Ia;
    public float Ib;
    public boolean Ic;
    public boolean J;
    public boolean J0;
    public long J1;
    public final int[] J2;
    public int J3;
    public StaticLayout J4;
    public boolean J5;
    public org.telegram.ui.ActionBar.c5 J6;
    public int J7;
    public int J8;
    public nh.i J9;
    public Path Ja;
    public int Jb;
    public vx0 Jc;
    public ej K;
    public int K0;
    public int K1;
    public final RectF K2;
    public int K3;
    public double K4;
    public boolean K5;
    public org.telegram.ui.ActionBar.c5 K6;
    public boolean K7;
    public boolean K8;
    public float K9;
    public final RectF Ka;
    public boolean Kb;
    public int Kc;
    public bj L;
    public int L0;
    public TLRPC.Document L1;
    public final int[] L2;
    public int L3;
    public int L4;
    public int L5;
    public int L6;
    public boolean L7;
    public Path L8;
    public float L9;
    public final RectF La;
    public final m.c3 Lb;
    public m1 Lc;
    public boolean M;
    public float M0;
    public boolean M1;
    public float M2;
    public int M3;
    public int M4;
    public nh.i M5;
    public int M6;
    public boolean M7;
    public Path M8;
    public float M9;
    public int Ma;
    public m61 Mb;
    public StaticLayout Mc;
    public final sg.p0 N;
    public boolean N0;
    public li.k N1;
    public SpannableStringBuilder N2;
    public int N3;
    public final ArrayList N4;
    public boolean N5;
    public int N6;
    public CheckBoxBase N7;
    public float[] N8;
    public float N9;
    public float Na;
    public j1 Nb;
    public String Nc;
    public final pg.a O;
    public boolean O0;
    public int O1;
    public boolean O2;
    public int O3;
    public final ArrayList O4;
    public jj O5;
    public int O6;
    public StaticLayout O7;
    public float[] O8;
    public nh.h O9;
    public float Oa;
    public org.telegram.ui.ActionBar.p6 Ob;
    public Paint Oc;
    public final pg.c P;
    public final RadialProgress2 P0;
    public boolean P1;
    public boolean P2;
    public int P3;
    public float P4;
    public jj P5;
    public int P6;
    public StaticLayout P7;
    public float P8;
    public Integer P9;
    public int Pa;
    public final boolean Pb;
    public Paint Pc;
    public boolean Q;
    public final RadialProgress2 Q0;
    public boolean Q1;
    public long Q2;
    public int Q3;
    public int Q4;
    public ej Q5;
    public boolean Q6;
    public final AtomicReference Q7;
    public float Q8;
    public Path Q9;
    public l1 Qa;
    public final li.k Qb;
    public float Qc;
    public long R;
    public boolean R0;
    public boolean R1;
    public boolean R2;
    public int R3;
    public int R4;
    public boolean R5;
    public x41 R6;
    public final ImageReceiver R7;
    public float R8;
    public float[] R9;
    public final aa0 Ra;
    public final ArrayList Rb;
    public int Rc;
    public qz0 S;
    public final int[] S0;
    public boolean S1;
    public int S2;
    public int S3;
    public float S4;
    public boolean S5;
    public x41 S6;
    public int S7;
    public float S8;
    public final float S9;
    public int Sa;
    public final Stack Sb;
    public hj Sc;
    public k80 T;
    public final ag.c2 T0;
    public boolean T1;
    public y T2;
    public int T3;
    public boolean T4;
    public boolean T5;
    public int T6;
    public int T7;
    public StaticLayout T8;
    public float T9;
    public int Ta;
    public final Path Tb;
    public float Tc;
    public CornerPathEffect U;
    public final ImageReceiver U0;
    public int U1;
    public boolean U2;
    public int U3;
    public boolean U4;
    public boolean U5;
    public boolean U6;
    public float U7;
    public int U8;
    public float U9;
    public int Ua;
    public boolean Ub;
    public float Uc;
    public int V;
    public ColorMatrixColorFilter V0;
    public int V1;
    public boolean V2;
    public int V3;
    public boolean V4;
    public n4 V5;
    public boolean V6;
    public int V7;
    public boolean V8;
    public StaticLayout V9;
    public int Va;
    public m4.c Vb;
    public final g1 Vc;
    public long W;
    public final org.telegram.ui.Components.r8 W0;
    public int W1;
    public int W2;
    public boolean W3;
    public boolean W4;
    public AnimatorSet W5;
    public boolean W6;
    public int W7;
    public boolean W8;
    public int W9;
    public int Wa;
    public final b1 Wb;
    public ColorFilter[] Wc;
    public t1 X0;
    public int X1;
    public y X2;
    public boolean X3;
    public boolean X4;
    public final int X5;
    public float X6;
    public int X7;
    public boolean X8;
    public String X9;
    public float Xa;
    public final b1 Xb;
    public int[] Xc;
    public vh.j Y0;
    public int Y1;
    public int Y2;
    public boolean Y3;
    public boolean Y4;
    public final int Y5;
    public int Y6;
    public int Y7;
    public StaticLayout Y8;
    public nh.i Y9;
    public boolean Ya;
    public long Yb;
    public Paint Yc;
    public Paint Z0;
    public int Z1;
    public y Z2;
    public final RectF Z3;
    public boolean Z4;
    public boolean Z5;
    public int Z6;
    public int Z7;
    public final RectF Z8;
    public final Path Z9;
    public float Za;
    public float Zb;
    public float Zc;
    public qz0 f22485a0;
    public bi0 f22486a1;
    public int a2;
    public boolean f22487a3;
    public final RectF f22488a4;
    public boolean f22489a5;
    public int f22490a6;
    public boolean f22491a7;
    public boolean f22492a8;
    public dc f22493a9;
    public final float[] f22494aa;
    public int f22495ab;
    public float f22496ac;
    public float f22497ad;
    public k80 f22498b0;
    public Paint f22499b1;
    public float f22500b2;
    public final il0 f22501b3;
    public TLObject f22502b4;
    public int f22503b5;
    public byte[] f22504b6;
    public int f22505b7;
    public boolean f22506b8;
    public RectF f22507b9;
    public StaticLayout f22508ba;
    public int f22509bb;
    public boolean f22510bc;
    public int f22511bd;
    public CornerPathEffect f22512c0;
    public Paint f22513c1;
    public float f22514c2;
    public StaticLayout f22515c3;
    public TLRPC.PhotoSize f22516c4;
    public float f22517c5;
    public byte[] f22518c6;
    public int f22519c7;
    public boolean f22520c8;
    public mg.a f22521c9;
    public int f22522ca;
    public int f22523cb;
    public boolean f22524cc;
    public int f22525cd;
    public int f22526d0;
    public Paint f22527d1;
    public int f22528d2;
    public int f22529d3;
    public TLRPC.PhotoSize f22530d4;
    public boolean f22531d5;
    public boolean f22532d6;
    public CheckBoxBase[] f22533d7;
    public boolean f22534d8;
    public int f22535d9;
    public String f22536da;
    public boolean f22537db;
    public boolean f22538dc;
    public TL_stars.StarGift f22539dd;
    public l11 f22540e0;
    public gw0 f22541e1;
    public StaticLayout f22542e2;
    public int f22543e3;
    public BitmapDrawable f22544e4;
    public boolean f22545e5;
    public boolean f22546e6;
    public e40 e7;
    public boolean f22547e8;
    public float f22548e9;
    public StaticLayout f22549ea;
    public final boolean eb;
    public m1 f22550ec;
    public boolean f22551f;
    public int f22552f0;
    public boolean f22553f1;
    public StaticLayout f22554f2;
    public boolean f22555f3;
    public String f22556f4;
    public float f22557f5;
    public boolean f22558f6;
    public t80 f7;
    public org.telegram.ui.Components.t5 f22559f8;
    public float f22560f9;
    public int f22561fa;
    public float f22562fb;
    public m1 f22563fc;
    public ux0 f22564g0;
    public float f22565g1;
    public float f22566g2;
    public v1 f22567g3;
    public String f22568g4;
    public int f22569g5;
    public boolean f22570g6;
    public float f22571g7;
    public float f22572g8;
    public float f22573g9;
    public String f22574ga;
    public final x1 gb;
    public boolean gc;
    public boolean h;
    public int f22575h0;
    public float f22576h1;
    public float f22577h2;
    public int f22578h3;
    public boolean f22579h4;
    public TLRPC.Poll f22580h5;
    public boolean f22581h6;
    public long f22582h7;
    public float f22583h8;
    public boolean f22584h9;
    public TLRPC.User ha;
    public boolean f22585hb;
    public boolean f22586hc;
    public long f22587i0;
    public boolean f22588i1;
    public float f22589i2;
    public int f22590i3;
    public float f22591i4;
    public ArrayList f22592i5;
    public boolean f22593i6;
    public ImageReceiver[] f22594i7;
    public TLRPC.PhotoSize f22595i8;
    public boolean f22596i9;
    public TLRPC.Chat ia;
    public boolean f22597ib;
    public int f22598ic;
    public int f22599j0;
    public boolean f22600j1;
    public float f22601j2;
    public int f22602j3;
    public float f22603j4;
    public int f22604j5;
    public boolean f22605j6;
    public org.telegram.ui.Components.r8[] f22606j7;
    public int f22607j8;
    public boolean f22608j9;
    public TLRPC.FileLocation f22609ja;
    public boolean f22610jb;
    public m1 f22611jc;
    public dc f22612k0;
    public CheckBoxBase f22613k1;
    public boolean f22614k2;
    public hj f22615k3;
    public long f22616k4;
    public h11 f22617k5;
    public boolean f22618k6;
    public boolean[] f22619k7;
    public Drawable f22620k8;
    public float f22621k9;
    public String f22622ka;
    public final org.telegram.ui.Components.t5 f22623kb;
    public Drawable f22624kc;
    public org.telegram.ui.Components.d5 f22625l0;
    public CheckBoxBase l1;
    public dc f22626l2;
    public hj f22627l3;
    public long l4;
    public org.telegram.ui.Components.t5 f22628l5;
    public boolean f22629l6;
    public StaticLayout f22630l7;
    public dl0 f22631l8;
    public float f22632l9;
    public Object f22633la;
    public org.telegram.messenger.o6 f22634lb;
    public final AtomicReference f22635lc;
    public boolean m0;
    public boolean f22636m1;
    public StaticLayout f22637m2;
    public rh0 f22638m3;
    public boolean f22639m4;
    public int f22640m5;
    public boolean f22641m6;
    public org.telegram.ui.Components.x5 f22642m7;
    public dl0 f22643m8;
    public StaticLayout f22644m9;
    public long f22645ma;
    public boolean f22646mb;
    public long f22647mc;
    public int f22648n;
    public int f22649n0;
    public boolean f22650n1;
    public StaticLayout f22651n2;
    public CharSequence f22652n3;
    public boolean f22653n4;
    public int f22654n5;
    public boolean f22655n6;
    public boolean f22656n7;
    public dl0 f22657n8;
    public int f22658n9;
    public String f22659na;
    public final h1 f22660nb;
    public int f22661nc;
    public int f22662o0;
    public float f22663o1;
    public StaticLayout f22664o2;
    public hj f22665o3;
    public org.telegram.ui.Components.o5 f22666o4;
    public boolean f22667o5;
    public boolean f22668o6;
    public int f22669o7;
    public dl0 f22670o8;
    public final StaticLayout[] f22671o9;
    public org.telegram.ui.Components.d5 f22672oa;
    public int f22673ob;
    public int f22674oc;
    public int f22675p0;
    public long f22676p1;
    public StaticLayout f22677p2;
    public int f22678p3;
    public q80 f22679p4;
    public boolean p5;
    public boolean f22680p6;
    public int f22681p7;
    public dl0 f22682p8;
    public int p9;
    public org.telegram.ui.Components.d5 f22683pa;
    public int f22684pb;
    public int f22685pc;
    public int f22686q0;
    public int f22687q1;
    public float f22688q2;
    public float f22689q3;
    public gj f22690q4;
    public float f22691q5;
    public boolean q6;
    public boolean f22692q7;
    public boolean f22693q8;
    public boolean f22694q9;
    public TLRPC.User f22695qa;
    public float f22696qb;
    public int qc;
    public p3 f22697r;
    public s1 f22698r0;
    public org.telegram.ui.e5 f22699r1;
    public float f22700r2;
    public float f22701r3;
    public int f22702r4;
    public int f22703r5;
    public long f22704r6;
    public int f22705r7;
    public rh.s8 f22706r8;
    public float f22707r9;
    public TLRPC.User f22708ra;
    public boolean f22709rb;
    public float rc;
    public boolean f22710s;
    public u1 f22711s0;
    public org.telegram.messenger.k9 f22712s1;
    public boolean f22713s2;
    public int f22714s3;
    public final ji.a f22715s4;
    public float f22716s5;
    public boolean f22717s6;
    public int f22718s7;
    public int f22719s8;
    public int f22720s9;
    public TLRPC.Chat f22721sa;
    public ValueAnimator f22722sb;
    public float f22723sc;
    public int f22724t0;
    public boolean f22725t1;
    public RectF f22726t2;
    public int f22727t3;
    public int f22728t4;
    public float f22729t5;
    public boolean f22730t6;
    public int f22731t7;
    public y f22732t8;
    public int f22733t9;
    public String f22734ta;
    public int f22735tb;
    public org.telegram.ui.Components.x7 f22736tc;
    public int f22737u0;
    public boolean f22738u1;
    public r1 f22739u2;
    public int f22740u3;
    public final ArrayList f22741u4;
    public int f22742u5;
    public boolean f22743u6;
    public int f22744u7;
    public qz0 f22745u8;
    public final float[] f22746u9;
    public String ua;
    public final h1 f22747ub;
    public xa.n f22748uc;
    public int f22749v0;
    public boolean f22750v1;
    public w1 f22751v2;
    public StaticLayout f22752v3;
    public final ArrayList f22753v4;
    public int f22754v5;
    public boolean f22755v6;
    public boolean f22756v7;
    public qz0 f22757v8;
    public float f22758v9;
    public boolean f22759va;
    public final SparseArray f22760vb;
    public boolean vc;
    public l0 f22761w;
    public int f22762w0;
    public boolean f22763w1;
    public int f22764w2;
    public org.telegram.ui.Components.e6 f22765w3;
    public t80 f22766w4;
    public boolean f22767w5;
    public boolean f22768w6;
    public final Rect f22769w7;
    public int f22770w8;
    public float w9;
    public boolean f22771wa;
    public boolean f22772wb;
    public boolean f22773wc;
    public final m2.t f22774x;
    public int f22775x0;
    public boolean f22776x1;
    public CharSequence f22777x2;
    public org.telegram.ui.Components.e6 f22778x3;
    public ArrayList f22779x4;
    public String f22780x5;
    public int f22781x6;
    public boolean f22782x7;
    public int f22783x8;
    public StaticLayout f22784x9;
    public boolean f22785xa;
    public boolean xb;
    public zh0 f22786xc;
    public boolean f22787y;
    public int f22788y0;
    public long f22789y1;
    public int f22790y2;
    public StaticLayout y3;
    public CharacterStyle f22791y4;
    public TLRPC.Message f22792y5;
    public float f22793y6;
    public final ImageReceiver f22794y7;
    public org.telegram.ui.Components.t5 f22795y8;
    public int f22796y9;
    public org.telegram.ui.Components.k5 f22797ya;
    public float f22798yb;
    public boolean f22799yc;
    public int f22800z0;
    public boolean f22801z1;
    public int f22802z2;
    public long f22803z3;
    public final Path f22804z4;
    public boolean f22805z5;
    public long f22806z6;
    public final org.telegram.ui.Components.r8 f22807z7;
    public k80 f22808z8;
    public int f22809z9;
    public org.telegram.ui.Components.k5 f22810za;
    public float zb;
    public final b1 f22811zc;

    public q1(Context context, int i10) {
        this(context, i10, false, null, null);
    }

    public static StaticLayout F1(CharSequence charSequence, TextPaint textPaint, int i10, int i11, int i12, int i13) {
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
        return ov0.c(spannableStringBuilder, textPaint, i18, Layout.Alignment.ALIGN_NORMAL, org.telegram.messenger.i0.L(1.0f), TextUtils.TruncateAt.END, i18, i13, true);
    }

    public static String G3(jj jjVar, jj jjVar2, boolean z10, int i10) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        boolean z11 = jjVar.f16377u1;
        int i11 = jjVar.I1;
        int i12 = jjVar.V;
        if (!z11 && !jjVar.r4() && !jj.b4(jjVar.f16337k) && !jj.d5(jjVar.f16337k)) {
            if (!jjVar.f16357p1 || jjVar.f16337k.date != 2147483646) {
                if (i12 != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    long j10 = i12;
                    sb2.append(cd.T(j10));
                    sb2.append(", ");
                    sb2.append(cd.D0().o0().format(j10 * 1000));
                    return sb2.toString();
                } else if (jjVar.f16328h2) {
                    return cd.T(jjVar2.f16337k.date) + ", " + cd.D0().o0().format(jjVar2.f16337k.date * 1000);
                } else if (z10) {
                    if (((org.telegram.messenger.j0) vp.r1(i11).f18957y7.U.f11587b).f16204c) {
                        if (i10 == 0 && jjVar.Y2()) {
                            i10 = ConnectionsManager.getInstance(i11).getCurrentTime();
                        }
                        return cd.L(i10);
                    }
                    return cd.L0(2131751211, null) + " " + cd.D0().o0().format(jjVar2.f16337k.date * 1000);
                } else if (jjVar.f16343l2 && (messageFwdHeader = (message = jjVar.f16337k).fwd_from) != null && ((messageFwdHeader.date != 0 || messageFwdHeader.saved_date != 0) && !(jj.o1(message) instanceof TLRPC.TL_messageMediaWidget))) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = jjVar.f16337k.fwd_from;
                    int i13 = messageFwdHeader2.saved_date;
                    if (i13 == 0) {
                        i13 = messageFwdHeader2.date;
                    }
                    return cd.O(i13);
                } else {
                    return cd.D0().o0().format(jjVar2.f16337k.date * 1000);
                }
            }
            return "";
        }
        return "";
    }

    public static int H1(bj bjVar) {
        int i10 = 0;
        if (bjVar != null) {
            if ((bjVar.f14783l & 2) == 0) {
                i10 = org.telegram.messenger.i0.L(4.0f);
            }
            if ((bjVar.f14783l & 1) == 0) {
                return org.telegram.messenger.i0.L(4.0f) + i10;
            }
        }
        return i10;
    }

    public static SpannableStringBuilder H3(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            char charAt = spannableStringBuilder.charAt(i10);
            if (charAt == '\n' || charAt == '\r' || charAt == '\t' || charAt == 8232 || charAt == 8233) {
                spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) " ");
            }
        }
        return spannableStringBuilder;
    }

    public static int I1(StaticLayout staticLayout) {
        if (staticLayout.getLineCount() <= 0) {
            return 0;
        }
        return (int) Math.ceil(staticLayout.getLineWidth(0));
    }

    public static boolean J2(String str) {
        if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && !"telegram_bot".equals(str) && !"telegram_user".equals(str) && !"telegram_channel".equals(str) && !"telegram_channel_direct".equals(str) && !"telegram_megagroup".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_aicomposetone".equals(str)) {
            return false;
        }
        return true;
    }

    public static android.graphics.PointF N1(int r3, int r4, int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.N1(int, int, int, int):android.graphics.PointF");
    }

    public static boolean Q2() {
        return sc.e(2);
    }

    public static StaticLayout R2(CharSequence charSequence, TextPaint textPaint, int i10) {
        SpannableStringBuilder H3 = H3(charSequence);
        if (H3 != null && i10 > 0) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            CharSequence ellipsize = TextUtils.ellipsize(H3, textPaint, i10, truncateAt);
            int L = org.telegram.messenger.i0.L(2.0f) + Math.max(1, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())));
            return ov0.c(ellipsize, textPaint, L, Layout.Alignment.ALIGN_NORMAL, 0.0f, truncateAt, L, 1, true);
        }
        return null;
    }

    public static int[] U1(Spannable spannable, CharacterStyle characterStyle) {
        int i10;
        int i11;
        boolean z10;
        yz0 yz0Var;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof c51) && (yz0Var = ((c51) characterStyle).f24988a) != null && (messageEntity = yz0Var.d) != null) {
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

    public static void W0(Canvas canvas, StaticLayout staticLayout, float f7, float f10) {
        canvas.save();
        canvas.translate(f7 - staticLayout.getLineLeft(0), ((org.telegram.messenger.i0.L(16.0f) - staticLayout.getHeight()) / 2.0f) + f10);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    private long getAuthorBotVerificationId() {
        jj jjVar;
        TLRPC.User user = this.ha;
        if (user != null) {
            return org.telegram.messenger.o5.c(user);
        }
        if (this.ia != null && (jjVar = this.O5) != null && jj.B0(jjVar.f16337k) != 1271266957 && this.ia.signature_profiles) {
            long o10 = org.telegram.messenger.o5.o(this.O5.f16337k.from_id);
            int i10 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
            int i11 = this.Y5;
            if (i10 >= 0) {
                TLRPC.User Z1 = vp.r1(i11).Z1(Long.valueOf(o10));
                if (Z1 != null) {
                    return org.telegram.messenger.o5.c(Z1);
                }
            } else {
                TLRPC.Chat L0 = vp.r1(i11).L0(Long.valueOf(-o10));
                if (L0 != null) {
                    return org.telegram.messenger.o5.c(L0);
                }
            }
        }
        return 0L;
    }

    private String getAuthorName() {
        TLRPC.User user = this.ha;
        if (user != null) {
            return h20.p(user);
        }
        if (this.ia != null) {
            jj jjVar = this.O5;
            if (jjVar != null && jj.B0(jjVar.f16337k) != 1271266957 && this.ia.signature_profiles) {
                long o10 = org.telegram.messenger.o5.o(this.O5.f16337k.from_id);
                int i10 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
                int i11 = this.Y5;
                if (i10 >= 0) {
                    TLRPC.User Z1 = vp.r1(i11).Z1(Long.valueOf(o10));
                    if (Z1 != null) {
                        return h20.p(Z1);
                    }
                } else {
                    TLRPC.Chat L0 = vp.r1(i11).L0(Long.valueOf(-o10));
                    if (L0 != null) {
                        return L0.title;
                    }
                }
            }
            return this.ia.title;
        }
        jj jjVar2 = this.O5;
        if (jjVar2 != null && jjVar2.r4()) {
            return this.O5.Q0;
        }
        return "DELETED";
    }

    private Object getAuthorStatus() {
        jj jjVar;
        TLRPC.User user = this.ha;
        if (user != null) {
            Long h = h20.h(user);
            if (h != null) {
                TLRPC.EmojiStatus emojiStatus = this.ha.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f22659na = ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug;
                }
                return h;
            } else if (this.ha.premium) {
                return org.telegram.messenger.w0.f19025b.getDrawable(2131232306).mutate();
            } else {
                return null;
            }
        } else if (this.ia != null && (jjVar = this.O5) != null && jj.B0(jjVar.f16337k) != 1271266957 && this.ia.signature_profiles) {
            long o10 = org.telegram.messenger.o5.o(this.O5.f16337k.from_id);
            if (o10 >= 0) {
                TLRPC.User Z1 = vp.r1(this.Y5).Z1(Long.valueOf(o10));
                if (Z1 != null) {
                    TLRPC.EmojiStatus emojiStatus2 = Z1.emoji_status;
                    if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                        this.f22659na = ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).slug;
                    }
                }
                return h20.h(Z1);
            }
            TLRPC.Chat L0 = vp.r1(this.Y5).L0(Long.valueOf(-o10));
            if (L0 != null) {
                TLRPC.EmojiStatus emojiStatus3 = L0.emoji_status;
                if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f22659na = ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug;
                }
                return Long.valueOf(org.telegram.messenger.o5.f(emojiStatus3));
            }
            return null;
        } else {
            return null;
        }
    }

    private int getCommentButtonHeight() {
        float f7;
        if (r2()) {
            return org.telegram.messenger.i0.L(24.0f);
        }
        if (B3()) {
            f7 = 41.3f;
        } else {
            f7 = 43.0f;
        }
        return org.telegram.messenger.i0.L(f7);
    }

    private int getCompactHeaderColor() {
        return i0.b.k(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Sa, this.Ob), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ua, this.Ob));
    }

    private int getCompactInShift() {
        if (r2()) {
            return (org.telegram.messenger.i0.L(16.0f) - org.telegram.messenger.i0.L(20.0f)) - getExtraTextX();
        }
        return 0;
    }

    private int getCompactSideButtonColumn() {
        jj jjVar;
        if (this.f22772wb && this.D8 != 0 && (jjVar = this.O5) != null && jjVar.T4()) {
            return org.telegram.messenger.i0.L(40.0f);
        }
        return 0;
    }

    private float getCompactSideMenuShift() {
        if (r2()) {
            return org.telegram.messenger.i0.L(71.0f) * this.X6;
        }
        return 0.0f;
    }

    private int getCompactSideMenuWidth() {
        if (this.W6) {
            return org.telegram.messenger.i0.L(71.0f);
        }
        return 0;
    }

    private zg.a getDraftMessageMeasureController() {
        l1 l1Var = this.Qa;
        if (l1Var != null) {
            return l1Var.Y();
        }
        return null;
    }

    private ColorMatrixColorFilter getFancyBlurFilter() {
        if (this.V0 == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            org.telegram.messenger.i0.n2(colorMatrix, 0.9f);
            org.telegram.messenger.i0.i(colorMatrix, 0.6f);
            this.V0 = new ColorMatrixColorFilter(colorMatrix);
        }
        return this.V0;
    }

    private int getGroupPhotosWidth() {
        int parentWidth = getParentWidth();
        jj jjVar = this.O5;
        if (jjVar != null && jjVar.f16365r1) {
            parentWidth = this.K0;
        }
        if (!org.telegram.messenger.i0.E && org.telegram.messenger.i0.Q1()) {
            if (!org.telegram.messenger.i0.P1() || getResources().getConfiguration().orientation == 2) {
                return parentWidth - org.telegram.messenger.i0.l1(parentWidth, 0, 0);
            }
            return parentWidth;
        }
        return parentWidth;
    }

    private float getNameAvatarOffset() {
        float f7;
        if (t2()) {
            f7 = 21.0f;
        } else {
            f7 = 32.33f;
        }
        return org.telegram.messenger.i0.L(f7);
    }

    private int getNameHeight() {
        if (this.f22608j9 && !t2()) {
            if (this.Y8 == null) {
                return org.telegram.messenger.i0.L(31.0f);
            }
            return org.telegram.messenger.i0.L(37.66f);
        }
        return (int) (org.telegram.ui.ActionBar.t6.W2.getTextSize() + org.telegram.messenger.i0.L(5.0f));
    }

    private float getNameHeightAnimated() {
        float f7;
        float f10;
        x1 x1Var = this.gb;
        float f11 = 0.0f;
        if (x1Var.Q2) {
            boolean z10 = this.f22608j9;
            f7 = org.telegram.messenger.i0.V1(!z10, z10, x1Var.L1);
        } else if (this.f22608j9) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float textSize = org.telegram.ui.ActionBar.t6.W2.getTextSize() + org.telegram.messenger.i0.L(5.0f);
        if (this.Y8 == null) {
            f10 = 31.0f;
        } else {
            f10 = 35.0f;
        }
        float L = org.telegram.messenger.i0.L(f10);
        if (!t2()) {
            f11 = f7;
        }
        return org.telegram.messenger.i0.T1(textSize, L, f11);
    }

    private ArrayList<TLRPC.Peer> getRecentRepliers() {
        TLRPC.MessageReplies messageReplies;
        ej ejVar = this.K;
        if (ejVar != null && !ejVar.d.isEmpty() && (messageReplies = ((jj) this.K.d.get(0)).f16337k.replies) != null) {
            return messageReplies.recent_repliers;
        }
        TLRPC.MessageReplies messageReplies2 = this.O5.f16337k.replies;
        if (messageReplies2 != null) {
            return messageReplies2.recent_repliers;
        }
        return null;
    }

    private int getSelectionOverlayColor() {
        int i10;
        org.telegram.ui.ActionBar.p6 p6Var = this.Ob;
        if (p6Var == null) {
            return 0;
        }
        jj jjVar = this.O5;
        if (jjVar != null && jjVar.N3()) {
            i10 = org.telegram.ui.ActionBar.t6.Mc;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21208sa;
        }
        return p6Var.h(i10);
    }

    private float getUseTranscribeButtonProgress() {
        x1 x1Var = this.gb;
        if (x1Var.f23520o1) {
            if (this.G4) {
                return x1Var.L1;
            }
            return 1.0f - x1Var.L1;
        } else if (this.G4) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public static boolean m2(float f7, float f10, float f11, float f12) {
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

    public static void o0(ImageReceiver imageReceiver) {
        Bitmap n10;
        if (imageReceiver != null && (n10 = imageReceiver.n()) != null) {
            n10.recycle();
            imageReceiver.w0(null);
        }
    }

    public static n1 v0(int i10, String str, int i11, float f7) {
        n1 n1Var = new n1();
        n1Var.f22331a = i10;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, org.telegram.ui.ActionBar.t6.M2, i11, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.t6.M2, org.telegram.messenger.i0.L(2.0f) + i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        n1Var.d = staticLayout;
        n1Var.f22332b = f7;
        if (staticLayout.getLineCount() > 0) {
            n1Var.f22333c = ((float) (n1Var.f22332b - Math.ceil(n1Var.d.getLineWidth(0)))) / 2.0f;
            n1Var.f22333c -= (int) n1Var.d.getLineLeft(0);
        }
        return n1Var;
    }

    public static boolean z2(m1 m1Var, float f7, float f10) {
        RectF rectF = m1Var.d;
        if (f7 >= rectF.left - org.telegram.messenger.i0.L(6.0f) && f7 <= rectF.right + org.telegram.messenger.i0.L(6.0f) && f10 >= rectF.top - org.telegram.messenger.i0.L(4.0f) && f10 <= rectF.bottom + org.telegram.messenger.i0.L(4.0f)) {
            return true;
        }
        return false;
    }

    public final void A(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.p6 p6Var = this.Ob;
        if (p6Var != null) {
            p6Var.b(f7, f10 + this.V + this.f22552f0 + this.f22575h0, i10, i11);
        } else {
            org.telegram.ui.ActionBar.t6.r(f7, f10 + this.V + this.f22552f0 + this.f22575h0, i10, i11);
        }
    }

    public final void A0(int i10, int i11, boolean z10) {
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
        if (this.gb.f23491i && !z15) {
            return;
        }
        this.f22696qb = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f22722sb = ofFloat;
        if (z15) {
            ofFloat.setDuration(220L);
        } else {
            ofFloat.setDuration(150L);
        }
        this.f22722sb.setInterpolator(gr.f26495f);
        this.f22684pb = i10;
        this.f22673ob = i11;
        this.f22722sb.addUpdateListener(new jg.o0(1, this, z10));
        this.f22722sb.addListener(new eg.m(7, this, z10));
        this.f22709rb = true;
        this.f22722sb.start();
    }

    public final a1 A1() {
        if (this.I4 == null) {
            this.I4 = new a1(this);
        }
        return this.I4;
    }

    public final boolean A2() {
        if (this.P5 != null) {
            return this.U5;
        }
        return this.H;
    }

    public final boolean A3() {
        if (!t2()) {
            if ((this.K == null || (this.L.f14783l & 4) != 0) && !this.P1) {
                jj jjVar = this.O5;
                if (jjVar != null) {
                    if (!jjVar.f16328h2 && !jjVar.r4()) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B(int i10, int i11, int i12) {
        int l1;
        boolean z10;
        int i13;
        int i14;
        vv vvVar;
        boolean z11;
        if (this.O5.r4()) {
            this.Z6 = org.telegram.messenger.i0.L(31.0f) + i12;
        } else if (Y3()) {
            this.Z6 = org.telegram.messenger.i0.L(31.0f) + i12;
        } else {
            sg.p0 p0Var = this.N;
            if (!p0Var.f48450p) {
                l1 = p0Var.f48452r;
            } else {
                l1 = this.O5.l1();
            }
            int i15 = 0;
            if (!p0Var.f48450p) {
                if (i10 - l1 >= i11 && !this.O5.f16378u2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (this.S1) {
                    this.f22737u0 = org.telegram.messenger.i0.L(14.0f) + this.f22737u0;
                }
            } else if ((this.f22725t1 || ((!this.P1 || this.O5.r4()) && !d2() && !this.Q1 && !this.R1 && !this.S1)) && i10 - l1 >= i11 && !this.O5.f16378u2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.O5.G4()) {
                z10 = true;
            }
            if (p0Var.f48450p && (vvVar = this.O5.f16385w2) != null) {
                ArrayList arrayList = vvVar.h;
                ArrayList arrayList2 = vvVar.f18990g;
                if (!arrayList2.isEmpty() && !vvVar.d && !vvVar.I()) {
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        while (i15 < size) {
                            Object obj = arrayList.get(i15);
                            i15++;
                            if (((mu) obj).f17002b >= arrayList2.size() - 1) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    z11 = ((qu) i0.a.g(1, arrayList2)).v();
                } else {
                    z11 = true;
                    break;
                }
                if (z11) {
                    z10 = true;
                }
            }
            jj jjVar = this.O5;
            if ((jjVar.D2 && p0Var.f48450p) || ((jjVar.H2 && p0Var.f48450p) || jjVar.v3())) {
                i13 = 18;
                z10 = true;
            } else {
                i13 = 14;
            }
            if (z10) {
                this.f22737u0 = org.telegram.messenger.i0.L(i13) + this.f22737u0;
                this.f22491a7 = true;
                int L = org.telegram.messenger.i0.L(31.0f) + Math.max(i12, l1);
                this.Z6 = L;
                if (this.O5.P3()) {
                    i14 = org.telegram.messenger.i0.L(17.0f) + this.f22796y9;
                } else {
                    i14 = this.f22796y9;
                }
                this.Z6 = org.telegram.messenger.m5.b(31.0f, i14, L);
            } else {
                int extraTextX = (i12 - getExtraTextX()) - l1;
                if (extraTextX >= 0 && extraTextX <= i11) {
                    this.Z6 = org.telegram.messenger.i0.L(31.0f) + ((i12 + i11) - extraTextX);
                } else {
                    this.Z6 = org.telegram.messenger.i0.L(31.0f) + Math.max(i12, l1 + i11);
                }
            }
            if (r2()) {
                this.Z6 = org.telegram.messenger.i0.L(31.0f) + i10;
            }
        }
    }

    public final void B0() {
        jj jjVar;
        l1 l1Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.O5.t2() && !this.O5.m5()) {
            jj jjVar2 = this.O5;
            if (!jjVar2.M0) {
                if (this.Qa != null && jjVar2.p4()) {
                    this.Qa.A(this);
                    return;
                } else {
                    E3(this.f22565g1, this.f22576h1);
                    return;
                }
            }
        }
        jj jjVar3 = this.O5;
        int i10 = jjVar3.D;
        int i11 = 0;
        if (i10 == 20) {
            TLRPC.Message message = jjVar3.f16337k;
            if (message != null && (messageMedia = message.media) != null && !messageMedia.extended_media.isEmpty()) {
                TLRPC.ReplyMarkup replyMarkup = this.O5.f16337k.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList.get(i11);
                        i11++;
                        Iterator<TL_keyboard.KeyboardInlineButton> it = keyboardInlineButtonRow.buttons.iterator();
                        if (it.hasNext()) {
                            this.Qa.K0(this, it.next());
                            return;
                        }
                    }
                }
            }
        } else if (i10 != 1 && !jjVar3.M2()) {
            jj jjVar4 = this.O5;
            int i12 = jjVar4.D;
            if (i12 == 12) {
                long j10 = jj.o1(jjVar4.f16337k).user_id;
                if (j10 != 0) {
                    user = vp.r1(this.Y5).Z1(Long.valueOf(j10));
                } else {
                    user = null;
                }
                this.Qa.r0(this, user, this.f22565g1, this.f22576h1);
            } else if (i12 == 5) {
                if (this.M3 != -1) {
                    C0(false);
                } else if (MediaController.B().I(this.O5) && !MediaController.B().H()) {
                    MediaController.B().R(this.O5, true);
                } else {
                    this.Qa.A1(this, this.O5);
                }
            } else if (i12 == 8) {
                int i13 = this.M3;
                if (i13 != -1 && (i13 != 1 || !this.A1 || !this.F5)) {
                    if (i13 == 2 || i13 == 0) {
                        C0(false);
                        return;
                    }
                    return;
                }
                this.Qa.s0(this, this.f22565g1, this.f22576h1, false);
            } else if (this.K1 != 4 && !jjVar4.D2(true)) {
                jj jjVar5 = this.O5;
                int i14 = jjVar5.D;
                if (i14 != 4 && i14 != 17 && i14 != 23 && i14 != 24) {
                    int i15 = this.K1;
                    if (i15 == 1) {
                        if (this.M3 == -1) {
                            this.Qa.s0(this, this.f22565g1, this.f22576h1, false);
                            return;
                        }
                        return;
                    } else if (jjVar5.Y0 != null) {
                        l1 l1Var2 = this.Qa;
                        if (l1Var2 != null) {
                            l1Var2.s0(this, this.f22565g1, this.f22576h1, false);
                            return;
                        }
                        return;
                    } else if (i15 == 2) {
                        if (this.M3 == -1 && (webPage = jj.o1(jjVar5.f16337k).webpage) != null) {
                            String str = webPage.embed_url;
                            if (str != null && str.length() != 0) {
                                this.Qa.z1(this.O5, webPage.embed_url, webPage.site_name, webPage.description, webPage.url, webPage.embed_width, webPage.embed_height);
                                return;
                            } else {
                                gf.f.r(getContext(), webPage.url);
                                return;
                            }
                        }
                        return;
                    } else if (this.S1) {
                        if (this.M3 == -1) {
                            this.Qa.s0(this, this.f22565g1, this.f22576h1, false);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 26 && (l1Var = this.Qa) != null) {
                        if (i14 == 16) {
                            l1Var.o0(this, 0.0f, 0.0f);
                            return;
                        } else {
                            l1Var.A0(this, this.Q3, this.R3);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.Qa.s0(this, this.f22565g1, this.f22576h1, false);
            } else if (this.M3 != -1 && (!this.f22776x1 || (!this.F5 && (((jjVar = this.O5) == null || !jjVar.D2(true)) && (!tz.B0 || !this.A1))))) {
                if (this.f22776x1) {
                    C0(true);
                    return;
                }
                int i16 = this.M3;
                if (i16 == 0 || i16 == 3) {
                    C0(false);
                }
            } else {
                this.Qa.s0(this, this.f22565g1, this.f22576h1, false);
            }
        } else {
            int i17 = this.M3;
            if (i17 == -1) {
                this.Qa.s0(this, this.f22565g1, this.f22576h1, false);
            } else if (i17 == 0) {
                C0(false);
            }
        }
    }

    public final t1 B1() {
        if (this.X0 == null) {
            this.X0 = new t1(this);
        }
        return this.X0;
    }

    public final boolean B2() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message;
        jj jjVar = this.O5;
        if (!jjVar.f16336j2) {
            if (jj.B0(jjVar.f16337k) != 489000 || (message = this.O5.f16337k) == null || message.fwd_from == null) {
                if (!this.O5.r4() && !this.O5.v3()) {
                    if (!this.f22546e6 || this.f22730t6) {
                        TLRPC.Message message2 = this.O5.f16337k;
                        if (message2 == null || (messageFwdHeader = message2.fwd_from) == null || (peer = messageFwdHeader.from_id) == null || message2.via_bot_id == 0 || org.telegram.messenger.o5.o(peer) != org.telegram.messenger.o5.o(this.O5.f16337k.peer_id)) {
                            if (!this.f22730t6 || this.O5.D != 0) {
                                if (!this.E && this.f22584h9 && this.f22532d6) {
                                    if (this.O5.P3()) {
                                        if ((this.O5.A4() && this.O5.o3()) || this.O5.f16328h2) {
                                            return true;
                                        }
                                    } else {
                                        return true;
                                    }
                                }
                                if (!this.O5.y3() || this.O5.f16337k.fwd_from.from_id != null) {
                                    return false;
                                }
                                return true;
                            }
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean B3() {
        jj jjVar;
        jj jjVar2;
        int i10 = this.f22735tb;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
        } else if (!r2()) {
            if (!Y3() && ((!this.A6 || ((this.f22615k3 != null && !this.f22738u1) || (!this.N.f48450p && ((jjVar2 = this.O5) == null || (!jjVar2.M2() && !this.O5.h4()))))) && ((jjVar = this.O5) == null || jjVar.D != 29))) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public final void C(boolean z10) {
        boolean z11;
        int i10 = this.K1;
        if (i10 != 3 && i10 != 5) {
            z11 = false;
        } else {
            z11 = true;
        }
        K3(true, z11, false);
    }

    public final void C0(boolean z10) {
        float f7;
        jj jjVar;
        jj jjVar2;
        TLRPC.PhotoSize photoSize;
        String str;
        int i10;
        RadialProgress2 radialProgress2;
        int i11;
        jj jjVar3;
        if (this.Qa != null && this.O5.p4() && this.O5.t2() && !this.O5.m5() && !this.O5.M0) {
            this.Qa.A(this);
            return;
        }
        jj jjVar4 = this.O5;
        if (jjVar4 != null && !jjVar4.M2()) {
            this.O5.P = true;
        }
        int i12 = this.M3;
        RadialProgress2 radialProgress22 = this.Q0;
        int i13 = this.Y5;
        ag.c2 c2Var = this.T0;
        RadialProgress2 radialProgress23 = this.P0;
        if (i12 == 0 && (!this.f22776x1 || z10)) {
            int i14 = this.K1;
            if (i14 != 3 && i14 != 5 && (i14 != 7 || (jjVar3 = this.O5) == null || !jjVar3.T4() || !this.O5.f16387x0)) {
                if (z10) {
                    radialProgress22.p(false, 0.0f);
                } else {
                    radialProgress23.p(false, 0.0f);
                }
                if (this.f22516c4 != null && (c2Var.L() || this.f22530d4 == null)) {
                    photoSize = this.f22516c4;
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !"s".equals(photoSize.type)) {
                        str = this.f22556f4;
                    } else {
                        str = this.f22568g4;
                    }
                } else {
                    photoSize = this.f22530d4;
                    str = this.f22568g4;
                }
                if (jj.Q5(this.O5.f16337k)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                jj jjVar5 = this.O5;
                int i15 = jjVar5.D;
                if (i15 == 1 || i15 == 20) {
                    int i16 = i10;
                    radialProgress2 = radialProgress23;
                    c2Var.f14402r = true;
                    c2Var.r0(ic.f(this.f22516c4, this.f22502b4), this.f22556f4, ic.f(this.f22530d4, this.f22502b4), this.f22568g4, this.f22544e4, this.f22516c4.size, null, this.O5, i16);
                } else if (i15 == 8) {
                    org.telegram.messenger.b8.G(i13).X(this.L1, this.O5, 2, 0);
                    if (this.O5.F0 > 0) {
                        y0(this.L1);
                    }
                    radialProgress2 = radialProgress23;
                } else if (this.f22772wb) {
                    if (jjVar5.l4()) {
                        org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(i13);
                        TLRPC.Document F0 = this.O5.F0();
                        jj jjVar6 = this.O5;
                        if (jj.Q5(jjVar6.f16337k)) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        G.X(F0, jjVar6, 2, i11);
                        radialProgress2 = radialProgress23;
                    } else {
                        jj jjVar7 = this.O5;
                        jjVar7.f16317f0 = 2.0f;
                        TLRPC.Document F02 = jjVar7.F0();
                        c2Var.f14402r = true;
                        String str2 = str;
                        radialProgress2 = radialProgress23;
                        c2Var.r0(ic.b(F02), null, ic.f(photoSize, F02), str2, null, F02.size, null, this.O5, 0);
                    }
                    this.f22610jb = true;
                    invalidate();
                } else {
                    radialProgress2 = radialProgress23;
                    if (i15 == 9) {
                        org.telegram.messenger.b8.G(i13).X(this.L1, this.O5, 2, 0);
                        if (this.O5.F0 > 0) {
                            y0(this.L1);
                        }
                    } else {
                        int i17 = this.K1;
                        if (i17 == 4) {
                            org.telegram.messenger.b8.G(i13).X(this.L1, this.O5, 1, i10);
                            jj jjVar8 = this.O5;
                            if (jjVar8.F0 > 0) {
                                y0(jjVar8.F0());
                            }
                        } else if (i15 == 0 && i17 != 0) {
                            if (i17 == 2) {
                                c2Var.f14402r = true;
                                c2Var.r0(ic.b(this.L1), null, ic.c(this.f22516c4, this.L1), this.f22568g4, null, this.L1.size, null, this.O5, i10);
                                jj jjVar9 = this.O5;
                                jjVar9.f16317f0 = 2.0f;
                                if (jjVar9.F0 > 0) {
                                    y0(jjVar9.F0());
                                }
                            } else if (i17 == 1) {
                                org.telegram.messenger.b8.G(i13).X(this.L1, this.O5, 2, 0);
                            } else if (i17 == 8) {
                                c2Var.r0(ic.b(this.L1), this.f22556f4, ic.c(this.f22516c4, this.L1), "b1", null, 0L, "jpg", this.O5, 1);
                            }
                        } else {
                            c2Var.f14402r = true;
                            c2Var.r0(ic.f(this.f22516c4, this.f22502b4), this.f22556f4, ic.f(this.f22530d4, this.f22502b4), this.f22568g4, this.f22544e4, 0L, null, this.O5, 0);
                        }
                    }
                }
                this.O5.f16335j1 = false;
                this.M3 = 1;
                if (z10) {
                    radialProgress22.setIcon(14, false, true);
                } else {
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
                return;
            }
            if (this.V3 == 0) {
                org.telegram.messenger.b8.G(i13).X(this.L1, this.O5, 2, 0);
                this.O5.f16335j1 = false;
            }
            if (this.Qa.A1(this, this.O5)) {
                if (this.U3 == 2 && this.V3 != 1) {
                    this.V3 = 1;
                    radialProgress23.p(false, 0.0f);
                    radialProgress23.k(getMiniIconForCurrentState(), false, true);
                }
                O3();
                this.M3 = 1;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i12 == 1 && (!this.f22776x1 || z10)) {
            c2Var.f14402r = false;
            int i18 = this.K1;
            if (i18 != 3 && i18 != 5 && (i18 != 7 || (jjVar2 = this.O5) == null || !jjVar2.T4())) {
                if (this.O5.N3() && !this.f22776x1 && (this.O5.o4() || this.O5.Y2())) {
                    if (radialProgress23.f24128i.f26933q != 6) {
                        this.Qa.M(this);
                        return;
                    }
                    return;
                }
                jj jjVar10 = this.O5;
                jjVar10.f16335j1 = true;
                int i19 = this.K1;
                if (i19 != 2 && i19 != 4 && i19 != 1 && i19 != 8) {
                    int i20 = jjVar10.D;
                    if (i20 != 0 && i20 != 1 && i20 != 20 && i20 != 8 && i20 != 5) {
                        if (i20 == 9) {
                            org.telegram.messenger.b8.G(i13).f(this.O5.F0());
                        }
                    } else {
                        hc D = hc.D();
                        String str3 = c2Var.Q;
                        if (str3 != null) {
                            D.f15868s.c(new ib(D, str3, 2));
                        }
                        c2Var.c();
                    }
                } else {
                    org.telegram.messenger.b8.G(i13).f(this.L1);
                }
                this.M3 = 0;
                if (z10) {
                    radialProgress22.setIcon(2, false, true);
                } else {
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
            } else if (MediaController.B().R(this.O5, true)) {
                this.M3 = 0;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i12 == 2) {
            jj jjVar11 = this.O5;
            if (jjVar11 != null && jjVar11.D == 23) {
                this.Qa.s0(this, 0.0f, 0.0f, false);
            } else if (this.K1 == 7 && jjVar11 != null && jjVar11.T4()) {
                if (this.V3 == 0) {
                    org.telegram.messenger.b8.G(i13).X(this.L1, this.O5, 2, 0);
                    this.O5.f16335j1 = false;
                }
                if (this.Qa.A1(this, this.O5)) {
                    if (this.U3 == 2 && this.V3 != 1) {
                        this.V3 = 1;
                        radialProgress23.p(false, 0.0f);
                        radialProgress23.k(getMiniIconForCurrentState(), false, true);
                    }
                    O3();
                    this.M3 = 1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                if (this.f22772wb) {
                    this.f22610jb = true;
                    invalidate();
                }
            } else {
                int i21 = this.K1;
                if (i21 != 3 && i21 != 5) {
                    if (this.f22772wb) {
                        jj jjVar12 = MediaController.B().f14482u0;
                        if (jjVar12 == null || !jjVar12.h4()) {
                            c2Var.f14408t0 = true;
                            c2Var.P0(false);
                        }
                    } else {
                        c2Var.f14408t0 = true;
                        c2Var.P0(false);
                    }
                    this.O5.f16317f0 = 0.0f;
                    this.M3 = -1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    return;
                }
                radialProgress23.p(false, 0.0f);
                org.telegram.messenger.b8.G(i13).X(this.L1, this.O5, 2, 0);
                this.O5.f16335j1 = false;
                this.M3 = 4;
                radialProgress23.setIcon(getIconForCurrentState(), true, true);
                invalidate();
            }
        } else if (i12 != 3 && i12 != 0) {
            if (i12 == 4) {
                int i22 = this.K1;
                if (i22 == 3 || i22 == 5 || (i22 == 7 && (jjVar = this.O5) != null && jjVar.T4())) {
                    if ((this.O5.N3() && (this.O5.o4() || this.O5.Y2())) || this.O5.n4()) {
                        l1 l1Var = this.Qa;
                        if (l1Var != null && radialProgress23.f24128i.f26933q != 6) {
                            l1Var.M(this);
                            return;
                        }
                        return;
                    }
                    this.O5.f16335j1 = true;
                    org.telegram.messenger.b8.G(i13).f(this.L1);
                    this.M3 = 2;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            }
        } else {
            if (this.U3 == 2 && this.V3 != 1) {
                this.V3 = 1;
                f7 = 0.0f;
                radialProgress23.p(false, 0.0f);
                radialProgress23.k(getMiniIconForCurrentState(), false, true);
            } else {
                f7 = 0.0f;
            }
            l1 l1Var2 = this.Qa;
            if (l1Var2 != null) {
                l1Var2.s0(this, f7, f7, false);
            }
        }
    }

    public final boolean C1(o1 o1Var, k80 k80Var, Layout layout, int i10) {
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
                } else if (characterStyleArr[i11] == this.f22791y4) {
                    o1Var.f22377b = i10;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (o1Var.f22377b != i10) {
            return false;
        }
        k80Var.rewind();
        int spanStart = spanned.getSpanStart(this.f22791y4);
        int spanEnd = spanned.getSpanEnd(this.f22791y4);
        k80Var.f27471c = true;
        k80Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, k80Var);
        k80Var.a();
        this.f22766w4.l();
        return true;
    }

    public final boolean C2(jj jjVar) {
        TLRPC.MessageFwdHeader messageFwdHeader = jjVar.f16337k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
            l1 l1Var = this.Qa;
            if (l1Var == null || l1Var.S()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C3(int i10, boolean z10, boolean z11) {
        float f7;
        float f10 = 0.0f;
        if (i10 == -1 || i10 == 0) {
            if (this.p5 != z10) {
                this.p5 = z10;
                if (!z11) {
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    this.f22691q5 = f7;
                } else {
                    invalidate();
                }
            } else {
                return;
            }
        }
        if ((i10 != -1 && i10 != 1) || this.D5 == z10) {
            return;
        }
        this.D5 = z10;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.E5 = f10;
            return;
        }
        setInvalidatesParent(true);
        invalidate();
    }

    public final void D() {
        StaticLayout staticLayout;
        if (this.O5.D == 20 && (staticLayout = this.V9) != null) {
            ag.c2 c2Var = this.T0;
            this.T9 = c3.i0.B(c2Var.M0, staticLayout.getWidth(), 2.0f, this.L6);
            this.U9 = c3.i0.B(c2Var.N0, this.V9.getHeight(), 2.0f, this.N6 + c2Var.L0);
        }
    }

    public final void D0() {
        int i10;
        int i11;
        int i12 = this.V3;
        int i13 = this.Y5;
        RadialProgress2 radialProgress2 = this.P0;
        if (i12 == 0) {
            this.V3 = 1;
            radialProgress2.p(false, 0.0f);
            jj jjVar = this.O5;
            if (jjVar != null && !jjVar.M2()) {
                this.O5.P = true;
            }
            int i14 = this.K1;
            if (i14 != 3 && i14 != 5) {
                if (i14 == 4 || i14 == 7) {
                    y0(this.L1);
                    org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(i13);
                    TLRPC.Document document = this.L1;
                    jj jjVar2 = this.O5;
                    if (jj.Q5(jjVar2.f16337k)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    G.X(document, jjVar2, 2, i11);
                    this.O5.f16335j1 = false;
                }
            } else {
                org.telegram.messenger.b8 G2 = org.telegram.messenger.b8.G(i13);
                TLRPC.Document document2 = this.L1;
                jj jjVar3 = this.O5;
                if (jj.Q5(jjVar3.f16337k)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                G2.X(document2, jjVar3, 2, i10);
                this.O5.f16335j1 = false;
            }
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        } else if (i12 == 1) {
            int i15 = this.K1;
            if ((i15 == 3 || i15 == 5 || i15 == 7) && MediaController.B().I(this.O5)) {
                MediaController.B().q(true, true, false, false);
            }
            this.V3 = 0;
            this.O5.f16335j1 = true;
            org.telegram.messenger.b8.G(i13).f(this.L1);
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final boolean D1(o1 o1Var, k80 k80Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (C1(o1Var, k80Var, ((gj) arrayList.get(i10)).e, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean D2(org.telegram.messenger.jj r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.D2(org.telegram.messenger.jj):boolean");
    }

    public final void D3() {
        ag.c2 c2Var = this.T0;
        E3((c2Var.M0 / 2.0f) + c2Var.K0, (c2Var.N0 / 2.0f) + c2Var.L0);
    }

    public final void E0() {
        jj jjVar = this.O5;
        if (jjVar != null) {
            jjVar.J0 = !jjVar.J0;
            l1 l1Var = this.Qa;
            if (l1Var != null) {
                l1Var.n1(this, true);
            }
        }
    }

    public final void E1() {
        jj jjVar = this.P5;
        if (jjVar == null) {
            jjVar = this.O5;
        }
        jj jjVar2 = jjVar;
        this.O5 = null;
        s3(jjVar2, this.K, this.F, this.E, this.G, false);
    }

    public final boolean E2() {
        if (this.P5 != null) {
            return this.S5;
        }
        return this.F;
    }

    public final void E3(float f7, float f10) {
        q1 q1Var;
        ag.c2 c2Var = this.T0;
        this.N9 = (float) Math.sqrt(Math.pow(c2Var.N0, 2.0d) + Math.pow(c2Var.M0, 2.0d));
        jj jjVar = this.O5;
        if (!jjVar.M0 && this.K9 == 0.0f) {
            if (jjVar.D == 3) {
                jjVar.K1 = true;
                jjVar.O0 = true;
                q1Var = this;
                q1Var.r3(jjVar, this.K, this.F, this.E, this.G, this.H);
                jj jjVar2 = q1Var.O5;
                jjVar2.O0 = false;
                jjVar2.K1 = false;
                if (q1Var.K != null) {
                    q1Var.P0.p(false, 0.0f);
                }
            } else {
                q1Var = this;
            }
            q1Var.L9 = f7;
            q1Var.M9 = f10;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w7.u.a(q1Var.N9 * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(gr.f26498j);
            duration.addUpdateListener(new r(this, 2));
            duration.addListener(new k1(this, 0));
            duration.start();
        }
    }

    public final int F() {
        if (this.f22738u1) {
            return 4;
        }
        return 8;
    }

    public final void F0(Canvas canvas, float f7) {
        ArrayList arrayList;
        float f10;
        float f11;
        if (this.f22615k3 == null) {
            return;
        }
        float f12 = this.f22701r3;
        float f13 = this.f22689q3;
        x1 x1Var = this.gb;
        if (x1Var.f23554x0) {
            if (x1Var.D0) {
                f12 -= getTranslationY();
                f11 = x1Var.f23487h0;
            } else if (x1Var.f23539t0) {
                float f14 = x1Var.L1;
                float f15 = 1.0f - f14;
                f13 = (f13 * f14) + (x1Var.f23531r0 * f15);
                f12 = (f12 * f14) + (f15 * x1Var.f23535s0);
            } else if (!jj.R4(this.O5.f16337k) || !TextUtils.isEmpty(this.O5.f16394z)) {
                f11 = x1Var.f23487h0;
            }
            f13 += f11;
        }
        float f16 = f13;
        float f17 = f12;
        float f18 = 0.0f;
        ArrayList arrayList2 = null;
        if (x1Var.f23461b1) {
            float f19 = x1Var.L1;
            if (f19 != 1.0f) {
                hj hjVar = x1Var.f23466c1;
                if (hjVar != null) {
                    arrayList = hjVar.e;
                } else {
                    arrayList = null;
                }
                org.telegram.ui.Components.k5 k5Var = x1Var.P0;
                float f20 = (1.0f - f19) * f7;
                if (hjVar != null) {
                    f10 = hjVar.d;
                } else {
                    f10 = 0.0f;
                }
                G0(f16, f17, canvas, arrayList, k5Var, false, f20, f10, true);
                hj hjVar2 = this.f22615k3;
                if (hjVar2 != null) {
                    arrayList2 = hjVar2.e;
                }
                ArrayList arrayList3 = arrayList2;
                org.telegram.ui.Components.k5 k5Var2 = this.f22797ya;
                float f21 = f7 * x1Var.L1;
                if (hjVar2 != null) {
                    f18 = hjVar2.d;
                }
                G0(f16, f17, canvas, arrayList3, k5Var2, true, f21, f18, true);
                return;
            }
        }
        hj hjVar3 = this.f22615k3;
        if (hjVar3 != null) {
            arrayList2 = hjVar3.e;
        }
        ArrayList arrayList4 = arrayList2;
        org.telegram.ui.Components.k5 k5Var3 = this.f22797ya;
        if (hjVar3 != null) {
            f18 = hjVar3.d;
        }
        G0(f16, f17, canvas, arrayList4, k5Var3, true, f7, f18, true);
    }

    public final boolean F2() {
        if (this.P5 != null) {
            return this.R5;
        }
        return this.E;
    }

    public final boolean F3() {
        l1 l1Var;
        if (getCurrentMessagesGroup() == null && (l1Var = this.Qa) != null && l1Var.g2() != null && this.Qa.g2().z(this.O5)) {
            return true;
        }
        return false;
    }

    public final boolean G(MotionEvent motionEvent) {
        RectF rectF;
        l1 l1Var;
        y yVar;
        boolean z10 = false;
        if (this.Y8 != null && (rectF = this.f22507b9) != null && (this.ha != null || this.ia != null)) {
            boolean contains = rectF.contains((int) motionEvent.getX(), (int) K1(motionEvent));
            if (motionEvent.getAction() == 0) {
                SpannableString spannableString = new SpannableString(this.Y8.getText());
                mg.a[] aVarArr = (mg.a[]) spannableString.getSpans(0, spannableString.length(), mg.a.class);
                if (contains && aVarArr != null && aVarArr.length > 0) {
                    z10 = true;
                }
                this.V2 = z10;
                if (z10 && (yVar = this.X2) != null) {
                    yVar.setHotspot((int) motionEvent.getX(), (int) K1(motionEvent));
                    this.X2.setState(this.L2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.V2 && (l1Var = this.Qa) != null) {
                    l1Var.N0(this);
                }
                y yVar2 = this.X2;
                if (yVar2 != null) {
                    yVar2.setState(StateSet.NOTHING);
                }
                this.V2 = false;
            }
            return this.V2;
        }
        this.V2 = false;
        return false;
    }

    public final void G0(float r24, float r25, android.graphics.Canvas r26, java.util.ArrayList r27, org.telegram.ui.Components.k5 r28, boolean r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.G0(float, float, android.graphics.Canvas, java.util.ArrayList, org.telegram.ui.Components.k5, boolean, float, float, boolean):void");
    }

    public final ColorFilter G1(int i10, int i11) {
        if (this.Wc == null) {
            this.Xc = new int[3];
            this.Wc = new ColorFilter[3];
        }
        if (i11 != this.Xc[i10] || this.Wc[i10] == null) {
            ColorFilter[] colorFilterArr = this.Wc;
            this.Xc[i10] = i11;
            colorFilterArr[i10] = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        return this.Wc[i10];
    }

    public final boolean G2() {
        if (this.f22772wb && this.xb) {
            return true;
        }
        return false;
    }

    public final boolean H(MotionEvent motionEvent) {
        l1 l1Var;
        if (this.Y8 == null || (l1Var = this.Qa) == null || !l1Var.c()) {
            return false;
        }
        boolean contains = this.Z8.contains(motionEvent.getX(), motionEvent.getY());
        if (this.f22493a9 == null) {
            this.f22493a9 = new dc(this);
        }
        if (motionEvent.getAction() == 0) {
            this.f22493a9.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.f22493a9.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f22493a9.f25390i) {
                this.Qa.P1(this);
            }
            this.f22493a9.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.f22493a9.c(false);
        }
        return this.f22493a9.f25390i;
    }

    public final void H0(Canvas canvas, float f7) {
        zh0 zh0Var;
        jj jjVar = this.O5;
        if (jjVar != null && !jjVar.r4()) {
            float f10 = this.f22724t0;
            x1 x1Var = this.gb;
            if (x1Var.f23512m2) {
                float f11 = x1Var.f23521o2;
                float f12 = x1Var.L1;
                f10 = (f10 * f12) + ((1.0f - f12) * f11);
            }
            float f13 = f10;
            if (x1Var.L1 != 1.0f && x1Var.H0 && ((zh0Var = this.f22786xc) == null || !zh0Var.h)) {
                canvas.save();
                org.telegram.ui.ActionBar.c5 c5Var = this.J6;
                if (c5Var != null) {
                    Rect bounds = c5Var.getBounds();
                    if (this.O5.P3() && !this.A6 && !this.F) {
                        canvas.clipRect(org.telegram.messenger.i0.L(4.0f) + bounds.left, org.telegram.messenger.i0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.i0.L(10.0f), bounds.bottom - org.telegram.messenger.i0.L(4.0f));
                    } else {
                        canvas.clipRect(org.telegram.messenger.i0.L(4.0f) + bounds.left, org.telegram.messenger.i0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.i0.L(4.0f), bounds.bottom - org.telegram.messenger.i0.L(4.0f));
                    }
                }
                G0(this.f22649n0, f13, canvas, x1Var.I0, x1Var.P0, false, (1.0f - x1Var.L1) * f7, this.O5.f16381v2, false);
                jj jjVar2 = this.O5;
                G0(this.f22649n0, f13, canvas, jjVar2.f16397z2, this.f22797ya, true, f7 * x1Var.L1, jjVar2.f16381v2, false);
                canvas.restore();
            } else {
                jj jjVar3 = this.O5;
                G0(this.f22649n0, f13, canvas, jjVar3.f16397z2, this.f22797ya, true, f7, jjVar3.f16381v2, false);
            }
        }
        if (z3()) {
            F0(canvas, f7);
        }
    }

    public final boolean H2() {
        jj jjVar = this.O5;
        if (jjVar != null && jjVar.S4()) {
            return false;
        }
        return true;
    }

    public final boolean I(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.I(android.view.MotionEvent):boolean");
    }

    public final void I0(android.graphics.Canvas r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.I0(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public final boolean I2() {
        jj jjVar;
        if (this.W6 && (jjVar = this.O5) != null && !jjVar.P3() && this.L == null && !r2()) {
            return true;
        }
        return false;
    }

    public final void I3(int i10, boolean z10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.O4;
            if (i10 < arrayList.size()) {
                p1 p1Var = (p1) arrayList.get(i10);
                if (this.Qa.P(this, p1Var.f22437t, !p1Var.f22426i)) {
                    if (z10) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long B0 = jj.B0(this.O5.f16337k);
                    int i11 = this.Y5;
                    long M = org.telegram.messenger.w3.M(vp.r1(i11).L0(Long.valueOf(B0)), vp.r1(i11).M0(B0), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) jj.n1(this.O5);
                    int i12 = this.Y5;
                    jj.X5(i12, M, tL_messageMediaToDo, p1Var.f22437t.f19940id, !p1Var.f22426i, ConnectionsManager.getInstance(i12).getCurrentTime());
                    if (!p1Var.f22426i) {
                        TLObject d22 = vp.r1(i11).d2(M);
                        p1Var.f22441y.l(d22);
                        p1Var.f22442z.i0(d22, p1Var.f22441y, null);
                        p1Var.f22434q = new qz0(org.telegram.messenger.o5.m(d22), 12.0f, null);
                    }
                    this.f22533d7[i10].f(-1, !p1Var.f22426i, true);
                    if (this.f22765w3 != null) {
                        if (!this.O5.P3() && jj.B0(this.O5.f16337k) >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.f22765w3.t(cd.K("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(jj.z0(tL_messageMediaToDo)), org.telegram.messenger.o5.l(d20.f15147s0, this.O5.Z0())), true, true);
                        } else {
                            this.f22765w3.t(cd.K("TodoCompleted", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(jj.z0(tL_messageMediaToDo))), true, true);
                        }
                    }
                    p1Var.f22426i = !p1Var.f22426i;
                    invalidate();
                    return;
                }
                this.X4 = false;
            }
        }
    }

    public final boolean J(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.J(android.view.MotionEvent):boolean");
    }

    public final boolean J0() {
        jj jjVar;
        if (this.Pb && (jjVar = this.O5) != null && jjVar.P3() && org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21191rb, this.Ob) != 0) {
            return true;
        }
        return false;
    }

    public final org.telegram.ui.ActionBar.c5 J1(boolean z10) {
        boolean z11;
        if (z10) {
            bj bjVar = this.L;
            if (bjVar != null && (bjVar.f14783l & 8) == 0 && this.K.f15399i && !this.J) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.O5.P3()) {
                if (!this.A6 && !this.J && !z11) {
                    this.J6 = (org.telegram.ui.ActionBar.c5) W1("drawableMsgOut");
                } else {
                    this.J6 = (org.telegram.ui.ActionBar.c5) W1("drawableMsgOutMedia");
                }
            } else if (!this.A6 && !this.J && !z11) {
                this.J6 = (org.telegram.ui.ActionBar.c5) W1("drawableMsgIn");
            } else {
                this.J6 = (org.telegram.ui.ActionBar.c5) W1("drawableMsgInMedia");
            }
        }
        this.J6.g();
        return this.J6;
    }

    public final void J3() {
        jj jjVar;
        int i10;
        boolean z10;
        vv vvVar;
        ArrayList arrayList;
        if (this.vc && (jjVar = this.O5) != null) {
            boolean z11 = false;
            if (jjVar.V1) {
                i10 = org.telegram.ui.Components.f5.f();
            } else {
                i10 = 0;
            }
            hj hjVar = this.f22615k3;
            if (hjVar != null && (arrayList = hjVar.e) != null) {
                this.f22797ya = org.telegram.ui.Components.o5.update(i10, (View) this, false, this.f22797ya, (ArrayList<gj>) arrayList);
            } else {
                l1 l1Var = this.Qa;
                if (l1Var != null && l1Var.f()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f22797ya = org.telegram.ui.Components.o5.update(i10, this, z10, this.f22797ya, this.O5.f16397z2);
            }
            jj jjVar2 = this.O5;
            if (jjVar2.D == 36 && (vvVar = jjVar2.f16385w2) != null) {
                l1 l1Var2 = this.Qa;
                if (l1Var2 == null || !l1Var2.f()) {
                    z11 = true;
                }
                vvVar.v = z11;
                this.O5.f16385w2.b0(i10);
            }
        }
    }

    public final boolean K(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f22756v7) {
            int x10 = (int) motionEvent.getX();
            int K1 = (int) K1(motionEvent);
            bj bjVar = this.L;
            if (bjVar != null) {
                int i10 = bjVar.f14783l;
                if ((i10 & 1) == 0 || (i10 & 8) == 0) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int childCount = viewGroup.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (childAt != this && (childAt instanceof q1)) {
                            q1 q1Var = (q1) childAt;
                            if (q1Var.f22756v7 && q1Var.K == this.K) {
                                int i12 = q1Var.L.f14783l;
                                if ((i12 & 1) != 0 && (i12 & 8) != 0) {
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), (motionEvent.getX() + getLeft()) - q1Var.getLeft(), (K1(motionEvent) + getTop()) - q1Var.getTop(), 0);
                                    boolean K = q1Var.K(obtain);
                                    obtain.recycle();
                                    return K;
                                }
                            }
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.H2;
            if (action == 0) {
                if (this.f22769w7.contains(x10, K1)) {
                    if (this.O5.q4()) {
                        this.J2[1] = 2;
                        this.f22782x7 = true;
                        Drawable drawable2 = drawableArr[1];
                        if (drawable2 != null) {
                            drawable2.setHotspot(x10, K1);
                            drawableArr[1].setState(this.L2);
                        }
                        p2();
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f22782x7) {
                    l1 l1Var = this.Qa;
                    if (l1Var != null) {
                        if (this.f22717s6) {
                            l1Var.q(this);
                        } else {
                            l1Var.v(this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[1];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.f22782x7 = false;
                    p2();
                    return false;
                }
            } else if (motionEvent.getAction() == 2 && this.f22782x7 && (drawable = drawableArr[1]) != null) {
                drawable.setHotspot(x10, K1);
            }
        }
        return false;
    }

    public final boolean K0(android.graphics.Canvas r43, boolean r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.K0(android.graphics.Canvas, boolean, boolean):boolean");
    }

    public final float K1(MotionEvent motionEvent) {
        return ((motionEvent.getY() - this.V) - this.f22552f0) - this.f22575h0;
    }

    public final boolean K2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.K2():boolean");
    }

    public final void K3(boolean r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.K3(boolean, boolean, boolean):void");
    }

    public final boolean L(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.O5.D == 12) {
            if (this.f22739u2 == null) {
                this.f22739u2 = new r1(this);
            }
            r1 r1Var = this.f22739u2;
            q1 q1Var = r1Var.f22864a;
            jj jjVar = q1Var.O5;
            int[] iArr = q1Var.L2;
            Drawable[] drawableArr = q1Var.H2;
            if (jjVar.D == 12) {
                int x10 = (int) motionEvent.getX();
                int K1 = (int) q1Var.K1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    ArrayList arrayList = r1Var.f22868g;
                    if (arrayList != null && arrayList.size() > 1) {
                        for (int i10 = 0; i10 < r1Var.f22868g.size(); i10++) {
                            n1 n1Var = (n1) r1Var.f22868g.get(i10);
                            float f7 = x10;
                            float f10 = K1;
                            if (n1Var.e.contains(f7, f10)) {
                                if (n1Var.f22334f == null) {
                                    n1Var.f22334f = new dc(q1Var);
                                }
                                n1Var.f22334f.c(true);
                                y yVar = n1Var.f22335g;
                                if (yVar != null) {
                                    yVar.setHotspot(f7, f10);
                                    n1Var.f22335g.setState(iArr);
                                }
                                q1Var.invalidate();
                                return true;
                            }
                        }
                    }
                    float f11 = x10;
                    float f12 = K1;
                    if (q1Var.f22726t2.contains(f11, f12)) {
                        r1Var.h = true;
                        q1Var.Ea.c(true);
                        Drawable drawable2 = drawableArr[0];
                        if (drawable2 != null) {
                            drawable2.setHotspot(f11, f12);
                            drawableArr[0].setState(iArr);
                        }
                        q1Var.invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (r1Var.h) {
                        if (q1Var.Qa != null) {
                            ArrayList arrayList2 = r1Var.f22868g;
                            if (arrayList2 != null && arrayList2.size() == 1) {
                                q1Var.Qa.c1(q1Var, ((n1) r1Var.f22868g.get(0)).f22331a);
                            } else {
                                q1Var.Qa.c1(q1Var, 5);
                            }
                        }
                        q1Var.playSoundEffect(0);
                        Drawable drawable3 = drawableArr[0];
                        if (drawable3 != null) {
                            drawable3.setState(StateSet.NOTHING);
                        }
                        r1Var.h = false;
                        q1Var.Ea.c(false);
                        q1Var.invalidate();
                        return false;
                    }
                    ArrayList arrayList3 = r1Var.f22868g;
                    if (arrayList3 != null && arrayList3.size() > 1) {
                        for (int i11 = 0; i11 < r1Var.f22868g.size(); i11++) {
                            n1 n1Var2 = (n1) r1Var.f22868g.get(i11);
                            dc dcVar = n1Var2.f22334f;
                            if (dcVar != null && dcVar.f25390i) {
                                l1 l1Var = q1Var.Qa;
                                if (l1Var != null) {
                                    l1Var.c1(q1Var, n1Var2.f22331a);
                                }
                                y yVar2 = n1Var2.f22335g;
                                if (yVar2 != null) {
                                    yVar2.setState(StateSet.NOTHING);
                                }
                                n1Var2.f22334f.c(false);
                                q1Var.playSoundEffect(0);
                                q1Var.invalidate();
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 2) {
                    if (r1Var.h && (drawable = drawableArr[0]) != null) {
                        drawable.setHotspot(x10, K1);
                        return false;
                    }
                    ArrayList arrayList4 = r1Var.f22868g;
                    if (arrayList4 != null && arrayList4.size() > 1) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= r1Var.f22868g.size()) {
                                break;
                            }
                            n1 n1Var3 = (n1) r1Var.f22868g.get(i12);
                            dc dcVar2 = n1Var3.f22334f;
                            if (dcVar2 != null && dcVar2.f25390i) {
                                y yVar3 = n1Var3.f22335g;
                                if (yVar3 != null) {
                                    yVar3.setHotspot(x10, K1);
                                    return false;
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void L0(Canvas canvas) {
        if (!this.O5.M0 && this.K9 != 1.0f) {
            ag.c2 c2Var = this.T0;
            int[] iArr = c2Var.W0;
            float f7 = iArr[0];
            float[] fArr = this.I9;
            fArr[1] = f7;
            fArr[0] = f7;
            float f10 = iArr[1];
            fArr[3] = f10;
            fArr[2] = f10;
            float f11 = iArr[2];
            fArr[5] = f11;
            fArr[4] = f11;
            float f12 = iArr[3];
            fArr[7] = f12;
            fArr[6] = f12;
            Path path = this.H9;
            path.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(c2Var.K0, c2Var.L0, c2Var.y(), c2Var.A());
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr, direction);
            canvas.save();
            canvas.clipPath(path);
            if (this.K9 != 0.0f) {
                path.rewind();
                path.addCircle(this.L9, this.M9, this.N9 * this.K9, direction);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            if (this.O5.m5()) {
                c2Var.h(canvas, null);
            } else {
                float f13 = c2Var.K0;
                float f14 = c2Var.L0;
                float f15 = c2Var.M0;
                float f16 = c2Var.N0;
                ImageReceiver imageReceiver = this.U0;
                imageReceiver.y0(f13, f14, f15, f16);
                imageReceiver.L0(c2Var.W0);
                imageReceiver.h(canvas, null);
            }
            M0(canvas);
            canvas.restore();
        }
    }

    public final String L1(jj jjVar) {
        if (this.f22805z5) {
            String M0 = cd.M0("PsaMessage_" + jjVar.f16337k.fwd_from.psa_type);
            if (M0 == null) {
                return cd.L0(2131746610, "PsaMessageDefault");
            }
            return M0;
        }
        return cd.L0(2131750567, null);
    }

    public final boolean L2() {
        jj jjVar = this.O5;
        vv vvVar = jjVar.f16385w2;
        if (jjVar.D == 36 && vvVar != null) {
            ArrayList arrayList = vvVar.f18990g;
            if (arrayList.size() == 1 && (arrayList.get(0) instanceof gl0)) {
                return true;
            }
        }
        return false;
    }

    public final void L3() {
        float f7;
        float f10;
        float f11;
        float L;
        int i10;
        float f12;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        jj jjVar = this.O5;
        int i18 = jjVar.D;
        float f13 = 0.0f;
        x1 x1Var = this.gb;
        int i19 = 0;
        boolean z10 = true;
        if (i18 != 1 && i18 != 20 && this.K1 != 4 && i18 != 8 && i18 != 23) {
            float f14 = 10.0f;
            float f15 = 11.0f;
            if (this.Q1) {
                int i20 = this.L6;
                if (!jjVar.P3()) {
                    f15 = 17.0f;
                }
                this.f22689q3 = org.telegram.messenger.i0.L(f15) + i20 + this.f22678p3;
                int i21 = this.f22737u0 - this.f22714s3;
                if (this.I) {
                    f14 = 9.0f;
                }
                int L2 = ((i21 - org.telegram.messenger.i0.L(f14)) - this.U1) - org.telegram.messenger.i0.L(17.0f);
                if (this.f22756v7 && this.D8 != 3) {
                    i17 = getCommentButtonHeight();
                } else {
                    i17 = 0;
                }
                L = L2 - i17;
                this.f22701r3 = org.telegram.messenger.i0.T1(L, org.telegram.messenger.i0.L(9.0f) + this.Sa, U2());
            } else {
                if (this.f22772wb) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.O5.P3()) {
                        i16 = 0;
                    } else {
                        i16 = 6;
                    }
                    this.f22689q3 = org.telegram.messenger.i0.L(i16 + 11) + backgroundDrawableLeft;
                } else {
                    int i22 = this.L6;
                    if (!jjVar.P3() && !this.A6 && !this.J) {
                        f15 = 17.0f;
                    }
                    this.f22689q3 = org.telegram.messenger.i0.L(f15) + i22 + this.f22678p3;
                }
                int i23 = this.f22737u0 - this.f22714s3;
                if (this.I) {
                    f14 = 9.0f;
                }
                int L3 = i23 - org.telegram.messenger.i0.L(f14);
                if (this.f22756v7 && this.D8 != 3) {
                    i14 = getCommentButtonHeight();
                } else {
                    i14 = 0;
                }
                int i24 = L3 - i14;
                sg.p0 p0Var = this.N;
                if (!p0Var.f48450p) {
                    i15 = p0Var.f48448n;
                } else {
                    i15 = 0;
                }
                L = i24 - i15;
                this.f22701r3 = org.telegram.messenger.i0.T1(L, org.telegram.messenger.i0.L(9.0f) + this.Sa, U2());
            }
        } else {
            if (x1Var.f23483g0) {
                f10 = x1Var.f23515n0;
                f11 = x1Var.f23519o0;
                f7 = x1Var.f23527q0;
            } else {
                ag.c2 c2Var = this.T0;
                float f16 = c2Var.K0;
                float f17 = c2Var.L0;
                f7 = c2Var.N0;
                f10 = f16;
                f11 = f17;
            }
            this.f22689q3 = f10 + org.telegram.messenger.i0.L(5.0f) + this.f22678p3;
            if (r2()) {
                float compactLeft = getCompactLeft() - getExtraTextX();
                if (q2()) {
                    f12 = this.f22497ad;
                } else if (this.K != null && this.L != null) {
                    f12 = getLeft();
                } else {
                    f12 = 0.0f;
                }
                this.f22689q3 = compactLeft - f12;
            }
            L = f11 + f7 + org.telegram.messenger.i0.L(6.0f);
            float L4 = f7 + org.telegram.messenger.i0.L(6.0f);
            hj hjVar = this.f22615k3;
            if (hjVar == null) {
                i10 = 0;
            } else {
                i10 = -hjVar.b();
            }
            this.f22701r3 = org.telegram.messenger.i0.T1(L4, i10 - org.telegram.messenger.i0.L(4.0f), U2()) + f11;
            z10 = false;
        }
        this.f22689q3 += getExtraTextX();
        jj jjVar2 = this.O5;
        if (jjVar2 != null && (i11 = jjVar2.D) != 0 && i11 != 24 && !jjVar2.v3() && !this.O5.r4()) {
            if (z10 && d2()) {
                this.f22701r3 -= (1.0f - U2()) * (org.telegram.messenger.i0.L(16.0f) + this.f22698r0.f22979r);
            }
            if (z10) {
                s1 s1Var = this.f22698r0;
                if (s1Var != null) {
                    i13 = s1Var.f22979r;
                } else {
                    i13 = 0;
                }
                i12 = org.telegram.messenger.i0.L(14.0f) + i13;
            } else {
                i12 = 0;
            }
            float f18 = L - i12;
            hj hjVar2 = this.f22615k3;
            if (hjVar2 != null) {
                i19 = org.telegram.messenger.i0.L(4.0f) + hjVar2.c(x1Var);
            }
            this.f22686q0 = (int) ((f18 + org.telegram.messenger.i0.W1(U2(), i19, org.telegram.messenger.i0.L(6.0f))) - x1Var.f23502k0);
        }
        jj jjVar3 = this.O5;
        if (jjVar3 != null && jjVar3.D == 17) {
            float f19 = this.f22701r3;
            w1 w1Var = this.f22751v2;
            if (w1Var != null) {
                f13 = w1Var.f23365q;
            }
            this.f22701r3 = f19 + f13;
        }
    }

    @Override
    public final void M(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.M(java.lang.String):void");
    }

    public void M0(Canvas canvas) {
        if (this.O9 == null) {
            return;
        }
        canvas.save();
        ag.c2 c2Var = this.T0;
        canvas.translate(c2Var.K0, c2Var.L0);
        this.O9.c(canvas, this, (int) c2Var.M0, (int) c2Var.N0, c2Var.getAlpha(), this.Ec);
        canvas.restore();
        invalidate();
    }

    public final float M1(boolean z10) {
        float f7;
        rh0 rh0Var;
        float f10;
        if (!this.f22600j1 && this.f22768w6) {
            int i10 = this.f22781x6;
            if (i10 >= 300) {
                f10 = 1.0f;
            } else {
                f10 = i10 / 300.0f;
            }
            f7 = f10 * 1.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10 && (rh0Var = this.f22638m3) != null) {
            return (1.0f - rh0Var.f29922k.e(false, 1.0f)) * f7;
        }
        return f7;
    }

    public final boolean M2() {
        gl0 X3 = X3();
        if (X3 != null) {
            long j10 = this.Yb;
            long j11 = 0;
            if (j10 != 0) {
                q81 q81Var = X3.f26399d0;
                if (q81Var != null) {
                    j11 = q81Var.f29594t;
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

    public final void M3() {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        if (this.O5 != null) {
            int i10 = this.Y5;
            vp r12 = vp.r1(i10);
            TLRPC.MessageFwdHeader messageFwdHeader = this.O5.f16337k.fwd_from;
            long e = d20.i(i10).e();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (jj.B0(this.O5.f16337k) == e || jj.B0(this.O5.f16337k) == 1271266957)) {
                this.ia = vp.r1(i10).L0(Long.valueOf(messageFwdHeader.from_id.channel_id));
            } else if (messageFwdHeader != null && jj.B0(this.O5.f16337k) == 489000) {
                long o10 = org.telegram.messenger.o5.o(messageFwdHeader.from_id);
                if (o10 >= 0) {
                    this.ha = r12.Z1(Long.valueOf(o10));
                } else {
                    this.ia = r12.L0(Long.valueOf(-o10));
                }
            } else if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
                long j10 = peer.user_id;
                if (j10 != 0) {
                    if (!this.f22558f6) {
                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                        if (peer2 instanceof TLRPC.TL_peerUser) {
                            this.ha = r12.Z1(Long.valueOf(peer2.user_id));
                            return;
                        }
                    }
                    this.ha = r12.Z1(Long.valueOf(j10));
                } else if (peer.channel_id != 0) {
                    if (this.O5.k4()) {
                        TLRPC.Peer peer3 = messageFwdHeader.from_id;
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            this.ha = r12.Z1(Long.valueOf(peer3.user_id));
                            return;
                        }
                    }
                    this.ia = r12.L0(Long.valueOf(messageFwdHeader.saved_from_peer.channel_id));
                } else {
                    long j11 = peer.chat_id;
                    if (j11 != 0) {
                        TLRPC.Peer peer4 = messageFwdHeader.from_id;
                        if (peer4 instanceof TLRPC.TL_peerUser) {
                            this.ha = r12.Z1(Long.valueOf(peer4.user_id));
                        } else {
                            this.ia = r12.L0(Long.valueOf(j11));
                        }
                    }
                }
            } else if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || jj.B0(this.O5.f16337k) == e)) {
                this.ha = r12.Z1(Long.valueOf(messageFwdHeader.from_id.user_id));
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || jj.B0(this.O5.f16337k) == e)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.ha = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || jj.B0(this.O5.f16337k) == e)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.ha = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long B0 = jj.B0(this.O5.f16337k);
                long Z0 = this.O5.Z0();
                TLRPC.Chat chat2 = null;
                if (org.telegram.messenger.o5.z(Z0)) {
                    chat = r12.L0(Long.valueOf(-Z0));
                } else {
                    chat = null;
                }
                if (org.telegram.messenger.o5.z(B0)) {
                    chat2 = r12.L0(Long.valueOf(-B0));
                }
                if (org.telegram.messenger.o5.C(jj.B0(this.O5.f16337k))) {
                    if (this.O5.P3()) {
                        this.ha = d20.i(i10).f();
                        return;
                    }
                    TLRPC.EncryptedChat Z02 = r12.Z0(Integer.valueOf((int) (jj.B0(this.O5.f16337k) & 4294967295L)));
                    if (Z02 != null) {
                        this.ha = r12.Z1(Long.valueOf(Z02.user_id));
                    }
                } else if (org.telegram.messenger.o5.E(Z0) && (!this.O5.f16337k.post || (chat != null && chat.signature_profiles))) {
                    this.ha = r12.Z1(Long.valueOf(Z0));
                } else if (this.O5.f16337k.post && chat2 != null && !chat2.signature_profiles) {
                    this.ia = chat2;
                } else if (org.telegram.messenger.o5.z(Z0)) {
                    this.ia = chat;
                } else {
                    TLRPC.Message message = this.O5.f16337k;
                    if (message.post) {
                        this.ia = r12.L0(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    public final boolean N(MotionEvent motionEvent) {
        float f7;
        l1 l1Var;
        jj jjVar = this.O5;
        if (jjVar == null || jjVar.M0() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f10 = 0.0f;
        if (this.f22587i0 == 0) {
            f7 = 0.0f;
        } else {
            f7 = 18.0f;
        }
        float L = timeX - org.telegram.messenger.i0.L(f7);
        float f11 = this.f22796y9;
        if (this.O5.f16395z0) {
            f10 = 1.0f - this.f22591i4;
        }
        int L2 = ((int) ((f11 * f10) + L)) - org.telegram.messenger.i0.L(2.0f);
        int timeY = ((int) getTimeY()) - org.telegram.messenger.i0.L(2.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(L2, timeY, org.telegram.messenger.i0.L(16.0f) + L2 + this.f22796y9, org.telegram.messenger.i0.L(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), K1(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.f22612k0 == null) {
                    this.f22612k0 = new dc(this);
                }
                this.f22538dc = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.f22538dc = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.f22538dc && (l1Var = this.Qa) != null) {
                l1Var.H(this);
            }
            this.f22538dc = false;
        } else if (motionEvent.getAction() == 3) {
            this.f22538dc = false;
        }
        dc dcVar = this.f22612k0;
        if (dcVar != null) {
            dcVar.c(this.f22538dc);
        }
        return this.f22538dc;
    }

    public final boolean N0(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        jj jjVar;
        l1 l1Var;
        String str;
        boolean c10 = sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        int i10 = 1;
        int i11 = this.Y5;
        if (!c10 && !sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                qz C = qz.C(i11);
                jj jjVar2 = this.O5;
                if (jjVar2 != null && keyboardButtonProto != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jj.B0(jjVar2.f16337k));
                    sb2.append("_");
                    sb2.append(jjVar2.f1());
                    sb2.append("_");
                    sb2.append(Utilities.f(keyboardButtonProto.getData()));
                    sb2.append("_");
                    if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    sb2.append(str);
                    return C.f17662n.containsKey(sb2.toString());
                }
            } else {
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (tL_inlineButtonTypeUrl != null && (l1Var = this.Qa) != null && l1Var.k1(this, 3) && TextUtils.equals(this.Qa.h(this), tL_inlineButtonTypeUrl.url)) {
                    return true;
                }
            }
        } else {
            qz C2 = qz.C(i11);
            if (this.O5 != null && keyboardButtonProto != null) {
                if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    i10 = 3;
                } else if (!sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                    if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                }
                return C2.f17663r.containsKey(jj.B0(jjVar.f16337k) + "_" + jjVar.f1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i10);
            }
        }
        return false;
    }

    public final void N2(int i10, int i11) {
        bj bjVar = this.L;
        float f7 = bjVar.f14789r;
        float f10 = bjVar.f14791t;
        this.Zc = f7 - f10;
        this.f22497ad = f10;
        this.f22511bd = (int) bjVar.f14790s;
        this.f22525cd = (int) ((i10 * bjVar.f14792u) / (i11 / 1000.0f));
    }

    public final void N3() {
        Window window;
        if (this.f22634lb == null) {
            Activity W = org.telegram.messenger.i0.W(getContext());
            if (W == null) {
                window = null;
            } else {
                window = W.getWindow();
            }
            if (window != null) {
                org.telegram.messenger.o6 o6Var = new org.telegram.messenger.o6(window, new ca(this, 3));
                this.f22634lb = o6Var;
                if (this.N0) {
                    o6Var.a();
                }
            }
        }
        org.telegram.messenger.o6 o6Var2 = this.f22634lb;
        if (o6Var2 != null) {
            o6Var2.g();
        }
    }

    public final boolean O(MotionEvent motionEvent) {
        int i10;
        int i11;
        int i12;
        if (this.R1) {
            t1 B1 = B1();
            q1 q1Var = B1.f23065a;
            boolean z10 = q1Var.R1;
            ArrayList arrayList = q1Var.G5;
            ji.a aVar = q1Var.f22715s4;
            if (z10) {
                int x10 = (int) motionEvent.getX();
                int K1 = (int) q1Var.K1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    if (q1Var.M1 && q1Var.f22763w1 && q1Var.M3 != -1 && x10 >= (i11 = q1Var.I3) && x10 <= org.telegram.messenger.i0.L(48.0f) + i11 && K1 >= (i12 = q1Var.J3) && K1 <= org.telegram.messenger.i0.L(48.0f) + i12 && q1Var.P0.f24128i.f26933q != 4) {
                        q1Var.N3 = 1;
                        q1Var.invalidate();
                        return true;
                    } else if (q1Var.M1 && q1Var.T0.O(x10, K1)) {
                        B1.v = true;
                        return true;
                    } else if (q1Var.f22651n2 == null || K1 < q1Var.W1) {
                        return false;
                    } else {
                        try {
                            int L = x10 - ((q1Var.f22662o0 + org.telegram.messenger.i0.L(10.0f)) + q1Var.Y1);
                            int i13 = K1 - q1Var.W1;
                            int lineForVertical = q1Var.f22651n2.getLineForVertical(i13);
                            float f7 = L;
                            int offsetForHorizontal = q1Var.f22651n2.getOffsetForHorizontal(lineForVertical, f7);
                            float lineLeft = q1Var.f22651n2.getLineLeft(lineForVertical);
                            if (lineLeft > f7 || lineLeft + q1Var.f22651n2.getLineWidth(lineForVertical) < f7) {
                                return false;
                            }
                            Spannable spannable = (Spannable) q1Var.O5.f16390y;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length == 0) {
                                return false;
                            }
                            if (((clickableSpanArr[0] instanceof b51) && !b51.h) || org.telegram.messenger.i0.C1()) {
                                return false;
                            }
                            q80 q80Var = q1Var.f22679p4;
                            if (q80Var == null || q80Var.f29568i != clickableSpanArr[0]) {
                                aVar.m(q80Var, true);
                                q80 q80Var2 = new q80(clickableSpanArr[0], q1Var.Ob, f7, i13, 0);
                                q1Var.f22679p4 = q80Var2;
                                if (q1Var.O5.P3()) {
                                    i10 = org.telegram.ui.ActionBar.t6.Ac;
                                } else {
                                    i10 = org.telegram.ui.ActionBar.t6.f21336ze;
                                }
                                q80Var2.d(org.telegram.ui.ActionBar.t6.w0(i10, q1Var.Ob));
                                q1Var.f22775x0 = -10;
                                q1Var.f22728t4 = 2;
                                try {
                                    k80 b10 = q1Var.f22679p4.b();
                                    int[] U1 = U1(spannable, q1Var.f22679p4.f29568i);
                                    b10.d(q1Var.f22651n2, U1[0], 0.0f);
                                    q1Var.f22651n2.getSelectionPath(U1[0], U1[1], b10);
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                }
                                aVar.b(q1Var.f22679p4, 2);
                            }
                            q1Var.invalidate();
                            return true;
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                            return false;
                        }
                    }
                } else if (motionEvent.getAction() != 1) {
                    return false;
                } else {
                    if (q1Var.f22728t4 != 2 && !B1.v && q1Var.N3 == 0) {
                        q1Var.b3(2);
                        return false;
                    } else if (q1Var.N3 != 0) {
                        q1Var.N3 = 0;
                        q1Var.playSoundEffect(0);
                        q1Var.C0(false);
                        q1Var.invalidate();
                        return false;
                    } else {
                        q80 q80Var3 = q1Var.f22679p4;
                        if (q80Var3 != null) {
                            CharacterStyle characterStyle = q80Var3.f29568i;
                            if (characterStyle instanceof URLSpan) {
                                gf.f.r(q1Var.getContext(), ((URLSpan) q1Var.f22679p4.f29568i).getURL());
                            } else if (characterStyle instanceof ClickableSpan) {
                                ((ClickableSpan) characterStyle).onClick(q1Var);
                            }
                            q1Var.b3(2);
                            return false;
                        }
                        B1.v = false;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList.size()) {
                                break;
                            }
                            c0 c0Var = (c0) arrayList.get(i14);
                            if (sf.c.c(c0Var.f21758i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                q1Var.playSoundEffect(0);
                                q1Var.Qa.W0(q1Var, c0Var.f21758i);
                                q1Var.invalidate();
                                break;
                            }
                            i14++;
                        }
                        q1Var.b3(2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void O0(float r8, android.graphics.Canvas r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.O0(float, android.graphics.Canvas, boolean):void");
    }

    public final String O1(long j10) {
        TLRPC.Chat L0;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.Y5;
        if (i10 > 0) {
            TLRPC.User Z1 = vp.r1(i11).Z1(Long.valueOf(j10));
            if (Z1 != null) {
                return h20.p(Z1);
            }
            return null;
        } else if (i10 < 0 && (L0 = vp.r1(i11).L0(Long.valueOf(-j10))) != null) {
            return L0.title;
        } else {
            return null;
        }
    }

    public final int O2(int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.O2(int):int");
    }

    public final void O3() {
        boolean z10;
        String k02;
        double d;
        double d10;
        double d11;
        ih.h hVar;
        ih.h hVar2;
        jj jjVar = this.O5;
        if (jjVar != null) {
            j1 j1Var = this.Nb;
            if (j1Var != null && j1Var.rewindCount != 0 && j1Var.rewindByBackSeek) {
                jjVar.f16299b0 = j1Var.getVideoProgress();
            }
            boolean z11 = true;
            if (this.O5.T3()) {
                w1 w1Var = this.f22751v2;
                if (w1Var != null && (hVar2 = w1Var.f23361m) != null) {
                    hVar2.p(true);
                }
                w1 w1Var2 = this.f22751v2;
                if (w1Var2 != null && (hVar = w1Var2.f23362n) != null) {
                    hVar.p(true);
                }
            }
            int i10 = this.K1;
            double d12 = 0.0d;
            int i11 = 0;
            i1 i1Var = this.B4;
            if (i10 == 4) {
                if (i1Var != null) {
                    i1Var.a();
                }
                if (this.f22752v3 != null) {
                    if (!PhotoViewer.N1(this.O5)) {
                        if (MediaController.B().f14484v0 == this.O5) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.s5 m10 = this.T0.m();
                if (m10 != null) {
                    jj jjVar2 = this.O5;
                    int i12 = m10.d[4] / 1000;
                    jjVar2.f16326h0 = i12;
                    d11 = i12;
                    TLRPC.Message message = jjVar2.f16337k;
                    if (message.ttl > 0 && message.destroyTime == 0 && !jjVar2.m5() && jj.L4(this.O5.f16337k) && m10.s()) {
                        this.Qa.O(this.O5);
                    }
                } else {
                    d11 = 0.0d;
                }
                if (d11 == 0.0d) {
                    d11 = this.O5.L0();
                }
                if (MediaController.B().I(this.O5)) {
                    d11 -= this.O5.f16299b0 * d11;
                } else if (m10 != null) {
                    if (d11 != 0.0d) {
                        d11 -= m10.o() / 1000;
                    }
                    if (this.Qa != null && m10.o() >= 3000) {
                        this.Qa.y0();
                    }
                }
                if (this.K4 != d11) {
                    String g02 = org.telegram.messenger.i0.g0((int) d11, false, false);
                    this.A3 = (int) Math.ceil(org.telegram.ui.ActionBar.t6.C2.measureText(g02));
                    this.f22752v3 = new StaticLayout(g02, org.telegram.ui.ActionBar.t6.C2, this.A3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.K4 = d11;
                    return;
                }
                return;
            }
            boolean z12 = this.f22772wb;
            qn0 qn0Var = this.C4;
            if (z12) {
                if (this.A4) {
                    if (!qn0Var.f29691f) {
                        qn0Var.g(true, this.O5.f16299b0);
                    }
                } else {
                    if (!i1Var.e) {
                        i1Var.h(this.O5.f16299b0);
                        i1Var.f27844q = this.O5.f16312e0;
                    }
                    i1Var.a();
                }
                TLRPC.Document F0 = this.O5.F0();
                if (F0 != null) {
                    for (int i13 = 0; i13 < F0.attributes.size(); i13++) {
                        TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i13);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                            d10 = documentAttribute.duration;
                            break;
                        }
                    }
                }
                d10 = 0.0d;
                long j10 = this.f22647mc;
                if (j10 >= 0) {
                    d10 = j10;
                } else if (MediaController.B().I(this.O5)) {
                    d10 = Math.max(0.0d, d10 - this.O5.f16322g0);
                }
                if (this.K4 != d10) {
                    this.K4 = d10;
                    String g03 = org.telegram.messenger.i0.g0((int) d10, true, false);
                    this.L4 = (int) Math.ceil(org.telegram.ui.ActionBar.t6.T2.measureText(g03));
                    this.J4 = new StaticLayout(g03, org.telegram.ui.ActionBar.t6.T2, this.L4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float f7 = this.O5.f16299b0;
                if (f7 != 0.0f) {
                    this.Ib = f7;
                    if (f7 > 0.9f) {
                        this.Ib = 1.0f;
                    }
                }
                invalidate();
            } else if (this.L1 != null) {
                if (this.A4) {
                    if (!qn0Var.f29691f) {
                        qn0Var.g(true, this.O5.f16299b0);
                    }
                    z10 = true;
                } else {
                    if (!i1Var.e) {
                        i1Var.h(this.O5.f16299b0);
                        i1Var.f27844q = this.O5.f16312e0;
                    }
                    i1Var.j(this.O5);
                    z10 = false;
                }
                int i14 = this.K1;
                if (i14 == 5) {
                    z10 = true;
                }
                if (i14 == 3) {
                    long j11 = this.f22647mc;
                    if (j11 >= 0) {
                        d = j11;
                    } else if (!MediaController.B().I(this.O5)) {
                        int i15 = 0;
                        while (true) {
                            if (i15 >= this.L1.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute2 = this.L1.attributes.get(i15);
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                d12 = documentAttribute2.duration;
                                break;
                            }
                            i15++;
                        }
                        d = d12;
                    } else {
                        d = this.O5.f16322g0;
                    }
                    if (this.K4 != d) {
                        this.K4 = d;
                        String g04 = org.telegram.messenger.i0.g0((int) d, true, false);
                        this.L4 = (int) Math.ceil(org.telegram.ui.ActionBar.t6.N2.measureText(g04));
                        this.J4 = new StaticLayout(g04, org.telegram.ui.ActionBar.t6.N2, this.L4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                } else {
                    double L0 = this.O5.L0();
                    if (MediaController.B().I(this.O5)) {
                        i11 = this.O5.f16322g0;
                    }
                    double d13 = i11;
                    if (this.K4 != d13) {
                        this.K4 = d13;
                        this.J4 = new StaticLayout(org.telegram.messenger.i0.k0(i11, (int) L0), org.telegram.ui.ActionBar.t6.N2, (int) Math.ceil(org.telegram.ui.ActionBar.t6.N2.measureText(k02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                    z11 = z10;
                }
                if (z11) {
                    invalidate();
                }
            }
        }
    }

    public final void P() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.P():void");
    }

    public final void P0(android.graphics.Canvas r21, org.telegram.messenger.hj r22, boolean r23, boolean r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.P0(android.graphics.Canvas, org.telegram.messenger.hj, boolean, boolean, float):void");
    }

    public final float P1(boolean z10) {
        boolean z11;
        gr grVar;
        float f7 = this.Tc;
        jj jjVar = this.O5;
        if (jjVar != null && !jjVar.P3()) {
            int i10 = 0;
            if (z10 && ((z11 = this.f22636m1) || this.f22650n1)) {
                if (z11) {
                    grVar = gr.f26496g;
                } else {
                    grVar = gr.f26497i;
                }
                this.f22687q1 = (int) Math.ceil(grVar.getInterpolation(this.f22663o1) * org.telegram.messenger.i0.L(35.0f));
                if (this.O5.D == 36) {
                    if (org.telegram.messenger.i0.L(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                        this.f22687q1 = 0;
                    }
                }
            }
            f7 += this.f22687q1;
            if (r2()) {
                return f7 + getCompactSideMenuShift();
            }
            if (this.V6 && this.L != null) {
                if (V2()) {
                    i10 = 48;
                }
                return (org.telegram.messenger.i0.L(71 - i10) * this.X6) + f7;
            }
        }
        return f7;
    }

    public final void P2(boolean z10) {
        int currentBackgroundLeft;
        float f7;
        int L;
        int i10;
        float f10;
        int L2;
        int currentBackgroundLeft2;
        boolean P3 = this.O5.P3();
        int i11 = 0;
        x1 x1Var = this.gb;
        if (P3) {
            if (z10) {
                currentBackgroundLeft2 = (int) (this.L6 + x1Var.f23487h0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            this.f22649n0 = getExtraTextX() + org.telegram.messenger.i0.L(11.0f) + currentBackgroundLeft2;
        } else {
            if (z10) {
                currentBackgroundLeft = (int) (this.L6 + x1Var.f23487h0);
            } else {
                currentBackgroundLeft = getCurrentBackgroundLeft();
            }
            if (this.O5.D == 19) {
                L = 0;
            } else {
                if (!this.A6 && this.J) {
                    f7 = 11.0f;
                } else {
                    f7 = 17.0f;
                }
                L = org.telegram.messenger.i0.L(f7);
            }
            this.f22649n0 = getExtraTextX() + currentBackgroundLeft + L;
        }
        float f11 = 4.0f;
        if (this.R1) {
            this.f22649n0 = org.telegram.messenger.i0.L(11.0f) + this.f22649n0;
            int L3 = org.telegram.messenger.i0.L(14.0f) + this.Sa;
            this.f22724t0 = L3;
            StaticLayout staticLayout = this.f22542e2;
            if (staticLayout != null) {
                this.f22724t0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + L3;
            }
        } else if (this.S1) {
            int L4 = org.telegram.messenger.i0.L(14.0f) + this.Sa;
            this.f22724t0 = L4;
            StaticLayout staticLayout2 = this.f22542e2;
            if (staticLayout2 != null) {
                this.f22724t0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L4;
            }
        } else if (this.O5.D == 19) {
            this.f22724t0 = org.telegram.messenger.i0.L(6.0f) + this.Sa;
            if (!this.O5.N3()) {
                this.f22649n0 = getCurrentBackgroundLeft();
            } else {
                this.f22649n0 -= org.telegram.messenger.i0.L(4.0f);
            }
        } else {
            int L5 = org.telegram.messenger.i0.L(8.0f) + this.Sa;
            this.f22724t0 = L5;
            jj jjVar = this.O5;
            float f12 = 2.0f;
            if (jjVar.D == 36) {
                if (this.f22738u1 && this.f22615k3 != null && L2()) {
                    this.f22724t0 = org.telegram.messenger.m5.C(7.0f, this.f22615k3.b(), this.f22724t0);
                } else {
                    vv vvVar = this.O5.f16385w2;
                    if (vvVar != null && vvVar.Y()) {
                        int i12 = this.f22724t0;
                        if (this.Sa <= 0) {
                            f12 = -3.0f;
                        }
                        this.f22724t0 = org.telegram.messenger.i0.L(f12) + i12;
                    }
                }
            } else {
                if (jjVar.C2 && (i10 = tz.Y0) > 10) {
                    if (i10 < 15) {
                        f12 = 1.0f;
                    }
                    this.f22724t0 = org.telegram.messenger.i0.L(f12) + L5;
                }
                if (this.O5.C2 && this.Sa > 0) {
                    this.f22724t0 = org.telegram.messenger.i0.L(5.0f) + this.f22724t0;
                }
            }
        }
        if (this.O5.r4()) {
            this.f22675p0 = org.telegram.messenger.i0.L(14.0f) + this.f22724t0;
        } else if (this.f22725t1) {
            this.f22675p0 = org.telegram.messenger.i0.L(10.0f) + this.f22724t0;
            this.f22724t0 = org.telegram.messenger.m5.C(13.0f, this.U1, this.f22724t0);
            if (this.f22713s2 && !this.S1 && !this.O5.v3()) {
                this.f22724t0 = org.telegram.messenger.i0.L(44.0f) + this.f22724t0;
            }
        } else {
            this.f22675p0 = org.telegram.messenger.i0.L(10.0f) + this.O5.U5(x1Var) + this.f22724t0;
        }
        if (this.f22725t1) {
            L2 = org.telegram.messenger.i0.L(10.0f) + this.O5.U5(x1Var) + this.f22724t0;
        } else {
            int i13 = this.f22675p0 + this.U1;
            if (this.f22713s2) {
                f10 = 46.0f;
            } else {
                f10 = 0.0f;
            }
            int L6 = org.telegram.messenger.i0.L(f10) + i13;
            if (this.U1 <= 0) {
                f11 = -8.0f;
            }
            L2 = org.telegram.messenger.i0.L(f11) + L6;
        }
        this.f22686q0 = L2;
        this.f22662o0 = this.f22649n0;
        if (this.O5.f16381v2 != 0.0f && this.O7 != null) {
            int L7 = this.Z6 - org.telegram.messenger.i0.L(31.0f);
            jj jjVar2 = this.O5;
            int i14 = L7 - jjVar2.f16374t2;
            if (!this.f22491a7) {
                int i15 = this.f22796y9;
                if (jjVar2.P3()) {
                    i11 = 20;
                }
                i14 = z20.w(i11 + 4, i15, i14);
            }
            if (i14 > 0) {
                this.f22649n0 = (i14 - getExtraTimeX()) + this.f22649n0;
            }
        }
    }

    public final void P3() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.R0) {
            return;
        }
        boolean z13 = true;
        if ((!this.f22755v6 && !this.f22743u6 && !isPressed()) || (this.M1 && this.T0.I())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && this.N3 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        RadialProgress2 radialProgress2 = this.P0;
        radialProgress2.o(z11, false);
        if (this.U3 != 0) {
            if (!z10 && this.P3 == 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            radialProgress2.o(z12, true);
        }
        if (!z10 && this.O3 == 0) {
            z13 = false;
        }
        this.Q0.o(z13, false);
    }

    public final boolean Q(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.Q(android.view.MotionEvent):boolean");
    }

    public final void Q0(Canvas canvas) {
        jj jjVar;
        float f7;
        jj jjVar2 = this.O5;
        if ((jjVar2 == null || !jjVar2.r4()) && (jjVar = this.O5) != null && !jjVar.o4()) {
            jj jjVar3 = this.O5;
            if (jjVar3.D != 27 && !jjVar3.n4() && this.l1 != null) {
                if (this.f22636m1 || this.f22650n1) {
                    bj bjVar = this.L;
                    if (bjVar != null) {
                        int i10 = bjVar.f14783l;
                        if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                            return;
                        }
                    }
                    canvas.save();
                    float y3 = getY() + getPaddingTop();
                    ej ejVar = this.K;
                    if (ejVar != null && ejVar.d.size() > 1) {
                        f7 = (getTop() + this.K.f15403m.f15244f) - getTranslationY();
                    } else {
                        f7 = y3 + this.gb.f23502k0;
                    }
                    canvas.translate(this.Y6 - getCompactSideMenuShift(), f7 + this.Fc);
                    this.l1.a(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final ImageReceiver Q1(int i10) {
        TLRPC.PollAnswer pollAnswer;
        ih.h hVar;
        ih.h hVar2;
        jj jjVar = this.O5;
        if (jjVar != null && jjVar.D == 17) {
            if (i10 == -2) {
                w1 w1Var = this.f22751v2;
                if (w1Var != null && (hVar2 = w1Var.f23361m) != null) {
                    return hVar2.f8540b;
                }
                return null;
            } else if (i10 == -3) {
                w1 w1Var2 = this.f22751v2;
                if (w1Var2 != null && (hVar = w1Var2.f23362n) != null) {
                    return hVar.f8540b;
                }
                return null;
            } else {
                ArrayList arrayList = this.O4;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        p1 p1Var = (p1) obj;
                        kh.b bVar = p1Var.f22440x;
                        if (bVar != null && (pollAnswer = p1Var.f22436s) != null && pollAnswer.unshuffled_index == i10) {
                            return bVar.f11375c;
                        }
                    }
                }
            }
        }
        n4 n4Var = this.V5;
        if (n4Var != null) {
            ArrayList arrayList2 = n4Var.f22339c;
            l4 l4Var = n4Var.f22338b;
            if (l4Var != null && i10 >= 0 && i10 < l4Var.f22231a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) n4Var.f22338b.f22231a.get(i10);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((m4) arrayList2.get(i12)).E == messageExtendedMedia) {
                        return ((m4) arrayList2.get(i12)).f22303f;
                    }
                }
                return null;
            }
            return null;
        }
        return this.T0;
    }

    public final void Q3() {
        float f7;
        int i10;
        float f10;
        int i11;
        if (!this.O5.N5()) {
            return;
        }
        sg.p0 p0Var = this.N;
        if (!p0Var.f48450p) {
            bj bjVar = this.L;
            if (bjVar != null) {
                int i12 = bjVar.f14783l;
                if ((i12 & 8) == 0 || (i12 & 1) == 0) {
                    return;
                }
            }
            jj jjVar = this.O5;
            int i13 = 0;
            if (jjVar.D != 19 && !jjVar.G2() && !this.O5.M2()) {
                float f11 = 11.0f;
                if (this.O5.P3()) {
                    p0Var.f48439b = org.telegram.messenger.i0.L(11.0f) + getCurrentBackgroundLeft();
                } else if (this.f22772wb) {
                    int L = org.telegram.messenger.i0.L(11.0f) + getCurrentBackgroundLeft();
                    if (!this.J) {
                        i11 = 6;
                    } else {
                        i11 = 0;
                    }
                    int L2 = org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(getVideoTranscriptionProgress(), 0, i11)) + L;
                    p0Var.f48439b = L2;
                    p0Var.f48439b = L2 - ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.i0.L(9.0f)));
                } else {
                    int L3 = org.telegram.messenger.i0.L((this.A6 || !this.J) ? 17.0f : 17.0f) + getCurrentBackgroundLeft();
                    p0Var.f48439b = L3;
                    if (this.A6) {
                        p0Var.f48439b = L3 - org.telegram.messenger.i0.L(9.0f);
                    }
                }
            } else if (this.O5.P3()) {
                p0Var.f48439b = (getMeasuredWidth() - p0Var.f48449o) - org.telegram.messenger.i0.L(16.0f);
            } else {
                p0Var.f48439b = getCurrentBackgroundLeft();
            }
            if (r2()) {
                float compactLeft = getCompactLeft();
                if (q2()) {
                    f10 = this.f22497ad;
                } else if (this.K != null && this.L != null) {
                    f10 = getLeft();
                } else {
                    f10 = 0.0f;
                }
                p0Var.f48439b = (int) (compactLeft - f10);
            }
            if (!this.O5.P3() && this.L != null && !r2()) {
                float f12 = p0Var.f48439b;
                if (V2()) {
                    i10 = 48;
                } else {
                    i10 = 0;
                }
                p0Var.f48439b = (int) (f12 - (org.telegram.messenger.i0.L(64 - i10) * this.X6));
            }
            int backgroundDrawableBottom = (getBackgroundDrawableBottom() - org.telegram.messenger.i0.L(10.0f)) - p0Var.f48447m;
            p0Var.f48440c = backgroundDrawableBottom;
            if (this.f22756v7) {
                if (r2()) {
                    i13 = getCommentButtonHeight();
                } else {
                    if (this.O5.D == 29 && a2()) {
                        f7 = 28.0f;
                    } else {
                        f7 = 43.0f;
                    }
                    i13 = org.telegram.messenger.i0.L(f7);
                }
            }
            int i14 = backgroundDrawableBottom - i13;
            p0Var.f48440c = i14;
            if (this.f22491a7 && (!this.f22694q9 || !this.P1 || this.K1 != 3)) {
                p0Var.f48440c = i14 - org.telegram.messenger.i0.L(16.0f);
            }
            jj jjVar2 = this.O5;
            int i15 = jjVar2.D;
            if (i15 != 9 && this.f22615k3 != null && ((i15 != 2 && i15 != 17 && (!jjVar2.N3() || !this.f22694q9 || this.M1)) || ((this.L != null && this.K != null) || this.O5.D == 29))) {
                p0Var.f48440c -= org.telegram.messenger.i0.L(14.0f);
            }
            p0Var.f48440c += p0Var.f48445k;
        }
    }

    public final boolean R(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        int i12;
        jj jjVar;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        int i13;
        int i14;
        int i15;
        int i16;
        int L;
        int L2;
        int i17;
        CharSequence charSequence;
        int i18;
        int w02;
        jj jjVar2;
        int i19 = this.O5.D;
        if ((i19 == 0 || i19 == 24) && this.P1) {
            t1 B1 = B1();
            q1 q1Var = B1.f23065a;
            jj jjVar3 = q1Var.O5;
            RadialProgress2 radialProgress2 = q1Var.P0;
            ji.a aVar = q1Var.f22715s4;
            ag.c2 c2Var = q1Var.T0;
            int[] iArr = q1Var.L2;
            Drawable[] drawableArr = q1Var.H2;
            int i20 = jjVar3.D;
            if ((i20 == 0 || i20 == 24) && q1Var.P1) {
                int x10 = (int) motionEvent.getX();
                int K1 = (int) q1Var.K1(motionEvent);
                int i21 = q1Var.f22662o0;
                if (x10 >= i21 && x10 <= (i21 + q1Var.Z6) - org.telegram.messenger.i0.L(14.0f) && K1 >= (i10 = q1Var.f22675p0)) {
                    int i22 = i10 + q1Var.U1;
                    if (q1Var.f22713s2) {
                        i11 = 46;
                    } else {
                        i11 = 0;
                    }
                    if (K1 <= org.telegram.messenger.i0.L(i11 + 8) + i22) {
                        if (motionEvent.getAction() == 0) {
                            if (q1Var.f22651n2 != null && K1 >= q1Var.W1 && !q1Var.O5.f16365r1) {
                                try {
                                    int L3 = x10 - ((q1Var.f22662o0 + org.telegram.messenger.i0.L(10.0f)) + q1Var.Y1);
                                    int i23 = K1 - q1Var.W1;
                                    if (i23 <= q1Var.f22651n2.getHeight()) {
                                        int lineForVertical = q1Var.f22651n2.getLineForVertical(i23);
                                        float f7 = L3;
                                        int offsetForHorizontal = q1Var.f22651n2.getOffsetForHorizontal(lineForVertical, f7);
                                        float lineLeft = q1Var.f22651n2.getLineLeft(lineForVertical);
                                        if (lineLeft <= f7 && lineLeft + q1Var.f22651n2.getLineWidth(lineForVertical) >= f7) {
                                            if (q1Var.O5.r4()) {
                                                charSequence = q1Var.O5.v;
                                            } else {
                                                charSequence = q1Var.O5.f16390y;
                                            }
                                            Spannable spannable = (Spannable) charSequence;
                                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                            if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[0] instanceof b51) || b51.h) && !org.telegram.messenger.i0.C1())) {
                                                q80 q80Var = q1Var.f22679p4;
                                                if (q80Var == null || q80Var.f29568i != clickableSpanArr[0]) {
                                                    aVar.m(q80Var, true);
                                                    q80 q80Var2 = new q80(clickableSpanArr[0], q1Var.Ob, x10, K1, 0);
                                                    q1Var.f22679p4 = q80Var2;
                                                    if (q1Var.P1 && q1Var.f22643m8 != null && (jjVar2 = q1Var.O5) != null && !jjVar2.P3()) {
                                                        w02 = org.telegram.ui.ActionBar.t6.r1(0.1f, q1Var.f22643m8.i());
                                                    } else {
                                                        if (q1Var.O5.P3()) {
                                                            i18 = org.telegram.ui.ActionBar.t6.Ac;
                                                        } else {
                                                            i18 = org.telegram.ui.ActionBar.t6.f21336ze;
                                                        }
                                                        w02 = org.telegram.ui.ActionBar.t6.w0(i18, q1Var.Ob);
                                                    }
                                                    q80Var2.d(w02);
                                                    q1Var.f22775x0 = -10;
                                                    q1Var.f22728t4 = 2;
                                                    q1Var.w();
                                                    try {
                                                        k80 b10 = q1Var.f22679p4.b();
                                                        int[] U1 = U1(spannable, q1Var.f22679p4.f29568i);
                                                        b10.d(q1Var.f22651n2, U1[0], 0.0f);
                                                        q1Var.f22651n2.getSelectionPath(U1[0], U1[1], b10);
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                    }
                                                    aVar.b(q1Var.f22679p4, 2);
                                                }
                                                q1Var.invalidate();
                                                return true;
                                            }
                                        }
                                    }
                                } catch (Exception e7) {
                                    org.telegram.messenger.f8.g(e7, true);
                                }
                            }
                            if (q1Var.f22679p4 == null) {
                                int L4 = org.telegram.messenger.i0.L(48.0f);
                                if (q1Var.V3 >= 0 && x10 >= (L2 = q1Var.I3 + (L = org.telegram.messenger.i0.L(27.0f))) && x10 <= L2 + L4 && K1 >= (i17 = q1Var.J3 + L) && K1 <= i17 + L4) {
                                    q1Var.P3 = 1;
                                    q1Var.invalidate();
                                    return true;
                                }
                                if (q1Var.f22776x1 && q1Var.M3 != -1 && x10 >= (i15 = q1Var.K3)) {
                                    if (x10 <= Math.max(q1Var.A3, q1Var.f22529d3) + org.telegram.messenger.i0.L(34.0f) + i15 && K1 >= (i16 = q1Var.L3) && K1 <= org.telegram.messenger.i0.L(30.0f) + i16) {
                                        q1Var.O3 = 1;
                                        q1Var.invalidate();
                                        return true;
                                    }
                                }
                                if ((q1Var.M1 && q1Var.O5.Y0 != null && c2Var.O(x10, K1)) || (q1Var.M1 && q1Var.f22763w1 && ((q1Var.M3 != -1 || q1Var.K1 == 4) && ((!q1Var.H3 && c2Var.O(x10, K1)) || (x10 >= (i13 = q1Var.I3) && x10 <= org.telegram.messenger.i0.L(48.0f) + i13 && K1 >= (i14 = q1Var.J3) && K1 <= org.telegram.messenger.i0.L(48.0f) + i14 && radialProgress2.f24128i.f26933q != 4))))) {
                                    q1Var.N3 = 1;
                                    q1Var.invalidate();
                                    TLRPC.MessageMedia messageMedia = q1Var.O5.Y0;
                                    if (messageMedia == null) {
                                        return true;
                                    }
                                    if (!jj.s3(messageMedia.document, false) && q1Var.O5.Y0.photo == null) {
                                        return true;
                                    }
                                    Drawable drawable = drawableArr[0];
                                    if (drawable != null && drawable.getBounds().contains(x10, K1)) {
                                        drawableArr[0].setHotspot(x10, K1);
                                        drawableArr[0].setState(iArr);
                                    }
                                    y yVar = B1.f23084x;
                                    if (yVar != null && yVar.getBounds().contains(x10, K1)) {
                                        B1.f23084x.setHotspot(x10, K1);
                                        B1.f23084x.setState(iArr);
                                    }
                                    q1Var.setInstantButtonPressed(true);
                                    dc dcVar = B1.f23083w;
                                    if (dcVar == null) {
                                        return true;
                                    }
                                    dcVar.c(true);
                                    return true;
                                }
                                q1Var.D2 = true;
                                q1Var.J2[0] = 0;
                                Drawable drawable2 = drawableArr[0];
                                if (drawable2 != null && drawable2.getBounds().contains(x10, K1)) {
                                    drawableArr[0].setHotspot(x10, K1);
                                    drawableArr[0].setState(iArr);
                                }
                                y yVar2 = B1.f23084x;
                                if (yVar2 != null && yVar2.getBounds().contains(x10, K1)) {
                                    B1.f23084x.setHotspot(x10, K1);
                                    B1.f23084x.setState(iArr);
                                }
                                q1Var.setInstantButtonPressed(true);
                                dc dcVar2 = B1.f23083w;
                                if (dcVar2 != null) {
                                    dcVar2.c(true);
                                }
                                q1Var.invalidate();
                                return true;
                            }
                        } else {
                            if (motionEvent.getAction() == 1) {
                                if (q1Var.D2) {
                                    int i24 = q1Var.K1;
                                    if (i24 == 7) {
                                        if (MediaController.B().I(q1Var.O5) && !MediaController.B().H()) {
                                            MediaController.B().R(q1Var.O5, true);
                                        } else {
                                            q1Var.Qa.A1(q1Var, q1Var.O5);
                                        }
                                    } else if (!q1Var.f22713s2 && ((jjVar = q1Var.O5) == null || (tL_channelAdminLogEvent = jjVar.J1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage))) {
                                        if (q1Var.M1 && (i24 == 2 || i24 == 4 || (B1.f23070i == null && q1Var.f22637m2 == null && q1Var.f22651n2 == null && q1Var.f22542e2 == null))) {
                                            l1 l1Var = q1Var.Qa;
                                            if (l1Var != null) {
                                                l1Var.s0(q1Var, q1Var.f22565g1, q1Var.f22576h1, true);
                                            }
                                        } else if (jjVar != null && !jjVar.f16365r1) {
                                            TLRPC.WebPage webPage = jj.o1(jjVar.f16337k).webpage;
                                            if (webPage != null && !TextUtils.isEmpty(webPage.embed_url)) {
                                                l1 l1Var2 = q1Var.Qa;
                                                if (l1Var2 != null) {
                                                    l1Var2.z1(q1Var.O5, webPage.embed_url, webPage.site_name, webPage.title, webPage.url, webPage.embed_width, webPage.embed_height);
                                                }
                                            } else if (webPage != null) {
                                                l1 l1Var3 = q1Var.Qa;
                                                if (l1Var3 != null) {
                                                    l1Var3.w1(q1Var, webPage, webPage.url, jj.o1(q1Var.O5.f16337k).safe);
                                                } else {
                                                    gf.f.r(q1Var.getContext(), webPage.url);
                                                }
                                            }
                                        }
                                    } else {
                                        l1 l1Var4 = q1Var.Qa;
                                        if (l1Var4 != null) {
                                            l1Var4.c1(q1Var, q1Var.f22764w2);
                                        }
                                    }
                                    q1Var.playSoundEffect(0);
                                    Drawable drawable3 = drawableArr[0];
                                    if (drawable3 != null) {
                                        drawable3.setState(StateSet.NOTHING);
                                    }
                                    y yVar3 = B1.f23084x;
                                    if (yVar3 != null) {
                                        yVar3.setState(StateSet.NOTHING);
                                    }
                                    dc dcVar3 = B1.f23083w;
                                    if (dcVar3 != null) {
                                        dcVar3.c(false);
                                    }
                                    q1Var.D2 = false;
                                    q1Var.setInstantButtonPressed(false);
                                    q1Var.invalidate();
                                } else if (q1Var.f22728t4 != 2 && q1Var.N3 == 0 && q1Var.P3 == 0 && q1Var.O3 == 0) {
                                    if (!q1Var.f22799yc) {
                                        z11 = false;
                                        q1Var.f22799yc = false;
                                        q1Var.b3(2);
                                        z10 = z11;
                                    }
                                } else {
                                    z11 = false;
                                    if (q1Var.O3 == 1) {
                                        q1Var.O3 = 0;
                                        q1Var.playSoundEffect(0);
                                        q1Var.C0(true);
                                        q1Var.invalidate();
                                    } else if (q1Var.N3 != 0) {
                                        q1Var.N3 = 0;
                                        q1Var.playSoundEffect(0);
                                        if (q1Var.f22776x1 || ((q1Var.M3 == -1 && q1Var.K1 == 4) || q1Var.O5.Y0 != null)) {
                                            z11 = false;
                                            q1Var.B0();
                                        } else {
                                            z11 = false;
                                            q1Var.C0(false);
                                        }
                                        q1Var.invalidate();
                                    } else if (q1Var.P3 != 0) {
                                        q1Var.P3 = 0;
                                        q1Var.playSoundEffect(0);
                                        q1Var.D0();
                                        q1Var.invalidate();
                                    } else {
                                        q80 q80Var3 = q1Var.f22679p4;
                                        if (q80Var3 != null) {
                                            CharacterStyle characterStyle = q80Var3.f29568i;
                                            if (characterStyle instanceof URLSpan) {
                                                q1Var.Qa.L0(q1Var, characterStyle, false);
                                            } else if (characterStyle instanceof ClickableSpan) {
                                                ((ClickableSpan) characterStyle).onClick(q1Var);
                                            }
                                            q1Var.b3(2);
                                        } else {
                                            org.telegram.ui.Components.o5 o5Var = q1Var.f22666o4;
                                            if (o5Var != null && q1Var.Qa.m0(o5Var)) {
                                                q1Var.f22666o4 = null;
                                                q1Var.b3(2);
                                            } else {
                                                if (q1Var.K1 == 2 && q1Var.f22763w1) {
                                                    int i25 = q1Var.M3;
                                                    if (i25 == -1) {
                                                        int i26 = tz.f18131a;
                                                        if (sc.e(2048) && !q1Var.O5.f16328h2) {
                                                            q1Var.Qa.s0(q1Var, q1Var.f22565g1, q1Var.f22576h1, false);
                                                        } else {
                                                            i12 = 2;
                                                            q1Var.M3 = 2;
                                                            q1Var.O5.f16317f0 = 1.0f;
                                                            c2Var.f14408t0 = false;
                                                            c2Var.Q0();
                                                            radialProgress2.setIcon(q1Var.getIconForCurrentState(), false, true);
                                                            q1Var.invalidate();
                                                            q1Var.playSoundEffect(0);
                                                            q1Var.b3(i12);
                                                            return true;
                                                        }
                                                    } else if (i25 == 2 || i25 == 0) {
                                                        q1Var.C0(false);
                                                        q1Var.playSoundEffect(0);
                                                    }
                                                } else {
                                                    jj jjVar4 = q1Var.O5;
                                                    if (!jjVar4.f16365r1) {
                                                        TLRPC.WebPage webPage2 = jj.o1(jjVar4.f16337k).webpage;
                                                        if (webPage2 != null && !TextUtils.isEmpty(webPage2.embed_url)) {
                                                            q1Var.Qa.z1(q1Var.O5, webPage2.embed_url, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_width, webPage2.embed_height);
                                                        } else {
                                                            int i27 = q1Var.M3;
                                                            if (i27 != -1 && i27 != 3) {
                                                                if (webPage2 != null) {
                                                                    l1 l1Var5 = q1Var.Qa;
                                                                    if (l1Var5 != null) {
                                                                        l1Var5.w1(q1Var, webPage2, webPage2.url, jj.o1(q1Var.O5.f16337k).safe);
                                                                    } else {
                                                                        gf.f.r(q1Var.getContext(), webPage2.url);
                                                                    }
                                                                }
                                                            } else {
                                                                q1Var.Qa.s0(q1Var, q1Var.f22565g1, q1Var.f22576h1, false);
                                                                q1Var.playSoundEffect(0);
                                                            }
                                                        }
                                                    }
                                                }
                                                i12 = 2;
                                                q1Var.b3(i12);
                                                return true;
                                            }
                                        }
                                    }
                                    z10 = z11;
                                }
                            } else {
                                z10 = false;
                                if (motionEvent.getAction() == 2 && q1Var.E2) {
                                    Drawable drawable4 = drawableArr[0];
                                    if (drawable4 != null) {
                                        drawable4.setHotspot(x10, K1);
                                    }
                                    y yVar4 = B1.f23084x;
                                    if (yVar4 != null) {
                                        yVar4.setHotspot(x10, K1);
                                    }
                                }
                            }
                            return z10;
                        }
                        z10 = false;
                        return z10;
                    }
                }
                z10 = false;
                return z10;
            }
        }
        return false;
    }

    public final void R0(Canvas canvas, boolean z10, boolean z11, float f7, float f10, float f11, float f12, float f13, boolean z12) {
        boolean z13;
        float L;
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
        x1 x1Var = this.gb;
        sg.p0 p0Var = this.N;
        if (z10) {
            if (!this.O5.P3()) {
                qb0 qb0Var = org.telegram.ui.ActionBar.t6.E3;
                if (B3()) {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21008hd, this.Ob);
                } else {
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.t6.Cb;
                    } else {
                        i10 = org.telegram.ui.ActionBar.t6.f21008hd;
                    }
                    w02 = org.telegram.ui.ActionBar.t6.w0(i10, this.Ob);
                }
                qb0Var.a(w02);
                if (B3()) {
                    f15 = (getPhotoBottom() + this.f22749v0) - org.telegram.messenger.i0.L(9.0f);
                } else {
                    if (!this.F && !this.E) {
                        f14 = 8.5f;
                    } else {
                        f14 = 9.5f;
                    }
                    float L2 = (f7 - org.telegram.messenger.i0.L(f14)) + f11;
                    if (this.f22772wb && !r2()) {
                        if (this.J) {
                            f16 = 4.0f;
                        } else {
                            f16 = 5.0f;
                        }
                        f15 = L2 - ((1.0f - getVideoTranscriptionProgress()) * (p0Var.i(x1Var.L1) + org.telegram.messenger.i0.L(f16)));
                    } else {
                        f15 = L2;
                    }
                }
                if (!this.O5.f16357p1) {
                    i11 = org.telegram.messenger.i0.L(11.0f);
                }
                z.u(qb0Var, f12 + i11, f15 - org.telegram.messenger.i0.L(12.0f));
                qb0Var.setAlpha((int) (f18 * 255.0f));
                if (z13) {
                    canvas.save();
                    canvas.scale(f17, f17, qb0Var.getBounds().centerX(), qb0Var.getBounds().centerY());
                }
                qb0Var.draw(canvas);
                qb0Var.setAlpha(255);
                invalidate();
                if (z13) {
                    canvas.restore();
                }
            }
        } else if (z11 && !this.O5.P3()) {
            if (!this.O5.f16357p1) {
                i11 = org.telegram.messenger.i0.L(11.0f);
            }
            float f19 = f12 + i11;
            float f20 = 21.5f;
            if (B3()) {
                L = (getPhotoBottom() + this.f22749v0) - org.telegram.messenger.i0.L(21.5f);
            } else {
                if (!this.F && !this.E) {
                    f20 = 20.5f;
                }
                L = (f7 - org.telegram.messenger.i0.L(f20)) + f11;
                if (this.f22772wb) {
                    L -= (1.0f - getVideoTranscriptionProgress()) * p0Var.i(x1Var.L1);
                }
            }
            RectF rectF = this.f22488a4;
            rectF.set(f19, L, org.telegram.messenger.i0.L(14.0f) + f19, org.telegram.messenger.i0.L(14.0f) + L);
            int alpha = org.telegram.ui.ActionBar.t6.f20887b2.getAlpha();
            int i12 = (int) (f18 * 255.0f);
            org.telegram.ui.ActionBar.t6.f20887b2.setAlpha(i12);
            if (z13) {
                canvas.save();
                canvas.scale(f17, f17, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.f20887b2);
            org.telegram.ui.ActionBar.t6.f20887b2.setAlpha(alpha);
            Drawable W1 = W1("drawableMsgError");
            z.u(W1, f19 + org.telegram.messenger.i0.L(6.0f), L + org.telegram.messenger.i0.L(2.0f));
            W1.setAlpha(i12);
            W1.draw(canvas);
            W1.setAlpha(255);
            if (z13) {
                canvas.restore();
            }
        }
    }

    public final float R1(int i10) {
        p1 p1Var;
        if (i10 >= 0) {
            ArrayList arrayList = this.O4;
            if (i10 < arrayList.size()) {
                int i11 = ((p1) arrayList.get(i10)).f22422b;
                int i12 = this.Sa;
                float f7 = i11 + i12;
                x1 x1Var = this.gb;
                if (x1Var.f23545u2) {
                    float f10 = x1Var.L1;
                    f7 += ((1.0f - f10) * x1Var.f23548v2) + (i12 * f10);
                    if (this.O5.n5()) {
                        f7 -= this.Sa;
                    }
                }
                if (x1Var.f23554x0) {
                    f7 += x1Var.f23502k0;
                }
                return f7 + p1Var.f22423c + org.telegram.messenger.i0.L(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void R3(jj jjVar) {
        String str;
        CharSequence concat;
        int i10;
        if (jjVar != null && jjVar.m5()) {
            int i11 = 0;
            if (!jjVar.l4()) {
                concat = null;
            } else {
                TLRPC.Message message = jjVar.f16337k;
                int i12 = message.ttl;
                if (i12 == Integer.MAX_VALUE) {
                    if (jjVar.T2 == null) {
                        jjVar.T2 = new SpannableString("v");
                        dq dqVar = new dq(2131231978, 0);
                        dqVar.f25508r = -org.telegram.messenger.i0.L(3.0f);
                        dqVar.E = org.telegram.messenger.i0.L(13.0f);
                        SpannableString spannableString = jjVar.T2;
                        spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
                    }
                    concat = TextUtils.concat(jjVar.T2, "1");
                } else {
                    int i13 = message.destroyTime;
                    if (i13 != 0) {
                        i12 = Math.max(0, i13 - ConnectionsManager.getInstance(jjVar.I1).getCurrentTime());
                    }
                    if (i12 < 60) {
                        str = a1.g.k(i12, "s");
                    } else {
                        str = (i12 / 60) + "m";
                    }
                    if (jjVar.U2 == null) {
                        jjVar.U2 = new SpannableString("p");
                        dq dqVar2 = new dq(2131232546, 0);
                        dqVar2.f25508r = org.telegram.messenger.i0.L(1.0f);
                        dqVar2.E = org.telegram.messenger.i0.L(13.0f);
                        SpannableString spannableString2 = jjVar.U2;
                        spannableString2.setSpan(dqVar2, 0, spannableString2.length(), 33);
                    }
                    concat = TextUtils.concat(jjVar.U2, str);
                }
            }
            CharSequence charSequence = concat;
            if (charSequence != null) {
                if (charSequence instanceof String) {
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.t6.C2.measureText((String) charSequence));
                    this.A3 = ceil;
                    this.f22752v3 = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.t6.C2, ceil, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.t6.C2, this.A3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else {
                    TextPaint textPaint = org.telegram.ui.ActionBar.t6.D2;
                    if (getMeasuredWidth() > 0) {
                        i10 = getMeasuredWidth();
                    } else {
                        i10 = 9999;
                    }
                    StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.f22752v3 = staticLayout;
                    if (staticLayout.getLineCount() > 0) {
                        i11 = (int) this.f22752v3.getLineWidth(0);
                    }
                    this.A3 = i11;
                }
                invalidate();
            }
        }
    }

    public final boolean S() {
        return org.telegram.messenger.b8.G(this.Y5).k(getFilename());
    }

    public final void S0(Canvas canvas, float f7) {
        int i10;
        if (this.D8 == 3) {
            int L = org.telegram.messenger.i0.L(32.0f);
            if (this.f22630l7 != null) {
                this.Q8 -= org.telegram.messenger.i0.L(18.0f);
                L += org.telegram.messenger.i0.L(18.0f);
            }
            float f10 = this.P8;
            float f11 = this.Q8 + L;
            RectF rectF = this.f22488a4;
            rectF.set(f10, this.Q8, org.telegram.messenger.i0.L(32.0f) + f10, f11);
            z();
            int i11 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            String str = "paintChatActionBackground";
            if (i11 != 0) {
                int alpha = X1("paintChatActionBackground").getAlpha();
                X1("paintChatActionBackground").setAlpha((int) (alpha * f7));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), X1("paintChatActionBackground"));
                X1("paintChatActionBackground").setAlpha(alpha);
            } else {
                float L2 = org.telegram.messenger.i0.L(16.0f);
                float L3 = org.telegram.messenger.i0.L(16.0f);
                if (this.G8) {
                    str = "paintChatActionBackgroundSelected";
                }
                canvas.drawRoundRect(rectF, L2, L3, X1(str));
            }
            if (e2()) {
                if (i11 != 0) {
                    int alpha2 = org.telegram.ui.ActionBar.t6.f20998h2.getAlpha();
                    org.telegram.ui.ActionBar.t6.f20998h2.setAlpha((int) (alpha2 * f7));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.f20998h2);
                    org.telegram.ui.ActionBar.t6.f20998h2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.f20998h2);
                }
            }
            Drawable R0 = org.telegram.ui.ActionBar.t6.R0("drawableCommentSticker");
            if (r2()) {
                if (this.Hc == null) {
                    this.Hc = R0.getConstantState().newDrawable().mutate();
                }
                this.Hc.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ta, this.Ob), PorterDuff.Mode.SRC_IN));
                R0 = this.Hc;
            }
            z.u(R0, this.P8 + org.telegram.messenger.i0.L(4.0f), this.Q8 + org.telegram.messenger.i0.L(4.0f));
            if (i11 != 0) {
                R0.setAlpha((int) (f7 * 255.0f));
                R0.draw(canvas);
                R0.setAlpha(255);
            } else {
                R0.draw(canvas);
            }
            if (this.f22630l7 != null) {
                TextPaint textPaint = org.telegram.ui.ActionBar.t6.E2;
                if (r2()) {
                    i10 = org.telegram.ui.ActionBar.t6.Ta;
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.Ld;
                }
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i10, this.Ob));
                org.telegram.ui.ActionBar.t6.E2.setAlpha((int) (f7 * 255.0f));
                x1 x1Var = this.gb;
                if (x1Var.V) {
                    if (x1Var.W != null) {
                        canvas.save();
                        org.telegram.ui.ActionBar.t6.E2.setAlpha((int) ((1.0d - x1Var.L1) * 255.0d * f7));
                        canvas.translate(this.P8 + ((org.telegram.messenger.i0.L(32.0f) - x1Var.Y) / 2), this.Q8 + org.telegram.messenger.i0.L(30.0f));
                        x1Var.W.draw(canvas);
                        canvas.restore();
                    }
                    org.telegram.ui.ActionBar.t6.E2.setAlpha((int) (x1Var.L1 * 255.0f));
                }
                canvas.save();
                canvas.translate(this.P8 + ((org.telegram.messenger.i0.L(32.0f) - this.f22731t7) / 2), this.Q8 + org.telegram.messenger.i0.L(30.0f));
                this.f22630l7.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final float S1(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.O4;
            if (i10 < arrayList.size()) {
                int i11 = ((p1) arrayList.get(i10)).f22422b;
                int i12 = this.Sa;
                float f7 = i11 + i12;
                x1 x1Var = this.gb;
                if (x1Var.f23545u2) {
                    float f10 = x1Var.L1;
                    f7 += ((1.0f - f10) * x1Var.f23548v2) + (i12 * f10);
                    if (this.O5.n5()) {
                        f7 -= this.Sa;
                    }
                }
                if (x1Var.f23554x0) {
                    f7 += x1Var.f23502k0;
                }
                return f7 - org.telegram.messenger.i0.L(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public nh.h S2() {
        return nh.h.e(this);
    }

    public final void S3() {
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
        if (this.P1) {
            i10 = 10;
        } else {
            i10 = 0;
        }
        int i20 = -org.telegram.messenger.i0.L(i10 + 92);
        x1 x1Var = this.gb;
        boolean z10 = x1Var.f23554x0;
        i1 i1Var = this.B4;
        qn0 qn0Var = this.C4;
        float f10 = 10.0f;
        if (z10 && ((i15 = this.K1) == 3 || i15 == 7)) {
            int i21 = this.Z6;
            float f11 = i21;
            int i22 = (int) ((f11 - x1Var.f23507l0) + x1Var.m0);
            int i23 = (int) ((f11 - x1Var.f23487h0) + x1Var.f23492i0);
            if (this.f22772wb && !this.G6) {
                i23 = (int) ((getVideoTranscriptionProgress() * org.telegram.messenger.i0.L(8.0f)) + i23);
                i22 += org.telegram.messenger.i0.L(8.0f);
            }
            if (x1Var.f23507l0 == 0.0f && x1Var.m0 == 0.0f) {
                i22 = i23;
            }
            if (qn0Var != null) {
                if (x1Var.f23520o1) {
                    int L = (i23 + i20) - ((int) (org.telegram.messenger.i0.L(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.P1) {
                        f10 = 0.0f;
                    }
                    int L2 = L - org.telegram.messenger.i0.L(f10);
                    int L3 = org.telegram.messenger.i0.L(30.0f);
                    int i24 = i21 + i20;
                    if (!this.G4) {
                        i18 = -org.telegram.messenger.i0.L(34.0f);
                    } else {
                        i18 = 0;
                    }
                    int i25 = i24 + i18;
                    int i26 = i22 + i20;
                    if (this.G4) {
                        i19 = -org.telegram.messenger.i0.L(34.0f);
                    } else {
                        i19 = 0;
                    }
                    qn0Var.h(L2, L3, i25, i26 + i19);
                } else {
                    int L4 = (i23 + i20) - ((int) (org.telegram.messenger.i0.L(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.P1) {
                        f10 = 0.0f;
                    }
                    qn0Var.h(L4 - org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(30.0f), (i21 + i20) - ((int) (org.telegram.messenger.i0.L(34.0f) * getUseTranscribeButtonProgress())), (i22 + i20) - ((int) (org.telegram.messenger.i0.L(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            if (i1Var != null) {
                int useTranscribeButtonProgress = i23 - ((int) (getUseTranscribeButtonProgress() * org.telegram.messenger.i0.L(34.0f)));
                if (this.K1 == 5) {
                    i16 = 65;
                } else {
                    i16 = 72;
                }
                if (this.P1) {
                    i17 = 20;
                } else {
                    i17 = 0;
                }
                i1Var.i(useTranscribeButtonProgress - org.telegram.messenger.i0.L(i16 + i17), org.telegram.messenger.i0.L(30.0f));
                return;
            }
            return;
        }
        if (qn0Var != null) {
            if (x1Var.f23520o1) {
                int L5 = (this.Z6 + i20) - ((int) (org.telegram.messenger.i0.L(34.0f) * getUseTranscribeButtonProgress()));
                if (this.P1) {
                    f7 = 10.0f;
                } else {
                    f7 = 0.0f;
                }
                int L6 = L5 - org.telegram.messenger.i0.L(f7);
                int L7 = org.telegram.messenger.i0.L(30.0f);
                int i27 = this.Z6 + i20;
                if (!this.G4) {
                    i13 = -org.telegram.messenger.i0.L(34.0f);
                } else {
                    i13 = 0;
                }
                int i28 = i27 + i13;
                if (!this.P1) {
                    f10 = 0.0f;
                }
                int L8 = i28 - org.telegram.messenger.i0.L(f10);
                int i29 = this.Z6 + i20;
                if (this.G4) {
                    i14 = -org.telegram.messenger.i0.L(34.0f);
                } else {
                    i14 = 0;
                }
                qn0Var.h(L6, L7, L8, i29 + i14);
            } else {
                int L9 = (this.Z6 + i20) - ((int) (org.telegram.messenger.i0.L(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.P1) {
                    f10 = 0.0f;
                }
                int L10 = L9 - org.telegram.messenger.i0.L(f10);
                qn0Var.h(L10, org.telegram.messenger.i0.L(30.0f), L10, L10);
            }
        }
        if (i1Var != null) {
            int useTranscribeButtonProgress2 = this.Z6 - ((int) (getUseTranscribeButtonProgress() * org.telegram.messenger.i0.L(34.0f)));
            if (this.K1 == 5) {
                i11 = 65;
            } else {
                i11 = 72;
            }
            if (this.P1) {
                i12 = 20;
            } else {
                i12 = 0;
            }
            i1Var.i(useTranscribeButtonProgress2 - org.telegram.messenger.i0.L(i11 + i12), org.telegram.messenger.i0.L(30.0f));
        }
    }

    public final boolean T(MotionEvent motionEvent) {
        y yVar;
        q1 q1Var;
        l1 l1Var;
        TLRPC.Chat chat;
        int i10;
        TLRPC.Chat chat2;
        if (this.f22596i9 && this.T8 != null && (yVar = this.T2) != null && (this.ha != null || this.ia != null)) {
            boolean contains = yVar.getBounds().contains((int) motionEvent.getX(), (int) K1(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.U2 = contains;
                if (contains) {
                    this.T2.setHotspot((int) motionEvent.getX(), (int) K1(motionEvent));
                    this.T2.setState(this.L2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.U2 && (l1Var = this.Qa) != null) {
                    if (this.Q6) {
                        TLRPC.User user = this.f22708ra;
                        if (user != null && user.bot_inline_placeholder == null) {
                            l1Var.S1(this, user.f19942id);
                        } else {
                            String n10 = h20.n(user);
                            l1 l1Var2 = this.Qa;
                            if (n10 == null) {
                                n10 = this.O5.f16337k.via_bot_name;
                            }
                            l1Var2.l0(n10);
                        }
                    } else {
                        TLRPC.User user2 = this.ha;
                        if (user2 != null) {
                            l1Var.r0(this, user2, motionEvent.getX(), K1(motionEvent));
                        } else {
                            TLRPC.Chat chat3 = this.ia;
                            if (chat3 != null) {
                                TLRPC.MessageFwdHeader messageFwdHeader = this.O5.f16337k.fwd_from;
                                if (messageFwdHeader != null) {
                                    int i11 = messageFwdHeader.channel_post;
                                    chat = this.f22721sa;
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
                                q1Var = this;
                                l1Var.T(q1Var, chat2, i10, this.f22565g1, this.f22576h1, false);
                                q1Var.T2.setState(StateSet.NOTHING);
                                q1Var.U2 = false;
                                return q1Var.U2;
                            }
                        }
                    }
                }
                q1Var = this;
                q1Var.T2.setState(StateSet.NOTHING);
                q1Var.U2 = false;
                return q1Var.U2;
            }
            q1Var = this;
            return q1Var.U2;
        }
        this.U2 = false;
        return false;
    }

    public final void T0(android.graphics.Canvas r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.T0(android.graphics.Canvas, float):void");
    }

    public final int T1(byte[] bArr) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O4;
            if (i10 < arrayList.size()) {
                TLRPC.PollAnswer pollAnswer = ((p1) arrayList.get(i10)).f22436s;
                if (pollAnswer != null && Arrays.equals(pollAnswer.option, bArr)) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void T2(org.telegram.messenger.jj r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.T2(org.telegram.messenger.jj):void");
    }

    public final void T3() {
        char c10;
        int L;
        int extraTextX;
        int i10;
        int i11;
        int L2;
        int i12;
        if (getDelegate() != null && getDelegate().g2() != null && getDelegate().g2().z(this.O5)) {
            l9 g22 = getDelegate().g2();
            int i13 = 0;
            if (g22.f22260q0) {
                c10 = 2;
            } else if (g22.f22262s0) {
                c10 = 3;
            } else if (g22.f22264u0) {
                c10 = 4;
            } else if (a2()) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            if (c10 == 2) {
                if (this.R1) {
                    i12 = this.f22662o0 - org.telegram.messenger.i0.L(10.0f);
                } else {
                    if (this.S1) {
                        i11 = this.f22662o0;
                        L2 = org.telegram.messenger.i0.L(1.0f);
                    } else {
                        i11 = this.f22662o0;
                        L2 = org.telegram.messenger.i0.L(1.0f);
                    }
                    i12 = i11 + L2;
                }
                getDelegate().g2().c0(org.telegram.messenger.i0.L(10.0f) + i12 + this.Y1, this.W1);
            } else if (c10 == 1) {
                L3();
                getDelegate().g2().c0((int) this.f22689q3, (int) this.f22701r3);
            } else if (c10 == 3) {
                ej ejVar = this.K;
                if (ejVar != null && !ejVar.f15399i) {
                    i10 = (int) this.f22689q3;
                } else {
                    float f7 = 12.0f;
                    if (this.O5.P3()) {
                        i10 = getExtraTextX() + org.telegram.messenger.i0.L(12.0f) + this.L6;
                        if (this.O5.D == 19) {
                            i10 -= Math.max(0, (org.telegram.messenger.i0.L(14.0f) + (Math.max(this.V7, this.X7) + i10)) - org.telegram.messenger.i0.f16026q.x);
                        }
                    } else {
                        if (this.A6) {
                            L = org.telegram.messenger.i0.L(12.0f) + this.L6;
                            extraTextX = getExtraTextX();
                        } else {
                            int i14 = this.L6;
                            if (!this.J) {
                                f7 = 18.0f;
                            }
                            L = org.telegram.messenger.i0.L(f7) + i14;
                            extraTextX = getExtraTextX();
                        }
                        i10 = extraTextX + L;
                    }
                }
                int L3 = ((int) (i10 + this.gb.f23487h0)) - org.telegram.messenger.i0.L(1.33f);
                int i15 = this.f22686q0;
                L3();
                l9 g23 = getDelegate().g2();
                int L4 = org.telegram.messenger.i0.L(10.0f) + L3;
                s1 s1Var = this.f22698r0;
                if (s1Var != null) {
                    i13 = s1Var.f22976o;
                }
                g23.c0(L4 - i13, org.telegram.messenger.i0.L(22.0f) + i15);
            } else {
                getDelegate().g2().c0(this.f22649n0, this.f22724t0);
            }
        }
    }

    public final boolean U(MotionEvent motionEvent) {
        l1 l1Var;
        TLRPC.User user;
        TLRPC.Document document;
        if (this.f22596i9 && this.T8 != null && this.T2 != null && ((this.ha != null || this.ia != null) && this.f22633la != null && this.f22672oa != null)) {
            boolean contains = this.Z2.getBounds().contains((int) motionEvent.getX(), (int) K1(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.f22487a3 = contains;
                if (contains) {
                    this.Z2.setHotspot((int) motionEvent.getX(), (int) K1(motionEvent));
                    this.Z2.setState(this.L2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.f22487a3 && (l1Var = this.Qa) != null && (user = this.ha) != null) {
                    Drawable drawable = this.f22672oa.f25301f[0];
                    if (drawable instanceof org.telegram.ui.Components.f5) {
                        document = ((org.telegram.ui.Components.f5) drawable).e;
                    } else {
                        document = null;
                    }
                    l1Var.D1(this, user, document, this.f22659na);
                    n2();
                }
                this.Z2.setState(StateSet.NOTHING);
                this.f22487a3 = false;
            }
            return this.f22487a3;
        }
        this.f22487a3 = false;
        return false;
    }

    public final void U0(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.U0(android.graphics.Canvas):void");
    }

    public final float U2() {
        float f7;
        x1 x1Var = this.gb;
        float f10 = 1.0f;
        if (x1Var.G1) {
            boolean z10 = this.f22738u1;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            return org.telegram.messenger.i0.T1(f7, f10, x1Var.L1);
        } else if (this.f22738u1) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public final void U3(int i10, int i11) {
        ArrayList arrayList;
        hj hjVar = this.f22615k3;
        x1 x1Var = this.gb;
        if (hjVar != null && (arrayList = hjVar.e) != null) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                gj gjVar = (gj) obj;
                ArrayList arrayList2 = gjVar.f15723y;
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    ((nh.i) obj2).i((i10 - gjVar.p(this.f22615k3.e, x1Var)) - this.f22689q3, getWidth(), (i11 - gjVar.p(this.f22615k3.e, x1Var)) - this.f22701r3);
                }
            }
        }
        StaticLayout staticLayout = this.P7;
        if (staticLayout != null) {
            float height = (-this.T7) - staticLayout.getHeight();
            ArrayList arrayList3 = this.Rb;
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList3.get(i14);
                i14++;
                ((nh.i) obj3).i(i10 + height, getWidth(), i11 + height);
            }
        }
        if (getMessageObject() != null && getMessageObject().f16397z2 != null) {
            ArrayList arrayList4 = getMessageObject().f16397z2;
            int size4 = arrayList4.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList4.get(i15);
                i15++;
                gj gjVar2 = (gj) obj4;
                ArrayList arrayList5 = gjVar2.f15723y;
                int size5 = arrayList5.size();
                int i16 = 0;
                while (i16 < size5) {
                    Object obj5 = arrayList5.get(i16);
                    i16++;
                    ((nh.i) obj5).i((i10 - gjVar2.p(getMessageObject().f16397z2, x1Var)) - this.f22724t0, getWidth(), (i11 - gjVar2.p(getMessageObject().f16397z2, x1Var)) - this.f22724t0);
                }
            }
        }
    }

    public final boolean V(org.telegram.messenger.jj r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.V(org.telegram.messenger.jj):boolean");
    }

    public final void V0(Canvas canvas) {
        float f7;
        q1 q1Var;
        Canvas canvas2;
        if (this.gc || this.f22586hc) {
            bj bjVar = this.L;
            if (bjVar == null || (bjVar.f14777c == 0 && bjVar.f14775a == 0)) {
                int compactHeaderColor = getCompactHeaderColor();
                f22483fd.setColor(compactHeaderColor);
                f22484gd.setColor(compactHeaderColor);
                float compactLeft = getCompactLeft();
                if (this.I) {
                    f7 = 9.0f;
                } else {
                    f7 = 10.0f;
                }
                float L = org.telegram.messenger.i0.L(f7);
                if (this.gc) {
                    q1Var = this;
                    canvas2 = canvas;
                    q1Var.X0(canvas2, this.f22550ec, compactLeft, L, compactHeaderColor);
                    L += org.telegram.messenger.i0.L(24.0f);
                } else {
                    q1Var = this;
                    canvas2 = canvas;
                }
                if (q1Var.f22586hc) {
                    q1Var.X0(canvas2, q1Var.f22563fc, compactLeft, L, compactHeaderColor);
                }
            }
        }
    }

    public final int V1(int i10) {
        return org.telegram.ui.ActionBar.t6.w0(i10, this.Ob);
    }

    public final boolean V2() {
        if (r2()) {
            return false;
        }
        return W2();
    }

    public void V3() {
        int i10;
        jj jjVar = this.O5;
        if (jjVar == null) {
            return;
        }
        float f7 = this.Tc + this.Uc;
        if (!jjVar.P3() || this.O5.B2) {
            f7 += this.f22687q1;
        }
        if (r2()) {
            f7 += getCompactSideMenuShift();
        } else if (this.V6 && !this.O5.P3() && this.L != null) {
            if (V2()) {
                i10 = 48;
            } else {
                i10 = 0;
            }
            f7 += org.telegram.messenger.i0.L(71 - i10) * this.X6;
        }
        setTranslationX(f7);
    }

    public final boolean W(MotionEvent motionEvent) {
        int i10;
        bj bjVar;
        boolean z10;
        Drawable drawable;
        Drawable drawable2;
        int L;
        int i11;
        int L2;
        int i12;
        if ((!t2() || this.O5.D == 16) && (((i10 = this.K1) != 5 && i10 != 1) || (bjVar = this.L) == null || (bjVar.f14783l & 4) != 0)) {
            int i13 = this.O5.D;
            if (i13 == 16) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            if (!z10) {
                if ((i10 == 1 || i13 == 12 || i10 == 5 || i10 == 4 || i10 == 2 || i13 == 8) && !this.R1 && !this.S1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                int x10 = (int) motionEvent.getX();
                int K1 = (int) K1(motionEvent);
                int action = motionEvent.getAction();
                Drawable[] drawableArr = this.H2;
                if (action == 0) {
                    jj jjVar = this.O5;
                    if (jjVar.D == 16) {
                        boolean J4 = jjVar.J4();
                        int i14 = this.Q3;
                        if (x10 >= i14) {
                            if (cd.X) {
                                L = 0;
                            } else {
                                L = this.Z6 - org.telegram.messenger.i0.L(70.0f);
                            }
                            int i15 = i14 + L;
                            if (!J4) {
                                i11 = 2;
                            } else {
                                i11 = 0;
                            }
                            if (x10 <= org.telegram.messenger.i0.L(i11 + 30) + i15 && K1 >= this.R3 - org.telegram.messenger.i0.L(14.0f)) {
                                if (K1 <= org.telegram.messenger.i0.L(50.0f) + this.R3) {
                                    this.X3 = true;
                                    this.J2[0] = 4;
                                    if (drawableArr[0] != null) {
                                        int i16 = this.Q3;
                                        if (cd.X) {
                                            L2 = 0;
                                        } else {
                                            L2 = this.Z6 - org.telegram.messenger.i0.L(70.0f);
                                        }
                                        int i17 = i16 + L2;
                                        if (!J4) {
                                            i12 = 2;
                                        } else {
                                            i12 = 0;
                                        }
                                        int L3 = org.telegram.messenger.i0.L(i12) + i17;
                                        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.t6.G4;
                                        int w9 = f1.w(2, L3, drawableArr2[J4 ? 1 : 0]);
                                        int f7 = f1.f(2, this.R3, drawableArr2[J4 ? 1 : 0]);
                                        drawableArr[0].setBounds(w9 - org.telegram.messenger.i0.L(20.0f), f7 - org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f) + w9, org.telegram.messenger.i0.L(20.0f) + f7);
                                        drawableArr[0].setHotspot(x10, K1);
                                        drawableArr[0].setState(this.L2);
                                    }
                                    invalidate();
                                    return true;
                                }
                            }
                        }
                    } else if (x10 >= this.Q3 - org.telegram.messenger.i0.L(20.0f)) {
                        if (x10 <= org.telegram.messenger.i0.L(20.0f) + this.Q3 && K1 >= this.R3 - org.telegram.messenger.i0.L(4.0f)) {
                            if (K1 <= org.telegram.messenger.i0.L(30.0f) + this.R3) {
                                this.X3 = true;
                                invalidate();
                                return true;
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (this.X3) {
                        if (this.O5.D == 16 && (drawable2 = drawableArr[0]) != null) {
                            drawable2.setState(StateSet.NOTHING);
                        }
                        this.X3 = false;
                        playSoundEffect(0);
                        this.Qa.A0(this, this.Q3, this.R3);
                        invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 2 && this.O5.D == 16 && this.X3 && (drawable = drawableArr[0]) != null) {
                    drawable.setHotspot(x10, K1);
                }
            }
        }
        return false;
    }

    public final Drawable W1(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.p6 p6Var = this.Ob;
        if (p6Var != null) {
            drawable = p6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.t6.R0(str);
    }

    public final boolean W2() {
        jj jjVar;
        if (!this.f22532d6 || this.f22570g6 || ((this.F6 && !this.f22605j6) || (jjVar = this.O5) == null || jjVar.P3() || !this.O5.k5())) {
            jj jjVar2 = this.O5;
            if (jjVar2 == null || jj.B0(jjVar2.f16337k) != 489000) {
                jj jjVar3 = this.O5;
                if (jjVar3 == null || !jjVar3.f16336j2) {
                    if (jjVar3 != null && jjVar3.f16337k.guestchat_via_from != null) {
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

    public final void W3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.W3():void");
    }

    public final boolean X(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.X(android.view.MotionEvent):boolean");
    }

    public final void X0(Canvas canvas, m1 m1Var, float f7, float f10, int i10) {
        int i11;
        int intrinsicWidth;
        int intrinsicHeight;
        boolean z10;
        int L = org.telegram.messenger.i0.L(16.0f);
        RectF rectF = m1Var.d;
        ImageReceiver imageReceiver = m1Var.f22279b;
        boolean z11 = m1Var.f22278a;
        float f11 = L;
        rectF.set(f7, f10, m1Var.f22284j + f7, f10 + f11);
        canvas.save();
        float a2 = m1Var.e.a(0.02f);
        RectF rectF2 = m1Var.d;
        canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.15f, i10);
        y yVar = m1Var.f22285k;
        if (yVar == null) {
            m1Var.f22286l = r12;
            y a02 = org.telegram.ui.ActionBar.t6.a0(r12, 6, 6);
            m1Var.f22285k = a02;
            a02.setCallback(this);
        } else if (m1Var.f22286l != r12) {
            m1Var.f22286l = r12;
            org.telegram.ui.ActionBar.t6.H1(yVar, r12, true);
        }
        m1Var.f22285k.setBounds((int) (rectF2.left - org.telegram.messenger.i0.L(6.0f)), (int) (rectF2.top - org.telegram.messenger.i0.L(4.0f)), (int) (rectF2.right + org.telegram.messenger.i0.L(6.0f)), (int) (rectF2.bottom + org.telegram.messenger.i0.L(4.0f)));
        m1Var.f22285k.draw(canvas);
        if (!z11) {
            l1 l1Var = this.Qa;
            if (l1Var != null && l1Var.k1(this, 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            Y0(canvas, m1Var, i10, z10);
        }
        if (this.f22624kc == null) {
            this.f22624kc = getContext().getResources().getDrawable(2131232331).mutate();
        }
        if (z11) {
            i11 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cd, this.Ob);
        } else {
            i11 = i10;
        }
        this.f22624kc.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        int i12 = (int) (((L - intrinsicWidth) / 2.0f) + f7);
        int i13 = (int) (((L - intrinsicHeight) / 2.0f) + f10);
        this.f22624kc.setBounds(i12, i13, this.f22624kc.getIntrinsicWidth() + i12, this.f22624kc.getIntrinsicHeight() + i13);
        canvas.save();
        if (!z11) {
            float f12 = f11 / 2.0f;
            canvas.scale(-1.0f, 1.0f, f7 + f12, f12 + f10);
        }
        this.f22624kc.draw(canvas);
        canvas.restore();
        float L2 = f7 + f11 + org.telegram.messenger.i0.L(6.0f);
        if (m1Var.f22281f != null) {
            f22483fd.setColor(i11);
            W0(canvas, m1Var.f22281f, L2, f10);
            f22483fd.setColor(i10);
            L2 += org.telegram.messenger.i0.L(4.0f) + I1(m1Var.f22281f);
        }
        if (m1Var.f22283i) {
            imageReceiver.y0(L2, f10, f11, f11);
            imageReceiver.setAlpha(1.0f);
            imageReceiver.h(canvas, null);
            L2 += org.telegram.messenger.i0.L(5.0f) + L;
        }
        StaticLayout staticLayout = m1Var.f22282g;
        if (staticLayout != null) {
            if (z11) {
                staticLayout.getPaint().setColor(i0.b.k(org.telegram.ui.ActionBar.t6.r1(0.7f, i11), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ua, this.Ob)));
            }
            W0(canvas, m1Var.f22282g, L2, f10);
            if (z11) {
                m1Var.f22282g.getPaint().setColor(i10);
            }
            L2 += org.telegram.messenger.i0.L(4.0f) + I1(m1Var.f22282g);
        }
        if (m1Var.h != null) {
            canvas.save();
            canvas.translate(L2 - m1Var.h.getLineLeft(0), ((L - m1Var.h.getHeight()) / 2.0f) + f10);
            if (z11) {
                m1Var.h.draw(canvas);
            } else {
                StaticLayout staticLayout2 = m1Var.h;
                AtomicReference atomicReference = this.f22635lc;
                ArrayList arrayList = this.Rb;
                nh.i.g(this, this.m0, i10, -org.telegram.messenger.i0.L(2.0f), atomicReference, 0, staticLayout2, arrayList, canvas, false);
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, m1Var.h, this.f22810za, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, G1(2, i10));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public Paint X1(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.p6 p6Var = this.Ob;
        if (p6Var != null) {
            paint = p6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.t6.V0(str);
    }

    public final k80 X2() {
        k80 k80Var;
        ArrayList arrayList = this.f22741u4;
        if (!arrayList.isEmpty()) {
            k80Var = (k80) arrayList.get(0);
            arrayList.remove(0);
        } else {
            k80Var = new k80(0);
        }
        k80Var.reset();
        this.f22753v4.add(k80Var);
        return k80Var;
    }

    public final gl0 X3() {
        if (this.O5 != null && L2()) {
            return (gl0) this.O5.f16385w2.f18990g.get(0);
        }
        return null;
    }

    public final boolean Y(MotionEvent motionEvent) {
        qs0 H1;
        l1 l1Var = this.Qa;
        if (l1Var == null) {
            H1 = null;
        } else {
            H1 = l1Var.H1();
        }
        qs0 qs0Var = H1;
        int i10 = 0;
        if (this.O5 != null) {
            ag.c2 c2Var = this.T0;
            if (c2Var.L() && qs0Var != null && !this.O5.t4() && !this.O5.G2() && ((!jj.L4(this.O5.f16337k) || this.F5) && !this.f22772wb && !this.O5.J2() && ((!this.O5.U2() || jj.t3(this.O5.f16337k)) && !this.O5.m5()))) {
                jj jjVar = this.O5;
                nh.h hVar = this.O9;
                if (hVar != null) {
                    Integer num = (Integer) hVar.f13836k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    i10 = num.intValue();
                }
                return qs0Var.a(motionEvent, this, c2Var, jjVar, i10);
            }
        }
        return false;
    }

    public final void Y0(Canvas canvas, m1 m1Var, int i10, boolean z10) {
        t80 t80Var;
        t80 t80Var2;
        if (!z10 && m1Var.f22288n) {
            t80 t80Var3 = m1Var.f22287m;
            if (t80Var3 != null) {
                t80Var3.a();
            }
        } else if (z10 && !m1Var.f22288n && (t80Var = m1Var.f22287m) != null) {
            t80Var.f30503c = -1L;
            t80Var.f30502b = -1L;
        }
        m1Var.f22288n = z10;
        float[] fArr = m1Var.f22289o;
        RectF rectF = m1Var.d;
        if (!z10 && ((t80Var2 = m1Var.f22287m) == null || !t80Var2.d())) {
            t80 t80Var4 = m1Var.f22287m;
            if (t80Var4 != null) {
                t80Var4.f30502b = -1L;
                return;
            }
            return;
        }
        if (m1Var.f22287m == null) {
            t80 t80Var5 = new t80();
            m1Var.f22287m = t80Var5;
            t80Var5.D = true;
            t80Var5.f30517t = 3.5f;
            t80Var5.f30518u = 0.5f;
        }
        m1Var.f22287m.g(org.telegram.ui.ActionBar.t6.r1(0.1f, i10), org.telegram.ui.ActionBar.t6.r1(0.3f, i10), org.telegram.ui.ActionBar.t6.r1(0.3f, i10), org.telegram.ui.ActionBar.t6.r1(1.25f, i10));
        Arrays.fill(fArr, org.telegram.messenger.i0.L(6.0f));
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(rectF.left - org.telegram.messenger.i0.L(6.0f), rectF.top - org.telegram.messenger.i0.L(4.0f), rectF.right + org.telegram.messenger.i0.L(6.0f), rectF.bottom + org.telegram.messenger.i0.L(4.0f));
        m1Var.f22287m.e(rectF2);
        m1Var.f22287m.j(fArr);
        m1Var.f22287m.f30520x.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        m1Var.f22287m.draw(canvas);
        invalidate();
    }

    public final float Y1(float f7) {
        float f10;
        float f11;
        if (B3() && this.K1 != 7) {
            return ((getPhotoBottom() + this.f22749v0) - org.telegram.messenger.i0.L(7.3f)) - this.f22784x9.getHeight();
        }
        int i10 = this.f22519c7;
        if (!this.F && !this.E) {
            f10 = 6.5f;
        } else {
            f10 = 7.5f;
        }
        float L = ((i10 - org.telegram.messenger.i0.L(f10)) - this.f22784x9.getHeight()) + f7;
        boolean z10 = this.f22772wb;
        x1 x1Var = this.gb;
        if (z10 && !r2()) {
            if (this.J) {
                f11 = 4.0f;
            } else {
                f11 = 5.0f;
            }
            L -= (1.0f - getVideoTranscriptionProgress()) * (this.N.i(x1Var.L1) + org.telegram.messenger.i0.L(f11));
        }
        ej ejVar = this.K;
        if (ejVar != null) {
            dj djVar = ejVar.f15403m;
            float f12 = L + djVar.h;
            if (djVar.f15247j) {
                return f12 - getTranslationY();
            }
            return f12;
        }
        return (x1Var.f23497j0 - x1Var.f23502k0) + L;
    }

    public final void Y2() {
        jj jjVar = this.O5;
        if (jjVar != null && jjVar.f16397z2 != null) {
            for (int i10 = 0; i10 < this.O5.f16397z2.size(); i10++) {
                gj gjVar = (gj) this.O5.f16397z2.get(i10);
                y yVar = gjVar.S;
                if (yVar != null) {
                    yVar.setCallback(this);
                    gjVar.S.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.f22615k3 != null) {
            for (int i11 = 0; i11 < this.f22615k3.e.size(); i11++) {
                gj gjVar2 = (gj) this.f22615k3.e.get(i11);
                y yVar2 = gjVar2.S;
                if (yVar2 != null) {
                    yVar2.setCallback(this);
                    gjVar2.S.setState(StateSet.NOTHING);
                }
            }
        }
        if (r2()) {
            invalidate();
        }
    }

    public final boolean Y3() {
        if (this.O5 != null && L2() && !r2()) {
            if ((TextUtils.isEmpty(this.O5.f16394z) || this.f22738u1) && this.N.f48450p) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void Z() {
        ih.h hVar;
        ih.h hVar2;
        jj jjVar = this.O5;
        if (jjVar != null && jjVar.T3()) {
            w1 w1Var = this.f22751v2;
            if (w1Var != null && (hVar2 = w1Var.f23362n) != null) {
                hVar2.e();
            }
            w1 w1Var2 = this.f22751v2;
            if (w1Var2 != null && (hVar = w1Var2.f23361m) != null) {
                hVar.e();
            }
        }
    }

    public final void Z0(Canvas canvas, float f7) {
        hj hjVar;
        sg.p0 p0Var;
        Paint paint;
        m1 m1Var;
        m1 m1Var2;
        if (r2() && this.O5 != null && f7 > 0.0f) {
            if (this.Yc == null) {
                this.Yc = new Paint(1);
            }
            float compactLeft = getCompactLeft();
            ArrayList arrayList = this.O5.f16397z2;
            if (arrayList != null && !arrayList.isEmpty()) {
                compactLeft = Math.max(compactLeft, this.f22649n0 + this.O5.f16374t2);
            }
            if (this.f22615k3 != null) {
                compactLeft = Math.max(compactLeft, this.f22689q3 + hjVar.f15903c);
            }
            if (this.M1) {
                ag.c2 c2Var = this.T0;
                if (c2Var.Q0) {
                    compactLeft = Math.max(compactLeft, c2Var.y());
                }
            }
            if (this.f22596i9 && this.T8 != null) {
                compactLeft = Math.max(compactLeft, getCompactLeft() + this.f22535d9);
            }
            if (this.gc && (m1Var2 = this.f22550ec) != null) {
                compactLeft = Math.max(compactLeft, m1Var2.d.right);
            }
            if (this.f22586hc && (m1Var = this.f22563fc) != null) {
                compactLeft = Math.max(compactLeft, m1Var.d.right);
            }
            if (!this.N.f48450p) {
                compactLeft = Math.max(compactLeft, p0Var.f48439b + p0Var.f48449o);
            }
            if (this.O5.D != 0 && !this.M1) {
                compactLeft = Math.max(compactLeft, getBackgroundDrawableRight() - org.telegram.messenger.i0.L(10.0f));
            }
            if (this.f22784x9 != null) {
                compactLeft = Math.max(compactLeft, this.A9 + this.f22796y9);
            }
            float L = org.telegram.messenger.i0.L(8.0f);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(L, org.telegram.messenger.i0.L(2.0f) + getPaddingTop(), Math.min(compactLeft + L, getMeasuredWidth() - L), getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f));
            this.Yc.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ua, this.Ob));
            this.Yc.setAlpha((int) (paint.getAlpha() * f7));
            float L2 = org.telegram.messenger.i0.L(tz.Y0);
            canvas.drawRoundRect(rectF, L2, L2, this.Yc);
        }
    }

    public final int Z1(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.O4;
            if (i11 < arrayList.size()) {
                TLRPC.TodoItem todoItem = ((p1) arrayList.get(i11)).f22437t;
                if (todoItem != null && todoItem.f19940id == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void Z2() {
        m1 m1Var = this.f22611jc;
        if (m1Var != null) {
            y yVar = m1Var.f22285k;
            if (yVar != null) {
                yVar.setState(StateSet.NOTHING);
            }
            this.f22611jc.e.c(false);
            this.f22611jc = null;
            invalidate();
        }
    }

    @Override
    public final boolean a() {
        ej ejVar = this.K;
        if ((ejVar == null || !ejVar.f15403m.f15247j) && getAlpha() != 1.0f) {
            return true;
        }
        return false;
    }

    public final void a0(boolean z10) {
        jj jjVar;
        boolean z11;
        jj jjVar2;
        byte[] bArr;
        w1 w1Var = this.f22751v2;
        if (w1Var != null && w1Var.f23359k != null && (jjVar = this.O5) != null && jjVar.T3()) {
            TLRPC.MessageMedia n12 = jj.n1(this.O5);
            boolean z12 = false;
            if (n12 instanceof TLRPC.TL_messageMediaPoll) {
                z11 = ((TLRPC.TL_messageMediaPoll) n12).poll.multiple_choice;
            } else {
                z11 = false;
            }
            kh.d dVar = this.f22751v2.f23359k;
            if (z11) {
                qz C = qz.C(this.Y5);
                if (this.O5 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C.f17665w.get("poll_" + jjVar2.E1());
                }
                if (bArr != null) {
                    z12 = true;
                }
            }
            fe.b bVar = dVar.f11386f;
            if (bVar.f7021f != z12) {
                bVar.a(z12, z10);
            }
        }
    }

    public final void a1(android.graphics.Canvas r50, boolean r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.a1(android.graphics.Canvas, boolean):void");
    }

    public final boolean a2() {
        if (this.f22615k3 != null) {
            return true;
        }
        return false;
    }

    public final void a3() {
        r1 r1Var = this.f22739u2;
        if (r1Var != null) {
            r1Var.h = false;
        }
        dc dcVar = this.Ea;
        if (dcVar != null) {
            dcVar.c(false);
        }
        Drawable drawable = this.H2[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        r1 r1Var2 = this.f22739u2;
        if (r1Var2 != null && r1Var2.f22868g != null) {
            for (int i10 = 0; i10 < this.f22739u2.f22868g.size(); i10++) {
                n1 n1Var = (n1) this.f22739u2.f22868g.get(i10);
                dc dcVar2 = n1Var.f22334f;
                if (dcVar2 != null) {
                    dcVar2.c(false);
                }
                y yVar = n1Var.f22335g;
                if (yVar != null) {
                    yVar.setState(StateSet.NOTHING);
                }
            }
        }
    }

    @Override
    public final void b(boolean z10, boolean z11) {
        this.f22771wa = z10;
        if (z10) {
            this.f22785xa = z11;
        } else {
            this.f22785xa = false;
        }
    }

    public final boolean b0(MotionEvent motionEvent) {
        m1 m1Var;
        m1 m1Var2;
        m1 m1Var3;
        m1 m1Var4;
        l1 l1Var;
        int i10;
        q1 q1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (!this.gc && !this.f22586hc) {
            if (this.O7 != null && (l1Var = this.Qa) != null && l1Var.i0()) {
                float x10 = motionEvent.getX();
                float K1 = K1(motionEvent);
                if (this.O5.O5()) {
                    i10 = Math.max(this.V7, this.X7) + this.S7;
                } else {
                    i10 = this.M6 + this.S7;
                }
                if (motionEvent.getAction() == 0) {
                    if (x10 >= this.S7 && x10 <= i10) {
                        float f7 = this.T7;
                        if (K1 >= f7 && K1 <= f7 + this.U7) {
                            this.f22520c8 = true;
                            getParent().requestDisallowInterceptTouchEvent(false);
                            this.f22572g8 = x10;
                            this.f22583h8 = getY() + K1;
                            y yVar = this.Ia;
                            if (yVar != null) {
                                yVar.setHotspot(x10, K1);
                                this.f22534d8 = false;
                                this.f22547e8 = true;
                                postDelayed(new b1(this, 3), ViewConfiguration.getTapTimeout() / 6);
                                invalidate();
                            }
                            dc dcVar = this.Da;
                            if (dcVar != null) {
                                dcVar.c(true);
                                this.Ga = x10;
                                this.Ha = K1;
                            }
                            w();
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1) {
                        if (this.f22520c8) {
                            m();
                            this.f22520c8 = false;
                            y yVar2 = this.Ia;
                            if (yVar2 != null) {
                                if (!this.f22534d8) {
                                    yVar2.setState(new int[]{16842919, 16842910});
                                    post(new b1(this, 4));
                                } else {
                                    yVar2.setState(new int[0]);
                                }
                                this.f22534d8 = false;
                                this.f22547e8 = false;
                                invalidate();
                            }
                            dc dcVar2 = this.Da;
                            if (dcVar2 != null) {
                                dcVar2.c(false);
                            }
                            playSoundEffect(0);
                            if (this.f22759va) {
                                l1 l1Var2 = this.Qa;
                                if (l1Var2 != null) {
                                    TLRPC.Chat chat = this.f22721sa;
                                    if (chat != null) {
                                        l1Var2.T(this, chat, this.O5.f16337k.fwd_from.channel_post, this.f22565g1, this.f22576h1, false);
                                        q1Var = this;
                                    } else {
                                        q1Var = this;
                                        TLRPC.User user = q1Var.f22695qa;
                                        if (user != null) {
                                            l1Var2.r0(this, user, q1Var.f22565g1, q1Var.f22576h1);
                                        } else if (q1Var.f22734ta != null) {
                                            l1Var2.n(this);
                                        }
                                    }
                                }
                            } else {
                                q1Var = this;
                                if (q1Var.Qa != null && (q1Var.O5.B2() || q1Var.O5.f4() || q1Var.K7 || ((message = q1Var.O5.f16337k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                                    q1Var.Qa.L1(q1Var, q1Var.O5.O1(), x10, K1, false);
                                }
                            }
                        }
                    } else {
                        q1Var = this;
                        if (motionEvent.getAction() == 3) {
                            q1Var.f22520c8 = false;
                            q1Var.f22534d8 = false;
                            y yVar3 = q1Var.Ia;
                            if (yVar3 != null) {
                                yVar3.setState(new int[0]);
                            }
                            invalidate();
                            dc dcVar3 = q1Var.Da;
                            if (dcVar3 != null) {
                                dcVar3.c(false);
                            }
                        } else if (motionEvent.getAction() == 2) {
                            if (x10 >= q1Var.S7 && x10 <= i10) {
                                float f10 = q1Var.T7;
                                if (K1 >= f10 && K1 <= f10 + q1Var.U7) {
                                    if (q1Var.Ia != null && q1Var.f22547e8) {
                                        if (Math.sqrt(Math.pow((getY() + K1) - q1Var.f22583h8, 2.0d) + Math.pow(x10 - q1Var.f22572g8, 2.0d)) > 0.75d) {
                                            q1Var.f22547e8 = false;
                                        }
                                    }
                                }
                            }
                            q1Var.f22520c8 = false;
                            q1Var.f22534d8 = false;
                            q1Var.f22547e8 = false;
                            y yVar4 = q1Var.Ia;
                            if (yVar4 != null) {
                                yVar4.setState(new int[0]);
                            }
                            invalidate();
                            dc dcVar4 = q1Var.Da;
                            if (dcVar4 != null) {
                                dcVar4.c(false);
                            }
                        }
                    }
                    return q1Var.f22520c8;
                }
                q1Var = this;
                return q1Var.f22520c8;
            }
        } else {
            float x11 = motionEvent.getX();
            float K12 = K1(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                if (this.Qa != null) {
                    if (this.gc && (m1Var4 = this.f22550ec) != null && z2(m1Var4, x11, K12)) {
                        m1Var2 = this.f22550ec;
                    } else if (this.f22586hc && (m1Var3 = this.f22563fc) != null && z2(m1Var3, x11, K12)) {
                        m1Var2 = this.f22563fc;
                    } else {
                        m1Var2 = null;
                    }
                    if (m1Var2 != null && (m1Var2.f22278a || this.Qa.i0())) {
                        this.f22611jc = m1Var2;
                        m1Var2.e.c(true);
                        y yVar5 = m1Var2.f22285k;
                        if (yVar5 != null) {
                            yVar5.setHotspot(x11, K12);
                            m1Var2.f22285k.setState(new int[]{16842919, 16842910});
                        }
                        invalidate();
                        w();
                        return true;
                    }
                }
            } else if (action == 1) {
                m1 m1Var5 = this.f22611jc;
                if (m1Var5 != null) {
                    m();
                    Z2();
                    playSoundEffect(0);
                    if (m1Var5.f22278a) {
                        TLRPC.Chat chat2 = this.f22721sa;
                        if (chat2 != null) {
                            this.Qa.T(this, chat2, this.O5.f16337k.fwd_from.channel_post, this.f22565g1, this.f22576h1, false);
                            return true;
                        }
                        TLRPC.User user2 = this.f22695qa;
                        if (user2 != null) {
                            this.Qa.r0(this, user2, this.f22565g1, this.f22576h1);
                            return true;
                        }
                        this.Qa.n(this);
                        return true;
                    }
                    this.Qa.L1(this, this.O5.O1(), x11, K12, false);
                    return true;
                }
            } else {
                if (action == 3) {
                    Z2();
                } else if (action == 2 && (m1Var = this.f22611jc) != null && !z2(m1Var, x11, K12)) {
                    m();
                    Z2();
                }
                if (this.f22611jc != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b1(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.b1(android.graphics.Canvas):void");
    }

    public final boolean b2() {
        return this.f22756v7;
    }

    public final void b3(int i10) {
        ji.a aVar;
        ji.a aVar2 = this.f22715s4;
        if (i10 != -1) {
            Integer valueOf = Integer.valueOf(i10);
            for (int i11 = 0; i11 < aVar2.f10421a; i11++) {
                if (((Pair) ((ArrayList) aVar2.e).get(i11)).second == valueOf) {
                    aVar2.l(i11);
                }
            }
        } else {
            aVar2.f(true);
        }
        s1 s1Var = this.f22698r0;
        if (s1Var != null && (aVar = s1Var.f22970i) != null) {
            aVar.f(true);
        }
        this.f22666o4 = null;
        s1 s1Var2 = this.f22698r0;
        if (s1Var2 != null) {
            s1Var2.f22971j = null;
        }
        if (this.f22679p4 != null) {
            if (this.f22728t4 == i10 || i10 == -1) {
                this.f22679p4 = null;
                this.f22728t4 = -1;
                this.f22510bc = false;
                this.f22524cc = false;
                invalidate();
            }
        }
    }

    @Override
    public final void c(float f7) {
        jj jjVar = this.O5;
        if (jjVar == null) {
            return;
        }
        jjVar.f16299b0 = f7;
        MediaController.B().i0(this.O5, f7);
        O3();
    }

    public final boolean c0(MotionEvent motionEvent) {
        jj jjVar = this.O5;
        if (jjVar == null || jjVar.f16385w2 == null || jjVar.D != 36) {
            return false;
        }
        float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.f22575h0 + this.f22724t0;
        motionEvent.offsetLocation(-this.f22649n0, -topicSeparatorTopPadding);
        vv vvVar = this.O5.f16385w2;
        l1 l1Var = this.Qa;
        vvVar.E = this;
        vvVar.F = l1Var;
        boolean M = vvVar.M(motionEvent);
        motionEvent.offsetLocation(this.f22649n0, topicSeparatorTopPadding);
        return M;
    }

    public final void c1(Canvas canvas, float f7) {
        if (!this.O5.r4() && !this.O5.G4() && !this.P1 && !this.R1 && !this.S1) {
            return;
        }
        B1().a(canvas, f7);
    }

    public final boolean c2() {
        if (r2() && W2()) {
            return true;
        }
        return false;
    }

    public final void c3() {
        if (this.f22638m3 != null) {
            this.f22638m3 = null;
        }
        ArrayList arrayList = this.f22753v4;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f22741u4.addAll(arrayList);
        arrayList.clear();
    }

    @Override
    public final void computeScroll() {
        super.computeScroll();
        l0 l0Var = this.f22761w;
        if (l0Var != null) {
            l0Var.b();
        }
    }

    @Override
    public final void d(float f7) {
        jj jjVar = this.O5;
        if (jjVar == null) {
            return;
        }
        jjVar.f16299b0 = f7;
        jjVar.f16322g0 = (int) (jjVar.L0() * f7);
        O3();
    }

    public final boolean d0(int i10, MotionEvent motionEvent) {
        int i11;
        nh.i iVar;
        int i12;
        int i13;
        hj hjVar;
        hj hjVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        ej ejVar;
        if (i10 > 15 || getParent() == null) {
            return false;
        }
        boolean z10 = true;
        if (this.O5.z2() && (ejVar = this.K) != null && !ejVar.f15399i) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            for (int i18 = 0; i18 < viewGroup.getChildCount(); i18++) {
                View childAt = viewGroup.getChildAt(i18);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    ej currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    bj currentPosition = q1Var.getCurrentPosition();
                    if (currentMessagesGroup != null && currentMessagesGroup.f15394a == this.K.f15394a) {
                        int i19 = currentPosition.f14783l;
                        if ((i19 & 8) != 0 && (i19 & 1) != 0 && q1Var != this) {
                            motionEvent.offsetLocation(getLeft() - q1Var.getLeft(), getTop() - q1Var.getTop());
                            boolean d02 = q1Var.d0(i10 + 1, motionEvent);
                            motionEvent.offsetLocation(-(getLeft() - q1Var.getLeft()), -(getTop() - q1Var.getTop()));
                            return d02;
                        }
                    }
                }
            }
        }
        if (this.N5) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        int K1 = (int) K1(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        x1 x1Var = this.gb;
        if (actionMasked == 0) {
            int i20 = this.f22649n0;
            if (x10 >= i20 && K1 >= (i16 = this.f22724t0)) {
                jj jjVar = this.O5;
                if (x10 <= i20 + jjVar.f16374t2 && K1 <= jjVar.U5(x1Var) + i16) {
                    ArrayList arrayList = this.O5.f16397z2;
                    for (int i21 = 0; i21 < arrayList.size() && ((gj) arrayList.get(i21)).p(this.O5.f16397z2, x1Var) <= K1; i21++) {
                        gj gjVar = (gj) arrayList.get(i21);
                        if (gjVar.l()) {
                            i17 = (int) this.O5.f16381v2;
                        } else {
                            i17 = 0;
                        }
                        ArrayList arrayList2 = gjVar.f15723y;
                        int size = arrayList2.size();
                        int i22 = 0;
                        while (i22 < size) {
                            Object obj = arrayList2.get(i22);
                            i22++;
                            nh.i iVar2 = (nh.i) obj;
                            boolean z11 = z10;
                            if (iVar2.getBounds().contains((x10 - this.f22649n0) + i17, (int) ((K1 - this.f22724t0) - gjVar.p(this.O5.f16397z2, x1Var)))) {
                                this.M5 = iVar2;
                                return z11;
                            }
                            z10 = z11;
                        }
                    }
                }
            }
            boolean z12 = z10;
            if (this.f22615k3 != null) {
                float f7 = x10;
                float f10 = this.f22689q3;
                if (f7 >= f10) {
                    float f11 = K1;
                    float f12 = this.f22701r3;
                    if (f11 >= f12 && f7 <= f10 + hjVar.f15903c && f11 <= f12 + hjVar.c(x1Var)) {
                        ArrayList arrayList3 = this.f22615k3.e;
                        for (int i23 = 0; i23 < arrayList3.size() && ((gj) arrayList3.get(i23)).p(this.f22615k3.e, x1Var) <= f11; i23++) {
                            gj gjVar2 = (gj) arrayList3.get(i23);
                            if (gjVar2.l()) {
                                i15 = (int) this.f22615k3.d;
                            } else {
                                i15 = 0;
                            }
                            ArrayList arrayList4 = gjVar2.f15723y;
                            int size2 = arrayList4.size();
                            int i24 = 0;
                            while (i24 < size2) {
                                Object obj2 = arrayList4.get(i24);
                                i24++;
                                nh.i iVar3 = (nh.i) obj2;
                                ArrayList arrayList5 = arrayList3;
                                float f13 = f7;
                                if (iVar3.getBounds().contains((int) ((f7 - this.f22689q3) + i15), (int) ((f11 - this.f22701r3) - gjVar2.p(this.f22615k3.e, x1Var)))) {
                                    this.M5 = iVar3;
                                    return z12;
                                }
                                arrayList3 = arrayList5;
                                f7 = f13;
                            }
                        }
                    }
                }
            }
            if (this.f22665o3 == null) {
                return false;
            }
            float f14 = x10;
            float f15 = this.f22716s5;
            if (f14 < f15) {
                return false;
            }
            float f16 = K1;
            float f17 = this.f22729t5;
            if (f16 <= f17 || f14 > f15 + hjVar2.f15903c || f16 > f17 + hjVar2.c(x1Var)) {
                return false;
            }
            ArrayList arrayList6 = this.f22665o3.e;
            for (int i25 = 0; i25 < arrayList6.size() && ((gj) arrayList6.get(i25)).p(this.f22665o3.e, x1Var) <= f16; i25++) {
                gj gjVar3 = (gj) arrayList6.get(i25);
                if (gjVar3.l()) {
                    i14 = (int) this.f22665o3.d;
                } else {
                    i14 = 0;
                }
                ArrayList arrayList7 = gjVar3.f15723y;
                int size3 = arrayList7.size();
                int i26 = 0;
                while (i26 < size3) {
                    Object obj3 = arrayList7.get(i26);
                    i26++;
                    nh.i iVar4 = (nh.i) obj3;
                    if (iVar4.getBounds().contains((int) ((f14 - this.f22716s5) + i14), (int) ((f16 - this.f22729t5) - gjVar3.p(this.f22665o3.e, x1Var)))) {
                        this.M5 = iVar4;
                        return z12;
                    }
                }
            }
            return false;
        } else if (actionMasked != 1 || this.M5 == null) {
            return false;
        } else {
            playSoundEffect(0);
            Path path = this.Tb;
            path.rewind();
            hj hjVar3 = this.f22665o3;
            if (hjVar3 != null) {
                ArrayList arrayList8 = hjVar3.e;
                int size4 = arrayList8.size();
                int i27 = 0;
                while (i27 < size4) {
                    Object obj4 = arrayList8.get(i27);
                    i27++;
                    gj gjVar4 = (gj) obj4;
                    ArrayList arrayList9 = gjVar4.f15723y;
                    int size5 = arrayList9.size();
                    int i28 = 0;
                    while (i28 < size5) {
                        int i29 = i28 + 1;
                        Rect bounds = ((nh.i) arrayList9.get(i28)).getBounds();
                        path.addRect(bounds.left, gjVar4.p(this.f22665o3.e, x1Var) + bounds.top, bounds.right, gjVar4.p(this.f22665o3.e, x1Var) + bounds.bottom, Path.Direction.CW);
                        i28 = i29;
                    }
                }
            }
            hj hjVar4 = this.f22615k3;
            if (hjVar4 != null) {
                ArrayList arrayList10 = hjVar4.e;
                int size6 = arrayList10.size();
                int i30 = 0;
                while (i30 < size6) {
                    Object obj5 = arrayList10.get(i30);
                    i30++;
                    gj gjVar5 = (gj) obj5;
                    ArrayList arrayList11 = gjVar5.f15723y;
                    int size7 = arrayList11.size();
                    int i31 = 0;
                    while (i31 < size7) {
                        int i32 = i31 + 1;
                        Rect bounds2 = ((nh.i) arrayList11.get(i31)).getBounds();
                        path.addRect(bounds2.left, gjVar5.p(this.f22615k3.e, x1Var) + bounds2.top, bounds2.right, gjVar5.p(this.f22615k3.e, x1Var) + bounds2.bottom, Path.Direction.CW);
                        i31 = i32;
                    }
                }
            } else {
                ArrayList arrayList12 = this.O5.f16397z2;
                if (arrayList12 != null) {
                    int size8 = arrayList12.size();
                    int i33 = 0;
                    while (i33 < size8) {
                        Object obj6 = arrayList12.get(i33);
                        i33++;
                        gj gjVar6 = (gj) obj6;
                        ArrayList arrayList13 = gjVar6.f15723y;
                        int size9 = arrayList13.size();
                        int i34 = 0;
                        while (i34 < size9) {
                            int i35 = i34 + 1;
                            Rect bounds3 = ((nh.i) arrayList13.get(i34)).getBounds();
                            path.addRect(bounds3.left, gjVar6.p(this.O5.f16397z2, x1Var) + bounds3.top, bounds3.right, gjVar6.p(this.O5.f16397z2, x1Var) + bounds3.bottom, Path.Direction.CW);
                            i34 = i35;
                        }
                    }
                }
            }
            RectF rectF = this.f22488a4;
            path.computeBounds(rectF, false);
            float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
            this.N5 = true;
            this.M5.f13852q = new b1(this, 8);
            hj hjVar5 = this.f22665o3;
            if (hjVar5 != null) {
                ArrayList arrayList14 = hjVar5.e;
                int size10 = arrayList14.size();
                int i36 = 0;
                while (i36 < size10) {
                    Object obj7 = arrayList14.get(i36);
                    i36++;
                    gj gjVar7 = (gj) obj7;
                    if (gjVar7.l()) {
                        i13 = (int) this.f22665o3.d;
                    } else {
                        i13 = 0;
                    }
                    ArrayList arrayList15 = gjVar7.f15723y;
                    int size11 = arrayList15.size();
                    int i37 = 0;
                    while (i37 < size11) {
                        Object obj8 = arrayList15.get(i37);
                        i37++;
                        ((nh.i) obj8).j((x10 - this.f22716s5) + i13, (K1 - gjVar7.p(this.f22665o3.e, x1Var)) - this.f22729t5, sqrt, false);
                        arrayList14 = arrayList14;
                    }
                }
            }
            hj hjVar6 = this.f22615k3;
            if (hjVar6 != null) {
                ArrayList arrayList16 = hjVar6.e;
                int size12 = arrayList16.size();
                int i38 = 0;
                while (i38 < size12) {
                    Object obj9 = arrayList16.get(i38);
                    i38++;
                    gj gjVar8 = (gj) obj9;
                    if (gjVar8.l()) {
                        i12 = (int) this.f22615k3.d;
                    } else {
                        i12 = 0;
                    }
                    ArrayList arrayList17 = gjVar8.f15723y;
                    int size13 = arrayList17.size();
                    int i39 = 0;
                    while (i39 < size13) {
                        Object obj10 = arrayList17.get(i39);
                        i39++;
                        ((nh.i) obj10).j((x10 - this.f22689q3) + i12, (K1 - gjVar8.p(this.f22615k3.e, x1Var)) - this.f22701r3, sqrt, false);
                        x10 = x10;
                    }
                }
            } else {
                ArrayList arrayList18 = this.O5.f16397z2;
                if (arrayList18 != null) {
                    int size14 = arrayList18.size();
                    int i40 = 0;
                    while (i40 < size14) {
                        Object obj11 = arrayList18.get(i40);
                        i40++;
                        gj gjVar9 = (gj) obj11;
                        if (gjVar9.l()) {
                            i11 = (int) this.O5.f16381v2;
                        } else {
                            i11 = 0;
                        }
                        ArrayList arrayList19 = gjVar9.f15723y;
                        int size15 = arrayList19.size();
                        int i41 = 0;
                        while (i41 < size15) {
                            Object obj12 = arrayList19.get(i41);
                            i41++;
                            ((nh.i) obj12).j((x10 - this.f22649n0) + i11, (K1 - gjVar9.p(this.O5.f16397z2, x1Var)) - this.f22724t0, sqrt, false);
                        }
                    }
                }
            }
            if (getParent() instanceof tk0) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                for (int i42 = 0; i42 < viewGroup2.getChildCount(); i42++) {
                    View childAt2 = viewGroup2.getChildAt(i42);
                    if (childAt2 instanceof q1) {
                        q1 q1Var2 = (q1) childAt2;
                        ArrayList arrayList20 = q1Var2.Rb;
                        if (q1Var2.getMessageObject() != null && q1Var2.getMessageObject().O1() == getMessageObject().f1() && !arrayList20.isEmpty()) {
                            ((nh.i) arrayList20.get(0)).f13852q = new ea(6, this, q1Var2);
                            int size16 = arrayList20.size();
                            int i43 = 0;
                            while (i43 < size16) {
                                Object obj13 = arrayList20.get(i43);
                                i43++;
                                ((nh.i) obj13).j(iVar.getBounds().centerX(), iVar.getBounds().centerY(), sqrt, false);
                            }
                        }
                    }
                }
            }
            this.M5 = null;
            return true;
        }
    }

    public final void d1(float r43, float r44, android.graphics.Canvas r45, java.util.ArrayList r46, float r47, boolean r48, float r49, boolean r50, boolean r51, boolean r52, boolean r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.d1(float, float, android.graphics.Canvas, java.util.ArrayList, float, boolean, float, boolean, boolean, boolean, boolean):void");
    }

    public final boolean d2() {
        s1 s1Var = this.f22698r0;
        if (s1Var != null && s1Var.f22966b) {
            return true;
        }
        return false;
    }

    public final void d3() {
        CharSequence charSequence;
        long j10;
        long j11;
        long j12;
        long j13;
        b1 b1Var = this.Wb;
        m2.t tVar = this.f22774x;
        tVar.n(b1Var);
        b1 b1Var2 = this.Xb;
        tVar.n(b1Var2);
        jj jjVar = this.O5;
        if (jjVar != null) {
            if (!TextUtils.isEmpty(jjVar.f16394z)) {
                charSequence = this.O5.f16394z;
            } else {
                charSequence = this.O5.v;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i10 = n00.e;
                int i11 = 0;
                ArrayList arrayList = null;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    n00[] n00VarArr = (n00[]) spanned.getSpans(0, spanned.length(), n00.class);
                    for (n00 n00Var : n00VarArr) {
                        if (n00Var.f28648b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(n00VarArr.length);
                            }
                            arrayList.add(Integer.valueOf(n00Var.f28648b.date));
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
                        tVar.n(b1Var2);
                        at atVar = new at(25, tVar, b1Var2);
                        ((HashMap) tVar.f12684b).put(b1Var2, atVar);
                        if (j17 > 0) {
                            org.telegram.messenger.i0.h3(atVar, j17);
                        } else {
                            org.telegram.messenger.i0.g3(atVar);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        jj jjVar;
        if (i10 == zs.f19648m1) {
            setSpoilersSuppressed(false);
        } else if (i10 == zs.l1) {
            setSpoilersSuppressed(true);
        } else if (i10 == zs.E0) {
            TLRPC.User user = this.ha;
            if (user != null && user.f19942id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.O5);
            }
        } else if (i10 == zs.f19630i4) {
            invalidate();
        } else if (i10 == zs.W2 && (jjVar = this.O5) != null) {
            TLRPC.MessageMedia messageMedia = jjVar.f16337k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
                s3(jjVar, this.K, this.F, this.E, this.G, false);
            }
        }
    }

    @Override
    public final void e(TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        l1 l1Var = this.Qa;
        if (l1Var != null) {
            l1Var.b2(this, reactionCount, z10, f7, f10);
        }
    }

    public final void e0() {
        int i10;
        jj jjVar = this.O5;
        if (jjVar != null) {
            TLRPC.MessageMedia o12 = jj.o1(jjVar.f16337k);
            if ((o12 instanceof TLRPC.TL_messageMediaDice) && ((TLRPC.TL_messageMediaDice) o12).game_outcome != null && !this.Q) {
                Drawable t10 = this.T0.t();
                if (t10 instanceof org.telegram.ui.Components.zh0) {
                    org.telegram.ui.Components.zh0 zh0Var = (org.telegram.ui.Components.zh0) t10;
                    if ((zh0Var.m0 != null || zh0Var.Y0) && !this.Q && (i10 = zh0Var.J) != 1 && i10 == 2) {
                        if (!zh0Var.X0) {
                            float t11 = zh0Var.t();
                            if (zh0Var.U0 != null) {
                                t11 = zh0Var.f24752a0 / zh0Var.f33068a1;
                            }
                            if (t11 <= 0.95f) {
                                return;
                            }
                        }
                        this.Q = true;
                        l1 l1Var = this.Qa;
                        if (l1Var != null) {
                            l1Var.n1(this, false);
                        }
                    }
                }
            }
        }
    }

    public final void e1(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        int i10;
        int i11;
        Canvas canvas2;
        jj jjVar = this.O5;
        if (jjVar != null && !jjVar.r4()) {
            float f12 = this.f22724t0;
            x1 x1Var = this.gb;
            if (x1Var.f23512m2) {
                float f13 = x1Var.f23521o2;
                float f14 = x1Var.L1;
                f7 = (f14 * f12) + ((1.0f - f14) * f13);
            } else {
                f7 = f12;
            }
            if (x1Var.L1 != 1.0f && x1Var.H0) {
                canvas.save();
                org.telegram.ui.ActionBar.c5 c5Var = this.J6;
                if (c5Var != null) {
                    Rect bounds = c5Var.getBounds();
                    if (this.O5.P3() && !this.A6 && !this.F) {
                        canvas.clipRect(org.telegram.messenger.i0.L(4.0f) + bounds.left, org.telegram.messenger.i0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.i0.L(10.0f), bounds.bottom - org.telegram.messenger.i0.L(4.0f));
                    } else {
                        canvas.clipRect(org.telegram.messenger.i0.L(4.0f) + bounds.left, org.telegram.messenger.i0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.i0.L(4.0f), bounds.bottom - org.telegram.messenger.i0.L(4.0f));
                    }
                }
                zh0 zh0Var = this.f22786xc;
                if (zh0Var != null && zh0Var.h) {
                    jj jjVar2 = this.O5;
                    d1(this.f22649n0, f7, canvas, jjVar2.f16397z2, jjVar2.f16381v2, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    d1(this.f22649n0, f7, canvas, x1Var.I0, x1Var.O0, false, 1.0f - x1Var.L1, true, false, false, false);
                    jj jjVar3 = this.O5;
                    d1(this.f22649n0, f7, canvas, jjVar3.f16397z2, jjVar3.f16381v2, true, x1Var.L1, true, false, false, false);
                    canvas2 = canvas;
                }
                canvas2.restore();
                return;
            }
            float f15 = f7;
            boolean z10 = x1Var.E1;
            if (z10 && this.J6 != null) {
                if (z10) {
                    int i12 = -1;
                    if (this.f22725t1) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    float z11 = c3.i0.z(1.0f, x1Var.L1, this.O5.U5(x1Var) * i11, f12);
                    float f16 = x1Var.f23521o2;
                    if (this.f22725t1) {
                        i12 = 1;
                    }
                    f10 = f16 - ((this.O5.U5(x1Var) * i12) * x1Var.L1);
                    f11 = z11;
                } else {
                    f10 = f15;
                    f11 = f10;
                }
                canvas.save();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(this.J6.getBounds());
                if (this.O5.P3() && !this.A6 && !this.F) {
                    rectF.left += org.telegram.messenger.i0.L(4.0f);
                    rectF.right -= org.telegram.messenger.i0.L(10.0f);
                } else {
                    rectF.left += org.telegram.messenger.i0.L(4.0f);
                    rectF.right -= org.telegram.messenger.i0.L(4.0f);
                }
                float f17 = rectF.left;
                float f18 = x1Var.f23521o2;
                canvas.clipRect(f17, f18, rectF.right, this.O5.U5(x1Var) + f18 + org.telegram.messenger.i0.L(4.0f));
                jj jjVar4 = this.O5;
                d1(this.f22649n0, f10, canvas, jjVar4.f16397z2, jjVar4.f16381v2, false, 1.0f - x1Var.L1, true, false, false, false);
                canvas.restore();
                canvas.save();
                rectF.set(this.J6.getBounds());
                if (this.O5.P3() && !this.A6 && !this.F) {
                    rectF.left += org.telegram.messenger.i0.L(4.0f);
                    rectF.right -= org.telegram.messenger.i0.L(10.0f);
                } else {
                    rectF.left += org.telegram.messenger.i0.L(4.0f);
                    rectF.right -= org.telegram.messenger.i0.L(4.0f);
                }
                canvas.clipRect(rectF.left, this.f22724t0, rectF.right, org.telegram.messenger.i0.L(4.0f) + this.O5.U5(x1Var) + i10);
                jj jjVar5 = this.O5;
                d1(this.f22649n0, f11, canvas, jjVar5.f16397z2, jjVar5.f16381v2, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            jj jjVar6 = this.O5;
            d1(this.f22649n0, f15, canvas, jjVar6.f16397z2, jjVar6.f16381v2, true, 1.0f, true, false, false, false);
        }
    }

    public final boolean e2() {
        org.telegram.ui.ActionBar.p6 p6Var = this.Ob;
        if (p6Var != null) {
            return p6Var.g();
        }
        return org.telegram.ui.ActionBar.t6.d1();
    }

    public final void e3(int i10, int i11, String str) {
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

    public final boolean f0(MotionEvent motionEvent) {
        if (!this.f22693q8 || this.f22745u8 == null || this.Fa == null || this.Qa == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float K1 = K1(motionEvent);
        int action = motionEvent.getAction();
        RectF rectF = this.La;
        if (action == 0) {
            if (rectF.contains(x10, K1)) {
                this.Fa.c(true);
                y yVar = this.f22732t8;
                if (yVar != null) {
                    yVar.setHotspot(x10, K1);
                    this.f22732t8.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.Fa.f25390i && !rectF.contains(x10, K1)) {
                this.Fa.c(false);
                y yVar2 = this.f22732t8;
                if (yVar2 != null) {
                    yVar2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Fa.f25390i) {
                this.Qa.F0(this);
            }
            this.Fa.c(false);
            y yVar3 = this.f22732t8;
            if (yVar3 != null) {
                yVar3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.Fa.c(false);
            y yVar4 = this.f22732t8;
            if (yVar4 != null) {
                yVar4.setState(new int[0]);
            }
        }
        return this.Fa.f25390i;
    }

    public final void f1(android.graphics.Canvas r55, float r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.f1(android.graphics.Canvas, float):void");
    }

    public final boolean f2() {
        TLRPC.Message message;
        jj jjVar = this.O5;
        if (jjVar != null && !jjVar.E0 && !jjVar.f16328h2 && (message = jjVar.f16337k) != null) {
            TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
            if (((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) || jjVar.f16354o2 != null) {
                return true;
            }
        }
        if (this.K5) {
            return true;
        }
        return false;
    }

    public final void f3(boolean z10, boolean z11) {
        ej ejVar;
        ej ejVar2;
        jj jjVar;
        if (!z11 || (jjVar = this.O5) == null || !jjVar.f16295a0) {
            if (z10) {
                this.f22638m3 = null;
                CheckBoxBase checkBoxBase = this.l1;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, this.Ob);
                    this.l1 = checkBoxBase2;
                    if (this.N0) {
                        checkBoxBase2.f23914l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.p6 p6Var = this.Ob;
                    if (checkBoxBase.F != p6Var) {
                        checkBoxBase.F = p6Var;
                        checkBoxBase.b();
                    }
                }
            }
            if (z10 && (((ejVar = this.K) != null && ejVar.d.size() > 1) || ((ejVar2 = this.Q5) != null && ejVar2.d.size() > 1))) {
                CheckBoxBase checkBoxBase3 = this.f22613k1;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, this, this.Ob);
                    this.f22613k1 = checkBoxBase4;
                    if (!checkBoxBase4.f23926y) {
                        checkBoxBase4.f23926y = true;
                        checkBoxBase4.b();
                    }
                    if (this.N0) {
                        this.f22613k1.f23914l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.p6 p6Var2 = this.Ob;
                    if (checkBoxBase3.F != p6Var2) {
                        checkBoxBase3.F = p6Var2;
                        checkBoxBase3.b();
                    }
                }
            }
            float f7 = 0.0f;
            if (this.f22636m1 == z10) {
                if (z11 != this.f22650n1 && !z11) {
                    if (z10) {
                        f7 = 1.0f;
                    }
                    this.f22663o1 = f7;
                    invalidate();
                    return;
                }
                return;
            }
            this.f22650n1 = z11;
            this.f22636m1 = z10;
            if (z11) {
                this.f22676p1 = SystemClock.elapsedRealtime();
            } else {
                if (z10) {
                    f7 = 1.0f;
                }
                this.f22663o1 = f7;
            }
            invalidate();
        }
    }

    @Override
    public final boolean g() {
        ej ejVar = this.K;
        if (ejVar != null && ejVar.f15399i) {
            bj bjVar = this.L;
            if (bjVar != null && (bjVar.f14783l & 4) != 0) {
                return this.E;
            }
            return true;
        }
        return this.E;
    }

    public final boolean g0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.g0(android.view.MotionEvent):boolean");
    }

    public final void g1(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.g1(android.graphics.Canvas):void");
    }

    public final boolean g2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.g2():boolean");
    }

    public final void g3(boolean z10, boolean z11) {
        this.B6 = z10;
        this.f22743u6 = z11;
        P3();
        if (this.A4) {
            this.C4.f29699o = v2();
        } else {
            this.B4.f27843p = v2();
        }
        invalidate();
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return new y0(this);
    }

    public int getAdditionalPaddingHeight() {
        return this.Cc;
    }

    public CharSequence getAdminAccessibilityText() {
        StaticLayout staticLayout = this.Y8;
        if (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.Y8.getText());
        mg.a[] aVarArr = (mg.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), mg.a.class);
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

    @Override
    public float getAlpha() {
        if (this.eb) {
            return this.f22562fb;
        }
        return super.getAlpha();
    }

    public org.telegram.ui.Components.o5[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.getAnimatedEmojiSpans():org.telegram.ui.Components.o5[]");
    }

    public float getAnimationOffsetX() {
        return this.Uc;
    }

    public ImageReceiver getAvatarImage() {
        if (this.E6) {
            return this.f22794y7;
        }
        return null;
    }

    public aa0 getBackgroundDrawable() {
        return this.Ra;
    }

    public int getBackgroundDrawableBottom() {
        int i10;
        bj bjVar = this.L;
        int i11 = 0;
        if (bjVar != null) {
            int i12 = 4;
            if ((bjVar.f14783l & 4) == 0) {
                i10 = org.telegram.messenger.i0.L(3.0f);
            } else {
                i10 = 0;
            }
            if ((this.L.f14783l & 8) == 0) {
                jj jjVar = this.O5;
                if (jjVar != null && jjVar.P3()) {
                    i12 = 3;
                }
                i10 += org.telegram.messenger.i0.L(i12);
            }
        } else {
            i10 = 0;
        }
        boolean z10 = this.J;
        if (!z10 || !this.I) {
            if (z10) {
                i11 = org.telegram.messenger.i0.L(1.0f);
            } else {
                i11 = org.telegram.messenger.i0.L(2.0f);
            }
        }
        int backgroundDrawableTop = ((getBackgroundDrawableTop() + this.f22519c7) - i11) + i10;
        if (!this.A6) {
            if (this.I) {
                backgroundDrawableTop += org.telegram.messenger.i0.L(1.0f);
            }
            if (this.J) {
                return org.telegram.messenger.i0.L(1.0f) + backgroundDrawableTop;
            }
        }
        return backgroundDrawableTop;
    }

    public int getBackgroundDrawableLeft() {
        int compactInShift;
        int i10;
        jj messageObject = getMessageObject();
        int i11 = 0;
        float f7 = 9.0f;
        if (messageObject != null && messageObject.P3()) {
            if (this.f22772wb) {
                return (this.f22505b7 - this.Z6) - ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.i0.L(9.0f)));
            }
            int i12 = this.f22505b7 - this.Z6;
            if (this.A6) {
                i11 = org.telegram.messenger.i0.L(9.0f);
            }
            return i12 - i11;
        }
        float f10 = 71.0f;
        if (this.f22772wb) {
            if (!I2()) {
                if ((this.f22532d6 || ((messageObject != null && (messageObject.f16328h2 || messageObject.f16336j2 || messageObject.f16337k.guestchat_via_from != null)) || jj.B0(messageObject.f16337k) == 489000)) && this.E6) {
                    i11 = 48;
                }
                f10 = i11 + 3;
            }
            compactInShift = org.telegram.messenger.i0.L(f10) + ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.i0.L(6.0f)));
        } else {
            if (!I2()) {
                if ((this.f22532d6 || ((messageObject != null && (messageObject.f16328h2 || messageObject.f16336j2 || messageObject.f16337k.guestchat_via_from != null)) || jj.B0(messageObject.f16337k) == 489000)) && this.E6) {
                    i11 = 48;
                }
                f10 = i11;
            }
            int L = org.telegram.messenger.i0.L(f10);
            if (!this.A6) {
                f7 = 3.0f;
            }
            compactInShift = getCompactInShift() + org.telegram.messenger.i0.L(f7) + L;
        }
        ej ejVar = this.K;
        if (ejVar != null && !ejVar.f15399i && (i10 = this.L.f14781j) != 0) {
            compactInShift += (int) Math.ceil((i10 / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.f22772wb) {
            if (this.J) {
                return compactInShift + ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.i0.L(6.0f)));
            }
        } else if (!this.A6 && this.J) {
            return org.telegram.messenger.i0.L(6.0f) + compactInShift;
        }
        return compactInShift;
    }

    public int getBackgroundDrawableRight() {
        int L;
        int i10;
        int backgroundDrawableLeft;
        jj jjVar;
        jj jjVar2;
        int i11 = this.Z6;
        if (this.f22772wb) {
            i10 = i11 - ((int) (getVideoTranscriptionProgress() * org.telegram.messenger.i0.L(3.0f)));
            if (this.J && (jjVar2 = this.O5) != null && jjVar2.P3()) {
                i10 = (int) (i10 - ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.i0.L(6.0f)));
            }
            if (this.J && ((jjVar = this.O5) == null || !jjVar.P3())) {
                i10 = (int) (i10 - ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.i0.L(6.0f)));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            if (this.A6) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(3.0f);
            }
            i10 = i11 - L;
            if (!this.A6 && this.J) {
                i10 -= org.telegram.messenger.i0.L(6.0f);
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        }
        return backgroundDrawableLeft + i10;
    }

    public int getBackgroundDrawableTop() {
        int i10;
        bj bjVar = this.L;
        int i11 = 0;
        if (bjVar != null && (bjVar.f14783l & 4) == 0) {
            i10 = 0 - org.telegram.messenger.i0.L(3.0f);
        } else {
            i10 = 0;
        }
        if (!this.I) {
            i11 = org.telegram.messenger.i0.L(1.0f);
        }
        int i12 = i10 + i11;
        if (!this.A6 && this.I) {
            return i12 - org.telegram.messenger.i0.L(1.0f);
        }
        return i12;
    }

    public int getBackgroundHeight() {
        return this.f22495ab;
    }

    public ImageReceiver getBlurredPhotoImage() {
        return this.U0;
    }

    public int getBottomActionPadding() {
        x1 x1Var = this.gb;
        if (x1Var.C1) {
            return org.telegram.messenger.i0.W1(x1Var.L1, x1Var.B1, this.f22526d0);
        }
        return this.f22526d0;
    }

    @Override
    public int getBoundsLeft() {
        boolean z10;
        int i10;
        int i11;
        float f7;
        int L;
        int i12;
        float f10;
        jj jjVar = this.O5;
        if (jjVar != null && jjVar.P3()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (V2()) {
            if (this.L != null) {
                f10 = 73.0f;
            } else {
                jj jjVar2 = this.O5;
                if (jjVar2 != null && jjVar2.f16328h2) {
                    i12 = 42;
                } else {
                    i12 = 63;
                }
                f10 = i12;
            }
            i10 = org.telegram.messenger.i0.L(f10);
        } else {
            i10 = 0;
        }
        if (z10 && (V(this.O5) || this.G4)) {
            i11 = org.telegram.messenger.i0.L(48.0f);
        } else {
            i11 = 0;
        }
        int backgroundDrawableLeft = (getBackgroundDrawableLeft() - i10) - i11;
        ArrayList arrayList = this.G5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            jj jjVar3 = this.O5;
            if (jjVar3 != null && jjVar3.P3()) {
                L = (getMeasuredWidth() - widthForButtons) - org.telegram.messenger.i0.L(10.0f);
            } else {
                int i13 = this.L6;
                if (!this.A6 && !this.J) {
                    f7 = 7.0f;
                } else {
                    f7 = 1.0f;
                }
                L = i13 + org.telegram.messenger.i0.L(f7);
            }
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                i14 = Math.max(i14, ((int) (((c0) arrayList.get(i15)).f21755c * widthForButtons)) + L);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i14);
        }
        if (this.S != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.S.k()) - org.telegram.messenger.i0.L(18.0f))) / 2);
        }
        if (this.f22540e0 != null) {
            backgroundDrawableLeft = Math.min(this.Y6 - ((int) getCompactSideMenuShift()), backgroundDrawableLeft);
        }
        return Math.max(0, backgroundDrawableLeft);
    }

    @Override
    public int getBoundsRight() {
        int i10;
        float f7;
        int L;
        jj jjVar = this.O5;
        if (jjVar != null && !jjVar.P3() && (V(this.O5) || this.G4)) {
            i10 = org.telegram.messenger.i0.L(48.0f);
        } else {
            i10 = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i10;
        ArrayList arrayList = this.G5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            jj jjVar2 = this.O5;
            if (jjVar2 != null && jjVar2.P3()) {
                L = (getMeasuredWidth() - getWidthForButtons()) - org.telegram.messenger.i0.L(10.0f);
            } else {
                int i11 = this.L6;
                if (!this.A6 && !this.J) {
                    f7 = 7.0f;
                } else {
                    f7 = 1.0f;
                }
                L = i11 + org.telegram.messenger.i0.L(f7);
            }
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                c0 c0Var = (c0) arrayList.get(i13);
                float f10 = widthForButtons;
                i12 = Math.max(i12, ((int) (c0Var.f21755c * f10)) + L + ((int) (c0Var.e * f10)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, i12);
        }
        if (this.S != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.S.k() + getParentWidth()) + org.telegram.messenger.i0.L(18.0f))) / 2);
        }
        if (this.f22540e0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public hj getCaptionLayout() {
        return this.f22615k3;
    }

    public float getCaptionX() {
        x1 x1Var = this.gb;
        if (x1Var.f23554x0) {
            if (x1Var.D0) {
                this.f22689q3 += x1Var.f23487h0;
            } else if (x1Var.f23539t0) {
                float f7 = this.f22689q3;
                float f10 = x1Var.L1;
                this.f22689q3 = c3.i0.z(1.0f, f10, x1Var.f23531r0, f7 * f10);
            } else if (!jj.R4(this.O5.f16337k) || !TextUtils.isEmpty(this.O5.f16394z)) {
                this.f22689q3 += x1Var.f23487h0;
            }
        }
        return this.f22689q3;
    }

    public float getCaptionY() {
        float f7 = this.f22701r3;
        x1 x1Var = this.gb;
        if (x1Var.f23554x0) {
            if (x1Var.D0) {
                return f7 - getTranslationY();
            }
            if (x1Var.f23539t0) {
                float f10 = x1Var.L1;
                return c3.i0.z(1.0f, f10, x1Var.f23535s0, f7 * f10);
            }
            return f7;
        }
        return f7;
    }

    @Override
    public float getCheckBoxTranslation() {
        return this.f22687q1;
    }

    public int getChecksX() {
        float f7;
        int i10 = this.f22505b7;
        if (tz.Y0 >= 10) {
            f7 = 27.3f;
        } else {
            f7 = 25.3f;
        }
        return i10 - org.telegram.messenger.i0.L(f7);
    }

    public int getChecksY() {
        float f7;
        int intrinsicHeight;
        if (this.O5.O5()) {
            f7 = this.w9;
            intrinsicHeight = W1("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            f7 = this.w9;
            intrinsicHeight = org.telegram.ui.ActionBar.t6.F3.getIntrinsicHeight();
        }
        return (int) (f7 - intrinsicHeight);
    }

    public int getCompactContentWidth() {
        int parentWidth;
        if (org.telegram.messenger.i0.Q1()) {
            parentWidth = org.telegram.messenger.i0.Q0();
        } else {
            parentWidth = getParentWidth();
        }
        return (parentWidth - org.telegram.messenger.i0.L(32.0f)) - getCompactSideMenuWidth();
    }

    public int getCompactLeft() {
        return org.telegram.messenger.i0.L(16.0f);
    }

    public int getCompactRight() {
        return (getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f)) - getCompactSideMenuWidth();
    }

    public int getCurrentBackgroundLeft() {
        org.telegram.ui.ActionBar.c5 c5Var = this.J6;
        if (c5Var == null) {
            return 0;
        }
        int i10 = c5Var.getBounds().left;
        if (!this.O5.P3() && this.gb.A0 != 1.0f) {
            boolean z10 = this.f22772wb;
            if ((z10 || !this.A6) && !this.J) {
                if (z10) {
                    return (int) (i10 - (getVideoTranscriptionProgress() * org.telegram.messenger.i0.L(6.0f)));
                }
                return i10 - org.telegram.messenger.i0.L(6.0f);
            }
            return i10;
        }
        return i10;
    }

    public int getCurrentBackgroundRight() {
        boolean z10;
        org.telegram.ui.ActionBar.c5 c5Var = this.J6;
        if (c5Var == null) {
            return getWidth();
        }
        int i10 = c5Var.getBounds().right;
        if (this.O5.P3() && this.gb.A0 != 1.0f && (((z10 = this.f22772wb) || !this.A6) && !this.J)) {
            if (z10) {
                return (int) ((getVideoTranscriptionProgress() * org.telegram.messenger.i0.L(6.0f)) + i10);
            }
            return org.telegram.messenger.i0.L(6.0f) + i10;
        }
        return i10;
    }

    public TLRPC.Chat getCurrentChat() {
        return this.ia;
    }

    public ej getCurrentMessagesGroup() {
        return this.K;
    }

    public bj getCurrentPosition() {
        return this.L;
    }

    public TLRPC.User getCurrentUser() {
        return this.ha;
    }

    public l1 getDelegate() {
        return this.Qa;
    }

    @Override
    public float getDeltaBottom() {
        return this.gb.f23497j0;
    }

    public float getDeltaLeft() {
        return this.gb.f23487h0;
    }

    public float getDeltaRight() {
        return this.gb.f23492i0;
    }

    public float getDeltaTop() {
        return this.gb.f23502k0;
    }

    public float getDescriptionLayoutX() {
        int L;
        int extraTextX;
        float f7;
        float L2;
        int i10;
        int L3;
        int i11;
        boolean z10 = this.R1;
        float f10 = 0.0f;
        x1 x1Var = this.gb;
        if (z10) {
            org.telegram.messenger.i0.L(14.0f);
            L2 = this.f22662o0 - org.telegram.messenger.i0.L(10.0f);
        } else {
            if (this.S1) {
                org.telegram.messenger.i0.L(14.0f);
                i10 = this.f22662o0;
                L3 = org.telegram.messenger.i0.L(1.0f);
            } else if (this.O5.r4()) {
                org.telegram.messenger.i0.L(2.0f);
                i10 = this.f22662o0;
                L3 = org.telegram.messenger.i0.L(1.0f);
            } else {
                float f11 = 12.0f;
                if (this.O5.P3()) {
                    f7 = getExtraTextX() + org.telegram.messenger.i0.L(12.0f) + this.L6;
                    if (this.O5.D == 19) {
                        f7 -= Math.max(0.0f, ((Math.max(this.V7, this.X7) + f7) + org.telegram.messenger.i0.L(14.0f)) - org.telegram.messenger.i0.f16026q.x);
                    }
                } else {
                    if (this.A6) {
                        L = org.telegram.messenger.i0.L(12.0f) + this.L6;
                        extraTextX = getExtraTextX();
                    } else {
                        int i12 = this.L6;
                        if (!this.J) {
                            f11 = 18.0f;
                        }
                        L = org.telegram.messenger.i0.L(f11) + i12;
                        extraTextX = getExtraTextX();
                    }
                    f7 = extraTextX + L;
                }
                L2 = (f7 + x1Var.f23487h0) - org.telegram.messenger.i0.L(1.33f);
            }
            L2 = L3 + i10;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (x1Var != null) {
            f10 = x1Var.f23492i0;
        }
        float f12 = backgroundDrawableRight + f10;
        int i13 = 0;
        if (this.O5.P3() && !this.A6 && !this.J) {
            i11 = 6;
        } else {
            i11 = 0;
        }
        int L4 = (int) (((f12 - org.telegram.messenger.i0.L(10 + i11)) - getExtraTextX()) - L2);
        float L5 = L2 + org.telegram.messenger.i0.L(10.0f);
        if (Math.abs(this.a2) > 1) {
            i13 = ((L4 - org.telegram.messenger.i0.L(20.0f)) - this.Z1) - this.a2;
        }
        return L5 + i13;
    }

    public float getDescriptionLayoutY() {
        float f7;
        float f10 = this.W1;
        x1 x1Var = this.gb;
        if (!x1Var.f23537s2) {
            f7 = (-x1Var.f23502k0) + x1Var.f23497j0;
        } else {
            f7 = 0.0f;
        }
        return f10 + f7;
    }

    public StaticLayout getDescriptionlayout() {
        return this.f22651n2;
    }

    public TLRPC.TL_availableEffect getEffect() {
        jj jjVar;
        bj bjVar = this.L;
        if ((bjVar != null && !bjVar.h) || (jjVar = this.O5) == null) {
            return null;
        }
        return jjVar.M0();
    }

    public hj getExplanationLayout() {
        return this.f22665o3;
    }

    public float getExplanationX() {
        return this.f22716s5;
    }

    public float getExplanationY() {
        return this.f22729t5;
    }

    public int getExtraInsetHeight() {
        int i10;
        int i11 = this.f22740u3;
        boolean d22 = d2();
        sg.p0 p0Var = this.N;
        if (d22) {
            if (p0Var.f48450p) {
                i10 = 18;
            } else {
                i10 = 0;
            }
            i11 += org.telegram.messenger.i0.L(i10 + 2) + this.f22698r0.f22979r;
        }
        if (this.f22756v7) {
            i11 += getCommentButtonHeight();
        }
        if (!p0Var.f48450p) {
            this.O5.getClass();
            return i11 + p0Var.f48448n;
        }
        return i11;
    }

    public int getExtraTextX() {
        int i10 = tz.Y0;
        if (i10 >= 15) {
            return org.telegram.messenger.i0.L(2.0f);
        }
        if (i10 >= 11) {
            return org.telegram.messenger.i0.L(1.0f);
        }
        return 0;
    }

    public int getExtraTimeX() {
        int i10;
        if (r2()) {
            return 0;
        }
        if (!this.O5.P3() && ((!this.A6 || this.f22615k3 != null) && (i10 = tz.Y0) > 11)) {
            return org.telegram.messenger.i0.L((i10 - 11) / 1.5f);
        }
        if (this.O5.P3() || !this.xb || !this.E6 || this.O5.D != 5) {
            return 0;
        }
        return (int) ((org.telegram.messenger.i0.f3(this.V6, t2()) - org.telegram.messenger.i0.f16030u) * 0.7f);
    }

    public StaticLayout getFactCheckLayout() {
        s1 s1Var = this.f22698r0;
        if (s1Var != null) {
            return s1Var.f22969g;
        }
        return null;
    }

    public String getFilename() {
        int i10;
        int i11;
        jj jjVar = this.O5;
        if (jjVar != null) {
            int i12 = jjVar.D;
            if (i12 == 1) {
                TLRPC.PhotoSize photoSize = this.f22516c4;
                if (photoSize != null) {
                    return org.telegram.messenger.b8.r(null, photoSize);
                }
            } else if (i12 != 8 && (i11 = this.K1) != 7 && i11 != 4 && i11 != 8 && i12 != 9 && i11 != 3 && i11 != 5) {
                if (i11 != 0) {
                    return org.telegram.messenger.b8.r(null, this.L1);
                }
                TLRPC.PhotoSize photoSize2 = this.f22516c4;
                if (photoSize2 != null) {
                    return org.telegram.messenger.b8.r(null, photoSize2);
                }
            } else if (!jjVar.C0) {
                if (jjVar.f16383w0 && !TextUtils.isEmpty(jjVar.f16337k.attachPath)) {
                    return this.O5.f16337k.attachPath;
                }
                if (!this.O5.n4() || (i10 = this.K1) == 3 || i10 == 5) {
                    return this.O5.S0();
                }
            }
        }
        return null;
    }

    public int getForwardNameCenterX() {
        float f7;
        TLRPC.User user = this.ha;
        if (user != null && user.f19942id == 0) {
            f7 = this.f22794y7.r();
        } else {
            f7 = this.f22707r9 + this.H1;
        }
        return (int) f7;
    }

    public float getHighlightAlpha() {
        return M1(false);
    }

    public int getIconForCurrentState() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.getIconForCurrentState():int");
    }

    public float getLastTouchX() {
        return this.f22565g1;
    }

    public float getLastTouchY() {
        return this.f22576h1;
    }

    public int getLayoutHeight() {
        return this.f22519c7;
    }

    public int getMaxNameWidth() {
        int min;
        int L;
        jj jjVar;
        jj jjVar2;
        int i10;
        int i11;
        float f7;
        int L2;
        int parentWidth;
        bj bjVar;
        int i12 = this.K1;
        if (i12 != 6 && i12 != 8 && (i10 = (jjVar2 = this.O5).D) != 5) {
            ej ejVar = this.K;
            int i13 = 0;
            if (ejVar != null && !ejVar.f15399i) {
                if (org.telegram.messenger.i0.Q1()) {
                    parentWidth = org.telegram.messenger.i0.Q0();
                } else {
                    parentWidth = getParentWidth();
                }
                i11 = 0;
                for (int i14 = 0; i14 < this.K.e.size(); i14++) {
                    if (((bj) this.K.e.get(i14)).f14777c != 0) {
                        break;
                    }
                    i11 = (int) (Math.ceil(((bjVar.e + bjVar.f14781j) / 1000.0f) * parentWidth) + i11);
                }
                if (this.V6) {
                    i13 = 71;
                } else if (V2()) {
                    i13 = 48;
                }
                L2 = org.telegram.messenger.i0.L(i13 + 31);
            } else if (i10 == 19) {
                int i15 = jjVar2.f16374t2;
                int L3 = org.telegram.messenger.i0.f16026q.x - org.telegram.messenger.i0.L(52.0f);
                if (this.E6) {
                    i13 = org.telegram.messenger.i0.L(48.0f);
                }
                return Math.max(i15, (int) ((L3 - i13) * 0.5f));
            } else {
                i11 = this.Z6;
                if (jjVar2.f16343l2 && jjVar2.P3() && V(this.O5)) {
                    i11 -= org.telegram.messenger.i0.L(25.0f);
                }
                if (this.A6) {
                    f7 = 22.0f;
                } else {
                    f7 = 31.0f;
                }
                L2 = org.telegram.messenger.i0.L(f7);
            }
            return i11 - L2;
        }
        float f10 = 0.0f;
        if (org.telegram.messenger.i0.Q1()) {
            min = org.telegram.messenger.i0.Q0();
            if (this.V6) {
                f10 = 71.0f;
            } else if (V2()) {
                f10 = 42.0f;
            }
            L = org.telegram.messenger.i0.L(f10);
        } else {
            min = Math.min(getParentWidth(), org.telegram.messenger.i0.f16026q.y);
            if (this.V6) {
                f10 = 71.0f;
            } else if (V2()) {
                f10 = 42.0f;
            }
            L = org.telegram.messenger.i0.L(f10);
        }
        int i16 = min - L;
        jj jjVar3 = this.O5;
        if (jjVar3 != null && jjVar3.f16343l2 && jjVar3.P3() && V(this.O5)) {
            i16 -= org.telegram.messenger.i0.L(25.0f);
        }
        if (this.xb && ((jjVar = this.O5) == null || !jjVar.T4())) {
            return (i16 - (this.Z6 - (org.telegram.messenger.i0.f3(this.V6, t2()) - org.telegram.messenger.i0.f16030u))) - org.telegram.messenger.i0.L(57.0f);
        }
        if (this.V6 && (this.O5.D == 5 || this.K1 == 6)) {
            return this.Z6 - org.telegram.messenger.i0.L(57.0f);
        }
        return (i16 - this.Z6) - org.telegram.messenger.i0.L(57.0f);
    }

    public int getMediaOffsetY() {
        x1 x1Var = this.gb;
        if (x1Var.a2) {
            return org.telegram.messenger.i0.W1(x1Var.L1, x1Var.Z1, this.V1);
        }
        return this.V1;
    }

    @Override
    public jj getMessageObject() {
        jj jjVar = this.P5;
        if (jjVar != null) {
            return jjVar;
        }
        return this.O5;
    }

    public int getMiniIconForCurrentState() {
        int i10 = this.V3;
        if (i10 < 0) {
            return 4;
        }
        if (i10 == 0) {
            return 2;
        }
        return 3;
    }

    public int getNameStatusX() {
        int i10;
        float f7 = this.f22560f9 + this.f22548e9;
        int i11 = this.P6;
        if (i11 > 0) {
            i10 = i11 - org.telegram.messenger.i0.L(32.0f);
        } else {
            i10 = this.U8;
        }
        return (int) (f7 + i10 + org.telegram.messenger.i0.L(2.0f) + (org.telegram.messenger.i0.L(20.0f) / 2));
    }

    public int getNameStatusY() {
        int height;
        float f7 = this.f22573g9;
        StaticLayout staticLayout = this.T8;
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
        return this.X5;
    }

    public float getPaddingTopAnimated() {
        return getTopicSeparatorTopPadding() + this.V + this.f22575h0;
    }

    public int getParentWidth() {
        int i10;
        jj jjVar = this.O5;
        if (jjVar == null) {
            jjVar = this.P5;
        }
        if (jjVar != null && jjVar.f16365r1 && (i10 = this.K0) > 0) {
            return i10;
        }
        return org.telegram.messenger.i0.f16026q.x;
    }

    public float getPhotoBottom() {
        if (Y3()) {
            float f7 = this.f22496ac;
            if (f7 > 0.0f) {
                return f7;
            }
            return this.f22519c7 - org.telegram.messenger.i0.L(5.0f);
        }
        n4 n4Var = this.V5;
        if (n4Var != null) {
            return n4Var.e + n4Var.h;
        }
        return this.T0.A();
    }

    public ImageReceiver getPhotoImage() {
        return this.T0;
    }

    public ArrayList<p1> getPollButtons() {
        return this.O4;
    }

    public float getPollButtonsLeft() {
        int L;
        if (getMessageObject() != null && getMessageObject().P3()) {
            L = (org.telegram.messenger.i0.L(3.0f) + this.f22505b7) - this.Z6;
        } else if (this.W6) {
            L = org.telegram.messenger.i0.L(82.0f);
        } else if (V2()) {
            L = org.telegram.messenger.i0.L(59.0f);
        } else {
            L = org.telegram.messenger.i0.L(11.0f);
        }
        return L;
    }

    public float getPollButtonsRight() {
        return (getPollButtonsLeft() + this.Z6) - org.telegram.messenger.i0.L(15.0f);
    }

    public jj getPrimaryMessageObject() {
        jj jjVar;
        jj jjVar2 = this.O5;
        if (jjVar2 != null && this.K != null && jjVar2.z2()) {
            jjVar = this.K.c();
        } else {
            jjVar = null;
        }
        if (jjVar != null) {
            return jjVar;
        }
        return this.O5;
    }

    public RadialProgress2 getRadialProgress() {
        return this.P0;
    }

    public sg.p0 getReactionsLayout() {
        return this.N;
    }

    public int getRepliesCount() {
        ej ejVar = this.K;
        if (ejVar != null && !ejVar.d.isEmpty()) {
            return ((jj) this.K.d.get(0)).N1();
        }
        return this.O5.N1();
    }

    public org.telegram.ui.ActionBar.p6 getResourcesProvider() {
        return this.Ob;
    }

    public qn0 getSeekBarWaveform() {
        return this.C4;
    }

    public float getSideButtonStartX() {
        return this.P8;
    }

    public float getSideButtonStartY() {
        return this.Q8;
    }

    @Override
    public float getSlidingOffsetX() {
        return this.Tc;
    }

    public long getStarsPrice() {
        TLRPC.Message message;
        long j10;
        TLRPC.Message message2;
        ej ejVar = this.K;
        if (ejVar != null) {
            ArrayList arrayList = ejVar.d;
            int size = arrayList.size();
            int i10 = 0;
            long j11 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                jj jjVar = (jj) obj;
                if (jjVar != null && (message2 = jjVar.f16337k) != null) {
                    j10 = message2.paid_message_stars;
                } else {
                    j10 = 0;
                }
                j11 += j10;
            }
            return j11;
        }
        jj jjVar2 = this.O5;
        if (jjVar2 == null || (message = jjVar2.f16337k) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        x1 x1Var = this.gb;
        if (x1Var.f23563z1) {
            return org.telegram.messenger.i0.W1(x1Var.L1, x1Var.f23559y1, this.V);
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
        return this.f22649n0;
    }

    public int getTextY() {
        return this.f22724t0;
    }

    public float getTimeAlpha() {
        return this.f22591i4;
    }

    public float getTimeX() {
        int i10;
        x1 x1Var = this.gb;
        if (x1Var.f23493i1) {
            i10 = org.telegram.messenger.i0.W1(x1Var.L1, x1Var.f23488h1, this.A9);
        } else {
            i10 = this.A9;
        }
        return i10;
    }

    public float getTimeY() {
        int i10;
        int i11 = 0;
        if (B3()) {
            if (this.f22756v7) {
                i11 = r2() ? getCommentButtonHeight() : org.telegram.messenger.i0.L(41.3f);
            }
        } else if (this.O5.r4()) {
            i10 = -org.telegram.messenger.i0.L(48.0f);
            if (this.f22491a7) {
                i10 -= org.telegram.messenger.i0.L(4.0f);
            }
            return Y1(i10);
        } else if (this.f22756v7) {
            i11 = r2() ? getCommentButtonHeight() : org.telegram.messenger.i0.L(43.0f);
        }
        i10 = -i11;
        return Y1(i10);
    }

    public int getTopMediaOffset() {
        jj jjVar = this.O5;
        if (jjVar != null && jjVar.D == 14) {
            return this.V1 + this.Sa;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        x1 x1Var = this.gb;
        if (x1Var.f23547v1) {
            return org.telegram.messenger.i0.W1(x1Var.L1, x1Var.f23544u1, this.f22552f0);
        }
        return this.f22552f0;
    }

    public x1 getTransitionParams() {
        return this.gb;
    }

    public float getVideoTranscriptionProgress() {
        jj jjVar;
        x1 x1Var = this.gb;
        if (x1Var == null || (jjVar = this.O5) == null || !jjVar.h4()) {
            return 1.0f;
        }
        if (x1Var.f23511m1) {
            if (this.G6) {
                return x1Var.L1;
            }
            return 1.0f - x1Var.L1;
        } else if (this.G6) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public float getViewTop() {
        return this.Za;
    }

    public int getWidthForButtons() {
        x1 x1Var = this.gb;
        if (x1Var.O1) {
            return org.telegram.messenger.i0.W1(x1Var.L1, x1Var.P1, this.I5);
        }
        return this.I5;
    }

    public final boolean h0(MotionEvent motionEvent) {
        l9 g22;
        boolean z10;
        boolean z11;
        int i10;
        int L;
        int i11;
        s1 s1Var;
        int L2;
        int extraTextX;
        int i12;
        ej ejVar;
        l1 l1Var = this.Qa;
        if (l1Var != null && (g22 = l1Var.g2()) != null && (g22.b() || g22.e())) {
            ArrayList arrayList = this.O5.f16397z2;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            vv vvVar = this.O5.f16385w2;
            if (vvVar != null && !vvVar.f18996n.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((z10 || a2() || z11) && ((this.f22600j1 || this.K != null) && (this.K == null || this.Qa.Q()))) {
                if (this.O5.z2() && (ejVar = this.K) != null && !ejVar.f15399i) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                            View childAt = viewGroup.getChildAt(i13);
                            if (childAt instanceof q1) {
                                q1 q1Var = (q1) childAt;
                                ej currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                                bj currentPosition = q1Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.f15394a == this.K.f15394a && (currentPosition.f14783l & F()) != 0 && (currentPosition.f14783l & 1) != 0) {
                                    g22.f23416c = (int) q1Var.f22689q3;
                                    g22.d = (int) q1Var.f22701r3;
                                    g22.b0(q1Var);
                                    if (q1Var == this) {
                                        return g22.M(motionEvent);
                                    }
                                    motionEvent.offsetLocation(getLeft() - q1Var.getLeft(), getTop() - q1Var.getTop());
                                    boolean M = g22.M(motionEvent);
                                    motionEvent.offsetLocation(-(getLeft() - q1Var.getLeft()), -(getTop() - q1Var.getTop()));
                                    return M;
                                }
                            }
                        }
                    }
                } else {
                    jj jjVar = this.O5;
                    if (jjVar != null && !jjVar.f16365r1 && (s1Var = this.f22698r0) != null && s1Var.f22969g != null && K1(motionEvent) >= this.f22686q0) {
                        g22.f22261r0 = false;
                        g22.f22263t0 = true;
                        g22.f22265v0 = false;
                        ej ejVar2 = this.K;
                        if (ejVar2 != null && !ejVar2.f15399i) {
                            i12 = (int) this.f22689q3;
                        } else {
                            float f7 = 12.0f;
                            if (this.O5.P3()) {
                                int extraTextX2 = getExtraTextX() + org.telegram.messenger.i0.L(12.0f) + this.L6;
                                if (this.O5.D == 19) {
                                    i12 = extraTextX2 - Math.max(0, (org.telegram.messenger.i0.L(14.0f) + (Math.max(this.V7, this.X7) + extraTextX2)) - org.telegram.messenger.i0.f16026q.x);
                                } else {
                                    i12 = extraTextX2;
                                }
                            } else {
                                if (this.A6) {
                                    L2 = org.telegram.messenger.i0.L(12.0f) + this.L6;
                                    extraTextX = getExtraTextX();
                                } else {
                                    int i14 = this.L6;
                                    if (!this.J) {
                                        f7 = 18.0f;
                                    }
                                    L2 = org.telegram.messenger.i0.L(f7) + i14;
                                    extraTextX = getExtraTextX();
                                }
                                i12 = extraTextX + L2;
                            }
                        }
                        int L3 = ((int) (i12 + this.gb.f23487h0)) - org.telegram.messenger.i0.L(1.33f);
                        int i15 = this.f22686q0;
                        g22.f23416c = (org.telegram.messenger.i0.L(10.0f) + L3) - this.f22698r0.f22976o;
                        g22.d = org.telegram.messenger.i0.L(22.0f) + i15;
                    } else {
                        if (z11 && L2()) {
                            if (K1(motionEvent) < this.O5.f16385w2.t() + this.f22724t0) {
                                g22.f22261r0 = false;
                                g22.f22263t0 = false;
                                g22.f22265v0 = true;
                                int i16 = this.f22649n0;
                                int i17 = this.f22724t0;
                                g22.f23416c = i16;
                                g22.d = i17;
                            }
                        }
                        if (a2()) {
                            g22.f22261r0 = false;
                            g22.f22263t0 = false;
                            g22.f22265v0 = false;
                            g22.f23416c = (int) this.f22689q3;
                            g22.d = (int) this.f22701r3;
                        } else {
                            jj jjVar2 = this.O5;
                            if (jjVar2 != null && !jjVar2.f16365r1 && this.f22651n2 != null && (!this.f22725t1 ? K1(motionEvent) > this.W1 : K1(motionEvent) < this.f22724t0)) {
                                g22.f22261r0 = true;
                                g22.f22263t0 = false;
                                g22.f22265v0 = false;
                                if (this.R1) {
                                    i11 = this.f22662o0 - org.telegram.messenger.i0.L(10.0f);
                                } else {
                                    if (this.S1) {
                                        i10 = this.f22662o0;
                                        L = org.telegram.messenger.i0.L(1.0f);
                                    } else {
                                        i10 = this.f22662o0;
                                        L = org.telegram.messenger.i0.L(1.0f);
                                    }
                                    i11 = i10 + L;
                                }
                                int L4 = org.telegram.messenger.i0.L(10.0f) + i11 + this.Y1;
                                int i18 = this.W1;
                                g22.f23416c = L4;
                                g22.d = i18;
                            } else if (z11) {
                                g22.f22261r0 = false;
                                g22.f22263t0 = false;
                                g22.f22265v0 = true;
                                int i19 = this.f22649n0;
                                int i20 = this.f22724t0;
                                g22.f23416c = i19;
                                g22.d = i20;
                            } else {
                                g22.f22261r0 = false;
                                g22.f22263t0 = false;
                                g22.f22265v0 = false;
                                int i21 = this.f22649n0;
                                int i22 = this.f22724t0;
                                g22.f23416c = i21;
                                g22.d = i22;
                            }
                        }
                    }
                    g22.b0(this);
                    return g22.M(motionEvent);
                }
            }
        }
        return false;
    }

    public void h1(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.h1(android.graphics.Canvas):void");
    }

    public final boolean h2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.h2():boolean");
    }

    public final void h3(boolean z10, boolean z11, boolean z12) {
        jj jjVar;
        if (z10 || !z12 || (jjVar = this.O5) == null || !jjVar.f16295a0) {
            CheckBoxBase checkBoxBase = this.l1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z11, z12);
            }
            CheckBoxBase checkBoxBase2 = this.f22613k1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z10, z12);
            }
            aa0 aa0Var = this.Ra;
            float f7 = 0.0f;
            if (aa0Var.e == z11) {
                if (aa0Var.f24345f != z12 && !z12) {
                    if (z11) {
                        f7 = 1.0f;
                    }
                    aa0Var.d = f7;
                    aa0Var.f24345f = false;
                    return;
                }
                return;
            }
            aa0Var.e = z11;
            aa0Var.f24345f = z12;
            if (z12) {
                aa0Var.f24344c = SystemClock.elapsedRealtime();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                aa0Var.d = f7;
            }
            aa0Var.a();
            q1 q1Var = aa0Var.f24351m;
            if (q1Var != null) {
                q1Var.invalidate();
                if (q1Var.getParent() != null) {
                    ((ViewGroup) q1Var.getParent()).invalidate();
                }
            }
        }
    }

    @Override
    public final void i(long j10, long j11) {
        float min;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.O5.F0 = j10;
        x0(j10, j11);
        if (this.f22776x1) {
            this.Q0.p(true, min);
        } else {
            this.P0.p(true, min);
        }
        int i10 = this.K1;
        if (i10 != 3 && i10 != 5) {
            if (this.U3 != 0) {
                if (this.V3 != 1) {
                    K3(false, false, false);
                }
            } else if (this.M3 != 1) {
                K3(false, false, false);
            }
        } else if (this.U3 != 0) {
            if (this.V3 != 1) {
                K3(false, false, false);
            }
        } else if (this.M3 != 4) {
            K3(false, false, false);
        }
    }

    public final boolean i0(MotionEvent motionEvent) {
        if (this.O5.r4() && this.O5.Z0) {
            int x10 = (int) motionEvent.getX();
            int K1 = (int) K1(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f7 = x10;
                if (f7 >= this.f22589i2 - org.telegram.messenger.i0.L(6.0f) && f7 <= this.f22589i2 + this.f22566g2 + org.telegram.messenger.i0.L(6.0f)) {
                    float f10 = K1;
                    if (f10 >= this.f22601j2 - org.telegram.messenger.i0.L(2.0f) && f10 <= this.f22601j2 + this.f22577h2 + org.telegram.messenger.i0.L(2.0f)) {
                        dc dcVar = this.f22626l2;
                        if (dcVar != null) {
                            dcVar.c(true);
                        }
                        this.f22614k2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.f22614k2) {
                l1 l1Var = this.Qa;
                if (l1Var != null) {
                    l1Var.B1();
                }
                dc dcVar2 = this.f22626l2;
                if (dcVar2 != null) {
                    dcVar2.c(false);
                }
                playSoundEffect(0);
                this.f22614k2 = false;
            }
        }
        return false;
    }

    public final void i1(Canvas canvas, RectF rectF) {
        float f7;
        Path path = this.f22804z4;
        path.rewind();
        path.addRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        ag.c2 c2Var = this.T0;
        float alpha = c2Var.getAlpha();
        if (this.O5.g4()) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        c2Var.setAlpha(f7 * alpha);
        c2Var.h(canvas, null);
        c2Var.setAlpha(alpha);
        canvas.restore();
        Paint X1 = X1("paintChatTimeBackground");
        int alpha2 = X1.getAlpha();
        X1.setAlpha((int) (alpha2 * this.f22603j4 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, X1);
        X1.setAlpha(alpha2);
    }

    public final boolean i2() {
        jj jjVar = this.O5;
        if (jjVar != null && jjVar.N5()) {
            bj bjVar = this.L;
            if (bjVar != null) {
                int i10 = bjVar.f14783l;
                if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                    return false;
                }
            }
            this.N.getClass();
            return true;
        }
        return false;
    }

    public final boolean i3(boolean z10) {
        ep epVar;
        q1 q1Var;
        if (this.O5.T2()) {
            Drawable t10 = this.T0.t();
            if (t10 instanceof org.telegram.ui.Components.zh0) {
                final org.telegram.ui.Components.zh0 zh0Var = (org.telegram.ui.Components.zh0) t10;
                String C0 = this.O5.C0();
                TLRPC.TL_messages_stickerSet n02 = ui.b0(this.Y5).n0(C0);
                if (n02 == null) {
                    ui.b0(this.Y5).c1(C0, true, true);
                    return false;
                }
                int D0 = this.O5.D0();
                if ("🎰".equals(this.O5.C0())) {
                    if (D0 >= 0 && D0 <= 64) {
                        cv0 cv0Var = (cv0) zh0Var;
                        if (cv0Var.U0 != null || cv0Var.V0) {
                            q1Var = this;
                        } else {
                            int i10 = D0 - 1;
                            int X = cv0.X(i10 & 3);
                            int X2 = cv0.X((i10 >> 2) & 3);
                            int X3 = cv0.X(i10 >> 4);
                            if (X == 4 && X2 == 4 && X3 == 4) {
                                X = 5;
                                X3 = 5;
                                X2 = 5;
                            }
                            cv0Var.f25178b1 = X;
                            cv0Var.f25179c1 = X2;
                            cv0Var.f25180d1 = X3;
                            jj messageObject = getMessageObject();
                            int i11 = getMessageObject().I1;
                            cv0Var.V0 = true;
                            q1Var = this;
                            Utilities.e.c(new bi.y2(cv0Var, n02, i11, messageObject, q1Var, z10));
                        }
                        if (q1Var.O5.N3()) {
                            zh0Var.S(Integer.MAX_VALUE, q1Var.f22660nb);
                        }
                        q1Var.O5.l1 = false;
                    } else {
                        q1Var = this;
                    }
                    if (zh0Var.m0 == null && !zh0Var.Y0 && n02.documents.size() > 0) {
                        cv0 cv0Var2 = (cv0) zh0Var;
                        if (cv0Var2.m0 == null && !cv0Var2.Y0) {
                            cv0Var2.Y0 = true;
                            Utilities.e.c(new i2.g1(cv0Var2, n02, getMessageObject().I1, getMessageObject(), q1Var, 13));
                            return true;
                        }
                    }
                } else {
                    if (zh0Var.m0 == null && !zh0Var.Y0 && n02.documents.size() > 0) {
                        TLRPC.Document document = n02.documents.get(0);
                        org.telegram.messenger.b8.G(this.Y5);
                        File K = org.telegram.messenger.b8.K(document, null, true, true);
                        if (zh0Var.m0 == null && !zh0Var.Y0) {
                            final String y22 = org.telegram.messenger.i0.y2(K, 0);
                            if (TextUtils.isEmpty(y22)) {
                                org.telegram.messenger.b6.q(this.Y5).a(org.telegram.messenger.b8.r(null, document), this.O5, this);
                                org.telegram.messenger.b8.G(this.Y5).X(document, n02, 1, 1);
                            } else {
                                zh0Var.Y0 = true;
                                Utilities.e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final zh0 zh0Var2 = zh0Var;
                                                String str = y22;
                                                if (zh0Var2.W0) {
                                                    org.telegram.messenger.i0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    zh0 zh0Var3 = zh0Var2;
                                                                    zh0Var3.Y0 = false;
                                                                    if (!zh0Var3.V0 && zh0Var3.W0) {
                                                                        zh0Var3.C(true);
                                                                        return;
                                                                    }
                                                                    zh0Var3.l();
                                                                    zh0Var3.I();
                                                                    zh0Var3.x();
                                                                    return;
                                                                default:
                                                                    zh0 zh0Var4 = zh0Var2;
                                                                    zh0Var4.V0 = false;
                                                                    if (!zh0Var4.Y0 && zh0Var4.W0) {
                                                                        zh0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                zh0Var2.U0 = RLottieNative.b(str, null, null, null);
                                                int i12 = 0;
                                                if (zh0Var2.U0 != null) {
                                                    i12 = zh0Var2.U0.f24120a[0];
                                                }
                                                if (zh0Var2.U0 != null) {
                                                    int i13 = zh0Var2.U0.f24120a[1];
                                                }
                                                org.telegram.messenger.i0.g3(new qq(zh0Var2, i12, 4));
                                                return;
                                            default:
                                                final zh0 zh0Var3 = zh0Var;
                                                zh0Var3.m0 = RLottieNative.b(y22, zh0Var3.e, null, null);
                                                org.telegram.messenger.i0.g3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                zh0 zh0Var32 = zh0Var3;
                                                                zh0Var32.Y0 = false;
                                                                if (!zh0Var32.V0 && zh0Var32.W0) {
                                                                    zh0Var32.C(true);
                                                                    return;
                                                                }
                                                                zh0Var32.l();
                                                                zh0Var32.I();
                                                                zh0Var32.x();
                                                                return;
                                                            default:
                                                                zh0 zh0Var4 = zh0Var3;
                                                                zh0Var4.V0 = false;
                                                                if (!zh0Var4.Y0 && zh0Var4.W0) {
                                                                    zh0Var4.C(true);
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
                        org.telegram.messenger.b6.q(this.Y5).v(this);
                    }
                    if (D0 >= 0 && D0 < n02.documents.size()) {
                        if (!z10 && this.O5.N3() && (epVar = (ep) vp.r1(this.Y5).f18810i4.get(C0)) != null && epVar.f15440b == D0) {
                            zh0Var.S(epVar.f15439a, this.f22660nb);
                        }
                        TLRPC.Document document2 = n02.documents.get(Math.max(D0, 0));
                        org.telegram.messenger.b8.G(this.Y5);
                        File K2 = org.telegram.messenger.b8.K(document2, null, true, true);
                        if (zh0Var.U0 == null && !zh0Var.V0) {
                            final String y23 = org.telegram.messenger.i0.y2(K2, 0);
                            if (TextUtils.isEmpty(y23)) {
                                org.telegram.messenger.b6.q(this.Y5).a(org.telegram.messenger.b8.r(null, document2), this.O5, this);
                                org.telegram.messenger.b8.G(this.Y5).X(document2, n02, 1, 1);
                                this.O5.l1 = false;
                            } else {
                                if (z10 && zh0Var.Q == null && zh0Var.R == null && zh0Var.P == null) {
                                    zh0Var.J = 2;
                                    zh0Var.X0 = true;
                                }
                                zh0Var.V0 = true;
                                Utilities.e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final zh0 zh0Var2 = zh0Var;
                                                String str = y23;
                                                if (zh0Var2.W0) {
                                                    org.telegram.messenger.i0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    zh0 zh0Var32 = zh0Var2;
                                                                    zh0Var32.Y0 = false;
                                                                    if (!zh0Var32.V0 && zh0Var32.W0) {
                                                                        zh0Var32.C(true);
                                                                        return;
                                                                    }
                                                                    zh0Var32.l();
                                                                    zh0Var32.I();
                                                                    zh0Var32.x();
                                                                    return;
                                                                default:
                                                                    zh0 zh0Var4 = zh0Var2;
                                                                    zh0Var4.V0 = false;
                                                                    if (!zh0Var4.Y0 && zh0Var4.W0) {
                                                                        zh0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                zh0Var2.U0 = RLottieNative.b(str, null, null, null);
                                                int i12 = 0;
                                                if (zh0Var2.U0 != null) {
                                                    i12 = zh0Var2.U0.f24120a[0];
                                                }
                                                if (zh0Var2.U0 != null) {
                                                    int i13 = zh0Var2.U0.f24120a[1];
                                                }
                                                org.telegram.messenger.i0.g3(new qq(zh0Var2, i12, 4));
                                                return;
                                            default:
                                                final zh0 zh0Var3 = zh0Var;
                                                zh0Var3.m0 = RLottieNative.b(y23, zh0Var3.e, null, null);
                                                org.telegram.messenger.i0.g3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                zh0 zh0Var32 = zh0Var3;
                                                                zh0Var32.Y0 = false;
                                                                if (!zh0Var32.V0 && zh0Var32.W0) {
                                                                    zh0Var32.C(true);
                                                                    return;
                                                                }
                                                                zh0Var32.l();
                                                                zh0Var32.I();
                                                                zh0Var32.x();
                                                                return;
                                                            default:
                                                                zh0 zh0Var4 = zh0Var3;
                                                                zh0Var4.V0 = false;
                                                                if (!zh0Var4.Y0 && zh0Var4.W0) {
                                                                    zh0Var4.C(true);
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
                        org.telegram.messenger.b6.q(this.Y5).v(this);
                        this.O5.l1 = false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public void invalidate() {
        l1 l1Var;
        if (this.O5 == null) {
            return;
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.Ac;
        if (runnable2 != null) {
            runnable2.run();
            return;
        }
        Runnable runnable3 = this.Bc;
        if (runnable3 != null) {
            runnable3.run();
        }
        super.invalidate();
        if ((this.Z5 || (this.K != null && o2())) && getParent() != null) {
            View view = (View) getParent();
            if (view.getParent() != null) {
                view.invalidate();
                ((View) view.getParent()).invalidate();
            }
        }
        if (!this.Ub || (l1Var = this.Qa) == null) {
            return;
        }
        l1Var.o();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (this.K != null) {
            p2();
        }
    }

    @Override
    public final void j(ImageReceiver imageReceiver) {
        jj jjVar = this.O5;
        if (jjVar != null && imageReceiver == this.T0 && jjVar.J2()) {
            this.Qa.v1(this.O5);
        }
    }

    public final boolean j0(MotionEvent motionEvent) {
        z0 z0Var;
        y yVar;
        if (this.G4 && ((!this.xb || getVideoTranscriptionProgress() > 0.0f || this.R2) && (z0Var = this.H4) != null)) {
            int action = motionEvent.getAction();
            float x10 = motionEvent.getX();
            float K1 = K1(motionEvent);
            if (action != 1 && action != 3) {
                if (z0Var.v.contains((int) x10, (int) K1)) {
                    if (action == 0) {
                        z0Var.A = true;
                    }
                    if (z0Var.A && (yVar = z0Var.f30782q) != null) {
                        yVar.setHotspot(x10, K1);
                        z0Var.f30782q.setState(u21.N);
                        z0Var.f30783r.invalidate();
                    }
                    return true;
                }
            } else if (z0Var.A && action == 1) {
                z0Var.l();
                return true;
            } else {
                z0Var.A = false;
            }
        }
        return false;
    }

    public boolean j1(Canvas canvas) {
        org.telegram.ui.Components.s5 m10;
        int i10;
        boolean z10;
        jj jjVar = this.O5;
        ag.c2 c2Var = this.T0;
        if (jjVar != null && jjVar.D3() && (m10 = c2Var.m()) != null && (i10 = m10.d[4]) > 0) {
            float l4 = 1.0f - Utilities.l(((i10 - 90) - m10.o()) / 500.0f);
            if (l4 > 0.0f) {
                if (l4 < 1.0f) {
                    z10 = c2Var.h(canvas, null);
                } else {
                    z10 = true;
                }
                c2Var.T0 = true;
                float alpha = c2Var.getAlpha();
                c2Var.setAlpha(l4 * alpha);
                c2Var.h(canvas, null);
                c2Var.setAlpha(alpha);
                c2Var.T0 = false;
                return z10;
            }
        }
        return c2Var.h(canvas, null);
    }

    public final boolean j2() {
        int selectionOverlayColor = getSelectionOverlayColor();
        if (selectionOverlayColor != 0 && selectionOverlayColor != -65536) {
            return true;
        }
        return false;
    }

    public final void j3(Drawable drawable, int i10, int i11, int i12, int i13) {
        if (drawable != null) {
            zh0 zh0Var = this.f22786xc;
            x1 x1Var = this.gb;
            if (zh0Var != null && zh0Var.h) {
                this.Fc = 0.0f;
            } else {
                float f7 = i11 + i13 + x1Var.f23497j0;
                this.Fc = f7 - ((int) f7);
            }
            drawable.setBounds((int) (i10 + x1Var.f23487h0), (int) (i11 + x1Var.f23502k0), (int) (i10 + i12 + x1Var.f23492i0), (int) (i11 + i13 + x1Var.f23497j0));
        }
    }

    @Override
    public final boolean k() {
        return this.f22785xa;
    }

    public final boolean k0() {
        jj jjVar = this.O5;
        if (jjVar != null && jjVar.D == 17) {
            TLRPC.MessageMedia o12 = jj.o1(jjVar.f16337k);
            if (o12 instanceof TLRPC.TL_messageMediaPoll) {
                return ((TLRPC.TL_messageMediaPoll) o12).results.has_unread_votes;
            }
        }
        return false;
    }

    public final void k1(Canvas canvas, int i10) {
        int i11;
        hj hjVar;
        jj jjVar;
        l1 l1Var = this.Qa;
        int i12 = 0;
        if (l1Var != null) {
            if (!l1Var.k1(this, 1)) {
                this.f22791y4 = null;
                ArrayList arrayList = this.f22779x4;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < this.f22779x4.size(); i13++) {
                        o1 o1Var = (o1) this.f22779x4.get(i13);
                        if (!o1Var.f22376a.d()) {
                            o1Var.f22376a.a();
                        }
                    }
                }
            } else {
                CharacterStyle y12 = this.Qa.y1(this);
                if (y12 != this.f22791y4) {
                    this.f22791y4 = y12;
                    t80 t80Var = this.f22766w4;
                    if (t80Var != null) {
                        t80Var.a();
                        this.f22766w4 = null;
                    }
                    t80 t80Var2 = new t80();
                    this.f22766w4 = t80Var2;
                    t80Var2.D = true;
                    k80 k80Var = new k80(0);
                    t80 t80Var3 = this.f22766w4;
                    t80Var3.f30521y = k80Var;
                    t80Var3.k(5.0f);
                    ?? obj = new Object();
                    obj.f22376a = this.f22766w4;
                    obj.f22377b = -3;
                    if (this.f22779x4 == null) {
                        this.f22779x4 = new ArrayList();
                    }
                    this.f22779x4.add(obj);
                    if (this.f22791y4 != null && !C1(obj, k80Var, this.f22651n2, -2) && (((hjVar = this.f22615k3) == null || !D1(obj, k80Var, hjVar.e)) && (jjVar = this.O5) != null)) {
                        D1(obj, k80Var, jjVar.f16397z2);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.f22779x4;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            jj jjVar2 = this.O5;
            if (jjVar2 != null && jjVar2.P3()) {
                i11 = org.telegram.ui.ActionBar.t6.Ac;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.f21336ze;
            }
            int w02 = org.telegram.ui.ActionBar.t6.w0(i11, this.Ob);
            while (i12 < this.f22779x4.size()) {
                o1 o1Var2 = (o1) this.f22779x4.get(i12);
                if (o1Var2.f22377b == i10) {
                    t80 t80Var4 = o1Var2.f22376a;
                    t80Var4.g(org.telegram.ui.ActionBar.t6.r1(0.85f, w02), org.telegram.ui.ActionBar.t6.r1(2.0f, w02), org.telegram.ui.ActionBar.t6.r1(3.5f, w02), org.telegram.ui.ActionBar.t6.r1(6.0f, w02));
                    t80Var4.draw(canvas);
                    invalidate();
                    if (t80Var4.c()) {
                        this.f22779x4.remove(i12);
                        i12--;
                    }
                }
                i12++;
            }
        }
    }

    public final boolean k2() {
        ArrayList arrayList;
        hj hjVar = this.f22615k3;
        if (hjVar != null && (arrayList = hjVar.e) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (!((gj) obj).f15723y.isEmpty()) {
                    return true;
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().f16397z2 != null) {
            ArrayList arrayList2 = getMessageObject().f16397z2;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                if (!((gj) obj2).f15723y.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void k3() {
        this.f22768w6 = true;
        this.f22781x6 = 1000;
        this.f22806z6 = System.currentTimeMillis();
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    @Override
    public final boolean l() {
        ej ejVar = this.K;
        if (ejVar != null && ejVar.f15399i) {
            bj bjVar = this.L;
            if (bjVar != null && (bjVar.f14783l & 8) != 0) {
                return this.F;
            }
            return true;
        }
        return this.F;
    }

    public final boolean l0(float f7, int i10) {
        sg.p0 p0Var = this.N;
        if (!p0Var.H) {
            return false;
        }
        float y3 = getY() + p0Var.f48440c;
        if (y3 <= f7 || (y3 + p0Var.f48447m) - org.telegram.messenger.i0.L(16.0f) >= i10) {
            return false;
        }
        return true;
    }

    public void l1(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.l1(android.graphics.Canvas):void");
    }

    public final void l2(int i10, int i11, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int i12 = i11 - i10;
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                break;
            }
            gj gjVar = (gj) arrayList.get(i13);
            if (i10 >= gjVar.f15718n && i10 < gjVar.f15719r) {
                this.f22800z0 = i13;
                c3();
                try {
                    k80 X2 = X2();
                    X2.f27471c = true;
                    X2.d(gjVar.e, i10, 0.0f);
                    gjVar.e.getSelectionPath(i10, i11, X2);
                    X2.a();
                    float f7 = gjVar.f15721w + gjVar.h;
                    if (i11 >= gjVar.f15718n + i12) {
                        for (int i14 = i13 + 1; i14 < arrayList.size(); i14++) {
                            gj gjVar2 = (gj) arrayList.get(i14);
                            int i15 = gjVar2.f15719r - gjVar2.f15718n;
                            k80 X22 = X2();
                            X22.f27471c = true;
                            float f10 = f7 + gjVar2.f15717f;
                            X22.d(gjVar2.e, 0, f10);
                            f7 = f10 + gjVar2.f15721w + gjVar2.h;
                            gjVar2.e.getSelectionPath(0, i11 - gjVar2.f15718n, X22);
                            X22.a();
                            if (i11 < (gjVar.f15718n + i15) - 1) {
                                break;
                            }
                        }
                    }
                    if (this.A0) {
                        this.f22768w6 = true;
                        this.f22781x6 = 2500;
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                invalidate();
            } else {
                i13++;
            }
        }
        this.f22578h3 = -1;
        this.f22590i3 = -1;
    }

    public final void l3(byte[] bArr) {
        jj jjVar = this.P5;
        if (jjVar == null) {
            jjVar = this.O5;
        }
        if (jjVar == null) {
            this.f22638m3 = null;
            return;
        }
        rh0 rh0Var = this.f22638m3;
        if (rh0Var == null || !rh0Var.f29918f || !Arrays.equals(rh0Var.f29919g, bArr)) {
            this.f22638m3 = new rh0(this, jjVar.f1(), bArr);
        }
        this.A0 = true;
    }

    public final boolean m0() {
        org.telegram.messenger.d9 d9Var;
        org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(this.Y5);
        String filename = getFilename();
        if (filename == null || (d9Var = (org.telegram.messenger.d9) G.h.get(filename)) == null || !d9Var.T) {
            return false;
        }
        d9Var.T = false;
        return true;
    }

    public void m1(Canvas canvas, float f7, Integer num) {
        boolean z10;
        boolean z11 = this.f22772wb;
        float f10 = 1.0f;
        sg.p0 p0Var = this.N;
        if (z11) {
            p0Var.f48438a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.T4 && i2()) {
            if (p0Var.f48438a > 0.0f) {
                z();
            }
            if (getAlpha() * f7 != 1.0f) {
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (getAlpha() * f7 * 255.0f), 31);
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = (p0Var.f48438a > 0.0f ? 1 : (p0Var.f48438a == 0.0f ? 0 : -1));
            x1 x1Var = this.gb;
            if (i10 <= 0 && x1Var.f23554x0 && this.L == null && !this.f22772wb) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + x1Var.f23497j0);
                p0Var.A = 0.0f;
                p0Var.B = false;
                if (x1Var.h) {
                    f10 = x1Var.L1;
                }
                p0Var.d(canvas, f10, num);
                canvas.restore();
            } else {
                p0Var.A = 0.0f;
                p0Var.B = false;
                if (x1Var.h) {
                    f10 = x1Var.L1;
                }
                p0Var.d(canvas, f10, num);
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public final void m3(CharacterStyle characterStyle) {
        int i10;
        int i11;
        int i12;
        int i13;
        jj jjVar = this.P5;
        if (jjVar == null) {
            jjVar = this.O5;
        }
        this.A0 = false;
        ArrayList arrayList = this.f22753v4;
        if (jjVar != null && jjVar.f16337k.message != null && characterStyle != null) {
            if (this.f22615k3 != null && !TextUtils.isEmpty(jjVar.f16394z)) {
                CharSequence charSequence = jjVar.f16394z;
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
                        int i14 = i12 - i13;
                        for (int i15 = 0; i15 < this.f22615k3.e.size(); i15++) {
                            gj gjVar = (gj) this.f22615k3.e.get(i15);
                            if (i13 >= gjVar.f15718n && i13 < gjVar.f15719r) {
                                this.f22800z0 = i15;
                                this.A0 = false;
                                c3();
                                try {
                                    k80 X2 = X2();
                                    X2.d(gjVar.e, i13, 0.0f);
                                    gjVar.e.getSelectionPath(i13, i12, X2);
                                    if (i12 >= gjVar.f15718n + i14) {
                                        for (int i16 = i15 + 1; i16 < this.f22615k3.e.size(); i16++) {
                                            gj gjVar2 = (gj) this.f22615k3.e.get(i16);
                                            int i17 = gjVar2.f15719r - gjVar2.f15718n;
                                            k80 X22 = X2();
                                            X22.d(gjVar2.e, 0, gjVar2.f15721w);
                                            gjVar2.e.getSelectionPath(0, i12 - gjVar2.f15718n, X22);
                                            if (i12 < (gjVar.f15718n + i17) - 1) {
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                }
                                invalidate();
                                return;
                            }
                        }
                    }
                }
            }
            CharSequence charSequence2 = jjVar.v;
            if ((charSequence2 instanceof Spanned) && jjVar.f16397z2 != null) {
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
                    for (int i19 = 0; i19 < jjVar.f16397z2.size(); i19++) {
                        gj gjVar3 = (gj) jjVar.f16397z2.get(i19);
                        if (i11 >= gjVar3.f15718n && i11 < gjVar3.f15719r) {
                            this.f22800z0 = i19;
                            this.A0 = false;
                            c3();
                            try {
                                k80 X23 = X2();
                                X23.d(gjVar3.e, i11, 0.0f);
                                gjVar3.e.getSelectionPath(i11, i10, X23);
                                if (i10 >= gjVar3.f15718n + i18) {
                                    for (int i20 = i19 + 1; i20 < jjVar.f16397z2.size(); i20++) {
                                        gj gjVar4 = (gj) jjVar.f16397z2.get(i20);
                                        int i21 = gjVar4.f15719r - gjVar4.f15718n;
                                        k80 X24 = X2();
                                        X24.d(gjVar4.e, 0, gjVar4.f15721w);
                                        gjVar4.e.getSelectionPath(0, i10 - gjVar4.f15718n, X24);
                                        if (i10 < (gjVar3.f15718n + i21) - 1) {
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception e7) {
                                org.telegram.messenger.f8.g(e7, true);
                            }
                            invalidate();
                            return;
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f22800z0 = -1;
                this.A0 = false;
                c3();
                invalidate();
            }
        } else if (!arrayList.isEmpty()) {
            this.f22800z0 = -1;
            this.A0 = false;
            c3();
            invalidate();
        }
    }

    @Override
    public final void n(long j10, long j11) {
        float min;
        int i10;
        TLRPC.Message message;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.O5.F0 = j10;
        RadialProgress2 radialProgress2 = this.P0;
        radialProgress2.p(true, min);
        if (j10 == j11 && ((this.L != null || ((message = this.O5.f16337k) != null && message.paid_message_stars > 0)) && qz.C(this.Y5).J(this.O5.f1()) && ((i10 = this.M3) == 1 || (i10 == 4 && this.K1 == 5)))) {
            this.R0 = true;
            getIconForCurrentState();
            radialProgress2.setIcon(6, false, true);
        }
        long j12 = this.f22789y1;
        if (j12 > 0 && Math.abs(j12 - j11) > 1048576) {
            this.f22789y1 = j11;
        }
        x0(j10, j11);
    }

    public final void n0(Bitmap bitmap, boolean z10) {
        boolean L4 = jj.L4(this.O5.f16337k);
        ag.c2 c2Var = this.T0;
        if (L4) {
            if (MediaController.B().I(this.O5)) {
                c2Var.f14408t0 = false;
                c2Var.Q0();
                return;
            }
            c2Var.f14408t0 = true;
            c2Var.P0(false);
            return;
        }
        if (z10) {
            jj jjVar = MediaController.B().f14482u0;
            if (jjVar != null && jjVar.h4()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        c2Var.f14408t0 = z10;
        if (bitmap != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
            c2Var.Y = null;
            c2Var.f14366a0 = null;
            c2Var.f14369b0 = null;
            c2Var.f14372c0 = null;
            c2Var.Z0.setShader(null);
            c2Var.N0(bitmapDrawable);
            c2Var.f14392m1 = true;
            c2Var.f14384h1 = 0.0f;
            c2Var.R0(c2Var.m0);
        }
        if (z10) {
            c2Var.P0(false);
        } else {
            c2Var.Q0();
        }
    }

    public final boolean n1(Canvas canvas) {
        boolean z10 = this.f22772wb;
        float f7 = 1.0f;
        sg.p0 p0Var = this.N;
        if (z10) {
            p0Var.f48438a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z11 = false;
        if (!this.T4 || !i2()) {
            return false;
        }
        if (p0Var.f48438a > 0.0f) {
            z();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z11 = true;
        }
        int i10 = (p0Var.f48438a > 0.0f ? 1 : (p0Var.f48438a == 0.0f ? 0 : -1));
        x1 x1Var = this.gb;
        if (i10 <= 0 && x1Var.f23554x0 && this.L == null && !this.f22772wb) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + x1Var.f23497j0);
            if (x1Var.h) {
                f7 = x1Var.L1;
            }
            p0Var.e(canvas, f7);
            canvas.restore();
        } else {
            if (x1Var.h) {
                f7 = x1Var.L1;
            }
            p0Var.e(canvas, f7);
        }
        if (z11) {
            canvas.restore();
        }
        return true;
    }

    public final void n2() {
        l1 l1Var = this.Qa;
        if (l1Var != null && l1Var.f()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void n3(int i10) {
        jj jjVar = this.P5;
        if (jjVar == null) {
            jjVar = this.O5;
        }
        if (jjVar == null) {
            this.f22638m3 = null;
            return;
        }
        rh0 rh0Var = this.f22638m3;
        if (rh0Var == null || !rh0Var.e || rh0Var.f29917c != (-i10)) {
            this.f22638m3 = new rh0(this, jjVar.f1(), i10);
        }
        this.A0 = true;
    }

    @Override
    public final void o(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.o(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    public final void o1(Canvas canvas, vv vvVar, float f7, ColorFilter colorFilter) {
        Canvas canvas2;
        int save;
        if (vvVar != null && f7 > 0.0f && vvVar.C()) {
            if (f7 < 1.0f) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f7 * 255.0f), 31);
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(this.f22649n0, this.f22724t0);
            vvVar.i(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public final boolean o2() {
        if (this.f22715s4.f10421a <= 0 && this.N.f48450p) {
            jj jjVar = this.O5;
            if (jjVar == null || !jjVar.f16365r1) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void o3(String str) {
        p3(false, -1, str, false);
    }

    @Override
    public final void onAttachedToWindow() {
        q1 q1Var;
        float f7;
        float f10;
        ih.h hVar;
        ih.h hVar2;
        org.telegram.ui.Components.t8 t8Var;
        super.onAttachedToWindow();
        xa.n nVar = this.f22748uc;
        if (nVar != null) {
            nVar.a();
            this.f22748uc = null;
        }
        xa.n nVar2 = new xa.n(zs.f(this.Y5), this);
        nVar2.e(zs.E0);
        nVar2.h(zs.f19648m1);
        nVar2.h(zs.l1);
        nVar2.h(zs.f19630i4);
        nVar2.h(zs.W2);
        this.f22748uc = nVar2;
        jj jjVar = this.O5;
        if (jjVar != null) {
            jjVar.f16331i1 = false;
            vv vvVar = jjVar.f16385w2;
            if (vvVar != null) {
                vvVar.b(this);
            }
        }
        vv vvVar2 = this.gb.M0;
        if (vvVar2 != null) {
            vvVar2.b(this);
        }
        v1 v1Var = this.f22567g3;
        if (v1Var != null && (t8Var = v1Var.f23171b) != null) {
            t8Var.e();
        }
        w1 w1Var = this.f22751v2;
        if (w1Var != null && (hVar2 = w1Var.f23361m) != null) {
            hVar2.a();
        }
        w1 w1Var2 = this.f22751v2;
        if (w1Var2 != null && (hVar = w1Var2.f23362n) != null) {
            hVar.a();
        }
        ArrayList arrayList = this.O4;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((p1) obj).a();
        }
        jj jjVar2 = this.P5;
        if (jjVar2 != null) {
            jjVar2.f16331i1 = false;
            q1Var = this;
            q1Var.r3(jjVar2, this.Q5, this.S5, this.R5, this.T5, this.U5);
            q1Var.P5 = null;
            q1Var.Q5 = null;
        } else {
            q1Var = this;
        }
        CheckBoxBase checkBoxBase = q1Var.l1;
        if (checkBoxBase != null) {
            checkBoxBase.f23914l = true;
        }
        CheckBoxBase checkBoxBase2 = q1Var.f22613k1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f23914l = true;
        }
        l11 l11Var = q1Var.f22540e0;
        if (l11Var != null) {
            l11Var.a();
        }
        CheckBoxBase checkBoxBase3 = q1Var.N7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f23914l = true;
        }
        if (q1Var.f22533d7 != null) {
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = q1Var.f22533d7;
                if (i11 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i11].f23914l = true;
                i11++;
            }
        }
        q1Var.N0 = true;
        float f11 = 0.0f;
        q1Var.Uc = 0.0f;
        q1Var.Tc = 0.0f;
        q1Var.f22687q1 = 0;
        V3();
        ImageReceiver imageReceiver = q1Var.f22794y7;
        imageReceiver.H0((View) getParent());
        imageReceiver.P();
        m1 m1Var = q1Var.f22550ec;
        if (m1Var != null) {
            m1Var.f22279b.P();
        }
        m1 m1Var2 = q1Var.f22563fc;
        if (m1Var2 != null) {
            m1Var2.f22279b.P();
        }
        P();
        jj jjVar3 = q1Var.O5;
        if (jjVar3 != null) {
            setAvatar(jjVar3);
        }
        int i12 = q1Var.K1;
        if (i12 == 4 && q1Var.F5) {
            boolean I = MediaController.B().I(q1Var.O5);
            q1Var.D1 = I;
            if (I) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            q1Var.F1 = f10;
            q1Var.E1 = 0;
        } else {
            q1Var.D1 = false;
            q1Var.F1 = 0.0f;
            if ((i12 == 4 || i12 == 2) && q1Var.f22801z1) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            q1Var.C1 = f7;
        }
        if (getDelegate() != null && getDelegate().g2() != null) {
            l9 g22 = getDelegate().g2();
            g22.getClass();
            if (getMessageObject() != null && getMessageObject().f1() == g22.f23444w) {
                g22.W = q1Var;
            }
        }
        if (q1Var.K1 == 5) {
            boolean I2 = MediaController.B().I(q1Var.O5);
            a1 A1 = A1();
            if (I2) {
                f11 = 1.0f;
            }
            A1.h = f11;
        }
        sg.p0 p0Var = q1Var.N;
        ArrayList arrayList2 = p0Var.f48453s;
        p0Var.D = true;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((sg.m0) arrayList2.get(i13)).a();
        }
        org.telegram.messenger.o6 o6Var = q1Var.f22634lb;
        if (o6Var != null) {
            o6Var.a();
        }
        n4 n4Var = q1Var.V5;
        if (n4Var != null) {
            ArrayList arrayList3 = n4Var.f22339c;
            if (!n4Var.C) {
                n4Var.C = true;
                nh.h hVar3 = n4Var.f22345l;
                if (hVar3 != null) {
                    hVar3.b(n4Var.f22337a);
                }
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    m4 m4Var = (m4) arrayList3.get(i14);
                    if (!m4Var.M) {
                        m4Var.M = true;
                        m4Var.f22303f.P();
                    }
                }
            }
        }
        N3();
        jj jjVar4 = q1Var.O5;
        if (jjVar4 != null && jjVar4.D == 20 && q1Var.V9 != null) {
            invalidate();
        }
        org.telegram.ui.Components.d5 d5Var = q1Var.f22672oa;
        if (d5Var != null) {
            d5Var.a();
        }
        org.telegram.ui.Components.d5 d5Var2 = q1Var.f22683pa;
        if (d5Var2 != null) {
            d5Var2.a();
        }
        nh.h hVar4 = q1Var.O9;
        if (hVar4 != null) {
            if (hVar4.f13834i) {
                nh.h S2 = S2();
                q1Var.O9 = S2;
                Integer num = q1Var.P9;
                if (num != null) {
                    S2.f13836k.put(this, num);
                }
            } else {
                hVar4.a(this);
            }
        }
        l0 l0Var = q1Var.f22761w;
        if (l0Var != null) {
            ArrayList arrayList4 = l0Var.f22217q;
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                ((k0) arrayList4.get(i15)).a();
            }
        }
        gw0 gw0Var = q1Var.f22541e1;
        if (gw0Var != null) {
            for (int i16 = 0; i16 < gw0Var.f26527b; i16++) {
                gw0Var.f26528c[i16].a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        u1 u1Var;
        org.telegram.ui.Components.t8 t8Var;
        rf.m mVar;
        ih.h hVar;
        ih.h hVar2;
        super.onDetachedFromWindow();
        xa.n nVar = this.f22748uc;
        if (nVar != null) {
            nVar.a();
            this.f22748uc = null;
        }
        AnimatorSet animatorSet = this.W5;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.W5 = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
            setRotation(0.0f);
        }
        CheckBoxBase checkBoxBase = this.l1;
        if (checkBoxBase != null) {
            checkBoxBase.f23914l = false;
        }
        w1 w1Var = this.f22751v2;
        if (w1Var != null && (hVar2 = w1Var.f23361m) != null) {
            hVar2.f8540b.R();
            hVar2.f8554y.f();
        }
        w1 w1Var2 = this.f22751v2;
        if (w1Var2 != null && (hVar = w1Var2.f23362n) != null) {
            hVar.f8540b.R();
            hVar.f8554y.f();
        }
        w1 w1Var3 = this.f22751v2;
        if (w1Var3 != null && (mVar = w1Var3.f23358j) != null) {
            mVar.b();
            this.f22751v2.f23358j = null;
        }
        vv vvVar = this.O5.f16385w2;
        if (vvVar != null) {
            vvVar.f(this);
        }
        x1 x1Var = this.gb;
        vv vvVar2 = x1Var.M0;
        if (vvVar2 != null) {
            vvVar2.f(this);
        }
        ArrayList arrayList = this.O4;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((p1) obj).b();
        }
        v1 v1Var = this.f22567g3;
        if (v1Var != null && (t8Var = v1Var.f23171b) != null) {
            t8Var.f();
        }
        CheckBoxBase checkBoxBase2 = this.f22613k1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f23914l = false;
        }
        if (this.f22533d7 != null) {
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.f22533d7;
                if (i11 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i11].f23914l = false;
                i11++;
            }
        }
        CheckBoxBase checkBoxBase3 = this.N7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f23914l = false;
        }
        this.N0 = false;
        n4 n4Var = this.V5;
        if (n4Var != null) {
            n4Var.e();
        }
        this.f22794y7.R();
        m1 m1Var = this.f22550ec;
        if (m1Var != null) {
            m1Var.f22279b.R();
        }
        m1 m1Var2 = this.f22563fc;
        if (m1Var2 != null) {
            m1Var2.f22279b.R();
        }
        l11 l11Var = this.f22540e0;
        if (l11Var != null) {
            l11Var.b();
        }
        P();
        if (this.E3 && (u1Var = this.f22711s0) != null && u1Var.d != null && u1Var.e != null) {
            hc D = hc.D();
            String str = this.f22711s0.d;
            if (str != null) {
                D.A.remove(str);
            }
            this.E3 = false;
        }
        gw0 gw0Var = this.f22541e1;
        if (gw0Var != null) {
            gw0Var.a(this);
        }
        org.telegram.messenger.b6.q(this.Y5).v(this);
        if (getDelegate() != null && getDelegate().g2() != null) {
            l9 g22 = getDelegate().g2();
            g22.getClass();
            if (getMessageObject() != null && getMessageObject().f1() == g22.f23444w) {
                g22.W = null;
            }
        }
        x1Var.f23550w0 = false;
        if (MediaController.B().I(this.O5)) {
            org.telegram.ui.ActionBar.t6.A0().f32400i = null;
        }
        ValueAnimator valueAnimator = this.f22722sb;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f22722sb.cancel();
        }
        this.N.p();
        this.f22709rb = false;
        org.telegram.messenger.o6 o6Var = this.f22634lb;
        if (o6Var != null) {
            o6Var.e();
        }
        org.telegram.ui.Components.d5 d5Var = this.f22672oa;
        if (d5Var != null) {
            d5Var.b();
        }
        org.telegram.ui.Components.d5 d5Var2 = this.f22683pa;
        if (d5Var2 != null) {
            d5Var2.b();
        }
        nh.h hVar3 = this.O9;
        if (hVar3 != null) {
            hVar3.b(this);
        }
        l0 l0Var = this.f22761w;
        if (l0Var != null) {
            ArrayList arrayList2 = l0Var.f22217q;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                k0 k0Var = (k0) arrayList2.get(i12);
                int i13 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = k0Var.f22105c;
                    if (i13 < imageReceiverArr.length) {
                        imageReceiverArr[i13].R();
                        i13++;
                    }
                }
            }
        }
        rf.g.d().f(this.f22811zc);
    }

    @Override
    public void onDraw(Canvas canvas) {
        b1(canvas);
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z10;
        gl0 X3 = X3();
        int i10 = 0;
        if (X3 != null && motionEvent.isFromSource(8194)) {
            float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.f22575h0 + this.f22724t0;
            motionEvent.offsetLocation(-this.f22649n0, -topicSeparatorTopPadding);
            Rect rect = X3.f17622b;
            if (X3.f26399d0 != null && X3.f26400e0) {
                motionEvent.offsetLocation((-rect.left) + X3.f26405j0, -rect.top);
                try {
                    if (motionEvent.getX() >= 0.0f && motionEvent.getX() < X3.u0() && motionEvent.getY() >= 0.0f && motionEvent.getY() < X3.f26404i0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    X3.f26399d0.m(motionEvent, z10);
                    motionEvent.offsetLocation(rect.left - X3.f26405j0, rect.top);
                } catch (Throwable th2) {
                    motionEvent.offsetLocation(rect.left - X3.f26405j0, rect.top);
                    throw th2;
                }
            }
            motionEvent.offsetLocation(this.f22649n0, topicSeparatorTopPadding);
        }
        int x10 = (int) motionEvent.getX();
        int K1 = (int) K1(motionEvent);
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            while (true) {
                SparseArray sparseArray = this.f22760vb;
                if (i10 >= sparseArray.size()) {
                    break;
                } else if (((Rect) sparseArray.valueAt(i10)).contains(x10, K1)) {
                    int keyAt = sparseArray.keyAt(i10);
                    if (keyAt != this.Jb) {
                        this.Jb = keyAt;
                        e3(keyAt, 32768, null);
                    }
                    return true;
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 10) {
            this.Jb = 0;
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public void onLayout(boolean r28, int r29, int r30, int r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        q1 q1Var;
        int i12;
        jj jjVar = this.O5;
        boolean z10 = true;
        if (jjVar == null || (!jjVar.I() && this.T3 == org.telegram.messenger.i0.f16026q.y)) {
            q1Var = this;
        } else {
            this.B0 = true;
            jj jjVar2 = this.O5;
            this.O5 = null;
            q1Var = this;
            q1Var.s3(jjVar2, this.K, this.F, this.E, this.G, false);
            q1Var.B0 = false;
        }
        T3();
        int i13 = q1Var.V + q1Var.f22552f0 + q1Var.f22575h0 + q1Var.f22737u0 + q1Var.f22762w0 + q1Var.f22526d0;
        zg.a draftMessageMeasureController = getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(q1Var.O5)) {
            int max = Math.max(0, (((draftMessageMeasureController.f55716a.getHeight() - draftMessageMeasureController.f55716a.getPaddingTop()) - draftMessageMeasureController.f55716a.getPaddingBottom()) - draftMessageMeasureController.d) - i13);
            if (max <= 0) {
                z10 = false;
            }
            draftMessageMeasureController.e = z10;
            if (draftMessageMeasureController.f55717b > 0 && !z10) {
                draftMessageMeasureController.c(0, 0L);
            }
            i12 = max + i13;
        } else {
            i12 = i13;
        }
        q1Var.Cc = Math.max(0, i12 - i13);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), i12);
    }

    @Override
    public final void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (this.I6) {
            jj jjVar = this.O5;
            if (jjVar != null && (charSequence2 = jjVar.v) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.O5.v);
                return;
            }
            jj jjVar2 = this.O5;
            if (jjVar2 != null && (charSequence = jjVar2.f16394z) != null && charSequence.length() > 0) {
                viewStructure.setText(this.O5.f16394z);
            }
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void p() {
        l1 l1Var;
        if (this.O5 != null) {
            Runnable runnable = this.Ac;
            if (runnable != null) {
                runnable.run();
                return;
            }
            Runnable runnable2 = this.Bc;
            if (runnable2 != null) {
                runnable2.run();
            }
            super.invalidate();
            if ((this.Z5 || (this.K != null && o2())) && getParent() != null) {
                View view = (View) getParent();
                if (view.getParent() != null) {
                    view.invalidate();
                    ((View) view.getParent()).invalidate();
                }
            }
            if (this.Ub && (l1Var = this.Qa) != null) {
                l1Var.o();
            }
        }
    }

    public final int p0(jj jjVar, ej ejVar, boolean z10) {
        ej ejVar2 = ejVar;
        ag.c2 c2Var = this.T0;
        c2Var.f14396o0 = true;
        ImageReceiver imageReceiver = this.f22794y7;
        imageReceiver.f14396o0 = true;
        ImageReceiver imageReceiver2 = this.R7;
        imageReceiver2.f14396o0 = true;
        ImageReceiver imageReceiver3 = this.D7;
        imageReceiver3.f14396o0 = true;
        int i10 = 0;
        if (ejVar2 != null) {
            ArrayList arrayList = ejVar2.d;
            if (arrayList.size() != 1) {
                if (arrayList.size() != ejVar2.f15397f.size()) {
                    ejVar2.a();
                }
                this.Rc = 0;
                int i11 = 0;
                while (i10 < arrayList.size()) {
                    jj jjVar2 = (jj) arrayList.get(i10);
                    bj d = ejVar2.d(jjVar2);
                    if (d != null && (d.f14783l & 1) != 0) {
                        r3(jjVar2, ejVar2, false, false, false, false);
                        if (z10 && !TextUtils.isEmpty(this.f22652n3)) {
                            L3();
                            this.Rc = (int) (i11 + this.f22701r3);
                            this.Sc = this.f22615k3;
                        }
                        i11 = this.f22737u0 + this.f22762w0 + i11;
                    }
                    i10++;
                    ejVar2 = ejVar;
                }
                return i11;
            }
        }
        r3(jjVar, ejVar, false, false, false, false);
        c2Var.f14396o0 = false;
        imageReceiver.f14396o0 = false;
        imageReceiver2.f14396o0 = false;
        imageReceiver3.f14396o0 = false;
        L3();
        return this.f22737u0 + this.f22762w0;
    }

    public final void p1(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.p1(android.graphics.Canvas):void");
    }

    public final void p2() {
        if (this.K != null && getParent() != null) {
            ((ViewGroup) getParent()).invalidate();
        }
        invalidate();
    }

    public final boolean p3(boolean r25, int r26, java.lang.String r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.p3(boolean, int, java.lang.String, boolean):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        q1 q1Var;
        ArrayList arrayList;
        l1 l1Var = this.Qa;
        int i11 = 0;
        if (l1Var != null && l1Var.c2(i10)) {
            return false;
        }
        if (i10 == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                C0(false);
                return true;
            } else if (this.O5.D == 16) {
                this.Qa.A0(this, this.Q3, this.R3);
                return true;
            } else {
                B0();
                return true;
            }
        }
        if (i10 == 2131296267) {
            D0();
        } else if (i10 == 2131296264) {
            l1 l1Var2 = this.Qa;
            if (l1Var2 != null) {
                if (this.O5.D == 16) {
                    l1Var2.o0(this, 0.0f, 0.0f);
                } else {
                    l1Var2.A0(this, this.Q3, this.R3);
                }
            }
        } else {
            if (i10 == 2131296265) {
                l1 l1Var3 = this.Qa;
                if (l1Var3 != null) {
                    TLRPC.Chat chat = this.f22721sa;
                    if (chat != null) {
                        q1Var = this;
                        l1Var3.T(q1Var, chat, this.O5.f16337k.fwd_from.channel_post, this.f22565g1, this.f22576h1, false);
                    } else {
                        q1Var = this;
                        TLRPC.User user = q1Var.f22695qa;
                        if (user != null) {
                            l1Var3.r0(this, user, q1Var.f22565g1, q1Var.f22576h1);
                        } else if (q1Var.f22734ta != null) {
                            l1Var3.n(this);
                        }
                    }
                }
            } else {
                q1Var = this;
                if (i10 == 2131296268) {
                    l1 l1Var4 = q1Var.Qa;
                    if (l1Var4 != null) {
                        l1Var4.F0(this);
                    }
                } else if (i10 == 2131296263 && q1Var.Qa != null && (arrayList = q1Var.O5.f16397z2) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i11);
                        i11++;
                        gj gjVar = (gj) obj;
                        if (gjVar.N) {
                            q1Var.Qa.J(gjVar);
                            break;
                        }
                    }
                }
            }
            if ((!jj.R4(q1Var.O5.f16337k) || q1Var.O5.h4() || (q1Var.O5.I3() && MediaController.B().I(q1Var.O5))) && q1Var.D4.g(null, i10, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        q1Var = this;
        if (!jj.R4(q1Var.O5.f16337k)) {
        }
        return true;
    }

    public final void q0(q1 q1Var) {
        if (q1Var == null) {
            return;
        }
        q1Var.f22532d6 = this.f22532d6;
        q1Var.q6 = this.q6;
        q1Var.f22558f6 = this.f22558f6;
        q1Var.f22570g6 = this.f22570g6;
        q1Var.f22581h6 = this.f22581h6;
        q1Var.f22593i6 = this.f22593i6;
        q1Var.f22605j6 = this.f22605j6;
        q1Var.f22618k6 = this.f22618k6;
        q1Var.f22629l6 = this.f22629l6;
        q1Var.f22641m6 = this.f22641m6;
        q1Var.f22655n6 = this.f22655n6;
        q1Var.f22668o6 = this.f22668o6;
        q1Var.f22704r6 = this.f22704r6;
        q1Var.f22717s6 = this.f22717s6;
        q1Var.f22730t6 = this.f22730t6;
        q1Var.U6 = this.U6;
        q1Var.V6 = this.V6;
        q1Var.W6 = this.W6;
        q1Var.X6 = this.X6;
        q1Var.Y6 = this.Y6;
    }

    public final void q1(Canvas canvas, Integer num, float f7, boolean z10) {
        bj bjVar = this.L;
        if (bjVar != null) {
            int i10 = bjVar.f14783l;
            if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                return;
            }
        }
        sg.p0 p0Var = this.N;
        p0Var.getClass();
        p0Var.A = f7;
        p0Var.B = z10;
        p0Var.d(canvas, this.gb.L1, num);
    }

    public final boolean q2() {
        ej ejVar;
        if (r2() && (ejVar = this.K) != null && this.L != null && !ejVar.f15395b && !ejVar.f15399i) {
            return true;
        }
        return false;
    }

    public final void q3(float f7, float f10, float f11, float f12) {
        ag.c2 c2Var = this.T0;
        c2Var.y0(f7, f10, f11, f12);
        int i10 = this.K1;
        if (i10 != 4 && i10 != 2) {
            return;
        }
        this.K3 = (int) (c2Var.K0 + org.telegram.messenger.i0.L(8.0f));
        int L = (int) (c2Var.L0 + org.telegram.messenger.i0.L(8.0f));
        this.L3 = L;
        int i11 = this.K3;
        int L2 = org.telegram.messenger.i0.L(24.0f) + this.L3;
        this.Q0.r(i11, L, org.telegram.messenger.i0.L(24.0f) + i11, L2);
        this.I3 = (int) c3.i0.B(c2Var.M0, org.telegram.messenger.i0.L(48.0f), 2.0f, f7);
        int B = (int) c3.i0.B(c2Var.N0, org.telegram.messenger.i0.L(48.0f), 2.0f, c2Var.L0);
        this.J3 = B;
        int i12 = this.I3;
        int L3 = org.telegram.messenger.i0.L(48.0f) + this.J3;
        this.P0.r(i12, B, org.telegram.messenger.i0.L(48.0f) + i12, L3);
    }

    @Override
    public final boolean r() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.r():boolean");
    }

    public final void r0(q1 q1Var) {
        nh.h hVar;
        if (q1Var != null && (hVar = q1Var.O9) != null) {
            int i10 = (Integer) hVar.f13836k.get(q1Var);
            if (i10 == null) {
                i10 = 0;
            }
            this.P9 = i10;
            nh.h hVar2 = this.O9;
            if (hVar2 != null) {
                hVar2.f13836k.put(this, i10);
            }
        }
    }

    public final void r1(km kmVar, Canvas canvas, int i10, Integer num, float f7) {
        bj bjVar = this.L;
        if (bjVar != null) {
            int i11 = bjVar.f14783l;
            if ((i11 & 8) == 0 || (i11 & 1) == 0) {
                return;
            }
        }
        sg.p0 p0Var = this.N;
        p0Var.getClass();
        p0Var.A = f7;
        p0Var.f(kmVar, canvas, i10, num);
    }

    public final boolean r2() {
        jj jjVar;
        if (t2() && (jjVar = this.O5) != null && !jjVar.P3()) {
            return true;
        }
        return false;
    }

    public final void r3(org.telegram.messenger.jj r111, org.telegram.messenger.ej r112, boolean r113, boolean r114, boolean r115, boolean r116) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.r3(org.telegram.messenger.jj, org.telegram.messenger.ej, boolean, boolean, boolean, boolean):void");
    }

    @Override
    public final void requestLayout() {
        if (this.B0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(q1 q1Var) {
        q1Var.w3(this.f22661nc, this.f22685pc, this.qc, this.rc, this.f22723sc, this.K0, this.L0, this.f22509bb, this.f22523cb, this.f22674oc);
    }

    public final void s1(Canvas canvas, RectF rectF, float f7) {
        String str;
        z();
        if (this.G8) {
            str = "paintChatActionBackgroundSelected";
        } else {
            str = "paintChatActionBackground";
        }
        canvas.drawRoundRect(rectF, f7, f7, X1(str));
        if (e2()) {
            canvas.drawRoundRect(rectF, f7, f7, org.telegram.ui.ActionBar.t6.f20998h2);
        }
    }

    public final boolean s2() {
        return r2();
    }

    public void s3(jj jjVar, ej ejVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.N0) {
            r3(jjVar, ejVar, z10, z11, z12, z13);
            return;
        }
        this.P5 = jjVar;
        this.Q5 = ejVar;
        this.S5 = z10;
        this.R5 = z11;
        this.T5 = z12;
        this.U5 = z13;
    }

    public void setAllowAssistant(boolean z10) {
        this.I6 = z10;
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
        if (this.eb) {
            this.f22562fb = f7;
            invalidate();
        } else {
            super.setAlpha(f7);
        }
        bj bjVar = this.L;
        if ((bjVar != null && (bjVar.f14777c != 0 || bjVar.f14775a != 0)) || ((this.f22787y && !jj.R4(this.O5.f16337k)) || this.O7 == null || this.P7 == null)) {
            bj bjVar2 = this.L;
            if (bjVar2 != null) {
                int i10 = bjVar2.f14783l;
                if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                    return;
                }
            }
            this.N.getClass();
        }
        invalidate();
    }

    public void setAnimationOffsetX(float f7) {
        if (this.Uc != f7) {
            this.Uc = f7;
            V3();
        }
    }

    public void setAvatar(jj jjVar) {
        if (jjVar != null) {
            int i10 = jjVar.I1;
            if (!this.E6 && !c2()) {
                this.f22609ja = null;
                return;
            }
            Drawable drawable = jjVar.f16340k2;
            ImageReceiver imageReceiver = this.f22794y7;
            if (drawable != null) {
                imageReceiver.w0(drawable);
                return;
            }
            TLRPC.User user = this.ha;
            org.telegram.ui.Components.r8 r8Var = this.f22807z7;
            if (user != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null) {
                    this.f22609ja = userProfilePhoto.photo_small;
                } else {
                    this.f22609ja = null;
                }
                r8Var.r(user);
                imageReceiver.j0(this.ha, r8Var, null, sc.e(360928), 1, false);
                return;
            }
            TLRPC.Chat chat = this.ia;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    this.f22609ja = chatPhoto.photo_small;
                } else {
                    this.f22609ja = null;
                }
                if (chat.signature_profiles && jj.B0(jjVar.f16337k) != 1271266957) {
                    long o10 = org.telegram.messenger.o5.o(jjVar.f16337k.from_id);
                    if (o10 >= 0) {
                        TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(o10));
                        r8Var.r(Z1);
                        imageReceiver.i0(Z1, r8Var, null);
                        return;
                    }
                    TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-o10));
                    r8Var.q(L0);
                    imageReceiver.i0(L0, r8Var, null);
                    return;
                }
                r8Var.q(this.ia);
                imageReceiver.i0(this.ia, r8Var, null);
            } else if (jjVar.r4()) {
                TLRPC.Photo photo = jjVar.T0;
                if (photo != null) {
                    imageReceiver.q0(ic.i(org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.L(50.0f), false, null, true), jjVar.T0), "50_50", r8Var, null, null, 0);
                }
            } else {
                this.f22609ja = null;
                r8Var.k(jjVar.Z0(), null, null, null);
                imageReceiver.q0(null, null, r8Var, null, null, 0);
            }
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.setBackgroundTopY(boolean):void");
    }

    public void setDelegate(l1 l1Var) {
        this.Qa = l1Var;
    }

    public void setDrawSelectionBackground(boolean z10) {
        if (this.f22600j1 != z10) {
            this.f22600j1 = z10;
            invalidate();
        }
    }

    public void setEnterTransitionInProgress(boolean z10) {
        this.f22787y = z10;
        invalidate();
    }

    public void setFullyDraw(boolean z10) {
        this.J0 = z10;
    }

    public void setHideSideButtonByQuickShare(boolean z10) {
        if (this.C8 != z10) {
            this.C8 = z10;
            boolean z11 = this.Z5;
            this.Z5 = true;
            invalidate();
            this.Z5 = z11;
        }
    }

    public void setHighlighted(boolean z10) {
        if (this.f22755v6 != z10) {
            this.f22755v6 = z10;
            if (z10) {
                this.f22638m3 = null;
            }
            if (!z10) {
                this.f22806z6 = System.currentTimeMillis();
                this.f22768w6 = true;
                this.f22781x6 = 300;
            } else {
                this.f22768w6 = false;
                this.f22781x6 = 0;
            }
            P3();
            if (this.A4) {
                this.C4.f29699o = v2();
            } else {
                this.B4.f27843p = v2();
            }
            invalidate();
            if (getParent() != null) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setImageCoords(RectF rectF) {
        q3(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public void setInstantButtonPressed(boolean z10) {
        if (this.F2 == null) {
            this.F2 = new dc(this);
        }
        dc dcVar = this.F2;
        this.E2 = z10;
        dcVar.c(z10);
    }

    public void setInvalidateListener(Runnable runnable) {
        this.Bc = runnable;
    }

    public void setInvalidateSpoilersParent(boolean z10) {
        this.m0 = z10;
    }

    public void setInvalidatesParent(boolean z10) {
        this.Z5 = z10;
    }

    public void setIsUpdating(boolean z10) {
        this.O0 = true;
    }

    public void setMessageObjectInternal(org.telegram.messenger.jj r68) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.setMessageObjectInternal(org.telegram.messenger.jj):void");
    }

    public void setOverrideInvalidate(Runnable runnable) {
        this.Ac = runnable;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        P3();
        if (this.A4) {
            this.C4.f29699o = v2();
        } else {
            this.B4.f27843p = v2();
        }
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.Ob = p6Var;
        RadialProgress2 radialProgress2 = this.P0;
        if (radialProgress2 != null) {
            radialProgress2.F = p6Var;
        }
        RadialProgress2 radialProgress22 = this.Q0;
        if (radialProgress22 != null) {
            radialProgress22.F = p6Var;
        }
        il0 il0Var = this.f22501b3;
        if (il0Var != null) {
            il0Var.f27007n = p6Var;
        }
    }

    public void setScrimReaction(Integer num) {
        this.N.f48459z = num;
    }

    public void setSelectedBackgroundProgress(float f7) {
        this.Xa = f7;
        invalidate();
    }

    public void setShowTopic(boolean z10) {
        if (this.Ic != z10) {
            this.Ic = z10;
            n2();
            invalidate();
        }
    }

    public void setSlidingOffset(float f7) {
        if (this.Tc != f7) {
            this.Tc = f7;
            V3();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Rb;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((nh.i) arrayList.get(i10)).invalidateSelf();
            i10++;
        }
        hj hjVar = this.f22615k3;
        if (hjVar != null && hjVar.e != null) {
            for (int i11 = 0; i11 < this.f22615k3.e.size(); i11++) {
                gj gjVar = (gj) this.f22615k3.e.get(i11);
                for (int i12 = 0; i12 < gjVar.f15723y.size(); i12++) {
                    ((nh.i) gjVar.f15723y.get(i12)).invalidateSelf();
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().f16397z2 != null) {
            for (int i13 = 0; i13 < getMessageObject().f16397z2.size(); i13++) {
                gj gjVar2 = (gj) getMessageObject().f16397z2.get(i13);
                for (int i14 = 0; i14 < gjVar2.f15723y.size(); i14++) {
                    ((nh.i) gjVar2.f15723y.get(i14)).invalidateSelf();
                }
            }
        }
    }

    public void setTimeAlpha(float f7) {
        this.f22591i4 = f7;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
    }

    public final void t0() {
        if (this.f22594i7 == null) {
            this.f22594i7 = new ImageReceiver[3];
            this.f22606j7 = new org.telegram.ui.Components.r8[3];
            this.f22619k7 = new boolean[3];
            int i10 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.f22594i7;
                if (i10 < imageReceiverArr.length) {
                    imageReceiverArr[i10] = new ImageReceiver(this);
                    this.f22594i7[i10].J0(org.telegram.messenger.i0.L(12.0f));
                    this.f22606j7[i10] = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                    this.f22606j7[i10].u(org.telegram.messenger.i0.L(18.0f));
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void t1(Canvas canvas, boolean z10) {
        float f7;
        float f10;
        boolean z11;
        int i10;
        float f11;
        float L;
        float f12;
        float f13;
        float f14;
        ej ejVar;
        if ((!this.C8 || z10) && this.D8 != 0) {
            bj bjVar = this.L;
            if (bjVar == null || (ejVar = this.K) == null || !ejVar.f15399i || bjVar.h) {
                boolean P3 = this.O5.P3();
                x1 x1Var = this.gb;
                if (P3) {
                    float L2 = x1Var.f23498j1 - org.telegram.messenger.i0.L(40.0f);
                    this.P8 = L2;
                    ej ejVar2 = this.K;
                    if (ejVar2 != null) {
                        this.P8 = (ejVar2.f15403m.e - this.Uc) + L2;
                    }
                } else {
                    float L3 = org.telegram.messenger.i0.L(8.0f) + x1Var.f23503k1;
                    this.P8 = L3;
                    ej ejVar3 = this.K;
                    if (ejVar3 != null) {
                        this.P8 = (ejVar3.f15403m.f15245g - this.Uc) + L3;
                    }
                    if (r2()) {
                        this.P8 = Math.min(this.P8, getCompactRight() - org.telegram.messenger.i0.L(32.0f));
                    }
                }
                float f15 = 0.0f;
                if (this.D8 == 4) {
                    this.Q8 = org.telegram.messenger.i0.L(6.0f);
                } else {
                    float L4 = (this.f22519c7 + x1Var.f23497j0) - org.telegram.messenger.i0.L(41.0f);
                    this.Q8 = L4;
                    jj jjVar = this.O5;
                    if (jjVar.D == 19 && jjVar.f16374t2 < this.f22809z9) {
                        this.Q8 = L4 - org.telegram.messenger.i0.L(22.0f);
                    }
                    ej ejVar4 = this.K;
                    if (ejVar4 != null) {
                        float f16 = this.Q8;
                        dj djVar = ejVar4.f15403m;
                        float f17 = f16 + djVar.h;
                        this.Q8 = f17;
                        if (djVar.f15247j) {
                            this.Q8 = f17 - getTranslationY();
                        }
                    }
                    if (this.O5.N5()) {
                        sg.p0 p0Var = this.N;
                        p0Var.getClass();
                        if (this.f22772wb) {
                            this.Q8 -= (1.0f - getVideoTranscriptionProgress()) * p0Var.i(x1Var.L1);
                        } else if (p0Var.f48438a > 0.0f) {
                            this.Q8 -= p0Var.i(x1Var.L1);
                        }
                    }
                }
                if (this.D8 != 4) {
                    float L5 = ((this.f22519c7 + x1Var.f23497j0) - org.telegram.messenger.i0.L(32.0f)) / 2.0f;
                    if (this.Q8 < L5) {
                        this.Q8 = L5;
                    }
                }
                if (this.O5.D == 19) {
                    if (this.D8 == 3 && this.f22630l7 != null) {
                        this.Q8 = org.telegram.messenger.i0.L(18.0f);
                    } else {
                        this.Q8 = 0.0f;
                    }
                }
                if (!this.O5.P3() && this.f22772wb && !this.P1) {
                    if (this.E6) {
                        L = (org.telegram.messenger.i0.f3(this.V6, t2()) - org.telegram.messenger.i0.f16030u) * 0.7f;
                    } else {
                        L = org.telegram.messenger.i0.L(50.0f);
                    }
                    if (this.xb) {
                        f12 = (1.0f - getVideoTranscriptionProgress()) * L;
                    } else {
                        f12 = 0.0f;
                    }
                    if (this.xb) {
                        f15 = org.telegram.messenger.i0.L(28.0f) * (1.0f - getVideoTranscriptionProgress());
                    }
                    if (x1Var.f23508l2) {
                        if (this.xb) {
                            f13 = x1Var.L1;
                        } else {
                            f13 = 1.0f - x1Var.L1;
                        }
                        f12 = (1.0f - getVideoTranscriptionProgress()) * f13 * L;
                        if (this.xb) {
                            f14 = x1Var.L1;
                        } else {
                            f14 = 1.0f - x1Var.L1;
                        }
                        f15 = (1.0f - getVideoTranscriptionProgress()) * f14 * org.telegram.messenger.i0.L(28.0f);
                    }
                    this.P8 -= f12;
                    this.Q8 -= f15;
                    if (r2()) {
                        float compactRight = getCompactRight() - org.telegram.messenger.i0.L(32.0f);
                        this.P8 = org.telegram.messenger.i0.T1(Math.min(this.T0.y() + org.telegram.messenger.i0.L(8.0f), compactRight), Math.min(this.P8 + f12, compactRight), getVideoTranscriptionProgress());
                    }
                }
                this.E8 = true;
                if (this.D8 == 3) {
                    if (!this.f22787y || jj.R4(this.O5.f16337k)) {
                        S0(canvas, 1.0f);
                    }
                } else if (!uu0.f31048e0) {
                    float f18 = this.P8;
                    float f19 = this.Q8;
                    float L6 = org.telegram.messenger.i0.L(32.0f) + f18;
                    float f20 = this.Q8;
                    if (this.F8 == 5) {
                        f7 = 64.0f;
                    } else {
                        f7 = 32.0f;
                    }
                    RectF rectF = this.f22488a4;
                    rectF.set(f18, f19, L6, f20 + org.telegram.messenger.i0.L(f7));
                    if (rectF.right >= getMeasuredWidth()) {
                        this.E8 = false;
                        return;
                    }
                    int i11 = (int) ((1.0f - this.D.e) * 255.0f);
                    if (i11 != 255) {
                        float f21 = this.P8;
                        f10 = 32.0f;
                        z11 = false;
                        i10 = canvas.saveLayerAlpha(f21, this.Q8, org.telegram.messenger.i0.L(32.0f) + f21, this.Q8 + org.telegram.messenger.i0.L(64.0f), i11);
                    } else {
                        f10 = 32.0f;
                        z11 = false;
                        i10 = -1;
                    }
                    z();
                    String str = "paintChatActionBackground";
                    if (this.D8 == 4 && this.F8 == 5 && this.G8) {
                        Path path = this.L8;
                        if (path == null) {
                            this.L8 = new Path();
                        } else {
                            path.rewind();
                        }
                        Path path2 = this.M8;
                        if (path2 == null) {
                            this.M8 = new Path();
                        } else {
                            path2.rewind();
                        }
                        boolean z12 = z11;
                        if (this.N8 == null) {
                            float[] fArr = new float[8];
                            this.N8 = fArr;
                            f11 = 2.0f;
                            float L7 = org.telegram.messenger.i0.L(16.0f);
                            fArr[3] = L7;
                            fArr[2] = L7;
                            fArr[1] = L7;
                            fArr[z12 ? 1 : 0] = L7;
                        } else {
                            f11 = 2.0f;
                        }
                        if (this.O8 == null) {
                            this.O8 = r3;
                            float L8 = org.telegram.messenger.i0.L(16.0f);
                            float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f, L8, L8, L8, L8};
                        }
                        RectF rectF2 = org.telegram.messenger.i0.P;
                        float f22 = this.P8;
                        rectF2.set(f22, this.Q8, org.telegram.messenger.i0.L(f10) + f22, this.Q8 + org.telegram.messenger.i0.L(f10));
                        Path path3 = this.L8;
                        float[] fArr3 = this.N8;
                        Path.Direction direction = Path.Direction.CW;
                        path3.addRoundRect(rectF2, fArr3, direction);
                        rectF2.set(this.P8, this.Q8 + org.telegram.messenger.i0.L(f10), this.P8 + org.telegram.messenger.i0.L(f10), this.Q8 + org.telegram.messenger.i0.L(64.0f));
                        this.M8.addRoundRect(rectF2, this.O8, direction);
                        if (this.J8 == 4) {
                            canvas.drawPath(this.L8, X1("paintChatActionBackgroundSelected"));
                            canvas.drawPath(this.M8, X1("paintChatActionBackground"));
                        } else {
                            canvas.drawPath(this.L8, X1("paintChatActionBackground"));
                            canvas.drawPath(this.M8, X1("paintChatActionBackgroundSelected"));
                        }
                    } else {
                        f11 = 2.0f;
                        float L9 = org.telegram.messenger.i0.L(16.0f);
                        float L10 = org.telegram.messenger.i0.L(16.0f);
                        if (this.G8) {
                            str = "paintChatActionBackgroundSelected";
                        }
                        canvas.drawRoundRect(rectF, L9, L10, X1(str));
                    }
                    if (e2()) {
                        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.f20998h2);
                    }
                    int i12 = this.D8;
                    if (i12 == 2) {
                        Drawable W1 = W1("drawableGoIcon");
                        z.u(W1, (this.P8 + org.telegram.messenger.i0.L(16.0f)) - (W1.getIntrinsicWidth() / f11), (this.Q8 + org.telegram.messenger.i0.L(16.0f)) - (W1.getIntrinsicHeight() / f11));
                        W1.draw(canvas);
                    } else if (i12 == 4) {
                        int L11 = (int) (this.P8 + org.telegram.messenger.i0.L(16.0f));
                        int L12 = (int) (this.Q8 + org.telegram.messenger.i0.L(16.0f));
                        Drawable W12 = W1("drawableCloseIcon");
                        int intrinsicWidth = W12.getIntrinsicWidth() / 2;
                        int intrinsicHeight = W12.getIntrinsicHeight() / 2;
                        W12.setBounds(L11 - intrinsicWidth, L12 - intrinsicHeight, intrinsicWidth + L11, intrinsicHeight + L12);
                        z.u(W12, this.P8 + org.telegram.messenger.i0.L(4.0f), this.Q8 + org.telegram.messenger.i0.L(4.0f));
                        canvas.save();
                        canvas.scale(0.65f, 0.65f, W12.getBounds().centerX(), W12.getBounds().centerY());
                        W12.draw(canvas);
                        canvas.restore();
                        if (this.F8 == 5) {
                            Drawable W13 = W1("drawableMoreIcon");
                            int intrinsicWidth2 = W13.getIntrinsicWidth() / 2;
                            int intrinsicHeight2 = W13.getIntrinsicHeight() / 2;
                            W13.setBounds(L11 - intrinsicWidth2, L12 - intrinsicHeight2, L11 + intrinsicWidth2, L12 + intrinsicHeight2);
                            z.u(W13, this.P8 + org.telegram.messenger.i0.L(4.0f), this.Q8 + org.telegram.messenger.i0.L(34.0f));
                            W13.draw(canvas);
                        }
                    } else {
                        int L13 = (int) (this.P8 + org.telegram.messenger.i0.L(16.0f));
                        int L14 = (int) (this.Q8 + org.telegram.messenger.i0.L(16.0f));
                        Drawable W14 = W1("drawableShareIcon");
                        int intrinsicWidth3 = W14.getIntrinsicWidth() / 2;
                        int intrinsicHeight3 = W14.getIntrinsicHeight() / 2;
                        W14.setBounds(L13 - intrinsicWidth3, L14 - intrinsicHeight3, L13 + intrinsicWidth3, L14 + intrinsicHeight3);
                        z.u(W14, this.P8 + org.telegram.messenger.i0.L(4.0f), this.Q8 + org.telegram.messenger.i0.L(4.0f));
                        W14.draw(canvas);
                    }
                    if (i10 != -1) {
                        canvas.restoreToCount(i10);
                    }
                }
            }
        }
    }

    public final boolean t2() {
        jj jjVar = this.O5;
        if (jjVar != null) {
            return jjVar.P2();
        }
        return org.telegram.ui.ActionBar.t6.i1(this.Ob);
    }

    public final void t3(int i10) {
        this.f22648n = i10;
    }

    public final int u0(int i10, jj jjVar) {
        TLRPC.WebPage webPage;
        TLRPC.Document document;
        boolean z10;
        int i11;
        a1 a1Var;
        a1 a1Var2;
        int i12 = i10;
        TLRPC.MessageMedia messageMedia = jjVar.Y0;
        if (messageMedia != null) {
            this.L1 = messageMedia.document;
        } else if (jjVar.D == 0) {
            TLRPC.MessageMedia o12 = jj.o1(jjVar.f16337k);
            if (o12 == null) {
                webPage = null;
            } else {
                webPage = o12.webpage;
            }
            if (webPage == null) {
                document = null;
            } else {
                document = webPage.document;
            }
            this.L1 = document;
        } else {
            this.L1 = jjVar.F0();
        }
        TLRPC.Document document2 = this.L1;
        int i13 = 0;
        if (document2 != null) {
            double d = 0.0d;
            if (jj.Q4(document2)) {
                A1();
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
                org.telegram.messenger.i0.L(94.0f);
                Math.ceil(org.telegram.ui.ActionBar.t6.N2.measureText("00:00"));
                this.T6 = i12 - org.telegram.messenger.i0.L(18.0f);
                T2(jjVar);
                int L = org.telegram.messenger.i0.L(174.0f) + this.f22796y9;
                if (!this.P1) {
                    this.Z6 = Math.min(i12, L + ((int) Math.ceil(org.telegram.ui.ActionBar.t6.N2.measureText(org.telegram.messenger.i0.g0((int) d, true, false)))));
                }
                this.C4.f29697m = jjVar;
                return 0;
            } else if (jj.K4(this.L1)) {
                this.K1 = 4;
                if (!jjVar.m5()) {
                    O3();
                    String i02 = org.telegram.messenger.i0.i0(this.L1.size, false, false);
                    this.f22529d3 = (int) Math.ceil(org.telegram.ui.ActionBar.t6.C2.measureText(i02));
                    this.f22515c3 = new StaticLayout(i02, org.telegram.ui.ActionBar.t6.C2, this.f22529d3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return 0;
                }
            } else if (jj.J3(this.L1)) {
                A1();
                this.K1 = 5;
                int L2 = i12 - org.telegram.messenger.i0.L(92.0f);
                if (L2 < 0) {
                    L2 = org.telegram.messenger.i0.L(100.0f);
                }
                int i15 = L2;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(jjVar.z1(true).replace('\n', ' '), org.telegram.ui.ActionBar.t6.O2, i15 - org.telegram.messenger.i0.L(12.0f), truncateAt);
                a1 a1Var3 = this.I4;
                TextPaint textPaint = org.telegram.ui.ActionBar.t6.O2;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                a1Var3.d = new StaticLayout(ellipsize, textPaint, i15, alignment, 1.0f, 0.0f, false);
                if (this.I4.d.getLineCount() > 0) {
                    this.I4.e = -((int) Math.ceil(a1Var2.d.getLineLeft(0)));
                    int lineWidth = (int) this.I4.d.getLineWidth(0);
                    if (org.telegram.messenger.i0.L(104.0f) + lineWidth > this.Z6) {
                        this.Z6 = org.telegram.messenger.i0.L(104.0f) + lineWidth;
                    }
                }
                this.I4.f21661f = new StaticLayout(TextUtils.ellipsize(jjVar.x1(true).replace('\n', ' '), org.telegram.ui.ActionBar.t6.P2, i15, truncateAt), org.telegram.ui.ActionBar.t6.P2, i15, alignment, 1.0f, 0.0f, false);
                if (this.I4.f21661f.getLineCount() > 0) {
                    this.I4.f21662g = -((int) Math.ceil(a1Var.f21661f.getLineLeft(0)));
                    int lineWidth2 = (int) this.I4.f21661f.getLineWidth(0);
                    if (org.telegram.messenger.i0.L(104.0f) + lineWidth2 > this.Z6) {
                        this.Z6 = org.telegram.messenger.i0.L(104.0f) + lineWidth2;
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
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.t6.N2.measureText(org.telegram.messenger.i0.k0(i16, i16)));
                org.telegram.messenger.i0.L(86.0f);
                this.T6 = this.Z6 - org.telegram.messenger.i0.L(28.0f);
                return ceil;
            } else if (jj.s3(this.L1, jjVar.z2())) {
                this.K1 = 2;
                if (!jjVar.m5()) {
                    String L0 = cd.L0(2131753971, "AttachGif");
                    this.A3 = (int) Math.ceil(org.telegram.ui.ActionBar.t6.C2.measureText(L0));
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.t6.C2;
                    int i17 = this.A3;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    this.f22752v3 = new StaticLayout(L0, textPaint2, i17, alignment2, 1.0f, 0.0f, false);
                    String i03 = org.telegram.messenger.i0.i0(this.L1.size, false, false);
                    this.f22529d3 = (int) Math.ceil(org.telegram.ui.ActionBar.t6.C2.measureText(i03));
                    this.f22515c3 = new StaticLayout(i03, org.telegram.ui.ActionBar.t6.C2, this.f22529d3, alignment2, 1.0f, 0.0f, false);
                }
            } else {
                String str = this.L1.mime_type;
                if ((str != null && (str.toLowerCase().startsWith("image/") || this.L1.mime_type.toLowerCase().startsWith("video/mp4"))) || jj.W2(this.L1)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.M1 = z10;
                if (!z10) {
                    i12 += org.telegram.messenger.i0.L(30.0f);
                }
                int i18 = i12;
                this.K1 = 1;
                String B = org.telegram.messenger.b8.B(this.L1);
                if (B.length() == 0) {
                    B = cd.L0(2131753975, "AttachDocument");
                }
                StaticLayout c10 = ov0.c(B, org.telegram.ui.ActionBar.t6.G2, i18, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.MIDDLE, i18, 2, false);
                this.f22515c3 = c10;
                this.f22543e3 = Integer.MIN_VALUE;
                if (c10 != null && c10.getLineCount() > 0) {
                    int i19 = 0;
                    for (int i20 = 0; i20 < this.f22515c3.getLineCount(); i20++) {
                        i19 = Math.max(i19, (int) Math.ceil(this.f22515c3.getLineWidth(i20)));
                        this.f22543e3 = Math.max(this.f22543e3, (int) Math.ceil(-this.f22515c3.getLineLeft(i20)));
                    }
                    i11 = Math.min(i18, i19);
                } else {
                    this.f22543e3 = 0;
                    i11 = i18;
                }
                int min = Math.min(i18 - org.telegram.messenger.i0.L(30.0f), (int) Math.ceil(org.telegram.ui.ActionBar.t6.C2.measureText("000.0 mm / ".concat(org.telegram.messenger.i0.i0(this.L1.size, false, false)))));
                this.A3 = min;
                CharSequence ellipsize2 = TextUtils.ellipsize(org.telegram.messenger.i0.i0(this.L1.size, false, false) + " " + org.telegram.messenger.b8.A(this.L1), org.telegram.ui.ActionBar.t6.C2, min, TextUtils.TruncateAt.END);
                try {
                    if (this.A3 < 0) {
                        this.A3 = org.telegram.messenger.i0.L(10.0f);
                    }
                    this.f22752v3 = new StaticLayout(ellipsize2, org.telegram.ui.ActionBar.t6.C2, this.A3 + org.telegram.messenger.i0.L(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                if (this.M1) {
                    this.f22516c4 = org.telegram.messenger.b8.w(jjVar.f16348n0, 320, false, null, false);
                    this.f22530d4 = org.telegram.messenger.b8.w(jjVar.f16348n0, 40, false, null, false);
                    if (this.O5.x3() || (org.telegram.messenger.b6.q(this.Y5).l() & 1) == 0) {
                        this.f22516c4 = null;
                    }
                    TLRPC.PhotoSize photoSize = this.f22516c4;
                    ag.c2 c2Var = this.T0;
                    if (photoSize != null && photoSize != this.f22530d4) {
                        BitmapDrawable bitmapDrawable = this.O5.G1;
                        if (bitmapDrawable != null) {
                            this.f22530d4 = null;
                            this.f22544e4 = bitmapDrawable;
                        }
                    } else {
                        this.f22516c4 = null;
                        c2Var.F0 = true;
                        c2Var.G0 = true;
                    }
                    this.f22556f4 = "86_86_b";
                    c2Var.r0(ic.f(this.f22516c4, jjVar.f16342l0), "86_86", ic.f(this.f22530d4, jjVar.f16342l0), this.f22556f4, this.f22544e4, 0L, null, jjVar, 1);
                }
                return i11;
            }
        }
        return 0;
    }

    public final void u1(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f7, boolean z14, float f10, float f11, float f12, boolean z15, boolean z16) {
        float photoBottom;
        float f13;
        float f14;
        float f15;
        int L;
        int L2;
        int i10;
        Drawable W1;
        Drawable drawable;
        int w02;
        float f16;
        jj jjVar;
        boolean z17 = (f12 == 1.0f || z15) ? false : true;
        float f17 = (f12 * 0.5f) + 0.5f;
        float f18 = z17 ? f7 * f12 : f7;
        if (this.K1 != 7 || ((jjVar = this.O5) != null && jjVar.g4())) {
            photoBottom = getPhotoBottom() + this.f22749v0;
        } else {
            photoBottom = f11 - ((1.0f - getVideoTranscriptionProgress()) * (this.N.i(this.gb.L1) + org.telegram.messenger.i0.L(this.J ? 4.0f : 5.0f)));
        }
        float L3 = photoBottom - org.telegram.messenger.i0.L(8.5f);
        jj jjVar2 = this.O5;
        float L4 = (jjVar2 == null || !jjVar2.M2()) ? 0.0f : org.telegram.messenger.i0.L(-6.0f);
        float f19 = 22.0f;
        if (z12) {
            qb0 qb0Var = org.telegram.ui.ActionBar.t6.E3;
            if (B3()) {
                if (this.O5.O5()) {
                    f13 = 1.0f;
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, this.Ob);
                    int i11 = this.f22505b7;
                    f16 = z14 ? 24.0f : 22.0f;
                    qb0Var.getClass();
                    f15 = 4.0f;
                    z.u(qb0Var, ((i11 - org.telegram.messenger.i0.L(f16)) - org.telegram.messenger.i0.L(12.0f)) + L4, (L3 - org.telegram.messenger.i0.L(12.0f)) + f10);
                    qb0Var.setAlpha((int) (this.f22591i4 * 255.0f * f18));
                } else {
                    f13 = 1.0f;
                    f15 = 4.0f;
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21008hd, this.Ob);
                    int i12 = this.f22505b7;
                    f16 = z14 ? 24.0f : 22.0f;
                    qb0Var.getClass();
                    z.u(qb0Var, ((i12 - org.telegram.messenger.i0.L(f16)) - org.telegram.messenger.i0.L(12.0f)) + L4, (L3 - org.telegram.messenger.i0.L(12.0f)) + f10);
                    qb0Var.setAlpha((int) (f18 * 255.0f));
                }
                f14 = 18.5f;
            } else {
                f13 = 1.0f;
                f15 = 4.0f;
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bb, this.Ob);
                qb0Var.getClass();
                f14 = 18.5f;
                z.u(qb0Var, (this.f22505b7 - org.telegram.messenger.i0.L(18.5f)) - org.telegram.messenger.i0.L(12.0f), ((f11 - org.telegram.messenger.i0.L(8.5f)) - org.telegram.messenger.i0.L(12.0f)) + f10);
                qb0Var.setAlpha((int) (f18 * 255.0f));
            }
            qb0Var.a(w02);
            if (z17) {
                canvas.save();
                canvas.scale(f17, f17, qb0Var.getBounds().centerX(), qb0Var.getBounds().centerY());
            }
            qb0Var.draw(canvas);
            qb0Var.setAlpha(255);
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
            if (B3()) {
                if (z15) {
                    canvas.save();
                }
                if (this.O5.O5()) {
                    drawable = W1("drawableMsgStickerCheck");
                    if (z10) {
                        if (z15) {
                            canvas.translate(org.telegram.messenger.i0.L(4.8f) * (f13 - f12), 0.0f);
                        }
                        z.u(drawable, ((this.f22505b7 - org.telegram.messenger.i0.L(z14 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f10);
                    } else {
                        z.u(drawable, ((this.f22505b7 - org.telegram.messenger.i0.L(z14 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f10);
                    }
                    drawable.setAlpha((int) (this.f22591i4 * 255.0f * f18));
                } else {
                    if (z10) {
                        if (z15) {
                            canvas.translate((f13 - f12) * org.telegram.messenger.i0.L(4.8f), 0.0f);
                        }
                        z.u(org.telegram.ui.ActionBar.t6.F3, (this.f22505b7 - org.telegram.messenger.i0.L(z14 ? 28.3f : 26.3f)) - org.telegram.ui.ActionBar.t6.F3.getIntrinsicWidth(), (L3 - org.telegram.ui.ActionBar.t6.F3.getIntrinsicHeight()) + f10);
                    } else {
                        z.u(org.telegram.ui.ActionBar.t6.F3, (this.f22505b7 - org.telegram.messenger.i0.L(z14 ? 23.5f : 21.5f)) - org.telegram.ui.ActionBar.t6.F3.getIntrinsicWidth(), (L3 - org.telegram.ui.ActionBar.t6.F3.getIntrinsicHeight()) + f10);
                    }
                    org.telegram.ui.ActionBar.t6.F3.setAlpha((int) (this.f22591i4 * 255.0f * f18));
                    drawable = org.telegram.ui.ActionBar.t6.F3;
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
                        canvas.translate((f13 - f12) * org.telegram.messenger.i0.L(f15), 0.0f);
                    }
                    W1 = W1(z16 ? "drawableMsgOutCheckReadSelected" : "drawableMsgOutCheckRead");
                    z.u(W1, ((this.f22505b7 - org.telegram.messenger.i0.L(22.5f)) - W1.getIntrinsicWidth()) + L4, ((f11 - org.telegram.messenger.i0.L((this.F || this.E) ? 9.0f : 8.0f)) - W1.getIntrinsicHeight()) + f10);
                } else {
                    W1 = W1(z16 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    z.u(W1, ((this.f22505b7 - org.telegram.messenger.i0.L(f14)) - W1.getIntrinsicWidth()) + L4, ((f11 - org.telegram.messenger.i0.L((this.F || this.E) ? 9.0f : 8.0f)) - W1.getIntrinsicHeight()) + f10);
                }
                W1.setAlpha((int) (f18 * 255.0f));
                if (z17) {
                    canvas.save();
                    canvas.scale(f17, f17, W1.getBounds().centerX(), W1.getBounds().centerY());
                }
                W1.draw(canvas);
                if (z17) {
                    canvas.restore();
                }
                if (z15) {
                    canvas.restore();
                }
                W1.setAlpha(255);
            }
        }
        if (z10) {
            if (B3()) {
                Drawable W12 = this.O5.O5() ? W1("drawableMsgStickerHalfCheck") : org.telegram.ui.ActionBar.t6.G3;
                z.u(W12, ((this.f22505b7 - org.telegram.messenger.i0.L(z14 ? 23.5f : 21.5f)) - W12.getIntrinsicWidth()) + L4, (L3 - W12.getIntrinsicHeight()) + f10);
                W12.setAlpha((int) (this.f22591i4 * 255.0f * f18));
                if (z17 || z15) {
                    canvas.save();
                    canvas.scale(f17, f17, W12.getBounds().centerX(), W12.getBounds().centerY());
                }
                W12.draw(canvas);
                if (z17 || z15) {
                    canvas.restore();
                }
                W12.setAlpha(255);
            } else {
                Drawable W13 = W1(z16 ? "drawableMsgOutHalfCheckSelected" : "drawableMsgOutHalfCheck");
                z.u(W13, (this.f22505b7 - org.telegram.messenger.i0.L(18.0f)) - W13.getIntrinsicWidth(), ((f11 - org.telegram.messenger.i0.L((this.F || this.E) ? 9.0f : 8.0f)) - W13.getIntrinsicHeight()) + f10);
                W13.setAlpha((int) (f18 * 255.0f));
                if (z17 || z15) {
                    canvas.save();
                    canvas.scale(f17, f17, W13.getBounds().centerX(), W13.getBounds().centerY());
                }
                W13.draw(canvas);
                if (z17 || z15) {
                    canvas.restore();
                }
                W13.setAlpha(255);
            }
        }
        if (z13) {
            if (B3()) {
                L = this.f22505b7 - org.telegram.messenger.i0.L(34.5f);
                L2 = org.telegram.messenger.i0.L(26.5f);
            } else {
                L = this.f22505b7 - org.telegram.messenger.i0.L(32.0f);
                if (!this.F && !this.E) {
                    f19 = 21.0f;
                }
                L2 = org.telegram.messenger.i0.L(f19);
            }
            float f20 = (f11 - L2) + f10;
            RectF rectF = this.f22488a4;
            rectF.set((int) (L + L4), f20, org.telegram.messenger.i0.L(14.0f) + i10, org.telegram.messenger.i0.L(14.0f) + f20);
            int alpha = org.telegram.ui.ActionBar.t6.f20887b2.getAlpha();
            org.telegram.ui.ActionBar.t6.f20887b2.setAlpha((int) (alpha * f18));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(f13), org.telegram.messenger.i0.L(f13), org.telegram.ui.ActionBar.t6.f20887b2);
            org.telegram.ui.ActionBar.t6.f20887b2.setAlpha(alpha);
            z.u(org.telegram.ui.ActionBar.t6.f21036j4, org.telegram.messenger.i0.L(6.0f) + i10, f20 + org.telegram.messenger.i0.L(2.0f));
            org.telegram.ui.ActionBar.t6.f21036j4.setAlpha((int) (f18 * 255.0f));
            if (z17) {
                canvas.save();
                canvas.scale(f17, f17, org.telegram.ui.ActionBar.t6.f21036j4.getBounds().centerX(), org.telegram.ui.ActionBar.t6.f21036j4.getBounds().centerY());
            }
            org.telegram.ui.ActionBar.t6.f21036j4.draw(canvas);
            org.telegram.ui.ActionBar.t6.f21036j4.setAlpha(255);
            if (z17) {
                canvas.restore();
            }
        }
    }

    public final boolean u2(jj jjVar) {
        int i10 = jj.o1(this.O5.f16337k).period;
        int currentTime = ConnectionsManager.getInstance(this.Y5).getCurrentTime();
        if (i10 == Integer.MAX_VALUE) {
            return false;
        }
        if (i10 % 60 == 0) {
            if (Math.abs(currentTime - jjVar.f16337k.date) <= i10) {
                return false;
            }
            return true;
        } else if (Math.abs(currentTime - jjVar.f16337k.date) <= i10 - 5) {
            return false;
        } else {
            return true;
        }
    }

    public final void u3(int i10, int i11) {
        org.telegram.ui.ActionBar.c5 c5Var;
        this.K0 = i10;
        this.L0 = i11;
        this.f22495ab = i11;
        if ((this.O5 != null && e2() && this.O5.O5()) || ((c5Var = this.J6) != null && c5Var.f20210a != null)) {
            invalidate();
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            invalidate();
            n2();
        }
    }

    public void v1(float r16, android.graphics.Canvas r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.v1(float, android.graphics.Canvas, boolean):void");
    }

    public boolean v2() {
        if (((isPressed() && this.B6) || ((!this.B6 && this.f22743u6) || this.f22755v6)) && !F3() && !j2()) {
            jj jjVar = this.O5;
            if (jjVar == null || !jjVar.f16365r1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void v3(float f7, float f10, boolean z10) {
        float f11;
        boolean z11;
        if (this.h != z10) {
            this.h = z10;
            P();
            if (z10) {
                invalidate();
            }
        }
        ag.c2 c2Var = this.T0;
        float f12 = f7 - c2Var.L0;
        float measuredHeight = f10 - (getMeasuredHeight() - c2Var.A());
        float f13 = c2Var.N0;
        if (f12 > 0.0f) {
            f11 = f13 - f12;
        } else {
            f11 = f13;
        }
        if (measuredHeight > 0.0f) {
            f11 -= measuredHeight;
        }
        if (f11 / f13 < 0.25f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22710s = z11;
        c2Var.A1 = z11;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        y yVar;
        kh.b bVar;
        kh.a aVar;
        m1 m1Var;
        m1 m1Var2;
        m1 m1Var3;
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.H2;
            if (drawable != drawableArr[0] && drawable != this.f22765w3 && drawable != drawableArr[1]) {
                t1 t1Var = this.X0;
                if (t1Var != null) {
                    yVar = t1Var.f23084x;
                } else {
                    yVar = null;
                }
                if (drawable == yVar || drawable == this.T2 || drawable == this.Ia || ((drawable != null && (((m1Var = this.f22550ec) != null && drawable == m1Var.f22285k) || (((m1Var2 = this.f22563fc) != null && drawable == m1Var2.f22285k) || ((m1Var3 = this.Lc) != null && drawable == m1Var3.f22285k)))) || ((this.N != null && (drawable instanceof org.telegram.ui.Components.e6)) || (drawable instanceof t80)))) {
                    return true;
                }
                w1 w1Var = this.f22751v2;
                if (w1Var == null || (aVar = w1Var.f23360l) == null || (drawable != aVar && drawable != aVar.f11383a)) {
                    ArrayList arrayList = this.O4;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        p1 p1Var = (p1) obj;
                        if (p1Var.f22439w != drawable && ((bVar = p1Var.f22440x) == null || (drawable != bVar && drawable != bVar.f11373a && drawable != bVar.f11374b))) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void w0() {
        float f7;
        float f10;
        int i10;
        int measureText;
        boolean z10;
        if (this.f22713s2) {
            z0(0);
        }
        if (this.f22713s2 && this.f22677p2 == null) {
            this.B2 = org.telegram.messenger.i0.L(33.0f);
            CharSequence charSequence = this.f22777x2;
            if (charSequence == null) {
                int i11 = this.f22764w2;
                if (i11 == 12) {
                    charSequence = cd.L0(2131747824, null);
                } else if (i11 == 1) {
                    charSequence = cd.L0(2131747828, null);
                } else if (i11 == 29) {
                    charSequence = cd.L0(2131747825, null);
                } else if (i11 == 13) {
                    charSequence = cd.L0(2131745618, null).toUpperCase();
                } else if (i11 == 32) {
                    charSequence = cd.L0(2131747802, null).toUpperCase();
                } else if (i11 == 85) {
                    charSequence = cd.L0(2131747832, null);
                } else if (i11 == 10) {
                    charSequence = cd.L0(2131747829, null);
                } else if (i11 == 2) {
                    charSequence = cd.L0(2131747816, null);
                } else if (i11 == 3) {
                    charSequence = cd.L0(2131747803, null);
                } else if (i11 == 5) {
                    charSequence = cd.L0(2131743582, null);
                } else if (i11 == 6) {
                    charSequence = cd.L0(2131747830, null);
                } else if (i11 == 7) {
                    charSequence = cd.L0(2131747800, null);
                } else if (i11 != 9 && i11 != 11) {
                    if (i11 == 25) {
                        charSequence = cd.L0(2131743393, null);
                    } else if (i11 == 14) {
                        charSequence = cd.L0(2131743584, null).toUpperCase();
                    } else if (i11 == 15) {
                        charSequence = cd.L0(2131752918, null).toUpperCase();
                    } else if (i11 == 16) {
                        charSequence = cd.L0(2131747805, null).toUpperCase();
                    } else if (i11 == 17) {
                        charSequence = cd.L0(2131743567, null).toUpperCase();
                    } else if (i11 != 18 && i11 != 22) {
                        if (i11 == 19) {
                            charSequence = cd.L0(2131753346, null);
                        } else if (i11 == 20) {
                            charSequence = cd.L0(2131747820, null);
                        } else if (i11 == 21) {
                            charSequence = cd.L0(2131754230, null);
                        } else if (i11 == 23) {
                            charSequence = cd.L0(2131747801, null);
                        } else if (i11 == 24) {
                            charSequence = cd.L0(2131747823, null);
                        } else if (i11 == 26) {
                            TL_stars.StarGift starGift = this.f22539dd;
                            if (starGift != null) {
                                if (starGift.auction_start_date > ConnectionsManager.getInstance(this.Y5).getCurrentTime()) {
                                    charSequence = cd.L0(2131747817, null);
                                    z10 = false;
                                } else {
                                    if (this.f22539dd.sold_out) {
                                        charSequence = cd.L0(2131747818, null);
                                    } else {
                                        charSequence = cd.L0(2131747819, null);
                                    }
                                    z10 = true;
                                }
                                if (z10) {
                                    SpannableString spannableString = new SpannableString("*");
                                    spannableString.setSpan(new dq(2131231117, 0), 0, spannableString.length(), 33);
                                    charSequence = TextUtils.concat(spannableString, " ", charSequence);
                                }
                            } else {
                                charSequence = cd.L0(2131747799, null);
                            }
                        } else if (i11 == 27) {
                            charSequence = cd.L0(2131749090, null).toUpperCase();
                        } else if (i11 == 28) {
                            charSequence = cd.L0(2131743583, null);
                        } else {
                            charSequence = cd.L0(2131749202, null);
                        }
                    } else {
                        charSequence = cd.L0(2131753616, null);
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) jj.o1(this.O5.f16337k).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = cd.L0(2131743392, null);
                    } else {
                        charSequence = cd.L0(2131743393, null);
                    }
                }
            }
            if (this.O5.r4() && this.Z6 < (measureText = (int) (org.telegram.ui.ActionBar.t6.M2.measureText(charSequence, 0, charSequence.length()) + org.telegram.messenger.i0.L(75.0f)))) {
                this.Z6 = measureText;
            }
            int L = this.Z6 - org.telegram.messenger.i0.L(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.t6.M2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.t6.M2, org.telegram.messenger.i0.L(2.0f) + L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f22677p2 = staticLayout;
            int lineCount = staticLayout.getLineCount();
            float f11 = 0.0f;
            if (lineCount > 0) {
                f7 = this.f22677p2.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f22688q2 = f7;
            if (this.f22677p2.getLineCount() > 0) {
                f11 = this.f22677p2.getLineLeft(0);
            }
            this.f22700r2 = f11;
            int i12 = this.Z6;
            int i13 = this.f22764w2;
            if (i13 != 82 && i13 != 81 && i13 != 80 && i13 != 84 && i13 != 83) {
                f10 = 34.0f;
            } else {
                f10 = 13.0f;
            }
            this.B2 = i12 - org.telegram.messenger.i0.L(f10);
            int L2 = org.telegram.messenger.i0.L(46.0f) + this.f22737u0;
            this.f22737u0 = L2;
            if (this.O5.D == 12) {
                this.f22737u0 = org.telegram.messenger.i0.L(14.0f) + L2;
            }
            if (this.O5.r4()) {
                this.f22737u0 = org.telegram.messenger.i0.L(2.0f) + this.f22737u0;
            }
            StaticLayout staticLayout2 = this.f22677p2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.B2 - Math.ceil(this.f22677p2.getLineWidth(0)))) / 2;
                if (this.f22764w2 == 0) {
                    i10 = org.telegram.messenger.i0.L(8.0f);
                } else {
                    i10 = 0;
                }
                this.f22802z2 = ceil + i10;
                int lineLeft = (int) this.f22677p2.getLineLeft(0);
                this.A2 = lineLeft;
                this.f22802z2 += -lineLeft;
            }
        }
    }

    public final void w1(Canvas canvas, float f7, boolean z10, float f10, StaticLayout staticLayout, float f11, boolean z11) {
        int i10;
        float f12;
        RectF rectF;
        int i11;
        char c10;
        char c11;
        char c12;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z12;
        x1 x1Var;
        float f13;
        boolean z13;
        int i16;
        q1 q1Var;
        String str;
        float f14;
        float L;
        x1 x1Var2;
        boolean z14;
        float f15;
        int i17;
        x1 x1Var3;
        boolean z15;
        float f16;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        int i18;
        Paint X1;
        float f17;
        float f18;
        int L2;
        boolean z21;
        float photoBottom;
        int i19;
        int i20;
        float f19;
        boolean z22;
        x1 x1Var4;
        float f20;
        float f21;
        boolean z23;
        int i21;
        boolean z24;
        jj jjVar;
        TextPaint textPaint;
        int i22;
        int i23;
        q1 q1Var2 = this;
        Canvas canvas2 = canvas;
        if (((q1Var2.D9 && !q1Var2.M) || !q1Var2.B3()) && staticLayout != null) {
            jj jjVar2 = q1Var2.O5;
            if ((!jjVar2.Z || q1Var2.L == null) && (i10 = jjVar2.D) != 16) {
                if (i10 == 5) {
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.t6.T2;
                    if (q1Var2.r2()) {
                        i22 = q1Var2.O5.P3() ? org.telegram.ui.ActionBar.t6.gc : org.telegram.ui.ActionBar.t6.f20899be;
                    } else {
                        i22 = org.telegram.ui.ActionBar.t6.Wc;
                    }
                    int w02 = org.telegram.ui.ActionBar.t6.w0(i22, q1Var2.Ob);
                    if (q1Var2.v2()) {
                        i23 = q1Var2.O5.P3() ? org.telegram.ui.ActionBar.t6.f20897bc : org.telegram.ui.ActionBar.t6.f20918ce;
                    } else {
                        i23 = q1Var2.O5.P3() ? org.telegram.ui.ActionBar.t6.gc : org.telegram.ui.ActionBar.t6.f20899be;
                    }
                    textPaint2.setColor(i0.b.f(q1Var2.getVideoTranscriptionProgress(), w02, org.telegram.ui.ActionBar.t6.w0(i23, q1Var2.Ob)));
                } else if (q1Var2.B3()) {
                    if (q1Var2.O5.O5()) {
                        org.telegram.ui.ActionBar.t6.T2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, q1Var2.Ob));
                    } else {
                        org.telegram.ui.ActionBar.t6.T2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Yd, q1Var2.Ob));
                    }
                } else if (q1Var2.O5.P3()) {
                    org.telegram.ui.ActionBar.t6.T2.setColor(org.telegram.ui.ActionBar.t6.w0(z11 ? org.telegram.ui.ActionBar.t6.f20897bc : org.telegram.ui.ActionBar.t6.gc, q1Var2.Ob));
                } else {
                    org.telegram.ui.ActionBar.t6.T2.setColor(org.telegram.ui.ActionBar.t6.w0(z11 ? org.telegram.ui.ActionBar.t6.f20918ce : org.telegram.ui.ActionBar.t6.f20899be, q1Var2.Ob));
                }
                float f22 = q1Var2.getTransitionParams().K1 ? q1Var2.getTransitionParams().L1 * f7 : f7;
                if (f22 != 1.0f) {
                    org.telegram.ui.ActionBar.t6.T2.setAlpha((int) (textPaint.getAlpha() * f22));
                }
                canvas2.save();
                if (q1Var2.J && !q1Var2.B3()) {
                    canvas2.translate(0.0f, org.telegram.messenger.i0.L(2.0f));
                }
                float f23 = q1Var2.f22519c7;
                x1 x1Var5 = q1Var2.gb;
                if (x1Var5.f23554x0) {
                    f23 += x1Var5.f23497j0;
                }
                ej ejVar = q1Var2.K;
                if (ejVar == null || !ejVar.f15403m.f15247j) {
                    f12 = f10;
                } else {
                    f23 -= q1Var2.getTranslationY();
                    f12 = f10 + q1Var2.K.f15403m.f15245g;
                }
                float f24 = f23;
                float f25 = f12;
                if (q1Var2.J && q1Var2.B3()) {
                    f24 += org.telegram.messenger.i0.L(1.0f);
                }
                float f26 = f24;
                if (x1Var5.f23554x0) {
                    float f27 = q1Var2.Uc;
                    f12 += f27;
                    f25 += f27;
                }
                float f28 = f12;
                boolean N5 = q1Var2.O5.N5();
                sg.p0 p0Var = q1Var2.N;
                if (N5) {
                    p0Var.getClass();
                }
                if (x1Var5.U0) {
                    f25 = sc.e.z(1.0f, x1Var5.L1, x1Var5.Z0, f25);
                }
                float f29 = f25;
                boolean B3 = q1Var2.B3();
                RectF rectF2 = q1Var2.f22488a4;
                ag.c2 c2Var = q1Var2.T0;
                if (B3) {
                    if (q1Var2.f22756v7) {
                        i18 = q1Var2.r2() ? q1Var2.getCommentButtonHeight() : org.telegram.messenger.i0.L(41.3f);
                    } else {
                        i18 = 0;
                    }
                    int i24 = -i18;
                    if (q1Var2.O5.O5()) {
                        X1 = q1Var2.X1("paintChatActionBackground");
                    } else {
                        X1 = q1Var2.X1("paintChatTimeBackground");
                    }
                    int alpha = X1.getAlpha();
                    float f30 = f22;
                    org.telegram.ui.ActionBar.t6.T2.setAlpha((int) (q1Var2.f22591i4 * 255.0f * f30));
                    jj jjVar3 = q1Var2.O5;
                    if (jjVar3 == null || jjVar3.D != 4) {
                        f17 = f26;
                        f18 = f30;
                    } else {
                        float f31 = c2Var.N() ? 1.0f : c2Var.f14384h1;
                        if (!c2Var.L()) {
                            f31 = 0.0f;
                        }
                        f17 = f26;
                        f18 = org.telegram.messenger.i0.T1(0.35f, 1.0f, f31);
                    }
                    jj jjVar4 = q1Var2.O5;
                    if (jjVar4 != null && jjVar4.f16395z0) {
                        org.telegram.ui.Components.d5 d5Var = q1Var2.f22625l0;
                        f18 *= d5Var == null ? 0.0f : d5Var.e();
                    }
                    X1.setAlpha((int) c3.i0.E(alpha, q1Var2.f22591i4, f18, 0.6f));
                    if (q1Var2.Y3()) {
                        int L3 = org.telegram.messenger.i0.L(8.0f);
                        int i25 = tz.Y0;
                        if (i25 > 2) {
                            i25 -= 2;
                        }
                        L2 = Math.min(L3, org.telegram.messenger.i0.L(i25));
                        z21 = tz.Y0 >= 10;
                        i11 = 2;
                    } else {
                        int i26 = q1Var2.K1;
                        if (i26 != 7 && i26 != 6 && q1Var2.O5.D != 19) {
                            int[] iArr = c2Var.W0;
                            i11 = 2;
                            L2 = Math.min(org.telegram.messenger.i0.L(8.0f), Math.max(iArr[2], iArr[3]));
                            z21 = tz.Y0 >= 10;
                        } else {
                            i11 = 2;
                            int L4 = org.telegram.messenger.i0.L(4.0f);
                            jj jjVar5 = q1Var2.O5;
                            L2 = L4 + ((jjVar5 == null || !jjVar5.M2()) ? 0 : org.telegram.messenger.i0.L(8.0f));
                            z21 = false;
                        }
                    }
                    jj jjVar6 = q1Var2.O5;
                    float L5 = f28 + ((jjVar6 == null || !jjVar6.M2()) ? 0 : org.telegram.messenger.i0.L(-6.0f));
                    if (q1Var2.f22587i0 != 0) {
                        L5 -= org.telegram.messenger.i0.L(18.0f);
                    }
                    float L6 = L5 - org.telegram.messenger.i0.L(z21 ? 6.0f : 4.0f);
                    jj jjVar7 = q1Var2.O5;
                    float L7 = (jjVar7 == null || !jjVar7.M2()) ? 0.0f : org.telegram.messenger.i0.L(2.0f);
                    float f32 = f18;
                    float f33 = L5;
                    if (q1Var2.K1 != 7 || ((jjVar = q1Var2.O5) != null && jjVar.g4())) {
                        photoBottom = q1Var2.getPhotoBottom() + q1Var2.f22749v0;
                    } else {
                        photoBottom = f17 - ((1.0f - q1Var2.getVideoTranscriptionProgress()) * (p0Var.i(x1Var5.L1) + org.telegram.messenger.i0.L(q1Var2.J ? 4.0f : 5.0f)));
                    }
                    float f34 = photoBottom;
                    float L8 = f34 - org.telegram.messenger.i0.L(23.0f);
                    float max = Math.max(org.telegram.messenger.i0.L(17.0f), org.telegram.ui.ActionBar.t6.T2.getTextSize() + org.telegram.messenger.i0.L(5.0f));
                    float f35 = L6 - L7;
                    float f36 = L7 + L6 + f11;
                    int i27 = z21 ? 12 : 8;
                    if (q1Var2.O5.P3()) {
                        i19 = i27;
                        i20 = (q1Var2.O5.D == 19 ? 4 : 0) + 20;
                    } else {
                        i19 = i27;
                        i20 = 0;
                    }
                    rectF2.set(f35, L8, f36 + org.telegram.messenger.i0.L(i19 + i20), L8 + max);
                    n4 n4Var = q1Var2.V5;
                    if (n4Var != null) {
                        float f37 = L2;
                        canvas2.save();
                        Path path = n4Var.f22353t;
                        path.rewind();
                        path.addRoundRect(rectF2, f37, f37, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.drawColor(1073741824);
                        canvas2.restore();
                    } else if (!jj.b4(q1Var2.O5.f16337k)) {
                        if (q1Var2.O5.t2() && q1Var2.O5.D != 5) {
                            Path path2 = q1Var2.f22804z4;
                            path2.rewind();
                            float f38 = L2;
                            path2.addRoundRect(rectF2, f38, f38, Path.Direction.CW);
                            canvas2.save();
                            canvas2.clipPath(path2);
                            ImageReceiver imageReceiver = q1Var2.O5.m5() ? c2Var : q1Var2.U0;
                            float alpha2 = imageReceiver.getAlpha();
                            imageReceiver.setAlpha(0.5f * alpha2);
                            imageReceiver.h(canvas2, null);
                            imageReceiver.setAlpha(alpha2);
                            canvas2.restore();
                            Paint X12 = q1Var2.X1("paintChatTimeBackground");
                            int alpha3 = X12.getAlpha();
                            X12.setAlpha((int) (alpha3 * q1Var2.f22603j4 * 0.4f));
                            canvas2.drawRoundRect(rectF2, f38, f38, X12);
                            X12.setAlpha(alpha3);
                        } else {
                            q1Var2.z();
                            float f39 = L2;
                            canvas2.drawRoundRect(rectF2, f39, f39, X1);
                            if (X1 == q1Var2.X1("paintChatActionBackground") && q1Var2.e2()) {
                                int alpha4 = org.telegram.ui.ActionBar.t6.f20998h2.getAlpha();
                                org.telegram.ui.ActionBar.t6.f20998h2.setAlpha((int) (alpha4 * q1Var2.f22591i4 * f32));
                                canvas2.drawRoundRect(rectF2, f39, f39, org.telegram.ui.ActionBar.t6.f20998h2);
                                org.telegram.ui.ActionBar.t6.f20998h2.setAlpha(alpha4);
                            }
                        }
                    }
                    X1.setAlpha(alpha);
                    float f40 = -staticLayout.getLineLeft(0);
                    jj jjVar8 = q1Var2.O5;
                    float L9 = f40 + ((jjVar8 == null || !jjVar8.M2()) ? 0 : org.telegram.messenger.i0.L(-6.0f));
                    if (q1Var2.O5.N5()) {
                        p0Var.getClass();
                    }
                    if ((!org.telegram.messenger.w3.T(q1Var2.ia) || q1Var2.ia.megagroup) && (q1Var2.O5.f16337k.flags & 1024) == 0 && q1Var2.f22549ea == null && !q1Var2.f22668o6) {
                        f19 = L9;
                        rectF = rectF2;
                        f22 = f30;
                        f26 = f17;
                        i14 = i24;
                        z22 = false;
                        c10 = 6;
                        c11 = 7;
                        c12 = 4;
                    } else {
                        float lineWidth = (q1Var2.f22796y9 - staticLayout.getLineWidth(0)) + L9;
                        p0Var.getClass();
                        int b10 = x1Var5.b();
                        int i28 = x1Var5.f23462b2;
                        if (i28 >= 0 && i28 != b10 && !q1Var2.f22709rb) {
                            q1Var2.A0(i28, b10, z10);
                        }
                        boolean z25 = q1Var2.f22709rb;
                        if (z25) {
                            b10 = q1Var2.f22673ob;
                        }
                        boolean z26 = (b10 & 4) != 0;
                        boolean z27 = (b10 & 8) != 0;
                        if (z25) {
                            int i29 = q1Var2.f22684pb;
                            if ((i29 & 4) != 0) {
                                i21 = i29;
                                z24 = true;
                            } else {
                                i21 = i29;
                                z24 = false;
                            }
                            boolean z28 = (i21 & 8) != 0;
                            float f41 = i24;
                            x1Var4 = x1Var5;
                            f20 = lineWidth;
                            rectF = rectF2;
                            float f42 = f17;
                            c10 = 6;
                            c12 = 4;
                            z22 = false;
                            i14 = i24;
                            c11 = 7;
                            q1Var2.R0(canvas2, z24, z28, f42, f30, f41, f33, 1.0f - q1Var2.f22696qb, z11);
                            boolean z29 = z24;
                            boolean z30 = z28;
                            boolean z31 = z26;
                            boolean z32 = z27;
                            q1Var2.R0(canvas, z31, z32, f42, f30, f41, f33, q1Var2.f22696qb, z11);
                            f26 = f42;
                            f21 = f33;
                            z23 = z31;
                            f22 = f30;
                            if (!q1Var2.O5.P3()) {
                                if (!z29 && !z30) {
                                    q1Var2.y1(canvas, f22, f41, f21, 1.0f - q1Var2.f22696qb, z11);
                                }
                                if (!z23 && !z32) {
                                    q1Var2.y1(canvas, f22, f41, f21, q1Var2.f22696qb, z11);
                                }
                            }
                        } else {
                            x1Var4 = x1Var5;
                            f20 = lineWidth;
                            rectF = rectF2;
                            boolean z33 = z26;
                            boolean z34 = z27;
                            float f43 = f17;
                            i14 = i24;
                            c10 = 6;
                            c11 = 7;
                            c12 = 4;
                            z22 = false;
                            if (!q1Var2.O5.P3() && !z33 && !z34) {
                                q1Var2.y1(canvas, f30, i14, f33, 1.0f, z11);
                            }
                            q1Var2 = this;
                            q1Var2.R0(canvas, z33, z34, f43, f30, i14, f33, 1.0f, z11);
                            f26 = f43;
                            f21 = f33;
                            z23 = z33;
                            f22 = f30;
                        }
                        if (q1Var2.O5.P3()) {
                            canvas2 = canvas;
                            q1Var2.y1(canvas2, f22, i14, f21, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        x1Var5 = x1Var4;
                        x1Var5.f23462b2 = x1Var4.b();
                        if (z23 && z10 && q1Var2.getParent() != null) {
                            ((View) q1Var2.getParent()).invalidate();
                        }
                        f19 = f20;
                    }
                    canvas2.save();
                    float f44 = f29 + f19;
                    q1Var2.f22758v9 = f44;
                    float L10 = (f34 - org.telegram.messenger.i0.L(7.3f)) - staticLayout.getHeight();
                    q1Var2.w9 = L10;
                    canvas2.translate(f44, L10);
                    nh.i.f(canvas2, staticLayout);
                    canvas2.restore();
                    org.telegram.ui.ActionBar.t6.T2.setAlpha(255);
                    i16 = z22;
                    z12 = z21;
                } else {
                    rectF = rectF2;
                    i11 = 2;
                    c10 = 6;
                    c11 = 7;
                    c12 = 4;
                    if (q1Var2.O5.r4()) {
                        i13 = -org.telegram.messenger.i0.L(48.0f);
                        if (q1Var2.f22491a7) {
                            i13 -= org.telegram.messenger.i0.L(4.0f);
                        }
                    } else {
                        if (q1Var2.f22756v7) {
                            i12 = q1Var2.r2() ? q1Var2.getCommentButtonHeight() : org.telegram.messenger.i0.L(43.0f);
                        } else {
                            i12 = 0;
                        }
                        i13 = -i12;
                    }
                    i14 = i13;
                    float f45 = -staticLayout.getLineLeft(0);
                    if (q1Var2.O5.N5()) {
                        p0Var.getClass();
                    }
                    if ((org.telegram.messenger.w3.T(q1Var2.ia) && !q1Var2.ia.megagroup) || (q1Var2.O5.f16337k.flags & 1024) != 0 || q1Var2.f22549ea != null || x1Var5.G || q1Var2.f22668o6 || x1Var5.C) {
                        float lineWidth2 = (f11 - staticLayout.getLineWidth(0)) + f45;
                        p0Var.getClass();
                        int b11 = x1Var5.b();
                        int i30 = x1Var5.f23462b2;
                        if (i30 >= 0 && i30 != b11 && !q1Var2.f22709rb) {
                            q1Var2.A0(i30, b11, z10);
                        }
                        boolean z35 = q1Var2.f22709rb;
                        if (z35) {
                            b11 = q1Var2.f22673ob;
                        }
                        boolean z36 = (b11 & 4) != 0;
                        boolean z37 = (b11 & 8) != 0;
                        if (z35) {
                            int i31 = q1Var2.f22684pb;
                            boolean z38 = (i31 & 4) != 0;
                            boolean z39 = (i31 & 8) != 0;
                            float f46 = i14;
                            float f47 = f22;
                            boolean z40 = z38;
                            x1Var = x1Var5;
                            q1Var2.R0(canvas2, z40, z39, f26, f47, f46, f28, 1.0f - q1Var2.f22696qb, z11);
                            boolean z41 = z39;
                            boolean z42 = z36;
                            boolean z43 = z37;
                            q1Var2.R0(canvas, z42, z43, f26, f47, f46, f28, q1Var2.f22696qb, z11);
                            f26 = f26;
                            f13 = f28;
                            z13 = z42;
                            f22 = f47;
                            if (!q1Var2.O5.P3()) {
                                if (!z40 && !z41) {
                                    q1Var2.y1(canvas, f22, f46, f13, 1.0f - q1Var2.f22696qb, z11);
                                }
                                if (!z13 && !z43) {
                                    q1Var2.y1(canvas, f22, f46, f13, q1Var2.f22696qb, z11);
                                }
                            }
                        } else {
                            x1Var = x1Var5;
                            boolean z44 = z36;
                            boolean z45 = z37;
                            if (!q1Var2.O5.P3() && !z44 && !z45) {
                                q1Var2.y1(canvas, f22, i14, f28, 1.0f, z11);
                            }
                            q1Var2 = this;
                            float f48 = f22;
                            q1Var2.R0(canvas, z44, z45, f26, f48, i14, f28, 1.0f, z11);
                            f26 = f26;
                            f13 = f28;
                            z13 = z44;
                            f22 = f48;
                        }
                        if (q1Var2.O5.P3()) {
                            canvas2 = canvas;
                            q1Var2.y1(canvas2, f22, i14, f13, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        x1Var5 = x1Var;
                        x1Var5.f23462b2 = x1Var.b();
                        if (z13 && z10 && q1Var2.getParent() != null) {
                            ((View) q1Var2.getParent()).invalidate();
                        }
                        f45 = lineWidth2;
                    }
                    canvas2.save();
                    if (x1Var5.U0 && x1Var5.L1 != 1.0f) {
                        if (x1Var5.V0 != null) {
                            canvas2.translate(f29 + f45, ((f26 - org.telegram.messenger.i0.L((q1Var2.F || q1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i14);
                            int alpha5 = org.telegram.ui.ActionBar.t6.T2.getAlpha();
                            org.telegram.ui.ActionBar.t6.T2.setAlpha((int) (alpha5 * x1Var5.L1));
                            x1Var5.V0.draw(canvas2);
                            org.telegram.ui.ActionBar.t6.T2.setAlpha(alpha5);
                            nh.i.f(canvas2, x1Var5.W0);
                            i15 = 0;
                        } else {
                            int alpha6 = org.telegram.ui.ActionBar.t6.T2.getAlpha();
                            canvas2.save();
                            float f49 = i14;
                            canvas2.translate(x1Var5.f23488h1 + f45, ((f26 - org.telegram.messenger.i0.L((q1Var2.F || q1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f49);
                            float f50 = alpha6;
                            i15 = 0;
                            org.telegram.ui.ActionBar.t6.T2.setAlpha((int) ((1.0f - x1Var5.L1) * f50));
                            nh.i.f(canvas2, x1Var5.W0);
                            canvas2.restore();
                            canvas2.translate(f29 + f45, ((f26 - org.telegram.messenger.i0.L((q1Var2.F || q1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f49);
                            org.telegram.ui.ActionBar.t6.T2.setAlpha((int) (f50 * x1Var5.L1));
                            nh.i.f(canvas2, staticLayout);
                            org.telegram.ui.ActionBar.t6.T2.setAlpha(alpha6);
                        }
                    } else {
                        i15 = 0;
                        float f51 = f29 + f45;
                        q1Var2.f22758v9 = f51;
                        float L11 = ((f26 - org.telegram.messenger.i0.L((q1Var2.F || q1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i14;
                        q1Var2.w9 = L11;
                        canvas2.translate(f51, L11);
                        nh.i.f(canvas2, staticLayout);
                    }
                    canvas2.restore();
                    z12 = i15 == 1 ? 1 : 0;
                    i16 = i15;
                }
                int i32 = i14;
                if (q1Var2.O5.P3()) {
                    int b12 = x1Var5.b();
                    int i33 = x1Var5.f23462b2;
                    if (i33 >= 0 && i33 != b12 && !q1Var2.f22709rb) {
                        q1Var2.A0(i33, b12, z10);
                    }
                    if (q1Var2.f22709rb) {
                        b12 = q1Var2.f22673ob;
                    }
                    int i34 = (b12 & 1) != 0 ? true : i16;
                    int i35 = (b12 & 2) != 0 ? true : i16;
                    if ((b12 & 4) != 0) {
                        x1Var2 = x1Var5;
                        z14 = true;
                    } else {
                        x1Var2 = x1Var5;
                        z14 = i16;
                    }
                    boolean z46 = (b12 & 8) != 0 ? true : i16;
                    if (q1Var2.Fc != 0.0f) {
                        canvas2.save();
                        f15 = 0.0f;
                        canvas2.translate(0.0f, q1Var2.Fc);
                        i17 = 1;
                    } else {
                        f15 = 0.0f;
                        i17 = i16;
                    }
                    if (q1Var2.f22709rb) {
                        int i36 = q1Var2.f22684pb;
                        if ((i36 & 1) != 0) {
                            z15 = i35;
                            f16 = f22;
                            z16 = true;
                        } else {
                            z15 = i35;
                            f16 = f22;
                            z16 = i16;
                        }
                        boolean z47 = (i36 & 2) != 0 ? true : i16;
                        if ((i36 & 4) != 0) {
                            z17 = z14;
                            z18 = true;
                        } else {
                            z17 = z14;
                            z18 = i16;
                        }
                        if ((i36 & 8) != 0) {
                            z19 = z46;
                            z20 = true;
                        } else {
                            z19 = z46;
                            z20 = i16;
                        }
                        if (!z18 && z47 && z15 && !z16 && i34) {
                            x1Var3 = x1Var2;
                            f14 = f15;
                            z14 = z17;
                            str = "paintChatTimeBackground";
                            q1Var2.u1(canvas2, i34, z15, z14, z19, f16, z12, i32, f26, q1Var2.f22696qb, true, z11);
                        } else {
                            x1Var3 = x1Var2;
                            f14 = f15;
                            boolean z48 = z15;
                            boolean z49 = i34;
                            str = "paintChatTimeBackground";
                            float f52 = i32;
                            q1Var2.u1(canvas, z16, z47, z18, z20, f16, z12, f52, f26, 1.0f - q1Var2.f22696qb, false, z11);
                            z14 = z17;
                            q1Var2.u1(canvas, z49, z48, z14, z19, f16, z12, f52, f26, q1Var2.f22696qb, false, z11);
                        }
                        q1Var = this;
                        canvas2 = canvas;
                    } else {
                        x1Var3 = x1Var2;
                        f14 = f15;
                        str = "paintChatTimeBackground";
                        canvas2 = canvas;
                        u1(canvas2, i34, i35, z14, z46, f22, z12, i32, f26, 1.0f, false, z11);
                        q1Var = this;
                    }
                    if (i17 != 0) {
                        canvas2.restore();
                    }
                    x1Var3.f23462b2 = x1Var3.b();
                    if (z10 && z14 && q1Var.getParent() != null) {
                        ((View) q1Var.getParent()).invalidate();
                    }
                } else {
                    q1Var = q1Var2;
                    str = "paintChatTimeBackground";
                    f14 = 0.0f;
                }
                canvas2.restore();
                if (q1Var.V9 != null) {
                    if (q1Var.T9 == f14 || q1Var.U9 == f14) {
                        q1Var.D();
                    }
                    Path path3 = q1Var.Z9;
                    path3.rewind();
                    RectF rectF3 = org.telegram.messenger.i0.P;
                    rectF3.set(c2Var.K0, c2Var.L0, c2Var.y(), c2Var.A());
                    int[] iArr2 = c2Var.W0;
                    float f53 = iArr2[i16];
                    float[] fArr = q1Var.f22494aa;
                    fArr[1] = f53;
                    fArr[i16] = f53;
                    float f54 = iArr2[1];
                    fArr[3] = f54;
                    fArr[i11] = f54;
                    float f55 = iArr2[i11];
                    fArr[5] = f55;
                    fArr[c12] = f55;
                    float f56 = iArr2[3];
                    fArr[c11] = f56;
                    fArr[c10] = f56;
                    Path.Direction direction = Path.Direction.CW;
                    path3.addRoundRect(rectF3, fArr, direction);
                    canvas2.save();
                    canvas2.clipPath(path3);
                    path3.rewind();
                    rectF3.set(q1Var.T9 - org.telegram.messenger.i0.L(12.0f), q1Var.U9 - org.telegram.messenger.i0.L(8.0f), q1Var.T9 + org.telegram.ui.ActionBar.t6.L3.getIntrinsicWidth() + org.telegram.messenger.i0.L(14.0f) + q1Var.V9.getWidth() + org.telegram.messenger.i0.L(12.0f), q1Var.U9 + q1Var.V9.getHeight() + org.telegram.messenger.i0.L(8.0f));
                    path3.addRoundRect(rectF3, org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f), direction);
                    canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    if (q1Var.O9 == null) {
                        if (q1Var.Y9 == null) {
                            q1Var.Y9 = new nh.i();
                        }
                        q1Var.Y9.h(i0.b.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                        q1Var.Y9.setBounds((int) c2Var.K0, (int) c2Var.L0, (int) c2Var.y(), (int) c2Var.A());
                        q1Var.Y9.draw(canvas2);
                    }
                    q1Var.invalidate();
                    canvas2.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, q1Var.getWidth(), q1Var.getHeight(), (int) (q1Var.S9 * 255.0f), 31);
                    int alpha7 = org.telegram.ui.ActionBar.t6.f21016i2.getAlpha();
                    org.telegram.ui.ActionBar.t6.f21016i2.setAlpha((int) (alpha7 * 0.7f));
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f), org.telegram.ui.ActionBar.t6.f21016i2);
                    org.telegram.ui.ActionBar.t6.f21016i2.setAlpha(alpha7);
                    canvas.translate(q1Var.T9 + org.telegram.messenger.i0.L(4.0f), q1Var.U9);
                    Drawable drawable = org.telegram.ui.ActionBar.t6.L3;
                    int i37 = i16;
                    drawable.setBounds(i37, i37, drawable.getIntrinsicWidth(), org.telegram.ui.ActionBar.t6.L3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.t6.L3.draw(canvas);
                    canvas.translate(org.telegram.ui.ActionBar.t6.L3.getIntrinsicWidth() + org.telegram.messenger.i0.L(6.0f), f14);
                    nh.i.f(canvas, q1Var.V9);
                    canvas.restore();
                    if (q1Var.f22664o2 != null && c2Var.Q0 && q1Var.f22790y2 == 0) {
                        int i38 = tz.Y0;
                        int i39 = i11;
                        if (i38 > i39) {
                            L = org.telegram.messenger.i0.L(i38 - i39);
                            z12 = tz.Y0 < 10 ? i37 : true;
                        } else {
                            L = org.telegram.messenger.i0.L(i38);
                        }
                        int L12 = (int) (c2Var.K0 + org.telegram.messenger.i0.L(9.0f));
                        int L13 = (int) (c2Var.L0 + org.telegram.messenger.i0.L(6.0f));
                        RectF rectF4 = rectF;
                        rectF4.set(L12 - org.telegram.messenger.i0.L(4.0f), L13 - org.telegram.messenger.i0.L(1.5f), org.telegram.messenger.i0.L(z12 ? 2.0f : f14) + org.telegram.messenger.i0.L(4.0f) + q1Var.X1 + L12, org.telegram.messenger.i0.L(1.5f) + q1Var.f22664o2.getHeight() + L13);
                        canvas.drawRoundRect(rectF4, L, L, q1Var.X1(str));
                        canvas.save();
                        if (!z12) {
                            i39 = i37;
                        }
                        canvas.translate(L12 + i39, L13);
                        nh.i.f(canvas, q1Var.f22664o2);
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final boolean w2() {
        if (!this.f22600j1 && !this.f22768w6 && !this.f22755v6) {
            return false;
        }
        return true;
    }

    public final void w3(int i10, int i11, int i12, float f7, float f10, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        vv vvVar;
        x1 x1Var;
        gj gjVar;
        jj jjVar;
        this.f22661nc = i10;
        this.f22685pc = i11;
        this.qc = i12;
        this.K0 = i13;
        this.L0 = i14;
        this.f22723sc = f10;
        this.rc = f7;
        this.f22495ab = i14;
        this.f22509bb = i15;
        this.f22523cb = i16;
        this.f22674oc = i17;
        if ((!this.G5.isEmpty() || (this.f22761w != null && (jjVar = this.O5) != null && jjVar.D == 27)) && this.Za != f10) {
            invalidate();
        }
        this.Za = f10;
        if (i12 != this.L0 || f7 != this.M0) {
            this.M0 = f7;
            this.L0 = i12;
        }
        if (this.O5 != null && e2() && this.O5.O5()) {
            invalidate();
        }
        jj jjVar2 = this.O5;
        if (jjVar2 != null && jjVar2.f16397z2 != null) {
            int i20 = i10 - this.f22724t0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                int size = this.O5.f16397z2.size();
                x1Var = this.gb;
                if (i21 >= size || ((gj) this.O5.f16397z2.get(i21)).p(this.O5.f16397z2, x1Var) > i20) {
                    break;
                }
                i22 = i21;
                i21++;
            }
            int i23 = 0;
            int i24 = -1;
            int i25 = -1;
            while (i22 < this.O5.f16397z2.size()) {
                float p5 = ((gj) this.O5.f16397z2.get(i22)).p(this.O5.f16397z2, x1Var);
                float j10 = gjVar.f15717f + p5 + gjVar.j(x1Var) + gjVar.h;
                float f11 = i20;
                if (m2(p5, j10, f11, i20 + i11)) {
                    if (i24 == -1) {
                        i24 = i22;
                    }
                    i23++;
                    i25 = i22;
                } else if (p5 > f11) {
                    break;
                }
                i22++;
            }
            if (this.D0 == i25 && this.E0 == i24 && this.F0 == i23) {
                if (this.f22797ya != null) {
                    int i26 = 0;
                    while (true) {
                        if (i26 >= this.f22797ya.f27636a.size()) {
                            break;
                        }
                        org.telegram.ui.Components.j5 j5Var = (org.telegram.ui.Components.j5) this.f22797ya.f27636a.get(i26);
                        if (j5Var != null && j5Var.f27228n) {
                            float y3 = (0.0f - getY()) - j5Var.f27229r;
                            float y10 = (this.f22648n - getY()) - j5Var.f27229r;
                            Rect rect = j5Var.e;
                            if (rect.bottom >= y3 && rect.top <= y10) {
                                invalidate();
                                break;
                            }
                        }
                        i26++;
                    }
                }
            } else {
                this.D0 = i25;
                this.E0 = i24;
                this.F0 = i23;
                invalidate();
            }
        }
        jj jjVar3 = this.O5;
        if (jjVar3 != null && (vvVar = jjVar3.f16385w2) != null) {
            ArrayList arrayList = vvVar.f18990g;
            int i27 = i10 - this.f22724t0;
            int i28 = -1;
            int i29 = -1;
            for (int i30 = 0; i30 < arrayList.size(); i30++) {
                qu quVar = (qu) arrayList.get(i30);
                if (quVar.Q || quVar.R) {
                    float f12 = quVar.M;
                    float f13 = i27 + i11;
                    if (m2(f12, quVar.H() + f12, i27, f13)) {
                        if (i28 == -1) {
                            i28 = i30;
                        }
                        i29 = i30;
                    } else if (f12 > f13) {
                        break;
                    }
                }
            }
            if (this.G0 != i28 || this.H0 != i29) {
                this.G0 = i28;
                this.H0 = i29;
                invalidate();
            }
        }
        ArrayList arrayList2 = this.O4;
        if (!arrayList2.isEmpty()) {
            int i31 = -1;
            int i32 = -1;
            for (int i33 = 0; i33 < arrayList2.size(); i33++) {
                p1 p1Var = (p1) arrayList2.get(i33);
                int i34 = p1Var.f22422b + this.Sa;
                if (m2(i34, i34 + p1Var.f22423c, this.f22661nc, i19 + this.f22685pc)) {
                    if (i32 == -1) {
                        i32 = i33;
                    }
                    i31 = i33;
                }
            }
            if (this.R4 != i31 || this.Q4 != i32) {
                this.R4 = i31;
                this.Q4 = i32;
                invalidate();
            }
        }
        if (this.H8) {
            if (Math.abs(this.S8 - Math.max(Math.min(org.telegram.messenger.i0.L(4.0f) + (-this.f22674oc), this.Q8 - org.telegram.messenger.i0.L(42.0f)), org.telegram.messenger.i0.L(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        sg.p0 p0Var = this.N;
        int i35 = p0Var.f48440c;
        boolean m22 = m2(i35, i35 + p0Var.f48447m, this.f22661nc, i18 + this.f22685pc);
        if (this.T4 != m22) {
            this.T4 = m22;
            invalidate();
        }
    }

    public final boolean x() {
        if (this.O5.t2() && !this.O5.M0 && this.K9 == 0.0f && this.U0.n() != null) {
            return false;
        }
        return true;
    }

    public final void x0(long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.x0(long, long):void");
    }

    public final void x1(android.graphics.Canvas r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.x1(android.graphics.Canvas, int):void");
    }

    public final boolean x2() {
        if (this.P5 != null) {
            return this.T5;
        }
        return this.G;
    }

    public final void x3(int r21, org.telegram.messenger.jj r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.x3(int, org.telegram.messenger.jj):void");
    }

    public final void y() {
        gr grVar;
        boolean z10 = this.f22636m1;
        if (z10 || this.f22650n1) {
            if ((z10 && this.f22663o1 == 1.0f) || (!z10 && this.f22663o1 == 0.0f)) {
                this.f22650n1 = false;
            }
            if (z10) {
                grVar = gr.f26496g;
            } else {
                grVar = gr.f26497i;
            }
            this.f22687q1 = (int) Math.ceil(grVar.getInterpolation(this.f22663o1) * org.telegram.messenger.i0.L(35.0f));
            if (this.O5.D == 36) {
                if (org.telegram.messenger.i0.L(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                    this.f22687q1 = 0;
                }
            }
            if (!this.O5.P3() || this.O5.B2) {
                V3();
            }
            if (this.f22650n1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f22676p1;
                this.f22676p1 = elapsedRealtime;
                if (this.f22636m1) {
                    float f7 = (((float) j10) / 200.0f) + this.f22663o1;
                    this.f22663o1 = f7;
                    if (f7 > 1.0f) {
                        this.f22663o1 = 1.0f;
                    }
                } else {
                    float f10 = this.f22663o1 - (((float) j10) / 200.0f);
                    this.f22663o1 = f10;
                    if (f10 <= 0.0f) {
                        this.f22663o1 = 0.0f;
                    }
                }
                invalidate();
                ((View) getParent()).invalidate();
            }
        }
    }

    public final void y0(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        long[] x10 = hc.D().x(org.telegram.messenger.b8.B(document));
        if (x10 != null) {
            x0(x10[0], x10[1]);
        } else {
            x0(this.O5.F0, document.size);
        }
    }

    public final void y1(Canvas canvas, float f7, float f10, float f11, float f12, boolean z10) {
        boolean z11;
        float f13;
        float f14;
        double d;
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable W1;
        float f15;
        float f16;
        float f17;
        boolean z15;
        boolean z16;
        String str;
        Drawable W12;
        float s10;
        float f18;
        String str2;
        Drawable W13;
        if (f12 != 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f19 = (f12 * 0.5f) + 0.5f;
        float f20 = f7 * f12;
        this.N.getClass();
        int alpha = org.telegram.ui.ActionBar.t6.T2.getAlpha();
        float Y1 = Y1(f10);
        StaticLayout staticLayout = this.f22549ea;
        x1 x1Var = this.gb;
        float f21 = 0.0f;
        if (staticLayout == null && !x1Var.G) {
            f14 = 10.0f;
            d = 1.0d;
        } else {
            boolean z17 = x1Var.f23493i1;
            if (z17) {
                f13 = this.A9;
            } else {
                f13 = f11;
            }
            float f22 = f13 + 0.0f;
            f14 = 10.0f;
            boolean z18 = x1Var.G;
            d = 1.0d;
            if (z18 && x1Var.I == null && staticLayout != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z18 && x1Var.I != null && staticLayout == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z18 && x1Var.I != null && staticLayout != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((!this.f22772wb || !x1Var.f23511m1) && z17 && !z12) {
                if (z13) {
                    f22 = x1Var.J;
                } else {
                    float f23 = x1Var.J;
                    float f24 = x1Var.L1;
                    f22 = (f22 * f24) + ((1.0f - f24) * f23);
                }
            }
            ej ejVar = this.K;
            if (ejVar != null) {
                dj djVar = ejVar.f15403m;
                if (djVar.f15247j) {
                    f22 += djVar.f15245g;
                }
            }
            if (x1Var.f23554x0) {
                f22 += this.Uc;
            }
            if (B3()) {
                if (this.O5.O5()) {
                    W1 = W1("drawableMsgStickerReplies");
                } else {
                    W1 = org.telegram.ui.ActionBar.t6.f20889b4;
                }
            } else if (!this.O5.P3()) {
                if (z10) {
                    W1 = org.telegram.ui.ActionBar.t6.R3;
                } else {
                    W1 = org.telegram.ui.ActionBar.t6.Q3;
                }
            } else {
                W1 = W1("drawableMsgOutReplies");
            }
            float s11 = z.s(W1, f22, Y1, org.telegram.ui.ActionBar.t6.T2.getTextSize());
            if (z12) {
                f15 = x1Var.L1 * f20;
            } else if (z13) {
                f15 = (1.0f - x1Var.L1) * f20;
            } else {
                f15 = f20;
            }
            W1.setAlpha((int) (f15 * 255.0f));
            if (z11) {
                canvas.save();
                canvas.scale(f19, f19, org.telegram.messenger.m5.a(org.telegram.messenger.i0.L(3.0f) + s11, this.f22561fa, 2.0f, f22), W1.getBounds().centerY());
            }
            W1.draw(canvas);
            W1.setAlpha(255);
            if (x1Var.G) {
                if (z14) {
                    canvas.save();
                    f16 = s11;
                    org.telegram.ui.ActionBar.t6.T2.setAlpha((int) ((1.0d - x1Var.L1) * alpha));
                    canvas.translate(f22 + f16 + org.telegram.messenger.i0.L(3.0f), Y1);
                    x1Var.I.draw(canvas);
                    canvas.restore();
                } else {
                    f16 = s11;
                }
                org.telegram.ui.ActionBar.t6.T2.setAlpha((int) (alpha * f15));
            } else {
                f16 = s11;
            }
            canvas.save();
            canvas.translate(f22 + f16 + org.telegram.messenger.i0.L(3.0f), Y1);
            StaticLayout staticLayout2 = this.f22549ea;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                StaticLayout staticLayout3 = x1Var.I;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
            }
            canvas.restore();
            if (this.f22549ea != null) {
                f21 = f16 + this.f22561fa + org.telegram.messenger.i0.L(10.0f) + 0.0f;
            }
            if (z11) {
                canvas.restore();
            }
            if (x1Var.G) {
                org.telegram.ui.ActionBar.t6.T2.setAlpha(alpha);
            }
            x1Var.K = f22;
        }
        if (this.f22508ba != null) {
            boolean z19 = x1Var.f23493i1;
            if (z19) {
                f18 = this.A9;
            } else {
                f18 = f11;
            }
            float f25 = f18 + f21;
            if ((!this.f22772wb || !x1Var.f23511m1) && z19) {
                float f26 = x1Var.L;
                float f27 = x1Var.L1;
                f25 = (f25 * f27) + ((1.0f - f27) * f26);
            }
            ej ejVar2 = this.K;
            if (ejVar2 != null) {
                dj djVar2 = ejVar2.f15403m;
                if (djVar2.f15247j) {
                    f25 += djVar2.f15245g;
                }
            }
            if (x1Var.f23554x0) {
                f25 += this.Uc;
            }
            if (B3()) {
                if (this.O5.O5()) {
                    W13 = W1("drawableMsgStickerViews");
                } else {
                    W13 = org.telegram.ui.ActionBar.t6.f20869a4;
                }
            } else if (!this.O5.P3()) {
                if (z10) {
                    W13 = org.telegram.ui.ActionBar.t6.N3;
                } else {
                    W13 = org.telegram.ui.ActionBar.t6.M3;
                }
            } else {
                if (z10) {
                    str2 = "drawableMsgOutViewsSelected";
                } else {
                    str2 = "drawableMsgOutViews";
                }
                W13 = W1(str2);
            }
            float s12 = z.s(W13, f25, org.telegram.messenger.i0.L(1.5f) + Y1, org.telegram.ui.ActionBar.t6.T2.getTextSize() - org.telegram.messenger.i0.L(2.0f));
            if (z11) {
                canvas.save();
                canvas.scale(f19, f19, (((org.telegram.messenger.i0.L(3.0f) + W13.getIntrinsicWidth()) + this.f22522ca) / 2.0f) + f25, W13.getBounds().centerY());
            }
            W13.setAlpha((int) (f20 * 255.0f));
            W13.draw(canvas);
            W13.setAlpha(255);
            if (x1Var.f23475e2 != null) {
                canvas.save();
                org.telegram.ui.ActionBar.t6.T2.setAlpha((int) ((d - x1Var.L1) * alpha));
                canvas.translate(f25 + s12 + org.telegram.messenger.i0.L(3.0f), Y1);
                nh.i.f(canvas, x1Var.f23475e2);
                canvas.restore();
                org.telegram.ui.ActionBar.t6.T2.setAlpha((int) (alpha * x1Var.L1));
            }
            canvas.save();
            canvas.translate(f25 + s12 + org.telegram.messenger.i0.L(3.0f), Y1);
            nh.i.f(canvas, this.f22508ba);
            canvas.restore();
            if (z11) {
                canvas.restore();
            }
            f21 = this.f22522ca + s12 + org.telegram.messenger.i0.L(f14) + f21;
            if (x1Var.f23475e2 != null) {
                org.telegram.ui.ActionBar.t6.T2.setAlpha(alpha);
            }
            x1Var.M = f25;
        }
        boolean z20 = this.f22668o6;
        if (!z20 && !x1Var.C) {
            return;
        }
        boolean z21 = x1Var.f23493i1;
        if (z21) {
            f17 = this.A9;
        } else {
            f17 = f11;
        }
        float f28 = f17 + f21;
        boolean z22 = x1Var.C;
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
        if (!this.f22772wb && z21 && !z15) {
            if (z16) {
                f28 = x1Var.E;
            } else {
                float f29 = x1Var.E;
                float f30 = x1Var.L1;
                f28 = (f28 * f30) + ((1.0f - f30) * f29);
            }
        }
        ej ejVar3 = this.K;
        if (ejVar3 != null) {
            dj djVar3 = ejVar3.f15403m;
            if (djVar3.f15247j) {
                f28 += djVar3.f15245g;
            }
        }
        if (x1Var.f23554x0) {
            f28 += this.Uc;
        }
        if (B3()) {
            if (this.O5.O5()) {
                W12 = W1("drawableMsgStickerPinned");
            } else {
                W12 = org.telegram.ui.ActionBar.t6.Z3;
            }
        } else if (!this.O5.P3()) {
            if (z10) {
                W12 = org.telegram.ui.ActionBar.t6.V3;
            } else {
                W12 = org.telegram.ui.ActionBar.t6.U3;
            }
        } else {
            if (z10) {
                str = "drawableMsgOutPinnedSelected";
            } else {
                str = "drawableMsgOutPinned";
            }
            W12 = W1(str);
        }
        if (x1Var.C) {
            if (this.f22668o6) {
                W12.setAlpha((int) (f20 * 255.0f * x1Var.L1));
                s10 = z.s(W12, f28, Y1, org.telegram.ui.ActionBar.t6.T2.getTextSize() + org.telegram.messenger.i0.L(1.0f));
            } else {
                W12.setAlpha((int) ((1.0f - x1Var.L1) * f20 * 255.0f));
                s10 = z.s(W12, f28, Y1, org.telegram.ui.ActionBar.t6.T2.getTextSize() + org.telegram.messenger.i0.L(1.0f));
            }
        } else {
            W12.setAlpha((int) (f20 * 255.0f));
            s10 = z.s(W12, f28, Y1, org.telegram.ui.ActionBar.t6.T2.getTextSize() + org.telegram.messenger.i0.L(1.0f));
        }
        if (z11) {
            canvas.save();
            canvas.scale(f19, f19, (s10 / 2.0f) + f28, W12.getBounds().centerY());
        }
        W12.draw(canvas);
        W12.setAlpha(255);
        if (z11) {
            canvas.restore();
        }
        x1Var.D = f28;
    }

    public final boolean y2(float f7) {
        if (this.J6 != null) {
            int i10 = this.L6;
            if (f7 >= i10 && f7 <= i10 + this.M6) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void y3() {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.O5.P3()) {
            TextPaint textPaint = org.telegram.ui.ActionBar.t6.f21130o2;
            int i14 = org.telegram.ui.ActionBar.t6.Tc;
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i14, this.Ob));
            org.telegram.ui.ActionBar.t6.f21291x2.setColor(org.telegram.ui.ActionBar.t6.w0(i14, this.Ob));
            org.telegram.ui.ActionBar.t6.f21149p2.setColor(org.telegram.ui.ActionBar.t6.w0(i14, this.Ob));
            org.telegram.ui.ActionBar.t6.f21166q2.setColor(org.telegram.ui.ActionBar.t6.w0(i14, this.Ob));
            org.telegram.ui.ActionBar.t6.f21182r2.setColor(org.telegram.ui.ActionBar.t6.w0(i14, this.Ob));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.t6.f21291x2;
            TextPaint textPaint3 = org.telegram.ui.ActionBar.t6.Z2;
            TextPaint textPaint4 = org.telegram.ui.ActionBar.t6.f20868a3;
            TextPaint textPaint5 = org.telegram.ui.ActionBar.t6.f21130o2;
            TextPaint textPaint6 = org.telegram.ui.ActionBar.t6.f21149p2;
            TextPaint textPaint7 = org.telegram.ui.ActionBar.t6.f21166q2;
            TextPaint textPaint8 = org.telegram.ui.ActionBar.t6.f21182r2;
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Vc, this.Ob);
            textPaint8.linkColor = w02;
            textPaint7.linkColor = w02;
            textPaint6.linkColor = w02;
            textPaint5.linkColor = w02;
            textPaint4.linkColor = w02;
            textPaint3.linkColor = w02;
            textPaint2.linkColor = w02;
        } else {
            TextPaint textPaint9 = org.telegram.ui.ActionBar.t6.f21130o2;
            int i15 = org.telegram.ui.ActionBar.t6.Sc;
            textPaint9.setColor(org.telegram.ui.ActionBar.t6.w0(i15, this.Ob));
            org.telegram.ui.ActionBar.t6.f21291x2.setColor(org.telegram.ui.ActionBar.t6.w0(i15, this.Ob));
            org.telegram.ui.ActionBar.t6.f21149p2.setColor(org.telegram.ui.ActionBar.t6.w0(i15, this.Ob));
            org.telegram.ui.ActionBar.t6.f21166q2.setColor(org.telegram.ui.ActionBar.t6.w0(i15, this.Ob));
            org.telegram.ui.ActionBar.t6.f21182r2.setColor(org.telegram.ui.ActionBar.t6.w0(i15, this.Ob));
            TextPaint textPaint10 = org.telegram.ui.ActionBar.t6.f21291x2;
            TextPaint textPaint11 = org.telegram.ui.ActionBar.t6.Z2;
            TextPaint textPaint12 = org.telegram.ui.ActionBar.t6.f20868a3;
            TextPaint textPaint13 = org.telegram.ui.ActionBar.t6.f21130o2;
            TextPaint textPaint14 = org.telegram.ui.ActionBar.t6.f21149p2;
            TextPaint textPaint15 = org.telegram.ui.ActionBar.t6.f21166q2;
            TextPaint textPaint16 = org.telegram.ui.ActionBar.t6.f21182r2;
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Uc, this.Ob);
            textPaint16.linkColor = w03;
            textPaint15.linkColor = w03;
            textPaint14.linkColor = w03;
            textPaint13.linkColor = w03;
            textPaint12.linkColor = w03;
            textPaint11.linkColor = w03;
            textPaint10.linkColor = w03;
        }
        if (this.L1 != null) {
            int i16 = this.K1;
            if (i16 != 3 && i16 != 7) {
                if (i16 == 5) {
                    if (this.O5.P3()) {
                        int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21064kc, this.Ob);
                        int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21082lc, this.Ob);
                        int i17 = org.telegram.ui.ActionBar.t6.f21121nc;
                        this.B4.g(w04, w05, org.telegram.ui.ActionBar.t6.w0(i17, this.Ob), org.telegram.ui.ActionBar.t6.w0(i17, this.Ob), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21101mc, this.Ob));
                    } else if (this.P1 && this.f22643m8 != null) {
                        int c10 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21027ie, this.Ob), this.f22643m8.i());
                        int c11 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21046je, this.Ob), this.f22643m8.i());
                        int i18 = org.telegram.ui.ActionBar.t6.f21084le;
                        this.B4.g(c10, c11, org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(i18, this.Ob), this.f22643m8.i()), org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(i18, this.Ob), this.f22643m8.i()), org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21066ke, this.Ob), this.f22643m8.i()));
                    } else {
                        int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21027ie, this.Ob);
                        int w07 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21046je, this.Ob);
                        int i19 = org.telegram.ui.ActionBar.t6.f21084le;
                        this.B4.g(w06, w07, org.telegram.ui.ActionBar.t6.w0(i19, this.Ob), org.telegram.ui.ActionBar.t6.w0(i19, this.Ob), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21066ke, this.Ob));
                    }
                }
            } else {
                boolean P3 = this.O5.P3();
                qn0 qn0Var = this.C4;
                if (P3) {
                    int w08 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21140oc, this.Ob);
                    int w09 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.qc, this.Ob);
                    int w010 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21157pc, this.Ob);
                    qn0Var.f29700p = w08;
                    qn0Var.f29701q = w09;
                    qn0Var.f29702r = w010;
                    int w011 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21064kc, this.Ob);
                    int w012 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21082lc, this.Ob);
                    int i20 = org.telegram.ui.ActionBar.t6.f21121nc;
                    this.B4.g(w011, w012, org.telegram.ui.ActionBar.t6.w0(i20, this.Ob), org.telegram.ui.ActionBar.t6.w0(i20, this.Ob), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21101mc, this.Ob));
                } else if (this.P1 && this.f22643m8 != null) {
                    int c12 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21103me, this.Ob), this.f22643m8.i());
                    int c13 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21142oe, this.Ob), this.f22643m8.i());
                    int c14 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21123ne, this.Ob), this.f22643m8.i());
                    qn0Var.f29700p = c12;
                    qn0Var.f29701q = c13;
                    qn0Var.f29702r = c14;
                    int c15 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21027ie, this.Ob), this.f22643m8.i());
                    int c16 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21046je, this.Ob), this.f22643m8.i());
                    int i21 = org.telegram.ui.ActionBar.t6.f21084le;
                    this.B4.g(c15, c16, org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(i21, this.Ob), this.f22643m8.i()), org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(i21, this.Ob), this.f22643m8.i()), org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21066ke, this.Ob), this.f22643m8.i()));
                } else {
                    int w013 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21103me, this.Ob);
                    int w014 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21142oe, this.Ob);
                    int w015 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21123ne, this.Ob);
                    qn0Var.f29700p = w013;
                    qn0Var.f29701q = w014;
                    qn0Var.f29702r = w015;
                    int w016 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21027ie, this.Ob);
                    int w017 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21046je, this.Ob);
                    int i22 = org.telegram.ui.ActionBar.t6.f21084le;
                    this.B4.g(w016, w017, org.telegram.ui.ActionBar.t6.w0(i22, this.Ob), org.telegram.ui.ActionBar.t6.w0(i22, this.Ob), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21066ke, this.Ob));
                }
            }
        }
        jj jjVar = this.O5;
        if (jjVar.D == 5) {
            TextPaint textPaint17 = org.telegram.ui.ActionBar.t6.T2;
            if (r2()) {
                if (this.O5.P3()) {
                    i12 = org.telegram.ui.ActionBar.t6.gc;
                } else {
                    i12 = org.telegram.ui.ActionBar.t6.f20899be;
                }
            } else {
                i12 = org.telegram.ui.ActionBar.t6.Wc;
            }
            int w018 = org.telegram.ui.ActionBar.t6.w0(i12, this.Ob);
            if (v2()) {
                if (this.O5.P3()) {
                    i13 = org.telegram.ui.ActionBar.t6.f20897bc;
                } else {
                    i13 = org.telegram.ui.ActionBar.t6.f20918ce;
                }
            } else if (this.O5.P3()) {
                i13 = org.telegram.ui.ActionBar.t6.gc;
            } else {
                i13 = org.telegram.ui.ActionBar.t6.f20899be;
            }
            textPaint17.setColor(i0.b.f(getVideoTranscriptionProgress(), w018, org.telegram.ui.ActionBar.t6.w0(i13, this.Ob)));
        } else if (this.A6) {
            if (jjVar.O5()) {
                org.telegram.ui.ActionBar.t6.T2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, this.Ob));
            } else {
                org.telegram.ui.ActionBar.t6.T2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Yd, this.Ob));
            }
        } else if (jjVar.P3()) {
            TextPaint textPaint18 = org.telegram.ui.ActionBar.t6.T2;
            if (v2()) {
                i11 = org.telegram.ui.ActionBar.t6.f20897bc;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.gc;
            }
            textPaint18.setColor(org.telegram.ui.ActionBar.t6.w0(i11, this.Ob));
        } else {
            TextPaint textPaint19 = org.telegram.ui.ActionBar.t6.T2;
            if (v2()) {
                i10 = org.telegram.ui.ActionBar.t6.f20918ce;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.f20899be;
            }
            textPaint19.setColor(org.telegram.ui.ActionBar.t6.w0(i10, this.Ob));
        }
    }

    public final void z() {
        A(getX(), this.Za, getMeasuredWidth(), this.f22495ab);
    }

    public final void z0(int i10) {
        int i11;
        int w02;
        dl0 dl0Var;
        dl0 dl0Var2;
        int i12;
        int i13;
        int i14;
        if (this.O5.G4()) {
            if (this.O5.P3()) {
                i14 = org.telegram.ui.ActionBar.t6.Lb;
            } else {
                i14 = org.telegram.ui.ActionBar.t6.f21318yd;
            }
            w02 = org.telegram.ui.ActionBar.t6.w0(i14, this.Ob);
        } else if (i10 == 0 && this.C5) {
            if (this.O5.P3()) {
                i12 = org.telegram.ui.ActionBar.t6.Fb;
            } else {
                i12 = org.telegram.ui.ActionBar.t6.f21083ld;
            }
            w02 = org.telegram.ui.ActionBar.t6.w0(i12, this.Ob);
        } else if (i10 == 0 && (dl0Var2 = this.f22643m8) != null) {
            w02 = dl0Var2.i();
        } else if (i10 == 0 && (dl0Var = this.f22670o8) != null) {
            w02 = dl0Var.i();
        } else {
            if (this.O5.P3()) {
                i11 = org.telegram.ui.ActionBar.t6.Lb;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.f21318yd;
            }
            w02 = org.telegram.ui.ActionBar.t6.w0(i11, this.Ob);
        }
        Drawable[] drawableArr = this.H2;
        Drawable drawable = drawableArr[i10];
        if (drawable == null) {
            org.telegram.ui.ActionBar.g6 g6Var = new org.telegram.ui.ActionBar.g6(this, i10);
            org.telegram.ui.ActionBar.g6[] g6VarArr = this.I2;
            g6VarArr[i10] = g6Var;
            int[][] iArr = {StateSet.WILD_CARD};
            if (this.O5.P3()) {
                i13 = org.telegram.ui.ActionBar.t6.Lb;
            } else {
                i13 = org.telegram.ui.ActionBar.t6.f21318yd;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{436207615 & org.telegram.ui.ActionBar.t6.w0(i13, this.Ob)}), null, g6VarArr[i10]);
            drawableArr[i10] = rippleDrawable;
            rippleDrawable.setCallback(this);
        } else {
            org.telegram.ui.ActionBar.t6.H1(drawable, w02 & 436207615, true);
        }
        drawableArr[i10].setVisible(true, false);
    }

    public final void z1(Canvas canvas, float f7, Runnable runnable) {
        org.telegram.ui.ActionBar.c5 c5Var;
        float f10;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        Canvas canvas2 = canvas;
        jj jjVar = this.O5;
        if (jjVar != null && jjVar.S4()) {
            RadialProgress2 radialProgress2 = this.P0;
            RectF rectF = radialProgress2.f24123a;
            Paint paint = radialProgress2.f24127g;
            i90 i90Var = radialProgress2.f24128i;
            RectF rectF2 = radialProgress2.f24123a;
            float cos = (((float) Math.cos((org.telegram.messenger.i0.W1(f7, 190, 45) / 180.0f) * 3.141592653589793d)) * org.telegram.messenger.i0.L(22.6274f)) + rectF.centerX();
            float sin = (((float) Math.sin((org.telegram.messenger.i0.W1(f7, 190, 45) / 180.0f) * 3.141592653589793d)) * org.telegram.messenger.i0.L(22.6274f)) + rectF2.centerY();
            RectF rectF3 = org.telegram.messenger.i0.P;
            rectF3.set(rectF2);
            rectF3.inset(-org.telegram.messenger.i0.L(1.0f), -org.telegram.messenger.i0.L(1.0f));
            canvas2.saveLayerAlpha(rectF3, 255, 31);
            if (v2()) {
                c5Var = this.K6;
            } else {
                c5Var = this.J6;
            }
            i90Var.B = c5Var;
            radialProgress2.f24129j.B = c5Var;
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
                canvas2.scale(f12, f12, rectF2.centerX(), org.telegram.messenger.i0.T1(rectF2.top, rectF2.bottom, 0.5f));
                if (this.f22486a1 == null) {
                    bi0 bi0Var = new bi0(2131624021, org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f), true, null);
                    this.f22486a1 = bi0Var;
                    bi0Var.R(this);
                    this.f22486a1.J(true);
                    this.f22486a1.K(1);
                    this.f22486a1.start();
                }
                this.f22486a1.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (this.f22499b1 == null) {
                    i10 = 1;
                    this.f22499b1 = new Paint(1);
                } else {
                    i10 = 1;
                }
                if (this.f22513c1 == null) {
                    Paint paint3 = new Paint(i10);
                    this.f22513c1 = paint3;
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                if (this.f22527d1 == null) {
                    Paint paint4 = new Paint(i10);
                    this.f22527d1 = paint4;
                    paint4.setStyle(Paint.Style.STROKE);
                }
                int i12 = radialProgress2.f24140u;
                if (i12 >= 0) {
                    i11 = org.telegram.ui.ActionBar.t6.w0(i12, this.Ob);
                } else {
                    i11 = radialProgress2.f24133n;
                }
                this.f22499b1.setColor(i11);
                this.f22527d1.setColor(i11);
                i90Var.a(false);
                this.f22499b1.setShader(i90Var.d.getShader());
                this.f22527d1.setShader(i90Var.d.getShader());
                rectF3.set(this.f22486a1.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                float f13 = f10;
                rectF3.inset(f13, f13);
                canvas2.drawRect(rectF3, this.f22499b1);
                this.f22486a1.q(canvas, this.f22513c1, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.f22527d1.setAlpha((int) (255.0f * f11));
                this.f22527d1.setStrokeWidth(org.telegram.messenger.i0.L(1.66f));
                RectF rectF4 = this.f22488a4;
                rectF4.set(rectF2);
                rectF4.inset(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
                qn0 qn0Var = this.C4;
                canvas.drawArc(rectF4, -90.0f, (1.0f - qn0Var.K) * (-360.0f), false, this.f22527d1);
                if (this.f22617k5 == null) {
                    this.f22617k5 = new h11();
                }
                this.f22617k5.a((1.0f - qn0Var.K) * (-360.0f), f11, canvas, this.f22527d1, rectF4);
                canvas2 = canvas;
            } else {
                bi0 bi0Var2 = this.f22486a1;
                if (bi0Var2 != null) {
                    bi0Var2.C(true);
                    this.f22486a1 = null;
                    if (this.f22617k5 != null) {
                        this.f22617k5 = null;
                    }
                }
            }
            canvas2.drawCircle(cos, sin, org.telegram.messenger.i0.L((f7 * 1.5f) + 10.0f) * f7, this.Z0);
            canvas2.restore();
            if (this.Y0 == null) {
                vh.j jVar = new vh.j(3);
                this.Y0 = jVar;
                z10 = false;
                jVar.e(-1, 0, 0);
                vh.j jVar2 = this.Y0;
                jVar2.f51294i = 14.0f;
                jVar2.c(10.0f);
                this.Y0.f51289a.setStrokeWidth(org.telegram.messenger.i0.N(1.5f));
                z11 = true;
                this.Y0.d(1, false, false);
                this.Y0.f51295j = -org.telegram.messenger.i0.N(0.33f);
                this.Y0.f51296k = org.telegram.messenger.i0.N(0.33f);
            } else {
                z10 = false;
                z11 = true;
            }
            vh.j jVar3 = this.Y0;
            jVar3.f51294i = f7 * 14.0f;
            jVar3.c(f7 * 10.0f);
            canvas2.saveLayerAlpha(cos - org.telegram.messenger.i0.L(10.0f), sin - org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f) + cos, org.telegram.messenger.i0.L(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, org.telegram.messenger.i0.L(10.0f) * f7, paint);
            vh.j jVar4 = this.Y0;
            if (org.telegram.messenger.i0.B(paint.getColor()) <= 0.8f) {
                z11 = z10;
            }
            jVar4.b(z11);
            vh.j jVar5 = this.Y0;
            jVar5.f51299n = cos;
            jVar5.f51300o = sin;
            jVar5.a(canvas2, f7);
            canvas2.restore();
            return;
        }
        runnable.run();
    }

    public final boolean z3() {
        ej ejVar;
        jj jjVar = this.O5;
        if (jjVar != null && !jjVar.f16365r1 && !jjVar.r4()) {
            bj bjVar = this.L;
            if ((bjVar == null || ((ejVar = this.K) != null && ejVar.f15399i && (bjVar.f14783l & 8) == 0)) && !this.gb.f23554x0) {
                if (!this.f22787y || !jj.R4(this.O5.f16337k)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public q1(Context context, int i10, boolean z10, li.k kVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = true;
        this.f22774x = new m2.t(12);
        gr grVar = gr.h;
        this.D = new fe.b(0, this, grVar, 380L, false);
        this.N = new sg.p0(this);
        this.O = new pg.a(this);
        this.P = new pg.c(this);
        this.C0 = new Rect();
        this.G0 = -1;
        this.H0 = -1;
        this.S0 = new int[4];
        this.H2 = new Drawable[2];
        this.I2 = new org.telegram.ui.ActionBar.g6[2];
        this.J2 = new int[2];
        this.K2 = new RectF();
        this.L2 = new int[]{16842910, 16842919};
        this.f22578h3 = -1;
        this.f22590i3 = -1;
        this.Z3 = new RectF();
        this.f22488a4 = new RectF();
        this.f22591i4 = 1.0f;
        this.f22603j4 = 1.0f;
        this.f22702r4 = -1;
        this.f22715s4 = new ji.a(this);
        this.f22741u4 = new ArrayList();
        this.f22753v4 = new ArrayList();
        this.f22804z4 = new Path();
        this.N4 = new ArrayList();
        this.O4 = new ArrayList();
        this.Q4 = -1;
        this.R4 = -1;
        this.T4 = true;
        this.G5 = new ArrayList();
        this.f22490a6 = -1;
        this.B6 = true;
        this.G6 = true;
        this.Z6 = 100;
        this.f22769w7 = new Rect();
        this.Q7 = new AtomicReference();
        this.Z8 = new RectF();
        this.f22671o9 = new StaticLayout[2];
        this.f22746u9 = new float[2];
        this.D9 = true;
        this.H9 = new Path();
        this.I9 = new float[8];
        this.S9 = 1.0f;
        this.Z9 = new Path();
        this.f22494aa = new float[8];
        this.Ka = new RectF();
        this.La = new RectF();
        this.eb = Build.VERSION.SDK_INT == 28;
        this.f22562fb = 1.0f;
        this.gb = new x1(this);
        this.f22623kb = new org.telegram.ui.Components.t5(this, 200L, gr.f26496g);
        this.f22660nb = new h1(this, 0);
        this.f22747ub = new h1(this, 1);
        this.f22760vb = new SparseArray();
        this.Jb = -1;
        this.Lb = new m.c3();
        this.Rb = new ArrayList();
        this.Sb = new Stack();
        this.Tb = new Path();
        this.Wb = new b1(this, 10);
        this.Xb = new b1(this, 2);
        this.f22538dc = false;
        this.f22635lc = new AtomicReference();
        this.f22647mc = -1L;
        this.f22799yc = false;
        this.f22811zc = new b1(this, 0);
        this.Ic = true;
        this.Qc = 1.0f;
        this.Vc = new g1(Float.class, "animationOffsetX", 0);
        this.Y5 = i10;
        this.Ob = p6Var;
        this.Pb = z10;
        this.Qb = kVar;
        if (kVar == null) {
            this.Qb = new li.k(context);
        }
        setClipChildren(false);
        setClipToPadding(false);
        ?? drawable = new Drawable();
        drawable.f24342a = new Paint(1);
        drawable.f24343b = null;
        drawable.h = -1.0f;
        drawable.f24347i = -1.0f;
        drawable.f24348j = -1.0f;
        drawable.f24349k = -1.0f;
        drawable.f24351m = this;
        this.Ra = drawable;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f22794y7 = imageReceiver;
        imageReceiver.f14424z1 = true;
        imageReceiver.J0(org.telegram.messenger.i0.L(21.0f));
        this.f22807z7 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.R7 = imageReceiver2;
        imageReceiver2.f14424z1 = true;
        imageReceiver2.J0(org.telegram.messenger.i0.L(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.D7 = imageReceiver3;
        imageReceiver3.f14424z1 = true;
        imageReceiver3.J0(org.telegram.messenger.i0.L(26.1f));
        this.X5 = org.telegram.messenger.b6.q(i10).k();
        this.W0 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        ag.c2 c2Var = new ag.c2(1, this, this);
        this.T0 = c2Var;
        c2Var.f14424z1 = true;
        c2Var.f14391l0 = true;
        c2Var.f14382g1 = this;
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.U0 = imageReceiver4;
        imageReceiver4.f14424z1 = true;
        imageReceiver4.f14391l0 = true;
        this.P0 = new RadialProgress2(this, p6Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, p6Var);
        this.Q0 = radialProgress2;
        radialProgress2.B = false;
        radialProgress2.setCircleRadius(org.telegram.messenger.i0.L(15.0f));
        i1 i1Var = new i1(this, this);
        this.B4 = i1Var;
        i1Var.h = this;
        ?? obj = new Object();
        obj.f29688a = 0;
        obj.f29689b = 0;
        obj.e = false;
        obj.f29691f = false;
        obj.f29703s = 1.0f;
        obj.f29704t = 1.0f;
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(125L, 600L, grVar);
        obj.v = t5Var;
        obj.f29706w = 1.0f;
        org.telegram.ui.Components.t5 t5Var2 = new org.telegram.ui.Components.t5(150L, gr.f26495f);
        obj.B = t5Var2;
        obj.J = false;
        if (qn0.N == null) {
            qn0.N = new Paint(1);
            qn0.O = new Paint(1);
            Paint paint = qn0.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            qn0.O.setStyle(style);
        }
        this.C4 = obj;
        obj.f29695k = this;
        obj.f29698n = this;
        t5Var2.f30443a = this;
        t5Var.f30443a = this;
        this.D4 = new org.telegram.ui.ActionBar.w0(this, 1);
        ?? drawable2 = new Drawable();
        drawable2.f26997a = 0L;
        drawable2.f26998b = false;
        drawable2.f26999c = new Paint(1);
        drawable2.d = 0.47f;
        drawable2.e = 0.0f;
        drawable2.f27000f = 0.32f;
        drawable2.f27001g = 1;
        drawable2.h = 1;
        drawable2.f27002i = 1;
        drawable2.f27006m = 255;
        drawable2.f27007n = p6Var;
        drawable2.f27003j = this;
        this.f22501b3 = drawable2;
        setImportantForAccessibility(1);
    }

    public void setBackgroundTopY(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.c5 c5Var = this.J6;
        int i13 = this.K0;
        int i14 = this.L0;
        if (i14 == 0) {
            i13 = getParentWidth();
            i14 = org.telegram.messenger.i0.f16026q.y;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                i12 = view.getMeasuredWidth();
                i11 = view.getMeasuredHeight();
                float f7 = this.M0;
                c5Var.q((int) (i10 + f7), i12, i11, (int) f7, this.f22509bb, this.f22523cb, this.E, (this.F && this.gb.A0 == 1.0f) ? false : true);
                c5Var.f20227u = f2();
            }
        }
        i11 = i14;
        i12 = i13;
        float f72 = this.M0;
        c5Var.q((int) (i10 + f72), i12, i11, (int) f72, this.f22509bb, this.f22523cb, this.E, (this.F && this.gb.A0 == 1.0f) ? false : true);
        c5Var.f20227u = f2();
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        l1 l1Var;
        if (this.O5 == null) {
            return;
        }
        Runnable runnable = this.Ac;
        if (runnable != null) {
            runnable.run();
            return;
        }
        Runnable runnable2 = this.Bc;
        if (runnable2 != null) {
            runnable2.run();
        }
        super.invalidate(i10, i11, i12, i13);
        if (this.Z5 && getParent() != null) {
            ((View) getParent()).invalidate(((int) getX()) + i10, ((int) getY()) + i11, ((int) getX()) + i12, ((int) getY()) + i13);
        }
        if (!this.Ub || (l1Var = this.Qa) == null) {
            return;
        }
        l1Var.o();
    }

    @Override
    public final void E(float f7, int i10) {
    }

    @Override
    public final void q(int i10, Drawable drawable) {
    }
}
