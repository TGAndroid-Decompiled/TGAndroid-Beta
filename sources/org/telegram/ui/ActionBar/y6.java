package org.telegram.ui.ActionBar;

import a8.ee;
import a8.me;
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
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.i20;
import org.telegram.ui.Components.n8;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.se0;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ic1;
import org.telegram.ui.un;
public abstract class y6 {
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
    public static i20 Cl;
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
    public static k6.c Dl;
    public static TextPaint E0;
    public static int E1;
    public static TextPaint E2;
    public static bd0 E3;
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
    public static final f6 Hl;
    public static x6 I;
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
    public static x6 J;
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
    public static x6 K;
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
    public static final x6 L;
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
    public static int Ll;
    public static x6 M;
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
    public static final Paint Rl;
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
    public static s9 V;
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
    public static bd0 X0;
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
    public static Matrix f23293a0;
    public static Drawable f23294a1;
    public static Paint a2;
    public static TextPaint f23295a3;
    public static Drawable f23296a4;
    public static final int f23298a6;
    public static final int f23299a7;
    public static final int f23300a8;
    public static final int f23301a9;
    public static final int f23302aa;
    public static final int f23303ab;
    public static final int f23304ac;
    public static final int ad;
    public static final int f23305ae;
    public static final int f23306af;
    public static final int f23307ag;
    public static final int f23308ah;
    public static final int f23309ai;
    public static final int aj;
    public static final int ak;
    public static final int al;
    public static boolean f23310b;
    public static int f23311b0;
    public static Drawable f23312b1;
    public static Paint f23313b2;
    public static TextPaint f23314b3;
    public static Drawable f23315b4;
    public static Drawable f23316b5;
    public static final int f23317b6;
    public static final int f23318b7;
    public static final int f23319b8;
    public static final int f23320b9;
    public static final int f23321ba;
    public static final int f23322bb;
    public static final int f23323bc;
    public static final int f23324bd;
    public static final int f23325be;
    public static final int f23326bf;
    public static final int f23327bg;
    public static final int f23328bh;
    public static final int f23329bi;
    public static final int bj;
    public static final int bk;
    public static final int bl;
    public static int f23331c0;
    public static Drawable f23332c1;
    public static Paint f23333c2;
    public static TextPaint f23334c3;
    public static Drawable f23335c4;
    public static Drawable f23336c5;
    public static final int f23337c6;
    public static final int f23338c7;
    public static final int f23339c8;
    public static final int f23340c9;
    public static final int f23341ca;
    public static final int f23342cb;
    public static final int f23343cc;
    public static final int f23344cd;
    public static final int f23345ce;
    public static final int f23346cf;
    public static final int f23347cg;
    public static final int f23348ch;
    public static final int f23349ci;
    public static final int cj;
    public static final int ck;
    public static final int cl;
    public static ig.u0 d;
    public static int f23350d0;
    public static Drawable f23351d1;
    public static Paint f23352d2;
    public static TextPaint f23353d3;
    public static Drawable f23354d4;
    public static n8 f23355d5;
    public static final int f23356d6;
    public static final int f23357d7;
    public static final int f23358d8;
    public static final int f23359d9;
    public static final int f23360da;
    public static final int f23361db;
    public static final int f23362dc;
    public static final int f23363dd;
    public static final int f23364de;
    public static final int f23365df;
    public static final int f23366dg;
    public static final int f23367dh;
    public static final int f23368di;
    public static final int dj;
    public static final int dk;
    public static final int dl;
    public static SensorManager e;
    public static Drawable f23369e0;
    public static Drawable f23370e1;
    public static Paint f23371e2;
    public static TextPaint f23372e3;
    public static Drawable f23373e4;
    public static HashMap f23374e5;
    public static final int f23375e6;
    public static final int f23376e7;
    public static final int f23377e8;
    public static final int f23378e9;
    public static final int f23379ea;
    public static final int eb;
    public static final int f23380ec;
    public static final int ed;
    public static final int f23381ee;
    public static final int f23382ef;
    public static final int f23383eg;
    public static final int f23384eh;
    public static final int f23385ei;
    public static final int ej;
    public static final int ek;
    public static final int el;
    public static Sensor f23386f;
    public static Drawable f23387f0;
    public static Drawable f23388f1;
    public static Paint f23389f2;
    public static TextPaint f23390f3;
    public static Drawable f23391f4;
    public static final int f23392f5;
    public static final int f23393f6;
    public static final int f7;
    public static final int f23394f8;
    public static final int f23395f9;
    public static final int f23396fa;
    public static final int f23397fb;
    public static final int f23398fc;
    public static final int f23399fd;
    public static final int f23400fe;
    public static final int f23401ff;
    public static final int f23402fg;
    public static final int f23403fh;
    public static final int f23404fi;
    public static final int fj;
    public static final int fk;
    public static final int fl;
    public static boolean f23405g;
    public static int f23406g0;
    public static en0 f23407g1;
    public static Paint f23408g2;
    public static TextPaint f23409g3;
    public static Drawable f23410g4;
    public static final int f23411g5;
    public static final int f23412g6;
    public static final int g7;
    public static final int f23413g8;
    public static final int f23414g9;
    public static final int f23415ga;
    public static final int f23416gb;
    public static final int gc;
    public static final int f23417gd;
    public static final int f23418ge;
    public static final int f23419gf;
    public static final int gg;
    public static final int f23420gh;
    public static final int f23421gi;
    public static final int gj;
    public static final int gk;
    public static final int gl;
    public static String f23422h0;
    public static en0 f23423h1;
    public static Paint f23424h2;
    public static Drawable f23425h3;
    public static Drawable f23426h4;
    public static final int f23427h5;
    public static final int f23428h6;
    public static final int f23429h7;
    public static final int f23430h8;
    public static final int f23431h9;
    public static final int f23432ha;
    public static final int f23433hb;
    public static final int f23434hc;
    public static final int f23435hd;
    public static final int f23436he;
    public static final int f23437hf;
    public static final int f23438hg;
    public static final int f23439hh;
    public static final int f23440hi;
    public static final int hj;
    public static final int hk;
    public static final int hl;
    public static long f23441i;
    public static boolean f23442i0;
    public static Drawable f23443i1;
    public static Paint f23444i2;
    public static Drawable f23445i3;
    public static Drawable f23446i4;
    public static final int f23447i5;
    public static final int f23448i6;
    public static final int f23449i7;
    public static final int f23450i8;
    public static final int f23451i9;
    public static final int ia;
    public static final int f23452ib;
    public static final int f23453ic;
    public static final int f23454id;
    public static final int ie;
    public static final int f23455ig;
    public static final int f23456ih;
    public static final int f23457ii;
    public static final int ij;
    public static final int ik;
    public static final int il;
    public static boolean f23458j;
    public static boolean f23459j0;
    public static Drawable f23460j1;
    public static Paint f23461j2;
    public static Drawable f23462j3;
    public static Drawable f23463j4;
    public static final int f23464j5;
    public static final int f23465j6;
    public static final int f23466j7;
    public static final int f23467j8;
    public static final int f23468j9;
    public static final int ja;
    public static final int f23469jb;
    public static final int f23470jc;
    public static final int f23471jd;
    public static final int f23472je;
    public static final int f23473jf;
    public static final int f23474jg;
    public static final int f23475jh;
    public static final int f23476ji;
    public static final int jj;
    public static final int jk;
    public static final int jl;
    public static boolean f23477k;
    public static Paint f23478k0;
    public static Drawable f23479k1;
    public static Paint f23480k2;
    public static fi.u3 f23481k3;
    public static Drawable f23482k4;
    public static final int f23483k5;
    public static final int f23484k6;
    public static final int f23485k7;
    public static final int f23486k8;
    public static final int f23487k9;
    public static final int f23488ka;
    public static final int f23489kb;
    public static final int f23490kc;
    public static final int f23491kd;
    public static final int f23492ke;
    public static final int f23493kf;
    public static final int f23494kg;
    public static final int f23495kh;
    public static final int f23496ki;
    public static final int kj;
    public static final int kk;
    public static final int kl;
    public static Paint f23498l0;
    public static Drawable l1;
    public static Paint f23499l2;
    public static Drawable f23500l3;
    public static Drawable l4;
    public static final int f23501l5;
    public static final int f23502l6;
    public static final int f23503l7;
    public static final int f23504l8;
    public static final int f23505l9;
    public static final int f23506la;
    public static final int f23507lb;
    public static final int f23508lc;
    public static final int f23509ld;
    public static final int f23510le;
    public static final int lf;
    public static final int f23511lg;
    public static final int f23512lh;
    public static final int f23513li;
    public static final int lj;
    public static final int lk;
    public static final int ll;
    public static Paint m0;
    public static Drawable f23515m1;
    public static Paint f23516m2;
    public static l5 f23517m3;
    public static Drawable f23518m4;
    public static final int f23519m5;
    public static final int f23520m6;
    public static final int f23521m7;
    public static final int f23522m8;
    public static final int f23523m9;
    public static final int f23524ma;
    public static final int f23525mb;
    public static final int f23526mc;
    public static final int f23527md;
    public static final int f23528me;
    public static final int f23529mf;
    public static final int f23530mg;
    public static final int f23531mh;
    public static final int f23532mi;
    public static final int mj;
    public static final int mk;
    public static final HashMap ml;
    public static Paint f23534n0;
    public static Drawable f23535n1;
    public static Paint f23536n2;
    public static l5 f23537n3;
    public static Drawable f23538n4;
    public static final int f23539n5;
    public static final int f23540n6;
    public static final int f23541n7;
    public static final int f23542n8;
    public static final int f23543n9;
    public static final int f23544na;
    public static final int f23545nb;
    public static final int f23546nc;
    public static final int f23547nd;
    public static final int f23548ne;
    public static final int f23549nf;
    public static final int f23550ng;
    public static final int f23551nh;
    public static final int f23552ni;
    public static final int nj;
    public static final int nk;
    public static final HashMap nl;
    public static int f23553o;
    public static Paint f23554o0;
    public static Drawable f23555o1;
    public static TextPaint f23556o2;
    public static l5 f23557o3;
    public static Drawable f23558o4;
    public static final int f23559o5;
    public static final int f23560o6;
    public static final int f23561o7;
    public static final int f23562o8;
    public static final int f23563o9;
    public static final int f23564oa;
    public static final int f23565ob;
    public static final int f23566oc;
    public static final int f23567od;
    public static final int f23568oe;
    public static final int f23569of;
    public static final int f23570og;
    public static final int f23571oh;
    public static final int f23572oi;
    public static final int oj;
    public static final int ok;
    public static final HashMap ol;
    public static boolean f23573p;
    public static Paint f23574p0;
    public static Drawable f23575p1;
    public static TextPaint f23576p2;
    public static l5 f23577p3;
    public static Drawable f23578p4;
    public static final int f23579p5;
    public static final int f23580p6;
    public static final int f23581p7;
    public static final int[] f23582p8;
    public static final int f23583p9;
    public static final int f23584pa;
    public static final int pb;
    public static final int pc;
    public static final int f23585pd;
    public static final int f23586pe;
    public static final int f23587pf;
    public static final int f23588pg;
    public static final int f23589ph;
    public static final int f23590pi;
    public static final int pj;
    public static final int pk;
    public static final HashMap pl;
    public static float f23591q;
    public static Paint f23592q0;
    public static Drawable f23593q1;
    public static TextPaint f23594q2;
    public static l5 f23595q3;
    public static Drawable f23596q4;
    public static final int q5;
    public static final int f23597q6;
    public static final int f23598q7;
    public static final int[] f23599q8;
    public static final int q9;
    public static final int f23600qa;
    public static final int f23601qb;
    public static final int f23602qc;
    public static final int f23603qd;
    public static final int qe;
    public static final int f23604qf;
    public static final int f23605qg;
    public static final int f23606qh;
    public static final int f23607qi;
    public static final int qj;
    public static final int qk;
    public static final int[] ql;
    public static int f23608r;
    public static Drawable f23610r1;
    public static TextPaint f23611r2;
    public static l5 f23612r3;
    public static Drawable f23613r4;
    public static final int f23614r5;
    public static final int r6;
    public static final int f23615r7;
    public static final int[] f23616r8;
    public static final int f23617r9;
    public static final int f23618ra;
    public static final int f23619rb;
    public static final int f23620rc;
    public static final int f23621rd;
    public static final int f23622re;
    public static final int f23623rf;
    public static final int f23624rg;
    public static final int f23625rh;
    public static final int f23626ri;
    public static final int rj;
    public static final int rk;
    public static final SparseIntArray rl;
    public static int f23627s;
    public static Drawable f23628s0;
    public static Drawable f23629s1;
    public static TextPaint f23630s2;
    public static l5 f23631s3;
    public static Drawable f23632s4;
    public static final int f23633s5;
    public static final int f23634s6;
    public static final int f23635s7;
    public static final int f23636s8;
    public static final int f23637s9;
    public static final int f23638sa;
    public static final int f23639sb;
    public static final int f23640sc;
    public static final int f23641sd;
    public static final int f23642se;
    public static final int f23643sf;
    public static final int f23644sg;
    public static final int f23645sh;
    public static final int f23646si;
    public static final int sj;
    public static final int sk;
    public static final HashSet sl;
    public static int f23647t;
    public static Paint f23648t0;
    public static Drawable f23649t1;
    public static TextPaint f23650t2;
    public static l5 f23651t3;
    public static Drawable f23652t4;
    public static final int f23653t5;
    public static final int f23654t6;
    public static final int f23655t7;
    public static final int f23656t8;
    public static final int f23657t9;
    public static final int f23658ta;
    public static final int f23659tb;
    public static final int f23660tc;
    public static final int td;
    public static final int f23661te;
    public static final int f23662tf;
    public static final int f23663tg;
    public static final int f23664th;
    public static final int f23665ti;
    public static final int tj;
    public static final int tk;
    public static SparseIntArray tl;
    public static int f23666u;
    public static Paint f23667u0;
    public static xj0 f23668u1;
    public static TextPaint f23669u2;
    public static Drawable f23671u4;
    public static final int f23672u5;
    public static final int f23673u6;
    public static final int f23674u7;
    public static final int f23675u8;
    public static final int f23676u9;
    public static final int f23677ua;
    public static final int f23678ub;
    public static final int f23679uc;
    public static final int f23680ud;
    public static final int f23681ue;
    public static final int f23682uf;
    public static final int f23683ug;
    public static final int f23684uh;
    public static final int f23685ui;
    public static final int uj;
    public static final int uk;
    public static SparseIntArray ul;
    public static int v;
    public static Paint f23686v0;
    public static xj0 f23687v1;
    public static TextPaint f23688v2;
    public static PorterDuffColorFilter f23689v3;
    public static Drawable f23690v4;
    public static final int f23691v5;
    public static final int f23692v6;
    public static final int f23693v7;
    public static final int f23694v8;
    public static final int f23695v9;
    public static final int va;
    public static final int f23696vb;
    public static final int f23697vc;
    public static final int f23698vd;
    public static final int f23699ve;
    public static final int f23700vf;
    public static final int f23701vg;
    public static final int f23702vh;
    public static final int f23703vi;
    public static final int vj;
    public static final int vk;
    public static SparseIntArray vl;
    public static String f23704w;
    public static Paint f23705w0;
    public static xj0 f23706w1;
    public static TextPaint f23707w2;
    public static PorterDuffColorFilter f23708w3;
    public static Drawable f23709w4;
    public static final int f23710w5;
    public static final int f23711w6;
    public static final int f23712w7;
    public static final int f23713w8;
    public static final int f23714w9;
    public static final int f23715wa;
    public static final int f23716wb;
    public static final int f23717wc;
    public static final int f23718wd;
    public static final int f23719we;
    public static final int f23720wf;
    public static final int f23721wg;
    public static final int f23722wh;
    public static final int f23723wi;
    public static final int wj;
    public static final int wk;
    public static boolean wl;
    public static double f23724x;
    public static Paint f23725x0;
    public static xj0 f23726x1;
    public static TextPaint f23727x2;
    public static se0 f23728x3;
    public static Drawable f23729x4;
    public static final int f23730x5;
    public static final int f23731x6;
    public static final int f23732x7;
    public static final int f23733x8;
    public static final int x9;
    public static final int f23734xa;
    public static final int f23735xb;
    public static final int f23736xc;
    public static final int f23737xd;
    public static final int f23738xe;
    public static final int f23739xf;
    public static final int f23740xg;
    public static final int f23741xh;
    public static final int xi;
    public static final int xj;
    public static final int xk;
    public static final ThreadLocal xl;
    public static double f23742y;
    public static Paint f23743y0;
    public static xj0 f23744y1;
    public static TextPaint[] f23745y2;
    public static Drawable y3;
    public static Drawable f23746y4;
    public static final int f23747y5;
    public static final int f23748y6;
    public static final int f23749y7;
    public static final int f23750y8;
    public static final int f23751y9;
    public static final int f23752ya;
    public static final int f23753yb;
    public static final int f23754yc;
    public static final int f23755yd;
    public static final int f23756ye;
    public static final int f23757yf;
    public static final int f23758yg;
    public static final int f23759yh;
    public static final int yi;
    public static final int yj;
    public static final int yk;
    public static final ThreadLocal yl;
    public static Paint f23761z0;
    public static xj0 f23762z1;
    public static TextPaint f23763z2;
    public static Drawable f23764z3;
    public static Drawable f23765z4;
    public static final int f23766z5;
    public static final int f23767z6;
    public static final int f23768z7;
    public static final int f23769z8;
    public static final int f23770z9;
    public static final int f23771za;
    public static final int f23772zb;
    public static final int zc;
    public static final int f23773zd;
    public static final int f23774ze;
    public static final int zf;
    public static final int f23775zg;
    public static final int f23776zh;
    public static final int zi;
    public static final int zj;
    public static final int zk;
    public static final ThreadLocal zl;
    public static final int f23292a = i0.a.o(-16777216, 27);
    public static final Object f23330c = new Object();
    public static float h = 1.0f;
    public static final androidx.emoji2.text.n f23497l = new androidx.emoji2.text.n(3);
    public static final androidx.emoji2.text.n f23514m = new androidx.emoji2.text.n(4);
    public static final int f23533n = 99;
    public static final Paint f23760z = new Paint(1);
    public static final boolean[] C = new boolean[4];
    public static final int[] D = new int[4];
    public static final long[] E = new long[4];
    public static final Drawable[] f23609r0 = new Drawable[25];
    public static final rx0[] f23670u3 = new rx0[6];
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
    public static final Path[] f23297a5 = new Path[3];

