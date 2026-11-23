package org.telegram.ui.ActionBar;

import a8.r7;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.StateSet;
import android.view.View;
import c8.l9;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.cz;
import org.telegram.messenger.d9;
import org.telegram.messenger.el;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.nz;
import org.telegram.messenger.o10;
import org.telegram.messenger.qc;
import org.telegram.messenger.si;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.md0;
import org.telegram.ui.n71;
public abstract class m6 {
    public static int A;
    public static Paint A0;
    public static boolean A1;
    public static TextPaint A2;
    public static Drawable A3;
    public static Drawable A4;
    public static final int A5;
    public static final int A6;
    public static final int A7;
    public static final int A8;
    public static final int A9;
    public static final int Aa;
    public static final int Ab;
    public static final int Ac;
    public static final int Ad;
    public static final int Ae;
    public static final int Af;
    public static final int Ag;
    public static final int Ah;
    public static final int Ai;
    public static final int Aj;
    public static final int Ak;
    public static final int Al;
    public static WeakReference Am;
    public static int B;
    public static TextPaint[] B0;
    public static boolean B1;
    public static TextPaint B2;
    public static Drawable B3;
    public static Drawable B4;
    public static final int B5;
    public static final int B6;
    public static final int B7;
    public static final int B8;
    public static final int B9;
    public static final int Ba;
    public static final int Bb;
    public static final int Bc;
    public static final int Bd;
    public static final int Be;
    public static final int Bf;
    public static final int Bg;
    public static final int Bh;
    public static final int Bi;
    public static final int Bj;
    public static final int Bk;
    public static final int Bl;
    public static Bitmap Bm;
    public static TextPaint[] C0;
    public static boolean C1;
    public static TextPaint C2;
    public static Drawable C3;
    public static Drawable C4;
    public static final int C5;
    public static final int C6;
    public static final int C7;
    public static final int C8;
    public static final int C9;
    public static final int Ca;
    public static final int Cb;
    public static final int Cc;
    public static final int Cd;
    public static final int Ce;
    public static final int Cf;
    public static final int Cg;
    public static final int Ch;
    public static final int Ci;
    public static final int Cj;
    public static final int Ck;
    public static final int Cl;
    public static int[] Cm;
    public static TextPaint D0;
    public static int D1;
    public static TextPaint D2;
    public static Drawable D3;
    public static Drawable D4;
    public static final int D5;
    public static final int D6;
    public static final int D7;
    public static final int D8;
    public static final int D9;
    public static final int Da;
    public static final int Db;
    public static final int Dc;
    public static final int Dd;
    public static final int De;
    public static final int Df;
    public static final int Dg;
    public static final int Dh;
    public static final int Di;
    public static final int Dj;
    public static final int Dk;
    public static final int Dl;
    public static int Dm;
    public static TextPaint E0;
    public static int E1;
    public static TextPaint E2;
    public static jb0 E3;
    public static Drawable E4;
    public static final int E5;
    public static final int E6;
    public static final int E7;
    public static final int E8;
    public static final int E9;
    public static final int Ea;
    public static final int Eb;
    public static final int Ec;
    public static final int Ed;
    public static final int Ee;
    public static final int Ef;
    public static final int Eg;
    public static final int Eh;
    public static final int Ei;
    public static final int Ej;
    public static final int Ek;
    public static final int El;
    public static final Paint Em;
    public static final ArrayList F;
    public static TextPaint[] F0;
    public static long F1;
    public static TextPaint F2;
    public static Drawable F3;
    public static Drawable F4;
    public static final int F5;
    public static final int F6;
    public static final int F7;
    public static final int F8;
    public static final int F9;
    public static final int Fa;
    public static final int Fb;
    public static final int Fc;
    public static final int Fd;
    public static final int Fe;
    public static final int Ff;
    public static final int Fg;
    public static final int Fh;
    public static final int Fi;
    public static final int Fj;
    public static final int Fk;
    public static final int Fl;
    public static final Paint Fm;
    public static final ArrayList G;
    public static TextPaint G0;
    public static boolean G1;
    public static TextPaint G2;
    public static Drawable G3;
    public static final int G5;
    public static final int G6;
    public static final int G7;
    public static final int G8;
    public static final int G9;
    public static final int Ga;
    public static final int Gb;
    public static final int Gc;
    public static final int Gd;
    public static final int Ge;
    public static final int Gf;
    public static final int Gg;
    public static final int Gh;
    public static final int Gi;
    public static final int Gj;
    public static final int Gk;
    public static final int Gl;
    public static final Paint Gm;
    public static final HashMap H;
    public static TextPaint[] H0;
    public static oh0 H1;
    public static TextPaint H2;
    public static Drawable H3;
    public static final int H5;
    public static final int H6;
    public static final int H7;
    public static final int H8;
    public static final int H9;
    public static final int Ha;
    public static final int Hb;
    public static final int Hc;
    public static final int Hd;
    public static final int He;
    public static final int Hf;
    public static final int Hg;
    public static final int Hh;
    public static final int Hi;
    public static final int Hj;
    public static final int Hk;
    public static final int Hl;
    public static final Paint Hm;
    public static l6 I;
    public static TextPaint I0;
    public static oh0 I1;
    public static TextPaint I2;
    public static Drawable I3;
    public static final int I5;
    public static final int I6;
    public static final int I7;
    public static final int I8;
    public static final int I9;
    public static final int Ia;
    public static final int Ib;
    public static final int Ic;
    public static final int Id;
    public static final int Ie;
    public static final int If;
    public static final int Ig;
    public static final int Ih;
    public static final int Ii;
    public static final int Ij;
    public static final int Ik;
    public static final int Il;
    public static final Paint Im;
    public static l6 J;
    public static TextPaint J0;
    public static oh0 J1;
    public static TextPaint J2;
    public static Drawable J3;
    public static final int J5;
    public static final int J6;
    public static final int J7;
    public static final int J8;
    public static final int J9;
    public static final int Ja;
    public static final int Jb;
    public static final int Jc;
    public static final int Jd;
    public static final int Je;
    public static final int Jf;
    public static final int Jg;
    public static final int Jh;
    public static final int Ji;
    public static final int Jj;
    public static final int Jk;
    public static final int Jl;
    public static final Paint Jm;
    public static l6 K;
    public static TextPaint K0;
    public static oh0 K1;
    public static TextPaint K2;
    public static Drawable K3;
    public static final int K5;
    public static final int K6;
    public static final int K7;
    public static final int K8;
    public static final int K9;
    public static final int Ka;
    public static final int Kb;
    public static final int Kc;
    public static final int Kd;
    public static final int Ke;
    public static final int Kf;
    public static final int Kg;
    public static final int Kh;
    public static final int Ki;
    public static final int Kj;
    public static final int Kk;
    public static final int Kl;
    public static final l6 L;
    public static TextPaint L0;
    public static oh0 L1;
    public static TextPaint L2;
    public static Drawable L3;
    public static final int L5;
    public static final int L6;
    public static final int L7;
    public static final int L8;
    public static final int L9;
    public static final int La;
    public static final int Lb;
    public static final int Lc;
    public static final int Ld;
    public static final int Le;
    public static final int Lf;
    public static final int Lg;
    public static final int Lh;
    public static final int Li;
    public static final int Lj;
    public static final int Lk;
    public static final int Ll;
    public static l6 M;
    public static TextPaint M0;
    public static oh0 M1;
    public static TextPaint M2;
    public static Drawable M3;
    public static final int M5;
    public static final int M6;
    public static final int M7;
    public static final int M8;
    public static final int M9;
    public static final int Ma;
    public static final int Mb;
    public static final int Mc;
    public static final int Md;
    public static final int Me;
    public static final int Mf;
    public static final int Mg;
    public static final int Mh;
    public static final int Mi;
    public static final int Mj;
    public static final int Mk;
    public static final int Ml;
    public static boolean N;
    public static TextPaint N0;
    public static oh0 N1;
    public static TextPaint N2;
    public static Drawable N3;
    public static final int N5;
    public static final int N6;
    public static final int N7;
    public static final int N8;
    public static final int N9;
    public static final int Na;
    public static final int Nb;
    public static final int Nc;
    public static final int Nd;
    public static final int Ne;
    public static final int Nf;
    public static final int Ng;
    public static final int Nh;
    public static final int Ni;
    public static final int Nj;
    public static final int Nk;
    public static final int Nl;
    public static boolean O;
    public static TextPaint O0;
    public static oh0 O1;
    public static TextPaint O2;
    public static Drawable O3;
    public static Drawable O4;
    public static final int O5;
    public static final int O6;
    public static final int O7;
    public static final int O8;
    public static final int O9;
    public static final int Oa;
    public static final int Ob;
    public static final int Oc;
    public static final int Od;
    public static final int Oe;
    public static final int Of;
    public static final int Og;
    public static final int Oh;
    public static final int Oi;
    public static final int Oj;
    public static final int Ok;
    public static final int Ol;
    public static boolean P;
    public static TextPaint P0;
    public static TextPaint P1;
    public static TextPaint P2;
    public static Drawable P3;
    public static Drawable P4;
    public static final int P5;
    public static final int P6;
    public static final int P7;
    public static final int P8;
    public static final int P9;
    public static final int Pa;
    public static final int Pb;
    public static final int Pc;
    public static final int Pd;
    public static final int Pe;
    public static final int Pf;
    public static final int Pg;
    public static final int Ph;
    public static final int Pi;
    public static final int Pj;
    public static final int Pk;
    public static final int Pl;
    public static boolean Q;
    public static TextPaint Q0;
    public static Drawable Q1;
    public static TextPaint Q2;
    public static Drawable Q3;
    public static Drawable Q4;
    public static final int Q5;
    public static final int Q6;
    public static final int Q7;
    public static final int Q8;
    public static final int Q9;
    public static final int Qa;
    public static final int Qb;
    public static final int Qc;
    public static final int Qd;
    public static final int Qe;
    public static final int Qf;
    public static final int Qg;
    public static final int Qh;
    public static final int Qi;
    public static final int Qj;
    public static final int Qk;
    public static final int Ql;
    public static boolean R;
    public static TextPaint R0;
    public static Drawable R1;
    public static TextPaint R2;
    public static Drawable R3;
    public static Drawable R4;
    public static final int R5;
    public static final int R6;
    public static final int R7;
    public static final int R8;
    public static final int R9;
    public static final int Ra;
    public static final int Rb;
    public static final int Rc;
    public static final int Rd;
    public static final int Re;
    public static final int Rf;
    public static final int Rg;
    public static final int Rh;
    public static final int Ri;
    public static final int Rj;
    public static final int Rk;
    public static final int Rl;
    public static int S;
    public static Drawable S0;
    public static Paint S1;
    public static TextPaint S2;
    public static Drawable S3;
    public static final int S5;
    public static final int S6;
    public static final int S7;
    public static final int S8;
    public static final int S9;
    public static final int Sa;
    public static final int Sb;
    public static final int Sc;
    public static final int Sd;
    public static final int Se;
    public static final int Sf;
    public static final int Sg;
    public static final int Sh;
    public static final int Si;
    public static final int Sj;
    public static final int Sk;
    public static final int Sl;
    public static int T;
    public static Drawable T0;
    public static Paint T1;
    public static TextPaint T2;
    public static Drawable T3;
    public static final int T5;
    public static final int T6;
    public static final int T7;
    public static final int T8;
    public static final int T9;
    public static final int Ta;
    public static final int Tb;
    public static final int Tc;
    public static final int Td;
    public static final int Te;
    public static final int Tf;
    public static final int Tg;
    public static final int Th;
    public static final int Ti;
    public static final int Tj;
    public static final int Tk;
    public static final int Tl;
    public static long U;
    public static Drawable U0;
    public static Paint U1;
    public static TextPaint U2;
    public static Drawable U3;
    public static final int U5;
    public static final int U6;
    public static final int U7;
    public static final int U8;
    public static final int U9;
    public static final int Ua;
    public static final int Ub;
    public static final int Uc;
    public static final int Ud;
    public static final int Ue;
    public static final int Uf;
    public static final int Ug;
    public static final int Uh;
    public static final int Ui;
    public static final int Uj;
    public static final int Uk;
    public static final int Ul;
    public static k9 V;
    public static Drawable V0;
    public static Paint V1;
    public static TextPaint V2;
    public static Drawable V3;
    public static Drawable V4;
    public static final int V5;
    public static final int V6;
    public static final int V7;
    public static final int V8;
    public static final int V9;
    public static final int Va;
    public static final int Vb;
    public static final int Vc;
    public static final int Vd;
    public static final int Ve;
    public static final int Vf;
    public static final int Vg;
    public static final int Vh;
    public static final int Vi;
    public static final int Vj;
    public static final int Vk;
    public static final int Vl;
    public static boolean W;
    public static Drawable W0;
    public static Paint W1;
    public static TextPaint W2;
    public static Drawable W3;
    public static Drawable W4;
    public static final int W5;
    public static final int W6;
    public static final int W7;
    public static final int W8;
    public static final int W9;
    public static final int Wa;
    public static final int Wb;
    public static final int Wc;
    public static final int Wd;
    public static final int We;
    public static final int Wf;
    public static final int Wg;
    public static final int Wh;
    public static final int Wi;
    public static final int Wj;
    public static final int Wk;
    public static final int Wl;
    public static int X;
    public static jb0 X0;
    public static Paint X1;
    public static TextPaint X2;
    public static Drawable X3;
    public static Drawable X4;
    public static final int X5;
    public static final int X6;
    public static final int X7;
    public static final int X8;
    public static final int X9;
    public static final int Xa;
    public static final int Xb;
    public static final int Xc;
    public static final int Xd;
    public static final int Xe;
    public static final int Xf;
    public static final int Xg;
    public static final int Xh;
    public static final int Xi;
    public static final int Xj;
    public static final int Xk;
    public static final int Xl;
    public static Bitmap Y;
    public static Drawable Y0;
    public static Paint Y1;
    public static TextPaint Y2;
    public static Drawable Y3;
    public static Drawable Y4;
    public static final int Y5;
    public static final int Y6;
    public static final int Y7;
    public static final int Y8;
    public static final int Y9;
    public static final int Ya;
    public static final int Yb;
    public static final int Yc;
    public static final int Yd;
    public static final int Ye;
    public static final int Yf;
    public static final int Yg;
    public static final int Yh;
    public static final int Yi;
    public static final int Yj;
    public static final int Yk;
    public static final int Yl;
    public static BitmapShader Z;
    public static Drawable Z0;
    public static Paint Z1;
    public static TextPaint Z2;
    public static Drawable Z3;
    public static final int Z5;
    public static final int Z6;
    public static final int Z7;
    public static final int Z8;
    public static final int Z9;
    public static final int Za;
    public static final int Zb;
    public static final int Zc;
    public static final int Zd;
    public static final int Ze;
    public static final int Zf;
    public static final int Zg;
    public static final int Zh;
    public static final int Zi;
    public static final int Zj;
    public static final int Zk;
    public static final int Zl;
    public static Matrix f29317a0;
    public static Drawable f29318a1;
    public static Paint f29319a2;
    public static TextPaint f29320a3;
    public static Drawable f29321a4;
    public static final int f29323a6;
    public static final int f29324a7;
    public static final int f29325a8;
    public static final int f29326a9;
    public static final int f29327aa;
    public static final int f29328ab;
    public static final int f29329ac;
    public static final int f29330ad;
    public static final int f29331ae;
    public static final int f29332af;
    public static final int f29333ag;
    public static final int f29334ah;
    public static final int f29335ai;
    public static final int f29336aj;
    public static final int ak;
    public static final int al;
    public static final int am;
    public static boolean f29337b;
    public static int f29338b0;
    public static Drawable f29339b1;
    public static Paint f29340b2;
    public static TextPaint f29341b3;
    public static Drawable f29342b4;
    public static Drawable f29343b5;
    public static final int f29344b6;
    public static final int f29345b7;
    public static final int f29346b8;
    public static final int f29347b9;
    public static final int f29348ba;
    public static final int f29349bb;
    public static final int f29350bc;
    public static final int bd;
    public static final int f29351be;
    public static final int f29352bf;
    public static final int f29353bg;
    public static final int f29354bh;
    public static final int f29355bi;
    public static final int bj;
    public static final int bk;
    public static final int bl;
    public static final int bm;
    public static int f29357c0;
    public static Drawable f29358c1;
    public static Paint f29359c2;
    public static TextPaint f29360c3;
    public static Drawable f29361c4;
    public static Drawable f29362c5;
    public static final int f29363c6;
    public static final int f29364c7;
    public static final int f29365c8;
    public static final int f29366c9;
    public static final int f29367ca;
    public static final int f29368cb;
    public static final int f29369cc;
    public static final int f29370cd;
    public static final int f29371ce;
    public static final int f29372cf;
    public static final int f29373cg;
    public static final int f29374ch;
    public static final int f29375ci;
    public static final int cj;
    public static final int ck;
    public static final int cl;
    public static final int cm;
    public static jg.t0 d;
    public static int f29376d0;
    public static Drawable f29377d1;
    public static Paint d2;
    public static TextPaint f29378d3;
    public static Drawable f29379d4;
    public static g8 f29380d5;
    public static final int f29381d6;
    public static final int f29382d7;
    public static final int f29383d8;
    public static final int f29384d9;
    public static final int f29385da;
    public static final int f29386db;
    public static final int dc;
    public static final int f29387dd;
    public static final int f29388de;
    public static final int f29389df;
    public static final int f29390dg;
    public static final int f29391dh;
    public static final int f29392di;
    public static final int dj;
    public static final int dk;
    public static final int dl;
    public static final HashMap dm;
    public static SensorManager f29393e;
    public static Drawable f29394e0;
    public static Drawable f29395e1;
    public static Paint f29396e2;
    public static TextPaint f29397e3;
    public static Drawable f29398e4;
    public static HashMap f29399e5;
    public static final int f29400e6;
    public static final int f29401e7;
    public static final int f29402e8;
    public static final int f29403e9;
    public static final int f29404ea;
    public static final int eb;
    public static final int f29405ec;
    public static final int f29406ed;
    public static final int f29407ee;
    public static final int f29408ef;
    public static final int f29409eg;
    public static final int f29410eh;
    public static final int f29411ei;
    public static final int ej;
    public static final int ek;
    public static final int el;
    public static final HashMap em;
    public static Sensor f29412f;
    public static Drawable f29413f0;
    public static Drawable f29414f1;
    public static Paint f29415f2;
    public static TextPaint f29416f3;
    public static Drawable f29417f4;
    public static final int f29418f5;
    public static final int f29419f6;
    public static final int f29420f7;
    public static final int f29421f8;
    public static final int f29422f9;
    public static final int fa;
    public static final int f29423fb;
    public static final int fc;
    public static final int f29424fd;
    public static final int fe;
    public static final int f29425ff;
    public static final int f29426fg;
    public static final int f29427fh;
    public static final int f29428fi;
    public static final int fj;
    public static final int fk;
    public static final int fl;
    public static final HashMap fm;
    public static boolean f29429g;
    public static int f29430g0;
    public static vk0 f29431g1;
    public static Paint f29432g2;
    public static TextPaint f29433g3;
    public static Drawable f29434g4;
    public static final int f29435g5;
    public static final int f29436g6;
    public static final int f29437g7;
    public static final int f29438g8;
    public static final int f29439g9;
    public static final int f29440ga;
    public static final int f29441gb;
    public static final int f29442gc;
    public static final int f29443gd;
    public static final int f29444ge;
    public static final int f29445gf;
    public static final int f29446gg;
    public static final int f29447gh;
    public static final int f29448gi;
    public static final int gj;
    public static final int gk;
    public static final int gl;
    public static final HashMap gm;
    public static String f29449h0;
    public static vk0 f29450h1;
    public static Paint f29451h2;
    public static Drawable f29452h3;
    public static Drawable f29453h4;
    public static final int f29454h5;
    public static final int f29455h6;
    public static final int h7;
    public static final int f29456h8;
    public static final int f29457h9;
    public static final int f29458ha;
    public static final int f29459hb;
    public static final int f29460hc;
    public static final int f29461hd;
    public static final int f29462he;
    public static final int f29463hf;
    public static final int hg;
    public static final int f29464hh;
    public static final int f29465hi;
    public static final int hj;
    public static final int hk;
    public static final int hl;
    public static final int[] hm;
    public static long f29466i;
    public static boolean f29467i0;
    public static Drawable f29468i1;
    public static Paint f29469i2;
    public static Drawable f29470i3;
    public static Drawable f29471i4;
    public static final int f29472i5;
    public static final int f29473i6;
    public static final int i7;
    public static final int f29474i8;
    public static final int f29475i9;
    public static final int f29476ia;
    public static final int f29477ib;
    public static final int f29478ic;
    public static final int f29479id;
    public static final int f29480ie;
    public static final int f29481ig;
    public static final int f29482ih;
    public static final int f29483ii;
    public static final int ij;
    public static final int ik;
    public static final int il;
    public static final SparseIntArray im;
    public static boolean f29484j;
    public static boolean f29485j0;
    public static Drawable f29486j1;
    public static Paint f29487j2;
    public static Drawable j3;
    public static Drawable f29488j4;
    public static final int f29489j5;
    public static final int f29490j6;
    public static final int f29491j7;
    public static final int f29492j8;
    public static final int f29493j9;
    public static final int f29494ja;
    public static final int f29495jb;
    public static final int f29496jc;
    public static final int f29497jd;
    public static final int f29498je;
    public static final int f29499jf;
    public static final int f29500jg;
    public static final int f29501jh;
    public static final int f29502ji;
    public static final int jj;
    public static final int jk;
    public static final int jl;
    public static final HashSet jm;
    public static boolean f29503k;
    public static Paint f29504k0;
    public static Drawable f29505k1;
    public static Paint f29506k2;
    public static hi.k3 f29507k3;
    public static Drawable f29508k4;
    public static final int f29509k5;
    public static final int f29510k6;
    public static final int f29511k7;
    public static final int f29512k8;
    public static final int f29513k9;
    public static final int f29514ka;
    public static final int kb;
    public static final int f29515kc;
    public static final int f29516kd;
    public static final int f29517ke;
    public static final int f29518kf;
    public static final int f29519kg;
    public static final int f29520kh;
    public static final int f29521ki;
    public static final int kj;
    public static final int kk;
    public static final int kl;
    public static SparseIntArray km;
    public static Paint f29523l0;
    public static Drawable l1;
    public static Paint f29524l2;
    public static Drawable f29525l3;
    public static Drawable f29526l4;
    public static final int f29527l5;
    public static final int f29528l6;
    public static final int f29529l7;
    public static final int f29530l8;
    public static final int f29531l9;
    public static final int f29532la;
    public static final int f29533lb;
    public static final int f29534lc;
    public static final int f29535ld;
    public static final int le;
    public static final int f29536lf;
    public static final int f29537lg;
    public static final int f29538lh;
    public static final int f29539li;
    public static final int lj;
    public static final int lk;
    public static final int ll;
    public static SparseIntArray lm;
    public static Paint m0;
    public static Drawable f29541m1;
    public static Paint f29542m2;
    public static u4 f29543m3;
    public static Drawable f29544m4;
    public static final int f29545m5;
    public static final int f29546m6;
    public static final int f29547m7;
    public static final int f29548m8;
    public static final int f29549m9;
    public static final int ma;
    public static final int mb;
    public static final int f29550mc;
    public static final int f29551md;
    public static final int f29552me;
    public static final int f29553mf;
    public static final int f29554mg;
    public static final int f29555mh;
    public static final int f29556mi;
    public static final int mj;
    public static final int mk;
    public static final int ml;
    public static SparseIntArray mm;
    public static Paint f29558n0;
    public static Drawable n1;
    public static Paint f29559n2;
    public static u4 f29560n3;
    public static Drawable f29561n4;
    public static final int f29562n5;
    public static final int f29563n6;
    public static final int f29564n7;
    public static final int f29565n8;
    public static final int f29566n9;
    public static final int f29567na;
    public static final int f29568nb;
    public static final int f29569nc;
    public static final int f29570nd;
    public static final int ne;
    public static final int f29571nf;
    public static final int f29572ng;
    public static final int f29573nh;
    public static final int f29574ni;
    public static final int nj;
    public static final int nk;
    public static final int nl;
    public static boolean nm;
    public static int f29575o;
    public static Paint f29576o0;
    public static Drawable f29577o1;
    public static TextPaint f29578o2;
    public static u4 f29579o3;
    public static Drawable o4;
    public static final int f29580o5;
    public static final int f29581o6;
    public static final int f29582o7;
    public static final int f29583o8;
    public static final int f29584o9;
    public static final int f29585oa;
    public static final int f29586ob;
    public static final int f29587oc;
    public static final int f29588od;
    public static final int f29589oe;
    public static final int f29590of;
    public static final int f29591og;
    public static final int f29592oh;
    public static final int f29593oi;
    public static final int oj;
    public static final int ok;
    public static final int ol;
    public static final ThreadLocal om;
    public static boolean f29594p;
    public static Paint f29595p0;
    public static Drawable f29596p1;
    public static TextPaint f29597p2;
    public static u4 f29598p3;
    public static Drawable f29599p4;
    public static final int f29600p5;
    public static final int f29601p6;
    public static final int f29602p7;
    public static final int[] f29603p8;
    public static final int f29604p9;
    public static final int f29605pa;
    public static final int f29606pb;
    public static final int f29607pc;
    public static final int f29608pd;
    public static final int f29609pe;
    public static final int f29610pf;
    public static final int f29611pg;
    public static final int f29612ph;
    public static final int f29613pi;
    public static final int pj;
    public static final int pk;
    public static final int pl;
    public static final ThreadLocal pm;
    public static float f29614q;
    public static Paint f29615q0;
    public static Drawable f29616q1;
    public static TextPaint f29617q2;
    public static u4 f29618q3;
    public static Drawable f29619q4;
    public static final int f29620q5;
    public static final int f29621q6;
    public static final int f29622q7;
    public static final int[] f29623q8;
    public static final int f29624q9;
    public static final int f29625qa;
    public static final int f29626qb;
    public static final int f29627qc;
    public static final int f29628qd;
    public static final int f29629qe;
    public static final int qf;
    public static final int f29630qg;
    public static final int f29631qh;
    public static final int f29632qi;
    public static final int qj;
    public static final int qk;
    public static final int ql;
    public static final ThreadLocal qm;
    public static int f29633r;
    public static Drawable f29635r1;
    public static TextPaint f29636r2;
    public static u4 f29637r3;
    public static Drawable f29638r4;
    public static final int f29639r5;
    public static final int f29640r6;
    public static final int f29641r7;
    public static final int[] f29642r8;
    public static final int f29643r9;
    public static final int f29644ra;
    public static final int f29645rb;
    public static final int f29646rc;
    public static final int f29647rd;
    public static final int f29648re;
    public static final int f29649rf;
    public static final int f29650rg;
    public static final int f29651rh;
    public static final int f29652ri;
    public static final int rj;
    public static final int rk;
    public static final int rl;
    public static final ThreadLocal rm;
    public static int f29653s;
    public static Drawable f29654s0;
    public static Drawable f29655s1;
    public static TextPaint f29656s2;
    public static u4 f29657s3;
    public static Drawable f29658s4;
    public static final int s5;
    public static final int f29659s6;
    public static final int f29660s7;
    public static final int f29661s8;
    public static final int s9;
    public static final int f29662sa;
    public static final int f29663sb;
    public static final int f29664sc;
    public static final int f29665sd;
    public static final int f29666se;
    public static final int f29667sf;
    public static final int f29668sg;
    public static final int f29669sh;
    public static final int f29670si;
    public static final int sj;
    public static final int[] sk;
    public static final int sl;
    public static final ThreadLocal sm;
    public static int f29671t;
    public static Paint f29672t0;
    public static Drawable f29673t1;
    public static TextPaint f29674t2;
    public static u4 f29675t3;
    public static Drawable f29676t4;
    public static final int f29677t5;
    public static final int t6;
    public static final int f29678t7;
    public static final int f29679t8;
    public static final int f29680t9;
    public static final int f29681ta;
    public static final int f29682tb;
    public static final int f29683tc;
    public static final int f29684td;
    public static final int f29685te;
    public static final int f29686tf;
    public static final int f29687tg;
    public static final int f29688th;
    public static final int f29689ti;
    public static final int tj;
    public static final int tk;
    public static final int tl;
    public static b10 tm;
    public static int f29690u;
    public static Paint f29691u0;
    public static oh0 f29692u1;
    public static TextPaint f29693u2;
    public static Drawable f29695u4;
    public static final int f29696u5;
    public static final int f29697u6;
    public static final int f29698u7;
    public static final int f29699u8;
    public static final int f29700u9;
    public static final int f29701ua;
    public static final int f29702ub;
    public static final int f29703uc;
    public static final int f29704ud;
    public static final int f29705ue;
    public static final int f29706uf;
    public static final int f29707ug;
    public static final int f29708uh;
    public static final int f29709ui;
    public static final int uj;
    public static final int uk;
    public static final int ul;
    public static md0 um;
    public static int v;
    public static Paint f29710v0;
    public static oh0 f29711v1;
    public static TextPaint f29712v2;
    public static PorterDuffColorFilter f29713v3;
    public static Drawable f29714v4;
    public static final int f29715v5;
    public static final int f29716v6;
    public static final int f29717v7;
    public static final int f29718v8;
    public static final int f29719v9;
    public static final int f29720va;
    public static final int f29721vb;
    public static final int f29722vc;
    public static final int f29723vd;
    public static final int ve;
    public static final int f29724vf;
    public static final int f29725vg;
    public static final int f29726vh;
    public static final int f29727vi;
    public static final int vj;
    public static final int vk;
    public static final int vl;
    public static Method vm;
    public static String f29728w;
    public static Paint f29729w0;
    public static oh0 f29730w1;
    public static TextPaint f29731w2;
    public static PorterDuffColorFilter f29732w3;
    public static Drawable f29733w4;
    public static final int f29734w5;
    public static final int f29735w6;
    public static final int f29736w7;
    public static final int f29737w8;
    public static final int f29738w9;
    public static final int f29739wa;
    public static final int f29740wb;
    public static final int wc;
    public static final int f29741wd;
    public static final int f29742we;
    public static final int f29743wf;
    public static final int f29744wg;
    public static final int f29745wh;
    public static final int f29746wi;
    public static final int wj;
    public static final int wk;
    public static final int wl;
    public static int wm;
    public static double f29747x;
    public static Paint f29748x0;
    public static oh0 f29749x1;
    public static TextPaint f29750x2;
    public static xc0 f29751x3;
    public static Drawable f29752x4;
    public static final int f29753x5;
    public static final int f29754x6;
    public static final int f29755x7;
    public static final int f29756x8;
    public static final int f29757x9;
    public static final int f29758xa;
    public static final int f29759xb;
    public static final int xc;
    public static final int f29760xd;
    public static final int f29761xe;
    public static final int f29762xf;
    public static final int f29763xg;
    public static final int f29764xh;
    public static final int f29765xi;
    public static final int xj;
    public static final int xk;
    public static final int xl;
    public static float[] xm;
    public static double f29766y;
    public static Paint f29767y0;
    public static oh0 f29768y1;
    public static TextPaint[] f29769y2;
    public static Drawable f29770y3;
    public static Drawable f29771y4;
    public static final int f29772y5;
    public static final int f29773y6;
    public static final int f29774y7;
    public static final int f29775y8;
    public static final int f29776y9;
    public static final int ya;
    public static final int f29777yb;
    public static final int f29778yc;
    public static final int f29779yd;
    public static final int f29780ye;
    public static final int f29781yf;
    public static final int f29782yg;
    public static final int f29783yh;
    public static final int f29784yi;
    public static final int yj;
    public static final int yk;
    public static final int[] yl;
    public static final q5 ym;
    public static Paint f29786z0;
    public static oh0 f29787z1;
    public static TextPaint f29788z2;
    public static Drawable f29789z3;
    public static Drawable f29790z4;
    public static final int f29791z5;
    public static final int f29792z6;
    public static final int f29793z7;
    public static final int f29794z8;
    public static final int f29795z9;
    public static final int f29796za;
    public static final int f29797zb;
    public static final int f29798zc;
    public static final int f29799zd;
    public static final int f29800ze;
    public static final int f29801zf;
    public static final int f29802zg;
    public static final int f29803zh;
    public static final int f29804zi;
    public static final int zj;
    public static final int zk;
    public static final int zl;
    public static final int[] zm;
    public static final int f29316a = i0.a.o(-16777216, 27);
    public static final Object f29356c = new Object();
    public static float h = 1.0f;
    public static final androidx.emoji2.text.o f29522l = new androidx.emoji2.text.o(5);
    public static final androidx.emoji2.text.o f29540m = new androidx.emoji2.text.o(6);
    public static final int f29557n = 99;
    public static final Paint f29785z = new Paint(1);
    public static final boolean[] C = new boolean[4];
    public static final int[] D = new int[4];
    public static final long[] E = new long[4];
    public static final Drawable[] f29634r0 = new Drawable[25];
    public static final bv0[] f29694u3 = new bv0[6];
    public static final Drawable[] G4 = new Drawable[2];
    public static final Drawable[] H4 = new Drawable[2];
    public static final Drawable[] I4 = new Drawable[2];
    public static final Drawable[] J4 = new Drawable[2];
    public static final Drawable[] K4 = new Drawable[2];
    public static final Drawable[] L4 = new Drawable[2];
    public static final Drawable[] M4 = new Drawable[2];
    public static final Drawable[] N4 = new Drawable[2];
    public static final Drawable[] S4 = new Drawable[2];
    public static final Drawable[] T4 = new Drawable[2];
    public static final Drawable[][] U4 = (Drawable[][]) Array.newInstance(Drawable.class, 5, 2);
    public static final Path[] Z4 = new Path[2];
    public static final Path[] f29322a5 = new Path[3];

