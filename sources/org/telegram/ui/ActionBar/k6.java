package org.telegram.ui.ActionBar;

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
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.xp0;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ec1;
import org.telegram.ui.sn;
public abstract class k6 {
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
    public static final ThreadLocal Al;
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
    public static final int[] Bj;
    public static final int Bk;
    public static final ThreadLocal Bl;
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
    public static e20 Cl;
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
    public static m.g3 Dl;
    public static TextPaint E0;
    public static int E1;
    public static TextPaint E2;
    public static dd0 E3;
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
    public static Method El;
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
    public static int Fl;
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
    public static float[] Gl;
    public static final HashMap H;
    public static TextPaint[] H0;
    public static xj0 H1;
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
    public static final int[] Hk;
    public static final r5 Hl;
    public static j6 I;
    public static TextPaint I0;
    public static xj0 I1;
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
    public static final int[] Il;
    public static j6 J;
    public static TextPaint J0;
    public static xj0 J1;
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
    public static WeakReference Jl;
    public static j6 K;
    public static TextPaint K0;
    public static xj0 K1;
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
    public static Bitmap Kl;
    public static final j6 L;
    public static TextPaint L0;
    public static xj0 L1;
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
    public static final Paint Ll;
    public static j6 M;
    public static TextPaint M0;
    public static xj0 M1;
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
    public static final Paint Ml;
    public static boolean N;
    public static TextPaint N0;
    public static xj0 N1;
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
    public static final Paint Nl;
    public static boolean O;
    public static TextPaint O0;
    public static xj0 O1;
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
    public static final Paint Ol;
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
    public static final Paint Pl;
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
    public static final Paint Ql;
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
    public static o9 V;
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
    public static int X;
    public static dd0 X0;
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
    public static Matrix f21120a0;
    public static Drawable f21121a1;
    public static Paint a2;
    public static TextPaint f21122a3;
    public static Drawable f21123a4;
    public static final int f21125a6;
    public static final int f21126a7;
    public static final int f21127a8;
    public static final int f21128a9;
    public static final int f21129aa;
    public static final int f21130ab;
    public static final int f21131ac;
    public static final int f21132ad;
    public static final int f21133ae;
    public static final int f21134af;
    public static final int f21135ag;
    public static final int f21136ah;
    public static final int f21137ai;
    public static final int aj;
    public static final int ak;
    public static final int al;
    public static boolean f21138b;
    public static int f21139b0;
    public static Drawable f21140b1;
    public static Paint f21141b2;
    public static TextPaint f21142b3;
    public static Drawable f21143b4;
    public static Drawable f21144b5;
    public static final int f21145b6;
    public static final int f21146b7;
    public static final int f21147b8;
    public static final int f21148b9;
    public static final int f21149ba;
    public static final int f21150bb;
    public static final int f21151bc;
    public static final int f21152bd;
    public static final int f21153be;
    public static final int f21154bf;
    public static final int f21155bg;
    public static final int f21156bh;
    public static final int f21157bi;
    public static final int bj;
    public static final int bk;
    public static final int bl;
    public static int f21159c0;
    public static Drawable f21160c1;
    public static Paint f21161c2;
    public static TextPaint f21162c3;
    public static Drawable f21163c4;
    public static Drawable f21164c5;
    public static final int f21165c6;
    public static final int f21166c7;
    public static final int f21167c8;
    public static final int f21168c9;
    public static final int f21169ca;
    public static final int f21170cb;
    public static final int f21171cc;
    public static final int f21172cd;
    public static final int f21173ce;
    public static final int f21174cf;
    public static final int f21175cg;
    public static final int f21176ch;
    public static final int f21177ci;
    public static final int cj;
    public static final int ck;
    public static final int cl;
    public static hg.u0 d;
    public static int f21178d0;
    public static Drawable f21179d1;
    public static Paint f21180d2;
    public static TextPaint f21181d3;
    public static Drawable f21182d4;
    public static j8 f21183d5;
    public static final int f21184d6;
    public static final int f21185d7;
    public static final int f21186d8;
    public static final int f21187d9;
    public static final int f21188da;
    public static final int db;
    public static final int f21189dc;
    public static final int dd;
    public static final int f21190de;
    public static final int f21191df;
    public static final int f21192dg;
    public static final int f21193dh;
    public static final int f21194di;
    public static final int dj;
    public static final int dk;
    public static final int dl;
    public static SensorManager e;
    public static Drawable f21195e0;
    public static Drawable f21196e1;
    public static Paint f21197e2;
    public static TextPaint f21198e3;
    public static Drawable f21199e4;
    public static HashMap f21200e5;
    public static final int f21201e6;
    public static final int e7;
    public static final int f21202e8;
    public static final int f21203e9;
    public static final int f21204ea;
    public static final int f21205eb;
    public static final int f21206ec;
    public static final int f21207ed;
    public static final int f21208ee;
    public static final int f21209ef;
    public static final int f21210eg;
    public static final int f21211eh;
    public static final int f21212ei;
    public static final int ej;
    public static final int ek;
    public static final int el;
    public static Sensor f21213f;
    public static Drawable f21214f0;
    public static Drawable f21215f1;
    public static Paint f21216f2;
    public static TextPaint f21217f3;
    public static Drawable f21218f4;
    public static final int f21219f5;
    public static final int f21220f6;
    public static final int f7;
    public static final int f21221f8;
    public static final int f21222f9;
    public static final int f21223fa;
    public static final int f21224fb;
    public static final int fc;
    public static final int f21225fd;
    public static final int f21226fe;
    public static final int f21227ff;
    public static final int fg;
    public static final int f21228fh;
    public static final int f21229fi;
    public static final int fj;
    public static final int fk;
    public static final int fl;
    public static boolean f21230g;
    public static int f21231g0;
    public static ym0 f21232g1;
    public static Paint f21233g2;
    public static TextPaint f21234g3;
    public static Drawable f21235g4;
    public static final int f21236g5;
    public static final int f21237g6;
    public static final int f21238g7;
    public static final int f21239g8;
    public static final int f21240g9;
    public static final int f21241ga;
    public static final int f21242gb;
    public static final int f21243gc;
    public static final int f21244gd;
    public static final int f21245ge;
    public static final int f21246gf;
    public static final int f21247gg;
    public static final int f21248gh;
    public static final int f21249gi;
    public static final int gj;
    public static final int gk;
    public static final int gl;
    public static String f21250h0;
    public static ym0 f21251h1;
    public static Paint f21252h2;
    public static Drawable f21253h3;
    public static Drawable f21254h4;
    public static final int f21255h5;
    public static final int f21256h6;
    public static final int f21257h7;
    public static final int f21258h8;
    public static final int f21259h9;
    public static final int ha;
    public static final int f21260hb;
    public static final int hc;
    public static final int f21261hd;
    public static final int he;
    public static final int f21262hf;
    public static final int f21263hg;
    public static final int f21264hh;
    public static final int f21265hi;
    public static final int hj;
    public static final int hk;
    public static final int hl;
    public static long f21266i;
    public static boolean f21267i0;
    public static Drawable f21268i1;
    public static Paint f21269i2;
    public static Drawable f21270i3;
    public static Drawable f21271i4;
    public static final int f21272i5;
    public static final int f21273i6;
    public static final int f21274i7;
    public static final int f21275i8;
    public static final int f21276i9;
    public static final int ia;
    public static final int f21277ib;
    public static final int f21278ic;
    public static final int f21279id;
    public static final int f21280ie;
    public static final int f21281ig;
    public static final int f21282ih;
    public static final int f21283ii;
    public static final int ij;
    public static final int ik;
    public static final int il;
    public static boolean f21284j;
    public static boolean f21285j0;
    public static Drawable f21286j1;
    public static Paint f21287j2;
    public static Drawable f21288j3;
    public static Drawable f21289j4;
    public static final int f21290j5;
    public static final int f21291j6;
    public static final int f21292j7;
    public static final int f21293j8;
    public static final int f21294j9;
    public static final int f21295ja;
    public static final int f21296jb;
    public static final int f21297jc;
    public static final int f21298jd;
    public static final int f21299je;
    public static final int f21300jf;
    public static final int f21301jg;
    public static final int f21302jh;
    public static final int f21303ji;
    public static final int jj;
    public static final int jk;
    public static final int jl;
    public static boolean f21304k;
    public static Paint f21305k0;
    public static Drawable f21306k1;
    public static Paint f21307k2;
    public static l5 f21308k3;
    public static Drawable f21309k4;
    public static final int f21310k5;
    public static final int f21311k6;
    public static final int f21312k7;
    public static final int f21313k8;
    public static final int f21314k9;
    public static final int f21315ka;
    public static final int f21316kb;
    public static final int f21317kc;
    public static final int f21318kd;
    public static final int f21319ke;
    public static final int kf;
    public static final int f21320kg;
    public static final int f21321kh;
    public static final int f21322ki;
    public static final int kj;
    public static final int kk;
    public static final int kl;
    public static Paint f21324l0;
    public static Drawable l1;
    public static Paint f21325l2;
    public static Drawable f21326l3;
    public static Drawable l4;
    public static final int f21327l5;
    public static final int f21328l6;
    public static final int f21329l7;
    public static final int f21330l8;
    public static final int f21331l9;
    public static final int f21332la;
    public static final int f21333lb;
    public static final int f21334lc;
    public static final int f21335ld;
    public static final int f21336le;
    public static final int f21337lf;
    public static final int f21338lg;
    public static final int f21339lh;
    public static final int f21340li;
    public static final int lj;
    public static final int lk;
    public static final int ll;
    public static Paint m0;
    public static Drawable f21342m1;
    public static Paint f21343m2;
    public static j5 f21344m3;
    public static Drawable f21345m4;
    public static final int f21346m5;
    public static final int f21347m6;
    public static final int f21348m7;
    public static final int f21349m8;
    public static final int f21350m9;
    public static final int f21351ma;
    public static final int f21352mb;
    public static final int f21353mc;
    public static final int f21354md;
    public static final int f21355me;
    public static final int f21356mf;
    public static final int f21357mg;
    public static final int f21358mh;
    public static final int f21359mi;
    public static final int mj;
    public static final int mk;
    public static final HashMap ml;
    public static Paint f21361n0;
    public static Drawable f21362n1;
    public static Paint f21363n2;
    public static j5 f21364n3;
    public static Drawable f21365n4;
    public static final int f21366n5;
    public static final int f21367n6;
    public static final int f21368n7;
    public static final int f21369n8;
    public static final int f21370n9;
    public static final int f21371na;
    public static final int f21372nb;
    public static final int f21373nc;
    public static final int f21374nd;
    public static final int f21375ne;
    public static final int f21376nf;
    public static final int f21377ng;
    public static final int f21378nh;
    public static final int f21379ni;
    public static final int nj;
    public static final int nk;
    public static final HashMap nl;
    public static int f21380o;
    public static Paint f21381o0;
    public static Drawable f21382o1;
    public static TextPaint f21383o2;
    public static j5 f21384o3;
    public static Drawable f21385o4;
    public static final int f21386o5;
    public static final int f21387o6;
    public static final int f21388o7;
    public static final int f21389o8;
    public static final int f21390o9;
    public static final int f21391oa;
    public static final int ob;
    public static final int oc;
    public static final int f21392od;
    public static final int f21393oe;
    public static final int f21394of;
    public static final int f21395og;
    public static final int f21396oh;
    public static final int f21397oi;
    public static final int oj;
    public static final int ok;
    public static final HashMap ol;
    public static boolean f21398p;
    public static Paint f21399p0;
    public static Drawable f21400p1;
    public static TextPaint f21401p2;
    public static j5 f21402p3;
    public static Drawable f21403p4;
    public static final int p5;
    public static final int f21404p6;
    public static final int f21405p7;
    public static final int[] f21406p8;
    public static final int p9;
    public static final int f21407pa;
    public static final int f21408pb;
    public static final int f21409pc;
    public static final int f21410pd;
    public static final int pe;
    public static final int f21411pf;
    public static final int f21412pg;
    public static final int f21413ph;
    public static final int f21414pi;
    public static final int pj;
    public static final int pk;
    public static final HashMap pl;
    public static float f21415q;
    public static Paint f21416q0;
    public static Drawable f21417q1;
    public static TextPaint f21418q2;
    public static j5 f21419q3;
    public static Drawable f21420q4;
    public static final int f21421q5;
    public static final int q6;
    public static final int f21422q7;
    public static final int[] f21423q8;
    public static final int f21424q9;
    public static final int f21425qa;
    public static final int f21426qb;
    public static final int f21427qc;
    public static final int f21428qd;
    public static final int f21429qe;
    public static final int f21430qf;
    public static final int f21431qg;
    public static final int f21432qh;
    public static final int f21433qi;
    public static final int qj;
    public static final int qk;
    public static final int[] ql;
    public static int f21434r;
    public static Drawable f21436r1;
    public static TextPaint f21437r2;
    public static j5 f21438r3;
    public static Drawable f21439r4;
    public static final int f21440r5;
    public static final int f21441r6;
    public static final int f21442r7;
    public static final int[] f21443r8;
    public static final int f21444r9;
    public static final int f21445ra;
    public static final int f21446rb;
    public static final int f21447rc;
    public static final int f21448rd;
    public static final int f21449re;
    public static final int f21450rf;
    public static final int f21451rg;
    public static final int f21452rh;
    public static final int f21453ri;
    public static final int rj;
    public static final int rk;
    public static final SparseIntArray rl;
    public static int f21454s;
    public static Drawable f21455s0;
    public static Drawable f21456s1;
    public static TextPaint f21457s2;
    public static j5 f21458s3;
    public static Drawable f21459s4;
    public static final int f21460s5;
    public static final int f21461s6;
    public static final int f21462s7;
    public static final int f21463s8;
    public static final int f21464s9;
    public static final int f21465sa;
    public static final int f21466sb;
    public static final int f21467sc;
    public static final int sd;
    public static final int f21468se;
    public static final int f21469sf;
    public static final int f21470sg;
    public static final int f21471sh;
    public static final int f21472si;
    public static final int sj;
    public static final int sk;
    public static final HashSet sl;
    public static int f21473t;
    public static Paint f21474t0;
    public static Drawable f21475t1;
    public static TextPaint f21476t2;
    public static j5 f21477t3;
    public static Drawable f21478t4;
    public static final int f21479t5;
    public static final int f21480t6;
    public static final int f21481t7;
    public static final int f21482t8;
    public static final int f21483t9;
    public static final int f21484ta;
    public static final int f21485tb;
    public static final int f21486tc;
    public static final int f21487td;
    public static final int f21488te;
    public static final int f21489tf;
    public static final int f21490tg;
    public static final int f21491th;
    public static final int f21492ti;
    public static final int tj;
    public static final int tk;
    public static SparseIntArray tl;
    public static int f21493u;
    public static Paint f21494u0;
    public static xj0 f21495u1;
    public static TextPaint f21496u2;
    public static Drawable f21498u4;
    public static final int f21499u5;
    public static final int f21500u6;
    public static final int f21501u7;
    public static final int f21502u8;
    public static final int f21503u9;
    public static final int ua;
    public static final int f21504ub;
    public static final int f21505uc;
    public static final int f21506ud;
    public static final int f21507ue;
    public static final int f21508uf;
    public static final int f21509ug;
    public static final int f21510uh;
    public static final int ui;
    public static final int uj;
    public static final int uk;
    public static SparseIntArray ul;
    public static int v;
    public static Paint f21511v0;
    public static xj0 f21512v1;
    public static TextPaint f21513v2;
    public static PorterDuffColorFilter f21514v3;
    public static Drawable f21515v4;
    public static final int f21516v5;
    public static final int f21517v6;
    public static final int f21518v7;
    public static final int f21519v8;
    public static final int f21520v9;
    public static final int f21521va;
    public static final int f21522vb;
    public static final int f21523vc;
    public static final int f21524vd;
    public static final int f21525ve;
    public static final int f21526vf;
    public static final int f21527vg;
    public static final int f21528vh;
    public static final int vi;
    public static final int vj;
    public static final int vk;
    public static SparseIntArray vl;
    public static String f21529w;
    public static Paint f21530w0;
    public static xj0 f21531w1;
    public static TextPaint f21532w2;
    public static PorterDuffColorFilter f21533w3;
    public static Drawable f21534w4;
    public static final int f21535w5;
    public static final int f21536w6;
    public static final int f21537w7;
    public static final int f21538w8;
    public static final int w9;
    public static final int f21539wa;
    public static final int f21540wb;
    public static final int f21541wc;
    public static final int f21542wd;
    public static final int f21543we;
    public static final int f21544wf;
    public static final int f21545wg;
    public static final int f21546wh;
    public static final int wi;
    public static final int wj;
    public static final int wk;
    public static boolean wl;
    public static double f21547x;
    public static Paint f21548x0;
    public static xj0 f21549x1;
    public static TextPaint f21550x2;
    public static ue0 f21551x3;
    public static Drawable f21552x4;
    public static final int f21553x5;
    public static final int f21554x6;
    public static final int f21555x7;
    public static final int f21556x8;
    public static final int f21557x9;
    public static final int f21558xa;
    public static final int f21559xb;
    public static final int f21560xc;
    public static final int f21561xd;
    public static final int f21562xe;
    public static final int f21563xf;
    public static final int f21564xg;
    public static final int f21565xh;
    public static final int xi;
    public static final int xj;
    public static final int xk;
    public static final ThreadLocal xl;
    public static double f21566y;
    public static Paint f21567y0;
    public static xj0 f21568y1;
    public static TextPaint[] f21569y2;
    public static Drawable y3;
    public static Drawable f21570y4;
    public static final int f21571y5;
    public static final int f21572y6;
    public static final int f21573y7;
    public static final int f21574y8;
    public static final int f21575y9;
    public static final int f21576ya;
    public static final int f21577yb;
    public static final int yc;
    public static final int f21578yd;
    public static final int f21579ye;
    public static final int yf;
    public static final int f21580yg;
    public static final int f21581yh;
    public static final int yi;
    public static final int yj;
    public static final int yk;
    public static final ThreadLocal yl;
    public static Paint f21583z0;
    public static xj0 f21584z1;
    public static TextPaint f21585z2;
    public static Drawable f21586z3;
    public static Drawable f21587z4;
    public static final int f21588z5;
    public static final int f21589z6;
    public static final int f21590z7;
    public static final int f21591z8;
    public static final int f21592z9;
    public static final int f21593za;
    public static final int f21594zb;
    public static final int zc;
    public static final int f21595zd;
    public static final int f21596ze;
    public static final int f21597zf;
    public static final int f21598zg;
    public static final int f21599zh;
    public static final int zi;
    public static final int zj;
    public static final int zk;
    public static final ThreadLocal zl;
    public static final int f21119a = i0.a.o(-16777216, 27);
    public static final Object f21158c = new Object();
    public static float h = 1.0f;
    public static final androidx.emoji2.text.n f21323l = new androidx.emoji2.text.n(3);
    public static final androidx.emoji2.text.n f21341m = new androidx.emoji2.text.n(4);
    public static final int f21360n = 99;
    public static final Paint f21582z = new Paint(1);
    public static final boolean[] C = new boolean[4];
    public static final int[] D = new int[4];
    public static final long[] E = new long[4];
    public static final Drawable[] f21435r0 = new Drawable[25];
    public static final jx0[] f21497u3 = new jx0[6];
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
    public static final Path[] f21124a5 = new Path[3];

