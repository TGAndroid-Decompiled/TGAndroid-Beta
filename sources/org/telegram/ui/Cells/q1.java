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
import org.telegram.messenger.a30;
import org.telegram.messenger.cj;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.ej;
import org.telegram.messenger.fj;
import org.telegram.messenger.fp;
import org.telegram.messenger.hj;
import org.telegram.messenger.i20;
import org.telegram.messenger.ic;
import org.telegram.messenger.ij;
import org.telegram.messenger.jb;
import org.telegram.messenger.jc;
import org.telegram.messenger.kj;
import org.telegram.messenger.nc;
import org.telegram.messenger.nu;
import org.telegram.messenger.ru;
import org.telegram.messenger.rz;
import org.telegram.messenger.tc;
import org.telegram.messenger.uz;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.messenger.wv;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ai0;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.r81;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v21;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.y41;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.km;
import org.telegram.ui.ps0;
import org.telegram.ui.xh0;
public class q1 extends z implements kn0, nc, org.telegram.messenger.z5, r9, vs, fe.e, r4 {
    public static final float[] f22483ed = new float[8];
    public static TextPaint f22484fd;
    public static TextPaint f22485gd;
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
    public rz0 B3;
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
    public rz0 C3;
    public final rn0 C4;
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
    public rz0 D3;
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
    public wx0 Jc;
    public fj K;
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
    public cj L;
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
    public n61 Mb;
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
    public kj O5;
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
    public kj P5;
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
    public fj Q5;
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
    public y41 R6;
    public final ImageReceiver R7;
    public float R8;
    public float[] R9;
    public final aa0 Ra;
    public final ArrayList Rb;
    public int Rc;
    public rz0 S;
    public final int[] S0;
    public boolean S1;
    public int S2;
    public int S3;
    public float S4;
    public boolean S5;
    public y41 S6;
    public int S7;
    public float S8;
    public final float S9;
    public int Sa;
    public final Stack Sb;
    public ij Sc;
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
    public rz0 f22486a0;
    public ci0 f22487a1;
    public int a2;
    public boolean f22488a3;
    public final RectF f22489a4;
    public boolean f22490a5;
    public int f22491a6;
    public boolean f22492a7;
    public boolean f22493a8;
    public dc f22494a9;
    public final float[] f22495aa;
    public int f22496ab;
    public float f22497ac;
    public float f22498ad;
    public k80 f22499b0;
    public Paint f22500b1;
    public float f22501b2;
    public final jl0 f22502b3;
    public TLObject f22503b4;
    public int f22504b5;
    public byte[] f22505b6;
    public int f22506b7;
    public boolean f22507b8;
    public RectF f22508b9;
    public StaticLayout f22509ba;
    public int f22510bb;
    public boolean f22511bc;
    public int f22512bd;
    public CornerPathEffect f22513c0;
    public Paint f22514c1;
    public float f22515c2;
    public StaticLayout f22516c3;
    public TLRPC.PhotoSize f22517c4;
    public float f22518c5;
    public byte[] f22519c6;
    public int f22520c7;
    public boolean f22521c8;
    public mg.a f22522c9;
    public int f22523ca;
    public int f22524cb;
    public boolean f22525cc;
    public int f22526cd;
    public int f22527d0;
    public Paint f22528d1;
    public int f22529d2;
    public int f22530d3;
    public TLRPC.PhotoSize f22531d4;
    public boolean f22532d5;
    public boolean f22533d6;
    public CheckBoxBase[] f22534d7;
    public boolean f22535d8;
    public int f22536d9;
    public String f22537da;
    public boolean f22538db;
    public boolean f22539dc;
    public TL_stars.StarGift f22540dd;
    public m11 f22541e0;
    public hw0 f22542e1;
    public StaticLayout f22543e2;
    public int f22544e3;
    public BitmapDrawable f22545e4;
    public boolean f22546e5;
    public boolean f22547e6;
    public e40 e7;
    public boolean f22548e8;
    public float f22549e9;
    public StaticLayout f22550ea;
    public final boolean eb;
    public m1 f22551ec;
    public boolean f22552f;
    public int f22553f0;
    public boolean f22554f1;
    public StaticLayout f22555f2;
    public boolean f22556f3;
    public String f22557f4;
    public float f22558f5;
    public boolean f22559f6;
    public t80 f7;
    public org.telegram.ui.Components.t5 f22560f8;
    public float f22561f9;
    public int f22562fa;
    public float f22563fb;
    public m1 f22564fc;
    public vx0 f22565g0;
    public float f22566g1;
    public float f22567g2;
    public v1 f22568g3;
    public String f22569g4;
    public int f22570g5;
    public boolean f22571g6;
    public float f22572g7;
    public float f22573g8;
    public float f22574g9;
    public String f22575ga;
    public final x1 gb;
    public boolean gc;
    public boolean h;
    public int f22576h0;
    public float f22577h1;
    public float f22578h2;
    public int f22579h3;
    public boolean f22580h4;
    public TLRPC.Poll f22581h5;
    public boolean f22582h6;
    public long f22583h7;
    public float f22584h8;
    public boolean f22585h9;
    public TLRPC.User ha;
    public boolean f22586hb;
    public boolean f22587hc;
    public long f22588i0;
    public boolean f22589i1;
    public float f22590i2;
    public int f22591i3;
    public float f22592i4;
    public ArrayList f22593i5;
    public boolean f22594i6;
    public ImageReceiver[] f22595i7;
    public TLRPC.PhotoSize f22596i8;
    public boolean f22597i9;
    public TLRPC.Chat ia;
    public boolean f22598ib;
    public int f22599ic;
    public int f22600j0;
    public boolean f22601j1;
    public float f22602j2;
    public int f22603j3;
    public float f22604j4;
    public int f22605j5;
    public boolean f22606j6;
    public org.telegram.ui.Components.r8[] f22607j7;
    public int f22608j8;
    public boolean f22609j9;
    public TLRPC.FileLocation f22610ja;
    public boolean f22611jb;
    public m1 f22612jc;
    public dc f22613k0;
    public CheckBoxBase f22614k1;
    public boolean f22615k2;
    public ij f22616k3;
    public long f22617k4;
    public i11 f22618k5;
    public boolean f22619k6;
    public boolean[] f22620k7;
    public Drawable f22621k8;
    public float f22622k9;
    public String f22623ka;
    public final org.telegram.ui.Components.t5 f22624kb;
    public Drawable f22625kc;
    public org.telegram.ui.Components.d5 f22626l0;
    public CheckBoxBase l1;
    public dc f22627l2;
    public ij f22628l3;
    public long l4;
    public org.telegram.ui.Components.t5 f22629l5;
    public boolean f22630l6;
    public StaticLayout f22631l7;
    public el0 f22632l8;
    public float f22633l9;
    public Object f22634la;
    public org.telegram.messenger.o6 f22635lb;
    public final AtomicReference f22636lc;
    public boolean m0;
    public boolean f22637m1;
    public StaticLayout f22638m2;
    public sh0 f22639m3;
    public boolean f22640m4;
    public int f22641m5;
    public boolean f22642m6;
    public org.telegram.ui.Components.x5 f22643m7;
    public el0 f22644m8;
    public StaticLayout f22645m9;
    public long f22646ma;
    public boolean f22647mb;
    public long f22648mc;
    public int f22649n;
    public int f22650n0;
    public boolean f22651n1;
    public StaticLayout f22652n2;
    public CharSequence f22653n3;
    public boolean f22654n4;
    public int f22655n5;
    public boolean f22656n6;
    public boolean f22657n7;
    public el0 f22658n8;
    public int f22659n9;
    public String f22660na;
    public final h1 f22661nb;
    public int f22662nc;
    public int f22663o0;
    public float f22664o1;
    public StaticLayout f22665o2;
    public ij f22666o3;
    public org.telegram.ui.Components.o5 f22667o4;
    public boolean f22668o5;
    public boolean f22669o6;
    public int f22670o7;
    public el0 f22671o8;
    public final StaticLayout[] f22672o9;
    public org.telegram.ui.Components.d5 f22673oa;
    public int f22674ob;
    public int f22675oc;
    public int f22676p0;
    public long f22677p1;
    public StaticLayout f22678p2;
    public int f22679p3;
    public q80 f22680p4;
    public boolean p5;
    public boolean f22681p6;
    public int f22682p7;
    public el0 f22683p8;
    public int p9;
    public org.telegram.ui.Components.d5 f22684pa;
    public int f22685pb;
    public int f22686pc;
    public int f22687q0;
    public int f22688q1;
    public float f22689q2;
    public float f22690q3;
    public hj f22691q4;
    public float f22692q5;
    public boolean q6;
    public boolean f22693q7;
    public boolean f22694q8;
    public boolean f22695q9;
    public TLRPC.User f22696qa;
    public float f22697qb;
    public int qc;
    public p3 f22698r;
    public s1 f22699r0;
    public org.telegram.ui.e5 f22700r1;
    public float f22701r2;
    public float f22702r3;
    public int f22703r4;
    public int f22704r5;
    public long f22705r6;
    public int f22706r7;
    public rh.s8 f22707r8;
    public float f22708r9;
    public TLRPC.User f22709ra;
    public boolean f22710rb;
    public float rc;
    public boolean f22711s;
    public u1 f22712s0;
    public org.telegram.messenger.l9 f22713s1;
    public boolean f22714s2;
    public int f22715s3;
    public final ji.a f22716s4;
    public float f22717s5;
    public boolean f22718s6;
    public int f22719s7;
    public int f22720s8;
    public int f22721s9;
    public TLRPC.Chat f22722sa;
    public ValueAnimator f22723sb;
    public float f22724sc;
    public int f22725t0;
    public boolean f22726t1;
    public RectF f22727t2;
    public int f22728t3;
    public int f22729t4;
    public float f22730t5;
    public boolean f22731t6;
    public int f22732t7;
    public y f22733t8;
    public int f22734t9;
    public String f22735ta;
    public int f22736tb;
    public org.telegram.ui.Components.x7 f22737tc;
    public int f22738u0;
    public boolean f22739u1;
    public r1 f22740u2;
    public int f22741u3;
    public final ArrayList f22742u4;
    public int f22743u5;
    public boolean f22744u6;
    public int f22745u7;
    public rz0 f22746u8;
    public final float[] f22747u9;
    public String ua;
    public final h1 f22748ub;
    public xa.n f22749uc;
    public int f22750v0;
    public boolean f22751v1;
    public w1 f22752v2;
    public StaticLayout f22753v3;
    public final ArrayList f22754v4;
    public int f22755v5;
    public boolean f22756v6;
    public boolean f22757v7;
    public rz0 f22758v8;
    public float f22759v9;
    public boolean f22760va;
    public final SparseArray f22761vb;
    public boolean vc;
    public l0 f22762w;
    public int f22763w0;
    public boolean f22764w1;
    public int f22765w2;
    public org.telegram.ui.Components.e6 f22766w3;
    public t80 f22767w4;
    public boolean f22768w5;
    public boolean f22769w6;
    public final Rect f22770w7;
    public int f22771w8;
    public float w9;
    public boolean f22772wa;
    public boolean f22773wb;
    public boolean f22774wc;
    public final m2.t f22775x;
    public int f22776x0;
    public boolean f22777x1;
    public CharSequence f22778x2;
    public org.telegram.ui.Components.e6 f22779x3;
    public ArrayList f22780x4;
    public String f22781x5;
    public int f22782x6;
    public boolean f22783x7;
    public int f22784x8;
    public StaticLayout f22785x9;
    public boolean f22786xa;
    public boolean xb;
    public xh0 f22787xc;
    public boolean f22788y;
    public int f22789y0;
    public long f22790y1;
    public int f22791y2;
    public StaticLayout y3;
    public CharacterStyle f22792y4;
    public TLRPC.Message f22793y5;
    public float f22794y6;
    public final ImageReceiver f22795y7;
    public org.telegram.ui.Components.t5 f22796y8;
    public int f22797y9;
    public org.telegram.ui.Components.k5 f22798ya;
    public float f22799yb;
    public boolean f22800yc;
    public int f22801z0;
    public boolean f22802z1;
    public int f22803z2;
    public long f22804z3;
    public final Path f22805z4;
    public boolean f22806z5;
    public long f22807z6;
    public final org.telegram.ui.Components.r8 f22808z7;
    public k80 f22809z8;
    public int f22810z9;
    public org.telegram.ui.Components.k5 f22811za;
    public float zb;
    public final b1 f22812zc;

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
        return pv0.c(spannableStringBuilder, textPaint, i18, Layout.Alignment.ALIGN_NORMAL, org.telegram.messenger.i0.L(1.0f), TextUtils.TruncateAt.END, i18, i13, true);
    }

    public static String G3(kj kjVar, kj kjVar2, boolean z10, int i10) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        boolean z11 = kjVar.f16730u1;
        int i11 = kjVar.I1;
        int i12 = kjVar.V;
        if (!z11 && !kjVar.r4() && !kj.b4(kjVar.f16690k) && !kj.d5(kjVar.f16690k)) {
            if (!kjVar.f16710p1 || kjVar.f16690k.date != 2147483646) {
                if (i12 != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    long j10 = i12;
                    sb2.append(dd.T(j10));
                    sb2.append(", ");
                    sb2.append(dd.D0().o0().format(j10 * 1000));
                    return sb2.toString();
                } else if (kjVar.f16681h2) {
                    return dd.T(kjVar2.f16690k.date) + ", " + dd.D0().o0().format(kjVar2.f16690k.date * 1000);
                } else if (z10) {
                    if (((org.telegram.messenger.j0) wp.r1(i11).f19300y7.U.f11588b).f16393c) {
                        if (i10 == 0 && kjVar.Y2()) {
                            i10 = ConnectionsManager.getInstance(i11).getCurrentTime();
                        }
                        return dd.L(i10);
                    }
                    return dd.L0(2131751211, null) + " " + dd.D0().o0().format(kjVar2.f16690k.date * 1000);
                } else if (kjVar.f16696l2 && (messageFwdHeader = (message = kjVar.f16690k).fwd_from) != null && ((messageFwdHeader.date != 0 || messageFwdHeader.saved_date != 0) && !(kj.o1(message) instanceof TLRPC.TL_messageMediaWidget))) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = kjVar.f16690k.fwd_from;
                    int i13 = messageFwdHeader2.saved_date;
                    if (i13 == 0) {
                        i13 = messageFwdHeader2.date;
                    }
                    return dd.O(i13);
                } else {
                    return dd.D0().o0().format(kjVar2.f16690k.date * 1000);
                }
            }
            return "";
        }
        return "";
    }

    public static int H1(cj cjVar) {
        int i10 = 0;
        if (cjVar != null) {
            if ((cjVar.f15166l & 2) == 0) {
                i10 = org.telegram.messenger.i0.L(4.0f);
            }
            if ((cjVar.f15166l & 1) == 0) {
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
        return tc.e(2);
    }

    public static StaticLayout R2(CharSequence charSequence, TextPaint textPaint, int i10) {
        SpannableStringBuilder H3 = H3(charSequence);
        if (H3 != null && i10 > 0) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            CharSequence ellipsize = TextUtils.ellipsize(H3, textPaint, i10, truncateAt);
            int L = org.telegram.messenger.i0.L(2.0f) + Math.max(1, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())));
            return pv0.c(ellipsize, textPaint, L, Layout.Alignment.ALIGN_NORMAL, 0.0f, truncateAt, L, 1, true);
        }
        return null;
    }

    public static int[] U1(Spannable spannable, CharacterStyle characterStyle) {
        int i10;
        int i11;
        boolean z10;
        zz0 zz0Var;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof d51) && (zz0Var = ((d51) characterStyle).f25411a) != null && (messageEntity = zz0Var.d) != null) {
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
        kj kjVar;
        TLRPC.User user = this.ha;
        if (user != null) {
            return org.telegram.messenger.o5.c(user);
        }
        if (this.ia != null && (kjVar = this.O5) != null && kj.B0(kjVar.f16690k) != 1271266957 && this.ia.signature_profiles) {
            long o10 = org.telegram.messenger.o5.o(this.O5.f16690k.from_id);
            int i10 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
            int i11 = this.Y5;
            if (i10 >= 0) {
                TLRPC.User Z1 = wp.r1(i11).Z1(Long.valueOf(o10));
                if (Z1 != null) {
                    return org.telegram.messenger.o5.c(Z1);
                }
            } else {
                TLRPC.Chat L0 = wp.r1(i11).L0(Long.valueOf(-o10));
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
            return i20.p(user);
        }
        if (this.ia != null) {
            kj kjVar = this.O5;
            if (kjVar != null && kj.B0(kjVar.f16690k) != 1271266957 && this.ia.signature_profiles) {
                long o10 = org.telegram.messenger.o5.o(this.O5.f16690k.from_id);
                int i10 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
                int i11 = this.Y5;
                if (i10 >= 0) {
                    TLRPC.User Z1 = wp.r1(i11).Z1(Long.valueOf(o10));
                    if (Z1 != null) {
                        return i20.p(Z1);
                    }
                } else {
                    TLRPC.Chat L0 = wp.r1(i11).L0(Long.valueOf(-o10));
                    if (L0 != null) {
                        return L0.title;
                    }
                }
            }
            return this.ia.title;
        }
        kj kjVar2 = this.O5;
        if (kjVar2 != null && kjVar2.r4()) {
            return this.O5.Q0;
        }
        return "DELETED";
    }

    private Object getAuthorStatus() {
        kj kjVar;
        TLRPC.User user = this.ha;
        if (user != null) {
            Long h = i20.h(user);
            if (h != null) {
                TLRPC.EmojiStatus emojiStatus = this.ha.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f22660na = ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug;
                }
                return h;
            } else if (this.ha.premium) {
                return org.telegram.messenger.w0.f18945b.getDrawable(2131232306).mutate();
            } else {
                return null;
            }
        } else if (this.ia != null && (kjVar = this.O5) != null && kj.B0(kjVar.f16690k) != 1271266957 && this.ia.signature_profiles) {
            long o10 = org.telegram.messenger.o5.o(this.O5.f16690k.from_id);
            if (o10 >= 0) {
                TLRPC.User Z1 = wp.r1(this.Y5).Z1(Long.valueOf(o10));
                if (Z1 != null) {
                    TLRPC.EmojiStatus emojiStatus2 = Z1.emoji_status;
                    if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                        this.f22660na = ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).slug;
                    }
                }
                return i20.h(Z1);
            }
            TLRPC.Chat L0 = wp.r1(this.Y5).L0(Long.valueOf(-o10));
            if (L0 != null) {
                TLRPC.EmojiStatus emojiStatus3 = L0.emoji_status;
                if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f22660na = ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug;
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
        kj kjVar;
        if (this.f22773wb && this.D8 != 0 && (kjVar = this.O5) != null && kjVar.T4()) {
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
        kj kjVar = this.O5;
        if (kjVar != null && kjVar.f16718r1) {
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
        if (this.f22609j9 && !t2()) {
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
            boolean z10 = this.f22609j9;
            f7 = org.telegram.messenger.i0.V1(!z10, z10, x1Var.L1);
        } else if (this.f22609j9) {
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
        fj fjVar = this.K;
        if (fjVar != null && !fjVar.d.isEmpty() && (messageReplies = ((kj) this.K.d.get(0)).f16690k.replies) != null) {
            return messageReplies.recent_repliers;
        }
        TLRPC.MessageReplies messageReplies2 = this.O5.f16690k.replies;
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
        kj kjVar = this.O5;
        if (kjVar != null && kjVar.N3()) {
            i10 = org.telegram.ui.ActionBar.t6.Mc;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21209sa;
        }
        return p6Var.h(i10);
    }

    private float getUseTranscribeButtonProgress() {
        x1 x1Var = this.gb;
        if (x1Var.f23521o1) {
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
        n1Var.f22332a = i10;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, org.telegram.ui.ActionBar.t6.M2, i11, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.t6.M2, org.telegram.messenger.i0.L(2.0f) + i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        n1Var.d = staticLayout;
        n1Var.f22333b = f7;
        if (staticLayout.getLineCount() > 0) {
            n1Var.f22334c = ((float) (n1Var.f22333b - Math.ceil(n1Var.d.getLineWidth(0)))) / 2.0f;
            n1Var.f22334c -= (int) n1Var.d.getLineLeft(0);
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
            p6Var.b(f7, f10 + this.V + this.f22553f0 + this.f22576h0, i10, i11);
        } else {
            org.telegram.ui.ActionBar.t6.r(f7, f10 + this.V + this.f22553f0 + this.f22576h0, i10, i11);
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
        if (this.gb.f23492i && !z15) {
            return;
        }
        this.f22697qb = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f22723sb = ofFloat;
        if (z15) {
            ofFloat.setDuration(220L);
        } else {
            ofFloat.setDuration(150L);
        }
        this.f22723sb.setInterpolator(gr.f26523f);
        this.f22685pb = i10;
        this.f22674ob = i11;
        this.f22723sb.addUpdateListener(new jg.o0(1, this, z10));
        this.f22723sb.addListener(new eg.m(7, this, z10));
        this.f22710rb = true;
        this.f22723sb.start();
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
            if ((this.K == null || (this.L.f15166l & 4) != 0) && !this.P1) {
                kj kjVar = this.O5;
                if (kjVar != null) {
                    if (!kjVar.f16681h2 && !kjVar.r4()) {
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
        wv wvVar;
        boolean z11;
        if (this.O5.r4()) {
            this.Z6 = org.telegram.messenger.i0.L(31.0f) + i12;
        } else if (Y3()) {
            this.Z6 = org.telegram.messenger.i0.L(31.0f) + i12;
        } else {
            sg.p0 p0Var = this.N;
            if (!p0Var.f48461p) {
                l1 = p0Var.f48463r;
            } else {
                l1 = this.O5.l1();
            }
            int i15 = 0;
            if (!p0Var.f48461p) {
                if (i10 - l1 >= i11 && !this.O5.f16731u2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (this.S1) {
                    this.f22738u0 = org.telegram.messenger.i0.L(14.0f) + this.f22738u0;
                }
            } else if ((this.f22726t1 || ((!this.P1 || this.O5.r4()) && !d2() && !this.Q1 && !this.R1 && !this.S1)) && i10 - l1 >= i11 && !this.O5.f16731u2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.O5.G4()) {
                z10 = true;
            }
            if (p0Var.f48461p && (wvVar = this.O5.f16738w2) != null) {
                ArrayList arrayList = wvVar.h;
                ArrayList arrayList2 = wvVar.f19333g;
                if (!arrayList2.isEmpty() && !wvVar.d && !wvVar.I()) {
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        while (i15 < size) {
                            Object obj = arrayList.get(i15);
                            i15++;
                            if (((nu) obj).f17344b >= arrayList2.size() - 1) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    z11 = ((ru) i0.a.g(1, arrayList2)).v();
                } else {
                    z11 = true;
                    break;
                }
                if (z11) {
                    z10 = true;
                }
            }
            kj kjVar = this.O5;
            if ((kjVar.D2 && p0Var.f48461p) || ((kjVar.H2 && p0Var.f48461p) || kjVar.v3())) {
                i13 = 18;
                z10 = true;
            } else {
                i13 = 14;
            }
            if (z10) {
                this.f22738u0 = org.telegram.messenger.i0.L(i13) + this.f22738u0;
                this.f22492a7 = true;
                int L = org.telegram.messenger.i0.L(31.0f) + Math.max(i12, l1);
                this.Z6 = L;
                if (this.O5.P3()) {
                    i14 = org.telegram.messenger.i0.L(17.0f) + this.f22797y9;
                } else {
                    i14 = this.f22797y9;
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
        kj kjVar;
        l1 l1Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.O5.t2() && !this.O5.m5()) {
            kj kjVar2 = this.O5;
            if (!kjVar2.M0) {
                if (this.Qa != null && kjVar2.p4()) {
                    this.Qa.A(this);
                    return;
                } else {
                    E3(this.f22566g1, this.f22577h1);
                    return;
                }
            }
        }
        kj kjVar3 = this.O5;
        int i10 = kjVar3.D;
        int i11 = 0;
        if (i10 == 20) {
            TLRPC.Message message = kjVar3.f16690k;
            if (message != null && (messageMedia = message.media) != null && !messageMedia.extended_media.isEmpty()) {
                TLRPC.ReplyMarkup replyMarkup = this.O5.f16690k.reply_markup;
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
        } else if (i10 != 1 && !kjVar3.M2()) {
            kj kjVar4 = this.O5;
            int i12 = kjVar4.D;
            if (i12 == 12) {
                long j10 = kj.o1(kjVar4.f16690k).user_id;
                if (j10 != 0) {
                    user = wp.r1(this.Y5).Z1(Long.valueOf(j10));
                } else {
                    user = null;
                }
                this.Qa.r0(this, user, this.f22566g1, this.f22577h1);
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
                this.Qa.s0(this, this.f22566g1, this.f22577h1, false);
            } else if (this.K1 != 4 && !kjVar4.D2(true)) {
                kj kjVar5 = this.O5;
                int i14 = kjVar5.D;
                if (i14 != 4 && i14 != 17 && i14 != 23 && i14 != 24) {
                    int i15 = this.K1;
                    if (i15 == 1) {
                        if (this.M3 == -1) {
                            this.Qa.s0(this, this.f22566g1, this.f22577h1, false);
                            return;
                        }
                        return;
                    } else if (kjVar5.Y0 != null) {
                        l1 l1Var2 = this.Qa;
                        if (l1Var2 != null) {
                            l1Var2.s0(this, this.f22566g1, this.f22577h1, false);
                            return;
                        }
                        return;
                    } else if (i15 == 2) {
                        if (this.M3 == -1 && (webPage = kj.o1(kjVar5.f16690k).webpage) != null) {
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
                            this.Qa.s0(this, this.f22566g1, this.f22577h1, false);
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
                this.Qa.s0(this, this.f22566g1, this.f22577h1, false);
            } else if (this.M3 != -1 && (!this.f22777x1 || (!this.F5 && (((kjVar = this.O5) == null || !kjVar.D2(true)) && (!uz.B0 || !this.A1))))) {
                if (this.f22777x1) {
                    C0(true);
                    return;
                }
                int i16 = this.M3;
                if (i16 == 0 || i16 == 3) {
                    C0(false);
                }
            } else {
                this.Qa.s0(this, this.f22566g1, this.f22577h1, false);
            }
        } else {
            int i17 = this.M3;
            if (i17 == -1) {
                this.Qa.s0(this, this.f22566g1, this.f22577h1, false);
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
        kj kjVar = this.O5;
        if (!kjVar.f16689j2) {
            if (kj.B0(kjVar.f16690k) != 489000 || (message = this.O5.f16690k) == null || message.fwd_from == null) {
                if (!this.O5.r4() && !this.O5.v3()) {
                    if (!this.f22547e6 || this.f22731t6) {
                        TLRPC.Message message2 = this.O5.f16690k;
                        if (message2 == null || (messageFwdHeader = message2.fwd_from) == null || (peer = messageFwdHeader.from_id) == null || message2.via_bot_id == 0 || org.telegram.messenger.o5.o(peer) != org.telegram.messenger.o5.o(this.O5.f16690k.peer_id)) {
                            if (!this.f22731t6 || this.O5.D != 0) {
                                if (!this.E && this.f22585h9 && this.f22533d6) {
                                    if (this.O5.P3()) {
                                        if ((this.O5.A4() && this.O5.o3()) || this.O5.f16681h2) {
                                            return true;
                                        }
                                    } else {
                                        return true;
                                    }
                                }
                                if (!this.O5.y3() || this.O5.f16690k.fwd_from.from_id != null) {
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
        kj kjVar;
        kj kjVar2;
        int i10 = this.f22736tb;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
        } else if (!r2()) {
            if (!Y3() && ((!this.A6 || ((this.f22616k3 != null && !this.f22739u1) || (!this.N.f48461p && ((kjVar2 = this.O5) == null || (!kjVar2.M2() && !this.O5.h4()))))) && ((kjVar = this.O5) == null || kjVar.D != 29))) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public final void C() {
        StaticLayout staticLayout;
        if (this.O5.D == 20 && (staticLayout = this.V9) != null) {
            ag.c2 c2Var = this.T0;
            this.T9 = c3.i0.B(c2Var.M0, staticLayout.getWidth(), 2.0f, this.L6);
            this.U9 = c3.i0.B(c2Var.N0, this.V9.getHeight(), 2.0f, this.N6 + c2Var.L0);
        }
    }

    public final void C0(boolean z10) {
        float f7;
        kj kjVar;
        kj kjVar2;
        TLRPC.PhotoSize photoSize;
        String str;
        int i10;
        RadialProgress2 radialProgress2;
        int i11;
        kj kjVar3;
        if (this.Qa != null && this.O5.p4() && this.O5.t2() && !this.O5.m5() && !this.O5.M0) {
            this.Qa.A(this);
            return;
        }
        kj kjVar4 = this.O5;
        if (kjVar4 != null && !kjVar4.M2()) {
            this.O5.P = true;
        }
        int i12 = this.M3;
        RadialProgress2 radialProgress22 = this.Q0;
        int i13 = this.Y5;
        ag.c2 c2Var = this.T0;
        RadialProgress2 radialProgress23 = this.P0;
        if (i12 == 0 && (!this.f22777x1 || z10)) {
            int i14 = this.K1;
            if (i14 != 3 && i14 != 5 && (i14 != 7 || (kjVar3 = this.O5) == null || !kjVar3.T4() || !this.O5.f16740x0)) {
                if (z10) {
                    radialProgress22.p(false, 0.0f);
                } else {
                    radialProgress23.p(false, 0.0f);
                }
                if (this.f22517c4 != null && (c2Var.L() || this.f22531d4 == null)) {
                    photoSize = this.f22517c4;
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !"s".equals(photoSize.type)) {
                        str = this.f22557f4;
                    } else {
                        str = this.f22569g4;
                    }
                } else {
                    photoSize = this.f22531d4;
                    str = this.f22569g4;
                }
                if (kj.Q5(this.O5.f16690k)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                kj kjVar5 = this.O5;
                int i15 = kjVar5.D;
                if (i15 == 1 || i15 == 20) {
                    int i16 = i10;
                    radialProgress2 = radialProgress23;
                    c2Var.f14403r = true;
                    c2Var.r0(jc.f(this.f22517c4, this.f22503b4), this.f22557f4, jc.f(this.f22531d4, this.f22503b4), this.f22569g4, this.f22545e4, this.f22517c4.size, null, this.O5, i16);
                } else if (i15 == 8) {
                    org.telegram.messenger.b8.G(i13).X(this.L1, this.O5, 2, 0);
                    if (this.O5.F0 > 0) {
                        y0(this.L1);
                    }
                    radialProgress2 = radialProgress23;
                } else if (this.f22773wb) {
                    if (kjVar5.l4()) {
                        org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(i13);
                        TLRPC.Document F0 = this.O5.F0();
                        kj kjVar6 = this.O5;
                        if (kj.Q5(kjVar6.f16690k)) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        G.X(F0, kjVar6, 2, i11);
                        radialProgress2 = radialProgress23;
                    } else {
                        kj kjVar7 = this.O5;
                        kjVar7.f16670f0 = 2.0f;
                        TLRPC.Document F02 = kjVar7.F0();
                        c2Var.f14403r = true;
                        String str2 = str;
                        radialProgress2 = radialProgress23;
                        c2Var.r0(jc.b(F02), null, jc.f(photoSize, F02), str2, null, F02.size, null, this.O5, 0);
                    }
                    this.f22611jb = true;
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
                            kj kjVar8 = this.O5;
                            if (kjVar8.F0 > 0) {
                                y0(kjVar8.F0());
                            }
                        } else if (i15 == 0 && i17 != 0) {
                            if (i17 == 2) {
                                c2Var.f14403r = true;
                                c2Var.r0(jc.b(this.L1), null, jc.c(this.f22517c4, this.L1), this.f22569g4, null, this.L1.size, null, this.O5, i10);
                                kj kjVar9 = this.O5;
                                kjVar9.f16670f0 = 2.0f;
                                if (kjVar9.F0 > 0) {
                                    y0(kjVar9.F0());
                                }
                            } else if (i17 == 1) {
                                org.telegram.messenger.b8.G(i13).X(this.L1, this.O5, 2, 0);
                            } else if (i17 == 8) {
                                c2Var.r0(jc.b(this.L1), this.f22557f4, jc.c(this.f22517c4, this.L1), "b1", null, 0L, "jpg", this.O5, 1);
                            }
                        } else {
                            c2Var.f14403r = true;
                            c2Var.r0(jc.f(this.f22517c4, this.f22503b4), this.f22557f4, jc.f(this.f22531d4, this.f22503b4), this.f22569g4, this.f22545e4, 0L, null, this.O5, 0);
                        }
                    }
                }
                this.O5.f16688j1 = false;
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
                this.O5.f16688j1 = false;
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
        } else if (i12 == 1 && (!this.f22777x1 || z10)) {
            c2Var.f14403r = false;
            int i18 = this.K1;
            if (i18 != 3 && i18 != 5 && (i18 != 7 || (kjVar2 = this.O5) == null || !kjVar2.T4())) {
                if (this.O5.N3() && !this.f22777x1 && (this.O5.o4() || this.O5.Y2())) {
                    if (radialProgress23.f24129i.f27048q != 6) {
                        this.Qa.M(this);
                        return;
                    }
                    return;
                }
                kj kjVar10 = this.O5;
                kjVar10.f16688j1 = true;
                int i19 = this.K1;
                if (i19 != 2 && i19 != 4 && i19 != 1 && i19 != 8) {
                    int i20 = kjVar10.D;
                    if (i20 != 0 && i20 != 1 && i20 != 20 && i20 != 8 && i20 != 5) {
                        if (i20 == 9) {
                            org.telegram.messenger.b8.G(i13).f(this.O5.F0());
                        }
                    } else {
                        ic D = ic.D();
                        String str3 = c2Var.Q;
                        if (str3 != null) {
                            D.f16261s.c(new jb(D, str3, 2));
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
            kj kjVar11 = this.O5;
            if (kjVar11 != null && kjVar11.D == 23) {
                this.Qa.s0(this, 0.0f, 0.0f, false);
            } else if (this.K1 == 7 && kjVar11 != null && kjVar11.T4()) {
                if (this.V3 == 0) {
                    org.telegram.messenger.b8.G(i13).X(this.L1, this.O5, 2, 0);
                    this.O5.f16688j1 = false;
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
                if (this.f22773wb) {
                    this.f22611jb = true;
                    invalidate();
                }
            } else {
                int i21 = this.K1;
                if (i21 != 3 && i21 != 5) {
                    if (this.f22773wb) {
                        kj kjVar12 = MediaController.B().f14483u0;
                        if (kjVar12 == null || !kjVar12.h4()) {
                            c2Var.f14409t0 = true;
                            c2Var.P0(false);
                        }
                    } else {
                        c2Var.f14409t0 = true;
                        c2Var.P0(false);
                    }
                    this.O5.f16670f0 = 0.0f;
                    this.M3 = -1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    return;
                }
                radialProgress23.p(false, 0.0f);
                org.telegram.messenger.b8.G(i13).X(this.L1, this.O5, 2, 0);
                this.O5.f16688j1 = false;
                this.M3 = 4;
                radialProgress23.setIcon(getIconForCurrentState(), true, true);
                invalidate();
            }
        } else if (i12 != 3 && i12 != 0) {
            if (i12 == 4) {
                int i22 = this.K1;
                if (i22 == 3 || i22 == 5 || (i22 == 7 && (kjVar = this.O5) != null && kjVar.T4())) {
                    if ((this.O5.N3() && (this.O5.o4() || this.O5.Y2())) || this.O5.n4()) {
                        l1 l1Var = this.Qa;
                        if (l1Var != null && radialProgress23.f24129i.f27048q != 6) {
                            l1Var.M(this);
                            return;
                        }
                        return;
                    }
                    this.O5.f16688j1 = true;
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
                } else if (characterStyleArr[i11] == this.f22792y4) {
                    o1Var.f22378b = i10;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (o1Var.f22378b != i10) {
            return false;
        }
        k80Var.rewind();
        int spanStart = spanned.getSpanStart(this.f22792y4);
        int spanEnd = spanned.getSpanEnd(this.f22792y4);
        k80Var.f27550c = true;
        k80Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, k80Var);
        k80Var.a();
        this.f22767w4.l();
        return true;
    }

    public final boolean C2(kj kjVar) {
        TLRPC.MessageFwdHeader messageFwdHeader = kjVar.f16690k.fwd_from;
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
                    this.f22692q5 = f7;
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

    @Override
    public final void D(boolean z10) {
        boolean z11;
        int i10 = this.K1;
        if (i10 != 3 && i10 != 5) {
            z11 = false;
        } else {
            z11 = true;
        }
        K3(true, z11, false);
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
            kj kjVar = this.O5;
            if (kjVar != null && !kjVar.M2()) {
                this.O5.P = true;
            }
            int i14 = this.K1;
            if (i14 != 3 && i14 != 5) {
                if (i14 == 4 || i14 == 7) {
                    y0(this.L1);
                    org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(i13);
                    TLRPC.Document document = this.L1;
                    kj kjVar2 = this.O5;
                    if (kj.Q5(kjVar2.f16690k)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    G.X(document, kjVar2, 2, i11);
                    this.O5.f16688j1 = false;
                }
            } else {
                org.telegram.messenger.b8 G2 = org.telegram.messenger.b8.G(i13);
                TLRPC.Document document2 = this.L1;
                kj kjVar3 = this.O5;
                if (kj.Q5(kjVar3.f16690k)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                G2.X(document2, kjVar3, 2, i10);
                this.O5.f16688j1 = false;
            }
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        } else if (i12 == 1) {
            int i15 = this.K1;
            if ((i15 == 3 || i15 == 5 || i15 == 7) && MediaController.B().I(this.O5)) {
                MediaController.B().q(true, true, false, false);
            }
            this.V3 = 0;
            this.O5.f16688j1 = true;
            org.telegram.messenger.b8.G(i13).f(this.L1);
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final boolean D1(o1 o1Var, k80 k80Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (C1(o1Var, k80Var, ((hj) arrayList.get(i10)).e, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean D2(org.telegram.messenger.kj r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.D2(org.telegram.messenger.kj):boolean");
    }

    public final void D3() {
        ag.c2 c2Var = this.T0;
        E3((c2Var.M0 / 2.0f) + c2Var.K0, (c2Var.N0 / 2.0f) + c2Var.L0);
    }

    public final void E0() {
        kj kjVar = this.O5;
        if (kjVar != null) {
            kjVar.J0 = !kjVar.J0;
            l1 l1Var = this.Qa;
            if (l1Var != null) {
                l1Var.n1(this, true);
            }
        }
    }

    public final void E1() {
        kj kjVar = this.P5;
        if (kjVar == null) {
            kjVar = this.O5;
        }
        kj kjVar2 = kjVar;
        this.O5 = null;
        s3(kjVar2, this.K, this.F, this.E, this.G, false);
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
        kj kjVar = this.O5;
        if (!kjVar.M0 && this.K9 == 0.0f) {
            if (kjVar.D == 3) {
                kjVar.K1 = true;
                kjVar.O0 = true;
                q1Var = this;
                q1Var.r3(kjVar, this.K, this.F, this.E, this.G, this.H);
                kj kjVar2 = q1Var.O5;
                kjVar2.O0 = false;
                kjVar2.K1 = false;
                if (q1Var.K != null) {
                    q1Var.P0.p(false, 0.0f);
                }
            } else {
                q1Var = this;
            }
            q1Var.L9 = f7;
            q1Var.M9 = f10;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w7.u.a(q1Var.N9 * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(gr.f26526j);
            duration.addUpdateListener(new r(this, 2));
            duration.addListener(new k1(this, 0));
            duration.start();
        }
    }

    public final int F() {
        if (this.f22739u1) {
            return 4;
        }
        return 8;
    }

    public final void F0(Canvas canvas, float f7) {
        ArrayList arrayList;
        float f10;
        float f11;
        if (this.f22616k3 == null) {
            return;
        }
        float f12 = this.f22702r3;
        float f13 = this.f22690q3;
        x1 x1Var = this.gb;
        if (x1Var.f23555x0) {
            if (x1Var.D0) {
                f12 -= getTranslationY();
                f11 = x1Var.f23488h0;
            } else if (x1Var.f23540t0) {
                float f14 = x1Var.L1;
                float f15 = 1.0f - f14;
                f13 = (f13 * f14) + (x1Var.f23532r0 * f15);
                f12 = (f12 * f14) + (f15 * x1Var.f23536s0);
            } else if (!kj.R4(this.O5.f16690k) || !TextUtils.isEmpty(this.O5.f16747z)) {
                f11 = x1Var.f23488h0;
            }
            f13 += f11;
        }
        float f16 = f13;
        float f17 = f12;
        float f18 = 0.0f;
        ArrayList arrayList2 = null;
        if (x1Var.f23462b1) {
            float f19 = x1Var.L1;
            if (f19 != 1.0f) {
                ij ijVar = x1Var.f23467c1;
                if (ijVar != null) {
                    arrayList = ijVar.e;
                } else {
                    arrayList = null;
                }
                org.telegram.ui.Components.k5 k5Var = x1Var.P0;
                float f20 = (1.0f - f19) * f7;
                if (ijVar != null) {
                    f10 = ijVar.d;
                } else {
                    f10 = 0.0f;
                }
                G0(f16, f17, canvas, arrayList, k5Var, false, f20, f10, true);
                ij ijVar2 = this.f22616k3;
                if (ijVar2 != null) {
                    arrayList2 = ijVar2.e;
                }
                ArrayList arrayList3 = arrayList2;
                org.telegram.ui.Components.k5 k5Var2 = this.f22798ya;
                float f21 = f7 * x1Var.L1;
                if (ijVar2 != null) {
                    f18 = ijVar2.d;
                }
                G0(f16, f17, canvas, arrayList3, k5Var2, true, f21, f18, true);
                return;
            }
        }
        ij ijVar3 = this.f22616k3;
        if (ijVar3 != null) {
            arrayList2 = ijVar3.e;
        }
        ArrayList arrayList4 = arrayList2;
        org.telegram.ui.Components.k5 k5Var3 = this.f22798ya;
        if (ijVar3 != null) {
            f18 = ijVar3.d;
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
        if (this.Y8 != null && (rectF = this.f22508b9) != null && (this.ha != null || this.ia != null)) {
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
        if (this.f22773wb && this.xb) {
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
        if (this.f22494a9 == null) {
            this.f22494a9 = new dc(this);
        }
        if (motionEvent.getAction() == 0) {
            this.f22494a9.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.f22494a9.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f22494a9.f25465i) {
                this.Qa.P1(this);
            }
            this.f22494a9.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.f22494a9.c(false);
        }
        return this.f22494a9.f25465i;
    }

    public final void H0(Canvas canvas, float f7) {
        xh0 xh0Var;
        kj kjVar = this.O5;
        if (kjVar != null && !kjVar.r4()) {
            float f10 = this.f22725t0;
            x1 x1Var = this.gb;
            if (x1Var.f23513m2) {
                float f11 = x1Var.f23522o2;
                float f12 = x1Var.L1;
                f10 = (f10 * f12) + ((1.0f - f12) * f11);
            }
            float f13 = f10;
            if (x1Var.L1 != 1.0f && x1Var.H0 && ((xh0Var = this.f22787xc) == null || !xh0Var.h)) {
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
                G0(this.f22650n0, f13, canvas, x1Var.I0, x1Var.P0, false, (1.0f - x1Var.L1) * f7, this.O5.f16734v2, false);
                kj kjVar2 = this.O5;
                G0(this.f22650n0, f13, canvas, kjVar2.f16750z2, this.f22798ya, true, f7 * x1Var.L1, kjVar2.f16734v2, false);
                canvas.restore();
            } else {
                kj kjVar3 = this.O5;
                G0(this.f22650n0, f13, canvas, kjVar3.f16750z2, this.f22798ya, true, f7, kjVar3.f16734v2, false);
            }
        }
        if (z3()) {
            F0(canvas, f7);
        }
    }

    public final boolean H2() {
        kj kjVar = this.O5;
        if (kjVar != null && kjVar.S4()) {
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
        kj kjVar;
        if (this.W6 && (kjVar = this.O5) != null && !kjVar.P3() && this.L == null && !r2()) {
            return true;
        }
        return false;
    }

    public final void I3(int i10, boolean z10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.O4;
            if (i10 < arrayList.size()) {
                p1 p1Var = (p1) arrayList.get(i10);
                if (this.Qa.P(this, p1Var.f22438t, !p1Var.f22427i)) {
                    if (z10) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long B0 = kj.B0(this.O5.f16690k);
                    int i11 = this.Y5;
                    long M = org.telegram.messenger.w3.M(wp.r1(i11).L0(Long.valueOf(B0)), wp.r1(i11).M0(B0), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) kj.n1(this.O5);
                    int i12 = this.Y5;
                    kj.X5(i12, M, tL_messageMediaToDo, p1Var.f22438t.f19941id, !p1Var.f22427i, ConnectionsManager.getInstance(i12).getCurrentTime());
                    if (!p1Var.f22427i) {
                        TLObject d22 = wp.r1(i11).d2(M);
                        p1Var.f22442y.l(d22);
                        p1Var.f22443z.i0(d22, p1Var.f22442y, null);
                        p1Var.f22435q = new rz0(org.telegram.messenger.o5.m(d22), 12.0f, null);
                    }
                    this.f22534d7[i10].f(-1, !p1Var.f22427i, true);
                    if (this.f22766w3 != null) {
                        if (!this.O5.P3() && kj.B0(this.O5.f16690k) >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.f22766w3.t(dd.K("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(kj.z0(tL_messageMediaToDo)), org.telegram.messenger.o5.l(e20.f15506s0, this.O5.Z0())), true, true);
                        } else {
                            this.f22766w3.t(dd.K("TodoCompleted", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(kj.z0(tL_messageMediaToDo))), true, true);
                        }
                    }
                    p1Var.f22427i = !p1Var.f22427i;
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
        kj kjVar;
        if (this.Pb && (kjVar = this.O5) != null && kjVar.P3() && org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21192rb, this.Ob) != 0) {
            return true;
        }
        return false;
    }

    public final org.telegram.ui.ActionBar.c5 J1(boolean z10) {
        boolean z11;
        if (z10) {
            cj cjVar = this.L;
            if (cjVar != null && (cjVar.f15166l & 8) == 0 && this.K.f15740i && !this.J) {
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
        kj kjVar;
        int i10;
        boolean z10;
        wv wvVar;
        ArrayList arrayList;
        if (this.vc && (kjVar = this.O5) != null) {
            boolean z11 = false;
            if (kjVar.V1) {
                i10 = org.telegram.ui.Components.f5.f();
            } else {
                i10 = 0;
            }
            ij ijVar = this.f22616k3;
            if (ijVar != null && (arrayList = ijVar.e) != null) {
                this.f22798ya = org.telegram.ui.Components.o5.update(i10, (View) this, false, this.f22798ya, (ArrayList<hj>) arrayList);
            } else {
                l1 l1Var = this.Qa;
                if (l1Var != null && l1Var.f()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f22798ya = org.telegram.ui.Components.o5.update(i10, this, z10, this.f22798ya, this.O5.f16750z2);
            }
            kj kjVar2 = this.O5;
            if (kjVar2.D == 36 && (wvVar = kjVar2.f16738w2) != null) {
                l1 l1Var2 = this.Qa;
                if (l1Var2 == null || !l1Var2.f()) {
                    z11 = true;
                }
                wvVar.v = z11;
                this.O5.f16738w2.b0(i10);
            }
        }
    }

    public final boolean K(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f22757v7) {
            int x10 = (int) motionEvent.getX();
            int K1 = (int) K1(motionEvent);
            cj cjVar = this.L;
            if (cjVar != null) {
                int i10 = cjVar.f15166l;
                if ((i10 & 1) == 0 || (i10 & 8) == 0) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int childCount = viewGroup.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (childAt != this && (childAt instanceof q1)) {
                            q1 q1Var = (q1) childAt;
                            if (q1Var.f22757v7 && q1Var.K == this.K) {
                                int i12 = q1Var.L.f15166l;
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
                if (this.f22770w7.contains(x10, K1)) {
                    if (this.O5.q4()) {
                        this.J2[1] = 2;
                        this.f22783x7 = true;
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
                if (this.f22783x7) {
                    l1 l1Var = this.Qa;
                    if (l1Var != null) {
                        if (this.f22718s6) {
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
                    this.f22783x7 = false;
                    p2();
                    return false;
                }
            } else if (motionEvent.getAction() == 2 && this.f22783x7 && (drawable = drawableArr[1]) != null) {
                drawable.setHotspot(x10, K1);
            }
        }
        return false;
    }

    public final boolean K0(android.graphics.Canvas r43, boolean r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.K0(android.graphics.Canvas, boolean, boolean):boolean");
    }

    public final float K1(MotionEvent motionEvent) {
        return ((motionEvent.getY() - this.V) - this.f22553f0) - this.f22576h0;
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
            if (this.f22740u2 == null) {
                this.f22740u2 = new r1(this);
            }
            r1 r1Var = this.f22740u2;
            q1 q1Var = r1Var.f22865a;
            kj kjVar = q1Var.O5;
            int[] iArr = q1Var.L2;
            Drawable[] drawableArr = q1Var.H2;
            if (kjVar.D == 12) {
                int x10 = (int) motionEvent.getX();
                int K1 = (int) q1Var.K1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    ArrayList arrayList = r1Var.f22869g;
                    if (arrayList != null && arrayList.size() > 1) {
                        for (int i10 = 0; i10 < r1Var.f22869g.size(); i10++) {
                            n1 n1Var = (n1) r1Var.f22869g.get(i10);
                            float f7 = x10;
                            float f10 = K1;
                            if (n1Var.e.contains(f7, f10)) {
                                if (n1Var.f22335f == null) {
                                    n1Var.f22335f = new dc(q1Var);
                                }
                                n1Var.f22335f.c(true);
                                y yVar = n1Var.f22336g;
                                if (yVar != null) {
                                    yVar.setHotspot(f7, f10);
                                    n1Var.f22336g.setState(iArr);
                                }
                                q1Var.invalidate();
                                return true;
                            }
                        }
                    }
                    float f11 = x10;
                    float f12 = K1;
                    if (q1Var.f22727t2.contains(f11, f12)) {
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
                            ArrayList arrayList2 = r1Var.f22869g;
                            if (arrayList2 != null && arrayList2.size() == 1) {
                                q1Var.Qa.c1(q1Var, ((n1) r1Var.f22869g.get(0)).f22332a);
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
                    ArrayList arrayList3 = r1Var.f22869g;
                    if (arrayList3 != null && arrayList3.size() > 1) {
                        for (int i11 = 0; i11 < r1Var.f22869g.size(); i11++) {
                            n1 n1Var2 = (n1) r1Var.f22869g.get(i11);
                            dc dcVar = n1Var2.f22335f;
                            if (dcVar != null && dcVar.f25465i) {
                                l1 l1Var = q1Var.Qa;
                                if (l1Var != null) {
                                    l1Var.c1(q1Var, n1Var2.f22332a);
                                }
                                y yVar2 = n1Var2.f22336g;
                                if (yVar2 != null) {
                                    yVar2.setState(StateSet.NOTHING);
                                }
                                n1Var2.f22335f.c(false);
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
                    ArrayList arrayList4 = r1Var.f22869g;
                    if (arrayList4 != null && arrayList4.size() > 1) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= r1Var.f22869g.size()) {
                                break;
                            }
                            n1 n1Var3 = (n1) r1Var.f22869g.get(i12);
                            dc dcVar2 = n1Var3.f22335f;
                            if (dcVar2 != null && dcVar2.f25465i) {
                                y yVar3 = n1Var3.f22336g;
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

    public final String L1(kj kjVar) {
        if (this.f22806z5) {
            String M0 = dd.M0("PsaMessage_" + kjVar.f16690k.fwd_from.psa_type);
            if (M0 == null) {
                return dd.L0(2131746610, "PsaMessageDefault");
            }
            return M0;
        }
        return dd.L0(2131750567, null);
    }

    public final boolean L2() {
        kj kjVar = this.O5;
        wv wvVar = kjVar.f16738w2;
        if (kjVar.D == 36 && wvVar != null) {
            ArrayList arrayList = wvVar.f19333g;
            if (arrayList.size() == 1 && (arrayList.get(0) instanceof hl0)) {
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
        kj kjVar = this.O5;
        int i18 = kjVar.D;
        float f13 = 0.0f;
        x1 x1Var = this.gb;
        int i19 = 0;
        boolean z10 = true;
        if (i18 != 1 && i18 != 20 && this.K1 != 4 && i18 != 8 && i18 != 23) {
            float f14 = 10.0f;
            float f15 = 11.0f;
            if (this.Q1) {
                int i20 = this.L6;
                if (!kjVar.P3()) {
                    f15 = 17.0f;
                }
                this.f22690q3 = org.telegram.messenger.i0.L(f15) + i20 + this.f22679p3;
                int i21 = this.f22738u0 - this.f22715s3;
                if (this.I) {
                    f14 = 9.0f;
                }
                int L2 = ((i21 - org.telegram.messenger.i0.L(f14)) - this.U1) - org.telegram.messenger.i0.L(17.0f);
                if (this.f22757v7 && this.D8 != 3) {
                    i17 = getCommentButtonHeight();
                } else {
                    i17 = 0;
                }
                L = L2 - i17;
                this.f22702r3 = org.telegram.messenger.i0.T1(L, org.telegram.messenger.i0.L(9.0f) + this.Sa, U2());
            } else {
                if (this.f22773wb) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.O5.P3()) {
                        i16 = 0;
                    } else {
                        i16 = 6;
                    }
                    this.f22690q3 = org.telegram.messenger.i0.L(i16 + 11) + backgroundDrawableLeft;
                } else {
                    int i22 = this.L6;
                    if (!kjVar.P3() && !this.A6 && !this.J) {
                        f15 = 17.0f;
                    }
                    this.f22690q3 = org.telegram.messenger.i0.L(f15) + i22 + this.f22679p3;
                }
                int i23 = this.f22738u0 - this.f22715s3;
                if (this.I) {
                    f14 = 9.0f;
                }
                int L3 = i23 - org.telegram.messenger.i0.L(f14);
                if (this.f22757v7 && this.D8 != 3) {
                    i14 = getCommentButtonHeight();
                } else {
                    i14 = 0;
                }
                int i24 = L3 - i14;
                sg.p0 p0Var = this.N;
                if (!p0Var.f48461p) {
                    i15 = p0Var.f48459n;
                } else {
                    i15 = 0;
                }
                L = i24 - i15;
                this.f22702r3 = org.telegram.messenger.i0.T1(L, org.telegram.messenger.i0.L(9.0f) + this.Sa, U2());
            }
        } else {
            if (x1Var.f23484g0) {
                f10 = x1Var.f23516n0;
                f11 = x1Var.f23520o0;
                f7 = x1Var.f23528q0;
            } else {
                ag.c2 c2Var = this.T0;
                float f16 = c2Var.K0;
                float f17 = c2Var.L0;
                f7 = c2Var.N0;
                f10 = f16;
                f11 = f17;
            }
            this.f22690q3 = f10 + org.telegram.messenger.i0.L(5.0f) + this.f22679p3;
            if (r2()) {
                float compactLeft = getCompactLeft() - getExtraTextX();
                if (q2()) {
                    f12 = this.f22498ad;
                } else if (this.K != null && this.L != null) {
                    f12 = getLeft();
                } else {
                    f12 = 0.0f;
                }
                this.f22690q3 = compactLeft - f12;
            }
            L = f11 + f7 + org.telegram.messenger.i0.L(6.0f);
            float L4 = f7 + org.telegram.messenger.i0.L(6.0f);
            ij ijVar = this.f22616k3;
            if (ijVar == null) {
                i10 = 0;
            } else {
                i10 = -ijVar.b();
            }
            this.f22702r3 = org.telegram.messenger.i0.T1(L4, i10 - org.telegram.messenger.i0.L(4.0f), U2()) + f11;
            z10 = false;
        }
        this.f22690q3 += getExtraTextX();
        kj kjVar2 = this.O5;
        if (kjVar2 != null && (i11 = kjVar2.D) != 0 && i11 != 24 && !kjVar2.v3() && !this.O5.r4()) {
            if (z10 && d2()) {
                this.f22702r3 -= (1.0f - U2()) * (org.telegram.messenger.i0.L(16.0f) + this.f22699r0.f22980r);
            }
            if (z10) {
                s1 s1Var = this.f22699r0;
                if (s1Var != null) {
                    i13 = s1Var.f22980r;
                } else {
                    i13 = 0;
                }
                i12 = org.telegram.messenger.i0.L(14.0f) + i13;
            } else {
                i12 = 0;
            }
            float f18 = L - i12;
            ij ijVar2 = this.f22616k3;
            if (ijVar2 != null) {
                i19 = org.telegram.messenger.i0.L(4.0f) + ijVar2.c(x1Var);
            }
            this.f22687q0 = (int) ((f18 + org.telegram.messenger.i0.W1(U2(), i19, org.telegram.messenger.i0.L(6.0f))) - x1Var.f23503k0);
        }
        kj kjVar3 = this.O5;
        if (kjVar3 != null && kjVar3.D == 17) {
            float f19 = this.f22702r3;
            w1 w1Var = this.f22752v2;
            if (w1Var != null) {
                f13 = w1Var.f23366q;
            }
            this.f22702r3 = f19 + f13;
        }
    }

    public final boolean M(MotionEvent motionEvent) {
        float f7;
        l1 l1Var;
        kj kjVar = this.O5;
        if (kjVar == null || kjVar.M0() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f10 = 0.0f;
        if (this.f22588i0 == 0) {
            f7 = 0.0f;
        } else {
            f7 = 18.0f;
        }
        float L = timeX - org.telegram.messenger.i0.L(f7);
        float f11 = this.f22797y9;
        if (this.O5.f16748z0) {
            f10 = 1.0f - this.f22592i4;
        }
        int L2 = ((int) ((f11 * f10) + L)) - org.telegram.messenger.i0.L(2.0f);
        int timeY = ((int) getTimeY()) - org.telegram.messenger.i0.L(2.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(L2, timeY, org.telegram.messenger.i0.L(16.0f) + L2 + this.f22797y9, org.telegram.messenger.i0.L(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), K1(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.f22613k0 == null) {
                    this.f22613k0 = new dc(this);
                }
                this.f22539dc = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.f22539dc = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.f22539dc && (l1Var = this.Qa) != null) {
                l1Var.H(this);
            }
            this.f22539dc = false;
        } else if (motionEvent.getAction() == 3) {
            this.f22539dc = false;
        }
        dc dcVar = this.f22613k0;
        if (dcVar != null) {
            dcVar.c(this.f22539dc);
        }
        return this.f22539dc;
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
        sh0 sh0Var;
        float f10;
        if (!this.f22601j1 && this.f22769w6) {
            int i10 = this.f22782x6;
            if (i10 >= 300) {
                f10 = 1.0f;
            } else {
                f10 = i10 / 300.0f;
            }
            f7 = f10 * 1.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10 && (sh0Var = this.f22639m3) != null) {
            return (1.0f - sh0Var.f30298k.e(false, 1.0f)) * f7;
        }
        return f7;
    }

    public final boolean M2() {
        hl0 X3 = X3();
        if (X3 != null) {
            long j10 = this.Yb;
            long j11 = 0;
            if (j10 != 0) {
                r81 r81Var = X3.f26820d0;
                if (r81Var != null) {
                    j11 = r81Var.f29956t;
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
            wp r12 = wp.r1(i10);
            TLRPC.MessageFwdHeader messageFwdHeader = this.O5.f16690k.fwd_from;
            long e = e20.i(i10).e();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (kj.B0(this.O5.f16690k) == e || kj.B0(this.O5.f16690k) == 1271266957)) {
                this.ia = wp.r1(i10).L0(Long.valueOf(messageFwdHeader.from_id.channel_id));
            } else if (messageFwdHeader != null && kj.B0(this.O5.f16690k) == 489000) {
                long o10 = org.telegram.messenger.o5.o(messageFwdHeader.from_id);
                if (o10 >= 0) {
                    this.ha = r12.Z1(Long.valueOf(o10));
                } else {
                    this.ia = r12.L0(Long.valueOf(-o10));
                }
            } else if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
                long j10 = peer.user_id;
                if (j10 != 0) {
                    if (!this.f22559f6) {
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
            } else if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || kj.B0(this.O5.f16690k) == e)) {
                this.ha = r12.Z1(Long.valueOf(messageFwdHeader.from_id.user_id));
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || kj.B0(this.O5.f16690k) == e)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.ha = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || kj.B0(this.O5.f16690k) == e)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.ha = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long B0 = kj.B0(this.O5.f16690k);
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
                if (org.telegram.messenger.o5.C(kj.B0(this.O5.f16690k))) {
                    if (this.O5.P3()) {
                        this.ha = e20.i(i10).f();
                        return;
                    }
                    TLRPC.EncryptedChat Z02 = r12.Z0(Integer.valueOf((int) (kj.B0(this.O5.f16690k) & 4294967295L)));
                    if (Z02 != null) {
                        this.ha = r12.Z1(Long.valueOf(Z02.user_id));
                    }
                } else if (org.telegram.messenger.o5.E(Z0) && (!this.O5.f16690k.post || (chat != null && chat.signature_profiles))) {
                    this.ha = r12.Z1(Long.valueOf(Z0));
                } else if (this.O5.f16690k.post && chat2 != null && !chat2.signature_profiles) {
                    this.ia = chat2;
                } else if (org.telegram.messenger.o5.z(Z0)) {
                    this.ia = chat;
                } else {
                    TLRPC.Message message = this.O5.f16690k;
                    if (message.post) {
                        this.ia = r12.L0(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    @Override
    public final void N(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.N(java.lang.String):void");
    }

    public final boolean N0(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        kj kjVar;
        l1 l1Var;
        String str;
        boolean c10 = sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        int i10 = 1;
        int i11 = this.Y5;
        if (!c10 && !sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                rz C = rz.C(i11);
                kj kjVar2 = this.O5;
                if (kjVar2 != null && keyboardButtonProto != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(kj.B0(kjVar2.f16690k));
                    sb2.append("_");
                    sb2.append(kjVar2.f1());
                    sb2.append("_");
                    sb2.append(Utilities.f(keyboardButtonProto.getData()));
                    sb2.append("_");
                    if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    sb2.append(str);
                    return C.f18008n.containsKey(sb2.toString());
                }
            } else {
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (tL_inlineButtonTypeUrl != null && (l1Var = this.Qa) != null && l1Var.k1(this, 3) && TextUtils.equals(this.Qa.h(this), tL_inlineButtonTypeUrl.url)) {
                    return true;
                }
            }
        } else {
            rz C2 = rz.C(i11);
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
                return C2.f18009r.containsKey(kj.B0(kjVar.f16690k) + "_" + kjVar.f1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i10);
            }
        }
        return false;
    }

    public final void N2(int i10, int i11) {
        cj cjVar = this.L;
        float f7 = cjVar.f15172r;
        float f10 = cjVar.f15174t;
        this.Zc = f7 - f10;
        this.f22498ad = f10;
        this.f22512bd = (int) cjVar.f15173s;
        this.f22526cd = (int) ((i10 * cjVar.f15175u) / (i11 / 1000.0f));
    }

    public final void N3() {
        Window window;
        if (this.f22635lb == null) {
            Activity W = org.telegram.messenger.i0.W(getContext());
            if (W == null) {
                window = null;
            } else {
                window = W.getWindow();
            }
            if (window != null) {
                org.telegram.messenger.o6 o6Var = new org.telegram.messenger.o6(window, new ca(this, 3));
                this.f22635lb = o6Var;
                if (this.N0) {
                    o6Var.a();
                }
            }
        }
        org.telegram.messenger.o6 o6Var2 = this.f22635lb;
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
            q1 q1Var = B1.f23066a;
            boolean z10 = q1Var.R1;
            ArrayList arrayList = q1Var.G5;
            ji.a aVar = q1Var.f22716s4;
            if (z10) {
                int x10 = (int) motionEvent.getX();
                int K1 = (int) q1Var.K1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    if (q1Var.M1 && q1Var.f22764w1 && q1Var.M3 != -1 && x10 >= (i11 = q1Var.I3) && x10 <= org.telegram.messenger.i0.L(48.0f) + i11 && K1 >= (i12 = q1Var.J3) && K1 <= org.telegram.messenger.i0.L(48.0f) + i12 && q1Var.P0.f24129i.f27048q != 4) {
                        q1Var.N3 = 1;
                        q1Var.invalidate();
                        return true;
                    } else if (q1Var.M1 && q1Var.T0.O(x10, K1)) {
                        B1.v = true;
                        return true;
                    } else if (q1Var.f22652n2 == null || K1 < q1Var.W1) {
                        return false;
                    } else {
                        try {
                            int L = x10 - ((q1Var.f22663o0 + org.telegram.messenger.i0.L(10.0f)) + q1Var.Y1);
                            int i13 = K1 - q1Var.W1;
                            int lineForVertical = q1Var.f22652n2.getLineForVertical(i13);
                            float f7 = L;
                            int offsetForHorizontal = q1Var.f22652n2.getOffsetForHorizontal(lineForVertical, f7);
                            float lineLeft = q1Var.f22652n2.getLineLeft(lineForVertical);
                            if (lineLeft > f7 || lineLeft + q1Var.f22652n2.getLineWidth(lineForVertical) < f7) {
                                return false;
                            }
                            Spannable spannable = (Spannable) q1Var.O5.f16743y;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length == 0) {
                                return false;
                            }
                            if (((clickableSpanArr[0] instanceof c51) && !c51.h) || org.telegram.messenger.i0.C1()) {
                                return false;
                            }
                            q80 q80Var = q1Var.f22680p4;
                            if (q80Var == null || q80Var.f29671i != clickableSpanArr[0]) {
                                aVar.m(q80Var, true);
                                q80 q80Var2 = new q80(clickableSpanArr[0], q1Var.Ob, f7, i13, 0);
                                q1Var.f22680p4 = q80Var2;
                                if (q1Var.O5.P3()) {
                                    i10 = org.telegram.ui.ActionBar.t6.Ac;
                                } else {
                                    i10 = org.telegram.ui.ActionBar.t6.f21337ze;
                                }
                                q80Var2.d(org.telegram.ui.ActionBar.t6.w0(i10, q1Var.Ob));
                                q1Var.f22776x0 = -10;
                                q1Var.f22729t4 = 2;
                                try {
                                    k80 b10 = q1Var.f22680p4.b();
                                    int[] U1 = U1(spannable, q1Var.f22680p4.f29671i);
                                    b10.d(q1Var.f22652n2, U1[0], 0.0f);
                                    q1Var.f22652n2.getSelectionPath(U1[0], U1[1], b10);
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                }
                                aVar.b(q1Var.f22680p4, 2);
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
                    if (q1Var.f22729t4 != 2 && !B1.v && q1Var.N3 == 0) {
                        q1Var.b3(2);
                        return false;
                    } else if (q1Var.N3 != 0) {
                        q1Var.N3 = 0;
                        q1Var.playSoundEffect(0);
                        q1Var.C0(false);
                        q1Var.invalidate();
                        return false;
                    } else {
                        q80 q80Var3 = q1Var.f22680p4;
                        if (q80Var3 != null) {
                            CharacterStyle characterStyle = q80Var3.f29671i;
                            if (characterStyle instanceof URLSpan) {
                                gf.f.r(q1Var.getContext(), ((URLSpan) q1Var.f22680p4.f29671i).getURL());
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
                            if (sf.c.c(c0Var.f21759i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                q1Var.playSoundEffect(0);
                                q1Var.Qa.W0(q1Var, c0Var.f21759i);
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
            TLRPC.User Z1 = wp.r1(i11).Z1(Long.valueOf(j10));
            if (Z1 != null) {
                return i20.p(Z1);
            }
            return null;
        } else if (i10 < 0 && (L0 = wp.r1(i11).L0(Long.valueOf(-j10))) != null) {
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
        kj kjVar = this.O5;
        if (kjVar != null) {
            j1 j1Var = this.Nb;
            if (j1Var != null && j1Var.rewindCount != 0 && j1Var.rewindByBackSeek) {
                kjVar.f16652b0 = j1Var.getVideoProgress();
            }
            boolean z11 = true;
            if (this.O5.T3()) {
                w1 w1Var = this.f22752v2;
                if (w1Var != null && (hVar2 = w1Var.f23362m) != null) {
                    hVar2.p(true);
                }
                w1 w1Var2 = this.f22752v2;
                if (w1Var2 != null && (hVar = w1Var2.f23363n) != null) {
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
                if (this.f22753v3 != null) {
                    if (!PhotoViewer.N1(this.O5)) {
                        if (MediaController.B().f14485v0 == this.O5) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.s5 m10 = this.T0.m();
                if (m10 != null) {
                    kj kjVar2 = this.O5;
                    int i12 = m10.d[4] / 1000;
                    kjVar2.f16679h0 = i12;
                    d11 = i12;
                    TLRPC.Message message = kjVar2.f16690k;
                    if (message.ttl > 0 && message.destroyTime == 0 && !kjVar2.m5() && kj.L4(this.O5.f16690k) && m10.s()) {
                        this.Qa.O(this.O5);
                    }
                } else {
                    d11 = 0.0d;
                }
                if (d11 == 0.0d) {
                    d11 = this.O5.L0();
                }
                if (MediaController.B().I(this.O5)) {
                    d11 -= this.O5.f16652b0 * d11;
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
                    this.f22753v3 = new StaticLayout(g02, org.telegram.ui.ActionBar.t6.C2, this.A3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.K4 = d11;
                    return;
                }
                return;
            }
            boolean z12 = this.f22773wb;
            rn0 rn0Var = this.C4;
            if (z12) {
                if (this.A4) {
                    if (!rn0Var.f30030f) {
                        rn0Var.g(true, this.O5.f16652b0);
                    }
                } else {
                    if (!i1Var.e) {
                        i1Var.h(this.O5.f16652b0);
                        i1Var.f28223q = this.O5.f16665e0;
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
                long j10 = this.f22648mc;
                if (j10 >= 0) {
                    d10 = j10;
                } else if (MediaController.B().I(this.O5)) {
                    d10 = Math.max(0.0d, d10 - this.O5.f16675g0);
                }
                if (this.K4 != d10) {
                    this.K4 = d10;
                    String g03 = org.telegram.messenger.i0.g0((int) d10, true, false);
                    this.L4 = (int) Math.ceil(org.telegram.ui.ActionBar.t6.T2.measureText(g03));
                    this.J4 = new StaticLayout(g03, org.telegram.ui.ActionBar.t6.T2, this.L4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float f7 = this.O5.f16652b0;
                if (f7 != 0.0f) {
                    this.Ib = f7;
                    if (f7 > 0.9f) {
                        this.Ib = 1.0f;
                    }
                }
                invalidate();
            } else if (this.L1 != null) {
                if (this.A4) {
                    if (!rn0Var.f30030f) {
                        rn0Var.g(true, this.O5.f16652b0);
                    }
                    z10 = true;
                } else {
                    if (!i1Var.e) {
                        i1Var.h(this.O5.f16652b0);
                        i1Var.f28223q = this.O5.f16665e0;
                    }
                    i1Var.j(this.O5);
                    z10 = false;
                }
                int i14 = this.K1;
                if (i14 == 5) {
                    z10 = true;
                }
                if (i14 == 3) {
                    long j11 = this.f22648mc;
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
                        d = this.O5.f16675g0;
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
                        i11 = this.O5.f16675g0;
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

    public final void P0(android.graphics.Canvas r21, org.telegram.messenger.ij r22, boolean r23, boolean r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.P0(android.graphics.Canvas, org.telegram.messenger.ij, boolean, boolean, float):void");
    }

    public final float P1(boolean z10) {
        boolean z11;
        gr grVar;
        float f7 = this.Tc;
        kj kjVar = this.O5;
        if (kjVar != null && !kjVar.P3()) {
            int i10 = 0;
            if (z10 && ((z11 = this.f22637m1) || this.f22651n1)) {
                if (z11) {
                    grVar = gr.f26524g;
                } else {
                    grVar = gr.f26525i;
                }
                this.f22688q1 = (int) Math.ceil(grVar.getInterpolation(this.f22664o1) * org.telegram.messenger.i0.L(35.0f));
                if (this.O5.D == 36) {
                    if (org.telegram.messenger.i0.L(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                        this.f22688q1 = 0;
                    }
                }
            }
            f7 += this.f22688q1;
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
                currentBackgroundLeft2 = (int) (this.L6 + x1Var.f23488h0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            this.f22650n0 = getExtraTextX() + org.telegram.messenger.i0.L(11.0f) + currentBackgroundLeft2;
        } else {
            if (z10) {
                currentBackgroundLeft = (int) (this.L6 + x1Var.f23488h0);
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
            this.f22650n0 = getExtraTextX() + currentBackgroundLeft + L;
        }
        float f11 = 4.0f;
        if (this.R1) {
            this.f22650n0 = org.telegram.messenger.i0.L(11.0f) + this.f22650n0;
            int L3 = org.telegram.messenger.i0.L(14.0f) + this.Sa;
            this.f22725t0 = L3;
            StaticLayout staticLayout = this.f22543e2;
            if (staticLayout != null) {
                this.f22725t0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + L3;
            }
        } else if (this.S1) {
            int L4 = org.telegram.messenger.i0.L(14.0f) + this.Sa;
            this.f22725t0 = L4;
            StaticLayout staticLayout2 = this.f22543e2;
            if (staticLayout2 != null) {
                this.f22725t0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L4;
            }
        } else if (this.O5.D == 19) {
            this.f22725t0 = org.telegram.messenger.i0.L(6.0f) + this.Sa;
            if (!this.O5.N3()) {
                this.f22650n0 = getCurrentBackgroundLeft();
            } else {
                this.f22650n0 -= org.telegram.messenger.i0.L(4.0f);
            }
        } else {
            int L5 = org.telegram.messenger.i0.L(8.0f) + this.Sa;
            this.f22725t0 = L5;
            kj kjVar = this.O5;
            float f12 = 2.0f;
            if (kjVar.D == 36) {
                if (this.f22739u1 && this.f22616k3 != null && L2()) {
                    this.f22725t0 = org.telegram.messenger.m5.C(7.0f, this.f22616k3.b(), this.f22725t0);
                } else {
                    wv wvVar = this.O5.f16738w2;
                    if (wvVar != null && wvVar.Y()) {
                        int i12 = this.f22725t0;
                        if (this.Sa <= 0) {
                            f12 = -3.0f;
                        }
                        this.f22725t0 = org.telegram.messenger.i0.L(f12) + i12;
                    }
                }
            } else {
                if (kjVar.C2 && (i10 = uz.Y0) > 10) {
                    if (i10 < 15) {
                        f12 = 1.0f;
                    }
                    this.f22725t0 = org.telegram.messenger.i0.L(f12) + L5;
                }
                if (this.O5.C2 && this.Sa > 0) {
                    this.f22725t0 = org.telegram.messenger.i0.L(5.0f) + this.f22725t0;
                }
            }
        }
        if (this.O5.r4()) {
            this.f22676p0 = org.telegram.messenger.i0.L(14.0f) + this.f22725t0;
        } else if (this.f22726t1) {
            this.f22676p0 = org.telegram.messenger.i0.L(10.0f) + this.f22725t0;
            this.f22725t0 = org.telegram.messenger.m5.C(13.0f, this.U1, this.f22725t0);
            if (this.f22714s2 && !this.S1 && !this.O5.v3()) {
                this.f22725t0 = org.telegram.messenger.i0.L(44.0f) + this.f22725t0;
            }
        } else {
            this.f22676p0 = org.telegram.messenger.i0.L(10.0f) + this.O5.U5(x1Var) + this.f22725t0;
        }
        if (this.f22726t1) {
            L2 = org.telegram.messenger.i0.L(10.0f) + this.O5.U5(x1Var) + this.f22725t0;
        } else {
            int i13 = this.f22676p0 + this.U1;
            if (this.f22714s2) {
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
        this.f22687q0 = L2;
        this.f22663o0 = this.f22650n0;
        if (this.O5.f16734v2 != 0.0f && this.O7 != null) {
            int L7 = this.Z6 - org.telegram.messenger.i0.L(31.0f);
            kj kjVar2 = this.O5;
            int i14 = L7 - kjVar2.f16727t2;
            if (!this.f22492a7) {
                int i15 = this.f22797y9;
                if (kjVar2.P3()) {
                    i11 = 20;
                }
                i14 = a30.w(i11 + 4, i15, i14);
            }
            if (i14 > 0) {
                this.f22650n0 = (i14 - getExtraTimeX()) + this.f22650n0;
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
        if ((!this.f22756v6 && !this.f22744u6 && !isPressed()) || (this.M1 && this.T0.I())) {
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
        kj kjVar;
        float f7;
        kj kjVar2 = this.O5;
        if ((kjVar2 == null || !kjVar2.r4()) && (kjVar = this.O5) != null && !kjVar.o4()) {
            kj kjVar3 = this.O5;
            if (kjVar3.D != 27 && !kjVar3.n4() && this.l1 != null) {
                if (this.f22637m1 || this.f22651n1) {
                    cj cjVar = this.L;
                    if (cjVar != null) {
                        int i10 = cjVar.f15166l;
                        if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                            return;
                        }
                    }
                    canvas.save();
                    float y3 = getY() + getPaddingTop();
                    fj fjVar = this.K;
                    if (fjVar != null && fjVar.d.size() > 1) {
                        f7 = (getTop() + this.K.f15744m.f15574f) - getTranslationY();
                    } else {
                        f7 = y3 + this.gb.f23503k0;
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
        kj kjVar = this.O5;
        if (kjVar != null && kjVar.D == 17) {
            if (i10 == -2) {
                w1 w1Var = this.f22752v2;
                if (w1Var != null && (hVar2 = w1Var.f23362m) != null) {
                    return hVar2.f8541b;
                }
                return null;
            } else if (i10 == -3) {
                w1 w1Var2 = this.f22752v2;
                if (w1Var2 != null && (hVar = w1Var2.f23363n) != null) {
                    return hVar.f8541b;
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
                        kh.b bVar = p1Var.f22441x;
                        if (bVar != null && (pollAnswer = p1Var.f22437s) != null && pollAnswer.unshuffled_index == i10) {
                            return bVar.f11376c;
                        }
                    }
                }
            }
        }
        n4 n4Var = this.V5;
        if (n4Var != null) {
            ArrayList arrayList2 = n4Var.f22340c;
            l4 l4Var = n4Var.f22339b;
            if (l4Var != null && i10 >= 0 && i10 < l4Var.f22232a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) n4Var.f22339b.f22232a.get(i10);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((m4) arrayList2.get(i12)).E == messageExtendedMedia) {
                        return ((m4) arrayList2.get(i12)).f22304f;
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
        if (!p0Var.f48461p) {
            cj cjVar = this.L;
            if (cjVar != null) {
                int i12 = cjVar.f15166l;
                if ((i12 & 8) == 0 || (i12 & 1) == 0) {
                    return;
                }
            }
            kj kjVar = this.O5;
            int i13 = 0;
            if (kjVar.D != 19 && !kjVar.G2() && !this.O5.M2()) {
                float f11 = 11.0f;
                if (this.O5.P3()) {
                    p0Var.f48450b = org.telegram.messenger.i0.L(11.0f) + getCurrentBackgroundLeft();
                } else if (this.f22773wb) {
                    int L = org.telegram.messenger.i0.L(11.0f) + getCurrentBackgroundLeft();
                    if (!this.J) {
                        i11 = 6;
                    } else {
                        i11 = 0;
                    }
                    int L2 = org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(getVideoTranscriptionProgress(), 0, i11)) + L;
                    p0Var.f48450b = L2;
                    p0Var.f48450b = L2 - ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.i0.L(9.0f)));
                } else {
                    int L3 = org.telegram.messenger.i0.L((this.A6 || !this.J) ? 17.0f : 17.0f) + getCurrentBackgroundLeft();
                    p0Var.f48450b = L3;
                    if (this.A6) {
                        p0Var.f48450b = L3 - org.telegram.messenger.i0.L(9.0f);
                    }
                }
            } else if (this.O5.P3()) {
                p0Var.f48450b = (getMeasuredWidth() - p0Var.f48460o) - org.telegram.messenger.i0.L(16.0f);
            } else {
                p0Var.f48450b = getCurrentBackgroundLeft();
            }
            if (r2()) {
                float compactLeft = getCompactLeft();
                if (q2()) {
                    f10 = this.f22498ad;
                } else if (this.K != null && this.L != null) {
                    f10 = getLeft();
                } else {
                    f10 = 0.0f;
                }
                p0Var.f48450b = (int) (compactLeft - f10);
            }
            if (!this.O5.P3() && this.L != null && !r2()) {
                float f12 = p0Var.f48450b;
                if (V2()) {
                    i10 = 48;
                } else {
                    i10 = 0;
                }
                p0Var.f48450b = (int) (f12 - (org.telegram.messenger.i0.L(64 - i10) * this.X6));
            }
            int backgroundDrawableBottom = (getBackgroundDrawableBottom() - org.telegram.messenger.i0.L(10.0f)) - p0Var.f48458m;
            p0Var.f48451c = backgroundDrawableBottom;
            if (this.f22757v7) {
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
            p0Var.f48451c = i14;
            if (this.f22492a7 && (!this.f22695q9 || !this.P1 || this.K1 != 3)) {
                p0Var.f48451c = i14 - org.telegram.messenger.i0.L(16.0f);
            }
            kj kjVar2 = this.O5;
            int i15 = kjVar2.D;
            if (i15 != 9 && this.f22616k3 != null && ((i15 != 2 && i15 != 17 && (!kjVar2.N3() || !this.f22695q9 || this.M1)) || ((this.L != null && this.K != null) || this.O5.D == 29))) {
                p0Var.f48451c -= org.telegram.messenger.i0.L(14.0f);
            }
            p0Var.f48451c += p0Var.f48456k;
        }
    }

    public final boolean R(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        int i12;
        kj kjVar;
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
        kj kjVar2;
        int i19 = this.O5.D;
        if ((i19 == 0 || i19 == 24) && this.P1) {
            t1 B1 = B1();
            q1 q1Var = B1.f23066a;
            kj kjVar3 = q1Var.O5;
            RadialProgress2 radialProgress2 = q1Var.P0;
            ji.a aVar = q1Var.f22716s4;
            ag.c2 c2Var = q1Var.T0;
            int[] iArr = q1Var.L2;
            Drawable[] drawableArr = q1Var.H2;
            int i20 = kjVar3.D;
            if ((i20 == 0 || i20 == 24) && q1Var.P1) {
                int x10 = (int) motionEvent.getX();
                int K1 = (int) q1Var.K1(motionEvent);
                int i21 = q1Var.f22663o0;
                if (x10 >= i21 && x10 <= (i21 + q1Var.Z6) - org.telegram.messenger.i0.L(14.0f) && K1 >= (i10 = q1Var.f22676p0)) {
                    int i22 = i10 + q1Var.U1;
                    if (q1Var.f22714s2) {
                        i11 = 46;
                    } else {
                        i11 = 0;
                    }
                    if (K1 <= org.telegram.messenger.i0.L(i11 + 8) + i22) {
                        if (motionEvent.getAction() == 0) {
                            if (q1Var.f22652n2 != null && K1 >= q1Var.W1 && !q1Var.O5.f16718r1) {
                                try {
                                    int L3 = x10 - ((q1Var.f22663o0 + org.telegram.messenger.i0.L(10.0f)) + q1Var.Y1);
                                    int i23 = K1 - q1Var.W1;
                                    if (i23 <= q1Var.f22652n2.getHeight()) {
                                        int lineForVertical = q1Var.f22652n2.getLineForVertical(i23);
                                        float f7 = L3;
                                        int offsetForHorizontal = q1Var.f22652n2.getOffsetForHorizontal(lineForVertical, f7);
                                        float lineLeft = q1Var.f22652n2.getLineLeft(lineForVertical);
                                        if (lineLeft <= f7 && lineLeft + q1Var.f22652n2.getLineWidth(lineForVertical) >= f7) {
                                            if (q1Var.O5.r4()) {
                                                charSequence = q1Var.O5.v;
                                            } else {
                                                charSequence = q1Var.O5.f16743y;
                                            }
                                            Spannable spannable = (Spannable) charSequence;
                                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                            if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[0] instanceof c51) || c51.h) && !org.telegram.messenger.i0.C1())) {
                                                q80 q80Var = q1Var.f22680p4;
                                                if (q80Var == null || q80Var.f29671i != clickableSpanArr[0]) {
                                                    aVar.m(q80Var, true);
                                                    q80 q80Var2 = new q80(clickableSpanArr[0], q1Var.Ob, x10, K1, 0);
                                                    q1Var.f22680p4 = q80Var2;
                                                    if (q1Var.P1 && q1Var.f22644m8 != null && (kjVar2 = q1Var.O5) != null && !kjVar2.P3()) {
                                                        w02 = org.telegram.ui.ActionBar.t6.r1(0.1f, q1Var.f22644m8.i());
                                                    } else {
                                                        if (q1Var.O5.P3()) {
                                                            i18 = org.telegram.ui.ActionBar.t6.Ac;
                                                        } else {
                                                            i18 = org.telegram.ui.ActionBar.t6.f21337ze;
                                                        }
                                                        w02 = org.telegram.ui.ActionBar.t6.w0(i18, q1Var.Ob);
                                                    }
                                                    q80Var2.d(w02);
                                                    q1Var.f22776x0 = -10;
                                                    q1Var.f22729t4 = 2;
                                                    q1Var.w();
                                                    try {
                                                        k80 b10 = q1Var.f22680p4.b();
                                                        int[] U1 = U1(spannable, q1Var.f22680p4.f29671i);
                                                        b10.d(q1Var.f22652n2, U1[0], 0.0f);
                                                        q1Var.f22652n2.getSelectionPath(U1[0], U1[1], b10);
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                    }
                                                    aVar.b(q1Var.f22680p4, 2);
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
                            if (q1Var.f22680p4 == null) {
                                int L4 = org.telegram.messenger.i0.L(48.0f);
                                if (q1Var.V3 >= 0 && x10 >= (L2 = q1Var.I3 + (L = org.telegram.messenger.i0.L(27.0f))) && x10 <= L2 + L4 && K1 >= (i17 = q1Var.J3 + L) && K1 <= i17 + L4) {
                                    q1Var.P3 = 1;
                                    q1Var.invalidate();
                                    return true;
                                }
                                if (q1Var.f22777x1 && q1Var.M3 != -1 && x10 >= (i15 = q1Var.K3)) {
                                    if (x10 <= Math.max(q1Var.A3, q1Var.f22530d3) + org.telegram.messenger.i0.L(34.0f) + i15 && K1 >= (i16 = q1Var.L3) && K1 <= org.telegram.messenger.i0.L(30.0f) + i16) {
                                        q1Var.O3 = 1;
                                        q1Var.invalidate();
                                        return true;
                                    }
                                }
                                if ((q1Var.M1 && q1Var.O5.Y0 != null && c2Var.O(x10, K1)) || (q1Var.M1 && q1Var.f22764w1 && ((q1Var.M3 != -1 || q1Var.K1 == 4) && ((!q1Var.H3 && c2Var.O(x10, K1)) || (x10 >= (i13 = q1Var.I3) && x10 <= org.telegram.messenger.i0.L(48.0f) + i13 && K1 >= (i14 = q1Var.J3) && K1 <= org.telegram.messenger.i0.L(48.0f) + i14 && radialProgress2.f24129i.f27048q != 4))))) {
                                    q1Var.N3 = 1;
                                    q1Var.invalidate();
                                    TLRPC.MessageMedia messageMedia = q1Var.O5.Y0;
                                    if (messageMedia == null) {
                                        return true;
                                    }
                                    if (!kj.s3(messageMedia.document, false) && q1Var.O5.Y0.photo == null) {
                                        return true;
                                    }
                                    Drawable drawable = drawableArr[0];
                                    if (drawable != null && drawable.getBounds().contains(x10, K1)) {
                                        drawableArr[0].setHotspot(x10, K1);
                                        drawableArr[0].setState(iArr);
                                    }
                                    y yVar = B1.f23085x;
                                    if (yVar != null && yVar.getBounds().contains(x10, K1)) {
                                        B1.f23085x.setHotspot(x10, K1);
                                        B1.f23085x.setState(iArr);
                                    }
                                    q1Var.setInstantButtonPressed(true);
                                    dc dcVar = B1.f23084w;
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
                                y yVar2 = B1.f23085x;
                                if (yVar2 != null && yVar2.getBounds().contains(x10, K1)) {
                                    B1.f23085x.setHotspot(x10, K1);
                                    B1.f23085x.setState(iArr);
                                }
                                q1Var.setInstantButtonPressed(true);
                                dc dcVar2 = B1.f23084w;
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
                                    } else if (!q1Var.f22714s2 && ((kjVar = q1Var.O5) == null || (tL_channelAdminLogEvent = kjVar.J1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage))) {
                                        if (q1Var.M1 && (i24 == 2 || i24 == 4 || (B1.f23071i == null && q1Var.f22638m2 == null && q1Var.f22652n2 == null && q1Var.f22543e2 == null))) {
                                            l1 l1Var = q1Var.Qa;
                                            if (l1Var != null) {
                                                l1Var.s0(q1Var, q1Var.f22566g1, q1Var.f22577h1, true);
                                            }
                                        } else if (kjVar != null && !kjVar.f16718r1) {
                                            TLRPC.WebPage webPage = kj.o1(kjVar.f16690k).webpage;
                                            if (webPage != null && !TextUtils.isEmpty(webPage.embed_url)) {
                                                l1 l1Var2 = q1Var.Qa;
                                                if (l1Var2 != null) {
                                                    l1Var2.z1(q1Var.O5, webPage.embed_url, webPage.site_name, webPage.title, webPage.url, webPage.embed_width, webPage.embed_height);
                                                }
                                            } else if (webPage != null) {
                                                l1 l1Var3 = q1Var.Qa;
                                                if (l1Var3 != null) {
                                                    l1Var3.w1(q1Var, webPage, webPage.url, kj.o1(q1Var.O5.f16690k).safe);
                                                } else {
                                                    gf.f.r(q1Var.getContext(), webPage.url);
                                                }
                                            }
                                        }
                                    } else {
                                        l1 l1Var4 = q1Var.Qa;
                                        if (l1Var4 != null) {
                                            l1Var4.c1(q1Var, q1Var.f22765w2);
                                        }
                                    }
                                    q1Var.playSoundEffect(0);
                                    Drawable drawable3 = drawableArr[0];
                                    if (drawable3 != null) {
                                        drawable3.setState(StateSet.NOTHING);
                                    }
                                    y yVar3 = B1.f23085x;
                                    if (yVar3 != null) {
                                        yVar3.setState(StateSet.NOTHING);
                                    }
                                    dc dcVar3 = B1.f23084w;
                                    if (dcVar3 != null) {
                                        dcVar3.c(false);
                                    }
                                    q1Var.D2 = false;
                                    q1Var.setInstantButtonPressed(false);
                                    q1Var.invalidate();
                                } else if (q1Var.f22729t4 != 2 && q1Var.N3 == 0 && q1Var.P3 == 0 && q1Var.O3 == 0) {
                                    if (!q1Var.f22800yc) {
                                        z11 = false;
                                        q1Var.f22800yc = false;
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
                                        if (q1Var.f22777x1 || ((q1Var.M3 == -1 && q1Var.K1 == 4) || q1Var.O5.Y0 != null)) {
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
                                        q80 q80Var3 = q1Var.f22680p4;
                                        if (q80Var3 != null) {
                                            CharacterStyle characterStyle = q80Var3.f29671i;
                                            if (characterStyle instanceof URLSpan) {
                                                q1Var.Qa.L0(q1Var, characterStyle, false);
                                            } else if (characterStyle instanceof ClickableSpan) {
                                                ((ClickableSpan) characterStyle).onClick(q1Var);
                                            }
                                            q1Var.b3(2);
                                        } else {
                                            org.telegram.ui.Components.o5 o5Var = q1Var.f22667o4;
                                            if (o5Var != null && q1Var.Qa.m0(o5Var)) {
                                                q1Var.f22667o4 = null;
                                                q1Var.b3(2);
                                            } else {
                                                if (q1Var.K1 == 2 && q1Var.f22764w1) {
                                                    int i25 = q1Var.M3;
                                                    if (i25 == -1) {
                                                        int i26 = uz.f18500a;
                                                        if (tc.e(2048) && !q1Var.O5.f16681h2) {
                                                            q1Var.Qa.s0(q1Var, q1Var.f22566g1, q1Var.f22577h1, false);
                                                        } else {
                                                            i12 = 2;
                                                            q1Var.M3 = 2;
                                                            q1Var.O5.f16670f0 = 1.0f;
                                                            c2Var.f14409t0 = false;
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
                                                    kj kjVar4 = q1Var.O5;
                                                    if (!kjVar4.f16718r1) {
                                                        TLRPC.WebPage webPage2 = kj.o1(kjVar4.f16690k).webpage;
                                                        if (webPage2 != null && !TextUtils.isEmpty(webPage2.embed_url)) {
                                                            q1Var.Qa.z1(q1Var.O5, webPage2.embed_url, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_width, webPage2.embed_height);
                                                        } else {
                                                            int i27 = q1Var.M3;
                                                            if (i27 != -1 && i27 != 3) {
                                                                if (webPage2 != null) {
                                                                    l1 l1Var5 = q1Var.Qa;
                                                                    if (l1Var5 != null) {
                                                                        l1Var5.w1(q1Var, webPage2, webPage2.url, kj.o1(q1Var.O5.f16690k).safe);
                                                                    } else {
                                                                        gf.f.r(q1Var.getContext(), webPage2.url);
                                                                    }
                                                                }
                                                            } else {
                                                                q1Var.Qa.s0(q1Var, q1Var.f22566g1, q1Var.f22577h1, false);
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
                                    y yVar4 = B1.f23085x;
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
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21009hd, this.Ob);
                } else {
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.t6.Cb;
                    } else {
                        i10 = org.telegram.ui.ActionBar.t6.f21009hd;
                    }
                    w02 = org.telegram.ui.ActionBar.t6.w0(i10, this.Ob);
                }
                qb0Var.a(w02);
                if (B3()) {
                    f15 = (getPhotoBottom() + this.f22750v0) - org.telegram.messenger.i0.L(9.0f);
                } else {
                    if (!this.F && !this.E) {
                        f14 = 8.5f;
                    } else {
                        f14 = 9.5f;
                    }
                    float L2 = (f7 - org.telegram.messenger.i0.L(f14)) + f11;
                    if (this.f22773wb && !r2()) {
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
                if (!this.O5.f16710p1) {
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
            if (!this.O5.f16710p1) {
                i11 = org.telegram.messenger.i0.L(11.0f);
            }
            float f19 = f12 + i11;
            float f20 = 21.5f;
            if (B3()) {
                L = (getPhotoBottom() + this.f22750v0) - org.telegram.messenger.i0.L(21.5f);
            } else {
                if (!this.F && !this.E) {
                    f20 = 20.5f;
                }
                L = (f7 - org.telegram.messenger.i0.L(f20)) + f11;
                if (this.f22773wb) {
                    L -= (1.0f - getVideoTranscriptionProgress()) * p0Var.i(x1Var.L1);
                }
            }
            RectF rectF = this.f22489a4;
            rectF.set(f19, L, org.telegram.messenger.i0.L(14.0f) + f19, org.telegram.messenger.i0.L(14.0f) + L);
            int alpha = org.telegram.ui.ActionBar.t6.f20888b2.getAlpha();
            int i12 = (int) (f18 * 255.0f);
            org.telegram.ui.ActionBar.t6.f20888b2.setAlpha(i12);
            if (z13) {
                canvas.save();
                canvas.scale(f17, f17, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.f20888b2);
            org.telegram.ui.ActionBar.t6.f20888b2.setAlpha(alpha);
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
                int i11 = ((p1) arrayList.get(i10)).f22423b;
                int i12 = this.Sa;
                float f7 = i11 + i12;
                x1 x1Var = this.gb;
                if (x1Var.f23546u2) {
                    float f10 = x1Var.L1;
                    f7 += ((1.0f - f10) * x1Var.f23549v2) + (i12 * f10);
                    if (this.O5.n5()) {
                        f7 -= this.Sa;
                    }
                }
                if (x1Var.f23555x0) {
                    f7 += x1Var.f23503k0;
                }
                return f7 + p1Var.f22424c + org.telegram.messenger.i0.L(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void R3(kj kjVar) {
        String str;
        CharSequence concat;
        int i10;
        if (kjVar != null && kjVar.m5()) {
            int i11 = 0;
            if (!kjVar.l4()) {
                concat = null;
            } else {
                TLRPC.Message message = kjVar.f16690k;
                int i12 = message.ttl;
                if (i12 == Integer.MAX_VALUE) {
                    if (kjVar.T2 == null) {
                        kjVar.T2 = new SpannableString("v");
                        dq dqVar = new dq(2131231978, 0);
                        dqVar.f25568r = -org.telegram.messenger.i0.L(3.0f);
                        dqVar.E = org.telegram.messenger.i0.L(13.0f);
                        SpannableString spannableString = kjVar.T2;
                        spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
                    }
                    concat = TextUtils.concat(kjVar.T2, "1");
                } else {
                    int i13 = message.destroyTime;
                    if (i13 != 0) {
                        i12 = Math.max(0, i13 - ConnectionsManager.getInstance(kjVar.I1).getCurrentTime());
                    }
                    if (i12 < 60) {
                        str = a1.g.k(i12, "s");
                    } else {
                        str = (i12 / 60) + "m";
                    }
                    if (kjVar.U2 == null) {
                        kjVar.U2 = new SpannableString("p");
                        dq dqVar2 = new dq(2131232546, 0);
                        dqVar2.f25568r = org.telegram.messenger.i0.L(1.0f);
                        dqVar2.E = org.telegram.messenger.i0.L(13.0f);
                        SpannableString spannableString2 = kjVar.U2;
                        spannableString2.setSpan(dqVar2, 0, spannableString2.length(), 33);
                    }
                    concat = TextUtils.concat(kjVar.U2, str);
                }
            }
            CharSequence charSequence = concat;
            if (charSequence != null) {
                if (charSequence instanceof String) {
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.t6.C2.measureText((String) charSequence));
                    this.A3 = ceil;
                    this.f22753v3 = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.t6.C2, ceil, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.t6.C2, this.A3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else {
                    TextPaint textPaint = org.telegram.ui.ActionBar.t6.D2;
                    if (getMeasuredWidth() > 0) {
                        i10 = getMeasuredWidth();
                    } else {
                        i10 = 9999;
                    }
                    StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.f22753v3 = staticLayout;
                    if (staticLayout.getLineCount() > 0) {
                        i11 = (int) this.f22753v3.getLineWidth(0);
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
            if (this.f22631l7 != null) {
                this.Q8 -= org.telegram.messenger.i0.L(18.0f);
                L += org.telegram.messenger.i0.L(18.0f);
            }
            float f10 = this.P8;
            float f11 = this.Q8 + L;
            RectF rectF = this.f22489a4;
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
                    int alpha2 = org.telegram.ui.ActionBar.t6.f20999h2.getAlpha();
                    org.telegram.ui.ActionBar.t6.f20999h2.setAlpha((int) (alpha2 * f7));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.f20999h2);
                    org.telegram.ui.ActionBar.t6.f20999h2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.f20999h2);
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
            if (this.f22631l7 != null) {
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
                canvas.translate(this.P8 + ((org.telegram.messenger.i0.L(32.0f) - this.f22732t7) / 2), this.Q8 + org.telegram.messenger.i0.L(30.0f));
                this.f22631l7.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final float S1(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.O4;
            if (i10 < arrayList.size()) {
                int i11 = ((p1) arrayList.get(i10)).f22423b;
                int i12 = this.Sa;
                float f7 = i11 + i12;
                x1 x1Var = this.gb;
                if (x1Var.f23546u2) {
                    float f10 = x1Var.L1;
                    f7 += ((1.0f - f10) * x1Var.f23549v2) + (i12 * f10);
                    if (this.O5.n5()) {
                        f7 -= this.Sa;
                    }
                }
                if (x1Var.f23555x0) {
                    f7 += x1Var.f23503k0;
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
        boolean z10 = x1Var.f23555x0;
        i1 i1Var = this.B4;
        rn0 rn0Var = this.C4;
        float f10 = 10.0f;
        if (z10 && ((i15 = this.K1) == 3 || i15 == 7)) {
            int i21 = this.Z6;
            float f11 = i21;
            int i22 = (int) ((f11 - x1Var.f23508l0) + x1Var.m0);
            int i23 = (int) ((f11 - x1Var.f23488h0) + x1Var.f23493i0);
            if (this.f22773wb && !this.G6) {
                i23 = (int) ((getVideoTranscriptionProgress() * org.telegram.messenger.i0.L(8.0f)) + i23);
                i22 += org.telegram.messenger.i0.L(8.0f);
            }
            if (x1Var.f23508l0 == 0.0f && x1Var.m0 == 0.0f) {
                i22 = i23;
            }
            if (rn0Var != null) {
                if (x1Var.f23521o1) {
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
                    rn0Var.h(L2, L3, i25, i26 + i19);
                } else {
                    int L4 = (i23 + i20) - ((int) (org.telegram.messenger.i0.L(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.P1) {
                        f10 = 0.0f;
                    }
                    rn0Var.h(L4 - org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(30.0f), (i21 + i20) - ((int) (org.telegram.messenger.i0.L(34.0f) * getUseTranscribeButtonProgress())), (i22 + i20) - ((int) (org.telegram.messenger.i0.L(34.0f) * getUseTranscribeButtonProgress())));
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
        if (rn0Var != null) {
            if (x1Var.f23521o1) {
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
                rn0Var.h(L6, L7, L8, i29 + i14);
            } else {
                int L9 = (this.Z6 + i20) - ((int) (org.telegram.messenger.i0.L(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.P1) {
                    f10 = 0.0f;
                }
                int L10 = L9 - org.telegram.messenger.i0.L(f10);
                rn0Var.h(L10, org.telegram.messenger.i0.L(30.0f), L10, L10);
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
        if (this.f22597i9 && this.T8 != null && (yVar = this.T2) != null && (this.ha != null || this.ia != null)) {
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
                        TLRPC.User user = this.f22709ra;
                        if (user != null && user.bot_inline_placeholder == null) {
                            l1Var.S1(this, user.f19943id);
                        } else {
                            String n10 = i20.n(user);
                            l1 l1Var2 = this.Qa;
                            if (n10 == null) {
                                n10 = this.O5.f16690k.via_bot_name;
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
                                TLRPC.MessageFwdHeader messageFwdHeader = this.O5.f16690k.fwd_from;
                                if (messageFwdHeader != null) {
                                    int i11 = messageFwdHeader.channel_post;
                                    chat = this.f22722sa;
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
                                l1Var.T(q1Var, chat2, i10, this.f22566g1, this.f22577h1, false);
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
                TLRPC.PollAnswer pollAnswer = ((p1) arrayList.get(i10)).f22437s;
                if (pollAnswer != null && Arrays.equals(pollAnswer.option, bArr)) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void T2(org.telegram.messenger.kj r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.T2(org.telegram.messenger.kj):void");
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
            if (g22.f22261q0) {
                c10 = 2;
            } else if (g22.f22263s0) {
                c10 = 3;
            } else if (g22.f22265u0) {
                c10 = 4;
            } else if (a2()) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            if (c10 == 2) {
                if (this.R1) {
                    i12 = this.f22663o0 - org.telegram.messenger.i0.L(10.0f);
                } else {
                    if (this.S1) {
                        i11 = this.f22663o0;
                        L2 = org.telegram.messenger.i0.L(1.0f);
                    } else {
                        i11 = this.f22663o0;
                        L2 = org.telegram.messenger.i0.L(1.0f);
                    }
                    i12 = i11 + L2;
                }
                getDelegate().g2().c0(org.telegram.messenger.i0.L(10.0f) + i12 + this.Y1, this.W1);
            } else if (c10 == 1) {
                L3();
                getDelegate().g2().c0((int) this.f22690q3, (int) this.f22702r3);
            } else if (c10 == 3) {
                fj fjVar = this.K;
                if (fjVar != null && !fjVar.f15740i) {
                    i10 = (int) this.f22690q3;
                } else {
                    float f7 = 12.0f;
                    if (this.O5.P3()) {
                        i10 = getExtraTextX() + org.telegram.messenger.i0.L(12.0f) + this.L6;
                        if (this.O5.D == 19) {
                            i10 -= Math.max(0, (org.telegram.messenger.i0.L(14.0f) + (Math.max(this.V7, this.X7) + i10)) - org.telegram.messenger.i0.f16172q.x);
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
                int L3 = ((int) (i10 + this.gb.f23488h0)) - org.telegram.messenger.i0.L(1.33f);
                int i15 = this.f22687q0;
                L3();
                l9 g23 = getDelegate().g2();
                int L4 = org.telegram.messenger.i0.L(10.0f) + L3;
                s1 s1Var = this.f22699r0;
                if (s1Var != null) {
                    i13 = s1Var.f22977o;
                }
                g23.c0(L4 - i13, org.telegram.messenger.i0.L(22.0f) + i15);
            } else {
                getDelegate().g2().c0(this.f22650n0, this.f22725t0);
            }
        }
    }

    public final boolean U(MotionEvent motionEvent) {
        l1 l1Var;
        TLRPC.User user;
        TLRPC.Document document;
        if (this.f22597i9 && this.T8 != null && this.T2 != null && ((this.ha != null || this.ia != null) && this.f22634la != null && this.f22673oa != null)) {
            boolean contains = this.Z2.getBounds().contains((int) motionEvent.getX(), (int) K1(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.f22488a3 = contains;
                if (contains) {
                    this.Z2.setHotspot((int) motionEvent.getX(), (int) K1(motionEvent));
                    this.Z2.setState(this.L2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.f22488a3 && (l1Var = this.Qa) != null && (user = this.ha) != null) {
                    Drawable drawable = this.f22673oa.f25372f[0];
                    if (drawable instanceof org.telegram.ui.Components.f5) {
                        document = ((org.telegram.ui.Components.f5) drawable).e;
                    } else {
                        document = null;
                    }
                    l1Var.D1(this, user, document, this.f22660na);
                    n2();
                }
                this.Z2.setState(StateSet.NOTHING);
                this.f22488a3 = false;
            }
            return this.f22488a3;
        }
        this.f22488a3 = false;
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
            boolean z10 = this.f22739u1;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            return org.telegram.messenger.i0.T1(f7, f10, x1Var.L1);
        } else if (this.f22739u1) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public final void U3(int i10, int i11) {
        ArrayList arrayList;
        ij ijVar = this.f22616k3;
        x1 x1Var = this.gb;
        if (ijVar != null && (arrayList = ijVar.e) != null) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                hj hjVar = (hj) obj;
                ArrayList arrayList2 = hjVar.f16072y;
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    ((nh.i) obj2).i((i10 - hjVar.p(this.f22616k3.e, x1Var)) - this.f22690q3, getWidth(), (i11 - hjVar.p(this.f22616k3.e, x1Var)) - this.f22702r3);
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
        if (getMessageObject() != null && getMessageObject().f16750z2 != null) {
            ArrayList arrayList4 = getMessageObject().f16750z2;
            int size4 = arrayList4.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList4.get(i15);
                i15++;
                hj hjVar2 = (hj) obj4;
                ArrayList arrayList5 = hjVar2.f16072y;
                int size5 = arrayList5.size();
                int i16 = 0;
                while (i16 < size5) {
                    Object obj5 = arrayList5.get(i16);
                    i16++;
                    ((nh.i) obj5).i((i10 - hjVar2.p(getMessageObject().f16750z2, x1Var)) - this.f22725t0, getWidth(), (i11 - hjVar2.p(getMessageObject().f16750z2, x1Var)) - this.f22725t0);
                }
            }
        }
    }

    public final boolean V(org.telegram.messenger.kj r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.V(org.telegram.messenger.kj):boolean");
    }

    public final void V0(Canvas canvas) {
        float f7;
        q1 q1Var;
        Canvas canvas2;
        if (this.gc || this.f22587hc) {
            cj cjVar = this.L;
            if (cjVar == null || (cjVar.f15160c == 0 && cjVar.f15158a == 0)) {
                int compactHeaderColor = getCompactHeaderColor();
                f22484fd.setColor(compactHeaderColor);
                f22485gd.setColor(compactHeaderColor);
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
                    q1Var.X0(canvas2, this.f22551ec, compactLeft, L, compactHeaderColor);
                    L += org.telegram.messenger.i0.L(24.0f);
                } else {
                    q1Var = this;
                    canvas2 = canvas;
                }
                if (q1Var.f22587hc) {
                    q1Var.X0(canvas2, q1Var.f22564fc, compactLeft, L, compactHeaderColor);
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
        kj kjVar = this.O5;
        if (kjVar == null) {
            return;
        }
        float f7 = this.Tc + this.Uc;
        if (!kjVar.P3() || this.O5.B2) {
            f7 += this.f22688q1;
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
        cj cjVar;
        boolean z10;
        Drawable drawable;
        Drawable drawable2;
        int L;
        int i11;
        int L2;
        int i12;
        if ((!t2() || this.O5.D == 16) && (((i10 = this.K1) != 5 && i10 != 1) || (cjVar = this.L) == null || (cjVar.f15166l & 4) != 0)) {
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
                    kj kjVar = this.O5;
                    if (kjVar.D == 16) {
                        boolean J4 = kjVar.J4();
                        int i14 = this.Q3;
                        if (x10 >= i14) {
                            if (dd.X) {
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
                                        if (dd.X) {
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
        kj kjVar;
        if (!this.f22533d6 || this.f22571g6 || ((this.F6 && !this.f22606j6) || (kjVar = this.O5) == null || kjVar.P3() || !this.O5.k5())) {
            kj kjVar2 = this.O5;
            if (kjVar2 == null || kj.B0(kjVar2.f16690k) != 489000) {
                kj kjVar3 = this.O5;
                if (kjVar3 == null || !kjVar3.f16689j2) {
                    if (kjVar3 != null && kjVar3.f16690k.guestchat_via_from != null) {
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
        ImageReceiver imageReceiver = m1Var.f22280b;
        boolean z11 = m1Var.f22279a;
        float f11 = L;
        rectF.set(f7, f10, m1Var.f22285j + f7, f10 + f11);
        canvas.save();
        float a2 = m1Var.e.a(0.02f);
        RectF rectF2 = m1Var.d;
        canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.15f, i10);
        y yVar = m1Var.f22286k;
        if (yVar == null) {
            m1Var.f22287l = r12;
            y a02 = org.telegram.ui.ActionBar.t6.a0(r12, 6, 6);
            m1Var.f22286k = a02;
            a02.setCallback(this);
        } else if (m1Var.f22287l != r12) {
            m1Var.f22287l = r12;
            org.telegram.ui.ActionBar.t6.H1(yVar, r12, true);
        }
        m1Var.f22286k.setBounds((int) (rectF2.left - org.telegram.messenger.i0.L(6.0f)), (int) (rectF2.top - org.telegram.messenger.i0.L(4.0f)), (int) (rectF2.right + org.telegram.messenger.i0.L(6.0f)), (int) (rectF2.bottom + org.telegram.messenger.i0.L(4.0f)));
        m1Var.f22286k.draw(canvas);
        if (!z11) {
            l1 l1Var = this.Qa;
            if (l1Var != null && l1Var.k1(this, 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            Y0(canvas, m1Var, i10, z10);
        }
        if (this.f22625kc == null) {
            this.f22625kc = getContext().getResources().getDrawable(2131232331).mutate();
        }
        if (z11) {
            i11 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cd, this.Ob);
        } else {
            i11 = i10;
        }
        this.f22625kc.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        int i12 = (int) (((L - intrinsicWidth) / 2.0f) + f7);
        int i13 = (int) (((L - intrinsicHeight) / 2.0f) + f10);
        this.f22625kc.setBounds(i12, i13, this.f22625kc.getIntrinsicWidth() + i12, this.f22625kc.getIntrinsicHeight() + i13);
        canvas.save();
        if (!z11) {
            float f12 = f11 / 2.0f;
            canvas.scale(-1.0f, 1.0f, f7 + f12, f12 + f10);
        }
        this.f22625kc.draw(canvas);
        canvas.restore();
        float L2 = f7 + f11 + org.telegram.messenger.i0.L(6.0f);
        if (m1Var.f22282f != null) {
            f22484fd.setColor(i11);
            W0(canvas, m1Var.f22282f, L2, f10);
            f22484fd.setColor(i10);
            L2 += org.telegram.messenger.i0.L(4.0f) + I1(m1Var.f22282f);
        }
        if (m1Var.f22284i) {
            imageReceiver.y0(L2, f10, f11, f11);
            imageReceiver.setAlpha(1.0f);
            imageReceiver.h(canvas, null);
            L2 += org.telegram.messenger.i0.L(5.0f) + L;
        }
        StaticLayout staticLayout = m1Var.f22283g;
        if (staticLayout != null) {
            if (z11) {
                staticLayout.getPaint().setColor(i0.b.k(org.telegram.ui.ActionBar.t6.r1(0.7f, i11), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ua, this.Ob)));
            }
            W0(canvas, m1Var.f22283g, L2, f10);
            if (z11) {
                m1Var.f22283g.getPaint().setColor(i10);
            }
            L2 += org.telegram.messenger.i0.L(4.0f) + I1(m1Var.f22283g);
        }
        if (m1Var.h != null) {
            canvas.save();
            canvas.translate(L2 - m1Var.h.getLineLeft(0), ((L - m1Var.h.getHeight()) / 2.0f) + f10);
            if (z11) {
                m1Var.h.draw(canvas);
            } else {
                StaticLayout staticLayout2 = m1Var.h;
                AtomicReference atomicReference = this.f22636lc;
                ArrayList arrayList = this.Rb;
                nh.i.g(this, this.m0, i10, -org.telegram.messenger.i0.L(2.0f), atomicReference, 0, staticLayout2, arrayList, canvas, false);
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, m1Var.h, this.f22811za, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, G1(2, i10));
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
        ArrayList arrayList = this.f22742u4;
        if (!arrayList.isEmpty()) {
            k80Var = (k80) arrayList.get(0);
            arrayList.remove(0);
        } else {
            k80Var = new k80(0);
        }
        k80Var.reset();
        this.f22754v4.add(k80Var);
        return k80Var;
    }

    public final hl0 X3() {
        if (this.O5 != null && L2()) {
            return (hl0) this.O5.f16738w2.f19333g.get(0);
        }
        return null;
    }

    public final boolean Y(MotionEvent motionEvent) {
        ps0 H1;
        l1 l1Var = this.Qa;
        if (l1Var == null) {
            H1 = null;
        } else {
            H1 = l1Var.H1();
        }
        ps0 ps0Var = H1;
        int i10 = 0;
        if (this.O5 != null) {
            ag.c2 c2Var = this.T0;
            if (c2Var.L() && ps0Var != null && !this.O5.t4() && !this.O5.G2() && ((!kj.L4(this.O5.f16690k) || this.F5) && !this.f22773wb && !this.O5.J2() && ((!this.O5.U2() || kj.t3(this.O5.f16690k)) && !this.O5.m5()))) {
                kj kjVar = this.O5;
                nh.h hVar = this.O9;
                if (hVar != null) {
                    Integer num = (Integer) hVar.f13837k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    i10 = num.intValue();
                }
                return ps0Var.a(motionEvent, this, c2Var, kjVar, i10);
            }
        }
        return false;
    }

    public final void Y0(Canvas canvas, m1 m1Var, int i10, boolean z10) {
        t80 t80Var;
        t80 t80Var2;
        if (!z10 && m1Var.f22289n) {
            t80 t80Var3 = m1Var.f22288m;
            if (t80Var3 != null) {
                t80Var3.a();
            }
        } else if (z10 && !m1Var.f22289n && (t80Var = m1Var.f22288m) != null) {
            t80Var.f30575c = -1L;
            t80Var.f30574b = -1L;
        }
        m1Var.f22289n = z10;
        float[] fArr = m1Var.f22290o;
        RectF rectF = m1Var.d;
        if (!z10 && ((t80Var2 = m1Var.f22288m) == null || !t80Var2.d())) {
            t80 t80Var4 = m1Var.f22288m;
            if (t80Var4 != null) {
                t80Var4.f30574b = -1L;
                return;
            }
            return;
        }
        if (m1Var.f22288m == null) {
            t80 t80Var5 = new t80();
            m1Var.f22288m = t80Var5;
            t80Var5.D = true;
            t80Var5.f30589t = 3.5f;
            t80Var5.f30590u = 0.5f;
        }
        m1Var.f22288m.g(org.telegram.ui.ActionBar.t6.r1(0.1f, i10), org.telegram.ui.ActionBar.t6.r1(0.3f, i10), org.telegram.ui.ActionBar.t6.r1(0.3f, i10), org.telegram.ui.ActionBar.t6.r1(1.25f, i10));
        Arrays.fill(fArr, org.telegram.messenger.i0.L(6.0f));
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(rectF.left - org.telegram.messenger.i0.L(6.0f), rectF.top - org.telegram.messenger.i0.L(4.0f), rectF.right + org.telegram.messenger.i0.L(6.0f), rectF.bottom + org.telegram.messenger.i0.L(4.0f));
        m1Var.f22288m.e(rectF2);
        m1Var.f22288m.j(fArr);
        m1Var.f22288m.f30592x.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        m1Var.f22288m.draw(canvas);
        invalidate();
    }

    public final float Y1(float f7) {
        float f10;
        float f11;
        if (B3() && this.K1 != 7) {
            return ((getPhotoBottom() + this.f22750v0) - org.telegram.messenger.i0.L(7.3f)) - this.f22785x9.getHeight();
        }
        int i10 = this.f22520c7;
        if (!this.F && !this.E) {
            f10 = 6.5f;
        } else {
            f10 = 7.5f;
        }
        float L = ((i10 - org.telegram.messenger.i0.L(f10)) - this.f22785x9.getHeight()) + f7;
        boolean z10 = this.f22773wb;
        x1 x1Var = this.gb;
        if (z10 && !r2()) {
            if (this.J) {
                f11 = 4.0f;
            } else {
                f11 = 5.0f;
            }
            L -= (1.0f - getVideoTranscriptionProgress()) * (this.N.i(x1Var.L1) + org.telegram.messenger.i0.L(f11));
        }
        fj fjVar = this.K;
        if (fjVar != null) {
            ej ejVar = fjVar.f15744m;
            float f12 = L + ejVar.h;
            if (ejVar.f15577j) {
                return f12 - getTranslationY();
            }
            return f12;
        }
        return (x1Var.f23498j0 - x1Var.f23503k0) + L;
    }

    public final void Y2() {
        kj kjVar = this.O5;
        if (kjVar != null && kjVar.f16750z2 != null) {
            for (int i10 = 0; i10 < this.O5.f16750z2.size(); i10++) {
                hj hjVar = (hj) this.O5.f16750z2.get(i10);
                y yVar = hjVar.S;
                if (yVar != null) {
                    yVar.setCallback(this);
                    hjVar.S.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.f22616k3 != null) {
            for (int i11 = 0; i11 < this.f22616k3.e.size(); i11++) {
                hj hjVar2 = (hj) this.f22616k3.e.get(i11);
                y yVar2 = hjVar2.S;
                if (yVar2 != null) {
                    yVar2.setCallback(this);
                    hjVar2.S.setState(StateSet.NOTHING);
                }
            }
        }
        if (r2()) {
            invalidate();
        }
    }

    public final boolean Y3() {
        if (this.O5 != null && L2() && !r2()) {
            if ((TextUtils.isEmpty(this.O5.f16747z) || this.f22739u1) && this.N.f48461p) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void Z() {
        ih.h hVar;
        ih.h hVar2;
        kj kjVar = this.O5;
        if (kjVar != null && kjVar.T3()) {
            w1 w1Var = this.f22752v2;
            if (w1Var != null && (hVar2 = w1Var.f23363n) != null) {
                hVar2.e();
            }
            w1 w1Var2 = this.f22752v2;
            if (w1Var2 != null && (hVar = w1Var2.f23362m) != null) {
                hVar.e();
            }
        }
    }

    public final void Z0(Canvas canvas, float f7) {
        ij ijVar;
        sg.p0 p0Var;
        Paint paint;
        m1 m1Var;
        m1 m1Var2;
        if (r2() && this.O5 != null && f7 > 0.0f) {
            if (this.Yc == null) {
                this.Yc = new Paint(1);
            }
            float compactLeft = getCompactLeft();
            ArrayList arrayList = this.O5.f16750z2;
            if (arrayList != null && !arrayList.isEmpty()) {
                compactLeft = Math.max(compactLeft, this.f22650n0 + this.O5.f16727t2);
            }
            if (this.f22616k3 != null) {
                compactLeft = Math.max(compactLeft, this.f22690q3 + ijVar.f16296c);
            }
            if (this.M1) {
                ag.c2 c2Var = this.T0;
                if (c2Var.Q0) {
                    compactLeft = Math.max(compactLeft, c2Var.y());
                }
            }
            if (this.f22597i9 && this.T8 != null) {
                compactLeft = Math.max(compactLeft, getCompactLeft() + this.f22536d9);
            }
            if (this.gc && (m1Var2 = this.f22551ec) != null) {
                compactLeft = Math.max(compactLeft, m1Var2.d.right);
            }
            if (this.f22587hc && (m1Var = this.f22564fc) != null) {
                compactLeft = Math.max(compactLeft, m1Var.d.right);
            }
            if (!this.N.f48461p) {
                compactLeft = Math.max(compactLeft, p0Var.f48450b + p0Var.f48460o);
            }
            if (this.O5.D != 0 && !this.M1) {
                compactLeft = Math.max(compactLeft, getBackgroundDrawableRight() - org.telegram.messenger.i0.L(10.0f));
            }
            if (this.f22785x9 != null) {
                compactLeft = Math.max(compactLeft, this.A9 + this.f22797y9);
            }
            float L = org.telegram.messenger.i0.L(8.0f);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(L, org.telegram.messenger.i0.L(2.0f) + getPaddingTop(), Math.min(compactLeft + L, getMeasuredWidth() - L), getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f));
            this.Yc.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ua, this.Ob));
            this.Yc.setAlpha((int) (paint.getAlpha() * f7));
            float L2 = org.telegram.messenger.i0.L(uz.Y0);
            canvas.drawRoundRect(rectF, L2, L2, this.Yc);
        }
    }

    public final int Z1(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.O4;
            if (i11 < arrayList.size()) {
                TLRPC.TodoItem todoItem = ((p1) arrayList.get(i11)).f22438t;
                if (todoItem != null && todoItem.f19941id == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void Z2() {
        m1 m1Var = this.f22612jc;
        if (m1Var != null) {
            y yVar = m1Var.f22286k;
            if (yVar != null) {
                yVar.setState(StateSet.NOTHING);
            }
            this.f22612jc.e.c(false);
            this.f22612jc = null;
            invalidate();
        }
    }

    @Override
    public final boolean a() {
        fj fjVar = this.K;
        if ((fjVar == null || !fjVar.f15744m.f15577j) && getAlpha() != 1.0f) {
            return true;
        }
        return false;
    }

    public final void a0(boolean z10) {
        kj kjVar;
        boolean z11;
        kj kjVar2;
        byte[] bArr;
        w1 w1Var = this.f22752v2;
        if (w1Var != null && w1Var.f23360k != null && (kjVar = this.O5) != null && kjVar.T3()) {
            TLRPC.MessageMedia n12 = kj.n1(this.O5);
            boolean z12 = false;
            if (n12 instanceof TLRPC.TL_messageMediaPoll) {
                z11 = ((TLRPC.TL_messageMediaPoll) n12).poll.multiple_choice;
            } else {
                z11 = false;
            }
            kh.d dVar = this.f22752v2.f23360k;
            if (z11) {
                rz C = rz.C(this.Y5);
                if (this.O5 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C.f18011w.get("poll_" + kjVar2.E1());
                }
                if (bArr != null) {
                    z12 = true;
                }
            }
            fe.b bVar = dVar.f11387f;
            if (bVar.f7022f != z12) {
                bVar.a(z12, z10);
            }
        }
    }

    public final void a1(android.graphics.Canvas r50, boolean r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.a1(android.graphics.Canvas, boolean):void");
    }

    public final boolean a2() {
        if (this.f22616k3 != null) {
            return true;
        }
        return false;
    }

    public final void a3() {
        r1 r1Var = this.f22740u2;
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
        r1 r1Var2 = this.f22740u2;
        if (r1Var2 != null && r1Var2.f22869g != null) {
            for (int i10 = 0; i10 < this.f22740u2.f22869g.size(); i10++) {
                n1 n1Var = (n1) this.f22740u2.f22869g.get(i10);
                dc dcVar2 = n1Var.f22335f;
                if (dcVar2 != null) {
                    dcVar2.c(false);
                }
                y yVar = n1Var.f22336g;
                if (yVar != null) {
                    yVar.setState(StateSet.NOTHING);
                }
            }
        }
    }

    @Override
    public final void b(boolean z10, boolean z11) {
        this.f22772wa = z10;
        if (z10) {
            this.f22786xa = z11;
        } else {
            this.f22786xa = false;
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
        if (!this.gc && !this.f22587hc) {
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
                            this.f22521c8 = true;
                            getParent().requestDisallowInterceptTouchEvent(false);
                            this.f22573g8 = x10;
                            this.f22584h8 = getY() + K1;
                            y yVar = this.Ia;
                            if (yVar != null) {
                                yVar.setHotspot(x10, K1);
                                this.f22535d8 = false;
                                this.f22548e8 = true;
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
                        if (this.f22521c8) {
                            m();
                            this.f22521c8 = false;
                            y yVar2 = this.Ia;
                            if (yVar2 != null) {
                                if (!this.f22535d8) {
                                    yVar2.setState(new int[]{16842919, 16842910});
                                    post(new b1(this, 4));
                                } else {
                                    yVar2.setState(new int[0]);
                                }
                                this.f22535d8 = false;
                                this.f22548e8 = false;
                                invalidate();
                            }
                            dc dcVar2 = this.Da;
                            if (dcVar2 != null) {
                                dcVar2.c(false);
                            }
                            playSoundEffect(0);
                            if (this.f22760va) {
                                l1 l1Var2 = this.Qa;
                                if (l1Var2 != null) {
                                    TLRPC.Chat chat = this.f22722sa;
                                    if (chat != null) {
                                        l1Var2.T(this, chat, this.O5.f16690k.fwd_from.channel_post, this.f22566g1, this.f22577h1, false);
                                        q1Var = this;
                                    } else {
                                        q1Var = this;
                                        TLRPC.User user = q1Var.f22696qa;
                                        if (user != null) {
                                            l1Var2.r0(this, user, q1Var.f22566g1, q1Var.f22577h1);
                                        } else if (q1Var.f22735ta != null) {
                                            l1Var2.n(this);
                                        }
                                    }
                                }
                            } else {
                                q1Var = this;
                                if (q1Var.Qa != null && (q1Var.O5.B2() || q1Var.O5.f4() || q1Var.K7 || ((message = q1Var.O5.f16690k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                                    q1Var.Qa.L1(q1Var, q1Var.O5.O1(), x10, K1, false);
                                }
                            }
                        }
                    } else {
                        q1Var = this;
                        if (motionEvent.getAction() == 3) {
                            q1Var.f22521c8 = false;
                            q1Var.f22535d8 = false;
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
                                    if (q1Var.Ia != null && q1Var.f22548e8) {
                                        if (Math.sqrt(Math.pow((getY() + K1) - q1Var.f22584h8, 2.0d) + Math.pow(x10 - q1Var.f22573g8, 2.0d)) > 0.75d) {
                                            q1Var.f22548e8 = false;
                                        }
                                    }
                                }
                            }
                            q1Var.f22521c8 = false;
                            q1Var.f22535d8 = false;
                            q1Var.f22548e8 = false;
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
                    return q1Var.f22521c8;
                }
                q1Var = this;
                return q1Var.f22521c8;
            }
        } else {
            float x11 = motionEvent.getX();
            float K12 = K1(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                if (this.Qa != null) {
                    if (this.gc && (m1Var4 = this.f22551ec) != null && z2(m1Var4, x11, K12)) {
                        m1Var2 = this.f22551ec;
                    } else if (this.f22587hc && (m1Var3 = this.f22564fc) != null && z2(m1Var3, x11, K12)) {
                        m1Var2 = this.f22564fc;
                    } else {
                        m1Var2 = null;
                    }
                    if (m1Var2 != null && (m1Var2.f22279a || this.Qa.i0())) {
                        this.f22612jc = m1Var2;
                        m1Var2.e.c(true);
                        y yVar5 = m1Var2.f22286k;
                        if (yVar5 != null) {
                            yVar5.setHotspot(x11, K12);
                            m1Var2.f22286k.setState(new int[]{16842919, 16842910});
                        }
                        invalidate();
                        w();
                        return true;
                    }
                }
            } else if (action == 1) {
                m1 m1Var5 = this.f22612jc;
                if (m1Var5 != null) {
                    m();
                    Z2();
                    playSoundEffect(0);
                    if (m1Var5.f22279a) {
                        TLRPC.Chat chat2 = this.f22722sa;
                        if (chat2 != null) {
                            this.Qa.T(this, chat2, this.O5.f16690k.fwd_from.channel_post, this.f22566g1, this.f22577h1, false);
                            return true;
                        }
                        TLRPC.User user2 = this.f22696qa;
                        if (user2 != null) {
                            this.Qa.r0(this, user2, this.f22566g1, this.f22577h1);
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
                } else if (action == 2 && (m1Var = this.f22612jc) != null && !z2(m1Var, x11, K12)) {
                    m();
                    Z2();
                }
                if (this.f22612jc != null) {
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
        return this.f22757v7;
    }

    public final void b3(int i10) {
        ji.a aVar;
        ji.a aVar2 = this.f22716s4;
        if (i10 != -1) {
            Integer valueOf = Integer.valueOf(i10);
            for (int i11 = 0; i11 < aVar2.f10422a; i11++) {
                if (((Pair) ((ArrayList) aVar2.e).get(i11)).second == valueOf) {
                    aVar2.l(i11);
                }
            }
        } else {
            aVar2.f(true);
        }
        s1 s1Var = this.f22699r0;
        if (s1Var != null && (aVar = s1Var.f22971i) != null) {
            aVar.f(true);
        }
        this.f22667o4 = null;
        s1 s1Var2 = this.f22699r0;
        if (s1Var2 != null) {
            s1Var2.f22972j = null;
        }
        if (this.f22680p4 != null) {
            if (this.f22729t4 == i10 || i10 == -1) {
                this.f22680p4 = null;
                this.f22729t4 = -1;
                this.f22511bc = false;
                this.f22525cc = false;
                invalidate();
            }
        }
    }

    @Override
    public final void c(float f7) {
        kj kjVar = this.O5;
        if (kjVar == null) {
            return;
        }
        kjVar.f16652b0 = f7;
        MediaController.B().i0(this.O5, f7);
        O3();
    }

    public final boolean c0(MotionEvent motionEvent) {
        kj kjVar = this.O5;
        if (kjVar == null || kjVar.f16738w2 == null || kjVar.D != 36) {
            return false;
        }
        float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.f22576h0 + this.f22725t0;
        motionEvent.offsetLocation(-this.f22650n0, -topicSeparatorTopPadding);
        wv wvVar = this.O5.f16738w2;
        l1 l1Var = this.Qa;
        wvVar.E = this;
        wvVar.F = l1Var;
        boolean M = wvVar.M(motionEvent);
        motionEvent.offsetLocation(this.f22650n0, topicSeparatorTopPadding);
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
        if (this.f22639m3 != null) {
            this.f22639m3 = null;
        }
        ArrayList arrayList = this.f22754v4;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f22742u4.addAll(arrayList);
        arrayList.clear();
    }

    @Override
    public final void computeScroll() {
        super.computeScroll();
        l0 l0Var = this.f22762w;
        if (l0Var != null) {
            l0Var.b();
        }
    }

    @Override
    public final void d(float f7) {
        kj kjVar = this.O5;
        if (kjVar == null) {
            return;
        }
        kjVar.f16652b0 = f7;
        kjVar.f16675g0 = (int) (kjVar.L0() * f7);
        O3();
    }

    public final boolean d0(int i10, MotionEvent motionEvent) {
        int i11;
        nh.i iVar;
        int i12;
        int i13;
        ij ijVar;
        ij ijVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        fj fjVar;
        if (i10 > 15 || getParent() == null) {
            return false;
        }
        boolean z10 = true;
        if (this.O5.z2() && (fjVar = this.K) != null && !fjVar.f15740i) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            for (int i18 = 0; i18 < viewGroup.getChildCount(); i18++) {
                View childAt = viewGroup.getChildAt(i18);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    fj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    cj currentPosition = q1Var.getCurrentPosition();
                    if (currentMessagesGroup != null && currentMessagesGroup.f15735a == this.K.f15735a) {
                        int i19 = currentPosition.f15166l;
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
            int i20 = this.f22650n0;
            if (x10 >= i20 && K1 >= (i16 = this.f22725t0)) {
                kj kjVar = this.O5;
                if (x10 <= i20 + kjVar.f16727t2 && K1 <= kjVar.U5(x1Var) + i16) {
                    ArrayList arrayList = this.O5.f16750z2;
                    for (int i21 = 0; i21 < arrayList.size() && ((hj) arrayList.get(i21)).p(this.O5.f16750z2, x1Var) <= K1; i21++) {
                        hj hjVar = (hj) arrayList.get(i21);
                        if (hjVar.l()) {
                            i17 = (int) this.O5.f16734v2;
                        } else {
                            i17 = 0;
                        }
                        ArrayList arrayList2 = hjVar.f16072y;
                        int size = arrayList2.size();
                        int i22 = 0;
                        while (i22 < size) {
                            Object obj = arrayList2.get(i22);
                            i22++;
                            nh.i iVar2 = (nh.i) obj;
                            boolean z11 = z10;
                            if (iVar2.getBounds().contains((x10 - this.f22650n0) + i17, (int) ((K1 - this.f22725t0) - hjVar.p(this.O5.f16750z2, x1Var)))) {
                                this.M5 = iVar2;
                                return z11;
                            }
                            z10 = z11;
                        }
                    }
                }
            }
            boolean z12 = z10;
            if (this.f22616k3 != null) {
                float f7 = x10;
                float f10 = this.f22690q3;
                if (f7 >= f10) {
                    float f11 = K1;
                    float f12 = this.f22702r3;
                    if (f11 >= f12 && f7 <= f10 + ijVar.f16296c && f11 <= f12 + ijVar.c(x1Var)) {
                        ArrayList arrayList3 = this.f22616k3.e;
                        for (int i23 = 0; i23 < arrayList3.size() && ((hj) arrayList3.get(i23)).p(this.f22616k3.e, x1Var) <= f11; i23++) {
                            hj hjVar2 = (hj) arrayList3.get(i23);
                            if (hjVar2.l()) {
                                i15 = (int) this.f22616k3.d;
                            } else {
                                i15 = 0;
                            }
                            ArrayList arrayList4 = hjVar2.f16072y;
                            int size2 = arrayList4.size();
                            int i24 = 0;
                            while (i24 < size2) {
                                Object obj2 = arrayList4.get(i24);
                                i24++;
                                nh.i iVar3 = (nh.i) obj2;
                                ArrayList arrayList5 = arrayList3;
                                float f13 = f7;
                                if (iVar3.getBounds().contains((int) ((f7 - this.f22690q3) + i15), (int) ((f11 - this.f22702r3) - hjVar2.p(this.f22616k3.e, x1Var)))) {
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
            if (this.f22666o3 == null) {
                return false;
            }
            float f14 = x10;
            float f15 = this.f22717s5;
            if (f14 < f15) {
                return false;
            }
            float f16 = K1;
            float f17 = this.f22730t5;
            if (f16 <= f17 || f14 > f15 + ijVar2.f16296c || f16 > f17 + ijVar2.c(x1Var)) {
                return false;
            }
            ArrayList arrayList6 = this.f22666o3.e;
            for (int i25 = 0; i25 < arrayList6.size() && ((hj) arrayList6.get(i25)).p(this.f22666o3.e, x1Var) <= f16; i25++) {
                hj hjVar3 = (hj) arrayList6.get(i25);
                if (hjVar3.l()) {
                    i14 = (int) this.f22666o3.d;
                } else {
                    i14 = 0;
                }
                ArrayList arrayList7 = hjVar3.f16072y;
                int size3 = arrayList7.size();
                int i26 = 0;
                while (i26 < size3) {
                    Object obj3 = arrayList7.get(i26);
                    i26++;
                    nh.i iVar4 = (nh.i) obj3;
                    if (iVar4.getBounds().contains((int) ((f14 - this.f22717s5) + i14), (int) ((f16 - this.f22730t5) - hjVar3.p(this.f22666o3.e, x1Var)))) {
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
            ij ijVar3 = this.f22666o3;
            if (ijVar3 != null) {
                ArrayList arrayList8 = ijVar3.e;
                int size4 = arrayList8.size();
                int i27 = 0;
                while (i27 < size4) {
                    Object obj4 = arrayList8.get(i27);
                    i27++;
                    hj hjVar4 = (hj) obj4;
                    ArrayList arrayList9 = hjVar4.f16072y;
                    int size5 = arrayList9.size();
                    int i28 = 0;
                    while (i28 < size5) {
                        int i29 = i28 + 1;
                        Rect bounds = ((nh.i) arrayList9.get(i28)).getBounds();
                        path.addRect(bounds.left, hjVar4.p(this.f22666o3.e, x1Var) + bounds.top, bounds.right, hjVar4.p(this.f22666o3.e, x1Var) + bounds.bottom, Path.Direction.CW);
                        i28 = i29;
                    }
                }
            }
            ij ijVar4 = this.f22616k3;
            if (ijVar4 != null) {
                ArrayList arrayList10 = ijVar4.e;
                int size6 = arrayList10.size();
                int i30 = 0;
                while (i30 < size6) {
                    Object obj5 = arrayList10.get(i30);
                    i30++;
                    hj hjVar5 = (hj) obj5;
                    ArrayList arrayList11 = hjVar5.f16072y;
                    int size7 = arrayList11.size();
                    int i31 = 0;
                    while (i31 < size7) {
                        int i32 = i31 + 1;
                        Rect bounds2 = ((nh.i) arrayList11.get(i31)).getBounds();
                        path.addRect(bounds2.left, hjVar5.p(this.f22616k3.e, x1Var) + bounds2.top, bounds2.right, hjVar5.p(this.f22616k3.e, x1Var) + bounds2.bottom, Path.Direction.CW);
                        i31 = i32;
                    }
                }
            } else {
                ArrayList arrayList12 = this.O5.f16750z2;
                if (arrayList12 != null) {
                    int size8 = arrayList12.size();
                    int i33 = 0;
                    while (i33 < size8) {
                        Object obj6 = arrayList12.get(i33);
                        i33++;
                        hj hjVar6 = (hj) obj6;
                        ArrayList arrayList13 = hjVar6.f16072y;
                        int size9 = arrayList13.size();
                        int i34 = 0;
                        while (i34 < size9) {
                            int i35 = i34 + 1;
                            Rect bounds3 = ((nh.i) arrayList13.get(i34)).getBounds();
                            path.addRect(bounds3.left, hjVar6.p(this.O5.f16750z2, x1Var) + bounds3.top, bounds3.right, hjVar6.p(this.O5.f16750z2, x1Var) + bounds3.bottom, Path.Direction.CW);
                            i34 = i35;
                        }
                    }
                }
            }
            RectF rectF = this.f22489a4;
            path.computeBounds(rectF, false);
            float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
            this.N5 = true;
            this.M5.f13853q = new b1(this, 8);
            ij ijVar5 = this.f22666o3;
            if (ijVar5 != null) {
                ArrayList arrayList14 = ijVar5.e;
                int size10 = arrayList14.size();
                int i36 = 0;
                while (i36 < size10) {
                    Object obj7 = arrayList14.get(i36);
                    i36++;
                    hj hjVar7 = (hj) obj7;
                    if (hjVar7.l()) {
                        i13 = (int) this.f22666o3.d;
                    } else {
                        i13 = 0;
                    }
                    ArrayList arrayList15 = hjVar7.f16072y;
                    int size11 = arrayList15.size();
                    int i37 = 0;
                    while (i37 < size11) {
                        Object obj8 = arrayList15.get(i37);
                        i37++;
                        ((nh.i) obj8).j((x10 - this.f22717s5) + i13, (K1 - hjVar7.p(this.f22666o3.e, x1Var)) - this.f22730t5, sqrt, false);
                        arrayList14 = arrayList14;
                    }
                }
            }
            ij ijVar6 = this.f22616k3;
            if (ijVar6 != null) {
                ArrayList arrayList16 = ijVar6.e;
                int size12 = arrayList16.size();
                int i38 = 0;
                while (i38 < size12) {
                    Object obj9 = arrayList16.get(i38);
                    i38++;
                    hj hjVar8 = (hj) obj9;
                    if (hjVar8.l()) {
                        i12 = (int) this.f22616k3.d;
                    } else {
                        i12 = 0;
                    }
                    ArrayList arrayList17 = hjVar8.f16072y;
                    int size13 = arrayList17.size();
                    int i39 = 0;
                    while (i39 < size13) {
                        Object obj10 = arrayList17.get(i39);
                        i39++;
                        ((nh.i) obj10).j((x10 - this.f22690q3) + i12, (K1 - hjVar8.p(this.f22616k3.e, x1Var)) - this.f22702r3, sqrt, false);
                        x10 = x10;
                    }
                }
            } else {
                ArrayList arrayList18 = this.O5.f16750z2;
                if (arrayList18 != null) {
                    int size14 = arrayList18.size();
                    int i40 = 0;
                    while (i40 < size14) {
                        Object obj11 = arrayList18.get(i40);
                        i40++;
                        hj hjVar9 = (hj) obj11;
                        if (hjVar9.l()) {
                            i11 = (int) this.O5.f16734v2;
                        } else {
                            i11 = 0;
                        }
                        ArrayList arrayList19 = hjVar9.f16072y;
                        int size15 = arrayList19.size();
                        int i41 = 0;
                        while (i41 < size15) {
                            Object obj12 = arrayList19.get(i41);
                            i41++;
                            ((nh.i) obj12).j((x10 - this.f22650n0) + i11, (K1 - hjVar9.p(this.O5.f16750z2, x1Var)) - this.f22725t0, sqrt, false);
                        }
                    }
                }
            }
            if (getParent() instanceof uk0) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                for (int i42 = 0; i42 < viewGroup2.getChildCount(); i42++) {
                    View childAt2 = viewGroup2.getChildAt(i42);
                    if (childAt2 instanceof q1) {
                        q1 q1Var2 = (q1) childAt2;
                        ArrayList arrayList20 = q1Var2.Rb;
                        if (q1Var2.getMessageObject() != null && q1Var2.getMessageObject().O1() == getMessageObject().f1() && !arrayList20.isEmpty()) {
                            ((nh.i) arrayList20.get(0)).f13853q = new ea(6, this, q1Var2);
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
        s1 s1Var = this.f22699r0;
        if (s1Var != null && s1Var.f22967b) {
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
        m2.t tVar = this.f22775x;
        tVar.n(b1Var);
        b1 b1Var2 = this.Xb;
        tVar.n(b1Var2);
        kj kjVar = this.O5;
        if (kjVar != null) {
            if (!TextUtils.isEmpty(kjVar.f16747z)) {
                charSequence = this.O5.f16747z;
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
                        if (n00Var.f28627b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(n00VarArr.length);
                            }
                            arrayList.add(Integer.valueOf(n00Var.f28627b.date));
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
                        ((HashMap) tVar.f12685b).put(b1Var2, atVar);
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
        kj kjVar;
        if (i10 == org.telegram.messenger.at.f14744m1) {
            setSpoilersSuppressed(false);
        } else if (i10 == org.telegram.messenger.at.l1) {
            setSpoilersSuppressed(true);
        } else if (i10 == org.telegram.messenger.at.E0) {
            TLRPC.User user = this.ha;
            if (user != null && user.f19943id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.O5);
            }
        } else if (i10 == org.telegram.messenger.at.f14726i4) {
            invalidate();
        } else if (i10 == org.telegram.messenger.at.W2 && (kjVar = this.O5) != null) {
            TLRPC.MessageMedia messageMedia = kjVar.f16690k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
                s3(kjVar, this.K, this.F, this.E, this.G, false);
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
        kj kjVar = this.O5;
        if (kjVar != null) {
            TLRPC.MessageMedia o12 = kj.o1(kjVar.f16690k);
            if ((o12 instanceof TLRPC.TL_messageMediaDice) && ((TLRPC.TL_messageMediaDice) o12).game_outcome != null && !this.Q) {
                Drawable t10 = this.T0.t();
                if (t10 instanceof ai0) {
                    ai0 ai0Var = (ai0) t10;
                    if ((ai0Var.m0 != null || ai0Var.Y0) && !this.Q && (i10 = ai0Var.J) != 1 && i10 == 2) {
                        if (!ai0Var.X0) {
                            float t11 = ai0Var.t();
                            if (ai0Var.U0 != null) {
                                t11 = ai0Var.f25131a0 / ai0Var.f24403a1;
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
        kj kjVar = this.O5;
        if (kjVar != null && !kjVar.r4()) {
            float f12 = this.f22725t0;
            x1 x1Var = this.gb;
            if (x1Var.f23513m2) {
                float f13 = x1Var.f23522o2;
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
                xh0 xh0Var = this.f22787xc;
                if (xh0Var != null && xh0Var.h) {
                    kj kjVar2 = this.O5;
                    d1(this.f22650n0, f7, canvas, kjVar2.f16750z2, kjVar2.f16734v2, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    d1(this.f22650n0, f7, canvas, x1Var.I0, x1Var.O0, false, 1.0f - x1Var.L1, true, false, false, false);
                    kj kjVar3 = this.O5;
                    d1(this.f22650n0, f7, canvas, kjVar3.f16750z2, kjVar3.f16734v2, true, x1Var.L1, true, false, false, false);
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
                    if (this.f22726t1) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    float z11 = c3.i0.z(1.0f, x1Var.L1, this.O5.U5(x1Var) * i11, f12);
                    float f16 = x1Var.f23522o2;
                    if (this.f22726t1) {
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
                float f18 = x1Var.f23522o2;
                canvas.clipRect(f17, f18, rectF.right, this.O5.U5(x1Var) + f18 + org.telegram.messenger.i0.L(4.0f));
                kj kjVar4 = this.O5;
                d1(this.f22650n0, f10, canvas, kjVar4.f16750z2, kjVar4.f16734v2, false, 1.0f - x1Var.L1, true, false, false, false);
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
                canvas.clipRect(rectF.left, this.f22725t0, rectF.right, org.telegram.messenger.i0.L(4.0f) + this.O5.U5(x1Var) + i10);
                kj kjVar5 = this.O5;
                d1(this.f22650n0, f11, canvas, kjVar5.f16750z2, kjVar5.f16734v2, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            kj kjVar6 = this.O5;
            d1(this.f22650n0, f15, canvas, kjVar6.f16750z2, kjVar6.f16734v2, true, 1.0f, true, false, false, false);
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
        if (!this.f22694q8 || this.f22746u8 == null || this.Fa == null || this.Qa == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float K1 = K1(motionEvent);
        int action = motionEvent.getAction();
        RectF rectF = this.La;
        if (action == 0) {
            if (rectF.contains(x10, K1)) {
                this.Fa.c(true);
                y yVar = this.f22733t8;
                if (yVar != null) {
                    yVar.setHotspot(x10, K1);
                    this.f22733t8.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.Fa.f25465i && !rectF.contains(x10, K1)) {
                this.Fa.c(false);
                y yVar2 = this.f22733t8;
                if (yVar2 != null) {
                    yVar2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Fa.f25465i) {
                this.Qa.F0(this);
            }
            this.Fa.c(false);
            y yVar3 = this.f22733t8;
            if (yVar3 != null) {
                yVar3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.Fa.c(false);
            y yVar4 = this.f22733t8;
            if (yVar4 != null) {
                yVar4.setState(new int[0]);
            }
        }
        return this.Fa.f25465i;
    }

    public final void f1(android.graphics.Canvas r55, float r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.f1(android.graphics.Canvas, float):void");
    }

    public final boolean f2() {
        TLRPC.Message message;
        kj kjVar = this.O5;
        if (kjVar != null && !kjVar.E0 && !kjVar.f16681h2 && (message = kjVar.f16690k) != null) {
            TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
            if (((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) || kjVar.f16707o2 != null) {
                return true;
            }
        }
        if (this.K5) {
            return true;
        }
        return false;
    }

    public final void f3(boolean z10, boolean z11) {
        fj fjVar;
        fj fjVar2;
        kj kjVar;
        if (!z11 || (kjVar = this.O5) == null || !kjVar.f16648a0) {
            if (z10) {
                this.f22639m3 = null;
                CheckBoxBase checkBoxBase = this.l1;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, this.Ob);
                    this.l1 = checkBoxBase2;
                    if (this.N0) {
                        checkBoxBase2.f23915l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.p6 p6Var = this.Ob;
                    if (checkBoxBase.F != p6Var) {
                        checkBoxBase.F = p6Var;
                        checkBoxBase.b();
                    }
                }
            }
            if (z10 && (((fjVar = this.K) != null && fjVar.d.size() > 1) || ((fjVar2 = this.Q5) != null && fjVar2.d.size() > 1))) {
                CheckBoxBase checkBoxBase3 = this.f22614k1;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, this, this.Ob);
                    this.f22614k1 = checkBoxBase4;
                    if (!checkBoxBase4.f23927y) {
                        checkBoxBase4.f23927y = true;
                        checkBoxBase4.b();
                    }
                    if (this.N0) {
                        this.f22614k1.f23915l = true;
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
            if (this.f22637m1 == z10) {
                if (z11 != this.f22651n1 && !z11) {
                    if (z10) {
                        f7 = 1.0f;
                    }
                    this.f22664o1 = f7;
                    invalidate();
                    return;
                }
                return;
            }
            this.f22651n1 = z11;
            this.f22637m1 = z10;
            if (z11) {
                this.f22677p1 = SystemClock.elapsedRealtime();
            } else {
                if (z10) {
                    f7 = 1.0f;
                }
                this.f22664o1 = f7;
            }
            invalidate();
        }
    }

    @Override
    public final boolean g() {
        fj fjVar = this.K;
        if (fjVar != null && fjVar.f15740i) {
            cj cjVar = this.L;
            if (cjVar != null && (cjVar.f15166l & 4) != 0) {
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
        this.f22744u6 = z11;
        P3();
        if (this.A4) {
            this.C4.f30038o = v2();
        } else {
            this.B4.f28222p = v2();
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
            return this.f22563fb;
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
            return this.f22795y7;
        }
        return null;
    }

    public aa0 getBackgroundDrawable() {
        return this.Ra;
    }

    public int getBackgroundDrawableBottom() {
        int i10;
        cj cjVar = this.L;
        int i11 = 0;
        if (cjVar != null) {
            int i12 = 4;
            if ((cjVar.f15166l & 4) == 0) {
                i10 = org.telegram.messenger.i0.L(3.0f);
            } else {
                i10 = 0;
            }
            if ((this.L.f15166l & 8) == 0) {
                kj kjVar = this.O5;
                if (kjVar != null && kjVar.P3()) {
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
        int backgroundDrawableTop = ((getBackgroundDrawableTop() + this.f22520c7) - i11) + i10;
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
        kj messageObject = getMessageObject();
        int i11 = 0;
        float f7 = 9.0f;
        if (messageObject != null && messageObject.P3()) {
            if (this.f22773wb) {
                return (this.f22506b7 - this.Z6) - ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.i0.L(9.0f)));
            }
            int i12 = this.f22506b7 - this.Z6;
            if (this.A6) {
                i11 = org.telegram.messenger.i0.L(9.0f);
            }
            return i12 - i11;
        }
        float f10 = 71.0f;
        if (this.f22773wb) {
            if (!I2()) {
                if ((this.f22533d6 || ((messageObject != null && (messageObject.f16681h2 || messageObject.f16689j2 || messageObject.f16690k.guestchat_via_from != null)) || kj.B0(messageObject.f16690k) == 489000)) && this.E6) {
                    i11 = 48;
                }
                f10 = i11 + 3;
            }
            compactInShift = org.telegram.messenger.i0.L(f10) + ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.i0.L(6.0f)));
        } else {
            if (!I2()) {
                if ((this.f22533d6 || ((messageObject != null && (messageObject.f16681h2 || messageObject.f16689j2 || messageObject.f16690k.guestchat_via_from != null)) || kj.B0(messageObject.f16690k) == 489000)) && this.E6) {
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
        fj fjVar = this.K;
        if (fjVar != null && !fjVar.f15740i && (i10 = this.L.f15164j) != 0) {
            compactInShift += (int) Math.ceil((i10 / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.f22773wb) {
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
        kj kjVar;
        kj kjVar2;
        int i11 = this.Z6;
        if (this.f22773wb) {
            i10 = i11 - ((int) (getVideoTranscriptionProgress() * org.telegram.messenger.i0.L(3.0f)));
            if (this.J && (kjVar2 = this.O5) != null && kjVar2.P3()) {
                i10 = (int) (i10 - ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.i0.L(6.0f)));
            }
            if (this.J && ((kjVar = this.O5) == null || !kjVar.P3())) {
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
        cj cjVar = this.L;
        int i11 = 0;
        if (cjVar != null && (cjVar.f15166l & 4) == 0) {
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
        return this.f22496ab;
    }

    public ImageReceiver getBlurredPhotoImage() {
        return this.U0;
    }

    public int getBottomActionPadding() {
        x1 x1Var = this.gb;
        if (x1Var.C1) {
            return org.telegram.messenger.i0.W1(x1Var.L1, x1Var.B1, this.f22527d0);
        }
        return this.f22527d0;
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
        kj kjVar = this.O5;
        if (kjVar != null && kjVar.P3()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (V2()) {
            if (this.L != null) {
                f10 = 73.0f;
            } else {
                kj kjVar2 = this.O5;
                if (kjVar2 != null && kjVar2.f16681h2) {
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
            kj kjVar3 = this.O5;
            if (kjVar3 != null && kjVar3.P3()) {
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
                i14 = Math.max(i14, ((int) (((c0) arrayList.get(i15)).f21756c * widthForButtons)) + L);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i14);
        }
        if (this.S != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.S.k()) - org.telegram.messenger.i0.L(18.0f))) / 2);
        }
        if (this.f22541e0 != null) {
            backgroundDrawableLeft = Math.min(this.Y6 - ((int) getCompactSideMenuShift()), backgroundDrawableLeft);
        }
        return Math.max(0, backgroundDrawableLeft);
    }

    @Override
    public int getBoundsRight() {
        int i10;
        float f7;
        int L;
        kj kjVar = this.O5;
        if (kjVar != null && !kjVar.P3() && (V(this.O5) || this.G4)) {
            i10 = org.telegram.messenger.i0.L(48.0f);
        } else {
            i10 = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i10;
        ArrayList arrayList = this.G5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            kj kjVar2 = this.O5;
            if (kjVar2 != null && kjVar2.P3()) {
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
                i12 = Math.max(i12, ((int) (c0Var.f21756c * f10)) + L + ((int) (c0Var.e * f10)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, i12);
        }
        if (this.S != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.S.k() + getParentWidth()) + org.telegram.messenger.i0.L(18.0f))) / 2);
        }
        if (this.f22541e0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public ij getCaptionLayout() {
        return this.f22616k3;
    }

    public float getCaptionX() {
        x1 x1Var = this.gb;
        if (x1Var.f23555x0) {
            if (x1Var.D0) {
                this.f22690q3 += x1Var.f23488h0;
            } else if (x1Var.f23540t0) {
                float f7 = this.f22690q3;
                float f10 = x1Var.L1;
                this.f22690q3 = c3.i0.z(1.0f, f10, x1Var.f23532r0, f7 * f10);
            } else if (!kj.R4(this.O5.f16690k) || !TextUtils.isEmpty(this.O5.f16747z)) {
                this.f22690q3 += x1Var.f23488h0;
            }
        }
        return this.f22690q3;
    }

    public float getCaptionY() {
        float f7 = this.f22702r3;
        x1 x1Var = this.gb;
        if (x1Var.f23555x0) {
            if (x1Var.D0) {
                return f7 - getTranslationY();
            }
            if (x1Var.f23540t0) {
                float f10 = x1Var.L1;
                return c3.i0.z(1.0f, f10, x1Var.f23536s0, f7 * f10);
            }
            return f7;
        }
        return f7;
    }

    @Override
    public float getCheckBoxTranslation() {
        return this.f22688q1;
    }

    public int getChecksX() {
        float f7;
        int i10 = this.f22506b7;
        if (uz.Y0 >= 10) {
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
            boolean z10 = this.f22773wb;
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
        if (this.O5.P3() && this.gb.A0 != 1.0f && (((z10 = this.f22773wb) || !this.A6) && !this.J)) {
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

    public fj getCurrentMessagesGroup() {
        return this.K;
    }

    public cj getCurrentPosition() {
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
        return this.gb.f23498j0;
    }

    public float getDeltaLeft() {
        return this.gb.f23488h0;
    }

    public float getDeltaRight() {
        return this.gb.f23493i0;
    }

    public float getDeltaTop() {
        return this.gb.f23503k0;
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
            L2 = this.f22663o0 - org.telegram.messenger.i0.L(10.0f);
        } else {
            if (this.S1) {
                org.telegram.messenger.i0.L(14.0f);
                i10 = this.f22663o0;
                L3 = org.telegram.messenger.i0.L(1.0f);
            } else if (this.O5.r4()) {
                org.telegram.messenger.i0.L(2.0f);
                i10 = this.f22663o0;
                L3 = org.telegram.messenger.i0.L(1.0f);
            } else {
                float f11 = 12.0f;
                if (this.O5.P3()) {
                    f7 = getExtraTextX() + org.telegram.messenger.i0.L(12.0f) + this.L6;
                    if (this.O5.D == 19) {
                        f7 -= Math.max(0.0f, ((Math.max(this.V7, this.X7) + f7) + org.telegram.messenger.i0.L(14.0f)) - org.telegram.messenger.i0.f16172q.x);
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
                L2 = (f7 + x1Var.f23488h0) - org.telegram.messenger.i0.L(1.33f);
            }
            L2 = L3 + i10;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (x1Var != null) {
            f10 = x1Var.f23493i0;
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
        if (!x1Var.f23538s2) {
            f7 = (-x1Var.f23503k0) + x1Var.f23498j0;
        } else {
            f7 = 0.0f;
        }
        return f10 + f7;
    }

    public StaticLayout getDescriptionlayout() {
        return this.f22652n2;
    }

    public TLRPC.TL_availableEffect getEffect() {
        kj kjVar;
        cj cjVar = this.L;
        if ((cjVar != null && !cjVar.h) || (kjVar = this.O5) == null) {
            return null;
        }
        return kjVar.M0();
    }

    public ij getExplanationLayout() {
        return this.f22666o3;
    }

    public float getExplanationX() {
        return this.f22717s5;
    }

    public float getExplanationY() {
        return this.f22730t5;
    }

    public int getExtraInsetHeight() {
        int i10;
        int i11 = this.f22741u3;
        boolean d22 = d2();
        sg.p0 p0Var = this.N;
        if (d22) {
            if (p0Var.f48461p) {
                i10 = 18;
            } else {
                i10 = 0;
            }
            i11 += org.telegram.messenger.i0.L(i10 + 2) + this.f22699r0.f22980r;
        }
        if (this.f22757v7) {
            i11 += getCommentButtonHeight();
        }
        if (!p0Var.f48461p) {
            this.O5.getClass();
            return i11 + p0Var.f48459n;
        }
        return i11;
    }

    public int getExtraTextX() {
        int i10 = uz.Y0;
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
        if (!this.O5.P3() && ((!this.A6 || this.f22616k3 != null) && (i10 = uz.Y0) > 11)) {
            return org.telegram.messenger.i0.L((i10 - 11) / 1.5f);
        }
        if (this.O5.P3() || !this.xb || !this.E6 || this.O5.D != 5) {
            return 0;
        }
        return (int) ((org.telegram.messenger.i0.f3(this.V6, t2()) - org.telegram.messenger.i0.f16176u) * 0.7f);
    }

    public StaticLayout getFactCheckLayout() {
        s1 s1Var = this.f22699r0;
        if (s1Var != null) {
            return s1Var.f22970g;
        }
        return null;
    }

    public String getFilename() {
        int i10;
        int i11;
        kj kjVar = this.O5;
        if (kjVar != null) {
            int i12 = kjVar.D;
            if (i12 == 1) {
                TLRPC.PhotoSize photoSize = this.f22517c4;
                if (photoSize != null) {
                    return org.telegram.messenger.b8.r(null, photoSize);
                }
            } else if (i12 != 8 && (i11 = this.K1) != 7 && i11 != 4 && i11 != 8 && i12 != 9 && i11 != 3 && i11 != 5) {
                if (i11 != 0) {
                    return org.telegram.messenger.b8.r(null, this.L1);
                }
                TLRPC.PhotoSize photoSize2 = this.f22517c4;
                if (photoSize2 != null) {
                    return org.telegram.messenger.b8.r(null, photoSize2);
                }
            } else if (!kjVar.C0) {
                if (kjVar.f16736w0 && !TextUtils.isEmpty(kjVar.f16690k.attachPath)) {
                    return this.O5.f16690k.attachPath;
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
        if (user != null && user.f19943id == 0) {
            f7 = this.f22795y7.r();
        } else {
            f7 = this.f22708r9 + this.H1;
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
        return this.f22566g1;
    }

    public float getLastTouchY() {
        return this.f22577h1;
    }

    public int getLayoutHeight() {
        return this.f22520c7;
    }

    public int getMaxNameWidth() {
        int min;
        int L;
        kj kjVar;
        kj kjVar2;
        int i10;
        int i11;
        float f7;
        int L2;
        int parentWidth;
        cj cjVar;
        int i12 = this.K1;
        if (i12 != 6 && i12 != 8 && (i10 = (kjVar2 = this.O5).D) != 5) {
            fj fjVar = this.K;
            int i13 = 0;
            if (fjVar != null && !fjVar.f15740i) {
                if (org.telegram.messenger.i0.Q1()) {
                    parentWidth = org.telegram.messenger.i0.Q0();
                } else {
                    parentWidth = getParentWidth();
                }
                i11 = 0;
                for (int i14 = 0; i14 < this.K.e.size(); i14++) {
                    if (((cj) this.K.e.get(i14)).f15160c != 0) {
                        break;
                    }
                    i11 = (int) (Math.ceil(((cjVar.e + cjVar.f15164j) / 1000.0f) * parentWidth) + i11);
                }
                if (this.V6) {
                    i13 = 71;
                } else if (V2()) {
                    i13 = 48;
                }
                L2 = org.telegram.messenger.i0.L(i13 + 31);
            } else if (i10 == 19) {
                int i15 = kjVar2.f16727t2;
                int L3 = org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(52.0f);
                if (this.E6) {
                    i13 = org.telegram.messenger.i0.L(48.0f);
                }
                return Math.max(i15, (int) ((L3 - i13) * 0.5f));
            } else {
                i11 = this.Z6;
                if (kjVar2.f16696l2 && kjVar2.P3() && V(this.O5)) {
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
            min = Math.min(getParentWidth(), org.telegram.messenger.i0.f16172q.y);
            if (this.V6) {
                f10 = 71.0f;
            } else if (V2()) {
                f10 = 42.0f;
            }
            L = org.telegram.messenger.i0.L(f10);
        }
        int i16 = min - L;
        kj kjVar3 = this.O5;
        if (kjVar3 != null && kjVar3.f16696l2 && kjVar3.P3() && V(this.O5)) {
            i16 -= org.telegram.messenger.i0.L(25.0f);
        }
        if (this.xb && ((kjVar = this.O5) == null || !kjVar.T4())) {
            return (i16 - (this.Z6 - (org.telegram.messenger.i0.f3(this.V6, t2()) - org.telegram.messenger.i0.f16176u))) - org.telegram.messenger.i0.L(57.0f);
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
    public kj getMessageObject() {
        kj kjVar = this.P5;
        if (kjVar != null) {
            return kjVar;
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
        float f7 = this.f22561f9 + this.f22549e9;
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
        float f7 = this.f22574g9;
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
        return getTopicSeparatorTopPadding() + this.V + this.f22576h0;
    }

    public int getParentWidth() {
        int i10;
        kj kjVar = this.O5;
        if (kjVar == null) {
            kjVar = this.P5;
        }
        if (kjVar != null && kjVar.f16718r1 && (i10 = this.K0) > 0) {
            return i10;
        }
        return org.telegram.messenger.i0.f16172q.x;
    }

    public float getPhotoBottom() {
        if (Y3()) {
            float f7 = this.f22497ac;
            if (f7 > 0.0f) {
                return f7;
            }
            return this.f22520c7 - org.telegram.messenger.i0.L(5.0f);
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
            L = (org.telegram.messenger.i0.L(3.0f) + this.f22506b7) - this.Z6;
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

    public kj getPrimaryMessageObject() {
        kj kjVar;
        kj kjVar2 = this.O5;
        if (kjVar2 != null && this.K != null && kjVar2.z2()) {
            kjVar = this.K.c();
        } else {
            kjVar = null;
        }
        if (kjVar != null) {
            return kjVar;
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
        fj fjVar = this.K;
        if (fjVar != null && !fjVar.d.isEmpty()) {
            return ((kj) this.K.d.get(0)).N1();
        }
        return this.O5.N1();
    }

    public org.telegram.ui.ActionBar.p6 getResourcesProvider() {
        return this.Ob;
    }

    public rn0 getSeekBarWaveform() {
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
        fj fjVar = this.K;
        if (fjVar != null) {
            ArrayList arrayList = fjVar.d;
            int size = arrayList.size();
            int i10 = 0;
            long j11 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                kj kjVar = (kj) obj;
                if (kjVar != null && (message2 = kjVar.f16690k) != null) {
                    j10 = message2.paid_message_stars;
                } else {
                    j10 = 0;
                }
                j11 += j10;
            }
            return j11;
        }
        kj kjVar2 = this.O5;
        if (kjVar2 == null || (message = kjVar2.f16690k) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        x1 x1Var = this.gb;
        if (x1Var.f23564z1) {
            return org.telegram.messenger.i0.W1(x1Var.L1, x1Var.f23560y1, this.V);
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
        return this.f22650n0;
    }

    public int getTextY() {
        return this.f22725t0;
    }

    public float getTimeAlpha() {
        return this.f22592i4;
    }

    public float getTimeX() {
        int i10;
        x1 x1Var = this.gb;
        if (x1Var.f23494i1) {
            i10 = org.telegram.messenger.i0.W1(x1Var.L1, x1Var.f23489h1, this.A9);
        } else {
            i10 = this.A9;
        }
        return i10;
    }

    public float getTimeY() {
        int i10;
        int i11 = 0;
        if (B3()) {
            if (this.f22757v7) {
                i11 = r2() ? getCommentButtonHeight() : org.telegram.messenger.i0.L(41.3f);
            }
        } else if (this.O5.r4()) {
            i10 = -org.telegram.messenger.i0.L(48.0f);
            if (this.f22492a7) {
                i10 -= org.telegram.messenger.i0.L(4.0f);
            }
            return Y1(i10);
        } else if (this.f22757v7) {
            i11 = r2() ? getCommentButtonHeight() : org.telegram.messenger.i0.L(43.0f);
        }
        i10 = -i11;
        return Y1(i10);
    }

    public int getTopMediaOffset() {
        kj kjVar = this.O5;
        if (kjVar != null && kjVar.D == 14) {
            return this.V1 + this.Sa;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        x1 x1Var = this.gb;
        if (x1Var.f23548v1) {
            return org.telegram.messenger.i0.W1(x1Var.L1, x1Var.f23545u1, this.f22553f0);
        }
        return this.f22553f0;
    }

    public x1 getTransitionParams() {
        return this.gb;
    }

    public float getVideoTranscriptionProgress() {
        kj kjVar;
        x1 x1Var = this.gb;
        if (x1Var == null || (kjVar = this.O5) == null || !kjVar.h4()) {
            return 1.0f;
        }
        if (x1Var.f23512m1) {
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
        fj fjVar;
        l1 l1Var = this.Qa;
        if (l1Var != null && (g22 = l1Var.g2()) != null && (g22.b() || g22.e())) {
            ArrayList arrayList = this.O5.f16750z2;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            wv wvVar = this.O5.f16738w2;
            if (wvVar != null && !wvVar.f19339n.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((z10 || a2() || z11) && ((this.f22601j1 || this.K != null) && (this.K == null || this.Qa.Q()))) {
                if (this.O5.z2() && (fjVar = this.K) != null && !fjVar.f15740i) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                            View childAt = viewGroup.getChildAt(i13);
                            if (childAt instanceof q1) {
                                q1 q1Var = (q1) childAt;
                                fj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                                cj currentPosition = q1Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.f15735a == this.K.f15735a && (currentPosition.f15166l & F()) != 0 && (currentPosition.f15166l & 1) != 0) {
                                    g22.f23417c = (int) q1Var.f22690q3;
                                    g22.d = (int) q1Var.f22702r3;
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
                    kj kjVar = this.O5;
                    if (kjVar != null && !kjVar.f16718r1 && (s1Var = this.f22699r0) != null && s1Var.f22970g != null && K1(motionEvent) >= this.f22687q0) {
                        g22.f22262r0 = false;
                        g22.f22264t0 = true;
                        g22.f22266v0 = false;
                        fj fjVar2 = this.K;
                        if (fjVar2 != null && !fjVar2.f15740i) {
                            i12 = (int) this.f22690q3;
                        } else {
                            float f7 = 12.0f;
                            if (this.O5.P3()) {
                                int extraTextX2 = getExtraTextX() + org.telegram.messenger.i0.L(12.0f) + this.L6;
                                if (this.O5.D == 19) {
                                    i12 = extraTextX2 - Math.max(0, (org.telegram.messenger.i0.L(14.0f) + (Math.max(this.V7, this.X7) + extraTextX2)) - org.telegram.messenger.i0.f16172q.x);
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
                        int L3 = ((int) (i12 + this.gb.f23488h0)) - org.telegram.messenger.i0.L(1.33f);
                        int i15 = this.f22687q0;
                        g22.f23417c = (org.telegram.messenger.i0.L(10.0f) + L3) - this.f22699r0.f22977o;
                        g22.d = org.telegram.messenger.i0.L(22.0f) + i15;
                    } else {
                        if (z11 && L2()) {
                            if (K1(motionEvent) < this.O5.f16738w2.t() + this.f22725t0) {
                                g22.f22262r0 = false;
                                g22.f22264t0 = false;
                                g22.f22266v0 = true;
                                int i16 = this.f22650n0;
                                int i17 = this.f22725t0;
                                g22.f23417c = i16;
                                g22.d = i17;
                            }
                        }
                        if (a2()) {
                            g22.f22262r0 = false;
                            g22.f22264t0 = false;
                            g22.f22266v0 = false;
                            g22.f23417c = (int) this.f22690q3;
                            g22.d = (int) this.f22702r3;
                        } else {
                            kj kjVar2 = this.O5;
                            if (kjVar2 != null && !kjVar2.f16718r1 && this.f22652n2 != null && (!this.f22726t1 ? K1(motionEvent) > this.W1 : K1(motionEvent) < this.f22725t0)) {
                                g22.f22262r0 = true;
                                g22.f22264t0 = false;
                                g22.f22266v0 = false;
                                if (this.R1) {
                                    i11 = this.f22663o0 - org.telegram.messenger.i0.L(10.0f);
                                } else {
                                    if (this.S1) {
                                        i10 = this.f22663o0;
                                        L = org.telegram.messenger.i0.L(1.0f);
                                    } else {
                                        i10 = this.f22663o0;
                                        L = org.telegram.messenger.i0.L(1.0f);
                                    }
                                    i11 = i10 + L;
                                }
                                int L4 = org.telegram.messenger.i0.L(10.0f) + i11 + this.Y1;
                                int i18 = this.W1;
                                g22.f23417c = L4;
                                g22.d = i18;
                            } else if (z11) {
                                g22.f22262r0 = false;
                                g22.f22264t0 = false;
                                g22.f22266v0 = true;
                                int i19 = this.f22650n0;
                                int i20 = this.f22725t0;
                                g22.f23417c = i19;
                                g22.d = i20;
                            } else {
                                g22.f22262r0 = false;
                                g22.f22264t0 = false;
                                g22.f22266v0 = false;
                                int i21 = this.f22650n0;
                                int i22 = this.f22725t0;
                                g22.f23417c = i21;
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
        kj kjVar;
        if (z10 || !z12 || (kjVar = this.O5) == null || !kjVar.f16648a0) {
            CheckBoxBase checkBoxBase = this.l1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z11, z12);
            }
            CheckBoxBase checkBoxBase2 = this.f22614k1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z10, z12);
            }
            aa0 aa0Var = this.Ra;
            float f7 = 0.0f;
            if (aa0Var.e == z11) {
                if (aa0Var.f24329f != z12 && !z12) {
                    if (z11) {
                        f7 = 1.0f;
                    }
                    aa0Var.d = f7;
                    aa0Var.f24329f = false;
                    return;
                }
                return;
            }
            aa0Var.e = z11;
            aa0Var.f24329f = z12;
            if (z12) {
                aa0Var.f24328c = SystemClock.elapsedRealtime();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                aa0Var.d = f7;
            }
            aa0Var.a();
            q1 q1Var = aa0Var.f24335m;
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
        if (this.f22777x1) {
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
                if (f7 >= this.f22590i2 - org.telegram.messenger.i0.L(6.0f) && f7 <= this.f22590i2 + this.f22567g2 + org.telegram.messenger.i0.L(6.0f)) {
                    float f10 = K1;
                    if (f10 >= this.f22602j2 - org.telegram.messenger.i0.L(2.0f) && f10 <= this.f22602j2 + this.f22578h2 + org.telegram.messenger.i0.L(2.0f)) {
                        dc dcVar = this.f22627l2;
                        if (dcVar != null) {
                            dcVar.c(true);
                        }
                        this.f22615k2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.f22615k2) {
                l1 l1Var = this.Qa;
                if (l1Var != null) {
                    l1Var.B1();
                }
                dc dcVar2 = this.f22627l2;
                if (dcVar2 != null) {
                    dcVar2.c(false);
                }
                playSoundEffect(0);
                this.f22615k2 = false;
            }
        }
        return false;
    }

    public final void i1(Canvas canvas, RectF rectF) {
        float f7;
        Path path = this.f22805z4;
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
        X1.setAlpha((int) (alpha2 * this.f22604j4 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, X1);
        X1.setAlpha(alpha2);
    }

    public final boolean i2() {
        kj kjVar = this.O5;
        if (kjVar != null && kjVar.N5()) {
            cj cjVar = this.L;
            if (cjVar != null) {
                int i10 = cjVar.f15166l;
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
        fp fpVar;
        q1 q1Var;
        if (this.O5.T2()) {
            Drawable t10 = this.T0.t();
            if (t10 instanceof ai0) {
                final ai0 ai0Var = (ai0) t10;
                String C0 = this.O5.C0();
                TLRPC.TL_messages_stickerSet n02 = vi.b0(this.Y5).n0(C0);
                if (n02 == null) {
                    vi.b0(this.Y5).c1(C0, true, true);
                    return false;
                }
                int D0 = this.O5.D0();
                if ("🎰".equals(this.O5.C0())) {
                    if (D0 >= 0 && D0 <= 64) {
                        dv0 dv0Var = (dv0) ai0Var;
                        if (dv0Var.U0 != null || dv0Var.V0) {
                            q1Var = this;
                        } else {
                            int i10 = D0 - 1;
                            int X = dv0.X(i10 & 3);
                            int X2 = dv0.X((i10 >> 2) & 3);
                            int X3 = dv0.X(i10 >> 4);
                            if (X == 4 && X2 == 4 && X3 == 4) {
                                X = 5;
                                X3 = 5;
                                X2 = 5;
                            }
                            dv0Var.f25593b1 = X;
                            dv0Var.f25594c1 = X2;
                            dv0Var.f25595d1 = X3;
                            kj messageObject = getMessageObject();
                            int i11 = getMessageObject().I1;
                            dv0Var.V0 = true;
                            q1Var = this;
                            Utilities.e.c(new bi.y2(dv0Var, n02, i11, messageObject, q1Var, z10));
                        }
                        if (q1Var.O5.N3()) {
                            ai0Var.S(Integer.MAX_VALUE, q1Var.f22661nb);
                        }
                        q1Var.O5.l1 = false;
                    } else {
                        q1Var = this;
                    }
                    if (ai0Var.m0 == null && !ai0Var.Y0 && n02.documents.size() > 0) {
                        dv0 dv0Var2 = (dv0) ai0Var;
                        if (dv0Var2.m0 == null && !dv0Var2.Y0) {
                            dv0Var2.Y0 = true;
                            Utilities.e.c(new i2.g1(dv0Var2, n02, getMessageObject().I1, getMessageObject(), q1Var, 13));
                            return true;
                        }
                    }
                } else {
                    if (ai0Var.m0 == null && !ai0Var.Y0 && n02.documents.size() > 0) {
                        TLRPC.Document document = n02.documents.get(0);
                        org.telegram.messenger.b8.G(this.Y5);
                        File K = org.telegram.messenger.b8.K(document, null, true, true);
                        if (ai0Var.m0 == null && !ai0Var.Y0) {
                            final String y22 = org.telegram.messenger.i0.y2(K, 0);
                            if (TextUtils.isEmpty(y22)) {
                                org.telegram.messenger.b6.q(this.Y5).a(org.telegram.messenger.b8.r(null, document), this.O5, this);
                                org.telegram.messenger.b8.G(this.Y5).X(document, n02, 1, 1);
                            } else {
                                ai0Var.Y0 = true;
                                Utilities.e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final ai0 ai0Var2 = ai0Var;
                                                String str = y22;
                                                if (ai0Var2.W0) {
                                                    org.telegram.messenger.i0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    ai0 ai0Var3 = ai0Var2;
                                                                    ai0Var3.Y0 = false;
                                                                    if (!ai0Var3.V0 && ai0Var3.W0) {
                                                                        ai0Var3.C(true);
                                                                        return;
                                                                    }
                                                                    ai0Var3.l();
                                                                    ai0Var3.I();
                                                                    ai0Var3.x();
                                                                    return;
                                                                default:
                                                                    ai0 ai0Var4 = ai0Var2;
                                                                    ai0Var4.V0 = false;
                                                                    if (!ai0Var4.Y0 && ai0Var4.W0) {
                                                                        ai0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                ai0Var2.U0 = RLottieNative.b(str, null, null, null);
                                                int i12 = 0;
                                                if (ai0Var2.U0 != null) {
                                                    i12 = ai0Var2.U0.f24121a[0];
                                                }
                                                if (ai0Var2.U0 != null) {
                                                    int i13 = ai0Var2.U0.f24121a[1];
                                                }
                                                org.telegram.messenger.i0.g3(new qq(ai0Var2, i12, 4));
                                                return;
                                            default:
                                                final ai0 ai0Var3 = ai0Var;
                                                ai0Var3.m0 = RLottieNative.b(y22, ai0Var3.e, null, null);
                                                org.telegram.messenger.i0.g3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                ai0 ai0Var32 = ai0Var3;
                                                                ai0Var32.Y0 = false;
                                                                if (!ai0Var32.V0 && ai0Var32.W0) {
                                                                    ai0Var32.C(true);
                                                                    return;
                                                                }
                                                                ai0Var32.l();
                                                                ai0Var32.I();
                                                                ai0Var32.x();
                                                                return;
                                                            default:
                                                                ai0 ai0Var4 = ai0Var3;
                                                                ai0Var4.V0 = false;
                                                                if (!ai0Var4.Y0 && ai0Var4.W0) {
                                                                    ai0Var4.C(true);
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
                        if (!z10 && this.O5.N3() && (fpVar = (fp) wp.r1(this.Y5).f19153i4.get(C0)) != null && fpVar.f15781b == D0) {
                            ai0Var.S(fpVar.f15780a, this.f22661nb);
                        }
                        TLRPC.Document document2 = n02.documents.get(Math.max(D0, 0));
                        org.telegram.messenger.b8.G(this.Y5);
                        File K2 = org.telegram.messenger.b8.K(document2, null, true, true);
                        if (ai0Var.U0 == null && !ai0Var.V0) {
                            final String y23 = org.telegram.messenger.i0.y2(K2, 0);
                            if (TextUtils.isEmpty(y23)) {
                                org.telegram.messenger.b6.q(this.Y5).a(org.telegram.messenger.b8.r(null, document2), this.O5, this);
                                org.telegram.messenger.b8.G(this.Y5).X(document2, n02, 1, 1);
                                this.O5.l1 = false;
                            } else {
                                if (z10 && ai0Var.Q == null && ai0Var.R == null && ai0Var.P == null) {
                                    ai0Var.J = 2;
                                    ai0Var.X0 = true;
                                }
                                ai0Var.V0 = true;
                                Utilities.e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final ai0 ai0Var2 = ai0Var;
                                                String str = y23;
                                                if (ai0Var2.W0) {
                                                    org.telegram.messenger.i0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    ai0 ai0Var32 = ai0Var2;
                                                                    ai0Var32.Y0 = false;
                                                                    if (!ai0Var32.V0 && ai0Var32.W0) {
                                                                        ai0Var32.C(true);
                                                                        return;
                                                                    }
                                                                    ai0Var32.l();
                                                                    ai0Var32.I();
                                                                    ai0Var32.x();
                                                                    return;
                                                                default:
                                                                    ai0 ai0Var4 = ai0Var2;
                                                                    ai0Var4.V0 = false;
                                                                    if (!ai0Var4.Y0 && ai0Var4.W0) {
                                                                        ai0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                ai0Var2.U0 = RLottieNative.b(str, null, null, null);
                                                int i12 = 0;
                                                if (ai0Var2.U0 != null) {
                                                    i12 = ai0Var2.U0.f24121a[0];
                                                }
                                                if (ai0Var2.U0 != null) {
                                                    int i13 = ai0Var2.U0.f24121a[1];
                                                }
                                                org.telegram.messenger.i0.g3(new qq(ai0Var2, i12, 4));
                                                return;
                                            default:
                                                final ai0 ai0Var3 = ai0Var;
                                                ai0Var3.m0 = RLottieNative.b(y23, ai0Var3.e, null, null);
                                                org.telegram.messenger.i0.g3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                ai0 ai0Var32 = ai0Var3;
                                                                ai0Var32.Y0 = false;
                                                                if (!ai0Var32.V0 && ai0Var32.W0) {
                                                                    ai0Var32.C(true);
                                                                    return;
                                                                }
                                                                ai0Var32.l();
                                                                ai0Var32.I();
                                                                ai0Var32.x();
                                                                return;
                                                            default:
                                                                ai0 ai0Var4 = ai0Var3;
                                                                ai0Var4.V0 = false;
                                                                if (!ai0Var4.Y0 && ai0Var4.W0) {
                                                                    ai0Var4.C(true);
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
        kj kjVar = this.O5;
        if (kjVar != null && imageReceiver == this.T0 && kjVar.J2()) {
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
                    if (z0Var.A && (yVar = z0Var.f31158q) != null) {
                        yVar.setHotspot(x10, K1);
                        z0Var.f31158q.setState(v21.N);
                        z0Var.f31159r.invalidate();
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
        kj kjVar = this.O5;
        ag.c2 c2Var = this.T0;
        if (kjVar != null && kjVar.D3() && (m10 = c2Var.m()) != null && (i10 = m10.d[4]) > 0) {
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
            xh0 xh0Var = this.f22787xc;
            x1 x1Var = this.gb;
            if (xh0Var != null && xh0Var.h) {
                this.Fc = 0.0f;
            } else {
                float f7 = i11 + i13 + x1Var.f23498j0;
                this.Fc = f7 - ((int) f7);
            }
            drawable.setBounds((int) (i10 + x1Var.f23488h0), (int) (i11 + x1Var.f23503k0), (int) (i10 + i12 + x1Var.f23493i0), (int) (i11 + i13 + x1Var.f23498j0));
        }
    }

    @Override
    public final boolean k() {
        return this.f22786xa;
    }

    public final boolean k0() {
        kj kjVar = this.O5;
        if (kjVar != null && kjVar.D == 17) {
            TLRPC.MessageMedia o12 = kj.o1(kjVar.f16690k);
            if (o12 instanceof TLRPC.TL_messageMediaPoll) {
                return ((TLRPC.TL_messageMediaPoll) o12).results.has_unread_votes;
            }
        }
        return false;
    }

    public final void k1(Canvas canvas, int i10) {
        int i11;
        ij ijVar;
        kj kjVar;
        l1 l1Var = this.Qa;
        int i12 = 0;
        if (l1Var != null) {
            if (!l1Var.k1(this, 1)) {
                this.f22792y4 = null;
                ArrayList arrayList = this.f22780x4;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < this.f22780x4.size(); i13++) {
                        o1 o1Var = (o1) this.f22780x4.get(i13);
                        if (!o1Var.f22377a.d()) {
                            o1Var.f22377a.a();
                        }
                    }
                }
            } else {
                CharacterStyle y12 = this.Qa.y1(this);
                if (y12 != this.f22792y4) {
                    this.f22792y4 = y12;
                    t80 t80Var = this.f22767w4;
                    if (t80Var != null) {
                        t80Var.a();
                        this.f22767w4 = null;
                    }
                    t80 t80Var2 = new t80();
                    this.f22767w4 = t80Var2;
                    t80Var2.D = true;
                    k80 k80Var = new k80(0);
                    t80 t80Var3 = this.f22767w4;
                    t80Var3.f30593y = k80Var;
                    t80Var3.k(5.0f);
                    ?? obj = new Object();
                    obj.f22377a = this.f22767w4;
                    obj.f22378b = -3;
                    if (this.f22780x4 == null) {
                        this.f22780x4 = new ArrayList();
                    }
                    this.f22780x4.add(obj);
                    if (this.f22792y4 != null && !C1(obj, k80Var, this.f22652n2, -2) && (((ijVar = this.f22616k3) == null || !D1(obj, k80Var, ijVar.e)) && (kjVar = this.O5) != null)) {
                        D1(obj, k80Var, kjVar.f16750z2);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.f22780x4;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            kj kjVar2 = this.O5;
            if (kjVar2 != null && kjVar2.P3()) {
                i11 = org.telegram.ui.ActionBar.t6.Ac;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.f21337ze;
            }
            int w02 = org.telegram.ui.ActionBar.t6.w0(i11, this.Ob);
            while (i12 < this.f22780x4.size()) {
                o1 o1Var2 = (o1) this.f22780x4.get(i12);
                if (o1Var2.f22378b == i10) {
                    t80 t80Var4 = o1Var2.f22377a;
                    t80Var4.g(org.telegram.ui.ActionBar.t6.r1(0.85f, w02), org.telegram.ui.ActionBar.t6.r1(2.0f, w02), org.telegram.ui.ActionBar.t6.r1(3.5f, w02), org.telegram.ui.ActionBar.t6.r1(6.0f, w02));
                    t80Var4.draw(canvas);
                    invalidate();
                    if (t80Var4.c()) {
                        this.f22780x4.remove(i12);
                        i12--;
                    }
                }
                i12++;
            }
        }
    }

    public final boolean k2() {
        ArrayList arrayList;
        ij ijVar = this.f22616k3;
        if (ijVar != null && (arrayList = ijVar.e) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (!((hj) obj).f16072y.isEmpty()) {
                    return true;
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().f16750z2 != null) {
            ArrayList arrayList2 = getMessageObject().f16750z2;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                if (!((hj) obj2).f16072y.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void k3() {
        this.f22769w6 = true;
        this.f22782x6 = 1000;
        this.f22807z6 = System.currentTimeMillis();
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    @Override
    public final boolean l() {
        fj fjVar = this.K;
        if (fjVar != null && fjVar.f15740i) {
            cj cjVar = this.L;
            if (cjVar != null && (cjVar.f15166l & 8) != 0) {
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
        float y3 = getY() + p0Var.f48451c;
        if (y3 <= f7 || (y3 + p0Var.f48458m) - org.telegram.messenger.i0.L(16.0f) >= i10) {
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
            hj hjVar = (hj) arrayList.get(i13);
            if (i10 >= hjVar.f16067n && i10 < hjVar.f16068r) {
                this.f22801z0 = i13;
                c3();
                try {
                    k80 X2 = X2();
                    X2.f27550c = true;
                    X2.d(hjVar.e, i10, 0.0f);
                    hjVar.e.getSelectionPath(i10, i11, X2);
                    X2.a();
                    float f7 = hjVar.f16070w + hjVar.h;
                    if (i11 >= hjVar.f16067n + i12) {
                        for (int i14 = i13 + 1; i14 < arrayList.size(); i14++) {
                            hj hjVar2 = (hj) arrayList.get(i14);
                            int i15 = hjVar2.f16068r - hjVar2.f16067n;
                            k80 X22 = X2();
                            X22.f27550c = true;
                            float f10 = f7 + hjVar2.f16066f;
                            X22.d(hjVar2.e, 0, f10);
                            f7 = f10 + hjVar2.f16070w + hjVar2.h;
                            hjVar2.e.getSelectionPath(0, i11 - hjVar2.f16067n, X22);
                            X22.a();
                            if (i11 < (hjVar.f16067n + i15) - 1) {
                                break;
                            }
                        }
                    }
                    if (this.A0) {
                        this.f22769w6 = true;
                        this.f22782x6 = 2500;
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                invalidate();
            } else {
                i13++;
            }
        }
        this.f22579h3 = -1;
        this.f22591i3 = -1;
    }

    public final void l3(byte[] bArr) {
        kj kjVar = this.P5;
        if (kjVar == null) {
            kjVar = this.O5;
        }
        if (kjVar == null) {
            this.f22639m3 = null;
            return;
        }
        sh0 sh0Var = this.f22639m3;
        if (sh0Var == null || !sh0Var.f30294f || !Arrays.equals(sh0Var.f30295g, bArr)) {
            this.f22639m3 = new sh0(this, kjVar.f1(), bArr);
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
        boolean z11 = this.f22773wb;
        float f10 = 1.0f;
        sg.p0 p0Var = this.N;
        if (z11) {
            p0Var.f48449a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.T4 && i2()) {
            if (p0Var.f48449a > 0.0f) {
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
            int i10 = (p0Var.f48449a > 0.0f ? 1 : (p0Var.f48449a == 0.0f ? 0 : -1));
            x1 x1Var = this.gb;
            if (i10 <= 0 && x1Var.f23555x0 && this.L == null && !this.f22773wb) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + x1Var.f23498j0);
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
        kj kjVar = this.P5;
        if (kjVar == null) {
            kjVar = this.O5;
        }
        this.A0 = false;
        ArrayList arrayList = this.f22754v4;
        if (kjVar != null && kjVar.f16690k.message != null && characterStyle != null) {
            if (this.f22616k3 != null && !TextUtils.isEmpty(kjVar.f16747z)) {
                CharSequence charSequence = kjVar.f16747z;
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
                        for (int i15 = 0; i15 < this.f22616k3.e.size(); i15++) {
                            hj hjVar = (hj) this.f22616k3.e.get(i15);
                            if (i13 >= hjVar.f16067n && i13 < hjVar.f16068r) {
                                this.f22801z0 = i15;
                                this.A0 = false;
                                c3();
                                try {
                                    k80 X2 = X2();
                                    X2.d(hjVar.e, i13, 0.0f);
                                    hjVar.e.getSelectionPath(i13, i12, X2);
                                    if (i12 >= hjVar.f16067n + i14) {
                                        for (int i16 = i15 + 1; i16 < this.f22616k3.e.size(); i16++) {
                                            hj hjVar2 = (hj) this.f22616k3.e.get(i16);
                                            int i17 = hjVar2.f16068r - hjVar2.f16067n;
                                            k80 X22 = X2();
                                            X22.d(hjVar2.e, 0, hjVar2.f16070w);
                                            hjVar2.e.getSelectionPath(0, i12 - hjVar2.f16067n, X22);
                                            if (i12 < (hjVar.f16067n + i17) - 1) {
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
            CharSequence charSequence2 = kjVar.v;
            if ((charSequence2 instanceof Spanned) && kjVar.f16750z2 != null) {
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
                    for (int i19 = 0; i19 < kjVar.f16750z2.size(); i19++) {
                        hj hjVar3 = (hj) kjVar.f16750z2.get(i19);
                        if (i11 >= hjVar3.f16067n && i11 < hjVar3.f16068r) {
                            this.f22801z0 = i19;
                            this.A0 = false;
                            c3();
                            try {
                                k80 X23 = X2();
                                X23.d(hjVar3.e, i11, 0.0f);
                                hjVar3.e.getSelectionPath(i11, i10, X23);
                                if (i10 >= hjVar3.f16067n + i18) {
                                    for (int i20 = i19 + 1; i20 < kjVar.f16750z2.size(); i20++) {
                                        hj hjVar4 = (hj) kjVar.f16750z2.get(i20);
                                        int i21 = hjVar4.f16068r - hjVar4.f16067n;
                                        k80 X24 = X2();
                                        X24.d(hjVar4.e, 0, hjVar4.f16070w);
                                        hjVar4.e.getSelectionPath(0, i10 - hjVar4.f16067n, X24);
                                        if (i10 < (hjVar3.f16067n + i21) - 1) {
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
                this.f22801z0 = -1;
                this.A0 = false;
                c3();
                invalidate();
            }
        } else if (!arrayList.isEmpty()) {
            this.f22801z0 = -1;
            this.A0 = false;
            c3();
            invalidate();
        }
    }

    @Override
    public final void n() {
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

    public final void n0(Bitmap bitmap, boolean z10) {
        boolean L4 = kj.L4(this.O5.f16690k);
        ag.c2 c2Var = this.T0;
        if (L4) {
            if (MediaController.B().I(this.O5)) {
                c2Var.f14409t0 = false;
                c2Var.Q0();
                return;
            }
            c2Var.f14409t0 = true;
            c2Var.P0(false);
            return;
        }
        if (z10) {
            kj kjVar = MediaController.B().f14483u0;
            if (kjVar != null && kjVar.h4()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        c2Var.f14409t0 = z10;
        if (bitmap != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
            c2Var.Y = null;
            c2Var.f14367a0 = null;
            c2Var.f14370b0 = null;
            c2Var.f14373c0 = null;
            c2Var.Z0.setShader(null);
            c2Var.N0(bitmapDrawable);
            c2Var.f14393m1 = true;
            c2Var.f14385h1 = 0.0f;
            c2Var.R0(c2Var.m0);
        }
        if (z10) {
            c2Var.P0(false);
        } else {
            c2Var.Q0();
        }
    }

    public final boolean n1(Canvas canvas) {
        boolean z10 = this.f22773wb;
        float f7 = 1.0f;
        sg.p0 p0Var = this.N;
        if (z10) {
            p0Var.f48449a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z11 = false;
        if (!this.T4 || !i2()) {
            return false;
        }
        if (p0Var.f48449a > 0.0f) {
            z();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z11 = true;
        }
        int i10 = (p0Var.f48449a > 0.0f ? 1 : (p0Var.f48449a == 0.0f ? 0 : -1));
        x1 x1Var = this.gb;
        if (i10 <= 0 && x1Var.f23555x0 && this.L == null && !this.f22773wb) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + x1Var.f23498j0);
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
        kj kjVar = this.P5;
        if (kjVar == null) {
            kjVar = this.O5;
        }
        if (kjVar == null) {
            this.f22639m3 = null;
            return;
        }
        sh0 sh0Var = this.f22639m3;
        if (sh0Var == null || !sh0Var.e || sh0Var.f30293c != (-i10)) {
            this.f22639m3 = new sh0(this, kjVar.f1(), i10);
        }
        this.A0 = true;
    }

    @Override
    public final void o(long j10, long j11) {
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
        if (j10 == j11 && ((this.L != null || ((message = this.O5.f16690k) != null && message.paid_message_stars > 0)) && rz.C(this.Y5).J(this.O5.f1()) && ((i10 = this.M3) == 1 || (i10 == 4 && this.K1 == 5)))) {
            this.R0 = true;
            getIconForCurrentState();
            radialProgress2.setIcon(6, false, true);
        }
        long j12 = this.f22790y1;
        if (j12 > 0 && Math.abs(j12 - j11) > 1048576) {
            this.f22790y1 = j11;
        }
        x0(j10, j11);
    }

    public final void o1(Canvas canvas, wv wvVar, float f7, ColorFilter colorFilter) {
        Canvas canvas2;
        int save;
        if (wvVar != null && f7 > 0.0f && wvVar.C()) {
            if (f7 < 1.0f) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f7 * 255.0f), 31);
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(this.f22650n0, this.f22725t0);
            wvVar.i(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public final boolean o2() {
        if (this.f22716s4.f10422a <= 0 && this.N.f48461p) {
            kj kjVar = this.O5;
            if (kjVar == null || !kjVar.f16718r1) {
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
        xa.n nVar = this.f22749uc;
        if (nVar != null) {
            nVar.a();
            this.f22749uc = null;
        }
        xa.n nVar2 = new xa.n(org.telegram.messenger.at.f(this.Y5), this);
        nVar2.e(org.telegram.messenger.at.E0);
        nVar2.h(org.telegram.messenger.at.f14744m1);
        nVar2.h(org.telegram.messenger.at.l1);
        nVar2.h(org.telegram.messenger.at.f14726i4);
        nVar2.h(org.telegram.messenger.at.W2);
        this.f22749uc = nVar2;
        kj kjVar = this.O5;
        if (kjVar != null) {
            kjVar.f16684i1 = false;
            wv wvVar = kjVar.f16738w2;
            if (wvVar != null) {
                wvVar.b(this);
            }
        }
        wv wvVar2 = this.gb.M0;
        if (wvVar2 != null) {
            wvVar2.b(this);
        }
        v1 v1Var = this.f22568g3;
        if (v1Var != null && (t8Var = v1Var.f23172b) != null) {
            t8Var.e();
        }
        w1 w1Var = this.f22752v2;
        if (w1Var != null && (hVar2 = w1Var.f23362m) != null) {
            hVar2.a();
        }
        w1 w1Var2 = this.f22752v2;
        if (w1Var2 != null && (hVar = w1Var2.f23363n) != null) {
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
        kj kjVar2 = this.P5;
        if (kjVar2 != null) {
            kjVar2.f16684i1 = false;
            q1Var = this;
            q1Var.r3(kjVar2, this.Q5, this.S5, this.R5, this.T5, this.U5);
            q1Var.P5 = null;
            q1Var.Q5 = null;
        } else {
            q1Var = this;
        }
        CheckBoxBase checkBoxBase = q1Var.l1;
        if (checkBoxBase != null) {
            checkBoxBase.f23915l = true;
        }
        CheckBoxBase checkBoxBase2 = q1Var.f22614k1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f23915l = true;
        }
        m11 m11Var = q1Var.f22541e0;
        if (m11Var != null) {
            m11Var.a();
        }
        CheckBoxBase checkBoxBase3 = q1Var.N7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f23915l = true;
        }
        if (q1Var.f22534d7 != null) {
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = q1Var.f22534d7;
                if (i11 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i11].f23915l = true;
                i11++;
            }
        }
        q1Var.N0 = true;
        float f11 = 0.0f;
        q1Var.Uc = 0.0f;
        q1Var.Tc = 0.0f;
        q1Var.f22688q1 = 0;
        V3();
        ImageReceiver imageReceiver = q1Var.f22795y7;
        imageReceiver.H0((View) getParent());
        imageReceiver.P();
        m1 m1Var = q1Var.f22551ec;
        if (m1Var != null) {
            m1Var.f22280b.P();
        }
        m1 m1Var2 = q1Var.f22564fc;
        if (m1Var2 != null) {
            m1Var2.f22280b.P();
        }
        P();
        kj kjVar3 = q1Var.O5;
        if (kjVar3 != null) {
            setAvatar(kjVar3);
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
            if ((i12 == 4 || i12 == 2) && q1Var.f22802z1) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            q1Var.C1 = f7;
        }
        if (getDelegate() != null && getDelegate().g2() != null) {
            l9 g22 = getDelegate().g2();
            g22.getClass();
            if (getMessageObject() != null && getMessageObject().f1() == g22.f23445w) {
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
        ArrayList arrayList2 = p0Var.f48464s;
        p0Var.D = true;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((sg.m0) arrayList2.get(i13)).a();
        }
        org.telegram.messenger.o6 o6Var = q1Var.f22635lb;
        if (o6Var != null) {
            o6Var.a();
        }
        n4 n4Var = q1Var.V5;
        if (n4Var != null) {
            ArrayList arrayList3 = n4Var.f22340c;
            if (!n4Var.C) {
                n4Var.C = true;
                nh.h hVar3 = n4Var.f22346l;
                if (hVar3 != null) {
                    hVar3.b(n4Var.f22338a);
                }
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    m4 m4Var = (m4) arrayList3.get(i14);
                    if (!m4Var.M) {
                        m4Var.M = true;
                        m4Var.f22304f.P();
                    }
                }
            }
        }
        N3();
        kj kjVar4 = q1Var.O5;
        if (kjVar4 != null && kjVar4.D == 20 && q1Var.V9 != null) {
            invalidate();
        }
        org.telegram.ui.Components.d5 d5Var = q1Var.f22673oa;
        if (d5Var != null) {
            d5Var.a();
        }
        org.telegram.ui.Components.d5 d5Var2 = q1Var.f22684pa;
        if (d5Var2 != null) {
            d5Var2.a();
        }
        nh.h hVar4 = q1Var.O9;
        if (hVar4 != null) {
            if (hVar4.f13835i) {
                nh.h S2 = S2();
                q1Var.O9 = S2;
                Integer num = q1Var.P9;
                if (num != null) {
                    S2.f13837k.put(this, num);
                }
            } else {
                hVar4.a(this);
            }
        }
        l0 l0Var = q1Var.f22762w;
        if (l0Var != null) {
            ArrayList arrayList4 = l0Var.f22218q;
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                ((k0) arrayList4.get(i15)).a();
            }
        }
        hw0 hw0Var = q1Var.f22542e1;
        if (hw0Var != null) {
            for (int i16 = 0; i16 < hw0Var.f26942b; i16++) {
                hw0Var.f26943c[i16].a(this);
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
        xa.n nVar = this.f22749uc;
        if (nVar != null) {
            nVar.a();
            this.f22749uc = null;
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
            checkBoxBase.f23915l = false;
        }
        w1 w1Var = this.f22752v2;
        if (w1Var != null && (hVar2 = w1Var.f23362m) != null) {
            hVar2.f8541b.R();
            hVar2.f8555y.f();
        }
        w1 w1Var2 = this.f22752v2;
        if (w1Var2 != null && (hVar = w1Var2.f23363n) != null) {
            hVar.f8541b.R();
            hVar.f8555y.f();
        }
        w1 w1Var3 = this.f22752v2;
        if (w1Var3 != null && (mVar = w1Var3.f23359j) != null) {
            mVar.b();
            this.f22752v2.f23359j = null;
        }
        wv wvVar = this.O5.f16738w2;
        if (wvVar != null) {
            wvVar.f(this);
        }
        x1 x1Var = this.gb;
        wv wvVar2 = x1Var.M0;
        if (wvVar2 != null) {
            wvVar2.f(this);
        }
        ArrayList arrayList = this.O4;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((p1) obj).b();
        }
        v1 v1Var = this.f22568g3;
        if (v1Var != null && (t8Var = v1Var.f23172b) != null) {
            t8Var.f();
        }
        CheckBoxBase checkBoxBase2 = this.f22614k1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f23915l = false;
        }
        if (this.f22534d7 != null) {
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.f22534d7;
                if (i11 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i11].f23915l = false;
                i11++;
            }
        }
        CheckBoxBase checkBoxBase3 = this.N7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f23915l = false;
        }
        this.N0 = false;
        n4 n4Var = this.V5;
        if (n4Var != null) {
            n4Var.e();
        }
        this.f22795y7.R();
        m1 m1Var = this.f22551ec;
        if (m1Var != null) {
            m1Var.f22280b.R();
        }
        m1 m1Var2 = this.f22564fc;
        if (m1Var2 != null) {
            m1Var2.f22280b.R();
        }
        m11 m11Var = this.f22541e0;
        if (m11Var != null) {
            m11Var.b();
        }
        P();
        if (this.E3 && (u1Var = this.f22712s0) != null && u1Var.d != null && u1Var.e != null) {
            ic D = ic.D();
            String str = this.f22712s0.d;
            if (str != null) {
                D.A.remove(str);
            }
            this.E3 = false;
        }
        hw0 hw0Var = this.f22542e1;
        if (hw0Var != null) {
            hw0Var.a(this);
        }
        org.telegram.messenger.b6.q(this.Y5).v(this);
        if (getDelegate() != null && getDelegate().g2() != null) {
            l9 g22 = getDelegate().g2();
            g22.getClass();
            if (getMessageObject() != null && getMessageObject().f1() == g22.f23445w) {
                g22.W = null;
            }
        }
        x1Var.f23551w0 = false;
        if (MediaController.B().I(this.O5)) {
            org.telegram.ui.ActionBar.t6.A0().f32479i = null;
        }
        ValueAnimator valueAnimator = this.f22723sb;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f22723sb.cancel();
        }
        this.N.p();
        this.f22710rb = false;
        org.telegram.messenger.o6 o6Var = this.f22635lb;
        if (o6Var != null) {
            o6Var.e();
        }
        org.telegram.ui.Components.d5 d5Var = this.f22673oa;
        if (d5Var != null) {
            d5Var.b();
        }
        org.telegram.ui.Components.d5 d5Var2 = this.f22684pa;
        if (d5Var2 != null) {
            d5Var2.b();
        }
        nh.h hVar3 = this.O9;
        if (hVar3 != null) {
            hVar3.b(this);
        }
        l0 l0Var = this.f22762w;
        if (l0Var != null) {
            ArrayList arrayList2 = l0Var.f22218q;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                k0 k0Var = (k0) arrayList2.get(i12);
                int i13 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = k0Var.f22106c;
                    if (i13 < imageReceiverArr.length) {
                        imageReceiverArr[i13].R();
                        i13++;
                    }
                }
            }
        }
        rf.g.d().f(this.f22812zc);
    }

    @Override
    public void onDraw(Canvas canvas) {
        b1(canvas);
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z10;
        hl0 X3 = X3();
        int i10 = 0;
        if (X3 != null && motionEvent.isFromSource(8194)) {
            float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.f22576h0 + this.f22725t0;
            motionEvent.offsetLocation(-this.f22650n0, -topicSeparatorTopPadding);
            Rect rect = X3.f17968b;
            if (X3.f26820d0 != null && X3.f26821e0) {
                motionEvent.offsetLocation((-rect.left) + X3.f26826j0, -rect.top);
                try {
                    if (motionEvent.getX() >= 0.0f && motionEvent.getX() < X3.u0() && motionEvent.getY() >= 0.0f && motionEvent.getY() < X3.f26825i0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    X3.f26820d0.m(motionEvent, z10);
                    motionEvent.offsetLocation(rect.left - X3.f26826j0, rect.top);
                } catch (Throwable th2) {
                    motionEvent.offsetLocation(rect.left - X3.f26826j0, rect.top);
                    throw th2;
                }
            }
            motionEvent.offsetLocation(this.f22650n0, topicSeparatorTopPadding);
        }
        int x10 = (int) motionEvent.getX();
        int K1 = (int) K1(motionEvent);
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            while (true) {
                SparseArray sparseArray = this.f22761vb;
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
        kj kjVar = this.O5;
        boolean z10 = true;
        if (kjVar == null || (!kjVar.I() && this.T3 == org.telegram.messenger.i0.f16172q.y)) {
            q1Var = this;
        } else {
            this.B0 = true;
            kj kjVar2 = this.O5;
            this.O5 = null;
            q1Var = this;
            q1Var.s3(kjVar2, this.K, this.F, this.E, this.G, false);
            q1Var.B0 = false;
        }
        T3();
        int i13 = q1Var.V + q1Var.f22553f0 + q1Var.f22576h0 + q1Var.f22738u0 + q1Var.f22763w0 + q1Var.f22527d0;
        zg.a draftMessageMeasureController = getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(q1Var.O5)) {
            int max = Math.max(0, (((draftMessageMeasureController.f55734a.getHeight() - draftMessageMeasureController.f55734a.getPaddingTop()) - draftMessageMeasureController.f55734a.getPaddingBottom()) - draftMessageMeasureController.d) - i13);
            if (max <= 0) {
                z10 = false;
            }
            draftMessageMeasureController.e = z10;
            if (draftMessageMeasureController.f55735b > 0 && !z10) {
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
            kj kjVar = this.O5;
            if (kjVar != null && (charSequence2 = kjVar.v) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.O5.v);
                return;
            }
            kj kjVar2 = this.O5;
            if (kjVar2 != null && (charSequence = kjVar2.f16747z) != null && charSequence.length() > 0) {
                viewStructure.setText(this.O5.f16747z);
            }
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean p() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.p():boolean");
    }

    public final int p0(kj kjVar, fj fjVar, boolean z10) {
        fj fjVar2 = fjVar;
        ag.c2 c2Var = this.T0;
        c2Var.f14397o0 = true;
        ImageReceiver imageReceiver = this.f22795y7;
        imageReceiver.f14397o0 = true;
        ImageReceiver imageReceiver2 = this.R7;
        imageReceiver2.f14397o0 = true;
        ImageReceiver imageReceiver3 = this.D7;
        imageReceiver3.f14397o0 = true;
        int i10 = 0;
        if (fjVar2 != null) {
            ArrayList arrayList = fjVar2.d;
            if (arrayList.size() != 1) {
                if (arrayList.size() != fjVar2.f15738f.size()) {
                    fjVar2.a();
                }
                this.Rc = 0;
                int i11 = 0;
                while (i10 < arrayList.size()) {
                    kj kjVar2 = (kj) arrayList.get(i10);
                    cj d = fjVar2.d(kjVar2);
                    if (d != null && (d.f15166l & 1) != 0) {
                        r3(kjVar2, fjVar2, false, false, false, false);
                        if (z10 && !TextUtils.isEmpty(this.f22653n3)) {
                            L3();
                            this.Rc = (int) (i11 + this.f22702r3);
                            this.Sc = this.f22616k3;
                        }
                        i11 = this.f22738u0 + this.f22763w0 + i11;
                    }
                    i10++;
                    fjVar2 = fjVar;
                }
                return i11;
            }
        }
        r3(kjVar, fjVar, false, false, false, false);
        c2Var.f14397o0 = false;
        imageReceiver.f14397o0 = false;
        imageReceiver2.f14397o0 = false;
        imageReceiver3.f14397o0 = false;
        L3();
        return this.f22738u0 + this.f22763w0;
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
                    TLRPC.Chat chat = this.f22722sa;
                    if (chat != null) {
                        q1Var = this;
                        l1Var3.T(q1Var, chat, this.O5.f16690k.fwd_from.channel_post, this.f22566g1, this.f22577h1, false);
                    } else {
                        q1Var = this;
                        TLRPC.User user = q1Var.f22696qa;
                        if (user != null) {
                            l1Var3.r0(this, user, q1Var.f22566g1, q1Var.f22577h1);
                        } else if (q1Var.f22735ta != null) {
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
                } else if (i10 == 2131296263 && q1Var.Qa != null && (arrayList = q1Var.O5.f16750z2) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i11);
                        i11++;
                        hj hjVar = (hj) obj;
                        if (hjVar.N) {
                            q1Var.Qa.J(hjVar);
                            break;
                        }
                    }
                }
            }
            if ((!kj.R4(q1Var.O5.f16690k) || q1Var.O5.h4() || (q1Var.O5.I3() && MediaController.B().I(q1Var.O5))) && q1Var.D4.g(null, i10, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        q1Var = this;
        if (!kj.R4(q1Var.O5.f16690k)) {
        }
        return true;
    }

    @Override
    public final void q(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.q(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    public final void q0(q1 q1Var) {
        if (q1Var == null) {
            return;
        }
        q1Var.f22533d6 = this.f22533d6;
        q1Var.q6 = this.q6;
        q1Var.f22559f6 = this.f22559f6;
        q1Var.f22571g6 = this.f22571g6;
        q1Var.f22582h6 = this.f22582h6;
        q1Var.f22594i6 = this.f22594i6;
        q1Var.f22606j6 = this.f22606j6;
        q1Var.f22619k6 = this.f22619k6;
        q1Var.f22630l6 = this.f22630l6;
        q1Var.f22642m6 = this.f22642m6;
        q1Var.f22656n6 = this.f22656n6;
        q1Var.f22669o6 = this.f22669o6;
        q1Var.f22705r6 = this.f22705r6;
        q1Var.f22718s6 = this.f22718s6;
        q1Var.f22731t6 = this.f22731t6;
        q1Var.U6 = this.U6;
        q1Var.V6 = this.V6;
        q1Var.W6 = this.W6;
        q1Var.X6 = this.X6;
        q1Var.Y6 = this.Y6;
    }

    public final void q1(Canvas canvas, Integer num, float f7, boolean z10) {
        cj cjVar = this.L;
        if (cjVar != null) {
            int i10 = cjVar.f15166l;
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
        fj fjVar;
        if (r2() && (fjVar = this.K) != null && this.L != null && !fjVar.f15736b && !fjVar.f15740i) {
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

    public final void r0(q1 q1Var) {
        nh.h hVar;
        if (q1Var != null && (hVar = q1Var.O9) != null) {
            int i10 = (Integer) hVar.f13837k.get(q1Var);
            if (i10 == null) {
                i10 = 0;
            }
            this.P9 = i10;
            nh.h hVar2 = this.O9;
            if (hVar2 != null) {
                hVar2.f13837k.put(this, i10);
            }
        }
    }

    public final void r1(km kmVar, Canvas canvas, int i10, Integer num, float f7) {
        cj cjVar = this.L;
        if (cjVar != null) {
            int i11 = cjVar.f15166l;
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
        kj kjVar;
        if (t2() && (kjVar = this.O5) != null && !kjVar.P3()) {
            return true;
        }
        return false;
    }

    public final void r3(org.telegram.messenger.kj r111, org.telegram.messenger.fj r112, boolean r113, boolean r114, boolean r115, boolean r116) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.r3(org.telegram.messenger.kj, org.telegram.messenger.fj, boolean, boolean, boolean, boolean):void");
    }

    @Override
    public final void requestLayout() {
        if (this.B0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(q1 q1Var) {
        q1Var.w3(this.f22662nc, this.f22686pc, this.qc, this.rc, this.f22724sc, this.K0, this.L0, this.f22510bb, this.f22524cb, this.f22675oc);
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
            canvas.drawRoundRect(rectF, f7, f7, org.telegram.ui.ActionBar.t6.f20999h2);
        }
    }

    public final boolean s2() {
        return r2();
    }

    public void s3(kj kjVar, fj fjVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.N0) {
            r3(kjVar, fjVar, z10, z11, z12, z13);
            return;
        }
        this.P5 = kjVar;
        this.Q5 = fjVar;
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
            this.f22563fb = f7;
            invalidate();
        } else {
            super.setAlpha(f7);
        }
        cj cjVar = this.L;
        if ((cjVar != null && (cjVar.f15160c != 0 || cjVar.f15158a != 0)) || ((this.f22788y && !kj.R4(this.O5.f16690k)) || this.O7 == null || this.P7 == null)) {
            cj cjVar2 = this.L;
            if (cjVar2 != null) {
                int i10 = cjVar2.f15166l;
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

    public void setAvatar(kj kjVar) {
        if (kjVar != null) {
            int i10 = kjVar.I1;
            if (!this.E6 && !c2()) {
                this.f22610ja = null;
                return;
            }
            Drawable drawable = kjVar.f16693k2;
            ImageReceiver imageReceiver = this.f22795y7;
            if (drawable != null) {
                imageReceiver.w0(drawable);
                return;
            }
            TLRPC.User user = this.ha;
            org.telegram.ui.Components.r8 r8Var = this.f22808z7;
            if (user != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null) {
                    this.f22610ja = userProfilePhoto.photo_small;
                } else {
                    this.f22610ja = null;
                }
                r8Var.r(user);
                imageReceiver.j0(this.ha, r8Var, null, tc.e(360928), 1, false);
                return;
            }
            TLRPC.Chat chat = this.ia;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    this.f22610ja = chatPhoto.photo_small;
                } else {
                    this.f22610ja = null;
                }
                if (chat.signature_profiles && kj.B0(kjVar.f16690k) != 1271266957) {
                    long o10 = org.telegram.messenger.o5.o(kjVar.f16690k.from_id);
                    if (o10 >= 0) {
                        TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(o10));
                        r8Var.r(Z1);
                        imageReceiver.i0(Z1, r8Var, null);
                        return;
                    }
                    TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(-o10));
                    r8Var.q(L0);
                    imageReceiver.i0(L0, r8Var, null);
                    return;
                }
                r8Var.q(this.ia);
                imageReceiver.i0(this.ia, r8Var, null);
            } else if (kjVar.r4()) {
                TLRPC.Photo photo = kjVar.T0;
                if (photo != null) {
                    imageReceiver.q0(jc.i(org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.L(50.0f), false, null, true), kjVar.T0), "50_50", r8Var, null, null, 0);
                }
            } else {
                this.f22610ja = null;
                r8Var.k(kjVar.Z0(), null, null, null);
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
        if (this.f22601j1 != z10) {
            this.f22601j1 = z10;
            invalidate();
        }
    }

    public void setEnterTransitionInProgress(boolean z10) {
        this.f22788y = z10;
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
        if (this.f22756v6 != z10) {
            this.f22756v6 = z10;
            if (z10) {
                this.f22639m3 = null;
            }
            if (!z10) {
                this.f22807z6 = System.currentTimeMillis();
                this.f22769w6 = true;
                this.f22782x6 = 300;
            } else {
                this.f22769w6 = false;
                this.f22782x6 = 0;
            }
            P3();
            if (this.A4) {
                this.C4.f30038o = v2();
            } else {
                this.B4.f28222p = v2();
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

    public void setMessageObjectInternal(org.telegram.messenger.kj r68) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.setMessageObjectInternal(org.telegram.messenger.kj):void");
    }

    public void setOverrideInvalidate(Runnable runnable) {
        this.Ac = runnable;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        P3();
        if (this.A4) {
            this.C4.f30038o = v2();
        } else {
            this.B4.f28222p = v2();
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
        jl0 jl0Var = this.f22502b3;
        if (jl0Var != null) {
            jl0Var.f27453n = p6Var;
        }
    }

    public void setScrimReaction(Integer num) {
        this.N.f48470z = num;
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
        ij ijVar = this.f22616k3;
        if (ijVar != null && ijVar.e != null) {
            for (int i11 = 0; i11 < this.f22616k3.e.size(); i11++) {
                hj hjVar = (hj) this.f22616k3.e.get(i11);
                for (int i12 = 0; i12 < hjVar.f16072y.size(); i12++) {
                    ((nh.i) hjVar.f16072y.get(i12)).invalidateSelf();
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().f16750z2 != null) {
            for (int i13 = 0; i13 < getMessageObject().f16750z2.size(); i13++) {
                hj hjVar2 = (hj) getMessageObject().f16750z2.get(i13);
                for (int i14 = 0; i14 < hjVar2.f16072y.size(); i14++) {
                    ((nh.i) hjVar2.f16072y.get(i14)).invalidateSelf();
                }
            }
        }
    }

    public void setTimeAlpha(float f7) {
        this.f22592i4 = f7;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
    }

    public final void t0() {
        if (this.f22595i7 == null) {
            this.f22595i7 = new ImageReceiver[3];
            this.f22607j7 = new org.telegram.ui.Components.r8[3];
            this.f22620k7 = new boolean[3];
            int i10 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.f22595i7;
                if (i10 < imageReceiverArr.length) {
                    imageReceiverArr[i10] = new ImageReceiver(this);
                    this.f22595i7[i10].J0(org.telegram.messenger.i0.L(12.0f));
                    this.f22607j7[i10] = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                    this.f22607j7[i10].u(org.telegram.messenger.i0.L(18.0f));
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
        fj fjVar;
        if ((!this.C8 || z10) && this.D8 != 0) {
            cj cjVar = this.L;
            if (cjVar == null || (fjVar = this.K) == null || !fjVar.f15740i || cjVar.h) {
                boolean P3 = this.O5.P3();
                x1 x1Var = this.gb;
                if (P3) {
                    float L2 = x1Var.f23499j1 - org.telegram.messenger.i0.L(40.0f);
                    this.P8 = L2;
                    fj fjVar2 = this.K;
                    if (fjVar2 != null) {
                        this.P8 = (fjVar2.f15744m.e - this.Uc) + L2;
                    }
                } else {
                    float L3 = org.telegram.messenger.i0.L(8.0f) + x1Var.f23504k1;
                    this.P8 = L3;
                    fj fjVar3 = this.K;
                    if (fjVar3 != null) {
                        this.P8 = (fjVar3.f15744m.f15575g - this.Uc) + L3;
                    }
                    if (r2()) {
                        this.P8 = Math.min(this.P8, getCompactRight() - org.telegram.messenger.i0.L(32.0f));
                    }
                }
                float f15 = 0.0f;
                if (this.D8 == 4) {
                    this.Q8 = org.telegram.messenger.i0.L(6.0f);
                } else {
                    float L4 = (this.f22520c7 + x1Var.f23498j0) - org.telegram.messenger.i0.L(41.0f);
                    this.Q8 = L4;
                    kj kjVar = this.O5;
                    if (kjVar.D == 19 && kjVar.f16727t2 < this.f22810z9) {
                        this.Q8 = L4 - org.telegram.messenger.i0.L(22.0f);
                    }
                    fj fjVar4 = this.K;
                    if (fjVar4 != null) {
                        float f16 = this.Q8;
                        ej ejVar = fjVar4.f15744m;
                        float f17 = f16 + ejVar.h;
                        this.Q8 = f17;
                        if (ejVar.f15577j) {
                            this.Q8 = f17 - getTranslationY();
                        }
                    }
                    if (this.O5.N5()) {
                        sg.p0 p0Var = this.N;
                        p0Var.getClass();
                        if (this.f22773wb) {
                            this.Q8 -= (1.0f - getVideoTranscriptionProgress()) * p0Var.i(x1Var.L1);
                        } else if (p0Var.f48449a > 0.0f) {
                            this.Q8 -= p0Var.i(x1Var.L1);
                        }
                    }
                }
                if (this.D8 != 4) {
                    float L5 = ((this.f22520c7 + x1Var.f23498j0) - org.telegram.messenger.i0.L(32.0f)) / 2.0f;
                    if (this.Q8 < L5) {
                        this.Q8 = L5;
                    }
                }
                if (this.O5.D == 19) {
                    if (this.D8 == 3 && this.f22631l7 != null) {
                        this.Q8 = org.telegram.messenger.i0.L(18.0f);
                    } else {
                        this.Q8 = 0.0f;
                    }
                }
                if (!this.O5.P3() && this.f22773wb && !this.P1) {
                    if (this.E6) {
                        L = (org.telegram.messenger.i0.f3(this.V6, t2()) - org.telegram.messenger.i0.f16176u) * 0.7f;
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
                    if (x1Var.f23509l2) {
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
                    if (!this.f22788y || kj.R4(this.O5.f16690k)) {
                        S0(canvas, 1.0f);
                    }
                } else if (!vu0.f31908e0) {
                    float f18 = this.P8;
                    float f19 = this.Q8;
                    float L6 = org.telegram.messenger.i0.L(32.0f) + f18;
                    float f20 = this.Q8;
                    if (this.F8 == 5) {
                        f7 = 64.0f;
                    } else {
                        f7 = 32.0f;
                    }
                    RectF rectF = this.f22489a4;
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
                        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.f20999h2);
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
        kj kjVar = this.O5;
        if (kjVar != null) {
            return kjVar.P2();
        }
        return org.telegram.ui.ActionBar.t6.i1(this.Ob);
    }

    public final void t3(int i10) {
        this.f22649n = i10;
    }

    public final int u0(int i10, kj kjVar) {
        TLRPC.WebPage webPage;
        TLRPC.Document document;
        boolean z10;
        int i11;
        a1 a1Var;
        a1 a1Var2;
        int i12 = i10;
        TLRPC.MessageMedia messageMedia = kjVar.Y0;
        if (messageMedia != null) {
            this.L1 = messageMedia.document;
        } else if (kjVar.D == 0) {
            TLRPC.MessageMedia o12 = kj.o1(kjVar.f16690k);
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
            this.L1 = kjVar.F0();
        }
        TLRPC.Document document2 = this.L1;
        int i13 = 0;
        if (document2 != null) {
            double d = 0.0d;
            if (kj.Q4(document2)) {
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
                T2(kjVar);
                int L = org.telegram.messenger.i0.L(174.0f) + this.f22797y9;
                if (!this.P1) {
                    this.Z6 = Math.min(i12, L + ((int) Math.ceil(org.telegram.ui.ActionBar.t6.N2.measureText(org.telegram.messenger.i0.g0((int) d, true, false)))));
                }
                this.C4.f30036m = kjVar;
                return 0;
            } else if (kj.K4(this.L1)) {
                this.K1 = 4;
                if (!kjVar.m5()) {
                    O3();
                    String i02 = org.telegram.messenger.i0.i0(this.L1.size, false, false);
                    this.f22530d3 = (int) Math.ceil(org.telegram.ui.ActionBar.t6.C2.measureText(i02));
                    this.f22516c3 = new StaticLayout(i02, org.telegram.ui.ActionBar.t6.C2, this.f22530d3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return 0;
                }
            } else if (kj.J3(this.L1)) {
                A1();
                this.K1 = 5;
                int L2 = i12 - org.telegram.messenger.i0.L(92.0f);
                if (L2 < 0) {
                    L2 = org.telegram.messenger.i0.L(100.0f);
                }
                int i15 = L2;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(kjVar.z1(true).replace('\n', ' '), org.telegram.ui.ActionBar.t6.O2, i15 - org.telegram.messenger.i0.L(12.0f), truncateAt);
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
                this.I4.f21662f = new StaticLayout(TextUtils.ellipsize(kjVar.x1(true).replace('\n', ' '), org.telegram.ui.ActionBar.t6.P2, i15, truncateAt), org.telegram.ui.ActionBar.t6.P2, i15, alignment, 1.0f, 0.0f, false);
                if (this.I4.f21662f.getLineCount() > 0) {
                    this.I4.f21663g = -((int) Math.ceil(a1Var.f21662f.getLineLeft(0)));
                    int lineWidth2 = (int) this.I4.f21662f.getLineWidth(0);
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
            } else if (kj.s3(this.L1, kjVar.z2())) {
                this.K1 = 2;
                if (!kjVar.m5()) {
                    String L0 = dd.L0(2131753971, "AttachGif");
                    this.A3 = (int) Math.ceil(org.telegram.ui.ActionBar.t6.C2.measureText(L0));
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.t6.C2;
                    int i17 = this.A3;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    this.f22753v3 = new StaticLayout(L0, textPaint2, i17, alignment2, 1.0f, 0.0f, false);
                    String i03 = org.telegram.messenger.i0.i0(this.L1.size, false, false);
                    this.f22530d3 = (int) Math.ceil(org.telegram.ui.ActionBar.t6.C2.measureText(i03));
                    this.f22516c3 = new StaticLayout(i03, org.telegram.ui.ActionBar.t6.C2, this.f22530d3, alignment2, 1.0f, 0.0f, false);
                }
            } else {
                String str = this.L1.mime_type;
                if ((str != null && (str.toLowerCase().startsWith("image/") || this.L1.mime_type.toLowerCase().startsWith("video/mp4"))) || kj.W2(this.L1)) {
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
                    B = dd.L0(2131753975, "AttachDocument");
                }
                StaticLayout c10 = pv0.c(B, org.telegram.ui.ActionBar.t6.G2, i18, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.MIDDLE, i18, 2, false);
                this.f22516c3 = c10;
                this.f22544e3 = Integer.MIN_VALUE;
                if (c10 != null && c10.getLineCount() > 0) {
                    int i19 = 0;
                    for (int i20 = 0; i20 < this.f22516c3.getLineCount(); i20++) {
                        i19 = Math.max(i19, (int) Math.ceil(this.f22516c3.getLineWidth(i20)));
                        this.f22544e3 = Math.max(this.f22544e3, (int) Math.ceil(-this.f22516c3.getLineLeft(i20)));
                    }
                    i11 = Math.min(i18, i19);
                } else {
                    this.f22544e3 = 0;
                    i11 = i18;
                }
                int min = Math.min(i18 - org.telegram.messenger.i0.L(30.0f), (int) Math.ceil(org.telegram.ui.ActionBar.t6.C2.measureText("000.0 mm / ".concat(org.telegram.messenger.i0.i0(this.L1.size, false, false)))));
                this.A3 = min;
                CharSequence ellipsize2 = TextUtils.ellipsize(org.telegram.messenger.i0.i0(this.L1.size, false, false) + " " + org.telegram.messenger.b8.A(this.L1), org.telegram.ui.ActionBar.t6.C2, min, TextUtils.TruncateAt.END);
                try {
                    if (this.A3 < 0) {
                        this.A3 = org.telegram.messenger.i0.L(10.0f);
                    }
                    this.f22753v3 = new StaticLayout(ellipsize2, org.telegram.ui.ActionBar.t6.C2, this.A3 + org.telegram.messenger.i0.L(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                if (this.M1) {
                    this.f22517c4 = org.telegram.messenger.b8.w(kjVar.f16701n0, 320, false, null, false);
                    this.f22531d4 = org.telegram.messenger.b8.w(kjVar.f16701n0, 40, false, null, false);
                    if (this.O5.x3() || (org.telegram.messenger.b6.q(this.Y5).l() & 1) == 0) {
                        this.f22517c4 = null;
                    }
                    TLRPC.PhotoSize photoSize = this.f22517c4;
                    ag.c2 c2Var = this.T0;
                    if (photoSize != null && photoSize != this.f22531d4) {
                        BitmapDrawable bitmapDrawable = this.O5.G1;
                        if (bitmapDrawable != null) {
                            this.f22531d4 = null;
                            this.f22545e4 = bitmapDrawable;
                        }
                    } else {
                        this.f22517c4 = null;
                        c2Var.F0 = true;
                        c2Var.G0 = true;
                    }
                    this.f22557f4 = "86_86_b";
                    c2Var.r0(jc.f(this.f22517c4, kjVar.f16695l0), "86_86", jc.f(this.f22531d4, kjVar.f16695l0), this.f22557f4, this.f22545e4, 0L, null, kjVar, 1);
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
        kj kjVar;
        boolean z17 = (f12 == 1.0f || z15) ? false : true;
        float f17 = (f12 * 0.5f) + 0.5f;
        float f18 = z17 ? f7 * f12 : f7;
        if (this.K1 != 7 || ((kjVar = this.O5) != null && kjVar.g4())) {
            photoBottom = getPhotoBottom() + this.f22750v0;
        } else {
            photoBottom = f11 - ((1.0f - getVideoTranscriptionProgress()) * (this.N.i(this.gb.L1) + org.telegram.messenger.i0.L(this.J ? 4.0f : 5.0f)));
        }
        float L3 = photoBottom - org.telegram.messenger.i0.L(8.5f);
        kj kjVar2 = this.O5;
        float L4 = (kjVar2 == null || !kjVar2.M2()) ? 0.0f : org.telegram.messenger.i0.L(-6.0f);
        float f19 = 22.0f;
        if (z12) {
            qb0 qb0Var = org.telegram.ui.ActionBar.t6.E3;
            if (B3()) {
                if (this.O5.O5()) {
                    f13 = 1.0f;
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, this.Ob);
                    int i11 = this.f22506b7;
                    f16 = z14 ? 24.0f : 22.0f;
                    qb0Var.getClass();
                    f15 = 4.0f;
                    z.u(qb0Var, ((i11 - org.telegram.messenger.i0.L(f16)) - org.telegram.messenger.i0.L(12.0f)) + L4, (L3 - org.telegram.messenger.i0.L(12.0f)) + f10);
                    qb0Var.setAlpha((int) (this.f22592i4 * 255.0f * f18));
                } else {
                    f13 = 1.0f;
                    f15 = 4.0f;
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21009hd, this.Ob);
                    int i12 = this.f22506b7;
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
                z.u(qb0Var, (this.f22506b7 - org.telegram.messenger.i0.L(18.5f)) - org.telegram.messenger.i0.L(12.0f), ((f11 - org.telegram.messenger.i0.L(8.5f)) - org.telegram.messenger.i0.L(12.0f)) + f10);
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
                        z.u(drawable, ((this.f22506b7 - org.telegram.messenger.i0.L(z14 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f10);
                    } else {
                        z.u(drawable, ((this.f22506b7 - org.telegram.messenger.i0.L(z14 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f10);
                    }
                    drawable.setAlpha((int) (this.f22592i4 * 255.0f * f18));
                } else {
                    if (z10) {
                        if (z15) {
                            canvas.translate((f13 - f12) * org.telegram.messenger.i0.L(4.8f), 0.0f);
                        }
                        z.u(org.telegram.ui.ActionBar.t6.F3, (this.f22506b7 - org.telegram.messenger.i0.L(z14 ? 28.3f : 26.3f)) - org.telegram.ui.ActionBar.t6.F3.getIntrinsicWidth(), (L3 - org.telegram.ui.ActionBar.t6.F3.getIntrinsicHeight()) + f10);
                    } else {
                        z.u(org.telegram.ui.ActionBar.t6.F3, (this.f22506b7 - org.telegram.messenger.i0.L(z14 ? 23.5f : 21.5f)) - org.telegram.ui.ActionBar.t6.F3.getIntrinsicWidth(), (L3 - org.telegram.ui.ActionBar.t6.F3.getIntrinsicHeight()) + f10);
                    }
                    org.telegram.ui.ActionBar.t6.F3.setAlpha((int) (this.f22592i4 * 255.0f * f18));
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
                    z.u(W1, ((this.f22506b7 - org.telegram.messenger.i0.L(22.5f)) - W1.getIntrinsicWidth()) + L4, ((f11 - org.telegram.messenger.i0.L((this.F || this.E) ? 9.0f : 8.0f)) - W1.getIntrinsicHeight()) + f10);
                } else {
                    W1 = W1(z16 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    z.u(W1, ((this.f22506b7 - org.telegram.messenger.i0.L(f14)) - W1.getIntrinsicWidth()) + L4, ((f11 - org.telegram.messenger.i0.L((this.F || this.E) ? 9.0f : 8.0f)) - W1.getIntrinsicHeight()) + f10);
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
                z.u(W12, ((this.f22506b7 - org.telegram.messenger.i0.L(z14 ? 23.5f : 21.5f)) - W12.getIntrinsicWidth()) + L4, (L3 - W12.getIntrinsicHeight()) + f10);
                W12.setAlpha((int) (this.f22592i4 * 255.0f * f18));
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
                z.u(W13, (this.f22506b7 - org.telegram.messenger.i0.L(18.0f)) - W13.getIntrinsicWidth(), ((f11 - org.telegram.messenger.i0.L((this.F || this.E) ? 9.0f : 8.0f)) - W13.getIntrinsicHeight()) + f10);
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
                L = this.f22506b7 - org.telegram.messenger.i0.L(34.5f);
                L2 = org.telegram.messenger.i0.L(26.5f);
            } else {
                L = this.f22506b7 - org.telegram.messenger.i0.L(32.0f);
                if (!this.F && !this.E) {
                    f19 = 21.0f;
                }
                L2 = org.telegram.messenger.i0.L(f19);
            }
            float f20 = (f11 - L2) + f10;
            RectF rectF = this.f22489a4;
            rectF.set((int) (L + L4), f20, org.telegram.messenger.i0.L(14.0f) + i10, org.telegram.messenger.i0.L(14.0f) + f20);
            int alpha = org.telegram.ui.ActionBar.t6.f20888b2.getAlpha();
            org.telegram.ui.ActionBar.t6.f20888b2.setAlpha((int) (alpha * f18));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(f13), org.telegram.messenger.i0.L(f13), org.telegram.ui.ActionBar.t6.f20888b2);
            org.telegram.ui.ActionBar.t6.f20888b2.setAlpha(alpha);
            z.u(org.telegram.ui.ActionBar.t6.f21037j4, org.telegram.messenger.i0.L(6.0f) + i10, f20 + org.telegram.messenger.i0.L(2.0f));
            org.telegram.ui.ActionBar.t6.f21037j4.setAlpha((int) (f18 * 255.0f));
            if (z17) {
                canvas.save();
                canvas.scale(f17, f17, org.telegram.ui.ActionBar.t6.f21037j4.getBounds().centerX(), org.telegram.ui.ActionBar.t6.f21037j4.getBounds().centerY());
            }
            org.telegram.ui.ActionBar.t6.f21037j4.draw(canvas);
            org.telegram.ui.ActionBar.t6.f21037j4.setAlpha(255);
            if (z17) {
                canvas.restore();
            }
        }
    }

    public final boolean u2(kj kjVar) {
        int i10 = kj.o1(this.O5.f16690k).period;
        int currentTime = ConnectionsManager.getInstance(this.Y5).getCurrentTime();
        if (i10 == Integer.MAX_VALUE) {
            return false;
        }
        if (i10 % 60 == 0) {
            if (Math.abs(currentTime - kjVar.f16690k.date) <= i10) {
                return false;
            }
            return true;
        } else if (Math.abs(currentTime - kjVar.f16690k.date) <= i10 - 5) {
            return false;
        } else {
            return true;
        }
    }

    public final void u3(int i10, int i11) {
        org.telegram.ui.ActionBar.c5 c5Var;
        this.K0 = i10;
        this.L0 = i11;
        this.f22496ab = i11;
        if ((this.O5 != null && e2() && this.O5.O5()) || ((c5Var = this.J6) != null && c5Var.f20211a != null)) {
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
        if (((isPressed() && this.B6) || ((!this.B6 && this.f22744u6) || this.f22756v6)) && !F3() && !j2()) {
            kj kjVar = this.O5;
            if (kjVar == null || !kjVar.f16718r1) {
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
        this.f22711s = z11;
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
            if (drawable != drawableArr[0] && drawable != this.f22766w3 && drawable != drawableArr[1]) {
                t1 t1Var = this.X0;
                if (t1Var != null) {
                    yVar = t1Var.f23085x;
                } else {
                    yVar = null;
                }
                if (drawable == yVar || drawable == this.T2 || drawable == this.Ia || ((drawable != null && (((m1Var = this.f22551ec) != null && drawable == m1Var.f22286k) || (((m1Var2 = this.f22564fc) != null && drawable == m1Var2.f22286k) || ((m1Var3 = this.Lc) != null && drawable == m1Var3.f22286k)))) || ((this.N != null && (drawable instanceof org.telegram.ui.Components.e6)) || (drawable instanceof t80)))) {
                    return true;
                }
                w1 w1Var = this.f22752v2;
                if (w1Var == null || (aVar = w1Var.f23361l) == null || (drawable != aVar && drawable != aVar.f11384a)) {
                    ArrayList arrayList = this.O4;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        p1 p1Var = (p1) obj;
                        if (p1Var.f22440w != drawable && ((bVar = p1Var.f22441x) == null || (drawable != bVar && drawable != bVar.f11374a && drawable != bVar.f11375b))) {
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
        if (this.f22714s2) {
            z0(0);
        }
        if (this.f22714s2 && this.f22678p2 == null) {
            this.B2 = org.telegram.messenger.i0.L(33.0f);
            CharSequence charSequence = this.f22778x2;
            if (charSequence == null) {
                int i11 = this.f22765w2;
                if (i11 == 12) {
                    charSequence = dd.L0(2131747824, null);
                } else if (i11 == 1) {
                    charSequence = dd.L0(2131747828, null);
                } else if (i11 == 29) {
                    charSequence = dd.L0(2131747825, null);
                } else if (i11 == 13) {
                    charSequence = dd.L0(2131745618, null).toUpperCase();
                } else if (i11 == 32) {
                    charSequence = dd.L0(2131747802, null).toUpperCase();
                } else if (i11 == 85) {
                    charSequence = dd.L0(2131747832, null);
                } else if (i11 == 10) {
                    charSequence = dd.L0(2131747829, null);
                } else if (i11 == 2) {
                    charSequence = dd.L0(2131747816, null);
                } else if (i11 == 3) {
                    charSequence = dd.L0(2131747803, null);
                } else if (i11 == 5) {
                    charSequence = dd.L0(2131743582, null);
                } else if (i11 == 6) {
                    charSequence = dd.L0(2131747830, null);
                } else if (i11 == 7) {
                    charSequence = dd.L0(2131747800, null);
                } else if (i11 != 9 && i11 != 11) {
                    if (i11 == 25) {
                        charSequence = dd.L0(2131743393, null);
                    } else if (i11 == 14) {
                        charSequence = dd.L0(2131743584, null).toUpperCase();
                    } else if (i11 == 15) {
                        charSequence = dd.L0(2131752918, null).toUpperCase();
                    } else if (i11 == 16) {
                        charSequence = dd.L0(2131747805, null).toUpperCase();
                    } else if (i11 == 17) {
                        charSequence = dd.L0(2131743567, null).toUpperCase();
                    } else if (i11 != 18 && i11 != 22) {
                        if (i11 == 19) {
                            charSequence = dd.L0(2131753346, null);
                        } else if (i11 == 20) {
                            charSequence = dd.L0(2131747820, null);
                        } else if (i11 == 21) {
                            charSequence = dd.L0(2131754230, null);
                        } else if (i11 == 23) {
                            charSequence = dd.L0(2131747801, null);
                        } else if (i11 == 24) {
                            charSequence = dd.L0(2131747823, null);
                        } else if (i11 == 26) {
                            TL_stars.StarGift starGift = this.f22540dd;
                            if (starGift != null) {
                                if (starGift.auction_start_date > ConnectionsManager.getInstance(this.Y5).getCurrentTime()) {
                                    charSequence = dd.L0(2131747817, null);
                                    z10 = false;
                                } else {
                                    if (this.f22540dd.sold_out) {
                                        charSequence = dd.L0(2131747818, null);
                                    } else {
                                        charSequence = dd.L0(2131747819, null);
                                    }
                                    z10 = true;
                                }
                                if (z10) {
                                    SpannableString spannableString = new SpannableString("*");
                                    spannableString.setSpan(new dq(2131231117, 0), 0, spannableString.length(), 33);
                                    charSequence = TextUtils.concat(spannableString, " ", charSequence);
                                }
                            } else {
                                charSequence = dd.L0(2131747799, null);
                            }
                        } else if (i11 == 27) {
                            charSequence = dd.L0(2131749090, null).toUpperCase();
                        } else if (i11 == 28) {
                            charSequence = dd.L0(2131743583, null);
                        } else {
                            charSequence = dd.L0(2131749202, null);
                        }
                    } else {
                        charSequence = dd.L0(2131753616, null);
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) kj.o1(this.O5.f16690k).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = dd.L0(2131743392, null);
                    } else {
                        charSequence = dd.L0(2131743393, null);
                    }
                }
            }
            if (this.O5.r4() && this.Z6 < (measureText = (int) (org.telegram.ui.ActionBar.t6.M2.measureText(charSequence, 0, charSequence.length()) + org.telegram.messenger.i0.L(75.0f)))) {
                this.Z6 = measureText;
            }
            int L = this.Z6 - org.telegram.messenger.i0.L(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.t6.M2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.t6.M2, org.telegram.messenger.i0.L(2.0f) + L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f22678p2 = staticLayout;
            int lineCount = staticLayout.getLineCount();
            float f11 = 0.0f;
            if (lineCount > 0) {
                f7 = this.f22678p2.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f22689q2 = f7;
            if (this.f22678p2.getLineCount() > 0) {
                f11 = this.f22678p2.getLineLeft(0);
            }
            this.f22701r2 = f11;
            int i12 = this.Z6;
            int i13 = this.f22765w2;
            if (i13 != 82 && i13 != 81 && i13 != 80 && i13 != 84 && i13 != 83) {
                f10 = 34.0f;
            } else {
                f10 = 13.0f;
            }
            this.B2 = i12 - org.telegram.messenger.i0.L(f10);
            int L2 = org.telegram.messenger.i0.L(46.0f) + this.f22738u0;
            this.f22738u0 = L2;
            if (this.O5.D == 12) {
                this.f22738u0 = org.telegram.messenger.i0.L(14.0f) + L2;
            }
            if (this.O5.r4()) {
                this.f22738u0 = org.telegram.messenger.i0.L(2.0f) + this.f22738u0;
            }
            StaticLayout staticLayout2 = this.f22678p2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.B2 - Math.ceil(this.f22678p2.getLineWidth(0)))) / 2;
                if (this.f22765w2 == 0) {
                    i10 = org.telegram.messenger.i0.L(8.0f);
                } else {
                    i10 = 0;
                }
                this.f22803z2 = ceil + i10;
                int lineLeft = (int) this.f22678p2.getLineLeft(0);
                this.A2 = lineLeft;
                this.f22803z2 += -lineLeft;
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
        kj kjVar;
        TextPaint textPaint;
        int i22;
        int i23;
        q1 q1Var2 = this;
        Canvas canvas2 = canvas;
        if (((q1Var2.D9 && !q1Var2.M) || !q1Var2.B3()) && staticLayout != null) {
            kj kjVar2 = q1Var2.O5;
            if ((!kjVar2.Z || q1Var2.L == null) && (i10 = kjVar2.D) != 16) {
                if (i10 == 5) {
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.t6.T2;
                    if (q1Var2.r2()) {
                        i22 = q1Var2.O5.P3() ? org.telegram.ui.ActionBar.t6.gc : org.telegram.ui.ActionBar.t6.f20900be;
                    } else {
                        i22 = org.telegram.ui.ActionBar.t6.Wc;
                    }
                    int w02 = org.telegram.ui.ActionBar.t6.w0(i22, q1Var2.Ob);
                    if (q1Var2.v2()) {
                        i23 = q1Var2.O5.P3() ? org.telegram.ui.ActionBar.t6.f20898bc : org.telegram.ui.ActionBar.t6.f20919ce;
                    } else {
                        i23 = q1Var2.O5.P3() ? org.telegram.ui.ActionBar.t6.gc : org.telegram.ui.ActionBar.t6.f20900be;
                    }
                    textPaint2.setColor(i0.b.f(q1Var2.getVideoTranscriptionProgress(), w02, org.telegram.ui.ActionBar.t6.w0(i23, q1Var2.Ob)));
                } else if (q1Var2.B3()) {
                    if (q1Var2.O5.O5()) {
                        org.telegram.ui.ActionBar.t6.T2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, q1Var2.Ob));
                    } else {
                        org.telegram.ui.ActionBar.t6.T2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Yd, q1Var2.Ob));
                    }
                } else if (q1Var2.O5.P3()) {
                    org.telegram.ui.ActionBar.t6.T2.setColor(org.telegram.ui.ActionBar.t6.w0(z11 ? org.telegram.ui.ActionBar.t6.f20898bc : org.telegram.ui.ActionBar.t6.gc, q1Var2.Ob));
                } else {
                    org.telegram.ui.ActionBar.t6.T2.setColor(org.telegram.ui.ActionBar.t6.w0(z11 ? org.telegram.ui.ActionBar.t6.f20919ce : org.telegram.ui.ActionBar.t6.f20900be, q1Var2.Ob));
                }
                float f22 = q1Var2.getTransitionParams().K1 ? q1Var2.getTransitionParams().L1 * f7 : f7;
                if (f22 != 1.0f) {
                    org.telegram.ui.ActionBar.t6.T2.setAlpha((int) (textPaint.getAlpha() * f22));
                }
                canvas2.save();
                if (q1Var2.J && !q1Var2.B3()) {
                    canvas2.translate(0.0f, org.telegram.messenger.i0.L(2.0f));
                }
                float f23 = q1Var2.f22520c7;
                x1 x1Var5 = q1Var2.gb;
                if (x1Var5.f23555x0) {
                    f23 += x1Var5.f23498j0;
                }
                fj fjVar = q1Var2.K;
                if (fjVar == null || !fjVar.f15744m.f15577j) {
                    f12 = f10;
                } else {
                    f23 -= q1Var2.getTranslationY();
                    f12 = f10 + q1Var2.K.f15744m.f15575g;
                }
                float f24 = f23;
                float f25 = f12;
                if (q1Var2.J && q1Var2.B3()) {
                    f24 += org.telegram.messenger.i0.L(1.0f);
                }
                float f26 = f24;
                if (x1Var5.f23555x0) {
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
                RectF rectF2 = q1Var2.f22489a4;
                ag.c2 c2Var = q1Var2.T0;
                if (B3) {
                    if (q1Var2.f22757v7) {
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
                    org.telegram.ui.ActionBar.t6.T2.setAlpha((int) (q1Var2.f22592i4 * 255.0f * f30));
                    kj kjVar3 = q1Var2.O5;
                    if (kjVar3 == null || kjVar3.D != 4) {
                        f17 = f26;
                        f18 = f30;
                    } else {
                        float f31 = c2Var.N() ? 1.0f : c2Var.f14385h1;
                        if (!c2Var.L()) {
                            f31 = 0.0f;
                        }
                        f17 = f26;
                        f18 = org.telegram.messenger.i0.T1(0.35f, 1.0f, f31);
                    }
                    kj kjVar4 = q1Var2.O5;
                    if (kjVar4 != null && kjVar4.f16748z0) {
                        org.telegram.ui.Components.d5 d5Var = q1Var2.f22626l0;
                        f18 *= d5Var == null ? 0.0f : d5Var.e();
                    }
                    X1.setAlpha((int) c3.i0.E(alpha, q1Var2.f22592i4, f18, 0.6f));
                    if (q1Var2.Y3()) {
                        int L3 = org.telegram.messenger.i0.L(8.0f);
                        int i25 = uz.Y0;
                        if (i25 > 2) {
                            i25 -= 2;
                        }
                        L2 = Math.min(L3, org.telegram.messenger.i0.L(i25));
                        z21 = uz.Y0 >= 10;
                        i11 = 2;
                    } else {
                        int i26 = q1Var2.K1;
                        if (i26 != 7 && i26 != 6 && q1Var2.O5.D != 19) {
                            int[] iArr = c2Var.W0;
                            i11 = 2;
                            L2 = Math.min(org.telegram.messenger.i0.L(8.0f), Math.max(iArr[2], iArr[3]));
                            z21 = uz.Y0 >= 10;
                        } else {
                            i11 = 2;
                            int L4 = org.telegram.messenger.i0.L(4.0f);
                            kj kjVar5 = q1Var2.O5;
                            L2 = L4 + ((kjVar5 == null || !kjVar5.M2()) ? 0 : org.telegram.messenger.i0.L(8.0f));
                            z21 = false;
                        }
                    }
                    kj kjVar6 = q1Var2.O5;
                    float L5 = f28 + ((kjVar6 == null || !kjVar6.M2()) ? 0 : org.telegram.messenger.i0.L(-6.0f));
                    if (q1Var2.f22588i0 != 0) {
                        L5 -= org.telegram.messenger.i0.L(18.0f);
                    }
                    float L6 = L5 - org.telegram.messenger.i0.L(z21 ? 6.0f : 4.0f);
                    kj kjVar7 = q1Var2.O5;
                    float L7 = (kjVar7 == null || !kjVar7.M2()) ? 0.0f : org.telegram.messenger.i0.L(2.0f);
                    float f32 = f18;
                    float f33 = L5;
                    if (q1Var2.K1 != 7 || ((kjVar = q1Var2.O5) != null && kjVar.g4())) {
                        photoBottom = q1Var2.getPhotoBottom() + q1Var2.f22750v0;
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
                        Path path = n4Var.f22354t;
                        path.rewind();
                        path.addRoundRect(rectF2, f37, f37, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.drawColor(1073741824);
                        canvas2.restore();
                    } else if (!kj.b4(q1Var2.O5.f16690k)) {
                        if (q1Var2.O5.t2() && q1Var2.O5.D != 5) {
                            Path path2 = q1Var2.f22805z4;
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
                            X12.setAlpha((int) (alpha3 * q1Var2.f22604j4 * 0.4f));
                            canvas2.drawRoundRect(rectF2, f38, f38, X12);
                            X12.setAlpha(alpha3);
                        } else {
                            q1Var2.z();
                            float f39 = L2;
                            canvas2.drawRoundRect(rectF2, f39, f39, X1);
                            if (X1 == q1Var2.X1("paintChatActionBackground") && q1Var2.e2()) {
                                int alpha4 = org.telegram.ui.ActionBar.t6.f20999h2.getAlpha();
                                org.telegram.ui.ActionBar.t6.f20999h2.setAlpha((int) (alpha4 * q1Var2.f22592i4 * f32));
                                canvas2.drawRoundRect(rectF2, f39, f39, org.telegram.ui.ActionBar.t6.f20999h2);
                                org.telegram.ui.ActionBar.t6.f20999h2.setAlpha(alpha4);
                            }
                        }
                    }
                    X1.setAlpha(alpha);
                    float f40 = -staticLayout.getLineLeft(0);
                    kj kjVar8 = q1Var2.O5;
                    float L9 = f40 + ((kjVar8 == null || !kjVar8.M2()) ? 0 : org.telegram.messenger.i0.L(-6.0f));
                    if (q1Var2.O5.N5()) {
                        p0Var.getClass();
                    }
                    if ((!org.telegram.messenger.w3.T(q1Var2.ia) || q1Var2.ia.megagroup) && (q1Var2.O5.f16690k.flags & 1024) == 0 && q1Var2.f22550ea == null && !q1Var2.f22669o6) {
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
                        float lineWidth = (q1Var2.f22797y9 - staticLayout.getLineWidth(0)) + L9;
                        p0Var.getClass();
                        int b10 = x1Var5.b();
                        int i28 = x1Var5.f23463b2;
                        if (i28 >= 0 && i28 != b10 && !q1Var2.f22710rb) {
                            q1Var2.A0(i28, b10, z10);
                        }
                        boolean z25 = q1Var2.f22710rb;
                        if (z25) {
                            b10 = q1Var2.f22674ob;
                        }
                        boolean z26 = (b10 & 4) != 0;
                        boolean z27 = (b10 & 8) != 0;
                        if (z25) {
                            int i29 = q1Var2.f22685pb;
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
                            q1Var2.R0(canvas2, z24, z28, f42, f30, f41, f33, 1.0f - q1Var2.f22697qb, z11);
                            boolean z29 = z24;
                            boolean z30 = z28;
                            boolean z31 = z26;
                            boolean z32 = z27;
                            q1Var2.R0(canvas, z31, z32, f42, f30, f41, f33, q1Var2.f22697qb, z11);
                            f26 = f42;
                            f21 = f33;
                            z23 = z31;
                            f22 = f30;
                            if (!q1Var2.O5.P3()) {
                                if (!z29 && !z30) {
                                    q1Var2.y1(canvas, f22, f41, f21, 1.0f - q1Var2.f22697qb, z11);
                                }
                                if (!z23 && !z32) {
                                    q1Var2.y1(canvas, f22, f41, f21, q1Var2.f22697qb, z11);
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
                        x1Var5.f23463b2 = x1Var4.b();
                        if (z23 && z10 && q1Var2.getParent() != null) {
                            ((View) q1Var2.getParent()).invalidate();
                        }
                        f19 = f20;
                    }
                    canvas2.save();
                    float f44 = f29 + f19;
                    q1Var2.f22759v9 = f44;
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
                        if (q1Var2.f22492a7) {
                            i13 -= org.telegram.messenger.i0.L(4.0f);
                        }
                    } else {
                        if (q1Var2.f22757v7) {
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
                    if ((org.telegram.messenger.w3.T(q1Var2.ia) && !q1Var2.ia.megagroup) || (q1Var2.O5.f16690k.flags & 1024) != 0 || q1Var2.f22550ea != null || x1Var5.G || q1Var2.f22669o6 || x1Var5.C) {
                        float lineWidth2 = (f11 - staticLayout.getLineWidth(0)) + f45;
                        p0Var.getClass();
                        int b11 = x1Var5.b();
                        int i30 = x1Var5.f23463b2;
                        if (i30 >= 0 && i30 != b11 && !q1Var2.f22710rb) {
                            q1Var2.A0(i30, b11, z10);
                        }
                        boolean z35 = q1Var2.f22710rb;
                        if (z35) {
                            b11 = q1Var2.f22674ob;
                        }
                        boolean z36 = (b11 & 4) != 0;
                        boolean z37 = (b11 & 8) != 0;
                        if (z35) {
                            int i31 = q1Var2.f22685pb;
                            boolean z38 = (i31 & 4) != 0;
                            boolean z39 = (i31 & 8) != 0;
                            float f46 = i14;
                            float f47 = f22;
                            boolean z40 = z38;
                            x1Var = x1Var5;
                            q1Var2.R0(canvas2, z40, z39, f26, f47, f46, f28, 1.0f - q1Var2.f22697qb, z11);
                            boolean z41 = z39;
                            boolean z42 = z36;
                            boolean z43 = z37;
                            q1Var2.R0(canvas, z42, z43, f26, f47, f46, f28, q1Var2.f22697qb, z11);
                            f26 = f26;
                            f13 = f28;
                            z13 = z42;
                            f22 = f47;
                            if (!q1Var2.O5.P3()) {
                                if (!z40 && !z41) {
                                    q1Var2.y1(canvas, f22, f46, f13, 1.0f - q1Var2.f22697qb, z11);
                                }
                                if (!z13 && !z43) {
                                    q1Var2.y1(canvas, f22, f46, f13, q1Var2.f22697qb, z11);
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
                        x1Var5.f23463b2 = x1Var.b();
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
                            canvas2.translate(x1Var5.f23489h1 + f45, ((f26 - org.telegram.messenger.i0.L((q1Var2.F || q1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f49);
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
                        q1Var2.f22759v9 = f51;
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
                    int i33 = x1Var5.f23463b2;
                    if (i33 >= 0 && i33 != b12 && !q1Var2.f22710rb) {
                        q1Var2.A0(i33, b12, z10);
                    }
                    if (q1Var2.f22710rb) {
                        b12 = q1Var2.f22674ob;
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
                    if (q1Var2.f22710rb) {
                        int i36 = q1Var2.f22685pb;
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
                            q1Var2.u1(canvas2, i34, z15, z14, z19, f16, z12, i32, f26, q1Var2.f22697qb, true, z11);
                        } else {
                            x1Var3 = x1Var2;
                            f14 = f15;
                            boolean z48 = z15;
                            boolean z49 = i34;
                            str = "paintChatTimeBackground";
                            float f52 = i32;
                            q1Var2.u1(canvas, z16, z47, z18, z20, f16, z12, f52, f26, 1.0f - q1Var2.f22697qb, false, z11);
                            z14 = z17;
                            q1Var2.u1(canvas, z49, z48, z14, z19, f16, z12, f52, f26, q1Var2.f22697qb, false, z11);
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
                    x1Var3.f23463b2 = x1Var3.b();
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
                        q1Var.C();
                    }
                    Path path3 = q1Var.Z9;
                    path3.rewind();
                    RectF rectF3 = org.telegram.messenger.i0.P;
                    rectF3.set(c2Var.K0, c2Var.L0, c2Var.y(), c2Var.A());
                    int[] iArr2 = c2Var.W0;
                    float f53 = iArr2[i16];
                    float[] fArr = q1Var.f22495aa;
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
                    int alpha7 = org.telegram.ui.ActionBar.t6.f21017i2.getAlpha();
                    org.telegram.ui.ActionBar.t6.f21017i2.setAlpha((int) (alpha7 * 0.7f));
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f), org.telegram.ui.ActionBar.t6.f21017i2);
                    org.telegram.ui.ActionBar.t6.f21017i2.setAlpha(alpha7);
                    canvas.translate(q1Var.T9 + org.telegram.messenger.i0.L(4.0f), q1Var.U9);
                    Drawable drawable = org.telegram.ui.ActionBar.t6.L3;
                    int i37 = i16;
                    drawable.setBounds(i37, i37, drawable.getIntrinsicWidth(), org.telegram.ui.ActionBar.t6.L3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.t6.L3.draw(canvas);
                    canvas.translate(org.telegram.ui.ActionBar.t6.L3.getIntrinsicWidth() + org.telegram.messenger.i0.L(6.0f), f14);
                    nh.i.f(canvas, q1Var.V9);
                    canvas.restore();
                    if (q1Var.f22665o2 != null && c2Var.Q0 && q1Var.f22791y2 == 0) {
                        int i38 = uz.Y0;
                        int i39 = i11;
                        if (i38 > i39) {
                            L = org.telegram.messenger.i0.L(i38 - i39);
                            z12 = uz.Y0 < 10 ? i37 : true;
                        } else {
                            L = org.telegram.messenger.i0.L(i38);
                        }
                        int L12 = (int) (c2Var.K0 + org.telegram.messenger.i0.L(9.0f));
                        int L13 = (int) (c2Var.L0 + org.telegram.messenger.i0.L(6.0f));
                        RectF rectF4 = rectF;
                        rectF4.set(L12 - org.telegram.messenger.i0.L(4.0f), L13 - org.telegram.messenger.i0.L(1.5f), org.telegram.messenger.i0.L(z12 ? 2.0f : f14) + org.telegram.messenger.i0.L(4.0f) + q1Var.X1 + L12, org.telegram.messenger.i0.L(1.5f) + q1Var.f22665o2.getHeight() + L13);
                        canvas.drawRoundRect(rectF4, L, L, q1Var.X1(str));
                        canvas.save();
                        if (!z12) {
                            i39 = i37;
                        }
                        canvas.translate(L12 + i39, L13);
                        nh.i.f(canvas, q1Var.f22665o2);
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final boolean w2() {
        if (!this.f22601j1 && !this.f22769w6 && !this.f22756v6) {
            return false;
        }
        return true;
    }

    public final void w3(int i10, int i11, int i12, float f7, float f10, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        wv wvVar;
        x1 x1Var;
        hj hjVar;
        kj kjVar;
        this.f22662nc = i10;
        this.f22686pc = i11;
        this.qc = i12;
        this.K0 = i13;
        this.L0 = i14;
        this.f22724sc = f10;
        this.rc = f7;
        this.f22496ab = i14;
        this.f22510bb = i15;
        this.f22524cb = i16;
        this.f22675oc = i17;
        if ((!this.G5.isEmpty() || (this.f22762w != null && (kjVar = this.O5) != null && kjVar.D == 27)) && this.Za != f10) {
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
        kj kjVar2 = this.O5;
        if (kjVar2 != null && kjVar2.f16750z2 != null) {
            int i20 = i10 - this.f22725t0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                int size = this.O5.f16750z2.size();
                x1Var = this.gb;
                if (i21 >= size || ((hj) this.O5.f16750z2.get(i21)).p(this.O5.f16750z2, x1Var) > i20) {
                    break;
                }
                i22 = i21;
                i21++;
            }
            int i23 = 0;
            int i24 = -1;
            int i25 = -1;
            while (i22 < this.O5.f16750z2.size()) {
                float p5 = ((hj) this.O5.f16750z2.get(i22)).p(this.O5.f16750z2, x1Var);
                float j10 = hjVar.f16066f + p5 + hjVar.j(x1Var) + hjVar.h;
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
                if (this.f22798ya != null) {
                    int i26 = 0;
                    while (true) {
                        if (i26 >= this.f22798ya.f27728a.size()) {
                            break;
                        }
                        org.telegram.ui.Components.j5 j5Var = (org.telegram.ui.Components.j5) this.f22798ya.f27728a.get(i26);
                        if (j5Var != null && j5Var.f27278n) {
                            float y3 = (0.0f - getY()) - j5Var.f27279r;
                            float y10 = (this.f22649n - getY()) - j5Var.f27279r;
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
        kj kjVar3 = this.O5;
        if (kjVar3 != null && (wvVar = kjVar3.f16738w2) != null) {
            ArrayList arrayList = wvVar.f19333g;
            int i27 = i10 - this.f22725t0;
            int i28 = -1;
            int i29 = -1;
            for (int i30 = 0; i30 < arrayList.size(); i30++) {
                ru ruVar = (ru) arrayList.get(i30);
                if (ruVar.Q || ruVar.R) {
                    float f12 = ruVar.M;
                    float f13 = i27 + i11;
                    if (m2(f12, ruVar.H() + f12, i27, f13)) {
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
                int i34 = p1Var.f22423b + this.Sa;
                if (m2(i34, i34 + p1Var.f22424c, this.f22662nc, i19 + this.f22686pc)) {
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
            if (Math.abs(this.S8 - Math.max(Math.min(org.telegram.messenger.i0.L(4.0f) + (-this.f22675oc), this.Q8 - org.telegram.messenger.i0.L(42.0f)), org.telegram.messenger.i0.L(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        sg.p0 p0Var = this.N;
        int i35 = p0Var.f48451c;
        boolean m22 = m2(i35, i35 + p0Var.f48458m, this.f22662nc, i18 + this.f22686pc);
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

    public final void x3(int r21, org.telegram.messenger.kj r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.x3(int, org.telegram.messenger.kj):void");
    }

    public final void y() {
        gr grVar;
        boolean z10 = this.f22637m1;
        if (z10 || this.f22651n1) {
            if ((z10 && this.f22664o1 == 1.0f) || (!z10 && this.f22664o1 == 0.0f)) {
                this.f22651n1 = false;
            }
            if (z10) {
                grVar = gr.f26524g;
            } else {
                grVar = gr.f26525i;
            }
            this.f22688q1 = (int) Math.ceil(grVar.getInterpolation(this.f22664o1) * org.telegram.messenger.i0.L(35.0f));
            if (this.O5.D == 36) {
                if (org.telegram.messenger.i0.L(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                    this.f22688q1 = 0;
                }
            }
            if (!this.O5.P3() || this.O5.B2) {
                V3();
            }
            if (this.f22651n1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f22677p1;
                this.f22677p1 = elapsedRealtime;
                if (this.f22637m1) {
                    float f7 = (((float) j10) / 200.0f) + this.f22664o1;
                    this.f22664o1 = f7;
                    if (f7 > 1.0f) {
                        this.f22664o1 = 1.0f;
                    }
                } else {
                    float f10 = this.f22664o1 - (((float) j10) / 200.0f);
                    this.f22664o1 = f10;
                    if (f10 <= 0.0f) {
                        this.f22664o1 = 0.0f;
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
        long[] x10 = ic.D().x(org.telegram.messenger.b8.B(document));
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
        float r10;
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
        StaticLayout staticLayout = this.f22550ea;
        x1 x1Var = this.gb;
        float f21 = 0.0f;
        if (staticLayout == null && !x1Var.G) {
            f14 = 10.0f;
            d = 1.0d;
        } else {
            boolean z17 = x1Var.f23494i1;
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
            if ((!this.f22773wb || !x1Var.f23512m1) && z17 && !z12) {
                if (z13) {
                    f22 = x1Var.J;
                } else {
                    float f23 = x1Var.J;
                    float f24 = x1Var.L1;
                    f22 = (f22 * f24) + ((1.0f - f24) * f23);
                }
            }
            fj fjVar = this.K;
            if (fjVar != null) {
                ej ejVar = fjVar.f15744m;
                if (ejVar.f15577j) {
                    f22 += ejVar.f15575g;
                }
            }
            if (x1Var.f23555x0) {
                f22 += this.Uc;
            }
            if (B3()) {
                if (this.O5.O5()) {
                    W1 = W1("drawableMsgStickerReplies");
                } else {
                    W1 = org.telegram.ui.ActionBar.t6.f20890b4;
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
            float r11 = z.r(W1, f22, Y1, org.telegram.ui.ActionBar.t6.T2.getTextSize());
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
                canvas.scale(f19, f19, org.telegram.messenger.m5.a(org.telegram.messenger.i0.L(3.0f) + r11, this.f22562fa, 2.0f, f22), W1.getBounds().centerY());
            }
            W1.draw(canvas);
            W1.setAlpha(255);
            if (x1Var.G) {
                if (z14) {
                    canvas.save();
                    f16 = r11;
                    org.telegram.ui.ActionBar.t6.T2.setAlpha((int) ((1.0d - x1Var.L1) * alpha));
                    canvas.translate(f22 + f16 + org.telegram.messenger.i0.L(3.0f), Y1);
                    x1Var.I.draw(canvas);
                    canvas.restore();
                } else {
                    f16 = r11;
                }
                org.telegram.ui.ActionBar.t6.T2.setAlpha((int) (alpha * f15));
            } else {
                f16 = r11;
            }
            canvas.save();
            canvas.translate(f22 + f16 + org.telegram.messenger.i0.L(3.0f), Y1);
            StaticLayout staticLayout2 = this.f22550ea;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                StaticLayout staticLayout3 = x1Var.I;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
            }
            canvas.restore();
            if (this.f22550ea != null) {
                f21 = f16 + this.f22562fa + org.telegram.messenger.i0.L(10.0f) + 0.0f;
            }
            if (z11) {
                canvas.restore();
            }
            if (x1Var.G) {
                org.telegram.ui.ActionBar.t6.T2.setAlpha(alpha);
            }
            x1Var.K = f22;
        }
        if (this.f22509ba != null) {
            boolean z19 = x1Var.f23494i1;
            if (z19) {
                f18 = this.A9;
            } else {
                f18 = f11;
            }
            float f25 = f18 + f21;
            if ((!this.f22773wb || !x1Var.f23512m1) && z19) {
                float f26 = x1Var.L;
                float f27 = x1Var.L1;
                f25 = (f25 * f27) + ((1.0f - f27) * f26);
            }
            fj fjVar2 = this.K;
            if (fjVar2 != null) {
                ej ejVar2 = fjVar2.f15744m;
                if (ejVar2.f15577j) {
                    f25 += ejVar2.f15575g;
                }
            }
            if (x1Var.f23555x0) {
                f25 += this.Uc;
            }
            if (B3()) {
                if (this.O5.O5()) {
                    W13 = W1("drawableMsgStickerViews");
                } else {
                    W13 = org.telegram.ui.ActionBar.t6.f20870a4;
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
            float r12 = z.r(W13, f25, org.telegram.messenger.i0.L(1.5f) + Y1, org.telegram.ui.ActionBar.t6.T2.getTextSize() - org.telegram.messenger.i0.L(2.0f));
            if (z11) {
                canvas.save();
                canvas.scale(f19, f19, (((org.telegram.messenger.i0.L(3.0f) + W13.getIntrinsicWidth()) + this.f22523ca) / 2.0f) + f25, W13.getBounds().centerY());
            }
            W13.setAlpha((int) (f20 * 255.0f));
            W13.draw(canvas);
            W13.setAlpha(255);
            if (x1Var.f23476e2 != null) {
                canvas.save();
                org.telegram.ui.ActionBar.t6.T2.setAlpha((int) ((d - x1Var.L1) * alpha));
                canvas.translate(f25 + r12 + org.telegram.messenger.i0.L(3.0f), Y1);
                nh.i.f(canvas, x1Var.f23476e2);
                canvas.restore();
                org.telegram.ui.ActionBar.t6.T2.setAlpha((int) (alpha * x1Var.L1));
            }
            canvas.save();
            canvas.translate(f25 + r12 + org.telegram.messenger.i0.L(3.0f), Y1);
            nh.i.f(canvas, this.f22509ba);
            canvas.restore();
            if (z11) {
                canvas.restore();
            }
            f21 = this.f22523ca + r12 + org.telegram.messenger.i0.L(f14) + f21;
            if (x1Var.f23476e2 != null) {
                org.telegram.ui.ActionBar.t6.T2.setAlpha(alpha);
            }
            x1Var.M = f25;
        }
        boolean z20 = this.f22669o6;
        if (!z20 && !x1Var.C) {
            return;
        }
        boolean z21 = x1Var.f23494i1;
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
        if (!this.f22773wb && z21 && !z15) {
            if (z16) {
                f28 = x1Var.E;
            } else {
                float f29 = x1Var.E;
                float f30 = x1Var.L1;
                f28 = (f28 * f30) + ((1.0f - f30) * f29);
            }
        }
        fj fjVar3 = this.K;
        if (fjVar3 != null) {
            ej ejVar3 = fjVar3.f15744m;
            if (ejVar3.f15577j) {
                f28 += ejVar3.f15575g;
            }
        }
        if (x1Var.f23555x0) {
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
            if (this.f22669o6) {
                W12.setAlpha((int) (f20 * 255.0f * x1Var.L1));
                r10 = z.r(W12, f28, Y1, org.telegram.ui.ActionBar.t6.T2.getTextSize() + org.telegram.messenger.i0.L(1.0f));
            } else {
                W12.setAlpha((int) ((1.0f - x1Var.L1) * f20 * 255.0f));
                r10 = z.r(W12, f28, Y1, org.telegram.ui.ActionBar.t6.T2.getTextSize() + org.telegram.messenger.i0.L(1.0f));
            }
        } else {
            W12.setAlpha((int) (f20 * 255.0f));
            r10 = z.r(W12, f28, Y1, org.telegram.ui.ActionBar.t6.T2.getTextSize() + org.telegram.messenger.i0.L(1.0f));
        }
        if (z11) {
            canvas.save();
            canvas.scale(f19, f19, (r10 / 2.0f) + f28, W12.getBounds().centerY());
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
            TextPaint textPaint = org.telegram.ui.ActionBar.t6.f21131o2;
            int i14 = org.telegram.ui.ActionBar.t6.Tc;
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i14, this.Ob));
            org.telegram.ui.ActionBar.t6.f21292x2.setColor(org.telegram.ui.ActionBar.t6.w0(i14, this.Ob));
            org.telegram.ui.ActionBar.t6.f21150p2.setColor(org.telegram.ui.ActionBar.t6.w0(i14, this.Ob));
            org.telegram.ui.ActionBar.t6.f21167q2.setColor(org.telegram.ui.ActionBar.t6.w0(i14, this.Ob));
            org.telegram.ui.ActionBar.t6.f21183r2.setColor(org.telegram.ui.ActionBar.t6.w0(i14, this.Ob));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.t6.f21292x2;
            TextPaint textPaint3 = org.telegram.ui.ActionBar.t6.Z2;
            TextPaint textPaint4 = org.telegram.ui.ActionBar.t6.f20869a3;
            TextPaint textPaint5 = org.telegram.ui.ActionBar.t6.f21131o2;
            TextPaint textPaint6 = org.telegram.ui.ActionBar.t6.f21150p2;
            TextPaint textPaint7 = org.telegram.ui.ActionBar.t6.f21167q2;
            TextPaint textPaint8 = org.telegram.ui.ActionBar.t6.f21183r2;
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Vc, this.Ob);
            textPaint8.linkColor = w02;
            textPaint7.linkColor = w02;
            textPaint6.linkColor = w02;
            textPaint5.linkColor = w02;
            textPaint4.linkColor = w02;
            textPaint3.linkColor = w02;
            textPaint2.linkColor = w02;
        } else {
            TextPaint textPaint9 = org.telegram.ui.ActionBar.t6.f21131o2;
            int i15 = org.telegram.ui.ActionBar.t6.Sc;
            textPaint9.setColor(org.telegram.ui.ActionBar.t6.w0(i15, this.Ob));
            org.telegram.ui.ActionBar.t6.f21292x2.setColor(org.telegram.ui.ActionBar.t6.w0(i15, this.Ob));
            org.telegram.ui.ActionBar.t6.f21150p2.setColor(org.telegram.ui.ActionBar.t6.w0(i15, this.Ob));
            org.telegram.ui.ActionBar.t6.f21167q2.setColor(org.telegram.ui.ActionBar.t6.w0(i15, this.Ob));
            org.telegram.ui.ActionBar.t6.f21183r2.setColor(org.telegram.ui.ActionBar.t6.w0(i15, this.Ob));
            TextPaint textPaint10 = org.telegram.ui.ActionBar.t6.f21292x2;
            TextPaint textPaint11 = org.telegram.ui.ActionBar.t6.Z2;
            TextPaint textPaint12 = org.telegram.ui.ActionBar.t6.f20869a3;
            TextPaint textPaint13 = org.telegram.ui.ActionBar.t6.f21131o2;
            TextPaint textPaint14 = org.telegram.ui.ActionBar.t6.f21150p2;
            TextPaint textPaint15 = org.telegram.ui.ActionBar.t6.f21167q2;
            TextPaint textPaint16 = org.telegram.ui.ActionBar.t6.f21183r2;
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
                        int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21065kc, this.Ob);
                        int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21083lc, this.Ob);
                        int i17 = org.telegram.ui.ActionBar.t6.f21122nc;
                        this.B4.g(w04, w05, org.telegram.ui.ActionBar.t6.w0(i17, this.Ob), org.telegram.ui.ActionBar.t6.w0(i17, this.Ob), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21102mc, this.Ob));
                    } else if (this.P1 && this.f22644m8 != null) {
                        int c10 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21028ie, this.Ob), this.f22644m8.i());
                        int c11 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21047je, this.Ob), this.f22644m8.i());
                        int i18 = org.telegram.ui.ActionBar.t6.f21085le;
                        this.B4.g(c10, c11, org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(i18, this.Ob), this.f22644m8.i()), org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(i18, this.Ob), this.f22644m8.i()), org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21067ke, this.Ob), this.f22644m8.i()));
                    } else {
                        int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21028ie, this.Ob);
                        int w07 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21047je, this.Ob);
                        int i19 = org.telegram.ui.ActionBar.t6.f21085le;
                        this.B4.g(w06, w07, org.telegram.ui.ActionBar.t6.w0(i19, this.Ob), org.telegram.ui.ActionBar.t6.w0(i19, this.Ob), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21067ke, this.Ob));
                    }
                }
            } else {
                boolean P3 = this.O5.P3();
                rn0 rn0Var = this.C4;
                if (P3) {
                    int w08 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21141oc, this.Ob);
                    int w09 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.qc, this.Ob);
                    int w010 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21158pc, this.Ob);
                    rn0Var.f30039p = w08;
                    rn0Var.f30040q = w09;
                    rn0Var.f30041r = w010;
                    int w011 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21065kc, this.Ob);
                    int w012 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21083lc, this.Ob);
                    int i20 = org.telegram.ui.ActionBar.t6.f21122nc;
                    this.B4.g(w011, w012, org.telegram.ui.ActionBar.t6.w0(i20, this.Ob), org.telegram.ui.ActionBar.t6.w0(i20, this.Ob), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21102mc, this.Ob));
                } else if (this.P1 && this.f22644m8 != null) {
                    int c12 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21104me, this.Ob), this.f22644m8.i());
                    int c13 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21143oe, this.Ob), this.f22644m8.i());
                    int c14 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21124ne, this.Ob), this.f22644m8.i());
                    rn0Var.f30039p = c12;
                    rn0Var.f30040q = c13;
                    rn0Var.f30041r = c14;
                    int c15 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21028ie, this.Ob), this.f22644m8.i());
                    int c16 = org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21047je, this.Ob), this.f22644m8.i());
                    int i21 = org.telegram.ui.ActionBar.t6.f21085le;
                    this.B4.g(c15, c16, org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(i21, this.Ob), this.f22644m8.i()), org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(i21, this.Ob), this.f22644m8.i()), org.telegram.ui.ActionBar.t6.c(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21067ke, this.Ob), this.f22644m8.i()));
                } else {
                    int w013 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21104me, this.Ob);
                    int w014 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21143oe, this.Ob);
                    int w015 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21124ne, this.Ob);
                    rn0Var.f30039p = w013;
                    rn0Var.f30040q = w014;
                    rn0Var.f30041r = w015;
                    int w016 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21028ie, this.Ob);
                    int w017 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21047je, this.Ob);
                    int i22 = org.telegram.ui.ActionBar.t6.f21085le;
                    this.B4.g(w016, w017, org.telegram.ui.ActionBar.t6.w0(i22, this.Ob), org.telegram.ui.ActionBar.t6.w0(i22, this.Ob), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21067ke, this.Ob));
                }
            }
        }
        kj kjVar = this.O5;
        if (kjVar.D == 5) {
            TextPaint textPaint17 = org.telegram.ui.ActionBar.t6.T2;
            if (r2()) {
                if (this.O5.P3()) {
                    i12 = org.telegram.ui.ActionBar.t6.gc;
                } else {
                    i12 = org.telegram.ui.ActionBar.t6.f20900be;
                }
            } else {
                i12 = org.telegram.ui.ActionBar.t6.Wc;
            }
            int w018 = org.telegram.ui.ActionBar.t6.w0(i12, this.Ob);
            if (v2()) {
                if (this.O5.P3()) {
                    i13 = org.telegram.ui.ActionBar.t6.f20898bc;
                } else {
                    i13 = org.telegram.ui.ActionBar.t6.f20919ce;
                }
            } else if (this.O5.P3()) {
                i13 = org.telegram.ui.ActionBar.t6.gc;
            } else {
                i13 = org.telegram.ui.ActionBar.t6.f20900be;
            }
            textPaint17.setColor(i0.b.f(getVideoTranscriptionProgress(), w018, org.telegram.ui.ActionBar.t6.w0(i13, this.Ob)));
        } else if (this.A6) {
            if (kjVar.O5()) {
                org.telegram.ui.ActionBar.t6.T2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, this.Ob));
            } else {
                org.telegram.ui.ActionBar.t6.T2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Yd, this.Ob));
            }
        } else if (kjVar.P3()) {
            TextPaint textPaint18 = org.telegram.ui.ActionBar.t6.T2;
            if (v2()) {
                i11 = org.telegram.ui.ActionBar.t6.f20898bc;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.gc;
            }
            textPaint18.setColor(org.telegram.ui.ActionBar.t6.w0(i11, this.Ob));
        } else {
            TextPaint textPaint19 = org.telegram.ui.ActionBar.t6.T2;
            if (v2()) {
                i10 = org.telegram.ui.ActionBar.t6.f20919ce;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.f20900be;
            }
            textPaint19.setColor(org.telegram.ui.ActionBar.t6.w0(i10, this.Ob));
        }
    }

    public final void z() {
        A(getX(), this.Za, getMeasuredWidth(), this.f22496ab);
    }

    public final void z0(int i10) {
        int i11;
        int w02;
        el0 el0Var;
        el0 el0Var2;
        int i12;
        int i13;
        int i14;
        if (this.O5.G4()) {
            if (this.O5.P3()) {
                i14 = org.telegram.ui.ActionBar.t6.Lb;
            } else {
                i14 = org.telegram.ui.ActionBar.t6.f21319yd;
            }
            w02 = org.telegram.ui.ActionBar.t6.w0(i14, this.Ob);
        } else if (i10 == 0 && this.C5) {
            if (this.O5.P3()) {
                i12 = org.telegram.ui.ActionBar.t6.Fb;
            } else {
                i12 = org.telegram.ui.ActionBar.t6.f21084ld;
            }
            w02 = org.telegram.ui.ActionBar.t6.w0(i12, this.Ob);
        } else if (i10 == 0 && (el0Var2 = this.f22644m8) != null) {
            w02 = el0Var2.i();
        } else if (i10 == 0 && (el0Var = this.f22671o8) != null) {
            w02 = el0Var.i();
        } else {
            if (this.O5.P3()) {
                i11 = org.telegram.ui.ActionBar.t6.Lb;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.f21319yd;
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
                i13 = org.telegram.ui.ActionBar.t6.f21319yd;
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
        kj kjVar = this.O5;
        if (kjVar != null && kjVar.S4()) {
            RadialProgress2 radialProgress2 = this.P0;
            RectF rectF = radialProgress2.f24124a;
            Paint paint = radialProgress2.f24128g;
            i90 i90Var = radialProgress2.f24129i;
            RectF rectF2 = radialProgress2.f24124a;
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
            radialProgress2.f24130j.B = c5Var;
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
                if (this.f22487a1 == null) {
                    ci0 ci0Var = new ci0(2131624021, org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f), true, null);
                    this.f22487a1 = ci0Var;
                    ci0Var.R(this);
                    this.f22487a1.J(true);
                    this.f22487a1.K(1);
                    this.f22487a1.start();
                }
                this.f22487a1.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (this.f22500b1 == null) {
                    i10 = 1;
                    this.f22500b1 = new Paint(1);
                } else {
                    i10 = 1;
                }
                if (this.f22514c1 == null) {
                    Paint paint3 = new Paint(i10);
                    this.f22514c1 = paint3;
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                if (this.f22528d1 == null) {
                    Paint paint4 = new Paint(i10);
                    this.f22528d1 = paint4;
                    paint4.setStyle(Paint.Style.STROKE);
                }
                int i12 = radialProgress2.f24141u;
                if (i12 >= 0) {
                    i11 = org.telegram.ui.ActionBar.t6.w0(i12, this.Ob);
                } else {
                    i11 = radialProgress2.f24134n;
                }
                this.f22500b1.setColor(i11);
                this.f22528d1.setColor(i11);
                i90Var.a(false);
                this.f22500b1.setShader(i90Var.d.getShader());
                this.f22528d1.setShader(i90Var.d.getShader());
                rectF3.set(this.f22487a1.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                float f13 = f10;
                rectF3.inset(f13, f13);
                canvas2.drawRect(rectF3, this.f22500b1);
                this.f22487a1.q(canvas, this.f22514c1, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.f22528d1.setAlpha((int) (255.0f * f11));
                this.f22528d1.setStrokeWidth(org.telegram.messenger.i0.L(1.66f));
                RectF rectF4 = this.f22489a4;
                rectF4.set(rectF2);
                rectF4.inset(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
                rn0 rn0Var = this.C4;
                canvas.drawArc(rectF4, -90.0f, (1.0f - rn0Var.K) * (-360.0f), false, this.f22528d1);
                if (this.f22618k5 == null) {
                    this.f22618k5 = new i11();
                }
                this.f22618k5.a((1.0f - rn0Var.K) * (-360.0f), f11, canvas, this.f22528d1, rectF4);
                canvas2 = canvas;
            } else {
                ci0 ci0Var2 = this.f22487a1;
                if (ci0Var2 != null) {
                    ci0Var2.C(true);
                    this.f22487a1 = null;
                    if (this.f22618k5 != null) {
                        this.f22618k5 = null;
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
                jVar2.f51309i = 14.0f;
                jVar2.c(10.0f);
                this.Y0.f51304a.setStrokeWidth(org.telegram.messenger.i0.N(1.5f));
                z11 = true;
                this.Y0.d(1, false, false);
                this.Y0.f51310j = -org.telegram.messenger.i0.N(0.33f);
                this.Y0.f51311k = org.telegram.messenger.i0.N(0.33f);
            } else {
                z10 = false;
                z11 = true;
            }
            vh.j jVar3 = this.Y0;
            jVar3.f51309i = f7 * 14.0f;
            jVar3.c(f7 * 10.0f);
            canvas2.saveLayerAlpha(cos - org.telegram.messenger.i0.L(10.0f), sin - org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f) + cos, org.telegram.messenger.i0.L(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, org.telegram.messenger.i0.L(10.0f) * f7, paint);
            vh.j jVar4 = this.Y0;
            if (org.telegram.messenger.i0.B(paint.getColor()) <= 0.8f) {
                z11 = z10;
            }
            jVar4.b(z11);
            vh.j jVar5 = this.Y0;
            jVar5.f51314n = cos;
            jVar5.f51315o = sin;
            jVar5.a(canvas2, f7);
            canvas2.restore();
            return;
        }
        runnable.run();
    }

    public final boolean z3() {
        fj fjVar;
        kj kjVar = this.O5;
        if (kjVar != null && !kjVar.f16718r1 && !kjVar.r4()) {
            cj cjVar = this.L;
            if ((cjVar == null || ((fjVar = this.K) != null && fjVar.f15740i && (cjVar.f15166l & 8) == 0)) && !this.gb.f23555x0) {
                if (!this.f22788y || !kj.R4(this.O5.f16690k)) {
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
        this.f22775x = new m2.t(12);
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
        this.f22579h3 = -1;
        this.f22591i3 = -1;
        this.Z3 = new RectF();
        this.f22489a4 = new RectF();
        this.f22592i4 = 1.0f;
        this.f22604j4 = 1.0f;
        this.f22703r4 = -1;
        this.f22716s4 = new ji.a(this);
        this.f22742u4 = new ArrayList();
        this.f22754v4 = new ArrayList();
        this.f22805z4 = new Path();
        this.N4 = new ArrayList();
        this.O4 = new ArrayList();
        this.Q4 = -1;
        this.R4 = -1;
        this.T4 = true;
        this.G5 = new ArrayList();
        this.f22491a6 = -1;
        this.B6 = true;
        this.G6 = true;
        this.Z6 = 100;
        this.f22770w7 = new Rect();
        this.Q7 = new AtomicReference();
        this.Z8 = new RectF();
        this.f22672o9 = new StaticLayout[2];
        this.f22747u9 = new float[2];
        this.D9 = true;
        this.H9 = new Path();
        this.I9 = new float[8];
        this.S9 = 1.0f;
        this.Z9 = new Path();
        this.f22495aa = new float[8];
        this.Ka = new RectF();
        this.La = new RectF();
        this.eb = Build.VERSION.SDK_INT == 28;
        this.f22563fb = 1.0f;
        this.gb = new x1(this);
        this.f22624kb = new org.telegram.ui.Components.t5(this, 200L, gr.f26524g);
        this.f22661nb = new h1(this, 0);
        this.f22748ub = new h1(this, 1);
        this.f22761vb = new SparseArray();
        this.Jb = -1;
        this.Lb = new m.c3();
        this.Rb = new ArrayList();
        this.Sb = new Stack();
        this.Tb = new Path();
        this.Wb = new b1(this, 10);
        this.Xb = new b1(this, 2);
        this.f22539dc = false;
        this.f22636lc = new AtomicReference();
        this.f22648mc = -1L;
        this.f22800yc = false;
        this.f22812zc = new b1(this, 0);
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
        drawable.f24326a = new Paint(1);
        drawable.f24327b = null;
        drawable.h = -1.0f;
        drawable.f24331i = -1.0f;
        drawable.f24332j = -1.0f;
        drawable.f24333k = -1.0f;
        drawable.f24335m = this;
        this.Ra = drawable;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f22795y7 = imageReceiver;
        imageReceiver.f14425z1 = true;
        imageReceiver.J0(org.telegram.messenger.i0.L(21.0f));
        this.f22808z7 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.R7 = imageReceiver2;
        imageReceiver2.f14425z1 = true;
        imageReceiver2.J0(org.telegram.messenger.i0.L(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.D7 = imageReceiver3;
        imageReceiver3.f14425z1 = true;
        imageReceiver3.J0(org.telegram.messenger.i0.L(26.1f));
        this.X5 = org.telegram.messenger.b6.q(i10).k();
        this.W0 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        ag.c2 c2Var = new ag.c2(1, this, this);
        this.T0 = c2Var;
        c2Var.f14425z1 = true;
        c2Var.f14392l0 = true;
        c2Var.f14383g1 = this;
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.U0 = imageReceiver4;
        imageReceiver4.f14425z1 = true;
        imageReceiver4.f14392l0 = true;
        this.P0 = new RadialProgress2(this, p6Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, p6Var);
        this.Q0 = radialProgress2;
        radialProgress2.B = false;
        radialProgress2.setCircleRadius(org.telegram.messenger.i0.L(15.0f));
        i1 i1Var = new i1(this, this);
        this.B4 = i1Var;
        i1Var.h = this;
        ?? obj = new Object();
        obj.f30027a = 0;
        obj.f30028b = 0;
        obj.e = false;
        obj.f30030f = false;
        obj.f30042s = 1.0f;
        obj.f30043t = 1.0f;
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(125L, 600L, grVar);
        obj.v = t5Var;
        obj.f30045w = 1.0f;
        org.telegram.ui.Components.t5 t5Var2 = new org.telegram.ui.Components.t5(150L, gr.f26523f);
        obj.B = t5Var2;
        obj.J = false;
        if (rn0.N == null) {
            rn0.N = new Paint(1);
            rn0.O = new Paint(1);
            Paint paint = rn0.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            rn0.O.setStyle(style);
        }
        this.C4 = obj;
        obj.f30034k = this;
        obj.f30037n = this;
        t5Var2.f30528a = this;
        t5Var.f30528a = this;
        this.D4 = new org.telegram.ui.ActionBar.w0(this, 1);
        ?? drawable2 = new Drawable();
        drawable2.f27443a = 0L;
        drawable2.f27444b = false;
        drawable2.f27445c = new Paint(1);
        drawable2.d = 0.47f;
        drawable2.e = 0.0f;
        drawable2.f27446f = 0.32f;
        drawable2.f27447g = 1;
        drawable2.h = 1;
        drawable2.f27448i = 1;
        drawable2.f27452m = 255;
        drawable2.f27453n = p6Var;
        drawable2.f27449j = this;
        this.f22502b3 = drawable2;
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
            i14 = org.telegram.messenger.i0.f16172q.y;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                i12 = view.getMeasuredWidth();
                i11 = view.getMeasuredHeight();
                float f7 = this.M0;
                c5Var.q((int) (i10 + f7), i12, i11, (int) f7, this.f22510bb, this.f22524cb, this.E, (this.F && this.gb.A0 == 1.0f) ? false : true);
                c5Var.f20228u = f2();
            }
        }
        i11 = i14;
        i12 = i13;
        float f72 = this.M0;
        c5Var.q((int) (i10 + f72), i12, i11, (int) f72, this.f22510bb, this.f22524cb, this.E, (this.F && this.gb.A0 == 1.0f) ? false : true);
        c5Var.f20228u = f2();
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
    public final void s(int i10, Drawable drawable) {
    }
}