    static {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.m6.<clinit>():void");
    }

    public static int A(int i10, boolean z10, boolean z11) {
        float f10 = 0.14f;
        if (z10 && z11) {
            return r1(0.14f, -1);
        }
        float[] P02 = P0(3);
        Color.colorToHSV(i10, P02);
        if (z10) {
            P02[2] = Math.min(1.0f, P02[2] + 0.14f);
            if (z11) {
                P02[1] = Math.min(1.0f, P02[1] + 0.03f);
            }
        } else {
            float f11 = P02[2];
            if (!z11) {
                f10 = 0.12f;
            }
            P02[2] = Math.max(0.0f, f11 - f10);
            if (z11) {
                float f12 = P02[1];
                if (f12 > 0.02f) {
                    P02[1] = Math.min(1.0f, f12 + 0.04f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), P02);
    }

    public static g8 A0() {
        if (f29380d5 == null) {
            f29380d5 = new g8();
        }
        return f29380d5;
    }

    public static void A1(int i10, int i11, boolean z10) {
        int i12 = f29661s8;
        int i13 = f29324a7;
        int i14 = He;
        int i15 = Ge;
        int i16 = Fe;
        int i17 = Ee;
        if (i10 == i17 || i10 == i16 || i10 == i15 || i10 == i14 || i10 == f29381d6 || i10 == i13 || i10 == i12 || i10 == M8) {
            i11 |= -16777216;
        }
        if (z10) {
            lm.delete(i10);
        } else {
            lm.put(i10, i11);
        }
        if (i10 == f29779yd) {
            h(f29394e0);
        } else if (i10 != f29370cd && i10 != f29387dd) {
            if (i10 != i17 && i10 != i16 && i10 != i15 && i10 != i14 && i10 != Ie) {
                int i18 = ls.f25396u4;
                if (i10 == i12) {
                    ls.e().k(i18, new Object[0]);
                    return;
                } else if (i10 == i13 && Build.VERSION.SDK_INT >= 26) {
                    ls.e().k(i18, new Object[0]);
                    return;
                } else {
                    return;
                }
            }
            u1(true);
        } else {
            i();
        }
    }

    public static void B() {
        if (f29575o != 2) {
            if (f29503k) {
                f29503k = false;
                org.telegram.messenger.g0.r(f29540m);
            }
            if (f29484j) {
                f29484j = false;
                org.telegram.messenger.g0.r(f29522l);
            }
            if (f29429g) {
                h = 1.0f;
                f29393e.unregisterListener(ym, f29412f);
                f29429g = false;
                if (org.telegram.messenger.s2.f26730a) {
                    a8.b("light sensor unregistered");
                }
            }
        }
    }

    public static android.graphics.drawable.Drawable B0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.m6.B0():android.graphics.drawable.Drawable");
    }

    public static void B1(Drawable drawable, int i10, boolean z10) {
        Drawable drawable2;
        if (!(drawable instanceof oq)) {
            return;
        }
        if (z10) {
            drawable2 = ((oq) drawable).f38330b;
        } else {
            drawable2 = ((oq) drawable).f38329a;
        }
        if (drawable2 instanceof ColorDrawable) {
            ((ColorDrawable) drawable2).setColor(i10);
        } else {
            drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    public static int C(l6 l6Var, int i10, int i11) {
        int i12;
        if (i10 != 0 && (i12 = l6Var.Y) != 0 && i10 != i12 && (!l6Var.T || l6Var.Z != f29557n)) {
            float[] P02 = P0(3);
            float[] P03 = P0(4);
            Color.colorToHSV(l6Var.Y, P02);
            Color.colorToHSV(i10, P03);
            return E(P02, P03, i11, l6Var.q(), i11);
        }
        return i11;
    }

    public static String C0() {
        l6 l6Var = J;
        if (l6Var == null) {
            return "";
        }
        String n10 = l6Var.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            return n10.substring(0, n10.lastIndexOf(46));
        }
        return n10;
    }

    public static void C1(int i10, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof bv0) {
            ((bv0) drawable).b(i10);
        } else if (drawable instanceof jb0) {
            ((jb0) drawable).a(i10);
        } else if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i10);
        } else if (drawable instanceof vk0) {
            ((vk0) drawable).b(i10);
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    public static int D(boolean z10, int i10, int i11, int i12, int i13) {
        float[] P02 = P0(3);
        float[] P03 = P0(4);
        Color.colorToHSV(i10, P02);
        Color.colorToHSV(i11, P03);
        return E(P02, P03, i12, z10, i13);
    }

    public static l6 D0() {
        l6 l6Var = K;
        if (l6Var != null) {
            return l6Var;
        }
        return L;
    }

    public static void D1(int i10, Drawable drawable) {
        C1(x0(null, i10, false), drawable);
    }

    public static int E(float[] fArr, float[] fArr2, int i10, boolean z10, int i11) {
        int min;
        int min2;
        if (xm == null) {
            xm = new float[3];
        }
        float[] fArr3 = xm;
        Color.colorToHSV(i10, fArr3);
        int i12 = 0;
        float f10 = fArr3[0];
        float f11 = fArr[0];
        float f12 = f10 - f11;
        if (f12 <= 0.0f) {
            f12 = -f12;
        }
        float f13 = (f10 - f11) - 360.0f;
        if (f13 <= 0.0f) {
            f13 = -f13;
        }
        if (Math.min(f12, f13) > 30.0f) {
            return i11;
        }
        float min3 = Math.min((fArr3[1] * 1.5f) / fArr[1], 1.0f);
        fArr3[0] = (fArr3[0] + fArr2[0]) - fArr[0];
        fArr3[1] = (fArr3[1] * fArr2[1]) / fArr[1];
        fArr3[2] = (((min3 * fArr2[2]) / fArr[2]) + (1.0f - min3)) * fArr3[2];
        int HSVToColor = Color.HSVToColor(Color.alpha(i10), fArr3);
        float B10 = org.telegram.messenger.g0.B(i10);
        float B11 = org.telegram.messenger.g0.B(HSVToColor);
        if (z10) {
            if (B10 <= B11) {
                return HSVToColor;
            }
        } else if (B10 >= B11) {
            return HSVToColor;
        }
        float f14 = a8.p0.f(0.39999998f, B10, B11, 0.6f);
        int red = (int) (Color.red(HSVToColor) * f14);
        int green = (int) (Color.green(HSVToColor) * f14);
        int blue = (int) (Color.blue(HSVToColor) * f14);
        if (red < 0) {
            min = 0;
        } else {
            min = Math.min(red, 255);
        }
        if (green < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(green, 255);
        }
        if (blue >= 0) {
            i12 = Math.min(blue, 255);
        }
        return Color.argb(Color.alpha(HSVToColor), min, min2, i12);
    }

    public static int E0(int i10) {
        int indexOfKey = km.indexOfKey(i10);
        if (indexOfKey < 0) {
            return 0;
        }
        int valueAt = km.valueAt(indexOfKey);
        j6 k10 = I.k(false);
        if (k10 == null) {
            return 0;
        }
        float[] P02 = P0(1);
        float[] P03 = P0(2);
        Color.colorToHSV(I.Y, P02);
        Color.colorToHSV(k10.f29098c, P03);
        return E(P02, P03, valueAt, I.q(), valueAt);
    }

    public static void E1(Drawable drawable, int i10, boolean z10) {
        Drawable O02;
        if (drawable instanceof StateListDrawable) {
            try {
                if (z10) {
                    O02 = O0(0, drawable);
                } else {
                    O02 = O0(1, drawable);
                }
                if (O02 instanceof ShapeDrawable) {
                    ((ShapeDrawable) O02).getPaint().setColor(i10);
                } else {
                    O02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void F(boolean z10) {
        if (M == null && !N) {
            if (!z10 && T > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - U;
                U = elapsedRealtime;
                int i10 = (int) (T - j10);
                T = i10;
                if (i10 > 0) {
                    return;
                }
            }
            boolean z11 = false;
            if (z10) {
                if (f29503k) {
                    f29503k = false;
                    org.telegram.messenger.g0.r(f29540m);
                }
                if (f29484j) {
                    f29484j = false;
                    org.telegram.messenger.g0.r(f29522l);
                }
            }
            B();
            int s12 = s1();
            if (s12 != 0) {
                if (s12 == 2) {
                    z11 = true;
                }
                m(z11);
            }
            if (z10) {
                f29466i = 0L;
            }
        }
    }

    public static int F0(int i10) {
        int i11 = hm[i10];
        if (i11 == 0) {
            int i12 = im.get(i10, -1);
            if (i12 != -1) {
                return F0(i12);
            }
            if ((i10 < f29626qb || i10 >= f29759xb) && i10 != D9 && i10 != N9 && i10 != E9 && i10 != Ge && i10 != He) {
                return -65536;
            }
            return 0;
        }
        return i11;
    }

    public static void F1(org.telegram.ui.Cells.y yVar, float f10, float f11, float f12, float f13) {
        if (com.google.android.gms.internal.vision.e2.s(yVar)) {
            int numberOfLayers = yVar.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable = yVar.getDrawable(i10);
                if (drawable instanceof i6) {
                    i6 i6Var = (i6) drawable;
                    float[] fArr = i6Var.f29041b;
                    float L10 = org.telegram.messenger.g0.L(f10);
                    fArr[1] = L10;
                    fArr[0] = L10;
                    float L11 = org.telegram.messenger.g0.L(f11);
                    fArr[3] = L11;
                    fArr[2] = L11;
                    float L12 = org.telegram.messenger.g0.L(f12);
                    fArr[5] = L12;
                    fArr[4] = L12;
                    float L13 = org.telegram.messenger.g0.L(f13);
                    fArr[7] = L13;
                    fArr[6] = L13;
                    i6Var.f29042c = true;
                    i6Var.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static void G(boolean z10) {
        l6 l6Var;
        int i10;
        if (A == 0) {
            if (z10 || Math.abs((System.currentTimeMillis() / 1000) - B) >= 3600) {
                for (int i11 = 0; i11 < 2; i11++) {
                    if (i11 == 0) {
                        l6Var = K;
                    } else {
                        l6Var = J;
                    }
                    if (l6Var != null && k10.i(l6Var.F).p()) {
                        j6 k10 = l6Var.k(false);
                        TLRPC.TL_theme tL_theme = l6Var.G;
                        if (tL_theme != null) {
                            i10 = l6Var.F;
                        } else if (k10 != null && (tL_theme = k10.f29111r) != null) {
                            i10 = k10.f24968t0;
                        }
                        if (tL_theme.document != null) {
                            A++;
                            TL_account.getTheme gettheme = new TL_account.getTheme();
                            gettheme.document_id = tL_theme.document.f28440id;
                            gettheme.format = "android";
                            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                            tL_inputTheme.access_hash = tL_theme.access_hash;
                            tL_inputTheme.f28505id = tL_theme.f28573id;
                            gettheme.theme = tL_inputTheme;
                            ConnectionsManager.getInstance(i10).sendRequest(gettheme, new bi.q1(k10, l6Var, tL_theme, 15));
                        }
                    }
                }
            }
        }
    }

    public static b10 G0() {
        if (tm == null) {
            ?? obj = new Object();
            obj.f33693a = new a10[4];
            obj.f33701k = 1.0f;
            obj.f33702l = new ArrayList();
            obj.f33703m = new Paint(1);
            obj.f33704n = new Path();
            for (int i10 = 0; i10 < 4; i10++) {
                obj.f33693a[i10] = new a10(i10);
            }
            tm = obj;
        }
        return tm;
    }

    public static void G1(org.telegram.ui.Cells.y yVar, int i10, int i11) {
        if (com.google.android.gms.internal.vision.e2.s(yVar)) {
            int numberOfLayers = yVar.getNumberOfLayers();
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                Drawable drawable = yVar.getDrawable(i12);
                if (drawable instanceof i6) {
                    i6 i6Var = (i6) drawable;
                    float f10 = i10;
                    float f11 = i11;
                    float[] fArr = i6Var.f29041b;
                    float L10 = org.telegram.messenger.g0.L(f10);
                    fArr[3] = L10;
                    fArr[2] = L10;
                    fArr[1] = L10;
                    fArr[0] = L10;
                    float L11 = org.telegram.messenger.g0.L(f11);
                    fArr[7] = L11;
                    fArr[6] = L11;
                    fArr[5] = L11;
                    fArr[4] = L11;
                    i6Var.f29042c = true;
                    i6Var.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static void H(SparseIntArray sparseIntArray, l6 l6Var) {
        if (l6Var != null && l6Var.f29247k0 == -1) {
            int i10 = f29381d6;
            if (i0.a.h(i0.a.f(0.5f, I0(sparseIntArray, i10), I0(sparseIntArray, i10))) < 0.5d) {
                l6Var.f29247k0 = 1;
            } else {
                l6Var.f29247k0 = 0;
            }
        }
    }

    public static int H0(int i10) {
        return x0(null, i10, true);
    }

    public static boolean H1(Drawable drawable, int i10, boolean z10) {
        Drawable O02;
        boolean z11;
        boolean z12 = true;
        if (drawable instanceof StateListDrawable) {
            try {
                if (z10) {
                    Drawable O03 = O0(0, drawable);
                    if (O03 instanceof ShapeDrawable) {
                        if (((ShapeDrawable) O03).getPaint().getColor() == i10) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        try {
                            ((ShapeDrawable) O03).getPaint().setColor(i10);
                        } catch (Throwable unused) {
                            return z11;
                        }
                    } else {
                        O03.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        z11 = false;
                    }
                    O02 = O0(1, drawable);
                } else {
                    O02 = O0(2, drawable);
                    z11 = false;
                }
                if (O02 instanceof ShapeDrawable) {
                    if (((ShapeDrawable) O02).getPaint().getColor() == i10 && !z11) {
                        z12 = false;
                    }
                    try {
                        ((ShapeDrawable) O02).getPaint().setColor(i10);
                        return z12;
                    } catch (Throwable unused2) {
                        return z12;
                    }
                }
                O02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                return z11;
            } catch (Throwable unused3) {
                return false;
            }
        }
        if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            if (z10) {
                rippleDrawable.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}));
                return false;
            } else if (rippleDrawable.getNumberOfLayers() > 0) {
                Drawable drawable2 = rippleDrawable.getDrawable(0);
                if (drawable2 instanceof ShapeDrawable) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) drawable2;
                    if (shapeDrawable.getPaint().getColor() == i10) {
                        z12 = false;
                    }
                    shapeDrawable.getPaint().setColor(i10);
                    return z12;
                }
                drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
            }
        }
        return false;
    }

    public static r7 I(l6 l6Var, SparseIntArray sparseIntArray, String str, int i10, boolean z10) {
        boolean z11;
        File file;
        boolean z12;
        float f10;
        float f11;
        if (l6Var.T && l6Var.Z == f29557n) {
            z11 = true;
        } else {
            z11 = false;
        }
        j6 k10 = l6Var.k(false);
        if (k10 != null) {
            file = k10.e();
        } else {
            file = null;
        }
        if (k10 != null && k10.f29110q) {
            z12 = true;
        } else {
            z12 = false;
        }
        d6 d6Var = l6Var.f29246j0;
        if (d6Var != null) {
            f11 = d6Var.f28891k;
        } else if (k10 != null) {
            f11 = k10.f29109p;
        } else {
            f10 = l6Var.E;
            return J(l6Var, d6Var, sparseIntArray, file, str, km.get(f29435g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
        }
        f10 = f11 * 100.0f;
        return J(l6Var, d6Var, sparseIntArray, file, str, km.get(f29435g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
    }

    public static int I0(SparseIntArray sparseIntArray, int i10) {
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return hm[i10];
    }

    public static void I1(l6 l6Var, j6 j6Var, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        TLRPC.ThemeSettings themeSettings;
        String str;
        boolean z11;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z12;
        if (tL_theme != null) {
            if (tL_theme.settings.size() > 0) {
                themeSettings = tL_theme.settings.get(0);
            } else {
                themeSettings = null;
            }
            HashMap hashMap = H;
            if (themeSettings != null) {
                if (l6Var == null) {
                    String r02 = r0(themeSettings);
                    if (r02 != null && (l6Var = (l6) hashMap.get(r02)) != null) {
                        j6Var = (j6) l6Var.f29238d0.get(tL_theme.f28573id);
                    } else {
                        return;
                    }
                }
                if (j6Var != null) {
                    TLRPC.TL_theme tL_theme2 = j6Var.f29111r;
                    if (tL_theme2 != null) {
                        l6Var.f29238d0.remove(tL_theme2.f28573id);
                    }
                    j6Var.f29111r = tL_theme;
                    j6Var.f29113t = i10;
                    l6Var.f29238d0.put(tL_theme.f28573id, j6Var);
                    if (!l6.a(j6Var, themeSettings)) {
                        File e10 = j6Var.e();
                        if (e10 != null) {
                            e10.delete();
                        }
                        l6.i(j6Var, themeSettings);
                        l6 l6Var2 = I;
                        if (l6Var2 == l6Var && l6Var2.Z == j6Var.f29096a) {
                            t1(false, false);
                            l6 l6Var3 = I;
                            if (J == l6Var3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            K1(l6Var3, z12, -1, null);
                        }
                        g6.a(true);
                    }
                    TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                    if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.motion) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j6Var.f29110q = z11;
                    l6Var.U = false;
                } else {
                    return;
                }
            } else {
                if (l6Var != null) {
                    str = l6Var.m();
                    hashMap.remove(str);
                } else {
                    str = "remote" + tL_theme.f28573id;
                    l6Var = (l6) hashMap.get(str);
                }
                if (l6Var == null) {
                    return;
                }
                l6Var.G = tL_theme;
                l6Var.f29232a = tL_theme.title;
                File file = new File(l6Var.f29234b);
                File file2 = new File(org.telegram.messenger.t0.h(), p5.c.v(str, ".attheme"));
                if (!file.equals(file2)) {
                    try {
                        org.telegram.messenger.g0.E(file, file2);
                        l6Var.f29234b = file2.getAbsolutePath();
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
                if (z10) {
                    l6Var.H = false;
                    l6Var.f29244h0 = null;
                    l6Var.f29245i0 = null;
                    ls.f(l6Var.F).b(l6Var, ls.Y1);
                    ls.f(l6Var.F).b(l6Var, ls.Z1);
                    w7 G10 = w7.G(l6Var.F);
                    TLRPC.TL_theme tL_theme3 = l6Var.G;
                    G10.W(tL_theme3.document, tL_theme3, 1, 1);
                } else {
                    l6Var.U = false;
                }
                hashMap.put(l6Var.m(), l6Var);
            }
            y1(true, false);
        }
    }

    public static a8.r7 J(org.telegram.ui.ActionBar.l6 r23, org.telegram.ui.ActionBar.d6 r24, android.util.SparseIntArray r25, java.io.File r26, java.lang.String r27, int r28, int r29, int r30, boolean r31, boolean r32, boolean r33, boolean r34, org.telegram.tgnet.TLRPC.Document r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.m6.J(org.telegram.ui.ActionBar.l6, org.telegram.ui.ActionBar.d6, android.util.SparseIntArray, java.io.File, java.lang.String, int, int, int, boolean, boolean, boolean, boolean, org.telegram.tgnet.TLRPC$Document, boolean):a8.r7");
    }

    public static org.telegram.ui.Cells.y J0(int i10, int i11) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i11 & 16777215) | 419430400}), null, d0(i10, -1));
    }

    public static void J1(l6 l6Var) {
        Collections.sort(l6Var.f29237c0, new el(25));
    }

    public static void K(Context context, boolean z10) {
        float f10;
        float f11;
        float f12;
        TextPaint textPaint;
        float f13;
        Drawable[] drawableArr;
        P();
        if (!z10 && f29543m3 == null) {
            Resources resources = context.getResources();
            f29452h3 = resources.getDrawable(2131232798);
            f29525l3 = resources.getDrawable(2131231748).mutate();
            f29543m3 = new u4(0, false, false, null);
            f29560n3 = new u4(0, false, true, null);
            f29579o3 = new u4(0, true, false, null);
            f29598p3 = new u4(0, true, true, null);
            f29618q3 = new u4(1, false, false, null);
            f29637r3 = new u4(1, false, true, null);
            f29657s3 = new u4(1, true, false, null);
            f29675t3 = new u4(1, true, true, null);
            ?? obj = new Object();
            obj.f42038a = new Path();
            obj.f42039b = -1.0f;
            obj.f42043g = new ArrayList();
            obj.f42040c = 0.293f;
            obj.d = -26.0f;
            obj.f42041e = -28.0f;
            obj.f42042f = 1.0f;
            f29751x3 = obj;
            obj.a("M 34.141 16.042 C 37.384 17.921 40.886 20.001 44.211 21.965 C 46.139 23.104 49.285 24.729 49.586 25.917 C 50.289 28.687 48.484 30 46.274 30 L 6 30.021 C 3.79 30.021 2.075 30.023 2 26.021 L 2.009 3.417 C 2.009 0.417 5.326 -0.58 7.068 0.417 C 10.545 2.406 25.024 10.761 34.141 16.042 Z", 166.0f);
            f29751x3.a("M 37.843 17.769 C 41.143 19.508 44.131 21.164 47.429 23.117 C 48.542 23.775 49.623 24.561 49.761 25.993 C 50.074 28.708 48.557 30 46.347 30 L 6 30.012 C 3.79 30.012 2 28.222 2 26.012 L 2.009 4.609 C 2.009 1.626 5.276 0.664 7.074 1.541 C 10.608 3.309 28.488 12.842 37.843 17.769 Z", 200.0f);
            f29751x3.a("M 40.644 18.756 C 43.986 20.389 49.867 23.108 49.884 25.534 C 49.897 27.154 49.88 24.441 49.894 26.059 C 49.911 28.733 48.6 30 46.39 30 L 6 30.013 C 3.79 30.013 2 28.223 2 26.013 L 2.008 5.52 C 2.008 2.55 5.237 1.614 7.079 2.401 C 10.656 4 31.106 14.097 40.644 18.756 Z", 217.0f);
            f29751x3.a("M 43.782 19.218 C 47.117 20.675 50.075 21.538 50.041 24.796 C 50.022 26.606 50.038 24.309 50.039 26.104 C 50.038 28.736 48.663 30 46.453 30 L 6 29.986 C 3.79 29.986 2 28.196 2 25.986 L 2.008 6.491 C 2.008 3.535 5.196 2.627 7.085 3.316 C 10.708 4.731 33.992 14.944 43.782 19.218 Z", 234.0f);
            f29751x3.a("M 47.421 16.941 C 50.544 18.191 50.783 19.91 50.769 22.706 C 50.761 24.484 50.76 23.953 50.79 26.073 C 50.814 27.835 49.334 30 47.124 30 L 5 30.01 C 2.79 30.01 1 28.22 1 26.01 L 1.001 10.823 C 1.001 8.218 3.532 6.895 5.572 7.26 C 7.493 8.01 47.421 16.941 47.421 16.941 Z", 267.0f);
            f29751x3.a("M 47.641 17.125 C 50.641 18.207 51.09 19.935 51.078 22.653 C 51.07 24.191 51.062 21.23 51.088 23.063 C 51.109 24.886 49.587 27 47.377 27 L 5 27.009 C 2.79 27.009 1 25.219 1 23.009 L 0.983 11.459 C 0.983 8.908 3.414 7.522 5.476 7.838 C 7.138 8.486 47.641 17.125 47.641 17.125 Z", 300.0f);
            f29751x3.a("M 48 7 C 50.21 7 52 8.79 52 11 C 52 19 52 19 52 19 C 52 21.21 50.21 23 48 23 L 4 23 C 1.79 23 0 21.21 0 19 L 0 11 C 0 8.79 1.79 7 4 7 C 48 7 48 7 48 7 Z", 383.0f);
            f29770y3 = resources.getDrawable(2131232093).mutate();
            f29789z3 = resources.getDrawable(2131232093).mutate();
            A3 = resources.getDrawable(2131232093).mutate();
            B3 = resources.getDrawable(2131232093).mutate();
            F3 = resources.getDrawable(2131232093).mutate();
            H3 = resources.getDrawable(2131232093).mutate();
            C3 = resources.getDrawable(2131232179).mutate();
            D3 = resources.getDrawable(2131232179).mutate();
            G3 = resources.getDrawable(2131232180).mutate();
            I3 = resources.getDrawable(2131232180).mutate();
            E3 = new jb0();
            L3 = resources.getDrawable(2131231310).mutate();
            M3 = resources.getDrawable(2131232426).mutate();
            N3 = resources.getDrawable(2131232426).mutate();
            O3 = resources.getDrawable(2131232426).mutate();
            P3 = resources.getDrawable(2131232426).mutate();
            Q3 = resources.getDrawable(2131232334).mutate();
            R3 = resources.getDrawable(2131232334).mutate();
            S3 = resources.getDrawable(2131232334).mutate();
            T3 = resources.getDrawable(2131232334).mutate();
            U3 = resources.getDrawable(2131232298).mutate();
            V3 = resources.getDrawable(2131232298).mutate();
            W3 = resources.getDrawable(2131232298).mutate();
            X3 = resources.getDrawable(2131232298).mutate();
            Z3 = resources.getDrawable(2131232298).mutate();
            Y3 = resources.getDrawable(2131232298).mutate();
            f29321a4 = resources.getDrawable(2131232426).mutate();
            f29342b4 = resources.getDrawable(2131232334).mutate();
            J3 = resources.getDrawable(2131232426).mutate();
            K3 = resources.getDrawable(2131232334).mutate();
            f29361c4 = resources.getDrawable(2131232043).mutate();
            f29379d4 = resources.getDrawable(2131232043).mutate();
            f29398e4 = resources.getDrawable(2131232043).mutate();
            f29417f4 = resources.getDrawable(2131232043).mutate();
            f29434g4 = resources.getDrawable(2131232796);
            f29453h4 = resources.getDrawable(2131232192).mutate();
            f29471i4 = resources.getDrawable(2131232192).mutate();
            f29488j4 = resources.getDrawable(2131232438);
            f29508k4 = resources.getDrawable(2131231626).mutate();
            f29526l4 = resources.getDrawable(2131231310);
            Drawable mutate = resources.getDrawable(2131230992).mutate();
            Drawable[] drawableArr2 = G4;
            drawableArr2[0] = mutate;
            Drawable mutate2 = resources.getDrawable(2131230992).mutate();
            Drawable[] drawableArr3 = H4;
            drawableArr3[0] = mutate2;
            Drawable mutate3 = resources.getDrawable(2131230992).mutate();
            Drawable[] drawableArr4 = I4;
            drawableArr4[0] = mutate3;
            Drawable mutate4 = resources.getDrawable(2131230992).mutate();
            Drawable[] drawableArr5 = J4;
            drawableArr5[0] = mutate4;
            drawableArr2[1] = resources.getDrawable(2131230991).mutate();
            drawableArr3[1] = resources.getDrawable(2131230991).mutate();
            drawableArr4[1] = resources.getDrawable(2131230991).mutate();
            drawableArr5[1] = resources.getDrawable(2131230991).mutate();
            O4 = resources.getDrawable(2131230990).mutate();
            P4 = resources.getDrawable(2131230989).mutate();
            Q4 = resources.getDrawable(2131230989).mutate();
            int i10 = 0;
            while (true) {
                drawableArr = M4;
                if (i10 >= 2) {
                    break;
                }
                K4[i10] = resources.getDrawable(2131232564).mutate();
                L4[i10] = resources.getDrawable(2131232565).mutate();
                drawableArr[i10] = resources.getDrawable(2131232124).mutate();
                N4[i10] = resources.getDrawable(2131232319).mutate();
                i10++;
            }
            V4 = resources.getDrawable(2131231936).mutate();
            W4 = resources.getDrawable(2131231936).mutate();
            X4 = resources.getDrawable(2131231934).mutate();
            Y4 = resources.getDrawable(2131231934).mutate();
            f29544m4 = resources.getDrawable(2131230893);
            f29561n4 = resources.getDrawable(2131230898);
            o4 = resources.getDrawable(2131230897);
            f29714v4 = resources.getDrawable(2131230896);
            f29752x4 = resources.getDrawable(2131230895);
            f29733w4 = resources.getDrawable(2131230892);
            f29771y4 = resources.getDrawable(2131230899);
            f29790z4 = resources.getDrawable(2131230894);
            A4 = resources.getDrawable(2131232515);
            B4 = resources.getDrawable(2131232255);
            C4 = resources.getDrawable(2131232256);
            D4 = resources.getDrawable(2131232061);
            E4 = resources.getDrawable(2131231226);
            F4 = resources.getDrawable(2131231227);
            f29599p4 = resources.getDrawable(2131231237).mutate();
            R4 = resources.getDrawable(2131232453);
            f29619q4 = resources.getDrawable(2131231088).mutate();
            f29638r4 = resources.getDrawable(2131231087);
            f29658s4 = resources.getDrawable(2131232436).mutate();
            f29676t4 = resources.getDrawable(2131231750).mutate();
            f29695u4 = resources.getDrawable(2131231133);
            int L10 = org.telegram.messenger.g0.L(2.0f);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = Z4;
            pathArr[0] = path;
            f10 = 1.0f;
            path.moveTo(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(3.0f));
            pathArr[0].lineTo(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f));
            pathArr[0].lineTo(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f));
            pathArr[0].lineTo(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(20.0f));
            int i11 = L10 * 2;
            f11 = 14.0f;
            f12 = 3.0f;
            rectF.set(org.telegram.messenger.g0.L(21.0f) - i11, org.telegram.messenger.g0.L(19.0f) - L10, org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(19.0f) + L10);
            pathArr[0].arcTo(rectF, 0.0f, 90.0f, false);
            pathArr[0].lineTo(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(21.0f));
            rectF.set(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(19.0f) - L10, org.telegram.messenger.g0.L(5.0f) + i11, org.telegram.messenger.g0.L(19.0f) + L10);
            pathArr[0].arcTo(rectF, 90.0f, 90.0f, false);
            pathArr[0].lineTo(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(4.0f));
            rectF.set(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(5.0f) + i11, org.telegram.messenger.g0.L(3.0f) + i11);
            pathArr[0].arcTo(rectF, 180.0f, 90.0f, false);
            pathArr[0].close();
            Path path2 = new Path();
            pathArr[1] = path2;
            path2.moveTo(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(5.0f));
            pathArr[1].lineTo(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(10.0f));
            pathArr[1].lineTo(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f));
            pathArr[1].close();
            f29343b5 = resources.getDrawable(2131231108).mutate();
            f29362c5 = resources.getDrawable(2131232347).mutate();
            Drawable[][] drawableArr6 = U4;
            drawableArr6[0][0] = N(org.telegram.messenger.g0.L(44.0f), 2131232350);
            drawableArr6[0][1] = N(org.telegram.messenger.g0.L(44.0f), 2131232350);
            drawableArr6[1][0] = N(org.telegram.messenger.g0.L(44.0f), 2131232349);
            drawableArr6[1][1] = N(org.telegram.messenger.g0.L(44.0f), 2131232349);
            drawableArr6[2][0] = N(org.telegram.messenger.g0.L(44.0f), 2131232348);
            drawableArr6[2][1] = N(org.telegram.messenger.g0.L(44.0f), 2131232348);
            drawableArr6[3][0] = N(org.telegram.messenger.g0.L(44.0f), 2131232346);
            drawableArr6[3][1] = N(org.telegram.messenger.g0.L(44.0f), 2131232346);
            drawableArr6[4][0] = N(org.telegram.messenger.g0.L(44.0f), 2131232345);
            drawableArr6[4][1] = N(org.telegram.messenger.g0.L(44.0f), 2131232345);
            oq N10 = N(org.telegram.messenger.g0.L(44.0f), 2131232100);
            Drawable[] drawableArr7 = T4;
            drawableArr7[0] = N10;
            drawableArr7[1] = N(org.telegram.messenger.g0.L(44.0f), 2131232100);
            Drawable mutate5 = resources.getDrawable(2131232211).mutate();
            Drawable[] drawableArr8 = S4;
            drawableArr8[0] = mutate5;
            drawableArr8[1] = resources.getDrawable(2131232211).mutate();
            f29470i3 = i5.c.g(context, 2131231030);
            j3 = i5.c.g(context, 2131232730);
            hi.k3 k3Var = new hi.k3();
            Paint paint = new Paint(1);
            k3Var.f14868b = paint;
            paint.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, 1593835520);
            f29507k3 = k3Var;
            dm.clear();
            em.clear();
            Drawable drawable = f29752x4;
            int i12 = bd;
            d("drawableBotInline", drawable, i12);
            d("drawableBotWebView", f29771y4, i12);
            d("drawableBotLock", A4, i12);
            d("drawableBotLink", f29714v4, i12);
            d("drawable_botInvite", f29790z4, i12);
            d("drawableGoIcon", f29695u4, i12);
            d("drawableCommentSticker", C4, i12);
            d("drawableMsgError", f29488j4, f29760xd);
            d("drawableMsgIn", f29543m3, -1);
            d("drawableMsgInSelected", f29560n3, -1);
            d("drawableMsgInMedia", f29618q3, -1);
            d("drawableMsgInMediaSelected", f29637r3, -1);
            d("drawableMsgInInstant", f29453h4, f29704ud);
            d("drawableMsgOut", f29579o3, -1);
            d("drawableMsgOutSelected", f29598p3, -1);
            d("drawableMsgOutMedia", f29657s3, -1);
            d("drawableMsgOutMediaSelected", f29675t3, -1);
            Drawable drawable2 = drawableArr4[0];
            int i13 = Mb;
            d("drawableMsgOutCallAudio", drawable2, i13);
            Drawable drawable3 = drawableArr5[0];
            int i14 = Nb;
            d("drawableMsgOutCallAudioSelected", drawable3, i14);
            d("drawableMsgOutCallVideo", drawableArr4[1], i13);
            d("drawableMsgOutCallVideo", drawableArr5[1], i14);
            d("drawableMsgOutCheck", f29770y3, Ab);
            d("drawableMsgOutCheckSelected", f29789z3, Bb);
            Drawable drawable4 = A3;
            int i15 = Cb;
            d("drawableMsgOutCheckRead", drawable4, i15);
            Drawable drawable5 = B3;
            int i16 = Db;
            d("drawableMsgOutCheckReadSelected", drawable5, i16);
            d("drawableMsgOutHalfCheck", C3, i15);
            d("drawableMsgOutHalfCheckSelected", D3, i16);
            d("drawableMsgOutInstant", f29471i4, i13);
            d("drawableMsgOutMenu", f29398e4, Kb);
            d("drawableMsgOutMenuSelected", f29417f4, Lb);
            Drawable drawable6 = W3;
            int i17 = Ib;
            d("drawableMsgOutPinned", drawable6, i17);
            Drawable drawable7 = X3;
            int i18 = Jb;
            d("drawableMsgOutPinnedSelected", drawable7, i18);
            d("drawableMsgOutReplies", S3, i17);
            d("drawableMsgOutReplies", T3, i18);
            d("drawableMsgOutViews", O3, i17);
            d("drawableMsgOutViewsSelected", P3, i18);
            Drawable drawable8 = H3;
            int i19 = Zc;
            d("drawableMsgStickerCheck", drawable8, i19);
            d("drawableMsgStickerHalfCheck", I3, i19);
            d("drawableMsgStickerPinned", Y3, i19);
            d("drawableMsgStickerReplies", K3, i19);
            d("drawableMsgStickerViews", J3, i19);
            d("drawableReplyIcon", f29638r4, i12);
            d("drawableCloseIcon", f29658s4, i12);
            d("drawableMoreIcon", f29676t4, i12);
            d("drawableShareIcon", f29619q4, i12);
            d("drawableMuteIcon", f29508k4, f29424fd);
            d("drawableLockIcon", f29526l4, f29443gd);
            d("drawable_chat_pollHintDrawableOut", drawableArr[1], Ob);
            d("drawable_chat_pollHintDrawableIn", drawableArr[0], Bd);
            k(z10, false);
        } else {
            f10 = 1.0f;
            f11 = 14.0f;
            f12 = 3.0f;
        }
        if (!z10 && (textPaint = C2) != null) {
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
            D2.setTextSize(org.telegram.messenger.g0.L(12.0f));
            E2.setTextSize(org.telegram.messenger.g0.L(11.0f));
            G2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            H2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            I2.setTextSize(org.telegram.messenger.g0.L(13.0f));
            N2.setTextSize(org.telegram.messenger.g0.L(12.0f));
            F2.setTextSize(org.telegram.messenger.g0.L(12.0f));
            O2.setTextSize(org.telegram.messenger.g0.L(16.0f));
            P2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            Q2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            R2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            S2.setTextSize(org.telegram.messenger.g0.L(13.0f));
            J2.setTextSize(org.telegram.messenger.g0.L(12.0f));
            W2.setTextSize(org.telegram.messenger.g0.L(f13));
            Y2.setTextSize(org.telegram.messenger.g0.L(f13));
            Z2.setTextSize(org.telegram.messenger.g0.L(f13));
            float f14 = (((cz.W0 * 2) + 10) / f12) - f10;
            f29378d3.setTextSize(org.telegram.messenger.g0.L(f14));
            X2.setTextSize(org.telegram.messenger.g0.L(f13));
            U2.setTextSize(org.telegram.messenger.g0.L(f14));
            V2.setTextSize(org.telegram.messenger.g0.L(12.0f));
            T2.setTextSize(org.telegram.messenger.g0.L(12.0f));
            K2.setTextSize(org.telegram.messenger.g0.L(13.0f));
            L2.setTextSize(org.telegram.messenger.g0.L(13.0f));
            M2.setTextSize(org.telegram.messenger.g0.L(13.0f));
            X1.setStrokeWidth(org.telegram.messenger.g0.L(f10));
            Z1.setStrokeWidth(org.telegram.messenger.g0.L(1.1f));
            f29656s2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, cz.W0) - 2));
            f29674t2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, cz.W0) - 2));
            f29693u2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, cz.W0) - 3));
            f29712v2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, cz.W0)));
            f29416f3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            f29433g3.setTextSize(org.telegram.messenger.g0.L(13.0f));
            f29506k2.setStrokeWidth(org.telegram.messenger.g0.L(f12));
            f29524l2.setStrokeWidth(org.telegram.messenger.g0.L(2.33f));
            f29397e3.setTextSize(org.telegram.messenger.g0.L(f11));
            f29397e3.setTypeface(org.telegram.messenger.g0.o());
        }
    }

    public static String K0() {
        d6 d6Var = I.f29246j0;
        if (d6Var != null) {
            return d6Var.f28885c;
        }
        if (g1()) {
            return "t";
        }
        return "d";
    }

    public static void K1(l6 l6Var, boolean z10, int i10, View view) {
        int[] iArr = new int[2];
        if (view != null && view.isAttachedToWindow()) {
            view.getLocationInWindow(iArr);
            iArr[0] = (view.getMeasuredWidth() / 2) + iArr[0];
            iArr[1] = (view.getMeasuredHeight() / 2) + iArr[1];
        } else {
            iArr[0] = org.telegram.messenger.g0.f24046q.x / 2;
            iArr[1] = 0;
        }
        ls.e().k(ls.f25409w4, l6Var, Boolean.valueOf(z10), iArr, Integer.valueOf(i10), Boolean.TRUE, null);
    }

    public static ShapeDrawable L(int i10, int i11) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(i10);
        shapeDrawable.setIntrinsicHeight(i10);
        shapeDrawable.getPaint().setColor(i11);
        return shapeDrawable;
    }

    public static org.telegram.ui.Cells.y L0(int i10, int i11, h6 h6Var) {
        if (i11 >= 0) {
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), new ColorDrawable(w0(i11, h6Var)), new ColorDrawable(-1));
        }
        return h0(i10, 2, -1);
    }

    public static int L1(SparseIntArray sparseIntArray) {
        int i10 = f29721vb;
        int i11 = f29740wb;
        int i12 = f29645rb;
        int[] iArr = {i12, f29702ub, i10, i11};
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = iArr[i17];
            if (i18 == i12 || sparseIntArray.indexOfKey(i18) >= 0) {
                int i19 = sparseIntArray.get(i18, hm[i18]);
                int red = Color.red(i19) + i13;
                int green = Color.green(i19) + i15;
                i14++;
                i16 = Color.blue(i19) + i16;
                i15 = green;
                i13 = red;
            }
        }
        return Color.rgb(i13 / i14, i15 / i14, i16 / i14);
    }

    public static ShapeDrawable M(int i10, int i11, int i12) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(i10);
        shapeDrawable.setIntrinsicHeight(i10);
        shapeDrawable.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, i11, i12, Shader.TileMode.CLAMP));
        return shapeDrawable;
    }

    public static org.telegram.ui.Cells.y M0(h6 h6Var, boolean z10) {
        int w02 = w0(f29473i6, h6Var);
        if (z10) {
            return L0(w02, f29381d6, h6Var);
        }
        return h0(w02, 2, -1);
    }

    public static void M1(g2 g2Var) {
        String N02;
        if (f29575o != 0) {
            if (g2Var != null) {
                try {
                    lc b02 = lc.b0(g2Var);
                    if (f29575o == 3) {
                        N02 = hd.N0(2131753782, "AutoNightSystemModeOff");
                    } else {
                        N02 = hd.N0(2131753787, "AutoNightModeOff");
                    }
                    b02.J(2131623938, N02, hd.N0(2131745299, "Settings"), 5000, false, new ii.l(1, g2Var)).j();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
            f29575o = 0;
            w1();
            B();
        }
    }

    public static oq N(int i10, int i11) {
        Drawable drawable;
        if (i11 != 0) {
            drawable = i5.c.g(org.telegram.messenger.t0.f26931b, i11);
        } else {
            drawable = null;
        }
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(-1);
        oq oqVar = new oq(shapeDrawable, drawable);
        oqVar.h = i10;
        oqVar.f38334n = i10;
        return oqVar;
    }

    public static org.telegram.ui.Cells.y N0(boolean z10) {
        int x02 = x0(null, f29473i6, false);
        if (z10) {
            return L0(x02, f29381d6, null);
        }
        return h0(x02, 2, -1);
    }

    public static void N1(gj gjVar) {
        g8 g8Var = f29380d5;
        if (g8Var == null) {
            return;
        }
        if (g8Var.f35457i != null && gjVar != null) {
            if (f29399e5 == null) {
                f29399e5 = new HashMap();
            }
            f29399e5.put(gjVar, f29380d5);
            f29380d5.e(false, null);
            org.telegram.messenger.g0.h3(new oi.c2(gjVar, 16), 200L);
            f29380d5 = null;
            return;
        }
        g8Var.f35457i = null;
    }

    public static org.telegram.ui.Cells.y O(int i10, int i11, int i12) {
        f29785z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new p5(i11, i12));
    }

    public static Drawable O0(int i10, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29 && (drawable instanceof StateListDrawable)) {
            return ((StateListDrawable) drawable).getStateDrawable(i10);
        }
        if (vm == null) {
            try {
                vm = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
            } catch (Throwable unused) {
            }
        }
        Method method = vm;
        if (method != null) {
            try {
                return (Drawable) method.invoke(drawable, Integer.valueOf(i10));
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }

    public static void P() {
        Q();
        if (C2 == null) {
            C2 = new TextPaint(1);
            TextPaint textPaint = new TextPaint(1);
            D2 = textPaint;
            TextPaint d10 = o10.d(textPaint, 1);
            E2 = d10;
            TextPaint d11 = o10.d(d10, 1);
            G2 = d11;
            d11.setTypeface(org.telegram.messenger.g0.o());
            S1 = new Paint(1);
            Paint paint = new Paint(1);
            T1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = T1;
            Paint.Cap cap = Paint.Cap.ROUND;
            paint2.setStrokeCap(cap);
            TextPaint textPaint2 = new TextPaint(1);
            H2 = textPaint2;
            I2 = o10.d(textPaint2, 1);
            Paint paint3 = new Paint();
            U1 = paint3;
            paint3.setPathEffect(h80.c());
            Paint paint4 = new Paint();
            V1 = paint4;
            paint4.setPathEffect(h80.c());
            Paint paint5 = new Paint();
            W1 = paint5;
            paint5.setPathEffect(h80.c());
            Paint paint6 = new Paint(1);
            f29506k2 = paint6;
            paint6.setStrokeCap(cap);
            f29506k2.setStyle(style);
            f29506k2.setColor(-1610612737);
            Paint paint7 = new Paint(1);
            f29524l2 = paint7;
            paint7.setStrokeCap(cap);
            f29524l2.setStyle(style);
            N2 = new TextPaint(1);
            TextPaint textPaint3 = new TextPaint(1);
            F2 = textPaint3;
            textPaint3.setTypeface(Typeface.DEFAULT_BOLD);
            TextPaint textPaint4 = new TextPaint(1);
            O2 = textPaint4;
            P2 = o10.d(textPaint4, 1);
            TextPaint textPaint5 = new TextPaint(1);
            Q2 = textPaint5;
            TextPaint d12 = o10.d(textPaint5, 1);
            R2 = d12;
            S2 = o10.d(d12, 1);
            J2 = new TextPaint(1);
            TextPaint textPaint6 = new TextPaint(1);
            K2 = textPaint6;
            L2 = o10.d(textPaint6, 1);
            T2 = new TextPaint(1);
            U2 = new TextPaint(1);
            V2 = new TextPaint(1);
            TextPaint textPaint7 = new TextPaint(1);
            W2 = textPaint7;
            X2 = o10.d(textPaint7, 1);
            TextPaint textPaint8 = new TextPaint(1);
            Y2 = textPaint8;
            Z2 = o10.d(textPaint8, 1);
            TextPaint textPaint9 = new TextPaint(1);
            f29378d3 = textPaint9;
            f29360c3 = o10.d(textPaint9, 1);
            f29397e3 = new TextPaint(1);
            TextPaint textPaint10 = new TextPaint(1);
            M2 = textPaint10;
            textPaint10.setTypeface(org.telegram.messenger.g0.o());
            Paint paint8 = new Paint(1);
            X1 = paint8;
            paint8.setStyle(style);
            X1.setStrokeCap(cap);
            Y1 = new Paint(1);
            Paint paint9 = new Paint(1);
            Z1 = paint9;
            paint9.setStyle(style);
            Z1.setStrokeCap(cap);
            f29319a2 = new Paint(1);
            f29340b2 = new Paint(1);
            f29359c2 = new Paint(1);
            Paint paint10 = new Paint(1);
            d2 = paint10;
            paint10.setStyle(style);
            d2.setStrokeCap(cap);
            f29656s2 = new TextPaint(1);
            f29674t2 = new TextPaint(1);
            f29693u2 = new TextPaint(1);
            TextPaint d13 = o10.d(f29656s2, 1);
            f29712v2 = d13;
            d13.setTypeface(org.telegram.messenger.g0.o());
            Paint paint11 = new Paint(1);
            f29451h2 = paint11;
            paint11.setColor(352321536);
            f29469i2 = new Paint(1);
            TextPaint textPaint11 = new TextPaint(1);
            f29416f3 = textPaint11;
            f29433g3 = o10.d(textPaint11, 1);
            f29487j2 = new Paint();
            new Paint(1);
            f29542m2 = new Paint(1);
            f29559n2 = new Paint(1);
            f29396e2 = new Paint(1);
            f29415f2 = new Paint(7);
            f29432g2 = new Paint(7);
            e(f29779yd, f29396e2, "paintChatMessageBackgroundSelected");
            Paint paint12 = f29415f2;
            int i10 = f29370cd;
            e(i10, paint12, "paintChatActionBackground");
            e(i10, f29451h2, "paintChatActionBackgroundDarken");
            e(f29387dd, f29432g2, "paintChatActionBackgroundSelected");
            TextPaint textPaint12 = f29656s2;
            int i11 = Zc;
            e(i11, textPaint12, "paintChatActionText");
            e(i11, f29674t2, "paintChatActionText2");
            e(i11, f29693u2, "paintChatActionText3");
            e(Ed, Q2, "paintChatBotButton");
            e(Je, f29487j2, "paintChatComposeBackground");
            e(f29570nd, f29469i2, "paintChatTimeBackground");
        }
    }

    public static float[] P0(int i10) {
        ThreadLocal threadLocal;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        threadLocal = sm;
                    } else {
                        threadLocal = rm;
                    }
                } else {
                    threadLocal = qm;
                }
            } else {
                threadLocal = pm;
            }
        } else {
            threadLocal = om;
        }
        float[] fArr = (float[]) threadLocal.get();
        if (fArr == null) {
            float[] fArr2 = new float[3];
            threadLocal.set(fArr2);
            return fArr2;
        }
        return fArr;
    }

    public static void Q() {
        synchronized (f29356c) {
            try {
                if (f29578o2 == null) {
                    f29578o2 = new TextPaint(1);
                    f29750x2 = new TextPaint(1);
                    f29769y2 = new TextPaint[6];
                    f29788z2 = new TextPaint(1);
                    A2 = new TextPaint(1);
                    B2 = new TextPaint(1);
                    TextPaint textPaint = new TextPaint(1);
                    f29731w2 = textPaint;
                    textPaint.setTypeface(org.telegram.messenger.g0.o());
                    TextPaint textPaint2 = new TextPaint(1);
                    W2 = textPaint2;
                    textPaint2.setTypeface(org.telegram.messenger.g0.o());
                    TextPaint textPaint3 = new TextPaint(1);
                    Y2 = textPaint3;
                    textPaint3.setTypeface(org.telegram.messenger.g0.o());
                    Z2 = new TextPaint(1);
                    f29320a3 = new TextPaint(1);
                    f29341b3 = new TextPaint(1);
                    f29360c3 = new TextPaint(1);
                    TextPaint textPaint4 = new TextPaint(1);
                    f29378d3 = textPaint4;
                    textPaint4.setTypeface(org.telegram.messenger.g0.o());
                    X2 = new TextPaint(1);
                    U2 = new TextPaint(1);
                    T2 = new TextPaint(1);
                    TextPaint textPaint5 = new TextPaint(1);
                    f29597p2 = textPaint5;
                    Typeface typeface = Typeface.MONOSPACE;
                    textPaint5.setTypeface(typeface);
                    TextPaint textPaint6 = new TextPaint(1);
                    f29617q2 = textPaint6;
                    textPaint6.setTypeface(typeface);
                    TextPaint textPaint7 = new TextPaint(1);
                    f29636r2 = textPaint7;
                    textPaint7.setTypeface(typeface);
                    new TextPaint(1);
                    V2 = new TextPaint(1);
                }
                float[] fArr = {0.68f, 0.46f, 0.34f, 0.28f, 0.22f, 0.19f};
                int i10 = 0;
                while (true) {
                    TextPaint[] textPaintArr = f29769y2;
                    if (i10 < textPaintArr.length) {
                        textPaintArr[i10] = new TextPaint(1);
                        f29769y2[i10].setTextSize(org.telegram.messenger.g0.L(fArr[i10] * 120.0f));
                        i10++;
                    } else {
                        f29788z2.setTextSize(org.telegram.messenger.g0.L(46.0f));
                        A2.setTextSize(org.telegram.messenger.g0.L(38.0f));
                        B2.setTextSize(org.telegram.messenger.g0.L(30.0f));
                        f29578o2.setTextSize(org.telegram.messenger.g0.L(cz.W0));
                        f29750x2.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        f29731w2.setTextSize(org.telegram.messenger.g0.L(15.0f));
                        float f10 = ((cz.W0 * 2) + 10) / 3.0f;
                        W2.setTextSize(org.telegram.messenger.g0.L(f10));
                        Y2.setTextSize(org.telegram.messenger.g0.L(f10));
                        Z2.setTextSize(org.telegram.messenger.g0.L(f10));
                        float f11 = f10 - 1.0f;
                        f29320a3.setTextSize(org.telegram.messenger.g0.L(f11));
                        f29341b3.setTextSize(org.telegram.messenger.g0.L(f10));
                        V2.setTextSize(org.telegram.messenger.g0.L(12.0f));
                        f29378d3.setTextSize(org.telegram.messenger.g0.L(f11));
                        f29360c3.setTextSize(org.telegram.messenger.g0.L(f10 - 2.0f));
                        X2.setTextSize(org.telegram.messenger.g0.L(f10));
                        U2.setTextSize(org.telegram.messenger.g0.L(f11));
                        f29597p2.setTextSize(org.telegram.messenger.g0.L(Math.max(Math.min(10, cz.W0 - 1), cz.W0 - 2)));
                        f29617q2.setTextSize(org.telegram.messenger.g0.L(Math.max(Math.min(10, cz.W0 - 2), cz.W0 - 3)));
                        f29636r2.setTextSize(org.telegram.messenger.g0.L(Math.max(Math.min(10, cz.W0 - 2), cz.W0 - 5)));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static l6 Q0(String str) {
        return (l6) H.get(str);
    }

    public static void R(Context context) {
        if (f29504k0 == null) {
            Paint paint = new Paint();
            f29504k0 = paint;
            paint.setStrokeWidth(1.0f);
            Paint paint2 = new Paint();
            f29523l0 = paint2;
            paint2.setStrokeWidth(1.0f);
            f29615q0 = new Paint(1);
            Paint paint3 = new Paint(1);
            f29576o0 = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            f29576o0.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            f29576o0.setStrokeCap(Paint.Cap.ROUND);
            Paint paint4 = new Paint(1);
            f29558n0 = paint4;
            paint4.setColor(0);
            f29558n0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            f29595p0 = new Paint(1);
            Paint paint5 = new Paint();
            m0 = paint5;
            paint5.setPathEffect(h80.c());
            Resources resources = context.getResources();
            Drawable drawable = resources.getDrawable(2131231000);
            Drawable[] drawableArr = f29634r0;
            drawableArr[0] = drawable;
            drawableArr[1] = resources.getDrawable(2131231214);
            drawableArr[2] = resources.getDrawable(2131232164);
            drawableArr[3] = resources.getDrawable(2131232166);
            drawableArr[4] = resources.getDrawable(2131232162);
            drawableArr[5] = resources.getDrawable(2131232161);
            drawableArr[6] = resources.getDrawable(2131232160);
            drawableArr[7] = resources.getDrawable(2131232163);
            drawableArr[8] = resources.getDrawable(2131232165);
            drawableArr[9] = resources.getDrawable(2131232159);
            drawableArr[10] = resources.getDrawable(2131232164);
            drawableArr[11] = resources.getDrawable(2131230999);
            drawableArr[12] = resources.getDrawable(2131232474);
            drawableArr[13] = resources.getDrawable(2131232388);
            drawableArr[14] = resources.getDrawable(2131231116);
            drawableArr[15] = resources.getDrawable(2131231181);
            drawableArr[16] = resources.getDrawable(2131231179);
            drawableArr[17] = resources.getDrawable(2131231616);
            drawableArr[18] = resources.getDrawable(2131231609);
            drawableArr[19] = resources.getDrawable(2131231614);
            drawableArr[20] = resources.getDrawable(2131231110);
            drawableArr[21] = resources.getDrawable(2131231109);
            drawableArr[22] = resources.getDrawable(2131231123);
            drawableArr[23] = resources.getDrawable(2131231124);
            drawableArr[24] = resources.getDrawable(2131231176);
            oh0 oh0Var = f29692u1;
            if (oh0Var != null) {
                oh0Var.setCallback(null);
                f29692u1.C(false);
            }
            oh0 oh0Var2 = f29711v1;
            if (oh0Var2 != null) {
                oh0Var2.C(false);
            }
            oh0 oh0Var3 = f29730w1;
            if (oh0Var3 != null) {
                oh0Var3.C(false);
            }
            oh0 oh0Var4 = f29749x1;
            if (oh0Var4 != null) {
                oh0Var4.C(false);
            }
            oh0 oh0Var5 = f29768y1;
            if (oh0Var5 != null) {
                oh0Var5.C(false);
            }
            oh0 oh0Var6 = f29787z1;
            if (oh0Var6 != null) {
                oh0Var6.C(false);
            }
            f29692u1 = new oh0(2131623979, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            f29711v1 = new oh0(2131623978, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            f29730w1 = new oh0(2131623984, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            f29749x1 = new oh0(2131623981, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            f29768y1 = new oh0(2131623985, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            f29787z1 = new oh0(2131623974, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), false, null);
            H1 = new oh0(2131624246, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            I1 = new oh0(2131624249, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            L1 = new oh0(2131624248, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            M1 = new oh0(2131624251, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            J1 = new oh0(2131624244, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            O1 = new oh0(2131624250, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            N1 = new oh0(2131624247, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), false, null);
            K1 = new oh0(2131624243, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
            l();
        }
    }

    public static Drawable R0(String str) {
        return (Drawable) dm.get(str);
    }

    public static cb0 S(int i10, int i11) {
        boolean z10;
        int max;
        int i12;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cb0 cb0Var = new cb0(z10, -2368069, -9722489, -2762611, -7817084);
        if (i10 > 0 && i11 > 0) {
            i12 = i10;
            max = i11;
        } else {
            Point point = org.telegram.messenger.g0.f24046q;
            int min = Math.min(point.x, point.y);
            max = Math.max(point.x, point.y);
            i12 = min;
        }
        cb0Var.s(34, nz.c(1.0f, 2131623998, i12, max, -16777216, 2));
        cb0Var.t(cb0Var.f());
        return cb0Var;
    }

    public static Drawable S0(String str, h6 h6Var) {
        Drawable drawable;
        if (h6Var != null) {
            drawable = h6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return (Drawable) dm.get(str);
    }

    public static void T(Context context) {
        R(context);
        if (L0 == null) {
            TextPaint textPaint = new TextPaint(1);
            L0 = textPaint;
            TextPaint d10 = o10.d(textPaint, 1);
            M0 = d10;
            d10.setTypeface(org.telegram.messenger.g0.o());
            f29729w0 = new Paint(1);
            f29672t0 = new Paint(1);
            A0 = new Paint(1);
        }
        L0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        M0.setTextSize(org.telegram.messenger.g0.L(13.0f));
        if (B0 == null) {
            Resources resources = context.getResources();
            B0 = new TextPaint[2];
            C0 = new TextPaint[2];
            F0 = new TextPaint[2];
            H0 = new TextPaint[2];
            for (int i10 = 0; i10 < 2; i10++) {
                B0[i10] = new TextPaint(1);
                B0[i10].setTypeface(org.telegram.messenger.g0.o());
                C0[i10] = new TextPaint(1);
                C0[i10].setTypeface(org.telegram.messenger.g0.o());
                F0[i10] = new TextPaint(1);
                H0[i10] = new TextPaint(1);
            }
            TextPaint textPaint2 = new TextPaint(1);
            D0 = textPaint2;
            TextPaint d11 = o10.d(textPaint2, 1);
            E0 = d11;
            TextPaint d12 = o10.d(d11, 1);
            G0 = d12;
            I0 = o10.d(d12, 1);
            J0 = new TextPaint(1);
            K0 = new TextPaint(1);
            TextPaint textPaint3 = new TextPaint(1);
            N0 = textPaint3;
            TextPaint d13 = o10.d(textPaint3, 1);
            O0 = d13;
            P0 = o10.d(d13, 1);
            Q0 = new TextPaint(1);
            TextPaint textPaint4 = new TextPaint(1);
            R0 = textPaint4;
            textPaint4.setTypeface(org.telegram.messenger.g0.o());
            f29691u0 = new Paint();
            f29710v0 = new Paint(1);
            f29767y0 = new Paint(1);
            f29748x0 = new Paint(1);
            f29786z0 = new Paint(1);
            f29318a1 = resources.getDrawable(2131231629);
            f29339b1 = resources.getDrawable(2131232244);
            T0 = resources.getDrawable(2131231623).mutate();
            S0 = resources.getDrawable(2131231028).mutate();
            U0 = resources.getDrawable(2131231985).mutate();
            V0 = resources.getDrawable(2131231623).mutate();
            W0 = resources.getDrawable(2131231625);
            X0 = new jb0();
            Y0 = resources.getDrawable(2131231632);
            Z0 = resources.getDrawable(2131231628).mutate();
            f29358c1 = resources.getDrawable(2131231626).mutate();
            f29377d1 = resources.getDrawable(2131231631).mutate();
            f29395e1 = resources.getDrawable(2131231944).mutate();
            f29414f1 = resources.getDrawable(2131232793).mutate();
            f29431g1 = new vk0(0);
            f29450h1 = new vk0(1);
            f29468i1 = resources.getDrawable(2131232794).mutate();
            f29541m1 = resources.getDrawable(2131231098).mutate();
            n1 = resources.getDrawable(2131231100).mutate();
            f29577o1 = resources.getDrawable(2131231099).mutate();
            f29596p1 = resources.getDrawable(2131231098).mutate();
            f29616q1 = resources.getDrawable(2131231100).mutate();
            f29635r1 = resources.getDrawable(2131231099).mutate();
            f29486j1 = resources.getDrawable(2131231627);
            f29505k1 = resources.getDrawable(2131232298).mutate();
            l1 = resources.getDrawable(2131232298).mutate();
            f29673t1 = resources.getDrawable(2131232243);
            f29654s0 = resources.getDrawable(2131232576);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = f29322a5;
            pathArr[0] = path;
            pathArr[2] = new Path();
            float L10 = org.telegram.messenger.g0.L(12.0f);
            float L11 = org.telegram.messenger.g0.L(12.0f);
            rectF.set(L10 - org.telegram.messenger.g0.L(5.0f), L11 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f) + L10, org.telegram.messenger.g0.L(5.0f) + L11);
            pathArr[2].arcTo(rectF, -160.0f, -110.0f, true);
            pathArr[2].arcTo(rectF, 20.0f, -110.0f, true);
            pathArr[0].moveTo(L10, org.telegram.messenger.g0.L(8.0f) + L11);
            pathArr[0].lineTo(L10, org.telegram.messenger.g0.L(2.0f) + L11);
            pathArr[0].lineTo(org.telegram.messenger.g0.L(3.0f) + L10, org.telegram.messenger.g0.L(5.0f) + L11);
            pathArr[0].close();
            pathArr[0].moveTo(L10, L11 - org.telegram.messenger.g0.L(8.0f));
            pathArr[0].lineTo(L10, L11 - org.telegram.messenger.g0.L(2.0f));
            pathArr[0].lineTo(L10 - org.telegram.messenger.g0.L(3.0f), L11 - org.telegram.messenger.g0.L(5.0f));
            pathArr[0].close();
            o();
        }
        G0.setTextSize(org.telegram.messenger.g0.L(14.0f));
        I0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        J0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        J0.setTypeface(org.telegram.messenger.g0.o());
        K0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        K0.setTypeface(org.telegram.messenger.g0.o());
        N0.setTextSize(org.telegram.messenger.g0.L(13.0f));
        O0.setTextSize(org.telegram.messenger.g0.L(11.0f));
        P0.setTextSize(org.telegram.messenger.g0.L(15.0f));
        Q0.setTextSize(org.telegram.messenger.g0.L(15.0f));
        R0.setTextSize(org.telegram.messenger.g0.L(10.0f));
        D0.setTextSize(org.telegram.messenger.g0.L(16.0f));
        E0.setTextSize(org.telegram.messenger.g0.L(16.0f));
    }

    public static SparseIntArray T0(File file, String str, String[] strArr) {
        boolean z10;
        File file2;
        FileInputStream fileInputStream;
        int intValue;
        SparseIntArray sparseIntArray = new SparseIntArray();
        FileInputStream fileInputStream2 = null;
        try {
            byte[] bArr = new byte[1024];
            if (str != null) {
                file2 = q0(str);
            } else {
                file2 = file;
            }
            fileInputStream = new FileInputStream(file2);
            int i10 = -1;
            int i11 = -1;
            int i12 = 0;
            boolean z11 = false;
            while (true) {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read == i10) {
                        break;
                    }
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = i12;
                    while (true) {
                        if (i13 >= read) {
                            break;
                        }
                        if (bArr[i13] == 10) {
                            int i16 = i13 - i14;
                            int i17 = i16 + 1;
                            String str2 = new String(bArr, i14, i16);
                            if (str2.startsWith("WLS=")) {
                                if (strArr != null && strArr.length > 0) {
                                    strArr[0] = str2.substring(4);
                                }
                            } else if (str2.startsWith("WPS")) {
                                i11 = i15 + i17;
                                z11 = true;
                                break;
                            } else {
                                int indexOf = str2.indexOf(61);
                                if (indexOf != i10) {
                                    String substring = str2.substring(0, indexOf);
                                    String substring2 = str2.substring(indexOf + 1);
                                    if (substring2.length() > 0 && substring2.charAt(0) == '#') {
                                        try {
                                            intValue = Color.parseColor(substring2);
                                        } catch (Exception unused) {
                                            intValue = Utilities.z(substring2).intValue();
                                        }
                                    } else {
                                        intValue = Utilities.z(substring2).intValue();
                                    }
                                    int h10 = v4.h(substring);
                                    if (h10 >= 0) {
                                        sparseIntArray.put(h10, intValue);
                                    }
                                }
                            }
                            i14 += i17;
                            i15 += i17;
                        }
                        i13++;
                        i10 = -1;
                    }
                    if (i12 == i15) {
                        break;
                    }
                    fileInputStream.getChannel().position(i15);
                    if (z11) {
                        break;
                    }
                    i12 = i15;
                    i10 = -1;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    z10 = true;
                    try {
                        a8.g(th, true);
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e10) {
                                e = e10;
                                a8.g(e, z10);
                                return sparseIntArray;
                            }
                        }
                        return sparseIntArray;
                    } catch (Throwable th3) {
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                        }
                        throw th3;
                    }
                }
            }
            sparseIntArray.put(f29435g5, i11);
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            fileInputStream.close();
        } catch (Exception e12) {
            e = e12;
            z10 = true;
            a8.g(e, z10);
            return sparseIntArray;
        }
        return sparseIntArray;
    }

    public static v5 U(Context context) {
        return V(context, x0(null, f29696u5, false), x0(null, f29715v5, false));
    }

    public static float U0(float f10) {
        if (f10 < 0.0f && !I.q()) {
            return -f10;
        }
        return f10;
    }

    public static v5 V(Context context, int i10, int i11) {
        Resources resources = context.getResources();
        Drawable mutate = resources.getDrawable(2131232685).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = resources.getDrawable(2131232686).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(i11, mode));
        ?? stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842910, 16842908}, mutate2);
        stateListDrawable.addState(new int[]{16842908}, mutate2);
        stateListDrawable.addState(StateSet.WILD_CARD, mutate);
        return stateListDrawable;
    }

    public static Paint V0(String str) {
        if (Objects.equals(str, "paintDivider")) {
            return f29504k0;
        }
        return (Paint) fm.get(str);
    }

    public static v5 W(Context context, int i10, int i11, int i12) {
        Resources resources = context.getResources();
        Drawable mutate = resources.getDrawable(i10).mutate();
        if (i11 != 0) {
            mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
        Drawable mutate2 = resources.getDrawable(i10).mutate();
        if (i12 != 0) {
            mutate2.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
        }
        ?? stateListDrawable = new StateListDrawable();
        stateListDrawable.setEnterFadeDuration(1);
        stateListDrawable.setExitFadeDuration(200);
        stateListDrawable.addState(new int[]{16842913}, mutate2);
        stateListDrawable.addState(new int[0], mutate);
        return stateListDrawable;
    }

    public static Paint W0(String str, h6 h6Var) {
        Paint g10;
        if (h6Var != null && (g10 = h6Var.g(str)) != null) {
            return g10;
        }
        return V0(str);
    }

    public static org.telegram.ui.Cells.y X(float f10, int i10, int i11) {
        return Y(f10, 285212671, i10, i11, i10, i11);
    }

    public static Drawable X0(Context context, int i10, int i11) {
        if (context == null) {
            return null;
        }
        Drawable g10 = i5.c.g(context, i10);
        g10.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        return g10;
    }

    public static org.telegram.ui.Cells.y Y(float f10, int i10, int i11, int i12, int i13, int i14) {
        f29785z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new y5(i11, i12, i13, i14, f10));
    }

    public static Drawable Y0(Context context, int i10, int i11) {
        return X0(context, i10, x0(null, i11, false));
    }

    public static void Z(Context context) {
        if (Q1 == null) {
            P1 = new TextPaint(1);
            Resources resources = context.getResources();
            Q1 = resources.getDrawable(2131232793).mutate();
            R1 = resources.getDrawable(2131232794).mutate();
            q();
        }
        P1.setTextSize(org.telegram.messenger.g0.L(16.0f));
    }

    public static Drawable Z0(View view, boolean z10) {
        int i10;
        cb0 cb0Var;
        File file;
        File file2;
        Throwable th2;
        FileInputStream fileInputStream;
        int i11;
        int i12;
        org.telegram.ui.Cells.c5 y10;
        File e10;
        int i13 = lm.get(Ee);
        u5 u5Var = null;
        if (i13 != 0) {
            int i14 = lm.get(Fe);
            int i15 = lm.get(Ge);
            int i16 = lm.get(He);
            int i17 = lm.get(Ie, -1);
            if (i17 == -1) {
                i17 = 45;
            }
            if (i14 == 0) {
                return new ColorDrawable(i13);
            }
            j6 k10 = I.k(false);
            if (k10 != null && !TextUtils.isEmpty(k10.f29108o) && M == null && (e10 = k10.e()) != null && e10.exists()) {
                file = e10;
            } else {
                file = null;
            }
            if (i15 != 0) {
                cb0Var = new cb0(true, i13, i14, i15, i16);
                if (file == null) {
                    return cb0Var;
                }
            } else if (file == null) {
                p9 p9Var = new p9(p9.d(i17), new int[]{i13, i14});
                if (!z10) {
                    y10 = org.telegram.ui.Cells.c5.y(0.5f, 3);
                } else {
                    y10 = org.telegram.ui.Cells.c5.y(0.125f, 1);
                }
                if (view != null) {
                    u5Var = new u5(view, z10);
                }
                p9Var.f(y10, u5Var, 0L);
                return p9Var;
            } else {
                cb0Var = null;
            }
            i10 = 0;
        } else {
            if (f29430g0 > 0) {
                l6 l6Var = I;
                if (l6Var.f29234b != null || l6Var.d != null) {
                    String str = l6Var.d;
                    if (str != null) {
                        file2 = q0(str);
                    } else {
                        file2 = new File(I.f29234b);
                    }
                    file = file2;
                    i10 = f29430g0;
                    cb0Var = null;
                }
            }
            i10 = 0;
            cb0Var = null;
            file = null;
        }
        try {
            if (file != null) {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.getChannel().position(i10);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        if (z10) {
                            options.inJustDecodeBounds = true;
                            float f10 = options.outWidth;
                            float f11 = options.outHeight;
                            int L10 = org.telegram.messenger.g0.L(100.0f);
                            i11 = 1;
                            while (true) {
                                float f12 = L10;
                                if (f10 <= f12 && f11 <= f12) {
                                    break;
                                }
                                i11 *= 2;
                                f10 /= 2.0f;
                                f11 /= 2.0f;
                            }
                        } else {
                            i11 = 1;
                        }
                        Bitmap.Config config = Bitmap.Config.ALPHA_8;
                        options.inPreferredConfig = config;
                        options.inJustDecodeBounds = false;
                        options.inSampleSize = i11;
                        Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                        if (cb0Var != null) {
                            j6 k11 = I.k(false);
                            if (k11 != null) {
                                i12 = (int) (k11.f29109p * 100.0f);
                            } else {
                                i12 = 100;
                            }
                            if (decodeStream != null && decodeStream.getConfig() != config) {
                                Bitmap copy = decodeStream.copy(config, false);
                                decodeStream.recycle();
                                decodeStream = copy;
                            }
                            cb0Var.s(i12, decodeStream);
                            cb0Var.t(cb0Var.f());
                            try {
                                fileInputStream.close();
                                return cb0Var;
                            } catch (Exception e11) {
                                a8.g(e11, true);
                                return cb0Var;
                            }
                        } else if (decodeStream != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(decodeStream);
                            try {
                                fileInputStream.close();
                                return bitmapDrawable;
                            } catch (Exception e12) {
                                a8.g(e12, true);
                                return bitmapDrawable;
                            }
                        } else {
                            fileInputStream.close();
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            a8.g(th2, true);
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return null;
                        } catch (Throwable th4) {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                            }
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    fileInputStream = null;
                }
            }
        } catch (Exception e14) {
            a8.g(e14, true);
        }
        return null;
    }

    public static boolean a(int i10, int i11) {
        float red = Color.red(i10) / 255.0f;
        float green = Color.green(i10) / 255.0f;
        float blue = Color.blue(i10) / 255.0f;
        float red2 = ((Color.red(i11) / 255.0f) * 0.5f) + (red * 0.5f);
        float green2 = (((Color.green(i11) / 255.0f) * 0.5f) + (green * 0.5f)) * 0.7152f;
        float blue2 = (((Color.blue(i11) / 255.0f) * 0.5f) + (blue * 0.5f)) * 0.0722f;
        float f10 = blue * 0.0722f;
        float f11 = f10 + (green * 0.7152f) + (red * 0.2126f);
        if (blue2 + green2 + (red2 * 0.2126f) <= 0.705f && f11 <= 0.705f) {
            return false;
        }
        return true;
    }

    public static org.telegram.ui.Cells.y a0(int i10, int i11, int i12) {
        f29785z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new i6(i11, i12));
    }

    public static int a1(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 | (-16777216);
    }

    public static int b(float f10, float f11, int i10) {
        float[] P02 = P0(5);
        Color.colorToHSV(i10, P02);
        float f12 = P02[1];
        if (f12 > 0.1f && f12 < 0.9f) {
            P02[1] = l9.a(f12 + f10, 0.0f, 1.0f);
        }
        P02[2] = l9.a(P02[2] + f11, 0.0f, 1.0f);
        return Color.HSVToColor(Color.alpha(i10), P02);
    }

    public static org.telegram.ui.Cells.y b0(int i10, int i11, int i12, int i13) {
        f29785z.setColor(-1);
        float f10 = i12;
        float f11 = i13;
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), e0(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f11), i10), new i6(f10, f11));
    }

    public static String b1(d6 d6Var) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (d6Var == null || TextUtils.isEmpty(d6Var.f28885c) || d6Var.f28885c.equals("d")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (d6Var.f28889i) {
            sb2.append("blur");
        }
        if (d6Var.f28890j) {
            if (sb2.length() > 0) {
                sb2.append("+");
            }
            sb2.append("motion");
        }
        int i10 = d6Var.d;
        if (i10 == 0) {
            str3 = "https://attheme.org?slug=" + d6Var.f28885c;
        } else {
            String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (d6Var.d >> 8)) & 255), Byte.valueOf((byte) (d6Var.d & 255))).toLowerCase();
            int i11 = d6Var.f28886e;
            if (i11 != 0) {
                str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (d6Var.f28886e >> 8)) & 255), Byte.valueOf((byte) (d6Var.f28886e & 255))).toLowerCase();
            } else {
                str = null;
            }
            int i12 = d6Var.f28887f;
            if (i12 != 0) {
                str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (d6Var.f28887f >> 8)) & 255), Byte.valueOf((byte) (d6Var.f28887f & 255))).toLowerCase();
            } else {
                str2 = null;
            }
            int i13 = d6Var.f28888g;
            if (i13 != 0) {
                str4 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (d6Var.f28888g >> 8)) & 255), Byte.valueOf((byte) (d6Var.f28888g & 255))).toLowerCase();
            }
            if (str != null && str2 != null) {
                if (str4 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(lowerCase);
                    sb3.append("~");
                    sb3.append(str);
                    sb3.append("~");
                    sb3.append(str2);
                    lowerCase = a8.p0.s(sb3, "~", str4);
                } else {
                    lowerCase = lowerCase + "~" + str + "~" + str2;
                }
            } else if (str != null) {
                StringBuilder n10 = p5.c.n(a8.p0.E(lowerCase, "-", str), "&rotation=");
                n10.append(d6Var.h);
                lowerCase = n10.toString();
            }
            str3 = "https://attheme.org?slug=" + d6Var.f28885c + "&intensity=" + ((int) (d6Var.f28891k * 100.0f)) + "&bg_color=" + lowerCase;
        }
        if (sb2.length() > 0) {
            StringBuilder n11 = p5.c.n(str3, "&mode=");
            n11.append(sb2.toString());
            return n11.toString();
        }
        return str3;
    }

    public static int c(int i10, int i11) {
        float[] P02 = P0(5);
        Color.colorToHSV(i11, P02);
        float f10 = P02[0];
        float f11 = P02[1];
        Color.colorToHSV(i10, P02);
        P02[0] = f10;
        P02[1] = org.telegram.messenger.g0.T1(P02[1], f11, 0.25f);
        return Color.HSVToColor(Color.alpha(i10), P02);
    }

    public static org.telegram.ui.Cells.y c0(int i10, int i11, int i12, int i13, int i14) {
        f29785z.setColor(-1);
        ?? drawable = new Drawable();
        drawable.f29040a = new Path();
        drawable.f29041b = r1;
        drawable.f29042c = true;
        float L10 = org.telegram.messenger.g0.L(i11);
        float L11 = org.telegram.messenger.g0.L(i12);
        float L12 = org.telegram.messenger.g0.L(i13);
        float L13 = org.telegram.messenger.g0.L(i14);
        float[] fArr = {L10, L10, L11, L11, L12, L12, L13, L13};
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, drawable);
    }

    public static boolean c1() {
        if (P && I.f29246j0 != null) {
            return true;
        }
        return false;
    }

    public static void d(String str, Drawable drawable, int i10) {
        dm.put(str, drawable);
        em.put(str, Integer.valueOf(i10));
    }

    public static ShapeDrawable d0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        return shapeDrawable;
    }

    public static boolean d1() {
        if (Z != null) {
            return true;
        }
        return false;
    }

    public static void e(int i10, Paint paint, String str) {
        fm.put(str, paint);
        gm.put(str, Integer.valueOf(i10));
    }

    public static ShapeDrawable e0(int i10, int i11, int i12) {
        float f10 = i10;
        float f11 = i11;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f11, f11, f11, f11}, null, null));
        shapeDrawable.getPaint().setColor(i12);
        return shapeDrawable;
    }

    public static boolean e1(int i10) {
        float[] P02 = P0(3);
        Color.colorToHSV(i10, P02);
        float f10 = P02[1];
        if (f10 > 0.1f && f10 < 0.9f) {
            return true;
        }
        return false;
    }

    public static void f(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        if (z10) {
            int i10 = ol;
            if (sparseIntArray.indexOfKey(i10) < 0) {
                sparseIntArray2.put(i10, r1(0.1f, -1));
            }
        }
        int[] iArr = hm;
        int i11 = f29644ra;
        int i12 = sparseIntArray2.get(i11, iArr[i11]);
        int L12 = L1(sparseIntArray2);
        int i13 = ql;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, x(i12, z10, false));
        }
        int i14 = rl;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, x(i12, z10, true));
        }
        int i15 = sl;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, x(L12, z10, false));
        }
        int i16 = tl;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            sparseIntArray2.put(i16, x(L12, z10, true));
        }
        int i17 = ul;
        if (sparseIntArray.indexOfKey(i17) < 0) {
            sparseIntArray2.put(i17, y(i12, z10, false, true));
        }
        int i18 = vl;
        if (sparseIntArray.indexOfKey(i18) < 0) {
            sparseIntArray2.put(i18, y(L12, z10, true, true));
        }
        int i19 = wl;
        if (sparseIntArray.indexOfKey(i19) < 0) {
            sparseIntArray2.put(i19, y(i12, z10, false, false));
        }
        int i20 = xl;
        if (sparseIntArray.indexOfKey(i20) < 0) {
            sparseIntArray2.put(i20, y(L12, z10, true, false));
        }
    }

    public static InsetDrawable f0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        shapeDrawable.getPaint().setShadowLayer(org.telegram.messenger.g0.N(2.0f), 0.0f, org.telegram.messenger.g0.N(0.33f), r1(Color.alpha(i11) / 255.0f, 285212672));
        return new InsetDrawable((Drawable) shapeDrawable, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
    }

    public static boolean f1(int i10) {
        if (lm.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    public static void g(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        int[] iArr = hm;
        int i10 = f29644ra;
        int i11 = sparseIntArray2.get(i10, iArr[i10]);
        int L12 = L1(sparseIntArray2);
        int i12 = il;
        if (sparseIntArray.indexOfKey(i12) < 0) {
            sparseIntArray2.put(i12, z(i11, z10, false));
        }
        int i13 = jl;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, z(L12, z10, true));
        }
        int i14 = kl;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, A(i11, z10, false));
        }
        int i15 = ll;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, A(L12, z10, true));
        }
        int i16 = nl;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            int i17 = Rb;
            sparseIntArray2.put(i16, r1(0.2f, sparseIntArray2.get(i17, iArr[i17])));
        }
        if (z10) {
            int i18 = ml;
            if (sparseIntArray.indexOfKey(i18) < 0) {
                int i19 = Pd;
                sparseIntArray2.put(i18, r1(0.2f, sparseIntArray2.get(i19, iArr[i19])));
            }
        }
    }

    public static org.telegram.ui.Cells.y g0(int i10, int i11) {
        return h0(i10, i11, -1);
    }

    public static boolean g1() {
        l6 l6Var = I;
        if (!l6Var.T || l6Var.Z != f29557n) {
            if (lm.indexOfKey(Ee) < 0 && f29430g0 <= 0 && TextUtils.isEmpty(f29449h0)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void h(Drawable drawable) {
        boolean z10;
        Bitmap bitmap;
        if (f29396e2 == null) {
            return;
        }
        int i10 = lm.get(f29779yd);
        if ((drawable instanceof cb0) && cz.o() != 0 && i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && Y != (bitmap = ((cb0) drawable).f34155k)) {
            Y = bitmap;
            Bitmap bitmap2 = Y;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            Z = new BitmapShader(bitmap2, tileMode, tileMode);
            if (f29317a0 == null) {
                f29317a0 = new Matrix();
            }
        }
        if (Z != null && i10 == 0 && z10) {
            ColorMatrix colorMatrix = new ColorMatrix();
            org.telegram.messenger.g0.i(colorMatrix, 2.5f);
            org.telegram.messenger.g0.n2(colorMatrix, 0.75f);
            f29396e2.setShader(Z);
            f29396e2.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            f29396e2.setAlpha(64);
            return;
        }
        Paint paint = f29396e2;
        if (i10 == 0) {
            i10 = 1073741824;
        }
        paint.setColor(i10);
        f29396e2.setColorFilter(null);
        f29396e2.setShader(null);
    }

    public static org.telegram.ui.Cells.y h0(int r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.m6.h0(int, int, int):org.telegram.ui.Cells.y");
    }

    public static boolean h1() {
        if (mm != null) {
            return true;
        }
        return false;
    }

    public static void i() {
        Drawable drawable = f29394e0;
        if (drawable != null) {
            j(drawable);
        }
    }

    public static org.telegram.ui.Cells.y i0(int i10, int i11) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), new ColorDrawable(i10), new ColorDrawable(i10));
    }

    public static boolean i1(h6 h6Var) {
        if (h6Var != null) {
            return h6Var.h();
        }
        return cz.H0;
    }

    public static void j(Drawable drawable) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        Bitmap bitmap;
        if (f29415f2 == null) {
            return;
        }
        X = f29357c0;
        f29338b0 = f29376d0;
        boolean z11 = cz.H0;
        int i16 = f29370cd;
        int i17 = 0;
        if (z11) {
            int x02 = x0(null, f29701ua, false);
            int x03 = x0(null, Ea, false);
            i11 = i0.a.k(x03, x02);
            i12 = i0.a.k(i0.a.o(x03, Math.min(255, Color.alpha(x03) * 2)), x02);
            X = i11;
            f29338b0 = i12;
        } else {
            int indexOfKey = lm.indexOfKey(i16);
            if (indexOfKey >= 0) {
                i10 = lm.valueAt(indexOfKey);
            } else {
                i10 = X;
            }
            i11 = i10;
            int indexOfKey2 = lm.indexOfKey(f29387dd);
            if (indexOfKey2 >= 0) {
                i12 = lm.valueAt(indexOfKey2);
            } else {
                i12 = f29338b0;
            }
        }
        if (!z11 && ((((z10 = drawable instanceof cb0)) || (drawable instanceof BitmapDrawable)) && cz.o() != 0 && qc.e(32))) {
            if (z10) {
                bitmap = ((cb0) drawable).f34155k;
            } else {
                if (drawable instanceof BitmapDrawable) {
                    WeakReference weakReference = Am;
                    if (weakReference != null && weakReference.get() == drawable) {
                        bitmap = Bm;
                    } else {
                        WeakReference weakReference2 = Am;
                        if (weakReference2 != null) {
                            weakReference2.clear();
                        }
                        Am = null;
                        if (drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
                            Am = new WeakReference(drawable);
                            int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
                            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
                            drawable.setBounds(0, 0, intrinsicWidth, 24);
                            ColorFilter colorFilter = drawable.getColorFilter();
                            ColorMatrix colorMatrix = new ColorMatrix();
                            colorMatrix.setSaturation(1.3f);
                            org.telegram.messenger.g0.n2(colorMatrix, 0.94f);
                            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                            drawable.draw(new Canvas(createBitmap));
                            drawable.setColorFilter(colorFilter);
                            Utilities.blurBitmap(createBitmap, 3);
                            Bm = createBitmap;
                            bitmap = createBitmap;
                        } else {
                            Bm = null;
                        }
                    }
                }
                bitmap = null;
            }
            if (Y != bitmap) {
                Y = bitmap;
                Bitmap bitmap2 = Y;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                Z = new BitmapShader(bitmap2, tileMode, tileMode);
                if (Build.VERSION.SDK_INT >= 33) {
                    Z.setFilterMode(2);
                }
                if (f29317a0 == null) {
                    f29317a0 = new Matrix();
                }
            }
            C1(-1, Y3);
            C1(-1, H3);
            C1(-1, I3);
            C1(-1, J3);
            C1(-1, K3);
            f29656s2.setColor(-1);
            f29674t2.setColor(-1);
            f29693u2.setColor(-1);
            f29656s2.linkColor = -1;
            f29712v2.setColor(-1);
            Q2.setColor(-1);
            C1(-1, C4);
            C1(-1, f29619q4);
            C1(-1, f29638r4);
            C1(-1, f29695u4);
            C1(-1, f29752x4);
            C1(-1, f29771y4);
            C1(-1, A4);
            C1(-1, f29790z4);
            C1(-1, f29714v4);
        } else {
            Y = null;
            Z = null;
            int i18 = Fa;
            if (z11) {
                i13 = i18;
            } else {
                i13 = Zc;
            }
            if (!z11) {
                i18 = f29330ad;
            }
            if (z11) {
                i14 = Ga;
            } else {
                i14 = bd;
            }
            D1(i13, Y3);
            D1(i13, H3);
            D1(i13, I3);
            D1(i13, J3);
            D1(i13, K3);
            f29656s2.setColor(x0(null, i13, false));
            f29674t2.setColor(x0(null, i13, false));
            f29693u2.setColor(x0(null, i13, false));
            f29656s2.linkColor = x0(null, i18, false);
            f29712v2.setColor(x0(null, i13, false));
            D1(i14, C4);
            D1(i14, f29619q4);
            D1(i14, f29638r4);
            D1(i14, f29695u4);
            D1(i14, f29752x4);
            D1(i14, f29771y4);
            D1(i14, A4);
            D1(i14, f29790z4);
            D1(i14, f29714v4);
            TextPaint textPaint = Q2;
            if (z11) {
                i15 = Ha;
            } else {
                i15 = Ed;
            }
            textPaint.setColor(x0(null, i15, false));
            if (z11) {
                D1(i14, f29658s4);
                D1(i14, f29676t4);
            } else {
                Drawable drawable2 = f29658s4;
                if (drawable2 != null) {
                    drawable2.setColorFilter(null);
                }
                Drawable drawable3 = f29676t4;
                if (drawable3 != null) {
                    drawable3.setColorFilter(null);
                }
            }
        }
        f29415f2.setColor(i11);
        f29432g2.setColor(i12);
        if (Z != null && (lm.indexOfKey(i16) < 0 || (drawable instanceof cb0) || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix2 = new ColorMatrix();
            if (drawable instanceof cb0) {
                float f14 = -0.06f;
                if (((cb0) drawable).f34161q >= 0.0f) {
                    colorMatrix2.setSaturation(1.6f);
                    if (I.q()) {
                        f13 = 0.97f;
                    } else {
                        f13 = 0.92f;
                    }
                    org.telegram.messenger.g0.n2(colorMatrix2, f13);
                    if (I.q()) {
                        f14 = 0.12f;
                    }
                    org.telegram.messenger.g0.h(colorMatrix2, f14);
                } else {
                    colorMatrix2.setSaturation(1.1f);
                    if (I.q()) {
                        f12 = 0.4f;
                    } else {
                        f12 = 0.8f;
                    }
                    org.telegram.messenger.g0.n2(colorMatrix2, f12);
                    if (I.q()) {
                        f14 = 0.08f;
                    }
                    org.telegram.messenger.g0.h(colorMatrix2, f14);
                }
            } else {
                colorMatrix2.setSaturation(1.6f);
                if (I.q()) {
                    f10 = 0.9f;
                } else {
                    f10 = 0.84f;
                }
                org.telegram.messenger.g0.n2(colorMatrix2, f10);
                if (I.q()) {
                    f11 = -0.04f;
                } else {
                    f11 = 0.06f;
                }
                org.telegram.messenger.g0.h(colorMatrix2, f11);
            }
            f29415f2.setFilterBitmap(true);
            f29415f2.setShader(Z);
            f29415f2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
            f29415f2.setAlpha(255);
            f29432g2.setFilterBitmap(true);
            f29432g2.setShader(Z);
            ColorMatrix colorMatrix3 = new ColorMatrix(colorMatrix2);
            org.telegram.messenger.g0.i(colorMatrix3, 0.26f);
            j1();
            org.telegram.messenger.g0.n2(colorMatrix3, 0.92f);
            f29432g2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
            f29432g2.setAlpha(255);
            f29451h2.setAlpha(0);
            return;
        }
        f29415f2.setColorFilter(null);
        f29415f2.setShader(null);
        f29432g2.setColorFilter(null);
        f29432g2.setShader(null);
        Paint paint = f29451h2;
        if (!z11) {
            i17 = 21;
        }
        paint.setAlpha(i17);
    }

    public static org.telegram.ui.Cells.y j0(int i10, int i11, int i12) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(i11);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(ovalShape);
        shapeDrawable2.getPaint().setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i12}), shapeDrawable, shapeDrawable2);
    }

    public static boolean j1() {
        return I.q();
    }

    public static void k(boolean z10, boolean z11) {
        if (f29578o2 != null && f29543m3 != null && !z10) {
            K2.setColor(x0(null, Ad, false));
            J2.setColor(x0(null, f29799zd, false));
            Q2.setColor(x0(null, Ed, false));
            U1.setColor(x0(null, Ce, false));
            V1.setColor(x0(null, Dc, false));
            W1.setColor(x0(null, De, false));
            f29340b2.setColor(x0(null, f29741wd, false));
            Paint paint = f29359c2;
            int i10 = f29605pa;
            paint.setColor(x0(null, i10, false));
            d2.setColor(x0(null, i10, false));
            TextPaint textPaint = f29656s2;
            int i11 = Zc;
            textPaint.setColor(x0(null, i11, false));
            f29674t2.setColor(x0(null, i11, false));
            f29693u2.setColor(x0(null, i11, false));
            f29656s2.linkColor = x0(null, f29330ad, false);
            f29712v2.setColor(x0(null, i11, false));
            f29416f3.setColor(x0(null, G6, false));
            Paint paint2 = f29487j2;
            int i12 = Je;
            paint2.setColor(x0(null, i12, false));
            f29469i2.setColor(x0(null, f29570nd, false));
            D1(f29351be, f29452h3);
            u4 u4Var = f29543m3;
            int i13 = f29644ra;
            D1(i13, u4Var);
            u4 u4Var2 = f29560n3;
            int i14 = Uc;
            D1(i14, u4Var2);
            D1(i13, f29618q3);
            D1(i14, f29637r3);
            D1(Ab, f29770y3);
            D1(Bb, f29789z3);
            Drawable drawable = A3;
            int i15 = Cb;
            D1(i15, drawable);
            Drawable drawable2 = B3;
            int i16 = Db;
            D1(i16, drawable2);
            D1(i15, C3);
            D1(i16, D3);
            Drawable drawable3 = F3;
            int i17 = f29497jd;
            D1(i17, drawable3);
            D1(i17, G3);
            D1(i11, H3);
            D1(i11, I3);
            D1(i11, J3);
            D1(i11, K3);
            D1(i11, L3);
            Drawable drawable4 = f29619q4;
            int i18 = bd;
            D1(i18, drawable4);
            D1(i18, f29638r4);
            D1(i18, f29695u4);
            D1(i18, f29752x4);
            D1(i18, f29771y4);
            Drawable drawable5 = A4;
            int i19 = f29443gd;
            D1(i19, drawable5);
            D1(i18, f29790z4);
            D1(i18, f29714v4);
            Drawable drawable6 = M3;
            int i20 = f29588od;
            D1(i20, drawable6);
            Drawable drawable7 = N3;
            int i21 = f29608pd;
            D1(i21, drawable7);
            Drawable drawable8 = O3;
            int i22 = Ib;
            D1(i22, drawable8);
            Drawable drawable9 = P3;
            int i23 = Jb;
            D1(i23, drawable9);
            D1(i20, Q3);
            D1(i21, R3);
            D1(i22, S3);
            D1(i23, T3);
            D1(i20, U3);
            D1(i21, V3);
            D1(i22, W3);
            D1(i23, X3);
            Drawable drawable10 = Z3;
            int i24 = f29628qd;
            D1(i24, drawable10);
            D1(i11, Y3);
            D1(i24, f29321a4);
            D1(i24, f29342b4);
            D1(f29647rd, f29361c4);
            D1(f29665sd, f29379d4);
            D1(Kb, f29398e4);
            D1(Lb, f29417f4);
            D1(f29684td, f29434g4);
            Drawable drawable11 = f29471i4;
            int i25 = Mb;
            D1(i25, drawable11);
            Drawable drawable12 = f29453h4;
            int i26 = f29704ud;
            D1(i26, drawable12);
            D1(f29760xd, f29488j4);
            D1(f29424fd, f29508k4);
            D1(i19, f29526l4);
            Drawable drawable13 = f29544m4;
            int i27 = f29781yf;
            D1(i27, drawable13);
            D1(i27, f29561n4);
            D1(i27, o4);
            D1(i26, B4);
            D1(i18, C4);
            D1(i26, D4);
            Drawable drawable14 = E4;
            int i28 = f29686tf;
            D1(i28, drawable14);
            D1(i28, F4);
            for (int i29 = 0; i29 < 2; i29++) {
                D1(i26, G4[i29]);
                D1(f29723vd, H4[i29]);
                D1(i25, I4[i29]);
                D1(Nb, J4[i29]);
            }
            D1(f29797zb, O4);
            Drawable drawable15 = P4;
            int i30 = f29641r7;
            D1(i30, drawable15);
            D1(f29625qa, Q4);
            D1(i30, V4);
            Drawable drawable16 = W4;
            int i31 = uj;
            D1(i31, drawable16);
            D1(i30, X4);
            D1(i31, Y4);
            int i32 = 0;
            while (true) {
                bv0[] bv0VarArr = f29694u3;
                if (i32 >= bv0VarArr.length) {
                    break;
                }
                D1(f29604p9, bv0VarArr[i32]);
                i32++;
            }
            for (int i33 = 0; i33 < 5; i33++) {
                Drawable[][] drawableArr = U4;
                B1(drawableArr[i33][0], x0(null, Ze, false), false);
                B1(drawableArr[i33][0], x0(null, f29535ld, false), true);
                B1(drawableArr[i33][1], x0(null, f29332af, false), false);
                B1(drawableArr[i33][1], x0(null, f29551md, false), true);
            }
            Drawable[] drawableArr2 = T4;
            B1(drawableArr2[0], x0(null, f29499jf, false), false);
            B1(drawableArr2[0], x0(null, f29518kf, false), true);
            B1(drawableArr2[1], x0(null, Hc, false), false);
            B1(drawableArr2[1], x0(null, Ic, false), true);
            Drawable[] drawableArr3 = S4;
            C1(x0(null, f29463hf, false), drawableArr3[0]);
            C1(x0(null, Gc, false), drawableArr3[1]);
            Drawable[] drawableArr4 = M4;
            C1(x0(null, Bd, false), drawableArr4[0]);
            C1(x0(null, Ob, false), drawableArr4[1]);
            Drawable[] drawableArr5 = N4;
            C1(x0(null, i20, false), drawableArr5[0]);
            C1(x0(null, i22, false), drawableArr5[1]);
            D1(Ke, f29470i3);
            D1(i12, j3);
            int i34 = -1;
            if (x0(null, f29627qc, false) == -1) {
                i34 = x0(null, f29645rb, false);
            }
            C1(i34, K4[1]);
            C1(i34, L4[1]);
            C1(x0(null, f29385da, false), R4);
            if (!z11 && !f29337b) {
                i();
                h(f29394e0);
            } else if (cz.H0 && !f29337b) {
                i();
            }
        }
    }

    public static org.telegram.ui.Cells.y k0(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        float f10 = i10;
        float f11 = i11;
        float f12 = i12;
        float f13 = i13;
        float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.setPadding(0, 0, 0, 0);
        shapeDrawable.getPaint().setColor(i14);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable2.getPaint().setColor(i16);
        shapeDrawable2.setPadding(0, 0, 0, 0);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i15}), shapeDrawable, shapeDrawable2);
    }

    public static boolean k1() {
        return !I.q();
    }

    public static void l() {
        Paint paint = f29504k0;
        if (paint == null) {
            return;
        }
        paint.setColor(x0(null, f29382d7, false));
        m0.setColor(x0(null, K6, false));
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = f29634r0;
            int length = drawableArr.length;
            int i11 = J7;
            if (i10 < length) {
                D1(i11, drawableArr[i10]);
                i10++;
            } else {
                oh0 oh0Var = f29692u1;
                oh0Var.f38204a0 = true;
                int i12 = M7;
                oh0Var.Q(x0(null, i12, true), "Arrow1");
                f29692u1.Q(x0(null, i12, true), "Arrow2");
                f29692u1.Q(x0(null, i11, true), "Box2");
                f29692u1.Q(x0(null, i11, true), "Box1");
                f29692u1.o();
                C1 = false;
                f29692u1.J(true);
                oh0 oh0Var2 = f29749x1;
                oh0Var2.f38204a0 = true;
                int i13 = f29403e9;
                oh0Var2.Q(x0(null, i13, true), "Arrow");
                f29749x1.Q(x0(null, i13, true), "Line");
                f29749x1.o();
                oh0 oh0Var3 = f29768y1;
                oh0Var3.f38204a0 = true;
                oh0Var3.Q(x0(null, i13, true), "Arrow");
                f29768y1.Q(x0(null, i13, true), "Line");
                f29768y1.o();
                oh0 oh0Var4 = f29787z1;
                oh0Var4.f38204a0 = true;
                int i14 = f29366c9;
                oh0Var4.Q(x0(null, i14, true), "Line 1");
                f29787z1.Q(x0(null, i14, true), "Line 2");
                f29787z1.Q(x0(null, i14, true), "Line 3");
                f29787z1.Q(x0(null, i13, true), "Cup Red");
                f29787z1.Q(x0(null, i13, true), "Box");
                f29787z1.o();
                B1 = false;
                oh0 oh0Var5 = f29711v1;
                oh0Var5.f38204a0 = true;
                oh0Var5.Q(x0(null, i14, true), "Arrow");
                f29711v1.Q(x0(null, i13, true), "Box2");
                f29711v1.Q(x0(null, i13, true), "Box1");
                f29711v1.o();
                A1 = false;
                oh0 oh0Var6 = f29730w1;
                oh0Var6.f38204a0 = true;
                oh0Var6.Q(x0(null, i13, true), "Arrow1");
                f29730w1.Q(x0(null, f29384d9, true), "Arrow2");
                f29730w1.Q(x0(null, i13, true), "Box2");
                f29730w1.Q(x0(null, i13, true), "Box1");
                f29730w1.o();
                int x02 = x0(null, G6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                f29713v3 = new PorterDuffColorFilter(x02, mode);
                f29732w3 = new PorterDuffColorFilter(x0(null, Wc, false), mode);
                ia.e.d().b();
                return;
            }
        }
    }

    public static boolean l0(l6 l6Var, j6 j6Var, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (j6Var == null || l6Var == null || l6Var.f29237c0 == null) {
            return false;
        }
        if (j6Var.f29096a == l6Var.Z) {
            z11 = true;
        } else {
            z11 = false;
        }
        File e10 = j6Var.e();
        if (e10 != null) {
            e10.delete();
        }
        l6Var.f29235b0.remove(j6Var.f29096a);
        l6Var.f29237c0.remove(j6Var);
        TLRPC.TL_theme tL_theme = j6Var.f29111r;
        if (tL_theme != null) {
            l6Var.f29238d0.remove(tL_theme.f28573id);
        }
        d6 d6Var = j6Var.f29117y;
        if (d6Var != null) {
            d6.a(d6Var);
        }
        if (z11) {
            l6Var.u(((j6) l6Var.f29237c0.get(0)).f29096a);
        }
        if (z10) {
            z1(l6Var, true, false, false, false, false);
            if (j6Var.f29111r != null) {
                np u12 = np.u1(j6Var.f29113t);
                if (z11 && l6Var == J) {
                    z12 = true;
                }
                u12.G4(l6Var, j6Var, z12, true);
            }
        }
        return z11;
    }

    public static boolean l1(j6 j6Var) {
        l6 l6Var = j6Var.f29097b;
        if (l6Var != null) {
            if (l6Var.m().equals("Blue") && j6Var.f29096a == 99) {
                return true;
            }
            if (j6Var.f29097b.m().equals("Day") && j6Var.f29096a == 9) {
                return true;
            }
            if ((j6Var.f29097b.m().equals("Night") || j6Var.f29097b.m().equals("Dark Blue")) && j6Var.f29096a == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void m(boolean z10) {
        l6 l6Var;
        if (M == null) {
            if (z10) {
                l6 l6Var2 = I;
                l6 l6Var3 = J;
                if (l6Var2 != l6Var3) {
                    if (l6Var2 == null || (l6Var3 != null && l6Var2.q() != J.q())) {
                        R = true;
                        f29466i = SystemClock.elapsedRealtime();
                        Q = true;
                        K1(J, true, -1, null);
                        Q = false;
                        return;
                    }
                    return;
                }
                return;
            }
            l6 l6Var4 = K;
            if (l6Var4 != null && l6Var4.q() && f29575o != 0 && (l6Var = L) != null) {
                l6Var4 = l6Var;
            }
            l6 l6Var5 = I;
            if (l6Var5 != l6Var4) {
                if (l6Var5 == null || (l6Var4 != null && l6Var5.q() != l6Var4.q())) {
                    R = false;
                    f29466i = SystemClock.elapsedRealtime();
                    Q = true;
                    K1(l6Var4, true, -1, null);
                    Q = false;
                }
            }
        }
    }

    public static l6 m0(File file, String str, TLRPC.TL_theme tL_theme) {
        String[] split;
        try {
            l6 l6Var = new l6();
            l6Var.f29232a = str;
            l6Var.G = tL_theme;
            l6Var.f29234b = file.getAbsolutePath();
            l6Var.F = k10.f24968t0;
            String[] strArr = new String[1];
            H(T0(new File(l6Var.f29234b), null, strArr), l6Var);
            if (!TextUtils.isEmpty(strArr[0])) {
                String str2 = strArr[0];
                l6Var.f29236c = new File(org.telegram.messenger.t0.h(), Utilities.a(str2) + ".wp").getAbsolutePath();
                Uri parse = Uri.parse(str2);
                l6Var.f29239e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        if ("blur".equals(split[i10])) {
                            l6Var.h = true;
                        } else if ("motion".equals(split[i10])) {
                            l6Var.f29248n = true;
                        }
                    }
                }
                String queryParameter2 = parse.getQueryParameter("intensity");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String queryParameter3 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            l6Var.f29249r = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                            if (queryParameter3.length() >= 13 && org.telegram.messenger.g0.S1(queryParameter3.charAt(6))) {
                                l6Var.f29250s = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter3.length() >= 20 && org.telegram.messenger.g0.S1(queryParameter3.charAt(13))) {
                                l6Var.f29251w = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter3.length() == 27 && org.telegram.messenger.g0.S1(queryParameter3.charAt(20))) {
                                l6Var.f29252x = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String queryParameter4 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            l6Var.f29253y = Utilities.z(queryParameter4).intValue();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        l6Var.E = Utilities.z(queryParameter2).intValue();
                    }
                    if (l6Var.E == 0) {
                        l6Var.E = 50;
                    }
                }
                return l6Var;
            }
            f29449h0 = null;
            return l6Var;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static void m1(int i10, boolean z10) {
        boolean[] zArr = C;
        if (!zArr[i10]) {
            if ((z10 || Math.abs((System.currentTimeMillis() / 1000) - D[i10]) >= 3600) && k10.i(i10).p()) {
                zArr[i10] = true;
                TL_account.getThemes getthemes = new TL_account.getThemes();
                getthemes.format = "android";
                if (!si.d0(i10).B0.isEmpty()) {
                    getthemes.hash = E[i10];
                }
                if (org.telegram.messenger.s2.f26730a) {
                    Log.i("theme", "loading remote themes, hash " + getthemes.hash);
                }
                ConnectionsManager.getInstance(i10).sendRequest(getthemes, new ki.b2(i10, 3));
            }
        }
    }

    public static void n(Paint paint) {
        paint.setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, org.telegram.messenger.g0.N(0.33f), f29316a);
    }

    public static Paint n0(int i10) {
        Paint paint = Em;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
        }
        return paint;
    }

    public static Bitmap n1(FileInputStream fileInputStream, int i10) {
        float min;
        int i11;
        try {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 1;
                options.inJustDecodeBounds = true;
                long j10 = i10;
                fileInputStream.getChannel().position(j10);
                BitmapFactory.decodeStream(fileInputStream, null, options);
                float f10 = options.outWidth;
                float f11 = options.outHeight;
                Point point = org.telegram.messenger.g0.f24046q;
                int min2 = Math.min(point.x, point.y);
                int max = Math.max(point.x, point.y);
                if (min2 >= max && f10 > f11) {
                    min = Math.max(f10 / min2, f11 / max);
                } else {
                    min = Math.min(f10 / min2, f11 / max);
                }
                if (min < 1.2f) {
                    min = 1.0f;
                }
                options.inJustDecodeBounds = false;
                if (min > 1.0f && (f10 > min2 || f11 > max)) {
                    int i12 = 1;
                    while (true) {
                        i11 = i12 * 2;
                        if (i12 * 4 >= min) {
                            break;
                        }
                        i12 = i11;
                    }
                    options.inSampleSize = i11;
                } else {
                    options.inSampleSize = (int) min;
                }
                fileInputStream.getChannel().position(j10);
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                if (decodeStream.getWidth() < min2 || decodeStream.getHeight() < max) {
                    float max2 = Math.max(min2 / decodeStream.getWidth(), max / decodeStream.getHeight());
                    if (max2 >= 1.02f) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, (int) (decodeStream.getWidth() * max2), (int) (decodeStream.getHeight() * max2), true);
                        decodeStream.recycle();
                        try {
                            fileInputStream.close();
                        } catch (Exception unused) {
                        }
                        return createScaledBitmap;
                    }
                }
                try {
                    fileInputStream.close();
                } catch (Exception unused2) {
                }
                return decodeStream;
            } catch (Exception e10) {
                a8.g(e10, true);
                try {
                    fileInputStream.close();
                } catch (Exception unused3) {
                }
                return null;
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Exception unused4) {
            }
            throw th2;
        }
    }

    public static void o() {
        if (B0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = f29604p9;
            int i12 = f29439g9;
            int i13 = Z8;
            int i14 = X8;
            if (i10 < 2) {
                B0[i10].setColor(x0(null, i14, false));
                C0[i10].setColor(x0(null, i13, false));
                TextPaint textPaint = F0[i10];
                int x02 = x0(null, i12, false);
                textPaint.linkColor = x02;
                textPaint.setColor(x02);
                H0[i10].setColor(x0(null, i11, false));
                i10++;
            } else {
                D0.setColor(x0(null, i14, false));
                E0.setColor(x0(null, i13, false));
                TextPaint textPaint2 = G0;
                int x03 = x0(null, f29549m9, false);
                textPaint2.linkColor = x03;
                textPaint2.setColor(x03);
                f29691u0.setColor(x0(null, f29680t9, false));
                f29710v0.setColor(x0(null, s9, false));
                I0.setColor(x0(null, f29624q9, false));
                J0.setColor(x0(null, f29643r9, false));
                TextPaint textPaint3 = K0;
                int i15 = Zl;
                textPaint3.setColor(x0(null, i15, false));
                TextPaint textPaint4 = L0;
                int i16 = W8;
                textPaint4.setColor(x0(null, i16, false));
                M0.setColor(x0(null, i16, false));
                TextPaint textPaint5 = N0;
                int i17 = f29422f9;
                textPaint5.setColor(x0(null, i17, false));
                O0.setColor(x0(null, i17, false));
                Paint paint = f29729w0;
                int i18 = U8;
                paint.setColor(x0(null, i18, false));
                Paint paint2 = f29767y0;
                int i19 = V8;
                paint2.setColor(x0(null, i19, false));
                f29786z0.setColor(x0(null, i11, false));
                f29748x0.setColor(x0(null, f29757x9, false));
                P0.setColor(x0(null, f29601p6, false));
                Q0.setColor(x0(null, A6, false));
                D1(f29326a9, f29318a1);
                Drawable drawable = f29339b1;
                int i20 = f29347b9;
                D1(i20, drawable);
                D1(f29700u9, T0);
                D1(G6, S0);
                Drawable drawable2 = V0;
                int i21 = f29719v9;
                D1(i21, drawable2);
                D1(i21, W0);
                D1(f29738w9, X0);
                D1(f29776y9, Y0);
                D1(i20, f29486j1);
                D1(i20, f29505k1);
                D1(i15, l1);
                D1(i20, Z0);
                Drawable drawable3 = f29358c1;
                int i22 = B9;
                D1(i22, drawable3);
                D1(i22, f29377d1);
                D1(i22, f29395e1);
                D1(i18, f29541m1);
                D1(Z5, n1);
                D1(qk, f29577o1);
                D1(i19, f29596p1);
                D1(i19, f29616q1);
                D1(i19, f29635r1);
                D1(i12, f29673t1);
                D1(f29795z9, f29414f1);
                D1(A9, f29468i1);
                D1(A8, f29655s1);
                vk0 vk0Var = f29431g1;
                int i23 = f29493j9;
                D1(i23, vk0Var);
                D1(i23, f29450h1);
                return;
            }
        }
    }

    public static ColorFilter o0(h6 h6Var) {
        if (h6Var != null) {
            return h6Var.f();
        }
        return f29713v3;
    }

    public static void o1(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.m6.o1(boolean):void");
    }

    public static void p() {
        l6 l6Var;
        l6 l6Var2 = M;
        if (l6Var2 == null) {
            return;
        }
        O = false;
        if (R && (l6Var = J) != null) {
            u(l6Var, true, true);
        } else if (!P) {
            u(l6Var2, true, false);
        }
        P = false;
        M = null;
        F(false);
    }

    public static g8 p0(gj gjVar) {
        HashMap hashMap = f29399e5;
        if (hashMap != null && gjVar != null) {
            return (g8) hashMap.get(gjVar);
        }
        return null;
    }

    public static Drawable p1(d6 d6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable drawable;
        r7 J10 = J(I, d6Var, lm, file, f29449h0, f29430g0, i10, S, z11, O, P, z10, document, false);
        Boolean bool = (Boolean) J10.d;
        if (bool != null) {
            z12 = bool.booleanValue();
        } else {
            z12 = f29467i0;
        }
        f29467i0 = z12;
        Boolean bool2 = (Boolean) J10.f619e;
        if (bool2 != null) {
            z13 = bool2.booleanValue();
        } else {
            z13 = f29485j0;
        }
        f29485j0 = z13;
        Boolean bool3 = (Boolean) J10.f620f;
        if (bool3 != null) {
            z14 = bool3.booleanValue();
        } else {
            z14 = W;
        }
        W = z14;
        Drawable drawable2 = (Drawable) J10.f617b;
        if (drawable2 != null) {
            drawable = drawable2;
        } else {
            drawable = f29394e0;
        }
        f29394e0 = drawable;
        int[] q10 = org.telegram.messenger.g0.q(drawable2);
        int i11 = q10[0];
        f29357c0 = i11;
        X = i11;
        int i12 = q10[1];
        f29376d0 = i12;
        f29338b0 = i12;
        i();
        return drawable2;
    }

    public static void q() {
        if (Q1 == null) {
            return;
        }
        P1.setColor(x0(null, G6, false));
        P1.linkColor = x0(null, J6, false);
        D1(f29632qi, Q1);
        D1(f29652ri, R1);
    }

    public static File q0(String str) {
        long j10;
        File file = new File(org.telegram.messenger.t0.h(), str);
        try {
            InputStream open = org.telegram.messenger.t0.f26931b.getAssets().open(str);
            j10 = open.available();
            open.close();
        } catch (Exception e10) {
            a8.g(e10, true);
            j10 = 0;
        }
        if (!file.exists() || (j10 != 0 && file.length() != j10)) {
            try {
                InputStream open2 = org.telegram.messenger.t0.f26931b.getAssets().open(str);
                Typeface typeface = org.telegram.messenger.g0.f24018a;
                org.telegram.messenger.g0.D(open2, new FileOutputStream(file));
                open2.close();
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        return file;
    }

    public static void q1(int i10, int i11, int... iArr) {
        for (int i12 : iArr) {
            Cm[i12] = (i10 << 16) | i11;
        }
    }

    public static void r(float f10, float f11, int i10, int i11) {
        s(Y, Z, f29317a0, i10, i11, f10, f11);
    }

    public static String r0(TLRPC.ThemeSettings themeSettings) {
        if (themeSettings == null) {
            return null;
        }
        TLRPC.BaseTheme baseTheme = themeSettings.base_theme;
        if (baseTheme instanceof TLRPC.TL_baseThemeClassic) {
            return "Blue";
        }
        if (baseTheme instanceof TLRPC.TL_baseThemeDay) {
            return "Day";
        }
        if (baseTheme instanceof TLRPC.TL_baseThemeTinted) {
            return "Dark Blue";
        }
        if (baseTheme instanceof TLRPC.TL_baseThemeArctic) {
            return "Arctic Blue";
        }
        if (!(baseTheme instanceof TLRPC.TL_baseThemeNight)) {
            return null;
        }
        return "Night";
    }

    public static int r1(float f10, int i10) {
        if (f10 == 1.0f) {
            return i10;
        }
        return i0.a.o(i10, l9.b((int) (Color.alpha(i10) * f10), 0, 255));
    }

    public static void s(Bitmap bitmap, BitmapShader bitmapShader, Matrix matrix, int i10, int i11, float f10, float f11) {
        if (bitmapShader != null && matrix != null) {
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            float f12 = i10;
            float f13 = i11;
            float max = Math.max(f12 / width, f13 / height);
            matrix.reset();
            matrix.setTranslate(((f12 - (width * max)) / 2.0f) - f10, ((f13 - (height * max)) / 2.0f) - f11);
            matrix.preScale(max, max);
            bitmapShader.setLocalMatrix(matrix);
        }
    }

    public static Drawable s0() {
        Drawable t02 = t0();
        if (t02 == null && d != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Utilities.f22813i.c(new ai.h1(countDownLatch, 1));
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            return t0();
        }
        return t02;
    }

    public static int s1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.m6.s1():int");
    }

    public static void t(View view, View view2, h6 h6Var) {
        if (view != null && view2 != null) {
            int[] iArr = zm;
            view.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            view2.getLocationOnScreen(iArr);
            if (view2 instanceof n71) {
                Bitmap bitmap = Y;
                if (bitmap != null) {
                    float width = bitmap.getWidth();
                    i10 = (int) ((((view2.getMeasuredWidth() - (Math.max(view2.getMeasuredWidth() / width, view2.getMeasuredHeight() / Y.getHeight()) * width)) / 2.0f) - ((n71) view2).J) + i10);
                } else {
                    i10 = (int) (i10 + (-((n71) view2).J));
                }
                i11 = (int) (i11 + (-((n71) view2).K));
            }
            if (h6Var != null) {
                h6Var.e(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
                return;
            }
            r(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
        }
    }

    public static Drawable t0() {
        Drawable drawable = f29413f0;
        if (drawable != null) {
            return drawable;
        }
        return f29394e0;
    }

    public static void t1(boolean z10, boolean z11) {
        boolean z12;
        SparseIntArray clone = km.clone();
        j6 k10 = I.k(false);
        if (k10 != null) {
            z12 = k10.d(km, clone);
        } else {
            z12 = true;
        }
        g(km, clone, I.q());
        f(km, clone, I.q());
        nm = z12;
        lm = clone;
        if (!z11) {
            u1(!(LaunchActivity.Q() instanceof bn));
        }
        l();
        o();
        q();
        k(false, z10);
        org.telegram.messenger.g0.g3(new d9(3, !O));
    }

    public static void u(org.telegram.ui.ActionBar.l6 r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.m6.u(org.telegram.ui.ActionBar.l6, boolean, boolean):void");
    }

    public static bv0 u0(int i10) {
        if (i10 < 0 || i10 > 5) {
            return null;
        }
        bv0[] bv0VarArr = f29694u3;
        bv0 bv0Var = bv0VarArr[i10];
        if (bv0Var != null) {
            return bv0Var;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                bv0VarArr[5] = new sp();
                            }
                        } else {
                            bv0VarArr[4] = new sk0(true);
                        }
                    } else {
                        bv0VarArr[3] = new xe0(null, true);
                    }
                } else {
                    bv0VarArr[2] = new sn0(true);
                }
            } else {
                bv0VarArr[1] = new sp(true);
            }
        } else {
            bv0VarArr[0] = new m41(true);
        }
        bv0 bv0Var2 = bv0VarArr[i10];
        bv0Var2.d();
        bv0Var2.b(x0(null, f29604p9, false));
        return bv0Var2;
    }

    public static void u1(boolean z10) {
        k9 k9Var = V;
        if (k9Var != null) {
            k9Var.dispose();
            V = null;
        }
        Drawable drawable = f29394e0;
        if (drawable instanceof cb0) {
            S = ((cb0) drawable).f34153i;
        } else {
            S = 0;
        }
        f29394e0 = null;
        f29413f0 = null;
        o1(z10);
    }

    public static l6 v(File file, String str, TLRPC.TL_theme tL_theme, boolean z10) {
        File file2;
        String str2;
        try {
            if (!str.toLowerCase().endsWith(".attheme")) {
                str = str.concat(".attheme");
            }
            if (z10) {
                ls.e().k(ls.f25416x4, new Object[0]);
                l6 l6Var = new l6();
                l6Var.f29232a = str;
                l6Var.G = tL_theme;
                l6Var.f29234b = file.getAbsolutePath();
                l6Var.F = k10.f24968t0;
                M = D0();
                O = true;
                P = false;
                u(l6Var, false, false);
                return l6Var;
            }
            if (tL_theme != null) {
                str2 = "remote" + tL_theme.f28573id;
                file2 = new File(org.telegram.messenger.t0.h(), str2 + ".attheme");
            } else {
                file2 = new File(org.telegram.messenger.t0.h(), str);
                str2 = str;
            }
            if (!org.telegram.messenger.g0.E(file, file2)) {
                p();
                return null;
            }
            M = null;
            O = false;
            P = false;
            HashMap hashMap = H;
            l6 l6Var2 = (l6) hashMap.get(str2);
            if (l6Var2 == null) {
                l6Var2 = new l6();
                l6Var2.f29232a = str;
                l6Var2.F = k10.f24968t0;
                ArrayList arrayList = F;
                arrayList.add(l6Var2);
                G.add(l6Var2);
                Collections.sort(arrayList, new el(24));
            } else {
                hashMap.remove(str2);
            }
            l6Var2.G = tL_theme;
            l6Var2.f29234b = file2.getAbsolutePath();
            hashMap.put(l6Var2.m(), l6Var2);
            y1(true, false);
            u(l6Var2, true, false);
            return l6Var2;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static int v0(int i10) {
        return x0(null, i10, false);
    }

    public static void v1(boolean z10) {
        if (z10) {
            P = false;
            u1(true);
            return;
        }
        I.v(null);
    }

    public static int w(int i10, int i11) {
        float alpha = Color.alpha(i11) / 255.0f;
        float alpha2 = Color.alpha(i10) / 255.0f;
        float f10 = 1.0f - alpha;
        float f11 = (alpha2 * f10) + alpha;
        if (f11 == 0.0f) {
            return 0;
        }
        return Color.argb((int) (255.0f * f11), (int) ((((Color.red(i10) * alpha2) * f10) + (Color.red(i11) * alpha)) / f11), (int) ((((Color.green(i10) * alpha2) * f10) + (Color.green(i11) * alpha)) / f11), (int) ((((Color.blue(i10) * alpha2) * f10) + (Color.blue(i11) * alpha)) / f11));
    }

    public static int w0(int i10, h6 h6Var) {
        Integer z02;
        if (h6Var != null) {
            if (h6Var.h() && (z02 = z0(i10, h6Var)) != null) {
                return z02.intValue();
            }
            return h6Var.k(i10);
        }
        return v0(i10);
    }

    public static void w1() {
        SharedPreferences.Editor edit = np.g1().edit();
        edit.putInt("selectedAutoNightType", f29575o);
        edit.putBoolean("autoNightScheduleByLocation", f29594p);
        edit.putFloat("autoNightBrighnessThreshold", f29614q);
        edit.putInt("autoNightDayStartTime", f29633r);
        edit.putInt("autoNightDayEndTime", f29653s);
        edit.putInt("autoNightSunriseTime", v);
        edit.putString("autoNightCityName", f29728w);
        edit.putInt("autoNightSunsetTime", f29671t);
        edit.putLong("autoNightLocationLatitude3", Double.doubleToRawLongBits(f29747x));
        edit.putLong("autoNightLocationLongitude3", Double.doubleToRawLongBits(f29766y));
        edit.putInt("autoNightLastSunCheckDay", f29690u);
        l6 l6Var = J;
        if (l6Var != null) {
            edit.putString("nighttheme", l6Var.m());
        } else {
            edit.remove("nighttheme");
        }
        edit.commit();
    }

    public static int x(int i10, boolean z10, boolean z11) {
        int i11;
        float f10;
        if (z10) {
            if (z11) {
                f10 = 0.22f;
            } else {
                f10 = 0.12f;
            }
            return r1(f10, -1);
        }
        if (z11) {
            i11 = -3813931;
        } else {
            i11 = -1972501;
        }
        float[] P02 = P0(3);
        Color.colorToHSV(i10, P02);
        if (P02[1] > 0.02f) {
            return c(i11, i10);
        }
        return i11;
    }

    public static int x0(boolean[] zArr, int i10, boolean z10) {
        SparseIntArray sparseIntArray;
        int indexOfKey;
        Integer z02;
        if (cz.H0 && (z02 = z0(i10, null)) != null) {
            return z02.intValue();
        }
        if (!z10 && (sparseIntArray = mm) != null && (indexOfKey = sparseIntArray.indexOfKey(i10)) >= 0) {
            return mm.valueAt(indexOfKey);
        }
        return y0(lm, i10, zArr);
    }

    public static void x1(org.telegram.ui.ActionBar.l6 r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.m6.x1(org.telegram.ui.ActionBar.l6, boolean, boolean, boolean):void");
    }

    public static int y(int i10, boolean z10, boolean z11, boolean z12) {
        int i11;
        float f10;
        if (z10) {
            if (z12) {
                f10 = 0.62f;
            } else {
                f10 = 0.18f;
            }
            return r1(f10, -1);
        }
        if (z12) {
            i11 = -6380376;
        } else {
            i11 = -2565928;
        }
        float[] P02 = P0(3);
        Color.colorToHSV(i10, P02);
        if (z11 && P02[1] > 0.02f) {
            return c(i11, i10);
        }
        return i11;
    }

    public static int y0(android.util.SparseIntArray r7, int r8, boolean[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.m6.y0(android.util.SparseIntArray, int, boolean[]):int");
    }

    public static void y1(boolean z10, boolean z11) {
        String str;
        boolean z12;
        ArrayList arrayList;
        Integer num;
        JSONObject jSONObject;
        int i10 = 0;
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f26931b.getSharedPreferences("themeconfig", 0).edit();
        if (z10) {
            JSONArray jSONArray = new JSONArray();
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = G;
                if (i11 >= arrayList2.size()) {
                    break;
                }
                l6 l6Var = (l6) arrayList2.get(i11);
                l6Var.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("name", l6Var.f29232a);
                    jSONObject.put("path", l6Var.f29234b);
                    jSONObject.put("account", l6Var.F);
                    TLRPC.TL_theme tL_theme = l6Var.G;
                    if (tL_theme != null) {
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        l6Var.G.serializeToStream(serializedData);
                        jSONObject.put("info", Utilities.f(serializedData.toByteArray()));
                    }
                    jSONObject.put("loaded", l6Var.H);
                } catch (Exception e10) {
                    a8.g(e10, true);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
                i11++;
            }
            edit.putString("themes2", jSONArray.toString());
        }
        for (int i12 = 0; i12 < 4; i12++) {
            StringBuilder sb2 = new StringBuilder("2remoteThemesHash");
            Object obj = "";
            if (i12 == 0) {
                num = "";
            } else {
                num = Integer.valueOf(i12);
            }
            sb2.append(num);
            edit.putLong(sb2.toString(), E[i12]);
            StringBuilder sb3 = new StringBuilder("lastLoadingThemesTime");
            if (i12 != 0) {
                obj = Integer.valueOf(i12);
            }
            sb3.append(obj);
            edit.putInt(sb3.toString(), D[i12]);
        }
        edit.putInt("lastLoadingCurrentThemeTime", B);
        edit.commit();
        if (z10) {
            while (i10 < 5) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                str = "Night";
                            } else {
                                str = "Day";
                            }
                        } else {
                            str = "Arctic Blue";
                        }
                    } else {
                        str = "Dark Blue";
                    }
                } else {
                    str = "Blue";
                }
                l6 l6Var2 = (l6) H.get(str);
                if (l6Var2 == null || (arrayList = l6Var2.f29237c0) == null || arrayList.isEmpty()) {
                    z12 = z11;
                } else {
                    z12 = z11;
                    z1(l6Var2, true, false, false, false, z12);
                }
                i10++;
                z11 = z12;
            }
        }
    }

    public static int z(int i10, boolean z10, boolean z11) {
        float f10;
        if (z10 && z11) {
            return r1(0.07f, -1);
        }
        float[] P02 = P0(3);
        Color.colorToHSV(i10, P02);
        if (z10) {
            P02[2] = Math.min(1.0f, P02[2] + 0.07f);
            if (z11) {
                P02[1] = Math.min(1.0f, P02[1] + 0.02f);
            }
        } else {
            float f11 = P02[2];
            if (z11) {
                f10 = 0.06f;
            } else {
                f10 = 0.03f;
            }
            P02[2] = Math.max(0.0f, f11 - f10);
            if (z11) {
                float f12 = P02[1];
                if (f12 > 0.02f) {
                    P02[1] = Math.min(1.0f, f12 + 0.02f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), P02);
    }

    public static Integer z0(int i10, h6 h6Var) {
        int i11;
        if (i1(h6Var) && i10 >= 0 && i10 < (i11 = f29418f5)) {
            if (Cm == null) {
                Cm = new int[i11];
                q1(2, Ma, f29496jc, f29405ec, Ib, Jb);
                q1(3, Ra, f29407ee, fe, f29588od, f29608pd);
                q1(1, Na, Ab, Bb, Cb, Db, Eb, Fb);
                q1(1, Pa, Rb, Sb);
                q1(1, Qa, Tb, Ub, Vb, Wb);
                q1(1, f29349bb, Mb, Nb, Ob, Pb, Qb, Qc, Yb, Zb, f29515kc, wc, Gc, Kb, Lb, Kd, Xb, fc, f29442gc);
                q1(1, f29368cb, Ec, Fc, Hc, f29627qc, f29683tc);
                q1(1, f29386db, Gb, Hb, Ic, f29460hc, f29478ic);
                q1(2, eb, xc, f29778yc, Bc, Cc, f29534lc, f29550mc);
                q1(2, f29423fb, f29569nc, f29607pc, f29646rc, f29664sc, f29703uc, f29722vc, f29798zc, Ac, jl, sl);
                q1(2, f29441gb, ll, nl);
                q1(1, Ua, f29498je, f29517ke);
                q1(1, Va, f29648re);
                q1(1, Wa, f29609pe, f29629qe);
                q1(1, Xa, tk);
                q1(1, Ya, Jc);
                q1(1, Fa, Dd, Id, Od, Sd);
            }
            int i12 = Cm[i10];
            if (i12 != 0) {
                int i13 = 65535 & i12;
                int i14 = i12 >> 16;
                int i15 = f29701ua;
                if (i14 != 2) {
                    if (i14 != 3) {
                        return Integer.valueOf(w0(i13, h6Var));
                    }
                    return Integer.valueOf(i0.a.k(w0(i13, h6Var), w0(i15, h6Var)));
                }
                return Integer.valueOf(i0.a.k(w0(i13, h6Var), i0.a.k(w0(La, h6Var), w0(i15, h6Var))));
            }
            return null;
        }
        return null;
    }

    public static void z1(l6 l6Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        if (z10) {
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f26931b.getSharedPreferences("themeconfig", 0).edit();
            if (!z12) {
                int size = l6Var.f29237c0.size();
                int max = Math.max(0, size - l6Var.X);
                SerializedData serializedData = new SerializedData(((max * 16) + 2) * 4);
                serializedData.writeInt32(9);
                serializedData.writeInt32(max);
                for (int i10 = 0; i10 < size; i10++) {
                    j6 j6Var = (j6) l6Var.f29237c0.get(i10);
                    int i11 = j6Var.f29096a;
                    if (i11 >= 100) {
                        serializedData.writeInt32(i11);
                        serializedData.writeInt32(j6Var.f29098c);
                        serializedData.writeInt32(j6Var.d);
                        serializedData.writeInt32(j6Var.f29099e);
                        serializedData.writeInt32(j6Var.f29100f);
                        serializedData.writeInt32(j6Var.f29101g);
                        serializedData.writeInt32(j6Var.h);
                        serializedData.writeBool(j6Var.f29102i);
                        serializedData.writeInt64(j6Var.f29103j);
                        serializedData.writeInt64(j6Var.f29104k);
                        serializedData.writeInt64(j6Var.f29105l);
                        serializedData.writeInt64(j6Var.f29106m);
                        serializedData.writeInt32(j6Var.f29107n);
                        serializedData.writeInt64(0L);
                        serializedData.writeDouble(j6Var.f29109p);
                        serializedData.writeBool(j6Var.f29110q);
                        serializedData.writeString(j6Var.f29108o);
                        if (j6Var.f29111r != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        serializedData.writeBool(z15);
                        if (j6Var.f29111r != null) {
                            serializedData.writeInt32(j6Var.f29113t);
                            j6Var.f29111r.serializeToStream(serializedData);
                        }
                    }
                }
                edit.putString("accents_" + l6Var.d, Base64.encodeToString(serializedData.toByteArray(), 3));
                if (!z14) {
                    ls.e().k(ls.f25389t4, new Object[0]);
                }
                if (z13) {
                    np.u1(k10.f24968t0).H4(l6Var, l6Var.k(false));
                }
            }
            edit.putInt("accent_current_" + l6Var.d, l6Var.Z);
            edit.commit();
        } else {
            if (l6Var.f29233a0 != -1) {
                if (z11) {
                    j6 j6Var2 = (j6) l6Var.f29235b0.get(l6Var.Z);
                    l6Var.f29235b0.remove(j6Var2.f29096a);
                    l6Var.f29237c0.remove(j6Var2);
                    TLRPC.TL_theme tL_theme = j6Var2.f29111r;
                    if (tL_theme != null) {
                        l6Var.f29238d0.remove(tL_theme.f28573id);
                    }
                }
                l6Var.Z = l6Var.f29233a0;
                j6 k10 = l6Var.k(false);
                if (k10 != null) {
                    l6Var.f29246j0 = k10.f29117y;
                } else {
                    l6Var.f29246j0 = null;
                }
            }
            if (I == l6Var) {
                t1(false, false);
            }
        }
        l6Var.f29233a0 = -1;
    }
}
