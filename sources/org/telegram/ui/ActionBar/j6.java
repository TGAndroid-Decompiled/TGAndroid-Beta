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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.gg0;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.l8;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.r9;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w10;
import org.telegram.ui.Components.x10;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.ld1;
public abstract class j6 {
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
    public static m2.t Al;
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
    public static final p5 Dl;
    public static TextPaint E0;
    public static int E1;
    public static TextPaint E2;
    public static kc0 E3;
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
    public static xi0 H1;
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
    public static i6 I;
    public static TextPaint I0;
    public static xi0 I1;
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
    public static i6 J;
    public static TextPaint J0;
    public static xi0 J1;
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
    public static i6 K;
    public static TextPaint K0;
    public static xi0 K1;
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
    public static final i6 L;
    public static TextPaint L0;
    public static xi0 L1;
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
    public static i6 M;
    public static TextPaint M0;
    public static xi0 M1;
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
    public static xi0 N1;
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
    public static xi0 O1;
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
    public static r9 V;
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
    public static kc0 X0;
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
    public static Matrix f20629a0;
    public static Drawable f20630a1;
    public static Paint a2;
    public static TextPaint f20631a3;
    public static Drawable f20632a4;
    public static final int f20634a6;
    public static final int f20635a7;
    public static final int f20636a8;
    public static final int f20637a9;
    public static final int f20638aa;
    public static final int f20639ab;
    public static final int f20640ac;
    public static final int f20641ad;
    public static final int f20642ae;
    public static final int f20643af;
    public static final int f20644ag;
    public static final int f20645ah;
    public static final int f20646ai;
    public static final int aj;
    public static final int ak;
    public static final int al;
    public static boolean f20647b;
    public static int f20648b0;
    public static Drawable f20649b1;
    public static Paint f20650b2;
    public static TextPaint f20651b3;
    public static Drawable f20652b4;
    public static Drawable f20653b5;
    public static final int f20654b6;
    public static final int f20655b7;
    public static final int f20656b8;
    public static final int f20657b9;
    public static final int f20658ba;
    public static final int f20659bb;
    public static final int f20660bc;
    public static final int bd;
    public static final int f20661be;
    public static final int f20662bf;
    public static final int f20663bg;
    public static final int f20664bh;
    public static final int f20665bi;
    public static final int bj;
    public static final int bk;
    public static final int bl;
    public static int f20667c0;
    public static Drawable f20668c1;
    public static Paint f20669c2;
    public static TextPaint f20670c3;
    public static Drawable f20671c4;
    public static Drawable f20672c5;
    public static final int f20673c6;
    public static final int f20674c7;
    public static final int f20675c8;
    public static final int f20676c9;
    public static final int f20677ca;
    public static final int cb;
    public static final int f20678cc;
    public static final int f20679cd;
    public static final int f20680ce;
    public static final int f20681cf;
    public static final int f20682cg;
    public static final int f20683ch;
    public static final int f20684ci;
    public static final int cj;
    public static final int ck;
    public static final int cl;
    public static hg.v0 d;
    public static int f20685d0;
    public static Drawable f20686d1;
    public static Paint f20687d2;
    public static TextPaint f20688d3;
    public static Drawable f20689d4;
    public static l8 f20690d5;
    public static final int f20691d6;
    public static final int f20692d7;
    public static final int f20693d8;
    public static final int f20694d9;
    public static final int f20695da;
    public static final int f20696db;
    public static final int f20697dc;
    public static final int f20698dd;
    public static final int f20699de;
    public static final int f20700df;
    public static final int f20701dg;
    public static final int f20702dh;
    public static final int f20703di;
    public static final int dj;
    public static final int dk;
    public static final int dl;
    public static SensorManager f20704e;
    public static Drawable f20705e0;
    public static Drawable f20706e1;
    public static Paint f20707e2;
    public static TextPaint f20708e3;
    public static Drawable f20709e4;
    public static HashMap f20710e5;
    public static final int f20711e6;
    public static final int e7;
    public static final int f20712e8;
    public static final int f20713e9;
    public static final int f20714ea;
    public static final int f20715eb;
    public static final int ec;
    public static final int f20716ed;
    public static final int f20717ee;
    public static final int f20718ef;
    public static final int eg;
    public static final int f20719eh;
    public static final int f20720ei;
    public static final int ej;
    public static final int ek;
    public static final int el;
    public static Sensor f20721f;
    public static Drawable f20722f0;
    public static Drawable f20723f1;
    public static Paint f20724f2;
    public static TextPaint f20725f3;
    public static Drawable f20726f4;
    public static final int f20727f5;
    public static final int f20728f6;
    public static final int f7;
    public static final int f20729f8;
    public static final int f20730f9;
    public static final int f20731fa;
    public static final int f20732fb;
    public static final int f20733fc;
    public static final int f20734fd;
    public static final int fe;
    public static final int f20735ff;
    public static final int f20736fg;
    public static final int f20737fh;
    public static final int f20738fi;
    public static final int fj;
    public static final int fk;
    public static final int fl;
    public static boolean f20739g;
    public static int f20740g0;
    public static xl0 f20741g1;
    public static Paint f20742g2;
    public static TextPaint f20743g3;
    public static Drawable f20744g4;
    public static final int f20745g5;
    public static final int f20746g6;
    public static final int f20747g7;
    public static final int f20748g8;
    public static final int f20749g9;
    public static final int ga;
    public static final int f20750gb;
    public static final int gc;
    public static final int f20751gd;
    public static final int f20752ge;
    public static final int f20753gf;
    public static final int f20754gg;
    public static final int f20755gh;
    public static final int f20756gi;
    public static final int gj;
    public static final int gk;
    public static final int gl;
    public static String f20757h0;
    public static xl0 f20758h1;
    public static Paint f20759h2;
    public static Drawable f20760h3;
    public static Drawable f20761h4;
    public static final int f20762h5;
    public static final int f20763h6;
    public static final int f20764h7;
    public static final int f20765h8;
    public static final int f20766h9;
    public static final int ha;
    public static final int f20767hb;
    public static final int f20768hc;
    public static final int f20769hd;
    public static final int f20770he;
    public static final int hf;
    public static final int f20771hg;
    public static final int f20772hh;
    public static final int f20773hi;
    public static final int hj;
    public static final int hk;
    public static final int hl;
    public static long f20774i;
    public static boolean f20775i0;
    public static Drawable f20776i1;
    public static Paint f20777i2;
    public static Drawable f20778i3;
    public static Drawable f20779i4;
    public static final int f20780i5;
    public static final int f20781i6;
    public static final int f20782i7;
    public static final int f20783i8;
    public static final int f20784i9;
    public static final int f20785ia;
    public static final int f20786ib;
    public static final int f20787ic;
    public static final int f20788id;
    public static final int f20789ie;
    public static final int f20790ig;
    public static final int f20791ih;
    public static final int f20792ii;
    public static final int ij;
    public static final int ik;
    public static final int il;
    public static boolean f20793j;
    public static boolean f20794j0;
    public static Drawable f20795j1;
    public static Paint f20796j2;
    public static Drawable j3;
    public static Drawable f20797j4;
    public static final int f20798j5;
    public static final int f20799j6;
    public static final int f20800j7;
    public static final int f20801j8;
    public static final int f20802j9;
    public static final int f20803ja;
    public static final int f20804jb;
    public static final int f20805jc;
    public static final int f20806jd;
    public static final int f20807je;
    public static final int f20808jf;
    public static final int f20809jg;
    public static final int f20810jh;
    public static final int f20811ji;
    public static final int jj;
    public static final int jk;
    public static final HashMap jl;
    public static boolean f20812k;
    public static Paint f20813k0;
    public static Drawable f20814k1;
    public static Paint f20815k2;
    public static h5 f20816k3;
    public static Drawable f20817k4;
    public static final int f20818k5;
    public static final int f20819k6;
    public static final int f20820k7;
    public static final int f20821k8;
    public static final int f20822k9;
    public static final int f20823ka;
    public static final int f20824kb;
    public static final int f20825kc;
    public static final int f20826kd;
    public static final int f20827ke;
    public static final int f20828kf;
    public static final int f20829kg;
    public static final int f20830kh;
    public static final int f20831ki;
    public static final int kj;
    public static final int kk;
    public static final HashMap kl;
    public static Paint f20833l0;
    public static Drawable l1;
    public static Paint f20834l2;
    public static Drawable f20835l3;
    public static Drawable l4;
    public static final int f20836l5;
    public static final int f20837l6;
    public static final int f20838l7;
    public static final int f20839l8;
    public static final int f20840l9;
    public static final int f20841la;
    public static final int f20842lb;
    public static final int f20843lc;
    public static final int f20844ld;
    public static final int f20845le;
    public static final int f20846lf;
    public static final int f20847lg;
    public static final int f20848lh;
    public static final int li;
    public static final int lj;
    public static final int lk;
    public static final HashMap ll;
    public static Paint m0;
    public static Drawable f20850m1;
    public static Paint f20851m2;
    public static f5 f20852m3;
    public static Drawable f20853m4;
    public static final int f20854m5;
    public static final int f20855m6;
    public static final int f20856m7;
    public static final int f20857m8;
    public static final int f20858m9;
    public static final int f20859ma;
    public static final int f20860mb;
    public static final int f20861mc;
    public static final int f20862md;
    public static final int f20863me;
    public static final int f20864mf;
    public static final int f20865mg;
    public static final int f20866mh;
    public static final int mi;
    public static final int mj;
    public static final int mk;
    public static final HashMap ml;
    public static Paint f20868n0;
    public static Drawable f20869n1;
    public static Paint f20870n2;
    public static f5 f20871n3;
    public static Drawable f20872n4;
    public static final int f20873n5;
    public static final int f20874n6;
    public static final int f20875n7;
    public static final int f20876n8;
    public static final int f20877n9;
    public static final int f20878na;
    public static final int nb;
    public static final int nc;
    public static final int f20879nd;
    public static final int ne;
    public static final int f20880nf;
    public static final int f20881ng;
    public static final int f20882nh;
    public static final int ni;
    public static final int nj;
    public static final int nk;
    public static final int[] nl;
    public static int f20883o;
    public static Paint f20884o0;
    public static Drawable f20885o1;
    public static TextPaint f20886o2;
    public static f5 f20887o3;
    public static Drawable f20888o4;
    public static final int f20889o5;
    public static final int f20890o6;
    public static final int f20891o7;
    public static final int f20892o8;
    public static final int o9;
    public static final int f20893oa;
    public static final int f20894ob;
    public static final int f20895oc;
    public static final int f20896od;
    public static final int f20897oe;
    public static final int f20898of;
    public static final int f20899og;
    public static final int f20900oh;
    public static final int oi;
    public static final int oj;
    public static final int ok;
    public static final SparseIntArray ol;
    public static boolean f20901p;
    public static Paint f20902p0;
    public static Drawable f20903p1;
    public static TextPaint f20904p2;
    public static f5 f20905p3;
    public static Drawable f20906p4;
    public static final int p5;
    public static final int f20907p6;
    public static final int f20908p7;
    public static final int[] f20909p8;
    public static final int f20910p9;
    public static final int f20911pa;
    public static final int f20912pb;
    public static final int f20913pc;
    public static final int f20914pd;
    public static final int f20915pe;
    public static final int f20916pf;
    public static final int f20917pg;
    public static final int f20918ph;
    public static final int pi;
    public static final int pj;
    public static final int pk;
    public static final HashSet pl;
    public static float f20919q;
    public static Paint f20920q0;
    public static Drawable f20921q1;
    public static TextPaint f20922q2;
    public static f5 f20923q3;
    public static Drawable f20924q4;
    public static final int f20925q5;
    public static final int q6;
    public static final int f20926q7;
    public static final int[] f20927q8;
    public static final int f20928q9;
    public static final int f20929qa;
    public static final int f20930qb;
    public static final int f20931qc;
    public static final int f20932qd;
    public static final int f20933qe;
    public static final int f20934qf;
    public static final int f20935qg;
    public static final int f20936qh;
    public static final int qi;
    public static final int qj;
    public static final int qk;
    public static SparseIntArray ql;
    public static int f20937r;
    public static Drawable f20939r1;
    public static TextPaint f20940r2;
    public static f5 f20941r3;
    public static Drawable f20942r4;
    public static final int f20943r5;
    public static final int f20944r6;
    public static final int f20945r7;
    public static final int[] f20946r8;
    public static final int f20947r9;
    public static final int f20948ra;
    public static final int f20949rb;
    public static final int f20950rc;
    public static final int f20951rd;
    public static final int f20952re;
    public static final int f20953rf;
    public static final int f20954rg;
    public static final int f20955rh;
    public static final int ri;
    public static final int rj;
    public static final int rk;
    public static SparseIntArray rl;
    public static int f20956s;
    public static Drawable f20957s0;
    public static Drawable f20958s1;
    public static TextPaint f20959s2;
    public static f5 f20960s3;
    public static Drawable f20961s4;
    public static final int f20962s5;
    public static final int f20963s6;
    public static final int f20964s7;
    public static final int f20965s8;
    public static final int f20966s9;
    public static final int f20967sa;
    public static final int f20968sb;
    public static final int f20969sc;
    public static final int f20970sd;
    public static final int f20971se;
    public static final int f20972sf;
    public static final int f20973sg;
    public static final int f20974sh;
    public static final int si;
    public static final int sj;
    public static final int sk;
    public static SparseIntArray sl;
    public static int f20975t;
    public static Paint f20976t0;
    public static Drawable f20977t1;
    public static TextPaint f20978t2;
    public static f5 f20979t3;
    public static Drawable f20980t4;
    public static final int f20981t5;
    public static final int f20982t6;
    public static final int f20983t7;
    public static final int f20984t8;
    public static final int f20985t9;
    public static final int ta;
    public static final int f20986tb;
    public static final int f20987tc;
    public static final int f20988td;
    public static final int f20989te;
    public static final int f20990tf;
    public static final int f20991tg;
    public static final int f20992th;
    public static final int ti;
    public static final int tj;
    public static final int tk;
    public static boolean tl;
    public static int f20993u;
    public static Paint f20994u0;
    public static xi0 f20995u1;
    public static TextPaint f20996u2;
    public static Drawable f20998u4;
    public static final int f20999u5;
    public static final int f21000u6;
    public static final int f21001u7;
    public static final int f21002u8;
    public static final int f21003u9;
    public static final int f21004ua;
    public static final int f21005ub;
    public static final int f21006uc;
    public static final int f21007ud;
    public static final int f21008ue;
    public static final int f21009uf;
    public static final int f21010ug;
    public static final int f21011uh;
    public static final int ui;
    public static final int uj;
    public static final int uk;
    public static final ThreadLocal ul;
    public static int v;
    public static Paint f21012v0;
    public static xi0 f21013v1;
    public static TextPaint f21014v2;
    public static PorterDuffColorFilter f21015v3;
    public static Drawable f21016v4;
    public static final int f21017v5;
    public static final int f21018v6;
    public static final int f21019v7;
    public static final int f21020v8;
    public static final int v9;
    public static final int f21021va;
    public static final int f21022vb;
    public static final int f21023vc;
    public static final int f21024vd;
    public static final int f21025ve;
    public static final int f21026vf;
    public static final int f21027vg;
    public static final int f21028vh;
    public static final int vi;
    public static final int vj;
    public static final int vk;
    public static final ThreadLocal vl;
    public static String f21029w;
    public static Paint f21030w0;
    public static xi0 f21031w1;
    public static TextPaint f21032w2;
    public static PorterDuffColorFilter f21033w3;
    public static Drawable f21034w4;
    public static final int f21035w5;
    public static final int f21036w6;
    public static final int f21037w7;
    public static final int f21038w8;
    public static final int f21039w9;
    public static final int f21040wa;
    public static final int f21041wb;
    public static final int wc;
    public static final int f21042wd;
    public static final int f21043we;
    public static final int wf;
    public static final int f21044wg;
    public static final int f21045wh;
    public static final int wi;
    public static final int wj;
    public static final int wk;
    public static final ThreadLocal wl;
    public static double f21046x;
    public static Paint f21047x0;
    public static xi0 f21048x1;
    public static TextPaint f21049x2;
    public static zd0 f21050x3;
    public static Drawable f21051x4;
    public static final int f21052x5;
    public static final int f21053x6;
    public static final int f21054x7;
    public static final int f21055x8;
    public static final int f21056x9;
    public static final int f21057xa;
    public static final int f21058xb;
    public static final int xc;
    public static final int f21059xd;
    public static final int f21060xe;
    public static final int f21061xf;
    public static final int f21062xg;
    public static final int f21063xh;
    public static final int xi;
    public static final int xj;
    public static final int xk;
    public static final ThreadLocal xl;
    public static double f21064y;
    public static Paint f21065y0;
    public static xi0 f21066y1;
    public static TextPaint[] f21067y2;
    public static Drawable y3;
    public static Drawable f21068y4;
    public static final int f21069y5;
    public static final int f21070y6;
    public static final int f21071y7;
    public static final int f21072y8;
    public static final int f21073y9;
    public static final int f21074ya;
    public static final int f21075yb;
    public static final int f21076yc;
    public static final int f21077yd;
    public static final int f21078ye;
    public static final int f21079yf;
    public static final int f21080yg;
    public static final int f21081yh;
    public static final int yi;
    public static final int yj;
    public static final int yk;
    public static final ThreadLocal yl;
    public static Paint f21083z0;
    public static xi0 f21084z1;
    public static TextPaint f21085z2;
    public static Drawable f21086z3;
    public static Drawable f21087z4;
    public static final int f21088z5;
    public static final int f21089z6;
    public static final int f21090z7;
    public static final int f21091z8;
    public static final int f21092z9;
    public static final int f21093za;
    public static final int f21094zb;
    public static final int f21095zc;
    public static final int f21096zd;
    public static final int f21097ze;
    public static final int f21098zf;
    public static final int f21099zg;
    public static final int f21100zh;
    public static final int zi;
    public static final int zj;
    public static final int zk;
    public static x10 zl;
    public static final int f20628a = i0.a.k(-16777216, 27);
    public static final Object f20666c = new Object();
    public static float h = 1.0f;
    public static final androidx.emoji2.text.n f20832l = new androidx.emoji2.text.n(3);
    public static final androidx.emoji2.text.n f20849m = new androidx.emoji2.text.n(4);
    public static final int f20867n = 99;
    public static final Paint f21082z = new Paint(1);
    public static final boolean[] C = new boolean[4];
    public static final int[] D = new int[4];
    public static final long[] E = new long[4];
    public static final Drawable[] f20938r0 = new Drawable[25];
    public static final kw0[] f20997u3 = new kw0[6];
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
    public static final Path[] f20633a5 = new Path[3];

