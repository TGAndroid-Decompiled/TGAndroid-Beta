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
import bi.ub;
import bi.ud;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.aj;
import org.telegram.messenger.bu;
import org.telegram.messenger.cj;
import org.telegram.messenger.dj;
import org.telegram.messenger.fj;
import org.telegram.messenger.fu;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ib;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.kv;
import org.telegram.messenger.lc;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.rc;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.zo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.t31;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.Components.zj0;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fr0;
import org.telegram.ui.ol;
import org.telegram.ui.tg0;
public class q1 extends z implements im0, lc, org.telegram.messenger.x5, q9, ls, te.b, p4, j60 {
    public static final float[] f29762hd = new float[8];
    public static TextPaint f29763id;
    public static TextPaint f29764jd;
    public boolean A0;
    public boolean A1;
    public int A2;
    public long A3;
    public final Path A4;
    public boolean A5;
    public long A6;
    public final org.telegram.ui.Components.w8 A7;
    public r70 A8;
    public int A9;
    public org.telegram.ui.Components.n5 Aa;
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
    public a80 B8;
    public int B9;
    public org.telegram.ui.Components.n5 Ba;
    public float Bb;
    public Runnable Bc;
    public final Rect C0;
    public int C1;
    public int C2;
    public ly0 C3;
    public final i1 C4;
    public int C5;
    public boolean C6;
    public boolean C7;
    public ArrayList C8;
    public int C9;
    public org.telegram.ui.Components.n5 Ca;
    public float Cb;
    public Runnable Cc;
    public final te.a D;
    public int D0;
    public float D1;
    public boolean D2;
    public ly0 D3;
    public final pm0 D4;
    public boolean D5;
    public boolean D6;
    public boolean D7;
    public boolean D8;
    public CharSequence D9;
    public org.telegram.ui.Components.n5 Da;
    public long Db;
    public int Dc;
    public boolean E;
    public int E0;
    public boolean E1;
    public boolean E2;
    public ly0 E3;
    public final org.telegram.ui.ActionBar.u0 E4;
    public boolean E5;
    public boolean E6;
    public final ImageReceiver E7;
    public int E8;
    public boolean E9;
    public ic Ea;
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
    public ic Fa;
    public float Fb;
    public boolean Fc;
    public boolean G;
    public int G0;
    public float G1;
    public ic G2;
    public boolean G3;
    public int G4;
    public boolean G5;
    public boolean G6;
    public Drawable[] G7;
    public int G8;
    public Paint G9;
    public ic Ga;
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
    public boolean I0;
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
    public final org.telegram.ui.ActionBar.w5[] J2;
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
    public dj K;
    public int K0;
    public long K1;
    public final int[] K2;
    public int K3;
    public StaticLayout K4;
    public boolean K5;
    public org.telegram.ui.ActionBar.t4 K6;
    public int K7;
    public int K8;
    public xh.f K9;
    public Path Ka;
    public int Kb;
    public rw0 Kc;
    public aj L;
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
    public boolean M;
    public float M0;
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
    public final m.c3 Mb;
    public m1 Mc;
    public final ch.p0 N;
    public boolean N0;
    public boolean N1;
    public float N2;
    public int N3;
    public int N4;
    public xh.f N5;
    public int N6;
    public boolean N7;
    public Path N8;
    public float N9;
    public int Na;
    public i51 Nb;
    public StaticLayout Nc;
    public final zg.a O;
    public boolean O0;
    public h6.m O1;
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
    public final zg.c P;
    public final RadialProgress2 P0;
    public int P1;
    public boolean P2;
    public int P3;
    public final ArrayList P4;
    public ij P5;
    public int P6;
    public StaticLayout P7;
    public float[] P8;
    public xh.e P9;
    public float Pa;
    public org.telegram.ui.ActionBar.f6 Pb;
    public Paint Pc;
    public boolean Q;
    public final RadialProgress2 Q0;
    public boolean Q1;
    public boolean Q2;
    public int Q3;
    public float Q4;
    public ij Q5;
    public int Q6;
    public StaticLayout Q7;
    public float Q8;
    public Integer Q9;
    public int Qa;
    public final boolean Qb;
    public Paint Qc;
    public long R;
    public boolean R0;
    public boolean R1;
    public long R2;
    public int R3;
    public int R4;
    public dj R5;
    public boolean R6;
    public final AtomicReference R7;
    public float R8;
    public Path R9;
    public l1 Ra;
    public final h6.m Rb;
    public float Rc;
    public ly0 S;
    public final int[] S0;
    public boolean S1;
    public boolean S2;
    public int S3;
    public int S4;
    public boolean S5;
    public t31 S6;
    public final ImageReceiver S7;
    public float S8;
    public float[] S9;
    public final i90 Sa;
    public final ArrayList Sb;
    public int Sc;
    public r70 T;
    public final di.z2 T0;
    public boolean T1;
    public int T2;
    public int T3;
    public float T4;
    public boolean T5;
    public t31 T6;
    public int T7;
    public float T8;
    public final float T9;
    public int Ta;
    public final Stack Tb;
    public gj Tc;
    public CornerPathEffect U;
    public final ImageReceiver U0;
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
    public int V;
    public ColorMatrixColorFilter V0;
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
    public long W;
    public final org.telegram.ui.Components.w8 W0;
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
    public m4.d0 Wb;
    public final g1 Wc;
    public t1 X0;
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
    public fi.l Y0;
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
    public Paint Z0;
    public int Z1;
    public int Z2;
    public boolean Z3;
    public boolean Z4;
    public final int Z5;
    public int Z6;
    public int Z7;
    public StaticLayout Z8;
    public xh.f Z9;
    public boolean Za;
    public long Zb;
    public ColorFilter[] Zc;
    public ly0 f29765a0;
    public zg0 f29766a1;
    public int f29767a2;
    public y f29768a3;
    public final RectF f29769a4;
    public boolean f29770a5;
    public boolean f29771a6;
    public int f29772a7;
    public int f29773a8;
    public final RectF f29774a9;
    public final Path f29775aa;
    public float f29776ab;
    public float f29777ac;
    public int[] f29778ad;
    public r70 f29779b0;
    public Paint f29780b1;
    public int f29781b2;
    public boolean f29782b3;
    public final RectF f29783b4;
    public boolean f29784b5;
    public int f29785b6;
    public boolean f29786b7;
    public boolean f29787b8;
    public ic f29788b9;
    public final float[] f29789ba;
    public int f29790bb;
    public float f29791bc;
    public Paint bd;
    public CornerPathEffect f29792c0;
    public Paint f29793c1;
    public float f29794c2;
    public final ek0 f29795c3;
    public TLObject f29796c4;
    public int f29797c5;
    public byte[] f29798c6;
    public int f29799c7;
    public boolean f29800c8;
    public RectF f29801c9;
    public StaticLayout f29802ca;
    public int f29803cb;
    public boolean f29804cc;
    public float f29805cd;
    public int f29806d0;
    public Paint f29807d1;
    public float d2;
    public StaticLayout f29808d3;
    public TLRPC.PhotoSize f29809d4;
    public float f29810d5;
    public byte[] f29811d6;
    public int f29812d7;
    public boolean f29813d8;
    public wg.a f29814d9;
    public int f29815da;
    public int f29816db;
    public boolean dc;
    public float f29817dd;
    public f01 f29818e0;
    public dv0 f29819e1;
    public int f29820e2;
    public int f29821e3;
    public TLRPC.PhotoSize f29822e4;
    public boolean f29823e5;
    public boolean f29824e6;
    public CheckBoxBase[] f29825e7;
    public boolean f29826e8;
    public int f29827e9;
    public String f29828ea;
    public boolean eb;
    public boolean f29829ec;
    public int f29830ed;
    public boolean f29831f;
    public int f29832f0;
    public boolean f29833f1;
    public StaticLayout f29834f2;
    public int f29835f3;
    public BitmapDrawable f29836f4;
    public boolean f29837f5;
    public boolean f29838f6;
    public m30 f29839f7;
    public boolean f29840f8;
    public float f29841f9;
    public StaticLayout fa;
    public final boolean f29842fb;
    public m1 fc;
    public int f29843fd;
    public qw0 f29844g0;
    public float f29845g1;
    public StaticLayout f29846g2;
    public boolean f29847g3;
    public String f29848g4;
    public float f29849g5;
    public boolean f29850g6;
    public a80 f29851g7;
    public org.telegram.ui.Components.w5 f29852g8;
    public float f29853g9;
    public int f29854ga;
    public float f29855gb;
    public m1 f29856gc;
    public TL_stars.StarGift f29857gd;
    public boolean h;
    public int f29858h0;
    public float f29859h1;
    public float f29860h2;
    public v1 f29861h3;
    public String f29862h4;
    public int f29863h5;
    public boolean f29864h6;
    public float h7;
    public float f29865h8;
    public float f29866h9;
    public String f29867ha;
    public final x1 f29868hb;
    public boolean f29869hc;
    public long f29870i0;
    public boolean f29871i1;
    public float f29872i2;
    public int f29873i3;
    public boolean f29874i4;
    public TLRPC.Poll f29875i5;
    public boolean f29876i6;
    public long i7;
    public float f29877i8;
    public boolean f29878i9;
    public TLRPC.User f29879ia;
    public boolean f29880ib;
    public boolean f29881ic;
    public int f29882j0;
    public boolean f29883j1;
    public float f29884j2;
    public int j3;
    public float f29885j4;
    public ArrayList f29886j5;
    public boolean f29887j6;
    public ImageReceiver[] f29888j7;
    public TLRPC.PhotoSize f29889j8;
    public boolean f29890j9;
    public TLRPC.Chat f29891ja;
    public boolean f29892jb;
    public int f29893jc;
    public ic f29894k0;
    public CheckBoxBase f29895k1;
    public float f29896k2;
    public int f29897k3;
    public float f29898k4;
    public int f29899k5;
    public boolean f29900k6;
    public org.telegram.ui.Components.w8[] f29901k7;
    public int f29902k8;
    public boolean f29903k9;
    public TLRPC.FileLocation f29904ka;
    public boolean kb;
    public m1 f29905kc;
    public org.telegram.ui.Components.g5 f29906l0;
    public CheckBoxBase l1;
    public boolean f29907l2;
    public gj f29908l3;
    public long f29909l4;
    public b01 f29910l5;
    public boolean f29911l6;
    public boolean[] f29912l7;
    public Drawable f29913l8;
    public float f29914l9;
    public String f29915la;
    public final org.telegram.ui.Components.w5 f29916lb;
    public Drawable f29917lc;
    public boolean m0;
    public boolean f29918m1;
    public ic f29919m2;
    public gj f29920m3;
    public long f29921m4;
    public org.telegram.ui.Components.w5 f29922m5;
    public boolean f29923m6;
    public StaticLayout f29924m7;
    public zj0 f29925m8;
    public float f29926m9;
    public Object ma;
    public org.telegram.messenger.n6 mb;
    public final AtomicReference f29927mc;
    public int f29928n;
    public int f29929n0;
    public boolean n1;
    public StaticLayout f29930n2;
    public pg0 f29931n3;
    public boolean f29932n4;
    public int f29933n5;
    public boolean f29934n6;
    public org.telegram.ui.Components.a6 f29935n7;
    public zj0 f29936n8;
    public StaticLayout f29937n9;
    public long f29938na;
    public boolean f29939nb;
    public long f29940nc;
    public int f29941o0;
    public float f29942o1;
    public StaticLayout f29943o2;
    public CharSequence f29944o3;
    public boolean o4;
    public int f29945o5;
    public boolean f29946o6;
    public boolean f29947o7;
    public zj0 f29948o8;
    public int f29949o9;
    public String f29950oa;
    public final h1 f29951ob;
    public int f29952oc;
    public int f29953p0;
    public long f29954p1;
    public StaticLayout f29955p2;
    public gj f29956p3;
    public org.telegram.ui.Components.r5 f29957p4;
    public boolean f29958p5;
    public boolean f29959p6;
    public int f29960p7;
    public zj0 f29961p8;
    public final StaticLayout[] f29962p9;
    public org.telegram.ui.Components.g5 f29963pa;
    public int f29964pb;
    public int f29965pc;
    public int f29966q0;
    public int f29967q1;
    public StaticLayout f29968q2;
    public int f29969q3;
    public x70 f29970q4;
    public boolean f29971q5;
    public boolean f29972q6;
    public int f29973q7;
    public zj0 f29974q8;
    public int f29975q9;
    public org.telegram.ui.Components.g5 f29976qa;
    public int f29977qb;
    public int f29978qc;
    public n3 f29979r;
    public s1 f29980r0;
    public org.telegram.ui.f5 f29981r1;
    public float f29982r2;
    public float f29983r3;
    public fj f29984r4;
    public float f29985r5;
    public boolean f29986r6;
    public boolean f29987r7;
    public boolean f29988r8;
    public boolean f29989r9;
    public TLRPC.User f29990ra;
    public float f29991rb;
    public int f29992rc;
    public boolean f29993s;
    public u1 f29994s0;
    public wp f29995s1;
    public float f29996s2;
    public float f29997s3;
    public int f29998s4;
    public int s5;
    public long f29999s6;
    public int f30000s7;
    public ud f30001s8;
    public float s9;
    public TLRPC.User f30002sa;
    public boolean f30003sb;
    public float f30004sc;
    public int f30005t0;
    public ai.n1 f30006t1;
    public boolean f30007t2;
    public int f30008t3;
    public final n2.n0 f30009t4;
    public float f30010t5;
    public boolean t6;
    public int f30011t7;
    public int f30012t8;
    public int f30013t9;
    public TLRPC.Chat f30014ta;
    public ValueAnimator f30015tb;
    public float f30016tc;
    public int f30017u0;
    public boolean f30018u1;
    public RectF f30019u2;
    public int f30020u3;
    public int f30021u4;
    public float f30022u5;
    public boolean f30023u6;
    public int f30024u7;
    public y f30025u8;
    public int f30026u9;
    public String f30027ua;
    public int f30028ub;
    public org.telegram.ui.Components.c8 f30029uc;
    public int f30030v0;
    public boolean f30031v1;
    public r1 f30032v2;
    public int f30033v3;
    public final ArrayList f30034v4;
    public int f30035v5;
    public boolean f30036v6;
    public int f30037v7;
    public ly0 f30038v8;
    public final float[] f30039v9;
    public String f30040va;
    public final h1 f30041vb;
    public ab.b0 f30042vc;
    public l0 f30043w;
    public int f30044w0;
    public boolean f30045w1;
    public w1 f30046w2;
    public StaticLayout f30047w3;
    public final ArrayList f30048w4;
    public int f30049w5;
    public boolean f30050w6;
    public boolean f30051w7;
    public ly0 f30052w8;
    public float f30053w9;
    public boolean f30054wa;
    public final SparseArray f30055wb;
    public boolean wc;
    public final ob.c f30056x;
    public int f30057x0;
    public boolean f30058x1;
    public int f30059x2;
    public org.telegram.ui.Components.i6 f30060x3;
    public a80 f30061x4;
    public boolean f30062x5;
    public boolean f30063x6;
    public final Rect f30064x7;
    public int f30065x8;
    public float f30066x9;
    public boolean f30067xa;
    public boolean f30068xb;
    public boolean xc;
    public boolean f30069y;
    public int f30070y0;
    public boolean f30071y1;
    public CharSequence f30072y2;
    public org.telegram.ui.Components.i6 f30073y3;
    public ArrayList f30074y4;
    public String f30075y5;
    public int f30076y6;
    public boolean f30077y7;
    public int f30078y8;
    public StaticLayout f30079y9;
    public boolean ya;
    public boolean f30080yb;
    public tg0 f30081yc;
    public int f30082z0;
    public long f30083z1;
    public int f30084z2;
    public StaticLayout f30085z3;
    public CharacterStyle f30086z4;
    public TLRPC.Message f30087z5;
    public float f30088z6;
    public final ImageReceiver f30089z7;
    public org.telegram.ui.Components.w5 f30090z8;
    public int z9;
    public org.telegram.ui.Components.n5 f30091za;
    public float f30092zb;
    public boolean f30093zc;

    public q1(Context context, int i7) {
        this(context, i7, false, null, null);
    }

    public static boolean C2(m1 m1Var, float f10, float f11) {
        RectF rectF = m1Var.d;
        if (f10 >= rectF.left - org.telegram.messenger.g0.L(6.0f) && f10 <= rectF.right + org.telegram.messenger.g0.L(6.0f) && f11 >= rectF.top - org.telegram.messenger.g0.L(4.0f) && f11 <= rectF.bottom + org.telegram.messenger.g0.L(4.0f)) {
            return true;
        }
        return false;
    }

    public static StaticLayout H1(CharSequence charSequence, TextPaint textPaint, int i7, int i10, int i11, int i12) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int i13 = i7;
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
        return mu0.c(spannableStringBuilder, textPaint, i17, Layout.Alignment.ALIGN_NORMAL, org.telegram.messenger.g0.L(1.0f), TextUtils.TruncateAt.END, i17, i12, true);
    }

    public static int J1(aj ajVar) {
        int i7 = 0;
        if (ajVar != null) {
            if ((ajVar.f21451l & 2) == 0) {
                i7 = org.telegram.messenger.g0.L(4.0f);
            }
            if ((ajVar.f21451l & 1) == 0) {
                return org.telegram.messenger.g0.L(4.0f) + i7;
            }
        }
        return i7;
    }

    public static String J3(ij ijVar, ij ijVar2, boolean z9, int i7) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        boolean z10 = ijVar.f23276u1;
        int i10 = ijVar.I1;
        int i11 = ijVar.V;
        if (!z10 && !ijVar.s4() && !ij.c4(ijVar.f23237k) && !ij.e5(ijVar.f23237k)) {
            if (!ijVar.f23256p1 || ijVar.f23237k.date != 2147483646) {
                if (i11 != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    long j3 = i11;
                    sb2.append(hd.T(j3));
                    sb2.append(", ");
                    sb2.append(hd.E0().p0().format(j3 * 1000));
                    return sb2.toString();
                } else if (ijVar.f23226h2) {
                    return hd.T(ijVar2.f23237k.date) + ", " + hd.E0().p0().format(ijVar2.f23237k.date * 1000);
                } else if (z9) {
                    if (((org.telegram.messenger.h0) qp.s1(i10).f24927x7.U.f13889b).f22767c) {
                        if (i7 == 0 && ijVar.Z2()) {
                            i7 = ConnectionsManager.getInstance(i10).getCurrentTime();
                        }
                        return hd.L(i7);
                    }
                    return hd.M0(2131751211, null) + " " + hd.E0().p0().format(ijVar2.f23237k.date * 1000);
                } else if (ijVar.f23243l2 && (messageFwdHeader = (message = ijVar.f23237k).fwd_from) != null && ((messageFwdHeader.date != 0 || messageFwdHeader.saved_date != 0) && !(ij.o1(message) instanceof TLRPC.TL_messageMediaWidget))) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = ijVar.f23237k.fwd_from;
                    int i12 = messageFwdHeader2.saved_date;
                    if (i12 == 0) {
                        i12 = messageFwdHeader2.date;
                    }
                    return hd.O(i12);
                } else {
                    return hd.E0().p0().format(ijVar2.f23237k.date * 1000);
                }
            }
            return "";
        }
        return "";
    }

    public static int K1(StaticLayout staticLayout) {
        if (staticLayout.getLineCount() <= 0) {
            return 0;
        }
        return (int) Math.ceil(staticLayout.getLineWidth(0));
    }

    public static SpannableStringBuilder K3(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (int i7 = 0; i7 < spannableStringBuilder.length(); i7++) {
            char charAt = spannableStringBuilder.charAt(i7);
            if (charAt == '\n' || charAt == '\r' || charAt == '\t' || charAt == 8232 || charAt == 8233) {
                spannableStringBuilder.replace(i7, i7 + 1, (CharSequence) " ");
            }
        }
        return spannableStringBuilder;
    }

    public static boolean M2(String str) {
        if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && !"telegram_bot".equals(str) && !"telegram_user".equals(str) && !"telegram_channel".equals(str) && !"telegram_channel_direct".equals(str) && !"telegram_megagroup".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_aicomposetone".equals(str)) {
            return false;
        }
        return true;
    }

    public static android.graphics.PointF P1(int r3, int r4, int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.P1(int, int, int, int):android.graphics.PointF");
    }

    public static boolean T2() {
        return rc.e(2);
    }

    public static StaticLayout U2(CharSequence charSequence, TextPaint textPaint, int i7) {
        SpannableStringBuilder K3 = K3(charSequence);
        if (K3 != null && i7 > 0) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            CharSequence ellipsize = TextUtils.ellipsize(K3, textPaint, i7, truncateAt);
            int L = org.telegram.messenger.g0.L(2.0f) + Math.max(1, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())));
            return mu0.c(ellipsize, textPaint, L, Layout.Alignment.ALIGN_NORMAL, 0.0f, truncateAt, L, 1, true);
        }
        return null;
    }

    public static int[] W1(Spannable spannable, CharacterStyle characterStyle) {
        int i7;
        int i10;
        boolean z9;
        ty0 ty0Var;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof y31) && (ty0Var = ((y31) characterStyle).f40516a) != null && (messageEntity = ty0Var.d) != null) {
            i7 = messageEntity.offset;
            i10 = messageEntity.length + i7;
            z9 = true;
        } else {
            i7 = 0;
            i10 = 0;
            z9 = false;
        }
        if (!z9) {
            i7 = spannable.getSpanStart(characterStyle);
            i10 = spannable.getSpanEnd(characterStyle);
        }
        return new int[]{i7, i10};
    }

    public static void Y0(Canvas canvas, StaticLayout staticLayout, float f10, float f11) {
        canvas.save();
        canvas.translate(f10 - staticLayout.getLineLeft(0), ((org.telegram.messenger.g0.L(16.0f) - staticLayout.getHeight()) / 2.0f) + f11);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    private long getAuthorBotVerificationId() {
        ij ijVar;
        TLRPC.User user = this.f29879ia;
        if (user != null) {
            return org.telegram.messenger.m5.c(user);
        }
        if (this.f29891ja != null && (ijVar = this.P5) != null && ij.B0(ijVar.f23237k) != 1271266957 && this.f29891ja.signature_profiles) {
            long o4 = org.telegram.messenger.m5.o(this.P5.f23237k.from_id);
            int i7 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
            int i10 = this.Z5;
            if (i7 >= 0) {
                TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(o4));
                if (a22 != null) {
                    return org.telegram.messenger.m5.c(a22);
                }
            } else {
                TLRPC.Chat M0 = qp.s1(i10).M0(Long.valueOf(-o4));
                if (M0 != null) {
                    return org.telegram.messenger.m5.c(M0);
                }
            }
        }
        return 0L;
    }

    private String getAuthorName() {
        TLRPC.User user = this.f29879ia;
        if (user != null) {
            return t10.p(user);
        }
        if (this.f29891ja != null) {
            ij ijVar = this.P5;
            if (ijVar != null && ij.B0(ijVar.f23237k) != 1271266957 && this.f29891ja.signature_profiles) {
                long o4 = org.telegram.messenger.m5.o(this.P5.f23237k.from_id);
                int i7 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
                int i10 = this.Z5;
                if (i7 >= 0) {
                    TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(o4));
                    if (a22 != null) {
                        return t10.p(a22);
                    }
                } else {
                    TLRPC.Chat M0 = qp.s1(i10).M0(Long.valueOf(-o4));
                    if (M0 != null) {
                        return M0.title;
                    }
                }
            }
            return this.f29891ja.title;
        }
        ij ijVar2 = this.P5;
        if (ijVar2 != null && ijVar2.s4()) {
            return this.P5.Q0;
        }
        return "DELETED";
    }

    private Object getAuthorStatus() {
        ij ijVar;
        TLRPC.User user = this.f29879ia;
        if (user != null) {
            Long h = t10.h(user);
            if (h != null) {
                TLRPC.EmojiStatus emojiStatus = this.f29879ia.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f29950oa = ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug;
                }
                return h;
            } else if (this.f29879ia.premium) {
                return org.telegram.messenger.t0.f25555b.getDrawable(2131232307).mutate();
            } else {
                return null;
            }
        } else if (this.f29891ja != null && (ijVar = this.P5) != null && ij.B0(ijVar.f23237k) != 1271266957 && this.f29891ja.signature_profiles) {
            long o4 = org.telegram.messenger.m5.o(this.P5.f23237k.from_id);
            if (o4 >= 0) {
                TLRPC.User a22 = qp.s1(this.Z5).a2(Long.valueOf(o4));
                if (a22 != null) {
                    TLRPC.EmojiStatus emojiStatus2 = a22.emoji_status;
                    if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                        this.f29950oa = ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).slug;
                    }
                }
                return t10.h(a22);
            }
            TLRPC.Chat M0 = qp.s1(this.Z5).M0(Long.valueOf(-o4));
            if (M0 != null) {
                TLRPC.EmojiStatus emojiStatus3 = M0.emoji_status;
                if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f29950oa = ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug;
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
        if (E3()) {
            f10 = 41.3f;
        } else {
            f10 = 43.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    private int getCompactHeaderColor() {
        return i0.a.k(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sa, this.Pb), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28168ua, this.Pb));
    }

    private int getCompactInShift() {
        if (t2()) {
            return (org.telegram.messenger.g0.L(16.0f) - org.telegram.messenger.g0.L(20.0f)) - getExtraTextX();
        }
        return 0;
    }

    private int getCompactSideButtonColumn() {
        ij ijVar;
        if (this.f30068xb && this.E8 != 0 && (ijVar = this.P5) != null && ijVar.U4()) {
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

    private jh.a getDraftMessageMeasureController() {
        l1 l1Var = this.Ra;
        if (l1Var != null) {
            return l1Var.Z();
        }
        return null;
    }

    private ColorMatrixColorFilter getFancyBlurFilter() {
        if (this.V0 == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
            org.telegram.messenger.g0.i(colorMatrix, 0.6f);
            this.V0 = new ColorMatrixColorFilter(colorMatrix);
        }
        return this.V0;
    }

    private wp getForwardVerifiedSpan() {
        if (this.f29995s1 == null) {
            xp xpVar = new xp(getContext().getResources().getDrawable(2131232791).mutate(), getContext().getResources().getDrawable(2131232792).mutate());
            xpVar.f40324x = true;
            wp wpVar = new wp(0, xpVar);
            this.f29995s1 = wpVar;
            wpVar.d = false;
        }
        xp xpVar2 = (xp) this.f29995s1.f40058c;
        Drawable drawable = xpVar2.f40315a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, this.Pb);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        xpVar2.f40316b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A9, this.Pb), mode));
        this.f29995s1.c((int) (org.telegram.ui.ActionBar.k6.X2.getTextSize() * 1.15f));
        return this.f29995s1;
    }

    private int getGroupPhotosWidth() {
        int parentWidth = getParentWidth();
        ij ijVar = this.P5;
        if (ijVar != null && ijVar.f23264r1) {
            parentWidth = this.K0;
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
        if (this.f29903k9 && !v2()) {
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
        x1 x1Var = this.f29868hb;
        float f12 = 0.0f;
        if (x1Var.Q2) {
            boolean z9 = this.f29903k9;
            f10 = org.telegram.messenger.g0.V1(!z9, z9, x1Var.L1);
        } else if (this.f29903k9) {
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
        dj djVar = this.K;
        if (djVar != null && !djVar.d.isEmpty() && (messageReplies = ((ij) this.K.d.get(0)).f23237k.replies) != null) {
            return messageReplies.recent_repliers;
        }
        TLRPC.MessageReplies messageReplies2 = this.P5.f23237k.replies;
        if (messageReplies2 != null) {
            return messageReplies2.recent_repliers;
        }
        return null;
    }

    private int getSelectionOverlayColor() {
        int i7;
        org.telegram.ui.ActionBar.f6 f6Var = this.Pb;
        if (f6Var == null) {
            return 0;
        }
        ij ijVar = this.P5;
        if (ijVar != null && ijVar.O3()) {
            i7 = org.telegram.ui.ActionBar.k6.Mc;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.f28129sa;
        }
        return f6Var.h(i7);
    }

    private float getUseTranscribeButtonProgress() {
        x1 x1Var = this.f29868hb;
        if (x1Var.f30824o1) {
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
        Bitmap n10;
        if (imageReceiver != null && (n10 = imageReceiver.n()) != null) {
            n10.recycle();
            imageReceiver.w0(null);
        }
    }

    public static n1 x0(int i7, String str, int i10, float f10) {
        n1 n1Var = new n1();
        n1Var.f29592a = i7;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, org.telegram.ui.ActionBar.k6.M2, i10, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.M2, org.telegram.messenger.g0.L(2.0f) + i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        n1Var.d = staticLayout;
        n1Var.f29593b = f10;
        if (staticLayout.getLineCount() > 0) {
            n1Var.f29594c = ((float) (n1Var.f29593b - Math.ceil(n1Var.d.getLineWidth(0)))) / 2.0f;
            n1Var.f29594c -= (int) n1Var.d.getLineLeft(0);
        }
        return n1Var;
    }

    public final void A() {
        StaticLayout staticLayout;
        if (this.P5.D == 20 && (staticLayout = this.W9) != null) {
            di.z2 z2Var = this.T0;
            this.U9 = com.google.android.recaptcha.internal.a.A(z2Var.M0, staticLayout.getWidth(), 2.0f, this.M6);
            this.V9 = com.google.android.recaptcha.internal.a.A(z2Var.N0, this.W9.getHeight(), 2.0f, this.O6 + z2Var.L0);
        }
    }

    public final void A0(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        long[] x10 = gc.D().x(org.telegram.messenger.w7.B(document));
        if (x10 != null) {
            z0(x10[0], x10[1]);
        } else {
            z0(this.P5.F0, document.size);
        }
    }

    public final void A1(Canvas canvas, float f10, float f11, float f12, float f13, boolean z9) {
        boolean z10;
        float f14;
        float f15;
        double d;
        boolean z11;
        boolean z12;
        boolean z13;
        Drawable Y1;
        float f16;
        float f17;
        float f18;
        boolean z14;
        boolean z15;
        String str;
        Drawable Y12;
        float r10;
        float f19;
        String str2;
        Drawable Y13;
        if (f13 != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f20 = (f13 * 0.5f) + 0.5f;
        float f21 = f10 * f13;
        this.N.getClass();
        int alpha = org.telegram.ui.ActionBar.k6.T2.getAlpha();
        float a22 = a2(f11);
        StaticLayout staticLayout = this.fa;
        x1 x1Var = this.f29868hb;
        float f22 = 0.0f;
        if (staticLayout == null && !x1Var.G) {
            f15 = 10.0f;
            d = 1.0d;
        } else {
            boolean z16 = x1Var.f30799i1;
            if (z16) {
                f14 = this.B9;
            } else {
                f14 = f12;
            }
            float f23 = f14 + 0.0f;
            f15 = 10.0f;
            boolean z17 = x1Var.G;
            d = 1.0d;
            if (z17 && x1Var.I == null && staticLayout != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z17 && x1Var.I != null && staticLayout == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z17 && x1Var.I != null && staticLayout != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((!this.f30068xb || !x1Var.f30816m1) && z16 && !z11) {
                if (z12) {
                    f23 = x1Var.J;
                } else {
                    float f24 = x1Var.J;
                    float f25 = x1Var.L1;
                    f23 = (f23 * f25) + ((1.0f - f25) * f24);
                }
            }
            dj djVar = this.K;
            if (djVar != null) {
                cj cjVar = djVar.f22012m;
                if (cjVar.f21828j) {
                    f23 += cjVar.f21826g;
                }
            }
            if (x1Var.f30858x0) {
                f23 += this.Vc;
            }
            if (E3()) {
                if (this.P5.Q5()) {
                    Y1 = Y1("drawableMsgStickerReplies");
                } else {
                    Y1 = org.telegram.ui.ActionBar.k6.f27809b4;
                }
            } else if (!this.P5.Q3()) {
                if (z9) {
                    Y1 = org.telegram.ui.ActionBar.k6.R3;
                } else {
                    Y1 = org.telegram.ui.ActionBar.k6.Q3;
                }
            } else {
                Y1 = Y1("drawableMsgOutReplies");
            }
            float r11 = z.r(Y1, f23, a22, org.telegram.ui.ActionBar.k6.T2.getTextSize());
            if (z11) {
                f16 = x1Var.L1 * f21;
            } else if (z12) {
                f16 = (1.0f - x1Var.L1) * f21;
            } else {
                f16 = f21;
            }
            Y1.setAlpha((int) (f16 * 255.0f));
            if (z10) {
                canvas.save();
                canvas.scale(f20, f20, org.telegram.messenger.k5.a(org.telegram.messenger.g0.L(3.0f) + r11, this.f29854ga, 2.0f, f23), Y1.getBounds().centerY());
            }
            Y1.draw(canvas);
            Y1.setAlpha(255);
            if (x1Var.G) {
                if (z13) {
                    canvas.save();
                    f17 = r11;
                    org.telegram.ui.ActionBar.k6.T2.setAlpha((int) ((1.0d - x1Var.L1) * alpha));
                    canvas.translate(f23 + f17 + org.telegram.messenger.g0.L(3.0f), a22);
                    x1Var.I.draw(canvas);
                    canvas.restore();
                } else {
                    f17 = r11;
                }
                org.telegram.ui.ActionBar.k6.T2.setAlpha((int) (alpha * f16));
            } else {
                f17 = r11;
            }
            canvas.save();
            canvas.translate(f23 + f17 + org.telegram.messenger.g0.L(3.0f), a22);
            StaticLayout staticLayout2 = this.fa;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                StaticLayout staticLayout3 = x1Var.I;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
            }
            canvas.restore();
            if (this.fa != null) {
                f22 = f17 + this.f29854ga + org.telegram.messenger.g0.L(10.0f) + 0.0f;
            }
            if (z10) {
                canvas.restore();
            }
            if (x1Var.G) {
                org.telegram.ui.ActionBar.k6.T2.setAlpha(alpha);
            }
            x1Var.K = f23;
        }
        if (this.f29802ca != null) {
            boolean z18 = x1Var.f30799i1;
            if (z18) {
                f19 = this.B9;
            } else {
                f19 = f12;
            }
            float f26 = f19 + f22;
            if ((!this.f30068xb || !x1Var.f30816m1) && z18) {
                float f27 = x1Var.L;
                float f28 = x1Var.L1;
                f26 = (f26 * f28) + ((1.0f - f28) * f27);
            }
            dj djVar2 = this.K;
            if (djVar2 != null) {
                cj cjVar2 = djVar2.f22012m;
                if (cjVar2.f21828j) {
                    f26 += cjVar2.f21826g;
                }
            }
            if (x1Var.f30858x0) {
                f26 += this.Vc;
            }
            if (E3()) {
                if (this.P5.Q5()) {
                    Y13 = Y1("drawableMsgStickerViews");
                } else {
                    Y13 = org.telegram.ui.ActionBar.k6.f27789a4;
                }
            } else if (!this.P5.Q3()) {
                if (z9) {
                    Y13 = org.telegram.ui.ActionBar.k6.N3;
                } else {
                    Y13 = org.telegram.ui.ActionBar.k6.M3;
                }
            } else {
                if (z9) {
                    str2 = "drawableMsgOutViewsSelected";
                } else {
                    str2 = "drawableMsgOutViews";
                }
                Y13 = Y1(str2);
            }
            float r12 = z.r(Y13, f26, org.telegram.messenger.g0.L(1.5f) + a22, org.telegram.ui.ActionBar.k6.T2.getTextSize() - org.telegram.messenger.g0.L(2.0f));
            if (z10) {
                canvas.save();
                canvas.scale(f20, f20, (((org.telegram.messenger.g0.L(3.0f) + Y13.getIntrinsicWidth()) + this.f29815da) / 2.0f) + f26, Y13.getBounds().centerY());
            }
            Y13.setAlpha((int) (f21 * 255.0f));
            Y13.draw(canvas);
            Y13.setAlpha(255);
            if (x1Var.f30781e2 != null) {
                canvas.save();
                org.telegram.ui.ActionBar.k6.T2.setAlpha((int) ((d - x1Var.L1) * alpha));
                canvas.translate(f26 + r12 + org.telegram.messenger.g0.L(3.0f), a22);
                xh.f.f(canvas, x1Var.f30781e2);
                canvas.restore();
                org.telegram.ui.ActionBar.k6.T2.setAlpha((int) (alpha * x1Var.L1));
            }
            canvas.save();
            canvas.translate(f26 + r12 + org.telegram.messenger.g0.L(3.0f), a22);
            xh.f.f(canvas, this.f29802ca);
            canvas.restore();
            if (z10) {
                canvas.restore();
            }
            f22 = this.f29815da + r12 + org.telegram.messenger.g0.L(f15) + f22;
            if (x1Var.f30781e2 != null) {
                org.telegram.ui.ActionBar.k6.T2.setAlpha(alpha);
            }
            x1Var.M = f26;
        }
        boolean z19 = this.f29959p6;
        if (!z19 && !x1Var.C) {
            return;
        }
        boolean z20 = x1Var.f30799i1;
        if (z20) {
            f18 = this.B9;
        } else {
            f18 = f12;
        }
        float f29 = f18 + f22;
        boolean z21 = x1Var.C;
        if (z21 && z19) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z21 && !z19) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (!this.f30068xb && z20 && !z14) {
            if (z15) {
                f29 = x1Var.E;
            } else {
                float f30 = x1Var.E;
                float f31 = x1Var.L1;
                f29 = (f29 * f31) + ((1.0f - f31) * f30);
            }
        }
        dj djVar3 = this.K;
        if (djVar3 != null) {
            cj cjVar3 = djVar3.f22012m;
            if (cjVar3.f21828j) {
                f29 += cjVar3.f21826g;
            }
        }
        if (x1Var.f30858x0) {
            f29 += this.Vc;
        }
        if (E3()) {
            if (this.P5.Q5()) {
                Y12 = Y1("drawableMsgStickerPinned");
            } else {
                Y12 = org.telegram.ui.ActionBar.k6.Z3;
            }
        } else if (!this.P5.Q3()) {
            if (z9) {
                Y12 = org.telegram.ui.ActionBar.k6.V3;
            } else {
                Y12 = org.telegram.ui.ActionBar.k6.U3;
            }
        } else {
            if (z9) {
                str = "drawableMsgOutPinnedSelected";
            } else {
                str = "drawableMsgOutPinned";
            }
            Y12 = Y1(str);
        }
        if (x1Var.C) {
            if (this.f29959p6) {
                Y12.setAlpha((int) (f21 * 255.0f * x1Var.L1));
                r10 = z.r(Y12, f29, a22, org.telegram.ui.ActionBar.k6.T2.getTextSize() + org.telegram.messenger.g0.L(1.0f));
            } else {
                Y12.setAlpha((int) ((1.0f - x1Var.L1) * f21 * 255.0f));
                r10 = z.r(Y12, f29, a22, org.telegram.ui.ActionBar.k6.T2.getTextSize() + org.telegram.messenger.g0.L(1.0f));
            }
        } else {
            Y12.setAlpha((int) (f21 * 255.0f));
            r10 = z.r(Y12, f29, a22, org.telegram.ui.ActionBar.k6.T2.getTextSize() + org.telegram.messenger.g0.L(1.0f));
        }
        if (z10) {
            canvas.save();
            canvas.scale(f20, f20, (r10 / 2.0f) + f29, Y12.getBounds().centerY());
        }
        Y12.draw(canvas);
        Y12.setAlpha(255);
        if (z10) {
            canvas.restore();
        }
        x1Var.D = f29;
    }

    public final boolean A2() {
        TLRPC.Chat chat = this.f30014ta;
        if (chat != null) {
            return chat.verified;
        }
        TLRPC.User user = this.f29990ra;
        if (user != null && user.verified) {
            return true;
        }
        return false;
    }

    public final void A3(int r21, org.telegram.messenger.ij r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.A3(int, org.telegram.messenger.ij):void");
    }

    public final int B() {
        if (this.f30031v1) {
            return 4;
        }
        return 8;
    }

    public final void B0(int i7) {
        int i10;
        int w02;
        zj0 zj0Var;
        zj0 zj0Var2;
        int i11;
        int i12;
        int i13;
        if (this.P5.H4()) {
            if (this.P5.Q3()) {
                i13 = org.telegram.ui.ActionBar.k6.Lb;
            } else {
                i13 = org.telegram.ui.ActionBar.k6.f28246yd;
            }
            w02 = org.telegram.ui.ActionBar.k6.w0(i13, this.Pb);
        } else if (i7 == 0 && this.D5) {
            if (this.P5.Q3()) {
                i11 = org.telegram.ui.ActionBar.k6.Fb;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.f28002ld;
            }
            w02 = org.telegram.ui.ActionBar.k6.w0(i11, this.Pb);
        } else if (i7 == 0 && (zj0Var2 = this.f29936n8) != null) {
            w02 = zj0Var2.i();
        } else if (i7 == 0 && (zj0Var = this.f29961p8) != null) {
            w02 = zj0Var.i();
        } else {
            if (this.P5.Q3()) {
                i10 = org.telegram.ui.ActionBar.k6.Lb;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f28246yd;
            }
            w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.Pb);
        }
        Drawable[] drawableArr = this.I2;
        Drawable drawable = drawableArr[i7];
        if (drawable == null) {
            org.telegram.ui.ActionBar.w5 w5Var = new org.telegram.ui.ActionBar.w5(this, i7);
            org.telegram.ui.ActionBar.w5[] w5VarArr = this.J2;
            w5VarArr[i7] = w5Var;
            int[][] iArr = {StateSet.WILD_CARD};
            if (this.P5.Q3()) {
                i12 = org.telegram.ui.ActionBar.k6.Lb;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.f28246yd;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{436207615 & org.telegram.ui.ActionBar.k6.w0(i12, this.Pb)}), null, w5VarArr[i7]);
            drawableArr[i7] = rippleDrawable;
            rippleDrawable.setCallback(this);
        } else {
            org.telegram.ui.ActionBar.k6.H1(drawable, w02 & 436207615, true);
        }
        drawableArr[i7].setVisible(true, false);
    }

    public final void B1(Canvas canvas, float f10, Runnable runnable) {
        org.telegram.ui.ActionBar.t4 t4Var;
        float f11;
        boolean z9;
        boolean z10;
        int i7;
        int i10;
        Canvas canvas2 = canvas;
        ij ijVar = this.P5;
        if (ijVar != null && ijVar.T4()) {
            RadialProgress2 radialProgress2 = this.P0;
            RectF rectF = radialProgress2.f31471a;
            Paint paint = radialProgress2.f31476g;
            p80 p80Var = radialProgress2.f31477i;
            RectF rectF2 = radialProgress2.f31471a;
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
            p80Var.B = t4Var;
            radialProgress2.f31478j.B = t4Var;
            radialProgress2.I = f10;
            runnable.run();
            if (this.Z0 == null) {
                Paint paint2 = new Paint(1);
                this.Z0 = paint2;
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
                if (this.f29766a1 == null) {
                    zg0 zg0Var = new zg0(2131624021, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), true, null);
                    this.f29766a1 = zg0Var;
                    zg0Var.R(this);
                    this.f29766a1.J(true);
                    this.f29766a1.K(1);
                    this.f29766a1.start();
                }
                this.f29766a1.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (this.f29780b1 == null) {
                    i7 = 1;
                    this.f29780b1 = new Paint(1);
                } else {
                    i7 = 1;
                }
                if (this.f29793c1 == null) {
                    Paint paint3 = new Paint(i7);
                    this.f29793c1 = paint3;
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                if (this.f29807d1 == null) {
                    Paint paint4 = new Paint(i7);
                    this.f29807d1 = paint4;
                    paint4.setStyle(Paint.Style.STROKE);
                }
                int i11 = radialProgress2.f31489u;
                if (i11 >= 0) {
                    i10 = org.telegram.ui.ActionBar.k6.w0(i11, this.Pb);
                } else {
                    i10 = radialProgress2.f31482n;
                }
                this.f29780b1.setColor(i10);
                this.f29807d1.setColor(i10);
                p80Var.a(false);
                this.f29780b1.setShader(p80Var.d.getShader());
                this.f29807d1.setShader(p80Var.d.getShader());
                rectF3.set(this.f29766a1.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                float f14 = f11;
                rectF3.inset(f14, f14);
                canvas2.drawRect(rectF3, this.f29780b1);
                this.f29766a1.q(canvas, this.f29793c1, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.f29807d1.setAlpha((int) (255.0f * f12));
                this.f29807d1.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
                RectF rectF4 = this.f29783b4;
                rectF4.set(rectF2);
                rectF4.inset(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
                pm0 pm0Var = this.D4;
                canvas.drawArc(rectF4, -90.0f, (1.0f - pm0Var.K) * (-360.0f), false, this.f29807d1);
                if (this.f29910l5 == null) {
                    this.f29910l5 = new b01();
                }
                this.f29910l5.a((1.0f - pm0Var.K) * (-360.0f), f12, canvas, this.f29807d1, rectF4);
                canvas2 = canvas;
            } else {
                zg0 zg0Var2 = this.f29766a1;
                if (zg0Var2 != null) {
                    zg0Var2.C(true);
                    this.f29766a1 = null;
                    if (this.f29910l5 != null) {
                        this.f29910l5 = null;
                    }
                }
            }
            canvas2.drawCircle(cos, sin, org.telegram.messenger.g0.L((f10 * 1.5f) + 10.0f) * f10, this.Z0);
            canvas2.restore();
            if (this.Y0 == null) {
                fi.l lVar = new fi.l(3);
                this.Y0 = lVar;
                z9 = false;
                lVar.e(-1, 0, 0);
                fi.l lVar2 = this.Y0;
                lVar2.f12292i = 14.0f;
                lVar2.c(10.0f);
                this.Y0.f12286a.setStrokeWidth(org.telegram.messenger.g0.N(1.5f));
                z10 = true;
                this.Y0.d(1, false, false);
                this.Y0.f12293j = -org.telegram.messenger.g0.N(0.33f);
                this.Y0.f12294k = org.telegram.messenger.g0.N(0.33f);
            } else {
                z9 = false;
                z10 = true;
            }
            fi.l lVar3 = this.Y0;
            lVar3.f12292i = f10 * 14.0f;
            lVar3.c(f10 * 10.0f);
            canvas2.saveLayerAlpha(cos - org.telegram.messenger.g0.L(10.0f), sin - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f) + cos, org.telegram.messenger.g0.L(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, org.telegram.messenger.g0.L(10.0f) * f10, paint);
            fi.l lVar4 = this.Y0;
            if (org.telegram.messenger.g0.B(paint.getColor()) <= 0.8f) {
                z10 = z9;
            }
            lVar4.b(z10);
            fi.l lVar5 = this.Y0;
            lVar5.f12297n = cos;
            lVar5.f12298o = sin;
            lVar5.a(canvas2, f10);
            canvas2.restore();
            return;
        }
        runnable.run();
    }

    public final boolean B2(float f10) {
        if (this.K6 != null) {
            int i7 = this.M6;
            if (f10 >= i7 && f10 <= i7 + this.N6) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B3() {
        int i7;
        int i10;
        int i11;
        int i12;
        if (this.P5.Q3()) {
            TextPaint textPaint = org.telegram.ui.ActionBar.k6.f28045o2;
            int i13 = org.telegram.ui.ActionBar.k6.Tc;
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i13, this.Pb));
            org.telegram.ui.ActionBar.k6.f28217x2.setColor(org.telegram.ui.ActionBar.k6.w0(i13, this.Pb));
            org.telegram.ui.ActionBar.k6.f28064p2.setColor(org.telegram.ui.ActionBar.k6.w0(i13, this.Pb));
            org.telegram.ui.ActionBar.k6.f28084q2.setColor(org.telegram.ui.ActionBar.k6.w0(i13, this.Pb));
            org.telegram.ui.ActionBar.k6.f28103r2.setColor(org.telegram.ui.ActionBar.k6.w0(i13, this.Pb));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.k6.f28217x2;
            TextPaint textPaint3 = org.telegram.ui.ActionBar.k6.Z2;
            TextPaint textPaint4 = org.telegram.ui.ActionBar.k6.f27788a3;
            TextPaint textPaint5 = org.telegram.ui.ActionBar.k6.f28045o2;
            TextPaint textPaint6 = org.telegram.ui.ActionBar.k6.f28064p2;
            TextPaint textPaint7 = org.telegram.ui.ActionBar.k6.f28084q2;
            TextPaint textPaint8 = org.telegram.ui.ActionBar.k6.f28103r2;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vc, this.Pb);
            textPaint8.linkColor = w02;
            textPaint7.linkColor = w02;
            textPaint6.linkColor = w02;
            textPaint5.linkColor = w02;
            textPaint4.linkColor = w02;
            textPaint3.linkColor = w02;
            textPaint2.linkColor = w02;
        } else {
            TextPaint textPaint9 = org.telegram.ui.ActionBar.k6.f28045o2;
            int i14 = org.telegram.ui.ActionBar.k6.Sc;
            textPaint9.setColor(org.telegram.ui.ActionBar.k6.w0(i14, this.Pb));
            org.telegram.ui.ActionBar.k6.f28217x2.setColor(org.telegram.ui.ActionBar.k6.w0(i14, this.Pb));
            org.telegram.ui.ActionBar.k6.f28064p2.setColor(org.telegram.ui.ActionBar.k6.w0(i14, this.Pb));
            org.telegram.ui.ActionBar.k6.f28084q2.setColor(org.telegram.ui.ActionBar.k6.w0(i14, this.Pb));
            org.telegram.ui.ActionBar.k6.f28103r2.setColor(org.telegram.ui.ActionBar.k6.w0(i14, this.Pb));
            TextPaint textPaint10 = org.telegram.ui.ActionBar.k6.f28217x2;
            TextPaint textPaint11 = org.telegram.ui.ActionBar.k6.Z2;
            TextPaint textPaint12 = org.telegram.ui.ActionBar.k6.f27788a3;
            TextPaint textPaint13 = org.telegram.ui.ActionBar.k6.f28045o2;
            TextPaint textPaint14 = org.telegram.ui.ActionBar.k6.f28064p2;
            TextPaint textPaint15 = org.telegram.ui.ActionBar.k6.f28084q2;
            TextPaint textPaint16 = org.telegram.ui.ActionBar.k6.f28103r2;
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
            i1 i1Var = this.C4;
            if (i15 != 3 && i15 != 7) {
                if (i15 == 5) {
                    if (this.P5.Q3()) {
                        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27982kc, this.Pb);
                        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28001lc, this.Pb);
                        int i16 = org.telegram.ui.ActionBar.k6.f28036nc;
                        i1Var.g(w04, w05, org.telegram.ui.ActionBar.k6.w0(i16, this.Pb), org.telegram.ui.ActionBar.k6.w0(i16, this.Pb), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28017mc, this.Pb));
                    } else if (this.Q1 && this.f29936n8 != null) {
                        int c10 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27947ie, this.Pb), this.f29936n8.i());
                        int c11 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27965je, this.Pb), this.f29936n8.i());
                        int i17 = org.telegram.ui.ActionBar.k6.le;
                        i1Var.g(c10, c11, org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(i17, this.Pb), this.f29936n8.i()), org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(i17, this.Pb), this.f29936n8.i()), org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27984ke, this.Pb), this.f29936n8.i()));
                    } else {
                        int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27947ie, this.Pb);
                        int w07 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27965je, this.Pb);
                        int i18 = org.telegram.ui.ActionBar.k6.le;
                        i1Var.g(w06, w07, org.telegram.ui.ActionBar.k6.w0(i18, this.Pb), org.telegram.ui.ActionBar.k6.w0(i18, this.Pb), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27984ke, this.Pb));
                    }
                }
            } else {
                boolean Q3 = this.P5.Q3();
                pm0 pm0Var = this.D4;
                if (Q3) {
                    int w08 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28054oc, this.Pb);
                    int w09 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28094qc, this.Pb);
                    int w010 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28074pc, this.Pb);
                    pm0Var.f36991p = w08;
                    pm0Var.f36992q = w09;
                    pm0Var.f36993r = w010;
                    int w011 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27982kc, this.Pb);
                    int w012 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28001lc, this.Pb);
                    int i19 = org.telegram.ui.ActionBar.k6.f28036nc;
                    i1Var.g(w011, w012, org.telegram.ui.ActionBar.k6.w0(i19, this.Pb), org.telegram.ui.ActionBar.k6.w0(i19, this.Pb), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28017mc, this.Pb));
                } else if (this.Q1 && this.f29936n8 != null) {
                    int c12 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28019me, this.Pb), this.f29936n8.i());
                    int c13 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28056oe, this.Pb), this.f29936n8.i());
                    int c14 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ne, this.Pb), this.f29936n8.i());
                    pm0Var.f36991p = c12;
                    pm0Var.f36992q = c13;
                    pm0Var.f36993r = c14;
                    int c15 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27947ie, this.Pb), this.f29936n8.i());
                    int c16 = org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27965je, this.Pb), this.f29936n8.i());
                    int i20 = org.telegram.ui.ActionBar.k6.le;
                    i1Var.g(c15, c16, org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(i20, this.Pb), this.f29936n8.i()), org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(i20, this.Pb), this.f29936n8.i()), org.telegram.ui.ActionBar.k6.c(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27984ke, this.Pb), this.f29936n8.i()));
                } else {
                    int w013 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28019me, this.Pb);
                    int w014 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28056oe, this.Pb);
                    int w015 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ne, this.Pb);
                    pm0Var.f36991p = w013;
                    pm0Var.f36992q = w014;
                    pm0Var.f36993r = w015;
                    int w016 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27947ie, this.Pb);
                    int w017 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27965je, this.Pb);
                    int i21 = org.telegram.ui.ActionBar.k6.le;
                    i1Var.g(w016, w017, org.telegram.ui.ActionBar.k6.w0(i21, this.Pb), org.telegram.ui.ActionBar.k6.w0(i21, this.Pb), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27984ke, this.Pb));
                }
            }
        }
        ij ijVar = this.P5;
        if (ijVar.D == 5) {
            TextPaint textPaint17 = org.telegram.ui.ActionBar.k6.T2;
            if (t2()) {
                if (this.P5.Q3()) {
                    i11 = org.telegram.ui.ActionBar.k6.f27909gc;
                } else {
                    i11 = org.telegram.ui.ActionBar.k6.f27818be;
                }
            } else {
                i11 = org.telegram.ui.ActionBar.k6.Wc;
            }
            int w018 = org.telegram.ui.ActionBar.k6.w0(i11, this.Pb);
            if (x2()) {
                if (this.P5.Q3()) {
                    i12 = org.telegram.ui.ActionBar.k6.f27817bc;
                } else {
                    i12 = org.telegram.ui.ActionBar.k6.f27838ce;
                }
            } else if (this.P5.Q3()) {
                i12 = org.telegram.ui.ActionBar.k6.f27909gc;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.f27818be;
            }
            textPaint17.setColor(i0.a.f(getVideoTranscriptionProgress(), w018, org.telegram.ui.ActionBar.k6.w0(i12, this.Pb)));
        } else if (this.B6) {
            if (ijVar.Q5()) {
                org.telegram.ui.ActionBar.k6.T2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, this.Pb));
            } else {
                org.telegram.ui.ActionBar.k6.T2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Yd, this.Pb));
            }
        } else if (ijVar.Q3()) {
            TextPaint textPaint18 = org.telegram.ui.ActionBar.k6.T2;
            if (x2()) {
                i10 = org.telegram.ui.ActionBar.k6.f27817bc;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f27909gc;
            }
            textPaint18.setColor(org.telegram.ui.ActionBar.k6.w0(i10, this.Pb));
        } else {
            TextPaint textPaint19 = org.telegram.ui.ActionBar.k6.T2;
            if (x2()) {
                i7 = org.telegram.ui.ActionBar.k6.f27838ce;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.f27818be;
            }
            textPaint19.setColor(org.telegram.ui.ActionBar.k6.w0(i7, this.Pb));
        }
    }

    @Override
    public final void C(boolean z9) {
        boolean z10;
        int i7 = this.L1;
        if (i7 != 3 && i7 != 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        N3(true, z10, false);
    }

    public final void C0(int i7, int i10, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i7 & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((i7 & 2) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if ((i7 & 4) == 0 && z13 && z11 && !z12 && z10) {
            z14 = true;
        }
        if (this.f29868hb.f30797i && !z14) {
            return;
        }
        this.f29991rb = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f30015tb = ofFloat;
        if (z14) {
            ofFloat.setDuration(220L);
        } else {
            ofFloat.setDuration(150L);
        }
        this.f30015tb.setInterpolator(xq.f40329f);
        this.f29977qb = i7;
        this.f29964pb = i10;
        this.f30015tb.addUpdateListener(new ch.u(3, this, z9));
        this.f30015tb.addListener(new ch.y(21, this, z9));
        this.f30003sb = true;
        this.f30015tb.start();
    }

    public final b1 C1() {
        if (this.J4 == null) {
            this.J4 = new b1(this);
        }
        return this.J4;
    }

    public final boolean C3() {
        dj djVar;
        ij ijVar = this.P5;
        if (ijVar != null && !ijVar.f23264r1 && !ijVar.s4()) {
            aj ajVar = this.L;
            if ((ajVar == null || ((djVar = this.K) != null && djVar.f22008i && (ajVar.f21451l & 8) == 0)) && !this.f29868hb.f30858x0) {
                if (!this.f30069y || !ij.S4(this.P5.f23237k)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean D(MotionEvent motionEvent) {
        RectF rectF;
        l1 l1Var;
        y yVar;
        boolean z9 = false;
        if (this.Z8 != null && (rectF = this.f29801c9) != null && (this.f29879ia != null || this.f29891ja != null)) {
            boolean contains = rectF.contains((int) motionEvent.getX(), (int) M1(motionEvent));
            if (motionEvent.getAction() == 0) {
                SpannableString spannableString = new SpannableString(this.Z8.getText());
                wg.a[] aVarArr = (wg.a[]) spannableString.getSpans(0, spannableString.length(), wg.a.class);
                if (contains && aVarArr != null && aVarArr.length > 0) {
                    z9 = true;
                }
                this.W2 = z9;
                if (z9 && (yVar = this.Y2) != null) {
                    yVar.setHotspot((int) motionEvent.getX(), (int) M1(motionEvent));
                    this.Y2.setState(this.M2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.W2 && (l1Var = this.Ra) != null) {
                    l1Var.P0(this);
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

    public final void D0() {
        ij ijVar;
        l1 l1Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.P5.u2() && !this.P5.n5()) {
            ij ijVar2 = this.P5;
            if (!ijVar2.M0) {
                if (this.Ra != null && ijVar2.q4()) {
                    this.Ra.C(this);
                    return;
                } else {
                    H3(this.f29845g1, this.f29859h1);
                    return;
                }
            }
        }
        ij ijVar3 = this.P5;
        int i7 = ijVar3.D;
        int i10 = 0;
        if (i7 == 20) {
            TLRPC.Message message = ijVar3.f23237k;
            if (message != null && (messageMedia = message.media) != null && !messageMedia.extended_media.isEmpty()) {
                TLRPC.ReplyMarkup replyMarkup = this.P5.f23237k.reply_markup;
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
        } else if (i7 != 1 && !ijVar3.N2()) {
            ij ijVar4 = this.P5;
            int i11 = ijVar4.D;
            if (i11 == 12) {
                long j3 = ij.o1(ijVar4.f23237k).user_id;
                if (j3 != 0) {
                    user = qp.s1(this.Z5).a2(Long.valueOf(j3));
                } else {
                    user = null;
                }
                this.Ra.s0(this, user, this.f29845g1, this.f29859h1);
            } else if (i11 == 5) {
                if (this.N3 != -1) {
                    E0(false);
                } else if (MediaController.B().I(this.P5) && !MediaController.B().H()) {
                    MediaController.B().R(this.P5, true);
                } else {
                    this.Ra.E1(this, this.P5);
                }
            } else if (i11 == 8) {
                int i12 = this.N3;
                if (i12 != -1 && (i12 != 1 || !this.B1 || !this.G5)) {
                    if (i12 == 2 || i12 == 0) {
                        E0(false);
                        return;
                    }
                    return;
                }
                this.Ra.u0(this, this.f29845g1, this.f29859h1, false);
            } else if (this.L1 != 4 && !ijVar4.E2(true)) {
                ij ijVar5 = this.P5;
                int i13 = ijVar5.D;
                if (i13 != 4 && i13 != 17 && i13 != 23 && i13 != 24) {
                    int i14 = this.L1;
                    if (i14 == 1) {
                        if (this.N3 == -1) {
                            this.Ra.u0(this, this.f29845g1, this.f29859h1, false);
                            return;
                        }
                        return;
                    } else if (ijVar5.Y0 != null) {
                        l1 l1Var2 = this.Ra;
                        if (l1Var2 != null) {
                            l1Var2.u0(this, this.f29845g1, this.f29859h1, false);
                            return;
                        }
                        return;
                    } else if (i14 == 2) {
                        if (this.N3 == -1 && (webPage = ij.o1(ijVar5.f23237k).webpage) != null) {
                            String str = webPage.embed_url;
                            if (str != null && str.length() != 0) {
                                this.Ra.D1(this.P5, webPage.embed_url, webPage.site_name, webPage.description, webPage.url, webPage.embed_width, webPage.embed_height);
                                return;
                            } else {
                                vf.c.t(getContext(), webPage.url);
                                return;
                            }
                        }
                        return;
                    } else if (this.T1) {
                        if (this.N3 == -1) {
                            this.Ra.u0(this, this.f29845g1, this.f29859h1, false);
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
                this.Ra.u0(this, this.f29845g1, this.f29859h1, false);
            } else if (this.N3 != -1 && (!this.f30071y1 || (!this.G5 && (((ijVar = this.P5) == null || !ijVar.E2(true)) && (!iz.B0 || !this.B1))))) {
                if (this.f30071y1) {
                    E0(true);
                    return;
                }
                int i15 = this.N3;
                if (i15 == 0 || i15 == 3) {
                    E0(false);
                }
            } else {
                this.Ra.u0(this, this.f29845g1, this.f29859h1, false);
            }
        } else {
            int i16 = this.N3;
            if (i16 == -1) {
                this.Ra.u0(this, this.f29845g1, this.f29859h1, false);
            } else if (i16 == 0) {
                E0(false);
            }
        }
    }

    public final t1 D1() {
        if (this.X0 == null) {
            this.X0 = new t1(this);
        }
        return this.X0;
    }

    public final boolean D2() {
        if (this.Q5 != null) {
            return this.V5;
        }
        return this.H;
    }

    public final boolean D3() {
        if (!v2()) {
            if ((this.K == null || (this.L.f21451l & 4) != 0) && !this.Q1) {
                ij ijVar = this.P5;
                if (ijVar != null) {
                    if (!ijVar.f23226h2 && !ijVar.s4()) {
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

    public final boolean E(MotionEvent motionEvent) {
        l1 l1Var;
        if (this.Z8 == null || (l1Var = this.Ra) == null || !l1Var.d()) {
            return false;
        }
        boolean contains = this.f29774a9.contains(motionEvent.getX(), motionEvent.getY());
        if (this.f29788b9 == null) {
            this.f29788b9 = new ic(this);
        }
        if (motionEvent.getAction() == 0) {
            this.f29788b9.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.f29788b9.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f29788b9.f34555i) {
                this.Ra.U1(this);
            }
            this.f29788b9.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.f29788b9.c(false);
        }
        return this.f29788b9.f34555i;
    }

    public final void E0(boolean z9) {
        float f10;
        ij ijVar;
        ij ijVar2;
        TLRPC.PhotoSize photoSize;
        String str;
        int i7;
        RadialProgress2 radialProgress2;
        int i10;
        ij ijVar3;
        if (this.Ra != null && this.P5.q4() && this.P5.u2() && !this.P5.n5() && !this.P5.M0) {
            this.Ra.C(this);
            return;
        }
        ij ijVar4 = this.P5;
        if (ijVar4 != null && !ijVar4.N2()) {
            this.P5.P = true;
        }
        int i11 = this.N3;
        RadialProgress2 radialProgress22 = this.Q0;
        int i12 = this.Z5;
        di.z2 z2Var = this.T0;
        RadialProgress2 radialProgress23 = this.P0;
        if (i11 == 0 && (!this.f30071y1 || z9)) {
            int i13 = this.L1;
            if (i13 != 3 && i13 != 5 && (i13 != 7 || (ijVar3 = this.P5) == null || !ijVar3.U4() || !this.P5.f23286x0)) {
                if (z9) {
                    radialProgress22.p(false, 0.0f);
                } else {
                    radialProgress23.p(false, 0.0f);
                }
                if (this.f29809d4 != null && (z2Var.L() || this.f29822e4 == null)) {
                    photoSize = this.f29809d4;
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !"s".equals(photoSize.type)) {
                        str = this.f29848g4;
                    } else {
                        str = this.f29862h4;
                    }
                } else {
                    photoSize = this.f29822e4;
                    str = this.f29862h4;
                }
                if (ij.S5(this.P5.f23237k)) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                ij ijVar5 = this.P5;
                int i14 = ijVar5.D;
                if (i14 == 1 || i14 == 20) {
                    int i15 = i7;
                    radialProgress2 = radialProgress23;
                    z2Var.f21211r = true;
                    z2Var.r0(hc.f(this.f29809d4, this.f29796c4), this.f29848g4, hc.f(this.f29822e4, this.f29796c4), this.f29862h4, this.f29836f4, this.f29809d4.size, null, this.P5, i15);
                } else if (i14 == 8) {
                    org.telegram.messenger.w7.G(i12).X(this.M1, this.P5, 2, 0);
                    if (this.P5.F0 > 0) {
                        A0(this.M1);
                    }
                    radialProgress2 = radialProgress23;
                } else if (this.f30068xb) {
                    if (ijVar5.m4()) {
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i12);
                        TLRPC.Document F0 = this.P5.F0();
                        ij ijVar6 = this.P5;
                        if (ij.S5(ijVar6.f23237k)) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        G.X(F0, ijVar6, 2, i10);
                        radialProgress2 = radialProgress23;
                    } else {
                        ij ijVar7 = this.P5;
                        ijVar7.f23215f0 = 2.0f;
                        TLRPC.Document F02 = ijVar7.F0();
                        z2Var.f21211r = true;
                        String str2 = str;
                        radialProgress2 = radialProgress23;
                        z2Var.r0(hc.b(F02), null, hc.f(photoSize, F02), str2, null, F02.size, null, this.P5, 0);
                    }
                    this.kb = true;
                    invalidate();
                } else {
                    radialProgress2 = radialProgress23;
                    if (i14 == 9) {
                        org.telegram.messenger.w7.G(i12).X(this.M1, this.P5, 2, 0);
                        if (this.P5.F0 > 0) {
                            A0(this.M1);
                        }
                    } else {
                        int i16 = this.L1;
                        if (i16 == 4) {
                            org.telegram.messenger.w7.G(i12).X(this.M1, this.P5, 1, i7);
                            ij ijVar8 = this.P5;
                            if (ijVar8.F0 > 0) {
                                A0(ijVar8.F0());
                            }
                        } else if (i14 == 0 && i16 != 0) {
                            if (i16 == 2) {
                                z2Var.f21211r = true;
                                z2Var.r0(hc.b(this.M1), null, hc.c(this.f29809d4, this.M1), this.f29862h4, null, this.M1.size, null, this.P5, i7);
                                ij ijVar9 = this.P5;
                                ijVar9.f23215f0 = 2.0f;
                                if (ijVar9.F0 > 0) {
                                    A0(ijVar9.F0());
                                }
                            } else if (i16 == 1) {
                                org.telegram.messenger.w7.G(i12).X(this.M1, this.P5, 2, 0);
                            } else if (i16 == 8) {
                                z2Var.r0(hc.b(this.M1), this.f29848g4, hc.c(this.f29809d4, this.M1), "b1", null, 0L, "jpg", this.P5, 1);
                            }
                        } else {
                            z2Var.f21211r = true;
                            z2Var.r0(hc.f(this.f29809d4, this.f29796c4), this.f29848g4, hc.f(this.f29822e4, this.f29796c4), this.f29862h4, this.f29836f4, 0L, null, this.P5, 0);
                        }
                    }
                }
                this.P5.f23235j1 = false;
                this.N3 = 1;
                if (z9) {
                    radialProgress22.setIcon(14, false, true);
                } else {
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
                return;
            }
            if (this.W3 == 0) {
                org.telegram.messenger.w7.G(i12).X(this.M1, this.P5, 2, 0);
                this.P5.f23235j1 = false;
            }
            if (this.Ra.E1(this, this.P5)) {
                if (this.V3 == 2 && this.W3 != 1) {
                    this.W3 = 1;
                    radialProgress23.p(false, 0.0f);
                    radialProgress23.k(getMiniIconForCurrentState(), false, true);
                }
                R3();
                this.N3 = 1;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i11 == 1 && (!this.f30071y1 || z9)) {
            z2Var.f21211r = false;
            int i17 = this.L1;
            if (i17 != 3 && i17 != 5 && (i17 != 7 || (ijVar2 = this.P5) == null || !ijVar2.U4())) {
                if (this.P5.O3() && !this.f30071y1 && (this.P5.p4() || this.P5.Z2())) {
                    if (radialProgress23.f31477i.f36814q != 6) {
                        this.Ra.N(this);
                        return;
                    }
                    return;
                }
                ij ijVar10 = this.P5;
                ijVar10.f23235j1 = true;
                int i18 = this.L1;
                if (i18 != 2 && i18 != 4 && i18 != 1 && i18 != 8) {
                    int i19 = ijVar10.D;
                    if (i19 != 0 && i19 != 1 && i19 != 20 && i19 != 8 && i19 != 5) {
                        if (i19 == 9) {
                            org.telegram.messenger.w7.G(i12).f(this.P5.F0());
                        }
                    } else {
                        gc D = gc.D();
                        String str3 = z2Var.Q;
                        if (str3 != null) {
                            D.f22625s.c(new ib(D, str3, 2));
                        }
                        z2Var.c();
                    }
                } else {
                    org.telegram.messenger.w7.G(i12).f(this.M1);
                }
                this.N3 = 0;
                if (z9) {
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
            ij ijVar11 = this.P5;
            if (ijVar11 != null && ijVar11.D == 23) {
                this.Ra.u0(this, 0.0f, 0.0f, false);
            } else if (this.L1 == 7 && ijVar11 != null && ijVar11.U4()) {
                if (this.W3 == 0) {
                    org.telegram.messenger.w7.G(i12).X(this.M1, this.P5, 2, 0);
                    this.P5.f23235j1 = false;
                }
                if (this.Ra.E1(this, this.P5)) {
                    if (this.V3 == 2 && this.W3 != 1) {
                        this.W3 = 1;
                        radialProgress23.p(false, 0.0f);
                        radialProgress23.k(getMiniIconForCurrentState(), false, true);
                    }
                    R3();
                    this.N3 = 1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                if (this.f30068xb) {
                    this.kb = true;
                    invalidate();
                }
            } else {
                int i20 = this.L1;
                if (i20 != 3 && i20 != 5) {
                    if (this.f30068xb) {
                        ij ijVar12 = MediaController.B().f21292u0;
                        if (ijVar12 == null || !ijVar12.i4()) {
                            z2Var.f21217t0 = true;
                            z2Var.P0(false);
                        }
                    } else {
                        z2Var.f21217t0 = true;
                        z2Var.P0(false);
                    }
                    this.P5.f23215f0 = 0.0f;
                    this.N3 = -1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    return;
                }
                radialProgress23.p(false, 0.0f);
                org.telegram.messenger.w7.G(i12).X(this.M1, this.P5, 2, 0);
                this.P5.f23235j1 = false;
                this.N3 = 4;
                radialProgress23.setIcon(getIconForCurrentState(), true, true);
                invalidate();
            }
        } else if (i11 != 3 && i11 != 0) {
            if (i11 == 4) {
                int i21 = this.L1;
                if (i21 == 3 || i21 == 5 || (i21 == 7 && (ijVar = this.P5) != null && ijVar.U4())) {
                    if ((this.P5.O3() && (this.P5.p4() || this.P5.Z2())) || this.P5.o4()) {
                        l1 l1Var = this.Ra;
                        if (l1Var != null && radialProgress23.f31477i.f36814q != 6) {
                            l1Var.N(this);
                            return;
                        }
                        return;
                    }
                    this.P5.f23235j1 = true;
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
                l1Var2.u0(this, f10, f10, false);
            }
        }
    }

    public final boolean E1(o1 o1Var, r70 r70Var, Layout layout, int i7) {
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
                } else if (characterStyleArr[i10] == this.f30086z4) {
                    o1Var.f29631b = i7;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (o1Var.f29631b != i7) {
            return false;
        }
        r70Var.rewind();
        int spanStart = spanned.getSpanStart(this.f30086z4);
        int spanEnd = spanned.getSpanEnd(this.f30086z4);
        r70Var.f31885c = true;
        r70Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, r70Var);
        r70Var.a();
        this.f30061x4.l();
        return true;
    }

    public final boolean E2() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message;
        ij ijVar = this.P5;
        if (!ijVar.f23236j2) {
            if (ij.B0(ijVar.f23237k) != 489000 || (message = this.P5.f23237k) == null || message.fwd_from == null) {
                if (!this.P5.s4() && !this.P5.w3()) {
                    if (!this.f29838f6 || this.f30023u6) {
                        TLRPC.Message message2 = this.P5.f23237k;
                        if (message2 == null || (messageFwdHeader = message2.fwd_from) == null || (peer = messageFwdHeader.from_id) == null || message2.via_bot_id == 0 || org.telegram.messenger.m5.o(peer) != org.telegram.messenger.m5.o(this.P5.f23237k.peer_id)) {
                            if (!this.f30023u6 || this.P5.D != 0) {
                                if (!this.E && this.f29878i9 && this.f29824e6) {
                                    if (this.P5.Q3()) {
                                        if ((this.P5.B4() && this.P5.p3()) || this.P5.f23226h2) {
                                            return true;
                                        }
                                    } else {
                                        return true;
                                    }
                                }
                                if (!this.P5.z3() || this.P5.f23237k.fwd_from.from_id != null) {
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

    public final boolean E3() {
        ij ijVar;
        ij ijVar2;
        int i7 = this.f30028ub;
        if (i7 != 0) {
            if (i7 != 1) {
                return false;
            }
        } else if (!t2()) {
            if (!b4() && ((!this.B6 || ((this.f29908l3 != null && !this.f30031v1) || (!this.N.f6373p && ((ijVar2 = this.P5) == null || (!ijVar2.N2() && !this.P5.i4()))))) && ((ijVar = this.P5) == null || ijVar.D != 29))) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public final void F0() {
        int i7;
        int i10;
        int i11 = this.W3;
        int i12 = this.Z5;
        RadialProgress2 radialProgress2 = this.P0;
        if (i11 == 0) {
            this.W3 = 1;
            radialProgress2.p(false, 0.0f);
            ij ijVar = this.P5;
            if (ijVar != null && !ijVar.N2()) {
                this.P5.P = true;
            }
            int i13 = this.L1;
            if (i13 != 3 && i13 != 5) {
                if (i13 == 4 || i13 == 7) {
                    A0(this.M1);
                    org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i12);
                    TLRPC.Document document = this.M1;
                    ij ijVar2 = this.P5;
                    if (ij.S5(ijVar2.f23237k)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    G.X(document, ijVar2, 2, i10);
                    this.P5.f23235j1 = false;
                }
            } else {
                org.telegram.messenger.w7 G2 = org.telegram.messenger.w7.G(i12);
                TLRPC.Document document2 = this.M1;
                ij ijVar3 = this.P5;
                if (ij.S5(ijVar3.f23237k)) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                G2.X(document2, ijVar3, 2, i7);
                this.P5.f23235j1 = false;
            }
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        } else if (i11 == 1) {
            int i14 = this.L1;
            if ((i14 == 3 || i14 == 5 || i14 == 7) && MediaController.B().I(this.P5)) {
                MediaController.B().q(true, true, false, false);
            }
            this.W3 = 0;
            this.P5.f23235j1 = true;
            org.telegram.messenger.w7.G(i12).f(this.M1);
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final boolean F1(o1 o1Var, r70 r70Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (E1(o1Var, r70Var, ((fj) arrayList.get(i7)).f22390e, i7)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean F2(ij ijVar) {
        TLRPC.MessageFwdHeader messageFwdHeader = ijVar.f23237k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
            l1 l1Var = this.Ra;
            if (l1Var == null || l1Var.T()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void F3(int i7, boolean z9, boolean z10) {
        float f10;
        float f11 = 0.0f;
        if (i7 == -1 || i7 == 0) {
            if (this.f29971q5 != z9) {
                this.f29971q5 = z9;
                if (!z10) {
                    if (z9) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    this.f29985r5 = f10;
                } else {
                    invalidate();
                }
            } else {
                return;
            }
        }
        if ((i7 != -1 && i7 != 1) || this.E5 == z9) {
            return;
        }
        this.E5 = z9;
        if (!z10) {
            if (z9) {
                f11 = 1.0f;
            }
            this.F5 = f11;
            return;
        }
        setInvalidatesParent(true);
        invalidate();
    }

    public final boolean G(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.G(android.view.MotionEvent):boolean");
    }

    public final void G0() {
        ij ijVar = this.P5;
        if (ijVar != null) {
            ijVar.J0 = !ijVar.J0;
            l1 l1Var = this.Ra;
            if (l1Var != null) {
                l1Var.s1(this, true);
            }
        }
    }

    public final void G1() {
        ij ijVar = this.Q5;
        if (ijVar == null) {
            ijVar = this.P5;
        }
        ij ijVar2 = ijVar;
        this.P5 = null;
        v3(ijVar2, this.K, this.F, this.E, this.G, false);
    }

    public final boolean G2(org.telegram.messenger.ij r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.G2(org.telegram.messenger.ij):boolean");
    }

    public final void G3() {
        di.z2 z2Var = this.T0;
        H3((z2Var.M0 / 2.0f) + z2Var.K0, (z2Var.N0 / 2.0f) + z2Var.L0);
    }

    public final boolean H(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.H(android.view.MotionEvent):boolean");
    }

    public final void H0(Canvas canvas, float f10) {
        ArrayList arrayList;
        float f11;
        float f12;
        if (this.f29908l3 == null) {
            return;
        }
        float f13 = this.f29997s3;
        float f14 = this.f29983r3;
        x1 x1Var = this.f29868hb;
        if (x1Var.f30858x0) {
            if (x1Var.D0) {
                f13 -= getTranslationY();
                f12 = x1Var.f30793h0;
            } else if (x1Var.f30843t0) {
                float f15 = x1Var.L1;
                float f16 = 1.0f - f15;
                f14 = (f14 * f15) + (x1Var.f30835r0 * f16);
                f13 = (f13 * f15) + (f16 * x1Var.f30839s0);
            } else if (!ij.S4(this.P5.f23237k) || !TextUtils.isEmpty(this.P5.f23293z)) {
                f12 = x1Var.f30793h0;
            }
            f14 += f12;
        }
        float f17 = f14;
        float f18 = f13;
        float f19 = 0.0f;
        ArrayList arrayList2 = null;
        if (x1Var.f30767b1) {
            float f20 = x1Var.L1;
            if (f20 != 1.0f) {
                gj gjVar = x1Var.f30772c1;
                if (gjVar != null) {
                    arrayList = gjVar.f22653e;
                } else {
                    arrayList = null;
                }
                org.telegram.ui.Components.n5 n5Var = x1Var.P0;
                float f21 = (1.0f - f20) * f10;
                if (gjVar != null) {
                    f11 = gjVar.d;
                } else {
                    f11 = 0.0f;
                }
                I0(f17, f18, canvas, arrayList, n5Var, false, f21, f11, true);
                gj gjVar2 = this.f29908l3;
                if (gjVar2 != null) {
                    arrayList2 = gjVar2.f22653e;
                }
                ArrayList arrayList3 = arrayList2;
                org.telegram.ui.Components.n5 n5Var2 = this.f30091za;
                float f22 = f10 * x1Var.L1;
                if (gjVar2 != null) {
                    f19 = gjVar2.d;
                }
                I0(f17, f18, canvas, arrayList3, n5Var2, true, f22, f19, true);
                return;
            }
        }
        gj gjVar3 = this.f29908l3;
        if (gjVar3 != null) {
            arrayList2 = gjVar3.f22653e;
        }
        ArrayList arrayList4 = arrayList2;
        org.telegram.ui.Components.n5 n5Var3 = this.f30091za;
        if (gjVar3 != null) {
            f19 = gjVar3.d;
        }
        I0(f17, f18, canvas, arrayList4, n5Var3, true, f10, f19, true);
    }

    public final boolean H2() {
        if (this.Q5 != null) {
            return this.T5;
        }
        return this.F;
    }

    public final void H3(float f10, float f11) {
        q1 q1Var;
        di.z2 z2Var = this.T0;
        this.O9 = (float) Math.sqrt(Math.pow(z2Var.N0, 2.0d) + Math.pow(z2Var.M0, 2.0d));
        ij ijVar = this.P5;
        if (!ijVar.M0 && this.L9 == 0.0f) {
            if (ijVar.D == 3) {
                ijVar.K1 = true;
                ijVar.O0 = true;
                q1Var = this;
                q1Var.u3(ijVar, this.K, this.F, this.E, this.G, this.H);
                ij ijVar2 = q1Var.P5;
                ijVar2.O0 = false;
                ijVar2.K1 = false;
                if (q1Var.K != null) {
                    q1Var.P0.p(false, 0.0f);
                }
            } else {
                q1Var = this;
            }
            q1Var.M9 = f10;
            q1Var.N9 = f11;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c8.j9.a(q1Var.O9 * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(xq.f40332j);
            duration.addUpdateListener(new r(this, 2));
            duration.addListener(new k1(this, 0));
            duration.start();
        }
    }

    public final boolean I(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f30051w7) {
            int x10 = (int) motionEvent.getX();
            int M1 = (int) M1(motionEvent);
            aj ajVar = this.L;
            if (ajVar != null) {
                int i7 = ajVar.f21451l;
                if ((i7 & 1) == 0 || (i7 & 8) == 0) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt != this && (childAt instanceof q1)) {
                            q1 q1Var = (q1) childAt;
                            if (q1Var.f30051w7 && q1Var.K == this.K) {
                                int i11 = q1Var.L.f21451l;
                                if ((i11 & 1) != 0 && (i11 & 8) != 0) {
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), (motionEvent.getX() + getLeft()) - q1Var.getLeft(), (M1(motionEvent) + getTop()) - q1Var.getTop(), 0);
                                    boolean I = q1Var.I(obtain);
                                    obtain.recycle();
                                    return I;
                                }
                            }
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.I2;
            if (action == 0) {
                if (this.f30064x7.contains(x10, M1)) {
                    if (this.P5.r4()) {
                        this.K2[1] = 2;
                        this.f30077y7 = true;
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
                if (this.f30077y7) {
                    l1 l1Var = this.Ra;
                    if (l1Var != null) {
                        if (this.t6) {
                            l1Var.r(this);
                        } else {
                            l1Var.x(this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[1];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.f30077y7 = false;
                    r2();
                    return false;
                }
            } else if (motionEvent.getAction() == 2 && this.f30077y7 && (drawable = drawableArr[1]) != null) {
                drawable.setHotspot(x10, M1);
            }
        }
        return false;
    }

    public final void I0(float r24, float r25, android.graphics.Canvas r26, java.util.ArrayList r27, org.telegram.ui.Components.n5 r28, boolean r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.I0(float, float, android.graphics.Canvas, java.util.ArrayList, org.telegram.ui.Components.n5, boolean, float, float, boolean):void");
    }

    public final ColorFilter I1(int i7, int i10) {
        if (this.Zc == null) {
            this.f29778ad = new int[3];
            this.Zc = new ColorFilter[3];
        }
        if (i10 != this.f29778ad[i7] || this.Zc[i7] == null) {
            ColorFilter[] colorFilterArr = this.Zc;
            this.f29778ad[i7] = i10;
            colorFilterArr[i7] = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.Zc[i7];
    }

    public final boolean I2() {
        if (this.Q5 != null) {
            return this.S5;
        }
        return this.E;
    }

    public final boolean I3() {
        l1 l1Var;
        if (getCurrentMessagesGroup() == null && (l1Var = this.Ra) != null && l1Var.k2() != null && this.Ra.k2().z(this.P5)) {
            return true;
        }
        return false;
    }

    public final boolean J(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.P5.D == 12) {
            if (this.f30032v2 == null) {
                this.f30032v2 = new r1(this);
            }
            r1 r1Var = this.f30032v2;
            q1 q1Var = r1Var.f30172a;
            ij ijVar = q1Var.P5;
            int[] iArr = q1Var.M2;
            Drawable[] drawableArr = q1Var.I2;
            if (ijVar.D == 12) {
                int x10 = (int) motionEvent.getX();
                int M1 = (int) q1Var.M1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    ArrayList arrayList = r1Var.f30177g;
                    if (arrayList != null && arrayList.size() > 1) {
                        for (int i7 = 0; i7 < r1Var.f30177g.size(); i7++) {
                            n1 n1Var = (n1) r1Var.f30177g.get(i7);
                            float f10 = x10;
                            float f11 = M1;
                            if (n1Var.f29595e.contains(f10, f11)) {
                                if (n1Var.f29596f == null) {
                                    n1Var.f29596f = new ic(q1Var);
                                }
                                n1Var.f29596f.c(true);
                                y yVar = n1Var.f29597g;
                                if (yVar != null) {
                                    yVar.setHotspot(f10, f11);
                                    n1Var.f29597g.setState(iArr);
                                }
                                q1Var.invalidate();
                                return true;
                            }
                        }
                    }
                    float f12 = x10;
                    float f13 = M1;
                    if (q1Var.f30019u2.contains(f12, f13)) {
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
                            ArrayList arrayList2 = r1Var.f30177g;
                            if (arrayList2 != null && arrayList2.size() == 1) {
                                q1Var.Ra.g1(q1Var, ((n1) r1Var.f30177g.get(0)).f29592a);
                            } else {
                                q1Var.Ra.g1(q1Var, 5);
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
                    ArrayList arrayList3 = r1Var.f30177g;
                    if (arrayList3 != null && arrayList3.size() > 1) {
                        for (int i10 = 0; i10 < r1Var.f30177g.size(); i10++) {
                            n1 n1Var2 = (n1) r1Var.f30177g.get(i10);
                            ic icVar = n1Var2.f29596f;
                            if (icVar != null && icVar.f34555i) {
                                l1 l1Var = q1Var.Ra;
                                if (l1Var != null) {
                                    l1Var.g1(q1Var, n1Var2.f29592a);
                                }
                                y yVar2 = n1Var2.f29597g;
                                if (yVar2 != null) {
                                    yVar2.setState(StateSet.NOTHING);
                                }
                                n1Var2.f29596f.c(false);
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
                    ArrayList arrayList4 = r1Var.f30177g;
                    if (arrayList4 != null && arrayList4.size() > 1) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= r1Var.f30177g.size()) {
                                break;
                            }
                            n1 n1Var3 = (n1) r1Var.f30177g.get(i11);
                            ic icVar2 = n1Var3.f29596f;
                            if (icVar2 != null && icVar2.f34555i) {
                                y yVar3 = n1Var3.f29597g;
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

    public final void J0(Canvas canvas, float f10) {
        tg0 tg0Var;
        ij ijVar = this.P5;
        if (ijVar != null && !ijVar.s4()) {
            float f11 = this.f30005t0;
            x1 x1Var = this.f29868hb;
            if (x1Var.f30817m2) {
                float f12 = x1Var.f30825o2;
                float f13 = x1Var.L1;
                f11 = (f11 * f13) + ((1.0f - f13) * f12);
            }
            float f14 = f11;
            if (x1Var.L1 != 1.0f && x1Var.H0 && ((tg0Var = this.f30081yc) == null || !tg0Var.h)) {
                canvas.save();
                org.telegram.ui.ActionBar.t4 t4Var = this.K6;
                if (t4Var != null) {
                    Rect bounds = t4Var.getBounds();
                    if (this.P5.Q3() && !this.B6 && !this.F) {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(10.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    } else {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(4.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    }
                }
                I0(this.f29929n0, f14, canvas, x1Var.I0, x1Var.P0, false, (1.0f - x1Var.L1) * f10, this.P5.f23280v2, false);
                ij ijVar2 = this.P5;
                I0(this.f29929n0, f14, canvas, ijVar2.f23296z2, this.f30091za, true, f10 * x1Var.L1, ijVar2.f23280v2, false);
                canvas.restore();
            } else {
                ij ijVar3 = this.P5;
                I0(this.f29929n0, f14, canvas, ijVar3.f23296z2, this.f30091za, true, f10, ijVar3.f23280v2, false);
            }
        }
        if (C3()) {
            H0(canvas, f10);
        }
    }

    public final boolean J2() {
        if (this.f30068xb && this.f30080yb) {
            return true;
        }
        return false;
    }

    public final boolean K(MotionEvent motionEvent) {
        float f10;
        l1 l1Var;
        ij ijVar = this.P5;
        if (ijVar == null || ijVar.M0() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f11 = 0.0f;
        if (this.f29870i0 == 0) {
            f10 = 0.0f;
        } else {
            f10 = 18.0f;
        }
        float L = timeX - org.telegram.messenger.g0.L(f10);
        float f12 = this.z9;
        if (this.P5.f23294z0) {
            f11 = 1.0f - this.f29885j4;
        }
        int L2 = ((int) ((f12 * f11) + L)) - org.telegram.messenger.g0.L(2.0f);
        int timeY = ((int) getTimeY()) - org.telegram.messenger.g0.L(2.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(L2, timeY, org.telegram.messenger.g0.L(16.0f) + L2 + this.z9, org.telegram.messenger.g0.L(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), M1(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.f29894k0 == null) {
                    this.f29894k0 = new ic(this);
                }
                this.f29829ec = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.f29829ec = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.f29829ec && (l1Var = this.Ra) != null) {
                l1Var.H(this);
            }
            this.f29829ec = false;
        } else if (motionEvent.getAction() == 3) {
            this.f29829ec = false;
        }
        ic icVar = this.f29894k0;
        if (icVar != null) {
            icVar.c(this.f29829ec);
        }
        return this.f29829ec;
    }

    public final void K0(android.graphics.Canvas r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.K0(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public final boolean K2() {
        ij ijVar = this.P5;
        if (ijVar != null && ijVar.T4()) {
            return false;
        }
        return true;
    }

    public final boolean L(MotionEvent motionEvent) {
        int i7;
        int i10;
        int i11;
        if (this.S1) {
            t1 D1 = D1();
            q1 q1Var = D1.f30364a;
            boolean z9 = q1Var.S1;
            ArrayList arrayList = q1Var.H5;
            n2.n0 n0Var = q1Var.f30009t4;
            if (z9) {
                int x10 = (int) motionEvent.getX();
                int M1 = (int) q1Var.M1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    if (q1Var.N1 && q1Var.f30058x1 && q1Var.N3 != -1 && x10 >= (i10 = q1Var.J3) && x10 <= org.telegram.messenger.g0.L(48.0f) + i10 && M1 >= (i11 = q1Var.K3) && M1 <= org.telegram.messenger.g0.L(48.0f) + i11 && q1Var.P0.f31477i.f36814q != 4) {
                        q1Var.O3 = 1;
                        q1Var.invalidate();
                        return true;
                    } else if (q1Var.N1 && q1Var.T0.O(x10, M1)) {
                        D1.v = true;
                        return true;
                    } else if (q1Var.f29943o2 == null || M1 < q1Var.X1) {
                        return false;
                    } else {
                        try {
                            int L = x10 - ((q1Var.f29941o0 + org.telegram.messenger.g0.L(10.0f)) + q1Var.Z1);
                            int i12 = M1 - q1Var.X1;
                            int lineForVertical = q1Var.f29943o2.getLineForVertical(i12);
                            float f10 = L;
                            int offsetForHorizontal = q1Var.f29943o2.getOffsetForHorizontal(lineForVertical, f10);
                            float lineLeft = q1Var.f29943o2.getLineLeft(lineForVertical);
                            if (lineLeft > f10 || lineLeft + q1Var.f29943o2.getLineWidth(lineForVertical) < f10) {
                                return false;
                            }
                            Spannable spannable = (Spannable) q1Var.P5.f23289y;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length == 0) {
                                return false;
                            }
                            if (((clickableSpanArr[0] instanceof x31) && !x31.h) || org.telegram.messenger.g0.C1()) {
                                return false;
                            }
                            x70 x70Var = q1Var.f29970q4;
                            if (x70Var == null || x70Var.f40209i != clickableSpanArr[0]) {
                                n0Var.m(x70Var, true);
                                x70 x70Var2 = new x70(clickableSpanArr[0], q1Var.Pb, f10, i12, 0);
                                q1Var.f29970q4 = x70Var2;
                                if (q1Var.P5.Q3()) {
                                    i7 = org.telegram.ui.ActionBar.k6.Ac;
                                } else {
                                    i7 = org.telegram.ui.ActionBar.k6.f28265ze;
                                }
                                x70Var2.d(org.telegram.ui.ActionBar.k6.w0(i7, q1Var.Pb));
                                q1Var.f30057x0 = -10;
                                q1Var.f30021u4 = 2;
                                try {
                                    r70 b10 = q1Var.f29970q4.b();
                                    int[] W1 = W1(spannable, q1Var.f29970q4.f40209i);
                                    b10.d(q1Var.f29943o2, W1[0], 0.0f);
                                    q1Var.f29943o2.getSelectionPath(W1[0], W1[1], b10);
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                n0Var.b(q1Var.f29970q4, 2);
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
                    if (q1Var.f30021u4 != 2 && !D1.v && q1Var.O3 == 0) {
                        q1Var.e3(2);
                        return false;
                    } else if (q1Var.O3 != 0) {
                        q1Var.O3 = 0;
                        q1Var.playSoundEffect(0);
                        q1Var.E0(false);
                        q1Var.invalidate();
                        return false;
                    } else {
                        x70 x70Var3 = q1Var.f29970q4;
                        if (x70Var3 != null) {
                            CharacterStyle characterStyle = x70Var3.f40209i;
                            if (characterStyle instanceof URLSpan) {
                                vf.c.t(q1Var.getContext(), ((URLSpan) q1Var.f29970q4.f40209i).getURL());
                            } else if (characterStyle instanceof ClickableSpan) {
                                ((ClickableSpan) characterStyle).onClick(q1Var);
                            }
                            q1Var.e3(2);
                            return false;
                        }
                        D1.v = false;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList.size()) {
                                break;
                            }
                            c0 c0Var = (c0) arrayList.get(i13);
                            if (cg.c.c(c0Var.f28953i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                q1Var.playSoundEffect(0);
                                q1Var.Ra.b1(q1Var, c0Var.f28953i);
                                q1Var.invalidate();
                                break;
                            }
                            i13++;
                        }
                        q1Var.e3(2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean L0() {
        ij ijVar;
        if (this.Qb && (ijVar = this.P5) != null && ijVar.Q3() && org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28112rb, this.Pb) != 0) {
            return true;
        }
        return false;
    }

    public final org.telegram.ui.ActionBar.t4 L1(boolean z9) {
        boolean z10;
        if (z9) {
            aj ajVar = this.L;
            if (ajVar != null && (ajVar.f21451l & 8) == 0 && this.K.f22008i && !this.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.P5.Q3()) {
                if (!this.B6 && !this.J && !z10) {
                    this.K6 = (org.telegram.ui.ActionBar.t4) Y1("drawableMsgOut");
                } else {
                    this.K6 = (org.telegram.ui.ActionBar.t4) Y1("drawableMsgOutMedia");
                }
            } else if (!this.B6 && !this.J && !z10) {
                this.K6 = (org.telegram.ui.ActionBar.t4) Y1("drawableMsgIn");
            } else {
                this.K6 = (org.telegram.ui.ActionBar.t4) Y1("drawableMsgInMedia");
            }
        }
        this.K6.g();
        return this.K6;
    }

    public final boolean L2() {
        ij ijVar;
        if (this.X6 && (ijVar = this.P5) != null && !ijVar.Q3() && this.L == null && !t2()) {
            return true;
        }
        return false;
    }

    public final void L3(int i7, boolean z9) {
        if (i7 >= 0) {
            ArrayList arrayList = this.P4;
            if (i7 < arrayList.size()) {
                p1 p1Var = (p1) arrayList.get(i7);
                if (this.Ra.Q(this, p1Var.f29724t, !p1Var.f29713i)) {
                    if (z9) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long B0 = ij.B0(this.P5.f23237k);
                    int i10 = this.Z5;
                    long M = org.telegram.messenger.t3.M(qp.s1(i10).M0(Long.valueOf(B0)), qp.s1(i10).N0(B0), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) ij.n1(this.P5);
                    int i11 = this.Z5;
                    ij.a6(i11, M, tL_messageMediaToDo, p1Var.f29724t.f27099id, !p1Var.f29713i, ConnectionsManager.getInstance(i11).getCurrentTime());
                    if (!p1Var.f29713i) {
                        TLObject e22 = qp.s1(i10).e2(M);
                        p1Var.f29728y.l(e22);
                        p1Var.f29729z.i0(e22, p1Var.f29728y, null);
                        p1Var.f29721q = new ly0(org.telegram.messenger.m5.m(e22), 12.0f, null);
                    }
                    this.f29825e7[i7].f(-1, !p1Var.f29713i, true);
                    if (this.f30060x3 != null) {
                        if (!this.P5.Q3() && ij.B0(this.P5.f23237k) >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.f30060x3.t(hd.K("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(ij.z0(tL_messageMediaToDo)), org.telegram.messenger.m5.l(p10.f24459s0, this.P5.Z0())), true, true);
                        } else {
                            this.f30060x3.t(hd.K("TodoCompleted", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(ij.z0(tL_messageMediaToDo))), true, true);
                        }
                    }
                    p1Var.f29713i = !p1Var.f29713i;
                    invalidate();
                    return;
                }
                this.Y4 = false;
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
        return ((motionEvent.getY() - this.V) - this.f29832f0) - this.f29858h0;
    }

    public final void M3() {
        ij ijVar;
        int i7;
        boolean z9;
        kv kvVar;
        ArrayList arrayList;
        if (this.wc && (ijVar = this.P5) != null) {
            boolean z10 = false;
            if (ijVar.V1) {
                i7 = org.telegram.ui.Components.i5.f();
            } else {
                i7 = 0;
            }
            gj gjVar = this.f29908l3;
            if (gjVar != null && (arrayList = gjVar.f22653e) != null) {
                this.f30091za = org.telegram.ui.Components.r5.update(i7, (View) this, false, this.f30091za, (ArrayList<fj>) arrayList);
            } else {
                l1 l1Var = this.Ra;
                if (l1Var != null && l1Var.g()) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                this.f30091za = org.telegram.ui.Components.r5.update(i7, this, z9, this.f30091za, this.P5.f23296z2);
            }
            ij ijVar2 = this.P5;
            if (ijVar2.D == 36 && (kvVar = ijVar2.f23284w2) != null) {
                l1 l1Var2 = this.Ra;
                if (l1Var2 == null || !l1Var2.g()) {
                    z10 = true;
                }
                kvVar.v = z10;
                this.P5.f23284w2.b0(i7);
            }
        }
    }

    public final void N() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.N():void");
    }

    public void N0(Canvas canvas) {
        if (!this.P5.M0 && this.L9 != 1.0f) {
            di.z2 z2Var = this.T0;
            int[] iArr = z2Var.W0;
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
            rectF.set(z2Var.K0, z2Var.L0, z2Var.y(), z2Var.A());
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
                z2Var.h(canvas, null);
            } else {
                float f14 = z2Var.K0;
                float f15 = z2Var.L0;
                float f16 = z2Var.M0;
                float f17 = z2Var.N0;
                ImageReceiver imageReceiver = this.U0;
                imageReceiver.y0(f14, f15, f16, f17);
                imageReceiver.L0(z2Var.W0);
                imageReceiver.h(canvas, null);
            }
            O0(canvas);
            canvas.restore();
        }
    }

    public final String N1(ij ijVar) {
        if (this.A5) {
            String N0 = hd.N0("PsaMessage_" + ijVar.f23237k.fwd_from.psa_type);
            if (N0 == null) {
                return hd.M0(2131746594, "PsaMessageDefault");
            }
            return N0;
        }
        return hd.M0(2131750566, null);
    }

    public final boolean N2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.N2():boolean");
    }

    public final void N3(boolean r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.N3(boolean, boolean, boolean):void");
    }

    @Override
    public final void O(ImageReceiver imageReceiver) {
        ij ijVar = this.P5;
        if (ijVar != null && imageReceiver == this.T0 && ijVar.K2()) {
            this.Ra.A1(this.P5);
        }
    }

    public void O0(Canvas canvas) {
        if (this.P9 == null) {
            return;
        }
        canvas.save();
        di.z2 z2Var = this.T0;
        canvas.translate(z2Var.K0, z2Var.L0);
        this.P9.c(canvas, this, (int) z2Var.M0, (int) z2Var.N0, z2Var.getAlpha(), this.Fc);
        canvas.restore();
        invalidate();
    }

    public final float O1(boolean z9) {
        float f10;
        pg0 pg0Var;
        float f11;
        if (!this.f29883j1 && this.f30063x6) {
            int i7 = this.f30076y6;
            if (i7 >= 300) {
                f11 = 1.0f;
            } else {
                f11 = i7 / 300.0f;
            }
            f10 = f11 * 1.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z9 && (pg0Var = this.f29931n3) != null) {
            return (1.0f - pg0Var.f36889k.e(false, 1.0f)) * f10;
        }
        return f10;
    }

    public final boolean O2() {
        ij ijVar = this.P5;
        kv kvVar = ijVar.f23284w2;
        if (ijVar.D == 36 && kvVar != null) {
            ArrayList arrayList = kvVar.f23761g;
            if (arrayList.size() == 1 && (arrayList.get(0) instanceof ck0)) {
                return true;
            }
        }
        return false;
    }

    public final void O3() {
        float f10;
        float f11;
        float f12;
        float L;
        int i7;
        float f13;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ij ijVar = this.P5;
        int i17 = ijVar.D;
        float f14 = 0.0f;
        x1 x1Var = this.f29868hb;
        int i18 = 0;
        boolean z9 = true;
        if (i17 != 1 && i17 != 20 && this.L1 != 4 && i17 != 8 && i17 != 23) {
            float f15 = 10.0f;
            float f16 = 11.0f;
            if (this.R1) {
                int i19 = this.M6;
                if (!ijVar.Q3()) {
                    f16 = 17.0f;
                }
                this.f29983r3 = org.telegram.messenger.g0.L(f16) + i19 + this.f29969q3;
                int i20 = this.f30017u0 - this.f30008t3;
                if (this.I) {
                    f15 = 9.0f;
                }
                int L2 = ((i20 - org.telegram.messenger.g0.L(f15)) - this.V1) - org.telegram.messenger.g0.L(17.0f);
                if (this.f30051w7 && this.E8 != 3) {
                    i16 = getCommentButtonHeight();
                } else {
                    i16 = 0;
                }
                L = L2 - i16;
                this.f29997s3 = org.telegram.messenger.g0.T1(L, org.telegram.messenger.g0.L(9.0f) + this.Ta, X2());
            } else {
                if (this.f30068xb) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.P5.Q3()) {
                        i15 = 0;
                    } else {
                        i15 = 6;
                    }
                    this.f29983r3 = org.telegram.messenger.g0.L(i15 + 11) + backgroundDrawableLeft;
                } else {
                    int i21 = this.M6;
                    if (!ijVar.Q3() && !this.B6 && !this.J) {
                        f16 = 17.0f;
                    }
                    this.f29983r3 = org.telegram.messenger.g0.L(f16) + i21 + this.f29969q3;
                }
                int i22 = this.f30017u0 - this.f30008t3;
                if (this.I) {
                    f15 = 9.0f;
                }
                int L3 = i22 - org.telegram.messenger.g0.L(f15);
                if (this.f30051w7 && this.E8 != 3) {
                    i13 = getCommentButtonHeight();
                } else {
                    i13 = 0;
                }
                int i23 = L3 - i13;
                ch.p0 p0Var = this.N;
                if (!p0Var.f6373p) {
                    i14 = p0Var.f6371n;
                } else {
                    i14 = 0;
                }
                L = i23 - i14;
                this.f29997s3 = org.telegram.messenger.g0.T1(L, org.telegram.messenger.g0.L(9.0f) + this.Ta, X2());
            }
        } else {
            if (x1Var.f30789g0) {
                f11 = x1Var.f30820n0;
                f12 = x1Var.f30823o0;
                f10 = x1Var.f30831q0;
            } else {
                di.z2 z2Var = this.T0;
                float f17 = z2Var.K0;
                float f18 = z2Var.L0;
                f10 = z2Var.N0;
                f11 = f17;
                f12 = f18;
            }
            this.f29983r3 = f11 + org.telegram.messenger.g0.L(5.0f) + this.f29969q3;
            if (t2()) {
                float compactLeft = getCompactLeft() - getExtraTextX();
                if (s2()) {
                    f13 = this.f29817dd;
                } else if (this.K != null && this.L != null) {
                    f13 = getLeft();
                } else {
                    f13 = 0.0f;
                }
                this.f29983r3 = compactLeft - f13;
            }
            L = f12 + f10 + org.telegram.messenger.g0.L(6.0f);
            float L4 = f10 + org.telegram.messenger.g0.L(6.0f);
            gj gjVar = this.f29908l3;
            if (gjVar == null) {
                i7 = 0;
            } else {
                i7 = -gjVar.b();
            }
            this.f29997s3 = org.telegram.messenger.g0.T1(L4, i7 - org.telegram.messenger.g0.L(4.0f), X2()) + f12;
            z9 = false;
        }
        this.f29983r3 += getExtraTextX();
        ij ijVar2 = this.P5;
        if (ijVar2 != null && (i10 = ijVar2.D) != 0 && i10 != 24 && !ijVar2.w3() && !this.P5.s4()) {
            if (z9 && f2()) {
                this.f29997s3 -= (1.0f - X2()) * (org.telegram.messenger.g0.L(16.0f) + this.f29980r0.f30247r);
            }
            if (z9) {
                s1 s1Var = this.f29980r0;
                if (s1Var != null) {
                    i12 = s1Var.f30247r;
                } else {
                    i12 = 0;
                }
                i11 = org.telegram.messenger.g0.L(14.0f) + i12;
            } else {
                i11 = 0;
            }
            float f19 = L - i11;
            gj gjVar2 = this.f29908l3;
            if (gjVar2 != null) {
                i18 = org.telegram.messenger.g0.L(4.0f) + gjVar2.c(x1Var);
            }
            this.f29966q0 = (int) ((f19 + org.telegram.messenger.g0.W1(X2(), i18, org.telegram.messenger.g0.L(6.0f))) - x1Var.f30807k0);
        }
        ij ijVar3 = this.P5;
        if (ijVar3 != null && ijVar3.D == 17) {
            float f20 = this.f29997s3;
            w1 w1Var = this.f30046w2;
            if (w1Var != null) {
                f14 = w1Var.f30709q;
            }
            this.f29997s3 = f20 + f14;
        }
    }

    public final boolean P(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.P(android.view.MotionEvent):boolean");
    }

    public final boolean P0(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        ij ijVar;
        l1 l1Var;
        String str;
        boolean c10 = cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        int i7 = 1;
        int i10 = this.Z5;
        if (!c10 && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                gz C = gz.C(i10);
                ij ijVar2 = this.P5;
                if (ijVar2 != null && keyboardButtonProto != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(ij.B0(ijVar2.f23237k));
                    sb2.append("_");
                    sb2.append(ijVar2.f1());
                    sb2.append("_");
                    sb2.append(Utilities.f(keyboardButtonProto.getData()));
                    sb2.append("_");
                    if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    sb2.append(str);
                    return C.f22756n.containsKey(sb2.toString());
                }
            } else {
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (tL_inlineButtonTypeUrl != null && (l1Var = this.Ra) != null && l1Var.p1(this, 3) && TextUtils.equals(this.Ra.h(this), tL_inlineButtonTypeUrl.url)) {
                    return true;
                }
            }
        } else {
            gz C2 = gz.C(i10);
            if (this.P5 != null && keyboardButtonProto != null) {
                if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    i7 = 3;
                } else if (!cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                    if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                        i7 = 2;
                    } else {
                        i7 = 0;
                    }
                }
                return C2.f22757r.containsKey(ij.B0(ijVar.f23237k) + "_" + ijVar.f1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i7);
            }
        }
        return false;
    }

    public final boolean P2() {
        ck0 a42 = a4();
        if (a42 != null) {
            long j3 = this.Zb;
            long j10 = 0;
            if (j3 != 0) {
                o71 o71Var = a42.f32595d0;
                if (o71Var != null) {
                    j10 = o71Var.f36541t;
                }
                if (j10 == j3) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void P3() {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        if (this.P5 != null) {
            int i7 = this.Z5;
            qp s12 = qp.s1(i7);
            TLRPC.MessageFwdHeader messageFwdHeader = this.P5.f23237k.fwd_from;
            long e10 = p10.i(i7).e();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (ij.B0(this.P5.f23237k) == e10 || ij.B0(this.P5.f23237k) == 1271266957)) {
                this.f29891ja = qp.s1(i7).M0(Long.valueOf(messageFwdHeader.from_id.channel_id));
            } else if (messageFwdHeader != null && ij.B0(this.P5.f23237k) == 489000) {
                long o4 = org.telegram.messenger.m5.o(messageFwdHeader.from_id);
                if (o4 >= 0) {
                    this.f29879ia = s12.a2(Long.valueOf(o4));
                } else {
                    this.f29891ja = s12.M0(Long.valueOf(-o4));
                }
            } else if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
                long j3 = peer.user_id;
                if (j3 != 0) {
                    if (!this.f29850g6) {
                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                        if (peer2 instanceof TLRPC.TL_peerUser) {
                            this.f29879ia = s12.a2(Long.valueOf(peer2.user_id));
                            return;
                        }
                    }
                    this.f29879ia = s12.a2(Long.valueOf(j3));
                } else if (peer.channel_id != 0) {
                    if (this.P5.l4()) {
                        TLRPC.Peer peer3 = messageFwdHeader.from_id;
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            this.f29879ia = s12.a2(Long.valueOf(peer3.user_id));
                            return;
                        }
                    }
                    this.f29891ja = s12.M0(Long.valueOf(messageFwdHeader.saved_from_peer.channel_id));
                } else {
                    long j10 = peer.chat_id;
                    if (j10 != 0) {
                        TLRPC.Peer peer4 = messageFwdHeader.from_id;
                        if (peer4 instanceof TLRPC.TL_peerUser) {
                            this.f29879ia = s12.a2(Long.valueOf(peer4.user_id));
                        } else {
                            this.f29891ja = s12.M0(Long.valueOf(j10));
                        }
                    }
                }
            } else if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || ij.B0(this.P5.f23237k) == e10)) {
                this.f29879ia = s12.a2(Long.valueOf(messageFwdHeader.from_id.user_id));
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || ij.B0(this.P5.f23237k) == e10)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.f29879ia = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || ij.B0(this.P5.f23237k) == e10)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.f29879ia = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long B0 = ij.B0(this.P5.f23237k);
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
                if (org.telegram.messenger.m5.C(ij.B0(this.P5.f23237k))) {
                    if (this.P5.Q3()) {
                        this.f29879ia = p10.i(i7).f();
                        return;
                    }
                    TLRPC.EncryptedChat a12 = s12.a1(Integer.valueOf((int) (ij.B0(this.P5.f23237k) & 4294967295L)));
                    if (a12 != null) {
                        this.f29879ia = s12.a2(Long.valueOf(a12.user_id));
                    }
                } else if (org.telegram.messenger.m5.E(Z0) && (!this.P5.f23237k.post || (chat != null && chat.signature_profiles))) {
                    this.f29879ia = s12.a2(Long.valueOf(Z0));
                } else if (this.P5.f23237k.post && chat2 != null && !chat2.signature_profiles) {
                    this.f29891ja = chat2;
                } else if (org.telegram.messenger.m5.z(Z0)) {
                    this.f29891ja = chat;
                } else {
                    TLRPC.Message message = this.P5.f23237k;
                    if (message.post) {
                        this.f29891ja = s12.M0(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    public final boolean Q(MotionEvent motionEvent) {
        boolean z9;
        int i7;
        int i10;
        boolean z10;
        int i11;
        ij ijVar;
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
        ij ijVar2;
        int i18 = this.P5.D;
        if ((i18 == 0 || i18 == 24) && this.Q1) {
            t1 D1 = D1();
            q1 q1Var = D1.f30364a;
            ij ijVar3 = q1Var.P5;
            RadialProgress2 radialProgress2 = q1Var.P0;
            n2.n0 n0Var = q1Var.f30009t4;
            di.z2 z2Var = q1Var.T0;
            int[] iArr = q1Var.M2;
            Drawable[] drawableArr = q1Var.I2;
            int i19 = ijVar3.D;
            if ((i19 == 0 || i19 == 24) && q1Var.Q1) {
                int x10 = (int) motionEvent.getX();
                int M1 = (int) q1Var.M1(motionEvent);
                int i20 = q1Var.f29941o0;
                if (x10 >= i20 && x10 <= (i20 + q1Var.f29772a7) - org.telegram.messenger.g0.L(14.0f) && M1 >= (i7 = q1Var.f29953p0)) {
                    int i21 = i7 + q1Var.V1;
                    if (q1Var.f30007t2) {
                        i10 = 46;
                    } else {
                        i10 = 0;
                    }
                    if (M1 <= org.telegram.messenger.g0.L(i10 + 8) + i21) {
                        if (motionEvent.getAction() == 0) {
                            if (q1Var.f29943o2 != null && M1 >= q1Var.X1 && !q1Var.P5.f23264r1) {
                                try {
                                    int L3 = x10 - ((q1Var.f29941o0 + org.telegram.messenger.g0.L(10.0f)) + q1Var.Z1);
                                    int i22 = M1 - q1Var.X1;
                                    if (i22 <= q1Var.f29943o2.getHeight()) {
                                        int lineForVertical = q1Var.f29943o2.getLineForVertical(i22);
                                        float f10 = L3;
                                        int offsetForHorizontal = q1Var.f29943o2.getOffsetForHorizontal(lineForVertical, f10);
                                        float lineLeft = q1Var.f29943o2.getLineLeft(lineForVertical);
                                        if (lineLeft <= f10 && lineLeft + q1Var.f29943o2.getLineWidth(lineForVertical) >= f10) {
                                            if (q1Var.P5.s4()) {
                                                charSequence = q1Var.P5.v;
                                            } else {
                                                charSequence = q1Var.P5.f23289y;
                                            }
                                            Spannable spannable = (Spannable) charSequence;
                                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                            if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[0] instanceof x31) || x31.h) && !org.telegram.messenger.g0.C1())) {
                                                x70 x70Var = q1Var.f29970q4;
                                                if (x70Var == null || x70Var.f40209i != clickableSpanArr[0]) {
                                                    n0Var.m(x70Var, true);
                                                    x70 x70Var2 = new x70(clickableSpanArr[0], q1Var.Pb, x10, M1, 0);
                                                    q1Var.f29970q4 = x70Var2;
                                                    if (q1Var.Q1 && q1Var.f29936n8 != null && (ijVar2 = q1Var.P5) != null && !ijVar2.Q3()) {
                                                        w02 = org.telegram.ui.ActionBar.k6.r1(0.1f, q1Var.f29936n8.i());
                                                    } else {
                                                        if (q1Var.P5.Q3()) {
                                                            i17 = org.telegram.ui.ActionBar.k6.Ac;
                                                        } else {
                                                            i17 = org.telegram.ui.ActionBar.k6.f28265ze;
                                                        }
                                                        w02 = org.telegram.ui.ActionBar.k6.w0(i17, q1Var.Pb);
                                                    }
                                                    x70Var2.d(w02);
                                                    q1Var.f30057x0 = -10;
                                                    q1Var.f30021u4 = 2;
                                                    q1Var.u();
                                                    try {
                                                        r70 b10 = q1Var.f29970q4.b();
                                                        int[] W1 = W1(spannable, q1Var.f29970q4.f40209i);
                                                        b10.d(q1Var.f29943o2, W1[0], 0.0f);
                                                        q1Var.f29943o2.getSelectionPath(W1[0], W1[1], b10);
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                    }
                                                    n0Var.b(q1Var.f29970q4, 2);
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
                            if (q1Var.f29970q4 == null) {
                                int L4 = org.telegram.messenger.g0.L(48.0f);
                                if (q1Var.W3 >= 0 && x10 >= (L2 = q1Var.J3 + (L = org.telegram.messenger.g0.L(27.0f))) && x10 <= L2 + L4 && M1 >= (i16 = q1Var.K3 + L) && M1 <= i16 + L4) {
                                    q1Var.Q3 = 1;
                                    q1Var.invalidate();
                                    return true;
                                }
                                if (q1Var.f30071y1 && q1Var.N3 != -1 && x10 >= (i14 = q1Var.L3)) {
                                    if (x10 <= Math.max(q1Var.B3, q1Var.f29821e3) + org.telegram.messenger.g0.L(34.0f) + i14 && M1 >= (i15 = q1Var.M3) && M1 <= org.telegram.messenger.g0.L(30.0f) + i15) {
                                        q1Var.P3 = 1;
                                        q1Var.invalidate();
                                        return true;
                                    }
                                }
                                if ((q1Var.N1 && q1Var.P5.Y0 != null && z2Var.O(x10, M1)) || (q1Var.N1 && q1Var.f30058x1 && ((q1Var.N3 != -1 || q1Var.L1 == 4) && ((!q1Var.I3 && z2Var.O(x10, M1)) || (x10 >= (i12 = q1Var.J3) && x10 <= org.telegram.messenger.g0.L(48.0f) + i12 && M1 >= (i13 = q1Var.K3) && M1 <= org.telegram.messenger.g0.L(48.0f) + i13 && radialProgress2.f31477i.f36814q != 4))))) {
                                    q1Var.O3 = 1;
                                    q1Var.invalidate();
                                    TLRPC.MessageMedia messageMedia = q1Var.P5.Y0;
                                    if (messageMedia == null) {
                                        return true;
                                    }
                                    if (!ij.t3(messageMedia.document, false) && q1Var.P5.Y0.photo == null) {
                                        return true;
                                    }
                                    Drawable drawable = drawableArr[0];
                                    if (drawable != null && drawable.getBounds().contains(x10, M1)) {
                                        drawableArr[0].setHotspot(x10, M1);
                                        drawableArr[0].setState(iArr);
                                    }
                                    y yVar = D1.f30384x;
                                    if (yVar != null && yVar.getBounds().contains(x10, M1)) {
                                        D1.f30384x.setHotspot(x10, M1);
                                        D1.f30384x.setState(iArr);
                                    }
                                    q1Var.setInstantButtonPressed(true);
                                    ic icVar = D1.f30383w;
                                    if (icVar == null) {
                                        return true;
                                    }
                                    icVar.c(true);
                                    return true;
                                }
                                q1Var.E2 = true;
                                q1Var.K2[0] = 0;
                                Drawable drawable2 = drawableArr[0];
                                if (drawable2 != null && drawable2.getBounds().contains(x10, M1)) {
                                    drawableArr[0].setHotspot(x10, M1);
                                    drawableArr[0].setState(iArr);
                                }
                                y yVar2 = D1.f30384x;
                                if (yVar2 != null && yVar2.getBounds().contains(x10, M1)) {
                                    D1.f30384x.setHotspot(x10, M1);
                                    D1.f30384x.setState(iArr);
                                }
                                q1Var.setInstantButtonPressed(true);
                                ic icVar2 = D1.f30383w;
                                if (icVar2 != null) {
                                    icVar2.c(true);
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
                                            q1Var.Ra.E1(q1Var, q1Var.P5);
                                        }
                                    } else if (!q1Var.f30007t2 && ((ijVar = q1Var.P5) == null || (tL_channelAdminLogEvent = ijVar.J1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage))) {
                                        if (q1Var.N1 && (i23 == 2 || i23 == 4 || (D1.f30370i == null && q1Var.f29930n2 == null && q1Var.f29943o2 == null && q1Var.f29834f2 == null))) {
                                            l1 l1Var = q1Var.Ra;
                                            if (l1Var != null) {
                                                l1Var.u0(q1Var, q1Var.f29845g1, q1Var.f29859h1, true);
                                            }
                                        } else if (ijVar != null && !ijVar.f23264r1) {
                                            TLRPC.WebPage webPage = ij.o1(ijVar.f23237k).webpage;
                                            if (webPage != null && !TextUtils.isEmpty(webPage.embed_url)) {
                                                l1 l1Var2 = q1Var.Ra;
                                                if (l1Var2 != null) {
                                                    l1Var2.D1(q1Var.P5, webPage.embed_url, webPage.site_name, webPage.title, webPage.url, webPage.embed_width, webPage.embed_height);
                                                }
                                            } else if (webPage != null) {
                                                l1 l1Var3 = q1Var.Ra;
                                                if (l1Var3 != null) {
                                                    l1Var3.B1(q1Var, webPage, webPage.url, ij.o1(q1Var.P5.f23237k).safe);
                                                } else {
                                                    vf.c.t(q1Var.getContext(), webPage.url);
                                                }
                                            }
                                        }
                                    } else {
                                        l1 l1Var4 = q1Var.Ra;
                                        if (l1Var4 != null) {
                                            l1Var4.g1(q1Var, q1Var.f30059x2);
                                        }
                                    }
                                    q1Var.playSoundEffect(0);
                                    Drawable drawable3 = drawableArr[0];
                                    if (drawable3 != null) {
                                        drawable3.setState(StateSet.NOTHING);
                                    }
                                    y yVar3 = D1.f30384x;
                                    if (yVar3 != null) {
                                        yVar3.setState(StateSet.NOTHING);
                                    }
                                    ic icVar3 = D1.f30383w;
                                    if (icVar3 != null) {
                                        icVar3.c(false);
                                    }
                                    q1Var.E2 = false;
                                    q1Var.setInstantButtonPressed(false);
                                    q1Var.invalidate();
                                } else if (q1Var.f30021u4 != 2 && q1Var.O3 == 0 && q1Var.Q3 == 0 && q1Var.P3 == 0) {
                                    if (!q1Var.f30093zc) {
                                        z10 = false;
                                        q1Var.f30093zc = false;
                                        q1Var.e3(2);
                                        z9 = z10;
                                    }
                                } else {
                                    z10 = false;
                                    if (q1Var.P3 == 1) {
                                        q1Var.P3 = 0;
                                        q1Var.playSoundEffect(0);
                                        q1Var.E0(true);
                                        q1Var.invalidate();
                                    } else if (q1Var.O3 != 0) {
                                        q1Var.O3 = 0;
                                        q1Var.playSoundEffect(0);
                                        if (q1Var.f30071y1 || ((q1Var.N3 == -1 && q1Var.L1 == 4) || q1Var.P5.Y0 != null)) {
                                            z10 = false;
                                            q1Var.D0();
                                        } else {
                                            z10 = false;
                                            q1Var.E0(false);
                                        }
                                        q1Var.invalidate();
                                    } else if (q1Var.Q3 != 0) {
                                        q1Var.Q3 = 0;
                                        q1Var.playSoundEffect(0);
                                        q1Var.F0();
                                        q1Var.invalidate();
                                    } else {
                                        x70 x70Var3 = q1Var.f29970q4;
                                        if (x70Var3 != null) {
                                            CharacterStyle characterStyle = x70Var3.f40209i;
                                            if (characterStyle instanceof URLSpan) {
                                                q1Var.Ra.N0(q1Var, characterStyle, false);
                                            } else if (characterStyle instanceof ClickableSpan) {
                                                ((ClickableSpan) characterStyle).onClick(q1Var);
                                            }
                                            q1Var.e3(2);
                                        } else {
                                            org.telegram.ui.Components.r5 r5Var = q1Var.f29957p4;
                                            if (r5Var != null && q1Var.Ra.n0(r5Var)) {
                                                q1Var.f29957p4 = null;
                                                q1Var.e3(2);
                                            } else {
                                                if (q1Var.L1 == 2 && q1Var.f30058x1) {
                                                    int i24 = q1Var.N3;
                                                    if (i24 == -1) {
                                                        int i25 = iz.f23357a;
                                                        if (rc.e(2048) && !q1Var.P5.f23226h2) {
                                                            q1Var.Ra.u0(q1Var, q1Var.f29845g1, q1Var.f29859h1, false);
                                                        } else {
                                                            i11 = 2;
                                                            q1Var.N3 = 2;
                                                            q1Var.P5.f23215f0 = 1.0f;
                                                            z2Var.f21217t0 = false;
                                                            z2Var.Q0();
                                                            radialProgress2.setIcon(q1Var.getIconForCurrentState(), false, true);
                                                            q1Var.invalidate();
                                                            q1Var.playSoundEffect(0);
                                                            q1Var.e3(i11);
                                                            return true;
                                                        }
                                                    } else if (i24 == 2 || i24 == 0) {
                                                        q1Var.E0(false);
                                                        q1Var.playSoundEffect(0);
                                                    }
                                                } else {
                                                    ij ijVar4 = q1Var.P5;
                                                    if (!ijVar4.f23264r1) {
                                                        TLRPC.WebPage webPage2 = ij.o1(ijVar4.f23237k).webpage;
                                                        if (webPage2 != null && !TextUtils.isEmpty(webPage2.embed_url)) {
                                                            q1Var.Ra.D1(q1Var.P5, webPage2.embed_url, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_width, webPage2.embed_height);
                                                        } else {
                                                            int i26 = q1Var.N3;
                                                            if (i26 != -1 && i26 != 3) {
                                                                if (webPage2 != null) {
                                                                    l1 l1Var5 = q1Var.Ra;
                                                                    if (l1Var5 != null) {
                                                                        l1Var5.B1(q1Var, webPage2, webPage2.url, ij.o1(q1Var.P5.f23237k).safe);
                                                                    } else {
                                                                        vf.c.t(q1Var.getContext(), webPage2.url);
                                                                    }
                                                                }
                                                            } else {
                                                                q1Var.Ra.u0(q1Var, q1Var.f29845g1, q1Var.f29859h1, false);
                                                                q1Var.playSoundEffect(0);
                                                            }
                                                        }
                                                    }
                                                }
                                                i11 = 2;
                                                q1Var.e3(i11);
                                                return true;
                                            }
                                        }
                                    }
                                    z9 = z10;
                                }
                            } else {
                                z9 = false;
                                if (motionEvent.getAction() == 2 && q1Var.F2) {
                                    Drawable drawable4 = drawableArr[0];
                                    if (drawable4 != null) {
                                        drawable4.setHotspot(x10, M1);
                                    }
                                    y yVar4 = D1.f30384x;
                                    if (yVar4 != null) {
                                        yVar4.setHotspot(x10, M1);
                                    }
                                }
                            }
                            return z9;
                        }
                        z9 = false;
                        return z9;
                    }
                }
                z9 = false;
                return z9;
            }
        }
        return false;
    }

    public final void Q0(float r8, android.graphics.Canvas r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.Q0(float, android.graphics.Canvas, boolean):void");
    }

    public final String Q1(long j3) {
        TLRPC.Chat M0;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.Z5;
        if (i7 > 0) {
            TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(j3));
            if (a22 != null) {
                return t10.p(a22);
            }
            return null;
        } else if (i7 < 0 && (M0 = qp.s1(i10).M0(Long.valueOf(-j3))) != null) {
            return M0.title;
        } else {
            return null;
        }
    }

    public final void Q2(int i7, int i10) {
        aj ajVar = this.L;
        float f10 = ajVar.f21457r;
        float f11 = ajVar.f21459t;
        this.f29805cd = f10 - f11;
        this.f29817dd = f11;
        this.f29830ed = (int) ajVar.f21458s;
        this.f29843fd = (int) ((i7 * ajVar.f21460u) / (i10 / 1000.0f));
    }

    public final void Q3() {
        Window window;
        if (this.mb == null) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W == null) {
                window = null;
            } else {
                window = W.getWindow();
            }
            if (window != null) {
                org.telegram.messenger.n6 n6Var = new org.telegram.messenger.n6(window, new ca(this, 3));
                this.mb = n6Var;
                if (this.N0) {
                    n6Var.a();
                }
            }
        }
        org.telegram.messenger.n6 n6Var2 = this.mb;
        if (n6Var2 != null) {
            n6Var2.g();
        }
    }

    public final boolean R() {
        return org.telegram.messenger.w7.G(this.Z5).k(getFilename());
    }

    public final void R0(android.graphics.Canvas r21, org.telegram.messenger.gj r22, boolean r23, boolean r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.R0(android.graphics.Canvas, org.telegram.messenger.gj, boolean, boolean, float):void");
    }

    public final float R1(boolean z9) {
        boolean z10;
        xq xqVar;
        float f10 = this.Uc;
        ij ijVar = this.P5;
        if (ijVar != null && !ijVar.Q3()) {
            int i7 = 0;
            if (z9 && ((z10 = this.f29918m1) || this.n1)) {
                if (z10) {
                    xqVar = xq.f40330g;
                } else {
                    xqVar = xq.f40331i;
                }
                this.f29967q1 = (int) Math.ceil(xqVar.getInterpolation(this.f29942o1) * org.telegram.messenger.g0.L(35.0f));
                if (this.P5.D == 36) {
                    if (org.telegram.messenger.g0.L(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                        this.f29967q1 = 0;
                    }
                }
            }
            f10 += this.f29967q1;
            if (t2()) {
                return f10 + getCompactSideMenuShift();
            }
            if (this.W6 && this.L != null) {
                if (Y2()) {
                    i7 = 48;
                }
                return (org.telegram.messenger.g0.L(71 - i7) * this.Y6) + f10;
            }
        }
        return f10;
    }

    public final int R2(int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.R2(int):int");
    }

    public final void R3() {
        boolean z9;
        String k02;
        double d;
        double d2;
        double d10;
        sh.e eVar;
        sh.e eVar2;
        ij ijVar = this.P5;
        if (ijVar != null) {
            j1 j1Var = this.Ob;
            if (j1Var != null && j1Var.rewindCount != 0 && j1Var.rewindByBackSeek) {
                ijVar.f23197b0 = j1Var.getVideoProgress();
            }
            boolean z10 = true;
            if (this.P5.U3()) {
                w1 w1Var = this.f30046w2;
                if (w1Var != null && (eVar2 = w1Var.f30705m) != null) {
                    eVar2.p(true);
                }
                w1 w1Var2 = this.f30046w2;
                if (w1Var2 != null && (eVar = w1Var2.f30706n) != null) {
                    eVar.p(true);
                }
            }
            int i7 = this.L1;
            double d11 = 0.0d;
            int i10 = 0;
            i1 i1Var = this.C4;
            if (i7 == 4) {
                if (i1Var != null) {
                    i1Var.a();
                }
                if (this.f30047w3 != null) {
                    if (!PhotoViewer.I1(this.P5)) {
                        if (MediaController.B().f21294v0 == this.P5) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.v5 m10 = this.T0.m();
                if (m10 != null) {
                    ij ijVar2 = this.P5;
                    int i11 = m10.d[4] / 1000;
                    ijVar2.f23224h0 = i11;
                    d10 = i11;
                    TLRPC.Message message = ijVar2.f23237k;
                    if (message.ttl > 0 && message.destroyTime == 0 && !ijVar2.n5() && ij.M4(this.P5.f23237k) && m10.s()) {
                        this.Ra.P(this.P5);
                    }
                } else {
                    d10 = 0.0d;
                }
                if (d10 == 0.0d) {
                    d10 = this.P5.L0();
                }
                if (MediaController.B().I(this.P5)) {
                    d10 -= this.P5.f23197b0 * d10;
                } else if (m10 != null) {
                    if (d10 != 0.0d) {
                        d10 -= m10.o() / 1000;
                    }
                    if (this.Ra != null && m10.o() >= 3000) {
                        this.Ra.z0();
                    }
                }
                if (this.L4 != d10) {
                    String g02 = org.telegram.messenger.g0.g0((int) d10, false, false);
                    this.B3 = (int) Math.ceil(org.telegram.ui.ActionBar.k6.C2.measureText(g02));
                    this.f30047w3 = new StaticLayout(g02, org.telegram.ui.ActionBar.k6.C2, this.B3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.L4 = d10;
                    return;
                }
                return;
            }
            boolean z11 = this.f30068xb;
            pm0 pm0Var = this.D4;
            if (z11) {
                if (this.B4) {
                    if (!pm0Var.f36982f) {
                        pm0Var.g(true, this.P5.f23197b0);
                    }
                } else {
                    if (!i1Var.f34976e) {
                        i1Var.h(this.P5.f23197b0);
                        i1Var.f34987q = this.P5.f23210e0;
                    }
                    i1Var.a();
                }
                TLRPC.Document F0 = this.P5.F0();
                if (F0 != null) {
                    for (int i12 = 0; i12 < F0.attributes.size(); i12++) {
                        TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i12);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                            d2 = documentAttribute.duration;
                            break;
                        }
                    }
                }
                d2 = 0.0d;
                long j3 = this.f29940nc;
                if (j3 >= 0) {
                    d2 = j3;
                } else if (MediaController.B().I(this.P5)) {
                    d2 = Math.max(0.0d, d2 - this.P5.f23220g0);
                }
                if (this.L4 != d2) {
                    this.L4 = d2;
                    String g03 = org.telegram.messenger.g0.g0((int) d2, true, false);
                    this.M4 = (int) Math.ceil(org.telegram.ui.ActionBar.k6.T2.measureText(g03));
                    this.K4 = new StaticLayout(g03, org.telegram.ui.ActionBar.k6.T2, this.M4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float f10 = this.P5.f23197b0;
                if (f10 != 0.0f) {
                    this.Jb = f10;
                    if (f10 > 0.9f) {
                        this.Jb = 1.0f;
                    }
                }
                invalidate();
            } else if (this.M1 != null) {
                if (this.B4) {
                    if (!pm0Var.f36982f) {
                        pm0Var.g(true, this.P5.f23197b0);
                    }
                    z9 = true;
                } else {
                    if (!i1Var.f34976e) {
                        i1Var.h(this.P5.f23197b0);
                        i1Var.f34987q = this.P5.f23210e0;
                    }
                    i1Var.j(this.P5);
                    z9 = false;
                }
                int i13 = this.L1;
                if (i13 == 5) {
                    z9 = true;
                }
                if (i13 == 3) {
                    long j10 = this.f29940nc;
                    if (j10 >= 0) {
                        d = j10;
                    } else if (!MediaController.B().I(this.P5)) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= this.M1.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute2 = this.M1.attributes.get(i14);
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                d11 = documentAttribute2.duration;
                                break;
                            }
                            i14++;
                        }
                        d = d11;
                    } else {
                        d = this.P5.f23220g0;
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
                        i10 = this.P5.f23220g0;
                    }
                    double d12 = i10;
                    if (this.L4 != d12) {
                        this.L4 = d12;
                        this.K4 = new StaticLayout(org.telegram.messenger.g0.k0(i10, (int) L0), org.telegram.ui.ActionBar.k6.N2, (int) Math.ceil(org.telegram.ui.ActionBar.k6.N2.measureText(k02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                    z10 = z9;
                }
                if (z10) {
                    invalidate();
                }
            }
        }
    }

    public final boolean S(MotionEvent motionEvent) {
        y yVar;
        q1 q1Var;
        l1 l1Var;
        TLRPC.Chat chat;
        int i7;
        TLRPC.Chat chat2;
        if (this.f29890j9 && this.U8 != null && (yVar = this.U2) != null && (this.f29879ia != null || this.f29891ja != null)) {
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
                        TLRPC.User user = this.f30002sa;
                        if (user != null && user.bot_inline_placeholder == null) {
                            l1Var.W1(this, user.f27101id);
                        } else {
                            String n10 = t10.n(user);
                            l1 l1Var2 = this.Ra;
                            if (n10 == null) {
                                n10 = this.P5.f23237k.via_bot_name;
                            }
                            l1Var2.m0(n10);
                        }
                    } else {
                        TLRPC.User user2 = this.f29879ia;
                        if (user2 != null) {
                            l1Var.s0(this, user2, motionEvent.getX(), M1(motionEvent));
                        } else {
                            TLRPC.Chat chat3 = this.f29891ja;
                            if (chat3 != null) {
                                TLRPC.MessageFwdHeader messageFwdHeader = this.P5.f23237k.fwd_from;
                                if (messageFwdHeader != null) {
                                    int i10 = messageFwdHeader.channel_post;
                                    chat = this.f30014ta;
                                    i7 = i10;
                                } else {
                                    chat = chat3;
                                    i7 = 0;
                                }
                                if (chat != null) {
                                    chat2 = chat;
                                } else {
                                    chat2 = chat3;
                                }
                                q1Var = this;
                                l1Var.U(q1Var, chat2, i7, this.f29845g1, this.f29859h1, false);
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
        ij ijVar;
        float f10;
        ij ijVar2 = this.P5;
        if ((ijVar2 == null || !ijVar2.s4()) && (ijVar = this.P5) != null && !ijVar.p4()) {
            ij ijVar3 = this.P5;
            if (ijVar3.D != 27 && !ijVar3.o4() && this.l1 != null) {
                if (this.f29918m1 || this.n1) {
                    aj ajVar = this.L;
                    if (ajVar != null) {
                        int i7 = ajVar.f21451l;
                        if ((i7 & 8) == 0 || (i7 & 1) == 0) {
                            return;
                        }
                    }
                    canvas.save();
                    float y10 = getY() + getPaddingTop();
                    dj djVar = this.K;
                    if (djVar != null && djVar.d.size() > 1) {
                        f10 = (getTop() + this.K.f22012m.f21825f) - getTranslationY();
                    } else {
                        f10 = y10 + this.f29868hb.f30807k0;
                    }
                    canvas.translate(this.Z6 - getCompactSideMenuShift(), f10 + this.Gc);
                    this.l1.a(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final ImageReceiver S1(int i7) {
        TLRPC.PollAnswer pollAnswer;
        sh.e eVar;
        sh.e eVar2;
        ij ijVar = this.P5;
        if (ijVar != null && ijVar.D == 17) {
            if (i7 == -2) {
                w1 w1Var = this.f30046w2;
                if (w1Var != null && (eVar2 = w1Var.f30705m) != null) {
                    return eVar2.f55206b;
                }
                return null;
            } else if (i7 == -3) {
                w1 w1Var2 = this.f30046w2;
                if (w1Var2 != null && (eVar = w1Var2.f30706n) != null) {
                    return eVar.f55206b;
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
                        uh.b bVar = p1Var.f29727x;
                        if (bVar != null && (pollAnswer = p1Var.f29723s) != null && pollAnswer.unshuffled_index == i7) {
                            return bVar.f56808c;
                        }
                    }
                }
            }
        }
        l4 l4Var = this.W5;
        if (l4Var != null) {
            ArrayList arrayList2 = l4Var.f29489c;
            j4 j4Var = l4Var.f29488b;
            if (j4Var != null && i7 >= 0 && i7 < j4Var.f29351a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) l4Var.f29488b.f29351a.get(i7);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (((k4) arrayList2.get(i11)).E == messageExtendedMedia) {
                        return ((k4) arrayList2.get(i11)).f29420f;
                    }
                }
                return null;
            }
            return null;
        }
        return this.T0;
    }

    public final void S2(boolean z9) {
        int currentBackgroundLeft;
        float f10;
        int L;
        int i7;
        float f11;
        int L2;
        int currentBackgroundLeft2;
        boolean Q3 = this.P5.Q3();
        int i10 = 0;
        x1 x1Var = this.f29868hb;
        if (Q3) {
            if (z9) {
                currentBackgroundLeft2 = (int) (this.M6 + x1Var.f30793h0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            this.f29929n0 = getExtraTextX() + org.telegram.messenger.g0.L(11.0f) + currentBackgroundLeft2;
        } else {
            if (z9) {
                currentBackgroundLeft = (int) (this.M6 + x1Var.f30793h0);
            } else {
                currentBackgroundLeft = getCurrentBackgroundLeft();
            }
            if (this.P5.D == 19) {
                L = 0;
            } else {
                if (!this.B6 && this.J) {
                    f10 = 11.0f;
                } else {
                    f10 = 17.0f;
                }
                L = org.telegram.messenger.g0.L(f10);
            }
            this.f29929n0 = getExtraTextX() + currentBackgroundLeft + L;
        }
        float f12 = 4.0f;
        if (this.S1) {
            this.f29929n0 = org.telegram.messenger.g0.L(11.0f) + this.f29929n0;
            int L3 = org.telegram.messenger.g0.L(14.0f) + this.Ta;
            this.f30005t0 = L3;
            StaticLayout staticLayout = this.f29834f2;
            if (staticLayout != null) {
                this.f30005t0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + L3;
            }
        } else if (this.T1) {
            int L4 = org.telegram.messenger.g0.L(14.0f) + this.Ta;
            this.f30005t0 = L4;
            StaticLayout staticLayout2 = this.f29834f2;
            if (staticLayout2 != null) {
                this.f30005t0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L4;
            }
        } else if (this.P5.D == 19) {
            this.f30005t0 = org.telegram.messenger.g0.L(6.0f) + this.Ta;
            if (!this.P5.O3()) {
                this.f29929n0 = getCurrentBackgroundLeft();
            } else {
                this.f29929n0 -= org.telegram.messenger.g0.L(4.0f);
            }
        } else {
            int L5 = org.telegram.messenger.g0.L(8.0f) + this.Ta;
            this.f30005t0 = L5;
            ij ijVar = this.P5;
            float f13 = 2.0f;
            if (ijVar.D == 36) {
                if (this.f30031v1 && this.f29908l3 != null && O2()) {
                    this.f30005t0 = org.telegram.messenger.k5.C(7.0f, this.f29908l3.b(), this.f30005t0);
                } else {
                    kv kvVar = this.P5.f23284w2;
                    if (kvVar != null && kvVar.Y()) {
                        int i11 = this.f30005t0;
                        if (this.Ta <= 0) {
                            f13 = -3.0f;
                        }
                        this.f30005t0 = org.telegram.messenger.g0.L(f13) + i11;
                    }
                }
            } else {
                if (ijVar.C2 && (i7 = iz.Y0) > 10) {
                    if (i7 < 15) {
                        f13 = 1.0f;
                    }
                    this.f30005t0 = org.telegram.messenger.g0.L(f13) + L5;
                }
                if (this.P5.C2 && this.Ta > 0) {
                    this.f30005t0 = org.telegram.messenger.g0.L(5.0f) + this.f30005t0;
                }
            }
        }
        if (this.P5.s4()) {
            this.f29953p0 = org.telegram.messenger.g0.L(14.0f) + this.f30005t0;
        } else if (this.f30018u1) {
            this.f29953p0 = org.telegram.messenger.g0.L(10.0f) + this.f30005t0;
            this.f30005t0 = org.telegram.messenger.k5.C(13.0f, this.V1, this.f30005t0);
            if (this.f30007t2 && !this.T1 && !this.P5.w3()) {
                this.f30005t0 = org.telegram.messenger.g0.L(44.0f) + this.f30005t0;
            }
        } else {
            this.f29953p0 = org.telegram.messenger.g0.L(10.0f) + this.P5.X5(x1Var) + this.f30005t0;
        }
        if (this.f30018u1) {
            L2 = org.telegram.messenger.g0.L(10.0f) + this.P5.X5(x1Var) + this.f30005t0;
        } else {
            int i12 = this.f29953p0 + this.V1;
            if (this.f30007t2) {
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
        this.f29966q0 = L2;
        this.f29941o0 = this.f29929n0;
        if (this.P5.f23280v2 != 0.0f && this.P7 != null) {
            int L7 = this.f29772a7 - org.telegram.messenger.g0.L(31.0f);
            ij ijVar2 = this.P5;
            int i13 = L7 - ijVar2.f23273t2;
            if (!this.f29786b7) {
                int i14 = this.z9;
                if (ijVar2.Q3()) {
                    i10 = 20;
                }
                i13 = org.telegram.messenger.camera.q.w(i10 + 4, i14, i13);
            }
            if (i13 > 0) {
                this.f29929n0 = (i13 - getExtraTimeX()) + this.f29929n0;
            }
        }
    }

    public final void S3() {
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.R0) {
            return;
        }
        boolean z12 = true;
        if ((!this.f30050w6 && !this.f30036v6 && !isPressed()) || (this.N1 && this.T0.I())) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9 && this.O3 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        RadialProgress2 radialProgress2 = this.P0;
        radialProgress2.o(z10, false);
        if (this.V3 != 0) {
            if (!z9 && this.Q3 == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            radialProgress2.o(z11, true);
        }
        if (!z9 && this.P3 == 0) {
            z12 = false;
        }
        this.Q0.o(z12, false);
    }

    public final boolean T(MotionEvent motionEvent) {
        l1 l1Var;
        TLRPC.User user;
        TLRPC.Document document;
        if (this.f29890j9 && this.U8 != null && this.U2 != null && ((this.f29879ia != null || this.f29891ja != null) && this.ma != null && this.f29963pa != null)) {
            boolean contains = this.f29768a3.getBounds().contains((int) motionEvent.getX(), (int) M1(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.f29782b3 = contains;
                if (contains) {
                    this.f29768a3.setHotspot((int) motionEvent.getX(), (int) M1(motionEvent));
                    this.f29768a3.setState(this.M2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.f29782b3 && (l1Var = this.Ra) != null && (user = this.f29879ia) != null) {
                    Drawable drawable = this.f29963pa.f33789f[0];
                    if (drawable instanceof org.telegram.ui.Components.i5) {
                        document = ((org.telegram.ui.Components.i5) drawable).f34445e;
                    } else {
                        document = null;
                    }
                    l1Var.I1(this, user, document, this.f29950oa);
                    p2();
                }
                this.f29768a3.setState(StateSet.NOTHING);
                this.f29782b3 = false;
            }
            return this.f29782b3;
        }
        this.f29782b3 = false;
        return false;
    }

    public final void T0(Canvas canvas, boolean z9, boolean z10, float f10, float f11, float f12, float f13, float f14, boolean z11) {
        boolean z12;
        float L;
        int i7;
        int w02;
        float f15;
        float f16;
        float f17;
        int i10 = 0;
        if (f14 != 1.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        float f18 = (f14 * 0.5f) + 0.5f;
        float f19 = f11 * f14;
        x1 x1Var = this.f29868hb;
        ch.p0 p0Var = this.N;
        if (z9) {
            if (!this.P5.Q3()) {
                xa0 xa0Var = org.telegram.ui.ActionBar.k6.E3;
                if (E3()) {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27928hd, this.Pb);
                } else {
                    if (z11) {
                        i7 = org.telegram.ui.ActionBar.k6.Cb;
                    } else {
                        i7 = org.telegram.ui.ActionBar.k6.f27928hd;
                    }
                    w02 = org.telegram.ui.ActionBar.k6.w0(i7, this.Pb);
                }
                xa0Var.a(w02);
                if (E3()) {
                    f16 = (getPhotoBottom() + this.f30030v0) - org.telegram.messenger.g0.L(9.0f);
                } else {
                    if (!this.F && !this.E) {
                        f15 = 8.5f;
                    } else {
                        f15 = 9.5f;
                    }
                    float L2 = (f10 - org.telegram.messenger.g0.L(f15)) + f12;
                    if (this.f30068xb && !t2()) {
                        if (this.J) {
                            f17 = 4.0f;
                        } else {
                            f17 = 5.0f;
                        }
                        f16 = L2 - ((1.0f - getVideoTranscriptionProgress()) * (p0Var.i(x1Var.L1) + org.telegram.messenger.g0.L(f17)));
                    } else {
                        f16 = L2;
                    }
                }
                if (!this.P5.f23256p1) {
                    i10 = org.telegram.messenger.g0.L(11.0f);
                }
                z.t(xa0Var, f13 + i10, f16 - org.telegram.messenger.g0.L(12.0f));
                xa0Var.setAlpha((int) (f19 * 255.0f));
                if (z12) {
                    canvas.save();
                    canvas.scale(f18, f18, xa0Var.getBounds().centerX(), xa0Var.getBounds().centerY());
                }
                xa0Var.draw(canvas);
                xa0Var.setAlpha(255);
                invalidate();
                if (z12) {
                    canvas.restore();
                }
            }
        } else if (z10 && !this.P5.Q3()) {
            if (!this.P5.f23256p1) {
                i10 = org.telegram.messenger.g0.L(11.0f);
            }
            float f20 = f13 + i10;
            float f21 = 21.5f;
            if (E3()) {
                L = (getPhotoBottom() + this.f30030v0) - org.telegram.messenger.g0.L(21.5f);
            } else {
                if (!this.F && !this.E) {
                    f21 = 20.5f;
                }
                L = (f10 - org.telegram.messenger.g0.L(f21)) + f12;
                if (this.f30068xb) {
                    L -= (1.0f - getVideoTranscriptionProgress()) * p0Var.i(x1Var.L1);
                }
            }
            RectF rectF = this.f29783b4;
            rectF.set(f20, L, org.telegram.messenger.g0.L(14.0f) + f20, org.telegram.messenger.g0.L(14.0f) + L);
            int alpha = org.telegram.ui.ActionBar.k6.f27807b2.getAlpha();
            int i11 = (int) (f19 * 255.0f);
            org.telegram.ui.ActionBar.k6.f27807b2.setAlpha(i11);
            if (z12) {
                canvas.save();
                canvas.scale(f18, f18, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.f27807b2);
            org.telegram.ui.ActionBar.k6.f27807b2.setAlpha(alpha);
            Drawable Y1 = Y1("drawableMsgError");
            z.t(Y1, f20 + org.telegram.messenger.g0.L(6.0f), L + org.telegram.messenger.g0.L(2.0f));
            Y1.setAlpha(i11);
            Y1.draw(canvas);
            Y1.setAlpha(255);
            if (z12) {
                canvas.restore();
            }
        }
    }

    public final float T1(int i7) {
        p1 p1Var;
        if (i7 >= 0) {
            ArrayList arrayList = this.P4;
            if (i7 < arrayList.size()) {
                int i10 = ((p1) arrayList.get(i7)).f29708b;
                int i11 = this.Ta;
                float f10 = i10 + i11;
                x1 x1Var = this.f29868hb;
                if (x1Var.f30849u2) {
                    float f11 = x1Var.L1;
                    f10 += ((1.0f - f11) * x1Var.f30852v2) + (i11 * f11);
                    if (this.P5.o5()) {
                        f10 -= this.Ta;
                    }
                }
                if (x1Var.f30858x0) {
                    f10 += x1Var.f30807k0;
                }
                return f10 + p1Var.f29709c + org.telegram.messenger.g0.L(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void T3() {
        float f10;
        int i7;
        float f11;
        int i10;
        if (!this.P5.P5()) {
            return;
        }
        ch.p0 p0Var = this.N;
        if (!p0Var.f6373p) {
            aj ajVar = this.L;
            if (ajVar != null) {
                int i11 = ajVar.f21451l;
                if ((i11 & 8) == 0 || (i11 & 1) == 0) {
                    return;
                }
            }
            ij ijVar = this.P5;
            int i12 = 0;
            if (ijVar.D != 19 && !ijVar.H2() && !this.P5.N2()) {
                float f12 = 11.0f;
                if (this.P5.Q3()) {
                    p0Var.f6361b = org.telegram.messenger.g0.L(11.0f) + getCurrentBackgroundLeft();
                } else if (this.f30068xb) {
                    int L = org.telegram.messenger.g0.L(11.0f) + getCurrentBackgroundLeft();
                    if (!this.J) {
                        i10 = 6;
                    } else {
                        i10 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(getVideoTranscriptionProgress(), 0, i10)) + L;
                    p0Var.f6361b = L2;
                    p0Var.f6361b = L2 - ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(9.0f)));
                } else {
                    int L3 = org.telegram.messenger.g0.L((this.B6 || !this.J) ? 17.0f : 17.0f) + getCurrentBackgroundLeft();
                    p0Var.f6361b = L3;
                    if (this.B6) {
                        p0Var.f6361b = L3 - org.telegram.messenger.g0.L(9.0f);
                    }
                }
            } else if (this.P5.Q3()) {
                p0Var.f6361b = (getMeasuredWidth() - p0Var.f6372o) - org.telegram.messenger.g0.L(16.0f);
            } else {
                p0Var.f6361b = getCurrentBackgroundLeft();
            }
            if (t2()) {
                float compactLeft = getCompactLeft();
                if (s2()) {
                    f11 = this.f29817dd;
                } else if (this.K != null && this.L != null) {
                    f11 = getLeft();
                } else {
                    f11 = 0.0f;
                }
                p0Var.f6361b = (int) (compactLeft - f11);
            }
            if (!this.P5.Q3() && this.L != null && !t2()) {
                float f13 = p0Var.f6361b;
                if (Y2()) {
                    i7 = 48;
                } else {
                    i7 = 0;
                }
                p0Var.f6361b = (int) (f13 - (org.telegram.messenger.g0.L(64 - i7) * this.Y6));
            }
            int backgroundDrawableBottom = (getBackgroundDrawableBottom() - org.telegram.messenger.g0.L(10.0f)) - p0Var.f6370m;
            p0Var.f6362c = backgroundDrawableBottom;
            if (this.f30051w7) {
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
            p0Var.f6362c = i13;
            if (this.f29786b7 && (!this.f29989r9 || !this.Q1 || this.L1 != 3)) {
                p0Var.f6362c = i13 - org.telegram.messenger.g0.L(16.0f);
            }
            ij ijVar2 = this.P5;
            int i14 = ijVar2.D;
            if (i14 != 9 && this.f29908l3 != null && ((i14 != 2 && i14 != 17 && (!ijVar2.O3() || !this.f29989r9 || this.N1)) || ((this.L != null && this.K != null) || this.P5.D == 29))) {
                p0Var.f6362c -= org.telegram.messenger.g0.L(14.0f);
            }
            p0Var.f6362c += p0Var.f6368k;
        }
    }

    public final boolean U(org.telegram.messenger.ij r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.U(org.telegram.messenger.ij):boolean");
    }

    public final void U0(Canvas canvas, float f10) {
        int i7;
        if (this.E8 == 3) {
            int L = org.telegram.messenger.g0.L(32.0f);
            if (this.f29924m7 != null) {
                this.R8 -= org.telegram.messenger.g0.L(18.0f);
                L += org.telegram.messenger.g0.L(18.0f);
            }
            float f11 = this.Q8;
            float f12 = this.R8 + L;
            RectF rectF = this.f29783b4;
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
                    int alpha2 = org.telegram.ui.ActionBar.k6.f27918h2.getAlpha();
                    org.telegram.ui.ActionBar.k6.f27918h2.setAlpha((int) (alpha2 * f10));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.f27918h2);
                    org.telegram.ui.ActionBar.k6.f27918h2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.f27918h2);
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
            if (this.f29924m7 != null) {
                TextPaint textPaint = org.telegram.ui.ActionBar.k6.E2;
                if (t2()) {
                    i7 = org.telegram.ui.ActionBar.k6.Ta;
                } else {
                    i7 = org.telegram.ui.ActionBar.k6.Ld;
                }
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i7, this.Pb));
                org.telegram.ui.ActionBar.k6.E2.setAlpha((int) (f10 * 255.0f));
                x1 x1Var = this.f29868hb;
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
                canvas.translate(this.Q8 + ((org.telegram.messenger.g0.L(32.0f) - this.f30024u7) / 2), this.R8 + org.telegram.messenger.g0.L(30.0f));
                this.f29924m7.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final float U1(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.P4;
            if (i7 < arrayList.size()) {
                int i10 = ((p1) arrayList.get(i7)).f29708b;
                int i11 = this.Ta;
                float f10 = i10 + i11;
                x1 x1Var = this.f29868hb;
                if (x1Var.f30849u2) {
                    float f11 = x1Var.L1;
                    f10 += ((1.0f - f11) * x1Var.f30852v2) + (i11 * f11);
                    if (this.P5.o5()) {
                        f10 -= this.Ta;
                    }
                }
                if (x1Var.f30858x0) {
                    f10 += x1Var.f30807k0;
                }
                return f10 - org.telegram.messenger.g0.L(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void U3(ij ijVar) {
        String str;
        CharSequence concat;
        int i7;
        if (ijVar != null && ijVar.n5()) {
            int i10 = 0;
            if (!ijVar.m4()) {
                concat = null;
            } else {
                TLRPC.Message message = ijVar.f23237k;
                int i11 = message.ttl;
                if (i11 == Integer.MAX_VALUE) {
                    if (ijVar.W2 == null) {
                        ijVar.W2 = new SpannableString("v");
                        wp wpVar = new wp(2131231979, 0);
                        wpVar.f40062r = -org.telegram.messenger.g0.L(3.0f);
                        wpVar.E = org.telegram.messenger.g0.L(13.0f);
                        SpannableString spannableString = ijVar.W2;
                        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
                    }
                    concat = TextUtils.concat(ijVar.W2, "1");
                } else {
                    int i12 = message.destroyTime;
                    if (i12 != 0) {
                        i11 = Math.max(0, i12 - ConnectionsManager.getInstance(ijVar.I1).getCurrentTime());
                    }
                    if (i11 < 60) {
                        str = com.google.android.recaptcha.internal.a.i(i11, "s");
                    } else {
                        str = (i11 / 60) + "m";
                    }
                    if (ijVar.X2 == null) {
                        ijVar.X2 = new SpannableString("p");
                        wp wpVar2 = new wp(2131232549, 0);
                        wpVar2.f40062r = org.telegram.messenger.g0.L(1.0f);
                        wpVar2.E = org.telegram.messenger.g0.L(13.0f);
                        SpannableString spannableString2 = ijVar.X2;
                        spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 33);
                    }
                    concat = TextUtils.concat(ijVar.X2, str);
                }
            }
            CharSequence charSequence = concat;
            if (charSequence != null) {
                if (charSequence instanceof String) {
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.k6.C2.measureText((String) charSequence));
                    this.B3 = ceil;
                    this.f30047w3 = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.k6.C2, ceil, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.C2, this.B3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else {
                    TextPaint textPaint = org.telegram.ui.ActionBar.k6.D2;
                    if (getMeasuredWidth() > 0) {
                        i7 = getMeasuredWidth();
                    } else {
                        i7 = 9999;
                    }
                    StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.f30047w3 = staticLayout;
                    if (staticLayout.getLineCount() > 0) {
                        i10 = (int) this.f30047w3.getLineWidth(0);
                    }
                    this.B3 = i10;
                }
                invalidate();
            }
        }
    }

    public final boolean V(MotionEvent motionEvent) {
        int i7;
        aj ajVar;
        boolean z9;
        Drawable drawable;
        Drawable drawable2;
        int L;
        int i10;
        int L2;
        int i11;
        if ((!v2() || this.P5.D == 16) && (((i7 = this.L1) != 5 && i7 != 1) || (ajVar = this.L) == null || (ajVar.f21451l & 4) != 0)) {
            int i12 = this.P5.D;
            if (i12 == 16) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z10 = z9;
            if (!z9) {
                if ((i7 == 1 || i12 == 12 || i7 == 5 || i7 == 4 || i7 == 2 || i12 == 8) && !this.S1 && !this.T1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                int x10 = (int) motionEvent.getX();
                int M1 = (int) M1(motionEvent);
                int action = motionEvent.getAction();
                Drawable[] drawableArr = this.I2;
                if (action == 0) {
                    ij ijVar = this.P5;
                    if (ijVar.D == 16) {
                        boolean K4 = ijVar.K4();
                        int i13 = this.R3;
                        if (x10 >= i13) {
                            if (hd.f22871a0) {
                                L = 0;
                            } else {
                                L = this.f29772a7 - org.telegram.messenger.g0.L(70.0f);
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
                                        if (hd.f22871a0) {
                                            L2 = 0;
                                        } else {
                                            L2 = this.f29772a7 - org.telegram.messenger.g0.L(70.0f);
                                        }
                                        int i16 = i15 + L2;
                                        if (!K4) {
                                            i11 = 2;
                                        } else {
                                            i11 = 0;
                                        }
                                        int L3 = org.telegram.messenger.g0.L(i11) + i16;
                                        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.k6.G4;
                                        int w10 = f1.w(2, L3, drawableArr2[K4 ? 1 : 0]);
                                        int f10 = f1.f(2, this.S3, drawableArr2[K4 ? 1 : 0]);
                                        drawableArr[0].setBounds(w10 - org.telegram.messenger.g0.L(20.0f), f10 - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f) + w10, org.telegram.messenger.g0.L(20.0f) + f10);
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
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P4;
            if (i7 < arrayList.size()) {
                TLRPC.PollAnswer pollAnswer = ((p1) arrayList.get(i7)).f29723s;
                if (pollAnswer != null && Arrays.equals(pollAnswer.option, bArr)) {
                    return i7;
                }
                i7++;
            } else {
                return -1;
            }
        }
    }

    public xh.e V2() {
        return xh.e.e(this);
    }

    public final void V3() {
        int i7;
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
            i7 = 10;
        } else {
            i7 = 0;
        }
        int i19 = -org.telegram.messenger.g0.L(i7 + 92);
        x1 x1Var = this.f29868hb;
        boolean z9 = x1Var.f30858x0;
        i1 i1Var = this.C4;
        pm0 pm0Var = this.D4;
        float f11 = 10.0f;
        if (z9 && ((i14 = this.L1) == 3 || i14 == 7)) {
            int i20 = this.f29772a7;
            float f12 = i20;
            int i21 = (int) ((f12 - x1Var.f30812l0) + x1Var.m0);
            int i22 = (int) ((f12 - x1Var.f30793h0) + x1Var.f30798i0);
            if (this.f30068xb && !this.H6) {
                i22 = (int) ((getVideoTranscriptionProgress() * org.telegram.messenger.g0.L(8.0f)) + i22);
                i21 += org.telegram.messenger.g0.L(8.0f);
            }
            if (x1Var.f30812l0 == 0.0f && x1Var.m0 == 0.0f) {
                i21 = i22;
            }
            if (pm0Var != null) {
                if (x1Var.f30824o1) {
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
                    pm0Var.h(L2, L3, i24, i25 + i18);
                } else {
                    int L4 = (i22 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.Q1) {
                        f11 = 0.0f;
                    }
                    pm0Var.h(L4 - org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(30.0f), (i20 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress())), (i21 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress())));
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
        if (pm0Var != null) {
            if (x1Var.f30824o1) {
                int L5 = (this.f29772a7 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress()));
                if (this.Q1) {
                    f10 = 10.0f;
                } else {
                    f10 = 0.0f;
                }
                int L6 = L5 - org.telegram.messenger.g0.L(f10);
                int L7 = org.telegram.messenger.g0.L(30.0f);
                int i26 = this.f29772a7 + i19;
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
                int i28 = this.f29772a7 + i19;
                if (this.H4) {
                    i13 = -org.telegram.messenger.g0.L(34.0f);
                } else {
                    i13 = 0;
                }
                pm0Var.h(L6, L7, L8, i28 + i13);
            } else {
                int L9 = (this.f29772a7 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.Q1) {
                    f11 = 0.0f;
                }
                int L10 = L9 - org.telegram.messenger.g0.L(f11);
                pm0Var.h(L10, org.telegram.messenger.g0.L(30.0f), L10, L10);
            }
        }
        if (i1Var != null) {
            int useTranscribeButtonProgress2 = this.f29772a7 - ((int) (getUseTranscribeButtonProgress() * org.telegram.messenger.g0.L(34.0f)));
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

    public final boolean W(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.W(android.view.MotionEvent):boolean");
    }

    public final void W0(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.W0(android.graphics.Canvas):void");
    }

    public final void W2(org.telegram.messenger.ij r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.W2(org.telegram.messenger.ij):void");
    }

    public final void W3() {
        char c10;
        int L;
        int extraTextX;
        int i7;
        int i10;
        int L2;
        int i11;
        if (getDelegate() != null && getDelegate().k2() != null && getDelegate().k2().z(this.P5)) {
            j9 k22 = getDelegate().k2();
            int i12 = 0;
            if (k22.f29374q0) {
                c10 = 2;
            } else if (k22.f29376s0) {
                c10 = 3;
            } else if (k22.f29378u0) {
                c10 = 4;
            } else if (c2()) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            if (c10 == 2) {
                if (this.S1) {
                    i11 = this.f29941o0 - org.telegram.messenger.g0.L(10.0f);
                } else {
                    if (this.T1) {
                        i10 = this.f29941o0;
                        L2 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i10 = this.f29941o0;
                        L2 = org.telegram.messenger.g0.L(1.0f);
                    }
                    i11 = i10 + L2;
                }
                getDelegate().k2().c0(org.telegram.messenger.g0.L(10.0f) + i11 + this.Z1, this.X1);
            } else if (c10 == 1) {
                O3();
                getDelegate().k2().c0((int) this.f29983r3, (int) this.f29997s3);
            } else if (c10 == 3) {
                dj djVar = this.K;
                if (djVar != null && !djVar.f22008i) {
                    i7 = (int) this.f29983r3;
                } else {
                    float f10 = 12.0f;
                    if (this.P5.Q3()) {
                        i7 = getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + this.M6;
                        if (this.P5.D == 19) {
                            i7 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(this.W7, this.Y7) + i7)) - org.telegram.messenger.g0.f22537q.x);
                        }
                    } else {
                        if (this.B6) {
                            L = org.telegram.messenger.g0.L(12.0f) + this.M6;
                            extraTextX = getExtraTextX();
                        } else {
                            int i13 = this.M6;
                            if (!this.J) {
                                f10 = 18.0f;
                            }
                            L = org.telegram.messenger.g0.L(f10) + i13;
                            extraTextX = getExtraTextX();
                        }
                        i7 = extraTextX + L;
                    }
                }
                int L3 = ((int) (i7 + this.f29868hb.f30793h0)) - org.telegram.messenger.g0.L(1.33f);
                int i14 = this.f29966q0;
                O3();
                j9 k23 = getDelegate().k2();
                int L4 = org.telegram.messenger.g0.L(10.0f) + L3;
                s1 s1Var = this.f29980r0;
                if (s1Var != null) {
                    i12 = s1Var.f30244o;
                }
                k23.c0(L4 - i12, org.telegram.messenger.g0.L(22.0f) + i14);
            } else {
                getDelegate().k2().c0(this.f29929n0, this.f30005t0);
            }
        }
    }

    public final boolean X(MotionEvent motionEvent) {
        fr0 N1;
        l1 l1Var = this.Ra;
        if (l1Var == null) {
            N1 = null;
        } else {
            N1 = l1Var.N1();
        }
        fr0 fr0Var = N1;
        int i7 = 0;
        if (this.P5 != null) {
            di.z2 z2Var = this.T0;
            if (z2Var.L() && fr0Var != null && !this.P5.u4() && !this.P5.H2() && ((!ij.M4(this.P5.f23237k) || this.G5) && !this.f30068xb && !this.P5.K2() && ((!this.P5.V2() || ij.u3(this.P5.f23237k)) && !this.P5.n5()))) {
                ij ijVar = this.P5;
                xh.e eVar = this.P9;
                if (eVar != null) {
                    Integer num = (Integer) eVar.f58692k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    i7 = num.intValue();
                }
                return fr0Var.a(motionEvent, this, z2Var, ijVar, i7);
            }
        }
        return false;
    }

    public final void X0(Canvas canvas) {
        float f10;
        q1 q1Var;
        Canvas canvas2;
        if (this.f29869hc || this.f29881ic) {
            aj ajVar = this.L;
            if (ajVar == null || (ajVar.f21444c == 0 && ajVar.f21442a == 0)) {
                int compactHeaderColor = getCompactHeaderColor();
                f29763id.setColor(compactHeaderColor);
                f29764jd.setColor(compactHeaderColor);
                float compactLeft = getCompactLeft();
                if (this.I) {
                    f10 = 9.0f;
                } else {
                    f10 = 10.0f;
                }
                float L = org.telegram.messenger.g0.L(f10);
                if (this.f29869hc) {
                    q1Var = this;
                    canvas2 = canvas;
                    q1Var.Z0(canvas2, this.fc, compactLeft, L, compactHeaderColor);
                    L += org.telegram.messenger.g0.L(24.0f);
                } else {
                    q1Var = this;
                    canvas2 = canvas;
                }
                if (q1Var.f29881ic) {
                    q1Var.Z0(canvas2, q1Var.f29856gc, compactLeft, L, compactHeaderColor);
                }
            }
        }
    }

    public final int X1(int i7) {
        return org.telegram.ui.ActionBar.k6.w0(i7, this.Pb);
    }

    public final float X2() {
        float f10;
        x1 x1Var = this.f29868hb;
        float f11 = 1.0f;
        if (x1Var.G1) {
            boolean z9 = this.f30031v1;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (!z9) {
                f11 = 0.0f;
            }
            return org.telegram.messenger.g0.T1(f10, f11, x1Var.L1);
        } else if (this.f30031v1) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public final void X3(int i7, int i10) {
        ArrayList arrayList;
        gj gjVar = this.f29908l3;
        x1 x1Var = this.f29868hb;
        if (gjVar != null && (arrayList = gjVar.f22653e) != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                fj fjVar = (fj) obj;
                ArrayList arrayList2 = fjVar.f22397y;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    ((xh.f) obj2).i((i7 - fjVar.p(this.f29908l3.f22653e, x1Var)) - this.f29983r3, getWidth(), (i10 - fjVar.p(this.f29908l3.f22653e, x1Var)) - this.f29997s3);
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
                ((xh.f) obj3).i(i7 + height, getWidth(), i10 + height);
            }
        }
        if (getMessageObject() != null && getMessageObject().f23296z2 != null) {
            ArrayList arrayList4 = getMessageObject().f23296z2;
            int size4 = arrayList4.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList4.get(i14);
                i14++;
                fj fjVar2 = (fj) obj4;
                ArrayList arrayList5 = fjVar2.f22397y;
                int size5 = arrayList5.size();
                int i15 = 0;
                while (i15 < size5) {
                    Object obj5 = arrayList5.get(i15);
                    i15++;
                    ((xh.f) obj5).i((i7 - fjVar2.p(getMessageObject().f23296z2, x1Var)) - this.f30005t0, getWidth(), (i10 - fjVar2.p(getMessageObject().f23296z2, x1Var)) - this.f30005t0);
                }
            }
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            invalidate();
            p2();
        }
    }

    public final Drawable Y1(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.f6 f6Var = this.Pb;
        if (f6Var != null) {
            drawable = f6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.k6.R0(str);
    }

    public final boolean Y2() {
        if (t2()) {
            return false;
        }
        return Z2();
    }

    public void Y3() {
        int i7;
        ij ijVar = this.P5;
        if (ijVar == null) {
            return;
        }
        float f10 = this.Uc + this.Vc;
        if (!ijVar.Q3() || this.P5.B2) {
            f10 += this.f29967q1;
        }
        if (t2()) {
            f10 += getCompactSideMenuShift();
        } else if (this.W6 && !this.P5.Q3() && this.L != null) {
            if (Y2()) {
                i7 = 48;
            } else {
                i7 = 0;
            }
            f10 += org.telegram.messenger.g0.L(71 - i7) * this.Y6;
        }
        setTranslationX(f10);
    }

    public final void Z() {
        sh.e eVar;
        sh.e eVar2;
        ij ijVar = this.P5;
        if (ijVar != null && ijVar.U3()) {
            w1 w1Var = this.f30046w2;
            if (w1Var != null && (eVar2 = w1Var.f30706n) != null) {
                eVar2.e();
            }
            w1 w1Var2 = this.f30046w2;
            if (w1Var2 != null && (eVar = w1Var2.f30705m) != null) {
                eVar.e();
            }
        }
    }

    public final void Z0(Canvas canvas, m1 m1Var, float f10, float f11, int i7) {
        int i10;
        int intrinsicWidth;
        int intrinsicHeight;
        boolean z9;
        int L = org.telegram.messenger.g0.L(16.0f);
        RectF rectF = m1Var.d;
        ImageReceiver imageReceiver = m1Var.f29531b;
        boolean z10 = m1Var.f29530a;
        float f12 = L;
        rectF.set(f10, f11, m1Var.f29537j + f10, f11 + f12);
        canvas.save();
        float a10 = m1Var.f29533e.a(0.02f);
        RectF rectF2 = m1Var.d;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.15f, i7);
        y yVar = m1Var.f29538k;
        if (yVar == null) {
            m1Var.f29539l = r12;
            y a02 = org.telegram.ui.ActionBar.k6.a0(r12, 6, 6);
            m1Var.f29538k = a02;
            a02.setCallback(this);
        } else if (m1Var.f29539l != r12) {
            m1Var.f29539l = r12;
            org.telegram.ui.ActionBar.k6.H1(yVar, r12, true);
        }
        m1Var.f29538k.setBounds((int) (rectF2.left - org.telegram.messenger.g0.L(6.0f)), (int) (rectF2.top - org.telegram.messenger.g0.L(4.0f)), (int) (rectF2.right + org.telegram.messenger.g0.L(6.0f)), (int) (rectF2.bottom + org.telegram.messenger.g0.L(4.0f)));
        m1Var.f29538k.draw(canvas);
        if (!z10) {
            l1 l1Var = this.Ra;
            if (l1Var != null && l1Var.p1(this, 0)) {
                z9 = true;
            } else {
                z9 = false;
            }
            a1(canvas, m1Var, i7, z9);
        }
        if (this.f29917lc == null) {
            this.f29917lc = getContext().getResources().getDrawable(2131232332).mutate();
        }
        if (z10) {
            i10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cd, this.Pb);
        } else {
            i10 = i7;
        }
        this.f29917lc.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        int i11 = (int) (((L - intrinsicWidth) / 2.0f) + f10);
        int i12 = (int) (((L - intrinsicHeight) / 2.0f) + f11);
        this.f29917lc.setBounds(i11, i12, this.f29917lc.getIntrinsicWidth() + i11, this.f29917lc.getIntrinsicHeight() + i12);
        canvas.save();
        if (!z10) {
            float f13 = f12 / 2.0f;
            canvas.scale(-1.0f, 1.0f, f10 + f13, f13 + f11);
        }
        this.f29917lc.draw(canvas);
        canvas.restore();
        float L2 = f10 + f12 + org.telegram.messenger.g0.L(6.0f);
        if (m1Var.f29534f != null) {
            f29763id.setColor(i10);
            Y0(canvas, m1Var.f29534f, L2, f11);
            f29763id.setColor(i7);
            L2 += org.telegram.messenger.g0.L(4.0f) + K1(m1Var.f29534f);
        }
        if (m1Var.f29536i) {
            imageReceiver.y0(L2, f11, f12, f12);
            imageReceiver.setAlpha(1.0f);
            imageReceiver.h(canvas, null);
            L2 += org.telegram.messenger.g0.L(5.0f) + L;
        }
        StaticLayout staticLayout = m1Var.f29535g;
        if (staticLayout != null) {
            if (z10) {
                staticLayout.getPaint().setColor(i0.a.k(org.telegram.ui.ActionBar.k6.r1(0.7f, i10), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28168ua, this.Pb)));
            }
            Y0(canvas, m1Var.f29535g, L2, f11);
            if (z10) {
                m1Var.f29535g.getPaint().setColor(i7);
            }
            L2 += org.telegram.messenger.g0.L(4.0f) + K1(m1Var.f29535g);
        }
        if (m1Var.h != null) {
            canvas.save();
            canvas.translate(L2 - m1Var.h.getLineLeft(0), ((L - m1Var.h.getHeight()) / 2.0f) + f11);
            if (z10) {
                m1Var.h.draw(canvas);
            } else {
                StaticLayout staticLayout2 = m1Var.h;
                AtomicReference atomicReference = this.f29927mc;
                ArrayList arrayList = this.Sb;
                xh.f.g(this, this.m0, i7, -org.telegram.messenger.g0.L(2.0f), atomicReference, 0, staticLayout2, arrayList, canvas, false);
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, m1Var.h, this.Aa, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, I1(2, i7));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public Paint Z1(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.f6 f6Var = this.Pb;
        if (f6Var != null) {
            paint = f6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.k6.V0(str);
    }

    public final boolean Z2() {
        ij ijVar;
        if (!this.f29824e6 || this.f29864h6 || ((this.G6 && !this.f29900k6) || (ijVar = this.P5) == null || ijVar.Q3() || !this.P5.l5())) {
            ij ijVar2 = this.P5;
            if (ijVar2 == null || ij.B0(ijVar2.f23237k) != 489000) {
                ij ijVar3 = this.P5;
                if (ijVar3 == null || !ijVar3.f23236j2) {
                    if (ijVar3 != null && ijVar3.f23237k.guestchat_via_from != null) {
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

    public final void Z3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.Z3():void");
    }

    @Override
    public final void a(float f10) {
        ij ijVar = this.P5;
        if (ijVar == null) {
            return;
        }
        ijVar.f23197b0 = f10;
        MediaController.B().i0(this.P5, f10);
        R3();
    }

    public final void a0(boolean z9) {
        ij ijVar;
        boolean z10;
        ij ijVar2;
        byte[] bArr;
        w1 w1Var = this.f30046w2;
        if (w1Var != null && w1Var.f30703k != null && (ijVar = this.P5) != null && ijVar.U3()) {
            TLRPC.MessageMedia n1 = ij.n1(this.P5);
            boolean z11 = false;
            if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                z10 = ((TLRPC.TL_messageMediaPoll) n1).poll.multiple_choice;
            } else {
                z10 = false;
            }
            uh.d dVar = this.f30046w2.f30703k;
            if (z10) {
                gz C = gz.C(this.Z5);
                if (this.P5 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C.f22759w.get("poll_" + ijVar2.E1());
                }
                if (bArr != null) {
                    z11 = true;
                }
            }
            te.a aVar = dVar.f56821f;
            if (aVar.f55396f != z11) {
                aVar.a(z11, z9);
            }
        }
    }

    public final void a1(Canvas canvas, m1 m1Var, int i7, boolean z9) {
        a80 a80Var;
        a80 a80Var2;
        if (!z9 && m1Var.f29541n) {
            a80 a80Var3 = m1Var.f29540m;
            if (a80Var3 != null) {
                a80Var3.a();
            }
        } else if (z9 && !m1Var.f29541n && (a80Var = m1Var.f29540m) != null) {
            a80Var.f31728c = -1L;
            a80Var.f31727b = -1L;
        }
        m1Var.f29541n = z9;
        float[] fArr = m1Var.f29542o;
        RectF rectF = m1Var.d;
        if (!z9 && ((a80Var2 = m1Var.f29540m) == null || !a80Var2.d())) {
            a80 a80Var4 = m1Var.f29540m;
            if (a80Var4 != null) {
                a80Var4.f31727b = -1L;
                return;
            }
            return;
        }
        if (m1Var.f29540m == null) {
            a80 a80Var5 = new a80();
            m1Var.f29540m = a80Var5;
            a80Var5.D = true;
            a80Var5.f31743t = 3.5f;
            a80Var5.f31744u = 0.5f;
        }
        m1Var.f29540m.g(org.telegram.ui.ActionBar.k6.r1(0.1f, i7), org.telegram.ui.ActionBar.k6.r1(0.3f, i7), org.telegram.ui.ActionBar.k6.r1(0.3f, i7), org.telegram.ui.ActionBar.k6.r1(1.25f, i7));
        Arrays.fill(fArr, org.telegram.messenger.g0.L(6.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(rectF.left - org.telegram.messenger.g0.L(6.0f), rectF.top - org.telegram.messenger.g0.L(4.0f), rectF.right + org.telegram.messenger.g0.L(6.0f), rectF.bottom + org.telegram.messenger.g0.L(4.0f));
        m1Var.f29540m.e(rectF2);
        m1Var.f29540m.j(fArr);
        m1Var.f29540m.f31746x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        m1Var.f29540m.draw(canvas);
        invalidate();
    }

    public final float a2(float f10) {
        float f11;
        float f12;
        if (E3() && this.L1 != 7) {
            return ((getPhotoBottom() + this.f30030v0) - org.telegram.messenger.g0.L(7.3f)) - this.f30079y9.getHeight();
        }
        int i7 = this.f29812d7;
        if (!this.F && !this.E) {
            f11 = 6.5f;
        } else {
            f11 = 7.5f;
        }
        float L = ((i7 - org.telegram.messenger.g0.L(f11)) - this.f30079y9.getHeight()) + f10;
        boolean z9 = this.f30068xb;
        x1 x1Var = this.f29868hb;
        if (z9 && !t2()) {
            if (this.J) {
                f12 = 4.0f;
            } else {
                f12 = 5.0f;
            }
            L -= (1.0f - getVideoTranscriptionProgress()) * (this.N.i(x1Var.L1) + org.telegram.messenger.g0.L(f12));
        }
        dj djVar = this.K;
        if (djVar != null) {
            cj cjVar = djVar.f22012m;
            float f13 = L + cjVar.h;
            if (cjVar.f21828j) {
                return f13 - getTranslationY();
            }
            return f13;
        }
        return (x1Var.f30803j0 - x1Var.f30807k0) + L;
    }

    public final r70 a3() {
        r70 r70Var;
        ArrayList arrayList = this.f30034v4;
        if (!arrayList.isEmpty()) {
            r70Var = (r70) arrayList.get(0);
            arrayList.remove(0);
        } else {
            r70Var = new r70(0);
        }
        r70Var.reset();
        this.f30048w4.add(r70Var);
        return r70Var;
    }

    public final ck0 a4() {
        if (this.P5 != null && O2()) {
            return (ck0) this.P5.f23284w2.f23761g.get(0);
        }
        return null;
    }

    @Override
    public final boolean b() {
        dj djVar = this.K;
        if ((djVar == null || !djVar.f22012m.f21828j) && getAlpha() != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean b0(MotionEvent motionEvent) {
        m1 m1Var;
        m1 m1Var2;
        m1 m1Var3;
        m1 m1Var4;
        l1 l1Var;
        int i7;
        q1 q1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (!this.f29869hc && !this.f29881ic) {
            if (this.P7 != null && (l1Var = this.Ra) != null && l1Var.k0()) {
                float x10 = motionEvent.getX();
                float M1 = M1(motionEvent);
                if (this.P5.Q5()) {
                    i7 = Math.max(this.W7, this.Y7) + this.T7;
                } else {
                    i7 = this.N6 + this.T7;
                }
                if (motionEvent.getAction() == 0) {
                    if (x10 >= this.T7 && x10 <= i7) {
                        float f10 = this.U7;
                        if (M1 >= f10 && M1 <= f10 + this.V7) {
                            this.f29813d8 = true;
                            getParent().requestDisallowInterceptTouchEvent(false);
                            this.f29865h8 = x10;
                            this.f29877i8 = getY() + M1;
                            y yVar = this.Ja;
                            if (yVar != null) {
                                yVar.setHotspot(x10, M1);
                                this.f29826e8 = false;
                                this.f29840f8 = true;
                                postDelayed(new c1(this, 3), ViewConfiguration.getTapTimeout() / 6);
                                invalidate();
                            }
                            ic icVar = this.Ea;
                            if (icVar != null) {
                                icVar.c(true);
                                this.Ha = x10;
                                this.Ia = M1;
                            }
                            u();
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1) {
                        if (this.f29813d8) {
                            n();
                            this.f29813d8 = false;
                            y yVar2 = this.Ja;
                            if (yVar2 != null) {
                                if (!this.f29826e8) {
                                    yVar2.setState(new int[]{16842919, 16842910});
                                    post(new c1(this, 4));
                                } else {
                                    yVar2.setState(new int[0]);
                                }
                                this.f29826e8 = false;
                                this.f29840f8 = false;
                                invalidate();
                            }
                            ic icVar2 = this.Ea;
                            if (icVar2 != null) {
                                icVar2.c(false);
                            }
                            playSoundEffect(0);
                            if (this.f30054wa) {
                                l1 l1Var2 = this.Ra;
                                if (l1Var2 != null) {
                                    TLRPC.Chat chat = this.f30014ta;
                                    if (chat != null) {
                                        l1Var2.U(this, chat, this.P5.f23237k.fwd_from.channel_post, this.f29845g1, this.f29859h1, false);
                                        q1Var = this;
                                    } else {
                                        q1Var = this;
                                        TLRPC.User user = q1Var.f29990ra;
                                        if (user != null) {
                                            l1Var2.s0(this, user, q1Var.f29845g1, q1Var.f29859h1);
                                        } else if (q1Var.f30027ua != null) {
                                            l1Var2.o(this);
                                        }
                                    }
                                }
                            } else {
                                q1Var = this;
                                if (q1Var.Ra != null && (q1Var.P5.C2() || q1Var.P5.g4() || q1Var.L7 || ((message = q1Var.P5.f23237k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                                    q1Var.Ra.R1(q1Var, q1Var.P5.O1(), x10, M1, false);
                                }
                            }
                        }
                    } else {
                        q1Var = this;
                        if (motionEvent.getAction() == 3) {
                            q1Var.f29813d8 = false;
                            q1Var.f29826e8 = false;
                            y yVar3 = q1Var.Ja;
                            if (yVar3 != null) {
                                yVar3.setState(new int[0]);
                            }
                            invalidate();
                            ic icVar3 = q1Var.Ea;
                            if (icVar3 != null) {
                                icVar3.c(false);
                            }
                        } else if (motionEvent.getAction() == 2) {
                            if (x10 >= q1Var.T7 && x10 <= i7) {
                                float f11 = q1Var.U7;
                                if (M1 >= f11 && M1 <= f11 + q1Var.V7) {
                                    if (q1Var.Ja != null && q1Var.f29840f8) {
                                        if (Math.sqrt(Math.pow((getY() + M1) - q1Var.f29877i8, 2.0d) + Math.pow(x10 - q1Var.f29865h8, 2.0d)) > 0.75d) {
                                            q1Var.f29840f8 = false;
                                        }
                                    }
                                }
                            }
                            q1Var.f29813d8 = false;
                            q1Var.f29826e8 = false;
                            q1Var.f29840f8 = false;
                            y yVar4 = q1Var.Ja;
                            if (yVar4 != null) {
                                yVar4.setState(new int[0]);
                            }
                            invalidate();
                            ic icVar4 = q1Var.Ea;
                            if (icVar4 != null) {
                                icVar4.c(false);
                            }
                        }
                    }
                    return q1Var.f29813d8;
                }
                q1Var = this;
                return q1Var.f29813d8;
            }
        } else {
            float x11 = motionEvent.getX();
            float M12 = M1(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                if (this.Ra != null) {
                    if (this.f29869hc && (m1Var4 = this.fc) != null && C2(m1Var4, x11, M12)) {
                        m1Var2 = this.fc;
                    } else if (this.f29881ic && (m1Var3 = this.f29856gc) != null && C2(m1Var3, x11, M12)) {
                        m1Var2 = this.f29856gc;
                    } else {
                        m1Var2 = null;
                    }
                    if (m1Var2 != null && (m1Var2.f29530a || this.Ra.k0())) {
                        this.f29905kc = m1Var2;
                        m1Var2.f29533e.c(true);
                        y yVar5 = m1Var2.f29538k;
                        if (yVar5 != null) {
                            yVar5.setHotspot(x11, M12);
                            m1Var2.f29538k.setState(new int[]{16842919, 16842910});
                        }
                        invalidate();
                        u();
                        return true;
                    }
                }
            } else if (action == 1) {
                m1 m1Var5 = this.f29905kc;
                if (m1Var5 != null) {
                    n();
                    c3();
                    playSoundEffect(0);
                    if (m1Var5.f29530a) {
                        TLRPC.Chat chat2 = this.f30014ta;
                        if (chat2 != null) {
                            this.Ra.U(this, chat2, this.P5.f23237k.fwd_from.channel_post, this.f29845g1, this.f29859h1, false);
                            return true;
                        }
                        TLRPC.User user2 = this.f29990ra;
                        if (user2 != null) {
                            this.Ra.s0(this, user2, this.f29845g1, this.f29859h1);
                            return true;
                        }
                        this.Ra.o(this);
                        return true;
                    }
                    this.Ra.R1(this, this.P5.O1(), x11, M12, false);
                    return true;
                }
            } else {
                if (action == 3) {
                    c3();
                } else if (action == 2 && (m1Var = this.f29905kc) != null && !C2(m1Var, x11, M12)) {
                    n();
                    c3();
                }
                if (this.f29905kc != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b1(Canvas canvas, float f10) {
        gj gjVar;
        ch.p0 p0Var;
        Paint paint;
        m1 m1Var;
        m1 m1Var2;
        if (t2() && this.P5 != null && f10 > 0.0f) {
            if (this.bd == null) {
                this.bd = new Paint(1);
            }
            float compactLeft = getCompactLeft();
            ArrayList arrayList = this.P5.f23296z2;
            if (arrayList != null && !arrayList.isEmpty()) {
                compactLeft = Math.max(compactLeft, this.f29929n0 + this.P5.f23273t2);
            }
            if (this.f29908l3 != null) {
                compactLeft = Math.max(compactLeft, this.f29983r3 + gjVar.f22652c);
            }
            if (this.N1) {
                di.z2 z2Var = this.T0;
                if (z2Var.Q0) {
                    compactLeft = Math.max(compactLeft, z2Var.y());
                }
            }
            if (this.f29890j9 && this.U8 != null) {
                compactLeft = Math.max(compactLeft, getCompactLeft() + this.f29827e9);
            }
            if (this.f29869hc && (m1Var2 = this.fc) != null) {
                compactLeft = Math.max(compactLeft, m1Var2.d.right);
            }
            if (this.f29881ic && (m1Var = this.f29856gc) != null) {
                compactLeft = Math.max(compactLeft, m1Var.d.right);
            }
            if (!this.N.f6373p) {
                compactLeft = Math.max(compactLeft, p0Var.f6361b + p0Var.f6372o);
            }
            if (this.P5.D != 0 && !this.N1) {
                compactLeft = Math.max(compactLeft, getBackgroundDrawableRight() - org.telegram.messenger.g0.L(10.0f));
            }
            if (this.f30079y9 != null) {
                compactLeft = Math.max(compactLeft, this.B9 + this.z9);
            }
            float L = org.telegram.messenger.g0.L(8.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(L, org.telegram.messenger.g0.L(2.0f) + getPaddingTop(), Math.min(compactLeft + L, getMeasuredWidth() - L), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
            this.bd.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28168ua, this.Pb));
            this.bd.setAlpha((int) (paint.getAlpha() * f10));
            float L2 = org.telegram.messenger.g0.L(iz.Y0);
            canvas.drawRoundRect(rectF, L2, L2, this.bd);
        }
    }

    public final int b2(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P4;
            if (i10 < arrayList.size()) {
                TLRPC.TodoItem todoItem = ((p1) arrayList.get(i10)).f29724t;
                if (todoItem != null && todoItem.f27099id == i7) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void b3() {
        ij ijVar = this.P5;
        if (ijVar != null && ijVar.f23296z2 != null) {
            for (int i7 = 0; i7 < this.P5.f23296z2.size(); i7++) {
                fj fjVar = (fj) this.P5.f23296z2.get(i7);
                y yVar = fjVar.S;
                if (yVar != null) {
                    yVar.setCallback(this);
                    fjVar.S.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.f29908l3 != null) {
            for (int i10 = 0; i10 < this.f29908l3.f22653e.size(); i10++) {
                fj fjVar2 = (fj) this.f29908l3.f22653e.get(i10);
                y yVar2 = fjVar2.S;
                if (yVar2 != null) {
                    yVar2.setCallback(this);
                    fjVar2.S.setState(StateSet.NOTHING);
                }
            }
        }
        if (t2()) {
            invalidate();
        }
    }

    public final boolean b4() {
        if (this.P5 != null && O2() && !t2()) {
            if ((TextUtils.isEmpty(this.P5.f23293z) || this.f30031v1) && this.N.f6373p) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void c(boolean z9, boolean z10) {
        this.f30067xa = z9;
        if (z9) {
            this.ya = z10;
        } else {
            this.ya = false;
        }
    }

    public final boolean c0(MotionEvent motionEvent) {
        ij ijVar = this.P5;
        if (ijVar == null || ijVar.f23284w2 == null || ijVar.D != 36) {
            return false;
        }
        float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.f29858h0 + this.f30005t0;
        motionEvent.offsetLocation(-this.f29929n0, -topicSeparatorTopPadding);
        kv kvVar = this.P5.f23284w2;
        l1 l1Var = this.Ra;
        kvVar.E = this;
        kvVar.F = l1Var;
        boolean M = kvVar.M(motionEvent);
        motionEvent.offsetLocation(this.f29929n0, topicSeparatorTopPadding);
        return M;
    }

    public final void c1(android.graphics.Canvas r50, boolean r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.c1(android.graphics.Canvas, boolean):void");
    }

    public final boolean c2() {
        if (this.f29908l3 != null) {
            return true;
        }
        return false;
    }

    public final void c3() {
        m1 m1Var = this.f29905kc;
        if (m1Var != null) {
            y yVar = m1Var.f29538k;
            if (yVar != null) {
                yVar.setState(StateSet.NOTHING);
            }
            this.f29905kc.f29533e.c(false);
            this.f29905kc = null;
            invalidate();
        }
    }

    @Override
    public final void computeScroll() {
        super.computeScroll();
        l0 l0Var = this.f30043w;
        if (l0Var != null) {
            l0Var.b();
        }
    }

    @Override
    public final void d(float f10) {
        ij ijVar = this.P5;
        if (ijVar == null) {
            return;
        }
        ijVar.f23197b0 = f10;
        ijVar.f23220g0 = (int) (ijVar.L0() * f10);
        R3();
    }

    public final boolean d0(int i7, MotionEvent motionEvent) {
        int i10;
        xh.f fVar;
        int i11;
        int i12;
        gj gjVar;
        gj gjVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        dj djVar;
        if (i7 > 15 || getParent() == null) {
            return false;
        }
        boolean z9 = true;
        if (this.P5.A2() && (djVar = this.K) != null && !djVar.f22008i) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                View childAt = viewGroup.getChildAt(i17);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    dj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    aj currentPosition = q1Var.getCurrentPosition();
                    if (currentMessagesGroup != null && currentMessagesGroup.f22002a == this.K.f22002a) {
                        int i18 = currentPosition.f21451l;
                        if ((i18 & 8) != 0 && (i18 & 1) != 0 && q1Var != this) {
                            motionEvent.offsetLocation(getLeft() - q1Var.getLeft(), getTop() - q1Var.getTop());
                            boolean d02 = q1Var.d0(i7 + 1, motionEvent);
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
        x1 x1Var = this.f29868hb;
        if (actionMasked == 0) {
            int i19 = this.f29929n0;
            if (x10 >= i19 && M1 >= (i15 = this.f30005t0)) {
                ij ijVar = this.P5;
                if (x10 <= i19 + ijVar.f23273t2 && M1 <= ijVar.X5(x1Var) + i15) {
                    ArrayList arrayList = this.P5.f23296z2;
                    for (int i20 = 0; i20 < arrayList.size() && ((fj) arrayList.get(i20)).p(this.P5.f23296z2, x1Var) <= M1; i20++) {
                        fj fjVar = (fj) arrayList.get(i20);
                        if (fjVar.l()) {
                            i16 = (int) this.P5.f23280v2;
                        } else {
                            i16 = 0;
                        }
                        ArrayList arrayList2 = fjVar.f22397y;
                        int size = arrayList2.size();
                        int i21 = 0;
                        while (i21 < size) {
                            Object obj = arrayList2.get(i21);
                            i21++;
                            xh.f fVar2 = (xh.f) obj;
                            boolean z10 = z9;
                            if (fVar2.getBounds().contains((x10 - this.f29929n0) + i16, (int) ((M1 - this.f30005t0) - fjVar.p(this.P5.f23296z2, x1Var)))) {
                                this.N5 = fVar2;
                                return z10;
                            }
                            z9 = z10;
                        }
                    }
                }
            }
            boolean z11 = z9;
            if (this.f29908l3 != null) {
                float f10 = x10;
                float f11 = this.f29983r3;
                if (f10 >= f11) {
                    float f12 = M1;
                    float f13 = this.f29997s3;
                    if (f12 >= f13 && f10 <= f11 + gjVar.f22652c && f12 <= f13 + gjVar.c(x1Var)) {
                        ArrayList arrayList3 = this.f29908l3.f22653e;
                        for (int i22 = 0; i22 < arrayList3.size() && ((fj) arrayList3.get(i22)).p(this.f29908l3.f22653e, x1Var) <= f12; i22++) {
                            fj fjVar2 = (fj) arrayList3.get(i22);
                            if (fjVar2.l()) {
                                i14 = (int) this.f29908l3.d;
                            } else {
                                i14 = 0;
                            }
                            ArrayList arrayList4 = fjVar2.f22397y;
                            int size2 = arrayList4.size();
                            int i23 = 0;
                            while (i23 < size2) {
                                Object obj2 = arrayList4.get(i23);
                                i23++;
                                xh.f fVar3 = (xh.f) obj2;
                                ArrayList arrayList5 = arrayList3;
                                float f14 = f10;
                                if (fVar3.getBounds().contains((int) ((f10 - this.f29983r3) + i14), (int) ((f12 - this.f29997s3) - fjVar2.p(this.f29908l3.f22653e, x1Var)))) {
                                    this.N5 = fVar3;
                                    return z11;
                                }
                                arrayList3 = arrayList5;
                                f10 = f14;
                            }
                        }
                    }
                }
            }
            if (this.f29956p3 == null) {
                return false;
            }
            float f15 = x10;
            float f16 = this.f30010t5;
            if (f15 < f16) {
                return false;
            }
            float f17 = M1;
            float f18 = this.f30022u5;
            if (f17 <= f18 || f15 > f16 + gjVar2.f22652c || f17 > f18 + gjVar2.c(x1Var)) {
                return false;
            }
            ArrayList arrayList6 = this.f29956p3.f22653e;
            for (int i24 = 0; i24 < arrayList6.size() && ((fj) arrayList6.get(i24)).p(this.f29956p3.f22653e, x1Var) <= f17; i24++) {
                fj fjVar3 = (fj) arrayList6.get(i24);
                if (fjVar3.l()) {
                    i13 = (int) this.f29956p3.d;
                } else {
                    i13 = 0;
                }
                ArrayList arrayList7 = fjVar3.f22397y;
                int size3 = arrayList7.size();
                int i25 = 0;
                while (i25 < size3) {
                    Object obj3 = arrayList7.get(i25);
                    i25++;
                    xh.f fVar4 = (xh.f) obj3;
                    if (fVar4.getBounds().contains((int) ((f15 - this.f30010t5) + i13), (int) ((f17 - this.f30022u5) - fjVar3.p(this.f29956p3.f22653e, x1Var)))) {
                        this.N5 = fVar4;
                        return z11;
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
            gj gjVar3 = this.f29956p3;
            if (gjVar3 != null) {
                ArrayList arrayList8 = gjVar3.f22653e;
                int size4 = arrayList8.size();
                int i26 = 0;
                while (i26 < size4) {
                    Object obj4 = arrayList8.get(i26);
                    i26++;
                    fj fjVar4 = (fj) obj4;
                    ArrayList arrayList9 = fjVar4.f22397y;
                    int size5 = arrayList9.size();
                    int i27 = 0;
                    while (i27 < size5) {
                        int i28 = i27 + 1;
                        Rect bounds = ((xh.f) arrayList9.get(i27)).getBounds();
                        path.addRect(bounds.left, fjVar4.p(this.f29956p3.f22653e, x1Var) + bounds.top, bounds.right, fjVar4.p(this.f29956p3.f22653e, x1Var) + bounds.bottom, Path.Direction.CW);
                        i27 = i28;
                    }
                }
            }
            gj gjVar4 = this.f29908l3;
            if (gjVar4 != null) {
                ArrayList arrayList10 = gjVar4.f22653e;
                int size6 = arrayList10.size();
                int i29 = 0;
                while (i29 < size6) {
                    Object obj5 = arrayList10.get(i29);
                    i29++;
                    fj fjVar5 = (fj) obj5;
                    ArrayList arrayList11 = fjVar5.f22397y;
                    int size7 = arrayList11.size();
                    int i30 = 0;
                    while (i30 < size7) {
                        int i31 = i30 + 1;
                        Rect bounds2 = ((xh.f) arrayList11.get(i30)).getBounds();
                        path.addRect(bounds2.left, fjVar5.p(this.f29908l3.f22653e, x1Var) + bounds2.top, bounds2.right, fjVar5.p(this.f29908l3.f22653e, x1Var) + bounds2.bottom, Path.Direction.CW);
                        i30 = i31;
                    }
                }
            } else {
                ArrayList arrayList12 = this.P5.f23296z2;
                if (arrayList12 != null) {
                    int size8 = arrayList12.size();
                    int i32 = 0;
                    while (i32 < size8) {
                        Object obj6 = arrayList12.get(i32);
                        i32++;
                        fj fjVar6 = (fj) obj6;
                        ArrayList arrayList13 = fjVar6.f22397y;
                        int size9 = arrayList13.size();
                        int i33 = 0;
                        while (i33 < size9) {
                            int i34 = i33 + 1;
                            Rect bounds3 = ((xh.f) arrayList13.get(i33)).getBounds();
                            path.addRect(bounds3.left, fjVar6.p(this.P5.f23296z2, x1Var) + bounds3.top, bounds3.right, fjVar6.p(this.P5.f23296z2, x1Var) + bounds3.bottom, Path.Direction.CW);
                            i33 = i34;
                        }
                    }
                }
            }
            RectF rectF = this.f29783b4;
            path.computeBounds(rectF, false);
            float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
            this.O5 = true;
            this.N5.f58709q = new c1(this, 8);
            gj gjVar5 = this.f29956p3;
            if (gjVar5 != null) {
                ArrayList arrayList14 = gjVar5.f22653e;
                int size10 = arrayList14.size();
                int i35 = 0;
                while (i35 < size10) {
                    Object obj7 = arrayList14.get(i35);
                    i35++;
                    fj fjVar7 = (fj) obj7;
                    if (fjVar7.l()) {
                        i12 = (int) this.f29956p3.d;
                    } else {
                        i12 = 0;
                    }
                    ArrayList arrayList15 = fjVar7.f22397y;
                    int size11 = arrayList15.size();
                    int i36 = 0;
                    while (i36 < size11) {
                        Object obj8 = arrayList15.get(i36);
                        i36++;
                        ((xh.f) obj8).j((x10 - this.f30010t5) + i12, (M1 - fjVar7.p(this.f29956p3.f22653e, x1Var)) - this.f30022u5, sqrt, false);
                        arrayList14 = arrayList14;
                    }
                }
            }
            gj gjVar6 = this.f29908l3;
            if (gjVar6 != null) {
                ArrayList arrayList16 = gjVar6.f22653e;
                int size12 = arrayList16.size();
                int i37 = 0;
                while (i37 < size12) {
                    Object obj9 = arrayList16.get(i37);
                    i37++;
                    fj fjVar8 = (fj) obj9;
                    if (fjVar8.l()) {
                        i11 = (int) this.f29908l3.d;
                    } else {
                        i11 = 0;
                    }
                    ArrayList arrayList17 = fjVar8.f22397y;
                    int size13 = arrayList17.size();
                    int i38 = 0;
                    while (i38 < size13) {
                        Object obj10 = arrayList17.get(i38);
                        i38++;
                        ((xh.f) obj10).j((x10 - this.f29983r3) + i11, (M1 - fjVar8.p(this.f29908l3.f22653e, x1Var)) - this.f29997s3, sqrt, false);
                        x10 = x10;
                    }
                }
            } else {
                ArrayList arrayList18 = this.P5.f23296z2;
                if (arrayList18 != null) {
                    int size14 = arrayList18.size();
                    int i39 = 0;
                    while (i39 < size14) {
                        Object obj11 = arrayList18.get(i39);
                        i39++;
                        fj fjVar9 = (fj) obj11;
                        if (fjVar9.l()) {
                            i10 = (int) this.P5.f23280v2;
                        } else {
                            i10 = 0;
                        }
                        ArrayList arrayList19 = fjVar9.f22397y;
                        int size15 = arrayList19.size();
                        int i40 = 0;
                        while (i40 < size15) {
                            Object obj12 = arrayList19.get(i40);
                            i40++;
                            ((xh.f) obj12).j((x10 - this.f29929n0) + i10, (M1 - fjVar9.p(this.P5.f23296z2, x1Var)) - this.f30005t0, sqrt, false);
                        }
                    }
                }
            }
            if (getParent() instanceof pj0) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                for (int i41 = 0; i41 < viewGroup2.getChildCount(); i41++) {
                    View childAt2 = viewGroup2.getChildAt(i41);
                    if (childAt2 instanceof q1) {
                        q1 q1Var2 = (q1) childAt2;
                        ArrayList arrayList20 = q1Var2.Sb;
                        if (q1Var2.getMessageObject() != null && q1Var2.getMessageObject().O1() == getMessageObject().f1() && !arrayList20.isEmpty()) {
                            ((xh.f) arrayList20.get(0)).f58709q = new ea(6, this, q1Var2);
                            int size16 = arrayList20.size();
                            int i42 = 0;
                            while (i42 < size16) {
                                Object obj13 = arrayList20.get(i42);
                                i42++;
                                ((xh.f) obj13).j(fVar.getBounds().centerX(), fVar.getBounds().centerY(), sqrt, false);
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
        return this.f30051w7;
    }

    public final void d3() {
        r1 r1Var = this.f30032v2;
        if (r1Var != null) {
            r1Var.h = false;
        }
        ic icVar = this.Fa;
        if (icVar != null) {
            icVar.c(false);
        }
        Drawable drawable = this.I2[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        r1 r1Var2 = this.f30032v2;
        if (r1Var2 != null && r1Var2.f30177g != null) {
            for (int i7 = 0; i7 < this.f30032v2.f30177g.size(); i7++) {
                n1 n1Var = (n1) this.f30032v2.f30177g.get(i7);
                ic icVar2 = n1Var.f29596f;
                if (icVar2 != null) {
                    icVar2.c(false);
                }
                y yVar = n1Var.f29597g;
                if (yVar != null) {
                    yVar.setState(StateSet.NOTHING);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ij ijVar;
        if (i7 == qs.f25019m1) {
            setSpoilersSuppressed(false);
        } else if (i7 == qs.l1) {
            setSpoilersSuppressed(true);
        } else if (i7 == qs.E0) {
            TLRPC.User user = this.f29879ia;
            if (user != null && user.f27101id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.P5);
            }
        } else if (i7 == qs.f25001i4) {
            invalidate();
        } else if (i7 == qs.W2 && (ijVar = this.P5) != null) {
            TLRPC.MessageMedia messageMedia = ijVar.f23237k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
                v3(ijVar, this.K, this.F, this.E, this.G, false);
            }
        }
    }

    @Override
    public final void e(TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
        l1 l1Var = this.Ra;
        if (l1Var != null) {
            l1Var.f2(this, reactionCount, z9, f10, f11);
        }
    }

    public final void e0() {
        int i7;
        ij ijVar = this.P5;
        if (ijVar != null) {
            TLRPC.MessageMedia o12 = ij.o1(ijVar.f23237k);
            if ((o12 instanceof TLRPC.TL_messageMediaDice) && ((TLRPC.TL_messageMediaDice) o12).game_outcome != null && !this.Q) {
                Drawable t6 = this.T0.t();
                if (t6 instanceof xg0) {
                    xg0 xg0Var = (xg0) t6;
                    if ((xg0Var.m0 != null || xg0Var.Y0) && !this.Q && (i7 = xg0Var.J) != 1 && i7 == 2) {
                        if (!xg0Var.X0) {
                            float t10 = xg0Var.t();
                            if (xg0Var.U0 != null) {
                                t10 = xg0Var.f40950a0 / xg0Var.f40277a1;
                            }
                            if (t10 <= 0.95f) {
                                return;
                            }
                        }
                        this.Q = true;
                        l1 l1Var = this.Ra;
                        if (l1Var != null) {
                            l1Var.s1(this, false);
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
        if (t2() && Z2()) {
            return true;
        }
        return false;
    }

    public final void e3(int i7) {
        n2.n0 n0Var;
        n2.n0 n0Var2 = this.f30009t4;
        if (i7 != -1) {
            Integer valueOf = Integer.valueOf(i7);
            for (int i10 = 0; i10 < n0Var2.f20251a; i10++) {
                if (((Pair) ((ArrayList) n0Var2.f20254e).get(i10)).second == valueOf) {
                    n0Var2.l(i10);
                }
            }
        } else {
            n0Var2.f(true);
        }
        s1 s1Var = this.f29980r0;
        if (s1Var != null && (n0Var = s1Var.f30238i) != null) {
            n0Var.f(true);
        }
        this.f29957p4 = null;
        s1 s1Var2 = this.f29980r0;
        if (s1Var2 != null) {
            s1Var2.f30239j = null;
        }
        if (this.f29970q4 != null) {
            if (this.f30021u4 == i7 || i7 == -1) {
                this.f29970q4 = null;
                this.f30021u4 = -1;
                this.f29804cc = false;
                this.dc = false;
                invalidate();
            }
        }
    }

    @Override
    public final void f0(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.f0(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    public final void f1(float r43, float r44, android.graphics.Canvas r45, java.util.ArrayList r46, float r47, boolean r48, float r49, boolean r50, boolean r51, boolean r52, boolean r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.f1(float, float, android.graphics.Canvas, java.util.ArrayList, float, boolean, float, boolean, boolean, boolean, boolean):void");
    }

    public final boolean f2() {
        s1 s1Var = this.f29980r0;
        if (s1Var != null && s1Var.f30233b) {
            return true;
        }
        return false;
    }

    public final void f3() {
        if (this.f29931n3 != null) {
            this.f29931n3 = null;
        }
        ArrayList arrayList = this.f30048w4;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f30034v4.addAll(arrayList);
        arrayList.clear();
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

    public final boolean g0(MotionEvent motionEvent) {
        if (!this.f29988r8 || this.f30038v8 == null || this.Ga == null || this.Ra == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float M1 = M1(motionEvent);
        int action = motionEvent.getAction();
        RectF rectF = this.Ma;
        if (action == 0) {
            if (rectF.contains(x10, M1)) {
                this.Ga.c(true);
                y yVar = this.f30025u8;
                if (yVar != null) {
                    yVar.setHotspot(x10, M1);
                    this.f30025u8.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.Ga.f34555i && !rectF.contains(x10, M1)) {
                this.Ga.c(false);
                y yVar2 = this.f30025u8;
                if (yVar2 != null) {
                    yVar2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Ga.f34555i) {
                this.Ra.G0(this);
            }
            this.Ga.c(false);
            y yVar3 = this.f30025u8;
            if (yVar3 != null) {
                yVar3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.Ga.c(false);
            y yVar4 = this.f30025u8;
            if (yVar4 != null) {
                yVar4.setState(new int[0]);
            }
        }
        return this.Ga.f34555i;
    }

    public final void g1(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i7;
        int i10;
        Canvas canvas2;
        ij ijVar = this.P5;
        if (ijVar != null && !ijVar.s4()) {
            float f13 = this.f30005t0;
            x1 x1Var = this.f29868hb;
            if (x1Var.f30817m2) {
                float f14 = x1Var.f30825o2;
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
                    if (this.P5.Q3() && !this.B6 && !this.F) {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(10.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    } else {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(4.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    }
                }
                tg0 tg0Var = this.f30081yc;
                if (tg0Var != null && tg0Var.h) {
                    ij ijVar2 = this.P5;
                    f1(this.f29929n0, f10, canvas, ijVar2.f23296z2, ijVar2.f23280v2, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    f1(this.f29929n0, f10, canvas, x1Var.I0, x1Var.O0, false, 1.0f - x1Var.L1, true, false, false, false);
                    ij ijVar3 = this.P5;
                    f1(this.f29929n0, f10, canvas, ijVar3.f23296z2, ijVar3.f23280v2, true, x1Var.L1, true, false, false, false);
                    canvas2 = canvas;
                }
                canvas2.restore();
                return;
            }
            float f16 = f10;
            boolean z9 = x1Var.E1;
            if (z9 && this.K6 != null) {
                if (z9) {
                    int i11 = -1;
                    if (this.f30018u1) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                    float z10 = com.google.android.recaptcha.internal.a.z(1.0f, x1Var.L1, this.P5.X5(x1Var) * i10, f13);
                    float f17 = x1Var.f30825o2;
                    if (this.f30018u1) {
                        i11 = 1;
                    }
                    f11 = f17 - ((this.P5.X5(x1Var) * i11) * x1Var.L1);
                    f12 = z10;
                } else {
                    f11 = f16;
                    f12 = f11;
                }
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(this.K6.getBounds());
                if (this.P5.Q3() && !this.B6 && !this.F) {
                    rectF.left += org.telegram.messenger.g0.L(4.0f);
                    rectF.right -= org.telegram.messenger.g0.L(10.0f);
                } else {
                    rectF.left += org.telegram.messenger.g0.L(4.0f);
                    rectF.right -= org.telegram.messenger.g0.L(4.0f);
                }
                float f18 = rectF.left;
                float f19 = x1Var.f30825o2;
                canvas.clipRect(f18, f19, rectF.right, this.P5.X5(x1Var) + f19 + org.telegram.messenger.g0.L(4.0f));
                ij ijVar4 = this.P5;
                f1(this.f29929n0, f11, canvas, ijVar4.f23296z2, ijVar4.f23280v2, false, 1.0f - x1Var.L1, true, false, false, false);
                canvas.restore();
                canvas.save();
                rectF.set(this.K6.getBounds());
                if (this.P5.Q3() && !this.B6 && !this.F) {
                    rectF.left += org.telegram.messenger.g0.L(4.0f);
                    rectF.right -= org.telegram.messenger.g0.L(10.0f);
                } else {
                    rectF.left += org.telegram.messenger.g0.L(4.0f);
                    rectF.right -= org.telegram.messenger.g0.L(4.0f);
                }
                canvas.clipRect(rectF.left, this.f30005t0, rectF.right, org.telegram.messenger.g0.L(4.0f) + this.P5.X5(x1Var) + i7);
                ij ijVar5 = this.P5;
                f1(this.f29929n0, f12, canvas, ijVar5.f23296z2, ijVar5.f23280v2, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            ij ijVar6 = this.P5;
            f1(this.f29929n0, f16, canvas, ijVar6.f23296z2, ijVar6.f23280v2, true, 1.0f, true, false, false, false);
        }
    }

    public final boolean g2() {
        org.telegram.ui.ActionBar.f6 f6Var = this.Pb;
        if (f6Var != null) {
            return f6Var.g();
        }
        return org.telegram.ui.ActionBar.k6.d1();
    }

    public final void g3() {
        CharSequence charSequence;
        long j3;
        long j10;
        long j11;
        long j12;
        c1 c1Var = this.Xb;
        ob.c cVar = this.f30056x;
        cVar.a(c1Var);
        c1 c1Var2 = this.Yb;
        cVar.a(c1Var2);
        ij ijVar = this.P5;
        if (ijVar != null) {
            if (!TextUtils.isEmpty(ijVar.f23293z)) {
                charSequence = this.P5.f23293z;
            } else {
                charSequence = this.P5.v;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i7 = zz.f41160e;
                int i10 = 0;
                ArrayList arrayList = null;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    zz[] zzVarArr = (zz[]) spanned.getSpans(0, spanned.length(), zz.class);
                    for (zz zzVar : zzVarArr) {
                        if (zzVar.f41162b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(zzVarArr.length);
                            }
                            arrayList.add(Integer.valueOf(zzVar.f41162b.date));
                        }
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int size = arrayList.size();
                    long j13 = Long.MAX_VALUE;
                    long j14 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
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
                        cVar.a(c1Var2);
                        v80 v80Var = new v80(1, cVar, c1Var2);
                        cVar.f20891a.put(c1Var2, v80Var);
                        if (j16 > 0) {
                            org.telegram.messenger.g0.i3(v80Var, j16);
                        } else {
                            org.telegram.messenger.g0.h3(v80Var);
                        }
                    }
                }
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
        wg.a[] aVarArr = (wg.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wg.a.class);
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
        if (this.f29842fb) {
            return this.f29855gb;
        }
        return super.getAlpha();
    }

    public org.telegram.ui.Components.r5[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.getAnimatedEmojiSpans():org.telegram.ui.Components.r5[]");
    }

    public float getAnimationOffsetX() {
        return this.Vc;
    }

    public ImageReceiver getAvatarImage() {
        if (this.F6) {
            return this.f30089z7;
        }
        return null;
    }

    public i90 getBackgroundDrawable() {
        return this.Sa;
    }

    public int getBackgroundDrawableBottom() {
        int i7;
        aj ajVar = this.L;
        int i10 = 0;
        if (ajVar != null) {
            int i11 = 4;
            if ((ajVar.f21451l & 4) == 0) {
                i7 = org.telegram.messenger.g0.L(3.0f);
            } else {
                i7 = 0;
            }
            if ((this.L.f21451l & 8) == 0) {
                ij ijVar = this.P5;
                if (ijVar != null && ijVar.Q3()) {
                    i11 = 3;
                }
                i7 += org.telegram.messenger.g0.L(i11);
            }
        } else {
            i7 = 0;
        }
        boolean z9 = this.J;
        if (!z9 || !this.I) {
            if (z9) {
                i10 = org.telegram.messenger.g0.L(1.0f);
            } else {
                i10 = org.telegram.messenger.g0.L(2.0f);
            }
        }
        int backgroundDrawableTop = ((getBackgroundDrawableTop() + this.f29812d7) - i10) + i7;
        if (!this.B6) {
            if (this.I) {
                backgroundDrawableTop += org.telegram.messenger.g0.L(1.0f);
            }
            if (this.J) {
                return org.telegram.messenger.g0.L(1.0f) + backgroundDrawableTop;
            }
        }
        return backgroundDrawableTop;
    }

    public int getBackgroundDrawableLeft() {
        int compactInShift;
        int i7;
        ij messageObject = getMessageObject();
        int i10 = 0;
        float f10 = 9.0f;
        if (messageObject != null && messageObject.Q3()) {
            if (this.f30068xb) {
                return (this.f29799c7 - this.f29772a7) - ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(9.0f)));
            }
            int i11 = this.f29799c7 - this.f29772a7;
            if (this.B6) {
                i10 = org.telegram.messenger.g0.L(9.0f);
            }
            return i11 - i10;
        }
        float f11 = 71.0f;
        if (this.f30068xb) {
            if (!L2()) {
                if ((this.f29824e6 || ((messageObject != null && (messageObject.f23226h2 || messageObject.f23236j2 || messageObject.f23237k.guestchat_via_from != null)) || ij.B0(messageObject.f23237k) == 489000)) && this.F6) {
                    i10 = 48;
                }
                f11 = i10 + 3;
            }
            compactInShift = org.telegram.messenger.g0.L(f11) + ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(6.0f)));
        } else {
            if (!L2()) {
                if ((this.f29824e6 || ((messageObject != null && (messageObject.f23226h2 || messageObject.f23236j2 || messageObject.f23237k.guestchat_via_from != null)) || ij.B0(messageObject.f23237k) == 489000)) && this.F6) {
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
        dj djVar = this.K;
        if (djVar != null && !djVar.f22008i && (i7 = this.L.f21449j) != 0) {
            compactInShift += (int) Math.ceil((i7 / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.f30068xb) {
            if (this.J) {
                return compactInShift + ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(6.0f)));
            }
        } else if (!this.B6 && this.J) {
            return org.telegram.messenger.g0.L(6.0f) + compactInShift;
        }
        return compactInShift;
    }

    public int getBackgroundDrawableRight() {
        int L;
        int i7;
        int backgroundDrawableLeft;
        ij ijVar;
        ij ijVar2;
        int i10 = this.f29772a7;
        if (this.f30068xb) {
            i7 = i10 - ((int) (getVideoTranscriptionProgress() * org.telegram.messenger.g0.L(3.0f)));
            if (this.J && (ijVar2 = this.P5) != null && ijVar2.Q3()) {
                i7 = (int) (i7 - ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(6.0f)));
            }
            if (this.J && ((ijVar = this.P5) == null || !ijVar.Q3())) {
                i7 = (int) (i7 - ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(6.0f)));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            if (this.B6) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(3.0f);
            }
            i7 = i10 - L;
            if (!this.B6 && this.J) {
                i7 -= org.telegram.messenger.g0.L(6.0f);
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        }
        return backgroundDrawableLeft + i7;
    }

    public int getBackgroundDrawableTop() {
        int i7;
        aj ajVar = this.L;
        int i10 = 0;
        if (ajVar != null && (ajVar.f21451l & 4) == 0) {
            i7 = 0 - org.telegram.messenger.g0.L(3.0f);
        } else {
            i7 = 0;
        }
        if (!this.I) {
            i10 = org.telegram.messenger.g0.L(1.0f);
        }
        int i11 = i7 + i10;
        if (!this.B6 && this.I) {
            return i11 - org.telegram.messenger.g0.L(1.0f);
        }
        return i11;
    }

    public int getBackgroundHeight() {
        return this.f29790bb;
    }

    public ImageReceiver getBlurredPhotoImage() {
        return this.U0;
    }

    public int getBottomActionPadding() {
        x1 x1Var = this.f29868hb;
        if (x1Var.C1) {
            return org.telegram.messenger.g0.W1(x1Var.L1, x1Var.B1, this.f29806d0);
        }
        return this.f29806d0;
    }

    @Override
    public int getBoundsLeft() {
        boolean z9;
        int i7;
        int i10;
        float f10;
        int L;
        int i11;
        float f11;
        ij ijVar = this.P5;
        if (ijVar != null && ijVar.Q3()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (Y2()) {
            if (this.L != null) {
                f11 = 73.0f;
            } else {
                ij ijVar2 = this.P5;
                if (ijVar2 != null && ijVar2.f23226h2) {
                    i11 = 42;
                } else {
                    i11 = 63;
                }
                f11 = i11;
            }
            i7 = org.telegram.messenger.g0.L(f11);
        } else {
            i7 = 0;
        }
        if (z9 && (U(this.P5) || this.H4)) {
            i10 = org.telegram.messenger.g0.L(48.0f);
        } else {
            i10 = 0;
        }
        int backgroundDrawableLeft = (getBackgroundDrawableLeft() - i7) - i10;
        ArrayList arrayList = this.H5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            ij ijVar3 = this.P5;
            if (ijVar3 != null && ijVar3.Q3()) {
                L = (getMeasuredWidth() - widthForButtons) - org.telegram.messenger.g0.L(10.0f);
            } else {
                int i12 = this.M6;
                if (!this.B6 && !this.J) {
                    f10 = 7.0f;
                } else {
                    f10 = 1.0f;
                }
                L = i12 + org.telegram.messenger.g0.L(f10);
            }
            int i13 = Integer.MAX_VALUE;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                i13 = Math.max(i13, ((int) (((c0) arrayList.get(i14)).f28949c * widthForButtons)) + L);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i13);
        }
        if (this.S != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.S.k()) - org.telegram.messenger.g0.L(18.0f))) / 2);
        }
        if (this.f29818e0 != null) {
            backgroundDrawableLeft = Math.min(this.Z6 - ((int) getCompactSideMenuShift()), backgroundDrawableLeft);
        }
        return Math.max(0, backgroundDrawableLeft);
    }

    @Override
    public int getBoundsRight() {
        int i7;
        float f10;
        int L;
        ij ijVar = this.P5;
        if (ijVar != null && !ijVar.Q3() && (U(this.P5) || this.H4)) {
            i7 = org.telegram.messenger.g0.L(48.0f);
        } else {
            i7 = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i7;
        ArrayList arrayList = this.H5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            ij ijVar2 = this.P5;
            if (ijVar2 != null && ijVar2.Q3()) {
                L = (getMeasuredWidth() - getWidthForButtons()) - org.telegram.messenger.g0.L(10.0f);
            } else {
                int i10 = this.M6;
                if (!this.B6 && !this.J) {
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
                i11 = Math.max(i11, ((int) (c0Var.f28949c * f11)) + L + ((int) (c0Var.f28950e * f11)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, i11);
        }
        if (this.S != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.S.k() + getParentWidth()) + org.telegram.messenger.g0.L(18.0f))) / 2);
        }
        if (this.f29818e0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public gj getCaptionLayout() {
        return this.f29908l3;
    }

    public float getCaptionX() {
        x1 x1Var = this.f29868hb;
        if (x1Var.f30858x0) {
            if (x1Var.D0) {
                this.f29983r3 += x1Var.f30793h0;
            } else if (x1Var.f30843t0) {
                float f10 = this.f29983r3;
                float f11 = x1Var.L1;
                this.f29983r3 = com.google.android.recaptcha.internal.a.z(1.0f, f11, x1Var.f30835r0, f10 * f11);
            } else if (!ij.S4(this.P5.f23237k) || !TextUtils.isEmpty(this.P5.f23293z)) {
                this.f29983r3 += x1Var.f30793h0;
            }
        }
        return this.f29983r3;
    }

    public float getCaptionY() {
        float f10 = this.f29997s3;
        x1 x1Var = this.f29868hb;
        if (x1Var.f30858x0) {
            if (x1Var.D0) {
                return f10 - getTranslationY();
            }
            if (x1Var.f30843t0) {
                float f11 = x1Var.L1;
                return com.google.android.recaptcha.internal.a.z(1.0f, f11, x1Var.f30839s0, f10 * f11);
            }
            return f10;
        }
        return f10;
    }

    @Override
    public float getCheckBoxTranslation() {
        return this.f29967q1;
    }

    public int getChecksX() {
        float f10;
        int i7 = this.f29799c7;
        if (iz.Y0 >= 10) {
            f10 = 27.3f;
        } else {
            f10 = 25.3f;
        }
        return i7 - org.telegram.messenger.g0.L(f10);
    }

    public int getChecksY() {
        float f10;
        int intrinsicHeight;
        if (this.P5.Q5()) {
            f10 = this.f30066x9;
            intrinsicHeight = Y1("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            f10 = this.f30066x9;
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
        int i7 = t4Var.getBounds().left;
        if (!this.P5.Q3() && this.f29868hb.A0 != 1.0f) {
            boolean z9 = this.f30068xb;
            if ((z9 || !this.B6) && !this.J) {
                if (z9) {
                    return (int) (i7 - (getVideoTranscriptionProgress() * org.telegram.messenger.g0.L(6.0f)));
                }
                return i7 - org.telegram.messenger.g0.L(6.0f);
            }
            return i7;
        }
        return i7;
    }

    public int getCurrentBackgroundRight() {
        boolean z9;
        org.telegram.ui.ActionBar.t4 t4Var = this.K6;
        if (t4Var == null) {
            return getWidth();
        }
        int i7 = t4Var.getBounds().right;
        if (this.P5.Q3() && this.f29868hb.A0 != 1.0f && (((z9 = this.f30068xb) || !this.B6) && !this.J)) {
            if (z9) {
                return (int) ((getVideoTranscriptionProgress() * org.telegram.messenger.g0.L(6.0f)) + i7);
            }
            return org.telegram.messenger.g0.L(6.0f) + i7;
        }
        return i7;
    }

    public TLRPC.Chat getCurrentChat() {
        return this.f29891ja;
    }

    public dj getCurrentMessagesGroup() {
        return this.K;
    }

    public aj getCurrentPosition() {
        return this.L;
    }

    public TLRPC.User getCurrentUser() {
        return this.f29879ia;
    }

    public l1 getDelegate() {
        return this.Ra;
    }

    @Override
    public float getDeltaBottom() {
        return this.f29868hb.f30803j0;
    }

    public float getDeltaLeft() {
        return this.f29868hb.f30793h0;
    }

    public float getDeltaRight() {
        return this.f29868hb.f30798i0;
    }

    public float getDeltaTop() {
        return this.f29868hb.f30807k0;
    }

    public float getDescriptionLayoutX() {
        int L;
        int extraTextX;
        float f10;
        float L2;
        int i7;
        int L3;
        int i10;
        boolean z9 = this.S1;
        float f11 = 0.0f;
        x1 x1Var = this.f29868hb;
        if (z9) {
            org.telegram.messenger.g0.L(14.0f);
            L2 = this.f29941o0 - org.telegram.messenger.g0.L(10.0f);
        } else {
            if (this.T1) {
                org.telegram.messenger.g0.L(14.0f);
                i7 = this.f29941o0;
                L3 = org.telegram.messenger.g0.L(1.0f);
            } else if (this.P5.s4()) {
                org.telegram.messenger.g0.L(2.0f);
                i7 = this.f29941o0;
                L3 = org.telegram.messenger.g0.L(1.0f);
            } else {
                float f12 = 12.0f;
                if (this.P5.Q3()) {
                    f10 = getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + this.M6;
                    if (this.P5.D == 19) {
                        f10 -= Math.max(0.0f, ((Math.max(this.W7, this.Y7) + f10) + org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.f22537q.x);
                    }
                } else {
                    if (this.B6) {
                        L = org.telegram.messenger.g0.L(12.0f) + this.M6;
                        extraTextX = getExtraTextX();
                    } else {
                        int i11 = this.M6;
                        if (!this.J) {
                            f12 = 18.0f;
                        }
                        L = org.telegram.messenger.g0.L(f12) + i11;
                        extraTextX = getExtraTextX();
                    }
                    f10 = extraTextX + L;
                }
                L2 = (f10 + x1Var.f30793h0) - org.telegram.messenger.g0.L(1.33f);
            }
            L2 = L3 + i7;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (x1Var != null) {
            f11 = x1Var.f30798i0;
        }
        float f13 = backgroundDrawableRight + f11;
        int i12 = 0;
        if (this.P5.Q3() && !this.B6 && !this.J) {
            i10 = 6;
        } else {
            i10 = 0;
        }
        int L4 = (int) (((f13 - org.telegram.messenger.g0.L(10 + i10)) - getExtraTextX()) - L2);
        float L5 = L2 + org.telegram.messenger.g0.L(10.0f);
        if (Math.abs(this.f29781b2) > 1) {
            i12 = ((L4 - org.telegram.messenger.g0.L(20.0f)) - this.f29767a2) - this.f29781b2;
        }
        return L5 + i12;
    }

    public float getDescriptionLayoutY() {
        float f10;
        float f11 = this.X1;
        x1 x1Var = this.f29868hb;
        if (!x1Var.f30841s2) {
            f10 = (-x1Var.f30807k0) + x1Var.f30803j0;
        } else {
            f10 = 0.0f;
        }
        return f11 + f10;
    }

    public StaticLayout getDescriptionlayout() {
        return this.f29943o2;
    }

    public TLRPC.TL_availableEffect getEffect() {
        ij ijVar;
        aj ajVar = this.L;
        if ((ajVar != null && !ajVar.h) || (ijVar = this.P5) == null) {
            return null;
        }
        return ijVar.M0();
    }

    public gj getExplanationLayout() {
        return this.f29956p3;
    }

    public float getExplanationX() {
        return this.f30010t5;
    }

    public float getExplanationY() {
        return this.f30022u5;
    }

    public int getExtraInsetHeight() {
        int i7;
        int i10 = this.f30033v3;
        boolean f22 = f2();
        ch.p0 p0Var = this.N;
        if (f22) {
            if (p0Var.f6373p) {
                i7 = 18;
            } else {
                i7 = 0;
            }
            i10 += org.telegram.messenger.g0.L(i7 + 2) + this.f29980r0.f30247r;
        }
        if (this.f30051w7) {
            i10 += getCommentButtonHeight();
        }
        if (!p0Var.f6373p) {
            this.P5.getClass();
            return i10 + p0Var.f6371n;
        }
        return i10;
    }

    public int getExtraTextX() {
        int i7 = iz.Y0;
        if (i7 >= 15) {
            return org.telegram.messenger.g0.L(2.0f);
        }
        if (i7 >= 11) {
            return org.telegram.messenger.g0.L(1.0f);
        }
        return 0;
    }

    public int getExtraTimeX() {
        int i7;
        if (t2()) {
            return 0;
        }
        if (!this.P5.Q3() && ((!this.B6 || this.f29908l3 != null) && (i7 = iz.Y0) > 11)) {
            return org.telegram.messenger.g0.L((i7 - 11) / 1.5f);
        }
        if (this.P5.Q3() || !this.f30080yb || !this.F6 || this.P5.D != 5) {
            return 0;
        }
        return (int) ((org.telegram.messenger.g0.g3(this.W6, v2()) - org.telegram.messenger.g0.f22541u) * 0.7f);
    }

    public StaticLayout getFactCheckLayout() {
        s1 s1Var = this.f29980r0;
        if (s1Var != null) {
            return s1Var.f30237g;
        }
        return null;
    }

    public String getFilename() {
        int i7;
        int i10;
        ij ijVar = this.P5;
        if (ijVar != null) {
            int i11 = ijVar.D;
            if (i11 == 1) {
                TLRPC.PhotoSize photoSize = this.f29809d4;
                if (photoSize != null) {
                    return org.telegram.messenger.w7.r(null, photoSize);
                }
            } else if (i11 != 8 && (i10 = this.L1) != 7 && i10 != 4 && i10 != 8 && i11 != 9 && i10 != 3 && i10 != 5) {
                if (i10 != 0) {
                    return org.telegram.messenger.w7.r(null, this.M1);
                }
                TLRPC.PhotoSize photoSize2 = this.f29809d4;
                if (photoSize2 != null) {
                    return org.telegram.messenger.w7.r(null, photoSize2);
                }
            } else if (!ijVar.C0) {
                if (ijVar.f23282w0 && !TextUtils.isEmpty(ijVar.f23237k.attachPath)) {
                    return this.P5.f23237k.attachPath;
                }
                if (!this.P5.o4() || (i7 = this.L1) == 3 || i7 == 5) {
                    return this.P5.S0();
                }
            }
        }
        return null;
    }

    public int getForwardNameCenterX() {
        float f10;
        TLRPC.User user = this.f29879ia;
        if (user != null && user.f27101id == 0) {
            f10 = this.f30089z7.r();
        } else {
            f10 = this.s9 + this.I1;
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
        return this.f29845g1;
    }

    public float getLastTouchY() {
        return this.f29859h1;
    }

    public int getLayoutHeight() {
        return this.f29812d7;
    }

    public int getMaxNameWidth() {
        int min;
        int L;
        ij ijVar;
        ij ijVar2;
        int i7;
        int i10;
        float f10;
        int L2;
        int parentWidth;
        aj ajVar;
        int i11 = this.L1;
        if (i11 != 6 && i11 != 8 && (i7 = (ijVar2 = this.P5).D) != 5) {
            dj djVar = this.K;
            int i12 = 0;
            if (djVar != null && !djVar.f22008i) {
                if (org.telegram.messenger.g0.Q1()) {
                    parentWidth = org.telegram.messenger.g0.Q0();
                } else {
                    parentWidth = getParentWidth();
                }
                i10 = 0;
                for (int i13 = 0; i13 < this.K.f22005e.size(); i13++) {
                    if (((aj) this.K.f22005e.get(i13)).f21444c != 0) {
                        break;
                    }
                    i10 = (int) (Math.ceil(((ajVar.f21445e + ajVar.f21449j) / 1000.0f) * parentWidth) + i10);
                }
                if (this.W6) {
                    i12 = 71;
                } else if (Y2()) {
                    i12 = 48;
                }
                L2 = org.telegram.messenger.g0.L(i12 + 31);
            } else if (i7 == 19) {
                int i14 = ijVar2.f23273t2;
                int L3 = org.telegram.messenger.g0.f22537q.x - org.telegram.messenger.g0.L(52.0f);
                if (this.F6) {
                    i12 = org.telegram.messenger.g0.L(48.0f);
                }
                return Math.max(i14, (int) ((L3 - i12) * 0.5f));
            } else {
                i10 = this.f29772a7;
                if (ijVar2.f23243l2 && ijVar2.Q3() && U(this.P5)) {
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
            } else if (Y2()) {
                f11 = 42.0f;
            }
            L = org.telegram.messenger.g0.L(f11);
        } else {
            min = Math.min(getParentWidth(), org.telegram.messenger.g0.f22537q.y);
            if (this.W6) {
                f11 = 71.0f;
            } else if (Y2()) {
                f11 = 42.0f;
            }
            L = org.telegram.messenger.g0.L(f11);
        }
        int i15 = min - L;
        ij ijVar3 = this.P5;
        if (ijVar3 != null && ijVar3.f23243l2 && ijVar3.Q3() && U(this.P5)) {
            i15 -= org.telegram.messenger.g0.L(25.0f);
        }
        if (this.f30080yb && ((ijVar = this.P5) == null || !ijVar.U4())) {
            return (i15 - (this.f29772a7 - (org.telegram.messenger.g0.g3(this.W6, v2()) - org.telegram.messenger.g0.f22541u))) - org.telegram.messenger.g0.L(57.0f);
        }
        if (this.W6 && (this.P5.D == 5 || this.L1 == 6)) {
            return this.f29772a7 - org.telegram.messenger.g0.L(57.0f);
        }
        return (i15 - this.f29772a7) - org.telegram.messenger.g0.L(57.0f);
    }

    public int getMediaOffsetY() {
        x1 x1Var = this.f29868hb;
        if (x1Var.f30763a2) {
            return org.telegram.messenger.g0.W1(x1Var.L1, x1Var.Z1, this.W1);
        }
        return this.W1;
    }

    @Override
    public ij getMessageObject() {
        ij ijVar = this.Q5;
        if (ijVar != null) {
            return ijVar;
        }
        return this.P5;
    }

    public int getMiniIconForCurrentState() {
        int i7 = this.W3;
        if (i7 < 0) {
            return 4;
        }
        if (i7 == 0) {
            return 2;
        }
        return 3;
    }

    public int getNameStatusX() {
        int i7;
        float f10 = this.f29853g9 + this.f29841f9;
        int i10 = this.Q6;
        if (i10 > 0) {
            i7 = i10 - org.telegram.messenger.g0.L(32.0f);
        } else {
            i7 = this.V8;
        }
        return (int) (f10 + i7 + org.telegram.messenger.g0.L(2.0f) + (org.telegram.messenger.g0.L(20.0f) / 2));
    }

    public int getNameStatusY() {
        int height;
        float f10 = this.f29866h9;
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
        return getTopicSeparatorTopPadding() + this.V + this.f29858h0;
    }

    public int getParentWidth() {
        int i7;
        ij ijVar = this.P5;
        if (ijVar == null) {
            ijVar = this.Q5;
        }
        if (ijVar != null && ijVar.f23264r1 && (i7 = this.K0) > 0) {
            return i7;
        }
        return org.telegram.messenger.g0.f22537q.x;
    }

    public float getPhotoBottom() {
        if (b4()) {
            float f10 = this.f29791bc;
            if (f10 > 0.0f) {
                return f10;
            }
            return this.f29812d7 - org.telegram.messenger.g0.L(5.0f);
        }
        l4 l4Var = this.W5;
        if (l4Var != null) {
            return l4Var.f29490e + l4Var.h;
        }
        return this.T0.A();
    }

    public ImageReceiver getPhotoImage() {
        return this.T0;
    }

    public ArrayList<p1> getPollButtons() {
        return this.P4;
    }

    public float getPollButtonsLeft() {
        int L;
        if (getMessageObject() != null && getMessageObject().Q3()) {
            L = (org.telegram.messenger.g0.L(3.0f) + this.f29799c7) - this.f29772a7;
        } else if (this.X6) {
            L = org.telegram.messenger.g0.L(82.0f);
        } else if (Y2()) {
            L = org.telegram.messenger.g0.L(59.0f);
        } else {
            L = org.telegram.messenger.g0.L(11.0f);
        }
        return L;
    }

    public float getPollButtonsRight() {
        return (getPollButtonsLeft() + this.f29772a7) - org.telegram.messenger.g0.L(15.0f);
    }

    public ij getPrimaryMessageObject() {
        ij ijVar;
        ij ijVar2 = this.P5;
        if (ijVar2 != null && this.K != null && ijVar2.A2()) {
            ijVar = this.K.c();
        } else {
            ijVar = null;
        }
        if (ijVar != null) {
            return ijVar;
        }
        return this.P5;
    }

    public RadialProgress2 getRadialProgress() {
        return this.P0;
    }

    public ch.p0 getReactionsLayout() {
        return this.N;
    }

    public int getRepliesCount() {
        dj djVar = this.K;
        if (djVar != null && !djVar.d.isEmpty()) {
            return ((ij) this.K.d.get(0)).N1();
        }
        return this.P5.N1();
    }

    public org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        return this.Pb;
    }

    public RectF getScrimBlockBounds() {
        return this.Xc;
    }

    public pm0 getSeekBarWaveform() {
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
        long j3;
        TLRPC.Message message2;
        dj djVar = this.K;
        if (djVar != null) {
            ArrayList arrayList = djVar.d;
            int size = arrayList.size();
            int i7 = 0;
            long j10 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ij ijVar = (ij) obj;
                if (ijVar != null && (message2 = ijVar.f23237k) != null) {
                    j3 = message2.paid_message_stars;
                } else {
                    j3 = 0;
                }
                j10 += j3;
            }
            return j10;
        }
        ij ijVar2 = this.P5;
        if (ijVar2 == null || (message = ijVar2.f23237k) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        x1 x1Var = this.f29868hb;
        if (x1Var.f30867z1) {
            return org.telegram.messenger.g0.W1(x1Var.L1, x1Var.f30863y1, this.V);
        }
        return this.V;
    }

    public TLRPC.Document getStreamingMedia() {
        int i7 = this.L1;
        if (i7 != 4 && i7 != 7 && i7 != 2) {
            return null;
        }
        return this.M1;
    }

    public int getTextX() {
        return this.f29929n0;
    }

    public int getTextY() {
        return this.f30005t0;
    }

    public float getTimeAlpha() {
        return this.f29885j4;
    }

    public float getTimeX() {
        int i7;
        x1 x1Var = this.f29868hb;
        if (x1Var.f30799i1) {
            i7 = org.telegram.messenger.g0.W1(x1Var.L1, x1Var.f30794h1, this.B9);
        } else {
            i7 = this.B9;
        }
        return i7;
    }

    public float getTimeY() {
        int i7;
        int i10 = 0;
        if (E3()) {
            if (this.f30051w7) {
                i10 = t2() ? getCommentButtonHeight() : org.telegram.messenger.g0.L(41.3f);
            }
        } else if (this.P5.s4()) {
            i7 = -org.telegram.messenger.g0.L(48.0f);
            if (this.f29786b7) {
                i7 -= org.telegram.messenger.g0.L(4.0f);
            }
            return a2(i7);
        } else if (this.f30051w7) {
            i10 = t2() ? getCommentButtonHeight() : org.telegram.messenger.g0.L(43.0f);
        }
        i7 = -i10;
        return a2(i7);
    }

    public int getTopMediaOffset() {
        ij ijVar = this.P5;
        if (ijVar != null && ijVar.D == 14) {
            return this.W1 + this.Ta;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        x1 x1Var = this.f29868hb;
        if (x1Var.f30851v1) {
            return org.telegram.messenger.g0.W1(x1Var.L1, x1Var.f30848u1, this.f29832f0);
        }
        return this.f29832f0;
    }

    public x1 getTransitionParams() {
        return this.f29868hb;
    }

    public float getVideoTranscriptionProgress() {
        ij ijVar;
        x1 x1Var = this.f29868hb;
        if (x1Var == null || (ijVar = this.P5) == null || !ijVar.i4()) {
            return 1.0f;
        }
        if (x1Var.f30816m1) {
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
        return this.f29776ab;
    }

    public int getWidthForButtons() {
        x1 x1Var = this.f29868hb;
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

    public final boolean h0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.h0(android.view.MotionEvent):boolean");
    }

    public final void h1(android.graphics.Canvas r55, float r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.h1(android.graphics.Canvas, float):void");
    }

    public final boolean h2() {
        ij ijVar = this.P5;
        if ((ijVar != null && ijVar.t2()) || this.L5) {
            return true;
        }
        return false;
    }

    public final void h3(int i7, int i10, String str) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
            obtain.setPackageName(getContext().getPackageName());
            obtain.setSource(this, i7);
            if (str != null) {
                obtain.getText().add(str);
            }
            if (getParent() != null) {
                getParent().requestSendAccessibilityEvent(this, obtain);
            }
        }
    }

    @Override
    public final void i(long j3, long j10) {
        float min;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.P5.F0 = j3;
        z0(j3, j10);
        if (this.f30071y1) {
            this.Q0.p(true, min);
        } else {
            this.P0.p(true, min);
        }
        int i7 = this.L1;
        if (i7 != 3 && i7 != 5) {
            if (this.V3 != 0) {
                if (this.W3 != 1) {
                    N3(false, false, false);
                }
            } else if (this.N3 != 1) {
                N3(false, false, false);
            }
        } else if (this.V3 != 0) {
            if (this.W3 != 1) {
                N3(false, false, false);
            }
        } else if (this.N3 != 4) {
            N3(false, false, false);
        }
    }

    public final boolean i0(MotionEvent motionEvent) {
        j9 k22;
        boolean z9;
        boolean z10;
        int i7;
        int L;
        int i10;
        s1 s1Var;
        int L2;
        int extraTextX;
        int i11;
        dj djVar;
        l1 l1Var = this.Ra;
        if (l1Var != null && (k22 = l1Var.k2()) != null && (k22.b() || k22.e())) {
            ArrayList arrayList = this.P5.f23296z2;
            if (arrayList != null && !arrayList.isEmpty()) {
                z9 = true;
            } else {
                z9 = false;
            }
            kv kvVar = this.P5.f23284w2;
            if (kvVar != null && !kvVar.f23767n.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((z9 || c2() || z10) && ((this.f29883j1 || this.K != null) && (this.K == null || this.Ra.R()))) {
                if (this.P5.A2() && (djVar = this.K) != null && !djVar.f22008i) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                            View childAt = viewGroup.getChildAt(i12);
                            if (childAt instanceof q1) {
                                q1 q1Var = (q1) childAt;
                                dj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                                aj currentPosition = q1Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.f22002a == this.K.f22002a && (currentPosition.f21451l & B()) != 0 && (currentPosition.f21451l & 1) != 0) {
                                    k22.f30647c = (int) q1Var.f29983r3;
                                    k22.d = (int) q1Var.f29997s3;
                                    k22.b0(q1Var);
                                    if (q1Var == this) {
                                        return k22.M(motionEvent);
                                    }
                                    motionEvent.offsetLocation(getLeft() - q1Var.getLeft(), getTop() - q1Var.getTop());
                                    boolean M = k22.M(motionEvent);
                                    motionEvent.offsetLocation(-(getLeft() - q1Var.getLeft()), -(getTop() - q1Var.getTop()));
                                    return M;
                                }
                            }
                        }
                    }
                } else {
                    ij ijVar = this.P5;
                    if (ijVar != null && !ijVar.f23264r1 && (s1Var = this.f29980r0) != null && s1Var.f30237g != null && M1(motionEvent) >= this.f29966q0) {
                        k22.f29375r0 = false;
                        k22.f29377t0 = true;
                        k22.f29379v0 = false;
                        dj djVar2 = this.K;
                        if (djVar2 != null && !djVar2.f22008i) {
                            i11 = (int) this.f29983r3;
                        } else {
                            float f10 = 12.0f;
                            if (this.P5.Q3()) {
                                int extraTextX2 = getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + this.M6;
                                if (this.P5.D == 19) {
                                    i11 = extraTextX2 - Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(this.W7, this.Y7) + extraTextX2)) - org.telegram.messenger.g0.f22537q.x);
                                } else {
                                    i11 = extraTextX2;
                                }
                            } else {
                                if (this.B6) {
                                    L2 = org.telegram.messenger.g0.L(12.0f) + this.M6;
                                    extraTextX = getExtraTextX();
                                } else {
                                    int i13 = this.M6;
                                    if (!this.J) {
                                        f10 = 18.0f;
                                    }
                                    L2 = org.telegram.messenger.g0.L(f10) + i13;
                                    extraTextX = getExtraTextX();
                                }
                                i11 = extraTextX + L2;
                            }
                        }
                        int L3 = ((int) (i11 + this.f29868hb.f30793h0)) - org.telegram.messenger.g0.L(1.33f);
                        int i14 = this.f29966q0;
                        k22.f30647c = (org.telegram.messenger.g0.L(10.0f) + L3) - this.f29980r0.f30244o;
                        k22.d = org.telegram.messenger.g0.L(22.0f) + i14;
                    } else {
                        if (z10 && O2()) {
                            if (M1(motionEvent) < this.P5.f23284w2.t() + this.f30005t0) {
                                k22.f29375r0 = false;
                                k22.f29377t0 = false;
                                k22.f29379v0 = true;
                                int i15 = this.f29929n0;
                                int i16 = this.f30005t0;
                                k22.f30647c = i15;
                                k22.d = i16;
                            }
                        }
                        if (c2()) {
                            k22.f29375r0 = false;
                            k22.f29377t0 = false;
                            k22.f29379v0 = false;
                            k22.f30647c = (int) this.f29983r3;
                            k22.d = (int) this.f29997s3;
                        } else {
                            ij ijVar2 = this.P5;
                            if (ijVar2 != null && !ijVar2.f23264r1 && this.f29943o2 != null && (!this.f30018u1 ? M1(motionEvent) > this.X1 : M1(motionEvent) < this.f30005t0)) {
                                k22.f29375r0 = true;
                                k22.f29377t0 = false;
                                k22.f29379v0 = false;
                                if (this.S1) {
                                    i10 = this.f29941o0 - org.telegram.messenger.g0.L(10.0f);
                                } else {
                                    if (this.T1) {
                                        i7 = this.f29941o0;
                                        L = org.telegram.messenger.g0.L(1.0f);
                                    } else {
                                        i7 = this.f29941o0;
                                        L = org.telegram.messenger.g0.L(1.0f);
                                    }
                                    i10 = i7 + L;
                                }
                                int L4 = org.telegram.messenger.g0.L(10.0f) + i10 + this.Z1;
                                int i17 = this.X1;
                                k22.f30647c = L4;
                                k22.d = i17;
                            } else if (z10) {
                                k22.f29375r0 = false;
                                k22.f29377t0 = false;
                                k22.f29379v0 = true;
                                int i18 = this.f29929n0;
                                int i19 = this.f30005t0;
                                k22.f30647c = i18;
                                k22.d = i19;
                            } else {
                                k22.f29375r0 = false;
                                k22.f29377t0 = false;
                                k22.f29379v0 = false;
                                int i20 = this.f29929n0;
                                int i21 = this.f30005t0;
                                k22.f30647c = i20;
                                k22.d = i21;
                            }
                        }
                    }
                    k22.b0(this);
                    return k22.M(motionEvent);
                }
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

    public final void i3(boolean z9, boolean z10) {
        dj djVar;
        dj djVar2;
        ij ijVar;
        if (!z10 || (ijVar = this.P5) == null || !ijVar.f23192a0) {
            if (z9) {
                this.f29931n3 = null;
                CheckBoxBase checkBoxBase = this.l1;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, this.Pb);
                    this.l1 = checkBoxBase2;
                    if (this.N0) {
                        checkBoxBase2.f31253l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.f6 f6Var = this.Pb;
                    if (checkBoxBase.F != f6Var) {
                        checkBoxBase.F = f6Var;
                        checkBoxBase.b();
                    }
                }
            }
            if (z9 && (((djVar = this.K) != null && djVar.d.size() > 1) || ((djVar2 = this.R5) != null && djVar2.d.size() > 1))) {
                CheckBoxBase checkBoxBase3 = this.f29895k1;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, this, this.Pb);
                    this.f29895k1 = checkBoxBase4;
                    if (!checkBoxBase4.f31265y) {
                        checkBoxBase4.f31265y = true;
                        checkBoxBase4.b();
                    }
                    if (this.N0) {
                        this.f29895k1.f31253l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.f6 f6Var2 = this.Pb;
                    if (checkBoxBase3.F != f6Var2) {
                        checkBoxBase3.F = f6Var2;
                        checkBoxBase3.b();
                    }
                }
            }
            float f10 = 0.0f;
            if (this.f29918m1 == z9) {
                if (z10 != this.n1 && !z10) {
                    if (z9) {
                        f10 = 1.0f;
                    }
                    this.f29942o1 = f10;
                    invalidate();
                    return;
                }
                return;
            }
            this.n1 = z10;
            this.f29918m1 = z9;
            if (z10) {
                this.f29954p1 = SystemClock.elapsedRealtime();
            } else {
                if (z9) {
                    f10 = 1.0f;
                }
                this.f29942o1 = f10;
            }
            invalidate();
        }
    }

    @Override
    public void invalidate() {
        l1 l1Var;
        if (this.P5 == null) {
            return;
        }
        Runnable runnable = this.f30941e;
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
        if ((this.f29771a6 || (this.K != null && q2())) && getParent() != null) {
            View view = (View) getParent();
            if (view.getParent() != null) {
                view.invalidate();
                ((View) view.getParent()).invalidate();
            }
        }
        if (!this.Vb || (l1Var = this.Ra) == null) {
            return;
        }
        l1Var.p();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (this.K != null) {
            r2();
        }
    }

    @Override
    public final boolean j() {
        dj djVar = this.K;
        if (djVar != null && djVar.f22008i) {
            aj ajVar = this.L;
            if (ajVar != null && (ajVar.f21451l & 4) != 0) {
                return this.E;
            }
            return true;
        }
        return this.E;
    }

    public final boolean j0(MotionEvent motionEvent) {
        if (this.P5.s4() && this.P5.Z0) {
            int x10 = (int) motionEvent.getX();
            int M1 = (int) M1(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f10 = x10;
                if (f10 >= this.f29884j2 - org.telegram.messenger.g0.L(6.0f) && f10 <= this.f29884j2 + this.f29860h2 + org.telegram.messenger.g0.L(6.0f)) {
                    float f11 = M1;
                    if (f11 >= this.f29896k2 - org.telegram.messenger.g0.L(2.0f) && f11 <= this.f29896k2 + this.f29872i2 + org.telegram.messenger.g0.L(2.0f)) {
                        ic icVar = this.f29919m2;
                        if (icVar != null) {
                            icVar.c(true);
                        }
                        this.f29907l2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.f29907l2) {
                l1 l1Var = this.Ra;
                if (l1Var != null) {
                    l1Var.F1();
                }
                ic icVar2 = this.f29919m2;
                if (icVar2 != null) {
                    icVar2.c(false);
                }
                playSoundEffect(0);
                this.f29907l2 = false;
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

    public final void j3(boolean z9, boolean z10) {
        this.C6 = z9;
        this.f30036v6 = z10;
        S3();
        if (this.B4) {
            this.D4.f36990o = x2();
        } else {
            this.C4.f34986p = x2();
        }
        invalidate();
    }

    public final boolean k0(MotionEvent motionEvent) {
        a1 a1Var;
        y yVar;
        if (this.H4 && ((!this.f30080yb || getVideoTranscriptionProgress() > 0.0f || this.S2) && (a1Var = this.I4) != null)) {
            int action = motionEvent.getAction();
            float x10 = motionEvent.getX();
            float M1 = M1(motionEvent);
            if (action != 1 && action != 3) {
                if (a1Var.v.contains((int) x10, (int) M1)) {
                    if (action == 0) {
                        a1Var.A = true;
                    }
                    if (a1Var.A && (yVar = a1Var.f37494q) != null) {
                        yVar.setHotspot(x10, M1);
                        a1Var.f37494q.setState(r11.N);
                        a1Var.f37495r.invalidate();
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

    public final void k1(Canvas canvas, RectF rectF) {
        float f10;
        Path path = this.A4;
        path.rewind();
        path.addRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        di.z2 z2Var = this.T0;
        float alpha = z2Var.getAlpha();
        if (this.P5.h4()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        z2Var.setAlpha(f10 * alpha);
        z2Var.h(canvas, null);
        z2Var.setAlpha(alpha);
        canvas.restore();
        Paint Z1 = Z1("paintChatTimeBackground");
        int alpha2 = Z1.getAlpha();
        Z1.setAlpha((int) (alpha2 * this.f29898k4 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, Z1);
        Z1.setAlpha(alpha2);
    }

    public final boolean k2() {
        ij ijVar = this.P5;
        if (ijVar != null && ijVar.P5()) {
            aj ajVar = this.L;
            if (ajVar != null) {
                int i7 = ajVar.f21451l;
                if ((i7 & 8) == 0 || (i7 & 1) == 0) {
                    return false;
                }
            }
            this.N.getClass();
            return true;
        }
        return false;
    }

    public final void k3(boolean z9, boolean z10, boolean z11) {
        ij ijVar;
        if (z9 || !z11 || (ijVar = this.P5) == null || !ijVar.f23192a0) {
            CheckBoxBase checkBoxBase = this.l1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z10, z11);
            }
            CheckBoxBase checkBoxBase2 = this.f29895k1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z9, z11);
            }
            i90 i90Var = this.Sa;
            float f10 = 0.0f;
            if (i90Var.f34527e == z10) {
                if (i90Var.f34528f != z11 && !z11) {
                    if (z10) {
                        f10 = 1.0f;
                    }
                    i90Var.d = f10;
                    i90Var.f34528f = false;
                    return;
                }
                return;
            }
            i90Var.f34527e = z10;
            i90Var.f34528f = z11;
            if (z11) {
                i90Var.f34526c = SystemClock.elapsedRealtime();
            } else {
                if (z10) {
                    f10 = 1.0f;
                }
                i90Var.d = f10;
            }
            i90Var.a();
            q1 q1Var = i90Var.f34534m;
            if (q1Var != null) {
                q1Var.invalidate();
                if (q1Var.getParent() != null) {
                    ((ViewGroup) q1Var.getParent()).invalidate();
                }
            }
        }
    }

    @Override
    public final boolean l() {
        return this.ya;
    }

    public final boolean l0() {
        ij ijVar = this.P5;
        if (ijVar != null && ijVar.D == 17) {
            TLRPC.MessageMedia o12 = ij.o1(ijVar.f23237k);
            if (o12 instanceof TLRPC.TL_messageMediaPoll) {
                return ((TLRPC.TL_messageMediaPoll) o12).results.has_unread_votes;
            }
        }
        return false;
    }

    public boolean l1(Canvas canvas) {
        org.telegram.ui.Components.v5 m10;
        int i7;
        boolean z9;
        ij ijVar = this.P5;
        di.z2 z2Var = this.T0;
        if (ijVar != null && ijVar.E3() && (m10 = z2Var.m()) != null && (i7 = m10.d[4]) > 0) {
            float l10 = 1.0f - Utilities.l(((i7 - 90) - m10.o()) / 500.0f);
            if (l10 > 0.0f) {
                if (l10 < 1.0f) {
                    z9 = z2Var.h(canvas, null);
                } else {
                    z9 = true;
                }
                z2Var.T0 = true;
                float alpha = z2Var.getAlpha();
                z2Var.setAlpha(l10 * alpha);
                z2Var.h(canvas, null);
                z2Var.setAlpha(alpha);
                z2Var.T0 = false;
                return z9;
            }
        }
        return z2Var.h(canvas, null);
    }

    public final boolean l2() {
        int selectionOverlayColor = getSelectionOverlayColor();
        if (selectionOverlayColor != 0 && selectionOverlayColor != -65536) {
            return true;
        }
        return false;
    }

    public final boolean l3(boolean z9) {
        zo zoVar;
        q1 q1Var;
        if (this.P5.U2()) {
            Drawable t6 = this.T0.t();
            if (t6 instanceof xg0) {
                final xg0 xg0Var = (xg0) t6;
                String C0 = this.P5.C0();
                TLRPC.TL_messages_stickerSet n02 = ui.b0(this.Z5).n0(C0);
                if (n02 == null) {
                    ui.b0(this.Z5).c1(C0, true, true);
                    return false;
                }
                int D0 = this.P5.D0();
                if ("🎰".equals(this.P5.C0())) {
                    if (D0 >= 0 && D0 <= 64) {
                        zt0 zt0Var = (zt0) xg0Var;
                        if (zt0Var.U0 != null || zt0Var.V0) {
                            q1Var = this;
                        } else {
                            int i7 = D0 - 1;
                            int X = zt0.X(i7 & 3);
                            int X2 = zt0.X((i7 >> 2) & 3);
                            int X3 = zt0.X(i7 >> 4);
                            if (X == 4 && X2 == 4 && X3 == 4) {
                                X = 5;
                                X3 = 5;
                                X2 = 5;
                            }
                            zt0Var.f41106b1 = X;
                            zt0Var.f41107c1 = X2;
                            zt0Var.f41108d1 = X3;
                            ij messageObject = getMessageObject();
                            int i10 = getMessageObject().I1;
                            zt0Var.V0 = true;
                            q1Var = this;
                            Utilities.f21333e.c(new li.p2(zt0Var, n02, i10, messageObject, q1Var, z9));
                        }
                        if (q1Var.P5.O3()) {
                            xg0Var.S(Integer.MAX_VALUE, q1Var.f29951ob);
                        }
                        q1Var.P5.l1 = false;
                    } else {
                        q1Var = this;
                    }
                    if (xg0Var.m0 == null && !xg0Var.Y0 && n02.documents.size() > 0) {
                        zt0 zt0Var2 = (zt0) xg0Var;
                        if (zt0Var2.m0 == null && !zt0Var2.Y0) {
                            zt0Var2.Y0 = true;
                            Utilities.f21333e.c(new ub(zt0Var2, n02, getMessageObject().I1, getMessageObject(), q1Var, 17));
                            return true;
                        }
                    }
                } else {
                    if (xg0Var.m0 == null && !xg0Var.Y0 && n02.documents.size() > 0) {
                        TLRPC.Document document = n02.documents.get(0);
                        org.telegram.messenger.w7.G(this.Z5);
                        File K = org.telegram.messenger.w7.K(document, null, true, true);
                        if (xg0Var.m0 == null && !xg0Var.Y0) {
                            final String y22 = org.telegram.messenger.g0.y2(K, 0);
                            if (TextUtils.isEmpty(y22)) {
                                org.telegram.messenger.z5.q(this.Z5).a(org.telegram.messenger.w7.r(null, document), this.P5, this);
                                org.telegram.messenger.w7.G(this.Z5).X(document, n02, 1, 1);
                            } else {
                                xg0Var.Y0 = true;
                                Utilities.f21333e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final xg0 xg0Var2 = xg0Var;
                                                String str = y22;
                                                if (xg0Var2.W0) {
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    xg0 xg0Var3 = xg0Var2;
                                                                    xg0Var3.Y0 = false;
                                                                    if (!xg0Var3.V0 && xg0Var3.W0) {
                                                                        xg0Var3.C(true);
                                                                        return;
                                                                    }
                                                                    xg0Var3.l();
                                                                    xg0Var3.I();
                                                                    xg0Var3.x();
                                                                    return;
                                                                default:
                                                                    xg0 xg0Var4 = xg0Var2;
                                                                    xg0Var4.V0 = false;
                                                                    if (!xg0Var4.Y0 && xg0Var4.W0) {
                                                                        xg0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                xg0Var2.U0 = RLottieNative.b(str, null, null, null);
                                                int i11 = 0;
                                                if (xg0Var2.U0 != null) {
                                                    i11 = xg0Var2.U0.f31468a[0];
                                                }
                                                if (xg0Var2.U0 != null) {
                                                    int i12 = xg0Var2.U0.f31468a[1];
                                                }
                                                org.telegram.messenger.g0.h3(new r2(xg0Var2, i11, 9));
                                                return;
                                            default:
                                                final xg0 xg0Var3 = xg0Var;
                                                xg0Var3.m0 = RLottieNative.b(y22, xg0Var3.f40956e, null, null);
                                                org.telegram.messenger.g0.h3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                xg0 xg0Var32 = xg0Var3;
                                                                xg0Var32.Y0 = false;
                                                                if (!xg0Var32.V0 && xg0Var32.W0) {
                                                                    xg0Var32.C(true);
                                                                    return;
                                                                }
                                                                xg0Var32.l();
                                                                xg0Var32.I();
                                                                xg0Var32.x();
                                                                return;
                                                            default:
                                                                xg0 xg0Var4 = xg0Var3;
                                                                xg0Var4.V0 = false;
                                                                if (!xg0Var4.Y0 && xg0Var4.W0) {
                                                                    xg0Var4.C(true);
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
                        if (!z9 && this.P5.O3() && (zoVar = (zo) qp.s1(this.Z5).f24775g4.get(C0)) != null && zoVar.f26899b == D0) {
                            xg0Var.S(zoVar.f26898a, this.f29951ob);
                        }
                        TLRPC.Document document2 = n02.documents.get(Math.max(D0, 0));
                        org.telegram.messenger.w7.G(this.Z5);
                        File K2 = org.telegram.messenger.w7.K(document2, null, true, true);
                        if (xg0Var.U0 == null && !xg0Var.V0) {
                            final String y23 = org.telegram.messenger.g0.y2(K2, 0);
                            if (TextUtils.isEmpty(y23)) {
                                org.telegram.messenger.z5.q(this.Z5).a(org.telegram.messenger.w7.r(null, document2), this.P5, this);
                                org.telegram.messenger.w7.G(this.Z5).X(document2, n02, 1, 1);
                                this.P5.l1 = false;
                            } else {
                                if (z9 && xg0Var.Q == null && xg0Var.R == null && xg0Var.P == null) {
                                    xg0Var.J = 2;
                                    xg0Var.X0 = true;
                                }
                                xg0Var.V0 = true;
                                Utilities.f21333e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final xg0 xg0Var2 = xg0Var;
                                                String str = y23;
                                                if (xg0Var2.W0) {
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    xg0 xg0Var32 = xg0Var2;
                                                                    xg0Var32.Y0 = false;
                                                                    if (!xg0Var32.V0 && xg0Var32.W0) {
                                                                        xg0Var32.C(true);
                                                                        return;
                                                                    }
                                                                    xg0Var32.l();
                                                                    xg0Var32.I();
                                                                    xg0Var32.x();
                                                                    return;
                                                                default:
                                                                    xg0 xg0Var4 = xg0Var2;
                                                                    xg0Var4.V0 = false;
                                                                    if (!xg0Var4.Y0 && xg0Var4.W0) {
                                                                        xg0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                xg0Var2.U0 = RLottieNative.b(str, null, null, null);
                                                int i11 = 0;
                                                if (xg0Var2.U0 != null) {
                                                    i11 = xg0Var2.U0.f31468a[0];
                                                }
                                                if (xg0Var2.U0 != null) {
                                                    int i12 = xg0Var2.U0.f31468a[1];
                                                }
                                                org.telegram.messenger.g0.h3(new r2(xg0Var2, i11, 9));
                                                return;
                                            default:
                                                final xg0 xg0Var3 = xg0Var;
                                                xg0Var3.m0 = RLottieNative.b(y23, xg0Var3.f40956e, null, null);
                                                org.telegram.messenger.g0.h3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                xg0 xg0Var32 = xg0Var3;
                                                                xg0Var32.Y0 = false;
                                                                if (!xg0Var32.V0 && xg0Var32.W0) {
                                                                    xg0Var32.C(true);
                                                                    return;
                                                                }
                                                                xg0Var32.l();
                                                                xg0Var32.I();
                                                                xg0Var32.x();
                                                                return;
                                                            default:
                                                                xg0 xg0Var4 = xg0Var3;
                                                                xg0Var4.V0 = false;
                                                                if (!xg0Var4.Y0 && xg0Var4.W0) {
                                                                    xg0Var4.C(true);
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
                        this.P5.l1 = false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean m() {
        dj djVar = this.K;
        if (djVar != null && djVar.f22008i) {
            aj ajVar = this.L;
            if (ajVar != null && (ajVar.f21451l & 8) != 0) {
                return this.F;
            }
            return true;
        }
        return this.F;
    }

    public final boolean m0(float f10, int i7) {
        ch.p0 p0Var = this.N;
        if (!p0Var.H) {
            return false;
        }
        float y10 = getY() + p0Var.f6362c;
        if (y10 <= f10 || (y10 + p0Var.f6370m) - org.telegram.messenger.g0.L(16.0f) >= i7) {
            return false;
        }
        return true;
    }

    public final void m1(Canvas canvas, int i7) {
        int i10;
        gj gjVar;
        ij ijVar;
        l1 l1Var = this.Ra;
        int i11 = 0;
        if (l1Var != null) {
            if (!l1Var.p1(this, 1)) {
                this.f30086z4 = null;
                ArrayList arrayList = this.f30074y4;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < this.f30074y4.size(); i12++) {
                        o1 o1Var = (o1) this.f30074y4.get(i12);
                        if (!o1Var.f29630a.d()) {
                            o1Var.f29630a.a();
                        }
                    }
                }
            } else {
                CharacterStyle C1 = this.Ra.C1(this);
                if (C1 != this.f30086z4) {
                    this.f30086z4 = C1;
                    a80 a80Var = this.f30061x4;
                    if (a80Var != null) {
                        a80Var.a();
                        this.f30061x4 = null;
                    }
                    a80 a80Var2 = new a80();
                    this.f30061x4 = a80Var2;
                    a80Var2.D = true;
                    r70 r70Var = new r70(0);
                    a80 a80Var3 = this.f30061x4;
                    a80Var3.f31747y = r70Var;
                    a80Var3.k(5.0f);
                    ?? obj = new Object();
                    obj.f29630a = this.f30061x4;
                    obj.f29631b = -3;
                    if (this.f30074y4 == null) {
                        this.f30074y4 = new ArrayList();
                    }
                    this.f30074y4.add(obj);
                    if (this.f30086z4 != null && !E1(obj, r70Var, this.f29943o2, -2) && (((gjVar = this.f29908l3) == null || !F1(obj, r70Var, gjVar.f22653e)) && (ijVar = this.P5) != null)) {
                        F1(obj, r70Var, ijVar.f23296z2);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.f30074y4;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ij ijVar2 = this.P5;
            if (ijVar2 != null && ijVar2.Q3()) {
                i10 = org.telegram.ui.ActionBar.k6.Ac;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f28265ze;
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.Pb);
            while (i11 < this.f30074y4.size()) {
                o1 o1Var2 = (o1) this.f30074y4.get(i11);
                if (o1Var2.f29631b == i7) {
                    a80 a80Var4 = o1Var2.f29630a;
                    a80Var4.g(org.telegram.ui.ActionBar.k6.r1(0.85f, w02), org.telegram.ui.ActionBar.k6.r1(2.0f, w02), org.telegram.ui.ActionBar.k6.r1(3.5f, w02), org.telegram.ui.ActionBar.k6.r1(6.0f, w02));
                    a80Var4.draw(canvas);
                    invalidate();
                    if (a80Var4.c()) {
                        this.f30074y4.remove(i11);
                        i11--;
                    }
                }
                i11++;
            }
        }
    }

    public final boolean m2() {
        ArrayList arrayList;
        gj gjVar = this.f29908l3;
        if (gjVar != null && (arrayList = gjVar.f22653e) != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (!((fj) obj).f22397y.isEmpty()) {
                    return true;
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().f23296z2 != null) {
            ArrayList arrayList2 = getMessageObject().f23296z2;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                if (!((fj) obj2).f22397y.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void m3(Drawable drawable, int i7, int i10, int i11, int i12) {
        if (drawable != null) {
            tg0 tg0Var = this.f30081yc;
            x1 x1Var = this.f29868hb;
            if (tg0Var != null && tg0Var.h) {
                this.Gc = 0.0f;
            } else {
                float f10 = i10 + i12 + x1Var.f30803j0;
                this.Gc = f10 - ((int) f10);
            }
            drawable.setBounds((int) (i7 + x1Var.f30793h0), (int) (i10 + x1Var.f30807k0), (int) (i7 + i11 + x1Var.f30798i0), (int) (i10 + i12 + x1Var.f30803j0));
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

    public final void n2(int i7, int i10, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int i11 = i10 - i7;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList.size()) {
                break;
            }
            fj fjVar = (fj) arrayList.get(i12);
            if (i7 >= fjVar.f22392n && i7 < fjVar.f22393r) {
                this.f30082z0 = i12;
                f3();
                try {
                    r70 a32 = a3();
                    a32.f31885c = true;
                    a32.d(fjVar.f22390e, i7, 0.0f);
                    fjVar.f22390e.getSelectionPath(i7, i10, a32);
                    a32.a();
                    float f10 = fjVar.f22395w + fjVar.h;
                    if (i10 >= fjVar.f22392n + i11) {
                        for (int i13 = i12 + 1; i13 < arrayList.size(); i13++) {
                            fj fjVar2 = (fj) arrayList.get(i13);
                            int i14 = fjVar2.f22393r - fjVar2.f22392n;
                            r70 a33 = a3();
                            a33.f31885c = true;
                            float f11 = f10 + fjVar2.f22391f;
                            a33.d(fjVar2.f22390e, 0, f11);
                            f10 = f11 + fjVar2.f22395w + fjVar2.h;
                            fjVar2.f22390e.getSelectionPath(0, i10 - fjVar2.f22392n, a33);
                            a33.a();
                            if (i10 < (fjVar.f22392n + i14) - 1) {
                                break;
                            }
                        }
                    }
                    if (this.A0) {
                        this.f30063x6 = true;
                        this.f30076y6 = 2500;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                invalidate();
            } else {
                i12++;
            }
        }
        this.f29873i3 = -1;
        this.j3 = -1;
    }

    public final void n3() {
        this.f30063x6 = true;
        this.f30076y6 = 1000;
        this.A6 = System.currentTimeMillis();
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    @Override
    public final void o(long j3, long j10) {
        float min;
        int i7;
        TLRPC.Message message;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.P5.F0 = j3;
        RadialProgress2 radialProgress2 = this.P0;
        radialProgress2.p(true, min);
        if (j3 == j10 && ((this.L != null || ((message = this.P5.f23237k) != null && message.paid_message_stars > 0)) && gz.C(this.Z5).J(this.P5.f1()) && ((i7 = this.N3) == 1 || (i7 == 4 && this.L1 == 5)))) {
            this.R0 = true;
            getIconForCurrentState();
            radialProgress2.setIcon(6, false, true);
        }
        long j11 = this.f30083z1;
        if (j11 > 0 && Math.abs(j11 - j10) > 1048576) {
            this.f30083z1 = j10;
        }
        z0(j3, j10);
    }

    public final void o0(Bitmap bitmap, boolean z9) {
        boolean M4 = ij.M4(this.P5.f23237k);
        di.z2 z2Var = this.T0;
        if (M4) {
            if (MediaController.B().I(this.P5)) {
                z2Var.f21217t0 = false;
                z2Var.Q0();
                return;
            }
            z2Var.f21217t0 = true;
            z2Var.P0(false);
            return;
        }
        if (z9) {
            ij ijVar = MediaController.B().f21292u0;
            if (ijVar != null && ijVar.i4()) {
                z9 = false;
            } else {
                z9 = true;
            }
        }
        z2Var.f21217t0 = z9;
        if (bitmap != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
            z2Var.Y = null;
            z2Var.f21175a0 = null;
            z2Var.f21178b0 = null;
            z2Var.f21181c0 = null;
            z2Var.Z0.setShader(null);
            z2Var.N0(bitmapDrawable);
            z2Var.f21202m1 = true;
            z2Var.f21194h1 = 0.0f;
            z2Var.R0(z2Var.m0);
        }
        if (z9) {
            z2Var.P0(false);
        } else {
            z2Var.Q0();
        }
    }

    public void o1(Canvas canvas, float f10, Integer num) {
        boolean z9;
        boolean z10 = this.f30068xb;
        float f11 = 1.0f;
        ch.p0 p0Var = this.N;
        if (z10) {
            p0Var.f6360a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.U4 && k2()) {
            if (p0Var.f6360a > 0.0f) {
                x();
            }
            if (getAlpha() * f10 != 1.0f) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (getAlpha() * f10 * 255.0f), 31);
                z9 = true;
            } else {
                z9 = false;
            }
            int i7 = (p0Var.f6360a > 0.0f ? 1 : (p0Var.f6360a == 0.0f ? 0 : -1));
            x1 x1Var = this.f29868hb;
            if (i7 <= 0 && x1Var.f30858x0 && this.L == null && !this.f30068xb) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + x1Var.f30803j0);
                p0Var.A = 0.0f;
                p0Var.B = false;
                if (x1Var.h) {
                    f11 = x1Var.L1;
                }
                p0Var.d(canvas, f11, num);
                canvas.restore();
            } else {
                p0Var.A = 0.0f;
                p0Var.B = false;
                if (x1Var.h) {
                    f11 = x1Var.L1;
                }
                p0Var.d(canvas, f11, num);
            }
            if (z9) {
                canvas.restore();
            }
        }
    }

    public final void o3(byte[] bArr) {
        ij ijVar = this.Q5;
        if (ijVar == null) {
            ijVar = this.P5;
        }
        if (ijVar == null) {
            this.f29931n3 = null;
            return;
        }
        pg0 pg0Var = this.f29931n3;
        if (pg0Var == null || !pg0Var.f36885f || !Arrays.equals(pg0Var.f36886g, bArr)) {
            this.f29931n3 = new pg0(this, ijVar.f1(), bArr);
        }
        this.A0 = true;
    }

    @Override
    public final void onAttachedToWindow() {
        q1 q1Var;
        float f10;
        float f11;
        sh.e eVar;
        sh.e eVar2;
        org.telegram.ui.Components.y8 y8Var;
        super.onAttachedToWindow();
        ab.b0 b0Var = this.f30042vc;
        if (b0Var != null) {
            b0Var.b();
            this.f30042vc = null;
        }
        ab.b0 b0Var2 = new ab.b0(qs.f(this.Z5), this);
        b0Var2.c(qs.E0);
        b0Var2.e(qs.f25019m1);
        b0Var2.e(qs.l1);
        b0Var2.e(qs.f25001i4);
        b0Var2.e(qs.W2);
        this.f30042vc = b0Var2;
        ij ijVar = this.P5;
        if (ijVar != null) {
            ijVar.f23230i1 = false;
            kv kvVar = ijVar.f23284w2;
            if (kvVar != null) {
                kvVar.b(this);
            }
        }
        kv kvVar2 = this.f29868hb.M0;
        if (kvVar2 != null) {
            kvVar2.b(this);
        }
        v1 v1Var = this.f29861h3;
        if (v1Var != null && (y8Var = v1Var.f30612b) != null) {
            y8Var.e();
        }
        w1 w1Var = this.f30046w2;
        if (w1Var != null && (eVar2 = w1Var.f30705m) != null) {
            eVar2.b();
        }
        w1 w1Var2 = this.f30046w2;
        if (w1Var2 != null && (eVar = w1Var2.f30706n) != null) {
            eVar.b();
        }
        ArrayList arrayList = this.P4;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((p1) obj).a();
        }
        ij ijVar2 = this.Q5;
        if (ijVar2 != null) {
            ijVar2.f23230i1 = false;
            q1Var = this;
            q1Var.u3(ijVar2, this.R5, this.T5, this.S5, this.U5, this.V5);
            q1Var.Q5 = null;
            q1Var.R5 = null;
        } else {
            q1Var = this;
        }
        CheckBoxBase checkBoxBase = q1Var.l1;
        if (checkBoxBase != null) {
            checkBoxBase.f31253l = true;
        }
        CheckBoxBase checkBoxBase2 = q1Var.f29895k1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f31253l = true;
        }
        f01 f01Var = q1Var.f29818e0;
        if (f01Var != null) {
            f01Var.a();
        }
        CheckBoxBase checkBoxBase3 = q1Var.O7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f31253l = true;
        }
        if (q1Var.f29825e7 != null) {
            int i10 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = q1Var.f29825e7;
                if (i10 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i10].f31253l = true;
                i10++;
            }
        }
        q1Var.N0 = true;
        float f12 = 0.0f;
        q1Var.Vc = 0.0f;
        q1Var.Uc = 0.0f;
        q1Var.f29967q1 = 0;
        Y3();
        ImageReceiver imageReceiver = q1Var.f30089z7;
        imageReceiver.H0((View) getParent());
        imageReceiver.P();
        m1 m1Var = q1Var.fc;
        if (m1Var != null) {
            m1Var.f29531b.P();
        }
        m1 m1Var2 = q1Var.f29856gc;
        if (m1Var2 != null) {
            m1Var2.f29531b.P();
        }
        N();
        ij ijVar3 = q1Var.P5;
        if (ijVar3 != null) {
            setAvatar(ijVar3);
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
        if (getDelegate() != null && getDelegate().k2() != null) {
            j9 k22 = getDelegate().k2();
            k22.getClass();
            if (getMessageObject() != null && getMessageObject().f1() == k22.f30676w) {
                k22.W = q1Var;
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
        ch.p0 p0Var = q1Var.N;
        ArrayList arrayList2 = p0Var.f6376s;
        p0Var.D = true;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            ((ch.m0) arrayList2.get(i12)).a();
        }
        org.telegram.messenger.n6 n6Var = q1Var.mb;
        if (n6Var != null) {
            n6Var.a();
        }
        l4 l4Var = q1Var.W5;
        if (l4Var != null) {
            ArrayList arrayList3 = l4Var.f29489c;
            if (!l4Var.C) {
                l4Var.C = true;
                xh.e eVar3 = l4Var.f29496l;
                if (eVar3 != null) {
                    eVar3.b(l4Var.f29487a);
                }
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    k4 k4Var = (k4) arrayList3.get(i13);
                    if (!k4Var.M) {
                        k4Var.M = true;
                        k4Var.f29420f.P();
                    }
                }
            }
        }
        Q3();
        ij ijVar4 = q1Var.P5;
        if (ijVar4 != null && ijVar4.D == 20 && q1Var.W9 != null) {
            invalidate();
        }
        org.telegram.ui.Components.g5 g5Var = q1Var.f29963pa;
        if (g5Var != null) {
            g5Var.a();
        }
        org.telegram.ui.Components.g5 g5Var2 = q1Var.f29976qa;
        if (g5Var2 != null) {
            g5Var2.a();
        }
        xh.e eVar4 = q1Var.P9;
        if (eVar4 != null) {
            if (eVar4.f58690i) {
                xh.e V2 = V2();
                q1Var.P9 = V2;
                Integer num = q1Var.Q9;
                if (num != null) {
                    V2.f58692k.put(this, num);
                }
            } else {
                eVar4.a(this);
            }
        }
        l0 l0Var = q1Var.f30043w;
        if (l0Var != null) {
            ArrayList arrayList4 = l0Var.f29475q;
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((k0) arrayList4.get(i14)).a();
            }
        }
        dv0 dv0Var = q1Var.f29819e1;
        if (dv0Var != null) {
            for (int i15 = 0; i15 < dv0Var.f33051b; i15++) {
                dv0Var.f33052c[i15].a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        u1 u1Var;
        org.telegram.ui.Components.y8 y8Var;
        bg.q qVar;
        sh.e eVar;
        sh.e eVar2;
        super.onDetachedFromWindow();
        ab.b0 b0Var = this.f30042vc;
        if (b0Var != null) {
            b0Var.b();
            this.f30042vc = null;
        }
        AnimatorSet animatorSet = this.X5;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.X5 = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
            setRotation(0.0f);
        }
        CheckBoxBase checkBoxBase = this.l1;
        if (checkBoxBase != null) {
            checkBoxBase.f31253l = false;
        }
        w1 w1Var = this.f30046w2;
        if (w1Var != null && (eVar2 = w1Var.f30705m) != null) {
            eVar2.f55206b.R();
            eVar2.f55221y.f();
        }
        w1 w1Var2 = this.f30046w2;
        if (w1Var2 != null && (eVar = w1Var2.f30706n) != null) {
            eVar.f55206b.R();
            eVar.f55221y.f();
        }
        w1 w1Var3 = this.f30046w2;
        if (w1Var3 != null && (qVar = w1Var3.f30702j) != null) {
            qVar.b();
            this.f30046w2.f30702j = null;
        }
        kv kvVar = this.P5.f23284w2;
        if (kvVar != null) {
            kvVar.f(this);
        }
        x1 x1Var = this.f29868hb;
        kv kvVar2 = x1Var.M0;
        if (kvVar2 != null) {
            kvVar2.f(this);
        }
        ArrayList arrayList = this.P4;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((p1) obj).b();
        }
        v1 v1Var = this.f29861h3;
        if (v1Var != null && (y8Var = v1Var.f30612b) != null) {
            y8Var.f();
        }
        CheckBoxBase checkBoxBase2 = this.f29895k1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f31253l = false;
        }
        if (this.f29825e7 != null) {
            int i10 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.f29825e7;
                if (i10 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i10].f31253l = false;
                i10++;
            }
        }
        CheckBoxBase checkBoxBase3 = this.O7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f31253l = false;
        }
        this.N0 = false;
        l4 l4Var = this.W5;
        if (l4Var != null) {
            l4Var.e();
        }
        this.f30089z7.R();
        m1 m1Var = this.fc;
        if (m1Var != null) {
            m1Var.f29531b.R();
        }
        m1 m1Var2 = this.f29856gc;
        if (m1Var2 != null) {
            m1Var2.f29531b.R();
        }
        f01 f01Var = this.f29818e0;
        if (f01Var != null) {
            f01Var.b();
        }
        N();
        if (this.F3 && (u1Var = this.f29994s0) != null && u1Var.d != null && u1Var.f30551e != null) {
            gc D = gc.D();
            String str = this.f29994s0.d;
            if (str != null) {
                D.A.remove(str);
            }
            this.F3 = false;
        }
        dv0 dv0Var = this.f29819e1;
        if (dv0Var != null) {
            dv0Var.a(this);
        }
        org.telegram.messenger.z5.q(this.Z5).v(this);
        if (getDelegate() != null && getDelegate().k2() != null) {
            j9 k22 = getDelegate().k2();
            k22.getClass();
            if (getMessageObject() != null && getMessageObject().f1() == k22.f30676w) {
                k22.W = null;
            }
        }
        x1Var.f30854w0 = false;
        if (MediaController.B().I(this.P5)) {
            org.telegram.ui.ActionBar.k6.A0().f32458i = null;
        }
        ValueAnimator valueAnimator = this.f30015tb;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f30015tb.cancel();
        }
        this.N.p();
        this.f30003sb = false;
        org.telegram.messenger.n6 n6Var = this.mb;
        if (n6Var != null) {
            n6Var.e();
        }
        org.telegram.ui.Components.g5 g5Var = this.f29963pa;
        if (g5Var != null) {
            g5Var.b();
        }
        org.telegram.ui.Components.g5 g5Var2 = this.f29976qa;
        if (g5Var2 != null) {
            g5Var2.b();
        }
        xh.e eVar3 = this.P9;
        if (eVar3 != null) {
            eVar3.b(this);
        }
        l0 l0Var = this.f30043w;
        if (l0Var != null) {
            ArrayList arrayList2 = l0Var.f29475q;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                k0 k0Var = (k0) arrayList2.get(i11);
                int i12 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = k0Var.f29390c;
                    if (i12 < imageReceiverArr.length) {
                        imageReceiverArr[i12].R();
                        i12++;
                    }
                }
            }
        }
        bg.k.d().f(this.Ac);
    }

    @Override
    public void onDraw(Canvas canvas) {
        d1(canvas);
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z9;
        ck0 a42 = a4();
        int i7 = 0;
        if (a42 != null && motionEvent.isFromSource(8194)) {
            float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.f29858h0 + this.f30005t0;
            motionEvent.offsetLocation(-this.f29929n0, -topicSeparatorTopPadding);
            Rect rect = a42.f22444b;
            if (a42.f32595d0 != null && a42.f32596e0) {
                motionEvent.offsetLocation((-rect.left) + a42.f32601j0, -rect.top);
                try {
                    if (motionEvent.getX() >= 0.0f && motionEvent.getX() < a42.u0() && motionEvent.getY() >= 0.0f && motionEvent.getY() < a42.f32600i0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    a42.f32595d0.l(motionEvent, z9);
                    motionEvent.offsetLocation(rect.left - a42.f32601j0, rect.top);
                } catch (Throwable th2) {
                    motionEvent.offsetLocation(rect.left - a42.f32601j0, rect.top);
                    throw th2;
                }
            }
            motionEvent.offsetLocation(this.f29929n0, topicSeparatorTopPadding);
        }
        int x10 = (int) motionEvent.getX();
        int M1 = (int) M1(motionEvent);
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            while (true) {
                SparseArray sparseArray = this.f30055wb;
                if (i7 >= sparseArray.size()) {
                    break;
                } else if (((Rect) sparseArray.valueAt(i7)).contains(x10, M1)) {
                    int keyAt = sparseArray.keyAt(i7);
                    if (keyAt != this.Kb) {
                        this.Kb = keyAt;
                        h3(keyAt, 32768, null);
                    }
                    return true;
                } else {
                    i7++;
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
    public void onMeasure(int i7, int i10) {
        q1 q1Var;
        int i11;
        ij ijVar = this.P5;
        boolean z9 = true;
        if (ijVar == null || (!ijVar.I() && this.U3 == org.telegram.messenger.g0.f22537q.y)) {
            q1Var = this;
        } else {
            this.B0 = true;
            ij ijVar2 = this.P5;
            this.P5 = null;
            q1Var = this;
            q1Var.v3(ijVar2, this.K, this.F, this.E, this.G, false);
            q1Var.B0 = false;
        }
        W3();
        int i12 = q1Var.V + q1Var.f29832f0 + q1Var.f29858h0 + q1Var.f30017u0 + q1Var.f30044w0 + q1Var.f29806d0;
        jh.a draftMessageMeasureController = getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(q1Var.P5)) {
            int max = Math.max(0, (((draftMessageMeasureController.f17006a.getHeight() - draftMessageMeasureController.f17006a.getPaddingTop()) - draftMessageMeasureController.f17006a.getPaddingBottom()) - draftMessageMeasureController.d) - i12);
            if (max <= 0) {
                z9 = false;
            }
            draftMessageMeasureController.f17009e = z9;
            if (draftMessageMeasureController.f17007b > 0 && !z9) {
                draftMessageMeasureController.c(0, 0L);
            }
            i11 = max + i12;
        } else {
            i11 = i12;
        }
        q1Var.Dc = Math.max(0, i11 - i12);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), i11);
    }

    @Override
    public final void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (this.J6) {
            ij ijVar = this.P5;
            if (ijVar != null && (charSequence2 = ijVar.v) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.P5.v);
                return;
            }
            ij ijVar2 = this.P5;
            if (ijVar2 != null && (charSequence = ijVar2.f23293z) != null && charSequence.length() > 0) {
                viewStructure.setText(this.P5.f23293z);
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
            if ((this.f29771a6 || (this.K != null && q2())) && getParent() != null) {
                View view = (View) getParent();
                if (view.getParent() != null) {
                    view.invalidate();
                    ((View) view.getParent()).invalidate();
                }
            }
            if (this.Vb && (l1Var = this.Ra) != null) {
                l1Var.p();
            }
        }
    }

    public final boolean p1(Canvas canvas) {
        boolean z9 = this.f30068xb;
        float f10 = 1.0f;
        ch.p0 p0Var = this.N;
        if (z9) {
            p0Var.f6360a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z10 = false;
        if (!this.U4 || !k2()) {
            return false;
        }
        if (p0Var.f6360a > 0.0f) {
            x();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z10 = true;
        }
        int i7 = (p0Var.f6360a > 0.0f ? 1 : (p0Var.f6360a == 0.0f ? 0 : -1));
        x1 x1Var = this.f29868hb;
        if (i7 <= 0 && x1Var.f30858x0 && this.L == null && !this.f30068xb) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + x1Var.f30803j0);
            if (x1Var.h) {
                f10 = x1Var.L1;
            }
            p0Var.e(canvas, f10);
            canvas.restore();
        } else {
            if (x1Var.h) {
                f10 = x1Var.L1;
            }
            p0Var.e(canvas, f10);
        }
        if (z10) {
            canvas.restore();
        }
        return true;
    }

    public final void p2() {
        l1 l1Var = this.Ra;
        if (l1Var != null && l1Var.g()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void p3(CharacterStyle characterStyle) {
        int i7;
        int i10;
        int i11;
        int i12;
        ij ijVar = this.Q5;
        if (ijVar == null) {
            ijVar = this.P5;
        }
        this.A0 = false;
        ArrayList arrayList = this.f30048w4;
        if (ijVar != null && ijVar.f23237k.message != null && characterStyle != null) {
            if (this.f29908l3 != null && !TextUtils.isEmpty(ijVar.f23293z)) {
                CharSequence charSequence = ijVar.f23293z;
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
                        for (int i14 = 0; i14 < this.f29908l3.f22653e.size(); i14++) {
                            fj fjVar = (fj) this.f29908l3.f22653e.get(i14);
                            if (i12 >= fjVar.f22392n && i12 < fjVar.f22393r) {
                                this.f30082z0 = i14;
                                this.A0 = false;
                                f3();
                                try {
                                    r70 a32 = a3();
                                    a32.d(fjVar.f22390e, i12, 0.0f);
                                    fjVar.f22390e.getSelectionPath(i12, i11, a32);
                                    if (i11 >= fjVar.f22392n + i13) {
                                        for (int i15 = i14 + 1; i15 < this.f29908l3.f22653e.size(); i15++) {
                                            fj fjVar2 = (fj) this.f29908l3.f22653e.get(i15);
                                            int i16 = fjVar2.f22393r - fjVar2.f22392n;
                                            r70 a33 = a3();
                                            a33.d(fjVar2.f22390e, 0, fjVar2.f22395w);
                                            fjVar2.f22390e.getSelectionPath(0, i11 - fjVar2.f22392n, a33);
                                            if (i11 < (fjVar.f22392n + i16) - 1) {
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
            CharSequence charSequence2 = ijVar.v;
            if ((charSequence2 instanceof Spanned) && ijVar.f23296z2 != null) {
                Spanned spanned2 = (Spanned) charSequence2;
                CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) spanned2.getSpans(0, spanned2.length(), CharacterStyle.class);
                if (characterStyleArr2 != null && characterStyleArr2.length > 0) {
                    for (CharacterStyle characterStyle3 : characterStyleArr2) {
                        if (characterStyle3 == characterStyle) {
                            i10 = spanned2.getSpanStart(characterStyle);
                            i7 = spanned2.getSpanEnd(characterStyle);
                            break;
                        }
                    }
                }
                i7 = -1;
                i10 = -1;
                if (i10 >= 0 && i7 >= 0) {
                    int i17 = i7 - i10;
                    for (int i18 = 0; i18 < ijVar.f23296z2.size(); i18++) {
                        fj fjVar3 = (fj) ijVar.f23296z2.get(i18);
                        if (i10 >= fjVar3.f22392n && i10 < fjVar3.f22393r) {
                            this.f30082z0 = i18;
                            this.A0 = false;
                            f3();
                            try {
                                r70 a34 = a3();
                                a34.d(fjVar3.f22390e, i10, 0.0f);
                                fjVar3.f22390e.getSelectionPath(i10, i7, a34);
                                if (i7 >= fjVar3.f22392n + i17) {
                                    for (int i19 = i18 + 1; i19 < ijVar.f23296z2.size(); i19++) {
                                        fj fjVar4 = (fj) ijVar.f23296z2.get(i19);
                                        int i20 = fjVar4.f22393r - fjVar4.f22392n;
                                        r70 a35 = a3();
                                        a35.d(fjVar4.f22390e, 0, fjVar4.f22395w);
                                        fjVar4.f22390e.getSelectionPath(0, i7 - fjVar4.f22392n, a35);
                                        if (i7 < (fjVar3.f22392n + i20) - 1) {
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
                this.f30082z0 = -1;
                this.A0 = false;
                f3();
                invalidate();
            }
        } else if (!arrayList.isEmpty()) {
            this.f30082z0 = -1;
            this.A0 = false;
            f3();
            invalidate();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        q1 q1Var;
        ArrayList arrayList;
        l1 l1Var = this.Ra;
        int i10 = 0;
        if (l1Var != null && l1Var.g2(i7)) {
            return false;
        }
        if (i7 == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                E0(false);
                return true;
            } else if (this.P5.D == 16) {
                this.Ra.B0(this, this.R3, this.S3);
                return true;
            } else {
                D0();
                return true;
            }
        }
        if (i7 == 2131296267) {
            F0();
        } else if (i7 == 2131296264) {
            l1 l1Var2 = this.Ra;
            if (l1Var2 != null) {
                if (this.P5.D == 16) {
                    l1Var2.p0(this, 0.0f, 0.0f);
                } else {
                    l1Var2.B0(this, this.R3, this.S3);
                }
            }
        } else {
            if (i7 == 2131296265) {
                l1 l1Var3 = this.Ra;
                if (l1Var3 != null) {
                    TLRPC.Chat chat = this.f30014ta;
                    if (chat != null) {
                        q1Var = this;
                        l1Var3.U(q1Var, chat, this.P5.f23237k.fwd_from.channel_post, this.f29845g1, this.f29859h1, false);
                    } else {
                        q1Var = this;
                        TLRPC.User user = q1Var.f29990ra;
                        if (user != null) {
                            l1Var3.s0(this, user, q1Var.f29845g1, q1Var.f29859h1);
                        } else if (q1Var.f30027ua != null) {
                            l1Var3.o(this);
                        }
                    }
                }
            } else {
                q1Var = this;
                if (i7 == 2131296268) {
                    l1 l1Var4 = q1Var.Ra;
                    if (l1Var4 != null) {
                        l1Var4.G0(this);
                    }
                } else if (i7 == 2131296263 && q1Var.Ra != null && (arrayList = q1Var.P5.f23296z2) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i10);
                        i10++;
                        fj fjVar = (fj) obj;
                        if (fjVar.N) {
                            q1Var.Ra.J(fjVar);
                            break;
                        }
                    }
                }
            }
            if ((!ij.S4(q1Var.P5.f23237k) || q1Var.P5.i4() || (q1Var.P5.J3() && MediaController.B().I(q1Var.P5))) && q1Var.E4.g(null, i7, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i7, bundle);
        }
        q1Var = this;
        if (!ij.S4(q1Var.P5.f23237k)) {
        }
        return true;
    }

    @Override
    public final boolean q() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.q():boolean");
    }

    public final int q0(ij ijVar, dj djVar, boolean z9) {
        dj djVar2 = djVar;
        di.z2 z2Var = this.T0;
        z2Var.f21205o0 = true;
        ImageReceiver imageReceiver = this.f30089z7;
        imageReceiver.f21205o0 = true;
        ImageReceiver imageReceiver2 = this.S7;
        imageReceiver2.f21205o0 = true;
        ImageReceiver imageReceiver3 = this.E7;
        imageReceiver3.f21205o0 = true;
        int i7 = 0;
        if (djVar2 != null) {
            ArrayList arrayList = djVar2.d;
            if (arrayList.size() != 1) {
                if (arrayList.size() != djVar2.f22006f.size()) {
                    djVar2.a();
                }
                this.Sc = 0;
                int i10 = 0;
                while (i7 < arrayList.size()) {
                    ij ijVar2 = (ij) arrayList.get(i7);
                    aj d = djVar2.d(ijVar2);
                    if (d != null && (d.f21451l & 1) != 0) {
                        u3(ijVar2, djVar2, false, false, false, false);
                        if (z9 && !TextUtils.isEmpty(this.f29944o3)) {
                            O3();
                            this.Sc = (int) (i10 + this.f29997s3);
                            this.Tc = this.f29908l3;
                        }
                        i10 = this.f30017u0 + this.f30044w0 + i10;
                    }
                    i7++;
                    djVar2 = djVar;
                }
                return i10;
            }
        }
        u3(ijVar, djVar, false, false, false, false);
        z2Var.f21205o0 = false;
        imageReceiver.f21205o0 = false;
        imageReceiver2.f21205o0 = false;
        imageReceiver3.f21205o0 = false;
        O3();
        return this.f30017u0 + this.f30044w0;
    }

    public final void q1(Canvas canvas, kv kvVar, float f10, ColorFilter colorFilter) {
        Canvas canvas2;
        int save;
        if (kvVar != null && f10 > 0.0f && kvVar.C()) {
            if (f10 < 1.0f) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f10 * 255.0f), 31);
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(this.f29929n0, this.f30005t0);
            kvVar.i(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public final boolean q2() {
        if (this.f30009t4.f20251a <= 0 && this.N.f6373p) {
            ij ijVar = this.P5;
            if (ijVar == null || !ijVar.f23264r1) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void q3(int i7) {
        ij ijVar = this.Q5;
        if (ijVar == null) {
            ijVar = this.P5;
        }
        if (ijVar == null) {
            this.f29931n3 = null;
            return;
        }
        pg0 pg0Var = this.f29931n3;
        if (pg0Var == null || !pg0Var.f36884e || pg0Var.f36883c != (-i7)) {
            this.f29931n3 = new pg0(this, ijVar.f1(), i7);
        }
        this.A0 = true;
    }

    public final void r0(q1 q1Var) {
        if (q1Var == null) {
            return;
        }
        q1Var.f29824e6 = this.f29824e6;
        q1Var.f29986r6 = this.f29986r6;
        q1Var.f29850g6 = this.f29850g6;
        q1Var.f29864h6 = this.f29864h6;
        q1Var.f29876i6 = this.f29876i6;
        q1Var.f29887j6 = this.f29887j6;
        q1Var.f29900k6 = this.f29900k6;
        q1Var.f29911l6 = this.f29911l6;
        q1Var.f29923m6 = this.f29923m6;
        q1Var.f29934n6 = this.f29934n6;
        q1Var.f29946o6 = this.f29946o6;
        q1Var.f29959p6 = this.f29959p6;
        q1Var.f29999s6 = this.f29999s6;
        q1Var.t6 = this.t6;
        q1Var.f30023u6 = this.f30023u6;
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
        if (this.K != null && getParent() != null) {
            ((ViewGroup) getParent()).invalidate();
        }
        invalidate();
    }

    public final void r3(String str) {
        s3(false, -1, str, false);
    }

    @Override
    public final void requestLayout() {
        if (this.B0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(q1 q1Var) {
        xh.e eVar;
        if (q1Var != null && (eVar = q1Var.P9) != null) {
            int i7 = (Integer) eVar.f58692k.get(q1Var);
            if (i7 == null) {
                i7 = 0;
            }
            this.Q9 = i7;
            xh.e eVar2 = this.P9;
            if (eVar2 != null) {
                eVar2.f58692k.put(this, i7);
            }
        }
    }

    public final void s1(Canvas canvas, Integer num, float f10, boolean z9) {
        aj ajVar = this.L;
        if (ajVar != null) {
            int i7 = ajVar.f21451l;
            if ((i7 & 8) == 0 || (i7 & 1) == 0) {
                return;
            }
        }
        ch.p0 p0Var = this.N;
        p0Var.getClass();
        p0Var.A = f10;
        p0Var.B = z9;
        p0Var.d(canvas, this.f29868hb.L1, num);
    }

    public final boolean s2() {
        dj djVar;
        if (t2() && (djVar = this.K) != null && this.L != null && !djVar.f22003b && !djVar.f22008i) {
            return true;
        }
        return false;
    }

    public final boolean s3(boolean r25, int r26, java.lang.String r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.s3(boolean, int, java.lang.String, boolean):boolean");
    }

    public void setAllowAssistant(boolean z9) {
        this.J6 = z9;
    }

    @Override
    public void setAlpha(float f10) {
        boolean z9;
        boolean z10 = false;
        if (f10 == 1.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getAlpha() == 1.0f) {
            z10 = true;
        }
        if (z9 != z10) {
            invalidate();
        }
        if (this.f29842fb) {
            this.f29855gb = f10;
            invalidate();
        } else {
            super.setAlpha(f10);
        }
        aj ajVar = this.L;
        if ((ajVar != null && (ajVar.f21444c != 0 || ajVar.f21442a != 0)) || ((this.f30069y && !ij.S4(this.P5.f23237k)) || this.P7 == null || this.Q7 == null)) {
            aj ajVar2 = this.L;
            if (ajVar2 != null) {
                int i7 = ajVar2.f21451l;
                if ((i7 & 8) == 0 || (i7 & 1) == 0) {
                    return;
                }
            }
            this.N.getClass();
        }
        invalidate();
    }

    public void setAnimationOffsetX(float f10) {
        if (this.Vc != f10) {
            this.Vc = f10;
            Y3();
        }
    }

    public void setAvatar(ij ijVar) {
        if (ijVar != null) {
            int i7 = ijVar.I1;
            if (!this.F6 && !e2()) {
                this.f29904ka = null;
                return;
            }
            Drawable drawable = ijVar.f23240k2;
            ImageReceiver imageReceiver = this.f30089z7;
            if (drawable != null) {
                imageReceiver.w0(drawable);
                return;
            }
            TLRPC.User user = this.f29879ia;
            org.telegram.ui.Components.w8 w8Var = this.A7;
            if (user != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null) {
                    this.f29904ka = userProfilePhoto.photo_small;
                } else {
                    this.f29904ka = null;
                }
                w8Var.r(user);
                imageReceiver.j0(this.f29879ia, w8Var, null, rc.e(360928), 1, false);
                return;
            }
            TLRPC.Chat chat = this.f29891ja;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    this.f29904ka = chatPhoto.photo_small;
                } else {
                    this.f29904ka = null;
                }
                if (chat.signature_profiles && ij.B0(ijVar.f23237k) != 1271266957) {
                    long o4 = org.telegram.messenger.m5.o(ijVar.f23237k.from_id);
                    if (o4 >= 0) {
                        TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(o4));
                        w8Var.r(a22);
                        imageReceiver.i0(a22, w8Var, null);
                        return;
                    }
                    TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-o4));
                    w8Var.q(M0);
                    imageReceiver.i0(M0, w8Var, null);
                    return;
                }
                w8Var.q(this.f29891ja);
                imageReceiver.i0(this.f29891ja, w8Var, null);
            } else if (ijVar.s4()) {
                TLRPC.Photo photo = ijVar.T0;
                if (photo != null) {
                    imageReceiver.q0(hc.i(org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(50.0f), false, null, true), ijVar.T0), "50_50", w8Var, null, null, 0);
                }
            } else {
                this.f29904ka = null;
                w8Var.k(ijVar.Z0(), null, null, null);
                imageReceiver.q0(null, null, w8Var, null, null, 0);
            }
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.setBackgroundTopY(boolean):void");
    }

    public void setDelegate(l1 l1Var) {
        this.Ra = l1Var;
    }

    public void setDrawSelectionBackground(boolean z9) {
        if (this.f29883j1 != z9) {
            this.f29883j1 = z9;
            invalidate();
        }
    }

    public void setEnterTransitionInProgress(boolean z9) {
        this.f30069y = z9;
        invalidate();
    }

    public void setFullyDraw(boolean z9) {
        this.J0 = z9;
    }

    public void setHideSideButtonByQuickShare(boolean z9) {
        if (this.D8 != z9) {
            this.D8 = z9;
            boolean z10 = this.f29771a6;
            this.f29771a6 = true;
            invalidate();
            this.f29771a6 = z10;
        }
    }

    public void setHighlighted(boolean z9) {
        if (this.f30050w6 != z9) {
            this.f30050w6 = z9;
            if (z9) {
                this.f29931n3 = null;
            }
            if (!z9) {
                this.A6 = System.currentTimeMillis();
                this.f30063x6 = true;
                this.f30076y6 = 300;
            } else {
                this.f30063x6 = false;
                this.f30076y6 = 0;
            }
            S3();
            if (this.B4) {
                this.D4.f36990o = x2();
            } else {
                this.C4.f34986p = x2();
            }
            invalidate();
            if (getParent() != null) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setImageCoords(RectF rectF) {
        t3(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public void setInstantButtonPressed(boolean z9) {
        if (this.G2 == null) {
            this.G2 = new ic(this);
        }
        ic icVar = this.G2;
        this.F2 = z9;
        icVar.c(z9);
    }

    public void setInvalidateListener(Runnable runnable) {
        this.Cc = runnable;
    }

    public void setInvalidateSpoilersParent(boolean z9) {
        this.m0 = z9;
    }

    public void setInvalidatesParent(boolean z9) {
        this.f29771a6 = z9;
    }

    public void setIsUpdating(boolean z9) {
        this.O0 = true;
    }

    public void setMessageObjectInternal(org.telegram.messenger.ij r68) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.setMessageObjectInternal(org.telegram.messenger.ij):void");
    }

    public void setOverrideInvalidate(Runnable runnable) {
        this.Bc = runnable;
    }

    @Override
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        S3();
        if (this.B4) {
            this.D4.f36990o = x2();
        } else {
            this.C4.f34986p = x2();
        }
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.Pb = f6Var;
        RadialProgress2 radialProgress2 = this.P0;
        if (radialProgress2 != null) {
            radialProgress2.F = f6Var;
        }
        RadialProgress2 radialProgress22 = this.Q0;
        if (radialProgress22 != null) {
            radialProgress22.F = f6Var;
        }
        ek0 ek0Var = this.f29795c3;
        if (ek0Var != null) {
            ek0Var.f33274n = f6Var;
        }
    }

    public void setScrimBlockBounds(RectF rectF) {
        this.Xc = rectF;
    }

    public void setScrimReaction(Integer num) {
        this.N.f6382z = num;
    }

    public void setSelectedBackgroundProgress(float f10) {
        this.Ya = f10;
        invalidate();
    }

    public void setShowTopic(boolean z9) {
        if (this.Jc != z9) {
            this.Jc = z9;
            p2();
            invalidate();
        }
    }

    public void setSlidingOffset(float f10) {
        if (this.Uc != f10) {
            this.Uc = f10;
            Y3();
        }
    }

    public void setSpoilersSuppressed(boolean z9) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Sb;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((xh.f) arrayList.get(i7)).invalidateSelf();
            i7++;
        }
        gj gjVar = this.f29908l3;
        if (gjVar != null && gjVar.f22653e != null) {
            for (int i10 = 0; i10 < this.f29908l3.f22653e.size(); i10++) {
                fj fjVar = (fj) this.f29908l3.f22653e.get(i10);
                for (int i11 = 0; i11 < fjVar.f22397y.size(); i11++) {
                    ((xh.f) fjVar.f22397y.get(i11)).invalidateSelf();
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().f23296z2 != null) {
            for (int i12 = 0; i12 < getMessageObject().f23296z2.size(); i12++) {
                fj fjVar2 = (fj) getMessageObject().f23296z2.get(i12);
                for (int i13 = 0; i13 < fjVar2.f22397y.size(); i13++) {
                    ((xh.f) fjVar2.f22397y.get(i13)).invalidateSelf();
                }
            }
        }
    }

    public void setTimeAlpha(float f10) {
        this.f29885j4 = f10;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
    }

    public final void t1(ol olVar, Canvas canvas, int i7, Integer num, float f10) {
        aj ajVar = this.L;
        if (ajVar != null) {
            int i10 = ajVar.f21451l;
            if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                return;
            }
        }
        ch.p0 p0Var = this.N;
        p0Var.getClass();
        p0Var.A = f10;
        p0Var.f(olVar, canvas, i7, num);
    }

    public final boolean t2() {
        ij ijVar;
        if (v2() && (ijVar = this.P5) != null && !ijVar.Q3()) {
            return true;
        }
        return false;
    }

    public final void t3(float f10, float f11, float f12, float f13) {
        di.z2 z2Var = this.T0;
        z2Var.y0(f10, f11, f12, f13);
        int i7 = this.L1;
        if (i7 != 4 && i7 != 2) {
            return;
        }
        this.L3 = (int) (z2Var.K0 + org.telegram.messenger.g0.L(8.0f));
        int L = (int) (z2Var.L0 + org.telegram.messenger.g0.L(8.0f));
        this.M3 = L;
        int i10 = this.L3;
        int L2 = org.telegram.messenger.g0.L(24.0f) + this.M3;
        this.Q0.r(i10, L, org.telegram.messenger.g0.L(24.0f) + i10, L2);
        this.J3 = (int) com.google.android.recaptcha.internal.a.A(z2Var.M0, org.telegram.messenger.g0.L(48.0f), 2.0f, f10);
        int A = (int) com.google.android.recaptcha.internal.a.A(z2Var.N0, org.telegram.messenger.g0.L(48.0f), 2.0f, z2Var.L0);
        this.K3 = A;
        int i11 = this.J3;
        int L3 = org.telegram.messenger.g0.L(48.0f) + this.K3;
        this.P0.r(i11, A, org.telegram.messenger.g0.L(48.0f) + i11, L3);
    }

    public final void u0(q1 q1Var) {
        q1Var.z3(this.f29952oc, this.f29978qc, this.f29992rc, this.f30004sc, this.f30016tc, this.K0, this.L0, this.f29803cb, this.f29816db, this.f29965pc);
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
            canvas.drawRoundRect(rectF, f10, f10, org.telegram.ui.ActionBar.k6.f27918h2);
        }
    }

    public final boolean u2() {
        return t2();
    }

    public final void u3(org.telegram.messenger.ij r111, org.telegram.messenger.dj r112, boolean r113, boolean r114, boolean r115, boolean r116) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.u3(org.telegram.messenger.ij, org.telegram.messenger.dj, boolean, boolean, boolean, boolean):void");
    }

    public final boolean v() {
        if (this.P5.u2() && !this.P5.M0 && this.L9 == 0.0f && this.U0.n() != null) {
            return false;
        }
        return true;
    }

    public final void v0() {
        if (this.f29888j7 == null) {
            this.f29888j7 = new ImageReceiver[3];
            this.f29901k7 = new org.telegram.ui.Components.w8[3];
            this.f29912l7 = new boolean[3];
            int i7 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.f29888j7;
                if (i7 < imageReceiverArr.length) {
                    imageReceiverArr[i7] = new ImageReceiver(this);
                    this.f29888j7[i7].J0(org.telegram.messenger.g0.L(12.0f));
                    this.f29901k7[i7] = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                    this.f29901k7[i7].u(org.telegram.messenger.g0.L(18.0f));
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void v1(Canvas canvas, boolean z9) {
        float f10;
        float f11;
        boolean z10;
        int i7;
        float f12;
        float L;
        float f13;
        float f14;
        float f15;
        dj djVar;
        if ((!this.D8 || z9) && this.E8 != 0) {
            aj ajVar = this.L;
            if (ajVar == null || (djVar = this.K) == null || !djVar.f22008i || ajVar.h) {
                boolean Q3 = this.P5.Q3();
                x1 x1Var = this.f29868hb;
                if (Q3) {
                    float L2 = x1Var.f30804j1 - org.telegram.messenger.g0.L(40.0f);
                    this.Q8 = L2;
                    dj djVar2 = this.K;
                    if (djVar2 != null) {
                        this.Q8 = (djVar2.f22012m.f21824e - this.Vc) + L2;
                    }
                } else {
                    float L3 = org.telegram.messenger.g0.L(8.0f) + x1Var.f30808k1;
                    this.Q8 = L3;
                    dj djVar3 = this.K;
                    if (djVar3 != null) {
                        this.Q8 = (djVar3.f22012m.f21826g - this.Vc) + L3;
                    }
                    if (t2()) {
                        this.Q8 = Math.min(this.Q8, getCompactRight() - org.telegram.messenger.g0.L(32.0f));
                    }
                }
                float f16 = 0.0f;
                if (this.E8 == 4) {
                    this.R8 = org.telegram.messenger.g0.L(6.0f);
                } else {
                    float L4 = (this.f29812d7 + x1Var.f30803j0) - org.telegram.messenger.g0.L(41.0f);
                    this.R8 = L4;
                    ij ijVar = this.P5;
                    if (ijVar.D == 19 && ijVar.f23273t2 < this.A9) {
                        this.R8 = L4 - org.telegram.messenger.g0.L(22.0f);
                    }
                    dj djVar4 = this.K;
                    if (djVar4 != null) {
                        float f17 = this.R8;
                        cj cjVar = djVar4.f22012m;
                        float f18 = f17 + cjVar.h;
                        this.R8 = f18;
                        if (cjVar.f21828j) {
                            this.R8 = f18 - getTranslationY();
                        }
                    }
                    if (this.P5.P5()) {
                        ch.p0 p0Var = this.N;
                        p0Var.getClass();
                        if (this.f30068xb) {
                            this.R8 -= (1.0f - getVideoTranscriptionProgress()) * p0Var.i(x1Var.L1);
                        } else if (p0Var.f6360a > 0.0f) {
                            this.R8 -= p0Var.i(x1Var.L1);
                        }
                    }
                }
                if (this.E8 != 4) {
                    float L5 = ((this.f29812d7 + x1Var.f30803j0) - org.telegram.messenger.g0.L(32.0f)) / 2.0f;
                    if (this.R8 < L5) {
                        this.R8 = L5;
                    }
                }
                if (this.P5.D == 19) {
                    if (this.E8 == 3 && this.f29924m7 != null) {
                        this.R8 = org.telegram.messenger.g0.L(18.0f);
                    } else {
                        this.R8 = 0.0f;
                    }
                }
                if (!this.P5.Q3() && this.f30068xb && !this.Q1) {
                    if (this.F6) {
                        L = (org.telegram.messenger.g0.g3(this.W6, v2()) - org.telegram.messenger.g0.f22541u) * 0.7f;
                    } else {
                        L = org.telegram.messenger.g0.L(50.0f);
                    }
                    if (this.f30080yb) {
                        f13 = (1.0f - getVideoTranscriptionProgress()) * L;
                    } else {
                        f13 = 0.0f;
                    }
                    if (this.f30080yb) {
                        f16 = org.telegram.messenger.g0.L(28.0f) * (1.0f - getVideoTranscriptionProgress());
                    }
                    if (x1Var.f30813l2) {
                        if (this.f30080yb) {
                            f14 = x1Var.L1;
                        } else {
                            f14 = 1.0f - x1Var.L1;
                        }
                        f13 = (1.0f - getVideoTranscriptionProgress()) * f14 * L;
                        if (this.f30080yb) {
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
                        this.Q8 = org.telegram.messenger.g0.T1(Math.min(this.T0.y() + org.telegram.messenger.g0.L(8.0f), compactRight), Math.min(this.Q8 + f13, compactRight), getVideoTranscriptionProgress());
                    }
                }
                this.F8 = true;
                if (this.E8 == 3) {
                    if (!this.f30069y || ij.S4(this.P5.f23237k)) {
                        U0(canvas, 1.0f);
                    }
                } else if (!rt0.f37779e0) {
                    float f19 = this.Q8;
                    float f20 = this.R8;
                    float L6 = org.telegram.messenger.g0.L(32.0f) + f19;
                    float f21 = this.R8;
                    if (this.G8 == 5) {
                        f10 = 64.0f;
                    } else {
                        f10 = 32.0f;
                    }
                    RectF rectF = this.f29783b4;
                    rectF.set(f19, f20, L6, f21 + org.telegram.messenger.g0.L(f10));
                    if (rectF.right >= getMeasuredWidth()) {
                        this.F8 = false;
                        return;
                    }
                    int i10 = (int) ((1.0f - this.D.f55395e) * 255.0f);
                    if (i10 != 255) {
                        float f22 = this.Q8;
                        f11 = 32.0f;
                        z10 = false;
                        i7 = canvas.saveLayerAlpha(f22, this.R8, org.telegram.messenger.g0.L(32.0f) + f22, this.R8 + org.telegram.messenger.g0.L(64.0f), i10);
                    } else {
                        f11 = 32.0f;
                        z10 = false;
                        i7 = -1;
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
                        boolean z11 = z10;
                        if (this.O8 == null) {
                            float[] fArr = new float[8];
                            this.O8 = fArr;
                            f12 = 2.0f;
                            float L7 = org.telegram.messenger.g0.L(16.0f);
                            fArr[3] = L7;
                            fArr[2] = L7;
                            fArr[1] = L7;
                            fArr[z11 ? 1 : 0] = L7;
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
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.f27918h2);
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
                    if (i7 != -1) {
                        canvas.restoreToCount(i7);
                    }
                }
            }
        }
    }

    public final boolean v2() {
        ij ijVar = this.P5;
        if (ijVar != null) {
            return ijVar.Q2();
        }
        return org.telegram.ui.ActionBar.k6.i1(this.Pb);
    }

    public void v3(ij ijVar, dj djVar, boolean z9, boolean z10, boolean z11, boolean z12) {
        if (this.N0) {
            u3(ijVar, djVar, z9, z10, z11, z12);
            return;
        }
        this.Q5 = ijVar;
        this.R5 = djVar;
        this.T5 = z9;
        this.S5 = z10;
        this.U5 = z11;
        this.V5 = z12;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        y yVar;
        uh.b bVar;
        uh.a aVar;
        m1 m1Var;
        m1 m1Var2;
        m1 m1Var3;
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.I2;
            if (drawable != drawableArr[0] && drawable != this.f30060x3 && drawable != drawableArr[1]) {
                t1 t1Var = this.X0;
                if (t1Var != null) {
                    yVar = t1Var.f30384x;
                } else {
                    yVar = null;
                }
                if (drawable == yVar || drawable == this.U2 || drawable == this.Ja || ((drawable != null && (((m1Var = this.fc) != null && drawable == m1Var.f29538k) || (((m1Var2 = this.f29856gc) != null && drawable == m1Var2.f29538k) || ((m1Var3 = this.Mc) != null && drawable == m1Var3.f29538k)))) || ((this.N != null && (drawable instanceof org.telegram.ui.Components.i6)) || (drawable instanceof a80)))) {
                    return true;
                }
                w1 w1Var = this.f30046w2;
                if (w1Var == null || (aVar = w1Var.f30704l) == null || (drawable != aVar && drawable != aVar.f56817a)) {
                    ArrayList arrayList = this.P4;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        p1 p1Var = (p1) obj;
                        if (p1Var.f29726w != drawable && ((bVar = p1Var.f29727x) == null || (drawable != bVar && drawable != bVar.f56806a && drawable != bVar.f56807b))) {
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
        boolean z9 = this.f29918m1;
        if (z9 || this.n1) {
            if ((z9 && this.f29942o1 == 1.0f) || (!z9 && this.f29942o1 == 0.0f)) {
                this.n1 = false;
            }
            if (z9) {
                xqVar = xq.f40330g;
            } else {
                xqVar = xq.f40331i;
            }
            this.f29967q1 = (int) Math.ceil(xqVar.getInterpolation(this.f29942o1) * org.telegram.messenger.g0.L(35.0f));
            if (this.P5.D == 36) {
                if (org.telegram.messenger.g0.L(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                    this.f29967q1 = 0;
                }
            }
            if (!this.P5.Q3() || this.P5.B2) {
                Y3();
            }
            if (this.n1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f29954p1;
                this.f29954p1 = elapsedRealtime;
                if (this.f29918m1) {
                    float f10 = (((float) j3) / 200.0f) + this.f29942o1;
                    this.f29942o1 = f10;
                    if (f10 > 1.0f) {
                        this.f29942o1 = 1.0f;
                    }
                } else {
                    float f11 = this.f29942o1 - (((float) j3) / 200.0f);
                    this.f29942o1 = f11;
                    if (f11 <= 0.0f) {
                        this.f29942o1 = 0.0f;
                    }
                }
                invalidate();
                ((View) getParent()).invalidate();
            }
        }
    }

    public final int w0(int i7, ij ijVar) {
        TLRPC.WebPage webPage;
        TLRPC.Document document;
        boolean z9;
        int i10;
        b1 b1Var;
        b1 b1Var2;
        int i11 = i7;
        TLRPC.MessageMedia messageMedia = ijVar.Y0;
        if (messageMedia != null) {
            this.M1 = messageMedia.document;
        } else if (ijVar.D == 0) {
            TLRPC.MessageMedia o12 = ij.o1(ijVar.f23237k);
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
            this.M1 = ijVar.F0();
        }
        TLRPC.Document document2 = this.M1;
        int i12 = 0;
        if (document2 != null) {
            double d = 0.0d;
            if (ij.R4(document2)) {
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
                W2(ijVar);
                int L = org.telegram.messenger.g0.L(174.0f) + this.z9;
                if (!this.Q1) {
                    this.f29772a7 = Math.min(i11, L + ((int) Math.ceil(org.telegram.ui.ActionBar.k6.N2.measureText(org.telegram.messenger.g0.g0((int) d, true, false)))));
                }
                this.D4.f36988m = ijVar;
                return 0;
            } else if (ij.L4(this.M1)) {
                this.L1 = 4;
                if (!ijVar.n5()) {
                    R3();
                    String i02 = org.telegram.messenger.g0.i0(this.M1.size, false, false);
                    this.f29821e3 = (int) Math.ceil(org.telegram.ui.ActionBar.k6.C2.measureText(i02));
                    this.f29808d3 = new StaticLayout(i02, org.telegram.ui.ActionBar.k6.C2, this.f29821e3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return 0;
                }
            } else if (ij.K3(this.M1)) {
                C1();
                this.L1 = 5;
                int L2 = i11 - org.telegram.messenger.g0.L(92.0f);
                if (L2 < 0) {
                    L2 = org.telegram.messenger.g0.L(100.0f);
                }
                int i14 = L2;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(ijVar.z1(true).replace('\n', ' '), org.telegram.ui.ActionBar.k6.O2, i14 - org.telegram.messenger.g0.L(12.0f), truncateAt);
                b1 b1Var3 = this.J4;
                TextPaint textPaint = org.telegram.ui.ActionBar.k6.O2;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                b1Var3.d = new StaticLayout(ellipsize, textPaint, i14, alignment, 1.0f, 0.0f, false);
                if (this.J4.d.getLineCount() > 0) {
                    this.J4.f28919e = -((int) Math.ceil(b1Var2.d.getLineLeft(0)));
                    int lineWidth = (int) this.J4.d.getLineWidth(0);
                    if (org.telegram.messenger.g0.L(104.0f) + lineWidth > this.f29772a7) {
                        this.f29772a7 = org.telegram.messenger.g0.L(104.0f) + lineWidth;
                    }
                }
                this.J4.f28920f = new StaticLayout(TextUtils.ellipsize(ijVar.x1(true).replace('\n', ' '), org.telegram.ui.ActionBar.k6.P2, i14, truncateAt), org.telegram.ui.ActionBar.k6.P2, i14, alignment, 1.0f, 0.0f, false);
                if (this.J4.f28920f.getLineCount() > 0) {
                    this.J4.f28921g = -((int) Math.ceil(b1Var.f28920f.getLineLeft(0)));
                    int lineWidth2 = (int) this.J4.f28920f.getLineWidth(0);
                    if (org.telegram.messenger.g0.L(104.0f) + lineWidth2 > this.f29772a7) {
                        this.f29772a7 = org.telegram.messenger.g0.L(104.0f) + lineWidth2;
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
                this.U6 = this.f29772a7 - org.telegram.messenger.g0.L(28.0f);
                return ceil;
            } else if (ij.t3(this.M1, ijVar.A2())) {
                this.L1 = 2;
                if (!ijVar.n5()) {
                    String M0 = hd.M0(2131753971, "AttachGif");
                    this.B3 = (int) Math.ceil(org.telegram.ui.ActionBar.k6.C2.measureText(M0));
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.k6.C2;
                    int i16 = this.B3;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    this.f30047w3 = new StaticLayout(M0, textPaint2, i16, alignment2, 1.0f, 0.0f, false);
                    String i03 = org.telegram.messenger.g0.i0(this.M1.size, false, false);
                    this.f29821e3 = (int) Math.ceil(org.telegram.ui.ActionBar.k6.C2.measureText(i03));
                    this.f29808d3 = new StaticLayout(i03, org.telegram.ui.ActionBar.k6.C2, this.f29821e3, alignment2, 1.0f, 0.0f, false);
                }
            } else {
                String str = this.M1.mime_type;
                if ((str != null && (str.toLowerCase().startsWith("image/") || this.M1.mime_type.toLowerCase().startsWith("video/mp4"))) || ij.X2(this.M1)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.N1 = z9;
                if (!z9) {
                    i11 += org.telegram.messenger.g0.L(30.0f);
                }
                int i17 = i11;
                this.L1 = 1;
                String B = org.telegram.messenger.w7.B(this.M1);
                if (B.length() == 0) {
                    B = hd.M0(2131753975, "AttachDocument");
                }
                StaticLayout c10 = mu0.c(B, org.telegram.ui.ActionBar.k6.G2, i17, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.MIDDLE, i17, 2, false);
                this.f29808d3 = c10;
                this.f29835f3 = Integer.MIN_VALUE;
                if (c10 != null && c10.getLineCount() > 0) {
                    int i18 = 0;
                    for (int i19 = 0; i19 < this.f29808d3.getLineCount(); i19++) {
                        i18 = Math.max(i18, (int) Math.ceil(this.f29808d3.getLineWidth(i19)));
                        this.f29835f3 = Math.max(this.f29835f3, (int) Math.ceil(-this.f29808d3.getLineLeft(i19)));
                    }
                    i10 = Math.min(i17, i18);
                } else {
                    this.f29835f3 = 0;
                    i10 = i17;
                }
                int min = Math.min(i17 - org.telegram.messenger.g0.L(30.0f), (int) Math.ceil(org.telegram.ui.ActionBar.k6.C2.measureText("000.0 mm / ".concat(org.telegram.messenger.g0.i0(this.M1.size, false, false)))));
                this.B3 = min;
                CharSequence ellipsize2 = TextUtils.ellipsize(org.telegram.messenger.g0.i0(this.M1.size, false, false) + " " + org.telegram.messenger.w7.A(this.M1), org.telegram.ui.ActionBar.k6.C2, min, TextUtils.TruncateAt.END);
                try {
                    if (this.B3 < 0) {
                        this.B3 = org.telegram.messenger.g0.L(10.0f);
                    }
                    this.f30047w3 = new StaticLayout(ellipsize2, org.telegram.ui.ActionBar.k6.C2, this.B3 + org.telegram.messenger.g0.L(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (this.N1) {
                    this.f29809d4 = org.telegram.messenger.w7.w(ijVar.f23248n0, 320, false, null, false);
                    this.f29822e4 = org.telegram.messenger.w7.w(ijVar.f23248n0, 40, false, null, false);
                    if (this.P5.y3() || (org.telegram.messenger.z5.q(this.Z5).l() & 1) == 0) {
                        this.f29809d4 = null;
                    }
                    TLRPC.PhotoSize photoSize = this.f29809d4;
                    di.z2 z2Var = this.T0;
                    if (photoSize != null && photoSize != this.f29822e4) {
                        BitmapDrawable bitmapDrawable = this.P5.G1;
                        if (bitmapDrawable != null) {
                            this.f29822e4 = null;
                            this.f29836f4 = bitmapDrawable;
                        }
                    } else {
                        this.f29809d4 = null;
                        z2Var.F0 = true;
                        z2Var.G0 = true;
                    }
                    this.f29848g4 = "86_86_b";
                    z2Var.r0(hc.f(this.f29809d4, ijVar.f23242l0), "86_86", hc.f(this.f29822e4, ijVar.f23242l0), this.f29848g4, this.f29836f4, 0L, null, ijVar, 1);
                }
                return i10;
            }
        }
        return 0;
    }

    public final void w1(Canvas canvas, boolean z9, boolean z10, boolean z11, boolean z12, float f10, boolean z13, float f11, float f12, float f13, boolean z14, boolean z15) {
        float photoBottom;
        float f14;
        float f15;
        float f16;
        int L;
        int L2;
        int i7;
        Drawable Y1;
        Drawable drawable;
        int w02;
        float f17;
        ij ijVar;
        boolean z16 = (f13 == 1.0f || z14) ? false : true;
        float f18 = (f13 * 0.5f) + 0.5f;
        float f19 = z16 ? f10 * f13 : f10;
        if (this.L1 != 7 || ((ijVar = this.P5) != null && ijVar.h4())) {
            photoBottom = getPhotoBottom() + this.f30030v0;
        } else {
            photoBottom = f12 - ((1.0f - getVideoTranscriptionProgress()) * (this.N.i(this.f29868hb.L1) + org.telegram.messenger.g0.L(this.J ? 4.0f : 5.0f)));
        }
        float L3 = photoBottom - org.telegram.messenger.g0.L(8.5f);
        ij ijVar2 = this.P5;
        float L4 = (ijVar2 == null || !ijVar2.N2()) ? 0.0f : org.telegram.messenger.g0.L(-6.0f);
        float f20 = 22.0f;
        if (z11) {
            xa0 xa0Var = org.telegram.ui.ActionBar.k6.E3;
            if (E3()) {
                if (this.P5.Q5()) {
                    f14 = 1.0f;
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, this.Pb);
                    int i10 = this.f29799c7;
                    f17 = z13 ? 24.0f : 22.0f;
                    xa0Var.getClass();
                    f16 = 4.0f;
                    z.t(xa0Var, ((i10 - org.telegram.messenger.g0.L(f17)) - org.telegram.messenger.g0.L(12.0f)) + L4, (L3 - org.telegram.messenger.g0.L(12.0f)) + f11);
                    xa0Var.setAlpha((int) (this.f29885j4 * 255.0f * f19));
                } else {
                    f14 = 1.0f;
                    f16 = 4.0f;
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27928hd, this.Pb);
                    int i11 = this.f29799c7;
                    f17 = z13 ? 24.0f : 22.0f;
                    xa0Var.getClass();
                    z.t(xa0Var, ((i11 - org.telegram.messenger.g0.L(f17)) - org.telegram.messenger.g0.L(12.0f)) + L4, (L3 - org.telegram.messenger.g0.L(12.0f)) + f11);
                    xa0Var.setAlpha((int) (f19 * 255.0f));
                }
                f15 = 18.5f;
            } else {
                f14 = 1.0f;
                f16 = 4.0f;
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bb, this.Pb);
                xa0Var.getClass();
                f15 = 18.5f;
                z.t(xa0Var, (this.f29799c7 - org.telegram.messenger.g0.L(18.5f)) - org.telegram.messenger.g0.L(12.0f), ((f12 - org.telegram.messenger.g0.L(8.5f)) - org.telegram.messenger.g0.L(12.0f)) + f11);
                xa0Var.setAlpha((int) (f19 * 255.0f));
            }
            xa0Var.a(w02);
            if (z16) {
                canvas.save();
                canvas.scale(f18, f18, xa0Var.getBounds().centerX(), xa0Var.getBounds().centerY());
            }
            xa0Var.draw(canvas);
            xa0Var.setAlpha(255);
            if (z16) {
                canvas.restore();
            }
            invalidate();
        } else {
            f14 = 1.0f;
            f15 = 18.5f;
            f16 = 4.0f;
        }
        if (z10) {
            if (E3()) {
                if (z14) {
                    canvas.save();
                }
                if (this.P5.Q5()) {
                    drawable = Y1("drawableMsgStickerCheck");
                    if (z9) {
                        if (z14) {
                            canvas.translate(org.telegram.messenger.g0.L(4.8f) * (f14 - f13), 0.0f);
                        }
                        z.t(drawable, ((this.f29799c7 - org.telegram.messenger.g0.L(z13 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f11);
                    } else {
                        z.t(drawable, ((this.f29799c7 - org.telegram.messenger.g0.L(z13 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f11);
                    }
                    drawable.setAlpha((int) (this.f29885j4 * 255.0f * f19));
                } else {
                    if (z9) {
                        if (z14) {
                            canvas.translate((f14 - f13) * org.telegram.messenger.g0.L(4.8f), 0.0f);
                        }
                        z.t(org.telegram.ui.ActionBar.k6.F3, (this.f29799c7 - org.telegram.messenger.g0.L(z13 ? 28.3f : 26.3f)) - org.telegram.ui.ActionBar.k6.F3.getIntrinsicWidth(), (L3 - org.telegram.ui.ActionBar.k6.F3.getIntrinsicHeight()) + f11);
                    } else {
                        z.t(org.telegram.ui.ActionBar.k6.F3, (this.f29799c7 - org.telegram.messenger.g0.L(z13 ? 23.5f : 21.5f)) - org.telegram.ui.ActionBar.k6.F3.getIntrinsicWidth(), (L3 - org.telegram.ui.ActionBar.k6.F3.getIntrinsicHeight()) + f11);
                    }
                    org.telegram.ui.ActionBar.k6.F3.setAlpha((int) (this.f29885j4 * 255.0f * f19));
                    drawable = org.telegram.ui.ActionBar.k6.F3;
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
                if (z9) {
                    if (z14) {
                        canvas.translate((f14 - f13) * org.telegram.messenger.g0.L(f16), 0.0f);
                    }
                    Y1 = Y1(z15 ? "drawableMsgOutCheckReadSelected" : "drawableMsgOutCheckRead");
                    z.t(Y1, ((this.f29799c7 - org.telegram.messenger.g0.L(22.5f)) - Y1.getIntrinsicWidth()) + L4, ((f12 - org.telegram.messenger.g0.L((this.F || this.E) ? 9.0f : 8.0f)) - Y1.getIntrinsicHeight()) + f11);
                } else {
                    Y1 = Y1(z15 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    z.t(Y1, ((this.f29799c7 - org.telegram.messenger.g0.L(f15)) - Y1.getIntrinsicWidth()) + L4, ((f12 - org.telegram.messenger.g0.L((this.F || this.E) ? 9.0f : 8.0f)) - Y1.getIntrinsicHeight()) + f11);
                }
                Y1.setAlpha((int) (f19 * 255.0f));
                if (z16) {
                    canvas.save();
                    canvas.scale(f18, f18, Y1.getBounds().centerX(), Y1.getBounds().centerY());
                }
                Y1.draw(canvas);
                if (z16) {
                    canvas.restore();
                }
                if (z14) {
                    canvas.restore();
                }
                Y1.setAlpha(255);
            }
        }
        if (z9) {
            if (E3()) {
                Drawable Y12 = this.P5.Q5() ? Y1("drawableMsgStickerHalfCheck") : org.telegram.ui.ActionBar.k6.G3;
                z.t(Y12, ((this.f29799c7 - org.telegram.messenger.g0.L(z13 ? 23.5f : 21.5f)) - Y12.getIntrinsicWidth()) + L4, (L3 - Y12.getIntrinsicHeight()) + f11);
                Y12.setAlpha((int) (this.f29885j4 * 255.0f * f19));
                if (z16 || z14) {
                    canvas.save();
                    canvas.scale(f18, f18, Y12.getBounds().centerX(), Y12.getBounds().centerY());
                }
                Y12.draw(canvas);
                if (z16 || z14) {
                    canvas.restore();
                }
                Y12.setAlpha(255);
            } else {
                Drawable Y13 = Y1(z15 ? "drawableMsgOutHalfCheckSelected" : "drawableMsgOutHalfCheck");
                z.t(Y13, (this.f29799c7 - org.telegram.messenger.g0.L(18.0f)) - Y13.getIntrinsicWidth(), ((f12 - org.telegram.messenger.g0.L((this.F || this.E) ? 9.0f : 8.0f)) - Y13.getIntrinsicHeight()) + f11);
                Y13.setAlpha((int) (f19 * 255.0f));
                if (z16 || z14) {
                    canvas.save();
                    canvas.scale(f18, f18, Y13.getBounds().centerX(), Y13.getBounds().centerY());
                }
                Y13.draw(canvas);
                if (z16 || z14) {
                    canvas.restore();
                }
                Y13.setAlpha(255);
            }
        }
        if (z12) {
            if (E3()) {
                L = this.f29799c7 - org.telegram.messenger.g0.L(34.5f);
                L2 = org.telegram.messenger.g0.L(26.5f);
            } else {
                L = this.f29799c7 - org.telegram.messenger.g0.L(32.0f);
                if (!this.F && !this.E) {
                    f20 = 21.0f;
                }
                L2 = org.telegram.messenger.g0.L(f20);
            }
            float f21 = (f12 - L2) + f11;
            RectF rectF = this.f29783b4;
            rectF.set((int) (L + L4), f21, org.telegram.messenger.g0.L(14.0f) + i7, org.telegram.messenger.g0.L(14.0f) + f21);
            int alpha = org.telegram.ui.ActionBar.k6.f27807b2.getAlpha();
            org.telegram.ui.ActionBar.k6.f27807b2.setAlpha((int) (alpha * f19));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f14), org.telegram.messenger.g0.L(f14), org.telegram.ui.ActionBar.k6.f27807b2);
            org.telegram.ui.ActionBar.k6.f27807b2.setAlpha(alpha);
            z.t(org.telegram.ui.ActionBar.k6.f27955j4, org.telegram.messenger.g0.L(6.0f) + i7, f21 + org.telegram.messenger.g0.L(2.0f));
            org.telegram.ui.ActionBar.k6.f27955j4.setAlpha((int) (f19 * 255.0f));
            if (z16) {
                canvas.save();
                canvas.scale(f18, f18, org.telegram.ui.ActionBar.k6.f27955j4.getBounds().centerX(), org.telegram.ui.ActionBar.k6.f27955j4.getBounds().centerY());
            }
            org.telegram.ui.ActionBar.k6.f27955j4.draw(canvas);
            org.telegram.ui.ActionBar.k6.f27955j4.setAlpha(255);
            if (z16) {
                canvas.restore();
            }
        }
    }

    public final boolean w2(ij ijVar) {
        int i7 = ij.o1(this.P5.f23237k).period;
        int currentTime = ConnectionsManager.getInstance(this.Z5).getCurrentTime();
        if (i7 == Integer.MAX_VALUE) {
            return false;
        }
        if (i7 % 60 == 0) {
            if (Math.abs(currentTime - ijVar.f23237k.date) <= i7) {
                return false;
            }
            return true;
        } else if (Math.abs(currentTime - ijVar.f23237k.date) <= i7 - 5) {
            return false;
        } else {
            return true;
        }
    }

    public final void w3(int i7) {
        this.f29928n = i7;
    }

    public final void x() {
        y(getX(), this.f29776ab, getMeasuredWidth(), this.f29790bb);
    }

    public void x1(float r16, android.graphics.Canvas r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.x1(float, android.graphics.Canvas, boolean):void");
    }

    public boolean x2() {
        if (((isPressed() && this.C6) || ((!this.C6 && this.f30036v6) || this.f30050w6)) && !I3() && !l2()) {
            ij ijVar = this.P5;
            if (ijVar == null || !ijVar.f23264r1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void x3(int i7, int i10) {
        org.telegram.ui.ActionBar.t4 t4Var;
        this.K0 = i7;
        this.L0 = i10;
        this.f29790bb = i10;
        if ((this.P5 != null && g2() && this.P5.Q5()) || ((t4Var = this.K6) != null && t4Var.f28506a != null)) {
            invalidate();
        }
    }

    public final void y(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Pb;
        if (f6Var != null) {
            f6Var.b(f10, f11 + this.V + this.f29832f0 + this.f29858h0, i7, i10);
        } else {
            org.telegram.ui.ActionBar.k6.r(f10, f11 + this.V + this.f29832f0 + this.f29858h0, i7, i10);
        }
    }

    public final void y0() {
        float f10;
        float f11;
        int i7;
        int measureText;
        boolean z9;
        if (this.f30007t2) {
            B0(0);
        }
        if (this.f30007t2 && this.f29968q2 == null) {
            this.C2 = org.telegram.messenger.g0.L(33.0f);
            CharSequence charSequence = this.f30072y2;
            if (charSequence == null) {
                int i10 = this.f30059x2;
                if (i10 == 12) {
                    charSequence = hd.M0(2131747807, null);
                } else if (i10 == 1) {
                    charSequence = hd.M0(2131747811, null);
                } else if (i10 == 29) {
                    charSequence = hd.M0(2131747808, null);
                } else if (i10 == 13) {
                    charSequence = hd.M0(2131745602, null).toUpperCase();
                } else if (i10 == 32) {
                    charSequence = hd.M0(2131747785, null).toUpperCase();
                } else if (i10 == 85) {
                    charSequence = hd.M0(2131747815, null);
                } else if (i10 == 10) {
                    charSequence = hd.M0(2131747812, null);
                } else if (i10 == 2) {
                    charSequence = hd.M0(2131747799, null);
                } else if (i10 == 3) {
                    charSequence = hd.M0(2131747786, null);
                } else if (i10 == 5) {
                    charSequence = hd.M0(2131743557, null);
                } else if (i10 == 6) {
                    charSequence = hd.M0(2131747813, null);
                } else if (i10 == 7) {
                    charSequence = hd.M0(2131747783, null);
                } else if (i10 != 9 && i10 != 11) {
                    if (i10 == 25) {
                        charSequence = hd.M0(2131743368, null);
                    } else if (i10 == 14) {
                        charSequence = hd.M0(2131743559, null).toUpperCase();
                    } else if (i10 == 15) {
                        charSequence = hd.M0(2131752918, null).toUpperCase();
                    } else if (i10 == 16) {
                        charSequence = hd.M0(2131747788, null).toUpperCase();
                    } else if (i10 == 17) {
                        charSequence = hd.M0(2131743542, null).toUpperCase();
                    } else if (i10 != 18 && i10 != 22) {
                        if (i10 == 19) {
                            charSequence = hd.M0(2131753346, null);
                        } else if (i10 == 20) {
                            charSequence = hd.M0(2131747803, null);
                        } else if (i10 == 21) {
                            charSequence = hd.M0(2131754230, null);
                        } else if (i10 == 23) {
                            charSequence = hd.M0(2131747784, null);
                        } else if (i10 == 24) {
                            charSequence = hd.M0(2131747806, null);
                        } else if (i10 == 26) {
                            TL_stars.StarGift starGift = this.f29857gd;
                            if (starGift != null) {
                                if (starGift.auction_start_date > ConnectionsManager.getInstance(this.Z5).getCurrentTime()) {
                                    charSequence = hd.M0(2131747800, null);
                                    z9 = false;
                                } else {
                                    if (this.f29857gd.sold_out) {
                                        charSequence = hd.M0(2131747801, null);
                                    } else {
                                        charSequence = hd.M0(2131747802, null);
                                    }
                                    z9 = true;
                                }
                                if (z9) {
                                    SpannableString spannableString = new SpannableString("*");
                                    spannableString.setSpan(new wp(2131231117, 0), 0, spannableString.length(), 33);
                                    charSequence = TextUtils.concat(spannableString, " ", charSequence);
                                }
                            } else {
                                charSequence = hd.M0(2131747782, null);
                            }
                        } else if (i10 == 27) {
                            charSequence = hd.M0(2131749079, null).toUpperCase();
                        } else if (i10 == 28) {
                            charSequence = hd.M0(2131743558, null);
                        } else {
                            charSequence = hd.M0(2131749192, null);
                        }
                    } else {
                        charSequence = hd.M0(2131753616, null);
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) ij.o1(this.P5.f23237k).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = hd.M0(2131743367, null);
                    } else {
                        charSequence = hd.M0(2131743368, null);
                    }
                }
            }
            if (this.P5.s4() && this.f29772a7 < (measureText = (int) (org.telegram.ui.ActionBar.k6.M2.measureText(charSequence, 0, charSequence.length()) + org.telegram.messenger.g0.L(75.0f)))) {
                this.f29772a7 = measureText;
            }
            int L = this.f29772a7 - org.telegram.messenger.g0.L(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.k6.M2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.M2, org.telegram.messenger.g0.L(2.0f) + L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f29968q2 = staticLayout;
            int lineCount = staticLayout.getLineCount();
            float f12 = 0.0f;
            if (lineCount > 0) {
                f10 = this.f29968q2.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f29982r2 = f10;
            if (this.f29968q2.getLineCount() > 0) {
                f12 = this.f29968q2.getLineLeft(0);
            }
            this.f29996s2 = f12;
            int i11 = this.f29772a7;
            int i12 = this.f30059x2;
            if (i12 != 82 && i12 != 81 && i12 != 80 && i12 != 84 && i12 != 83) {
                f11 = 34.0f;
            } else {
                f11 = 13.0f;
            }
            this.C2 = i11 - org.telegram.messenger.g0.L(f11);
            int L2 = org.telegram.messenger.g0.L(46.0f) + this.f30017u0;
            this.f30017u0 = L2;
            if (this.P5.D == 12) {
                this.f30017u0 = org.telegram.messenger.g0.L(14.0f) + L2;
            }
            if (this.P5.s4()) {
                this.f30017u0 = org.telegram.messenger.g0.L(2.0f) + this.f30017u0;
            }
            StaticLayout staticLayout2 = this.f29968q2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.C2 - Math.ceil(this.f29968q2.getLineWidth(0)))) / 2;
                if (this.f30059x2 == 0) {
                    i7 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    i7 = 0;
                }
                this.A2 = ceil + i7;
                int lineLeft = (int) this.f29968q2.getLineLeft(0);
                this.B2 = lineLeft;
                this.A2 += -lineLeft;
            }
        }
    }

    public final void y1(Canvas canvas, float f10, boolean z9, float f11, StaticLayout staticLayout, float f12, boolean z10) {
        int i7;
        float f13;
        RectF rectF;
        int i10;
        char c10;
        char c11;
        char c12;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z11;
        x1 x1Var;
        float f14;
        boolean z12;
        int i15;
        q1 q1Var;
        String str;
        float f15;
        float L;
        x1 x1Var2;
        boolean z13;
        float f16;
        int i16;
        x1 x1Var3;
        boolean z14;
        float f17;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i17;
        Paint Z1;
        float f18;
        float f19;
        int L2;
        boolean z20;
        float photoBottom;
        int i18;
        int i19;
        float f20;
        boolean z21;
        x1 x1Var4;
        float f21;
        float f22;
        boolean z22;
        int i20;
        boolean z23;
        ij ijVar;
        TextPaint textPaint;
        int i21;
        int i22;
        q1 q1Var2 = this;
        Canvas canvas2 = canvas;
        if (((q1Var2.E9 && !q1Var2.M) || !q1Var2.E3()) && staticLayout != null) {
            ij ijVar2 = q1Var2.P5;
            if ((!ijVar2.Z || q1Var2.L == null) && (i7 = ijVar2.D) != 16) {
                if (i7 == 5) {
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.k6.T2;
                    if (q1Var2.t2()) {
                        i21 = q1Var2.P5.Q3() ? org.telegram.ui.ActionBar.k6.f27909gc : org.telegram.ui.ActionBar.k6.f27818be;
                    } else {
                        i21 = org.telegram.ui.ActionBar.k6.Wc;
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i21, q1Var2.Pb);
                    if (q1Var2.x2()) {
                        i22 = q1Var2.P5.Q3() ? org.telegram.ui.ActionBar.k6.f27817bc : org.telegram.ui.ActionBar.k6.f27838ce;
                    } else {
                        i22 = q1Var2.P5.Q3() ? org.telegram.ui.ActionBar.k6.f27909gc : org.telegram.ui.ActionBar.k6.f27818be;
                    }
                    textPaint2.setColor(i0.a.f(q1Var2.getVideoTranscriptionProgress(), w02, org.telegram.ui.ActionBar.k6.w0(i22, q1Var2.Pb)));
                } else if (q1Var2.E3()) {
                    if (q1Var2.P5.Q5()) {
                        org.telegram.ui.ActionBar.k6.T2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, q1Var2.Pb));
                    } else {
                        org.telegram.ui.ActionBar.k6.T2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Yd, q1Var2.Pb));
                    }
                } else if (q1Var2.P5.Q3()) {
                    org.telegram.ui.ActionBar.k6.T2.setColor(org.telegram.ui.ActionBar.k6.w0(z10 ? org.telegram.ui.ActionBar.k6.f27817bc : org.telegram.ui.ActionBar.k6.f27909gc, q1Var2.Pb));
                } else {
                    org.telegram.ui.ActionBar.k6.T2.setColor(org.telegram.ui.ActionBar.k6.w0(z10 ? org.telegram.ui.ActionBar.k6.f27838ce : org.telegram.ui.ActionBar.k6.f27818be, q1Var2.Pb));
                }
                float f23 = q1Var2.getTransitionParams().K1 ? q1Var2.getTransitionParams().L1 * f10 : f10;
                if (f23 != 1.0f) {
                    org.telegram.ui.ActionBar.k6.T2.setAlpha((int) (textPaint.getAlpha() * f23));
                }
                canvas2.save();
                if (q1Var2.J && !q1Var2.E3()) {
                    canvas2.translate(0.0f, org.telegram.messenger.g0.L(2.0f));
                }
                float f24 = q1Var2.f29812d7;
                x1 x1Var5 = q1Var2.f29868hb;
                if (x1Var5.f30858x0) {
                    f24 += x1Var5.f30803j0;
                }
                dj djVar = q1Var2.K;
                if (djVar == null || !djVar.f22012m.f21828j) {
                    f13 = f11;
                } else {
                    f24 -= q1Var2.getTranslationY();
                    f13 = f11 + q1Var2.K.f22012m.f21826g;
                }
                float f25 = f24;
                float f26 = f13;
                if (q1Var2.J && q1Var2.E3()) {
                    f25 += org.telegram.messenger.g0.L(1.0f);
                }
                float f27 = f25;
                if (x1Var5.f30858x0) {
                    float f28 = q1Var2.Vc;
                    f13 += f28;
                    f26 += f28;
                }
                float f29 = f13;
                boolean P5 = q1Var2.P5.P5();
                ch.p0 p0Var = q1Var2.N;
                if (P5) {
                    p0Var.getClass();
                }
                if (x1Var5.U0) {
                    f26 = com.google.android.recaptcha.internal.a.v(1.0f, x1Var5.L1, x1Var5.Z0, f26);
                }
                float f30 = f26;
                boolean E3 = q1Var2.E3();
                RectF rectF2 = q1Var2.f29783b4;
                di.z2 z2Var = q1Var2.T0;
                if (E3) {
                    if (q1Var2.f30051w7) {
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
                    org.telegram.ui.ActionBar.k6.T2.setAlpha((int) (q1Var2.f29885j4 * 255.0f * f31));
                    ij ijVar3 = q1Var2.P5;
                    if (ijVar3 == null || ijVar3.D != 4) {
                        f18 = f27;
                        f19 = f31;
                    } else {
                        float f32 = z2Var.N() ? 1.0f : z2Var.f21194h1;
                        if (!z2Var.L()) {
                            f32 = 0.0f;
                        }
                        f18 = f27;
                        f19 = org.telegram.messenger.g0.T1(0.35f, 1.0f, f32);
                    }
                    ij ijVar4 = q1Var2.P5;
                    if (ijVar4 != null && ijVar4.f23294z0) {
                        org.telegram.ui.Components.g5 g5Var = q1Var2.f29906l0;
                        f19 *= g5Var == null ? 0.0f : g5Var.e();
                    }
                    Z1.setAlpha((int) com.google.android.recaptcha.internal.a.D(alpha, q1Var2.f29885j4, f19, 0.6f));
                    if (q1Var2.b4()) {
                        int L3 = org.telegram.messenger.g0.L(8.0f);
                        int i24 = iz.Y0;
                        if (i24 > 2) {
                            i24 -= 2;
                        }
                        L2 = Math.min(L3, org.telegram.messenger.g0.L(i24));
                        z20 = iz.Y0 >= 10;
                        i10 = 2;
                    } else {
                        int i25 = q1Var2.L1;
                        if (i25 != 7 && i25 != 6 && q1Var2.P5.D != 19) {
                            int[] iArr = z2Var.W0;
                            i10 = 2;
                            L2 = Math.min(org.telegram.messenger.g0.L(8.0f), Math.max(iArr[2], iArr[3]));
                            z20 = iz.Y0 >= 10;
                        } else {
                            i10 = 2;
                            int L4 = org.telegram.messenger.g0.L(4.0f);
                            ij ijVar5 = q1Var2.P5;
                            L2 = L4 + ((ijVar5 == null || !ijVar5.N2()) ? 0 : org.telegram.messenger.g0.L(8.0f));
                            z20 = false;
                        }
                    }
                    ij ijVar6 = q1Var2.P5;
                    float L5 = f29 + ((ijVar6 == null || !ijVar6.N2()) ? 0 : org.telegram.messenger.g0.L(-6.0f));
                    if (q1Var2.f29870i0 != 0) {
                        L5 -= org.telegram.messenger.g0.L(18.0f);
                    }
                    float L6 = L5 - org.telegram.messenger.g0.L(z20 ? 6.0f : 4.0f);
                    ij ijVar7 = q1Var2.P5;
                    float L7 = (ijVar7 == null || !ijVar7.N2()) ? 0.0f : org.telegram.messenger.g0.L(2.0f);
                    float f33 = f19;
                    float f34 = L5;
                    if (q1Var2.L1 != 7 || ((ijVar = q1Var2.P5) != null && ijVar.h4())) {
                        photoBottom = q1Var2.getPhotoBottom() + q1Var2.f30030v0;
                    } else {
                        photoBottom = f18 - ((1.0f - q1Var2.getVideoTranscriptionProgress()) * (p0Var.i(x1Var5.L1) + org.telegram.messenger.g0.L(q1Var2.J ? 4.0f : 5.0f)));
                    }
                    float f35 = photoBottom;
                    float L8 = f35 - org.telegram.messenger.g0.L(23.0f);
                    float max = Math.max(org.telegram.messenger.g0.L(17.0f), org.telegram.ui.ActionBar.k6.T2.getTextSize() + org.telegram.messenger.g0.L(5.0f));
                    float f36 = L6 - L7;
                    float f37 = L7 + L6 + f12;
                    int i26 = z20 ? 12 : 8;
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
                        Path path = l4Var.f29504t;
                        path.rewind();
                        path.addRoundRect(rectF2, f38, f38, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.drawColor(1073741824);
                        canvas2.restore();
                    } else if (!ij.c4(q1Var2.P5.f23237k)) {
                        if (q1Var2.P5.u2() && q1Var2.P5.D != 5) {
                            Path path2 = q1Var2.A4;
                            path2.rewind();
                            float f39 = L2;
                            path2.addRoundRect(rectF2, f39, f39, Path.Direction.CW);
                            canvas2.save();
                            canvas2.clipPath(path2);
                            ImageReceiver imageReceiver = q1Var2.P5.n5() ? z2Var : q1Var2.U0;
                            float alpha2 = imageReceiver.getAlpha();
                            imageReceiver.setAlpha(0.5f * alpha2);
                            imageReceiver.h(canvas2, null);
                            imageReceiver.setAlpha(alpha2);
                            canvas2.restore();
                            Paint Z12 = q1Var2.Z1("paintChatTimeBackground");
                            int alpha3 = Z12.getAlpha();
                            Z12.setAlpha((int) (alpha3 * q1Var2.f29898k4 * 0.4f));
                            canvas2.drawRoundRect(rectF2, f39, f39, Z12);
                            Z12.setAlpha(alpha3);
                        } else {
                            q1Var2.x();
                            float f40 = L2;
                            canvas2.drawRoundRect(rectF2, f40, f40, Z1);
                            if (Z1 == q1Var2.Z1("paintChatActionBackground") && q1Var2.g2()) {
                                int alpha4 = org.telegram.ui.ActionBar.k6.f27918h2.getAlpha();
                                org.telegram.ui.ActionBar.k6.f27918h2.setAlpha((int) (alpha4 * q1Var2.f29885j4 * f33));
                                canvas2.drawRoundRect(rectF2, f40, f40, org.telegram.ui.ActionBar.k6.f27918h2);
                                org.telegram.ui.ActionBar.k6.f27918h2.setAlpha(alpha4);
                            }
                        }
                    }
                    Z1.setAlpha(alpha);
                    float f41 = -staticLayout.getLineLeft(0);
                    ij ijVar8 = q1Var2.P5;
                    float L9 = f41 + ((ijVar8 == null || !ijVar8.N2()) ? 0 : org.telegram.messenger.g0.L(-6.0f));
                    if (q1Var2.P5.P5()) {
                        p0Var.getClass();
                    }
                    if ((!org.telegram.messenger.t3.T(q1Var2.f29891ja) || q1Var2.f29891ja.megagroup) && (q1Var2.P5.f23237k.flags & 1024) == 0 && q1Var2.fa == null && !q1Var2.f29959p6) {
                        f20 = L9;
                        rectF = rectF2;
                        f23 = f31;
                        f27 = f18;
                        i13 = i23;
                        z21 = false;
                        c10 = 6;
                        c11 = 7;
                        c12 = 4;
                    } else {
                        float lineWidth = (q1Var2.z9 - staticLayout.getLineWidth(0)) + L9;
                        p0Var.getClass();
                        int b10 = x1Var5.b();
                        int i27 = x1Var5.f30768b2;
                        if (i27 >= 0 && i27 != b10 && !q1Var2.f30003sb) {
                            q1Var2.C0(i27, b10, z9);
                        }
                        boolean z24 = q1Var2.f30003sb;
                        if (z24) {
                            b10 = q1Var2.f29964pb;
                        }
                        boolean z25 = (b10 & 4) != 0;
                        boolean z26 = (b10 & 8) != 0;
                        if (z24) {
                            int i28 = q1Var2.f29977qb;
                            if ((i28 & 4) != 0) {
                                i20 = i28;
                                z23 = true;
                            } else {
                                i20 = i28;
                                z23 = false;
                            }
                            boolean z27 = (i20 & 8) != 0;
                            float f42 = i23;
                            x1Var4 = x1Var5;
                            f21 = lineWidth;
                            rectF = rectF2;
                            float f43 = f18;
                            c10 = 6;
                            c12 = 4;
                            z21 = false;
                            i13 = i23;
                            c11 = 7;
                            q1Var2.T0(canvas2, z23, z27, f43, f31, f42, f34, 1.0f - q1Var2.f29991rb, z10);
                            boolean z28 = z23;
                            boolean z29 = z27;
                            boolean z30 = z25;
                            boolean z31 = z26;
                            q1Var2.T0(canvas, z30, z31, f43, f31, f42, f34, q1Var2.f29991rb, z10);
                            f27 = f43;
                            f22 = f34;
                            z22 = z30;
                            f23 = f31;
                            if (!q1Var2.P5.Q3()) {
                                if (!z28 && !z29) {
                                    q1Var2.A1(canvas, f23, f42, f22, 1.0f - q1Var2.f29991rb, z10);
                                }
                                if (!z22 && !z31) {
                                    q1Var2.A1(canvas, f23, f42, f22, q1Var2.f29991rb, z10);
                                }
                            }
                        } else {
                            x1Var4 = x1Var5;
                            f21 = lineWidth;
                            rectF = rectF2;
                            boolean z32 = z25;
                            boolean z33 = z26;
                            float f44 = f18;
                            i13 = i23;
                            c10 = 6;
                            c11 = 7;
                            c12 = 4;
                            z21 = false;
                            if (!q1Var2.P5.Q3() && !z32 && !z33) {
                                q1Var2.A1(canvas, f31, i13, f34, 1.0f, z10);
                            }
                            q1Var2 = this;
                            q1Var2.T0(canvas, z32, z33, f44, f31, i13, f34, 1.0f, z10);
                            f27 = f44;
                            f22 = f34;
                            z22 = z32;
                            f23 = f31;
                        }
                        if (q1Var2.P5.Q3()) {
                            canvas2 = canvas;
                            q1Var2.A1(canvas2, f23, i13, f22, 1.0f, z10);
                        } else {
                            canvas2 = canvas;
                        }
                        x1Var5 = x1Var4;
                        x1Var5.f30768b2 = x1Var4.b();
                        if (z22 && z9 && q1Var2.getParent() != null) {
                            ((View) q1Var2.getParent()).invalidate();
                        }
                        f20 = f21;
                    }
                    canvas2.save();
                    float f45 = f30 + f20;
                    q1Var2.f30053w9 = f45;
                    float L10 = (f35 - org.telegram.messenger.g0.L(7.3f)) - staticLayout.getHeight();
                    q1Var2.f30066x9 = L10;
                    canvas2.translate(f45, L10);
                    xh.f.f(canvas2, staticLayout);
                    canvas2.restore();
                    org.telegram.ui.ActionBar.k6.T2.setAlpha(255);
                    i15 = z21;
                    z11 = z20;
                } else {
                    rectF = rectF2;
                    i10 = 2;
                    c10 = 6;
                    c11 = 7;
                    c12 = 4;
                    if (q1Var2.P5.s4()) {
                        i12 = -org.telegram.messenger.g0.L(48.0f);
                        if (q1Var2.f29786b7) {
                            i12 -= org.telegram.messenger.g0.L(4.0f);
                        }
                    } else {
                        if (q1Var2.f30051w7) {
                            i11 = q1Var2.t2() ? q1Var2.getCommentButtonHeight() : org.telegram.messenger.g0.L(43.0f);
                        } else {
                            i11 = 0;
                        }
                        i12 = -i11;
                    }
                    i13 = i12;
                    float f46 = -staticLayout.getLineLeft(0);
                    if (q1Var2.P5.P5()) {
                        p0Var.getClass();
                    }
                    if ((org.telegram.messenger.t3.T(q1Var2.f29891ja) && !q1Var2.f29891ja.megagroup) || (q1Var2.P5.f23237k.flags & 1024) != 0 || q1Var2.fa != null || x1Var5.G || q1Var2.f29959p6 || x1Var5.C) {
                        float lineWidth2 = (f12 - staticLayout.getLineWidth(0)) + f46;
                        p0Var.getClass();
                        int b11 = x1Var5.b();
                        int i29 = x1Var5.f30768b2;
                        if (i29 >= 0 && i29 != b11 && !q1Var2.f30003sb) {
                            q1Var2.C0(i29, b11, z9);
                        }
                        boolean z34 = q1Var2.f30003sb;
                        if (z34) {
                            b11 = q1Var2.f29964pb;
                        }
                        boolean z35 = (b11 & 4) != 0;
                        boolean z36 = (b11 & 8) != 0;
                        if (z34) {
                            int i30 = q1Var2.f29977qb;
                            boolean z37 = (i30 & 4) != 0;
                            boolean z38 = (i30 & 8) != 0;
                            float f47 = i13;
                            float f48 = f23;
                            boolean z39 = z37;
                            x1Var = x1Var5;
                            q1Var2.T0(canvas2, z39, z38, f27, f48, f47, f29, 1.0f - q1Var2.f29991rb, z10);
                            boolean z40 = z38;
                            boolean z41 = z35;
                            boolean z42 = z36;
                            q1Var2.T0(canvas, z41, z42, f27, f48, f47, f29, q1Var2.f29991rb, z10);
                            f27 = f27;
                            f14 = f29;
                            z12 = z41;
                            f23 = f48;
                            if (!q1Var2.P5.Q3()) {
                                if (!z39 && !z40) {
                                    q1Var2.A1(canvas, f23, f47, f14, 1.0f - q1Var2.f29991rb, z10);
                                }
                                if (!z12 && !z42) {
                                    q1Var2.A1(canvas, f23, f47, f14, q1Var2.f29991rb, z10);
                                }
                            }
                        } else {
                            x1Var = x1Var5;
                            boolean z43 = z35;
                            boolean z44 = z36;
                            if (!q1Var2.P5.Q3() && !z43 && !z44) {
                                q1Var2.A1(canvas, f23, i13, f29, 1.0f, z10);
                            }
                            q1Var2 = this;
                            float f49 = f23;
                            q1Var2.T0(canvas, z43, z44, f27, f49, i13, f29, 1.0f, z10);
                            f27 = f27;
                            f14 = f29;
                            z12 = z43;
                            f23 = f49;
                        }
                        if (q1Var2.P5.Q3()) {
                            canvas2 = canvas;
                            q1Var2.A1(canvas2, f23, i13, f14, 1.0f, z10);
                        } else {
                            canvas2 = canvas;
                        }
                        x1Var5 = x1Var;
                        x1Var5.f30768b2 = x1Var.b();
                        if (z12 && z9 && q1Var2.getParent() != null) {
                            ((View) q1Var2.getParent()).invalidate();
                        }
                        f46 = lineWidth2;
                    }
                    canvas2.save();
                    if (x1Var5.U0 && x1Var5.L1 != 1.0f) {
                        if (x1Var5.V0 != null) {
                            canvas2.translate(f30 + f46, ((f27 - org.telegram.messenger.g0.L((q1Var2.F || q1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i13);
                            int alpha5 = org.telegram.ui.ActionBar.k6.T2.getAlpha();
                            org.telegram.ui.ActionBar.k6.T2.setAlpha((int) (alpha5 * x1Var5.L1));
                            x1Var5.V0.draw(canvas2);
                            org.telegram.ui.ActionBar.k6.T2.setAlpha(alpha5);
                            xh.f.f(canvas2, x1Var5.W0);
                            i14 = 0;
                        } else {
                            int alpha6 = org.telegram.ui.ActionBar.k6.T2.getAlpha();
                            canvas2.save();
                            float f50 = i13;
                            canvas2.translate(x1Var5.f30794h1 + f46, ((f27 - org.telegram.messenger.g0.L((q1Var2.F || q1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f50);
                            float f51 = alpha6;
                            i14 = 0;
                            org.telegram.ui.ActionBar.k6.T2.setAlpha((int) ((1.0f - x1Var5.L1) * f51));
                            xh.f.f(canvas2, x1Var5.W0);
                            canvas2.restore();
                            canvas2.translate(f30 + f46, ((f27 - org.telegram.messenger.g0.L((q1Var2.F || q1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f50);
                            org.telegram.ui.ActionBar.k6.T2.setAlpha((int) (f51 * x1Var5.L1));
                            xh.f.f(canvas2, staticLayout);
                            org.telegram.ui.ActionBar.k6.T2.setAlpha(alpha6);
                        }
                    } else {
                        i14 = 0;
                        float f52 = f30 + f46;
                        q1Var2.f30053w9 = f52;
                        float L11 = ((f27 - org.telegram.messenger.g0.L((q1Var2.F || q1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i13;
                        q1Var2.f30066x9 = L11;
                        canvas2.translate(f52, L11);
                        xh.f.f(canvas2, staticLayout);
                    }
                    canvas2.restore();
                    z11 = i14 == 1 ? 1 : 0;
                    i15 = i14;
                }
                int i31 = i13;
                if (q1Var2.P5.Q3()) {
                    int b12 = x1Var5.b();
                    int i32 = x1Var5.f30768b2;
                    if (i32 >= 0 && i32 != b12 && !q1Var2.f30003sb) {
                        q1Var2.C0(i32, b12, z9);
                    }
                    if (q1Var2.f30003sb) {
                        b12 = q1Var2.f29964pb;
                    }
                    int i33 = (b12 & 1) != 0 ? true : i15;
                    int i34 = (b12 & 2) != 0 ? true : i15;
                    if ((b12 & 4) != 0) {
                        x1Var2 = x1Var5;
                        z13 = true;
                    } else {
                        x1Var2 = x1Var5;
                        z13 = i15;
                    }
                    boolean z45 = (b12 & 8) != 0 ? true : i15;
                    if (q1Var2.Gc != 0.0f) {
                        canvas2.save();
                        f16 = 0.0f;
                        canvas2.translate(0.0f, q1Var2.Gc);
                        i16 = 1;
                    } else {
                        f16 = 0.0f;
                        i16 = i15;
                    }
                    if (q1Var2.f30003sb) {
                        int i35 = q1Var2.f29977qb;
                        if ((i35 & 1) != 0) {
                            z14 = i34;
                            f17 = f23;
                            z15 = true;
                        } else {
                            z14 = i34;
                            f17 = f23;
                            z15 = i15;
                        }
                        boolean z46 = (i35 & 2) != 0 ? true : i15;
                        if ((i35 & 4) != 0) {
                            z16 = z13;
                            z17 = true;
                        } else {
                            z16 = z13;
                            z17 = i15;
                        }
                        if ((i35 & 8) != 0) {
                            z18 = z45;
                            z19 = true;
                        } else {
                            z18 = z45;
                            z19 = i15;
                        }
                        if (!z17 && z46 && z14 && !z15 && i33) {
                            x1Var3 = x1Var2;
                            f15 = f16;
                            z13 = z16;
                            str = "paintChatTimeBackground";
                            q1Var2.w1(canvas2, i33, z14, z13, z18, f17, z11, i31, f27, q1Var2.f29991rb, true, z10);
                        } else {
                            x1Var3 = x1Var2;
                            f15 = f16;
                            boolean z47 = z14;
                            boolean z48 = i33;
                            str = "paintChatTimeBackground";
                            float f53 = i31;
                            q1Var2.w1(canvas, z15, z46, z17, z19, f17, z11, f53, f27, 1.0f - q1Var2.f29991rb, false, z10);
                            z13 = z16;
                            q1Var2.w1(canvas, z48, z47, z13, z18, f17, z11, f53, f27, q1Var2.f29991rb, false, z10);
                        }
                        q1Var = this;
                        canvas2 = canvas;
                    } else {
                        x1Var3 = x1Var2;
                        f15 = f16;
                        str = "paintChatTimeBackground";
                        canvas2 = canvas;
                        w1(canvas2, i33, i34, z13, z45, f23, z11, i31, f27, 1.0f, false, z10);
                        q1Var = this;
                    }
                    if (i16 != 0) {
                        canvas2.restore();
                    }
                    x1Var3.f30768b2 = x1Var3.b();
                    if (z9 && z13 && q1Var.getParent() != null) {
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
                    Path path3 = q1Var.f29775aa;
                    path3.rewind();
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    rectF3.set(z2Var.K0, z2Var.L0, z2Var.y(), z2Var.A());
                    int[] iArr2 = z2Var.W0;
                    float f54 = iArr2[i15];
                    float[] fArr = q1Var.f29789ba;
                    fArr[1] = f54;
                    fArr[i15] = f54;
                    float f55 = iArr2[1];
                    fArr[3] = f55;
                    fArr[i10] = f55;
                    float f56 = iArr2[i10];
                    fArr[5] = f56;
                    fArr[c12] = f56;
                    float f57 = iArr2[3];
                    fArr[c11] = f57;
                    fArr[c10] = f57;
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
                            q1Var.Z9 = new xh.f();
                        }
                        q1Var.Z9.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                        q1Var.Z9.setBounds((int) z2Var.K0, (int) z2Var.L0, (int) z2Var.y(), (int) z2Var.A());
                        q1Var.Z9.draw(canvas2);
                    }
                    q1Var.invalidate();
                    canvas2.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, q1Var.getWidth(), q1Var.getHeight(), (int) (q1Var.T9 * 255.0f), 31);
                    int alpha7 = org.telegram.ui.ActionBar.k6.f27936i2.getAlpha();
                    org.telegram.ui.ActionBar.k6.f27936i2.setAlpha((int) (alpha7 * 0.7f));
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.ui.ActionBar.k6.f27936i2);
                    org.telegram.ui.ActionBar.k6.f27936i2.setAlpha(alpha7);
                    canvas.translate(q1Var.U9 + org.telegram.messenger.g0.L(4.0f), q1Var.V9);
                    Drawable drawable = org.telegram.ui.ActionBar.k6.L3;
                    int i36 = i15;
                    drawable.setBounds(i36, i36, drawable.getIntrinsicWidth(), org.telegram.ui.ActionBar.k6.L3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.k6.L3.draw(canvas);
                    canvas.translate(org.telegram.ui.ActionBar.k6.L3.getIntrinsicWidth() + org.telegram.messenger.g0.L(6.0f), f15);
                    xh.f.f(canvas, q1Var.W9);
                    canvas.restore();
                    if (q1Var.f29955p2 != null && z2Var.Q0 && q1Var.f30084z2 == 0) {
                        int i37 = iz.Y0;
                        int i38 = i10;
                        if (i37 > i38) {
                            L = org.telegram.messenger.g0.L(i37 - i38);
                            z11 = iz.Y0 < 10 ? i36 : true;
                        } else {
                            L = org.telegram.messenger.g0.L(i37);
                        }
                        int L12 = (int) (z2Var.K0 + org.telegram.messenger.g0.L(9.0f));
                        int L13 = (int) (z2Var.L0 + org.telegram.messenger.g0.L(6.0f));
                        RectF rectF4 = rectF;
                        rectF4.set(L12 - org.telegram.messenger.g0.L(4.0f), L13 - org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(z11 ? 2.0f : f15) + org.telegram.messenger.g0.L(4.0f) + q1Var.Y1 + L12, org.telegram.messenger.g0.L(1.5f) + q1Var.f29955p2.getHeight() + L13);
                        canvas.drawRoundRect(rectF4, L, L, q1Var.Z1(str));
                        canvas.save();
                        if (!z11) {
                            i38 = i36;
                        }
                        canvas.translate(L12 + i38, L13);
                        xh.f.f(canvas, q1Var.f29955p2);
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final boolean y2() {
        if (!this.f29883j1 && !this.f30063x6 && !this.f30050w6) {
            return false;
        }
        return true;
    }

    public final void y3(float f10, float f11, boolean z9) {
        float f12;
        boolean z10;
        if (this.h != z9) {
            this.h = z9;
            N();
            if (z9) {
                invalidate();
            }
        }
        di.z2 z2Var = this.T0;
        float f13 = f10 - z2Var.L0;
        float measuredHeight = f11 - (getMeasuredHeight() - z2Var.A());
        float f14 = z2Var.N0;
        if (f13 > 0.0f) {
            f12 = f14 - f13;
        } else {
            f12 = f14;
        }
        if (measuredHeight > 0.0f) {
            f12 -= measuredHeight;
        }
        if (f12 / f14 < 0.25f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29993s = z10;
        z2Var.A1 = z10;
    }

    public final void z(int i7, int i10, int i11) {
        int l1;
        boolean z9;
        int i12;
        int i13;
        kv kvVar;
        boolean z10;
        if (this.P5.s4()) {
            this.f29772a7 = org.telegram.messenger.g0.L(31.0f) + i11;
        } else if (b4()) {
            this.f29772a7 = org.telegram.messenger.g0.L(31.0f) + i11;
        } else {
            ch.p0 p0Var = this.N;
            if (!p0Var.f6373p) {
                l1 = p0Var.f6375r;
            } else {
                l1 = this.P5.l1();
            }
            int i14 = 0;
            if (!p0Var.f6373p) {
                if (i7 - l1 >= i10 && !this.P5.f23277u2) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (this.T1) {
                    this.f30017u0 = org.telegram.messenger.g0.L(14.0f) + this.f30017u0;
                }
            } else if ((this.f30018u1 || ((!this.Q1 || this.P5.s4()) && !f2() && !this.R1 && !this.S1 && !this.T1)) && i7 - l1 >= i10 && !this.P5.f23277u2) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (this.P5.H4()) {
                z9 = true;
            }
            if (p0Var.f6373p && (kvVar = this.P5.f23284w2) != null) {
                ArrayList arrayList = kvVar.h;
                ArrayList arrayList2 = kvVar.f23761g;
                if (!arrayList2.isEmpty() && !kvVar.d && !kvVar.I()) {
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            if (((bu) obj).f21697b >= arrayList2.size() - 1) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    z10 = ((fu) jg.g.i(1, arrayList2)).v();
                } else {
                    z10 = true;
                    break;
                }
                if (z10) {
                    z9 = true;
                }
            }
            ij ijVar = this.P5;
            if ((ijVar.D2 && p0Var.f6373p) || ((ijVar.H2 && p0Var.f6373p) || ijVar.w3())) {
                i12 = 18;
                z9 = true;
            } else {
                i12 = 14;
            }
            if (z9) {
                this.f30017u0 = org.telegram.messenger.g0.L(i12) + this.f30017u0;
                this.f29786b7 = true;
                int L = org.telegram.messenger.g0.L(31.0f) + Math.max(i11, l1);
                this.f29772a7 = L;
                if (this.P5.Q3()) {
                    i13 = org.telegram.messenger.g0.L(17.0f) + this.z9;
                } else {
                    i13 = this.z9;
                }
                this.f29772a7 = org.telegram.messenger.k5.b(31.0f, i13, L);
            } else {
                int extraTextX = (i11 - getExtraTextX()) - l1;
                if (extraTextX >= 0 && extraTextX <= i10) {
                    this.f29772a7 = org.telegram.messenger.g0.L(31.0f) + ((i11 + i10) - extraTextX);
                } else {
                    this.f29772a7 = org.telegram.messenger.g0.L(31.0f) + Math.max(i11, l1 + i10);
                }
            }
            if (t2()) {
                this.f29772a7 = org.telegram.messenger.g0.L(31.0f) + i7;
            }
        }
    }

    public final void z0(long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.z0(long, long):void");
    }

    public final void z1(android.graphics.Canvas r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.z1(android.graphics.Canvas, int):void");
    }

    public final boolean z2() {
        if (this.Q5 != null) {
            return this.U5;
        }
        return this.G;
    }

    public final void z3(int i7, int i10, int i11, float f10, float f11, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        kv kvVar;
        x1 x1Var;
        fj fjVar;
        ij ijVar;
        this.f29952oc = i7;
        this.f29978qc = i10;
        this.f29992rc = i11;
        this.K0 = i12;
        this.L0 = i13;
        this.f30016tc = f11;
        this.f30004sc = f10;
        this.f29790bb = i13;
        this.f29803cb = i14;
        this.f29816db = i15;
        this.f29965pc = i16;
        if ((!this.H5.isEmpty() || (this.f30043w != null && (ijVar = this.P5) != null && ijVar.D == 27)) && this.f29776ab != f11) {
            invalidate();
        }
        this.f29776ab = f11;
        if (i11 != this.L0 || f10 != this.M0) {
            this.M0 = f10;
            this.L0 = i11;
        }
        if (this.P5 != null && g2() && this.P5.Q5()) {
            invalidate();
        }
        ij ijVar2 = this.P5;
        if (ijVar2 != null && ijVar2.f23296z2 != null) {
            int i19 = i7 - this.f30005t0;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                int size = this.P5.f23296z2.size();
                x1Var = this.f29868hb;
                if (i20 >= size || ((fj) this.P5.f23296z2.get(i20)).p(this.P5.f23296z2, x1Var) > i19) {
                    break;
                }
                i21 = i20;
                i20++;
            }
            int i22 = 0;
            int i23 = -1;
            int i24 = -1;
            while (i21 < this.P5.f23296z2.size()) {
                float p10 = ((fj) this.P5.f23296z2.get(i21)).p(this.P5.f23296z2, x1Var);
                float j3 = fjVar.f22391f + p10 + fjVar.j(x1Var) + fjVar.h;
                float f12 = i19;
                if (o2(p10, j3, f12, i19 + i10)) {
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
            if (this.D0 == i24 && this.E0 == i23 && this.F0 == i22) {
                if (this.f30091za != null) {
                    int i25 = 0;
                    while (true) {
                        if (i25 >= this.f30091za.f36192a.size()) {
                            break;
                        }
                        org.telegram.ui.Components.m5 m5Var = (org.telegram.ui.Components.m5) this.f30091za.f36192a.get(i25);
                        if (m5Var != null && m5Var.f35852n) {
                            float y10 = (0.0f - getY()) - m5Var.f35853r;
                            float y11 = (this.f29928n - getY()) - m5Var.f35853r;
                            Rect rect = m5Var.f35850e;
                            if (rect.bottom >= y10 && rect.top <= y11) {
                                invalidate();
                                break;
                            }
                        }
                        i25++;
                    }
                }
            } else {
                this.D0 = i24;
                this.E0 = i23;
                this.F0 = i22;
                invalidate();
            }
        }
        ij ijVar3 = this.P5;
        if (ijVar3 != null && (kvVar = ijVar3.f23284w2) != null) {
            ArrayList arrayList = kvVar.f23761g;
            int i26 = i7 - this.f30005t0;
            int i27 = -1;
            int i28 = -1;
            for (int i29 = 0; i29 < arrayList.size(); i29++) {
                fu fuVar = (fu) arrayList.get(i29);
                if (fuVar.Q || fuVar.R) {
                    float f13 = fuVar.M;
                    float f14 = i26 + i10;
                    if (o2(f13, fuVar.I() + f13, i26, f14)) {
                        if (i27 == -1) {
                            i27 = i29;
                        }
                        i28 = i29;
                    } else if (f13 > f14) {
                        break;
                    }
                }
            }
            if (this.G0 != i27 || this.H0 != i28) {
                this.G0 = i27;
                this.H0 = i28;
                invalidate();
            }
        }
        ArrayList arrayList2 = this.P4;
        if (!arrayList2.isEmpty()) {
            int i30 = -1;
            int i31 = -1;
            for (int i32 = 0; i32 < arrayList2.size(); i32++) {
                p1 p1Var = (p1) arrayList2.get(i32);
                int i33 = p1Var.f29708b + this.Ta;
                if (o2(i33, i33 + p1Var.f29709c, this.f29952oc, i18 + this.f29978qc)) {
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
            if (Math.abs(this.T8 - Math.max(Math.min(org.telegram.messenger.g0.L(4.0f) + (-this.f29965pc), this.R8 - org.telegram.messenger.g0.L(42.0f)), org.telegram.messenger.g0.L(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        ch.p0 p0Var = this.N;
        int i34 = p0Var.f6362c;
        boolean o22 = o2(i34, i34 + p0Var.f6370m, this.f29952oc, i17 + this.f29978qc);
        if (this.U4 != o22) {
            this.U4 = o22;
            invalidate();
        }
    }

    public q1(Context context, int i7, boolean z9, h6.m mVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = true;
        this.f30056x = new ob.c();
        xq xqVar = xq.h;
        this.D = new te.a(0, this, xqVar, 380L, false);
        this.N = new ch.p0(this);
        this.O = new zg.a(this);
        this.P = new zg.c(this);
        this.C0 = new Rect();
        this.G0 = -1;
        this.H0 = -1;
        this.S0 = new int[4];
        this.I2 = new Drawable[2];
        this.J2 = new org.telegram.ui.ActionBar.w5[2];
        this.K2 = new int[2];
        this.L2 = new RectF();
        this.M2 = new int[]{16842910, 16842919};
        this.f29873i3 = -1;
        this.j3 = -1;
        this.f29769a4 = new RectF();
        this.f29783b4 = new RectF();
        this.f29885j4 = 1.0f;
        this.f29898k4 = 1.0f;
        this.f29998s4 = -1;
        this.f30009t4 = new n2.n0(this);
        this.f30034v4 = new ArrayList();
        this.f30048w4 = new ArrayList();
        this.A4 = new Path();
        this.O4 = new ArrayList();
        this.P4 = new ArrayList();
        this.R4 = -1;
        this.S4 = -1;
        this.U4 = true;
        this.H5 = new ArrayList();
        this.f29785b6 = -1;
        this.C6 = true;
        this.H6 = true;
        this.f29772a7 = 100;
        this.f30064x7 = new Rect();
        this.R7 = new AtomicReference();
        this.f29774a9 = new RectF();
        this.f29962p9 = new StaticLayout[2];
        this.f30039v9 = new float[2];
        this.E9 = true;
        this.I9 = new Path();
        this.J9 = new float[8];
        this.T9 = 1.0f;
        this.f29775aa = new Path();
        this.f29789ba = new float[8];
        this.La = new RectF();
        this.Ma = new RectF();
        this.f29842fb = Build.VERSION.SDK_INT == 28;
        this.f29855gb = 1.0f;
        this.f29868hb = new x1(this);
        this.f29916lb = new org.telegram.ui.Components.w5(this, 200L, xq.f40330g);
        this.f29951ob = new h1(this, 0);
        this.f30041vb = new h1(this, 1);
        this.f30055wb = new SparseArray();
        this.Kb = -1;
        this.Mb = new m.c3();
        this.Sb = new ArrayList();
        this.Tb = new Stack();
        this.Ub = new Path();
        this.Xb = new c1(this, 10);
        this.Yb = new c1(this, 2);
        this.f29829ec = false;
        this.f29927mc = new AtomicReference();
        this.f29940nc = -1L;
        this.f30093zc = false;
        this.Ac = new c1(this, 0);
        this.Jc = true;
        this.Rc = 1.0f;
        this.Wc = new g1(Float.class, "animationOffsetX", 0);
        this.Yc = new Path();
        this.Z5 = i7;
        this.Pb = f6Var;
        this.Qb = z9;
        this.Rb = mVar;
        if (mVar == null) {
            this.Rb = new h6.m(context);
        }
        setClipChildren(false);
        setClipToPadding(false);
        ?? drawable = new Drawable();
        drawable.f34524a = new Paint(1);
        drawable.f34525b = null;
        drawable.h = -1.0f;
        drawable.f34530i = -1.0f;
        drawable.f34531j = -1.0f;
        drawable.f34532k = -1.0f;
        drawable.f34534m = this;
        this.Sa = drawable;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f30089z7 = imageReceiver;
        imageReceiver.f21233z1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(21.0f));
        this.A7 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.S7 = imageReceiver2;
        imageReceiver2.f21233z1 = true;
        imageReceiver2.J0(org.telegram.messenger.g0.L(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.E7 = imageReceiver3;
        imageReceiver3.f21233z1 = true;
        imageReceiver3.J0(org.telegram.messenger.g0.L(26.1f));
        this.Y5 = org.telegram.messenger.z5.q(i7).k();
        this.W0 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        di.z2 z2Var = new di.z2(this, this, 2);
        this.T0 = z2Var;
        z2Var.f21233z1 = true;
        z2Var.f21201l0 = true;
        z2Var.f21192g1 = this;
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.U0 = imageReceiver4;
        imageReceiver4.f21233z1 = true;
        imageReceiver4.f21201l0 = true;
        this.P0 = new RadialProgress2(this, f6Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.Q0 = radialProgress2;
        radialProgress2.B = false;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(15.0f));
        i1 i1Var = new i1(this, this);
        this.C4 = i1Var;
        i1Var.h = this;
        ?? obj = new Object();
        obj.f36978a = 0;
        obj.f36979b = 0;
        obj.f36981e = false;
        obj.f36982f = false;
        obj.f36994s = 1.0f;
        obj.f36995t = 1.0f;
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(125L, 600L, xqVar);
        obj.v = w5Var;
        obj.f36997w = 1.0f;
        org.telegram.ui.Components.w5 w5Var2 = new org.telegram.ui.Components.w5(150L, xq.f40329f);
        obj.B = w5Var2;
        obj.J = false;
        if (pm0.N == null) {
            pm0.N = new Paint(1);
            pm0.O = new Paint(1);
            Paint paint = pm0.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            pm0.O.setStyle(style);
        }
        this.D4 = obj;
        obj.f36986k = this;
        obj.f36989n = this;
        w5Var2.f39855a = this;
        w5Var.f39855a = this;
        this.E4 = new org.telegram.ui.ActionBar.u0(this, 1);
        ?? drawable2 = new Drawable();
        drawable2.f33263a = 0L;
        drawable2.f33264b = false;
        drawable2.f33265c = new Paint(1);
        drawable2.d = 0.47f;
        drawable2.f33266e = 0.0f;
        drawable2.f33267f = 0.32f;
        drawable2.f33268g = 1;
        drawable2.h = 1;
        drawable2.f33269i = 1;
        drawable2.f33273m = 255;
        drawable2.f33274n = f6Var;
        drawable2.f33270j = this;
        this.f29795c3 = drawable2;
        setImportantForAccessibility(1);
    }

    public void setBackgroundTopY(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.t4 t4Var = this.K6;
        int i12 = this.K0;
        int i13 = this.L0;
        if (i13 == 0) {
            i12 = getParentWidth();
            i13 = org.telegram.messenger.g0.f22537q.y;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                i11 = view.getMeasuredWidth();
                i10 = view.getMeasuredHeight();
                float f10 = this.M0;
                t4Var.q((int) (i7 + f10), i11, i10, (int) f10, this.f29803cb, this.f29816db, this.E, (this.F && this.f29868hb.A0 == 1.0f) ? false : true);
                t4Var.f28524u = h2();
            }
        }
        i10 = i13;
        i11 = i12;
        float f102 = this.M0;
        t4Var.q((int) (i7 + f102), i11, i10, (int) f102, this.f29803cb, this.f29816db, this.E, (this.F && this.f29868hb.A0 == 1.0f) ? false : true);
        t4Var.f28524u = h2();
    }

    @Override
    public void invalidate(int i7, int i10, int i11, int i12) {
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
        super.invalidate(i7, i10, i11, i12);
        if (this.f29771a6 && getParent() != null) {
            ((View) getParent()).invalidate(((int) getX()) + i7, ((int) getY()) + i10, ((int) getX()) + i11, ((int) getY()) + i12);
        }
        if (!this.Vb || (l1Var = this.Ra) == null) {
            return;
        }
        l1Var.p();
    }

    @Override
    public final void F(float f10, int i7) {
    }

    @Override
    public final void t0(int i7, Drawable drawable) {
    }
}