    static {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.y6.<clinit>():void");
    }

    public static void A() {
        if (f23553o != 2) {
            if (f23477k) {
                f23477k = false;
                AndroidUtilities.cancelRunOnUIThread(f23514m);
            }
            if (f23458j) {
                f23458j = false;
                AndroidUtilities.cancelRunOnUIThread(f23497l);
            }
            if (f23405g) {
                h = 1.0f;
                e.unregisterListener(Hl, f23386f);
                f23405g = false;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("light sensor unregistered");
                }
            }
        }
    }

    public static android.graphics.drawable.Drawable A0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.y6.A0():android.graphics.drawable.Drawable");
    }

    public static void A1(int i10, Drawable drawable) {
        z1(x0(null, i10, false), drawable);
    }

    public static int B(x6 x6Var, int i10, int i11) {
        int i12;
        if (i10 != 0 && (i12 = x6Var.X) != 0 && i10 != i12 && (!x6Var.S || x6Var.Y != f23533n)) {
            float[] O02 = O0(3);
            float[] O03 = O0(4);
            Color.colorToHSV(x6Var.X, O02);
            Color.colorToHSV(i10, O03);
            return D(O02, O03, i11, x6Var.q(), i11);
        }
        return i11;
    }

    public static String B0() {
        x6 x6Var = J;
        if (x6Var == null) {
            return "";
        }
        String n10 = x6Var.n();
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

    public static x6 C0() {
        x6 x6Var = K;
        if (x6Var != null) {
            return x6Var;
        }
        return L;
    }

    public static void C1(org.telegram.ui.Cells.y yVar, float f10, float f11, float f12, float f13) {
        if (c3.h0.t(yVar)) {
            int numberOfLayers = yVar.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable = yVar.getDrawable(i10);
                if (drawable instanceof v6) {
                    v6 v6Var = (v6) drawable;
                    float[] fArr = v6Var.f23162b;
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
                    v6Var.f23163c = true;
                    v6Var.invalidateSelf();
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
        float C10 = a1.g.C(0.39999998f, computePerceivedBrightness, computePerceivedBrightness2, 0.6f);
        int red = (int) (Color.red(HSVToColor) * C10);
        int green = (int) (Color.green(HSVToColor) * C10);
        int blue = (int) (Color.blue(HSVToColor) * C10);
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
        w6 k10 = I.k(false);
        if (k10 == null) {
            return 0;
        }
        float[] O02 = O0(1);
        float[] O03 = O0(2);
        Color.colorToHSV(I.X, O02);
        Color.colorToHSV(k10.f23217c, O03);
        return D(O02, O03, valueAt, I.q(), valueAt);
    }

    public static void D1(org.telegram.ui.Cells.y yVar, int i10, int i11) {
        if (c3.h0.t(yVar)) {
            int numberOfLayers = yVar.getNumberOfLayers();
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                Drawable drawable = yVar.getDrawable(i12);
                if (drawable instanceof v6) {
                    v6 v6Var = (v6) drawable;
                    float f10 = i10;
                    float f11 = i11;
                    float[] fArr = v6Var.f23162b;
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
                    v6Var.f23163c = true;
                    v6Var.invalidateSelf();
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
                if (f23477k) {
                    f23477k = false;
                    AndroidUtilities.cancelRunOnUIThread(f23514m);
                }
                if (f23458j) {
                    f23458j = false;
                    AndroidUtilities.cancelRunOnUIThread(f23497l);
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
                f23441i = 0L;
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
            if ((i10 < f23771za || i10 >= Ga) && i10 != D9 && i10 != N9 && i10 != E9 && i10 != Pd && i10 != Qd) {
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
        x6 x6Var;
        int i10;
        if (A == 0) {
            if (z10 || Math.abs((System.currentTimeMillis() / 1000) - B) >= 3600) {
                for (int i11 = 0; i11 < 2; i11++) {
                    if (i11 == 0) {
                        x6Var = K;
                    } else {
                        x6Var = J;
                    }
                    if (x6Var != null && UserConfig.getInstance(x6Var.E).isClientActivated()) {
                        w6 k10 = x6Var.k(false);
                        TLRPC.TL_theme tL_theme = x6Var.F;
                        if (tL_theme != null) {
                            i10 = x6Var.E;
                        } else if (k10 != null && (tL_theme = k10.f23229r) != null) {
                            i10 = UserConfig.selectedAccount;
                        }
                        if (tL_theme.document != null) {
                            A++;
                            TL_account.getTheme gettheme = new TL_account.getTheme();
                            gettheme.document_id = tL_theme.document.f22033id;
                            gettheme.format = "android";
                            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                            tL_inputTheme.access_hash = tL_theme.access_hash;
                            tL_inputTheme.f22098id = tL_theme.f22166id;
                            gettheme.theme = tL_inputTheme;
                            ConnectionsManager.getInstance(i10).sendRequest(gettheme, new bi.h2(k10, x6Var, tL_theme, 12));
                        }
                    }
                }
            }
        }
    }

    public static i20 F0() {
        if (Cl == null) {
            ?? obj = new Object();
            obj.f29158a = new h20[4];
            obj.f29165k = 1.0f;
            obj.f29166l = new ArrayList();
            obj.f29167m = new Paint(1);
            obj.f29168n = new Path();
            for (int i10 = 0; i10 < 4; i10++) {
                obj.f29158a[i10] = new h20(i10);
            }
            Cl = obj;
        }
        return Cl;
    }

    public static void F1(x6 x6Var, w6 w6Var, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
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
                if (x6Var == null) {
                    String r02 = r0(themeSettings);
                    if (r02 != null && (x6Var = (x6) hashMap.get(r02)) != null) {
                        w6Var = (w6) x6Var.f23256c0.get(tL_theme.f22166id);
                    } else {
                        return;
                    }
                }
                if (w6Var != null) {
                    TLRPC.TL_theme tL_theme2 = w6Var.f23229r;
                    if (tL_theme2 != null) {
                        x6Var.f23256c0.remove(tL_theme2.f22166id);
                    }
                    w6Var.f23229r = tL_theme;
                    w6Var.f23231t = i10;
                    x6Var.f23256c0.put(tL_theme.f22166id, w6Var);
                    if (!x6.a(w6Var, themeSettings)) {
                        File d10 = w6Var.d();
                        if (d10 != null) {
                            d10.delete();
                        }
                        x6.i(w6Var, themeSettings);
                        x6 x6Var2 = I;
                        if (x6Var2 == x6Var && x6Var2.Y == w6Var.f23215a) {
                            q1(false, false);
                            x6 x6Var3 = I;
                            if (J == x6Var3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            H1(x6Var3, z12, -1, null);
                        }
                        t6.a(true);
                    }
                    TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                    if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.motion) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    w6Var.f23228q = z11;
                    x6Var.T = false;
                } else {
                    return;
                }
            } else {
                if (x6Var != null) {
                    str = x6Var.m();
                    hashMap.remove(str);
                } else {
                    str = "remote" + tL_theme.f22166id;
                    x6Var = (x6) hashMap.get(str);
                }
                if (x6Var == null) {
                    return;
                }
                x6Var.F = tL_theme;
                x6Var.f23251a = tL_theme.title;
                File file = new File(x6Var.f23253b);
                File file2 = new File(ApplicationLoader.getFilesDirFixed(), b10.u(str, ".attheme"));
                if (!file.equals(file2)) {
                    try {
                        AndroidUtilities.copyFile(file, file2);
                        x6Var.f23253b = file2.getAbsolutePath();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (z10) {
                    x6Var.G = false;
                    x6Var.f23261g0 = null;
                    x6Var.f23262h0 = null;
                    NotificationCenter.getInstance(x6Var.E).addObserver(x6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(x6Var.E).addObserver(x6Var, NotificationCenter.fileLoadFailed);
                    FileLoader fileLoader = FileLoader.getInstance(x6Var.E);
                    TLRPC.TL_theme tL_theme3 = x6Var.F;
                    fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                } else {
                    x6Var.T = false;
                }
                hashMap.put(x6Var.m(), x6Var);
            }
            v1(true, false);
        }
    }

    public static void G(SparseIntArray sparseIntArray, x6 x6Var) {
        if (x6Var != null && x6Var.f23264j0 == -1) {
            int i10 = f23356d6;
            if (i0.a.h(i0.a.f(0.5f, H0(sparseIntArray, i10), H0(sparseIntArray, i10))) < 0.5d) {
                x6Var.f23264j0 = 1;
            } else {
                x6Var.f23264j0 = 0;
            }
        }
    }

    public static int G0(int i10) {
        return x0(null, i10, true);
    }

    public static void G1(x6 x6Var) {
        Collections.sort(x6Var.f23254b0, new n4(3));
    }

    public static me H(x6 x6Var, SparseIntArray sparseIntArray, String str, int i10, boolean z10) {
        boolean z11;
        File file;
        boolean z12;
        float f10;
        float f11;
        if (x6Var.S && x6Var.Y == f23533n) {
            z11 = true;
        } else {
            z11 = false;
        }
        w6 k10 = x6Var.k(false);
        if (k10 != null) {
            file = k10.d();
        } else {
            file = null;
        }
        if (k10 != null && k10.f23228q) {
            z12 = true;
        } else {
            z12 = false;
        }
        r6 r6Var = x6Var.f23263i0;
        if (r6Var != null) {
            f11 = r6Var.f23057k;
        } else if (k10 != null) {
            f11 = k10.f23227p;
        } else {
            f10 = x6Var.f23270y;
            return I(x6Var, r6Var, sparseIntArray, file, str, tl.get(f23411g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
        }
        f10 = f11 * 100.0f;
        return I(x6Var, r6Var, sparseIntArray, file, str, tl.get(f23411g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
    }

    public static int H0(SparseIntArray sparseIntArray, int i10) {
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return ql[i10];
    }

    public static void H1(x6 x6Var, boolean z10, int i10, View view) {
        int[] iArr = new int[2];
        if (view != null && view.isAttachedToWindow()) {
            view.getLocationInWindow(iArr);
            iArr[0] = (view.getMeasuredWidth() / 2) + iArr[0];
            iArr[1] = (view.getMeasuredHeight() / 2) + iArr[1];
        } else {
            iArr[0] = AndroidUtilities.displaySize.x / 2;
            iArr[1] = 0;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, x6Var, Boolean.valueOf(z10), iArr, Integer.valueOf(i10), Boolean.TRUE, null);
    }

    public static a8.me I(org.telegram.ui.ActionBar.x6 r24, org.telegram.ui.ActionBar.r6 r25, android.util.SparseIntArray r26, java.io.File r27, java.lang.String r28, int r29, int r30, int r31, boolean r32, boolean r33, boolean r34, boolean r35, org.telegram.tgnet.TLRPC.Document r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.y6.I(org.telegram.ui.ActionBar.x6, org.telegram.ui.ActionBar.r6, android.util.SparseIntArray, java.io.File, java.lang.String, int, int, int, boolean, boolean, boolean, boolean, org.telegram.tgnet.TLRPC$Document, boolean):a8.me");
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
        if (!z10 && f23517m3 == null) {
            Resources resources = context.getResources();
            f23425h3 = resources.getDrawable(R.drawable.video_muted);
            f23500l3 = resources.getDrawable(R.drawable.media_live_on).mutate();
            f23517m3 = new l5(0, false, false, null);
            f23537n3 = new l5(0, false, true, null);
            f23557o3 = new l5(0, true, false, null);
            f23577p3 = new l5(0, true, true, null);
            f23595q3 = new l5(1, false, false, null);
            f23612r3 = new l5(1, false, true, null);
            f23631s3 = new l5(1, true, false, null);
            f23651t3 = new l5(1, true, true, null);
            ?? obj = new Object();
            obj.f32525a = new Path();
            obj.f32526b = -1.0f;
            obj.f32529g = new ArrayList();
            obj.f32527c = 0.293f;
            obj.d = -26.0f;
            obj.e = -28.0f;
            obj.f32528f = 1.0f;
            f23728x3 = obj;
            obj.a("M 34.141 16.042 C 37.384 17.921 40.886 20.001 44.211 21.965 C 46.139 23.104 49.285 24.729 49.586 25.917 C 50.289 28.687 48.484 30 46.274 30 L 6 30.021 C 3.79 30.021 2.075 30.023 2 26.021 L 2.009 3.417 C 2.009 0.417 5.326 -0.58 7.068 0.417 C 10.545 2.406 25.024 10.761 34.141 16.042 Z", 166.0f);
            f23728x3.a("M 37.843 17.769 C 41.143 19.508 44.131 21.164 47.429 23.117 C 48.542 23.775 49.623 24.561 49.761 25.993 C 50.074 28.708 48.557 30 46.347 30 L 6 30.012 C 3.79 30.012 2 28.222 2 26.012 L 2.009 4.609 C 2.009 1.626 5.276 0.664 7.074 1.541 C 10.608 3.309 28.488 12.842 37.843 17.769 Z", 200.0f);
            f23728x3.a("M 40.644 18.756 C 43.986 20.389 49.867 23.108 49.884 25.534 C 49.897 27.154 49.88 24.441 49.894 26.059 C 49.911 28.733 48.6 30 46.39 30 L 6 30.013 C 3.79 30.013 2 28.223 2 26.013 L 2.008 5.52 C 2.008 2.55 5.237 1.614 7.079 2.401 C 10.656 4 31.106 14.097 40.644 18.756 Z", 217.0f);
            f23728x3.a("M 43.782 19.218 C 47.117 20.675 50.075 21.538 50.041 24.796 C 50.022 26.606 50.038 24.309 50.039 26.104 C 50.038 28.736 48.663 30 46.453 30 L 6 29.986 C 3.79 29.986 2 28.196 2 25.986 L 2.008 6.491 C 2.008 3.535 5.196 2.627 7.085 3.316 C 10.708 4.731 33.992 14.944 43.782 19.218 Z", 234.0f);
            f23728x3.a("M 47.421 16.941 C 50.544 18.191 50.783 19.91 50.769 22.706 C 50.761 24.484 50.76 23.953 50.79 26.073 C 50.814 27.835 49.334 30 47.124 30 L 5 30.01 C 2.79 30.01 1 28.22 1 26.01 L 1.001 10.823 C 1.001 8.218 3.532 6.895 5.572 7.26 C 7.493 8.01 47.421 16.941 47.421 16.941 Z", 267.0f);
            f23728x3.a("M 47.641 17.125 C 50.641 18.207 51.09 19.935 51.078 22.653 C 51.07 24.191 51.062 21.23 51.088 23.063 C 51.109 24.886 49.587 27 47.377 27 L 5 27.009 C 2.79 27.009 1 25.219 1 23.009 L 0.983 11.459 C 0.983 8.908 3.414 7.522 5.476 7.838 C 7.138 8.486 47.641 17.125 47.641 17.125 Z", 300.0f);
            f23728x3.a("M 48 7 C 50.21 7 52 8.79 52 11 C 52 19 52 19 52 19 C 52 21.21 50.21 23 48 23 L 4 23 C 1.79 23 0 21.21 0 19 L 0 11 C 0 8.79 1.79 7 4 7 C 48 7 48 7 48 7 Z", 383.0f);
            y3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            f23764z3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            A3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            B3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            F3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            H3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            C3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            D3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            G3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            I3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            E3 = new bd0();
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
            f23296a4 = resources.getDrawable(R.drawable.msg_views).mutate();
            f23315b4 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            J3 = resources.getDrawable(R.drawable.msg_views).mutate();
            K3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            f23335c4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f23354d4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f23373e4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f23391f4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f23410g4 = resources.getDrawable(R.drawable.video_actions);
            f23426h4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            f23446i4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            f23463j4 = resources.getDrawable(R.drawable.msg_warning);
            f23482k4 = resources.getDrawable(R.drawable.list_mute).mutate();
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
            f23518m4 = resources.getDrawable(R.drawable.bot_file);
            f23538n4 = resources.getDrawable(R.drawable.bot_music);
            f23558o4 = resources.getDrawable(R.drawable.bot_location);
            f23690v4 = resources.getDrawable(R.drawable.bot_link);
            f23729x4 = resources.getDrawable(R.drawable.bot_lines);
            f23709w4 = resources.getDrawable(R.drawable.bot_card);
            f23746y4 = resources.getDrawable(R.drawable.bot_webview);
            f23765z4 = resources.getDrawable(R.drawable.bot_invite);
            A4 = resources.getDrawable(R.drawable.permission_locked);
            B4 = resources.getDrawable(R.drawable.msg_msgbubble);
            C4 = resources.getDrawable(R.drawable.msg_msgbubble2);
            D4 = resources.getDrawable(R.drawable.msg_arrowright);
            E4 = resources.getDrawable(R.drawable.gradient_left);
            F4 = resources.getDrawable(R.drawable.gradient_right);
            f23578p4 = resources.getDrawable(R.drawable.header_shadow).mutate();
            R4 = resources.getDrawable(R.drawable.nophotos3);
            f23596q4 = resources.getDrawable(R.drawable.filled_button_share).mutate();
            f23613r4 = resources.getDrawable(R.drawable.filled_button_reply);
            f23632s4 = resources.getDrawable(R.drawable.msg_voiceclose).mutate();
            f23652t4 = resources.getDrawable(R.drawable.media_more).mutate();
            f23671u4 = resources.getDrawable(R.drawable.filled_open_message);
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
            f23316b5 = resources.getDrawable(R.drawable.filled_fire).mutate();
            f23336c5 = resources.getDrawable(R.drawable.msg_round_gif_m).mutate();
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
            ar M10 = M(AndroidUtilities.dp(44.0f), R.drawable.msg_contact);
            Drawable[] drawableArr7 = T4;
            drawableArr7[0] = M10;
            drawableArr7[1] = M(AndroidUtilities.dp(44.0f), R.drawable.msg_contact);
            Drawable mutate5 = resources.getDrawable(R.drawable.msg_location).mutate();
            Drawable[] drawableArr8 = S4;
            drawableArr8[0] = mutate5;
            drawableArr8[1] = resources.getDrawable(R.drawable.msg_location).mutate();
            f23445i3 = context.getResources().getDrawable(R.drawable.compose_panel_shadow).mutate();
            f23462j3 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            fi.u3 u3Var = new fi.u3();
            Paint paint = new Paint(1);
            u3Var.f11748b = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
            f23481k3 = u3Var;
            ml.clear();
            nl.clear();
            Drawable drawable = f23729x4;
            int i12 = f23490kc;
            d(i12, "drawableBotInline", drawable);
            d(i12, "drawableBotWebView", f23746y4);
            d(i12, "drawableBotLock", A4);
            d(i12, "drawableBotLink", f23690v4);
            d(i12, "drawable_botInvite", f23765z4);
            d(i12, "drawableGoIcon", f23671u4);
            d(i12, "drawableCommentSticker", C4);
            d(Gc, "drawableMsgError", f23463j4);
            d(-1, "drawableMsgIn", f23517m3);
            d(-1, "drawableMsgInSelected", f23537n3);
            d(-1, "drawableMsgInMedia", f23595q3);
            d(-1, "drawableMsgInMediaSelected", f23612r3);
            d(Dc, "drawableMsgInInstant", f23426h4);
            d(-1, "drawableMsgOut", f23557o3);
            d(-1, "drawableMsgOutSelected", f23577p3);
            d(-1, "drawableMsgOutMedia", f23631s3);
            d(-1, "drawableMsgOutMediaSelected", f23651t3);
            Drawable drawable2 = drawableArr4[0];
            int i13 = Va;
            d(i13, "drawableMsgOutCallAudio", drawable2);
            Drawable drawable3 = drawableArr5[0];
            int i14 = Wa;
            d(i14, "drawableMsgOutCallAudioSelected", drawable3);
            d(i13, "drawableMsgOutCallVideo", drawableArr4[1]);
            d(i14, "drawableMsgOutCallVideo", drawableArr5[1]);
            d(Ja, "drawableMsgOutCheck", y3);
            d(Ka, "drawableMsgOutCheckSelected", f23764z3);
            Drawable drawable4 = A3;
            int i15 = La;
            d(i15, "drawableMsgOutCheckRead", drawable4);
            Drawable drawable5 = B3;
            int i16 = Ma;
            d(i16, "drawableMsgOutCheckReadSelected", drawable5);
            d(i15, "drawableMsgOutHalfCheck", C3);
            d(i16, "drawableMsgOutHalfCheckSelected", D3);
            d(i13, "drawableMsgOutInstant", f23446i4);
            d(Ta, "drawableMsgOutMenu", f23373e4);
            d(Ua, "drawableMsgOutMenuSelected", f23391f4);
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
            int i19 = f23453ic;
            d(i19, "drawableMsgStickerCheck", drawable8);
            d(i19, "drawableMsgStickerHalfCheck", I3);
            d(i19, "drawableMsgStickerPinned", Y3);
            d(i19, "drawableMsgStickerReplies", K3);
            d(i19, "drawableMsgStickerViews", J3);
            d(i12, "drawableReplyIcon", f23613r4);
            d(i12, "drawableCloseIcon", f23632s4);
            d(i12, "drawableMoreIcon", f23652t4);
            d(i12, "drawableShareIcon", f23596q4);
            d(f23566oc, "drawableMuteIcon", f23482k4);
            d(pc, "drawableLockIcon", l4);
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
            f23353d3.setTextSize(AndroidUtilities.dp(f14));
            X2.setTextSize(AndroidUtilities.dp(f13));
            U2.setTextSize(AndroidUtilities.dp(f14));
            V2.setTextSize(AndroidUtilities.dp(12.0f));
            T2.setTextSize(AndroidUtilities.dp(12.0f));
            K2.setTextSize(AndroidUtilities.dp(13.0f));
            L2.setTextSize(AndroidUtilities.dp(13.0f));
            M2.setTextSize(AndroidUtilities.dp(13.0f));
            X1.setStrokeWidth(AndroidUtilities.dp(f10));
            Z1.setStrokeWidth(AndroidUtilities.dp(1.1f));
            f23630s2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            f23650t2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            f23669u2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 3));
            f23688v2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize)));
            f23390f3.setTextSize(AndroidUtilities.dp(15.0f));
            f23409g3.setTextSize(AndroidUtilities.dp(13.0f));
            f23480k2.setStrokeWidth(AndroidUtilities.dp(f12));
            f23499l2.setStrokeWidth(AndroidUtilities.dp(2.33f));
            f23372e3.setTextSize(AndroidUtilities.dp(f11));
            f23372e3.setTypeface(AndroidUtilities.bold());
        }
    }

    public static String J0() {
        r6 r6Var = I.f23263i0;
        if (r6Var != null) {
            return r6Var.f23052c;
        }
        if (f1()) {
            return "t";
        }
        return "d";
    }

    public static void J1(r2 r2Var) {
        String string;
        if (f23553o != 0) {
            if (r2Var != null) {
                try {
                    wc b02 = wc.b0(r2Var);
                    int i10 = R.raw.auto_night_off;
                    if (f23553o == 3) {
                        string = LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff);
                    } else {
                        string = LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff);
                    }
                    b02.I(i10, string, LocaleController.getString("Settings", R.string.Settings), 5000, false, new q(r2Var, 18)).j();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            f23553o = 0;
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

    public static org.telegram.ui.Cells.y K0(int i10, int i11, u6 u6Var) {
        if (i11 >= 0) {
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), new ColorDrawable(w0(i11, u6Var)), new ColorDrawable(-1));
        }
        return g0(i10, 2, -1);
    }

    public static void K1(MessageObject messageObject) {
        n8 n8Var = f23355d5;
        if (n8Var == null) {
            return;
        }
        if (n8Var.f30911i != null && messageObject != null) {
            if (f23374e5 == null) {
                f23374e5 = new HashMap();
            }
            f23374e5.put(messageObject, f23355d5);
            f23355d5.e(false, true, null);
            AndroidUtilities.runOnUIThread(new q(messageObject, 19), 200L);
            f23355d5 = null;
            return;
        }
        n8Var.f30911i = null;
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

    public static org.telegram.ui.Cells.y L0(u6 u6Var, boolean z10) {
        int w02 = w0(f23448i6, u6Var);
        if (z10) {
            return K0(w02, f23356d6, u6Var);
        }
        return g0(w02, 2, -1);
    }

    public static ar M(int i10, int i11) {
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
        ar arVar = new ar(shapeDrawable, drawable);
        arVar.h = i10;
        arVar.f26596n = i10;
        return arVar;
    }

    public static org.telegram.ui.Cells.y M0(boolean z10) {
        int x02 = x0(null, f23448i6, false);
        if (z10) {
            return K0(x02, f23356d6, null);
        }
        return g0(x02, 2, -1);
    }

    public static org.telegram.ui.Cells.y N(int i10, int i11, int i12) {
        f23760z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new e6(i11, i12));
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
            paint3.setPathEffect(s90.c());
            Paint paint4 = new Paint();
            V1 = paint4;
            paint4.setPathEffect(s90.c());
            Paint paint5 = new Paint();
            W1 = paint5;
            paint5.setPathEffect(s90.c());
            Paint paint6 = new Paint(1);
            f23480k2 = paint6;
            paint6.setStrokeCap(cap);
            f23480k2.setStyle(style);
            f23480k2.setColor(-1610612737);
            Paint paint7 = new Paint(1);
            f23499l2 = paint7;
            paint7.setStrokeCap(cap);
            f23499l2.setStyle(style);
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
            f23353d3 = textPaint12;
            textPaint12.setTypeface(AndroidUtilities.bold());
            f23334c3 = new TextPaint(1);
            f23372e3 = new TextPaint(1);
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
            f23313b2 = new Paint(1);
            f23333c2 = new Paint(1);
            Paint paint10 = new Paint(1);
            f23352d2 = paint10;
            paint10.setStyle(style);
            f23352d2.setStrokeCap(cap);
            f23630s2 = new TextPaint(1);
            f23650t2 = new TextPaint(1);
            f23669u2 = new TextPaint(1);
            f23630s2.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint14 = new TextPaint(1);
            f23688v2 = textPaint14;
            textPaint14.setTypeface(AndroidUtilities.bold());
            Paint paint11 = new Paint(1);
            f23424h2 = paint11;
            paint11.setColor(352321536);
            f23444i2 = new Paint(1);
            TextPaint textPaint15 = new TextPaint(1);
            f23390f3 = textPaint15;
            textPaint15.setTypeface(AndroidUtilities.bold());
            f23409g3 = new TextPaint(1);
            f23461j2 = new Paint();
            new Paint(1);
            f23516m2 = new Paint(1);
            f23536n2 = new Paint(1);
            f23371e2 = new Paint(1);
            f23389f2 = new Paint(7);
            f23408g2 = new Paint(7);
            e(Hc, f23371e2, "paintChatMessageBackgroundSelected");
            Paint paint12 = f23389f2;
            int i10 = f23508lc;
            e(i10, paint12, "paintChatActionBackground");
            e(i10, f23424h2, "paintChatActionBackgroundDarken");
            e(f23526mc, f23408g2, "paintChatActionBackgroundSelected");
            TextPaint textPaint16 = f23630s2;
            int i11 = f23453ic;
            e(i11, textPaint16, "paintChatActionText");
            e(i11, f23650t2, "paintChatActionText2");
            e(i11, f23669u2, "paintChatActionText3");
            e(Nc, Q2, "paintChatBotButton");
            e(Sd, f23461j2, "paintChatComposeBackground");
            e(f23717wc, f23444i2, "paintChatTimeBackground");
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
        synchronized (f23330c) {
            try {
                if (f23556o2 == null) {
                    f23556o2 = new TextPaint(1);
                    f23727x2 = new TextPaint(1);
                    f23745y2 = new TextPaint[6];
                    f23763z2 = new TextPaint(1);
                    A2 = new TextPaint(1);
                    B2 = new TextPaint(1);
                    TextPaint textPaint = new TextPaint(1);
                    f23707w2 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint2 = new TextPaint(1);
                    W2 = textPaint2;
                    textPaint2.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint3 = new TextPaint(1);
                    Y2 = textPaint3;
                    textPaint3.setTypeface(AndroidUtilities.bold());
                    Z2 = new TextPaint(1);
                    f23295a3 = new TextPaint(1);
                    f23314b3 = new TextPaint(1);
                    f23334c3 = new TextPaint(1);
                    TextPaint textPaint4 = new TextPaint(1);
                    f23353d3 = textPaint4;
                    textPaint4.setTypeface(AndroidUtilities.bold());
                    X2 = new TextPaint(1);
                    U2 = new TextPaint(1);
                    T2 = new TextPaint(1);
                    TextPaint textPaint5 = new TextPaint(1);
                    f23576p2 = textPaint5;
                    Typeface typeface = Typeface.MONOSPACE;
                    textPaint5.setTypeface(typeface);
                    TextPaint textPaint6 = new TextPaint(1);
                    f23594q2 = textPaint6;
                    textPaint6.setTypeface(typeface);
                    TextPaint textPaint7 = new TextPaint(1);
                    f23611r2 = textPaint7;
                    textPaint7.setTypeface(typeface);
                    new TextPaint(1);
                    V2 = new TextPaint(1);
                }
                float[] fArr = {0.68f, 0.46f, 0.34f, 0.28f, 0.22f, 0.19f};
                int i10 = 0;
                while (true) {
                    TextPaint[] textPaintArr = f23745y2;
                    if (i10 < textPaintArr.length) {
                        textPaintArr[i10] = new TextPaint(1);
                        f23745y2[i10].setTextSize(AndroidUtilities.dp(fArr[i10] * 120.0f));
                        i10++;
                    } else {
                        f23763z2.setTextSize(AndroidUtilities.dp(46.0f));
                        A2.setTextSize(AndroidUtilities.dp(38.0f));
                        B2.setTextSize(AndroidUtilities.dp(30.0f));
                        f23556o2.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
                        f23727x2.setTextSize(AndroidUtilities.dp(14.0f));
                        f23707w2.setTextSize(AndroidUtilities.dp(15.0f));
                        float f10 = ((SharedConfig.fontSize * 2) + 10) / 3.0f;
                        W2.setTextSize(AndroidUtilities.dp(f10));
                        Y2.setTextSize(AndroidUtilities.dp(f10));
                        Z2.setTextSize(AndroidUtilities.dp(f10));
                        float f11 = f10 - 1.0f;
                        f23295a3.setTextSize(AndroidUtilities.dp(f11));
                        f23314b3.setTextSize(AndroidUtilities.dp(f10));
                        V2.setTextSize(AndroidUtilities.dp(12.0f));
                        f23353d3.setTextSize(AndroidUtilities.dp(f11));
                        f23334c3.setTextSize(AndroidUtilities.dp(f10 - 2.0f));
                        X2.setTextSize(AndroidUtilities.dp(f10));
                        U2.setTextSize(AndroidUtilities.dp(f11));
                        f23576p2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 1), SharedConfig.fontSize - 2)));
                        f23594q2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 3)));
                        f23611r2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 5)));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static x6 P0(String str) {
        return (x6) H.get(str);
    }

    public static void Q(Context context) {
        if (f23478k0 == null) {
            Paint paint = new Paint();
            f23478k0 = paint;
            paint.setStrokeWidth(1.0f);
            Paint paint2 = new Paint();
            f23498l0 = paint2;
            paint2.setStrokeWidth(1.0f);
            f23592q0 = new Paint(1);
            Paint paint3 = new Paint(1);
            f23554o0 = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            f23554o0.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f23554o0.setStrokeCap(Paint.Cap.ROUND);
            Paint paint4 = new Paint(1);
            f23534n0 = paint4;
            paint4.setColor(0);
            f23534n0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            f23574p0 = new Paint(1);
            Paint paint5 = new Paint();
            m0 = paint5;
            paint5.setPathEffect(s90.c());
            Resources resources = context.getResources();
            Drawable drawable = resources.getDrawable(R.drawable.chats_saved);
            Drawable[] drawableArr = f23609r0;
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
            xj0 xj0Var = f23668u1;
            if (xj0Var != null) {
                xj0Var.setCallback(null);
                f23668u1.C(false);
            }
            xj0 xj0Var2 = f23687v1;
            if (xj0Var2 != null) {
                xj0Var2.C(false);
            }
            xj0 xj0Var3 = f23706w1;
            if (xj0Var3 != null) {
                xj0Var3.C(false);
            }
            xj0 xj0Var4 = f23726x1;
            if (xj0Var4 != null) {
                xj0Var4.C(false);
            }
            xj0 xj0Var5 = f23744y1;
            if (xj0Var5 != null) {
                xj0Var5.C(false);
            }
            xj0 xj0Var6 = f23762z1;
            if (xj0Var6 != null) {
                xj0Var6.C(false);
            }
            f23668u1 = new xj0(R.raw.chats_archiveavatar, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f23687v1 = new xj0(R.raw.chats_archive, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f23706w1 = new xj0(R.raw.chats_unarchive, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f23726x1 = new xj0(R.raw.chats_hide, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f23744y1 = new xj0(R.raw.chats_unhide, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f23762z1 = new xj0(R.raw.chat_audio_record_delete, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), false, null);
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

    public static uc0 R(int i10, int i11) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        uc0 uc0Var = new uc0(z10, -2368069, -9722489, -2762611, -7817084);
        if (i10 <= 0 || i11 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            i11 = Math.max(point2.x, point2.y);
        }
        uc0Var.s(SvgHelper.getBitmap(R.raw.default_pattern, i10, i11, -16777216, 1.0f, SvgHelper.ScaleMode.ByWidth), 34);
        uc0Var.t(uc0Var.f());
        return uc0Var;
    }

    public static Drawable R0(String str, u6 u6Var) {
        Drawable drawable;
        if (u6Var != null) {
            drawable = u6Var.getDrawable(str);
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
            f23705w0 = new Paint(1);
            f23648t0 = new Paint(1);
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
            f23667u0 = new Paint();
            f23686v0 = new Paint(1);
            f23743y0 = new Paint(1);
            f23725x0 = new Paint(1);
            f23761z0 = new Paint(1);
            f23294a1 = resources.getDrawable(R.drawable.list_secret);
            f23312b1 = resources.getDrawable(R.drawable.msg_mini_lock2);
            T0 = resources.getDrawable(R.drawable.list_check).mutate();
            S0 = resources.getDrawable(R.drawable.community_cards).mutate();
            U0 = resources.getDrawable(R.drawable.minithumb_play).mutate();
            V0 = resources.getDrawable(R.drawable.list_check).mutate();
            W0 = resources.getDrawable(R.drawable.list_halfcheck);
            X0 = new bd0();
            Y0 = resources.getDrawable(R.drawable.list_warning_sign);
            Z0 = resources.getDrawable(R.drawable.list_reorder).mutate();
            f23332c1 = resources.getDrawable(R.drawable.list_mute).mutate();
            f23351d1 = resources.getDrawable(R.drawable.list_unmute).mutate();
            f23370e1 = resources.getDrawable(R.drawable.mini_ephemeral_hidden_16).mutate();
            f23388f1 = resources.getDrawable(R.drawable.verified_area).mutate();
            f23407g1 = new en0(0);
            f23423h1 = new en0(1);
            f23443i1 = resources.getDrawable(R.drawable.verified_check).mutate();
            f23515m1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            f23535n1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            f23555o1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            f23575p1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            f23593q1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            f23610r1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            f23460j1 = resources.getDrawable(R.drawable.list_pin);
            f23479k1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            l1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            f23649t1 = resources.getDrawable(R.drawable.msg_mini_forumarrow);
            f23628s0 = resources.getDrawable(R.drawable.preview_arrow);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = f23297a5;
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
                                        int i18 = m5.i(substring);
                                        if (i18 >= 0) {
                                            sparseIntArray.put(i18, intValue);
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
                sparseIntArray.put(f23411g5, i11);
                fileInputStream2.close();
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        return sparseIntArray;
    }

    public static k6 T(Context context) {
        return U(context, x0(null, f23672u5, false), x0(null, f23691v5, false));
    }

    public static float T0(float f10) {
        if (f10 < 0.0f && !I.q()) {
            return -f10;
        }
        return f10;
    }

    public static k6 U(Context context, int i10, int i11) {
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
            return f23478k0;
        }
        return (Paint) ol.get(str);
    }

    public static k6 V(Context context, int i10, int i11, int i12) {
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

    public static Paint V0(String str, u6 u6Var) {
        Paint d10;
        if (u6Var != null && (d10 = u6Var.d(str)) != null) {
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
        f23760z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new m6(i11, i12, i13, i14, f10));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.y6.Y0(android.view.View, boolean):android.graphics.drawable.Drawable");
    }

    public static org.telegram.ui.Cells.y Z(int i10, int i11, int i12) {
        f23760z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new v6(i11, i12));
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
        f23760z.setColor(-1);
        float f10 = i12;
        float f11 = i13;
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), d0(AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), i10), new v6(f10, f11));
    }

    public static String a1(r6 r6Var) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (r6Var == null || TextUtils.isEmpty(r6Var.f23052c) || r6Var.f23052c.equals("d")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (r6Var.f23055i) {
            sb2.append("blur");
        }
        if (r6Var.f23056j) {
            if (sb2.length() > 0) {
                sb2.append("+");
            }
            sb2.append("motion");
        }
        int i10 = r6Var.d;
        if (i10 == 0) {
            str3 = "https://attheme.org?slug=" + r6Var.f23052c;
        } else {
            String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (r6Var.d >> 8)) & 255), Byte.valueOf((byte) (r6Var.d & 255))).toLowerCase();
            int i11 = r6Var.e;
            if (i11 != 0) {
                str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (r6Var.e >> 8)) & 255), Byte.valueOf((byte) (r6Var.e & 255))).toLowerCase();
            } else {
                str = null;
            }
            int i12 = r6Var.f23053f;
            if (i12 != 0) {
                str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (r6Var.f23053f >> 8)) & 255), Byte.valueOf((byte) (r6Var.f23053f & 255))).toLowerCase();
            } else {
                str2 = null;
            }
            int i13 = r6Var.f23054g;
            if (i13 != 0) {
                str4 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (r6Var.f23054g >> 8)) & 255), Byte.valueOf((byte) (r6Var.f23054g & 255))).toLowerCase();
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
                StringBuilder l10 = b10.l(a1.g.D(lowerCase, "-", str), "&rotation=");
                l10.append(r6Var.h);
                lowerCase = l10.toString();
            }
            str3 = "https://attheme.org?slug=" + r6Var.f23052c + "&intensity=" + ((int) (r6Var.f23057k * 100.0f)) + "&bg_color=" + lowerCase;
        }
        if (sb2.length() > 0) {
            StringBuilder l11 = b10.l(str3, "&mode=");
            l11.append(sb2.toString());
            return l11.toString();
        }
        return str3;
    }

    public static int b(float f10, float f11, int i10) {
        float[] O02 = O0(5);
        Color.colorToHSV(i10, O02);
        float f12 = O02[1];
        if (f12 > 0.1f && f12 < 0.9f) {
            O02[1] = ee.a(f12 + f10, 0.0f, 1.0f);
        }
        O02[2] = ee.a(O02[2] + f11, 0.0f, 1.0f);
        return Color.HSVToColor(Color.alpha(i10), O02);
    }

    public static org.telegram.ui.Cells.y b0(int i10, int i11, int i12, int i13, int i14) {
        f23760z.setColor(-1);
        ?? drawable = new Drawable();
        drawable.f23161a = new Path();
        drawable.f23162b = r1;
        drawable.f23163c = true;
        float dp = AndroidUtilities.dp(i11);
        float dp2 = AndroidUtilities.dp(i12);
        float dp3 = AndroidUtilities.dp(i13);
        float dp4 = AndroidUtilities.dp(i14);
        float[] fArr = {dp, dp, dp2, dp2, dp3, dp3, dp4, dp4};
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, drawable);
    }

    public static boolean b1() {
        if (P && I.f23263i0 != null) {
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
        int i11 = f23618ra;
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
        x6 x6Var = I;
        if (!x6Var.S || x6Var.Y != f23533n) {
            if (ul.indexOfKey(Nd) < 0 && f23406g0 <= 0 && TextUtils.isEmpty(f23422h0)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void g(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        int[] iArr = ql;
        int i10 = f23618ra;
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
            int i17 = f23303ab;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.y6.g0(int, int, int):org.telegram.ui.Cells.y");
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
        if (f23371e2 == null) {
            return;
        }
        int i10 = ul.get(Hc);
        if ((drawable instanceof uc0) && SharedConfig.getDevicePerformanceClass() != 0 && i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && Y != (bitmap = ((uc0) drawable).f33364k)) {
            Y = bitmap;
            Bitmap bitmap2 = Y;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            Z = new BitmapShader(bitmap2, tileMode, tileMode);
            if (f23293a0 == null) {
                f23293a0 = new Matrix();
            }
        }
        if (Z != null && i10 == 0 && z10) {
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 2.5f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.75f);
            f23371e2.setShader(Z);
            f23371e2.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            f23371e2.setAlpha(64);
            return;
        }
        Paint paint = f23371e2;
        if (i10 == 0) {
            i10 = 1073741824;
        }
        paint.setColor(i10);
        f23371e2.setColorFilter(null);
        f23371e2.setShader(null);
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
        if (f23389f2 == null) {
            return;
        }
        X = f23331c0;
        f23311b0 = f23350d0;
        SparseIntArray sparseIntArray = ul;
        int i12 = f23508lc;
        int indexOfKey = sparseIntArray.indexOfKey(i12);
        if (indexOfKey >= 0) {
            i10 = ul.valueAt(indexOfKey);
        } else {
            i10 = X;
        }
        int indexOfKey2 = ul.indexOfKey(f23526mc);
        if (indexOfKey2 >= 0) {
            i11 = ul.valueAt(indexOfKey2);
        } else {
            i11 = f23311b0;
        }
        boolean z10 = drawable instanceof uc0;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z10) {
                bitmap = ((uc0) drawable).f33364k;
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
                if (f23293a0 == null) {
                    f23293a0 = new Matrix();
                }
            }
            z1(-1, Y3);
            z1(-1, H3);
            z1(-1, I3);
            z1(-1, J3);
            z1(-1, K3);
            f23630s2.setColor(-1);
            f23650t2.setColor(-1);
            f23669u2.setColor(-1);
            f23630s2.linkColor = -1;
            f23688v2.setColor(-1);
            Q2.setColor(-1);
            z1(-1, C4);
            z1(-1, f23596q4);
            z1(-1, f23613r4);
            z1(-1, f23671u4);
            z1(-1, f23729x4);
            z1(-1, f23746y4);
            z1(-1, A4);
            z1(-1, f23765z4);
            z1(-1, f23690v4);
        } else {
            Y = null;
            Z = null;
            Drawable drawable2 = Y3;
            int i13 = f23453ic;
            A1(i13, drawable2);
            A1(i13, H3);
            A1(i13, I3);
            A1(i13, J3);
            A1(i13, K3);
            f23630s2.setColor(x0(null, i13, false));
            f23650t2.setColor(x0(null, i13, false));
            f23630s2.linkColor = x0(null, f23470jc, false);
            f23688v2.setColor(x0(null, i13, false));
            Drawable drawable3 = C4;
            int i14 = f23490kc;
            A1(i14, drawable3);
            A1(i14, f23596q4);
            A1(i14, f23613r4);
            A1(i14, f23671u4);
            A1(i14, f23729x4);
            A1(i14, f23746y4);
            A1(i14, A4);
            A1(i14, f23765z4);
            A1(i14, f23690v4);
            Q2.setColor(x0(null, Nc, false));
        }
        f23389f2.setColor(i10);
        f23408g2.setColor(i11);
        if (Z != null && (ul.indexOfKey(i12) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix2 = new ColorMatrix();
            if (z10) {
                float f14 = -0.06f;
                if (((uc0) drawable).f33370q >= 0.0f) {
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
            f23389f2.setFilterBitmap(true);
            f23389f2.setShader(Z);
            f23389f2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
            f23389f2.setAlpha(255);
            f23408g2.setFilterBitmap(true);
            f23408g2.setShader(Z);
            ColorMatrix colorMatrix3 = new ColorMatrix(colorMatrix2);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.26f);
            h1();
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix3, 0.92f);
            f23408g2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
            f23408g2.setAlpha(255);
            f23424h2.setAlpha(0);
            return;
        }
        f23389f2.setColorFilter(null);
        f23389f2.setShader(null);
        f23408g2.setColorFilter(null);
        f23408g2.setShader(null);
        f23424h2.setAlpha(21);
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
        if (f23556o2 != null && f23517m3 != null && !z10) {
            K2.setColor(x0(null, Jc, false));
            J2.setColor(x0(null, Ic, false));
            Q2.setColor(x0(null, Nc, false));
            U1.setColor(x0(null, Ld, false));
            V1.setColor(x0(null, Mb, false));
            W1.setColor(x0(null, Md, false));
            f23313b2.setColor(x0(null, Fc, false));
            Paint paint = f23333c2;
            int i10 = f23584pa;
            paint.setColor(x0(null, i10, false));
            f23352d2.setColor(x0(null, i10, false));
            TextPaint textPaint = f23630s2;
            int i11 = f23453ic;
            textPaint.setColor(x0(null, i11, false));
            f23650t2.setColor(x0(null, i11, false));
            f23669u2.setColor(x0(null, i11, false));
            f23630s2.linkColor = x0(null, f23470jc, false);
            f23688v2.setColor(x0(null, i11, false));
            f23390f3.setColor(x0(null, G6, false));
            Paint paint2 = f23461j2;
            int i12 = Sd;
            paint2.setColor(x0(null, i12, false));
            f23444i2.setColor(x0(null, f23717wc, false));
            A1(f23491kd, f23425h3);
            l5 l5Var = f23517m3;
            int i13 = f23618ra;
            A1(i13, l5Var);
            l5 l5Var2 = f23537n3;
            int i14 = f23362dc;
            A1(i14, l5Var2);
            A1(i13, f23595q3);
            A1(i14, f23612r3);
            A1(Ja, y3);
            A1(Ka, f23764z3);
            Drawable drawable = A3;
            int i15 = La;
            A1(i15, drawable);
            Drawable drawable2 = B3;
            int i16 = Ma;
            A1(i16, drawable2);
            A1(i15, C3);
            A1(i16, D3);
            Drawable drawable3 = F3;
            int i17 = f23640sc;
            A1(i17, drawable3);
            A1(i17, G3);
            A1(i11, H3);
            A1(i11, I3);
            A1(i11, J3);
            A1(i11, K3);
            A1(i11, L3);
            Drawable drawable4 = f23596q4;
            int i18 = f23490kc;
            A1(i18, drawable4);
            A1(i18, f23613r4);
            A1(i18, f23671u4);
            A1(i18, f23729x4);
            A1(i18, f23746y4);
            Drawable drawable5 = A4;
            int i19 = pc;
            A1(i19, drawable5);
            A1(i18, f23765z4);
            A1(i18, f23690v4);
            Drawable drawable6 = M3;
            int i20 = f23736xc;
            A1(i20, drawable6);
            Drawable drawable7 = N3;
            int i21 = f23754yc;
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
            A1(i24, f23296a4);
            A1(i24, f23315b4);
            A1(Ac, f23335c4);
            A1(Bc, f23354d4);
            A1(Ta, f23373e4);
            A1(Ua, f23391f4);
            A1(Cc, f23410g4);
            Drawable drawable11 = f23446i4;
            int i25 = Va;
            A1(i25, drawable11);
            Drawable drawable12 = f23426h4;
            int i26 = Dc;
            A1(i26, drawable12);
            A1(Gc, f23463j4);
            A1(f23566oc, f23482k4);
            A1(i19, l4);
            Drawable drawable13 = f23518m4;
            int i27 = Ge;
            A1(i27, drawable13);
            A1(i27, f23538n4);
            A1(i27, f23558o4);
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
            int i30 = f23615r7;
            A1(i30, drawable15);
            A1(f23600qa, Q4);
            A1(i30, V4);
            Drawable drawable16 = W4;
            int i31 = Di;
            A1(i31, drawable16);
            A1(i30, X4);
            A1(i31, Y4);
            int i32 = 0;
            while (true) {
                rx0[] rx0VarArr = f23670u3;
                if (i32 >= rx0VarArr.length) {
                    break;
                }
                A1(f23583p9, rx0VarArr[i32]);
                i32++;
            }
            for (int i33 = 0; i33 < 5; i33++) {
                Drawable[][] drawableArr = U4;
                y1(drawableArr[i33][0], x0(null, ie, false), false);
                y1(drawableArr[i33][0], x0(null, f23679uc, false), true);
                y1(drawableArr[i33][1], x0(null, f23472je, false), false);
                y1(drawableArr[i33][1], x0(null, f23697vc, false), true);
            }
            Drawable[] drawableArr2 = T4;
            y1(drawableArr2[0], x0(null, f23622re, false), false);
            y1(drawableArr2[0], x0(null, f23642se, false), true);
            y1(drawableArr2[1], x0(null, Qb, false), false);
            y1(drawableArr2[1], x0(null, Rb, false), true);
            Drawable[] drawableArr3 = S4;
            z1(x0(null, qe, false), drawableArr3[0]);
            z1(x0(null, Pb, false), drawableArr3[1]);
            Drawable[] drawableArr4 = M4;
            z1(x0(null, Kc, false), drawableArr4[0]);
            z1(x0(null, Xa, false), drawableArr4[1]);
            Drawable[] drawableArr5 = N4;
            z1(x0(null, i20, false), drawableArr5[0]);
            z1(x0(null, i22, false), drawableArr5[1]);
            A1(Td, f23445i3);
            A1(i12, f23462j3);
            int i34 = -1;
            if (x0(null, f23772zb, false) == -1) {
                i34 = x0(null, Aa, false);
            }
            z1(i34, K4[1]);
            z1(i34, L4[1]);
            z1(x0(null, f23360da, false), R4);
            if (!z11 && !f23310b) {
                Drawable drawable17 = f23369e0;
                if (drawable17 != null) {
                    i(drawable17);
                }
                h(f23369e0);
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

    public static boolean j1(w6 w6Var) {
        x6 x6Var = w6Var.f23216b;
        if (x6Var != null) {
            if (x6Var.m().equals("Blue") && w6Var.f23215a == 99) {
                return true;
            }
            if (w6Var.f23216b.m().equals("Day") && w6Var.f23215a == 9) {
                return true;
            }
            if ((w6Var.f23216b.m().equals("Night") || w6Var.f23216b.m().equals("Dark Blue")) && w6Var.f23215a == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void k() {
        Paint paint = f23478k0;
        if (paint == null) {
            return;
        }
        paint.setColor(x0(null, f23357d7, false));
        m0.setColor(x0(null, K6, false));
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = f23609r0;
            int length = drawableArr.length;
            int i11 = J7;
            if (i10 < length) {
                A1(i11, drawableArr[i10]);
                i10++;
            } else {
                xj0 xj0Var = f23668u1;
                xj0Var.Z = true;
                int i12 = M7;
                xj0Var.Q(x0(null, i12, true), "Arrow1");
                f23668u1.Q(x0(null, i12, true), "Arrow2");
                f23668u1.Q(x0(null, i11, true), "Box2");
                f23668u1.Q(x0(null, i11, true), "Box1");
                f23668u1.o();
                C1 = false;
                f23668u1.J(true);
                xj0 xj0Var2 = f23726x1;
                xj0Var2.Z = true;
                int i13 = f23378e9;
                xj0Var2.Q(x0(null, i13, true), "Arrow");
                f23726x1.Q(x0(null, i13, true), "Line");
                f23726x1.o();
                xj0 xj0Var3 = f23744y1;
                xj0Var3.Z = true;
                xj0Var3.Q(x0(null, i13, true), "Arrow");
                f23744y1.Q(x0(null, i13, true), "Line");
                f23744y1.o();
                xj0 xj0Var4 = f23762z1;
                xj0Var4.Z = true;
                int i14 = f23340c9;
                xj0Var4.Q(x0(null, i14, true), "Line 1");
                f23762z1.Q(x0(null, i14, true), "Line 2");
                f23762z1.Q(x0(null, i14, true), "Line 3");
                f23762z1.Q(x0(null, i13, true), "Cup Red");
                f23762z1.Q(x0(null, i13, true), "Box");
                f23762z1.o();
                B1 = false;
                xj0 xj0Var5 = f23687v1;
                xj0Var5.Z = true;
                xj0Var5.Q(x0(null, i14, true), "Arrow");
                f23687v1.Q(x0(null, i13, true), "Box2");
                f23687v1.Q(x0(null, i13, true), "Box1");
                f23687v1.o();
                A1 = false;
                xj0 xj0Var6 = f23706w1;
                xj0Var6.Z = true;
                xj0Var6.Q(x0(null, i13, true), "Arrow1");
                f23706w1.Q(x0(null, f23359d9, true), "Arrow2");
                f23706w1.Q(x0(null, i13, true), "Box2");
                f23706w1.Q(x0(null, i13, true), "Box1");
                f23706w1.o();
                int x02 = x0(null, G6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                f23689v3 = new PorterDuffColorFilter(x02, mode);
                f23708w3 = new PorterDuffColorFilter(x0(null, f23398fc, false), mode);
                tg.b1.d().b();
                return;
            }
        }
    }

    public static boolean k0(x6 x6Var, w6 w6Var, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (w6Var == null || x6Var == null || x6Var.f23254b0 == null) {
            return false;
        }
        if (w6Var.f23215a == x6Var.Y) {
            z11 = true;
        } else {
            z11 = false;
        }
        File d10 = w6Var.d();
        if (d10 != null) {
            d10.delete();
        }
        x6Var.f23252a0.remove(w6Var.f23215a);
        x6Var.f23254b0.remove(w6Var);
        TLRPC.TL_theme tL_theme = w6Var.f23229r;
        if (tL_theme != null) {
            x6Var.f23256c0.remove(tL_theme.f22166id);
        }
        r6 r6Var = w6Var.f23235y;
        if (r6Var != null) {
            r6.a(r6Var);
        }
        if (z11) {
            x6Var.u(((w6) x6Var.f23254b0.get(0)).f23215a);
        }
        if (z10) {
            w1(x6Var, true, false, false, false, false);
            if (w6Var.f23229r != null) {
                MessagesController messagesController = MessagesController.getInstance(w6Var.f23231t);
                if (z11 && x6Var == J) {
                    z12 = true;
                }
                messagesController.saveTheme(x6Var, w6Var, z12, true);
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
                ConnectionsManager.getInstance(i10).sendRequest(getthemes, new hi.s2(i10, 3));
            }
        }
    }

    public static void l(boolean z10) {
        x6 x6Var;
        if (M == null) {
            if (z10) {
                x6 x6Var2 = I;
                x6 x6Var3 = J;
                if (x6Var2 != x6Var3) {
                    if (x6Var2 == null || (x6Var3 != null && x6Var2.q() != J.q())) {
                        R = true;
                        f23441i = SystemClock.elapsedRealtime();
                        Q = true;
                        H1(J, true, -1, null);
                        Q = false;
                        return;
                    }
                    return;
                }
                return;
            }
            x6 x6Var4 = K;
            if (x6Var4 != null && x6Var4.q() && f23553o != 0 && (x6Var = L) != null) {
                x6Var4 = x6Var;
            }
            x6 x6Var5 = I;
            if (x6Var5 != x6Var4) {
                if (x6Var5 == null || (x6Var4 != null && x6Var5.q() != x6Var4.q())) {
                    R = false;
                    f23441i = SystemClock.elapsedRealtime();
                    Q = true;
                    H1(x6Var4, true, -1, null);
                    Q = false;
                }
            }
        }
    }

    public static x6 l0(File file, String str, TLRPC.TL_theme tL_theme) {
        String[] split;
        try {
            x6 x6Var = new x6();
            x6Var.f23251a = str;
            x6Var.F = tL_theme;
            x6Var.f23253b = file.getAbsolutePath();
            x6Var.E = UserConfig.selectedAccount;
            String[] strArr = new String[1];
            G(S0(new File(x6Var.f23253b), null, strArr), x6Var);
            if (!TextUtils.isEmpty(strArr[0])) {
                String str2 = strArr[0];
                x6Var.f23255c = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(str2) + ".wp").getAbsolutePath();
                Uri parse = Uri.parse(str2);
                x6Var.e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        if ("blur".equals(split[i10])) {
                            x6Var.h = true;
                        } else if ("motion".equals(split[i10])) {
                            x6Var.f23265n = true;
                        }
                    }
                }
                String queryParameter2 = parse.getQueryParameter("intensity");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String queryParameter3 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            x6Var.f23266r = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                            if (queryParameter3.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(6))) {
                                x6Var.f23267s = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter3.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(13))) {
                                x6Var.v = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter3.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(20))) {
                                x6Var.f23268w = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String queryParameter4 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            x6Var.f23269x = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        x6Var.f23270y = Utilities.parseInt((CharSequence) queryParameter2).intValue();
                    }
                    if (x6Var.f23270y == 0) {
                        x6Var.f23270y = 50;
                    }
                }
                return x6Var;
            }
            f23422h0 = null;
            return x6Var;
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
        paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), f23292a);
    }

    public static Paint m0(int i10) {
        Paint paint = Ml;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
        }
        return paint;
    }

    public static void m1(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.y6.m1(boolean):void");
    }

    public static void n() {
        if (B0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = f23583p9;
            int i12 = f23414g9;
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
                int x03 = x0(null, f23523m9, false);
                textPaint2.linkColor = x03;
                textPaint2.setColor(x03);
                f23667u0.setColor(x0(null, f23657t9, false));
                f23686v0.setColor(x0(null, f23637s9, false));
                I0.setColor(x0(null, q9, false));
                J0.setColor(x0(null, f23617r9, false));
                TextPaint textPaint3 = K0;
                int i15 = il;
                textPaint3.setColor(x0(null, i15, false));
                TextPaint textPaint4 = L0;
                int i16 = W8;
                textPaint4.setColor(x0(null, i16, false));
                M0.setColor(x0(null, i16, false));
                TextPaint textPaint5 = N0;
                int i17 = f23395f9;
                textPaint5.setColor(x0(null, i17, false));
                O0.setColor(x0(null, i17, false));
                Paint paint = f23705w0;
                int i18 = U8;
                paint.setColor(x0(null, i18, false));
                Paint paint2 = f23743y0;
                int i19 = V8;
                paint2.setColor(x0(null, i19, false));
                f23761z0.setColor(x0(null, i11, false));
                f23725x0.setColor(x0(null, x9, false));
                P0.setColor(x0(null, f23580p6, false));
                Q0.setColor(x0(null, A6, false));
                A1(f23301a9, f23294a1);
                Drawable drawable = f23312b1;
                int i20 = f23320b9;
                A1(i20, drawable);
                A1(f23676u9, T0);
                A1(G6, S0);
                Drawable drawable2 = V0;
                int i21 = f23695v9;
                A1(i21, drawable2);
                A1(i21, W0);
                A1(f23714w9, X0);
                A1(f23751y9, Y0);
                A1(i20, f23460j1);
                A1(i20, f23479k1);
                A1(i15, l1);
                A1(i20, Z0);
                Drawable drawable3 = f23332c1;
                int i22 = B9;
                A1(i22, drawable3);
                A1(i22, f23351d1);
                A1(i22, f23370e1);
                A1(i18, f23515m1);
                A1(Z5, f23535n1);
                A1(zj, f23555o1);
                A1(i19, f23575p1);
                A1(i19, f23593q1);
                A1(i19, f23610r1);
                A1(i12, f23649t1);
                A1(f23770z9, f23388f1);
                A1(A9, f23443i1);
                A1(A8, f23629s1);
                en0 en0Var = f23407g1;
                int i23 = f23468j9;
                A1(i23, en0Var);
                A1(i23, f23423h1);
                return;
            }
        }
    }

    public static x6 n0() {
        return I;
    }

    public static Drawable n1(r6 r6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable drawable;
        me I10 = I(I, r6Var, ul, file, f23422h0, f23406g0, i10, S, z11, O, P, z10, document, false);
        Boolean bool = (Boolean) I10.f616c;
        if (bool != null) {
            z12 = bool.booleanValue();
        } else {
            z12 = f23442i0;
        }
        f23442i0 = z12;
        Boolean bool2 = (Boolean) I10.d;
        if (bool2 != null) {
            z13 = bool2.booleanValue();
        } else {
            z13 = f23459j0;
        }
        f23459j0 = z13;
        Boolean bool3 = (Boolean) I10.e;
        if (bool3 != null) {
            z14 = bool3.booleanValue();
        } else {
            z14 = W;
        }
        W = z14;
        Drawable drawable2 = (Drawable) I10.f614a;
        if (drawable2 != null) {
            drawable = drawable2;
        } else {
            drawable = f23369e0;
        }
        f23369e0 = drawable;
        int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(drawable2);
        int i11 = calcDrawableColor[0];
        f23331c0 = i11;
        X = i11;
        int i12 = calcDrawableColor[1];
        f23350d0 = i12;
        f23311b0 = i12;
        Drawable drawable3 = f23369e0;
        if (drawable3 != null) {
            i(drawable3);
        }
        return drawable2;
    }

    public static void o() {
        x6 x6Var;
        x6 x6Var2 = M;
        if (x6Var2 == null) {
            return;
        }
        O = false;
        if (R && (x6Var = J) != null) {
            t(x6Var, true, true);
        } else if (!P) {
            t(x6Var2, true, false);
        }
        P = false;
        M = null;
        E(false);
    }

    public static ColorFilter o0(u6 u6Var) {
        if (u6Var != null) {
            return u6Var.c();
        }
        return f23689v3;
    }

    public static int o1(float f10, int i10) {
        if (f10 == 1.0f) {
            return i10;
        }
        return i0.a.o(i10, ee.b((int) (Color.alpha(i10) * f10), 0, 255));
    }

    public static void p() {
        if (Q1 == null) {
            return;
        }
        P1.setColor(x0(null, G6, false));
        P1.linkColor = x0(null, J6, false);
        A1(f23776zh, Q1);
        A1(Ah, R1);
    }

    public static n8 p0(MessageObject messageObject) {
        HashMap hashMap = f23374e5;
        if (hashMap != null && messageObject != null) {
            return (n8) hashMap.get(messageObject);
        }
        return null;
    }

    public static int p1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.y6.p1():int");
    }

    public static void q(float f10, float f11, int i10, int i11) {
        r(Y, Z, f23293a0, i10, i11, f10, f11);
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
        w6 k10 = I.k(false);
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
            r1(!(LaunchActivity.R() instanceof un));
        }
        k();
        n();
        p();
        j(false, z10);
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.e4(3, !O));
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
        s9 s9Var = V;
        if (s9Var != null) {
            s9Var.dispose();
            V = null;
        }
        Drawable drawable = f23369e0;
        if (drawable instanceof uc0) {
            S = ((uc0) drawable).f33362i;
        } else {
            S = 0;
        }
        f23369e0 = null;
        f23387f0 = null;
        m1(z10);
    }

    public static void s(View view, View view2, u6 u6Var) {
        if (view != null && view2 != null) {
            int[] iArr = Il;
            view.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            view2.getLocationOnScreen(iArr);
            if (view2 instanceof ic1) {
                Bitmap bitmap = Y;
                if (bitmap != null) {
                    float width = bitmap.getWidth();
                    i10 = (int) ((((view2.getMeasuredWidth() - (Math.max(view2.getMeasuredWidth() / width, view2.getMeasuredHeight() / Y.getHeight()) * width)) / 2.0f) - ((ic1) view2).I) + i10);
                } else {
                    i10 = (int) (i10 + (-((ic1) view2).I));
                }
                i11 = (int) (i11 + (-((ic1) view2).J));
            }
            if (u6Var != null) {
                u6Var.b(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
                return;
            }
            q(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
        }
    }

    public static Drawable s0() {
        Drawable t02 = t0();
        if (t02 == null && d != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Utilities.themeQueue.postRunnable(new q(countDownLatch, 17));
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

    public static void t(org.telegram.ui.ActionBar.x6 r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.y6.t(org.telegram.ui.ActionBar.x6, boolean, boolean):void");
    }

    public static Drawable t0() {
        Drawable drawable = f23387f0;
        if (drawable != null) {
            return drawable;
        }
        return f23369e0;
    }

    public static void t1() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("selectedAutoNightType", f23553o);
        edit.putBoolean("autoNightScheduleByLocation", f23573p);
        edit.putFloat("autoNightBrighnessThreshold", f23591q);
        edit.putInt("autoNightDayStartTime", f23608r);
        edit.putInt("autoNightDayEndTime", f23627s);
        edit.putInt("autoNightSunriseTime", v);
        edit.putString("autoNightCityName", f23704w);
        edit.putInt("autoNightSunsetTime", f23647t);
        edit.putLong("autoNightLocationLatitude3", Double.doubleToRawLongBits(f23724x));
        edit.putLong("autoNightLocationLongitude3", Double.doubleToRawLongBits(f23742y));
        edit.putInt("autoNightLastSunCheckDay", f23666u);
        x6 x6Var = J;
        if (x6Var != null) {
            edit.putString("nighttheme", x6Var.m());
        } else {
            edit.remove("nighttheme");
        }
        edit.commit();
    }

    public static x6 u(File file, String str, TLRPC.TL_theme tL_theme, boolean z10) {
        File file2;
        String str2;
        try {
            if (!str.toLowerCase().endsWith(".attheme")) {
                str = str.concat(".attheme");
            }
            if (z10) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
                x6 x6Var = new x6();
                x6Var.f23251a = str;
                x6Var.F = tL_theme;
                x6Var.f23253b = file.getAbsolutePath();
                x6Var.E = UserConfig.selectedAccount;
                M = C0();
                O = true;
                P = false;
                t(x6Var, false, false);
                return x6Var;
            }
            if (tL_theme != null) {
                str2 = "remote" + tL_theme.f22166id;
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
            x6 x6Var2 = (x6) hashMap.get(str2);
            if (x6Var2 == null) {
                x6Var2 = new x6();
                x6Var2.f23251a = str;
                x6Var2.E = UserConfig.selectedAccount;
                ArrayList arrayList = F;
                arrayList.add(x6Var2);
                G.add(x6Var2);
                Collections.sort(arrayList, new n4(2));
            } else {
                hashMap.remove(str2);
            }
            x6Var2.F = tL_theme;
            x6Var2.f23253b = file2.getAbsolutePath();
            hashMap.put(x6Var2.m(), x6Var2);
            v1(true, false);
            t(x6Var2, true, false);
            return x6Var2;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static rx0 u0(int i10) {
        if (i10 < 0 || i10 > 5) {
            return null;
        }
        rx0[] rx0VarArr = f23670u3;
        rx0 rx0Var = rx0VarArr[i10];
        if (rx0Var != null) {
            return rx0Var;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                rx0VarArr[5] = new eq();
                            }
                        } else {
                            rx0VarArr[4] = new bn0(true);
                        }
                    } else {
                        rx0VarArr[3] = new eh0(null, true);
                    }
                } else {
                    rx0VarArr[2] = new dq0(true);
                }
            } else {
                rx0VarArr[1] = new eq(true);
            }
        } else {
            rx0VarArr[0] = new r61(true);
        }
        rx0 rx0Var2 = rx0VarArr[i10];
        rx0Var2.d();
        rx0Var2.b(x0(null, f23583p9, false));
        return rx0Var2;
    }

    public static void u1(org.telegram.ui.ActionBar.x6 r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.y6.u1(org.telegram.ui.ActionBar.x6, boolean, boolean, boolean):void");
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
                x6 x6Var = (x6) arrayList2.get(i11);
                x6Var.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("name", x6Var.f23251a);
                    jSONObject.put("path", x6Var.f23253b);
                    jSONObject.put("account", x6Var.E);
                    TLRPC.TL_theme tL_theme = x6Var.F;
                    if (tL_theme != null) {
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        x6Var.F.serializeToStream(serializedData);
                        jSONObject.put("info", Utilities.bytesToHex(serializedData.toByteArray()));
                    }
                    jSONObject.put("loaded", x6Var.G);
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
                x6 x6Var2 = (x6) H.get(str);
                if (x6Var2 == null || (arrayList = x6Var2.f23254b0) == null || arrayList.isEmpty()) {
                    z12 = z11;
                } else {
                    z12 = z11;
                    w1(x6Var2, true, false, false, false, z12);
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

    public static int w0(int i10, u6 u6Var) {
        if (u6Var != null) {
            return u6Var.g(i10);
        }
        return x0(null, i10, false);
    }

    public static void w1(x6 x6Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        if (z10) {
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            if (!z12) {
                int size = x6Var.f23254b0.size();
                int max = Math.max(0, size - x6Var.W);
                SerializedData serializedData = new SerializedData(((max * 16) + 2) * 4);
                serializedData.writeInt32(9);
                serializedData.writeInt32(max);
                for (int i10 = 0; i10 < size; i10++) {
                    w6 w6Var = (w6) x6Var.f23254b0.get(i10);
                    int i11 = w6Var.f23215a;
                    if (i11 >= 100) {
                        serializedData.writeInt32(i11);
                        serializedData.writeInt32(w6Var.f23217c);
                        serializedData.writeInt32(w6Var.d);
                        serializedData.writeInt32(w6Var.e);
                        serializedData.writeInt32(w6Var.f23218f);
                        serializedData.writeInt32(w6Var.f23219g);
                        serializedData.writeInt32(w6Var.h);
                        serializedData.writeBool(w6Var.f23220i);
                        serializedData.writeInt64(w6Var.f23221j);
                        serializedData.writeInt64(w6Var.f23222k);
                        serializedData.writeInt64(w6Var.f23223l);
                        serializedData.writeInt64(w6Var.f23224m);
                        serializedData.writeInt32(w6Var.f23225n);
                        serializedData.writeInt64(0L);
                        serializedData.writeDouble(w6Var.f23227p);
                        serializedData.writeBool(w6Var.f23228q);
                        serializedData.writeString(w6Var.f23226o);
                        if (w6Var.f23229r != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        serializedData.writeBool(z15);
                        if (w6Var.f23229r != null) {
                            serializedData.writeInt32(w6Var.f23231t);
                            w6Var.f23229r.serializeToStream(serializedData);
                        }
                    }
                }
                edit.putString("accents_" + x6Var.d, Base64.encodeToString(serializedData.toByteArray(), 3));
                if (!z14) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
                }
                if (z13) {
                    MessagesController.getInstance(UserConfig.selectedAccount).saveThemeToServer(x6Var, x6Var.k(false));
                }
            }
            edit.putInt("accent_current_" + x6Var.d, x6Var.Y);
            edit.commit();
        } else {
            if (x6Var.Z != -1) {
                if (z11) {
                    w6 w6Var2 = (w6) x6Var.f23252a0.get(x6Var.Y);
                    x6Var.f23252a0.remove(w6Var2.f23215a);
                    x6Var.f23254b0.remove(w6Var2);
                    TLRPC.TL_theme tL_theme = w6Var2.f23229r;
                    if (tL_theme != null) {
                        x6Var.f23256c0.remove(tL_theme.f22166id);
                    }
                }
                x6Var.Y = x6Var.Z;
                w6 k10 = x6Var.k(false);
                if (k10 != null) {
                    x6Var.f23263i0 = k10.f23235y;
                } else {
                    x6Var.f23263i0 = null;
                }
            }
            if (I == x6Var) {
                q1(false, false);
            }
        }
        x6Var.Z = -1;
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
        int i12 = f23636s8;
        int i13 = f23299a7;
        int i14 = Qd;
        int i15 = Pd;
        int i16 = Od;
        int i17 = Nd;
        if (i10 == i17 || i10 == i16 || i10 == i15 || i10 == i14 || i10 == f23356d6 || i10 == i13 || i10 == i12 || i10 == M8) {
            i11 |= -16777216;
        }
        if (z10) {
            ul.delete(i10);
        } else {
            ul.put(i10, i11);
        }
        if (i10 == Hc) {
            h(f23369e0);
        } else if (i10 != f23508lc && i10 != f23526mc) {
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
            Drawable drawable = f23369e0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.y6.y0(android.util.SparseIntArray, int, boolean[]):int");
    }

    public static void y1(Drawable drawable, int i10, boolean z10) {
        Drawable drawable2;
        if (!(drawable instanceof ar)) {
            return;
        }
        if (z10) {
            drawable2 = ((ar) drawable).f26593b;
        } else {
            drawable2 = ((ar) drawable).f26592a;
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

    public static n8 z0() {
        if (f23355d5 == null) {
            f23355d5 = new n8();
        }
        return f23355d5;
    }

    public static void z1(int i10, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof rx0) {
            ((rx0) drawable).b(i10);
        } else if (drawable instanceof bd0) {
            ((bd0) drawable).a(i10);
        } else if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i10);
        } else if (drawable instanceof en0) {
            ((en0) drawable).b(i10);
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }
}
