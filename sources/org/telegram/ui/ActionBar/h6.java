package org.telegram.ui.ActionBar;

import ai.aa;
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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.hq;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.z90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ld1;
import org.telegram.ui.zn;
public abstract class h6 {
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
    public static p20 Cl;
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
    public static la.h Dl;
    public static TextPaint E0;
    public static int E1;
    public static TextPaint E2;
    public static kd0 E3;
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
    public static float[] Fl;
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
    public static final n5 Gl;
    public static final HashMap H;
    public static TextPaint[] H0;
    public static ek0 H1;
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
    public static final int[] Hl;
    public static g6 I;
    public static TextPaint I0;
    public static ek0 I1;
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
    public static WeakReference Il;
    public static g6 J;
    public static TextPaint J0;
    public static ek0 J1;
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
    public static Bitmap Jl;
    public static g6 K;
    public static TextPaint K0;
    public static ek0 K1;
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
    public static final Paint Kl;
    public static final g6 L;
    public static TextPaint L0;
    public static ek0 L1;
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
    public static g6 M;
    public static TextPaint M0;
    public static ek0 M1;
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
    public static ek0 N1;
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
    public static ek0 O1;
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
    public static kd0 X0;
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
    public static Matrix f20724a0;
    public static Drawable f20725a1;
    public static Paint a2;
    public static TextPaint f20726a3;
    public static Drawable f20727a4;
    public static final int f20729a6;
    public static final int f20730a7;
    public static final int f20731a8;
    public static final int f20732a9;
    public static final int f20733aa;
    public static final int f20734ab;
    public static final int f20735ac;
    public static final int f20736ad;
    public static final int f20737ae;
    public static final int f20738af;
    public static final int f20739ag;
    public static final int f20740ah;
    public static final int f20741ai;
    public static final int aj;
    public static final int ak;
    public static final int al;
    public static boolean f20742b;
    public static int f20743b0;
    public static Drawable f20744b1;
    public static Paint f20745b2;
    public static TextPaint f20746b3;
    public static Drawable f20747b4;
    public static Drawable f20748b5;
    public static final int f20749b6;
    public static final int f20750b7;
    public static final int f20751b8;
    public static final int f20752b9;
    public static final int f20753ba;
    public static final int f20754bb;
    public static final int f20755bc;
    public static final int f20756bd;
    public static final int f20757be;
    public static final int f20758bf;
    public static final int f20759bg;
    public static final int f20760bh;
    public static final int f20761bi;
    public static final int bj;
    public static final int bk;
    public static final int bl;
    public static int f20763c0;
    public static Drawable f20764c1;
    public static Paint f20765c2;
    public static TextPaint f20766c3;
    public static Drawable f20767c4;
    public static Drawable f20768c5;
    public static final int f20769c6;
    public static final int f20770c7;
    public static final int f20771c8;
    public static final int f20772c9;
    public static final int f20773ca;
    public static final int cb;
    public static final int f20774cc;
    public static final int cd;
    public static final int f20775ce;
    public static final int f20776cf;
    public static final int f20777cg;
    public static final int f20778ch;
    public static final int f20779ci;
    public static final int cj;
    public static final int ck;
    public static final int cl;
    public static gg.u0 d;
    public static int f20780d0;
    public static Drawable f20781d1;
    public static Paint f20782d2;
    public static TextPaint f20783d3;
    public static Drawable f20784d4;
    public static m8 f20785d5;
    public static final int f20786d6;
    public static final int f20787d7;
    public static final int f20788d8;
    public static final int f20789d9;
    public static final int f20790da;
    public static final int f20791db;
    public static final int f20792dc;
    public static final int f20793dd;
    public static final int f20794de;
    public static final int f20795df;
    public static final int f20796dg;
    public static final int f20797dh;
    public static final int f20798di;
    public static final int dj;
    public static final int dk;
    public static final int dl;
    public static SensorManager f20799e;
    public static Drawable f20800e0;
    public static Drawable f20801e1;
    public static Paint f20802e2;
    public static TextPaint f20803e3;
    public static Drawable f20804e4;
    public static HashMap f20805e5;
    public static final int f20806e6;
    public static final int e7;
    public static final int f20807e8;
    public static final int f20808e9;
    public static final int f20809ea;
    public static final int f20810eb;
    public static final int ec;
    public static final int f20811ed;
    public static final int f20812ee;
    public static final int f20813ef;
    public static final int eg;
    public static final int f20814eh;
    public static final int f20815ei;
    public static final int ej;
    public static final int ek;
    public static final int el;
    public static Sensor f20816f;
    public static Drawable f20817f0;
    public static Drawable f20818f1;
    public static Paint f20819f2;
    public static TextPaint f20820f3;
    public static Drawable f20821f4;
    public static final int f20822f5;
    public static final int f20823f6;
    public static final int f7;
    public static final int f20824f8;
    public static final int f20825f9;
    public static final int f20826fa;
    public static final int f20827fb;
    public static final int f20828fc;
    public static final int f20829fd;
    public static final int f20830fe;
    public static final int f20831ff;
    public static final int f20832fg;
    public static final int f20833fh;
    public static final int f20834fi;
    public static final int fj;
    public static final int fk;
    public static final int fl;
    public static boolean f20835g;
    public static int f20836g0;
    public static fn0 f20837g1;
    public static Paint f20838g2;
    public static TextPaint f20839g3;
    public static Drawable f20840g4;
    public static final int f20841g5;
    public static final int f20842g6;
    public static final int f20843g7;
    public static final int f20844g8;
    public static final int f20845g9;
    public static final int ga;
    public static final int f20846gb;
    public static final int gc;
    public static final int f20847gd;
    public static final int ge;
    public static final int f20848gf;
    public static final int f20849gg;
    public static final int f20850gh;
    public static final int f20851gi;
    public static final int gj;
    public static final int gk;
    public static final int gl;
    public static String f20852h0;
    public static fn0 f20853h1;
    public static Paint f20854h2;
    public static Drawable f20855h3;
    public static Drawable f20856h4;
    public static final int f20857h5;
    public static final int f20858h6;
    public static final int f20859h7;
    public static final int f20860h8;
    public static final int f20861h9;
    public static final int ha;
    public static final int f20862hb;
    public static final int f20863hc;
    public static final int f20864hd;
    public static final int f20865he;
    public static final int f20866hf;
    public static final int f20867hg;
    public static final int f20868hh;
    public static final int f20869hi;
    public static final int hj;
    public static final int hk;
    public static final int hl;
    public static long f20870i;
    public static boolean f20871i0;
    public static Drawable f20872i1;
    public static Paint f20873i2;
    public static Drawable f20874i3;
    public static Drawable f20875i4;
    public static final int f20876i5;
    public static final int f20877i6;
    public static final int f20878i7;
    public static final int f20879i8;
    public static final int f20880i9;
    public static final int f20881ia;
    public static final int f20882ib;
    public static final int f20883ic;
    public static final int f20884id;
    public static final int f20885ie;
    public static final int f20886ig;
    public static final int f20887ih;
    public static final int f20888ii;
    public static final int ij;
    public static final int ik;
    public static final int il;
    public static boolean f20889j;
    public static boolean f20890j0;
    public static Drawable f20891j1;
    public static Paint f20892j2;
    public static Drawable j3;
    public static Drawable f20893j4;
    public static final int f20894j5;
    public static final int f20895j6;
    public static final int f20896j7;
    public static final int f20897j8;
    public static final int f20898j9;
    public static final int f20899ja;
    public static final int f20900jb;
    public static final int f20901jc;
    public static final int f20902jd;
    public static final int f20903je;
    public static final int jf;
    public static final int f20904jg;
    public static final int f20905jh;
    public static final int f20906ji;
    public static final int jj;
    public static final int jk;
    public static final int jl;
    public static boolean f20907k;
    public static Paint f20908k0;
    public static Drawable f20909k1;
    public static Paint f20910k2;
    public static f5 f20911k3;
    public static Drawable f20912k4;
    public static final int f20913k5;
    public static final int f20914k6;
    public static final int f20915k7;
    public static final int f20916k8;
    public static final int f20917k9;
    public static final int f20918ka;
    public static final int f20919kb;
    public static final int f20920kc;
    public static final int f20921kd;
    public static final int f20922ke;
    public static final int f20923kf;
    public static final int f20924kg;
    public static final int f20925kh;
    public static final int f20926ki;
    public static final int kj;
    public static final int kk;
    public static final int kl;
    public static Paint f20928l0;
    public static Drawable l1;
    public static Paint f20929l2;
    public static Drawable f20930l3;
    public static Drawable l4;
    public static final int f20931l5;
    public static final int f20932l6;
    public static final int f20933l7;
    public static final int f20934l8;
    public static final int f20935l9;
    public static final int f20936la;
    public static final int f20937lb;
    public static final int f20938lc;
    public static final int f20939ld;
    public static final int f20940le;
    public static final int f20941lf;
    public static final int f20942lg;
    public static final int f20943lh;
    public static final int f20944li;
    public static final int lj;
    public static final int lk;
    public static final int ll;
    public static Paint m0;
    public static Drawable f20946m1;
    public static Paint f20947m2;
    public static d5 f20948m3;
    public static Drawable f20949m4;
    public static final int f20950m5;
    public static final int f20951m6;
    public static final int f20952m7;
    public static final int f20953m8;
    public static final int f20954m9;
    public static final int f20955ma;
    public static final int f20956mb;
    public static final int f20957mc;
    public static final int f20958md;
    public static final int f20959me;
    public static final int f20960mf;
    public static final int f20961mg;
    public static final int f20962mh;
    public static final int f20963mi;
    public static final int mj;
    public static final int mk;
    public static final HashMap ml;
    public static Paint f20965n0;
    public static Drawable f20966n1;
    public static Paint f20967n2;
    public static d5 f20968n3;
    public static Drawable f20969n4;
    public static final int f20970n5;
    public static final int f20971n6;
    public static final int f20972n7;
    public static final int f20973n8;
    public static final int f20974n9;
    public static final int f20975na;
    public static final int nb;
    public static final int nc;
    public static final int f20976nd;
    public static final int f20977ne;
    public static final int f20978nf;
    public static final int f20979ng;
    public static final int f20980nh;
    public static final int f20981ni;
    public static final int nj;
    public static final int nk;
    public static final HashMap nl;
    public static int f20982o;
    public static Paint f20983o0;
    public static Drawable f20984o1;
    public static TextPaint f20985o2;
    public static d5 f20986o3;
    public static Drawable f20987o4;
    public static final int f20988o5;
    public static final int f20989o6;
    public static final int f20990o7;
    public static final int f20991o8;
    public static final int o9;
    public static final int f20992oa;
    public static final int f20993ob;
    public static final int f20994oc;
    public static final int f20995od;
    public static final int oe;
    public static final int f20996of;
    public static final int f20997og;
    public static final int f20998oh;
    public static final int f20999oi;
    public static final int oj;
    public static final int ok;
    public static final HashMap ol;
    public static boolean f21000p;
    public static Paint f21001p0;
    public static Drawable f21002p1;
    public static TextPaint f21003p2;
    public static d5 f21004p3;
    public static Drawable f21005p4;
    public static final int p5;
    public static final int f21006p6;
    public static final int f21007p7;
    public static final int[] f21008p8;
    public static final int f21009p9;
    public static final int f21010pa;
    public static final int f21011pb;
    public static final int f21012pc;
    public static final int f21013pd;
    public static final int f21014pe;
    public static final int f21015pf;
    public static final int f21016pg;
    public static final int f21017ph;
    public static final int f21018pi;
    public static final int pj;
    public static final int pk;
    public static final HashMap pl;
    public static float f21019q;
    public static Paint f21020q0;
    public static Drawable f21021q1;
    public static TextPaint f21022q2;
    public static d5 f21023q3;
    public static Drawable f21024q4;
    public static final int f21025q5;
    public static final int q6;
    public static final int f21026q7;
    public static final int[] f21027q8;
    public static final int f21028q9;
    public static final int f21029qa;
    public static final int f21030qb;
    public static final int f21031qc;
    public static final int f21032qd;
    public static final int f21033qe;
    public static final int f21034qf;
    public static final int f21035qg;
    public static final int f21036qh;
    public static final int f21037qi;
    public static final int qj;
    public static final int qk;
    public static final int[] ql;
    public static int f21038r;
    public static Drawable f21040r1;
    public static TextPaint f21041r2;
    public static d5 f21042r3;
    public static Drawable f21043r4;
    public static final int f21044r5;
    public static final int f21045r6;
    public static final int f21046r7;
    public static final int[] f21047r8;
    public static final int f21048r9;
    public static final int f21049ra;
    public static final int f21050rb;
    public static final int f21051rc;
    public static final int rd;
    public static final int f21052re;
    public static final int f21053rf;
    public static final int f21054rg;
    public static final int f21055rh;
    public static final int ri;
    public static final int rj;
    public static final int rk;
    public static final SparseIntArray rl;
    public static int f21056s;
    public static Drawable f21057s0;
    public static Drawable f21058s1;
    public static TextPaint f21059s2;
    public static d5 f21060s3;
    public static Drawable f21061s4;
    public static final int f21062s5;
    public static final int f21063s6;
    public static final int f21064s7;
    public static final int f21065s8;
    public static final int f21066s9;
    public static final int f21067sa;
    public static final int f21068sb;
    public static final int f21069sc;
    public static final int f21070sd;
    public static final int f21071se;
    public static final int f21072sf;
    public static final int f21073sg;
    public static final int f21074sh;
    public static final int si;
    public static final int sj;
    public static final int sk;
    public static final HashSet sl;
    public static int f21075t;
    public static Paint f21076t0;
    public static Drawable f21077t1;
    public static TextPaint f21078t2;
    public static d5 f21079t3;
    public static Drawable f21080t4;
    public static final int f21081t5;
    public static final int f21082t6;
    public static final int f21083t7;
    public static final int f21084t8;
    public static final int f21085t9;
    public static final int ta;
    public static final int f21086tb;
    public static final int f21087tc;
    public static final int f21088td;
    public static final int f21089te;
    public static final int f21090tf;
    public static final int f21091tg;
    public static final int f21092th;
    public static final int ti;
    public static final int tj;
    public static final int tk;
    public static SparseIntArray tl;
    public static int f21093u;
    public static Paint f21094u0;
    public static ek0 f21095u1;
    public static TextPaint f21096u2;
    public static Drawable f21098u4;
    public static final int f21099u5;
    public static final int f21100u6;
    public static final int f21101u7;
    public static final int f21102u8;
    public static final int f21103u9;
    public static final int f21104ua;
    public static final int f21105ub;
    public static final int f21106uc;
    public static final int f21107ud;
    public static final int f21108ue;
    public static final int f21109uf;
    public static final int f21110ug;
    public static final int f21111uh;
    public static final int ui;
    public static final int uj;
    public static final int uk;
    public static SparseIntArray ul;
    public static int v;
    public static Paint f21112v0;
    public static ek0 f21113v1;
    public static TextPaint f21114v2;
    public static PorterDuffColorFilter f21115v3;
    public static Drawable f21116v4;
    public static final int f21117v5;
    public static final int f21118v6;
    public static final int f21119v7;
    public static final int f21120v8;
    public static final int v9;
    public static final int f21121va;
    public static final int f21122vb;
    public static final int f21123vc;
    public static final int f21124vd;
    public static final int f21125ve;
    public static final int f21126vf;
    public static final int f21127vg;
    public static final int f21128vh;
    public static final int vi;
    public static final int vj;
    public static final int vk;
    public static SparseIntArray vl;
    public static String f21129w;
    public static Paint f21130w0;
    public static ek0 f21131w1;
    public static TextPaint f21132w2;
    public static PorterDuffColorFilter f21133w3;
    public static Drawable f21134w4;
    public static final int f21135w5;
    public static final int f21136w6;
    public static final int f21137w7;
    public static final int f21138w8;
    public static final int f21139w9;
    public static final int f21140wa;
    public static final int f21141wb;
    public static final int f21142wc;
    public static final int f21143wd;
    public static final int f21144we;
    public static final int f21145wf;
    public static final int f21146wg;
    public static final int f21147wh;
    public static final int wi;
    public static final int wj;
    public static final int wk;
    public static boolean wl;
    public static double f21148x;
    public static Paint f21149x0;
    public static ek0 f21150x1;
    public static TextPaint f21151x2;
    public static bf0 f21152x3;
    public static Drawable f21153x4;
    public static final int f21154x5;
    public static final int f21155x6;
    public static final int f21156x7;
    public static final int f21157x8;
    public static final int f21158x9;
    public static final int f21159xa;
    public static final int f21160xb;
    public static final int xc;
    public static final int f21161xd;
    public static final int f21162xe;
    public static final int xf;
    public static final int f21163xg;
    public static final int f21164xh;
    public static final int xi;
    public static final int xj;
    public static final int xk;
    public static final ThreadLocal xl;
    public static double f21165y;
    public static Paint f21166y0;
    public static ek0 f21167y1;
    public static TextPaint[] f21168y2;
    public static Drawable y3;
    public static Drawable f21169y4;
    public static final int f21170y5;
    public static final int f21171y6;
    public static final int f21172y7;
    public static final int f21173y8;
    public static final int f21174y9;
    public static final int f21175ya;
    public static final int f21176yb;
    public static final int yc;
    public static final int f21177yd;
    public static final int f21178ye;
    public static final int f21179yf;
    public static final int f21180yg;
    public static final int f21181yh;
    public static final int yi;
    public static final int yj;
    public static final int yk;
    public static final ThreadLocal yl;
    public static Paint f21183z0;
    public static ek0 f21184z1;
    public static TextPaint f21185z2;
    public static Drawable f21186z3;
    public static Drawable f21187z4;
    public static final int f21188z5;
    public static final int f21189z6;
    public static final int f21190z7;
    public static final int f21191z8;
    public static final int f21192z9;
    public static final int f21193za;
    public static final int f21194zb;
    public static final int f21195zc;
    public static final int f21196zd;
    public static final int f21197ze;
    public static final int f21198zf;
    public static final int f21199zg;
    public static final int f21200zh;
    public static final int zi;
    public static final int zj;
    public static final int zk;
    public static final ThreadLocal zl;
    public static final int f20723a = i0.a.k(-16777216, 27);
    public static final Object f20762c = new Object();
    public static float h = 1.0f;
    public static final aa f20927l = new aa(3);
    public static final aa f20945m = new aa(4);
    public static final int f20964n = 99;
    public static final Paint f21182z = new Paint(1);
    public static final boolean[] C = new boolean[4];
    public static final int[] D = new int[4];
    public static final long[] E = new long[4];
    public static final Drawable[] f21039r0 = new Drawable[25];
    public static final qx0[] f21097u3 = new qx0[6];
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
    public static final Path[] f20728a5 = new Path[3];

