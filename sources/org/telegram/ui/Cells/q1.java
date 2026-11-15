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
import di.bc;
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
import org.telegram.messenger.bj;
import org.telegram.messenger.cu;
import org.telegram.messenger.dj;
import org.telegram.messenger.ej;
import org.telegram.messenger.ez;
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hb;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.iv;
import org.telegram.messenger.kc;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.qc;
import org.telegram.messenger.si;
import org.telegram.messenger.wo;
import org.telegram.messenger.yi;
import org.telegram.messenger.yt;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.d41;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.e01;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.x11;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dr0;
import org.telegram.ui.ol;
import org.telegram.ui.tg0;
public class q1 extends z implements mm0, kc, org.telegram.messenger.x5, p9, is, te.b, p4, l60 {
    public static final float[] f30899wd = new float[8];
    public static TextPaint f30900xd;
    public static TextPaint f30901yd;
    public int A0;
    public long A1;
    public int A2;
    public StaticLayout A3;
    public CharacterStyle A4;
    public TLRPC.Message A5;
    public float A6;
    public final ImageReceiver A7;
    public org.telegram.ui.Components.u5 A8;
    public int A9;
    public org.telegram.ui.Components.l5 Aa;
    public float Ab;
    public tg0 Ac;
    public boolean B0;
    public boolean B1;
    public int B2;
    public long B3;
    public final Path B4;
    public boolean B5;
    public long B6;
    public final org.telegram.ui.Components.t8 B7;
    public u70 B8;
    public int B9;
    public org.telegram.ui.Components.l5 Ba;
    public float Bb;
    public boolean Bc;
    public boolean C0;
    public boolean C1;
    public int C2;
    public int C3;
    public boolean C4;
    public int C5;
    public boolean C6;
    public boolean C7;
    public d80 C8;
    public int C9;
    public org.telegram.ui.Components.l5 Ca;
    public float Cb;
    public final d1 Cc;
    public final Rect D0;
    public int D1;
    public int D2;
    public oy0 D3;
    public final i1 D4;
    public int D5;
    public boolean D6;
    public boolean D7;
    public ArrayList D8;
    public int D9;
    public org.telegram.ui.Components.l5 Da;
    public float Db;
    public Runnable Dc;
    public final te.a E;
    public int E0;
    public float E1;
    public boolean E2;
    public oy0 E3;
    public final tm0 E4;
    public boolean E5;
    public boolean E6;
    public boolean E7;
    public boolean E8;
    public CharSequence E9;
    public org.telegram.ui.Components.l5 Ea;
    public long Eb;
    public Runnable Ec;
    public boolean F;
    public int F0;
    public boolean F1;
    public boolean F2;
    public oy0 F3;
    public final org.telegram.ui.ActionBar.u0 F4;
    public boolean F5;
    public boolean F6;
    public final ImageReceiver F7;
    public int F8;
    public boolean F9;
    public dc Fa;
    public float Fb;
    public int Fc;
    public boolean G;
    public int G0;
    public int G1;
    public boolean G2;
    public boolean G3;
    public int G4;
    public float G5;
    public boolean G6;
    public int G7;
    public boolean G8;
    public boolean G9;
    public dc Ga;
    public float Gb;
    public int Gc;
    public boolean H;
    public int H0;
    public float H1;
    public dc H2;
    public boolean H3;
    public int H4;
    public boolean H5;
    public boolean H6;
    public Drawable[] H7;
    public int H8;
    public Paint H9;
    public dc Ha;
    public int Hb;
    public boolean Hc;
    public boolean I;
    public int I0;
    public int I1;
    public int I2;
    public boolean I3;
    public boolean I4;
    public final ArrayList I5;
    public boolean I6;
    public int[] I7;
    public boolean I8;
    public Path I9;
    public float Ia;
    public float Ib;
    public float Ic;
    public boolean J;
    public boolean J0;
    public int J1;
    public final Drawable[] J2;
    public boolean J3;
    public b1 J4;
    public f1 J5;
    public int J6;
    public Drawable J7;
    public boolean J8;
    public final Path J9;
    public float Ja;
    public float Jb;
    public Paint Jc;
    public boolean K;
    public boolean K0;
    public long K1;
    public final org.telegram.ui.ActionBar.v5[] K2;
    public int K3;
    public c1 K4;
    public int K5;
    public boolean K6;
    public Drawable K7;
    public boolean K8;
    public final float[] K9;
    public y Ka;
    public float Kb;
    public Drawable Kc;
    public bj L;
    public int L0;
    public long L1;
    public final int[] L2;
    public int L3;
    public StaticLayout L4;
    public boolean L5;
    public org.telegram.ui.ActionBar.r4 L6;
    public int L7;
    public int L8;
    public xh.f L9;
    public Path La;
    public int Lb;
    public boolean Lc;
    public yi M;
    public int M0;
    public int M1;
    public final RectF M2;
    public int M3;
    public double M4;
    public boolean M5;
    public org.telegram.ui.ActionBar.r4 M6;
    public boolean M7;
    public boolean M8;
    public float M9;
    public final RectF Ma;
    public boolean Mb;
    public uw0 Mc;
    public boolean N;
    public float N0;
    public TLRPC.Document N1;
    public final int[] N2;
    public int N3;
    public int N4;
    public int N5;
    public int N6;
    public boolean N7;
    public Path N8;
    public float N9;
    public final RectF Na;
    public final m.b3 Nb;
    public int Nc;
    public final ch.q0 O;
    public boolean O0;
    public boolean O1;
    public float O2;
    public int O3;
    public int O4;
    public xh.f O5;
    public int O6;
    public boolean O7;
    public Path O8;
    public float O9;
    public int Oa;
    public m51 Ob;
    public m1 Oc;
    public final zg.a P;
    public boolean P0;
    public h6.m P1;
    public SpannableStringBuilder P2;
    public int P3;
    public final ArrayList P4;
    public boolean P5;
    public int P6;
    public CheckBoxBase P7;
    public float[] P8;
    public float P9;
    public float Pa;
    public j1 Pb;
    public StaticLayout Pc;
    public final zg.c Q;
    public final RadialProgress2 Q0;
    public int Q1;
    public boolean Q2;
    public int Q3;
    public final ArrayList Q4;
    public gj Q5;
    public int Q6;
    public StaticLayout Q7;
    public float[] Q8;
    public xh.e Q9;
    public float Qa;
    public org.telegram.ui.ActionBar.e6 Qb;
    public String Qc;
    public boolean R;
    public final RadialProgress2 R0;
    public boolean R1;
    public boolean R2;
    public int R3;
    public float R4;
    public gj R5;
    public int R6;
    public StaticLayout R7;
    public float R8;
    public Integer R9;
    public int Ra;
    public final boolean Rb;
    public u70 Rc;
    public long S;
    public boolean S0;
    public boolean S1;
    public long S2;
    public int S3;
    public int S4;
    public bj S5;
    public boolean S6;
    public final AtomicReference S7;
    public float S8;
    public Path S9;
    public l1 Sa;
    public final h6.m Sb;
    public final Path Sc;
    public oy0 T;
    public final int[] T0;
    public boolean T1;
    public boolean T2;
    public int T3;
    public int T4;
    public boolean T5;
    public y31 T6;
    public final ImageReceiver T7;
    public float T8;
    public float[] T9;
    public final k90 Ta;
    public final ArrayList Tb;
    public final RectF Tc;
    public u70 U;
    public final fi.u2 U0;
    public boolean U1;
    public int U2;
    public int U3;
    public float U4;
    public boolean U5;
    public y31 U6;
    public int U7;
    public float U8;
    public final float U9;
    public int Ua;
    public final Stack Ub;
    public Paint Uc;
    public CornerPathEffect V;
    public final ImageReceiver V0;
    public boolean V1;
    public y V2;
    public int V3;
    public boolean V4;
    public boolean V5;
    public int V6;
    public int V7;
    public StaticLayout V8;
    public float V9;
    public int Va;
    public final Path Vb;
    public int Vc;
    public int W;
    public ColorMatrixColorFilter W0;
    public int W1;
    public boolean W2;
    public int W3;
    public boolean W4;
    public boolean W5;
    public boolean W6;
    public float W7;
    public int W8;
    public float W9;
    public int Wa;
    public boolean Wb;
    public ej Wc;
    public final org.telegram.ui.Components.t8 X0;
    public int X1;
    public boolean X2;
    public int X3;
    public boolean X4;
    public l4 X5;
    public boolean X6;
    public int X7;
    public boolean X8;
    public StaticLayout X9;
    public int Xa;
    public k8.a Xb;
    public boolean Xc;
    public t1 Y0;
    public int Y1;
    public int Y2;
    public boolean Y3;
    public boolean Y4;
    public AnimatorSet Y5;
    public boolean Y6;
    public int Y7;
    public boolean Y8;
    public int Y9;
    public int Ya;
    public final d1 Yb;
    public boolean Yc;
    public hi.l Z0;
    public int Z1;
    public y Z2;
    public boolean Z3;
    public boolean Z4;
    public final int Z5;
    public float Z6;
    public int Z7;
    public boolean Z8;
    public String Z9;
    public float Za;
    public final d1 Zb;
    public long Zc;
    public long f30902a0;
    public Paint f30903a1;
    public int f30904a2;
    public int f30905a3;
    public boolean f30906a4;
    public boolean f30907a5;
    public final int f30908a6;
    public int f30909a7;
    public int f30910a8;
    public StaticLayout f30911a9;
    public xh.f f30912aa;
    public boolean f30913ab;
    public long f30914ac;
    public long f30915ad;
    public oy0 f30916b0;
    public ch0 f30917b1;
    public int f30918b2;
    public y f30919b3;
    public final RectF f30920b4;
    public boolean f30921b5;
    public boolean f30922b6;
    public int f30923b7;
    public int f30924b8;
    public final RectF f30925b9;
    public final Path f30926ba;
    public float f30927bb;
    public float f30928bc;
    public long bd;
    public u70 f30929c0;
    public Paint f30930c1;
    public int f30931c2;
    public boolean f30932c3;
    public final RectF f30933c4;
    public boolean f30934c5;
    public int f30935c6;
    public boolean f30936c7;
    public boolean f30937c8;
    public dc f30938c9;
    public final float[] f30939ca;
    public int f30940cb;
    public float f30941cc;
    public final RectF f30942cd;
    public CornerPathEffect f30943d0;
    public Paint f30944d1;
    public float d2;
    public final jk0 f30945d3;
    public TLObject f30946d4;
    public int f30947d5;
    public byte[] f30948d6;
    public int f30949d7;
    public boolean f30950d8;
    public RectF f30951d9;
    public StaticLayout f30952da;
    public int f30953db;
    public org.telegram.ui.ActionBar.r4[] dc;
    public final RectF f30954dd;
    public int f30955e0;
    public Paint f30956e1;
    public float f30957e2;
    public StaticLayout f30958e3;
    public TLRPC.PhotoSize f30959e4;
    public float f30960e5;
    public byte[] f30961e6;
    public int f30962e7;
    public boolean f30963e8;
    public wg.a f30964e9;
    public int f30965ea;
    public int eb;
    public boolean f30966ec;
    public Paint f30967ed;
    public boolean f30968f;
    public i01 f30969f0;
    public fv0 f30970f1;
    public int f30971f2;
    public int f30972f3;
    public TLRPC.PhotoSize f30973f4;
    public boolean f30974f5;
    public boolean f30975f6;
    public CheckBoxBase[] f30976f7;
    public boolean f30977f8;
    public int f30978f9;
    public String fa;
    public boolean f30979fb;
    public boolean fc;
    public Paint f30980fd;
    public int f30981g0;
    public boolean f30982g1;
    public StaticLayout f30983g2;
    public int f30984g3;
    public BitmapDrawable f30985g4;
    public boolean f30986g5;
    public boolean f30987g6;
    public p30 f30988g7;
    public boolean f30989g8;
    public float f30990g9;
    public StaticLayout f30991ga;
    public final boolean f30992gb;
    public boolean f30993gc;
    public float f30994gd;
    public boolean h;
    public tw0 f30995h0;
    public float f30996h1;
    public StaticLayout f30997h2;
    public boolean f30998h3;
    public String f30999h4;
    public float f31000h5;
    public boolean f31001h6;
    public d80 h7;
    public org.telegram.ui.Components.u5 f31002h8;
    public float f31003h9;
    public int f31004ha;
    public float f31005hb;
    public m1 f31006hc;
    public int f31007hd;
    public int f31008i0;
    public float f31009i1;
    public float f31010i2;
    public v1 f31011i3;
    public String f31012i4;
    public int f31013i5;
    public boolean f31014i6;
    public float i7;
    public float f31015i8;
    public float f31016i9;
    public String f31017ia;
    public final x1 f31018ib;
    public m1 f31019ic;
    public ej f31020id;
    public long f31021j0;
    public boolean f31022j1;
    public float f31023j2;
    public int j3;
    public boolean f31024j4;
    public TLRPC.Poll f31025j5;
    public boolean f31026j6;
    public long f31027j7;
    public float f31028j8;
    public boolean f31029j9;
    public TLRPC.User f31030ja;
    public boolean f31031jb;
    public boolean f31032jc;
    public float f31033jd;
    public int f31034k0;
    public boolean f31035k1;
    public float f31036k2;
    public int f31037k3;
    public float f31038k4;
    public ArrayList f31039k5;
    public boolean f31040k6;
    public ImageReceiver[] f31041k7;
    public TLRPC.PhotoSize f31042k8;
    public boolean f31043k9;
    public TLRPC.Chat f31044ka;
    public boolean kb;
    public boolean f31045kc;
    public float f31046kd;
    public dc f31047l0;
    public CheckBoxBase l1;
    public float f31048l2;
    public int f31049l3;
    public float f31050l4;
    public int f31051l5;
    public boolean f31052l6;
    public org.telegram.ui.Components.t8[] f31053l7;
    public int f31054l8;
    public boolean f31055l9;
    public TLRPC.FileLocation f31056la;
    public boolean f31057lb;
    public int f31058lc;
    public final g1 f31059ld;
    public org.telegram.ui.Components.e5 m0;
    public CheckBoxBase f31060m1;
    public boolean f31061m2;
    public ej f31062m3;
    public long f31063m4;
    public e01 f31064m5;
    public boolean f31065m6;
    public boolean[] f31066m7;
    public Drawable f31067m8;
    public float f31068m9;
    public String ma;
    public final org.telegram.ui.Components.u5 mb;
    public m1 f31069mc;
    public RectF f31070md;
    public int f31071n;
    public boolean f31072n0;
    public boolean n1;
    public dc f31073n2;
    public ej f31074n3;
    public long f31075n4;
    public org.telegram.ui.Components.u5 f31076n5;
    public boolean f31077n6;
    public StaticLayout f31078n7;
    public ek0 f31079n8;
    public float f31080n9;
    public Object f31081na;
    public org.telegram.messenger.n6 f31082nb;
    public Drawable f31083nc;
    public final Path f31084nd;
    public int f31085o0;
    public boolean f31086o1;
    public StaticLayout f31087o2;
    public sg0 f31088o3;
    public boolean o4;
    public int f31089o5;
    public boolean f31090o6;
    public org.telegram.ui.Components.y5 f31091o7;
    public ek0 f31092o8;
    public StaticLayout f31093o9;
    public long f31094oa;
    public boolean f31095ob;
    public final AtomicReference f31096oc;
    public ColorFilter[] f31097od;
    public int f31098p0;
    public float f31099p1;
    public StaticLayout f31100p2;
    public CharSequence f31101p3;
    public boolean f31102p4;
    public int f31103p5;
    public boolean f31104p6;
    public boolean f31105p7;
    public ek0 f31106p8;
    public int f31107p9;
    public String f31108pa;
    public final h1 f31109pb;
    public long f31110pc;
    public int[] f31111pd;
    public int f31112q0;
    public long f31113q1;
    public StaticLayout f31114q2;
    public ej f31115q3;
    public org.telegram.ui.Components.p5 f31116q4;
    public boolean f31117q5;
    public boolean f31118q6;
    public int f31119q7;
    public ek0 f31120q8;
    public final StaticLayout[] f31121q9;
    public org.telegram.ui.Components.e5 f31122qa;
    public int f31123qb;
    public int f31124qc;
    public Paint f31125qd;
    public n3 f31126r;
    public int f31127r0;
    public int f31128r1;
    public StaticLayout f31129r2;
    public int f31130r3;
    public a80 f31131r4;
    public boolean f31132r5;
    public boolean f31133r6;
    public int f31134r7;
    public ek0 f31135r8;
    public int f31136r9;
    public org.telegram.ui.Components.e5 f31137ra;
    public int f31138rb;
    public int f31139rc;
    public float f31140rd;
    public boolean f31141s;
    public s1 f31142s0;
    public org.telegram.ui.f5 f31143s1;
    public float f31144s2;
    public float f31145s3;
    public dj f31146s4;
    public float s5;
    public boolean f31147s6;
    public boolean f31148s7;
    public boolean f31149s8;
    public boolean s9;
    public TLRPC.User f31150sa;
    public float f31151sb;
    public int f31152sc;
    public float f31153sd;
    public u1 f31154t0;
    public eq f31155t1;
    public float f31156t2;
    public float f31157t3;
    public int f31158t4;
    public int f31159t5;
    public long t6;
    public int f31160t7;
    public bc f31161t8;
    public float f31162t9;
    public TLRPC.User f31163ta;
    public boolean f31164tb;
    public int f31165tc;
    public int f31166td;
    public int f31167u0;
    public ci.b1 f31168u1;
    public boolean f31169u2;
    public int f31170u3;
    public final n2.o0 f31171u4;
    public float f31172u5;
    public boolean f31173u6;
    public int f31174u7;
    public int f31175u8;
    public int f31176u9;
    public TLRPC.Chat f31177ua;
    public ValueAnimator f31178ub;
    public float f31179uc;
    public int f31180ud;
    public int f31181v0;
    public boolean f31182v1;
    public RectF f31183v2;
    public int f31184v3;
    public int f31185v4;
    public float f31186v5;
    public boolean f31187v6;
    public int f31188v7;
    public y f31189v8;
    public int f31190v9;
    public String f31191va;
    public int f31192vb;
    public float f31193vc;
    public TL_stars.StarGift f31194vd;
    public l0 f31195w;
    public int f31196w0;
    public boolean f31197w1;
    public r1 f31198w2;
    public int f31199w3;
    public final ArrayList f31200w4;
    public int f31201w5;
    public boolean f31202w6;
    public int f31203w7;
    public oy0 f31204w8;
    public final float[] f31205w9;
    public String f31206wa;
    public final h1 f31207wb;
    public org.telegram.ui.Components.z7 wc;
    public final b9.g0 f31208x;
    public int f31209x0;
    public boolean f31210x1;
    public w1 f31211x2;
    public StaticLayout f31212x3;
    public final ArrayList f31213x4;
    public int f31214x5;
    public boolean f31215x6;
    public boolean f31216x7;
    public oy0 f31217x8;
    public float f31218x9;
    public boolean f31219xa;
    public final SparseArray f31220xb;
    public xi.e xc;
    public boolean f31221y;
    public int f31222y0;
    public boolean f31223y1;
    public int f31224y2;
    public org.telegram.ui.Components.g6 f31225y3;
    public d80 f31226y4;
    public boolean f31227y5;
    public boolean f31228y6;
    public final Rect f31229y7;
    public int f31230y8;
    public float f31231y9;
    public boolean ya;
    public boolean f31232yb;
    public boolean f31233yc;
    public int f31234z0;
    public boolean f31235z1;
    public CharSequence f31236z2;
    public org.telegram.ui.Components.g6 f31237z3;
    public ArrayList f31238z4;
    public String f31239z5;
    public int f31240z6;
    public boolean f31241z7;
    public int f31242z8;
    public StaticLayout f31243z9;
    public boolean f31244za;
    public boolean f31245zb;
    public boolean f31246zc;

    public q1(Context context, int i7) {
        this(context, i7, false, null, null);
    }

    public static boolean D2(m1 m1Var, float f10, float f11) {
        RectF rectF = m1Var.d;
        if (f10 >= rectF.left - org.telegram.messenger.g0.L(6.0f) && f10 <= rectF.right + org.telegram.messenger.g0.L(6.0f) && f11 >= rectF.top - org.telegram.messenger.g0.L(4.0f) && f11 <= rectF.bottom + org.telegram.messenger.g0.L(4.0f)) {
            return true;
        }
        return false;
    }

    public static StaticLayout I1(CharSequence charSequence, TextPaint textPaint, int i7, int i10, int i11, int i12) {
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
        return ou0.c(spannableStringBuilder, textPaint, i17, Layout.Alignment.ALIGN_NORMAL, org.telegram.messenger.g0.L(1.0f), TextUtils.TruncateAt.END, i17, i12, true);
    }

    public static int K1(yi yiVar) {
        int i7 = 0;
        if (yiVar != null) {
            if ((yiVar.f27753l & 2) == 0) {
                i7 = org.telegram.messenger.g0.L(4.0f);
            }
            if ((yiVar.f27753l & 1) == 0) {
                return org.telegram.messenger.g0.L(4.0f) + i7;
            }
        }
        return i7;
    }

    public static int L1(StaticLayout staticLayout) {
        if (staticLayout.getLineCount() <= 0) {
            return 0;
        }
        return (int) Math.ceil(staticLayout.getLineWidth(0));
    }

    public static String L3(gj gjVar, gj gjVar2, boolean z10, int i7) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        boolean z11 = gjVar.f23865w1;
        int i10 = gjVar.K1;
        int i11 = gjVar.V;
        if (!z11 && !gjVar.r4() && !gj.b4(gjVar.f23817k) && !gj.d5(gjVar.f23817k)) {
            if (!gjVar.f23846r1 || gjVar.f23817k.date != 2147483646) {
                if (i11 != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    long j3 = i11;
                    sb2.append(hd.T(j3));
                    sb2.append(", ");
                    sb2.append(hd.E0().p0().format(j3 * 1000));
                    return sb2.toString();
                } else if (gjVar.f23816j2) {
                    return hd.T(gjVar2.f23817k.date) + ", " + hd.E0().p0().format(gjVar2.f23817k.date * 1000);
                } else if (z10) {
                    if (((org.telegram.messenger.h0) np.s1(i10).f25448y7.U.f14544b).f24006c) {
                        if (i7 == 0 && gjVar.Y2()) {
                            i7 = ConnectionsManager.getInstance(i10).getCurrentTime();
                        }
                        return hd.L(i7);
                    }
                    return hd.M0(2131751210, null) + " " + hd.E0().p0().format(gjVar2.f23817k.date * 1000);
                } else if (gjVar.f23831n2 && (messageFwdHeader = (message = gjVar.f23817k).fwd_from) != null && ((messageFwdHeader.date != 0 || messageFwdHeader.saved_date != 0) && !(gj.n1(message) instanceof TLRPC.TL_messageMediaWidget))) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = gjVar.f23817k.fwd_from;
                    int i12 = messageFwdHeader2.saved_date;
                    if (i12 == 0) {
                        i12 = messageFwdHeader2.date;
                    }
                    return hd.O(i12);
                } else {
                    return hd.E0().p0().format(gjVar2.f23817k.date * 1000);
                }
            }
            return "";
        }
        return "";
    }

    public static SpannableStringBuilder M3(CharSequence charSequence) {
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

    public static boolean N2(String str) {
        if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && !"telegram_bot".equals(str) && !"telegram_user".equals(str) && !"telegram_channel".equals(str) && !"telegram_channel_direct".equals(str) && !"telegram_megagroup".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_aicomposetone".equals(str)) {
            return false;
        }
        return true;
    }

    public static android.graphics.PointF Q1(int r3, int r4, int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.Q1(int, int, int, int):android.graphics.PointF");
    }

    public static boolean U2() {
        return qc.e(2);
    }

    public static StaticLayout V2(CharSequence charSequence, TextPaint textPaint, int i7) {
        SpannableStringBuilder M3 = M3(charSequence);
        if (M3 != null && i7 > 0) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            CharSequence ellipsize = TextUtils.ellipsize(M3, textPaint, i7, truncateAt);
            int L = org.telegram.messenger.g0.L(2.0f) + Math.max(1, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())));
            return ou0.c(ellipsize, textPaint, L, Layout.Alignment.ALIGN_NORMAL, 0.0f, truncateAt, L, 1, true);
        }
        return null;
    }

    public static int[] X1(Spannable spannable, CharacterStyle characterStyle) {
        int i7;
        int i10;
        boolean z10;
        wy0 wy0Var;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof d41) && (wy0Var = ((d41) characterStyle).f33841a) != null && (messageEntity = wy0Var.d) != null) {
            i7 = messageEntity.offset;
            i10 = messageEntity.length + i7;
            z10 = true;
        } else {
            i7 = 0;
            i10 = 0;
            z10 = false;
        }
        if (!z10) {
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
        gj gjVar;
        TLRPC.User user = this.f31030ja;
        if (user != null) {
            return org.telegram.messenger.m5.c(user);
        }
        if (this.f31044ka != null && (gjVar = this.Q5) != null && gj.B0(gjVar.f23817k) != 1271266957 && this.f31044ka.signature_profiles) {
            long o4 = org.telegram.messenger.m5.o(this.Q5.f23817k.from_id);
            int i7 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
            int i10 = this.f30908a6;
            if (i7 >= 0) {
                TLRPC.User a22 = np.s1(i10).a2(Long.valueOf(o4));
                if (a22 != null) {
                    return org.telegram.messenger.m5.c(a22);
                }
            } else {
                TLRPC.Chat M0 = np.s1(i10).M0(Long.valueOf(-o4));
                if (M0 != null) {
                    return org.telegram.messenger.m5.c(M0);
                }
            }
        }
        return 0L;
    }

    private String getAuthorName() {
        TLRPC.User user = this.f31030ja;
        if (user != null) {
            return q10.p(user);
        }
        if (this.f31044ka != null) {
            gj gjVar = this.Q5;
            if (gjVar != null && gj.B0(gjVar.f23817k) != 1271266957 && this.f31044ka.signature_profiles) {
                long o4 = org.telegram.messenger.m5.o(this.Q5.f23817k.from_id);
                int i7 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
                int i10 = this.f30908a6;
                if (i7 >= 0) {
                    TLRPC.User a22 = np.s1(i10).a2(Long.valueOf(o4));
                    if (a22 != null) {
                        return q10.p(a22);
                    }
                } else {
                    TLRPC.Chat M0 = np.s1(i10).M0(Long.valueOf(-o4));
                    if (M0 != null) {
                        return M0.title;
                    }
                }
            }
            return this.f31044ka.title;
        }
        gj gjVar2 = this.Q5;
        if (gjVar2 != null && gjVar2.r4()) {
            return this.Q5.S0;
        }
        return "DELETED";
    }

    private Object getAuthorStatus() {
        gj gjVar;
        TLRPC.User user = this.f31030ja;
        if (user != null) {
            Long h = q10.h(user);
            if (h != null) {
                TLRPC.EmojiStatus emojiStatus = this.f31030ja.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f31108pa = ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug;
                }
                return h;
            } else if (this.f31030ja.premium) {
                return org.telegram.messenger.t0.f26600b.getDrawable(2131232308).mutate();
            } else {
                return null;
            }
        } else if (this.f31044ka != null && (gjVar = this.Q5) != null && gj.B0(gjVar.f23817k) != 1271266957 && this.f31044ka.signature_profiles) {
            long o4 = org.telegram.messenger.m5.o(this.Q5.f23817k.from_id);
            if (o4 >= 0) {
                TLRPC.User a22 = np.s1(this.f30908a6).a2(Long.valueOf(o4));
                if (a22 != null) {
                    TLRPC.EmojiStatus emojiStatus2 = a22.emoji_status;
                    if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                        this.f31108pa = ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).slug;
                    }
                }
                return q10.h(a22);
            }
            TLRPC.Chat M0 = np.s1(this.f30908a6).M0(Long.valueOf(-o4));
            if (M0 != null) {
                TLRPC.EmojiStatus emojiStatus3 = M0.emoji_status;
                if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f31108pa = ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug;
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
        if (u2()) {
            return org.telegram.messenger.g0.L(24.0f);
        }
        if (G3()) {
            f10 = 41.3f;
        } else {
            f10 = 43.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    private int getCompactHeaderColor() {
        return i0.a.k(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Sa, this.Qb), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29169ua, this.Qb));
    }

    private int getCompactInShift() {
        if (u2()) {
            return (org.telegram.messenger.g0.L(16.0f) - org.telegram.messenger.g0.L(20.0f)) - getExtraTextX();
        }
        return 0;
    }

    private int getCompactSideButtonColumn() {
        gj gjVar;
        if (this.f31232yb && this.F8 != 0 && (gjVar = this.Q5) != null && gjVar.T4()) {
            return org.telegram.messenger.g0.L(40.0f);
        }
        return 0;
    }

    private float getCompactSideMenuShift() {
        if (u2()) {
            return org.telegram.messenger.g0.L(71.0f) * this.Z6;
        }
        return 0.0f;
    }

    private int getCompactSideMenuWidth() {
        if (this.Y6) {
            return org.telegram.messenger.g0.L(71.0f);
        }
        return 0;
    }

    private jh.a getDraftMessageMeasureController() {
        l1 l1Var = this.Sa;
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

    private eq getForwardVerifiedSpan() {
        if (this.f31155t1 == null) {
            fq fqVar = new fq(getContext().getResources().getDrawable(2131232792).mutate(), getContext().getResources().getDrawable(2131232793).mutate());
            fqVar.f34678x = true;
            eq eqVar = new eq(0, fqVar);
            this.f31155t1 = eqVar;
            eqVar.d = false;
        }
        fq fqVar2 = (fq) this.f31155t1.f34411c;
        Drawable drawable = fqVar2.f34669a;
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29263z9, this.Qb);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        fqVar2.f34670b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A9, this.Qb), mode));
        this.f31155t1.c((int) (org.telegram.ui.ActionBar.j6.X2.getTextSize() * 0.95f));
        return this.f31155t1;
    }

    private int getGroupPhotosWidth() {
        int parentWidth = getParentWidth();
        gj gjVar = this.Q5;
        if (gjVar != null && gjVar.f23854t1) {
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
        if (w2()) {
            f10 = 21.0f;
        } else {
            f10 = 32.33f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    private int getNameHeight() {
        if (this.f31055l9 && !w2()) {
            if (this.f30911a9 == null) {
                return org.telegram.messenger.g0.L(31.0f);
            }
            return org.telegram.messenger.g0.L(37.66f);
        }
        return (int) (org.telegram.ui.ActionBar.j6.W2.getTextSize() + org.telegram.messenger.g0.L(5.0f));
    }

    private float getNameHeightAnimated() {
        float f10;
        float f11;
        x1 x1Var = this.f31018ib;
        float f12 = 0.0f;
        if (x1Var.Q2) {
            boolean z10 = this.f31055l9;
            f10 = org.telegram.messenger.g0.V1(!z10, z10, x1Var.L1);
        } else if (this.f31055l9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float textSize = org.telegram.ui.ActionBar.j6.W2.getTextSize() + org.telegram.messenger.g0.L(5.0f);
        if (this.f30911a9 == null) {
            f11 = 31.0f;
        } else {
            f11 = 35.0f;
        }
        float L = org.telegram.messenger.g0.L(f11);
        if (!w2()) {
            f12 = f10;
        }
        return org.telegram.messenger.g0.T1(textSize, L, f12);
    }

    private ArrayList<TLRPC.Peer> getRecentRepliers() {
        TLRPC.MessageReplies messageReplies;
        bj bjVar = this.L;
        if (bjVar != null && !bjVar.d.isEmpty() && (messageReplies = ((gj) this.L.d.get(0)).f23817k.replies) != null) {
            return messageReplies.recent_repliers;
        }
        TLRPC.MessageReplies messageReplies2 = this.Q5.f23817k.replies;
        if (messageReplies2 != null) {
            return messageReplies2.recent_repliers;
        }
        return null;
    }

    private int getSelectionOverlayColor() {
        int i7;
        org.telegram.ui.ActionBar.e6 e6Var = this.Qb;
        if (e6Var == null) {
            return 0;
        }
        gj gjVar = this.Q5;
        if (gjVar != null && gjVar.N3()) {
            i7 = org.telegram.ui.ActionBar.j6.Pc;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.f29130sa;
        }
        return e6Var.h(i7);
    }

    private float getUseTranscribeButtonProgress() {
        x1 x1Var = this.f31018ib;
        if (x1Var.f31978o1) {
            if (this.I4) {
                return x1Var.L1;
            }
            return 1.0f - x1Var.L1;
        } else if (this.I4) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public static boolean p2(float f10, float f11, float f12, float f13) {
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

    public static void q0(ImageReceiver imageReceiver) {
        Bitmap n10;
        if (imageReceiver != null && (n10 = imageReceiver.n()) != null) {
            n10.recycle();
            imageReceiver.w0(null);
        }
    }

    public static n1 x0(int i7, String str, int i10, float f10) {
        n1 n1Var = new n1();
        n1Var.f30714a = i7;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, org.telegram.ui.ActionBar.j6.M2, i10, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.M2, org.telegram.messenger.g0.L(2.0f) + i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        n1Var.d = staticLayout;
        n1Var.f30715b = f10;
        if (staticLayout.getLineCount() > 0) {
            n1Var.f30716c = ((float) (n1Var.f30715b - Math.ceil(n1Var.d.getLineWidth(0)))) / 2.0f;
            n1Var.f30716c -= (int) n1Var.d.getLineLeft(0);
        }
        return n1Var;
    }

    @Override
    public final void A(ImageReceiver imageReceiver) {
        gj gjVar = this.Q5;
        if (gjVar != null && imageReceiver == this.U0 && gjVar.J2()) {
            this.Sa.O1(this.Q5);
        }
    }

    public final void A0(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        long[] x10 = fc.D().x(org.telegram.messenger.w7.B(document));
        if (x10 != null) {
            z0(x10[0], x10[1]);
        } else {
            z0(this.Q5.H0, document.size);
        }
    }

    public final void A1(android.graphics.Canvas r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.A1(android.graphics.Canvas, int):void");
    }

    public final boolean A2() {
        if (this.R5 != null) {
            return this.V5;
        }
        return this.H;
    }

    public final void A3(float f10, float f11, boolean z10) {
        float f12;
        boolean z11;
        if (this.h != z10) {
            this.h = z10;
            R();
            if (z10) {
                invalidate();
            }
        }
        fi.u2 u2Var = this.U0;
        float f13 = f10 - u2Var.M0;
        float measuredHeight = f11 - (getMeasuredHeight() - u2Var.A());
        float f14 = u2Var.O0;
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
        this.f31141s = z11;
        u2Var.B1 = z11;
    }

    public final void B() {
        StaticLayout staticLayout;
        if (this.Q5.D == 20 && (staticLayout = this.X9) != null) {
            fi.u2 u2Var = this.U0;
            this.V9 = com.google.android.gms.internal.vision.e2.A(u2Var.N0, staticLayout.getWidth(), 2.0f, this.N6);
            this.W9 = com.google.android.gms.internal.vision.e2.A(u2Var.O0, this.X9.getHeight(), 2.0f, this.P6 + u2Var.M0);
        }
    }

    public final void B0(int i7) {
        int i10;
        int w02;
        ek0 ek0Var;
        ek0 ek0Var2;
        int i11;
        int i12;
        int i13;
        if (this.Q5.G4()) {
            if (this.Q5.P3()) {
                i13 = org.telegram.ui.ActionBar.j6.Ob;
            } else {
                i13 = org.telegram.ui.ActionBar.j6.Bd;
            }
            w02 = org.telegram.ui.ActionBar.j6.w0(i13, this.Qb);
        } else if (i7 == 0 && this.E5) {
            if (this.Q5.P3()) {
                i11 = org.telegram.ui.ActionBar.j6.Ib;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f29056od;
            }
            w02 = org.telegram.ui.ActionBar.j6.w0(i11, this.Qb);
        } else if (i7 == 0 && (ek0Var2 = this.f31092o8) != null) {
            w02 = ek0Var2.i();
        } else if (i7 == 0 && (ek0Var = this.f31120q8) != null) {
            w02 = ek0Var.i();
        } else {
            if (this.Q5.P3()) {
                i10 = org.telegram.ui.ActionBar.j6.Ob;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.Bd;
            }
            w02 = org.telegram.ui.ActionBar.j6.w0(i10, this.Qb);
        }
        Drawable[] drawableArr = this.J2;
        Drawable drawable = drawableArr[i7];
        if (drawable == null) {
            org.telegram.ui.ActionBar.v5 v5Var = new org.telegram.ui.ActionBar.v5(this, i7);
            org.telegram.ui.ActionBar.v5[] v5VarArr = this.K2;
            v5VarArr[i7] = v5Var;
            int[][] iArr = {StateSet.WILD_CARD};
            if (this.Q5.P3()) {
                i12 = org.telegram.ui.ActionBar.j6.Ob;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.Bd;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{436207615 & org.telegram.ui.ActionBar.j6.w0(i12, this.Qb)}), null, v5VarArr[i7]);
            drawableArr[i7] = rippleDrawable;
            rippleDrawable.setCallback(this);
        } else {
            org.telegram.ui.ActionBar.j6.H1(drawable, w02 & 436207615, true);
        }
        drawableArr[i7].setVisible(true, false);
    }

    public final void B1(Canvas canvas, float f10, float f11, float f12, float f13, boolean z10) {
        boolean z11;
        float f14;
        float f15;
        double d;
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable Z1;
        float f16;
        float f17;
        float f18;
        boolean z15;
        boolean z16;
        String str;
        Drawable Z12;
        float r10;
        float f19;
        String str2;
        Drawable Z13;
        if (f13 != 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f20 = (f13 * 0.5f) + 0.5f;
        float f21 = f10 * f13;
        this.O.getClass();
        int alpha = org.telegram.ui.ActionBar.j6.T2.getAlpha();
        float b22 = b2(f11);
        StaticLayout staticLayout = this.f30991ga;
        x1 x1Var = this.f31018ib;
        float f22 = 0.0f;
        if (staticLayout == null && !x1Var.G) {
            f15 = 10.0f;
            d = 1.0d;
        } else {
            boolean z17 = x1Var.f31953i1;
            if (z17) {
                f14 = this.C9;
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
            if ((!this.f31232yb || !x1Var.f31970m1) && z17 && !z12) {
                if (z13) {
                    f23 = x1Var.J;
                } else {
                    float f24 = x1Var.J;
                    float f25 = x1Var.L1;
                    f23 = (f23 * f25) + ((1.0f - f25) * f24);
                }
            }
            bj bjVar = this.L;
            if (bjVar != null) {
                aj ajVar = bjVar.f22717m;
                if (ajVar.f22523j) {
                    f23 += ajVar.f22521g;
                }
            }
            if (x1Var.f32012x0) {
                f23 += this.f31046kd;
            }
            if (G3()) {
                if (this.Q5.P5()) {
                    Z1 = Z1("drawableMsgStickerReplies");
                } else {
                    Z1 = org.telegram.ui.ActionBar.j6.f28810b4;
                }
            } else if (!this.Q5.P3()) {
                if (z10) {
                    Z1 = org.telegram.ui.ActionBar.j6.R3;
                } else {
                    Z1 = org.telegram.ui.ActionBar.j6.Q3;
                }
            } else {
                Z1 = Z1("drawableMsgOutReplies");
            }
            float r11 = z.r(Z1, f23, b22, org.telegram.ui.ActionBar.j6.T2.getTextSize());
            if (z12) {
                f16 = x1Var.L1 * f21;
            } else if (z13) {
                f16 = (1.0f - x1Var.L1) * f21;
            } else {
                f16 = f21;
            }
            Z1.setAlpha((int) (f16 * 255.0f));
            if (z11) {
                canvas.save();
                canvas.scale(f20, f20, org.telegram.messenger.k5.a(org.telegram.messenger.g0.L(3.0f) + r11, this.f31004ha, 2.0f, f23), Z1.getBounds().centerY());
            }
            Z1.draw(canvas);
            Z1.setAlpha(255);
            if (x1Var.G) {
                if (z14) {
                    canvas.save();
                    f17 = r11;
                    org.telegram.ui.ActionBar.j6.T2.setAlpha((int) ((1.0d - x1Var.L1) * alpha));
                    canvas.translate(f23 + f17 + org.telegram.messenger.g0.L(3.0f), b22);
                    x1Var.I.draw(canvas);
                    canvas.restore();
                } else {
                    f17 = r11;
                }
                org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (alpha * f16));
            } else {
                f17 = r11;
            }
            canvas.save();
            canvas.translate(f23 + f17 + org.telegram.messenger.g0.L(3.0f), b22);
            StaticLayout staticLayout2 = this.f30991ga;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                StaticLayout staticLayout3 = x1Var.I;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
            }
            canvas.restore();
            if (this.f30991ga != null) {
                f22 = f17 + this.f31004ha + org.telegram.messenger.g0.L(10.0f) + 0.0f;
            }
            if (z11) {
                canvas.restore();
            }
            if (x1Var.G) {
                org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha);
            }
            x1Var.K = f23;
        }
        if (this.f30952da != null) {
            boolean z19 = x1Var.f31953i1;
            if (z19) {
                f19 = this.C9;
            } else {
                f19 = f12;
            }
            float f26 = f19 + f22;
            if ((!this.f31232yb || !x1Var.f31970m1) && z19) {
                float f27 = x1Var.L;
                float f28 = x1Var.L1;
                f26 = (f26 * f28) + ((1.0f - f28) * f27);
            }
            bj bjVar2 = this.L;
            if (bjVar2 != null) {
                aj ajVar2 = bjVar2.f22717m;
                if (ajVar2.f22523j) {
                    f26 += ajVar2.f22521g;
                }
            }
            if (x1Var.f32012x0) {
                f26 += this.f31046kd;
            }
            if (G3()) {
                if (this.Q5.P5()) {
                    Z13 = Z1("drawableMsgStickerViews");
                } else {
                    Z13 = org.telegram.ui.ActionBar.j6.f28789a4;
                }
            } else if (!this.Q5.P3()) {
                if (z10) {
                    Z13 = org.telegram.ui.ActionBar.j6.N3;
                } else {
                    Z13 = org.telegram.ui.ActionBar.j6.M3;
                }
            } else {
                if (z10) {
                    str2 = "drawableMsgOutViewsSelected";
                } else {
                    str2 = "drawableMsgOutViews";
                }
                Z13 = Z1(str2);
            }
            float r12 = z.r(Z13, f26, org.telegram.messenger.g0.L(1.5f) + b22, org.telegram.ui.ActionBar.j6.T2.getTextSize() - org.telegram.messenger.g0.L(2.0f));
            if (z11) {
                canvas.save();
                canvas.scale(f20, f20, (((org.telegram.messenger.g0.L(3.0f) + Z13.getIntrinsicWidth()) + this.f30965ea) / 2.0f) + f26, Z13.getBounds().centerY());
            }
            Z13.setAlpha((int) (f21 * 255.0f));
            Z13.draw(canvas);
            Z13.setAlpha(255);
            if (x1Var.f31935e2 != null) {
                canvas.save();
                org.telegram.ui.ActionBar.j6.T2.setAlpha((int) ((d - x1Var.L1) * alpha));
                canvas.translate(f26 + r12 + org.telegram.messenger.g0.L(3.0f), b22);
                xh.f.f(canvas, x1Var.f31935e2);
                canvas.restore();
                org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (alpha * x1Var.L1));
            }
            canvas.save();
            canvas.translate(f26 + r12 + org.telegram.messenger.g0.L(3.0f), b22);
            xh.f.f(canvas, this.f30952da);
            canvas.restore();
            if (z11) {
                canvas.restore();
            }
            f22 = this.f30965ea + r12 + org.telegram.messenger.g0.L(f15) + f22;
            if (x1Var.f31935e2 != null) {
                org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha);
            }
            x1Var.M = f26;
        }
        boolean z20 = this.f31118q6;
        if (!z20 && !x1Var.C) {
            return;
        }
        boolean z21 = x1Var.f31953i1;
        if (z21) {
            f18 = this.C9;
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
        if (!this.f31232yb && z21 && !z15) {
            if (z16) {
                f29 = x1Var.E;
            } else {
                float f30 = x1Var.E;
                float f31 = x1Var.L1;
                f29 = (f29 * f31) + ((1.0f - f31) * f30);
            }
        }
        bj bjVar3 = this.L;
        if (bjVar3 != null) {
            aj ajVar3 = bjVar3.f22717m;
            if (ajVar3.f22523j) {
                f29 += ajVar3.f22521g;
            }
        }
        if (x1Var.f32012x0) {
            f29 += this.f31046kd;
        }
        if (G3()) {
            if (this.Q5.P5()) {
                Z12 = Z1("drawableMsgStickerPinned");
            } else {
                Z12 = org.telegram.ui.ActionBar.j6.Z3;
            }
        } else if (!this.Q5.P3()) {
            if (z10) {
                Z12 = org.telegram.ui.ActionBar.j6.V3;
            } else {
                Z12 = org.telegram.ui.ActionBar.j6.U3;
            }
        } else {
            if (z10) {
                str = "drawableMsgOutPinnedSelected";
            } else {
                str = "drawableMsgOutPinned";
            }
            Z12 = Z1(str);
        }
        if (x1Var.C) {
            if (this.f31118q6) {
                Z12.setAlpha((int) (f21 * 255.0f * x1Var.L1));
                r10 = z.r(Z12, f29, b22, org.telegram.ui.ActionBar.j6.T2.getTextSize() + org.telegram.messenger.g0.L(1.0f));
            } else {
                Z12.setAlpha((int) ((1.0f - x1Var.L1) * f21 * 255.0f));
                r10 = z.r(Z12, f29, b22, org.telegram.ui.ActionBar.j6.T2.getTextSize() + org.telegram.messenger.g0.L(1.0f));
            }
        } else {
            Z12.setAlpha((int) (f21 * 255.0f));
            r10 = z.r(Z12, f29, b22, org.telegram.ui.ActionBar.j6.T2.getTextSize() + org.telegram.messenger.g0.L(1.0f));
        }
        if (z11) {
            canvas.save();
            canvas.scale(f20, f20, (r10 / 2.0f) + f29, Z12.getBounds().centerY());
        }
        Z12.draw(canvas);
        Z12.setAlpha(255);
        if (z11) {
            canvas.restore();
        }
        x1Var.D = f29;
    }

    public final boolean B2() {
        TLRPC.Chat chat = this.f31177ua;
        if (chat != null) {
            return chat.verified;
        }
        TLRPC.User user = this.f31150sa;
        if (user != null && user.verified) {
            return true;
        }
        return false;
    }

    public final void B3(int i7, int i10, int i11, float f10, float f11, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        iv ivVar;
        x1 x1Var;
        dj djVar;
        gj gjVar;
        this.f31124qc = i7;
        this.f31152sc = i10;
        this.f31165tc = i11;
        this.L0 = i12;
        this.M0 = i13;
        this.f31193vc = f11;
        this.f31179uc = f10;
        this.f30940cb = i13;
        this.f30953db = i14;
        this.eb = i15;
        this.f31139rc = i16;
        if ((!this.I5.isEmpty() || (this.f31195w != null && (gjVar = this.Q5) != null && gjVar.D == 27)) && this.f30927bb != f11) {
            invalidate();
        }
        this.f30927bb = f11;
        if (i11 != this.M0 || f10 != this.N0) {
            this.N0 = f10;
            this.M0 = i11;
        }
        if (this.Q5 != null && h2() && this.Q5.P5()) {
            invalidate();
        }
        gj gjVar2 = this.Q5;
        if (gjVar2 != null && gjVar2.B2 != null) {
            int i19 = i7 - this.f31167u0;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                int size = this.Q5.B2.size();
                x1Var = this.f31018ib;
                if (i20 >= size || ((dj) this.Q5.B2.get(i20)).p(this.Q5.B2, x1Var) > i19) {
                    break;
                }
                i21 = i20;
                i20++;
            }
            int i22 = 0;
            int i23 = -1;
            int i24 = -1;
            while (i21 < this.Q5.B2.size()) {
                float p10 = ((dj) this.Q5.B2.get(i21)).p(this.Q5.B2, x1Var);
                float j3 = djVar.f23094f + p10 + djVar.j(x1Var) + djVar.h;
                float f12 = i19;
                if (p2(p10, j3, f12, i19 + i10)) {
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
                if (this.Aa != null) {
                    int i25 = 0;
                    while (true) {
                        if (i25 >= this.Aa.f36726a.size()) {
                            break;
                        }
                        org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) this.Aa.f36726a.get(i25);
                        if (k5Var != null && k5Var.f36284n) {
                            float y10 = (0.0f - getY()) - k5Var.f36285r;
                            float y11 = (this.f31071n - getY()) - k5Var.f36285r;
                            Rect rect = k5Var.f36282e;
                            if (rect.bottom >= y10 && rect.top <= y11) {
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
        gj gjVar3 = this.Q5;
        if (gjVar3 != null && (ivVar = gjVar3.f23874y2) != null) {
            ArrayList arrayList = ivVar.f24445g;
            int i26 = i7 - this.f31167u0;
            int i27 = -1;
            int i28 = -1;
            for (int i29 = 0; i29 < arrayList.size(); i29++) {
                cu cuVar = (cu) arrayList.get(i29);
                if (cuVar.R || cuVar.S) {
                    float f13 = cuVar.N;
                    float f14 = i26 + i10;
                    if (p2(f13, cuVar.I() + f13, i26, f14)) {
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
        ArrayList arrayList2 = this.Q4;
        if (!arrayList2.isEmpty()) {
            int i30 = -1;
            int i31 = -1;
            for (int i32 = 0; i32 < arrayList2.size(); i32++) {
                p1 p1Var = (p1) arrayList2.get(i32);
                int i33 = p1Var.f30839b + this.Ua;
                if (p2(i33, i33 + p1Var.f30840c, this.f31124qc, i18 + this.f31152sc)) {
                    if (i31 == -1) {
                        i31 = i32;
                    }
                    i30 = i32;
                }
            }
            if (this.T4 != i30 || this.S4 != i31) {
                this.T4 = i30;
                this.S4 = i31;
                invalidate();
            }
        }
        if (this.J8) {
            if (Math.abs(this.U8 - Math.max(Math.min(org.telegram.messenger.g0.L(4.0f) + (-this.f31139rc), this.S8 - org.telegram.messenger.g0.L(42.0f)), org.telegram.messenger.g0.L(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        ch.q0 q0Var = this.O;
        int i34 = q0Var.f5193c;
        boolean p22 = p2(i34, i34 + q0Var.f5201m, this.f31124qc, i17 + this.f31152sc);
        if (this.V4 != p22) {
            this.V4 = p22;
            invalidate();
        }
    }

    @Override
    public final void C(boolean z10) {
        boolean z11;
        int i7 = this.M1;
        if (i7 != 3 && i7 != 5) {
            z11 = false;
        } else {
            z11 = true;
        }
        P3(true, z11, false);
    }

    public final void C0(int i7, int i10, boolean z10) {
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
        if ((i7 & 1) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if ((i7 & 2) != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if ((i7 & 4) == 0 && z14 && z12 && !z13 && z11) {
            z15 = true;
        }
        if (this.f31018ib.f31951i && !z15) {
            return;
        }
        this.f31151sb = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f31178ub = ofFloat;
        if (z15) {
            ofFloat.setDuration(220L);
        } else {
            ofFloat.setDuration(150L);
        }
        this.f31178ub.setInterpolator(er.f34420f);
        this.f31138rb = i7;
        this.f31123qb = i10;
        this.f31178ub.addUpdateListener(new ch.u(3, this, z10));
        this.f31178ub.addListener(new bi.v4(22, this, z10));
        this.f31164tb = true;
        this.f31178ub.start();
    }

    public final void C1(Canvas canvas, float f10, Runnable runnable) {
        org.telegram.ui.ActionBar.r4 r4Var;
        float f11;
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        Canvas canvas2 = canvas;
        gj gjVar = this.Q5;
        if (gjVar != null && gjVar.S4()) {
            RadialProgress2 radialProgress2 = this.Q0;
            RectF rectF = radialProgress2.f32655a;
            Paint paint = radialProgress2.f32660g;
            s80 s80Var = radialProgress2.f32661i;
            RectF rectF2 = radialProgress2.f32655a;
            float cos = (((float) Math.cos((org.telegram.messenger.g0.W1(f10, 190, 45) / 180.0f) * 3.141592653589793d)) * org.telegram.messenger.g0.L(22.6274f)) + rectF.centerX();
            float sin = (((float) Math.sin((org.telegram.messenger.g0.W1(f10, 190, 45) / 180.0f) * 3.141592653589793d)) * org.telegram.messenger.g0.L(22.6274f)) + rectF2.centerY();
            RectF rectF3 = org.telegram.messenger.g0.P;
            rectF3.set(rectF2);
            rectF3.inset(-org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f));
            canvas2.saveLayerAlpha(rectF3, 255, 31);
            if (y2()) {
                r4Var = this.M6;
            } else {
                r4Var = this.L6;
            }
            s80Var.B = r4Var;
            radialProgress2.f32662j.B = r4Var;
            radialProgress2.I = f10;
            runnable.run();
            if (this.f30903a1 == null) {
                Paint paint2 = new Paint(1);
                this.f30903a1 = paint2;
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
                if (this.f30917b1 == null) {
                    ch0 ch0Var = new ch0(2131624022, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), true, null);
                    this.f30917b1 = ch0Var;
                    ch0Var.R(this);
                    this.f30917b1.J(true);
                    this.f30917b1.K(1);
                    this.f30917b1.start();
                }
                this.f30917b1.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (this.f30930c1 == null) {
                    i7 = 1;
                    this.f30930c1 = new Paint(1);
                } else {
                    i7 = 1;
                }
                if (this.f30944d1 == null) {
                    Paint paint3 = new Paint(i7);
                    this.f30944d1 = paint3;
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                if (this.f30956e1 == null) {
                    Paint paint4 = new Paint(i7);
                    this.f30956e1 = paint4;
                    paint4.setStyle(Paint.Style.STROKE);
                }
                int i11 = radialProgress2.f32673u;
                if (i11 >= 0) {
                    i10 = org.telegram.ui.ActionBar.j6.w0(i11, this.Qb);
                } else {
                    i10 = radialProgress2.f32666n;
                }
                this.f30930c1.setColor(i10);
                this.f30956e1.setColor(i10);
                s80Var.a(false);
                this.f30930c1.setShader(s80Var.d.getShader());
                this.f30956e1.setShader(s80Var.d.getShader());
                rectF3.set(this.f30917b1.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                float f14 = f11;
                rectF3.inset(f14, f14);
                canvas2.drawRect(rectF3, this.f30930c1);
                this.f30917b1.q(canvas, this.f30944d1, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.f30956e1.setAlpha((int) (255.0f * f12));
                this.f30956e1.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
                RectF rectF4 = this.f30933c4;
                rectF4.set(rectF2);
                rectF4.inset(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
                tm0 tm0Var = this.E4;
                canvas.drawArc(rectF4, -90.0f, (1.0f - tm0Var.K) * (-360.0f), false, this.f30956e1);
                if (this.f31064m5 == null) {
                    this.f31064m5 = new e01();
                }
                this.f31064m5.a((1.0f - tm0Var.K) * (-360.0f), f12, canvas, this.f30956e1, rectF4);
                canvas2 = canvas;
            } else {
                ch0 ch0Var2 = this.f30917b1;
                if (ch0Var2 != null) {
                    ch0Var2.C(true);
                    this.f30917b1 = null;
                    if (this.f31064m5 != null) {
                        this.f31064m5 = null;
                    }
                }
            }
            canvas2.drawCircle(cos, sin, org.telegram.messenger.g0.L((f10 * 1.5f) + 10.0f) * f10, this.f30903a1);
            canvas2.restore();
            if (this.Z0 == null) {
                hi.l lVar = new hi.l(3);
                this.Z0 = lVar;
                z10 = false;
                lVar.e(-1, 0, 0);
                hi.l lVar2 = this.Z0;
                lVar2.f14536i = 14.0f;
                lVar2.c(10.0f);
                this.Z0.f14530a.setStrokeWidth(org.telegram.messenger.g0.N(1.5f));
                z11 = true;
                this.Z0.d(1, false, false);
                this.Z0.f14537j = -org.telegram.messenger.g0.N(0.33f);
                this.Z0.f14538k = org.telegram.messenger.g0.N(0.33f);
            } else {
                z10 = false;
                z11 = true;
            }
            hi.l lVar3 = this.Z0;
            lVar3.f14536i = f10 * 14.0f;
            lVar3.c(f10 * 10.0f);
            canvas2.saveLayerAlpha(cos - org.telegram.messenger.g0.L(10.0f), sin - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f) + cos, org.telegram.messenger.g0.L(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, org.telegram.messenger.g0.L(10.0f) * f10, paint);
            hi.l lVar4 = this.Z0;
            if (org.telegram.messenger.g0.B(paint.getColor()) <= 0.8f) {
                z11 = z10;
            }
            lVar4.b(z11);
            hi.l lVar5 = this.Z0;
            lVar5.f14541n = cos;
            lVar5.f14542o = sin;
            lVar5.a(canvas2, f10);
            canvas2.restore();
            return;
        }
        runnable.run();
    }

    public final boolean C2(float f10) {
        if (this.L6 != null) {
            int i7 = this.N6;
            if (f10 >= i7 && f10 <= i7 + this.O6) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C3(int r21, org.telegram.messenger.gj r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.C3(int, org.telegram.messenger.gj):void");
    }

    public final int D() {
        if (this.f31197w1) {
            return 4;
        }
        return 8;
    }

    public final void D0() {
        gj gjVar;
        l1 l1Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.Q5.t2() && !this.Q5.m5()) {
            gj gjVar2 = this.Q5;
            if (!gjVar2.O0) {
                if (this.Sa != null && gjVar2.p4()) {
                    this.Sa.B(this);
                    return;
                } else {
                    J3(this.f30996h1, this.f31009i1);
                    return;
                }
            }
        }
        gj gjVar3 = this.Q5;
        int i7 = gjVar3.D;
        int i10 = 0;
        if (i7 == 20) {
            TLRPC.Message message = gjVar3.f23817k;
            if (message != null && (messageMedia = message.media) != null && !messageMedia.extended_media.isEmpty()) {
                TLRPC.ReplyMarkup replyMarkup = this.Q5.f23817k.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList.get(i10);
                        i10++;
                        Iterator<TL_keyboard.KeyboardInlineButton> it = keyboardInlineButtonRow.buttons.iterator();
                        if (it.hasNext()) {
                            this.Sa.O0(this, it.next());
                            return;
                        }
                    }
                }
            }
        } else if (i7 != 1 && !gjVar3.M2()) {
            gj gjVar4 = this.Q5;
            int i11 = gjVar4.D;
            if (i11 == 12) {
                long j3 = gj.n1(gjVar4.f23817k).user_id;
                if (j3 != 0) {
                    user = np.s1(this.f30908a6).a2(Long.valueOf(j3));
                } else {
                    user = null;
                }
                this.Sa.u0(this, user, this.f30996h1, this.f31009i1);
            } else if (i11 == 5) {
                if (this.O3 != -1) {
                    E0(false);
                } else if (MediaController.B().I(this.Q5) && !MediaController.B().H()) {
                    MediaController.B().R(this.Q5, true);
                } else {
                    this.Sa.T1(this, this.Q5);
                }
            } else if (i11 == 8) {
                int i12 = this.O3;
                if (i12 != -1 && (i12 != 1 || !this.C1 || !this.H5)) {
                    if (i12 == 2 || i12 == 0) {
                        E0(false);
                        return;
                    }
                    return;
                }
                this.Sa.w0(this, this.f30996h1, this.f31009i1, false);
            } else if (this.M1 != 4 && !gjVar4.D2(true)) {
                gj gjVar5 = this.Q5;
                int i13 = gjVar5.D;
                if (i13 != 4 && i13 != 17 && i13 != 23 && i13 != 24) {
                    int i14 = this.M1;
                    if (i14 == 1) {
                        if (this.O3 == -1) {
                            this.Sa.w0(this, this.f30996h1, this.f31009i1, false);
                            return;
                        }
                        return;
                    } else if (gjVar5.f23773a1 != null) {
                        l1 l1Var2 = this.Sa;
                        if (l1Var2 != null) {
                            l1Var2.w0(this, this.f30996h1, this.f31009i1, false);
                            return;
                        }
                        return;
                    } else if (i14 == 2) {
                        if (this.O3 == -1 && (webPage = gj.n1(gjVar5.f23817k).webpage) != null) {
                            String str = webPage.embed_url;
                            if (str != null && str.length() != 0) {
                                this.Sa.S1(this.Q5, webPage.embed_url, webPage.site_name, webPage.description, webPage.url, webPage.embed_width, webPage.embed_height);
                                return;
                            } else {
                                vf.c.t(getContext(), webPage.url);
                                return;
                            }
                        }
                        return;
                    } else if (this.U1) {
                        if (this.O3 == -1) {
                            this.Sa.w0(this, this.f30996h1, this.f31009i1, false);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 26 && (l1Var = this.Sa) != null) {
                        if (i13 == 16) {
                            l1Var.q0(this, 0.0f, 0.0f);
                            return;
                        } else {
                            l1Var.C0(this, this.S3, this.T3);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.Sa.w0(this, this.f30996h1, this.f31009i1, false);
            } else if (this.O3 != -1 && (!this.f31235z1 || (!this.H5 && (((gjVar = this.Q5) == null || !gjVar.D2(true)) && (!gz.B0 || !this.C1))))) {
                if (this.f31235z1) {
                    E0(true);
                    return;
                }
                int i15 = this.O3;
                if (i15 == 0 || i15 == 3) {
                    E0(false);
                }
            } else {
                this.Sa.w0(this, this.f30996h1, this.f31009i1, false);
            }
        } else {
            int i16 = this.O3;
            if (i16 == -1) {
                this.Sa.w0(this, this.f30996h1, this.f31009i1, false);
            } else if (i16 == 0) {
                E0(false);
            }
        }
    }

    public final c1 D1() {
        if (this.K4 == null) {
            this.K4 = new c1(this);
        }
        return this.K4;
    }

    public final void D3() {
        int i7;
        int i10;
        int i11;
        int i12;
        if (this.Q5.P3()) {
            TextPaint textPaint = org.telegram.ui.ActionBar.j6.f29046o2;
            int i13 = org.telegram.ui.ActionBar.j6.Wc;
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(i13, this.Qb));
            org.telegram.ui.ActionBar.j6.f29218x2.setColor(org.telegram.ui.ActionBar.j6.w0(i13, this.Qb));
            org.telegram.ui.ActionBar.j6.f29065p2.setColor(org.telegram.ui.ActionBar.j6.w0(i13, this.Qb));
            org.telegram.ui.ActionBar.j6.f29085q2.setColor(org.telegram.ui.ActionBar.j6.w0(i13, this.Qb));
            org.telegram.ui.ActionBar.j6.f29104r2.setColor(org.telegram.ui.ActionBar.j6.w0(i13, this.Qb));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.f29218x2;
            TextPaint textPaint3 = org.telegram.ui.ActionBar.j6.Z2;
            TextPaint textPaint4 = org.telegram.ui.ActionBar.j6.f28788a3;
            TextPaint textPaint5 = org.telegram.ui.ActionBar.j6.f29046o2;
            TextPaint textPaint6 = org.telegram.ui.ActionBar.j6.f29065p2;
            TextPaint textPaint7 = org.telegram.ui.ActionBar.j6.f29085q2;
            TextPaint textPaint8 = org.telegram.ui.ActionBar.j6.f29104r2;
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Yc, this.Qb);
            textPaint8.linkColor = w02;
            textPaint7.linkColor = w02;
            textPaint6.linkColor = w02;
            textPaint5.linkColor = w02;
            textPaint4.linkColor = w02;
            textPaint3.linkColor = w02;
            textPaint2.linkColor = w02;
        } else {
            TextPaint textPaint9 = org.telegram.ui.ActionBar.j6.f29046o2;
            int i14 = org.telegram.ui.ActionBar.j6.Vc;
            textPaint9.setColor(org.telegram.ui.ActionBar.j6.w0(i14, this.Qb));
            org.telegram.ui.ActionBar.j6.f29218x2.setColor(org.telegram.ui.ActionBar.j6.w0(i14, this.Qb));
            org.telegram.ui.ActionBar.j6.f29065p2.setColor(org.telegram.ui.ActionBar.j6.w0(i14, this.Qb));
            org.telegram.ui.ActionBar.j6.f29085q2.setColor(org.telegram.ui.ActionBar.j6.w0(i14, this.Qb));
            org.telegram.ui.ActionBar.j6.f29104r2.setColor(org.telegram.ui.ActionBar.j6.w0(i14, this.Qb));
            TextPaint textPaint10 = org.telegram.ui.ActionBar.j6.f29218x2;
            TextPaint textPaint11 = org.telegram.ui.ActionBar.j6.Z2;
            TextPaint textPaint12 = org.telegram.ui.ActionBar.j6.f28788a3;
            TextPaint textPaint13 = org.telegram.ui.ActionBar.j6.f29046o2;
            TextPaint textPaint14 = org.telegram.ui.ActionBar.j6.f29065p2;
            TextPaint textPaint15 = org.telegram.ui.ActionBar.j6.f29085q2;
            TextPaint textPaint16 = org.telegram.ui.ActionBar.j6.f29104r2;
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Xc, this.Qb);
            textPaint16.linkColor = w03;
            textPaint15.linkColor = w03;
            textPaint14.linkColor = w03;
            textPaint13.linkColor = w03;
            textPaint12.linkColor = w03;
            textPaint11.linkColor = w03;
            textPaint10.linkColor = w03;
        }
        if (this.N1 != null) {
            int i15 = this.M1;
            i1 i1Var = this.D4;
            if (i15 != 3 && i15 != 7) {
                if (i15 == 5) {
                    if (this.Q5.P3()) {
                        int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29037nc, this.Qb);
                        int w05 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29055oc, this.Qb);
                        int i16 = org.telegram.ui.ActionBar.j6.f29095qc;
                        i1Var.g(w04, w05, org.telegram.ui.ActionBar.j6.w0(i16, this.Qb), org.telegram.ui.ActionBar.j6.w0(i16, this.Qb), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29075pc, this.Qb));
                    } else if (this.R1 && this.f31092o8 != null) {
                        int c10 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.le, this.Qb), this.f31092o8.i());
                        int c11 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29020me, this.Qb), this.f31092o8.i());
                        int i17 = org.telegram.ui.ActionBar.j6.f29057oe;
                        i1Var.g(c10, c11, org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.w0(i17, this.Qb), this.f31092o8.i()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.w0(i17, this.Qb), this.f31092o8.i()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.ne, this.Qb), this.f31092o8.i()));
                    } else {
                        int w06 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.le, this.Qb);
                        int w07 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29020me, this.Qb);
                        int i18 = org.telegram.ui.ActionBar.j6.f29057oe;
                        i1Var.g(w06, w07, org.telegram.ui.ActionBar.j6.w0(i18, this.Qb), org.telegram.ui.ActionBar.j6.w0(i18, this.Qb), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.ne, this.Qb));
                    }
                }
            } else {
                boolean P3 = this.Q5.P3();
                tm0 tm0Var = this.E4;
                if (P3) {
                    int w08 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29114rc, this.Qb);
                    int w09 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29151tc, this.Qb);
                    int w010 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29132sc, this.Qb);
                    tm0Var.f39738p = w08;
                    tm0Var.f39739q = w09;
                    tm0Var.f39740r = w010;
                    int w011 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29037nc, this.Qb);
                    int w012 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29055oc, this.Qb);
                    int i19 = org.telegram.ui.ActionBar.j6.f29095qc;
                    i1Var.g(w011, w012, org.telegram.ui.ActionBar.j6.w0(i19, this.Qb), org.telegram.ui.ActionBar.j6.w0(i19, this.Qb), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29075pc, this.Qb));
                } else if (this.R1 && this.f31092o8 != null) {
                    int c12 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29077pe, this.Qb), this.f31092o8.i());
                    int c13 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29116re, this.Qb), this.f31092o8.i());
                    int c14 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29097qe, this.Qb), this.f31092o8.i());
                    tm0Var.f39738p = c12;
                    tm0Var.f39739q = c13;
                    tm0Var.f39740r = c14;
                    int c15 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.le, this.Qb), this.f31092o8.i());
                    int c16 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29020me, this.Qb), this.f31092o8.i());
                    int i20 = org.telegram.ui.ActionBar.j6.f29057oe;
                    i1Var.g(c15, c16, org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.w0(i20, this.Qb), this.f31092o8.i()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.w0(i20, this.Qb), this.f31092o8.i()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.ne, this.Qb), this.f31092o8.i()));
                } else {
                    int w013 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29077pe, this.Qb);
                    int w014 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29116re, this.Qb);
                    int w015 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29097qe, this.Qb);
                    tm0Var.f39738p = w013;
                    tm0Var.f39739q = w014;
                    tm0Var.f39740r = w015;
                    int w016 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.le, this.Qb);
                    int w017 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29020me, this.Qb);
                    int i21 = org.telegram.ui.ActionBar.j6.f29057oe;
                    i1Var.g(w016, w017, org.telegram.ui.ActionBar.j6.w0(i21, this.Qb), org.telegram.ui.ActionBar.j6.w0(i21, this.Qb), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.ne, this.Qb));
                }
            }
        }
        gj gjVar = this.Q5;
        if (gjVar.D == 5) {
            TextPaint textPaint17 = org.telegram.ui.ActionBar.j6.T2;
            if (u2()) {
                if (this.Q5.P3()) {
                    i11 = org.telegram.ui.ActionBar.j6.f28964jc;
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.f28875ee;
                }
            } else {
                i11 = org.telegram.ui.ActionBar.j6.Zc;
            }
            int w018 = org.telegram.ui.ActionBar.j6.w0(i11, this.Qb);
            if (y2()) {
                if (this.Q5.P3()) {
                    i12 = org.telegram.ui.ActionBar.j6.f28873ec;
                } else {
                    i12 = org.telegram.ui.ActionBar.j6.fe;
                }
            } else if (this.Q5.P3()) {
                i12 = org.telegram.ui.ActionBar.j6.f28964jc;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.f28875ee;
            }
            textPaint17.setColor(i0.a.f(getVideoTranscriptionProgress(), w018, org.telegram.ui.ActionBar.j6.w0(i12, this.Qb)));
        } else if (this.C6) {
            if (gjVar.P5()) {
                org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Zc, this.Qb));
            } else {
                org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28819be, this.Qb));
            }
        } else if (gjVar.P3()) {
            TextPaint textPaint18 = org.telegram.ui.ActionBar.j6.T2;
            if (y2()) {
                i10 = org.telegram.ui.ActionBar.j6.f28873ec;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f28964jc;
            }
            textPaint18.setColor(org.telegram.ui.ActionBar.j6.w0(i10, this.Qb));
        } else {
            TextPaint textPaint19 = org.telegram.ui.ActionBar.j6.T2;
            if (y2()) {
                i7 = org.telegram.ui.ActionBar.j6.fe;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.f28875ee;
            }
            textPaint19.setColor(org.telegram.ui.ActionBar.j6.w0(i7, this.Qb));
        }
    }

    public final void E0(boolean z10) {
        float f10;
        gj gjVar;
        gj gjVar2;
        TLRPC.PhotoSize photoSize;
        String str;
        int i7;
        RadialProgress2 radialProgress2;
        int i10;
        gj gjVar3;
        if (this.Sa != null && this.Q5.p4() && this.Q5.t2() && !this.Q5.m5() && !this.Q5.O0) {
            this.Sa.B(this);
            return;
        }
        gj gjVar4 = this.Q5;
        if (gjVar4 != null && !gjVar4.M2()) {
            this.Q5.P = true;
        }
        int i11 = this.O3;
        RadialProgress2 radialProgress22 = this.R0;
        int i12 = this.f30908a6;
        fi.u2 u2Var = this.U0;
        RadialProgress2 radialProgress23 = this.Q0;
        if (i11 == 0 && (!this.f31235z1 || z10)) {
            int i13 = this.M1;
            if (i13 != 3 && i13 != 5 && (i13 != 7 || (gjVar3 = this.Q5) == null || !gjVar3.T4() || !this.Q5.f23876z0)) {
                if (z10) {
                    radialProgress22.p(false, 0.0f);
                } else {
                    radialProgress23.p(false, 0.0f);
                }
                if (this.f30959e4 != null && (u2Var.L() || this.f30973f4 == null)) {
                    photoSize = this.f30959e4;
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !"s".equals(photoSize.type)) {
                        str = this.f30999h4;
                    } else {
                        str = this.f31012i4;
                    }
                } else {
                    photoSize = this.f30973f4;
                    str = this.f31012i4;
                }
                if (gj.R5(this.Q5.f23817k)) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                gj gjVar5 = this.Q5;
                int i14 = gjVar5.D;
                if (i14 == 1 || i14 == 20) {
                    int i15 = i7;
                    radialProgress2 = radialProgress23;
                    u2Var.f22293r = true;
                    u2Var.r0(gc.f(this.f30959e4, this.f30946d4), this.f30999h4, gc.f(this.f30973f4, this.f30946d4), this.f31012i4, this.f30985g4, this.f30959e4.size, null, this.Q5, i15);
                } else if (i14 == 8) {
                    org.telegram.messenger.w7.G(i12).W(this.N1, this.Q5, 2, 0);
                    if (this.Q5.H0 > 0) {
                        A0(this.N1);
                    }
                    radialProgress2 = radialProgress23;
                } else if (this.f31232yb) {
                    if (gjVar5.l4()) {
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i12);
                        TLRPC.Document F0 = this.Q5.F0();
                        gj gjVar6 = this.Q5;
                        if (gj.R5(gjVar6.f23817k)) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        G.W(F0, gjVar6, 2, i10);
                        radialProgress2 = radialProgress23;
                    } else {
                        gj gjVar7 = this.Q5;
                        gjVar7.f23804h0 = 2.0f;
                        TLRPC.Document F02 = gjVar7.F0();
                        u2Var.f22293r = true;
                        String str2 = str;
                        radialProgress2 = radialProgress23;
                        u2Var.r0(gc.b(F02), null, gc.f(photoSize, F02), str2, null, F02.size, null, this.Q5, 0);
                    }
                    this.f31057lb = true;
                    invalidate();
                } else {
                    radialProgress2 = radialProgress23;
                    if (i14 == 9) {
                        org.telegram.messenger.w7.G(i12).W(this.N1, this.Q5, 2, 0);
                        if (this.Q5.H0 > 0) {
                            A0(this.N1);
                        }
                    } else {
                        int i16 = this.M1;
                        if (i16 == 4) {
                            org.telegram.messenger.w7.G(i12).W(this.N1, this.Q5, 1, i7);
                            gj gjVar8 = this.Q5;
                            if (gjVar8.H0 > 0) {
                                A0(gjVar8.F0());
                            }
                        } else if (i14 == 0 && i16 != 0) {
                            if (i16 == 2) {
                                u2Var.f22293r = true;
                                u2Var.r0(gc.b(this.N1), null, gc.c(this.f30959e4, this.N1), this.f31012i4, null, this.N1.size, null, this.Q5, i7);
                                gj gjVar9 = this.Q5;
                                gjVar9.f23804h0 = 2.0f;
                                if (gjVar9.H0 > 0) {
                                    A0(gjVar9.F0());
                                }
                            } else if (i16 == 1) {
                                org.telegram.messenger.w7.G(i12).W(this.N1, this.Q5, 2, 0);
                            } else if (i16 == 8) {
                                u2Var.r0(gc.b(this.N1), this.f30999h4, gc.c(this.f30959e4, this.N1), "b1", null, 0L, "jpg", this.Q5, 1);
                            }
                        } else {
                            u2Var.f22293r = true;
                            u2Var.r0(gc.f(this.f30959e4, this.f30946d4), this.f30999h4, gc.f(this.f30973f4, this.f30946d4), this.f31012i4, this.f30985g4, 0L, null, this.Q5, 0);
                        }
                    }
                }
                this.Q5.l1 = false;
                this.O3 = 1;
                if (z10) {
                    radialProgress22.setIcon(14, false, true);
                } else {
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
                return;
            }
            if (this.X3 == 0) {
                org.telegram.messenger.w7.G(i12).W(this.N1, this.Q5, 2, 0);
                this.Q5.l1 = false;
            }
            if (this.Sa.T1(this, this.Q5)) {
                if (this.W3 == 2 && this.X3 != 1) {
                    this.X3 = 1;
                    radialProgress23.p(false, 0.0f);
                    radialProgress23.k(getMiniIconForCurrentState(), false, true);
                }
                T3();
                this.O3 = 1;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i11 == 1 && (!this.f31235z1 || z10)) {
            u2Var.f22293r = false;
            int i17 = this.M1;
            if (i17 != 3 && i17 != 5 && (i17 != 7 || (gjVar2 = this.Q5) == null || !gjVar2.T4())) {
                if (this.Q5.N3() && !this.f31235z1 && (this.Q5.o4() || this.Q5.Y2())) {
                    if (radialProgress23.f32661i.f39230q != 6) {
                        this.Sa.N(this);
                        return;
                    }
                    return;
                }
                gj gjVar10 = this.Q5;
                gjVar10.l1 = true;
                int i18 = this.M1;
                if (i18 != 2 && i18 != 4 && i18 != 1 && i18 != 8) {
                    int i19 = gjVar10.D;
                    if (i19 != 0 && i19 != 1 && i19 != 20 && i19 != 8 && i19 != 5) {
                        if (i19 == 9) {
                            org.telegram.messenger.w7.G(i12).f(this.Q5.F0());
                        }
                    } else {
                        fc D = fc.D();
                        String str3 = u2Var.R;
                        if (str3 != null) {
                            D.f23476s.c(new hb(D, str3, 2));
                        }
                        u2Var.c();
                    }
                } else {
                    org.telegram.messenger.w7.G(i12).f(this.N1);
                }
                this.O3 = 0;
                if (z10) {
                    radialProgress22.setIcon(2, false, true);
                } else {
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
            } else if (MediaController.B().R(this.Q5, true)) {
                this.O3 = 0;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i11 == 2) {
            gj gjVar11 = this.Q5;
            if (gjVar11 != null && gjVar11.D == 23) {
                this.Sa.w0(this, 0.0f, 0.0f, false);
            } else if (this.M1 == 7 && gjVar11 != null && gjVar11.T4()) {
                if (this.X3 == 0) {
                    org.telegram.messenger.w7.G(i12).W(this.N1, this.Q5, 2, 0);
                    this.Q5.l1 = false;
                }
                if (this.Sa.T1(this, this.Q5)) {
                    if (this.W3 == 2 && this.X3 != 1) {
                        this.X3 = 1;
                        radialProgress23.p(false, 0.0f);
                        radialProgress23.k(getMiniIconForCurrentState(), false, true);
                    }
                    T3();
                    this.O3 = 1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                if (this.f31232yb) {
                    this.f31057lb = true;
                    invalidate();
                }
            } else {
                int i20 = this.M1;
                if (i20 != 3 && i20 != 5) {
                    if (this.f31232yb) {
                        gj gjVar12 = MediaController.B().f22377v0;
                        if (gjVar12 == null || !gjVar12.h4()) {
                            u2Var.f22301u0 = true;
                            u2Var.P0(false);
                        }
                    } else {
                        u2Var.f22301u0 = true;
                        u2Var.P0(false);
                    }
                    this.Q5.f23804h0 = 0.0f;
                    this.O3 = -1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    return;
                }
                radialProgress23.p(false, 0.0f);
                org.telegram.messenger.w7.G(i12).W(this.N1, this.Q5, 2, 0);
                this.Q5.l1 = false;
                this.O3 = 4;
                radialProgress23.setIcon(getIconForCurrentState(), true, true);
                invalidate();
            }
        } else if (i11 != 3 && i11 != 0) {
            if (i11 == 4) {
                int i21 = this.M1;
                if (i21 == 3 || i21 == 5 || (i21 == 7 && (gjVar = this.Q5) != null && gjVar.T4())) {
                    if ((this.Q5.N3() && (this.Q5.o4() || this.Q5.Y2())) || this.Q5.n4()) {
                        l1 l1Var = this.Sa;
                        if (l1Var != null && radialProgress23.f32661i.f39230q != 6) {
                            l1Var.N(this);
                            return;
                        }
                        return;
                    }
                    this.Q5.l1 = true;
                    org.telegram.messenger.w7.G(i12).f(this.N1);
                    this.O3 = 2;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            }
        } else {
            if (this.W3 == 2 && this.X3 != 1) {
                this.X3 = 1;
                f10 = 0.0f;
                radialProgress23.p(false, 0.0f);
                radialProgress23.k(getMiniIconForCurrentState(), false, true);
            } else {
                f10 = 0.0f;
            }
            l1 l1Var2 = this.Sa;
            if (l1Var2 != null) {
                l1Var2.w0(this, f10, f10, false);
            }
        }
    }

    public final t1 E1() {
        if (this.Y0 == null) {
            this.Y0 = new t1(this);
        }
        return this.Y0;
    }

    public final boolean E2() {
        if (this.R5 != null) {
            return this.W5;
        }
        return this.I;
    }

    public final boolean E3() {
        bj bjVar;
        gj gjVar = this.Q5;
        if (gjVar != null && !gjVar.f23854t1 && !gjVar.r4()) {
            yi yiVar = this.M;
            if ((yiVar == null || ((bjVar = this.L) != null && bjVar.f22713i && (yiVar.f27753l & 8) == 0)) && !this.f31018ib.f32012x0) {
                if (!this.f31221y || !gj.R4(this.Q5.f23817k)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean F(MotionEvent motionEvent) {
        RectF rectF;
        l1 l1Var;
        y yVar;
        boolean z10 = false;
        if (this.f30911a9 != null && (rectF = this.f30951d9) != null && (this.f31030ja != null || this.f31044ka != null)) {
            boolean contains = rectF.contains((int) motionEvent.getX(), (int) N1(motionEvent));
            if (motionEvent.getAction() == 0) {
                SpannableString spannableString = new SpannableString(this.f30911a9.getText());
                wg.a[] aVarArr = (wg.a[]) spannableString.getSpans(0, spannableString.length(), wg.a.class);
                if (contains && aVarArr != null && aVarArr.length > 0) {
                    z10 = true;
                }
                this.X2 = z10;
                if (z10 && (yVar = this.Z2) != null) {
                    yVar.setHotspot((int) motionEvent.getX(), (int) N1(motionEvent));
                    this.Z2.setState(this.N2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.X2 && (l1Var = this.Sa) != null) {
                    l1Var.W0(this);
                }
                y yVar2 = this.Z2;
                if (yVar2 != null) {
                    yVar2.setState(StateSet.NOTHING);
                }
                this.X2 = false;
            }
            return this.X2;
        }
        this.X2 = false;
        return false;
    }

    public final void F0() {
        int i7;
        int i10;
        int i11 = this.X3;
        int i12 = this.f30908a6;
        RadialProgress2 radialProgress2 = this.Q0;
        if (i11 == 0) {
            this.X3 = 1;
            radialProgress2.p(false, 0.0f);
            gj gjVar = this.Q5;
            if (gjVar != null && !gjVar.M2()) {
                this.Q5.P = true;
            }
            int i13 = this.M1;
            if (i13 != 3 && i13 != 5) {
                if (i13 == 4 || i13 == 7) {
                    A0(this.N1);
                    org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i12);
                    TLRPC.Document document = this.N1;
                    gj gjVar2 = this.Q5;
                    if (gj.R5(gjVar2.f23817k)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    G.W(document, gjVar2, 2, i10);
                    this.Q5.l1 = false;
                }
            } else {
                org.telegram.messenger.w7 G2 = org.telegram.messenger.w7.G(i12);
                TLRPC.Document document2 = this.N1;
                gj gjVar3 = this.Q5;
                if (gj.R5(gjVar3.f23817k)) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                G2.W(document2, gjVar3, 2, i7);
                this.Q5.l1 = false;
            }
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        } else if (i11 == 1) {
            int i14 = this.M1;
            if ((i14 == 3 || i14 == 5 || i14 == 7) && MediaController.B().I(this.Q5)) {
                MediaController.B().q(true, true, false, false);
            }
            this.X3 = 0;
            this.Q5.l1 = true;
            org.telegram.messenger.w7.G(i12).f(this.N1);
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final boolean F1(o1 o1Var, u70 u70Var, Layout layout, int i7) {
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
                } else if (characterStyleArr[i10] == this.A4) {
                    o1Var.f30787b = i7;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (o1Var.f30787b != i7) {
            return false;
        }
        u70Var.rewind();
        int spanStart = spanned.getSpanStart(this.A4);
        int spanEnd = spanned.getSpanEnd(this.A4);
        u70Var.f35696c = true;
        u70Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, u70Var);
        u70Var.a();
        this.f31226y4.l();
        return true;
    }

    public final boolean F2() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message;
        gj gjVar = this.Q5;
        if (!gjVar.f23824l2) {
            if (gj.B0(gjVar.f23817k) != 489000 || (message = this.Q5.f23817k) == null || message.fwd_from == null) {
                if (!this.Q5.r4() && !this.Q5.v3()) {
                    if (!this.f30987g6 || this.f31187v6) {
                        TLRPC.Message message2 = this.Q5.f23817k;
                        if (message2 == null || (messageFwdHeader = message2.fwd_from) == null || (peer = messageFwdHeader.from_id) == null || message2.via_bot_id == 0 || org.telegram.messenger.m5.o(peer) != org.telegram.messenger.m5.o(this.Q5.f23817k.peer_id)) {
                            if (!this.f31187v6 || this.Q5.D != 0) {
                                if (!this.F && this.f31029j9 && this.f30975f6) {
                                    if (this.Q5.P3()) {
                                        if ((this.Q5.A4() && this.Q5.o3()) || this.Q5.f23816j2) {
                                            return true;
                                        }
                                    } else {
                                        return true;
                                    }
                                }
                                if (!this.Q5.y3() || this.Q5.f23817k.fwd_from.from_id != null) {
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

    public final boolean F3() {
        if (!w2()) {
            if ((this.L == null || (this.M.f27753l & 4) != 0) && !this.R1) {
                gj gjVar = this.Q5;
                if (gjVar != null) {
                    if (!gjVar.f23816j2 && !gjVar.r4()) {
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
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            invalidate();
            q2();
        }
    }

    public final void G0() {
        gj gjVar = this.Q5;
        if (gjVar != null) {
            gjVar.L0 = !gjVar.L0;
            l1 l1Var = this.Sa;
            if (l1Var != null) {
                l1Var.F1(this, true);
            }
        }
    }

    public final boolean G1(o1 o1Var, u70 u70Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (F1(o1Var, u70Var, ((dj) arrayList.get(i7)).f23093e, i7)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean G2(gj gjVar) {
        TLRPC.MessageFwdHeader messageFwdHeader = gjVar.f23817k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
            l1 l1Var = this.Sa;
            if (l1Var == null || l1Var.T()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean G3() {
        gj gjVar;
        gj gjVar2;
        int i7 = this.f31192vb;
        if (i7 != 0) {
            if (i7 != 1) {
                return false;
            }
        } else if (!u2()) {
            if (!d4() && ((!this.C6 || ((this.f31062m3 != null && !this.f31197w1) || (!this.O.f5204p && ((gjVar2 = this.Q5) == null || (!gjVar2.M2() && !this.Q5.h4()))))) && ((gjVar = this.Q5) == null || gjVar.D != 29))) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public final boolean H(MotionEvent motionEvent) {
        l1 l1Var;
        if (this.f30911a9 == null || (l1Var = this.Sa) == null || !l1Var.c()) {
            return false;
        }
        boolean contains = this.f30925b9.contains(motionEvent.getX(), motionEvent.getY());
        if (this.f30938c9 == null) {
            this.f30938c9 = new dc(this);
        }
        if (motionEvent.getAction() == 0) {
            this.f30938c9.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.f30938c9.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f30938c9.f33917i) {
                this.Sa.j2(this);
            }
            this.f30938c9.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.f30938c9.c(false);
        }
        return this.f30938c9.f33917i;
    }

    public final void H0(Canvas canvas, float f10) {
        ArrayList arrayList;
        float f11;
        float f12;
        if (this.f31062m3 == null) {
            return;
        }
        float f13 = this.f31157t3;
        float f14 = this.f31145s3;
        x1 x1Var = this.f31018ib;
        if (x1Var.f32012x0) {
            if (x1Var.D0) {
                f13 -= getTranslationY();
                f12 = x1Var.f31947h0;
            } else if (x1Var.f31997t0) {
                float f15 = x1Var.L1;
                float f16 = 1.0f - f15;
                f14 = (f14 * f15) + (x1Var.f31989r0 * f16);
                f13 = (f13 * f15) + (f16 * x1Var.f31993s0);
            } else if (!gj.R4(this.Q5.f23817k) || !TextUtils.isEmpty(this.Q5.f23875z)) {
                f12 = x1Var.f31947h0;
            }
            f14 += f12;
        }
        float f17 = f14;
        float f18 = f13;
        float f19 = 0.0f;
        ArrayList arrayList2 = null;
        if (x1Var.f31921b1) {
            float f20 = x1Var.L1;
            if (f20 != 1.0f) {
                ej ejVar = x1Var.f31926c1;
                if (ejVar != null) {
                    arrayList = ejVar.f23310e;
                } else {
                    arrayList = null;
                }
                org.telegram.ui.Components.l5 l5Var = x1Var.P0;
                float f21 = (1.0f - f20) * f10;
                if (ejVar != null) {
                    f11 = ejVar.d;
                } else {
                    f11 = 0.0f;
                }
                I0(f17, f18, canvas, arrayList, l5Var, false, f21, f11, true);
                ej ejVar2 = this.f31062m3;
                if (ejVar2 != null) {
                    arrayList2 = ejVar2.f23310e;
                }
                ArrayList arrayList3 = arrayList2;
                org.telegram.ui.Components.l5 l5Var2 = this.Aa;
                float f22 = f10 * x1Var.L1;
                if (ejVar2 != null) {
                    f19 = ejVar2.d;
                }
                I0(f17, f18, canvas, arrayList3, l5Var2, true, f22, f19, true);
                return;
            }
        }
        ej ejVar3 = this.f31062m3;
        if (ejVar3 != null) {
            arrayList2 = ejVar3.f23310e;
        }
        ArrayList arrayList4 = arrayList2;
        org.telegram.ui.Components.l5 l5Var3 = this.Aa;
        if (ejVar3 != null) {
            f19 = ejVar3.d;
        }
        I0(f17, f18, canvas, arrayList4, l5Var3, true, f10, f19, true);
    }

    public final void H1() {
        gj gjVar = this.R5;
        if (gjVar == null) {
            gjVar = this.Q5;
        }
        gj gjVar2 = gjVar;
        this.Q5 = null;
        x3(gjVar2, this.L, this.G, this.F, this.H, false);
    }

    public final boolean H2(org.telegram.messenger.gj r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.H2(org.telegram.messenger.gj):boolean");
    }

    public final void H3(int i7, boolean z10, boolean z11) {
        float f10;
        float f11 = 0.0f;
        if (i7 == -1 || i7 == 0) {
            if (this.f31132r5 != z10) {
                this.f31132r5 = z10;
                if (!z11) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    this.s5 = f10;
                } else {
                    invalidate();
                }
            } else {
                return;
            }
        }
        if ((i7 != -1 && i7 != 1) || this.F5 == z10) {
            return;
        }
        this.F5 = z10;
        if (!z11) {
            if (z10) {
                f11 = 1.0f;
            }
            this.G5 = f11;
            return;
        }
        setInvalidatesParent(true);
        invalidate();
    }

    @Override
    public final void I(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.I(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    public final void I0(float r24, float r25, android.graphics.Canvas r26, java.util.ArrayList r27, org.telegram.ui.Components.l5 r28, boolean r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.I0(float, float, android.graphics.Canvas, java.util.ArrayList, org.telegram.ui.Components.l5, boolean, float, float, boolean):void");
    }

    public final boolean I2() {
        if (this.R5 != null) {
            return this.U5;
        }
        return this.G;
    }

    public final void I3() {
        fi.u2 u2Var = this.U0;
        J3((u2Var.N0 / 2.0f) + u2Var.L0, (u2Var.O0 / 2.0f) + u2Var.M0);
    }

    public final boolean J(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.J(android.view.MotionEvent):boolean");
    }

    public final void J0(Canvas canvas, float f10) {
        tg0 tg0Var;
        gj gjVar = this.Q5;
        if (gjVar != null && !gjVar.r4()) {
            float f11 = this.f31167u0;
            x1 x1Var = this.f31018ib;
            if (x1Var.f31971m2) {
                float f12 = x1Var.f31979o2;
                float f13 = x1Var.L1;
                f11 = (f11 * f13) + ((1.0f - f13) * f12);
            }
            float f14 = f11;
            if (x1Var.L1 != 1.0f && x1Var.H0 && ((tg0Var = this.Ac) == null || !tg0Var.h)) {
                canvas.save();
                org.telegram.ui.ActionBar.r4 r4Var = this.L6;
                if (r4Var != null) {
                    Rect bounds = r4Var.getBounds();
                    if (this.Q5.P3() && !this.C6 && !this.G) {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(10.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    } else {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(4.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    }
                }
                I0(this.f31085o0, f14, canvas, x1Var.I0, x1Var.P0, false, (1.0f - x1Var.L1) * f10, this.Q5.f23870x2, false);
                gj gjVar2 = this.Q5;
                I0(this.f31085o0, f14, canvas, gjVar2.B2, this.Aa, true, f10 * x1Var.L1, gjVar2.f23870x2, false);
                canvas.restore();
            } else {
                gj gjVar3 = this.Q5;
                I0(this.f31085o0, f14, canvas, gjVar3.B2, this.Aa, true, f10, gjVar3.f23870x2, false);
            }
        }
        if (E3()) {
            H0(canvas, f10);
        }
    }

    public final ColorFilter J1(int i7, int i10) {
        if (this.f31097od == null) {
            this.f31111pd = new int[3];
            this.f31097od = new ColorFilter[3];
        }
        if (i10 != this.f31111pd[i7] || this.f31097od[i7] == null) {
            ColorFilter[] colorFilterArr = this.f31097od;
            this.f31111pd[i7] = i10;
            colorFilterArr[i7] = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.f31097od[i7];
    }

    public final boolean J2() {
        if (this.R5 != null) {
            return this.T5;
        }
        return this.F;
    }

    public final void J3(float f10, float f11) {
        q1 q1Var;
        fi.u2 u2Var = this.U0;
        this.P9 = (float) Math.sqrt(Math.pow(u2Var.O0, 2.0d) + Math.pow(u2Var.N0, 2.0d));
        gj gjVar = this.Q5;
        if (!gjVar.O0 && this.M9 == 0.0f) {
            if (gjVar.D == 3) {
                gjVar.M1 = true;
                gjVar.Q0 = true;
                q1Var = this;
                q1Var.w3(gjVar, this.L, this.G, this.F, this.H, this.I);
                gj gjVar2 = q1Var.Q5;
                gjVar2.Q0 = false;
                gjVar2.M1 = false;
                if (q1Var.L != null) {
                    q1Var.Q0.p(false, 0.0f);
                }
            } else {
                q1Var = this;
            }
            q1Var.N9 = f10;
            q1Var.O9 = f11;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c8.i9.a(q1Var.P9 * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(er.f34423j);
            duration.addUpdateListener(new r(this, 2));
            duration.addListener(new k1(this, 0));
            duration.start();
        }
    }

    public final boolean K(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.K(android.view.MotionEvent):boolean");
    }

    public final void K0(android.graphics.Canvas r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.K0(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public final boolean K2() {
        if (this.f31232yb && this.f31245zb) {
            return true;
        }
        return false;
    }

    public final boolean K3() {
        l1 l1Var;
        if (getCurrentMessagesGroup() == null && (l1Var = this.Sa) != null && l1Var.z2() != null && this.Sa.z2().z(this.Q5)) {
            return true;
        }
        return false;
    }

    public final boolean L(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f31216x7) {
            int x10 = (int) motionEvent.getX();
            int N1 = (int) N1(motionEvent);
            yi yiVar = this.M;
            if (yiVar != null) {
                int i7 = yiVar.f27753l;
                if ((i7 & 1) == 0 || (i7 & 8) == 0) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt != this && (childAt instanceof q1)) {
                            q1 q1Var = (q1) childAt;
                            if (q1Var.f31216x7 && q1Var.L == this.L) {
                                int i11 = q1Var.M.f27753l;
                                if ((i11 & 1) != 0 && (i11 & 8) != 0) {
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), (motionEvent.getX() + getLeft()) - q1Var.getLeft(), (N1(motionEvent) + getTop()) - q1Var.getTop(), 0);
                                    boolean L = q1Var.L(obtain);
                                    obtain.recycle();
                                    return L;
                                }
                            }
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.J2;
            if (action == 0) {
                if (this.f31229y7.contains(x10, N1)) {
                    if (this.Q5.q4()) {
                        this.L2[1] = 2;
                        this.f31241z7 = true;
                        Drawable drawable2 = drawableArr[1];
                        if (drawable2 != null) {
                            drawable2.setHotspot(x10, N1);
                            drawableArr[1].setState(this.N2);
                        }
                        s2();
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f31241z7) {
                    l1 l1Var = this.Sa;
                    if (l1Var != null) {
                        if (this.f31173u6) {
                            l1Var.r(this);
                        } else {
                            l1Var.w(this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[1];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.f31241z7 = false;
                    s2();
                    return false;
                }
            } else if (motionEvent.getAction() == 2 && this.f31241z7 && (drawable = drawableArr[1]) != null) {
                drawable.setHotspot(x10, N1);
            }
        }
        return false;
    }

    public final boolean L0() {
        gj gjVar;
        if (this.Rb && (gjVar = this.Q5) != null && gjVar.P3() && org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29170ub, this.Qb) != 0) {
            return true;
        }
        return false;
    }

    public final boolean L2() {
        gj gjVar = this.Q5;
        if (gjVar != null && gjVar.S4()) {
            return false;
        }
        return true;
    }

    public final boolean M(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.Q5.D == 12) {
            if (this.f31198w2 == null) {
                this.f31198w2 = new r1(this);
            }
            r1 r1Var = this.f31198w2;
            q1 q1Var = r1Var.f31330a;
            gj gjVar = q1Var.Q5;
            int[] iArr = q1Var.N2;
            Drawable[] drawableArr = q1Var.J2;
            if (gjVar.D == 12) {
                int x10 = (int) motionEvent.getX();
                int N1 = (int) q1Var.N1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    ArrayList arrayList = r1Var.f31335g;
                    if (arrayList != null && arrayList.size() > 1) {
                        for (int i7 = 0; i7 < r1Var.f31335g.size(); i7++) {
                            n1 n1Var = (n1) r1Var.f31335g.get(i7);
                            float f10 = x10;
                            float f11 = N1;
                            if (n1Var.f30717e.contains(f10, f11)) {
                                if (n1Var.f30718f == null) {
                                    n1Var.f30718f = new dc(q1Var);
                                }
                                n1Var.f30718f.c(true);
                                y yVar = n1Var.f30719g;
                                if (yVar != null) {
                                    yVar.setHotspot(f10, f11);
                                    n1Var.f30719g.setState(iArr);
                                }
                                q1Var.invalidate();
                                return true;
                            }
                        }
                    }
                    float f12 = x10;
                    float f13 = N1;
                    if (q1Var.f31183v2.contains(f12, f13)) {
                        r1Var.h = true;
                        q1Var.Ga.c(true);
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
                        if (q1Var.Sa != null) {
                            ArrayList arrayList2 = r1Var.f31335g;
                            if (arrayList2 != null && arrayList2.size() == 1) {
                                q1Var.Sa.p1(q1Var, ((n1) r1Var.f31335g.get(0)).f30714a);
                            } else {
                                q1Var.Sa.p1(q1Var, 5);
                            }
                        }
                        q1Var.playSoundEffect(0);
                        Drawable drawable3 = drawableArr[0];
                        if (drawable3 != null) {
                            drawable3.setState(StateSet.NOTHING);
                        }
                        r1Var.h = false;
                        q1Var.Ga.c(false);
                        q1Var.invalidate();
                        return false;
                    }
                    ArrayList arrayList3 = r1Var.f31335g;
                    if (arrayList3 != null && arrayList3.size() > 1) {
                        for (int i10 = 0; i10 < r1Var.f31335g.size(); i10++) {
                            n1 n1Var2 = (n1) r1Var.f31335g.get(i10);
                            dc dcVar = n1Var2.f30718f;
                            if (dcVar != null && dcVar.f33917i) {
                                l1 l1Var = q1Var.Sa;
                                if (l1Var != null) {
                                    l1Var.p1(q1Var, n1Var2.f30714a);
                                }
                                y yVar2 = n1Var2.f30719g;
                                if (yVar2 != null) {
                                    yVar2.setState(StateSet.NOTHING);
                                }
                                n1Var2.f30718f.c(false);
                                q1Var.playSoundEffect(0);
                                q1Var.invalidate();
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 2) {
                    if (r1Var.h && (drawable = drawableArr[0]) != null) {
                        drawable.setHotspot(x10, N1);
                        return false;
                    }
                    ArrayList arrayList4 = r1Var.f31335g;
                    if (arrayList4 != null && arrayList4.size() > 1) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= r1Var.f31335g.size()) {
                                break;
                            }
                            n1 n1Var3 = (n1) r1Var.f31335g.get(i11);
                            dc dcVar2 = n1Var3.f30718f;
                            if (dcVar2 != null && dcVar2.f33917i) {
                                y yVar3 = n1Var3.f30719g;
                                if (yVar3 != null) {
                                    yVar3.setHotspot(x10, N1);
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

    public final boolean M0(android.graphics.Canvas r43, boolean r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.M0(android.graphics.Canvas, boolean, boolean):boolean");
    }

    public final org.telegram.ui.ActionBar.r4 M1(boolean z10) {
        boolean z11;
        if (z10) {
            yi yiVar = this.M;
            if (yiVar != null && (yiVar.f27753l & 8) == 0 && this.L.f22713i && !this.K) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.Q5.P3()) {
                if (!this.C6 && !this.K && !z11) {
                    this.L6 = c3("drawableMsgOut");
                } else {
                    this.L6 = c3("drawableMsgOutMedia");
                }
            } else if (!this.C6 && !this.K && !z11) {
                this.L6 = (org.telegram.ui.ActionBar.r4) Z1("drawableMsgIn");
            } else {
                this.L6 = (org.telegram.ui.ActionBar.r4) Z1("drawableMsgInMedia");
            }
        }
        this.L6.f();
        return this.L6;
    }

    public final boolean M2() {
        gj gjVar;
        if (this.Y6 && (gjVar = this.Q5) != null && !gjVar.P3() && this.M == null && !u2()) {
            return true;
        }
        return false;
    }

    @Override
    public final void N(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.N(java.lang.String):void");
    }

    public void N0(Canvas canvas) {
        if (!this.Q5.O0 && this.M9 != 1.0f) {
            fi.u2 u2Var = this.U0;
            int[] iArr = u2Var.X0;
            float f10 = iArr[0];
            float[] fArr = this.K9;
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
            Path path = this.J9;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(u2Var.L0, u2Var.M0, u2Var.y(), u2Var.A());
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr, direction);
            canvas.save();
            canvas.clipPath(path);
            if (this.M9 != 0.0f) {
                path.rewind();
                path.addCircle(this.N9, this.O9, this.P9 * this.M9, direction);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            if (this.Q5.m5()) {
                u2Var.h(canvas, null);
            } else {
                float f14 = u2Var.L0;
                float f15 = u2Var.M0;
                float f16 = u2Var.N0;
                float f17 = u2Var.O0;
                ImageReceiver imageReceiver = this.V0;
                imageReceiver.y0(f14, f15, f16, f17);
                imageReceiver.L0(u2Var.X0);
                imageReceiver.h(canvas, null);
            }
            O0(canvas);
            canvas.restore();
        }
    }

    public final float N1(MotionEvent motionEvent) {
        return ((motionEvent.getY() - this.W) - this.f30981g0) - this.f31008i0;
    }

    public final void N3(int i7, boolean z10) {
        if (i7 >= 0) {
            ArrayList arrayList = this.Q4;
            if (i7 < arrayList.size()) {
                p1 p1Var = (p1) arrayList.get(i7);
                if (this.Sa.Q(this, p1Var.f30855t, !p1Var.f30844i)) {
                    if (z10) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long B0 = gj.B0(this.Q5.f23817k);
                    int i10 = this.f30908a6;
                    long M = org.telegram.messenger.t3.M(np.s1(i10).M0(Long.valueOf(B0)), np.s1(i10).N0(B0), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) gj.m1(this.Q5);
                    int i11 = this.f30908a6;
                    gj.Z5(i11, M, tL_messageMediaToDo, p1Var.f30855t.f28198id, !p1Var.f30844i, ConnectionsManager.getInstance(i11).getCurrentTime());
                    if (!p1Var.f30844i) {
                        TLObject e22 = np.s1(i10).e2(M);
                        p1Var.f30859y.l(e22);
                        p1Var.f30860z.i0(e22, p1Var.f30859y, null);
                        p1Var.f30852q = new oy0(org.telegram.messenger.m5.m(e22), 12.0f, null);
                    }
                    this.f30976f7[i7].f(-1, !p1Var.f30844i, true);
                    if (this.f31225y3 != null) {
                        if (!this.Q5.P3() && gj.B0(this.Q5.f23817k) >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.f31225y3.t(hd.K("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(gj.z0(tL_messageMediaToDo)), org.telegram.messenger.m5.l(m10.f24934t0, this.Q5.Z0())), true, true);
                        } else {
                            this.f31225y3.t(hd.K("TodoCompleted", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(gj.z0(tL_messageMediaToDo))), true, true);
                        }
                    }
                    p1Var.f30844i = !p1Var.f30844i;
                    invalidate();
                    return;
                }
                this.Z4 = false;
            }
        }
    }

    public void O0(Canvas canvas) {
        if (this.Q9 == null) {
            return;
        }
        canvas.save();
        fi.u2 u2Var = this.U0;
        canvas.translate(u2Var.L0, u2Var.M0);
        this.Q9.c(canvas, this, (int) u2Var.N0, (int) u2Var.O0, u2Var.getAlpha(), this.Hc);
        canvas.restore();
        invalidate();
    }

    public final String O1(gj gjVar) {
        if (this.B5) {
            String N0 = hd.N0("PsaMessage_" + gjVar.f23817k.fwd_from.psa_type);
            if (N0 == null) {
                return hd.M0(2131746595, "PsaMessageDefault");
            }
            return N0;
        }
        return hd.M0(2131750565, null);
    }

    public final boolean O2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.O2():boolean");
    }

    public final void O3() {
        gj gjVar;
        int i7;
        boolean z10;
        iv ivVar;
        ArrayList arrayList;
        if (this.f31233yc && (gjVar = this.Q5) != null) {
            boolean z11 = false;
            if (gjVar.X1) {
                i7 = org.telegram.ui.Components.g5.f();
            } else {
                i7 = 0;
            }
            ej ejVar = this.f31062m3;
            if (ejVar != null && (arrayList = ejVar.f23310e) != null) {
                this.Aa = org.telegram.ui.Components.p5.update(i7, (View) this, false, this.Aa, (ArrayList<dj>) arrayList);
            } else {
                l1 l1Var = this.Sa;
                if (l1Var != null && l1Var.g()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.Aa = org.telegram.ui.Components.p5.update(i7, this, z10, this.Aa, this.Q5.B2);
            }
            gj gjVar2 = this.Q5;
            if (gjVar2.D == 36 && (ivVar = gjVar2.f23874y2) != null) {
                l1 l1Var2 = this.Sa;
                if (l1Var2 == null || !l1Var2.g()) {
                    z11 = true;
                }
                ivVar.v = z11;
                this.Q5.f23874y2.b0(i7);
            }
        }
    }

    public final boolean P(MotionEvent motionEvent) {
        float f10;
        l1 l1Var;
        gj gjVar = this.Q5;
        if (gjVar == null || gjVar.M0() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f11 = 0.0f;
        if (this.f31021j0 == 0) {
            f10 = 0.0f;
        } else {
            f10 = 18.0f;
        }
        float L = timeX - org.telegram.messenger.g0.L(f10);
        float f12 = this.A9;
        if (this.Q5.B0) {
            f11 = 1.0f - this.f31038k4;
        }
        int L2 = ((int) ((f12 * f11) + L)) - org.telegram.messenger.g0.L(2.0f);
        int timeY = ((int) getTimeY()) - org.telegram.messenger.g0.L(2.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(L2, timeY, org.telegram.messenger.g0.L(16.0f) + L2 + this.A9, org.telegram.messenger.g0.L(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), N1(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.f31047l0 == null) {
                    this.f31047l0 = new dc(this);
                }
                this.f30993gc = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.f30993gc = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.f30993gc && (l1Var = this.Sa) != null) {
                l1Var.H(this);
            }
            this.f30993gc = false;
        } else if (motionEvent.getAction() == 3) {
            this.f30993gc = false;
        }
        dc dcVar = this.f31047l0;
        if (dcVar != null) {
            dcVar.c(this.f30993gc);
        }
        return this.f30993gc;
    }

    public final boolean P0(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        gj gjVar;
        l1 l1Var;
        String str;
        boolean c10 = cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        int i7 = 1;
        int i10 = this.f30908a6;
        if (!c10 && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                ez C = ez.C(i10);
                gj gjVar2 = this.Q5;
                if (gjVar2 != null && keyboardButtonProto != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(gj.B0(gjVar2.f23817k));
                    sb2.append("_");
                    sb2.append(gjVar2.e1());
                    sb2.append("_");
                    sb2.append(Utilities.f(keyboardButtonProto.getData()));
                    sb2.append("_");
                    if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    sb2.append(str);
                    return C.f23391n.containsKey(sb2.toString());
                }
            } else {
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (tL_inlineButtonTypeUrl != null && (l1Var = this.Sa) != null && l1Var.z1(this, 3) && TextUtils.equals(this.Sa.h(this), tL_inlineButtonTypeUrl.url)) {
                    return true;
                }
            }
        } else {
            ez C2 = ez.C(i10);
            if (this.Q5 != null && keyboardButtonProto != null) {
                if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    i7 = 3;
                } else if (!cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                    if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                        i7 = 2;
                    } else {
                        i7 = 0;
                    }
                }
                return C2.f23392r.containsKey(gj.B0(gjVar.f23817k) + "_" + gjVar.e1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i7);
            }
        }
        return false;
    }

    public final float P1(boolean z10) {
        float f10;
        sg0 sg0Var;
        float f11;
        if (!this.f31035k1 && this.f31228y6) {
            int i7 = this.f31240z6;
            if (i7 >= 300) {
                f11 = 1.0f;
            } else {
                f11 = i7 / 300.0f;
            }
            f10 = f11 * 1.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10 && (sg0Var = this.f31088o3) != null) {
            return (1.0f - sg0Var.f39311k.e(false, 1.0f)) * f10;
        }
        return f10;
    }

    public final boolean P2() {
        gj gjVar = this.Q5;
        iv ivVar = gjVar.f23874y2;
        if (gjVar.D == 36 && ivVar != null) {
            ArrayList arrayList = ivVar.f24445g;
            if (arrayList.size() == 1 && (arrayList.get(0) instanceof hk0)) {
                return true;
            }
        }
        return false;
    }

    public final void P3(boolean r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.P3(boolean, boolean, boolean):void");
    }

    public final boolean Q(MotionEvent motionEvent) {
        int i7;
        int i10;
        int i11;
        if (this.T1) {
            t1 E1 = E1();
            q1 q1Var = E1.f31520a;
            boolean z10 = q1Var.T1;
            ArrayList arrayList = q1Var.I5;
            n2.o0 o0Var = q1Var.f31171u4;
            if (z10) {
                int x10 = (int) motionEvent.getX();
                int N1 = (int) q1Var.N1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    if (q1Var.O1 && q1Var.f31223y1 && q1Var.O3 != -1 && x10 >= (i10 = q1Var.K3) && x10 <= org.telegram.messenger.g0.L(48.0f) + i10 && N1 >= (i11 = q1Var.L3) && N1 <= org.telegram.messenger.g0.L(48.0f) + i11 && q1Var.Q0.f32661i.f39230q != 4) {
                        q1Var.P3 = 1;
                        q1Var.invalidate();
                        return true;
                    } else if (q1Var.O1 && q1Var.U0.O(x10, N1)) {
                        E1.v = true;
                        return true;
                    } else if (q1Var.f31100p2 == null || N1 < q1Var.Y1) {
                        return false;
                    } else {
                        try {
                            int L = x10 - ((q1Var.f31098p0 + org.telegram.messenger.g0.L(10.0f)) + q1Var.f30904a2);
                            int i12 = N1 - q1Var.Y1;
                            int lineForVertical = q1Var.f31100p2.getLineForVertical(i12);
                            float f10 = L;
                            int offsetForHorizontal = q1Var.f31100p2.getOffsetForHorizontal(lineForVertical, f10);
                            float lineLeft = q1Var.f31100p2.getLineLeft(lineForVertical);
                            if (lineLeft > f10 || lineLeft + q1Var.f31100p2.getLineWidth(lineForVertical) < f10) {
                                return false;
                            }
                            Spannable spannable = (Spannable) q1Var.Q5.f23871y;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length == 0) {
                                return false;
                            }
                            if (((clickableSpanArr[0] instanceof c41) && !c41.h) || org.telegram.messenger.g0.C1()) {
                                return false;
                            }
                            a80 a80Var = q1Var.f31131r4;
                            if (a80Var == null || a80Var.f32922i != clickableSpanArr[0]) {
                                o0Var.n(a80Var, true);
                                a80 a80Var2 = new a80(clickableSpanArr[0], q1Var.Qb, f10, i12, 0);
                                q1Var.f31131r4 = a80Var2;
                                if (q1Var.Q5.P3()) {
                                    i7 = org.telegram.ui.ActionBar.j6.Dc;
                                } else {
                                    i7 = org.telegram.ui.ActionBar.j6.Ce;
                                }
                                a80Var2.d(org.telegram.ui.ActionBar.j6.w0(i7, q1Var.Qb));
                                q1Var.f31222y0 = -10;
                                q1Var.f31185v4 = 2;
                                try {
                                    u70 b10 = q1Var.f31131r4.b();
                                    int[] X1 = X1(spannable, q1Var.f31131r4.f32922i);
                                    b10.d(q1Var.f31100p2, X1[0], 0.0f);
                                    q1Var.f31100p2.getSelectionPath(X1[0], X1[1], b10);
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                o0Var.b(q1Var.f31131r4, 2);
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
                    if (q1Var.f31185v4 != 2 && !E1.v && q1Var.P3 == 0) {
                        q1Var.g3(2);
                        return false;
                    } else if (q1Var.P3 != 0) {
                        q1Var.P3 = 0;
                        q1Var.playSoundEffect(0);
                        q1Var.E0(false);
                        q1Var.invalidate();
                        return false;
                    } else {
                        a80 a80Var3 = q1Var.f31131r4;
                        if (a80Var3 != null) {
                            CharacterStyle characterStyle = a80Var3.f32922i;
                            if (characterStyle instanceof URLSpan) {
                                vf.c.t(q1Var.getContext(), ((URLSpan) q1Var.f31131r4.f32922i).getURL());
                            } else if (characterStyle instanceof ClickableSpan) {
                                ((ClickableSpan) characterStyle).onClick(q1Var);
                            }
                            q1Var.g3(2);
                            return false;
                        }
                        E1.v = false;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList.size()) {
                                break;
                            }
                            c0 c0Var = (c0) arrayList.get(i13);
                            if (cg.c.c(c0Var.f30068i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                q1Var.playSoundEffect(0);
                                q1Var.Sa.k1(q1Var, c0Var.f30068i);
                                q1Var.invalidate();
                                break;
                            }
                            i13++;
                        }
                        q1Var.g3(2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void Q0(float r8, android.graphics.Canvas r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.Q0(float, android.graphics.Canvas, boolean):void");
    }

    public final boolean Q2() {
        hk0 c42 = c4();
        if (c42 != null) {
            long j3 = this.f30914ac;
            long j10 = 0;
            if (j3 != 0) {
                q71 q71Var = c42.f35279e0;
                if (q71Var != null) {
                    j10 = q71Var.f38554t;
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

    public final void Q3() {
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
        gj gjVar = this.Q5;
        int i17 = gjVar.D;
        float f14 = 0.0f;
        x1 x1Var = this.f31018ib;
        int i18 = 0;
        boolean z10 = true;
        if (i17 != 1 && i17 != 20 && this.M1 != 4 && i17 != 8 && i17 != 23) {
            float f15 = 10.0f;
            float f16 = 11.0f;
            if (this.S1) {
                int i19 = this.N6;
                if (!gjVar.P3()) {
                    f16 = 17.0f;
                }
                this.f31145s3 = org.telegram.messenger.g0.L(f16) + i19 + this.f31130r3;
                int i20 = this.f31181v0 - this.f31170u3;
                if (this.J) {
                    f15 = 9.0f;
                }
                int L2 = ((i20 - org.telegram.messenger.g0.L(f15)) - this.W1) - org.telegram.messenger.g0.L(17.0f);
                if (this.f31216x7 && this.F8 != 3) {
                    i16 = getCommentButtonHeight();
                } else {
                    i16 = 0;
                }
                L = L2 - i16;
                this.f31157t3 = org.telegram.messenger.g0.T1(L, org.telegram.messenger.g0.L(9.0f) + this.Ua, Y2());
            } else {
                if (this.f31232yb) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.Q5.P3()) {
                        i15 = 0;
                    } else {
                        i15 = 6;
                    }
                    this.f31145s3 = org.telegram.messenger.g0.L(i15 + 11) + backgroundDrawableLeft;
                } else {
                    int i21 = this.N6;
                    if (!gjVar.P3() && !this.C6 && !this.K) {
                        f16 = 17.0f;
                    }
                    this.f31145s3 = org.telegram.messenger.g0.L(f16) + i21 + this.f31130r3;
                }
                int i22 = this.f31181v0 - this.f31170u3;
                if (this.J) {
                    f15 = 9.0f;
                }
                int L3 = i22 - org.telegram.messenger.g0.L(f15);
                if (this.f31216x7 && this.F8 != 3) {
                    i13 = getCommentButtonHeight();
                } else {
                    i13 = 0;
                }
                int i23 = L3 - i13;
                ch.q0 q0Var = this.O;
                if (!q0Var.f5204p) {
                    i14 = q0Var.f5202n;
                } else {
                    i14 = 0;
                }
                L = i23 - i14;
                this.f31157t3 = org.telegram.messenger.g0.T1(L, org.telegram.messenger.g0.L(9.0f) + this.Ua, Y2());
            }
        } else {
            if (x1Var.f31943g0) {
                f11 = x1Var.f31974n0;
                f12 = x1Var.f31977o0;
                f10 = x1Var.f31985q0;
            } else {
                fi.u2 u2Var = this.U0;
                float f17 = u2Var.L0;
                float f18 = u2Var.M0;
                f10 = u2Var.O0;
                f11 = f17;
                f12 = f18;
            }
            this.f31145s3 = f11 + org.telegram.messenger.g0.L(5.0f) + this.f31130r3;
            if (u2()) {
                float compactLeft = getCompactLeft() - getExtraTextX();
                if (t2()) {
                    f13 = this.f31153sd;
                } else if (this.L != null && this.M != null) {
                    f13 = getLeft();
                } else {
                    f13 = 0.0f;
                }
                this.f31145s3 = compactLeft - f13;
            }
            L = f12 + f10 + org.telegram.messenger.g0.L(6.0f);
            float L4 = f10 + org.telegram.messenger.g0.L(6.0f);
            ej ejVar = this.f31062m3;
            if (ejVar == null) {
                i7 = 0;
            } else {
                i7 = -ejVar.b();
            }
            this.f31157t3 = org.telegram.messenger.g0.T1(L4, i7 - org.telegram.messenger.g0.L(4.0f), Y2()) + f12;
            z10 = false;
        }
        this.f31145s3 += getExtraTextX();
        gj gjVar2 = this.Q5;
        if (gjVar2 != null && (i10 = gjVar2.D) != 0 && i10 != 24 && !gjVar2.v3() && !this.Q5.r4()) {
            if (z10 && g2()) {
                this.f31157t3 -= (1.0f - Y2()) * (org.telegram.messenger.g0.L(16.0f) + this.f31142s0.f31401r);
            }
            if (z10) {
                s1 s1Var = this.f31142s0;
                if (s1Var != null) {
                    i12 = s1Var.f31401r;
                } else {
                    i12 = 0;
                }
                i11 = org.telegram.messenger.g0.L(14.0f) + i12;
            } else {
                i11 = 0;
            }
            float f19 = L - i11;
            ej ejVar2 = this.f31062m3;
            if (ejVar2 != null) {
                i18 = org.telegram.messenger.g0.L(4.0f) + ejVar2.c(x1Var);
            }
            this.f31127r0 = (int) ((f19 + org.telegram.messenger.g0.W1(Y2(), i18, org.telegram.messenger.g0.L(6.0f))) - x1Var.f31961k0);
        }
        gj gjVar3 = this.Q5;
        if (gjVar3 != null && gjVar3.D == 17) {
            float f20 = this.f31157t3;
            w1 w1Var = this.f31211x2;
            if (w1Var != null) {
                f14 = w1Var.f31865q;
            }
            this.f31157t3 = f20 + f14;
        }
    }

    public final void R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.R():void");
    }

    public final void R0(android.graphics.Canvas r35, org.telegram.messenger.ej r36, boolean r37, boolean r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.R0(android.graphics.Canvas, org.telegram.messenger.ej, boolean, boolean, float):void");
    }

    public final String R1(long j3) {
        TLRPC.Chat M0;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f30908a6;
        if (i7 > 0) {
            TLRPC.User a22 = np.s1(i10).a2(Long.valueOf(j3));
            if (a22 != null) {
                return q10.p(a22);
            }
            return null;
        } else if (i7 < 0 && (M0 = np.s1(i10).M0(Long.valueOf(-j3))) != null) {
            return M0.title;
        } else {
            return null;
        }
    }

    public final void R2(int i7, int i10) {
        yi yiVar = this.M;
        float f10 = yiVar.f27759r;
        float f11 = yiVar.f27761t;
        this.f31140rd = f10 - f11;
        this.f31153sd = f11;
        this.f31166td = (int) yiVar.f27760s;
        this.f31180ud = (int) ((i7 * yiVar.f27762u) / (i10 / 1000.0f));
    }

    public final void R3() {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        if (this.Q5 != null) {
            int i7 = this.f30908a6;
            np s12 = np.s1(i7);
            TLRPC.MessageFwdHeader messageFwdHeader = this.Q5.f23817k.fwd_from;
            long e10 = m10.i(i7).e();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (gj.B0(this.Q5.f23817k) == e10 || gj.B0(this.Q5.f23817k) == 1271266957)) {
                this.f31044ka = np.s1(i7).M0(Long.valueOf(messageFwdHeader.from_id.channel_id));
            } else if (messageFwdHeader != null && gj.B0(this.Q5.f23817k) == 489000) {
                long o4 = org.telegram.messenger.m5.o(messageFwdHeader.from_id);
                if (o4 >= 0) {
                    this.f31030ja = s12.a2(Long.valueOf(o4));
                } else {
                    this.f31044ka = s12.M0(Long.valueOf(-o4));
                }
            } else if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
                long j3 = peer.user_id;
                if (j3 != 0) {
                    if (!this.f31001h6) {
                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                        if (peer2 instanceof TLRPC.TL_peerUser) {
                            this.f31030ja = s12.a2(Long.valueOf(peer2.user_id));
                            return;
                        }
                    }
                    this.f31030ja = s12.a2(Long.valueOf(j3));
                } else if (peer.channel_id != 0) {
                    if (this.Q5.k4()) {
                        TLRPC.Peer peer3 = messageFwdHeader.from_id;
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            this.f31030ja = s12.a2(Long.valueOf(peer3.user_id));
                            return;
                        }
                    }
                    this.f31044ka = s12.M0(Long.valueOf(messageFwdHeader.saved_from_peer.channel_id));
                } else {
                    long j10 = peer.chat_id;
                    if (j10 != 0) {
                        TLRPC.Peer peer4 = messageFwdHeader.from_id;
                        if (peer4 instanceof TLRPC.TL_peerUser) {
                            this.f31030ja = s12.a2(Long.valueOf(peer4.user_id));
                        } else {
                            this.f31044ka = s12.M0(Long.valueOf(j10));
                        }
                    }
                }
            } else if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || gj.B0(this.Q5.f23817k) == e10)) {
                this.f31030ja = s12.a2(Long.valueOf(messageFwdHeader.from_id.user_id));
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || gj.B0(this.Q5.f23817k) == e10)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.f31030ja = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || gj.B0(this.Q5.f23817k) == e10)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.f31030ja = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long B0 = gj.B0(this.Q5.f23817k);
                long Z0 = this.Q5.Z0();
                TLRPC.Chat chat2 = null;
                if (org.telegram.messenger.m5.z(Z0)) {
                    chat = s12.M0(Long.valueOf(-Z0));
                } else {
                    chat = null;
                }
                if (org.telegram.messenger.m5.z(B0)) {
                    chat2 = s12.M0(Long.valueOf(-B0));
                }
                if (org.telegram.messenger.m5.C(gj.B0(this.Q5.f23817k))) {
                    if (this.Q5.P3()) {
                        this.f31030ja = m10.i(i7).f();
                        return;
                    }
                    TLRPC.EncryptedChat a12 = s12.a1(Integer.valueOf((int) (gj.B0(this.Q5.f23817k) & 4294967295L)));
                    if (a12 != null) {
                        this.f31030ja = s12.a2(Long.valueOf(a12.user_id));
                    }
                } else if (org.telegram.messenger.m5.E(Z0) && (!this.Q5.f23817k.post || (chat != null && chat.signature_profiles))) {
                    this.f31030ja = s12.a2(Long.valueOf(Z0));
                } else if (this.Q5.f23817k.post && chat2 != null && !chat2.signature_profiles) {
                    this.f31044ka = chat2;
                } else if (org.telegram.messenger.m5.z(Z0)) {
                    this.f31044ka = chat;
                } else {
                    TLRPC.Message message = this.Q5.f23817k;
                    if (message.post) {
                        this.f31044ka = s12.M0(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    public final boolean S(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.S(android.view.MotionEvent):boolean");
    }

    public final void S0(Canvas canvas) {
        gj gjVar;
        float f10;
        gj gjVar2 = this.Q5;
        if ((gjVar2 == null || !gjVar2.r4()) && (gjVar = this.Q5) != null && !gjVar.o4()) {
            gj gjVar3 = this.Q5;
            if (gjVar3.D != 27 && !gjVar3.n4() && this.f31060m1 != null) {
                if (this.n1 || this.f31086o1) {
                    yi yiVar = this.M;
                    if (yiVar != null) {
                        int i7 = yiVar.f27753l;
                        if ((i7 & 8) == 0 || (i7 & 1) == 0) {
                            return;
                        }
                    }
                    canvas.save();
                    float y10 = getY() + getPaddingTop();
                    bj bjVar = this.L;
                    if (bjVar != null && bjVar.d.size() > 1) {
                        f10 = (getTop() + this.L.f22717m.f22520f) - getTranslationY();
                    } else {
                        f10 = y10 + this.f31018ib.f31961k0;
                    }
                    canvas.translate(this.f30909a7 - getCompactSideMenuShift(), f10 + this.Ic);
                    this.f31060m1.a(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final float S1(boolean z10) {
        boolean z11;
        er erVar;
        float f10 = this.f31033jd;
        gj gjVar = this.Q5;
        if (gjVar != null && !gjVar.P3()) {
            int i7 = 0;
            if (z10 && ((z11 = this.n1) || this.f31086o1)) {
                if (z11) {
                    erVar = er.f34421g;
                } else {
                    erVar = er.f34422i;
                }
                this.f31128r1 = (int) Math.ceil(erVar.getInterpolation(this.f31099p1) * org.telegram.messenger.g0.L(35.0f));
                if (this.Q5.D == 36) {
                    if (org.telegram.messenger.g0.L(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                        this.f31128r1 = 0;
                    }
                }
            }
            f10 += this.f31128r1;
            if (u2()) {
                return f10 + getCompactSideMenuShift();
            }
            if (this.X6 && this.M != null) {
                if (Z2()) {
                    i7 = 48;
                }
                return (org.telegram.messenger.g0.L(71 - i7) * this.Z6) + f10;
            }
        }
        return f10;
    }

    public final int S2(int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.S2(int):int");
    }

    public final void S3() {
        Window window;
        if (this.f31082nb == null) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W == null) {
                window = null;
            } else {
                window = W.getWindow();
            }
            if (window != null) {
                org.telegram.messenger.n6 n6Var = new org.telegram.messenger.n6(window, new ca(this, 3));
                this.f31082nb = n6Var;
                if (this.O0) {
                    n6Var.a();
                }
            }
        }
        org.telegram.messenger.n6 n6Var2 = this.f31082nb;
        if (n6Var2 != null) {
            n6Var2.g();
        }
    }

    public final boolean T(MotionEvent motionEvent) {
        boolean z10;
        int i7;
        int i10;
        boolean z11;
        int i11;
        gj gjVar;
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
        gj gjVar2;
        int i18 = this.Q5.D;
        if ((i18 == 0 || i18 == 24) && this.R1) {
            t1 E1 = E1();
            q1 q1Var = E1.f31520a;
            gj gjVar3 = q1Var.Q5;
            RadialProgress2 radialProgress2 = q1Var.Q0;
            n2.o0 o0Var = q1Var.f31171u4;
            fi.u2 u2Var = q1Var.U0;
            int[] iArr = q1Var.N2;
            Drawable[] drawableArr = q1Var.J2;
            int i19 = gjVar3.D;
            if ((i19 == 0 || i19 == 24) && q1Var.R1) {
                int x10 = (int) motionEvent.getX();
                int N1 = (int) q1Var.N1(motionEvent);
                int i20 = q1Var.f31098p0;
                if (x10 >= i20 && x10 <= (i20 + q1Var.f30923b7) - org.telegram.messenger.g0.L(14.0f) && N1 >= (i7 = q1Var.f31112q0)) {
                    int i21 = i7 + q1Var.W1;
                    if (q1Var.f31169u2) {
                        i10 = 46;
                    } else {
                        i10 = 0;
                    }
                    if (N1 <= org.telegram.messenger.g0.L(i10 + 8) + i21) {
                        if (motionEvent.getAction() == 0) {
                            if (q1Var.f31100p2 != null && N1 >= q1Var.Y1 && !q1Var.Q5.f23854t1) {
                                try {
                                    int L3 = x10 - ((q1Var.f31098p0 + org.telegram.messenger.g0.L(10.0f)) + q1Var.f30904a2);
                                    int i22 = N1 - q1Var.Y1;
                                    if (i22 <= q1Var.f31100p2.getHeight()) {
                                        int lineForVertical = q1Var.f31100p2.getLineForVertical(i22);
                                        float f10 = L3;
                                        int offsetForHorizontal = q1Var.f31100p2.getOffsetForHorizontal(lineForVertical, f10);
                                        float lineLeft = q1Var.f31100p2.getLineLeft(lineForVertical);
                                        if (lineLeft <= f10 && lineLeft + q1Var.f31100p2.getLineWidth(lineForVertical) >= f10) {
                                            if (q1Var.Q5.r4()) {
                                                charSequence = q1Var.Q5.v;
                                            } else {
                                                charSequence = q1Var.Q5.f23871y;
                                            }
                                            Spannable spannable = (Spannable) charSequence;
                                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                            if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[0] instanceof c41) || c41.h) && !org.telegram.messenger.g0.C1())) {
                                                a80 a80Var = q1Var.f31131r4;
                                                if (a80Var == null || a80Var.f32922i != clickableSpanArr[0]) {
                                                    o0Var.n(a80Var, true);
                                                    a80 a80Var2 = new a80(clickableSpanArr[0], q1Var.Qb, x10, N1, 0);
                                                    q1Var.f31131r4 = a80Var2;
                                                    if (q1Var.R1 && q1Var.f31092o8 != null && (gjVar2 = q1Var.Q5) != null && !gjVar2.P3()) {
                                                        w02 = org.telegram.ui.ActionBar.j6.r1(0.1f, q1Var.f31092o8.i());
                                                    } else {
                                                        if (q1Var.Q5.P3()) {
                                                            i17 = org.telegram.ui.ActionBar.j6.Dc;
                                                        } else {
                                                            i17 = org.telegram.ui.ActionBar.j6.Ce;
                                                        }
                                                        w02 = org.telegram.ui.ActionBar.j6.w0(i17, q1Var.Qb);
                                                    }
                                                    a80Var2.d(w02);
                                                    q1Var.f31222y0 = -10;
                                                    q1Var.f31185v4 = 2;
                                                    q1Var.u();
                                                    try {
                                                        u70 b10 = q1Var.f31131r4.b();
                                                        int[] X1 = X1(spannable, q1Var.f31131r4.f32922i);
                                                        b10.d(q1Var.f31100p2, X1[0], 0.0f);
                                                        q1Var.f31100p2.getSelectionPath(X1[0], X1[1], b10);
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                    }
                                                    o0Var.b(q1Var.f31131r4, 2);
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
                            if (q1Var.f31131r4 == null) {
                                int L4 = org.telegram.messenger.g0.L(48.0f);
                                if (q1Var.X3 >= 0 && x10 >= (L2 = q1Var.K3 + (L = org.telegram.messenger.g0.L(27.0f))) && x10 <= L2 + L4 && N1 >= (i16 = q1Var.L3 + L) && N1 <= i16 + L4) {
                                    q1Var.R3 = 1;
                                    q1Var.invalidate();
                                    return true;
                                }
                                if (q1Var.f31235z1 && q1Var.O3 != -1 && x10 >= (i14 = q1Var.M3)) {
                                    if (x10 <= Math.max(q1Var.C3, q1Var.f30972f3) + org.telegram.messenger.g0.L(34.0f) + i14 && N1 >= (i15 = q1Var.N3) && N1 <= org.telegram.messenger.g0.L(30.0f) + i15) {
                                        q1Var.Q3 = 1;
                                        q1Var.invalidate();
                                        return true;
                                    }
                                }
                                if ((q1Var.O1 && q1Var.Q5.f23773a1 != null && u2Var.O(x10, N1)) || (q1Var.O1 && q1Var.f31223y1 && ((q1Var.O3 != -1 || q1Var.M1 == 4) && ((!q1Var.J3 && u2Var.O(x10, N1)) || (x10 >= (i12 = q1Var.K3) && x10 <= org.telegram.messenger.g0.L(48.0f) + i12 && N1 >= (i13 = q1Var.L3) && N1 <= org.telegram.messenger.g0.L(48.0f) + i13 && radialProgress2.f32661i.f39230q != 4))))) {
                                    q1Var.P3 = 1;
                                    q1Var.invalidate();
                                    TLRPC.MessageMedia messageMedia = q1Var.Q5.f23773a1;
                                    if (messageMedia == null) {
                                        return true;
                                    }
                                    if (!gj.s3(messageMedia.document, false) && q1Var.Q5.f23773a1.photo == null) {
                                        return true;
                                    }
                                    Drawable drawable = drawableArr[0];
                                    if (drawable != null && drawable.getBounds().contains(x10, N1)) {
                                        drawableArr[0].setHotspot(x10, N1);
                                        drawableArr[0].setState(iArr);
                                    }
                                    y yVar = E1.f31540x;
                                    if (yVar != null && yVar.getBounds().contains(x10, N1)) {
                                        E1.f31540x.setHotspot(x10, N1);
                                        E1.f31540x.setState(iArr);
                                    }
                                    q1Var.setInstantButtonPressed(true);
                                    dc dcVar = E1.f31539w;
                                    if (dcVar == null) {
                                        return true;
                                    }
                                    dcVar.c(true);
                                    return true;
                                }
                                q1Var.F2 = true;
                                q1Var.L2[0] = 0;
                                Drawable drawable2 = drawableArr[0];
                                if (drawable2 != null && drawable2.getBounds().contains(x10, N1)) {
                                    drawableArr[0].setHotspot(x10, N1);
                                    drawableArr[0].setState(iArr);
                                }
                                y yVar2 = E1.f31540x;
                                if (yVar2 != null && yVar2.getBounds().contains(x10, N1)) {
                                    E1.f31540x.setHotspot(x10, N1);
                                    E1.f31540x.setState(iArr);
                                }
                                q1Var.setInstantButtonPressed(true);
                                dc dcVar2 = E1.f31539w;
                                if (dcVar2 != null) {
                                    dcVar2.c(true);
                                }
                                q1Var.invalidate();
                                return true;
                            }
                        } else {
                            if (motionEvent.getAction() == 1) {
                                if (q1Var.F2) {
                                    int i23 = q1Var.M1;
                                    if (i23 == 7) {
                                        if (MediaController.B().I(q1Var.Q5) && !MediaController.B().H()) {
                                            MediaController.B().R(q1Var.Q5, true);
                                        } else {
                                            q1Var.Sa.T1(q1Var, q1Var.Q5);
                                        }
                                    } else if (!q1Var.f31169u2 && ((gjVar = q1Var.Q5) == null || (tL_channelAdminLogEvent = gjVar.L1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage))) {
                                        if (q1Var.O1 && (i23 == 2 || i23 == 4 || (E1.f31526i == null && q1Var.f31087o2 == null && q1Var.f31100p2 == null && q1Var.f30983g2 == null))) {
                                            l1 l1Var = q1Var.Sa;
                                            if (l1Var != null) {
                                                l1Var.w0(q1Var, q1Var.f30996h1, q1Var.f31009i1, true);
                                            }
                                        } else if (gjVar != null && !gjVar.f23854t1) {
                                            TLRPC.WebPage webPage = gj.n1(gjVar.f23817k).webpage;
                                            if (webPage != null && !TextUtils.isEmpty(webPage.embed_url)) {
                                                l1 l1Var2 = q1Var.Sa;
                                                if (l1Var2 != null) {
                                                    l1Var2.S1(q1Var.Q5, webPage.embed_url, webPage.site_name, webPage.title, webPage.url, webPage.embed_width, webPage.embed_height);
                                                }
                                            } else if (webPage != null) {
                                                l1 l1Var3 = q1Var.Sa;
                                                if (l1Var3 != null) {
                                                    l1Var3.Q1(q1Var, webPage, webPage.url, gj.n1(q1Var.Q5.f23817k).safe);
                                                } else {
                                                    vf.c.t(q1Var.getContext(), webPage.url);
                                                }
                                            }
                                        }
                                    } else {
                                        l1 l1Var4 = q1Var.Sa;
                                        if (l1Var4 != null) {
                                            l1Var4.p1(q1Var, q1Var.f31224y2);
                                        }
                                    }
                                    q1Var.playSoundEffect(0);
                                    Drawable drawable3 = drawableArr[0];
                                    if (drawable3 != null) {
                                        drawable3.setState(StateSet.NOTHING);
                                    }
                                    y yVar3 = E1.f31540x;
                                    if (yVar3 != null) {
                                        yVar3.setState(StateSet.NOTHING);
                                    }
                                    dc dcVar3 = E1.f31539w;
                                    if (dcVar3 != null) {
                                        dcVar3.c(false);
                                    }
                                    q1Var.F2 = false;
                                    q1Var.setInstantButtonPressed(false);
                                    q1Var.invalidate();
                                } else if (q1Var.f31185v4 != 2 && q1Var.P3 == 0 && q1Var.R3 == 0 && q1Var.Q3 == 0) {
                                    if (!q1Var.Bc) {
                                        z11 = false;
                                        q1Var.Bc = false;
                                        q1Var.g3(2);
                                        z10 = z11;
                                    }
                                } else {
                                    z11 = false;
                                    if (q1Var.Q3 == 1) {
                                        q1Var.Q3 = 0;
                                        q1Var.playSoundEffect(0);
                                        q1Var.E0(true);
                                        q1Var.invalidate();
                                    } else if (q1Var.P3 != 0) {
                                        q1Var.P3 = 0;
                                        q1Var.playSoundEffect(0);
                                        if (q1Var.f31235z1 || ((q1Var.O3 == -1 && q1Var.M1 == 4) || q1Var.Q5.f23773a1 != null)) {
                                            z11 = false;
                                            q1Var.D0();
                                        } else {
                                            z11 = false;
                                            q1Var.E0(false);
                                        }
                                        q1Var.invalidate();
                                    } else if (q1Var.R3 != 0) {
                                        q1Var.R3 = 0;
                                        q1Var.playSoundEffect(0);
                                        q1Var.F0();
                                        q1Var.invalidate();
                                    } else {
                                        a80 a80Var3 = q1Var.f31131r4;
                                        if (a80Var3 != null) {
                                            CharacterStyle characterStyle = a80Var3.f32922i;
                                            if (characterStyle instanceof URLSpan) {
                                                q1Var.Sa.T0(q1Var, characterStyle, false);
                                            } else if (characterStyle instanceof ClickableSpan) {
                                                ((ClickableSpan) characterStyle).onClick(q1Var);
                                            }
                                            q1Var.g3(2);
                                        } else {
                                            org.telegram.ui.Components.p5 p5Var = q1Var.f31116q4;
                                            if (p5Var != null && q1Var.Sa.o0(p5Var)) {
                                                q1Var.f31116q4 = null;
                                                q1Var.g3(2);
                                            } else {
                                                if (q1Var.M1 == 2 && q1Var.f31223y1) {
                                                    int i24 = q1Var.O3;
                                                    if (i24 == -1) {
                                                        int i25 = gz.f23929a;
                                                        if (qc.e(2048) && !q1Var.Q5.f23816j2) {
                                                            q1Var.Sa.w0(q1Var, q1Var.f30996h1, q1Var.f31009i1, false);
                                                        } else {
                                                            i11 = 2;
                                                            q1Var.O3 = 2;
                                                            q1Var.Q5.f23804h0 = 1.0f;
                                                            u2Var.f22301u0 = false;
                                                            u2Var.Q0();
                                                            radialProgress2.setIcon(q1Var.getIconForCurrentState(), false, true);
                                                            q1Var.invalidate();
                                                            q1Var.playSoundEffect(0);
                                                            q1Var.g3(i11);
                                                            return true;
                                                        }
                                                    } else if (i24 == 2 || i24 == 0) {
                                                        q1Var.E0(false);
                                                        q1Var.playSoundEffect(0);
                                                    }
                                                } else {
                                                    gj gjVar4 = q1Var.Q5;
                                                    if (!gjVar4.f23854t1) {
                                                        TLRPC.WebPage webPage2 = gj.n1(gjVar4.f23817k).webpage;
                                                        if (webPage2 != null && !TextUtils.isEmpty(webPage2.embed_url)) {
                                                            q1Var.Sa.S1(q1Var.Q5, webPage2.embed_url, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_width, webPage2.embed_height);
                                                        } else {
                                                            int i26 = q1Var.O3;
                                                            if (i26 != -1 && i26 != 3) {
                                                                if (webPage2 != null) {
                                                                    l1 l1Var5 = q1Var.Sa;
                                                                    if (l1Var5 != null) {
                                                                        l1Var5.Q1(q1Var, webPage2, webPage2.url, gj.n1(q1Var.Q5.f23817k).safe);
                                                                    } else {
                                                                        vf.c.t(q1Var.getContext(), webPage2.url);
                                                                    }
                                                                }
                                                            } else {
                                                                q1Var.Sa.w0(q1Var, q1Var.f30996h1, q1Var.f31009i1, false);
                                                                q1Var.playSoundEffect(0);
                                                            }
                                                        }
                                                    }
                                                }
                                                i11 = 2;
                                                q1Var.g3(i11);
                                                return true;
                                            }
                                        }
                                    }
                                    z10 = z11;
                                }
                            } else {
                                z10 = false;
                                if (motionEvent.getAction() == 2 && q1Var.G2) {
                                    Drawable drawable4 = drawableArr[0];
                                    if (drawable4 != null) {
                                        drawable4.setHotspot(x10, N1);
                                    }
                                    y yVar4 = E1.f31540x;
                                    if (yVar4 != null) {
                                        yVar4.setHotspot(x10, N1);
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

    public final void T0(Canvas canvas, boolean z10, boolean z11, float f10, float f11, float f12, float f13, float f14, boolean z12) {
        boolean z13;
        float L;
        int i7;
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
        x1 x1Var = this.f31018ib;
        ch.q0 q0Var = this.O;
        if (z10) {
            if (!this.Q5.P3()) {
                ya0 ya0Var = org.telegram.ui.ActionBar.j6.E3;
                if (G3()) {
                    w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28984kd, this.Qb);
                } else {
                    if (z12) {
                        i7 = org.telegram.ui.ActionBar.j6.Fb;
                    } else {
                        i7 = org.telegram.ui.ActionBar.j6.f28984kd;
                    }
                    w02 = org.telegram.ui.ActionBar.j6.w0(i7, this.Qb);
                }
                ya0Var.a(w02);
                if (G3()) {
                    f16 = (getPhotoBottom() + this.f31196w0) - org.telegram.messenger.g0.L(9.0f);
                } else {
                    if (!this.G && !this.F) {
                        f15 = 8.5f;
                    } else {
                        f15 = 9.5f;
                    }
                    float L2 = (f10 - org.telegram.messenger.g0.L(f15)) + f12;
                    if (this.f31232yb && !u2()) {
                        if (this.K) {
                            f17 = 4.0f;
                        } else {
                            f17 = 5.0f;
                        }
                        f16 = L2 - ((1.0f - getVideoTranscriptionProgress()) * (q0Var.i(x1Var.L1) + org.telegram.messenger.g0.L(f17)));
                    } else {
                        f16 = L2;
                    }
                }
                if (!this.Q5.f23846r1) {
                    i10 = org.telegram.messenger.g0.L(11.0f);
                }
                z.t(ya0Var, f13 + i10, f16 - org.telegram.messenger.g0.L(12.0f));
                ya0Var.setAlpha((int) (f19 * 255.0f));
                if (z13) {
                    canvas.save();
                    canvas.scale(f18, f18, ya0Var.getBounds().centerX(), ya0Var.getBounds().centerY());
                }
                ya0Var.draw(canvas);
                ya0Var.setAlpha(255);
                invalidate();
                if (z13) {
                    canvas.restore();
                }
            }
        } else if (z11 && !this.Q5.P3()) {
            if (!this.Q5.f23846r1) {
                i10 = org.telegram.messenger.g0.L(11.0f);
            }
            float f20 = f13 + i10;
            float f21 = 21.5f;
            if (G3()) {
                L = (getPhotoBottom() + this.f31196w0) - org.telegram.messenger.g0.L(21.5f);
            } else {
                if (!this.G && !this.F) {
                    f21 = 20.5f;
                }
                L = (f10 - org.telegram.messenger.g0.L(f21)) + f12;
                if (this.f31232yb) {
                    L -= (1.0f - getVideoTranscriptionProgress()) * q0Var.i(x1Var.L1);
                }
            }
            RectF rectF = this.f30933c4;
            rectF.set(f20, L, org.telegram.messenger.g0.L(14.0f) + f20, org.telegram.messenger.g0.L(14.0f) + L);
            int alpha = org.telegram.ui.ActionBar.j6.f28808b2.getAlpha();
            int i11 = (int) (f19 * 255.0f);
            org.telegram.ui.ActionBar.j6.f28808b2.setAlpha(i11);
            if (z13) {
                canvas.save();
                canvas.scale(f18, f18, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.j6.f28808b2);
            org.telegram.ui.ActionBar.j6.f28808b2.setAlpha(alpha);
            Drawable Z1 = Z1("drawableMsgError");
            z.t(Z1, f20 + org.telegram.messenger.g0.L(6.0f), L + org.telegram.messenger.g0.L(2.0f));
            Z1.setAlpha(i11);
            Z1.draw(canvas);
            Z1.setAlpha(255);
            if (z13) {
                canvas.restore();
            }
        }
    }

    public final ImageReceiver T1(int i7) {
        TLRPC.PollAnswer pollAnswer;
        sh.e eVar;
        sh.e eVar2;
        gj gjVar = this.Q5;
        if (gjVar != null && gjVar.D == 17) {
            if (i7 == -2) {
                w1 w1Var = this.f31211x2;
                if (w1Var != null && (eVar2 = w1Var.f31861m) != null) {
                    return eVar2.f56861b;
                }
                return null;
            } else if (i7 == -3) {
                w1 w1Var2 = this.f31211x2;
                if (w1Var2 != null && (eVar = w1Var2.f31862n) != null) {
                    return eVar.f56861b;
                }
                return null;
            } else {
                ArrayList arrayList = this.Q4;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        p1 p1Var = (p1) obj;
                        uh.b bVar = p1Var.f30858x;
                        if (bVar != null && (pollAnswer = p1Var.f30854s) != null && pollAnswer.unshuffled_index == i7) {
                            return bVar.f58410c;
                        }
                    }
                }
            }
        }
        l4 l4Var = this.X5;
        if (l4Var != null) {
            ArrayList arrayList2 = l4Var.f30611c;
            j4 j4Var = l4Var.f30610b;
            if (j4Var != null && i7 >= 0 && i7 < j4Var.f30484a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) l4Var.f30610b.f30484a.get(i7);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (((k4) arrayList2.get(i11)).F == messageExtendedMedia) {
                        return ((k4) arrayList2.get(i11)).f30559f;
                    }
                }
                return null;
            }
            return null;
        }
        return this.U0;
    }

    public final void T2(boolean z10) {
        int currentBackgroundLeft;
        float f10;
        int L;
        int i7;
        float f11;
        int L2;
        int currentBackgroundLeft2;
        boolean P3 = this.Q5.P3();
        int i10 = 0;
        x1 x1Var = this.f31018ib;
        if (P3) {
            if (z10) {
                currentBackgroundLeft2 = (int) (this.N6 + x1Var.f31947h0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            this.f31085o0 = getExtraTextX() + org.telegram.messenger.g0.L(11.0f) + currentBackgroundLeft2;
        } else {
            if (z10) {
                currentBackgroundLeft = (int) (this.N6 + x1Var.f31947h0);
            } else {
                currentBackgroundLeft = getCurrentBackgroundLeft();
            }
            if (this.Q5.D == 19) {
                L = 0;
            } else {
                if (!this.C6 && this.K) {
                    f10 = 11.0f;
                } else {
                    f10 = 17.0f;
                }
                L = org.telegram.messenger.g0.L(f10);
            }
            this.f31085o0 = getExtraTextX() + currentBackgroundLeft + L;
        }
        float f12 = 4.0f;
        if (this.T1) {
            this.f31085o0 = org.telegram.messenger.g0.L(11.0f) + this.f31085o0;
            int L3 = org.telegram.messenger.g0.L(14.0f) + this.Ua;
            this.f31167u0 = L3;
            StaticLayout staticLayout = this.f30983g2;
            if (staticLayout != null) {
                this.f31167u0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + L3;
            }
        } else if (this.U1) {
            int L4 = org.telegram.messenger.g0.L(14.0f) + this.Ua;
            this.f31167u0 = L4;
            StaticLayout staticLayout2 = this.f30983g2;
            if (staticLayout2 != null) {
                this.f31167u0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L4;
            }
        } else if (this.Q5.D == 19) {
            this.f31167u0 = org.telegram.messenger.g0.L(6.0f) + this.Ua;
            if (!this.Q5.N3()) {
                this.f31085o0 = getCurrentBackgroundLeft();
            } else {
                this.f31085o0 -= org.telegram.messenger.g0.L(4.0f);
            }
        } else {
            int L5 = org.telegram.messenger.g0.L(8.0f) + this.Ua;
            this.f31167u0 = L5;
            gj gjVar = this.Q5;
            float f13 = 2.0f;
            if (gjVar.D == 36) {
                if (this.f31197w1 && this.f31062m3 != null && P2()) {
                    this.f31167u0 = org.telegram.messenger.k5.C(7.0f, this.f31062m3.b(), this.f31167u0);
                } else {
                    iv ivVar = this.Q5.f23874y2;
                    if (ivVar != null && ivVar.Y()) {
                        int i11 = this.f31167u0;
                        if (this.Ua <= 0) {
                            f13 = -3.0f;
                        }
                        this.f31167u0 = org.telegram.messenger.g0.L(f13) + i11;
                    }
                }
            } else {
                if (gjVar.E2 && (i7 = gz.Y0) > 10) {
                    if (i7 < 15) {
                        f13 = 1.0f;
                    }
                    this.f31167u0 = org.telegram.messenger.g0.L(f13) + L5;
                }
                if (this.Q5.E2 && this.Ua > 0) {
                    this.f31167u0 = org.telegram.messenger.g0.L(5.0f) + this.f31167u0;
                }
            }
        }
        if (this.Q5.r4()) {
            this.f31112q0 = org.telegram.messenger.g0.L(14.0f) + this.f31167u0;
        } else if (this.f31182v1) {
            this.f31112q0 = org.telegram.messenger.g0.L(10.0f) + this.f31167u0;
            this.f31167u0 = org.telegram.messenger.k5.C(13.0f, this.W1, this.f31167u0);
            if (this.f31169u2 && !this.U1 && !this.Q5.v3()) {
                this.f31167u0 = org.telegram.messenger.g0.L(44.0f) + this.f31167u0;
            }
        } else {
            this.f31112q0 = org.telegram.messenger.g0.L(10.0f) + this.Q5.W5(x1Var) + this.f31167u0;
        }
        if (this.f31182v1) {
            L2 = org.telegram.messenger.g0.L(10.0f) + this.Q5.W5(x1Var) + this.f31167u0;
        } else {
            int i12 = this.f31112q0 + this.W1;
            if (this.f31169u2) {
                f11 = 46.0f;
            } else {
                f11 = 0.0f;
            }
            int L6 = org.telegram.messenger.g0.L(f11) + i12;
            if (this.W1 <= 0) {
                f12 = -8.0f;
            }
            L2 = org.telegram.messenger.g0.L(f12) + L6;
        }
        this.f31127r0 = L2;
        this.f31098p0 = this.f31085o0;
        if (this.Q5.f23870x2 != 0.0f && this.Q7 != null) {
            int L7 = this.f30923b7 - org.telegram.messenger.g0.L(31.0f);
            gj gjVar2 = this.Q5;
            int i13 = L7 - gjVar2.f23862v2;
            if (!this.f30936c7) {
                int i14 = this.A9;
                if (gjVar2.P3()) {
                    i10 = 20;
                }
                i13 = i20.w(i10 + 4, i14, i13);
            }
            if (i13 > 0) {
                this.f31085o0 = (i13 - getExtraTimeX()) + this.f31085o0;
            }
        }
    }

    public final void T3() {
        boolean z10;
        String k02;
        double d;
        double d2;
        double d10;
        sh.e eVar;
        sh.e eVar2;
        gj gjVar = this.Q5;
        if (gjVar != null) {
            j1 j1Var = this.Pb;
            if (j1Var != null && j1Var.rewindCount != 0 && j1Var.rewindByBackSeek) {
                gjVar.f23777b0 = j1Var.getVideoProgress();
            }
            boolean z11 = true;
            if (this.Q5.T3()) {
                w1 w1Var = this.f31211x2;
                if (w1Var != null && (eVar2 = w1Var.f31861m) != null) {
                    eVar2.p(true);
                }
                w1 w1Var2 = this.f31211x2;
                if (w1Var2 != null && (eVar = w1Var2.f31862n) != null) {
                    eVar.p(true);
                }
            }
            int i7 = this.M1;
            double d11 = 0.0d;
            int i10 = 0;
            i1 i1Var = this.D4;
            if (i7 == 4) {
                if (i1Var != null) {
                    i1Var.a();
                }
                if (this.f31212x3 != null) {
                    if (!PhotoViewer.I1(this.Q5)) {
                        if (MediaController.B().f22380w0 == this.Q5) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.t5 m10 = this.U0.m();
                if (m10 != null) {
                    gj gjVar2 = this.Q5;
                    int i11 = m10.d[4] / 1000;
                    gjVar2.f23814j0 = i11;
                    d10 = i11;
                    TLRPC.Message message = gjVar2.f23817k;
                    if (message.ttl > 0 && message.destroyTime == 0 && !gjVar2.m5() && gj.L4(this.Q5.f23817k) && m10.s()) {
                        this.Sa.P(this.Q5);
                    }
                } else {
                    d10 = 0.0d;
                }
                if (d10 == 0.0d) {
                    d10 = this.Q5.L0();
                }
                if (MediaController.B().I(this.Q5)) {
                    d10 -= this.Q5.f23777b0 * d10;
                } else if (m10 != null) {
                    if (d10 != 0.0d) {
                        d10 -= m10.o() / 1000;
                    }
                    if (this.Sa != null && m10.o() >= 3000) {
                        this.Sa.A0();
                    }
                }
                if (this.M4 != d10) {
                    String g02 = org.telegram.messenger.g0.g0((int) d10, false, false);
                    this.C3 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText(g02));
                    this.f31212x3 = new StaticLayout(g02, org.telegram.ui.ActionBar.j6.C2, this.C3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.M4 = d10;
                    return;
                }
                return;
            }
            boolean z12 = this.f31232yb;
            tm0 tm0Var = this.E4;
            if (z12) {
                if (this.C4) {
                    if (!tm0Var.f39729f) {
                        tm0Var.g(true, this.Q5.f23777b0);
                    }
                } else {
                    if (!i1Var.f37640e) {
                        i1Var.h(this.Q5.f23777b0);
                        i1Var.f37651q = this.Q5.f23800g0;
                    }
                    i1Var.a();
                }
                TLRPC.Document F0 = this.Q5.F0();
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
                long j3 = this.f31110pc;
                if (j3 >= 0) {
                    d2 = j3;
                } else if (MediaController.B().I(this.Q5)) {
                    d2 = Math.max(0.0d, d2 - this.Q5.f23809i0);
                }
                if (this.M4 != d2) {
                    this.M4 = d2;
                    String g03 = org.telegram.messenger.g0.g0((int) d2, true, false);
                    this.N4 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.T2.measureText(g03));
                    this.L4 = new StaticLayout(g03, org.telegram.ui.ActionBar.j6.T2, this.N4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float f10 = this.Q5.f23777b0;
                if (f10 != 0.0f) {
                    this.Kb = f10;
                    if (f10 > 0.9f) {
                        this.Kb = 1.0f;
                    }
                }
                invalidate();
            } else if (this.N1 != null) {
                if (this.C4) {
                    if (!tm0Var.f39729f) {
                        tm0Var.g(true, this.Q5.f23777b0);
                    }
                    z10 = true;
                } else {
                    if (!i1Var.f37640e) {
                        i1Var.h(this.Q5.f23777b0);
                        i1Var.f37651q = this.Q5.f23800g0;
                    }
                    i1Var.j(this.Q5);
                    z10 = false;
                }
                int i13 = this.M1;
                if (i13 == 5) {
                    z10 = true;
                }
                if (i13 == 3) {
                    long j10 = this.f31110pc;
                    if (j10 >= 0) {
                        d = j10;
                    } else if (!MediaController.B().I(this.Q5)) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= this.N1.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute2 = this.N1.attributes.get(i14);
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                d11 = documentAttribute2.duration;
                                break;
                            }
                            i14++;
                        }
                        d = d11;
                    } else {
                        d = this.Q5.f23809i0;
                    }
                    if (this.M4 != d) {
                        this.M4 = d;
                        String g04 = org.telegram.messenger.g0.g0((int) d, true, false);
                        this.N4 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText(g04));
                        this.L4 = new StaticLayout(g04, org.telegram.ui.ActionBar.j6.N2, this.N4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                } else {
                    double L0 = this.Q5.L0();
                    if (MediaController.B().I(this.Q5)) {
                        i10 = this.Q5.f23809i0;
                    }
                    double d12 = i10;
                    if (this.M4 != d12) {
                        this.M4 = d12;
                        this.L4 = new StaticLayout(org.telegram.messenger.g0.k0(i10, (int) L0), org.telegram.ui.ActionBar.j6.N2, (int) Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText(k02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                    z11 = z10;
                }
                if (z11) {
                    invalidate();
                }
            }
        }
    }

    public final boolean U() {
        return org.telegram.messenger.w7.G(this.f30908a6).k(getFilename());
    }

    public final void U0(Canvas canvas, float f10) {
        int i7;
        if (this.F8 == 3) {
            int L = org.telegram.messenger.g0.L(32.0f);
            if (this.f31078n7 != null) {
                this.S8 -= org.telegram.messenger.g0.L(18.0f);
                L += org.telegram.messenger.g0.L(18.0f);
            }
            float f11 = this.R8;
            float f12 = this.S8 + L;
            RectF rectF = this.f30933c4;
            rectF.set(f11, this.S8, org.telegram.messenger.g0.L(32.0f) + f11, f12);
            x();
            int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            String str = "paintChatActionBackground";
            if (i10 != 0) {
                int alpha = a2("paintChatActionBackground").getAlpha();
                a2("paintChatActionBackground").setAlpha((int) (alpha * f10));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), a2("paintChatActionBackground"));
                a2("paintChatActionBackground").setAlpha(alpha);
            } else {
                float L2 = org.telegram.messenger.g0.L(16.0f);
                float L3 = org.telegram.messenger.g0.L(16.0f);
                if (this.I8) {
                    str = "paintChatActionBackgroundSelected";
                }
                canvas.drawRoundRect(rectF, L2, L3, a2(str));
            }
            if (h2()) {
                if (i10 != 0) {
                    int alpha2 = org.telegram.ui.ActionBar.j6.f28919h2.getAlpha();
                    org.telegram.ui.ActionBar.j6.f28919h2.setAlpha((int) (alpha2 * f10));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.j6.f28919h2);
                    org.telegram.ui.ActionBar.j6.f28919h2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.j6.f28919h2);
                }
            }
            Drawable R0 = org.telegram.ui.ActionBar.j6.R0("drawableCommentSticker");
            if (u2()) {
                if (this.Kc == null) {
                    this.Kc = R0.getConstantState().newDrawable().mutate();
                }
                this.Kc.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ta, this.Qb), PorterDuff.Mode.SRC_IN));
                R0 = this.Kc;
            }
            z.t(R0, this.R8 + org.telegram.messenger.g0.L(4.0f), this.S8 + org.telegram.messenger.g0.L(4.0f));
            if (i10 != 0) {
                R0.setAlpha((int) (f10 * 255.0f));
                R0.draw(canvas);
                R0.setAlpha(255);
            } else {
                R0.draw(canvas);
            }
            if (this.f31078n7 != null) {
                TextPaint textPaint = org.telegram.ui.ActionBar.j6.E2;
                if (u2()) {
                    i7 = org.telegram.ui.ActionBar.j6.Ta;
                } else {
                    i7 = org.telegram.ui.ActionBar.j6.Od;
                }
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(i7, this.Qb));
                org.telegram.ui.ActionBar.j6.E2.setAlpha((int) (f10 * 255.0f));
                x1 x1Var = this.f31018ib;
                if (x1Var.V) {
                    if (x1Var.W != null) {
                        canvas.save();
                        org.telegram.ui.ActionBar.j6.E2.setAlpha((int) ((1.0d - x1Var.L1) * 255.0d * f10));
                        canvas.translate(this.R8 + ((org.telegram.messenger.g0.L(32.0f) - x1Var.Y) / 2), this.S8 + org.telegram.messenger.g0.L(30.0f));
                        x1Var.W.draw(canvas);
                        canvas.restore();
                    }
                    org.telegram.ui.ActionBar.j6.E2.setAlpha((int) (x1Var.L1 * 255.0f));
                }
                canvas.save();
                canvas.translate(this.R8 + ((org.telegram.messenger.g0.L(32.0f) - this.f31188v7) / 2), this.S8 + org.telegram.messenger.g0.L(30.0f));
                this.f31078n7.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final float U1(int i7) {
        p1 p1Var;
        if (i7 >= 0) {
            ArrayList arrayList = this.Q4;
            if (i7 < arrayList.size()) {
                int i10 = ((p1) arrayList.get(i7)).f30839b;
                int i11 = this.Ua;
                float f10 = i10 + i11;
                x1 x1Var = this.f31018ib;
                if (x1Var.f32003u2) {
                    float f11 = x1Var.L1;
                    f10 += ((1.0f - f11) * x1Var.f32006v2) + (i11 * f11);
                    if (this.Q5.n5()) {
                        f10 -= this.Ua;
                    }
                }
                if (x1Var.f32012x0) {
                    f10 += x1Var.f31961k0;
                }
                return f10 + p1Var.f30840c + org.telegram.messenger.g0.L(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void U3() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.S0) {
            return;
        }
        boolean z13 = true;
        if ((!this.f31215x6 && !this.f31202w6 && !isPressed()) || (this.O1 && this.U0.I())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && this.P3 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        RadialProgress2 radialProgress2 = this.Q0;
        radialProgress2.o(z11, false);
        if (this.W3 != 0) {
            if (!z10 && this.R3 == 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            radialProgress2.o(z12, true);
        }
        if (!z10 && this.Q3 == 0) {
            z13 = false;
        }
        this.R0.o(z13, false);
    }

    public final boolean V(MotionEvent motionEvent) {
        y yVar;
        q1 q1Var;
        l1 l1Var;
        TLRPC.Chat chat;
        int i7;
        TLRPC.Chat chat2;
        if (this.f31043k9 && this.V8 != null && (yVar = this.V2) != null && (this.f31030ja != null || this.f31044ka != null)) {
            boolean contains = yVar.getBounds().contains((int) motionEvent.getX(), (int) N1(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.W2 = contains;
                if (contains) {
                    this.V2.setHotspot((int) motionEvent.getX(), (int) N1(motionEvent));
                    this.V2.setState(this.N2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.W2 && (l1Var = this.Sa) != null) {
                    if (this.S6) {
                        TLRPC.User user = this.f31163ta;
                        if (user != null && user.bot_inline_placeholder == null) {
                            l1Var.l2(this, user.f28200id);
                        } else {
                            String n10 = q10.n(user);
                            l1 l1Var2 = this.Sa;
                            if (n10 == null) {
                                n10 = this.Q5.f23817k.via_bot_name;
                            }
                            l1Var2.n0(n10);
                        }
                    } else {
                        TLRPC.User user2 = this.f31030ja;
                        if (user2 != null) {
                            l1Var.u0(this, user2, motionEvent.getX(), N1(motionEvent));
                        } else {
                            TLRPC.Chat chat3 = this.f31044ka;
                            if (chat3 != null) {
                                TLRPC.MessageFwdHeader messageFwdHeader = this.Q5.f23817k.fwd_from;
                                if (messageFwdHeader != null) {
                                    int i10 = messageFwdHeader.channel_post;
                                    chat = this.f31177ua;
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
                                l1Var.U(q1Var, chat2, i7, this.f30996h1, this.f31009i1, false);
                                q1Var.V2.setState(StateSet.NOTHING);
                                q1Var.W2 = false;
                                return q1Var.W2;
                            }
                        }
                    }
                }
                q1Var = this;
                q1Var.V2.setState(StateSet.NOTHING);
                q1Var.W2 = false;
                return q1Var.W2;
            }
            q1Var = this;
            return q1Var.W2;
        }
        this.W2 = false;
        return false;
    }

    public final void V0(android.graphics.Canvas r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.V0(android.graphics.Canvas, float):void");
    }

    public final float V1(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.Q4;
            if (i7 < arrayList.size()) {
                int i10 = ((p1) arrayList.get(i7)).f30839b;
                int i11 = this.Ua;
                float f10 = i10 + i11;
                x1 x1Var = this.f31018ib;
                if (x1Var.f32003u2) {
                    float f11 = x1Var.L1;
                    f10 += ((1.0f - f11) * x1Var.f32006v2) + (i11 * f11);
                    if (this.Q5.n5()) {
                        f10 -= this.Ua;
                    }
                }
                if (x1Var.f32012x0) {
                    f10 += x1Var.f31961k0;
                }
                return f10 - org.telegram.messenger.g0.L(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void V3() {
        gj gjVar;
        int i7;
        float f10;
        int i10;
        float f11;
        int i11;
        if (!this.Q5.O5()) {
            return;
        }
        ch.q0 q0Var = this.O;
        if (!q0Var.f5204p) {
            yi yiVar = this.M;
            if (yiVar != null) {
                int i12 = yiVar.f27753l;
                if ((i12 & 8) == 0 || (i12 & 1) == 0) {
                    return;
                }
            }
            gj gjVar2 = this.Q5;
            int i13 = 0;
            if (gjVar2.D != 19 && !gjVar2.G2() && !this.Q5.M2()) {
                float f12 = 11.0f;
                if (this.Q5.P3()) {
                    q0Var.f5192b = org.telegram.messenger.g0.L(11.0f) + getCurrentBackgroundLeft();
                } else if (this.f31232yb) {
                    int L = org.telegram.messenger.g0.L(11.0f) + getCurrentBackgroundLeft();
                    if (!this.K) {
                        i11 = 6;
                    } else {
                        i11 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(getVideoTranscriptionProgress(), 0, i11)) + L;
                    q0Var.f5192b = L2;
                    q0Var.f5192b = L2 - ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(9.0f)));
                } else {
                    int L3 = org.telegram.messenger.g0.L((this.C6 || !this.K) ? 17.0f : 17.0f) + getCurrentBackgroundLeft();
                    q0Var.f5192b = L3;
                    if (this.C6) {
                        q0Var.f5192b = L3 - org.telegram.messenger.g0.L(9.0f);
                    }
                }
            } else if (this.Q5.P3()) {
                q0Var.f5192b = (getMeasuredWidth() - q0Var.f5203o) - org.telegram.messenger.g0.L(16.0f);
            } else {
                q0Var.f5192b = getCurrentBackgroundLeft();
            }
            if (u2()) {
                float compactLeft = getCompactLeft();
                if (t2()) {
                    f11 = this.f31153sd;
                } else if (this.L != null && this.M != null) {
                    f11 = getLeft();
                } else {
                    f11 = 0.0f;
                }
                q0Var.f5192b = (int) (compactLeft - f11);
            }
            if (!this.Q5.P3() && this.M != null && !u2()) {
                float f13 = q0Var.f5192b;
                if (Z2()) {
                    i10 = 48;
                } else {
                    i10 = 0;
                }
                q0Var.f5192b = (int) (f13 - (org.telegram.messenger.g0.L(64 - i10) * this.Z6));
            }
            int backgroundDrawableBottom = (getBackgroundDrawableBottom() - org.telegram.messenger.g0.L(10.0f)) - q0Var.f5201m;
            q0Var.f5193c = backgroundDrawableBottom;
            if (this.f31216x7) {
                if (u2()) {
                    i13 = getCommentButtonHeight();
                } else {
                    if (this.Q5.D == 29 && d2()) {
                        f10 = 28.0f;
                    } else {
                        f10 = 43.0f;
                    }
                    i13 = org.telegram.messenger.g0.L(f10);
                }
            }
            int i14 = backgroundDrawableBottom - i13;
            q0Var.f5193c = i14;
            if (this.f30936c7 && (!this.s9 || !this.R1 || this.M1 != 3)) {
                q0Var.f5193c = i14 - org.telegram.messenger.g0.L(16.0f);
            }
            if (this.Q5.D != 9 && !P2() && this.f31062m3 != null && (((i7 = (gjVar = this.Q5).D) != 2 && i7 != 17 && (!gjVar.N3() || !this.s9 || this.O1)) || ((this.M != null && this.L != null) || this.Q5.D == 29))) {
                q0Var.f5193c -= org.telegram.messenger.g0.L(14.0f);
            }
            q0Var.f5193c += q0Var.f5199k;
        }
    }

    public final boolean W(MotionEvent motionEvent) {
        l1 l1Var;
        TLRPC.User user;
        TLRPC.Document document;
        if (this.f31043k9 && this.V8 != null && this.V2 != null && ((this.f31030ja != null || this.f31044ka != null) && this.f31081na != null && this.f31122qa != null)) {
            boolean contains = this.f30919b3.getBounds().contains((int) motionEvent.getX(), (int) N1(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.f30932c3 = contains;
                if (contains) {
                    this.f30919b3.setHotspot((int) motionEvent.getX(), (int) N1(motionEvent));
                    this.f30919b3.setState(this.N2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.f30932c3 && (l1Var = this.Sa) != null && (user = this.f31030ja) != null) {
                    Drawable drawable = this.f31122qa.f34194f[0];
                    if (drawable instanceof org.telegram.ui.Components.g5) {
                        document = ((org.telegram.ui.Components.g5) drawable).f34804e;
                    } else {
                        document = null;
                    }
                    l1Var.Y1(this, user, document, this.f31108pa);
                    q2();
                }
                this.f30919b3.setState(StateSet.NOTHING);
                this.f30932c3 = false;
            }
            return this.f30932c3;
        }
        this.f30932c3 = false;
        return false;
    }

    public final void W0(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.W0(android.graphics.Canvas):void");
    }

    public final int W1(byte[] bArr) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q4;
            if (i7 < arrayList.size()) {
                TLRPC.PollAnswer pollAnswer = ((p1) arrayList.get(i7)).f30854s;
                if (pollAnswer != null && Arrays.equals(pollAnswer.option, bArr)) {
                    return i7;
                }
                i7++;
            } else {
                return -1;
            }
        }
    }

    public xh.e W2() {
        return xh.e.e(this);
    }

    public final void W3(gj gjVar) {
        String str;
        CharSequence concat;
        int i7;
        if (gjVar != null && gjVar.m5()) {
            int i10 = 0;
            if (!gjVar.l4()) {
                concat = null;
            } else {
                TLRPC.Message message = gjVar.f23817k;
                int i11 = message.ttl;
                if (i11 == Integer.MAX_VALUE) {
                    if (gjVar.Y2 == null) {
                        gjVar.Y2 = new SpannableString("v");
                        eq eqVar = new eq(2131231979, 0);
                        eqVar.f34415r = -org.telegram.messenger.g0.L(3.0f);
                        eqVar.F = org.telegram.messenger.g0.L(13.0f);
                        SpannableString spannableString = gjVar.Y2;
                        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
                    }
                    concat = TextUtils.concat(gjVar.Y2, "1");
                } else {
                    int i12 = message.destroyTime;
                    if (i12 != 0) {
                        i11 = Math.max(0, i12 - ConnectionsManager.getInstance(gjVar.K1).getCurrentTime());
                    }
                    if (i11 < 60) {
                        str = com.google.android.gms.internal.vision.e2.i(i11, "s");
                    } else {
                        str = (i11 / 60) + "m";
                    }
                    if (gjVar.Z2 == null) {
                        gjVar.Z2 = new SpannableString("p");
                        eq eqVar2 = new eq(2131232550, 0);
                        eqVar2.f34415r = org.telegram.messenger.g0.L(1.0f);
                        eqVar2.F = org.telegram.messenger.g0.L(13.0f);
                        SpannableString spannableString2 = gjVar.Z2;
                        spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 33);
                    }
                    concat = TextUtils.concat(gjVar.Z2, str);
                }
            }
            CharSequence charSequence = concat;
            if (charSequence != null) {
                if (charSequence instanceof String) {
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText((String) charSequence));
                    this.C3 = ceil;
                    this.f31212x3 = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.j6.C2, ceil, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.C2, this.C3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else {
                    TextPaint textPaint = org.telegram.ui.ActionBar.j6.D2;
                    if (getMeasuredWidth() > 0) {
                        i7 = getMeasuredWidth();
                    } else {
                        i7 = 9999;
                    }
                    StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.f31212x3 = staticLayout;
                    if (staticLayout.getLineCount() > 0) {
                        i10 = (int) this.f31212x3.getLineWidth(0);
                    }
                    this.C3 = i10;
                }
                invalidate();
            }
        }
    }

    public final boolean X(org.telegram.messenger.gj r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.X(org.telegram.messenger.gj):boolean");
    }

    public final void X0(Canvas canvas) {
        float f10;
        q1 q1Var;
        Canvas canvas2;
        if (this.f31032jc || this.f31045kc) {
            yi yiVar = this.M;
            if (yiVar == null || (yiVar.f27746c == 0 && yiVar.f27744a == 0)) {
                int compactHeaderColor = getCompactHeaderColor();
                f30900xd.setColor(compactHeaderColor);
                f30901yd.setColor(compactHeaderColor);
                float compactLeft = getCompactLeft();
                if (this.J) {
                    f10 = 9.0f;
                } else {
                    f10 = 10.0f;
                }
                float L = org.telegram.messenger.g0.L(f10);
                if (this.f31032jc) {
                    q1Var = this;
                    canvas2 = canvas;
                    q1Var.Z0(canvas2, this.f31006hc, compactLeft, L, compactHeaderColor);
                    L += org.telegram.messenger.g0.L(24.0f);
                } else {
                    q1Var = this;
                    canvas2 = canvas;
                }
                if (q1Var.f31045kc) {
                    q1Var.Z0(canvas2, q1Var.f31019ic, compactLeft, L, compactHeaderColor);
                }
            }
        }
    }

    public final void X2(org.telegram.messenger.gj r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.X2(org.telegram.messenger.gj):void");
    }

    public final void X3() {
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
        if (this.R1) {
            i7 = 10;
        } else {
            i7 = 0;
        }
        int i19 = -org.telegram.messenger.g0.L(i7 + 92);
        x1 x1Var = this.f31018ib;
        boolean z10 = x1Var.f32012x0;
        i1 i1Var = this.D4;
        tm0 tm0Var = this.E4;
        float f11 = 10.0f;
        if (z10 && ((i14 = this.M1) == 3 || i14 == 7)) {
            int i20 = this.f30923b7;
            float f12 = i20;
            int i21 = (int) ((f12 - x1Var.f31966l0) + x1Var.m0);
            int i22 = (int) ((f12 - x1Var.f31947h0) + x1Var.f31952i0);
            if (this.f31232yb && !this.I6) {
                i22 = (int) ((getVideoTranscriptionProgress() * org.telegram.messenger.g0.L(8.0f)) + i22);
                i21 += org.telegram.messenger.g0.L(8.0f);
            }
            if (x1Var.f31966l0 == 0.0f && x1Var.m0 == 0.0f) {
                i21 = i22;
            }
            if (tm0Var != null) {
                if (x1Var.f31978o1) {
                    int L = (i22 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.R1) {
                        f11 = 0.0f;
                    }
                    int L2 = L - org.telegram.messenger.g0.L(f11);
                    int L3 = org.telegram.messenger.g0.L(30.0f);
                    int i23 = i20 + i19;
                    if (!this.I4) {
                        i17 = -org.telegram.messenger.g0.L(34.0f);
                    } else {
                        i17 = 0;
                    }
                    int i24 = i23 + i17;
                    int i25 = i21 + i19;
                    if (this.I4) {
                        i18 = -org.telegram.messenger.g0.L(34.0f);
                    } else {
                        i18 = 0;
                    }
                    tm0Var.h(L2, L3, i24, i25 + i18);
                } else {
                    int L4 = (i22 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.R1) {
                        f11 = 0.0f;
                    }
                    tm0Var.h(L4 - org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(30.0f), (i20 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress())), (i21 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            if (i1Var != null) {
                int useTranscribeButtonProgress = i22 - ((int) (getUseTranscribeButtonProgress() * org.telegram.messenger.g0.L(34.0f)));
                if (this.M1 == 5) {
                    i15 = 65;
                } else {
                    i15 = 72;
                }
                if (this.R1) {
                    i16 = 20;
                } else {
                    i16 = 0;
                }
                i1Var.i(useTranscribeButtonProgress - org.telegram.messenger.g0.L(i15 + i16), org.telegram.messenger.g0.L(30.0f));
                return;
            }
            return;
        }
        if (tm0Var != null) {
            if (x1Var.f31978o1) {
                int L5 = (this.f30923b7 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress()));
                if (this.R1) {
                    f10 = 10.0f;
                } else {
                    f10 = 0.0f;
                }
                int L6 = L5 - org.telegram.messenger.g0.L(f10);
                int L7 = org.telegram.messenger.g0.L(30.0f);
                int i26 = this.f30923b7 + i19;
                if (!this.I4) {
                    i12 = -org.telegram.messenger.g0.L(34.0f);
                } else {
                    i12 = 0;
                }
                int i27 = i26 + i12;
                if (!this.R1) {
                    f11 = 0.0f;
                }
                int L8 = i27 - org.telegram.messenger.g0.L(f11);
                int i28 = this.f30923b7 + i19;
                if (this.I4) {
                    i13 = -org.telegram.messenger.g0.L(34.0f);
                } else {
                    i13 = 0;
                }
                tm0Var.h(L6, L7, L8, i28 + i13);
            } else {
                int L9 = (this.f30923b7 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.R1) {
                    f11 = 0.0f;
                }
                int L10 = L9 - org.telegram.messenger.g0.L(f11);
                tm0Var.h(L10, org.telegram.messenger.g0.L(30.0f), L10, L10);
            }
        }
        if (i1Var != null) {
            int useTranscribeButtonProgress2 = this.f30923b7 - ((int) (getUseTranscribeButtonProgress() * org.telegram.messenger.g0.L(34.0f)));
            if (this.M1 == 5) {
                i10 = 65;
            } else {
                i10 = 72;
            }
            if (this.R1) {
                i11 = 20;
            } else {
                i11 = 0;
            }
            i1Var.i(useTranscribeButtonProgress2 - org.telegram.messenger.g0.L(i10 + i11), org.telegram.messenger.g0.L(30.0f));
        }
    }

    public final boolean Y(MotionEvent motionEvent) {
        int i7;
        yi yiVar;
        boolean z10;
        Drawable drawable;
        Drawable drawable2;
        int L;
        int i10;
        int L2;
        int i11;
        if ((!w2() || this.Q5.D == 16) && (((i7 = this.M1) != 5 && i7 != 1) || (yiVar = this.M) == null || (yiVar.f27753l & 4) != 0)) {
            int i12 = this.Q5.D;
            if (i12 == 16) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            if (!z10) {
                if ((i7 == 1 || i12 == 12 || i7 == 5 || i7 == 4 || i7 == 2 || i12 == 8) && !this.T1 && !this.U1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                int x10 = (int) motionEvent.getX();
                int N1 = (int) N1(motionEvent);
                int action = motionEvent.getAction();
                Drawable[] drawableArr = this.J2;
                if (action == 0) {
                    gj gjVar = this.Q5;
                    if (gjVar.D == 16) {
                        boolean J4 = gjVar.J4();
                        int i13 = this.S3;
                        if (x10 >= i13) {
                            if (hd.f24101a0) {
                                L = 0;
                            } else {
                                L = this.f30923b7 - org.telegram.messenger.g0.L(70.0f);
                            }
                            int i14 = i13 + L;
                            if (!J4) {
                                i10 = 2;
                            } else {
                                i10 = 0;
                            }
                            if (x10 <= org.telegram.messenger.g0.L(i10 + 30) + i14 && N1 >= this.T3 - org.telegram.messenger.g0.L(14.0f)) {
                                if (N1 <= org.telegram.messenger.g0.L(50.0f) + this.T3) {
                                    this.Z3 = true;
                                    this.L2[0] = 4;
                                    if (drawableArr[0] != null) {
                                        int i15 = this.S3;
                                        if (hd.f24101a0) {
                                            L2 = 0;
                                        } else {
                                            L2 = this.f30923b7 - org.telegram.messenger.g0.L(70.0f);
                                        }
                                        int i16 = i15 + L2;
                                        if (!J4) {
                                            i11 = 2;
                                        } else {
                                            i11 = 0;
                                        }
                                        int L3 = org.telegram.messenger.g0.L(i11) + i16;
                                        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.G4;
                                        int w10 = y0.w(2, L3, drawableArr2[J4 ? 1 : 0]);
                                        int h = y0.h(2, this.T3, drawableArr2[J4 ? 1 : 0]);
                                        drawableArr[0].setBounds(w10 - org.telegram.messenger.g0.L(20.0f), h - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f) + w10, org.telegram.messenger.g0.L(20.0f) + h);
                                        drawableArr[0].setHotspot(x10, N1);
                                        drawableArr[0].setState(this.N2);
                                    }
                                    invalidate();
                                    return true;
                                }
                            }
                        }
                    } else if (x10 >= this.S3 - org.telegram.messenger.g0.L(20.0f)) {
                        if (x10 <= org.telegram.messenger.g0.L(20.0f) + this.S3 && N1 >= this.T3 - org.telegram.messenger.g0.L(4.0f)) {
                            if (N1 <= org.telegram.messenger.g0.L(30.0f) + this.T3) {
                                this.Z3 = true;
                                invalidate();
                                return true;
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (this.Z3) {
                        if (this.Q5.D == 16 && (drawable2 = drawableArr[0]) != null) {
                            drawable2.setState(StateSet.NOTHING);
                        }
                        this.Z3 = false;
                        playSoundEffect(0);
                        this.Sa.C0(this, this.S3, this.T3);
                        invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 2 && this.Q5.D == 16 && this.Z3 && (drawable = drawableArr[0]) != null) {
                    drawable.setHotspot(x10, N1);
                }
            }
        }
        return false;
    }

    public final int Y1(int i7) {
        return org.telegram.ui.ActionBar.j6.w0(i7, this.Qb);
    }

    public final float Y2() {
        float f10;
        x1 x1Var = this.f31018ib;
        float f11 = 1.0f;
        if (x1Var.G1) {
            boolean z10 = this.f31197w1;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            return org.telegram.messenger.g0.T1(f10, f11, x1Var.L1);
        } else if (this.f31197w1) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public final void Y3() {
        char c10;
        int L;
        int extraTextX;
        int i7;
        int i10;
        int L2;
        int i11;
        if (getDelegate() != null && getDelegate().z2() != null && getDelegate().z2().z(this.Q5)) {
            i9 z22 = getDelegate().z2();
            int i12 = 0;
            if (z22.f30450q0) {
                c10 = 2;
            } else if (z22.f30452s0) {
                c10 = 3;
            } else if (z22.f30454u0) {
                c10 = 4;
            } else if (d2()) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            if (c10 == 2) {
                if (this.T1) {
                    i11 = this.f31098p0 - org.telegram.messenger.g0.L(10.0f);
                } else {
                    if (this.U1) {
                        i10 = this.f31098p0;
                        L2 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i10 = this.f31098p0;
                        L2 = org.telegram.messenger.g0.L(1.0f);
                    }
                    i11 = i10 + L2;
                }
                getDelegate().z2().c0(org.telegram.messenger.g0.L(10.0f) + i11 + this.f30904a2, this.Y1);
            } else if (c10 == 1) {
                Q3();
                getDelegate().z2().c0((int) this.f31145s3, (int) this.f31157t3);
            } else if (c10 == 3) {
                bj bjVar = this.L;
                if (bjVar != null && !bjVar.f22713i) {
                    i7 = (int) this.f31145s3;
                } else {
                    float f10 = 12.0f;
                    if (this.Q5.P3()) {
                        i7 = getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + this.N6;
                        if (this.Q5.D == 19) {
                            i7 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(this.X7, this.Z7) + i7)) - org.telegram.messenger.g0.f23609q.x);
                        }
                    } else {
                        if (this.C6) {
                            L = org.telegram.messenger.g0.L(12.0f) + this.N6;
                            extraTextX = getExtraTextX();
                        } else {
                            int i13 = this.N6;
                            if (!this.K) {
                                f10 = 18.0f;
                            }
                            L = org.telegram.messenger.g0.L(f10) + i13;
                            extraTextX = getExtraTextX();
                        }
                        i7 = extraTextX + L;
                    }
                }
                int L3 = ((int) (i7 + this.f31018ib.f31947h0)) - org.telegram.messenger.g0.L(1.33f);
                int i14 = this.f31127r0;
                Q3();
                i9 z23 = getDelegate().z2();
                int L4 = org.telegram.messenger.g0.L(10.0f) + L3;
                s1 s1Var = this.f31142s0;
                if (s1Var != null) {
                    i12 = s1Var.f31398o;
                }
                z23.c0(L4 - i12, org.telegram.messenger.g0.L(22.0f) + i14);
            } else {
                getDelegate().z2().c0(this.f31085o0, this.f31167u0);
            }
        }
    }

    public final boolean Z(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.Z(android.view.MotionEvent):boolean");
    }

    public final void Z0(Canvas canvas, m1 m1Var, float f10, float f11, int i7) {
        int i10;
        int intrinsicWidth;
        int intrinsicHeight;
        boolean z10;
        int L = org.telegram.messenger.g0.L(16.0f);
        RectF rectF = m1Var.d;
        ImageReceiver imageReceiver = m1Var.f30676b;
        boolean z11 = m1Var.f30675a;
        float f12 = L;
        rectF.set(f10, f11, m1Var.f30682j + f10, f11 + f12);
        canvas.save();
        float a10 = m1Var.f30678e.a(0.02f);
        RectF rectF2 = m1Var.d;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.15f, i7);
        y yVar = m1Var.f30683k;
        if (yVar == null) {
            m1Var.f30684l = r12;
            y a02 = org.telegram.ui.ActionBar.j6.a0(r12, 6, 6);
            m1Var.f30683k = a02;
            a02.setCallback(this);
        } else if (m1Var.f30684l != r12) {
            m1Var.f30684l = r12;
            org.telegram.ui.ActionBar.j6.H1(yVar, r12, true);
        }
        m1Var.f30683k.setBounds((int) (rectF2.left - org.telegram.messenger.g0.L(6.0f)), (int) (rectF2.top - org.telegram.messenger.g0.L(4.0f)), (int) (rectF2.right + org.telegram.messenger.g0.L(6.0f)), (int) (rectF2.bottom + org.telegram.messenger.g0.L(4.0f)));
        m1Var.f30683k.draw(canvas);
        if (!z11) {
            l1 l1Var = this.Sa;
            if (l1Var != null && l1Var.z1(this, 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            a1(canvas, m1Var, i7, z10);
        }
        if (this.f31083nc == null) {
            this.f31083nc = getContext().getResources().getDrawable(2131232333).mutate();
        }
        if (z11) {
            i10 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fd, this.Qb);
        } else {
            i10 = i7;
        }
        this.f31083nc.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        int i11 = (int) (((L - intrinsicWidth) / 2.0f) + f10);
        int i12 = (int) (((L - intrinsicHeight) / 2.0f) + f11);
        this.f31083nc.setBounds(i11, i12, this.f31083nc.getIntrinsicWidth() + i11, this.f31083nc.getIntrinsicHeight() + i12);
        canvas.save();
        if (!z11) {
            float f13 = f12 / 2.0f;
            canvas.scale(-1.0f, 1.0f, f10 + f13, f13 + f11);
        }
        this.f31083nc.draw(canvas);
        canvas.restore();
        float L2 = f10 + f12 + org.telegram.messenger.g0.L(6.0f);
        if (m1Var.f30679f != null) {
            f30900xd.setColor(i10);
            Y0(canvas, m1Var.f30679f, L2, f11);
            f30900xd.setColor(i7);
            L2 += org.telegram.messenger.g0.L(4.0f) + L1(m1Var.f30679f);
        }
        if (m1Var.f30681i) {
            imageReceiver.y0(L2, f11, f12, f12);
            imageReceiver.setAlpha(1.0f);
            imageReceiver.h(canvas, null);
            L2 += org.telegram.messenger.g0.L(5.0f) + L;
        }
        StaticLayout staticLayout = m1Var.f30680g;
        if (staticLayout != null) {
            if (z11) {
                staticLayout.getPaint().setColor(i0.a.k(org.telegram.ui.ActionBar.j6.r1(0.7f, i10), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29169ua, this.Qb)));
            }
            Y0(canvas, m1Var.f30680g, L2, f11);
            if (z11) {
                m1Var.f30680g.getPaint().setColor(i7);
            }
            L2 += org.telegram.messenger.g0.L(4.0f) + L1(m1Var.f30680g);
        }
        if (m1Var.h != null) {
            canvas.save();
            canvas.translate(L2 - m1Var.h.getLineLeft(0), ((L - m1Var.h.getHeight()) / 2.0f) + f11);
            if (z11) {
                m1Var.h.draw(canvas);
            } else {
                StaticLayout staticLayout2 = m1Var.h;
                AtomicReference atomicReference = this.f31096oc;
                ArrayList arrayList = this.Tb;
                xh.f.g(this, this.f31072n0, i7, -org.telegram.messenger.g0.L(2.0f), atomicReference, 0, staticLayout2, arrayList, canvas, false);
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, m1Var.h, this.Ba, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, J1(2, i7));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public final Drawable Z1(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.e6 e6Var = this.Qb;
        if (e6Var != null) {
            drawable = e6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.j6.R0(str);
    }

    public final boolean Z2() {
        if (u2()) {
            return false;
        }
        return a3();
    }

    public final void Z3(int i7, int i10) {
        ArrayList arrayList;
        ej ejVar = this.f31062m3;
        x1 x1Var = this.f31018ib;
        if (ejVar != null && (arrayList = ejVar.f23310e) != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                dj djVar = (dj) obj;
                ArrayList arrayList2 = djVar.f23100y;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    ((xh.f) obj2).i((i7 - djVar.p(this.f31062m3.f23310e, x1Var)) - this.f31145s3, getWidth(), (i10 - djVar.p(this.f31062m3.f23310e, x1Var)) - this.f31157t3);
                }
            }
        }
        StaticLayout staticLayout = this.R7;
        if (staticLayout != null) {
            float height = (-this.V7) - staticLayout.getHeight();
            ArrayList arrayList3 = this.Tb;
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                ((xh.f) obj3).i(i7 + height, getWidth(), i10 + height);
            }
        }
        if (getMessageObject() != null && getMessageObject().B2 != null) {
            ArrayList arrayList4 = getMessageObject().B2;
            int size4 = arrayList4.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList4.get(i14);
                i14++;
                dj djVar2 = (dj) obj4;
                ArrayList arrayList5 = djVar2.f23100y;
                int size5 = arrayList5.size();
                int i15 = 0;
                while (i15 < size5) {
                    Object obj5 = arrayList5.get(i15);
                    i15++;
                    ((xh.f) obj5).i((i7 - djVar2.p(getMessageObject().B2, x1Var)) - this.f31167u0, getWidth(), (i10 - djVar2.p(getMessageObject().B2, x1Var)) - this.f31167u0);
                }
            }
        }
    }

    @Override
    public final boolean a() {
        bj bjVar = this.L;
        if ((bjVar == null || !bjVar.f22717m.f22523j) && getAlpha() != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean a0(MotionEvent motionEvent) {
        dr0 c22;
        l1 l1Var = this.Sa;
        if (l1Var == null) {
            c22 = null;
        } else {
            c22 = l1Var.c2();
        }
        dr0 dr0Var = c22;
        int i7 = 0;
        if (this.Q5 != null) {
            fi.u2 u2Var = this.U0;
            if (u2Var.L() && dr0Var != null && !this.Q5.t4() && !this.Q5.G2() && ((!gj.L4(this.Q5.f23817k) || this.H5) && !this.f31232yb && !this.Q5.J2() && ((!this.Q5.U2() || gj.t3(this.Q5.f23817k)) && !this.Q5.m5()))) {
                gj gjVar = this.Q5;
                xh.e eVar = this.Q9;
                if (eVar != null) {
                    Integer num = (Integer) eVar.f59978k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    i7 = num.intValue();
                }
                return dr0Var.a(motionEvent, this, u2Var, gjVar, i7);
            }
        }
        return false;
    }

    public final void a1(Canvas canvas, m1 m1Var, int i7, boolean z10) {
        d80 d80Var;
        d80 d80Var2;
        if (!z10 && m1Var.f30686n) {
            d80 d80Var3 = m1Var.f30685m;
            if (d80Var3 != null) {
                d80Var3.a();
            }
        } else if (z10 && !m1Var.f30686n && (d80Var = m1Var.f30685m) != null) {
            d80Var.f33866c = -1L;
            d80Var.f33865b = -1L;
        }
        m1Var.f30686n = z10;
        float[] fArr = m1Var.f30687o;
        RectF rectF = m1Var.d;
        if (!z10 && ((d80Var2 = m1Var.f30685m) == null || !d80Var2.d())) {
            d80 d80Var4 = m1Var.f30685m;
            if (d80Var4 != null) {
                d80Var4.f33865b = -1L;
                return;
            }
            return;
        }
        if (m1Var.f30685m == null) {
            d80 d80Var5 = new d80();
            m1Var.f30685m = d80Var5;
            d80Var5.D = true;
            d80Var5.f33881t = 3.5f;
            d80Var5.f33882u = 0.5f;
        }
        m1Var.f30685m.g(org.telegram.ui.ActionBar.j6.r1(0.1f, i7), org.telegram.ui.ActionBar.j6.r1(0.3f, i7), org.telegram.ui.ActionBar.j6.r1(0.3f, i7), org.telegram.ui.ActionBar.j6.r1(1.25f, i7));
        Arrays.fill(fArr, org.telegram.messenger.g0.L(6.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(rectF.left - org.telegram.messenger.g0.L(6.0f), rectF.top - org.telegram.messenger.g0.L(4.0f), rectF.right + org.telegram.messenger.g0.L(6.0f), rectF.bottom + org.telegram.messenger.g0.L(4.0f));
        m1Var.f30685m.e(rectF2);
        m1Var.f30685m.j(fArr);
        m1Var.f30685m.f33884x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        m1Var.f30685m.draw(canvas);
        invalidate();
    }

    public Paint a2(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.e6 e6Var = this.Qb;
        if (e6Var != null) {
            paint = e6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.j6.V0(str);
    }

    public final boolean a3() {
        gj gjVar;
        if (!this.f30975f6 || this.f31014i6 || ((this.H6 && !this.f31052l6) || (gjVar = this.Q5) == null || gjVar.P3() || !this.Q5.k5())) {
            gj gjVar2 = this.Q5;
            if (gjVar2 == null || gj.B0(gjVar2.f23817k) != 489000) {
                gj gjVar3 = this.Q5;
                if (gjVar3 == null || !gjVar3.f23824l2) {
                    if (gjVar3 != null && gjVar3.f23817k.guestchat_via_from != null) {
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

    public void a4() {
        int i7;
        gj gjVar = this.Q5;
        if (gjVar == null) {
            return;
        }
        float f10 = this.f31033jd + this.f31046kd;
        if (!gjVar.P3() || this.Q5.D2) {
            f10 += this.f31128r1;
        }
        if (u2()) {
            f10 += getCompactSideMenuShift();
        } else if (this.X6 && !this.Q5.P3() && this.M != null) {
            if (Z2()) {
                i7 = 48;
            } else {
                i7 = 0;
            }
            f10 += org.telegram.messenger.g0.L(71 - i7) * this.Z6;
        }
        setTranslationX(f10);
    }

    @Override
    public final void b(boolean z10, boolean z11) {
        this.ya = z10;
        if (z10) {
            this.f31244za = z11;
        } else {
            this.f31244za = false;
        }
    }

    public final void b0() {
        sh.e eVar;
        sh.e eVar2;
        gj gjVar = this.Q5;
        if (gjVar != null && gjVar.T3()) {
            w1 w1Var = this.f31211x2;
            if (w1Var != null && (eVar2 = w1Var.f31862n) != null) {
                eVar2.c();
            }
            w1 w1Var2 = this.f31211x2;
            if (w1Var2 != null && (eVar = w1Var2.f31861m) != null) {
                eVar.c();
            }
        }
    }

    public final void b1(Canvas canvas, float f10) {
        ej ejVar;
        ch.q0 q0Var;
        Paint paint;
        m1 m1Var;
        m1 m1Var2;
        if (u2() && this.Q5 != null && f10 > 0.0f) {
            if (this.f31125qd == null) {
                this.f31125qd = new Paint(1);
            }
            float compactLeft = getCompactLeft();
            ArrayList arrayList = this.Q5.B2;
            if (arrayList != null && !arrayList.isEmpty()) {
                compactLeft = Math.max(compactLeft, this.f31085o0 + this.Q5.f23862v2);
            }
            if (this.f31062m3 != null) {
                compactLeft = Math.max(compactLeft, this.f31145s3 + ejVar.f23309c);
            }
            if (this.O1) {
                fi.u2 u2Var = this.U0;
                if (u2Var.R0) {
                    compactLeft = Math.max(compactLeft, u2Var.y());
                }
            }
            if (this.f31043k9 && this.V8 != null) {
                compactLeft = Math.max(compactLeft, getCompactLeft() + this.f30978f9);
            }
            if (this.f31032jc && (m1Var2 = this.f31006hc) != null) {
                compactLeft = Math.max(compactLeft, m1Var2.d.right);
            }
            if (this.f31045kc && (m1Var = this.f31019ic) != null) {
                compactLeft = Math.max(compactLeft, m1Var.d.right);
            }
            if (!this.O.f5204p) {
                compactLeft = Math.max(compactLeft, q0Var.f5192b + q0Var.f5203o);
            }
            if (this.Q5.D != 0 && !this.O1) {
                compactLeft = Math.max(compactLeft, getBackgroundDrawableRight() - org.telegram.messenger.g0.L(10.0f));
            }
            if (this.f31243z9 != null) {
                compactLeft = Math.max(compactLeft, this.C9 + this.A9);
            }
            float L = org.telegram.messenger.g0.L(8.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(L, org.telegram.messenger.g0.L(2.0f) + getPaddingTop(), Math.min(compactLeft + L, getMeasuredWidth() - L), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
            this.f31125qd.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29169ua, this.Qb));
            this.f31125qd.setAlpha((int) (paint.getAlpha() * f10));
            float L2 = org.telegram.messenger.g0.L(gz.Y0);
            canvas.drawRoundRect(rectF, L2, L2, this.f31125qd);
        }
    }

    public final float b2(float f10) {
        float f11;
        float f12;
        if (G3() && this.M1 != 7) {
            return ((getPhotoBottom() + this.f31196w0) - org.telegram.messenger.g0.L(7.3f)) - this.f31243z9.getHeight();
        }
        int i7 = this.f30962e7;
        if (!this.G && !this.F) {
            f11 = 6.5f;
        } else {
            f11 = 7.5f;
        }
        float L = ((i7 - org.telegram.messenger.g0.L(f11)) - this.f31243z9.getHeight()) + f10;
        boolean z10 = this.f31232yb;
        x1 x1Var = this.f31018ib;
        if (z10 && !u2()) {
            if (this.K) {
                f12 = 4.0f;
            } else {
                f12 = 5.0f;
            }
            L -= (1.0f - getVideoTranscriptionProgress()) * (this.O.i(x1Var.L1) + org.telegram.messenger.g0.L(f12));
        }
        bj bjVar = this.L;
        if (bjVar != null) {
            aj ajVar = bjVar.f22717m;
            float f13 = L + ajVar.h;
            if (ajVar.f22523j) {
                return f13 - getTranslationY();
            }
            return f13;
        }
        return (x1Var.f31957j0 - x1Var.f31961k0) + L;
    }

    public final u70 b3() {
        u70 u70Var;
        ArrayList arrayList = this.f31200w4;
        if (!arrayList.isEmpty()) {
            u70Var = (u70) arrayList.get(0);
            arrayList.remove(0);
        } else {
            u70Var = new u70(0);
        }
        u70Var.reset();
        this.f31213x4.add(u70Var);
        return u70Var;
    }

    public final void b4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.b4():void");
    }

    @Override
    public final void c(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        l1 l1Var = this.Sa;
        if (l1Var != null) {
            l1Var.t2(this, reactionCount, z10, f10, f11);
        }
    }

    public final void c0(boolean z10) {
        gj gjVar;
        boolean z11;
        gj gjVar2;
        byte[] bArr;
        w1 w1Var = this.f31211x2;
        if (w1Var != null && w1Var.f31859k != null && (gjVar = this.Q5) != null && gjVar.T3()) {
            TLRPC.MessageMedia m12 = gj.m1(this.Q5);
            boolean z12 = false;
            if (m12 instanceof TLRPC.TL_messageMediaPoll) {
                z11 = ((TLRPC.TL_messageMediaPoll) m12).poll.multiple_choice;
            } else {
                z11 = false;
            }
            uh.d dVar = this.f31211x2.f31859k;
            if (z11) {
                ez C = ez.C(this.f30908a6);
                if (this.Q5 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C.f23394w.get("poll_" + gjVar2.D1());
                }
                if (bArr != null) {
                    z12 = true;
                }
            }
            te.a aVar = dVar.f58423f;
            if (aVar.f57082f != z12) {
                aVar.a(z12, z10);
            }
        }
    }

    public final void c1(android.graphics.Canvas r50, boolean r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.c1(android.graphics.Canvas, boolean):void");
    }

    public final int c2(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Q4;
            if (i10 < arrayList.size()) {
                TLRPC.TodoItem todoItem = ((p1) arrayList.get(i10)).f30855t;
                if (todoItem != null && todoItem.f28198id == i7) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final org.telegram.ui.ActionBar.r4 c3(String str) {
        ?? r12;
        int i7;
        int i10;
        boolean q10;
        int i11;
        Integer valueOf;
        org.telegram.ui.ActionBar.r4 r4Var = (org.telegram.ui.ActionBar.r4) Z1(str);
        gj gjVar = this.Q5;
        if (gjVar != null && gjVar.P3() && P2()) {
            int i12 = 0;
            if (!"drawableMsgOutSelected".equals(str) && !"drawableMsgOutMediaSelected".equals(str)) {
                r12 = 0;
            } else {
                r12 = 1;
            }
            if (!"drawableMsgOutMedia".equals(str) && !"drawableMsgOutMediaSelected".equals(str)) {
                i7 = 0;
            } else {
                i7 = 1;
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.Qb;
            int i13 = org.telegram.utils.twidget.m1.f54334c[0];
            if (e6Var != null) {
                i10 = e6Var.j(i13);
            } else {
                i10 = org.telegram.ui.ActionBar.j6.lm.get(i13);
            }
            if (i10 == 0) {
                valueOf = null;
            } else {
                if (e6Var != null) {
                    q10 = e6Var.a();
                } else {
                    q10 = org.telegram.ui.ActionBar.j6.I.q();
                }
                int b10 = org.telegram.utils.twidget.m1.b(e6Var, true);
                if (q10) {
                    i11 = -16777216;
                } else {
                    i11 = -1;
                }
                int w10 = org.telegram.ui.ActionBar.j6.w(i11, b10);
                if (r12 != 0) {
                    w10 = org.telegram.ui.ActionBar.j6.w(w10, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Sc, e6Var));
                }
                valueOf = Integer.valueOf(w10);
            }
            if (valueOf != null) {
                if (this.dc == null) {
                    this.dc = new org.telegram.ui.ActionBar.r4[4];
                }
                if (i7 != 0) {
                    i12 = 2;
                }
                int i14 = i12 + r12;
                org.telegram.ui.ActionBar.r4[] r4VarArr = this.dc;
                if (r4VarArr[i14] == null) {
                    r4VarArr[i14] = new org.telegram.ui.ActionBar.r4(i7, true, r12, this.Qb);
                }
                org.telegram.ui.ActionBar.r4 r4Var2 = this.dc[i14];
                r4Var2.f29573w = valueOf;
                return r4Var2;
            }
        }
        return r4Var;
    }

    public final hk0 c4() {
        if (this.Q5 != null && P2()) {
            return (hk0) this.Q5.f23874y2.f24445g.get(0);
        }
        return null;
    }

    @Override
    public final void computeScroll() {
        super.computeScroll();
        l0 l0Var = this.f31195w;
        if (l0Var != null) {
            l0Var.b();
        }
    }

    public final boolean d0(MotionEvent motionEvent) {
        m1 m1Var;
        m1 m1Var2;
        m1 m1Var3;
        m1 m1Var4;
        l1 l1Var;
        int i7;
        q1 q1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (!this.f31032jc && !this.f31045kc) {
            if (this.Q7 != null && (l1Var = this.Sa) != null && l1Var.l0()) {
                float x10 = motionEvent.getX();
                float N1 = N1(motionEvent);
                if (this.Q5.P5()) {
                    i7 = Math.max(this.X7, this.Z7) + this.U7;
                } else {
                    i7 = this.O6 + this.U7;
                }
                if (motionEvent.getAction() == 0) {
                    if (x10 >= this.U7 && x10 <= i7) {
                        float f10 = this.V7;
                        if (N1 >= f10 && N1 <= f10 + this.W7) {
                            this.f30963e8 = true;
                            getParent().requestDisallowInterceptTouchEvent(false);
                            this.f31015i8 = x10;
                            this.f31028j8 = getY() + N1;
                            y yVar = this.Ka;
                            if (yVar != null) {
                                yVar.setHotspot(x10, N1);
                                this.f30977f8 = false;
                                this.f30989g8 = true;
                                postDelayed(new d1(this, 3), ViewConfiguration.getTapTimeout() / 6);
                                invalidate();
                            }
                            dc dcVar = this.Fa;
                            if (dcVar != null) {
                                dcVar.c(true);
                                this.Ia = x10;
                                this.Ja = N1;
                            }
                            u();
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1) {
                        if (this.f30963e8) {
                            n();
                            this.f30963e8 = false;
                            y yVar2 = this.Ka;
                            if (yVar2 != null) {
                                if (!this.f30977f8) {
                                    yVar2.setState(new int[]{16842919, 16842910});
                                    post(new d1(this, 4));
                                } else {
                                    yVar2.setState(new int[0]);
                                }
                                this.f30977f8 = false;
                                this.f30989g8 = false;
                                invalidate();
                            }
                            dc dcVar2 = this.Fa;
                            if (dcVar2 != null) {
                                dcVar2.c(false);
                            }
                            playSoundEffect(0);
                            if (this.f31219xa) {
                                l1 l1Var2 = this.Sa;
                                if (l1Var2 != null) {
                                    TLRPC.Chat chat = this.f31177ua;
                                    if (chat != null) {
                                        l1Var2.U(this, chat, this.Q5.f23817k.fwd_from.channel_post, this.f30996h1, this.f31009i1, false);
                                        q1Var = this;
                                    } else {
                                        q1Var = this;
                                        TLRPC.User user = q1Var.f31150sa;
                                        if (user != null) {
                                            l1Var2.u0(this, user, q1Var.f30996h1, q1Var.f31009i1);
                                        } else if (q1Var.f31191va != null) {
                                            l1Var2.o(this);
                                        }
                                    }
                                }
                            } else {
                                q1Var = this;
                                if (q1Var.Sa != null && (q1Var.Q5.B2() || q1Var.Q5.f4() || q1Var.M7 || ((message = q1Var.Q5.f23817k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                                    q1Var.Sa.g2(q1Var, q1Var.Q5.N1(), x10, N1, false);
                                }
                            }
                        }
                    } else {
                        q1Var = this;
                        if (motionEvent.getAction() == 3) {
                            q1Var.f30963e8 = false;
                            q1Var.f30977f8 = false;
                            y yVar3 = q1Var.Ka;
                            if (yVar3 != null) {
                                yVar3.setState(new int[0]);
                            }
                            invalidate();
                            dc dcVar3 = q1Var.Fa;
                            if (dcVar3 != null) {
                                dcVar3.c(false);
                            }
                        } else if (motionEvent.getAction() == 2) {
                            if (x10 >= q1Var.U7 && x10 <= i7) {
                                float f11 = q1Var.V7;
                                if (N1 >= f11 && N1 <= f11 + q1Var.W7) {
                                    if (q1Var.Ka != null && q1Var.f30989g8) {
                                        if (Math.sqrt(Math.pow((getY() + N1) - q1Var.f31028j8, 2.0d) + Math.pow(x10 - q1Var.f31015i8, 2.0d)) > 0.75d) {
                                            q1Var.f30989g8 = false;
                                        }
                                    }
                                }
                            }
                            q1Var.f30963e8 = false;
                            q1Var.f30977f8 = false;
                            q1Var.f30989g8 = false;
                            y yVar4 = q1Var.Ka;
                            if (yVar4 != null) {
                                yVar4.setState(new int[0]);
                            }
                            invalidate();
                            dc dcVar4 = q1Var.Fa;
                            if (dcVar4 != null) {
                                dcVar4.c(false);
                            }
                        }
                    }
                    return q1Var.f30963e8;
                }
                q1Var = this;
                return q1Var.f30963e8;
            }
        } else {
            float x11 = motionEvent.getX();
            float N12 = N1(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                if (this.Sa != null) {
                    if (this.f31032jc && (m1Var4 = this.f31006hc) != null && D2(m1Var4, x11, N12)) {
                        m1Var2 = this.f31006hc;
                    } else if (this.f31045kc && (m1Var3 = this.f31019ic) != null && D2(m1Var3, x11, N12)) {
                        m1Var2 = this.f31019ic;
                    } else {
                        m1Var2 = null;
                    }
                    if (m1Var2 != null && (m1Var2.f30675a || this.Sa.l0())) {
                        this.f31069mc = m1Var2;
                        m1Var2.f30678e.c(true);
                        y yVar5 = m1Var2.f30683k;
                        if (yVar5 != null) {
                            yVar5.setHotspot(x11, N12);
                            m1Var2.f30683k.setState(new int[]{16842919, 16842910});
                        }
                        invalidate();
                        u();
                        return true;
                    }
                }
            } else if (action == 1) {
                m1 m1Var5 = this.f31069mc;
                if (m1Var5 != null) {
                    n();
                    e3();
                    playSoundEffect(0);
                    if (m1Var5.f30675a) {
                        TLRPC.Chat chat2 = this.f31177ua;
                        if (chat2 != null) {
                            this.Sa.U(this, chat2, this.Q5.f23817k.fwd_from.channel_post, this.f30996h1, this.f31009i1, false);
                            return true;
                        }
                        TLRPC.User user2 = this.f31150sa;
                        if (user2 != null) {
                            this.Sa.u0(this, user2, this.f30996h1, this.f31009i1);
                            return true;
                        }
                        this.Sa.o(this);
                        return true;
                    }
                    this.Sa.g2(this, this.Q5.N1(), x11, N12, false);
                    return true;
                }
            } else {
                if (action == 3) {
                    e3();
                } else if (action == 2 && (m1Var = this.f31069mc) != null && !D2(m1Var, x11, N12)) {
                    n();
                    e3();
                }
                if (this.f31069mc != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d1(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.d1(android.graphics.Canvas):void");
    }

    public final boolean d2() {
        if (this.f31062m3 != null) {
            return true;
        }
        return false;
    }

    public final void d3() {
        gj gjVar = this.Q5;
        if (gjVar != null && gjVar.B2 != null) {
            for (int i7 = 0; i7 < this.Q5.B2.size(); i7++) {
                dj djVar = (dj) this.Q5.B2.get(i7);
                y yVar = djVar.T;
                if (yVar != null) {
                    yVar.setCallback(this);
                    djVar.T.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.f31062m3 != null) {
            for (int i10 = 0; i10 < this.f31062m3.f23310e.size(); i10++) {
                dj djVar2 = (dj) this.f31062m3.f23310e.get(i10);
                y yVar2 = djVar2.T;
                if (yVar2 != null) {
                    yVar2.setCallback(this);
                    djVar2.T.setState(StateSet.NOTHING);
                }
            }
        }
        if (u2()) {
            invalidate();
        }
    }

    public final boolean d4() {
        if (this.Q5 != null && P2() && !u2()) {
            if ((TextUtils.isEmpty(this.Q5.f23875z) || this.f31197w1) && this.O.f5204p) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        gj gjVar;
        if (i7 == ns.f25532m1) {
            setSpoilersSuppressed(false);
        } else if (i7 == ns.l1) {
            setSpoilersSuppressed(true);
        } else if (i7 == ns.E0) {
            TLRPC.User user = this.f31030ja;
            if (user != null && user.f28200id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.Q5);
            }
        } else if (i7 == ns.f25514i4) {
            invalidate();
        } else if (i7 == ns.W2 && (gjVar = this.Q5) != null) {
            TLRPC.MessageMedia messageMedia = gjVar.f23817k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
                x3(gjVar, this.L, this.G, this.F, this.H, false);
            }
        }
    }

    @Override
    public final void e(float f10) {
        gj gjVar = this.Q5;
        if (gjVar == null) {
            return;
        }
        gjVar.f23777b0 = f10;
        MediaController.B().i0(this.Q5, f10);
        T3();
    }

    public final boolean e0(MotionEvent motionEvent) {
        gj gjVar = this.Q5;
        if (gjVar == null || gjVar.f23874y2 == null || gjVar.D != 36) {
            return false;
        }
        float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.f31008i0 + this.f31167u0;
        motionEvent.offsetLocation(-this.f31085o0, -topicSeparatorTopPadding);
        iv ivVar = this.Q5.f23874y2;
        l1 l1Var = this.Sa;
        ivVar.E = this;
        ivVar.F = l1Var;
        boolean M = ivVar.M(motionEvent);
        motionEvent.offsetLocation(this.f31085o0, topicSeparatorTopPadding);
        return M;
    }

    public final void e1(Canvas canvas, float f10) {
        if (!this.Q5.r4() && !this.Q5.G4() && !this.R1 && !this.T1 && !this.U1) {
            return;
        }
        E1().a(canvas, f10);
    }

    public final boolean e2() {
        return this.f31216x7;
    }

    public final void e3() {
        m1 m1Var = this.f31069mc;
        if (m1Var != null) {
            y yVar = m1Var.f30683k;
            if (yVar != null) {
                yVar.setState(StateSet.NOTHING);
            }
            this.f31069mc.f30678e.c(false);
            this.f31069mc = null;
            invalidate();
        }
    }

    @Override
    public final void f(RectF rectF) {
        RectF rectF2 = this.f31070md;
        if (rectF2 != null) {
            rectF.set(rectF2);
        } else {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public final boolean f0(int i7, MotionEvent motionEvent) {
        int i10;
        xh.f fVar;
        int i11;
        int i12;
        ej ejVar;
        ej ejVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        bj bjVar;
        if (i7 > 15 || getParent() == null) {
            return false;
        }
        boolean z10 = true;
        if (this.Q5.z2() && (bjVar = this.L) != null && !bjVar.f22713i) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                View childAt = viewGroup.getChildAt(i17);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    bj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    yi currentPosition = q1Var.getCurrentPosition();
                    if (currentMessagesGroup != null && currentMessagesGroup.f22707a == this.L.f22707a) {
                        int i18 = currentPosition.f27753l;
                        if ((i18 & 8) != 0 && (i18 & 1) != 0 && q1Var != this) {
                            motionEvent.offsetLocation(getLeft() - q1Var.getLeft(), getTop() - q1Var.getTop());
                            boolean f02 = q1Var.f0(i7 + 1, motionEvent);
                            motionEvent.offsetLocation(-(getLeft() - q1Var.getLeft()), -(getTop() - q1Var.getTop()));
                            return f02;
                        }
                    }
                }
            }
        }
        if (this.P5) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        int N1 = (int) N1(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        x1 x1Var = this.f31018ib;
        if (actionMasked == 0) {
            int i19 = this.f31085o0;
            if (x10 >= i19 && N1 >= (i15 = this.f31167u0)) {
                gj gjVar = this.Q5;
                if (x10 <= i19 + gjVar.f23862v2 && N1 <= gjVar.W5(x1Var) + i15) {
                    ArrayList arrayList = this.Q5.B2;
                    for (int i20 = 0; i20 < arrayList.size() && ((dj) arrayList.get(i20)).p(this.Q5.B2, x1Var) <= N1; i20++) {
                        dj djVar = (dj) arrayList.get(i20);
                        if (djVar.l()) {
                            i16 = (int) this.Q5.f23870x2;
                        } else {
                            i16 = 0;
                        }
                        ArrayList arrayList2 = djVar.f23100y;
                        int size = arrayList2.size();
                        int i21 = 0;
                        while (i21 < size) {
                            Object obj = arrayList2.get(i21);
                            i21++;
                            xh.f fVar2 = (xh.f) obj;
                            boolean z11 = z10;
                            if (fVar2.getBounds().contains((x10 - this.f31085o0) + i16, (int) ((N1 - this.f31167u0) - djVar.p(this.Q5.B2, x1Var)))) {
                                this.O5 = fVar2;
                                return z11;
                            }
                            z10 = z11;
                        }
                    }
                }
            }
            boolean z12 = z10;
            if (this.f31062m3 != null) {
                float f10 = x10;
                float f11 = this.f31145s3;
                if (f10 >= f11) {
                    float f12 = N1;
                    float f13 = this.f31157t3;
                    if (f12 >= f13 && f10 <= f11 + ejVar.f23309c && f12 <= f13 + ejVar.c(x1Var)) {
                        ArrayList arrayList3 = this.f31062m3.f23310e;
                        for (int i22 = 0; i22 < arrayList3.size() && ((dj) arrayList3.get(i22)).p(this.f31062m3.f23310e, x1Var) <= f12; i22++) {
                            dj djVar2 = (dj) arrayList3.get(i22);
                            if (djVar2.l()) {
                                i14 = (int) this.f31062m3.d;
                            } else {
                                i14 = 0;
                            }
                            ArrayList arrayList4 = djVar2.f23100y;
                            int size2 = arrayList4.size();
                            int i23 = 0;
                            while (i23 < size2) {
                                Object obj2 = arrayList4.get(i23);
                                i23++;
                                xh.f fVar3 = (xh.f) obj2;
                                ArrayList arrayList5 = arrayList3;
                                float f14 = f10;
                                if (fVar3.getBounds().contains((int) ((f10 - this.f31145s3) + i14), (int) ((f12 - this.f31157t3) - djVar2.p(this.f31062m3.f23310e, x1Var)))) {
                                    this.O5 = fVar3;
                                    return z12;
                                }
                                arrayList3 = arrayList5;
                                f10 = f14;
                            }
                        }
                    }
                }
            }
            if (this.f31115q3 == null) {
                return false;
            }
            float f15 = x10;
            float f16 = this.f31172u5;
            if (f15 < f16) {
                return false;
            }
            float f17 = N1;
            float f18 = this.f31186v5;
            if (f17 <= f18 || f15 > f16 + ejVar2.f23309c || f17 > f18 + ejVar2.c(x1Var)) {
                return false;
            }
            ArrayList arrayList6 = this.f31115q3.f23310e;
            for (int i24 = 0; i24 < arrayList6.size() && ((dj) arrayList6.get(i24)).p(this.f31115q3.f23310e, x1Var) <= f17; i24++) {
                dj djVar3 = (dj) arrayList6.get(i24);
                if (djVar3.l()) {
                    i13 = (int) this.f31115q3.d;
                } else {
                    i13 = 0;
                }
                ArrayList arrayList7 = djVar3.f23100y;
                int size3 = arrayList7.size();
                int i25 = 0;
                while (i25 < size3) {
                    Object obj3 = arrayList7.get(i25);
                    i25++;
                    xh.f fVar4 = (xh.f) obj3;
                    if (fVar4.getBounds().contains((int) ((f15 - this.f31172u5) + i13), (int) ((f17 - this.f31186v5) - djVar3.p(this.f31115q3.f23310e, x1Var)))) {
                        this.O5 = fVar4;
                        return z12;
                    }
                }
            }
            return false;
        } else if (actionMasked != 1 || this.O5 == null) {
            return false;
        } else {
            playSoundEffect(0);
            Path path = this.Vb;
            path.rewind();
            ej ejVar3 = this.f31115q3;
            if (ejVar3 != null) {
                ArrayList arrayList8 = ejVar3.f23310e;
                int size4 = arrayList8.size();
                int i26 = 0;
                while (i26 < size4) {
                    Object obj4 = arrayList8.get(i26);
                    i26++;
                    dj djVar4 = (dj) obj4;
                    ArrayList arrayList9 = djVar4.f23100y;
                    int size5 = arrayList9.size();
                    int i27 = 0;
                    while (i27 < size5) {
                        int i28 = i27 + 1;
                        Rect bounds = ((xh.f) arrayList9.get(i27)).getBounds();
                        path.addRect(bounds.left, djVar4.p(this.f31115q3.f23310e, x1Var) + bounds.top, bounds.right, djVar4.p(this.f31115q3.f23310e, x1Var) + bounds.bottom, Path.Direction.CW);
                        i27 = i28;
                    }
                }
            }
            ej ejVar4 = this.f31062m3;
            if (ejVar4 != null) {
                ArrayList arrayList10 = ejVar4.f23310e;
                int size6 = arrayList10.size();
                int i29 = 0;
                while (i29 < size6) {
                    Object obj5 = arrayList10.get(i29);
                    i29++;
                    dj djVar5 = (dj) obj5;
                    ArrayList arrayList11 = djVar5.f23100y;
                    int size7 = arrayList11.size();
                    int i30 = 0;
                    while (i30 < size7) {
                        int i31 = i30 + 1;
                        Rect bounds2 = ((xh.f) arrayList11.get(i30)).getBounds();
                        path.addRect(bounds2.left, djVar5.p(this.f31062m3.f23310e, x1Var) + bounds2.top, bounds2.right, djVar5.p(this.f31062m3.f23310e, x1Var) + bounds2.bottom, Path.Direction.CW);
                        i30 = i31;
                    }
                }
            } else {
                ArrayList arrayList12 = this.Q5.B2;
                if (arrayList12 != null) {
                    int size8 = arrayList12.size();
                    int i32 = 0;
                    while (i32 < size8) {
                        Object obj6 = arrayList12.get(i32);
                        i32++;
                        dj djVar6 = (dj) obj6;
                        ArrayList arrayList13 = djVar6.f23100y;
                        int size9 = arrayList13.size();
                        int i33 = 0;
                        while (i33 < size9) {
                            int i34 = i33 + 1;
                            Rect bounds3 = ((xh.f) arrayList13.get(i33)).getBounds();
                            path.addRect(bounds3.left, djVar6.p(this.Q5.B2, x1Var) + bounds3.top, bounds3.right, djVar6.p(this.Q5.B2, x1Var) + bounds3.bottom, Path.Direction.CW);
                            i33 = i34;
                        }
                    }
                }
            }
            RectF rectF = this.f30933c4;
            path.computeBounds(rectF, false);
            float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
            this.P5 = true;
            this.O5.f59995q = new d1(this, 8);
            ej ejVar5 = this.f31115q3;
            if (ejVar5 != null) {
                ArrayList arrayList14 = ejVar5.f23310e;
                int size10 = arrayList14.size();
                int i35 = 0;
                while (i35 < size10) {
                    Object obj7 = arrayList14.get(i35);
                    i35++;
                    dj djVar7 = (dj) obj7;
                    if (djVar7.l()) {
                        i12 = (int) this.f31115q3.d;
                    } else {
                        i12 = 0;
                    }
                    ArrayList arrayList15 = djVar7.f23100y;
                    int size11 = arrayList15.size();
                    int i36 = 0;
                    while (i36 < size11) {
                        Object obj8 = arrayList15.get(i36);
                        i36++;
                        ((xh.f) obj8).j((x10 - this.f31172u5) + i12, (N1 - djVar7.p(this.f31115q3.f23310e, x1Var)) - this.f31186v5, sqrt, false);
                        arrayList14 = arrayList14;
                    }
                }
            }
            ej ejVar6 = this.f31062m3;
            if (ejVar6 != null) {
                ArrayList arrayList16 = ejVar6.f23310e;
                int size12 = arrayList16.size();
                int i37 = 0;
                while (i37 < size12) {
                    Object obj9 = arrayList16.get(i37);
                    i37++;
                    dj djVar8 = (dj) obj9;
                    if (djVar8.l()) {
                        i11 = (int) this.f31062m3.d;
                    } else {
                        i11 = 0;
                    }
                    ArrayList arrayList17 = djVar8.f23100y;
                    int size13 = arrayList17.size();
                    int i38 = 0;
                    while (i38 < size13) {
                        Object obj10 = arrayList17.get(i38);
                        i38++;
                        ((xh.f) obj10).j((x10 - this.f31145s3) + i11, (N1 - djVar8.p(this.f31062m3.f23310e, x1Var)) - this.f31157t3, sqrt, false);
                        x10 = x10;
                    }
                }
            } else {
                ArrayList arrayList18 = this.Q5.B2;
                if (arrayList18 != null) {
                    int size14 = arrayList18.size();
                    int i39 = 0;
                    while (i39 < size14) {
                        Object obj11 = arrayList18.get(i39);
                        i39++;
                        dj djVar9 = (dj) obj11;
                        if (djVar9.l()) {
                            i10 = (int) this.Q5.f23870x2;
                        } else {
                            i10 = 0;
                        }
                        ArrayList arrayList19 = djVar9.f23100y;
                        int size15 = arrayList19.size();
                        int i40 = 0;
                        while (i40 < size15) {
                            Object obj12 = arrayList19.get(i40);
                            i40++;
                            ((xh.f) obj12).j((x10 - this.f31085o0) + i10, (N1 - djVar9.p(this.Q5.B2, x1Var)) - this.f31167u0, sqrt, false);
                        }
                    }
                }
            }
            if (getParent() instanceof uj0) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                for (int i41 = 0; i41 < viewGroup2.getChildCount(); i41++) {
                    View childAt2 = viewGroup2.getChildAt(i41);
                    if (childAt2 instanceof q1) {
                        q1 q1Var2 = (q1) childAt2;
                        ArrayList arrayList20 = q1Var2.Tb;
                        if (q1Var2.getMessageObject() != null && q1Var2.getMessageObject().N1() == getMessageObject().e1() && !arrayList20.isEmpty()) {
                            ((xh.f) arrayList20.get(0)).f59995q = new ea(6, this, q1Var2);
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
            this.O5 = null;
            return true;
        }
    }

    public final void f1(float r43, float r44, android.graphics.Canvas r45, java.util.ArrayList r46, float r47, boolean r48, float r49, boolean r50, boolean r51, boolean r52, boolean r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.f1(float, float, android.graphics.Canvas, java.util.ArrayList, float, boolean, float, boolean, boolean, boolean, boolean):void");
    }

    public final boolean f2() {
        if (u2() && a3()) {
            return true;
        }
        return false;
    }

    public final void f3() {
        r1 r1Var = this.f31198w2;
        if (r1Var != null) {
            r1Var.h = false;
        }
        dc dcVar = this.Ga;
        if (dcVar != null) {
            dcVar.c(false);
        }
        Drawable drawable = this.J2[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        r1 r1Var2 = this.f31198w2;
        if (r1Var2 != null && r1Var2.f31335g != null) {
            for (int i7 = 0; i7 < this.f31198w2.f31335g.size(); i7++) {
                n1 n1Var = (n1) this.f31198w2.f31335g.get(i7);
                dc dcVar2 = n1Var.f30718f;
                if (dcVar2 != null) {
                    dcVar2.c(false);
                }
                y yVar = n1Var.f30719g;
                if (yVar != null) {
                    yVar.setState(StateSet.NOTHING);
                }
            }
        }
    }

    @Override
    public final void g(float f10) {
        gj gjVar = this.Q5;
        if (gjVar == null) {
            return;
        }
        gjVar.f23777b0 = f10;
        gjVar.f23809i0 = (int) (gjVar.L0() * f10);
        T3();
    }

    public final void g0() {
        int i7;
        gj gjVar = this.Q5;
        if (gjVar != null) {
            TLRPC.MessageMedia n1 = gj.n1(gjVar.f23817k);
            if ((n1 instanceof TLRPC.TL_messageMediaDice) && ((TLRPC.TL_messageMediaDice) n1).game_outcome != null && !this.R) {
                Drawable t6 = this.U0.t();
                if (t6 instanceof ah0) {
                    ah0 ah0Var = (ah0) t6;
                    if ((ah0Var.f33588n0 != null || ah0Var.Z0) && !this.R && (i7 = ah0Var.K) != 1 && i7 == 2) {
                        if (!ah0Var.Y0) {
                            float t10 = ah0Var.t();
                            if (ah0Var.V0 != null) {
                                t10 = ah0Var.f33573b0 / ah0Var.f32992b1;
                            }
                            if (t10 <= 0.95f) {
                                return;
                            }
                        }
                        this.R = true;
                        l1 l1Var = this.Sa;
                        if (l1Var != null) {
                            l1Var.F1(this, false);
                        }
                    }
                }
            }
        }
    }

    public final void g1(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i7;
        int i10;
        Canvas canvas2;
        gj gjVar = this.Q5;
        if (gjVar != null && !gjVar.r4()) {
            float f13 = this.f31167u0;
            x1 x1Var = this.f31018ib;
            if (x1Var.f31971m2) {
                float f14 = x1Var.f31979o2;
                float f15 = x1Var.L1;
                f10 = (f15 * f13) + ((1.0f - f15) * f14);
            } else {
                f10 = f13;
            }
            if (x1Var.L1 != 1.0f && x1Var.H0) {
                canvas.save();
                org.telegram.ui.ActionBar.r4 r4Var = this.L6;
                if (r4Var != null) {
                    Rect bounds = r4Var.getBounds();
                    if (this.Q5.P3() && !this.C6 && !this.G) {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(10.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    } else {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(4.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    }
                }
                tg0 tg0Var = this.Ac;
                if (tg0Var != null && tg0Var.h) {
                    gj gjVar2 = this.Q5;
                    f1(this.f31085o0, f10, canvas, gjVar2.B2, gjVar2.f23870x2, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    f1(this.f31085o0, f10, canvas, x1Var.I0, x1Var.O0, false, 1.0f - x1Var.L1, true, false, false, false);
                    gj gjVar3 = this.Q5;
                    f1(this.f31085o0, f10, canvas, gjVar3.B2, gjVar3.f23870x2, true, x1Var.L1, true, false, false, false);
                    canvas2 = canvas;
                }
                canvas2.restore();
                return;
            }
            float f16 = f10;
            boolean z10 = x1Var.E1;
            if (z10 && this.L6 != null) {
                if (z10) {
                    int i11 = -1;
                    if (this.f31182v1) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                    float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, x1Var.L1, this.Q5.W5(x1Var) * i10, f13);
                    float f17 = x1Var.f31979o2;
                    if (this.f31182v1) {
                        i11 = 1;
                    }
                    f11 = f17 - ((this.Q5.W5(x1Var) * i11) * x1Var.L1);
                    f12 = z11;
                } else {
                    f11 = f16;
                    f12 = f11;
                }
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(this.L6.getBounds());
                if (this.Q5.P3() && !this.C6 && !this.G) {
                    rectF.left += org.telegram.messenger.g0.L(4.0f);
                    rectF.right -= org.telegram.messenger.g0.L(10.0f);
                } else {
                    rectF.left += org.telegram.messenger.g0.L(4.0f);
                    rectF.right -= org.telegram.messenger.g0.L(4.0f);
                }
                float f18 = rectF.left;
                float f19 = x1Var.f31979o2;
                canvas.clipRect(f18, f19, rectF.right, this.Q5.W5(x1Var) + f19 + org.telegram.messenger.g0.L(4.0f));
                gj gjVar4 = this.Q5;
                f1(this.f31085o0, f11, canvas, gjVar4.B2, gjVar4.f23870x2, false, 1.0f - x1Var.L1, true, false, false, false);
                canvas.restore();
                canvas.save();
                rectF.set(this.L6.getBounds());
                if (this.Q5.P3() && !this.C6 && !this.G) {
                    rectF.left += org.telegram.messenger.g0.L(4.0f);
                    rectF.right -= org.telegram.messenger.g0.L(10.0f);
                } else {
                    rectF.left += org.telegram.messenger.g0.L(4.0f);
                    rectF.right -= org.telegram.messenger.g0.L(4.0f);
                }
                canvas.clipRect(rectF.left, this.f31167u0, rectF.right, org.telegram.messenger.g0.L(4.0f) + this.Q5.W5(x1Var) + i7);
                gj gjVar5 = this.Q5;
                f1(this.f31085o0, f12, canvas, gjVar5.B2, gjVar5.f23870x2, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            gj gjVar6 = this.Q5;
            f1(this.f31085o0, f16, canvas, gjVar6.B2, gjVar6.f23870x2, true, 1.0f, true, false, false, false);
        }
    }

    public final boolean g2() {
        s1 s1Var = this.f31142s0;
        if (s1Var != null && s1Var.f31387b) {
            return true;
        }
        return false;
    }

    public final void g3(int i7) {
        n2.o0 o0Var;
        n2.o0 o0Var2 = this.f31171u4;
        if (i7 != -1) {
            Integer valueOf = Integer.valueOf(i7);
            for (int i10 = 0; i10 < o0Var2.f20829a; i10++) {
                if (((Pair) ((ArrayList) o0Var2.f20832e).get(i10)).second == valueOf) {
                    o0Var2.m(i10);
                }
            }
        } else {
            o0Var2.f(true);
        }
        s1 s1Var = this.f31142s0;
        if (s1Var != null && (o0Var = s1Var.f31392i) != null) {
            o0Var.f(true);
        }
        this.f31116q4 = null;
        s1 s1Var2 = this.f31142s0;
        if (s1Var2 != null) {
            s1Var2.f31393j = null;
        }
        if (this.f31131r4 != null) {
            if (this.f31185v4 == i7 || i7 == -1) {
                this.f31131r4 = null;
                this.f31185v4 = -1;
                this.f30966ec = false;
                this.fc = false;
                invalidate();
            }
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return new a1(this);
    }

    public int getAdditionalPaddingHeight() {
        return this.Fc;
    }

    public CharSequence getAdminAccessibilityText() {
        StaticLayout staticLayout = this.f30911a9;
        if (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f30911a9.getText());
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
        if (this.f30992gb) {
            return this.f31005hb;
        }
        return super.getAlpha();
    }

    public org.telegram.ui.Components.p5[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.getAnimatedEmojiSpans():org.telegram.ui.Components.p5[]");
    }

    public float getAnimationOffsetX() {
        return this.f31046kd;
    }

    public ImageReceiver getAvatarImage() {
        if (this.G6) {
            return this.A7;
        }
        return null;
    }

    public k90 getBackgroundDrawable() {
        return this.Ta;
    }

    public int getBackgroundDrawableBottom() {
        int i7;
        yi yiVar = this.M;
        int i10 = 0;
        if (yiVar != null) {
            int i11 = 4;
            if ((yiVar.f27753l & 4) == 0) {
                i7 = org.telegram.messenger.g0.L(3.0f);
            } else {
                i7 = 0;
            }
            if ((this.M.f27753l & 8) == 0) {
                gj gjVar = this.Q5;
                if (gjVar != null && gjVar.P3()) {
                    i11 = 3;
                }
                i7 += org.telegram.messenger.g0.L(i11);
            }
        } else {
            i7 = 0;
        }
        boolean z10 = this.K;
        if (!z10 || !this.J) {
            if (z10) {
                i10 = org.telegram.messenger.g0.L(1.0f);
            } else {
                i10 = org.telegram.messenger.g0.L(2.0f);
            }
        }
        int backgroundDrawableTop = ((getBackgroundDrawableTop() + this.f30962e7) - i10) + i7;
        if (!this.C6) {
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
        int i7;
        gj messageObject = getMessageObject();
        int i10 = 0;
        float f10 = 9.0f;
        if (messageObject != null && messageObject.P3()) {
            if (this.f31232yb) {
                return (this.f30949d7 - this.f30923b7) - ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(9.0f)));
            }
            int i11 = this.f30949d7 - this.f30923b7;
            if (this.C6) {
                i10 = org.telegram.messenger.g0.L(9.0f);
            }
            return i11 - i10;
        }
        float f11 = 71.0f;
        if (this.f31232yb) {
            if (!M2()) {
                if ((this.f30975f6 || ((messageObject != null && (messageObject.f23816j2 || messageObject.f23824l2 || messageObject.f23817k.guestchat_via_from != null)) || gj.B0(messageObject.f23817k) == 489000)) && this.G6) {
                    i10 = 48;
                }
                f11 = i10 + 3;
            }
            compactInShift = org.telegram.messenger.g0.L(f11) + ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(6.0f)));
        } else {
            if (!M2()) {
                if ((this.f30975f6 || ((messageObject != null && (messageObject.f23816j2 || messageObject.f23824l2 || messageObject.f23817k.guestchat_via_from != null)) || gj.B0(messageObject.f23817k) == 489000)) && this.G6) {
                    i10 = 48;
                }
                f11 = i10;
            }
            int L = org.telegram.messenger.g0.L(f11);
            if (!this.C6) {
                f10 = 3.0f;
            }
            compactInShift = getCompactInShift() + org.telegram.messenger.g0.L(f10) + L;
        }
        bj bjVar = this.L;
        if (bjVar != null && !bjVar.f22713i && (i7 = this.M.f27751j) != 0) {
            compactInShift += (int) Math.ceil((i7 / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.f31232yb) {
            if (this.K) {
                return compactInShift + ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(6.0f)));
            }
        } else if (!this.C6 && this.K) {
            return org.telegram.messenger.g0.L(6.0f) + compactInShift;
        }
        return compactInShift;
    }

    public int getBackgroundDrawableRight() {
        int L;
        int i7;
        int backgroundDrawableLeft;
        gj gjVar;
        gj gjVar2;
        int i10 = this.f30923b7;
        if (this.f31232yb) {
            i7 = i10 - ((int) (getVideoTranscriptionProgress() * org.telegram.messenger.g0.L(3.0f)));
            if (this.K && (gjVar2 = this.Q5) != null && gjVar2.P3()) {
                i7 = (int) (i7 - ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(6.0f)));
            }
            if (this.K && ((gjVar = this.Q5) == null || !gjVar.P3())) {
                i7 = (int) (i7 - ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(6.0f)));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            if (this.C6) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(3.0f);
            }
            i7 = i10 - L;
            if (!this.C6 && this.K) {
                i7 -= org.telegram.messenger.g0.L(6.0f);
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        }
        return backgroundDrawableLeft + i7;
    }

    public int getBackgroundDrawableTop() {
        int i7;
        yi yiVar = this.M;
        int i10 = 0;
        if (yiVar != null && (yiVar.f27753l & 4) == 0) {
            i7 = 0 - org.telegram.messenger.g0.L(3.0f);
        } else {
            i7 = 0;
        }
        if (!this.J) {
            i10 = org.telegram.messenger.g0.L(1.0f);
        }
        int i11 = i7 + i10;
        if (!this.C6 && this.J) {
            return i11 - org.telegram.messenger.g0.L(1.0f);
        }
        return i11;
    }

    public int getBackgroundHeight() {
        return this.f30940cb;
    }

    public ImageReceiver getBlurredPhotoImage() {
        return this.V0;
    }

    public int getBottomActionPadding() {
        x1 x1Var = this.f31018ib;
        if (x1Var.C1) {
            return org.telegram.messenger.g0.W1(x1Var.L1, x1Var.B1, this.f30955e0);
        }
        return this.f30955e0;
    }

    @Override
    public int getBoundsLeft() {
        boolean z10;
        int i7;
        int i10;
        float f10;
        int L;
        int i11;
        float f11;
        gj gjVar = this.Q5;
        if (gjVar != null && gjVar.P3()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Z2()) {
            if (this.M != null) {
                f11 = 73.0f;
            } else {
                gj gjVar2 = this.Q5;
                if (gjVar2 != null && gjVar2.f23816j2) {
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
        if (z10 && (X(this.Q5) || this.I4)) {
            i10 = org.telegram.messenger.g0.L(48.0f);
        } else {
            i10 = 0;
        }
        int backgroundDrawableLeft = (getBackgroundDrawableLeft() - i7) - i10;
        ArrayList arrayList = this.I5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            gj gjVar3 = this.Q5;
            if (gjVar3 != null && gjVar3.P3()) {
                L = (getMeasuredWidth() - widthForButtons) - org.telegram.messenger.g0.L(10.0f);
            } else {
                int i12 = this.N6;
                if (!this.C6 && !this.K) {
                    f10 = 7.0f;
                } else {
                    f10 = 1.0f;
                }
                L = i12 + org.telegram.messenger.g0.L(f10);
            }
            int i13 = Integer.MAX_VALUE;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                i13 = Math.max(i13, ((int) (((c0) arrayList.get(i14)).f30064c * widthForButtons)) + L);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i13);
        }
        if (this.T != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.T.k()) - org.telegram.messenger.g0.L(18.0f))) / 2);
        }
        if (this.f30969f0 != null) {
            backgroundDrawableLeft = Math.min(this.f30909a7 - ((int) getCompactSideMenuShift()), backgroundDrawableLeft);
        }
        return Math.max(0, backgroundDrawableLeft);
    }

    @Override
    public int getBoundsRight() {
        int i7;
        float f10;
        int L;
        gj gjVar = this.Q5;
        if (gjVar != null && !gjVar.P3() && (X(this.Q5) || this.I4)) {
            i7 = org.telegram.messenger.g0.L(48.0f);
        } else {
            i7 = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i7;
        ArrayList arrayList = this.I5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            gj gjVar2 = this.Q5;
            if (gjVar2 != null && gjVar2.P3()) {
                L = (getMeasuredWidth() - getWidthForButtons()) - org.telegram.messenger.g0.L(10.0f);
            } else {
                int i10 = this.N6;
                if (!this.C6 && !this.K) {
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
                i11 = Math.max(i11, ((int) (c0Var.f30064c * f11)) + L + ((int) (c0Var.f30065e * f11)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, i11);
        }
        if (this.T != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.T.k() + getParentWidth()) + org.telegram.messenger.g0.L(18.0f))) / 2);
        }
        if (this.f30969f0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public ej getCaptionLayout() {
        return this.f31062m3;
    }

    public float getCaptionX() {
        x1 x1Var = this.f31018ib;
        if (x1Var.f32012x0) {
            if (x1Var.D0) {
                this.f31145s3 += x1Var.f31947h0;
            } else if (x1Var.f31997t0) {
                float f10 = this.f31145s3;
                float f11 = x1Var.L1;
                this.f31145s3 = com.google.android.gms.internal.vision.e2.z(1.0f, f11, x1Var.f31989r0, f10 * f11);
            } else if (!gj.R4(this.Q5.f23817k) || !TextUtils.isEmpty(this.Q5.f23875z)) {
                this.f31145s3 += x1Var.f31947h0;
            }
        }
        return this.f31145s3;
    }

    public float getCaptionY() {
        float f10 = this.f31157t3;
        x1 x1Var = this.f31018ib;
        if (x1Var.f32012x0) {
            if (x1Var.D0) {
                return f10 - getTranslationY();
            }
            if (x1Var.f31997t0) {
                float f11 = x1Var.L1;
                return com.google.android.gms.internal.vision.e2.z(1.0f, f11, x1Var.f31993s0, f10 * f11);
            }
            return f10;
        }
        return f10;
    }

    @Override
    public float getCheckBoxTranslation() {
        return this.f31128r1;
    }

    public int getChecksX() {
        float f10;
        int i7 = this.f30949d7;
        if (gz.Y0 >= 10) {
            f10 = 27.3f;
        } else {
            f10 = 25.3f;
        }
        return i7 - org.telegram.messenger.g0.L(f10);
    }

    public int getChecksY() {
        float f10;
        int intrinsicHeight;
        if (this.Q5.P5()) {
            f10 = this.f31231y9;
            intrinsicHeight = Z1("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            f10 = this.f31231y9;
            intrinsicHeight = org.telegram.ui.ActionBar.j6.F3.getIntrinsicHeight();
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
        org.telegram.ui.ActionBar.r4 r4Var = this.L6;
        if (r4Var == null) {
            return 0;
        }
        int i7 = r4Var.getBounds().left;
        if (!this.Q5.P3() && this.f31018ib.A0 != 1.0f) {
            boolean z10 = this.f31232yb;
            if ((z10 || !this.C6) && !this.K) {
                if (z10) {
                    return (int) (i7 - (getVideoTranscriptionProgress() * org.telegram.messenger.g0.L(6.0f)));
                }
                return i7 - org.telegram.messenger.g0.L(6.0f);
            }
            return i7;
        }
        return i7;
    }

    public int getCurrentBackgroundRight() {
        boolean z10;
        org.telegram.ui.ActionBar.r4 r4Var = this.L6;
        if (r4Var == null) {
            return getWidth();
        }
        int i7 = r4Var.getBounds().right;
        if (this.Q5.P3() && this.f31018ib.A0 != 1.0f && (((z10 = this.f31232yb) || !this.C6) && !this.K)) {
            if (z10) {
                return (int) ((getVideoTranscriptionProgress() * org.telegram.messenger.g0.L(6.0f)) + i7);
            }
            return org.telegram.messenger.g0.L(6.0f) + i7;
        }
        return i7;
    }

    public TLRPC.Chat getCurrentChat() {
        return this.f31044ka;
    }

    public bj getCurrentMessagesGroup() {
        return this.L;
    }

    public yi getCurrentPosition() {
        return this.M;
    }

    public TLRPC.User getCurrentUser() {
        return this.f31030ja;
    }

    public l1 getDelegate() {
        return this.Sa;
    }

    @Override
    public float getDeltaBottom() {
        return this.f31018ib.f31957j0;
    }

    public float getDeltaLeft() {
        return this.f31018ib.f31947h0;
    }

    public float getDeltaRight() {
        return this.f31018ib.f31952i0;
    }

    public float getDeltaTop() {
        return this.f31018ib.f31961k0;
    }

    public float getDescriptionLayoutX() {
        int L;
        int extraTextX;
        float f10;
        float L2;
        int i7;
        int L3;
        int i10;
        boolean z10 = this.T1;
        float f11 = 0.0f;
        x1 x1Var = this.f31018ib;
        if (z10) {
            org.telegram.messenger.g0.L(14.0f);
            L2 = this.f31098p0 - org.telegram.messenger.g0.L(10.0f);
        } else {
            if (this.U1) {
                org.telegram.messenger.g0.L(14.0f);
                i7 = this.f31098p0;
                L3 = org.telegram.messenger.g0.L(1.0f);
            } else if (this.Q5.r4()) {
                org.telegram.messenger.g0.L(2.0f);
                i7 = this.f31098p0;
                L3 = org.telegram.messenger.g0.L(1.0f);
            } else {
                float f12 = 12.0f;
                if (this.Q5.P3()) {
                    f10 = getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + this.N6;
                    if (this.Q5.D == 19) {
                        f10 -= Math.max(0.0f, ((Math.max(this.X7, this.Z7) + f10) + org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.f23609q.x);
                    }
                } else {
                    if (this.C6) {
                        L = org.telegram.messenger.g0.L(12.0f) + this.N6;
                        extraTextX = getExtraTextX();
                    } else {
                        int i11 = this.N6;
                        if (!this.K) {
                            f12 = 18.0f;
                        }
                        L = org.telegram.messenger.g0.L(f12) + i11;
                        extraTextX = getExtraTextX();
                    }
                    f10 = extraTextX + L;
                }
                L2 = (f10 + x1Var.f31947h0) - org.telegram.messenger.g0.L(1.33f);
            }
            L2 = L3 + i7;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (x1Var != null) {
            f11 = x1Var.f31952i0;
        }
        float f13 = backgroundDrawableRight + f11;
        int i12 = 0;
        if (this.Q5.P3() && !this.C6 && !this.K) {
            i10 = 6;
        } else {
            i10 = 0;
        }
        int L4 = (int) (((f13 - org.telegram.messenger.g0.L(10 + i10)) - getExtraTextX()) - L2);
        float L5 = L2 + org.telegram.messenger.g0.L(10.0f);
        if (Math.abs(this.f30931c2) > 1) {
            i12 = ((L4 - org.telegram.messenger.g0.L(20.0f)) - this.f30918b2) - this.f30931c2;
        }
        return L5 + i12;
    }

    public float getDescriptionLayoutY() {
        float f10;
        float f11 = this.Y1;
        x1 x1Var = this.f31018ib;
        if (!x1Var.f31995s2) {
            f10 = (-x1Var.f31961k0) + x1Var.f31957j0;
        } else {
            f10 = 0.0f;
        }
        return f11 + f10;
    }

    public StaticLayout getDescriptionlayout() {
        return this.f31100p2;
    }

    public TLRPC.TL_availableEffect getEffect() {
        gj gjVar;
        yi yiVar = this.M;
        if ((yiVar != null && !yiVar.h) || (gjVar = this.Q5) == null) {
            return null;
        }
        return gjVar.M0();
    }

    public ej getExplanationLayout() {
        return this.f31115q3;
    }

    public float getExplanationX() {
        return this.f31172u5;
    }

    public float getExplanationY() {
        return this.f31186v5;
    }

    public int getExtraInsetHeight() {
        int i7;
        int i10 = this.f31199w3;
        boolean g22 = g2();
        ch.q0 q0Var = this.O;
        if (g22) {
            if (q0Var.f5204p) {
                i7 = 18;
            } else {
                i7 = 0;
            }
            i10 += org.telegram.messenger.g0.L(i7 + 2) + this.f31142s0.f31401r;
        }
        if (this.f31216x7) {
            i10 += getCommentButtonHeight();
        }
        if (!q0Var.f5204p) {
            this.Q5.getClass();
            return i10 + q0Var.f5202n;
        }
        return i10;
    }

    public int getExtraTextX() {
        int i7 = gz.Y0;
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
        if (u2()) {
            return 0;
        }
        if (!this.Q5.P3() && ((!this.C6 || this.f31062m3 != null) && (i7 = gz.Y0) > 11)) {
            return org.telegram.messenger.g0.L((i7 - 11) / 1.5f);
        }
        if (this.Q5.P3() || !this.f31245zb || !this.G6 || this.Q5.D != 5) {
            return 0;
        }
        return (int) ((org.telegram.messenger.g0.g3(this.X6, w2()) - org.telegram.messenger.g0.f23613u) * 0.7f);
    }

    public StaticLayout getFactCheckLayout() {
        s1 s1Var = this.f31142s0;
        if (s1Var != null) {
            return s1Var.f31391g;
        }
        return null;
    }

    public String getFilename() {
        int i7;
        int i10;
        gj gjVar = this.Q5;
        if (gjVar != null) {
            int i11 = gjVar.D;
            if (i11 == 1) {
                TLRPC.PhotoSize photoSize = this.f30959e4;
                if (photoSize != null) {
                    return org.telegram.messenger.w7.r(null, photoSize);
                }
            } else if (i11 != 8 && (i10 = this.M1) != 7 && i10 != 4 && i10 != 8 && i11 != 9 && i10 != 3 && i10 != 5) {
                if (i10 != 0) {
                    return org.telegram.messenger.w7.r(null, this.N1);
                }
                TLRPC.PhotoSize photoSize2 = this.f30959e4;
                if (photoSize2 != null) {
                    return org.telegram.messenger.w7.r(null, photoSize2);
                }
            } else if (!gjVar.E0) {
                if (gjVar.f23872y0 && !TextUtils.isEmpty(gjVar.f23817k.attachPath)) {
                    return this.Q5.f23817k.attachPath;
                }
                if (!this.Q5.n4() || (i7 = this.M1) == 3 || i7 == 5) {
                    return this.Q5.S0();
                }
            }
        }
        return null;
    }

    public int getForwardNameCenterX() {
        float f10;
        TLRPC.User user = this.f31030ja;
        if (user != null && user.f28200id == 0) {
            f10 = this.A7.r();
        } else {
            f10 = this.f31162t9 + this.J1;
        }
        return (int) f10;
    }

    public float getHighlightAlpha() {
        return P1(false);
    }

    public int getIconForCurrentState() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.getIconForCurrentState():int");
    }

    public float getLastTouchX() {
        return this.f30996h1;
    }

    public float getLastTouchY() {
        return this.f31009i1;
    }

    public int getLayoutHeight() {
        return this.f30962e7;
    }

    public int getMaxNameWidth() {
        int min;
        int L;
        gj gjVar;
        gj gjVar2;
        int i7;
        int i10;
        float f10;
        int L2;
        int parentWidth;
        yi yiVar;
        int i11 = this.M1;
        if (i11 != 6 && i11 != 8 && (i7 = (gjVar2 = this.Q5).D) != 5) {
            bj bjVar = this.L;
            int i12 = 0;
            if (bjVar != null && !bjVar.f22713i) {
                if (org.telegram.messenger.g0.Q1()) {
                    parentWidth = org.telegram.messenger.g0.Q0();
                } else {
                    parentWidth = getParentWidth();
                }
                i10 = 0;
                for (int i13 = 0; i13 < this.L.f22710e.size(); i13++) {
                    if (((yi) this.L.f22710e.get(i13)).f27746c != 0) {
                        break;
                    }
                    i10 = (int) (Math.ceil(((yiVar.f27747e + yiVar.f27751j) / 1000.0f) * parentWidth) + i10);
                }
                if (this.X6) {
                    i12 = 71;
                } else if (Z2()) {
                    i12 = 48;
                }
                L2 = org.telegram.messenger.g0.L(i12 + 31);
            } else if (i7 == 19) {
                int i14 = gjVar2.f23862v2;
                int L3 = org.telegram.messenger.g0.f23609q.x - org.telegram.messenger.g0.L(52.0f);
                if (this.G6) {
                    i12 = org.telegram.messenger.g0.L(48.0f);
                }
                return Math.max(i14, (int) ((L3 - i12) * 0.5f));
            } else {
                i10 = this.f30923b7;
                if (gjVar2.f23831n2 && gjVar2.P3() && X(this.Q5)) {
                    i10 -= org.telegram.messenger.g0.L(25.0f);
                }
                if (this.C6) {
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
            if (this.X6) {
                f11 = 71.0f;
            } else if (Z2()) {
                f11 = 42.0f;
            }
            L = org.telegram.messenger.g0.L(f11);
        } else {
            min = Math.min(getParentWidth(), org.telegram.messenger.g0.f23609q.y);
            if (this.X6) {
                f11 = 71.0f;
            } else if (Z2()) {
                f11 = 42.0f;
            }
            L = org.telegram.messenger.g0.L(f11);
        }
        int i15 = min - L;
        gj gjVar3 = this.Q5;
        if (gjVar3 != null && gjVar3.f23831n2 && gjVar3.P3() && X(this.Q5)) {
            i15 -= org.telegram.messenger.g0.L(25.0f);
        }
        if (this.f31245zb && ((gjVar = this.Q5) == null || !gjVar.T4())) {
            return (i15 - (this.f30923b7 - (org.telegram.messenger.g0.g3(this.X6, w2()) - org.telegram.messenger.g0.f23613u))) - org.telegram.messenger.g0.L(57.0f);
        }
        if (this.X6 && (this.Q5.D == 5 || this.M1 == 6)) {
            return this.f30923b7 - org.telegram.messenger.g0.L(57.0f);
        }
        return (i15 - this.f30923b7) - org.telegram.messenger.g0.L(57.0f);
    }

    public int getMediaOffsetY() {
        x1 x1Var = this.f31018ib;
        if (x1Var.f31917a2) {
            return org.telegram.messenger.g0.W1(x1Var.L1, x1Var.Z1, this.X1);
        }
        return this.X1;
    }

    @Override
    public gj getMessageObject() {
        gj gjVar = this.R5;
        if (gjVar != null) {
            return gjVar;
        }
        return this.Q5;
    }

    public int getMiniIconForCurrentState() {
        int i7 = this.X3;
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
        float f10 = this.f31003h9 + this.f30990g9;
        int i10 = this.R6;
        if (i10 > 0) {
            i7 = i10 - org.telegram.messenger.g0.L(32.0f);
        } else {
            i7 = this.W8;
        }
        return (int) (f10 + i7 + org.telegram.messenger.g0.L(2.0f) + (org.telegram.messenger.g0.L(20.0f) / 2));
    }

    public int getNameStatusY() {
        int height;
        float f10 = this.f31016i9;
        StaticLayout staticLayout = this.V8;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight();
        }
        return (int) (f10 + (height / 2));
    }

    public int getNoSoundIconCenterX() {
        return this.I1;
    }

    @Override
    public int getObserverTag() {
        return this.Z5;
    }

    public float getPaddingTopAnimated() {
        return getTopicSeparatorTopPadding() + this.W + this.f31008i0;
    }

    public int getParentWidth() {
        int i7;
        gj gjVar = this.Q5;
        if (gjVar == null) {
            gjVar = this.R5;
        }
        if (gjVar != null && gjVar.f23854t1 && (i7 = this.L0) > 0) {
            return i7;
        }
        return org.telegram.messenger.g0.f23609q.x;
    }

    public float getPhotoBottom() {
        if (d4()) {
            float f10 = this.f30941cc;
            if (f10 > 0.0f) {
                return f10;
            }
            return this.f30962e7 - org.telegram.messenger.g0.L(5.0f);
        }
        l4 l4Var = this.X5;
        if (l4Var != null) {
            return l4Var.f30612e + l4Var.h;
        }
        return this.U0.A();
    }

    public ImageReceiver getPhotoImage() {
        return this.U0;
    }

    public ArrayList<p1> getPollButtons() {
        return this.Q4;
    }

    public float getPollButtonsLeft() {
        int L;
        if (getMessageObject() != null && getMessageObject().P3()) {
            L = (org.telegram.messenger.g0.L(3.0f) + this.f30949d7) - this.f30923b7;
        } else if (this.Y6) {
            L = org.telegram.messenger.g0.L(82.0f);
        } else if (Z2()) {
            L = org.telegram.messenger.g0.L(59.0f);
        } else {
            L = org.telegram.messenger.g0.L(11.0f);
        }
        return L;
    }

    public float getPollButtonsRight() {
        return (getPollButtonsLeft() + this.f30923b7) - org.telegram.messenger.g0.L(15.0f);
    }

    public gj getPrimaryMessageObject() {
        gj gjVar;
        gj gjVar2 = this.Q5;
        if (gjVar2 != null && this.L != null && gjVar2.z2()) {
            gjVar = this.L.c();
        } else {
            gjVar = null;
        }
        if (gjVar != null) {
            return gjVar;
        }
        return this.Q5;
    }

    public RadialProgress2 getRadialProgress() {
        return this.Q0;
    }

    public ch.q0 getReactionsLayout() {
        return this.O;
    }

    public int getRepliesCount() {
        bj bjVar = this.L;
        if (bjVar != null && !bjVar.d.isEmpty()) {
            return ((gj) this.L.d.get(0)).M1();
        }
        return this.Q5.M1();
    }

    public org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        return this.Qb;
    }

    public RectF getScrimBlockBounds() {
        return this.f31070md;
    }

    public tm0 getSeekBarWaveform() {
        return this.E4;
    }

    public float getSideButtonStartX() {
        return this.R8;
    }

    public float getSideButtonStartY() {
        return this.S8;
    }

    @Override
    public float getSlidingOffsetX() {
        return this.f31033jd;
    }

    public long getStarsPrice() {
        TLRPC.Message message;
        long j3;
        TLRPC.Message message2;
        bj bjVar = this.L;
        if (bjVar != null) {
            ArrayList arrayList = bjVar.d;
            int size = arrayList.size();
            int i7 = 0;
            long j10 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                gj gjVar = (gj) obj;
                if (gjVar != null && (message2 = gjVar.f23817k) != null) {
                    j3 = message2.paid_message_stars;
                } else {
                    j3 = 0;
                }
                j10 += j3;
            }
            return j10;
        }
        gj gjVar2 = this.Q5;
        if (gjVar2 == null || (message = gjVar2.f23817k) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        x1 x1Var = this.f31018ib;
        if (x1Var.f32021z1) {
            return org.telegram.messenger.g0.W1(x1Var.L1, x1Var.f32017y1, this.W);
        }
        return this.W;
    }

    public TLRPC.Document getStreamingMedia() {
        int i7 = this.M1;
        if (i7 != 4 && i7 != 7 && i7 != 2) {
            return null;
        }
        return this.N1;
    }

    public int getTextX() {
        return this.f31085o0;
    }

    public int getTextY() {
        return this.f31167u0;
    }

    public float getTimeAlpha() {
        return this.f31038k4;
    }

    public float getTimeX() {
        int i7;
        x1 x1Var = this.f31018ib;
        if (x1Var.f31953i1) {
            i7 = org.telegram.messenger.g0.W1(x1Var.L1, x1Var.f31948h1, this.C9);
        } else {
            i7 = this.C9;
        }
        return i7;
    }

    public float getTimeY() {
        int i7;
        int i10 = 0;
        if (G3()) {
            if (this.f31216x7) {
                i10 = u2() ? getCommentButtonHeight() : org.telegram.messenger.g0.L(41.3f);
            }
        } else if (this.Q5.r4()) {
            i7 = -org.telegram.messenger.g0.L(48.0f);
            if (this.f30936c7) {
                i7 -= org.telegram.messenger.g0.L(4.0f);
            }
            return b2(i7);
        } else if (this.f31216x7) {
            i10 = u2() ? getCommentButtonHeight() : org.telegram.messenger.g0.L(43.0f);
        }
        i7 = -i10;
        return b2(i7);
    }

    public int getTopMediaOffset() {
        gj gjVar = this.Q5;
        if (gjVar != null && gjVar.D == 14) {
            return this.X1 + this.Ua;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        x1 x1Var = this.f31018ib;
        if (x1Var.f32005v1) {
            return org.telegram.messenger.g0.W1(x1Var.L1, x1Var.f32002u1, this.f30981g0);
        }
        return this.f30981g0;
    }

    public x1 getTransitionParams() {
        return this.f31018ib;
    }

    public float getVideoTranscriptionProgress() {
        gj gjVar;
        x1 x1Var = this.f31018ib;
        if (x1Var == null || (gjVar = this.Q5) == null || !gjVar.h4()) {
            return 1.0f;
        }
        if (x1Var.f31970m1) {
            if (this.I6) {
                return x1Var.L1;
            }
            return 1.0f - x1Var.L1;
        } else if (this.I6) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public float getViewTop() {
        return this.f30927bb;
    }

    public int getWidthForButtons() {
        x1 x1Var = this.f31018ib;
        if (x1Var.O1) {
            return org.telegram.messenger.g0.W1(x1Var.L1, x1Var.P1, this.K5);
        }
        return this.K5;
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        if (this.f31070md == null) {
            draw(canvas);
            return;
        }
        canvas.save();
        Path path = this.f31084nd;
        path.rewind();
        path.addRoundRect(this.f31070md, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
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
        if (!this.f31149s8 || this.f31204w8 == null || this.Ha == null || this.Sa == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float N1 = N1(motionEvent);
        int action = motionEvent.getAction();
        RectF rectF = this.Na;
        if (action == 0) {
            if (rectF.contains(x10, N1)) {
                this.Ha.c(true);
                y yVar = this.f31189v8;
                if (yVar != null) {
                    yVar.setHotspot(x10, N1);
                    this.f31189v8.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.Ha.f33917i && !rectF.contains(x10, N1)) {
                this.Ha.c(false);
                y yVar2 = this.f31189v8;
                if (yVar2 != null) {
                    yVar2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Ha.f33917i) {
                this.Sa.I0(this);
            }
            this.Ha.c(false);
            y yVar3 = this.f31189v8;
            if (yVar3 != null) {
                yVar3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.Ha.c(false);
            y yVar4 = this.f31189v8;
            if (yVar4 != null) {
                yVar4.setState(new int[0]);
            }
        }
        return this.Ha.f33917i;
    }

    public final void h1(android.graphics.Canvas r55, float r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.h1(android.graphics.Canvas, float):void");
    }

    public final boolean h2() {
        org.telegram.ui.ActionBar.e6 e6Var = this.Qb;
        if (e6Var != null) {
            return e6Var.g();
        }
        return org.telegram.ui.ActionBar.j6.d1();
    }

    public final void h3() {
        if (this.f31088o3 != null) {
            this.f31088o3 = null;
        }
        ArrayList arrayList = this.f31213x4;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f31200w4.addAll(arrayList);
        arrayList.clear();
    }

    @Override
    public final void i(long j3, long j10) {
        float min;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.Q5.H0 = j3;
        z0(j3, j10);
        if (this.f31235z1) {
            this.R0.p(true, min);
        } else {
            this.Q0.p(true, min);
        }
        int i7 = this.M1;
        if (i7 != 3 && i7 != 5) {
            if (this.W3 != 0) {
                if (this.X3 != 1) {
                    P3(false, false, false);
                }
            } else if (this.O3 != 1) {
                P3(false, false, false);
            }
        } else if (this.W3 != 0) {
            if (this.X3 != 1) {
                P3(false, false, false);
            }
        } else if (this.O3 != 4) {
            P3(false, false, false);
        }
    }

    public final boolean i0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.i0(android.view.MotionEvent):boolean");
    }

    public final void i1(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.i1(android.graphics.Canvas):void");
    }

    public final boolean i2() {
        gj gjVar = this.Q5;
        if ((gjVar != null && gjVar.s2()) || this.M5) {
            return true;
        }
        return false;
    }

    public final void i3() {
        CharSequence charSequence;
        long j3;
        long j10;
        long j11;
        long j12;
        d1 d1Var = this.Yb;
        b9.g0 g0Var = this.f31208x;
        g0Var.a(d1Var);
        d1 d1Var2 = this.Zb;
        g0Var.a(d1Var2);
        gj gjVar = this.Q5;
        if (gjVar != null) {
            if (!TextUtils.isEmpty(gjVar.f23875z)) {
                charSequence = this.Q5.f23875z;
            } else {
                charSequence = this.Q5.v;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i7 = d00.f33772e;
                int i10 = 0;
                ArrayList arrayList = null;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    d00[] d00VarArr = (d00[]) spanned.getSpans(0, spanned.length(), d00.class);
                    for (d00 d00Var : d00VarArr) {
                        if (d00Var.f33774b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(d00VarArr.length);
                            }
                            arrayList.add(Integer.valueOf(d00Var.f33774b.date));
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
                        g0Var.a(d1Var2);
                        vs vsVar = new vs(25, g0Var, d1Var2);
                        g0Var.f3007a.put(d1Var2, vsVar);
                        if (j16 > 0) {
                            org.telegram.messenger.g0.i3(vsVar, j16);
                        } else {
                            org.telegram.messenger.g0.h3(vsVar);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void invalidate() {
        l1 l1Var;
        if (this.Q5 == null) {
            return;
        }
        Runnable runnable = this.f32091e;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.Dc;
        if (runnable2 != null) {
            runnable2.run();
            return;
        }
        Runnable runnable3 = this.Ec;
        if (runnable3 != null) {
            runnable3.run();
        }
        super.invalidate();
        if ((this.f30922b6 || (this.L != null && r2())) && getParent() != null) {
            View view = (View) getParent();
            if (view.getParent() != null) {
                view.invalidate();
                ((View) view.getParent()).invalidate();
            }
        }
        if (!this.Wb || (l1Var = this.Sa) == null) {
            return;
        }
        l1Var.p();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (this.L != null) {
            s2();
        }
    }

    @Override
    public final boolean j() {
        bj bjVar = this.L;
        if (bjVar != null && bjVar.f22713i) {
            yi yiVar = this.M;
            if (yiVar != null && (yiVar.f27753l & 4) != 0) {
                return this.F;
            }
            return true;
        }
        return this.F;
    }

    public final boolean j0(MotionEvent motionEvent) {
        i9 z22;
        boolean z10;
        boolean z11;
        int i7;
        int L;
        int i10;
        s1 s1Var;
        int L2;
        int extraTextX;
        int i11;
        bj bjVar;
        l1 l1Var = this.Sa;
        if (l1Var != null && (z22 = l1Var.z2()) != null && (z22.b() || z22.e())) {
            ArrayList arrayList = this.Q5.B2;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            iv ivVar = this.Q5.f23874y2;
            if (ivVar != null && !ivVar.f24451n.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((z10 || d2() || z11) && ((this.f31035k1 || this.L != null) && (this.L == null || this.Sa.R()))) {
                if (this.Q5.z2() && (bjVar = this.L) != null && !bjVar.f22713i) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                            View childAt = viewGroup.getChildAt(i12);
                            if (childAt instanceof q1) {
                                q1 q1Var = (q1) childAt;
                                bj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                                yi currentPosition = q1Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.f22707a == this.L.f22707a && (currentPosition.f27753l & D()) != 0 && (currentPosition.f27753l & 1) != 0) {
                                    z22.f31739c = (int) q1Var.f31145s3;
                                    z22.d = (int) q1Var.f31157t3;
                                    z22.b0(q1Var);
                                    if (q1Var == this) {
                                        return z22.M(motionEvent);
                                    }
                                    motionEvent.offsetLocation(getLeft() - q1Var.getLeft(), getTop() - q1Var.getTop());
                                    boolean M = z22.M(motionEvent);
                                    motionEvent.offsetLocation(-(getLeft() - q1Var.getLeft()), -(getTop() - q1Var.getTop()));
                                    return M;
                                }
                            }
                        }
                    }
                } else {
                    gj gjVar = this.Q5;
                    if (gjVar != null && !gjVar.f23854t1 && (s1Var = this.f31142s0) != null && s1Var.f31391g != null && N1(motionEvent) >= this.f31127r0) {
                        z22.f30451r0 = false;
                        z22.f30453t0 = true;
                        z22.f30455v0 = false;
                        bj bjVar2 = this.L;
                        if (bjVar2 != null && !bjVar2.f22713i) {
                            i11 = (int) this.f31145s3;
                        } else {
                            float f10 = 12.0f;
                            if (this.Q5.P3()) {
                                int extraTextX2 = getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + this.N6;
                                if (this.Q5.D == 19) {
                                    i11 = extraTextX2 - Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(this.X7, this.Z7) + extraTextX2)) - org.telegram.messenger.g0.f23609q.x);
                                } else {
                                    i11 = extraTextX2;
                                }
                            } else {
                                if (this.C6) {
                                    L2 = org.telegram.messenger.g0.L(12.0f) + this.N6;
                                    extraTextX = getExtraTextX();
                                } else {
                                    int i13 = this.N6;
                                    if (!this.K) {
                                        f10 = 18.0f;
                                    }
                                    L2 = org.telegram.messenger.g0.L(f10) + i13;
                                    extraTextX = getExtraTextX();
                                }
                                i11 = extraTextX + L2;
                            }
                        }
                        int L3 = ((int) (i11 + this.f31018ib.f31947h0)) - org.telegram.messenger.g0.L(1.33f);
                        int i14 = this.f31127r0;
                        z22.f31739c = (org.telegram.messenger.g0.L(10.0f) + L3) - this.f31142s0.f31398o;
                        z22.d = org.telegram.messenger.g0.L(22.0f) + i14;
                    } else {
                        if (z11 && P2()) {
                            if (N1(motionEvent) < this.Q5.f23874y2.t() + this.f31167u0) {
                                z22.f30451r0 = false;
                                z22.f30453t0 = false;
                                z22.f30455v0 = true;
                                int i15 = this.f31085o0;
                                int i16 = this.f31167u0;
                                z22.f31739c = i15;
                                z22.d = i16;
                            }
                        }
                        if (d2()) {
                            z22.f30451r0 = false;
                            z22.f30453t0 = false;
                            z22.f30455v0 = false;
                            z22.f31739c = (int) this.f31145s3;
                            z22.d = (int) this.f31157t3;
                        } else {
                            gj gjVar2 = this.Q5;
                            if (gjVar2 != null && !gjVar2.f23854t1 && this.f31100p2 != null && (!this.f31182v1 ? N1(motionEvent) > this.Y1 : N1(motionEvent) < this.f31167u0)) {
                                z22.f30451r0 = true;
                                z22.f30453t0 = false;
                                z22.f30455v0 = false;
                                if (this.T1) {
                                    i10 = this.f31098p0 - org.telegram.messenger.g0.L(10.0f);
                                } else {
                                    if (this.U1) {
                                        i7 = this.f31098p0;
                                        L = org.telegram.messenger.g0.L(1.0f);
                                    } else {
                                        i7 = this.f31098p0;
                                        L = org.telegram.messenger.g0.L(1.0f);
                                    }
                                    i10 = i7 + L;
                                }
                                int L4 = org.telegram.messenger.g0.L(10.0f) + i10 + this.f30904a2;
                                int i17 = this.Y1;
                                z22.f31739c = L4;
                                z22.d = i17;
                            } else if (z11) {
                                z22.f30451r0 = false;
                                z22.f30453t0 = false;
                                z22.f30455v0 = true;
                                int i18 = this.f31085o0;
                                int i19 = this.f31167u0;
                                z22.f31739c = i18;
                                z22.d = i19;
                            } else {
                                z22.f30451r0 = false;
                                z22.f30453t0 = false;
                                z22.f30455v0 = false;
                                int i20 = this.f31085o0;
                                int i21 = this.f31167u0;
                                z22.f31739c = i20;
                                z22.d = i21;
                            }
                        }
                    }
                    z22.b0(this);
                    return z22.M(motionEvent);
                }
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

    public final void j3(int i7, int i10, String str) {
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

    public final boolean k0(MotionEvent motionEvent) {
        if (this.Q5.r4() && this.Q5.f23778b1) {
            int x10 = (int) motionEvent.getX();
            int N1 = (int) N1(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f10 = x10;
                if (f10 >= this.f31036k2 - org.telegram.messenger.g0.L(6.0f) && f10 <= this.f31036k2 + this.f31010i2 + org.telegram.messenger.g0.L(6.0f)) {
                    float f11 = N1;
                    if (f11 >= this.f31048l2 - org.telegram.messenger.g0.L(2.0f) && f11 <= this.f31048l2 + this.f31023j2 + org.telegram.messenger.g0.L(2.0f)) {
                        dc dcVar = this.f31073n2;
                        if (dcVar != null) {
                            dcVar.c(true);
                        }
                        this.f31061m2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.f31061m2) {
                l1 l1Var = this.Sa;
                if (l1Var != null) {
                    l1Var.U1();
                }
                dc dcVar2 = this.f31073n2;
                if (dcVar2 != null) {
                    dcVar2.c(false);
                }
                playSoundEffect(0);
                this.f31061m2 = false;
            }
        }
        return false;
    }

    public final void k1(Canvas canvas, RectF rectF) {
        float f10;
        Path path = this.B4;
        path.rewind();
        path.addRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        fi.u2 u2Var = this.U0;
        float alpha = u2Var.getAlpha();
        if (this.Q5.g4()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        u2Var.setAlpha(f10 * alpha);
        u2Var.h(canvas, null);
        u2Var.setAlpha(alpha);
        canvas.restore();
        Paint a22 = a2("paintChatTimeBackground");
        int alpha2 = a22.getAlpha();
        a22.setAlpha((int) (alpha2 * this.f31050l4 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, a22);
        a22.setAlpha(alpha2);
    }

    public final boolean k2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.k2():boolean");
    }

    public final void k3(boolean z10, boolean z11) {
        bj bjVar;
        bj bjVar2;
        gj gjVar;
        if (!z11 || (gjVar = this.Q5) == null || !gjVar.f23772a0) {
            if (z10) {
                this.f31088o3 = null;
                CheckBoxBase checkBoxBase = this.f31060m1;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, this.Qb);
                    this.f31060m1 = checkBoxBase2;
                    if (this.O0) {
                        checkBoxBase2.f32436l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.e6 e6Var = this.Qb;
                    if (checkBoxBase.F != e6Var) {
                        checkBoxBase.F = e6Var;
                        checkBoxBase.b();
                    }
                }
            }
            if (z10 && (((bjVar = this.L) != null && bjVar.d.size() > 1) || ((bjVar2 = this.S5) != null && bjVar2.d.size() > 1))) {
                CheckBoxBase checkBoxBase3 = this.l1;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, this, this.Qb);
                    this.l1 = checkBoxBase4;
                    if (!checkBoxBase4.f32448y) {
                        checkBoxBase4.f32448y = true;
                        checkBoxBase4.b();
                    }
                    if (this.O0) {
                        this.l1.f32436l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.e6 e6Var2 = this.Qb;
                    if (checkBoxBase3.F != e6Var2) {
                        checkBoxBase3.F = e6Var2;
                        checkBoxBase3.b();
                    }
                }
            }
            float f10 = 0.0f;
            if (this.n1 == z10) {
                if (z11 != this.f31086o1 && !z11) {
                    if (z10) {
                        f10 = 1.0f;
                    }
                    this.f31099p1 = f10;
                    invalidate();
                    return;
                }
                return;
            }
            this.f31086o1 = z11;
            this.n1 = z10;
            if (z11) {
                this.f31113q1 = SystemClock.elapsedRealtime();
            } else {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f31099p1 = f10;
            }
            invalidate();
        }
    }

    @Override
    public final boolean l() {
        return this.f31244za;
    }

    public final boolean l0(MotionEvent motionEvent) {
        b1 b1Var;
        y yVar;
        if (this.I4 && ((!this.f31245zb || getVideoTranscriptionProgress() > 0.0f || this.T2) && (b1Var = this.J4) != null)) {
            int action = motionEvent.getAction();
            float x10 = motionEvent.getX();
            float N1 = N1(motionEvent);
            if (action != 1 && action != 3) {
                if (b1Var.v.contains((int) x10, (int) N1)) {
                    if (action == 0) {
                        b1Var.A = true;
                    }
                    if (b1Var.A && (yVar = b1Var.f41525q) != null) {
                        yVar.setHotspot(x10, N1);
                        b1Var.f41525q.setState(x11.N);
                        b1Var.f41526r.invalidate();
                    }
                    return true;
                }
            } else if (b1Var.A && action == 1) {
                b1Var.n();
                return true;
            } else {
                b1Var.A = false;
            }
        }
        return false;
    }

    public boolean l1(Canvas canvas) {
        org.telegram.ui.Components.t5 m10;
        int i7;
        boolean z10;
        gj gjVar = this.Q5;
        fi.u2 u2Var = this.U0;
        if (gjVar != null && gjVar.D3() && (m10 = u2Var.m()) != null && (i7 = m10.d[4]) > 0) {
            float l10 = 1.0f - Utilities.l(((i7 - 90) - m10.o()) / 500.0f);
            if (l10 > 0.0f) {
                if (l10 < 1.0f) {
                    z10 = u2Var.h(canvas, null);
                } else {
                    z10 = true;
                }
                u2Var.U0 = true;
                float alpha = u2Var.getAlpha();
                u2Var.setAlpha(l10 * alpha);
                u2Var.h(canvas, null);
                u2Var.setAlpha(alpha);
                u2Var.U0 = false;
                return z10;
            }
        }
        return u2Var.h(canvas, null);
    }

    public final boolean l2() {
        gj gjVar = this.Q5;
        if (gjVar != null && gjVar.O5()) {
            yi yiVar = this.M;
            if (yiVar != null) {
                int i7 = yiVar.f27753l;
                if ((i7 & 8) == 0 || (i7 & 1) == 0) {
                    return false;
                }
            }
            this.O.getClass();
            return true;
        }
        return false;
    }

    public final void l3(boolean z10, boolean z11) {
        this.D6 = z10;
        this.f31202w6 = z11;
        U3();
        if (this.C4) {
            this.E4.f39737o = y2();
        } else {
            this.D4.f37650p = y2();
        }
        invalidate();
    }

    @Override
    public final boolean m() {
        bj bjVar = this.L;
        if (bjVar != null && bjVar.f22713i) {
            yi yiVar = this.M;
            if (yiVar != null && (yiVar.f27753l & 8) != 0) {
                return this.G;
            }
            return true;
        }
        return this.G;
    }

    public final boolean m0() {
        gj gjVar = this.Q5;
        if (gjVar != null && gjVar.D == 17) {
            TLRPC.MessageMedia n1 = gj.n1(gjVar.f23817k);
            if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                return ((TLRPC.TL_messageMediaPoll) n1).results.has_unread_votes;
            }
        }
        return false;
    }

    public final void m1(Canvas canvas, int i7) {
        int i10;
        ej ejVar;
        gj gjVar;
        l1 l1Var = this.Sa;
        int i11 = 0;
        if (l1Var != null) {
            if (!l1Var.z1(this, 1)) {
                this.A4 = null;
                ArrayList arrayList = this.f31238z4;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < this.f31238z4.size(); i12++) {
                        o1 o1Var = (o1) this.f31238z4.get(i12);
                        if (!o1Var.f30786a.d()) {
                            o1Var.f30786a.a();
                        }
                    }
                }
            } else {
                CharacterStyle R1 = this.Sa.R1(this);
                if (R1 != this.A4) {
                    this.A4 = R1;
                    d80 d80Var = this.f31226y4;
                    if (d80Var != null) {
                        d80Var.a();
                        this.f31226y4 = null;
                    }
                    d80 d80Var2 = new d80();
                    this.f31226y4 = d80Var2;
                    d80Var2.D = true;
                    u70 u70Var = new u70(0);
                    d80 d80Var3 = this.f31226y4;
                    d80Var3.f33885y = u70Var;
                    d80Var3.k(5.0f);
                    ?? obj = new Object();
                    obj.f30786a = this.f31226y4;
                    obj.f30787b = -3;
                    if (this.f31238z4 == null) {
                        this.f31238z4 = new ArrayList();
                    }
                    this.f31238z4.add(obj);
                    if (this.A4 != null && !F1(obj, u70Var, this.f31100p2, -2) && (((ejVar = this.f31062m3) == null || !G1(obj, u70Var, ejVar.f23310e)) && (gjVar = this.Q5) != null)) {
                        G1(obj, u70Var, gjVar.B2);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.f31238z4;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            gj gjVar2 = this.Q5;
            if (gjVar2 != null && gjVar2.P3()) {
                i10 = org.telegram.ui.ActionBar.j6.Dc;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.Ce;
            }
            int w02 = org.telegram.ui.ActionBar.j6.w0(i10, this.Qb);
            while (i11 < this.f31238z4.size()) {
                o1 o1Var2 = (o1) this.f31238z4.get(i11);
                if (o1Var2.f30787b == i7) {
                    d80 d80Var4 = o1Var2.f30786a;
                    d80Var4.g(org.telegram.ui.ActionBar.j6.r1(0.85f, w02), org.telegram.ui.ActionBar.j6.r1(2.0f, w02), org.telegram.ui.ActionBar.j6.r1(3.5f, w02), org.telegram.ui.ActionBar.j6.r1(6.0f, w02));
                    d80Var4.draw(canvas);
                    invalidate();
                    if (d80Var4.c()) {
                        this.f31238z4.remove(i11);
                        i11--;
                    }
                }
                i11++;
            }
        }
    }

    public final boolean m2() {
        int selectionOverlayColor = getSelectionOverlayColor();
        if (selectionOverlayColor != 0 && selectionOverlayColor != -65536) {
            return true;
        }
        return false;
    }

    public final void m3(boolean z10, boolean z11, boolean z12) {
        gj gjVar;
        if (z10 || !z12 || (gjVar = this.Q5) == null || !gjVar.f23772a0) {
            CheckBoxBase checkBoxBase = this.f31060m1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z11, z12);
            }
            CheckBoxBase checkBoxBase2 = this.l1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z10, z12);
            }
            k90 k90Var = this.Ta;
            float f10 = 0.0f;
            if (k90Var.f36343e == z11) {
                if (k90Var.f36344f != z12 && !z12) {
                    if (z11) {
                        f10 = 1.0f;
                    }
                    k90Var.d = f10;
                    k90Var.f36344f = false;
                    return;
                }
                return;
            }
            k90Var.f36343e = z11;
            k90Var.f36344f = z12;
            if (z12) {
                k90Var.f36342c = SystemClock.elapsedRealtime();
            } else {
                if (z11) {
                    f10 = 1.0f;
                }
                k90Var.d = f10;
            }
            k90Var.a();
            q1 q1Var = k90Var.f36350m;
            if (q1Var != null) {
                q1Var.invalidate();
                if (q1Var.getParent() != null) {
                    ((ViewGroup) q1Var.getParent()).invalidate();
                }
            }
        }
    }

    public final boolean n0(float f10, int i7) {
        ch.q0 q0Var = this.O;
        if (!q0Var.H) {
            return false;
        }
        float y10 = getY() + q0Var.f5193c;
        if (y10 <= f10 || (y10 + q0Var.f5201m) - org.telegram.messenger.g0.L(16.0f) >= i7) {
            return false;
        }
        return true;
    }

    public void n1(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.n1(android.graphics.Canvas):void");
    }

    public final boolean n2() {
        ArrayList arrayList;
        ej ejVar = this.f31062m3;
        if (ejVar != null && (arrayList = ejVar.f23310e) != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (!((dj) obj).f23100y.isEmpty()) {
                    return true;
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().B2 != null) {
            ArrayList arrayList2 = getMessageObject().B2;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                if (!((dj) obj2).f23100y.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean n3(boolean z10) {
        wo woVar;
        q1 q1Var;
        if (this.Q5.T2()) {
            Drawable t6 = this.U0.t();
            if (t6 instanceof ah0) {
                final ah0 ah0Var = (ah0) t6;
                String C0 = this.Q5.C0();
                TLRPC.TL_messages_stickerSet n02 = si.b0(this.f30908a6).n0(C0);
                if (n02 == null) {
                    si.b0(this.f30908a6).c1(C0, true, true);
                    return false;
                }
                int D0 = this.Q5.D0();
                if ("🎰".equals(this.Q5.C0())) {
                    if (D0 >= 0 && D0 <= 64) {
                        au0 au0Var = (au0) ah0Var;
                        if (au0Var.V0 != null || au0Var.W0) {
                            q1Var = this;
                        } else {
                            int i7 = D0 - 1;
                            int X = au0.X(i7 & 3);
                            int X2 = au0.X((i7 >> 2) & 3);
                            int X3 = au0.X(i7 >> 4);
                            if (X == 4 && X2 == 4 && X3 == 4) {
                                X = 5;
                                X3 = 5;
                                X2 = 5;
                            }
                            au0Var.f33062c1 = X;
                            au0Var.f33063d1 = X2;
                            au0Var.f33064e1 = X3;
                            gj messageObject = getMessageObject();
                            int i10 = getMessageObject().K1;
                            au0Var.W0 = true;
                            q1Var = this;
                            Utilities.f22416e.c(new oi.n2(au0Var, n02, i10, messageObject, q1Var, z10));
                        }
                        if (q1Var.Q5.N3()) {
                            ah0Var.S(Integer.MAX_VALUE, q1Var.f31109pb);
                        }
                        q1Var.Q5.n1 = false;
                    } else {
                        q1Var = this;
                    }
                    if (ah0Var.f33588n0 == null && !ah0Var.Z0 && n02.documents.size() > 0) {
                        au0 au0Var2 = (au0) ah0Var;
                        if (au0Var2.f33588n0 == null && !au0Var2.Z0) {
                            au0Var2.Z0 = true;
                            Utilities.f22416e.c(new ai.f1(au0Var2, n02, getMessageObject().K1, getMessageObject(), q1Var, 19));
                            return true;
                        }
                    }
                } else {
                    if (ah0Var.f33588n0 == null && !ah0Var.Z0 && n02.documents.size() > 0) {
                        TLRPC.Document document = n02.documents.get(0);
                        org.telegram.messenger.w7.G(this.f30908a6);
                        File J = org.telegram.messenger.w7.J(document, null, true, true);
                        if (ah0Var.f33588n0 == null && !ah0Var.Z0) {
                            final String y22 = org.telegram.messenger.g0.y2(J, 0);
                            if (TextUtils.isEmpty(y22)) {
                                org.telegram.messenger.z5.q(this.f30908a6).a(org.telegram.messenger.w7.r(null, document), this.Q5, this);
                                org.telegram.messenger.w7.G(this.f30908a6).W(document, n02, 1, 1);
                            } else {
                                ah0Var.Z0 = true;
                                Utilities.f22416e.c(new Runnable() {
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
                                                    i11 = ah0Var2.V0.f32652a[0];
                                                }
                                                if (ah0Var2.V0 != null) {
                                                    int i12 = ah0Var2.V0.f32652a[1];
                                                }
                                                org.telegram.messenger.g0.h3(new a2(ah0Var2, i11, 12));
                                                return;
                                            default:
                                                final ah0 ah0Var3 = ah0Var;
                                                ah0Var3.f33588n0 = RLottieNative.b(y22, ah0Var3.f33577e, null, null);
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
                        org.telegram.messenger.z5.q(this.f30908a6).v(this);
                    }
                    if (D0 >= 0 && D0 < n02.documents.size()) {
                        if (!z10 && this.Q5.N3() && (woVar = (wo) np.s1(this.f30908a6).f25295h4.get(C0)) != null && woVar.f27372b == D0) {
                            ah0Var.S(woVar.f27371a, this.f31109pb);
                        }
                        TLRPC.Document document2 = n02.documents.get(Math.max(D0, 0));
                        org.telegram.messenger.w7.G(this.f30908a6);
                        File J2 = org.telegram.messenger.w7.J(document2, null, true, true);
                        if (ah0Var.V0 == null && !ah0Var.W0) {
                            final String y23 = org.telegram.messenger.g0.y2(J2, 0);
                            if (TextUtils.isEmpty(y23)) {
                                org.telegram.messenger.z5.q(this.f30908a6).a(org.telegram.messenger.w7.r(null, document2), this.Q5, this);
                                org.telegram.messenger.w7.G(this.f30908a6).W(document2, n02, 1, 1);
                                this.Q5.n1 = false;
                            } else {
                                if (z10 && ah0Var.R == null && ah0Var.S == null && ah0Var.Q == null) {
                                    ah0Var.K = 2;
                                    ah0Var.Y0 = true;
                                }
                                ah0Var.W0 = true;
                                Utilities.f22416e.c(new Runnable() {
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
                                                    i11 = ah0Var2.V0.f32652a[0];
                                                }
                                                if (ah0Var2.V0 != null) {
                                                    int i12 = ah0Var2.V0.f32652a[1];
                                                }
                                                org.telegram.messenger.g0.h3(new a2(ah0Var2, i11, 12));
                                                return;
                                            default:
                                                final ah0 ah0Var3 = ah0Var;
                                                ah0Var3.f33588n0 = RLottieNative.b(y23, ah0Var3.f33577e, null, null);
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
                        org.telegram.messenger.z5.q(this.f30908a6).v(this);
                        this.Q5.n1 = false;
                    }
                }
                return true;
            }
        }
        return false;
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
        this.Q5.H0 = j3;
        RadialProgress2 radialProgress2 = this.Q0;
        radialProgress2.p(true, min);
        if (j3 == j10 && ((this.M != null || ((message = this.Q5.f23817k) != null && message.paid_message_stars > 0)) && ez.C(this.f30908a6).J(this.Q5.e1()) && ((i7 = this.O3) == 1 || (i7 == 4 && this.M1 == 5)))) {
            this.S0 = true;
            getIconForCurrentState();
            radialProgress2.setIcon(6, false, true);
        }
        long j11 = this.A1;
        if (j11 > 0 && Math.abs(j11 - j10) > 1048576) {
            this.A1 = j10;
        }
        z0(j3, j10);
    }

    public final boolean o0() {
        org.telegram.messenger.y8 y8Var;
        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(this.f30908a6);
        String filename = getFilename();
        if (filename == null || (y8Var = (org.telegram.messenger.y8) G.h.get(filename)) == null || !y8Var.T) {
            return false;
        }
        y8Var.T = false;
        return true;
    }

    public void o1(Canvas canvas, float f10, Integer num) {
        boolean z10;
        boolean z11 = this.f31232yb;
        float f11 = 1.0f;
        ch.q0 q0Var = this.O;
        if (z11) {
            q0Var.f5191a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.V4 && l2()) {
            if (q0Var.f5191a > 0.0f) {
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
            int i7 = (q0Var.f5191a > 0.0f ? 1 : (q0Var.f5191a == 0.0f ? 0 : -1));
            x1 x1Var = this.f31018ib;
            if (i7 <= 0 && x1Var.f32012x0 && this.M == null && !this.f31232yb) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + x1Var.f31957j0);
                q0Var.A = 0.0f;
                q0Var.B = false;
                if (x1Var.h) {
                    f11 = x1Var.L1;
                }
                q0Var.d(canvas, f11, num);
                canvas.restore();
            } else {
                q0Var.A = 0.0f;
                q0Var.B = false;
                if (x1Var.h) {
                    f11 = x1Var.L1;
                }
                q0Var.d(canvas, f11, num);
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public final void o2(int i7, int i10, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int i11 = i10 - i7;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList.size()) {
                break;
            }
            dj djVar = (dj) arrayList.get(i12);
            if (i7 >= djVar.f23095n && i7 < djVar.f23096r) {
                this.A0 = i12;
                h3();
                try {
                    u70 b32 = b3();
                    b32.f35696c = true;
                    b32.d(djVar.f23093e, i7, 0.0f);
                    djVar.f23093e.getSelectionPath(i7, i10, b32);
                    b32.a();
                    float f10 = djVar.f23098w + djVar.h;
                    if (i10 >= djVar.f23095n + i11) {
                        for (int i13 = i12 + 1; i13 < arrayList.size(); i13++) {
                            dj djVar2 = (dj) arrayList.get(i13);
                            int i14 = djVar2.f23096r - djVar2.f23095n;
                            u70 b33 = b3();
                            b33.f35696c = true;
                            float f11 = f10 + djVar2.f23094f;
                            b33.d(djVar2.f23093e, 0, f11);
                            f10 = f11 + djVar2.f23098w + djVar2.h;
                            djVar2.f23093e.getSelectionPath(0, i10 - djVar2.f23095n, b33);
                            b33.a();
                            if (i10 < (djVar.f23095n + i14) - 1) {
                                break;
                            }
                        }
                    }
                    if (this.B0) {
                        this.f31228y6 = true;
                        this.f31240z6 = 2500;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                invalidate();
            } else {
                i12++;
            }
        }
        this.j3 = -1;
        this.f31037k3 = -1;
    }

    public final void o3(Drawable drawable, int i7, int i10, int i11, int i12) {
        if (drawable != null) {
            tg0 tg0Var = this.Ac;
            x1 x1Var = this.f31018ib;
            if (tg0Var != null && tg0Var.h) {
                this.Ic = 0.0f;
            } else {
                float f10 = i10 + i12 + x1Var.f31957j0;
                this.Ic = f10 - ((int) f10);
            }
            drawable.setBounds((int) (i7 + x1Var.f31947h0), (int) (i10 + x1Var.f31961k0), (int) (i7 + i11 + x1Var.f31952i0), (int) (i10 + i12 + x1Var.f31957j0));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        q1 q1Var;
        float f10;
        float f11;
        sh.e eVar;
        sh.e eVar2;
        org.telegram.ui.Components.v8 v8Var;
        super.onAttachedToWindow();
        xi.e eVar3 = this.xc;
        if (eVar3 != null) {
            eVar3.b();
            this.xc = null;
        }
        xi.e eVar4 = new xi.e(ns.f(this.f30908a6), this);
        eVar4.c(ns.E0);
        eVar4.f(ns.f25532m1);
        eVar4.f(ns.l1);
        eVar4.f(ns.f25514i4);
        eVar4.f(ns.W2);
        this.xc = eVar4;
        gj gjVar = this.Q5;
        if (gjVar != null) {
            gjVar.f23819k1 = false;
            iv ivVar = gjVar.f23874y2;
            if (ivVar != null) {
                ivVar.b(this);
            }
        }
        iv ivVar2 = this.f31018ib.M0;
        if (ivVar2 != null) {
            ivVar2.b(this);
        }
        v1 v1Var = this.f31011i3;
        if (v1Var != null && (v8Var = v1Var.f31787b) != null) {
            v8Var.e();
        }
        w1 w1Var = this.f31211x2;
        if (w1Var != null && (eVar2 = w1Var.f31861m) != null) {
            eVar2.a();
        }
        w1 w1Var2 = this.f31211x2;
        if (w1Var2 != null && (eVar = w1Var2.f31862n) != null) {
            eVar.a();
        }
        ArrayList arrayList = this.Q4;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((p1) obj).a();
        }
        gj gjVar2 = this.R5;
        if (gjVar2 != null) {
            gjVar2.f23819k1 = false;
            q1Var = this;
            q1Var.w3(gjVar2, this.S5, this.U5, this.T5, this.V5, this.W5);
            q1Var.R5 = null;
            q1Var.S5 = null;
        } else {
            q1Var = this;
        }
        CheckBoxBase checkBoxBase = q1Var.f31060m1;
        if (checkBoxBase != null) {
            checkBoxBase.f32436l = true;
        }
        CheckBoxBase checkBoxBase2 = q1Var.l1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f32436l = true;
        }
        i01 i01Var = q1Var.f30969f0;
        if (i01Var != null) {
            i01Var.a();
        }
        CheckBoxBase checkBoxBase3 = q1Var.P7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f32436l = true;
        }
        if (q1Var.f30976f7 != null) {
            int i10 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = q1Var.f30976f7;
                if (i10 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i10].f32436l = true;
                i10++;
            }
        }
        q1Var.O0 = true;
        float f12 = 0.0f;
        q1Var.f31046kd = 0.0f;
        q1Var.f31033jd = 0.0f;
        q1Var.f31128r1 = 0;
        a4();
        ImageReceiver imageReceiver = q1Var.A7;
        imageReceiver.H0((View) getParent());
        imageReceiver.P();
        m1 m1Var = q1Var.f31006hc;
        if (m1Var != null) {
            m1Var.f30676b.P();
        }
        m1 m1Var2 = q1Var.f31019ic;
        if (m1Var2 != null) {
            m1Var2.f30676b.P();
        }
        R();
        gj gjVar3 = q1Var.Q5;
        if (gjVar3 != null) {
            setAvatar(gjVar3);
        }
        int i11 = q1Var.M1;
        if (i11 == 4 && q1Var.H5) {
            boolean I = MediaController.B().I(q1Var.Q5);
            q1Var.F1 = I;
            if (I) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            q1Var.H1 = f11;
            q1Var.G1 = 0;
        } else {
            q1Var.F1 = false;
            q1Var.H1 = 0.0f;
            if ((i11 == 4 || i11 == 2) && q1Var.B1) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            q1Var.E1 = f10;
        }
        if (getDelegate() != null && getDelegate().z2() != null) {
            i9 z22 = getDelegate().z2();
            z22.getClass();
            if (getMessageObject() != null && getMessageObject().e1() == z22.f31768w) {
                z22.W = q1Var;
            }
        }
        if (q1Var.M1 == 5) {
            boolean I2 = MediaController.B().I(q1Var.Q5);
            c1 D1 = D1();
            if (I2) {
                f12 = 1.0f;
            }
            D1.h = f12;
        }
        ch.q0 q0Var = q1Var.O;
        ArrayList arrayList2 = q0Var.f5207s;
        q0Var.D = true;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            ((ch.n0) arrayList2.get(i12)).a();
        }
        org.telegram.messenger.n6 n6Var = q1Var.f31082nb;
        if (n6Var != null) {
            n6Var.a();
        }
        l4 l4Var = q1Var.X5;
        if (l4Var != null) {
            ArrayList arrayList3 = l4Var.f30611c;
            if (!l4Var.C) {
                l4Var.C = true;
                xh.e eVar5 = l4Var.f30618l;
                if (eVar5 != null) {
                    eVar5.b(l4Var.f30609a);
                }
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    k4 k4Var = (k4) arrayList3.get(i13);
                    if (!k4Var.N) {
                        k4Var.N = true;
                        k4Var.f30559f.P();
                    }
                }
            }
        }
        S3();
        gj gjVar4 = q1Var.Q5;
        if (gjVar4 != null && gjVar4.D == 20 && q1Var.X9 != null) {
            invalidate();
        }
        org.telegram.ui.Components.e5 e5Var = q1Var.f31122qa;
        if (e5Var != null) {
            e5Var.a();
        }
        org.telegram.ui.Components.e5 e5Var2 = q1Var.f31137ra;
        if (e5Var2 != null) {
            e5Var2.a();
        }
        xh.e eVar6 = q1Var.Q9;
        if (eVar6 != null) {
            if (eVar6.f59976i) {
                xh.e W2 = W2();
                q1Var.Q9 = W2;
                Integer num = q1Var.R9;
                if (num != null) {
                    W2.f59978k.put(this, num);
                }
            } else {
                eVar6.a(this);
            }
        }
        l0 l0Var = q1Var.f31195w;
        if (l0Var != null) {
            ArrayList arrayList4 = l0Var.f30597q;
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((k0) arrayList4.get(i14)).a();
            }
        }
        fv0 fv0Var = q1Var.f30970f1;
        if (fv0Var != null) {
            for (int i15 = 0; i15 < fv0Var.f34706b; i15++) {
                fv0Var.f34707c[i15].a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        u1 u1Var;
        org.telegram.ui.Components.v8 v8Var;
        bg.q qVar;
        sh.e eVar;
        sh.e eVar2;
        super.onDetachedFromWindow();
        xi.e eVar3 = this.xc;
        if (eVar3 != null) {
            eVar3.b();
            this.xc = null;
        }
        AnimatorSet animatorSet = this.Y5;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Y5 = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
            setRotation(0.0f);
        }
        CheckBoxBase checkBoxBase = this.f31060m1;
        if (checkBoxBase != null) {
            checkBoxBase.f32436l = false;
        }
        w1 w1Var = this.f31211x2;
        if (w1Var != null && (eVar2 = w1Var.f31861m) != null) {
            eVar2.f56861b.R();
            eVar2.f56877y.f();
        }
        w1 w1Var2 = this.f31211x2;
        if (w1Var2 != null && (eVar = w1Var2.f31862n) != null) {
            eVar.f56861b.R();
            eVar.f56877y.f();
        }
        w1 w1Var3 = this.f31211x2;
        if (w1Var3 != null && (qVar = w1Var3.f31858j) != null) {
            qVar.b();
            this.f31211x2.f31858j = null;
        }
        iv ivVar = this.Q5.f23874y2;
        if (ivVar != null) {
            ivVar.f(this);
        }
        x1 x1Var = this.f31018ib;
        iv ivVar2 = x1Var.M0;
        if (ivVar2 != null) {
            ivVar2.f(this);
        }
        ArrayList arrayList = this.Q4;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((p1) obj).b();
        }
        v1 v1Var = this.f31011i3;
        if (v1Var != null && (v8Var = v1Var.f31787b) != null) {
            v8Var.f();
        }
        CheckBoxBase checkBoxBase2 = this.l1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f32436l = false;
        }
        if (this.f30976f7 != null) {
            int i10 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.f30976f7;
                if (i10 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i10].f32436l = false;
                i10++;
            }
        }
        CheckBoxBase checkBoxBase3 = this.P7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f32436l = false;
        }
        this.O0 = false;
        l4 l4Var = this.X5;
        if (l4Var != null) {
            l4Var.e();
        }
        this.A7.R();
        m1 m1Var = this.f31006hc;
        if (m1Var != null) {
            m1Var.f30676b.R();
        }
        m1 m1Var2 = this.f31019ic;
        if (m1Var2 != null) {
            m1Var2.f30676b.R();
        }
        i01 i01Var = this.f30969f0;
        if (i01Var != null) {
            i01Var.b();
        }
        R();
        if (this.G3 && (u1Var = this.f31154t0) != null && u1Var.d != null && u1Var.f31704e != null) {
            fc D = fc.D();
            String str = this.f31154t0.d;
            if (str != null) {
                D.A.remove(str);
            }
            this.G3 = false;
        }
        fv0 fv0Var = this.f30970f1;
        if (fv0Var != null) {
            fv0Var.a(this);
        }
        org.telegram.messenger.z5.q(this.f30908a6).v(this);
        if (getDelegate() != null && getDelegate().z2() != null) {
            i9 z22 = getDelegate().z2();
            z22.getClass();
            if (getMessageObject() != null && getMessageObject().e1() == z22.f31768w) {
                z22.W = null;
            }
        }
        x1Var.f32008w0 = false;
        if (MediaController.B().I(this.Q5)) {
            org.telegram.ui.ActionBar.j6.A0().f42277i = null;
        }
        ValueAnimator valueAnimator = this.f31178ub;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f31178ub.cancel();
        }
        this.O.p();
        this.f31164tb = false;
        org.telegram.messenger.n6 n6Var = this.f31082nb;
        if (n6Var != null) {
            n6Var.e();
        }
        org.telegram.ui.Components.e5 e5Var = this.f31122qa;
        if (e5Var != null) {
            e5Var.b();
        }
        org.telegram.ui.Components.e5 e5Var2 = this.f31137ra;
        if (e5Var2 != null) {
            e5Var2.b();
        }
        xh.e eVar4 = this.Q9;
        if (eVar4 != null) {
            eVar4.b(this);
        }
        l0 l0Var = this.f31195w;
        if (l0Var != null) {
            ArrayList arrayList2 = l0Var.f30597q;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                k0 k0Var = (k0) arrayList2.get(i11);
                int i12 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = k0Var.f30529c;
                    if (i12 < imageReceiverArr.length) {
                        imageReceiverArr[i12].R();
                        i12++;
                    }
                }
            }
        }
        bg.k.d().f(this.Cc);
    }

    @Override
    public void onDraw(Canvas canvas) {
        d1(canvas);
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z10;
        hk0 c42 = c4();
        int i7 = 0;
        if (c42 != null && motionEvent.isFromSource(8194)) {
            float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.f31008i0 + this.f31167u0;
            motionEvent.offsetLocation(-this.f31085o0, -topicSeparatorTopPadding);
            Rect rect = c42.f22934b;
            if (c42.f35279e0 != null && c42.f35280f0) {
                motionEvent.offsetLocation((-rect.left) + c42.f35285k0, -rect.top);
                try {
                    if (motionEvent.getX() >= 0.0f && motionEvent.getX() < c42.u0() && motionEvent.getY() >= 0.0f && motionEvent.getY() < c42.f35284j0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c42.f35279e0.l(motionEvent, z10);
                    motionEvent.offsetLocation(rect.left - c42.f35285k0, rect.top);
                } catch (Throwable th2) {
                    motionEvent.offsetLocation(rect.left - c42.f35285k0, rect.top);
                    throw th2;
                }
            }
            motionEvent.offsetLocation(this.f31085o0, topicSeparatorTopPadding);
        }
        int x10 = (int) motionEvent.getX();
        int N1 = (int) N1(motionEvent);
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            while (true) {
                SparseArray sparseArray = this.f31220xb;
                if (i7 >= sparseArray.size()) {
                    break;
                } else if (((Rect) sparseArray.valueAt(i7)).contains(x10, N1)) {
                    int keyAt = sparseArray.keyAt(i7);
                    if (keyAt != this.Lb) {
                        this.Lb = keyAt;
                        j3(keyAt, 32768, null);
                    }
                    return true;
                } else {
                    i7++;
                }
            }
        } else if (motionEvent.getAction() == 10) {
            this.Lb = 0;
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
        gj gjVar = this.Q5;
        boolean z10 = true;
        if (gjVar == null || (!gjVar.I() && this.V3 == org.telegram.messenger.g0.f23609q.y)) {
            q1Var = this;
        } else {
            this.C0 = true;
            gj gjVar2 = this.Q5;
            this.Q5 = null;
            q1Var = this;
            q1Var.x3(gjVar2, this.L, this.G, this.F, this.H, false);
            q1Var.C0 = false;
        }
        Y3();
        int i12 = q1Var.W + q1Var.f30981g0 + q1Var.f31008i0 + q1Var.f31181v0 + q1Var.f31209x0 + q1Var.f30955e0;
        jh.a draftMessageMeasureController = getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(q1Var.Q5)) {
            int max = Math.max(0, (((draftMessageMeasureController.f17361a.getHeight() - draftMessageMeasureController.f17361a.getPaddingTop()) - draftMessageMeasureController.f17361a.getPaddingBottom()) - draftMessageMeasureController.d) - i12);
            if (max <= 0) {
                z10 = false;
            }
            draftMessageMeasureController.f17364e = z10;
            if (draftMessageMeasureController.f17362b > 0 && !z10) {
                draftMessageMeasureController.c(0, 0L);
            }
            i11 = max + i12;
        } else {
            i11 = i12;
        }
        q1Var.Fc = Math.max(0, i11 - i12);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), i11);
    }

    @Override
    public final void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (this.K6) {
            gj gjVar = this.Q5;
            if (gjVar != null && (charSequence2 = gjVar.v) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.Q5.v);
                return;
            }
            gj gjVar2 = this.Q5;
            if (gjVar2 != null && (charSequence = gjVar2.f23875z) != null && charSequence.length() > 0) {
                viewStructure.setText(this.Q5.f23875z);
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
        if (this.Q5 != null) {
            Runnable runnable = this.Dc;
            if (runnable != null) {
                runnable.run();
                return;
            }
            Runnable runnable2 = this.Ec;
            if (runnable2 != null) {
                runnable2.run();
            }
            super.invalidate();
            if ((this.f30922b6 || (this.L != null && r2())) && getParent() != null) {
                View view = (View) getParent();
                if (view.getParent() != null) {
                    view.invalidate();
                    ((View) view.getParent()).invalidate();
                }
            }
            if (this.Wb && (l1Var = this.Sa) != null) {
                l1Var.p();
            }
        }
    }

    public final void p0(Bitmap bitmap, boolean z10) {
        boolean L4 = gj.L4(this.Q5.f23817k);
        fi.u2 u2Var = this.U0;
        if (L4) {
            if (MediaController.B().I(this.Q5)) {
                u2Var.f22301u0 = false;
                u2Var.Q0();
                return;
            }
            u2Var.f22301u0 = true;
            u2Var.P0(false);
            return;
        }
        if (z10) {
            gj gjVar = MediaController.B().f22377v0;
            if (gjVar != null && gjVar.h4()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        u2Var.f22301u0 = z10;
        if (bitmap != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
            u2Var.Z = null;
            u2Var.f22260b0 = null;
            u2Var.f22263c0 = null;
            u2Var.f22265d0 = null;
            u2Var.f22258a1.setShader(null);
            u2Var.N0(bitmapDrawable);
            u2Var.n1 = true;
            u2Var.f22278i1 = 0.0f;
            u2Var.R0(u2Var.f22286n0);
        }
        if (z10) {
            u2Var.P0(false);
        } else {
            u2Var.Q0();
        }
    }

    public final boolean p1(Canvas canvas) {
        boolean z10 = this.f31232yb;
        float f10 = 1.0f;
        ch.q0 q0Var = this.O;
        if (z10) {
            q0Var.f5191a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z11 = false;
        if (!this.V4 || !l2()) {
            return false;
        }
        if (q0Var.f5191a > 0.0f) {
            x();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z11 = true;
        }
        int i7 = (q0Var.f5191a > 0.0f ? 1 : (q0Var.f5191a == 0.0f ? 0 : -1));
        x1 x1Var = this.f31018ib;
        if (i7 <= 0 && x1Var.f32012x0 && this.M == null && !this.f31232yb) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + x1Var.f31957j0);
            if (x1Var.h) {
                f10 = x1Var.L1;
            }
            q0Var.e(canvas, f10);
            canvas.restore();
        } else {
            if (x1Var.h) {
                f10 = x1Var.L1;
            }
            q0Var.e(canvas, f10);
        }
        if (z11) {
            canvas.restore();
        }
        return true;
    }

    public final void p3() {
        this.f31228y6 = true;
        this.f31240z6 = 1000;
        this.B6 = System.currentTimeMillis();
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        q1 q1Var;
        ArrayList arrayList;
        l1 l1Var = this.Sa;
        int i10 = 0;
        if (l1Var != null && l1Var.v2(i7)) {
            return false;
        }
        if (i7 == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                E0(false);
                return true;
            } else if (this.Q5.D == 16) {
                this.Sa.C0(this, this.S3, this.T3);
                return true;
            } else {
                D0();
                return true;
            }
        }
        if (i7 == 2131296267) {
            F0();
        } else if (i7 == 2131296264) {
            l1 l1Var2 = this.Sa;
            if (l1Var2 != null) {
                if (this.Q5.D == 16) {
                    l1Var2.q0(this, 0.0f, 0.0f);
                } else {
                    l1Var2.C0(this, this.S3, this.T3);
                }
            }
        } else {
            if (i7 == 2131296265) {
                l1 l1Var3 = this.Sa;
                if (l1Var3 != null) {
                    TLRPC.Chat chat = this.f31177ua;
                    if (chat != null) {
                        q1Var = this;
                        l1Var3.U(q1Var, chat, this.Q5.f23817k.fwd_from.channel_post, this.f30996h1, this.f31009i1, false);
                    } else {
                        q1Var = this;
                        TLRPC.User user = q1Var.f31150sa;
                        if (user != null) {
                            l1Var3.u0(this, user, q1Var.f30996h1, q1Var.f31009i1);
                        } else if (q1Var.f31191va != null) {
                            l1Var3.o(this);
                        }
                    }
                }
            } else {
                q1Var = this;
                if (i7 == 2131296268) {
                    l1 l1Var4 = q1Var.Sa;
                    if (l1Var4 != null) {
                        l1Var4.I0(this);
                    }
                } else if (i7 == 2131296263 && q1Var.Sa != null && (arrayList = q1Var.Q5.B2) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i10);
                        i10++;
                        dj djVar = (dj) obj;
                        if (djVar.O) {
                            q1Var.Sa.J(djVar);
                            break;
                        }
                    }
                }
            }
            if ((!gj.R4(q1Var.Q5.f23817k) || q1Var.Q5.h4() || (q1Var.Q5.I3() && MediaController.B().I(q1Var.Q5))) && q1Var.F4.g(null, i7, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i7, bundle);
        }
        q1Var = this;
        if (!gj.R4(q1Var.Q5.f23817k)) {
        }
        return true;
    }

    @Override
    public final boolean q() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.q():boolean");
    }

    public final void q1(Canvas canvas, iv ivVar, float f10, ColorFilter colorFilter) {
        Canvas canvas2;
        int save;
        if (ivVar != null && f10 > 0.0f && ivVar.C()) {
            if (f10 < 1.0f) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f10 * 255.0f), 31);
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(this.f31085o0, this.f31167u0);
            ivVar.i(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public final void q2() {
        l1 l1Var = this.Sa;
        if (l1Var != null && l1Var.g()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void q3(byte[] bArr) {
        gj gjVar = this.R5;
        if (gjVar == null) {
            gjVar = this.Q5;
        }
        if (gjVar == null) {
            this.f31088o3 = null;
            return;
        }
        sg0 sg0Var = this.f31088o3;
        if (sg0Var == null || !sg0Var.f39307f || !Arrays.equals(sg0Var.f39308g, bArr)) {
            this.f31088o3 = new sg0(this, gjVar.e1(), bArr);
        }
        this.B0 = true;
    }

    public final int r0(gj gjVar, bj bjVar, boolean z10) {
        bj bjVar2 = bjVar;
        fi.u2 u2Var = this.U0;
        u2Var.f22289p0 = true;
        ImageReceiver imageReceiver = this.A7;
        imageReceiver.f22289p0 = true;
        ImageReceiver imageReceiver2 = this.T7;
        imageReceiver2.f22289p0 = true;
        ImageReceiver imageReceiver3 = this.F7;
        imageReceiver3.f22289p0 = true;
        int i7 = 0;
        if (bjVar2 != null) {
            ArrayList arrayList = bjVar2.d;
            if (arrayList.size() != 1) {
                if (arrayList.size() != bjVar2.f22711f.size()) {
                    bjVar2.a();
                }
                this.f31007hd = 0;
                int i10 = 0;
                while (i7 < arrayList.size()) {
                    gj gjVar2 = (gj) arrayList.get(i7);
                    yi d = bjVar2.d(gjVar2);
                    if (d != null && (d.f27753l & 1) != 0) {
                        w3(gjVar2, bjVar2, false, false, false, false);
                        if (z10 && !TextUtils.isEmpty(this.f31101p3)) {
                            Q3();
                            this.f31007hd = (int) (i10 + this.f31157t3);
                            this.f31020id = this.f31062m3;
                        }
                        i10 = this.f31181v0 + this.f31209x0 + i10;
                    }
                    i7++;
                    bjVar2 = bjVar;
                }
                return i10;
            }
        }
        w3(gjVar, bjVar, false, false, false, false);
        u2Var.f22289p0 = false;
        imageReceiver.f22289p0 = false;
        imageReceiver2.f22289p0 = false;
        imageReceiver3.f22289p0 = false;
        Q3();
        return this.f31181v0 + this.f31209x0;
    }

    public final void r1(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.r1(android.graphics.Canvas):void");
    }

    public final boolean r2() {
        if (this.f31171u4.f20829a <= 0 && this.O.f5204p) {
            gj gjVar = this.Q5;
            if (gjVar == null || !gjVar.f23854t1) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void r3(CharacterStyle characterStyle) {
        int i7;
        int i10;
        int i11;
        int i12;
        gj gjVar = this.R5;
        if (gjVar == null) {
            gjVar = this.Q5;
        }
        this.B0 = false;
        ArrayList arrayList = this.f31213x4;
        if (gjVar != null && gjVar.f23817k.message != null && characterStyle != null) {
            if (this.f31062m3 != null && !TextUtils.isEmpty(gjVar.f23875z)) {
                CharSequence charSequence = gjVar.f23875z;
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
                        for (int i14 = 0; i14 < this.f31062m3.f23310e.size(); i14++) {
                            dj djVar = (dj) this.f31062m3.f23310e.get(i14);
                            if (i12 >= djVar.f23095n && i12 < djVar.f23096r) {
                                this.A0 = i14;
                                this.B0 = false;
                                h3();
                                try {
                                    u70 b32 = b3();
                                    b32.d(djVar.f23093e, i12, 0.0f);
                                    djVar.f23093e.getSelectionPath(i12, i11, b32);
                                    if (i11 >= djVar.f23095n + i13) {
                                        for (int i15 = i14 + 1; i15 < this.f31062m3.f23310e.size(); i15++) {
                                            dj djVar2 = (dj) this.f31062m3.f23310e.get(i15);
                                            int i16 = djVar2.f23096r - djVar2.f23095n;
                                            u70 b33 = b3();
                                            b33.d(djVar2.f23093e, 0, djVar2.f23098w);
                                            djVar2.f23093e.getSelectionPath(0, i11 - djVar2.f23095n, b33);
                                            if (i11 < (djVar.f23095n + i16) - 1) {
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
            CharSequence charSequence2 = gjVar.v;
            if ((charSequence2 instanceof Spanned) && gjVar.B2 != null) {
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
                    for (int i18 = 0; i18 < gjVar.B2.size(); i18++) {
                        dj djVar3 = (dj) gjVar.B2.get(i18);
                        if (i10 >= djVar3.f23095n && i10 < djVar3.f23096r) {
                            this.A0 = i18;
                            this.B0 = false;
                            h3();
                            try {
                                u70 b34 = b3();
                                b34.d(djVar3.f23093e, i10, 0.0f);
                                djVar3.f23093e.getSelectionPath(i10, i7, b34);
                                if (i7 >= djVar3.f23095n + i17) {
                                    for (int i19 = i18 + 1; i19 < gjVar.B2.size(); i19++) {
                                        dj djVar4 = (dj) gjVar.B2.get(i19);
                                        int i20 = djVar4.f23096r - djVar4.f23095n;
                                        u70 b35 = b3();
                                        b35.d(djVar4.f23093e, 0, djVar4.f23098w);
                                        djVar4.f23093e.getSelectionPath(0, i7 - djVar4.f23095n, b35);
                                        if (i7 < (djVar3.f23095n + i20) - 1) {
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
                h3();
                invalidate();
            }
        } else if (!arrayList.isEmpty()) {
            this.A0 = -1;
            this.B0 = false;
            h3();
            invalidate();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.C0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(q1 q1Var) {
        if (q1Var == null) {
            return;
        }
        q1Var.f30975f6 = this.f30975f6;
        q1Var.f31147s6 = this.f31147s6;
        q1Var.f31001h6 = this.f31001h6;
        q1Var.f31014i6 = this.f31014i6;
        q1Var.f31026j6 = this.f31026j6;
        q1Var.f31040k6 = this.f31040k6;
        q1Var.f31052l6 = this.f31052l6;
        q1Var.f31065m6 = this.f31065m6;
        q1Var.f31077n6 = this.f31077n6;
        q1Var.f31090o6 = this.f31090o6;
        q1Var.f31104p6 = this.f31104p6;
        q1Var.f31118q6 = this.f31118q6;
        q1Var.t6 = this.t6;
        q1Var.f31173u6 = this.f31173u6;
        q1Var.f31187v6 = this.f31187v6;
        q1Var.W6 = this.W6;
        q1Var.X6 = this.X6;
        q1Var.Y6 = this.Y6;
        q1Var.Z6 = this.Z6;
        q1Var.f30909a7 = this.f30909a7;
    }

    public final void s1(Canvas canvas, Integer num, float f10, boolean z10) {
        yi yiVar = this.M;
        if (yiVar != null) {
            int i7 = yiVar.f27753l;
            if ((i7 & 8) == 0 || (i7 & 1) == 0) {
                return;
            }
        }
        ch.q0 q0Var = this.O;
        q0Var.getClass();
        q0Var.A = f10;
        q0Var.B = z10;
        q0Var.d(canvas, this.f31018ib.L1, num);
    }

    public final void s2() {
        if (this.L != null && getParent() != null) {
            ((ViewGroup) getParent()).invalidate();
        }
        invalidate();
    }

    public final void s3(int i7) {
        gj gjVar = this.R5;
        if (gjVar == null) {
            gjVar = this.Q5;
        }
        if (gjVar == null) {
            this.f31088o3 = null;
            return;
        }
        sg0 sg0Var = this.f31088o3;
        if (sg0Var == null || !sg0Var.f39306e || sg0Var.f39305c != (-i7)) {
            this.f31088o3 = new sg0(this, gjVar.e1(), i7);
        }
        this.B0 = true;
    }

    public void setAllowAssistant(boolean z10) {
        this.K6 = z10;
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
        if (this.f30992gb) {
            this.f31005hb = f10;
            invalidate();
        } else {
            super.setAlpha(f10);
        }
        yi yiVar = this.M;
        if ((yiVar != null && (yiVar.f27746c != 0 || yiVar.f27744a != 0)) || ((this.f31221y && !gj.R4(this.Q5.f23817k)) || this.Q7 == null || this.R7 == null)) {
            yi yiVar2 = this.M;
            if (yiVar2 != null) {
                int i7 = yiVar2.f27753l;
                if ((i7 & 8) == 0 || (i7 & 1) == 0) {
                    return;
                }
            }
            this.O.getClass();
        }
        invalidate();
    }

    public void setAnimationOffsetX(float f10) {
        if (this.f31046kd != f10) {
            this.f31046kd = f10;
            a4();
        }
    }

    public void setAvatar(gj gjVar) {
        if (gjVar != null) {
            int i7 = gjVar.K1;
            if (!this.G6 && !f2()) {
                this.f31056la = null;
                return;
            }
            Drawable drawable = gjVar.f23828m2;
            ImageReceiver imageReceiver = this.A7;
            if (drawable != null) {
                imageReceiver.w0(drawable);
                return;
            }
            TLRPC.User user = this.f31030ja;
            org.telegram.ui.Components.t8 t8Var = this.B7;
            if (user != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null) {
                    this.f31056la = userProfilePhoto.photo_small;
                } else {
                    this.f31056la = null;
                }
                t8Var.r(user);
                imageReceiver.j0(this.f31030ja, t8Var, null, qc.e(360928), 1, false);
                return;
            }
            TLRPC.Chat chat = this.f31044ka;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    this.f31056la = chatPhoto.photo_small;
                } else {
                    this.f31056la = null;
                }
                if (chat.signature_profiles && gj.B0(gjVar.f23817k) != 1271266957) {
                    long o4 = org.telegram.messenger.m5.o(gjVar.f23817k.from_id);
                    if (o4 >= 0) {
                        TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(o4));
                        t8Var.r(a22);
                        imageReceiver.i0(a22, t8Var, null);
                        return;
                    }
                    TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-o4));
                    t8Var.q(M0);
                    imageReceiver.i0(M0, t8Var, null);
                    return;
                }
                t8Var.q(this.f31044ka);
                imageReceiver.i0(this.f31044ka, t8Var, null);
            } else if (gjVar.r4()) {
                TLRPC.Photo photo = gjVar.V0;
                if (photo != null) {
                    imageReceiver.q0(gc.i(org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(50.0f), false, null, true), gjVar.V0), "50_50", t8Var, null, null, 0);
                }
            } else {
                this.f31056la = null;
                t8Var.k(gjVar.Z0(), null, null, null);
                imageReceiver.q0(null, null, t8Var, null, null, 0);
            }
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.setBackgroundTopY(boolean):void");
    }

    public void setDelegate(l1 l1Var) {
        this.Sa = l1Var;
    }

    public void setDrawSelectionBackground(boolean z10) {
        if (this.f31035k1 != z10) {
            this.f31035k1 = z10;
            invalidate();
        }
    }

    public void setEnterTransitionInProgress(boolean z10) {
        this.f31221y = z10;
        invalidate();
    }

    public void setFullyDraw(boolean z10) {
        this.K0 = z10;
    }

    public void setHideSideButtonByQuickShare(boolean z10) {
        if (this.E8 != z10) {
            this.E8 = z10;
            boolean z11 = this.f30922b6;
            this.f30922b6 = true;
            invalidate();
            this.f30922b6 = z11;
        }
    }

    public void setHighlighted(boolean z10) {
        if (this.f31215x6 != z10) {
            this.f31215x6 = z10;
            if (z10) {
                this.f31088o3 = null;
            }
            if (!z10) {
                this.B6 = System.currentTimeMillis();
                this.f31228y6 = true;
                this.f31240z6 = 300;
            } else {
                this.f31228y6 = false;
                this.f31240z6 = 0;
            }
            U3();
            if (this.C4) {
                this.E4.f39737o = y2();
            } else {
                this.D4.f37650p = y2();
            }
            invalidate();
            if (getParent() != null) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setImageCoords(RectF rectF) {
        v3(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public void setInstantButtonPressed(boolean z10) {
        if (this.H2 == null) {
            this.H2 = new dc(this);
        }
        dc dcVar = this.H2;
        this.G2 = z10;
        dcVar.c(z10);
    }

    public void setInvalidateListener(Runnable runnable) {
        this.Ec = runnable;
    }

    public void setInvalidateSpoilersParent(boolean z10) {
        this.f31072n0 = z10;
    }

    public void setInvalidatesParent(boolean z10) {
        this.f30922b6 = z10;
    }

    public void setIsUpdating(boolean z10) {
        this.P0 = true;
    }

    public void setMessageObjectInternal(org.telegram.messenger.gj r68) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.setMessageObjectInternal(org.telegram.messenger.gj):void");
    }

    public void setOverrideInvalidate(Runnable runnable) {
        this.Dc = runnable;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        U3();
        if (this.C4) {
            this.E4.f39737o = y2();
        } else {
            this.D4.f37650p = y2();
        }
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.Qb = e6Var;
        RadialProgress2 radialProgress2 = this.Q0;
        if (radialProgress2 != null) {
            radialProgress2.F = e6Var;
        }
        RadialProgress2 radialProgress22 = this.R0;
        if (radialProgress22 != null) {
            radialProgress22.F = e6Var;
        }
        jk0 jk0Var = this.f30945d3;
        if (jk0Var != null) {
            jk0Var.f36034n = e6Var;
        }
    }

    public void setScrimBlockBounds(RectF rectF) {
        this.f31070md = rectF;
    }

    public void setScrimReaction(Integer num) {
        this.O.f5213z = num;
    }

    public void setSelectedBackgroundProgress(float f10) {
        this.Za = f10;
        invalidate();
    }

    public void setShowTopic(boolean z10) {
        if (this.Lc != z10) {
            this.Lc = z10;
            q2();
            invalidate();
        }
    }

    public void setSlidingOffset(float f10) {
        if (this.f31033jd != f10) {
            this.f31033jd = f10;
            a4();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Tb;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((xh.f) arrayList.get(i7)).invalidateSelf();
            i7++;
        }
        ej ejVar = this.f31062m3;
        if (ejVar != null && ejVar.f23310e != null) {
            for (int i10 = 0; i10 < this.f31062m3.f23310e.size(); i10++) {
                dj djVar = (dj) this.f31062m3.f23310e.get(i10);
                for (int i11 = 0; i11 < djVar.f23100y.size(); i11++) {
                    ((xh.f) djVar.f23100y.get(i11)).invalidateSelf();
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().B2 != null) {
            for (int i12 = 0; i12 < getMessageObject().B2.size(); i12++) {
                dj djVar2 = (dj) getMessageObject().B2.get(i12);
                for (int i13 = 0; i13 < djVar2.f23100y.size(); i13++) {
                    ((xh.f) djVar2.f23100y.get(i13)).invalidateSelf();
                }
            }
        }
    }

    public void setTimeAlpha(float f10) {
        this.f31038k4 = f10;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
    }

    public final void t0(q1 q1Var) {
        xh.e eVar;
        if (q1Var != null && (eVar = q1Var.Q9) != null) {
            int i7 = (Integer) eVar.f59978k.get(q1Var);
            if (i7 == null) {
                i7 = 0;
            }
            this.R9 = i7;
            xh.e eVar2 = this.Q9;
            if (eVar2 != null) {
                eVar2.f59978k.put(this, i7);
            }
        }
    }

    public final void t1(ol olVar, Canvas canvas, int i7, Integer num, float f10) {
        yi yiVar = this.M;
        if (yiVar != null) {
            int i10 = yiVar.f27753l;
            if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                return;
            }
        }
        ch.q0 q0Var = this.O;
        q0Var.getClass();
        q0Var.A = f10;
        q0Var.f(olVar, canvas, i7, num);
    }

    public final boolean t2() {
        bj bjVar;
        if (u2() && (bjVar = this.L) != null && this.M != null && !bjVar.f22708b && !bjVar.f22713i) {
            return true;
        }
        return false;
    }

    public final void t3(String str) {
        u3(false, -1, str, false);
    }

    public final void u0(q1 q1Var) {
        q1Var.B3(this.f31124qc, this.f31152sc, this.f31165tc, this.f31179uc, this.f31193vc, this.L0, this.M0, this.f30953db, this.eb, this.f31139rc);
    }

    public final void u1(Canvas canvas, RectF rectF, float f10) {
        String str;
        x();
        if (this.I8) {
            str = "paintChatActionBackgroundSelected";
        } else {
            str = "paintChatActionBackground";
        }
        canvas.drawRoundRect(rectF, f10, f10, a2(str));
        if (h2()) {
            canvas.drawRoundRect(rectF, f10, f10, org.telegram.ui.ActionBar.j6.f28919h2);
        }
    }

    public final boolean u2() {
        gj gjVar;
        if (w2() && (gjVar = this.Q5) != null && !gjVar.P3()) {
            return true;
        }
        return false;
    }

    public final boolean u3(boolean r25, int r26, java.lang.String r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.u3(boolean, int, java.lang.String, boolean):boolean");
    }

    public final boolean v() {
        if (this.Q5.t2() && !this.Q5.O0 && this.M9 == 0.0f && this.V0.n() != null) {
            return false;
        }
        return true;
    }

    public final void v0() {
        if (this.f31041k7 == null) {
            this.f31041k7 = new ImageReceiver[3];
            this.f31053l7 = new org.telegram.ui.Components.t8[3];
            this.f31066m7 = new boolean[3];
            int i7 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.f31041k7;
                if (i7 < imageReceiverArr.length) {
                    imageReceiverArr[i7] = new ImageReceiver(this);
                    this.f31041k7[i7].J0(org.telegram.messenger.g0.L(12.0f));
                    this.f31053l7[i7] = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                    this.f31053l7[i7].u(org.telegram.messenger.g0.L(18.0f));
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void v1(Canvas canvas, boolean z10) {
        float f10;
        float f11;
        boolean z11;
        int i7;
        float f12;
        float L;
        float f13;
        float f14;
        float f15;
        bj bjVar;
        if ((!this.E8 || z10) && this.F8 != 0) {
            yi yiVar = this.M;
            if (yiVar == null || (bjVar = this.L) == null || !bjVar.f22713i || yiVar.h) {
                boolean P3 = this.Q5.P3();
                x1 x1Var = this.f31018ib;
                if (P3) {
                    float L2 = x1Var.f31958j1 - org.telegram.messenger.g0.L(40.0f);
                    this.R8 = L2;
                    bj bjVar2 = this.L;
                    if (bjVar2 != null) {
                        this.R8 = (bjVar2.f22717m.f22519e - this.f31046kd) + L2;
                    }
                } else {
                    float L3 = org.telegram.messenger.g0.L(8.0f) + x1Var.f31962k1;
                    this.R8 = L3;
                    bj bjVar3 = this.L;
                    if (bjVar3 != null) {
                        this.R8 = (bjVar3.f22717m.f22521g - this.f31046kd) + L3;
                    }
                    if (u2()) {
                        this.R8 = Math.min(this.R8, getCompactRight() - org.telegram.messenger.g0.L(32.0f));
                    }
                }
                float f16 = 0.0f;
                if (this.F8 == 4) {
                    this.S8 = org.telegram.messenger.g0.L(6.0f);
                } else {
                    float L4 = (this.f30962e7 + x1Var.f31957j0) - org.telegram.messenger.g0.L(41.0f);
                    this.S8 = L4;
                    gj gjVar = this.Q5;
                    if (gjVar.D == 19 && gjVar.f23862v2 < this.B9) {
                        this.S8 = L4 - org.telegram.messenger.g0.L(22.0f);
                    }
                    bj bjVar4 = this.L;
                    if (bjVar4 != null) {
                        float f17 = this.S8;
                        aj ajVar = bjVar4.f22717m;
                        float f18 = f17 + ajVar.h;
                        this.S8 = f18;
                        if (ajVar.f22523j) {
                            this.S8 = f18 - getTranslationY();
                        }
                    }
                    if (this.Q5.O5()) {
                        ch.q0 q0Var = this.O;
                        q0Var.getClass();
                        if (this.f31232yb) {
                            this.S8 -= (1.0f - getVideoTranscriptionProgress()) * q0Var.i(x1Var.L1);
                        } else if (q0Var.f5191a > 0.0f) {
                            this.S8 -= q0Var.i(x1Var.L1);
                        }
                    }
                }
                if (this.F8 != 4) {
                    float L5 = ((this.f30962e7 + x1Var.f31957j0) - org.telegram.messenger.g0.L(32.0f)) / 2.0f;
                    if (this.S8 < L5) {
                        this.S8 = L5;
                    }
                }
                if (this.Q5.D == 19) {
                    if (this.F8 == 3 && this.f31078n7 != null) {
                        this.S8 = org.telegram.messenger.g0.L(18.0f);
                    } else {
                        this.S8 = 0.0f;
                    }
                }
                if (!this.Q5.P3() && this.f31232yb && !this.R1) {
                    if (this.G6) {
                        L = (org.telegram.messenger.g0.g3(this.X6, w2()) - org.telegram.messenger.g0.f23613u) * 0.7f;
                    } else {
                        L = org.telegram.messenger.g0.L(50.0f);
                    }
                    if (this.f31245zb) {
                        f13 = (1.0f - getVideoTranscriptionProgress()) * L;
                    } else {
                        f13 = 0.0f;
                    }
                    if (this.f31245zb) {
                        f16 = org.telegram.messenger.g0.L(28.0f) * (1.0f - getVideoTranscriptionProgress());
                    }
                    if (x1Var.f31967l2) {
                        if (this.f31245zb) {
                            f14 = x1Var.L1;
                        } else {
                            f14 = 1.0f - x1Var.L1;
                        }
                        f13 = (1.0f - getVideoTranscriptionProgress()) * f14 * L;
                        if (this.f31245zb) {
                            f15 = x1Var.L1;
                        } else {
                            f15 = 1.0f - x1Var.L1;
                        }
                        f16 = (1.0f - getVideoTranscriptionProgress()) * f15 * org.telegram.messenger.g0.L(28.0f);
                    }
                    this.R8 -= f13;
                    this.S8 -= f16;
                    if (u2()) {
                        float compactRight = getCompactRight() - org.telegram.messenger.g0.L(32.0f);
                        this.R8 = org.telegram.messenger.g0.T1(Math.min(this.U0.y() + org.telegram.messenger.g0.L(8.0f), compactRight), Math.min(this.R8 + f13, compactRight), getVideoTranscriptionProgress());
                    }
                }
                this.G8 = true;
                if (this.F8 == 3) {
                    if (!this.f31221y || gj.R4(this.Q5.f23817k)) {
                        U0(canvas, 1.0f);
                    }
                } else if (!st0.f39409f0) {
                    float f19 = this.R8;
                    float f20 = this.S8;
                    float L6 = org.telegram.messenger.g0.L(32.0f) + f19;
                    float f21 = this.S8;
                    if (this.H8 == 5) {
                        f10 = 64.0f;
                    } else {
                        f10 = 32.0f;
                    }
                    RectF rectF = this.f30933c4;
                    rectF.set(f19, f20, L6, f21 + org.telegram.messenger.g0.L(f10));
                    if (rectF.right >= getMeasuredWidth()) {
                        this.G8 = false;
                        return;
                    }
                    int i10 = (int) ((1.0f - this.E.f57081e) * 255.0f);
                    if (i10 != 255) {
                        float f22 = this.R8;
                        f11 = 32.0f;
                        z11 = false;
                        i7 = canvas.saveLayerAlpha(f22, this.S8, org.telegram.messenger.g0.L(32.0f) + f22, this.S8 + org.telegram.messenger.g0.L(64.0f), i10);
                    } else {
                        f11 = 32.0f;
                        z11 = false;
                        i7 = -1;
                    }
                    x();
                    String str = "paintChatActionBackground";
                    if (this.F8 == 4 && this.H8 == 5 && this.I8) {
                        Path path = this.N8;
                        if (path == null) {
                            this.N8 = new Path();
                        } else {
                            path.rewind();
                        }
                        Path path2 = this.O8;
                        if (path2 == null) {
                            this.O8 = new Path();
                        } else {
                            path2.rewind();
                        }
                        boolean z12 = z11;
                        if (this.P8 == null) {
                            float[] fArr = new float[8];
                            this.P8 = fArr;
                            f12 = 2.0f;
                            float L7 = org.telegram.messenger.g0.L(16.0f);
                            fArr[3] = L7;
                            fArr[2] = L7;
                            fArr[1] = L7;
                            fArr[z12 ? 1 : 0] = L7;
                        } else {
                            f12 = 2.0f;
                        }
                        if (this.Q8 == null) {
                            this.Q8 = r3;
                            float L8 = org.telegram.messenger.g0.L(16.0f);
                            float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f, L8, L8, L8, L8};
                        }
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        float f23 = this.R8;
                        rectF2.set(f23, this.S8, org.telegram.messenger.g0.L(f11) + f23, this.S8 + org.telegram.messenger.g0.L(f11));
                        Path path3 = this.N8;
                        float[] fArr3 = this.P8;
                        Path.Direction direction = Path.Direction.CW;
                        path3.addRoundRect(rectF2, fArr3, direction);
                        rectF2.set(this.R8, this.S8 + org.telegram.messenger.g0.L(f11), this.R8 + org.telegram.messenger.g0.L(f11), this.S8 + org.telegram.messenger.g0.L(64.0f));
                        this.O8.addRoundRect(rectF2, this.Q8, direction);
                        if (this.L8 == 4) {
                            canvas.drawPath(this.N8, a2("paintChatActionBackgroundSelected"));
                            canvas.drawPath(this.O8, a2("paintChatActionBackground"));
                        } else {
                            canvas.drawPath(this.N8, a2("paintChatActionBackground"));
                            canvas.drawPath(this.O8, a2("paintChatActionBackgroundSelected"));
                        }
                    } else {
                        f12 = 2.0f;
                        float L9 = org.telegram.messenger.g0.L(16.0f);
                        float L10 = org.telegram.messenger.g0.L(16.0f);
                        if (this.I8) {
                            str = "paintChatActionBackgroundSelected";
                        }
                        canvas.drawRoundRect(rectF, L9, L10, a2(str));
                    }
                    if (h2()) {
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.j6.f28919h2);
                    }
                    int i11 = this.F8;
                    if (i11 == 2) {
                        Drawable Z1 = Z1("drawableGoIcon");
                        z.t(Z1, (this.R8 + org.telegram.messenger.g0.L(16.0f)) - (Z1.getIntrinsicWidth() / f12), (this.S8 + org.telegram.messenger.g0.L(16.0f)) - (Z1.getIntrinsicHeight() / f12));
                        Z1.draw(canvas);
                    } else if (i11 == 4) {
                        int L11 = (int) (this.R8 + org.telegram.messenger.g0.L(16.0f));
                        int L12 = (int) (this.S8 + org.telegram.messenger.g0.L(16.0f));
                        Drawable Z12 = Z1("drawableCloseIcon");
                        int intrinsicWidth = Z12.getIntrinsicWidth() / 2;
                        int intrinsicHeight = Z12.getIntrinsicHeight() / 2;
                        Z12.setBounds(L11 - intrinsicWidth, L12 - intrinsicHeight, intrinsicWidth + L11, intrinsicHeight + L12);
                        z.t(Z12, this.R8 + org.telegram.messenger.g0.L(4.0f), this.S8 + org.telegram.messenger.g0.L(4.0f));
                        canvas.save();
                        canvas.scale(0.65f, 0.65f, Z12.getBounds().centerX(), Z12.getBounds().centerY());
                        Z12.draw(canvas);
                        canvas.restore();
                        if (this.H8 == 5) {
                            Drawable Z13 = Z1("drawableMoreIcon");
                            int intrinsicWidth2 = Z13.getIntrinsicWidth() / 2;
                            int intrinsicHeight2 = Z13.getIntrinsicHeight() / 2;
                            Z13.setBounds(L11 - intrinsicWidth2, L12 - intrinsicHeight2, L11 + intrinsicWidth2, L12 + intrinsicHeight2);
                            z.t(Z13, this.R8 + org.telegram.messenger.g0.L(4.0f), this.S8 + org.telegram.messenger.g0.L(34.0f));
                            Z13.draw(canvas);
                        }
                    } else {
                        int L13 = (int) (this.R8 + org.telegram.messenger.g0.L(16.0f));
                        int L14 = (int) (this.S8 + org.telegram.messenger.g0.L(16.0f));
                        Drawable Z14 = Z1("drawableShareIcon");
                        int intrinsicWidth3 = Z14.getIntrinsicWidth() / 2;
                        int intrinsicHeight3 = Z14.getIntrinsicHeight() / 2;
                        Z14.setBounds(L13 - intrinsicWidth3, L14 - intrinsicHeight3, L13 + intrinsicWidth3, L14 + intrinsicHeight3);
                        z.t(Z14, this.R8 + org.telegram.messenger.g0.L(4.0f), this.S8 + org.telegram.messenger.g0.L(4.0f));
                        Z14.draw(canvas);
                    }
                    if (i7 != -1) {
                        canvas.restoreToCount(i7);
                    }
                }
            }
        }
    }

    public final boolean v2() {
        return u2();
    }

    public final void v3(float f10, float f11, float f12, float f13) {
        fi.u2 u2Var = this.U0;
        u2Var.y0(f10, f11, f12, f13);
        int i7 = this.M1;
        if (i7 != 4 && i7 != 2) {
            return;
        }
        this.M3 = (int) (u2Var.L0 + org.telegram.messenger.g0.L(8.0f));
        int L = (int) (u2Var.M0 + org.telegram.messenger.g0.L(8.0f));
        this.N3 = L;
        int i10 = this.M3;
        int L2 = org.telegram.messenger.g0.L(24.0f) + this.N3;
        this.R0.r(i10, L, org.telegram.messenger.g0.L(24.0f) + i10, L2);
        this.K3 = (int) com.google.android.gms.internal.vision.e2.A(u2Var.N0, org.telegram.messenger.g0.L(48.0f), 2.0f, f10);
        int A = (int) com.google.android.gms.internal.vision.e2.A(u2Var.O0, org.telegram.messenger.g0.L(48.0f), 2.0f, u2Var.M0);
        this.L3 = A;
        int i11 = this.K3;
        int L3 = org.telegram.messenger.g0.L(48.0f) + this.L3;
        this.Q0.r(i11, A, org.telegram.messenger.g0.L(48.0f) + i11, L3);
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
            Drawable[] drawableArr = this.J2;
            if (drawable != drawableArr[0] && drawable != this.f31225y3 && drawable != drawableArr[1]) {
                t1 t1Var = this.Y0;
                if (t1Var != null) {
                    yVar = t1Var.f31540x;
                } else {
                    yVar = null;
                }
                if (drawable == yVar || drawable == this.V2 || drawable == this.Ka || ((drawable != null && (((m1Var = this.f31006hc) != null && drawable == m1Var.f30683k) || (((m1Var2 = this.f31019ic) != null && drawable == m1Var2.f30683k) || ((m1Var3 = this.Oc) != null && drawable == m1Var3.f30683k)))) || ((this.O != null && (drawable instanceof org.telegram.ui.Components.g6)) || (drawable instanceof d80)))) {
                    return true;
                }
                w1 w1Var = this.f31211x2;
                if (w1Var == null || (aVar = w1Var.f31860l) == null || (drawable != aVar && drawable != aVar.f58419a)) {
                    ArrayList arrayList = this.Q4;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        p1 p1Var = (p1) obj;
                        if (p1Var.f30857w != drawable && ((bVar = p1Var.f30858x) == null || (drawable != bVar && drawable != bVar.f58408a && drawable != bVar.f58409b))) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void w() {
        er erVar;
        boolean z10 = this.n1;
        if (z10 || this.f31086o1) {
            if ((z10 && this.f31099p1 == 1.0f) || (!z10 && this.f31099p1 == 0.0f)) {
                this.f31086o1 = false;
            }
            if (z10) {
                erVar = er.f34421g;
            } else {
                erVar = er.f34422i;
            }
            this.f31128r1 = (int) Math.ceil(erVar.getInterpolation(this.f31099p1) * org.telegram.messenger.g0.L(35.0f));
            if (this.Q5.D == 36) {
                if (org.telegram.messenger.g0.L(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                    this.f31128r1 = 0;
                }
            }
            if (!this.Q5.P3() || this.Q5.D2) {
                a4();
            }
            if (this.f31086o1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f31113q1;
                this.f31113q1 = elapsedRealtime;
                if (this.n1) {
                    float f10 = (((float) j3) / 200.0f) + this.f31099p1;
                    this.f31099p1 = f10;
                    if (f10 > 1.0f) {
                        this.f31099p1 = 1.0f;
                    }
                } else {
                    float f11 = this.f31099p1 - (((float) j3) / 200.0f);
                    this.f31099p1 = f11;
                    if (f11 <= 0.0f) {
                        this.f31099p1 = 0.0f;
                    }
                }
                invalidate();
                ((View) getParent()).invalidate();
            }
        }
    }

    public final int w0(int i7, gj gjVar) {
        TLRPC.WebPage webPage;
        TLRPC.Document document;
        boolean z10;
        int i10;
        c1 c1Var;
        c1 c1Var2;
        int i11 = i7;
        TLRPC.MessageMedia messageMedia = gjVar.f23773a1;
        if (messageMedia != null) {
            this.N1 = messageMedia.document;
        } else if (gjVar.D == 0) {
            TLRPC.MessageMedia n1 = gj.n1(gjVar.f23817k);
            if (n1 == null) {
                webPage = null;
            } else {
                webPage = n1.webpage;
            }
            if (webPage == null) {
                document = null;
            } else {
                document = webPage.document;
            }
            this.N1 = document;
        } else {
            this.N1 = gjVar.F0();
        }
        TLRPC.Document document2 = this.N1;
        int i12 = 0;
        if (document2 != null) {
            double d = 0.0d;
            if (gj.Q4(document2)) {
                D1();
                this.M1 = 3;
                int i13 = 0;
                while (true) {
                    if (i13 >= this.N1.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.N1.attributes.get(i13);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute.duration;
                        break;
                    }
                    i13++;
                }
                org.telegram.messenger.g0.L(94.0f);
                Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText("00:00"));
                this.V6 = i11 - org.telegram.messenger.g0.L(18.0f);
                X2(gjVar);
                int L = org.telegram.messenger.g0.L(174.0f) + this.A9;
                if (!this.R1) {
                    this.f30923b7 = Math.min(i11, L + ((int) Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText(org.telegram.messenger.g0.g0((int) d, true, false)))));
                }
                this.E4.f39735m = gjVar;
                return 0;
            } else if (gj.K4(this.N1)) {
                this.M1 = 4;
                if (!gjVar.m5()) {
                    T3();
                    String i02 = org.telegram.messenger.g0.i0(this.N1.size, false, false);
                    this.f30972f3 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText(i02));
                    this.f30958e3 = new StaticLayout(i02, org.telegram.ui.ActionBar.j6.C2, this.f30972f3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return 0;
                }
            } else if (gj.J3(this.N1)) {
                D1();
                this.M1 = 5;
                int L2 = i11 - org.telegram.messenger.g0.L(92.0f);
                if (L2 < 0) {
                    L2 = org.telegram.messenger.g0.L(100.0f);
                }
                int i14 = L2;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(gjVar.y1(true).replace('\n', ' '), org.telegram.ui.ActionBar.j6.O2, i14 - org.telegram.messenger.g0.L(12.0f), truncateAt);
                c1 c1Var3 = this.K4;
                TextPaint textPaint = org.telegram.ui.ActionBar.j6.O2;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                c1Var3.d = new StaticLayout(ellipsize, textPaint, i14, alignment, 1.0f, 0.0f, false);
                if (this.K4.d.getLineCount() > 0) {
                    this.K4.f30086e = -((int) Math.ceil(c1Var2.d.getLineLeft(0)));
                    int lineWidth = (int) this.K4.d.getLineWidth(0);
                    if (org.telegram.messenger.g0.L(104.0f) + lineWidth > this.f30923b7) {
                        this.f30923b7 = org.telegram.messenger.g0.L(104.0f) + lineWidth;
                    }
                }
                this.K4.f30087f = new StaticLayout(TextUtils.ellipsize(gjVar.w1(true).replace('\n', ' '), org.telegram.ui.ActionBar.j6.P2, i14, truncateAt), org.telegram.ui.ActionBar.j6.P2, i14, alignment, 1.0f, 0.0f, false);
                if (this.K4.f30087f.getLineCount() > 0) {
                    this.K4.f30088g = -((int) Math.ceil(c1Var.f30087f.getLineLeft(0)));
                    int lineWidth2 = (int) this.K4.f30087f.getLineWidth(0);
                    if (org.telegram.messenger.g0.L(104.0f) + lineWidth2 > this.f30923b7) {
                        this.f30923b7 = org.telegram.messenger.g0.L(104.0f) + lineWidth2;
                    }
                }
                while (true) {
                    if (i12 >= this.N1.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute2 = this.N1.attributes.get(i12);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute2.duration;
                        break;
                    }
                    i12++;
                }
                int i15 = (int) d;
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText(org.telegram.messenger.g0.k0(i15, i15)));
                org.telegram.messenger.g0.L(86.0f);
                this.V6 = this.f30923b7 - org.telegram.messenger.g0.L(28.0f);
                return ceil;
            } else if (gj.s3(this.N1, gjVar.z2())) {
                this.M1 = 2;
                if (!gjVar.m5()) {
                    String M0 = hd.M0(2131753971, "AttachGif");
                    this.C3 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText(M0));
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.C2;
                    int i16 = this.C3;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    this.f31212x3 = new StaticLayout(M0, textPaint2, i16, alignment2, 1.0f, 0.0f, false);
                    String i03 = org.telegram.messenger.g0.i0(this.N1.size, false, false);
                    this.f30972f3 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText(i03));
                    this.f30958e3 = new StaticLayout(i03, org.telegram.ui.ActionBar.j6.C2, this.f30972f3, alignment2, 1.0f, 0.0f, false);
                }
            } else {
                String str = this.N1.mime_type;
                if ((str != null && (str.toLowerCase().startsWith("image/") || this.N1.mime_type.toLowerCase().startsWith("video/mp4"))) || gj.W2(this.N1)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.O1 = z10;
                if (!z10) {
                    i11 += org.telegram.messenger.g0.L(30.0f);
                }
                int i17 = i11;
                this.M1 = 1;
                String B = org.telegram.messenger.w7.B(this.N1);
                if (B.length() == 0) {
                    B = hd.M0(2131753975, "AttachDocument");
                }
                StaticLayout c10 = ou0.c(B, org.telegram.ui.ActionBar.j6.G2, i17, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.MIDDLE, i17, 2, false);
                this.f30958e3 = c10;
                this.f30984g3 = Integer.MIN_VALUE;
                if (c10 != null && c10.getLineCount() > 0) {
                    int i18 = 0;
                    for (int i19 = 0; i19 < this.f30958e3.getLineCount(); i19++) {
                        i18 = Math.max(i18, (int) Math.ceil(this.f30958e3.getLineWidth(i19)));
                        this.f30984g3 = Math.max(this.f30984g3, (int) Math.ceil(-this.f30958e3.getLineLeft(i19)));
                    }
                    i10 = Math.min(i17, i18);
                } else {
                    this.f30984g3 = 0;
                    i10 = i17;
                }
                int min = Math.min(i17 - org.telegram.messenger.g0.L(30.0f), (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText("000.0 mm / ".concat(org.telegram.messenger.g0.i0(this.N1.size, false, false)))));
                this.C3 = min;
                CharSequence ellipsize2 = TextUtils.ellipsize(org.telegram.messenger.g0.i0(this.N1.size, false, false) + " " + org.telegram.messenger.w7.A(this.N1), org.telegram.ui.ActionBar.j6.C2, min, TextUtils.TruncateAt.END);
                try {
                    if (this.C3 < 0) {
                        this.C3 = org.telegram.messenger.g0.L(10.0f);
                    }
                    this.f31212x3 = new StaticLayout(ellipsize2, org.telegram.ui.ActionBar.j6.C2, this.C3 + org.telegram.messenger.g0.L(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (this.O1) {
                    this.f30959e4 = org.telegram.messenger.w7.w(gjVar.f23837p0, 320, false, null, false);
                    this.f30973f4 = org.telegram.messenger.w7.w(gjVar.f23837p0, 40, false, null, false);
                    if (this.Q5.x3() || (org.telegram.messenger.z5.q(this.f30908a6).l() & 1) == 0) {
                        this.f30959e4 = null;
                    }
                    TLRPC.PhotoSize photoSize = this.f30959e4;
                    fi.u2 u2Var = this.U0;
                    if (photoSize != null && photoSize != this.f30973f4) {
                        BitmapDrawable bitmapDrawable = this.Q5.I1;
                        if (bitmapDrawable != null) {
                            this.f30973f4 = null;
                            this.f30985g4 = bitmapDrawable;
                        }
                    } else {
                        this.f30959e4 = null;
                        u2Var.G0 = true;
                        u2Var.H0 = true;
                    }
                    this.f30999h4 = "86_86_b";
                    u2Var.r0(gc.f(this.f30959e4, gjVar.f23830n0), "86_86", gc.f(this.f30973f4, gjVar.f23830n0), this.f30999h4, this.f30985g4, 0L, null, gjVar, 1);
                }
                return i10;
            }
        }
        return 0;
    }

    public final void w1(Canvas canvas, Path path, float f10, int i7) {
        if (f10 <= 0.0f) {
            return;
        }
        RectF rectF = this.Tc;
        path.computeBounds(rectF, false);
        float f11 = (0.25f * f10) + 0.75f;
        canvas.save();
        canvas.scale(f11, f11, rectF.centerX(), rectF.centerY());
        this.Uc.setColor(org.telegram.ui.ActionBar.j6.r1(f10 * 0.2f, i7));
        this.Uc.setPathEffect(u70.c());
        canvas.drawPath(path, this.Uc);
        canvas.restore();
    }

    public final boolean w2() {
        gj gjVar = this.Q5;
        if (gjVar != null) {
            return gjVar.P2();
        }
        return org.telegram.ui.ActionBar.j6.i1(this.Qb);
    }

    public final void w3(org.telegram.messenger.gj r111, org.telegram.messenger.bj r112, boolean r113, boolean r114, boolean r115, boolean r116) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.w3(org.telegram.messenger.gj, org.telegram.messenger.bj, boolean, boolean, boolean, boolean):void");
    }

    public final void x() {
        y(getX(), this.f30927bb, getMeasuredWidth(), this.f30940cb);
    }

    public final void x1(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f10, boolean z14, float f11, float f12, float f13, boolean z15, boolean z16) {
        float photoBottom;
        float f14;
        float f15;
        float f16;
        int L;
        int L2;
        int i7;
        Drawable Z1;
        Drawable drawable;
        int w02;
        float f17;
        gj gjVar;
        boolean z17 = (f13 == 1.0f || z15) ? false : true;
        float f18 = (f13 * 0.5f) + 0.5f;
        float f19 = z17 ? f10 * f13 : f10;
        if (this.M1 != 7 || ((gjVar = this.Q5) != null && gjVar.g4())) {
            photoBottom = getPhotoBottom() + this.f31196w0;
        } else {
            photoBottom = f12 - ((1.0f - getVideoTranscriptionProgress()) * (this.O.i(this.f31018ib.L1) + org.telegram.messenger.g0.L(this.K ? 4.0f : 5.0f)));
        }
        float L3 = photoBottom - org.telegram.messenger.g0.L(8.5f);
        gj gjVar2 = this.Q5;
        float L4 = (gjVar2 == null || !gjVar2.M2()) ? 0.0f : org.telegram.messenger.g0.L(-6.0f);
        float f20 = 22.0f;
        if (z12) {
            ya0 ya0Var = org.telegram.ui.ActionBar.j6.E3;
            if (G3()) {
                if (this.Q5.P5()) {
                    f14 = 1.0f;
                    w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Zc, this.Qb);
                    int i10 = this.f30949d7;
                    f17 = z14 ? 24.0f : 22.0f;
                    ya0Var.getClass();
                    f16 = 4.0f;
                    z.t(ya0Var, ((i10 - org.telegram.messenger.g0.L(f17)) - org.telegram.messenger.g0.L(12.0f)) + L4, (L3 - org.telegram.messenger.g0.L(12.0f)) + f11);
                    ya0Var.setAlpha((int) (this.f31038k4 * 255.0f * f19));
                } else {
                    f14 = 1.0f;
                    f16 = 4.0f;
                    w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28984kd, this.Qb);
                    int i11 = this.f30949d7;
                    f17 = z14 ? 24.0f : 22.0f;
                    ya0Var.getClass();
                    z.t(ya0Var, ((i11 - org.telegram.messenger.g0.L(f17)) - org.telegram.messenger.g0.L(12.0f)) + L4, (L3 - org.telegram.messenger.g0.L(12.0f)) + f11);
                    ya0Var.setAlpha((int) (f19 * 255.0f));
                }
                f15 = 18.5f;
            } else {
                f14 = 1.0f;
                f16 = 4.0f;
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Eb, this.Qb);
                ya0Var.getClass();
                f15 = 18.5f;
                z.t(ya0Var, (this.f30949d7 - org.telegram.messenger.g0.L(18.5f)) - org.telegram.messenger.g0.L(12.0f), ((f12 - org.telegram.messenger.g0.L(8.5f)) - org.telegram.messenger.g0.L(12.0f)) + f11);
                ya0Var.setAlpha((int) (f19 * 255.0f));
            }
            ya0Var.a(w02);
            if (z17) {
                canvas.save();
                canvas.scale(f18, f18, ya0Var.getBounds().centerX(), ya0Var.getBounds().centerY());
            }
            ya0Var.draw(canvas);
            ya0Var.setAlpha(255);
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
            if (G3()) {
                if (z15) {
                    canvas.save();
                }
                if (this.Q5.P5()) {
                    drawable = Z1("drawableMsgStickerCheck");
                    if (z10) {
                        if (z15) {
                            canvas.translate(org.telegram.messenger.g0.L(4.8f) * (f14 - f13), 0.0f);
                        }
                        z.t(drawable, ((this.f30949d7 - org.telegram.messenger.g0.L(z14 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f11);
                    } else {
                        z.t(drawable, ((this.f30949d7 - org.telegram.messenger.g0.L(z14 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f11);
                    }
                    drawable.setAlpha((int) (this.f31038k4 * 255.0f * f19));
                } else {
                    if (z10) {
                        if (z15) {
                            canvas.translate((f14 - f13) * org.telegram.messenger.g0.L(4.8f), 0.0f);
                        }
                        z.t(org.telegram.ui.ActionBar.j6.F3, (this.f30949d7 - org.telegram.messenger.g0.L(z14 ? 28.3f : 26.3f)) - org.telegram.ui.ActionBar.j6.F3.getIntrinsicWidth(), (L3 - org.telegram.ui.ActionBar.j6.F3.getIntrinsicHeight()) + f11);
                    } else {
                        z.t(org.telegram.ui.ActionBar.j6.F3, (this.f30949d7 - org.telegram.messenger.g0.L(z14 ? 23.5f : 21.5f)) - org.telegram.ui.ActionBar.j6.F3.getIntrinsicWidth(), (L3 - org.telegram.ui.ActionBar.j6.F3.getIntrinsicHeight()) + f11);
                    }
                    org.telegram.ui.ActionBar.j6.F3.setAlpha((int) (this.f31038k4 * 255.0f * f19));
                    drawable = org.telegram.ui.ActionBar.j6.F3;
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
                    Z1 = Z1(z16 ? "drawableMsgOutCheckReadSelected" : "drawableMsgOutCheckRead");
                    z.t(Z1, ((this.f30949d7 - org.telegram.messenger.g0.L(22.5f)) - Z1.getIntrinsicWidth()) + L4, ((f12 - org.telegram.messenger.g0.L((this.G || this.F) ? 9.0f : 8.0f)) - Z1.getIntrinsicHeight()) + f11);
                } else {
                    Z1 = Z1(z16 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    z.t(Z1, ((this.f30949d7 - org.telegram.messenger.g0.L(f15)) - Z1.getIntrinsicWidth()) + L4, ((f12 - org.telegram.messenger.g0.L((this.G || this.F) ? 9.0f : 8.0f)) - Z1.getIntrinsicHeight()) + f11);
                }
                Z1.setAlpha((int) (f19 * 255.0f));
                if (z17) {
                    canvas.save();
                    canvas.scale(f18, f18, Z1.getBounds().centerX(), Z1.getBounds().centerY());
                }
                Z1.draw(canvas);
                if (z17) {
                    canvas.restore();
                }
                if (z15) {
                    canvas.restore();
                }
                Z1.setAlpha(255);
            }
        }
        if (z10) {
            if (G3()) {
                Drawable Z12 = this.Q5.P5() ? Z1("drawableMsgStickerHalfCheck") : org.telegram.ui.ActionBar.j6.G3;
                z.t(Z12, ((this.f30949d7 - org.telegram.messenger.g0.L(z14 ? 23.5f : 21.5f)) - Z12.getIntrinsicWidth()) + L4, (L3 - Z12.getIntrinsicHeight()) + f11);
                Z12.setAlpha((int) (this.f31038k4 * 255.0f * f19));
                if (z17 || z15) {
                    canvas.save();
                    canvas.scale(f18, f18, Z12.getBounds().centerX(), Z12.getBounds().centerY());
                }
                Z12.draw(canvas);
                if (z17 || z15) {
                    canvas.restore();
                }
                Z12.setAlpha(255);
            } else {
                Drawable Z13 = Z1(z16 ? "drawableMsgOutHalfCheckSelected" : "drawableMsgOutHalfCheck");
                z.t(Z13, (this.f30949d7 - org.telegram.messenger.g0.L(18.0f)) - Z13.getIntrinsicWidth(), ((f12 - org.telegram.messenger.g0.L((this.G || this.F) ? 9.0f : 8.0f)) - Z13.getIntrinsicHeight()) + f11);
                Z13.setAlpha((int) (f19 * 255.0f));
                if (z17 || z15) {
                    canvas.save();
                    canvas.scale(f18, f18, Z13.getBounds().centerX(), Z13.getBounds().centerY());
                }
                Z13.draw(canvas);
                if (z17 || z15) {
                    canvas.restore();
                }
                Z13.setAlpha(255);
            }
        }
        if (z13) {
            if (G3()) {
                L = this.f30949d7 - org.telegram.messenger.g0.L(34.5f);
                L2 = org.telegram.messenger.g0.L(26.5f);
            } else {
                L = this.f30949d7 - org.telegram.messenger.g0.L(32.0f);
                if (!this.G && !this.F) {
                    f20 = 21.0f;
                }
                L2 = org.telegram.messenger.g0.L(f20);
            }
            float f21 = (f12 - L2) + f11;
            RectF rectF = this.f30933c4;
            rectF.set((int) (L + L4), f21, org.telegram.messenger.g0.L(14.0f) + i7, org.telegram.messenger.g0.L(14.0f) + f21);
            int alpha = org.telegram.ui.ActionBar.j6.f28808b2.getAlpha();
            org.telegram.ui.ActionBar.j6.f28808b2.setAlpha((int) (alpha * f19));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f14), org.telegram.messenger.g0.L(f14), org.telegram.ui.ActionBar.j6.f28808b2);
            org.telegram.ui.ActionBar.j6.f28808b2.setAlpha(alpha);
            z.t(org.telegram.ui.ActionBar.j6.f28956j4, org.telegram.messenger.g0.L(6.0f) + i7, f21 + org.telegram.messenger.g0.L(2.0f));
            org.telegram.ui.ActionBar.j6.f28956j4.setAlpha((int) (f19 * 255.0f));
            if (z17) {
                canvas.save();
                canvas.scale(f18, f18, org.telegram.ui.ActionBar.j6.f28956j4.getBounds().centerX(), org.telegram.ui.ActionBar.j6.f28956j4.getBounds().centerY());
            }
            org.telegram.ui.ActionBar.j6.f28956j4.draw(canvas);
            org.telegram.ui.ActionBar.j6.f28956j4.setAlpha(255);
            if (z17) {
                canvas.restore();
            }
        }
    }

    public final boolean x2(gj gjVar) {
        int i7 = gj.n1(this.Q5.f23817k).period;
        int currentTime = ConnectionsManager.getInstance(this.f30908a6).getCurrentTime();
        if (i7 == Integer.MAX_VALUE) {
            return false;
        }
        if (i7 % 60 == 0) {
            if (Math.abs(currentTime - gjVar.f23817k.date) <= i7) {
                return false;
            }
            return true;
        } else if (Math.abs(currentTime - gjVar.f23817k.date) <= i7 - 5) {
            return false;
        } else {
            return true;
        }
    }

    public void x3(gj gjVar, bj bjVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.O0) {
            w3(gjVar, bjVar, z10, z11, z12, z13);
            return;
        }
        this.R5 = gjVar;
        this.S5 = bjVar;
        this.U5 = z10;
        this.T5 = z11;
        this.V5 = z12;
        this.W5 = z13;
    }

    public final void y(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.Qb;
        if (e6Var != null) {
            e6Var.b(f10, f11 + this.W + this.f30981g0 + this.f31008i0, i7, i10);
        } else {
            org.telegram.ui.ActionBar.j6.r(f10, f11 + this.W + this.f30981g0 + this.f31008i0, i7, i10);
        }
    }

    public final void y0() {
        float f10;
        float f11;
        int i7;
        int measureText;
        boolean z10;
        if (this.f31169u2) {
            B0(0);
        }
        if (this.f31169u2 && this.f31129r2 == null) {
            this.D2 = org.telegram.messenger.g0.L(33.0f);
            CharSequence charSequence = this.f31236z2;
            if (charSequence == null) {
                int i10 = this.f31224y2;
                if (i10 == 12) {
                    charSequence = hd.M0(2131747808, null);
                } else if (i10 == 1) {
                    charSequence = hd.M0(2131747812, null);
                } else if (i10 == 29) {
                    charSequence = hd.M0(2131747809, null);
                } else if (i10 == 13) {
                    charSequence = hd.M0(2131745601, null).toUpperCase();
                } else if (i10 == 32) {
                    charSequence = hd.M0(2131747786, null).toUpperCase();
                } else if (i10 == 85) {
                    charSequence = hd.M0(2131747816, null);
                } else if (i10 == 10) {
                    charSequence = hd.M0(2131747813, null);
                } else if (i10 == 2) {
                    charSequence = hd.M0(2131747800, null);
                } else if (i10 == 3) {
                    charSequence = hd.M0(2131747787, null);
                } else if (i10 == 5) {
                    charSequence = hd.M0(2131743556, null);
                } else if (i10 == 6) {
                    charSequence = hd.M0(2131747814, null);
                } else if (i10 == 7) {
                    charSequence = hd.M0(2131747784, null);
                } else if (i10 != 9 && i10 != 11) {
                    if (i10 == 25) {
                        charSequence = hd.M0(2131743367, null);
                    } else if (i10 == 14) {
                        charSequence = hd.M0(2131743558, null).toUpperCase();
                    } else if (i10 == 15) {
                        charSequence = hd.M0(2131752918, null).toUpperCase();
                    } else if (i10 == 16) {
                        charSequence = hd.M0(2131747789, null).toUpperCase();
                    } else if (i10 == 17) {
                        charSequence = hd.M0(2131743541, null).toUpperCase();
                    } else if (i10 != 18 && i10 != 22) {
                        if (i10 == 19) {
                            charSequence = hd.M0(2131753346, null);
                        } else if (i10 == 20) {
                            charSequence = hd.M0(2131747804, null);
                        } else if (i10 == 21) {
                            charSequence = hd.M0(2131754230, null);
                        } else if (i10 == 23) {
                            charSequence = hd.M0(2131747785, null);
                        } else if (i10 == 24) {
                            charSequence = hd.M0(2131747807, null);
                        } else if (i10 == 26) {
                            TL_stars.StarGift starGift = this.f31194vd;
                            if (starGift != null) {
                                if (starGift.auction_start_date > ConnectionsManager.getInstance(this.f30908a6).getCurrentTime()) {
                                    charSequence = hd.M0(2131747801, null);
                                    z10 = false;
                                } else {
                                    if (this.f31194vd.sold_out) {
                                        charSequence = hd.M0(2131747802, null);
                                    } else {
                                        charSequence = hd.M0(2131747803, null);
                                    }
                                    z10 = true;
                                }
                                if (z10) {
                                    SpannableString spannableString = new SpannableString("*");
                                    spannableString.setSpan(new eq(2131231117, 0), 0, spannableString.length(), 33);
                                    charSequence = TextUtils.concat(spannableString, " ", charSequence);
                                }
                            } else {
                                charSequence = hd.M0(2131747783, null);
                            }
                        } else if (i10 == 27) {
                            charSequence = hd.M0(2131749080, null).toUpperCase();
                        } else if (i10 == 28) {
                            charSequence = hd.M0(2131743557, null);
                        } else {
                            charSequence = hd.M0(2131749193, null);
                        }
                    } else {
                        charSequence = hd.M0(2131753616, null);
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) gj.n1(this.Q5.f23817k).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = hd.M0(2131743366, null);
                    } else {
                        charSequence = hd.M0(2131743367, null);
                    }
                }
            }
            if (this.Q5.r4() && this.f30923b7 < (measureText = (int) (org.telegram.ui.ActionBar.j6.M2.measureText(charSequence, 0, charSequence.length()) + org.telegram.messenger.g0.L(75.0f)))) {
                this.f30923b7 = measureText;
            }
            int L = this.f30923b7 - org.telegram.messenger.g0.L(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.j6.M2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.M2, org.telegram.messenger.g0.L(2.0f) + L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f31129r2 = staticLayout;
            int lineCount = staticLayout.getLineCount();
            float f12 = 0.0f;
            if (lineCount > 0) {
                f10 = this.f31129r2.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f31144s2 = f10;
            if (this.f31129r2.getLineCount() > 0) {
                f12 = this.f31129r2.getLineLeft(0);
            }
            this.f31156t2 = f12;
            int i11 = this.f30923b7;
            int i12 = this.f31224y2;
            if (i12 != 82 && i12 != 81 && i12 != 80 && i12 != 84 && i12 != 83) {
                f11 = 34.0f;
            } else {
                f11 = 13.0f;
            }
            this.D2 = i11 - org.telegram.messenger.g0.L(f11);
            int L2 = org.telegram.messenger.g0.L(46.0f) + this.f31181v0;
            this.f31181v0 = L2;
            if (this.Q5.D == 12) {
                this.f31181v0 = org.telegram.messenger.g0.L(14.0f) + L2;
            }
            if (this.Q5.r4()) {
                this.f31181v0 = org.telegram.messenger.g0.L(2.0f) + this.f31181v0;
            }
            StaticLayout staticLayout2 = this.f31129r2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.D2 - Math.ceil(this.f31129r2.getLineWidth(0)))) / 2;
                if (this.f31224y2 == 0) {
                    i7 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    i7 = 0;
                }
                this.B2 = ceil + i7;
                int lineLeft = (int) this.f31129r2.getLineLeft(0);
                this.C2 = lineLeft;
                this.B2 += -lineLeft;
            }
        }
    }

    public void y1(float r16, android.graphics.Canvas r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.y1(float, android.graphics.Canvas, boolean):void");
    }

    public boolean y2() {
        if (((isPressed() && this.D6) || ((!this.D6 && this.f31202w6) || this.f31215x6)) && !K3() && !m2()) {
            gj gjVar = this.Q5;
            if (gjVar == null || !gjVar.f23854t1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void y3(int i7) {
        this.f31071n = i7;
    }

    public final void z(int i7, int i10, int i11) {
        int k12;
        boolean z10;
        int i12;
        int i13;
        iv ivVar;
        boolean z11;
        if (this.Q5.r4()) {
            this.f30923b7 = org.telegram.messenger.g0.L(31.0f) + i11;
        } else if (d4()) {
            this.f30923b7 = org.telegram.messenger.g0.L(31.0f) + i11;
        } else {
            ch.q0 q0Var = this.O;
            if (!q0Var.f5204p) {
                k12 = q0Var.f5206r;
            } else {
                k12 = this.Q5.k1();
            }
            boolean z12 = false;
            if (!q0Var.f5204p) {
                if (i7 - k12 >= i10 && !this.Q5.f23866w2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (this.U1) {
                    this.f31181v0 = org.telegram.messenger.g0.L(14.0f) + this.f31181v0;
                }
            } else if ((this.f31182v1 || ((!this.R1 || this.Q5.r4()) && !g2() && !this.S1 && !this.T1 && !this.U1)) && i7 - k12 >= i10 && !this.Q5.f23866w2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.Q5.G4()) {
                z10 = true;
            }
            if (q0Var.f5204p && (ivVar = this.Q5.f23874y2) != null) {
                ArrayList arrayList = ivVar.h;
                ArrayList arrayList2 = ivVar.f24445g;
                if (!arrayList2.isEmpty() && !ivVar.d && !ivVar.I()) {
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            if (((yt) obj).f27814b >= arrayList2.size() - 1) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    z11 = ((cu) i5.c.h(1, arrayList2)).v();
                } else {
                    z11 = true;
                    break;
                }
                if (z11) {
                    z10 = true;
                }
            }
            gj gjVar = this.Q5;
            if ((gjVar.F2 && q0Var.f5204p) || ((gjVar.J2 && q0Var.f5204p) || gjVar.v3())) {
                i12 = 18;
                z10 = true;
            } else {
                i12 = 14;
            }
            if (q0Var.f5204p && P2() && !TextUtils.isEmpty(this.Q5.f23875z) && !this.f31197w1) {
                z12 = true;
            }
            if (z10) {
                if (!z12) {
                    this.f31181v0 = org.telegram.messenger.g0.L(i12) + this.f31181v0;
                    this.f30936c7 = true;
                }
                int L = org.telegram.messenger.g0.L(31.0f) + Math.max(i11, k12);
                this.f30923b7 = L;
                if (this.Q5.P3()) {
                    i13 = org.telegram.messenger.g0.L(17.0f) + this.A9;
                } else {
                    i13 = this.A9;
                }
                this.f30923b7 = org.telegram.messenger.k5.b(31.0f, i13, L);
            } else {
                int extraTextX = (i11 - getExtraTextX()) - k12;
                if (extraTextX >= 0 && extraTextX <= i10) {
                    this.f30923b7 = org.telegram.messenger.g0.L(31.0f) + ((i11 + i10) - extraTextX);
                } else {
                    this.f30923b7 = org.telegram.messenger.g0.L(31.0f) + Math.max(i11, k12 + i10);
                }
            }
            if (u2()) {
                this.f30923b7 = org.telegram.messenger.g0.L(31.0f) + i7;
            }
        }
    }

    public final void z0(long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.z0(long, long):void");
    }

    public final void z1(Canvas canvas, float f10, boolean z10, float f11, StaticLayout staticLayout, float f12, boolean z11) {
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
        Paint a22;
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
        gj gjVar;
        TextPaint textPaint;
        int i21;
        int i22;
        q1 q1Var2 = this;
        Canvas canvas2 = canvas;
        if (((q1Var2.F9 && !q1Var2.N) || !q1Var2.G3()) && staticLayout != null) {
            gj gjVar2 = q1Var2.Q5;
            if ((!gjVar2.Z || q1Var2.M == null) && (i7 = gjVar2.D) != 16) {
                if (i7 == 5) {
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.T2;
                    if (q1Var2.u2()) {
                        i21 = q1Var2.Q5.P3() ? org.telegram.ui.ActionBar.j6.f28964jc : org.telegram.ui.ActionBar.j6.f28875ee;
                    } else {
                        i21 = org.telegram.ui.ActionBar.j6.Zc;
                    }
                    int w02 = org.telegram.ui.ActionBar.j6.w0(i21, q1Var2.Qb);
                    if (q1Var2.y2()) {
                        i22 = q1Var2.Q5.P3() ? org.telegram.ui.ActionBar.j6.f28873ec : org.telegram.ui.ActionBar.j6.fe;
                    } else {
                        i22 = q1Var2.Q5.P3() ? org.telegram.ui.ActionBar.j6.f28964jc : org.telegram.ui.ActionBar.j6.f28875ee;
                    }
                    textPaint2.setColor(i0.a.f(q1Var2.getVideoTranscriptionProgress(), w02, org.telegram.ui.ActionBar.j6.w0(i22, q1Var2.Qb)));
                } else if (q1Var2.G3()) {
                    if (q1Var2.Q5.P5()) {
                        org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Zc, q1Var2.Qb));
                    } else {
                        org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28819be, q1Var2.Qb));
                    }
                } else if (q1Var2.Q5.P3()) {
                    org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.w0(z11 ? org.telegram.ui.ActionBar.j6.f28873ec : org.telegram.ui.ActionBar.j6.f28964jc, q1Var2.Qb));
                } else {
                    org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.w0(z11 ? org.telegram.ui.ActionBar.j6.fe : org.telegram.ui.ActionBar.j6.f28875ee, q1Var2.Qb));
                }
                float f23 = q1Var2.getTransitionParams().K1 ? q1Var2.getTransitionParams().L1 * f10 : f10;
                if (f23 != 1.0f) {
                    org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (textPaint.getAlpha() * f23));
                }
                canvas2.save();
                if (q1Var2.K && !q1Var2.G3()) {
                    canvas2.translate(0.0f, org.telegram.messenger.g0.L(2.0f));
                }
                float f24 = q1Var2.f30962e7;
                x1 x1Var5 = q1Var2.f31018ib;
                if (x1Var5.f32012x0) {
                    f24 += x1Var5.f31957j0;
                }
                bj bjVar = q1Var2.L;
                if (bjVar == null || !bjVar.f22717m.f22523j) {
                    f13 = f11;
                } else {
                    f24 -= q1Var2.getTranslationY();
                    f13 = f11 + q1Var2.L.f22717m.f22521g;
                }
                float f25 = f24;
                float f26 = f13;
                if (q1Var2.K && q1Var2.G3()) {
                    f25 += org.telegram.messenger.g0.L(1.0f);
                }
                float f27 = f25;
                if (x1Var5.f32012x0) {
                    float f28 = q1Var2.f31046kd;
                    f13 += f28;
                    f26 += f28;
                }
                float f29 = f13;
                boolean O5 = q1Var2.Q5.O5();
                ch.q0 q0Var = q1Var2.O;
                if (O5) {
                    q0Var.getClass();
                }
                if (x1Var5.U0) {
                    f26 = com.google.android.gms.internal.vision.e2.t(1.0f, x1Var5.L1, x1Var5.Z0, f26);
                }
                float f30 = f26;
                boolean G3 = q1Var2.G3();
                RectF rectF2 = q1Var2.f30933c4;
                fi.u2 u2Var = q1Var2.U0;
                if (G3) {
                    if (q1Var2.f31216x7) {
                        i17 = q1Var2.u2() ? q1Var2.getCommentButtonHeight() : org.telegram.messenger.g0.L(41.3f);
                    } else {
                        i17 = 0;
                    }
                    int i23 = -i17;
                    if (q1Var2.Q5.P5()) {
                        a22 = q1Var2.a2("paintChatActionBackground");
                    } else {
                        a22 = q1Var2.a2("paintChatTimeBackground");
                    }
                    int alpha = a22.getAlpha();
                    float f31 = f23;
                    org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (q1Var2.f31038k4 * 255.0f * f31));
                    gj gjVar3 = q1Var2.Q5;
                    if (gjVar3 == null || gjVar3.D != 4) {
                        f18 = f27;
                        f19 = f31;
                    } else {
                        float f32 = u2Var.N() ? 1.0f : u2Var.f22278i1;
                        if (!u2Var.L()) {
                            f32 = 0.0f;
                        }
                        f18 = f27;
                        f19 = org.telegram.messenger.g0.T1(0.35f, 1.0f, f32);
                    }
                    gj gjVar4 = q1Var2.Q5;
                    if (gjVar4 != null && gjVar4.B0) {
                        org.telegram.ui.Components.e5 e5Var = q1Var2.m0;
                        f19 *= e5Var == null ? 0.0f : e5Var.e();
                    }
                    a22.setAlpha((int) com.google.android.gms.internal.vision.e2.D(alpha, q1Var2.f31038k4, f19, 0.6f));
                    if (q1Var2.d4()) {
                        int L3 = org.telegram.messenger.g0.L(8.0f);
                        int i24 = gz.Y0;
                        if (i24 > 2) {
                            i24 -= 2;
                        }
                        L2 = Math.min(L3, org.telegram.messenger.g0.L(i24));
                        z21 = gz.Y0 >= 10;
                        i10 = 2;
                    } else {
                        int i25 = q1Var2.M1;
                        if (i25 != 7 && i25 != 6 && q1Var2.Q5.D != 19) {
                            int[] iArr = u2Var.X0;
                            i10 = 2;
                            L2 = Math.min(org.telegram.messenger.g0.L(8.0f), Math.max(iArr[2], iArr[3]));
                            z21 = gz.Y0 >= 10;
                        } else {
                            i10 = 2;
                            int L4 = org.telegram.messenger.g0.L(4.0f);
                            gj gjVar5 = q1Var2.Q5;
                            L2 = L4 + ((gjVar5 == null || !gjVar5.M2()) ? 0 : org.telegram.messenger.g0.L(8.0f));
                            z21 = false;
                        }
                    }
                    gj gjVar6 = q1Var2.Q5;
                    float L5 = f29 + ((gjVar6 == null || !gjVar6.M2()) ? 0 : org.telegram.messenger.g0.L(-6.0f));
                    if (q1Var2.f31021j0 != 0) {
                        L5 -= org.telegram.messenger.g0.L(18.0f);
                    }
                    float L6 = L5 - org.telegram.messenger.g0.L(z21 ? 6.0f : 4.0f);
                    gj gjVar7 = q1Var2.Q5;
                    float L7 = (gjVar7 == null || !gjVar7.M2()) ? 0.0f : org.telegram.messenger.g0.L(2.0f);
                    float f33 = f19;
                    float f34 = L5;
                    if (q1Var2.M1 != 7 || ((gjVar = q1Var2.Q5) != null && gjVar.g4())) {
                        photoBottom = q1Var2.getPhotoBottom() + q1Var2.f31196w0;
                    } else {
                        photoBottom = f18 - ((1.0f - q1Var2.getVideoTranscriptionProgress()) * (q0Var.i(x1Var5.L1) + org.telegram.messenger.g0.L(q1Var2.K ? 4.0f : 5.0f)));
                    }
                    float f35 = photoBottom;
                    float L8 = f35 - org.telegram.messenger.g0.L(23.0f);
                    float max = Math.max(org.telegram.messenger.g0.L(17.0f), org.telegram.ui.ActionBar.j6.T2.getTextSize() + org.telegram.messenger.g0.L(5.0f));
                    float f36 = L6 - L7;
                    float f37 = L7 + L6 + f12;
                    int i26 = z21 ? 12 : 8;
                    if (q1Var2.Q5.P3()) {
                        i18 = i26;
                        i19 = (q1Var2.Q5.D == 19 ? 4 : 0) + 20;
                    } else {
                        i18 = i26;
                        i19 = 0;
                    }
                    rectF2.set(f36, L8, f37 + org.telegram.messenger.g0.L(i18 + i19), L8 + max);
                    l4 l4Var = q1Var2.X5;
                    if (l4Var != null) {
                        float f38 = L2;
                        canvas2.save();
                        Path path = l4Var.f30626t;
                        path.rewind();
                        path.addRoundRect(rectF2, f38, f38, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.drawColor(1073741824);
                        canvas2.restore();
                    } else if (!gj.b4(q1Var2.Q5.f23817k)) {
                        if (q1Var2.Q5.t2() && q1Var2.Q5.D != 5) {
                            Path path2 = q1Var2.B4;
                            path2.rewind();
                            float f39 = L2;
                            path2.addRoundRect(rectF2, f39, f39, Path.Direction.CW);
                            canvas2.save();
                            canvas2.clipPath(path2);
                            ImageReceiver imageReceiver = q1Var2.Q5.m5() ? u2Var : q1Var2.V0;
                            float alpha2 = imageReceiver.getAlpha();
                            imageReceiver.setAlpha(0.5f * alpha2);
                            imageReceiver.h(canvas2, null);
                            imageReceiver.setAlpha(alpha2);
                            canvas2.restore();
                            Paint a23 = q1Var2.a2("paintChatTimeBackground");
                            int alpha3 = a23.getAlpha();
                            a23.setAlpha((int) (alpha3 * q1Var2.f31050l4 * 0.4f));
                            canvas2.drawRoundRect(rectF2, f39, f39, a23);
                            a23.setAlpha(alpha3);
                        } else {
                            q1Var2.x();
                            float f40 = L2;
                            canvas2.drawRoundRect(rectF2, f40, f40, a22);
                            if (a22 == q1Var2.a2("paintChatActionBackground") && q1Var2.h2()) {
                                int alpha4 = org.telegram.ui.ActionBar.j6.f28919h2.getAlpha();
                                org.telegram.ui.ActionBar.j6.f28919h2.setAlpha((int) (alpha4 * q1Var2.f31038k4 * f33));
                                canvas2.drawRoundRect(rectF2, f40, f40, org.telegram.ui.ActionBar.j6.f28919h2);
                                org.telegram.ui.ActionBar.j6.f28919h2.setAlpha(alpha4);
                            }
                        }
                    }
                    a22.setAlpha(alpha);
                    float f41 = -staticLayout.getLineLeft(0);
                    gj gjVar8 = q1Var2.Q5;
                    float L9 = f41 + ((gjVar8 == null || !gjVar8.M2()) ? 0 : org.telegram.messenger.g0.L(-6.0f));
                    if (q1Var2.Q5.O5()) {
                        q0Var.getClass();
                    }
                    if ((!org.telegram.messenger.t3.T(q1Var2.f31044ka) || q1Var2.f31044ka.megagroup) && (q1Var2.Q5.f23817k.flags & 1024) == 0 && q1Var2.f30991ga == null && !q1Var2.f31118q6) {
                        f20 = L9;
                        rectF = rectF2;
                        f23 = f31;
                        f27 = f18;
                        i13 = i23;
                        z22 = false;
                        c10 = 6;
                        c11 = 7;
                        c12 = 4;
                    } else {
                        float lineWidth = (q1Var2.A9 - staticLayout.getLineWidth(0)) + L9;
                        q0Var.getClass();
                        int b10 = x1Var5.b();
                        int i27 = x1Var5.f31922b2;
                        if (i27 >= 0 && i27 != b10 && !q1Var2.f31164tb) {
                            q1Var2.C0(i27, b10, z10);
                        }
                        boolean z25 = q1Var2.f31164tb;
                        if (z25) {
                            b10 = q1Var2.f31123qb;
                        }
                        boolean z26 = (b10 & 4) != 0;
                        boolean z27 = (b10 & 8) != 0;
                        if (z25) {
                            int i28 = q1Var2.f31138rb;
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
                            c10 = 6;
                            c12 = 4;
                            z22 = false;
                            i13 = i23;
                            c11 = 7;
                            q1Var2.T0(canvas2, z24, z28, f43, f31, f42, f34, 1.0f - q1Var2.f31151sb, z11);
                            boolean z29 = z24;
                            boolean z30 = z28;
                            boolean z31 = z26;
                            boolean z32 = z27;
                            q1Var2.T0(canvas, z31, z32, f43, f31, f42, f34, q1Var2.f31151sb, z11);
                            f27 = f43;
                            f22 = f34;
                            z23 = z31;
                            f23 = f31;
                            if (!q1Var2.Q5.P3()) {
                                if (!z29 && !z30) {
                                    q1Var2.B1(canvas, f23, f42, f22, 1.0f - q1Var2.f31151sb, z11);
                                }
                                if (!z23 && !z32) {
                                    q1Var2.B1(canvas, f23, f42, f22, q1Var2.f31151sb, z11);
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
                            c10 = 6;
                            c11 = 7;
                            c12 = 4;
                            z22 = false;
                            if (!q1Var2.Q5.P3() && !z33 && !z34) {
                                q1Var2.B1(canvas, f31, i13, f34, 1.0f, z11);
                            }
                            q1Var2 = this;
                            q1Var2.T0(canvas, z33, z34, f44, f31, i13, f34, 1.0f, z11);
                            f27 = f44;
                            f22 = f34;
                            z23 = z33;
                            f23 = f31;
                        }
                        if (q1Var2.Q5.P3()) {
                            canvas2 = canvas;
                            q1Var2.B1(canvas2, f23, i13, f22, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        x1Var5 = x1Var4;
                        x1Var5.f31922b2 = x1Var4.b();
                        if (z23 && z10 && q1Var2.getParent() != null) {
                            ((View) q1Var2.getParent()).invalidate();
                        }
                        f20 = f21;
                    }
                    canvas2.save();
                    float f45 = f30 + f20;
                    q1Var2.f31218x9 = f45;
                    float L10 = (f35 - org.telegram.messenger.g0.L(7.3f)) - staticLayout.getHeight();
                    q1Var2.f31231y9 = L10;
                    canvas2.translate(f45, L10);
                    xh.f.f(canvas2, staticLayout);
                    canvas2.restore();
                    org.telegram.ui.ActionBar.j6.T2.setAlpha(255);
                    i15 = z22;
                    z12 = z21;
                } else {
                    rectF = rectF2;
                    i10 = 2;
                    c10 = 6;
                    c11 = 7;
                    c12 = 4;
                    if (q1Var2.Q5.r4()) {
                        i12 = -org.telegram.messenger.g0.L(48.0f);
                        if (q1Var2.f30936c7) {
                            i12 -= org.telegram.messenger.g0.L(4.0f);
                        }
                    } else {
                        if (q1Var2.f31216x7) {
                            i11 = q1Var2.u2() ? q1Var2.getCommentButtonHeight() : org.telegram.messenger.g0.L(43.0f);
                        } else {
                            i11 = 0;
                        }
                        i12 = -i11;
                    }
                    i13 = i12;
                    float f46 = -staticLayout.getLineLeft(0);
                    if (q1Var2.Q5.O5()) {
                        q0Var.getClass();
                    }
                    if ((org.telegram.messenger.t3.T(q1Var2.f31044ka) && !q1Var2.f31044ka.megagroup) || (q1Var2.Q5.f23817k.flags & 1024) != 0 || q1Var2.f30991ga != null || x1Var5.G || q1Var2.f31118q6 || x1Var5.C) {
                        float lineWidth2 = (f12 - staticLayout.getLineWidth(0)) + f46;
                        q0Var.getClass();
                        int b11 = x1Var5.b();
                        int i29 = x1Var5.f31922b2;
                        if (i29 >= 0 && i29 != b11 && !q1Var2.f31164tb) {
                            q1Var2.C0(i29, b11, z10);
                        }
                        boolean z35 = q1Var2.f31164tb;
                        if (z35) {
                            b11 = q1Var2.f31123qb;
                        }
                        boolean z36 = (b11 & 4) != 0;
                        boolean z37 = (b11 & 8) != 0;
                        if (z35) {
                            int i30 = q1Var2.f31138rb;
                            boolean z38 = (i30 & 4) != 0;
                            boolean z39 = (i30 & 8) != 0;
                            float f47 = i13;
                            float f48 = f23;
                            boolean z40 = z38;
                            x1Var = x1Var5;
                            q1Var2.T0(canvas2, z40, z39, f27, f48, f47, f29, 1.0f - q1Var2.f31151sb, z11);
                            boolean z41 = z39;
                            boolean z42 = z36;
                            boolean z43 = z37;
                            q1Var2.T0(canvas, z42, z43, f27, f48, f47, f29, q1Var2.f31151sb, z11);
                            f27 = f27;
                            f14 = f29;
                            z13 = z42;
                            f23 = f48;
                            if (!q1Var2.Q5.P3()) {
                                if (!z40 && !z41) {
                                    q1Var2.B1(canvas, f23, f47, f14, 1.0f - q1Var2.f31151sb, z11);
                                }
                                if (!z13 && !z43) {
                                    q1Var2.B1(canvas, f23, f47, f14, q1Var2.f31151sb, z11);
                                }
                            }
                        } else {
                            x1Var = x1Var5;
                            boolean z44 = z36;
                            boolean z45 = z37;
                            if (!q1Var2.Q5.P3() && !z44 && !z45) {
                                q1Var2.B1(canvas, f23, i13, f29, 1.0f, z11);
                            }
                            q1Var2 = this;
                            float f49 = f23;
                            q1Var2.T0(canvas, z44, z45, f27, f49, i13, f29, 1.0f, z11);
                            f27 = f27;
                            f14 = f29;
                            z13 = z44;
                            f23 = f49;
                        }
                        if (q1Var2.Q5.P3()) {
                            canvas2 = canvas;
                            q1Var2.B1(canvas2, f23, i13, f14, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        x1Var5 = x1Var;
                        x1Var5.f31922b2 = x1Var.b();
                        if (z13 && z10 && q1Var2.getParent() != null) {
                            ((View) q1Var2.getParent()).invalidate();
                        }
                        f46 = lineWidth2;
                    }
                    canvas2.save();
                    if (x1Var5.U0 && x1Var5.L1 != 1.0f) {
                        if (x1Var5.V0 != null) {
                            canvas2.translate(f30 + f46, ((f27 - org.telegram.messenger.g0.L((q1Var2.G || q1Var2.F) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i13);
                            int alpha5 = org.telegram.ui.ActionBar.j6.T2.getAlpha();
                            org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (alpha5 * x1Var5.L1));
                            x1Var5.V0.draw(canvas2);
                            org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha5);
                            xh.f.f(canvas2, x1Var5.W0);
                            i14 = 0;
                        } else {
                            int alpha6 = org.telegram.ui.ActionBar.j6.T2.getAlpha();
                            canvas2.save();
                            float f50 = i13;
                            canvas2.translate(x1Var5.f31948h1 + f46, ((f27 - org.telegram.messenger.g0.L((q1Var2.G || q1Var2.F) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f50);
                            float f51 = alpha6;
                            i14 = 0;
                            org.telegram.ui.ActionBar.j6.T2.setAlpha((int) ((1.0f - x1Var5.L1) * f51));
                            xh.f.f(canvas2, x1Var5.W0);
                            canvas2.restore();
                            canvas2.translate(f30 + f46, ((f27 - org.telegram.messenger.g0.L((q1Var2.G || q1Var2.F) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f50);
                            org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (f51 * x1Var5.L1));
                            xh.f.f(canvas2, staticLayout);
                            org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha6);
                        }
                    } else {
                        i14 = 0;
                        float f52 = f30 + f46;
                        q1Var2.f31218x9 = f52;
                        float L11 = ((f27 - org.telegram.messenger.g0.L((q1Var2.G || q1Var2.F) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i13;
                        q1Var2.f31231y9 = L11;
                        canvas2.translate(f52, L11);
                        xh.f.f(canvas2, staticLayout);
                    }
                    canvas2.restore();
                    z12 = i14 == 1 ? 1 : 0;
                    i15 = i14;
                }
                int i31 = i13;
                if (q1Var2.Q5.P3()) {
                    int b12 = x1Var5.b();
                    int i32 = x1Var5.f31922b2;
                    if (i32 >= 0 && i32 != b12 && !q1Var2.f31164tb) {
                        q1Var2.C0(i32, b12, z10);
                    }
                    if (q1Var2.f31164tb) {
                        b12 = q1Var2.f31123qb;
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
                    if (q1Var2.Ic != 0.0f) {
                        canvas2.save();
                        f16 = 0.0f;
                        canvas2.translate(0.0f, q1Var2.Ic);
                        i16 = 1;
                    } else {
                        f16 = 0.0f;
                        i16 = i15;
                    }
                    if (q1Var2.f31164tb) {
                        int i35 = q1Var2.f31138rb;
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
                            q1Var2.x1(canvas2, i33, z15, z14, z19, f17, z12, i31, f27, q1Var2.f31151sb, true, z11);
                        } else {
                            x1Var3 = x1Var2;
                            f15 = f16;
                            boolean z48 = z15;
                            boolean z49 = i33;
                            str = "paintChatTimeBackground";
                            float f53 = i31;
                            q1Var2.x1(canvas, z16, z47, z18, z20, f17, z12, f53, f27, 1.0f - q1Var2.f31151sb, false, z11);
                            z14 = z17;
                            q1Var2.x1(canvas, z49, z48, z14, z19, f17, z12, f53, f27, q1Var2.f31151sb, false, z11);
                        }
                        q1Var = this;
                        canvas2 = canvas;
                    } else {
                        x1Var3 = x1Var2;
                        f15 = f16;
                        str = "paintChatTimeBackground";
                        canvas2 = canvas;
                        x1(canvas2, i33, i34, z14, z46, f23, z12, i31, f27, 1.0f, false, z11);
                        q1Var = this;
                    }
                    if (i16 != 0) {
                        canvas2.restore();
                    }
                    x1Var3.f31922b2 = x1Var3.b();
                    if (z10 && z14 && q1Var.getParent() != null) {
                        ((View) q1Var.getParent()).invalidate();
                    }
                } else {
                    q1Var = q1Var2;
                    str = "paintChatTimeBackground";
                    f15 = 0.0f;
                }
                canvas2.restore();
                if (q1Var.X9 != null) {
                    if (q1Var.V9 == f15 || q1Var.W9 == f15) {
                        q1Var.B();
                    }
                    Path path3 = q1Var.f30926ba;
                    path3.rewind();
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    rectF3.set(u2Var.L0, u2Var.M0, u2Var.y(), u2Var.A());
                    int[] iArr2 = u2Var.X0;
                    float f54 = iArr2[i15];
                    float[] fArr = q1Var.f30939ca;
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
                    rectF3.set(q1Var.V9 - org.telegram.messenger.g0.L(12.0f), q1Var.W9 - org.telegram.messenger.g0.L(8.0f), q1Var.V9 + org.telegram.ui.ActionBar.j6.L3.getIntrinsicWidth() + org.telegram.messenger.g0.L(14.0f) + q1Var.X9.getWidth() + org.telegram.messenger.g0.L(12.0f), q1Var.W9 + q1Var.X9.getHeight() + org.telegram.messenger.g0.L(8.0f));
                    path3.addRoundRect(rectF3, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), direction);
                    canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    if (q1Var.Q9 == null) {
                        if (q1Var.f30912aa == null) {
                            q1Var.f30912aa = new xh.f();
                        }
                        q1Var.f30912aa.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                        q1Var.f30912aa.setBounds((int) u2Var.L0, (int) u2Var.M0, (int) u2Var.y(), (int) u2Var.A());
                        q1Var.f30912aa.draw(canvas2);
                    }
                    q1Var.invalidate();
                    canvas2.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, q1Var.getWidth(), q1Var.getHeight(), (int) (q1Var.U9 * 255.0f), 31);
                    int alpha7 = org.telegram.ui.ActionBar.j6.f28937i2.getAlpha();
                    org.telegram.ui.ActionBar.j6.f28937i2.setAlpha((int) (alpha7 * 0.7f));
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.ui.ActionBar.j6.f28937i2);
                    org.telegram.ui.ActionBar.j6.f28937i2.setAlpha(alpha7);
                    canvas.translate(q1Var.V9 + org.telegram.messenger.g0.L(4.0f), q1Var.W9);
                    Drawable drawable = org.telegram.ui.ActionBar.j6.L3;
                    int i36 = i15;
                    drawable.setBounds(i36, i36, drawable.getIntrinsicWidth(), org.telegram.ui.ActionBar.j6.L3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.j6.L3.draw(canvas);
                    canvas.translate(org.telegram.ui.ActionBar.j6.L3.getIntrinsicWidth() + org.telegram.messenger.g0.L(6.0f), f15);
                    xh.f.f(canvas, q1Var.X9);
                    canvas.restore();
                    if (q1Var.f31114q2 != null && u2Var.R0 && q1Var.A2 == 0) {
                        int i37 = gz.Y0;
                        int i38 = i10;
                        if (i37 > i38) {
                            L = org.telegram.messenger.g0.L(i37 - i38);
                            z12 = gz.Y0 < 10 ? i36 : true;
                        } else {
                            L = org.telegram.messenger.g0.L(i37);
                        }
                        int L12 = (int) (u2Var.L0 + org.telegram.messenger.g0.L(9.0f));
                        int L13 = (int) (u2Var.M0 + org.telegram.messenger.g0.L(6.0f));
                        RectF rectF4 = rectF;
                        rectF4.set(L12 - org.telegram.messenger.g0.L(4.0f), L13 - org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(z12 ? 2.0f : f15) + org.telegram.messenger.g0.L(4.0f) + q1Var.Z1 + L12, org.telegram.messenger.g0.L(1.5f) + q1Var.f31114q2.getHeight() + L13);
                        canvas.drawRoundRect(rectF4, L, L, q1Var.a2(str));
                        canvas.save();
                        if (!z12) {
                            i38 = i36;
                        }
                        canvas.translate(L12 + i38, L13);
                        xh.f.f(canvas, q1Var.f31114q2);
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final boolean z2() {
        if (!this.f31035k1 && !this.f31228y6 && !this.f31215x6) {
            return false;
        }
        return true;
    }

    public final void z3(int i7, int i10) {
        org.telegram.ui.ActionBar.r4 r4Var;
        this.L0 = i7;
        this.M0 = i10;
        this.f30940cb = i10;
        if ((this.Q5 != null && h2() && this.Q5.P5()) || ((r4Var = this.L6) != null && r4Var.f29554a != null)) {
            invalidate();
        }
    }

    public q1(Context context, int i7, boolean z10, h6.m mVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = true;
        this.f31208x = new b9.g0(1);
        er erVar = er.h;
        this.E = new te.a(0, this, erVar, 380L, false);
        this.O = new ch.q0(this);
        this.P = new zg.a(this);
        this.Q = new zg.c(this);
        this.D0 = new Rect();
        this.H0 = -1;
        this.I0 = -1;
        this.T0 = new int[4];
        this.J2 = new Drawable[2];
        this.K2 = new org.telegram.ui.ActionBar.v5[2];
        this.L2 = new int[2];
        this.M2 = new RectF();
        this.N2 = new int[]{16842910, 16842919};
        this.j3 = -1;
        this.f31037k3 = -1;
        this.f30920b4 = new RectF();
        this.f30933c4 = new RectF();
        this.f31038k4 = 1.0f;
        this.f31050l4 = 1.0f;
        this.f31158t4 = -1;
        this.f31171u4 = new n2.o0(this);
        this.f31200w4 = new ArrayList();
        this.f31213x4 = new ArrayList();
        this.B4 = new Path();
        this.P4 = new ArrayList();
        this.Q4 = new ArrayList();
        this.S4 = -1;
        this.T4 = -1;
        this.V4 = true;
        this.I5 = new ArrayList();
        this.f30935c6 = -1;
        this.D6 = true;
        this.I6 = true;
        this.f30923b7 = 100;
        this.f31229y7 = new Rect();
        this.S7 = new AtomicReference();
        this.f30925b9 = new RectF();
        this.f31121q9 = new StaticLayout[2];
        this.f31205w9 = new float[2];
        this.F9 = true;
        this.J9 = new Path();
        this.K9 = new float[8];
        this.U9 = 1.0f;
        this.f30926ba = new Path();
        this.f30939ca = new float[8];
        this.Ma = new RectF();
        this.Na = new RectF();
        this.f30992gb = Build.VERSION.SDK_INT == 28;
        this.f31005hb = 1.0f;
        this.f31018ib = new x1(this);
        this.mb = new org.telegram.ui.Components.u5(this, 200L, er.f34421g);
        this.f31109pb = new h1(this, 0);
        this.f31207wb = new h1(this, 1);
        this.f31220xb = new SparseArray();
        this.Lb = -1;
        this.Nb = new m.b3();
        this.Tb = new ArrayList();
        this.Ub = new Stack();
        this.Vb = new Path();
        this.Yb = new d1(this, 10);
        this.Zb = new d1(this, 2);
        this.f30993gc = false;
        this.f31096oc = new AtomicReference();
        this.f31110pc = -1L;
        this.Bc = false;
        this.Cc = new d1(this, 0);
        this.Lc = true;
        this.Sc = new Path();
        this.Tc = new RectF();
        this.Vc = -1;
        this.f30942cd = new RectF();
        this.f30954dd = new RectF();
        this.f30994gd = 1.0f;
        this.f31059ld = new g1(Float.class, "animationOffsetX", 0);
        this.f31084nd = new Path();
        this.f30908a6 = i7;
        this.Qb = e6Var;
        this.Rb = z10;
        this.Sb = mVar;
        if (mVar == null) {
            this.Sb = new h6.m(context);
        }
        setClipChildren(false);
        setClipToPadding(false);
        ?? drawable = new Drawable();
        drawable.f36340a = new Paint(1);
        drawable.f36341b = null;
        drawable.h = -1.0f;
        drawable.f36346i = -1.0f;
        drawable.f36347j = -1.0f;
        drawable.f36348k = -1.0f;
        drawable.f36350m = this;
        this.Ta = drawable;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.A7 = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(21.0f));
        this.B7 = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.T7 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.J0(org.telegram.messenger.g0.L(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.F7 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.J0(org.telegram.messenger.g0.L(26.1f));
        this.Z5 = org.telegram.messenger.z5.q(i7).k();
        this.X0 = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        fi.u2 u2Var = new fi.u2(this, this, 2);
        this.U0 = u2Var;
        u2Var.A1 = true;
        u2Var.m0 = true;
        u2Var.f22276h1 = this;
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
        this.D4 = i1Var;
        i1Var.h = this;
        ?? obj = new Object();
        obj.f39725a = 0;
        obj.f39726b = 0;
        obj.f39728e = false;
        obj.f39729f = false;
        obj.f39741s = 1.0f;
        obj.f39742t = 1.0f;
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(125L, 600L, erVar);
        obj.v = u5Var;
        obj.f39744w = 1.0f;
        org.telegram.ui.Components.u5 u5Var2 = new org.telegram.ui.Components.u5(150L, er.f34420f);
        obj.B = u5Var2;
        obj.J = false;
        if (tm0.N == null) {
            tm0.N = new Paint(1);
            tm0.O = new Paint(1);
            Paint paint = tm0.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            tm0.O.setStyle(style);
        }
        this.E4 = obj;
        obj.f39733k = this;
        obj.f39736n = this;
        u5Var2.f39901a = this;
        u5Var.f39901a = this;
        this.F4 = new org.telegram.ui.ActionBar.u0(this, 1);
        ?? drawable2 = new Drawable();
        drawable2.f36023a = 0L;
        drawable2.f36024b = false;
        drawable2.f36025c = new Paint(1);
        drawable2.d = 0.47f;
        drawable2.f36026e = 0.0f;
        drawable2.f36027f = 0.32f;
        drawable2.f36028g = 1;
        drawable2.h = 1;
        drawable2.f36029i = 1;
        drawable2.f36033m = 255;
        drawable2.f36034n = e6Var;
        drawable2.f36030j = this;
        this.f30945d3 = drawable2;
        setImportantForAccessibility(1);
    }

    public void setBackgroundTopY(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.r4 r4Var = this.L6;
        int i12 = this.L0;
        int i13 = this.M0;
        if (i13 == 0) {
            i12 = getParentWidth();
            i13 = org.telegram.messenger.g0.f23609q.y;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                i11 = view.getMeasuredWidth();
                i10 = view.getMeasuredHeight();
                float f10 = this.N0;
                r4Var.p((int) (i7 + f10), i11, i10, (int) f10, this.f30953db, this.eb, this.F, (this.G && this.f31018ib.A0 == 1.0f) ? false : true);
                r4Var.f29572u = i2();
            }
        }
        i10 = i13;
        i11 = i12;
        float f102 = this.N0;
        r4Var.p((int) (i7 + f102), i11, i10, (int) f102, this.f30953db, this.eb, this.F, (this.G && this.f31018ib.A0 == 1.0f) ? false : true);
        r4Var.f29572u = i2();
    }

    @Override
    public void invalidate(int i7, int i10, int i11, int i12) {
        l1 l1Var;
        if (this.Q5 == null) {
            return;
        }
        Runnable runnable = this.Dc;
        if (runnable != null) {
            runnable.run();
            return;
        }
        Runnable runnable2 = this.Ec;
        if (runnable2 != null) {
            runnable2.run();
        }
        super.invalidate(i7, i10, i11, i12);
        if (this.f30922b6 && getParent() != null) {
            ((View) getParent()).invalidate(((int) getX()) + i7, ((int) getY()) + i10, ((int) getX()) + i11, ((int) getY()) + i12);
        }
        if (!this.Wb || (l1Var = this.Sa) == null) {
            return;
        }
        l1Var.p();
    }

    @Override
    public final void E(float f10, int i7) {
    }

    @Override
    public final void O(int i7, Drawable drawable) {
    }
}
