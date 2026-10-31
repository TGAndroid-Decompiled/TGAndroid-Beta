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
import org.telegram.messenger.b8;
import org.telegram.messenger.bk;
import org.telegram.messenger.cd;
import org.telegram.messenger.d00;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i9;
import org.telegram.messenger.jj;
import org.telegram.messenger.rh;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.ip;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.y41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c91;
import org.telegram.ui.un;
public abstract class t6 {
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
    public static int Am;
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
    public static final Paint Bm;
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
    public static final Paint Cm;
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
    public static final Paint Dm;
    public static TextPaint E0;
    public static int E1;
    public static TextPaint E2;
    public static qb0 E3;
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
    public static bi0 H1;
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
    public static s6 I;
    public static TextPaint I0;
    public static bi0 I1;
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
    public static s6 J;
    public static TextPaint J0;
    public static bi0 J1;
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
    public static s6 K;
    public static TextPaint K0;
    public static bi0 K1;
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
    public static final s6 L;
    public static TextPaint L0;
    public static bi0 L1;
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
    public static s6 M;
    public static TextPaint M0;
    public static bi0 M1;
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
    public static bi0 N1;
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
    public static bi0 O1;
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
    public static a9 V;
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
    public static qb0 X0;
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
    public static Matrix f20866a0;
    public static Drawable f20867a1;
    public static Paint a2;
    public static TextPaint f20868a3;
    public static Drawable f20869a4;
    public static final int f20871a6;
    public static final int f20872a7;
    public static final int f20873a8;
    public static final int f20874a9;
    public static final int f20875aa;
    public static final int f20876ab;
    public static final int f20877ac;
    public static final int f20878ad;
    public static final int f20879ae;
    public static final int f20880af;
    public static final int f20881ag;
    public static final int f20882ah;
    public static final int f20883ai;
    public static final int aj;
    public static final int ak;
    public static final int al;
    public static final HashMap am;
    public static boolean f20884b;
    public static int f20885b0;
    public static Drawable f20886b1;
    public static Paint f20887b2;
    public static TextPaint f20888b3;
    public static Drawable f20889b4;
    public static Drawable f20890b5;
    public static final int f20891b6;
    public static final int f20892b7;
    public static final int f20893b8;
    public static final int f20894b9;
    public static final int f20895ba;
    public static final int f20896bb;
    public static final int f20897bc;
    public static final int f20898bd;
    public static final int f20899be;
    public static final int bf;
    public static final int f20900bg;
    public static final int f20901bh;
    public static final int f20902bi;
    public static final int bj;
    public static final int bk;
    public static final int bl;
    public static final HashMap bm;
    public static int f20904c0;
    public static Drawable f20905c1;
    public static Paint f20906c2;
    public static TextPaint f20907c3;
    public static Drawable f20908c4;
    public static Drawable f20909c5;
    public static final int f20910c6;
    public static final int f20911c7;
    public static final int f20912c8;
    public static final int f20913c9;
    public static final int f20914ca;
    public static final int f20915cb;
    public static final int f20916cc;
    public static final int f20917cd;
    public static final int f20918ce;
    public static final int f20919cf;
    public static final int f20920cg;
    public static final int f20921ch;
    public static final int f20922ci;
    public static final int cj;
    public static final int ck;
    public static final int cl;
    public static final HashMap cm;
    public static rh d;
    public static int f20923d0;
    public static Drawable f20924d1;
    public static Paint f20925d2;
    public static TextPaint f20926d3;
    public static Drawable f20927d4;
    public static x7 f20928d5;
    public static final int f20929d6;
    public static final int f20930d7;
    public static final int f20931d8;
    public static final int f20932d9;
    public static final int f20933da;
    public static final int f20934db;
    public static final int f20935dc;
    public static final int f20936dd;
    public static final int f20937de;
    public static final int f20938df;
    public static final int f20939dg;
    public static final int f20940dh;
    public static final int f20941di;
    public static final int dj;
    public static final int dk;
    public static final int dl;
    public static final HashMap dm;
    public static SensorManager e;
    public static Drawable f20942e0;
    public static Drawable f20943e1;
    public static Paint f20944e2;
    public static TextPaint f20945e3;
    public static Drawable f20946e4;
    public static HashMap f20947e5;
    public static final int f20948e6;
    public static final int e7;
    public static final int f20949e8;
    public static final int f20950e9;
    public static final int f20951ea;
    public static final int eb;
    public static final int f20952ec;
    public static final int f20953ed;
    public static final int f20954ee;
    public static final int f20955ef;
    public static final int f20956eg;
    public static final int f20957eh;
    public static final int f20958ei;
    public static final int ej;
    public static final int ek;
    public static final int el;
    public static final int[] em;
    public static Sensor f20959f;
    public static Drawable f20960f0;
    public static Drawable f20961f1;
    public static Paint f20962f2;
    public static TextPaint f20963f3;
    public static Drawable f20964f4;
    public static final int f20965f5;
    public static final int f20966f6;
    public static final int f7;
    public static final int f20967f8;
    public static final int f20968f9;
    public static final int f20969fa;
    public static final int f20970fb;
    public static final int f20971fc;
    public static final int f20972fd;
    public static final int f20973fe;
    public static final int f20974ff;
    public static final int f20975fg;
    public static final int f20976fh;
    public static final int f20977fi;
    public static final int fj;
    public static final int fk;
    public static final int fl;
    public static final SparseIntArray fm;
    public static boolean f20978g;
    public static int f20979g0;
    public static kl0 f20980g1;
    public static Paint f20981g2;
    public static TextPaint f20982g3;
    public static Drawable f20983g4;
    public static final int f20984g5;
    public static final int f20985g6;
    public static final int f20986g7;
    public static final int f20987g8;
    public static final int f20988g9;
    public static final int f20989ga;
    public static final int gb;
    public static final int gc;
    public static final int f20990gd;
    public static final int f20991ge;
    public static final int f20992gf;
    public static final int f20993gg;
    public static final int f20994gh;
    public static final int f20995gi;
    public static final int gj;
    public static final int gk;
    public static final int gl;
    public static final HashSet gm;
    public static String f20996h0;
    public static kl0 f20997h1;
    public static Paint f20998h2;
    public static Drawable f20999h3;
    public static Drawable f21000h4;
    public static final int f21001h5;
    public static final int f21002h6;
    public static final int f21003h7;
    public static final int f21004h8;
    public static final int f21005h9;
    public static final int ha;
    public static final int f21006hb;
    public static final int f21007hc;
    public static final int f21008hd;
    public static final int he;
    public static final int f21009hf;
    public static final int f21010hg;
    public static final int f21011hh;
    public static final int f21012hi;
    public static final int hj;
    public static final int hk;
    public static final int hl;
    public static SparseIntArray hm;
    public static long f21013i;
    public static boolean f21014i0;
    public static Drawable f21015i1;
    public static Paint f21016i2;
    public static Drawable f21017i3;
    public static Drawable f21018i4;
    public static final int f21019i5;
    public static final int f21020i6;
    public static final int f21021i7;
    public static final int f21022i8;
    public static final int f21023i9;
    public static final int ia;
    public static final int f21024ib;
    public static final int f21025ic;
    public static final int f21026id;
    public static final int f21027ie;
    public static final int f21028ig;
    public static final int f21029ih;
    public static final int f21030ii;
    public static final int ij;
    public static final int ik;
    public static final int il;
    public static SparseIntArray im;
    public static boolean f21031j;
    public static boolean f21032j0;
    public static Drawable f21033j1;
    public static Paint f21034j2;
    public static Drawable f21035j3;
    public static Drawable f21036j4;
    public static final int f21037j5;
    public static final int f21038j6;
    public static final int f21039j7;
    public static final int f21040j8;
    public static final int f21041j9;
    public static final int f21042ja;
    public static final int f21043jb;
    public static final int f21044jc;
    public static final int f21045jd;
    public static final int f21046je;
    public static final int f21047jf;
    public static final int f21048jg;
    public static final int f21049jh;
    public static final int f21050ji;
    public static final int jj;
    public static final int jk;
    public static final int jl;
    public static SparseIntArray jm;
    public static boolean f21051k;
    public static Paint f21052k0;
    public static Drawable f21053k1;
    public static Paint f21054k2;
    public static jg.x0 f21055k3;
    public static Drawable f21056k4;
    public static final int f21057k5;
    public static final int f21058k6;
    public static final int f21059k7;
    public static final int f21060k8;
    public static final int f21061k9;
    public static final int f21062ka;
    public static final int f21063kb;
    public static final int f21064kc;
    public static final int f21065kd;
    public static final int f21066ke;
    public static final int f21067kf;
    public static final int f21068kg;
    public static final int f21069kh;
    public static final int f21070ki;
    public static final int kj;
    public static final int kk;
    public static final int kl;
    public static boolean km;
    public static Paint f21072l0;
    public static Drawable l1;
    public static Paint f21073l2;
    public static Drawable f21074l3;
    public static Drawable l4;
    public static final int f21075l5;
    public static final int f21076l6;
    public static final int f21077l7;
    public static final int f21078l8;
    public static final int f21079l9;
    public static final int f21080la;
    public static final int f21081lb;
    public static final int f21082lc;
    public static final int f21083ld;
    public static final int f21084le;
    public static final int f21085lf;
    public static final int f21086lg;
    public static final int f21087lh;
    public static final int f21088li;
    public static final int lj;
    public static final int lk;
    public static final int ll;
    public static final ThreadLocal lm;
    public static Paint m0;
    public static Drawable f21090m1;
    public static Paint f21091m2;
    public static c5 f21092m3;
    public static Drawable f21093m4;
    public static final int f21094m5;
    public static final int f21095m6;
    public static final int f21096m7;
    public static final int f21097m8;
    public static final int f21098m9;
    public static final int f21099ma;
    public static final int f21100mb;
    public static final int f21101mc;
    public static final int f21102md;
    public static final int f21103me;
    public static final int f21104mf;
    public static final int f21105mg;
    public static final int f21106mh;
    public static final int f21107mi;
    public static final int mj;
    public static final int mk;
    public static final int ml;
    public static final ThreadLocal mm;
    public static Paint f21109n0;
    public static Drawable f21110n1;
    public static Paint f21111n2;
    public static c5 f21112n3;
    public static Drawable f21113n4;
    public static final int f21114n5;
    public static final int f21115n6;
    public static final int f21116n7;
    public static final int f21117n8;
    public static final int f21118n9;
    public static final int f21119na;
    public static final int f21120nb;
    public static final int f21121nc;
    public static final int f21122nd;
    public static final int f21123ne;
    public static final int f21124nf;
    public static final int f21125ng;
    public static final int f21126nh;
    public static final int ni;
    public static final int nj;
    public static final int nk;
    public static final int nl;
    public static final ThreadLocal nm;
    public static int f21127o;
    public static Paint f21128o0;
    public static Drawable f21129o1;
    public static TextPaint f21130o2;
    public static c5 f21131o3;
    public static Drawable f21132o4;
    public static final int f21133o5;
    public static final int f21134o6;
    public static final int f21135o7;
    public static final int f21136o8;
    public static final int f21137o9;
    public static final int f21138oa;
    public static final int f21139ob;
    public static final int f21140oc;
    public static final int f21141od;
    public static final int f21142oe;
    public static final int f21143of;
    public static final int f21144og;
    public static final int f21145oh;
    public static final int oi;
    public static final int oj;
    public static final int ok;
    public static final int ol;
    public static final ThreadLocal om;
    public static boolean f21146p;
    public static Paint f21147p0;
    public static Drawable f21148p1;
    public static TextPaint f21149p2;
    public static c5 f21150p3;
    public static Drawable f21151p4;
    public static final int p5;
    public static final int f21152p6;
    public static final int f21153p7;
    public static final int[] f21154p8;
    public static final int p9;
    public static final int f21155pa;
    public static final int f21156pb;
    public static final int f21157pc;
    public static final int f21158pd;
    public static final int f21159pe;
    public static final int f21160pf;
    public static final int f21161pg;
    public static final int f21162ph;
    public static final int pi;
    public static final int pj;
    public static final int[] pk;
    public static final int pl;
    public static final ThreadLocal pm;
    public static float f21163q;
    public static Paint f21164q0;
    public static Drawable f21165q1;
    public static TextPaint f21166q2;
    public static c5 f21167q3;
    public static Drawable f21168q4;
    public static final int f21169q5;
    public static final int q6;
    public static final int f21170q7;
    public static final int[] f21171q8;
    public static final int f21172q9;
    public static final int f21173qa;
    public static final int f21174qb;
    public static final int qc;
    public static final int f21175qd;
    public static final int f21176qe;
    public static final int qf;
    public static final int f21177qg;
    public static final int f21178qh;
    public static final int qi;
    public static final int qj;
    public static final int qk;
    public static final int ql;
    public static d10 qm;
    public static int f21179r;
    public static Drawable f21181r1;
    public static TextPaint f21182r2;
    public static c5 f21183r3;
    public static Drawable f21184r4;
    public static final int f21185r5;
    public static final int f21186r6;
    public static final int f21187r7;
    public static final int[] f21188r8;
    public static final int f21189r9;
    public static final int f21190ra;
    public static final int f21191rb;
    public static final int rc;
    public static final int f21192rd;
    public static final int f21193re;
    public static final int f21194rf;
    public static final int f21195rg;
    public static final int f21196rh;
    public static final int ri;
    public static final int rj;
    public static final int rk;
    public static final int rl;
    public static li.k rm;
    public static int f21197s;
    public static Drawable f21198s0;
    public static Drawable f21199s1;
    public static TextPaint f21200s2;
    public static c5 f21201s3;
    public static Drawable f21202s4;
    public static final int f21203s5;
    public static final int f21204s6;
    public static final int f21205s7;
    public static final int f21206s8;
    public static final int f21207s9;
    public static final int f21208sa;
    public static final int f21209sb;
    public static final int f21210sc;
    public static final int f21211sd;
    public static final int f21212se;
    public static final int f21213sf;
    public static final int f21214sg;
    public static final int f21215sh;
    public static final int si;
    public static final int sj;
    public static final int sk;
    public static final int sl;
    public static Method sm;
    public static int f21216t;
    public static Paint f21217t0;
    public static Drawable f21218t1;
    public static TextPaint f21219t2;
    public static c5 f21220t3;
    public static Drawable f21221t4;
    public static final int f21222t5;
    public static final int f21223t6;
    public static final int f21224t7;
    public static final int f21225t8;
    public static final int f21226t9;
    public static final int f21227ta;
    public static final int f21228tb;
    public static final int f21229tc;
    public static final int f21230td;
    public static final int f21231te;
    public static final int f21232tf;
    public static final int f21233tg;
    public static final int f21234th;
    public static final int ti;
    public static final int tj;
    public static final int tk;
    public static final int tl;
    public static int tm;
    public static int f21235u;
    public static Paint f21236u0;
    public static bi0 f21237u1;
    public static TextPaint f21238u2;
    public static Drawable f21240u4;
    public static final int f21241u5;
    public static final int f21242u6;
    public static final int f21243u7;
    public static final int f21244u8;
    public static final int f21245u9;
    public static final int ua;
    public static final int f21246ub;
    public static final int f21247uc;
    public static final int f21248ud;
    public static final int f21249ue;
    public static final int f21250uf;
    public static final int f21251ug;
    public static final int f21252uh;
    public static final int ui;
    public static final int uj;
    public static final int uk;
    public static final int ul;
    public static float[] um;
    public static int v;
    public static Paint f21253v0;
    public static bi0 f21254v1;
    public static TextPaint f21255v2;
    public static PorterDuffColorFilter f21256v3;
    public static Drawable f21257v4;
    public static final int f21258v5;
    public static final int f21259v6;
    public static final int f21260v7;
    public static final int f21261v8;
    public static final int f21262v9;
    public static final int f21263va;
    public static final int f21264vb;
    public static final int vc;
    public static final int f21265vd;
    public static final int f21266ve;
    public static final int f21267vf;
    public static final int f21268vg;
    public static final int f21269vh;
    public static final int vi;
    public static final int vj;
    public static final int vk;
    public static final int[] vl;
    public static final z5 vm;
    public static String f21270w;
    public static Paint f21271w0;
    public static bi0 f21272w1;
    public static TextPaint f21273w2;
    public static PorterDuffColorFilter f21274w3;
    public static Drawable f21275w4;
    public static final int f21276w5;
    public static final int f21277w6;
    public static final int f21278w7;
    public static final int f21279w8;
    public static final int w9;
    public static final int f21280wa;
    public static final int f21281wb;
    public static final int f21282wc;
    public static final int f21283wd;
    public static final int f21284we;
    public static final int f21285wf;
    public static final int f21286wg;
    public static final int f21287wh;
    public static final int wi;
    public static final int wj;
    public static final int wk;
    public static final int wl;
    public static final int[] wm;
    public static double f21288x;
    public static Paint f21289x0;
    public static bi0 f21290x1;
    public static TextPaint f21291x2;
    public static gd0 f21292x3;
    public static Drawable f21293x4;
    public static final int f21294x5;
    public static final int f21295x6;
    public static final int f21296x7;
    public static final int f21297x8;
    public static final int f21298x9;
    public static final int f21299xa;
    public static final int xb;
    public static final int f21300xc;
    public static final int f21301xd;
    public static final int f21302xe;
    public static final int xf;
    public static final int f21303xg;
    public static final int f21304xh;
    public static final int xi;
    public static final int xj;
    public static final int xk;
    public static final int xl;
    public static WeakReference xm;
    public static double f21305y;
    public static Paint f21306y0;
    public static bi0 f21307y1;
    public static TextPaint[] f21308y2;
    public static Drawable y3;
    public static Drawable f21309y4;
    public static final int f21310y5;
    public static final int f21311y6;
    public static final int f21312y7;
    public static final int f21313y8;
    public static final int f21314y9;
    public static final int f21315ya;
    public static final int f21316yb;
    public static final int f21317yc;
    public static final int f21318yd;
    public static final int f21319ye;
    public static final int f21320yf;
    public static final int f21321yg;
    public static final int f21322yh;
    public static final int yi;
    public static final int yj;
    public static final int yk;
    public static final int yl;
    public static Bitmap ym;
    public static Paint f21324z0;
    public static bi0 f21325z1;
    public static TextPaint f21326z2;
    public static Drawable f21327z3;
    public static Drawable f21328z4;
    public static final int f21329z5;
    public static final int f21330z6;
    public static final int f21331z7;
    public static final int f21332z8;
    public static final int f21333z9;
    public static final int f21334za;
    public static final int zb;
    public static final int f21335zc;
    public static final int zd;
    public static final int f21336ze;
    public static final int f21337zf;
    public static final int f21338zg;
    public static final int f21339zh;
    public static final int zi;
    public static final int zj;
    public static final int zk;
    public static final int zl;
    public static int[] zm;
    public static final int f20865a = i0.b.o(-16777216, 27);
    public static final Object f20903c = new Object();
    public static float h = 1.0f;
    public static final androidx.emoji2.text.n f21071l = new androidx.emoji2.text.n(4);
    public static final androidx.emoji2.text.n f21089m = new androidx.emoji2.text.n(5);
    public static final int f21108n = 99;
    public static final Paint f21323z = new Paint(1);
    public static final boolean[] C = new boolean[4];
    public static final int[] D = new int[4];
    public static final long[] E = new long[4];
    public static final Drawable[] f21180r0 = new Drawable[25];
    public static final qv0[] f21239u3 = new qv0[6];
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
    public static final Path[] f20870a5 = new Path[3];