    static {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h6.<clinit>():void");
    }

    public static void A() {
        if (f20982o != 2) {
            if (f20907k) {
                f20907k = false;
                AndroidUtilities.cancelRunOnUIThread(f20945m);
            }
            if (f20889j) {
                f20889j = false;
                AndroidUtilities.cancelRunOnUIThread(f20927l);
            }
            if (f20835g) {
                h = 1.0f;
                f20799e.unregisterListener(Gl, f20816f);
                f20835g = false;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("light sensor unregistered");
                }
            }
        }
    }

    public static String A0() {
        g6 g6Var = J;
        if (g6Var == null) {
            return "";
        }
        String n10 = g6Var.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            return n10.substring(0, n10.lastIndexOf(46));
        }
        return n10;
    }

    public static void A1(org.telegram.ui.Cells.z zVar, float f10, float f11, float f12, float f13) {
        if (com.google.android.gms.internal.vision.e2.t(zVar)) {
            int numberOfLayers = zVar.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable = zVar.getDrawable(i10);
                if (drawable instanceof e6) {
                    e6 e6Var = (e6) drawable;
                    float[] fArr = e6Var.f20577b;
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
                    e6Var.f20578c = true;
                    e6Var.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static int B(g6 g6Var, int i10, int i11) {
        int i12;
        if (i10 != 0 && (i12 = g6Var.X) != 0 && i10 != i12 && (!g6Var.S || g6Var.Y != f20964n)) {
            float[] N02 = N0(3);
            float[] N03 = N0(4);
            Color.colorToHSV(g6Var.X, N02);
            Color.colorToHSV(i10, N03);
            return D(N02, N03, i11, g6Var.q(), i11);
        }
        return i11;
    }

    public static g6 B0() {
        g6 g6Var = K;
        if (g6Var != null) {
            return g6Var;
        }
        return L;
    }

    public static void B1(org.telegram.ui.Cells.z zVar, int i10, int i11) {
        if (com.google.android.gms.internal.vision.e2.t(zVar)) {
            int numberOfLayers = zVar.getNumberOfLayers();
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                Drawable drawable = zVar.getDrawable(i12);
                if (drawable instanceof e6) {
                    e6 e6Var = (e6) drawable;
                    float f10 = i10;
                    float f11 = i11;
                    float[] fArr = e6Var.f20577b;
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
                    e6Var.f20578c = true;
                    e6Var.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static int C(boolean z10, int i10, int i11, int i12, int i13) {
        float[] N02 = N0(3);
        float[] N03 = N0(4);
        Color.colorToHSV(i10, N02);
        Color.colorToHSV(i11, N03);
        return D(N02, N03, i12, z10, i13);
    }

    public static int C0(int i10) {
        int indexOfKey = tl.indexOfKey(i10);
        if (indexOfKey < 0) {
            return 0;
        }
        int valueAt = tl.valueAt(indexOfKey);
        f6 k10 = I.k(false);
        if (k10 == null) {
            return 0;
        }
        float[] N02 = N0(1);
        float[] N03 = N0(2);
        Color.colorToHSV(I.X, N02);
        Color.colorToHSV(k10.f20608c, N03);
        return D(N02, N03, valueAt, I.q(), valueAt);
    }

    public static boolean C1(Drawable drawable, int i10, boolean z10) {
        Drawable M02;
        boolean z11;
        boolean z12 = true;
        if (drawable instanceof StateListDrawable) {
            try {
                if (z10) {
                    Drawable M03 = M0(0, drawable);
                    if (M03 instanceof ShapeDrawable) {
                        if (((ShapeDrawable) M03).getPaint().getColor() == i10) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        try {
                            ((ShapeDrawable) M03).getPaint().setColor(i10);
                        } catch (Throwable unused) {
                            return z11;
                        }
                    } else {
                        M03.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        z11 = false;
                    }
                    M02 = M0(1, drawable);
                } else {
                    M02 = M0(2, drawable);
                    z11 = false;
                }
                if (M02 instanceof ShapeDrawable) {
                    if (((ShapeDrawable) M02).getPaint().getColor() == i10 && !z11) {
                        z12 = false;
                    }
                    try {
                        ((ShapeDrawable) M02).getPaint().setColor(i10);
                        return z12;
                    } catch (Throwable unused2) {
                        return z12;
                    }
                }
                M02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
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

    public static int D(float[] fArr, float[] fArr2, int i10, boolean z10, int i11) {
        int min;
        int min2;
        if (Fl == null) {
            Fl = new float[3];
        }
        float[] fArr3 = Fl;
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
        int i11 = ql[i10];
        if (i11 == 0) {
            int i12 = rl.get(i10, -1);
            if (i12 != -1) {
                return D0(i12);
            }
            if ((i10 < f21193za || i10 >= Ga) && i10 != D9 && i10 != N9 && i10 != E9 && i10 != Pd && i10 != Qd) {
                return -65536;
            }
            return 0;
        }
        return i11;
    }

    public static void D1(g6 g6Var, f6 f6Var, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
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
                if (g6Var == null) {
                    String r02 = r0(themeSettings);
                    if (r02 != null && (g6Var = (g6) hashMap.get(r02)) != null) {
                        f6Var = (f6) g6Var.f20660c0.get(tL_theme.f20169id);
                    } else {
                        return;
                    }
                }
                if (f6Var != null) {
                    TLRPC.TL_theme tL_theme2 = f6Var.f20621r;
                    if (tL_theme2 != null) {
                        g6Var.f20660c0.remove(tL_theme2.f20169id);
                    }
                    f6Var.f20621r = tL_theme;
                    f6Var.f20623t = i10;
                    g6Var.f20660c0.put(tL_theme.f20169id, f6Var);
                    if (!g6.a(f6Var, themeSettings)) {
                        File d10 = f6Var.d();
                        if (d10 != null) {
                            d10.delete();
                        }
                        g6.i(f6Var, themeSettings);
                        g6 g6Var2 = I;
                        if (g6Var2 == g6Var && g6Var2.Y == f6Var.f20606a) {
                            o1(false, false);
                            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                            int i11 = NotificationCenter.needSetDayNightTheme;
                            g6 g6Var3 = I;
                            if (J == g6Var3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            globalInstance.lambda$postNotificationNameOnUIThread$1(i11, g6Var3, Boolean.valueOf(z12), null, -1);
                        }
                        c6.a(true);
                    }
                    TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                    if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.motion) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    f6Var.f20620q = z11;
                    g6Var.T = false;
                } else {
                    return;
                }
            } else {
                if (g6Var != null) {
                    str = g6Var.m();
                    hashMap.remove(str);
                } else {
                    str = "remote" + tL_theme.f20169id;
                    g6Var = (g6) hashMap.get(str);
                }
                if (g6Var == null) {
                    return;
                }
                g6Var.F = tL_theme;
                g6Var.f20655a = tL_theme.title;
                File file = new File(g6Var.f20657b);
                File file2 = new File(ApplicationLoader.getFilesDirFixed(), sc.v.v(str, ".attheme"));
                if (!file.equals(file2)) {
                    try {
                        AndroidUtilities.copyFile(file, file2);
                        g6Var.f20657b = file2.getAbsolutePath();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (z10) {
                    g6Var.G = false;
                    g6Var.f20666g0 = null;
                    g6Var.f20667h0 = null;
                    NotificationCenter.getInstance(g6Var.E).addObserver(g6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(g6Var.E).addObserver(g6Var, NotificationCenter.fileLoadFailed);
                    FileLoader fileLoader = FileLoader.getInstance(g6Var.E);
                    TLRPC.TL_theme tL_theme3 = g6Var.F;
                    fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                } else {
                    g6Var.T = false;
                }
                hashMap.put(g6Var.m(), g6Var);
            }
            t1(true, false);
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
                if (f20907k) {
                    f20907k = false;
                    AndroidUtilities.cancelRunOnUIThread(f20945m);
                }
                if (f20889j) {
                    f20889j = false;
                    AndroidUtilities.cancelRunOnUIThread(f20927l);
                }
            }
            A();
            int n12 = n1();
            if (n12 != 0) {
                if (n12 == 2) {
                    z11 = true;
                }
                l(z11);
            }
            if (z10) {
                f20870i = 0L;
            }
        }
    }

    public static p20 E0() {
        if (Cl == null) {
            ?? obj = new Object();
            obj.f29586a = new o20[4];
            obj.f29594k = 1.0f;
            obj.f29595l = new ArrayList();
            obj.f29596m = new Paint(1);
            obj.f29597n = new Path();
            for (int i10 = 0; i10 < 4; i10++) {
                obj.f29586a[i10] = new o20(i10);
            }
            Cl = obj;
        }
        return Cl;
    }

    public static void E1(g6 g6Var) {
        Collections.sort(g6Var.f20658b0, new a4.d(26));
    }

    public static void F(boolean z10) {
        g6 g6Var;
        int i10;
        if (A == 0) {
            if (z10 || Math.abs((System.currentTimeMillis() / 1000) - B) >= 3600) {
                for (int i11 = 0; i11 < 2; i11++) {
                    if (i11 == 0) {
                        g6Var = K;
                    } else {
                        g6Var = J;
                    }
                    if (g6Var != null && UserConfig.getInstance(g6Var.E).isClientActivated()) {
                        f6 k10 = g6Var.k(false);
                        TLRPC.TL_theme tL_theme = g6Var.F;
                        if (tL_theme != null) {
                            i10 = g6Var.E;
                        } else if (k10 != null && (tL_theme = k10.f20621r) != null) {
                            i10 = UserConfig.selectedAccount;
                        }
                        if (tL_theme.document != null) {
                            A++;
                            TL_account.getTheme gettheme = new TL_account.getTheme();
                            gettheme.document_id = tL_theme.document.f20038id;
                            gettheme.format = "android";
                            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                            tL_inputTheme.access_hash = tL_theme.access_hash;
                            tL_inputTheme.f20103id = tL_theme.f20169id;
                            gettheme.theme = tL_inputTheme;
                            ConnectionsManager.getInstance(i10).sendRequest(gettheme, new ai.t5(k10, g6Var, tL_theme, 7));
                        }
                    }
                }
            }
        }
    }

    public static int F0(int i10) {
        return x0(null, i10, true);
    }

    public static int F1(SparseIntArray sparseIntArray) {
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

    public static void G(SparseIntArray sparseIntArray, g6 g6Var) {
        if (g6Var != null && g6Var.f20669j0 == -1) {
            int i10 = f20786d6;
            if (i0.a.f(i0.a.d(0.5f, G0(sparseIntArray, i10), G0(sparseIntArray, i10))) < 0.5d) {
                g6Var.f20669j0 = 1;
            } else {
                g6Var.f20669j0 = 0;
            }
        }
    }

    public static int G0(SparseIntArray sparseIntArray, int i10) {
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return ql[i10];
    }

    public static void G1(m2 m2Var) {
        String string;
        if (f20982o != 0) {
            if (m2Var != null) {
                try {
                    ad a02 = ad.a0(m2Var);
                    int i10 = R.raw.auto_night_off;
                    if (f20982o == 3) {
                        string = LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff);
                    } else {
                        string = LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff);
                    }
                    a02.I(i10, string, LocaleController.getString("Settings", R.string.Settings), 5000, false, new p(m2Var, 17)).j();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            f20982o = 0;
            r1();
            A();
        }
    }

    public static ci.u5 H(g6 g6Var, SparseIntArray sparseIntArray, String str, int i10, boolean z10) {
        boolean z11;
        File file;
        boolean z12;
        float f10;
        float f11;
        if (g6Var.S && g6Var.Y == f20964n) {
            z11 = true;
        } else {
            z11 = false;
        }
        f6 k10 = g6Var.k(false);
        if (k10 != null) {
            file = k10.d();
        } else {
            file = null;
        }
        if (k10 != null && k10.f20620q) {
            z12 = true;
        } else {
            z12 = false;
        }
        z5 z5Var = g6Var.f20668i0;
        if (z5Var != null) {
            f11 = z5Var.f21729k;
        } else if (k10 != null) {
            f11 = k10.f20619p;
        } else {
            f10 = g6Var.f20675y;
            return I(g6Var, z5Var, sparseIntArray, file, str, tl.get(f20841g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
        }
        f10 = f11 * 100.0f;
        return I(g6Var, z5Var, sparseIntArray, file, str, tl.get(f20841g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
    }

    public static org.telegram.ui.Cells.z H0(int i10, int i11) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i11 & 16777215) | 419430400}), null, c0(i10, -1));
    }

    public static void H1(MessageObject messageObject) {
        m8 m8Var = f20785d5;
        if (m8Var == null) {
            return;
        }
        if (m8Var.f28592i != null && messageObject != null) {
            if (f20805e5 == null) {
                f20805e5 = new HashMap();
            }
            f20805e5.put(messageObject, f20785d5);
            f20785d5.e(false, true, null);
            AndroidUtilities.runOnUIThread(new p(messageObject, 18), 200L);
            f20785d5 = null;
            return;
        }
        m8Var.f28592i = null;
    }

    public static ci.u5 I(org.telegram.ui.ActionBar.g6 r24, org.telegram.ui.ActionBar.z5 r25, android.util.SparseIntArray r26, java.io.File r27, java.lang.String r28, int r29, int r30, int r31, boolean r32, boolean r33, boolean r34, boolean r35, org.telegram.tgnet.TLRPC.Document r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h6.I(org.telegram.ui.ActionBar.g6, org.telegram.ui.ActionBar.z5, android.util.SparseIntArray, java.io.File, java.lang.String, int, int, int, boolean, boolean, boolean, boolean, org.telegram.tgnet.TLRPC$Document, boolean):ci.u5");
    }

    public static String I0() {
        z5 z5Var = I.f20668i0;
        if (z5Var != null) {
            return z5Var.f21723c;
        }
        if (e1()) {
            return "t";
        }
        return "d";
    }

    public static void J(Context context, boolean z10) {
        float f10;
        float f11;
        float f12;
        TextPaint textPaint;
        float f13;
        Drawable[] drawableArr;
        O();
        if (!z10 && f20948m3 == null) {
            Resources resources = context.getResources();
            f20855h3 = resources.getDrawable(R.drawable.video_muted);
            f20930l3 = resources.getDrawable(R.drawable.media_live_on).mutate();
            f20948m3 = new d5(0, false, false, null);
            f20968n3 = new d5(0, false, true, null);
            f20986o3 = new d5(0, true, false, null);
            f21004p3 = new d5(0, true, true, null);
            f21023q3 = new d5(1, false, false, null);
            f21042r3 = new d5(1, false, true, null);
            f21060s3 = new d5(1, true, false, null);
            f21079t3 = new d5(1, true, true, null);
            ?? obj = new Object();
            obj.f24938a = new Path();
            obj.f24939b = -1.0f;
            obj.f24943g = new ArrayList();
            obj.f24940c = 0.293f;
            obj.d = -26.0f;
            obj.f24941e = -28.0f;
            obj.f24942f = 1.0f;
            f21152x3 = obj;
            obj.a("M 34.141 16.042 C 37.384 17.921 40.886 20.001 44.211 21.965 C 46.139 23.104 49.285 24.729 49.586 25.917 C 50.289 28.687 48.484 30 46.274 30 L 6 30.021 C 3.79 30.021 2.075 30.023 2 26.021 L 2.009 3.417 C 2.009 0.417 5.326 -0.58 7.068 0.417 C 10.545 2.406 25.024 10.761 34.141 16.042 Z", 166.0f);
            f21152x3.a("M 37.843 17.769 C 41.143 19.508 44.131 21.164 47.429 23.117 C 48.542 23.775 49.623 24.561 49.761 25.993 C 50.074 28.708 48.557 30 46.347 30 L 6 30.012 C 3.79 30.012 2 28.222 2 26.012 L 2.009 4.609 C 2.009 1.626 5.276 0.664 7.074 1.541 C 10.608 3.309 28.488 12.842 37.843 17.769 Z", 200.0f);
            f21152x3.a("M 40.644 18.756 C 43.986 20.389 49.867 23.108 49.884 25.534 C 49.897 27.154 49.88 24.441 49.894 26.059 C 49.911 28.733 48.6 30 46.39 30 L 6 30.013 C 3.79 30.013 2 28.223 2 26.013 L 2.008 5.52 C 2.008 2.55 5.237 1.614 7.079 2.401 C 10.656 4 31.106 14.097 40.644 18.756 Z", 217.0f);
            f21152x3.a("M 43.782 19.218 C 47.117 20.675 50.075 21.538 50.041 24.796 C 50.022 26.606 50.038 24.309 50.039 26.104 C 50.038 28.736 48.663 30 46.453 30 L 6 29.986 C 3.79 29.986 2 28.196 2 25.986 L 2.008 6.491 C 2.008 3.535 5.196 2.627 7.085 3.316 C 10.708 4.731 33.992 14.944 43.782 19.218 Z", 234.0f);
            f21152x3.a("M 47.421 16.941 C 50.544 18.191 50.783 19.91 50.769 22.706 C 50.761 24.484 50.76 23.953 50.79 26.073 C 50.814 27.835 49.334 30 47.124 30 L 5 30.01 C 2.79 30.01 1 28.22 1 26.01 L 1.001 10.823 C 1.001 8.218 3.532 6.895 5.572 7.26 C 7.493 8.01 47.421 16.941 47.421 16.941 Z", 267.0f);
            f21152x3.a("M 47.641 17.125 C 50.641 18.207 51.09 19.935 51.078 22.653 C 51.07 24.191 51.062 21.23 51.088 23.063 C 51.109 24.886 49.587 27 47.377 27 L 5 27.009 C 2.79 27.009 1 25.219 1 23.009 L 0.983 11.459 C 0.983 8.908 3.414 7.522 5.476 7.838 C 7.138 8.486 47.641 17.125 47.641 17.125 Z", 300.0f);
            f21152x3.a("M 48 7 C 50.21 7 52 8.79 52 11 C 52 19 52 19 52 19 C 52 21.21 50.21 23 48 23 L 4 23 C 1.79 23 0 21.21 0 19 L 0 11 C 0 8.79 1.79 7 4 7 C 48 7 48 7 48 7 Z", 383.0f);
            y3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            f21186z3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            A3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            B3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            F3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            H3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            C3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            D3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            G3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            I3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            E3 = new kd0();
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
            f20727a4 = resources.getDrawable(R.drawable.msg_views).mutate();
            f20747b4 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            J3 = resources.getDrawable(R.drawable.msg_views).mutate();
            K3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            f20767c4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f20784d4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f20804e4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f20821f4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f20840g4 = resources.getDrawable(R.drawable.video_actions);
            f20856h4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            f20875i4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            f20893j4 = resources.getDrawable(R.drawable.msg_warning);
            f20912k4 = resources.getDrawable(R.drawable.list_mute).mutate();
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
            f20949m4 = resources.getDrawable(R.drawable.bot_file);
            f20969n4 = resources.getDrawable(R.drawable.bot_music);
            f20987o4 = resources.getDrawable(R.drawable.bot_location);
            f21116v4 = resources.getDrawable(R.drawable.bot_link);
            f21153x4 = resources.getDrawable(R.drawable.bot_lines);
            f21134w4 = resources.getDrawable(R.drawable.bot_card);
            f21169y4 = resources.getDrawable(R.drawable.bot_webview);
            f21187z4 = resources.getDrawable(R.drawable.bot_invite);
            A4 = resources.getDrawable(R.drawable.permission_locked);
            B4 = resources.getDrawable(R.drawable.msg_msgbubble);
            C4 = resources.getDrawable(R.drawable.msg_msgbubble2);
            D4 = resources.getDrawable(R.drawable.msg_arrowright);
            E4 = resources.getDrawable(R.drawable.gradient_left);
            F4 = resources.getDrawable(R.drawable.gradient_right);
            f21005p4 = resources.getDrawable(R.drawable.header_shadow).mutate();
            R4 = resources.getDrawable(R.drawable.nophotos3);
            f21024q4 = resources.getDrawable(R.drawable.filled_button_share).mutate();
            f21043r4 = resources.getDrawable(R.drawable.filled_button_reply);
            f21061s4 = resources.getDrawable(R.drawable.msg_voiceclose).mutate();
            f21080t4 = resources.getDrawable(R.drawable.media_more).mutate();
            f21098u4 = resources.getDrawable(R.drawable.filled_open_message);
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
            f20748b5 = resources.getDrawable(R.drawable.filled_fire).mutate();
            f20768c5 = resources.getDrawable(R.drawable.msg_round_gif_m).mutate();
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
            fr M10 = M(AndroidUtilities.dp(44.0f), R.drawable.msg_contact);
            Drawable[] drawableArr7 = T4;
            drawableArr7[0] = M10;
            drawableArr7[1] = M(AndroidUtilities.dp(44.0f), R.drawable.msg_contact);
            Drawable mutate5 = resources.getDrawable(R.drawable.msg_location).mutate();
            Drawable[] drawableArr8 = S4;
            drawableArr8[0] = mutate5;
            drawableArr8[1] = resources.getDrawable(R.drawable.msg_location).mutate();
            f20874i3 = context.getResources().getDrawable(R.drawable.compose_panel_shadow).mutate();
            j3 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            f5 f5Var = new f5(0);
            Paint paint = new Paint(1);
            f5Var.f20605b = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
            f20911k3 = f5Var;
            ml.clear();
            nl.clear();
            Drawable drawable = f21153x4;
            int i12 = f20920kc;
            d(i12, "drawableBotInline", drawable);
            d(i12, "drawableBotWebView", f21169y4);
            d(i12, "drawableBotLock", A4);
            d(i12, "drawableBotLink", f21116v4);
            d(i12, "drawable_botInvite", f21187z4);
            d(i12, "drawableGoIcon", f21098u4);
            d(i12, "drawableCommentSticker", C4);
            d(Gc, "drawableMsgError", f20893j4);
            d(-1, "drawableMsgIn", f20948m3);
            d(-1, "drawableMsgInSelected", f20968n3);
            d(-1, "drawableMsgInMedia", f21023q3);
            d(-1, "drawableMsgInMediaSelected", f21042r3);
            d(Dc, "drawableMsgInInstant", f20856h4);
            d(-1, "drawableMsgOut", f20986o3);
            d(-1, "drawableMsgOutSelected", f21004p3);
            d(-1, "drawableMsgOutMedia", f21060s3);
            d(-1, "drawableMsgOutMediaSelected", f21079t3);
            Drawable drawable2 = drawableArr4[0];
            int i13 = Va;
            d(i13, "drawableMsgOutCallAudio", drawable2);
            Drawable drawable3 = drawableArr5[0];
            int i14 = Wa;
            d(i14, "drawableMsgOutCallAudioSelected", drawable3);
            d(i13, "drawableMsgOutCallVideo", drawableArr4[1]);
            d(i14, "drawableMsgOutCallVideo", drawableArr5[1]);
            d(Ja, "drawableMsgOutCheck", y3);
            d(Ka, "drawableMsgOutCheckSelected", f21186z3);
            Drawable drawable4 = A3;
            int i15 = La;
            d(i15, "drawableMsgOutCheckRead", drawable4);
            Drawable drawable5 = B3;
            int i16 = Ma;
            d(i16, "drawableMsgOutCheckReadSelected", drawable5);
            d(i15, "drawableMsgOutHalfCheck", C3);
            d(i16, "drawableMsgOutHalfCheckSelected", D3);
            d(i13, "drawableMsgOutInstant", f20875i4);
            d(Ta, "drawableMsgOutMenu", f20804e4);
            d(Ua, "drawableMsgOutMenuSelected", f20821f4);
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
            int i19 = f20883ic;
            d(i19, "drawableMsgStickerCheck", drawable8);
            d(i19, "drawableMsgStickerHalfCheck", I3);
            d(i19, "drawableMsgStickerPinned", Y3);
            d(i19, "drawableMsgStickerReplies", K3);
            d(i19, "drawableMsgStickerViews", J3);
            d(i12, "drawableReplyIcon", f21043r4);
            d(i12, "drawableCloseIcon", f21061s4);
            d(i12, "drawableMoreIcon", f21080t4);
            d(i12, "drawableShareIcon", f21024q4);
            d(f20994oc, "drawableMuteIcon", f20912k4);
            d(f21012pc, "drawableLockIcon", l4);
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
            f20783d3.setTextSize(AndroidUtilities.dp(f14));
            X2.setTextSize(AndroidUtilities.dp(f13));
            U2.setTextSize(AndroidUtilities.dp(f14));
            V2.setTextSize(AndroidUtilities.dp(12.0f));
            T2.setTextSize(AndroidUtilities.dp(12.0f));
            K2.setTextSize(AndroidUtilities.dp(13.0f));
            L2.setTextSize(AndroidUtilities.dp(13.0f));
            M2.setTextSize(AndroidUtilities.dp(13.0f));
            X1.setStrokeWidth(AndroidUtilities.dp(f10));
            Z1.setStrokeWidth(AndroidUtilities.dp(1.1f));
            f21059s2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            f21078t2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            f21096u2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 3));
            f21114v2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize)));
            f20820f3.setTextSize(AndroidUtilities.dp(15.0f));
            f20839g3.setTextSize(AndroidUtilities.dp(13.0f));
            f20910k2.setStrokeWidth(AndroidUtilities.dp(f12));
            f20929l2.setStrokeWidth(AndroidUtilities.dp(2.33f));
            f20803e3.setTextSize(AndroidUtilities.dp(f11));
            f20803e3.setTypeface(AndroidUtilities.bold());
        }
    }

    public static org.telegram.ui.Cells.z J0(int i10, int i11, d6 d6Var) {
        if (i11 >= 0) {
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), new ColorDrawable(w0(i11, d6Var)), new ColorDrawable(-1));
        }
        return g0(i10, 2, -1);
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

    public static org.telegram.ui.Cells.z K0(d6 d6Var, boolean z10) {
        int w02 = w0(f20877i6, d6Var);
        if (z10) {
            return J0(w02, f20786d6, d6Var);
        }
        return g0(w02, 2, -1);
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

    public static org.telegram.ui.Cells.z L0(boolean z10) {
        int x02 = x0(null, f20877i6, false);
        if (z10) {
            return J0(x02, f20786d6, null);
        }
        return g0(x02, 2, -1);
    }

    public static fr M(int i10, int i11) {
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
        fr frVar = new fr(shapeDrawable, drawable);
        frVar.h = i10;
        frVar.f26472n = i10;
        return frVar;
    }

    public static Drawable M0(int i10, Drawable drawable) {
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

    public static org.telegram.ui.Cells.z N(int i10, int i11, int i12) {
        f21182z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new m5(i11, i12));
    }

    public static float[] N0(int i10) {
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
            paint3.setPathEffect(z90.c());
            Paint paint4 = new Paint();
            V1 = paint4;
            paint4.setPathEffect(z90.c());
            Paint paint5 = new Paint();
            W1 = paint5;
            paint5.setPathEffect(z90.c());
            Paint paint6 = new Paint(1);
            f20910k2 = paint6;
            paint6.setStrokeCap(cap);
            f20910k2.setStyle(style);
            f20910k2.setColor(-1610612737);
            Paint paint7 = new Paint(1);
            f20929l2 = paint7;
            paint7.setStrokeCap(cap);
            f20929l2.setStyle(style);
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
            f20783d3 = textPaint12;
            textPaint12.setTypeface(AndroidUtilities.bold());
            f20766c3 = new TextPaint(1);
            f20803e3 = new TextPaint(1);
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
            f20745b2 = new Paint(1);
            f20765c2 = new Paint(1);
            Paint paint10 = new Paint(1);
            f20782d2 = paint10;
            paint10.setStyle(style);
            f20782d2.setStrokeCap(cap);
            f21059s2 = new TextPaint(1);
            f21078t2 = new TextPaint(1);
            f21096u2 = new TextPaint(1);
            f21059s2.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint14 = new TextPaint(1);
            f21114v2 = textPaint14;
            textPaint14.setTypeface(AndroidUtilities.bold());
            Paint paint11 = new Paint(1);
            f20854h2 = paint11;
            paint11.setColor(352321536);
            f20873i2 = new Paint(1);
            TextPaint textPaint15 = new TextPaint(1);
            f20820f3 = textPaint15;
            textPaint15.setTypeface(AndroidUtilities.bold());
            f20839g3 = new TextPaint(1);
            f20892j2 = new Paint();
            new Paint(1);
            f20947m2 = new Paint(1);
            f20967n2 = new Paint(1);
            f20802e2 = new Paint(1);
            f20819f2 = new Paint(7);
            f20838g2 = new Paint(7);
            e(Hc, f20802e2, "paintChatMessageBackgroundSelected");
            Paint paint12 = f20819f2;
            int i10 = f20938lc;
            e(i10, paint12, "paintChatActionBackground");
            e(i10, f20854h2, "paintChatActionBackgroundDarken");
            e(f20957mc, f20838g2, "paintChatActionBackgroundSelected");
            TextPaint textPaint16 = f21059s2;
            int i11 = f20883ic;
            e(i11, textPaint16, "paintChatActionText");
            e(i11, f21078t2, "paintChatActionText2");
            e(i11, f21096u2, "paintChatActionText3");
            e(Nc, Q2, "paintChatBotButton");
            e(Sd, f20892j2, "paintChatComposeBackground");
            e(f21142wc, f20873i2, "paintChatTimeBackground");
        }
    }

    public static g6 O0(String str) {
        return (g6) H.get(str);
    }

    public static void P() {
        synchronized (f20762c) {
            try {
                if (f20985o2 == null) {
                    f20985o2 = new TextPaint(1);
                    f21151x2 = new TextPaint(1);
                    f21168y2 = new TextPaint[6];
                    f21185z2 = new TextPaint(1);
                    A2 = new TextPaint(1);
                    B2 = new TextPaint(1);
                    TextPaint textPaint = new TextPaint(1);
                    f21132w2 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint2 = new TextPaint(1);
                    W2 = textPaint2;
                    textPaint2.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint3 = new TextPaint(1);
                    Y2 = textPaint3;
                    textPaint3.setTypeface(AndroidUtilities.bold());
                    Z2 = new TextPaint(1);
                    f20726a3 = new TextPaint(1);
                    f20746b3 = new TextPaint(1);
                    f20766c3 = new TextPaint(1);
                    TextPaint textPaint4 = new TextPaint(1);
                    f20783d3 = textPaint4;
                    textPaint4.setTypeface(AndroidUtilities.bold());
                    X2 = new TextPaint(1);
                    U2 = new TextPaint(1);
                    T2 = new TextPaint(1);
                    TextPaint textPaint5 = new TextPaint(1);
                    f21003p2 = textPaint5;
                    Typeface typeface = Typeface.MONOSPACE;
                    textPaint5.setTypeface(typeface);
                    TextPaint textPaint6 = new TextPaint(1);
                    f21022q2 = textPaint6;
                    textPaint6.setTypeface(typeface);
                    TextPaint textPaint7 = new TextPaint(1);
                    f21041r2 = textPaint7;
                    textPaint7.setTypeface(typeface);
                    new TextPaint(1);
                    V2 = new TextPaint(1);
                }
                float[] fArr = {0.68f, 0.46f, 0.34f, 0.28f, 0.22f, 0.19f};
                int i10 = 0;
                while (true) {
                    TextPaint[] textPaintArr = f21168y2;
                    if (i10 < textPaintArr.length) {
                        textPaintArr[i10] = new TextPaint(1);
                        f21168y2[i10].setTextSize(AndroidUtilities.dp(fArr[i10] * 120.0f));
                        i10++;
                    } else {
                        f21185z2.setTextSize(AndroidUtilities.dp(46.0f));
                        A2.setTextSize(AndroidUtilities.dp(38.0f));
                        B2.setTextSize(AndroidUtilities.dp(30.0f));
                        f20985o2.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
                        f21151x2.setTextSize(AndroidUtilities.dp(14.0f));
                        f21132w2.setTextSize(AndroidUtilities.dp(15.0f));
                        float f10 = ((SharedConfig.fontSize * 2) + 10) / 3.0f;
                        W2.setTextSize(AndroidUtilities.dp(f10));
                        Y2.setTextSize(AndroidUtilities.dp(f10));
                        Z2.setTextSize(AndroidUtilities.dp(f10));
                        float f11 = f10 - 1.0f;
                        f20726a3.setTextSize(AndroidUtilities.dp(f11));
                        f20746b3.setTextSize(AndroidUtilities.dp(f10));
                        V2.setTextSize(AndroidUtilities.dp(12.0f));
                        f20783d3.setTextSize(AndroidUtilities.dp(f11));
                        f20766c3.setTextSize(AndroidUtilities.dp(f10 - 2.0f));
                        X2.setTextSize(AndroidUtilities.dp(f10));
                        U2.setTextSize(AndroidUtilities.dp(f11));
                        f21003p2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 1), SharedConfig.fontSize - 2)));
                        f21022q2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 3)));
                        f21041r2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 5)));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Drawable P0(String str) {
        return (Drawable) ml.get(str);
    }

    public static void Q(Context context) {
        if (f20908k0 == null) {
            Paint paint = new Paint();
            f20908k0 = paint;
            paint.setStrokeWidth(1.0f);
            Paint paint2 = new Paint();
            f20928l0 = paint2;
            paint2.setStrokeWidth(1.0f);
            f21020q0 = new Paint(1);
            Paint paint3 = new Paint(1);
            f20983o0 = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            f20983o0.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f20983o0.setStrokeCap(Paint.Cap.ROUND);
            Paint paint4 = new Paint(1);
            f20965n0 = paint4;
            paint4.setColor(0);
            f20965n0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            f21001p0 = new Paint(1);
            Paint paint5 = new Paint();
            m0 = paint5;
            paint5.setPathEffect(z90.c());
            Resources resources = context.getResources();
            Drawable drawable = resources.getDrawable(R.drawable.chats_saved);
            Drawable[] drawableArr = f21039r0;
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
            ek0 ek0Var = f21095u1;
            if (ek0Var != null) {
                ek0Var.setCallback(null);
                f21095u1.C(false);
            }
            ek0 ek0Var2 = f21113v1;
            if (ek0Var2 != null) {
                ek0Var2.C(false);
            }
            ek0 ek0Var3 = f21131w1;
            if (ek0Var3 != null) {
                ek0Var3.C(false);
            }
            ek0 ek0Var4 = f21150x1;
            if (ek0Var4 != null) {
                ek0Var4.C(false);
            }
            ek0 ek0Var5 = f21167y1;
            if (ek0Var5 != null) {
                ek0Var5.C(false);
            }
            ek0 ek0Var6 = f21184z1;
            if (ek0Var6 != null) {
                ek0Var6.C(false);
            }
            f21095u1 = new ek0(R.raw.chats_archiveavatar, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21113v1 = new ek0(R.raw.chats_archive, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21131w1 = new ek0(R.raw.chats_unarchive, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21150x1 = new ek0(R.raw.chats_hide, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21167y1 = new ek0(R.raw.chats_unhide, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21184z1 = new ek0(R.raw.chat_audio_record_delete, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), false, null);
            H1 = new ek0(R.raw.swipe_mute, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            I1 = new ek0(R.raw.swipe_unmute, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            L1 = new ek0(R.raw.swipe_read, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            M1 = new ek0(R.raw.swipe_unread, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            J1 = new ek0(R.raw.swipe_delete, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            O1 = new ek0(R.raw.swipe_unpin, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            N1 = new ek0(R.raw.swipe_pin, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            K1 = new ek0(R.raw.swipe_community_ungroup, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
            k();
        }
    }

    public static Drawable Q0(String str, d6 d6Var) {
        Drawable drawable;
        if (d6Var != null) {
            drawable = d6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return (Drawable) ml.get(str);
    }

    public static dd0 R(int i10, int i11) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dd0 dd0Var = new dd0(z10, -2368069, -9722489, -2762611, -7817084);
        if (i10 <= 0 || i11 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            i11 = Math.max(point2.x, point2.y);
        }
        dd0Var.t(SvgHelper.getBitmap(R.raw.default_pattern, i10, i11, -16777216, 1.0f, SvgHelper.ScaleMode.ByWidth), 34);
        dd0Var.u(dd0Var.f());
        return dd0Var;
    }

    public static SparseIntArray R0(File file, String str, String[] strArr) {
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
                                        int s10 = e5.s(substring);
                                        if (s10 >= 0) {
                                            sparseIntArray.put(s10, intValue);
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
                sparseIntArray.put(f20841g5, i11);
                fileInputStream2.close();
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        return sparseIntArray;
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
            f21130w0 = new Paint(1);
            f21076t0 = new Paint(1);
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
            f21094u0 = new Paint();
            f21112v0 = new Paint(1);
            f21166y0 = new Paint(1);
            f21149x0 = new Paint(1);
            f21183z0 = new Paint(1);
            f20725a1 = resources.getDrawable(R.drawable.list_secret);
            f20744b1 = resources.getDrawable(R.drawable.msg_mini_lock2);
            T0 = resources.getDrawable(R.drawable.list_check).mutate();
            S0 = resources.getDrawable(R.drawable.community_cards).mutate();
            U0 = resources.getDrawable(R.drawable.minithumb_play).mutate();
            V0 = resources.getDrawable(R.drawable.list_check).mutate();
            W0 = resources.getDrawable(R.drawable.list_halfcheck);
            X0 = new kd0();
            Y0 = resources.getDrawable(R.drawable.list_warning_sign);
            Z0 = resources.getDrawable(R.drawable.list_reorder).mutate();
            f20764c1 = resources.getDrawable(R.drawable.list_mute).mutate();
            f20781d1 = resources.getDrawable(R.drawable.list_unmute).mutate();
            f20801e1 = resources.getDrawable(R.drawable.mini_ephemeral_hidden_16).mutate();
            f20818f1 = resources.getDrawable(R.drawable.verified_area).mutate();
            f20837g1 = new fn0(0);
            f20853h1 = new fn0(1);
            f20872i1 = resources.getDrawable(R.drawable.verified_check).mutate();
            f20946m1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            f20966n1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            f20984o1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            f21002p1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            f21021q1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            f21040r1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            f20891j1 = resources.getDrawable(R.drawable.list_pin);
            f20909k1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            l1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            f21077t1 = resources.getDrawable(R.drawable.msg_mini_forumarrow);
            f21057s0 = resources.getDrawable(R.drawable.preview_arrow);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = f20728a5;
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

    public static float S0(float f10) {
        if (f10 < 0.0f && !I.q()) {
            return -f10;
        }
        return f10;
    }

    public static s5 T(Context context) {
        return U(context, x0(null, f21099u5, false), x0(null, f21117v5, false));
    }

    public static Paint T0(String str) {
        if (Objects.equals(str, "paintDivider")) {
            return f20908k0;
        }
        return (Paint) ol.get(str);
    }

    public static s5 U(Context context, int i10, int i11) {
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

    public static Paint U0(String str, d6 d6Var) {
        Paint F10;
        if (d6Var != null && (F10 = d6Var.F(str)) != null) {
            return F10;
        }
        return T0(str);
    }

    public static s5 V(Context context, int i10, int i11, int i12) {
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

    public static Drawable V0(Context context, int i10, int i11) {
        if (context == null) {
            return null;
        }
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        return mutate;
    }

    public static org.telegram.ui.Cells.z W(float f10, int i10, int i11) {
        return X(f10, 285212671, i10, i11, i10, i11);
    }

    public static Drawable W0(Context context, int i10, int i11) {
        return V0(context, i10, x0(null, i11, false));
    }

    public static org.telegram.ui.Cells.z X(float f10, int i10, int i11, int i12, int i13, int i14) {
        f21182z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new u5(i11, i12, i13, i14, f10));
    }

    public static android.graphics.drawable.Drawable X0(android.view.View r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h6.X0(android.view.View, boolean):android.graphics.drawable.Drawable");
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

    public static int Y0(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 | (-16777216);
    }

    public static org.telegram.ui.Cells.z Z(int i10, int i11, int i12) {
        f21182z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new e6(i11, i12));
    }

    public static String Z0(z5 z5Var) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (z5Var == null || TextUtils.isEmpty(z5Var.f21723c) || z5Var.f21723c.equals("d")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z5Var.f21727i) {
            sb2.append("blur");
        }
        if (z5Var.f21728j) {
            if (sb2.length() > 0) {
                sb2.append("+");
            }
            sb2.append("motion");
        }
        int i10 = z5Var.d;
        if (i10 == 0) {
            str3 = "https://attheme.org?slug=" + z5Var.f21723c;
        } else {
            String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (z5Var.d >> 8)) & 255), Byte.valueOf((byte) (z5Var.d & 255))).toLowerCase();
            int i11 = z5Var.f21724e;
            if (i11 != 0) {
                str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (z5Var.f21724e >> 8)) & 255), Byte.valueOf((byte) (z5Var.f21724e & 255))).toLowerCase();
            } else {
                str = null;
            }
            int i12 = z5Var.f21725f;
            if (i12 != 0) {
                str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (z5Var.f21725f >> 8)) & 255), Byte.valueOf((byte) (z5Var.f21725f & 255))).toLowerCase();
            } else {
                str2 = null;
            }
            int i13 = z5Var.f21726g;
            if (i13 != 0) {
                str4 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (z5Var.f21726g >> 8)) & 255), Byte.valueOf((byte) (z5Var.f21726g & 255))).toLowerCase();
            }
            if (str != null && str2 != null) {
                if (str4 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(lowerCase);
                    sb3.append("~");
                    sb3.append(str);
                    sb3.append("~");
                    sb3.append(str2);
                    lowerCase = a1.g.t(sb3, "~", str4);
                } else {
                    lowerCase = lowerCase + "~" + str + "~" + str2;
                }
            } else if (str != null) {
                StringBuilder j10 = sc.v.j(a1.g.D(lowerCase, "-", str), "&rotation=");
                j10.append(z5Var.h);
                lowerCase = j10.toString();
            }
            str3 = "https://attheme.org?slug=" + z5Var.f21723c + "&intensity=" + ((int) (z5Var.f21729k * 100.0f)) + "&bg_color=" + lowerCase;
        }
        if (sb2.length() > 0) {
            StringBuilder j11 = sc.v.j(str3, "&mode=");
            j11.append(sb2.toString());
            return j11.toString();
        }
        return str3;
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

    public static org.telegram.ui.Cells.z a0(int i10, int i11, int i12, int i13) {
        f21182z.setColor(-1);
        float f10 = i12;
        float f11 = i13;
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), d0(AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), i10), new e6(f10, f11));
    }

    public static boolean a1() {
        if (P && I.f20668i0 != null) {
            return true;
        }
        return false;
    }

    public static int b(float f10, float f11, int i10) {
        float[] N02 = N0(5);
        Color.colorToHSV(i10, N02);
        float f12 = N02[1];
        if (f12 > 0.1f && f12 < 0.9f) {
            N02[1] = w7.o.a(f12 + f10, 0.0f, 1.0f);
        }
        N02[2] = w7.o.a(N02[2] + f11, 0.0f, 1.0f);
        return Color.HSVToColor(Color.alpha(i10), N02);
    }

    public static org.telegram.ui.Cells.z b0(int i10, int i11, int i12, int i13, int i14) {
        f21182z.setColor(-1);
        ?? drawable = new Drawable();
        drawable.f20576a = new Path();
        drawable.f20577b = r1;
        drawable.f20578c = true;
        float dp = AndroidUtilities.dp(i11);
        float dp2 = AndroidUtilities.dp(i12);
        float dp3 = AndroidUtilities.dp(i13);
        float dp4 = AndroidUtilities.dp(i14);
        float[] fArr = {dp, dp, dp2, dp2, dp3, dp3, dp4, dp4};
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, drawable);
    }

    public static boolean b1() {
        if (Z != null) {
            return true;
        }
        return false;
    }

    public static int c(int i10, int i11) {
        float[] N02 = N0(5);
        Color.colorToHSV(i11, N02);
        float f10 = N02[0];
        float f11 = N02[1];
        Color.colorToHSV(i10, N02);
        N02[0] = f10;
        N02[1] = AndroidUtilities.lerp(N02[1], f11, 0.25f);
        return Color.HSVToColor(Color.alpha(i10), N02);
    }

    public static ShapeDrawable c0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        return shapeDrawable;
    }

    public static boolean c1(int i10) {
        float[] N02 = N0(3);
        Color.colorToHSV(i10, N02);
        float f10 = N02[1];
        if (f10 > 0.1f && f10 < 0.9f) {
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
        if (ul.indexOfKey(i10) >= 0) {
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
        shapeDrawable.getPaint().setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), m1(Color.alpha(i11) / 255.0f, 285212672));
        return new InsetDrawable((Drawable) shapeDrawable, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
    }

    public static boolean e1() {
        g6 g6Var = I;
        if (!g6Var.S || g6Var.Y != f20964n) {
            if (ul.indexOfKey(Nd) < 0 && f20836g0 <= 0 && TextUtils.isEmpty(f20852h0)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void f(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        if (z10) {
            int i10 = xk;
            if (sparseIntArray.indexOfKey(i10) < 0) {
                sparseIntArray2.put(i10, m1(0.1f, -1));
            }
        }
        int[] iArr = ql;
        int i11 = f21049ra;
        int i12 = sparseIntArray2.get(i11, iArr[i11]);
        int F12 = F1(sparseIntArray2);
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
            sparseIntArray2.put(i15, w(F12, z10, false));
        }
        int i16 = Ck;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            sparseIntArray2.put(i16, w(F12, z10, true));
        }
        int i17 = Dk;
        if (sparseIntArray.indexOfKey(i17) < 0) {
            sparseIntArray2.put(i17, x(i12, z10, false, true));
        }
        int i18 = Ek;
        if (sparseIntArray.indexOfKey(i18) < 0) {
            sparseIntArray2.put(i18, x(F12, z10, true, true));
        }
        int i19 = Fk;
        if (sparseIntArray.indexOfKey(i19) < 0) {
            sparseIntArray2.put(i19, x(i12, z10, false, false));
        }
        int i20 = Gk;
        if (sparseIntArray.indexOfKey(i20) < 0) {
            sparseIntArray2.put(i20, x(F12, z10, true, false));
        }
    }

    public static org.telegram.ui.Cells.z f0(int i10, int i11) {
        return g0(i10, i11, -1);
    }

    public static boolean f1() {
        return I.q();
    }

    public static void g(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        int[] iArr = ql;
        int i10 = f21049ra;
        int i11 = sparseIntArray2.get(i10, iArr[i10]);
        int F12 = F1(sparseIntArray2);
        int i12 = rk;
        if (sparseIntArray.indexOfKey(i12) < 0) {
            sparseIntArray2.put(i12, y(i11, z10, false));
        }
        int i13 = sk;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, y(F12, z10, true));
        }
        int i14 = tk;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, z(i11, z10, false));
        }
        int i15 = uk;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, z(F12, z10, true));
        }
        int i16 = wk;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            int i17 = f20734ab;
            sparseIntArray2.put(i16, m1(0.2f, sparseIntArray2.get(i17, iArr[i17])));
        }
        if (z10) {
            int i18 = vk;
            if (sparseIntArray.indexOfKey(i18) < 0) {
                int i19 = Yc;
                sparseIntArray2.put(i18, m1(0.2f, sparseIntArray2.get(i19, iArr[i19])));
            }
        }
    }

    public static org.telegram.ui.Cells.z g0(int r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h6.g0(int, int, int):org.telegram.ui.Cells.z");
    }

    public static boolean g1() {
        return !I.q();
    }

    public static void h(Drawable drawable) {
        boolean z10;
        Bitmap bitmap;
        if (f20802e2 == null) {
            return;
        }
        int i10 = ul.get(Hc);
        if ((drawable instanceof dd0) && SharedConfig.getDevicePerformanceClass() != 0 && i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && Y != (bitmap = ((dd0) drawable).f25556k)) {
            Y = bitmap;
            Bitmap bitmap2 = Y;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            Z = new BitmapShader(bitmap2, tileMode, tileMode);
            if (f20724a0 == null) {
                f20724a0 = new Matrix();
            }
        }
        if (Z != null && i10 == 0 && z10) {
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 2.5f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.75f);
            f20802e2.setShader(Z);
            f20802e2.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            f20802e2.setAlpha(64);
            return;
        }
        Paint paint = f20802e2;
        if (i10 == 0) {
            i10 = 1073741824;
        }
        paint.setColor(i10);
        f20802e2.setColorFilter(null);
        f20802e2.setShader(null);
    }

    public static org.telegram.ui.Cells.z h0(int i10, int i11) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), new ColorDrawable(i10), new ColorDrawable(i10));
    }

    public static boolean h1(f6 f6Var) {
        g6 g6Var = f6Var.f20607b;
        if (g6Var != null) {
            if (g6Var.m().equals("Blue") && f6Var.f20606a == 99) {
                return true;
            }
            if (f6Var.f20607b.m().equals("Day") && f6Var.f20606a == 9) {
                return true;
            }
            if ((f6Var.f20607b.m().equals("Night") || f6Var.f20607b.m().equals("Dark Blue")) && f6Var.f20606a == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void i(Drawable drawable) {
        int i10;
        int i11;
        Bitmap bitmap;
        float f10;
        float f11;
        float f12;
        float f13;
        if (f20819f2 == null) {
            return;
        }
        X = f20763c0;
        f20743b0 = f20780d0;
        SparseIntArray sparseIntArray = ul;
        int i12 = f20938lc;
        int indexOfKey = sparseIntArray.indexOfKey(i12);
        if (indexOfKey >= 0) {
            i10 = ul.valueAt(indexOfKey);
        } else {
            i10 = X;
        }
        int indexOfKey2 = ul.indexOfKey(f20957mc);
        if (indexOfKey2 >= 0) {
            i11 = ul.valueAt(indexOfKey2);
        } else {
            i11 = f20743b0;
        }
        boolean z10 = drawable instanceof dd0;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z10) {
                bitmap = ((dd0) drawable).f25556k;
            } else {
                if (drawable instanceof BitmapDrawable) {
                    WeakReference weakReference = Il;
                    if (weakReference != null && weakReference.get() == drawable) {
                        bitmap = Jl;
                    } else {
                        WeakReference weakReference2 = Il;
                        if (weakReference2 != null) {
                            weakReference2.clear();
                        }
                        Il = null;
                        if (drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
                            Il = new WeakReference(drawable);
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
                            Jl = createBitmap;
                            bitmap = createBitmap;
                        } else {
                            Jl = null;
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
                if (f20724a0 == null) {
                    f20724a0 = new Matrix();
                }
            }
            x1(-1, Y3);
            x1(-1, H3);
            x1(-1, I3);
            x1(-1, J3);
            x1(-1, K3);
            f21059s2.setColor(-1);
            f21078t2.setColor(-1);
            f21096u2.setColor(-1);
            f21059s2.linkColor = -1;
            f21114v2.setColor(-1);
            Q2.setColor(-1);
            x1(-1, C4);
            x1(-1, f21024q4);
            x1(-1, f21043r4);
            x1(-1, f21098u4);
            x1(-1, f21153x4);
            x1(-1, f21169y4);
            x1(-1, A4);
            x1(-1, f21187z4);
            x1(-1, f21116v4);
        } else {
            Y = null;
            Z = null;
            Drawable drawable2 = Y3;
            int i13 = f20883ic;
            y1(i13, drawable2);
            y1(i13, H3);
            y1(i13, I3);
            y1(i13, J3);
            y1(i13, K3);
            f21059s2.setColor(x0(null, i13, false));
            f21078t2.setColor(x0(null, i13, false));
            f21059s2.linkColor = x0(null, f20901jc, false);
            f21114v2.setColor(x0(null, i13, false));
            Drawable drawable3 = C4;
            int i14 = f20920kc;
            y1(i14, drawable3);
            y1(i14, f21024q4);
            y1(i14, f21043r4);
            y1(i14, f21098u4);
            y1(i14, f21153x4);
            y1(i14, f21169y4);
            y1(i14, A4);
            y1(i14, f21187z4);
            y1(i14, f21116v4);
            Q2.setColor(x0(null, Nc, false));
        }
        f20819f2.setColor(i10);
        f20838g2.setColor(i11);
        if (Z != null && (ul.indexOfKey(i12) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix2 = new ColorMatrix();
            if (z10) {
                float f14 = -0.06f;
                if (((dd0) drawable).f25562q >= 0.0f) {
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
            f20819f2.setFilterBitmap(true);
            f20819f2.setShader(Z);
            f20819f2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
            f20819f2.setAlpha(255);
            f20838g2.setFilterBitmap(true);
            f20838g2.setShader(Z);
            ColorMatrix colorMatrix3 = new ColorMatrix(colorMatrix2);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.26f);
            f1();
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix3, 0.92f);
            f20838g2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
            f20838g2.setAlpha(255);
            f20854h2.setAlpha(0);
            return;
        }
        f20819f2.setColorFilter(null);
        f20819f2.setShader(null);
        f20838g2.setColorFilter(null);
        f20838g2.setShader(null);
        f20854h2.setAlpha(21);
    }

    public static org.telegram.ui.Cells.z i0(int i10, int i11, int i12) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(i11);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(ovalShape);
        shapeDrawable2.getPaint().setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i12}), shapeDrawable, shapeDrawable2);
    }

    public static void i1(int i10, boolean z10) {
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
                ConnectionsManager.getInstance(i10).sendRequest(getthemes, new ei.q2(i10, 3));
            }
        }
    }

    public static void j(boolean z10, boolean z11) {
        if (f20985o2 != null && f20948m3 != null && !z10) {
            K2.setColor(x0(null, Jc, false));
            J2.setColor(x0(null, Ic, false));
            Q2.setColor(x0(null, Nc, false));
            U1.setColor(x0(null, Ld, false));
            V1.setColor(x0(null, Mb, false));
            W1.setColor(x0(null, Md, false));
            f20745b2.setColor(x0(null, Fc, false));
            Paint paint = f20765c2;
            int i10 = f21010pa;
            paint.setColor(x0(null, i10, false));
            f20782d2.setColor(x0(null, i10, false));
            TextPaint textPaint = f21059s2;
            int i11 = f20883ic;
            textPaint.setColor(x0(null, i11, false));
            f21078t2.setColor(x0(null, i11, false));
            f21096u2.setColor(x0(null, i11, false));
            f21059s2.linkColor = x0(null, f20901jc, false);
            f21114v2.setColor(x0(null, i11, false));
            f20820f3.setColor(x0(null, G6, false));
            Paint paint2 = f20892j2;
            int i12 = Sd;
            paint2.setColor(x0(null, i12, false));
            f20873i2.setColor(x0(null, f21142wc, false));
            y1(f20921kd, f20855h3);
            d5 d5Var = f20948m3;
            int i13 = f21049ra;
            y1(i13, d5Var);
            d5 d5Var2 = f20968n3;
            int i14 = f20792dc;
            y1(i14, d5Var2);
            y1(i13, f21023q3);
            y1(i14, f21042r3);
            y1(Ja, y3);
            y1(Ka, f21186z3);
            Drawable drawable = A3;
            int i15 = La;
            y1(i15, drawable);
            Drawable drawable2 = B3;
            int i16 = Ma;
            y1(i16, drawable2);
            y1(i15, C3);
            y1(i16, D3);
            Drawable drawable3 = F3;
            int i17 = f21069sc;
            y1(i17, drawable3);
            y1(i17, G3);
            y1(i11, H3);
            y1(i11, I3);
            y1(i11, J3);
            y1(i11, K3);
            y1(i11, L3);
            Drawable drawable4 = f21024q4;
            int i18 = f20920kc;
            y1(i18, drawable4);
            y1(i18, f21043r4);
            y1(i18, f21098u4);
            y1(i18, f21153x4);
            y1(i18, f21169y4);
            Drawable drawable5 = A4;
            int i19 = f21012pc;
            y1(i19, drawable5);
            y1(i18, f21187z4);
            y1(i18, f21116v4);
            Drawable drawable6 = M3;
            int i20 = xc;
            y1(i20, drawable6);
            Drawable drawable7 = N3;
            int i21 = yc;
            y1(i21, drawable7);
            Drawable drawable8 = O3;
            int i22 = Ra;
            y1(i22, drawable8);
            Drawable drawable9 = P3;
            int i23 = Sa;
            y1(i23, drawable9);
            y1(i20, Q3);
            y1(i21, R3);
            y1(i22, S3);
            y1(i23, T3);
            y1(i20, U3);
            y1(i21, V3);
            y1(i22, W3);
            y1(i23, X3);
            Drawable drawable10 = Z3;
            int i24 = f21195zc;
            y1(i24, drawable10);
            y1(i11, Y3);
            y1(i24, f20727a4);
            y1(i24, f20747b4);
            y1(Ac, f20767c4);
            y1(Bc, f20784d4);
            y1(Ta, f20804e4);
            y1(Ua, f20821f4);
            y1(Cc, f20840g4);
            Drawable drawable11 = f20875i4;
            int i25 = Va;
            y1(i25, drawable11);
            Drawable drawable12 = f20856h4;
            int i26 = Dc;
            y1(i26, drawable12);
            y1(Gc, f20893j4);
            y1(f20994oc, f20912k4);
            y1(i19, l4);
            Drawable drawable13 = f20949m4;
            int i27 = Ge;
            y1(i27, drawable13);
            y1(i27, f20969n4);
            y1(i27, f20987o4);
            y1(i26, B4);
            y1(i18, C4);
            y1(i26, D4);
            Drawable drawable14 = E4;
            int i28 = Be;
            y1(i28, drawable14);
            y1(i28, F4);
            for (int i29 = 0; i29 < 2; i29++) {
                y1(i26, G4[i29]);
                y1(Ec, H4[i29]);
                y1(i25, I4[i29]);
                y1(Wa, J4[i29]);
            }
            y1(Ia, O4);
            Drawable drawable15 = P4;
            int i30 = f21046r7;
            y1(i30, drawable15);
            y1(f21029qa, Q4);
            y1(i30, V4);
            Drawable drawable16 = W4;
            int i31 = Di;
            y1(i31, drawable16);
            y1(i30, X4);
            y1(i31, Y4);
            int i32 = 0;
            while (true) {
                qx0[] qx0VarArr = f21097u3;
                if (i32 >= qx0VarArr.length) {
                    break;
                }
                y1(f21009p9, qx0VarArr[i32]);
                i32++;
            }
            for (int i33 = 0; i33 < 5; i33++) {
                Drawable[][] drawableArr = U4;
                w1(drawableArr[i33][0], x0(null, f20885ie, false), false);
                w1(drawableArr[i33][0], x0(null, f21106uc, false), true);
                w1(drawableArr[i33][1], x0(null, f20903je, false), false);
                w1(drawableArr[i33][1], x0(null, f21123vc, false), true);
            }
            Drawable[] drawableArr2 = T4;
            w1(drawableArr2[0], x0(null, f21052re, false), false);
            w1(drawableArr2[0], x0(null, f21071se, false), true);
            w1(drawableArr2[1], x0(null, Qb, false), false);
            w1(drawableArr2[1], x0(null, Rb, false), true);
            Drawable[] drawableArr3 = S4;
            x1(x0(null, f21033qe, false), drawableArr3[0]);
            x1(x0(null, Pb, false), drawableArr3[1]);
            Drawable[] drawableArr4 = M4;
            x1(x0(null, Kc, false), drawableArr4[0]);
            x1(x0(null, Xa, false), drawableArr4[1]);
            Drawable[] drawableArr5 = N4;
            x1(x0(null, i20, false), drawableArr5[0]);
            x1(x0(null, i22, false), drawableArr5[1]);
            y1(Td, f20874i3);
            y1(i12, j3);
            int i34 = -1;
            if (x0(null, f21194zb, false) == -1) {
                i34 = x0(null, Aa, false);
            }
            x1(i34, K4[1]);
            x1(i34, L4[1]);
            x1(x0(null, f20790da, false), R4);
            if (!z11 && !f20742b) {
                Drawable drawable17 = f20800e0;
                if (drawable17 != null) {
                    i(drawable17);
                }
                h(f20800e0);
            }
        }
    }

    public static org.telegram.ui.Cells.z j0(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
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

    public static Bitmap j1(FileInputStream fileInputStream, int i10) {
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

    public static void k() {
        Paint paint = f20908k0;
        if (paint == null) {
            return;
        }
        paint.setColor(x0(null, f20787d7, false));
        m0.setColor(x0(null, K6, false));
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = f21039r0;
            int length = drawableArr.length;
            int i11 = J7;
            if (i10 < length) {
                y1(i11, drawableArr[i10]);
                i10++;
            } else {
                ek0 ek0Var = f21095u1;
                ek0Var.Z = true;
                int i12 = M7;
                ek0Var.Q(x0(null, i12, true), "Arrow1");
                f21095u1.Q(x0(null, i12, true), "Arrow2");
                f21095u1.Q(x0(null, i11, true), "Box2");
                f21095u1.Q(x0(null, i11, true), "Box1");
                f21095u1.o();
                C1 = false;
                f21095u1.J(true);
                ek0 ek0Var2 = f21150x1;
                ek0Var2.Z = true;
                int i13 = f20808e9;
                ek0Var2.Q(x0(null, i13, true), "Arrow");
                f21150x1.Q(x0(null, i13, true), "Line");
                f21150x1.o();
                ek0 ek0Var3 = f21167y1;
                ek0Var3.Z = true;
                ek0Var3.Q(x0(null, i13, true), "Arrow");
                f21167y1.Q(x0(null, i13, true), "Line");
                f21167y1.o();
                ek0 ek0Var4 = f21184z1;
                ek0Var4.Z = true;
                int i14 = f20772c9;
                ek0Var4.Q(x0(null, i14, true), "Line 1");
                f21184z1.Q(x0(null, i14, true), "Line 2");
                f21184z1.Q(x0(null, i14, true), "Line 3");
                f21184z1.Q(x0(null, i13, true), "Cup Red");
                f21184z1.Q(x0(null, i13, true), "Box");
                f21184z1.o();
                B1 = false;
                ek0 ek0Var5 = f21113v1;
                ek0Var5.Z = true;
                ek0Var5.Q(x0(null, i14, true), "Arrow");
                f21113v1.Q(x0(null, i13, true), "Box2");
                f21113v1.Q(x0(null, i13, true), "Box1");
                f21113v1.o();
                A1 = false;
                ek0 ek0Var6 = f21131w1;
                ek0Var6.Z = true;
                ek0Var6.Q(x0(null, i13, true), "Arrow1");
                f21131w1.Q(x0(null, f20789d9, true), "Arrow2");
                f21131w1.Q(x0(null, i13, true), "Box2");
                f21131w1.Q(x0(null, i13, true), "Box1");
                f21131w1.o();
                int x02 = x0(null, G6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                f21115v3 = new PorterDuffColorFilter(x02, mode);
                f21133w3 = new PorterDuffColorFilter(x0(null, f20828fc, false), mode);
                rg.b1.d().b();
                return;
            }
        }
    }

    public static boolean k0(g6 g6Var, f6 f6Var, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (f6Var == null || g6Var == null || g6Var.f20658b0 == null) {
            return false;
        }
        if (f6Var.f20606a == g6Var.Y) {
            z11 = true;
        } else {
            z11 = false;
        }
        File d10 = f6Var.d();
        if (d10 != null) {
            d10.delete();
        }
        g6Var.f20656a0.remove(f6Var.f20606a);
        g6Var.f20658b0.remove(f6Var);
        TLRPC.TL_theme tL_theme = f6Var.f20621r;
        if (tL_theme != null) {
            g6Var.f20660c0.remove(tL_theme.f20169id);
        }
        z5 z5Var = f6Var.f20627y;
        if (z5Var != null) {
            z5.a(z5Var);
        }
        if (z11) {
            g6Var.u(((f6) g6Var.f20658b0.get(0)).f20606a);
        }
        if (z10) {
            u1(g6Var, true, false, false, false, false);
            if (f6Var.f20621r != null) {
                MessagesController messagesController = MessagesController.getInstance(f6Var.f20623t);
                if (z11 && g6Var == J) {
                    z12 = true;
                }
                messagesController.saveTheme(g6Var, f6Var, z12, true);
            }
        }
        return z11;
    }

    public static void k1(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h6.k1(boolean):void");
    }

    public static void l(boolean z10) {
        g6 g6Var;
        if (M == null) {
            if (z10) {
                g6 g6Var2 = I;
                g6 g6Var3 = J;
                if (g6Var2 != g6Var3) {
                    if (g6Var2 == null || (g6Var3 != null && g6Var2.q() != J.q())) {
                        R = true;
                        f20870i = SystemClock.elapsedRealtime();
                        Q = true;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, J, Boolean.TRUE, null, -1);
                        Q = false;
                        return;
                    }
                    return;
                }
                return;
            }
            g6 g6Var4 = K;
            if (g6Var4 != null && g6Var4.q() && f20982o != 0 && (g6Var = L) != null) {
                g6Var4 = g6Var;
            }
            g6 g6Var5 = I;
            if (g6Var5 != g6Var4) {
                if (g6Var5 == null || (g6Var4 != null && g6Var5.q() != g6Var4.q())) {
                    R = false;
                    f20870i = SystemClock.elapsedRealtime();
                    Q = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, g6Var4, Boolean.TRUE, null, -1);
                    Q = false;
                }
            }
        }
    }

    public static g6 l0(File file, String str, TLRPC.TL_theme tL_theme) {
        String[] split;
        try {
            g6 g6Var = new g6();
            g6Var.f20655a = str;
            g6Var.F = tL_theme;
            g6Var.f20657b = file.getAbsolutePath();
            g6Var.E = UserConfig.selectedAccount;
            String[] strArr = new String[1];
            G(R0(new File(g6Var.f20657b), null, strArr), g6Var);
            if (!TextUtils.isEmpty(strArr[0])) {
                String str2 = strArr[0];
                g6Var.f20659c = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(str2) + ".wp").getAbsolutePath();
                Uri parse = Uri.parse(str2);
                g6Var.f20662e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        if ("blur".equals(split[i10])) {
                            g6Var.h = true;
                        } else if ("motion".equals(split[i10])) {
                            g6Var.f20670n = true;
                        }
                    }
                }
                String queryParameter2 = parse.getQueryParameter("intensity");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String queryParameter3 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            g6Var.f20671r = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                            if (queryParameter3.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(6))) {
                                g6Var.f20672s = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter3.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(13))) {
                                g6Var.v = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter3.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(20))) {
                                g6Var.f20673w = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String queryParameter4 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            g6Var.f20674x = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        g6Var.f20675y = Utilities.parseInt((CharSequence) queryParameter2).intValue();
                    }
                    if (g6Var.f20675y == 0) {
                        g6Var.f20675y = 50;
                    }
                }
                return g6Var;
            }
            f20852h0 = null;
            return g6Var;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static Drawable l1(z5 z5Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable drawable;
        ci.u5 I10 = I(I, z5Var, ul, file, f20852h0, f20836g0, i10, S, z11, O, P, z10, document, false);
        Boolean bool = (Boolean) I10.f6066c;
        if (bool != null) {
            z12 = bool.booleanValue();
        } else {
            z12 = f20871i0;
        }
        f20871i0 = z12;
        Boolean bool2 = (Boolean) I10.d;
        if (bool2 != null) {
            z13 = bool2.booleanValue();
        } else {
            z13 = f20890j0;
        }
        f20890j0 = z13;
        Boolean bool3 = (Boolean) I10.f6067e;
        if (bool3 != null) {
            z14 = bool3.booleanValue();
        } else {
            z14 = W;
        }
        W = z14;
        Drawable drawable2 = (Drawable) I10.f6064a;
        if (drawable2 != null) {
            drawable = drawable2;
        } else {
            drawable = f20800e0;
        }
        f20800e0 = drawable;
        int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(drawable2);
        int i11 = calcDrawableColor[0];
        f20763c0 = i11;
        X = i11;
        int i12 = calcDrawableColor[1];
        f20780d0 = i12;
        f20743b0 = i12;
        Drawable drawable3 = f20800e0;
        if (drawable3 != null) {
            i(drawable3);
        }
        return drawable2;
    }

    public static void m(Paint paint) {
        paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), f20723a);
    }

    public static Paint m0(int i10) {
        Paint paint = Kl;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
        }
        return paint;
    }

    public static int m1(float f10, int i10) {
        if (f10 == 1.0f) {
            return i10;
        }
        return i0.a.k(i10, w7.o.b((int) (Color.alpha(i10) * f10), 0, 255));
    }

    public static void n() {
        if (B0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = f21009p9;
            int i12 = f20845g9;
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
                int x03 = x0(null, f20954m9, false);
                textPaint2.linkColor = x03;
                textPaint2.setColor(x03);
                f21094u0.setColor(x0(null, f21085t9, false));
                f21112v0.setColor(x0(null, f21066s9, false));
                I0.setColor(x0(null, f21028q9, false));
                J0.setColor(x0(null, f21048r9, false));
                TextPaint textPaint3 = K0;
                int i15 = il;
                textPaint3.setColor(x0(null, i15, false));
                TextPaint textPaint4 = L0;
                int i16 = W8;
                textPaint4.setColor(x0(null, i16, false));
                M0.setColor(x0(null, i16, false));
                TextPaint textPaint5 = N0;
                int i17 = f20825f9;
                textPaint5.setColor(x0(null, i17, false));
                O0.setColor(x0(null, i17, false));
                Paint paint = f21130w0;
                int i18 = U8;
                paint.setColor(x0(null, i18, false));
                Paint paint2 = f21166y0;
                int i19 = V8;
                paint2.setColor(x0(null, i19, false));
                f21183z0.setColor(x0(null, i11, false));
                f21149x0.setColor(x0(null, f21158x9, false));
                P0.setColor(x0(null, f21006p6, false));
                Q0.setColor(x0(null, A6, false));
                y1(f20732a9, f20725a1);
                Drawable drawable = f20744b1;
                int i20 = f20752b9;
                y1(i20, drawable);
                y1(f21103u9, T0);
                y1(G6, S0);
                Drawable drawable2 = V0;
                int i21 = v9;
                y1(i21, drawable2);
                y1(i21, W0);
                y1(f21139w9, X0);
                y1(f21174y9, Y0);
                y1(i20, f20891j1);
                y1(i20, f20909k1);
                y1(i15, l1);
                y1(i20, Z0);
                Drawable drawable3 = f20764c1;
                int i22 = B9;
                y1(i22, drawable3);
                y1(i22, f20781d1);
                y1(i22, f20801e1);
                y1(i18, f20946m1);
                y1(Z5, f20966n1);
                y1(zj, f20984o1);
                y1(i19, f21002p1);
                y1(i19, f21021q1);
                y1(i19, f21040r1);
                y1(i12, f21077t1);
                y1(f21192z9, f20818f1);
                y1(A9, f20872i1);
                y1(A8, f21058s1);
                fn0 fn0Var = f20837g1;
                int i23 = f20898j9;
                y1(i23, fn0Var);
                y1(i23, f20853h1);
                return;
            }
        }
    }

    public static g6 n0() {
        return I;
    }

    public static int n1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h6.n1():int");
    }

    public static void o() {
        g6 g6Var;
        g6 g6Var2 = M;
        if (g6Var2 == null) {
            return;
        }
        O = false;
        if (R && (g6Var = J) != null) {
            t(g6Var, true, true);
        } else if (!P) {
            t(g6Var2, true, false);
        }
        P = false;
        M = null;
        E(false);
    }

    public static ColorFilter o0(d6 d6Var) {
        if (d6Var != null) {
            return d6Var.x();
        }
        return f21115v3;
    }

    public static void o1(boolean z10, boolean z11) {
        ul = tl.clone();
        wl = true;
        f6 k10 = I.k(false);
        if (k10 != null) {
            wl = k10.c(tl, ul);
        }
        g(tl, ul, I.q());
        f(tl, ul, I.q());
        if (!z11) {
            p1(!(LaunchActivity.R() instanceof zn));
        }
        k();
        n();
        p();
        j(false, z10);
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.y3(3, !O));
    }

    public static void p() {
        if (Q1 == null) {
            return;
        }
        P1.setColor(x0(null, G6, false));
        P1.linkColor = x0(null, J6, false);
        y1(f21200zh, Q1);
        y1(Ah, R1);
    }

    public static m8 p0(MessageObject messageObject) {
        HashMap hashMap = f20805e5;
        if (hashMap != null && messageObject != null) {
            return (m8) hashMap.get(messageObject);
        }
        return null;
    }

    public static void p1(boolean z10) {
        s9 s9Var = V;
        if (s9Var != null) {
            s9Var.dispose();
            V = null;
        }
        Drawable drawable = f20800e0;
        if (drawable instanceof dd0) {
            S = ((dd0) drawable).f25554i;
        } else {
            S = 0;
        }
        f20800e0 = null;
        f20817f0 = null;
        k1(z10);
    }

    public static void q(float f10, float f11, int i10, int i11) {
        r(Y, Z, f20724a0, i10, i11, f10, f11);
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

    public static void q1(boolean z10) {
        if (z10) {
            P = false;
            p1(true);
            return;
        }
        I.v(null);
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

    public static void r1() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("selectedAutoNightType", f20982o);
        edit.putBoolean("autoNightScheduleByLocation", f21000p);
        edit.putFloat("autoNightBrighnessThreshold", f21019q);
        edit.putInt("autoNightDayStartTime", f21038r);
        edit.putInt("autoNightDayEndTime", f21056s);
        edit.putInt("autoNightSunriseTime", v);
        edit.putString("autoNightCityName", f21129w);
        edit.putInt("autoNightSunsetTime", f21075t);
        edit.putLong("autoNightLocationLatitude3", Double.doubleToRawLongBits(f21148x));
        edit.putLong("autoNightLocationLongitude3", Double.doubleToRawLongBits(f21165y));
        edit.putInt("autoNightLastSunCheckDay", f21093u);
        g6 g6Var = J;
        if (g6Var != null) {
            edit.putString("nighttheme", g6Var.m());
        } else {
            edit.remove("nighttheme");
        }
        edit.commit();
    }

    public static void s(View view, View view2, d6 d6Var) {
        if (view != null && view2 != null) {
            int[] iArr = Hl;
            view.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            view2.getLocationOnScreen(iArr);
            if (view2 instanceof ld1) {
                Bitmap bitmap = Y;
                if (bitmap != null) {
                    float width = bitmap.getWidth();
                    i10 = (int) ((((view2.getMeasuredWidth() - (Math.max(view2.getMeasuredWidth() / width, view2.getMeasuredHeight() / Y.getHeight()) * width)) / 2.0f) - ((ld1) view2).I) + i10);
                } else {
                    i10 = (int) (i10 + (-((ld1) view2).I));
                }
                i11 = (int) (i11 + (-((ld1) view2).J));
            }
            if (d6Var != null) {
                d6Var.m(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
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

    public static void s1(org.telegram.ui.ActionBar.g6 r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h6.s1(org.telegram.ui.ActionBar.g6, boolean, boolean, boolean):void");
    }

    public static void t(org.telegram.ui.ActionBar.g6 r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h6.t(org.telegram.ui.ActionBar.g6, boolean, boolean):void");
    }

    public static Drawable t0() {
        Drawable drawable = f20817f0;
        if (drawable != null) {
            return drawable;
        }
        return f20800e0;
    }

    public static void t1(boolean z10, boolean z11) {
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
                g6 g6Var = (g6) arrayList2.get(i11);
                g6Var.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("name", g6Var.f20655a);
                    jSONObject.put("path", g6Var.f20657b);
                    jSONObject.put("account", g6Var.E);
                    TLRPC.TL_theme tL_theme = g6Var.F;
                    if (tL_theme != null) {
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        g6Var.F.serializeToStream(serializedData);
                        jSONObject.put("info", Utilities.bytesToHex(serializedData.toByteArray()));
                    }
                    jSONObject.put("loaded", g6Var.G);
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
                g6 g6Var2 = (g6) H.get(str);
                if (g6Var2 == null || (arrayList = g6Var2.f20658b0) == null || arrayList.isEmpty()) {
                    z12 = z11;
                } else {
                    z12 = z11;
                    u1(g6Var2, true, false, false, false, z12);
                }
                i10++;
                z11 = z12;
            }
        }
    }

    public static g6 u(File file, String str, TLRPC.TL_theme tL_theme, boolean z10) {
        File file2;
        String str2;
        try {
            if (!str.toLowerCase().endsWith(".attheme")) {
                str = str.concat(".attheme");
            }
            if (z10) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
                g6 g6Var = new g6();
                g6Var.f20655a = str;
                g6Var.F = tL_theme;
                g6Var.f20657b = file.getAbsolutePath();
                g6Var.E = UserConfig.selectedAccount;
                M = B0();
                O = true;
                P = false;
                t(g6Var, false, false);
                return g6Var;
            }
            if (tL_theme != null) {
                str2 = "remote" + tL_theme.f20169id;
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
            g6 g6Var2 = (g6) hashMap.get(str2);
            if (g6Var2 == null) {
                g6Var2 = new g6();
                g6Var2.f20655a = str;
                g6Var2.E = UserConfig.selectedAccount;
                ArrayList arrayList = F;
                arrayList.add(g6Var2);
                G.add(g6Var2);
                Collections.sort(arrayList, new a4.d(25));
            } else {
                hashMap.remove(str2);
            }
            g6Var2.F = tL_theme;
            g6Var2.f20657b = file2.getAbsolutePath();
            hashMap.put(g6Var2.m(), g6Var2);
            t1(true, false);
            t(g6Var2, true, false);
            return g6Var2;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static qx0 u0(int i10) {
        if (i10 < 0 || i10 > 5) {
            return null;
        }
        qx0[] qx0VarArr = f21097u3;
        qx0 qx0Var = qx0VarArr[i10];
        if (qx0Var != null) {
            return qx0Var;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                qx0VarArr[5] = new hq();
                            }
                        } else {
                            qx0VarArr[4] = new cn0(true);
                        }
                    } else {
                        qx0VarArr[3] = new kh0(null, true);
                    }
                } else {
                    qx0VarArr[2] = new eq0(true);
                }
            } else {
                qx0VarArr[1] = new hq(true);
            }
        } else {
            qx0VarArr[0] = new p61(true);
        }
        qx0 qx0Var2 = qx0VarArr[i10];
        qx0Var2.d();
        qx0Var2.b(x0(null, f21009p9, false));
        return qx0Var2;
    }

    public static void u1(g6 g6Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        if (z10) {
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            if (!z12) {
                int size = g6Var.f20658b0.size();
                int max = Math.max(0, size - g6Var.W);
                SerializedData serializedData = new SerializedData(((max * 16) + 2) * 4);
                serializedData.writeInt32(9);
                serializedData.writeInt32(max);
                for (int i10 = 0; i10 < size; i10++) {
                    f6 f6Var = (f6) g6Var.f20658b0.get(i10);
                    int i11 = f6Var.f20606a;
                    if (i11 >= 100) {
                        serializedData.writeInt32(i11);
                        serializedData.writeInt32(f6Var.f20608c);
                        serializedData.writeInt32(f6Var.d);
                        serializedData.writeInt32(f6Var.f20609e);
                        serializedData.writeInt32(f6Var.f20610f);
                        serializedData.writeInt32(f6Var.f20611g);
                        serializedData.writeInt32(f6Var.h);
                        serializedData.writeBool(f6Var.f20612i);
                        serializedData.writeInt64(f6Var.f20613j);
                        serializedData.writeInt64(f6Var.f20614k);
                        serializedData.writeInt64(f6Var.f20615l);
                        serializedData.writeInt64(f6Var.f20616m);
                        serializedData.writeInt32(f6Var.f20617n);
                        serializedData.writeInt64(0L);
                        serializedData.writeDouble(f6Var.f20619p);
                        serializedData.writeBool(f6Var.f20620q);
                        serializedData.writeString(f6Var.f20618o);
                        if (f6Var.f20621r != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        serializedData.writeBool(z15);
                        if (f6Var.f20621r != null) {
                            serializedData.writeInt32(f6Var.f20623t);
                            f6Var.f20621r.serializeToStream(serializedData);
                        }
                    }
                }
                edit.putString("accents_" + g6Var.d, Base64.encodeToString(serializedData.toByteArray(), 3));
                if (!z14) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
                }
                if (z13) {
                    MessagesController.getInstance(UserConfig.selectedAccount).saveThemeToServer(g6Var, g6Var.k(false));
                }
            }
            edit.putInt("accent_current_" + g6Var.d, g6Var.Y);
            edit.commit();
        } else {
            if (g6Var.Z != -1) {
                if (z11) {
                    f6 f6Var2 = (f6) g6Var.f20656a0.get(g6Var.Y);
                    g6Var.f20656a0.remove(f6Var2.f20606a);
                    g6Var.f20658b0.remove(f6Var2);
                    TLRPC.TL_theme tL_theme = f6Var2.f20621r;
                    if (tL_theme != null) {
                        g6Var.f20660c0.remove(tL_theme.f20169id);
                    }
                }
                g6Var.Y = g6Var.Z;
                f6 k10 = g6Var.k(false);
                if (k10 != null) {
                    g6Var.f20668i0 = k10.f20627y;
                } else {
                    g6Var.f20668i0 = null;
                }
            }
            if (I == g6Var) {
                o1(false, false);
            }
        }
        g6Var.Z = -1;
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

    public static void v1(int i10, int i11, boolean z10) {
        int i12 = f21065s8;
        int i13 = f20730a7;
        int i14 = Qd;
        int i15 = Pd;
        int i16 = Od;
        int i17 = Nd;
        if (i10 == i17 || i10 == i16 || i10 == i15 || i10 == i14 || i10 == f20786d6 || i10 == i13 || i10 == i12 || i10 == M8) {
            i11 |= -16777216;
        }
        if (z10) {
            ul.delete(i10);
        } else {
            ul.put(i10, i11);
        }
        if (i10 == Hc) {
            h(f20800e0);
        } else if (i10 != f20938lc && i10 != f20957mc) {
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
            p1(true);
        } else {
            Drawable drawable = f20800e0;
            if (drawable != null) {
                i(drawable);
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
            return m1(f10, -1);
        }
        if (z11) {
            i11 = -3813931;
        } else {
            i11 = -1972501;
        }
        float[] N02 = N0(3);
        Color.colorToHSV(i10, N02);
        if (N02[1] > 0.02f) {
            return c(i11, i10);
        }
        return i11;
    }

    public static int w0(int i10, d6 d6Var) {
        if (d6Var != null) {
            return d6Var.x0(i10);
        }
        return x0(null, i10, false);
    }

    public static void w1(Drawable drawable, int i10, boolean z10) {
        Drawable drawable2;
        if (!(drawable instanceof fr)) {
            return;
        }
        if (z10) {
            drawable2 = ((fr) drawable).f26468b;
        } else {
            drawable2 = ((fr) drawable).f26467a;
        }
        if (drawable2 instanceof ColorDrawable) {
            ((ColorDrawable) drawable2).setColor(i10);
        } else {
            drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
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
            return m1(f10, -1);
        }
        if (z12) {
            i11 = -6380376;
        } else {
            i11 = -2565928;
        }
        float[] N02 = N0(3);
        Color.colorToHSV(i10, N02);
        if (z11 && N02[1] > 0.02f) {
            return c(i11, i10);
        }
        return i11;
    }

    public static int x0(boolean[] r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h6.x0(boolean[], int, boolean):int");
    }

    public static void x1(int i10, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof qx0) {
            ((qx0) drawable).b(i10);
        } else if (drawable instanceof kd0) {
            ((kd0) drawable).a(i10);
        } else if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i10);
        } else if (drawable instanceof fn0) {
            ((fn0) drawable).b(i10);
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    public static int y(int i10, boolean z10, boolean z11) {
        float f10;
        if (z10 && z11) {
            return m1(0.07f, -1);
        }
        float[] N02 = N0(3);
        Color.colorToHSV(i10, N02);
        if (z10) {
            N02[2] = Math.min(1.0f, N02[2] + 0.07f);
            if (z11) {
                N02[1] = Math.min(1.0f, N02[1] + 0.02f);
            }
        } else {
            float f11 = N02[2];
            if (z11) {
                f10 = 0.06f;
            } else {
                f10 = 0.03f;
            }
            N02[2] = Math.max(0.0f, f11 - f10);
            if (z11) {
                float f12 = N02[1];
                if (f12 > 0.02f) {
                    N02[1] = Math.min(1.0f, f12 + 0.02f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), N02);
    }

    public static m8 y0() {
        if (f20785d5 == null) {
            f20785d5 = new m8();
        }
        return f20785d5;
    }

    public static void y1(int i10, Drawable drawable) {
        x1(x0(null, i10, false), drawable);
    }

    public static int z(int i10, boolean z10, boolean z11) {
        float f10 = 0.14f;
        if (z10 && z11) {
            return m1(0.14f, -1);
        }
        float[] N02 = N0(3);
        Color.colorToHSV(i10, N02);
        if (z10) {
            N02[2] = Math.min(1.0f, N02[2] + 0.14f);
            if (z11) {
                N02[1] = Math.min(1.0f, N02[1] + 0.03f);
            }
        } else {
            float f11 = N02[2];
            if (!z11) {
                f10 = 0.12f;
            }
            N02[2] = Math.max(0.0f, f11 - f10);
            if (z11) {
                float f12 = N02[1];
                if (f12 > 0.02f) {
                    N02[1] = Math.min(1.0f, f12 + 0.04f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), N02);
    }

    public static android.graphics.drawable.Drawable z0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h6.z0():android.graphics.drawable.Drawable");
    }

    public static void z1(Drawable drawable, int i10, boolean z10) {
        Drawable M02;
        if (drawable instanceof StateListDrawable) {
            try {
                if (z10) {
                    M02 = M0(0, drawable);
                } else {
                    M02 = M0(1, drawable);
                }
                if (M02 instanceof ShapeDrawable) {
                    ((ShapeDrawable) M02).getPaint().setColor(i10);
                } else {
                    M02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } catch (Throwable unused) {
            }
        }
    }
}
