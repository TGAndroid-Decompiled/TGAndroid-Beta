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
import b8.be;
import ci.lc;
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
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bb;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.cv;
import org.telegram.messenger.ec;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.qo;
import org.telegram.messenger.ri;
import org.telegram.messenger.ti;
import org.telegram.messenger.tt;
import org.telegram.messenger.ui;
import org.telegram.messenger.wi;
import org.telegram.messenger.xi;
import org.telegram.messenger.xt;
import org.telegram.messenger.yy;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.t31;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.kl;
import org.telegram.ui.ng0;
import org.telegram.ui.vq0;
public class q1 extends z implements lm0, ec, org.telegram.messenger.x5, p9, cs, qe.b, p4, e60 {
    public static final float[] f29838hd = new float[8];
    public static TextPaint f29839id;
    public static TextPaint f29840jd;
    public int A0;
    public boolean A1;
    public int A2;
    public long A3;
    public final Path A4;
    public boolean A5;
    public long A6;
    public final org.telegram.ui.Components.u8 A7;
    public n70 A8;
    public int A9;
    public org.telegram.ui.Components.l5 Aa;
    public float Ab;
    public final c1 Ac;
    public boolean B0;
    public boolean B1;
    public int B2;
    public int B3;
    public boolean B4;
    public int B5;
    public boolean B6;
    public boolean B7;
    public w70 B8;
    public int B9;
    public org.telegram.ui.Components.l5 Ba;
    public float Bb;
    public Runnable Bc;
    public boolean C0;
    public int C1;
    public int C2;
    public ly0 C3;
    public final i1 C4;
    public int C5;
    public boolean C6;
    public boolean C7;
    public ArrayList C8;
    public int C9;
    public org.telegram.ui.Components.l5 Ca;
    public float Cb;
    public Runnable Cc;
    public final Rect D0;
    public float D1;
    public boolean D2;
    public ly0 D3;
    public final sm0 D4;
    public boolean D5;
    public boolean D6;
    public boolean D7;
    public boolean D8;
    public CharSequence D9;
    public org.telegram.ui.Components.l5 Da;
    public long Db;
    public int Dc;
    public final qe.a E;
    public int E0;
    public boolean E1;
    public boolean E2;
    public ly0 E3;
    public final org.telegram.ui.ActionBar.t0 E4;
    public boolean E5;
    public boolean E6;
    public final ImageReceiver E7;
    public int E8;
    public boolean E9;
    public gc Ea;
    public float Eb;
    public int Ec;
    public boolean F;
    public int F0;
    public int F1;
    public boolean F2;
    public boolean F3;
    public int F4;
    public float F5;
    public boolean F6;
    public int F7;
    public boolean F8;
    public boolean F9;
    public gc Fa;
    public float Fb;
    public boolean Fc;
    public boolean G;
    public int G0;
    public float G1;
    public gc G2;
    public boolean G3;
    public int G4;
    public boolean G5;
    public boolean G6;
    public Drawable[] G7;
    public int G8;
    public Paint G9;
    public gc Ga;
    public int Gb;
    public float Gc;
    public boolean H;
    public int H0;
    public int H1;
    public int H2;
    public boolean H3;
    public boolean H4;
    public final ArrayList H5;
    public boolean H6;
    public int[] H7;
    public boolean H8;
    public Path H9;
    public float Ha;
    public float Hb;
    public Paint Hc;
    public boolean I;
    public int I0;
    public int I1;
    public final Drawable[] I2;
    public boolean I3;
    public a1 I4;
    public e1 I5;
    public int I6;
    public Drawable I7;
    public boolean I8;
    public final Path I9;
    public float Ia;
    public float Ib;
    public Drawable Ic;
    public boolean J;
    public boolean J0;
    public long J1;
    public final org.telegram.ui.ActionBar.v5[] J2;
    public int J3;
    public b1 J4;
    public int J5;
    public boolean J6;
    public Drawable J7;
    public boolean J8;
    public final float[] J9;
    public y Ja;
    public float Jb;
    public boolean Jc;
    public boolean K;
    public boolean K0;
    public long K1;
    public final int[] K2;
    public int K3;
    public StaticLayout K4;
    public boolean K5;
    public org.telegram.ui.ActionBar.t4 K6;
    public int K7;
    public int K8;
    public yh.f K9;
    public Path Ka;
    public int Kb;
    public rw0 Kc;
    public ui L;
    public int L0;
    public int L1;
    public final RectF L2;
    public int L3;
    public double L4;
    public boolean L5;
    public org.telegram.ui.ActionBar.t4 L6;
    public boolean L7;
    public boolean L8;
    public float L9;
    public final RectF La;
    public boolean Lb;
    public int Lc;
    public ri M;
    public int M0;
    public TLRPC.Document M1;
    public final int[] M2;
    public int M3;
    public int M4;
    public int M5;
    public int M6;
    public boolean M7;
    public Path M8;
    public float M9;
    public final RectF Ma;
    public final m.b3 Mb;
    public m1 Mc;
    public boolean N;
    public float N0;
    public boolean N1;
    public float N2;
    public int N3;
    public int N4;
    public yh.f N5;
    public int N6;
    public boolean N7;
    public Path N8;
    public float N9;
    public int Na;
    public d51 Nb;
    public StaticLayout Nc;
    public final dh.o0 O;
    public boolean O0;
    public k4.j O1;
    public SpannableStringBuilder O2;
    public int O3;
    public final ArrayList O4;
    public boolean O5;
    public int O6;
    public CheckBoxBase O7;
    public float[] O8;
    public float O9;
    public float Oa;
    public j1 Ob;
    public String Oc;
    public final ah.b P;
    public boolean P0;
    public int P1;
    public boolean P2;
    public int P3;
    public final ArrayList P4;
    public zi P5;
    public int P6;
    public StaticLayout P7;
    public float[] P8;
    public yh.e P9;
    public float Pa;
    public org.telegram.ui.ActionBar.e6 Pb;
    public Paint Pc;
    public final ah.d Q;
    public final RadialProgress2 Q0;
    public boolean Q1;
    public boolean Q2;
    public int Q3;
    public float Q4;
    public zi Q5;
    public int Q6;
    public StaticLayout Q7;
    public float Q8;
    public Integer Q9;
    public int Qa;
    public final boolean Qb;
    public Paint Qc;
    public boolean R;
    public final RadialProgress2 R0;
    public boolean R1;
    public long R2;
    public int R3;
    public int R4;
    public ui R5;
    public boolean R6;
    public final AtomicReference R7;
    public float R8;
    public Path R9;
    public l1 Ra;
    public final k4.j Rb;
    public float Rc;
    public long S;
    public boolean S0;
    public boolean S1;
    public boolean S2;
    public int S3;
    public int S4;
    public boolean S5;
    public o31 S6;
    public final ImageReceiver S7;
    public float S8;
    public float[] S9;
    public final e90 Sa;
    public final ArrayList Sb;
    public int Sc;
    public ly0 T;
    public final int[] T0;
    public boolean T1;
    public int T2;
    public int T3;
    public float T4;
    public boolean T5;
    public o31 T6;
    public int T7;
    public float T8;
    public final float T9;
    public int Ta;
    public final Stack Tb;
    public xi Tc;
    public n70 U;
    public final ei.c3 U0;
    public boolean U1;
    public y U2;
    public int U3;
    public boolean U4;
    public boolean U5;
    public int U6;
    public int U7;
    public StaticLayout U8;
    public float U9;
    public int Ua;
    public final Path Ub;
    public float Uc;
    public CornerPathEffect V;
    public final ImageReceiver V0;
    public int V1;
    public boolean V2;
    public int V3;
    public boolean V4;
    public boolean V5;
    public boolean V6;
    public float V7;
    public int V8;
    public float V9;
    public int Va;
    public boolean Vb;
    public float Vc;
    public int W;
    public ColorMatrixColorFilter W0;
    public int W1;
    public boolean W2;
    public int W3;
    public boolean W4;
    public l4 W5;
    public boolean W6;
    public int W7;
    public boolean W8;
    public StaticLayout W9;
    public int Wa;
    public m2.t Wb;
    public final g1 Wc;
    public final org.telegram.ui.Components.u8 X0;
    public int X1;
    public int X2;
    public boolean X3;
    public boolean X4;
    public AnimatorSet X5;
    public boolean X6;
    public int X7;
    public boolean X8;
    public int X9;
    public int Xa;
    public final c1 Xb;
    public RectF Xc;
    public t1 Y0;
    public int Y1;
    public y Y2;
    public boolean Y3;
    public boolean Y4;
    public final int Y5;
    public float Y6;
    public int Y7;
    public boolean Y8;
    public String Y9;
    public float Ya;
    public final c1 Yb;
    public final Path Yc;
    public gi.l Z0;
    public int Z1;
    public int Z2;
    public boolean Z3;
    public boolean Z4;
    public final int Z5;
    public int Z6;
    public int Z7;
    public StaticLayout Z8;
    public yh.f Z9;
    public boolean Za;
    public long Zb;
    public ColorFilter[] Zc;
    public long f29841a0;
    public Paint f29842a1;
    public int f29843a2;
    public y f29844a3;
    public final RectF f29845a4;
    public boolean f29846a5;
    public boolean f29847a6;
    public int f29848a7;
    public int f29849a8;
    public final RectF f29850a9;
    public final Path f29851aa;
    public float f29852ab;
    public float ac;
    public int[] f29853ad;
    public ly0 f29854b0;
    public ch0 f29855b1;
    public int f29856b2;
    public boolean f29857b3;
    public final RectF f29858b4;
    public boolean f29859b5;
    public int f29860b6;
    public boolean f29861b7;
    public boolean f29862b8;
    public gc f29863b9;
    public final float[] f29864ba;
    public int f29865bb;
    public float f29866bc;
    public Paint f29867bd;
    public n70 f29868c0;
    public Paint f29869c1;
    public float c2;
    public final ik0 f29870c3;
    public TLObject f29871c4;
    public int f29872c5;
    public byte[] f29873c6;
    public int f29874c7;
    public boolean f29875c8;
    public RectF f29876c9;
    public StaticLayout f29877ca;
    public int f29878cb;
    public boolean cc;
    public float f29879cd;
    public CornerPathEffect f29880d0;
    public Paint f29881d1;
    public float f29882d2;
    public StaticLayout f29883d3;
    public TLRPC.PhotoSize f29884d4;
    public float f29885d5;
    public byte[] f29886d6;
    public int f29887d7;
    public boolean f29888d8;
    public xg.a f29889d9;
    public int f29890da;
    public int f29891db;
    public boolean f29892dc;
    public float f29893dd;
    public int f29894e0;
    public Paint f29895e1;
    public int f29896e2;
    public int f29897e3;
    public TLRPC.PhotoSize f29898e4;
    public boolean f29899e5;
    public boolean f29900e6;
    public CheckBoxBase[] f29901e7;
    public boolean f29902e8;
    public int f29903e9;
    public String ea;
    public boolean f29904eb;
    public boolean f29905ec;
    public int f29906ed;
    public boolean f29907f;
    public f01 f29908f0;
    public cv0 f29909f1;
    public StaticLayout f29910f2;
    public int f29911f3;
    public BitmapDrawable f29912f4;
    public boolean f29913f5;
    public boolean f29914f6;
    public i30 f29915f7;
    public boolean f29916f8;
    public float f29917f9;
    public StaticLayout f29918fa;
    public final boolean f29919fb;
    public m1 f29920fc;
    public int f29921fd;
    public int f29922g0;
    public boolean f29923g1;
    public StaticLayout f29924g2;
    public boolean f29925g3;
    public String f29926g4;
    public float f29927g5;
    public boolean f29928g6;
    public w70 g7;
    public org.telegram.ui.Components.u5 f29929g8;
    public float f29930g9;
    public int f29931ga;
    public float f29932gb;
    public m1 f29933gc;
    public TL_stars.StarGift f29934gd;
    public boolean h;
    public qw0 f29935h0;
    public float f29936h1;
    public float f29937h2;
    public v1 f29938h3;
    public String f29939h4;
    public int f29940h5;
    public boolean f29941h6;
    public float h7;
    public float f29942h8;
    public float f29943h9;
    public String f29944ha;
    public final x1 hb;
    public boolean f29945hc;
    public int f29946i0;
    public float f29947i1;
    public float f29948i2;
    public int i3;
    public boolean f29949i4;
    public TLRPC.Poll f29950i5;
    public boolean f29951i6;
    public long f29952i7;
    public float f29953i8;
    public boolean f29954i9;
    public TLRPC.User f29955ia;
    public boolean f29956ib;
    public boolean f29957ic;
    public long f29958j0;
    public boolean f29959j1;
    public float f29960j2;
    public int f29961j3;
    public float f29962j4;
    public ArrayList f29963j5;
    public boolean f29964j6;
    public ImageReceiver[] f29965j7;
    public TLRPC.PhotoSize f29966j8;
    public boolean f29967j9;
    public TLRPC.Chat f29968ja;
    public boolean jb;
    public int f29969jc;
    public int f29970k0;
    public boolean k1;
    public float f29971k2;
    public int f29972k3;
    public float f29973k4;
    public int f29974k5;
    public boolean f29975k6;
    public org.telegram.ui.Components.u8[] f29976k7;
    public int f29977k8;
    public boolean f29978k9;
    public TLRPC.FileLocation f29979ka;
    public boolean f29980kb;
    public m1 f29981kc;
    public gc f29982l0;
    public CheckBoxBase f29983l1;
    public boolean f29984l2;
    public xi f29985l3;
    public long f29986l4;
    public b01 f29987l5;
    public boolean f29988l6;
    public boolean[] f29989l7;
    public Drawable f29990l8;
    public float f29991l9;
    public String la;
    public final org.telegram.ui.Components.u5 f29992lb;
    public Drawable f29993lc;
    public org.telegram.ui.Components.e5 m0;
    public CheckBoxBase m1;
    public gc f29994m2;
    public xi f29995m3;
    public long f29996m4;
    public org.telegram.ui.Components.u5 f29997m5;
    public boolean f29998m6;
    public StaticLayout f29999m7;
    public dk0 f30000m8;
    public float f30001m9;
    public Object f30002ma;
    public org.telegram.messenger.n6 f30003mb;
    public final AtomicReference f30004mc;
    public int f30005n;
    public boolean f30006n0;
    public boolean f30007n1;
    public StaticLayout f30008n2;
    public sg0 f30009n3;
    public boolean n4;
    public int f30010n5;
    public boolean f30011n6;
    public org.telegram.ui.Components.y5 f30012n7;
    public dk0 f30013n8;
    public StaticLayout f30014n9;
    public long f30015na;
    public boolean f30016nb;
    public long f30017nc;
    public int f30018o0;
    public boolean f30019o1;
    public StaticLayout f30020o2;
    public CharSequence f30021o3;
    public boolean f30022o4;
    public int f30023o5;
    public boolean f30024o6;
    public boolean f30025o7;
    public dk0 f30026o8;
    public int f30027o9;
    public String f30028oa;
    public final h1 f30029ob;
    public int f30030oc;
    public int f30031p0;
    public float f30032p1;
    public StaticLayout f30033p2;
    public xi f30034p3;
    public org.telegram.ui.Components.p5 f30035p4;
    public boolean f30036p5;
    public boolean f30037p6;
    public int f30038p7;
    public dk0 f30039p8;
    public final StaticLayout[] f30040p9;
    public org.telegram.ui.Components.e5 f30041pa;
    public int f30042pb;
    public int f30043pc;
    public int f30044q0;
    public long f30045q1;
    public StaticLayout f30046q2;
    public int f30047q3;
    public t70 f30048q4;
    public boolean f30049q5;
    public boolean f30050q6;
    public int f30051q7;
    public dk0 f30052q8;
    public int f30053q9;
    public org.telegram.ui.Components.e5 f30054qa;
    public int f30055qb;
    public int f30056qc;
    public n3 f30057r;
    public int f30058r0;
    public int f30059r1;
    public float f30060r2;
    public float f30061r3;
    public wi f30062r4;
    public float r5;
    public boolean f30063r6;
    public boolean f30064r7;
    public boolean f30065r8;
    public boolean r9;
    public TLRPC.User f30066ra;
    public float f30067rb;
    public int f30068rc;
    public boolean f30069s;
    public s1 f30070s0;
    public org.telegram.ui.h5 f30071s1;
    public float f30072s2;
    public float f30073s3;
    public int f30074s4;
    public int f30075s5;
    public long s6;
    public int f30076s7;
    public lc f30077s8;
    public float f30078s9;
    public TLRPC.User f30079sa;
    public boolean f30080sb;
    public float f30081sc;
    public u1 f30082t0;
    public bi.c1 f30083t1;
    public boolean f30084t2;
    public int f30085t3;
    public final m2.p0 f30086t4;
    public float f30087t5;
    public boolean f30088t6;
    public int f30089t7;
    public int f30090t8;
    public int f30091t9;
    public TLRPC.Chat f30092ta;
    public ValueAnimator f30093tb;
    public float tc;
    public int f30094u0;
    public boolean f30095u1;
    public RectF f30096u2;
    public int f30097u3;
    public int f30098u4;
    public float f30099u5;
    public boolean f30100u6;
    public int f30101u7;
    public y f30102u8;
    public int f30103u9;
    public String f30104ua;
    public int f30105ub;
    public org.telegram.ui.Components.a8 uc;
    public int f30106v0;
    public boolean f30107v1;
    public r1 f30108v2;
    public int f30109v3;
    public final ArrayList f30110v4;
    public int f30111v5;
    public boolean f30112v6;
    public int f30113v7;
    public ly0 f30114v8;
    public final float[] f30115v9;
    public String f30116va;
    public final h1 f30117vb;
    public za.p f30118vc;
    public l0 f30119w;
    public int f30120w0;
    public boolean f30121w1;
    public w1 f30122w2;
    public StaticLayout f30123w3;
    public final ArrayList f30124w4;
    public int f30125w5;
    public boolean f30126w6;
    public boolean f30127w7;
    public ly0 f30128w8;
    public float f30129w9;
    public boolean f30130wa;
    public final SparseArray f30131wb;
    public boolean f30132wc;
    public final org.telegram.ui.Components.i9 f30133x;
    public int f30134x0;
    public boolean f30135x1;
    public int f30136x2;
    public org.telegram.ui.Components.g6 f30137x3;
    public w70 f30138x4;
    public boolean f30139x5;
    public boolean f30140x6;
    public final Rect f30141x7;
    public int f30142x8;
    public float f30143x9;
    public boolean xa;
    public boolean f30144xb;
    public boolean f30145xc;
    public boolean f30146y;
    public int f30147y0;
    public boolean f30148y1;
    public CharSequence f30149y2;
    public org.telegram.ui.Components.g6 f30150y3;
    public ArrayList f30151y4;
    public String f30152y5;
    public int f30153y6;
    public boolean f30154y7;
    public int f30155y8;
    public StaticLayout y9;
    public boolean f30156ya;
    public boolean f30157yb;
    public ng0 yc;
    public int f30158z0;
    public long f30159z1;
    public int f30160z2;
    public StaticLayout f30161z3;
    public CharacterStyle f30162z4;
    public TLRPC.Message f30163z5;
    public float f30164z6;
    public final ImageReceiver f30165z7;
    public org.telegram.ui.Components.u5 f30166z8;
    public int f30167z9;
    public org.telegram.ui.Components.l5 f30168za;
    public float f30169zb;
    public boolean f30170zc;

    public q1(Context context, int i3) {
        this(context, i3, false, null, null);
    }

    public static boolean B2(m1 m1Var, float f10, float f11) {
        RectF rectF = m1Var.d;
        if (f10 >= rectF.left - org.telegram.messenger.g0.L(6.0f) && f10 <= rectF.right + org.telegram.messenger.g0.L(6.0f) && f11 >= rectF.top - org.telegram.messenger.g0.L(4.0f) && f11 <= rectF.bottom + org.telegram.messenger.g0.L(4.0f)) {
            return true;
        }
        return false;
    }

    public static StaticLayout H1(CharSequence charSequence, TextPaint textPaint, int i3, int i10, int i11, int i12) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int i13 = i3;
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
        return lu0.c(spannableStringBuilder, textPaint, i17, Layout.Alignment.ALIGN_NORMAL, org.telegram.messenger.g0.L(1.0f), TextUtils.TruncateAt.END, i17, i12, true);
    }

    public static String I3(zi ziVar, zi ziVar2, boolean z10, int i3) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        boolean z11 = ziVar.f26907u1;
        int i10 = ziVar.I1;
        int i11 = ziVar.V;
        if (!z11 && !ziVar.s4() && !zi.c4(ziVar.f26868k) && !zi.e5(ziVar.f26868k)) {
            if (!ziVar.f26887p1 || ziVar.f26868k.date != 2147483646) {
                if (i11 != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    long j10 = i11;
                    sb2.append(bd.T(j10));
                    sb2.append(", ");
                    sb2.append(bd.E0().p0().format(j10 * 1000));
                    return sb2.toString();
                } else if (ziVar.f26857h2) {
                    return bd.T(ziVar2.f26868k.date) + ", " + bd.E0().p0().format(ziVar2.f26868k.date * 1000);
                } else if (z10) {
                    if (((org.telegram.messenger.h0) hp.s1(i10).f23167x7.U.f13688b).f22814c) {
                        if (i3 == 0 && ziVar.Z2()) {
                            i3 = ConnectionsManager.getInstance(i10).getCurrentTime();
                        }
                        return bd.L(i3);
                    }
                    return bd.M0(2131751211, null) + " " + bd.E0().p0().format(ziVar2.f26868k.date * 1000);
                } else if (ziVar.f26874l2 && (messageFwdHeader = (message = ziVar.f26868k).fwd_from) != null && ((messageFwdHeader.date != 0 || messageFwdHeader.saved_date != 0) && !(zi.o1(message) instanceof TLRPC.TL_messageMediaWidget))) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = ziVar.f26868k.fwd_from;
                    int i12 = messageFwdHeader2.saved_date;
                    if (i12 == 0) {
                        i12 = messageFwdHeader2.date;
                    }
                    return bd.O(i12);
                } else {
                    return bd.E0().p0().format(ziVar2.f26868k.date * 1000);
                }
            }
            return "";
        }
        return "";
    }

    public static int J1(ri riVar) {
        int i3 = 0;
        if (riVar != null) {
            if ((riVar.f25149l & 2) == 0) {
                i3 = org.telegram.messenger.g0.L(4.0f);
            }
            if ((riVar.f25149l & 1) == 0) {
                return org.telegram.messenger.g0.L(4.0f) + i3;
            }
        }
        return i3;
    }

    public static SpannableStringBuilder J3(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (int i3 = 0; i3 < spannableStringBuilder.length(); i3++) {
            char charAt = spannableStringBuilder.charAt(i3);
            if (charAt == '\n' || charAt == '\r' || charAt == '\t' || charAt == 8232 || charAt == 8233) {
                spannableStringBuilder.replace(i3, i3 + 1, (CharSequence) " ");
            }
        }
        return spannableStringBuilder;
    }

    public static int K1(StaticLayout staticLayout) {
        if (staticLayout.getLineCount() <= 0) {
            return 0;
        }
        return (int) Math.ceil(staticLayout.getLineWidth(0));
    }

    public static boolean L2(String str) {
        if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && !"telegram_bot".equals(str) && !"telegram_user".equals(str) && !"telegram_channel".equals(str) && !"telegram_channel_direct".equals(str) && !"telegram_megagroup".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_aicomposetone".equals(str)) {
            return false;
        }
        return true;
    }

    public static android.graphics.PointF P1(int r3, int r4, int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.P1(int, int, int, int):android.graphics.PointF");
    }

    public static boolean S2() {
        return org.telegram.messenger.lc.e(2);
    }

    public static StaticLayout T2(CharSequence charSequence, TextPaint textPaint, int i3) {
        SpannableStringBuilder J3 = J3(charSequence);
        if (J3 != null && i3 > 0) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            CharSequence ellipsize = TextUtils.ellipsize(J3, textPaint, i3, truncateAt);
            int L = org.telegram.messenger.g0.L(2.0f) + Math.max(1, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())));
            return lu0.c(ellipsize, textPaint, L, Layout.Alignment.ALIGN_NORMAL, 0.0f, truncateAt, L, 1, true);
        }
        return null;
    }

    public static int[] W1(Spannable spannable, CharacterStyle characterStyle) {
        int i3;
        int i10;
        boolean z10;
        ty0 ty0Var;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof t31) && (ty0Var = ((t31) characterStyle).f38240a) != null && (messageEntity = ty0Var.d) != null) {
            i3 = messageEntity.offset;
            i10 = messageEntity.length + i3;
            z10 = true;
        } else {
            i3 = 0;
            i10 = 0;
            z10 = false;
        }
        if (!z10) {
            i3 = spannable.getSpanStart(characterStyle);
            i10 = spannable.getSpanEnd(characterStyle);
        }
        return new int[]{i3, i10};
    }

    public static void Y0(Canvas canvas, StaticLayout staticLayout, float f10, float f11) {
        canvas.save();
        canvas.translate(f10 - staticLayout.getLineLeft(0), ((org.telegram.messenger.g0.L(16.0f) - staticLayout.getHeight()) / 2.0f) + f11);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    private long getAuthorBotVerificationId() {
        zi ziVar;
        TLRPC.User user = this.f29955ia;
        if (user != null) {
            return org.telegram.messenger.m5.c(user);
        }
        if (this.f29968ja != null && (ziVar = this.P5) != null && zi.B0(ziVar.f26868k) != 1271266957 && this.f29968ja.signature_profiles) {
            long o10 = org.telegram.messenger.m5.o(this.P5.f26868k.from_id);
            int i3 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
            int i10 = this.Z5;
            if (i3 >= 0) {
                TLRPC.User a22 = hp.s1(i10).a2(Long.valueOf(o10));
                if (a22 != null) {
                    return org.telegram.messenger.m5.c(a22);
                }
            } else {
                TLRPC.Chat M0 = hp.s1(i10).M0(Long.valueOf(-o10));
                if (M0 != null) {
                    return org.telegram.messenger.m5.c(M0);
                }
            }
        }
        return 0L;
    }

    private String getAuthorName() {
        TLRPC.User user = this.f29955ia;
        if (user != null) {
            return l10.p(user);
        }
        if (this.f29968ja != null) {
            zi ziVar = this.P5;
            if (ziVar != null && zi.B0(ziVar.f26868k) != 1271266957 && this.f29968ja.signature_profiles) {
                long o10 = org.telegram.messenger.m5.o(this.P5.f26868k.from_id);
                int i3 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
                int i10 = this.Z5;
                if (i3 >= 0) {
                    TLRPC.User a22 = hp.s1(i10).a2(Long.valueOf(o10));
                    if (a22 != null) {
                        return l10.p(a22);
                    }
                } else {
                    TLRPC.Chat M0 = hp.s1(i10).M0(Long.valueOf(-o10));
                    if (M0 != null) {
                        return M0.title;
                    }
                }
            }
            return this.f29968ja.title;
        }
        zi ziVar2 = this.P5;
        if (ziVar2 != null && ziVar2.s4()) {
            return this.P5.Q0;
        }
        return "DELETED";
    }

    private Object getAuthorStatus() {
        zi ziVar;
        TLRPC.User user = this.f29955ia;
        if (user != null) {
            Long h = l10.h(user);
            if (h != null) {
                TLRPC.EmojiStatus emojiStatus = this.f29955ia.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f30028oa = ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug;
                }
                return h;
            } else if (this.f29955ia.premium) {
                return org.telegram.messenger.t0.f25457b.getDrawable(2131232307).mutate();
            } else {
                return null;
            }
        } else if (this.f29968ja != null && (ziVar = this.P5) != null && zi.B0(ziVar.f26868k) != 1271266957 && this.f29968ja.signature_profiles) {
            long o10 = org.telegram.messenger.m5.o(this.P5.f26868k.from_id);
            if (o10 >= 0) {
                TLRPC.User a22 = hp.s1(this.Z5).a2(Long.valueOf(o10));
                if (a22 != null) {
                    TLRPC.EmojiStatus emojiStatus2 = a22.emoji_status;
                    if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                        this.f30028oa = ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).slug;
                    }
                }
                return l10.h(a22);
            }
            TLRPC.Chat M0 = hp.s1(this.Z5).M0(Long.valueOf(-o10));
            if (M0 != null) {
                TLRPC.EmojiStatus emojiStatus3 = M0.emoji_status;
                if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f30028oa = ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug;
                }
                return Long.valueOf(org.telegram.messenger.m5.f(emojiStatus3));
            }
            return null;
        } else {
            return null;
        }
    }

    private int getCommentButtonHeight() {
        float f10;
        if (t2()) {
            return org.telegram.messenger.g0.L(24.0f);
        }
        if (D3()) {
            f10 = 41.3f;
        } else {
            f10 = 43.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    private int getCompactHeaderColor() {
        return i0.a.k(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sa, this.Pb), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28200ua, this.Pb));
    }

    private int getCompactInShift() {
        if (t2()) {
            return (org.telegram.messenger.g0.L(16.0f) - org.telegram.messenger.g0.L(20.0f)) - getExtraTextX();
        }
        return 0;
    }

    private int getCompactSideButtonColumn() {
        zi ziVar;
        if (this.f30144xb && this.E8 != 0 && (ziVar = this.P5) != null && ziVar.U4()) {
            return org.telegram.messenger.g0.L(40.0f);
        }
        return 0;
    }

    private float getCompactSideMenuShift() {
        if (t2()) {
            return org.telegram.messenger.g0.L(71.0f) * this.Y6;
        }
        return 0.0f;
    }

    private int getCompactSideMenuWidth() {
        if (this.X6) {
            return org.telegram.messenger.g0.L(71.0f);
        }
        return 0;
    }

    private kh.a getDraftMessageMeasureController() {
        l1 l1Var = this.Ra;
        if (l1Var != null) {
            return l1Var.Z();
        }
        return null;
    }

    private ColorMatrixColorFilter getFancyBlurFilter() {
        if (this.W0 == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
            org.telegram.messenger.g0.i(colorMatrix, 0.6f);
            this.W0 = new ColorMatrixColorFilter(colorMatrix);
        }
        return this.W0;
    }

    private int getGroupPhotosWidth() {
        int parentWidth = getParentWidth();
        zi ziVar = this.P5;
        if (ziVar != null && ziVar.f26895r1) {
            parentWidth = this.L0;
        }
        if (!org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
            if (!org.telegram.messenger.g0.P1() || getResources().getConfiguration().orientation == 2) {
                return parentWidth - org.telegram.messenger.g0.l1(parentWidth, 0, 0);
            }
            return parentWidth;
        }
        return parentWidth;
    }

    private float getNameAvatarOffset() {
        float f10;
        if (v2()) {
            f10 = 21.0f;
        } else {
            f10 = 32.33f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    private int getNameHeight() {
        if (this.f29978k9 && !v2()) {
            if (this.Z8 == null) {
                return org.telegram.messenger.g0.L(31.0f);
            }
            return org.telegram.messenger.g0.L(37.66f);
        }
        return (int) (org.telegram.ui.ActionBar.k6.W2.getTextSize() + org.telegram.messenger.g0.L(5.0f));
    }

    private float getNameHeightAnimated() {
        float f10;
        float f11;
        x1 x1Var = this.hb;
        float f12 = 0.0f;
        if (x1Var.Q2) {
            boolean z10 = this.f29978k9;
            f10 = org.telegram.messenger.g0.V1(!z10, z10, x1Var.L1);
        } else if (this.f29978k9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float textSize = org.telegram.ui.ActionBar.k6.W2.getTextSize() + org.telegram.messenger.g0.L(5.0f);
        if (this.Z8 == null) {
            f11 = 31.0f;
        } else {
            f11 = 35.0f;
        }
        float L = org.telegram.messenger.g0.L(f11);
        if (!v2()) {
            f12 = f10;
        }
        return org.telegram.messenger.g0.T1(textSize, L, f12);
    }

    private ArrayList<TLRPC.Peer> getRecentRepliers() {
        TLRPC.MessageReplies messageReplies;
        ui uiVar = this.L;
        if (uiVar != null && !uiVar.d.isEmpty() && (messageReplies = ((zi) this.L.d.get(0)).f26868k.replies) != null) {
            return messageReplies.recent_repliers;
        }
        TLRPC.MessageReplies messageReplies2 = this.P5.f26868k.replies;
        if (messageReplies2 != null) {
            return messageReplies2.recent_repliers;
        }
        return null;
    }

    private int getSelectionOverlayColor() {
        int i3;
        org.telegram.ui.ActionBar.e6 e6Var = this.Pb;
        if (e6Var == null) {
            return 0;
        }
        zi ziVar = this.P5;
        if (ziVar != null && ziVar.O3()) {
            i3 = org.telegram.ui.ActionBar.k6.Mc;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.f28162sa;
        }
        return e6Var.h(i3);
    }

    private float getUseTranscribeButtonProgress() {
        x1 x1Var = this.hb;
        if (x1Var.f30902o1) {
            if (this.H4) {
                return x1Var.L1;
            }
            return 1.0f - x1Var.L1;
        } else if (this.H4) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public static boolean o2(float f10, float f11, float f12, float f13) {
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

    public static void p0(ImageReceiver imageReceiver) {
        Bitmap n4;
        if (imageReceiver != null && (n4 = imageReceiver.n()) != null) {
            n4.recycle();
            imageReceiver.w0(null);
        }
    }

    public static n1 w0(int i3, String str, int i10, float f10) {
        n1 n1Var = new n1();
        n1Var.f29653a = i3;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, org.telegram.ui.ActionBar.k6.M2, i10, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.M2, org.telegram.messenger.g0.L(2.0f) + i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        n1Var.d = staticLayout;
        n1Var.f29654b = f10;
        if (staticLayout.getLineCount() > 0) {
            n1Var.f29655c = ((float) (n1Var.f29654b - Math.ceil(n1Var.d.getLineWidth(0)))) / 2.0f;
            n1Var.f29655c -= (int) n1Var.d.getLineLeft(0);
        }
        return n1Var;
    }

    public final void A() {
        StaticLayout staticLayout;
        if (this.P5.D == 20 && (staticLayout = this.W9) != null) {
            ei.c3 c3Var = this.U0;
            this.U9 = com.google.android.recaptcha.internal.a.z(c3Var.N0, staticLayout.getWidth(), 2.0f, this.M6);
            this.V9 = com.google.android.recaptcha.internal.a.z(c3Var.O0, this.W9.getHeight(), 2.0f, this.O6 + c3Var.M0);
        }
    }

    public final void A0(int i3) {
        int i10;
        int w02;
        dk0 dk0Var;
        dk0 dk0Var2;
        int i11;
        int i12;
        int i13;
        if (this.P5.H4()) {
            if (this.P5.Q3()) {
                i13 = org.telegram.ui.ActionBar.k6.Lb;
            } else {
                i13 = org.telegram.ui.ActionBar.k6.f28278yd;
            }
            w02 = org.telegram.ui.ActionBar.k6.w0(i13, this.Pb);
        } else if (i3 == 0 && this.D5) {
            if (this.P5.Q3()) {
                i11 = org.telegram.ui.ActionBar.k6.Fb;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.f28032ld;
            }
            w02 = org.telegram.ui.ActionBar.k6.w0(i11, this.Pb);
        } else if (i3 == 0 && (dk0Var2 = this.f30013n8) != null) {
            w02 = dk0Var2.i();
        } else if (i3 == 0 && (dk0Var = this.f30039p8) != null) {
            w02 = dk0Var.i();
        } else {
            if (this.P5.Q3()) {
                i10 = org.telegram.ui.ActionBar.k6.Lb;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f28278yd;
            }
            w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.Pb);
        }
        Drawable[] drawableArr = this.I2;
        Drawable drawable = drawableArr[i3];
        if (drawable == null) {
            org.telegram.ui.ActionBar.v5 v5Var = new org.telegram.ui.ActionBar.v5(this, i3);
            org.telegram.ui.ActionBar.v5[] v5VarArr = this.J2;
            v5VarArr[i3] = v5Var;
            int[][] iArr = {StateSet.WILD_CARD};
            if (this.P5.Q3()) {
                i12 = org.telegram.ui.ActionBar.k6.Lb;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.f28278yd;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{436207615 & org.telegram.ui.ActionBar.k6.w0(i12, this.Pb)}), null, v5VarArr[i3]);
            drawableArr[i3] = rippleDrawable;
            rippleDrawable.setCallback(this);
        } else {
            org.telegram.ui.ActionBar.k6.H1(drawable, w02 & 436207615, true);
        }
        drawableArr[i3].setVisible(true, false);
    }

    public final void A1(Canvas canvas, float f10, float f11, float f12, float f13, boolean z10) {
        boolean z11;
        float f14;
        float f15;
        double d;
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable Y1;
        float f16;
        float f17;
        float f18;
        boolean z15;
        boolean z16;
        String str;
        Drawable Y12;
        float r5;
        float f19;
        String str2;
        Drawable Y13;
        if (f13 != 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f20 = (f13 * 0.5f) + 0.5f;
        float f21 = f10 * f13;
        this.O.getClass();
        int alpha = org.telegram.ui.ActionBar.k6.T2.getAlpha();
        float a22 = a2(f11);
        StaticLayout staticLayout = this.f29918fa;
        x1 x1Var = this.hb;
        float f22 = 0.0f;
        if (staticLayout == null && !x1Var.G) {
            f15 = 10.0f;
            d = 1.0d;
        } else {
            boolean z17 = x1Var.f30877i1;
            if (z17) {
                f14 = this.B9;
            } else {
                f14 = f12;
            }
            float f23 = f14 + 0.0f;
            f15 = 10.0f;
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
            if ((!this.f30144xb || !x1Var.m1) && z17 && !z12) {
                if (z13) {
                    f23 = x1Var.J;
                } else {
                    float f24 = x1Var.J;
                    float f25 = x1Var.L1;
                    f23 = (f23 * f25) + ((1.0f - f25) * f24);
                }
            }
            ui uiVar = this.L;
            if (uiVar != null) {
                ti tiVar = uiVar.f25709m;
                if (tiVar.f25534j) {
                    f23 += tiVar.f25532g;
                }
            }
            if (x1Var.f30936x0) {
                f23 += this.Vc;
            }
            if (D3()) {
                if (this.P5.Q5()) {
                    Y1 = Y1("drawableMsgStickerReplies");
                } else {
                    Y1 = org.telegram.ui.ActionBar.k6.f27840b4;
                }
            } else if (!this.P5.Q3()) {
                if (z10) {
                    Y1 = org.telegram.ui.ActionBar.k6.R3;
                } else {
                    Y1 = org.telegram.ui.ActionBar.k6.Q3;
                }
            } else {
                Y1 = Y1("drawableMsgOutReplies");
            }
            float r9 = z.r(Y1, f23, a22, org.telegram.ui.ActionBar.k6.T2.getTextSize());
            if (z12) {
                f16 = x1Var.L1 * f21;
            } else if (z13) {
                f16 = (1.0f - x1Var.L1) * f21;
            } else {
                f16 = f21;
            }
            Y1.setAlpha((int) (f16 * 255.0f));
            if (z11) {
                canvas.save();
                canvas.scale(f20, f20, org.telegram.messenger.k5.a(org.telegram.messenger.g0.L(3.0f) + r9, this.f29931ga, 2.0f, f23), Y1.getBounds().centerY());
            }
            Y1.draw(canvas);
            Y1.setAlpha(255);
            if (x1Var.G) {
                if (z14) {
                    canvas.save();
                    f17 = r9;
                    org.telegram.ui.ActionBar.k6.T2.setAlpha((int) ((1.0d - x1Var.L1) * alpha));
                    canvas.translate(f23 + f17 + org.telegram.messenger.g0.L(3.0f), a22);
                    x1Var.I.draw(canvas);
                    canvas.restore();
                } else {
                    f17 = r9;
                }
                org.telegram.ui.ActionBar.k6.T2.setAlpha((int) (alpha * f16));
            } else {
                f17 = r9;
            }
            canvas.save();
            canvas.translate(f23 + f17 + org.telegram.messenger.g0.L(3.0f), a22);
            StaticLayout staticLayout2 = this.f29918fa;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                StaticLayout staticLayout3 = x1Var.I;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
            }
            canvas.restore();
            if (this.f29918fa != null) {
                f22 = f17 + this.f29931ga + org.telegram.messenger.g0.L(10.0f) + 0.0f;
            }
            if (z11) {
                canvas.restore();
            }
            if (x1Var.G) {
                org.telegram.ui.ActionBar.k6.T2.setAlpha(alpha);
            }
            x1Var.K = f23;
        }
        if (this.f29877ca != null) {
            boolean z19 = x1Var.f30877i1;
            if (z19) {
                f19 = this.B9;
            } else {
                f19 = f12;
            }
            float f26 = f19 + f22;
            if ((!this.f30144xb || !x1Var.m1) && z19) {
                float f27 = x1Var.L;
                float f28 = x1Var.L1;
                f26 = (f26 * f28) + ((1.0f - f28) * f27);
            }
            ui uiVar2 = this.L;
            if (uiVar2 != null) {
                ti tiVar2 = uiVar2.f25709m;
                if (tiVar2.f25534j) {
                    f26 += tiVar2.f25532g;
                }
            }
            if (x1Var.f30936x0) {
                f26 += this.Vc;
            }
            if (D3()) {
                if (this.P5.Q5()) {
                    Y13 = Y1("drawableMsgStickerViews");
                } else {
                    Y13 = org.telegram.ui.ActionBar.k6.f27821a4;
                }
            } else if (!this.P5.Q3()) {
                if (z10) {
                    Y13 = org.telegram.ui.ActionBar.k6.N3;
                } else {
                    Y13 = org.telegram.ui.ActionBar.k6.M3;
                }
            } else {
                if (z10) {
                    str2 = "drawableMsgOutViewsSelected";
                } else {
                    str2 = "drawableMsgOutViews";
                }
                Y13 = Y1(str2);
            }
            float r10 = z.r(Y13, f26, org.telegram.messenger.g0.L(1.5f) + a22, org.telegram.ui.ActionBar.k6.T2.getTextSize() - org.telegram.messenger.g0.L(2.0f));
            if (z11) {
                canvas.save();
                canvas.scale(f20, f20, (((org.telegram.messenger.g0.L(3.0f) + Y13.getIntrinsicWidth()) + this.f29890da) / 2.0f) + f26, Y13.getBounds().centerY());
            }
            Y13.setAlpha((int) (f21 * 255.0f));
            Y13.draw(canvas);
            Y13.setAlpha(255);
            if (x1Var.f30859e2 != null) {
                canvas.save();
                org.telegram.ui.ActionBar.k6.T2.setAlpha((int) ((d - x1Var.L1) * alpha));
                canvas.translate(f26 + r10 + org.telegram.messenger.g0.L(3.0f), a22);
                yh.f.f(canvas, x1Var.f30859e2);
                canvas.restore();
                org.telegram.ui.ActionBar.k6.T2.setAlpha((int) (alpha * x1Var.L1));
            }
            canvas.save();
            canvas.translate(f26 + r10 + org.telegram.messenger.g0.L(3.0f), a22);
            yh.f.f(canvas, this.f29877ca);
            canvas.restore();
            if (z11) {
                canvas.restore();
            }
            f22 = this.f29890da + r10 + org.telegram.messenger.g0.L(f15) + f22;
            if (x1Var.f30859e2 != null) {
                org.telegram.ui.ActionBar.k6.T2.setAlpha(alpha);
            }
            x1Var.M = f26;
        }
        boolean z20 = this.f30037p6;
        if (!z20 && !x1Var.C) {
            return;
        }
        boolean z21 = x1Var.f30877i1;
        if (z21) {
            f18 = this.B9;
        } else {
            f18 = f12;
        }
        float f29 = f18 + f22;
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
        if (!this.f30144xb && z21 && !z15) {
            if (z16) {
                f29 = x1Var.E;
            } else {
                float f30 = x1Var.E;
                float f31 = x1Var.L1;
                f29 = (f29 * f31) + ((1.0f - f31) * f30);
            }
        }
        ui uiVar3 = this.L;
        if (uiVar3 != null) {
            ti tiVar3 = uiVar3.f25709m;
            if (tiVar3.f25534j) {
                f29 += tiVar3.f25532g;
            }
        }
        if (x1Var.f30936x0) {
            f29 += this.Vc;
        }
        if (D3()) {
            if (this.P5.Q5()) {
                Y12 = Y1("drawableMsgStickerPinned");
            } else {
                Y12 = org.telegram.ui.ActionBar.k6.Z3;
            }
        } else if (!this.P5.Q3()) {
            if (z10) {
                Y12 = org.telegram.ui.ActionBar.k6.V3;
            } else {
                Y12 = org.telegram.ui.ActionBar.k6.U3;
            }
        } else {
            if (z10) {
                str = "drawableMsgOutPinnedSelected";
            } else {
                str = "drawableMsgOutPinned";
            }
            Y12 = Y1(str);
        }
        if (x1Var.C) {
            if (this.f30037p6) {
                Y12.setAlpha((int) (f21 * 255.0f * x1Var.L1));
                r5 = z.r(Y12, f29, a22, org.telegram.ui.ActionBar.k6.T2.getTextSize() + org.telegram.messenger.g0.L(1.0f));
            } else {
                Y12.setAlpha((int) ((1.0f - x1Var.L1) * f21 * 255.0f));
                r5 = z.r(Y12, f29, a22, org.telegram.ui.ActionBar.k6.T2.getTextSize() + org.telegram.messenger.g0.L(1.0f));
            }
        } else {
            Y12.setAlpha((int) (f21 * 255.0f));
            r5 = z.r(Y12, f29, a22, org.telegram.ui.ActionBar.k6.T2.getTextSize() + org.telegram.messenger.g0.L(1.0f));
        }
        if (z11) {
            canvas.save();
            canvas.scale(f20, f20, (r5 / 2.0f) + f29, Y12.getBounds().centerY());
        }
        Y12.draw(canvas);
        Y12.setAlpha(255);
        if (z11) {
            canvas.restore();
        }
        x1Var.D = f29;
    }

    public final boolean A2(float f10) {
        if (this.K6 != null) {
            int i3 = this.M6;
            if (f10 >= i3 && f10 <= i3 + this.N6) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A3() {
        int i3;
        int i10;
        int i11;
        int i12;
        if (this.P5.Q3()) {
            TextPaint textPaint = org.telegram.ui.ActionBar.k6.f28077o2;
            int i13 = org.telegram.ui.ActionBar.k6.Tc;
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i13, this.Pb));
            org.telegram.ui.ActionBar.k6.f28250x2.setColor(org.telegram.ui.ActionBar.k6.w0(i13, this.Pb));
            org.telegram.ui.ActionBar.k6.f28097p2.setColor(org.telegram.ui.ActionBar.k6.w0(i13, this.Pb));
            org.telegram.ui.ActionBar.k6.f28117q2.setColor(org.telegram.ui.ActionBar.k6.w0(i13, this.Pb));
            org.telegram.ui.ActionBar.k6.f28137r2.setColor(org.telegram.ui.ActionBar.k6.w0(i13, this.Pb));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.k6.f28250x2;
            TextPaint textPaint3 = org.telegram.ui.ActionBar.k6.Z2;
            TextPaint textPaint4 = org.telegram.ui.ActionBar.k6.f27820a3;
            TextPaint textPaint5 = org.telegram.ui.ActionBar.k6.f28077o2;
            TextPaint textPaint6 = org.telegram.ui.ActionBar.k6.f28097p2;
            TextPaint textPaint7 = org.telegram.ui.ActionBar.k6.f28117q2;
            TextPaint textPaint8 = org.telegram.ui.ActionBar.k6.f28137r2;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vc, this.Pb);
            textPaint8.linkColor = w02;
            textPaint7.linkColor = w02;
            textPaint6.linkColor = w02;
            textPaint5.linkColor = w02;
            textPaint4.linkColor = w02;
            textPaint3.linkColor = w02;
            textPaint2.linkColor = w02;
        } else {
            TextPaint textPaint9 = org.telegram.ui.ActionBar.k6.f28077o2;
            int i14 = org.telegram.ui.ActionBar.k6.Sc;
            textPaint9.setColor(org.telegram.ui.ActionBar.k6.w0(i14, this.Pb));
            org.telegram.ui.ActionBar.k6.f28250x2.setColor(org.telegram.ui.ActionBar.k6.w0(i14, this.Pb));
            org.telegram.ui.ActionBar.k6.f28097p2.setColor(org.telegram.ui.ActionBar.k6.w0(i14, this.Pb));
            org.telegram.ui.ActionBar.k6.f28117q2.setColor(org.telegram.ui.ActionBar.k6.w0(i14, this.Pb));
            org.telegram.ui.ActionBar.k6.f28137r2.setColor(org.telegram.ui.ActionBar.k6.w0(i14, this.Pb));
            TextPaint textPaint10 = org.telegram.ui.ActionBar.k6.f28250x2;
            TextPaint textPaint11 = org.telegram.ui.ActionBar.k6.Z2;
            TextPaint textPaint12 = org.telegram.ui.ActionBar.k6.f27820a3;
            TextPaint textPaint13 = org.telegram.ui.ActionBar.k6.f28077o2;
            TextPaint textPaint14 = org.telegram.ui.ActionBar.k6.f28097p2;
            TextPaint textPaint15 = org.telegram.ui.ActionBar.k6.f28117q2;
            TextPaint textPaint16 = org.telegram.ui.ActionBar.k6.f28137r2;
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, this.Pb);
            textPaint16.linkColor = w03;
            textPaint15.linkColor = w03;
            textPaint14.linkColor = w03;
            textPaint13.linkColor = w03;
            textPaint12.linkColor = w03;
            textPaint11.linkColor = w03;
            textPaint10.linkColor = w03;
        }
        if (this.M1 != null) {
            int i15 = this.L1;
            if (i15 != 3 && i15 != 7) {
                if (i15 == 5) {
                    if (this.P5.Q3()) {
                        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28013kc, this.Pb);
                        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28031lc, this.Pb);
                        int i16 = org.telegram.ui.ActionBar.k6.f28068nc;
                        this.C4.g(w04, w05, org.telegram.ui.ActionBar.k6.w0(i16, this.Pb), org.telegram.ui.ActionBar.k6.w0(i16, this.Pb), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28049mc, this.Pb));
                    } else if (this.Q1 && this.f30013n8 != null) {
                        int c2 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ie, this.Pb), this.f30013n8.i());
                        int c10 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27996je, this.Pb), this.f30013n8.i());
                        int i17 = org.telegram.ui.ActionBar.k6.f28033le;
                        this.C4.g(c2, c10, org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(i17, this.Pb), this.f30013n8.i()), org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(i17, this.Pb), this.f30013n8.i()), org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ke, this.Pb), this.f30013n8.i()));
                    } else {
                        int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ie, this.Pb);
                        int w07 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27996je, this.Pb);
                        int i18 = org.telegram.ui.ActionBar.k6.f28033le;
                        this.C4.g(w06, w07, org.telegram.ui.ActionBar.k6.w0(i18, this.Pb), org.telegram.ui.ActionBar.k6.w0(i18, this.Pb), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ke, this.Pb));
                    }
                }
            } else {
                boolean Q3 = this.P5.Q3();
                sm0 sm0Var = this.D4;
                if (Q3) {
                    int w08 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28087oc, this.Pb);
                    int w09 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28127qc, this.Pb);
                    int w010 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28107pc, this.Pb);
                    sm0Var.f38078p = w08;
                    sm0Var.f38079q = w09;
                    sm0Var.f38080r = w010;
                    int w011 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28013kc, this.Pb);
                    int w012 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28031lc, this.Pb);
                    int i19 = org.telegram.ui.ActionBar.k6.f28068nc;
                    this.C4.g(w011, w012, org.telegram.ui.ActionBar.k6.w0(i19, this.Pb), org.telegram.ui.ActionBar.k6.w0(i19, this.Pb), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28049mc, this.Pb));
                } else if (this.Q1 && this.f30013n8 != null) {
                    int c11 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28051me, this.Pb), this.f30013n8.i());
                    int c12 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28089oe, this.Pb), this.f30013n8.i());
                    int c13 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28070ne, this.Pb), this.f30013n8.i());
                    sm0Var.f38078p = c11;
                    sm0Var.f38079q = c12;
                    sm0Var.f38080r = c13;
                    int c14 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ie, this.Pb), this.f30013n8.i());
                    int c15 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27996je, this.Pb), this.f30013n8.i());
                    int i20 = org.telegram.ui.ActionBar.k6.f28033le;
                    this.C4.g(c14, c15, org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(i20, this.Pb), this.f30013n8.i()), org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(i20, this.Pb), this.f30013n8.i()), org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ke, this.Pb), this.f30013n8.i()));
                } else {
                    int w013 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28051me, this.Pb);
                    int w014 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28089oe, this.Pb);
                    int w015 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28070ne, this.Pb);
                    sm0Var.f38078p = w013;
                    sm0Var.f38079q = w014;
                    sm0Var.f38080r = w015;
                    int w016 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ie, this.Pb);
                    int w017 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27996je, this.Pb);
                    int i21 = org.telegram.ui.ActionBar.k6.f28033le;
                    this.C4.g(w016, w017, org.telegram.ui.ActionBar.k6.w0(i21, this.Pb), org.telegram.ui.ActionBar.k6.w0(i21, this.Pb), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ke, this.Pb));
                }
            }
        }
        zi ziVar = this.P5;
        if (ziVar.D == 5) {
            TextPaint textPaint17 = org.telegram.ui.ActionBar.k6.T2;
            if (t2()) {
                if (this.P5.Q3()) {
                    i11 = org.telegram.ui.ActionBar.k6.f27942gc;
                } else {
                    i11 = org.telegram.ui.ActionBar.k6.f27850be;
                }
            } else {
                i11 = org.telegram.ui.ActionBar.k6.Wc;
            }
            int w018 = org.telegram.ui.ActionBar.k6.w0(i11, this.Pb);
            if (x2()) {
                if (this.P5.Q3()) {
                    i12 = org.telegram.ui.ActionBar.k6.f27848bc;
                } else {
                    i12 = org.telegram.ui.ActionBar.k6.ce;
                }
            } else if (this.P5.Q3()) {
                i12 = org.telegram.ui.ActionBar.k6.f27942gc;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.f27850be;
            }
            textPaint17.setColor(i0.a.f(getVideoTranscriptionProgress(), w018, org.telegram.ui.ActionBar.k6.w0(i12, this.Pb)));
        } else if (this.B6) {
            if (ziVar.Q5()) {
                org.telegram.ui.ActionBar.k6.T2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, this.Pb));
            } else {
                org.telegram.ui.ActionBar.k6.T2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Yd, this.Pb));
            }
        } else if (ziVar.Q3()) {
            TextPaint textPaint18 = org.telegram.ui.ActionBar.k6.T2;
            if (x2()) {
                i10 = org.telegram.ui.ActionBar.k6.f27848bc;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f27942gc;
            }
            textPaint18.setColor(org.telegram.ui.ActionBar.k6.w0(i10, this.Pb));
        } else {
            TextPaint textPaint19 = org.telegram.ui.ActionBar.k6.T2;
            if (x2()) {
                i3 = org.telegram.ui.ActionBar.k6.ce;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.f27850be;
            }
            textPaint19.setColor(org.telegram.ui.ActionBar.k6.w0(i3, this.Pb));
        }
    }

    public final int B() {
        if (this.f30107v1) {
            return 4;
        }
        return 8;
    }

    public final void B0(int i3, int i10, boolean z10) {
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
        if ((i3 & 1) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if ((i3 & 2) != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if ((i3 & 4) == 0 && z14 && z12 && !z13 && z11) {
            z15 = true;
        }
        if (this.hb.f30875i && !z15) {
            return;
        }
        this.f30067rb = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f30093tb = ofFloat;
        if (z15) {
            ofFloat.setDuration(220L);
        } else {
            ofFloat.setDuration(150L);
        }
        this.f30093tb.setInterpolator(xq.f40452f);
        this.f30055qb = i3;
        this.f30042pb = i10;
        this.f30093tb.addUpdateListener(new dh.u(3, this, z10));
        this.f30093tb.addListener(new dh.x(21, this, z10));
        this.f30080sb = true;
        this.f30093tb.start();
    }

    public final void B1(Canvas canvas, float f10, Runnable runnable) {
        org.telegram.ui.ActionBar.t4 t4Var;
        float f11;
        boolean z10;
        boolean z11;
        int i3;
        int i10;
        Canvas canvas2 = canvas;
        zi ziVar = this.P5;
        if (ziVar != null && ziVar.T4()) {
            RadialProgress2 radialProgress2 = this.Q0;
            RectF rectF = radialProgress2.f31548a;
            Paint paint = radialProgress2.f31553g;
            m80 m80Var = radialProgress2.f31554i;
            RectF rectF2 = radialProgress2.f31548a;
            float cos = (((float) Math.cos((org.telegram.messenger.g0.W1(f10, 190, 45) / 180.0f) * 3.141592653589793d)) * org.telegram.messenger.g0.L(22.6274f)) + rectF.centerX();
            float sin = (((float) Math.sin((org.telegram.messenger.g0.W1(f10, 190, 45) / 180.0f) * 3.141592653589793d)) * org.telegram.messenger.g0.L(22.6274f)) + rectF2.centerY();
            RectF rectF3 = org.telegram.messenger.g0.P;
            rectF3.set(rectF2);
            rectF3.inset(-org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f));
            canvas2.saveLayerAlpha(rectF3, 255, 31);
            if (x2()) {
                t4Var = this.L6;
            } else {
                t4Var = this.K6;
            }
            m80Var.B = t4Var;
            radialProgress2.f31555j.B = t4Var;
            radialProgress2.I = f10;
            runnable.run();
            if (this.f29842a1 == null) {
                Paint paint2 = new Paint(1);
                this.f29842a1 = paint2;
                f11 = 1.0f;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            } else {
                f11 = 1.0f;
            }
            if (f10 < f11) {
                canvas2.save();
                float f12 = f11 - f10;
                float f13 = 0.7f * f12;
                canvas2.scale(f13, f13, rectF2.centerX(), org.telegram.messenger.g0.T1(rectF2.top, rectF2.bottom, 0.5f));
                if (this.f29855b1 == null) {
                    ch0 ch0Var = new ch0(2131624021, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), true, null);
                    this.f29855b1 = ch0Var;
                    ch0Var.R(this);
                    this.f29855b1.J(true);
                    this.f29855b1.K(1);
                    this.f29855b1.start();
                }
                this.f29855b1.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (this.f29869c1 == null) {
                    i3 = 1;
                    this.f29869c1 = new Paint(1);
                } else {
                    i3 = 1;
                }
                if (this.f29881d1 == null) {
                    Paint paint3 = new Paint(i3);
                    this.f29881d1 = paint3;
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                if (this.f29895e1 == null) {
                    Paint paint4 = new Paint(i3);
                    this.f29895e1 = paint4;
                    paint4.setStyle(Paint.Style.STROKE);
                }
                int i11 = radialProgress2.f31566u;
                if (i11 >= 0) {
                    i10 = org.telegram.ui.ActionBar.k6.w0(i11, this.Pb);
                } else {
                    i10 = radialProgress2.f31559n;
                }
                this.f29869c1.setColor(i10);
                this.f29895e1.setColor(i10);
                m80Var.a(false);
                this.f29869c1.setShader(m80Var.d.getShader());
                this.f29895e1.setShader(m80Var.d.getShader());
                rectF3.set(this.f29855b1.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                float f14 = f11;
                rectF3.inset(f14, f14);
                canvas2.drawRect(rectF3, this.f29869c1);
                this.f29855b1.q(canvas, this.f29881d1, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.f29895e1.setAlpha((int) (255.0f * f12));
                this.f29895e1.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
                RectF rectF4 = this.f29858b4;
                rectF4.set(rectF2);
                rectF4.inset(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
                sm0 sm0Var = this.D4;
                canvas.drawArc(rectF4, -90.0f, (1.0f - sm0Var.K) * (-360.0f), false, this.f29895e1);
                if (this.f29987l5 == null) {
                    this.f29987l5 = new b01();
                }
                this.f29987l5.a((1.0f - sm0Var.K) * (-360.0f), f12, canvas, this.f29895e1, rectF4);
                canvas2 = canvas;
            } else {
                ch0 ch0Var2 = this.f29855b1;
                if (ch0Var2 != null) {
                    ch0Var2.C(true);
                    this.f29855b1 = null;
                    if (this.f29987l5 != null) {
                        this.f29987l5 = null;
                    }
                }
            }
            canvas2.drawCircle(cos, sin, org.telegram.messenger.g0.L((f10 * 1.5f) + 10.0f) * f10, this.f29842a1);
            canvas2.restore();
            if (this.Z0 == null) {
                gi.l lVar = new gi.l(3);
                this.Z0 = lVar;
                z10 = false;
                lVar.e(-1, 0, 0);
                gi.l lVar2 = this.Z0;
                lVar2.f13058i = 14.0f;
                lVar2.c(10.0f);
                this.Z0.f13052a.setStrokeWidth(org.telegram.messenger.g0.N(1.5f));
                z11 = true;
                this.Z0.d(1, false, false);
                this.Z0.f13059j = -org.telegram.messenger.g0.N(0.33f);
                this.Z0.f13060k = org.telegram.messenger.g0.N(0.33f);
            } else {
                z10 = false;
                z11 = true;
            }
            gi.l lVar3 = this.Z0;
            lVar3.f13058i = f10 * 14.0f;
            lVar3.c(f10 * 10.0f);
            canvas2.saveLayerAlpha(cos - org.telegram.messenger.g0.L(10.0f), sin - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f) + cos, org.telegram.messenger.g0.L(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, org.telegram.messenger.g0.L(10.0f) * f10, paint);
            gi.l lVar4 = this.Z0;
            if (org.telegram.messenger.g0.B(paint.getColor()) <= 0.8f) {
                z11 = z10;
            }
            lVar4.b(z11);
            gi.l lVar5 = this.Z0;
            lVar5.f13063n = cos;
            lVar5.f13064o = sin;
            lVar5.a(canvas2, f10);
            canvas2.restore();
            return;
        }
        runnable.run();
    }

    public final boolean B3() {
        ui uiVar;
        zi ziVar = this.P5;
        if (ziVar != null && !ziVar.f26895r1 && !ziVar.s4()) {
            ri riVar = this.M;
            if ((riVar == null || ((uiVar = this.L) != null && uiVar.f25705i && (riVar.f25149l & 8) == 0)) && !this.hb.f30936x0) {
                if (!this.f30146y || !zi.S4(this.P5.f26868k)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void C(boolean z10) {
        boolean z11;
        int i3 = this.L1;
        if (i3 != 3 && i3 != 5) {
            z11 = false;
        } else {
            z11 = true;
        }
        M3(true, z11, false);
    }

    public final void C0() {
        zi ziVar;
        l1 l1Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.P5.u2() && !this.P5.n5()) {
            zi ziVar2 = this.P5;
            if (!ziVar2.M0) {
                if (this.Ra != null && ziVar2.q4()) {
                    this.Ra.C(this);
                    return;
                } else {
                    G3(this.f29936h1, this.f29947i1);
                    return;
                }
            }
        }
        zi ziVar3 = this.P5;
        int i3 = ziVar3.D;
        int i10 = 0;
        if (i3 == 20) {
            TLRPC.Message message = ziVar3.f26868k;
            if (message != null && (messageMedia = message.media) != null && !messageMedia.extended_media.isEmpty()) {
                TLRPC.ReplyMarkup replyMarkup = this.P5.f26868k.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList.get(i10);
                        i10++;
                        Iterator<TL_keyboard.KeyboardInlineButton> it = keyboardInlineButtonRow.buttons.iterator();
                        if (it.hasNext()) {
                            this.Ra.L0(this, it.next());
                            return;
                        }
                    }
                }
            }
        } else if (i3 != 1 && !ziVar3.N2()) {
            zi ziVar4 = this.P5;
            int i11 = ziVar4.D;
            if (i11 == 12) {
                long j10 = zi.o1(ziVar4.f26868k).user_id;
                if (j10 != 0) {
                    user = hp.s1(this.Z5).a2(Long.valueOf(j10));
                } else {
                    user = null;
                }
                this.Ra.s0(this, user, this.f29936h1, this.f29947i1);
            } else if (i11 == 5) {
                if (this.N3 != -1) {
                    D0(false);
                } else if (MediaController.B().I(this.P5) && !MediaController.B().H()) {
                    MediaController.B().R(this.P5, true);
                } else {
                    this.Ra.I1(this, this.P5);
                }
            } else if (i11 == 8) {
                int i12 = this.N3;
                if (i12 != -1 && (i12 != 1 || !this.B1 || !this.G5)) {
                    if (i12 == 2 || i12 == 0) {
                        D0(false);
                        return;
                    }
                    return;
                }
                this.Ra.t0(this, this.f29936h1, this.f29947i1, false);
            } else if (this.L1 != 4 && !ziVar4.E2(true)) {
                zi ziVar5 = this.P5;
                int i13 = ziVar5.D;
                if (i13 != 4 && i13 != 17 && i13 != 23 && i13 != 24) {
                    int i14 = this.L1;
                    if (i14 == 1) {
                        if (this.N3 == -1) {
                            this.Ra.t0(this, this.f29936h1, this.f29947i1, false);
                            return;
                        }
                        return;
                    } else if (ziVar5.Y0 != null) {
                        l1 l1Var2 = this.Ra;
                        if (l1Var2 != null) {
                            l1Var2.t0(this, this.f29936h1, this.f29947i1, false);
                            return;
                        }
                        return;
                    } else if (i14 == 2) {
                        if (this.N3 == -1 && (webPage = zi.o1(ziVar5.f26868k).webpage) != null) {
                            String str = webPage.embed_url;
                            if (str != null && str.length() != 0) {
                                this.Ra.H1(this.P5, webPage.embed_url, webPage.site_name, webPage.description, webPage.url, webPage.embed_width, webPage.embed_height);
                                return;
                            } else {
                                sf.c.t(getContext(), webPage.url);
                                return;
                            }
                        }
                        return;
                    } else if (this.T1) {
                        if (this.N3 == -1) {
                            this.Ra.t0(this, this.f29936h1, this.f29947i1, false);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 26 && (l1Var = this.Ra) != null) {
                        if (i13 == 16) {
                            l1Var.p0(this, 0.0f, 0.0f);
                            return;
                        } else {
                            l1Var.B0(this, this.R3, this.S3);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.Ra.t0(this, this.f29936h1, this.f29947i1, false);
            } else if (this.N3 != -1 && (!this.f30148y1 || (!this.G5 && (((ziVar = this.P5) == null || !ziVar.E2(true)) && (!az.B0 || !this.B1))))) {
                if (this.f30148y1) {
                    D0(true);
                    return;
                }
                int i15 = this.N3;
                if (i15 == 0 || i15 == 3) {
                    D0(false);
                }
            } else {
                this.Ra.t0(this, this.f29936h1, this.f29947i1, false);
            }
        } else {
            int i16 = this.N3;
            if (i16 == -1) {
                this.Ra.t0(this, this.f29936h1, this.f29947i1, false);
            } else if (i16 == 0) {
                D0(false);
            }
        }
    }

    public final b1 C1() {
        if (this.J4 == null) {
            this.J4 = new b1(this);
        }
        return this.J4;
    }

    public final boolean C2() {
        if (this.Q5 != null) {
            return this.V5;
        }
        return this.I;
    }

    public final boolean C3() {
        if (!v2()) {
            if ((this.L == null || (this.M.f25149l & 4) != 0) && !this.Q1) {
                zi ziVar = this.P5;
                if (ziVar != null) {
                    if (!ziVar.f26857h2 && !ziVar.s4()) {
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

    @Override
    public final void D(ImageReceiver imageReceiver) {
        zi ziVar = this.P5;
        if (ziVar != null && imageReceiver == this.U0 && ziVar.K2()) {
            this.Ra.C1(this.P5);
        }
    }

    public final void D0(boolean z10) {
        float f10;
        zi ziVar;
        zi ziVar2;
        TLRPC.PhotoSize photoSize;
        String str;
        int i3;
        RadialProgress2 radialProgress2;
        int i10;
        zi ziVar3;
        if (this.Ra != null && this.P5.q4() && this.P5.u2() && !this.P5.n5() && !this.P5.M0) {
            this.Ra.C(this);
            return;
        }
        zi ziVar4 = this.P5;
        if (ziVar4 != null && !ziVar4.N2()) {
            this.P5.P = true;
        }
        int i11 = this.N3;
        RadialProgress2 radialProgress22 = this.R0;
        int i12 = this.Z5;
        ei.c3 c3Var = this.U0;
        RadialProgress2 radialProgress23 = this.Q0;
        if (i11 == 0 && (!this.f30148y1 || z10)) {
            int i13 = this.L1;
            if (i13 != 3 && i13 != 5 && (i13 != 7 || (ziVar3 = this.P5) == null || !ziVar3.U4() || !this.P5.f26917x0)) {
                if (z10) {
                    radialProgress22.p(false, 0.0f);
                } else {
                    radialProgress23.p(false, 0.0f);
                }
                if (this.f29884d4 != null && (c3Var.L() || this.f29898e4 == null)) {
                    photoSize = this.f29884d4;
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !"s".equals(photoSize.type)) {
                        str = this.f29926g4;
                    } else {
                        str = this.f29939h4;
                    }
                } else {
                    photoSize = this.f29898e4;
                    str = this.f29939h4;
                }
                if (zi.S5(this.P5.f26868k)) {
                    i3 = 2;
                } else {
                    i3 = 0;
                }
                zi ziVar5 = this.P5;
                int i14 = ziVar5.D;
                if (i14 == 1 || i14 == 20) {
                    int i15 = i3;
                    radialProgress2 = radialProgress23;
                    c3Var.f21264r = true;
                    c3Var.r0(ac.f(this.f29884d4, this.f29871c4), this.f29926g4, ac.f(this.f29898e4, this.f29871c4), this.f29939h4, this.f29912f4, this.f29884d4.size, null, this.P5, i15);
                } else if (i14 == 8) {
                    org.telegram.messenger.w7.G(i12).X(this.M1, this.P5, 2, 0);
                    if (this.P5.F0 > 0) {
                        z0(this.M1);
                    }
                    radialProgress2 = radialProgress23;
                } else if (this.f30144xb) {
                    if (ziVar5.m4()) {
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i12);
                        TLRPC.Document F0 = this.P5.F0();
                        zi ziVar6 = this.P5;
                        if (zi.S5(ziVar6.f26868k)) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        G.X(F0, ziVar6, 2, i10);
                        radialProgress2 = radialProgress23;
                    } else {
                        zi ziVar7 = this.P5;
                        ziVar7.f26846f0 = 2.0f;
                        TLRPC.Document F02 = ziVar7.F0();
                        c3Var.f21264r = true;
                        String str2 = str;
                        radialProgress2 = radialProgress23;
                        c3Var.r0(ac.b(F02), null, ac.f(photoSize, F02), str2, null, F02.size, null, this.P5, 0);
                    }
                    this.f29980kb = true;
                    invalidate();
                } else {
                    radialProgress2 = radialProgress23;
                    if (i14 == 9) {
                        org.telegram.messenger.w7.G(i12).X(this.M1, this.P5, 2, 0);
                        if (this.P5.F0 > 0) {
                            z0(this.M1);
                        }
                    } else {
                        int i16 = this.L1;
                        if (i16 == 4) {
                            org.telegram.messenger.w7.G(i12).X(this.M1, this.P5, 1, i3);
                            zi ziVar8 = this.P5;
                            if (ziVar8.F0 > 0) {
                                z0(ziVar8.F0());
                            }
                        } else if (i14 == 0 && i16 != 0) {
                            if (i16 == 2) {
                                c3Var.f21264r = true;
                                c3Var.r0(ac.b(this.M1), null, ac.c(this.f29884d4, this.M1), this.f29939h4, null, this.M1.size, null, this.P5, i3);
                                zi ziVar9 = this.P5;
                                ziVar9.f26846f0 = 2.0f;
                                if (ziVar9.F0 > 0) {
                                    z0(ziVar9.F0());
                                }
                            } else if (i16 == 1) {
                                org.telegram.messenger.w7.G(i12).X(this.M1, this.P5, 2, 0);
                            } else if (i16 == 8) {
                                c3Var.r0(ac.b(this.M1), this.f29926g4, ac.c(this.f29884d4, this.M1), "b1", null, 0L, "jpg", this.P5, 1);
                            }
                        } else {
                            c3Var.f21264r = true;
                            c3Var.r0(ac.f(this.f29884d4, this.f29871c4), this.f29926g4, ac.f(this.f29898e4, this.f29871c4), this.f29939h4, this.f29912f4, 0L, null, this.P5, 0);
                        }
                    }
                }
                this.P5.f26865j1 = false;
                this.N3 = 1;
                if (z10) {
                    radialProgress22.setIcon(14, false, true);
                } else {
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
                return;
            }
            if (this.W3 == 0) {
                org.telegram.messenger.w7.G(i12).X(this.M1, this.P5, 2, 0);
                this.P5.f26865j1 = false;
            }
            if (this.Ra.I1(this, this.P5)) {
                if (this.V3 == 2 && this.W3 != 1) {
                    this.W3 = 1;
                    radialProgress23.p(false, 0.0f);
                    radialProgress23.k(getMiniIconForCurrentState(), false, true);
                }
                Q3();
                this.N3 = 1;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i11 == 1 && (!this.f30148y1 || z10)) {
            c3Var.f21264r = false;
            int i17 = this.L1;
            if (i17 != 3 && i17 != 5 && (i17 != 7 || (ziVar2 = this.P5) == null || !ziVar2.U4())) {
                if (this.P5.O3() && !this.f30148y1 && (this.P5.p4() || this.P5.Z2())) {
                    if (radialProgress23.f31554i.f36083q != 6) {
                        this.Ra.N(this);
                        return;
                    }
                    return;
                }
                zi ziVar10 = this.P5;
                ziVar10.f26865j1 = true;
                int i18 = this.L1;
                if (i18 != 2 && i18 != 4 && i18 != 1 && i18 != 8) {
                    int i19 = ziVar10.D;
                    if (i19 != 0 && i19 != 1 && i19 != 20 && i19 != 8 && i19 != 5) {
                        if (i19 == 9) {
                            org.telegram.messenger.w7.G(i12).f(this.P5.F0());
                        }
                    } else {
                        zb D = zb.D();
                        String str3 = c3Var.R;
                        if (str3 != null) {
                            D.f26773s.c(new bb(D, str3, 2));
                        }
                        c3Var.c();
                    }
                } else {
                    org.telegram.messenger.w7.G(i12).f(this.M1);
                }
                this.N3 = 0;
                if (z10) {
                    radialProgress22.setIcon(2, false, true);
                } else {
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
            } else if (MediaController.B().R(this.P5, true)) {
                this.N3 = 0;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i11 == 2) {
            zi ziVar11 = this.P5;
            if (ziVar11 != null && ziVar11.D == 23) {
                this.Ra.t0(this, 0.0f, 0.0f, false);
            } else if (this.L1 == 7 && ziVar11 != null && ziVar11.U4()) {
                if (this.W3 == 0) {
                    org.telegram.messenger.w7.G(i12).X(this.M1, this.P5, 2, 0);
                    this.P5.f26865j1 = false;
                }
                if (this.Ra.I1(this, this.P5)) {
                    if (this.V3 == 2 && this.W3 != 1) {
                        this.W3 = 1;
                        radialProgress23.p(false, 0.0f);
                        radialProgress23.k(getMiniIconForCurrentState(), false, true);
                    }
                    Q3();
                    this.N3 = 1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                if (this.f30144xb) {
                    this.f29980kb = true;
                    invalidate();
                }
            } else {
                int i20 = this.L1;
                if (i20 != 3 && i20 != 5) {
                    if (this.f30144xb) {
                        zi ziVar12 = MediaController.B().f21348v0;
                        if (ziVar12 == null || !ziVar12.i4()) {
                            c3Var.f21272u0 = true;
                            c3Var.P0(false);
                        }
                    } else {
                        c3Var.f21272u0 = true;
                        c3Var.P0(false);
                    }
                    this.P5.f26846f0 = 0.0f;
                    this.N3 = -1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    return;
                }
                radialProgress23.p(false, 0.0f);
                org.telegram.messenger.w7.G(i12).X(this.M1, this.P5, 2, 0);
                this.P5.f26865j1 = false;
                this.N3 = 4;
                radialProgress23.setIcon(getIconForCurrentState(), true, true);
                invalidate();
            }
        } else if (i11 != 3 && i11 != 0) {
            if (i11 == 4) {
                int i21 = this.L1;
                if (i21 == 3 || i21 == 5 || (i21 == 7 && (ziVar = this.P5) != null && ziVar.U4())) {
                    if ((this.P5.O3() && (this.P5.p4() || this.P5.Z2())) || this.P5.o4()) {
                        l1 l1Var = this.Ra;
                        if (l1Var != null && radialProgress23.f31554i.f36083q != 6) {
                            l1Var.N(this);
                            return;
                        }
                        return;
                    }
                    this.P5.f26865j1 = true;
                    org.telegram.messenger.w7.G(i12).f(this.M1);
                    this.N3 = 2;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            }
        } else {
            if (this.V3 == 2 && this.W3 != 1) {
                this.W3 = 1;
                f10 = 0.0f;
                radialProgress23.p(false, 0.0f);
                radialProgress23.k(getMiniIconForCurrentState(), false, true);
            } else {
                f10 = 0.0f;
            }
            l1 l1Var2 = this.Ra;
            if (l1Var2 != null) {
                l1Var2.t0(this, f10, f10, false);
            }
        }
    }

    public final t1 D1() {
        if (this.Y0 == null) {
            this.Y0 = new t1(this);
        }
        return this.Y0;
    }

    public final boolean D2() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message;
        zi ziVar = this.P5;
        if (!ziVar.f26866j2) {
            if (zi.B0(ziVar.f26868k) != 489000 || (message = this.P5.f26868k) == null || message.fwd_from == null) {
                if (!this.P5.s4() && !this.P5.w3()) {
                    if (!this.f29914f6 || this.f30100u6) {
                        TLRPC.Message message2 = this.P5.f26868k;
                        if (message2 == null || (messageFwdHeader = message2.fwd_from) == null || (peer = messageFwdHeader.from_id) == null || message2.via_bot_id == 0 || org.telegram.messenger.m5.o(peer) != org.telegram.messenger.m5.o(this.P5.f26868k.peer_id)) {
                            if (!this.f30100u6 || this.P5.D != 0) {
                                if (!this.F && this.f29954i9 && this.f29900e6) {
                                    if (this.P5.Q3()) {
                                        if ((this.P5.B4() && this.P5.p3()) || this.P5.f26857h2) {
                                            return true;
                                        }
                                    } else {
                                        return true;
                                    }
                                }
                                if (!this.P5.z3() || this.P5.f26868k.fwd_from.from_id != null) {
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

    public final boolean D3() {
        zi ziVar;
        zi ziVar2;
        int i3 = this.f30105ub;
        if (i3 != 0) {
            if (i3 != 1) {
                return false;
            }
        } else if (!t2()) {
            if (!a4() && ((!this.B6 || ((this.f29985l3 != null && !this.f30107v1) || (!this.O.f9125p && ((ziVar2 = this.P5) == null || (!ziVar2.N2() && !this.P5.i4()))))) && ((ziVar = this.P5) == null || ziVar.D != 29))) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public final boolean E(MotionEvent motionEvent) {
        RectF rectF;
        l1 l1Var;
        y yVar;
        boolean z10 = false;
        if (this.Z8 != null && (rectF = this.f29876c9) != null && (this.f29955ia != null || this.f29968ja != null)) {
            boolean contains = rectF.contains((int) motionEvent.getX(), (int) M1(motionEvent));
            if (motionEvent.getAction() == 0) {
                SpannableString spannableString = new SpannableString(this.Z8.getText());
                xg.a[] aVarArr = (xg.a[]) spannableString.getSpans(0, spannableString.length(), xg.a.class);
                if (contains && aVarArr != null && aVarArr.length > 0) {
                    z10 = true;
                }
                this.W2 = z10;
                if (z10 && (yVar = this.Y2) != null) {
                    yVar.setHotspot((int) motionEvent.getX(), (int) M1(motionEvent));
                    this.Y2.setState(this.M2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.W2 && (l1Var = this.Ra) != null) {
                    l1Var.Q0(this);
                }
                y yVar2 = this.Y2;
                if (yVar2 != null) {
                    yVar2.setState(StateSet.NOTHING);
                }
                this.W2 = false;
            }
            return this.W2;
        }
        this.W2 = false;
        return false;
    }

    public final void E0() {
        int i3;
        int i10;
        int i11 = this.W3;
        int i12 = this.Z5;
        RadialProgress2 radialProgress2 = this.Q0;
        if (i11 == 0) {
            this.W3 = 1;
            radialProgress2.p(false, 0.0f);
            zi ziVar = this.P5;
            if (ziVar != null && !ziVar.N2()) {
                this.P5.P = true;
            }
            int i13 = this.L1;
            if (i13 != 3 && i13 != 5) {
                if (i13 == 4 || i13 == 7) {
                    z0(this.M1);
                    org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i12);
                    TLRPC.Document document = this.M1;
                    zi ziVar2 = this.P5;
                    if (zi.S5(ziVar2.f26868k)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    G.X(document, ziVar2, 2, i10);
                    this.P5.f26865j1 = false;
                }
            } else {
                org.telegram.messenger.w7 G2 = org.telegram.messenger.w7.G(i12);
                TLRPC.Document document2 = this.M1;
                zi ziVar3 = this.P5;
                if (zi.S5(ziVar3.f26868k)) {
                    i3 = 2;
                } else {
                    i3 = 0;
                }
                G2.X(document2, ziVar3, 2, i3);
                this.P5.f26865j1 = false;
            }
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        } else if (i11 == 1) {
            int i14 = this.L1;
            if ((i14 == 3 || i14 == 5 || i14 == 7) && MediaController.B().I(this.P5)) {
                MediaController.B().q(true, true, false, false);
            }
            this.W3 = 0;
            this.P5.f26865j1 = true;
            org.telegram.messenger.w7.G(i12).f(this.M1);
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final boolean E1(o1 o1Var, n70 n70Var, Layout layout, int i3) {
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
                } else if (characterStyleArr[i10] == this.f30162z4) {
                    o1Var.f29726b = i3;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (o1Var.f29726b != i3) {
            return false;
        }
        n70Var.rewind();
        int spanStart = spanned.getSpanStart(this.f30162z4);
        int spanEnd = spanned.getSpanEnd(this.f30162z4);
        n70Var.f32362c = true;
        n70Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, n70Var);
        n70Var.a();
        this.f30138x4.l();
        return true;
    }

    public final boolean E2(zi ziVar) {
        TLRPC.MessageFwdHeader messageFwdHeader = ziVar.f26868k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
            l1 l1Var = this.Ra;
            if (l1Var == null || l1Var.T()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void E3(int i3, boolean z10, boolean z11) {
        float f10;
        float f11 = 0.0f;
        if (i3 == -1 || i3 == 0) {
            if (this.f30049q5 != z10) {
                this.f30049q5 = z10;
                if (!z11) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    this.r5 = f10;
                } else {
                    invalidate();
                }
            } else {
                return;
            }
        }
        if ((i3 != -1 && i3 != 1) || this.E5 == z10) {
            return;
        }
        this.E5 = z10;
        if (!z11) {
            if (z10) {
                f11 = 1.0f;
            }
            this.F5 = f11;
            return;
        }
        setInvalidatesParent(true);
        invalidate();
    }

    public final boolean F1(o1 o1Var, n70 n70Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (E1(o1Var, n70Var, ((wi) arrayList.get(i3)).f26210e, i3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean F2(org.telegram.messenger.zi r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.F2(org.telegram.messenger.zi):boolean");
    }

    public final void F3() {
        ei.c3 c3Var = this.U0;
        G3((c3Var.N0 / 2.0f) + c3Var.L0, (c3Var.O0 / 2.0f) + c3Var.M0);
    }

    public final boolean G(MotionEvent motionEvent) {
        l1 l1Var;
        if (this.Z8 == null || (l1Var = this.Ra) == null || !l1Var.c()) {
            return false;
        }
        boolean contains = this.f29850a9.contains(motionEvent.getX(), motionEvent.getY());
        if (this.f29863b9 == null) {
            this.f29863b9 = new gc(this);
        }
        if (motionEvent.getAction() == 0) {
            this.f29863b9.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.f29863b9.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f29863b9.f34049i) {
                this.Ra.Z1(this);
            }
            this.f29863b9.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.f29863b9.c(false);
        }
        return this.f29863b9.f34049i;
    }

    public final void G0() {
        zi ziVar = this.P5;
        if (ziVar != null) {
            ziVar.J0 = !ziVar.J0;
            l1 l1Var = this.Ra;
            if (l1Var != null) {
                l1Var.u1(this, true);
            }
        }
    }

    public final void G1() {
        zi ziVar = this.Q5;
        if (ziVar == null) {
            ziVar = this.P5;
        }
        zi ziVar2 = ziVar;
        this.P5 = null;
        u3(ziVar2, this.L, this.G, this.F, this.H, false);
    }

    public final boolean G2() {
        if (this.Q5 != null) {
            return this.T5;
        }
        return this.G;
    }

    public final void G3(float f10, float f11) {
        q1 q1Var;
        ei.c3 c3Var = this.U0;
        this.O9 = (float) Math.sqrt(Math.pow(c3Var.O0, 2.0d) + Math.pow(c3Var.N0, 2.0d));
        zi ziVar = this.P5;
        if (!ziVar.M0 && this.L9 == 0.0f) {
            if (ziVar.D == 3) {
                ziVar.K1 = true;
                ziVar.O0 = true;
                q1Var = this;
                q1Var.t3(ziVar, this.L, this.G, this.F, this.H, this.I);
                zi ziVar2 = q1Var.P5;
                ziVar2.O0 = false;
                ziVar2.K1 = false;
                if (q1Var.L != null) {
                    q1Var.Q0.p(false, 0.0f);
                }
            } else {
                q1Var = this;
            }
            q1Var.M9 = f10;
            q1Var.N9 = f11;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(be.a(q1Var.O9 * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(xq.f40455j);
            duration.addUpdateListener(new r(this, 2));
            duration.addListener(new k1(this, 0));
            duration.start();
        }
    }

    public final boolean H(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.H(android.view.MotionEvent):boolean");
    }

    public final void H0(Canvas canvas, float f10) {
        ArrayList arrayList;
        float f11;
        float f12;
        if (this.f29985l3 == null) {
            return;
        }
        float f13 = this.f30073s3;
        float f14 = this.f30061r3;
        x1 x1Var = this.hb;
        if (x1Var.f30936x0) {
            if (x1Var.D0) {
                f13 -= getTranslationY();
                f12 = x1Var.f30871h0;
            } else if (x1Var.f30921t0) {
                float f15 = x1Var.L1;
                float f16 = 1.0f - f15;
                f14 = (f14 * f15) + (x1Var.f30913r0 * f16);
                f13 = (f13 * f15) + (f16 * x1Var.f30917s0);
            } else if (!zi.S4(this.P5.f26868k) || !TextUtils.isEmpty(this.P5.f26924z)) {
                f12 = x1Var.f30871h0;
            }
            f14 += f12;
        }
        float f17 = f14;
        float f18 = f13;
        float f19 = 0.0f;
        ArrayList arrayList2 = null;
        if (x1Var.f30845b1) {
            float f20 = x1Var.L1;
            if (f20 != 1.0f) {
                xi xiVar = x1Var.f30850c1;
                if (xiVar != null) {
                    arrayList = xiVar.f26387e;
                } else {
                    arrayList = null;
                }
                org.telegram.ui.Components.l5 l5Var = x1Var.P0;
                float f21 = (1.0f - f20) * f10;
                if (xiVar != null) {
                    f11 = xiVar.d;
                } else {
                    f11 = 0.0f;
                }
                I0(f17, f18, canvas, arrayList, l5Var, false, f21, f11, true);
                xi xiVar2 = this.f29985l3;
                if (xiVar2 != null) {
                    arrayList2 = xiVar2.f26387e;
                }
                ArrayList arrayList3 = arrayList2;
                org.telegram.ui.Components.l5 l5Var2 = this.f30168za;
                float f22 = f10 * x1Var.L1;
                if (xiVar2 != null) {
                    f19 = xiVar2.d;
                }
                I0(f17, f18, canvas, arrayList3, l5Var2, true, f22, f19, true);
                return;
            }
        }
        xi xiVar3 = this.f29985l3;
        if (xiVar3 != null) {
            arrayList2 = xiVar3.f26387e;
        }
        ArrayList arrayList4 = arrayList2;
        org.telegram.ui.Components.l5 l5Var3 = this.f30168za;
        if (xiVar3 != null) {
            f19 = xiVar3.d;
        }
        I0(f17, f18, canvas, arrayList4, l5Var3, true, f10, f19, true);
    }

    public final boolean H2() {
        if (this.Q5 != null) {
            return this.S5;
        }
        return this.F;
    }

    public final boolean H3() {
        l1 l1Var;
        if (getCurrentMessagesGroup() == null && (l1Var = this.Ra) != null && l1Var.q2() != null && this.Ra.q2().z(this.P5)) {
            return true;
        }
        return false;
    }

    public final boolean I(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.I(android.view.MotionEvent):boolean");
    }

    public final void I0(float r24, float r25, android.graphics.Canvas r26, java.util.ArrayList r27, org.telegram.ui.Components.l5 r28, boolean r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.I0(float, float, android.graphics.Canvas, java.util.ArrayList, org.telegram.ui.Components.l5, boolean, float, float, boolean):void");
    }

    public final ColorFilter I1(int i3, int i10) {
        if (this.Zc == null) {
            this.f29853ad = new int[3];
            this.Zc = new ColorFilter[3];
        }
        if (i10 != this.f29853ad[i3] || this.Zc[i3] == null) {
            ColorFilter[] colorFilterArr = this.Zc;
            this.f29853ad[i3] = i10;
            colorFilterArr[i3] = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.Zc[i3];
    }

    public final boolean I2() {
        if (this.f30144xb && this.f30157yb) {
            return true;
        }
        return false;
    }

    public final boolean J(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f30127w7) {
            int x10 = (int) motionEvent.getX();
            int M1 = (int) M1(motionEvent);
            ri riVar = this.M;
            if (riVar != null) {
                int i3 = riVar.f25149l;
                if ((i3 & 1) == 0 || (i3 & 8) == 0) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt != this && (childAt instanceof q1)) {
                            q1 q1Var = (q1) childAt;
                            if (q1Var.f30127w7 && q1Var.L == this.L) {
                                int i11 = q1Var.M.f25149l;
                                if ((i11 & 1) != 0 && (i11 & 8) != 0) {
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), (motionEvent.getX() + getLeft()) - q1Var.getLeft(), (M1(motionEvent) + getTop()) - q1Var.getTop(), 0);
                                    boolean J = q1Var.J(obtain);
                                    obtain.recycle();
                                    return J;
                                }
                            }
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.I2;
            if (action == 0) {
                if (this.f30141x7.contains(x10, M1)) {
                    if (this.P5.r4()) {
                        this.K2[1] = 2;
                        this.f30154y7 = true;
                        Drawable drawable2 = drawableArr[1];
                        if (drawable2 != null) {
                            drawable2.setHotspot(x10, M1);
                            drawableArr[1].setState(this.M2);
                        }
                        r2();
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f30154y7) {
                    l1 l1Var = this.Ra;
                    if (l1Var != null) {
                        if (this.f30088t6) {
                            l1Var.s(this);
                        } else {
                            l1Var.y(this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[1];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.f30154y7 = false;
                    r2();
                    return false;
                }
            } else if (motionEvent.getAction() == 2 && this.f30154y7 && (drawable = drawableArr[1]) != null) {
                drawable.setHotspot(x10, M1);
            }
        }
        return false;
    }

    public final void J0(Canvas canvas, float f10) {
        ng0 ng0Var;
        zi ziVar = this.P5;
        if (ziVar != null && !ziVar.s4()) {
            float f11 = this.f30094u0;
            x1 x1Var = this.hb;
            if (x1Var.f30894m2) {
                float f12 = x1Var.f30903o2;
                float f13 = x1Var.L1;
                f11 = (f11 * f13) + ((1.0f - f13) * f12);
            }
            float f14 = f11;
            if (x1Var.L1 != 1.0f && x1Var.H0 && ((ng0Var = this.yc) == null || !ng0Var.h)) {
                canvas.save();
                org.telegram.ui.ActionBar.t4 t4Var = this.K6;
                if (t4Var != null) {
                    Rect bounds = t4Var.getBounds();
                    if (this.P5.Q3() && !this.B6 && !this.G) {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(10.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    } else {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(4.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    }
                }
                I0(this.f30018o0, f14, canvas, x1Var.I0, x1Var.P0, false, (1.0f - x1Var.L1) * f10, this.P5.f26911v2, false);
                zi ziVar2 = this.P5;
                I0(this.f30018o0, f14, canvas, ziVar2.f26927z2, this.f30168za, true, f10 * x1Var.L1, ziVar2.f26911v2, false);
                canvas.restore();
            } else {
                zi ziVar3 = this.P5;
                I0(this.f30018o0, f14, canvas, ziVar3.f26927z2, this.f30168za, true, f10, ziVar3.f26911v2, false);
            }
        }
        if (B3()) {
            H0(canvas, f10);
        }
    }

    public final boolean J2() {
        zi ziVar = this.P5;
        if (ziVar != null && ziVar.T4()) {
            return false;
        }
        return true;
    }

    public final boolean K(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.P5.D == 12) {
            if (this.f30108v2 == null) {
                this.f30108v2 = new r1(this);
            }
            r1 r1Var = this.f30108v2;
            q1 q1Var = r1Var.f30254a;
            zi ziVar = q1Var.P5;
            int[] iArr = q1Var.M2;
            Drawable[] drawableArr = q1Var.I2;
            if (ziVar.D == 12) {
                int x10 = (int) motionEvent.getX();
                int M1 = (int) q1Var.M1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    ArrayList arrayList = r1Var.f30259g;
                    if (arrayList != null && arrayList.size() > 1) {
                        for (int i3 = 0; i3 < r1Var.f30259g.size(); i3++) {
                            n1 n1Var = (n1) r1Var.f30259g.get(i3);
                            float f10 = x10;
                            float f11 = M1;
                            if (n1Var.f29656e.contains(f10, f11)) {
                                if (n1Var.f29657f == null) {
                                    n1Var.f29657f = new gc(q1Var);
                                }
                                n1Var.f29657f.c(true);
                                y yVar = n1Var.f29658g;
                                if (yVar != null) {
                                    yVar.setHotspot(f10, f11);
                                    n1Var.f29658g.setState(iArr);
                                }
                                q1Var.invalidate();
                                return true;
                            }
                        }
                    }
                    float f12 = x10;
                    float f13 = M1;
                    if (q1Var.f30096u2.contains(f12, f13)) {
                        r1Var.h = true;
                        q1Var.Fa.c(true);
                        Drawable drawable2 = drawableArr[0];
                        if (drawable2 != null) {
                            drawable2.setHotspot(f12, f13);
                            drawableArr[0].setState(iArr);
                        }
                        q1Var.invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (r1Var.h) {
                        if (q1Var.Ra != null) {
                            ArrayList arrayList2 = r1Var.f30259g;
                            if (arrayList2 != null && arrayList2.size() == 1) {
                                q1Var.Ra.f1(q1Var, ((n1) r1Var.f30259g.get(0)).f29653a);
                            } else {
                                q1Var.Ra.f1(q1Var, 5);
                            }
                        }
                        q1Var.playSoundEffect(0);
                        Drawable drawable3 = drawableArr[0];
                        if (drawable3 != null) {
                            drawable3.setState(StateSet.NOTHING);
                        }
                        r1Var.h = false;
                        q1Var.Fa.c(false);
                        q1Var.invalidate();
                        return false;
                    }
                    ArrayList arrayList3 = r1Var.f30259g;
                    if (arrayList3 != null && arrayList3.size() > 1) {
                        for (int i10 = 0; i10 < r1Var.f30259g.size(); i10++) {
                            n1 n1Var2 = (n1) r1Var.f30259g.get(i10);
                            gc gcVar = n1Var2.f29657f;
                            if (gcVar != null && gcVar.f34049i) {
                                l1 l1Var = q1Var.Ra;
                                if (l1Var != null) {
                                    l1Var.f1(q1Var, n1Var2.f29653a);
                                }
                                y yVar2 = n1Var2.f29658g;
                                if (yVar2 != null) {
                                    yVar2.setState(StateSet.NOTHING);
                                }
                                n1Var2.f29657f.c(false);
                                q1Var.playSoundEffect(0);
                                q1Var.invalidate();
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 2) {
                    if (r1Var.h && (drawable = drawableArr[0]) != null) {
                        drawable.setHotspot(x10, M1);
                        return false;
                    }
                    ArrayList arrayList4 = r1Var.f30259g;
                    if (arrayList4 != null && arrayList4.size() > 1) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= r1Var.f30259g.size()) {
                                break;
                            }
                            n1 n1Var3 = (n1) r1Var.f30259g.get(i11);
                            gc gcVar2 = n1Var3.f29657f;
                            if (gcVar2 != null && gcVar2.f34049i) {
                                y yVar3 = n1Var3.f29658g;
                                if (yVar3 != null) {
                                    yVar3.setHotspot(x10, M1);
                                    return false;
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void K0(android.graphics.Canvas r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.K0(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public final boolean K2() {
        zi ziVar;
        if (this.X6 && (ziVar = this.P5) != null && !ziVar.Q3() && this.M == null && !t2()) {
            return true;
        }
        return false;
    }

    public final void K3(int i3, boolean z10) {
        if (i3 >= 0) {
            ArrayList arrayList = this.P4;
            if (i3 < arrayList.size()) {
                p1 p1Var = (p1) arrayList.get(i3);
                if (this.Ra.Q(this, p1Var.f29794t, !p1Var.f29783i)) {
                    if (z10) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long B0 = zi.B0(this.P5.f26868k);
                    int i10 = this.Z5;
                    long M = org.telegram.messenger.t3.M(hp.s1(i10).M0(Long.valueOf(B0)), hp.s1(i10).N0(B0), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) zi.n1(this.P5);
                    int i11 = this.Z5;
                    zi.a6(i11, M, tL_messageMediaToDo, p1Var.f29794t.f27148id, !p1Var.f29783i, ConnectionsManager.getInstance(i11).getCurrentTime());
                    if (!p1Var.f29783i) {
                        TLObject e22 = hp.s1(i10).e2(M);
                        p1Var.f29798y.l(e22);
                        p1Var.f29799z.i0(e22, p1Var.f29798y, null);
                        p1Var.f29791q = new ly0(org.telegram.messenger.m5.m(e22), 12.0f, null);
                    }
                    this.f29901e7[i3].f(-1, !p1Var.f29783i, true);
                    if (this.f30137x3 != null) {
                        if (!this.P5.Q3() && zi.B0(this.P5.f26868k) >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.f30137x3.t(bd.K("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(zi.z0(tL_messageMediaToDo)), org.telegram.messenger.m5.l(h10.f22829t0, this.P5.Z0())), true, true);
                        } else {
                            this.f30137x3.t(bd.K("TodoCompleted", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(zi.z0(tL_messageMediaToDo))), true, true);
                        }
                    }
                    p1Var.f29783i = !p1Var.f29783i;
                    invalidate();
                    return;
                }
                this.Y4 = false;
            }
        }
    }

    public final boolean L(MotionEvent motionEvent) {
        float f10;
        l1 l1Var;
        zi ziVar = this.P5;
        if (ziVar == null || ziVar.M0() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f11 = 0.0f;
        if (this.f29958j0 == 0) {
            f10 = 0.0f;
        } else {
            f10 = 18.0f;
        }
        float L = timeX - org.telegram.messenger.g0.L(f10);
        float f12 = this.f30167z9;
        if (this.P5.f26925z0) {
            f11 = 1.0f - this.f29962j4;
        }
        int L2 = ((int) ((f12 * f11) + L)) - org.telegram.messenger.g0.L(2.0f);
        int timeY = ((int) getTimeY()) - org.telegram.messenger.g0.L(2.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(L2, timeY, org.telegram.messenger.g0.L(16.0f) + L2 + this.f30167z9, org.telegram.messenger.g0.L(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), M1(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.f29982l0 == null) {
                    this.f29982l0 = new gc(this);
                }
                this.f29905ec = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.f29905ec = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.f29905ec && (l1Var = this.Ra) != null) {
                l1Var.I(this);
            }
            this.f29905ec = false;
        } else if (motionEvent.getAction() == 3) {
            this.f29905ec = false;
        }
        gc gcVar = this.f29982l0;
        if (gcVar != null) {
            gcVar.c(this.f29905ec);
        }
        return this.f29905ec;
    }

    public final boolean L0() {
        zi ziVar;
        if (this.Qb && (ziVar = this.P5) != null && ziVar.Q3() && org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28144rb, this.Pb) != 0) {
            return true;
        }
        return false;
    }

    public final org.telegram.ui.ActionBar.t4 L1(boolean z10) {
        boolean z11;
        if (z10) {
            ri riVar = this.M;
            if (riVar != null && (riVar.f25149l & 8) == 0 && this.L.f25705i && !this.K) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.P5.Q3()) {
                if (!this.B6 && !this.K && !z11) {
                    this.K6 = (org.telegram.ui.ActionBar.t4) Y1("drawableMsgOut");
                } else {
                    this.K6 = (org.telegram.ui.ActionBar.t4) Y1("drawableMsgOutMedia");
                }
            } else if (!this.B6 && !this.K && !z11) {
                this.K6 = (org.telegram.ui.ActionBar.t4) Y1("drawableMsgIn");
            } else {
                this.K6 = (org.telegram.ui.ActionBar.t4) Y1("drawableMsgInMedia");
            }
        }
        this.K6.g();
        return this.K6;
    }

    public final void L3() {
        zi ziVar;
        int i3;
        boolean z10;
        cv cvVar;
        ArrayList arrayList;
        if (this.f30132wc && (ziVar = this.P5) != null) {
            boolean z11 = false;
            if (ziVar.V1) {
                i3 = org.telegram.ui.Components.g5.f();
            } else {
                i3 = 0;
            }
            xi xiVar = this.f29985l3;
            if (xiVar != null && (arrayList = xiVar.f26387e) != null) {
                this.f30168za = org.telegram.ui.Components.p5.update(i3, (View) this, false, this.f30168za, (ArrayList<wi>) arrayList);
            } else {
                l1 l1Var = this.Ra;
                if (l1Var != null && l1Var.d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f30168za = org.telegram.ui.Components.p5.update(i3, this, z10, this.f30168za, this.P5.f26927z2);
            }
            zi ziVar2 = this.P5;
            if (ziVar2.D == 36 && (cvVar = ziVar2.f26915w2) != null) {
                l1 l1Var2 = this.Ra;
                if (l1Var2 == null || !l1Var2.d()) {
                    z11 = true;
                }
                cvVar.v = z11;
                this.P5.f26915w2.b0(i3);
            }
        }
    }

    @Override
    public final void M(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.M(java.lang.String):void");
    }

    public final boolean M0(android.graphics.Canvas r43, boolean r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.M0(android.graphics.Canvas, boolean, boolean):boolean");
    }

    public final float M1(MotionEvent motionEvent) {
        return ((motionEvent.getY() - this.W) - this.f29922g0) - this.f29946i0;
    }

    public final boolean M2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.M2():boolean");
    }

    public final void M3(boolean r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.M3(boolean, boolean, boolean):void");
    }

    public final boolean N(MotionEvent motionEvent) {
        int i3;
        int i10;
        int i11;
        if (this.S1) {
            t1 D1 = D1();
            q1 q1Var = D1.f30444a;
            boolean z10 = q1Var.S1;
            ArrayList arrayList = q1Var.H5;
            m2.p0 p0Var = q1Var.f30086t4;
            if (z10) {
                int x10 = (int) motionEvent.getX();
                int M1 = (int) q1Var.M1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    if (q1Var.N1 && q1Var.f30135x1 && q1Var.N3 != -1 && x10 >= (i10 = q1Var.J3) && x10 <= org.telegram.messenger.g0.L(48.0f) + i10 && M1 >= (i11 = q1Var.K3) && M1 <= org.telegram.messenger.g0.L(48.0f) + i11 && q1Var.Q0.f31554i.f36083q != 4) {
                        q1Var.O3 = 1;
                        q1Var.invalidate();
                        return true;
                    } else if (q1Var.N1 && q1Var.U0.O(x10, M1)) {
                        D1.v = true;
                        return true;
                    } else if (q1Var.f30020o2 == null || M1 < q1Var.X1) {
                        return false;
                    } else {
                        try {
                            int L = x10 - ((q1Var.f30031p0 + org.telegram.messenger.g0.L(10.0f)) + q1Var.Z1);
                            int i12 = M1 - q1Var.X1;
                            int lineForVertical = q1Var.f30020o2.getLineForVertical(i12);
                            float f10 = L;
                            int offsetForHorizontal = q1Var.f30020o2.getOffsetForHorizontal(lineForVertical, f10);
                            float lineLeft = q1Var.f30020o2.getLineLeft(lineForVertical);
                            if (lineLeft > f10 || lineLeft + q1Var.f30020o2.getLineWidth(lineForVertical) < f10) {
                                return false;
                            }
                            Spannable spannable = (Spannable) q1Var.P5.f26920y;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length == 0) {
                                return false;
                            }
                            if (((clickableSpanArr[0] instanceof s31) && !s31.h) || org.telegram.messenger.g0.C1()) {
                                return false;
                            }
                            t70 t70Var = q1Var.f30048q4;
                            if (t70Var == null || t70Var.f38328i != clickableSpanArr[0]) {
                                p0Var.m(t70Var, true);
                                t70 t70Var2 = new t70(clickableSpanArr[0], q1Var.Pb, f10, i12, 0);
                                q1Var.f30048q4 = t70Var2;
                                if (q1Var.P5.Q3()) {
                                    i3 = org.telegram.ui.ActionBar.k6.Ac;
                                } else {
                                    i3 = org.telegram.ui.ActionBar.k6.f28298ze;
                                }
                                t70Var2.d(org.telegram.ui.ActionBar.k6.w0(i3, q1Var.Pb));
                                q1Var.f30147y0 = -10;
                                q1Var.f30098u4 = 2;
                                try {
                                    n70 b10 = q1Var.f30048q4.b();
                                    int[] W1 = W1(spannable, q1Var.f30048q4.f38328i);
                                    b10.d(q1Var.f30020o2, W1[0], 0.0f);
                                    q1Var.f30020o2.getSelectionPath(W1[0], W1[1], b10);
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                p0Var.b(q1Var.f30048q4, 2);
                            }
                            q1Var.invalidate();
                            return true;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return false;
                        }
                    }
                } else if (motionEvent.getAction() != 1) {
                    return false;
                } else {
                    if (q1Var.f30098u4 != 2 && !D1.v && q1Var.O3 == 0) {
                        q1Var.d3(2);
                        return false;
                    } else if (q1Var.O3 != 0) {
                        q1Var.O3 = 0;
                        q1Var.playSoundEffect(0);
                        q1Var.D0(false);
                        q1Var.invalidate();
                        return false;
                    } else {
                        t70 t70Var3 = q1Var.f30048q4;
                        if (t70Var3 != null) {
                            CharacterStyle characterStyle = t70Var3.f38328i;
                            if (characterStyle instanceof URLSpan) {
                                sf.c.t(q1Var.getContext(), ((URLSpan) q1Var.f30048q4.f38328i).getURL());
                            } else if (characterStyle instanceof ClickableSpan) {
                                ((ClickableSpan) characterStyle).onClick(q1Var);
                            }
                            q1Var.d3(2);
                            return false;
                        }
                        D1.v = false;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList.size()) {
                                break;
                            }
                            c0 c0Var = (c0) arrayList.get(i13);
                            if (dg.c.c(c0Var.f29015i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                q1Var.playSoundEffect(0);
                                q1Var.Ra.d1(q1Var, c0Var.f29015i);
                                q1Var.invalidate();
                                break;
                            }
                            i13++;
                        }
                        q1Var.d3(2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void N0(Canvas canvas) {
        if (!this.P5.M0 && this.L9 != 1.0f) {
            ei.c3 c3Var = this.U0;
            int[] iArr = c3Var.X0;
            float f10 = iArr[0];
            float[] fArr = this.J9;
            fArr[1] = f10;
            fArr[0] = f10;
            float f11 = iArr[1];
            fArr[3] = f11;
            fArr[2] = f11;
            float f12 = iArr[2];
            fArr[5] = f12;
            fArr[4] = f12;
            float f13 = iArr[3];
            fArr[7] = f13;
            fArr[6] = f13;
            Path path = this.I9;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(c3Var.L0, c3Var.M0, c3Var.y(), c3Var.A());
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr, direction);
            canvas.save();
            canvas.clipPath(path);
            if (this.L9 != 0.0f) {
                path.rewind();
                path.addCircle(this.M9, this.N9, this.O9 * this.L9, direction);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            if (this.P5.n5()) {
                c3Var.h(canvas, null);
            } else {
                float f14 = c3Var.L0;
                float f15 = c3Var.M0;
                float f16 = c3Var.N0;
                float f17 = c3Var.O0;
                ImageReceiver imageReceiver = this.V0;
                imageReceiver.y0(f14, f15, f16, f17);
                imageReceiver.L0(c3Var.X0);
                imageReceiver.h(canvas, null);
            }
            O0(canvas);
            canvas.restore();
        }
    }

    public final String N1(zi ziVar) {
        if (this.A5) {
            String N0 = bd.N0("PsaMessage_" + ziVar.f26868k.fwd_from.psa_type);
            if (N0 == null) {
                return bd.M0(2131746603, "PsaMessageDefault");
            }
            return N0;
        }
        return bd.M0(2131750566, null);
    }

    public final boolean N2() {
        zi ziVar = this.P5;
        cv cvVar = ziVar.f26915w2;
        if (ziVar.D == 36 && cvVar != null) {
            ArrayList arrayList = cvVar.f22070g;
            if (arrayList.size() == 1 && (arrayList.get(0) instanceof gk0)) {
                return true;
            }
        }
        return false;
    }

    public final void N3() {
        float f10;
        float f11;
        float f12;
        float L;
        int i3;
        float f13;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        zi ziVar = this.P5;
        int i17 = ziVar.D;
        float f14 = 0.0f;
        x1 x1Var = this.hb;
        int i18 = 0;
        boolean z10 = true;
        if (i17 != 1 && i17 != 20 && this.L1 != 4 && i17 != 8 && i17 != 23) {
            float f15 = 10.0f;
            float f16 = 11.0f;
            if (this.R1) {
                int i19 = this.M6;
                if (!ziVar.Q3()) {
                    f16 = 17.0f;
                }
                this.f30061r3 = org.telegram.messenger.g0.L(f16) + i19 + this.f30047q3;
                int i20 = this.f30106v0 - this.f30085t3;
                if (this.J) {
                    f15 = 9.0f;
                }
                int L2 = ((i20 - org.telegram.messenger.g0.L(f15)) - this.V1) - org.telegram.messenger.g0.L(17.0f);
                if (this.f30127w7 && this.E8 != 3) {
                    i16 = getCommentButtonHeight();
                } else {
                    i16 = 0;
                }
                L = L2 - i16;
                this.f30073s3 = org.telegram.messenger.g0.T1(L, org.telegram.messenger.g0.L(9.0f) + this.Ta, W2());
            } else {
                if (this.f30144xb) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.P5.Q3()) {
                        i15 = 0;
                    } else {
                        i15 = 6;
                    }
                    this.f30061r3 = org.telegram.messenger.g0.L(i15 + 11) + backgroundDrawableLeft;
                } else {
                    int i21 = this.M6;
                    if (!ziVar.Q3() && !this.B6 && !this.K) {
                        f16 = 17.0f;
                    }
                    this.f30061r3 = org.telegram.messenger.g0.L(f16) + i21 + this.f30047q3;
                }
                int i22 = this.f30106v0 - this.f30085t3;
                if (this.J) {
                    f15 = 9.0f;
                }
                int L3 = i22 - org.telegram.messenger.g0.L(f15);
                if (this.f30127w7 && this.E8 != 3) {
                    i13 = getCommentButtonHeight();
                } else {
                    i13 = 0;
                }
                int i23 = L3 - i13;
                dh.o0 o0Var = this.O;
                if (!o0Var.f9125p) {
                    i14 = o0Var.f9123n;
                } else {
                    i14 = 0;
                }
                L = i23 - i14;
                this.f30073s3 = org.telegram.messenger.g0.T1(L, org.telegram.messenger.g0.L(9.0f) + this.Ta, W2());
            }
        } else {
            if (x1Var.f30867g0) {
                f11 = x1Var.f30897n0;
                f12 = x1Var.f30901o0;
                f10 = x1Var.f30909q0;
            } else {
                ei.c3 c3Var = this.U0;
                float f17 = c3Var.L0;
                float f18 = c3Var.M0;
                f10 = c3Var.O0;
                f11 = f17;
                f12 = f18;
            }
            this.f30061r3 = f11 + org.telegram.messenger.g0.L(5.0f) + this.f30047q3;
            if (t2()) {
                float compactLeft = getCompactLeft() - getExtraTextX();
                if (s2()) {
                    f13 = this.f29893dd;
                } else if (this.L != null && this.M != null) {
                    f13 = getLeft();
                } else {
                    f13 = 0.0f;
                }
                this.f30061r3 = compactLeft - f13;
            }
            L = f12 + f10 + org.telegram.messenger.g0.L(6.0f);
            float L4 = f10 + org.telegram.messenger.g0.L(6.0f);
            xi xiVar = this.f29985l3;
            if (xiVar == null) {
                i3 = 0;
            } else {
                i3 = -xiVar.b();
            }
            this.f30073s3 = org.telegram.messenger.g0.T1(L4, i3 - org.telegram.messenger.g0.L(4.0f), W2()) + f12;
            z10 = false;
        }
        this.f30061r3 += getExtraTextX();
        zi ziVar2 = this.P5;
        if (ziVar2 != null && (i10 = ziVar2.D) != 0 && i10 != 24 && !ziVar2.w3() && !this.P5.s4()) {
            if (z10 && f2()) {
                this.f30073s3 -= (1.0f - W2()) * (org.telegram.messenger.g0.L(16.0f) + this.f30070s0.f30325r);
            }
            if (z10) {
                s1 s1Var = this.f30070s0;
                if (s1Var != null) {
                    i12 = s1Var.f30325r;
                } else {
                    i12 = 0;
                }
                i11 = org.telegram.messenger.g0.L(14.0f) + i12;
            } else {
                i11 = 0;
            }
            float f19 = L - i11;
            xi xiVar2 = this.f29985l3;
            if (xiVar2 != null) {
                i18 = org.telegram.messenger.g0.L(4.0f) + xiVar2.c(x1Var);
            }
            this.f30058r0 = (int) ((f19 + org.telegram.messenger.g0.W1(W2(), i18, org.telegram.messenger.g0.L(6.0f))) - x1Var.f30885k0);
        }
        zi ziVar3 = this.P5;
        if (ziVar3 != null && ziVar3.D == 17) {
            float f20 = this.f30073s3;
            w1 w1Var = this.f30122w2;
            if (w1Var != null) {
                f14 = w1Var.f30789q;
            }
            this.f30073s3 = f20 + f14;
        }
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.O():void");
    }

    public void O0(Canvas canvas) {
        if (this.P9 == null) {
            return;
        }
        canvas.save();
        ei.c3 c3Var = this.U0;
        canvas.translate(c3Var.L0, c3Var.M0);
        this.P9.c(canvas, this, (int) c3Var.N0, (int) c3Var.O0, c3Var.getAlpha(), this.Fc);
        canvas.restore();
        invalidate();
    }

    public final float O1(boolean z10) {
        float f10;
        sg0 sg0Var;
        float f11;
        if (!this.k1 && this.f30140x6) {
            int i3 = this.f30153y6;
            if (i3 >= 300) {
                f11 = 1.0f;
            } else {
                f11 = i3 / 300.0f;
            }
            f10 = f11 * 1.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10 && (sg0Var = this.f30009n3) != null) {
            return (1.0f - sg0Var.f38020k.e(false, 1.0f)) * f10;
        }
        return f10;
    }

    public final boolean O2() {
        gk0 Z3 = Z3();
        if (Z3 != null) {
            long j10 = this.Zb;
            long j11 = 0;
            if (j10 != 0) {
                h71 h71Var = Z3.f34132e0;
                if (h71Var != null) {
                    j11 = h71Var.f34335t;
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

    public final void O3() {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        if (this.P5 != null) {
            int i3 = this.Z5;
            hp s12 = hp.s1(i3);
            TLRPC.MessageFwdHeader messageFwdHeader = this.P5.f26868k.fwd_from;
            long e10 = h10.i(i3).e();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (zi.B0(this.P5.f26868k) == e10 || zi.B0(this.P5.f26868k) == 1271266957)) {
                this.f29968ja = hp.s1(i3).M0(Long.valueOf(messageFwdHeader.from_id.channel_id));
            } else if (messageFwdHeader != null && zi.B0(this.P5.f26868k) == 489000) {
                long o10 = org.telegram.messenger.m5.o(messageFwdHeader.from_id);
                if (o10 >= 0) {
                    this.f29955ia = s12.a2(Long.valueOf(o10));
                } else {
                    this.f29968ja = s12.M0(Long.valueOf(-o10));
                }
            } else if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
                long j10 = peer.user_id;
                if (j10 != 0) {
                    if (!this.f29928g6) {
                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                        if (peer2 instanceof TLRPC.TL_peerUser) {
                            this.f29955ia = s12.a2(Long.valueOf(peer2.user_id));
                            return;
                        }
                    }
                    this.f29955ia = s12.a2(Long.valueOf(j10));
                } else if (peer.channel_id != 0) {
                    if (this.P5.l4()) {
                        TLRPC.Peer peer3 = messageFwdHeader.from_id;
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            this.f29955ia = s12.a2(Long.valueOf(peer3.user_id));
                            return;
                        }
                    }
                    this.f29968ja = s12.M0(Long.valueOf(messageFwdHeader.saved_from_peer.channel_id));
                } else {
                    long j11 = peer.chat_id;
                    if (j11 != 0) {
                        TLRPC.Peer peer4 = messageFwdHeader.from_id;
                        if (peer4 instanceof TLRPC.TL_peerUser) {
                            this.f29955ia = s12.a2(Long.valueOf(peer4.user_id));
                        } else {
                            this.f29968ja = s12.M0(Long.valueOf(j11));
                        }
                    }
                }
            } else if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || zi.B0(this.P5.f26868k) == e10)) {
                this.f29955ia = s12.a2(Long.valueOf(messageFwdHeader.from_id.user_id));
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || zi.B0(this.P5.f26868k) == e10)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.f29955ia = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || zi.B0(this.P5.f26868k) == e10)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.f29955ia = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long B0 = zi.B0(this.P5.f26868k);
                long Z0 = this.P5.Z0();
                TLRPC.Chat chat2 = null;
                if (org.telegram.messenger.m5.z(Z0)) {
                    chat = s12.M0(Long.valueOf(-Z0));
                } else {
                    chat = null;
                }
                if (org.telegram.messenger.m5.z(B0)) {
                    chat2 = s12.M0(Long.valueOf(-B0));
                }
                if (org.telegram.messenger.m5.C(zi.B0(this.P5.f26868k))) {
                    if (this.P5.Q3()) {
                        this.f29955ia = h10.i(i3).f();
                        return;
                    }
                    TLRPC.EncryptedChat a12 = s12.a1(Integer.valueOf((int) (zi.B0(this.P5.f26868k) & 4294967295L)));
                    if (a12 != null) {
                        this.f29955ia = s12.a2(Long.valueOf(a12.user_id));
                    }
                } else if (org.telegram.messenger.m5.E(Z0) && (!this.P5.f26868k.post || (chat != null && chat.signature_profiles))) {
                    this.f29955ia = s12.a2(Long.valueOf(Z0));
                } else if (this.P5.f26868k.post && chat2 != null && !chat2.signature_profiles) {
                    this.f29968ja = chat2;
                } else if (org.telegram.messenger.m5.z(Z0)) {
                    this.f29968ja = chat;
                } else {
                    TLRPC.Message message = this.P5.f26868k;
                    if (message.post) {
                        this.f29968ja = s12.M0(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    public final boolean P(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.P(android.view.MotionEvent):boolean");
    }

    public final boolean P0(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        zi ziVar;
        l1 l1Var;
        String str;
        boolean c2 = dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        int i3 = 1;
        int i10 = this.Z5;
        if (!c2 && !dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            if (dg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                yy C = yy.C(i10);
                zi ziVar2 = this.P5;
                if (ziVar2 != null && keyboardButtonProto != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(zi.B0(ziVar2.f26868k));
                    sb2.append("_");
                    sb2.append(ziVar2.f1());
                    sb2.append("_");
                    sb2.append(Utilities.f(keyboardButtonProto.getData()));
                    sb2.append("_");
                    if (dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    sb2.append(str);
                    return C.f26683n.containsKey(sb2.toString());
                }
            } else {
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (tL_inlineButtonTypeUrl != null && (l1Var = this.Ra) != null && l1Var.p1(this, 3) && TextUtils.equals(this.Ra.g(this), tL_inlineButtonTypeUrl.url)) {
                    return true;
                }
            }
        } else {
            yy C2 = yy.C(i10);
            if (this.P5 != null && keyboardButtonProto != null) {
                if (dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    i3 = 3;
                } else if (!dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                    if (dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                }
                return C2.f26684r.containsKey(zi.B0(ziVar.f26868k) + "_" + ziVar.f1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i3);
            }
        }
        return false;
    }

    public final void P2(int i3, int i10) {
        ri riVar = this.M;
        float f10 = riVar.f25155r;
        float f11 = riVar.f25157t;
        this.f29879cd = f10 - f11;
        this.f29893dd = f11;
        this.f29906ed = (int) riVar.f25156s;
        this.f29921fd = (int) ((i3 * riVar.f25158u) / (i10 / 1000.0f));
    }

    public final void P3() {
        Window window;
        if (this.f30003mb == null) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W == null) {
                window = null;
            } else {
                window = W.getWindow();
            }
            if (window != null) {
                org.telegram.messenger.n6 n6Var = new org.telegram.messenger.n6(window, new ca(this, 3));
                this.f30003mb = n6Var;
                if (this.O0) {
                    n6Var.a();
                }
            }
        }
        org.telegram.messenger.n6 n6Var2 = this.f30003mb;
        if (n6Var2 != null) {
            n6Var2.g();
        }
    }

    public final boolean Q(MotionEvent motionEvent) {
        boolean z10;
        int i3;
        int i10;
        boolean z11;
        int i11;
        zi ziVar;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        int i12;
        int i13;
        int i14;
        int i15;
        int L;
        int L2;
        int i16;
        CharSequence charSequence;
        int i17;
        int w02;
        zi ziVar2;
        int i18 = this.P5.D;
        if ((i18 == 0 || i18 == 24) && this.Q1) {
            t1 D1 = D1();
            q1 q1Var = D1.f30444a;
            zi ziVar3 = q1Var.P5;
            RadialProgress2 radialProgress2 = q1Var.Q0;
            m2.p0 p0Var = q1Var.f30086t4;
            ei.c3 c3Var = q1Var.U0;
            int[] iArr = q1Var.M2;
            Drawable[] drawableArr = q1Var.I2;
            int i19 = ziVar3.D;
            if ((i19 == 0 || i19 == 24) && q1Var.Q1) {
                int x10 = (int) motionEvent.getX();
                int M1 = (int) q1Var.M1(motionEvent);
                int i20 = q1Var.f30031p0;
                if (x10 >= i20 && x10 <= (i20 + q1Var.f29848a7) - org.telegram.messenger.g0.L(14.0f) && M1 >= (i3 = q1Var.f30044q0)) {
                    int i21 = i3 + q1Var.V1;
                    if (q1Var.f30084t2) {
                        i10 = 46;
                    } else {
                        i10 = 0;
                    }
                    if (M1 <= org.telegram.messenger.g0.L(i10 + 8) + i21) {
                        if (motionEvent.getAction() == 0) {
                            if (q1Var.f30020o2 != null && M1 >= q1Var.X1 && !q1Var.P5.f26895r1) {
                                try {
                                    int L3 = x10 - ((q1Var.f30031p0 + org.telegram.messenger.g0.L(10.0f)) + q1Var.Z1);
                                    int i22 = M1 - q1Var.X1;
                                    if (i22 <= q1Var.f30020o2.getHeight()) {
                                        int lineForVertical = q1Var.f30020o2.getLineForVertical(i22);
                                        float f10 = L3;
                                        int offsetForHorizontal = q1Var.f30020o2.getOffsetForHorizontal(lineForVertical, f10);
                                        float lineLeft = q1Var.f30020o2.getLineLeft(lineForVertical);
                                        if (lineLeft <= f10 && lineLeft + q1Var.f30020o2.getLineWidth(lineForVertical) >= f10) {
                                            if (q1Var.P5.s4()) {
                                                charSequence = q1Var.P5.v;
                                            } else {
                                                charSequence = q1Var.P5.f26920y;
                                            }
                                            Spannable spannable = (Spannable) charSequence;
                                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                            if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[0] instanceof s31) || s31.h) && !org.telegram.messenger.g0.C1())) {
                                                t70 t70Var = q1Var.f30048q4;
                                                if (t70Var == null || t70Var.f38328i != clickableSpanArr[0]) {
                                                    p0Var.m(t70Var, true);
                                                    t70 t70Var2 = new t70(clickableSpanArr[0], q1Var.Pb, x10, M1, 0);
                                                    q1Var.f30048q4 = t70Var2;
                                                    if (q1Var.Q1 && q1Var.f30013n8 != null && (ziVar2 = q1Var.P5) != null && !ziVar2.Q3()) {
                                                        w02 = org.telegram.ui.ActionBar.k6.r1(0.1f, q1Var.f30013n8.i());
                                                    } else {
                                                        if (q1Var.P5.Q3()) {
                                                            i17 = org.telegram.ui.ActionBar.k6.Ac;
                                                        } else {
                                                            i17 = org.telegram.ui.ActionBar.k6.f28298ze;
                                                        }
                                                        w02 = org.telegram.ui.ActionBar.k6.w0(i17, q1Var.Pb);
                                                    }
                                                    t70Var2.d(w02);
                                                    q1Var.f30147y0 = -10;
                                                    q1Var.f30098u4 = 2;
                                                    q1Var.u();
                                                    try {
                                                        n70 b10 = q1Var.f30048q4.b();
                                                        int[] W1 = W1(spannable, q1Var.f30048q4.f38328i);
                                                        b10.d(q1Var.f30020o2, W1[0], 0.0f);
                                                        q1Var.f30020o2.getSelectionPath(W1[0], W1[1], b10);
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                    }
                                                    p0Var.b(q1Var.f30048q4, 2);
                                                }
                                                q1Var.invalidate();
                                                return true;
                                            }
                                        }
                                    }
                                } catch (Exception e11) {
                                    org.telegram.messenger.a8.g(e11, true);
                                }
                            }
                            if (q1Var.f30048q4 == null) {
                                int L4 = org.telegram.messenger.g0.L(48.0f);
                                if (q1Var.W3 >= 0 && x10 >= (L2 = q1Var.J3 + (L = org.telegram.messenger.g0.L(27.0f))) && x10 <= L2 + L4 && M1 >= (i16 = q1Var.K3 + L) && M1 <= i16 + L4) {
                                    q1Var.Q3 = 1;
                                    q1Var.invalidate();
                                    return true;
                                }
                                if (q1Var.f30148y1 && q1Var.N3 != -1 && x10 >= (i14 = q1Var.L3)) {
                                    if (x10 <= Math.max(q1Var.B3, q1Var.f29897e3) + org.telegram.messenger.g0.L(34.0f) + i14 && M1 >= (i15 = q1Var.M3) && M1 <= org.telegram.messenger.g0.L(30.0f) + i15) {
                                        q1Var.P3 = 1;
                                        q1Var.invalidate();
                                        return true;
                                    }
                                }
                                if ((q1Var.N1 && q1Var.P5.Y0 != null && c3Var.O(x10, M1)) || (q1Var.N1 && q1Var.f30135x1 && ((q1Var.N3 != -1 || q1Var.L1 == 4) && ((!q1Var.I3 && c3Var.O(x10, M1)) || (x10 >= (i12 = q1Var.J3) && x10 <= org.telegram.messenger.g0.L(48.0f) + i12 && M1 >= (i13 = q1Var.K3) && M1 <= org.telegram.messenger.g0.L(48.0f) + i13 && radialProgress2.f31554i.f36083q != 4))))) {
                                    q1Var.O3 = 1;
                                    q1Var.invalidate();
                                    TLRPC.MessageMedia messageMedia = q1Var.P5.Y0;
                                    if (messageMedia == null) {
                                        return true;
                                    }
                                    if (!zi.t3(messageMedia.document, false) && q1Var.P5.Y0.photo == null) {
                                        return true;
                                    }
                                    Drawable drawable = drawableArr[0];
                                    if (drawable != null && drawable.getBounds().contains(x10, M1)) {
                                        drawableArr[0].setHotspot(x10, M1);
                                        drawableArr[0].setState(iArr);
                                    }
                                    y yVar = D1.f30464x;
                                    if (yVar != null && yVar.getBounds().contains(x10, M1)) {
                                        D1.f30464x.setHotspot(x10, M1);
                                        D1.f30464x.setState(iArr);
                                    }
                                    q1Var.setInstantButtonPressed(true);
                                    gc gcVar = D1.f30463w;
                                    if (gcVar == null) {
                                        return true;
                                    }
                                    gcVar.c(true);
                                    return true;
                                }
                                q1Var.E2 = true;
                                q1Var.K2[0] = 0;
                                Drawable drawable2 = drawableArr[0];
                                if (drawable2 != null && drawable2.getBounds().contains(x10, M1)) {
                                    drawableArr[0].setHotspot(x10, M1);
                                    drawableArr[0].setState(iArr);
                                }
                                y yVar2 = D1.f30464x;
                                if (yVar2 != null && yVar2.getBounds().contains(x10, M1)) {
                                    D1.f30464x.setHotspot(x10, M1);
                                    D1.f30464x.setState(iArr);
                                }
                                q1Var.setInstantButtonPressed(true);
                                gc gcVar2 = D1.f30463w;
                                if (gcVar2 != null) {
                                    gcVar2.c(true);
                                }
                                q1Var.invalidate();
                                return true;
                            }
                        } else {
                            if (motionEvent.getAction() == 1) {
                                if (q1Var.E2) {
                                    int i23 = q1Var.L1;
                                    if (i23 == 7) {
                                        if (MediaController.B().I(q1Var.P5) && !MediaController.B().H()) {
                                            MediaController.B().R(q1Var.P5, true);
                                        } else {
                                            q1Var.Ra.I1(q1Var, q1Var.P5);
                                        }
                                    } else if (!q1Var.f30084t2 && ((ziVar = q1Var.P5) == null || (tL_channelAdminLogEvent = ziVar.J1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage))) {
                                        if (q1Var.N1 && (i23 == 2 || i23 == 4 || (D1.f30450i == null && q1Var.f30008n2 == null && q1Var.f30020o2 == null && q1Var.f29910f2 == null))) {
                                            l1 l1Var = q1Var.Ra;
                                            if (l1Var != null) {
                                                l1Var.t0(q1Var, q1Var.f29936h1, q1Var.f29947i1, true);
                                            }
                                        } else if (ziVar != null && !ziVar.f26895r1) {
                                            TLRPC.WebPage webPage = zi.o1(ziVar.f26868k).webpage;
                                            if (webPage != null && !TextUtils.isEmpty(webPage.embed_url)) {
                                                l1 l1Var2 = q1Var.Ra;
                                                if (l1Var2 != null) {
                                                    l1Var2.H1(q1Var.P5, webPage.embed_url, webPage.site_name, webPage.title, webPage.url, webPage.embed_width, webPage.embed_height);
                                                }
                                            } else if (webPage != null) {
                                                l1 l1Var3 = q1Var.Ra;
                                                if (l1Var3 != null) {
                                                    l1Var3.E1(q1Var, webPage, webPage.url, zi.o1(q1Var.P5.f26868k).safe);
                                                } else {
                                                    sf.c.t(q1Var.getContext(), webPage.url);
                                                }
                                            }
                                        }
                                    } else {
                                        l1 l1Var4 = q1Var.Ra;
                                        if (l1Var4 != null) {
                                            l1Var4.f1(q1Var, q1Var.f30136x2);
                                        }
                                    }
                                    q1Var.playSoundEffect(0);
                                    Drawable drawable3 = drawableArr[0];
                                    if (drawable3 != null) {
                                        drawable3.setState(StateSet.NOTHING);
                                    }
                                    y yVar3 = D1.f30464x;
                                    if (yVar3 != null) {
                                        yVar3.setState(StateSet.NOTHING);
                                    }
                                    gc gcVar3 = D1.f30463w;
                                    if (gcVar3 != null) {
                                        gcVar3.c(false);
                                    }
                                    q1Var.E2 = false;
                                    q1Var.setInstantButtonPressed(false);
                                    q1Var.invalidate();
                                } else if (q1Var.f30098u4 != 2 && q1Var.O3 == 0 && q1Var.Q3 == 0 && q1Var.P3 == 0) {
                                    if (!q1Var.f30170zc) {
                                        z11 = false;
                                        q1Var.f30170zc = false;
                                        q1Var.d3(2);
                                        z10 = z11;
                                    }
                                } else {
                                    z11 = false;
                                    if (q1Var.P3 == 1) {
                                        q1Var.P3 = 0;
                                        q1Var.playSoundEffect(0);
                                        q1Var.D0(true);
                                        q1Var.invalidate();
                                    } else if (q1Var.O3 != 0) {
                                        q1Var.O3 = 0;
                                        q1Var.playSoundEffect(0);
                                        if (q1Var.f30148y1 || ((q1Var.N3 == -1 && q1Var.L1 == 4) || q1Var.P5.Y0 != null)) {
                                            z11 = false;
                                            q1Var.C0();
                                        } else {
                                            z11 = false;
                                            q1Var.D0(false);
                                        }
                                        q1Var.invalidate();
                                    } else if (q1Var.Q3 != 0) {
                                        q1Var.Q3 = 0;
                                        q1Var.playSoundEffect(0);
                                        q1Var.E0();
                                        q1Var.invalidate();
                                    } else {
                                        t70 t70Var3 = q1Var.f30048q4;
                                        if (t70Var3 != null) {
                                            CharacterStyle characterStyle = t70Var3.f38328i;
                                            if (characterStyle instanceof URLSpan) {
                                                q1Var.Ra.N0(q1Var, characterStyle, false);
                                            } else if (characterStyle instanceof ClickableSpan) {
                                                ((ClickableSpan) characterStyle).onClick(q1Var);
                                            }
                                            q1Var.d3(2);
                                        } else {
                                            org.telegram.ui.Components.p5 p5Var = q1Var.f30035p4;
                                            if (p5Var != null && q1Var.Ra.o0(p5Var)) {
                                                q1Var.f30035p4 = null;
                                                q1Var.d3(2);
                                            } else {
                                                if (q1Var.L1 == 2 && q1Var.f30135x1) {
                                                    int i24 = q1Var.N3;
                                                    if (i24 == -1) {
                                                        int i25 = az.f21612a;
                                                        if (org.telegram.messenger.lc.e(2048) && !q1Var.P5.f26857h2) {
                                                            q1Var.Ra.t0(q1Var, q1Var.f29936h1, q1Var.f29947i1, false);
                                                        } else {
                                                            i11 = 2;
                                                            q1Var.N3 = 2;
                                                            q1Var.P5.f26846f0 = 1.0f;
                                                            c3Var.f21272u0 = false;
                                                            c3Var.Q0();
                                                            radialProgress2.setIcon(q1Var.getIconForCurrentState(), false, true);
                                                            q1Var.invalidate();
                                                            q1Var.playSoundEffect(0);
                                                            q1Var.d3(i11);
                                                            return true;
                                                        }
                                                    } else if (i24 == 2 || i24 == 0) {
                                                        q1Var.D0(false);
                                                        q1Var.playSoundEffect(0);
                                                    }
                                                } else {
                                                    zi ziVar4 = q1Var.P5;
                                                    if (!ziVar4.f26895r1) {
                                                        TLRPC.WebPage webPage2 = zi.o1(ziVar4.f26868k).webpage;
                                                        if (webPage2 != null && !TextUtils.isEmpty(webPage2.embed_url)) {
                                                            q1Var.Ra.H1(q1Var.P5, webPage2.embed_url, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_width, webPage2.embed_height);
                                                        } else {
                                                            int i26 = q1Var.N3;
                                                            if (i26 != -1 && i26 != 3) {
                                                                if (webPage2 != null) {
                                                                    l1 l1Var5 = q1Var.Ra;
                                                                    if (l1Var5 != null) {
                                                                        l1Var5.E1(q1Var, webPage2, webPage2.url, zi.o1(q1Var.P5.f26868k).safe);
                                                                    } else {
                                                                        sf.c.t(q1Var.getContext(), webPage2.url);
                                                                    }
                                                                }
                                                            } else {
                                                                q1Var.Ra.t0(q1Var, q1Var.f29936h1, q1Var.f29947i1, false);
                                                                q1Var.playSoundEffect(0);
                                                            }
                                                        }
                                                    }
                                                }
                                                i11 = 2;
                                                q1Var.d3(i11);
                                                return true;
                                            }
                                        }
                                    }
                                    z10 = z11;
                                }
                            } else {
                                z10 = false;
                                if (motionEvent.getAction() == 2 && q1Var.F2) {
                                    Drawable drawable4 = drawableArr[0];
                                    if (drawable4 != null) {
                                        drawable4.setHotspot(x10, M1);
                                    }
                                    y yVar4 = D1.f30464x;
                                    if (yVar4 != null) {
                                        yVar4.setHotspot(x10, M1);
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

    public final void Q0(float r8, android.graphics.Canvas r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.Q0(float, android.graphics.Canvas, boolean):void");
    }

    public final String Q1(long j10) {
        TLRPC.Chat M0;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i10 = this.Z5;
        if (i3 > 0) {
            TLRPC.User a22 = hp.s1(i10).a2(Long.valueOf(j10));
            if (a22 != null) {
                return l10.p(a22);
            }
            return null;
        } else if (i3 < 0 && (M0 = hp.s1(i10).M0(Long.valueOf(-j10))) != null) {
            return M0.title;
        } else {
            return null;
        }
    }

    public final int Q2(int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.Q2(int):int");
    }

    public final void Q3() {
        boolean z10;
        String k02;
        double d;
        double d10;
        double d11;
        th.e eVar;
        th.e eVar2;
        zi ziVar = this.P5;
        if (ziVar != null) {
            j1 j1Var = this.Ob;
            if (j1Var != null && j1Var.rewindCount != 0 && j1Var.rewindByBackSeek) {
                ziVar.f26828b0 = j1Var.getVideoProgress();
            }
            boolean z11 = true;
            if (this.P5.U3()) {
                w1 w1Var = this.f30122w2;
                if (w1Var != null && (eVar2 = w1Var.f30785m) != null) {
                    eVar2.p(true);
                }
                w1 w1Var2 = this.f30122w2;
                if (w1Var2 != null && (eVar = w1Var2.f30786n) != null) {
                    eVar.p(true);
                }
            }
            int i3 = this.L1;
            double d12 = 0.0d;
            int i10 = 0;
            i1 i1Var = this.C4;
            if (i3 == 4) {
                if (i1Var != null) {
                    i1Var.a();
                }
                if (this.f30123w3 != null) {
                    if (!PhotoViewer.N1(this.P5)) {
                        if (MediaController.B().f21351w0 == this.P5) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.t5 m10 = this.U0.m();
                if (m10 != null) {
                    zi ziVar2 = this.P5;
                    int i11 = m10.d[4] / 1000;
                    ziVar2.f26855h0 = i11;
                    d11 = i11;
                    TLRPC.Message message = ziVar2.f26868k;
                    if (message.ttl > 0 && message.destroyTime == 0 && !ziVar2.n5() && zi.M4(this.P5.f26868k) && m10.s()) {
                        this.Ra.P(this.P5);
                    }
                } else {
                    d11 = 0.0d;
                }
                if (d11 == 0.0d) {
                    d11 = this.P5.L0();
                }
                if (MediaController.B().I(this.P5)) {
                    d11 -= this.P5.f26828b0 * d11;
                } else if (m10 != null) {
                    if (d11 != 0.0d) {
                        d11 -= m10.o() / 1000;
                    }
                    if (this.Ra != null && m10.o() >= 3000) {
                        this.Ra.z0();
                    }
                }
                if (this.L4 != d11) {
                    String g02 = org.telegram.messenger.g0.g0((int) d11, false, false);
                    this.B3 = (int) Math.ceil(org.telegram.ui.ActionBar.k6.C2.measureText(g02));
                    this.f30123w3 = new StaticLayout(g02, org.telegram.ui.ActionBar.k6.C2, this.B3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.L4 = d11;
                    return;
                }
                return;
            }
            boolean z12 = this.f30144xb;
            sm0 sm0Var = this.D4;
            if (z12) {
                if (this.B4) {
                    if (!sm0Var.f38069f) {
                        sm0Var.g(true, this.P5.f26828b0);
                    }
                } else {
                    if (!i1Var.f36191e) {
                        i1Var.h(this.P5.f26828b0);
                        i1Var.f36202q = this.P5.f26841e0;
                    }
                    i1Var.a();
                }
                TLRPC.Document F0 = this.P5.F0();
                if (F0 != null) {
                    for (int i12 = 0; i12 < F0.attributes.size(); i12++) {
                        TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i12);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                            d10 = documentAttribute.duration;
                            break;
                        }
                    }
                }
                d10 = 0.0d;
                long j10 = this.f30017nc;
                if (j10 >= 0) {
                    d10 = j10;
                } else if (MediaController.B().I(this.P5)) {
                    d10 = Math.max(0.0d, d10 - this.P5.f26851g0);
                }
                if (this.L4 != d10) {
                    this.L4 = d10;
                    String g03 = org.telegram.messenger.g0.g0((int) d10, true, false);
                    this.M4 = (int) Math.ceil(org.telegram.ui.ActionBar.k6.T2.measureText(g03));
                    this.K4 = new StaticLayout(g03, org.telegram.ui.ActionBar.k6.T2, this.M4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float f10 = this.P5.f26828b0;
                if (f10 != 0.0f) {
                    this.Jb = f10;
                    if (f10 > 0.9f) {
                        this.Jb = 1.0f;
                    }
                }
                invalidate();
            } else if (this.M1 != null) {
                if (this.B4) {
                    if (!sm0Var.f38069f) {
                        sm0Var.g(true, this.P5.f26828b0);
                    }
                    z10 = true;
                } else {
                    if (!i1Var.f36191e) {
                        i1Var.h(this.P5.f26828b0);
                        i1Var.f36202q = this.P5.f26841e0;
                    }
                    i1Var.j(this.P5);
                    z10 = false;
                }
                int i13 = this.L1;
                if (i13 == 5) {
                    z10 = true;
                }
                if (i13 == 3) {
                    long j11 = this.f30017nc;
                    if (j11 >= 0) {
                        d = j11;
                    } else if (!MediaController.B().I(this.P5)) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= this.M1.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute2 = this.M1.attributes.get(i14);
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                d12 = documentAttribute2.duration;
                                break;
                            }
                            i14++;
                        }
                        d = d12;
                    } else {
                        d = this.P5.f26851g0;
                    }
                    if (this.L4 != d) {
                        this.L4 = d;
                        String g04 = org.telegram.messenger.g0.g0((int) d, true, false);
                        this.M4 = (int) Math.ceil(org.telegram.ui.ActionBar.k6.N2.measureText(g04));
                        this.K4 = new StaticLayout(g04, org.telegram.ui.ActionBar.k6.N2, this.M4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                } else {
                    double L0 = this.P5.L0();
                    if (MediaController.B().I(this.P5)) {
                        i10 = this.P5.f26851g0;
                    }
                    double d13 = i10;
                    if (this.L4 != d13) {
                        this.L4 = d13;
                        this.K4 = new StaticLayout(org.telegram.messenger.g0.k0(i10, (int) L0), org.telegram.ui.ActionBar.k6.N2, (int) Math.ceil(org.telegram.ui.ActionBar.k6.N2.measureText(k02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                    z11 = z10;
                }
                if (z11) {
                    invalidate();
                }
            }
        }
    }

    public final boolean R() {
        return org.telegram.messenger.w7.G(this.Z5).k(getFilename());
    }

    public final void R0(android.graphics.Canvas r21, org.telegram.messenger.xi r22, boolean r23, boolean r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.R0(android.graphics.Canvas, org.telegram.messenger.xi, boolean, boolean, float):void");
    }

    public final float R1(boolean z10) {
        boolean z11;
        xq xqVar;
        float f10 = this.Uc;
        zi ziVar = this.P5;
        if (ziVar != null && !ziVar.Q3()) {
            int i3 = 0;
            if (z10 && ((z11 = this.f30007n1) || this.f30019o1)) {
                if (z11) {
                    xqVar = xq.f40453g;
                } else {
                    xqVar = xq.f40454i;
                }
                this.f30059r1 = (int) Math.ceil(xqVar.getInterpolation(this.f30032p1) * org.telegram.messenger.g0.L(35.0f));
                if (this.P5.D == 36) {
                    if (org.telegram.messenger.g0.L(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                        this.f30059r1 = 0;
                    }
                }
            }
            f10 += this.f30059r1;
            if (t2()) {
                return f10 + getCompactSideMenuShift();
            }
            if (this.W6 && this.M != null) {
                if (X2()) {
                    i3 = 48;
                }
                return (org.telegram.messenger.g0.L(71 - i3) * this.Y6) + f10;
            }
        }
        return f10;
    }

    public final void R2(boolean z10) {
        int currentBackgroundLeft;
        float f10;
        int L;
        int i3;
        float f11;
        int L2;
        int currentBackgroundLeft2;
        boolean Q3 = this.P5.Q3();
        int i10 = 0;
        x1 x1Var = this.hb;
        if (Q3) {
            if (z10) {
                currentBackgroundLeft2 = (int) (this.M6 + x1Var.f30871h0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            this.f30018o0 = getExtraTextX() + org.telegram.messenger.g0.L(11.0f) + currentBackgroundLeft2;
        } else {
            if (z10) {
                currentBackgroundLeft = (int) (this.M6 + x1Var.f30871h0);
            } else {
                currentBackgroundLeft = getCurrentBackgroundLeft();
            }
            if (this.P5.D == 19) {
                L = 0;
            } else {
                if (!this.B6 && this.K) {
                    f10 = 11.0f;
                } else {
                    f10 = 17.0f;
                }
                L = org.telegram.messenger.g0.L(f10);
            }
            this.f30018o0 = getExtraTextX() + currentBackgroundLeft + L;
        }
        float f12 = 4.0f;
        if (this.S1) {
            this.f30018o0 = org.telegram.messenger.g0.L(11.0f) + this.f30018o0;
            int L3 = org.telegram.messenger.g0.L(14.0f) + this.Ta;
            this.f30094u0 = L3;
            StaticLayout staticLayout = this.f29910f2;
            if (staticLayout != null) {
                this.f30094u0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + L3;
            }
        } else if (this.T1) {
            int L4 = org.telegram.messenger.g0.L(14.0f) + this.Ta;
            this.f30094u0 = L4;
            StaticLayout staticLayout2 = this.f29910f2;
            if (staticLayout2 != null) {
                this.f30094u0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L4;
            }
        } else if (this.P5.D == 19) {
            this.f30094u0 = org.telegram.messenger.g0.L(6.0f) + this.Ta;
            if (!this.P5.O3()) {
                this.f30018o0 = getCurrentBackgroundLeft();
            } else {
                this.f30018o0 -= org.telegram.messenger.g0.L(4.0f);
            }
        } else {
            int L5 = org.telegram.messenger.g0.L(8.0f) + this.Ta;
            this.f30094u0 = L5;
            zi ziVar = this.P5;
            float f13 = 2.0f;
            if (ziVar.D == 36) {
                if (this.f30107v1 && this.f29985l3 != null && N2()) {
                    this.f30094u0 = org.telegram.messenger.k5.C(7.0f, this.f29985l3.b(), this.f30094u0);
                } else {
                    cv cvVar = this.P5.f26915w2;
                    if (cvVar != null && cvVar.Y()) {
                        int i11 = this.f30094u0;
                        if (this.Ta <= 0) {
                            f13 = -3.0f;
                        }
                        this.f30094u0 = org.telegram.messenger.g0.L(f13) + i11;
                    }
                }
            } else {
                if (ziVar.C2 && (i3 = az.Y0) > 10) {
                    if (i3 < 15) {
                        f13 = 1.0f;
                    }
                    this.f30094u0 = org.telegram.messenger.g0.L(f13) + L5;
                }
                if (this.P5.C2 && this.Ta > 0) {
                    this.f30094u0 = org.telegram.messenger.g0.L(5.0f) + this.f30094u0;
                }
            }
        }
        if (this.P5.s4()) {
            this.f30044q0 = org.telegram.messenger.g0.L(14.0f) + this.f30094u0;
        } else if (this.f30095u1) {
            this.f30044q0 = org.telegram.messenger.g0.L(10.0f) + this.f30094u0;
            this.f30094u0 = org.telegram.messenger.k5.C(13.0f, this.V1, this.f30094u0);
            if (this.f30084t2 && !this.T1 && !this.P5.w3()) {
                this.f30094u0 = org.telegram.messenger.g0.L(44.0f) + this.f30094u0;
            }
        } else {
            this.f30044q0 = org.telegram.messenger.g0.L(10.0f) + this.P5.X5(x1Var) + this.f30094u0;
        }
        if (this.f30095u1) {
            L2 = org.telegram.messenger.g0.L(10.0f) + this.P5.X5(x1Var) + this.f30094u0;
        } else {
            int i12 = this.f30044q0 + this.V1;
            if (this.f30084t2) {
                f11 = 46.0f;
            } else {
                f11 = 0.0f;
            }
            int L6 = org.telegram.messenger.g0.L(f11) + i12;
            if (this.V1 <= 0) {
                f12 = -8.0f;
            }
            L2 = org.telegram.messenger.g0.L(f12) + L6;
        }
        this.f30058r0 = L2;
        this.f30031p0 = this.f30018o0;
        if (this.P5.f26911v2 != 0.0f && this.P7 != null) {
            int L7 = this.f29848a7 - org.telegram.messenger.g0.L(31.0f);
            zi ziVar2 = this.P5;
            int i13 = L7 - ziVar2.f26904t2;
            if (!this.f29861b7) {
                int i14 = this.f30167z9;
                if (ziVar2.Q3()) {
                    i10 = 20;
                }
                i13 = org.telegram.messenger.camera.q.w(i10 + 4, i14, i13);
            }
            if (i13 > 0) {
                this.f30018o0 = (i13 - getExtraTimeX()) + this.f30018o0;
            }
        }
    }

    public final void R3() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.S0) {
            return;
        }
        boolean z13 = true;
        if ((!this.f30126w6 && !this.f30112v6 && !isPressed()) || (this.N1 && this.U0.I())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && this.O3 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        RadialProgress2 radialProgress2 = this.Q0;
        radialProgress2.o(z11, false);
        if (this.V3 != 0) {
            if (!z10 && this.Q3 == 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            radialProgress2.o(z12, true);
        }
        if (!z10 && this.P3 == 0) {
            z13 = false;
        }
        this.R0.o(z13, false);
    }

    public final boolean S(MotionEvent motionEvent) {
        y yVar;
        q1 q1Var;
        l1 l1Var;
        TLRPC.Chat chat;
        int i3;
        TLRPC.Chat chat2;
        if (this.f29967j9 && this.U8 != null && (yVar = this.U2) != null && (this.f29955ia != null || this.f29968ja != null)) {
            boolean contains = yVar.getBounds().contains((int) motionEvent.getX(), (int) M1(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.V2 = contains;
                if (contains) {
                    this.U2.setHotspot((int) motionEvent.getX(), (int) M1(motionEvent));
                    this.U2.setState(this.M2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.V2 && (l1Var = this.Ra) != null) {
                    if (this.R6) {
                        TLRPC.User user = this.f30079sa;
                        if (user != null && user.bot_inline_placeholder == null) {
                            l1Var.a2(this, user.f27150id);
                        } else {
                            String n4 = l10.n(user);
                            l1 l1Var2 = this.Ra;
                            if (n4 == null) {
                                n4 = this.P5.f26868k.via_bot_name;
                            }
                            l1Var2.n0(n4);
                        }
                    } else {
                        TLRPC.User user2 = this.f29955ia;
                        if (user2 != null) {
                            l1Var.s0(this, user2, motionEvent.getX(), M1(motionEvent));
                        } else {
                            TLRPC.Chat chat3 = this.f29968ja;
                            if (chat3 != null) {
                                TLRPC.MessageFwdHeader messageFwdHeader = this.P5.f26868k.fwd_from;
                                if (messageFwdHeader != null) {
                                    int i10 = messageFwdHeader.channel_post;
                                    chat = this.f30092ta;
                                    i3 = i10;
                                } else {
                                    chat = chat3;
                                    i3 = 0;
                                }
                                if (chat != null) {
                                    chat2 = chat;
                                } else {
                                    chat2 = chat3;
                                }
                                q1Var = this;
                                l1Var.U(q1Var, chat2, i3, this.f29936h1, this.f29947i1, false);
                                q1Var.U2.setState(StateSet.NOTHING);
                                q1Var.V2 = false;
                                return q1Var.V2;
                            }
                        }
                    }
                }
                q1Var = this;
                q1Var.U2.setState(StateSet.NOTHING);
                q1Var.V2 = false;
                return q1Var.V2;
            }
            q1Var = this;
            return q1Var.V2;
        }
        this.V2 = false;
        return false;
    }

    public final void S0(Canvas canvas) {
        zi ziVar;
        float f10;
        zi ziVar2 = this.P5;
        if ((ziVar2 == null || !ziVar2.s4()) && (ziVar = this.P5) != null && !ziVar.p4()) {
            zi ziVar3 = this.P5;
            if (ziVar3.D != 27 && !ziVar3.o4() && this.m1 != null) {
                if (this.f30007n1 || this.f30019o1) {
                    ri riVar = this.M;
                    if (riVar != null) {
                        int i3 = riVar.f25149l;
                        if ((i3 & 8) == 0 || (i3 & 1) == 0) {
                            return;
                        }
                    }
                    canvas.save();
                    float y9 = getY() + getPaddingTop();
                    ui uiVar = this.L;
                    if (uiVar != null && uiVar.d.size() > 1) {
                        f10 = (getTop() + this.L.f25709m.f25531f) - getTranslationY();
                    } else {
                        f10 = y9 + this.hb.f30885k0;
                    }
                    canvas.translate(this.Z6 - getCompactSideMenuShift(), f10 + this.Gc);
                    this.m1.a(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final ImageReceiver S1(int i3) {
        TLRPC.PollAnswer pollAnswer;
        th.e eVar;
        th.e eVar2;
        zi ziVar = this.P5;
        if (ziVar != null && ziVar.D == 17) {
            if (i3 == -2) {
                w1 w1Var = this.f30122w2;
                if (w1Var != null && (eVar2 = w1Var.f30785m) != null) {
                    return eVar2.f55402b;
                }
                return null;
            } else if (i3 == -3) {
                w1 w1Var2 = this.f30122w2;
                if (w1Var2 != null && (eVar = w1Var2.f30786n) != null) {
                    return eVar.f55402b;
                }
                return null;
            } else {
                ArrayList arrayList = this.P4;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        p1 p1Var = (p1) obj;
                        vh.b bVar = p1Var.f29797x;
                        if (bVar != null && (pollAnswer = p1Var.f29793s) != null && pollAnswer.unshuffled_index == i3) {
                            return bVar.f56944c;
                        }
                    }
                }
            }
        }
        l4 l4Var = this.W5;
        if (l4Var != null) {
            ArrayList arrayList2 = l4Var.f29550c;
            j4 j4Var = l4Var.f29549b;
            if (j4Var != null && i3 >= 0 && i3 < j4Var.f29423a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) l4Var.f29549b.f29423a.get(i3);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (((k4) arrayList2.get(i11)).F == messageExtendedMedia) {
                        return ((k4) arrayList2.get(i11)).f29498f;
                    }
                }
                return null;
            }
            return null;
        }
        return this.U0;
    }

    public final void S3() {
        float f10;
        int i3;
        float f11;
        int i10;
        if (!this.P5.P5()) {
            return;
        }
        dh.o0 o0Var = this.O;
        if (!o0Var.f9125p) {
            ri riVar = this.M;
            if (riVar != null) {
                int i11 = riVar.f25149l;
                if ((i11 & 8) == 0 || (i11 & 1) == 0) {
                    return;
                }
            }
            zi ziVar = this.P5;
            int i12 = 0;
            if (ziVar.D != 19 && !ziVar.H2() && !this.P5.N2()) {
                float f12 = 11.0f;
                if (this.P5.Q3()) {
                    o0Var.f9113b = org.telegram.messenger.g0.L(11.0f) + getCurrentBackgroundLeft();
                } else if (this.f30144xb) {
                    int L = org.telegram.messenger.g0.L(11.0f) + getCurrentBackgroundLeft();
                    if (!this.K) {
                        i10 = 6;
                    } else {
                        i10 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(getVideoTranscriptionProgress(), 0, i10)) + L;
                    o0Var.f9113b = L2;
                    o0Var.f9113b = L2 - ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(9.0f)));
                } else {
                    int L3 = org.telegram.messenger.g0.L((this.B6 || !this.K) ? 17.0f : 17.0f) + getCurrentBackgroundLeft();
                    o0Var.f9113b = L3;
                    if (this.B6) {
                        o0Var.f9113b = L3 - org.telegram.messenger.g0.L(9.0f);
                    }
                }
            } else if (this.P5.Q3()) {
                o0Var.f9113b = (getMeasuredWidth() - o0Var.f9124o) - org.telegram.messenger.g0.L(16.0f);
            } else {
                o0Var.f9113b = getCurrentBackgroundLeft();
            }
            if (t2()) {
                float compactLeft = getCompactLeft();
                if (s2()) {
                    f11 = this.f29893dd;
                } else if (this.L != null && this.M != null) {
                    f11 = getLeft();
                } else {
                    f11 = 0.0f;
                }
                o0Var.f9113b = (int) (compactLeft - f11);
            }
            if (!this.P5.Q3() && this.M != null && !t2()) {
                float f13 = o0Var.f9113b;
                if (X2()) {
                    i3 = 48;
                } else {
                    i3 = 0;
                }
                o0Var.f9113b = (int) (f13 - (org.telegram.messenger.g0.L(64 - i3) * this.Y6));
            }
            int backgroundDrawableBottom = (getBackgroundDrawableBottom() - org.telegram.messenger.g0.L(10.0f)) - o0Var.f9122m;
            o0Var.f9114c = backgroundDrawableBottom;
            if (this.f30127w7) {
                if (t2()) {
                    i12 = getCommentButtonHeight();
                } else {
                    if (this.P5.D == 29 && c2()) {
                        f10 = 28.0f;
                    } else {
                        f10 = 43.0f;
                    }
                    i12 = org.telegram.messenger.g0.L(f10);
                }
            }
            int i13 = backgroundDrawableBottom - i12;
            o0Var.f9114c = i13;
            if (this.f29861b7 && (!this.r9 || !this.Q1 || this.L1 != 3)) {
                o0Var.f9114c = i13 - org.telegram.messenger.g0.L(16.0f);
            }
            zi ziVar2 = this.P5;
            int i14 = ziVar2.D;
            if (i14 != 9 && this.f29985l3 != null && ((i14 != 2 && i14 != 17 && (!ziVar2.O3() || !this.r9 || this.N1)) || ((this.M != null && this.L != null) || this.P5.D == 29))) {
                o0Var.f9114c -= org.telegram.messenger.g0.L(14.0f);
            }
            o0Var.f9114c += o0Var.f9120k;
        }
    }

    public final boolean T(MotionEvent motionEvent) {
        l1 l1Var;
        TLRPC.User user;
        TLRPC.Document document;
        if (this.f29967j9 && this.U8 != null && this.U2 != null && ((this.f29955ia != null || this.f29968ja != null) && this.f30002ma != null && this.f30041pa != null)) {
            boolean contains = this.f29844a3.getBounds().contains((int) motionEvent.getX(), (int) M1(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.f29857b3 = contains;
                if (contains) {
                    this.f29844a3.setHotspot((int) motionEvent.getX(), (int) M1(motionEvent));
                    this.f29844a3.setState(this.M2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.f29857b3 && (l1Var = this.Ra) != null && (user = this.f29955ia) != null) {
                    Drawable drawable = this.f30041pa.f33286f[0];
                    if (drawable instanceof org.telegram.ui.Components.g5) {
                        document = ((org.telegram.ui.Components.g5) drawable).f33966e;
                    } else {
                        document = null;
                    }
                    l1Var.N1(this, user, document, this.f30028oa);
                    p2();
                }
                this.f29844a3.setState(StateSet.NOTHING);
                this.f29857b3 = false;
            }
            return this.f29857b3;
        }
        this.f29857b3 = false;
        return false;
    }

    public final void T0(Canvas canvas, boolean z10, boolean z11, float f10, float f11, float f12, float f13, float f14, boolean z12) {
        boolean z13;
        float L;
        int i3;
        int w02;
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
        x1 x1Var = this.hb;
        dh.o0 o0Var = this.O;
        if (z10) {
            if (!this.P5.Q3()) {
                sa0 sa0Var = org.telegram.ui.ActionBar.k6.E3;
                if (D3()) {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27960hd, this.Pb);
                } else {
                    if (z12) {
                        i3 = org.telegram.ui.ActionBar.k6.Cb;
                    } else {
                        i3 = org.telegram.ui.ActionBar.k6.f27960hd;
                    }
                    w02 = org.telegram.ui.ActionBar.k6.w0(i3, this.Pb);
                }
                sa0Var.a(w02);
                if (D3()) {
                    f16 = (getPhotoBottom() + this.f30120w0) - org.telegram.messenger.g0.L(9.0f);
                } else {
                    if (!this.G && !this.F) {
                        f15 = 8.5f;
                    } else {
                        f15 = 9.5f;
                    }
                    float L2 = (f10 - org.telegram.messenger.g0.L(f15)) + f12;
                    if (this.f30144xb && !t2()) {
                        if (this.K) {
                            f17 = 4.0f;
                        } else {
                            f17 = 5.0f;
                        }
                        f16 = L2 - ((1.0f - getVideoTranscriptionProgress()) * (o0Var.i(x1Var.L1) + org.telegram.messenger.g0.L(f17)));
                    } else {
                        f16 = L2;
                    }
                }
                if (!this.P5.f26887p1) {
                    i10 = org.telegram.messenger.g0.L(11.0f);
                }
                z.t(sa0Var, f13 + i10, f16 - org.telegram.messenger.g0.L(12.0f));
                sa0Var.setAlpha((int) (f19 * 255.0f));
                if (z13) {
                    canvas.save();
                    canvas.scale(f18, f18, sa0Var.getBounds().centerX(), sa0Var.getBounds().centerY());
                }
                sa0Var.draw(canvas);
                sa0Var.setAlpha(255);
                invalidate();
                if (z13) {
                    canvas.restore();
                }
            }
        } else if (z11 && !this.P5.Q3()) {
            if (!this.P5.f26887p1) {
                i10 = org.telegram.messenger.g0.L(11.0f);
            }
            float f20 = f13 + i10;
            float f21 = 21.5f;
            if (D3()) {
                L = (getPhotoBottom() + this.f30120w0) - org.telegram.messenger.g0.L(21.5f);
            } else {
                if (!this.G && !this.F) {
                    f21 = 20.5f;
                }
                L = (f10 - org.telegram.messenger.g0.L(f21)) + f12;
                if (this.f30144xb) {
                    L -= (1.0f - getVideoTranscriptionProgress()) * o0Var.i(x1Var.L1);
                }
            }
            RectF rectF = this.f29858b4;
            rectF.set(f20, L, org.telegram.messenger.g0.L(14.0f) + f20, org.telegram.messenger.g0.L(14.0f) + L);
            int alpha = org.telegram.ui.ActionBar.k6.f27838b2.getAlpha();
            int i11 = (int) (f19 * 255.0f);
            org.telegram.ui.ActionBar.k6.f27838b2.setAlpha(i11);
            if (z13) {
                canvas.save();
                canvas.scale(f18, f18, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.f27838b2);
            org.telegram.ui.ActionBar.k6.f27838b2.setAlpha(alpha);
            Drawable Y1 = Y1("drawableMsgError");
            z.t(Y1, f20 + org.telegram.messenger.g0.L(6.0f), L + org.telegram.messenger.g0.L(2.0f));
            Y1.setAlpha(i11);
            Y1.draw(canvas);
            Y1.setAlpha(255);
            if (z13) {
                canvas.restore();
            }
        }
    }

    public final float T1(int i3) {
        p1 p1Var;
        if (i3 >= 0) {
            ArrayList arrayList = this.P4;
            if (i3 < arrayList.size()) {
                int i10 = ((p1) arrayList.get(i3)).f29778b;
                int i11 = this.Ta;
                float f10 = i10 + i11;
                x1 x1Var = this.hb;
                if (x1Var.f30927u2) {
                    float f11 = x1Var.L1;
                    f10 += ((1.0f - f11) * x1Var.f30930v2) + (i11 * f11);
                    if (this.P5.o5()) {
                        f10 -= this.Ta;
                    }
                }
                if (x1Var.f30936x0) {
                    f10 += x1Var.f30885k0;
                }
                return f10 + p1Var.f29779c + org.telegram.messenger.g0.L(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void T3(zi ziVar) {
        String str;
        CharSequence concat;
        int i3;
        if (ziVar != null && ziVar.n5()) {
            int i10 = 0;
            if (!ziVar.m4()) {
                concat = null;
            } else {
                TLRPC.Message message = ziVar.f26868k;
                int i11 = message.ttl;
                if (i11 == Integer.MAX_VALUE) {
                    if (ziVar.W2 == null) {
                        ziVar.W2 = new SpannableString("v");
                        wp wpVar = new wp(2131231979, 0);
                        wpVar.f40045r = -org.telegram.messenger.g0.L(3.0f);
                        wpVar.F = org.telegram.messenger.g0.L(13.0f);
                        SpannableString spannableString = ziVar.W2;
                        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
                    }
                    concat = TextUtils.concat(ziVar.W2, "1");
                } else {
                    int i12 = message.destroyTime;
                    if (i12 != 0) {
                        i11 = Math.max(0, i12 - ConnectionsManager.getInstance(ziVar.I1).getCurrentTime());
                    }
                    if (i11 < 60) {
                        str = com.google.android.recaptcha.internal.a.h(i11, "s");
                    } else {
                        str = (i11 / 60) + "m";
                    }
                    if (ziVar.X2 == null) {
                        ziVar.X2 = new SpannableString("p");
                        wp wpVar2 = new wp(2131232547, 0);
                        wpVar2.f40045r = org.telegram.messenger.g0.L(1.0f);
                        wpVar2.F = org.telegram.messenger.g0.L(13.0f);
                        SpannableString spannableString2 = ziVar.X2;
                        spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 33);
                    }
                    concat = TextUtils.concat(ziVar.X2, str);
                }
            }
            CharSequence charSequence = concat;
            if (charSequence != null) {
                if (charSequence instanceof String) {
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.k6.C2.measureText((String) charSequence));
                    this.B3 = ceil;
                    this.f30123w3 = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.k6.C2, ceil, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.C2, this.B3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else {
                    TextPaint textPaint = org.telegram.ui.ActionBar.k6.D2;
                    if (getMeasuredWidth() > 0) {
                        i3 = getMeasuredWidth();
                    } else {
                        i3 = 9999;
                    }
                    StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.f30123w3 = staticLayout;
                    if (staticLayout.getLineCount() > 0) {
                        i10 = (int) this.f30123w3.getLineWidth(0);
                    }
                    this.B3 = i10;
                }
                invalidate();
            }
        }
    }

    public final boolean U(org.telegram.messenger.zi r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.U(org.telegram.messenger.zi):boolean");
    }

    public final void U0(Canvas canvas, float f10) {
        int i3;
        if (this.E8 == 3) {
            int L = org.telegram.messenger.g0.L(32.0f);
            if (this.f29999m7 != null) {
                this.R8 -= org.telegram.messenger.g0.L(18.0f);
                L += org.telegram.messenger.g0.L(18.0f);
            }
            float f11 = this.Q8;
            float f12 = this.R8 + L;
            RectF rectF = this.f29858b4;
            rectF.set(f11, this.R8, org.telegram.messenger.g0.L(32.0f) + f11, f12);
            x();
            int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            String str = "paintChatActionBackground";
            if (i10 != 0) {
                int alpha = Z1("paintChatActionBackground").getAlpha();
                Z1("paintChatActionBackground").setAlpha((int) (alpha * f10));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Z1("paintChatActionBackground"));
                Z1("paintChatActionBackground").setAlpha(alpha);
            } else {
                float L2 = org.telegram.messenger.g0.L(16.0f);
                float L3 = org.telegram.messenger.g0.L(16.0f);
                if (this.H8) {
                    str = "paintChatActionBackgroundSelected";
                }
                canvas.drawRoundRect(rectF, L2, L3, Z1(str));
            }
            if (g2()) {
                if (i10 != 0) {
                    int alpha2 = org.telegram.ui.ActionBar.k6.f27951h2.getAlpha();
                    org.telegram.ui.ActionBar.k6.f27951h2.setAlpha((int) (alpha2 * f10));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.f27951h2);
                    org.telegram.ui.ActionBar.k6.f27951h2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.f27951h2);
                }
            }
            Drawable R0 = org.telegram.ui.ActionBar.k6.R0("drawableCommentSticker");
            if (t2()) {
                if (this.Ic == null) {
                    this.Ic = R0.getConstantState().newDrawable().mutate();
                }
                this.Ic.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ta, this.Pb), PorterDuff.Mode.SRC_IN));
                R0 = this.Ic;
            }
            z.t(R0, this.Q8 + org.telegram.messenger.g0.L(4.0f), this.R8 + org.telegram.messenger.g0.L(4.0f));
            if (i10 != 0) {
                R0.setAlpha((int) (f10 * 255.0f));
                R0.draw(canvas);
                R0.setAlpha(255);
            } else {
                R0.draw(canvas);
            }
            if (this.f29999m7 != null) {
                TextPaint textPaint = org.telegram.ui.ActionBar.k6.E2;
                if (t2()) {
                    i3 = org.telegram.ui.ActionBar.k6.Ta;
                } else {
                    i3 = org.telegram.ui.ActionBar.k6.Ld;
                }
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i3, this.Pb));
                org.telegram.ui.ActionBar.k6.E2.setAlpha((int) (f10 * 255.0f));
                x1 x1Var = this.hb;
                if (x1Var.V) {
                    if (x1Var.W != null) {
                        canvas.save();
                        org.telegram.ui.ActionBar.k6.E2.setAlpha((int) ((1.0d - x1Var.L1) * 255.0d * f10));
                        canvas.translate(this.Q8 + ((org.telegram.messenger.g0.L(32.0f) - x1Var.Y) / 2), this.R8 + org.telegram.messenger.g0.L(30.0f));
                        x1Var.W.draw(canvas);
                        canvas.restore();
                    }
                    org.telegram.ui.ActionBar.k6.E2.setAlpha((int) (x1Var.L1 * 255.0f));
                }
                canvas.save();
                canvas.translate(this.Q8 + ((org.telegram.messenger.g0.L(32.0f) - this.f30101u7) / 2), this.R8 + org.telegram.messenger.g0.L(30.0f));
                this.f29999m7.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final float U1(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.P4;
            if (i3 < arrayList.size()) {
                int i10 = ((p1) arrayList.get(i3)).f29778b;
                int i11 = this.Ta;
                float f10 = i10 + i11;
                x1 x1Var = this.hb;
                if (x1Var.f30927u2) {
                    float f11 = x1Var.L1;
                    f10 += ((1.0f - f11) * x1Var.f30930v2) + (i11 * f11);
                    if (this.P5.o5()) {
                        f10 -= this.Ta;
                    }
                }
                if (x1Var.f30936x0) {
                    f10 += x1Var.f30885k0;
                }
                return f10 - org.telegram.messenger.g0.L(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public yh.e U2() {
        return yh.e.e(this);
    }

    public final void U3() {
        int i3;
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
        if (this.Q1) {
            i3 = 10;
        } else {
            i3 = 0;
        }
        int i19 = -org.telegram.messenger.g0.L(i3 + 92);
        x1 x1Var = this.hb;
        boolean z10 = x1Var.f30936x0;
        i1 i1Var = this.C4;
        sm0 sm0Var = this.D4;
        float f11 = 10.0f;
        if (z10 && ((i14 = this.L1) == 3 || i14 == 7)) {
            int i20 = this.f29848a7;
            float f12 = i20;
            int i21 = (int) ((f12 - x1Var.f30889l0) + x1Var.m0);
            int i22 = (int) ((f12 - x1Var.f30871h0) + x1Var.f30876i0);
            if (this.f30144xb && !this.H6) {
                i22 = (int) ((getVideoTranscriptionProgress() * org.telegram.messenger.g0.L(8.0f)) + i22);
                i21 += org.telegram.messenger.g0.L(8.0f);
            }
            if (x1Var.f30889l0 == 0.0f && x1Var.m0 == 0.0f) {
                i21 = i22;
            }
            if (sm0Var != null) {
                if (x1Var.f30902o1) {
                    int L = (i22 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.Q1) {
                        f11 = 0.0f;
                    }
                    int L2 = L - org.telegram.messenger.g0.L(f11);
                    int L3 = org.telegram.messenger.g0.L(30.0f);
                    int i23 = i20 + i19;
                    if (!this.H4) {
                        i17 = -org.telegram.messenger.g0.L(34.0f);
                    } else {
                        i17 = 0;
                    }
                    int i24 = i23 + i17;
                    int i25 = i21 + i19;
                    if (this.H4) {
                        i18 = -org.telegram.messenger.g0.L(34.0f);
                    } else {
                        i18 = 0;
                    }
                    sm0Var.h(L2, L3, i24, i25 + i18);
                } else {
                    int L4 = (i22 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.Q1) {
                        f11 = 0.0f;
                    }
                    sm0Var.h(L4 - org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(30.0f), (i20 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress())), (i21 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            if (i1Var != null) {
                int useTranscribeButtonProgress = i22 - ((int) (getUseTranscribeButtonProgress() * org.telegram.messenger.g0.L(34.0f)));
                if (this.L1 == 5) {
                    i15 = 65;
                } else {
                    i15 = 72;
                }
                if (this.Q1) {
                    i16 = 20;
                } else {
                    i16 = 0;
                }
                i1Var.i(useTranscribeButtonProgress - org.telegram.messenger.g0.L(i15 + i16), org.telegram.messenger.g0.L(30.0f));
                return;
            }
            return;
        }
        if (sm0Var != null) {
            if (x1Var.f30902o1) {
                int L5 = (this.f29848a7 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress()));
                if (this.Q1) {
                    f10 = 10.0f;
                } else {
                    f10 = 0.0f;
                }
                int L6 = L5 - org.telegram.messenger.g0.L(f10);
                int L7 = org.telegram.messenger.g0.L(30.0f);
                int i26 = this.f29848a7 + i19;
                if (!this.H4) {
                    i12 = -org.telegram.messenger.g0.L(34.0f);
                } else {
                    i12 = 0;
                }
                int i27 = i26 + i12;
                if (!this.Q1) {
                    f11 = 0.0f;
                }
                int L8 = i27 - org.telegram.messenger.g0.L(f11);
                int i28 = this.f29848a7 + i19;
                if (this.H4) {
                    i13 = -org.telegram.messenger.g0.L(34.0f);
                } else {
                    i13 = 0;
                }
                sm0Var.h(L6, L7, L8, i28 + i13);
            } else {
                int L9 = (this.f29848a7 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.Q1) {
                    f11 = 0.0f;
                }
                int L10 = L9 - org.telegram.messenger.g0.L(f11);
                sm0Var.h(L10, org.telegram.messenger.g0.L(30.0f), L10, L10);
            }
        }
        if (i1Var != null) {
            int useTranscribeButtonProgress2 = this.f29848a7 - ((int) (getUseTranscribeButtonProgress() * org.telegram.messenger.g0.L(34.0f)));
            if (this.L1 == 5) {
                i10 = 65;
            } else {
                i10 = 72;
            }
            if (this.Q1) {
                i11 = 20;
            } else {
                i11 = 0;
            }
            i1Var.i(useTranscribeButtonProgress2 - org.telegram.messenger.g0.L(i10 + i11), org.telegram.messenger.g0.L(30.0f));
        }
    }

    public final boolean V(MotionEvent motionEvent) {
        int i3;
        ri riVar;
        boolean z10;
        Drawable drawable;
        Drawable drawable2;
        int L;
        int i10;
        int L2;
        int i11;
        if ((!v2() || this.P5.D == 16) && (((i3 = this.L1) != 5 && i3 != 1) || (riVar = this.M) == null || (riVar.f25149l & 4) != 0)) {
            int i12 = this.P5.D;
            if (i12 == 16) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            if (!z10) {
                if ((i3 == 1 || i12 == 12 || i3 == 5 || i3 == 4 || i3 == 2 || i12 == 8) && !this.S1 && !this.T1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                int x10 = (int) motionEvent.getX();
                int M1 = (int) M1(motionEvent);
                int action = motionEvent.getAction();
                Drawable[] drawableArr = this.I2;
                if (action == 0) {
                    zi ziVar = this.P5;
                    if (ziVar.D == 16) {
                        boolean K4 = ziVar.K4();
                        int i13 = this.R3;
                        if (x10 >= i13) {
                            if (bd.f21784a0) {
                                L = 0;
                            } else {
                                L = this.f29848a7 - org.telegram.messenger.g0.L(70.0f);
                            }
                            int i14 = i13 + L;
                            if (!K4) {
                                i10 = 2;
                            } else {
                                i10 = 0;
                            }
                            if (x10 <= org.telegram.messenger.g0.L(i10 + 30) + i14 && M1 >= this.S3 - org.telegram.messenger.g0.L(14.0f)) {
                                if (M1 <= org.telegram.messenger.g0.L(50.0f) + this.S3) {
                                    this.Y3 = true;
                                    this.K2[0] = 4;
                                    if (drawableArr[0] != null) {
                                        int i15 = this.R3;
                                        if (bd.f21784a0) {
                                            L2 = 0;
                                        } else {
                                            L2 = this.f29848a7 - org.telegram.messenger.g0.L(70.0f);
                                        }
                                        int i16 = i15 + L2;
                                        if (!K4) {
                                            i11 = 2;
                                        } else {
                                            i11 = 0;
                                        }
                                        int L3 = org.telegram.messenger.g0.L(i11) + i16;
                                        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.k6.G4;
                                        int z12 = f1.z(2, L3, drawableArr2[K4 ? 1 : 0]);
                                        int i17 = f1.i(2, this.S3, drawableArr2[K4 ? 1 : 0]);
                                        drawableArr[0].setBounds(z12 - org.telegram.messenger.g0.L(20.0f), i17 - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f) + z12, org.telegram.messenger.g0.L(20.0f) + i17);
                                        drawableArr[0].setHotspot(x10, M1);
                                        drawableArr[0].setState(this.M2);
                                    }
                                    invalidate();
                                    return true;
                                }
                            }
                        }
                    } else if (x10 >= this.R3 - org.telegram.messenger.g0.L(20.0f)) {
                        if (x10 <= org.telegram.messenger.g0.L(20.0f) + this.R3 && M1 >= this.S3 - org.telegram.messenger.g0.L(4.0f)) {
                            if (M1 <= org.telegram.messenger.g0.L(30.0f) + this.S3) {
                                this.Y3 = true;
                                invalidate();
                                return true;
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (this.Y3) {
                        if (this.P5.D == 16 && (drawable2 = drawableArr[0]) != null) {
                            drawable2.setState(StateSet.NOTHING);
                        }
                        this.Y3 = false;
                        playSoundEffect(0);
                        this.Ra.B0(this, this.R3, this.S3);
                        invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 2 && this.P5.D == 16 && this.Y3 && (drawable = drawableArr[0]) != null) {
                    drawable.setHotspot(x10, M1);
                }
            }
        }
        return false;
    }

    public final void V0(android.graphics.Canvas r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.V0(android.graphics.Canvas, float):void");
    }

    public final int V1(byte[] bArr) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.P4;
            if (i3 < arrayList.size()) {
                TLRPC.PollAnswer pollAnswer = ((p1) arrayList.get(i3)).f29793s;
                if (pollAnswer != null && Arrays.equals(pollAnswer.option, bArr)) {
                    return i3;
                }
                i3++;
            } else {
                return -1;
            }
        }
    }

    public final void V2(org.telegram.messenger.zi r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.V2(org.telegram.messenger.zi):void");
    }

    public final void V3() {
        char c2;
        int L;
        int extraTextX;
        int i3;
        int i10;
        int L2;
        int i11;
        if (getDelegate() != null && getDelegate().q2() != null && getDelegate().q2().z(this.P5)) {
            i9 q22 = getDelegate().q2();
            int i12 = 0;
            if (q22.f29389q0) {
                c2 = 2;
            } else if (q22.f29391s0) {
                c2 = 3;
            } else if (q22.f29393u0) {
                c2 = 4;
            } else if (c2()) {
                c2 = 1;
            } else {
                c2 = 0;
            }
            if (c2 == 2) {
                if (this.S1) {
                    i11 = this.f30031p0 - org.telegram.messenger.g0.L(10.0f);
                } else {
                    if (this.T1) {
                        i10 = this.f30031p0;
                        L2 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i10 = this.f30031p0;
                        L2 = org.telegram.messenger.g0.L(1.0f);
                    }
                    i11 = i10 + L2;
                }
                getDelegate().q2().c0(org.telegram.messenger.g0.L(10.0f) + i11 + this.Z1, this.X1);
            } else if (c2 == 1) {
                N3();
                getDelegate().q2().c0((int) this.f30061r3, (int) this.f30073s3);
            } else if (c2 == 3) {
                ui uiVar = this.L;
                if (uiVar != null && !uiVar.f25705i) {
                    i3 = (int) this.f30061r3;
                } else {
                    float f10 = 12.0f;
                    if (this.P5.Q3()) {
                        i3 = getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + this.M6;
                        if (this.P5.D == 19) {
                            i3 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(this.W7, this.Y7) + i3)) - org.telegram.messenger.g0.f22608q.x);
                        }
                    } else {
                        if (this.B6) {
                            L = org.telegram.messenger.g0.L(12.0f) + this.M6;
                            extraTextX = getExtraTextX();
                        } else {
                            int i13 = this.M6;
                            if (!this.K) {
                                f10 = 18.0f;
                            }
                            L = org.telegram.messenger.g0.L(f10) + i13;
                            extraTextX = getExtraTextX();
                        }
                        i3 = extraTextX + L;
                    }
                }
                int L3 = ((int) (i3 + this.hb.f30871h0)) - org.telegram.messenger.g0.L(1.33f);
                int i14 = this.f30058r0;
                N3();
                i9 q23 = getDelegate().q2();
                int L4 = org.telegram.messenger.g0.L(10.0f) + L3;
                s1 s1Var = this.f30070s0;
                if (s1Var != null) {
                    i12 = s1Var.f30322o;
                }
                q23.c0(L4 - i12, org.telegram.messenger.g0.L(22.0f) + i14);
            } else {
                getDelegate().q2().c0(this.f30018o0, this.f30094u0);
            }
        }
    }

    public final boolean W(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.W(android.view.MotionEvent):boolean");
    }

    public final void W0(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.W0(android.graphics.Canvas):void");
    }

    public final float W2() {
        float f10;
        x1 x1Var = this.hb;
        float f11 = 1.0f;
        if (x1Var.G1) {
            boolean z10 = this.f30107v1;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            return org.telegram.messenger.g0.T1(f10, f11, x1Var.L1);
        } else if (this.f30107v1) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public final void W3(int i3, int i10) {
        ArrayList arrayList;
        xi xiVar = this.f29985l3;
        x1 x1Var = this.hb;
        if (xiVar != null && (arrayList = xiVar.f26387e) != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                wi wiVar = (wi) obj;
                ArrayList arrayList2 = wiVar.f26217y;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    ((yh.f) obj2).i((i3 - wiVar.p(this.f29985l3.f26387e, x1Var)) - this.f30061r3, getWidth(), (i10 - wiVar.p(this.f29985l3.f26387e, x1Var)) - this.f30073s3);
                }
            }
        }
        StaticLayout staticLayout = this.Q7;
        if (staticLayout != null) {
            float height = (-this.U7) - staticLayout.getHeight();
            ArrayList arrayList3 = this.Sb;
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                ((yh.f) obj3).i(i3 + height, getWidth(), i10 + height);
            }
        }
        if (getMessageObject() != null && getMessageObject().f26927z2 != null) {
            ArrayList arrayList4 = getMessageObject().f26927z2;
            int size4 = arrayList4.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList4.get(i14);
                i14++;
                wi wiVar2 = (wi) obj4;
                ArrayList arrayList5 = wiVar2.f26217y;
                int size5 = arrayList5.size();
                int i15 = 0;
                while (i15 < size5) {
                    Object obj5 = arrayList5.get(i15);
                    i15++;
                    ((yh.f) obj5).i((i3 - wiVar2.p(getMessageObject().f26927z2, x1Var)) - this.f30094u0, getWidth(), (i10 - wiVar2.p(getMessageObject().f26927z2, x1Var)) - this.f30094u0);
                }
            }
        }
    }

    public final boolean X(MotionEvent motionEvent) {
        vq0 S1;
        l1 l1Var = this.Ra;
        if (l1Var == null) {
            S1 = null;
        } else {
            S1 = l1Var.S1();
        }
        vq0 vq0Var = S1;
        int i3 = 0;
        if (this.P5 != null) {
            ei.c3 c3Var = this.U0;
            if (c3Var.L() && vq0Var != null && !this.P5.u4() && !this.P5.H2() && ((!zi.M4(this.P5.f26868k) || this.G5) && !this.f30144xb && !this.P5.K2() && ((!this.P5.V2() || zi.u3(this.P5.f26868k)) && !this.P5.n5()))) {
                zi ziVar = this.P5;
                yh.e eVar = this.P9;
                if (eVar != null) {
                    Integer num = (Integer) eVar.f59504k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    i3 = num.intValue();
                }
                return vq0Var.a(motionEvent, this, c3Var, ziVar, i3);
            }
        }
        return false;
    }

    public final void X0(Canvas canvas) {
        float f10;
        q1 q1Var;
        Canvas canvas2;
        if (this.f29945hc || this.f29957ic) {
            ri riVar = this.M;
            if (riVar == null || (riVar.f25142c == 0 && riVar.f25140a == 0)) {
                int compactHeaderColor = getCompactHeaderColor();
                f29839id.setColor(compactHeaderColor);
                f29840jd.setColor(compactHeaderColor);
                float compactLeft = getCompactLeft();
                if (this.J) {
                    f10 = 9.0f;
                } else {
                    f10 = 10.0f;
                }
                float L = org.telegram.messenger.g0.L(f10);
                if (this.f29945hc) {
                    q1Var = this;
                    canvas2 = canvas;
                    q1Var.Z0(canvas2, this.f29920fc, compactLeft, L, compactHeaderColor);
                    L += org.telegram.messenger.g0.L(24.0f);
                } else {
                    q1Var = this;
                    canvas2 = canvas;
                }
                if (q1Var.f29957ic) {
                    q1Var.Z0(canvas2, q1Var.f29933gc, compactLeft, L, compactHeaderColor);
                }
            }
        }
    }

    public final int X1(int i3) {
        return org.telegram.ui.ActionBar.k6.w0(i3, this.Pb);
    }

    public final boolean X2() {
        if (t2()) {
            return false;
        }
        return Y2();
    }

    public void X3() {
        int i3;
        zi ziVar = this.P5;
        if (ziVar == null) {
            return;
        }
        float f10 = this.Uc + this.Vc;
        if (!ziVar.Q3() || this.P5.B2) {
            f10 += this.f30059r1;
        }
        if (t2()) {
            f10 += getCompactSideMenuShift();
        } else if (this.W6 && !this.P5.Q3() && this.M != null) {
            if (X2()) {
                i3 = 48;
            } else {
                i3 = 0;
            }
            f10 += org.telegram.messenger.g0.L(71 - i3) * this.Y6;
        }
        setTranslationX(f10);
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            invalidate();
            p2();
        }
    }

    public final Drawable Y1(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.e6 e6Var = this.Pb;
        if (e6Var != null) {
            drawable = e6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.k6.R0(str);
    }

    public final boolean Y2() {
        zi ziVar;
        if (!this.f29900e6 || this.f29941h6 || ((this.G6 && !this.f29975k6) || (ziVar = this.P5) == null || ziVar.Q3() || !this.P5.l5())) {
            zi ziVar2 = this.P5;
            if (ziVar2 == null || zi.B0(ziVar2.f26868k) != 489000) {
                zi ziVar3 = this.P5;
                if (ziVar3 == null || !ziVar3.f26866j2) {
                    if (ziVar3 != null && ziVar3.f26868k.guestchat_via_from != null) {
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

    public final void Y3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.Y3():void");
    }

    public final void Z() {
        th.e eVar;
        th.e eVar2;
        zi ziVar = this.P5;
        if (ziVar != null && ziVar.U3()) {
            w1 w1Var = this.f30122w2;
            if (w1Var != null && (eVar2 = w1Var.f30786n) != null) {
                eVar2.e();
            }
            w1 w1Var2 = this.f30122w2;
            if (w1Var2 != null && (eVar = w1Var2.f30785m) != null) {
                eVar.e();
            }
        }
    }

    public final void Z0(Canvas canvas, m1 m1Var, float f10, float f11, int i3) {
        int i10;
        int intrinsicWidth;
        int intrinsicHeight;
        boolean z10;
        int L = org.telegram.messenger.g0.L(16.0f);
        RectF rectF = m1Var.d;
        ImageReceiver imageReceiver = m1Var.f29615b;
        boolean z11 = m1Var.f29614a;
        float f12 = L;
        rectF.set(f10, f11, m1Var.f29621j + f10, f11 + f12);
        canvas.save();
        float a10 = m1Var.f29617e.a(0.02f);
        RectF rectF2 = m1Var.d;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.15f, i3);
        y yVar = m1Var.f29622k;
        if (yVar == null) {
            m1Var.f29623l = r12;
            y a02 = org.telegram.ui.ActionBar.k6.a0(r12, 6, 6);
            m1Var.f29622k = a02;
            a02.setCallback(this);
        } else if (m1Var.f29623l != r12) {
            m1Var.f29623l = r12;
            org.telegram.ui.ActionBar.k6.H1(yVar, r12, true);
        }
        m1Var.f29622k.setBounds((int) (rectF2.left - org.telegram.messenger.g0.L(6.0f)), (int) (rectF2.top - org.telegram.messenger.g0.L(4.0f)), (int) (rectF2.right + org.telegram.messenger.g0.L(6.0f)), (int) (rectF2.bottom + org.telegram.messenger.g0.L(4.0f)));
        m1Var.f29622k.draw(canvas);
        if (!z11) {
            l1 l1Var = this.Ra;
            if (l1Var != null && l1Var.p1(this, 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            a1(canvas, m1Var, i3, z10);
        }
        if (this.f29993lc == null) {
            this.f29993lc = getContext().getResources().getDrawable(2131232332).mutate();
        }
        if (z11) {
            i10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cd, this.Pb);
        } else {
            i10 = i3;
        }
        this.f29993lc.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        int i11 = (int) (((L - intrinsicWidth) / 2.0f) + f10);
        int i12 = (int) (((L - intrinsicHeight) / 2.0f) + f11);
        this.f29993lc.setBounds(i11, i12, this.f29993lc.getIntrinsicWidth() + i11, this.f29993lc.getIntrinsicHeight() + i12);
        canvas.save();
        if (!z11) {
            float f13 = f12 / 2.0f;
            canvas.scale(-1.0f, 1.0f, f10 + f13, f13 + f11);
        }
        this.f29993lc.draw(canvas);
        canvas.restore();
        float L2 = f10 + f12 + org.telegram.messenger.g0.L(6.0f);
        if (m1Var.f29618f != null) {
            f29839id.setColor(i10);
            Y0(canvas, m1Var.f29618f, L2, f11);
            f29839id.setColor(i3);
            L2 += org.telegram.messenger.g0.L(4.0f) + K1(m1Var.f29618f);
        }
        if (m1Var.f29620i) {
            imageReceiver.y0(L2, f11, f12, f12);
            imageReceiver.setAlpha(1.0f);
            imageReceiver.h(canvas, null);
            L2 += org.telegram.messenger.g0.L(5.0f) + L;
        }
        StaticLayout staticLayout = m1Var.f29619g;
        if (staticLayout != null) {
            if (z11) {
                staticLayout.getPaint().setColor(i0.a.k(org.telegram.ui.ActionBar.k6.r1(0.7f, i10), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28200ua, this.Pb)));
            }
            Y0(canvas, m1Var.f29619g, L2, f11);
            if (z11) {
                m1Var.f29619g.getPaint().setColor(i3);
            }
            L2 += org.telegram.messenger.g0.L(4.0f) + K1(m1Var.f29619g);
        }
        if (m1Var.h != null) {
            canvas.save();
            canvas.translate(L2 - m1Var.h.getLineLeft(0), ((L - m1Var.h.getHeight()) / 2.0f) + f11);
            if (z11) {
                m1Var.h.draw(canvas);
            } else {
                StaticLayout staticLayout2 = m1Var.h;
                AtomicReference atomicReference = this.f30004mc;
                ArrayList arrayList = this.Sb;
                yh.f.g(this, this.f30006n0, i3, -org.telegram.messenger.g0.L(2.0f), atomicReference, 0, staticLayout2, arrayList, canvas, false);
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, m1Var.h, this.Aa, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, I1(2, i3));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public Paint Z1(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.e6 e6Var = this.Pb;
        if (e6Var != null) {
            paint = e6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.k6.V0(str);
    }

    public final n70 Z2() {
        n70 n70Var;
        ArrayList arrayList = this.f30110v4;
        if (!arrayList.isEmpty()) {
            n70Var = (n70) arrayList.get(0);
            arrayList.remove(0);
        } else {
            n70Var = new n70(0);
        }
        n70Var.reset();
        this.f30124w4.add(n70Var);
        return n70Var;
    }

    public final gk0 Z3() {
        if (this.P5 != null && N2()) {
            return (gk0) this.P5.f26915w2.f22070g.get(0);
        }
        return null;
    }

    @Override
    public final boolean a() {
        ui uiVar = this.L;
        if ((uiVar == null || !uiVar.f25709m.f25534j) && getAlpha() != 1.0f) {
            return true;
        }
        return false;
    }

    public final void a0(boolean z10) {
        zi ziVar;
        boolean z11;
        zi ziVar2;
        byte[] bArr;
        w1 w1Var = this.f30122w2;
        if (w1Var != null && w1Var.f30783k != null && (ziVar = this.P5) != null && ziVar.U3()) {
            TLRPC.MessageMedia n12 = zi.n1(this.P5);
            boolean z12 = false;
            if (n12 instanceof TLRPC.TL_messageMediaPoll) {
                z11 = ((TLRPC.TL_messageMediaPoll) n12).poll.multiple_choice;
            } else {
                z11 = false;
            }
            vh.d dVar = this.f30122w2.f30783k;
            if (z11) {
                yy C = yy.C(this.Z5);
                if (this.P5 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C.f26686w.get("poll_" + ziVar2.E1());
                }
                if (bArr != null) {
                    z12 = true;
                }
            }
            qe.a aVar = dVar.f56957f;
            if (aVar.f53841f != z12) {
                aVar.a(z12, z10);
            }
        }
    }

    public final void a1(Canvas canvas, m1 m1Var, int i3, boolean z10) {
        w70 w70Var;
        w70 w70Var2;
        if (!z10 && m1Var.f29625n) {
            w70 w70Var3 = m1Var.f29624m;
            if (w70Var3 != null) {
                w70Var3.a();
            }
        } else if (z10 && !m1Var.f29625n && (w70Var = m1Var.f29624m) != null) {
            w70Var.f39926c = -1L;
            w70Var.f39925b = -1L;
        }
        m1Var.f29625n = z10;
        float[] fArr = m1Var.f29626o;
        RectF rectF = m1Var.d;
        if (!z10 && ((w70Var2 = m1Var.f29624m) == null || !w70Var2.d())) {
            w70 w70Var4 = m1Var.f29624m;
            if (w70Var4 != null) {
                w70Var4.f39925b = -1L;
                return;
            }
            return;
        }
        if (m1Var.f29624m == null) {
            w70 w70Var5 = new w70();
            m1Var.f29624m = w70Var5;
            w70Var5.D = true;
            w70Var5.f39941t = 3.5f;
            w70Var5.f39942u = 0.5f;
        }
        m1Var.f29624m.g(org.telegram.ui.ActionBar.k6.r1(0.1f, i3), org.telegram.ui.ActionBar.k6.r1(0.3f, i3), org.telegram.ui.ActionBar.k6.r1(0.3f, i3), org.telegram.ui.ActionBar.k6.r1(1.25f, i3));
        Arrays.fill(fArr, org.telegram.messenger.g0.L(6.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(rectF.left - org.telegram.messenger.g0.L(6.0f), rectF.top - org.telegram.messenger.g0.L(4.0f), rectF.right + org.telegram.messenger.g0.L(6.0f), rectF.bottom + org.telegram.messenger.g0.L(4.0f));
        m1Var.f29624m.e(rectF2);
        m1Var.f29624m.j(fArr);
        m1Var.f29624m.f39944x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        m1Var.f29624m.draw(canvas);
        invalidate();
    }

    public final float a2(float f10) {
        float f11;
        float f12;
        if (D3() && this.L1 != 7) {
            return ((getPhotoBottom() + this.f30120w0) - org.telegram.messenger.g0.L(7.3f)) - this.y9.getHeight();
        }
        int i3 = this.f29887d7;
        if (!this.G && !this.F) {
            f11 = 6.5f;
        } else {
            f11 = 7.5f;
        }
        float L = ((i3 - org.telegram.messenger.g0.L(f11)) - this.y9.getHeight()) + f10;
        boolean z10 = this.f30144xb;
        x1 x1Var = this.hb;
        if (z10 && !t2()) {
            if (this.K) {
                f12 = 4.0f;
            } else {
                f12 = 5.0f;
            }
            L -= (1.0f - getVideoTranscriptionProgress()) * (this.O.i(x1Var.L1) + org.telegram.messenger.g0.L(f12));
        }
        ui uiVar = this.L;
        if (uiVar != null) {
            ti tiVar = uiVar.f25709m;
            float f13 = L + tiVar.h;
            if (tiVar.f25534j) {
                return f13 - getTranslationY();
            }
            return f13;
        }
        return (x1Var.f30880j0 - x1Var.f30885k0) + L;
    }

    public final void a3() {
        zi ziVar = this.P5;
        if (ziVar != null && ziVar.f26927z2 != null) {
            for (int i3 = 0; i3 < this.P5.f26927z2.size(); i3++) {
                wi wiVar = (wi) this.P5.f26927z2.get(i3);
                y yVar = wiVar.T;
                if (yVar != null) {
                    yVar.setCallback(this);
                    wiVar.T.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.f29985l3 != null) {
            for (int i10 = 0; i10 < this.f29985l3.f26387e.size(); i10++) {
                wi wiVar2 = (wi) this.f29985l3.f26387e.get(i10);
                y yVar2 = wiVar2.T;
                if (yVar2 != null) {
                    yVar2.setCallback(this);
                    wiVar2.T.setState(StateSet.NOTHING);
                }
            }
        }
        if (t2()) {
            invalidate();
        }
    }

    public final boolean a4() {
        if (this.P5 != null && N2() && !t2()) {
            if ((TextUtils.isEmpty(this.P5.f26924z) || this.f30107v1) && this.O.f9125p) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b(boolean z10, boolean z11) {
        this.xa = z10;
        if (z10) {
            this.f30156ya = z11;
        } else {
            this.f30156ya = false;
        }
    }

    public final boolean b0(MotionEvent motionEvent) {
        m1 m1Var;
        m1 m1Var2;
        m1 m1Var3;
        m1 m1Var4;
        l1 l1Var;
        int i3;
        q1 q1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (!this.f29945hc && !this.f29957ic) {
            if (this.P7 != null && (l1Var = this.Ra) != null && l1Var.m0()) {
                float x10 = motionEvent.getX();
                float M1 = M1(motionEvent);
                if (this.P5.Q5()) {
                    i3 = Math.max(this.W7, this.Y7) + this.T7;
                } else {
                    i3 = this.N6 + this.T7;
                }
                if (motionEvent.getAction() == 0) {
                    if (x10 >= this.T7 && x10 <= i3) {
                        float f10 = this.U7;
                        if (M1 >= f10 && M1 <= f10 + this.V7) {
                            this.f29888d8 = true;
                            getParent().requestDisallowInterceptTouchEvent(false);
                            this.f29942h8 = x10;
                            this.f29953i8 = getY() + M1;
                            y yVar = this.Ja;
                            if (yVar != null) {
                                yVar.setHotspot(x10, M1);
                                this.f29902e8 = false;
                                this.f29916f8 = true;
                                postDelayed(new c1(this, 3), ViewConfiguration.getTapTimeout() / 6);
                                invalidate();
                            }
                            gc gcVar = this.Ea;
                            if (gcVar != null) {
                                gcVar.c(true);
                                this.Ha = x10;
                                this.Ia = M1;
                            }
                            u();
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1) {
                        if (this.f29888d8) {
                            n();
                            this.f29888d8 = false;
                            y yVar2 = this.Ja;
                            if (yVar2 != null) {
                                if (!this.f29902e8) {
                                    yVar2.setState(new int[]{16842919, 16842910});
                                    post(new c1(this, 4));
                                } else {
                                    yVar2.setState(new int[0]);
                                }
                                this.f29902e8 = false;
                                this.f29916f8 = false;
                                invalidate();
                            }
                            gc gcVar2 = this.Ea;
                            if (gcVar2 != null) {
                                gcVar2.c(false);
                            }
                            playSoundEffect(0);
                            if (this.f30130wa) {
                                l1 l1Var2 = this.Ra;
                                if (l1Var2 != null) {
                                    TLRPC.Chat chat = this.f30092ta;
                                    if (chat != null) {
                                        l1Var2.U(this, chat, this.P5.f26868k.fwd_from.channel_post, this.f29936h1, this.f29947i1, false);
                                        q1Var = this;
                                    } else {
                                        q1Var = this;
                                        TLRPC.User user = q1Var.f30066ra;
                                        if (user != null) {
                                            l1Var2.s0(this, user, q1Var.f29936h1, q1Var.f29947i1);
                                        } else if (q1Var.f30104ua != null) {
                                            l1Var2.p(this);
                                        }
                                    }
                                }
                            } else {
                                q1Var = this;
                                if (q1Var.Ra != null && (q1Var.P5.C2() || q1Var.P5.g4() || q1Var.L7 || ((message = q1Var.P5.f26868k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                                    q1Var.Ra.W1(q1Var, q1Var.P5.O1(), x10, M1, false);
                                }
                            }
                        }
                    } else {
                        q1Var = this;
                        if (motionEvent.getAction() == 3) {
                            q1Var.f29888d8 = false;
                            q1Var.f29902e8 = false;
                            y yVar3 = q1Var.Ja;
                            if (yVar3 != null) {
                                yVar3.setState(new int[0]);
                            }
                            invalidate();
                            gc gcVar3 = q1Var.Ea;
                            if (gcVar3 != null) {
                                gcVar3.c(false);
                            }
                        } else if (motionEvent.getAction() == 2) {
                            if (x10 >= q1Var.T7 && x10 <= i3) {
                                float f11 = q1Var.U7;
                                if (M1 >= f11 && M1 <= f11 + q1Var.V7) {
                                    if (q1Var.Ja != null && q1Var.f29916f8) {
                                        if (Math.sqrt(Math.pow((getY() + M1) - q1Var.f29953i8, 2.0d) + Math.pow(x10 - q1Var.f29942h8, 2.0d)) > 0.75d) {
                                            q1Var.f29916f8 = false;
                                        }
                                    }
                                }
                            }
                            q1Var.f29888d8 = false;
                            q1Var.f29902e8 = false;
                            q1Var.f29916f8 = false;
                            y yVar4 = q1Var.Ja;
                            if (yVar4 != null) {
                                yVar4.setState(new int[0]);
                            }
                            invalidate();
                            gc gcVar4 = q1Var.Ea;
                            if (gcVar4 != null) {
                                gcVar4.c(false);
                            }
                        }
                    }
                    return q1Var.f29888d8;
                }
                q1Var = this;
                return q1Var.f29888d8;
            }
        } else {
            float x11 = motionEvent.getX();
            float M12 = M1(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                if (this.Ra != null) {
                    if (this.f29945hc && (m1Var4 = this.f29920fc) != null && B2(m1Var4, x11, M12)) {
                        m1Var2 = this.f29920fc;
                    } else if (this.f29957ic && (m1Var3 = this.f29933gc) != null && B2(m1Var3, x11, M12)) {
                        m1Var2 = this.f29933gc;
                    } else {
                        m1Var2 = null;
                    }
                    if (m1Var2 != null && (m1Var2.f29614a || this.Ra.m0())) {
                        this.f29981kc = m1Var2;
                        m1Var2.f29617e.c(true);
                        y yVar5 = m1Var2.f29622k;
                        if (yVar5 != null) {
                            yVar5.setHotspot(x11, M12);
                            m1Var2.f29622k.setState(new int[]{16842919, 16842910});
                        }
                        invalidate();
                        u();
                        return true;
                    }
                }
            } else if (action == 1) {
                m1 m1Var5 = this.f29981kc;
                if (m1Var5 != null) {
                    n();
                    b3();
                    playSoundEffect(0);
                    if (m1Var5.f29614a) {
                        TLRPC.Chat chat2 = this.f30092ta;
                        if (chat2 != null) {
                            this.Ra.U(this, chat2, this.P5.f26868k.fwd_from.channel_post, this.f29936h1, this.f29947i1, false);
                            return true;
                        }
                        TLRPC.User user2 = this.f30066ra;
                        if (user2 != null) {
                            this.Ra.s0(this, user2, this.f29936h1, this.f29947i1);
                            return true;
                        }
                        this.Ra.p(this);
                        return true;
                    }
                    this.Ra.W1(this, this.P5.O1(), x11, M12, false);
                    return true;
                }
            } else {
                if (action == 3) {
                    b3();
                } else if (action == 2 && (m1Var = this.f29981kc) != null && !B2(m1Var, x11, M12)) {
                    n();
                    b3();
                }
                if (this.f29981kc != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b1(Canvas canvas, float f10) {
        xi xiVar;
        dh.o0 o0Var;
        Paint paint;
        m1 m1Var;
        m1 m1Var2;
        if (t2() && this.P5 != null && f10 > 0.0f) {
            if (this.f29867bd == null) {
                this.f29867bd = new Paint(1);
            }
            float compactLeft = getCompactLeft();
            ArrayList arrayList = this.P5.f26927z2;
            if (arrayList != null && !arrayList.isEmpty()) {
                compactLeft = Math.max(compactLeft, this.f30018o0 + this.P5.f26904t2);
            }
            if (this.f29985l3 != null) {
                compactLeft = Math.max(compactLeft, this.f30061r3 + xiVar.f26386c);
            }
            if (this.N1) {
                ei.c3 c3Var = this.U0;
                if (c3Var.R0) {
                    compactLeft = Math.max(compactLeft, c3Var.y());
                }
            }
            if (this.f29967j9 && this.U8 != null) {
                compactLeft = Math.max(compactLeft, getCompactLeft() + this.f29903e9);
            }
            if (this.f29945hc && (m1Var2 = this.f29920fc) != null) {
                compactLeft = Math.max(compactLeft, m1Var2.d.right);
            }
            if (this.f29957ic && (m1Var = this.f29933gc) != null) {
                compactLeft = Math.max(compactLeft, m1Var.d.right);
            }
            if (!this.O.f9125p) {
                compactLeft = Math.max(compactLeft, o0Var.f9113b + o0Var.f9124o);
            }
            if (this.P5.D != 0 && !this.N1) {
                compactLeft = Math.max(compactLeft, getBackgroundDrawableRight() - org.telegram.messenger.g0.L(10.0f));
            }
            if (this.y9 != null) {
                compactLeft = Math.max(compactLeft, this.B9 + this.f30167z9);
            }
            float L = org.telegram.messenger.g0.L(8.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(L, org.telegram.messenger.g0.L(2.0f) + getPaddingTop(), Math.min(compactLeft + L, getMeasuredWidth() - L), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
            this.f29867bd.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28200ua, this.Pb));
            this.f29867bd.setAlpha((int) (paint.getAlpha() * f10));
            float L2 = org.telegram.messenger.g0.L(az.Y0);
            canvas.drawRoundRect(rectF, L2, L2, this.f29867bd);
        }
    }

    public final int b2(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P4;
            if (i10 < arrayList.size()) {
                TLRPC.TodoItem todoItem = ((p1) arrayList.get(i10)).f29794t;
                if (todoItem != null && todoItem.f27148id == i3) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void b3() {
        m1 m1Var = this.f29981kc;
        if (m1Var != null) {
            y yVar = m1Var.f29622k;
            if (yVar != null) {
                yVar.setState(StateSet.NOTHING);
            }
            this.f29981kc.f29617e.c(false);
            this.f29981kc = null;
            invalidate();
        }
    }

    @Override
    public final void c(float f10) {
        zi ziVar = this.P5;
        if (ziVar == null) {
            return;
        }
        ziVar.f26828b0 = f10;
        MediaController.B().i0(this.P5, f10);
        Q3();
    }

    public final boolean c0(MotionEvent motionEvent) {
        zi ziVar = this.P5;
        if (ziVar == null || ziVar.f26915w2 == null || ziVar.D != 36) {
            return false;
        }
        float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.f29946i0 + this.f30094u0;
        motionEvent.offsetLocation(-this.f30018o0, -topicSeparatorTopPadding);
        cv cvVar = this.P5.f26915w2;
        l1 l1Var = this.Ra;
        cvVar.E = this;
        cvVar.F = l1Var;
        boolean M = cvVar.M(motionEvent);
        motionEvent.offsetLocation(this.f30018o0, topicSeparatorTopPadding);
        return M;
    }

    public final void c1(android.graphics.Canvas r50, boolean r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.c1(android.graphics.Canvas, boolean):void");
    }

    public final boolean c2() {
        if (this.f29985l3 != null) {
            return true;
        }
        return false;
    }

    public final void c3() {
        r1 r1Var = this.f30108v2;
        if (r1Var != null) {
            r1Var.h = false;
        }
        gc gcVar = this.Fa;
        if (gcVar != null) {
            gcVar.c(false);
        }
        Drawable drawable = this.I2[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        r1 r1Var2 = this.f30108v2;
        if (r1Var2 != null && r1Var2.f30259g != null) {
            for (int i3 = 0; i3 < this.f30108v2.f30259g.size(); i3++) {
                n1 n1Var = (n1) this.f30108v2.f30259g.get(i3);
                gc gcVar2 = n1Var.f29657f;
                if (gcVar2 != null) {
                    gcVar2.c(false);
                }
                y yVar = n1Var.f29658g;
                if (yVar != null) {
                    yVar.setState(StateSet.NOTHING);
                }
            }
        }
    }

    @Override
    public final void computeScroll() {
        super.computeScroll();
        l0 l0Var = this.f30119w;
        if (l0Var != null) {
            l0Var.b();
        }
    }

    @Override
    public final void d(float f10) {
        zi ziVar = this.P5;
        if (ziVar == null) {
            return;
        }
        ziVar.f26828b0 = f10;
        ziVar.f26851g0 = (int) (ziVar.L0() * f10);
        Q3();
    }

    public final boolean d0(int i3, MotionEvent motionEvent) {
        int i10;
        yh.f fVar;
        int i11;
        int i12;
        xi xiVar;
        xi xiVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        ui uiVar;
        if (i3 > 15 || getParent() == null) {
            return false;
        }
        boolean z10 = true;
        if (this.P5.A2() && (uiVar = this.L) != null && !uiVar.f25705i) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                View childAt = viewGroup.getChildAt(i17);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    ui currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    ri currentPosition = q1Var.getCurrentPosition();
                    if (currentMessagesGroup != null && currentMessagesGroup.f25699a == this.L.f25699a) {
                        int i18 = currentPosition.f25149l;
                        if ((i18 & 8) != 0 && (i18 & 1) != 0 && q1Var != this) {
                            motionEvent.offsetLocation(getLeft() - q1Var.getLeft(), getTop() - q1Var.getTop());
                            boolean d02 = q1Var.d0(i3 + 1, motionEvent);
                            motionEvent.offsetLocation(-(getLeft() - q1Var.getLeft()), -(getTop() - q1Var.getTop()));
                            return d02;
                        }
                    }
                }
            }
        }
        if (this.O5) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        int M1 = (int) M1(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        x1 x1Var = this.hb;
        if (actionMasked == 0) {
            int i19 = this.f30018o0;
            if (x10 >= i19 && M1 >= (i15 = this.f30094u0)) {
                zi ziVar = this.P5;
                if (x10 <= i19 + ziVar.f26904t2 && M1 <= ziVar.X5(x1Var) + i15) {
                    ArrayList arrayList = this.P5.f26927z2;
                    for (int i20 = 0; i20 < arrayList.size() && ((wi) arrayList.get(i20)).p(this.P5.f26927z2, x1Var) <= M1; i20++) {
                        wi wiVar = (wi) arrayList.get(i20);
                        if (wiVar.l()) {
                            i16 = (int) this.P5.f26911v2;
                        } else {
                            i16 = 0;
                        }
                        ArrayList arrayList2 = wiVar.f26217y;
                        int size = arrayList2.size();
                        int i21 = 0;
                        while (i21 < size) {
                            Object obj = arrayList2.get(i21);
                            i21++;
                            yh.f fVar2 = (yh.f) obj;
                            boolean z11 = z10;
                            if (fVar2.getBounds().contains((x10 - this.f30018o0) + i16, (int) ((M1 - this.f30094u0) - wiVar.p(this.P5.f26927z2, x1Var)))) {
                                this.N5 = fVar2;
                                return z11;
                            }
                            z10 = z11;
                        }
                    }
                }
            }
            boolean z12 = z10;
            if (this.f29985l3 != null) {
                float f10 = x10;
                float f11 = this.f30061r3;
                if (f10 >= f11) {
                    float f12 = M1;
                    float f13 = this.f30073s3;
                    if (f12 >= f13 && f10 <= f11 + xiVar.f26386c && f12 <= f13 + xiVar.c(x1Var)) {
                        ArrayList arrayList3 = this.f29985l3.f26387e;
                        for (int i22 = 0; i22 < arrayList3.size() && ((wi) arrayList3.get(i22)).p(this.f29985l3.f26387e, x1Var) <= f12; i22++) {
                            wi wiVar2 = (wi) arrayList3.get(i22);
                            if (wiVar2.l()) {
                                i14 = (int) this.f29985l3.d;
                            } else {
                                i14 = 0;
                            }
                            ArrayList arrayList4 = wiVar2.f26217y;
                            int size2 = arrayList4.size();
                            int i23 = 0;
                            while (i23 < size2) {
                                Object obj2 = arrayList4.get(i23);
                                i23++;
                                yh.f fVar3 = (yh.f) obj2;
                                ArrayList arrayList5 = arrayList3;
                                float f14 = f10;
                                if (fVar3.getBounds().contains((int) ((f10 - this.f30061r3) + i14), (int) ((f12 - this.f30073s3) - wiVar2.p(this.f29985l3.f26387e, x1Var)))) {
                                    this.N5 = fVar3;
                                    return z12;
                                }
                                arrayList3 = arrayList5;
                                f10 = f14;
                            }
                        }
                    }
                }
            }
            if (this.f30034p3 == null) {
                return false;
            }
            float f15 = x10;
            float f16 = this.f30087t5;
            if (f15 < f16) {
                return false;
            }
            float f17 = M1;
            float f18 = this.f30099u5;
            if (f17 <= f18 || f15 > f16 + xiVar2.f26386c || f17 > f18 + xiVar2.c(x1Var)) {
                return false;
            }
            ArrayList arrayList6 = this.f30034p3.f26387e;
            for (int i24 = 0; i24 < arrayList6.size() && ((wi) arrayList6.get(i24)).p(this.f30034p3.f26387e, x1Var) <= f17; i24++) {
                wi wiVar3 = (wi) arrayList6.get(i24);
                if (wiVar3.l()) {
                    i13 = (int) this.f30034p3.d;
                } else {
                    i13 = 0;
                }
                ArrayList arrayList7 = wiVar3.f26217y;
                int size3 = arrayList7.size();
                int i25 = 0;
                while (i25 < size3) {
                    Object obj3 = arrayList7.get(i25);
                    i25++;
                    yh.f fVar4 = (yh.f) obj3;
                    if (fVar4.getBounds().contains((int) ((f15 - this.f30087t5) + i13), (int) ((f17 - this.f30099u5) - wiVar3.p(this.f30034p3.f26387e, x1Var)))) {
                        this.N5 = fVar4;
                        return z12;
                    }
                }
            }
            return false;
        } else if (actionMasked != 1 || this.N5 == null) {
            return false;
        } else {
            playSoundEffect(0);
            Path path = this.Ub;
            path.rewind();
            xi xiVar3 = this.f30034p3;
            if (xiVar3 != null) {
                ArrayList arrayList8 = xiVar3.f26387e;
                int size4 = arrayList8.size();
                int i26 = 0;
                while (i26 < size4) {
                    Object obj4 = arrayList8.get(i26);
                    i26++;
                    wi wiVar4 = (wi) obj4;
                    ArrayList arrayList9 = wiVar4.f26217y;
                    int size5 = arrayList9.size();
                    int i27 = 0;
                    while (i27 < size5) {
                        int i28 = i27 + 1;
                        Rect bounds = ((yh.f) arrayList9.get(i27)).getBounds();
                        path.addRect(bounds.left, wiVar4.p(this.f30034p3.f26387e, x1Var) + bounds.top, bounds.right, wiVar4.p(this.f30034p3.f26387e, x1Var) + bounds.bottom, Path.Direction.CW);
                        i27 = i28;
                    }
                }
            }
            xi xiVar4 = this.f29985l3;
            if (xiVar4 != null) {
                ArrayList arrayList10 = xiVar4.f26387e;
                int size6 = arrayList10.size();
                int i29 = 0;
                while (i29 < size6) {
                    Object obj5 = arrayList10.get(i29);
                    i29++;
                    wi wiVar5 = (wi) obj5;
                    ArrayList arrayList11 = wiVar5.f26217y;
                    int size7 = arrayList11.size();
                    int i30 = 0;
                    while (i30 < size7) {
                        int i31 = i30 + 1;
                        Rect bounds2 = ((yh.f) arrayList11.get(i30)).getBounds();
                        path.addRect(bounds2.left, wiVar5.p(this.f29985l3.f26387e, x1Var) + bounds2.top, bounds2.right, wiVar5.p(this.f29985l3.f26387e, x1Var) + bounds2.bottom, Path.Direction.CW);
                        i30 = i31;
                    }
                }
            } else {
                ArrayList arrayList12 = this.P5.f26927z2;
                if (arrayList12 != null) {
                    int size8 = arrayList12.size();
                    int i32 = 0;
                    while (i32 < size8) {
                        Object obj6 = arrayList12.get(i32);
                        i32++;
                        wi wiVar6 = (wi) obj6;
                        ArrayList arrayList13 = wiVar6.f26217y;
                        int size9 = arrayList13.size();
                        int i33 = 0;
                        while (i33 < size9) {
                            int i34 = i33 + 1;
                            Rect bounds3 = ((yh.f) arrayList13.get(i33)).getBounds();
                            path.addRect(bounds3.left, wiVar6.p(this.P5.f26927z2, x1Var) + bounds3.top, bounds3.right, wiVar6.p(this.P5.f26927z2, x1Var) + bounds3.bottom, Path.Direction.CW);
                            i33 = i34;
                        }
                    }
                }
            }
            RectF rectF = this.f29858b4;
            path.computeBounds(rectF, false);
            float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
            this.O5 = true;
            this.N5.f59521q = new c1(this, 8);
            xi xiVar5 = this.f30034p3;
            if (xiVar5 != null) {
                ArrayList arrayList14 = xiVar5.f26387e;
                int size10 = arrayList14.size();
                int i35 = 0;
                while (i35 < size10) {
                    Object obj7 = arrayList14.get(i35);
                    i35++;
                    wi wiVar7 = (wi) obj7;
                    if (wiVar7.l()) {
                        i12 = (int) this.f30034p3.d;
                    } else {
                        i12 = 0;
                    }
                    ArrayList arrayList15 = wiVar7.f26217y;
                    int size11 = arrayList15.size();
                    int i36 = 0;
                    while (i36 < size11) {
                        Object obj8 = arrayList15.get(i36);
                        i36++;
                        ((yh.f) obj8).j((x10 - this.f30087t5) + i12, (M1 - wiVar7.p(this.f30034p3.f26387e, x1Var)) - this.f30099u5, sqrt, false);
                        arrayList14 = arrayList14;
                    }
                }
            }
            xi xiVar6 = this.f29985l3;
            if (xiVar6 != null) {
                ArrayList arrayList16 = xiVar6.f26387e;
                int size12 = arrayList16.size();
                int i37 = 0;
                while (i37 < size12) {
                    Object obj9 = arrayList16.get(i37);
                    i37++;
                    wi wiVar8 = (wi) obj9;
                    if (wiVar8.l()) {
                        i11 = (int) this.f29985l3.d;
                    } else {
                        i11 = 0;
                    }
                    ArrayList arrayList17 = wiVar8.f26217y;
                    int size13 = arrayList17.size();
                    int i38 = 0;
                    while (i38 < size13) {
                        Object obj10 = arrayList17.get(i38);
                        i38++;
                        ((yh.f) obj10).j((x10 - this.f30061r3) + i11, (M1 - wiVar8.p(this.f29985l3.f26387e, x1Var)) - this.f30073s3, sqrt, false);
                        x10 = x10;
                    }
                }
            } else {
                ArrayList arrayList18 = this.P5.f26927z2;
                if (arrayList18 != null) {
                    int size14 = arrayList18.size();
                    int i39 = 0;
                    while (i39 < size14) {
                        Object obj11 = arrayList18.get(i39);
                        i39++;
                        wi wiVar9 = (wi) obj11;
                        if (wiVar9.l()) {
                            i10 = (int) this.P5.f26911v2;
                        } else {
                            i10 = 0;
                        }
                        ArrayList arrayList19 = wiVar9.f26217y;
                        int size15 = arrayList19.size();
                        int i40 = 0;
                        while (i40 < size15) {
                            Object obj12 = arrayList19.get(i40);
                            i40++;
                            ((yh.f) obj12).j((x10 - this.f30018o0) + i10, (M1 - wiVar9.p(this.P5.f26927z2, x1Var)) - this.f30094u0, sqrt, false);
                        }
                    }
                }
            }
            if (getParent() instanceof tj0) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                for (int i41 = 0; i41 < viewGroup2.getChildCount(); i41++) {
                    View childAt2 = viewGroup2.getChildAt(i41);
                    if (childAt2 instanceof q1) {
                        q1 q1Var2 = (q1) childAt2;
                        ArrayList arrayList20 = q1Var2.Sb;
                        if (q1Var2.getMessageObject() != null && q1Var2.getMessageObject().O1() == getMessageObject().f1() && !arrayList20.isEmpty()) {
                            ((yh.f) arrayList20.get(0)).f59521q = new ea(6, this, q1Var2);
                            int size16 = arrayList20.size();
                            int i42 = 0;
                            while (i42 < size16) {
                                Object obj13 = arrayList20.get(i42);
                                i42++;
                                ((yh.f) obj13).j(fVar.getBounds().centerX(), fVar.getBounds().centerY(), sqrt, false);
                            }
                        }
                    }
                }
            }
            this.N5 = null;
            return true;
        }
    }

    public final void d1(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.d1(android.graphics.Canvas):void");
    }

    public final boolean d2() {
        return this.f30127w7;
    }

    public final void d3(int i3) {
        m2.p0 p0Var;
        m2.p0 p0Var2 = this.f30086t4;
        if (i3 != -1) {
            Integer valueOf = Integer.valueOf(i3);
            for (int i10 = 0; i10 < p0Var2.f18959a; i10++) {
                if (((Pair) ((ArrayList) p0Var2.f18962e).get(i10)).second == valueOf) {
                    p0Var2.l(i10);
                }
            }
        } else {
            p0Var2.f(true);
        }
        s1 s1Var = this.f30070s0;
        if (s1Var != null && (p0Var = s1Var.f30316i) != null) {
            p0Var.f(true);
        }
        this.f30035p4 = null;
        s1 s1Var2 = this.f30070s0;
        if (s1Var2 != null) {
            s1Var2.f30317j = null;
        }
        if (this.f30048q4 != null) {
            if (this.f30098u4 == i3 || i3 == -1) {
                this.f30048q4 = null;
                this.f30098u4 = -1;
                this.cc = false;
                this.f29892dc = false;
                invalidate();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        zi ziVar;
        if (i3 == hs.m1) {
            setSpoilersSuppressed(false);
        } else if (i3 == hs.f23260l1) {
            setSpoilersSuppressed(true);
        } else if (i3 == hs.E0) {
            TLRPC.User user = this.f29955ia;
            if (user != null && user.f27150id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.P5);
            }
        } else if (i3 == hs.f23246i4) {
            invalidate();
        } else if (i3 == hs.W2 && (ziVar = this.P5) != null) {
            TLRPC.MessageMedia messageMedia = ziVar.f26868k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
                u3(ziVar, this.L, this.G, this.F, this.H, false);
            }
        }
    }

    @Override
    public final void e(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        l1 l1Var = this.Ra;
        if (l1Var != null) {
            l1Var.i2(this, reactionCount, z10, f10, f11);
        }
    }

    public final void e0() {
        int i3;
        zi ziVar = this.P5;
        if (ziVar != null) {
            TLRPC.MessageMedia o12 = zi.o1(ziVar.f26868k);
            if ((o12 instanceof TLRPC.TL_messageMediaDice) && ((TLRPC.TL_messageMediaDice) o12).game_outcome != null && !this.R) {
                Drawable t10 = this.U0.t();
                if (t10 instanceof ah0) {
                    ah0 ah0Var = (ah0) t10;
                    if ((ah0Var.f32736n0 != null || ah0Var.Z0) && !this.R && (i3 = ah0Var.K) != 1 && i3 == 2) {
                        if (!ah0Var.Y0) {
                            float t11 = ah0Var.t();
                            if (ah0Var.V0 != null) {
                                t11 = ah0Var.f32721b0 / ah0Var.f31847b1;
                            }
                            if (t11 <= 0.95f) {
                                return;
                            }
                        }
                        this.R = true;
                        l1 l1Var = this.Ra;
                        if (l1Var != null) {
                            l1Var.u1(this, false);
                        }
                    }
                }
            }
        }
    }

    public final void e1(Canvas canvas, float f10) {
        if (!this.P5.s4() && !this.P5.H4() && !this.Q1 && !this.S1 && !this.T1) {
            return;
        }
        D1().a(canvas, f10);
    }

    public final boolean e2() {
        if (t2() && Y2()) {
            return true;
        }
        return false;
    }

    public final void e3() {
        if (this.f30009n3 != null) {
            this.f30009n3 = null;
        }
        ArrayList arrayList = this.f30124w4;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f30110v4.addAll(arrayList);
        arrayList.clear();
    }

    public final boolean f0(MotionEvent motionEvent) {
        if (!this.f30065r8 || this.f30114v8 == null || this.Ga == null || this.Ra == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float M1 = M1(motionEvent);
        int action = motionEvent.getAction();
        RectF rectF = this.Ma;
        if (action == 0) {
            if (rectF.contains(x10, M1)) {
                this.Ga.c(true);
                y yVar = this.f30102u8;
                if (yVar != null) {
                    yVar.setHotspot(x10, M1);
                    this.f30102u8.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.Ga.f34049i && !rectF.contains(x10, M1)) {
                this.Ga.c(false);
                y yVar2 = this.f30102u8;
                if (yVar2 != null) {
                    yVar2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Ga.f34049i) {
                this.Ra.G0(this);
            }
            this.Ga.c(false);
            y yVar3 = this.f30102u8;
            if (yVar3 != null) {
                yVar3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.Ga.c(false);
            y yVar4 = this.f30102u8;
            if (yVar4 != null) {
                yVar4.setState(new int[0]);
            }
        }
        return this.Ga.f34049i;
    }

    public final void f1(float r43, float r44, android.graphics.Canvas r45, java.util.ArrayList r46, float r47, boolean r48, float r49, boolean r50, boolean r51, boolean r52, boolean r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.f1(float, float, android.graphics.Canvas, java.util.ArrayList, float, boolean, float, boolean, boolean, boolean, boolean):void");
    }

    public final boolean f2() {
        s1 s1Var = this.f30070s0;
        if (s1Var != null && s1Var.f30311b) {
            return true;
        }
        return false;
    }

    public final void f3() {
        CharSequence charSequence;
        long j10;
        long j11;
        long j12;
        long j13;
        c1 c1Var = this.Xb;
        org.telegram.ui.Components.i9 i9Var = this.f30133x;
        i9Var.p(c1Var);
        c1 c1Var2 = this.Yb;
        i9Var.p(c1Var2);
        zi ziVar = this.P5;
        if (ziVar != null) {
            if (!TextUtils.isEmpty(ziVar.f26924z)) {
                charSequence = this.P5.f26924z;
            } else {
                charSequence = this.P5.v;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i3 = vz.f39826e;
                int i10 = 0;
                ArrayList arrayList = null;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    vz[] vzVarArr = (vz[]) spanned.getSpans(0, spanned.length(), vz.class);
                    for (vz vzVar : vzVarArr) {
                        if (vzVar.f39828b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(vzVarArr.length);
                            }
                            arrayList.add(Integer.valueOf(vzVar.f39828b.date));
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
                        i9Var.p(c1Var2);
                        j50 j50Var = new j50(6, i9Var, c1Var2);
                        ((HashMap) i9Var.f34636b).put(c1Var2, j50Var);
                        if (j17 > 0) {
                            org.telegram.messenger.g0.i3(j50Var, j17);
                        } else {
                            org.telegram.messenger.g0.h3(j50Var);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void g(RectF rectF) {
        RectF rectF2 = this.Xc;
        if (rectF2 != null) {
            rectF.set(rectF2);
        } else {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public final boolean g0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.g0(android.view.MotionEvent):boolean");
    }

    public final void g1(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i3;
        int i10;
        Canvas canvas2;
        zi ziVar = this.P5;
        if (ziVar != null && !ziVar.s4()) {
            float f13 = this.f30094u0;
            x1 x1Var = this.hb;
            if (x1Var.f30894m2) {
                float f14 = x1Var.f30903o2;
                float f15 = x1Var.L1;
                f10 = (f15 * f13) + ((1.0f - f15) * f14);
            } else {
                f10 = f13;
            }
            if (x1Var.L1 != 1.0f && x1Var.H0) {
                canvas.save();
                org.telegram.ui.ActionBar.t4 t4Var = this.K6;
                if (t4Var != null) {
                    Rect bounds = t4Var.getBounds();
                    if (this.P5.Q3() && !this.B6 && !this.G) {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(10.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    } else {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(4.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    }
                }
                ng0 ng0Var = this.yc;
                if (ng0Var != null && ng0Var.h) {
                    zi ziVar2 = this.P5;
                    f1(this.f30018o0, f10, canvas, ziVar2.f26927z2, ziVar2.f26911v2, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    f1(this.f30018o0, f10, canvas, x1Var.I0, x1Var.O0, false, 1.0f - x1Var.L1, true, false, false, false);
                    zi ziVar3 = this.P5;
                    f1(this.f30018o0, f10, canvas, ziVar3.f26927z2, ziVar3.f26911v2, true, x1Var.L1, true, false, false, false);
                    canvas2 = canvas;
                }
                canvas2.restore();
                return;
            }
            float f16 = f10;
            boolean z10 = x1Var.E1;
            if (z10 && this.K6 != null) {
                if (z10) {
                    int i11 = -1;
                    if (this.f30095u1) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                    float y9 = com.google.android.recaptcha.internal.a.y(1.0f, x1Var.L1, this.P5.X5(x1Var) * i10, f13);
                    float f17 = x1Var.f30903o2;
                    if (this.f30095u1) {
                        i11 = 1;
                    }
                    f11 = f17 - ((this.P5.X5(x1Var) * i11) * x1Var.L1);
                    f12 = y9;
                } else {
                    f11 = f16;
                    f12 = f11;
                }
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(this.K6.getBounds());
                if (this.P5.Q3() && !this.B6 && !this.G) {
                    rectF.left += org.telegram.messenger.g0.L(4.0f);
                    rectF.right -= org.telegram.messenger.g0.L(10.0f);
                } else {
                    rectF.left += org.telegram.messenger.g0.L(4.0f);
                    rectF.right -= org.telegram.messenger.g0.L(4.0f);
                }
                float f18 = rectF.left;
                float f19 = x1Var.f30903o2;
                canvas.clipRect(f18, f19, rectF.right, this.P5.X5(x1Var) + f19 + org.telegram.messenger.g0.L(4.0f));
                zi ziVar4 = this.P5;
                f1(this.f30018o0, f11, canvas, ziVar4.f26927z2, ziVar4.f26911v2, false, 1.0f - x1Var.L1, true, false, false, false);
                canvas.restore();
                canvas.save();
                rectF.set(this.K6.getBounds());
                if (this.P5.Q3() && !this.B6 && !this.G) {
                    rectF.left += org.telegram.messenger.g0.L(4.0f);
                    rectF.right -= org.telegram.messenger.g0.L(10.0f);
                } else {
                    rectF.left += org.telegram.messenger.g0.L(4.0f);
                    rectF.right -= org.telegram.messenger.g0.L(4.0f);
                }
                canvas.clipRect(rectF.left, this.f30094u0, rectF.right, org.telegram.messenger.g0.L(4.0f) + this.P5.X5(x1Var) + i3);
                zi ziVar5 = this.P5;
                f1(this.f30018o0, f12, canvas, ziVar5.f26927z2, ziVar5.f26911v2, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            zi ziVar6 = this.P5;
            f1(this.f30018o0, f16, canvas, ziVar6.f26927z2, ziVar6.f26911v2, true, 1.0f, true, false, false, false);
        }
    }

    public final boolean g2() {
        org.telegram.ui.ActionBar.e6 e6Var = this.Pb;
        if (e6Var != null) {
            return e6Var.g();
        }
        return org.telegram.ui.ActionBar.k6.d1();
    }

    public final void g3(int i3, int i10, String str) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
            obtain.setPackageName(getContext().getPackageName());
            obtain.setSource(this, i3);
            if (str != null) {
                obtain.getText().add(str);
            }
            if (getParent() != null) {
                getParent().requestSendAccessibilityEvent(this, obtain);
            }
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return new z0(this);
    }

    public int getAdditionalPaddingHeight() {
        return this.Dc;
    }

    public CharSequence getAdminAccessibilityText() {
        StaticLayout staticLayout = this.Z8;
        if (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.Z8.getText());
        xg.a[] aVarArr = (xg.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), xg.a.class);
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
        if (this.f29919fb) {
            return this.f29932gb;
        }
        return super.getAlpha();
    }

    public org.telegram.ui.Components.p5[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.getAnimatedEmojiSpans():org.telegram.ui.Components.p5[]");
    }

    public float getAnimationOffsetX() {
        return this.Vc;
    }

    public ImageReceiver getAvatarImage() {
        if (this.F6) {
            return this.f30165z7;
        }
        return null;
    }

    public e90 getBackgroundDrawable() {
        return this.Sa;
    }

    public int getBackgroundDrawableBottom() {
        int i3;
        ri riVar = this.M;
        int i10 = 0;
        if (riVar != null) {
            int i11 = 4;
            if ((riVar.f25149l & 4) == 0) {
                i3 = org.telegram.messenger.g0.L(3.0f);
            } else {
                i3 = 0;
            }
            if ((this.M.f25149l & 8) == 0) {
                zi ziVar = this.P5;
                if (ziVar != null && ziVar.Q3()) {
                    i11 = 3;
                }
                i3 += org.telegram.messenger.g0.L(i11);
            }
        } else {
            i3 = 0;
        }
        boolean z10 = this.K;
        if (!z10 || !this.J) {
            if (z10) {
                i10 = org.telegram.messenger.g0.L(1.0f);
            } else {
                i10 = org.telegram.messenger.g0.L(2.0f);
            }
        }
        int backgroundDrawableTop = ((getBackgroundDrawableTop() + this.f29887d7) - i10) + i3;
        if (!this.B6) {
            if (this.J) {
                backgroundDrawableTop += org.telegram.messenger.g0.L(1.0f);
            }
            if (this.K) {
                return org.telegram.messenger.g0.L(1.0f) + backgroundDrawableTop;
            }
        }
        return backgroundDrawableTop;
    }

    public int getBackgroundDrawableLeft() {
        int compactInShift;
        int i3;
        zi messageObject = getMessageObject();
        int i10 = 0;
        float f10 = 9.0f;
        if (messageObject != null && messageObject.Q3()) {
            if (this.f30144xb) {
                return (this.f29874c7 - this.f29848a7) - ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(9.0f)));
            }
            int i11 = this.f29874c7 - this.f29848a7;
            if (this.B6) {
                i10 = org.telegram.messenger.g0.L(9.0f);
            }
            return i11 - i10;
        }
        float f11 = 71.0f;
        if (this.f30144xb) {
            if (!K2()) {
                if ((this.f29900e6 || ((messageObject != null && (messageObject.f26857h2 || messageObject.f26866j2 || messageObject.f26868k.guestchat_via_from != null)) || zi.B0(messageObject.f26868k) == 489000)) && this.F6) {
                    i10 = 48;
                }
                f11 = i10 + 3;
            }
            compactInShift = org.telegram.messenger.g0.L(f11) + ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(6.0f)));
        } else {
            if (!K2()) {
                if ((this.f29900e6 || ((messageObject != null && (messageObject.f26857h2 || messageObject.f26866j2 || messageObject.f26868k.guestchat_via_from != null)) || zi.B0(messageObject.f26868k) == 489000)) && this.F6) {
                    i10 = 48;
                }
                f11 = i10;
            }
            int L = org.telegram.messenger.g0.L(f11);
            if (!this.B6) {
                f10 = 3.0f;
            }
            compactInShift = getCompactInShift() + org.telegram.messenger.g0.L(f10) + L;
        }
        ui uiVar = this.L;
        if (uiVar != null && !uiVar.f25705i && (i3 = this.M.f25147j) != 0) {
            compactInShift += (int) Math.ceil((i3 / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.f30144xb) {
            if (this.K) {
                return compactInShift + ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(6.0f)));
            }
        } else if (!this.B6 && this.K) {
            return org.telegram.messenger.g0.L(6.0f) + compactInShift;
        }
        return compactInShift;
    }

    public int getBackgroundDrawableRight() {
        int L;
        int i3;
        int backgroundDrawableLeft;
        zi ziVar;
        zi ziVar2;
        int i10 = this.f29848a7;
        if (this.f30144xb) {
            i3 = i10 - ((int) (getVideoTranscriptionProgress() * org.telegram.messenger.g0.L(3.0f)));
            if (this.K && (ziVar2 = this.P5) != null && ziVar2.Q3()) {
                i3 = (int) (i3 - ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(6.0f)));
            }
            if (this.K && ((ziVar = this.P5) == null || !ziVar.Q3())) {
                i3 = (int) (i3 - ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(6.0f)));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            if (this.B6) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(3.0f);
            }
            i3 = i10 - L;
            if (!this.B6 && this.K) {
                i3 -= org.telegram.messenger.g0.L(6.0f);
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        }
        return backgroundDrawableLeft + i3;
    }

    public int getBackgroundDrawableTop() {
        int i3;
        ri riVar = this.M;
        int i10 = 0;
        if (riVar != null && (riVar.f25149l & 4) == 0) {
            i3 = 0 - org.telegram.messenger.g0.L(3.0f);
        } else {
            i3 = 0;
        }
        if (!this.J) {
            i10 = org.telegram.messenger.g0.L(1.0f);
        }
        int i11 = i3 + i10;
        if (!this.B6 && this.J) {
            return i11 - org.telegram.messenger.g0.L(1.0f);
        }
        return i11;
    }

    public int getBackgroundHeight() {
        return this.f29865bb;
    }

    public ImageReceiver getBlurredPhotoImage() {
        return this.V0;
    }

    public int getBottomActionPadding() {
        x1 x1Var = this.hb;
        if (x1Var.C1) {
            return org.telegram.messenger.g0.W1(x1Var.L1, x1Var.B1, this.f29894e0);
        }
        return this.f29894e0;
    }

    @Override
    public int getBoundsLeft() {
        boolean z10;
        int i3;
        int i10;
        float f10;
        int L;
        int i11;
        float f11;
        zi ziVar = this.P5;
        if (ziVar != null && ziVar.Q3()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (X2()) {
            if (this.M != null) {
                f11 = 73.0f;
            } else {
                zi ziVar2 = this.P5;
                if (ziVar2 != null && ziVar2.f26857h2) {
                    i11 = 42;
                } else {
                    i11 = 63;
                }
                f11 = i11;
            }
            i3 = org.telegram.messenger.g0.L(f11);
        } else {
            i3 = 0;
        }
        if (z10 && (U(this.P5) || this.H4)) {
            i10 = org.telegram.messenger.g0.L(48.0f);
        } else {
            i10 = 0;
        }
        int backgroundDrawableLeft = (getBackgroundDrawableLeft() - i3) - i10;
        ArrayList arrayList = this.H5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            zi ziVar3 = this.P5;
            if (ziVar3 != null && ziVar3.Q3()) {
                L = (getMeasuredWidth() - widthForButtons) - org.telegram.messenger.g0.L(10.0f);
            } else {
                int i12 = this.M6;
                if (!this.B6 && !this.K) {
                    f10 = 7.0f;
                } else {
                    f10 = 1.0f;
                }
                L = i12 + org.telegram.messenger.g0.L(f10);
            }
            int i13 = Integer.MAX_VALUE;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                i13 = Math.max(i13, ((int) (((c0) arrayList.get(i14)).f29011c * widthForButtons)) + L);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i13);
        }
        if (this.T != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.T.k()) - org.telegram.messenger.g0.L(18.0f))) / 2);
        }
        if (this.f29908f0 != null) {
            backgroundDrawableLeft = Math.min(this.Z6 - ((int) getCompactSideMenuShift()), backgroundDrawableLeft);
        }
        return Math.max(0, backgroundDrawableLeft);
    }

    @Override
    public int getBoundsRight() {
        int i3;
        float f10;
        int L;
        zi ziVar = this.P5;
        if (ziVar != null && !ziVar.Q3() && (U(this.P5) || this.H4)) {
            i3 = org.telegram.messenger.g0.L(48.0f);
        } else {
            i3 = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i3;
        ArrayList arrayList = this.H5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            zi ziVar2 = this.P5;
            if (ziVar2 != null && ziVar2.Q3()) {
                L = (getMeasuredWidth() - getWidthForButtons()) - org.telegram.messenger.g0.L(10.0f);
            } else {
                int i10 = this.M6;
                if (!this.B6 && !this.K) {
                    f10 = 7.0f;
                } else {
                    f10 = 1.0f;
                }
                L = i10 + org.telegram.messenger.g0.L(f10);
            }
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                c0 c0Var = (c0) arrayList.get(i12);
                float f11 = widthForButtons;
                i11 = Math.max(i11, ((int) (c0Var.f29011c * f11)) + L + ((int) (c0Var.f29012e * f11)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, i11);
        }
        if (this.T != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.T.k() + getParentWidth()) + org.telegram.messenger.g0.L(18.0f))) / 2);
        }
        if (this.f29908f0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public xi getCaptionLayout() {
        return this.f29985l3;
    }

    public float getCaptionX() {
        x1 x1Var = this.hb;
        if (x1Var.f30936x0) {
            if (x1Var.D0) {
                this.f30061r3 += x1Var.f30871h0;
            } else if (x1Var.f30921t0) {
                float f10 = this.f30061r3;
                float f11 = x1Var.L1;
                this.f30061r3 = com.google.android.recaptcha.internal.a.y(1.0f, f11, x1Var.f30913r0, f10 * f11);
            } else if (!zi.S4(this.P5.f26868k) || !TextUtils.isEmpty(this.P5.f26924z)) {
                this.f30061r3 += x1Var.f30871h0;
            }
        }
        return this.f30061r3;
    }

    public float getCaptionY() {
        float f10 = this.f30073s3;
        x1 x1Var = this.hb;
        if (x1Var.f30936x0) {
            if (x1Var.D0) {
                return f10 - getTranslationY();
            }
            if (x1Var.f30921t0) {
                float f11 = x1Var.L1;
                return com.google.android.recaptcha.internal.a.y(1.0f, f11, x1Var.f30917s0, f10 * f11);
            }
            return f10;
        }
        return f10;
    }

    @Override
    public float getCheckBoxTranslation() {
        return this.f30059r1;
    }

    public int getChecksX() {
        float f10;
        int i3 = this.f29874c7;
        if (az.Y0 >= 10) {
            f10 = 27.3f;
        } else {
            f10 = 25.3f;
        }
        return i3 - org.telegram.messenger.g0.L(f10);
    }

    public int getChecksY() {
        float f10;
        int intrinsicHeight;
        if (this.P5.Q5()) {
            f10 = this.f30143x9;
            intrinsicHeight = Y1("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            f10 = this.f30143x9;
            intrinsicHeight = org.telegram.ui.ActionBar.k6.F3.getIntrinsicHeight();
        }
        return (int) (f10 - intrinsicHeight);
    }

    public int getCompactContentWidth() {
        int parentWidth;
        if (org.telegram.messenger.g0.Q1()) {
            parentWidth = org.telegram.messenger.g0.Q0();
        } else {
            parentWidth = getParentWidth();
        }
        return (parentWidth - org.telegram.messenger.g0.L(32.0f)) - getCompactSideMenuWidth();
    }

    public int getCompactLeft() {
        return org.telegram.messenger.g0.L(16.0f);
    }

    public int getCompactRight() {
        return (getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - getCompactSideMenuWidth();
    }

    public int getCurrentBackgroundLeft() {
        org.telegram.ui.ActionBar.t4 t4Var = this.K6;
        if (t4Var == null) {
            return 0;
        }
        int i3 = t4Var.getBounds().left;
        if (!this.P5.Q3() && this.hb.A0 != 1.0f) {
            boolean z10 = this.f30144xb;
            if ((z10 || !this.B6) && !this.K) {
                if (z10) {
                    return (int) (i3 - (getVideoTranscriptionProgress() * org.telegram.messenger.g0.L(6.0f)));
                }
                return i3 - org.telegram.messenger.g0.L(6.0f);
            }
            return i3;
        }
        return i3;
    }

    public int getCurrentBackgroundRight() {
        boolean z10;
        org.telegram.ui.ActionBar.t4 t4Var = this.K6;
        if (t4Var == null) {
            return getWidth();
        }
        int i3 = t4Var.getBounds().right;
        if (this.P5.Q3() && this.hb.A0 != 1.0f && (((z10 = this.f30144xb) || !this.B6) && !this.K)) {
            if (z10) {
                return (int) ((getVideoTranscriptionProgress() * org.telegram.messenger.g0.L(6.0f)) + i3);
            }
            return org.telegram.messenger.g0.L(6.0f) + i3;
        }
        return i3;
    }

    public TLRPC.Chat getCurrentChat() {
        return this.f29968ja;
    }

    public ui getCurrentMessagesGroup() {
        return this.L;
    }

    public ri getCurrentPosition() {
        return this.M;
    }

    public TLRPC.User getCurrentUser() {
        return this.f29955ia;
    }

    public l1 getDelegate() {
        return this.Ra;
    }

    @Override
    public float getDeltaBottom() {
        return this.hb.f30880j0;
    }

    public float getDeltaLeft() {
        return this.hb.f30871h0;
    }

    public float getDeltaRight() {
        return this.hb.f30876i0;
    }

    public float getDeltaTop() {
        return this.hb.f30885k0;
    }

    public float getDescriptionLayoutX() {
        int L;
        int extraTextX;
        float f10;
        float L2;
        int i3;
        int L3;
        int i10;
        boolean z10 = this.S1;
        float f11 = 0.0f;
        x1 x1Var = this.hb;
        if (z10) {
            org.telegram.messenger.g0.L(14.0f);
            L2 = this.f30031p0 - org.telegram.messenger.g0.L(10.0f);
        } else {
            if (this.T1) {
                org.telegram.messenger.g0.L(14.0f);
                i3 = this.f30031p0;
                L3 = org.telegram.messenger.g0.L(1.0f);
            } else if (this.P5.s4()) {
                org.telegram.messenger.g0.L(2.0f);
                i3 = this.f30031p0;
                L3 = org.telegram.messenger.g0.L(1.0f);
            } else {
                float f12 = 12.0f;
                if (this.P5.Q3()) {
                    f10 = getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + this.M6;
                    if (this.P5.D == 19) {
                        f10 -= Math.max(0.0f, ((Math.max(this.W7, this.Y7) + f10) + org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.f22608q.x);
                    }
                } else {
                    if (this.B6) {
                        L = org.telegram.messenger.g0.L(12.0f) + this.M6;
                        extraTextX = getExtraTextX();
                    } else {
                        int i11 = this.M6;
                        if (!this.K) {
                            f12 = 18.0f;
                        }
                        L = org.telegram.messenger.g0.L(f12) + i11;
                        extraTextX = getExtraTextX();
                    }
                    f10 = extraTextX + L;
                }
                L2 = (f10 + x1Var.f30871h0) - org.telegram.messenger.g0.L(1.33f);
            }
            L2 = L3 + i3;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (x1Var != null) {
            f11 = x1Var.f30876i0;
        }
        float f13 = backgroundDrawableRight + f11;
        int i12 = 0;
        if (this.P5.Q3() && !this.B6 && !this.K) {
            i10 = 6;
        } else {
            i10 = 0;
        }
        int L4 = (int) (((f13 - org.telegram.messenger.g0.L(10 + i10)) - getExtraTextX()) - L2);
        float L5 = L2 + org.telegram.messenger.g0.L(10.0f);
        if (Math.abs(this.f29856b2) > 1) {
            i12 = ((L4 - org.telegram.messenger.g0.L(20.0f)) - this.f29843a2) - this.f29856b2;
        }
        return L5 + i12;
    }

    public float getDescriptionLayoutY() {
        float f10;
        float f11 = this.X1;
        x1 x1Var = this.hb;
        if (!x1Var.f30919s2) {
            f10 = (-x1Var.f30885k0) + x1Var.f30880j0;
        } else {
            f10 = 0.0f;
        }
        return f11 + f10;
    }

    public StaticLayout getDescriptionlayout() {
        return this.f30020o2;
    }

    public TLRPC.TL_availableEffect getEffect() {
        zi ziVar;
        ri riVar = this.M;
        if ((riVar != null && !riVar.h) || (ziVar = this.P5) == null) {
            return null;
        }
        return ziVar.M0();
    }

    public xi getExplanationLayout() {
        return this.f30034p3;
    }

    public float getExplanationX() {
        return this.f30087t5;
    }

    public float getExplanationY() {
        return this.f30099u5;
    }

    public int getExtraInsetHeight() {
        int i3;
        int i10 = this.f30109v3;
        boolean f22 = f2();
        dh.o0 o0Var = this.O;
        if (f22) {
            if (o0Var.f9125p) {
                i3 = 18;
            } else {
                i3 = 0;
            }
            i10 += org.telegram.messenger.g0.L(i3 + 2) + this.f30070s0.f30325r;
        }
        if (this.f30127w7) {
            i10 += getCommentButtonHeight();
        }
        if (!o0Var.f9125p) {
            this.P5.getClass();
            return i10 + o0Var.f9123n;
        }
        return i10;
    }

    public int getExtraTextX() {
        int i3 = az.Y0;
        if (i3 >= 15) {
            return org.telegram.messenger.g0.L(2.0f);
        }
        if (i3 >= 11) {
            return org.telegram.messenger.g0.L(1.0f);
        }
        return 0;
    }

    public int getExtraTimeX() {
        int i3;
        if (t2()) {
            return 0;
        }
        if (!this.P5.Q3() && ((!this.B6 || this.f29985l3 != null) && (i3 = az.Y0) > 11)) {
            return org.telegram.messenger.g0.L((i3 - 11) / 1.5f);
        }
        if (this.P5.Q3() || !this.f30157yb || !this.F6 || this.P5.D != 5) {
            return 0;
        }
        return (int) ((org.telegram.messenger.g0.g3(this.W6, v2()) - org.telegram.messenger.g0.f22612u) * 0.7f);
    }

    public StaticLayout getFactCheckLayout() {
        s1 s1Var = this.f30070s0;
        if (s1Var != null) {
            return s1Var.f30315g;
        }
        return null;
    }

    public String getFilename() {
        int i3;
        int i10;
        zi ziVar = this.P5;
        if (ziVar != null) {
            int i11 = ziVar.D;
            if (i11 == 1) {
                TLRPC.PhotoSize photoSize = this.f29884d4;
                if (photoSize != null) {
                    return org.telegram.messenger.w7.r(null, photoSize);
                }
            } else if (i11 != 8 && (i10 = this.L1) != 7 && i10 != 4 && i10 != 8 && i11 != 9 && i10 != 3 && i10 != 5) {
                if (i10 != 0) {
                    return org.telegram.messenger.w7.r(null, this.M1);
                }
                TLRPC.PhotoSize photoSize2 = this.f29884d4;
                if (photoSize2 != null) {
                    return org.telegram.messenger.w7.r(null, photoSize2);
                }
            } else if (!ziVar.C0) {
                if (ziVar.f26913w0 && !TextUtils.isEmpty(ziVar.f26868k.attachPath)) {
                    return this.P5.f26868k.attachPath;
                }
                if (!this.P5.o4() || (i3 = this.L1) == 3 || i3 == 5) {
                    return this.P5.S0();
                }
            }
        }
        return null;
    }

    public int getForwardNameCenterX() {
        float f10;
        TLRPC.User user = this.f29955ia;
        if (user != null && user.f27150id == 0) {
            f10 = this.f30165z7.r();
        } else {
            f10 = this.f30078s9 + this.I1;
        }
        return (int) f10;
    }

    public float getHighlightAlpha() {
        return O1(false);
    }

    public int getIconForCurrentState() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.getIconForCurrentState():int");
    }

    public float getLastTouchX() {
        return this.f29936h1;
    }

    public float getLastTouchY() {
        return this.f29947i1;
    }

    public int getLayoutHeight() {
        return this.f29887d7;
    }

    public int getMaxNameWidth() {
        int min;
        int L;
        zi ziVar;
        zi ziVar2;
        int i3;
        int i10;
        float f10;
        int L2;
        int parentWidth;
        ri riVar;
        int i11 = this.L1;
        if (i11 != 6 && i11 != 8 && (i3 = (ziVar2 = this.P5).D) != 5) {
            ui uiVar = this.L;
            int i12 = 0;
            if (uiVar != null && !uiVar.f25705i) {
                if (org.telegram.messenger.g0.Q1()) {
                    parentWidth = org.telegram.messenger.g0.Q0();
                } else {
                    parentWidth = getParentWidth();
                }
                i10 = 0;
                for (int i13 = 0; i13 < this.L.f25702e.size(); i13++) {
                    if (((ri) this.L.f25702e.get(i13)).f25142c != 0) {
                        break;
                    }
                    i10 = (int) (Math.ceil(((riVar.f25143e + riVar.f25147j) / 1000.0f) * parentWidth) + i10);
                }
                if (this.W6) {
                    i12 = 71;
                } else if (X2()) {
                    i12 = 48;
                }
                L2 = org.telegram.messenger.g0.L(i12 + 31);
            } else if (i3 == 19) {
                int i14 = ziVar2.f26904t2;
                int L3 = org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(52.0f);
                if (this.F6) {
                    i12 = org.telegram.messenger.g0.L(48.0f);
                }
                return Math.max(i14, (int) ((L3 - i12) * 0.5f));
            } else {
                i10 = this.f29848a7;
                if (ziVar2.f26874l2 && ziVar2.Q3() && U(this.P5)) {
                    i10 -= org.telegram.messenger.g0.L(25.0f);
                }
                if (this.B6) {
                    f10 = 22.0f;
                } else {
                    f10 = 31.0f;
                }
                L2 = org.telegram.messenger.g0.L(f10);
            }
            return i10 - L2;
        }
        float f11 = 0.0f;
        if (org.telegram.messenger.g0.Q1()) {
            min = org.telegram.messenger.g0.Q0();
            if (this.W6) {
                f11 = 71.0f;
            } else if (X2()) {
                f11 = 42.0f;
            }
            L = org.telegram.messenger.g0.L(f11);
        } else {
            min = Math.min(getParentWidth(), org.telegram.messenger.g0.f22608q.y);
            if (this.W6) {
                f11 = 71.0f;
            } else if (X2()) {
                f11 = 42.0f;
            }
            L = org.telegram.messenger.g0.L(f11);
        }
        int i15 = min - L;
        zi ziVar3 = this.P5;
        if (ziVar3 != null && ziVar3.f26874l2 && ziVar3.Q3() && U(this.P5)) {
            i15 -= org.telegram.messenger.g0.L(25.0f);
        }
        if (this.f30157yb && ((ziVar = this.P5) == null || !ziVar.U4())) {
            return (i15 - (this.f29848a7 - (org.telegram.messenger.g0.g3(this.W6, v2()) - org.telegram.messenger.g0.f22612u))) - org.telegram.messenger.g0.L(57.0f);
        }
        if (this.W6 && (this.P5.D == 5 || this.L1 == 6)) {
            return this.f29848a7 - org.telegram.messenger.g0.L(57.0f);
        }
        return (i15 - this.f29848a7) - org.telegram.messenger.g0.L(57.0f);
    }

    public int getMediaOffsetY() {
        x1 x1Var = this.hb;
        if (x1Var.f30841a2) {
            return org.telegram.messenger.g0.W1(x1Var.L1, x1Var.Z1, this.W1);
        }
        return this.W1;
    }

    @Override
    public zi getMessageObject() {
        zi ziVar = this.Q5;
        if (ziVar != null) {
            return ziVar;
        }
        return this.P5;
    }

    public int getMiniIconForCurrentState() {
        int i3 = this.W3;
        if (i3 < 0) {
            return 4;
        }
        if (i3 == 0) {
            return 2;
        }
        return 3;
    }

    public int getNameStatusX() {
        int i3;
        float f10 = this.f29930g9 + this.f29917f9;
        int i10 = this.Q6;
        if (i10 > 0) {
            i3 = i10 - org.telegram.messenger.g0.L(32.0f);
        } else {
            i3 = this.V8;
        }
        return (int) (f10 + i3 + org.telegram.messenger.g0.L(2.0f) + (org.telegram.messenger.g0.L(20.0f) / 2));
    }

    public int getNameStatusY() {
        int height;
        float f10 = this.f29943h9;
        StaticLayout staticLayout = this.U8;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight();
        }
        return (int) (f10 + (height / 2));
    }

    public int getNoSoundIconCenterX() {
        return this.H1;
    }

    @Override
    public int getObserverTag() {
        return this.Y5;
    }

    public float getPaddingTopAnimated() {
        return getTopicSeparatorTopPadding() + this.W + this.f29946i0;
    }

    public int getParentWidth() {
        int i3;
        zi ziVar = this.P5;
        if (ziVar == null) {
            ziVar = this.Q5;
        }
        if (ziVar != null && ziVar.f26895r1 && (i3 = this.L0) > 0) {
            return i3;
        }
        return org.telegram.messenger.g0.f22608q.x;
    }

    public float getPhotoBottom() {
        if (a4()) {
            float f10 = this.f29866bc;
            if (f10 > 0.0f) {
                return f10;
            }
            return this.f29887d7 - org.telegram.messenger.g0.L(5.0f);
        }
        l4 l4Var = this.W5;
        if (l4Var != null) {
            return l4Var.f29551e + l4Var.h;
        }
        return this.U0.A();
    }

    public ImageReceiver getPhotoImage() {
        return this.U0;
    }

    public ArrayList<p1> getPollButtons() {
        return this.P4;
    }

    public float getPollButtonsLeft() {
        int L;
        if (getMessageObject() != null && getMessageObject().Q3()) {
            L = (org.telegram.messenger.g0.L(3.0f) + this.f29874c7) - this.f29848a7;
        } else if (this.X6) {
            L = org.telegram.messenger.g0.L(82.0f);
        } else if (X2()) {
            L = org.telegram.messenger.g0.L(59.0f);
        } else {
            L = org.telegram.messenger.g0.L(11.0f);
        }
        return L;
    }

    public float getPollButtonsRight() {
        return (getPollButtonsLeft() + this.f29848a7) - org.telegram.messenger.g0.L(15.0f);
    }

    public zi getPrimaryMessageObject() {
        zi ziVar;
        zi ziVar2 = this.P5;
        if (ziVar2 != null && this.L != null && ziVar2.A2()) {
            ziVar = this.L.c();
        } else {
            ziVar = null;
        }
        if (ziVar != null) {
            return ziVar;
        }
        return this.P5;
    }

    public RadialProgress2 getRadialProgress() {
        return this.Q0;
    }

    public dh.o0 getReactionsLayout() {
        return this.O;
    }

    public int getRepliesCount() {
        ui uiVar = this.L;
        if (uiVar != null && !uiVar.d.isEmpty()) {
            return ((zi) this.L.d.get(0)).N1();
        }
        return this.P5.N1();
    }

    public org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        return this.Pb;
    }

    public RectF getScrimBlockBounds() {
        return this.Xc;
    }

    public sm0 getSeekBarWaveform() {
        return this.D4;
    }

    public float getSideButtonStartX() {
        return this.Q8;
    }

    public float getSideButtonStartY() {
        return this.R8;
    }

    @Override
    public float getSlidingOffsetX() {
        return this.Uc;
    }

    public long getStarsPrice() {
        TLRPC.Message message;
        long j10;
        TLRPC.Message message2;
        ui uiVar = this.L;
        if (uiVar != null) {
            ArrayList arrayList = uiVar.d;
            int size = arrayList.size();
            int i3 = 0;
            long j11 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                zi ziVar = (zi) obj;
                if (ziVar != null && (message2 = ziVar.f26868k) != null) {
                    j10 = message2.paid_message_stars;
                } else {
                    j10 = 0;
                }
                j11 += j10;
            }
            return j11;
        }
        zi ziVar2 = this.P5;
        if (ziVar2 == null || (message = ziVar2.f26868k) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        x1 x1Var = this.hb;
        if (x1Var.f30945z1) {
            return org.telegram.messenger.g0.W1(x1Var.L1, x1Var.f30941y1, this.W);
        }
        return this.W;
    }

    public TLRPC.Document getStreamingMedia() {
        int i3 = this.L1;
        if (i3 != 4 && i3 != 7 && i3 != 2) {
            return null;
        }
        return this.M1;
    }

    public int getTextX() {
        return this.f30018o0;
    }

    public int getTextY() {
        return this.f30094u0;
    }

    public float getTimeAlpha() {
        return this.f29962j4;
    }

    public float getTimeX() {
        int i3;
        x1 x1Var = this.hb;
        if (x1Var.f30877i1) {
            i3 = org.telegram.messenger.g0.W1(x1Var.L1, x1Var.f30872h1, this.B9);
        } else {
            i3 = this.B9;
        }
        return i3;
    }

    public float getTimeY() {
        int i3;
        int i10 = 0;
        if (D3()) {
            if (this.f30127w7) {
                i10 = t2() ? getCommentButtonHeight() : org.telegram.messenger.g0.L(41.3f);
            }
        } else if (this.P5.s4()) {
            i3 = -org.telegram.messenger.g0.L(48.0f);
            if (this.f29861b7) {
                i3 -= org.telegram.messenger.g0.L(4.0f);
            }
            return a2(i3);
        } else if (this.f30127w7) {
            i10 = t2() ? getCommentButtonHeight() : org.telegram.messenger.g0.L(43.0f);
        }
        i3 = -i10;
        return a2(i3);
    }

    public int getTopMediaOffset() {
        zi ziVar = this.P5;
        if (ziVar != null && ziVar.D == 14) {
            return this.W1 + this.Ta;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        x1 x1Var = this.hb;
        if (x1Var.f30929v1) {
            return org.telegram.messenger.g0.W1(x1Var.L1, x1Var.f30926u1, this.f29922g0);
        }
        return this.f29922g0;
    }

    public x1 getTransitionParams() {
        return this.hb;
    }

    public float getVideoTranscriptionProgress() {
        zi ziVar;
        x1 x1Var = this.hb;
        if (x1Var == null || (ziVar = this.P5) == null || !ziVar.i4()) {
            return 1.0f;
        }
        if (x1Var.m1) {
            if (this.H6) {
                return x1Var.L1;
            }
            return 1.0f - x1Var.L1;
        } else if (this.H6) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public float getViewTop() {
        return this.f29852ab;
    }

    public int getWidthForButtons() {
        x1 x1Var = this.hb;
        if (x1Var.O1) {
            return org.telegram.messenger.g0.W1(x1Var.L1, x1Var.P1, this.J5);
        }
        return this.J5;
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        if (this.Xc == null) {
            draw(canvas);
            return;
        }
        canvas.save();
        Path path = this.Yc;
        path.rewind();
        path.addRoundRect(this.Xc, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        canvas.clipPath(path);
        if (L0()) {
            canvas.save();
            canvas.translate(0.0f, getPaddingTop());
            M0(canvas, true, false);
            canvas.restore();
        }
        draw(canvas);
        canvas.restore();
    }

    public final boolean h0(MotionEvent motionEvent) {
        i9 q22;
        boolean z10;
        boolean z11;
        int i3;
        int L;
        int i10;
        s1 s1Var;
        int L2;
        int extraTextX;
        int i11;
        ui uiVar;
        l1 l1Var = this.Ra;
        if (l1Var != null && (q22 = l1Var.q2()) != null && (q22.b() || q22.e())) {
            ArrayList arrayList = this.P5.f26927z2;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            cv cvVar = this.P5.f26915w2;
            if (cvVar != null && !cvVar.f22076n.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((z10 || c2() || z11) && ((this.k1 || this.L != null) && (this.L == null || this.Ra.R()))) {
                if (this.P5.A2() && (uiVar = this.L) != null && !uiVar.f25705i) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                            View childAt = viewGroup.getChildAt(i12);
                            if (childAt instanceof q1) {
                                q1 q1Var = (q1) childAt;
                                ui currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                                ri currentPosition = q1Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.f25699a == this.L.f25699a && (currentPosition.f25149l & B()) != 0 && (currentPosition.f25149l & 1) != 0) {
                                    q22.f30663c = (int) q1Var.f30061r3;
                                    q22.d = (int) q1Var.f30073s3;
                                    q22.b0(q1Var);
                                    if (q1Var == this) {
                                        return q22.M(motionEvent);
                                    }
                                    motionEvent.offsetLocation(getLeft() - q1Var.getLeft(), getTop() - q1Var.getTop());
                                    boolean M = q22.M(motionEvent);
                                    motionEvent.offsetLocation(-(getLeft() - q1Var.getLeft()), -(getTop() - q1Var.getTop()));
                                    return M;
                                }
                            }
                        }
                    }
                } else {
                    zi ziVar = this.P5;
                    if (ziVar != null && !ziVar.f26895r1 && (s1Var = this.f30070s0) != null && s1Var.f30315g != null && M1(motionEvent) >= this.f30058r0) {
                        q22.f29390r0 = false;
                        q22.f29392t0 = true;
                        q22.f29394v0 = false;
                        ui uiVar2 = this.L;
                        if (uiVar2 != null && !uiVar2.f25705i) {
                            i11 = (int) this.f30061r3;
                        } else {
                            float f10 = 12.0f;
                            if (this.P5.Q3()) {
                                int extraTextX2 = getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + this.M6;
                                if (this.P5.D == 19) {
                                    i11 = extraTextX2 - Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(this.W7, this.Y7) + extraTextX2)) - org.telegram.messenger.g0.f22608q.x);
                                } else {
                                    i11 = extraTextX2;
                                }
                            } else {
                                if (this.B6) {
                                    L2 = org.telegram.messenger.g0.L(12.0f) + this.M6;
                                    extraTextX = getExtraTextX();
                                } else {
                                    int i13 = this.M6;
                                    if (!this.K) {
                                        f10 = 18.0f;
                                    }
                                    L2 = org.telegram.messenger.g0.L(f10) + i13;
                                    extraTextX = getExtraTextX();
                                }
                                i11 = extraTextX + L2;
                            }
                        }
                        int L3 = ((int) (i11 + this.hb.f30871h0)) - org.telegram.messenger.g0.L(1.33f);
                        int i14 = this.f30058r0;
                        q22.f30663c = (org.telegram.messenger.g0.L(10.0f) + L3) - this.f30070s0.f30322o;
                        q22.d = org.telegram.messenger.g0.L(22.0f) + i14;
                    } else {
                        if (z11 && N2()) {
                            if (M1(motionEvent) < this.P5.f26915w2.t() + this.f30094u0) {
                                q22.f29390r0 = false;
                                q22.f29392t0 = false;
                                q22.f29394v0 = true;
                                int i15 = this.f30018o0;
                                int i16 = this.f30094u0;
                                q22.f30663c = i15;
                                q22.d = i16;
                            }
                        }
                        if (c2()) {
                            q22.f29390r0 = false;
                            q22.f29392t0 = false;
                            q22.f29394v0 = false;
                            q22.f30663c = (int) this.f30061r3;
                            q22.d = (int) this.f30073s3;
                        } else {
                            zi ziVar2 = this.P5;
                            if (ziVar2 != null && !ziVar2.f26895r1 && this.f30020o2 != null && (!this.f30095u1 ? M1(motionEvent) > this.X1 : M1(motionEvent) < this.f30094u0)) {
                                q22.f29390r0 = true;
                                q22.f29392t0 = false;
                                q22.f29394v0 = false;
                                if (this.S1) {
                                    i10 = this.f30031p0 - org.telegram.messenger.g0.L(10.0f);
                                } else {
                                    if (this.T1) {
                                        i3 = this.f30031p0;
                                        L = org.telegram.messenger.g0.L(1.0f);
                                    } else {
                                        i3 = this.f30031p0;
                                        L = org.telegram.messenger.g0.L(1.0f);
                                    }
                                    i10 = i3 + L;
                                }
                                int L4 = org.telegram.messenger.g0.L(10.0f) + i10 + this.Z1;
                                int i17 = this.X1;
                                q22.f30663c = L4;
                                q22.d = i17;
                            } else if (z11) {
                                q22.f29390r0 = false;
                                q22.f29392t0 = false;
                                q22.f29394v0 = true;
                                int i18 = this.f30018o0;
                                int i19 = this.f30094u0;
                                q22.f30663c = i18;
                                q22.d = i19;
                            } else {
                                q22.f29390r0 = false;
                                q22.f29392t0 = false;
                                q22.f29394v0 = false;
                                int i20 = this.f30018o0;
                                int i21 = this.f30094u0;
                                q22.f30663c = i20;
                                q22.d = i21;
                            }
                        }
                    }
                    q22.b0(this);
                    return q22.M(motionEvent);
                }
            }
        }
        return false;
    }

    public final void h1(android.graphics.Canvas r55, float r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.h1(android.graphics.Canvas, float):void");
    }

    public final boolean h2() {
        zi ziVar = this.P5;
        if ((ziVar != null && ziVar.t2()) || this.L5) {
            return true;
        }
        return false;
    }

    public final void h3(boolean z10, boolean z11) {
        ui uiVar;
        ui uiVar2;
        zi ziVar;
        if (!z11 || (ziVar = this.P5) == null || !ziVar.f26823a0) {
            if (z10) {
                this.f30009n3 = null;
                CheckBoxBase checkBoxBase = this.m1;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, this.Pb);
                    this.m1 = checkBoxBase2;
                    if (this.O0) {
                        checkBoxBase2.f31329l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.e6 e6Var = this.Pb;
                    if (checkBoxBase.F != e6Var) {
                        checkBoxBase.F = e6Var;
                        checkBoxBase.b();
                    }
                }
            }
            if (z10 && (((uiVar = this.L) != null && uiVar.d.size() > 1) || ((uiVar2 = this.R5) != null && uiVar2.d.size() > 1))) {
                CheckBoxBase checkBoxBase3 = this.f29983l1;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, this, this.Pb);
                    this.f29983l1 = checkBoxBase4;
                    if (!checkBoxBase4.f31341y) {
                        checkBoxBase4.f31341y = true;
                        checkBoxBase4.b();
                    }
                    if (this.O0) {
                        this.f29983l1.f31329l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.e6 e6Var2 = this.Pb;
                    if (checkBoxBase3.F != e6Var2) {
                        checkBoxBase3.F = e6Var2;
                        checkBoxBase3.b();
                    }
                }
            }
            float f10 = 0.0f;
            if (this.f30007n1 == z10) {
                if (z11 != this.f30019o1 && !z11) {
                    if (z10) {
                        f10 = 1.0f;
                    }
                    this.f30032p1 = f10;
                    invalidate();
                    return;
                }
                return;
            }
            this.f30019o1 = z11;
            this.f30007n1 = z10;
            if (z11) {
                this.f30045q1 = SystemClock.elapsedRealtime();
            } else {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f30032p1 = f10;
            }
            invalidate();
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
        this.P5.F0 = j10;
        y0(j10, j11);
        if (this.f30148y1) {
            this.R0.p(true, min);
        } else {
            this.Q0.p(true, min);
        }
        int i3 = this.L1;
        if (i3 != 3 && i3 != 5) {
            if (this.V3 != 0) {
                if (this.W3 != 1) {
                    M3(false, false, false);
                }
            } else if (this.N3 != 1) {
                M3(false, false, false);
            }
        } else if (this.V3 != 0) {
            if (this.W3 != 1) {
                M3(false, false, false);
            }
        } else if (this.N3 != 4) {
            M3(false, false, false);
        }
    }

    public final boolean i0(MotionEvent motionEvent) {
        if (this.P5.s4() && this.P5.Z0) {
            int x10 = (int) motionEvent.getX();
            int M1 = (int) M1(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f10 = x10;
                if (f10 >= this.f29960j2 - org.telegram.messenger.g0.L(6.0f) && f10 <= this.f29960j2 + this.f29937h2 + org.telegram.messenger.g0.L(6.0f)) {
                    float f11 = M1;
                    if (f11 >= this.f29971k2 - org.telegram.messenger.g0.L(2.0f) && f11 <= this.f29971k2 + this.f29948i2 + org.telegram.messenger.g0.L(2.0f)) {
                        gc gcVar = this.f29994m2;
                        if (gcVar != null) {
                            gcVar.c(true);
                        }
                        this.f29984l2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.f29984l2) {
                l1 l1Var = this.Ra;
                if (l1Var != null) {
                    l1Var.K1();
                }
                gc gcVar2 = this.f29994m2;
                if (gcVar2 != null) {
                    gcVar2.c(false);
                }
                playSoundEffect(0);
                this.f29984l2 = false;
            }
        }
        return false;
    }

    public final void i1(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.i1(android.graphics.Canvas):void");
    }

    public final boolean i2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.i2():boolean");
    }

    public final void i3(boolean z10, boolean z11) {
        this.C6 = z10;
        this.f30112v6 = z11;
        R3();
        if (this.B4) {
            this.D4.f38077o = x2();
        } else {
            this.C4.f36201p = x2();
        }
        invalidate();
    }

    @Override
    public void invalidate() {
        l1 l1Var;
        if (this.P5 == null) {
            return;
        }
        Runnable runnable = this.f31020e;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.Bc;
        if (runnable2 != null) {
            runnable2.run();
            return;
        }
        Runnable runnable3 = this.Cc;
        if (runnable3 != null) {
            runnable3.run();
        }
        super.invalidate();
        if ((this.f29847a6 || (this.L != null && q2())) && getParent() != null) {
            View view = (View) getParent();
            if (view.getParent() != null) {
                view.invalidate();
                ((View) view.getParent()).invalidate();
            }
        }
        if (!this.Vb || (l1Var = this.Ra) == null) {
            return;
        }
        l1Var.q();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (this.L != null) {
            r2();
        }
    }

    @Override
    public final boolean j() {
        ui uiVar = this.L;
        if (uiVar != null && uiVar.f25705i) {
            ri riVar = this.M;
            if (riVar != null && (riVar.f25149l & 4) != 0) {
                return this.F;
            }
            return true;
        }
        return this.F;
    }

    public final boolean j0(MotionEvent motionEvent) {
        a1 a1Var;
        y yVar;
        if (this.H4 && ((!this.f30157yb || getVideoTranscriptionProgress() > 0.0f || this.S2) && (a1Var = this.I4) != null)) {
            int action = motionEvent.getAction();
            float x10 = motionEvent.getX();
            float M1 = M1(motionEvent);
            if (action != 1 && action != 3) {
                if (a1Var.v.contains((int) x10, (int) M1)) {
                    if (action == 0) {
                        a1Var.A = true;
                    }
                    if (a1Var.A && (yVar = a1Var.f35970q) != null) {
                        yVar.setHotspot(x10, M1);
                        a1Var.f35970q.setState(m11.N);
                        a1Var.f35971r.invalidate();
                    }
                    return true;
                }
            } else if (a1Var.A && action == 1) {
                a1Var.l();
                return true;
            } else {
                a1Var.A = false;
            }
        }
        return false;
    }

    public void j1(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.j1(android.graphics.Canvas):void");
    }

    public final boolean j2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.j2():boolean");
    }

    public final void j3(boolean z10, boolean z11, boolean z12) {
        zi ziVar;
        if (z10 || !z12 || (ziVar = this.P5) == null || !ziVar.f26823a0) {
            CheckBoxBase checkBoxBase = this.m1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z11, z12);
            }
            CheckBoxBase checkBoxBase2 = this.f29983l1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z10, z12);
            }
            e90 e90Var = this.Sa;
            float f10 = 0.0f;
            if (e90Var.f33320e == z11) {
                if (e90Var.f33321f != z12 && !z12) {
                    if (z11) {
                        f10 = 1.0f;
                    }
                    e90Var.d = f10;
                    e90Var.f33321f = false;
                    return;
                }
                return;
            }
            e90Var.f33320e = z11;
            e90Var.f33321f = z12;
            if (z12) {
                e90Var.f33319c = SystemClock.elapsedRealtime();
            } else {
                if (z11) {
                    f10 = 1.0f;
                }
                e90Var.d = f10;
            }
            e90Var.a();
            q1 q1Var = e90Var.f33327m;
            if (q1Var != null) {
                q1Var.invalidate();
                if (q1Var.getParent() != null) {
                    ((ViewGroup) q1Var.getParent()).invalidate();
                }
            }
        }
    }

    public final boolean k0() {
        zi ziVar = this.P5;
        if (ziVar != null && ziVar.D == 17) {
            TLRPC.MessageMedia o12 = zi.o1(ziVar.f26868k);
            if (o12 instanceof TLRPC.TL_messageMediaPoll) {
                return ((TLRPC.TL_messageMediaPoll) o12).results.has_unread_votes;
            }
        }
        return false;
    }

    public final void k1(Canvas canvas, RectF rectF) {
        float f10;
        Path path = this.A4;
        path.rewind();
        path.addRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        ei.c3 c3Var = this.U0;
        float alpha = c3Var.getAlpha();
        if (this.P5.h4()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        c3Var.setAlpha(f10 * alpha);
        c3Var.h(canvas, null);
        c3Var.setAlpha(alpha);
        canvas.restore();
        Paint Z1 = Z1("paintChatTimeBackground");
        int alpha2 = Z1.getAlpha();
        Z1.setAlpha((int) (alpha2 * this.f29973k4 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, Z1);
        Z1.setAlpha(alpha2);
    }

    public final boolean k2() {
        zi ziVar = this.P5;
        if (ziVar != null && ziVar.P5()) {
            ri riVar = this.M;
            if (riVar != null) {
                int i3 = riVar.f25149l;
                if ((i3 & 8) == 0 || (i3 & 1) == 0) {
                    return false;
                }
            }
            this.O.getClass();
            return true;
        }
        return false;
    }

    public final boolean k3(boolean z10) {
        qo qoVar;
        q1 q1Var;
        if (this.P5.U2()) {
            Drawable t10 = this.U0.t();
            if (t10 instanceof ah0) {
                final ah0 ah0Var = (ah0) t10;
                String C0 = this.P5.C0();
                TLRPC.TL_messages_stickerSet n02 = li.b0(this.Z5).n0(C0);
                if (n02 == null) {
                    li.b0(this.Z5).c1(C0, true, true);
                    return false;
                }
                int D0 = this.P5.D0();
                if ("🎰".equals(this.P5.C0())) {
                    if (D0 >= 0 && D0 <= 64) {
                        yt0 yt0Var = (yt0) ah0Var;
                        if (yt0Var.V0 != null || yt0Var.W0) {
                            q1Var = this;
                        } else {
                            int i3 = D0 - 1;
                            int X = yt0.X(i3 & 3);
                            int X2 = yt0.X((i3 >> 2) & 3);
                            int X3 = yt0.X(i3 >> 4);
                            if (X == 4 && X2 == 4 && X3 == 4) {
                                X = 5;
                                X3 = 5;
                                X2 = 5;
                            }
                            yt0Var.f40825c1 = X;
                            yt0Var.f40826d1 = X2;
                            yt0Var.f40827e1 = X3;
                            zi messageObject = getMessageObject();
                            int i10 = getMessageObject().I1;
                            yt0Var.W0 = true;
                            q1Var = this;
                            Utilities.f21387e.c(new mi.q2(yt0Var, n02, i10, messageObject, q1Var, z10));
                        }
                        if (q1Var.P5.O3()) {
                            ah0Var.S(Integer.MAX_VALUE, q1Var.f30029ob);
                        }
                        q1Var.P5.f26873l1 = false;
                    } else {
                        q1Var = this;
                    }
                    if (ah0Var.f32736n0 == null && !ah0Var.Z0 && n02.documents.size() > 0) {
                        yt0 yt0Var2 = (yt0) ah0Var;
                        if (yt0Var2.f32736n0 == null && !yt0Var2.Z0) {
                            yt0Var2.Z0 = true;
                            Utilities.f21387e.c(new ai.p1(yt0Var2, n02, getMessageObject().I1, getMessageObject(), q1Var, 19));
                            return true;
                        }
                    }
                } else {
                    if (ah0Var.f32736n0 == null && !ah0Var.Z0 && n02.documents.size() > 0) {
                        TLRPC.Document document = n02.documents.get(0);
                        org.telegram.messenger.w7.G(this.Z5);
                        File K = org.telegram.messenger.w7.K(document, null, true, true);
                        if (ah0Var.f32736n0 == null && !ah0Var.Z0) {
                            final String y22 = org.telegram.messenger.g0.y2(K, 0);
                            if (TextUtils.isEmpty(y22)) {
                                org.telegram.messenger.z5.q(this.Z5).a(org.telegram.messenger.w7.r(null, document), this.P5, this);
                                org.telegram.messenger.w7.G(this.Z5).X(document, n02, 1, 1);
                            } else {
                                ah0Var.Z0 = true;
                                Utilities.f21387e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final ah0 ah0Var2 = ah0Var;
                                                String str = y22;
                                                if (ah0Var2.X0) {
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    ah0 ah0Var3 = ah0Var2;
                                                                    ah0Var3.Z0 = false;
                                                                    if (!ah0Var3.W0 && ah0Var3.X0) {
                                                                        ah0Var3.C(true);
                                                                        return;
                                                                    }
                                                                    ah0Var3.l();
                                                                    ah0Var3.I();
                                                                    ah0Var3.x();
                                                                    return;
                                                                default:
                                                                    ah0 ah0Var4 = ah0Var2;
                                                                    ah0Var4.W0 = false;
                                                                    if (!ah0Var4.Z0 && ah0Var4.X0) {
                                                                        ah0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                ah0Var2.V0 = RLottieNative.b(str, null, null, null);
                                                int i11 = 0;
                                                if (ah0Var2.V0 != null) {
                                                    i11 = ah0Var2.V0.f31545a[0];
                                                }
                                                if (ah0Var2.V0 != null) {
                                                    int i12 = ah0Var2.V0.f31545a[1];
                                                }
                                                org.telegram.messenger.g0.h3(new o2(ah0Var2, i11, 9));
                                                return;
                                            default:
                                                final ah0 ah0Var3 = ah0Var;
                                                ah0Var3.f32736n0 = RLottieNative.b(y22, ah0Var3.f32725e, null, null);
                                                org.telegram.messenger.g0.h3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                ah0 ah0Var32 = ah0Var3;
                                                                ah0Var32.Z0 = false;
                                                                if (!ah0Var32.W0 && ah0Var32.X0) {
                                                                    ah0Var32.C(true);
                                                                    return;
                                                                }
                                                                ah0Var32.l();
                                                                ah0Var32.I();
                                                                ah0Var32.x();
                                                                return;
                                                            default:
                                                                ah0 ah0Var4 = ah0Var3;
                                                                ah0Var4.W0 = false;
                                                                if (!ah0Var4.Z0 && ah0Var4.X0) {
                                                                    ah0Var4.C(true);
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
                        org.telegram.messenger.z5.q(this.Z5).v(this);
                    }
                    if (D0 >= 0 && D0 < n02.documents.size()) {
                        if (!z10 && this.P5.O3() && (qoVar = (qo) hp.s1(this.Z5).f23023h4.get(C0)) != null && qoVar.f24923b == D0) {
                            ah0Var.S(qoVar.f24922a, this.f30029ob);
                        }
                        TLRPC.Document document2 = n02.documents.get(Math.max(D0, 0));
                        org.telegram.messenger.w7.G(this.Z5);
                        File K2 = org.telegram.messenger.w7.K(document2, null, true, true);
                        if (ah0Var.V0 == null && !ah0Var.W0) {
                            final String y23 = org.telegram.messenger.g0.y2(K2, 0);
                            if (TextUtils.isEmpty(y23)) {
                                org.telegram.messenger.z5.q(this.Z5).a(org.telegram.messenger.w7.r(null, document2), this.P5, this);
                                org.telegram.messenger.w7.G(this.Z5).X(document2, n02, 1, 1);
                                this.P5.f26873l1 = false;
                            } else {
                                if (z10 && ah0Var.R == null && ah0Var.S == null && ah0Var.Q == null) {
                                    ah0Var.K = 2;
                                    ah0Var.Y0 = true;
                                }
                                ah0Var.W0 = true;
                                Utilities.f21387e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final ah0 ah0Var2 = ah0Var;
                                                String str = y23;
                                                if (ah0Var2.X0) {
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    ah0 ah0Var32 = ah0Var2;
                                                                    ah0Var32.Z0 = false;
                                                                    if (!ah0Var32.W0 && ah0Var32.X0) {
                                                                        ah0Var32.C(true);
                                                                        return;
                                                                    }
                                                                    ah0Var32.l();
                                                                    ah0Var32.I();
                                                                    ah0Var32.x();
                                                                    return;
                                                                default:
                                                                    ah0 ah0Var4 = ah0Var2;
                                                                    ah0Var4.W0 = false;
                                                                    if (!ah0Var4.Z0 && ah0Var4.X0) {
                                                                        ah0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                ah0Var2.V0 = RLottieNative.b(str, null, null, null);
                                                int i11 = 0;
                                                if (ah0Var2.V0 != null) {
                                                    i11 = ah0Var2.V0.f31545a[0];
                                                }
                                                if (ah0Var2.V0 != null) {
                                                    int i12 = ah0Var2.V0.f31545a[1];
                                                }
                                                org.telegram.messenger.g0.h3(new o2(ah0Var2, i11, 9));
                                                return;
                                            default:
                                                final ah0 ah0Var3 = ah0Var;
                                                ah0Var3.f32736n0 = RLottieNative.b(y23, ah0Var3.f32725e, null, null);
                                                org.telegram.messenger.g0.h3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                ah0 ah0Var32 = ah0Var3;
                                                                ah0Var32.Z0 = false;
                                                                if (!ah0Var32.W0 && ah0Var32.X0) {
                                                                    ah0Var32.C(true);
                                                                    return;
                                                                }
                                                                ah0Var32.l();
                                                                ah0Var32.I();
                                                                ah0Var32.x();
                                                                return;
                                                            default:
                                                                ah0 ah0Var4 = ah0Var3;
                                                                ah0Var4.W0 = false;
                                                                if (!ah0Var4.Z0 && ah0Var4.X0) {
                                                                    ah0Var4.C(true);
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
                        org.telegram.messenger.z5.q(this.Z5).v(this);
                        this.P5.f26873l1 = false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean l() {
        return this.f30156ya;
    }

    @Override
    public final void l0(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.l0(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    public boolean l1(Canvas canvas) {
        org.telegram.ui.Components.t5 m10;
        int i3;
        boolean z10;
        zi ziVar = this.P5;
        ei.c3 c3Var = this.U0;
        if (ziVar != null && ziVar.E3() && (m10 = c3Var.m()) != null && (i3 = m10.d[4]) > 0) {
            float l10 = 1.0f - Utilities.l(((i3 - 90) - m10.o()) / 500.0f);
            if (l10 > 0.0f) {
                if (l10 < 1.0f) {
                    z10 = c3Var.h(canvas, null);
                } else {
                    z10 = true;
                }
                c3Var.U0 = true;
                float alpha = c3Var.getAlpha();
                c3Var.setAlpha(l10 * alpha);
                c3Var.h(canvas, null);
                c3Var.setAlpha(alpha);
                c3Var.U0 = false;
                return z10;
            }
        }
        return c3Var.h(canvas, null);
    }

    public final boolean l2() {
        int selectionOverlayColor = getSelectionOverlayColor();
        if (selectionOverlayColor != 0 && selectionOverlayColor != -65536) {
            return true;
        }
        return false;
    }

    public final void l3(Drawable drawable, int i3, int i10, int i11, int i12) {
        if (drawable != null) {
            ng0 ng0Var = this.yc;
            x1 x1Var = this.hb;
            if (ng0Var != null && ng0Var.h) {
                this.Gc = 0.0f;
            } else {
                float f10 = i10 + i12 + x1Var.f30880j0;
                this.Gc = f10 - ((int) f10);
            }
            drawable.setBounds((int) (i3 + x1Var.f30871h0), (int) (i10 + x1Var.f30885k0), (int) (i3 + i11 + x1Var.f30876i0), (int) (i10 + i12 + x1Var.f30880j0));
        }
    }

    @Override
    public final boolean m() {
        ui uiVar = this.L;
        if (uiVar != null && uiVar.f25705i) {
            ri riVar = this.M;
            if (riVar != null && (riVar.f25149l & 8) != 0) {
                return this.G;
            }
            return true;
        }
        return this.G;
    }

    public final boolean m0(float f10, int i3) {
        dh.o0 o0Var = this.O;
        if (!o0Var.H) {
            return false;
        }
        float y9 = getY() + o0Var.f9114c;
        if (y9 <= f10 || (y9 + o0Var.f9122m) - org.telegram.messenger.g0.L(16.0f) >= i3) {
            return false;
        }
        return true;
    }

    public final void m1(Canvas canvas, int i3) {
        int i10;
        xi xiVar;
        zi ziVar;
        l1 l1Var = this.Ra;
        int i11 = 0;
        if (l1Var != null) {
            if (!l1Var.p1(this, 1)) {
                this.f30162z4 = null;
                ArrayList arrayList = this.f30151y4;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < this.f30151y4.size(); i12++) {
                        o1 o1Var = (o1) this.f30151y4.get(i12);
                        if (!o1Var.f29725a.d()) {
                            o1Var.f29725a.a();
                        }
                    }
                }
            } else {
                CharacterStyle G1 = this.Ra.G1(this);
                if (G1 != this.f30162z4) {
                    this.f30162z4 = G1;
                    w70 w70Var = this.f30138x4;
                    if (w70Var != null) {
                        w70Var.a();
                        this.f30138x4 = null;
                    }
                    w70 w70Var2 = new w70();
                    this.f30138x4 = w70Var2;
                    w70Var2.D = true;
                    n70 n70Var = new n70(0);
                    w70 w70Var3 = this.f30138x4;
                    w70Var3.f39945y = n70Var;
                    w70Var3.k(5.0f);
                    ?? obj = new Object();
                    obj.f29725a = this.f30138x4;
                    obj.f29726b = -3;
                    if (this.f30151y4 == null) {
                        this.f30151y4 = new ArrayList();
                    }
                    this.f30151y4.add(obj);
                    if (this.f30162z4 != null && !E1(obj, n70Var, this.f30020o2, -2) && (((xiVar = this.f29985l3) == null || !F1(obj, n70Var, xiVar.f26387e)) && (ziVar = this.P5) != null)) {
                        F1(obj, n70Var, ziVar.f26927z2);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.f30151y4;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            zi ziVar2 = this.P5;
            if (ziVar2 != null && ziVar2.Q3()) {
                i10 = org.telegram.ui.ActionBar.k6.Ac;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f28298ze;
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.Pb);
            while (i11 < this.f30151y4.size()) {
                o1 o1Var2 = (o1) this.f30151y4.get(i11);
                if (o1Var2.f29726b == i3) {
                    w70 w70Var4 = o1Var2.f29725a;
                    w70Var4.g(org.telegram.ui.ActionBar.k6.r1(0.85f, w02), org.telegram.ui.ActionBar.k6.r1(2.0f, w02), org.telegram.ui.ActionBar.k6.r1(3.5f, w02), org.telegram.ui.ActionBar.k6.r1(6.0f, w02));
                    w70Var4.draw(canvas);
                    invalidate();
                    if (w70Var4.c()) {
                        this.f30151y4.remove(i11);
                        i11--;
                    }
                }
                i11++;
            }
        }
    }

    public final boolean m2() {
        ArrayList arrayList;
        xi xiVar = this.f29985l3;
        if (xiVar != null && (arrayList = xiVar.f26387e) != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (!((wi) obj).f26217y.isEmpty()) {
                    return true;
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().f26927z2 != null) {
            ArrayList arrayList2 = getMessageObject().f26927z2;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                if (!((wi) obj2).f26217y.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void m3() {
        this.f30140x6 = true;
        this.f30153y6 = 1000;
        this.A6 = System.currentTimeMillis();
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean n0() {
        org.telegram.messenger.y8 y8Var;
        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(this.Z5);
        String filename = getFilename();
        if (filename == null || (y8Var = (org.telegram.messenger.y8) G.h.get(filename)) == null || !y8Var.T) {
            return false;
        }
        y8Var.T = false;
        return true;
    }

    public void n1(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.n1(android.graphics.Canvas):void");
    }

    public final void n2(int i3, int i10, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int i11 = i10 - i3;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList.size()) {
                break;
            }
            wi wiVar = (wi) arrayList.get(i12);
            if (i3 >= wiVar.f26212n && i3 < wiVar.f26213r) {
                this.A0 = i12;
                e3();
                try {
                    n70 Z2 = Z2();
                    Z2.f32362c = true;
                    Z2.d(wiVar.f26210e, i3, 0.0f);
                    wiVar.f26210e.getSelectionPath(i3, i10, Z2);
                    Z2.a();
                    float f10 = wiVar.f26215w + wiVar.h;
                    if (i10 >= wiVar.f26212n + i11) {
                        for (int i13 = i12 + 1; i13 < arrayList.size(); i13++) {
                            wi wiVar2 = (wi) arrayList.get(i13);
                            int i14 = wiVar2.f26213r - wiVar2.f26212n;
                            n70 Z22 = Z2();
                            Z22.f32362c = true;
                            float f11 = f10 + wiVar2.f26211f;
                            Z22.d(wiVar2.f26210e, 0, f11);
                            f10 = f11 + wiVar2.f26215w + wiVar2.h;
                            wiVar2.f26210e.getSelectionPath(0, i10 - wiVar2.f26212n, Z22);
                            Z22.a();
                            if (i10 < (wiVar.f26212n + i14) - 1) {
                                break;
                            }
                        }
                    }
                    if (this.B0) {
                        this.f30140x6 = true;
                        this.f30153y6 = 2500;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                invalidate();
            } else {
                i12++;
            }
        }
        this.i3 = -1;
        this.f29961j3 = -1;
    }

    public final void n3(byte[] bArr) {
        zi ziVar = this.Q5;
        if (ziVar == null) {
            ziVar = this.P5;
        }
        if (ziVar == null) {
            this.f30009n3 = null;
            return;
        }
        sg0 sg0Var = this.f30009n3;
        if (sg0Var == null || !sg0Var.f38016f || !Arrays.equals(sg0Var.f38017g, bArr)) {
            this.f30009n3 = new sg0(this, ziVar.f1(), bArr);
        }
        this.B0 = true;
    }

    @Override
    public final void o(long j10, long j11) {
        float min;
        int i3;
        TLRPC.Message message;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.P5.F0 = j10;
        RadialProgress2 radialProgress2 = this.Q0;
        radialProgress2.p(true, min);
        if (j10 == j11 && ((this.M != null || ((message = this.P5.f26868k) != null && message.paid_message_stars > 0)) && yy.C(this.Z5).J(this.P5.f1()) && ((i3 = this.N3) == 1 || (i3 == 4 && this.L1 == 5)))) {
            this.S0 = true;
            getIconForCurrentState();
            radialProgress2.setIcon(6, false, true);
        }
        long j12 = this.f30159z1;
        if (j12 > 0 && Math.abs(j12 - j11) > 1048576) {
            this.f30159z1 = j11;
        }
        y0(j10, j11);
    }

    public final void o0(Bitmap bitmap, boolean z10) {
        boolean M4 = zi.M4(this.P5.f26868k);
        ei.c3 c3Var = this.U0;
        if (M4) {
            if (MediaController.B().I(this.P5)) {
                c3Var.f21272u0 = false;
                c3Var.Q0();
                return;
            }
            c3Var.f21272u0 = true;
            c3Var.P0(false);
            return;
        }
        if (z10) {
            zi ziVar = MediaController.B().f21348v0;
            if (ziVar != null && ziVar.i4()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        c3Var.f21272u0 = z10;
        if (bitmap != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
            c3Var.Z = null;
            c3Var.f21231b0 = null;
            c3Var.f21234c0 = null;
            c3Var.f21236d0 = null;
            c3Var.f21229a1.setShader(null);
            c3Var.N0(bitmapDrawable);
            c3Var.f21257n1 = true;
            c3Var.f21249i1 = 0.0f;
            c3Var.R0(c3Var.f21256n0);
        }
        if (z10) {
            c3Var.P0(false);
        } else {
            c3Var.Q0();
        }
    }

    public void o1(Canvas canvas, float f10, Integer num) {
        boolean z10;
        boolean z11 = this.f30144xb;
        float f11 = 1.0f;
        dh.o0 o0Var = this.O;
        if (z11) {
            o0Var.f9112a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.U4 && k2()) {
            if (o0Var.f9112a > 0.0f) {
                x();
            }
            if (getAlpha() * f10 != 1.0f) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (getAlpha() * f10 * 255.0f), 31);
                z10 = true;
            } else {
                z10 = false;
            }
            int i3 = (o0Var.f9112a > 0.0f ? 1 : (o0Var.f9112a == 0.0f ? 0 : -1));
            x1 x1Var = this.hb;
            if (i3 <= 0 && x1Var.f30936x0 && this.M == null && !this.f30144xb) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + x1Var.f30880j0);
                o0Var.A = 0.0f;
                o0Var.B = false;
                if (x1Var.h) {
                    f11 = x1Var.L1;
                }
                o0Var.d(canvas, f11, num);
                canvas.restore();
            } else {
                o0Var.A = 0.0f;
                o0Var.B = false;
                if (x1Var.h) {
                    f11 = x1Var.L1;
                }
                o0Var.d(canvas, f11, num);
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public final void o3(CharacterStyle characterStyle) {
        int i3;
        int i10;
        int i11;
        int i12;
        zi ziVar = this.Q5;
        if (ziVar == null) {
            ziVar = this.P5;
        }
        this.B0 = false;
        ArrayList arrayList = this.f30124w4;
        if (ziVar != null && ziVar.f26868k.message != null && characterStyle != null) {
            if (this.f29985l3 != null && !TextUtils.isEmpty(ziVar.f26924z)) {
                CharSequence charSequence = ziVar.f26924z;
                if (charSequence instanceof Spannable) {
                    Spanned spanned = (Spanned) charSequence;
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
                    if (characterStyleArr != null && characterStyleArr.length > 0) {
                        for (CharacterStyle characterStyle2 : characterStyleArr) {
                            if (characterStyle2 == characterStyle) {
                                i12 = spanned.getSpanStart(characterStyle);
                                i11 = spanned.getSpanEnd(characterStyle);
                                break;
                            }
                        }
                    }
                    i11 = -1;
                    i12 = -1;
                    if (i12 >= 0 && i11 >= 0) {
                        int i13 = i11 - i12;
                        for (int i14 = 0; i14 < this.f29985l3.f26387e.size(); i14++) {
                            wi wiVar = (wi) this.f29985l3.f26387e.get(i14);
                            if (i12 >= wiVar.f26212n && i12 < wiVar.f26213r) {
                                this.A0 = i14;
                                this.B0 = false;
                                e3();
                                try {
                                    n70 Z2 = Z2();
                                    Z2.d(wiVar.f26210e, i12, 0.0f);
                                    wiVar.f26210e.getSelectionPath(i12, i11, Z2);
                                    if (i11 >= wiVar.f26212n + i13) {
                                        for (int i15 = i14 + 1; i15 < this.f29985l3.f26387e.size(); i15++) {
                                            wi wiVar2 = (wi) this.f29985l3.f26387e.get(i15);
                                            int i16 = wiVar2.f26213r - wiVar2.f26212n;
                                            n70 Z22 = Z2();
                                            Z22.d(wiVar2.f26210e, 0, wiVar2.f26215w);
                                            wiVar2.f26210e.getSelectionPath(0, i11 - wiVar2.f26212n, Z22);
                                            if (i11 < (wiVar.f26212n + i16) - 1) {
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                invalidate();
                                return;
                            }
                        }
                    }
                }
            }
            CharSequence charSequence2 = ziVar.v;
            if ((charSequence2 instanceof Spanned) && ziVar.f26927z2 != null) {
                Spanned spanned2 = (Spanned) charSequence2;
                CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) spanned2.getSpans(0, spanned2.length(), CharacterStyle.class);
                if (characterStyleArr2 != null && characterStyleArr2.length > 0) {
                    for (CharacterStyle characterStyle3 : characterStyleArr2) {
                        if (characterStyle3 == characterStyle) {
                            i10 = spanned2.getSpanStart(characterStyle);
                            i3 = spanned2.getSpanEnd(characterStyle);
                            break;
                        }
                    }
                }
                i3 = -1;
                i10 = -1;
                if (i10 >= 0 && i3 >= 0) {
                    int i17 = i3 - i10;
                    for (int i18 = 0; i18 < ziVar.f26927z2.size(); i18++) {
                        wi wiVar3 = (wi) ziVar.f26927z2.get(i18);
                        if (i10 >= wiVar3.f26212n && i10 < wiVar3.f26213r) {
                            this.A0 = i18;
                            this.B0 = false;
                            e3();
                            try {
                                n70 Z23 = Z2();
                                Z23.d(wiVar3.f26210e, i10, 0.0f);
                                wiVar3.f26210e.getSelectionPath(i10, i3, Z23);
                                if (i3 >= wiVar3.f26212n + i17) {
                                    for (int i19 = i18 + 1; i19 < ziVar.f26927z2.size(); i19++) {
                                        wi wiVar4 = (wi) ziVar.f26927z2.get(i19);
                                        int i20 = wiVar4.f26213r - wiVar4.f26212n;
                                        n70 Z24 = Z2();
                                        Z24.d(wiVar4.f26210e, 0, wiVar4.f26215w);
                                        wiVar4.f26210e.getSelectionPath(0, i3 - wiVar4.f26212n, Z24);
                                        if (i3 < (wiVar3.f26212n + i20) - 1) {
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            invalidate();
                            return;
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.A0 = -1;
                this.B0 = false;
                e3();
                invalidate();
            }
        } else if (!arrayList.isEmpty()) {
            this.A0 = -1;
            this.B0 = false;
            e3();
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        q1 q1Var;
        float f10;
        float f11;
        th.e eVar;
        th.e eVar2;
        org.telegram.ui.Components.w8 w8Var;
        super.onAttachedToWindow();
        za.p pVar = this.f30118vc;
        if (pVar != null) {
            pVar.a();
            this.f30118vc = null;
        }
        za.p pVar2 = new za.p(hs.f(this.Z5), this);
        pVar2.b(hs.E0);
        pVar2.d(hs.m1);
        pVar2.d(hs.f23260l1);
        pVar2.d(hs.f23246i4);
        pVar2.d(hs.W2);
        this.f30118vc = pVar2;
        zi ziVar = this.P5;
        if (ziVar != null) {
            ziVar.f26861i1 = false;
            cv cvVar = ziVar.f26915w2;
            if (cvVar != null) {
                cvVar.b(this);
            }
        }
        cv cvVar2 = this.hb.M0;
        if (cvVar2 != null) {
            cvVar2.b(this);
        }
        v1 v1Var = this.f29938h3;
        if (v1Var != null && (w8Var = v1Var.f30711b) != null) {
            w8Var.e();
        }
        w1 w1Var = this.f30122w2;
        if (w1Var != null && (eVar2 = w1Var.f30785m) != null) {
            eVar2.a();
        }
        w1 w1Var2 = this.f30122w2;
        if (w1Var2 != null && (eVar = w1Var2.f30786n) != null) {
            eVar.a();
        }
        ArrayList arrayList = this.P4;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((p1) obj).a();
        }
        zi ziVar2 = this.Q5;
        if (ziVar2 != null) {
            ziVar2.f26861i1 = false;
            q1Var = this;
            q1Var.t3(ziVar2, this.R5, this.T5, this.S5, this.U5, this.V5);
            q1Var.Q5 = null;
            q1Var.R5 = null;
        } else {
            q1Var = this;
        }
        CheckBoxBase checkBoxBase = q1Var.m1;
        if (checkBoxBase != null) {
            checkBoxBase.f31329l = true;
        }
        CheckBoxBase checkBoxBase2 = q1Var.f29983l1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f31329l = true;
        }
        f01 f01Var = q1Var.f29908f0;
        if (f01Var != null) {
            f01Var.a();
        }
        CheckBoxBase checkBoxBase3 = q1Var.O7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f31329l = true;
        }
        if (q1Var.f29901e7 != null) {
            int i10 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = q1Var.f29901e7;
                if (i10 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i10].f31329l = true;
                i10++;
            }
        }
        q1Var.O0 = true;
        float f12 = 0.0f;
        q1Var.Vc = 0.0f;
        q1Var.Uc = 0.0f;
        q1Var.f30059r1 = 0;
        X3();
        ImageReceiver imageReceiver = q1Var.f30165z7;
        imageReceiver.H0((View) getParent());
        imageReceiver.P();
        m1 m1Var = q1Var.f29920fc;
        if (m1Var != null) {
            m1Var.f29615b.P();
        }
        m1 m1Var2 = q1Var.f29933gc;
        if (m1Var2 != null) {
            m1Var2.f29615b.P();
        }
        O();
        zi ziVar3 = q1Var.P5;
        if (ziVar3 != null) {
            setAvatar(ziVar3);
        }
        int i11 = q1Var.L1;
        if (i11 == 4 && q1Var.G5) {
            boolean I = MediaController.B().I(q1Var.P5);
            q1Var.E1 = I;
            if (I) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            q1Var.G1 = f11;
            q1Var.F1 = 0;
        } else {
            q1Var.E1 = false;
            q1Var.G1 = 0.0f;
            if ((i11 == 4 || i11 == 2) && q1Var.A1) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            q1Var.D1 = f10;
        }
        if (getDelegate() != null && getDelegate().q2() != null) {
            i9 q22 = getDelegate().q2();
            q22.getClass();
            if (getMessageObject() != null && getMessageObject().f1() == q22.f30692w) {
                q22.W = q1Var;
            }
        }
        if (q1Var.L1 == 5) {
            boolean I2 = MediaController.B().I(q1Var.P5);
            b1 C1 = C1();
            if (I2) {
                f12 = 1.0f;
            }
            C1.h = f12;
        }
        dh.o0 o0Var = q1Var.O;
        ArrayList arrayList2 = o0Var.f9128s;
        o0Var.D = true;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            ((dh.l0) arrayList2.get(i12)).a();
        }
        org.telegram.messenger.n6 n6Var = q1Var.f30003mb;
        if (n6Var != null) {
            n6Var.a();
        }
        l4 l4Var = q1Var.W5;
        if (l4Var != null) {
            ArrayList arrayList3 = l4Var.f29550c;
            if (!l4Var.C) {
                l4Var.C = true;
                yh.e eVar3 = l4Var.f29557l;
                if (eVar3 != null) {
                    eVar3.b(l4Var.f29548a);
                }
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    k4 k4Var = (k4) arrayList3.get(i13);
                    if (!k4Var.N) {
                        k4Var.N = true;
                        k4Var.f29498f.P();
                    }
                }
            }
        }
        P3();
        zi ziVar4 = q1Var.P5;
        if (ziVar4 != null && ziVar4.D == 20 && q1Var.W9 != null) {
            invalidate();
        }
        org.telegram.ui.Components.e5 e5Var = q1Var.f30041pa;
        if (e5Var != null) {
            e5Var.a();
        }
        org.telegram.ui.Components.e5 e5Var2 = q1Var.f30054qa;
        if (e5Var2 != null) {
            e5Var2.a();
        }
        yh.e eVar4 = q1Var.P9;
        if (eVar4 != null) {
            if (eVar4.f59502i) {
                yh.e U2 = U2();
                q1Var.P9 = U2;
                Integer num = q1Var.Q9;
                if (num != null) {
                    U2.f59504k.put(this, num);
                }
            } else {
                eVar4.a(this);
            }
        }
        l0 l0Var = q1Var.f30119w;
        if (l0Var != null) {
            ArrayList arrayList4 = l0Var.f29536q;
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((k0) arrayList4.get(i14)).a();
            }
        }
        cv0 cv0Var = q1Var.f29909f1;
        if (cv0Var != null) {
            for (int i15 = 0; i15 < cv0Var.f32841b; i15++) {
                cv0Var.f32842c[i15].a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        u1 u1Var;
        org.telegram.ui.Components.w8 w8Var;
        cg.p pVar;
        th.e eVar;
        th.e eVar2;
        super.onDetachedFromWindow();
        za.p pVar2 = this.f30118vc;
        if (pVar2 != null) {
            pVar2.a();
            this.f30118vc = null;
        }
        AnimatorSet animatorSet = this.X5;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.X5 = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
            setRotation(0.0f);
        }
        CheckBoxBase checkBoxBase = this.m1;
        if (checkBoxBase != null) {
            checkBoxBase.f31329l = false;
        }
        w1 w1Var = this.f30122w2;
        if (w1Var != null && (eVar2 = w1Var.f30785m) != null) {
            eVar2.f55402b.R();
            eVar2.f55418y.f();
        }
        w1 w1Var2 = this.f30122w2;
        if (w1Var2 != null && (eVar = w1Var2.f30786n) != null) {
            eVar.f55402b.R();
            eVar.f55418y.f();
        }
        w1 w1Var3 = this.f30122w2;
        if (w1Var3 != null && (pVar = w1Var3.f30782j) != null) {
            pVar.b();
            this.f30122w2.f30782j = null;
        }
        cv cvVar = this.P5.f26915w2;
        if (cvVar != null) {
            cvVar.f(this);
        }
        x1 x1Var = this.hb;
        cv cvVar2 = x1Var.M0;
        if (cvVar2 != null) {
            cvVar2.f(this);
        }
        ArrayList arrayList = this.P4;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((p1) obj).b();
        }
        v1 v1Var = this.f29938h3;
        if (v1Var != null && (w8Var = v1Var.f30711b) != null) {
            w8Var.f();
        }
        CheckBoxBase checkBoxBase2 = this.f29983l1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f31329l = false;
        }
        if (this.f29901e7 != null) {
            int i10 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.f29901e7;
                if (i10 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i10].f31329l = false;
                i10++;
            }
        }
        CheckBoxBase checkBoxBase3 = this.O7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f31329l = false;
        }
        this.O0 = false;
        l4 l4Var = this.W5;
        if (l4Var != null) {
            l4Var.e();
        }
        this.f30165z7.R();
        m1 m1Var = this.f29920fc;
        if (m1Var != null) {
            m1Var.f29615b.R();
        }
        m1 m1Var2 = this.f29933gc;
        if (m1Var2 != null) {
            m1Var2.f29615b.R();
        }
        f01 f01Var = this.f29908f0;
        if (f01Var != null) {
            f01Var.b();
        }
        O();
        if (this.F3 && (u1Var = this.f30082t0) != null && u1Var.d != null && u1Var.f30628e != null) {
            zb D = zb.D();
            String str = this.f30082t0.d;
            if (str != null) {
                D.A.remove(str);
            }
            this.F3 = false;
        }
        cv0 cv0Var = this.f29909f1;
        if (cv0Var != null) {
            cv0Var.a(this);
        }
        org.telegram.messenger.z5.q(this.Z5).v(this);
        if (getDelegate() != null && getDelegate().q2() != null) {
            i9 q22 = getDelegate().q2();
            q22.getClass();
            if (getMessageObject() != null && getMessageObject().f1() == q22.f30692w) {
                q22.W = null;
            }
        }
        x1Var.f30932w0 = false;
        if (MediaController.B().I(this.P5)) {
            org.telegram.ui.ActionBar.k6.A0().f31756i = null;
        }
        ValueAnimator valueAnimator = this.f30093tb;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f30093tb.cancel();
        }
        this.O.p();
        this.f30080sb = false;
        org.telegram.messenger.n6 n6Var = this.f30003mb;
        if (n6Var != null) {
            n6Var.e();
        }
        org.telegram.ui.Components.e5 e5Var = this.f30041pa;
        if (e5Var != null) {
            e5Var.b();
        }
        org.telegram.ui.Components.e5 e5Var2 = this.f30054qa;
        if (e5Var2 != null) {
            e5Var2.b();
        }
        yh.e eVar3 = this.P9;
        if (eVar3 != null) {
            eVar3.b(this);
        }
        l0 l0Var = this.f30119w;
        if (l0Var != null) {
            ArrayList arrayList2 = l0Var.f29536q;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                k0 k0Var = (k0) arrayList2.get(i11);
                int i12 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = k0Var.f29468c;
                    if (i12 < imageReceiverArr.length) {
                        imageReceiverArr[i12].R();
                        i12++;
                    }
                }
            }
        }
        cg.j.d().f(this.Ac);
    }

    @Override
    public void onDraw(Canvas canvas) {
        d1(canvas);
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z10;
        gk0 Z3 = Z3();
        int i3 = 0;
        if (Z3 != null && motionEvent.isFromSource(8194)) {
            float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.f29946i0 + this.f30094u0;
            motionEvent.offsetLocation(-this.f30018o0, -topicSeparatorTopPadding);
            Rect rect = Z3.f26435b;
            if (Z3.f34132e0 != null && Z3.f34133f0) {
                motionEvent.offsetLocation((-rect.left) + Z3.f34138k0, -rect.top);
                try {
                    if (motionEvent.getX() >= 0.0f && motionEvent.getX() < Z3.u0() && motionEvent.getY() >= 0.0f && motionEvent.getY() < Z3.f34137j0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Z3.f34132e0.l(motionEvent, z10);
                    motionEvent.offsetLocation(rect.left - Z3.f34138k0, rect.top);
                } catch (Throwable th2) {
                    motionEvent.offsetLocation(rect.left - Z3.f34138k0, rect.top);
                    throw th2;
                }
            }
            motionEvent.offsetLocation(this.f30018o0, topicSeparatorTopPadding);
        }
        int x10 = (int) motionEvent.getX();
        int M1 = (int) M1(motionEvent);
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            while (true) {
                SparseArray sparseArray = this.f30131wb;
                if (i3 >= sparseArray.size()) {
                    break;
                } else if (((Rect) sparseArray.valueAt(i3)).contains(x10, M1)) {
                    int keyAt = sparseArray.keyAt(i3);
                    if (keyAt != this.Kb) {
                        this.Kb = keyAt;
                        g3(keyAt, 32768, null);
                    }
                    return true;
                } else {
                    i3++;
                }
            }
        } else if (motionEvent.getAction() == 10) {
            this.Kb = 0;
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public void onLayout(boolean r28, int r29, int r30, int r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i3, int i10) {
        q1 q1Var;
        int i11;
        zi ziVar = this.P5;
        boolean z10 = true;
        if (ziVar == null || (!ziVar.I() && this.U3 == org.telegram.messenger.g0.f22608q.y)) {
            q1Var = this;
        } else {
            this.C0 = true;
            zi ziVar2 = this.P5;
            this.P5 = null;
            q1Var = this;
            q1Var.u3(ziVar2, this.L, this.G, this.F, this.H, false);
            q1Var.C0 = false;
        }
        V3();
        int i12 = q1Var.W + q1Var.f29922g0 + q1Var.f29946i0 + q1Var.f30106v0 + q1Var.f30134x0 + q1Var.f29894e0;
        kh.a draftMessageMeasureController = getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(q1Var.P5)) {
            int max = Math.max(0, (((draftMessageMeasureController.f17251a.getHeight() - draftMessageMeasureController.f17251a.getPaddingTop()) - draftMessageMeasureController.f17251a.getPaddingBottom()) - draftMessageMeasureController.d) - i12);
            if (max <= 0) {
                z10 = false;
            }
            draftMessageMeasureController.f17254e = z10;
            if (draftMessageMeasureController.f17252b > 0 && !z10) {
                draftMessageMeasureController.c(0, 0L);
            }
            i11 = max + i12;
        } else {
            i11 = i12;
        }
        q1Var.Dc = Math.max(0, i11 - i12);
        setMeasuredDimension(View.MeasureSpec.getSize(i3), i11);
    }

    @Override
    public final void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (this.J6) {
            zi ziVar = this.P5;
            if (ziVar != null && (charSequence2 = ziVar.v) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.P5.v);
                return;
            }
            zi ziVar2 = this.P5;
            if (ziVar2 != null && (charSequence = ziVar2.f26924z) != null && charSequence.length() > 0) {
                viewStructure.setText(this.P5.f26924z);
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
        if (this.P5 != null) {
            Runnable runnable = this.Bc;
            if (runnable != null) {
                runnable.run();
                return;
            }
            Runnable runnable2 = this.Cc;
            if (runnable2 != null) {
                runnable2.run();
            }
            super.invalidate();
            if ((this.f29847a6 || (this.L != null && q2())) && getParent() != null) {
                View view = (View) getParent();
                if (view.getParent() != null) {
                    view.invalidate();
                    ((View) view.getParent()).invalidate();
                }
            }
            if (this.Vb && (l1Var = this.Ra) != null) {
                l1Var.q();
            }
        }
    }

    public final boolean p1(Canvas canvas) {
        boolean z10 = this.f30144xb;
        float f10 = 1.0f;
        dh.o0 o0Var = this.O;
        if (z10) {
            o0Var.f9112a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z11 = false;
        if (!this.U4 || !k2()) {
            return false;
        }
        if (o0Var.f9112a > 0.0f) {
            x();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z11 = true;
        }
        int i3 = (o0Var.f9112a > 0.0f ? 1 : (o0Var.f9112a == 0.0f ? 0 : -1));
        x1 x1Var = this.hb;
        if (i3 <= 0 && x1Var.f30936x0 && this.M == null && !this.f30144xb) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + x1Var.f30880j0);
            if (x1Var.h) {
                f10 = x1Var.L1;
            }
            o0Var.e(canvas, f10);
            canvas.restore();
        } else {
            if (x1Var.h) {
                f10 = x1Var.L1;
            }
            o0Var.e(canvas, f10);
        }
        if (z11) {
            canvas.restore();
        }
        return true;
    }

    public final void p2() {
        l1 l1Var = this.Ra;
        if (l1Var != null && l1Var.d()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void p3(int i3) {
        zi ziVar = this.Q5;
        if (ziVar == null) {
            ziVar = this.P5;
        }
        if (ziVar == null) {
            this.f30009n3 = null;
            return;
        }
        sg0 sg0Var = this.f30009n3;
        if (sg0Var == null || !sg0Var.f38015e || sg0Var.f38014c != (-i3)) {
            this.f30009n3 = new sg0(this, ziVar.f1(), i3);
        }
        this.B0 = true;
    }

    @Override
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        q1 q1Var;
        ArrayList arrayList;
        l1 l1Var = this.Ra;
        int i10 = 0;
        if (l1Var != null && l1Var.m2(i3)) {
            return false;
        }
        if (i3 == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                D0(false);
                return true;
            } else if (this.P5.D == 16) {
                this.Ra.B0(this, this.R3, this.S3);
                return true;
            } else {
                C0();
                return true;
            }
        }
        if (i3 == 2131296267) {
            E0();
        } else if (i3 == 2131296264) {
            l1 l1Var2 = this.Ra;
            if (l1Var2 != null) {
                if (this.P5.D == 16) {
                    l1Var2.p0(this, 0.0f, 0.0f);
                } else {
                    l1Var2.B0(this, this.R3, this.S3);
                }
            }
        } else {
            if (i3 == 2131296265) {
                l1 l1Var3 = this.Ra;
                if (l1Var3 != null) {
                    TLRPC.Chat chat = this.f30092ta;
                    if (chat != null) {
                        q1Var = this;
                        l1Var3.U(q1Var, chat, this.P5.f26868k.fwd_from.channel_post, this.f29936h1, this.f29947i1, false);
                    } else {
                        q1Var = this;
                        TLRPC.User user = q1Var.f30066ra;
                        if (user != null) {
                            l1Var3.s0(this, user, q1Var.f29936h1, q1Var.f29947i1);
                        } else if (q1Var.f30104ua != null) {
                            l1Var3.p(this);
                        }
                    }
                }
            } else {
                q1Var = this;
                if (i3 == 2131296268) {
                    l1 l1Var4 = q1Var.Ra;
                    if (l1Var4 != null) {
                        l1Var4.G0(this);
                    }
                } else if (i3 == 2131296263 && q1Var.Ra != null && (arrayList = q1Var.P5.f26927z2) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i10);
                        i10++;
                        wi wiVar = (wi) obj;
                        if (wiVar.O) {
                            q1Var.Ra.J(wiVar);
                            break;
                        }
                    }
                }
            }
            if ((!zi.S4(q1Var.P5.f26868k) || q1Var.P5.i4() || (q1Var.P5.J3() && MediaController.B().I(q1Var.P5))) && q1Var.E4.g(null, i3, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i3, bundle);
        }
        q1Var = this;
        if (!zi.S4(q1Var.P5.f26868k)) {
        }
        return true;
    }

    @Override
    public final boolean q() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.q():boolean");
    }

    public final int q0(zi ziVar, ui uiVar, boolean z10) {
        ui uiVar2 = uiVar;
        ei.c3 c3Var = this.U0;
        c3Var.f21260p0 = true;
        ImageReceiver imageReceiver = this.f30165z7;
        imageReceiver.f21260p0 = true;
        ImageReceiver imageReceiver2 = this.S7;
        imageReceiver2.f21260p0 = true;
        ImageReceiver imageReceiver3 = this.E7;
        imageReceiver3.f21260p0 = true;
        int i3 = 0;
        if (uiVar2 != null) {
            ArrayList arrayList = uiVar2.d;
            if (arrayList.size() != 1) {
                if (arrayList.size() != uiVar2.f25703f.size()) {
                    uiVar2.a();
                }
                this.Sc = 0;
                int i10 = 0;
                while (i3 < arrayList.size()) {
                    zi ziVar2 = (zi) arrayList.get(i3);
                    ri d = uiVar2.d(ziVar2);
                    if (d != null && (d.f25149l & 1) != 0) {
                        t3(ziVar2, uiVar2, false, false, false, false);
                        if (z10 && !TextUtils.isEmpty(this.f30021o3)) {
                            N3();
                            this.Sc = (int) (i10 + this.f30073s3);
                            this.Tc = this.f29985l3;
                        }
                        i10 = this.f30106v0 + this.f30134x0 + i10;
                    }
                    i3++;
                    uiVar2 = uiVar;
                }
                return i10;
            }
        }
        t3(ziVar, uiVar, false, false, false, false);
        c3Var.f21260p0 = false;
        imageReceiver.f21260p0 = false;
        imageReceiver2.f21260p0 = false;
        imageReceiver3.f21260p0 = false;
        N3();
        return this.f30106v0 + this.f30134x0;
    }

    public final void q1(Canvas canvas, cv cvVar, float f10, ColorFilter colorFilter) {
        Canvas canvas2;
        int save;
        if (cvVar != null && f10 > 0.0f && cvVar.C()) {
            if (f10 < 1.0f) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f10 * 255.0f), 31);
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(this.f30018o0, this.f30094u0);
            cvVar.i(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public final boolean q2() {
        if (this.f30086t4.f18959a <= 0 && this.O.f9125p) {
            zi ziVar = this.P5;
            if (ziVar == null || !ziVar.f26895r1) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void q3(String str) {
        r3(false, -1, str, false);
    }

    public final void r0(q1 q1Var) {
        if (q1Var == null) {
            return;
        }
        q1Var.f29900e6 = this.f29900e6;
        q1Var.f30063r6 = this.f30063r6;
        q1Var.f29928g6 = this.f29928g6;
        q1Var.f29941h6 = this.f29941h6;
        q1Var.f29951i6 = this.f29951i6;
        q1Var.f29964j6 = this.f29964j6;
        q1Var.f29975k6 = this.f29975k6;
        q1Var.f29988l6 = this.f29988l6;
        q1Var.f29998m6 = this.f29998m6;
        q1Var.f30011n6 = this.f30011n6;
        q1Var.f30024o6 = this.f30024o6;
        q1Var.f30037p6 = this.f30037p6;
        q1Var.s6 = this.s6;
        q1Var.f30088t6 = this.f30088t6;
        q1Var.f30100u6 = this.f30100u6;
        q1Var.V6 = this.V6;
        q1Var.W6 = this.W6;
        q1Var.X6 = this.X6;
        q1Var.Y6 = this.Y6;
        q1Var.Z6 = this.Z6;
    }

    public final void r1(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.r1(android.graphics.Canvas):void");
    }

    public final void r2() {
        if (this.L != null && getParent() != null) {
            ((ViewGroup) getParent()).invalidate();
        }
        invalidate();
    }

    public final boolean r3(boolean r25, int r26, java.lang.String r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.r3(boolean, int, java.lang.String, boolean):boolean");
    }

    @Override
    public final void requestLayout() {
        if (this.C0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(q1 q1Var) {
        yh.e eVar;
        if (q1Var != null && (eVar = q1Var.P9) != null) {
            int i3 = (Integer) eVar.f59504k.get(q1Var);
            if (i3 == null) {
                i3 = 0;
            }
            this.Q9 = i3;
            yh.e eVar2 = this.P9;
            if (eVar2 != null) {
                eVar2.f59504k.put(this, i3);
            }
        }
    }

    public final void s1(Canvas canvas, Integer num, float f10, boolean z10) {
        ri riVar = this.M;
        if (riVar != null) {
            int i3 = riVar.f25149l;
            if ((i3 & 8) == 0 || (i3 & 1) == 0) {
                return;
            }
        }
        dh.o0 o0Var = this.O;
        o0Var.getClass();
        o0Var.A = f10;
        o0Var.B = z10;
        o0Var.d(canvas, this.hb.L1, num);
    }

    public final boolean s2() {
        ui uiVar;
        if (t2() && (uiVar = this.L) != null && this.M != null && !uiVar.f25700b && !uiVar.f25705i) {
            return true;
        }
        return false;
    }

    public final void s3(float f10, float f11, float f12, float f13) {
        ei.c3 c3Var = this.U0;
        c3Var.y0(f10, f11, f12, f13);
        int i3 = this.L1;
        if (i3 != 4 && i3 != 2) {
            return;
        }
        this.L3 = (int) (c3Var.L0 + org.telegram.messenger.g0.L(8.0f));
        int L = (int) (c3Var.M0 + org.telegram.messenger.g0.L(8.0f));
        this.M3 = L;
        int i10 = this.L3;
        int L2 = org.telegram.messenger.g0.L(24.0f) + this.M3;
        this.R0.r(i10, L, org.telegram.messenger.g0.L(24.0f) + i10, L2);
        this.J3 = (int) com.google.android.recaptcha.internal.a.z(c3Var.N0, org.telegram.messenger.g0.L(48.0f), 2.0f, f10);
        int z10 = (int) com.google.android.recaptcha.internal.a.z(c3Var.O0, org.telegram.messenger.g0.L(48.0f), 2.0f, c3Var.M0);
        this.K3 = z10;
        int i11 = this.J3;
        int L3 = org.telegram.messenger.g0.L(48.0f) + this.K3;
        this.Q0.r(i11, z10, org.telegram.messenger.g0.L(48.0f) + i11, L3);
    }

    public void setAllowAssistant(boolean z10) {
        this.J6 = z10;
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
        if (this.f29919fb) {
            this.f29932gb = f10;
            invalidate();
        } else {
            super.setAlpha(f10);
        }
        ri riVar = this.M;
        if ((riVar != null && (riVar.f25142c != 0 || riVar.f25140a != 0)) || ((this.f30146y && !zi.S4(this.P5.f26868k)) || this.P7 == null || this.Q7 == null)) {
            ri riVar2 = this.M;
            if (riVar2 != null) {
                int i3 = riVar2.f25149l;
                if ((i3 & 8) == 0 || (i3 & 1) == 0) {
                    return;
                }
            }
            this.O.getClass();
        }
        invalidate();
    }

    public void setAnimationOffsetX(float f10) {
        if (this.Vc != f10) {
            this.Vc = f10;
            X3();
        }
    }

    public void setAvatar(zi ziVar) {
        if (ziVar != null) {
            int i3 = ziVar.I1;
            if (!this.F6 && !e2()) {
                this.f29979ka = null;
                return;
            }
            Drawable drawable = ziVar.f26870k2;
            ImageReceiver imageReceiver = this.f30165z7;
            if (drawable != null) {
                imageReceiver.w0(drawable);
                return;
            }
            TLRPC.User user = this.f29955ia;
            org.telegram.ui.Components.u8 u8Var = this.A7;
            if (user != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null) {
                    this.f29979ka = userProfilePhoto.photo_small;
                } else {
                    this.f29979ka = null;
                }
                u8Var.r(user);
                imageReceiver.j0(this.f29955ia, u8Var, null, org.telegram.messenger.lc.e(360928), 1, false);
                return;
            }
            TLRPC.Chat chat = this.f29968ja;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    this.f29979ka = chatPhoto.photo_small;
                } else {
                    this.f29979ka = null;
                }
                if (chat.signature_profiles && zi.B0(ziVar.f26868k) != 1271266957) {
                    long o10 = org.telegram.messenger.m5.o(ziVar.f26868k.from_id);
                    if (o10 >= 0) {
                        TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(o10));
                        u8Var.r(a22);
                        imageReceiver.i0(a22, u8Var, null);
                        return;
                    }
                    TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-o10));
                    u8Var.q(M0);
                    imageReceiver.i0(M0, u8Var, null);
                    return;
                }
                u8Var.q(this.f29968ja);
                imageReceiver.i0(this.f29968ja, u8Var, null);
            } else if (ziVar.s4()) {
                TLRPC.Photo photo = ziVar.T0;
                if (photo != null) {
                    imageReceiver.q0(ac.i(org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(50.0f), false, null, true), ziVar.T0), "50_50", u8Var, null, null, 0);
                }
            } else {
                this.f29979ka = null;
                u8Var.k(ziVar.Z0(), null, null, null);
                imageReceiver.q0(null, null, u8Var, null, null, 0);
            }
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.setBackgroundTopY(boolean):void");
    }

    public void setDelegate(l1 l1Var) {
        this.Ra = l1Var;
    }

    public void setDrawSelectionBackground(boolean z10) {
        if (this.k1 != z10) {
            this.k1 = z10;
            invalidate();
        }
    }

    public void setEnterTransitionInProgress(boolean z10) {
        this.f30146y = z10;
        invalidate();
    }

    public void setFullyDraw(boolean z10) {
        this.K0 = z10;
    }

    public void setHideSideButtonByQuickShare(boolean z10) {
        if (this.D8 != z10) {
            this.D8 = z10;
            boolean z11 = this.f29847a6;
            this.f29847a6 = true;
            invalidate();
            this.f29847a6 = z11;
        }
    }

    public void setHighlighted(boolean z10) {
        if (this.f30126w6 != z10) {
            this.f30126w6 = z10;
            if (z10) {
                this.f30009n3 = null;
            }
            if (!z10) {
                this.A6 = System.currentTimeMillis();
                this.f30140x6 = true;
                this.f30153y6 = 300;
            } else {
                this.f30140x6 = false;
                this.f30153y6 = 0;
            }
            R3();
            if (this.B4) {
                this.D4.f38077o = x2();
            } else {
                this.C4.f36201p = x2();
            }
            invalidate();
            if (getParent() != null) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setImageCoords(RectF rectF) {
        s3(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public void setInstantButtonPressed(boolean z10) {
        if (this.G2 == null) {
            this.G2 = new gc(this);
        }
        gc gcVar = this.G2;
        this.F2 = z10;
        gcVar.c(z10);
    }

    public void setInvalidateListener(Runnable runnable) {
        this.Cc = runnable;
    }

    public void setInvalidateSpoilersParent(boolean z10) {
        this.f30006n0 = z10;
    }

    public void setInvalidatesParent(boolean z10) {
        this.f29847a6 = z10;
    }

    public void setIsUpdating(boolean z10) {
        this.P0 = true;
    }

    public void setMessageObjectInternal(org.telegram.messenger.zi r68) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.setMessageObjectInternal(org.telegram.messenger.zi):void");
    }

    public void setOverrideInvalidate(Runnable runnable) {
        this.Bc = runnable;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        R3();
        if (this.B4) {
            this.D4.f38077o = x2();
        } else {
            this.C4.f36201p = x2();
        }
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.Pb = e6Var;
        RadialProgress2 radialProgress2 = this.Q0;
        if (radialProgress2 != null) {
            radialProgress2.F = e6Var;
        }
        RadialProgress2 radialProgress22 = this.R0;
        if (radialProgress22 != null) {
            radialProgress22.F = e6Var;
        }
        ik0 ik0Var = this.f29870c3;
        if (ik0Var != null) {
            ik0Var.f34735n = e6Var;
        }
    }

    public void setScrimBlockBounds(RectF rectF) {
        this.Xc = rectF;
    }

    public void setScrimReaction(Integer num) {
        this.O.f9134z = num;
    }

    public void setSelectedBackgroundProgress(float f10) {
        this.Ya = f10;
        invalidate();
    }

    public void setShowTopic(boolean z10) {
        if (this.Jc != z10) {
            this.Jc = z10;
            p2();
            invalidate();
        }
    }

    public void setSlidingOffset(float f10) {
        if (this.Uc != f10) {
            this.Uc = f10;
            X3();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Sb;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((yh.f) arrayList.get(i3)).invalidateSelf();
            i3++;
        }
        xi xiVar = this.f29985l3;
        if (xiVar != null && xiVar.f26387e != null) {
            for (int i10 = 0; i10 < this.f29985l3.f26387e.size(); i10++) {
                wi wiVar = (wi) this.f29985l3.f26387e.get(i10);
                for (int i11 = 0; i11 < wiVar.f26217y.size(); i11++) {
                    ((yh.f) wiVar.f26217y.get(i11)).invalidateSelf();
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().f26927z2 != null) {
            for (int i12 = 0; i12 < getMessageObject().f26927z2.size(); i12++) {
                wi wiVar2 = (wi) getMessageObject().f26927z2.get(i12);
                for (int i13 = 0; i13 < wiVar2.f26217y.size(); i13++) {
                    ((yh.f) wiVar2.f26217y.get(i13)).invalidateSelf();
                }
            }
        }
    }

    public void setTimeAlpha(float f10) {
        this.f29962j4 = f10;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
    }

    public final void t0(q1 q1Var) {
        q1Var.y3(this.f30030oc, this.f30056qc, this.f30068rc, this.f30081sc, this.tc, this.L0, this.M0, this.f29878cb, this.f29891db, this.f30043pc);
    }

    public final void t1(kl klVar, Canvas canvas, int i3, Integer num, float f10) {
        ri riVar = this.M;
        if (riVar != null) {
            int i10 = riVar.f25149l;
            if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                return;
            }
        }
        dh.o0 o0Var = this.O;
        o0Var.getClass();
        o0Var.A = f10;
        o0Var.f(klVar, canvas, i3, num);
    }

    public final boolean t2() {
        zi ziVar;
        if (v2() && (ziVar = this.P5) != null && !ziVar.Q3()) {
            return true;
        }
        return false;
    }

    public final void t3(org.telegram.messenger.zi r111, org.telegram.messenger.ui r112, boolean r113, boolean r114, boolean r115, boolean r116) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.t3(org.telegram.messenger.zi, org.telegram.messenger.ui, boolean, boolean, boolean, boolean):void");
    }

    public final void u0() {
        if (this.f29965j7 == null) {
            this.f29965j7 = new ImageReceiver[3];
            this.f29976k7 = new org.telegram.ui.Components.u8[3];
            this.f29989l7 = new boolean[3];
            int i3 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.f29965j7;
                if (i3 < imageReceiverArr.length) {
                    imageReceiverArr[i3] = new ImageReceiver(this);
                    this.f29965j7[i3].J0(org.telegram.messenger.g0.L(12.0f));
                    this.f29976k7[i3] = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                    this.f29976k7[i3].u(org.telegram.messenger.g0.L(18.0f));
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void u1(Canvas canvas, RectF rectF, float f10) {
        String str;
        x();
        if (this.H8) {
            str = "paintChatActionBackgroundSelected";
        } else {
            str = "paintChatActionBackground";
        }
        canvas.drawRoundRect(rectF, f10, f10, Z1(str));
        if (g2()) {
            canvas.drawRoundRect(rectF, f10, f10, org.telegram.ui.ActionBar.k6.f27951h2);
        }
    }

    public final boolean u2() {
        return t2();
    }

    public void u3(zi ziVar, ui uiVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.O0) {
            t3(ziVar, uiVar, z10, z11, z12, z13);
            return;
        }
        this.Q5 = ziVar;
        this.R5 = uiVar;
        this.T5 = z10;
        this.S5 = z11;
        this.U5 = z12;
        this.V5 = z13;
    }

    public final boolean v() {
        if (this.P5.u2() && !this.P5.M0 && this.L9 == 0.0f && this.V0.n() != null) {
            return false;
        }
        return true;
    }

    public final int v0(int i3, zi ziVar) {
        TLRPC.WebPage webPage;
        TLRPC.Document document;
        boolean z10;
        int i10;
        b1 b1Var;
        b1 b1Var2;
        int i11 = i3;
        TLRPC.MessageMedia messageMedia = ziVar.Y0;
        if (messageMedia != null) {
            this.M1 = messageMedia.document;
        } else if (ziVar.D == 0) {
            TLRPC.MessageMedia o12 = zi.o1(ziVar.f26868k);
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
            this.M1 = document;
        } else {
            this.M1 = ziVar.F0();
        }
        TLRPC.Document document2 = this.M1;
        int i12 = 0;
        if (document2 != null) {
            double d = 0.0d;
            if (zi.R4(document2)) {
                C1();
                this.L1 = 3;
                int i13 = 0;
                while (true) {
                    if (i13 >= this.M1.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.M1.attributes.get(i13);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute.duration;
                        break;
                    }
                    i13++;
                }
                org.telegram.messenger.g0.L(94.0f);
                Math.ceil(org.telegram.ui.ActionBar.k6.N2.measureText("00:00"));
                this.U6 = i11 - org.telegram.messenger.g0.L(18.0f);
                V2(ziVar);
                int L = org.telegram.messenger.g0.L(174.0f) + this.f30167z9;
                if (!this.Q1) {
                    this.f29848a7 = Math.min(i11, L + ((int) Math.ceil(org.telegram.ui.ActionBar.k6.N2.measureText(org.telegram.messenger.g0.g0((int) d, true, false)))));
                }
                this.D4.f38075m = ziVar;
                return 0;
            } else if (zi.L4(this.M1)) {
                this.L1 = 4;
                if (!ziVar.n5()) {
                    Q3();
                    String i02 = org.telegram.messenger.g0.i0(this.M1.size, false, false);
                    this.f29897e3 = (int) Math.ceil(org.telegram.ui.ActionBar.k6.C2.measureText(i02));
                    this.f29883d3 = new StaticLayout(i02, org.telegram.ui.ActionBar.k6.C2, this.f29897e3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return 0;
                }
            } else if (zi.K3(this.M1)) {
                C1();
                this.L1 = 5;
                int L2 = i11 - org.telegram.messenger.g0.L(92.0f);
                if (L2 < 0) {
                    L2 = org.telegram.messenger.g0.L(100.0f);
                }
                int i14 = L2;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(ziVar.z1(true).replace('\n', ' '), org.telegram.ui.ActionBar.k6.O2, i14 - org.telegram.messenger.g0.L(12.0f), truncateAt);
                b1 b1Var3 = this.J4;
                TextPaint textPaint = org.telegram.ui.ActionBar.k6.O2;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                b1Var3.d = new StaticLayout(ellipsize, textPaint, i14, alignment, 1.0f, 0.0f, false);
                if (this.J4.d.getLineCount() > 0) {
                    this.J4.f28979e = -((int) Math.ceil(b1Var2.d.getLineLeft(0)));
                    int lineWidth = (int) this.J4.d.getLineWidth(0);
                    if (org.telegram.messenger.g0.L(104.0f) + lineWidth > this.f29848a7) {
                        this.f29848a7 = org.telegram.messenger.g0.L(104.0f) + lineWidth;
                    }
                }
                this.J4.f28980f = new StaticLayout(TextUtils.ellipsize(ziVar.x1(true).replace('\n', ' '), org.telegram.ui.ActionBar.k6.P2, i14, truncateAt), org.telegram.ui.ActionBar.k6.P2, i14, alignment, 1.0f, 0.0f, false);
                if (this.J4.f28980f.getLineCount() > 0) {
                    this.J4.f28981g = -((int) Math.ceil(b1Var.f28980f.getLineLeft(0)));
                    int lineWidth2 = (int) this.J4.f28980f.getLineWidth(0);
                    if (org.telegram.messenger.g0.L(104.0f) + lineWidth2 > this.f29848a7) {
                        this.f29848a7 = org.telegram.messenger.g0.L(104.0f) + lineWidth2;
                    }
                }
                while (true) {
                    if (i12 >= this.M1.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute2 = this.M1.attributes.get(i12);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute2.duration;
                        break;
                    }
                    i12++;
                }
                int i15 = (int) d;
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.k6.N2.measureText(org.telegram.messenger.g0.k0(i15, i15)));
                org.telegram.messenger.g0.L(86.0f);
                this.U6 = this.f29848a7 - org.telegram.messenger.g0.L(28.0f);
                return ceil;
            } else if (zi.t3(this.M1, ziVar.A2())) {
                this.L1 = 2;
                if (!ziVar.n5()) {
                    String M0 = bd.M0(2131753971, "AttachGif");
                    this.B3 = (int) Math.ceil(org.telegram.ui.ActionBar.k6.C2.measureText(M0));
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.k6.C2;
                    int i16 = this.B3;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    this.f30123w3 = new StaticLayout(M0, textPaint2, i16, alignment2, 1.0f, 0.0f, false);
                    String i03 = org.telegram.messenger.g0.i0(this.M1.size, false, false);
                    this.f29897e3 = (int) Math.ceil(org.telegram.ui.ActionBar.k6.C2.measureText(i03));
                    this.f29883d3 = new StaticLayout(i03, org.telegram.ui.ActionBar.k6.C2, this.f29897e3, alignment2, 1.0f, 0.0f, false);
                }
            } else {
                String str = this.M1.mime_type;
                if ((str != null && (str.toLowerCase().startsWith("image/") || this.M1.mime_type.toLowerCase().startsWith("video/mp4"))) || zi.X2(this.M1)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.N1 = z10;
                if (!z10) {
                    i11 += org.telegram.messenger.g0.L(30.0f);
                }
                int i17 = i11;
                this.L1 = 1;
                String B = org.telegram.messenger.w7.B(this.M1);
                if (B.length() == 0) {
                    B = bd.M0(2131753975, "AttachDocument");
                }
                StaticLayout c2 = lu0.c(B, org.telegram.ui.ActionBar.k6.G2, i17, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.MIDDLE, i17, 2, false);
                this.f29883d3 = c2;
                this.f29911f3 = Integer.MIN_VALUE;
                if (c2 != null && c2.getLineCount() > 0) {
                    int i18 = 0;
                    for (int i19 = 0; i19 < this.f29883d3.getLineCount(); i19++) {
                        i18 = Math.max(i18, (int) Math.ceil(this.f29883d3.getLineWidth(i19)));
                        this.f29911f3 = Math.max(this.f29911f3, (int) Math.ceil(-this.f29883d3.getLineLeft(i19)));
                    }
                    i10 = Math.min(i17, i18);
                } else {
                    this.f29911f3 = 0;
                    i10 = i17;
                }
                int min = Math.min(i17 - org.telegram.messenger.g0.L(30.0f), (int) Math.ceil(org.telegram.ui.ActionBar.k6.C2.measureText("000.0 mm / ".concat(org.telegram.messenger.g0.i0(this.M1.size, false, false)))));
                this.B3 = min;
                CharSequence ellipsize2 = TextUtils.ellipsize(org.telegram.messenger.g0.i0(this.M1.size, false, false) + " " + org.telegram.messenger.w7.A(this.M1), org.telegram.ui.ActionBar.k6.C2, min, TextUtils.TruncateAt.END);
                try {
                    if (this.B3 < 0) {
                        this.B3 = org.telegram.messenger.g0.L(10.0f);
                    }
                    this.f30123w3 = new StaticLayout(ellipsize2, org.telegram.ui.ActionBar.k6.C2, this.B3 + org.telegram.messenger.g0.L(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (this.N1) {
                    this.f29884d4 = org.telegram.messenger.w7.w(ziVar.f26878n0, 320, false, null, false);
                    this.f29898e4 = org.telegram.messenger.w7.w(ziVar.f26878n0, 40, false, null, false);
                    if (this.P5.y3() || (org.telegram.messenger.z5.q(this.Z5).l() & 1) == 0) {
                        this.f29884d4 = null;
                    }
                    TLRPC.PhotoSize photoSize = this.f29884d4;
                    ei.c3 c3Var = this.U0;
                    if (photoSize != null && photoSize != this.f29898e4) {
                        BitmapDrawable bitmapDrawable = this.P5.G1;
                        if (bitmapDrawable != null) {
                            this.f29898e4 = null;
                            this.f29912f4 = bitmapDrawable;
                        }
                    } else {
                        this.f29884d4 = null;
                        c3Var.G0 = true;
                        c3Var.H0 = true;
                    }
                    this.f29926g4 = "86_86_b";
                    c3Var.r0(ac.f(this.f29884d4, ziVar.f26872l0), "86_86", ac.f(this.f29898e4, ziVar.f26872l0), this.f29926g4, this.f29912f4, 0L, null, ziVar, 1);
                }
                return i10;
            }
        }
        return 0;
    }

    public final void v1(Canvas canvas, boolean z10) {
        float f10;
        float f11;
        boolean z11;
        int i3;
        float f12;
        float L;
        float f13;
        float f14;
        float f15;
        ui uiVar;
        if ((!this.D8 || z10) && this.E8 != 0) {
            ri riVar = this.M;
            if (riVar == null || (uiVar = this.L) == null || !uiVar.f25705i || riVar.h) {
                boolean Q3 = this.P5.Q3();
                x1 x1Var = this.hb;
                if (Q3) {
                    float L2 = x1Var.f30881j1 - org.telegram.messenger.g0.L(40.0f);
                    this.Q8 = L2;
                    ui uiVar2 = this.L;
                    if (uiVar2 != null) {
                        this.Q8 = (uiVar2.f25709m.f25530e - this.Vc) + L2;
                    }
                } else {
                    float L3 = org.telegram.messenger.g0.L(8.0f) + x1Var.k1;
                    this.Q8 = L3;
                    ui uiVar3 = this.L;
                    if (uiVar3 != null) {
                        this.Q8 = (uiVar3.f25709m.f25532g - this.Vc) + L3;
                    }
                    if (t2()) {
                        this.Q8 = Math.min(this.Q8, getCompactRight() - org.telegram.messenger.g0.L(32.0f));
                    }
                }
                float f16 = 0.0f;
                if (this.E8 == 4) {
                    this.R8 = org.telegram.messenger.g0.L(6.0f);
                } else {
                    float L4 = (this.f29887d7 + x1Var.f30880j0) - org.telegram.messenger.g0.L(41.0f);
                    this.R8 = L4;
                    zi ziVar = this.P5;
                    if (ziVar.D == 19 && ziVar.f26904t2 < this.A9) {
                        this.R8 = L4 - org.telegram.messenger.g0.L(22.0f);
                    }
                    ui uiVar4 = this.L;
                    if (uiVar4 != null) {
                        float f17 = this.R8;
                        ti tiVar = uiVar4.f25709m;
                        float f18 = f17 + tiVar.h;
                        this.R8 = f18;
                        if (tiVar.f25534j) {
                            this.R8 = f18 - getTranslationY();
                        }
                    }
                    if (this.P5.P5()) {
                        dh.o0 o0Var = this.O;
                        o0Var.getClass();
                        if (this.f30144xb) {
                            this.R8 -= (1.0f - getVideoTranscriptionProgress()) * o0Var.i(x1Var.L1);
                        } else if (o0Var.f9112a > 0.0f) {
                            this.R8 -= o0Var.i(x1Var.L1);
                        }
                    }
                }
                if (this.E8 != 4) {
                    float L5 = ((this.f29887d7 + x1Var.f30880j0) - org.telegram.messenger.g0.L(32.0f)) / 2.0f;
                    if (this.R8 < L5) {
                        this.R8 = L5;
                    }
                }
                if (this.P5.D == 19) {
                    if (this.E8 == 3 && this.f29999m7 != null) {
                        this.R8 = org.telegram.messenger.g0.L(18.0f);
                    } else {
                        this.R8 = 0.0f;
                    }
                }
                if (!this.P5.Q3() && this.f30144xb && !this.Q1) {
                    if (this.F6) {
                        L = (org.telegram.messenger.g0.g3(this.W6, v2()) - org.telegram.messenger.g0.f22612u) * 0.7f;
                    } else {
                        L = org.telegram.messenger.g0.L(50.0f);
                    }
                    if (this.f30157yb) {
                        f13 = (1.0f - getVideoTranscriptionProgress()) * L;
                    } else {
                        f13 = 0.0f;
                    }
                    if (this.f30157yb) {
                        f16 = org.telegram.messenger.g0.L(28.0f) * (1.0f - getVideoTranscriptionProgress());
                    }
                    if (x1Var.f30891l2) {
                        if (this.f30157yb) {
                            f14 = x1Var.L1;
                        } else {
                            f14 = 1.0f - x1Var.L1;
                        }
                        f13 = (1.0f - getVideoTranscriptionProgress()) * f14 * L;
                        if (this.f30157yb) {
                            f15 = x1Var.L1;
                        } else {
                            f15 = 1.0f - x1Var.L1;
                        }
                        f16 = (1.0f - getVideoTranscriptionProgress()) * f15 * org.telegram.messenger.g0.L(28.0f);
                    }
                    this.Q8 -= f13;
                    this.R8 -= f16;
                    if (t2()) {
                        float compactRight = getCompactRight() - org.telegram.messenger.g0.L(32.0f);
                        this.Q8 = org.telegram.messenger.g0.T1(Math.min(this.U0.y() + org.telegram.messenger.g0.L(8.0f), compactRight), Math.min(this.Q8 + f13, compactRight), getVideoTranscriptionProgress());
                    }
                }
                this.F8 = true;
                if (this.E8 == 3) {
                    if (!this.f30146y || zi.S4(this.P5.f26868k)) {
                        U0(canvas, 1.0f);
                    }
                } else if (!qt0.f37525f0) {
                    float f19 = this.Q8;
                    float f20 = this.R8;
                    float L6 = org.telegram.messenger.g0.L(32.0f) + f19;
                    float f21 = this.R8;
                    if (this.G8 == 5) {
                        f10 = 64.0f;
                    } else {
                        f10 = 32.0f;
                    }
                    RectF rectF = this.f29858b4;
                    rectF.set(f19, f20, L6, f21 + org.telegram.messenger.g0.L(f10));
                    if (rectF.right >= getMeasuredWidth()) {
                        this.F8 = false;
                        return;
                    }
                    int i10 = (int) ((1.0f - this.E.f53840e) * 255.0f);
                    if (i10 != 255) {
                        float f22 = this.Q8;
                        f11 = 32.0f;
                        z11 = false;
                        i3 = canvas.saveLayerAlpha(f22, this.R8, org.telegram.messenger.g0.L(32.0f) + f22, this.R8 + org.telegram.messenger.g0.L(64.0f), i10);
                    } else {
                        f11 = 32.0f;
                        z11 = false;
                        i3 = -1;
                    }
                    x();
                    String str = "paintChatActionBackground";
                    if (this.E8 == 4 && this.G8 == 5 && this.H8) {
                        Path path = this.M8;
                        if (path == null) {
                            this.M8 = new Path();
                        } else {
                            path.rewind();
                        }
                        Path path2 = this.N8;
                        if (path2 == null) {
                            this.N8 = new Path();
                        } else {
                            path2.rewind();
                        }
                        boolean z12 = z11;
                        if (this.O8 == null) {
                            float[] fArr = new float[8];
                            this.O8 = fArr;
                            f12 = 2.0f;
                            float L7 = org.telegram.messenger.g0.L(16.0f);
                            fArr[3] = L7;
                            fArr[2] = L7;
                            fArr[1] = L7;
                            fArr[z12 ? 1 : 0] = L7;
                        } else {
                            f12 = 2.0f;
                        }
                        if (this.P8 == null) {
                            this.P8 = r3;
                            float L8 = org.telegram.messenger.g0.L(16.0f);
                            float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f, L8, L8, L8, L8};
                        }
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        float f23 = this.Q8;
                        rectF2.set(f23, this.R8, org.telegram.messenger.g0.L(f11) + f23, this.R8 + org.telegram.messenger.g0.L(f11));
                        Path path3 = this.M8;
                        float[] fArr3 = this.O8;
                        Path.Direction direction = Path.Direction.CW;
                        path3.addRoundRect(rectF2, fArr3, direction);
                        rectF2.set(this.Q8, this.R8 + org.telegram.messenger.g0.L(f11), this.Q8 + org.telegram.messenger.g0.L(f11), this.R8 + org.telegram.messenger.g0.L(64.0f));
                        this.N8.addRoundRect(rectF2, this.P8, direction);
                        if (this.K8 == 4) {
                            canvas.drawPath(this.M8, Z1("paintChatActionBackgroundSelected"));
                            canvas.drawPath(this.N8, Z1("paintChatActionBackground"));
                        } else {
                            canvas.drawPath(this.M8, Z1("paintChatActionBackground"));
                            canvas.drawPath(this.N8, Z1("paintChatActionBackgroundSelected"));
                        }
                    } else {
                        f12 = 2.0f;
                        float L9 = org.telegram.messenger.g0.L(16.0f);
                        float L10 = org.telegram.messenger.g0.L(16.0f);
                        if (this.H8) {
                            str = "paintChatActionBackgroundSelected";
                        }
                        canvas.drawRoundRect(rectF, L9, L10, Z1(str));
                    }
                    if (g2()) {
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.f27951h2);
                    }
                    int i11 = this.E8;
                    if (i11 == 2) {
                        Drawable Y1 = Y1("drawableGoIcon");
                        z.t(Y1, (this.Q8 + org.telegram.messenger.g0.L(16.0f)) - (Y1.getIntrinsicWidth() / f12), (this.R8 + org.telegram.messenger.g0.L(16.0f)) - (Y1.getIntrinsicHeight() / f12));
                        Y1.draw(canvas);
                    } else if (i11 == 4) {
                        int L11 = (int) (this.Q8 + org.telegram.messenger.g0.L(16.0f));
                        int L12 = (int) (this.R8 + org.telegram.messenger.g0.L(16.0f));
                        Drawable Y12 = Y1("drawableCloseIcon");
                        int intrinsicWidth = Y12.getIntrinsicWidth() / 2;
                        int intrinsicHeight = Y12.getIntrinsicHeight() / 2;
                        Y12.setBounds(L11 - intrinsicWidth, L12 - intrinsicHeight, intrinsicWidth + L11, intrinsicHeight + L12);
                        z.t(Y12, this.Q8 + org.telegram.messenger.g0.L(4.0f), this.R8 + org.telegram.messenger.g0.L(4.0f));
                        canvas.save();
                        canvas.scale(0.65f, 0.65f, Y12.getBounds().centerX(), Y12.getBounds().centerY());
                        Y12.draw(canvas);
                        canvas.restore();
                        if (this.G8 == 5) {
                            Drawable Y13 = Y1("drawableMoreIcon");
                            int intrinsicWidth2 = Y13.getIntrinsicWidth() / 2;
                            int intrinsicHeight2 = Y13.getIntrinsicHeight() / 2;
                            Y13.setBounds(L11 - intrinsicWidth2, L12 - intrinsicHeight2, L11 + intrinsicWidth2, L12 + intrinsicHeight2);
                            z.t(Y13, this.Q8 + org.telegram.messenger.g0.L(4.0f), this.R8 + org.telegram.messenger.g0.L(34.0f));
                            Y13.draw(canvas);
                        }
                    } else {
                        int L13 = (int) (this.Q8 + org.telegram.messenger.g0.L(16.0f));
                        int L14 = (int) (this.R8 + org.telegram.messenger.g0.L(16.0f));
                        Drawable Y14 = Y1("drawableShareIcon");
                        int intrinsicWidth3 = Y14.getIntrinsicWidth() / 2;
                        int intrinsicHeight3 = Y14.getIntrinsicHeight() / 2;
                        Y14.setBounds(L13 - intrinsicWidth3, L14 - intrinsicHeight3, L13 + intrinsicWidth3, L14 + intrinsicHeight3);
                        z.t(Y14, this.Q8 + org.telegram.messenger.g0.L(4.0f), this.R8 + org.telegram.messenger.g0.L(4.0f));
                        Y14.draw(canvas);
                    }
                    if (i3 != -1) {
                        canvas.restoreToCount(i3);
                    }
                }
            }
        }
    }

    public final boolean v2() {
        zi ziVar = this.P5;
        if (ziVar != null) {
            return ziVar.Q2();
        }
        return org.telegram.ui.ActionBar.k6.i1(this.Pb);
    }

    public final void v3(int i3) {
        this.f30005n = i3;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        y yVar;
        vh.b bVar;
        vh.a aVar;
        m1 m1Var;
        m1 m1Var2;
        m1 m1Var3;
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.I2;
            if (drawable != drawableArr[0] && drawable != this.f30137x3 && drawable != drawableArr[1]) {
                t1 t1Var = this.Y0;
                if (t1Var != null) {
                    yVar = t1Var.f30464x;
                } else {
                    yVar = null;
                }
                if (drawable == yVar || drawable == this.U2 || drawable == this.Ja || ((drawable != null && (((m1Var = this.f29920fc) != null && drawable == m1Var.f29622k) || (((m1Var2 = this.f29933gc) != null && drawable == m1Var2.f29622k) || ((m1Var3 = this.Mc) != null && drawable == m1Var3.f29622k)))) || ((this.O != null && (drawable instanceof org.telegram.ui.Components.g6)) || (drawable instanceof w70)))) {
                    return true;
                }
                w1 w1Var = this.f30122w2;
                if (w1Var == null || (aVar = w1Var.f30784l) == null || (drawable != aVar && drawable != aVar.f56953a)) {
                    ArrayList arrayList = this.P4;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        p1 p1Var = (p1) obj;
                        if (p1Var.f29796w != drawable && ((bVar = p1Var.f29797x) == null || (drawable != bVar && drawable != bVar.f56942a && drawable != bVar.f56943b))) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void w() {
        xq xqVar;
        boolean z10 = this.f30007n1;
        if (z10 || this.f30019o1) {
            if ((z10 && this.f30032p1 == 1.0f) || (!z10 && this.f30032p1 == 0.0f)) {
                this.f30019o1 = false;
            }
            if (z10) {
                xqVar = xq.f40453g;
            } else {
                xqVar = xq.f40454i;
            }
            this.f30059r1 = (int) Math.ceil(xqVar.getInterpolation(this.f30032p1) * org.telegram.messenger.g0.L(35.0f));
            if (this.P5.D == 36) {
                if (org.telegram.messenger.g0.L(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                    this.f30059r1 = 0;
                }
            }
            if (!this.P5.Q3() || this.P5.B2) {
                X3();
            }
            if (this.f30019o1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f30045q1;
                this.f30045q1 = elapsedRealtime;
                if (this.f30007n1) {
                    float f10 = (((float) j10) / 200.0f) + this.f30032p1;
                    this.f30032p1 = f10;
                    if (f10 > 1.0f) {
                        this.f30032p1 = 1.0f;
                    }
                } else {
                    float f11 = this.f30032p1 - (((float) j10) / 200.0f);
                    this.f30032p1 = f11;
                    if (f11 <= 0.0f) {
                        this.f30032p1 = 0.0f;
                    }
                }
                invalidate();
                ((View) getParent()).invalidate();
            }
        }
    }

    public final void w1(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f10, boolean z14, float f11, float f12, float f13, boolean z15, boolean z16) {
        float photoBottom;
        float f14;
        float f15;
        float f16;
        int L;
        int L2;
        int i3;
        Drawable Y1;
        Drawable drawable;
        int w02;
        float f17;
        zi ziVar;
        boolean z17 = (f13 == 1.0f || z15) ? false : true;
        float f18 = (f13 * 0.5f) + 0.5f;
        float f19 = z17 ? f10 * f13 : f10;
        if (this.L1 != 7 || ((ziVar = this.P5) != null && ziVar.h4())) {
            photoBottom = getPhotoBottom() + this.f30120w0;
        } else {
            photoBottom = f12 - ((1.0f - getVideoTranscriptionProgress()) * (this.O.i(this.hb.L1) + org.telegram.messenger.g0.L(this.K ? 4.0f : 5.0f)));
        }
        float L3 = photoBottom - org.telegram.messenger.g0.L(8.5f);
        zi ziVar2 = this.P5;
        float L4 = (ziVar2 == null || !ziVar2.N2()) ? 0.0f : org.telegram.messenger.g0.L(-6.0f);
        float f20 = 22.0f;
        if (z12) {
            sa0 sa0Var = org.telegram.ui.ActionBar.k6.E3;
            if (D3()) {
                if (this.P5.Q5()) {
                    f14 = 1.0f;
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, this.Pb);
                    int i10 = this.f29874c7;
                    f17 = z14 ? 24.0f : 22.0f;
                    sa0Var.getClass();
                    f16 = 4.0f;
                    z.t(sa0Var, ((i10 - org.telegram.messenger.g0.L(f17)) - org.telegram.messenger.g0.L(12.0f)) + L4, (L3 - org.telegram.messenger.g0.L(12.0f)) + f11);
                    sa0Var.setAlpha((int) (this.f29962j4 * 255.0f * f19));
                } else {
                    f14 = 1.0f;
                    f16 = 4.0f;
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27960hd, this.Pb);
                    int i11 = this.f29874c7;
                    f17 = z14 ? 24.0f : 22.0f;
                    sa0Var.getClass();
                    z.t(sa0Var, ((i11 - org.telegram.messenger.g0.L(f17)) - org.telegram.messenger.g0.L(12.0f)) + L4, (L3 - org.telegram.messenger.g0.L(12.0f)) + f11);
                    sa0Var.setAlpha((int) (f19 * 255.0f));
                }
                f15 = 18.5f;
            } else {
                f14 = 1.0f;
                f16 = 4.0f;
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bb, this.Pb);
                sa0Var.getClass();
                f15 = 18.5f;
                z.t(sa0Var, (this.f29874c7 - org.telegram.messenger.g0.L(18.5f)) - org.telegram.messenger.g0.L(12.0f), ((f12 - org.telegram.messenger.g0.L(8.5f)) - org.telegram.messenger.g0.L(12.0f)) + f11);
                sa0Var.setAlpha((int) (f19 * 255.0f));
            }
            sa0Var.a(w02);
            if (z17) {
                canvas.save();
                canvas.scale(f18, f18, sa0Var.getBounds().centerX(), sa0Var.getBounds().centerY());
            }
            sa0Var.draw(canvas);
            sa0Var.setAlpha(255);
            if (z17) {
                canvas.restore();
            }
            invalidate();
        } else {
            f14 = 1.0f;
            f15 = 18.5f;
            f16 = 4.0f;
        }
        if (z11) {
            if (D3()) {
                if (z15) {
                    canvas.save();
                }
                if (this.P5.Q5()) {
                    drawable = Y1("drawableMsgStickerCheck");
                    if (z10) {
                        if (z15) {
                            canvas.translate(org.telegram.messenger.g0.L(4.8f) * (f14 - f13), 0.0f);
                        }
                        z.t(drawable, ((this.f29874c7 - org.telegram.messenger.g0.L(z14 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f11);
                    } else {
                        z.t(drawable, ((this.f29874c7 - org.telegram.messenger.g0.L(z14 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f11);
                    }
                    drawable.setAlpha((int) (this.f29962j4 * 255.0f * f19));
                } else {
                    if (z10) {
                        if (z15) {
                            canvas.translate((f14 - f13) * org.telegram.messenger.g0.L(4.8f), 0.0f);
                        }
                        z.t(org.telegram.ui.ActionBar.k6.F3, (this.f29874c7 - org.telegram.messenger.g0.L(z14 ? 28.3f : 26.3f)) - org.telegram.ui.ActionBar.k6.F3.getIntrinsicWidth(), (L3 - org.telegram.ui.ActionBar.k6.F3.getIntrinsicHeight()) + f11);
                    } else {
                        z.t(org.telegram.ui.ActionBar.k6.F3, (this.f29874c7 - org.telegram.messenger.g0.L(z14 ? 23.5f : 21.5f)) - org.telegram.ui.ActionBar.k6.F3.getIntrinsicWidth(), (L3 - org.telegram.ui.ActionBar.k6.F3.getIntrinsicHeight()) + f11);
                    }
                    org.telegram.ui.ActionBar.k6.F3.setAlpha((int) (this.f29962j4 * 255.0f * f19));
                    drawable = org.telegram.ui.ActionBar.k6.F3;
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
                        canvas.translate((f14 - f13) * org.telegram.messenger.g0.L(f16), 0.0f);
                    }
                    Y1 = Y1(z16 ? "drawableMsgOutCheckReadSelected" : "drawableMsgOutCheckRead");
                    z.t(Y1, ((this.f29874c7 - org.telegram.messenger.g0.L(22.5f)) - Y1.getIntrinsicWidth()) + L4, ((f12 - org.telegram.messenger.g0.L((this.G || this.F) ? 9.0f : 8.0f)) - Y1.getIntrinsicHeight()) + f11);
                } else {
                    Y1 = Y1(z16 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    z.t(Y1, ((this.f29874c7 - org.telegram.messenger.g0.L(f15)) - Y1.getIntrinsicWidth()) + L4, ((f12 - org.telegram.messenger.g0.L((this.G || this.F) ? 9.0f : 8.0f)) - Y1.getIntrinsicHeight()) + f11);
                }
                Y1.setAlpha((int) (f19 * 255.0f));
                if (z17) {
                    canvas.save();
                    canvas.scale(f18, f18, Y1.getBounds().centerX(), Y1.getBounds().centerY());
                }
                Y1.draw(canvas);
                if (z17) {
                    canvas.restore();
                }
                if (z15) {
                    canvas.restore();
                }
                Y1.setAlpha(255);
            }
        }
        if (z10) {
            if (D3()) {
                Drawable Y12 = this.P5.Q5() ? Y1("drawableMsgStickerHalfCheck") : org.telegram.ui.ActionBar.k6.G3;
                z.t(Y12, ((this.f29874c7 - org.telegram.messenger.g0.L(z14 ? 23.5f : 21.5f)) - Y12.getIntrinsicWidth()) + L4, (L3 - Y12.getIntrinsicHeight()) + f11);
                Y12.setAlpha((int) (this.f29962j4 * 255.0f * f19));
                if (z17 || z15) {
                    canvas.save();
                    canvas.scale(f18, f18, Y12.getBounds().centerX(), Y12.getBounds().centerY());
                }
                Y12.draw(canvas);
                if (z17 || z15) {
                    canvas.restore();
                }
                Y12.setAlpha(255);
            } else {
                Drawable Y13 = Y1(z16 ? "drawableMsgOutHalfCheckSelected" : "drawableMsgOutHalfCheck");
                z.t(Y13, (this.f29874c7 - org.telegram.messenger.g0.L(18.0f)) - Y13.getIntrinsicWidth(), ((f12 - org.telegram.messenger.g0.L((this.G || this.F) ? 9.0f : 8.0f)) - Y13.getIntrinsicHeight()) + f11);
                Y13.setAlpha((int) (f19 * 255.0f));
                if (z17 || z15) {
                    canvas.save();
                    canvas.scale(f18, f18, Y13.getBounds().centerX(), Y13.getBounds().centerY());
                }
                Y13.draw(canvas);
                if (z17 || z15) {
                    canvas.restore();
                }
                Y13.setAlpha(255);
            }
        }
        if (z13) {
            if (D3()) {
                L = this.f29874c7 - org.telegram.messenger.g0.L(34.5f);
                L2 = org.telegram.messenger.g0.L(26.5f);
            } else {
                L = this.f29874c7 - org.telegram.messenger.g0.L(32.0f);
                if (!this.G && !this.F) {
                    f20 = 21.0f;
                }
                L2 = org.telegram.messenger.g0.L(f20);
            }
            float f21 = (f12 - L2) + f11;
            RectF rectF = this.f29858b4;
            rectF.set((int) (L + L4), f21, org.telegram.messenger.g0.L(14.0f) + i3, org.telegram.messenger.g0.L(14.0f) + f21);
            int alpha = org.telegram.ui.ActionBar.k6.f27838b2.getAlpha();
            org.telegram.ui.ActionBar.k6.f27838b2.setAlpha((int) (alpha * f19));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f14), org.telegram.messenger.g0.L(f14), org.telegram.ui.ActionBar.k6.f27838b2);
            org.telegram.ui.ActionBar.k6.f27838b2.setAlpha(alpha);
            z.t(org.telegram.ui.ActionBar.k6.f27987j4, org.telegram.messenger.g0.L(6.0f) + i3, f21 + org.telegram.messenger.g0.L(2.0f));
            org.telegram.ui.ActionBar.k6.f27987j4.setAlpha((int) (f19 * 255.0f));
            if (z17) {
                canvas.save();
                canvas.scale(f18, f18, org.telegram.ui.ActionBar.k6.f27987j4.getBounds().centerX(), org.telegram.ui.ActionBar.k6.f27987j4.getBounds().centerY());
            }
            org.telegram.ui.ActionBar.k6.f27987j4.draw(canvas);
            org.telegram.ui.ActionBar.k6.f27987j4.setAlpha(255);
            if (z17) {
                canvas.restore();
            }
        }
    }

    public final boolean w2(zi ziVar) {
        int i3 = zi.o1(this.P5.f26868k).period;
        int currentTime = ConnectionsManager.getInstance(this.Z5).getCurrentTime();
        if (i3 == Integer.MAX_VALUE) {
            return false;
        }
        if (i3 % 60 == 0) {
            if (Math.abs(currentTime - ziVar.f26868k.date) <= i3) {
                return false;
            }
            return true;
        } else if (Math.abs(currentTime - ziVar.f26868k.date) <= i3 - 5) {
            return false;
        } else {
            return true;
        }
    }

    public final void w3(int i3, int i10) {
        org.telegram.ui.ActionBar.t4 t4Var;
        this.L0 = i3;
        this.M0 = i10;
        this.f29865bb = i10;
        if ((this.P5 != null && g2() && this.P5.Q5()) || ((t4Var = this.K6) != null && t4Var.f28633a != null)) {
            invalidate();
        }
    }

    public final void x() {
        y(getX(), this.f29852ab, getMeasuredWidth(), this.f29865bb);
    }

    public final void x0() {
        float f10;
        float f11;
        int i3;
        int measureText;
        boolean z10;
        if (this.f30084t2) {
            A0(0);
        }
        if (this.f30084t2 && this.f30046q2 == null) {
            this.C2 = org.telegram.messenger.g0.L(33.0f);
            CharSequence charSequence = this.f30149y2;
            if (charSequence == null) {
                int i10 = this.f30136x2;
                if (i10 == 12) {
                    charSequence = bd.M0(2131747816, null);
                } else if (i10 == 1) {
                    charSequence = bd.M0(2131747820, null);
                } else if (i10 == 29) {
                    charSequence = bd.M0(2131747817, null);
                } else if (i10 == 13) {
                    charSequence = bd.M0(2131745611, null).toUpperCase();
                } else if (i10 == 32) {
                    charSequence = bd.M0(2131747794, null).toUpperCase();
                } else if (i10 == 85) {
                    charSequence = bd.M0(2131747824, null);
                } else if (i10 == 10) {
                    charSequence = bd.M0(2131747821, null);
                } else if (i10 == 2) {
                    charSequence = bd.M0(2131747808, null);
                } else if (i10 == 3) {
                    charSequence = bd.M0(2131747795, null);
                } else if (i10 == 5) {
                    charSequence = bd.M0(2131743566, null);
                } else if (i10 == 6) {
                    charSequence = bd.M0(2131747822, null);
                } else if (i10 == 7) {
                    charSequence = bd.M0(2131747792, null);
                } else if (i10 != 9 && i10 != 11) {
                    if (i10 == 25) {
                        charSequence = bd.M0(2131743377, null);
                    } else if (i10 == 14) {
                        charSequence = bd.M0(2131743568, null).toUpperCase();
                    } else if (i10 == 15) {
                        charSequence = bd.M0(2131752918, null).toUpperCase();
                    } else if (i10 == 16) {
                        charSequence = bd.M0(2131747797, null).toUpperCase();
                    } else if (i10 == 17) {
                        charSequence = bd.M0(2131743551, null).toUpperCase();
                    } else if (i10 != 18 && i10 != 22) {
                        if (i10 == 19) {
                            charSequence = bd.M0(2131753346, null);
                        } else if (i10 == 20) {
                            charSequence = bd.M0(2131747812, null);
                        } else if (i10 == 21) {
                            charSequence = bd.M0(2131754230, null);
                        } else if (i10 == 23) {
                            charSequence = bd.M0(2131747793, null);
                        } else if (i10 == 24) {
                            charSequence = bd.M0(2131747815, null);
                        } else if (i10 == 26) {
                            TL_stars.StarGift starGift = this.f29934gd;
                            if (starGift != null) {
                                if (starGift.auction_start_date > ConnectionsManager.getInstance(this.Z5).getCurrentTime()) {
                                    charSequence = bd.M0(2131747809, null);
                                    z10 = false;
                                } else {
                                    if (this.f29934gd.sold_out) {
                                        charSequence = bd.M0(2131747810, null);
                                    } else {
                                        charSequence = bd.M0(2131747811, null);
                                    }
                                    z10 = true;
                                }
                                if (z10) {
                                    SpannableString spannableString = new SpannableString("*");
                                    spannableString.setSpan(new wp(2131231117, 0), 0, spannableString.length(), 33);
                                    charSequence = TextUtils.concat(spannableString, " ", charSequence);
                                }
                            } else {
                                charSequence = bd.M0(2131747791, null);
                            }
                        } else if (i10 == 27) {
                            charSequence = bd.M0(2131749088, null).toUpperCase();
                        } else if (i10 == 28) {
                            charSequence = bd.M0(2131743567, null);
                        } else {
                            charSequence = bd.M0(2131749201, null);
                        }
                    } else {
                        charSequence = bd.M0(2131753616, null);
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) zi.o1(this.P5.f26868k).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = bd.M0(2131743376, null);
                    } else {
                        charSequence = bd.M0(2131743377, null);
                    }
                }
            }
            if (this.P5.s4() && this.f29848a7 < (measureText = (int) (org.telegram.ui.ActionBar.k6.M2.measureText(charSequence, 0, charSequence.length()) + org.telegram.messenger.g0.L(75.0f)))) {
                this.f29848a7 = measureText;
            }
            int L = this.f29848a7 - org.telegram.messenger.g0.L(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.k6.M2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.M2, org.telegram.messenger.g0.L(2.0f) + L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f30046q2 = staticLayout;
            int lineCount = staticLayout.getLineCount();
            float f12 = 0.0f;
            if (lineCount > 0) {
                f10 = this.f30046q2.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f30060r2 = f10;
            if (this.f30046q2.getLineCount() > 0) {
                f12 = this.f30046q2.getLineLeft(0);
            }
            this.f30072s2 = f12;
            int i11 = this.f29848a7;
            int i12 = this.f30136x2;
            if (i12 != 82 && i12 != 81 && i12 != 80 && i12 != 84 && i12 != 83) {
                f11 = 34.0f;
            } else {
                f11 = 13.0f;
            }
            this.C2 = i11 - org.telegram.messenger.g0.L(f11);
            int L2 = org.telegram.messenger.g0.L(46.0f) + this.f30106v0;
            this.f30106v0 = L2;
            if (this.P5.D == 12) {
                this.f30106v0 = org.telegram.messenger.g0.L(14.0f) + L2;
            }
            if (this.P5.s4()) {
                this.f30106v0 = org.telegram.messenger.g0.L(2.0f) + this.f30106v0;
            }
            StaticLayout staticLayout2 = this.f30046q2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.C2 - Math.ceil(this.f30046q2.getLineWidth(0)))) / 2;
                if (this.f30136x2 == 0) {
                    i3 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    i3 = 0;
                }
                this.A2 = ceil + i3;
                int lineLeft = (int) this.f30046q2.getLineLeft(0);
                this.B2 = lineLeft;
                this.A2 += -lineLeft;
            }
        }
    }

    public void x1(float r16, android.graphics.Canvas r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.x1(float, android.graphics.Canvas, boolean):void");
    }

    public boolean x2() {
        if (((isPressed() && this.C6) || ((!this.C6 && this.f30112v6) || this.f30126w6)) && !H3() && !l2()) {
            zi ziVar = this.P5;
            if (ziVar == null || !ziVar.f26895r1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void x3(float f10, float f11, boolean z10) {
        float f12;
        boolean z11;
        if (this.h != z10) {
            this.h = z10;
            O();
            if (z10) {
                invalidate();
            }
        }
        ei.c3 c3Var = this.U0;
        float f13 = f10 - c3Var.M0;
        float measuredHeight = f11 - (getMeasuredHeight() - c3Var.A());
        float f14 = c3Var.O0;
        if (f13 > 0.0f) {
            f12 = f14 - f13;
        } else {
            f12 = f14;
        }
        if (measuredHeight > 0.0f) {
            f12 -= measuredHeight;
        }
        if (f12 / f14 < 0.25f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30069s = z11;
        c3Var.B1 = z11;
    }

    public final void y(float f10, float f11, int i3, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.Pb;
        if (e6Var != null) {
            e6Var.b(f10, f11 + this.W + this.f29922g0 + this.f29946i0, i3, i10);
        } else {
            org.telegram.ui.ActionBar.k6.r(f10, f11 + this.W + this.f29922g0 + this.f29946i0, i3, i10);
        }
    }

    public final void y0(long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.y0(long, long):void");
    }

    public final void y1(Canvas canvas, float f10, boolean z10, float f11, StaticLayout staticLayout, float f12, boolean z11) {
        int i3;
        float f13;
        RectF rectF;
        int i10;
        char c2;
        char c10;
        char c11;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        x1 x1Var;
        float f14;
        boolean z13;
        int i15;
        q1 q1Var;
        String str;
        float f15;
        float L;
        x1 x1Var2;
        boolean z14;
        float f16;
        int i16;
        x1 x1Var3;
        boolean z15;
        float f17;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        int i17;
        Paint Z1;
        float f18;
        float f19;
        int L2;
        boolean z21;
        float photoBottom;
        int i18;
        int i19;
        float f20;
        boolean z22;
        x1 x1Var4;
        float f21;
        float f22;
        boolean z23;
        int i20;
        boolean z24;
        zi ziVar;
        TextPaint textPaint;
        int i21;
        int i22;
        q1 q1Var2 = this;
        Canvas canvas2 = canvas;
        if (((q1Var2.E9 && !q1Var2.N) || !q1Var2.D3()) && staticLayout != null) {
            zi ziVar2 = q1Var2.P5;
            if ((!ziVar2.Z || q1Var2.M == null) && (i3 = ziVar2.D) != 16) {
                if (i3 == 5) {
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.k6.T2;
                    if (q1Var2.t2()) {
                        i21 = q1Var2.P5.Q3() ? org.telegram.ui.ActionBar.k6.f27942gc : org.telegram.ui.ActionBar.k6.f27850be;
                    } else {
                        i21 = org.telegram.ui.ActionBar.k6.Wc;
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i21, q1Var2.Pb);
                    if (q1Var2.x2()) {
                        i22 = q1Var2.P5.Q3() ? org.telegram.ui.ActionBar.k6.f27848bc : org.telegram.ui.ActionBar.k6.ce;
                    } else {
                        i22 = q1Var2.P5.Q3() ? org.telegram.ui.ActionBar.k6.f27942gc : org.telegram.ui.ActionBar.k6.f27850be;
                    }
                    textPaint2.setColor(i0.a.f(q1Var2.getVideoTranscriptionProgress(), w02, org.telegram.ui.ActionBar.k6.w0(i22, q1Var2.Pb)));
                } else if (q1Var2.D3()) {
                    if (q1Var2.P5.Q5()) {
                        org.telegram.ui.ActionBar.k6.T2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, q1Var2.Pb));
                    } else {
                        org.telegram.ui.ActionBar.k6.T2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Yd, q1Var2.Pb));
                    }
                } else if (q1Var2.P5.Q3()) {
                    org.telegram.ui.ActionBar.k6.T2.setColor(org.telegram.ui.ActionBar.k6.w0(z11 ? org.telegram.ui.ActionBar.k6.f27848bc : org.telegram.ui.ActionBar.k6.f27942gc, q1Var2.Pb));
                } else {
                    org.telegram.ui.ActionBar.k6.T2.setColor(org.telegram.ui.ActionBar.k6.w0(z11 ? org.telegram.ui.ActionBar.k6.ce : org.telegram.ui.ActionBar.k6.f27850be, q1Var2.Pb));
                }
                float f23 = q1Var2.getTransitionParams().K1 ? q1Var2.getTransitionParams().L1 * f10 : f10;
                if (f23 != 1.0f) {
                    org.telegram.ui.ActionBar.k6.T2.setAlpha((int) (textPaint.getAlpha() * f23));
                }
                canvas2.save();
                if (q1Var2.K && !q1Var2.D3()) {
                    canvas2.translate(0.0f, org.telegram.messenger.g0.L(2.0f));
                }
                float f24 = q1Var2.f29887d7;
                x1 x1Var5 = q1Var2.hb;
                if (x1Var5.f30936x0) {
                    f24 += x1Var5.f30880j0;
                }
                ui uiVar = q1Var2.L;
                if (uiVar == null || !uiVar.f25709m.f25534j) {
                    f13 = f11;
                } else {
                    f24 -= q1Var2.getTranslationY();
                    f13 = f11 + q1Var2.L.f25709m.f25532g;
                }
                float f25 = f24;
                float f26 = f13;
                if (q1Var2.K && q1Var2.D3()) {
                    f25 += org.telegram.messenger.g0.L(1.0f);
                }
                float f27 = f25;
                if (x1Var5.f30936x0) {
                    float f28 = q1Var2.Vc;
                    f13 += f28;
                    f26 += f28;
                }
                float f29 = f13;
                boolean P5 = q1Var2.P5.P5();
                dh.o0 o0Var = q1Var2.O;
                if (P5) {
                    o0Var.getClass();
                }
                if (x1Var5.U0) {
                    f26 = a1.g.D(1.0f, x1Var5.L1, x1Var5.Z0, f26);
                }
                float f30 = f26;
                boolean D3 = q1Var2.D3();
                RectF rectF2 = q1Var2.f29858b4;
                ei.c3 c3Var = q1Var2.U0;
                if (D3) {
                    if (q1Var2.f30127w7) {
                        i17 = q1Var2.t2() ? q1Var2.getCommentButtonHeight() : org.telegram.messenger.g0.L(41.3f);
                    } else {
                        i17 = 0;
                    }
                    int i23 = -i17;
                    if (q1Var2.P5.Q5()) {
                        Z1 = q1Var2.Z1("paintChatActionBackground");
                    } else {
                        Z1 = q1Var2.Z1("paintChatTimeBackground");
                    }
                    int alpha = Z1.getAlpha();
                    float f31 = f23;
                    org.telegram.ui.ActionBar.k6.T2.setAlpha((int) (q1Var2.f29962j4 * 255.0f * f31));
                    zi ziVar3 = q1Var2.P5;
                    if (ziVar3 == null || ziVar3.D != 4) {
                        f18 = f27;
                        f19 = f31;
                    } else {
                        float f32 = c3Var.N() ? 1.0f : c3Var.f21249i1;
                        if (!c3Var.L()) {
                            f32 = 0.0f;
                        }
                        f18 = f27;
                        f19 = org.telegram.messenger.g0.T1(0.35f, 1.0f, f32);
                    }
                    zi ziVar4 = q1Var2.P5;
                    if (ziVar4 != null && ziVar4.f26925z0) {
                        org.telegram.ui.Components.e5 e5Var = q1Var2.m0;
                        f19 *= e5Var == null ? 0.0f : e5Var.e();
                    }
                    Z1.setAlpha((int) com.google.android.recaptcha.internal.a.C(alpha, q1Var2.f29962j4, f19, 0.6f));
                    if (q1Var2.a4()) {
                        int L3 = org.telegram.messenger.g0.L(8.0f);
                        int i24 = az.Y0;
                        if (i24 > 2) {
                            i24 -= 2;
                        }
                        L2 = Math.min(L3, org.telegram.messenger.g0.L(i24));
                        z21 = az.Y0 >= 10;
                        i10 = 2;
                    } else {
                        int i25 = q1Var2.L1;
                        if (i25 != 7 && i25 != 6 && q1Var2.P5.D != 19) {
                            int[] iArr = c3Var.X0;
                            i10 = 2;
                            L2 = Math.min(org.telegram.messenger.g0.L(8.0f), Math.max(iArr[2], iArr[3]));
                            z21 = az.Y0 >= 10;
                        } else {
                            i10 = 2;
                            int L4 = org.telegram.messenger.g0.L(4.0f);
                            zi ziVar5 = q1Var2.P5;
                            L2 = L4 + ((ziVar5 == null || !ziVar5.N2()) ? 0 : org.telegram.messenger.g0.L(8.0f));
                            z21 = false;
                        }
                    }
                    zi ziVar6 = q1Var2.P5;
                    float L5 = f29 + ((ziVar6 == null || !ziVar6.N2()) ? 0 : org.telegram.messenger.g0.L(-6.0f));
                    if (q1Var2.f29958j0 != 0) {
                        L5 -= org.telegram.messenger.g0.L(18.0f);
                    }
                    float L6 = L5 - org.telegram.messenger.g0.L(z21 ? 6.0f : 4.0f);
                    zi ziVar7 = q1Var2.P5;
                    float L7 = (ziVar7 == null || !ziVar7.N2()) ? 0.0f : org.telegram.messenger.g0.L(2.0f);
                    float f33 = f19;
                    float f34 = L5;
                    if (q1Var2.L1 != 7 || ((ziVar = q1Var2.P5) != null && ziVar.h4())) {
                        photoBottom = q1Var2.getPhotoBottom() + q1Var2.f30120w0;
                    } else {
                        photoBottom = f18 - ((1.0f - q1Var2.getVideoTranscriptionProgress()) * (o0Var.i(x1Var5.L1) + org.telegram.messenger.g0.L(q1Var2.K ? 4.0f : 5.0f)));
                    }
                    float f35 = photoBottom;
                    float L8 = f35 - org.telegram.messenger.g0.L(23.0f);
                    float max = Math.max(org.telegram.messenger.g0.L(17.0f), org.telegram.ui.ActionBar.k6.T2.getTextSize() + org.telegram.messenger.g0.L(5.0f));
                    float f36 = L6 - L7;
                    float f37 = L7 + L6 + f12;
                    int i26 = z21 ? 12 : 8;
                    if (q1Var2.P5.Q3()) {
                        i18 = i26;
                        i19 = (q1Var2.P5.D == 19 ? 4 : 0) + 20;
                    } else {
                        i18 = i26;
                        i19 = 0;
                    }
                    rectF2.set(f36, L8, f37 + org.telegram.messenger.g0.L(i18 + i19), L8 + max);
                    l4 l4Var = q1Var2.W5;
                    if (l4Var != null) {
                        float f38 = L2;
                        canvas2.save();
                        Path path = l4Var.f29565t;
                        path.rewind();
                        path.addRoundRect(rectF2, f38, f38, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.drawColor(1073741824);
                        canvas2.restore();
                    } else if (!zi.c4(q1Var2.P5.f26868k)) {
                        if (q1Var2.P5.u2() && q1Var2.P5.D != 5) {
                            Path path2 = q1Var2.A4;
                            path2.rewind();
                            float f39 = L2;
                            path2.addRoundRect(rectF2, f39, f39, Path.Direction.CW);
                            canvas2.save();
                            canvas2.clipPath(path2);
                            ImageReceiver imageReceiver = q1Var2.P5.n5() ? c3Var : q1Var2.V0;
                            float alpha2 = imageReceiver.getAlpha();
                            imageReceiver.setAlpha(0.5f * alpha2);
                            imageReceiver.h(canvas2, null);
                            imageReceiver.setAlpha(alpha2);
                            canvas2.restore();
                            Paint Z12 = q1Var2.Z1("paintChatTimeBackground");
                            int alpha3 = Z12.getAlpha();
                            Z12.setAlpha((int) (alpha3 * q1Var2.f29973k4 * 0.4f));
                            canvas2.drawRoundRect(rectF2, f39, f39, Z12);
                            Z12.setAlpha(alpha3);
                        } else {
                            q1Var2.x();
                            float f40 = L2;
                            canvas2.drawRoundRect(rectF2, f40, f40, Z1);
                            if (Z1 == q1Var2.Z1("paintChatActionBackground") && q1Var2.g2()) {
                                int alpha4 = org.telegram.ui.ActionBar.k6.f27951h2.getAlpha();
                                org.telegram.ui.ActionBar.k6.f27951h2.setAlpha((int) (alpha4 * q1Var2.f29962j4 * f33));
                                canvas2.drawRoundRect(rectF2, f40, f40, org.telegram.ui.ActionBar.k6.f27951h2);
                                org.telegram.ui.ActionBar.k6.f27951h2.setAlpha(alpha4);
                            }
                        }
                    }
                    Z1.setAlpha(alpha);
                    float f41 = -staticLayout.getLineLeft(0);
                    zi ziVar8 = q1Var2.P5;
                    float L9 = f41 + ((ziVar8 == null || !ziVar8.N2()) ? 0 : org.telegram.messenger.g0.L(-6.0f));
                    if (q1Var2.P5.P5()) {
                        o0Var.getClass();
                    }
                    if ((!org.telegram.messenger.t3.T(q1Var2.f29968ja) || q1Var2.f29968ja.megagroup) && (q1Var2.P5.f26868k.flags & 1024) == 0 && q1Var2.f29918fa == null && !q1Var2.f30037p6) {
                        f20 = L9;
                        rectF = rectF2;
                        f23 = f31;
                        f27 = f18;
                        i13 = i23;
                        z22 = false;
                        c2 = 6;
                        c10 = 7;
                        c11 = 4;
                    } else {
                        float lineWidth = (q1Var2.f30167z9 - staticLayout.getLineWidth(0)) + L9;
                        o0Var.getClass();
                        int b10 = x1Var5.b();
                        int i27 = x1Var5.f30846b2;
                        if (i27 >= 0 && i27 != b10 && !q1Var2.f30080sb) {
                            q1Var2.B0(i27, b10, z10);
                        }
                        boolean z25 = q1Var2.f30080sb;
                        if (z25) {
                            b10 = q1Var2.f30042pb;
                        }
                        boolean z26 = (b10 & 4) != 0;
                        boolean z27 = (b10 & 8) != 0;
                        if (z25) {
                            int i28 = q1Var2.f30055qb;
                            if ((i28 & 4) != 0) {
                                i20 = i28;
                                z24 = true;
                            } else {
                                i20 = i28;
                                z24 = false;
                            }
                            boolean z28 = (i20 & 8) != 0;
                            float f42 = i23;
                            x1Var4 = x1Var5;
                            f21 = lineWidth;
                            rectF = rectF2;
                            float f43 = f18;
                            c2 = 6;
                            c11 = 4;
                            z22 = false;
                            i13 = i23;
                            c10 = 7;
                            q1Var2.T0(canvas2, z24, z28, f43, f31, f42, f34, 1.0f - q1Var2.f30067rb, z11);
                            boolean z29 = z24;
                            boolean z30 = z28;
                            boolean z31 = z26;
                            boolean z32 = z27;
                            q1Var2.T0(canvas, z31, z32, f43, f31, f42, f34, q1Var2.f30067rb, z11);
                            f27 = f43;
                            f22 = f34;
                            z23 = z31;
                            f23 = f31;
                            if (!q1Var2.P5.Q3()) {
                                if (!z29 && !z30) {
                                    q1Var2.A1(canvas, f23, f42, f22, 1.0f - q1Var2.f30067rb, z11);
                                }
                                if (!z23 && !z32) {
                                    q1Var2.A1(canvas, f23, f42, f22, q1Var2.f30067rb, z11);
                                }
                            }
                        } else {
                            x1Var4 = x1Var5;
                            f21 = lineWidth;
                            rectF = rectF2;
                            boolean z33 = z26;
                            boolean z34 = z27;
                            float f44 = f18;
                            i13 = i23;
                            c2 = 6;
                            c10 = 7;
                            c11 = 4;
                            z22 = false;
                            if (!q1Var2.P5.Q3() && !z33 && !z34) {
                                q1Var2.A1(canvas, f31, i13, f34, 1.0f, z11);
                            }
                            q1Var2 = this;
                            q1Var2.T0(canvas, z33, z34, f44, f31, i13, f34, 1.0f, z11);
                            f27 = f44;
                            f22 = f34;
                            z23 = z33;
                            f23 = f31;
                        }
                        if (q1Var2.P5.Q3()) {
                            canvas2 = canvas;
                            q1Var2.A1(canvas2, f23, i13, f22, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        x1Var5 = x1Var4;
                        x1Var5.f30846b2 = x1Var4.b();
                        if (z23 && z10 && q1Var2.getParent() != null) {
                            ((View) q1Var2.getParent()).invalidate();
                        }
                        f20 = f21;
                    }
                    canvas2.save();
                    float f45 = f30 + f20;
                    q1Var2.f30129w9 = f45;
                    float L10 = (f35 - org.telegram.messenger.g0.L(7.3f)) - staticLayout.getHeight();
                    q1Var2.f30143x9 = L10;
                    canvas2.translate(f45, L10);
                    yh.f.f(canvas2, staticLayout);
                    canvas2.restore();
                    org.telegram.ui.ActionBar.k6.T2.setAlpha(255);
                    i15 = z22;
                    z12 = z21;
                } else {
                    rectF = rectF2;
                    i10 = 2;
                    c2 = 6;
                    c10 = 7;
                    c11 = 4;
                    if (q1Var2.P5.s4()) {
                        i12 = -org.telegram.messenger.g0.L(48.0f);
                        if (q1Var2.f29861b7) {
                            i12 -= org.telegram.messenger.g0.L(4.0f);
                        }
                    } else {
                        if (q1Var2.f30127w7) {
                            i11 = q1Var2.t2() ? q1Var2.getCommentButtonHeight() : org.telegram.messenger.g0.L(43.0f);
                        } else {
                            i11 = 0;
                        }
                        i12 = -i11;
                    }
                    i13 = i12;
                    float f46 = -staticLayout.getLineLeft(0);
                    if (q1Var2.P5.P5()) {
                        o0Var.getClass();
                    }
                    if ((org.telegram.messenger.t3.T(q1Var2.f29968ja) && !q1Var2.f29968ja.megagroup) || (q1Var2.P5.f26868k.flags & 1024) != 0 || q1Var2.f29918fa != null || x1Var5.G || q1Var2.f30037p6 || x1Var5.C) {
                        float lineWidth2 = (f12 - staticLayout.getLineWidth(0)) + f46;
                        o0Var.getClass();
                        int b11 = x1Var5.b();
                        int i29 = x1Var5.f30846b2;
                        if (i29 >= 0 && i29 != b11 && !q1Var2.f30080sb) {
                            q1Var2.B0(i29, b11, z10);
                        }
                        boolean z35 = q1Var2.f30080sb;
                        if (z35) {
                            b11 = q1Var2.f30042pb;
                        }
                        boolean z36 = (b11 & 4) != 0;
                        boolean z37 = (b11 & 8) != 0;
                        if (z35) {
                            int i30 = q1Var2.f30055qb;
                            boolean z38 = (i30 & 4) != 0;
                            boolean z39 = (i30 & 8) != 0;
                            float f47 = i13;
                            float f48 = f23;
                            boolean z40 = z38;
                            x1Var = x1Var5;
                            q1Var2.T0(canvas2, z40, z39, f27, f48, f47, f29, 1.0f - q1Var2.f30067rb, z11);
                            boolean z41 = z39;
                            boolean z42 = z36;
                            boolean z43 = z37;
                            q1Var2.T0(canvas, z42, z43, f27, f48, f47, f29, q1Var2.f30067rb, z11);
                            f27 = f27;
                            f14 = f29;
                            z13 = z42;
                            f23 = f48;
                            if (!q1Var2.P5.Q3()) {
                                if (!z40 && !z41) {
                                    q1Var2.A1(canvas, f23, f47, f14, 1.0f - q1Var2.f30067rb, z11);
                                }
                                if (!z13 && !z43) {
                                    q1Var2.A1(canvas, f23, f47, f14, q1Var2.f30067rb, z11);
                                }
                            }
                        } else {
                            x1Var = x1Var5;
                            boolean z44 = z36;
                            boolean z45 = z37;
                            if (!q1Var2.P5.Q3() && !z44 && !z45) {
                                q1Var2.A1(canvas, f23, i13, f29, 1.0f, z11);
                            }
                            q1Var2 = this;
                            float f49 = f23;
                            q1Var2.T0(canvas, z44, z45, f27, f49, i13, f29, 1.0f, z11);
                            f27 = f27;
                            f14 = f29;
                            z13 = z44;
                            f23 = f49;
                        }
                        if (q1Var2.P5.Q3()) {
                            canvas2 = canvas;
                            q1Var2.A1(canvas2, f23, i13, f14, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        x1Var5 = x1Var;
                        x1Var5.f30846b2 = x1Var.b();
                        if (z13 && z10 && q1Var2.getParent() != null) {
                            ((View) q1Var2.getParent()).invalidate();
                        }
                        f46 = lineWidth2;
                    }
                    canvas2.save();
                    if (x1Var5.U0 && x1Var5.L1 != 1.0f) {
                        if (x1Var5.V0 != null) {
                            canvas2.translate(f30 + f46, ((f27 - org.telegram.messenger.g0.L((q1Var2.G || q1Var2.F) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i13);
                            int alpha5 = org.telegram.ui.ActionBar.k6.T2.getAlpha();
                            org.telegram.ui.ActionBar.k6.T2.setAlpha((int) (alpha5 * x1Var5.L1));
                            x1Var5.V0.draw(canvas2);
                            org.telegram.ui.ActionBar.k6.T2.setAlpha(alpha5);
                            yh.f.f(canvas2, x1Var5.W0);
                            i14 = 0;
                        } else {
                            int alpha6 = org.telegram.ui.ActionBar.k6.T2.getAlpha();
                            canvas2.save();
                            float f50 = i13;
                            canvas2.translate(x1Var5.f30872h1 + f46, ((f27 - org.telegram.messenger.g0.L((q1Var2.G || q1Var2.F) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f50);
                            float f51 = alpha6;
                            i14 = 0;
                            org.telegram.ui.ActionBar.k6.T2.setAlpha((int) ((1.0f - x1Var5.L1) * f51));
                            yh.f.f(canvas2, x1Var5.W0);
                            canvas2.restore();
                            canvas2.translate(f30 + f46, ((f27 - org.telegram.messenger.g0.L((q1Var2.G || q1Var2.F) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f50);
                            org.telegram.ui.ActionBar.k6.T2.setAlpha((int) (f51 * x1Var5.L1));
                            yh.f.f(canvas2, staticLayout);
                            org.telegram.ui.ActionBar.k6.T2.setAlpha(alpha6);
                        }
                    } else {
                        i14 = 0;
                        float f52 = f30 + f46;
                        q1Var2.f30129w9 = f52;
                        float L11 = ((f27 - org.telegram.messenger.g0.L((q1Var2.G || q1Var2.F) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i13;
                        q1Var2.f30143x9 = L11;
                        canvas2.translate(f52, L11);
                        yh.f.f(canvas2, staticLayout);
                    }
                    canvas2.restore();
                    z12 = i14 == 1 ? 1 : 0;
                    i15 = i14;
                }
                int i31 = i13;
                if (q1Var2.P5.Q3()) {
                    int b12 = x1Var5.b();
                    int i32 = x1Var5.f30846b2;
                    if (i32 >= 0 && i32 != b12 && !q1Var2.f30080sb) {
                        q1Var2.B0(i32, b12, z10);
                    }
                    if (q1Var2.f30080sb) {
                        b12 = q1Var2.f30042pb;
                    }
                    int i33 = (b12 & 1) != 0 ? true : i15;
                    int i34 = (b12 & 2) != 0 ? true : i15;
                    if ((b12 & 4) != 0) {
                        x1Var2 = x1Var5;
                        z14 = true;
                    } else {
                        x1Var2 = x1Var5;
                        z14 = i15;
                    }
                    boolean z46 = (b12 & 8) != 0 ? true : i15;
                    if (q1Var2.Gc != 0.0f) {
                        canvas2.save();
                        f16 = 0.0f;
                        canvas2.translate(0.0f, q1Var2.Gc);
                        i16 = 1;
                    } else {
                        f16 = 0.0f;
                        i16 = i15;
                    }
                    if (q1Var2.f30080sb) {
                        int i35 = q1Var2.f30055qb;
                        if ((i35 & 1) != 0) {
                            z15 = i34;
                            f17 = f23;
                            z16 = true;
                        } else {
                            z15 = i34;
                            f17 = f23;
                            z16 = i15;
                        }
                        boolean z47 = (i35 & 2) != 0 ? true : i15;
                        if ((i35 & 4) != 0) {
                            z17 = z14;
                            z18 = true;
                        } else {
                            z17 = z14;
                            z18 = i15;
                        }
                        if ((i35 & 8) != 0) {
                            z19 = z46;
                            z20 = true;
                        } else {
                            z19 = z46;
                            z20 = i15;
                        }
                        if (!z18 && z47 && z15 && !z16 && i33) {
                            x1Var3 = x1Var2;
                            f15 = f16;
                            z14 = z17;
                            str = "paintChatTimeBackground";
                            q1Var2.w1(canvas2, i33, z15, z14, z19, f17, z12, i31, f27, q1Var2.f30067rb, true, z11);
                        } else {
                            x1Var3 = x1Var2;
                            f15 = f16;
                            boolean z48 = z15;
                            boolean z49 = i33;
                            str = "paintChatTimeBackground";
                            float f53 = i31;
                            q1Var2.w1(canvas, z16, z47, z18, z20, f17, z12, f53, f27, 1.0f - q1Var2.f30067rb, false, z11);
                            z14 = z17;
                            q1Var2.w1(canvas, z49, z48, z14, z19, f17, z12, f53, f27, q1Var2.f30067rb, false, z11);
                        }
                        q1Var = this;
                        canvas2 = canvas;
                    } else {
                        x1Var3 = x1Var2;
                        f15 = f16;
                        str = "paintChatTimeBackground";
                        canvas2 = canvas;
                        w1(canvas2, i33, i34, z14, z46, f23, z12, i31, f27, 1.0f, false, z11);
                        q1Var = this;
                    }
                    if (i16 != 0) {
                        canvas2.restore();
                    }
                    x1Var3.f30846b2 = x1Var3.b();
                    if (z10 && z14 && q1Var.getParent() != null) {
                        ((View) q1Var.getParent()).invalidate();
                    }
                } else {
                    q1Var = q1Var2;
                    str = "paintChatTimeBackground";
                    f15 = 0.0f;
                }
                canvas2.restore();
                if (q1Var.W9 != null) {
                    if (q1Var.U9 == f15 || q1Var.V9 == f15) {
                        q1Var.A();
                    }
                    Path path3 = q1Var.f29851aa;
                    path3.rewind();
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    rectF3.set(c3Var.L0, c3Var.M0, c3Var.y(), c3Var.A());
                    int[] iArr2 = c3Var.X0;
                    float f54 = iArr2[i15];
                    float[] fArr = q1Var.f29864ba;
                    fArr[1] = f54;
                    fArr[i15] = f54;
                    float f55 = iArr2[1];
                    fArr[3] = f55;
                    fArr[i10] = f55;
                    float f56 = iArr2[i10];
                    fArr[5] = f56;
                    fArr[c11] = f56;
                    float f57 = iArr2[3];
                    fArr[c10] = f57;
                    fArr[c2] = f57;
                    Path.Direction direction = Path.Direction.CW;
                    path3.addRoundRect(rectF3, fArr, direction);
                    canvas2.save();
                    canvas2.clipPath(path3);
                    path3.rewind();
                    rectF3.set(q1Var.U9 - org.telegram.messenger.g0.L(12.0f), q1Var.V9 - org.telegram.messenger.g0.L(8.0f), q1Var.U9 + org.telegram.ui.ActionBar.k6.L3.getIntrinsicWidth() + org.telegram.messenger.g0.L(14.0f) + q1Var.W9.getWidth() + org.telegram.messenger.g0.L(12.0f), q1Var.V9 + q1Var.W9.getHeight() + org.telegram.messenger.g0.L(8.0f));
                    path3.addRoundRect(rectF3, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), direction);
                    canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    if (q1Var.P9 == null) {
                        if (q1Var.Z9 == null) {
                            q1Var.Z9 = new yh.f();
                        }
                        q1Var.Z9.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                        q1Var.Z9.setBounds((int) c3Var.L0, (int) c3Var.M0, (int) c3Var.y(), (int) c3Var.A());
                        q1Var.Z9.draw(canvas2);
                    }
                    q1Var.invalidate();
                    canvas2.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, q1Var.getWidth(), q1Var.getHeight(), (int) (q1Var.T9 * 255.0f), 31);
                    int alpha7 = org.telegram.ui.ActionBar.k6.f27969i2.getAlpha();
                    org.telegram.ui.ActionBar.k6.f27969i2.setAlpha((int) (alpha7 * 0.7f));
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.ui.ActionBar.k6.f27969i2);
                    org.telegram.ui.ActionBar.k6.f27969i2.setAlpha(alpha7);
                    canvas.translate(q1Var.U9 + org.telegram.messenger.g0.L(4.0f), q1Var.V9);
                    Drawable drawable = org.telegram.ui.ActionBar.k6.L3;
                    int i36 = i15;
                    drawable.setBounds(i36, i36, drawable.getIntrinsicWidth(), org.telegram.ui.ActionBar.k6.L3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.k6.L3.draw(canvas);
                    canvas.translate(org.telegram.ui.ActionBar.k6.L3.getIntrinsicWidth() + org.telegram.messenger.g0.L(6.0f), f15);
                    yh.f.f(canvas, q1Var.W9);
                    canvas.restore();
                    if (q1Var.f30033p2 != null && c3Var.R0 && q1Var.f30160z2 == 0) {
                        int i37 = az.Y0;
                        int i38 = i10;
                        if (i37 > i38) {
                            L = org.telegram.messenger.g0.L(i37 - i38);
                            z12 = az.Y0 < 10 ? i36 : true;
                        } else {
                            L = org.telegram.messenger.g0.L(i37);
                        }
                        int L12 = (int) (c3Var.L0 + org.telegram.messenger.g0.L(9.0f));
                        int L13 = (int) (c3Var.M0 + org.telegram.messenger.g0.L(6.0f));
                        RectF rectF4 = rectF;
                        rectF4.set(L12 - org.telegram.messenger.g0.L(4.0f), L13 - org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(z12 ? 2.0f : f15) + org.telegram.messenger.g0.L(4.0f) + q1Var.Y1 + L12, org.telegram.messenger.g0.L(1.5f) + q1Var.f30033p2.getHeight() + L13);
                        canvas.drawRoundRect(rectF4, L, L, q1Var.Z1(str));
                        canvas.save();
                        if (!z12) {
                            i38 = i36;
                        }
                        canvas.translate(L12 + i38, L13);
                        yh.f.f(canvas, q1Var.f30033p2);
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final boolean y2() {
        if (!this.k1 && !this.f30140x6 && !this.f30126w6) {
            return false;
        }
        return true;
    }

    public final void y3(int i3, int i10, int i11, float f10, float f11, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        cv cvVar;
        x1 x1Var;
        wi wiVar;
        zi ziVar;
        this.f30030oc = i3;
        this.f30056qc = i10;
        this.f30068rc = i11;
        this.L0 = i12;
        this.M0 = i13;
        this.tc = f11;
        this.f30081sc = f10;
        this.f29865bb = i13;
        this.f29878cb = i14;
        this.f29891db = i15;
        this.f30043pc = i16;
        if ((!this.H5.isEmpty() || (this.f30119w != null && (ziVar = this.P5) != null && ziVar.D == 27)) && this.f29852ab != f11) {
            invalidate();
        }
        this.f29852ab = f11;
        if (i11 != this.M0 || f10 != this.N0) {
            this.N0 = f10;
            this.M0 = i11;
        }
        if (this.P5 != null && g2() && this.P5.Q5()) {
            invalidate();
        }
        zi ziVar2 = this.P5;
        if (ziVar2 != null && ziVar2.f26927z2 != null) {
            int i19 = i3 - this.f30094u0;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                int size = this.P5.f26927z2.size();
                x1Var = this.hb;
                if (i20 >= size || ((wi) this.P5.f26927z2.get(i20)).p(this.P5.f26927z2, x1Var) > i19) {
                    break;
                }
                i21 = i20;
                i20++;
            }
            int i22 = 0;
            int i23 = -1;
            int i24 = -1;
            while (i21 < this.P5.f26927z2.size()) {
                float p10 = ((wi) this.P5.f26927z2.get(i21)).p(this.P5.f26927z2, x1Var);
                float j10 = wiVar.f26211f + p10 + wiVar.j(x1Var) + wiVar.h;
                float f12 = i19;
                if (o2(p10, j10, f12, i19 + i10)) {
                    if (i23 == -1) {
                        i23 = i21;
                    }
                    i22++;
                    i24 = i21;
                } else if (p10 > f12) {
                    break;
                }
                i21++;
            }
            if (this.E0 == i24 && this.F0 == i23 && this.G0 == i22) {
                if (this.f30168za != null) {
                    int i25 = 0;
                    while (true) {
                        if (i25 >= this.f30168za.f35600a.size()) {
                            break;
                        }
                        org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) this.f30168za.f35600a.get(i25);
                        if (k5Var != null && k5Var.f35313n) {
                            float y9 = (0.0f - getY()) - k5Var.f35314r;
                            float y10 = (this.f30005n - getY()) - k5Var.f35314r;
                            Rect rect = k5Var.f35311e;
                            if (rect.bottom >= y9 && rect.top <= y10) {
                                invalidate();
                                break;
                            }
                        }
                        i25++;
                    }
                }
            } else {
                this.E0 = i24;
                this.F0 = i23;
                this.G0 = i22;
                invalidate();
            }
        }
        zi ziVar3 = this.P5;
        if (ziVar3 != null && (cvVar = ziVar3.f26915w2) != null) {
            ArrayList arrayList = cvVar.f22070g;
            int i26 = i3 - this.f30094u0;
            int i27 = -1;
            int i28 = -1;
            for (int i29 = 0; i29 < arrayList.size(); i29++) {
                xt xtVar = (xt) arrayList.get(i29);
                if (xtVar.R || xtVar.S) {
                    float f13 = xtVar.N;
                    float f14 = i26 + i10;
                    if (o2(f13, xtVar.I() + f13, i26, f14)) {
                        if (i27 == -1) {
                            i27 = i29;
                        }
                        i28 = i29;
                    } else if (f13 > f14) {
                        break;
                    }
                }
            }
            if (this.H0 != i27 || this.I0 != i28) {
                this.H0 = i27;
                this.I0 = i28;
                invalidate();
            }
        }
        ArrayList arrayList2 = this.P4;
        if (!arrayList2.isEmpty()) {
            int i30 = -1;
            int i31 = -1;
            for (int i32 = 0; i32 < arrayList2.size(); i32++) {
                p1 p1Var = (p1) arrayList2.get(i32);
                int i33 = p1Var.f29778b + this.Ta;
                if (o2(i33, i33 + p1Var.f29779c, this.f30030oc, i18 + this.f30056qc)) {
                    if (i31 == -1) {
                        i31 = i32;
                    }
                    i30 = i32;
                }
            }
            if (this.S4 != i30 || this.R4 != i31) {
                this.S4 = i30;
                this.R4 = i31;
                invalidate();
            }
        }
        if (this.I8) {
            if (Math.abs(this.T8 - Math.max(Math.min(org.telegram.messenger.g0.L(4.0f) + (-this.f30043pc), this.R8 - org.telegram.messenger.g0.L(42.0f)), org.telegram.messenger.g0.L(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        dh.o0 o0Var = this.O;
        int i34 = o0Var.f9114c;
        boolean o22 = o2(i34, i34 + o0Var.f9122m, this.f30030oc, i17 + this.f30056qc);
        if (this.U4 != o22) {
            this.U4 = o22;
            invalidate();
        }
    }

    public final void z(int i3, int i10, int i11) {
        int l12;
        boolean z10;
        int i12;
        int i13;
        cv cvVar;
        boolean z11;
        if (this.P5.s4()) {
            this.f29848a7 = org.telegram.messenger.g0.L(31.0f) + i11;
        } else if (a4()) {
            this.f29848a7 = org.telegram.messenger.g0.L(31.0f) + i11;
        } else {
            dh.o0 o0Var = this.O;
            if (!o0Var.f9125p) {
                l12 = o0Var.f9127r;
            } else {
                l12 = this.P5.l1();
            }
            int i14 = 0;
            if (!o0Var.f9125p) {
                if (i3 - l12 >= i10 && !this.P5.f26908u2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (this.T1) {
                    this.f30106v0 = org.telegram.messenger.g0.L(14.0f) + this.f30106v0;
                }
            } else if ((this.f30095u1 || ((!this.Q1 || this.P5.s4()) && !f2() && !this.R1 && !this.S1 && !this.T1)) && i3 - l12 >= i10 && !this.P5.f26908u2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.P5.H4()) {
                z10 = true;
            }
            if (o0Var.f9125p && (cvVar = this.P5.f26915w2) != null) {
                ArrayList arrayList = cvVar.h;
                ArrayList arrayList2 = cvVar.f22070g;
                if (!arrayList2.isEmpty() && !cvVar.d && !cvVar.I()) {
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            if (((tt) obj).f25592b >= arrayList2.size() - 1) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    z11 = ((xt) k2.p1.h(1, arrayList2)).v();
                } else {
                    z11 = true;
                    break;
                }
                if (z11) {
                    z10 = true;
                }
            }
            zi ziVar = this.P5;
            if ((ziVar.D2 && o0Var.f9125p) || ((ziVar.H2 && o0Var.f9125p) || ziVar.w3())) {
                i12 = 18;
                z10 = true;
            } else {
                i12 = 14;
            }
            if (z10) {
                this.f30106v0 = org.telegram.messenger.g0.L(i12) + this.f30106v0;
                this.f29861b7 = true;
                int L = org.telegram.messenger.g0.L(31.0f) + Math.max(i11, l12);
                this.f29848a7 = L;
                if (this.P5.Q3()) {
                    i13 = org.telegram.messenger.g0.L(17.0f) + this.f30167z9;
                } else {
                    i13 = this.f30167z9;
                }
                this.f29848a7 = org.telegram.messenger.k5.b(31.0f, i13, L);
            } else {
                int extraTextX = (i11 - getExtraTextX()) - l12;
                if (extraTextX >= 0 && extraTextX <= i10) {
                    this.f29848a7 = org.telegram.messenger.g0.L(31.0f) + ((i11 + i10) - extraTextX);
                } else {
                    this.f29848a7 = org.telegram.messenger.g0.L(31.0f) + Math.max(i11, l12 + i10);
                }
            }
            if (t2()) {
                this.f29848a7 = org.telegram.messenger.g0.L(31.0f) + i3;
            }
        }
    }

    public final void z0(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        long[] x10 = zb.D().x(org.telegram.messenger.w7.B(document));
        if (x10 != null) {
            y0(x10[0], x10[1]);
        } else {
            y0(this.P5.F0, document.size);
        }
    }

    public final void z1(android.graphics.Canvas r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.z1(android.graphics.Canvas, int):void");
    }

    public final boolean z2() {
        if (this.Q5 != null) {
            return this.U5;
        }
        return this.H;
    }

    public final void z3(int r21, org.telegram.messenger.zi r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.z3(int, org.telegram.messenger.zi):void");
    }

    public q1(Context context, int i3, boolean z10, k4.j jVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = true;
        this.f30133x = new org.telegram.ui.Components.i9(5);
        xq xqVar = xq.h;
        this.E = new qe.a(0, this, xqVar, 380L, false);
        this.O = new dh.o0(this);
        this.P = new ah.b(this);
        this.Q = new ah.d(this);
        this.D0 = new Rect();
        this.H0 = -1;
        this.I0 = -1;
        this.T0 = new int[4];
        this.I2 = new Drawable[2];
        this.J2 = new org.telegram.ui.ActionBar.v5[2];
        this.K2 = new int[2];
        this.L2 = new RectF();
        this.M2 = new int[]{16842910, 16842919};
        this.i3 = -1;
        this.f29961j3 = -1;
        this.f29845a4 = new RectF();
        this.f29858b4 = new RectF();
        this.f29962j4 = 1.0f;
        this.f29973k4 = 1.0f;
        this.f30074s4 = -1;
        this.f30086t4 = new m2.p0(this);
        this.f30110v4 = new ArrayList();
        this.f30124w4 = new ArrayList();
        this.A4 = new Path();
        this.O4 = new ArrayList();
        this.P4 = new ArrayList();
        this.R4 = -1;
        this.S4 = -1;
        this.U4 = true;
        this.H5 = new ArrayList();
        this.f29860b6 = -1;
        this.C6 = true;
        this.H6 = true;
        this.f29848a7 = 100;
        this.f30141x7 = new Rect();
        this.R7 = new AtomicReference();
        this.f29850a9 = new RectF();
        this.f30040p9 = new StaticLayout[2];
        this.f30115v9 = new float[2];
        this.E9 = true;
        this.I9 = new Path();
        this.J9 = new float[8];
        this.T9 = 1.0f;
        this.f29851aa = new Path();
        this.f29864ba = new float[8];
        this.La = new RectF();
        this.Ma = new RectF();
        this.f29919fb = Build.VERSION.SDK_INT == 28;
        this.f29932gb = 1.0f;
        this.hb = new x1(this);
        this.f29992lb = new org.telegram.ui.Components.u5(this, 200L, xq.f40453g);
        this.f30029ob = new h1(this, 0);
        this.f30117vb = new h1(this, 1);
        this.f30131wb = new SparseArray();
        this.Kb = -1;
        this.Mb = new m.b3();
        this.Sb = new ArrayList();
        this.Tb = new Stack();
        this.Ub = new Path();
        this.Xb = new c1(this, 10);
        this.Yb = new c1(this, 2);
        this.f29905ec = false;
        this.f30004mc = new AtomicReference();
        this.f30017nc = -1L;
        this.f30170zc = false;
        this.Ac = new c1(this, 0);
        this.Jc = true;
        this.Rc = 1.0f;
        this.Wc = new g1(Float.class, "animationOffsetX", 0);
        this.Yc = new Path();
        this.Z5 = i3;
        this.Pb = e6Var;
        this.Qb = z10;
        this.Rb = jVar;
        if (jVar == null) {
            this.Rb = new k4.j(context);
        }
        setClipChildren(false);
        setClipToPadding(false);
        ?? drawable = new Drawable();
        drawable.f33317a = new Paint(1);
        drawable.f33318b = null;
        drawable.h = -1.0f;
        drawable.f33323i = -1.0f;
        drawable.f33324j = -1.0f;
        drawable.f33325k = -1.0f;
        drawable.f33327m = this;
        this.Sa = drawable;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f30165z7 = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(21.0f));
        this.A7 = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.S7 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.J0(org.telegram.messenger.g0.L(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.E7 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.J0(org.telegram.messenger.g0.L(26.1f));
        this.Y5 = org.telegram.messenger.z5.q(i3).k();
        this.X0 = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        ei.c3 c3Var = new ei.c3(this, this, 2);
        this.U0 = c3Var;
        c3Var.A1 = true;
        c3Var.m0 = true;
        c3Var.f21247h1 = this;
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.V0 = imageReceiver4;
        imageReceiver4.A1 = true;
        imageReceiver4.m0 = true;
        this.Q0 = new RadialProgress2(this, e6Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.R0 = radialProgress2;
        radialProgress2.B = false;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(15.0f));
        i1 i1Var = new i1(this, this);
        this.C4 = i1Var;
        i1Var.h = this;
        ?? obj = new Object();
        obj.f38065a = 0;
        obj.f38066b = 0;
        obj.f38068e = false;
        obj.f38069f = false;
        obj.f38081s = 1.0f;
        obj.f38082t = 1.0f;
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(125L, 600L, xqVar);
        obj.v = u5Var;
        obj.f38084w = 1.0f;
        org.telegram.ui.Components.u5 u5Var2 = new org.telegram.ui.Components.u5(150L, xq.f40452f);
        obj.B = u5Var2;
        obj.J = false;
        if (sm0.N == null) {
            sm0.N = new Paint(1);
            sm0.O = new Paint(1);
            Paint paint = sm0.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            sm0.O.setStyle(style);
        }
        this.D4 = obj;
        obj.f38073k = this;
        obj.f38076n = this;
        u5Var2.f38643a = this;
        u5Var.f38643a = this;
        this.E4 = new org.telegram.ui.ActionBar.t0(this, 1);
        ?? drawable2 = new Drawable();
        drawable2.f34724a = 0L;
        drawable2.f34725b = false;
        drawable2.f34726c = new Paint(1);
        drawable2.d = 0.47f;
        drawable2.f34727e = 0.0f;
        drawable2.f34728f = 0.32f;
        drawable2.f34729g = 1;
        drawable2.h = 1;
        drawable2.f34730i = 1;
        drawable2.f34734m = 255;
        drawable2.f34735n = e6Var;
        drawable2.f34731j = this;
        this.f29870c3 = drawable2;
        setImportantForAccessibility(1);
    }

    public void setBackgroundTopY(int i3) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.t4 t4Var = this.K6;
        int i12 = this.L0;
        int i13 = this.M0;
        if (i13 == 0) {
            i12 = getParentWidth();
            i13 = org.telegram.messenger.g0.f22608q.y;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                i11 = view.getMeasuredWidth();
                i10 = view.getMeasuredHeight();
                float f10 = this.N0;
                t4Var.q((int) (i3 + f10), i11, i10, (int) f10, this.f29878cb, this.f29891db, this.F, (this.G && this.hb.A0 == 1.0f) ? false : true);
                t4Var.f28651u = h2();
            }
        }
        i10 = i13;
        i11 = i12;
        float f102 = this.N0;
        t4Var.q((int) (i3 + f102), i11, i10, (int) f102, this.f29878cb, this.f29891db, this.F, (this.G && this.hb.A0 == 1.0f) ? false : true);
        t4Var.f28651u = h2();
    }

    @Override
    public void invalidate(int i3, int i10, int i11, int i12) {
        l1 l1Var;
        if (this.P5 == null) {
            return;
        }
        Runnable runnable = this.Bc;
        if (runnable != null) {
            runnable.run();
            return;
        }
        Runnable runnable2 = this.Cc;
        if (runnable2 != null) {
            runnable2.run();
        }
        super.invalidate(i3, i10, i11, i12);
        if (this.f29847a6 && getParent() != null) {
            ((View) getParent()).invalidate(((int) getX()) + i3, ((int) getY()) + i10, ((int) getX()) + i11, ((int) getY()) + i12);
        }
        if (!this.Vb || (l1Var = this.Ra) == null) {
            return;
        }
        l1Var.q();
    }

    @Override
    public final void F(float f10, int i3) {
    }

    @Override
    public final void F0(int i3, Drawable drawable) {
    }
}
