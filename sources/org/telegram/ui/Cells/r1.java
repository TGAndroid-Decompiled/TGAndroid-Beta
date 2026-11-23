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
import di.ec;
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
import org.telegram.messenger.bz;
import org.telegram.messenger.cj;
import org.telegram.messenger.dj;
import org.telegram.messenger.ev;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gb;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.jc;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.pc;
import org.telegram.messenger.ri;
import org.telegram.messenger.vo;
import org.telegram.messenger.vt;
import org.telegram.messenger.xi;
import org.telegram.messenger.zi;
import org.telegram.messenger.zt;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.z51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fr0;
import org.telegram.ui.pl;
import org.telegram.ui.wg0;
public class r1 extends z implements wm0, jc, org.telegram.messenger.y5, q9, fs, te.b, q4, w60 {
    public static final float[] f31402wd = new float[8];
    public static TextPaint f31403xd;
    public static TextPaint f31404yd;
    public int A0;
    public long A1;
    public int A2;
    public StaticLayout A3;
    public CharacterStyle A4;
    public TLRPC.Message A5;
    public float A6;
    public final ImageReceiver A7;
    public org.telegram.ui.Components.c6 A8;
    public int A9;
    public org.telegram.ui.Components.t5 Aa;
    public float Ab;
    public wg0 Ac;
    public boolean B0;
    public boolean B1;
    public int B2;
    public long B3;
    public final Path B4;
    public boolean B5;
    public long B6;
    public final org.telegram.ui.Components.a9 B7;
    public e80 B8;
    public int B9;
    public org.telegram.ui.Components.t5 Ba;
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
    public n80 C8;
    public int C9;
    public org.telegram.ui.Components.t5 Ca;
    public float Cb;
    public final e1 Cc;
    public final Rect D0;
    public int D1;
    public int D2;
    public wy0 D3;
    public final j1 D4;
    public int D5;
    public boolean D6;
    public boolean D7;
    public ArrayList D8;
    public int D9;
    public org.telegram.ui.Components.t5 Da;
    public float Db;
    public Runnable Dc;
    public final te.a E;
    public int E0;
    public float E1;
    public boolean E2;
    public wy0 E3;
    public final dn0 E4;
    public boolean E5;
    public boolean E6;
    public boolean E7;
    public boolean E8;
    public CharSequence E9;
    public org.telegram.ui.Components.t5 Ea;
    public long Eb;
    public Runnable Ec;
    public boolean F;
    public int F0;
    public boolean F1;
    public boolean F2;
    public wy0 F3;
    public final org.telegram.ui.ActionBar.t0 F4;
    public boolean F5;
    public boolean F6;
    public final ImageReceiver F7;
    public int F8;
    public boolean F9;
    public lc Fa;
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
    public lc Ga;
    public float Gb;
    public int Gc;
    public boolean H;
    public int H0;
    public float H1;
    public lc H2;
    public boolean H3;
    public int H4;
    public boolean H5;
    public boolean H6;
    public Drawable[] H7;
    public int H8;
    public Paint H9;
    public lc Ha;
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
    public c1 J4;
    public g1 J5;
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
    public final org.telegram.ui.ActionBar.y5[] K2;
    public int K3;
    public d1 K4;
    public int K5;
    public boolean K6;
    public Drawable K7;
    public boolean K8;
    public final float[] K9;
    public y Ka;
    public float Kb;
    public Drawable Kc;
    public aj L;
    public int L0;
    public long L1;
    public final int[] L2;
    public int L3;
    public StaticLayout L4;
    public boolean L5;
    public org.telegram.ui.ActionBar.u4 L6;
    public int L7;
    public int L8;
    public xh.f L9;
    public Path La;
    public int Lb;
    public boolean Lc;
    public xi M;
    public int M0;
    public int M1;
    public final RectF M2;
    public int M3;
    public double M4;
    public boolean M5;
    public org.telegram.ui.ActionBar.u4 M6;
    public boolean M7;
    public boolean M8;
    public float M9;
    public final RectF Ma;
    public boolean Mb;
    public cx0 Mc;
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
    public z51 Ob;
    public n1 Oc;
    public final zg.a P;
    public boolean P0;
    public i61 P1;
    public SpannableStringBuilder P2;
    public int P3;
    public final ArrayList P4;
    public boolean P5;
    public int P6;
    public CheckBoxBase P7;
    public float[] P8;
    public float P9;
    public float Pa;
    public k1 Pb;
    public StaticLayout Pc;
    public final zg.c Q;
    public final RadialProgress2 Q0;
    public int Q1;
    public boolean Q2;
    public int Q3;
    public final ArrayList Q4;
    public fj Q5;
    public int Q6;
    public StaticLayout Q7;
    public float[] Q8;
    public xh.e Q9;
    public float Qa;
    public org.telegram.ui.ActionBar.i6 Qb;
    public String Qc;
    public boolean R;
    public final RadialProgress2 R0;
    public boolean R1;
    public boolean R2;
    public int R3;
    public float R4;
    public fj R5;
    public int R6;
    public StaticLayout R7;
    public float R8;
    public Integer R9;
    public int Ra;
    public final boolean Rb;
    public e80 Rc;
    public long S;
    public boolean S0;
    public boolean S1;
    public long S2;
    public int S3;
    public int S4;
    public aj S5;
    public boolean S6;
    public final AtomicReference S7;
    public float S8;
    public Path S9;
    public m1 Sa;
    public final h6.m Sb;
    public final Path Sc;
    public wy0 T;
    public final int[] T0;
    public boolean T1;
    public boolean T2;
    public int T3;
    public int T4;
    public boolean T5;
    public k41 T6;
    public final ImageReceiver T7;
    public float T8;
    public float[] T9;
    public final u90 Ta;
    public final ArrayList Tb;
    public final RectF Tc;
    public e80 U;
    public final fi.s2 U0;
    public boolean U1;
    public int U2;
    public int U3;
    public float U4;
    public boolean U5;
    public k41 U6;
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
    public dj Wc;
    public final org.telegram.ui.Components.a9 X0;
    public int X1;
    public boolean X2;
    public int X3;
    public boolean X4;
    public m4 X5;
    public boolean X6;
    public int X7;
    public boolean X8;
    public StaticLayout X9;
    public int Xa;
    public jb.m Xb;
    public boolean Xc;
    public u1 Y0;
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
    public final e1 Yb;
    public boolean Yc;
    public hi.m Z0;
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
    public final e1 Zb;
    public long Zc;
    public long f31405a0;
    public Paint f31406a1;
    public int f31407a2;
    public int f31408a3;
    public boolean f31409a4;
    public boolean f31410a5;
    public final int f31411a6;
    public int f31412a7;
    public int f31413a8;
    public StaticLayout f31414a9;
    public xh.f f31415aa;
    public boolean f31416ab;
    public long f31417ac;
    public long f31418ad;
    public wy0 f31419b0;
    public nh0 f31420b1;
    public int f31421b2;
    public y f31422b3;
    public final RectF f31423b4;
    public boolean f31424b5;
    public boolean f31425b6;
    public int f31426b7;
    public int f31427b8;
    public final RectF f31428b9;
    public final Path f31429ba;
    public float f31430bb;
    public float f31431bc;
    public long bd;
    public e80 f31432c0;
    public Paint f31433c1;
    public int f31434c2;
    public boolean f31435c3;
    public final RectF f31436c4;
    public boolean f31437c5;
    public int f31438c6;
    public boolean f31439c7;
    public boolean f31440c8;
    public lc f31441c9;
    public final float[] f31442ca;
    public int f31443cb;
    public float f31444cc;
    public final RectF f31445cd;
    public CornerPathEffect f31446d0;
    public Paint f31447d1;
    public float d2;
    public final tk0 f31448d3;
    public TLObject f31449d4;
    public int f31450d5;
    public byte[] f31451d6;
    public int f31452d7;
    public boolean f31453d8;
    public RectF f31454d9;
    public StaticLayout f31455da;
    public int f31456db;
    public org.telegram.ui.ActionBar.u4[] dc;
    public final RectF f31457dd;
    public int f31458e0;
    public Paint f31459e1;
    public float f31460e2;
    public StaticLayout f31461e3;
    public TLRPC.PhotoSize f31462e4;
    public float f31463e5;
    public byte[] f31464e6;
    public int f31465e7;
    public boolean f31466e8;
    public wg.a f31467e9;
    public int f31468ea;
    public int eb;
    public boolean f31469ec;
    public Paint f31470ed;
    public boolean f31471f;
    public q01 f31472f0;
    public pv0 f31473f1;
    public int f31474f2;
    public int f31475f3;
    public TLRPC.PhotoSize f31476f4;
    public boolean f31477f5;
    public boolean f31478f6;
    public CheckBoxBase[] f31479f7;
    public boolean f31480f8;
    public int f31481f9;
    public String fa;
    public boolean f31482fb;
    public boolean fc;
    public Paint f31483fd;
    public int f31484g0;
    public boolean f31485g1;
    public StaticLayout f31486g2;
    public int f31487g3;
    public BitmapDrawable f31488g4;
    public boolean f31489g5;
    public boolean f31490g6;
    public x30 f31491g7;
    public boolean f31492g8;
    public float f31493g9;
    public StaticLayout f31494ga;
    public final boolean f31495gb;
    public boolean f31496gc;
    public float f31497gd;
    public boolean h;
    public bx0 f31498h0;
    public float f31499h1;
    public StaticLayout f31500h2;
    public boolean f31501h3;
    public String f31502h4;
    public float f31503h5;
    public boolean f31504h6;
    public n80 h7;
    public org.telegram.ui.Components.c6 f31505h8;
    public float f31506h9;
    public int f31507ha;
    public float f31508hb;
    public n1 f31509hc;
    public int f31510hd;
    public int f31511i0;
    public float f31512i1;
    public float f31513i2;
    public w1 f31514i3;
    public String f31515i4;
    public int f31516i5;
    public boolean f31517i6;
    public float i7;
    public float f31518i8;
    public float f31519i9;
    public String f31520ia;
    public final y1 f31521ib;
    public n1 f31522ic;
    public dj f31523id;
    public long f31524j0;
    public boolean f31525j1;
    public float f31526j2;
    public int j3;
    public boolean f31527j4;
    public TLRPC.Poll f31528j5;
    public boolean f31529j6;
    public long f31530j7;
    public float f31531j8;
    public boolean f31532j9;
    public TLRPC.User f31533ja;
    public boolean f31534jb;
    public boolean f31535jc;
    public float f31536jd;
    public int f31537k0;
    public boolean f31538k1;
    public float f31539k2;
    public int f31540k3;
    public float f31541k4;
    public ArrayList f31542k5;
    public boolean f31543k6;
    public ImageReceiver[] f31544k7;
    public TLRPC.PhotoSize f31545k8;
    public boolean f31546k9;
    public TLRPC.Chat f31547ka;
    public boolean kb;
    public boolean f31548kc;
    public float f31549kd;
    public lc f31550l0;
    public CheckBoxBase l1;
    public float f31551l2;
    public int f31552l3;
    public float f31553l4;
    public int f31554l5;
    public boolean f31555l6;
    public org.telegram.ui.Components.a9[] f31556l7;
    public int f31557l8;
    public boolean f31558l9;
    public TLRPC.FileLocation f31559la;
    public boolean f31560lb;
    public int f31561lc;
    public final h1 f31562ld;
    public org.telegram.ui.Components.m5 m0;
    public CheckBoxBase f31563m1;
    public boolean f31564m2;
    public dj f31565m3;
    public long f31566m4;
    public m01 f31567m5;
    public boolean f31568m6;
    public boolean[] f31569m7;
    public Drawable f31570m8;
    public float f31571m9;
    public String ma;
    public final org.telegram.ui.Components.c6 mb;
    public n1 f31572mc;
    public RectF f31573md;
    public int f31574n;
    public boolean f31575n0;
    public boolean n1;
    public lc f31576n2;
    public dj f31577n3;
    public long f31578n4;
    public org.telegram.ui.Components.c6 f31579n5;
    public boolean f31580n6;
    public StaticLayout f31581n7;
    public ok0 f31582n8;
    public float f31583n9;
    public Object f31584na;
    public org.telegram.messenger.n6 f31585nb;
    public Drawable f31586nc;
    public final Path f31587nd;
    public int f31588o0;
    public boolean f31589o1;
    public StaticLayout f31590o2;
    public dh0 f31591o3;
    public boolean o4;
    public int f31592o5;
    public boolean f31593o6;
    public org.telegram.ui.Components.f6 f31594o7;
    public ok0 f31595o8;
    public StaticLayout f31596o9;
    public long f31597oa;
    public boolean f31598ob;
    public final AtomicReference f31599oc;
    public ColorFilter[] f31600od;
    public int f31601p0;
    public float f31602p1;
    public StaticLayout f31603p2;
    public CharSequence f31604p3;
    public boolean f31605p4;
    public int f31606p5;
    public boolean f31607p6;
    public boolean f31608p7;
    public ok0 f31609p8;
    public int f31610p9;
    public String f31611pa;
    public final i1 f31612pb;
    public long f31613pc;
    public int[] f31614pd;
    public int f31615q0;
    public long f31616q1;
    public StaticLayout f31617q2;
    public dj f31618q3;
    public org.telegram.ui.Components.x5 f31619q4;
    public boolean f31620q5;
    public boolean f31621q6;
    public int f31622q7;
    public ok0 f31623q8;
    public final StaticLayout[] f31624q9;
    public org.telegram.ui.Components.m5 f31625qa;
    public int f31626qb;
    public int f31627qc;
    public Paint f31628qd;
    public o3 f31629r;
    public int f31630r0;
    public int f31631r1;
    public StaticLayout f31632r2;
    public int f31633r3;
    public k80 f31634r4;
    public boolean f31635r5;
    public boolean f31636r6;
    public int f31637r7;
    public ok0 f31638r8;
    public int f31639r9;
    public org.telegram.ui.Components.m5 f31640ra;
    public int f31641rb;
    public int f31642rc;
    public float f31643rd;
    public boolean f31644s;
    public t1 f31645s0;
    public org.telegram.ui.f5 f31646s1;
    public float f31647s2;
    public float f31648s3;
    public cj f31649s4;
    public float s5;
    public boolean f31650s6;
    public boolean f31651s7;
    public boolean f31652s8;
    public boolean s9;
    public TLRPC.User f31653sa;
    public float f31654sb;
    public int f31655sc;
    public float f31656sd;
    public v1 f31657t0;
    public kq f31658t1;
    public float f31659t2;
    public float f31660t3;
    public int f31661t4;
    public int f31662t5;
    public long t6;
    public int f31663t7;
    public ec f31664t8;
    public float f31665t9;
    public TLRPC.User f31666ta;
    public boolean f31667tb;
    public int f31668tc;
    public int f31669td;
    public int f31670u0;
    public ci.b1 f31671u1;
    public boolean f31672u2;
    public int f31673u3;
    public final n2.p0 f31674u4;
    public float f31675u5;
    public boolean f31676u6;
    public int f31677u7;
    public int f31678u8;
    public int f31679u9;
    public TLRPC.Chat f31680ua;
    public ValueAnimator f31681ub;
    public float f31682uc;
    public int f31683ud;
    public int f31684v0;
    public boolean f31685v1;
    public RectF f31686v2;
    public int f31687v3;
    public int f31688v4;
    public float f31689v5;
    public boolean f31690v6;
    public int f31691v7;
    public y f31692v8;
    public int f31693v9;
    public String f31694va;
    public int f31695vb;
    public float f31696vc;
    public TL_stars.StarGift f31697vd;
    public m0 f31698w;
    public int f31699w0;
    public boolean f31700w1;
    public s1 f31701w2;
    public int f31702w3;
    public final ArrayList f31703w4;
    public int f31704w5;
    public boolean f31705w6;
    public int f31706w7;
    public wy0 f31707w8;
    public final float[] f31708w9;
    public String f31709wa;
    public final i1 f31710wb;
    public org.telegram.ui.Components.f8 wc;
    public final l2.c f31711x;
    public int f31712x0;
    public boolean f31713x1;
    public x1 f31714x2;
    public StaticLayout f31715x3;
    public final ArrayList f31716x4;
    public int f31717x5;
    public boolean f31718x6;
    public boolean f31719x7;
    public wy0 f31720x8;
    public float f31721x9;
    public boolean f31722xa;
    public final SparseArray f31723xb;
    public xi.e xc;
    public boolean f31724y;
    public int f31725y0;
    public boolean f31726y1;
    public int f31727y2;
    public org.telegram.ui.Components.m6 f31728y3;
    public n80 f31729y4;
    public boolean f31730y5;
    public boolean f31731y6;
    public final Rect f31732y7;
    public int f31733y8;
    public float f31734y9;
    public boolean ya;
    public boolean f31735yb;
    public boolean f31736yc;
    public int f31737z0;
    public boolean f31738z1;
    public CharSequence f31739z2;
    public org.telegram.ui.Components.m6 f31740z3;
    public ArrayList f31741z4;
    public String f31742z5;
    public int f31743z6;
    public boolean f31744z7;
    public int f31745z8;
    public StaticLayout f31746z9;
    public boolean f31747za;
    public boolean f31748zb;
    public boolean f31749zc;

    public r1(Context context, int i7) {
        this(context, i7, false, null, null);
    }

    public static boolean F2(n1 n1Var, float f10, float f11) {
        RectF rectF = n1Var.d;
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
        return yu0.c(spannableStringBuilder, textPaint, i17, Layout.Alignment.ALIGN_NORMAL, org.telegram.messenger.g0.L(1.0f), TextUtils.TruncateAt.END, i17, i12, true);
    }

    public static int K1(xi xiVar) {
        int i7 = 0;
        if (xiVar != null) {
            if ((xiVar.f28005l & 2) == 0) {
                i7 = org.telegram.messenger.g0.L(4.0f);
            }
            if ((xiVar.f28005l & 1) == 0) {
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

    public static String M3(fj fjVar, fj fjVar2, boolean z10, int i7) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        boolean z11 = fjVar.f24121w1;
        int i10 = fjVar.K1;
        int i11 = fjVar.V;
        if (!z11 && !fjVar.r4() && !fj.b4(fjVar.f24073k) && !fj.d5(fjVar.f24073k)) {
            if (!fjVar.f24102r1 || fjVar.f24073k.date != 2147483646) {
                if (i11 != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    long j3 = i11;
                    sb2.append(gd.T(j3));
                    sb2.append(", ");
                    sb2.append(gd.E0().p0().format(j3 * 1000));
                    return sb2.toString();
                } else if (fjVar.f24072j2) {
                    return gd.T(fjVar2.f24073k.date) + ", " + gd.E0().p0().format(fjVar2.f24073k.date * 1000);
                } else if (z10) {
                    if (((org.telegram.messenger.h0) mp.u1(i10).A7.Z.f17372b).f24439c) {
                        if (i7 == 0 && fjVar.Y2()) {
                            i7 = ConnectionsManager.getInstance(i10).getCurrentTime();
                        }
                        return gd.L(i7);
                    }
                    return gd.N0(2131751198, null) + " " + gd.E0().p0().format(fjVar2.f24073k.date * 1000);
                } else if (fjVar.f24087n2 && (messageFwdHeader = (message = fjVar.f24073k).fwd_from) != null && ((messageFwdHeader.date != 0 || messageFwdHeader.saved_date != 0) && !(fj.n1(message) instanceof TLRPC.TL_messageMediaWidget))) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = fjVar.f24073k.fwd_from;
                    int i12 = messageFwdHeader2.saved_date;
                    if (i12 == 0) {
                        i12 = messageFwdHeader2.date;
                    }
                    return gd.O(i12);
                } else {
                    return gd.E0().p0().format(fjVar2.f24073k.date * 1000);
                }
            }
            return "";
        }
        return "";
    }

    public static SpannableStringBuilder N3(CharSequence charSequence) {
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

    public static boolean P2(String str) {
        if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && !"telegram_bot".equals(str) && !"telegram_botinvite".equals(str) && !"telegram_user".equals(str) && !"telegram_channel".equals(str) && !"telegram_channel_direct".equals(str) && !"telegram_megagroup".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_aicomposetone".equals(str)) {
            return false;
        }
        return true;
    }

    public static android.graphics.PointF Q1(int r3, int r4, int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.Q1(int, int, int, int):android.graphics.PointF");
    }

    public static boolean W2() {
        return pc.e(2);
    }

    public static int[] X1(Spannable spannable, CharacterStyle characterStyle) {
        int i7;
        int i10;
        boolean z10;
        ez0 ez0Var;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof p41) && (ez0Var = ((p41) characterStyle).f38384a) != null && (messageEntity = ez0Var.d) != null) {
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

    public static StaticLayout X2(CharSequence charSequence, TextPaint textPaint, int i7) {
        SpannableStringBuilder N3 = N3(charSequence);
        if (N3 != null && i7 > 0) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            CharSequence ellipsize = TextUtils.ellipsize(N3, textPaint, i7, truncateAt);
            int L = org.telegram.messenger.g0.L(2.0f) + Math.max(1, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())));
            return yu0.c(ellipsize, textPaint, L, Layout.Alignment.ALIGN_NORMAL, 0.0f, truncateAt, L, 1, true);
        }
        return null;
    }

    public static void Y0(Canvas canvas, StaticLayout staticLayout, float f10, float f11) {
        canvas.save();
        canvas.translate(f10 - staticLayout.getLineLeft(0), ((org.telegram.messenger.g0.L(16.0f) - staticLayout.getHeight()) / 2.0f) + f11);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    private long getAuthorBotVerificationId() {
        fj fjVar;
        TLRPC.User user = this.f31533ja;
        if (user != null) {
            return org.telegram.messenger.n5.c(user);
        }
        if (this.f31547ka != null && (fjVar = this.Q5) != null && fj.B0(fjVar.f24073k) != 1271266957 && this.f31547ka.signature_profiles) {
            long o4 = org.telegram.messenger.n5.o(this.Q5.f24073k.from_id);
            int i7 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
            int i10 = this.f31411a6;
            if (i7 >= 0) {
                TLRPC.User c22 = mp.u1(i10).c2(Long.valueOf(o4));
                if (c22 != null) {
                    return org.telegram.messenger.n5.c(c22);
                }
            } else {
                TLRPC.Chat O0 = mp.u1(i10).O0(Long.valueOf(-o4));
                if (O0 != null) {
                    return org.telegram.messenger.n5.c(O0);
                }
            }
        }
        return 0L;
    }

    private String getAuthorName() {
        TLRPC.User user = this.f31533ja;
        if (user != null) {
            return n10.q(user);
        }
        if (this.f31547ka != null) {
            fj fjVar = this.Q5;
            if (fjVar != null && fj.B0(fjVar.f24073k) != 1271266957 && this.f31547ka.signature_profiles) {
                long o4 = org.telegram.messenger.n5.o(this.Q5.f24073k.from_id);
                int i7 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
                int i10 = this.f31411a6;
                if (i7 >= 0) {
                    TLRPC.User c22 = mp.u1(i10).c2(Long.valueOf(o4));
                    if (c22 != null) {
                        return n10.q(c22);
                    }
                } else {
                    TLRPC.Chat O0 = mp.u1(i10).O0(Long.valueOf(-o4));
                    if (O0 != null) {
                        return O0.title;
                    }
                }
            }
            return this.f31547ka.title;
        }
        fj fjVar2 = this.Q5;
        if (fjVar2 != null && fjVar2.r4()) {
            return this.Q5.S0;
        }
        return "DELETED";
    }

    private Object getAuthorStatus() {
        fj fjVar;
        TLRPC.User user = this.f31533ja;
        if (user != null) {
            Long i7 = n10.i(user);
            if (i7 != null) {
                TLRPC.EmojiStatus emojiStatus = this.f31533ja.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f31611pa = ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug;
                }
                return i7;
            } else if (this.f31533ja.premium) {
                return org.telegram.messenger.t0.f27013b.getDrawable(2131232312).mutate();
            } else {
                return null;
            }
        } else if (this.f31547ka != null && (fjVar = this.Q5) != null && fj.B0(fjVar.f24073k) != 1271266957 && this.f31547ka.signature_profiles) {
            long o4 = org.telegram.messenger.n5.o(this.Q5.f24073k.from_id);
            if (o4 >= 0) {
                TLRPC.User c22 = mp.u1(this.f31411a6).c2(Long.valueOf(o4));
                if (c22 != null) {
                    TLRPC.EmojiStatus emojiStatus2 = c22.emoji_status;
                    if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                        this.f31611pa = ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).slug;
                    }
                }
                return n10.i(c22);
            }
            TLRPC.Chat O0 = mp.u1(this.f31411a6).O0(Long.valueOf(-o4));
            if (O0 != null) {
                TLRPC.EmojiStatus emojiStatus3 = O0.emoji_status;
                if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f31611pa = ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug;
                }
                return Long.valueOf(org.telegram.messenger.n5.f(emojiStatus3));
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
        if (H3()) {
            f10 = 41.3f;
        } else {
            f10 = 43.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    private int getCompactHeaderColor() {
        return i0.a.k(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Sa, this.Qb), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29771ua, this.Qb));
    }

    private int getCompactInShift() {
        if (u2()) {
            return (org.telegram.messenger.g0.L(16.0f) - org.telegram.messenger.g0.L(20.0f)) - getExtraTextX();
        }
        return 0;
    }

    private int getCompactNameTimeWidth() {
        int i7;
        if (y2() && (i7 = this.A9) > 0) {
            return org.telegram.messenger.g0.L(6.0f) + i7;
        }
        return 0;
    }

    private float getCompactNameTimeX() {
        float compactLeft = getCompactLeft();
        if (this.f31558l9) {
            compactLeft += getNameAvatarOffset();
        }
        if (this.f31597oa != 0) {
            compactLeft += org.telegram.messenger.g0.L(20.0f);
        }
        if (this.V8 != null) {
            compactLeft += this.W8;
        }
        if (this.f31584na != null && this.R6 <= 0) {
            compactLeft += org.telegram.messenger.g0.L(20.0f);
        }
        if (this.f31414a9 != null) {
            int i7 = 0;
            float lineWidth = this.f31414a9.getLineWidth(0) + org.telegram.messenger.g0.L(8.0f);
            if (this.X8) {
                i7 = org.telegram.messenger.g0.L(6.0f);
            }
            compactLeft += lineWidth + i7;
        }
        return compactLeft + org.telegram.messenger.g0.L(6.0f);
    }

    private float getCompactNameTimeY() {
        float f10;
        if (this.J) {
            f10 = 9.0f;
        } else {
            f10 = 10.0f;
        }
        float L = org.telegram.messenger.g0.L(f10) + this.f31561lc + this.f31521ib.f32489k0;
        StaticLayout staticLayout = this.V8;
        if (staticLayout != null && this.f31746z9 != null && staticLayout.getLineCount() > 0 && this.f31746z9.getLineCount() > 0) {
            L += this.V8.getLineBaseline(0) - this.f31746z9.getLineBaseline(0);
        }
        aj ajVar = this.L;
        if (ajVar != null) {
            zi ziVar = ajVar.f23016m;
            if (ziVar.f28399j) {
                return (ziVar.f28396f - getTranslationY()) + L;
            }
        }
        return L;
    }

    private int getCompactSideButtonColumn() {
        fj fjVar;
        if (this.f31735yb && this.F8 != 0 && (fjVar = this.Q5) != null && fjVar.T4()) {
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
        m1 m1Var = this.Sa;
        if (m1Var != null) {
            return m1Var.h0();
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

    private kq getForwardVerifiedSpan() {
        if (this.f31658t1 == null) {
            lq lqVar = new lq(getContext().getResources().getDrawable(2131232796).mutate(), getContext().getResources().getDrawable(2131232797).mutate());
            lqVar.f37204x = true;
            kq kqVar = new kq(0, lqVar);
            this.f31658t1 = kqVar;
            kqVar.d = false;
        }
        lq lqVar2 = (lq) this.f31658t1.f36849c;
        Drawable drawable = lqVar2.f37195a;
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29865z9, this.Qb);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        lqVar2.f37196b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A9, this.Qb), mode));
        this.f31658t1.c((int) (org.telegram.ui.ActionBar.n6.X2.getTextSize() * 0.95f));
        return this.f31658t1;
    }

    private int getGroupPhotosWidth() {
        int parentWidth = getParentWidth();
        fj fjVar = this.Q5;
        if (fjVar != null && fjVar.f24110t1) {
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
        if (this.f31558l9 && !w2()) {
            if (this.f31414a9 == null) {
                return org.telegram.messenger.g0.L(31.0f);
            }
            return org.telegram.messenger.g0.L(37.66f);
        }
        return (int) (org.telegram.ui.ActionBar.n6.W2.getTextSize() + org.telegram.messenger.g0.L(5.0f));
    }

    private float getNameHeightAnimated() {
        float f10;
        float f11;
        y1 y1Var = this.f31521ib;
        float f12 = 0.0f;
        if (y1Var.Q2) {
            boolean z10 = this.f31558l9;
            f10 = org.telegram.messenger.g0.V1(!z10, z10, y1Var.L1);
        } else if (this.f31558l9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float textSize = org.telegram.ui.ActionBar.n6.W2.getTextSize() + org.telegram.messenger.g0.L(5.0f);
        if (this.f31414a9 == null) {
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
        aj ajVar = this.L;
        if (ajVar != null && !ajVar.d.isEmpty() && (messageReplies = ((fj) this.L.d.get(0)).f24073k.replies) != null) {
            return messageReplies.recent_repliers;
        }
        TLRPC.MessageReplies messageReplies2 = this.Q5.f24073k.replies;
        if (messageReplies2 != null) {
            return messageReplies2.recent_repliers;
        }
        return null;
    }

    private int getSelectionOverlayColor() {
        int i7;
        org.telegram.ui.ActionBar.i6 i6Var = this.Qb;
        if (i6Var == null) {
            return 0;
        }
        fj fjVar = this.Q5;
        if (fjVar != null && fjVar.N3()) {
            i7 = org.telegram.ui.ActionBar.n6.Pc;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29732sa;
        }
        return i6Var.i(i7);
    }

    private float getUseTranscribeButtonProgress() {
        y1 y1Var = this.f31521ib;
        if (y1Var.f32506o1) {
            if (this.I4) {
                return y1Var.L1;
            }
            return 1.0f - y1Var.L1;
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
            imageReceiver.x0(null);
        }
    }

    public static o1 x0(int i7, String str, int i10, float f10) {
        o1 o1Var = new o1();
        o1Var.f31233a = i7;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, org.telegram.ui.ActionBar.n6.M2, i10, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.n6.M2, org.telegram.messenger.g0.L(2.0f) + i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        o1Var.d = staticLayout;
        o1Var.f31234b = f10;
        if (staticLayout.getLineCount() > 0) {
            o1Var.f31235c = ((float) (o1Var.f31234b - Math.ceil(o1Var.d.getLineWidth(0)))) / 2.0f;
            o1Var.f31235c -= (int) o1Var.d.getLineLeft(0);
        }
        return o1Var;
    }

    public final void A(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.i6 i6Var = this.Qb;
        if (i6Var != null) {
            i6Var.c(f10, f11 + this.W + this.f31484g0 + this.f31511i0, i7, i10);
        } else {
            org.telegram.ui.ActionBar.n6.r(f10, f11 + this.W + this.f31484g0 + this.f31511i0, i7, i10);
        }
    }

    public final void A0(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        long[] x10 = org.telegram.messenger.ec.D().x(org.telegram.messenger.w7.B(document));
        if (x10 != null) {
            z0(x10[0], x10[1]);
        } else {
            z0(this.Q5.H0, document.size);
        }
    }

    public final void A1(android.graphics.Canvas r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.A1(android.graphics.Canvas, int):void");
    }

    public boolean A2() {
        if (((isPressed() && this.D6) || ((!this.D6 && this.f31705w6) || this.f31718x6)) && !L3() && !m2()) {
            fj fjVar = this.Q5;
            if (fjVar == null || !fjVar.f24110t1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A3(int i7, int i10) {
        org.telegram.ui.ActionBar.u4 u4Var;
        this.L0 = i7;
        this.M0 = i10;
        this.f31443cb = i10;
        if ((this.Q5 != null && h2() && this.Q5.P5()) || ((u4Var = this.L6) != null && u4Var.f30140a != null)) {
            invalidate();
        }
    }

    public final void B(int i7, int i10, int i11) {
        int k12;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        ev evVar;
        boolean z12;
        if (this.Q5.r4()) {
            this.f31426b7 = org.telegram.messenger.g0.L(31.0f) + i11;
        } else if (e4()) {
            this.f31426b7 = org.telegram.messenger.g0.L(31.0f) + i11;
        } else {
            ch.q0 q0Var = this.O;
            if (!q0Var.f5487p) {
                k12 = q0Var.f5489r;
            } else {
                k12 = this.Q5.k1();
            }
            boolean z13 = false;
            if (!q0Var.f5487p) {
                if (i7 - k12 >= i10 && !this.Q5.f24122w2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (this.U1) {
                    this.f31684v0 = org.telegram.messenger.g0.L(14.0f) + this.f31684v0;
                }
            } else if ((this.f31685v1 || ((!this.R1 || this.Q5.r4()) && !g2() && !this.S1 && !this.T1 && !this.U1)) && i7 - k12 >= i10 && !this.Q5.f24122w2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.Q5.G4()) {
                z10 = true;
            }
            if (q0Var.f5487p && (evVar = this.Q5.f24130y2) != null) {
                ArrayList arrayList = evVar.h;
                ArrayList arrayList2 = evVar.f23877g;
                if (!arrayList2.isEmpty() && !evVar.d && !evVar.I()) {
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            if (((vt) obj).f27692b >= arrayList2.size() - 1) {
                                z12 = true;
                                break;
                            }
                        }
                    }
                    z12 = ((zt) i5.c.h(1, arrayList2)).v();
                } else {
                    z12 = true;
                    break;
                }
                if (z12) {
                    z10 = true;
                }
            }
            fj fjVar = this.Q5;
            if ((fjVar.F2 && q0Var.f5487p) || ((fjVar.J2 && q0Var.f5487p) || fjVar.v3())) {
                i12 = 18;
                z10 = true;
            } else {
                i12 = 14;
            }
            if (q0Var.f5487p && R2() && !TextUtils.isEmpty(this.Q5.f24131z) && !this.f31700w1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!y2()) {
                z13 = z10;
            }
            if (z13) {
                if (!z11) {
                    this.f31684v0 = org.telegram.messenger.g0.L(i12) + this.f31684v0;
                    this.f31439c7 = true;
                }
                int L = org.telegram.messenger.g0.L(31.0f) + Math.max(i11, k12);
                this.f31426b7 = L;
                if (this.Q5.P3()) {
                    i13 = org.telegram.messenger.g0.L(17.0f) + this.A9;
                } else {
                    i13 = this.A9;
                }
                this.f31426b7 = org.telegram.messenger.f3.b(31.0f, i13, L);
            } else {
                int extraTextX = (i11 - getExtraTextX()) - k12;
                if (extraTextX >= 0 && extraTextX <= i10) {
                    this.f31426b7 = org.telegram.messenger.g0.L(31.0f) + ((i11 + i10) - extraTextX);
                } else {
                    this.f31426b7 = org.telegram.messenger.g0.L(31.0f) + Math.max(i11, k12 + i10);
                }
            }
            if (u2()) {
                this.f31426b7 = org.telegram.messenger.g0.L(31.0f) + i7;
            }
        }
    }

    public final void B0(int i7) {
        int i10;
        int w02;
        ok0 ok0Var;
        ok0 ok0Var2;
        int i11;
        int i12;
        int i13;
        if (this.Q5.G4()) {
            if (this.Q5.P3()) {
                i13 = org.telegram.ui.ActionBar.n6.Ob;
            } else {
                i13 = org.telegram.ui.ActionBar.n6.Bd;
            }
            w02 = org.telegram.ui.ActionBar.n6.w0(i13, this.Qb);
        } else if (i7 == 0 && this.E5) {
            if (this.Q5.P3()) {
                i11 = org.telegram.ui.ActionBar.n6.Ib;
            } else {
                i11 = org.telegram.ui.ActionBar.n6.f29658od;
            }
            w02 = org.telegram.ui.ActionBar.n6.w0(i11, this.Qb);
        } else if (i7 == 0 && (ok0Var2 = this.f31595o8) != null) {
            w02 = ok0Var2.i();
        } else if (i7 == 0 && (ok0Var = this.f31623q8) != null) {
            w02 = ok0Var.i();
        } else {
            if (this.Q5.P3()) {
                i10 = org.telegram.ui.ActionBar.n6.Ob;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.Bd;
            }
            w02 = org.telegram.ui.ActionBar.n6.w0(i10, this.Qb);
        }
        Drawable[] drawableArr = this.J2;
        Drawable drawable = drawableArr[i7];
        if (drawable == null) {
            org.telegram.ui.ActionBar.y5 y5Var = new org.telegram.ui.ActionBar.y5(this, i7);
            org.telegram.ui.ActionBar.y5[] y5VarArr = this.K2;
            y5VarArr[i7] = y5Var;
            int[][] iArr = {StateSet.WILD_CARD};
            if (this.Q5.P3()) {
                i12 = org.telegram.ui.ActionBar.n6.Ob;
            } else {
                i12 = org.telegram.ui.ActionBar.n6.Bd;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{436207615 & org.telegram.ui.ActionBar.n6.w0(i12, this.Qb)}), null, y5VarArr[i7]);
            drawableArr[i7] = rippleDrawable;
            rippleDrawable.setCallback(this);
        } else {
            org.telegram.ui.ActionBar.n6.H1(drawable, w02 & 436207615, true);
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
        float s5;
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
        int alpha = org.telegram.ui.ActionBar.n6.T2.getAlpha();
        float b22 = b2(f11);
        StaticLayout staticLayout = this.f31494ga;
        y1 y1Var = this.f31521ib;
        float f22 = 0.0f;
        if (staticLayout == null && !y1Var.G) {
            f15 = 10.0f;
            d = 1.0d;
        } else {
            boolean z17 = y1Var.f32481i1;
            if (z17) {
                f14 = this.C9;
            } else {
                f14 = f12;
            }
            float f23 = f14 + 0.0f;
            f15 = 10.0f;
            boolean z18 = y1Var.G;
            d = 1.0d;
            if (z18 && y1Var.I == null && staticLayout != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z18 && y1Var.I != null && staticLayout == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z18 && y1Var.I != null && staticLayout != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((!this.f31735yb || !y1Var.f32498m1) && z17 && !z12) {
                if (z13) {
                    f23 = y1Var.J;
                } else {
                    float f24 = y1Var.J;
                    float f25 = y1Var.L1;
                    f23 = (f23 * f25) + ((1.0f - f25) * f24);
                }
            }
            aj ajVar = this.L;
            if (ajVar != null) {
                zi ziVar = ajVar.f23016m;
                if (ziVar.f28399j) {
                    f23 += ziVar.f28397g;
                }
            }
            if (y1Var.f32540x0) {
                f23 += this.f31549kd;
            }
            if (H3()) {
                if (this.Q5.P5()) {
                    Z1 = Z1("drawableMsgStickerReplies");
                } else {
                    Z1 = org.telegram.ui.ActionBar.n6.f29412b4;
                }
            } else if (!this.Q5.P3()) {
                if (z10) {
                    Z1 = org.telegram.ui.ActionBar.n6.R3;
                } else {
                    Z1 = org.telegram.ui.ActionBar.n6.Q3;
                }
            } else {
                Z1 = Z1("drawableMsgOutReplies");
            }
            float s9 = z.s(Z1, f23, b22, org.telegram.ui.ActionBar.n6.T2.getTextSize());
            if (z12) {
                f16 = y1Var.L1 * f21;
            } else if (z13) {
                f16 = (1.0f - y1Var.L1) * f21;
            } else {
                f16 = f21;
            }
            Z1.setAlpha((int) (f16 * 255.0f));
            if (z11) {
                canvas.save();
                canvas.scale(f20, f20, org.telegram.messenger.f3.a(org.telegram.messenger.g0.L(3.0f) + s9, this.f31507ha, 2.0f, f23), Z1.getBounds().centerY());
            }
            Z1.draw(canvas);
            Z1.setAlpha(255);
            if (y1Var.G) {
                if (z14) {
                    canvas.save();
                    f17 = s9;
                    org.telegram.ui.ActionBar.n6.T2.setAlpha((int) ((1.0d - y1Var.L1) * alpha));
                    canvas.translate(f23 + f17 + org.telegram.messenger.g0.L(3.0f), b22);
                    y1Var.I.draw(canvas);
                    canvas.restore();
                } else {
                    f17 = s9;
                }
                org.telegram.ui.ActionBar.n6.T2.setAlpha((int) (alpha * f16));
            } else {
                f17 = s9;
            }
            canvas.save();
            canvas.translate(f23 + f17 + org.telegram.messenger.g0.L(3.0f), b22);
            StaticLayout staticLayout2 = this.f31494ga;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                StaticLayout staticLayout3 = y1Var.I;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
            }
            canvas.restore();
            if (this.f31494ga != null) {
                f22 = f17 + this.f31507ha + org.telegram.messenger.g0.L(10.0f) + 0.0f;
            }
            if (z11) {
                canvas.restore();
            }
            if (y1Var.G) {
                org.telegram.ui.ActionBar.n6.T2.setAlpha(alpha);
            }
            y1Var.K = f23;
        }
        if (this.f31455da != null) {
            boolean z19 = y1Var.f32481i1;
            if (z19) {
                f19 = this.C9;
            } else {
                f19 = f12;
            }
            float f26 = f19 + f22;
            if ((!this.f31735yb || !y1Var.f32498m1) && z19) {
                float f27 = y1Var.L;
                float f28 = y1Var.L1;
                f26 = (f26 * f28) + ((1.0f - f28) * f27);
            }
            aj ajVar2 = this.L;
            if (ajVar2 != null) {
                zi ziVar2 = ajVar2.f23016m;
                if (ziVar2.f28399j) {
                    f26 += ziVar2.f28397g;
                }
            }
            if (y1Var.f32540x0) {
                f26 += this.f31549kd;
            }
            if (H3()) {
                if (this.Q5.P5()) {
                    Z13 = Z1("drawableMsgStickerViews");
                } else {
                    Z13 = org.telegram.ui.ActionBar.n6.f29391a4;
                }
            } else if (!this.Q5.P3()) {
                if (z10) {
                    Z13 = org.telegram.ui.ActionBar.n6.N3;
                } else {
                    Z13 = org.telegram.ui.ActionBar.n6.M3;
                }
            } else {
                if (z10) {
                    str2 = "drawableMsgOutViewsSelected";
                } else {
                    str2 = "drawableMsgOutViews";
                }
                Z13 = Z1(str2);
            }
            float s10 = z.s(Z13, f26, org.telegram.messenger.g0.L(1.5f) + b22, org.telegram.ui.ActionBar.n6.T2.getTextSize() - org.telegram.messenger.g0.L(2.0f));
            if (z11) {
                canvas.save();
                canvas.scale(f20, f20, (((org.telegram.messenger.g0.L(3.0f) + Z13.getIntrinsicWidth()) + this.f31468ea) / 2.0f) + f26, Z13.getBounds().centerY());
            }
            Z13.setAlpha((int) (f21 * 255.0f));
            Z13.draw(canvas);
            Z13.setAlpha(255);
            if (y1Var.f32463e2 != null) {
                canvas.save();
                org.telegram.ui.ActionBar.n6.T2.setAlpha((int) ((d - y1Var.L1) * alpha));
                canvas.translate(f26 + s10 + org.telegram.messenger.g0.L(3.0f), b22);
                xh.f.f(canvas, y1Var.f32463e2);
                canvas.restore();
                org.telegram.ui.ActionBar.n6.T2.setAlpha((int) (alpha * y1Var.L1));
            }
            canvas.save();
            canvas.translate(f26 + s10 + org.telegram.messenger.g0.L(3.0f), b22);
            xh.f.f(canvas, this.f31455da);
            canvas.restore();
            if (z11) {
                canvas.restore();
            }
            f22 = this.f31468ea + s10 + org.telegram.messenger.g0.L(f15) + f22;
            if (y1Var.f32463e2 != null) {
                org.telegram.ui.ActionBar.n6.T2.setAlpha(alpha);
            }
            y1Var.M = f26;
        }
        boolean z20 = this.f31621q6;
        if (!z20 && !y1Var.C) {
            return;
        }
        boolean z21 = y1Var.f32481i1;
        if (z21) {
            f18 = this.C9;
        } else {
            f18 = f12;
        }
        float f29 = f18 + f22;
        boolean z22 = y1Var.C;
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
        if (!this.f31735yb && z21 && !z15) {
            if (z16) {
                f29 = y1Var.E;
            } else {
                float f30 = y1Var.E;
                float f31 = y1Var.L1;
                f29 = (f29 * f31) + ((1.0f - f31) * f30);
            }
        }
        aj ajVar3 = this.L;
        if (ajVar3 != null) {
            zi ziVar3 = ajVar3.f23016m;
            if (ziVar3.f28399j) {
                f29 += ziVar3.f28397g;
            }
        }
        if (y1Var.f32540x0) {
            f29 += this.f31549kd;
        }
        if (H3()) {
            if (this.Q5.P5()) {
                Z12 = Z1("drawableMsgStickerPinned");
            } else {
                Z12 = org.telegram.ui.ActionBar.n6.Z3;
            }
        } else if (!this.Q5.P3()) {
            if (z10) {
                Z12 = org.telegram.ui.ActionBar.n6.V3;
            } else {
                Z12 = org.telegram.ui.ActionBar.n6.U3;
            }
        } else {
            if (z10) {
                str = "drawableMsgOutPinnedSelected";
            } else {
                str = "drawableMsgOutPinned";
            }
            Z12 = Z1(str);
        }
        if (y1Var.C) {
            if (this.f31621q6) {
                Z12.setAlpha((int) (f21 * 255.0f * y1Var.L1));
                s5 = z.s(Z12, f29, b22, org.telegram.ui.ActionBar.n6.T2.getTextSize() + org.telegram.messenger.g0.L(1.0f));
            } else {
                Z12.setAlpha((int) ((1.0f - y1Var.L1) * f21 * 255.0f));
                s5 = z.s(Z12, f29, b22, org.telegram.ui.ActionBar.n6.T2.getTextSize() + org.telegram.messenger.g0.L(1.0f));
            }
        } else {
            Z12.setAlpha((int) (f21 * 255.0f));
            s5 = z.s(Z12, f29, b22, org.telegram.ui.ActionBar.n6.T2.getTextSize() + org.telegram.messenger.g0.L(1.0f));
        }
        if (z11) {
            canvas.save();
            canvas.scale(f20, f20, (s5 / 2.0f) + f29, Z12.getBounds().centerY());
        }
        Z12.draw(canvas);
        Z12.setAlpha(255);
        if (z11) {
            canvas.restore();
        }
        y1Var.D = f29;
    }

    public final boolean B2() {
        if (!this.f31538k1 && !this.f31731y6 && !this.f31718x6) {
            return false;
        }
        return true;
    }

    public final void B3(float f10, float f11, boolean z10) {
        float f12;
        boolean z11;
        if (this.h != z10) {
            this.h = z10;
            R();
            if (z10) {
                invalidate();
            }
        }
        fi.s2 s2Var = this.U0;
        float f13 = f10 - s2Var.M0;
        float measuredHeight = f11 - (getMeasuredHeight() - s2Var.B());
        float f14 = s2Var.O0;
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
        this.f31644s = z11;
        s2Var.B1 = z11;
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
        Q3(true, z11, false);
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
        if (this.f31521ib.f32479i && !z15) {
            return;
        }
        this.f31654sb = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f31681ub = ofFloat;
        if (z15) {
            ofFloat.setDuration(220L);
        } else {
            ofFloat.setDuration(150L);
        }
        this.f31681ub.setInterpolator(kr.f36858f);
        this.f31641rb = i7;
        this.f31626qb = i10;
        this.f31681ub.addUpdateListener(new ch.v(3, this, z10));
        this.f31681ub.addListener(new bi.j7(22, this, z10));
        this.f31667tb = true;
        this.f31681ub.start();
    }

    public final void C1(Canvas canvas, float f10, Runnable runnable) {
        org.telegram.ui.ActionBar.u4 u4Var;
        float f11;
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        Canvas canvas2 = canvas;
        fj fjVar = this.Q5;
        if (fjVar != null && fjVar.S4()) {
            RadialProgress2 radialProgress2 = this.Q0;
            RectF rectF = radialProgress2.f33152a;
            Paint paint = radialProgress2.f33157g;
            c90 c90Var = radialProgress2.f33158i;
            RectF rectF2 = radialProgress2.f33152a;
            float cos = (((float) Math.cos((org.telegram.messenger.g0.W1(f10, 190, 45) / 180.0f) * 3.141592653589793d)) * org.telegram.messenger.g0.L(22.6274f)) + rectF.centerX();
            float sin = (((float) Math.sin((org.telegram.messenger.g0.W1(f10, 190, 45) / 180.0f) * 3.141592653589793d)) * org.telegram.messenger.g0.L(22.6274f)) + rectF2.centerY();
            RectF rectF3 = org.telegram.messenger.g0.P;
            rectF3.set(rectF2);
            rectF3.inset(-org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f));
            canvas2.saveLayerAlpha(rectF3, 255, 31);
            if (A2()) {
                u4Var = this.M6;
            } else {
                u4Var = this.L6;
            }
            c90Var.B = u4Var;
            radialProgress2.f33159j.B = u4Var;
            radialProgress2.I = f10;
            runnable.run();
            if (this.f31406a1 == null) {
                Paint paint2 = new Paint(1);
                this.f31406a1 = paint2;
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
                if (this.f31420b1 == null) {
                    nh0 nh0Var = new nh0(2131624022, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), true, null);
                    this.f31420b1 = nh0Var;
                    nh0Var.R(this);
                    this.f31420b1.J(true);
                    this.f31420b1.K(1);
                    this.f31420b1.start();
                }
                this.f31420b1.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (this.f31433c1 == null) {
                    i7 = 1;
                    this.f31433c1 = new Paint(1);
                } else {
                    i7 = 1;
                }
                if (this.f31447d1 == null) {
                    Paint paint3 = new Paint(i7);
                    this.f31447d1 = paint3;
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                if (this.f31459e1 == null) {
                    Paint paint4 = new Paint(i7);
                    this.f31459e1 = paint4;
                    paint4.setStyle(Paint.Style.STROKE);
                }
                int i11 = radialProgress2.f33170u;
                if (i11 >= 0) {
                    i10 = org.telegram.ui.ActionBar.n6.w0(i11, this.Qb);
                } else {
                    i10 = radialProgress2.f33163n;
                }
                this.f31433c1.setColor(i10);
                this.f31459e1.setColor(i10);
                c90Var.a(false);
                this.f31433c1.setShader(c90Var.d.getShader());
                this.f31459e1.setShader(c90Var.d.getShader());
                rectF3.set(this.f31420b1.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                float f14 = f11;
                rectF3.inset(f14, f14);
                canvas2.drawRect(rectF3, this.f31433c1);
                this.f31420b1.q(canvas, this.f31447d1, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.f31459e1.setAlpha((int) (255.0f * f12));
                this.f31459e1.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
                RectF rectF4 = this.f31436c4;
                rectF4.set(rectF2);
                rectF4.inset(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
                dn0 dn0Var = this.E4;
                canvas.drawArc(rectF4, -90.0f, (1.0f - dn0Var.K) * (-360.0f), false, this.f31459e1);
                if (this.f31567m5 == null) {
                    this.f31567m5 = new m01();
                }
                this.f31567m5.a((1.0f - dn0Var.K) * (-360.0f), f12, canvas, this.f31459e1, rectF4);
                canvas2 = canvas;
            } else {
                nh0 nh0Var2 = this.f31420b1;
                if (nh0Var2 != null) {
                    nh0Var2.C(true);
                    this.f31420b1 = null;
                    if (this.f31567m5 != null) {
                        this.f31567m5 = null;
                    }
                }
            }
            canvas2.drawCircle(cos, sin, org.telegram.messenger.g0.L((f10 * 1.5f) + 10.0f) * f10, this.f31406a1);
            canvas2.restore();
            if (this.Z0 == null) {
                hi.m mVar = new hi.m(3);
                this.Z0 = mVar;
                z10 = false;
                mVar.e(-1, 0, 0);
                hi.m mVar2 = this.Z0;
                mVar2.f14857i = 14.0f;
                mVar2.c(10.0f);
                this.Z0.f14851a.setStrokeWidth(org.telegram.messenger.g0.N(1.5f));
                z11 = true;
                this.Z0.d(1, false, false);
                this.Z0.f14858j = -org.telegram.messenger.g0.N(0.33f);
                this.Z0.f14859k = org.telegram.messenger.g0.N(0.33f);
            } else {
                z10 = false;
                z11 = true;
            }
            hi.m mVar3 = this.Z0;
            mVar3.f14857i = f10 * 14.0f;
            mVar3.c(f10 * 10.0f);
            canvas2.saveLayerAlpha(cos - org.telegram.messenger.g0.L(10.0f), sin - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f) + cos, org.telegram.messenger.g0.L(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, org.telegram.messenger.g0.L(10.0f) * f10, paint);
            hi.m mVar4 = this.Z0;
            if (org.telegram.messenger.g0.B(paint.getColor()) <= 0.8f) {
                z11 = z10;
            }
            mVar4.b(z11);
            hi.m mVar5 = this.Z0;
            mVar5.f14862n = cos;
            mVar5.f14863o = sin;
            mVar5.a(canvas2, f10);
            canvas2.restore();
            return;
        }
        runnable.run();
    }

    public final boolean C2() {
        if (this.R5 != null) {
            return this.V5;
        }
        return this.H;
    }

    public final void C3(int i7, int i10, int i11, float f10, float f11, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        ev evVar;
        y1 y1Var;
        cj cjVar;
        fj fjVar;
        this.f31627qc = i7;
        this.f31655sc = i10;
        this.f31668tc = i11;
        this.L0 = i12;
        this.M0 = i13;
        this.f31696vc = f11;
        this.f31682uc = f10;
        this.f31443cb = i13;
        this.f31456db = i14;
        this.eb = i15;
        this.f31642rc = i16;
        if ((!this.I5.isEmpty() || (this.f31698w != null && (fjVar = this.Q5) != null && fjVar.D == 27)) && this.f31430bb != f11) {
            invalidate();
        }
        this.f31430bb = f11;
        if (i11 != this.M0 || f10 != this.N0) {
            this.N0 = f10;
            this.M0 = i11;
        }
        if (this.Q5 != null && h2() && this.Q5.P5()) {
            invalidate();
        }
        fj fjVar2 = this.Q5;
        if (fjVar2 != null && fjVar2.B2 != null) {
            int i19 = i7 - this.f31670u0;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                int size = this.Q5.B2.size();
                y1Var = this.f31521ib;
                if (i20 >= size || ((cj) this.Q5.B2.get(i20)).p(this.Q5.B2, y1Var) > i19) {
                    break;
                }
                i21 = i20;
                i20++;
            }
            int i22 = 0;
            int i23 = -1;
            int i24 = -1;
            while (i21 < this.Q5.B2.size()) {
                float p10 = ((cj) this.Q5.B2.get(i21)).p(this.Q5.B2, y1Var);
                float j3 = cjVar.f23477f + p10 + cjVar.j(y1Var) + cjVar.h;
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
                        if (i25 >= this.Aa.f39797a.size()) {
                            break;
                        }
                        org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) this.Aa.f39797a.get(i25);
                        if (s5Var != null && s5Var.f39496n) {
                            float y10 = (0.0f - getY()) - s5Var.f39497r;
                            float y11 = (this.f31574n - getY()) - s5Var.f39497r;
                            Rect rect = s5Var.f39494e;
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
        fj fjVar3 = this.Q5;
        if (fjVar3 != null && (evVar = fjVar3.f24130y2) != null) {
            ArrayList arrayList = evVar.f23877g;
            int i26 = i7 - this.f31670u0;
            int i27 = -1;
            int i28 = -1;
            for (int i29 = 0; i29 < arrayList.size(); i29++) {
                zt ztVar = (zt) arrayList.get(i29);
                if (ztVar.R || ztVar.S) {
                    float f13 = ztVar.N;
                    float f14 = i26 + i10;
                    if (p2(f13, ztVar.I() + f13, i26, f14)) {
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
                q1 q1Var = (q1) arrayList2.get(i32);
                int i33 = q1Var.f31353b + this.Ua;
                if (p2(i33, i33 + q1Var.f31354c, this.f31627qc, i18 + this.f31655sc)) {
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
            if (Math.abs(this.U8 - Math.max(Math.min(org.telegram.messenger.g0.L(4.0f) + (-this.f31642rc), this.S8 - org.telegram.messenger.g0.L(42.0f)), org.telegram.messenger.g0.L(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        ch.q0 q0Var = this.O;
        int i34 = q0Var.f5476c;
        boolean p22 = p2(i34, i34 + q0Var.f5484m, this.f31627qc, i17 + this.f31655sc);
        if (this.V4 != p22) {
            this.V4 = p22;
            invalidate();
        }
    }

    public final void D() {
        StaticLayout staticLayout;
        if (this.Q5.D == 20 && (staticLayout = this.X9) != null) {
            fi.s2 s2Var = this.U0;
            this.V9 = com.google.android.gms.internal.vision.e2.A(s2Var.N0, staticLayout.getWidth(), 2.0f, this.N6);
            this.W9 = com.google.android.gms.internal.vision.e2.A(s2Var.O0, this.X9.getHeight(), 2.0f, this.P6 + s2Var.M0);
        }
    }

    public final void D0() {
        fj fjVar;
        m1 m1Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.Q5.t2() && !this.Q5.m5()) {
            fj fjVar2 = this.Q5;
            if (!fjVar2.O0) {
                if (this.Sa != null && fjVar2.p4()) {
                    this.Sa.J(this);
                    return;
                } else {
                    K3(this.f31499h1, this.f31512i1);
                    return;
                }
            }
        }
        fj fjVar3 = this.Q5;
        int i7 = fjVar3.D;
        int i10 = 0;
        if (i7 == 20) {
            TLRPC.Message message = fjVar3.f24073k;
            if (message != null && (messageMedia = message.media) != null && !messageMedia.extended_media.isEmpty()) {
                TLRPC.ReplyMarkup replyMarkup = this.Q5.f24073k.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList.get(i10);
                        i10++;
                        Iterator<TL_keyboard.KeyboardInlineButton> it = keyboardInlineButtonRow.buttons.iterator();
                        if (it.hasNext()) {
                            this.Sa.W0(this, it.next());
                            return;
                        }
                    }
                }
            }
        } else if (i7 != 1 && !fjVar3.M2()) {
            fj fjVar4 = this.Q5;
            int i11 = fjVar4.D;
            if (i11 == 12) {
                long j3 = fj.n1(fjVar4.f24073k).user_id;
                if (j3 != 0) {
                    user = mp.u1(this.f31411a6).c2(Long.valueOf(j3));
                } else {
                    user = null;
                }
                this.Sa.A0(this, user, this.f31499h1, this.f31512i1);
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
                this.Sa.C0(this, this.f31499h1, this.f31512i1, false);
            } else if (this.M1 != 4 && !fjVar4.D2(true)) {
                fj fjVar5 = this.Q5;
                int i13 = fjVar5.D;
                if (i13 != 4 && i13 != 17 && i13 != 23 && i13 != 24) {
                    int i14 = this.M1;
                    if (i14 == 1) {
                        if (this.O3 == -1) {
                            this.Sa.C0(this, this.f31499h1, this.f31512i1, false);
                            return;
                        }
                        return;
                    } else if (fjVar5.f24029a1 != null) {
                        m1 m1Var2 = this.Sa;
                        if (m1Var2 != null) {
                            m1Var2.C0(this, this.f31499h1, this.f31512i1, false);
                            return;
                        }
                        return;
                    } else if (i14 == 2) {
                        if (this.O3 == -1 && (webPage = fj.n1(fjVar5.f24073k).webpage) != null) {
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
                            this.Sa.C0(this, this.f31499h1, this.f31512i1, false);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 26 && (m1Var = this.Sa) != null) {
                        if (i13 == 16) {
                            m1Var.x0(this, 0.0f, 0.0f);
                            return;
                        } else {
                            m1Var.J0(this, this.S3, this.T3);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.Sa.C0(this, this.f31499h1, this.f31512i1, false);
            } else if (this.O3 != -1 && (!this.f31738z1 || (!this.H5 && (((fjVar = this.Q5) == null || !fjVar.D2(true)) && (!bz.B0 || !this.C1))))) {
                if (this.f31738z1) {
                    E0(true);
                    return;
                }
                int i15 = this.O3;
                if (i15 == 0 || i15 == 3) {
                    E0(false);
                }
            } else {
                this.Sa.C0(this, this.f31499h1, this.f31512i1, false);
            }
        } else {
            int i16 = this.O3;
            if (i16 == -1) {
                this.Sa.C0(this, this.f31499h1, this.f31512i1, false);
            } else if (i16 == 0) {
                E0(false);
            }
        }
    }

    public final d1 D1() {
        if (this.K4 == null) {
            this.K4 = new d1(this);
        }
        return this.K4;
    }

    public final boolean D2() {
        TLRPC.Chat chat = this.f31680ua;
        if (chat != null) {
            return chat.verified;
        }
        TLRPC.User user = this.f31653sa;
        if (user != null && user.verified) {
            return true;
        }
        return false;
    }

    public final void D3(int r21, org.telegram.messenger.fj r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.D3(int, org.telegram.messenger.fj):void");
    }

    public final int E() {
        if (this.f31700w1) {
            return 4;
        }
        return 8;
    }

    public final void E0(boolean z10) {
        float f10;
        fj fjVar;
        fj fjVar2;
        TLRPC.PhotoSize photoSize;
        String str;
        int i7;
        RadialProgress2 radialProgress2;
        int i10;
        fj fjVar3;
        if (this.Sa != null && this.Q5.p4() && this.Q5.t2() && !this.Q5.m5() && !this.Q5.O0) {
            this.Sa.J(this);
            return;
        }
        fj fjVar4 = this.Q5;
        if (fjVar4 != null && !fjVar4.M2()) {
            this.Q5.P = true;
        }
        int i11 = this.O3;
        RadialProgress2 radialProgress22 = this.R0;
        int i12 = this.f31411a6;
        fi.s2 s2Var = this.U0;
        RadialProgress2 radialProgress23 = this.Q0;
        if (i11 == 0 && (!this.f31738z1 || z10)) {
            int i13 = this.M1;
            if (i13 != 3 && i13 != 5 && (i13 != 7 || (fjVar3 = this.Q5) == null || !fjVar3.T4() || !this.Q5.f24132z0)) {
                if (z10) {
                    radialProgress22.p(false, 0.0f);
                } else {
                    radialProgress23.p(false, 0.0f);
                }
                if (this.f31462e4 != null && (s2Var.M() || this.f31476f4 == null)) {
                    photoSize = this.f31462e4;
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !"s".equals(photoSize.type)) {
                        str = this.f31502h4;
                    } else {
                        str = this.f31515i4;
                    }
                } else {
                    photoSize = this.f31476f4;
                    str = this.f31515i4;
                }
                if (fj.R5(this.Q5.f24073k)) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                fj fjVar5 = this.Q5;
                int i14 = fjVar5.D;
                if (i14 == 1 || i14 == 20) {
                    int i15 = i7;
                    radialProgress2 = radialProgress23;
                    s2Var.f22754r = true;
                    s2Var.s0(fc.f(this.f31462e4, this.f31449d4), this.f31502h4, fc.f(this.f31476f4, this.f31449d4), this.f31515i4, this.f31488g4, this.f31462e4.size, null, this.Q5, i15);
                } else if (i14 == 8) {
                    org.telegram.messenger.w7.G(i12).W(this.N1, this.Q5, 2, 0);
                    if (this.Q5.H0 > 0) {
                        A0(this.N1);
                    }
                    radialProgress2 = radialProgress23;
                } else if (this.f31735yb) {
                    if (fjVar5.l4()) {
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i12);
                        TLRPC.Document F0 = this.Q5.F0();
                        fj fjVar6 = this.Q5;
                        if (fj.R5(fjVar6.f24073k)) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        G.W(F0, fjVar6, 2, i10);
                        radialProgress2 = radialProgress23;
                    } else {
                        fj fjVar7 = this.Q5;
                        fjVar7.f24060h0 = 2.0f;
                        TLRPC.Document F02 = fjVar7.F0();
                        s2Var.f22754r = true;
                        String str2 = str;
                        radialProgress2 = radialProgress23;
                        s2Var.s0(fc.b(F02), null, fc.f(photoSize, F02), str2, null, F02.size, null, this.Q5, 0);
                    }
                    this.f31560lb = true;
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
                            fj fjVar8 = this.Q5;
                            if (fjVar8.H0 > 0) {
                                A0(fjVar8.F0());
                            }
                        } else if (i14 == 0 && i16 != 0) {
                            if (i16 == 2) {
                                s2Var.f22754r = true;
                                s2Var.s0(fc.b(this.N1), null, fc.c(this.f31462e4, this.N1), this.f31515i4, null, this.N1.size, null, this.Q5, i7);
                                fj fjVar9 = this.Q5;
                                fjVar9.f24060h0 = 2.0f;
                                if (fjVar9.H0 > 0) {
                                    A0(fjVar9.F0());
                                }
                            } else if (i16 == 1) {
                                org.telegram.messenger.w7.G(i12).W(this.N1, this.Q5, 2, 0);
                            } else if (i16 == 8) {
                                s2Var.s0(fc.b(this.N1), this.f31502h4, fc.c(this.f31462e4, this.N1), "b1", null, 0L, "jpg", this.Q5, 1);
                            }
                        } else {
                            s2Var.f22754r = true;
                            s2Var.s0(fc.f(this.f31462e4, this.f31449d4), this.f31502h4, fc.f(this.f31476f4, this.f31449d4), this.f31515i4, this.f31488g4, 0L, null, this.Q5, 0);
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
                U3();
                this.O3 = 1;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i11 == 1 && (!this.f31738z1 || z10)) {
            s2Var.f22754r = false;
            int i17 = this.M1;
            if (i17 != 3 && i17 != 5 && (i17 != 7 || (fjVar2 = this.Q5) == null || !fjVar2.T4())) {
                if (this.Q5.N3() && !this.f31738z1 && (this.Q5.o4() || this.Q5.Y2())) {
                    if (radialProgress23.f33158i.f33986q != 6) {
                        this.Sa.R(this);
                        return;
                    }
                    return;
                }
                fj fjVar10 = this.Q5;
                fjVar10.l1 = true;
                int i18 = this.M1;
                if (i18 != 2 && i18 != 4 && i18 != 1 && i18 != 8) {
                    int i19 = fjVar10.D;
                    if (i19 != 0 && i19 != 1 && i19 != 20 && i19 != 8 && i19 != 5) {
                        if (i19 == 9) {
                            org.telegram.messenger.w7.G(i12).f(this.Q5.F0());
                        }
                    } else {
                        org.telegram.messenger.ec D = org.telegram.messenger.ec.D();
                        String str3 = s2Var.R;
                        if (str3 != null) {
                            D.f23797s.c(new gb(D, str3, 2));
                        }
                        s2Var.c();
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
            fj fjVar11 = this.Q5;
            if (fjVar11 != null && fjVar11.D == 23) {
                this.Sa.C0(this, 0.0f, 0.0f, false);
            } else if (this.M1 == 7 && fjVar11 != null && fjVar11.T4()) {
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
                    U3();
                    this.O3 = 1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                if (this.f31735yb) {
                    this.f31560lb = true;
                    invalidate();
                }
            } else {
                int i20 = this.M1;
                if (i20 != 3 && i20 != 5) {
                    if (this.f31735yb) {
                        fj fjVar12 = MediaController.B().f22838v0;
                        if (fjVar12 == null || !fjVar12.h4()) {
                            s2Var.f22762u0 = true;
                            s2Var.Q0(false);
                        }
                    } else {
                        s2Var.f22762u0 = true;
                        s2Var.Q0(false);
                    }
                    this.Q5.f24060h0 = 0.0f;
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
                if (i21 == 3 || i21 == 5 || (i21 == 7 && (fjVar = this.Q5) != null && fjVar.T4())) {
                    if ((this.Q5.N3() && (this.Q5.o4() || this.Q5.Y2())) || this.Q5.n4()) {
                        m1 m1Var = this.Sa;
                        if (m1Var != null && radialProgress23.f33158i.f33986q != 6) {
                            m1Var.R(this);
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
            m1 m1Var2 = this.Sa;
            if (m1Var2 != null) {
                m1Var2.C0(this, f10, f10, false);
            }
        }
    }

    public final u1 E1() {
        if (this.Y0 == null) {
            this.Y0 = new u1(this);
        }
        return this.Y0;
    }

    public final boolean E2(float f10) {
        if (this.L6 != null) {
            int i7 = this.N6;
            if (f10 >= i7 && f10 <= i7 + this.O6) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void E3() {
        int i7;
        int i10;
        int i11;
        int i12;
        if (this.Q5.P3()) {
            TextPaint textPaint = org.telegram.ui.ActionBar.n6.f29648o2;
            int i13 = org.telegram.ui.ActionBar.n6.Wc;
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(i13, this.Qb));
            org.telegram.ui.ActionBar.n6.f29820x2.setColor(org.telegram.ui.ActionBar.n6.w0(i13, this.Qb));
            org.telegram.ui.ActionBar.n6.f29667p2.setColor(org.telegram.ui.ActionBar.n6.w0(i13, this.Qb));
            org.telegram.ui.ActionBar.n6.f29687q2.setColor(org.telegram.ui.ActionBar.n6.w0(i13, this.Qb));
            org.telegram.ui.ActionBar.n6.f29706r2.setColor(org.telegram.ui.ActionBar.n6.w0(i13, this.Qb));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.n6.f29820x2;
            TextPaint textPaint3 = org.telegram.ui.ActionBar.n6.Z2;
            TextPaint textPaint4 = org.telegram.ui.ActionBar.n6.f29390a3;
            TextPaint textPaint5 = org.telegram.ui.ActionBar.n6.f29648o2;
            TextPaint textPaint6 = org.telegram.ui.ActionBar.n6.f29667p2;
            TextPaint textPaint7 = org.telegram.ui.ActionBar.n6.f29687q2;
            TextPaint textPaint8 = org.telegram.ui.ActionBar.n6.f29706r2;
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Yc, this.Qb);
            textPaint8.linkColor = w02;
            textPaint7.linkColor = w02;
            textPaint6.linkColor = w02;
            textPaint5.linkColor = w02;
            textPaint4.linkColor = w02;
            textPaint3.linkColor = w02;
            textPaint2.linkColor = w02;
        } else {
            TextPaint textPaint9 = org.telegram.ui.ActionBar.n6.f29648o2;
            int i14 = org.telegram.ui.ActionBar.n6.Vc;
            textPaint9.setColor(org.telegram.ui.ActionBar.n6.w0(i14, this.Qb));
            org.telegram.ui.ActionBar.n6.f29820x2.setColor(org.telegram.ui.ActionBar.n6.w0(i14, this.Qb));
            org.telegram.ui.ActionBar.n6.f29667p2.setColor(org.telegram.ui.ActionBar.n6.w0(i14, this.Qb));
            org.telegram.ui.ActionBar.n6.f29687q2.setColor(org.telegram.ui.ActionBar.n6.w0(i14, this.Qb));
            org.telegram.ui.ActionBar.n6.f29706r2.setColor(org.telegram.ui.ActionBar.n6.w0(i14, this.Qb));
            TextPaint textPaint10 = org.telegram.ui.ActionBar.n6.f29820x2;
            TextPaint textPaint11 = org.telegram.ui.ActionBar.n6.Z2;
            TextPaint textPaint12 = org.telegram.ui.ActionBar.n6.f29390a3;
            TextPaint textPaint13 = org.telegram.ui.ActionBar.n6.f29648o2;
            TextPaint textPaint14 = org.telegram.ui.ActionBar.n6.f29667p2;
            TextPaint textPaint15 = org.telegram.ui.ActionBar.n6.f29687q2;
            TextPaint textPaint16 = org.telegram.ui.ActionBar.n6.f29706r2;
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Xc, this.Qb);
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
            j1 j1Var = this.D4;
            if (i15 != 3 && i15 != 7) {
                if (i15 == 5) {
                    if (this.Q5.P3()) {
                        int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29639nc, this.Qb);
                        int w05 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29657oc, this.Qb);
                        int i16 = org.telegram.ui.ActionBar.n6.f29697qc;
                        j1Var.g(w04, w05, org.telegram.ui.ActionBar.n6.w0(i16, this.Qb), org.telegram.ui.ActionBar.n6.w0(i16, this.Qb), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29677pc, this.Qb));
                    } else if (this.R1 && this.f31595o8 != null) {
                        int c10 = org.telegram.ui.ActionBar.n6.c(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.le, this.Qb), this.f31595o8.i());
                        int c11 = org.telegram.ui.ActionBar.n6.c(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29622me, this.Qb), this.f31595o8.i());
                        int i17 = org.telegram.ui.ActionBar.n6.f29659oe;
                        j1Var.g(c10, c11, org.telegram.ui.ActionBar.n6.c(org.telegram.ui.ActionBar.n6.w0(i17, this.Qb), this.f31595o8.i()), org.telegram.ui.ActionBar.n6.c(org.telegram.ui.ActionBar.n6.w0(i17, this.Qb), this.f31595o8.i()), org.telegram.ui.ActionBar.n6.c(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.ne, this.Qb), this.f31595o8.i()));
                    } else {
                        int w06 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.le, this.Qb);
                        int w07 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29622me, this.Qb);
                        int i18 = org.telegram.ui.ActionBar.n6.f29659oe;
                        j1Var.g(w06, w07, org.telegram.ui.ActionBar.n6.w0(i18, this.Qb), org.telegram.ui.ActionBar.n6.w0(i18, this.Qb), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.ne, this.Qb));
                    }
                }
            } else {
                boolean P3 = this.Q5.P3();
                dn0 dn0Var = this.E4;
                if (P3) {
                    int w08 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29716rc, this.Qb);
                    int w09 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29753tc, this.Qb);
                    int w010 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29734sc, this.Qb);
                    dn0Var.f34408p = w08;
                    dn0Var.f34409q = w09;
                    dn0Var.f34410r = w010;
                    int w011 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29639nc, this.Qb);
                    int w012 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29657oc, this.Qb);
                    int i19 = org.telegram.ui.ActionBar.n6.f29697qc;
                    j1Var.g(w011, w012, org.telegram.ui.ActionBar.n6.w0(i19, this.Qb), org.telegram.ui.ActionBar.n6.w0(i19, this.Qb), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29677pc, this.Qb));
                } else if (this.R1 && this.f31595o8 != null) {
                    int c12 = org.telegram.ui.ActionBar.n6.c(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29679pe, this.Qb), this.f31595o8.i());
                    int c13 = org.telegram.ui.ActionBar.n6.c(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29718re, this.Qb), this.f31595o8.i());
                    int c14 = org.telegram.ui.ActionBar.n6.c(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29699qe, this.Qb), this.f31595o8.i());
                    dn0Var.f34408p = c12;
                    dn0Var.f34409q = c13;
                    dn0Var.f34410r = c14;
                    int c15 = org.telegram.ui.ActionBar.n6.c(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.le, this.Qb), this.f31595o8.i());
                    int c16 = org.telegram.ui.ActionBar.n6.c(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29622me, this.Qb), this.f31595o8.i());
                    int i20 = org.telegram.ui.ActionBar.n6.f29659oe;
                    j1Var.g(c15, c16, org.telegram.ui.ActionBar.n6.c(org.telegram.ui.ActionBar.n6.w0(i20, this.Qb), this.f31595o8.i()), org.telegram.ui.ActionBar.n6.c(org.telegram.ui.ActionBar.n6.w0(i20, this.Qb), this.f31595o8.i()), org.telegram.ui.ActionBar.n6.c(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.ne, this.Qb), this.f31595o8.i()));
                } else {
                    int w013 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29679pe, this.Qb);
                    int w014 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29718re, this.Qb);
                    int w015 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29699qe, this.Qb);
                    dn0Var.f34408p = w013;
                    dn0Var.f34409q = w014;
                    dn0Var.f34410r = w015;
                    int w016 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.le, this.Qb);
                    int w017 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29622me, this.Qb);
                    int i21 = org.telegram.ui.ActionBar.n6.f29659oe;
                    j1Var.g(w016, w017, org.telegram.ui.ActionBar.n6.w0(i21, this.Qb), org.telegram.ui.ActionBar.n6.w0(i21, this.Qb), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.ne, this.Qb));
                }
            }
        }
        fj fjVar = this.Q5;
        if (fjVar.D == 5) {
            TextPaint textPaint17 = org.telegram.ui.ActionBar.n6.T2;
            if (u2()) {
                if (this.Q5.P3()) {
                    i11 = org.telegram.ui.ActionBar.n6.f29566jc;
                } else {
                    i11 = org.telegram.ui.ActionBar.n6.f29477ee;
                }
            } else {
                i11 = org.telegram.ui.ActionBar.n6.Zc;
            }
            int w018 = org.telegram.ui.ActionBar.n6.w0(i11, this.Qb);
            if (A2()) {
                if (this.Q5.P3()) {
                    i12 = org.telegram.ui.ActionBar.n6.f29475ec;
                } else {
                    i12 = org.telegram.ui.ActionBar.n6.fe;
                }
            } else if (this.Q5.P3()) {
                i12 = org.telegram.ui.ActionBar.n6.f29566jc;
            } else {
                i12 = org.telegram.ui.ActionBar.n6.f29477ee;
            }
            textPaint17.setColor(i0.a.f(getVideoTranscriptionProgress(), w018, org.telegram.ui.ActionBar.n6.w0(i12, this.Qb)));
        } else if (this.C6) {
            if (fjVar.P5()) {
                org.telegram.ui.ActionBar.n6.T2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Zc, this.Qb));
            } else {
                org.telegram.ui.ActionBar.n6.T2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29421be, this.Qb));
            }
        } else if (fjVar.P3()) {
            TextPaint textPaint18 = org.telegram.ui.ActionBar.n6.T2;
            if (A2()) {
                i10 = org.telegram.ui.ActionBar.n6.f29475ec;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.f29566jc;
            }
            textPaint18.setColor(org.telegram.ui.ActionBar.n6.w0(i10, this.Qb));
        } else {
            TextPaint textPaint19 = org.telegram.ui.ActionBar.n6.T2;
            if (A2()) {
                i7 = org.telegram.ui.ActionBar.n6.fe;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.f29477ee;
            }
            textPaint19.setColor(org.telegram.ui.ActionBar.n6.w0(i7, this.Qb));
        }
    }

    public final boolean F(MotionEvent motionEvent) {
        RectF rectF;
        m1 m1Var;
        y yVar;
        boolean z10 = false;
        if (this.f31414a9 != null && (rectF = this.f31454d9) != null && (this.f31533ja != null || this.f31547ka != null)) {
            boolean contains = rectF.contains((int) motionEvent.getX(), (int) N1(motionEvent));
            if (motionEvent.getAction() == 0) {
                SpannableString spannableString = new SpannableString(this.f31414a9.getText());
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
                if (motionEvent.getAction() == 1 && this.X2 && (m1Var = this.Sa) != null) {
                    m1Var.e1(this);
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
        int i12 = this.f31411a6;
        RadialProgress2 radialProgress2 = this.Q0;
        if (i11 == 0) {
            this.X3 = 1;
            radialProgress2.p(false, 0.0f);
            fj fjVar = this.Q5;
            if (fjVar != null && !fjVar.M2()) {
                this.Q5.P = true;
            }
            int i13 = this.M1;
            if (i13 != 3 && i13 != 5) {
                if (i13 == 4 || i13 == 7) {
                    A0(this.N1);
                    org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i12);
                    TLRPC.Document document = this.N1;
                    fj fjVar2 = this.Q5;
                    if (fj.R5(fjVar2.f24073k)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    G.W(document, fjVar2, 2, i10);
                    this.Q5.l1 = false;
                }
            } else {
                org.telegram.messenger.w7 G2 = org.telegram.messenger.w7.G(i12);
                TLRPC.Document document2 = this.N1;
                fj fjVar3 = this.Q5;
                if (fj.R5(fjVar3.f24073k)) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                G2.W(document2, fjVar3, 2, i7);
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

    public final boolean F1(p1 p1Var, e80 e80Var, Layout layout, int i7) {
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
                    p1Var.f31303b = i7;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (p1Var.f31303b != i7) {
            return false;
        }
        e80Var.rewind();
        int spanStart = spanned.getSpanStart(this.A4);
        int spanEnd = spanned.getSpanEnd(this.A4);
        e80Var.f38246c = true;
        e80Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, e80Var);
        e80Var.a();
        this.f31729y4.l();
        return true;
    }

    public final boolean F3() {
        aj ajVar;
        fj fjVar = this.Q5;
        if (fjVar != null && !fjVar.f24110t1 && !fjVar.r4()) {
            xi xiVar = this.M;
            if ((xiVar == null || ((ajVar = this.L) != null && ajVar.f23012i && (xiVar.f28005l & 8) == 0)) && !this.f31521ib.f32540x0) {
                if (!this.f31724y || !fj.R4(this.Q5.f24073k)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void G0() {
        fj fjVar = this.Q5;
        if (fjVar != null) {
            fjVar.L0 = !fjVar.L0;
            m1 m1Var = this.Sa;
            if (m1Var != null) {
                m1Var.F1(this, true);
            }
        }
    }

    public final boolean G1(p1 p1Var, e80 e80Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (F1(p1Var, e80Var, ((cj) arrayList.get(i7)).f23476e, i7)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean G2() {
        if (this.R5 != null) {
            return this.W5;
        }
        return this.I;
    }

    public final boolean G3() {
        if (!w2()) {
            if ((this.L == null || (this.M.f28005l & 4) != 0) && !this.R1) {
                fj fjVar = this.Q5;
                if (fjVar != null) {
                    if (!fjVar.f24072j2 && !fjVar.r4()) {
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

    public final boolean H(MotionEvent motionEvent) {
        m1 m1Var;
        if (this.f31414a9 == null || (m1Var = this.Sa) == null || !m1Var.d()) {
            return false;
        }
        boolean contains = this.f31428b9.contains(motionEvent.getX(), motionEvent.getY());
        if (this.f31441c9 == null) {
            this.f31441c9 = new lc(this);
        }
        if (motionEvent.getAction() == 0) {
            this.f31441c9.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.f31441c9.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f31441c9.f37109i) {
                this.Sa.k2(this);
            }
            this.f31441c9.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.f31441c9.c(false);
        }
        return this.f31441c9.f37109i;
    }

    public final void H0(Canvas canvas, float f10) {
        ArrayList arrayList;
        float f11;
        float f12;
        if (this.f31565m3 == null) {
            return;
        }
        float f13 = this.f31660t3;
        float f14 = this.f31648s3;
        y1 y1Var = this.f31521ib;
        if (y1Var.f32540x0) {
            if (y1Var.D0) {
                f13 -= getTranslationY();
                f12 = y1Var.f32475h0;
            } else if (y1Var.f32525t0) {
                float f15 = y1Var.L1;
                float f16 = 1.0f - f15;
                f14 = (f14 * f15) + (y1Var.f32517r0 * f16);
                f13 = (f13 * f15) + (f16 * y1Var.f32521s0);
            } else if (!fj.R4(this.Q5.f24073k) || !TextUtils.isEmpty(this.Q5.f24131z)) {
                f12 = y1Var.f32475h0;
            }
            f14 += f12;
        }
        float f17 = f14;
        float f18 = f13;
        float f19 = 0.0f;
        ArrayList arrayList2 = null;
        if (y1Var.f32449b1) {
            float f20 = y1Var.L1;
            if (f20 != 1.0f) {
                dj djVar = y1Var.f32454c1;
                if (djVar != null) {
                    arrayList = djVar.f23662e;
                } else {
                    arrayList = null;
                }
                org.telegram.ui.Components.t5 t5Var = y1Var.P0;
                float f21 = (1.0f - f20) * f10;
                if (djVar != null) {
                    f11 = djVar.d;
                } else {
                    f11 = 0.0f;
                }
                I0(f17, f18, canvas, arrayList, t5Var, false, f21, f11, true);
                dj djVar2 = this.f31565m3;
                if (djVar2 != null) {
                    arrayList2 = djVar2.f23662e;
                }
                ArrayList arrayList3 = arrayList2;
                org.telegram.ui.Components.t5 t5Var2 = this.Aa;
                float f22 = f10 * y1Var.L1;
                if (djVar2 != null) {
                    f19 = djVar2.d;
                }
                I0(f17, f18, canvas, arrayList3, t5Var2, true, f22, f19, true);
                return;
            }
        }
        dj djVar3 = this.f31565m3;
        if (djVar3 != null) {
            arrayList2 = djVar3.f23662e;
        }
        ArrayList arrayList4 = arrayList2;
        org.telegram.ui.Components.t5 t5Var3 = this.Aa;
        if (djVar3 != null) {
            f19 = djVar3.d;
        }
        I0(f17, f18, canvas, arrayList4, t5Var3, true, f10, f19, true);
    }

    public final void H1() {
        fj fjVar = this.R5;
        if (fjVar == null) {
            fjVar = this.Q5;
        }
        fj fjVar2 = fjVar;
        this.Q5 = null;
        y3(fjVar2, this.L, this.G, this.F, this.H, false);
    }

    public final boolean H2() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message;
        fj fjVar = this.Q5;
        if (!fjVar.f24080l2) {
            if (fj.B0(fjVar.f24073k) != 489000 || (message = this.Q5.f24073k) == null || message.fwd_from == null) {
                if (!this.Q5.r4() && !this.Q5.v3()) {
                    if (!this.f31490g6 || this.f31690v6) {
                        TLRPC.Message message2 = this.Q5.f24073k;
                        if (message2 == null || (messageFwdHeader = message2.fwd_from) == null || (peer = messageFwdHeader.from_id) == null || message2.via_bot_id == 0 || org.telegram.messenger.n5.o(peer) != org.telegram.messenger.n5.o(this.Q5.f24073k.peer_id)) {
                            if (!x2()) {
                                if (!this.f31690v6 || this.Q5.D != 0) {
                                    if (!this.F && this.f31532j9 && this.f31478f6) {
                                        if (this.Q5.P3()) {
                                            if ((this.Q5.A4() && this.Q5.o3()) || this.Q5.f24072j2) {
                                                return true;
                                            }
                                        } else {
                                            return true;
                                        }
                                    }
                                    if (!this.Q5.y3() || this.Q5.f24073k.fwd_from.from_id != null) {
                                        return false;
                                    }
                                    return true;
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

    public final boolean H3() {
        fj fjVar;
        fj fjVar2;
        int i7 = this.f31695vb;
        if (i7 != 0) {
            if (i7 != 1) {
                return false;
            }
        } else if (!u2()) {
            if (!e4() && ((!this.C6 || ((this.f31565m3 != null && !this.f31700w1) || (!this.O.f5487p && ((fjVar2 = this.Q5) == null || (!fjVar2.M2() && !this.Q5.h4()))))) && ((fjVar = this.Q5) == null || fjVar.D != 29))) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public final boolean I(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.I(android.view.MotionEvent):boolean");
    }

    public final void I0(float r24, float r25, android.graphics.Canvas r26, java.util.ArrayList r27, org.telegram.ui.Components.t5 r28, boolean r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.I0(float, float, android.graphics.Canvas, java.util.ArrayList, org.telegram.ui.Components.t5, boolean, float, float, boolean):void");
    }

    public final boolean I2(fj fjVar) {
        TLRPC.MessageFwdHeader messageFwdHeader = fjVar.f24073k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
            m1 m1Var = this.Sa;
            if (m1Var == null || m1Var.b0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void I3(int i7, boolean z10, boolean z11) {
        float f10;
        float f11 = 0.0f;
        if (i7 == -1 || i7 == 0) {
            if (this.f31635r5 != z10) {
                this.f31635r5 = z10;
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

    public final void J0(Canvas canvas, float f10) {
        wg0 wg0Var;
        fj fjVar = this.Q5;
        if (fjVar != null && !fjVar.r4()) {
            float f11 = this.f31670u0;
            y1 y1Var = this.f31521ib;
            if (y1Var.f32499m2) {
                float f12 = y1Var.f32507o2;
                float f13 = y1Var.L1;
                f11 = (f11 * f13) + ((1.0f - f13) * f12);
            }
            float f14 = f11;
            if (y1Var.L1 != 1.0f && y1Var.H0 && ((wg0Var = this.Ac) == null || !wg0Var.h)) {
                canvas.save();
                org.telegram.ui.ActionBar.u4 u4Var = this.L6;
                if (u4Var != null) {
                    Rect bounds = u4Var.getBounds();
                    if (this.Q5.P3() && !this.C6 && !this.G) {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(10.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    } else {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(4.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    }
                }
                I0(this.f31588o0, f14, canvas, y1Var.I0, y1Var.P0, false, (1.0f - y1Var.L1) * f10, this.Q5.f24126x2, false);
                fj fjVar2 = this.Q5;
                I0(this.f31588o0, f14, canvas, fjVar2.B2, this.Aa, true, f10 * y1Var.L1, fjVar2.f24126x2, false);
                canvas.restore();
            } else {
                fj fjVar3 = this.Q5;
                I0(this.f31588o0, f14, canvas, fjVar3.B2, this.Aa, true, f10, fjVar3.f24126x2, false);
            }
        }
        if (F3()) {
            H0(canvas, f10);
        }
    }

    public final ColorFilter J1(int i7, int i10) {
        if (this.f31600od == null) {
            this.f31614pd = new int[3];
            this.f31600od = new ColorFilter[3];
        }
        if (i10 != this.f31614pd[i7] || this.f31600od[i7] == null) {
            ColorFilter[] colorFilterArr = this.f31600od;
            this.f31614pd[i7] = i10;
            colorFilterArr[i7] = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.f31600od[i7];
    }

    public final boolean J2(org.telegram.messenger.fj r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.J2(org.telegram.messenger.fj):boolean");
    }

    public final void J3() {
        fi.s2 s2Var = this.U0;
        K3((s2Var.N0 / 2.0f) + s2Var.L0, (s2Var.O0 / 2.0f) + s2Var.M0);
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            invalidate();
            q2();
        }
    }

    public final void K0(android.graphics.Canvas r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.K0(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public final boolean K2() {
        if (this.R5 != null) {
            return this.U5;
        }
        return this.G;
    }

    public final void K3(float f10, float f11) {
        r1 r1Var;
        fi.s2 s2Var = this.U0;
        this.P9 = (float) Math.sqrt(Math.pow(s2Var.O0, 2.0d) + Math.pow(s2Var.N0, 2.0d));
        fj fjVar = this.Q5;
        if (!fjVar.O0 && this.M9 == 0.0f) {
            if (fjVar.D == 3) {
                fjVar.M1 = true;
                fjVar.Q0 = true;
                r1Var = this;
                r1Var.x3(fjVar, this.L, this.G, this.F, this.H, this.I);
                fj fjVar2 = r1Var.Q5;
                fjVar2.Q0 = false;
                fjVar2.M1 = false;
                if (r1Var.L != null) {
                    r1Var.Q0.p(false, 0.0f);
                }
            } else {
                r1Var = this;
            }
            r1Var.N9 = f10;
            r1Var.O9 = f11;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c8.m9.a(r1Var.P9 * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(kr.f36861j);
            duration.addUpdateListener(new r(this, 2));
            duration.addListener(new l1(this, 0));
            duration.start();
        }
    }

    public final boolean L(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.L(android.view.MotionEvent):boolean");
    }

    public final boolean L0() {
        fj fjVar;
        if (this.Rb && (fjVar = this.Q5) != null && fjVar.P3() && org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29772ub, this.Qb) != 0) {
            return true;
        }
        return false;
    }

    public final boolean L2() {
        if (this.R5 != null) {
            return this.T5;
        }
        return this.F;
    }

    public final boolean L3() {
        m1 m1Var;
        if (getCurrentMessagesGroup() == null && (m1Var = this.Sa) != null && m1Var.B2() != null && this.Sa.B2().z(this.Q5)) {
            return true;
        }
        return false;
    }

    public final boolean M(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f31719x7) {
            int x10 = (int) motionEvent.getX();
            int N1 = (int) N1(motionEvent);
            xi xiVar = this.M;
            if (xiVar != null) {
                int i7 = xiVar.f28005l;
                if ((i7 & 1) == 0 || (i7 & 8) == 0) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt != this && (childAt instanceof r1)) {
                            r1 r1Var = (r1) childAt;
                            if (r1Var.f31719x7 && r1Var.L == this.L) {
                                int i11 = r1Var.M.f28005l;
                                if ((i11 & 1) != 0 && (i11 & 8) != 0) {
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), (motionEvent.getX() + getLeft()) - r1Var.getLeft(), (N1(motionEvent) + getTop()) - r1Var.getTop(), 0);
                                    boolean M = r1Var.M(obtain);
                                    obtain.recycle();
                                    return M;
                                }
                            }
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.J2;
            if (action == 0) {
                if (this.f31732y7.contains(x10, N1)) {
                    if (this.Q5.q4()) {
                        this.L2[1] = 2;
                        this.f31744z7 = true;
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
                if (this.f31744z7) {
                    m1 m1Var = this.Sa;
                    if (m1Var != null) {
                        if (this.f31676u6) {
                            m1Var.t(this);
                        } else {
                            m1Var.C(this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[1];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.f31744z7 = false;
                    s2();
                    return false;
                }
            } else if (motionEvent.getAction() == 2 && this.f31744z7 && (drawable = drawableArr[1]) != null) {
                drawable.setHotspot(x10, N1);
            }
        }
        return false;
    }

    public final boolean M0(android.graphics.Canvas r43, boolean r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.M0(android.graphics.Canvas, boolean, boolean):boolean");
    }

    public final org.telegram.ui.ActionBar.u4 M1(boolean z10) {
        boolean z11;
        if (z10) {
            xi xiVar = this.M;
            if (xiVar != null && (xiVar.f28005l & 8) == 0 && this.L.f23012i && !this.K) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.Q5.P3()) {
                if (!this.C6 && !this.K && !z11) {
                    this.L6 = d3("drawableMsgOut");
                } else {
                    this.L6 = d3("drawableMsgOutMedia");
                }
            } else if (!this.C6 && !this.K && !z11) {
                this.L6 = (org.telegram.ui.ActionBar.u4) Z1("drawableMsgIn");
            } else {
                this.L6 = (org.telegram.ui.ActionBar.u4) Z1("drawableMsgInMedia");
            }
        }
        this.L6.f();
        return this.L6;
    }

    public final boolean M2() {
        if (this.f31735yb && this.f31748zb) {
            return true;
        }
        return false;
    }

    @Override
    public final void N(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.N(java.lang.String):void");
    }

    public void N0(Canvas canvas) {
        if (!this.Q5.O0 && this.M9 != 1.0f) {
            fi.s2 s2Var = this.U0;
            int[] iArr = s2Var.X0;
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
            rectF.set(s2Var.L0, s2Var.M0, s2Var.z(), s2Var.B());
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
                s2Var.h(canvas, null);
            } else {
                float f14 = s2Var.L0;
                float f15 = s2Var.M0;
                float f16 = s2Var.N0;
                float f17 = s2Var.O0;
                ImageReceiver imageReceiver = this.V0;
                imageReceiver.z0(f14, f15, f16, f17);
                imageReceiver.M0(s2Var.X0);
                imageReceiver.h(canvas, null);
            }
            O0(canvas);
            canvas.restore();
        }
    }

    public final float N1(MotionEvent motionEvent) {
        return ((motionEvent.getY() - this.W) - this.f31484g0) - this.f31511i0;
    }

    public final boolean N2() {
        fj fjVar = this.Q5;
        if (fjVar != null && fjVar.S4()) {
            return false;
        }
        return true;
    }

    public final boolean O(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.Q5.D == 12) {
            if (this.f31701w2 == null) {
                this.f31701w2 = new s1(this);
            }
            s1 s1Var = this.f31701w2;
            r1 r1Var = s1Var.f31837a;
            fj fjVar = r1Var.Q5;
            int[] iArr = r1Var.N2;
            Drawable[] drawableArr = r1Var.J2;
            if (fjVar.D == 12) {
                int x10 = (int) motionEvent.getX();
                int N1 = (int) r1Var.N1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    ArrayList arrayList = s1Var.f31842g;
                    if (arrayList != null && arrayList.size() > 1) {
                        for (int i7 = 0; i7 < s1Var.f31842g.size(); i7++) {
                            o1 o1Var = (o1) s1Var.f31842g.get(i7);
                            float f10 = x10;
                            float f11 = N1;
                            if (o1Var.f31236e.contains(f10, f11)) {
                                if (o1Var.f31237f == null) {
                                    o1Var.f31237f = new lc(r1Var);
                                }
                                o1Var.f31237f.c(true);
                                y yVar = o1Var.f31238g;
                                if (yVar != null) {
                                    yVar.setHotspot(f10, f11);
                                    o1Var.f31238g.setState(iArr);
                                }
                                r1Var.invalidate();
                                return true;
                            }
                        }
                    }
                    float f12 = x10;
                    float f13 = N1;
                    if (r1Var.f31686v2.contains(f12, f13)) {
                        s1Var.h = true;
                        r1Var.Ga.c(true);
                        Drawable drawable2 = drawableArr[0];
                        if (drawable2 != null) {
                            drawable2.setHotspot(f12, f13);
                            drawableArr[0].setState(iArr);
                        }
                        r1Var.invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (s1Var.h) {
                        if (r1Var.Sa != null) {
                            ArrayList arrayList2 = s1Var.f31842g;
                            if (arrayList2 != null && arrayList2.size() == 1) {
                                r1Var.Sa.p1(r1Var, ((o1) s1Var.f31842g.get(0)).f31233a);
                            } else {
                                r1Var.Sa.p1(r1Var, 5);
                            }
                        }
                        r1Var.playSoundEffect(0);
                        Drawable drawable3 = drawableArr[0];
                        if (drawable3 != null) {
                            drawable3.setState(StateSet.NOTHING);
                        }
                        s1Var.h = false;
                        r1Var.Ga.c(false);
                        r1Var.invalidate();
                        return false;
                    }
                    ArrayList arrayList3 = s1Var.f31842g;
                    if (arrayList3 != null && arrayList3.size() > 1) {
                        for (int i10 = 0; i10 < s1Var.f31842g.size(); i10++) {
                            o1 o1Var2 = (o1) s1Var.f31842g.get(i10);
                            lc lcVar = o1Var2.f31237f;
                            if (lcVar != null && lcVar.f37109i) {
                                m1 m1Var = r1Var.Sa;
                                if (m1Var != null) {
                                    m1Var.p1(r1Var, o1Var2.f31233a);
                                }
                                y yVar2 = o1Var2.f31238g;
                                if (yVar2 != null) {
                                    yVar2.setState(StateSet.NOTHING);
                                }
                                o1Var2.f31237f.c(false);
                                r1Var.playSoundEffect(0);
                                r1Var.invalidate();
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 2) {
                    if (s1Var.h && (drawable = drawableArr[0]) != null) {
                        drawable.setHotspot(x10, N1);
                        return false;
                    }
                    ArrayList arrayList4 = s1Var.f31842g;
                    if (arrayList4 != null && arrayList4.size() > 1) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= s1Var.f31842g.size()) {
                                break;
                            }
                            o1 o1Var3 = (o1) s1Var.f31842g.get(i11);
                            lc lcVar2 = o1Var3.f31237f;
                            if (lcVar2 != null && lcVar2.f37109i) {
                                y yVar3 = o1Var3.f31238g;
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

    public void O0(Canvas canvas) {
        if (this.Q9 == null) {
            return;
        }
        canvas.save();
        fi.s2 s2Var = this.U0;
        canvas.translate(s2Var.L0, s2Var.M0);
        this.Q9.c(canvas, this, (int) s2Var.N0, (int) s2Var.O0, s2Var.getAlpha(), this.Hc);
        canvas.restore();
        invalidate();
    }

    public final String O1(fj fjVar) {
        if (this.B5) {
            String O0 = gd.O0("PsaMessage_" + fjVar.f24073k.fwd_from.psa_type);
            if (O0 == null) {
                return gd.N0(2131746399, "PsaMessageDefault");
            }
            return O0;
        }
        return gd.N0(2131750548, null);
    }

    public final boolean O2() {
        fj fjVar;
        if (this.Y6 && (fjVar = this.Q5) != null && !fjVar.P3() && this.M == null && !u2()) {
            return true;
        }
        return false;
    }

    public final void O3(int i7, boolean z10) {
        if (i7 >= 0) {
            ArrayList arrayList = this.Q4;
            if (i7 < arrayList.size()) {
                q1 q1Var = (q1) arrayList.get(i7);
                if (this.Sa.X(this, q1Var.f31369t, !q1Var.f31358i)) {
                    if (z10) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long B0 = fj.B0(this.Q5.f24073k);
                    int i10 = this.f31411a6;
                    long M = org.telegram.messenger.v3.M(mp.u1(i10).O0(Long.valueOf(B0)), mp.u1(i10).P0(B0), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) fj.m1(this.Q5);
                    int i11 = this.f31411a6;
                    fj.Z5(i11, M, tL_messageMediaToDo, q1Var.f31369t.f28639id, !q1Var.f31358i, ConnectionsManager.getInstance(i11).getCurrentTime());
                    if (!q1Var.f31358i) {
                        TLObject g22 = mp.u1(i10).g2(M);
                        q1Var.f31373y.l(g22);
                        q1Var.f31374z.j0(g22, q1Var.f31373y, null);
                        q1Var.f31366q = new wy0(org.telegram.messenger.n5.m(g22), 12.0f, null);
                    }
                    this.f31479f7[i7].f(-1, !q1Var.f31358i, true);
                    if (this.f31728y3 != null) {
                        if (!this.Q5.P3() && fj.B0(this.Q5.f24073k) >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.f31728y3.t(gd.K("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(fj.z0(tL_messageMediaToDo)), org.telegram.messenger.n5.l(i10.f24637t0, this.Q5.Z0())), true, true);
                        } else {
                            this.f31728y3.t(gd.K("TodoCompleted", tL_messageMediaToDo.todo.list.size(), ',', Integer.valueOf(fj.z0(tL_messageMediaToDo))), true, true);
                        }
                    }
                    q1Var.f31358i = !q1Var.f31358i;
                    invalidate();
                    return;
                }
                this.Z4 = false;
            }
        }
    }

    public final boolean P(MotionEvent motionEvent) {
        float f10;
        m1 m1Var;
        fj fjVar = this.Q5;
        if (fjVar == null || fjVar.M0() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f11 = 0.0f;
        if (this.f31524j0 == 0) {
            f10 = 0.0f;
        } else {
            f10 = 18.0f;
        }
        float L = timeX - org.telegram.messenger.g0.L(f10);
        float f12 = this.A9;
        if (this.Q5.B0) {
            f11 = 1.0f - this.f31541k4;
        }
        int L2 = ((int) ((f12 * f11) + L)) - org.telegram.messenger.g0.L(2.0f);
        int timeY = ((int) getTimeY()) - org.telegram.messenger.g0.L(2.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(L2, timeY, org.telegram.messenger.g0.L(16.0f) + L2 + this.A9, org.telegram.messenger.g0.L(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), N1(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.f31550l0 == null) {
                    this.f31550l0 = new lc(this);
                }
                this.f31496gc = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.f31496gc = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.f31496gc && (m1Var = this.Sa) != null) {
                m1Var.M(this);
            }
            this.f31496gc = false;
        } else if (motionEvent.getAction() == 3) {
            this.f31496gc = false;
        }
        lc lcVar = this.f31550l0;
        if (lcVar != null) {
            lcVar.c(this.f31496gc);
        }
        return this.f31496gc;
    }

    public final boolean P0(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        fj fjVar;
        m1 m1Var;
        String str;
        boolean c10 = cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        int i7 = 1;
        int i10 = this.f31411a6;
        if (!c10 && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                zy C = zy.C(i10);
                fj fjVar2 = this.Q5;
                if (fjVar2 != null && keyboardButtonProto != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(fj.B0(fjVar2.f24073k));
                    sb2.append("_");
                    sb2.append(fjVar2.e1());
                    sb2.append("_");
                    sb2.append(Utilities.f(keyboardButtonProto.getData()));
                    sb2.append("_");
                    if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    sb2.append(str);
                    return C.f28482n.containsKey(sb2.toString());
                }
            } else {
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (tL_inlineButtonTypeUrl != null && (m1Var = this.Sa) != null && m1Var.z1(this, 3) && TextUtils.equals(this.Sa.k(this), tL_inlineButtonTypeUrl.url)) {
                    return true;
                }
            }
        } else {
            zy C2 = zy.C(i10);
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
                return C2.f28483r.containsKey(fj.B0(fjVar.f24073k) + "_" + fjVar.e1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i7);
            }
        }
        return false;
    }

    public final float P1(boolean z10) {
        float f10;
        dh0 dh0Var;
        float f11;
        if (!this.f31538k1 && this.f31731y6) {
            int i7 = this.f31743z6;
            if (i7 >= 300) {
                f11 = 1.0f;
            } else {
                f11 = i7 / 300.0f;
            }
            f10 = f11 * 1.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10 && (dh0Var = this.f31591o3) != null) {
            return (1.0f - dh0Var.f34339k.e(false, 1.0f)) * f10;
        }
        return f10;
    }

    public final void P3() {
        fj fjVar;
        int i7;
        boolean z10;
        ev evVar;
        ArrayList arrayList;
        if (this.f31736yc && (fjVar = this.Q5) != null) {
            boolean z11 = false;
            if (fjVar.X1) {
                i7 = org.telegram.ui.Components.o5.f();
            } else {
                i7 = 0;
            }
            dj djVar = this.f31565m3;
            if (djVar != null && (arrayList = djVar.f23662e) != null) {
                this.Aa = org.telegram.ui.Components.x5.update(i7, (View) this, false, this.Aa, (ArrayList<cj>) arrayList);
            } else {
                m1 m1Var = this.Sa;
                if (m1Var != null && m1Var.i()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.Aa = org.telegram.ui.Components.x5.update(i7, this, z10, this.Aa, this.Q5.B2);
            }
            fj fjVar2 = this.Q5;
            if (fjVar2.D == 36 && (evVar = fjVar2.f24130y2) != null) {
                m1 m1Var2 = this.Sa;
                if (m1Var2 == null || !m1Var2.i()) {
                    z11 = true;
                }
                evVar.v = z11;
                this.Q5.f24130y2.b0(i7);
            }
        }
    }

    public final boolean Q(MotionEvent motionEvent) {
        int i7;
        int i10;
        int i11;
        if (this.T1) {
            u1 E1 = E1();
            r1 r1Var = E1.f31951a;
            boolean z10 = r1Var.T1;
            ArrayList arrayList = r1Var.I5;
            n2.p0 p0Var = r1Var.f31674u4;
            if (z10) {
                int x10 = (int) motionEvent.getX();
                int N1 = (int) r1Var.N1(motionEvent);
                if (motionEvent.getAction() == 0) {
                    if (r1Var.O1 && r1Var.f31726y1 && r1Var.O3 != -1 && x10 >= (i10 = r1Var.K3) && x10 <= org.telegram.messenger.g0.L(48.0f) + i10 && N1 >= (i11 = r1Var.L3) && N1 <= org.telegram.messenger.g0.L(48.0f) + i11 && r1Var.Q0.f33158i.f33986q != 4) {
                        r1Var.P3 = 1;
                        r1Var.invalidate();
                        return true;
                    } else if (r1Var.O1 && r1Var.U0.P(x10, N1)) {
                        E1.v = true;
                        return true;
                    } else if (r1Var.f31603p2 == null || N1 < r1Var.Y1) {
                        return false;
                    } else {
                        try {
                            int L = x10 - ((r1Var.f31601p0 + org.telegram.messenger.g0.L(10.0f)) + r1Var.f31407a2);
                            int i12 = N1 - r1Var.Y1;
                            int lineForVertical = r1Var.f31603p2.getLineForVertical(i12);
                            float f10 = L;
                            int offsetForHorizontal = r1Var.f31603p2.getOffsetForHorizontal(lineForVertical, f10);
                            float lineLeft = r1Var.f31603p2.getLineLeft(lineForVertical);
                            if (lineLeft > f10 || lineLeft + r1Var.f31603p2.getLineWidth(lineForVertical) < f10) {
                                return false;
                            }
                            Spannable spannable = (Spannable) r1Var.Q5.f24127y;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length == 0) {
                                return false;
                            }
                            if (((clickableSpanArr[0] instanceof o41) && !o41.h) || org.telegram.messenger.g0.C1()) {
                                return false;
                            }
                            k80 k80Var = r1Var.f31634r4;
                            if (k80Var == null || k80Var.f36682i != clickableSpanArr[0]) {
                                p0Var.m(k80Var, true);
                                k80 k80Var2 = new k80(clickableSpanArr[0], r1Var.Qb, f10, i12, 0);
                                r1Var.f31634r4 = k80Var2;
                                if (r1Var.Q5.P3()) {
                                    i7 = org.telegram.ui.ActionBar.n6.Dc;
                                } else {
                                    i7 = org.telegram.ui.ActionBar.n6.Ce;
                                }
                                k80Var2.d(org.telegram.ui.ActionBar.n6.w0(i7, r1Var.Qb));
                                r1Var.f31725y0 = -10;
                                r1Var.f31688v4 = 2;
                                try {
                                    e80 b10 = r1Var.f31634r4.b();
                                    int[] X1 = X1(spannable, r1Var.f31634r4.f36682i);
                                    b10.d(r1Var.f31603p2, X1[0], 0.0f);
                                    r1Var.f31603p2.getSelectionPath(X1[0], X1[1], b10);
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                p0Var.b(r1Var.f31634r4, 2);
                            }
                            r1Var.invalidate();
                            return true;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return false;
                        }
                    }
                } else if (motionEvent.getAction() != 1) {
                    return false;
                } else {
                    if (r1Var.f31688v4 != 2 && !E1.v && r1Var.P3 == 0) {
                        r1Var.h3(2);
                        return false;
                    } else if (r1Var.P3 != 0) {
                        r1Var.P3 = 0;
                        r1Var.playSoundEffect(0);
                        r1Var.E0(false);
                        r1Var.invalidate();
                        return false;
                    } else {
                        k80 k80Var3 = r1Var.f31634r4;
                        if (k80Var3 != null) {
                            CharacterStyle characterStyle = k80Var3.f36682i;
                            if (characterStyle instanceof URLSpan) {
                                vf.c.t(r1Var.getContext(), ((URLSpan) r1Var.f31634r4.f36682i).getURL());
                            } else if (characterStyle instanceof ClickableSpan) {
                                ((ClickableSpan) characterStyle).onClick(r1Var);
                            }
                            r1Var.h3(2);
                            return false;
                        }
                        E1.v = false;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList.size()) {
                                break;
                            }
                            d0 d0Var = (d0) arrayList.get(i13);
                            if (cg.c.c(d0Var.f30590i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                r1Var.playSoundEffect(0);
                                r1Var.Sa.m1(r1Var, d0Var.f30590i);
                                r1Var.invalidate();
                                break;
                            }
                            i13++;
                        }
                        r1Var.h3(2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void Q0(float r8, android.graphics.Canvas r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.Q0(float, android.graphics.Canvas, boolean):void");
    }

    public final boolean Q2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.Q2():boolean");
    }

    public final void Q3(boolean r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.Q3(boolean, boolean, boolean):void");
    }

    public final void R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.R():void");
    }

    public final void R0(android.graphics.Canvas r35, org.telegram.messenger.dj r36, boolean r37, boolean r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.R0(android.graphics.Canvas, org.telegram.messenger.dj, boolean, boolean, float):void");
    }

    public final String R1(long j3) {
        TLRPC.Chat O0;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f31411a6;
        if (i7 > 0) {
            TLRPC.User c22 = mp.u1(i10).c2(Long.valueOf(j3));
            if (c22 != null) {
                return n10.q(c22);
            }
            return null;
        } else if (i7 < 0 && (O0 = mp.u1(i10).O0(Long.valueOf(-j3))) != null) {
            return O0.title;
        } else {
            return null;
        }
    }

    public final boolean R2() {
        fj fjVar = this.Q5;
        ev evVar = fjVar.f24130y2;
        if (fjVar.D == 36 && evVar != null) {
            ArrayList arrayList = evVar.f23877g;
            if (arrayList.size() == 1 && (arrayList.get(0) instanceof rk0)) {
                return true;
            }
        }
        return false;
    }

    public final void R3() {
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
        fj fjVar = this.Q5;
        int i17 = fjVar.D;
        float f14 = 0.0f;
        y1 y1Var = this.f31521ib;
        int i18 = 0;
        boolean z10 = true;
        if (i17 != 1 && i17 != 20 && this.M1 != 4 && i17 != 8 && i17 != 23) {
            float f15 = 10.0f;
            float f16 = 11.0f;
            if (this.S1) {
                int i19 = this.N6;
                if (!fjVar.P3()) {
                    f16 = 17.0f;
                }
                this.f31648s3 = org.telegram.messenger.g0.L(f16) + i19 + this.f31633r3;
                int i20 = this.f31684v0 - this.f31673u3;
                if (this.J) {
                    f15 = 9.0f;
                }
                int L2 = ((i20 - org.telegram.messenger.g0.L(f15)) - this.W1) - org.telegram.messenger.g0.L(17.0f);
                if (this.f31719x7 && this.F8 != 3) {
                    i16 = getCommentButtonHeight();
                } else {
                    i16 = 0;
                }
                L = L2 - i16;
                this.f31660t3 = org.telegram.messenger.g0.T1(L, org.telegram.messenger.g0.L(9.0f) + this.Ua, a3());
            } else {
                if (this.f31735yb) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.Q5.P3()) {
                        i15 = 0;
                    } else {
                        i15 = 6;
                    }
                    this.f31648s3 = org.telegram.messenger.g0.L(i15 + 11) + backgroundDrawableLeft;
                } else {
                    int i21 = this.N6;
                    if (!fjVar.P3() && !this.C6 && !this.K) {
                        f16 = 17.0f;
                    }
                    this.f31648s3 = org.telegram.messenger.g0.L(f16) + i21 + this.f31633r3;
                }
                int i22 = this.f31684v0 - this.f31673u3;
                if (this.J) {
                    f15 = 9.0f;
                }
                int L3 = i22 - org.telegram.messenger.g0.L(f15);
                if (this.f31719x7 && this.F8 != 3) {
                    i13 = getCommentButtonHeight();
                } else {
                    i13 = 0;
                }
                int i23 = L3 - i13;
                ch.q0 q0Var = this.O;
                if (!q0Var.f5487p) {
                    i14 = q0Var.f5485n;
                } else {
                    i14 = 0;
                }
                L = i23 - i14;
                this.f31660t3 = org.telegram.messenger.g0.T1(L, org.telegram.messenger.g0.L(9.0f) + this.Ua, a3());
            }
        } else {
            if (y1Var.f32471g0) {
                f11 = y1Var.f32502n0;
                f12 = y1Var.f32505o0;
                f10 = y1Var.f32513q0;
            } else {
                fi.s2 s2Var = this.U0;
                float f17 = s2Var.L0;
                float f18 = s2Var.M0;
                f10 = s2Var.O0;
                f11 = f17;
                f12 = f18;
            }
            this.f31648s3 = f11 + org.telegram.messenger.g0.L(5.0f) + this.f31633r3;
            if (u2()) {
                float compactLeft = getCompactLeft() - getExtraTextX();
                if (t2()) {
                    f13 = this.f31656sd;
                } else if (this.L != null && this.M != null) {
                    f13 = getLeft();
                } else {
                    f13 = 0.0f;
                }
                this.f31648s3 = compactLeft - f13;
            }
            L = f12 + f10 + org.telegram.messenger.g0.L(6.0f);
            float L4 = f10 + org.telegram.messenger.g0.L(6.0f);
            dj djVar = this.f31565m3;
            if (djVar == null) {
                i7 = 0;
            } else {
                i7 = -djVar.b();
            }
            this.f31660t3 = org.telegram.messenger.g0.T1(L4, i7 - org.telegram.messenger.g0.L(4.0f), a3()) + f12;
            z10 = false;
        }
        this.f31648s3 += getExtraTextX();
        fj fjVar2 = this.Q5;
        if (fjVar2 != null && (i10 = fjVar2.D) != 0 && i10 != 24 && !fjVar2.v3() && !this.Q5.r4()) {
            if (z10 && g2()) {
                this.f31660t3 -= (1.0f - a3()) * (org.telegram.messenger.g0.L(16.0f) + this.f31645s0.f31912r);
            }
            if (z10) {
                t1 t1Var = this.f31645s0;
                if (t1Var != null) {
                    i12 = t1Var.f31912r;
                } else {
                    i12 = 0;
                }
                i11 = org.telegram.messenger.g0.L(14.0f) + i12;
            } else {
                i11 = 0;
            }
            float f19 = L - i11;
            dj djVar2 = this.f31565m3;
            if (djVar2 != null) {
                i18 = org.telegram.messenger.g0.L(4.0f) + djVar2.c(y1Var);
            }
            this.f31630r0 = (int) ((f19 + org.telegram.messenger.g0.W1(a3(), i18, org.telegram.messenger.g0.L(6.0f))) - y1Var.f32489k0);
        }
        fj fjVar3 = this.Q5;
        if (fjVar3 != null && fjVar3.D == 17) {
            float f20 = this.f31660t3;
            x1 x1Var = this.f31714x2;
            if (x1Var != null) {
                f14 = x1Var.f32397q;
            }
            this.f31660t3 = f20 + f14;
        }
    }

    public final boolean S(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.S(android.view.MotionEvent):boolean");
    }

    public final void S0(Canvas canvas) {
        fj fjVar;
        float f10;
        fj fjVar2 = this.Q5;
        if ((fjVar2 == null || !fjVar2.r4()) && (fjVar = this.Q5) != null && !fjVar.o4()) {
            fj fjVar3 = this.Q5;
            if (fjVar3.D != 27 && !fjVar3.n4() && this.f31563m1 != null) {
                if (this.n1 || this.f31589o1) {
                    xi xiVar = this.M;
                    if (xiVar != null) {
                        int i7 = xiVar.f28005l;
                        if ((i7 & 8) == 0 || (i7 & 1) == 0) {
                            return;
                        }
                    }
                    canvas.save();
                    float y10 = getY() + getPaddingTop();
                    aj ajVar = this.L;
                    if (ajVar != null && ajVar.d.size() > 1) {
                        f10 = (getTop() + this.L.f23016m.f28396f) - getTranslationY();
                    } else {
                        f10 = y10 + this.f31521ib.f32489k0;
                    }
                    canvas.translate(this.f31412a7 - getCompactSideMenuShift(), f10 + this.Ic);
                    this.f31563m1.a(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final float S1(boolean z10) {
        boolean z11;
        kr krVar;
        float f10 = this.f31536jd;
        fj fjVar = this.Q5;
        if (fjVar != null && !fjVar.P3()) {
            int i7 = 0;
            if (z10 && ((z11 = this.n1) || this.f31589o1)) {
                if (z11) {
                    krVar = kr.f36859g;
                } else {
                    krVar = kr.f36860i;
                }
                this.f31631r1 = (int) Math.ceil(krVar.getInterpolation(this.f31602p1) * org.telegram.messenger.g0.L(35.0f));
                if (this.Q5.D == 36) {
                    if (org.telegram.messenger.g0.L(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                        this.f31631r1 = 0;
                    }
                }
            }
            f10 += this.f31631r1;
            if (u2()) {
                return f10 + getCompactSideMenuShift();
            }
            if (this.X6 && this.M != null) {
                if (b3()) {
                    i7 = 48;
                }
                return (org.telegram.messenger.g0.L(71 - i7) * this.Z6) + f10;
            }
        }
        return f10;
    }

    public final boolean S2() {
        rk0 d42 = d4();
        if (d42 != null) {
            long j3 = this.f31417ac;
            long j10 = 0;
            if (j3 != 0) {
                e81 e81Var = d42.f39332e0;
                if (e81Var != null) {
                    j10 = e81Var.f34662t;
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

    public final void S3() {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        if (this.Q5 != null) {
            int i7 = this.f31411a6;
            mp u12 = mp.u1(i7);
            TLRPC.MessageFwdHeader messageFwdHeader = this.Q5.f24073k.fwd_from;
            long e10 = i10.i(i7).e();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (fj.B0(this.Q5.f24073k) == e10 || fj.B0(this.Q5.f24073k) == 1271266957)) {
                this.f31547ka = mp.u1(i7).O0(Long.valueOf(messageFwdHeader.from_id.channel_id));
            } else if (messageFwdHeader != null && fj.B0(this.Q5.f24073k) == 489000) {
                long o4 = org.telegram.messenger.n5.o(messageFwdHeader.from_id);
                if (o4 >= 0) {
                    this.f31533ja = u12.c2(Long.valueOf(o4));
                } else {
                    this.f31547ka = u12.O0(Long.valueOf(-o4));
                }
            } else if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
                long j3 = peer.user_id;
                if (j3 != 0) {
                    if (!this.f31504h6) {
                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                        if (peer2 instanceof TLRPC.TL_peerUser) {
                            this.f31533ja = u12.c2(Long.valueOf(peer2.user_id));
                            return;
                        }
                    }
                    this.f31533ja = u12.c2(Long.valueOf(j3));
                } else if (peer.channel_id != 0) {
                    if (this.Q5.k4()) {
                        TLRPC.Peer peer3 = messageFwdHeader.from_id;
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            this.f31533ja = u12.c2(Long.valueOf(peer3.user_id));
                            return;
                        }
                    }
                    this.f31547ka = u12.O0(Long.valueOf(messageFwdHeader.saved_from_peer.channel_id));
                } else {
                    long j10 = peer.chat_id;
                    if (j10 != 0) {
                        TLRPC.Peer peer4 = messageFwdHeader.from_id;
                        if (peer4 instanceof TLRPC.TL_peerUser) {
                            this.f31533ja = u12.c2(Long.valueOf(peer4.user_id));
                        } else {
                            this.f31547ka = u12.O0(Long.valueOf(j10));
                        }
                    }
                }
            } else if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || fj.B0(this.Q5.f24073k) == e10)) {
                this.f31533ja = u12.c2(Long.valueOf(messageFwdHeader.from_id.user_id));
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || fj.B0(this.Q5.f24073k) == e10)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.f31533ja = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || fj.B0(this.Q5.f24073k) == e10)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.f31533ja = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long B0 = fj.B0(this.Q5.f24073k);
                long Z0 = this.Q5.Z0();
                TLRPC.Chat chat2 = null;
                if (org.telegram.messenger.n5.z(Z0)) {
                    chat = u12.O0(Long.valueOf(-Z0));
                } else {
                    chat = null;
                }
                if (org.telegram.messenger.n5.z(B0)) {
                    chat2 = u12.O0(Long.valueOf(-B0));
                }
                if (org.telegram.messenger.n5.C(fj.B0(this.Q5.f24073k))) {
                    if (this.Q5.P3()) {
                        this.f31533ja = i10.i(i7).f();
                        return;
                    }
                    TLRPC.EncryptedChat c12 = u12.c1(Integer.valueOf((int) (fj.B0(this.Q5.f24073k) & 4294967295L)));
                    if (c12 != null) {
                        this.f31533ja = u12.c2(Long.valueOf(c12.user_id));
                    }
                } else if (org.telegram.messenger.n5.E(Z0) && (!this.Q5.f24073k.post || (chat != null && chat.signature_profiles))) {
                    this.f31533ja = u12.c2(Long.valueOf(Z0));
                } else if (this.Q5.f24073k.post && chat2 != null && !chat2.signature_profiles) {
                    this.f31547ka = chat2;
                } else if (org.telegram.messenger.n5.z(Z0)) {
                    this.f31547ka = chat;
                } else {
                    TLRPC.Message message = this.Q5.f24073k;
                    if (message.post) {
                        this.f31547ka = u12.O0(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    public final boolean T(MotionEvent motionEvent) {
        boolean z10;
        int i7;
        int i10;
        boolean z11;
        int i11;
        fj fjVar;
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
        fj fjVar2;
        int i18 = this.Q5.D;
        if ((i18 == 0 || i18 == 24) && this.R1) {
            u1 E1 = E1();
            r1 r1Var = E1.f31951a;
            fj fjVar3 = r1Var.Q5;
            RadialProgress2 radialProgress2 = r1Var.Q0;
            n2.p0 p0Var = r1Var.f31674u4;
            fi.s2 s2Var = r1Var.U0;
            int[] iArr = r1Var.N2;
            Drawable[] drawableArr = r1Var.J2;
            int i19 = fjVar3.D;
            if ((i19 == 0 || i19 == 24) && r1Var.R1) {
                int x10 = (int) motionEvent.getX();
                int N1 = (int) r1Var.N1(motionEvent);
                int i20 = r1Var.f31601p0;
                if (x10 >= i20 && x10 <= (i20 + r1Var.f31426b7) - org.telegram.messenger.g0.L(14.0f) && N1 >= (i7 = r1Var.f31615q0)) {
                    int i21 = i7 + r1Var.W1;
                    if (r1Var.f31672u2) {
                        i10 = 46;
                    } else {
                        i10 = 0;
                    }
                    if (N1 <= org.telegram.messenger.g0.L(i10 + 8) + i21) {
                        if (motionEvent.getAction() == 0) {
                            if (r1Var.f31603p2 != null && N1 >= r1Var.Y1 && !r1Var.Q5.f24110t1) {
                                try {
                                    int L3 = x10 - ((r1Var.f31601p0 + org.telegram.messenger.g0.L(10.0f)) + r1Var.f31407a2);
                                    int i22 = N1 - r1Var.Y1;
                                    if (i22 <= r1Var.f31603p2.getHeight()) {
                                        int lineForVertical = r1Var.f31603p2.getLineForVertical(i22);
                                        float f10 = L3;
                                        int offsetForHorizontal = r1Var.f31603p2.getOffsetForHorizontal(lineForVertical, f10);
                                        float lineLeft = r1Var.f31603p2.getLineLeft(lineForVertical);
                                        if (lineLeft <= f10 && lineLeft + r1Var.f31603p2.getLineWidth(lineForVertical) >= f10) {
                                            if (r1Var.Q5.r4()) {
                                                charSequence = r1Var.Q5.v;
                                            } else {
                                                charSequence = r1Var.Q5.f24127y;
                                            }
                                            Spannable spannable = (Spannable) charSequence;
                                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                            if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[0] instanceof o41) || o41.h) && !org.telegram.messenger.g0.C1())) {
                                                k80 k80Var = r1Var.f31634r4;
                                                if (k80Var == null || k80Var.f36682i != clickableSpanArr[0]) {
                                                    p0Var.m(k80Var, true);
                                                    k80 k80Var2 = new k80(clickableSpanArr[0], r1Var.Qb, x10, N1, 0);
                                                    r1Var.f31634r4 = k80Var2;
                                                    if (r1Var.R1 && r1Var.f31595o8 != null && (fjVar2 = r1Var.Q5) != null && !fjVar2.P3()) {
                                                        w02 = org.telegram.ui.ActionBar.n6.r1(0.1f, r1Var.f31595o8.i());
                                                    } else {
                                                        if (r1Var.Q5.P3()) {
                                                            i17 = org.telegram.ui.ActionBar.n6.Dc;
                                                        } else {
                                                            i17 = org.telegram.ui.ActionBar.n6.Ce;
                                                        }
                                                        w02 = org.telegram.ui.ActionBar.n6.w0(i17, r1Var.Qb);
                                                    }
                                                    k80Var2.d(w02);
                                                    r1Var.f31725y0 = -10;
                                                    r1Var.f31688v4 = 2;
                                                    r1Var.v();
                                                    try {
                                                        e80 b10 = r1Var.f31634r4.b();
                                                        int[] X1 = X1(spannable, r1Var.f31634r4.f36682i);
                                                        b10.d(r1Var.f31603p2, X1[0], 0.0f);
                                                        r1Var.f31603p2.getSelectionPath(X1[0], X1[1], b10);
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                    }
                                                    p0Var.b(r1Var.f31634r4, 2);
                                                }
                                                r1Var.invalidate();
                                                return true;
                                            }
                                        }
                                    }
                                } catch (Exception e11) {
                                    org.telegram.messenger.a8.g(e11, true);
                                }
                            }
                            if (r1Var.f31634r4 == null) {
                                int L4 = org.telegram.messenger.g0.L(48.0f);
                                if (r1Var.X3 >= 0 && x10 >= (L2 = r1Var.K3 + (L = org.telegram.messenger.g0.L(27.0f))) && x10 <= L2 + L4 && N1 >= (i16 = r1Var.L3 + L) && N1 <= i16 + L4) {
                                    r1Var.R3 = 1;
                                    r1Var.invalidate();
                                    return true;
                                }
                                if (r1Var.f31738z1 && r1Var.O3 != -1 && x10 >= (i14 = r1Var.M3)) {
                                    if (x10 <= Math.max(r1Var.C3, r1Var.f31475f3) + org.telegram.messenger.g0.L(34.0f) + i14 && N1 >= (i15 = r1Var.N3) && N1 <= org.telegram.messenger.g0.L(30.0f) + i15) {
                                        r1Var.Q3 = 1;
                                        r1Var.invalidate();
                                        return true;
                                    }
                                }
                                if ((r1Var.O1 && r1Var.Q5.f24029a1 != null && s2Var.P(x10, N1)) || (r1Var.O1 && r1Var.f31726y1 && ((r1Var.O3 != -1 || r1Var.M1 == 4) && ((!r1Var.J3 && s2Var.P(x10, N1)) || (x10 >= (i12 = r1Var.K3) && x10 <= org.telegram.messenger.g0.L(48.0f) + i12 && N1 >= (i13 = r1Var.L3) && N1 <= org.telegram.messenger.g0.L(48.0f) + i13 && radialProgress2.f33158i.f33986q != 4))))) {
                                    r1Var.P3 = 1;
                                    r1Var.invalidate();
                                    TLRPC.MessageMedia messageMedia = r1Var.Q5.f24029a1;
                                    if (messageMedia == null) {
                                        return true;
                                    }
                                    if (!fj.s3(messageMedia.document, false) && r1Var.Q5.f24029a1.photo == null) {
                                        return true;
                                    }
                                    Drawable drawable = drawableArr[0];
                                    if (drawable != null && drawable.getBounds().contains(x10, N1)) {
                                        drawableArr[0].setHotspot(x10, N1);
                                        drawableArr[0].setState(iArr);
                                    }
                                    y yVar = E1.f31971x;
                                    if (yVar != null && yVar.getBounds().contains(x10, N1)) {
                                        E1.f31971x.setHotspot(x10, N1);
                                        E1.f31971x.setState(iArr);
                                    }
                                    r1Var.setInstantButtonPressed(true);
                                    lc lcVar = E1.f31970w;
                                    if (lcVar == null) {
                                        return true;
                                    }
                                    lcVar.c(true);
                                    return true;
                                }
                                r1Var.F2 = true;
                                r1Var.L2[0] = 0;
                                Drawable drawable2 = drawableArr[0];
                                if (drawable2 != null && drawable2.getBounds().contains(x10, N1)) {
                                    drawableArr[0].setHotspot(x10, N1);
                                    drawableArr[0].setState(iArr);
                                }
                                y yVar2 = E1.f31971x;
                                if (yVar2 != null && yVar2.getBounds().contains(x10, N1)) {
                                    E1.f31971x.setHotspot(x10, N1);
                                    E1.f31971x.setState(iArr);
                                }
                                r1Var.setInstantButtonPressed(true);
                                lc lcVar2 = E1.f31970w;
                                if (lcVar2 != null) {
                                    lcVar2.c(true);
                                }
                                r1Var.invalidate();
                                return true;
                            }
                        } else {
                            if (motionEvent.getAction() == 1) {
                                if (r1Var.F2) {
                                    int i23 = r1Var.M1;
                                    if (i23 == 7) {
                                        if (MediaController.B().I(r1Var.Q5) && !MediaController.B().H()) {
                                            MediaController.B().R(r1Var.Q5, true);
                                        } else {
                                            r1Var.Sa.T1(r1Var, r1Var.Q5);
                                        }
                                    } else if (!r1Var.f31672u2 && ((fjVar = r1Var.Q5) == null || (tL_channelAdminLogEvent = fjVar.L1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage))) {
                                        if (r1Var.O1 && (i23 == 2 || i23 == 4 || (E1.f31957i == null && r1Var.f31590o2 == null && r1Var.f31603p2 == null && r1Var.f31486g2 == null))) {
                                            m1 m1Var = r1Var.Sa;
                                            if (m1Var != null) {
                                                m1Var.C0(r1Var, r1Var.f31499h1, r1Var.f31512i1, true);
                                            }
                                        } else if (fjVar != null && !fjVar.f24110t1) {
                                            TLRPC.WebPage webPage = fj.n1(fjVar.f24073k).webpage;
                                            if (webPage != null && !TextUtils.isEmpty(webPage.embed_url)) {
                                                m1 m1Var2 = r1Var.Sa;
                                                if (m1Var2 != null) {
                                                    m1Var2.S1(r1Var.Q5, webPage.embed_url, webPage.site_name, webPage.title, webPage.url, webPage.embed_width, webPage.embed_height);
                                                }
                                            } else if (webPage != null) {
                                                m1 m1Var3 = r1Var.Sa;
                                                if (m1Var3 != null) {
                                                    m1Var3.Q1(r1Var, webPage, webPage.url, fj.n1(r1Var.Q5.f24073k).safe);
                                                } else {
                                                    vf.c.t(r1Var.getContext(), webPage.url);
                                                }
                                            }
                                        }
                                    } else {
                                        m1 m1Var4 = r1Var.Sa;
                                        if (m1Var4 != null) {
                                            m1Var4.p1(r1Var, r1Var.f31727y2);
                                        }
                                    }
                                    r1Var.playSoundEffect(0);
                                    Drawable drawable3 = drawableArr[0];
                                    if (drawable3 != null) {
                                        drawable3.setState(StateSet.NOTHING);
                                    }
                                    y yVar3 = E1.f31971x;
                                    if (yVar3 != null) {
                                        yVar3.setState(StateSet.NOTHING);
                                    }
                                    lc lcVar3 = E1.f31970w;
                                    if (lcVar3 != null) {
                                        lcVar3.c(false);
                                    }
                                    r1Var.F2 = false;
                                    r1Var.setInstantButtonPressed(false);
                                    r1Var.invalidate();
                                } else if (r1Var.f31688v4 != 2 && r1Var.P3 == 0 && r1Var.R3 == 0 && r1Var.Q3 == 0) {
                                    if (!r1Var.Bc) {
                                        z11 = false;
                                        r1Var.Bc = false;
                                        r1Var.h3(2);
                                        z10 = z11;
                                    }
                                } else {
                                    z11 = false;
                                    if (r1Var.Q3 == 1) {
                                        r1Var.Q3 = 0;
                                        r1Var.playSoundEffect(0);
                                        r1Var.E0(true);
                                        r1Var.invalidate();
                                    } else if (r1Var.P3 != 0) {
                                        r1Var.P3 = 0;
                                        r1Var.playSoundEffect(0);
                                        if (r1Var.f31738z1 || ((r1Var.O3 == -1 && r1Var.M1 == 4) || r1Var.Q5.f24029a1 != null)) {
                                            z11 = false;
                                            r1Var.D0();
                                        } else {
                                            z11 = false;
                                            r1Var.E0(false);
                                        }
                                        r1Var.invalidate();
                                    } else if (r1Var.R3 != 0) {
                                        r1Var.R3 = 0;
                                        r1Var.playSoundEffect(0);
                                        r1Var.F0();
                                        r1Var.invalidate();
                                    } else {
                                        k80 k80Var3 = r1Var.f31634r4;
                                        if (k80Var3 != null) {
                                            CharacterStyle characterStyle = k80Var3.f36682i;
                                            if (characterStyle instanceof URLSpan) {
                                                r1Var.Sa.a1(r1Var, characterStyle, false);
                                            } else if (characterStyle instanceof ClickableSpan) {
                                                ((ClickableSpan) characterStyle).onClick(r1Var);
                                            }
                                            r1Var.h3(2);
                                        } else {
                                            org.telegram.ui.Components.x5 x5Var = r1Var.f31619q4;
                                            if (x5Var != null && r1Var.Sa.v0(x5Var)) {
                                                r1Var.f31619q4 = null;
                                                r1Var.h3(2);
                                            } else {
                                                if (r1Var.M1 == 2 && r1Var.f31726y1) {
                                                    int i24 = r1Var.O3;
                                                    if (i24 == -1) {
                                                        int i25 = bz.f23270a;
                                                        if (pc.e(2048) && !r1Var.Q5.f24072j2) {
                                                            r1Var.Sa.C0(r1Var, r1Var.f31499h1, r1Var.f31512i1, false);
                                                        } else {
                                                            i11 = 2;
                                                            r1Var.O3 = 2;
                                                            r1Var.Q5.f24060h0 = 1.0f;
                                                            s2Var.f22762u0 = false;
                                                            s2Var.R0();
                                                            radialProgress2.setIcon(r1Var.getIconForCurrentState(), false, true);
                                                            r1Var.invalidate();
                                                            r1Var.playSoundEffect(0);
                                                            r1Var.h3(i11);
                                                            return true;
                                                        }
                                                    } else if (i24 == 2 || i24 == 0) {
                                                        r1Var.E0(false);
                                                        r1Var.playSoundEffect(0);
                                                    }
                                                } else {
                                                    fj fjVar4 = r1Var.Q5;
                                                    if (!fjVar4.f24110t1) {
                                                        TLRPC.WebPage webPage2 = fj.n1(fjVar4.f24073k).webpage;
                                                        if (webPage2 != null && !TextUtils.isEmpty(webPage2.embed_url)) {
                                                            r1Var.Sa.S1(r1Var.Q5, webPage2.embed_url, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_width, webPage2.embed_height);
                                                        } else {
                                                            int i26 = r1Var.O3;
                                                            if (i26 != -1 && i26 != 3) {
                                                                if (webPage2 != null) {
                                                                    m1 m1Var5 = r1Var.Sa;
                                                                    if (m1Var5 != null) {
                                                                        m1Var5.Q1(r1Var, webPage2, webPage2.url, fj.n1(r1Var.Q5.f24073k).safe);
                                                                    } else {
                                                                        vf.c.t(r1Var.getContext(), webPage2.url);
                                                                    }
                                                                }
                                                            } else {
                                                                r1Var.Sa.C0(r1Var, r1Var.f31499h1, r1Var.f31512i1, false);
                                                                r1Var.playSoundEffect(0);
                                                            }
                                                        }
                                                    }
                                                }
                                                i11 = 2;
                                                r1Var.h3(i11);
                                                return true;
                                            }
                                        }
                                    }
                                    z10 = z11;
                                }
                            } else {
                                z10 = false;
                                if (motionEvent.getAction() == 2 && r1Var.G2) {
                                    Drawable drawable4 = drawableArr[0];
                                    if (drawable4 != null) {
                                        drawable4.setHotspot(x10, N1);
                                    }
                                    y yVar4 = E1.f31971x;
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
        y1 y1Var = this.f31521ib;
        ch.q0 q0Var = this.O;
        if (z10) {
            if (!this.Q5.P3()) {
                gb0 gb0Var = org.telegram.ui.ActionBar.n6.E3;
                if (H3()) {
                    w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29586kd, this.Qb);
                } else {
                    if (z12) {
                        i7 = org.telegram.ui.ActionBar.n6.Fb;
                    } else {
                        i7 = org.telegram.ui.ActionBar.n6.f29586kd;
                    }
                    w02 = org.telegram.ui.ActionBar.n6.w0(i7, this.Qb);
                }
                gb0Var.a(w02);
                if (H3()) {
                    f16 = (getPhotoBottom() + this.f31699w0) - org.telegram.messenger.g0.L(9.0f);
                } else {
                    if (!this.G && !this.F) {
                        f15 = 8.5f;
                    } else {
                        f15 = 9.5f;
                    }
                    float L2 = (f10 - org.telegram.messenger.g0.L(f15)) + f12;
                    if (this.f31735yb && !u2()) {
                        if (this.K) {
                            f17 = 4.0f;
                        } else {
                            f17 = 5.0f;
                        }
                        f16 = L2 - ((1.0f - getVideoTranscriptionProgress()) * (q0Var.i(y1Var.L1) + org.telegram.messenger.g0.L(f17)));
                    } else {
                        f16 = L2;
                    }
                }
                if (!this.Q5.f24102r1) {
                    i10 = org.telegram.messenger.g0.L(11.0f);
                }
                z.u(gb0Var, f13 + i10, f16 - org.telegram.messenger.g0.L(12.0f));
                gb0Var.setAlpha((int) (f19 * 255.0f));
                if (z13) {
                    canvas.save();
                    canvas.scale(f18, f18, gb0Var.getBounds().centerX(), gb0Var.getBounds().centerY());
                }
                gb0Var.draw(canvas);
                gb0Var.setAlpha(255);
                invalidate();
                if (z13) {
                    canvas.restore();
                }
            }
        } else if (z11 && !this.Q5.P3()) {
            if (!this.Q5.f24102r1) {
                i10 = org.telegram.messenger.g0.L(11.0f);
            }
            float f20 = f13 + i10;
            float f21 = 21.5f;
            if (H3()) {
                L = (getPhotoBottom() + this.f31699w0) - org.telegram.messenger.g0.L(21.5f);
            } else {
                if (!this.G && !this.F) {
                    f21 = 20.5f;
                }
                L = (f10 - org.telegram.messenger.g0.L(f21)) + f12;
                if (this.f31735yb) {
                    L -= (1.0f - getVideoTranscriptionProgress()) * q0Var.i(y1Var.L1);
                }
            }
            RectF rectF = this.f31436c4;
            rectF.set(f20, L, org.telegram.messenger.g0.L(14.0f) + f20, org.telegram.messenger.g0.L(14.0f) + L);
            int alpha = org.telegram.ui.ActionBar.n6.f29410b2.getAlpha();
            int i11 = (int) (f19 * 255.0f);
            org.telegram.ui.ActionBar.n6.f29410b2.setAlpha(i11);
            if (z13) {
                canvas.save();
                canvas.scale(f18, f18, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.f29410b2);
            org.telegram.ui.ActionBar.n6.f29410b2.setAlpha(alpha);
            Drawable Z1 = Z1("drawableMsgError");
            z.u(Z1, f20 + org.telegram.messenger.g0.L(6.0f), L + org.telegram.messenger.g0.L(2.0f));
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
        fj fjVar = this.Q5;
        if (fjVar != null && fjVar.D == 17) {
            if (i7 == -2) {
                x1 x1Var = this.f31714x2;
                if (x1Var != null && (eVar2 = x1Var.f32393m) != null) {
                    return eVar2.f57556b;
                }
                return null;
            } else if (i7 == -3) {
                x1 x1Var2 = this.f31714x2;
                if (x1Var2 != null && (eVar = x1Var2.f32394n) != null) {
                    return eVar.f57556b;
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
                        q1 q1Var = (q1) obj;
                        uh.b bVar = q1Var.f31372x;
                        if (bVar != null && (pollAnswer = q1Var.f31368s) != null && pollAnswer.unshuffled_index == i7) {
                            return bVar.f59102c;
                        }
                    }
                }
            }
        }
        m4 m4Var = this.X5;
        if (m4Var != null) {
            ArrayList arrayList2 = m4Var.f31131c;
            k4 k4Var = m4Var.f31130b;
            if (k4Var != null && i7 >= 0 && i7 < k4Var.f31007a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) m4Var.f31130b.f31007a.get(i7);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (((l4) arrayList2.get(i11)).F == messageExtendedMedia) {
                        return ((l4) arrayList2.get(i11)).f31080f;
                    }
                }
                return null;
            }
            return null;
        }
        return this.U0;
    }

    public final void T2(int i7, int i10) {
        xi xiVar = this.M;
        float f10 = xiVar.f28011r;
        float f11 = xiVar.f28013t;
        this.f31643rd = f10 - f11;
        this.f31656sd = f11;
        this.f31669td = (int) xiVar.f28012s;
        this.f31683ud = (int) ((i7 * xiVar.f28014u) / (i10 / 1000.0f));
    }

    public final void T3() {
        Window window;
        if (this.f31585nb == null) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W == null) {
                window = null;
            } else {
                window = W.getWindow();
            }
            if (window != null) {
                org.telegram.messenger.n6 n6Var = new org.telegram.messenger.n6(window, new ea(this, 3));
                this.f31585nb = n6Var;
                if (this.O0) {
                    n6Var.a();
                }
            }
        }
        org.telegram.messenger.n6 n6Var2 = this.f31585nb;
        if (n6Var2 != null) {
            n6Var2.g();
        }
    }

    public final boolean U() {
        return org.telegram.messenger.w7.G(this.f31411a6).k(getFilename());
    }

    public final void U0(Canvas canvas, float f10) {
        int i7;
        if (this.F8 == 3) {
            int L = org.telegram.messenger.g0.L(32.0f);
            if (this.f31581n7 != null) {
                this.S8 -= org.telegram.messenger.g0.L(18.0f);
                L += org.telegram.messenger.g0.L(18.0f);
            }
            float f11 = this.R8;
            float f12 = this.S8 + L;
            RectF rectF = this.f31436c4;
            rectF.set(f11, this.S8, org.telegram.messenger.g0.L(32.0f) + f11, f12);
            z();
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
                    int alpha2 = org.telegram.ui.ActionBar.n6.f29521h2.getAlpha();
                    org.telegram.ui.ActionBar.n6.f29521h2.setAlpha((int) (alpha2 * f10));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.n6.f29521h2);
                    org.telegram.ui.ActionBar.n6.f29521h2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.n6.f29521h2);
                }
            }
            Drawable R0 = org.telegram.ui.ActionBar.n6.R0("drawableCommentSticker");
            if (u2()) {
                if (this.Kc == null) {
                    this.Kc = R0.getConstantState().newDrawable().mutate();
                }
                this.Kc.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ta, this.Qb), PorterDuff.Mode.SRC_IN));
                R0 = this.Kc;
            }
            z.u(R0, this.R8 + org.telegram.messenger.g0.L(4.0f), this.S8 + org.telegram.messenger.g0.L(4.0f));
            if (i10 != 0) {
                R0.setAlpha((int) (f10 * 255.0f));
                R0.draw(canvas);
                R0.setAlpha(255);
            } else {
                R0.draw(canvas);
            }
            if (this.f31581n7 != null) {
                TextPaint textPaint = org.telegram.ui.ActionBar.n6.E2;
                if (u2()) {
                    i7 = org.telegram.ui.ActionBar.n6.Ta;
                } else {
                    i7 = org.telegram.ui.ActionBar.n6.Od;
                }
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(i7, this.Qb));
                org.telegram.ui.ActionBar.n6.E2.setAlpha((int) (f10 * 255.0f));
                y1 y1Var = this.f31521ib;
                if (y1Var.V) {
                    if (y1Var.W != null) {
                        canvas.save();
                        org.telegram.ui.ActionBar.n6.E2.setAlpha((int) ((1.0d - y1Var.L1) * 255.0d * f10));
                        canvas.translate(this.R8 + ((org.telegram.messenger.g0.L(32.0f) - y1Var.Y) / 2), this.S8 + org.telegram.messenger.g0.L(30.0f));
                        y1Var.W.draw(canvas);
                        canvas.restore();
                    }
                    org.telegram.ui.ActionBar.n6.E2.setAlpha((int) (y1Var.L1 * 255.0f));
                }
                canvas.save();
                canvas.translate(this.R8 + ((org.telegram.messenger.g0.L(32.0f) - this.f31691v7) / 2), this.S8 + org.telegram.messenger.g0.L(30.0f));
                this.f31581n7.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final float U1(int i7) {
        q1 q1Var;
        if (i7 >= 0) {
            ArrayList arrayList = this.Q4;
            if (i7 < arrayList.size()) {
                int i10 = ((q1) arrayList.get(i7)).f31353b;
                int i11 = this.Ua;
                float f10 = i10 + i11;
                y1 y1Var = this.f31521ib;
                if (y1Var.f32531u2) {
                    float f11 = y1Var.L1;
                    f10 += ((1.0f - f11) * y1Var.f32534v2) + (i11 * f11);
                    if (this.Q5.n5()) {
                        f10 -= this.Ua;
                    }
                }
                if (y1Var.f32540x0) {
                    f10 += y1Var.f32489k0;
                }
                return f10 + q1Var.f31354c + org.telegram.messenger.g0.L(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final int U2(int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.U2(int):int");
    }

    public final void U3() {
        boolean z10;
        String k02;
        double d;
        double d2;
        double d10;
        sh.e eVar;
        sh.e eVar2;
        fj fjVar = this.Q5;
        if (fjVar != null) {
            k1 k1Var = this.Pb;
            if (k1Var != null && k1Var.rewindCount != 0 && k1Var.rewindByBackSeek) {
                fjVar.f24033b0 = k1Var.getVideoProgress();
            }
            boolean z11 = true;
            if (this.Q5.T3()) {
                x1 x1Var = this.f31714x2;
                if (x1Var != null && (eVar2 = x1Var.f32393m) != null) {
                    eVar2.p(true);
                }
                x1 x1Var2 = this.f31714x2;
                if (x1Var2 != null && (eVar = x1Var2.f32394n) != null) {
                    eVar.p(true);
                }
            }
            int i7 = this.M1;
            double d11 = 0.0d;
            int i10 = 0;
            j1 j1Var = this.D4;
            if (i7 == 4) {
                if (j1Var != null) {
                    j1Var.a();
                }
                if (this.f31715x3 != null) {
                    if (!PhotoViewer.I1(this.Q5)) {
                        if (MediaController.B().f22841w0 == this.Q5) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.b6 m10 = this.U0.m();
                if (m10 != null) {
                    fj fjVar2 = this.Q5;
                    int i11 = m10.d[4] / 1000;
                    fjVar2.f24070j0 = i11;
                    d10 = i11;
                    TLRPC.Message message = fjVar2.f24073k;
                    if (message.ttl > 0 && message.destroyTime == 0 && !fjVar2.m5() && fj.L4(this.Q5.f24073k) && m10.s()) {
                        this.Sa.W(this.Q5);
                    }
                } else {
                    d10 = 0.0d;
                }
                if (d10 == 0.0d) {
                    d10 = this.Q5.L0();
                }
                if (MediaController.B().I(this.Q5)) {
                    d10 -= this.Q5.f24033b0 * d10;
                } else if (m10 != null) {
                    if (d10 != 0.0d) {
                        d10 -= m10.o() / 1000;
                    }
                    if (this.Sa != null && m10.o() >= 3000) {
                        this.Sa.H0();
                    }
                }
                if (this.M4 != d10) {
                    String g02 = org.telegram.messenger.g0.g0((int) d10, false, false);
                    this.C3 = (int) Math.ceil(org.telegram.ui.ActionBar.n6.C2.measureText(g02));
                    this.f31715x3 = new StaticLayout(g02, org.telegram.ui.ActionBar.n6.C2, this.C3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.M4 = d10;
                    return;
                }
                return;
            }
            boolean z12 = this.f31735yb;
            dn0 dn0Var = this.E4;
            if (z12) {
                if (this.C4) {
                    if (!dn0Var.f34399f) {
                        dn0Var.g(true, this.Q5.f24033b0);
                    }
                } else {
                    if (!j1Var.f42105e) {
                        j1Var.h(this.Q5.f24033b0);
                        j1Var.f42116q = this.Q5.f24056g0;
                    }
                    j1Var.a();
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
                long j3 = this.f31613pc;
                if (j3 >= 0) {
                    d2 = j3;
                } else if (MediaController.B().I(this.Q5)) {
                    d2 = Math.max(0.0d, d2 - this.Q5.f24065i0);
                }
                if (this.M4 != d2) {
                    this.M4 = d2;
                    String g03 = org.telegram.messenger.g0.g0((int) d2, true, false);
                    this.N4 = (int) Math.ceil(org.telegram.ui.ActionBar.n6.T2.measureText(g03));
                    this.L4 = new StaticLayout(g03, org.telegram.ui.ActionBar.n6.T2, this.N4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float f10 = this.Q5.f24033b0;
                if (f10 != 0.0f) {
                    this.Kb = f10;
                    if (f10 > 0.9f) {
                        this.Kb = 1.0f;
                    }
                }
                invalidate();
            } else if (this.N1 != null) {
                if (this.C4) {
                    if (!dn0Var.f34399f) {
                        dn0Var.g(true, this.Q5.f24033b0);
                    }
                    z10 = true;
                } else {
                    if (!j1Var.f42105e) {
                        j1Var.h(this.Q5.f24033b0);
                        j1Var.f42116q = this.Q5.f24056g0;
                    }
                    j1Var.j(this.Q5);
                    z10 = false;
                }
                int i13 = this.M1;
                if (i13 == 5) {
                    z10 = true;
                }
                if (i13 == 3) {
                    long j10 = this.f31613pc;
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
                        d = this.Q5.f24065i0;
                    }
                    if (this.M4 != d) {
                        this.M4 = d;
                        String g04 = org.telegram.messenger.g0.g0((int) d, true, false);
                        this.N4 = (int) Math.ceil(org.telegram.ui.ActionBar.n6.N2.measureText(g04));
                        this.L4 = new StaticLayout(g04, org.telegram.ui.ActionBar.n6.N2, this.N4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                } else {
                    double L0 = this.Q5.L0();
                    if (MediaController.B().I(this.Q5)) {
                        i10 = this.Q5.f24065i0;
                    }
                    double d12 = i10;
                    if (this.M4 != d12) {
                        this.M4 = d12;
                        this.L4 = new StaticLayout(org.telegram.messenger.g0.k0(i10, (int) L0), org.telegram.ui.ActionBar.n6.N2, (int) Math.ceil(org.telegram.ui.ActionBar.n6.N2.measureText(k02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                    z11 = z10;
                }
                if (z11) {
                    invalidate();
                }
            }
        }
    }

    public final boolean V(MotionEvent motionEvent) {
        y yVar;
        r1 r1Var;
        m1 m1Var;
        TLRPC.Chat chat;
        int i7;
        TLRPC.Chat chat2;
        if (this.f31546k9 && this.V8 != null && (yVar = this.V2) != null && (this.f31533ja != null || this.f31547ka != null)) {
            boolean contains = yVar.getBounds().contains((int) motionEvent.getX(), (int) N1(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.W2 = contains;
                if (contains) {
                    this.V2.setHotspot((int) motionEvent.getX(), (int) N1(motionEvent));
                    this.V2.setState(this.N2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.W2 && (m1Var = this.Sa) != null) {
                    if (this.S6) {
                        TLRPC.User user = this.f31666ta;
                        if (user != null && user.bot_inline_placeholder == null) {
                            m1Var.l2(this, user.f28641id);
                        } else {
                            String o4 = n10.o(user);
                            m1 m1Var2 = this.Sa;
                            if (o4 == null) {
                                o4 = this.Q5.f24073k.via_bot_name;
                            }
                            m1Var2.t0(o4);
                        }
                    } else {
                        TLRPC.User user2 = this.f31533ja;
                        if (user2 != null) {
                            m1Var.A0(this, user2, motionEvent.getX(), N1(motionEvent));
                        } else {
                            TLRPC.Chat chat3 = this.f31547ka;
                            if (chat3 != null) {
                                TLRPC.MessageFwdHeader messageFwdHeader = this.Q5.f24073k.fwd_from;
                                if (messageFwdHeader != null) {
                                    int i10 = messageFwdHeader.channel_post;
                                    chat = this.f31680ua;
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
                                r1Var = this;
                                m1Var.c0(r1Var, chat2, i7, this.f31499h1, this.f31512i1, false);
                                r1Var.V2.setState(StateSet.NOTHING);
                                r1Var.W2 = false;
                                return r1Var.W2;
                            }
                        }
                    }
                }
                r1Var = this;
                r1Var.V2.setState(StateSet.NOTHING);
                r1Var.W2 = false;
                return r1Var.W2;
            }
            r1Var = this;
            return r1Var.W2;
        }
        this.W2 = false;
        return false;
    }

    public final void V0(android.graphics.Canvas r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.V0(android.graphics.Canvas, float):void");
    }

    public final float V1(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.Q4;
            if (i7 < arrayList.size()) {
                int i10 = ((q1) arrayList.get(i7)).f31353b;
                int i11 = this.Ua;
                float f10 = i10 + i11;
                y1 y1Var = this.f31521ib;
                if (y1Var.f32531u2) {
                    float f11 = y1Var.L1;
                    f10 += ((1.0f - f11) * y1Var.f32534v2) + (i11 * f11);
                    if (this.Q5.n5()) {
                        f10 -= this.Ua;
                    }
                }
                if (y1Var.f32540x0) {
                    f10 += y1Var.f32489k0;
                }
                return f10 - org.telegram.messenger.g0.L(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void V2(boolean z10) {
        int currentBackgroundLeft;
        float f10;
        int L;
        int i7;
        float f11;
        int L2;
        int currentBackgroundLeft2;
        boolean P3 = this.Q5.P3();
        int i10 = 0;
        y1 y1Var = this.f31521ib;
        if (P3) {
            if (z10) {
                currentBackgroundLeft2 = (int) (this.N6 + y1Var.f32475h0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            this.f31588o0 = getExtraTextX() + org.telegram.messenger.g0.L(11.0f) + currentBackgroundLeft2;
        } else {
            if (z10) {
                currentBackgroundLeft = (int) (this.N6 + y1Var.f32475h0);
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
            this.f31588o0 = getExtraTextX() + currentBackgroundLeft + L;
        }
        float f12 = 4.0f;
        if (this.T1) {
            this.f31588o0 = org.telegram.messenger.g0.L(11.0f) + this.f31588o0;
            int L3 = org.telegram.messenger.g0.L(14.0f) + this.Ua;
            this.f31670u0 = L3;
            StaticLayout staticLayout = this.f31486g2;
            if (staticLayout != null) {
                this.f31670u0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + L3;
            }
        } else if (this.U1) {
            int L4 = org.telegram.messenger.g0.L(14.0f) + this.Ua;
            this.f31670u0 = L4;
            StaticLayout staticLayout2 = this.f31486g2;
            if (staticLayout2 != null) {
                this.f31670u0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L4;
            }
        } else if (this.Q5.D == 19) {
            this.f31670u0 = org.telegram.messenger.g0.L(6.0f) + this.Ua;
            if (!this.Q5.N3()) {
                this.f31588o0 = getCurrentBackgroundLeft();
            } else {
                this.f31588o0 -= org.telegram.messenger.g0.L(4.0f);
            }
        } else {
            int L5 = org.telegram.messenger.g0.L(8.0f) + this.Ua;
            this.f31670u0 = L5;
            fj fjVar = this.Q5;
            float f13 = 2.0f;
            if (fjVar.D == 36) {
                if (this.f31700w1 && this.f31565m3 != null && R2()) {
                    this.f31670u0 = org.telegram.messenger.f3.C(7.0f, this.f31565m3.b(), this.f31670u0);
                } else {
                    ev evVar = this.Q5.f24130y2;
                    if (evVar != null && evVar.Y()) {
                        int i11 = this.f31670u0;
                        if (this.Ua <= 0) {
                            f13 = -3.0f;
                        }
                        this.f31670u0 = org.telegram.messenger.g0.L(f13) + i11;
                    }
                }
            } else {
                if (fjVar.E2 && (i7 = bz.Y0) > 10) {
                    if (i7 < 15) {
                        f13 = 1.0f;
                    }
                    this.f31670u0 = org.telegram.messenger.g0.L(f13) + L5;
                }
                if (this.Q5.E2 && this.Ua > 0) {
                    this.f31670u0 = org.telegram.messenger.g0.L(5.0f) + this.f31670u0;
                }
            }
        }
        if (this.Q5.r4()) {
            this.f31615q0 = org.telegram.messenger.g0.L(14.0f) + this.f31670u0;
        } else if (this.f31685v1) {
            this.f31615q0 = org.telegram.messenger.g0.L(10.0f) + this.f31670u0;
            this.f31670u0 = org.telegram.messenger.f3.C(13.0f, this.W1, this.f31670u0);
            if (this.f31672u2 && !this.U1 && !this.Q5.v3()) {
                this.f31670u0 = org.telegram.messenger.g0.L(44.0f) + this.f31670u0;
            }
        } else {
            this.f31615q0 = org.telegram.messenger.g0.L(10.0f) + this.Q5.W5(y1Var) + this.f31670u0;
        }
        if (this.f31685v1) {
            L2 = org.telegram.messenger.g0.L(10.0f) + this.Q5.W5(y1Var) + this.f31670u0;
        } else {
            int i12 = this.f31615q0 + this.W1;
            if (this.f31672u2) {
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
        this.f31630r0 = L2;
        this.f31601p0 = this.f31588o0;
        if (this.Q5.f24126x2 != 0.0f && this.Q7 != null) {
            int L7 = this.f31426b7 - org.telegram.messenger.g0.L(31.0f);
            fj fjVar2 = this.Q5;
            int i13 = L7 - fjVar2.f24118v2;
            if (!this.f31439c7) {
                int i14 = this.A9;
                if (fjVar2.P3()) {
                    i10 = 20;
                }
                i13 = m10.x(i10 + 4, i14, i13);
            }
            if (i13 > 0) {
                this.f31588o0 = (i13 - getExtraTimeX()) + this.f31588o0;
            }
        }
    }

    public final void V3() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.S0) {
            return;
        }
        boolean z13 = true;
        if ((!this.f31718x6 && !this.f31705w6 && !isPressed()) || (this.O1 && this.U0.J())) {
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

    public final boolean W(MotionEvent motionEvent) {
        m1 m1Var;
        TLRPC.User user;
        TLRPC.Document document;
        if (this.f31546k9 && this.V8 != null && this.V2 != null && ((this.f31533ja != null || this.f31547ka != null) && this.f31584na != null && this.f31625qa != null)) {
            boolean contains = this.f31422b3.getBounds().contains((int) motionEvent.getX(), (int) N1(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.f31435c3 = contains;
                if (contains) {
                    this.f31422b3.setHotspot((int) motionEvent.getX(), (int) N1(motionEvent));
                    this.f31422b3.setState(this.N2);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.f31435c3 && (m1Var = this.Sa) != null && (user = this.f31533ja) != null) {
                    Drawable drawable = this.f31625qa.f37376f[0];
                    if (drawable instanceof org.telegram.ui.Components.o5) {
                        document = ((org.telegram.ui.Components.o5) drawable).f38023e;
                    } else {
                        document = null;
                    }
                    m1Var.Z1(this, user, document, this.f31611pa);
                    q2();
                }
                this.f31422b3.setState(StateSet.NOTHING);
                this.f31435c3 = false;
            }
            return this.f31435c3;
        }
        this.f31435c3 = false;
        return false;
    }

    public final void W0(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.W0(android.graphics.Canvas):void");
    }

    public final int W1(byte[] bArr) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q4;
            if (i7 < arrayList.size()) {
                TLRPC.PollAnswer pollAnswer = ((q1) arrayList.get(i7)).f31368s;
                if (pollAnswer != null && Arrays.equals(pollAnswer.option, bArr)) {
                    return i7;
                }
                i7++;
            } else {
                return -1;
            }
        }
    }

    public final void W3() {
        fj fjVar;
        int i7;
        float f10;
        int i10;
        float f11;
        int i11;
        if (!this.Q5.O5()) {
            return;
        }
        ch.q0 q0Var = this.O;
        if (!q0Var.f5487p) {
            xi xiVar = this.M;
            if (xiVar != null) {
                int i12 = xiVar.f28005l;
                if ((i12 & 8) == 0 || (i12 & 1) == 0) {
                    return;
                }
            }
            fj fjVar2 = this.Q5;
            int i13 = 0;
            if (fjVar2.D != 19 && !fjVar2.G2() && !this.Q5.M2()) {
                float f12 = 11.0f;
                if (this.Q5.P3()) {
                    q0Var.f5475b = org.telegram.messenger.g0.L(11.0f) + getCurrentBackgroundLeft();
                } else if (this.f31735yb) {
                    int L = org.telegram.messenger.g0.L(11.0f) + getCurrentBackgroundLeft();
                    if (!this.K) {
                        i11 = 6;
                    } else {
                        i11 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(getVideoTranscriptionProgress(), 0, i11)) + L;
                    q0Var.f5475b = L2;
                    q0Var.f5475b = L2 - ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(9.0f)));
                } else {
                    int L3 = org.telegram.messenger.g0.L((this.C6 || !this.K) ? 17.0f : 17.0f) + getCurrentBackgroundLeft();
                    q0Var.f5475b = L3;
                    if (this.C6) {
                        q0Var.f5475b = L3 - org.telegram.messenger.g0.L(9.0f);
                    }
                }
            } else if (this.Q5.P3()) {
                q0Var.f5475b = (getMeasuredWidth() - q0Var.f5486o) - org.telegram.messenger.g0.L(16.0f);
            } else {
                q0Var.f5475b = getCurrentBackgroundLeft();
            }
            if (u2()) {
                float compactLeft = getCompactLeft();
                if (t2()) {
                    f11 = this.f31656sd;
                } else if (this.L != null && this.M != null) {
                    f11 = getLeft();
                } else {
                    f11 = 0.0f;
                }
                q0Var.f5475b = (int) (compactLeft - f11);
            }
            if (!this.Q5.P3() && this.M != null && !u2()) {
                float f13 = q0Var.f5475b;
                if (b3()) {
                    i10 = 48;
                } else {
                    i10 = 0;
                }
                q0Var.f5475b = (int) (f13 - (org.telegram.messenger.g0.L(64 - i10) * this.Z6));
            }
            int backgroundDrawableBottom = (getBackgroundDrawableBottom() - org.telegram.messenger.g0.L(10.0f)) - q0Var.f5484m;
            q0Var.f5476c = backgroundDrawableBottom;
            if (this.f31719x7) {
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
            q0Var.f5476c = i14;
            if (this.f31439c7 && (!this.s9 || !this.R1 || this.M1 != 3)) {
                q0Var.f5476c = i14 - org.telegram.messenger.g0.L(16.0f);
            }
            if (this.Q5.D != 9 && !R2() && this.f31565m3 != null && (((i7 = (fjVar = this.Q5).D) != 2 && i7 != 17 && (!fjVar.N3() || !this.s9 || this.O1)) || ((this.M != null && this.L != null) || this.Q5.D == 29))) {
                q0Var.f5476c -= org.telegram.messenger.g0.L(14.0f);
            }
            q0Var.f5476c += q0Var.f5482k;
        }
    }

    public final boolean X(org.telegram.messenger.fj r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.X(org.telegram.messenger.fj):boolean");
    }

    public final void X0(Canvas canvas) {
        float f10;
        r1 r1Var;
        Canvas canvas2;
        if (this.f31535jc || this.f31548kc) {
            xi xiVar = this.M;
            if (xiVar == null || (xiVar.f27998c == 0 && xiVar.f27996a == 0)) {
                int compactHeaderColor = getCompactHeaderColor();
                f31403xd.setColor(compactHeaderColor);
                f31404yd.setColor(compactHeaderColor);
                float compactLeft = getCompactLeft();
                if (this.J) {
                    f10 = 9.0f;
                } else {
                    f10 = 10.0f;
                }
                float L = org.telegram.messenger.g0.L(f10);
                if (this.f31535jc) {
                    r1Var = this;
                    canvas2 = canvas;
                    r1Var.Z0(canvas2, this.f31509hc, compactLeft, L, compactHeaderColor);
                    L += org.telegram.messenger.g0.L(24.0f);
                } else {
                    r1Var = this;
                    canvas2 = canvas;
                }
                if (r1Var.f31548kc) {
                    r1Var.Z0(canvas2, r1Var.f31522ic, compactLeft, L, compactHeaderColor);
                }
            }
        }
    }

    public final void X3(fj fjVar) {
        String str;
        CharSequence concat;
        int i7;
        if (fjVar != null && fjVar.m5()) {
            int i10 = 0;
            if (!fjVar.l4()) {
                concat = null;
            } else {
                TLRPC.Message message = fjVar.f24073k;
                int i11 = message.ttl;
                if (i11 == Integer.MAX_VALUE) {
                    if (fjVar.Y2 == null) {
                        fjVar.Y2 = new SpannableString("v");
                        kq kqVar = new kq(2131231983, 0);
                        kqVar.f36853r = -org.telegram.messenger.g0.L(3.0f);
                        kqVar.F = org.telegram.messenger.g0.L(13.0f);
                        SpannableString spannableString = fjVar.Y2;
                        spannableString.setSpan(kqVar, 0, spannableString.length(), 33);
                    }
                    concat = TextUtils.concat(fjVar.Y2, "1");
                } else {
                    int i12 = message.destroyTime;
                    if (i12 != 0) {
                        i11 = Math.max(0, i12 - ConnectionsManager.getInstance(fjVar.K1).getCurrentTime());
                    }
                    if (i11 < 60) {
                        str = com.google.android.gms.internal.vision.e2.i(i11, "s");
                    } else {
                        str = (i11 / 60) + "m";
                    }
                    if (fjVar.Z2 == null) {
                        fjVar.Z2 = new SpannableString("p");
                        kq kqVar2 = new kq(2131232554, 0);
                        kqVar2.f36853r = org.telegram.messenger.g0.L(1.0f);
                        kqVar2.F = org.telegram.messenger.g0.L(13.0f);
                        SpannableString spannableString2 = fjVar.Z2;
                        spannableString2.setSpan(kqVar2, 0, spannableString2.length(), 33);
                    }
                    concat = TextUtils.concat(fjVar.Z2, str);
                }
            }
            CharSequence charSequence = concat;
            if (charSequence != null) {
                if (charSequence instanceof String) {
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.n6.C2.measureText((String) charSequence));
                    this.C3 = ceil;
                    this.f31715x3 = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.n6.C2, ceil, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.n6.C2, this.C3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else {
                    TextPaint textPaint = org.telegram.ui.ActionBar.n6.D2;
                    if (getMeasuredWidth() > 0) {
                        i7 = getMeasuredWidth();
                    } else {
                        i7 = 9999;
                    }
                    StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.f31715x3 = staticLayout;
                    if (staticLayout.getLineCount() > 0) {
                        i10 = (int) this.f31715x3.getLineWidth(0);
                    }
                    this.C3 = i10;
                }
                invalidate();
            }
        }
    }

    public final boolean Y(MotionEvent motionEvent) {
        int i7;
        xi xiVar;
        boolean z10;
        Drawable drawable;
        Drawable drawable2;
        int L;
        int i10;
        int L2;
        int i11;
        if ((!w2() || this.Q5.D == 16) && (((i7 = this.M1) != 5 && i7 != 1) || (xiVar = this.M) == null || (xiVar.f28005l & 4) != 0)) {
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
                    fj fjVar = this.Q5;
                    if (fjVar.D == 16) {
                        boolean J4 = fjVar.J4();
                        int i13 = this.S3;
                        if (x10 >= i13) {
                            if (gd.f24314a0) {
                                L = 0;
                            } else {
                                L = this.f31426b7 - org.telegram.messenger.g0.L(70.0f);
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
                                        if (gd.f24314a0) {
                                            L2 = 0;
                                        } else {
                                            L2 = this.f31426b7 - org.telegram.messenger.g0.L(70.0f);
                                        }
                                        int i16 = i15 + L2;
                                        if (!J4) {
                                            i11 = 2;
                                        } else {
                                            i11 = 0;
                                        }
                                        int L3 = org.telegram.messenger.g0.L(i11) + i16;
                                        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.n6.G4;
                                        int y10 = c0.y(2, L3, drawableArr2[J4 ? 1 : 0]);
                                        int j3 = c0.j(2, this.T3, drawableArr2[J4 ? 1 : 0]);
                                        drawableArr[0].setBounds(y10 - org.telegram.messenger.g0.L(20.0f), j3 - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f) + y10, org.telegram.messenger.g0.L(20.0f) + j3);
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
                        this.Sa.J0(this, this.S3, this.T3);
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
        return org.telegram.ui.ActionBar.n6.w0(i7, this.Qb);
    }

    public xh.e Y2() {
        return xh.e.e(this);
    }

    public final void Y3() {
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
        y1 y1Var = this.f31521ib;
        boolean z10 = y1Var.f32540x0;
        j1 j1Var = this.D4;
        dn0 dn0Var = this.E4;
        float f11 = 10.0f;
        if (z10 && ((i14 = this.M1) == 3 || i14 == 7)) {
            int i20 = this.f31426b7;
            float f12 = i20;
            int i21 = (int) ((f12 - y1Var.f32494l0) + y1Var.m0);
            int i22 = (int) ((f12 - y1Var.f32475h0) + y1Var.f32480i0);
            if (this.f31735yb && !this.I6) {
                i22 = (int) ((getVideoTranscriptionProgress() * org.telegram.messenger.g0.L(8.0f)) + i22);
                i21 += org.telegram.messenger.g0.L(8.0f);
            }
            if (y1Var.f32494l0 == 0.0f && y1Var.m0 == 0.0f) {
                i21 = i22;
            }
            if (dn0Var != null) {
                if (y1Var.f32506o1) {
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
                    dn0Var.h(L2, L3, i24, i25 + i18);
                } else {
                    int L4 = (i22 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.R1) {
                        f11 = 0.0f;
                    }
                    dn0Var.h(L4 - org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(30.0f), (i20 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress())), (i21 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            if (j1Var != null) {
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
                j1Var.i(useTranscribeButtonProgress - org.telegram.messenger.g0.L(i15 + i16), org.telegram.messenger.g0.L(30.0f));
                return;
            }
            return;
        }
        if (dn0Var != null) {
            if (y1Var.f32506o1) {
                int L5 = (this.f31426b7 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress()));
                if (this.R1) {
                    f10 = 10.0f;
                } else {
                    f10 = 0.0f;
                }
                int L6 = L5 - org.telegram.messenger.g0.L(f10);
                int L7 = org.telegram.messenger.g0.L(30.0f);
                int i26 = this.f31426b7 + i19;
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
                int i28 = this.f31426b7 + i19;
                if (this.I4) {
                    i13 = -org.telegram.messenger.g0.L(34.0f);
                } else {
                    i13 = 0;
                }
                dn0Var.h(L6, L7, L8, i28 + i13);
            } else {
                int L9 = (this.f31426b7 + i19) - ((int) (org.telegram.messenger.g0.L(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.R1) {
                    f11 = 0.0f;
                }
                int L10 = L9 - org.telegram.messenger.g0.L(f11);
                dn0Var.h(L10, org.telegram.messenger.g0.L(30.0f), L10, L10);
            }
        }
        if (j1Var != null) {
            int useTranscribeButtonProgress2 = this.f31426b7 - ((int) (getUseTranscribeButtonProgress() * org.telegram.messenger.g0.L(34.0f)));
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
            j1Var.i(useTranscribeButtonProgress2 - org.telegram.messenger.g0.L(i10 + i11), org.telegram.messenger.g0.L(30.0f));
        }
    }

    public final boolean Z(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.Z(android.view.MotionEvent):boolean");
    }

    public final void Z0(Canvas canvas, n1 n1Var, float f10, float f11, int i7) {
        int i10;
        int intrinsicWidth;
        int intrinsicHeight;
        boolean z10;
        int L = org.telegram.messenger.g0.L(16.0f);
        RectF rectF = n1Var.d;
        ImageReceiver imageReceiver = n1Var.f31199b;
        boolean z11 = n1Var.f31198a;
        float f12 = L;
        rectF.set(f10, f11, n1Var.f31205j + f10, f11 + f12);
        canvas.save();
        float a10 = n1Var.f31201e.a(0.02f);
        RectF rectF2 = n1Var.d;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.15f, i7);
        y yVar = n1Var.f31206k;
        if (yVar == null) {
            n1Var.f31207l = r12;
            y a02 = org.telegram.ui.ActionBar.n6.a0(r12, 6, 6);
            n1Var.f31206k = a02;
            a02.setCallback(this);
        } else if (n1Var.f31207l != r12) {
            n1Var.f31207l = r12;
            org.telegram.ui.ActionBar.n6.H1(yVar, r12, true);
        }
        n1Var.f31206k.setBounds((int) (rectF2.left - org.telegram.messenger.g0.L(6.0f)), (int) (rectF2.top - org.telegram.messenger.g0.L(4.0f)), (int) (rectF2.right + org.telegram.messenger.g0.L(6.0f)), (int) (rectF2.bottom + org.telegram.messenger.g0.L(4.0f)));
        n1Var.f31206k.draw(canvas);
        if (!z11) {
            m1 m1Var = this.Sa;
            if (m1Var != null && m1Var.z1(this, 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            a1(canvas, n1Var, i7, z10);
        }
        if (this.f31586nc == null) {
            this.f31586nc = getContext().getResources().getDrawable(2131232337).mutate();
        }
        if (z11) {
            i10 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fd, this.Qb);
        } else {
            i10 = i7;
        }
        this.f31586nc.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        int i11 = (int) (((L - intrinsicWidth) / 2.0f) + f10);
        int i12 = (int) (((L - intrinsicHeight) / 2.0f) + f11);
        this.f31586nc.setBounds(i11, i12, this.f31586nc.getIntrinsicWidth() + i11, this.f31586nc.getIntrinsicHeight() + i12);
        canvas.save();
        if (!z11) {
            float f13 = f12 / 2.0f;
            canvas.scale(-1.0f, 1.0f, f10 + f13, f13 + f11);
        }
        this.f31586nc.draw(canvas);
        canvas.restore();
        float L2 = f10 + f12 + org.telegram.messenger.g0.L(6.0f);
        if (n1Var.f31202f != null) {
            f31403xd.setColor(i10);
            Y0(canvas, n1Var.f31202f, L2, f11);
            f31403xd.setColor(i7);
            L2 += org.telegram.messenger.g0.L(4.0f) + L1(n1Var.f31202f);
        }
        if (n1Var.f31204i) {
            imageReceiver.z0(L2, f11, f12, f12);
            imageReceiver.setAlpha(1.0f);
            imageReceiver.h(canvas, null);
            L2 += org.telegram.messenger.g0.L(5.0f) + L;
        }
        StaticLayout staticLayout = n1Var.f31203g;
        if (staticLayout != null) {
            if (z11) {
                staticLayout.getPaint().setColor(i0.a.k(org.telegram.ui.ActionBar.n6.r1(0.7f, i10), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29771ua, this.Qb)));
            }
            Y0(canvas, n1Var.f31203g, L2, f11);
            if (z11) {
                n1Var.f31203g.getPaint().setColor(i7);
            }
            L2 += org.telegram.messenger.g0.L(4.0f) + L1(n1Var.f31203g);
        }
        if (n1Var.h != null) {
            canvas.save();
            canvas.translate(L2 - n1Var.h.getLineLeft(0), ((L - n1Var.h.getHeight()) / 2.0f) + f11);
            if (z11) {
                n1Var.h.draw(canvas);
            } else {
                StaticLayout staticLayout2 = n1Var.h;
                AtomicReference atomicReference = this.f31599oc;
                ArrayList arrayList = this.Tb;
                xh.f.g(this, this.f31575n0, i7, -org.telegram.messenger.g0.L(2.0f), atomicReference, 0, staticLayout2, arrayList, canvas, false);
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, n1Var.h, this.Ba, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, J1(2, i7));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public final Drawable Z1(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.i6 i6Var = this.Qb;
        if (i6Var != null) {
            drawable = i6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.n6.R0(str);
    }

    public final void Z2(org.telegram.messenger.fj r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.Z2(org.telegram.messenger.fj):void");
    }

    public final void Z3() {
        char c10;
        int L;
        int extraTextX;
        int i7;
        int i10;
        int L2;
        int i11;
        if (getDelegate() != null && getDelegate().B2() != null && getDelegate().B2().z(this.Q5)) {
            j9 B2 = getDelegate().B2();
            int i12 = 0;
            if (B2.f30976q0) {
                c10 = 2;
            } else if (B2.f30978s0) {
                c10 = 3;
            } else if (B2.f30980u0) {
                c10 = 4;
            } else if (d2()) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            if (c10 == 2) {
                if (this.T1) {
                    i11 = this.f31601p0 - org.telegram.messenger.g0.L(10.0f);
                } else {
                    if (this.U1) {
                        i10 = this.f31601p0;
                        L2 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i10 = this.f31601p0;
                        L2 = org.telegram.messenger.g0.L(1.0f);
                    }
                    i11 = i10 + L2;
                }
                getDelegate().B2().c0(org.telegram.messenger.g0.L(10.0f) + i11 + this.f31407a2, this.Y1);
            } else if (c10 == 1) {
                R3();
                getDelegate().B2().c0((int) this.f31648s3, (int) this.f31660t3);
            } else if (c10 == 3) {
                aj ajVar = this.L;
                if (ajVar != null && !ajVar.f23012i) {
                    i7 = (int) this.f31648s3;
                } else {
                    float f10 = 12.0f;
                    if (this.Q5.P3()) {
                        i7 = getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + this.N6;
                        if (this.Q5.D == 19) {
                            i7 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(this.X7, this.Z7) + i7)) - org.telegram.messenger.g0.f24226q.x);
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
                int L3 = ((int) (i7 + this.f31521ib.f32475h0)) - org.telegram.messenger.g0.L(1.33f);
                int i14 = this.f31630r0;
                R3();
                j9 B22 = getDelegate().B2();
                int L4 = org.telegram.messenger.g0.L(10.0f) + L3;
                t1 t1Var = this.f31645s0;
                if (t1Var != null) {
                    i12 = t1Var.f31909o;
                }
                B22.c0(L4 - i12, org.telegram.messenger.g0.L(22.0f) + i14);
            } else {
                getDelegate().B2().c0(this.f31588o0, this.f31670u0);
            }
        }
    }

    @Override
    public final boolean a() {
        aj ajVar = this.L;
        if ((ajVar == null || !ajVar.f23016m.f28399j) && getAlpha() != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean a0(MotionEvent motionEvent) {
        fr0 c22;
        m1 m1Var = this.Sa;
        if (m1Var == null) {
            c22 = null;
        } else {
            c22 = m1Var.c2();
        }
        fr0 fr0Var = c22;
        int i7 = 0;
        if (this.Q5 != null) {
            fi.s2 s2Var = this.U0;
            if (s2Var.M() && fr0Var != null && !this.Q5.t4() && !this.Q5.G2() && ((!fj.L4(this.Q5.f24073k) || this.H5) && !this.f31735yb && !this.Q5.J2() && ((!this.Q5.U2() || fj.t3(this.Q5.f24073k)) && !this.Q5.m5()))) {
                fj fjVar = this.Q5;
                xh.e eVar = this.Q9;
                if (eVar != null) {
                    Integer num = (Integer) eVar.f60672k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    i7 = num.intValue();
                }
                return fr0Var.a(motionEvent, this, s2Var, fjVar, i7);
            }
        }
        return false;
    }

    public final void a1(Canvas canvas, n1 n1Var, int i7, boolean z10) {
        n80 n80Var;
        n80 n80Var2;
        if (!z10 && n1Var.f31209n) {
            n80 n80Var3 = n1Var.f31208m;
            if (n80Var3 != null) {
                n80Var3.a();
            }
        } else if (z10 && !n1Var.f31209n && (n80Var = n1Var.f31208m) != null) {
            n80Var.f37711c = -1L;
            n80Var.f37710b = -1L;
        }
        n1Var.f31209n = z10;
        float[] fArr = n1Var.f31210o;
        RectF rectF = n1Var.d;
        if (!z10 && ((n80Var2 = n1Var.f31208m) == null || !n80Var2.d())) {
            n80 n80Var4 = n1Var.f31208m;
            if (n80Var4 != null) {
                n80Var4.f37710b = -1L;
                return;
            }
            return;
        }
        if (n1Var.f31208m == null) {
            n80 n80Var5 = new n80();
            n1Var.f31208m = n80Var5;
            n80Var5.D = true;
            n80Var5.f37726t = 3.5f;
            n80Var5.f37727u = 0.5f;
        }
        n1Var.f31208m.g(org.telegram.ui.ActionBar.n6.r1(0.1f, i7), org.telegram.ui.ActionBar.n6.r1(0.3f, i7), org.telegram.ui.ActionBar.n6.r1(0.3f, i7), org.telegram.ui.ActionBar.n6.r1(1.25f, i7));
        Arrays.fill(fArr, org.telegram.messenger.g0.L(6.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(rectF.left - org.telegram.messenger.g0.L(6.0f), rectF.top - org.telegram.messenger.g0.L(4.0f), rectF.right + org.telegram.messenger.g0.L(6.0f), rectF.bottom + org.telegram.messenger.g0.L(4.0f));
        n1Var.f31208m.e(rectF2);
        n1Var.f31208m.j(fArr);
        n1Var.f31208m.f37729x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        n1Var.f31208m.draw(canvas);
        invalidate();
    }

    public Paint a2(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.i6 i6Var = this.Qb;
        if (i6Var != null) {
            paint = i6Var.e(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.n6.V0(str);
    }

    public final float a3() {
        float f10;
        y1 y1Var = this.f31521ib;
        float f11 = 1.0f;
        if (y1Var.G1) {
            boolean z10 = this.f31700w1;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            return org.telegram.messenger.g0.T1(f10, f11, y1Var.L1);
        } else if (this.f31700w1) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public final void a4(int i7, int i10) {
        ArrayList arrayList;
        dj djVar = this.f31565m3;
        y1 y1Var = this.f31521ib;
        if (djVar != null && (arrayList = djVar.f23662e) != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                cj cjVar = (cj) obj;
                ArrayList arrayList2 = cjVar.f23483y;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    ((xh.f) obj2).i((i7 - cjVar.p(this.f31565m3.f23662e, y1Var)) - this.f31648s3, getWidth(), (i10 - cjVar.p(this.f31565m3.f23662e, y1Var)) - this.f31660t3);
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
                cj cjVar2 = (cj) obj4;
                ArrayList arrayList5 = cjVar2.f23483y;
                int size5 = arrayList5.size();
                int i15 = 0;
                while (i15 < size5) {
                    Object obj5 = arrayList5.get(i15);
                    i15++;
                    ((xh.f) obj5).i((i7 - cjVar2.p(getMessageObject().B2, y1Var)) - this.f31670u0, getWidth(), (i10 - cjVar2.p(getMessageObject().B2, y1Var)) - this.f31670u0);
                }
            }
        }
    }

    @Override
    public final void b(boolean z10, boolean z11) {
        this.ya = z10;
        if (z10) {
            this.f31747za = z11;
        } else {
            this.f31747za = false;
        }
    }

    public final void b0() {
        sh.e eVar;
        sh.e eVar2;
        fj fjVar = this.Q5;
        if (fjVar != null && fjVar.T3()) {
            x1 x1Var = this.f31714x2;
            if (x1Var != null && (eVar2 = x1Var.f32394n) != null) {
                eVar2.c();
            }
            x1 x1Var2 = this.f31714x2;
            if (x1Var2 != null && (eVar = x1Var2.f32393m) != null) {
                eVar.c();
            }
        }
    }

    public final void b1(Canvas canvas, float f10) {
        dj djVar;
        ch.q0 q0Var;
        Paint paint;
        n1 n1Var;
        n1 n1Var2;
        if (u2() && this.Q5 != null && f10 > 0.0f) {
            if (this.f31628qd == null) {
                this.f31628qd = new Paint(1);
            }
            float compactLeft = getCompactLeft();
            ArrayList arrayList = this.Q5.B2;
            if (arrayList != null && !arrayList.isEmpty()) {
                compactLeft = Math.max(compactLeft, this.f31588o0 + this.Q5.f24118v2);
            }
            if (this.f31565m3 != null) {
                compactLeft = Math.max(compactLeft, this.f31648s3 + djVar.f23661c);
            }
            if (this.O1) {
                fi.s2 s2Var = this.U0;
                if (s2Var.R0) {
                    compactLeft = Math.max(compactLeft, s2Var.z());
                }
            }
            if (this.f31546k9 && this.V8 != null) {
                compactLeft = Math.max(compactLeft, getCompactLeft() + this.f31481f9);
            }
            if (this.f31535jc && (n1Var2 = this.f31509hc) != null) {
                compactLeft = Math.max(compactLeft, n1Var2.d.right);
            }
            if (this.f31548kc && (n1Var = this.f31522ic) != null) {
                compactLeft = Math.max(compactLeft, n1Var.d.right);
            }
            if (!this.O.f5487p) {
                compactLeft = Math.max(compactLeft, q0Var.f5475b + q0Var.f5486o);
            }
            if (this.Q5.D != 0 && !this.O1) {
                compactLeft = Math.max(compactLeft, getBackgroundDrawableRight() - org.telegram.messenger.g0.L(10.0f));
            }
            if (this.f31746z9 != null) {
                compactLeft = Math.max(compactLeft, this.C9 + this.A9);
            }
            float L = org.telegram.messenger.g0.L(8.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(L, org.telegram.messenger.g0.L(2.0f) + getPaddingTop(), Math.min(compactLeft + L, getMeasuredWidth() - L), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
            this.f31628qd.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29771ua, this.Qb));
            this.f31628qd.setAlpha((int) (paint.getAlpha() * f10));
            float L2 = org.telegram.messenger.g0.L(bz.Y0);
            canvas.drawRoundRect(rectF, L2, L2, this.f31628qd);
        }
    }

    public final float b2(float f10) {
        float f11;
        float f12;
        if (y2() && this.f31746z9 != null) {
            return getCompactNameTimeY();
        }
        if (H3() && this.M1 != 7) {
            return ((getPhotoBottom() + this.f31699w0) - org.telegram.messenger.g0.L(7.3f)) - this.f31746z9.getHeight();
        }
        int i7 = this.f31465e7;
        if (!this.G && !this.F) {
            f11 = 6.5f;
        } else {
            f11 = 7.5f;
        }
        float L = ((i7 - org.telegram.messenger.g0.L(f11)) - this.f31746z9.getHeight()) + f10;
        boolean z10 = this.f31735yb;
        y1 y1Var = this.f31521ib;
        if (z10 && !u2()) {
            if (this.K) {
                f12 = 4.0f;
            } else {
                f12 = 5.0f;
            }
            L -= (1.0f - getVideoTranscriptionProgress()) * (this.O.i(y1Var.L1) + org.telegram.messenger.g0.L(f12));
        }
        aj ajVar = this.L;
        if (ajVar != null) {
            zi ziVar = ajVar.f23016m;
            float f13 = L + ziVar.h;
            if (ziVar.f28399j) {
                return f13 - getTranslationY();
            }
            return f13;
        }
        return (y1Var.f32485j0 - y1Var.f32489k0) + L;
    }

    public final boolean b3() {
        fj fjVar;
        if (!u2()) {
            if (!this.f31478f6 || this.f31517i6 || ((this.H6 && !this.f31555l6) || (fjVar = this.Q5) == null || fjVar.P3() || !this.Q5.k5())) {
                fj fjVar2 = this.Q5;
                if (fjVar2 == null || fj.B0(fjVar2.f24073k) != 489000) {
                    fj fjVar3 = this.Q5;
                    if (fjVar3 == null || !fjVar3.f24080l2) {
                        if (fjVar3 != null && fjVar3.f24073k.guestchat_via_from != null) {
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
        return false;
    }

    public void b4() {
        int i7;
        fj fjVar = this.Q5;
        if (fjVar == null) {
            return;
        }
        float f10 = this.f31536jd + this.f31549kd;
        if (!fjVar.P3() || this.Q5.D2) {
            f10 += this.f31631r1;
        }
        if (u2()) {
            f10 += getCompactSideMenuShift();
        } else if (this.X6 && !this.Q5.P3() && this.M != null) {
            if (b3()) {
                i7 = 48;
            } else {
                i7 = 0;
            }
            f10 += org.telegram.messenger.g0.L(71 - i7) * this.Z6;
        }
        setTranslationX(f10);
    }

    @Override
    public final void c(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        m1 m1Var = this.Sa;
        if (m1Var != null) {
            m1Var.w2(this, reactionCount, z10, f10, f11);
        }
    }

    public final void c0(boolean z10) {
        fj fjVar;
        boolean z11;
        fj fjVar2;
        byte[] bArr;
        x1 x1Var = this.f31714x2;
        if (x1Var != null && x1Var.f32391k != null && (fjVar = this.Q5) != null && fjVar.T3()) {
            TLRPC.MessageMedia m12 = fj.m1(this.Q5);
            boolean z12 = false;
            if (m12 instanceof TLRPC.TL_messageMediaPoll) {
                z11 = ((TLRPC.TL_messageMediaPoll) m12).poll.multiple_choice;
            } else {
                z11 = false;
            }
            uh.d dVar = this.f31714x2.f32391k;
            if (z11) {
                zy C = zy.C(this.f31411a6);
                if (this.Q5 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C.f28485w.get("poll_" + fjVar2.D1());
                }
                if (bArr != null) {
                    z12 = true;
                }
            }
            te.a aVar = dVar.f59115f;
            if (aVar.f57780f != z12) {
                aVar.a(z12, z10);
            }
        }
    }

    public final void c1(android.graphics.Canvas r50, boolean r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.c1(android.graphics.Canvas, boolean):void");
    }

    public final int c2(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Q4;
            if (i10 < arrayList.size()) {
                TLRPC.TodoItem todoItem = ((q1) arrayList.get(i10)).f31369t;
                if (todoItem != null && todoItem.f28639id == i7) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final e80 c3() {
        e80 e80Var;
        ArrayList arrayList = this.f31703w4;
        if (!arrayList.isEmpty()) {
            e80Var = (e80) arrayList.get(0);
            arrayList.remove(0);
        } else {
            e80Var = new e80(0);
        }
        e80Var.reset();
        this.f31716x4.add(e80Var);
        return e80Var;
    }

    public final void c4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.c4():void");
    }

    @Override
    public final void computeScroll() {
        super.computeScroll();
        m0 m0Var = this.f31698w;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    public final boolean d0(MotionEvent motionEvent) {
        n1 n1Var;
        n1 n1Var2;
        n1 n1Var3;
        n1 n1Var4;
        m1 m1Var;
        int i7;
        r1 r1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (!this.f31535jc && !this.f31548kc) {
            if (this.Q7 != null && (m1Var = this.Sa) != null && m1Var.r0()) {
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
                            this.f31466e8 = true;
                            getParent().requestDisallowInterceptTouchEvent(false);
                            this.f31518i8 = x10;
                            this.f31531j8 = getY() + N1;
                            y yVar = this.Ka;
                            if (yVar != null) {
                                yVar.setHotspot(x10, N1);
                                this.f31480f8 = false;
                                this.f31492g8 = true;
                                postDelayed(new e1(this, 3), ViewConfiguration.getTapTimeout() / 6);
                                invalidate();
                            }
                            lc lcVar = this.Fa;
                            if (lcVar != null) {
                                lcVar.c(true);
                                this.Ia = x10;
                                this.Ja = N1;
                            }
                            v();
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1) {
                        if (this.f31466e8) {
                            n();
                            this.f31466e8 = false;
                            y yVar2 = this.Ka;
                            if (yVar2 != null) {
                                if (!this.f31480f8) {
                                    yVar2.setState(new int[]{16842919, 16842910});
                                    post(new e1(this, 4));
                                } else {
                                    yVar2.setState(new int[0]);
                                }
                                this.f31480f8 = false;
                                this.f31492g8 = false;
                                invalidate();
                            }
                            lc lcVar2 = this.Fa;
                            if (lcVar2 != null) {
                                lcVar2.c(false);
                            }
                            playSoundEffect(0);
                            if (this.f31722xa) {
                                m1 m1Var2 = this.Sa;
                                if (m1Var2 != null) {
                                    TLRPC.Chat chat = this.f31680ua;
                                    if (chat != null) {
                                        m1Var2.c0(this, chat, this.Q5.f24073k.fwd_from.channel_post, this.f31499h1, this.f31512i1, false);
                                        r1Var = this;
                                    } else {
                                        r1Var = this;
                                        TLRPC.User user = r1Var.f31653sa;
                                        if (user != null) {
                                            m1Var2.A0(this, user, r1Var.f31499h1, r1Var.f31512i1);
                                        } else if (r1Var.f31694va != null) {
                                            m1Var2.s(this);
                                        }
                                    }
                                }
                            } else {
                                r1Var = this;
                                if (r1Var.Sa != null && (r1Var.Q5.B2() || r1Var.Q5.f4() || r1Var.M7 || ((message = r1Var.Q5.f24073k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                                    r1Var.Sa.g2(r1Var, r1Var.Q5.N1(), x10, N1, false);
                                }
                            }
                        }
                    } else {
                        r1Var = this;
                        if (motionEvent.getAction() == 3) {
                            r1Var.f31466e8 = false;
                            r1Var.f31480f8 = false;
                            y yVar3 = r1Var.Ka;
                            if (yVar3 != null) {
                                yVar3.setState(new int[0]);
                            }
                            invalidate();
                            lc lcVar3 = r1Var.Fa;
                            if (lcVar3 != null) {
                                lcVar3.c(false);
                            }
                        } else if (motionEvent.getAction() == 2) {
                            if (x10 >= r1Var.U7 && x10 <= i7) {
                                float f11 = r1Var.V7;
                                if (N1 >= f11 && N1 <= f11 + r1Var.W7) {
                                    if (r1Var.Ka != null && r1Var.f31492g8) {
                                        if (Math.sqrt(Math.pow((getY() + N1) - r1Var.f31531j8, 2.0d) + Math.pow(x10 - r1Var.f31518i8, 2.0d)) > 0.75d) {
                                            r1Var.f31492g8 = false;
                                        }
                                    }
                                }
                            }
                            r1Var.f31466e8 = false;
                            r1Var.f31480f8 = false;
                            r1Var.f31492g8 = false;
                            y yVar4 = r1Var.Ka;
                            if (yVar4 != null) {
                                yVar4.setState(new int[0]);
                            }
                            invalidate();
                            lc lcVar4 = r1Var.Fa;
                            if (lcVar4 != null) {
                                lcVar4.c(false);
                            }
                        }
                    }
                    return r1Var.f31466e8;
                }
                r1Var = this;
                return r1Var.f31466e8;
            }
        } else {
            float x11 = motionEvent.getX();
            float N12 = N1(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                if (this.Sa != null) {
                    if (this.f31535jc && (n1Var4 = this.f31509hc) != null && F2(n1Var4, x11, N12)) {
                        n1Var2 = this.f31509hc;
                    } else if (this.f31548kc && (n1Var3 = this.f31522ic) != null && F2(n1Var3, x11, N12)) {
                        n1Var2 = this.f31522ic;
                    } else {
                        n1Var2 = null;
                    }
                    if (n1Var2 != null && (n1Var2.f31198a || this.Sa.r0())) {
                        this.f31572mc = n1Var2;
                        n1Var2.f31201e.c(true);
                        y yVar5 = n1Var2.f31206k;
                        if (yVar5 != null) {
                            yVar5.setHotspot(x11, N12);
                            n1Var2.f31206k.setState(new int[]{16842919, 16842910});
                        }
                        invalidate();
                        v();
                        return true;
                    }
                }
            } else if (action == 1) {
                n1 n1Var5 = this.f31572mc;
                if (n1Var5 != null) {
                    n();
                    f3();
                    playSoundEffect(0);
                    if (n1Var5.f31198a) {
                        TLRPC.Chat chat2 = this.f31680ua;
                        if (chat2 != null) {
                            this.Sa.c0(this, chat2, this.Q5.f24073k.fwd_from.channel_post, this.f31499h1, this.f31512i1, false);
                            return true;
                        }
                        TLRPC.User user2 = this.f31653sa;
                        if (user2 != null) {
                            this.Sa.A0(this, user2, this.f31499h1, this.f31512i1);
                            return true;
                        }
                        this.Sa.s(this);
                        return true;
                    }
                    this.Sa.g2(this, this.Q5.N1(), x11, N12, false);
                    return true;
                }
            } else {
                if (action == 3) {
                    f3();
                } else if (action == 2 && (n1Var = this.f31572mc) != null && !F2(n1Var, x11, N12)) {
                    n();
                    f3();
                }
                if (this.f31572mc != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d1(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.d1(android.graphics.Canvas):void");
    }

    public final boolean d2() {
        if (this.f31565m3 != null) {
            return true;
        }
        return false;
    }

    public final org.telegram.ui.ActionBar.u4 d3(String str) {
        ?? r12;
        int i7;
        int i10;
        boolean q10;
        int i11;
        Integer valueOf;
        org.telegram.ui.ActionBar.u4 u4Var = (org.telegram.ui.ActionBar.u4) Z1(str);
        fj fjVar = this.Q5;
        if (fjVar != null && fjVar.P3() && R2()) {
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
            org.telegram.ui.ActionBar.i6 i6Var = this.Qb;
            int i13 = org.telegram.utils.twidget.q1.f55041c[0];
            if (i6Var != null) {
                i10 = i6Var.k(i13);
            } else {
                i10 = org.telegram.ui.ActionBar.n6.lm.get(i13);
            }
            if (i10 == 0) {
                valueOf = null;
            } else {
                if (i6Var != null) {
                    q10 = i6Var.b();
                } else {
                    q10 = org.telegram.ui.ActionBar.n6.I.q();
                }
                int b10 = org.telegram.utils.twidget.q1.b(i6Var, true);
                if (q10) {
                    i11 = -16777216;
                } else {
                    i11 = -1;
                }
                int w10 = org.telegram.ui.ActionBar.n6.w(i11, b10);
                if (r12 != 0) {
                    w10 = org.telegram.ui.ActionBar.n6.w(w10, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Sc, i6Var));
                }
                valueOf = Integer.valueOf(w10);
            }
            if (valueOf != null) {
                if (this.dc == null) {
                    this.dc = new org.telegram.ui.ActionBar.u4[4];
                }
                if (i7 != 0) {
                    i12 = 2;
                }
                int i14 = i12 + r12;
                org.telegram.ui.ActionBar.u4[] u4VarArr = this.dc;
                if (u4VarArr[i14] == null) {
                    u4VarArr[i14] = new org.telegram.ui.ActionBar.u4(i7, true, r12, this.Qb);
                }
                org.telegram.ui.ActionBar.u4 u4Var2 = this.dc[i14];
                u4Var2.f30159w = valueOf;
                return u4Var2;
            }
        }
        return u4Var;
    }

    public final rk0 d4() {
        if (this.Q5 != null && R2()) {
            return (rk0) this.Q5.f24130y2.f23877g.get(0);
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fj fjVar;
        if (i7 == ks.f25249m1) {
            setSpoilersSuppressed(false);
        } else if (i7 == ks.l1) {
            setSpoilersSuppressed(true);
        } else if (i7 == ks.E0) {
            TLRPC.User user = this.f31533ja;
            if (user != null && user.f28641id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.Q5);
            }
        } else if (i7 == ks.f25247l4) {
            invalidate();
        } else if (i7 == ks.Y2 && (fjVar = this.Q5) != null) {
            TLRPC.MessageMedia messageMedia = fjVar.f24073k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
                y3(fjVar, this.L, this.G, this.F, this.H, false);
            }
        }
    }

    @Override
    public final void e(float f10) {
        fj fjVar = this.Q5;
        if (fjVar == null) {
            return;
        }
        fjVar.f24033b0 = f10;
        MediaController.B().i0(this.Q5, f10);
        U3();
    }

    public final boolean e0(MotionEvent motionEvent) {
        fj fjVar = this.Q5;
        if (fjVar == null || fjVar.f24130y2 == null || fjVar.D != 36) {
            return false;
        }
        float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.f31511i0 + this.f31670u0;
        motionEvent.offsetLocation(-this.f31588o0, -topicSeparatorTopPadding);
        ev evVar = this.Q5.f24130y2;
        m1 m1Var = this.Sa;
        evVar.E = this;
        evVar.F = m1Var;
        boolean M = evVar.M(motionEvent);
        motionEvent.offsetLocation(this.f31588o0, topicSeparatorTopPadding);
        return M;
    }

    public final void e1(Canvas canvas, float f10) {
        if (!this.Q5.r4() && !this.Q5.G4() && !this.R1 && !this.T1 && !this.U1) {
            return;
        }
        E1().a(canvas, f10);
    }

    public final boolean e2() {
        return this.f31719x7;
    }

    public final void e3() {
        fj fjVar = this.Q5;
        if (fjVar != null && fjVar.B2 != null) {
            for (int i7 = 0; i7 < this.Q5.B2.size(); i7++) {
                cj cjVar = (cj) this.Q5.B2.get(i7);
                y yVar = cjVar.T;
                if (yVar != null) {
                    yVar.setCallback(this);
                    cjVar.T.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.f31565m3 != null) {
            for (int i10 = 0; i10 < this.f31565m3.f23662e.size(); i10++) {
                cj cjVar2 = (cj) this.f31565m3.f23662e.get(i10);
                y yVar2 = cjVar2.T;
                if (yVar2 != null) {
                    yVar2.setCallback(this);
                    cjVar2.T.setState(StateSet.NOTHING);
                }
            }
        }
        if (u2()) {
            invalidate();
        }
    }

    public final boolean e4() {
        if (this.Q5 != null && R2() && !u2()) {
            if ((TextUtils.isEmpty(this.Q5.f24131z) || this.f31700w1) && this.O.f5487p) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(RectF rectF) {
        RectF rectF2 = this.f31573md;
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
        dj djVar;
        dj djVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        aj ajVar;
        if (i7 > 15 || getParent() == null) {
            return false;
        }
        boolean z10 = true;
        if (this.Q5.z2() && (ajVar = this.L) != null && !ajVar.f23012i) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                View childAt = viewGroup.getChildAt(i17);
                if (childAt instanceof r1) {
                    r1 r1Var = (r1) childAt;
                    aj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
                    xi currentPosition = r1Var.getCurrentPosition();
                    if (currentMessagesGroup != null && currentMessagesGroup.f23006a == this.L.f23006a) {
                        int i18 = currentPosition.f28005l;
                        if ((i18 & 8) != 0 && (i18 & 1) != 0 && r1Var != this) {
                            motionEvent.offsetLocation(getLeft() - r1Var.getLeft(), getTop() - r1Var.getTop());
                            boolean f02 = r1Var.f0(i7 + 1, motionEvent);
                            motionEvent.offsetLocation(-(getLeft() - r1Var.getLeft()), -(getTop() - r1Var.getTop()));
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
        y1 y1Var = this.f31521ib;
        if (actionMasked == 0) {
            int i19 = this.f31588o0;
            if (x10 >= i19 && N1 >= (i15 = this.f31670u0)) {
                fj fjVar = this.Q5;
                if (x10 <= i19 + fjVar.f24118v2 && N1 <= fjVar.W5(y1Var) + i15) {
                    ArrayList arrayList = this.Q5.B2;
                    for (int i20 = 0; i20 < arrayList.size() && ((cj) arrayList.get(i20)).p(this.Q5.B2, y1Var) <= N1; i20++) {
                        cj cjVar = (cj) arrayList.get(i20);
                        if (cjVar.l()) {
                            i16 = (int) this.Q5.f24126x2;
                        } else {
                            i16 = 0;
                        }
                        ArrayList arrayList2 = cjVar.f23483y;
                        int size = arrayList2.size();
                        int i21 = 0;
                        while (i21 < size) {
                            Object obj = arrayList2.get(i21);
                            i21++;
                            xh.f fVar2 = (xh.f) obj;
                            boolean z11 = z10;
                            if (fVar2.getBounds().contains((x10 - this.f31588o0) + i16, (int) ((N1 - this.f31670u0) - cjVar.p(this.Q5.B2, y1Var)))) {
                                this.O5 = fVar2;
                                return z11;
                            }
                            z10 = z11;
                        }
                    }
                }
            }
            boolean z12 = z10;
            if (this.f31565m3 != null) {
                float f10 = x10;
                float f11 = this.f31648s3;
                if (f10 >= f11) {
                    float f12 = N1;
                    float f13 = this.f31660t3;
                    if (f12 >= f13 && f10 <= f11 + djVar.f23661c && f12 <= f13 + djVar.c(y1Var)) {
                        ArrayList arrayList3 = this.f31565m3.f23662e;
                        for (int i22 = 0; i22 < arrayList3.size() && ((cj) arrayList3.get(i22)).p(this.f31565m3.f23662e, y1Var) <= f12; i22++) {
                            cj cjVar2 = (cj) arrayList3.get(i22);
                            if (cjVar2.l()) {
                                i14 = (int) this.f31565m3.d;
                            } else {
                                i14 = 0;
                            }
                            ArrayList arrayList4 = cjVar2.f23483y;
                            int size2 = arrayList4.size();
                            int i23 = 0;
                            while (i23 < size2) {
                                Object obj2 = arrayList4.get(i23);
                                i23++;
                                xh.f fVar3 = (xh.f) obj2;
                                ArrayList arrayList5 = arrayList3;
                                float f14 = f10;
                                if (fVar3.getBounds().contains((int) ((f10 - this.f31648s3) + i14), (int) ((f12 - this.f31660t3) - cjVar2.p(this.f31565m3.f23662e, y1Var)))) {
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
            if (this.f31618q3 == null) {
                return false;
            }
            float f15 = x10;
            float f16 = this.f31675u5;
            if (f15 < f16) {
                return false;
            }
            float f17 = N1;
            float f18 = this.f31689v5;
            if (f17 <= f18 || f15 > f16 + djVar2.f23661c || f17 > f18 + djVar2.c(y1Var)) {
                return false;
            }
            ArrayList arrayList6 = this.f31618q3.f23662e;
            for (int i24 = 0; i24 < arrayList6.size() && ((cj) arrayList6.get(i24)).p(this.f31618q3.f23662e, y1Var) <= f17; i24++) {
                cj cjVar3 = (cj) arrayList6.get(i24);
                if (cjVar3.l()) {
                    i13 = (int) this.f31618q3.d;
                } else {
                    i13 = 0;
                }
                ArrayList arrayList7 = cjVar3.f23483y;
                int size3 = arrayList7.size();
                int i25 = 0;
                while (i25 < size3) {
                    Object obj3 = arrayList7.get(i25);
                    i25++;
                    xh.f fVar4 = (xh.f) obj3;
                    if (fVar4.getBounds().contains((int) ((f15 - this.f31675u5) + i13), (int) ((f17 - this.f31689v5) - cjVar3.p(this.f31618q3.f23662e, y1Var)))) {
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
            dj djVar3 = this.f31618q3;
            if (djVar3 != null) {
                ArrayList arrayList8 = djVar3.f23662e;
                int size4 = arrayList8.size();
                int i26 = 0;
                while (i26 < size4) {
                    Object obj4 = arrayList8.get(i26);
                    i26++;
                    cj cjVar4 = (cj) obj4;
                    ArrayList arrayList9 = cjVar4.f23483y;
                    int size5 = arrayList9.size();
                    int i27 = 0;
                    while (i27 < size5) {
                        int i28 = i27 + 1;
                        Rect bounds = ((xh.f) arrayList9.get(i27)).getBounds();
                        path.addRect(bounds.left, cjVar4.p(this.f31618q3.f23662e, y1Var) + bounds.top, bounds.right, cjVar4.p(this.f31618q3.f23662e, y1Var) + bounds.bottom, Path.Direction.CW);
                        i27 = i28;
                    }
                }
            }
            dj djVar4 = this.f31565m3;
            if (djVar4 != null) {
                ArrayList arrayList10 = djVar4.f23662e;
                int size6 = arrayList10.size();
                int i29 = 0;
                while (i29 < size6) {
                    Object obj5 = arrayList10.get(i29);
                    i29++;
                    cj cjVar5 = (cj) obj5;
                    ArrayList arrayList11 = cjVar5.f23483y;
                    int size7 = arrayList11.size();
                    int i30 = 0;
                    while (i30 < size7) {
                        int i31 = i30 + 1;
                        Rect bounds2 = ((xh.f) arrayList11.get(i30)).getBounds();
                        path.addRect(bounds2.left, cjVar5.p(this.f31565m3.f23662e, y1Var) + bounds2.top, bounds2.right, cjVar5.p(this.f31565m3.f23662e, y1Var) + bounds2.bottom, Path.Direction.CW);
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
                        cj cjVar6 = (cj) obj6;
                        ArrayList arrayList13 = cjVar6.f23483y;
                        int size9 = arrayList13.size();
                        int i33 = 0;
                        while (i33 < size9) {
                            int i34 = i33 + 1;
                            Rect bounds3 = ((xh.f) arrayList13.get(i33)).getBounds();
                            path.addRect(bounds3.left, cjVar6.p(this.Q5.B2, y1Var) + bounds3.top, bounds3.right, cjVar6.p(this.Q5.B2, y1Var) + bounds3.bottom, Path.Direction.CW);
                            i33 = i34;
                        }
                    }
                }
            }
            RectF rectF = this.f31436c4;
            path.computeBounds(rectF, false);
            float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
            this.P5 = true;
            this.O5.f60689q = new e1(this, 8);
            dj djVar5 = this.f31618q3;
            if (djVar5 != null) {
                ArrayList arrayList14 = djVar5.f23662e;
                int size10 = arrayList14.size();
                int i35 = 0;
                while (i35 < size10) {
                    Object obj7 = arrayList14.get(i35);
                    i35++;
                    cj cjVar7 = (cj) obj7;
                    if (cjVar7.l()) {
                        i12 = (int) this.f31618q3.d;
                    } else {
                        i12 = 0;
                    }
                    ArrayList arrayList15 = cjVar7.f23483y;
                    int size11 = arrayList15.size();
                    int i36 = 0;
                    while (i36 < size11) {
                        Object obj8 = arrayList15.get(i36);
                        i36++;
                        ((xh.f) obj8).j((x10 - this.f31675u5) + i12, (N1 - cjVar7.p(this.f31618q3.f23662e, y1Var)) - this.f31689v5, sqrt, false);
                        arrayList14 = arrayList14;
                    }
                }
            }
            dj djVar6 = this.f31565m3;
            if (djVar6 != null) {
                ArrayList arrayList16 = djVar6.f23662e;
                int size12 = arrayList16.size();
                int i37 = 0;
                while (i37 < size12) {
                    Object obj9 = arrayList16.get(i37);
                    i37++;
                    cj cjVar8 = (cj) obj9;
                    if (cjVar8.l()) {
                        i11 = (int) this.f31565m3.d;
                    } else {
                        i11 = 0;
                    }
                    ArrayList arrayList17 = cjVar8.f23483y;
                    int size13 = arrayList17.size();
                    int i38 = 0;
                    while (i38 < size13) {
                        Object obj10 = arrayList17.get(i38);
                        i38++;
                        ((xh.f) obj10).j((x10 - this.f31648s3) + i11, (N1 - cjVar8.p(this.f31565m3.f23662e, y1Var)) - this.f31660t3, sqrt, false);
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
                        cj cjVar9 = (cj) obj11;
                        if (cjVar9.l()) {
                            i10 = (int) this.Q5.f24126x2;
                        } else {
                            i10 = 0;
                        }
                        ArrayList arrayList19 = cjVar9.f23483y;
                        int size15 = arrayList19.size();
                        int i40 = 0;
                        while (i40 < size15) {
                            Object obj12 = arrayList19.get(i40);
                            i40++;
                            ((xh.f) obj12).j((x10 - this.f31588o0) + i10, (N1 - cjVar9.p(this.Q5.B2, y1Var)) - this.f31670u0, sqrt, false);
                        }
                    }
                }
            }
            if (getParent() instanceof ek0) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                for (int i41 = 0; i41 < viewGroup2.getChildCount(); i41++) {
                    View childAt2 = viewGroup2.getChildAt(i41);
                    if (childAt2 instanceof r1) {
                        r1 r1Var2 = (r1) childAt2;
                        ArrayList arrayList20 = r1Var2.Tb;
                        if (r1Var2.getMessageObject() != null && r1Var2.getMessageObject().N1() == getMessageObject().e1() && !arrayList20.isEmpty()) {
                            ((xh.f) arrayList20.get(0)).f60689q = new ha(6, this, r1Var2);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.f1(float, float, android.graphics.Canvas, java.util.ArrayList, float, boolean, float, boolean, boolean, boolean, boolean):void");
    }

    public final boolean f2() {
        if (u2()) {
            fj fjVar = this.Q5;
            if (fjVar.D != 27 && !fjVar.r4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f3() {
        n1 n1Var = this.f31572mc;
        if (n1Var != null) {
            y yVar = n1Var.f31206k;
            if (yVar != null) {
                yVar.setState(StateSet.NOTHING);
            }
            this.f31572mc.f31201e.c(false);
            this.f31572mc = null;
            invalidate();
        }
    }

    @Override
    public final void g(Canvas canvas, float f10) {
        if (this.f31573md == null) {
            draw(canvas);
            return;
        }
        canvas.save();
        Path path = this.f31587nd;
        path.rewind();
        path.addRoundRect(this.f31573md, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
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

    public final void g0() {
        int i7;
        fj fjVar = this.Q5;
        if (fjVar != null) {
            TLRPC.MessageMedia n1 = fj.n1(fjVar.f24073k);
            if ((n1 instanceof TLRPC.TL_messageMediaDice) && ((TLRPC.TL_messageMediaDice) n1).game_outcome != null && !this.R) {
                Drawable t6 = this.U0.t();
                if (t6 instanceof lh0) {
                    lh0 lh0Var = (lh0) t6;
                    if ((lh0Var.f37816n0 != null || lh0Var.Z0) && !this.R && (i7 = lh0Var.K) != 1 && i7 == 2) {
                        if (!lh0Var.Y0) {
                            float t10 = lh0Var.t();
                            if (lh0Var.V0 != null) {
                                t10 = lh0Var.f37801b0 / lh0Var.f37133b1;
                            }
                            if (t10 <= 0.95f) {
                                return;
                            }
                        }
                        this.R = true;
                        m1 m1Var = this.Sa;
                        if (m1Var != null) {
                            m1Var.F1(this, false);
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
        fj fjVar = this.Q5;
        if (fjVar != null && !fjVar.r4()) {
            float f13 = this.f31670u0;
            y1 y1Var = this.f31521ib;
            if (y1Var.f32499m2) {
                float f14 = y1Var.f32507o2;
                float f15 = y1Var.L1;
                f10 = (f15 * f13) + ((1.0f - f15) * f14);
            } else {
                f10 = f13;
            }
            if (y1Var.L1 != 1.0f && y1Var.H0) {
                canvas.save();
                org.telegram.ui.ActionBar.u4 u4Var = this.L6;
                if (u4Var != null) {
                    Rect bounds = u4Var.getBounds();
                    if (this.Q5.P3() && !this.C6 && !this.G) {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(10.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    } else {
                        canvas.clipRect(org.telegram.messenger.g0.L(4.0f) + bounds.left, org.telegram.messenger.g0.L(4.0f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(4.0f), bounds.bottom - org.telegram.messenger.g0.L(4.0f));
                    }
                }
                wg0 wg0Var = this.Ac;
                if (wg0Var != null && wg0Var.h) {
                    fj fjVar2 = this.Q5;
                    f1(this.f31588o0, f10, canvas, fjVar2.B2, fjVar2.f24126x2, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    f1(this.f31588o0, f10, canvas, y1Var.I0, y1Var.O0, false, 1.0f - y1Var.L1, true, false, false, false);
                    fj fjVar3 = this.Q5;
                    f1(this.f31588o0, f10, canvas, fjVar3.B2, fjVar3.f24126x2, true, y1Var.L1, true, false, false, false);
                    canvas2 = canvas;
                }
                canvas2.restore();
                return;
            }
            float f16 = f10;
            boolean z10 = y1Var.E1;
            if (z10 && this.L6 != null) {
                if (z10) {
                    int i11 = -1;
                    if (this.f31685v1) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                    float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, y1Var.L1, this.Q5.W5(y1Var) * i10, f13);
                    float f17 = y1Var.f32507o2;
                    if (this.f31685v1) {
                        i11 = 1;
                    }
                    f11 = f17 - ((this.Q5.W5(y1Var) * i11) * y1Var.L1);
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
                float f19 = y1Var.f32507o2;
                canvas.clipRect(f18, f19, rectF.right, this.Q5.W5(y1Var) + f19 + org.telegram.messenger.g0.L(4.0f));
                fj fjVar4 = this.Q5;
                f1(this.f31588o0, f11, canvas, fjVar4.B2, fjVar4.f24126x2, false, 1.0f - y1Var.L1, true, false, false, false);
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
                canvas.clipRect(rectF.left, this.f31670u0, rectF.right, org.telegram.messenger.g0.L(4.0f) + this.Q5.W5(y1Var) + i7);
                fj fjVar5 = this.Q5;
                f1(this.f31588o0, f12, canvas, fjVar5.B2, fjVar5.f24126x2, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            fj fjVar6 = this.Q5;
            f1(this.f31588o0, f16, canvas, fjVar6.B2, fjVar6.f24126x2, true, 1.0f, true, false, false, false);
        }
    }

    public final boolean g2() {
        t1 t1Var = this.f31645s0;
        if (t1Var != null && t1Var.f31898b) {
            return true;
        }
        return false;
    }

    public final void g3() {
        s1 s1Var = this.f31701w2;
        if (s1Var != null) {
            s1Var.h = false;
        }
        lc lcVar = this.Ga;
        if (lcVar != null) {
            lcVar.c(false);
        }
        Drawable drawable = this.J2[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        s1 s1Var2 = this.f31701w2;
        if (s1Var2 != null && s1Var2.f31842g != null) {
            for (int i7 = 0; i7 < this.f31701w2.f31842g.size(); i7++) {
                o1 o1Var = (o1) this.f31701w2.f31842g.get(i7);
                lc lcVar2 = o1Var.f31237f;
                if (lcVar2 != null) {
                    lcVar2.c(false);
                }
                y yVar = o1Var.f31238g;
                if (yVar != null) {
                    yVar.setState(StateSet.NOTHING);
                }
            }
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return new b1(this);
    }

    public int getAdditionalPaddingHeight() {
        return this.Fc;
    }

    public CharSequence getAdminAccessibilityText() {
        StaticLayout staticLayout = this.f31414a9;
        if (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f31414a9.getText());
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
        if (this.f31495gb) {
            return this.f31508hb;
        }
        return super.getAlpha();
    }

    public org.telegram.ui.Components.x5[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.getAnimatedEmojiSpans():org.telegram.ui.Components.x5[]");
    }

    public float getAnimationOffsetX() {
        return this.f31549kd;
    }

    public ImageReceiver getAvatarImage() {
        if (this.G6) {
            return this.A7;
        }
        return null;
    }

    public u90 getBackgroundDrawable() {
        return this.Ta;
    }

    public int getBackgroundDrawableBottom() {
        int i7;
        xi xiVar = this.M;
        int i10 = 0;
        if (xiVar != null) {
            int i11 = 4;
            if ((xiVar.f28005l & 4) == 0) {
                i7 = org.telegram.messenger.g0.L(3.0f);
            } else {
                i7 = 0;
            }
            if ((this.M.f28005l & 8) == 0) {
                fj fjVar = this.Q5;
                if (fjVar != null && fjVar.P3()) {
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
        int backgroundDrawableTop = ((getBackgroundDrawableTop() + this.f31465e7) - i10) + i7;
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
        fj messageObject = getMessageObject();
        int i10 = 0;
        float f10 = 9.0f;
        if (messageObject != null && messageObject.P3()) {
            if (this.f31735yb) {
                return (this.f31452d7 - this.f31426b7) - ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(9.0f)));
            }
            int i11 = this.f31452d7 - this.f31426b7;
            if (this.C6) {
                i10 = org.telegram.messenger.g0.L(9.0f);
            }
            return i11 - i10;
        }
        float f11 = 71.0f;
        if (this.f31735yb) {
            if (!O2()) {
                if ((this.f31478f6 || ((messageObject != null && (messageObject.f24072j2 || messageObject.f24080l2 || messageObject.f24073k.guestchat_via_from != null)) || fj.B0(messageObject.f24073k) == 489000)) && this.G6) {
                    i10 = 48;
                }
                f11 = i10 + 3;
            }
            compactInShift = org.telegram.messenger.g0.L(f11) + ((int) ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(6.0f)));
        } else {
            if (!O2()) {
                if ((this.f31478f6 || ((messageObject != null && (messageObject.f24072j2 || messageObject.f24080l2 || messageObject.f24073k.guestchat_via_from != null)) || fj.B0(messageObject.f24073k) == 489000)) && this.G6) {
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
        aj ajVar = this.L;
        if (ajVar != null && !ajVar.f23012i && (i7 = this.M.f28003j) != 0) {
            compactInShift += (int) Math.ceil((i7 / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.f31735yb) {
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
        fj fjVar;
        fj fjVar2;
        int i10 = this.f31426b7;
        if (this.f31735yb) {
            i7 = i10 - ((int) (getVideoTranscriptionProgress() * org.telegram.messenger.g0.L(3.0f)));
            if (this.K && (fjVar2 = this.Q5) != null && fjVar2.P3()) {
                i7 = (int) (i7 - ((1.0f - getVideoTranscriptionProgress()) * org.telegram.messenger.g0.L(6.0f)));
            }
            if (this.K && ((fjVar = this.Q5) == null || !fjVar.P3())) {
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
        xi xiVar = this.M;
        int i10 = 0;
        if (xiVar != null && (xiVar.f28005l & 4) == 0) {
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
        return this.f31443cb;
    }

    public ImageReceiver getBlurredPhotoImage() {
        return this.V0;
    }

    public int getBottomActionPadding() {
        y1 y1Var = this.f31521ib;
        if (y1Var.C1) {
            return org.telegram.messenger.g0.W1(y1Var.L1, y1Var.B1, this.f31458e0);
        }
        return this.f31458e0;
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
        fj fjVar = this.Q5;
        if (fjVar != null && fjVar.P3()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (b3()) {
            if (this.M != null) {
                f11 = 73.0f;
            } else {
                fj fjVar2 = this.Q5;
                if (fjVar2 != null && fjVar2.f24072j2) {
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
            fj fjVar3 = this.Q5;
            if (fjVar3 != null && fjVar3.P3()) {
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
                i13 = Math.max(i13, ((int) (((d0) arrayList.get(i14)).f30586c * widthForButtons)) + L);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i13);
        }
        if (this.T != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.T.k()) - org.telegram.messenger.g0.L(18.0f))) / 2);
        }
        if (this.f31472f0 != null) {
            backgroundDrawableLeft = Math.min(this.f31412a7 - ((int) getCompactSideMenuShift()), backgroundDrawableLeft);
        }
        return Math.max(0, backgroundDrawableLeft);
    }

    @Override
    public int getBoundsRight() {
        int i7;
        float f10;
        int L;
        fj fjVar = this.Q5;
        if (fjVar != null && !fjVar.P3() && (X(this.Q5) || this.I4)) {
            i7 = org.telegram.messenger.g0.L(48.0f);
        } else {
            i7 = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i7;
        ArrayList arrayList = this.I5;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            fj fjVar2 = this.Q5;
            if (fjVar2 != null && fjVar2.P3()) {
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
                d0 d0Var = (d0) arrayList.get(i12);
                float f11 = widthForButtons;
                i11 = Math.max(i11, ((int) (d0Var.f30586c * f11)) + L + ((int) (d0Var.f30587e * f11)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, i11);
        }
        if (this.T != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.T.k() + getParentWidth()) + org.telegram.messenger.g0.L(18.0f))) / 2);
        }
        if (this.f31472f0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public dj getCaptionLayout() {
        return this.f31565m3;
    }

    public float getCaptionX() {
        y1 y1Var = this.f31521ib;
        if (y1Var.f32540x0) {
            if (y1Var.D0) {
                this.f31648s3 += y1Var.f32475h0;
            } else if (y1Var.f32525t0) {
                float f10 = this.f31648s3;
                float f11 = y1Var.L1;
                this.f31648s3 = com.google.android.gms.internal.vision.e2.z(1.0f, f11, y1Var.f32517r0, f10 * f11);
            } else if (!fj.R4(this.Q5.f24073k) || !TextUtils.isEmpty(this.Q5.f24131z)) {
                this.f31648s3 += y1Var.f32475h0;
            }
        }
        return this.f31648s3;
    }

    public float getCaptionY() {
        float f10 = this.f31660t3;
        y1 y1Var = this.f31521ib;
        if (y1Var.f32540x0) {
            if (y1Var.D0) {
                return f10 - getTranslationY();
            }
            if (y1Var.f32525t0) {
                float f11 = y1Var.L1;
                return com.google.android.gms.internal.vision.e2.z(1.0f, f11, y1Var.f32521s0, f10 * f11);
            }
            return f10;
        }
        return f10;
    }

    @Override
    public float getCheckBoxTranslation() {
        return this.f31631r1;
    }

    public int getChecksX() {
        float f10;
        int i7 = this.f31452d7;
        if (bz.Y0 >= 10) {
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
            f10 = this.f31734y9;
            intrinsicHeight = Z1("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            f10 = this.f31734y9;
            intrinsicHeight = org.telegram.ui.ActionBar.n6.F3.getIntrinsicHeight();
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
        org.telegram.ui.ActionBar.u4 u4Var = this.L6;
        if (u4Var == null) {
            return 0;
        }
        int i7 = u4Var.getBounds().left;
        if (!this.Q5.P3() && this.f31521ib.A0 != 1.0f) {
            boolean z10 = this.f31735yb;
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
        org.telegram.ui.ActionBar.u4 u4Var = this.L6;
        if (u4Var == null) {
            return getWidth();
        }
        int i7 = u4Var.getBounds().right;
        if (this.Q5.P3() && this.f31521ib.A0 != 1.0f && (((z10 = this.f31735yb) || !this.C6) && !this.K)) {
            if (z10) {
                return (int) ((getVideoTranscriptionProgress() * org.telegram.messenger.g0.L(6.0f)) + i7);
            }
            return org.telegram.messenger.g0.L(6.0f) + i7;
        }
        return i7;
    }

    public TLRPC.Chat getCurrentChat() {
        return this.f31547ka;
    }

    public aj getCurrentMessagesGroup() {
        return this.L;
    }

    public xi getCurrentPosition() {
        return this.M;
    }

    public TLRPC.User getCurrentUser() {
        return this.f31533ja;
    }

    public m1 getDelegate() {
        return this.Sa;
    }

    @Override
    public float getDeltaBottom() {
        return this.f31521ib.f32485j0;
    }

    public float getDeltaLeft() {
        return this.f31521ib.f32475h0;
    }

    public float getDeltaRight() {
        return this.f31521ib.f32480i0;
    }

    public float getDeltaTop() {
        return this.f31521ib.f32489k0;
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
        y1 y1Var = this.f31521ib;
        if (z10) {
            org.telegram.messenger.g0.L(14.0f);
            L2 = this.f31601p0 - org.telegram.messenger.g0.L(10.0f);
        } else {
            if (this.U1) {
                org.telegram.messenger.g0.L(14.0f);
                i7 = this.f31601p0;
                L3 = org.telegram.messenger.g0.L(1.0f);
            } else if (this.Q5.r4()) {
                org.telegram.messenger.g0.L(2.0f);
                i7 = this.f31601p0;
                L3 = org.telegram.messenger.g0.L(1.0f);
            } else {
                float f12 = 12.0f;
                if (this.Q5.P3()) {
                    f10 = getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + this.N6;
                    if (this.Q5.D == 19) {
                        f10 -= Math.max(0.0f, ((Math.max(this.X7, this.Z7) + f10) + org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.f24226q.x);
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
                L2 = (f10 + y1Var.f32475h0) - org.telegram.messenger.g0.L(1.33f);
            }
            L2 = L3 + i7;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (y1Var != null) {
            f11 = y1Var.f32480i0;
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
        if (Math.abs(this.f31434c2) > 1) {
            i12 = ((L4 - org.telegram.messenger.g0.L(20.0f)) - this.f31421b2) - this.f31434c2;
        }
        return L5 + i12;
    }

    public float getDescriptionLayoutY() {
        float f10;
        float f11 = this.Y1;
        y1 y1Var = this.f31521ib;
        if (!y1Var.f32523s2) {
            f10 = (-y1Var.f32489k0) + y1Var.f32485j0;
        } else {
            f10 = 0.0f;
        }
        return f11 + f10;
    }

    public StaticLayout getDescriptionlayout() {
        return this.f31603p2;
    }

    public TLRPC.TL_availableEffect getEffect() {
        fj fjVar;
        xi xiVar = this.M;
        if ((xiVar != null && !xiVar.h) || (fjVar = this.Q5) == null) {
            return null;
        }
        return fjVar.M0();
    }

    public dj getExplanationLayout() {
        return this.f31618q3;
    }

    public float getExplanationX() {
        return this.f31675u5;
    }

    public float getExplanationY() {
        return this.f31689v5;
    }

    public int getExtraInsetHeight() {
        int i7;
        int i10 = this.f31702w3;
        boolean g22 = g2();
        ch.q0 q0Var = this.O;
        if (g22) {
            if (q0Var.f5487p) {
                i7 = 18;
            } else {
                i7 = 0;
            }
            i10 += org.telegram.messenger.g0.L(i7 + 2) + this.f31645s0.f31912r;
        }
        if (this.f31719x7) {
            i10 += getCommentButtonHeight();
        }
        if (!q0Var.f5487p) {
            this.Q5.getClass();
            return i10 + q0Var.f5485n;
        }
        return i10;
    }

    public int getExtraTextX() {
        int i7 = bz.Y0;
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
        if (!this.Q5.P3() && ((!this.C6 || this.f31565m3 != null) && (i7 = bz.Y0) > 11)) {
            return org.telegram.messenger.g0.L((i7 - 11) / 1.5f);
        }
        if (this.Q5.P3() || !this.f31748zb || !this.G6 || this.Q5.D != 5) {
            return 0;
        }
        return (int) ((org.telegram.messenger.g0.f3(this.X6, w2()) - org.telegram.messenger.g0.f24230u) * 0.7f);
    }

    public StaticLayout getFactCheckLayout() {
        t1 t1Var = this.f31645s0;
        if (t1Var != null) {
            return t1Var.f31902g;
        }
        return null;
    }

    public String getFilename() {
        int i7;
        int i10;
        fj fjVar = this.Q5;
        if (fjVar != null) {
            int i11 = fjVar.D;
            if (i11 == 1) {
                TLRPC.PhotoSize photoSize = this.f31462e4;
                if (photoSize != null) {
                    return org.telegram.messenger.w7.r(null, photoSize);
                }
            } else if (i11 != 8 && (i10 = this.M1) != 7 && i10 != 4 && i10 != 8 && i11 != 9 && i10 != 3 && i10 != 5) {
                if (i10 != 0) {
                    return org.telegram.messenger.w7.r(null, this.N1);
                }
                TLRPC.PhotoSize photoSize2 = this.f31462e4;
                if (photoSize2 != null) {
                    return org.telegram.messenger.w7.r(null, photoSize2);
                }
            } else if (!fjVar.E0) {
                if (fjVar.f24128y0 && !TextUtils.isEmpty(fjVar.f24073k.attachPath)) {
                    return this.Q5.f24073k.attachPath;
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
        TLRPC.User user = this.f31533ja;
        if (user != null && user.f28641id == 0) {
            f10 = this.A7.r();
        } else {
            f10 = this.f31665t9 + this.J1;
        }
        return (int) f10;
    }

    public float getHighlightAlpha() {
        return P1(false);
    }

    public int getIconForCurrentState() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.getIconForCurrentState():int");
    }

    public float getLastTouchX() {
        return this.f31499h1;
    }

    public float getLastTouchY() {
        return this.f31512i1;
    }

    public int getLayoutHeight() {
        return this.f31465e7;
    }

    public int getMaxNameWidth() {
        int min;
        int L;
        fj fjVar;
        fj fjVar2;
        int i7;
        int i10;
        float f10;
        int L2;
        int parentWidth;
        xi xiVar;
        if (u2() && this.L == null) {
            return getCompactContentWidth();
        }
        int i11 = this.M1;
        if (i11 != 6 && i11 != 8 && (i7 = (fjVar2 = this.Q5).D) != 5) {
            aj ajVar = this.L;
            int i12 = 0;
            if (ajVar != null && !ajVar.f23012i) {
                if (org.telegram.messenger.g0.Q1()) {
                    parentWidth = org.telegram.messenger.g0.Q0();
                } else {
                    parentWidth = getParentWidth();
                }
                i10 = 0;
                for (int i13 = 0; i13 < this.L.f23009e.size(); i13++) {
                    if (((xi) this.L.f23009e.get(i13)).f27998c != 0) {
                        break;
                    }
                    i10 = (int) (Math.ceil(((xiVar.f27999e + xiVar.f28003j) / 1000.0f) * parentWidth) + i10);
                }
                if (this.X6) {
                    i12 = 71;
                } else if (b3()) {
                    i12 = 48;
                }
                L2 = org.telegram.messenger.g0.L(i12 + 31);
            } else if (i7 == 19) {
                int i14 = fjVar2.f24118v2;
                int L3 = org.telegram.messenger.g0.f24226q.x - org.telegram.messenger.g0.L(52.0f);
                if (this.G6) {
                    i12 = org.telegram.messenger.g0.L(48.0f);
                }
                return Math.max(i14, (int) ((L3 - i12) * 0.5f));
            } else {
                i10 = this.f31426b7;
                if (fjVar2.f24087n2 && fjVar2.P3() && X(this.Q5)) {
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
            } else if (b3()) {
                f11 = 42.0f;
            }
            L = org.telegram.messenger.g0.L(f11);
        } else {
            min = Math.min(getParentWidth(), org.telegram.messenger.g0.f24226q.y);
            if (this.X6) {
                f11 = 71.0f;
            } else if (b3()) {
                f11 = 42.0f;
            }
            L = org.telegram.messenger.g0.L(f11);
        }
        int i15 = min - L;
        fj fjVar3 = this.Q5;
        if (fjVar3 != null && fjVar3.f24087n2 && fjVar3.P3() && X(this.Q5)) {
            i15 -= org.telegram.messenger.g0.L(25.0f);
        }
        if (this.f31748zb && ((fjVar = this.Q5) == null || !fjVar.T4())) {
            return (i15 - (this.f31426b7 - (org.telegram.messenger.g0.f3(this.X6, w2()) - org.telegram.messenger.g0.f24230u))) - org.telegram.messenger.g0.L(57.0f);
        }
        if (this.X6 && (this.Q5.D == 5 || this.M1 == 6)) {
            return this.f31426b7 - org.telegram.messenger.g0.L(57.0f);
        }
        return (i15 - this.f31426b7) - org.telegram.messenger.g0.L(57.0f);
    }

    public int getMediaOffsetY() {
        y1 y1Var = this.f31521ib;
        if (y1Var.f32445a2) {
            return org.telegram.messenger.g0.W1(y1Var.L1, y1Var.Z1, this.X1);
        }
        return this.X1;
    }

    @Override
    public fj getMessageObject() {
        fj fjVar = this.R5;
        if (fjVar != null) {
            return fjVar;
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
        float f10 = this.f31506h9 + this.f31493g9;
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
        float f10 = this.f31519i9;
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
        return getTopicSeparatorTopPadding() + this.W + this.f31511i0;
    }

    public int getParentWidth() {
        int i7;
        fj fjVar = this.Q5;
        if (fjVar == null) {
            fjVar = this.R5;
        }
        if (fjVar != null && fjVar.f24110t1 && (i7 = this.L0) > 0) {
            return i7;
        }
        return org.telegram.messenger.g0.f24226q.x;
    }

    public float getPhotoBottom() {
        if (e4()) {
            float f10 = this.f31444cc;
            if (f10 > 0.0f) {
                return f10;
            }
            return this.f31465e7 - org.telegram.messenger.g0.L(5.0f);
        }
        m4 m4Var = this.X5;
        if (m4Var != null) {
            return m4Var.f31132e + m4Var.h;
        }
        return this.U0.B();
    }

    public ImageReceiver getPhotoImage() {
        return this.U0;
    }

    public ArrayList<q1> getPollButtons() {
        return this.Q4;
    }

    public float getPollButtonsLeft() {
        int L;
        if (getMessageObject() != null && getMessageObject().P3()) {
            L = (org.telegram.messenger.g0.L(3.0f) + this.f31452d7) - this.f31426b7;
        } else if (this.Y6) {
            L = org.telegram.messenger.g0.L(82.0f);
        } else if (b3()) {
            L = org.telegram.messenger.g0.L(59.0f);
        } else {
            L = org.telegram.messenger.g0.L(11.0f);
        }
        return L;
    }

    public float getPollButtonsRight() {
        return (getPollButtonsLeft() + this.f31426b7) - org.telegram.messenger.g0.L(15.0f);
    }

    public fj getPrimaryMessageObject() {
        fj fjVar;
        fj fjVar2 = this.Q5;
        if (fjVar2 != null && this.L != null && fjVar2.z2()) {
            fjVar = this.L.c();
        } else {
            fjVar = null;
        }
        if (fjVar != null) {
            return fjVar;
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
        aj ajVar = this.L;
        if (ajVar != null && !ajVar.d.isEmpty()) {
            return ((fj) this.L.d.get(0)).M1();
        }
        return this.Q5.M1();
    }

    public org.telegram.ui.ActionBar.i6 getResourcesProvider() {
        return this.Qb;
    }

    public RectF getScrimBlockBounds() {
        return this.f31573md;
    }

    public dn0 getSeekBarWaveform() {
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
        return this.f31536jd;
    }

    public long getStarsPrice() {
        TLRPC.Message message;
        long j3;
        TLRPC.Message message2;
        aj ajVar = this.L;
        if (ajVar != null) {
            ArrayList arrayList = ajVar.d;
            int size = arrayList.size();
            int i7 = 0;
            long j10 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                fj fjVar = (fj) obj;
                if (fjVar != null && (message2 = fjVar.f24073k) != null) {
                    j3 = message2.paid_message_stars;
                } else {
                    j3 = 0;
                }
                j10 += j3;
            }
            return j10;
        }
        fj fjVar2 = this.Q5;
        if (fjVar2 == null || (message = fjVar2.f24073k) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        y1 y1Var = this.f31521ib;
        if (y1Var.f32549z1) {
            return org.telegram.messenger.g0.W1(y1Var.L1, y1Var.f32545y1, this.W);
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
        return this.f31588o0;
    }

    public int getTextY() {
        return this.f31670u0;
    }

    public float getTimeAlpha() {
        return this.f31541k4;
    }

    public float getTimeX() {
        int i7;
        y1 y1Var = this.f31521ib;
        if (y1Var.f32481i1) {
            i7 = org.telegram.messenger.g0.W1(y1Var.L1, y1Var.f32476h1, this.C9);
        } else {
            i7 = this.C9;
        }
        return i7;
    }

    public float getTimeY() {
        int i7;
        int i10 = 0;
        if (H3()) {
            if (this.f31719x7) {
                i10 = u2() ? getCommentButtonHeight() : org.telegram.messenger.g0.L(41.3f);
            }
        } else if (this.Q5.r4()) {
            i7 = -org.telegram.messenger.g0.L(48.0f);
            if (this.f31439c7) {
                i7 -= org.telegram.messenger.g0.L(4.0f);
            }
            return b2(i7);
        } else if (this.f31719x7) {
            i10 = u2() ? getCommentButtonHeight() : org.telegram.messenger.g0.L(43.0f);
        }
        i7 = -i10;
        return b2(i7);
    }

    public int getTopMediaOffset() {
        fj fjVar = this.Q5;
        if (fjVar != null && fjVar.D == 14) {
            return this.X1 + this.Ua;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        y1 y1Var = this.f31521ib;
        if (y1Var.f32533v1) {
            return org.telegram.messenger.g0.W1(y1Var.L1, y1Var.f32530u1, this.f31484g0);
        }
        return this.f31484g0;
    }

    public y1 getTransitionParams() {
        return this.f31521ib;
    }

    public float getVideoTranscriptionProgress() {
        fj fjVar;
        y1 y1Var = this.f31521ib;
        if (y1Var == null || (fjVar = this.Q5) == null || !fjVar.h4()) {
            return 1.0f;
        }
        if (y1Var.f32498m1) {
            if (this.I6) {
                return y1Var.L1;
            }
            return 1.0f - y1Var.L1;
        } else if (this.I6) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public float getViewTop() {
        return this.f31430bb;
    }

    public int getWidthForButtons() {
        y1 y1Var = this.f31521ib;
        if (y1Var.O1) {
            return org.telegram.messenger.g0.W1(y1Var.L1, y1Var.P1, this.K5);
        }
        return this.K5;
    }

    @Override
    public final void h(float f10) {
        fj fjVar = this.Q5;
        if (fjVar == null) {
            return;
        }
        fjVar.f24033b0 = f10;
        fjVar.f24065i0 = (int) (fjVar.L0() * f10);
        U3();
    }

    public final boolean h0(MotionEvent motionEvent) {
        if (!this.f31652s8 || this.f31707w8 == null || this.Ha == null || this.Sa == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float N1 = N1(motionEvent);
        int action = motionEvent.getAction();
        RectF rectF = this.Na;
        if (action == 0) {
            if (rectF.contains(x10, N1)) {
                this.Ha.c(true);
                y yVar = this.f31692v8;
                if (yVar != null) {
                    yVar.setHotspot(x10, N1);
                    this.f31692v8.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.Ha.f37109i && !rectF.contains(x10, N1)) {
                this.Ha.c(false);
                y yVar2 = this.f31692v8;
                if (yVar2 != null) {
                    yVar2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Ha.f37109i) {
                this.Sa.N0(this);
            }
            this.Ha.c(false);
            y yVar3 = this.f31692v8;
            if (yVar3 != null) {
                yVar3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.Ha.c(false);
            y yVar4 = this.f31692v8;
            if (yVar4 != null) {
                yVar4.setState(new int[0]);
            }
        }
        return this.Ha.f37109i;
    }

    public final void h1(android.graphics.Canvas r55, float r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.h1(android.graphics.Canvas, float):void");
    }

    public final boolean h2() {
        org.telegram.ui.ActionBar.i6 i6Var = this.Qb;
        if (i6Var != null) {
            return i6Var.h();
        }
        return org.telegram.ui.ActionBar.n6.d1();
    }

    public final void h3(int i7) {
        n2.p0 p0Var;
        n2.p0 p0Var2 = this.f31674u4;
        if (i7 != -1) {
            Integer valueOf = Integer.valueOf(i7);
            for (int i10 = 0; i10 < p0Var2.f21290a; i10++) {
                if (((Pair) ((ArrayList) p0Var2.f21293e).get(i10)).second == valueOf) {
                    p0Var2.l(i10);
                }
            }
        } else {
            p0Var2.f(true);
        }
        t1 t1Var = this.f31645s0;
        if (t1Var != null && (p0Var = t1Var.f31903i) != null) {
            p0Var.f(true);
        }
        this.f31619q4 = null;
        t1 t1Var2 = this.f31645s0;
        if (t1Var2 != null) {
            t1Var2.f31904j = null;
        }
        if (this.f31634r4 != null) {
            if (this.f31688v4 == i7 || i7 == -1) {
                this.f31634r4 = null;
                this.f31688v4 = -1;
                this.f31469ec = false;
                this.fc = false;
                invalidate();
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
        this.Q5.H0 = j3;
        z0(j3, j10);
        if (this.f31738z1) {
            this.R0.p(true, min);
        } else {
            this.Q0.p(true, min);
        }
        int i7 = this.M1;
        if (i7 != 3 && i7 != 5) {
            if (this.W3 != 0) {
                if (this.X3 != 1) {
                    Q3(false, false, false);
                }
            } else if (this.O3 != 1) {
                Q3(false, false, false);
            }
        } else if (this.W3 != 0) {
            if (this.X3 != 1) {
                Q3(false, false, false);
            }
        } else if (this.O3 != 4) {
            Q3(false, false, false);
        }
    }

    public final boolean i0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.i0(android.view.MotionEvent):boolean");
    }

    public final void i1(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.i1(android.graphics.Canvas):void");
    }

    public final boolean i2() {
        fj fjVar = this.Q5;
        if ((fjVar != null && fjVar.s2()) || this.M5) {
            return true;
        }
        return false;
    }

    public final void i3() {
        if (this.f31591o3 != null) {
            this.f31591o3 = null;
        }
        ArrayList arrayList = this.f31716x4;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f31703w4.addAll(arrayList);
        arrayList.clear();
    }

    @Override
    public void invalidate() {
        m1 m1Var;
        if (this.Q5 == null) {
            return;
        }
        Runnable runnable = this.f32580e;
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
        if ((this.f31425b6 || (this.L != null && r2())) && getParent() != null) {
            View view = (View) getParent();
            if (view.getParent() != null) {
                view.invalidate();
                ((View) view.getParent()).invalidate();
            }
        }
        if (!this.Wb || (m1Var = this.Sa) == null) {
            return;
        }
        m1Var.e();
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
        aj ajVar = this.L;
        if (ajVar != null && ajVar.f23012i) {
            xi xiVar = this.M;
            if (xiVar != null && (xiVar.f28005l & 4) != 0) {
                return this.F;
            }
            return true;
        }
        return this.F;
    }

    public final boolean j0(MotionEvent motionEvent) {
        j9 B2;
        boolean z10;
        boolean z11;
        int i7;
        int L;
        int i10;
        t1 t1Var;
        int L2;
        int extraTextX;
        int i11;
        aj ajVar;
        m1 m1Var = this.Sa;
        if (m1Var != null && (B2 = m1Var.B2()) != null && (B2.b() || B2.e())) {
            ArrayList arrayList = this.Q5.B2;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ev evVar = this.Q5.f24130y2;
            if (evVar != null && !evVar.f23883n.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((z10 || d2() || z11) && ((this.f31538k1 || this.L != null) && (this.L == null || this.Sa.Y()))) {
                if (this.Q5.z2() && (ajVar = this.L) != null && !ajVar.f23012i) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                            View childAt = viewGroup.getChildAt(i12);
                            if (childAt instanceof r1) {
                                r1 r1Var = (r1) childAt;
                                aj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
                                xi currentPosition = r1Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.f23006a == this.L.f23006a && (currentPosition.f28005l & E()) != 0 && (currentPosition.f28005l & 1) != 0) {
                                    B2.f32261c = (int) r1Var.f31648s3;
                                    B2.d = (int) r1Var.f31660t3;
                                    B2.b0(r1Var);
                                    if (r1Var == this) {
                                        return B2.M(motionEvent);
                                    }
                                    motionEvent.offsetLocation(getLeft() - r1Var.getLeft(), getTop() - r1Var.getTop());
                                    boolean M = B2.M(motionEvent);
                                    motionEvent.offsetLocation(-(getLeft() - r1Var.getLeft()), -(getTop() - r1Var.getTop()));
                                    return M;
                                }
                            }
                        }
                    }
                } else {
                    fj fjVar = this.Q5;
                    if (fjVar != null && !fjVar.f24110t1 && (t1Var = this.f31645s0) != null && t1Var.f31902g != null && N1(motionEvent) >= this.f31630r0) {
                        B2.f30977r0 = false;
                        B2.f30979t0 = true;
                        B2.f30981v0 = false;
                        aj ajVar2 = this.L;
                        if (ajVar2 != null && !ajVar2.f23012i) {
                            i11 = (int) this.f31648s3;
                        } else {
                            float f10 = 12.0f;
                            if (this.Q5.P3()) {
                                int extraTextX2 = getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + this.N6;
                                if (this.Q5.D == 19) {
                                    i11 = extraTextX2 - Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(this.X7, this.Z7) + extraTextX2)) - org.telegram.messenger.g0.f24226q.x);
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
                        int L3 = ((int) (i11 + this.f31521ib.f32475h0)) - org.telegram.messenger.g0.L(1.33f);
                        int i14 = this.f31630r0;
                        B2.f32261c = (org.telegram.messenger.g0.L(10.0f) + L3) - this.f31645s0.f31909o;
                        B2.d = org.telegram.messenger.g0.L(22.0f) + i14;
                    } else {
                        if (z11 && R2()) {
                            if (N1(motionEvent) < this.Q5.f24130y2.t() + this.f31670u0) {
                                B2.f30977r0 = false;
                                B2.f30979t0 = false;
                                B2.f30981v0 = true;
                                int i15 = this.f31588o0;
                                int i16 = this.f31670u0;
                                B2.f32261c = i15;
                                B2.d = i16;
                            }
                        }
                        if (d2()) {
                            B2.f30977r0 = false;
                            B2.f30979t0 = false;
                            B2.f30981v0 = false;
                            B2.f32261c = (int) this.f31648s3;
                            B2.d = (int) this.f31660t3;
                        } else {
                            fj fjVar2 = this.Q5;
                            if (fjVar2 != null && !fjVar2.f24110t1 && this.f31603p2 != null && (!this.f31685v1 ? N1(motionEvent) > this.Y1 : N1(motionEvent) < this.f31670u0)) {
                                B2.f30977r0 = true;
                                B2.f30979t0 = false;
                                B2.f30981v0 = false;
                                if (this.T1) {
                                    i10 = this.f31601p0 - org.telegram.messenger.g0.L(10.0f);
                                } else {
                                    if (this.U1) {
                                        i7 = this.f31601p0;
                                        L = org.telegram.messenger.g0.L(1.0f);
                                    } else {
                                        i7 = this.f31601p0;
                                        L = org.telegram.messenger.g0.L(1.0f);
                                    }
                                    i10 = i7 + L;
                                }
                                int L4 = org.telegram.messenger.g0.L(10.0f) + i10 + this.f31407a2;
                                int i17 = this.Y1;
                                B2.f32261c = L4;
                                B2.d = i17;
                            } else if (z11) {
                                B2.f30977r0 = false;
                                B2.f30979t0 = false;
                                B2.f30981v0 = true;
                                int i18 = this.f31588o0;
                                int i19 = this.f31670u0;
                                B2.f32261c = i18;
                                B2.d = i19;
                            } else {
                                B2.f30977r0 = false;
                                B2.f30979t0 = false;
                                B2.f30981v0 = false;
                                int i20 = this.f31588o0;
                                int i21 = this.f31670u0;
                                B2.f32261c = i20;
                                B2.d = i21;
                            }
                        }
                    }
                    B2.b0(this);
                    return B2.M(motionEvent);
                }
            }
        }
        return false;
    }

    public void j1(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.j1(android.graphics.Canvas):void");
    }

    public final boolean j2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.j2():boolean");
    }

    public final void j3() {
        CharSequence charSequence;
        long j3;
        long j10;
        long j11;
        long j12;
        e1 e1Var = this.Yb;
        l2.c cVar = this.f31711x;
        cVar.a(e1Var);
        e1 e1Var2 = this.Zb;
        cVar.a(e1Var2);
        fj fjVar = this.Q5;
        if (fjVar != null) {
            if (!TextUtils.isEmpty(fjVar.f24131z)) {
                charSequence = this.Q5.f24131z;
            } else {
                charSequence = this.Q5.v;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i7 = k00.f36581e;
                int i10 = 0;
                ArrayList arrayList = null;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    k00[] k00VarArr = (k00[]) spanned.getSpans(0, spanned.length(), k00.class);
                    for (k00 k00Var : k00VarArr) {
                        if (k00Var.f36583b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(k00VarArr.length);
                            }
                            arrayList.add(Integer.valueOf(k00Var.f36583b.date));
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
                        cVar.a(e1Var2);
                        bt btVar = new bt(25, cVar, e1Var2);
                        cVar.f19363a.put(e1Var2, btVar);
                        if (j16 > 0) {
                            org.telegram.messenger.g0.h3(btVar, j16);
                        } else {
                            org.telegram.messenger.g0.g3(btVar);
                        }
                    }
                }
            }
        }
    }

    public final boolean k0(MotionEvent motionEvent) {
        if (this.Q5.r4() && this.Q5.f24034b1) {
            int x10 = (int) motionEvent.getX();
            int N1 = (int) N1(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f10 = x10;
                if (f10 >= this.f31539k2 - org.telegram.messenger.g0.L(6.0f) && f10 <= this.f31539k2 + this.f31513i2 + org.telegram.messenger.g0.L(6.0f)) {
                    float f11 = N1;
                    if (f11 >= this.f31551l2 - org.telegram.messenger.g0.L(2.0f) && f11 <= this.f31551l2 + this.f31526j2 + org.telegram.messenger.g0.L(2.0f)) {
                        lc lcVar = this.f31576n2;
                        if (lcVar != null) {
                            lcVar.c(true);
                        }
                        this.f31564m2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.f31564m2) {
                m1 m1Var = this.Sa;
                if (m1Var != null) {
                    m1Var.U1();
                }
                lc lcVar2 = this.f31576n2;
                if (lcVar2 != null) {
                    lcVar2.c(false);
                }
                playSoundEffect(0);
                this.f31564m2 = false;
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
        fi.s2 s2Var = this.U0;
        float alpha = s2Var.getAlpha();
        if (this.Q5.g4()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        s2Var.setAlpha(f10 * alpha);
        s2Var.h(canvas, null);
        s2Var.setAlpha(alpha);
        canvas.restore();
        Paint a22 = a2("paintChatTimeBackground");
        int alpha2 = a22.getAlpha();
        a22.setAlpha((int) (alpha2 * this.f31553l4 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, a22);
        a22.setAlpha(alpha2);
    }

    public final boolean k2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.k2():boolean");
    }

    public final void k3(int i7, int i10, String str) {
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
    public final boolean l() {
        return this.f31747za;
    }

    public final boolean l0(MotionEvent motionEvent) {
        c1 c1Var;
        y yVar;
        if (this.I4 && ((!this.f31748zb || getVideoTranscriptionProgress() > 0.0f || this.T2) && (c1Var = this.J4) != null)) {
            int action = motionEvent.getAction();
            float x10 = motionEvent.getX();
            float N1 = N1(motionEvent);
            if (action != 1 && action != 3) {
                if (c1Var.v.contains((int) x10, (int) N1)) {
                    if (action == 0) {
                        c1Var.A = true;
                    }
                    if (c1Var.A && (yVar = c1Var.f35884q) != null) {
                        yVar.setHotspot(x10, N1);
                        c1Var.f35884q.setState(i21.N);
                        c1Var.f35885r.invalidate();
                    }
                    return true;
                }
            } else if (c1Var.A && action == 1) {
                c1Var.p();
                return true;
            } else {
                c1Var.A = false;
            }
        }
        return false;
    }

    public boolean l1(Canvas canvas) {
        org.telegram.ui.Components.b6 m10;
        int i7;
        boolean z10;
        fj fjVar = this.Q5;
        fi.s2 s2Var = this.U0;
        if (fjVar != null && fjVar.D3() && (m10 = s2Var.m()) != null && (i7 = m10.d[4]) > 0) {
            float l10 = 1.0f - Utilities.l(((i7 - 90) - m10.o()) / 500.0f);
            if (l10 > 0.0f) {
                if (l10 < 1.0f) {
                    z10 = s2Var.h(canvas, null);
                } else {
                    z10 = true;
                }
                s2Var.U0 = true;
                float alpha = s2Var.getAlpha();
                s2Var.setAlpha(l10 * alpha);
                s2Var.h(canvas, null);
                s2Var.setAlpha(alpha);
                s2Var.U0 = false;
                return z10;
            }
        }
        return s2Var.h(canvas, null);
    }

    public final boolean l2() {
        fj fjVar = this.Q5;
        if (fjVar != null && fjVar.O5()) {
            xi xiVar = this.M;
            if (xiVar != null) {
                int i7 = xiVar.f28005l;
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
        aj ajVar;
        aj ajVar2;
        fj fjVar;
        if (!z11 || (fjVar = this.Q5) == null || !fjVar.f24028a0) {
            if (z10) {
                this.f31591o3 = null;
                CheckBoxBase checkBoxBase = this.f31563m1;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, this.Qb);
                    this.f31563m1 = checkBoxBase2;
                    if (this.O0) {
                        checkBoxBase2.f32933l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.i6 i6Var = this.Qb;
                    if (checkBoxBase.F != i6Var) {
                        checkBoxBase.F = i6Var;
                        checkBoxBase.b();
                    }
                }
            }
            if (z10 && (((ajVar = this.L) != null && ajVar.d.size() > 1) || ((ajVar2 = this.S5) != null && ajVar2.d.size() > 1))) {
                CheckBoxBase checkBoxBase3 = this.l1;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, this, this.Qb);
                    this.l1 = checkBoxBase4;
                    if (!checkBoxBase4.f32945y) {
                        checkBoxBase4.f32945y = true;
                        checkBoxBase4.b();
                    }
                    if (this.O0) {
                        this.l1.f32933l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.i6 i6Var2 = this.Qb;
                    if (checkBoxBase3.F != i6Var2) {
                        checkBoxBase3.F = i6Var2;
                        checkBoxBase3.b();
                    }
                }
            }
            float f10 = 0.0f;
            if (this.n1 == z10) {
                if (z11 != this.f31589o1 && !z11) {
                    if (z10) {
                        f10 = 1.0f;
                    }
                    this.f31602p1 = f10;
                    invalidate();
                    return;
                }
                return;
            }
            this.f31589o1 = z11;
            this.n1 = z10;
            if (z11) {
                this.f31616q1 = SystemClock.elapsedRealtime();
            } else {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f31602p1 = f10;
            }
            invalidate();
        }
    }

    @Override
    public final boolean m() {
        aj ajVar = this.L;
        if (ajVar != null && ajVar.f23012i) {
            xi xiVar = this.M;
            if (xiVar != null && (xiVar.f28005l & 8) != 0) {
                return this.G;
            }
            return true;
        }
        return this.G;
    }

    public final boolean m0() {
        fj fjVar = this.Q5;
        if (fjVar != null && fjVar.D == 17) {
            TLRPC.MessageMedia n1 = fj.n1(fjVar.f24073k);
            if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                return ((TLRPC.TL_messageMediaPoll) n1).results.has_unread_votes;
            }
        }
        return false;
    }

    public final void m1(Canvas canvas, int i7) {
        int i10;
        dj djVar;
        fj fjVar;
        m1 m1Var = this.Sa;
        int i11 = 0;
        if (m1Var != null) {
            if (!m1Var.z1(this, 1)) {
                this.A4 = null;
                ArrayList arrayList = this.f31741z4;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < this.f31741z4.size(); i12++) {
                        p1 p1Var = (p1) this.f31741z4.get(i12);
                        if (!p1Var.f31302a.d()) {
                            p1Var.f31302a.a();
                        }
                    }
                }
            } else {
                CharacterStyle R1 = this.Sa.R1(this);
                if (R1 != this.A4) {
                    this.A4 = R1;
                    n80 n80Var = this.f31729y4;
                    if (n80Var != null) {
                        n80Var.a();
                        this.f31729y4 = null;
                    }
                    n80 n80Var2 = new n80();
                    this.f31729y4 = n80Var2;
                    n80Var2.D = true;
                    e80 e80Var = new e80(0);
                    n80 n80Var3 = this.f31729y4;
                    n80Var3.f37730y = e80Var;
                    n80Var3.k(5.0f);
                    ?? obj = new Object();
                    obj.f31302a = this.f31729y4;
                    obj.f31303b = -3;
                    if (this.f31741z4 == null) {
                        this.f31741z4 = new ArrayList();
                    }
                    this.f31741z4.add(obj);
                    if (this.A4 != null && !F1(obj, e80Var, this.f31603p2, -2) && (((djVar = this.f31565m3) == null || !G1(obj, e80Var, djVar.f23662e)) && (fjVar = this.Q5) != null)) {
                        G1(obj, e80Var, fjVar.B2);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.f31741z4;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            fj fjVar2 = this.Q5;
            if (fjVar2 != null && fjVar2.P3()) {
                i10 = org.telegram.ui.ActionBar.n6.Dc;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.Ce;
            }
            int w02 = org.telegram.ui.ActionBar.n6.w0(i10, this.Qb);
            while (i11 < this.f31741z4.size()) {
                p1 p1Var2 = (p1) this.f31741z4.get(i11);
                if (p1Var2.f31303b == i7) {
                    n80 n80Var4 = p1Var2.f31302a;
                    n80Var4.g(org.telegram.ui.ActionBar.n6.r1(0.85f, w02), org.telegram.ui.ActionBar.n6.r1(2.0f, w02), org.telegram.ui.ActionBar.n6.r1(3.5f, w02), org.telegram.ui.ActionBar.n6.r1(6.0f, w02));
                    n80Var4.draw(canvas);
                    invalidate();
                    if (n80Var4.c()) {
                        this.f31741z4.remove(i11);
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

    public final void m3(boolean z10, boolean z11) {
        this.D6 = z10;
        this.f31705w6 = z11;
        V3();
        if (this.C4) {
            this.E4.f34407o = A2();
        } else {
            this.D4.f42115p = A2();
        }
        invalidate();
    }

    public final boolean n0(float f10, int i7) {
        ch.q0 q0Var = this.O;
        if (!q0Var.H) {
            return false;
        }
        float y10 = getY() + q0Var.f5476c;
        if (y10 <= f10 || (y10 + q0Var.f5484m) - org.telegram.messenger.g0.L(16.0f) >= i7) {
            return false;
        }
        return true;
    }

    public void n1(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.n1(android.graphics.Canvas):void");
    }

    public final boolean n2() {
        ArrayList arrayList;
        dj djVar = this.f31565m3;
        if (djVar != null && (arrayList = djVar.f23662e) != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (!((cj) obj).f23483y.isEmpty()) {
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
                if (!((cj) obj2).f23483y.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void n3(boolean z10, boolean z11, boolean z12) {
        fj fjVar;
        if (z10 || !z12 || (fjVar = this.Q5) == null || !fjVar.f24028a0) {
            CheckBoxBase checkBoxBase = this.f31563m1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z11, z12);
            }
            CheckBoxBase checkBoxBase2 = this.l1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z10, z12);
            }
            u90 u90Var = this.Ta;
            float f10 = 0.0f;
            if (u90Var.f40329e == z11) {
                if (u90Var.f40330f != z12 && !z12) {
                    if (z11) {
                        f10 = 1.0f;
                    }
                    u90Var.d = f10;
                    u90Var.f40330f = false;
                    return;
                }
                return;
            }
            u90Var.f40329e = z11;
            u90Var.f40330f = z12;
            if (z12) {
                u90Var.f40328c = SystemClock.elapsedRealtime();
            } else {
                if (z11) {
                    f10 = 1.0f;
                }
                u90Var.d = f10;
            }
            u90Var.a();
            r1 r1Var = u90Var.f40336m;
            if (r1Var != null) {
                r1Var.invalidate();
                if (r1Var.getParent() != null) {
                    ((ViewGroup) r1Var.getParent()).invalidate();
                }
            }
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
        this.Q5.H0 = j3;
        RadialProgress2 radialProgress2 = this.Q0;
        radialProgress2.p(true, min);
        if (j3 == j10 && ((this.M != null || ((message = this.Q5.f24073k) != null && message.paid_message_stars > 0)) && zy.C(this.f31411a6).J(this.Q5.e1()) && ((i7 = this.O3) == 1 || (i7 == 4 && this.M1 == 5)))) {
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
        org.telegram.messenger.x8 x8Var;
        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(this.f31411a6);
        String filename = getFilename();
        if (filename == null || (x8Var = (org.telegram.messenger.x8) G.h.get(filename)) == null || !x8Var.T) {
            return false;
        }
        x8Var.T = false;
        return true;
    }

    public void o1(Canvas canvas, float f10, Integer num) {
        boolean z10;
        boolean z11 = this.f31735yb;
        float f11 = 1.0f;
        ch.q0 q0Var = this.O;
        if (z11) {
            q0Var.f5474a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.V4 && l2()) {
            if (q0Var.f5474a > 0.0f) {
                z();
            }
            if (getAlpha() * f10 != 1.0f) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (getAlpha() * f10 * 255.0f), 31);
                z10 = true;
            } else {
                z10 = false;
            }
            int i7 = (q0Var.f5474a > 0.0f ? 1 : (q0Var.f5474a == 0.0f ? 0 : -1));
            y1 y1Var = this.f31521ib;
            if (i7 <= 0 && y1Var.f32540x0 && this.M == null && !this.f31735yb) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + y1Var.f32485j0);
                q0Var.A = 0.0f;
                q0Var.B = false;
                if (y1Var.h) {
                    f11 = y1Var.L1;
                }
                q0Var.d(canvas, f11, num);
                canvas.restore();
            } else {
                q0Var.A = 0.0f;
                q0Var.B = false;
                if (y1Var.h) {
                    f11 = y1Var.L1;
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
            cj cjVar = (cj) arrayList.get(i12);
            if (i7 >= cjVar.f23478n && i7 < cjVar.f23479r) {
                this.A0 = i12;
                i3();
                try {
                    e80 c32 = c3();
                    c32.f38246c = true;
                    c32.d(cjVar.f23476e, i7, 0.0f);
                    cjVar.f23476e.getSelectionPath(i7, i10, c32);
                    c32.a();
                    float f10 = cjVar.f23481w + cjVar.h;
                    if (i10 >= cjVar.f23478n + i11) {
                        for (int i13 = i12 + 1; i13 < arrayList.size(); i13++) {
                            cj cjVar2 = (cj) arrayList.get(i13);
                            int i14 = cjVar2.f23479r - cjVar2.f23478n;
                            e80 c33 = c3();
                            c33.f38246c = true;
                            float f11 = f10 + cjVar2.f23477f;
                            c33.d(cjVar2.f23476e, 0, f11);
                            f10 = f11 + cjVar2.f23481w + cjVar2.h;
                            cjVar2.f23476e.getSelectionPath(0, i10 - cjVar2.f23478n, c33);
                            c33.a();
                            if (i10 < (cjVar.f23478n + i14) - 1) {
                                break;
                            }
                        }
                    }
                    if (this.B0) {
                        this.f31731y6 = true;
                        this.f31743z6 = 2500;
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
        this.f31540k3 = -1;
    }

    public final boolean o3(boolean z10) {
        vo voVar;
        r1 r1Var;
        if (this.Q5.T2()) {
            Drawable t6 = this.U0.t();
            if (t6 instanceof lh0) {
                final lh0 lh0Var = (lh0) t6;
                String C0 = this.Q5.C0();
                TLRPC.TL_messages_stickerSet p02 = ri.d0(this.f31411a6).p0(C0);
                if (p02 == null) {
                    ri.d0(this.f31411a6).f1(C0, true, true);
                    return false;
                }
                int D0 = this.Q5.D0();
                if ("🎰".equals(this.Q5.C0())) {
                    if (D0 >= 0 && D0 <= 64) {
                        ku0 ku0Var = (ku0) lh0Var;
                        if (ku0Var.V0 != null || ku0Var.W0) {
                            r1Var = this;
                        } else {
                            int i7 = D0 - 1;
                            int X = ku0.X(i7 & 3);
                            int X2 = ku0.X((i7 >> 2) & 3);
                            int X3 = ku0.X(i7 >> 4);
                            if (X == 4 && X2 == 4 && X3 == 4) {
                                X = 5;
                                X3 = 5;
                                X2 = 5;
                            }
                            ku0Var.f36885c1 = X;
                            ku0Var.f36886d1 = X2;
                            ku0Var.f36887e1 = X3;
                            fj messageObject = getMessageObject();
                            int i10 = getMessageObject().K1;
                            ku0Var.W0 = true;
                            r1Var = this;
                            Utilities.f22877e.c(new oi.q2(ku0Var, p02, i10, messageObject, r1Var, z10));
                        }
                        if (r1Var.Q5.N3()) {
                            lh0Var.S(Integer.MAX_VALUE, r1Var.f31612pb);
                        }
                        r1Var.Q5.n1 = false;
                    } else {
                        r1Var = this;
                    }
                    if (lh0Var.f37816n0 == null && !lh0Var.Z0 && p02.documents.size() > 0) {
                        ku0 ku0Var2 = (ku0) lh0Var;
                        if (ku0Var2.f37816n0 == null && !ku0Var2.Z0) {
                            ku0Var2.Z0 = true;
                            Utilities.f22877e.c(new ai.d1(ku0Var2, p02, getMessageObject().K1, getMessageObject(), r1Var, 19));
                            return true;
                        }
                    }
                } else {
                    if (lh0Var.f37816n0 == null && !lh0Var.Z0 && p02.documents.size() > 0) {
                        TLRPC.Document document = p02.documents.get(0);
                        org.telegram.messenger.w7.G(this.f31411a6);
                        File J = org.telegram.messenger.w7.J(document, null, true, true);
                        if (lh0Var.f37816n0 == null && !lh0Var.Z0) {
                            final String y22 = org.telegram.messenger.g0.y2(J, 0);
                            if (TextUtils.isEmpty(y22)) {
                                org.telegram.messenger.a6.q(this.f31411a6).a(org.telegram.messenger.w7.r(null, document), this.Q5, this);
                                org.telegram.messenger.w7.G(this.f31411a6).W(document, p02, 1, 1);
                            } else {
                                lh0Var.Z0 = true;
                                Utilities.f22877e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final lh0 lh0Var2 = lh0Var;
                                                String str = y22;
                                                if (lh0Var2.X0) {
                                                    org.telegram.messenger.g0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    lh0 lh0Var3 = lh0Var2;
                                                                    lh0Var3.Z0 = false;
                                                                    if (!lh0Var3.W0 && lh0Var3.X0) {
                                                                        lh0Var3.C(true);
                                                                        return;
                                                                    }
                                                                    lh0Var3.l();
                                                                    lh0Var3.I();
                                                                    lh0Var3.x();
                                                                    return;
                                                                default:
                                                                    lh0 lh0Var4 = lh0Var2;
                                                                    lh0Var4.W0 = false;
                                                                    if (!lh0Var4.Z0 && lh0Var4.X0) {
                                                                        lh0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                lh0Var2.V0 = RLottieNative.b(str, null, null, null);
                                                int i11 = 0;
                                                if (lh0Var2.V0 != null) {
                                                    i11 = lh0Var2.V0.f33149a[0];
                                                }
                                                if (lh0Var2.V0 != null) {
                                                    int i12 = lh0Var2.V0.f33149a[1];
                                                }
                                                org.telegram.messenger.g0.g3(new org.telegram.ui.ii(lh0Var2, i11, 17));
                                                return;
                                            default:
                                                final lh0 lh0Var3 = lh0Var;
                                                lh0Var3.f37816n0 = RLottieNative.b(y22, lh0Var3.f37805e, null, null);
                                                org.telegram.messenger.g0.g3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                lh0 lh0Var32 = lh0Var3;
                                                                lh0Var32.Z0 = false;
                                                                if (!lh0Var32.W0 && lh0Var32.X0) {
                                                                    lh0Var32.C(true);
                                                                    return;
                                                                }
                                                                lh0Var32.l();
                                                                lh0Var32.I();
                                                                lh0Var32.x();
                                                                return;
                                                            default:
                                                                lh0 lh0Var4 = lh0Var3;
                                                                lh0Var4.W0 = false;
                                                                if (!lh0Var4.Z0 && lh0Var4.X0) {
                                                                    lh0Var4.C(true);
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
                        org.telegram.messenger.a6.q(this.f31411a6).v(this);
                    }
                    if (D0 >= 0 && D0 < p02.documents.size()) {
                        if (!z10 && this.Q5.N3() && (voVar = (vo) mp.u1(this.f31411a6).f25774j4.get(C0)) != null && voVar.f27556b == D0) {
                            lh0Var.S(voVar.f27555a, this.f31612pb);
                        }
                        TLRPC.Document document2 = p02.documents.get(Math.max(D0, 0));
                        org.telegram.messenger.w7.G(this.f31411a6);
                        File J2 = org.telegram.messenger.w7.J(document2, null, true, true);
                        if (lh0Var.V0 == null && !lh0Var.W0) {
                            final String y23 = org.telegram.messenger.g0.y2(J2, 0);
                            if (TextUtils.isEmpty(y23)) {
                                org.telegram.messenger.a6.q(this.f31411a6).a(org.telegram.messenger.w7.r(null, document2), this.Q5, this);
                                org.telegram.messenger.w7.G(this.f31411a6).W(document2, p02, 1, 1);
                                this.Q5.n1 = false;
                            } else {
                                if (z10 && lh0Var.R == null && lh0Var.S == null && lh0Var.Q == null) {
                                    lh0Var.K = 2;
                                    lh0Var.Y0 = true;
                                }
                                lh0Var.W0 = true;
                                Utilities.f22877e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final lh0 lh0Var2 = lh0Var;
                                                String str = y23;
                                                if (lh0Var2.X0) {
                                                    org.telegram.messenger.g0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    lh0 lh0Var32 = lh0Var2;
                                                                    lh0Var32.Z0 = false;
                                                                    if (!lh0Var32.W0 && lh0Var32.X0) {
                                                                        lh0Var32.C(true);
                                                                        return;
                                                                    }
                                                                    lh0Var32.l();
                                                                    lh0Var32.I();
                                                                    lh0Var32.x();
                                                                    return;
                                                                default:
                                                                    lh0 lh0Var4 = lh0Var2;
                                                                    lh0Var4.W0 = false;
                                                                    if (!lh0Var4.Z0 && lh0Var4.X0) {
                                                                        lh0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                lh0Var2.V0 = RLottieNative.b(str, null, null, null);
                                                int i11 = 0;
                                                if (lh0Var2.V0 != null) {
                                                    i11 = lh0Var2.V0.f33149a[0];
                                                }
                                                if (lh0Var2.V0 != null) {
                                                    int i12 = lh0Var2.V0.f33149a[1];
                                                }
                                                org.telegram.messenger.g0.g3(new org.telegram.ui.ii(lh0Var2, i11, 17));
                                                return;
                                            default:
                                                final lh0 lh0Var3 = lh0Var;
                                                lh0Var3.f37816n0 = RLottieNative.b(y23, lh0Var3.f37805e, null, null);
                                                org.telegram.messenger.g0.g3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                lh0 lh0Var32 = lh0Var3;
                                                                lh0Var32.Z0 = false;
                                                                if (!lh0Var32.W0 && lh0Var32.X0) {
                                                                    lh0Var32.C(true);
                                                                    return;
                                                                }
                                                                lh0Var32.l();
                                                                lh0Var32.I();
                                                                lh0Var32.x();
                                                                return;
                                                            default:
                                                                lh0 lh0Var4 = lh0Var3;
                                                                lh0Var4.W0 = false;
                                                                if (!lh0Var4.Z0 && lh0Var4.X0) {
                                                                    lh0Var4.C(true);
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
                        org.telegram.messenger.a6.q(this.f31411a6).v(this);
                        this.Q5.n1 = false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        r1 r1Var;
        float f10;
        float f11;
        sh.e eVar;
        sh.e eVar2;
        org.telegram.ui.Components.c9 c9Var;
        super.onAttachedToWindow();
        xi.e eVar3 = this.xc;
        if (eVar3 != null) {
            eVar3.b();
            this.xc = null;
        }
        xi.e eVar4 = new xi.e(ks.f(this.f31411a6), this);
        eVar4.c(ks.E0);
        eVar4.f(ks.f25249m1);
        eVar4.f(ks.l1);
        eVar4.f(ks.f25247l4);
        eVar4.f(ks.Y2);
        this.xc = eVar4;
        fj fjVar = this.Q5;
        if (fjVar != null) {
            fjVar.f24075k1 = false;
            ev evVar = fjVar.f24130y2;
            if (evVar != null) {
                evVar.b(this);
            }
        }
        ev evVar2 = this.f31521ib.M0;
        if (evVar2 != null) {
            evVar2.b(this);
        }
        w1 w1Var = this.f31514i3;
        if (w1Var != null && (c9Var = w1Var.f32315b) != null) {
            c9Var.e();
        }
        x1 x1Var = this.f31714x2;
        if (x1Var != null && (eVar2 = x1Var.f32393m) != null) {
            eVar2.a();
        }
        x1 x1Var2 = this.f31714x2;
        if (x1Var2 != null && (eVar = x1Var2.f32394n) != null) {
            eVar.a();
        }
        ArrayList arrayList = this.Q4;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((q1) obj).a();
        }
        fj fjVar2 = this.R5;
        if (fjVar2 != null) {
            fjVar2.f24075k1 = false;
            r1Var = this;
            r1Var.x3(fjVar2, this.S5, this.U5, this.T5, this.V5, this.W5);
            r1Var.R5 = null;
            r1Var.S5 = null;
        } else {
            r1Var = this;
        }
        CheckBoxBase checkBoxBase = r1Var.f31563m1;
        if (checkBoxBase != null) {
            checkBoxBase.f32933l = true;
        }
        CheckBoxBase checkBoxBase2 = r1Var.l1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f32933l = true;
        }
        q01 q01Var = r1Var.f31472f0;
        if (q01Var != null) {
            q01Var.a();
        }
        CheckBoxBase checkBoxBase3 = r1Var.P7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f32933l = true;
        }
        if (r1Var.f31479f7 != null) {
            int i10 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = r1Var.f31479f7;
                if (i10 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i10].f32933l = true;
                i10++;
            }
        }
        r1Var.O0 = true;
        float f12 = 0.0f;
        r1Var.f31549kd = 0.0f;
        r1Var.f31536jd = 0.0f;
        r1Var.f31631r1 = 0;
        b4();
        ImageReceiver imageReceiver = r1Var.A7;
        imageReceiver.I0((View) getParent());
        imageReceiver.Q();
        n1 n1Var = r1Var.f31509hc;
        if (n1Var != null) {
            n1Var.f31199b.Q();
        }
        n1 n1Var2 = r1Var.f31522ic;
        if (n1Var2 != null) {
            n1Var2.f31199b.Q();
        }
        R();
        fj fjVar3 = r1Var.Q5;
        if (fjVar3 != null) {
            setAvatar(fjVar3);
        }
        int i11 = r1Var.M1;
        if (i11 == 4 && r1Var.H5) {
            boolean I = MediaController.B().I(r1Var.Q5);
            r1Var.F1 = I;
            if (I) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            r1Var.H1 = f11;
            r1Var.G1 = 0;
        } else {
            r1Var.F1 = false;
            r1Var.H1 = 0.0f;
            if ((i11 == 4 || i11 == 2) && r1Var.B1) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            r1Var.E1 = f10;
        }
        if (getDelegate() != null && getDelegate().B2() != null) {
            j9 B2 = getDelegate().B2();
            B2.getClass();
            if (getMessageObject() != null && getMessageObject().e1() == B2.f32290w) {
                B2.W = r1Var;
            }
        }
        if (r1Var.M1 == 5) {
            boolean I2 = MediaController.B().I(r1Var.Q5);
            d1 D1 = D1();
            if (I2) {
                f12 = 1.0f;
            }
            D1.h = f12;
        }
        ch.q0 q0Var = r1Var.O;
        ArrayList arrayList2 = q0Var.f5490s;
        q0Var.D = true;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            ((ch.n0) arrayList2.get(i12)).a();
        }
        org.telegram.messenger.n6 n6Var = r1Var.f31585nb;
        if (n6Var != null) {
            n6Var.a();
        }
        m4 m4Var = r1Var.X5;
        if (m4Var != null) {
            ArrayList arrayList3 = m4Var.f31131c;
            if (!m4Var.C) {
                m4Var.C = true;
                xh.e eVar5 = m4Var.f31138l;
                if (eVar5 != null) {
                    eVar5.b(m4Var.f31129a);
                }
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    l4 l4Var = (l4) arrayList3.get(i13);
                    if (!l4Var.N) {
                        l4Var.N = true;
                        l4Var.f31080f.Q();
                    }
                }
            }
        }
        T3();
        fj fjVar4 = r1Var.Q5;
        if (fjVar4 != null && fjVar4.D == 20 && r1Var.X9 != null) {
            invalidate();
        }
        org.telegram.ui.Components.m5 m5Var = r1Var.f31625qa;
        if (m5Var != null) {
            m5Var.a();
        }
        org.telegram.ui.Components.m5 m5Var2 = r1Var.f31640ra;
        if (m5Var2 != null) {
            m5Var2.a();
        }
        xh.e eVar6 = r1Var.Q9;
        if (eVar6 != null) {
            if (eVar6.f60670i) {
                xh.e Y2 = Y2();
                r1Var.Q9 = Y2;
                Integer num = r1Var.R9;
                if (num != null) {
                    Y2.f60672k.put(this, num);
                }
            } else {
                eVar6.a(this);
            }
        }
        m0 m0Var = r1Var.f31698w;
        if (m0Var != null) {
            ArrayList arrayList4 = m0Var.f31117q;
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((l0) arrayList4.get(i14)).a();
            }
        }
        pv0 pv0Var = r1Var.f31473f1;
        if (pv0Var != null) {
            for (int i15 = 0; i15 < pv0Var.f38592b; i15++) {
                pv0Var.f38593c[i15].a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        v1 v1Var;
        org.telegram.ui.Components.c9 c9Var;
        bg.r rVar;
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
        CheckBoxBase checkBoxBase = this.f31563m1;
        if (checkBoxBase != null) {
            checkBoxBase.f32933l = false;
        }
        x1 x1Var = this.f31714x2;
        if (x1Var != null && (eVar2 = x1Var.f32393m) != null) {
            eVar2.f57556b.S();
            eVar2.f57572y.f();
        }
        x1 x1Var2 = this.f31714x2;
        if (x1Var2 != null && (eVar = x1Var2.f32394n) != null) {
            eVar.f57556b.S();
            eVar.f57572y.f();
        }
        x1 x1Var3 = this.f31714x2;
        if (x1Var3 != null && (rVar = x1Var3.f32390j) != null) {
            rVar.b();
            this.f31714x2.f32390j = null;
        }
        ev evVar = this.Q5.f24130y2;
        if (evVar != null) {
            evVar.f(this);
        }
        y1 y1Var = this.f31521ib;
        ev evVar2 = y1Var.M0;
        if (evVar2 != null) {
            evVar2.f(this);
        }
        ArrayList arrayList = this.Q4;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((q1) obj).b();
        }
        w1 w1Var = this.f31514i3;
        if (w1Var != null && (c9Var = w1Var.f32315b) != null) {
            c9Var.f();
        }
        CheckBoxBase checkBoxBase2 = this.l1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f32933l = false;
        }
        if (this.f31479f7 != null) {
            int i10 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.f31479f7;
                if (i10 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i10].f32933l = false;
                i10++;
            }
        }
        CheckBoxBase checkBoxBase3 = this.P7;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f32933l = false;
        }
        this.O0 = false;
        m4 m4Var = this.X5;
        if (m4Var != null) {
            m4Var.e();
        }
        this.A7.S();
        n1 n1Var = this.f31509hc;
        if (n1Var != null) {
            n1Var.f31199b.S();
        }
        n1 n1Var2 = this.f31522ic;
        if (n1Var2 != null) {
            n1Var2.f31199b.S();
        }
        q01 q01Var = this.f31472f0;
        if (q01Var != null) {
            q01Var.b();
        }
        R();
        if (this.G3 && (v1Var = this.f31657t0) != null && v1Var.d != null && v1Var.f32226e != null) {
            org.telegram.messenger.ec D = org.telegram.messenger.ec.D();
            String str = this.f31657t0.d;
            if (str != null) {
                D.A.remove(str);
            }
            this.G3 = false;
        }
        pv0 pv0Var = this.f31473f1;
        if (pv0Var != null) {
            pv0Var.a(this);
        }
        org.telegram.messenger.a6.q(this.f31411a6).v(this);
        if (getDelegate() != null && getDelegate().B2() != null) {
            j9 B2 = getDelegate().B2();
            B2.getClass();
            if (getMessageObject() != null && getMessageObject().e1() == B2.f32290w) {
                B2.W = null;
            }
        }
        y1Var.f32536w0 = false;
        if (MediaController.B().I(this.Q5)) {
            org.telegram.ui.ActionBar.n6.A0().f35046i = null;
        }
        ValueAnimator valueAnimator = this.f31681ub;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f31681ub.cancel();
        }
        this.O.p();
        this.f31667tb = false;
        org.telegram.messenger.n6 n6Var = this.f31585nb;
        if (n6Var != null) {
            n6Var.e();
        }
        org.telegram.ui.Components.m5 m5Var = this.f31625qa;
        if (m5Var != null) {
            m5Var.b();
        }
        org.telegram.ui.Components.m5 m5Var2 = this.f31640ra;
        if (m5Var2 != null) {
            m5Var2.b();
        }
        xh.e eVar4 = this.Q9;
        if (eVar4 != null) {
            eVar4.b(this);
        }
        m0 m0Var = this.f31698w;
        if (m0Var != null) {
            ArrayList arrayList2 = m0Var.f31117q;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                l0 l0Var = (l0) arrayList2.get(i11);
                int i12 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = l0Var.f31050c;
                    if (i12 < imageReceiverArr.length) {
                        imageReceiverArr[i12].S();
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
        rk0 d42 = d4();
        int i7 = 0;
        if (d42 != null && motionEvent.isFromSource(8194)) {
            float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.f31511i0 + this.f31670u0;
            motionEvent.offsetLocation(-this.f31588o0, -topicSeparatorTopPadding);
            Rect rect = d42.f28442b;
            if (d42.f39332e0 != null && d42.f39333f0) {
                motionEvent.offsetLocation((-rect.left) + d42.f39338k0, -rect.top);
                try {
                    if (motionEvent.getX() >= 0.0f && motionEvent.getX() < d42.u0() && motionEvent.getY() >= 0.0f && motionEvent.getY() < d42.f39337j0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d42.f39332e0.m(motionEvent, z10);
                    motionEvent.offsetLocation(rect.left - d42.f39338k0, rect.top);
                } catch (Throwable th2) {
                    motionEvent.offsetLocation(rect.left - d42.f39338k0, rect.top);
                    throw th2;
                }
            }
            motionEvent.offsetLocation(this.f31588o0, topicSeparatorTopPadding);
        }
        int x10 = (int) motionEvent.getX();
        int N1 = (int) N1(motionEvent);
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            while (true) {
                SparseArray sparseArray = this.f31723xb;
                if (i7 >= sparseArray.size()) {
                    break;
                } else if (((Rect) sparseArray.valueAt(i7)).contains(x10, N1)) {
                    int keyAt = sparseArray.keyAt(i7);
                    if (keyAt != this.Lb) {
                        this.Lb = keyAt;
                        k3(keyAt, 32768, null);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i7, int i10) {
        r1 r1Var;
        int i11;
        fj fjVar = this.Q5;
        boolean z10 = true;
        if (fjVar == null || (!fjVar.I() && this.V3 == org.telegram.messenger.g0.f24226q.y)) {
            r1Var = this;
        } else {
            this.C0 = true;
            fj fjVar2 = this.Q5;
            this.Q5 = null;
            r1Var = this;
            r1Var.y3(fjVar2, this.L, this.G, this.F, this.H, false);
            r1Var.C0 = false;
        }
        Z3();
        int i12 = r1Var.W + r1Var.f31484g0 + r1Var.f31511i0 + r1Var.f31684v0 + r1Var.f31712x0 + r1Var.f31458e0;
        jh.a draftMessageMeasureController = getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(r1Var.Q5)) {
            int max = Math.max(0, (((draftMessageMeasureController.f17840a.getHeight() - draftMessageMeasureController.f17840a.getPaddingTop()) - draftMessageMeasureController.f17840a.getPaddingBottom()) - draftMessageMeasureController.d) - i12);
            if (max <= 0) {
                z10 = false;
            }
            draftMessageMeasureController.f17843e = z10;
            if (draftMessageMeasureController.f17841b > 0 && !z10) {
                draftMessageMeasureController.c(0, 0L);
            }
            i11 = max + i12;
        } else {
            i11 = i12;
        }
        r1Var.Fc = Math.max(0, i11 - i12);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), i11);
    }

    @Override
    public final void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (this.K6) {
            fj fjVar = this.Q5;
            if (fjVar != null && (charSequence2 = fjVar.v) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.Q5.v);
                return;
            }
            fj fjVar2 = this.Q5;
            if (fjVar2 != null && (charSequence = fjVar2.f24131z) != null && charSequence.length() > 0) {
                viewStructure.setText(this.Q5.f24131z);
            }
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void p() {
        m1 m1Var;
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
            if ((this.f31425b6 || (this.L != null && r2())) && getParent() != null) {
                View view = (View) getParent();
                if (view.getParent() != null) {
                    view.invalidate();
                    ((View) view.getParent()).invalidate();
                }
            }
            if (this.Wb && (m1Var = this.Sa) != null) {
                m1Var.e();
            }
        }
    }

    public final void p0(Bitmap bitmap, boolean z10) {
        boolean L4 = fj.L4(this.Q5.f24073k);
        fi.s2 s2Var = this.U0;
        if (L4) {
            if (MediaController.B().I(this.Q5)) {
                s2Var.f22762u0 = false;
                s2Var.R0();
                return;
            }
            s2Var.f22762u0 = true;
            s2Var.Q0(false);
            return;
        }
        if (z10) {
            fj fjVar = MediaController.B().f22838v0;
            if (fjVar != null && fjVar.h4()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        s2Var.f22762u0 = z10;
        if (bitmap != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
            s2Var.Z = null;
            s2Var.f22721b0 = null;
            s2Var.f22724c0 = null;
            s2Var.f22726d0 = null;
            s2Var.f22719a1.setShader(null);
            s2Var.O0(bitmapDrawable);
            s2Var.n1 = true;
            s2Var.f22739i1 = 0.0f;
            s2Var.S0(s2Var.f22747n0);
        }
        if (z10) {
            s2Var.Q0(false);
        } else {
            s2Var.R0();
        }
    }

    public final boolean p1(Canvas canvas) {
        boolean z10 = this.f31735yb;
        float f10 = 1.0f;
        ch.q0 q0Var = this.O;
        if (z10) {
            q0Var.f5474a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z11 = false;
        if (!this.V4 || !l2()) {
            return false;
        }
        if (q0Var.f5474a > 0.0f) {
            z();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z11 = true;
        }
        int i7 = (q0Var.f5474a > 0.0f ? 1 : (q0Var.f5474a == 0.0f ? 0 : -1));
        y1 y1Var = this.f31521ib;
        if (i7 <= 0 && y1Var.f32540x0 && this.M == null && !this.f31735yb) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + y1Var.f32485j0);
            if (y1Var.h) {
                f10 = y1Var.L1;
            }
            q0Var.e(canvas, f10);
            canvas.restore();
        } else {
            if (y1Var.h) {
                f10 = y1Var.L1;
            }
            q0Var.e(canvas, f10);
        }
        if (z11) {
            canvas.restore();
        }
        return true;
    }

    public final void p3(Drawable drawable, int i7, int i10, int i11, int i12) {
        if (drawable != null) {
            wg0 wg0Var = this.Ac;
            y1 y1Var = this.f31521ib;
            if (wg0Var != null && wg0Var.h) {
                this.Ic = 0.0f;
            } else {
                float f10 = i10 + i12 + y1Var.f32485j0;
                this.Ic = f10 - ((int) f10);
            }
            drawable.setBounds((int) (i7 + y1Var.f32475h0), (int) (i10 + y1Var.f32489k0), (int) (i7 + i11 + y1Var.f32480i0), (int) (i10 + i12 + y1Var.f32485j0));
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        r1 r1Var;
        ArrayList arrayList;
        m1 m1Var = this.Sa;
        int i10 = 0;
        if (m1Var != null && m1Var.y2(i7)) {
            return false;
        }
        if (i7 == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                E0(false);
                return true;
            } else if (this.Q5.D == 16) {
                this.Sa.J0(this, this.S3, this.T3);
                return true;
            } else {
                D0();
                return true;
            }
        }
        if (i7 == 2131296267) {
            F0();
        } else if (i7 == 2131296264) {
            m1 m1Var2 = this.Sa;
            if (m1Var2 != null) {
                if (this.Q5.D == 16) {
                    m1Var2.x0(this, 0.0f, 0.0f);
                } else {
                    m1Var2.J0(this, this.S3, this.T3);
                }
            }
        } else {
            if (i7 == 2131296265) {
                m1 m1Var3 = this.Sa;
                if (m1Var3 != null) {
                    TLRPC.Chat chat = this.f31680ua;
                    if (chat != null) {
                        r1Var = this;
                        m1Var3.c0(r1Var, chat, this.Q5.f24073k.fwd_from.channel_post, this.f31499h1, this.f31512i1, false);
                    } else {
                        r1Var = this;
                        TLRPC.User user = r1Var.f31653sa;
                        if (user != null) {
                            m1Var3.A0(this, user, r1Var.f31499h1, r1Var.f31512i1);
                        } else if (r1Var.f31694va != null) {
                            m1Var3.s(this);
                        }
                    }
                }
            } else {
                r1Var = this;
                if (i7 == 2131296270) {
                    m1 m1Var4 = r1Var.Sa;
                    if (m1Var4 != null) {
                        m1Var4.N0(this);
                    }
                } else if (i7 == 2131296263 && r1Var.Sa != null && (arrayList = r1Var.Q5.B2) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i10);
                        i10++;
                        cj cjVar = (cj) obj;
                        if (cjVar.O) {
                            r1Var.Sa.O(cjVar);
                            break;
                        }
                    }
                }
            }
            if ((!fj.R4(r1Var.Q5.f24073k) || r1Var.Q5.h4() || (r1Var.Q5.I3() && MediaController.B().I(r1Var.Q5))) && r1Var.F4.g(null, i7, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i7, bundle);
        }
        r1Var = this;
        if (!fj.R4(r1Var.Q5.f24073k)) {
        }
        return true;
    }

    @Override
    public final boolean q() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.q():boolean");
    }

    public final void q1(Canvas canvas, ev evVar, float f10, ColorFilter colorFilter) {
        Canvas canvas2;
        int save;
        if (evVar != null && f10 > 0.0f && evVar.C()) {
            if (f10 < 1.0f) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f10 * 255.0f), 31);
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(this.f31588o0, this.f31670u0);
            evVar.i(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public final void q2() {
        m1 m1Var = this.Sa;
        if (m1Var != null && m1Var.i()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void q3() {
        this.f31731y6 = true;
        this.f31743z6 = 1000;
        this.B6 = System.currentTimeMillis();
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
        fj fjVar = this.Q5;
        if (fjVar != null && imageReceiver == this.U0 && fjVar.J2()) {
            this.Sa.O1(this.Q5);
        }
    }

    public final int r0(fj fjVar, aj ajVar, boolean z10) {
        aj ajVar2 = ajVar;
        fi.s2 s2Var = this.U0;
        s2Var.f22750p0 = true;
        ImageReceiver imageReceiver = this.A7;
        imageReceiver.f22750p0 = true;
        ImageReceiver imageReceiver2 = this.T7;
        imageReceiver2.f22750p0 = true;
        ImageReceiver imageReceiver3 = this.F7;
        imageReceiver3.f22750p0 = true;
        int i7 = 0;
        if (ajVar2 != null) {
            ArrayList arrayList = ajVar2.d;
            if (arrayList.size() != 1) {
                if (arrayList.size() != ajVar2.f23010f.size()) {
                    ajVar2.a();
                }
                this.f31510hd = 0;
                int i10 = 0;
                while (i7 < arrayList.size()) {
                    fj fjVar2 = (fj) arrayList.get(i7);
                    xi d = ajVar2.d(fjVar2);
                    if (d != null && (d.f28005l & 1) != 0) {
                        x3(fjVar2, ajVar2, false, false, false, false);
                        if (z10 && !TextUtils.isEmpty(this.f31604p3)) {
                            R3();
                            this.f31510hd = (int) (i10 + this.f31660t3);
                            this.f31523id = this.f31565m3;
                        }
                        i10 = this.f31684v0 + this.f31712x0 + i10;
                    }
                    i7++;
                    ajVar2 = ajVar;
                }
                return i10;
            }
        }
        x3(fjVar, ajVar, false, false, false, false);
        s2Var.f22750p0 = false;
        imageReceiver.f22750p0 = false;
        imageReceiver2.f22750p0 = false;
        imageReceiver3.f22750p0 = false;
        R3();
        return this.f31684v0 + this.f31712x0;
    }

    public final void r1(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.r1(android.graphics.Canvas):void");
    }

    public final boolean r2() {
        if (this.f31674u4.f21290a <= 0 && this.O.f5487p) {
            fj fjVar = this.Q5;
            if (fjVar == null || !fjVar.f24110t1) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void r3(byte[] bArr) {
        fj fjVar = this.R5;
        if (fjVar == null) {
            fjVar = this.Q5;
        }
        if (fjVar == null) {
            this.f31591o3 = null;
            return;
        }
        dh0 dh0Var = this.f31591o3;
        if (dh0Var == null || !dh0Var.f34335f || !Arrays.equals(dh0Var.f34336g, bArr)) {
            this.f31591o3 = new dh0(this, fjVar.e1(), bArr);
        }
        this.B0 = true;
    }

    @Override
    public final void requestLayout() {
        if (this.C0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(r1 r1Var) {
        if (r1Var == null) {
            return;
        }
        r1Var.f31478f6 = this.f31478f6;
        r1Var.f31650s6 = this.f31650s6;
        r1Var.f31504h6 = this.f31504h6;
        r1Var.f31517i6 = this.f31517i6;
        r1Var.f31529j6 = this.f31529j6;
        r1Var.f31543k6 = this.f31543k6;
        r1Var.f31555l6 = this.f31555l6;
        r1Var.f31568m6 = this.f31568m6;
        r1Var.f31580n6 = this.f31580n6;
        r1Var.f31593o6 = this.f31593o6;
        r1Var.f31607p6 = this.f31607p6;
        r1Var.f31621q6 = this.f31621q6;
        r1Var.t6 = this.t6;
        r1Var.f31676u6 = this.f31676u6;
        r1Var.f31690v6 = this.f31690v6;
        r1Var.W6 = this.W6;
        r1Var.X6 = this.X6;
        r1Var.Y6 = this.Y6;
        r1Var.Z6 = this.Z6;
        r1Var.f31412a7 = this.f31412a7;
    }

    public final void s1(Canvas canvas, Integer num, float f10, boolean z10) {
        xi xiVar = this.M;
        if (xiVar != null) {
            int i7 = xiVar.f28005l;
            if ((i7 & 8) == 0 || (i7 & 1) == 0) {
                return;
            }
        }
        ch.q0 q0Var = this.O;
        q0Var.getClass();
        q0Var.A = f10;
        q0Var.B = z10;
        q0Var.d(canvas, this.f31521ib.L1, num);
    }

    public final void s2() {
        if (this.L != null && getParent() != null) {
            ((ViewGroup) getParent()).invalidate();
        }
        invalidate();
    }

    public final void s3(CharacterStyle characterStyle) {
        int i7;
        int i10;
        int i11;
        int i12;
        fj fjVar = this.R5;
        if (fjVar == null) {
            fjVar = this.Q5;
        }
        this.B0 = false;
        ArrayList arrayList = this.f31716x4;
        if (fjVar != null && fjVar.f24073k.message != null && characterStyle != null) {
            if (this.f31565m3 != null && !TextUtils.isEmpty(fjVar.f24131z)) {
                CharSequence charSequence = fjVar.f24131z;
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
                        for (int i14 = 0; i14 < this.f31565m3.f23662e.size(); i14++) {
                            cj cjVar = (cj) this.f31565m3.f23662e.get(i14);
                            if (i12 >= cjVar.f23478n && i12 < cjVar.f23479r) {
                                this.A0 = i14;
                                this.B0 = false;
                                i3();
                                try {
                                    e80 c32 = c3();
                                    c32.d(cjVar.f23476e, i12, 0.0f);
                                    cjVar.f23476e.getSelectionPath(i12, i11, c32);
                                    if (i11 >= cjVar.f23478n + i13) {
                                        for (int i15 = i14 + 1; i15 < this.f31565m3.f23662e.size(); i15++) {
                                            cj cjVar2 = (cj) this.f31565m3.f23662e.get(i15);
                                            int i16 = cjVar2.f23479r - cjVar2.f23478n;
                                            e80 c33 = c3();
                                            c33.d(cjVar2.f23476e, 0, cjVar2.f23481w);
                                            cjVar2.f23476e.getSelectionPath(0, i11 - cjVar2.f23478n, c33);
                                            if (i11 < (cjVar.f23478n + i16) - 1) {
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
            CharSequence charSequence2 = fjVar.v;
            if ((charSequence2 instanceof Spanned) && fjVar.B2 != null) {
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
                    for (int i18 = 0; i18 < fjVar.B2.size(); i18++) {
                        cj cjVar3 = (cj) fjVar.B2.get(i18);
                        if (i10 >= cjVar3.f23478n && i10 < cjVar3.f23479r) {
                            this.A0 = i18;
                            this.B0 = false;
                            i3();
                            try {
                                e80 c34 = c3();
                                c34.d(cjVar3.f23476e, i10, 0.0f);
                                cjVar3.f23476e.getSelectionPath(i10, i7, c34);
                                if (i7 >= cjVar3.f23478n + i17) {
                                    for (int i19 = i18 + 1; i19 < fjVar.B2.size(); i19++) {
                                        cj cjVar4 = (cj) fjVar.B2.get(i19);
                                        int i20 = cjVar4.f23479r - cjVar4.f23478n;
                                        e80 c35 = c3();
                                        c35.d(cjVar4.f23476e, 0, cjVar4.f23481w);
                                        cjVar4.f23476e.getSelectionPath(0, i7 - cjVar4.f23478n, c35);
                                        if (i7 < (cjVar3.f23478n + i20) - 1) {
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
                i3();
                invalidate();
            }
        } else if (!arrayList.isEmpty()) {
            this.A0 = -1;
            this.B0 = false;
            i3();
            invalidate();
        }
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
        if (this.f31495gb) {
            this.f31508hb = f10;
            invalidate();
        } else {
            super.setAlpha(f10);
        }
        xi xiVar = this.M;
        if ((xiVar != null && (xiVar.f27998c != 0 || xiVar.f27996a != 0)) || ((this.f31724y && !fj.R4(this.Q5.f24073k)) || this.Q7 == null || this.R7 == null)) {
            xi xiVar2 = this.M;
            if (xiVar2 != null) {
                int i7 = xiVar2.f28005l;
                if ((i7 & 8) == 0 || (i7 & 1) == 0) {
                    return;
                }
            }
            this.O.getClass();
        }
        invalidate();
    }

    public void setAnimationOffsetX(float f10) {
        if (this.f31549kd != f10) {
            this.f31549kd = f10;
            b4();
        }
    }

    public void setAvatar(fj fjVar) {
        if (fjVar != null) {
            int i7 = fjVar.K1;
            if (!this.G6 && !f2()) {
                this.f31559la = null;
                return;
            }
            Drawable drawable = fjVar.f24084m2;
            ImageReceiver imageReceiver = this.A7;
            if (drawable != null) {
                imageReceiver.x0(drawable);
                return;
            }
            TLRPC.User user = this.f31533ja;
            org.telegram.ui.Components.a9 a9Var = this.B7;
            if (user != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null) {
                    this.f31559la = userProfilePhoto.photo_small;
                } else {
                    this.f31559la = null;
                }
                a9Var.r(user);
                imageReceiver.k0(this.f31533ja, a9Var, null, pc.e(360928), 1, false);
                return;
            }
            TLRPC.Chat chat = this.f31547ka;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    this.f31559la = chatPhoto.photo_small;
                } else {
                    this.f31559la = null;
                }
                if (chat.signature_profiles && fj.B0(fjVar.f24073k) != 1271266957) {
                    long o4 = org.telegram.messenger.n5.o(fjVar.f24073k.from_id);
                    if (o4 >= 0) {
                        TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(o4));
                        a9Var.r(c22);
                        imageReceiver.j0(c22, a9Var, null);
                        return;
                    }
                    TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-o4));
                    a9Var.q(O0);
                    imageReceiver.j0(O0, a9Var, null);
                    return;
                }
                a9Var.q(this.f31547ka);
                imageReceiver.j0(this.f31547ka, a9Var, null);
            } else if (fjVar.r4()) {
                TLRPC.Photo photo = fjVar.V0;
                if (photo != null) {
                    imageReceiver.r0(fc.i(org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(50.0f), false, null, true), fjVar.V0), "50_50", a9Var, null, null, 0);
                }
            } else {
                this.f31559la = null;
                a9Var.k(fjVar.Z0(), null, null, null);
                imageReceiver.r0(null, null, a9Var, null, null, 0);
            }
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.setBackgroundTopY(boolean):void");
    }

    public void setDelegate(m1 m1Var) {
        this.Sa = m1Var;
    }

    public void setDrawSelectionBackground(boolean z10) {
        if (this.f31538k1 != z10) {
            this.f31538k1 = z10;
            invalidate();
        }
    }

    public void setEnterTransitionInProgress(boolean z10) {
        this.f31724y = z10;
        invalidate();
    }

    public void setFullyDraw(boolean z10) {
        this.K0 = z10;
    }

    public void setHideSideButtonByQuickShare(boolean z10) {
        if (this.E8 != z10) {
            this.E8 = z10;
            boolean z11 = this.f31425b6;
            this.f31425b6 = true;
            invalidate();
            this.f31425b6 = z11;
        }
    }

    public void setHighlighted(boolean z10) {
        if (this.f31718x6 != z10) {
            this.f31718x6 = z10;
            if (z10) {
                this.f31591o3 = null;
            }
            if (!z10) {
                this.B6 = System.currentTimeMillis();
                this.f31731y6 = true;
                this.f31743z6 = 300;
            } else {
                this.f31731y6 = false;
                this.f31743z6 = 0;
            }
            V3();
            if (this.C4) {
                this.E4.f34407o = A2();
            } else {
                this.D4.f42115p = A2();
            }
            invalidate();
            if (getParent() != null) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setImageCoords(RectF rectF) {
        w3(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public void setInstantButtonPressed(boolean z10) {
        if (this.H2 == null) {
            this.H2 = new lc(this);
        }
        lc lcVar = this.H2;
        this.G2 = z10;
        lcVar.c(z10);
    }

    public void setInvalidateListener(Runnable runnable) {
        this.Ec = runnable;
    }

    public void setInvalidateSpoilersParent(boolean z10) {
        this.f31575n0 = z10;
    }

    public void setInvalidatesParent(boolean z10) {
        this.f31425b6 = z10;
    }

    public void setIsUpdating(boolean z10) {
        this.P0 = true;
    }

    public void setMessageObjectInternal(org.telegram.messenger.fj r68) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.setMessageObjectInternal(org.telegram.messenger.fj):void");
    }

    public void setOverrideInvalidate(Runnable runnable) {
        this.Dc = runnable;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        V3();
        if (this.C4) {
            this.E4.f34407o = A2();
        } else {
            this.D4.f42115p = A2();
        }
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.i6 i6Var) {
        this.Qb = i6Var;
        RadialProgress2 radialProgress2 = this.Q0;
        if (radialProgress2 != null) {
            radialProgress2.F = i6Var;
        }
        RadialProgress2 radialProgress22 = this.R0;
        if (radialProgress22 != null) {
            radialProgress22.F = i6Var;
        }
        tk0 tk0Var = this.f31448d3;
        if (tk0Var != null) {
            tk0Var.f40069n = i6Var;
        }
    }

    public void setScrimBlockBounds(RectF rectF) {
        this.f31573md = rectF;
    }

    @Override
    public void setScrimHidden(boolean z10) {
        c0.d(this, z10);
    }

    public void setScrimReaction(Integer num) {
        this.O.f5496z = num;
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
        if (this.f31536jd != f10) {
            this.f31536jd = f10;
            b4();
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
        dj djVar = this.f31565m3;
        if (djVar != null && djVar.f23662e != null) {
            for (int i10 = 0; i10 < this.f31565m3.f23662e.size(); i10++) {
                cj cjVar = (cj) this.f31565m3.f23662e.get(i10);
                for (int i11 = 0; i11 < cjVar.f23483y.size(); i11++) {
                    ((xh.f) cjVar.f23483y.get(i11)).invalidateSelf();
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().B2 != null) {
            for (int i12 = 0; i12 < getMessageObject().B2.size(); i12++) {
                cj cjVar2 = (cj) getMessageObject().B2.get(i12);
                for (int i13 = 0; i13 < cjVar2.f23483y.size(); i13++) {
                    ((xh.f) cjVar2.f23483y.get(i13)).invalidateSelf();
                }
            }
        }
    }

    public void setTimeAlpha(float f10) {
        this.f31541k4 = f10;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
    }

    public final void t0(r1 r1Var) {
        xh.e eVar;
        if (r1Var != null && (eVar = r1Var.Q9) != null) {
            int i7 = (Integer) eVar.f60672k.get(r1Var);
            if (i7 == null) {
                i7 = 0;
            }
            this.R9 = i7;
            xh.e eVar2 = this.Q9;
            if (eVar2 != null) {
                eVar2.f60672k.put(this, i7);
            }
        }
    }

    public final void t1(pl plVar, Canvas canvas, int i7, Integer num, float f10) {
        xi xiVar = this.M;
        if (xiVar != null) {
            int i10 = xiVar.f28005l;
            if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                return;
            }
        }
        ch.q0 q0Var = this.O;
        q0Var.getClass();
        q0Var.A = f10;
        q0Var.f(plVar, canvas, i7, num);
    }

    public final boolean t2() {
        aj ajVar;
        if (u2() && (ajVar = this.L) != null && this.M != null && !ajVar.f23007b && !ajVar.f23012i) {
            return true;
        }
        return false;
    }

    public final void t3(int i7) {
        fj fjVar = this.R5;
        if (fjVar == null) {
            fjVar = this.Q5;
        }
        if (fjVar == null) {
            this.f31591o3 = null;
            return;
        }
        dh0 dh0Var = this.f31591o3;
        if (dh0Var == null || !dh0Var.f34334e || dh0Var.f34333c != (-i7)) {
            this.f31591o3 = new dh0(this, fjVar.e1(), i7);
        }
        this.B0 = true;
    }

    public final void u0(r1 r1Var) {
        r1Var.C3(this.f31627qc, this.f31655sc, this.f31668tc, this.f31682uc, this.f31696vc, this.L0, this.M0, this.f31456db, this.eb, this.f31642rc);
    }

    public final void u1(Canvas canvas, RectF rectF, float f10) {
        String str;
        z();
        if (this.I8) {
            str = "paintChatActionBackgroundSelected";
        } else {
            str = "paintChatActionBackground";
        }
        canvas.drawRoundRect(rectF, f10, f10, a2(str));
        if (h2()) {
            canvas.drawRoundRect(rectF, f10, f10, org.telegram.ui.ActionBar.n6.f29521h2);
        }
    }

    public final boolean u2() {
        fj fjVar;
        if (w2() && (fjVar = this.Q5) != null && !fjVar.P3()) {
            return true;
        }
        return false;
    }

    public final void u3(String str) {
        v3(false, -1, str, false);
    }

    public final void v0() {
        if (this.f31544k7 == null) {
            this.f31544k7 = new ImageReceiver[3];
            this.f31556l7 = new org.telegram.ui.Components.a9[3];
            this.f31569m7 = new boolean[3];
            int i7 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.f31544k7;
                if (i7 < imageReceiverArr.length) {
                    imageReceiverArr[i7] = new ImageReceiver(this);
                    this.f31544k7[i7].K0(org.telegram.messenger.g0.L(12.0f));
                    this.f31556l7[i7] = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                    this.f31556l7[i7].u(org.telegram.messenger.g0.L(18.0f));
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
        aj ajVar;
        if ((!this.E8 || z10) && this.F8 != 0) {
            xi xiVar = this.M;
            if (xiVar == null || (ajVar = this.L) == null || !ajVar.f23012i || xiVar.h) {
                boolean P3 = this.Q5.P3();
                y1 y1Var = this.f31521ib;
                if (P3) {
                    float L2 = y1Var.f32486j1 - org.telegram.messenger.g0.L(40.0f);
                    this.R8 = L2;
                    aj ajVar2 = this.L;
                    if (ajVar2 != null) {
                        this.R8 = (ajVar2.f23016m.f28395e - this.f31549kd) + L2;
                    }
                } else {
                    float L3 = org.telegram.messenger.g0.L(8.0f) + y1Var.f32490k1;
                    this.R8 = L3;
                    aj ajVar3 = this.L;
                    if (ajVar3 != null) {
                        this.R8 = (ajVar3.f23016m.f28397g - this.f31549kd) + L3;
                    }
                    if (u2()) {
                        this.R8 = Math.min(this.R8, getCompactRight() - org.telegram.messenger.g0.L(32.0f));
                    }
                }
                float f16 = 0.0f;
                if (this.F8 == 4) {
                    this.S8 = org.telegram.messenger.g0.L(6.0f);
                } else {
                    float L4 = (this.f31465e7 + y1Var.f32485j0) - org.telegram.messenger.g0.L(41.0f);
                    this.S8 = L4;
                    fj fjVar = this.Q5;
                    if (fjVar.D == 19 && fjVar.f24118v2 < this.B9) {
                        this.S8 = L4 - org.telegram.messenger.g0.L(22.0f);
                    }
                    aj ajVar4 = this.L;
                    if (ajVar4 != null) {
                        float f17 = this.S8;
                        zi ziVar = ajVar4.f23016m;
                        float f18 = f17 + ziVar.h;
                        this.S8 = f18;
                        if (ziVar.f28399j) {
                            this.S8 = f18 - getTranslationY();
                        }
                    }
                    if (this.Q5.O5()) {
                        ch.q0 q0Var = this.O;
                        q0Var.getClass();
                        if (this.f31735yb) {
                            this.S8 -= (1.0f - getVideoTranscriptionProgress()) * q0Var.i(y1Var.L1);
                        } else if (q0Var.f5474a > 0.0f) {
                            this.S8 -= q0Var.i(y1Var.L1);
                        }
                    }
                }
                if (this.F8 != 4) {
                    float L5 = ((this.f31465e7 + y1Var.f32485j0) - org.telegram.messenger.g0.L(32.0f)) / 2.0f;
                    if (this.S8 < L5) {
                        this.S8 = L5;
                    }
                }
                if (this.Q5.D == 19) {
                    if (this.F8 == 3 && this.f31581n7 != null) {
                        this.S8 = org.telegram.messenger.g0.L(18.0f);
                    } else {
                        this.S8 = 0.0f;
                    }
                }
                if (!this.Q5.P3() && this.f31735yb && !this.R1) {
                    if (this.G6) {
                        L = (org.telegram.messenger.g0.f3(this.X6, w2()) - org.telegram.messenger.g0.f24230u) * 0.7f;
                    } else {
                        L = org.telegram.messenger.g0.L(50.0f);
                    }
                    if (this.f31748zb) {
                        f13 = (1.0f - getVideoTranscriptionProgress()) * L;
                    } else {
                        f13 = 0.0f;
                    }
                    if (this.f31748zb) {
                        f16 = org.telegram.messenger.g0.L(28.0f) * (1.0f - getVideoTranscriptionProgress());
                    }
                    if (y1Var.f32495l2) {
                        if (this.f31748zb) {
                            f14 = y1Var.L1;
                        } else {
                            f14 = 1.0f - y1Var.L1;
                        }
                        f13 = (1.0f - getVideoTranscriptionProgress()) * f14 * L;
                        if (this.f31748zb) {
                            f15 = y1Var.L1;
                        } else {
                            f15 = 1.0f - y1Var.L1;
                        }
                        f16 = (1.0f - getVideoTranscriptionProgress()) * f15 * org.telegram.messenger.g0.L(28.0f);
                    }
                    this.R8 -= f13;
                    this.S8 -= f16;
                    if (u2()) {
                        float compactRight = getCompactRight() - org.telegram.messenger.g0.L(32.0f);
                        this.R8 = org.telegram.messenger.g0.T1(Math.min(this.U0.z() + org.telegram.messenger.g0.L(8.0f), compactRight), Math.min(this.R8 + f13, compactRight), getVideoTranscriptionProgress());
                    }
                }
                this.G8 = true;
                if (this.F8 == 3) {
                    if (!this.f31724y || fj.R4(this.Q5.f24073k)) {
                        U0(canvas, 1.0f);
                    }
                } else if (!cu0.f34132f0) {
                    float f19 = this.R8;
                    float f20 = this.S8;
                    float L6 = org.telegram.messenger.g0.L(32.0f) + f19;
                    float f21 = this.S8;
                    if (this.H8 == 5) {
                        f10 = 64.0f;
                    } else {
                        f10 = 32.0f;
                    }
                    RectF rectF = this.f31436c4;
                    rectF.set(f19, f20, L6, f21 + org.telegram.messenger.g0.L(f10));
                    if (rectF.right >= getMeasuredWidth()) {
                        this.G8 = false;
                        return;
                    }
                    int i10 = (int) ((1.0f - this.E.f57779e) * 255.0f);
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
                    z();
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
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.n6.f29521h2);
                    }
                    int i11 = this.F8;
                    if (i11 == 2) {
                        Drawable Z1 = Z1("drawableGoIcon");
                        z.u(Z1, (this.R8 + org.telegram.messenger.g0.L(16.0f)) - (Z1.getIntrinsicWidth() / f12), (this.S8 + org.telegram.messenger.g0.L(16.0f)) - (Z1.getIntrinsicHeight() / f12));
                        Z1.draw(canvas);
                    } else if (i11 == 4) {
                        int L11 = (int) (this.R8 + org.telegram.messenger.g0.L(16.0f));
                        int L12 = (int) (this.S8 + org.telegram.messenger.g0.L(16.0f));
                        Drawable Z12 = Z1("drawableCloseIcon");
                        int intrinsicWidth = Z12.getIntrinsicWidth() / 2;
                        int intrinsicHeight = Z12.getIntrinsicHeight() / 2;
                        Z12.setBounds(L11 - intrinsicWidth, L12 - intrinsicHeight, intrinsicWidth + L11, intrinsicHeight + L12);
                        z.u(Z12, this.R8 + org.telegram.messenger.g0.L(4.0f), this.S8 + org.telegram.messenger.g0.L(4.0f));
                        canvas.save();
                        canvas.scale(0.65f, 0.65f, Z12.getBounds().centerX(), Z12.getBounds().centerY());
                        Z12.draw(canvas);
                        canvas.restore();
                        if (this.H8 == 5) {
                            Drawable Z13 = Z1("drawableMoreIcon");
                            int intrinsicWidth2 = Z13.getIntrinsicWidth() / 2;
                            int intrinsicHeight2 = Z13.getIntrinsicHeight() / 2;
                            Z13.setBounds(L11 - intrinsicWidth2, L12 - intrinsicHeight2, L11 + intrinsicWidth2, L12 + intrinsicHeight2);
                            z.u(Z13, this.R8 + org.telegram.messenger.g0.L(4.0f), this.S8 + org.telegram.messenger.g0.L(34.0f));
                            Z13.draw(canvas);
                        }
                    } else {
                        int L13 = (int) (this.R8 + org.telegram.messenger.g0.L(16.0f));
                        int L14 = (int) (this.S8 + org.telegram.messenger.g0.L(16.0f));
                        Drawable Z14 = Z1("drawableShareIcon");
                        int intrinsicWidth3 = Z14.getIntrinsicWidth() / 2;
                        int intrinsicHeight3 = Z14.getIntrinsicHeight() / 2;
                        Z14.setBounds(L13 - intrinsicWidth3, L14 - intrinsicHeight3, L13 + intrinsicWidth3, L14 + intrinsicHeight3);
                        z.u(Z14, this.R8 + org.telegram.messenger.g0.L(4.0f), this.S8 + org.telegram.messenger.g0.L(4.0f));
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

    public final boolean v3(boolean r25, int r26, java.lang.String r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.v3(boolean, int, java.lang.String, boolean):boolean");
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        y yVar;
        uh.b bVar;
        uh.a aVar;
        n1 n1Var;
        n1 n1Var2;
        n1 n1Var3;
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.J2;
            if (drawable != drawableArr[0] && drawable != this.f31728y3 && drawable != drawableArr[1]) {
                u1 u1Var = this.Y0;
                if (u1Var != null) {
                    yVar = u1Var.f31971x;
                } else {
                    yVar = null;
                }
                if (drawable == yVar || drawable == this.V2 || drawable == this.Ka || ((drawable != null && (((n1Var = this.f31509hc) != null && drawable == n1Var.f31206k) || (((n1Var2 = this.f31522ic) != null && drawable == n1Var2.f31206k) || ((n1Var3 = this.Oc) != null && drawable == n1Var3.f31206k)))) || ((this.O != null && (drawable instanceof org.telegram.ui.Components.m6)) || (drawable instanceof n80)))) {
                    return true;
                }
                x1 x1Var = this.f31714x2;
                if (x1Var == null || (aVar = x1Var.f32392l) == null || (drawable != aVar && drawable != aVar.f59111a)) {
                    ArrayList arrayList = this.Q4;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        q1 q1Var = (q1) obj;
                        if (q1Var.f31371w != drawable && ((bVar = q1Var.f31372x) == null || (drawable != bVar && drawable != bVar.f59100a && drawable != bVar.f59101b))) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean w() {
        if (this.Q5.t2() && !this.Q5.O0 && this.M9 == 0.0f && this.V0.n() != null) {
            return false;
        }
        return true;
    }

    public final int w0(int i7, fj fjVar) {
        TLRPC.WebPage webPage;
        TLRPC.Document document;
        boolean z10;
        int i10;
        d1 d1Var;
        d1 d1Var2;
        int i11 = i7;
        TLRPC.MessageMedia messageMedia = fjVar.f24029a1;
        if (messageMedia != null) {
            this.N1 = messageMedia.document;
        } else if (fjVar.D == 0) {
            TLRPC.MessageMedia n1 = fj.n1(fjVar.f24073k);
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
            this.N1 = fjVar.F0();
        }
        TLRPC.Document document2 = this.N1;
        int i12 = 0;
        if (document2 != null) {
            double d = 0.0d;
            if (fj.Q4(document2)) {
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
                Math.ceil(org.telegram.ui.ActionBar.n6.N2.measureText("00:00"));
                this.V6 = i11 - org.telegram.messenger.g0.L(18.0f);
                Z2(fjVar);
                int L = org.telegram.messenger.g0.L(174.0f) + this.A9;
                if (!this.R1) {
                    this.f31426b7 = Math.min(i11, L + ((int) Math.ceil(org.telegram.ui.ActionBar.n6.N2.measureText(org.telegram.messenger.g0.g0((int) d, true, false)))));
                }
                this.E4.f34405m = fjVar;
                return 0;
            } else if (fj.K4(this.N1)) {
                this.M1 = 4;
                if (!fjVar.m5()) {
                    U3();
                    String i02 = org.telegram.messenger.g0.i0(this.N1.size, false, false);
                    this.f31475f3 = (int) Math.ceil(org.telegram.ui.ActionBar.n6.C2.measureText(i02));
                    this.f31461e3 = new StaticLayout(i02, org.telegram.ui.ActionBar.n6.C2, this.f31475f3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return 0;
                }
            } else if (fj.J3(this.N1)) {
                D1();
                this.M1 = 5;
                int L2 = i11 - org.telegram.messenger.g0.L(92.0f);
                if (L2 < 0) {
                    L2 = org.telegram.messenger.g0.L(100.0f);
                }
                int i14 = L2;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(fjVar.y1(true).replace('\n', ' '), org.telegram.ui.ActionBar.n6.O2, i14 - org.telegram.messenger.g0.L(12.0f), truncateAt);
                d1 d1Var3 = this.K4;
                TextPaint textPaint = org.telegram.ui.ActionBar.n6.O2;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                d1Var3.d = new StaticLayout(ellipsize, textPaint, i14, alignment, 1.0f, 0.0f, false);
                if (this.K4.d.getLineCount() > 0) {
                    this.K4.f30608e = -((int) Math.ceil(d1Var2.d.getLineLeft(0)));
                    int lineWidth = (int) this.K4.d.getLineWidth(0);
                    if (org.telegram.messenger.g0.L(104.0f) + lineWidth > this.f31426b7) {
                        this.f31426b7 = org.telegram.messenger.g0.L(104.0f) + lineWidth;
                    }
                }
                this.K4.f30609f = new StaticLayout(TextUtils.ellipsize(fjVar.w1(true).replace('\n', ' '), org.telegram.ui.ActionBar.n6.P2, i14, truncateAt), org.telegram.ui.ActionBar.n6.P2, i14, alignment, 1.0f, 0.0f, false);
                if (this.K4.f30609f.getLineCount() > 0) {
                    this.K4.f30610g = -((int) Math.ceil(d1Var.f30609f.getLineLeft(0)));
                    int lineWidth2 = (int) this.K4.f30609f.getLineWidth(0);
                    if (org.telegram.messenger.g0.L(104.0f) + lineWidth2 > this.f31426b7) {
                        this.f31426b7 = org.telegram.messenger.g0.L(104.0f) + lineWidth2;
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
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.n6.N2.measureText(org.telegram.messenger.g0.k0(i15, i15)));
                org.telegram.messenger.g0.L(86.0f);
                this.V6 = this.f31426b7 - org.telegram.messenger.g0.L(28.0f);
                return ceil;
            } else if (fj.s3(this.N1, fjVar.z2())) {
                this.M1 = 2;
                if (!fjVar.m5()) {
                    String N0 = gd.N0(2131753968, "AttachGif");
                    this.C3 = (int) Math.ceil(org.telegram.ui.ActionBar.n6.C2.measureText(N0));
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.n6.C2;
                    int i16 = this.C3;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    this.f31715x3 = new StaticLayout(N0, textPaint2, i16, alignment2, 1.0f, 0.0f, false);
                    String i03 = org.telegram.messenger.g0.i0(this.N1.size, false, false);
                    this.f31475f3 = (int) Math.ceil(org.telegram.ui.ActionBar.n6.C2.measureText(i03));
                    this.f31461e3 = new StaticLayout(i03, org.telegram.ui.ActionBar.n6.C2, this.f31475f3, alignment2, 1.0f, 0.0f, false);
                }
            } else {
                String str = this.N1.mime_type;
                if ((str != null && (str.toLowerCase().startsWith("image/") || this.N1.mime_type.toLowerCase().startsWith("video/mp4"))) || fj.W2(this.N1)) {
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
                    B = gd.N0(2131753972, "AttachDocument");
                }
                StaticLayout c10 = yu0.c(B, org.telegram.ui.ActionBar.n6.G2, i17, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.MIDDLE, i17, 2, false);
                this.f31461e3 = c10;
                this.f31487g3 = Integer.MIN_VALUE;
                if (c10 != null && c10.getLineCount() > 0) {
                    int i18 = 0;
                    for (int i19 = 0; i19 < this.f31461e3.getLineCount(); i19++) {
                        i18 = Math.max(i18, (int) Math.ceil(this.f31461e3.getLineWidth(i19)));
                        this.f31487g3 = Math.max(this.f31487g3, (int) Math.ceil(-this.f31461e3.getLineLeft(i19)));
                    }
                    i10 = Math.min(i17, i18);
                } else {
                    this.f31487g3 = 0;
                    i10 = i17;
                }
                int min = Math.min(i17 - org.telegram.messenger.g0.L(30.0f), (int) Math.ceil(org.telegram.ui.ActionBar.n6.C2.measureText("000.0 mm / ".concat(org.telegram.messenger.g0.i0(this.N1.size, false, false)))));
                this.C3 = min;
                CharSequence ellipsize2 = TextUtils.ellipsize(org.telegram.messenger.g0.i0(this.N1.size, false, false) + " " + org.telegram.messenger.w7.A(this.N1), org.telegram.ui.ActionBar.n6.C2, min, TextUtils.TruncateAt.END);
                try {
                    if (this.C3 < 0) {
                        this.C3 = org.telegram.messenger.g0.L(10.0f);
                    }
                    this.f31715x3 = new StaticLayout(ellipsize2, org.telegram.ui.ActionBar.n6.C2, this.C3 + org.telegram.messenger.g0.L(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (this.O1) {
                    this.f31462e4 = org.telegram.messenger.w7.w(fjVar.f24093p0, 320, false, null, false);
                    this.f31476f4 = org.telegram.messenger.w7.w(fjVar.f24093p0, 40, false, null, false);
                    if (this.Q5.x3() || (org.telegram.messenger.a6.q(this.f31411a6).l() & 1) == 0) {
                        this.f31462e4 = null;
                    }
                    TLRPC.PhotoSize photoSize = this.f31462e4;
                    fi.s2 s2Var = this.U0;
                    if (photoSize != null && photoSize != this.f31476f4) {
                        BitmapDrawable bitmapDrawable = this.Q5.I1;
                        if (bitmapDrawable != null) {
                            this.f31476f4 = null;
                            this.f31488g4 = bitmapDrawable;
                        }
                    } else {
                        this.f31462e4 = null;
                        s2Var.G0 = true;
                        s2Var.H0 = true;
                    }
                    this.f31502h4 = "86_86_b";
                    s2Var.s0(fc.f(this.f31462e4, fjVar.f24086n0), "86_86", fc.f(this.f31476f4, fjVar.f24086n0), this.f31502h4, this.f31488g4, 0L, null, fjVar, 1);
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
        this.Uc.setColor(org.telegram.ui.ActionBar.n6.r1(f10 * 0.2f, i7));
        this.Uc.setPathEffect(e80.c());
        canvas.drawPath(path, this.Uc);
        canvas.restore();
    }

    public final boolean w2() {
        fj fjVar = this.Q5;
        if (fjVar != null) {
            return fjVar.P2();
        }
        return org.telegram.ui.ActionBar.n6.i1(this.Qb);
    }

    public final void w3(float f10, float f11, float f12, float f13) {
        fi.s2 s2Var = this.U0;
        s2Var.z0(f10, f11, f12, f13);
        int i7 = this.M1;
        if (i7 != 4 && i7 != 2) {
            return;
        }
        this.M3 = (int) (s2Var.L0 + org.telegram.messenger.g0.L(8.0f));
        int L = (int) (s2Var.M0 + org.telegram.messenger.g0.L(8.0f));
        this.N3 = L;
        int i10 = this.M3;
        int L2 = org.telegram.messenger.g0.L(24.0f) + this.N3;
        this.R0.r(i10, L, org.telegram.messenger.g0.L(24.0f) + i10, L2);
        this.K3 = (int) com.google.android.gms.internal.vision.e2.A(s2Var.N0, org.telegram.messenger.g0.L(48.0f), 2.0f, f10);
        int A = (int) com.google.android.gms.internal.vision.e2.A(s2Var.O0, org.telegram.messenger.g0.L(48.0f), 2.0f, s2Var.M0);
        this.L3 = A;
        int i11 = this.K3;
        int L3 = org.telegram.messenger.g0.L(48.0f) + this.L3;
        this.Q0.r(i11, A, org.telegram.messenger.g0.L(48.0f) + i11, L3);
    }

    public final void x() {
        kr krVar;
        boolean z10 = this.n1;
        if (z10 || this.f31589o1) {
            if ((z10 && this.f31602p1 == 1.0f) || (!z10 && this.f31602p1 == 0.0f)) {
                this.f31589o1 = false;
            }
            if (z10) {
                krVar = kr.f36859g;
            } else {
                krVar = kr.f36860i;
            }
            this.f31631r1 = (int) Math.ceil(krVar.getInterpolation(this.f31602p1) * org.telegram.messenger.g0.L(35.0f));
            if (this.Q5.D == 36) {
                if (org.telegram.messenger.g0.L(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                    this.f31631r1 = 0;
                }
            }
            if (!this.Q5.P3() || this.Q5.D2) {
                b4();
            }
            if (this.f31589o1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f31616q1;
                this.f31616q1 = elapsedRealtime;
                if (this.n1) {
                    float f10 = (((float) j3) / 200.0f) + this.f31602p1;
                    this.f31602p1 = f10;
                    if (f10 > 1.0f) {
                        this.f31602p1 = 1.0f;
                    }
                } else {
                    float f11 = this.f31602p1 - (((float) j3) / 200.0f);
                    this.f31602p1 = f11;
                    if (f11 <= 0.0f) {
                        this.f31602p1 = 0.0f;
                    }
                }
                invalidate();
                ((View) getParent()).invalidate();
            }
        }
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
        fj fjVar;
        boolean z17 = (f13 == 1.0f || z15) ? false : true;
        float f18 = (f13 * 0.5f) + 0.5f;
        float f19 = z17 ? f10 * f13 : f10;
        if (this.M1 != 7 || ((fjVar = this.Q5) != null && fjVar.g4())) {
            photoBottom = getPhotoBottom() + this.f31699w0;
        } else {
            photoBottom = f12 - ((1.0f - getVideoTranscriptionProgress()) * (this.O.i(this.f31521ib.L1) + org.telegram.messenger.g0.L(this.K ? 4.0f : 5.0f)));
        }
        float L3 = photoBottom - org.telegram.messenger.g0.L(8.5f);
        fj fjVar2 = this.Q5;
        float L4 = (fjVar2 == null || !fjVar2.M2()) ? 0.0f : org.telegram.messenger.g0.L(-6.0f);
        float f20 = 22.0f;
        if (z12) {
            gb0 gb0Var = org.telegram.ui.ActionBar.n6.E3;
            if (H3()) {
                if (this.Q5.P5()) {
                    f14 = 1.0f;
                    w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Zc, this.Qb);
                    int i10 = this.f31452d7;
                    f17 = z14 ? 24.0f : 22.0f;
                    gb0Var.getClass();
                    f16 = 4.0f;
                    z.u(gb0Var, ((i10 - org.telegram.messenger.g0.L(f17)) - org.telegram.messenger.g0.L(12.0f)) + L4, (L3 - org.telegram.messenger.g0.L(12.0f)) + f11);
                    gb0Var.setAlpha((int) (this.f31541k4 * 255.0f * f19));
                } else {
                    f14 = 1.0f;
                    f16 = 4.0f;
                    w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29586kd, this.Qb);
                    int i11 = this.f31452d7;
                    f17 = z14 ? 24.0f : 22.0f;
                    gb0Var.getClass();
                    z.u(gb0Var, ((i11 - org.telegram.messenger.g0.L(f17)) - org.telegram.messenger.g0.L(12.0f)) + L4, (L3 - org.telegram.messenger.g0.L(12.0f)) + f11);
                    gb0Var.setAlpha((int) (f19 * 255.0f));
                }
                f15 = 18.5f;
            } else {
                f14 = 1.0f;
                f16 = 4.0f;
                w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Eb, this.Qb);
                gb0Var.getClass();
                f15 = 18.5f;
                z.u(gb0Var, (this.f31452d7 - org.telegram.messenger.g0.L(18.5f)) - org.telegram.messenger.g0.L(12.0f), ((f12 - org.telegram.messenger.g0.L(8.5f)) - org.telegram.messenger.g0.L(12.0f)) + f11);
                gb0Var.setAlpha((int) (f19 * 255.0f));
            }
            gb0Var.a(w02);
            if (z17) {
                canvas.save();
                canvas.scale(f18, f18, gb0Var.getBounds().centerX(), gb0Var.getBounds().centerY());
            }
            gb0Var.draw(canvas);
            gb0Var.setAlpha(255);
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
            if (H3()) {
                if (z15) {
                    canvas.save();
                }
                if (this.Q5.P5()) {
                    drawable = Z1("drawableMsgStickerCheck");
                    if (z10) {
                        if (z15) {
                            canvas.translate(org.telegram.messenger.g0.L(4.8f) * (f14 - f13), 0.0f);
                        }
                        z.u(drawable, ((this.f31452d7 - org.telegram.messenger.g0.L(z14 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f11);
                    } else {
                        z.u(drawable, ((this.f31452d7 - org.telegram.messenger.g0.L(z14 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + L4, (L3 - drawable.getIntrinsicHeight()) + f11);
                    }
                    drawable.setAlpha((int) (this.f31541k4 * 255.0f * f19));
                } else {
                    if (z10) {
                        if (z15) {
                            canvas.translate((f14 - f13) * org.telegram.messenger.g0.L(4.8f), 0.0f);
                        }
                        z.u(org.telegram.ui.ActionBar.n6.F3, (this.f31452d7 - org.telegram.messenger.g0.L(z14 ? 28.3f : 26.3f)) - org.telegram.ui.ActionBar.n6.F3.getIntrinsicWidth(), (L3 - org.telegram.ui.ActionBar.n6.F3.getIntrinsicHeight()) + f11);
                    } else {
                        z.u(org.telegram.ui.ActionBar.n6.F3, (this.f31452d7 - org.telegram.messenger.g0.L(z14 ? 23.5f : 21.5f)) - org.telegram.ui.ActionBar.n6.F3.getIntrinsicWidth(), (L3 - org.telegram.ui.ActionBar.n6.F3.getIntrinsicHeight()) + f11);
                    }
                    org.telegram.ui.ActionBar.n6.F3.setAlpha((int) (this.f31541k4 * 255.0f * f19));
                    drawable = org.telegram.ui.ActionBar.n6.F3;
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
                    z.u(Z1, ((this.f31452d7 - org.telegram.messenger.g0.L(22.5f)) - Z1.getIntrinsicWidth()) + L4, ((f12 - org.telegram.messenger.g0.L((this.G || this.F) ? 9.0f : 8.0f)) - Z1.getIntrinsicHeight()) + f11);
                } else {
                    Z1 = Z1(z16 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    z.u(Z1, ((this.f31452d7 - org.telegram.messenger.g0.L(f15)) - Z1.getIntrinsicWidth()) + L4, ((f12 - org.telegram.messenger.g0.L((this.G || this.F) ? 9.0f : 8.0f)) - Z1.getIntrinsicHeight()) + f11);
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
            if (H3()) {
                Drawable Z12 = this.Q5.P5() ? Z1("drawableMsgStickerHalfCheck") : org.telegram.ui.ActionBar.n6.G3;
                z.u(Z12, ((this.f31452d7 - org.telegram.messenger.g0.L(z14 ? 23.5f : 21.5f)) - Z12.getIntrinsicWidth()) + L4, (L3 - Z12.getIntrinsicHeight()) + f11);
                Z12.setAlpha((int) (this.f31541k4 * 255.0f * f19));
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
                z.u(Z13, (this.f31452d7 - org.telegram.messenger.g0.L(18.0f)) - Z13.getIntrinsicWidth(), ((f12 - org.telegram.messenger.g0.L((this.G || this.F) ? 9.0f : 8.0f)) - Z13.getIntrinsicHeight()) + f11);
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
            if (H3()) {
                L = this.f31452d7 - org.telegram.messenger.g0.L(34.5f);
                L2 = org.telegram.messenger.g0.L(26.5f);
            } else {
                L = this.f31452d7 - org.telegram.messenger.g0.L(32.0f);
                if (!this.G && !this.F) {
                    f20 = 21.0f;
                }
                L2 = org.telegram.messenger.g0.L(f20);
            }
            float f21 = (f12 - L2) + f11;
            RectF rectF = this.f31436c4;
            rectF.set((int) (L + L4), f21, org.telegram.messenger.g0.L(14.0f) + i7, org.telegram.messenger.g0.L(14.0f) + f21);
            int alpha = org.telegram.ui.ActionBar.n6.f29410b2.getAlpha();
            org.telegram.ui.ActionBar.n6.f29410b2.setAlpha((int) (alpha * f19));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f14), org.telegram.messenger.g0.L(f14), org.telegram.ui.ActionBar.n6.f29410b2);
            org.telegram.ui.ActionBar.n6.f29410b2.setAlpha(alpha);
            z.u(org.telegram.ui.ActionBar.n6.f29558j4, org.telegram.messenger.g0.L(6.0f) + i7, f21 + org.telegram.messenger.g0.L(2.0f));
            org.telegram.ui.ActionBar.n6.f29558j4.setAlpha((int) (f19 * 255.0f));
            if (z17) {
                canvas.save();
                canvas.scale(f18, f18, org.telegram.ui.ActionBar.n6.f29558j4.getBounds().centerX(), org.telegram.ui.ActionBar.n6.f29558j4.getBounds().centerY());
            }
            org.telegram.ui.ActionBar.n6.f29558j4.draw(canvas);
            org.telegram.ui.ActionBar.n6.f29558j4.setAlpha(255);
            if (z17) {
                canvas.restore();
            }
        }
    }

    public final boolean x2() {
        fj fjVar;
        int i7;
        if (u2() && !this.F && (i7 = (fjVar = this.Q5).D) != 16 && i7 != 27 && !fjVar.g3() && !this.Q5.r4()) {
            fj fjVar2 = this.Q5;
            if (fjVar2.G != null || fjVar2.Z0() != 0 || this.Q5.f24073k.post) {
                xi xiVar = this.M;
                if (xiVar == null || (xiVar.f28005l & 4) != 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void x3(org.telegram.messenger.fj r111, org.telegram.messenger.aj r112, boolean r113, boolean r114, boolean r115, boolean r116) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.x3(org.telegram.messenger.fj, org.telegram.messenger.aj, boolean, boolean, boolean, boolean):void");
    }

    @Override
    public final void y(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.y(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    public final void y0() {
        float f10;
        float f11;
        int i7;
        int measureText;
        boolean z10;
        if (this.f31672u2) {
            B0(0);
        }
        if (this.f31672u2 && this.f31632r2 == null) {
            this.D2 = org.telegram.messenger.g0.L(33.0f);
            CharSequence charSequence = this.f31739z2;
            if (charSequence == null) {
                int i10 = this.f31727y2;
                if (i10 == 12) {
                    charSequence = gd.N0(2131747614, null);
                } else if (i10 == 1) {
                    charSequence = gd.N0(2131747618, null);
                } else if (i10 == 29) {
                    charSequence = gd.N0(2131747615, null);
                } else if (i10 == 13) {
                    charSequence = gd.N0(2131745405, null).toUpperCase();
                } else if (i10 == 32) {
                    charSequence = gd.N0(2131747592, null).toUpperCase();
                } else if (i10 == 85) {
                    charSequence = gd.N0(2131747622, null);
                } else if (i10 == 10) {
                    charSequence = gd.N0(2131747619, null);
                } else if (i10 == 2) {
                    charSequence = gd.N0(2131747606, null);
                } else if (i10 == 3) {
                    charSequence = gd.N0(2131747593, null);
                } else if (i10 == 5) {
                    charSequence = gd.N0(2131743306, null);
                } else if (i10 == 6) {
                    charSequence = gd.N0(2131747620, null);
                } else if (i10 == 7) {
                    charSequence = gd.N0(2131747590, null);
                } else if (i10 != 9 && i10 != 11) {
                    if (i10 == 25) {
                        charSequence = gd.N0(2131743117, null);
                    } else if (i10 == 14) {
                        charSequence = gd.N0(2131743308, null).toUpperCase();
                    } else if (i10 == 15) {
                        charSequence = gd.N0(2131752906, null).toUpperCase();
                    } else if (i10 == 16) {
                        charSequence = gd.N0(2131747595, null).toUpperCase();
                    } else if (i10 == 17) {
                        charSequence = gd.N0(2131743291, null).toUpperCase();
                    } else if (i10 != 18 && i10 != 22) {
                        if (i10 == 19) {
                            charSequence = gd.N0(2131753343, null);
                        } else if (i10 == 20) {
                            charSequence = gd.N0(2131747610, null);
                        } else if (i10 == 21) {
                            charSequence = gd.N0(2131754227, null);
                        } else if (i10 == 23) {
                            charSequence = gd.N0(2131747591, null);
                        } else if (i10 == 24) {
                            charSequence = gd.N0(2131747613, null);
                        } else if (i10 == 26) {
                            TL_stars.StarGift starGift = this.f31697vd;
                            if (starGift != null) {
                                if (starGift.auction_start_date > ConnectionsManager.getInstance(this.f31411a6).getCurrentTime()) {
                                    charSequence = gd.N0(2131747607, null);
                                    z10 = false;
                                } else {
                                    if (this.f31697vd.sold_out) {
                                        charSequence = gd.N0(2131747608, null);
                                    } else {
                                        charSequence = gd.N0(2131747609, null);
                                    }
                                    z10 = true;
                                }
                                if (z10) {
                                    SpannableString spannableString = new SpannableString("*");
                                    spannableString.setSpan(new kq(2131231119, 0), 0, spannableString.length(), 33);
                                    charSequence = TextUtils.concat(spannableString, " ", charSequence);
                                }
                            } else {
                                charSequence = gd.N0(2131747589, null);
                            }
                        } else if (i10 == 27) {
                            charSequence = gd.N0(2131748887, null).toUpperCase();
                        } else if (i10 == 28) {
                            charSequence = gd.N0(2131743307, null);
                        } else {
                            charSequence = gd.N0(2131749000, null);
                        }
                    } else {
                        charSequence = gd.N0(2131753613, null);
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) fj.n1(this.Q5.f24073k).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = gd.N0(2131743116, null);
                    } else {
                        charSequence = gd.N0(2131743117, null);
                    }
                }
            }
            if (this.Q5.r4() && this.f31426b7 < (measureText = (int) (org.telegram.ui.ActionBar.n6.M2.measureText(charSequence, 0, charSequence.length()) + org.telegram.messenger.g0.L(75.0f)))) {
                this.f31426b7 = measureText;
            }
            int L = this.f31426b7 - org.telegram.messenger.g0.L(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.n6.M2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.n6.M2, org.telegram.messenger.g0.L(2.0f) + L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f31632r2 = staticLayout;
            int lineCount = staticLayout.getLineCount();
            float f12 = 0.0f;
            if (lineCount > 0) {
                f10 = this.f31632r2.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f31647s2 = f10;
            if (this.f31632r2.getLineCount() > 0) {
                f12 = this.f31632r2.getLineLeft(0);
            }
            this.f31659t2 = f12;
            int i11 = this.f31426b7;
            int i12 = this.f31727y2;
            if (i12 != 82 && i12 != 81 && i12 != 80 && i12 != 84 && i12 != 83) {
                f11 = 34.0f;
            } else {
                f11 = 13.0f;
            }
            this.D2 = i11 - org.telegram.messenger.g0.L(f11);
            int L2 = org.telegram.messenger.g0.L(46.0f) + this.f31684v0;
            this.f31684v0 = L2;
            if (this.Q5.D == 12) {
                this.f31684v0 = org.telegram.messenger.g0.L(14.0f) + L2;
            }
            if (this.Q5.r4()) {
                this.f31684v0 = org.telegram.messenger.g0.L(2.0f) + this.f31684v0;
            }
            StaticLayout staticLayout2 = this.f31632r2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.D2 - Math.ceil(this.f31632r2.getLineWidth(0)))) / 2;
                if (this.f31727y2 == 0) {
                    i7 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    i7 = 0;
                }
                this.B2 = ceil + i7;
                int lineLeft = (int) this.f31632r2.getLineLeft(0);
                this.C2 = lineLeft;
                this.B2 += -lineLeft;
            }
        }
    }

    public void y1(float r16, android.graphics.Canvas r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.y1(float, android.graphics.Canvas, boolean):void");
    }

    public final boolean y2() {
        if (this.Q5 != null && this.L == null && !this.B5 && x2() && H2()) {
            return true;
        }
        return false;
    }

    public void y3(fj fjVar, aj ajVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.O0) {
            x3(fjVar, ajVar, z10, z11, z12, z13);
            return;
        }
        this.R5 = fjVar;
        this.S5 = ajVar;
        this.U5 = z10;
        this.T5 = z11;
        this.V5 = z12;
        this.W5 = z13;
    }

    public final void z() {
        A(getX(), this.f31430bb, getMeasuredWidth(), this.f31443cb);
    }

    public final void z0(long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r1.z0(long, long):void");
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
        float L;
        int i14;
        float f14;
        boolean z12;
        y1 y1Var;
        int i15;
        float f15;
        boolean z13;
        float f16;
        boolean z14;
        int i16;
        r1 r1Var;
        String str;
        float f17;
        float L2;
        y1 y1Var2;
        boolean z15;
        float f18;
        int i17;
        y1 y1Var3;
        boolean z16;
        float f19;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        int i18;
        Paint a22;
        float f20;
        float f21;
        int L3;
        boolean z22;
        float photoBottom;
        int i19;
        int i20;
        float f22;
        boolean z23;
        y1 y1Var4;
        float f23;
        float f24;
        boolean z24;
        int i21;
        boolean z25;
        fj fjVar;
        TextPaint textPaint;
        int i22;
        int i23;
        r1 r1Var2 = this;
        Canvas canvas2 = canvas;
        if (((r1Var2.F9 && !r1Var2.N) || !r1Var2.H3()) && staticLayout != null) {
            fj fjVar2 = r1Var2.Q5;
            if ((!fjVar2.Z || r1Var2.M == null) && (i7 = fjVar2.D) != 16) {
                if (i7 == 5) {
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.n6.T2;
                    if (r1Var2.u2()) {
                        i22 = r1Var2.Q5.P3() ? org.telegram.ui.ActionBar.n6.f29566jc : org.telegram.ui.ActionBar.n6.f29477ee;
                    } else {
                        i22 = org.telegram.ui.ActionBar.n6.Zc;
                    }
                    int w02 = org.telegram.ui.ActionBar.n6.w0(i22, r1Var2.Qb);
                    if (r1Var2.A2()) {
                        i23 = r1Var2.Q5.P3() ? org.telegram.ui.ActionBar.n6.f29475ec : org.telegram.ui.ActionBar.n6.fe;
                    } else {
                        i23 = r1Var2.Q5.P3() ? org.telegram.ui.ActionBar.n6.f29566jc : org.telegram.ui.ActionBar.n6.f29477ee;
                    }
                    textPaint2.setColor(i0.a.f(r1Var2.getVideoTranscriptionProgress(), w02, org.telegram.ui.ActionBar.n6.w0(i23, r1Var2.Qb)));
                } else if (r1Var2.H3()) {
                    if (r1Var2.Q5.P5()) {
                        org.telegram.ui.ActionBar.n6.T2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Zc, r1Var2.Qb));
                    } else {
                        org.telegram.ui.ActionBar.n6.T2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29421be, r1Var2.Qb));
                    }
                } else if (r1Var2.Q5.P3()) {
                    org.telegram.ui.ActionBar.n6.T2.setColor(org.telegram.ui.ActionBar.n6.w0(z11 ? org.telegram.ui.ActionBar.n6.f29475ec : org.telegram.ui.ActionBar.n6.f29566jc, r1Var2.Qb));
                } else {
                    org.telegram.ui.ActionBar.n6.T2.setColor(org.telegram.ui.ActionBar.n6.w0(z11 ? org.telegram.ui.ActionBar.n6.fe : org.telegram.ui.ActionBar.n6.f29477ee, r1Var2.Qb));
                }
                if (r1Var2.y2()) {
                    org.telegram.ui.ActionBar.n6.T2.setColor(org.telegram.ui.ActionBar.n6.w0(z11 ? org.telegram.ui.ActionBar.n6.f29458de : org.telegram.ui.ActionBar.n6.f29441ce, r1Var2.Qb));
                }
                float f25 = r1Var2.getTransitionParams().K1 ? r1Var2.getTransitionParams().L1 * f10 : f10;
                if (f25 != 1.0f) {
                    org.telegram.ui.ActionBar.n6.T2.setAlpha((int) (textPaint.getAlpha() * f25));
                }
                canvas2.save();
                if (r1Var2.K && !r1Var2.H3() && !r1Var2.y2()) {
                    canvas2.translate(0.0f, org.telegram.messenger.g0.L(2.0f));
                }
                float f26 = r1Var2.f31465e7;
                y1 y1Var5 = r1Var2.f31521ib;
                if (y1Var5.f32540x0) {
                    f26 += y1Var5.f32485j0;
                }
                aj ajVar = r1Var2.L;
                if (ajVar == null || !ajVar.f23016m.f28399j) {
                    f13 = f11;
                } else {
                    f26 -= r1Var2.getTranslationY();
                    f13 = f11 + r1Var2.L.f23016m.f28397g;
                }
                float f27 = f26;
                float f28 = f13;
                if (r1Var2.K && r1Var2.H3()) {
                    f27 += org.telegram.messenger.g0.L(1.0f);
                }
                float f29 = f27;
                if (y1Var5.f32540x0) {
                    float f30 = r1Var2.f31549kd;
                    f13 += f30;
                    f28 += f30;
                }
                float f31 = f13;
                boolean O5 = r1Var2.Q5.O5();
                ch.q0 q0Var = r1Var2.O;
                if (O5) {
                    q0Var.getClass();
                }
                if (y1Var5.U0) {
                    f28 = com.google.android.gms.internal.vision.e2.t(1.0f, y1Var5.L1, y1Var5.Z0, f28);
                }
                float f32 = f28;
                boolean H3 = r1Var2.H3();
                RectF rectF2 = r1Var2.f31436c4;
                fi.s2 s2Var = r1Var2.U0;
                if (H3) {
                    if (r1Var2.f31719x7) {
                        i18 = r1Var2.u2() ? r1Var2.getCommentButtonHeight() : org.telegram.messenger.g0.L(41.3f);
                    } else {
                        i18 = 0;
                    }
                    int i24 = -i18;
                    if (r1Var2.Q5.P5()) {
                        a22 = r1Var2.a2("paintChatActionBackground");
                    } else {
                        a22 = r1Var2.a2("paintChatTimeBackground");
                    }
                    int alpha = a22.getAlpha();
                    float f33 = f25;
                    org.telegram.ui.ActionBar.n6.T2.setAlpha((int) (r1Var2.f31541k4 * 255.0f * f33));
                    fj fjVar3 = r1Var2.Q5;
                    if (fjVar3 == null || fjVar3.D != 4) {
                        f20 = f29;
                        f21 = f33;
                    } else {
                        float f34 = s2Var.O() ? 1.0f : s2Var.f22739i1;
                        if (!s2Var.M()) {
                            f34 = 0.0f;
                        }
                        f20 = f29;
                        f21 = org.telegram.messenger.g0.T1(0.35f, 1.0f, f34);
                    }
                    fj fjVar4 = r1Var2.Q5;
                    if (fjVar4 != null && fjVar4.B0) {
                        org.telegram.ui.Components.m5 m5Var = r1Var2.m0;
                        f21 *= m5Var == null ? 0.0f : m5Var.e();
                    }
                    a22.setAlpha((int) com.google.android.gms.internal.vision.e2.D(alpha, r1Var2.f31541k4, f21, 0.6f));
                    if (r1Var2.e4()) {
                        int L4 = org.telegram.messenger.g0.L(8.0f);
                        int i25 = bz.Y0;
                        if (i25 > 2) {
                            i25 -= 2;
                        }
                        L3 = Math.min(L4, org.telegram.messenger.g0.L(i25));
                        z22 = bz.Y0 >= 10;
                        i10 = 2;
                    } else {
                        int i26 = r1Var2.M1;
                        if (i26 != 7 && i26 != 6 && r1Var2.Q5.D != 19) {
                            int[] iArr = s2Var.X0;
                            i10 = 2;
                            L3 = Math.min(org.telegram.messenger.g0.L(8.0f), Math.max(iArr[2], iArr[3]));
                            z22 = bz.Y0 >= 10;
                        } else {
                            i10 = 2;
                            int L5 = org.telegram.messenger.g0.L(4.0f);
                            fj fjVar5 = r1Var2.Q5;
                            L3 = L5 + ((fjVar5 == null || !fjVar5.M2()) ? 0 : org.telegram.messenger.g0.L(8.0f));
                            z22 = false;
                        }
                    }
                    fj fjVar6 = r1Var2.Q5;
                    float L6 = f31 + ((fjVar6 == null || !fjVar6.M2()) ? 0 : org.telegram.messenger.g0.L(-6.0f));
                    if (r1Var2.f31524j0 != 0) {
                        L6 -= org.telegram.messenger.g0.L(18.0f);
                    }
                    float L7 = L6 - org.telegram.messenger.g0.L(z22 ? 6.0f : 4.0f);
                    fj fjVar7 = r1Var2.Q5;
                    float L8 = (fjVar7 == null || !fjVar7.M2()) ? 0.0f : org.telegram.messenger.g0.L(2.0f);
                    float f35 = f21;
                    float f36 = L6;
                    if (r1Var2.M1 != 7 || ((fjVar = r1Var2.Q5) != null && fjVar.g4())) {
                        photoBottom = r1Var2.getPhotoBottom() + r1Var2.f31699w0;
                    } else {
                        photoBottom = f20 - ((1.0f - r1Var2.getVideoTranscriptionProgress()) * (q0Var.i(y1Var5.L1) + org.telegram.messenger.g0.L(r1Var2.K ? 4.0f : 5.0f)));
                    }
                    float f37 = photoBottom;
                    float L9 = f37 - org.telegram.messenger.g0.L(23.0f);
                    float max = Math.max(org.telegram.messenger.g0.L(17.0f), org.telegram.ui.ActionBar.n6.T2.getTextSize() + org.telegram.messenger.g0.L(5.0f));
                    float f38 = L7 - L8;
                    float f39 = L8 + L7 + f12;
                    int i27 = z22 ? 12 : 8;
                    if (r1Var2.Q5.P3()) {
                        i19 = i27;
                        i20 = (r1Var2.Q5.D == 19 ? 4 : 0) + 20;
                    } else {
                        i19 = i27;
                        i20 = 0;
                    }
                    rectF2.set(f38, L9, f39 + org.telegram.messenger.g0.L(i19 + i20), L9 + max);
                    m4 m4Var = r1Var2.X5;
                    if (m4Var != null) {
                        float f40 = L3;
                        canvas2.save();
                        Path path = m4Var.f31146t;
                        path.rewind();
                        path.addRoundRect(rectF2, f40, f40, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.drawColor(1073741824);
                        canvas2.restore();
                    } else if (!fj.b4(r1Var2.Q5.f24073k)) {
                        if (r1Var2.Q5.t2() && r1Var2.Q5.D != 5) {
                            Path path2 = r1Var2.B4;
                            path2.rewind();
                            float f41 = L3;
                            path2.addRoundRect(rectF2, f41, f41, Path.Direction.CW);
                            canvas2.save();
                            canvas2.clipPath(path2);
                            ImageReceiver imageReceiver = r1Var2.Q5.m5() ? s2Var : r1Var2.V0;
                            float alpha2 = imageReceiver.getAlpha();
                            imageReceiver.setAlpha(0.5f * alpha2);
                            imageReceiver.h(canvas2, null);
                            imageReceiver.setAlpha(alpha2);
                            canvas2.restore();
                            Paint a23 = r1Var2.a2("paintChatTimeBackground");
                            int alpha3 = a23.getAlpha();
                            a23.setAlpha((int) (alpha3 * r1Var2.f31553l4 * 0.4f));
                            canvas2.drawRoundRect(rectF2, f41, f41, a23);
                            a23.setAlpha(alpha3);
                        } else {
                            r1Var2.z();
                            float f42 = L3;
                            canvas2.drawRoundRect(rectF2, f42, f42, a22);
                            if (a22 == r1Var2.a2("paintChatActionBackground") && r1Var2.h2()) {
                                int alpha4 = org.telegram.ui.ActionBar.n6.f29521h2.getAlpha();
                                org.telegram.ui.ActionBar.n6.f29521h2.setAlpha((int) (alpha4 * r1Var2.f31541k4 * f35));
                                canvas2.drawRoundRect(rectF2, f42, f42, org.telegram.ui.ActionBar.n6.f29521h2);
                                org.telegram.ui.ActionBar.n6.f29521h2.setAlpha(alpha4);
                            }
                        }
                    }
                    a22.setAlpha(alpha);
                    float f43 = -staticLayout.getLineLeft(0);
                    fj fjVar8 = r1Var2.Q5;
                    float L10 = f43 + ((fjVar8 == null || !fjVar8.M2()) ? 0 : org.telegram.messenger.g0.L(-6.0f));
                    if (r1Var2.Q5.O5()) {
                        q0Var.getClass();
                    }
                    if ((!org.telegram.messenger.v3.T(r1Var2.f31547ka) || r1Var2.f31547ka.megagroup) && (r1Var2.Q5.f24073k.flags & 1024) == 0 && r1Var2.f31494ga == null && !r1Var2.f31621q6) {
                        f22 = L10;
                        rectF = rectF2;
                        f25 = f33;
                        f29 = f20;
                        i13 = i24;
                        z23 = false;
                        c10 = 6;
                        c11 = 7;
                        c12 = 4;
                    } else {
                        float lineWidth = (r1Var2.A9 - staticLayout.getLineWidth(0)) + L10;
                        q0Var.getClass();
                        int b10 = y1Var5.b();
                        int i28 = y1Var5.f32450b2;
                        if (i28 >= 0 && i28 != b10 && !r1Var2.f31667tb) {
                            r1Var2.C0(i28, b10, z10);
                        }
                        boolean z26 = r1Var2.f31667tb;
                        if (z26) {
                            b10 = r1Var2.f31626qb;
                        }
                        boolean z27 = (b10 & 4) != 0;
                        boolean z28 = (b10 & 8) != 0;
                        if (z26) {
                            int i29 = r1Var2.f31641rb;
                            if ((i29 & 4) != 0) {
                                i21 = i29;
                                z25 = true;
                            } else {
                                i21 = i29;
                                z25 = false;
                            }
                            boolean z29 = (i21 & 8) != 0;
                            float f44 = i24;
                            y1Var4 = y1Var5;
                            f23 = lineWidth;
                            rectF = rectF2;
                            float f45 = f20;
                            c10 = 6;
                            c12 = 4;
                            z23 = false;
                            i13 = i24;
                            c11 = 7;
                            r1Var2.T0(canvas2, z25, z29, f45, f33, f44, f36, 1.0f - r1Var2.f31654sb, z11);
                            boolean z30 = z25;
                            boolean z31 = z29;
                            boolean z32 = z27;
                            boolean z33 = z28;
                            r1Var2.T0(canvas, z32, z33, f45, f33, f44, f36, r1Var2.f31654sb, z11);
                            f29 = f45;
                            f24 = f36;
                            z24 = z32;
                            f25 = f33;
                            if (!r1Var2.Q5.P3()) {
                                if (!z30 && !z31) {
                                    r1Var2.B1(canvas, f25, f44, f24, 1.0f - r1Var2.f31654sb, z11);
                                }
                                if (!z24 && !z33) {
                                    r1Var2.B1(canvas, f25, f44, f24, r1Var2.f31654sb, z11);
                                }
                            }
                        } else {
                            y1Var4 = y1Var5;
                            f23 = lineWidth;
                            rectF = rectF2;
                            boolean z34 = z27;
                            boolean z35 = z28;
                            float f46 = f20;
                            i13 = i24;
                            c10 = 6;
                            c11 = 7;
                            c12 = 4;
                            z23 = false;
                            if (!r1Var2.Q5.P3() && !z34 && !z35) {
                                r1Var2.B1(canvas, f33, i13, f36, 1.0f, z11);
                            }
                            r1Var2 = this;
                            r1Var2.T0(canvas, z34, z35, f46, f33, i13, f36, 1.0f, z11);
                            f29 = f46;
                            f24 = f36;
                            z24 = z34;
                            f25 = f33;
                        }
                        if (r1Var2.Q5.P3()) {
                            canvas2 = canvas;
                            r1Var2.B1(canvas2, f25, i13, f24, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        y1Var5 = y1Var4;
                        y1Var5.f32450b2 = y1Var4.b();
                        if (z24 && z10 && r1Var2.getParent() != null) {
                            ((View) r1Var2.getParent()).invalidate();
                        }
                        f22 = f23;
                    }
                    canvas2.save();
                    float f47 = f32 + f22;
                    r1Var2.f31721x9 = f47;
                    float L11 = (f37 - org.telegram.messenger.g0.L(7.3f)) - staticLayout.getHeight();
                    r1Var2.f31734y9 = L11;
                    canvas2.translate(f47, L11);
                    xh.f.f(canvas2, staticLayout);
                    canvas2.restore();
                    org.telegram.ui.ActionBar.n6.T2.setAlpha(255);
                    z12 = z22;
                    i16 = z23;
                } else {
                    rectF = rectF2;
                    i10 = 2;
                    c10 = 6;
                    c11 = 7;
                    c12 = 4;
                    if (r1Var2.Q5.r4()) {
                        i12 = -org.telegram.messenger.g0.L(48.0f);
                        if (r1Var2.f31439c7) {
                            i12 -= org.telegram.messenger.g0.L(4.0f);
                        }
                    } else {
                        if (r1Var2.f31719x7) {
                            i11 = r1Var2.u2() ? r1Var2.getCommentButtonHeight() : org.telegram.messenger.g0.L(43.0f);
                        } else {
                            i11 = 0;
                        }
                        i12 = -i11;
                    }
                    i13 = i12;
                    if (r1Var2.y2()) {
                        L = r1Var2.getCompactNameTimeY();
                    } else {
                        L = ((f29 - org.telegram.messenger.g0.L((r1Var2.G || r1Var2.F) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i13;
                    }
                    float f48 = -staticLayout.getLineLeft(0);
                    if (r1Var2.Q5.O5()) {
                        q0Var.getClass();
                    }
                    if ((!org.telegram.messenger.v3.T(r1Var2.f31547ka) || r1Var2.f31547ka.megagroup) && (r1Var2.Q5.f24073k.flags & 1024) == 0 && r1Var2.f31494ga == null && !y1Var5.G && !r1Var2.f31621q6 && !y1Var5.C) {
                        i14 = 0;
                        f14 = L;
                    } else {
                        float lineWidth2 = (f12 - staticLayout.getLineWidth(0)) + f48;
                        q0Var.getClass();
                        int b11 = y1Var5.b();
                        int i30 = y1Var5.f32450b2;
                        if (i30 >= 0 && i30 != b11 && !r1Var2.f31667tb) {
                            r1Var2.C0(i30, b11, z10);
                        }
                        boolean z36 = r1Var2.f31667tb;
                        if (z36) {
                            b11 = r1Var2.f31626qb;
                        }
                        boolean z37 = (b11 & 4) != 0;
                        boolean z38 = (b11 & 8) != 0;
                        if (z36) {
                            int i31 = r1Var2.f31641rb;
                            boolean z39 = (i31 & 4) != 0;
                            if ((i31 & 8) != 0) {
                                f16 = L;
                                z14 = true;
                            } else {
                                f16 = L;
                                z14 = false;
                            }
                            float f49 = i13;
                            y1Var = y1Var5;
                            i15 = 0;
                            f14 = f16;
                            float f50 = f25;
                            boolean z40 = z39;
                            r1Var2.T0(canvas2, z40, z14, f29, f50, f49, f31, 1.0f - r1Var2.f31654sb, z11);
                            boolean z41 = z14;
                            boolean z42 = z37;
                            boolean z43 = z38;
                            r1Var2.T0(canvas, z42, z43, f29, f50, f49, f31, r1Var2.f31654sb, z11);
                            f29 = f29;
                            f15 = f31;
                            z13 = z42;
                            f25 = f50;
                            if (!r1Var2.Q5.P3()) {
                                if (!z40 && !z41) {
                                    r1Var2.B1(canvas, f25, f49, f15, 1.0f - r1Var2.f31654sb, z11);
                                }
                                if (!z13 && !z43) {
                                    r1Var2.B1(canvas, f25, f49, f15, r1Var2.f31654sb, z11);
                                }
                            }
                        } else {
                            y1Var = y1Var5;
                            i15 = 0;
                            boolean z44 = z37;
                            boolean z45 = z38;
                            f14 = L;
                            if (!r1Var2.Q5.P3() && !z44 && !z45) {
                                r1Var2.B1(canvas, f25, i13, f31, 1.0f, z11);
                            }
                            r1Var2 = this;
                            float f51 = f25;
                            r1Var2.T0(canvas, z44, z45, f29, f51, i13, f31, 1.0f, z11);
                            f29 = f29;
                            f15 = f31;
                            z13 = z44;
                            f25 = f51;
                        }
                        if (r1Var2.Q5.P3()) {
                            canvas2 = canvas;
                            r1Var2.B1(canvas2, f25, i13, f15, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        y1Var5 = y1Var;
                        y1Var5.f32450b2 = y1Var.b();
                        if (z13 && z10 && r1Var2.getParent() != null) {
                            ((View) r1Var2.getParent()).invalidate();
                        }
                        f48 = lineWidth2;
                        i14 = i15;
                    }
                    canvas2.save();
                    if (y1Var5.U0 && y1Var5.L1 != 1.0f) {
                        if (y1Var5.V0 != null) {
                            canvas2.translate(f32 + f48, f14);
                            int alpha5 = org.telegram.ui.ActionBar.n6.T2.getAlpha();
                            org.telegram.ui.ActionBar.n6.T2.setAlpha((int) (alpha5 * y1Var5.L1));
                            y1Var5.V0.draw(canvas2);
                            org.telegram.ui.ActionBar.n6.T2.setAlpha(alpha5);
                            xh.f.f(canvas2, y1Var5.W0);
                        } else {
                            int alpha6 = org.telegram.ui.ActionBar.n6.T2.getAlpha();
                            canvas2.save();
                            canvas2.translate(y1Var5.f32476h1 + f48, f14);
                            float f52 = alpha6;
                            org.telegram.ui.ActionBar.n6.T2.setAlpha((int) ((1.0f - y1Var5.L1) * f52));
                            xh.f.f(canvas2, y1Var5.W0);
                            canvas2.restore();
                            canvas2.translate(f32 + f48, f14);
                            org.telegram.ui.ActionBar.n6.T2.setAlpha((int) (f52 * y1Var5.L1));
                            xh.f.f(canvas2, staticLayout);
                            org.telegram.ui.ActionBar.n6.T2.setAlpha(alpha6);
                        }
                    } else {
                        float f53 = f32 + f48;
                        r1Var2.f31721x9 = f53;
                        r1Var2.f31734y9 = f14;
                        canvas2.translate(f53, f14);
                        xh.f.f(canvas2, staticLayout);
                    }
                    canvas2.restore();
                    z12 = i14 == 1 ? 1 : 0;
                    i16 = i14;
                }
                int i32 = i13;
                if (r1Var2.Q5.P3()) {
                    int b12 = y1Var5.b();
                    int i33 = y1Var5.f32450b2;
                    if (i33 >= 0 && i33 != b12 && !r1Var2.f31667tb) {
                        r1Var2.C0(i33, b12, z10);
                    }
                    if (r1Var2.f31667tb) {
                        b12 = r1Var2.f31626qb;
                    }
                    int i34 = (b12 & 1) != 0 ? true : i16;
                    int i35 = (b12 & 2) != 0 ? true : i16;
                    if ((b12 & 4) != 0) {
                        y1Var2 = y1Var5;
                        z15 = true;
                    } else {
                        y1Var2 = y1Var5;
                        z15 = i16;
                    }
                    boolean z46 = (b12 & 8) != 0 ? true : i16;
                    if (r1Var2.Ic != 0.0f) {
                        canvas2.save();
                        f18 = 0.0f;
                        canvas2.translate(0.0f, r1Var2.Ic);
                        i17 = 1;
                    } else {
                        f18 = 0.0f;
                        i17 = i16;
                    }
                    if (r1Var2.f31667tb) {
                        int i36 = r1Var2.f31641rb;
                        if ((i36 & 1) != 0) {
                            z16 = i35;
                            f19 = f25;
                            z17 = true;
                        } else {
                            z16 = i35;
                            f19 = f25;
                            z17 = i16;
                        }
                        boolean z47 = (i36 & 2) != 0 ? true : i16;
                        if ((i36 & 4) != 0) {
                            z18 = z15;
                            z19 = true;
                        } else {
                            z18 = z15;
                            z19 = i16;
                        }
                        if ((i36 & 8) != 0) {
                            z20 = z46;
                            z21 = true;
                        } else {
                            z20 = z46;
                            z21 = i16;
                        }
                        if (!z19 && z47 && z16 && !z17 && i34) {
                            y1Var3 = y1Var2;
                            f17 = f18;
                            z15 = z18;
                            str = "paintChatTimeBackground";
                            r1Var2.x1(canvas2, i34, z16, z15, z20, f19, z12, i32, f29, r1Var2.f31654sb, true, z11);
                        } else {
                            y1Var3 = y1Var2;
                            f17 = f18;
                            boolean z48 = z16;
                            boolean z49 = i34;
                            str = "paintChatTimeBackground";
                            float f54 = i32;
                            r1Var2.x1(canvas, z17, z47, z19, z21, f19, z12, f54, f29, 1.0f - r1Var2.f31654sb, false, z11);
                            z15 = z18;
                            r1Var2.x1(canvas, z49, z48, z15, z20, f19, z12, f54, f29, r1Var2.f31654sb, false, z11);
                        }
                        r1Var = this;
                        canvas2 = canvas;
                    } else {
                        y1Var3 = y1Var2;
                        f17 = f18;
                        str = "paintChatTimeBackground";
                        canvas2 = canvas;
                        x1(canvas2, i34, i35, z15, z46, f25, z12, i32, f29, 1.0f, false, z11);
                        r1Var = this;
                    }
                    if (i17 != 0) {
                        canvas2.restore();
                    }
                    y1Var3.f32450b2 = y1Var3.b();
                    if (z10 && z15 && r1Var.getParent() != null) {
                        ((View) r1Var.getParent()).invalidate();
                    }
                } else {
                    r1Var = r1Var2;
                    str = "paintChatTimeBackground";
                    f17 = 0.0f;
                }
                canvas2.restore();
                if (r1Var.X9 != null) {
                    if (r1Var.V9 == f17 || r1Var.W9 == f17) {
                        r1Var.D();
                    }
                    Path path3 = r1Var.f31429ba;
                    path3.rewind();
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    rectF3.set(s2Var.L0, s2Var.M0, s2Var.z(), s2Var.B());
                    int[] iArr2 = s2Var.X0;
                    float f55 = iArr2[i16];
                    float[] fArr = r1Var.f31442ca;
                    fArr[1] = f55;
                    fArr[i16] = f55;
                    float f56 = iArr2[1];
                    fArr[3] = f56;
                    fArr[i10] = f56;
                    float f57 = iArr2[i10];
                    fArr[5] = f57;
                    fArr[c12] = f57;
                    float f58 = iArr2[3];
                    fArr[c11] = f58;
                    fArr[c10] = f58;
                    Path.Direction direction = Path.Direction.CW;
                    path3.addRoundRect(rectF3, fArr, direction);
                    canvas2.save();
                    canvas2.clipPath(path3);
                    path3.rewind();
                    rectF3.set(r1Var.V9 - org.telegram.messenger.g0.L(12.0f), r1Var.W9 - org.telegram.messenger.g0.L(8.0f), r1Var.V9 + org.telegram.ui.ActionBar.n6.L3.getIntrinsicWidth() + org.telegram.messenger.g0.L(14.0f) + r1Var.X9.getWidth() + org.telegram.messenger.g0.L(12.0f), r1Var.W9 + r1Var.X9.getHeight() + org.telegram.messenger.g0.L(8.0f));
                    path3.addRoundRect(rectF3, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), direction);
                    canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    if (r1Var.Q9 == null) {
                        if (r1Var.f31415aa == null) {
                            r1Var.f31415aa = new xh.f();
                        }
                        r1Var.f31415aa.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                        r1Var.f31415aa.setBounds((int) s2Var.L0, (int) s2Var.M0, (int) s2Var.z(), (int) s2Var.B());
                        r1Var.f31415aa.draw(canvas2);
                    }
                    r1Var.invalidate();
                    canvas2.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, r1Var.getWidth(), r1Var.getHeight(), (int) (r1Var.U9 * 255.0f), 31);
                    int alpha7 = org.telegram.ui.ActionBar.n6.f29539i2.getAlpha();
                    org.telegram.ui.ActionBar.n6.f29539i2.setAlpha((int) (alpha7 * 0.7f));
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.ui.ActionBar.n6.f29539i2);
                    org.telegram.ui.ActionBar.n6.f29539i2.setAlpha(alpha7);
                    canvas.translate(r1Var.V9 + org.telegram.messenger.g0.L(4.0f), r1Var.W9);
                    Drawable drawable = org.telegram.ui.ActionBar.n6.L3;
                    int i37 = i16;
                    drawable.setBounds(i37, i37, drawable.getIntrinsicWidth(), org.telegram.ui.ActionBar.n6.L3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.n6.L3.draw(canvas);
                    canvas.translate(org.telegram.ui.ActionBar.n6.L3.getIntrinsicWidth() + org.telegram.messenger.g0.L(6.0f), f17);
                    xh.f.f(canvas, r1Var.X9);
                    canvas.restore();
                    if (r1Var.f31617q2 != null && s2Var.R0 && r1Var.A2 == 0) {
                        int i38 = bz.Y0;
                        int i39 = i10;
                        if (i38 > i39) {
                            L2 = org.telegram.messenger.g0.L(i38 - i39);
                            z12 = bz.Y0 < 10 ? i37 : true;
                        } else {
                            L2 = org.telegram.messenger.g0.L(i38);
                        }
                        int L12 = (int) (s2Var.L0 + org.telegram.messenger.g0.L(9.0f));
                        int L13 = (int) (s2Var.M0 + org.telegram.messenger.g0.L(6.0f));
                        RectF rectF4 = rectF;
                        rectF4.set(L12 - org.telegram.messenger.g0.L(4.0f), L13 - org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(z12 ? 2.0f : f17) + org.telegram.messenger.g0.L(4.0f) + r1Var.Z1 + L12, org.telegram.messenger.g0.L(1.5f) + r1Var.f31617q2.getHeight() + L13);
                        canvas.drawRoundRect(rectF4, L2, L2, r1Var.a2(str));
                        canvas.save();
                        if (!z12) {
                            i39 = i37;
                        }
                        canvas.translate(L12 + i39, L13);
                        xh.f.f(canvas, r1Var.f31617q2);
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final boolean z2(fj fjVar) {
        int i7 = fj.n1(this.Q5.f24073k).period;
        int currentTime = ConnectionsManager.getInstance(this.f31411a6).getCurrentTime();
        if (i7 == Integer.MAX_VALUE) {
            return false;
        }
        if (i7 % 60 == 0) {
            if (Math.abs(currentTime - fjVar.f24073k.date) <= i7) {
                return false;
            }
            return true;
        } else if (Math.abs(currentTime - fjVar.f24073k.date) <= i7 - 5) {
            return false;
        } else {
            return true;
        }
    }

    public final void z3(int i7) {
        this.f31574n = i7;
    }

    public r1(Context context, int i7, boolean z10, h6.m mVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = true;
        this.f31711x = new l2.c(1);
        kr krVar = kr.h;
        this.E = new te.a(0, this, krVar, 380L, false);
        this.O = new ch.q0(this);
        this.P = new zg.a(this);
        this.Q = new zg.c(this);
        this.D0 = new Rect();
        this.H0 = -1;
        this.I0 = -1;
        this.T0 = new int[4];
        this.J2 = new Drawable[2];
        this.K2 = new org.telegram.ui.ActionBar.y5[2];
        this.L2 = new int[2];
        this.M2 = new RectF();
        this.N2 = new int[]{16842910, 16842919};
        this.j3 = -1;
        this.f31540k3 = -1;
        this.f31423b4 = new RectF();
        this.f31436c4 = new RectF();
        this.f31541k4 = 1.0f;
        this.f31553l4 = 1.0f;
        this.f31661t4 = -1;
        this.f31674u4 = new n2.p0(this);
        this.f31703w4 = new ArrayList();
        this.f31716x4 = new ArrayList();
        this.B4 = new Path();
        this.P4 = new ArrayList();
        this.Q4 = new ArrayList();
        this.S4 = -1;
        this.T4 = -1;
        this.V4 = true;
        this.I5 = new ArrayList();
        this.f31438c6 = -1;
        this.D6 = true;
        this.I6 = true;
        this.f31426b7 = 100;
        this.f31732y7 = new Rect();
        this.S7 = new AtomicReference();
        this.f31428b9 = new RectF();
        this.f31624q9 = new StaticLayout[2];
        this.f31708w9 = new float[2];
        this.F9 = true;
        this.J9 = new Path();
        this.K9 = new float[8];
        this.U9 = 1.0f;
        this.f31429ba = new Path();
        this.f31442ca = new float[8];
        this.Ma = new RectF();
        this.Na = new RectF();
        this.f31495gb = Build.VERSION.SDK_INT == 28;
        this.f31508hb = 1.0f;
        this.f31521ib = new y1(this);
        this.mb = new org.telegram.ui.Components.c6(this, 200L, kr.f36859g);
        this.f31612pb = new i1(this, 0);
        this.f31710wb = new i1(this, 1);
        this.f31723xb = new SparseArray();
        this.Lb = -1;
        this.Nb = new m.b3();
        this.Tb = new ArrayList();
        this.Ub = new Stack();
        this.Vb = new Path();
        this.Yb = new e1(this, 10);
        this.Zb = new e1(this, 2);
        this.f31496gc = false;
        this.f31599oc = new AtomicReference();
        this.f31613pc = -1L;
        this.Bc = false;
        this.Cc = new e1(this, 0);
        this.Lc = true;
        this.Sc = new Path();
        this.Tc = new RectF();
        this.Vc = -1;
        this.f31445cd = new RectF();
        this.f31457dd = new RectF();
        this.f31497gd = 1.0f;
        this.f31562ld = new h1(Float.class, "animationOffsetX", 0);
        this.f31587nd = new Path();
        this.f31411a6 = i7;
        this.Qb = i6Var;
        this.Rb = z10;
        this.Sb = mVar;
        if (mVar == null) {
            this.Sb = new h6.m(context);
        }
        setClipChildren(false);
        setClipToPadding(false);
        ?? drawable = new Drawable();
        drawable.f40326a = new Paint(1);
        drawable.f40327b = null;
        drawable.h = -1.0f;
        drawable.f40332i = -1.0f;
        drawable.f40333j = -1.0f;
        drawable.f40334k = -1.0f;
        drawable.f40336m = this;
        this.Ta = drawable;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.A7 = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.K0(org.telegram.messenger.g0.L(21.0f));
        this.B7 = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.T7 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.K0(org.telegram.messenger.g0.L(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.F7 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.K0(org.telegram.messenger.g0.L(26.1f));
        this.Z5 = org.telegram.messenger.a6.q(i7).k();
        this.X0 = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        fi.s2 s2Var = new fi.s2(this, this, 2);
        this.U0 = s2Var;
        s2Var.A1 = true;
        s2Var.m0 = true;
        s2Var.f22737h1 = this;
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.V0 = imageReceiver4;
        imageReceiver4.A1 = true;
        imageReceiver4.m0 = true;
        this.Q0 = new RadialProgress2(this, i6Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, i6Var);
        this.R0 = radialProgress2;
        radialProgress2.B = false;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(15.0f));
        j1 j1Var = new j1(this, this);
        this.D4 = j1Var;
        j1Var.h = this;
        ?? obj = new Object();
        obj.f34395a = 0;
        obj.f34396b = 0;
        obj.f34398e = false;
        obj.f34399f = false;
        obj.f34411s = 1.0f;
        obj.f34412t = 1.0f;
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(125L, 600L, krVar);
        obj.v = c6Var;
        obj.f34414w = 1.0f;
        org.telegram.ui.Components.c6 c6Var2 = new org.telegram.ui.Components.c6(150L, kr.f36858f);
        obj.B = c6Var2;
        obj.J = false;
        if (dn0.N == null) {
            dn0.N = new Paint(1);
            dn0.O = new Paint(1);
            Paint paint = dn0.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            dn0.O.setStyle(style);
        }
        this.E4 = obj;
        obj.f34403k = this;
        obj.f34406n = this;
        c6Var2.f33929a = this;
        c6Var.f33929a = this;
        this.F4 = new org.telegram.ui.ActionBar.t0(this, 1);
        ?? drawable2 = new Drawable();
        drawable2.f40058a = 0L;
        drawable2.f40059b = false;
        drawable2.f40060c = new Paint(1);
        drawable2.d = 0.47f;
        drawable2.f40061e = 0.0f;
        drawable2.f40062f = 0.32f;
        drawable2.f40063g = 1;
        drawable2.h = 1;
        drawable2.f40064i = 1;
        drawable2.f40068m = 255;
        drawable2.f40069n = i6Var;
        drawable2.f40065j = this;
        this.f31448d3 = drawable2;
        setImportantForAccessibility(1);
    }

    public void setBackgroundTopY(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.u4 u4Var = this.L6;
        int i12 = this.L0;
        int i13 = this.M0;
        if (i13 == 0) {
            i12 = getParentWidth();
            i13 = org.telegram.messenger.g0.f24226q.y;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                i11 = view.getMeasuredWidth();
                i10 = view.getMeasuredHeight();
                float f10 = this.N0;
                u4Var.p((int) (i7 + f10), i11, i10, (int) f10, this.f31456db, this.eb, this.F, (this.G && this.f31521ib.A0 == 1.0f) ? false : true);
                u4Var.f30158u = i2();
            }
        }
        i10 = i13;
        i11 = i12;
        float f102 = this.N0;
        u4Var.p((int) (i7 + f102), i11, i10, (int) f102, this.f31456db, this.eb, this.F, (this.G && this.f31521ib.A0 == 1.0f) ? false : true);
        u4Var.f30158u = i2();
    }

    @Override
    public void invalidate(int i7, int i10, int i11, int i12) {
        m1 m1Var;
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
        if (this.f31425b6 && getParent() != null) {
            ((View) getParent()).invalidate(((int) getX()) + i7, ((int) getY()) + i10, ((int) getX()) + i11, ((int) getY()) + i12);
        }
        if (!this.Wb || (m1Var = this.Sa) == null) {
            return;
        }
        m1Var.e();
    }

    @Override
    public final void G(float f10, int i7) {
    }

    @Override
    public final void J(int i7, Drawable drawable) {
    }
}