    static {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.j6.<clinit>():void");
    }

    public static void A() {
        if (f20883o != 2) {
            if (f20812k) {
                f20812k = false;
                AndroidUtilities.cancelRunOnUIThread(f20849m);
            }
            if (f20793j) {
                f20793j = false;
                AndroidUtilities.cancelRunOnUIThread(f20832l);
            }
            if (f20739g) {
                h = 1.0f;
                f20704e.unregisterListener(Dl, f20721f);
                f20739g = false;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("light sensor unregistered");
                }
            }
        }
    }

    public static i6 A0() {
        i6 i6Var = K;
        if (i6Var != null) {
            return i6Var;
        }
        return L;
    }

    public static void A1(org.telegram.ui.Cells.z zVar, int i10, int i11) {
        if (com.google.android.gms.internal.vision.e2.u(zVar)) {
            int numberOfLayers = zVar.getNumberOfLayers();
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                Drawable drawable = zVar.getDrawable(i12);
                if (drawable instanceof g6) {
                    g6 g6Var = (g6) drawable;
                    float f10 = i10;
                    float f11 = i11;
                    float[] fArr = g6Var.f20500b;
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
                    g6Var.f20501c = true;
                    g6Var.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static int B(i6 i6Var, int i10, int i11) {
        int i12;
        if (i10 != 0 && (i12 = i6Var.X) != 0 && i10 != i12 && (!i6Var.S || i6Var.Y != f20867n)) {
            float[] M02 = M0(3);
            float[] M03 = M0(4);
            Color.colorToHSV(i6Var.X, M02);
            Color.colorToHSV(i10, M03);
            return D(M02, M03, i11, i6Var.q(), i11);
        }
        return i11;
    }

    public static int B0(int i10) {
        int indexOfKey = ql.indexOfKey(i10);
        if (indexOfKey < 0) {
            return 0;
        }
        int valueAt = ql.valueAt(indexOfKey);
        h6 k10 = I.k(false);
        if (k10 == null) {
            return 0;
        }
        float[] M02 = M0(1);
        float[] M03 = M0(2);
        Color.colorToHSV(I.X, M02);
        Color.colorToHSV(k10.f20520c, M03);
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
            if ((i10 < f21093za || i10 >= Ga) && i10 != D9 && i10 != N9 && i10 != E9 && i10 != Pd && i10 != Qd) {
                return -65536;
            }
            return 0;
        }
        return i11;
    }

    public static void C1(i6 i6Var, h6 h6Var, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
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
                if (i6Var == null) {
                    String q02 = q0(themeSettings);
                    if (q02 != null && (i6Var = (i6) hashMap.get(q02)) != null) {
                        h6Var = (h6) i6Var.f20573c0.get(tL_theme.f20033id);
                    } else {
                        return;
                    }
                }
                if (h6Var != null) {
                    TLRPC.TL_theme tL_theme2 = h6Var.f20533r;
                    if (tL_theme2 != null) {
                        i6Var.f20573c0.remove(tL_theme2.f20033id);
                    }
                    h6Var.f20533r = tL_theme;
                    h6Var.f20535t = i10;
                    i6Var.f20573c0.put(tL_theme.f20033id, h6Var);
                    if (!i6.a(h6Var, themeSettings)) {
                        File d10 = h6Var.d();
                        if (d10 != null) {
                            d10.delete();
                        }
                        i6.i(h6Var, themeSettings);
                        i6 i6Var2 = I;
                        if (i6Var2 == i6Var && i6Var2.Y == h6Var.f20518a) {
                            n1(false, false);
                            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                            int i11 = NotificationCenter.needSetDayNightTheme;
                            i6 i6Var3 = I;
                            if (J == i6Var3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            globalInstance.lambda$postNotificationNameOnUIThread$1(i11, i6Var3, Boolean.valueOf(z12), null, -1);
                        }
                        e6.a(true);
                    }
                    TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                    if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.motion) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h6Var.f20532q = z11;
                    i6Var.T = false;
                } else {
                    return;
                }
            } else {
                if (i6Var != null) {
                    str = i6Var.m();
                    hashMap.remove(str);
                } else {
                    str = "remote" + tL_theme.f20033id;
                    i6Var = (i6) hashMap.get(str);
                }
                if (i6Var == null) {
                    return;
                }
                i6Var.F = tL_theme;
                i6Var.f20568a = tL_theme.title;
                File file = new File(i6Var.f20570b);
                File file2 = new File(ApplicationLoader.getFilesDirFixed(), p6.t(str, ".attheme"));
                if (!file.equals(file2)) {
                    try {
                        AndroidUtilities.copyFile(file, file2);
                        i6Var.f20570b = file2.getAbsolutePath();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (z10) {
                    i6Var.G = false;
                    i6Var.f20579g0 = null;
                    i6Var.f20580h0 = null;
                    NotificationCenter.getInstance(i6Var.E).addObserver(i6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i6Var.E).addObserver(i6Var, NotificationCenter.fileLoadFailed);
                    FileLoader fileLoader = FileLoader.getInstance(i6Var.E);
                    TLRPC.TL_theme tL_theme3 = i6Var.F;
                    fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                } else {
                    i6Var.T = false;
                }
                hashMap.put(i6Var.m(), i6Var);
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
        float A10 = a4.a.A(0.39999998f, computePerceivedBrightness, computePerceivedBrightness2, 0.6f);
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

    public static x10 D0() {
        if (zl == null) {
            ?? obj = new Object();
            obj.f32420a = new w10[4];
            obj.f32428k = 1.0f;
            obj.f32429l = new ArrayList();
            obj.f32430m = new Paint(1);
            obj.f32431n = new Path();
            for (int i10 = 0; i10 < 4; i10++) {
                obj.f32420a[i10] = new w10(i10);
            }
            zl = obj;
        }
        return zl;
    }

    public static void D1(i6 i6Var) {
        Collections.sort(i6Var.f20571b0, new a4.e(28));
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
                if (f20812k) {
                    f20812k = false;
                    AndroidUtilities.cancelRunOnUIThread(f20849m);
                }
                if (f20793j) {
                    f20793j = false;
                    AndroidUtilities.cancelRunOnUIThread(f20832l);
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
                f20774i = 0L;
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
        i6 i6Var;
        int i10;
        if (A == 0) {
            if (z10 || Math.abs((System.currentTimeMillis() / 1000) - B) >= 3600) {
                for (int i11 = 0; i11 < 2; i11++) {
                    if (i11 == 0) {
                        i6Var = K;
                    } else {
                        i6Var = J;
                    }
                    if (i6Var != null && UserConfig.getInstance(i6Var.E).isClientActivated()) {
                        h6 k10 = i6Var.k(false);
                        TLRPC.TL_theme tL_theme = i6Var.F;
                        if (tL_theme != null) {
                            i10 = i6Var.E;
                        } else if (k10 != null && (tL_theme = k10.f20533r) != null) {
                            i10 = UserConfig.selectedAccount;
                        }
                        if (tL_theme.document != null) {
                            A++;
                            TL_account.getTheme gettheme = new TL_account.getTheme();
                            gettheme.document_id = tL_theme.document.f19902id;
                            gettheme.format = "android";
                            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                            tL_inputTheme.access_hash = tL_theme.access_hash;
                            tL_inputTheme.f19967id = tL_theme.f20033id;
                            gettheme.theme = tL_inputTheme;
                            ConnectionsManager.getInstance(i10).sendRequest(gettheme, new bi.c5(k10, i6Var, tL_theme, 7));
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

    public static void F1(n2 n2Var) {
        String string;
        if (f20883o != 0) {
            if (n2Var != null) {
                try {
                    yc a02 = yc.a0(n2Var);
                    int i10 = R.raw.auto_night_off;
                    if (f20883o == 3) {
                        string = LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff);
                    } else {
                        string = LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff);
                    }
                    a02.I(i10, string, LocaleController.getString("Settings", R.string.Settings), 5000, false, new q(n2Var, 17)).j();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            f20883o = 0;
            q1();
            A();
        }
    }

    public static void G(SparseIntArray sparseIntArray, i6 i6Var) {
        if (i6Var != null && i6Var.f20582j0 == -1) {
            int i10 = f20691d6;
            if (i0.a.f(i0.a.d(0.5f, F0(sparseIntArray, i10), F0(sparseIntArray, i10))) < 0.5d) {
                i6Var.f20582j0 = 1;
            } else {
                i6Var.f20582j0 = 0;
            }
        }
    }

    public static org.telegram.ui.Cells.z G0(int i10, int i11) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i11 & 16777215) | 419430400}), null, b0(i10, -1));
    }

    public static void G1(MessageObject messageObject) {
        l8 l8Var = f20690d5;
        if (l8Var == null) {
            return;
        }
        if (l8Var.f28121i != null && messageObject != null) {
            if (f20710e5 == null) {
                f20710e5 = new HashMap();
            }
            f20710e5.put(messageObject, f20690d5);
            f20690d5.e(false, true, null);
            AndroidUtilities.runOnUIThread(new q(messageObject, 18), 200L);
            f20690d5 = null;
            return;
        }
        l8Var.f28121i = null;
    }

    public static cf.c H(i6 i6Var, SparseIntArray sparseIntArray, String str, int i10, boolean z10) {
        boolean z11;
        File file;
        boolean z12;
        float f10;
        float f11;
        if (i6Var.S && i6Var.Y == f20867n) {
            z11 = true;
        } else {
            z11 = false;
        }
        h6 k10 = i6Var.k(false);
        if (k10 != null) {
            file = k10.d();
        } else {
            file = null;
        }
        if (k10 != null && k10.f20532q) {
            z12 = true;
        } else {
            z12 = false;
        }
        b6 b6Var = i6Var.f20581i0;
        if (b6Var != null) {
            f11 = b6Var.f20310k;
        } else if (k10 != null) {
            f11 = k10.f20531p;
        } else {
            f10 = i6Var.f20588y;
            return I(i6Var, b6Var, sparseIntArray, file, str, ql.get(f20745g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
        }
        f10 = f11 * 100.0f;
        return I(i6Var, b6Var, sparseIntArray, file, str, ql.get(f20745g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
    }

    public static String H0() {
        b6 b6Var = I.f20581i0;
        if (b6Var != null) {
            return b6Var.f20304c;
        }
        if (d1()) {
            return "t";
        }
        return "d";
    }

    public static cf.c I(org.telegram.ui.ActionBar.i6 r24, org.telegram.ui.ActionBar.b6 r25, android.util.SparseIntArray r26, java.io.File r27, java.lang.String r28, int r29, int r30, int r31, boolean r32, boolean r33, boolean r34, boolean r35, org.telegram.tgnet.TLRPC.Document r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.j6.I(org.telegram.ui.ActionBar.i6, org.telegram.ui.ActionBar.b6, android.util.SparseIntArray, java.io.File, java.lang.String, int, int, int, boolean, boolean, boolean, boolean, org.telegram.tgnet.TLRPC$Document, boolean):cf.c");
    }

    public static org.telegram.ui.Cells.z I0(int i10, int i11, f6 f6Var) {
        if (i11 >= 0) {
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), new ColorDrawable(v0(i11, f6Var)), new ColorDrawable(-1));
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
        if (!z10 && f20852m3 == null) {
            Resources resources = context.getResources();
            f20760h3 = resources.getDrawable(R.drawable.video_muted);
            f20835l3 = resources.getDrawable(R.drawable.media_live_on).mutate();
            f20852m3 = new f5(0, false, false, null);
            f20871n3 = new f5(0, false, true, null);
            f20887o3 = new f5(0, true, false, null);
            f20905p3 = new f5(0, true, true, null);
            f20923q3 = new f5(1, false, false, null);
            f20941r3 = new f5(1, false, true, null);
            f20960s3 = new f5(1, true, false, null);
            f20979t3 = new f5(1, true, true, null);
            ?? obj = new Object();
            obj.f33167a = new Path();
            obj.f33168b = -1.0f;
            obj.f33172g = new ArrayList();
            obj.f33169c = 0.293f;
            obj.d = -26.0f;
            obj.f33170e = -28.0f;
            obj.f33171f = 1.0f;
            f21050x3 = obj;
            obj.a("M 34.141 16.042 C 37.384 17.921 40.886 20.001 44.211 21.965 C 46.139 23.104 49.285 24.729 49.586 25.917 C 50.289 28.687 48.484 30 46.274 30 L 6 30.021 C 3.79 30.021 2.075 30.023 2 26.021 L 2.009 3.417 C 2.009 0.417 5.326 -0.58 7.068 0.417 C 10.545 2.406 25.024 10.761 34.141 16.042 Z", 166.0f);
            f21050x3.a("M 37.843 17.769 C 41.143 19.508 44.131 21.164 47.429 23.117 C 48.542 23.775 49.623 24.561 49.761 25.993 C 50.074 28.708 48.557 30 46.347 30 L 6 30.012 C 3.79 30.012 2 28.222 2 26.012 L 2.009 4.609 C 2.009 1.626 5.276 0.664 7.074 1.541 C 10.608 3.309 28.488 12.842 37.843 17.769 Z", 200.0f);
            f21050x3.a("M 40.644 18.756 C 43.986 20.389 49.867 23.108 49.884 25.534 C 49.897 27.154 49.88 24.441 49.894 26.059 C 49.911 28.733 48.6 30 46.39 30 L 6 30.013 C 3.79 30.013 2 28.223 2 26.013 L 2.008 5.52 C 2.008 2.55 5.237 1.614 7.079 2.401 C 10.656 4 31.106 14.097 40.644 18.756 Z", 217.0f);
            f21050x3.a("M 43.782 19.218 C 47.117 20.675 50.075 21.538 50.041 24.796 C 50.022 26.606 50.038 24.309 50.039 26.104 C 50.038 28.736 48.663 30 46.453 30 L 6 29.986 C 3.79 29.986 2 28.196 2 25.986 L 2.008 6.491 C 2.008 3.535 5.196 2.627 7.085 3.316 C 10.708 4.731 33.992 14.944 43.782 19.218 Z", 234.0f);
            f21050x3.a("M 47.421 16.941 C 50.544 18.191 50.783 19.91 50.769 22.706 C 50.761 24.484 50.76 23.953 50.79 26.073 C 50.814 27.835 49.334 30 47.124 30 L 5 30.01 C 2.79 30.01 1 28.22 1 26.01 L 1.001 10.823 C 1.001 8.218 3.532 6.895 5.572 7.26 C 7.493 8.01 47.421 16.941 47.421 16.941 Z", 267.0f);
            f21050x3.a("M 47.641 17.125 C 50.641 18.207 51.09 19.935 51.078 22.653 C 51.07 24.191 51.062 21.23 51.088 23.063 C 51.109 24.886 49.587 27 47.377 27 L 5 27.009 C 2.79 27.009 1 25.219 1 23.009 L 0.983 11.459 C 0.983 8.908 3.414 7.522 5.476 7.838 C 7.138 8.486 47.641 17.125 47.641 17.125 Z", 300.0f);
            f21050x3.a("M 48 7 C 50.21 7 52 8.79 52 11 C 52 19 52 19 52 19 C 52 21.21 50.21 23 48 23 L 4 23 C 1.79 23 0 21.21 0 19 L 0 11 C 0 8.79 1.79 7 4 7 C 48 7 48 7 48 7 Z", 383.0f);
            y3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            f21086z3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            A3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            B3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            F3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            H3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            C3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            D3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            G3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            I3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            E3 = new kc0();
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
            f20632a4 = resources.getDrawable(R.drawable.msg_views).mutate();
            f20652b4 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            J3 = resources.getDrawable(R.drawable.msg_views).mutate();
            K3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            f20671c4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f20689d4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f20709e4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f20726f4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f20744g4 = resources.getDrawable(R.drawable.video_actions);
            f20761h4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            f20779i4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            f20797j4 = resources.getDrawable(R.drawable.msg_warning);
            f20817k4 = resources.getDrawable(R.drawable.list_mute).mutate();
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
            f20853m4 = resources.getDrawable(R.drawable.bot_file);
            f20872n4 = resources.getDrawable(R.drawable.bot_music);
            f20888o4 = resources.getDrawable(R.drawable.bot_location);
            f21016v4 = resources.getDrawable(R.drawable.bot_link);
            f21051x4 = resources.getDrawable(R.drawable.bot_lines);
            f21034w4 = resources.getDrawable(R.drawable.bot_card);
            f21068y4 = resources.getDrawable(R.drawable.bot_webview);
            f21087z4 = resources.getDrawable(R.drawable.bot_invite);
            A4 = resources.getDrawable(R.drawable.permission_locked);
            B4 = resources.getDrawable(R.drawable.msg_msgbubble);
            C4 = resources.getDrawable(R.drawable.msg_msgbubble2);
            D4 = resources.getDrawable(R.drawable.msg_arrowright);
            E4 = resources.getDrawable(R.drawable.gradient_left);
            F4 = resources.getDrawable(R.drawable.gradient_right);
            f20906p4 = resources.getDrawable(R.drawable.header_shadow).mutate();
            R4 = resources.getDrawable(R.drawable.nophotos3);
            f20924q4 = resources.getDrawable(R.drawable.filled_button_share).mutate();
            f20942r4 = resources.getDrawable(R.drawable.filled_button_reply);
            f20961s4 = resources.getDrawable(R.drawable.msg_voiceclose).mutate();
            f20980t4 = resources.getDrawable(R.drawable.media_more).mutate();
            f20998u4 = resources.getDrawable(R.drawable.filled_open_message);
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
            f20653b5 = resources.getDrawable(R.drawable.filled_fire).mutate();
            f20672c5 = resources.getDrawable(R.drawable.msg_round_gif_m).mutate();
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
            oq L10 = L(AndroidUtilities.dp(44.0f), R.drawable.msg_contact);
            Drawable[] drawableArr7 = T4;
            drawableArr7[0] = L10;
            drawableArr7[1] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_contact);
            Drawable mutate5 = resources.getDrawable(R.drawable.msg_location).mutate();
            Drawable[] drawableArr8 = S4;
            drawableArr8[0] = mutate5;
            drawableArr8[1] = resources.getDrawable(R.drawable.msg_location).mutate();
            f20778i3 = context.getResources().getDrawable(R.drawable.compose_panel_shadow).mutate();
            j3 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            h5 h5Var = new h5(0);
            Paint paint = new Paint(1);
            h5Var.f20517b = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
            f20816k3 = h5Var;
            jl.clear();
            kl.clear();
            Drawable drawable = f21051x4;
            int i12 = f20825kc;
            d(i12, "drawableBotInline", drawable);
            d(i12, "drawableBotWebView", f21068y4);
            d(i12, "drawableBotLock", A4);
            d(i12, "drawableBotLink", f21016v4);
            d(i12, "drawable_botInvite", f21087z4);
            d(i12, "drawableGoIcon", f20998u4);
            d(i12, "drawableCommentSticker", C4);
            d(Gc, "drawableMsgError", f20797j4);
            d(-1, "drawableMsgIn", f20852m3);
            d(-1, "drawableMsgInSelected", f20871n3);
            d(-1, "drawableMsgInMedia", f20923q3);
            d(-1, "drawableMsgInMediaSelected", f20941r3);
            d(Dc, "drawableMsgInInstant", f20761h4);
            d(-1, "drawableMsgOut", f20887o3);
            d(-1, "drawableMsgOutSelected", f20905p3);
            d(-1, "drawableMsgOutMedia", f20960s3);
            d(-1, "drawableMsgOutMediaSelected", f20979t3);
            Drawable drawable2 = drawableArr4[0];
            int i13 = Va;
            d(i13, "drawableMsgOutCallAudio", drawable2);
            Drawable drawable3 = drawableArr5[0];
            int i14 = Wa;
            d(i14, "drawableMsgOutCallAudioSelected", drawable3);
            d(i13, "drawableMsgOutCallVideo", drawableArr4[1]);
            d(i14, "drawableMsgOutCallVideo", drawableArr5[1]);
            d(Ja, "drawableMsgOutCheck", y3);
            d(Ka, "drawableMsgOutCheckSelected", f21086z3);
            Drawable drawable4 = A3;
            int i15 = La;
            d(i15, "drawableMsgOutCheckRead", drawable4);
            Drawable drawable5 = B3;
            int i16 = Ma;
            d(i16, "drawableMsgOutCheckReadSelected", drawable5);
            d(i15, "drawableMsgOutHalfCheck", C3);
            d(i16, "drawableMsgOutHalfCheckSelected", D3);
            d(i13, "drawableMsgOutInstant", f20779i4);
            d(Ta, "drawableMsgOutMenu", f20709e4);
            d(Ua, "drawableMsgOutMenuSelected", f20726f4);
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
            int i19 = f20787ic;
            d(i19, "drawableMsgStickerCheck", drawable8);
            d(i19, "drawableMsgStickerHalfCheck", I3);
            d(i19, "drawableMsgStickerPinned", Y3);
            d(i19, "drawableMsgStickerReplies", K3);
            d(i19, "drawableMsgStickerViews", J3);
            d(i12, "drawableReplyIcon", f20942r4);
            d(i12, "drawableCloseIcon", f20961s4);
            d(i12, "drawableMoreIcon", f20980t4);
            d(i12, "drawableShareIcon", f20924q4);
            d(f20895oc, "drawableMuteIcon", f20817k4);
            d(f20913pc, "drawableLockIcon", l4);
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
            f20688d3.setTextSize(AndroidUtilities.dp(f14));
            X2.setTextSize(AndroidUtilities.dp(f13));
            U2.setTextSize(AndroidUtilities.dp(f14));
            V2.setTextSize(AndroidUtilities.dp(12.0f));
            T2.setTextSize(AndroidUtilities.dp(12.0f));
            K2.setTextSize(AndroidUtilities.dp(13.0f));
            L2.setTextSize(AndroidUtilities.dp(13.0f));
            M2.setTextSize(AndroidUtilities.dp(13.0f));
            X1.setStrokeWidth(AndroidUtilities.dp(f10));
            Z1.setStrokeWidth(AndroidUtilities.dp(1.1f));
            f20959s2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            f20978t2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            f20996u2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 3));
            f21014v2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize)));
            f20725f3.setTextSize(AndroidUtilities.dp(15.0f));
            f20743g3.setTextSize(AndroidUtilities.dp(13.0f));
            f20815k2.setStrokeWidth(AndroidUtilities.dp(f11));
            f20834l2.setStrokeWidth(AndroidUtilities.dp(2.33f));
            f20708e3.setTextSize(AndroidUtilities.dp(f12));
            f20708e3.setTypeface(AndroidUtilities.bold());
        }
    }

    public static org.telegram.ui.Cells.z J0(f6 f6Var, boolean z10) {
        int v02 = v0(f20781i6, f6Var);
        if (z10) {
            return I0(v02, f20691d6, f6Var);
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
        int w02 = w0(null, f20781i6, false);
        if (z10) {
            return I0(w02, f20691d6, null);
        }
        return f0(w02, 2, -1);
    }

    public static oq L(int i10, int i11) {
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
        oq oqVar = new oq(shapeDrawable, drawable);
        oqVar.h = i10;
        oqVar.f29192n = i10;
        return oqVar;
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
        f21082z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new o5(i11, i12));
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
            paint3.setPathEffect(x80.c());
            Paint paint4 = new Paint();
            V1 = paint4;
            paint4.setPathEffect(x80.c());
            Paint paint5 = new Paint();
            W1 = paint5;
            paint5.setPathEffect(x80.c());
            Paint paint6 = new Paint(1);
            f20815k2 = paint6;
            paint6.setStrokeCap(cap);
            f20815k2.setStyle(style);
            f20815k2.setColor(-1610612737);
            Paint paint7 = new Paint(1);
            f20834l2 = paint7;
            paint7.setStrokeCap(cap);
            f20834l2.setStyle(style);
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
            f20688d3 = textPaint12;
            textPaint12.setTypeface(AndroidUtilities.bold());
            f20670c3 = new TextPaint(1);
            f20708e3 = new TextPaint(1);
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
            f20650b2 = new Paint(1);
            f20669c2 = new Paint(1);
            Paint paint10 = new Paint(1);
            f20687d2 = paint10;
            paint10.setStyle(style);
            f20687d2.setStrokeCap(cap);
            f20959s2 = new TextPaint(1);
            f20978t2 = new TextPaint(1);
            f20996u2 = new TextPaint(1);
            f20959s2.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint14 = new TextPaint(1);
            f21014v2 = textPaint14;
            textPaint14.setTypeface(AndroidUtilities.bold());
            Paint paint11 = new Paint(1);
            f20759h2 = paint11;
            paint11.setColor(352321536);
            f20777i2 = new Paint(1);
            TextPaint textPaint15 = new TextPaint(1);
            f20725f3 = textPaint15;
            textPaint15.setTypeface(AndroidUtilities.bold());
            f20743g3 = new TextPaint(1);
            f20796j2 = new Paint();
            new Paint(1);
            f20851m2 = new Paint(1);
            f20870n2 = new Paint(1);
            f20707e2 = new Paint(1);
            f20724f2 = new Paint(7);
            f20742g2 = new Paint(7);
            e(Hc, f20707e2, "paintChatMessageBackgroundSelected");
            Paint paint12 = f20724f2;
            int i10 = f20843lc;
            e(i10, paint12, "paintChatActionBackground");
            e(i10, f20759h2, "paintChatActionBackgroundDarken");
            e(f20861mc, f20742g2, "paintChatActionBackgroundSelected");
            TextPaint textPaint16 = f20959s2;
            int i11 = f20787ic;
            e(i11, textPaint16, "paintChatActionText");
            e(i11, f20978t2, "paintChatActionText2");
            e(i11, f20996u2, "paintChatActionText3");
            e(Nc, Q2, "paintChatBotButton");
            e(Sd, f20796j2, "paintChatComposeBackground");
            e(wc, f20777i2, "paintChatTimeBackground");
        }
    }

    public static i6 N0(String str) {
        return (i6) H.get(str);
    }

    public static void O() {
        synchronized (f20666c) {
            try {
                if (f20886o2 == null) {
                    f20886o2 = new TextPaint(1);
                    f21049x2 = new TextPaint(1);
                    f21067y2 = new TextPaint[6];
                    f21085z2 = new TextPaint(1);
                    A2 = new TextPaint(1);
                    B2 = new TextPaint(1);
                    TextPaint textPaint = new TextPaint(1);
                    f21032w2 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint2 = new TextPaint(1);
                    W2 = textPaint2;
                    textPaint2.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint3 = new TextPaint(1);
                    Y2 = textPaint3;
                    textPaint3.setTypeface(AndroidUtilities.bold());
                    Z2 = new TextPaint(1);
                    f20631a3 = new TextPaint(1);
                    f20651b3 = new TextPaint(1);
                    f20670c3 = new TextPaint(1);
                    TextPaint textPaint4 = new TextPaint(1);
                    f20688d3 = textPaint4;
                    textPaint4.setTypeface(AndroidUtilities.bold());
                    X2 = new TextPaint(1);
                    U2 = new TextPaint(1);
                    T2 = new TextPaint(1);
                    TextPaint textPaint5 = new TextPaint(1);
                    f20904p2 = textPaint5;
                    Typeface typeface = Typeface.MONOSPACE;
                    textPaint5.setTypeface(typeface);
                    TextPaint textPaint6 = new TextPaint(1);
                    f20922q2 = textPaint6;
                    textPaint6.setTypeface(typeface);
                    TextPaint textPaint7 = new TextPaint(1);
                    f20940r2 = textPaint7;
                    textPaint7.setTypeface(typeface);
                    new TextPaint(1);
                    V2 = new TextPaint(1);
                }
                float[] fArr = {0.68f, 0.46f, 0.34f, 0.28f, 0.22f, 0.19f};
                int i10 = 0;
                while (true) {
                    TextPaint[] textPaintArr = f21067y2;
                    if (i10 < textPaintArr.length) {
                        textPaintArr[i10] = new TextPaint(1);
                        f21067y2[i10].setTextSize(AndroidUtilities.dp(fArr[i10] * 120.0f));
                        i10++;
                    } else {
                        f21085z2.setTextSize(AndroidUtilities.dp(46.0f));
                        A2.setTextSize(AndroidUtilities.dp(38.0f));
                        B2.setTextSize(AndroidUtilities.dp(30.0f));
                        f20886o2.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
                        f21049x2.setTextSize(AndroidUtilities.dp(14.0f));
                        f21032w2.setTextSize(AndroidUtilities.dp(15.0f));
                        float f10 = ((SharedConfig.fontSize * 2) + 10) / 3.0f;
                        W2.setTextSize(AndroidUtilities.dp(f10));
                        Y2.setTextSize(AndroidUtilities.dp(f10));
                        Z2.setTextSize(AndroidUtilities.dp(f10));
                        float f11 = f10 - 1.0f;
                        f20631a3.setTextSize(AndroidUtilities.dp(f11));
                        f20651b3.setTextSize(AndroidUtilities.dp(f10));
                        V2.setTextSize(AndroidUtilities.dp(12.0f));
                        f20688d3.setTextSize(AndroidUtilities.dp(f11));
                        f20670c3.setTextSize(AndroidUtilities.dp(f10 - 2.0f));
                        X2.setTextSize(AndroidUtilities.dp(f10));
                        U2.setTextSize(AndroidUtilities.dp(f11));
                        f20904p2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 1), SharedConfig.fontSize - 2)));
                        f20922q2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 3)));
                        f20940r2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 5)));
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
        if (f20813k0 == null) {
            Paint paint = new Paint();
            f20813k0 = paint;
            paint.setStrokeWidth(1.0f);
            Paint paint2 = new Paint();
            f20833l0 = paint2;
            paint2.setStrokeWidth(1.0f);
            f20920q0 = new Paint(1);
            Paint paint3 = new Paint(1);
            f20884o0 = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            f20884o0.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f20884o0.setStrokeCap(Paint.Cap.ROUND);
            Paint paint4 = new Paint(1);
            f20868n0 = paint4;
            paint4.setColor(0);
            f20868n0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            f20902p0 = new Paint(1);
            Paint paint5 = new Paint();
            m0 = paint5;
            paint5.setPathEffect(x80.c());
            Resources resources = context.getResources();
            Drawable drawable = resources.getDrawable(R.drawable.chats_saved);
            Drawable[] drawableArr = f20938r0;
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
            xi0 xi0Var = f20995u1;
            if (xi0Var != null) {
                xi0Var.setCallback(null);
                f20995u1.A(false);
            }
            xi0 xi0Var2 = f21013v1;
            if (xi0Var2 != null) {
                xi0Var2.A(false);
            }
            xi0 xi0Var3 = f21031w1;
            if (xi0Var3 != null) {
                xi0Var3.A(false);
            }
            xi0 xi0Var4 = f21048x1;
            if (xi0Var4 != null) {
                xi0Var4.A(false);
            }
            xi0 xi0Var5 = f21066y1;
            if (xi0Var5 != null) {
                xi0Var5.A(false);
            }
            xi0 xi0Var6 = f21084z1;
            if (xi0Var6 != null) {
                xi0Var6.A(false);
            }
            f20995u1 = new xi0(R.raw.chats_archiveavatar, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21013v1 = new xi0(R.raw.chats_archive, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21031w1 = new xi0(R.raw.chats_unarchive, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21048x1 = new xi0(R.raw.chats_hide, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21066y1 = new xi0(R.raw.chats_unhide, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f21084z1 = new xi0(R.raw.chat_audio_record_delete, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), false, null);
            H1 = new xi0(R.raw.swipe_mute, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            I1 = new xi0(R.raw.swipe_unmute, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            L1 = new xi0(R.raw.swipe_read, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            M1 = new xi0(R.raw.swipe_unread, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            J1 = new xi0(R.raw.swipe_delete, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            O1 = new xi0(R.raw.swipe_unpin, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            N1 = new xi0(R.raw.swipe_pin, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            K1 = new xi0(R.raw.swipe_community_ungroup, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
            k();
        }
    }

    public static Drawable P0(String str, f6 f6Var) {
        Drawable drawable;
        if (f6Var != null) {
            drawable = f6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return (Drawable) jl.get(str);
    }

    public static dc0 Q(int i10, int i11) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dc0 dc0Var = new dc0(z10, -2368069, -9722489, -2762611, -7817084);
        if (i10 <= 0 || i11 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            i11 = Math.max(point2.x, point2.y);
        }
        dc0Var.t(SvgHelper.getBitmap(R.raw.default_pattern, i10, i11, -16777216, 1.0f, SvgHelper.ScaleMode.ByWidth), 34);
        dc0Var.u(dc0Var.f());
        return dc0Var;
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
                                        int s10 = g5.s(substring);
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
                sparseIntArray.put(f20745g5, i12);
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
            f21030w0 = new Paint(1);
            f20976t0 = new Paint(1);
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
            f20994u0 = new Paint();
            f21012v0 = new Paint(1);
            f21065y0 = new Paint(1);
            f21047x0 = new Paint(1);
            f21083z0 = new Paint(1);
            f20630a1 = resources.getDrawable(R.drawable.list_secret);
            f20649b1 = resources.getDrawable(R.drawable.msg_mini_lock2);
            T0 = resources.getDrawable(R.drawable.list_check).mutate();
            S0 = resources.getDrawable(R.drawable.community_cards).mutate();
            U0 = resources.getDrawable(R.drawable.minithumb_play).mutate();
            V0 = resources.getDrawable(R.drawable.list_check).mutate();
            W0 = resources.getDrawable(R.drawable.list_halfcheck);
            X0 = new kc0();
            Y0 = resources.getDrawable(R.drawable.list_warning_sign);
            Z0 = resources.getDrawable(R.drawable.list_reorder).mutate();
            f20668c1 = resources.getDrawable(R.drawable.list_mute).mutate();
            f20686d1 = resources.getDrawable(R.drawable.list_unmute).mutate();
            f20706e1 = resources.getDrawable(R.drawable.mini_ephemeral_hidden_16).mutate();
            f20723f1 = resources.getDrawable(R.drawable.verified_area).mutate();
            f20741g1 = new xl0(0);
            f20758h1 = new xl0(1);
            f20776i1 = resources.getDrawable(R.drawable.verified_check).mutate();
            f20850m1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            f20869n1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            f20885o1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            f20903p1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            f20921q1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            f20939r1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            f20795j1 = resources.getDrawable(R.drawable.list_pin);
            f20814k1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            l1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            f20977t1 = resources.getDrawable(R.drawable.msg_mini_forumarrow);
            f20957s0 = resources.getDrawable(R.drawable.preview_arrow);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = f20633a5;
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

    public static u5 S(Context context) {
        return T(context, w0(null, f20999u5, false), w0(null, f21017v5, false));
    }

    public static Paint S0(String str) {
        if (Objects.equals(str, "paintDivider")) {
            return f20813k0;
        }
        return (Paint) ll.get(str);
    }

    public static u5 T(Context context, int i10, int i11) {
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

    public static Paint T0(String str, f6 f6Var) {
        Paint G10;
        if (f6Var != null && (G10 = f6Var.G(str)) != null) {
            return G10;
        }
        return S0(str);
    }

    public static u5 U(Context context, int i10, int i11, int i12) {
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
        f21082z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new w5(i11, i12, i13, i14, f10));
    }

    public static android.graphics.drawable.Drawable W0(android.view.View r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.j6.W0(android.view.View, boolean):android.graphics.drawable.Drawable");
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
        f21082z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new g6(i11, i12));
    }

    public static String Y0(b6 b6Var) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (b6Var == null || TextUtils.isEmpty(b6Var.f20304c) || b6Var.f20304c.equals("d")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (b6Var.f20308i) {
            sb2.append("blur");
        }
        if (b6Var.f20309j) {
            if (sb2.length() > 0) {
                sb2.append("+");
            }
            sb2.append("motion");
        }
        int i10 = b6Var.d;
        if (i10 == 0) {
            str3 = "https://attheme.org?slug=" + b6Var.f20304c;
        } else {
            String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (b6Var.d >> 8)) & 255), Byte.valueOf((byte) (b6Var.d & 255))).toLowerCase();
            int i11 = b6Var.f20305e;
            if (i11 != 0) {
                str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (b6Var.f20305e >> 8)) & 255), Byte.valueOf((byte) (b6Var.f20305e & 255))).toLowerCase();
            } else {
                str = null;
            }
            int i12 = b6Var.f20306f;
            if (i12 != 0) {
                str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (b6Var.f20306f >> 8)) & 255), Byte.valueOf((byte) (b6Var.f20306f & 255))).toLowerCase();
            } else {
                str2 = null;
            }
            int i13 = b6Var.f20307g;
            if (i13 != 0) {
                str4 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (b6Var.f20307g >> 8)) & 255), Byte.valueOf((byte) (b6Var.f20307g & 255))).toLowerCase();
            }
            if (str != null && str2 != null) {
                if (str4 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(lowerCase);
                    sb3.append("~");
                    sb3.append(str);
                    sb3.append("~");
                    sb3.append(str2);
                    lowerCase = a4.a.s(sb3, "~", str4);
                } else {
                    lowerCase = lowerCase + "~" + str + "~" + str2;
                }
            } else if (str != null) {
                StringBuilder g10 = w.f.g(a4.a.C(lowerCase, "-", str), "&rotation=");
                g10.append(b6Var.h);
                lowerCase = g10.toString();
            }
            str3 = "https://attheme.org?slug=" + b6Var.f20304c + "&intensity=" + ((int) (b6Var.f20310k * 100.0f)) + "&bg_color=" + lowerCase;
        }
        if (sb2.length() > 0) {
            StringBuilder g11 = w.f.g(str3, "&mode=");
            g11.append(sb2.toString());
            return g11.toString();
        }
        return str3;
    }

    public static org.telegram.ui.Cells.z Z(int i10, int i11, int i12, int i13) {
        f21082z.setColor(-1);
        float f10 = i12;
        float f11 = i13;
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), c0(AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), i10), new g6(f10, f11));
    }

    public static boolean Z0() {
        if (P && I.f20581i0 != null) {
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
        f21082z.setColor(-1);
        ?? drawable = new Drawable();
        drawable.f20499a = new Path();
        drawable.f20500b = r1;
        drawable.f20501c = true;
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
            M02[1] = w7.p.a(f12 + f10, 0.0f, 1.0f);
        }
        M02[2] = w7.p.a(M02[2] + f11, 0.0f, 1.0f);
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
        i6 i6Var = I;
        if (!i6Var.S || i6Var.Y != f20867n) {
            if (rl.indexOfKey(Nd) < 0 && f20740g0 <= 0 && TextUtils.isEmpty(f20757h0)) {
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
        int i11 = f20948ra;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.j6.f0(int, int, int):org.telegram.ui.Cells.z");
    }

    public static boolean f1() {
        return !I.q();
    }

    public static void g(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z10) {
        int[] iArr = nl;
        int i10 = f20948ra;
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
            int i17 = f20639ab;
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

    public static boolean g1(h6 h6Var) {
        i6 i6Var = h6Var.f20519b;
        if (i6Var != null) {
            if (i6Var.m().equals("Blue") && h6Var.f20518a == 99) {
                return true;
            }
            if (h6Var.f20519b.m().equals("Day") && h6Var.f20518a == 9) {
                return true;
            }
            if ((h6Var.f20519b.m().equals("Night") || h6Var.f20519b.m().equals("Dark Blue")) && h6Var.f20518a == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void h(Drawable drawable) {
        boolean z10;
        Bitmap bitmap;
        if (f20707e2 == null) {
            return;
        }
        int i10 = rl.get(Hc);
        if ((drawable instanceof dc0) && SharedConfig.getDevicePerformanceClass() != 0 && i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && Y != (bitmap = ((dc0) drawable).f25381k)) {
            Y = bitmap;
            Bitmap bitmap2 = Y;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            Z = new BitmapShader(bitmap2, tileMode, tileMode);
            if (f20629a0 == null) {
                f20629a0 = new Matrix();
            }
        }
        if (Z != null && i10 == 0 && z10) {
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 2.5f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.75f);
            f20707e2.setShader(Z);
            f20707e2.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            f20707e2.setAlpha(64);
            return;
        }
        Paint paint = f20707e2;
        if (i10 == 0) {
            i10 = 1073741824;
        }
        paint.setColor(i10);
        f20707e2.setColorFilter(null);
        f20707e2.setShader(null);
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
                ConnectionsManager.getInstance(i10).sendRequest(getthemes, new fi.q2(i10, 3));
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
        if (f20724f2 == null) {
            return;
        }
        X = f20667c0;
        f20648b0 = f20685d0;
        SparseIntArray sparseIntArray = rl;
        int i12 = f20843lc;
        int indexOfKey = sparseIntArray.indexOfKey(i12);
        if (indexOfKey >= 0) {
            i10 = rl.valueAt(indexOfKey);
        } else {
            i10 = X;
        }
        int indexOfKey2 = rl.indexOfKey(f20861mc);
        if (indexOfKey2 >= 0) {
            i11 = rl.valueAt(indexOfKey2);
        } else {
            i11 = f20648b0;
        }
        boolean z10 = drawable instanceof dc0;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z10) {
                bitmap = ((dc0) drawable).f25381k;
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
                if (f20629a0 == null) {
                    f20629a0 = new Matrix();
                }
            }
            w1(-1, Y3);
            w1(-1, H3);
            w1(-1, I3);
            w1(-1, J3);
            w1(-1, K3);
            f20959s2.setColor(-1);
            f20978t2.setColor(-1);
            f20996u2.setColor(-1);
            f20959s2.linkColor = -1;
            f21014v2.setColor(-1);
            Q2.setColor(-1);
            w1(-1, C4);
            w1(-1, f20924q4);
            w1(-1, f20942r4);
            w1(-1, f20998u4);
            w1(-1, f21051x4);
            w1(-1, f21068y4);
            w1(-1, A4);
            w1(-1, f21087z4);
            w1(-1, f21016v4);
        } else {
            Y = null;
            Z = null;
            Drawable drawable2 = Y3;
            int i13 = f20787ic;
            x1(i13, drawable2);
            x1(i13, H3);
            x1(i13, I3);
            x1(i13, J3);
            x1(i13, K3);
            f20959s2.setColor(w0(null, i13, false));
            f20978t2.setColor(w0(null, i13, false));
            f20959s2.linkColor = w0(null, f20805jc, false);
            f21014v2.setColor(w0(null, i13, false));
            Drawable drawable3 = C4;
            int i14 = f20825kc;
            x1(i14, drawable3);
            x1(i14, f20924q4);
            x1(i14, f20942r4);
            x1(i14, f20998u4);
            x1(i14, f21051x4);
            x1(i14, f21068y4);
            x1(i14, A4);
            x1(i14, f21087z4);
            x1(i14, f21016v4);
            Q2.setColor(w0(null, Nc, false));
        }
        f20724f2.setColor(i10);
        f20742g2.setColor(i11);
        if (Z != null && (rl.indexOfKey(i12) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix2 = new ColorMatrix();
            if (z10) {
                float f14 = -0.06f;
                if (((dc0) drawable).f25387q >= 0.0f) {
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
            f20724f2.setFilterBitmap(true);
            f20724f2.setShader(Z);
            f20724f2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
            f20724f2.setAlpha(255);
            f20742g2.setFilterBitmap(true);
            f20742g2.setShader(Z);
            ColorMatrix colorMatrix3 = new ColorMatrix(colorMatrix2);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.26f);
            e1();
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix3, 0.92f);
            f20742g2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
            f20742g2.setAlpha(255);
            f20759h2.setAlpha(0);
            return;
        }
        f20724f2.setColorFilter(null);
        f20724f2.setShader(null);
        f20742g2.setColorFilter(null);
        f20742g2.setShader(null);
        f20759h2.setAlpha(21);
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
        if (f20886o2 != null && f20852m3 != null && !z10) {
            K2.setColor(w0(null, Jc, false));
            J2.setColor(w0(null, Ic, false));
            Q2.setColor(w0(null, Nc, false));
            U1.setColor(w0(null, Ld, false));
            V1.setColor(w0(null, Mb, false));
            W1.setColor(w0(null, Md, false));
            f20650b2.setColor(w0(null, Fc, false));
            Paint paint = f20669c2;
            int i10 = f20911pa;
            paint.setColor(w0(null, i10, false));
            f20687d2.setColor(w0(null, i10, false));
            TextPaint textPaint = f20959s2;
            int i11 = f20787ic;
            textPaint.setColor(w0(null, i11, false));
            f20978t2.setColor(w0(null, i11, false));
            f20996u2.setColor(w0(null, i11, false));
            f20959s2.linkColor = w0(null, f20805jc, false);
            f21014v2.setColor(w0(null, i11, false));
            f20725f3.setColor(w0(null, G6, false));
            Paint paint2 = f20796j2;
            int i12 = Sd;
            paint2.setColor(w0(null, i12, false));
            f20777i2.setColor(w0(null, wc, false));
            x1(f20826kd, f20760h3);
            f5 f5Var = f20852m3;
            int i13 = f20948ra;
            x1(i13, f5Var);
            f5 f5Var2 = f20871n3;
            int i14 = f20697dc;
            x1(i14, f5Var2);
            x1(i13, f20923q3);
            x1(i14, f20941r3);
            x1(Ja, y3);
            x1(Ka, f21086z3);
            Drawable drawable = A3;
            int i15 = La;
            x1(i15, drawable);
            Drawable drawable2 = B3;
            int i16 = Ma;
            x1(i16, drawable2);
            x1(i15, C3);
            x1(i16, D3);
            Drawable drawable3 = F3;
            int i17 = f20969sc;
            x1(i17, drawable3);
            x1(i17, G3);
            x1(i11, H3);
            x1(i11, I3);
            x1(i11, J3);
            x1(i11, K3);
            x1(i11, L3);
            Drawable drawable4 = f20924q4;
            int i18 = f20825kc;
            x1(i18, drawable4);
            x1(i18, f20942r4);
            x1(i18, f20998u4);
            x1(i18, f21051x4);
            x1(i18, f21068y4);
            Drawable drawable5 = A4;
            int i19 = f20913pc;
            x1(i19, drawable5);
            x1(i18, f21087z4);
            x1(i18, f21016v4);
            Drawable drawable6 = M3;
            int i20 = xc;
            x1(i20, drawable6);
            Drawable drawable7 = N3;
            int i21 = f21076yc;
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
            int i24 = f21095zc;
            x1(i24, drawable10);
            x1(i11, Y3);
            x1(i24, f20632a4);
            x1(i24, f20652b4);
            x1(Ac, f20671c4);
            x1(Bc, f20689d4);
            x1(Ta, f20709e4);
            x1(Ua, f20726f4);
            x1(Cc, f20744g4);
            Drawable drawable11 = f20779i4;
            int i25 = Va;
            x1(i25, drawable11);
            Drawable drawable12 = f20761h4;
            int i26 = Dc;
            x1(i26, drawable12);
            x1(Gc, f20797j4);
            x1(f20895oc, f20817k4);
            x1(i19, l4);
            Drawable drawable13 = f20853m4;
            int i27 = Ge;
            x1(i27, drawable13);
            x1(i27, f20872n4);
            x1(i27, f20888o4);
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
            int i30 = f20945r7;
            x1(i30, drawable15);
            x1(f20929qa, Q4);
            x1(i30, V4);
            Drawable drawable16 = W4;
            int i31 = Di;
            x1(i31, drawable16);
            x1(i30, X4);
            x1(i31, Y4);
            int i32 = 0;
            while (true) {
                kw0[] kw0VarArr = f20997u3;
                if (i32 >= kw0VarArr.length) {
                    break;
                }
                x1(f20910p9, kw0VarArr[i32]);
                i32++;
            }
            for (int i33 = 0; i33 < 5; i33++) {
                Drawable[][] drawableArr = U4;
                v1(drawableArr[i33][0], w0(null, f20789ie, false), false);
                v1(drawableArr[i33][0], w0(null, f21006uc, false), true);
                v1(drawableArr[i33][1], w0(null, f20807je, false), false);
                v1(drawableArr[i33][1], w0(null, f21023vc, false), true);
            }
            Drawable[] drawableArr2 = T4;
            v1(drawableArr2[0], w0(null, f20952re, false), false);
            v1(drawableArr2[0], w0(null, f20971se, false), true);
            v1(drawableArr2[1], w0(null, Qb, false), false);
            v1(drawableArr2[1], w0(null, Rb, false), true);
            Drawable[] drawableArr3 = S4;
            w1(w0(null, f20933qe, false), drawableArr3[0]);
            w1(w0(null, Pb, false), drawableArr3[1]);
            Drawable[] drawableArr4 = M4;
            w1(w0(null, Kc, false), drawableArr4[0]);
            w1(w0(null, Xa, false), drawableArr4[1]);
            Drawable[] drawableArr5 = N4;
            w1(w0(null, i20, false), drawableArr5[0]);
            w1(w0(null, i22, false), drawableArr5[1]);
            x1(Td, f20778i3);
            x1(i12, j3);
            int i34 = -1;
            if (w0(null, f21094zb, false) == -1) {
                i34 = w0(null, Aa, false);
            }
            w1(i34, K4[1]);
            w1(i34, L4[1]);
            w1(w0(null, f20695da, false), R4);
            if (!z11 && !f20647b) {
                Drawable drawable17 = f20705e0;
                if (drawable17 != null) {
                    i(drawable17);
                }
                h(f20705e0);
            }
        }
    }

    public static boolean j0(i6 i6Var, h6 h6Var, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (h6Var == null || i6Var == null || i6Var.f20571b0 == null) {
            return false;
        }
        if (h6Var.f20518a == i6Var.Y) {
            z11 = true;
        } else {
            z11 = false;
        }
        File d10 = h6Var.d();
        if (d10 != null) {
            d10.delete();
        }
        i6Var.f20569a0.remove(h6Var.f20518a);
        i6Var.f20571b0.remove(h6Var);
        TLRPC.TL_theme tL_theme = h6Var.f20533r;
        if (tL_theme != null) {
            i6Var.f20573c0.remove(tL_theme.f20033id);
        }
        b6 b6Var = h6Var.f20539y;
        if (b6Var != null) {
            b6.a(b6Var);
        }
        if (z11) {
            i6Var.u(((h6) i6Var.f20571b0.get(0)).f20518a);
        }
        if (z10) {
            t1(i6Var, true, false, false, false, false);
            if (h6Var.f20533r != null) {
                MessagesController messagesController = MessagesController.getInstance(h6Var.f20535t);
                if (z11 && i6Var == J) {
                    z12 = true;
                }
                messagesController.saveTheme(i6Var, h6Var, z12, true);
            }
        }
        return z11;
    }

    public static void j1(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.j6.j1(boolean):void");
    }

    public static void k() {
        Paint paint = f20813k0;
        if (paint == null) {
            return;
        }
        paint.setColor(w0(null, f20692d7, false));
        m0.setColor(w0(null, K6, false));
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = f20938r0;
            int length = drawableArr.length;
            int i11 = J7;
            if (i10 < length) {
                x1(i11, drawableArr[i10]);
                i10++;
            } else {
                xi0 xi0Var = f20995u1;
                xi0Var.f32579a0 = true;
                int i12 = M7;
                xi0Var.O(w0(null, i12, true), "Arrow1");
                f20995u1.O(w0(null, i12, true), "Arrow2");
                f20995u1.O(w0(null, i11, true), "Box2");
                f20995u1.O(w0(null, i11, true), "Box1");
                f20995u1.m();
                C1 = false;
                f20995u1.H(true);
                xi0 xi0Var2 = f21048x1;
                xi0Var2.f32579a0 = true;
                int i13 = f20713e9;
                xi0Var2.O(w0(null, i13, true), "Arrow");
                f21048x1.O(w0(null, i13, true), "Line");
                f21048x1.m();
                xi0 xi0Var3 = f21066y1;
                xi0Var3.f32579a0 = true;
                xi0Var3.O(w0(null, i13, true), "Arrow");
                f21066y1.O(w0(null, i13, true), "Line");
                f21066y1.m();
                xi0 xi0Var4 = f21084z1;
                xi0Var4.f32579a0 = true;
                int i14 = f20676c9;
                xi0Var4.O(w0(null, i14, true), "Line 1");
                f21084z1.O(w0(null, i14, true), "Line 2");
                f21084z1.O(w0(null, i14, true), "Line 3");
                f21084z1.O(w0(null, i13, true), "Cup Red");
                f21084z1.O(w0(null, i13, true), "Box");
                f21084z1.m();
                B1 = false;
                xi0 xi0Var5 = f21013v1;
                xi0Var5.f32579a0 = true;
                xi0Var5.O(w0(null, i14, true), "Arrow");
                f21013v1.O(w0(null, i13, true), "Box2");
                f21013v1.O(w0(null, i13, true), "Box1");
                f21013v1.m();
                A1 = false;
                xi0 xi0Var6 = f21031w1;
                xi0Var6.f32579a0 = true;
                xi0Var6.O(w0(null, i13, true), "Arrow1");
                f21031w1.O(w0(null, f20694d9, true), "Arrow2");
                f21031w1.O(w0(null, i13, true), "Box2");
                f21031w1.O(w0(null, i13, true), "Box1");
                f21031w1.m();
                int w02 = w0(null, G6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                f21015v3 = new PorterDuffColorFilter(w02, mode);
                f21033w3 = new PorterDuffColorFilter(w0(null, f20733fc, false), mode);
                sg.d1.d().b();
                return;
            }
        }
    }

    public static i6 k0(File file, String str, TLRPC.TL_theme tL_theme) {
        String[] split;
        try {
            i6 i6Var = new i6();
            i6Var.f20568a = str;
            i6Var.F = tL_theme;
            i6Var.f20570b = file.getAbsolutePath();
            i6Var.E = UserConfig.selectedAccount;
            String[] strArr = new String[1];
            G(Q0(new File(i6Var.f20570b), null, strArr), i6Var);
            if (!TextUtils.isEmpty(strArr[0])) {
                String str2 = strArr[0];
                File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                i6Var.f20572c = new File(filesDirFixed, Utilities.MD5(str2) + ".wp").getAbsolutePath();
                Uri parse = Uri.parse(str2);
                i6Var.f20575e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        if ("blur".equals(split[i10])) {
                            i6Var.h = true;
                        } else if ("motion".equals(split[i10])) {
                            i6Var.f20583n = true;
                        }
                    }
                }
                String queryParameter2 = parse.getQueryParameter("intensity");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String queryParameter3 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            i6Var.f20584r = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                            if (queryParameter3.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(6))) {
                                i6Var.f20585s = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter3.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(13))) {
                                i6Var.v = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter3.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(20))) {
                                i6Var.f20586w = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String queryParameter4 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            i6Var.f20587x = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        i6Var.f20588y = Utilities.parseInt((CharSequence) queryParameter2).intValue();
                    }
                    if (i6Var.f20588y == 0) {
                        i6Var.f20588y = 50;
                    }
                }
                return i6Var;
            }
            f20757h0 = null;
            return i6Var;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static Drawable k1(b6 b6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable drawable;
        cf.c I10 = I(I, b6Var, rl, file, f20757h0, f20740g0, i10, S, z11, O, P, z10, document, false);
        Boolean bool = (Boolean) I10.f4825c;
        if (bool != null) {
            z12 = bool.booleanValue();
        } else {
            z12 = f20775i0;
        }
        f20775i0 = z12;
        Boolean bool2 = (Boolean) I10.d;
        if (bool2 != null) {
            z13 = bool2.booleanValue();
        } else {
            z13 = f20794j0;
        }
        f20794j0 = z13;
        Boolean bool3 = (Boolean) I10.f4826e;
        if (bool3 != null) {
            z14 = bool3.booleanValue();
        } else {
            z14 = W;
        }
        W = z14;
        Drawable drawable2 = (Drawable) I10.f4823a;
        if (drawable2 != null) {
            drawable = drawable2;
        } else {
            drawable = f20705e0;
        }
        f20705e0 = drawable;
        int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(drawable2);
        int i11 = calcDrawableColor[0];
        f20667c0 = i11;
        X = i11;
        int i12 = calcDrawableColor[1];
        f20685d0 = i12;
        f20648b0 = i12;
        Drawable drawable3 = f20705e0;
        if (drawable3 != null) {
            i(drawable3);
        }
        return drawable2;
    }

    public static void l(boolean z10) {
        i6 i6Var;
        if (M == null) {
            if (z10) {
                i6 i6Var2 = I;
                i6 i6Var3 = J;
                if (i6Var2 != i6Var3) {
                    if (i6Var2 == null || (i6Var3 != null && i6Var2.q() != J.q())) {
                        R = true;
                        f20774i = SystemClock.elapsedRealtime();
                        Q = true;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, J, Boolean.TRUE, null, -1);
                        Q = false;
                        return;
                    }
                    return;
                }
                return;
            }
            i6 i6Var4 = K;
            if (i6Var4 != null && i6Var4.q() && f20883o != 0 && (i6Var = L) != null) {
                i6Var4 = i6Var;
            }
            i6 i6Var5 = I;
            if (i6Var5 != i6Var4) {
                if (i6Var5 == null || (i6Var4 != null && i6Var5.q() != i6Var4.q())) {
                    R = false;
                    f20774i = SystemClock.elapsedRealtime();
                    Q = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, i6Var4, Boolean.TRUE, null, -1);
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
        return i0.a.k(i10, w7.p.b((int) (Color.alpha(i10) * f10), 0, 255));
    }

    public static void m(Paint paint) {
        paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), f20628a);
    }

    public static i6 m0() {
        return I;
    }

    public static int m1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.j6.m1():int");
    }

    public static void n() {
        if (B0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = f20910p9;
            int i12 = f20749g9;
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
                int w03 = w0(null, f20858m9, false);
                textPaint2.linkColor = w03;
                textPaint2.setColor(w03);
                f20994u0.setColor(w0(null, f20985t9, false));
                f21012v0.setColor(w0(null, f20966s9, false));
                I0.setColor(w0(null, f20928q9, false));
                J0.setColor(w0(null, f20947r9, false));
                TextPaint textPaint3 = K0;
                int i15 = il;
                textPaint3.setColor(w0(null, i15, false));
                TextPaint textPaint4 = L0;
                int i16 = W8;
                textPaint4.setColor(w0(null, i16, false));
                M0.setColor(w0(null, i16, false));
                TextPaint textPaint5 = N0;
                int i17 = f20730f9;
                textPaint5.setColor(w0(null, i17, false));
                O0.setColor(w0(null, i17, false));
                Paint paint = f21030w0;
                int i18 = U8;
                paint.setColor(w0(null, i18, false));
                Paint paint2 = f21065y0;
                int i19 = V8;
                paint2.setColor(w0(null, i19, false));
                f21083z0.setColor(w0(null, i11, false));
                f21047x0.setColor(w0(null, f21056x9, false));
                P0.setColor(w0(null, f20907p6, false));
                Q0.setColor(w0(null, A6, false));
                x1(f20637a9, f20630a1);
                Drawable drawable = f20649b1;
                int i20 = f20657b9;
                x1(i20, drawable);
                x1(f21003u9, T0);
                x1(G6, S0);
                Drawable drawable2 = V0;
                int i21 = v9;
                x1(i21, drawable2);
                x1(i21, W0);
                x1(f21039w9, X0);
                x1(f21073y9, Y0);
                x1(i20, f20795j1);
                x1(i20, f20814k1);
                x1(i15, l1);
                x1(i20, Z0);
                Drawable drawable3 = f20668c1;
                int i22 = B9;
                x1(i22, drawable3);
                x1(i22, f20686d1);
                x1(i22, f20706e1);
                x1(i18, f20850m1);
                x1(Z5, f20869n1);
                x1(zj, f20885o1);
                x1(i19, f20903p1);
                x1(i19, f20921q1);
                x1(i19, f20939r1);
                x1(i12, f20977t1);
                x1(f21092z9, f20723f1);
                x1(A9, f20776i1);
                x1(A8, f20958s1);
                xl0 xl0Var = f20741g1;
                int i23 = f20802j9;
                x1(i23, xl0Var);
                x1(i23, f20758h1);
                return;
            }
        }
    }

    public static ColorFilter n0(f6 f6Var) {
        if (f6Var != null) {
            return f6Var.x();
        }
        return f21015v3;
    }

    public static void n1(boolean z10, boolean z11) {
        rl = ql.clone();
        tl = true;
        h6 k10 = I.k(false);
        if (k10 != null) {
            tl = k10.c(ql, rl);
        }
        g(ql, rl, I.q());
        f(ql, rl, I.q());
        if (!z11) {
            o1(!(LaunchActivity.R() instanceof co));
        }
        k();
        n();
        p();
        j(false, z10);
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.w3(3, !O));
    }

    public static void o() {
        i6 i6Var;
        i6 i6Var2 = M;
        if (i6Var2 == null) {
            return;
        }
        O = false;
        if (R && (i6Var = J) != null) {
            t(i6Var, true, true);
        } else if (!P) {
            t(i6Var2, true, false);
        }
        P = false;
        M = null;
        E(false);
    }

    public static l8 o0(MessageObject messageObject) {
        HashMap hashMap = f20710e5;
        if (hashMap != null && messageObject != null) {
            return (l8) hashMap.get(messageObject);
        }
        return null;
    }

    public static void o1(boolean z10) {
        r9 r9Var = V;
        if (r9Var != null) {
            r9Var.dispose();
            V = null;
        }
        Drawable drawable = f20705e0;
        if (drawable instanceof dc0) {
            S = ((dc0) drawable).f25379i;
        } else {
            S = 0;
        }
        f20705e0 = null;
        f20722f0 = null;
        j1(z10);
    }

    public static void p() {
        if (Q1 == null) {
            return;
        }
        P1.setColor(w0(null, G6, false));
        P1.linkColor = w0(null, J6, false);
        x1(f21100zh, Q1);
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
        r(Y, Z, f20629a0, i10, i11, f10, f11);
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
        edit.putInt("selectedAutoNightType", f20883o);
        edit.putBoolean("autoNightScheduleByLocation", f20901p);
        edit.putFloat("autoNightBrighnessThreshold", f20919q);
        edit.putInt("autoNightDayStartTime", f20937r);
        edit.putInt("autoNightDayEndTime", f20956s);
        edit.putInt("autoNightSunriseTime", v);
        edit.putString("autoNightCityName", f21029w);
        edit.putInt("autoNightSunsetTime", f20975t);
        edit.putLong("autoNightLocationLatitude3", Double.doubleToRawLongBits(f21046x));
        edit.putLong("autoNightLocationLongitude3", Double.doubleToRawLongBits(f21064y));
        edit.putInt("autoNightLastSunCheckDay", f20993u);
        i6 i6Var = J;
        if (i6Var != null) {
            edit.putString("nighttheme", i6Var.m());
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
            Utilities.themeQueue.postRunnable(new q(countDownLatch, 16));
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            return s0();
        }
        return s02;
    }

    public static void r1(org.telegram.ui.ActionBar.i6 r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.j6.r1(org.telegram.ui.ActionBar.i6, boolean, boolean, boolean):void");
    }

    public static void s(View view, View view2, f6 f6Var) {
        if (view != null && view2 != null) {
            int[] iArr = El;
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
            if (f6Var != null) {
                f6Var.l(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
                return;
            }
            q(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
        }
    }

    public static Drawable s0() {
        Drawable drawable = f20722f0;
        if (drawable != null) {
            return drawable;
        }
        return f20705e0;
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
                i6 i6Var = (i6) arrayList2.get(i11);
                i6Var.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("name", i6Var.f20568a);
                    jSONObject.put("path", i6Var.f20570b);
                    jSONObject.put("account", i6Var.E);
                    TLRPC.TL_theme tL_theme = i6Var.F;
                    if (tL_theme != null) {
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        i6Var.F.serializeToStream(serializedData);
                        jSONObject.put("info", Utilities.bytesToHex(serializedData.toByteArray()));
                    }
                    jSONObject.put("loaded", i6Var.G);
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
                i6 i6Var2 = (i6) H.get(str);
                if (i6Var2 == null || (arrayList = i6Var2.f20571b0) == null || arrayList.isEmpty()) {
                    z12 = z11;
                } else {
                    z12 = z11;
                    t1(i6Var2, true, false, false, false, z12);
                }
                i10++;
                z11 = z12;
            }
        }
    }

    public static void t(org.telegram.ui.ActionBar.i6 r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.j6.t(org.telegram.ui.ActionBar.i6, boolean, boolean):void");
    }

    public static kw0 t0(int i10) {
        if (i10 < 0 || i10 > 5) {
            return null;
        }
        kw0[] kw0VarArr = f20997u3;
        kw0 kw0Var = kw0VarArr[i10];
        if (kw0Var != null) {
            return kw0Var;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                kw0VarArr[5] = new qp();
                            }
                        } else {
                            kw0VarArr[4] = new vl0(true);
                        }
                    } else {
                        kw0VarArr[3] = new gg0(null, true);
                    }
                } else {
                    kw0VarArr[2] = new yo0(true);
                }
            } else {
                kw0VarArr[1] = new qp(true);
            }
        } else {
            kw0VarArr[0] = new f51(true);
        }
        kw0 kw0Var2 = kw0VarArr[i10];
        kw0Var2.d();
        kw0Var2.b(w0(null, f20910p9, false));
        return kw0Var2;
    }

    public static void t1(i6 i6Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        if (z10) {
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            if (!z12) {
                int size = i6Var.f20571b0.size();
                int max = Math.max(0, size - i6Var.W);
                SerializedData serializedData = new SerializedData(((max * 16) + 2) * 4);
                serializedData.writeInt32(9);
                serializedData.writeInt32(max);
                for (int i10 = 0; i10 < size; i10++) {
                    h6 h6Var = (h6) i6Var.f20571b0.get(i10);
                    int i11 = h6Var.f20518a;
                    if (i11 >= 100) {
                        serializedData.writeInt32(i11);
                        serializedData.writeInt32(h6Var.f20520c);
                        serializedData.writeInt32(h6Var.d);
                        serializedData.writeInt32(h6Var.f20521e);
                        serializedData.writeInt32(h6Var.f20522f);
                        serializedData.writeInt32(h6Var.f20523g);
                        serializedData.writeInt32(h6Var.h);
                        serializedData.writeBool(h6Var.f20524i);
                        serializedData.writeInt64(h6Var.f20525j);
                        serializedData.writeInt64(h6Var.f20526k);
                        serializedData.writeInt64(h6Var.f20527l);
                        serializedData.writeInt64(h6Var.f20528m);
                        serializedData.writeInt32(h6Var.f20529n);
                        serializedData.writeInt64(0L);
                        serializedData.writeDouble(h6Var.f20531p);
                        serializedData.writeBool(h6Var.f20532q);
                        serializedData.writeString(h6Var.f20530o);
                        if (h6Var.f20533r != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        serializedData.writeBool(z15);
                        if (h6Var.f20533r != null) {
                            serializedData.writeInt32(h6Var.f20535t);
                            h6Var.f20533r.serializeToStream(serializedData);
                        }
                    }
                }
                edit.putString("accents_" + i6Var.d, Base64.encodeToString(serializedData.toByteArray(), 3));
                if (!z14) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
                }
                if (z13) {
                    MessagesController.getInstance(UserConfig.selectedAccount).saveThemeToServer(i6Var, i6Var.k(false));
                }
            }
            edit.putInt("accent_current_" + i6Var.d, i6Var.Y);
            edit.commit();
        } else {
            if (i6Var.Z != -1) {
                if (z11) {
                    h6 h6Var2 = (h6) i6Var.f20569a0.get(i6Var.Y);
                    i6Var.f20569a0.remove(h6Var2.f20518a);
                    i6Var.f20571b0.remove(h6Var2);
                    TLRPC.TL_theme tL_theme = h6Var2.f20533r;
                    if (tL_theme != null) {
                        i6Var.f20573c0.remove(tL_theme.f20033id);
                    }
                }
                i6Var.Y = i6Var.Z;
                h6 k10 = i6Var.k(false);
                if (k10 != null) {
                    i6Var.f20581i0 = k10.f20539y;
                } else {
                    i6Var.f20581i0 = null;
                }
            }
            if (I == i6Var) {
                n1(false, false);
            }
        }
        i6Var.Z = -1;
    }

    public static i6 u(File file, String str, TLRPC.TL_theme tL_theme, boolean z10) {
        File file2;
        String str2;
        try {
            if (!str.toLowerCase().endsWith(".attheme")) {
                str = str.concat(".attheme");
            }
            if (z10) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
                i6 i6Var = new i6();
                i6Var.f20568a = str;
                i6Var.F = tL_theme;
                i6Var.f20570b = file.getAbsolutePath();
                i6Var.E = UserConfig.selectedAccount;
                M = A0();
                O = true;
                P = false;
                t(i6Var, false, false);
                return i6Var;
            }
            if (tL_theme != null) {
                str2 = "remote" + tL_theme.f20033id;
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
            i6 i6Var2 = (i6) hashMap.get(str2);
            if (i6Var2 == null) {
                i6Var2 = new i6();
                i6Var2.f20568a = str;
                i6Var2.E = UserConfig.selectedAccount;
                ArrayList arrayList = F;
                arrayList.add(i6Var2);
                G.add(i6Var2);
                Collections.sort(arrayList, new a4.e(27));
            } else {
                hashMap.remove(str2);
            }
            i6Var2.F = tL_theme;
            i6Var2.f20570b = file2.getAbsolutePath();
            hashMap.put(i6Var2.m(), i6Var2);
            s1(true, false);
            t(i6Var2, true, false);
            return i6Var2;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static int u0(int i10) {
        return w0(null, i10, false);
    }

    public static void u1(int i10, int i11, boolean z10) {
        int i12 = f20965s8;
        int i13 = f20635a7;
        int i14 = Qd;
        int i15 = Pd;
        int i16 = Od;
        int i17 = Nd;
        if (i10 == i17 || i10 == i16 || i10 == i15 || i10 == i14 || i10 == f20691d6 || i10 == i13 || i10 == i12 || i10 == M8) {
            i11 |= -16777216;
        }
        if (z10) {
            rl.delete(i10);
        } else {
            rl.put(i10, i11);
        }
        if (i10 == Hc) {
            h(f20705e0);
        } else if (i10 != f20843lc && i10 != f20861mc) {
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
            Drawable drawable = f20705e0;
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

    public static int v0(int i10, f6 f6Var) {
        if (f6Var != null) {
            return f6Var.G0(i10);
        }
        return w0(null, i10, false);
    }

    public static void v1(Drawable drawable, int i10, boolean z10) {
        Drawable drawable2;
        if (!(drawable instanceof oq)) {
            return;
        }
        if (z10) {
            drawable2 = ((oq) drawable).f29188b;
        } else {
            drawable2 = ((oq) drawable).f29187a;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.j6.w0(boolean[], int, boolean):int");
    }

    public static void w1(int i10, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof kw0) {
            ((kw0) drawable).b(i10);
        } else if (drawable instanceof kc0) {
            ((kc0) drawable).a(i10);
        } else if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i10);
        } else if (drawable instanceof xl0) {
            ((xl0) drawable).b(i10);
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

    public static l8 x0() {
        if (f20690d5 == null) {
            f20690d5 = new l8();
        }
        return f20690d5;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.j6.y0():android.graphics.drawable.Drawable");
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
        i6 i6Var = J;
        if (i6Var == null) {
            return "";
        }
        String n10 = i6Var.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            return n10.substring(0, n10.lastIndexOf(46));
        }
        return n10;
    }

    public static void z1(org.telegram.ui.Cells.z zVar, float f10, float f11, float f12, float f13) {
        if (com.google.android.gms.internal.vision.e2.u(zVar)) {
            int numberOfLayers = zVar.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable = zVar.getDrawable(i10);
                if (drawable instanceof g6) {
                    g6 g6Var = (g6) drawable;
                    float[] fArr = g6Var.f20500b;
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
                    g6Var.f20501c = true;
                    g6Var.invalidateSelf();
                    return;
                }
            }
        }
    }
}
