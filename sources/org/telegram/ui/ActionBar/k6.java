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
import org.telegram.messenger.f9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.x10;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.z80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tc1;
import org.telegram.ui.xn;
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
    public static l7.w0 Al;
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
    public static Method Bl;
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
    public static float[] Cl;
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
    public static final q5 Dl;
    public static TextPaint E0;
    public static int E1;
    public static TextPaint E2;
    public static nc0 E3;
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
    public static final int[] El;
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
    public static WeakReference Fl;
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
    public static Bitmap Gl;
    public static final HashMap H;
    public static TextPaint[] H0;
    public static ij0 H1;
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
    public static final Paint Hl;
    public static j6 I;
    public static TextPaint I0;
    public static ij0 I1;
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
    public static final Paint Il;
    public static j6 J;
    public static TextPaint J0;
    public static ij0 J1;
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
    public static final Paint Jl;
    public static j6 K;
    public static TextPaint K0;
    public static ij0 K1;
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
    public static final j6 L;
    public static TextPaint L0;
    public static ij0 L1;
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
    public static ij0 M1;
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
    public static ij0 N1;
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
    public static boolean O;
    public static TextPaint O0;
    public static ij0 O1;
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
    public static j9 V;
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
    public static nc0 X0;
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
    public static Matrix f21599a0;
    public static Drawable f21600a1;
    public static Paint a2;
    public static TextPaint f21601a3;
    public static Drawable f21602a4;
    public static final int f21604a6;
    public static final int f21605a7;
    public static final int f21606a8;
    public static final int f21607a9;
    public static final int f21608aa;
    public static final int f21609ab;
    public static final int f21610ac;
    public static final int f21611ad;
    public static final int f21612ae;
    public static final int f21613af;
    public static final int f21614ag;
    public static final int f21615ah;
    public static final int ai;
    public static final int aj;
    public static final int ak;
    public static final int al;
    public static boolean f21616b;
    public static int f21617b0;
    public static Drawable f21618b1;
    public static Paint f21619b2;
    public static TextPaint f21620b3;
    public static Drawable f21621b4;
    public static Drawable f21622b5;
    public static final int f21623b6;
    public static final int f21624b7;
    public static final int f21625b8;
    public static final int f21626b9;
    public static final int f21627ba;
    public static final int f21628bb;
    public static final int f21629bc;
    public static final int f21630bd;
    public static final int f21631be;
    public static final int f21632bf;
    public static final int f21633bg;
    public static final int f21634bh;
    public static final int bi;
    public static final int bj;
    public static final int bk;
    public static final int bl;
    public static int f21636c0;
    public static Drawable f21637c1;
    public static Paint f21638c2;
    public static TextPaint c3;
    public static Drawable f21639c4;
    public static Drawable f21640c5;
    public static final int f21641c6;
    public static final int f21642c7;
    public static final int f21643c8;
    public static final int f21644c9;
    public static final int f21645ca;
    public static final int f21646cb;
    public static final int f21647cc;
    public static final int f21648cd;
    public static final int f21649ce;
    public static final int f21650cf;
    public static final int f21651cg;
    public static final int f21652ch;
    public static final int ci;
    public static final int cj;
    public static final int ck;
    public static final int cl;
    public static f9 d;
    public static int f21653d0;
    public static Drawable f21654d1;
    public static Paint f21655d2;
    public static TextPaint f21656d3;
    public static Drawable f21657d4;
    public static d8 f21658d5;
    public static final int f21659d6;
    public static final int f21660d7;
    public static final int f21661d8;
    public static final int f21662d9;
    public static final int f21663da;
    public static final int f21664db;
    public static final int f21665dc;
    public static final int f21666dd;
    public static final int f21667de;
    public static final int f21668df;
    public static final int f21669dg;
    public static final int f21670dh;
    public static final int di;
    public static final int dj;
    public static final int dk;
    public static final int dl;
    public static SensorManager f21671e;
    public static Drawable f21672e0;
    public static Drawable f21673e1;
    public static Paint f21674e2;
    public static TextPaint f21675e3;
    public static Drawable f21676e4;
    public static HashMap f21677e5;
    public static final int e6;
    public static final int f21678e7;
    public static final int f21679e8;
    public static final int f21680e9;
    public static final int f21681ea;
    public static final int f21682eb;
    public static final int f21683ec;
    public static final int f21684ed;
    public static final int f21685ee;
    public static final int f21686ef;
    public static final int f21687eg;
    public static final int f21688eh;
    public static final int ei;
    public static final int ej;
    public static final int ek;
    public static final int el;
    public static Sensor f21689f;
    public static Drawable f21690f0;
    public static Drawable f21691f1;
    public static Paint f21692f2;
    public static TextPaint f21693f3;
    public static Drawable f21694f4;
    public static final int f21695f5;
    public static final int f21696f6;
    public static final int f21697f7;
    public static final int f21698f8;
    public static final int f21699f9;
    public static final int fa;
    public static final int f21700fb;
    public static final int f21701fc;
    public static final int f21702fd;
    public static final int f21703fe;
    public static final int f21704ff;
    public static final int f21705fg;
    public static final int f21706fh;
    public static final int fi;
    public static final int fj;
    public static final int fk;
    public static final int fl;
    public static boolean f21707g;
    public static int f21708g0;
    public static gm0 f21709g1;
    public static Paint f21710g2;
    public static TextPaint f21711g3;
    public static Drawable f21712g4;
    public static final int f21713g5;
    public static final int f21714g6;
    public static final int f21715g7;
    public static final int f21716g8;
    public static final int f21717g9;
    public static final int f21718ga;
    public static final int f21719gb;
    public static final int f21720gc;
    public static final int f21721gd;
    public static final int f21722ge;
    public static final int f21723gf;
    public static final int f21724gg;
    public static final int f21725gh;
    public static final int gi;
    public static final int gj;
    public static final int gk;
    public static final int gl;
    public static String f21726h0;
    public static gm0 f21727h1;
    public static Paint f21728h2;
    public static Drawable f21729h3;
    public static Drawable f21730h4;
    public static final int f21731h5;
    public static final int f21732h6;
    public static final int f21733h7;
    public static final int f21734h8;
    public static final int h9;
    public static final int f21735ha;
    public static final int f21736hb;
    public static final int f21737hc;
    public static final int f21738hd;
    public static final int f21739he;
    public static final int f21740hf;
    public static final int f21741hg;
    public static final int f21742hh;
    public static final int hi;
    public static final int hj;
    public static final int hk;
    public static final int hl;
    public static long f21743i;
    public static boolean f21744i0;
    public static Drawable f21745i1;
    public static Paint f21746i2;
    public static Drawable f21747i3;
    public static Drawable f21748i4;
    public static final int f21749i5;
    public static final int f21750i6;
    public static final int f21751i7;
    public static final int f21752i8;
    public static final int f21753i9;
    public static final int f21754ia;
    public static final int f21755ib;
    public static final int ic;
    public static final int f21756id;
    public static final int f21757ie;
    public static final int f21758ig;
    public static final int f21759ih;
    public static final int ii;
    public static final int ij;
    public static final int ik;
    public static final int il;
    public static boolean f21760j;
    public static boolean f21761j0;
    public static Drawable f21762j1;
    public static Paint f21763j2;
    public static Drawable f21764j3;
    public static Drawable f21765j4;
    public static final int f21766j5;
    public static final int f21767j6;
    public static final int f21768j7;
    public static final int f21769j8;
    public static final int f21770j9;
    public static final int f21771ja;
    public static final int f21772jb;
    public static final int jc;
    public static final int f21773jd;
    public static final int f21774je;
    public static final int f21775jf;
    public static final int f21776jg;
    public static final int f21777jh;
    public static final int ji;
    public static final int jj;
    public static final int jk;
    public static final HashMap jl;
    public static boolean f21778k;
    public static Paint f21779k0;
    public static Drawable f21780k1;
    public static Paint f21781k2;
    public static j5 f21782k3;
    public static Drawable f21783k4;
    public static final int f21784k5;
    public static final int f21785k6;
    public static final int f21786k7;
    public static final int f21787k8;
    public static final int f21788k9;
    public static final int f21789ka;
    public static final int f21790kb;
    public static final int f21791kc;
    public static final int f21792kd;
    public static final int f21793ke;
    public static final int f21794kf;
    public static final int f21795kg;
    public static final int f21796kh;
    public static final int ki;
    public static final int kj;
    public static final int kk;
    public static final HashMap kl;
    public static Paint f21798l0;
    public static Drawable l1;
    public static Paint f21799l2;
    public static Drawable f21800l3;
    public static Drawable f21801l4;
    public static final int f21802l5;
    public static final int f21803l6;
    public static final int f21804l7;
    public static final int f21805l8;
    public static final int f21806l9;
    public static final int f21807la;
    public static final int f21808lb;
    public static final int f21809lc;
    public static final int f21810ld;
    public static final int f21811le;
    public static final int f21812lf;
    public static final int f21813lg;
    public static final int f21814lh;
    public static final int li;
    public static final int lj;
    public static final int lk;
    public static final HashMap ll;
    public static Paint m0;
    public static Drawable f21816m1;
    public static Paint f21817m2;
    public static h5 f21818m3;
    public static Drawable f21819m4;
    public static final int f21820m5;
    public static final int f21821m6;
    public static final int f21822m7;
    public static final int f21823m8;
    public static final int m9;
    public static final int f21824ma;
    public static final int f21825mb;
    public static final int f21826mc;
    public static final int f21827md;
    public static final int f21828me;
    public static final int f21829mf;
    public static final int f21830mg;
    public static final int f21831mh;
    public static final int mi;
    public static final int mj;
    public static final int mk;
    public static final HashMap ml;
    public static Paint f21833n0;
    public static Drawable f21834n1;
    public static Paint f21835n2;
    public static h5 f21836n3;
    public static Drawable f21837n4;
    public static final int f21838n5;
    public static final int f21839n6;
    public static final int f21840n7;
    public static final int f21841n8;
    public static final int f21842n9;
    public static final int f21843na;
    public static final int f21844nb;
    public static final int nc;
    public static final int f21845nd;
    public static final int f21846ne;
    public static final int f21847nf;
    public static final int f21848ng;
    public static final int f21849nh;
    public static final int ni;
    public static final int nj;
    public static final int nk;
    public static final int[] nl;
    public static int f21850o;
    public static Paint f21851o0;
    public static Drawable f21852o1;
    public static TextPaint f21853o2;
    public static h5 f21854o3;
    public static Drawable f21855o4;
    public static final int f21856o5;
    public static final int f21857o6;
    public static final int f21858o7;
    public static final int f21859o8;
    public static final int f21860o9;
    public static final int oa;
    public static final int f21861ob;
    public static final int f21862oc;
    public static final int f21863od;
    public static final int f21864oe;
    public static final int f21865of;
    public static final int f21866og;
    public static final int f21867oh;
    public static final int oi;
    public static final int oj;
    public static final int ok;
    public static final SparseIntArray ol;
    public static boolean f21868p;
    public static Paint f21869p0;
    public static Drawable f21870p1;
    public static TextPaint f21871p2;
    public static h5 f21872p3;
    public static Drawable f21873p4;
    public static final int f21874p5;
    public static final int f21875p6;
    public static final int f21876p7;
    public static final int[] f21877p8;
    public static final int f21878p9;
    public static final int f21879pa;
    public static final int f21880pb;
    public static final int f21881pc;
    public static final int f21882pd;
    public static final int f21883pe;
    public static final int f21884pf;
    public static final int f21885pg;
    public static final int f21886ph;
    public static final int pi;
    public static final int pj;
    public static final int pk;
    public static final HashSet pl;
    public static float f21887q;
    public static Paint f21888q0;
    public static Drawable f21889q1;
    public static TextPaint f21890q2;
    public static h5 f21891q3;
    public static Drawable f21892q4;
    public static final int f21893q5;
    public static final int f21894q6;
    public static final int f21895q7;
    public static final int[] f21896q8;
    public static final int f21897q9;
    public static final int f21898qa;
    public static final int qb;
    public static final int f21899qc;
    public static final int f21900qd;
    public static final int f21901qe;
    public static final int f21902qf;
    public static final int f21903qg;
    public static final int f21904qh;
    public static final int qi;
    public static final int qj;
    public static final int qk;
    public static SparseIntArray ql;
    public static int f21905r;
    public static Drawable f21907r1;
    public static TextPaint f21908r2;
    public static h5 f21909r3;
    public static Drawable f21910r4;
    public static final int f21911r5;
    public static final int f21912r6;
    public static final int f21913r7;
    public static final int[] f21914r8;
    public static final int f21915r9;
    public static final int f21916ra;
    public static final int f21917rb;
    public static final int f21918rc;
    public static final int rd;
    public static final int f21919re;
    public static final int rf;
    public static final int f21920rg;
    public static final int f21921rh;
    public static final int ri;
    public static final int rj;
    public static final int rk;
    public static SparseIntArray rl;
    public static int f21922s;
    public static Drawable f21923s0;
    public static Drawable f21924s1;
    public static TextPaint f21925s2;
    public static h5 f21926s3;
    public static Drawable f21927s4;
    public static final int f21928s5;
    public static final int s6;
    public static final int f21929s7;
    public static final int f21930s8;
    public static final int s9;
    public static final int f21931sa;
    public static final int sb;
    public static final int f21932sc;
    public static final int f21933sd;
    public static final int f21934se;
    public static final int f21935sf;
    public static final int f21936sg;
    public static final int f21937sh;
    public static final int si;
    public static final int sj;
    public static final int sk;
    public static SparseIntArray sl;
    public static int f21938t;
    public static Paint f21939t0;
    public static Drawable f21940t1;
    public static TextPaint f21941t2;
    public static h5 f21942t3;
    public static Drawable f21943t4;
    public static final int f21944t5;
    public static final int t6;
    public static final int f21945t7;
    public static final int f21946t8;
    public static final int t9;
    public static final int f21947ta;
    public static final int f21948tb;
    public static final int f21949tc;
    public static final int f21950td;
    public static final int te;
    public static final int f21951tf;
    public static final int f21952tg;
    public static final int f21953th;
    public static final int ti;
    public static final int tj;
    public static final int tk;
    public static boolean tl;
    public static int f21954u;
    public static Paint f21955u0;
    public static ij0 f21956u1;
    public static TextPaint f21957u2;
    public static Drawable f21959u4;
    public static final int f21960u5;
    public static final int f21961u6;
    public static final int f21962u7;
    public static final int f21963u8;
    public static final int f21964u9;
    public static final int f21965ua;
    public static final int f21966ub;
    public static final int f21967uc;
    public static final int f21968ud;
    public static final int f21969ue;
    public static final int f21970uf;
    public static final int f21971ug;
    public static final int f21972uh;
    public static final int ui;
    public static final int uj;
    public static final int uk;
    public static final ThreadLocal ul;
    public static int v;
    public static Paint f21973v0;
    public static ij0 f21974v1;
    public static TextPaint f21975v2;
    public static PorterDuffColorFilter f21976v3;
    public static Drawable f21977v4;
    public static final int f21978v5;
    public static final int f21979v6;
    public static final int f21980v7;
    public static final int f21981v8;
    public static final int f21982v9;
    public static final int f21983va;
    public static final int f21984vb;
    public static final int f21985vc;
    public static final int f21986vd;
    public static final int f21987ve;
    public static final int f21988vf;
    public static final int f21989vg;
    public static final int f21990vh;
    public static final int vi;
    public static final int vj;
    public static final int vk;
    public static final ThreadLocal vl;
    public static String f21991w;
    public static Paint f21992w0;
    public static ij0 f21993w1;
    public static TextPaint f21994w2;
    public static PorterDuffColorFilter f21995w3;
    public static Drawable f21996w4;
    public static final int f21997w5;
    public static final int f21998w6;
    public static final int f21999w7;
    public static final int f22000w8;
    public static final int f22001w9;
    public static final int f22002wa;
    public static final int f22003wb;
    public static final int f22004wc;
    public static final int f22005wd;
    public static final int f22006we;
    public static final int f22007wf;
    public static final int f22008wg;
    public static final int f22009wh;
    public static final int wi;
    public static final int wj;
    public static final int wk;
    public static final ThreadLocal wl;
    public static double f22010x;
    public static Paint f22011x0;
    public static ij0 f22012x1;
    public static TextPaint f22013x2;
    public static ee0 f22014x3;
    public static Drawable f22015x4;
    public static final int f22016x5;
    public static final int f22017x6;
    public static final int f22018x7;
    public static final int f22019x8;
    public static final int f22020x9;
    public static final int f22021xa;
    public static final int f22022xb;
    public static final int f22023xc;
    public static final int f22024xd;
    public static final int f22025xe;
    public static final int f22026xf;
    public static final int f22027xg;
    public static final int f22028xh;
    public static final int xi;
    public static final int xj;
    public static final int xk;
    public static final ThreadLocal xl;
    public static double f22029y;
    public static Paint f22030y0;
    public static ij0 f22031y1;
    public static TextPaint[] f22032y2;
    public static Drawable f22033y3;
    public static Drawable f22034y4;
    public static final int f22035y5;
    public static final int f22036y6;
    public static final int f22037y7;
    public static final int f22038y8;
    public static final int f22039y9;
    public static final int f22040ya;
    public static final int f22041yb;
    public static final int f22042yc;
    public static final int f22043yd;
    public static final int f22044ye;
    public static final int f22045yf;
    public static final int f22046yg;
    public static final int yh;
    public static final int yi;
    public static final int yj;
    public static final int yk;
    public static final ThreadLocal yl;
    public static Paint f22048z0;
    public static ij0 f22049z1;
    public static TextPaint f22050z2;
    public static Drawable f22051z3;
    public static Drawable z4;
    public static final int f22052z5;
    public static final int f22053z6;
    public static final int f22054z7;
    public static final int f22055z8;
    public static final int f22056z9;
    public static final int za;
    public static final int zb;
    public static final int f22057zc;
    public static final int zd;
    public static final int f22058ze;
    public static final int f22059zf;
    public static final int f22060zg;
    public static final int zh;
    public static final int zi;
    public static final int zj;
    public static final int zk;
    public static y10 zl;
    public static final int f21598a = i0.a.k(-16777216, 27);
    public static final Object f21635c = new Object();
    public static float h = 1.0f;
    public static final androidx.emoji2.text.n f21797l = new androidx.emoji2.text.n(3);
    public static final androidx.emoji2.text.n f21815m = new androidx.emoji2.text.n(4);
    public static final int f21832n = 99;
    public static final Paint f22047z = new Paint(1);
    public static final boolean[] C = new boolean[4];
    public static final int[] D = new int[4];
    public static final long[] E = new long[4];
    public static final Drawable[] f21906r0 = new Drawable[25];
    public static final nw0[] f21958u3 = new nw0[6];
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
    public static final Path[] f21603a5 = new Path[3];

    static {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.<clinit>():void");
    }

    public static void A() {
        if (f21850o != 2) {
            if (f21778k) {
                f21778k = false;
                AndroidUtilities.cancelRunOnUIThread(f21815m);
            }
            if (f21760j) {
                f21760j = false;
                AndroidUtilities.cancelRunOnUIThread(f21797l);
            }
            if (f21707g) {
                h = 1.0f;
                f21671e.unregisterListener(Dl, f21689f);
                f21707g = false;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("light sensor unregistered");
                }
            }
        }
    }

    public static j6 A0() {
        j6 j6Var = K;
        if (j6Var != null) {
            return j6Var;
        }
        return L;
    }

    public static void A1(org.telegram.ui.Cells.z zVar, int i10, int i11) {
        if (e2.c.s(zVar)) {
            int numberOfLayers = zVar.getNumberOfLayers();
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                Drawable drawable = zVar.getDrawable(i12);
                if (drawable instanceof h6) {
                    h6 h6Var = (h6) drawable;
                    float f10 = i10;
                    float f11 = i11;
                    float[] fArr = h6Var.f21443b;
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
                    h6Var.f21444c = true;
                    h6Var.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static int B(j6 j6Var, int i10, int i11) {
        int i12;
        if (i10 != 0 && (i12 = j6Var.U) != 0 && i10 != i12 && (!j6Var.P || j6Var.V != f21832n)) {
            float[] M02 = M0(3);
            float[] M03 = M0(4);
            Color.colorToHSV(j6Var.U, M02);
            Color.colorToHSV(i10, M03);
            return D(M02, M03, i11, j6Var.q(), i11);
        }
        return i11;
    }

    public static int B0(int i10) {
        int indexOfKey = ql.indexOfKey(i10);
        if (indexOfKey < 0) {
            return 0;
        }
        int valueAt = ql.valueAt(indexOfKey);
        i6 k10 = I.k(false);
        if (k10 == null) {
            return 0;
        }
        float[] M02 = M0(1);
        float[] M03 = M0(2);
        Color.colorToHSV(I.U, M02);
        Color.colorToHSV(k10.f21469c, M03);
        return D(M02, M03, valueAt, I.q(), valueAt);
    }

    public static boolean B1(Drawable drawable, int i10, boolean z10) {
        Drawable L02;
        boolean z11;
        boolean z12 = true;
        if (drawable instanceof StateListDrawable) {
            try {
                if (z10) {
                    Drawable L03 = L0(0, drawable);
                    if (L03 instanceof ShapeDrawable) {
                        if (((ShapeDrawable) L03).getPaint().getColor() == i10) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        try {
                            ((ShapeDrawable) L03).getPaint().setColor(i10);
                        } catch (Throwable unused) {
                            return z11;
                        }
                    } else {
                        L03.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        z11 = false;
                    }
                    L02 = L0(1, drawable);
                } else {
                    L02 = L0(2, drawable);
                    z11 = false;
                }
                if (L02 instanceof ShapeDrawable) {
                    if (((ShapeDrawable) L02).getPaint().getColor() == i10 && !z11) {
                        z12 = false;
                    }
                    try {
                        ((ShapeDrawable) L02).getPaint().setColor(i10);
                        return z12;
                    } catch (Throwable unused2) {
                        return z12;
                    }
                }
                L02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
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

    public static int C(boolean z10, int i10, int i11, int i12, int i13) {
        float[] M02 = M0(3);
        float[] M03 = M0(4);
        Color.colorToHSV(i10, M02);
        Color.colorToHSV(i11, M03);
        return D(M02, M03, i12, z10, i13);
    }

    public static int C0(int i10) {
        int i11 = nl[i10];
        if (i11 == 0) {
            int i12 = ol.get(i10, -1);
            if (i12 != -1) {
                return C0(i12);
            }
            if ((i10 < za || i10 >= Ga) && i10 != D9 && i10 != N9 && i10 != E9 && i10 != Pd && i10 != Qd) {
                return -65536;
            }
            return 0;
        }
        return i11;
    }

    public static void C1(j6 j6Var, i6 i6Var, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
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
                    String q02 = q0(themeSettings);
                    if (q02 != null && (j6Var = (j6) hashMap.get(q02)) != null) {
                        i6Var = (i6) j6Var.Z.get(tL_theme.f20980id);
                    } else {
                        return;
                    }
                }
                if (i6Var != null) {
                    TLRPC.TL_theme tL_theme2 = i6Var.f21482r;
                    if (tL_theme2 != null) {
                        j6Var.Z.remove(tL_theme2.f20980id);
                    }
                    i6Var.f21482r = tL_theme;
                    i6Var.f21484t = i10;
                    j6Var.Z.put(tL_theme.f20980id, i6Var);
                    if (!j6.a(i6Var, themeSettings)) {
                        File d10 = i6Var.d();
                        if (d10 != null) {
                            d10.delete();
                        }
                        j6.i(i6Var, themeSettings);
                        j6 j6Var2 = I;
                        if (j6Var2 == j6Var && j6Var2.V == i6Var.f21467a) {
                            n1(false, false);
                            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                            int i11 = NotificationCenter.needSetDayNightTheme;
                            j6 j6Var3 = I;
                            if (J == j6Var3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            globalInstance.lambda$postNotificationNameOnUIThread$1(i11, j6Var3, Boolean.valueOf(z12), null, -1);
                        }
                        f6.a(true);
                    }
                    TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                    if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.motion) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i6Var.f21481q = z11;
                    j6Var.Q = false;
                } else {
                    return;
                }
            } else {
                if (j6Var != null) {
                    str = j6Var.m();
                    hashMap.remove(str);
                } else {
                    str = "remote" + tL_theme.f20980id;
                    j6Var = (j6) hashMap.get(str);
                }
                if (j6Var == null) {
                    return;
                }
                j6Var.C = tL_theme;
                j6Var.f21503a = tL_theme.title;
                File file = new File(j6Var.f21505b);
                File file2 = new File(ApplicationLoader.getFilesDirFixed(), w.c.e(str, ".attheme"));
                if (!file.equals(file2)) {
                    try {
                        AndroidUtilities.copyFile(file, file2);
                        j6Var.f21505b = file2.getAbsolutePath();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (z10) {
                    j6Var.D = false;
                    j6Var.f21509d0 = null;
                    j6Var.f21511e0 = null;
                    NotificationCenter.getInstance(j6Var.B).addObserver(j6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(j6Var.B).addObserver(j6Var, NotificationCenter.fileLoadFailed);
                    FileLoader fileLoader = FileLoader.getInstance(j6Var.B);
                    TLRPC.TL_theme tL_theme3 = j6Var.C;
                    fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                } else {
                    j6Var.Q = false;
                }
                hashMap.put(j6Var.m(), j6Var);
            }
            s1(true, false);
        }
    }

    public static int D(float[] fArr, float[] fArr2, int i10, boolean z10, int i11) {
        int min;
        int min2;
        if (Cl == null) {
            Cl = new float[3];
        }
        float[] fArr3 = Cl;
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
        float d10 = android.support.v4.media.a.d(0.39999998f, computePerceivedBrightness, computePerceivedBrightness2, 0.6f);
        int red = (int) (Color.red(HSVToColor) * d10);
        int green = (int) (Color.green(HSVToColor) * d10);
        int blue = (int) (Color.blue(HSVToColor) * d10);
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

    public static y10 D0() {
        if (zl == null) {
            ?? obj = new Object();
            obj.f33261a = new x10[4];
            obj.f33269k = 1.0f;
            obj.f33270l = new ArrayList();
            obj.f33271m = new Paint(1);
            obj.f33272n = new Path();
            for (int i10 = 0; i10 < 4; i10++) {
                obj.f33261a[i10] = new x10(i10);
            }
            zl = obj;
        }
        return zl;
    }

    public static void D1(j6 j6Var) {
        Collections.sort(j6Var.Y, new oh.k0(7));
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
                if (f21778k) {
                    f21778k = false;
                    AndroidUtilities.cancelRunOnUIThread(f21815m);
                }
                if (f21760j) {
                    f21760j = false;
                    AndroidUtilities.cancelRunOnUIThread(f21797l);
                }
            }
            A();
            int m12 = m1();
            if (m12 != 0) {
                if (m12 == 2) {
                    z11 = true;
                }
                l(z11);
            }
            if (z10) {
                f21743i = 0L;
            }
        }
    }

    public static int E0(int i10) {
        return w0(null, i10, true);
    }

    public static int E1(SparseIntArray sparseIntArray) {
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
                int i19 = sparseIntArray.get(i18, nl[i18]);
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
                    if (j6Var != null && UserConfig.getInstance(j6Var.B).isClientActivated()) {
                        i6 k10 = j6Var.k(false);
                        TLRPC.TL_theme tL_theme = j6Var.C;
                        if (tL_theme != null) {
                            i10 = j6Var.B;
                        } else if (k10 != null && (tL_theme = k10.f21482r) != null) {
                            i10 = UserConfig.selectedAccount;
                        }
                        if (tL_theme.document != null) {
                            A++;
                            TL_account.getTheme gettheme = new TL_account.getTheme();
                            gettheme.document_id = tL_theme.document.f20849id;
                            gettheme.format = "android";
                            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                            tL_inputTheme.access_hash = tL_theme.access_hash;
                            tL_inputTheme.f20914id = tL_theme.f20980id;
                            gettheme.theme = tL_inputTheme;
                            ConnectionsManager.getInstance(i10).sendRequest(gettheme, new hg.y(k10, j6Var, tL_theme, 12));
                        }
                    }
                }
            }
        }
    }

    public static int F0(SparseIntArray sparseIntArray, int i10) {
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return nl[i10];
    }

    public static void F1(p2 p2Var) {
        String string;
        if (f21850o != 0) {
            if (p2Var != null) {
                try {
                    qc a02 = qc.a0(p2Var);
                    int i10 = R.raw.auto_night_off;
                    if (f21850o == 3) {
                        string = LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff);
                    } else {
                        string = LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff);
                    }
                    a02.I(i10, string, LocaleController.getString("Settings", R.string.Settings), 5000, false, new p(p2Var, 17)).j();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            f21850o = 0;
            q1();
            A();
        }
    }

    public static void G(SparseIntArray sparseIntArray, j6 j6Var) {
        if (j6Var != null && j6Var.f21514g0 == -1) {
            int i10 = f21659d6;
            if (i0.a.f(i0.a.d(0.5f, F0(sparseIntArray, i10), F0(sparseIntArray, i10))) < 0.5d) {
                j6Var.f21514g0 = 1;
            } else {
                j6Var.f21514g0 = 0;
            }
        }
    }

    public static org.telegram.ui.Cells.z G0(int i10, int i11) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i11 & 16777215) | 419430400}), null, b0(i10, -1));
    }

    public static void G1(MessageObject messageObject) {
        d8 d8Var = f21658d5;
        if (d8Var == null) {
            return;
        }
        if (d8Var.f26214i != null && messageObject != null) {
            if (f21677e5 == null) {
                f21677e5 = new HashMap();
            }
            f21677e5.put(messageObject, f21658d5);
            f21658d5.e(false, true, null);
            AndroidUtilities.runOnUIThread(new p(messageObject, 18), 200L);
            f21658d5 = null;
            return;
        }
        d8Var.f26214i = null;
    }

    public static c5.j H(j6 j6Var, SparseIntArray sparseIntArray, String str, int i10, boolean z10) {
        boolean z11;
        File file;
        boolean z12;
        float f10;
        float f11;
        if (j6Var.P && j6Var.V == f21832n) {
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
        if (k10 != null && k10.f21481q) {
            z12 = true;
        } else {
            z12 = false;
        }
        d6 d6Var = j6Var.f21513f0;
        if (d6Var != null) {
            f11 = d6Var.f21290k;
        } else if (k10 != null) {
            f11 = k10.f21480p;
        } else {
            f10 = j6Var.f21520y;
            return I(j6Var, d6Var, sparseIntArray, file, str, ql.get(f21713g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
        }
        f10 = f11 * 100.0f;
        return I(j6Var, d6Var, sparseIntArray, file, str, ql.get(f21713g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
    }

    public static String H0() {
        d6 d6Var = I.f21513f0;
        if (d6Var != null) {
            return d6Var.f21284c;
        }
        if (d1()) {
            return "t";
        }
        return "d";
    }

    public static c5.j I(org.telegram.ui.ActionBar.j6 r24, org.telegram.ui.ActionBar.d6 r25, android.util.SparseIntArray r26, java.io.File r27, java.lang.String r28, int r29, int r30, int r31, boolean r32, boolean r33, boolean r34, boolean r35, org.telegram.tgnet.TLRPC.Document r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.I(org.telegram.ui.ActionBar.j6, org.telegram.ui.ActionBar.d6, android.util.SparseIntArray, java.io.File, java.lang.String, int, int, int, boolean, boolean, boolean, boolean, org.telegram.tgnet.TLRPC$Document, boolean):c5.j");
    }

    public static org.telegram.ui.Cells.z I0(int i10, int i11, g6 g6Var) {
        if (i11 >= 0) {
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), new ColorDrawable(v0(i11, g6Var)), new ColorDrawable(-1));
        }
        return f0(i10, 2, -1);
    }

    public static void J(Context context, boolean z10) {
        float f10;
        float f11;
        float f12;
        TextPaint textPaint;
        Drawable[] drawableArr;
        N();
        if (!z10 && f21818m3 == null) {
            Resources resources = context.getResources();
            f21729h3 = resources.getDrawable(R.drawable.video_muted);
            f21800l3 = resources.getDrawable(R.drawable.media_live_on).mutate();
            f21818m3 = new h5(0, false, false, null);
            f21836n3 = new h5(0, false, true, null);
            f21854o3 = new h5(0, true, false, null);
            f21872p3 = new h5(0, true, true, null);
            f21891q3 = new h5(1, false, false, null);
            f21909r3 = new h5(1, false, true, null);
            f21926s3 = new h5(1, true, false, null);
            f21942t3 = new h5(1, true, true, null);
            ?? obj = new Object();
            obj.f26521a = new Path();
            obj.f26522b = -1.0f;
            obj.f26526g = new ArrayList();
            obj.f26523c = 0.293f;
            obj.d = -26.0f;
            obj.f26524e = -28.0f;
            obj.f26525f = 1.0f;
            f22014x3 = obj;
            obj.a("M 34.141 16.042 C 37.384 17.921 40.886 20.001 44.211 21.965 C 46.139 23.104 49.285 24.729 49.586 25.917 C 50.289 28.687 48.484 30 46.274 30 L 6 30.021 C 3.79 30.021 2.075 30.023 2 26.021 L 2.009 3.417 C 2.009 0.417 5.326 -0.58 7.068 0.417 C 10.545 2.406 25.024 10.761 34.141 16.042 Z", 166.0f);
            f22014x3.a("M 37.843 17.769 C 41.143 19.508 44.131 21.164 47.429 23.117 C 48.542 23.775 49.623 24.561 49.761 25.993 C 50.074 28.708 48.557 30 46.347 30 L 6 30.012 C 3.79 30.012 2 28.222 2 26.012 L 2.009 4.609 C 2.009 1.626 5.276 0.664 7.074 1.541 C 10.608 3.309 28.488 12.842 37.843 17.769 Z", 200.0f);
            f22014x3.a("M 40.644 18.756 C 43.986 20.389 49.867 23.108 49.884 25.534 C 49.897 27.154 49.88 24.441 49.894 26.059 C 49.911 28.733 48.6 30 46.39 30 L 6 30.013 C 3.79 30.013 2 28.223 2 26.013 L 2.008 5.52 C 2.008 2.55 5.237 1.614 7.079 2.401 C 10.656 4 31.106 14.097 40.644 18.756 Z", 217.0f);
            f22014x3.a("M 43.782 19.218 C 47.117 20.675 50.075 21.538 50.041 24.796 C 50.022 26.606 50.038 24.309 50.039 26.104 C 50.038 28.736 48.663 30 46.453 30 L 6 29.986 C 3.79 29.986 2 28.196 2 25.986 L 2.008 6.491 C 2.008 3.535 5.196 2.627 7.085 3.316 C 10.708 4.731 33.992 14.944 43.782 19.218 Z", 234.0f);
            f22014x3.a("M 47.421 16.941 C 50.544 18.191 50.783 19.91 50.769 22.706 C 50.761 24.484 50.76 23.953 50.79 26.073 C 50.814 27.835 49.334 30 47.124 30 L 5 30.01 C 2.79 30.01 1 28.22 1 26.01 L 1.001 10.823 C 1.001 8.218 3.532 6.895 5.572 7.26 C 7.493 8.01 47.421 16.941 47.421 16.941 Z", 267.0f);
            f22014x3.a("M 47.641 17.125 C 50.641 18.207 51.09 19.935 51.078 22.653 C 51.07 24.191 51.062 21.23 51.088 23.063 C 51.109 24.886 49.587 27 47.377 27 L 5 27.009 C 2.79 27.009 1 25.219 1 23.009 L 0.983 11.459 C 0.983 8.908 3.414 7.522 5.476 7.838 C 7.138 8.486 47.641 17.125 47.641 17.125 Z", 300.0f);
            f22014x3.a("M 48 7 C 50.21 7 52 8.79 52 11 C 52 19 52 19 52 19 C 52 21.21 50.21 23 48 23 L 4 23 C 1.79 23 0 21.21 0 19 L 0 11 C 0 8.79 1.79 7 4 7 C 48 7 48 7 48 7 Z", 383.0f);
            f22033y3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            f22051z3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            A3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            B3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            F3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            H3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            C3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            D3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            G3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            I3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            E3 = new nc0();
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
            f21602a4 = resources.getDrawable(R.drawable.msg_views).mutate();
            f21621b4 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            J3 = resources.getDrawable(R.drawable.msg_views).mutate();
            K3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            f21639c4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f21657d4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f21676e4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f21694f4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f21712g4 = resources.getDrawable(R.drawable.video_actions);
            f21730h4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            f21748i4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            f21765j4 = resources.getDrawable(R.drawable.msg_warning);
            f21783k4 = resources.getDrawable(R.drawable.list_mute).mutate();
            f21801l4 = resources.getDrawable(R.drawable.ic_lock_header);
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
            f21819m4 = resources.getDrawable(R.drawable.bot_file);
            f21837n4 = resources.getDrawable(R.drawable.bot_music);
            f21855o4 = resources.getDrawable(R.drawable.bot_location);
            f21977v4 = resources.getDrawable(R.drawable.bot_link);
            f22015x4 = resources.getDrawable(R.drawable.bot_lines);
            f21996w4 = resources.getDrawable(R.drawable.bot_card);
            f22034y4 = resources.getDrawable(R.drawable.bot_webview);
            z4 = resources.getDrawable(R.drawable.bot_invite);
            A4 = resources.getDrawable(R.drawable.permission_locked);
            B4 = resources.getDrawable(R.drawable.msg_msgbubble);
            C4 = resources.getDrawable(R.drawable.msg_msgbubble2);
            D4 = resources.getDrawable(R.drawable.msg_arrowright);
            E4 = resources.getDrawable(R.drawable.gradient_left);
            F4 = resources.getDrawable(R.drawable.gradient_right);
            f21873p4 = resources.getDrawable(R.drawable.header_shadow).mutate();
            R4 = resources.getDrawable(R.drawable.nophotos3);
            f21892q4 = resources.getDrawable(R.drawable.filled_button_share).mutate();
            f21910r4 = resources.getDrawable(R.drawable.filled_button_reply);
            f21927s4 = resources.getDrawable(R.drawable.msg_voiceclose).mutate();
            f21943t4 = resources.getDrawable(R.drawable.media_more).mutate();
            f21959u4 = resources.getDrawable(R.drawable.filled_open_message);
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
            f12 = 14.0f;
            f11 = 3.0f;
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
            f21622b5 = resources.getDrawable(R.drawable.filled_fire).mutate();
            f21640c5 = resources.getDrawable(R.drawable.msg_round_gif_m).mutate();
            Drawable[][] drawableArr6 = U4;
            drawableArr6[0][0] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_play_m);
            drawableArr6[0][1] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_play_m);
            drawableArr6[1][0] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_pause_m);
            drawableArr6[1][1] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_pause_m);
            drawableArr6[2][0] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_load_m);
            drawableArr6[2][1] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_load_m);
            drawableArr6[3][0] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_file_s);
            drawableArr6[3][1] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_file_s);
            drawableArr6[4][0] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_cancel_m);
            drawableArr6[4][1] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_round_cancel_m);
            pq L10 = L(AndroidUtilities.dp(44.0f), R.drawable.msg_contact);
            Drawable[] drawableArr7 = T4;
            drawableArr7[0] = L10;
            drawableArr7[1] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_contact);
            Drawable mutate5 = resources.getDrawable(R.drawable.msg_location).mutate();
            Drawable[] drawableArr8 = S4;
            drawableArr8[0] = mutate5;
            drawableArr8[1] = resources.getDrawable(R.drawable.msg_location).mutate();
            f21747i3 = context.getResources().getDrawable(R.drawable.compose_panel_shadow).mutate();
            f21764j3 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            j5 j5Var = new j5(0);
            Paint paint = new Paint(1);
            j5Var.f21502b = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
            f21782k3 = j5Var;
            jl.clear();
            kl.clear();
            Drawable drawable = f22015x4;
            int i12 = f21791kc;
            d(i12, "drawableBotInline", drawable);
            d(i12, "drawableBotWebView", f22034y4);
            d(i12, "drawableBotLock", A4);
            d(i12, "drawableBotLink", f21977v4);
            d(i12, "drawable_botInvite", z4);
            d(i12, "drawableGoIcon", f21959u4);
            d(i12, "drawableCommentSticker", C4);
            d(Gc, "drawableMsgError", f21765j4);
            d(-1, "drawableMsgIn", f21818m3);
            d(-1, "drawableMsgInSelected", f21836n3);
            d(-1, "drawableMsgInMedia", f21891q3);
            d(-1, "drawableMsgInMediaSelected", f21909r3);
            d(Dc, "drawableMsgInInstant", f21730h4);
            d(-1, "drawableMsgOut", f21854o3);
            d(-1, "drawableMsgOutSelected", f21872p3);
            d(-1, "drawableMsgOutMedia", f21926s3);
            d(-1, "drawableMsgOutMediaSelected", f21942t3);
            Drawable drawable2 = drawableArr4[0];
            int i13 = Va;
            d(i13, "drawableMsgOutCallAudio", drawable2);
            Drawable drawable3 = drawableArr5[0];
            int i14 = Wa;
            d(i14, "drawableMsgOutCallAudioSelected", drawable3);
            d(i13, "drawableMsgOutCallVideo", drawableArr4[1]);
            d(i14, "drawableMsgOutCallVideo", drawableArr5[1]);
            d(Ja, "drawableMsgOutCheck", f22033y3);
            d(Ka, "drawableMsgOutCheckSelected", f22051z3);
            Drawable drawable4 = A3;
            int i15 = La;
            d(i15, "drawableMsgOutCheckRead", drawable4);
            Drawable drawable5 = B3;
            int i16 = Ma;
            d(i16, "drawableMsgOutCheckReadSelected", drawable5);
            d(i15, "drawableMsgOutHalfCheck", C3);
            d(i16, "drawableMsgOutHalfCheckSelected", D3);
            d(i13, "drawableMsgOutInstant", f21748i4);
            d(Ta, "drawableMsgOutMenu", f21676e4);
            d(Ua, "drawableMsgOutMenuSelected", f21694f4);
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
            int i19 = ic;
            d(i19, "drawableMsgStickerCheck", drawable8);
            d(i19, "drawableMsgStickerHalfCheck", I3);
            d(i19, "drawableMsgStickerPinned", Y3);
            d(i19, "drawableMsgStickerReplies", K3);
            d(i19, "drawableMsgStickerViews", J3);
            d(i12, "drawableReplyIcon", f21910r4);
            d(i12, "drawableCloseIcon", f21927s4);
            d(i12, "drawableMoreIcon", f21943t4);
            d(i12, "drawableShareIcon", f21892q4);
            d(f21862oc, "drawableMuteIcon", f21783k4);
            d(f21881pc, "drawableLockIcon", f21801l4);
            d(Xa, "drawable_chat_pollHintDrawableOut", drawableArr[1]);
            d(Kc, "drawable_chat_pollHintDrawableIn", drawableArr[0]);
            j(z10, false);
        } else {
            f10 = 1.0f;
            f11 = 3.0f;
            f12 = 14.0f;
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
            float f13 = ((SharedConfig.fontSize * 2) + 10) / f11;
            W2.setTextSize(AndroidUtilities.dp(f13));
            Y2.setTextSize(AndroidUtilities.dp(f13));
            Z2.setTextSize(AndroidUtilities.dp(f13));
            float f14 = f13 - f10;
            f21656d3.setTextSize(AndroidUtilities.dp(f14));
            X2.setTextSize(AndroidUtilities.dp(f13));
            U2.setTextSize(AndroidUtilities.dp(f14));
            V2.setTextSize(AndroidUtilities.dp(12.0f));
            T2.setTextSize(AndroidUtilities.dp(12.0f));
            K2.setTextSize(AndroidUtilities.dp(13.0f));
            L2.setTextSize(AndroidUtilities.dp(13.0f));
            M2.setTextSize(AndroidUtilities.dp(13.0f));
            X1.setStrokeWidth(AndroidUtilities.dp(f10));
            Z1.setStrokeWidth(AndroidUtilities.dp(1.1f));
            f21925s2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            f21941t2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            f21957u2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 3));
            f21975v2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize)));
            f21693f3.setTextSize(AndroidUtilities.dp(15.0f));
            f21711g3.setTextSize(AndroidUtilities.dp(13.0f));
            f21781k2.setStrokeWidth(AndroidUtilities.dp(f11));
            f21799l2.setStrokeWidth(AndroidUtilities.dp(2.33f));
            f21675e3.setTextSize(AndroidUtilities.dp(f12));
            f21675e3.setTypeface(AndroidUtilities.bold());
        }
    }

    public static org.telegram.ui.Cells.z J0(g6 g6Var, boolean z10) {
        int v02 = v0(f21750i6, g6Var);
        if (z10) {
            return I0(v02, f21659d6, g6Var);
        }
        return f0(v02, 2, -1);
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

    public static org.telegram.ui.Cells.z K0(boolean z10) {
        int w02 = w0(null, f21750i6, false);
        if (z10) {
            return I0(w02, f21659d6, null);
        }
        return f0(w02, 2, -1);
    }

    public static pq L(int i10, int i11) {
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
        pq pqVar = new pq(shapeDrawable, drawable);
        pqVar.h = i10;
        pqVar.f30170n = i10;
        return pqVar;
    }

    public static Drawable L0(int i10, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29 && (drawable instanceof StateListDrawable)) {
            return ((StateListDrawable) drawable).getStateDrawable(i10);
        }
        if (Bl == null) {
            try {
                Bl = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
            } catch (Throwable unused) {
            }
        }
        Method method = Bl;
        if (method != null) {
            try {
                return (Drawable) method.invoke(drawable, Integer.valueOf(i10));
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }

    public static org.telegram.ui.Cells.z M(int i10, int i11, int i12) {
        f22047z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new p5(i11, i12));
    }

    public static float[] M0(int i10) {
        ThreadLocal threadLocal;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        threadLocal = yl;
                    } else {
                        threadLocal = xl;
                    }
                } else {
                    threadLocal = wl;
                }
            } else {
                threadLocal = vl;
            }
        } else {
            threadLocal = ul;
        }
        float[] fArr = (float[]) threadLocal.get();
        if (fArr == null) {
            float[] fArr2 = new float[3];
            threadLocal.set(fArr2);
            return fArr2;
        }
        return fArr;
    }

    public static void N() {
        O();
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
            paint3.setPathEffect(z80.c());
            Paint paint4 = new Paint();
            V1 = paint4;
            paint4.setPathEffect(z80.c());
            Paint paint5 = new Paint();
            W1 = paint5;
            paint5.setPathEffect(z80.c());
            Paint paint6 = new Paint(1);
            f21781k2 = paint6;
            paint6.setStrokeCap(cap);
            f21781k2.setStyle(style);
            f21781k2.setColor(-1610612737);
            Paint paint7 = new Paint(1);
            f21799l2 = paint7;
            paint7.setStrokeCap(cap);
            f21799l2.setStyle(style);
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
            f21656d3 = textPaint12;
            textPaint12.setTypeface(AndroidUtilities.bold());
            c3 = new TextPaint(1);
            f21675e3 = new TextPaint(1);
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
            f21619b2 = new Paint(1);
            f21638c2 = new Paint(1);
            Paint paint10 = new Paint(1);
            f21655d2 = paint10;
            paint10.setStyle(style);
            f21655d2.setStrokeCap(cap);
            f21925s2 = new TextPaint(1);
            f21941t2 = new TextPaint(1);
            f21957u2 = new TextPaint(1);
            f21925s2.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint14 = new TextPaint(1);
            f21975v2 = textPaint14;
            textPaint14.setTypeface(AndroidUtilities.bold());
            Paint paint11 = new Paint(1);
            f21728h2 = paint11;
            paint11.setColor(352321536);
            f21746i2 = new Paint(1);
            TextPaint textPaint15 = new TextPaint(1);
            f21693f3 = textPaint15;
            textPaint15.setTypeface(AndroidUtilities.bold());
            f21711g3 = new TextPaint(1);
            f21763j2 = new Paint();
            new Paint(1);
            f21817m2 = new Paint(1);
            f21835n2 = new Paint(1);
            f21674e2 = new Paint(1);
            f21692f2 = new Paint(7);
            f21710g2 = new Paint(7);
            e(Hc, f21674e2, "paintChatMessageBackgroundSelected");
            Paint paint12 = f21692f2;
            int i10 = f21809lc;
            e(i10, paint12, "paintChatActionBackground");
            e(i10, f21728h2, "paintChatActionBackgroundDarken");
            e(f21826mc, f21710g2, "paintChatActionBackgroundSelected");
            TextPaint textPaint16 = f21925s2;
            int i11 = ic;
            e(i11, textPaint16, "paintChatActionText");
            e(i11, f21941t2, "paintChatActionText2");
            e(i11, f21957u2, "paintChatActionText3");
            e(Nc, Q2, "paintChatBotButton");
            e(Sd, f21763j2, "paintChatComposeBackground");
            e(f22004wc, f21746i2, "paintChatTimeBackground");
        }
    }

    public static j6 N0(String str) {
        return (j6) H.get(str);
    }

    public static void O() {
        synchronized (f21635c) {
            try {
                if (f21853o2 == null) {
                    f21853o2 = new TextPaint(1);
                    f22013x2 = new TextPaint(1);
                    f22032y2 = new TextPaint[6];
                    f22050z2 = new TextPaint(1);
                    A2 = new TextPaint(1);
                    B2 = new TextPaint(1);
                    TextPaint textPaint = new TextPaint(1);
                    f21994w2 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint2 = new TextPaint(1);
                    W2 = textPaint2;
                    textPaint2.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint3 = new TextPaint(1);
                    Y2 = textPaint3;
                    textPaint3.setTypeface(AndroidUtilities.bold());
                    Z2 = new TextPaint(1);
                    f21601a3 = new TextPaint(1);
                    f21620b3 = new TextPaint(1);
                    c3 = new TextPaint(1);
                    TextPaint textPaint4 = new TextPaint(1);
                    f21656d3 = textPaint4;
                    textPaint4.setTypeface(AndroidUtilities.bold());
                    X2 = new TextPaint(1);
                    U2 = new TextPaint(1);
                    T2 = new TextPaint(1);
                    TextPaint textPaint5 = new TextPaint(1);
                    f21871p2 = textPaint5;
                    Typeface typeface = Typeface.MONOSPACE;
                    textPaint5.setTypeface(typeface);
                    TextPaint textPaint6 = new TextPaint(1);
                    f21890q2 = textPaint6;
                    textPaint6.setTypeface(typeface);
                    TextPaint textPaint7 = new TextPaint(1);
                    f21908r2 = textPaint7;
                    textPaint7.setTypeface(typeface);
                    new TextPaint(1);
                    V2 = new TextPaint(1);
                }
                float[] fArr = {0.68f, 0.46f, 0.34f, 0.28f, 0.22f, 0.19f};
                int i10 = 0;
                while (true) {
                    TextPaint[] textPaintArr = f22032y2;
                    if (i10 < textPaintArr.length) {
                        textPaintArr[i10] = new TextPaint(1);
                        f22032y2[i10].setTextSize(AndroidUtilities.dp(fArr[i10] * 120.0f));
                        i10++;
                    } else {
                        f22050z2.setTextSize(AndroidUtilities.dp(46.0f));
                        A2.setTextSize(AndroidUtilities.dp(38.0f));
                        B2.setTextSize(AndroidUtilities.dp(30.0f));
                        f21853o2.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
                        f22013x2.setTextSize(AndroidUtilities.dp(14.0f));
                        f21994w2.setTextSize(AndroidUtilities.dp(15.0f));
                        float f10 = ((SharedConfig.fontSize * 2) + 10) / 3.0f;
                        W2.setTextSize(AndroidUtilities.dp(f10));
                        Y2.setTextSize(AndroidUtilities.dp(f10));
                        Z2.setTextSize(AndroidUtilities.dp(f10));
                        float f11 = f10 - 1.0f;
                        f21601a3.setTextSize(AndroidUtilities.dp(f11));
                        f21620b3.setTextSize(AndroidUtilities.dp(f10));
                        V2.setTextSize(AndroidUtilities.dp(12.0f));
                        f21656d3.setTextSize(AndroidUtilities.dp(f11));
                        c3.setTextSize(AndroidUtilities.dp(f10 - 2.0f));
                        X2.setTextSize(AndroidUtilities.dp(f10));
                        U2.setTextSize(AndroidUtilities.dp(f11));
                        f21871p2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 1), SharedConfig.fontSize - 2)));
                        f21890q2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 3)));
                        f21908r2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 5)));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Drawable O0(String str) {
        return (Drawable) jl.get(str);
    }

    public static void P(Context context) {
        if (f21779k0 == null) {
            Paint paint = new Paint();
            f21779k0 = paint;
            paint.setStrokeWidth(1.0f);
            Paint paint2 = new Paint();
            f21798l0 = paint2;
            paint2.setStrokeWidth(1.0f);
            f21888q0 = new Paint(1);
            Paint paint3 = new Paint(1);
            f21851o0 = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            f21851o0.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f21851o0.setStrokeCap(Paint.Cap.ROUND);
            Paint paint4 = new Paint(1);
            f21833n0 = paint4;
            paint4.setColor(0);
            f21833n0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            f21869p0 = new Paint(1);
            Paint paint5 = new Paint();
            m0 = paint5;
            paint5.setPathEffect(z80.c());
            Resources resources = context.getResources();
            Drawable drawable = resources.getDrawable(R.drawable.chats_saved);
            Drawable[] drawableArr = f21906r0;
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
            ij0 ij0Var = f21956u1;
            if (ij0Var != null) {
                ij0Var.setCallback(null);
                f21956u1.A(false);
            }
            ij0 ij0Var2 = f21974v1;
            if (ij0Var2 != null) {
                ij0Var2.A(false);
            }
            ij0 ij0Var3 = f21993w1;
            if (ij0Var3 != null) {
                ij0Var3.A(false);
            }
            ij0 ij0Var4 = f22012x1;
            if (ij0Var4 != null) {
                ij0Var4.A(false);
            }
            ij0 ij0Var5 = f22031y1;
            if (ij0Var5 != null) {
                ij0Var5.A(false);
            }
            ij0 ij0Var6 = f22049z1;
            if (ij0Var6 != null) {
                ij0Var6.A(false);
            }
            f21956u1 = new ij0(R.raw.chats_archiveavatar, "chats_archiveavatar", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21974v1 = new ij0(R.raw.chats_archive, "chats_archive", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21993w1 = new ij0(R.raw.chats_unarchive, "chats_unarchive", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f22012x1 = new ij0(R.raw.chats_hide, "chats_hide", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f22031y1 = new ij0(R.raw.chats_unhide, "chats_unhide", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f22049z1 = new ij0(R.raw.chat_audio_record_delete, "chats_psahide", AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), false, null);
            H1 = new ij0(R.raw.swipe_mute, "swipe_mute", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            I1 = new ij0(R.raw.swipe_unmute, "swipe_unmute", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            L1 = new ij0(R.raw.swipe_read, "swipe_read", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            M1 = new ij0(R.raw.swipe_unread, "swipe_unread", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            J1 = new ij0(R.raw.swipe_delete, "swipe_delete", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            O1 = new ij0(R.raw.swipe_unpin, "swipe_unpin", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            N1 = new ij0(R.raw.swipe_pin, "swipe_pin", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            K1 = new ij0(R.raw.swipe_community_ungroup, "swipe_community_ungroup", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
            k();
        }
    }

    public static Drawable P0(String str, g6 g6Var) {
        Drawable drawable;
        if (g6Var != null) {
            drawable = g6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return (Drawable) jl.get(str);
    }

    public static fc0 Q(int i10, int i11) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        fc0 fc0Var = new fc0(z10, -2368069, -9722489, -2762611, -7817084);
        if (i10 <= 0 || i11 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            i11 = Math.max(point2.x, point2.y);
        }
        fc0Var.t(SvgHelper.getBitmap(R.raw.default_pattern, i10, i11, -16777216, 1.0f, SvgHelper.ScaleMode.ByWidth), 34);
        fc0Var.u(fc0Var.f());
        return fc0Var;
    }

    public static SparseIntArray Q0(File file, String str, String[] strArr) {
        File file2;
        int intValue;
        SparseIntArray sparseIntArray = new SparseIntArray();
        FileInputStream fileInputStream = null;
        try {
            try {
                byte[] bArr = new byte[1024];
                if (str != null) {
                    file2 = p0(str);
                } else {
                    file2 = file;
                }
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                int i10 = -1;
                int i11 = 0;
                int i12 = -1;
                boolean z10 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(bArr);
                        if (read == i10) {
                            break;
                        }
                        int i13 = i11;
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            if (i14 >= read) {
                                break;
                            }
                            if (bArr[i14] == 10) {
                                int i16 = i14 - i15;
                                int i17 = i16 + 1;
                                String str2 = new String(bArr, i15, i16);
                                if (str2.startsWith("WLS=")) {
                                    if (strArr != null && strArr.length > 0) {
                                        strArr[0] = str2.substring(4);
                                    }
                                } else if (str2.startsWith("WPS")) {
                                    i12 = i13 + i17;
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
                                        int s10 = i5.s(substring);
                                        if (s10 >= 0) {
                                            sparseIntArray.put(s10, intValue);
                                        }
                                    }
                                }
                                i15 += i17;
                                i13 += i17;
                            }
                            i14++;
                            i10 = -1;
                        }
                        if (i11 == i13) {
                            break;
                        }
                        fileInputStream2.getChannel().position(i13);
                        if (z10) {
                            break;
                        }
                        i11 = i13;
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
                sparseIntArray.put(f21713g5, i12);
                fileInputStream2.close();
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        return sparseIntArray;
    }

    public static void R(Context context) {
        P(context);
        if (L0 == null) {
            TextPaint textPaint = new TextPaint(1);
            L0 = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint2 = new TextPaint(1);
            M0 = textPaint2;
            textPaint2.setTypeface(AndroidUtilities.bold());
            f21992w0 = new Paint(1);
            f21939t0 = new Paint(1);
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
            f21955u0 = new Paint();
            f21973v0 = new Paint(1);
            f22030y0 = new Paint(1);
            f22011x0 = new Paint(1);
            f22048z0 = new Paint(1);
            f21600a1 = resources.getDrawable(R.drawable.list_secret);
            f21618b1 = resources.getDrawable(R.drawable.msg_mini_lock2);
            T0 = resources.getDrawable(R.drawable.list_check).mutate();
            S0 = resources.getDrawable(R.drawable.community_cards).mutate();
            U0 = resources.getDrawable(R.drawable.minithumb_play).mutate();
            V0 = resources.getDrawable(R.drawable.list_check).mutate();
            W0 = resources.getDrawable(R.drawable.list_halfcheck);
            X0 = new nc0();
            Y0 = resources.getDrawable(R.drawable.list_warning_sign);
            Z0 = resources.getDrawable(R.drawable.list_reorder).mutate();
            f21637c1 = resources.getDrawable(R.drawable.list_mute).mutate();
            f21654d1 = resources.getDrawable(R.drawable.list_unmute).mutate();
            f21673e1 = resources.getDrawable(R.drawable.mini_ephemeral_hidden_16).mutate();
            f21691f1 = resources.getDrawable(R.drawable.verified_area).mutate();
            f21709g1 = new gm0(0);
            f21727h1 = new gm0(1);
            f21745i1 = resources.getDrawable(R.drawable.verified_check).mutate();
            f21816m1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            f21834n1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            f21852o1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            f21870p1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            f21889q1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            f21907r1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            f21762j1 = resources.getDrawable(R.drawable.list_pin);
            f21780k1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            l1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            f21940t1 = resources.getDrawable(R.drawable.msg_mini_forumarrow);
            f21923s0 = resources.getDrawable(R.drawable.preview_arrow);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = f21603a5;
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

    public static float R0(float f10) {
        if (f10 < 0.0f && !I.q()) {
            return -f10;
        }
        return f10;
    }

    public static v5 S(Context context) {
        return T(context, w0(null, f21960u5, false), w0(null, f21978v5, false));
    }

    public static Paint S0(String str) {
        if (Objects.equals(str, "paintDivider")) {
            return f21779k0;
        }
        return (Paint) ll.get(str);
    }

    public static v5 T(Context context, int i10, int i11) {
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

    public static Paint T0(String str, g6 g6Var) {
        Paint F10;
        if (g6Var != null && (F10 = g6Var.F(str)) != null) {
            return F10;
        }
        return S0(str);
    }

    public static v5 U(Context context, int i10, int i11, int i12) {
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

    public static Drawable U0(Context context, int i10, int i11) {
        if (context == null) {
            return null;
        }
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        return mutate;
    }

    public static org.telegram.ui.Cells.z V(float f10, int i10, int i11) {
        return W(f10, 285212671, i10, i11, i10, i11);
    }

    public static Drawable V0(Context context, int i10, int i11) {
        return U0(context, i10, w0(null, i11, false));
    }

    public static org.telegram.ui.Cells.z W(float f10, int i10, int i11, int i12, int i13, int i14) {
        f22047z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new y5(i11, i12, i13, i14, f10));
    }

    public static android.graphics.drawable.Drawable W0(android.view.View r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.W0(android.view.View, boolean):android.graphics.drawable.Drawable");
    }

    public static void X(Context context) {
        if (Q1 == null) {
            P1 = new TextPaint(1);
            Resources resources = context.getResources();
            Q1 = resources.getDrawable(R.drawable.verified_area).mutate();
            R1 = resources.getDrawable(R.drawable.verified_check).mutate();
            p();
        }
        P1.setTextSize(AndroidUtilities.dp(16.0f));
    }

    public static int X0(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 | (-16777216);
    }

    public static org.telegram.ui.Cells.z Y(int i10, int i11, int i12) {
        f22047z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new h6(i11, i12));
    }

    public static String Y0(d6 d6Var) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (d6Var == null || TextUtils.isEmpty(d6Var.f21284c) || d6Var.f21284c.equals("d")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (d6Var.f21288i) {
            sb2.append("blur");
        }
        if (d6Var.f21289j) {
            if (sb2.length() > 0) {
                sb2.append("+");
            }
            sb2.append("motion");
        }
        int i10 = d6Var.d;
        if (i10 == 0) {
            str3 = "https://attheme.org?slug=" + d6Var.f21284c;
        } else {
            String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (d6Var.d >> 8)) & 255), Byte.valueOf((byte) (d6Var.d & 255))).toLowerCase();
            int i11 = d6Var.f21285e;
            if (i11 != 0) {
                str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (d6Var.f21285e >> 8)) & 255), Byte.valueOf((byte) (d6Var.f21285e & 255))).toLowerCase();
            } else {
                str = null;
            }
            int i12 = d6Var.f21286f;
            if (i12 != 0) {
                str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (d6Var.f21286f >> 8)) & 255), Byte.valueOf((byte) (d6Var.f21286f & 255))).toLowerCase();
            } else {
                str2 = null;
            }
            int i13 = d6Var.f21287g;
            if (i13 != 0) {
                str4 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (d6Var.f21287g >> 8)) & 255), Byte.valueOf((byte) (d6Var.f21287g & 255))).toLowerCase();
            }
            if (str != null && str2 != null) {
                if (str4 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(lowerCase);
                    sb3.append("~");
                    sb3.append(str);
                    sb3.append("~");
                    sb3.append(str2);
                    lowerCase = android.support.v4.media.a.r(sb3, "~", str4);
                } else {
                    lowerCase = lowerCase + "~" + str + "~" + str2;
                }
            } else if (str != null) {
                StringBuilder f10 = w.c.f(android.support.v4.media.a.z(lowerCase, "-", str), "&rotation=");
                f10.append(d6Var.h);
                lowerCase = f10.toString();
            }
            str3 = "https://attheme.org?slug=" + d6Var.f21284c + "&intensity=" + ((int) (d6Var.f21290k * 100.0f)) + "&bg_color=" + lowerCase;
        }
        if (sb2.length() > 0) {
            StringBuilder f11 = w.c.f(str3, "&mode=");
            f11.append(sb2.toString());
            return f11.toString();
        }
        return str3;
    }

    public static org.telegram.ui.Cells.z Z(int i10, int i11, int i12, int i13) {
        f22047z.setColor(-1);
        float f10 = i12;
        float f11 = i13;
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), c0(AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), i10), new h6(f10, f11));
    }

    public static boolean Z0() {
        if (P && I.f21513f0 != null) {
            return true;
        }
        return false;
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

    public static org.telegram.ui.Cells.z a0(int i10, int i11, int i12, int i13, int i14) {
        f22047z.setColor(-1);
        ?? drawable = new Drawable();
        drawable.f21442a = new Path();
        drawable.f21443b = r1;
        drawable.f21444c = true;
        float dp = AndroidUtilities.dp(i11);
        float dp2 = AndroidUtilities.dp(i12);
        float dp3 = AndroidUtilities.dp(i13);
        float dp4 = AndroidUtilities.dp(i14);
        float[] fArr = {dp, dp, dp2, dp2, dp3, dp3, dp4, dp4};
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, drawable);
    }

    public static boolean a1() {
        if (Z != null) {
            return true;
        }
        return false;
    }

    public static int b(float f10, float f11, int i10) {
        float[] M02 = M0(5);
        Color.colorToHSV(i10, M02);
        float f12 = M02[1];
        if (f12 > 0.1f && f12 < 0.9f) {
            M02[1] = k7.o.a(f12 + f10, 0.0f, 1.0f);
        }
        M02[2] = k7.o.a(M02[2] + f11, 0.0f, 1.0f);
        return Color.HSVToColor(Color.alpha(i10), M02);
    }

    public static ShapeDrawable b0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        return shapeDrawable;
    }

    public static boolean b1(int i10) {
        float[] M02 = M0(3);
        Color.colorToHSV(i10, M02);
        float f10 = M02[1];
        if (f10 > 0.1f && f10 < 0.9f) {
            return true;
        }
        return false;
    }

    public static int c(int i10, int i11) {
        float[] M02 = M0(5);
        Color.colorToHSV(i11, M02);
        float f10 = M02[0];
        float f11 = M02[1];
        Color.colorToHSV(i10, M02);
        M02[0] = f10;
        M02[1] = AndroidUtilities.lerp(M02[1], f11, 0.25f);
        return Color.HSVToColor(Color.alpha(i10), M02);
    }

    public static ShapeDrawable c0(int i10, int i11, int i12) {
        float f10 = i10;
        float f11 = i11;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f11, f11, f11, f11}, null, null));
        shapeDrawable.getPaint().setColor(i12);
        return shapeDrawable;
    }

    public static boolean c1(int i10) {
        if (rl.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    public static void d(int i10, String str, Drawable drawable) {
        jl.put(str, drawable);
        kl.put(str, Integer.valueOf(i10));
    }

    public static InsetDrawable d0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        shapeDrawable.getPaint().setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), l1(Color.alpha(i11) / 255.0f, 285212672));
        return new InsetDrawable((Drawable) shapeDrawable, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
    }

    public static boolean d1() {
        j6 j6Var = I;
        if (!j6Var.P || j6Var.V != f21832n) {
            if (rl.indexOfKey(Nd) < 0 && f21708g0 <= 0 && TextUtils.isEmpty(f21726h0)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void e(int i10, Paint paint, String str) {
        ll.put(str, paint);
        ml.put(str, Integer.valueOf(i10));
    }

    public static org.telegram.ui.Cells.z e0(int i10, int i11) {
        return f0(i10, i11, -1);
    }

    public static boolean e1() {
        return I.q();
    }

    public static void f(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        if (z10) {
            int i10 = xk;
            if (sparseIntArray.indexOfKey(i10) < 0) {
                sparseIntArray2.put(i10, l1(0.1f, -1));
            }
        }
        int[] iArr = nl;
        int i11 = f21916ra;
        int i12 = sparseIntArray2.get(i11, iArr[i11]);
        int E12 = E1(sparseIntArray2);
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
            sparseIntArray2.put(i15, w(E12, z10, false));
        }
        int i16 = Ck;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            sparseIntArray2.put(i16, w(E12, z10, true));
        }
        int i17 = Dk;
        if (sparseIntArray.indexOfKey(i17) < 0) {
            sparseIntArray2.put(i17, x(i12, z10, false, true));
        }
        int i18 = Ek;
        if (sparseIntArray.indexOfKey(i18) < 0) {
            sparseIntArray2.put(i18, x(E12, z10, true, true));
        }
        int i19 = Fk;
        if (sparseIntArray.indexOfKey(i19) < 0) {
            sparseIntArray2.put(i19, x(i12, z10, false, false));
        }
        int i20 = Gk;
        if (sparseIntArray.indexOfKey(i20) < 0) {
            sparseIntArray2.put(i20, x(E12, z10, true, false));
        }
    }

    public static org.telegram.ui.Cells.z f0(int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.f0(int, int, int):org.telegram.ui.Cells.z");
    }

    public static boolean f1() {
        return !I.q();
    }

    public static void g(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        int[] iArr = nl;
        int i10 = f21916ra;
        int i11 = sparseIntArray2.get(i10, iArr[i10]);
        int E12 = E1(sparseIntArray2);
        int i12 = rk;
        if (sparseIntArray.indexOfKey(i12) < 0) {
            sparseIntArray2.put(i12, y(i11, z10, false));
        }
        int i13 = sk;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, y(E12, z10, true));
        }
        int i14 = tk;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, z(i11, z10, false));
        }
        int i15 = uk;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, z(E12, z10, true));
        }
        int i16 = wk;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            int i17 = f21609ab;
            sparseIntArray2.put(i16, l1(0.2f, sparseIntArray2.get(i17, iArr[i17])));
        }
        if (z10) {
            int i18 = vk;
            if (sparseIntArray.indexOfKey(i18) < 0) {
                int i19 = Yc;
                sparseIntArray2.put(i18, l1(0.2f, sparseIntArray2.get(i19, iArr[i19])));
            }
        }
    }

    public static org.telegram.ui.Cells.z g0(int i10, int i11) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), new ColorDrawable(i10), new ColorDrawable(i10));
    }

    public static boolean g1(i6 i6Var) {
        j6 j6Var = i6Var.f21468b;
        if (j6Var != null) {
            if (j6Var.m().equals("Blue") && i6Var.f21467a == 99) {
                return true;
            }
            if (i6Var.f21468b.m().equals("Day") && i6Var.f21467a == 9) {
                return true;
            }
            if ((i6Var.f21468b.m().equals("Night") || i6Var.f21468b.m().equals("Dark Blue")) && i6Var.f21467a == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void h(Drawable drawable) {
        boolean z10;
        Bitmap bitmap;
        if (f21674e2 == null) {
            return;
        }
        int i10 = rl.get(Hc);
        if ((drawable instanceof fc0) && SharedConfig.getDevicePerformanceClass() != 0 && i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && Y != (bitmap = ((fc0) drawable).f26879k)) {
            Y = bitmap;
            Bitmap bitmap2 = Y;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            Z = new BitmapShader(bitmap2, tileMode, tileMode);
            if (f21599a0 == null) {
                f21599a0 = new Matrix();
            }
        }
        if (Z != null && i10 == 0 && z10) {
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 2.5f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.75f);
            f21674e2.setShader(Z);
            f21674e2.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            f21674e2.setAlpha(64);
            return;
        }
        Paint paint = f21674e2;
        if (i10 == 0) {
            i10 = 1073741824;
        }
        paint.setColor(i10);
        f21674e2.setColorFilter(null);
        f21674e2.setShader(null);
    }

    public static org.telegram.ui.Cells.z h0(int i10, int i11, int i12) {
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(i11);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(ovalShape);
        shapeDrawable2.getPaint().setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i12}), shapeDrawable, shapeDrawable2);
    }

    public static void h1(int i10, boolean z10) {
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
                ConnectionsManager.getInstance(i10).sendRequest(getthemes, new org.telegram.messenger.voip.o(i10, 2));
            }
        }
    }

    public static void i(Drawable drawable) {
        int i10;
        int i11;
        Bitmap bitmap;
        float f10;
        float f11;
        float f12;
        float f13;
        if (f21692f2 == null) {
            return;
        }
        X = f21636c0;
        f21617b0 = f21653d0;
        SparseIntArray sparseIntArray = rl;
        int i12 = f21809lc;
        int indexOfKey = sparseIntArray.indexOfKey(i12);
        if (indexOfKey >= 0) {
            i10 = rl.valueAt(indexOfKey);
        } else {
            i10 = X;
        }
        int indexOfKey2 = rl.indexOfKey(f21826mc);
        if (indexOfKey2 >= 0) {
            i11 = rl.valueAt(indexOfKey2);
        } else {
            i11 = f21617b0;
        }
        boolean z10 = drawable instanceof fc0;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z10) {
                bitmap = ((fc0) drawable).f26879k;
            } else {
                if (drawable instanceof BitmapDrawable) {
                    WeakReference weakReference = Fl;
                    if (weakReference != null && weakReference.get() == drawable) {
                        bitmap = Gl;
                    } else {
                        WeakReference weakReference2 = Fl;
                        if (weakReference2 != null) {
                            weakReference2.clear();
                        }
                        Fl = null;
                        if (drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
                            Fl = new WeakReference(drawable);
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
                            Gl = createBitmap;
                            bitmap = createBitmap;
                        } else {
                            Gl = null;
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
                if (f21599a0 == null) {
                    f21599a0 = new Matrix();
                }
            }
            w1(-1, Y3);
            w1(-1, H3);
            w1(-1, I3);
            w1(-1, J3);
            w1(-1, K3);
            f21925s2.setColor(-1);
            f21941t2.setColor(-1);
            f21957u2.setColor(-1);
            f21925s2.linkColor = -1;
            f21975v2.setColor(-1);
            Q2.setColor(-1);
            w1(-1, C4);
            w1(-1, f21892q4);
            w1(-1, f21910r4);
            w1(-1, f21959u4);
            w1(-1, f22015x4);
            w1(-1, f22034y4);
            w1(-1, A4);
            w1(-1, z4);
            w1(-1, f21977v4);
        } else {
            Y = null;
            Z = null;
            Drawable drawable2 = Y3;
            int i13 = ic;
            x1(i13, drawable2);
            x1(i13, H3);
            x1(i13, I3);
            x1(i13, J3);
            x1(i13, K3);
            f21925s2.setColor(w0(null, i13, false));
            f21941t2.setColor(w0(null, i13, false));
            f21925s2.linkColor = w0(null, jc, false);
            f21975v2.setColor(w0(null, i13, false));
            Drawable drawable3 = C4;
            int i14 = f21791kc;
            x1(i14, drawable3);
            x1(i14, f21892q4);
            x1(i14, f21910r4);
            x1(i14, f21959u4);
            x1(i14, f22015x4);
            x1(i14, f22034y4);
            x1(i14, A4);
            x1(i14, z4);
            x1(i14, f21977v4);
            Q2.setColor(w0(null, Nc, false));
        }
        f21692f2.setColor(i10);
        f21710g2.setColor(i11);
        if (Z != null && (rl.indexOfKey(i12) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix2 = new ColorMatrix();
            if (z10) {
                float f14 = -0.06f;
                if (((fc0) drawable).f26885q >= 0.0f) {
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
            f21692f2.setFilterBitmap(true);
            f21692f2.setShader(Z);
            f21692f2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
            f21692f2.setAlpha(255);
            f21710g2.setFilterBitmap(true);
            f21710g2.setShader(Z);
            ColorMatrix colorMatrix3 = new ColorMatrix(colorMatrix2);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.26f);
            e1();
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix3, 0.92f);
            f21710g2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
            f21710g2.setAlpha(255);
            f21728h2.setAlpha(0);
            return;
        }
        f21692f2.setColorFilter(null);
        f21692f2.setShader(null);
        f21710g2.setColorFilter(null);
        f21710g2.setShader(null);
        f21728h2.setAlpha(21);
    }

    public static org.telegram.ui.Cells.z i0(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
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

    public static Bitmap i1(FileInputStream fileInputStream, int i10) {
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

    public static void j(boolean z10, boolean z11) {
        if (f21853o2 != null && f21818m3 != null && !z10) {
            K2.setColor(w0(null, Jc, false));
            J2.setColor(w0(null, Ic, false));
            Q2.setColor(w0(null, Nc, false));
            U1.setColor(w0(null, Ld, false));
            V1.setColor(w0(null, Mb, false));
            W1.setColor(w0(null, Md, false));
            f21619b2.setColor(w0(null, Fc, false));
            Paint paint = f21638c2;
            int i10 = f21879pa;
            paint.setColor(w0(null, i10, false));
            f21655d2.setColor(w0(null, i10, false));
            TextPaint textPaint = f21925s2;
            int i11 = ic;
            textPaint.setColor(w0(null, i11, false));
            f21941t2.setColor(w0(null, i11, false));
            f21957u2.setColor(w0(null, i11, false));
            f21925s2.linkColor = w0(null, jc, false);
            f21975v2.setColor(w0(null, i11, false));
            f21693f3.setColor(w0(null, G6, false));
            Paint paint2 = f21763j2;
            int i12 = Sd;
            paint2.setColor(w0(null, i12, false));
            f21746i2.setColor(w0(null, f22004wc, false));
            x1(f21792kd, f21729h3);
            h5 h5Var = f21818m3;
            int i13 = f21916ra;
            x1(i13, h5Var);
            h5 h5Var2 = f21836n3;
            int i14 = f21665dc;
            x1(i14, h5Var2);
            x1(i13, f21891q3);
            x1(i14, f21909r3);
            x1(Ja, f22033y3);
            x1(Ka, f22051z3);
            Drawable drawable = A3;
            int i15 = La;
            x1(i15, drawable);
            Drawable drawable2 = B3;
            int i16 = Ma;
            x1(i16, drawable2);
            x1(i15, C3);
            x1(i16, D3);
            Drawable drawable3 = F3;
            int i17 = f21932sc;
            x1(i17, drawable3);
            x1(i17, G3);
            x1(i11, H3);
            x1(i11, I3);
            x1(i11, J3);
            x1(i11, K3);
            x1(i11, L3);
            Drawable drawable4 = f21892q4;
            int i18 = f21791kc;
            x1(i18, drawable4);
            x1(i18, f21910r4);
            x1(i18, f21959u4);
            x1(i18, f22015x4);
            x1(i18, f22034y4);
            Drawable drawable5 = A4;
            int i19 = f21881pc;
            x1(i19, drawable5);
            x1(i18, z4);
            x1(i18, f21977v4);
            Drawable drawable6 = M3;
            int i20 = f22023xc;
            x1(i20, drawable6);
            Drawable drawable7 = N3;
            int i21 = f22042yc;
            x1(i21, drawable7);
            Drawable drawable8 = O3;
            int i22 = Ra;
            x1(i22, drawable8);
            Drawable drawable9 = P3;
            int i23 = Sa;
            x1(i23, drawable9);
            x1(i20, Q3);
            x1(i21, R3);
            x1(i22, S3);
            x1(i23, T3);
            x1(i20, U3);
            x1(i21, V3);
            x1(i22, W3);
            x1(i23, X3);
            Drawable drawable10 = Z3;
            int i24 = f22057zc;
            x1(i24, drawable10);
            x1(i11, Y3);
            x1(i24, f21602a4);
            x1(i24, f21621b4);
            x1(Ac, f21639c4);
            x1(Bc, f21657d4);
            x1(Ta, f21676e4);
            x1(Ua, f21694f4);
            x1(Cc, f21712g4);
            Drawable drawable11 = f21748i4;
            int i25 = Va;
            x1(i25, drawable11);
            Drawable drawable12 = f21730h4;
            int i26 = Dc;
            x1(i26, drawable12);
            x1(Gc, f21765j4);
            x1(f21862oc, f21783k4);
            x1(i19, f21801l4);
            Drawable drawable13 = f21819m4;
            int i27 = Ge;
            x1(i27, drawable13);
            x1(i27, f21837n4);
            x1(i27, f21855o4);
            x1(i26, B4);
            x1(i18, C4);
            x1(i26, D4);
            Drawable drawable14 = E4;
            int i28 = Be;
            x1(i28, drawable14);
            x1(i28, F4);
            for (int i29 = 0; i29 < 2; i29++) {
                x1(i26, G4[i29]);
                x1(Ec, H4[i29]);
                x1(i25, I4[i29]);
                x1(Wa, J4[i29]);
            }
            x1(Ia, O4);
            Drawable drawable15 = P4;
            int i30 = f21913r7;
            x1(i30, drawable15);
            x1(f21898qa, Q4);
            x1(i30, V4);
            Drawable drawable16 = W4;
            int i31 = Di;
            x1(i31, drawable16);
            x1(i30, X4);
            x1(i31, Y4);
            int i32 = 0;
            while (true) {
                nw0[] nw0VarArr = f21958u3;
                if (i32 >= nw0VarArr.length) {
                    break;
                }
                x1(f21878p9, nw0VarArr[i32]);
                i32++;
            }
            for (int i33 = 0; i33 < 5; i33++) {
                Drawable[][] drawableArr = U4;
                v1(drawableArr[i33][0], w0(null, f21757ie, false), false);
                v1(drawableArr[i33][0], w0(null, f21967uc, false), true);
                v1(drawableArr[i33][1], w0(null, f21774je, false), false);
                v1(drawableArr[i33][1], w0(null, f21985vc, false), true);
            }
            Drawable[] drawableArr2 = T4;
            v1(drawableArr2[0], w0(null, f21919re, false), false);
            v1(drawableArr2[0], w0(null, f21934se, false), true);
            v1(drawableArr2[1], w0(null, Qb, false), false);
            v1(drawableArr2[1], w0(null, Rb, false), true);
            Drawable[] drawableArr3 = S4;
            w1(w0(null, f21901qe, false), drawableArr3[0]);
            w1(w0(null, Pb, false), drawableArr3[1]);
            Drawable[] drawableArr4 = M4;
            w1(w0(null, Kc, false), drawableArr4[0]);
            w1(w0(null, Xa, false), drawableArr4[1]);
            Drawable[] drawableArr5 = N4;
            w1(w0(null, i20, false), drawableArr5[0]);
            w1(w0(null, i22, false), drawableArr5[1]);
            x1(Td, f21747i3);
            x1(i12, f21764j3);
            int i34 = -1;
            if (w0(null, zb, false) == -1) {
                i34 = w0(null, Aa, false);
            }
            w1(i34, K4[1]);
            w1(i34, L4[1]);
            w1(w0(null, f21663da, false), R4);
            if (!z11 && !f21616b) {
                Drawable drawable17 = f21672e0;
                if (drawable17 != null) {
                    i(drawable17);
                }
                h(f21672e0);
            }
        }
    }

    public static boolean j0(j6 j6Var, i6 i6Var, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (i6Var == null || j6Var == null || j6Var.Y == null) {
            return false;
        }
        if (i6Var.f21467a == j6Var.V) {
            z11 = true;
        } else {
            z11 = false;
        }
        File d10 = i6Var.d();
        if (d10 != null) {
            d10.delete();
        }
        j6Var.X.remove(i6Var.f21467a);
        j6Var.Y.remove(i6Var);
        TLRPC.TL_theme tL_theme = i6Var.f21482r;
        if (tL_theme != null) {
            j6Var.Z.remove(tL_theme.f20980id);
        }
        d6 d6Var = i6Var.f21488y;
        if (d6Var != null) {
            d6.a(d6Var);
        }
        if (z11) {
            j6Var.u(((i6) j6Var.Y.get(0)).f21467a);
        }
        if (z10) {
            t1(j6Var, true, false, false, false, false);
            if (i6Var.f21482r != null) {
                MessagesController messagesController = MessagesController.getInstance(i6Var.f21484t);
                if (z11 && j6Var == J) {
                    z12 = true;
                }
                messagesController.saveTheme(j6Var, i6Var, z12, true);
            }
        }
        return z11;
    }

    public static void j1(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.j1(boolean):void");
    }

    public static void k() {
        Paint paint = f21779k0;
        if (paint == null) {
            return;
        }
        paint.setColor(w0(null, f21660d7, false));
        m0.setColor(w0(null, K6, false));
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = f21906r0;
            int length = drawableArr.length;
            int i11 = J7;
            if (i10 < length) {
                x1(i11, drawableArr[i10]);
                i10++;
            } else {
                ij0 ij0Var = f21956u1;
                ij0Var.X = true;
                int i12 = M7;
                ij0Var.O(w0(null, i12, true), "Arrow1");
                f21956u1.O(w0(null, i12, true), "Arrow2");
                f21956u1.O(w0(null, i11, true), "Box2");
                f21956u1.O(w0(null, i11, true), "Box1");
                f21956u1.m();
                C1 = false;
                f21956u1.H(true);
                ij0 ij0Var2 = f22012x1;
                ij0Var2.X = true;
                int i13 = f21680e9;
                ij0Var2.O(w0(null, i13, true), "Arrow");
                f22012x1.O(w0(null, i13, true), "Line");
                f22012x1.m();
                ij0 ij0Var3 = f22031y1;
                ij0Var3.X = true;
                ij0Var3.O(w0(null, i13, true), "Arrow");
                f22031y1.O(w0(null, i13, true), "Line");
                f22031y1.m();
                ij0 ij0Var4 = f22049z1;
                ij0Var4.X = true;
                int i14 = f21644c9;
                ij0Var4.O(w0(null, i14, true), "Line 1");
                f22049z1.O(w0(null, i14, true), "Line 2");
                f22049z1.O(w0(null, i14, true), "Line 3");
                f22049z1.O(w0(null, i13, true), "Cup Red");
                f22049z1.O(w0(null, i13, true), "Box");
                f22049z1.m();
                B1 = false;
                ij0 ij0Var5 = f21974v1;
                ij0Var5.X = true;
                ij0Var5.O(w0(null, i14, true), "Arrow");
                f21974v1.O(w0(null, i13, true), "Box2");
                f21974v1.O(w0(null, i13, true), "Box1");
                f21974v1.m();
                A1 = false;
                ij0 ij0Var6 = f21993w1;
                ij0Var6.X = true;
                ij0Var6.O(w0(null, i13, true), "Arrow1");
                f21993w1.O(w0(null, f21662d9, true), "Arrow2");
                f21993w1.O(w0(null, i13, true), "Box2");
                f21993w1.O(w0(null, i13, true), "Box1");
                f21993w1.m();
                int w02 = w0(null, G6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                f21976v3 = new PorterDuffColorFilter(w02, mode);
                f21995w3 = new PorterDuffColorFilter(w0(null, f21701fc, false), mode);
                fg.q1.d().b();
                return;
            }
        }
    }

    public static j6 k0(File file, String str, TLRPC.TL_theme tL_theme) {
        String[] split;
        try {
            j6 j6Var = new j6();
            j6Var.f21503a = str;
            j6Var.C = tL_theme;
            j6Var.f21505b = file.getAbsolutePath();
            j6Var.B = UserConfig.selectedAccount;
            String[] strArr = new String[1];
            G(Q0(new File(j6Var.f21505b), null, strArr), j6Var);
            if (!TextUtils.isEmpty(strArr[0])) {
                String str2 = strArr[0];
                File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                j6Var.f21507c = new File(filesDirFixed, Utilities.MD5(str2) + ".wp").getAbsolutePath();
                Uri parse = Uri.parse(str2);
                j6Var.f21510e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        if ("blur".equals(split[i10])) {
                            j6Var.h = true;
                        } else if ("motion".equals(split[i10])) {
                            j6Var.f21515n = true;
                        }
                    }
                }
                String queryParameter2 = parse.getQueryParameter("intensity");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String queryParameter3 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            j6Var.f21516r = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                            if (queryParameter3.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(6))) {
                                j6Var.f21517s = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter3.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(13))) {
                                j6Var.v = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter3.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(20))) {
                                j6Var.f21518w = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String queryParameter4 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            j6Var.f21519x = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        j6Var.f21520y = Utilities.parseInt((CharSequence) queryParameter2).intValue();
                    }
                    if (j6Var.f21520y == 0) {
                        j6Var.f21520y = 50;
                    }
                }
                return j6Var;
            }
            f21726h0 = null;
            return j6Var;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static Drawable k1(d6 d6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable drawable;
        c5.j I10 = I(I, d6Var, rl, file, f21726h0, f21708g0, i10, S, z11, O, P, z10, document, false);
        Boolean bool = (Boolean) I10.f2317c;
        if (bool != null) {
            z12 = bool.booleanValue();
        } else {
            z12 = f21744i0;
        }
        f21744i0 = z12;
        Boolean bool2 = (Boolean) I10.d;
        if (bool2 != null) {
            z13 = bool2.booleanValue();
        } else {
            z13 = f21761j0;
        }
        f21761j0 = z13;
        Boolean bool3 = (Boolean) I10.f2318e;
        if (bool3 != null) {
            z14 = bool3.booleanValue();
        } else {
            z14 = W;
        }
        W = z14;
        Drawable drawable2 = (Drawable) I10.f2315a;
        if (drawable2 != null) {
            drawable = drawable2;
        } else {
            drawable = f21672e0;
        }
        f21672e0 = drawable;
        int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(drawable2);
        int i11 = calcDrawableColor[0];
        f21636c0 = i11;
        X = i11;
        int i12 = calcDrawableColor[1];
        f21653d0 = i12;
        f21617b0 = i12;
        Drawable drawable3 = f21672e0;
        if (drawable3 != null) {
            i(drawable3);
        }
        return drawable2;
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
                        f21743i = SystemClock.elapsedRealtime();
                        Q = true;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, J, Boolean.TRUE, null, -1);
                        Q = false;
                        return;
                    }
                    return;
                }
                return;
            }
            j6 j6Var4 = K;
            if (j6Var4 != null && j6Var4.q() && f21850o != 0 && (j6Var = L) != null) {
                j6Var4 = j6Var;
            }
            j6 j6Var5 = I;
            if (j6Var5 != j6Var4) {
                if (j6Var5 == null || (j6Var4 != null && j6Var5.q() != j6Var4.q())) {
                    R = false;
                    f21743i = SystemClock.elapsedRealtime();
                    Q = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j6Var4, Boolean.TRUE, null, -1);
                    Q = false;
                }
            }
        }
    }

    public static Paint l0(int i10) {
        Paint paint = Hl;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
        }
        return paint;
    }

    public static int l1(float f10, int i10) {
        if (f10 == 1.0f) {
            return i10;
        }
        return i0.a.k(i10, k7.o.b((int) (Color.alpha(i10) * f10), 0, 255));
    }

    public static void m(Paint paint) {
        paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), f21598a);
    }

    public static j6 m0() {
        return I;
    }

    public static int m1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.m1():int");
    }

    public static void n() {
        if (B0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = f21878p9;
            int i12 = f21717g9;
            int i13 = Z8;
            int i14 = X8;
            if (i10 < 2) {
                B0[i10].setColor(w0(null, i14, false));
                C0[i10].setColor(w0(null, i13, false));
                TextPaint textPaint = F0[i10];
                int w02 = w0(null, i12, false);
                textPaint.linkColor = w02;
                textPaint.setColor(w02);
                H0[i10].setColor(w0(null, i11, false));
                i10++;
            } else {
                D0.setColor(w0(null, i14, false));
                E0.setColor(w0(null, i13, false));
                TextPaint textPaint2 = G0;
                int w03 = w0(null, m9, false);
                textPaint2.linkColor = w03;
                textPaint2.setColor(w03);
                f21955u0.setColor(w0(null, t9, false));
                f21973v0.setColor(w0(null, s9, false));
                I0.setColor(w0(null, f21897q9, false));
                J0.setColor(w0(null, f21915r9, false));
                TextPaint textPaint3 = K0;
                int i15 = il;
                textPaint3.setColor(w0(null, i15, false));
                TextPaint textPaint4 = L0;
                int i16 = W8;
                textPaint4.setColor(w0(null, i16, false));
                M0.setColor(w0(null, i16, false));
                TextPaint textPaint5 = N0;
                int i17 = f21699f9;
                textPaint5.setColor(w0(null, i17, false));
                O0.setColor(w0(null, i17, false));
                Paint paint = f21992w0;
                int i18 = U8;
                paint.setColor(w0(null, i18, false));
                Paint paint2 = f22030y0;
                int i19 = V8;
                paint2.setColor(w0(null, i19, false));
                f22048z0.setColor(w0(null, i11, false));
                f22011x0.setColor(w0(null, f22020x9, false));
                P0.setColor(w0(null, f21875p6, false));
                Q0.setColor(w0(null, A6, false));
                x1(f21607a9, f21600a1);
                Drawable drawable = f21618b1;
                int i20 = f21626b9;
                x1(i20, drawable);
                x1(f21964u9, T0);
                x1(G6, S0);
                Drawable drawable2 = V0;
                int i21 = f21982v9;
                x1(i21, drawable2);
                x1(i21, W0);
                x1(f22001w9, X0);
                x1(f22039y9, Y0);
                x1(i20, f21762j1);
                x1(i20, f21780k1);
                x1(i15, l1);
                x1(i20, Z0);
                Drawable drawable3 = f21637c1;
                int i22 = B9;
                x1(i22, drawable3);
                x1(i22, f21654d1);
                x1(i22, f21673e1);
                x1(i18, f21816m1);
                x1(Z5, f21834n1);
                x1(zj, f21852o1);
                x1(i19, f21870p1);
                x1(i19, f21889q1);
                x1(i19, f21907r1);
                x1(i12, f21940t1);
                x1(f22056z9, f21691f1);
                x1(A9, f21745i1);
                x1(A8, f21924s1);
                gm0 gm0Var = f21709g1;
                int i23 = f21770j9;
                x1(i23, gm0Var);
                x1(i23, f21727h1);
                return;
            }
        }
    }

    public static ColorFilter n0(g6 g6Var) {
        if (g6Var != null) {
            return g6Var.w();
        }
        return f21976v3;
    }

    public static void n1(boolean z10, boolean z11) {
        rl = ql.clone();
        tl = true;
        i6 k10 = I.k(false);
        if (k10 != null) {
            tl = k10.c(ql, rl);
        }
        g(ql, rl, I.q());
        f(ql, rl, I.q());
        if (!z11) {
            o1(!(LaunchActivity.R() instanceof xn));
        }
        k();
        n();
        p();
        j(false, z10);
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.z3(3, !O));
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

    public static d8 o0(MessageObject messageObject) {
        HashMap hashMap = f21677e5;
        if (hashMap != null && messageObject != null) {
            return (d8) hashMap.get(messageObject);
        }
        return null;
    }

    public static void o1(boolean z10) {
        j9 j9Var = V;
        if (j9Var != null) {
            j9Var.dispose();
            V = null;
        }
        Drawable drawable = f21672e0;
        if (drawable instanceof fc0) {
            S = ((fc0) drawable).f26877i;
        } else {
            S = 0;
        }
        f21672e0 = null;
        f21690f0 = null;
        j1(z10);
    }

    public static void p() {
        if (Q1 == null) {
            return;
        }
        P1.setColor(w0(null, G6, false));
        P1.linkColor = w0(null, J6, false);
        x1(zh, Q1);
        x1(Ah, R1);
    }

    public static File p0(String str) {
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

    public static void p1(boolean z10) {
        if (z10) {
            P = false;
            o1(true);
            return;
        }
        I.v(null);
    }

    public static void q(float f10, float f11, int i10, int i11) {
        r(Y, Z, f21599a0, i10, i11, f10, f11);
    }

    public static String q0(TLRPC.ThemeSettings themeSettings) {
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

    public static void q1() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("selectedAutoNightType", f21850o);
        edit.putBoolean("autoNightScheduleByLocation", f21868p);
        edit.putFloat("autoNightBrighnessThreshold", f21887q);
        edit.putInt("autoNightDayStartTime", f21905r);
        edit.putInt("autoNightDayEndTime", f21922s);
        edit.putInt("autoNightSunriseTime", v);
        edit.putString("autoNightCityName", f21991w);
        edit.putInt("autoNightSunsetTime", f21938t);
        edit.putLong("autoNightLocationLatitude3", Double.doubleToRawLongBits(f22010x));
        edit.putLong("autoNightLocationLongitude3", Double.doubleToRawLongBits(f22029y));
        edit.putInt("autoNightLastSunCheckDay", f21954u);
        j6 j6Var = J;
        if (j6Var != null) {
            edit.putString("nighttheme", j6Var.m());
        } else {
            edit.remove("nighttheme");
        }
        edit.commit();
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

    public static Drawable r0() {
        Drawable s02 = s0();
        if (s02 == null && d != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Utilities.themeQueue.postRunnable(new p(countDownLatch, 16));
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            return s0();
        }
        return s02;
    }

    public static void r1(org.telegram.ui.ActionBar.j6 r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.r1(org.telegram.ui.ActionBar.j6, boolean, boolean, boolean):void");
    }

    public static void s(View view, View view2, g6 g6Var) {
        if (view != null && view2 != null) {
            int[] iArr = El;
            view.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            view2.getLocationOnScreen(iArr);
            if (view2 instanceof tc1) {
                Bitmap bitmap = Y;
                if (bitmap != null) {
                    float width = bitmap.getWidth();
                    i10 = (int) ((((view2.getMeasuredWidth() - (Math.max(view2.getMeasuredWidth() / width, view2.getMeasuredHeight() / Y.getHeight()) * width)) / 2.0f) - ((tc1) view2).F) + i10);
                } else {
                    i10 = (int) (i10 + (-((tc1) view2).F));
                }
                i11 = (int) (i11 + (-((tc1) view2).G));
            }
            if (g6Var != null) {
                g6Var.l(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
                return;
            }
            q(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
        }
    }

    public static Drawable s0() {
        Drawable drawable = f21690f0;
        if (drawable != null) {
            return drawable;
        }
        return f21672e0;
    }

    public static void s1(boolean z10, boolean z11) {
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
                    jSONObject.put("name", j6Var.f21503a);
                    jSONObject.put("path", j6Var.f21505b);
                    jSONObject.put("account", j6Var.B);
                    TLRPC.TL_theme tL_theme = j6Var.C;
                    if (tL_theme != null) {
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        j6Var.C.serializeToStream(serializedData);
                        jSONObject.put("info", Utilities.bytesToHex(serializedData.toByteArray()));
                    }
                    jSONObject.put("loaded", j6Var.D);
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
                if (j6Var2 == null || (arrayList = j6Var2.Y) == null || arrayList.isEmpty()) {
                    z12 = z11;
                } else {
                    z12 = z11;
                    t1(j6Var2, true, false, false, false, z12);
                }
                i10++;
                z11 = z12;
            }
        }
    }

    public static void t(org.telegram.ui.ActionBar.j6 r11, boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.t(org.telegram.ui.ActionBar.j6, boolean, boolean):void");
    }

    public static nw0 t0(int i10) {
        if (i10 < 0 || i10 > 5) {
            return null;
        }
        nw0[] nw0VarArr = f21958u3;
        nw0 nw0Var = nw0VarArr[i10];
        if (nw0Var != null) {
            return nw0Var;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                nw0VarArr[5] = new rp();
                            }
                        } else {
                            nw0VarArr[4] = new em0(true);
                        }
                    } else {
                        nw0VarArr[3] = new pg0(null, true);
                    }
                } else {
                    nw0VarArr[2] = new cp0(true);
                }
            } else {
                nw0VarArr[1] = new rp(true);
            }
        } else {
            nw0VarArr[0] = new h51(true);
        }
        nw0 nw0Var2 = nw0VarArr[i10];
        nw0Var2.d();
        nw0Var2.b(w0(null, f21878p9, false));
        return nw0Var2;
    }

    public static void t1(j6 j6Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        if (z10) {
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            if (!z12) {
                int size = j6Var.Y.size();
                int max = Math.max(0, size - j6Var.T);
                SerializedData serializedData = new SerializedData(((max * 16) + 2) * 4);
                serializedData.writeInt32(9);
                serializedData.writeInt32(max);
                for (int i10 = 0; i10 < size; i10++) {
                    i6 i6Var = (i6) j6Var.Y.get(i10);
                    int i11 = i6Var.f21467a;
                    if (i11 >= 100) {
                        serializedData.writeInt32(i11);
                        serializedData.writeInt32(i6Var.f21469c);
                        serializedData.writeInt32(i6Var.d);
                        serializedData.writeInt32(i6Var.f21470e);
                        serializedData.writeInt32(i6Var.f21471f);
                        serializedData.writeInt32(i6Var.f21472g);
                        serializedData.writeInt32(i6Var.h);
                        serializedData.writeBool(i6Var.f21473i);
                        serializedData.writeInt64(i6Var.f21474j);
                        serializedData.writeInt64(i6Var.f21475k);
                        serializedData.writeInt64(i6Var.f21476l);
                        serializedData.writeInt64(i6Var.f21477m);
                        serializedData.writeInt32(i6Var.f21478n);
                        serializedData.writeInt64(0L);
                        serializedData.writeDouble(i6Var.f21480p);
                        serializedData.writeBool(i6Var.f21481q);
                        serializedData.writeString(i6Var.f21479o);
                        if (i6Var.f21482r != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        serializedData.writeBool(z15);
                        if (i6Var.f21482r != null) {
                            serializedData.writeInt32(i6Var.f21484t);
                            i6Var.f21482r.serializeToStream(serializedData);
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
            edit.putInt("accent_current_" + j6Var.d, j6Var.V);
            edit.commit();
        } else {
            if (j6Var.W != -1) {
                if (z11) {
                    i6 i6Var2 = (i6) j6Var.X.get(j6Var.V);
                    j6Var.X.remove(i6Var2.f21467a);
                    j6Var.Y.remove(i6Var2);
                    TLRPC.TL_theme tL_theme = i6Var2.f21482r;
                    if (tL_theme != null) {
                        j6Var.Z.remove(tL_theme.f20980id);
                    }
                }
                j6Var.V = j6Var.W;
                i6 k10 = j6Var.k(false);
                if (k10 != null) {
                    j6Var.f21513f0 = k10.f21488y;
                } else {
                    j6Var.f21513f0 = null;
                }
            }
            if (I == j6Var) {
                n1(false, false);
            }
        }
        j6Var.W = -1;
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
                j6Var.f21503a = str;
                j6Var.C = tL_theme;
                j6Var.f21505b = file.getAbsolutePath();
                j6Var.B = UserConfig.selectedAccount;
                M = A0();
                O = true;
                P = false;
                t(j6Var, false, false);
                return j6Var;
            }
            if (tL_theme != null) {
                str2 = "remote" + tL_theme.f20980id;
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
                j6Var2.f21503a = str;
                j6Var2.B = UserConfig.selectedAccount;
                ArrayList arrayList = F;
                arrayList.add(j6Var2);
                G.add(j6Var2);
                Collections.sort(arrayList, new oh.k0(6));
            } else {
                hashMap.remove(str2);
            }
            j6Var2.C = tL_theme;
            j6Var2.f21505b = file2.getAbsolutePath();
            hashMap.put(j6Var2.m(), j6Var2);
            s1(true, false);
            t(j6Var2, true, false);
            return j6Var2;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static int u0(int i10) {
        return w0(null, i10, false);
    }

    public static void u1(int i10, int i11, boolean z10) {
        int i12 = f21930s8;
        int i13 = f21605a7;
        int i14 = Qd;
        int i15 = Pd;
        int i16 = Od;
        int i17 = Nd;
        if (i10 == i17 || i10 == i16 || i10 == i15 || i10 == i14 || i10 == f21659d6 || i10 == i13 || i10 == i12 || i10 == M8) {
            i11 |= -16777216;
        }
        if (z10) {
            rl.delete(i10);
        } else {
            rl.put(i10, i11);
        }
        if (i10 == Hc) {
            h(f21672e0);
        } else if (i10 != f21809lc && i10 != f21826mc) {
            if (i10 != i17 && i10 != i16 && i10 != i15 && i10 != i14 && i10 != Rd) {
                if (i10 == i12) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                        return;
                    }
                    return;
                } else if (i10 == i13 && Build.VERSION.SDK_INT >= 26) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    return;
                } else {
                    return;
                }
            }
            o1(true);
        } else {
            Drawable drawable = f21672e0;
            if (drawable != null) {
                i(drawable);
            }
        }
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

    public static int v0(int i10, g6 g6Var) {
        if (g6Var != null) {
            return g6Var.B0(i10);
        }
        return w0(null, i10, false);
    }

    public static void v1(Drawable drawable, int i10, boolean z10) {
        Drawable drawable2;
        if (!(drawable instanceof pq)) {
            return;
        }
        if (z10) {
            drawable2 = ((pq) drawable).f30166b;
        } else {
            drawable2 = ((pq) drawable).f30165a;
        }
        if (drawable2 instanceof ColorDrawable) {
            ((ColorDrawable) drawable2).setColor(i10);
        } else {
            drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
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
            return l1(f10, -1);
        }
        if (z11) {
            i11 = -3813931;
        } else {
            i11 = -1972501;
        }
        float[] M02 = M0(3);
        Color.colorToHSV(i10, M02);
        if (M02[1] > 0.02f) {
            return c(i11, i10);
        }
        return i11;
    }

    public static int w0(boolean[] r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.w0(boolean[], int, boolean):int");
    }

    public static void w1(int i10, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof nw0) {
            ((nw0) drawable).b(i10);
        } else if (drawable instanceof nc0) {
            ((nc0) drawable).a(i10);
        } else if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i10);
        } else if (drawable instanceof gm0) {
            ((gm0) drawable).b(i10);
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
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
            return l1(f10, -1);
        }
        if (z12) {
            i11 = -6380376;
        } else {
            i11 = -2565928;
        }
        float[] M02 = M0(3);
        Color.colorToHSV(i10, M02);
        if (z11 && M02[1] > 0.02f) {
            return c(i11, i10);
        }
        return i11;
    }

    public static d8 x0() {
        if (f21658d5 == null) {
            f21658d5 = new d8();
        }
        return f21658d5;
    }

    public static void x1(int i10, Drawable drawable) {
        w1(w0(null, i10, false), drawable);
    }

    public static int y(int i10, boolean z10, boolean z11) {
        float f10;
        if (z10 && z11) {
            return l1(0.07f, -1);
        }
        float[] M02 = M0(3);
        Color.colorToHSV(i10, M02);
        if (z10) {
            M02[2] = Math.min(1.0f, M02[2] + 0.07f);
            if (z11) {
                M02[1] = Math.min(1.0f, M02[1] + 0.02f);
            }
        } else {
            float f11 = M02[2];
            if (z11) {
                f10 = 0.06f;
            } else {
                f10 = 0.03f;
            }
            M02[2] = Math.max(0.0f, f11 - f10);
            if (z11) {
                float f12 = M02[1];
                if (f12 > 0.02f) {
                    M02[1] = Math.min(1.0f, f12 + 0.02f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), M02);
    }

    public static android.graphics.drawable.Drawable y0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.y0():android.graphics.drawable.Drawable");
    }

    public static void y1(Drawable drawable, int i10, boolean z10) {
        Drawable L02;
        if (drawable instanceof StateListDrawable) {
            try {
                if (z10) {
                    L02 = L0(0, drawable);
                } else {
                    L02 = L0(1, drawable);
                }
                if (L02 instanceof ShapeDrawable) {
                    ((ShapeDrawable) L02).getPaint().setColor(i10);
                } else {
                    L02.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static int z(int i10, boolean z10, boolean z11) {
        float f10 = 0.14f;
        if (z10 && z11) {
            return l1(0.14f, -1);
        }
        float[] M02 = M0(3);
        Color.colorToHSV(i10, M02);
        if (z10) {
            M02[2] = Math.min(1.0f, M02[2] + 0.14f);
            if (z11) {
                M02[1] = Math.min(1.0f, M02[1] + 0.03f);
            }
        } else {
            float f11 = M02[2];
            if (!z11) {
                f10 = 0.12f;
            }
            M02[2] = Math.max(0.0f, f11 - f10);
            if (z11) {
                float f12 = M02[1];
                if (f12 > 0.02f) {
                    M02[1] = Math.min(1.0f, f12 + 0.04f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i10), M02);
    }

    public static String z0() {
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

    public static void z1(org.telegram.ui.Cells.z zVar, float f10, float f11, float f12, float f13) {
        if (e2.c.s(zVar)) {
            int numberOfLayers = zVar.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable = zVar.getDrawable(i10);
                if (drawable instanceof h6) {
                    h6 h6Var = (h6) drawable;
                    float[] fArr = h6Var.f21443b;
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
                    h6Var.f21444c = true;
                    h6Var.invalidateSelf();
                    return;
                }
            }
        }
    }
}