    static {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t6.<clinit>():void");
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

    public static x7 A0() {
        if (f20928d5 == null) {
            f20928d5 = new x7();
        }
        return f20928d5;
    }

    public static void A1(int i10, int i11, boolean z10) {
        int i12 = f21206s8;
        int i13 = f20872a7;
        int i14 = Ee;
        int i15 = De;
        int i16 = Ce;
        int i17 = Be;
        if (i10 == i17 || i10 == i16 || i10 == i15 || i10 == i14 || i10 == f20929d6 || i10 == i13 || i10 == i12 || i10 == M8) {
            i11 |= -16777216;
        }
        if (z10) {
            im.delete(i10);
        } else {
            im.put(i10, i11);
        }
        if (i10 == f21265vd) {
            h(f20942e0);
        } else if (i10 != Zc && i10 != f20878ad) {
            if (i10 != i17 && i10 != i16 && i10 != i15 && i10 != i14 && i10 != Fe) {
                int i18 = zs.f19681r4;
                if (i10 == i12) {
                    zs.e().k(i18, new Object[0]);
                    return;
                } else if (i10 == i13 && Build.VERSION.SDK_INT >= 26) {
                    zs.e().k(i18, new Object[0]);
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
        if (f21127o != 2) {
            if (f21051k) {
                f21051k = false;
                org.telegram.messenger.i0.r(f21089m);
            }
            if (f21031j) {
                f21031j = false;
                org.telegram.messenger.i0.r(f21071l);
            }
            if (f20978g) {
                h = 1.0f;
                e.unregisterListener(vm, f20959f);
                f20978g = false;
                if (org.telegram.messenger.v2.f18448a) {
                    f8.b("light sensor unregistered");
                }
            }
        }
    }

    public static android.graphics.drawable.Drawable B0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t6.B0():android.graphics.drawable.Drawable");
    }

    public static void B1(Drawable drawable, int i10, boolean z10) {
        Drawable drawable2;
        if (!(drawable instanceof eq)) {
            return;
        }
        if (z10) {
            drawable2 = ((eq) drawable).f25840b;
        } else {
            drawable2 = ((eq) drawable).f25839a;
        }
        if (drawable2 instanceof ColorDrawable) {
            ((ColorDrawable) drawable2).setColor(i10);
        } else {
            drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    public static int C(s6 s6Var, int i10, int i11) {
        int i12;
        if (i10 != 0 && (i12 = s6Var.X) != 0 && i10 != i12 && (!s6Var.S || s6Var.Y != f21108n)) {
            float[] P02 = P0(3);
            float[] P03 = P0(4);
            Color.colorToHSV(s6Var.X, P02);
            Color.colorToHSV(i10, P03);
            return E(P02, P03, i11, s6Var.q(), i11);
        }
        return i11;
    }

    public static String C0() {
        s6 s6Var = J;
        if (s6Var == null) {
            return "";
        }
        String n10 = s6Var.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            return n10.substring(0, n10.lastIndexOf(46));
        }
        return n10;
    }

    public static void C1(int i10, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof qv0) {
            ((qv0) drawable).b(i10);
        } else if (drawable instanceof qb0) {
            ((qb0) drawable).a(i10);
        } else if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i10);
        } else if (drawable instanceof kl0) {
            ((kl0) drawable).b(i10);
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

    public static s6 D0() {
        s6 s6Var = K;
        if (s6Var != null) {
            return s6Var;
        }
        return L;
    }

    public static void D1(int i10, Drawable drawable) {
        C1(x0(null, i10, false), drawable);
    }

    public static int E(float[] fArr, float[] fArr2, int i10, boolean z10, int i11) {
        int min;
        int min2;
        if (um == null) {
            um = new float[3];
        }
        float[] fArr3 = um;
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
        float B10 = org.telegram.messenger.i0.B(i10);
        float B11 = org.telegram.messenger.i0.B(HSVToColor);
        if (z10) {
            if (B10 <= B11) {
                return HSVToColor;
            }
        } else if (B10 >= B11) {
            return HSVToColor;
        }
        float A10 = a1.g.A(0.39999998f, B10, B11, 0.6f);
        int red = (int) (Color.red(HSVToColor) * A10);
        int green = (int) (Color.green(HSVToColor) * A10);
        int blue = (int) (Color.blue(HSVToColor) * A10);
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
        int indexOfKey = hm.indexOfKey(i10);
        if (indexOfKey < 0) {
            return 0;
        }
        int valueAt = hm.valueAt(indexOfKey);
        r6 k10 = I.k(false);
        if (k10 == null) {
            return 0;
        }
        float[] P02 = P0(1);
        float[] P03 = P0(2);
        Color.colorToHSV(I.X, P02);
        Color.colorToHSV(k10.f20732c, P03);
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
                if (f21051k) {
                    f21051k = false;
                    org.telegram.messenger.i0.r(f21089m);
                }
                if (f21031j) {
                    f21031j = false;
                    org.telegram.messenger.i0.r(f21071l);
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
                f21013i = 0L;
            }
        }
    }

    public static int F0(int i10) {
        int i11 = em[i10];
        if (i11 == 0) {
            int i12 = fm.get(i10, -1);
            if (i12 != -1) {
                return F0(i12);
            }
            if ((i10 < f21120nb || i10 >= f21246ub) && i10 != D9 && i10 != N9 && i10 != E9 && i10 != De && i10 != Ee) {
                return -65536;
            }
            return 0;
        }
        return i11;
    }

    public static void F1(org.telegram.ui.Cells.y yVar, float f10, float f11, float f12, float f13) {
        if (c3.i0.t(yVar)) {
            int numberOfLayers = yVar.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable = yVar.getDrawable(i10);
                if (drawable instanceof q6) {
                    q6 q6Var = (q6) drawable;
                    float[] fArr = q6Var.f20705b;
                    float L10 = org.telegram.messenger.i0.L(f10);
                    fArr[1] = L10;
                    fArr[0] = L10;
                    float L11 = org.telegram.messenger.i0.L(f11);
                    fArr[3] = L11;
                    fArr[2] = L11;
                    float L12 = org.telegram.messenger.i0.L(f12);
                    fArr[5] = L12;
                    fArr[4] = L12;
                    float L13 = org.telegram.messenger.i0.L(f13);
                    fArr[7] = L13;
                    fArr[6] = L13;
                    q6Var.f20706c = true;
                    q6Var.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static void G(boolean z10) {
        s6 s6Var;
        int i10;
        if (A == 0) {
            if (z10 || Math.abs((System.currentTimeMillis() / 1000) - B) >= 3600) {
                for (int i11 = 0; i11 < 2; i11++) {
                    if (i11 == 0) {
                        s6Var = K;
                    } else {
                        s6Var = J;
                    }
                    if (s6Var != null && d20.i(s6Var.E).p()) {
                        r6 k10 = s6Var.k(false);
                        TLRPC.TL_theme tL_theme = s6Var.F;
                        if (tL_theme != null) {
                            i10 = s6Var.E;
                        } else if (k10 != null && (tL_theme = k10.f20744r) != null) {
                            i10 = d20.f15147s0;
                        }
                        if (tL_theme.document != null) {
                            A++;
                            TL_account.getTheme gettheme = new TL_account.getTheme();
                            gettheme.document_id = tL_theme.document.f19799id;
                            gettheme.format = "android";
                            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                            tL_inputTheme.access_hash = tL_theme.access_hash;
                            tL_inputTheme.f19864id = tL_theme.f19932id;
                            gettheme.theme = tL_inputTheme;
                            ConnectionsManager.getInstance(i10).sendRequest(gettheme, new ag.p0(k10, s6Var, tL_theme, 8));
                        }
                    }
                }
            }
        }
    }

    public static d10 G0() {
        if (qm == null) {
            ?? obj = new Object();
            obj.f25246a = new c10[4];
            obj.f25253k = 1.0f;
            obj.f25254l = new ArrayList();
            obj.f25255m = new Paint(1);
            obj.f25256n = new Path();
            for (int i10 = 0; i10 < 4; i10++) {
                obj.f25246a[i10] = new c10(i10);
            }
            qm = obj;
        }
        return qm;
    }

    public static void G1(org.telegram.ui.Cells.y yVar, int i10, int i11) {
        if (c3.i0.t(yVar)) {
            int numberOfLayers = yVar.getNumberOfLayers();
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                Drawable drawable = yVar.getDrawable(i12);
                if (drawable instanceof q6) {
                    q6 q6Var = (q6) drawable;
                    float f10 = i10;
                    float f11 = i11;
                    float[] fArr = q6Var.f20705b;
                    float L10 = org.telegram.messenger.i0.L(f10);
                    fArr[3] = L10;
                    fArr[2] = L10;
                    fArr[1] = L10;
                    fArr[0] = L10;
                    float L11 = org.telegram.messenger.i0.L(f11);
                    fArr[7] = L11;
                    fArr[6] = L11;
                    fArr[5] = L11;
                    fArr[4] = L11;
                    q6Var.f20706c = true;
                    q6Var.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static void H(SparseIntArray sparseIntArray, s6 s6Var) {
        if (s6Var != null && s6Var.f20814j0 == -1) {
            int i10 = f20929d6;
            if (i0.b.h(i0.b.f(0.5f, I0(sparseIntArray, i10), I0(sparseIntArray, i10))) < 0.5d) {
                s6Var.f20814j0 = 1;
            } else {
                s6Var.f20814j0 = 0;
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

    public static bh.d I(s6 s6Var, SparseIntArray sparseIntArray, String str, int i10, boolean z10) {
        boolean z11;
        File file;
        boolean z12;
        float f10;
        float f11;
        if (s6Var.S && s6Var.Y == f21108n) {
            z11 = true;
        } else {
            z11 = false;
        }
        r6 k10 = s6Var.k(false);
        if (k10 != null) {
            file = k10.e();
        } else {
            file = null;
        }
        if (k10 != null && k10.f20743q) {
            z12 = true;
        } else {
            z12 = false;
        }
        m6 m6Var = s6Var.f20813i0;
        if (m6Var != null) {
            f11 = m6Var.f20595k;
        } else if (k10 != null) {
            f11 = k10.f20742p;
        } else {
            f10 = s6Var.D;
            return J(s6Var, m6Var, sparseIntArray, file, str, hm.get(f20984g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
        }
        f10 = f11 * 100.0f;
        return J(s6Var, m6Var, sparseIntArray, file, str, hm.get(f20984g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
    }

    public static int I0(SparseIntArray sparseIntArray, int i10) {
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return em[i10];
    }

    public static void I1(s6 s6Var, r6 r6Var, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
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
                if (s6Var == null) {
                    String r02 = r0(themeSettings);
                    if (r02 != null && (s6Var = (s6) hashMap.get(r02)) != null) {
                        r6Var = (r6) s6Var.f20806c0.get(tL_theme.f19932id);
                    } else {
                        return;
                    }
                }
                if (r6Var != null) {
                    TLRPC.TL_theme tL_theme2 = r6Var.f20744r;
                    if (tL_theme2 != null) {
                        s6Var.f20806c0.remove(tL_theme2.f19932id);
                    }
                    r6Var.f20744r = tL_theme;
                    r6Var.f20746t = i10;
                    s6Var.f20806c0.put(tL_theme.f19932id, r6Var);
                    if (!s6.a(r6Var, themeSettings)) {
                        File e10 = r6Var.e();
                        if (e10 != null) {
                            e10.delete();
                        }
                        s6.i(r6Var, themeSettings);
                        s6 s6Var2 = I;
                        if (s6Var2 == s6Var && s6Var2.Y == r6Var.f20730a) {
                            t1(false, false);
                            s6 s6Var3 = I;
                            if (J == s6Var3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            K1(s6Var3, z12, -1, null);
                        }
                        o6.a(true);
                    }
                    TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                    if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.motion) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r6Var.f20743q = z11;
                    s6Var.T = false;
                } else {
                    return;
                }
            } else {
                if (s6Var != null) {
                    str = s6Var.m();
                    hashMap.remove(str);
                } else {
                    str = "remote" + tL_theme.f19932id;
                    s6Var = (s6) hashMap.get(str);
                }
                if (s6Var == null) {
                    return;
                }
                s6Var.F = tL_theme;
                s6Var.f20801a = tL_theme.title;
                File file = new File(s6Var.f20803b);
                File file2 = new File(org.telegram.messenger.w0.h(), sc.e.A(str, ".attheme"));
                if (!file.equals(file2)) {
                    try {
                        org.telegram.messenger.i0.E(file, file2);
                        s6Var.f20803b = file2.getAbsolutePath();
                    } catch (Exception e11) {
                        f8.g(e11, true);
                    }
                }
                if (z10) {
                    s6Var.G = false;
                    s6Var.f20811g0 = null;
                    s6Var.f20812h0 = null;
                    zs.f(s6Var.E).b(s6Var, zs.Y1);
                    zs.f(s6Var.E).b(s6Var, zs.Z1);
                    b8 G10 = b8.G(s6Var.E);
                    TLRPC.TL_theme tL_theme3 = s6Var.F;
                    G10.X(tL_theme3.document, tL_theme3, 1, 1);
                } else {
                    s6Var.T = false;
                }
                hashMap.put(s6Var.m(), s6Var);
            }
            y1(true, false);
        }
    }

    public static bh.d J(org.telegram.ui.ActionBar.s6 r23, org.telegram.ui.ActionBar.m6 r24, android.util.SparseIntArray r25, java.io.File r26, java.lang.String r27, int r28, int r29, int r30, boolean r31, boolean r32, boolean r33, boolean r34, org.telegram.tgnet.TLRPC.Document r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t6.J(org.telegram.ui.ActionBar.s6, org.telegram.ui.ActionBar.m6, android.util.SparseIntArray, java.io.File, java.lang.String, int, int, int, boolean, boolean, boolean, boolean, org.telegram.tgnet.TLRPC$Document, boolean):bh.d");
    }

    public static org.telegram.ui.Cells.y J0(int i10, int i11) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i11 & 16777215) | 419430400}), null, d0(i10, -1));
    }

    public static void J1(s6 s6Var) {
        Collections.sort(s6Var.f20804b0, new bk(28));
    }

    public static void K(Context context, boolean z10) {
        float f10;
        float f11;
        float f12;
        TextPaint textPaint;
        float f13;
        Drawable[] drawableArr;
        P();
        if (!z10 && f21092m3 == null) {
            Resources resources = context.getResources();
            f20999h3 = resources.getDrawable(2131232794);
            f21074l3 = resources.getDrawable(2131231746).mutate();
            f21092m3 = new c5(0, false, false, null);
            f21112n3 = new c5(0, false, true, null);
            f21131o3 = new c5(0, true, false, null);
            f21150p3 = new c5(0, true, true, null);
            f21167q3 = new c5(1, false, false, null);
            f21183r3 = new c5(1, false, true, null);
            f21201s3 = new c5(1, true, false, null);
            f21220t3 = new c5(1, true, true, null);
            ?? obj = new Object();
            obj.f26357a = new Path();
            obj.f26358b = -1.0f;
            obj.f26361g = new ArrayList();
            obj.f26359c = 0.293f;
            obj.d = -26.0f;
            obj.e = -28.0f;
            obj.f26360f = 1.0f;
            f21292x3 = obj;
            obj.a("M 34.141 16.042 C 37.384 17.921 40.886 20.001 44.211 21.965 C 46.139 23.104 49.285 24.729 49.586 25.917 C 50.289 28.687 48.484 30 46.274 30 L 6 30.021 C 3.79 30.021 2.075 30.023 2 26.021 L 2.009 3.417 C 2.009 0.417 5.326 -0.58 7.068 0.417 C 10.545 2.406 25.024 10.761 34.141 16.042 Z", 166.0f);
            f21292x3.a("M 37.843 17.769 C 41.143 19.508 44.131 21.164 47.429 23.117 C 48.542 23.775 49.623 24.561 49.761 25.993 C 50.074 28.708 48.557 30 46.347 30 L 6 30.012 C 3.79 30.012 2 28.222 2 26.012 L 2.009 4.609 C 2.009 1.626 5.276 0.664 7.074 1.541 C 10.608 3.309 28.488 12.842 37.843 17.769 Z", 200.0f);
            f21292x3.a("M 40.644 18.756 C 43.986 20.389 49.867 23.108 49.884 25.534 C 49.897 27.154 49.88 24.441 49.894 26.059 C 49.911 28.733 48.6 30 46.39 30 L 6 30.013 C 3.79 30.013 2 28.223 2 26.013 L 2.008 5.52 C 2.008 2.55 5.237 1.614 7.079 2.401 C 10.656 4 31.106 14.097 40.644 18.756 Z", 217.0f);
            f21292x3.a("M 43.782 19.218 C 47.117 20.675 50.075 21.538 50.041 24.796 C 50.022 26.606 50.038 24.309 50.039 26.104 C 50.038 28.736 48.663 30 46.453 30 L 6 29.986 C 3.79 29.986 2 28.196 2 25.986 L 2.008 6.491 C 2.008 3.535 5.196 2.627 7.085 3.316 C 10.708 4.731 33.992 14.944 43.782 19.218 Z", 234.0f);
            f21292x3.a("M 47.421 16.941 C 50.544 18.191 50.783 19.91 50.769 22.706 C 50.761 24.484 50.76 23.953 50.79 26.073 C 50.814 27.835 49.334 30 47.124 30 L 5 30.01 C 2.79 30.01 1 28.22 1 26.01 L 1.001 10.823 C 1.001 8.218 3.532 6.895 5.572 7.26 C 7.493 8.01 47.421 16.941 47.421 16.941 Z", 267.0f);
            f21292x3.a("M 47.641 17.125 C 50.641 18.207 51.09 19.935 51.078 22.653 C 51.07 24.191 51.062 21.23 51.088 23.063 C 51.109 24.886 49.587 27 47.377 27 L 5 27.009 C 2.79 27.009 1 25.219 1 23.009 L 0.983 11.459 C 0.983 8.908 3.414 7.522 5.476 7.838 C 7.138 8.486 47.641 17.125 47.641 17.125 Z", 300.0f);
            f21292x3.a("M 48 7 C 50.21 7 52 8.79 52 11 C 52 19 52 19 52 19 C 52 21.21 50.21 23 48 23 L 4 23 C 1.79 23 0 21.21 0 19 L 0 11 C 0 8.79 1.79 7 4 7 C 48 7 48 7 48 7 Z", 383.0f);
            y3 = resources.getDrawable(2131232090).mutate();
            f21327z3 = resources.getDrawable(2131232090).mutate();
            A3 = resources.getDrawable(2131232090).mutate();
            B3 = resources.getDrawable(2131232090).mutate();
            F3 = resources.getDrawable(2131232090).mutate();
            H3 = resources.getDrawable(2131232090).mutate();
            C3 = resources.getDrawable(2131232176).mutate();
            D3 = resources.getDrawable(2131232176).mutate();
            G3 = resources.getDrawable(2131232177).mutate();
            I3 = resources.getDrawable(2131232177).mutate();
            E3 = new qb0();
            L3 = resources.getDrawable(2131231311).mutate();
            M3 = resources.getDrawable(2131232423).mutate();
            N3 = resources.getDrawable(2131232423).mutate();
            O3 = resources.getDrawable(2131232423).mutate();
            P3 = resources.getDrawable(2131232423).mutate();
            Q3 = resources.getDrawable(2131232331).mutate();
            R3 = resources.getDrawable(2131232331).mutate();
            S3 = resources.getDrawable(2131232331).mutate();
            T3 = resources.getDrawable(2131232331).mutate();
            U3 = resources.getDrawable(2131232295).mutate();
            V3 = resources.getDrawable(2131232295).mutate();
            W3 = resources.getDrawable(2131232295).mutate();
            X3 = resources.getDrawable(2131232295).mutate();
            Z3 = resources.getDrawable(2131232295).mutate();
            Y3 = resources.getDrawable(2131232295).mutate();
            f20869a4 = resources.getDrawable(2131232423).mutate();
            f20889b4 = resources.getDrawable(2131232331).mutate();
            J3 = resources.getDrawable(2131232423).mutate();
            K3 = resources.getDrawable(2131232331).mutate();
            f20908c4 = resources.getDrawable(2131232040).mutate();
            f20927d4 = resources.getDrawable(2131232040).mutate();
            f20946e4 = resources.getDrawable(2131232040).mutate();
            f20964f4 = resources.getDrawable(2131232040).mutate();
            f20983g4 = resources.getDrawable(2131232792);
            f21000h4 = resources.getDrawable(2131232189).mutate();
            f21018i4 = resources.getDrawable(2131232189).mutate();
            f21036j4 = resources.getDrawable(2131232435);
            f21056k4 = resources.getDrawable(2131231626).mutate();
            l4 = resources.getDrawable(2131231311);
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
                K4[i10] = resources.getDrawable(2131232559).mutate();
                L4[i10] = resources.getDrawable(2131232560).mutate();
                drawableArr[i10] = resources.getDrawable(2131232121).mutate();
                N4[i10] = resources.getDrawable(2131232316).mutate();
                i10++;
            }
            V4 = resources.getDrawable(2131231934).mutate();
            W4 = resources.getDrawable(2131231934).mutate();
            X4 = resources.getDrawable(2131231932).mutate();
            Y4 = resources.getDrawable(2131231932).mutate();
            f21093m4 = resources.getDrawable(2131230893);
            f21113n4 = resources.getDrawable(2131230898);
            f21132o4 = resources.getDrawable(2131230897);
            f21257v4 = resources.getDrawable(2131230896);
            f21293x4 = resources.getDrawable(2131230895);
            f21275w4 = resources.getDrawable(2131230892);
            f21309y4 = resources.getDrawable(2131230899);
            f21328z4 = resources.getDrawable(2131230894);
            A4 = resources.getDrawable(2131232512);
            B4 = resources.getDrawable(2131232252);
            C4 = resources.getDrawable(2131232253);
            D4 = resources.getDrawable(2131232058);
            E4 = resources.getDrawable(2131231227);
            F4 = resources.getDrawable(2131231228);
            f21151p4 = resources.getDrawable(2131231238).mutate();
            R4 = resources.getDrawable(2131232450);
            f21168q4 = resources.getDrawable(2131231088).mutate();
            f21184r4 = resources.getDrawable(2131231087);
            f21202s4 = resources.getDrawable(2131232433).mutate();
            f21221t4 = resources.getDrawable(2131231748).mutate();
            f21240u4 = resources.getDrawable(2131231133);
            int L10 = org.telegram.messenger.i0.L(2.0f);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = Z4;
            pathArr[0] = path;
            f10 = 1.0f;
            path.moveTo(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(3.0f));
            pathArr[0].lineTo(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(3.0f));
            pathArr[0].lineTo(org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(10.0f));
            pathArr[0].lineTo(org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(20.0f));
            int i11 = L10 * 2;
            f11 = 14.0f;
            f12 = 3.0f;
            rectF.set(org.telegram.messenger.i0.L(21.0f) - i11, org.telegram.messenger.i0.L(19.0f) - L10, org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(19.0f) + L10);
            pathArr[0].arcTo(rectF, 0.0f, 90.0f, false);
            pathArr[0].lineTo(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(21.0f));
            rectF.set(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(19.0f) - L10, org.telegram.messenger.i0.L(5.0f) + i11, org.telegram.messenger.i0.L(19.0f) + L10);
            pathArr[0].arcTo(rectF, 90.0f, 90.0f, false);
            pathArr[0].lineTo(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(4.0f));
            rectF.set(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(5.0f) + i11, org.telegram.messenger.i0.L(3.0f) + i11);
            pathArr[0].arcTo(rectF, 180.0f, 90.0f, false);
            pathArr[0].close();
            Path path2 = new Path();
            pathArr[1] = path2;
            path2.moveTo(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(5.0f));
            pathArr[1].lineTo(org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(10.0f));
            pathArr[1].lineTo(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(10.0f));
            pathArr[1].close();
            f20890b5 = resources.getDrawable(2131231108).mutate();
            f20909c5 = resources.getDrawable(2131232344).mutate();
            Drawable[][] drawableArr6 = U4;
            drawableArr6[0][0] = N(org.telegram.messenger.i0.L(44.0f), 2131232347);
            drawableArr6[0][1] = N(org.telegram.messenger.i0.L(44.0f), 2131232347);
            drawableArr6[1][0] = N(org.telegram.messenger.i0.L(44.0f), 2131232346);
            drawableArr6[1][1] = N(org.telegram.messenger.i0.L(44.0f), 2131232346);
            drawableArr6[2][0] = N(org.telegram.messenger.i0.L(44.0f), 2131232345);
            drawableArr6[2][1] = N(org.telegram.messenger.i0.L(44.0f), 2131232345);
            drawableArr6[3][0] = N(org.telegram.messenger.i0.L(44.0f), 2131232343);
            drawableArr6[3][1] = N(org.telegram.messenger.i0.L(44.0f), 2131232343);
            drawableArr6[4][0] = N(org.telegram.messenger.i0.L(44.0f), 2131232342);
            drawableArr6[4][1] = N(org.telegram.messenger.i0.L(44.0f), 2131232342);
            eq N10 = N(org.telegram.messenger.i0.L(44.0f), 2131232097);
            Drawable[] drawableArr7 = T4;
            drawableArr7[0] = N10;
            drawableArr7[1] = N(org.telegram.messenger.i0.L(44.0f), 2131232097);
            Drawable mutate5 = resources.getDrawable(2131232208).mutate();
            Drawable[] drawableArr8 = S4;
            drawableArr8[0] = mutate5;
            drawableArr8[1] = resources.getDrawable(2131232208).mutate();
            f21017i3 = i0.a.f(context, 2131231030);
            f21035j3 = i0.a.f(context, 2131232725);
            jg.x0 x0Var = new jg.x0();
            Paint paint = new Paint(1);
            x0Var.f10355b = paint;
            paint.setShadowLayer(org.telegram.messenger.i0.L(4.0f), 0.0f, 0.0f, 1593835520);
            f21055k3 = x0Var;
            am.clear();
            bm.clear();
            Drawable drawable = f21293x4;
            int i12 = Yc;
            d("drawableBotInline", drawable, i12);
            d("drawableBotWebView", f21309y4, i12);
            d("drawableBotLock", A4, i12);
            d("drawableBotLink", f21257v4, i12);
            d("drawable_botInvite", f21328z4, i12);
            d("drawableGoIcon", f21240u4, i12);
            d("drawableCommentSticker", C4, i12);
            d("drawableMsgError", f21036j4, f21248ud);
            d("drawableMsgIn", f21092m3, -1);
            d("drawableMsgInSelected", f21112n3, -1);
            d("drawableMsgInMedia", f21167q3, -1);
            d("drawableMsgInMediaSelected", f21183r3, -1);
            d("drawableMsgInInstant", f21000h4, f21192rd);
            d("drawableMsgOut", f21131o3, -1);
            d("drawableMsgOutSelected", f21150p3, -1);
            d("drawableMsgOutMedia", f21201s3, -1);
            d("drawableMsgOutMediaSelected", f21220t3, -1);
            Drawable drawable2 = drawableArr4[0];
            int i13 = Jb;
            d("drawableMsgOutCallAudio", drawable2, i13);
            Drawable drawable3 = drawableArr5[0];
            int i14 = Kb;
            d("drawableMsgOutCallAudioSelected", drawable3, i14);
            d("drawableMsgOutCallVideo", drawableArr4[1], i13);
            d("drawableMsgOutCallVideo", drawableArr5[1], i14);
            d("drawableMsgOutCheck", y3, xb);
            d("drawableMsgOutCheckSelected", f21327z3, f21316yb);
            Drawable drawable4 = A3;
            int i15 = zb;
            d("drawableMsgOutCheckRead", drawable4, i15);
            Drawable drawable5 = B3;
            int i16 = Ab;
            d("drawableMsgOutCheckReadSelected", drawable5, i16);
            d("drawableMsgOutHalfCheck", C3, i15);
            d("drawableMsgOutHalfCheckSelected", D3, i16);
            d("drawableMsgOutInstant", f21018i4, i13);
            d("drawableMsgOutMenu", f20946e4, Hb);
            d("drawableMsgOutMenuSelected", f20964f4, Ib);
            Drawable drawable6 = W3;
            int i17 = Fb;
            d("drawableMsgOutPinned", drawable6, i17);
            Drawable drawable7 = X3;
            int i18 = Gb;
            d("drawableMsgOutPinnedSelected", drawable7, i18);
            d("drawableMsgOutReplies", S3, i17);
            d("drawableMsgOutReplies", T3, i18);
            d("drawableMsgOutViews", O3, i17);
            d("drawableMsgOutViewsSelected", P3, i18);
            Drawable drawable8 = H3;
            int i19 = Wc;
            d("drawableMsgStickerCheck", drawable8, i19);
            d("drawableMsgStickerHalfCheck", I3, i19);
            d("drawableMsgStickerPinned", Y3, i19);
            d("drawableMsgStickerReplies", K3, i19);
            d("drawableMsgStickerViews", J3, i19);
            d("drawableReplyIcon", f21184r4, i12);
            d("drawableCloseIcon", f21202s4, i12);
            d("drawableMoreIcon", f21221t4, i12);
            d("drawableShareIcon", f21168q4, i12);
            d("drawableMuteIcon", f21056k4, f20917cd);
            d("drawableLockIcon", l4, f20936dd);
            d("drawable_chat_pollHintDrawableOut", drawableArr[1], Lb);
            d("drawable_chat_pollHintDrawableIn", drawableArr[0], f21318yd);
            k(z10, false);
        } else {
            f10 = 1.0f;
            f11 = 14.0f;
            f12 = 3.0f;
        }
        if (!z10 && (textPaint = C2) != null) {
            textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
            D2.setTextSize(org.telegram.messenger.i0.L(12.0f));
            E2.setTextSize(org.telegram.messenger.i0.L(11.0f));
            G2.setTextSize(org.telegram.messenger.i0.L(15.0f));
            H2.setTextSize(org.telegram.messenger.i0.L(15.0f));
            I2.setTextSize(org.telegram.messenger.i0.L(13.0f));
            N2.setTextSize(org.telegram.messenger.i0.L(12.0f));
            F2.setTextSize(org.telegram.messenger.i0.L(12.0f));
            O2.setTextSize(org.telegram.messenger.i0.L(16.0f));
            P2.setTextSize(org.telegram.messenger.i0.L(15.0f));
            Q2.setTextSize(org.telegram.messenger.i0.L(15.0f));
            R2.setTextSize(org.telegram.messenger.i0.L(15.0f));
            S2.setTextSize(org.telegram.messenger.i0.L(13.0f));
            J2.setTextSize(org.telegram.messenger.i0.L(12.0f));
            W2.setTextSize(org.telegram.messenger.i0.L(f13));
            Y2.setTextSize(org.telegram.messenger.i0.L(f13));
            Z2.setTextSize(org.telegram.messenger.i0.L(f13));
            float f14 = (((tz.W0 * 2) + 10) / f12) - f10;
            f20926d3.setTextSize(org.telegram.messenger.i0.L(f14));
            X2.setTextSize(org.telegram.messenger.i0.L(f13));
            U2.setTextSize(org.telegram.messenger.i0.L(f14));
            V2.setTextSize(org.telegram.messenger.i0.L(12.0f));
            T2.setTextSize(org.telegram.messenger.i0.L(12.0f));
            K2.setTextSize(org.telegram.messenger.i0.L(13.0f));
            L2.setTextSize(org.telegram.messenger.i0.L(13.0f));
            M2.setTextSize(org.telegram.messenger.i0.L(13.0f));
            X1.setStrokeWidth(org.telegram.messenger.i0.L(f10));
            Z1.setStrokeWidth(org.telegram.messenger.i0.L(1.1f));
            f21200s2.setTextSize(org.telegram.messenger.i0.L(Math.max(16, tz.W0) - 2));
            f21219t2.setTextSize(org.telegram.messenger.i0.L(Math.max(16, tz.W0) - 2));
            f21238u2.setTextSize(org.telegram.messenger.i0.L(Math.max(16, tz.W0) - 3));
            f21255v2.setTextSize(org.telegram.messenger.i0.L(Math.max(16, tz.W0)));
            f20963f3.setTextSize(org.telegram.messenger.i0.L(15.0f));
            f20982g3.setTextSize(org.telegram.messenger.i0.L(13.0f));
            f21054k2.setStrokeWidth(org.telegram.messenger.i0.L(f12));
            f21073l2.setStrokeWidth(org.telegram.messenger.i0.L(2.33f));
            f20945e3.setTextSize(org.telegram.messenger.i0.L(f11));
            f20945e3.setTypeface(org.telegram.messenger.i0.o());
        }
    }

    public static String K0() {
        m6 m6Var = I.f20813i0;
        if (m6Var != null) {
            return m6Var.f20590c;
        }
        if (g1()) {
            return "t";
        }
        return "d";
    }

    public static void K1(s6 s6Var, boolean z10, int i10, View view) {
        int[] iArr = new int[2];
        if (view != null && view.isAttachedToWindow()) {
            view.getLocationInWindow(iArr);
            iArr[0] = (view.getMeasuredWidth() / 2) + iArr[0];
            iArr[1] = (view.getMeasuredHeight() / 2) + iArr[1];
        } else {
            iArr[0] = org.telegram.messenger.i0.f16026q.x / 2;
            iArr[1] = 0;
        }
        zs.e().k(zs.f19695t4, s6Var, Boolean.valueOf(z10), iArr, Integer.valueOf(i10), Boolean.TRUE, null);
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

    public static org.telegram.ui.Cells.y L0(int i10, int i11, p6 p6Var) {
        if (i11 >= 0) {
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), new ColorDrawable(w0(i11, p6Var)), new ColorDrawable(-1));
        }
        return h0(i10, 2, -1);
    }

    public static int L1(SparseIntArray sparseIntArray) {
        int i10 = f21209sb;
        int i11 = f21228tb;
        int i12 = f21139ob;
        int[] iArr = {i12, f21191rb, i10, i11};
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = iArr[i17];
            if (i18 == i12 || sparseIntArray.indexOfKey(i18) >= 0) {
                int i19 = sparseIntArray.get(i18, em[i18]);
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

    public static org.telegram.ui.Cells.y M0(p6 p6Var, boolean z10) {
        int w02 = w0(f21020i6, p6Var);
        if (z10) {
            return L0(w02, f20929d6, p6Var);
        }
        return h0(w02, 2, -1);
    }

    public static void M1(k2 k2Var) {
        String L02;
        if (f21127o != 0) {
            if (k2Var != null) {
                try {
                    cc a02 = cc.a0(k2Var);
                    if (f21127o == 3) {
                        L02 = cd.L0(2131753785, "AutoNightSystemModeOff");
                    } else {
                        L02 = cd.L0(2131753790, "AutoNightModeOff");
                    }
                    a02.J(2131623938, L02, cd.L0(2131745512, "Settings"), 5000, false, new w5(k2Var, 1)).j();
                } catch (Exception e10) {
                    f8.g(e10, true);
                }
            }
            f21127o = 0;
            w1();
            B();
        }
    }

    public static eq N(int i10, int i11) {
        Drawable drawable;
        if (i11 != 0) {
            drawable = i0.a.f(org.telegram.messenger.w0.f19025b, i11);
        } else {
            drawable = null;
        }
        OvalShape ovalShape = new OvalShape();
        float f10 = i10;
        ovalShape.resize(f10, f10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(-1);
        eq eqVar = new eq(shapeDrawable, drawable);
        eqVar.h = i10;
        eqVar.f25843n = i10;
        return eqVar;
    }

    public static org.telegram.ui.Cells.y N0(boolean z10) {
        int x02 = x0(null, f21020i6, false);
        if (z10) {
            return L0(x02, f20929d6, null);
        }
        return h0(x02, 2, -1);
    }

    public static void N1(jj jjVar) {
        x7 x7Var = f20928d5;
        if (x7Var == null) {
            return;
        }
        if (x7Var.f32400i != null && jjVar != null) {
            if (f20947e5 == null) {
                f20947e5 = new HashMap();
            }
            f20947e5.put(jjVar, f20928d5);
            f20928d5.e(false, null);
            org.telegram.messenger.i0.h3(new w5(jjVar, 2), 200L);
            f20928d5 = null;
            return;
        }
        x7Var.f32400i = null;
    }

    public static org.telegram.ui.Cells.y O(int i10, int i11, int i12) {
        f21323z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new y5(i11, i12));
    }

    public static Drawable O0(int i10, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29 && (drawable instanceof StateListDrawable)) {
            return ((StateListDrawable) drawable).getStateDrawable(i10);
        }
        if (sm == null) {
            try {
                sm = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
            } catch (Throwable unused) {
            }
        }
        Method method = sm;
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
            TextPaint d10 = z20.d(textPaint, 1);
            E2 = d10;
            TextPaint d11 = z20.d(d10, 1);
            G2 = d11;
            d11.setTypeface(org.telegram.messenger.i0.o());
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
            I2 = z20.d(textPaint2, 1);
            Paint paint3 = new Paint();
            U1 = paint3;
            paint3.setPathEffect(k80.c());
            Paint paint4 = new Paint();
            V1 = paint4;
            paint4.setPathEffect(k80.c());
            Paint paint5 = new Paint();
            W1 = paint5;
            paint5.setPathEffect(k80.c());
            Paint paint6 = new Paint(1);
            f21054k2 = paint6;
            paint6.setStrokeCap(cap);
            f21054k2.setStyle(style);
            f21054k2.setColor(-1610612737);
            Paint paint7 = new Paint(1);
            f21073l2 = paint7;
            paint7.setStrokeCap(cap);
            f21073l2.setStyle(style);
            N2 = new TextPaint(1);
            TextPaint textPaint3 = new TextPaint(1);
            F2 = textPaint3;
            textPaint3.setTypeface(Typeface.DEFAULT_BOLD);
            TextPaint textPaint4 = new TextPaint(1);
            O2 = textPaint4;
            P2 = z20.d(textPaint4, 1);
            TextPaint textPaint5 = new TextPaint(1);
            Q2 = textPaint5;
            TextPaint d12 = z20.d(textPaint5, 1);
            R2 = d12;
            S2 = z20.d(d12, 1);
            J2 = new TextPaint(1);
            TextPaint textPaint6 = new TextPaint(1);
            K2 = textPaint6;
            L2 = z20.d(textPaint6, 1);
            T2 = new TextPaint(1);
            U2 = new TextPaint(1);
            V2 = new TextPaint(1);
            TextPaint textPaint7 = new TextPaint(1);
            W2 = textPaint7;
            X2 = z20.d(textPaint7, 1);
            TextPaint textPaint8 = new TextPaint(1);
            Y2 = textPaint8;
            Z2 = z20.d(textPaint8, 1);
            TextPaint textPaint9 = new TextPaint(1);
            f20926d3 = textPaint9;
            f20907c3 = z20.d(textPaint9, 1);
            f20945e3 = new TextPaint(1);
            TextPaint textPaint10 = new TextPaint(1);
            M2 = textPaint10;
            textPaint10.setTypeface(org.telegram.messenger.i0.o());
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
            f20887b2 = new Paint(1);
            f20906c2 = new Paint(1);
            Paint paint10 = new Paint(1);
            f20925d2 = paint10;
            paint10.setStyle(style);
            f20925d2.setStrokeCap(cap);
            f21200s2 = new TextPaint(1);
            f21219t2 = new TextPaint(1);
            f21238u2 = new TextPaint(1);
            TextPaint d13 = z20.d(f21200s2, 1);
            f21255v2 = d13;
            d13.setTypeface(org.telegram.messenger.i0.o());
            Paint paint11 = new Paint(1);
            f20998h2 = paint11;
            paint11.setColor(352321536);
            f21016i2 = new Paint(1);
            TextPaint textPaint11 = new TextPaint(1);
            f20963f3 = textPaint11;
            f20982g3 = z20.d(textPaint11, 1);
            f21034j2 = new Paint();
            new Paint(1);
            f21091m2 = new Paint(1);
            f21111n2 = new Paint(1);
            f20944e2 = new Paint(1);
            f20962f2 = new Paint(7);
            f20981g2 = new Paint(7);
            e(f21265vd, f20944e2, "paintChatMessageBackgroundSelected");
            Paint paint12 = f20962f2;
            int i10 = Zc;
            e(i10, paint12, "paintChatActionBackground");
            e(i10, f20998h2, "paintChatActionBackgroundDarken");
            e(f20878ad, f20981g2, "paintChatActionBackgroundSelected");
            TextPaint textPaint12 = f21200s2;
            int i11 = Wc;
            e(i11, textPaint12, "paintChatActionText");
            e(i11, f21219t2, "paintChatActionText2");
            e(i11, f21238u2, "paintChatActionText3");
            e(Bd, Q2, "paintChatBotButton");
            e(Ge, f21034j2, "paintChatComposeBackground");
            e(f21065kd, f21016i2, "paintChatTimeBackground");
        }
    }

    public static float[] P0(int i10) {
        ThreadLocal threadLocal;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        threadLocal = pm;
                    } else {
                        threadLocal = om;
                    }
                } else {
                    threadLocal = nm;
                }
            } else {
                threadLocal = mm;
            }
        } else {
            threadLocal = lm;
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
        synchronized (f20903c) {
            try {
                if (f21130o2 == null) {
                    f21130o2 = new TextPaint(1);
                    f21291x2 = new TextPaint(1);
                    f21308y2 = new TextPaint[6];
                    f21326z2 = new TextPaint(1);
                    A2 = new TextPaint(1);
                    B2 = new TextPaint(1);
                    TextPaint textPaint = new TextPaint(1);
                    f21273w2 = textPaint;
                    textPaint.setTypeface(org.telegram.messenger.i0.o());
                    TextPaint textPaint2 = new TextPaint(1);
                    W2 = textPaint2;
                    textPaint2.setTypeface(org.telegram.messenger.i0.o());
                    TextPaint textPaint3 = new TextPaint(1);
                    Y2 = textPaint3;
                    textPaint3.setTypeface(org.telegram.messenger.i0.o());
                    Z2 = new TextPaint(1);
                    f20868a3 = new TextPaint(1);
                    f20888b3 = new TextPaint(1);
                    f20907c3 = new TextPaint(1);
                    TextPaint textPaint4 = new TextPaint(1);
                    f20926d3 = textPaint4;
                    textPaint4.setTypeface(org.telegram.messenger.i0.o());
                    X2 = new TextPaint(1);
                    U2 = new TextPaint(1);
                    T2 = new TextPaint(1);
                    TextPaint textPaint5 = new TextPaint(1);
                    f21149p2 = textPaint5;
                    Typeface typeface = Typeface.MONOSPACE;
                    textPaint5.setTypeface(typeface);
                    TextPaint textPaint6 = new TextPaint(1);
                    f21166q2 = textPaint6;
                    textPaint6.setTypeface(typeface);
                    TextPaint textPaint7 = new TextPaint(1);
                    f21182r2 = textPaint7;
                    textPaint7.setTypeface(typeface);
                    new TextPaint(1);
                    V2 = new TextPaint(1);
                }
                float[] fArr = {0.68f, 0.46f, 0.34f, 0.28f, 0.22f, 0.19f};
                int i10 = 0;
                while (true) {
                    TextPaint[] textPaintArr = f21308y2;
                    if (i10 < textPaintArr.length) {
                        textPaintArr[i10] = new TextPaint(1);
                        f21308y2[i10].setTextSize(org.telegram.messenger.i0.L(fArr[i10] * 120.0f));
                        i10++;
                    } else {
                        f21326z2.setTextSize(org.telegram.messenger.i0.L(46.0f));
                        A2.setTextSize(org.telegram.messenger.i0.L(38.0f));
                        B2.setTextSize(org.telegram.messenger.i0.L(30.0f));
                        f21130o2.setTextSize(org.telegram.messenger.i0.L(tz.W0));
                        f21291x2.setTextSize(org.telegram.messenger.i0.L(14.0f));
                        f21273w2.setTextSize(org.telegram.messenger.i0.L(15.0f));
                        float f10 = ((tz.W0 * 2) + 10) / 3.0f;
                        W2.setTextSize(org.telegram.messenger.i0.L(f10));
                        Y2.setTextSize(org.telegram.messenger.i0.L(f10));
                        Z2.setTextSize(org.telegram.messenger.i0.L(f10));
                        float f11 = f10 - 1.0f;
                        f20868a3.setTextSize(org.telegram.messenger.i0.L(f11));
                        f20888b3.setTextSize(org.telegram.messenger.i0.L(f10));
                        V2.setTextSize(org.telegram.messenger.i0.L(12.0f));
                        f20926d3.setTextSize(org.telegram.messenger.i0.L(f11));
                        f20907c3.setTextSize(org.telegram.messenger.i0.L(f10 - 2.0f));
                        X2.setTextSize(org.telegram.messenger.i0.L(f10));
                        U2.setTextSize(org.telegram.messenger.i0.L(f11));
                        f21149p2.setTextSize(org.telegram.messenger.i0.L(Math.max(Math.min(10, tz.W0 - 1), tz.W0 - 2)));
                        f21166q2.setTextSize(org.telegram.messenger.i0.L(Math.max(Math.min(10, tz.W0 - 2), tz.W0 - 3)));
                        f21182r2.setTextSize(org.telegram.messenger.i0.L(Math.max(Math.min(10, tz.W0 - 2), tz.W0 - 5)));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static s6 Q0(String str) {
        return (s6) H.get(str);
    }

    public static void R(Context context) {
        if (f21052k0 == null) {
            Paint paint = new Paint();
            f21052k0 = paint;
            paint.setStrokeWidth(1.0f);
            Paint paint2 = new Paint();
            f21072l0 = paint2;
            paint2.setStrokeWidth(1.0f);
            f21164q0 = new Paint(1);
            Paint paint3 = new Paint(1);
            f21128o0 = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            f21128o0.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
            f21128o0.setStrokeCap(Paint.Cap.ROUND);
            Paint paint4 = new Paint(1);
            f21109n0 = paint4;
            paint4.setColor(0);
            f21109n0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            f21147p0 = new Paint(1);
            Paint paint5 = new Paint();
            m0 = paint5;
            paint5.setPathEffect(k80.c());
            Resources resources = context.getResources();
            Drawable drawable = resources.getDrawable(2131231000);
            Drawable[] drawableArr = f21180r0;
            drawableArr[0] = drawable;
            drawableArr[1] = resources.getDrawable(2131231215);
            drawableArr[2] = resources.getDrawable(2131232161);
            drawableArr[3] = resources.getDrawable(2131232163);
            drawableArr[4] = resources.getDrawable(2131232159);
            drawableArr[5] = resources.getDrawable(2131232158);
            drawableArr[6] = resources.getDrawable(2131232157);
            drawableArr[7] = resources.getDrawable(2131232160);
            drawableArr[8] = resources.getDrawable(2131232162);
            drawableArr[9] = resources.getDrawable(2131232156);
            drawableArr[10] = resources.getDrawable(2131232161);
            drawableArr[11] = resources.getDrawable(2131230999);
            drawableArr[12] = resources.getDrawable(2131232471);
            drawableArr[13] = resources.getDrawable(2131232385);
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
            bi0 bi0Var = f21237u1;
            if (bi0Var != null) {
                bi0Var.setCallback(null);
                f21237u1.C(false);
            }
            bi0 bi0Var2 = f21254v1;
            if (bi0Var2 != null) {
                bi0Var2.C(false);
            }
            bi0 bi0Var3 = f21272w1;
            if (bi0Var3 != null) {
                bi0Var3.C(false);
            }
            bi0 bi0Var4 = f21290x1;
            if (bi0Var4 != null) {
                bi0Var4.C(false);
            }
            bi0 bi0Var5 = f21307y1;
            if (bi0Var5 != null) {
                bi0Var5.C(false);
            }
            bi0 bi0Var6 = f21325z1;
            if (bi0Var6 != null) {
                bi0Var6.C(false);
            }
            f21237u1 = new bi0(2131623978, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), false, null);
            f21254v1 = new bi0(2131623977, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), false, null);
            f21272w1 = new bi0(2131623983, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), false, null);
            f21290x1 = new bi0(2131623980, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), false, null);
            f21307y1 = new bi0(2131623984, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), false, null);
            f21325z1 = new bi0(2131623974, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f), false, null);
            H1 = new bi0(2131624243, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), false, null);
            I1 = new bi0(2131624246, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), false, null);
            L1 = new bi0(2131624245, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), false, null);
            M1 = new bi0(2131624248, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), false, null);
            J1 = new bi0(2131624241, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), false, null);
            O1 = new bi0(2131624247, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), false, null);
            N1 = new bi0(2131624244, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), false, null);
            K1 = new bi0(2131624240, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), false, null);
            l();
        }
    }

    public static Drawable R0(String str) {
        return (Drawable) am.get(str);
    }

    public static jb0 S(int i10, int i11) {
        boolean z10;
        int max;
        int i12;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        jb0 jb0Var = new jb0(z10, -2368069, -9722489, -2762611, -7817084);
        if (i10 > 0 && i11 > 0) {
            i12 = i10;
            max = i11;
        } else {
            Point point = org.telegram.messenger.i0.f16026q;
            int min = Math.min(point.x, point.y);
            max = Math.max(point.x, point.y);
            i12 = min;
        }
        jb0Var.s(d00.c(1.0f, 2131623997, i12, max, -16777216, 2), 34);
        jb0Var.t(jb0Var.f());
        return jb0Var;
    }

    public static Drawable S0(String str, p6 p6Var) {
        Drawable drawable;
        if (p6Var != null) {
            drawable = p6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return (Drawable) am.get(str);
    }

    public static void T(Context context) {
        R(context);
        if (L0 == null) {
            TextPaint textPaint = new TextPaint(1);
            L0 = textPaint;
            TextPaint d10 = z20.d(textPaint, 1);
            M0 = d10;
            d10.setTypeface(org.telegram.messenger.i0.o());
            f21271w0 = new Paint(1);
            f21217t0 = new Paint(1);
            A0 = new Paint(1);
        }
        L0.setTextSize(org.telegram.messenger.i0.L(12.0f));
        M0.setTextSize(org.telegram.messenger.i0.L(13.0f));
        if (B0 == null) {
            Resources resources = context.getResources();
            B0 = new TextPaint[2];
            C0 = new TextPaint[2];
            F0 = new TextPaint[2];
            H0 = new TextPaint[2];
            for (int i10 = 0; i10 < 2; i10++) {
                B0[i10] = new TextPaint(1);
                B0[i10].setTypeface(org.telegram.messenger.i0.o());
                C0[i10] = new TextPaint(1);
                C0[i10].setTypeface(org.telegram.messenger.i0.o());
                F0[i10] = new TextPaint(1);
                H0[i10] = new TextPaint(1);
            }
            TextPaint textPaint2 = new TextPaint(1);
            D0 = textPaint2;
            TextPaint d11 = z20.d(textPaint2, 1);
            E0 = d11;
            TextPaint d12 = z20.d(d11, 1);
            G0 = d12;
            I0 = z20.d(d12, 1);
            J0 = new TextPaint(1);
            K0 = new TextPaint(1);
            TextPaint textPaint3 = new TextPaint(1);
            N0 = textPaint3;
            TextPaint d13 = z20.d(textPaint3, 1);
            O0 = d13;
            P0 = z20.d(d13, 1);
            Q0 = new TextPaint(1);
            TextPaint textPaint4 = new TextPaint(1);
            R0 = textPaint4;
            textPaint4.setTypeface(org.telegram.messenger.i0.o());
            f21236u0 = new Paint();
            f21253v0 = new Paint(1);
            f21306y0 = new Paint(1);
            f21289x0 = new Paint(1);
            f21324z0 = new Paint(1);
            f20867a1 = resources.getDrawable(2131231629);
            f20886b1 = resources.getDrawable(2131232241);
            T0 = resources.getDrawable(2131231623).mutate();
            S0 = resources.getDrawable(2131231028).mutate();
            U0 = resources.getDrawable(2131231983).mutate();
            V0 = resources.getDrawable(2131231623).mutate();
            W0 = resources.getDrawable(2131231625);
            X0 = new qb0();
            Y0 = resources.getDrawable(2131231632);
            Z0 = resources.getDrawable(2131231628).mutate();
            f20905c1 = resources.getDrawable(2131231626).mutate();
            f20924d1 = resources.getDrawable(2131231631).mutate();
            f20943e1 = resources.getDrawable(2131231942).mutate();
            f20961f1 = resources.getDrawable(2131232789).mutate();
            f20980g1 = new kl0(0);
            f20997h1 = new kl0(1);
            f21015i1 = resources.getDrawable(2131232790).mutate();
            f21090m1 = resources.getDrawable(2131231098).mutate();
            f21110n1 = resources.getDrawable(2131231100).mutate();
            f21129o1 = resources.getDrawable(2131231099).mutate();
            f21148p1 = resources.getDrawable(2131231098).mutate();
            f21165q1 = resources.getDrawable(2131231100).mutate();
            f21181r1 = resources.getDrawable(2131231099).mutate();
            f21033j1 = resources.getDrawable(2131231627);
            f21053k1 = resources.getDrawable(2131232295).mutate();
            l1 = resources.getDrawable(2131232295).mutate();
            f21218t1 = resources.getDrawable(2131232240);
            f21198s0 = resources.getDrawable(2131232571);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = f20870a5;
            pathArr[0] = path;
            pathArr[2] = new Path();
            float L10 = org.telegram.messenger.i0.L(12.0f);
            float L11 = org.telegram.messenger.i0.L(12.0f);
            rectF.set(L10 - org.telegram.messenger.i0.L(5.0f), L11 - org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f) + L10, org.telegram.messenger.i0.L(5.0f) + L11);
            pathArr[2].arcTo(rectF, -160.0f, -110.0f, true);
            pathArr[2].arcTo(rectF, 20.0f, -110.0f, true);
            pathArr[0].moveTo(L10, org.telegram.messenger.i0.L(8.0f) + L11);
            pathArr[0].lineTo(L10, org.telegram.messenger.i0.L(2.0f) + L11);
            pathArr[0].lineTo(org.telegram.messenger.i0.L(3.0f) + L10, org.telegram.messenger.i0.L(5.0f) + L11);
            pathArr[0].close();
            pathArr[0].moveTo(L10, L11 - org.telegram.messenger.i0.L(8.0f));
            pathArr[0].lineTo(L10, L11 - org.telegram.messenger.i0.L(2.0f));
            pathArr[0].lineTo(L10 - org.telegram.messenger.i0.L(3.0f), L11 - org.telegram.messenger.i0.L(5.0f));
            pathArr[0].close();
            o();
        }
        G0.setTextSize(org.telegram.messenger.i0.L(14.0f));
        I0.setTextSize(org.telegram.messenger.i0.L(12.0f));
        J0.setTextSize(org.telegram.messenger.i0.L(12.0f));
        J0.setTypeface(org.telegram.messenger.i0.o());
        K0.setTextSize(org.telegram.messenger.i0.L(12.0f));
        K0.setTypeface(org.telegram.messenger.i0.o());
        N0.setTextSize(org.telegram.messenger.i0.L(13.0f));
        O0.setTextSize(org.telegram.messenger.i0.L(11.0f));
        P0.setTextSize(org.telegram.messenger.i0.L(15.0f));
        Q0.setTextSize(org.telegram.messenger.i0.L(15.0f));
        R0.setTextSize(org.telegram.messenger.i0.L(10.0f));
        D0.setTextSize(org.telegram.messenger.i0.L(16.0f));
        E0.setTextSize(org.telegram.messenger.i0.L(16.0f));
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
                                    int h10 = d5.h(substring);
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
                        f8.g(th, true);
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e10) {
                                e = e10;
                                f8.g(e, z10);
                                return sparseIntArray;
                            }
                        }
                        return sparseIntArray;
                    } catch (Throwable th3) {
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e11) {
                                f8.g(e11, true);
                            }
                        }
                        throw th3;
                    }
                }
            }
            sparseIntArray.put(f20984g5, i11);
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            fileInputStream.close();
        } catch (Exception e12) {
            e = e12;
            z10 = true;
            f8.g(e, z10);
            return sparseIntArray;
        }
        return sparseIntArray;
    }

    public static e6 U(Context context) {
        return V(context, x0(null, f21241u5, false), x0(null, f21258v5, false));
    }

    public static float U0(float f10) {
        if (f10 < 0.0f && !I.q()) {
            return -f10;
        }
        return f10;
    }

    public static e6 V(Context context, int i10, int i11) {
        Resources resources = context.getResources();
        Drawable mutate = resources.getDrawable(2131232680).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = resources.getDrawable(2131232681).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(i11, mode));
        ?? stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842910, 16842908}, mutate2);
        stateListDrawable.addState(new int[]{16842908}, mutate2);
        stateListDrawable.addState(StateSet.WILD_CARD, mutate);
        return stateListDrawable;
    }

    public static Paint V0(String str) {
        if (Objects.equals(str, "paintDivider")) {
            return f21052k0;
        }
        return (Paint) cm.get(str);
    }

    public static e6 W(Context context, int i10, int i11, int i12) {
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

    public static Paint W0(String str, p6 p6Var) {
        Paint d10;
        if (p6Var != null && (d10 = p6Var.d(str)) != null) {
            return d10;
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
        Drawable f10 = i0.a.f(context, i10);
        f10.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        return f10;
    }

    public static org.telegram.ui.Cells.y Y(float f10, int i10, int i11, int i12, int i13, int i14) {
        f21323z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new h6(i11, i12, i13, i14, f10));
    }

    public static Drawable Y0(Context context, int i10, int i11) {
        return X0(context, i10, x0(null, i11, false));
    }

    public static void Z(Context context) {
        if (Q1 == null) {
            P1 = new TextPaint(1);
            Resources resources = context.getResources();
            Q1 = resources.getDrawable(2131232789).mutate();
            R1 = resources.getDrawable(2131232790).mutate();
            q();
        }
        P1.setTextSize(org.telegram.messenger.i0.L(16.0f));
    }

    public static Drawable Z0(View view, boolean z10) {
        int i10;
        jb0 jb0Var;
        File file;
        File file2;
        Throwable th2;
        FileInputStream fileInputStream;
        int i11;
        int i12;
        k2.m0 j02;
        File e10;
        int i13 = im.get(Be);
        d6 d6Var = null;
        if (i13 != 0) {
            int i14 = im.get(Ce);
            int i15 = im.get(De);
            int i16 = im.get(Ee);
            int i17 = im.get(Fe, -1);
            if (i17 == -1) {
                i17 = 45;
            }
            if (i14 == 0) {
                return new ColorDrawable(i13);
            }
            r6 k10 = I.k(false);
            if (k10 != null && !TextUtils.isEmpty(k10.f20741o) && M == null && (e10 = k10.e()) != null && e10.exists()) {
                file = e10;
            } else {
                file = null;
            }
            if (i15 != 0) {
                jb0Var = new jb0(true, i13, i14, i15, i16);
                if (file == null) {
                    return jb0Var;
                }
            } else if (file == null) {
                f9 f9Var = new f9(f9.d(i17), new int[]{i13, i14});
                if (!z10) {
                    j02 = k2.m0.j0(0.5f, 3);
                } else {
                    j02 = k2.m0.j0(0.125f, 1);
                }
                if (view != null) {
                    d6Var = new d6(view, z10);
                }
                f9Var.f(j02, d6Var, 0L);
                return f9Var;
            } else {
                jb0Var = null;
            }
            i10 = 0;
        } else {
            if (f20979g0 > 0) {
                s6 s6Var = I;
                if (s6Var.f20803b != null || s6Var.d != null) {
                    String str = s6Var.d;
                    if (str != null) {
                        file2 = q0(str);
                    } else {
                        file2 = new File(I.f20803b);
                    }
                    file = file2;
                    i10 = f20979g0;
                    jb0Var = null;
                }
            }
            i10 = 0;
            jb0Var = null;
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
                            int L10 = org.telegram.messenger.i0.L(100.0f);
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
                        if (jb0Var != null) {
                            r6 k11 = I.k(false);
                            if (k11 != null) {
                                i12 = (int) (k11.f20742p * 100.0f);
                            } else {
                                i12 = 100;
                            }
                            if (decodeStream != null && decodeStream.getConfig() != config) {
                                Bitmap copy = decodeStream.copy(config, false);
                                decodeStream.recycle();
                                decodeStream = copy;
                            }
                            jb0Var.s(decodeStream, i12);
                            jb0Var.t(jb0Var.f());
                            try {
                                fileInputStream.close();
                                return jb0Var;
                            } catch (Exception e11) {
                                f8.g(e11, true);
                                return jb0Var;
                            }
                        } else if (decodeStream != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(decodeStream);
                            try {
                                fileInputStream.close();
                                return bitmapDrawable;
                            } catch (Exception e12) {
                                f8.g(e12, true);
                                return bitmapDrawable;
                            }
                        } else {
                            fileInputStream.close();
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            f8.g(th2, true);
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return null;
                        } catch (Throwable th4) {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e13) {
                                    f8.g(e13, true);
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
            f8.g(e14, true);
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
        f21323z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new q6(i11, i12));
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
            P02[1] = w7.u.a(f12 + f10, 0.0f, 1.0f);
        }
        P02[2] = w7.u.a(P02[2] + f11, 0.0f, 1.0f);
        return Color.HSVToColor(Color.alpha(i10), P02);
    }

    public static org.telegram.ui.Cells.y b0(int i10, int i11, int i12, int i13) {
        f21323z.setColor(-1);
        float f10 = i12;
        float f11 = i13;
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), e0(org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f11), i10), new q6(f10, f11));
    }

    public static String b1(m6 m6Var) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (m6Var == null || TextUtils.isEmpty(m6Var.f20590c) || m6Var.f20590c.equals("d")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (m6Var.f20593i) {
            sb2.append("blur");
        }
        if (m6Var.f20594j) {
            if (sb2.length() > 0) {
                sb2.append("+");
            }
            sb2.append("motion");
        }
        int i10 = m6Var.d;
        if (i10 == 0) {
            str3 = "https://attheme.org?slug=" + m6Var.f20590c;
        } else {
            String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (m6Var.d >> 8)) & 255), Byte.valueOf((byte) (m6Var.d & 255))).toLowerCase();
            int i11 = m6Var.e;
            if (i11 != 0) {
                str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (m6Var.e >> 8)) & 255), Byte.valueOf((byte) (m6Var.e & 255))).toLowerCase();
            } else {
                str = null;
            }
            int i12 = m6Var.f20591f;
            if (i12 != 0) {
                str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (m6Var.f20591f >> 8)) & 255), Byte.valueOf((byte) (m6Var.f20591f & 255))).toLowerCase();
            } else {
                str2 = null;
            }
            int i13 = m6Var.f20592g;
            if (i13 != 0) {
                str4 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (m6Var.f20592g >> 8)) & 255), Byte.valueOf((byte) (m6Var.f20592g & 255))).toLowerCase();
            }
            if (str != null && str2 != null) {
                if (str4 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(lowerCase);
                    sb3.append("~");
                    sb3.append(str);
                    sb3.append("~");
                    sb3.append(str2);
                    lowerCase = a1.g.r(sb3, "~", str4);
                } else {
                    lowerCase = lowerCase + "~" + str + "~" + str2;
                }
            } else if (str != null) {
                StringBuilder i14 = sc.e.i(a1.g.C(lowerCase, "-", str), "&rotation=");
                i14.append(m6Var.h);
                lowerCase = i14.toString();
            }
            str3 = "https://attheme.org?slug=" + m6Var.f20590c + "&intensity=" + ((int) (m6Var.f20595k * 100.0f)) + "&bg_color=" + lowerCase;
        }
        if (sb2.length() > 0) {
            StringBuilder i15 = sc.e.i(str3, "&mode=");
            i15.append(sb2.toString());
            return i15.toString();
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
        P02[1] = org.telegram.messenger.i0.T1(P02[1], f11, 0.25f);
        return Color.HSVToColor(Color.alpha(i10), P02);
    }

    public static org.telegram.ui.Cells.y c0(int i10, int i11, int i12, int i13, int i14) {
        f21323z.setColor(-1);
        ?? drawable = new Drawable();
        drawable.f20704a = new Path();
        drawable.f20705b = r1;
        drawable.f20706c = true;
        float L10 = org.telegram.messenger.i0.L(i11);
        float L11 = org.telegram.messenger.i0.L(i12);
        float L12 = org.telegram.messenger.i0.L(i13);
        float L13 = org.telegram.messenger.i0.L(i14);
        float[] fArr = {L10, L10, L11, L11, L12, L12, L13, L13};
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, drawable);
    }

    public static boolean c1() {
        if (P && I.f20813i0 != null) {
            return true;
        }
        return false;
    }

    public static void d(String str, Drawable drawable, int i10) {
        am.put(str, drawable);
        bm.put(str, Integer.valueOf(i10));
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
        cm.put(str, paint);
        dm.put(str, Integer.valueOf(i10));
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
            int i10 = ll;
            if (sparseIntArray.indexOfKey(i10) < 0) {
                sparseIntArray2.put(i10, r1(0.1f, -1));
            }
        }
        int[] iArr = em;
        int i11 = f21190ra;
        int i12 = sparseIntArray2.get(i11, iArr[i11]);
        int L12 = L1(sparseIntArray2);
        int i13 = nl;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, x(i12, z10, false));
        }
        int i14 = ol;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, x(i12, z10, true));
        }
        int i15 = pl;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, x(L12, z10, false));
        }
        int i16 = ql;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            sparseIntArray2.put(i16, x(L12, z10, true));
        }
        int i17 = rl;
        if (sparseIntArray.indexOfKey(i17) < 0) {
            sparseIntArray2.put(i17, y(i12, z10, false, true));
        }
        int i18 = sl;
        if (sparseIntArray.indexOfKey(i18) < 0) {
            sparseIntArray2.put(i18, y(L12, z10, true, true));
        }
        int i19 = tl;
        if (sparseIntArray.indexOfKey(i19) < 0) {
            sparseIntArray2.put(i19, y(i12, z10, false, false));
        }
        int i20 = ul;
        if (sparseIntArray.indexOfKey(i20) < 0) {
            sparseIntArray2.put(i20, y(L12, z10, true, false));
        }
    }

    public static InsetDrawable f0(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        shapeDrawable.getPaint().setShadowLayer(org.telegram.messenger.i0.N(2.0f), 0.0f, org.telegram.messenger.i0.N(0.33f), r1(Color.alpha(i11) / 255.0f, 285212672));
        return new InsetDrawable((Drawable) shapeDrawable, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
    }

    public static boolean f1(int i10) {
        if (im.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    public static void g(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        int[] iArr = em;
        int i10 = f21190ra;
        int i11 = sparseIntArray2.get(i10, iArr[i10]);
        int L12 = L1(sparseIntArray2);
        int i12 = fl;
        if (sparseIntArray.indexOfKey(i12) < 0) {
            sparseIntArray2.put(i12, z(i11, z10, false));
        }
        int i13 = gl;
        if (sparseIntArray.indexOfKey(i13) < 0) {
            sparseIntArray2.put(i13, z(L12, z10, true));
        }
        int i14 = hl;
        if (sparseIntArray.indexOfKey(i14) < 0) {
            sparseIntArray2.put(i14, A(i11, z10, false));
        }
        int i15 = il;
        if (sparseIntArray.indexOfKey(i15) < 0) {
            sparseIntArray2.put(i15, A(L12, z10, true));
        }
        int i16 = kl;
        if (sparseIntArray.indexOfKey(i16) < 0) {
            int i17 = Ob;
            sparseIntArray2.put(i16, r1(0.2f, sparseIntArray2.get(i17, iArr[i17])));
        }
        if (z10) {
            int i18 = jl;
            if (sparseIntArray.indexOfKey(i18) < 0) {
                int i19 = Md;
                sparseIntArray2.put(i18, r1(0.2f, sparseIntArray2.get(i19, iArr[i19])));
            }
        }
    }

    public static org.telegram.ui.Cells.y g0(int i10, int i11) {
        return h0(i10, i11, -1);
    }

    public static boolean g1() {
        s6 s6Var = I;
        if (!s6Var.S || s6Var.Y != f21108n) {
            if (im.indexOfKey(Be) < 0 && f20979g0 <= 0 && TextUtils.isEmpty(f20996h0)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void h(Drawable drawable) {
        boolean z10;
        Bitmap bitmap;
        if (f20944e2 == null) {
            return;
        }
        int i10 = im.get(f21265vd);
        if ((drawable instanceof jb0) && tz.o() != 0 && i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && Y != (bitmap = ((jb0) drawable).f27287k)) {
            Y = bitmap;
            Bitmap bitmap2 = Y;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            Z = new BitmapShader(bitmap2, tileMode, tileMode);
            if (f20866a0 == null) {
                f20866a0 = new Matrix();
            }
        }
        if (Z != null && i10 == 0 && z10) {
            ColorMatrix colorMatrix = new ColorMatrix();
            org.telegram.messenger.i0.i(colorMatrix, 2.5f);
            org.telegram.messenger.i0.n2(colorMatrix, 0.75f);
            f20944e2.setShader(Z);
            f20944e2.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            f20944e2.setAlpha(64);
            return;
        }
        Paint paint = f20944e2;
        if (i10 == 0) {
            i10 = 1073741824;
        }
        paint.setColor(i10);
        f20944e2.setColorFilter(null);
        f20944e2.setShader(null);
    }

    public static org.telegram.ui.Cells.y h0(int r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t6.h0(int, int, int):org.telegram.ui.Cells.y");
    }

    public static boolean h1() {
        if (jm != null) {
            return true;
        }
        return false;
    }

    public static void i() {
        Drawable drawable = f20942e0;
        if (drawable != null) {
            j(drawable);
        }
    }

    public static org.telegram.ui.Cells.y i0(int i10, int i11) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), new ColorDrawable(i10), new ColorDrawable(i10));
    }

    public static boolean i1(p6 p6Var) {
        if (p6Var != null) {
            return p6Var.e();
        }
        return tz.H0;
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
        if (f20962f2 == null) {
            return;
        }
        X = f20904c0;
        f20885b0 = f20923d0;
        boolean z11 = tz.H0;
        int i16 = Zc;
        int i17 = 0;
        if (z11) {
            int x02 = x0(null, ua, false);
            int x03 = x0(null, Ea, false);
            i11 = i0.b.k(x03, x02);
            i12 = i0.b.k(i0.b.o(x03, Math.min(255, Color.alpha(x03) * 2)), x02);
            X = i11;
            f20885b0 = i12;
        } else {
            int indexOfKey = im.indexOfKey(i16);
            if (indexOfKey >= 0) {
                i10 = im.valueAt(indexOfKey);
            } else {
                i10 = X;
            }
            i11 = i10;
            int indexOfKey2 = im.indexOfKey(f20878ad);
            if (indexOfKey2 >= 0) {
                i12 = im.valueAt(indexOfKey2);
            } else {
                i12 = f20885b0;
            }
        }
        if (!z11 && ((((z10 = drawable instanceof jb0)) || (drawable instanceof BitmapDrawable)) && tz.o() != 0 && sc.e(32))) {
            if (z10) {
                bitmap = ((jb0) drawable).f27287k;
            } else {
                if (drawable instanceof BitmapDrawable) {
                    WeakReference weakReference = xm;
                    if (weakReference != null && weakReference.get() == drawable) {
                        bitmap = ym;
                    } else {
                        WeakReference weakReference2 = xm;
                        if (weakReference2 != null) {
                            weakReference2.clear();
                        }
                        xm = null;
                        if (drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
                            xm = new WeakReference(drawable);
                            int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
                            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
                            drawable.setBounds(0, 0, intrinsicWidth, 24);
                            ColorFilter colorFilter = drawable.getColorFilter();
                            ColorMatrix colorMatrix = new ColorMatrix();
                            colorMatrix.setSaturation(1.3f);
                            org.telegram.messenger.i0.n2(colorMatrix, 0.94f);
                            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                            drawable.draw(new Canvas(createBitmap));
                            drawable.setColorFilter(colorFilter);
                            Utilities.blurBitmap(createBitmap, 3);
                            ym = createBitmap;
                            bitmap = createBitmap;
                        } else {
                            ym = null;
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
                if (f20866a0 == null) {
                    f20866a0 = new Matrix();
                }
            }
            C1(-1, Y3);
            C1(-1, H3);
            C1(-1, I3);
            C1(-1, J3);
            C1(-1, K3);
            f21200s2.setColor(-1);
            f21219t2.setColor(-1);
            f21238u2.setColor(-1);
            f21200s2.linkColor = -1;
            f21255v2.setColor(-1);
            Q2.setColor(-1);
            C1(-1, C4);
            C1(-1, f21168q4);
            C1(-1, f21184r4);
            C1(-1, f21240u4);
            C1(-1, f21293x4);
            C1(-1, f21309y4);
            C1(-1, A4);
            C1(-1, f21328z4);
            C1(-1, f21257v4);
        } else {
            Y = null;
            Z = null;
            int i18 = Fa;
            if (z11) {
                i13 = i18;
            } else {
                i13 = Wc;
            }
            if (!z11) {
                i18 = Xc;
            }
            if (z11) {
                i14 = Ga;
            } else {
                i14 = Yc;
            }
            D1(i13, Y3);
            D1(i13, H3);
            D1(i13, I3);
            D1(i13, J3);
            D1(i13, K3);
            f21200s2.setColor(x0(null, i13, false));
            f21219t2.setColor(x0(null, i13, false));
            f21238u2.setColor(x0(null, i13, false));
            f21200s2.linkColor = x0(null, i18, false);
            f21255v2.setColor(x0(null, i13, false));
            D1(i14, C4);
            D1(i14, f21168q4);
            D1(i14, f21184r4);
            D1(i14, f21240u4);
            D1(i14, f21293x4);
            D1(i14, f21309y4);
            D1(i14, A4);
            D1(i14, f21328z4);
            D1(i14, f21257v4);
            TextPaint textPaint = Q2;
            if (z11) {
                i15 = Ha;
            } else {
                i15 = Bd;
            }
            textPaint.setColor(x0(null, i15, false));
            if (z11) {
                D1(i14, f21202s4);
                D1(i14, f21221t4);
            } else {
                Drawable drawable2 = f21202s4;
                if (drawable2 != null) {
                    drawable2.setColorFilter(null);
                }
                Drawable drawable3 = f21221t4;
                if (drawable3 != null) {
                    drawable3.setColorFilter(null);
                }
            }
        }
        f20962f2.setColor(i11);
        f20981g2.setColor(i12);
        if (Z != null && (im.indexOfKey(i16) < 0 || (drawable instanceof jb0) || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix2 = new ColorMatrix();
            if (drawable instanceof jb0) {
                float f14 = -0.06f;
                if (((jb0) drawable).f27293q >= 0.0f) {
                    colorMatrix2.setSaturation(1.6f);
                    if (I.q()) {
                        f13 = 0.97f;
                    } else {
                        f13 = 0.92f;
                    }
                    org.telegram.messenger.i0.n2(colorMatrix2, f13);
                    if (I.q()) {
                        f14 = 0.12f;
                    }
                    org.telegram.messenger.i0.h(colorMatrix2, f14);
                } else {
                    colorMatrix2.setSaturation(1.1f);
                    if (I.q()) {
                        f12 = 0.4f;
                    } else {
                        f12 = 0.8f;
                    }
                    org.telegram.messenger.i0.n2(colorMatrix2, f12);
                    if (I.q()) {
                        f14 = 0.08f;
                    }
                    org.telegram.messenger.i0.h(colorMatrix2, f14);
                }
            } else {
                colorMatrix2.setSaturation(1.6f);
                if (I.q()) {
                    f10 = 0.9f;
                } else {
                    f10 = 0.84f;
                }
                org.telegram.messenger.i0.n2(colorMatrix2, f10);
                if (I.q()) {
                    f11 = -0.04f;
                } else {
                    f11 = 0.06f;
                }
                org.telegram.messenger.i0.h(colorMatrix2, f11);
            }
            f20962f2.setFilterBitmap(true);
            f20962f2.setShader(Z);
            f20962f2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
            f20962f2.setAlpha(255);
            f20981g2.setFilterBitmap(true);
            f20981g2.setShader(Z);
            ColorMatrix colorMatrix3 = new ColorMatrix(colorMatrix2);
            org.telegram.messenger.i0.i(colorMatrix3, 0.26f);
            j1();
            org.telegram.messenger.i0.n2(colorMatrix3, 0.92f);
            f20981g2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
            f20981g2.setAlpha(255);
            f20998h2.setAlpha(0);
            return;
        }
        f20962f2.setColorFilter(null);
        f20962f2.setShader(null);
        f20981g2.setColorFilter(null);
        f20981g2.setShader(null);
        Paint paint = f20998h2;
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
        if (f21130o2 != null && f21092m3 != null && !z10) {
            K2.setColor(x0(null, f21301xd, false));
            J2.setColor(x0(null, f21283wd, false));
            Q2.setColor(x0(null, Bd, false));
            U1.setColor(x0(null, f21336ze, false));
            V1.setColor(x0(null, Ac, false));
            W1.setColor(x0(null, Ae, false));
            f20887b2.setColor(x0(null, f21230td, false));
            Paint paint = f20906c2;
            int i10 = f21155pa;
            paint.setColor(x0(null, i10, false));
            f20925d2.setColor(x0(null, i10, false));
            TextPaint textPaint = f21200s2;
            int i11 = Wc;
            textPaint.setColor(x0(null, i11, false));
            f21219t2.setColor(x0(null, i11, false));
            f21238u2.setColor(x0(null, i11, false));
            f21200s2.linkColor = x0(null, Xc, false);
            f21255v2.setColor(x0(null, i11, false));
            f20963f3.setColor(x0(null, G6, false));
            Paint paint2 = f21034j2;
            int i12 = Ge;
            paint2.setColor(x0(null, i12, false));
            f21016i2.setColor(x0(null, f21065kd, false));
            D1(Yd, f20999h3);
            c5 c5Var = f21092m3;
            int i13 = f21190ra;
            D1(i13, c5Var);
            c5 c5Var2 = f21112n3;
            int i14 = Rc;
            D1(i14, c5Var2);
            D1(i13, f21167q3);
            D1(i14, f21183r3);
            D1(xb, y3);
            D1(f21316yb, f21327z3);
            Drawable drawable = A3;
            int i15 = zb;
            D1(i15, drawable);
            Drawable drawable2 = B3;
            int i16 = Ab;
            D1(i16, drawable2);
            D1(i15, C3);
            D1(i16, D3);
            Drawable drawable3 = F3;
            int i17 = f20990gd;
            D1(i17, drawable3);
            D1(i17, G3);
            D1(i11, H3);
            D1(i11, I3);
            D1(i11, J3);
            D1(i11, K3);
            D1(i11, L3);
            Drawable drawable4 = f21168q4;
            int i18 = Yc;
            D1(i18, drawable4);
            D1(i18, f21184r4);
            D1(i18, f21240u4);
            D1(i18, f21293x4);
            D1(i18, f21309y4);
            Drawable drawable5 = A4;
            int i19 = f20936dd;
            D1(i19, drawable5);
            D1(i18, f21328z4);
            D1(i18, f21257v4);
            Drawable drawable6 = M3;
            int i20 = f21083ld;
            D1(i20, drawable6);
            Drawable drawable7 = N3;
            int i21 = f21102md;
            D1(i21, drawable7);
            Drawable drawable8 = O3;
            int i22 = Fb;
            D1(i22, drawable8);
            Drawable drawable9 = P3;
            int i23 = Gb;
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
            int i24 = f21122nd;
            D1(i24, drawable10);
            D1(i11, Y3);
            D1(i24, f20869a4);
            D1(i24, f20889b4);
            D1(f21141od, f20908c4);
            D1(f21158pd, f20927d4);
            D1(Hb, f20946e4);
            D1(Ib, f20964f4);
            D1(f21175qd, f20983g4);
            Drawable drawable11 = f21018i4;
            int i25 = Jb;
            D1(i25, drawable11);
            Drawable drawable12 = f21000h4;
            int i26 = f21192rd;
            D1(i26, drawable12);
            D1(f21248ud, f21036j4);
            D1(f20917cd, f21056k4);
            D1(i19, l4);
            Drawable drawable13 = f21093m4;
            int i27 = f21267vf;
            D1(i27, drawable13);
            D1(i27, f21113n4);
            D1(i27, f21132o4);
            D1(i26, B4);
            D1(i18, C4);
            D1(i26, D4);
            Drawable drawable14 = E4;
            int i28 = qf;
            D1(i28, drawable14);
            D1(i28, F4);
            for (int i29 = 0; i29 < 2; i29++) {
                D1(i26, G4[i29]);
                D1(f21211sd, H4[i29]);
                D1(i25, I4[i29]);
                D1(Kb, J4[i29]);
            }
            D1(f21281wb, O4);
            Drawable drawable15 = P4;
            int i30 = f21187r7;
            D1(i30, drawable15);
            D1(f21173qa, Q4);
            D1(i30, V4);
            Drawable drawable16 = W4;
            int i31 = rj;
            D1(i31, drawable16);
            D1(i30, X4);
            D1(i31, Y4);
            int i32 = 0;
            while (true) {
                qv0[] qv0VarArr = f21239u3;
                if (i32 >= qv0VarArr.length) {
                    break;
                }
                D1(p9, qv0VarArr[i32]);
                i32++;
            }
            for (int i33 = 0; i33 < 5; i33++) {
                Drawable[][] drawableArr = U4;
                B1(drawableArr[i33][0], x0(null, We, false), false);
                B1(drawableArr[i33][0], x0(null, f21026id, false), true);
                B1(drawableArr[i33][1], x0(null, Xe, false), false);
                B1(drawableArr[i33][1], x0(null, f21045jd, false), true);
            }
            Drawable[] drawableArr2 = T4;
            B1(drawableArr2[0], x0(null, f20974ff, false), false);
            B1(drawableArr2[0], x0(null, f20992gf, false), true);
            B1(drawableArr2[1], x0(null, Ec, false), false);
            B1(drawableArr2[1], x0(null, Fc, false), true);
            Drawable[] drawableArr3 = S4;
            C1(x0(null, f20955ef, false), drawableArr3[0]);
            C1(x0(null, Dc, false), drawableArr3[1]);
            Drawable[] drawableArr4 = M4;
            C1(x0(null, f21318yd, false), drawableArr4[0]);
            C1(x0(null, Lb, false), drawableArr4[1]);
            Drawable[] drawableArr5 = N4;
            C1(x0(null, i20, false), drawableArr5[0]);
            C1(x0(null, i22, false), drawableArr5[1]);
            D1(He, f21017i3);
            D1(i12, f21035j3);
            int i34 = -1;
            if (x0(null, f21121nc, false) == -1) {
                i34 = x0(null, f21139ob, false);
            }
            C1(i34, K4[1]);
            C1(i34, L4[1]);
            C1(x0(null, f20933da, false), R4);
            if (!z11 && !f20884b) {
                i();
                h(f20942e0);
            } else if (tz.H0 && !f20884b) {
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
        Paint paint = f21052k0;
        if (paint == null) {
            return;
        }
        paint.setColor(x0(null, f20930d7, false));
        m0.setColor(x0(null, K6, false));
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = f21180r0;
            int length = drawableArr.length;
            int i11 = J7;
            if (i10 < length) {
                D1(i11, drawableArr[i10]);
                i10++;
            } else {
                bi0 bi0Var = f21237u1;
                bi0Var.Z = true;
                int i12 = M7;
                bi0Var.Q(x0(null, i12, true), "Arrow1");
                f21237u1.Q(x0(null, i12, true), "Arrow2");
                f21237u1.Q(x0(null, i11, true), "Box2");
                f21237u1.Q(x0(null, i11, true), "Box1");
                f21237u1.o();
                C1 = false;
                f21237u1.J(true);
                bi0 bi0Var2 = f21290x1;
                bi0Var2.Z = true;
                int i13 = f20950e9;
                bi0Var2.Q(x0(null, i13, true), "Arrow");
                f21290x1.Q(x0(null, i13, true), "Line");
                f21290x1.o();
                bi0 bi0Var3 = f21307y1;
                bi0Var3.Z = true;
                bi0Var3.Q(x0(null, i13, true), "Arrow");
                f21307y1.Q(x0(null, i13, true), "Line");
                f21307y1.o();
                bi0 bi0Var4 = f21325z1;
                bi0Var4.Z = true;
                int i14 = f20913c9;
                bi0Var4.Q(x0(null, i14, true), "Line 1");
                f21325z1.Q(x0(null, i14, true), "Line 2");
                f21325z1.Q(x0(null, i14, true), "Line 3");
                f21325z1.Q(x0(null, i13, true), "Cup Red");
                f21325z1.Q(x0(null, i13, true), "Box");
                f21325z1.o();
                B1 = false;
                bi0 bi0Var5 = f21254v1;
                bi0Var5.Z = true;
                bi0Var5.Q(x0(null, i14, true), "Arrow");
                f21254v1.Q(x0(null, i13, true), "Box2");
                f21254v1.Q(x0(null, i13, true), "Box1");
                f21254v1.o();
                A1 = false;
                bi0 bi0Var6 = f21272w1;
                bi0Var6.Z = true;
                bi0Var6.Q(x0(null, i13, true), "Arrow1");
                f21272w1.Q(x0(null, f20932d9, true), "Arrow2");
                f21272w1.Q(x0(null, i13, true), "Box2");
                f21272w1.Q(x0(null, i13, true), "Box1");
                f21272w1.o();
                int x02 = x0(null, G6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                f21256v3 = new PorterDuffColorFilter(x02, mode);
                f21274w3 = new PorterDuffColorFilter(x0(null, Tc, false), mode);
                ea.f.d().b();
                return;
            }
        }
    }

    public static boolean l0(s6 s6Var, r6 r6Var, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (r6Var == null || s6Var == null || s6Var.f20804b0 == null) {
            return false;
        }
        if (r6Var.f20730a == s6Var.Y) {
            z11 = true;
        } else {
            z11 = false;
        }
        File e10 = r6Var.e();
        if (e10 != null) {
            e10.delete();
        }
        s6Var.f20802a0.remove(r6Var.f20730a);
        s6Var.f20804b0.remove(r6Var);
        TLRPC.TL_theme tL_theme = r6Var.f20744r;
        if (tL_theme != null) {
            s6Var.f20806c0.remove(tL_theme.f19932id);
        }
        m6 m6Var = r6Var.f20750y;
        if (m6Var != null) {
            m6.a(m6Var);
        }
        if (z11) {
            s6Var.u(((r6) s6Var.f20804b0.get(0)).f20730a);
        }
        if (z10) {
            z1(s6Var, true, false, false, false, false);
            if (r6Var.f20744r != null) {
                vp r12 = vp.r1(r6Var.f20746t);
                if (z11 && s6Var == J) {
                    z12 = true;
                }
                r12.u4(s6Var, r6Var, z12, true);
            }
        }
        return z11;
    }

    public static boolean l1(r6 r6Var) {
        s6 s6Var = r6Var.f20731b;
        if (s6Var != null) {
            if (s6Var.m().equals("Blue") && r6Var.f20730a == 99) {
                return true;
            }
            if (r6Var.f20731b.m().equals("Day") && r6Var.f20730a == 9) {
                return true;
            }
            if ((r6Var.f20731b.m().equals("Night") || r6Var.f20731b.m().equals("Dark Blue")) && r6Var.f20730a == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void m(boolean z10) {
        s6 s6Var;
        if (M == null) {
            if (z10) {
                s6 s6Var2 = I;
                s6 s6Var3 = J;
                if (s6Var2 != s6Var3) {
                    if (s6Var2 == null || (s6Var3 != null && s6Var2.q() != J.q())) {
                        R = true;
                        f21013i = SystemClock.elapsedRealtime();
                        Q = true;
                        K1(J, true, -1, null);
                        Q = false;
                        return;
                    }
                    return;
                }
                return;
            }
            s6 s6Var4 = K;
            if (s6Var4 != null && s6Var4.q() && f21127o != 0 && (s6Var = L) != null) {
                s6Var4 = s6Var;
            }
            s6 s6Var5 = I;
            if (s6Var5 != s6Var4) {
                if (s6Var5 == null || (s6Var4 != null && s6Var5.q() != s6Var4.q())) {
                    R = false;
                    f21013i = SystemClock.elapsedRealtime();
                    Q = true;
                    K1(s6Var4, true, -1, null);
                    Q = false;
                }
            }
        }
    }

    public static s6 m0(File file, String str, TLRPC.TL_theme tL_theme) {
        String[] split;
        try {
            s6 s6Var = new s6();
            s6Var.f20801a = str;
            s6Var.F = tL_theme;
            s6Var.f20803b = file.getAbsolutePath();
            s6Var.E = d20.f15147s0;
            String[] strArr = new String[1];
            H(T0(new File(s6Var.f20803b), null, strArr), s6Var);
            if (!TextUtils.isEmpty(strArr[0])) {
                String str2 = strArr[0];
                s6Var.f20805c = new File(org.telegram.messenger.w0.h(), Utilities.a(str2) + ".wp").getAbsolutePath();
                Uri parse = Uri.parse(str2);
                s6Var.e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        if ("blur".equals(split[i10])) {
                            s6Var.h = true;
                        } else if ("motion".equals(split[i10])) {
                            s6Var.f20815n = true;
                        }
                    }
                }
                String queryParameter2 = parse.getQueryParameter("intensity");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String queryParameter3 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            s6Var.f20816r = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                            if (queryParameter3.length() >= 13 && org.telegram.messenger.i0.S1(queryParameter3.charAt(6))) {
                                s6Var.f20817s = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter3.length() >= 20 && org.telegram.messenger.i0.S1(queryParameter3.charAt(13))) {
                                s6Var.f20818w = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter3.length() == 27 && org.telegram.messenger.i0.S1(queryParameter3.charAt(20))) {
                                s6Var.f20819x = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String queryParameter4 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            s6Var.f20820y = Utilities.z(queryParameter4).intValue();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        s6Var.D = Utilities.z(queryParameter2).intValue();
                    }
                    if (s6Var.D == 0) {
                        s6Var.D = 50;
                    }
                }
                return s6Var;
            }
            f20996h0 = null;
            return s6Var;
        } catch (Exception e10) {
            f8.g(e10, true);
            return null;
        }
    }

    public static void m1(int i10, boolean z10) {
        boolean[] zArr = C;
        if (!zArr[i10]) {
            if ((z10 || Math.abs((System.currentTimeMillis() / 1000) - D[i10]) >= 3600) && d20.i(i10).p()) {
                zArr[i10] = true;
                TL_account.getThemes getthemes = new TL_account.getThemes();
                getthemes.format = "android";
                if (!ui.b0(i10).A0.isEmpty()) {
                    getthemes.hash = E[i10];
                }
                if (org.telegram.messenger.v2.f18448a) {
                    Log.i("theme", "loading remote themes, hash " + getthemes.hash);
                }
                ConnectionsManager.getInstance(i10).sendRequest(getthemes, new org.telegram.messenger.voip.q(i10, 2));
            }
        }
    }

    public static void n(Paint paint) {
        paint.setShadowLayer(org.telegram.messenger.i0.N(1.0f), 0.0f, org.telegram.messenger.i0.N(0.33f), f20865a);
    }

    public static Paint n0(int i10) {
        Paint paint = Bm;
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
                Point point = org.telegram.messenger.i0.f16026q;
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
                f8.g(e10, true);
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
            int i11 = p9;
            int i12 = f20988g9;
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
                int x03 = x0(null, f21098m9, false);
                textPaint2.linkColor = x03;
                textPaint2.setColor(x03);
                f21236u0.setColor(x0(null, f21226t9, false));
                f21253v0.setColor(x0(null, f21207s9, false));
                I0.setColor(x0(null, f21172q9, false));
                J0.setColor(x0(null, f21189r9, false));
                TextPaint textPaint3 = K0;
                int i15 = Wl;
                textPaint3.setColor(x0(null, i15, false));
                TextPaint textPaint4 = L0;
                int i16 = W8;
                textPaint4.setColor(x0(null, i16, false));
                M0.setColor(x0(null, i16, false));
                TextPaint textPaint5 = N0;
                int i17 = f20968f9;
                textPaint5.setColor(x0(null, i17, false));
                O0.setColor(x0(null, i17, false));
                Paint paint = f21271w0;
                int i18 = U8;
                paint.setColor(x0(null, i18, false));
                Paint paint2 = f21306y0;
                int i19 = V8;
                paint2.setColor(x0(null, i19, false));
                f21324z0.setColor(x0(null, i11, false));
                f21289x0.setColor(x0(null, f21298x9, false));
                P0.setColor(x0(null, f21152p6, false));
                Q0.setColor(x0(null, A6, false));
                D1(f20874a9, f20867a1);
                Drawable drawable = f20886b1;
                int i20 = f20894b9;
                D1(i20, drawable);
                D1(f21245u9, T0);
                D1(G6, S0);
                Drawable drawable2 = V0;
                int i21 = f21262v9;
                D1(i21, drawable2);
                D1(i21, W0);
                D1(w9, X0);
                D1(f21314y9, Y0);
                D1(i20, f21033j1);
                D1(i20, f21053k1);
                D1(i15, l1);
                D1(i20, Z0);
                Drawable drawable3 = f20905c1;
                int i22 = B9;
                D1(i22, drawable3);
                D1(i22, f20924d1);
                D1(i22, f20943e1);
                D1(i18, f21090m1);
                D1(Z5, f21110n1);
                D1(nk, f21129o1);
                D1(i19, f21148p1);
                D1(i19, f21165q1);
                D1(i19, f21181r1);
                D1(i12, f21218t1);
                D1(f21333z9, f20961f1);
                D1(A9, f21015i1);
                D1(A8, f21199s1);
                kl0 kl0Var = f20980g1;
                int i23 = f21041j9;
                D1(i23, kl0Var);
                D1(i23, f20997h1);
                return;
            }
        }
    }

    public static ColorFilter o0(p6 p6Var) {
        if (p6Var != null) {
            return p6Var.c();
        }
        return f21256v3;
    }

    public static void o1(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t6.o1(boolean):void");
    }

    public static void p() {
        s6 s6Var;
        s6 s6Var2 = M;
        if (s6Var2 == null) {
            return;
        }
        O = false;
        if (R && (s6Var = J) != null) {
            u(s6Var, true, true);
        } else if (!P) {
            u(s6Var2, true, false);
        }
        P = false;
        M = null;
        F(false);
    }

    public static x7 p0(jj jjVar) {
        HashMap hashMap = f20947e5;
        if (hashMap != null && jjVar != null) {
            return (x7) hashMap.get(jjVar);
        }
        return null;
    }

    public static Drawable p1(m6 m6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable drawable;
        bh.d J10 = J(I, m6Var, im, file, f20996h0, f20979g0, i10, S, z11, O, P, z10, document, false);
        Boolean bool = (Boolean) J10.f2779c;
        if (bool != null) {
            z12 = bool.booleanValue();
        } else {
            z12 = f21014i0;
        }
        f21014i0 = z12;
        Boolean bool2 = (Boolean) J10.d;
        if (bool2 != null) {
            z13 = bool2.booleanValue();
        } else {
            z13 = f21032j0;
        }
        f21032j0 = z13;
        Boolean bool3 = (Boolean) J10.e;
        if (bool3 != null) {
            z14 = bool3.booleanValue();
        } else {
            z14 = W;
        }
        W = z14;
        Drawable drawable2 = (Drawable) J10.f2777a;
        if (drawable2 != null) {
            drawable = drawable2;
        } else {
            drawable = f20942e0;
        }
        f20942e0 = drawable;
        int[] q10 = org.telegram.messenger.i0.q(drawable2);
        int i11 = q10[0];
        f20904c0 = i11;
        X = i11;
        int i12 = q10[1];
        f20923d0 = i12;
        f20885b0 = i12;
        i();
        return drawable2;
    }

    public static void q() {
        if (Q1 == null) {
            return;
        }
        P1.setColor(x0(null, G6, false));
        P1.linkColor = x0(null, J6, false);
        D1(ni, Q1);
        D1(oi, R1);
    }

    public static File q0(String str) {
        long j10;
        File file = new File(org.telegram.messenger.w0.h(), str);
        try {
            InputStream open = org.telegram.messenger.w0.f19025b.getAssets().open(str);
            j10 = open.available();
            open.close();
        } catch (Exception e10) {
            f8.g(e10, true);
            j10 = 0;
        }
        if (!file.exists() || (j10 != 0 && file.length() != j10)) {
            try {
                InputStream open2 = org.telegram.messenger.w0.f19025b.getAssets().open(str);
                Typeface typeface = org.telegram.messenger.i0.f15999a;
                org.telegram.messenger.i0.D(open2, new FileOutputStream(file));
                open2.close();
            } catch (Exception e11) {
                f8.g(e11, true);
            }
        }
        return file;
    }

    public static void q1(int i10, int i11, int... iArr) {
        for (int i12 : iArr) {
            zm[i12] = (i10 << 16) | i11;
        }
    }

    public static void r(float f10, float f11, int i10, int i11) {
        s(Y, Z, f20866a0, i10, i11, f10, f11);
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
        return i0.b.o(i10, w7.u.b((int) (Color.alpha(i10) * f10), 0, 255));
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
            Utilities.f14523i.c(new w5(countDownLatch, 0));
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                f8.g(e10, true);
            }
            return t0();
        }
        return t02;
    }

    public static int s1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t6.s1():int");
    }

    public static void t(View view, View view2, p6 p6Var) {
        if (view != null && view2 != null) {
            int[] iArr = wm;
            view.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            view2.getLocationOnScreen(iArr);
            if (view2 instanceof c91) {
                Bitmap bitmap = Y;
                if (bitmap != null) {
                    float width = bitmap.getWidth();
                    i10 = (int) ((((view2.getMeasuredWidth() - (Math.max(view2.getMeasuredWidth() / width, view2.getMeasuredHeight() / Y.getHeight()) * width)) / 2.0f) - ((c91) view2).I) + i10);
                } else {
                    i10 = (int) (i10 + (-((c91) view2).I));
                }
                i11 = (int) (i11 + (-((c91) view2).J));
            }
            if (p6Var != null) {
                p6Var.b(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
                return;
            }
            r(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
        }
    }

    public static Drawable t0() {
        Drawable drawable = f20960f0;
        if (drawable != null) {
            return drawable;
        }
        return f20942e0;
    }

    public static void t1(boolean z10, boolean z11) {
        boolean z12;
        SparseIntArray clone = hm.clone();
        r6 k10 = I.k(false);
        if (k10 != null) {
            z12 = k10.d(hm, clone);
        } else {
            z12 = true;
        }
        g(hm, clone, I.q());
        f(hm, clone, I.q());
        km = z12;
        im = clone;
        if (!z11) {
            u1(!(LaunchActivity.Q() instanceof un));
        }
        l();
        o();
        q();
        k(false, z10);
        org.telegram.messenger.i0.g3(new i9(3, !O));
    }

    public static void u(org.telegram.ui.ActionBar.s6 r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t6.u(org.telegram.ui.ActionBar.s6, boolean, boolean):void");
    }

    public static qv0 u0(int i10) {
        if (i10 < 0 || i10 > 5) {
            return null;
        }
        qv0[] qv0VarArr = f21239u3;
        qv0 qv0Var = qv0VarArr[i10];
        if (qv0Var != null) {
            return qv0Var;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                qv0VarArr[5] = new ip();
                            }
                        } else {
                            qv0VarArr[4] = new hl0(true);
                        }
                    } else {
                        qv0VarArr[3] = new lf0(null, true);
                    }
                } else {
                    qv0VarArr[2] = new eo0(true);
                }
            } else {
                qv0VarArr[1] = new ip(true);
            }
        } else {
            qv0VarArr[0] = new y41(true);
        }
        qv0 qv0Var2 = qv0VarArr[i10];
        qv0Var2.d();
        qv0Var2.b(x0(null, p9, false));
        return qv0Var2;
    }

    public static void u1(boolean z10) {
        a9 a9Var = V;
        if (a9Var != null) {
            a9Var.dispose();
            V = null;
        }
        Drawable drawable = f20942e0;
        if (drawable instanceof jb0) {
            S = ((jb0) drawable).f27285i;
        } else {
            S = 0;
        }
        f20942e0 = null;
        f20960f0 = null;
        o1(z10);
    }

    public static s6 v(File file, String str, TLRPC.TL_theme tL_theme, boolean z10) {
        File file2;
        String str2;
        try {
            if (!str.toLowerCase().endsWith(".attheme")) {
                str = str.concat(".attheme");
            }
            if (z10) {
                zs.e().k(zs.f19702u4, new Object[0]);
                s6 s6Var = new s6();
                s6Var.f20801a = str;
                s6Var.F = tL_theme;
                s6Var.f20803b = file.getAbsolutePath();
                s6Var.E = d20.f15147s0;
                M = D0();
                O = true;
                P = false;
                u(s6Var, false, false);
                return s6Var;
            }
            if (tL_theme != null) {
                str2 = "remote" + tL_theme.f19932id;
                file2 = new File(org.telegram.messenger.w0.h(), str2 + ".attheme");
            } else {
                file2 = new File(org.telegram.messenger.w0.h(), str);
                str2 = str;
            }
            if (!org.telegram.messenger.i0.E(file, file2)) {
                p();
                return null;
            }
            M = null;
            O = false;
            P = false;
            HashMap hashMap = H;
            s6 s6Var2 = (s6) hashMap.get(str2);
            if (s6Var2 == null) {
                s6Var2 = new s6();
                s6Var2.f20801a = str;
                s6Var2.E = d20.f15147s0;
                ArrayList arrayList = F;
                arrayList.add(s6Var2);
                G.add(s6Var2);
                Collections.sort(arrayList, new bk(27));
            } else {
                hashMap.remove(str2);
            }
            s6Var2.F = tL_theme;
            s6Var2.f20803b = file2.getAbsolutePath();
            hashMap.put(s6Var2.m(), s6Var2);
            y1(true, false);
            u(s6Var2, true, false);
            return s6Var2;
        } catch (Exception e10) {
            f8.g(e10, true);
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

    public static int w0(int i10, p6 p6Var) {
        Integer z02;
        if (p6Var != null) {
            if (p6Var.e() && (z02 = z0(i10, p6Var)) != null) {
                return z02.intValue();
            }
            return p6Var.h(i10);
        }
        return v0(i10);
    }

    public static void w1() {
        SharedPreferences.Editor edit = vp.d1().edit();
        edit.putInt("selectedAutoNightType", f21127o);
        edit.putBoolean("autoNightScheduleByLocation", f21146p);
        edit.putFloat("autoNightBrighnessThreshold", f21163q);
        edit.putInt("autoNightDayStartTime", f21179r);
        edit.putInt("autoNightDayEndTime", f21197s);
        edit.putInt("autoNightSunriseTime", v);
        edit.putString("autoNightCityName", f21270w);
        edit.putInt("autoNightSunsetTime", f21216t);
        edit.putLong("autoNightLocationLatitude3", Double.doubleToRawLongBits(f21288x));
        edit.putLong("autoNightLocationLongitude3", Double.doubleToRawLongBits(f21305y));
        edit.putInt("autoNightLastSunCheckDay", f21235u);
        s6 s6Var = J;
        if (s6Var != null) {
            edit.putString("nighttheme", s6Var.m());
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
        if (tz.H0 && (z02 = z0(i10, null)) != null) {
            return z02.intValue();
        }
        if (!z10 && (sparseIntArray = jm) != null && (indexOfKey = sparseIntArray.indexOfKey(i10)) >= 0) {
            return jm.valueAt(indexOfKey);
        }
        return y0(im, i10, zArr);
    }

    public static void x1(org.telegram.ui.ActionBar.s6 r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t6.x1(org.telegram.ui.ActionBar.s6, boolean, boolean, boolean):void");
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t6.y0(android.util.SparseIntArray, int, boolean[]):int");
    }

    public static void y1(boolean z10, boolean z11) {
        String str;
        boolean z12;
        ArrayList arrayList;
        Integer num;
        JSONObject jSONObject;
        int i10 = 0;
        SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("themeconfig", 0).edit();
        if (z10) {
            JSONArray jSONArray = new JSONArray();
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = G;
                if (i11 >= arrayList2.size()) {
                    break;
                }
                s6 s6Var = (s6) arrayList2.get(i11);
                s6Var.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("name", s6Var.f20801a);
                    jSONObject.put("path", s6Var.f20803b);
                    jSONObject.put("account", s6Var.E);
                    TLRPC.TL_theme tL_theme = s6Var.F;
                    if (tL_theme != null) {
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        s6Var.F.serializeToStream(serializedData);
                        jSONObject.put("info", Utilities.f(serializedData.toByteArray()));
                    }
                    jSONObject.put("loaded", s6Var.G);
                } catch (Exception e10) {
                    f8.g(e10, true);
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
                s6 s6Var2 = (s6) H.get(str);
                if (s6Var2 == null || (arrayList = s6Var2.f20804b0) == null || arrayList.isEmpty()) {
                    z12 = z11;
                } else {
                    z12 = z11;
                    z1(s6Var2, true, false, false, false, z12);
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

    public static Integer z0(int i10, p6 p6Var) {
        int i11;
        if (i1(p6Var) && i10 >= 0 && i10 < (i11 = f20965f5)) {
            if (zm == null) {
                zm = new int[i11];
                q1(2, Ma, gc, f20897bc, Fb, Gb);
                q1(3, Ra, f20899be, f20918ce, f21083ld, f21102md);
                q1(1, Na, xb, f21316yb, zb, Ab, Bb, Cb);
                q1(1, Pa, Ob, Pb);
                q1(1, Qa, Qb, Rb, Sb, Tb);
                q1(1, Ya, Jb, Kb, Lb, Mb, Nb, Nc, Vb, Wb, f21007hc, f21229tc, Dc, Hb, Ib, Hd, Ub, f20916cc, f20935dc);
                q1(1, Za, Bc, Cc, Ec, f21121nc, qc);
                q1(1, f20876ab, Db, Eb, Fc, f20952ec, f20971fc);
                q1(2, f20896bb, f21247uc, vc, f21317yc, f21335zc, f21025ic, f21044jc);
                q1(2, f20915cb, f21064kc, f21101mc, f21140oc, f21157pc, rc, f21210sc, f21282wc, f21300xc, gl, pl);
                q1(2, f20934db, il, kl);
                q1(1, Ua, f20991ge, he);
                q1(1, Va, f21142oe);
                q1(1, Wa, f21103me, f21123ne);
                q1(1, Xa, qk);
                q1(1, Fa, Ad, Fd, Ld, Pd);
            }
            int i12 = zm[i10];
            if (i12 != 0) {
                int i13 = 65535 & i12;
                int i14 = i12 >> 16;
                int i15 = ua;
                if (i14 != 2) {
                    if (i14 != 3) {
                        return Integer.valueOf(w0(i13, p6Var));
                    }
                    return Integer.valueOf(i0.b.k(w0(i13, p6Var), w0(i15, p6Var)));
                }
                return Integer.valueOf(i0.b.k(w0(i13, p6Var), i0.b.k(w0(La, p6Var), w0(i15, p6Var))));
            }
            return null;
        }
        return null;
    }

    public static void z1(s6 s6Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        if (z10) {
            SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("themeconfig", 0).edit();
            if (!z12) {
                int size = s6Var.f20804b0.size();
                int max = Math.max(0, size - s6Var.W);
                SerializedData serializedData = new SerializedData(((max * 16) + 2) * 4);
                serializedData.writeInt32(9);
                serializedData.writeInt32(max);
                for (int i10 = 0; i10 < size; i10++) {
                    r6 r6Var = (r6) s6Var.f20804b0.get(i10);
                    int i11 = r6Var.f20730a;
                    if (i11 >= 100) {
                        serializedData.writeInt32(i11);
                        serializedData.writeInt32(r6Var.f20732c);
                        serializedData.writeInt32(r6Var.d);
                        serializedData.writeInt32(r6Var.e);
                        serializedData.writeInt32(r6Var.f20733f);
                        serializedData.writeInt32(r6Var.f20734g);
                        serializedData.writeInt32(r6Var.h);
                        serializedData.writeBool(r6Var.f20735i);
                        serializedData.writeInt64(r6Var.f20736j);
                        serializedData.writeInt64(r6Var.f20737k);
                        serializedData.writeInt64(r6Var.f20738l);
                        serializedData.writeInt64(r6Var.f20739m);
                        serializedData.writeInt32(r6Var.f20740n);
                        serializedData.writeInt64(0L);
                        serializedData.writeDouble(r6Var.f20742p);
                        serializedData.writeBool(r6Var.f20743q);
                        serializedData.writeString(r6Var.f20741o);
                        if (r6Var.f20744r != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        serializedData.writeBool(z15);
                        if (r6Var.f20744r != null) {
                            serializedData.writeInt32(r6Var.f20746t);
                            r6Var.f20744r.serializeToStream(serializedData);
                        }
                    }
                }
                edit.putString("accents_" + s6Var.d, Base64.encodeToString(serializedData.toByteArray(), 3));
                if (!z14) {
                    zs.e().k(zs.f19674q4, new Object[0]);
                }
                if (z13) {
                    vp.r1(d20.f15147s0).v4(s6Var, s6Var.k(false));
                }
            }
            edit.putInt("accent_current_" + s6Var.d, s6Var.Y);
            edit.commit();
        } else {
            if (s6Var.Z != -1) {
                if (z11) {
                    r6 r6Var2 = (r6) s6Var.f20802a0.get(s6Var.Y);
                    s6Var.f20802a0.remove(r6Var2.f20730a);
                    s6Var.f20804b0.remove(r6Var2);
                    TLRPC.TL_theme tL_theme = r6Var2.f20744r;
                    if (tL_theme != null) {
                        s6Var.f20806c0.remove(tL_theme.f19932id);
                    }
                }
                s6Var.Y = s6Var.Z;
                r6 k10 = s6Var.k(false);
                if (k10 != null) {
                    s6Var.f20813i0 = k10.f20750y;
                } else {
                    s6Var.f20813i0 = null;
                }
            }
            if (I == s6Var) {
                t1(false, false);
            }
        }
        s6Var.Z = -1;
    }
}