    static {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.<clinit>():void");
    }

    public static void A() {
        if (f21380o != 2) {
            if (f21304k) {
                f21304k = false;
                AndroidUtilities.cancelRunOnUIThread(f21341m);
            }
            if (f21284j) {
                f21284j = false;
                AndroidUtilities.cancelRunOnUIThread(f21323l);
            }
            if (f21230g) {
                h = 1.0f;
                e.unregisterListener(Hl, f21213f);
                f21230g = false;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("light sensor unregistered");
                }
            }
        }
    }

    public static android.graphics.drawable.Drawable A0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.A0():android.graphics.drawable.Drawable");
    }

    public static void A1(int i10, Drawable drawable) {
        z1(x0(null, i10, false), drawable);
    }

    public static int B(j6 j6Var, int i10, int i11) {
        int i12;
        if (i10 != 0 && (i12 = j6Var.X) != 0 && i10 != i12 && (!j6Var.S || j6Var.Y != f21360n)) {
            float[] O02 = O0(3);
            float[] O03 = O0(4);
            Color.colorToHSV(j6Var.X, O02);
            Color.colorToHSV(i10, O03);
            return D(O02, O03, i11, j6Var.q(), i11);
        }
        return i11;
    }

    public static String B0() {
        j6 j6Var = J;
        if (j6Var == null) {
            return "";
        }
        String n10 = j6Var.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            return n10.substring(0, n10.lastIndexOf(46));
        }
        return n10;
    }

    public static void B1(Drawable drawable, int i10, boolean z10) {
        Drawable N02;
        if (drawable instanceof StateListDrawable) {
            try {
                if (z10) {
                    N02 = N0(0, drawable);
                } else {
                    N02 = N0(1, drawable);
                }
                if (N02 instanceof ShapeDrawable) {
                    ((ShapeDrawable) N02).getPaint().setColor(i10);
                } else {
                    N02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static int C(boolean z10, int i10, int i11, int i12, int i13) {
        float[] O02 = O0(3);
        float[] O03 = O0(4);
        Color.colorToHSV(i10, O02);
        Color.colorToHSV(i11, O03);
        return D(O02, O03, i12, z10, i13);
    }

    public static j6 C0() {
        j6 j6Var = K;
        if (j6Var != null) {
            return j6Var;
        }
        return L;
    }

    public static void C1(org.telegram.ui.Cells.y yVar, float f10, float f11, float f12, float f13) {
        if (com.google.android.gms.internal.play_billing.k3.s(yVar)) {
            int numberOfLayers = yVar.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable = yVar.getDrawable(i10);
                if (drawable instanceof h6) {
                    h6 h6Var = (h6) drawable;
                    float[] fArr = h6Var.f20944b;
                    float dp = AndroidUtilities.dp(f10);
                    fArr[1] = dp;
                    fArr[0] = dp;
                    float dp2 = AndroidUtilities.dp(f11);
                    fArr[3] = dp2;
                    fArr[2] = dp2;
                    float dp3 = AndroidUtilities.dp(f12);
                    fArr[5] = dp3;
                    fArr[4] = dp3;
                    float dp4 = AndroidUtilities.dp(f13);
                    fArr[7] = dp4;
                    fArr[6] = dp4;
                    h6Var.f20945c = true;
                    h6Var.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static int D(float[] fArr, float[] fArr2, int i10, boolean z10, int i11) {
        int min;
        int min2;
        if (Gl == null) {
            Gl = new float[3];
        }
        float[] fArr3 = Gl;
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
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(i10);
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(HSVToColor);
        if (z10) {
            if (computePerceivedBrightness <= computePerceivedBrightness2) {
                return HSVToColor;
            }
        } else if (computePerceivedBrightness >= computePerceivedBrightness2) {
            return HSVToColor;
        }
        float B10 = a1.g.B(0.39999998f, computePerceivedBrightness, computePerceivedBrightness2, 0.6f);
        int red = (int) (Color.red(HSVToColor) * B10);
        int green = (int) (Color.green(HSVToColor) * B10);
        int blue = (int) (Color.blue(HSVToColor) * B10);
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

    public static int D0(int i10) {
        int indexOfKey = tl.indexOfKey(i10);
        if (indexOfKey < 0) {
            return 0;
        }
        int valueAt = tl.valueAt(indexOfKey);
        i6 k10 = I.k(false);
        if (k10 == null) {
            return 0;
        }
        float[] O02 = O0(1);
        float[] O03 = O0(2);
        Color.colorToHSV(I.X, O02);
        Color.colorToHSV(k10.f20967c, O03);
        return D(O02, O03, valueAt, I.q(), valueAt);
    }

    public static void D1(org.telegram.ui.Cells.y yVar, int i10, int i11) {
        if (com.google.android.gms.internal.play_billing.k3.s(yVar)) {
            int numberOfLayers = yVar.getNumberOfLayers();
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                Drawable drawable = yVar.getDrawable(i12);
                if (drawable instanceof h6) {
                    h6 h6Var = (h6) drawable;
                    float f10 = i10;
                    float f11 = i11;
                    float[] fArr = h6Var.f20944b;
                    float dp = AndroidUtilities.dp(f10);
                    fArr[3] = dp;
                    fArr[2] = dp;
                    fArr[1] = dp;
                    fArr[0] = dp;
                    float dp2 = AndroidUtilities.dp(f11);
                    fArr[7] = dp2;
                    fArr[6] = dp2;
                    fArr[5] = dp2;
                    fArr[4] = dp2;
                    h6Var.f20945c = true;
                    h6Var.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static void E(boolean z10) {
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
                if (f21304k) {
                    f21304k = false;
                    AndroidUtilities.cancelRunOnUIThread(f21341m);
                }
                if (f21284j) {
                    f21284j = false;
                    AndroidUtilities.cancelRunOnUIThread(f21323l);
                }
            }
            A();
            int p12 = p1();
            if (p12 != 0) {
                if (p12 == 2) {
                    z11 = true;
                }
                l(z11);
            }
            if (z10) {
                f21266i = 0L;
            }
        }
    }

    public static int E0(int i10) {
        int i11 = ql[i10];
        if (i11 == 0) {
            int i12 = rl.get(i10, -1);
            if (i12 != -1) {
                return E0(i12);
            }
            if ((i10 < f21593za || i10 >= Ga) && i10 != D9 && i10 != N9 && i10 != E9 && i10 != Pd && i10 != Qd) {
                return -65536;
            }
            return 0;
        }
        return i11;
    }

    public static boolean E1(Drawable drawable, int i10, boolean z10) {
        Drawable N02;
        boolean z11;
        boolean z12 = true;
        if (drawable instanceof StateListDrawable) {
            try {
                if (z10) {
                    Drawable N03 = N0(0, drawable);
                    if (N03 instanceof ShapeDrawable) {
                        if (((ShapeDrawable) N03).getPaint().getColor() == i10) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        try {
                            ((ShapeDrawable) N03).getPaint().setColor(i10);
                        } catch (Throwable unused) {
                            return z11;
                        }
                    } else {
                        N03.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        z11 = false;
                    }
                    N02 = N0(1, drawable);
                } else {
                    N02 = N0(2, drawable);
                    z11 = false;
                }
                if (N02 instanceof ShapeDrawable) {
                    if (((ShapeDrawable) N02).getPaint().getColor() == i10 && !z11) {
                        z12 = false;
                    }
                    try {
                        ((ShapeDrawable) N02).getPaint().setColor(i10);
                        return z12;
                    } catch (Throwable unused2) {
                        return z12;
                    }
                }
                N02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
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

    public static void F(boolean z10) {
        j6 j6Var;
        int i10;
        if (A == 0) {
            if (z10 || Math.abs((System.currentTimeMillis() / 1000) - B) >= 3600) {
                for (int i11 = 0; i11 < 2; i11++) {
                    if (i11 == 0) {
                        j6Var = K;
                    } else {
                        j6Var = J;
                    }
                    if (j6Var != null && UserConfig.getInstance(j6Var.E).isClientActivated()) {
                        i6 k10 = j6Var.k(false);
                        TLRPC.TL_theme tL_theme = j6Var.F;
                        if (tL_theme != null) {
                            i10 = j6Var.E;
                        } else if (k10 != null && (tL_theme = k10.f20979r) != null) {
                            i10 = UserConfig.selectedAccount;
                        }
                        if (tL_theme.document != null) {
                            A++;
                            TL_account.getTheme gettheme = new TL_account.getTheme();
                            gettheme.document_id = tL_theme.document.f20350id;
                            gettheme.format = "android";
                            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                            tL_inputTheme.access_hash = tL_theme.access_hash;
                            tL_inputTheme.f20415id = tL_theme.f20481id;
                            gettheme.theme = tL_inputTheme;
                            ConnectionsManager.getInstance(i10).sendRequest(gettheme, new ai.j2(k10, j6Var, tL_theme, 12));
                        }
                    }
                }
            }
        }
    }

    public static e20 F0() {
        if (Cl == null) {
            ?? obj = new Object();
            obj.f25929a = new d20[4];
            obj.f25936k = 1.0f;
            obj.f25937l = new ArrayList();
            obj.f25938m = new Paint(1);
            obj.f25939n = new Path();
            for (int i10 = 0; i10 < 4; i10++) {
                obj.f25929a[i10] = new d20(i10);
            }
            Cl = obj;
        }
        return Cl;
    }

    public static void F1(j6 j6Var, i6 i6Var, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
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
                if (j6Var == null) {
                    String r02 = r0(themeSettings);
                    if (r02 != null && (j6Var = (j6) hashMap.get(r02)) != null) {
                        i6Var = (i6) j6Var.f21025c0.get(tL_theme.f20481id);
                    } else {
                        return;
                    }
                }
                if (i6Var != null) {
                    TLRPC.TL_theme tL_theme2 = i6Var.f20979r;
                    if (tL_theme2 != null) {
                        j6Var.f21025c0.remove(tL_theme2.f20481id);
                    }
                    i6Var.f20979r = tL_theme;
                    i6Var.f20981t = i10;
                    j6Var.f21025c0.put(tL_theme.f20481id, i6Var);
                    if (!j6.a(i6Var, themeSettings)) {
                        File d10 = i6Var.d();
                        if (d10 != null) {
                            d10.delete();
                        }
                        j6.i(i6Var, themeSettings);
                        j6 j6Var2 = I;
                        if (j6Var2 == j6Var && j6Var2.Y == i6Var.f20965a) {
                            q1(false, false);
                            j6 j6Var3 = I;
                            if (J == j6Var3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            H1(j6Var3, z12, -1, null);
                        }
                        f6.a(true);
                    }
                    TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                    if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.motion) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i6Var.f20978q = z11;
                    j6Var.T = false;
                } else {
                    return;
                }
            } else {
                if (j6Var != null) {
                    str = j6Var.m();
                    hashMap.remove(str);
                } else {
                    str = "remote" + tL_theme.f20481id;
                    j6Var = (j6) hashMap.get(str);
                }
                if (j6Var == null) {
                    return;
                }
                j6Var.F = tL_theme;
                j6Var.f21020a = tL_theme.title;
                File file = new File(j6Var.f21022b);
                File file2 = new File(ApplicationLoader.getFilesDirFixed(), si.o0.u(str, ".attheme"));
                if (!file.equals(file2)) {
                    try {
                        AndroidUtilities.copyFile(file, file2);
                        j6Var.f21022b = file2.getAbsolutePath();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (z10) {
                    j6Var.G = false;
                    j6Var.f21030g0 = null;
                    j6Var.f21031h0 = null;
                    NotificationCenter.getInstance(j6Var.E).addObserver(j6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(j6Var.E).addObserver(j6Var, NotificationCenter.fileLoadFailed);
                    FileLoader fileLoader = FileLoader.getInstance(j6Var.E);
                    TLRPC.TL_theme tL_theme3 = j6Var.F;
                    fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                } else {
                    j6Var.T = false;
                }
                hashMap.put(j6Var.m(), j6Var);
            }
            v1(true, false);
        }
    }

    public static void G(SparseIntArray sparseIntArray, j6 j6Var) {
        if (j6Var != null && j6Var.f21033j0 == -1) {
            int i10 = f21184d6;
            if (i0.a.h(i0.a.f(0.5f, H0(sparseIntArray, i10), H0(sparseIntArray, i10))) < 0.5d) {
                j6Var.f21033j0 = 1;
            } else {
                j6Var.f21033j0 = 0;
            }
        }
    }

    public static int G0(int i10) {
        return x0(null, i10, true);
    }

    public static void G1(j6 j6Var) {
        Collections.sort(j6Var.f21023b0, new l4(3));
    }

    public static com.google.android.gms.internal.cast.z5 H(j6 j6Var, SparseIntArray sparseIntArray, String str, int i10, boolean z10) {
        boolean z11;
        File file;
        boolean z12;
        float f10;
        float f11;
        if (j6Var.S && j6Var.Y == f21360n) {
            z11 = true;
        } else {
            z11 = false;
        }
        i6 k10 = j6Var.k(false);
        if (k10 != null) {
            file = k10.d();
        } else {
            file = null;
        }
        if (k10 != null && k10.f20978q) {
            z12 = true;
        } else {
            z12 = false;
        }
        d6 d6Var = j6Var.f21032i0;
        if (d6Var != null) {
            f11 = d6Var.f20823k;
        } else if (k10 != null) {
            f11 = k10.f20977p;
        } else {
            f10 = j6Var.f21039y;
            return I(j6Var, d6Var, sparseIntArray, file, str, tl.get(f21236g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
        }
        f10 = f11 * 100.0f;
        return I(j6Var, d6Var, sparseIntArray, file, str, tl.get(f21236g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
    }

    public static int H0(SparseIntArray sparseIntArray, int i10) {
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return ql[i10];
    }

    public static void H1(j6 j6Var, boolean z10, int i10, View view) {
        int[] iArr = new int[2];
        if (view != null && view.isAttachedToWindow()) {
            view.getLocationInWindow(iArr);
            iArr[0] = (view.getMeasuredWidth() / 2) + iArr[0];
            iArr[1] = (view.getMeasuredHeight() / 2) + iArr[1];
        } else {
            iArr[0] = AndroidUtilities.displaySize.x / 2;
            iArr[1] = 0;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j6Var, Boolean.valueOf(z10), iArr, Integer.valueOf(i10), Boolean.TRUE, null);
    }

    public static com.google.android.gms.internal.cast.z5 I(org.telegram.ui.ActionBar.j6 r24, org.telegram.ui.ActionBar.d6 r25, android.util.SparseIntArray r26, java.io.File r27, java.lang.String r28, int r29, int r30, int r31, boolean r32, boolean r33, boolean r34, boolean r35, org.telegram.tgnet.TLRPC.Document r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.I(org.telegram.ui.ActionBar.j6, org.telegram.ui.ActionBar.d6, android.util.SparseIntArray, java.io.File, java.lang.String, int, int, int, boolean, boolean, boolean, boolean, org.telegram.tgnet.TLRPC$Document, boolean):com.google.android.gms.internal.cast.z5");
    }

    public static org.telegram.ui.Cells.y I0(int i10, int i11) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i11 & 16777215) | 419430400}), null, c0(i10, -1));
    }

    public static int I1(SparseIntArray sparseIntArray) {
        int i10 = Ea;
        int i11 = Fa;
        int i12 = Aa;
        int[] iArr = {i12, Da, i10, i11};
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = iArr[i17];
            if (i18 == i12 || sparseIntArray.indexOfKey(i18) >= 0) {
                int i19 = sparseIntArray.get(i18, ql[i18]);
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

    public static void J(Context context, boolean z10) {
        float f10;
        float f11;
        float f12;
        TextPaint textPaint;
        float f13;
        Drawable[] drawableArr;
        O();
        if (!z10 && f21344m3 == null) {
            Resources resources = context.getResources();
            f21253h3 = resources.getDrawable(R.drawable.video_muted);
            f21326l3 = resources.getDrawable(R.drawable.media_live_on).mutate();
            f21344m3 = new j5(0, false, false, null);
            f21364n3 = new j5(0, false, true, null);
            f21384o3 = new j5(0, true, false, null);
            f21402p3 = new j5(0, true, true, null);
            f21419q3 = new j5(1, false, false, null);
            f21438r3 = new j5(1, false, true, null);
            f21458s3 = new j5(1, true, false, null);
            f21477t3 = new j5(1, true, true, null);
            ?? obj = new Object();
            obj.f31102a = new Path();
            obj.f31103b = -1.0f;
            obj.f31106g = new ArrayList();
            obj.f31104c = 0.293f;
            obj.d = -26.0f;
            obj.e = -28.0f;
            obj.f31105f = 1.0f;
            f21551x3 = obj;
            obj.a("M 34.141 16.042 C 37.384 17.921 40.886 20.001 44.211 21.965 C 46.139 23.104 49.285 24.729 49.586 25.917 C 50.289 28.687 48.484 30 46.274 30 L 6 30.021 C 3.79 30.021 2.075 30.023 2 26.021 L 2.009 3.417 C 2.009 0.417 5.326 -0.58 7.068 0.417 C 10.545 2.406 25.024 10.761 34.141 16.042 Z", 166.0f);
            f21551x3.a("M 37.843 17.769 C 41.143 19.508 44.131 21.164 47.429 23.117 C 48.542 23.775 49.623 24.561 49.761 25.993 C 50.074 28.708 48.557 30 46.347 30 L 6 30.012 C 3.79 30.012 2 28.222 2 26.012 L 2.009 4.609 C 2.009 1.626 5.276 0.664 7.074 1.541 C 10.608 3.309 28.488 12.842 37.843 17.769 Z", 200.0f);
            f21551x3.a("M 40.644 18.756 C 43.986 20.389 49.867 23.108 49.884 25.534 C 49.897 27.154 49.88 24.441 49.894 26.059 C 49.911 28.733 48.6 30 46.39 30 L 6 30.013 C 3.79 30.013 2 28.223 2 26.013 L 2.008 5.52 C 2.008 2.55 5.237 1.614 7.079 2.401 C 10.656 4 31.106 14.097 40.644 18.756 Z", 217.0f);
            f21551x3.a("M 43.782 19.218 C 47.117 20.675 50.075 21.538 50.041 24.796 C 50.022 26.606 50.038 24.309 50.039 26.104 C 50.038 28.736 48.663 30 46.453 30 L 6 29.986 C 3.79 29.986 2 28.196 2 25.986 L 2.008 6.491 C 2.008 3.535 5.196 2.627 7.085 3.316 C 10.708 4.731 33.992 14.944 43.782 19.218 Z", 234.0f);
            f21551x3.a("M 47.421 16.941 C 50.544 18.191 50.783 19.91 50.769 22.706 C 50.761 24.484 50.76 23.953 50.79 26.073 C 50.814 27.835 49.334 30 47.124 30 L 5 30.01 C 2.79 30.01 1 28.22 1 26.01 L 1.001 10.823 C 1.001 8.218 3.532 6.895 5.572 7.26 C 7.493 8.01 47.421 16.941 47.421 16.941 Z", 267.0f);
            f21551x3.a("M 47.641 17.125 C 50.641 18.207 51.09 19.935 51.078 22.653 C 51.07 24.191 51.062 21.23 51.088 23.063 C 51.109 24.886 49.587 27 47.377 27 L 5 27.009 C 2.79 27.009 1 25.219 1 23.009 L 0.983 11.459 C 0.983 8.908 3.414 7.522 5.476 7.838 C 7.138 8.486 47.641 17.125 47.641 17.125 Z", 300.0f);
            f21551x3.a("M 48 7 C 50.21 7 52 8.79 52 11 C 52 19 52 19 52 19 C 52 21.21 50.21 23 48 23 L 4 23 C 1.79 23 0 21.21 0 19 L 0 11 C 0 8.79 1.79 7 4 7 C 48 7 48 7 48 7 Z", 383.0f);
            y3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            f21586z3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            A3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            B3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            F3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            H3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            C3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            D3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            G3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            I3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            E3 = new dd0();
            L3 = resources.getDrawable(R.drawable.ic_lock_header).mutate();
            M3 = resources.getDrawable(R.drawable.msg_views).mutate();
            N3 = resources.getDrawable(R.drawable.msg_views).mutate();
            O3 = resources.getDrawable(R.drawable.msg_views).mutate();
            P3 = resources.getDrawable(R.drawable.msg_views).mutate();
            Q3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            R3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            S3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            T3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            U3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            V3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            W3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            X3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            Z3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            Y3 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            f21123a4 = resources.getDrawable(R.drawable.msg_views).mutate();
            f21143b4 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            J3 = resources.getDrawable(R.drawable.msg_views).mutate();
            K3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            f21163c4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f21182d4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f21199e4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f21218f4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f21235g4 = resources.getDrawable(R.drawable.video_actions);
            f21254h4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            f21271i4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            f21289j4 = resources.getDrawable(R.drawable.msg_warning);
            f21309k4 = resources.getDrawable(R.drawable.list_mute).mutate();
            l4 = resources.getDrawable(R.drawable.ic_lock_header);
            Drawable mutate = resources.getDrawable(R.drawable.chat_calls_voice).mutate();
            Drawable[] drawableArr2 = G4;
            drawableArr2[0] = mutate;
            Drawable mutate2 = resources.getDrawable(R.drawable.chat_calls_voice).mutate();
            Drawable[] drawableArr3 = H4;
            drawableArr3[0] = mutate2;
            Drawable mutate3 = resources.getDrawable(R.drawable.chat_calls_voice).mutate();
            Drawable[] drawableArr4 = I4;
            drawableArr4[0] = mutate3;
            Drawable mutate4 = resources.getDrawable(R.drawable.chat_calls_voice).mutate();
            Drawable[] drawableArr5 = J4;
            drawableArr5[0] = mutate4;
            drawableArr2[1] = resources.getDrawable(R.drawable.chat_calls_video).mutate();
            drawableArr3[1] = resources.getDrawable(R.drawable.chat_calls_video).mutate();
            drawableArr4[1] = resources.getDrawable(R.drawable.chat_calls_video).mutate();
            drawableArr5[1] = resources.getDrawable(R.drawable.chat_calls_video).mutate();
            O4 = resources.getDrawable(R.drawable.chat_calls_outgoing).mutate();
            P4 = resources.getDrawable(R.drawable.chat_calls_incoming).mutate();
            Q4 = resources.getDrawable(R.drawable.chat_calls_incoming).mutate();
            int i10 = 0;
            while (true) {
                drawableArr = M4;
                if (i10 >= 2) {
                    break;
                }
                K4[i10] = resources.getDrawable(R.drawable.poll_right).mutate();
                L4[i10] = resources.getDrawable(R.drawable.poll_wrong).mutate();
                drawableArr[i10] = resources.getDrawable(R.drawable.msg_emoji_objects).mutate();
                N4[i10] = resources.getDrawable(R.drawable.msg_psa).mutate();
                i10++;
            }
            V4 = resources.getDrawable(R.drawable.mini_call_out_16).mutate();
            W4 = resources.getDrawable(R.drawable.mini_call_out_16).mutate();
            X4 = resources.getDrawable(R.drawable.mini_call_in_16).mutate();
            Y4 = resources.getDrawable(R.drawable.mini_call_in_16).mutate();
            f21345m4 = resources.getDrawable(R.drawable.bot_file);
            f21365n4 = resources.getDrawable(R.drawable.bot_music);
            f21385o4 = resources.getDrawable(R.drawable.bot_location);
            f21515v4 = resources.getDrawable(R.drawable.bot_link);
            f21552x4 = resources.getDrawable(R.drawable.bot_lines);
            f21534w4 = resources.getDrawable(R.drawable.bot_card);
            f21570y4 = resources.getDrawable(R.drawable.bot_webview);
            f21587z4 = resources.getDrawable(R.drawable.bot_invite);
            A4 = resources.getDrawable(R.drawable.permission_locked);
            B4 = resources.getDrawable(R.drawable.msg_msgbubble);
            C4 = resources.getDrawable(R.drawable.msg_msgbubble2);
            D4 = resources.getDrawable(R.drawable.msg_arrowright);
            E4 = resources.getDrawable(R.drawable.gradient_left);
            F4 = resources.getDrawable(R.drawable.gradient_right);
            f21403p4 = resources.getDrawable(R.drawable.header_shadow).mutate();
            R4 = resources.getDrawable(R.drawable.nophotos3);
            f21420q4 = resources.getDrawable(R.drawable.filled_button_share).mutate();
            f21439r4 = resources.getDrawable(R.drawable.filled_button_reply);
            f21459s4 = resources.getDrawable(R.drawable.msg_voiceclose).mutate();
            f21478t4 = resources.getDrawable(R.drawable.media_more).mutate();
            f21498u4 = resources.getDrawable(R.drawable.filled_open_message);
            int dp = AndroidUtilities.dp(2.0f);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = Z4;
            pathArr[0] = path;
            f10 = 1.0f;
            path.moveTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(3.0f));
            pathArr[0].lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
            pathArr[0].lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
            pathArr[0].lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(20.0f));
            int i11 = dp * 2;
            f11 = 14.0f;
            f12 = 3.0f;
            rectF.set(AndroidUtilities.dp(21.0f) - i11, AndroidUtilities.dp(19.0f) - dp, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(19.0f) + dp);
            pathArr[0].arcTo(rectF, 0.0f, 90.0f, false);
            pathArr[0].lineTo(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f));
            rectF.set(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(19.0f) - dp, AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp(19.0f) + dp);
            pathArr[0].arcTo(rectF, 90.0f, 90.0f, false);
            pathArr[0].lineTo(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f));
            rectF.set(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp(3.0f) + i11);
            pathArr[0].arcTo(rectF, 180.0f, 90.0f, false);
            pathArr[0].close();
            Path path2 = new Path();
            pathArr[1] = path2;
            path2.moveTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(5.0f));
            pathArr[1].lineTo(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(10.0f));
            pathArr[1].lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f));
            pathArr[1].close();
            f21144b5 = resources.getDrawable(R.drawable.filled_fire).mutate();
            f21164c5 = resources.getDrawable(R.drawable.msg_round_gif_m).mutate();
            Drawable[][] drawableArr6 = U4;
            drawableArr6[0][0] = M(AndroidUtilities.dp(44.0f), R.drawable.msg_round_play_m);
            drawableArr6[0][1] = M(AndroidUtilities.dp(44.0f), R.drawable.msg_round_play_m);
            drawableArr6[1][0] = M(AndroidUtilities.dp(44.0f), R.drawable.msg_round_pause_m);
            drawableArr6[1][1] = M(AndroidUtilities.dp(44.0f), R.drawable.msg_round_pause_m);
            drawableArr6[2][0] = M(AndroidUtilities.dp(44.0f), R.drawable.msg_round_load_m);
            drawableArr6[2][1] = M(AndroidUtilities.dp(44.0f), R.drawable.msg_round_load_m);
            drawableArr6[3][0] = M(AndroidUtilities.dp(44.0f), R.drawable.msg_round_file_s);
            drawableArr6[3][1] = M(AndroidUtilities.dp(44.0f), R.drawable.msg_round_file_s);
            drawableArr6[4][0] = M(AndroidUtilities.dp(44.0f), R.drawable.msg_round_cancel_m);
            drawableArr6[4][1] = M(AndroidUtilities.dp(44.0f), R.drawable.msg_round_cancel_m);
            wq M10 = M(AndroidUtilities.dp(44.0f), R.drawable.msg_contact);
            Drawable[] drawableArr7 = T4;
            drawableArr7[0] = M10;
            drawableArr7[1] = M(AndroidUtilities.dp(44.0f), R.drawable.msg_contact);
            Drawable mutate5 = resources.getDrawable(R.drawable.msg_location).mutate();
            Drawable[] drawableArr8 = S4;
            drawableArr8[0] = mutate5;
            drawableArr8[1] = resources.getDrawable(R.drawable.msg_location).mutate();
            f21270i3 = context.getResources().getDrawable(R.drawable.compose_panel_shadow).mutate();
            f21288j3 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            l5 l5Var = new l5(0);
            Paint paint = new Paint(1);
            l5Var.f21609b = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
            f21308k3 = l5Var;
            ml.clear();
            nl.clear();
            Drawable drawable = f21552x4;
            int i12 = f21317kc;
            d(i12, "drawableBotInline", drawable);
            d(i12, "drawableBotWebView", f21570y4);
            d(i12, "drawableBotLock", A4);
            d(i12, "drawableBotLink", f21515v4);
            d(i12, "drawable_botInvite", f21587z4);
            d(i12, "drawableGoIcon", f21498u4);
            d(i12, "drawableCommentSticker", C4);
            d(Gc, "drawableMsgError", f21289j4);
            d(-1, "drawableMsgIn", f21344m3);
            d(-1, "drawableMsgInSelected", f21364n3);
            d(-1, "drawableMsgInMedia", f21419q3);
            d(-1, "drawableMsgInMediaSelected", f21438r3);
            d(Dc, "drawableMsgInInstant", f21254h4);
            d(-1, "drawableMsgOut", f21384o3);
            d(-1, "drawableMsgOutSelected", f21402p3);
            d(-1, "drawableMsgOutMedia", f21458s3);
            d(-1, "drawableMsgOutMediaSelected", f21477t3);
            Drawable drawable2 = drawableArr4[0];
            int i13 = Va;
            d(i13, "drawableMsgOutCallAudio", drawable2);
            Drawable drawable3 = drawableArr5[0];
            int i14 = Wa;
            d(i14, "drawableMsgOutCallAudioSelected", drawable3);
            d(i13, "drawableMsgOutCallVideo", drawableArr4[1]);
            d(i14, "drawableMsgOutCallVideo", drawableArr5[1]);
            d(Ja, "drawableMsgOutCheck", y3);
            d(Ka, "drawableMsgOutCheckSelected", f21586z3);
            Drawable drawable4 = A3;
            int i15 = La;
            d(i15, "drawableMsgOutCheckRead", drawable4);
            Drawable drawable5 = B3;
            int i16 = Ma;
            d(i16, "drawableMsgOutCheckReadSelected", drawable5);
            d(i15, "drawableMsgOutHalfCheck", C3);
            d(i16, "drawableMsgOutHalfCheckSelected", D3);
            d(i13, "drawableMsgOutInstant", f21271i4);
            d(Ta, "drawableMsgOutMenu", f21199e4);
            d(Ua, "drawableMsgOutMenuSelected", f21218f4);
            Drawable drawable6 = W3;
            int i17 = Ra;
            d(i17, "drawableMsgOutPinned", drawable6);
            Drawable drawable7 = X3;
            int i18 = Sa;
            d(i18, "drawableMsgOutPinnedSelected", drawable7);
            d(i17, "drawableMsgOutReplies", S3);
            d(i18, "drawableMsgOutReplies", T3);
            d(i17, "drawableMsgOutViews", O3);
            d(i18, "drawableMsgOutViewsSelected", P3);
            Drawable drawable8 = H3;
            int i19 = f21278ic;
            d(i19, "drawableMsgStickerCheck", drawable8);
            d(i19, "drawableMsgStickerHalfCheck", I3);
            d(i19, "drawableMsgStickerPinned", Y3);
            d(i19, "drawableMsgStickerReplies", K3);
            d(i19, "drawableMsgStickerViews", J3);
            d(i12, "drawableReplyIcon", f21439r4);
            d(i12, "drawableCloseIcon", f21459s4);
            d(i12, "drawableMoreIcon", f21478t4);
            d(i12, "drawableShareIcon", f21420q4);
            d(oc, "drawableMuteIcon", f21309k4);
            d(f21409pc, "drawableLockIcon", l4);
            d(Xa, "drawable_chat_pollHintDrawableOut", drawableArr[1]);
            d(Kc, "drawable_chat_pollHintDrawableIn", drawableArr[0]);
            j(z10, false);
        } else {
            f10 = 1.0f;
            f11 = 14.0f;
            f12 = 3.0f;
        }
        if (!z10 && (textPaint = C2) != null) {
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            D2.setTextSize(AndroidUtilities.dp(12.0f));
            E2.setTextSize(AndroidUtilities.dp(11.0f));
            G2.setTextSize(AndroidUtilities.dp(15.0f));
            H2.setTextSize(AndroidUtilities.dp(15.0f));
            I2.setTextSize(AndroidUtilities.dp(13.0f));
            N2.setTextSize(AndroidUtilities.dp(12.0f));
            F2.setTextSize(AndroidUtilities.dp(12.0f));
            O2.setTextSize(AndroidUtilities.dp(16.0f));
            P2.setTextSize(AndroidUtilities.dp(15.0f));
            Q2.setTextSize(AndroidUtilities.dp(15.0f));
            R2.setTextSize(AndroidUtilities.dp(15.0f));
            S2.setTextSize(AndroidUtilities.dp(13.0f));
            J2.setTextSize(AndroidUtilities.dp(12.0f));
            W2.setTextSize(AndroidUtilities.dp(f13));
            Y2.setTextSize(AndroidUtilities.dp(f13));
            Z2.setTextSize(AndroidUtilities.dp(f13));
            float f14 = (((SharedConfig.fontSize * 2) + 10) / f12) - f10;
            f21181d3.setTextSize(AndroidUtilities.dp(f14));
            X2.setTextSize(AndroidUtilities.dp(f13));
            U2.setTextSize(AndroidUtilities.dp(f14));
            V2.setTextSize(AndroidUtilities.dp(12.0f));
            T2.setTextSize(AndroidUtilities.dp(12.0f));
            K2.setTextSize(AndroidUtilities.dp(13.0f));
            L2.setTextSize(AndroidUtilities.dp(13.0f));
            M2.setTextSize(AndroidUtilities.dp(13.0f));
            X1.setStrokeWidth(AndroidUtilities.dp(f10));
            Z1.setStrokeWidth(AndroidUtilities.dp(1.1f));
            f21457s2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            f21476t2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            f21496u2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 3));
            f21513v2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize)));
            f21217f3.setTextSize(AndroidUtilities.dp(15.0f));
            f21234g3.setTextSize(AndroidUtilities.dp(13.0f));
            f21307k2.setStrokeWidth(AndroidUtilities.dp(f12));
            f21325l2.setStrokeWidth(AndroidUtilities.dp(2.33f));
            f21198e3.setTextSize(AndroidUtilities.dp(f11));
            f21198e3.setTypeface(AndroidUtilities.bold());
        }
    }

    public static String J0() {
        d6 d6Var = I.f21032i0;
        if (d6Var != null) {
            return d6Var.f20818c;
        }
        if (f1()) {
            return "t";
        }
        return "d";
    }

    public static void J1(o2 o2Var) {
        String string;
        if (f21380o != 0) {
            if (o2Var != null) {
                try {
                    vc a02 = vc.a0(o2Var);
                    int i10 = R.raw.auto_night_off;
                    if (f21380o == 3) {
                        string = LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff);
                    } else {
                        string = LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff);
                    }
                    a02.I(i10, string, LocaleController.getString("Settings", R.string.Settings), 5000, false, new p(o2Var, 17)).j();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            f21380o = 0;
            t1();
            A();
        }
    }

    public static ShapeDrawable K(int i10, int i11) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(i10);
        shapeDrawable.setIntrinsicHeight(i10);
        shapeDrawable.getPaint().setColor(i11);
        return shapeDrawable;
    }

    public static org.telegram.ui.Cells.y K0(int i10, int i11, g6 g6Var) {
        if (i11 >= 0) {
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), new ColorDrawable(w0(i11, g6Var)), new ColorDrawable(-1));
        }
        return g0(i10, 2, -1);
    }

    public static void K1(MessageObject messageObject) {
        j8 j8Var = f21183d5;
        if (j8Var == null) {
            return;
        }
        if (j8Var.f27609i != null && messageObject != null) {
            if (f21200e5 == null) {
                f21200e5 = new HashMap();
            }
            f21200e5.put(messageObject, f21183d5);
            f21183d5.e(false, true, null);
            AndroidUtilities.runOnUIThread(new p(messageObject, 18), 200L);
            f21183d5 = null;
            return;
        }
        j8Var.f27609i = null;
    }

    public static ShapeDrawable L(int i10, int i11, int i12) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(i10);
        shapeDrawable.setIntrinsicHeight(i10);
        shapeDrawable.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, i11, i12, Shader.TileMode.CLAMP));
        return shapeDrawable;
    }

    public static org.telegram.ui.Cells.y L0(g6 g6Var, boolean z10) {
        int w02 = w0(f21273i6, g6Var);
        if (z10) {
            return K0(w02, f21184d6, g6Var);
        }
        return g0(w02, 2, -1);
    }

    public static wq M(int i10, int i11) {
        Drawable drawable;
        if (i11 != 0) {
            drawable = ApplicationLoader.applicationContext.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(-1);
        wq wqVar = new wq(shapeDrawable, drawable);
        wqVar.h = i10;
        wqVar.f32326n = i10;
        return wqVar;
    }

    public static org.telegram.ui.Cells.y M0(boolean z10) {
        int x02 = x0(null, f21273i6, false);
        if (z10) {
            return K0(x02, f21184d6, null);
        }
        return g0(x02, 2, -1);
    }

    public static org.telegram.ui.Cells.y N(int i10, int i11, int i12) {
        f21582z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new q5(i11, i12));
    }

    public static Drawable N0(int i10, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29 && (drawable instanceof StateListDrawable)) {
            return ((StateListDrawable) drawable).getStateDrawable(i10);
        }
        if (El == null) {
            try {
                El = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
            } catch (Throwable unused) {
            }
        }
        Method method = El;
        if (method != null) {
            try {
                return (Drawable) method.invoke(drawable, Integer.valueOf(i10));
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }

    public static void O() {
        P();
        if (C2 == null) {
            C2 = new TextPaint(1);
            TextPaint textPaint = new TextPaint(1);
            D2 = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint2 = new TextPaint(1);
            E2 = textPaint2;
            textPaint2.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = new TextPaint(1);
            G2 = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            S1 = new Paint(1);
            Paint paint = new Paint(1);
            T1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = T1;
            Paint.Cap cap = Paint.Cap.ROUND;
            paint2.setStrokeCap(cap);
            TextPaint textPaint4 = new TextPaint(1);
            H2 = textPaint4;
            textPaint4.setTypeface(AndroidUtilities.bold());
            I2 = new TextPaint(1);
            Paint paint3 = new Paint();
            U1 = paint3;
            paint3.setPathEffect(q90.c());
            Paint paint4 = new Paint();
            V1 = paint4;
            paint4.setPathEffect(q90.c());
            Paint paint5 = new Paint();
            W1 = paint5;
            paint5.setPathEffect(q90.c());
            Paint paint6 = new Paint(1);
            f21307k2 = paint6;
            paint6.setStrokeCap(cap);
            f21307k2.setStyle(style);
            f21307k2.setColor(-1610612737);
            Paint paint7 = new Paint(1);
            f21325l2 = paint7;
            paint7.setStrokeCap(cap);
            f21325l2.setStyle(style);
            N2 = new TextPaint(1);
            TextPaint textPaint5 = new TextPaint(1);
            F2 = textPaint5;
            textPaint5.setTypeface(Typeface.DEFAULT_BOLD);
            TextPaint textPaint6 = new TextPaint(1);
            O2 = textPaint6;
            textPaint6.setTypeface(AndroidUtilities.bold());
            P2 = new TextPaint(1);
            TextPaint textPaint7 = new TextPaint(1);
            Q2 = textPaint7;
            textPaint7.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint8 = new TextPaint(1);
            R2 = textPaint8;
            textPaint8.setTypeface(AndroidUtilities.bold());
            S2 = new TextPaint(1);
            J2 = new TextPaint(1);
            TextPaint textPaint9 = new TextPaint(1);
            K2 = textPaint9;
            textPaint9.setTypeface(AndroidUtilities.bold());
            L2 = new TextPaint(1);
            T2 = new TextPaint(1);
            U2 = new TextPaint(1);
            V2 = new TextPaint(1);
            TextPaint textPaint10 = new TextPaint(1);
            W2 = textPaint10;
            textPaint10.setTypeface(AndroidUtilities.bold());
            X2 = new TextPaint(1);
            TextPaint textPaint11 = new TextPaint(1);
            Y2 = textPaint11;
            textPaint11.setTypeface(AndroidUtilities.bold());
            Z2 = new TextPaint(1);
            TextPaint textPaint12 = new TextPaint(1);
            f21181d3 = textPaint12;
            textPaint12.setTypeface(AndroidUtilities.bold());
            f21162c3 = new TextPaint(1);
            f21198e3 = new TextPaint(1);
            TextPaint textPaint13 = new TextPaint(1);
            M2 = textPaint13;
            textPaint13.setTypeface(AndroidUtilities.bold());
            Paint paint8 = new Paint(1);
            X1 = paint8;
            paint8.setStyle(style);
            X1.setStrokeCap(cap);
            Y1 = new Paint(1);
            Paint paint9 = new Paint(1);
            Z1 = paint9;
            paint9.setStyle(style);
            Z1.setStrokeCap(cap);
            a2 = new Paint(1);
            f21141b2 = new Paint(1);
            f21161c2 = new Paint(1);
            Paint paint10 = new Paint(1);
            f21180d2 = paint10;
            paint10.setStyle(style);
            f21180d2.setStrokeCap(cap);
            f21457s2 = new TextPaint(1);
            f21476t2 = new TextPaint(1);
            f21496u2 = new TextPaint(1);
            f21457s2.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint14 = new TextPaint(1);
            f21513v2 = textPaint14;
            textPaint14.setTypeface(AndroidUtilities.bold());
            Paint paint11 = new Paint(1);
            f21252h2 = paint11;
            paint11.setColor(352321536);
            f21269i2 = new Paint(1);
            TextPaint textPaint15 = new TextPaint(1);
            f21217f3 = textPaint15;
            textPaint15.setTypeface(AndroidUtilities.bold());
            f21234g3 = new TextPaint(1);
            f21287j2 = new Paint();
            new Paint(1);
            f21343m2 = new Paint(1);
            f21363n2 = new Paint(1);
            f21197e2 = new Paint(1);
            f21216f2 = new Paint(7);
            f21233g2 = new Paint(7);
            e(Hc, f21197e2, "paintChatMessageBackgroundSelected");
            Paint paint12 = f21216f2;
            int i10 = f21334lc;
            e(i10, paint12, "paintChatActionBackground");
            e(i10, f21252h2, "paintChatActionBackgroundDarken");
            e(f21353mc, f21233g2, "paintChatActionBackgroundSelected");
            TextPaint textPaint16 = f21457s2;
            int i11 = f21278ic;
            e(i11, textPaint16, "paintChatActionText");
            e(i11, f21476t2, "paintChatActionText2");
            e(i11, f21496u2, "paintChatActionText3");
            e(Nc, Q2, "paintChatBotButton");
            e(Sd, f21287j2, "paintChatComposeBackground");
            e(f21541wc, f21269i2, "paintChatTimeBackground");
        }
    }

    public static float[] O0(int i10) {
        ThreadLocal threadLocal;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        threadLocal = Bl;
                    } else {
                        threadLocal = Al;
                    }
                } else {
                    threadLocal = zl;
                }
            } else {
                threadLocal = yl;
            }
        } else {
            threadLocal = xl;
        }
        float[] fArr = (float[]) threadLocal.get();
        if (fArr == null) {
            float[] fArr2 = new float[3];
            threadLocal.set(fArr2);
            return fArr2;
        }
        return fArr;
    }

    public static void P() {
        synchronized (f21158c) {
            try {
                if (f21383o2 == null) {
                    f21383o2 = new TextPaint(1);
                    f21550x2 = new TextPaint(1);
                    f21569y2 = new TextPaint[6];
                    f21585z2 = new TextPaint(1);
                    A2 = new TextPaint(1);
                    B2 = new TextPaint(1);
                    TextPaint textPaint = new TextPaint(1);
                    f21532w2 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint2 = new TextPaint(1);
                    W2 = textPaint2;
                    textPaint2.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint3 = new TextPaint(1);
                    Y2 = textPaint3;
                    textPaint3.setTypeface(AndroidUtilities.bold());
                    Z2 = new TextPaint(1);
                    f21122a3 = new TextPaint(1);
                    f21142b3 = new TextPaint(1);
                    f21162c3 = new TextPaint(1);
                    TextPaint textPaint4 = new TextPaint(1);
                    f21181d3 = textPaint4;
                    textPaint4.setTypeface(AndroidUtilities.bold());
                    X2 = new TextPaint(1);
                    U2 = new TextPaint(1);
                    T2 = new TextPaint(1);
                    TextPaint textPaint5 = new TextPaint(1);
                    f21401p2 = textPaint5;
                    Typeface typeface = Typeface.MONOSPACE;
                    textPaint5.setTypeface(typeface);
                    TextPaint textPaint6 = new TextPaint(1);
                    f21418q2 = textPaint6;
                    textPaint6.setTypeface(typeface);
                    TextPaint textPaint7 = new TextPaint(1);
                    f21437r2 = textPaint7;
                    textPaint7.setTypeface(typeface);
                    new TextPaint(1);
                    V2 = new TextPaint(1);
                }
                float[] fArr = {0.68f, 0.46f, 0.34f, 0.28f, 0.22f, 0.19f};
                int i10 = 0;
                while (true) {
                    TextPaint[] textPaintArr = f21569y2;
                    if (i10 < textPaintArr.length) {
                        textPaintArr[i10] = new TextPaint(1);
                        f21569y2[i10].setTextSize(AndroidUtilities.dp(fArr[i10] * 120.0f));
                        i10++;
                    } else {
                        f21585z2.setTextSize(AndroidUtilities.dp(46.0f));
                        A2.setTextSize(AndroidUtilities.dp(38.0f));
                        B2.setTextSize(AndroidUtilities.dp(30.0f));
                        f21383o2.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
                        f21550x2.setTextSize(AndroidUtilities.dp(14.0f));
                        f21532w2.setTextSize(AndroidUtilities.dp(15.0f));
                        float f10 = ((SharedConfig.fontSize * 2) + 10) / 3.0f;
                        W2.setTextSize(AndroidUtilities.dp(f10));
                        Y2.setTextSize(AndroidUtilities.dp(f10));
                        Z2.setTextSize(AndroidUtilities.dp(f10));
                        float f11 = f10 - 1.0f;
                        f21122a3.setTextSize(AndroidUtilities.dp(f11));
                        f21142b3.setTextSize(AndroidUtilities.dp(f10));
                        V2.setTextSize(AndroidUtilities.dp(12.0f));
                        f21181d3.setTextSize(AndroidUtilities.dp(f11));
                        f21162c3.setTextSize(AndroidUtilities.dp(f10 - 2.0f));
                        X2.setTextSize(AndroidUtilities.dp(f10));
                        U2.setTextSize(AndroidUtilities.dp(f11));
                        f21401p2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 1), SharedConfig.fontSize - 2)));
                        f21418q2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 3)));
                        f21437r2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 5)));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static j6 P0(String str) {
        return (j6) H.get(str);
    }

    public static void Q(Context context) {
        if (f21305k0 == null) {
            Paint paint = new Paint();
            f21305k0 = paint;
            paint.setStrokeWidth(1.0f);
            Paint paint2 = new Paint();
            f21324l0 = paint2;
            paint2.setStrokeWidth(1.0f);
            f21416q0 = new Paint(1);
            Paint paint3 = new Paint(1);
            f21381o0 = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            f21381o0.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f21381o0.setStrokeCap(Paint.Cap.ROUND);
            Paint paint4 = new Paint(1);
            f21361n0 = paint4;
            paint4.setColor(0);
            f21361n0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            f21399p0 = new Paint(1);
            Paint paint5 = new Paint();
            m0 = paint5;
            paint5.setPathEffect(q90.c());
            Resources resources = context.getResources();
            Drawable drawable = resources.getDrawable(R.drawable.chats_saved);
            Drawable[] drawableArr = f21435r0;
            drawableArr[0] = drawable;
            drawableArr[1] = resources.getDrawable(R.drawable.ghost);
            drawableArr[2] = resources.getDrawable(R.drawable.msg_folders_private);
            drawableArr[3] = resources.getDrawable(R.drawable.msg_folders_requests);
            drawableArr[4] = resources.getDrawable(R.drawable.msg_folders_groups);
            drawableArr[5] = resources.getDrawable(R.drawable.msg_folders_channels);
            drawableArr[6] = resources.getDrawable(R.drawable.msg_folders_bots);
            drawableArr[7] = resources.getDrawable(R.drawable.msg_folders_muted);
            drawableArr[8] = resources.getDrawable(R.drawable.msg_folders_read);
            drawableArr[9] = resources.getDrawable(R.drawable.msg_folders_archive);
            drawableArr[10] = resources.getDrawable(R.drawable.msg_folders_private);
            drawableArr[11] = resources.getDrawable(R.drawable.chats_replies);
            drawableArr[12] = resources.getDrawable(R.drawable.other_chats);
            drawableArr[13] = resources.getDrawable(R.drawable.msg_stories_closefriends);
            drawableArr[14] = resources.getDrawable(R.drawable.filled_gift_premium);
            drawableArr[15] = resources.getDrawable(R.drawable.filled_unknown);
            drawableArr[16] = resources.getDrawable(R.drawable.filled_unclaimed);
            drawableArr[17] = resources.getDrawable(R.drawable.large_repost_story);
            drawableArr[18] = resources.getDrawable(R.drawable.large_hidden);
            drawableArr[19] = resources.getDrawable(R.drawable.large_notes);
            drawableArr[20] = resources.getDrawable(R.drawable.filled_folder_new);
            drawableArr[21] = resources.getDrawable(R.drawable.filled_folder_existing);
            drawableArr[22] = resources.getDrawable(R.drawable.filled_giveaway_premium);
            drawableArr[23] = resources.getDrawable(R.drawable.filled_giveaway_stars);
            drawableArr[24] = resources.getDrawable(R.drawable.filled_suggest_chat_avatar);
            xj0 xj0Var = f21495u1;
            if (xj0Var != null) {
                xj0Var.setCallback(null);
                f21495u1.C(false);
            }
            xj0 xj0Var2 = f21512v1;
            if (xj0Var2 != null) {
                xj0Var2.C(false);
            }
            xj0 xj0Var3 = f21531w1;
            if (xj0Var3 != null) {
                xj0Var3.C(false);
            }
            xj0 xj0Var4 = f21549x1;
            if (xj0Var4 != null) {
                xj0Var4.C(false);
            }
            xj0 xj0Var5 = f21568y1;
            if (xj0Var5 != null) {
                xj0Var5.C(false);
            }
            xj0 xj0Var6 = f21584z1;
            if (xj0Var6 != null) {
                xj0Var6.C(false);
            }
            f21495u1 = new xj0(R.raw.chats_archiveavatar, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21512v1 = new xj0(R.raw.chats_archive, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21531w1 = new xj0(R.raw.chats_unarchive, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21549x1 = new xj0(R.raw.chats_hide, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21568y1 = new xj0(R.raw.chats_unhide, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21584z1 = new xj0(R.raw.chat_audio_record_delete, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), false, null);
            H1 = new xj0(R.raw.swipe_mute, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            I1 = new xj0(R.raw.swipe_unmute, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            L1 = new xj0(R.raw.swipe_read, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            M1 = new xj0(R.raw.swipe_unread, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            J1 = new xj0(R.raw.swipe_delete, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            O1 = new xj0(R.raw.swipe_unpin, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            N1 = new xj0(R.raw.swipe_pin, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            K1 = new xj0(R.raw.swipe_community_ungroup, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
            k();
        }
    }

    public static Drawable Q0(String str) {
        return (Drawable) ml.get(str);
    }

    public static wc0 R(int i10, int i11) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        wc0 wc0Var = new wc0(z10, -2368069, -9722489, -2762611, -7817084);
        if (i10 <= 0 || i11 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            i11 = Math.max(point2.x, point2.y);
        }
        wc0Var.s(SvgHelper.getBitmap(R.raw.default_pattern, i10, i11, -16777216, 1.0f, SvgHelper.ScaleMode.ByWidth), 34);
        wc0Var.t(wc0Var.f());
        return wc0Var;
    }

    public static Drawable R0(String str, g6 g6Var) {
        Drawable drawable;
        if (g6Var != null) {
            drawable = g6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return (Drawable) ml.get(str);
    }

    public static void S(Context context) {
        Q(context);
        if (L0 == null) {
            TextPaint textPaint = new TextPaint(1);
            L0 = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint2 = new TextPaint(1);
            M0 = textPaint2;
            textPaint2.setTypeface(AndroidUtilities.bold());
            f21530w0 = new Paint(1);
            f21474t0 = new Paint(1);
            A0 = new Paint(1);
        }
        L0.setTextSize(AndroidUtilities.dp(12.0f));
        M0.setTextSize(AndroidUtilities.dp(13.0f));
        if (B0 == null) {
            Resources resources = context.getResources();
            B0 = new TextPaint[2];
            C0 = new TextPaint[2];
            F0 = new TextPaint[2];
            H0 = new TextPaint[2];
            for (int i10 = 0; i10 < 2; i10++) {
                B0[i10] = new TextPaint(1);
                B0[i10].setTypeface(AndroidUtilities.bold());
                C0[i10] = new TextPaint(1);
                C0[i10].setTypeface(AndroidUtilities.bold());
                F0[i10] = new TextPaint(1);
                H0[i10] = new TextPaint(1);
            }
            TextPaint textPaint3 = new TextPaint(1);
            D0 = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint4 = new TextPaint(1);
            E0 = textPaint4;
            textPaint4.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint5 = new TextPaint(1);
            G0 = textPaint5;
            textPaint5.setTypeface(AndroidUtilities.bold());
            I0 = new TextPaint(1);
            J0 = new TextPaint(1);
            K0 = new TextPaint(1);
            TextPaint textPaint6 = new TextPaint(1);
            N0 = textPaint6;
            textPaint6.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint7 = new TextPaint(1);
            O0 = textPaint7;
            textPaint7.setTypeface(AndroidUtilities.bold());
            P0 = new TextPaint(1);
            Q0 = new TextPaint(1);
            TextPaint textPaint8 = new TextPaint(1);
            R0 = textPaint8;
            textPaint8.setTypeface(AndroidUtilities.bold());
            f21494u0 = new Paint();
            f21511v0 = new Paint(1);
            f21567y0 = new Paint(1);
            f21548x0 = new Paint(1);
            f21583z0 = new Paint(1);
            f21121a1 = resources.getDrawable(R.drawable.list_secret);
            f21140b1 = resources.getDrawable(R.drawable.msg_mini_lock2);
            T0 = resources.getDrawable(R.drawable.list_check).mutate();
            S0 = resources.getDrawable(R.drawable.community_cards).mutate();
            U0 = resources.getDrawable(R.drawable.minithumb_play).mutate();
            V0 = resources.getDrawable(R.drawable.list_check).mutate();
            W0 = resources.getDrawable(R.drawable.list_halfcheck);
            X0 = new dd0();
            Y0 = resources.getDrawable(R.drawable.list_warning_sign);
            Z0 = resources.getDrawable(R.drawable.list_reorder).mutate();
            f21160c1 = resources.getDrawable(R.drawable.list_mute).mutate();
            f21179d1 = resources.getDrawable(R.drawable.list_unmute).mutate();
            f21196e1 = resources.getDrawable(R.drawable.mini_ephemeral_hidden_16).mutate();
            f21215f1 = resources.getDrawable(R.drawable.verified_area).mutate();
            f21232g1 = new ym0(0);
            f21251h1 = new ym0(1);
            f21268i1 = resources.getDrawable(R.drawable.verified_check).mutate();
            f21342m1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            f21362n1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            f21382o1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            f21400p1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            f21417q1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            f21436r1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            f21286j1 = resources.getDrawable(R.drawable.list_pin);
            f21306k1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            l1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            f21475t1 = resources.getDrawable(R.drawable.msg_mini_forumarrow);
            f21455s0 = resources.getDrawable(R.drawable.preview_arrow);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = f21124a5;
            pathArr[0] = path;
            pathArr[2] = new Path();
            float dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(12.0f);
            rectF.set(dp - AndroidUtilities.dp(5.0f), dp2 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f) + dp, AndroidUtilities.dp(5.0f) + dp2);
            pathArr[2].arcTo(rectF, -160.0f, -110.0f, true);
            pathArr[2].arcTo(rectF, 20.0f, -110.0f, true);
            pathArr[0].moveTo(dp, AndroidUtilities.dp(8.0f) + dp2);
            pathArr[0].lineTo(dp, AndroidUtilities.dp(2.0f) + dp2);
            pathArr[0].lineTo(AndroidUtilities.dp(3.0f) + dp, AndroidUtilities.dp(5.0f) + dp2);
            pathArr[0].close();
            pathArr[0].moveTo(dp, dp2 - AndroidUtilities.dp(8.0f));
            pathArr[0].lineTo(dp, dp2 - AndroidUtilities.dp(2.0f));
            pathArr[0].lineTo(dp - AndroidUtilities.dp(3.0f), dp2 - AndroidUtilities.dp(5.0f));
            pathArr[0].close();
            n();
        }
        G0.setTextSize(AndroidUtilities.dp(14.0f));
        I0.setTextSize(AndroidUtilities.dp(12.0f));
        J0.setTextSize(AndroidUtilities.dp(12.0f));
        J0.setTypeface(AndroidUtilities.bold());
        K0.setTextSize(AndroidUtilities.dp(12.0f));
        K0.setTypeface(AndroidUtilities.bold());
        N0.setTextSize(AndroidUtilities.dp(13.0f));
        O0.setTextSize(AndroidUtilities.dp(11.0f));
        P0.setTextSize(AndroidUtilities.dp(15.0f));
        Q0.setTextSize(AndroidUtilities.dp(15.0f));
        R0.setTextSize(AndroidUtilities.dp(10.0f));
        D0.setTextSize(AndroidUtilities.dp(16.0f));
        E0.setTextSize(AndroidUtilities.dp(16.0f));
    }

    public static SparseIntArray S0(File file, String str, String[] strArr) {
        File file2;
        int intValue;
        SparseIntArray sparseIntArray = new SparseIntArray();
        FileInputStream fileInputStream = null;
        try {
            try {
                byte[] bArr = new byte[1024];
                if (str != null) {
                    file2 = q0(str);
                } else {
                    file2 = file;
                }
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                int i10 = -1;
                int i11 = -1;
                int i12 = 0;
                boolean z10 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(bArr);
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
                                    z10 = true;
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
                                                intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                            }
                                        } else {
                                            intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                        }
                                        int v10 = k5.v(substring);
                                        if (v10 >= 0) {
                                            sparseIntArray.put(v10, intValue);
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
                        fileInputStream2.getChannel().position(i15);
                        if (z10) {
                            break;
                        }
                        i12 = i15;
                        i10 = -1;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        try {
                            FileLog.e(th);
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return sparseIntArray;
                        } catch (Throwable th3) {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                            }
                            throw th3;
                        }
                    }
                }
                sparseIntArray.put(f21236g5, i11);
                fileInputStream2.close();
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        return sparseIntArray;
    }

    public static w5 T(Context context) {
        return U(context, x0(null, f21499u5, false), x0(null, f21516v5, false));
    }

    public static float T0(float f10) {
        if (f10 < 0.0f && !I.q()) {
            return -f10;
        }
        return f10;
    }

    public static w5 U(Context context, int i10, int i11) {
        Resources resources = context.getResources();
        Drawable mutate = resources.getDrawable(R.drawable.search_dark).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = resources.getDrawable(R.drawable.search_dark_activated).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(i11, mode));
        ?? stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842910, 16842908}, mutate2);
        stateListDrawable.addState(new int[]{16842908}, mutate2);
        stateListDrawable.addState(StateSet.WILD_CARD, mutate);
        return stateListDrawable;
    }

    public static Paint U0(String str) {
        if (Objects.equals(str, "paintDivider")) {
            return f21305k0;
        }
        return (Paint) ol.get(str);
    }

    public static w5 V(Context context, int i10, int i11, int i12) {
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

    public static Paint V0(String str, g6 g6Var) {
        Paint d10;
        if (g6Var != null && (d10 = g6Var.d(str)) != null) {
            return d10;
        }
        return U0(str);
    }

    public static org.telegram.ui.Cells.y W(float f10, int i10, int i11) {
        return X(f10, 285212671, i10, i11, i10, i11);
    }

    public static Drawable W0(Context context, int i10, int i11) {
        if (context == null) {
            return null;
        }
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        return mutate;
    }

    public static org.telegram.ui.Cells.y X(float f10, int i10, int i11, int i12, int i13, int i14) {
        f21582z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new y5(i11, i12, i13, i14, f10));
    }

    public static Drawable X0(Context context, int i10, int i11) {
        return W0(context, i10, x0(null, i11, false));
    }

    public static void Y(Context context) {
        if (Q1 == null) {
            P1 = new TextPaint(1);
            Resources resources = context.getResources();
            Q1 = resources.getDrawable(R.drawable.verified_area).mutate();
            R1 = resources.getDrawable(R.drawable.verified_check).mutate();
            p();
        }
        P1.setTextSize(AndroidUtilities.dp(16.0f));
    }

    public static android.graphics.drawable.Drawable Y0(android.view.View r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.Y0(android.view.View, boolean):android.graphics.drawable.Drawable");
    }

    public static org.telegram.ui.Cells.y Z(int i10, int i11, int i12) {
        f21582z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new h6(i11, i12));
    }

    public static int Z0(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 | (-16777216);
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

    public static org.telegram.ui.Cells.y a0(int i10, int i11, int i12, int i13) {
        f21582z.setColor(-1);
        float f10 = i12;
        float f11 = i13;
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), d0(AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), i10), new h6(f10, f11));
    }

    public static String a1(d6 d6Var) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (d6Var == null || TextUtils.isEmpty(d6Var.f20818c) || d6Var.f20818c.equals("d")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (d6Var.f20821i) {
            sb2.append("blur");
        }
        if (d6Var.f20822j) {
            if (sb2.length() > 0) {
                sb2.append("+");
            }
            sb2.append("motion");
        }
        int i10 = d6Var.d;
        if (i10 == 0) {
            str3 = "https://attheme.org?slug=" + d6Var.f20818c;
        } else {
            String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (d6Var.d >> 8)) & 255), Byte.valueOf((byte) (d6Var.d & 255))).toLowerCase();
            int i11 = d6Var.e;
            if (i11 != 0) {
                str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (d6Var.e >> 8)) & 255), Byte.valueOf((byte) (d6Var.e & 255))).toLowerCase();
            } else {
                str = null;
            }
            int i12 = d6Var.f20819f;
            if (i12 != 0) {
                str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (d6Var.f20819f >> 8)) & 255), Byte.valueOf((byte) (d6Var.f20819f & 255))).toLowerCase();
            } else {
                str2 = null;
            }
            int i13 = d6Var.f20820g;
            if (i13 != 0) {
                str4 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (d6Var.f20820g >> 8)) & 255), Byte.valueOf((byte) (d6Var.f20820g & 255))).toLowerCase();
            }
            if (str != null && str2 != null) {
                if (str4 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(lowerCase);
                    sb3.append("~");
                    sb3.append(str);
                    sb3.append("~");
                    sb3.append(str2);
                    lowerCase = a1.g.s(sb3, "~", str4);
                } else {
                    lowerCase = lowerCase + "~" + str + "~" + str2;
                }
            } else if (str != null) {
                StringBuilder i14 = si.o0.i(a1.g.D(lowerCase, "-", str), "&rotation=");
                i14.append(d6Var.h);
                lowerCase = i14.toString();
            }
            str3 = "https://attheme.org?slug=" + d6Var.f20818c + "&intensity=" + ((int) (d6Var.f20823k * 100.0f)) + "&bg_color=" + lowerCase;
        }
        if (sb2.length() > 0) {
            StringBuilder i15 = si.o0.i(str3, "&mode=");
            i15.append(sb2.toString());
            return i15.toString();
        }
        return str3;
    }

    public static int b(float f10, float f11, int i10) {
        float[] O02 = O0(5);
        Color.colorToHSV(i10, O02);
        float f12 = O02[1];
        if (f12 > 0.1f && f12 < 0.9f) {
            O02[1] = w7.r.a(f12 + f10, 0.0f, 1.0f);
        }
        O02[2] = w7.r.a(O02[2] + f11, 0.0f, 1.0f);
        return Color.HSVToColor(Color.alpha(i10), O02);
    }

    public static org.telegram.ui.Cells.y b0(int i10, int i11, int i12, int i13, int i14) {
        f21582z.setColor(-1);
        ?? drawable = new Drawable();
        drawable.f20943a = new Path();
        drawable.f20944b = r1;
        drawable.f20945c = true;
        float dp = AndroidUtilities.dp(i11);
        float dp2 = AndroidUtilities.dp(i12);
        float dp3 = AndroidUtilities.dp(i13);
        float dp4 = AndroidUtilities.dp(i14);
        float[] fArr = {dp, dp, dp2, dp2, dp3, dp3, dp4, dp4};
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, drawable);
    }

    public static boolean b1() {
        if (P && I.f21032i0 != null) {
            return true;
        }
        return false;
    }

    public static int c(int i10, int i11) {
        float[] O02 = O0(5);
        Color.colorToHSV(i11, O02);
        float f10 = O02[0];
        float f11 = O02[1];
        Color.colorToHSV(i10, O02);
        O02[0] = f10;
        O02[1] = AndroidUtilities.lerp(O02[1], f11, 0.25f);
        return Color.HSVToColor(Color.alpha(i10), O02);
    }

    public static ShapeDrawable c0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        return shapeDrawable;
    }

    public static boolean c1() {
        if (Z != null) {
            return true;
        }
        return false;
    }

    public static void d(int i10, String str, Drawable drawable) {
        ml.put(str, drawable);
        nl.put(str, Integer.valueOf(i10));
    }

    public static ShapeDrawable d0(int i10, int i11, int i12) {
        float f10 = i10;
        float f11 = i11;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f11, f11, f11, f11}, null, null));
        shapeDrawable.getPaint().setColor(i12);
        return shapeDrawable;
    }

    public static boolean d1(int i10) {
        float[] O02 = O0(3);
        Color.colorToHSV(i10, O02);
        float f10 = O02[1];
        if (f10 > 0.1f && f10 < 0.9f) {
            return true;
        }
        return false;
    }

    public static void e(int i10, Paint paint, String str) {
        ol.put(str, paint);
        pl.put(str, Integer.valueOf(i10));
    }

    public static InsetDrawable e0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        shapeDrawable.getPaint().setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), o1(Color.alpha(i11) / 255.0f, 285212672));
        return new InsetDrawable((Drawable) shapeDrawable, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
    }

    public static boolean e1(int i10) {
        if (ul.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    public static void f(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        if (z10) {
            int i10 = xk;
            if (sparseIntArray.indexOfKey(i10) < 0) {
                sparseIntArray2.put(i10, o1(0.1f, -1));
            }
        }
        int[] iArr = ql;
        int i11 = f21445ra;
        int i12 = sparseIntArray2.get(i11, iArr[i11]);
        int I12 = I1(sparseIntArray2);
        int i13 = zk;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, w(i12, z10, false));
        }
        int i14 = Ak;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, w(i12, z10, true));
        }
        int i15 = Bk;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, w(I12, z10, false));
        }
        int i16 = Ck;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            sparseIntArray2.put(i16, w(I12, z10, true));
        }
        int i17 = Dk;
        if (sparseIntArray.indexOfKey(i17) < 0) {
            sparseIntArray2.put(i17, x(i12, z10, false, true));
        }
        int i18 = Ek;
        if (sparseIntArray.indexOfKey(i18) < 0) {
            sparseIntArray2.put(i18, x(I12, z10, true, true));
        }
        int i19 = Fk;
        if (sparseIntArray.indexOfKey(i19) < 0) {
            sparseIntArray2.put(i19, x(i12, z10, false, false));
        }
        int i20 = Gk;
        if (sparseIntArray.indexOfKey(i20) < 0) {
            sparseIntArray2.put(i20, x(I12, z10, true, false));
        }
    }

    public static org.telegram.ui.Cells.y f0(int i10, int i11) {
        return g0(i10, i11, -1);
    }

    public static boolean f1() {
        j6 j6Var = I;
        if (!j6Var.S || j6Var.Y != f21360n) {
            if (ul.indexOfKey(Nd) < 0 && f21231g0 <= 0 && TextUtils.isEmpty(f21250h0)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void g(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        int[] iArr = ql;
        int i10 = f21445ra;
        int i11 = sparseIntArray2.get(i10, iArr[i10]);
        int I12 = I1(sparseIntArray2);
        int i12 = rk;
        if (sparseIntArray.indexOfKey(i12) < 0) {
            sparseIntArray2.put(i12, y(i11, z10, false));
        }
        int i13 = sk;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, y(I12, z10, true));
        }
        int i14 = tk;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, z(i11, z10, false));
        }
        int i15 = uk;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, z(I12, z10, true));
        }
        int i16 = wk;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            int i17 = f21130ab;
            sparseIntArray2.put(i16, o1(0.2f, sparseIntArray2.get(i17, iArr[i17])));
        }
        if (z10) {
            int i18 = vk;
            if (sparseIntArray.indexOfKey(i18) < 0) {
                int i19 = Yc;
                sparseIntArray2.put(i18, o1(0.2f, sparseIntArray2.get(i19, iArr[i19])));
            }
        }
    }

    public static org.telegram.ui.Cells.y g0(int r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.g0(int, int, int):org.telegram.ui.Cells.y");
    }

    public static boolean g1() {
        if (vl != null) {
            return true;
        }
        return false;
    }

    public static void h(Drawable drawable) {
        boolean z10;
        Bitmap bitmap;
        if (f21197e2 == null) {
            return;
        }
        int i10 = ul.get(Hc);
        if ((drawable instanceof wc0) && SharedConfig.getDevicePerformanceClass() != 0 && i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && Y != (bitmap = ((wc0) drawable).f32200k)) {
            Y = bitmap;
            Bitmap bitmap2 = Y;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            Z = new BitmapShader(bitmap2, tileMode, tileMode);
            if (f21120a0 == null) {
                f21120a0 = new Matrix();
            }
        }
        if (Z != null && i10 == 0 && z10) {
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 2.5f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.75f);
            f21197e2.setShader(Z);
            f21197e2.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            f21197e2.setAlpha(64);
            return;
        }
        Paint paint = f21197e2;
        if (i10 == 0) {
            i10 = 1073741824;
        }
        paint.setColor(i10);
        f21197e2.setColorFilter(null);
        f21197e2.setShader(null);
    }

    public static org.telegram.ui.Cells.y h0(int i10, int i11) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), new ColorDrawable(i10), new ColorDrawable(i10));
    }

    public static boolean h1() {
        return I.q();
    }

    public static void i(Drawable drawable) {
        int i10;
        int i11;
        Bitmap bitmap;
        float f10;
        float f11;
        float f12;
        float f13;
        if (f21216f2 == null) {
            return;
        }
        X = f21159c0;
        f21139b0 = f21178d0;
        SparseIntArray sparseIntArray = ul;
        int i12 = f21334lc;
        int indexOfKey = sparseIntArray.indexOfKey(i12);
        if (indexOfKey >= 0) {
            i10 = ul.valueAt(indexOfKey);
        } else {
            i10 = X;
        }
        int indexOfKey2 = ul.indexOfKey(f21353mc);
        if (indexOfKey2 >= 0) {
            i11 = ul.valueAt(indexOfKey2);
        } else {
            i11 = f21139b0;
        }
        boolean z10 = drawable instanceof wc0;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z10) {
                bitmap = ((wc0) drawable).f32200k;
            } else {
                if (drawable instanceof BitmapDrawable) {
                    WeakReference weakReference = Jl;
                    if (weakReference != null && weakReference.get() == drawable) {
                        bitmap = Kl;
                    } else {
                        WeakReference weakReference2 = Jl;
                        if (weakReference2 != null) {
                            weakReference2.clear();
                        }
                        Jl = null;
                        if (drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
                            Jl = new WeakReference(drawable);
                            int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
                            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
                            drawable.setBounds(0, 0, intrinsicWidth, 24);
                            ColorFilter colorFilter = drawable.getColorFilter();
                            ColorMatrix colorMatrix = new ColorMatrix();
                            colorMatrix.setSaturation(1.3f);
                            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.94f);
                            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                            drawable.draw(new Canvas(createBitmap));
                            drawable.setColorFilter(colorFilter);
                            Utilities.blurBitmap(createBitmap, 3);
                            Kl = createBitmap;
                            bitmap = createBitmap;
                        } else {
                            Kl = null;
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
                if (f21120a0 == null) {
                    f21120a0 = new Matrix();
                }
            }
            z1(-1, Y3);
            z1(-1, H3);
            z1(-1, I3);
            z1(-1, J3);
            z1(-1, K3);
            f21457s2.setColor(-1);
            f21476t2.setColor(-1);
            f21496u2.setColor(-1);
            f21457s2.linkColor = -1;
            f21513v2.setColor(-1);
            Q2.setColor(-1);
            z1(-1, C4);
            z1(-1, f21420q4);
            z1(-1, f21439r4);
            z1(-1, f21498u4);
            z1(-1, f21552x4);
            z1(-1, f21570y4);
            z1(-1, A4);
            z1(-1, f21587z4);
            z1(-1, f21515v4);
        } else {
            Y = null;
            Z = null;
            Drawable drawable2 = Y3;
            int i13 = f21278ic;
            A1(i13, drawable2);
            A1(i13, H3);
            A1(i13, I3);
            A1(i13, J3);
            A1(i13, K3);
            f21457s2.setColor(x0(null, i13, false));
            f21476t2.setColor(x0(null, i13, false));
            f21457s2.linkColor = x0(null, f21297jc, false);
            f21513v2.setColor(x0(null, i13, false));
            Drawable drawable3 = C4;
            int i14 = f21317kc;
            A1(i14, drawable3);
            A1(i14, f21420q4);
            A1(i14, f21439r4);
            A1(i14, f21498u4);
            A1(i14, f21552x4);
            A1(i14, f21570y4);
            A1(i14, A4);
            A1(i14, f21587z4);
            A1(i14, f21515v4);
            Q2.setColor(x0(null, Nc, false));
        }
        f21216f2.setColor(i10);
        f21233g2.setColor(i11);
        if (Z != null && (ul.indexOfKey(i12) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix2 = new ColorMatrix();
            if (z10) {
                float f14 = -0.06f;
                if (((wc0) drawable).f32206q >= 0.0f) {
                    colorMatrix2.setSaturation(1.6f);
                    if (I.q()) {
                        f13 = 0.97f;
                    } else {
                        f13 = 0.92f;
                    }
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, f13);
                    if (I.q()) {
                        f14 = 0.12f;
                    }
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f14);
                } else {
                    colorMatrix2.setSaturation(1.1f);
                    if (I.q()) {
                        f12 = 0.4f;
                    } else {
                        f12 = 0.8f;
                    }
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, f12);
                    if (I.q()) {
                        f14 = 0.08f;
                    }
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f14);
                }
            } else {
                colorMatrix2.setSaturation(1.6f);
                if (I.q()) {
                    f10 = 0.9f;
                } else {
                    f10 = 0.84f;
                }
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, f10);
                if (I.q()) {
                    f11 = -0.04f;
                } else {
                    f11 = 0.06f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f11);
            }
            f21216f2.setFilterBitmap(true);
            f21216f2.setShader(Z);
            f21216f2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
            f21216f2.setAlpha(255);
            f21233g2.setFilterBitmap(true);
            f21233g2.setShader(Z);
            ColorMatrix colorMatrix3 = new ColorMatrix(colorMatrix2);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.26f);
            h1();
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix3, 0.92f);
            f21233g2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
            f21233g2.setAlpha(255);
            f21252h2.setAlpha(0);
            return;
        }
        f21216f2.setColorFilter(null);
        f21216f2.setShader(null);
        f21233g2.setColorFilter(null);
        f21233g2.setShader(null);
        f21252h2.setAlpha(21);
    }

    public static org.telegram.ui.Cells.y i0(int i10, int i11, int i12) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(i11);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(ovalShape);
        shapeDrawable2.getPaint().setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i12}), shapeDrawable, shapeDrawable2);
    }

    public static boolean i1() {
        return !I.q();
    }

    public static void j(boolean z10, boolean z11) {
        if (f21383o2 != null && f21344m3 != null && !z10) {
            K2.setColor(x0(null, Jc, false));
            J2.setColor(x0(null, Ic, false));
            Q2.setColor(x0(null, Nc, false));
            U1.setColor(x0(null, Ld, false));
            V1.setColor(x0(null, Mb, false));
            W1.setColor(x0(null, Md, false));
            f21141b2.setColor(x0(null, Fc, false));
            Paint paint = f21161c2;
            int i10 = f21407pa;
            paint.setColor(x0(null, i10, false));
            f21180d2.setColor(x0(null, i10, false));
            TextPaint textPaint = f21457s2;
            int i11 = f21278ic;
            textPaint.setColor(x0(null, i11, false));
            f21476t2.setColor(x0(null, i11, false));
            f21496u2.setColor(x0(null, i11, false));
            f21457s2.linkColor = x0(null, f21297jc, false);
            f21513v2.setColor(x0(null, i11, false));
            f21217f3.setColor(x0(null, G6, false));
            Paint paint2 = f21287j2;
            int i12 = Sd;
            paint2.setColor(x0(null, i12, false));
            f21269i2.setColor(x0(null, f21541wc, false));
            A1(f21318kd, f21253h3);
            j5 j5Var = f21344m3;
            int i13 = f21445ra;
            A1(i13, j5Var);
            j5 j5Var2 = f21364n3;
            int i14 = f21189dc;
            A1(i14, j5Var2);
            A1(i13, f21419q3);
            A1(i14, f21438r3);
            A1(Ja, y3);
            A1(Ka, f21586z3);
            Drawable drawable = A3;
            int i15 = La;
            A1(i15, drawable);
            Drawable drawable2 = B3;
            int i16 = Ma;
            A1(i16, drawable2);
            A1(i15, C3);
            A1(i16, D3);
            Drawable drawable3 = F3;
            int i17 = f21467sc;
            A1(i17, drawable3);
            A1(i17, G3);
            A1(i11, H3);
            A1(i11, I3);
            A1(i11, J3);
            A1(i11, K3);
            A1(i11, L3);
            Drawable drawable4 = f21420q4;
            int i18 = f21317kc;
            A1(i18, drawable4);
            A1(i18, f21439r4);
            A1(i18, f21498u4);
            A1(i18, f21552x4);
            A1(i18, f21570y4);
            Drawable drawable5 = A4;
            int i19 = f21409pc;
            A1(i19, drawable5);
            A1(i18, f21587z4);
            A1(i18, f21515v4);
            Drawable drawable6 = M3;
            int i20 = f21560xc;
            A1(i20, drawable6);
            Drawable drawable7 = N3;
            int i21 = yc;
            A1(i21, drawable7);
            Drawable drawable8 = O3;
            int i22 = Ra;
            A1(i22, drawable8);
            Drawable drawable9 = P3;
            int i23 = Sa;
            A1(i23, drawable9);
            A1(i20, Q3);
            A1(i21, R3);
            A1(i22, S3);
            A1(i23, T3);
            A1(i20, U3);
            A1(i21, V3);
            A1(i22, W3);
            A1(i23, X3);
            Drawable drawable10 = Z3;
            int i24 = zc;
            A1(i24, drawable10);
            A1(i11, Y3);
            A1(i24, f21123a4);
            A1(i24, f21143b4);
            A1(Ac, f21163c4);
            A1(Bc, f21182d4);
            A1(Ta, f21199e4);
            A1(Ua, f21218f4);
            A1(Cc, f21235g4);
            Drawable drawable11 = f21271i4;
            int i25 = Va;
            A1(i25, drawable11);
            Drawable drawable12 = f21254h4;
            int i26 = Dc;
            A1(i26, drawable12);
            A1(Gc, f21289j4);
            A1(oc, f21309k4);
            A1(i19, l4);
            Drawable drawable13 = f21345m4;
            int i27 = Ge;
            A1(i27, drawable13);
            A1(i27, f21365n4);
            A1(i27, f21385o4);
            A1(i26, B4);
            A1(i18, C4);
            A1(i26, D4);
            Drawable drawable14 = E4;
            int i28 = Be;
            A1(i28, drawable14);
            A1(i28, F4);
            for (int i29 = 0; i29 < 2; i29++) {
                A1(i26, G4[i29]);
                A1(Ec, H4[i29]);
                A1(i25, I4[i29]);
                A1(Wa, J4[i29]);
            }
            A1(Ia, O4);
            Drawable drawable15 = P4;
            int i30 = f21442r7;
            A1(i30, drawable15);
            A1(f21425qa, Q4);
            A1(i30, V4);
            Drawable drawable16 = W4;
            int i31 = Di;
            A1(i31, drawable16);
            A1(i30, X4);
            A1(i31, Y4);
            int i32 = 0;
            while (true) {
                jx0[] jx0VarArr = f21497u3;
                if (i32 >= jx0VarArr.length) {
                    break;
                }
                A1(p9, jx0VarArr[i32]);
                i32++;
            }
            for (int i33 = 0; i33 < 5; i33++) {
                Drawable[][] drawableArr = U4;
                y1(drawableArr[i33][0], x0(null, f21280ie, false), false);
                y1(drawableArr[i33][0], x0(null, f21505uc, false), true);
                y1(drawableArr[i33][1], x0(null, f21299je, false), false);
                y1(drawableArr[i33][1], x0(null, f21523vc, false), true);
            }
            Drawable[] drawableArr2 = T4;
            y1(drawableArr2[0], x0(null, f21449re, false), false);
            y1(drawableArr2[0], x0(null, f21468se, false), true);
            y1(drawableArr2[1], x0(null, Qb, false), false);
            y1(drawableArr2[1], x0(null, Rb, false), true);
            Drawable[] drawableArr3 = S4;
            z1(x0(null, f21429qe, false), drawableArr3[0]);
            z1(x0(null, Pb, false), drawableArr3[1]);
            Drawable[] drawableArr4 = M4;
            z1(x0(null, Kc, false), drawableArr4[0]);
            z1(x0(null, Xa, false), drawableArr4[1]);
            Drawable[] drawableArr5 = N4;
            z1(x0(null, i20, false), drawableArr5[0]);
            z1(x0(null, i22, false), drawableArr5[1]);
            A1(Td, f21270i3);
            A1(i12, f21288j3);
            int i34 = -1;
            if (x0(null, f21594zb, false) == -1) {
                i34 = x0(null, Aa, false);
            }
            z1(i34, K4[1]);
            z1(i34, L4[1]);
            z1(x0(null, f21188da, false), R4);
            if (!z11 && !f21138b) {
                Drawable drawable17 = f21195e0;
                if (drawable17 != null) {
                    i(drawable17);
                }
                h(f21195e0);
            }
        }
    }

    public static org.telegram.ui.Cells.y j0(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
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

    public static boolean j1(i6 i6Var) {
        j6 j6Var = i6Var.f20966b;
        if (j6Var != null) {
            if (j6Var.m().equals("Blue") && i6Var.f20965a == 99) {
                return true;
            }
            if (i6Var.f20966b.m().equals("Day") && i6Var.f20965a == 9) {
                return true;
            }
            if ((i6Var.f20966b.m().equals("Night") || i6Var.f20966b.m().equals("Dark Blue")) && i6Var.f20965a == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void k() {
        Paint paint = f21305k0;
        if (paint == null) {
            return;
        }
        paint.setColor(x0(null, f21185d7, false));
        m0.setColor(x0(null, K6, false));
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = f21435r0;
            int length = drawableArr.length;
            int i11 = J7;
            if (i10 < length) {
                A1(i11, drawableArr[i10]);
                i10++;
            } else {
                xj0 xj0Var = f21495u1;
                xj0Var.Z = true;
                int i12 = M7;
                xj0Var.Q(x0(null, i12, true), "Arrow1");
                f21495u1.Q(x0(null, i12, true), "Arrow2");
                f21495u1.Q(x0(null, i11, true), "Box2");
                f21495u1.Q(x0(null, i11, true), "Box1");
                f21495u1.o();
                C1 = false;
                f21495u1.J(true);
                xj0 xj0Var2 = f21549x1;
                xj0Var2.Z = true;
                int i13 = f21203e9;
                xj0Var2.Q(x0(null, i13, true), "Arrow");
                f21549x1.Q(x0(null, i13, true), "Line");
                f21549x1.o();
                xj0 xj0Var3 = f21568y1;
                xj0Var3.Z = true;
                xj0Var3.Q(x0(null, i13, true), "Arrow");
                f21568y1.Q(x0(null, i13, true), "Line");
                f21568y1.o();
                xj0 xj0Var4 = f21584z1;
                xj0Var4.Z = true;
                int i14 = f21168c9;
                xj0Var4.Q(x0(null, i14, true), "Line 1");
                f21584z1.Q(x0(null, i14, true), "Line 2");
                f21584z1.Q(x0(null, i14, true), "Line 3");
                f21584z1.Q(x0(null, i13, true), "Cup Red");
                f21584z1.Q(x0(null, i13, true), "Box");
                f21584z1.o();
                B1 = false;
                xj0 xj0Var5 = f21512v1;
                xj0Var5.Z = true;
                xj0Var5.Q(x0(null, i14, true), "Arrow");
                f21512v1.Q(x0(null, i13, true), "Box2");
                f21512v1.Q(x0(null, i13, true), "Box1");
                f21512v1.o();
                A1 = false;
                xj0 xj0Var6 = f21531w1;
                xj0Var6.Z = true;
                xj0Var6.Q(x0(null, i13, true), "Arrow1");
                f21531w1.Q(x0(null, f21187d9, true), "Arrow2");
                f21531w1.Q(x0(null, i13, true), "Box2");
                f21531w1.Q(x0(null, i13, true), "Box1");
                f21531w1.o();
                int x02 = x0(null, G6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                f21514v3 = new PorterDuffColorFilter(x02, mode);
                f21533w3 = new PorterDuffColorFilter(x0(null, fc, false), mode);
                sg.b1.d().b();
                return;
            }
        }
    }

    public static boolean k0(j6 j6Var, i6 i6Var, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (i6Var == null || j6Var == null || j6Var.f21023b0 == null) {
            return false;
        }
        if (i6Var.f20965a == j6Var.Y) {
            z11 = true;
        } else {
            z11 = false;
        }
        File d10 = i6Var.d();
        if (d10 != null) {
            d10.delete();
        }
        j6Var.f21021a0.remove(i6Var.f20965a);
        j6Var.f21023b0.remove(i6Var);
        TLRPC.TL_theme tL_theme = i6Var.f20979r;
        if (tL_theme != null) {
            j6Var.f21025c0.remove(tL_theme.f20481id);
        }
        d6 d6Var = i6Var.f20985y;
        if (d6Var != null) {
            d6.a(d6Var);
        }
        if (z11) {
            j6Var.u(((i6) j6Var.f21023b0.get(0)).f20965a);
        }
        if (z10) {
            w1(j6Var, true, false, false, false, false);
            if (i6Var.f20979r != null) {
                MessagesController messagesController = MessagesController.getInstance(i6Var.f20981t);
                if (z11 && j6Var == J) {
                    z12 = true;
                }
                messagesController.saveTheme(j6Var, i6Var, z12, true);
            }
        }
        return z11;
    }

    public static void k1(int i10, boolean z10) {
        boolean[] zArr = C;
        if (!zArr[i10]) {
            if ((z10 || Math.abs((System.currentTimeMillis() / 1000) - D[i10]) >= 3600) && UserConfig.getInstance(i10).isClientActivated()) {
                zArr[i10] = true;
                TL_account.getThemes getthemes = new TL_account.getThemes();
                getthemes.format = "android";
                if (!MediaDataController.getInstance(i10).defaultEmojiThemes.isEmpty()) {
                    getthemes.hash = E[i10];
                }
                if (BuildVars.LOGS_ENABLED) {
                    Log.i("theme", "loading remote themes, hash " + getthemes.hash);
                }
                ConnectionsManager.getInstance(i10).sendRequest(getthemes, new gi.k2(i10, 3));
            }
        }
    }

    public static void l(boolean z10) {
        j6 j6Var;
        if (M == null) {
            if (z10) {
                j6 j6Var2 = I;
                j6 j6Var3 = J;
                if (j6Var2 != j6Var3) {
                    if (j6Var2 == null || (j6Var3 != null && j6Var2.q() != J.q())) {
                        R = true;
                        f21266i = SystemClock.elapsedRealtime();
                        Q = true;
                        H1(J, true, -1, null);
                        Q = false;
                        return;
                    }
                    return;
                }
                return;
            }
            j6 j6Var4 = K;
            if (j6Var4 != null && j6Var4.q() && f21380o != 0 && (j6Var = L) != null) {
                j6Var4 = j6Var;
            }
            j6 j6Var5 = I;
            if (j6Var5 != j6Var4) {
                if (j6Var5 == null || (j6Var4 != null && j6Var5.q() != j6Var4.q())) {
                    R = false;
                    f21266i = SystemClock.elapsedRealtime();
                    Q = true;
                    H1(j6Var4, true, -1, null);
                    Q = false;
                }
            }
        }
    }

    public static j6 l0(File file, String str, TLRPC.TL_theme tL_theme) {
        String[] split;
        try {
            j6 j6Var = new j6();
            j6Var.f21020a = str;
            j6Var.F = tL_theme;
            j6Var.f21022b = file.getAbsolutePath();
            j6Var.E = UserConfig.selectedAccount;
            String[] strArr = new String[1];
            G(S0(new File(j6Var.f21022b), null, strArr), j6Var);
            if (!TextUtils.isEmpty(strArr[0])) {
                String str2 = strArr[0];
                j6Var.f21024c = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(str2) + ".wp").getAbsolutePath();
                Uri parse = Uri.parse(str2);
                j6Var.e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        if ("blur".equals(split[i10])) {
                            j6Var.h = true;
                        } else if ("motion".equals(split[i10])) {
                            j6Var.f21034n = true;
                        }
                    }
                }
                String queryParameter2 = parse.getQueryParameter("intensity");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String queryParameter3 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            j6Var.f21035r = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                            if (queryParameter3.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(6))) {
                                j6Var.f21036s = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter3.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(13))) {
                                j6Var.v = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter3.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(20))) {
                                j6Var.f21037w = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String queryParameter4 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            j6Var.f21038x = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        j6Var.f21039y = Utilities.parseInt((CharSequence) queryParameter2).intValue();
                    }
                    if (j6Var.f21039y == 0) {
                        j6Var.f21039y = 50;
                    }
                }
                return j6Var;
            }
            f21250h0 = null;
            return j6Var;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static Bitmap l1(FileInputStream fileInputStream, int i10) {
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
                Point point = AndroidUtilities.displaySize;
                int min2 = Math.min(point.x, point.y);
                Point point2 = AndroidUtilities.displaySize;
                int max = Math.max(point2.x, point2.y);
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
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Exception unused3) {
                }
                throw th2;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            try {
                fileInputStream.close();
            } catch (Exception unused4) {
            }
            return null;
        }
    }

    public static void m(Paint paint) {
        paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), f21119a);
    }

    public static Paint m0(int i10) {
        Paint paint = Ll;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
        }
        return paint;
    }

    public static void m1(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.m1(boolean):void");
    }

    public static void n() {
        if (B0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = p9;
            int i12 = f21240g9;
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
                int x03 = x0(null, f21350m9, false);
                textPaint2.linkColor = x03;
                textPaint2.setColor(x03);
                f21494u0.setColor(x0(null, f21483t9, false));
                f21511v0.setColor(x0(null, f21464s9, false));
                I0.setColor(x0(null, f21424q9, false));
                J0.setColor(x0(null, f21444r9, false));
                TextPaint textPaint3 = K0;
                int i15 = il;
                textPaint3.setColor(x0(null, i15, false));
                TextPaint textPaint4 = L0;
                int i16 = W8;
                textPaint4.setColor(x0(null, i16, false));
                M0.setColor(x0(null, i16, false));
                TextPaint textPaint5 = N0;
                int i17 = f21222f9;
                textPaint5.setColor(x0(null, i17, false));
                O0.setColor(x0(null, i17, false));
                Paint paint = f21530w0;
                int i18 = U8;
                paint.setColor(x0(null, i18, false));
                Paint paint2 = f21567y0;
                int i19 = V8;
                paint2.setColor(x0(null, i19, false));
                f21583z0.setColor(x0(null, i11, false));
                f21548x0.setColor(x0(null, f21557x9, false));
                P0.setColor(x0(null, f21404p6, false));
                Q0.setColor(x0(null, A6, false));
                A1(f21128a9, f21121a1);
                Drawable drawable = f21140b1;
                int i20 = f21148b9;
                A1(i20, drawable);
                A1(f21503u9, T0);
                A1(G6, S0);
                Drawable drawable2 = V0;
                int i21 = f21520v9;
                A1(i21, drawable2);
                A1(i21, W0);
                A1(w9, X0);
                A1(f21575y9, Y0);
                A1(i20, f21286j1);
                A1(i20, f21306k1);
                A1(i15, l1);
                A1(i20, Z0);
                Drawable drawable3 = f21160c1;
                int i22 = B9;
                A1(i22, drawable3);
                A1(i22, f21179d1);
                A1(i22, f21196e1);
                A1(i18, f21342m1);
                A1(Z5, f21362n1);
                A1(zj, f21382o1);
                A1(i19, f21400p1);
                A1(i19, f21417q1);
                A1(i19, f21436r1);
                A1(i12, f21475t1);
                A1(f21592z9, f21215f1);
                A1(A9, f21268i1);
                A1(A8, f21456s1);
                ym0 ym0Var = f21232g1;
                int i23 = f21294j9;
                A1(i23, ym0Var);
                A1(i23, f21251h1);
                return;
            }
        }
    }

    public static j6 n0() {
        return I;
    }

    public static Drawable n1(d6 d6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable drawable;
        com.google.android.gms.internal.cast.z5 I10 = I(I, d6Var, ul, file, f21250h0, f21231g0, i10, S, z11, O, P, z10, document, false);
        Boolean bool = (Boolean) I10.f6892a;
        if (bool != null) {
            z12 = bool.booleanValue();
        } else {
            z12 = f21267i0;
        }
        f21267i0 = z12;
        Boolean bool2 = (Boolean) I10.d;
        if (bool2 != null) {
            z13 = bool2.booleanValue();
        } else {
            z13 = f21285j0;
        }
        f21285j0 = z13;
        Boolean bool3 = (Boolean) I10.e;
        if (bool3 != null) {
            z14 = bool3.booleanValue();
        } else {
            z14 = W;
        }
        W = z14;
        Drawable drawable2 = (Drawable) I10.f6893b;
        if (drawable2 != null) {
            drawable = drawable2;
        } else {
            drawable = f21195e0;
        }
        f21195e0 = drawable;
        int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(drawable2);
        int i11 = calcDrawableColor[0];
        f21159c0 = i11;
        X = i11;
        int i12 = calcDrawableColor[1];
        f21178d0 = i12;
        f21139b0 = i12;
        Drawable drawable3 = f21195e0;
        if (drawable3 != null) {
            i(drawable3);
        }
        return drawable2;
    }

    public static void o() {
        j6 j6Var;
        j6 j6Var2 = M;
        if (j6Var2 == null) {
            return;
        }
        O = false;
        if (R && (j6Var = J) != null) {
            t(j6Var, true, true);
        } else if (!P) {
            t(j6Var2, true, false);
        }
        P = false;
        M = null;
        E(false);
    }

    public static ColorFilter o0(g6 g6Var) {
        if (g6Var != null) {
            return g6Var.c();
        }
        return f21514v3;
    }

    public static int o1(float f10, int i10) {
        if (f10 == 1.0f) {
            return i10;
        }
        return i0.a.o(i10, w7.r.b((int) (Color.alpha(i10) * f10), 0, 255));
    }

    public static void p() {
        if (Q1 == null) {
            return;
        }
        P1.setColor(x0(null, G6, false));
        P1.linkColor = x0(null, J6, false);
        A1(f21599zh, Q1);
        A1(Ah, R1);
    }

    public static j8 p0(MessageObject messageObject) {
        HashMap hashMap = f21200e5;
        if (hashMap != null && messageObject != null) {
            return (j8) hashMap.get(messageObject);
        }
        return null;
    }

    public static int p1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.p1():int");
    }

    public static void q(float f10, float f11, int i10, int i11) {
        r(Y, Z, f21120a0, i10, i11, f10, f11);
    }

    public static File q0(String str) {
        long j10;
        File file = new File(ApplicationLoader.getFilesDirFixed(), str);
        try {
            InputStream open = ApplicationLoader.applicationContext.getAssets().open(str);
            j10 = open.available();
            open.close();
        } catch (Exception e10) {
            FileLog.e(e10);
            j10 = 0;
        }
        if (!file.exists() || (j10 != 0 && file.length() != j10)) {
            try {
                InputStream open2 = ApplicationLoader.applicationContext.getAssets().open(str);
                AndroidUtilities.copyFile(open2, file);
                if (open2 != null) {
                    open2.close();
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        return file;
    }

    public static void q1(boolean z10, boolean z11) {
        boolean z12;
        SparseIntArray clone = tl.clone();
        i6 k10 = I.k(false);
        if (k10 != null) {
            z12 = k10.c(tl, clone);
        } else {
            z12 = true;
        }
        g(tl, clone, I.q());
        f(tl, clone, I.q());
        wl = z12;
        ul = clone;
        if (!z11) {
            r1(!(LaunchActivity.R() instanceof sn));
        }
        k();
        n();
        p();
        j(false, z10);
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.d4(3, !O));
    }

    public static void r(Bitmap bitmap, BitmapShader bitmapShader, Matrix matrix, int i10, int i11, float f10, float f11) {
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

    public static void r1(boolean z10) {
        o9 o9Var = V;
        if (o9Var != null) {
            o9Var.dispose();
            V = null;
        }
        Drawable drawable = f21195e0;
        if (drawable instanceof wc0) {
            S = ((wc0) drawable).f32198i;
        } else {
            S = 0;
        }
        f21195e0 = null;
        f21214f0 = null;
        m1(z10);
    }

    public static void s(View view, View view2, g6 g6Var) {
        if (view != null && view2 != null) {
            int[] iArr = Il;
            view.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            view2.getLocationOnScreen(iArr);
            if (view2 instanceof ec1) {
                Bitmap bitmap = Y;
                if (bitmap != null) {
                    float width = bitmap.getWidth();
                    i10 = (int) ((((view2.getMeasuredWidth() - (Math.max(view2.getMeasuredWidth() / width, view2.getMeasuredHeight() / Y.getHeight()) * width)) / 2.0f) - ((ec1) view2).I) + i10);
                } else {
                    i10 = (int) (i10 + (-((ec1) view2).I));
                }
                i11 = (int) (i11 + (-((ec1) view2).J));
            }
            if (g6Var != null) {
                g6Var.b(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
                return;
            }
            q(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
        }
    }

    public static Drawable s0() {
        Drawable t02 = t0();
        if (t02 == null && d != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Utilities.themeQueue.postRunnable(new p(countDownLatch, 16));
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            return t0();
        }
        return t02;
    }

    public static void s1(boolean z10) {
        if (z10) {
            P = false;
            r1(true);
            return;
        }
        I.v(null);
    }

    public static void t(org.telegram.ui.ActionBar.j6 r11, boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.t(org.telegram.ui.ActionBar.j6, boolean, boolean):void");
    }

    public static Drawable t0() {
        Drawable drawable = f21214f0;
        if (drawable != null) {
            return drawable;
        }
        return f21195e0;
    }

    public static void t1() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("selectedAutoNightType", f21380o);
        edit.putBoolean("autoNightScheduleByLocation", f21398p);
        edit.putFloat("autoNightBrighnessThreshold", f21415q);
        edit.putInt("autoNightDayStartTime", f21434r);
        edit.putInt("autoNightDayEndTime", f21454s);
        edit.putInt("autoNightSunriseTime", v);
        edit.putString("autoNightCityName", f21529w);
        edit.putInt("autoNightSunsetTime", f21473t);
        edit.putLong("autoNightLocationLatitude3", Double.doubleToRawLongBits(f21547x));
        edit.putLong("autoNightLocationLongitude3", Double.doubleToRawLongBits(f21566y));
        edit.putInt("autoNightLastSunCheckDay", f21493u);
        j6 j6Var = J;
        if (j6Var != null) {
            edit.putString("nighttheme", j6Var.m());
        } else {
            edit.remove("nighttheme");
        }
        edit.commit();
    }

    public static j6 u(File file, String str, TLRPC.TL_theme tL_theme, boolean z10) {
        File file2;
        String str2;
        try {
            if (!str.toLowerCase().endsWith(".attheme")) {
                str = str.concat(".attheme");
            }
            if (z10) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
                j6 j6Var = new j6();
                j6Var.f21020a = str;
                j6Var.F = tL_theme;
                j6Var.f21022b = file.getAbsolutePath();
                j6Var.E = UserConfig.selectedAccount;
                M = C0();
                O = true;
                P = false;
                t(j6Var, false, false);
                return j6Var;
            }
            if (tL_theme != null) {
                str2 = "remote" + tL_theme.f20481id;
                file2 = new File(ApplicationLoader.getFilesDirFixed(), str2 + ".attheme");
            } else {
                file2 = new File(ApplicationLoader.getFilesDirFixed(), str);
                str2 = str;
            }
            if (!AndroidUtilities.copyFile(file, file2)) {
                o();
                return null;
            }
            M = null;
            O = false;
            P = false;
            HashMap hashMap = H;
            j6 j6Var2 = (j6) hashMap.get(str2);
            if (j6Var2 == null) {
                j6Var2 = new j6();
                j6Var2.f21020a = str;
                j6Var2.E = UserConfig.selectedAccount;
                ArrayList arrayList = F;
                arrayList.add(j6Var2);
                G.add(j6Var2);
                Collections.sort(arrayList, new l4(2));
            } else {
                hashMap.remove(str2);
            }
            j6Var2.F = tL_theme;
            j6Var2.f21022b = file2.getAbsolutePath();
            hashMap.put(j6Var2.m(), j6Var2);
            v1(true, false);
            t(j6Var2, true, false);
            return j6Var2;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static jx0 u0(int i10) {
        if (i10 < 0 || i10 > 5) {
            return null;
        }
        jx0[] jx0VarArr = f21497u3;
        jx0 jx0Var = jx0VarArr[i10];
        if (jx0Var != null) {
            return jx0Var;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                jx0VarArr[5] = new aq();
                            }
                        } else {
                            jx0VarArr[4] = new vm0(true);
                        }
                    } else {
                        jx0VarArr[3] = new eh0(null, true);
                    }
                } else {
                    jx0VarArr[2] = new xp0(true);
                }
            } else {
                jx0VarArr[1] = new aq(true);
            }
        } else {
            jx0VarArr[0] = new j61(true);
        }
        jx0 jx0Var2 = jx0VarArr[i10];
        jx0Var2.d();
        jx0Var2.b(x0(null, p9, false));
        return jx0Var2;
    }

    public static void u1(org.telegram.ui.ActionBar.j6 r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.u1(org.telegram.ui.ActionBar.j6, boolean, boolean, boolean):void");
    }

    public static int v(int i10, int i11) {
        float alpha = Color.alpha(i11) / 255.0f;
        float alpha2 = Color.alpha(i10) / 255.0f;
        float f10 = 1.0f - alpha;
        float f11 = (alpha2 * f10) + alpha;
        if (f11 == 0.0f) {
            return 0;
        }
        return Color.argb((int) (255.0f * f11), (int) ((((Color.red(i10) * alpha2) * f10) + (Color.red(i11) * alpha)) / f11), (int) ((((Color.green(i10) * alpha2) * f10) + (Color.green(i11) * alpha)) / f11), (int) ((((Color.blue(i10) * alpha2) * f10) + (Color.blue(i11) * alpha)) / f11));
    }

    public static int v0(int i10) {
        return x0(null, i10, false);
    }

    public static void v1(boolean z10, boolean z11) {
        String str;
        boolean z12;
        ArrayList arrayList;
        Integer num;
        JSONObject jSONObject;
        int i10 = 0;
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        if (z10) {
            JSONArray jSONArray = new JSONArray();
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = G;
                if (i11 >= arrayList2.size()) {
                    break;
                }
                j6 j6Var = (j6) arrayList2.get(i11);
                j6Var.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("name", j6Var.f21020a);
                    jSONObject.put("path", j6Var.f21022b);
                    jSONObject.put("account", j6Var.E);
                    TLRPC.TL_theme tL_theme = j6Var.F;
                    if (tL_theme != null) {
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        j6Var.F.serializeToStream(serializedData);
                        jSONObject.put("info", Utilities.bytesToHex(serializedData.toByteArray()));
                    }
                    jSONObject.put("loaded", j6Var.G);
                } catch (Exception e10) {
                    FileLog.e(e10);
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
                j6 j6Var2 = (j6) H.get(str);
                if (j6Var2 == null || (arrayList = j6Var2.f21023b0) == null || arrayList.isEmpty()) {
                    z12 = z11;
                } else {
                    z12 = z11;
                    w1(j6Var2, true, false, false, false, z12);
                }
                i10++;
                z11 = z12;
            }
        }
    }

    public static int w(int i10, boolean z10, boolean z11) {
        int i11;
        float f10;
        if (z10) {
            if (z11) {
                f10 = 0.22f;
            } else {
                f10 = 0.12f;
            }
            return o1(f10, -1);
        }
        if (z11) {
            i11 = -3813931;
        } else {
            i11 = -1972501;
        }
        float[] O02 = O0(3);
        Color.colorToHSV(i10, O02);
        if (O02[1] > 0.02f) {
            return c(i11, i10);
        }
        return i11;
    }

    public static int w0(int i10, g6 g6Var) {
        if (g6Var != null) {
            return g6Var.g(i10);
        }
        return x0(null, i10, false);
    }

    public static void w1(j6 j6Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        if (z10) {
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            if (!z12) {
                int size = j6Var.f21023b0.size();
                int max = Math.max(0, size - j6Var.W);
                SerializedData serializedData = new SerializedData(((max * 16) + 2) * 4);
                serializedData.writeInt32(9);
                serializedData.writeInt32(max);
                for (int i10 = 0; i10 < size; i10++) {
                    i6 i6Var = (i6) j6Var.f21023b0.get(i10);
                    int i11 = i6Var.f20965a;
                    if (i11 >= 100) {
                        serializedData.writeInt32(i11);
                        serializedData.writeInt32(i6Var.f20967c);
                        serializedData.writeInt32(i6Var.d);
                        serializedData.writeInt32(i6Var.e);
                        serializedData.writeInt32(i6Var.f20968f);
                        serializedData.writeInt32(i6Var.f20969g);
                        serializedData.writeInt32(i6Var.h);
                        serializedData.writeBool(i6Var.f20970i);
                        serializedData.writeInt64(i6Var.f20971j);
                        serializedData.writeInt64(i6Var.f20972k);
                        serializedData.writeInt64(i6Var.f20973l);
                        serializedData.writeInt64(i6Var.f20974m);
                        serializedData.writeInt32(i6Var.f20975n);
                        serializedData.writeInt64(0L);
                        serializedData.writeDouble(i6Var.f20977p);
                        serializedData.writeBool(i6Var.f20978q);
                        serializedData.writeString(i6Var.f20976o);
                        if (i6Var.f20979r != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        serializedData.writeBool(z15);
                        if (i6Var.f20979r != null) {
                            serializedData.writeInt32(i6Var.f20981t);
                            i6Var.f20979r.serializeToStream(serializedData);
                        }
                    }
                }
                edit.putString("accents_" + j6Var.d, Base64.encodeToString(serializedData.toByteArray(), 3));
                if (!z14) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
                }
                if (z13) {
                    MessagesController.getInstance(UserConfig.selectedAccount).saveThemeToServer(j6Var, j6Var.k(false));
                }
            }
            edit.putInt("accent_current_" + j6Var.d, j6Var.Y);
            edit.commit();
        } else {
            if (j6Var.Z != -1) {
                if (z11) {
                    i6 i6Var2 = (i6) j6Var.f21021a0.get(j6Var.Y);
                    j6Var.f21021a0.remove(i6Var2.f20965a);
                    j6Var.f21023b0.remove(i6Var2);
                    TLRPC.TL_theme tL_theme = i6Var2.f20979r;
                    if (tL_theme != null) {
                        j6Var.f21025c0.remove(tL_theme.f20481id);
                    }
                }
                j6Var.Y = j6Var.Z;
                i6 k10 = j6Var.k(false);
                if (k10 != null) {
                    j6Var.f21032i0 = k10.f20985y;
                } else {
                    j6Var.f21032i0 = null;
                }
            }
            if (I == j6Var) {
                q1(false, false);
            }
        }
        j6Var.Z = -1;
    }

    public static int x(int i10, boolean z10, boolean z11, boolean z12) {
        int i11;
        float f10;
        if (z10) {
            if (z12) {
                f10 = 0.62f;
            } else {
                f10 = 0.18f;
            }
            return o1(f10, -1);
        }
        if (z12) {
            i11 = -6380376;
        } else {
            i11 = -2565928;
        }
        float[] O02 = O0(3);
        Color.colorToHSV(i10, O02);
        if (z11 && O02[1] > 0.02f) {
            return c(i11, i10);
        }
        return i11;
    }

    public static int x0(boolean[] zArr, int i10, boolean z10) {
        SparseIntArray sparseIntArray;
        int indexOfKey;
        if (!z10 && (sparseIntArray = vl) != null && (indexOfKey = sparseIntArray.indexOfKey(i10)) >= 0) {
            return vl.valueAt(indexOfKey);
        }
        return y0(ul, i10, zArr);
    }

    public static void x1(int i10, int i11, boolean z10) {
        int i12 = f21463s8;
        int i13 = f21126a7;
        int i14 = Qd;
        int i15 = Pd;
        int i16 = Od;
        int i17 = Nd;
        if (i10 == i17 || i10 == i16 || i10 == i15 || i10 == i14 || i10 == f21184d6 || i10 == i13 || i10 == i12 || i10 == M8) {
            i11 |= -16777216;
        }
        if (z10) {
            ul.delete(i10);
        } else {
            ul.put(i10, i11);
        }
        if (i10 == Hc) {
            h(f21195e0);
        } else if (i10 != f21334lc && i10 != f21353mc) {
            if (i10 != i17 && i10 != i16 && i10 != i15 && i10 != i14 && i10 != Rd) {
                if (i10 == i12) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    return;
                } else if (i10 == i13 && Build.VERSION.SDK_INT >= 26) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    return;
                } else {
                    return;
                }
            }
            r1(true);
        } else {
            Drawable drawable = f21195e0;
            if (drawable != null) {
                i(drawable);
            }
        }
    }

    public static int y(int i10, boolean z10, boolean z11) {
        float f10;
        if (z10 && z11) {
            return o1(0.07f, -1);
        }
        float[] O02 = O0(3);
        Color.colorToHSV(i10, O02);
        if (z10) {
            O02[2] = Math.min(1.0f, O02[2] + 0.07f);
            if (z11) {
                O02[1] = Math.min(1.0f, O02[1] + 0.02f);
            }
        } else {
            float f11 = O02[2];
            if (z11) {
                f10 = 0.06f;
            } else {
                f10 = 0.03f;
            }
            O02[2] = Math.max(0.0f, f11 - f10);
            if (z11) {
                float f12 = O02[1];
                if (f12 > 0.02f) {
                    O02[1] = Math.min(1.0f, f12 + 0.02f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), O02);
    }

    public static int y0(android.util.SparseIntArray r7, int r8, boolean[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.y0(android.util.SparseIntArray, int, boolean[]):int");
    }

    public static void y1(Drawable drawable, int i10, boolean z10) {
        Drawable drawable2;
        if (!(drawable instanceof wq)) {
            return;
        }
        if (z10) {
            drawable2 = ((wq) drawable).f32323b;
        } else {
            drawable2 = ((wq) drawable).f32322a;
        }
        if (drawable2 instanceof ColorDrawable) {
            ((ColorDrawable) drawable2).setColor(i10);
        } else {
            drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    public static int z(int i10, boolean z10, boolean z11) {
        float f10 = 0.14f;
        if (z10 && z11) {
            return o1(0.14f, -1);
        }
        float[] O02 = O0(3);
        Color.colorToHSV(i10, O02);
        if (z10) {
            O02[2] = Math.min(1.0f, O02[2] + 0.14f);
            if (z11) {
                O02[1] = Math.min(1.0f, O02[1] + 0.03f);
            }
        } else {
            float f11 = O02[2];
            if (!z11) {
                f10 = 0.12f;
            }
            O02[2] = Math.max(0.0f, f11 - f10);
            if (z11) {
                float f12 = O02[1];
                if (f12 > 0.02f) {
                    O02[1] = Math.min(1.0f, f12 + 0.04f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), O02);
    }

    public static j8 z0() {
        if (f21183d5 == null) {
            f21183d5 = new j8();
        }
        return f21183d5;
    }

    public static void z1(int i10, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof jx0) {
            ((jx0) drawable).b(i10);
        } else if (drawable instanceof dd0) {
            ((dd0) drawable).a(i10);
        } else if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i10);
        } else if (drawable instanceof ym0) {
            ((ym0) drawable).b(i10);
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }
}
