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
import bi.u6;
import bi.wa;
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
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.ip0;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.sc0;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.pd1;
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
    public static m.e3 Al;
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
    public static sc0 E3;
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
    public static hj0 H1;
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
    public static hj0 I1;
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
    public static hj0 J1;
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
    public static hj0 K1;
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
    public static hj0 L1;
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
    public static hj0 M1;
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
    public static hj0 N1;
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
    public static hj0 O1;
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
    public static q9 V;
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
    public static sc0 X0;
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
    public static Matrix f17866a0;
    public static Drawable f17867a1;
    public static Paint a2;
    public static TextPaint f17868a3;
    public static Drawable f17869a4;
    public static final int f17871a6;
    public static final int f17872a7;
    public static final int f17873a8;
    public static final int f17874a9;
    public static final int f17875aa;
    public static final int f17876ab;
    public static final int f17877ac;
    public static final int f17878ad;
    public static final int f17879ae;
    public static final int f17880af;
    public static final int f17881ag;
    public static final int f17882ah;
    public static final int f17883ai;
    public static final int aj;
    public static final int ak;
    public static final int al;
    public static boolean f17884b;
    public static int f17885b0;
    public static Drawable f17886b1;
    public static Paint f17887b2;
    public static TextPaint f17888b3;
    public static Drawable f17889b4;
    public static Drawable f17890b5;
    public static final int f17891b6;
    public static final int f17892b7;
    public static final int f17893b8;
    public static final int f17894b9;
    public static final int f17895ba;
    public static final int f17896bb;
    public static final int f17897bc;
    public static final int bd;
    public static final int f17898be;
    public static final int f17899bf;
    public static final int f17900bg;
    public static final int f17901bh;
    public static final int f17902bi;
    public static final int bj;
    public static final int bk;
    public static final int bl;
    public static int f17904c0;
    public static Drawable f17905c1;
    public static Paint f17906c2;
    public static TextPaint f17907c3;
    public static Drawable f17908c4;
    public static Drawable f17909c5;
    public static final int f17910c6;
    public static final int f17911c7;
    public static final int f17912c8;
    public static final int f17913c9;
    public static final int f17914ca;
    public static final int cb;
    public static final int f17915cc;
    public static final int f17916cd;
    public static final int f17917ce;
    public static final int f17918cf;
    public static final int f17919cg;
    public static final int f17920ch;
    public static final int f17921ci;
    public static final int cj;
    public static final int ck;
    public static final int cl;
    public static fg.v0 d;
    public static int f17922d0;
    public static Drawable f17923d1;
    public static Paint f17924d2;
    public static TextPaint f17925d3;
    public static Drawable f17926d4;
    public static k8 f17927d5;
    public static final int f17928d6;
    public static final int f17929d7;
    public static final int f17930d8;
    public static final int f17931d9;
    public static final int f17932da;
    public static final int f17933db;
    public static final int f17934dc;
    public static final int f17935dd;
    public static final int f17936de;
    public static final int f17937df;
    public static final int dg;
    public static final int f17938dh;
    public static final int f17939di;
    public static final int dj;
    public static final int dk;
    public static final int dl;
    public static SensorManager e;
    public static Drawable f17940e0;
    public static Drawable f17941e1;
    public static Paint f17942e2;
    public static TextPaint f17943e3;
    public static Drawable f17944e4;
    public static HashMap f17945e5;
    public static final int f17946e6;
    public static final int e7;
    public static final int f17947e8;
    public static final int f17948e9;
    public static final int f17949ea;
    public static final int f17950eb;
    public static final int ec;
    public static final int f17951ed;
    public static final int f17952ee;
    public static final int f17953ef;
    public static final int f17954eg;
    public static final int f17955eh;
    public static final int f17956ei;
    public static final int ej;
    public static final int ek;
    public static final int el;
    public static Sensor f17957f;
    public static Drawable f17958f0;
    public static Drawable f17959f1;
    public static Paint f17960f2;
    public static TextPaint f17961f3;
    public static Drawable f17962f4;
    public static final int f17963f5;
    public static final int f17964f6;
    public static final int f7;
    public static final int f17965f8;
    public static final int f17966f9;
    public static final int f17967fa;
    public static final int f17968fb;
    public static final int f17969fc;
    public static final int f17970fd;
    public static final int fe;
    public static final int f17971ff;
    public static final int f17972fg;
    public static final int f17973fh;
    public static final int f17974fi;
    public static final int fj;
    public static final int fk;
    public static final int fl;
    public static boolean f17975g;
    public static int f17976g0;
    public static hm0 f17977g1;
    public static Paint f17978g2;
    public static TextPaint f17979g3;
    public static Drawable f17980g4;
    public static final int f17981g5;
    public static final int f17982g6;
    public static final int f17983g7;
    public static final int f17984g8;
    public static final int f17985g9;
    public static final int ga;
    public static final int f17986gb;
    public static final int gc;
    public static final int f17987gd;
    public static final int f17988ge;
    public static final int f17989gf;
    public static final int f17990gg;
    public static final int f17991gh;
    public static final int f17992gi;
    public static final int gj;
    public static final int gk;
    public static final int gl;
    public static String f17993h0;
    public static hm0 f17994h1;
    public static Paint f17995h2;
    public static Drawable f17996h3;
    public static Drawable f17997h4;
    public static final int f17998h5;
    public static final int f17999h6;
    public static final int f18000h7;
    public static final int f18001h8;
    public static final int f18002h9;
    public static final int ha;
    public static final int f18003hb;
    public static final int f18004hc;
    public static final int f18005hd;
    public static final int f18006he;
    public static final int hf;
    public static final int f18007hg;
    public static final int f18008hh;
    public static final int f18009hi;
    public static final int hj;
    public static final int hk;
    public static final int hl;
    public static long f18010i;
    public static boolean f18011i0;
    public static Drawable f18012i1;
    public static Paint f18013i2;
    public static Drawable f18014i3;
    public static Drawable f18015i4;
    public static final int f18016i5;
    public static final int f18017i6;
    public static final int f18018i7;
    public static final int f18019i8;
    public static final int f18020i9;
    public static final int f18021ia;
    public static final int f18022ib;
    public static final int f18023ic;
    public static final int f18024id;
    public static final int f18025ie;
    public static final int f18026ig;
    public static final int f18027ih;
    public static final int f18028ii;
    public static final int ij;
    public static final int ik;
    public static final int il;
    public static boolean f18029j;
    public static boolean f18030j0;
    public static Drawable f18031j1;
    public static Paint f18032j2;
    public static Drawable j3;
    public static Drawable f18033j4;
    public static final int f18034j5;
    public static final int f18035j6;
    public static final int f18036j7;
    public static final int f18037j8;
    public static final int f18038j9;
    public static final int f18039ja;
    public static final int f18040jb;
    public static final int f18041jc;
    public static final int f18042jd;
    public static final int f18043je;
    public static final int f18044jf;
    public static final int f18045jg;
    public static final int f18046jh;
    public static final int f18047ji;
    public static final int jj;
    public static final int jk;
    public static final HashMap jl;
    public static boolean f18048k;
    public static Paint f18049k0;
    public static Drawable f18050k1;
    public static Paint f18051k2;
    public static j5 f18052k3;
    public static Drawable f18053k4;
    public static final int f18054k5;
    public static final int f18055k6;
    public static final int f18056k7;
    public static final int f18057k8;
    public static final int f18058k9;
    public static final int f18059ka;
    public static final int f18060kb;
    public static final int f18061kc;
    public static final int f18062kd;
    public static final int f18063ke;
    public static final int f18064kf;
    public static final int f18065kg;
    public static final int f18066kh;
    public static final int f18067ki;
    public static final int kj;
    public static final int kk;
    public static final HashMap kl;
    public static Paint f18069l0;
    public static Drawable l1;
    public static Paint f18070l2;
    public static Drawable f18071l3;
    public static Drawable l4;
    public static final int f18072l5;
    public static final int f18073l6;
    public static final int f18074l7;
    public static final int f18075l8;
    public static final int f18076l9;
    public static final int f18077la;
    public static final int f18078lb;
    public static final int f18079lc;
    public static final int f18080ld;
    public static final int f18081le;
    public static final int f18082lf;
    public static final int f18083lg;
    public static final int f18084lh;
    public static final int li;
    public static final int lj;
    public static final int lk;
    public static final HashMap ll;
    public static Paint m0;
    public static Drawable f18086m1;
    public static Paint f18087m2;
    public static h5 f18088m3;
    public static Drawable f18089m4;
    public static final int f18090m5;
    public static final int f18091m6;
    public static final int f18092m7;
    public static final int f18093m8;
    public static final int f18094m9;
    public static final int f18095ma;
    public static final int f18096mb;
    public static final int f18097mc;
    public static final int f18098md;
    public static final int f18099me;
    public static final int f18100mf;
    public static final int f18101mg;
    public static final int f18102mh;
    public static final int mi;
    public static final int mj;
    public static final int mk;
    public static final HashMap ml;
    public static Paint f18104n0;
    public static Drawable f18105n1;
    public static Paint f18106n2;
    public static h5 f18107n3;
    public static Drawable f18108n4;
    public static final int f18109n5;
    public static final int f18110n6;
    public static final int f18111n7;
    public static final int f18112n8;
    public static final int f18113n9;
    public static final int f18114na;
    public static final int nb;
    public static final int nc;
    public static final int f18115nd;
    public static final int ne;
    public static final int f18116nf;
    public static final int f18117ng;
    public static final int f18118nh;
    public static final int ni;
    public static final int nj;
    public static final int nk;
    public static final int[] nl;
    public static int f18119o;
    public static Paint f18120o0;
    public static Drawable f18121o1;
    public static TextPaint f18122o2;
    public static h5 f18123o3;
    public static Drawable f18124o4;
    public static final int f18125o5;
    public static final int f18126o6;
    public static final int f18127o7;
    public static final int f18128o8;
    public static final int o9;
    public static final int f18129oa;
    public static final int f18130ob;
    public static final int f18131oc;
    public static final int f18132od;
    public static final int f18133oe;
    public static final int f18134of;
    public static final int f18135og;
    public static final int f18136oh;
    public static final int oi;
    public static final int oj;
    public static final int ok;
    public static final SparseIntArray ol;
    public static boolean f18137p;
    public static Paint f18138p0;
    public static Drawable f18139p1;
    public static TextPaint f18140p2;
    public static h5 f18141p3;
    public static Drawable f18142p4;
    public static final int p5;
    public static final int f18143p6;
    public static final int f18144p7;
    public static final int[] f18145p8;
    public static final int f18146p9;
    public static final int f18147pa;
    public static final int f18148pb;
    public static final int f18149pc;
    public static final int f18150pd;
    public static final int f18151pe;
    public static final int f18152pf;
    public static final int f18153pg;
    public static final int f18154ph;
    public static final int pi;
    public static final int pj;
    public static final int pk;
    public static final HashSet pl;
    public static float f18155q;
    public static Paint f18156q0;
    public static Drawable f18157q1;
    public static TextPaint f18158q2;
    public static h5 f18159q3;
    public static Drawable f18160q4;
    public static final int f18161q5;
    public static final int q6;
    public static final int f18162q7;
    public static final int[] f18163q8;
    public static final int f18164q9;
    public static final int f18165qa;
    public static final int f18166qb;
    public static final int f18167qc;
    public static final int f18168qd;
    public static final int f18169qe;
    public static final int f18170qf;
    public static final int f18171qg;
    public static final int f18172qh;
    public static final int qi;
    public static final int qj;
    public static final int qk;
    public static SparseIntArray ql;
    public static int f18173r;
    public static Drawable f18175r1;
    public static TextPaint f18176r2;
    public static h5 f18177r3;
    public static Drawable f18178r4;
    public static final int f18179r5;
    public static final int f18180r6;
    public static final int f18181r7;
    public static final int[] f18182r8;
    public static final int f18183r9;
    public static final int f18184ra;
    public static final int f18185rb;
    public static final int f18186rc;
    public static final int f18187rd;
    public static final int f18188re;
    public static final int f18189rf;
    public static final int f18190rg;
    public static final int f18191rh;
    public static final int ri;
    public static final int rj;
    public static final int rk;
    public static SparseIntArray rl;
    public static int f18192s;
    public static Drawable f18193s0;
    public static Drawable f18194s1;
    public static TextPaint f18195s2;
    public static h5 f18196s3;
    public static Drawable f18197s4;
    public static final int f18198s5;
    public static final int f18199s6;
    public static final int f18200s7;
    public static final int f18201s8;
    public static final int f18202s9;
    public static final int f18203sa;
    public static final int f18204sb;
    public static final int f18205sc;
    public static final int f18206sd;
    public static final int f18207se;
    public static final int f18208sf;
    public static final int f18209sg;
    public static final int f18210sh;
    public static final int si;
    public static final int sj;
    public static final int sk;
    public static SparseIntArray sl;
    public static int f18211t;
    public static Paint f18212t0;
    public static Drawable f18213t1;
    public static TextPaint f18214t2;
    public static h5 f18215t3;
    public static Drawable f18216t4;
    public static final int f18217t5;
    public static final int f18218t6;
    public static final int f18219t7;
    public static final int f18220t8;
    public static final int f18221t9;
    public static final int ta;
    public static final int f18222tb;
    public static final int f18223tc;
    public static final int f18224td;
    public static final int f18225te;
    public static final int f18226tf;
    public static final int f18227tg;
    public static final int f18228th;
    public static final int ti;
    public static final int tj;
    public static final int tk;
    public static boolean tl;
    public static int f18229u;
    public static Paint f18230u0;
    public static hj0 f18231u1;
    public static TextPaint f18232u2;
    public static Drawable f18234u4;
    public static final int f18235u5;
    public static final int f18236u6;
    public static final int f18237u7;
    public static final int f18238u8;
    public static final int f18239u9;
    public static final int f18240ua;
    public static final int f18241ub;
    public static final int f18242uc;
    public static final int f18243ud;
    public static final int f18244ue;
    public static final int f18245uf;
    public static final int f18246ug;
    public static final int f18247uh;
    public static final int ui;
    public static final int uj;
    public static final int uk;
    public static final ThreadLocal ul;
    public static int v;
    public static Paint f18248v0;
    public static hj0 f18249v1;
    public static TextPaint f18250v2;
    public static PorterDuffColorFilter f18251v3;
    public static Drawable f18252v4;
    public static final int f18253v5;
    public static final int f18254v6;
    public static final int f18255v7;
    public static final int f18256v8;
    public static final int v9;
    public static final int f18257va;
    public static final int f18258vb;
    public static final int f18259vc;
    public static final int f18260vd;
    public static final int f18261ve;
    public static final int vf;
    public static final int f18262vg;
    public static final int f18263vh;
    public static final int vi;
    public static final int vj;
    public static final int vk;
    public static final ThreadLocal vl;
    public static String f18264w;
    public static Paint f18265w0;
    public static hj0 f18266w1;
    public static TextPaint f18267w2;
    public static PorterDuffColorFilter f18268w3;
    public static Drawable f18269w4;
    public static final int f18270w5;
    public static final int f18271w6;
    public static final int f18272w7;
    public static final int f18273w8;
    public static final int f18274w9;
    public static final int f18275wa;
    public static final int f18276wb;
    public static final int wc;
    public static final int f18277wd;
    public static final int f18278we;
    public static final int f18279wf;
    public static final int f18280wg;
    public static final int f18281wh;
    public static final int wi;
    public static final int wj;
    public static final int wk;
    public static final ThreadLocal wl;
    public static double f18282x;
    public static Paint f18283x0;
    public static hj0 f18284x1;
    public static TextPaint f18285x2;
    public static ie0 f18286x3;
    public static Drawable f18287x4;
    public static final int f18288x5;
    public static final int f18289x6;
    public static final int f18290x7;
    public static final int f18291x8;
    public static final int f18292x9;
    public static final int f18293xa;
    public static final int f18294xb;
    public static final int xc;
    public static final int f18295xd;
    public static final int f18296xe;
    public static final int f18297xf;
    public static final int f18298xg;
    public static final int f18299xh;
    public static final int xi;
    public static final int xj;
    public static final int xk;
    public static final ThreadLocal xl;
    public static double f18300y;
    public static Paint f18301y0;
    public static hj0 f18302y1;
    public static TextPaint[] f18303y2;
    public static Drawable y3;
    public static Drawable f18304y4;
    public static final int f18305y5;
    public static final int f18306y6;
    public static final int f18307y7;
    public static final int f18308y8;
    public static final int f18309y9;
    public static final int f18310ya;
    public static final int f18311yb;
    public static final int f18312yc;
    public static final int f18313yd;
    public static final int f18314ye;
    public static final int f18315yf;
    public static final int f18316yg;
    public static final int f18317yh;
    public static final int yi;
    public static final int yj;
    public static final int yk;
    public static final ThreadLocal yl;
    public static Paint f18319z0;
    public static hj0 f18320z1;
    public static TextPaint f18321z2;
    public static Drawable f18322z3;
    public static Drawable f18323z4;
    public static final int f18324z5;
    public static final int f18325z6;
    public static final int f18326z7;
    public static final int f18327z8;
    public static final int f18328z9;
    public static final int f18329za;
    public static final int f18330zb;
    public static final int f18331zc;
    public static final int f18332zd;
    public static final int f18333ze;
    public static final int f18334zf;
    public static final int f18335zg;
    public static final int f18336zh;
    public static final int zi;
    public static final int zj;
    public static final int zk;
    public static g20 zl;
    public static final int f17865a = i0.a.k(-16777216, 27);
    public static final Object f17903c = new Object();
    public static float h = 1.0f;
    public static final androidx.emoji2.text.n f18068l = new androidx.emoji2.text.n(2);
    public static final androidx.emoji2.text.n f18085m = new androidx.emoji2.text.n(3);
    public static final int f18103n = 99;
    public static final Paint f18318z = new Paint(1);
    public static final boolean[] C = new boolean[4];
    public static final int[] D = new int[4];
    public static final long[] E = new long[4];
    public static final Drawable[] f18174r0 = new Drawable[25];
    public static final ww0[] f18233u3 = new ww0[6];
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
    public static final Path[] f17870a5 = new Path[3];

    static {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.j6.<clinit>():void");
    }

    public static void A() {
        if (f18119o != 2) {
            if (f18048k) {
                f18048k = false;
                AndroidUtilities.cancelRunOnUIThread(f18085m);
            }
            if (f18029j) {
                f18029j = false;
                AndroidUtilities.cancelRunOnUIThread(f18068l);
            }
            if (f17975g) {
                h = 1.0f;
                e.unregisterListener(Dl, f17957f);
                f17975g = false;
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
                    float[] fArr = g6Var.f17750b;
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
                    g6Var.f17751c = true;
                    g6Var.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static int B(i6 i6Var, int i10, int i11) {
        int i12;
        if (i10 != 0 && (i12 = i6Var.X) != 0 && i10 != i12 && (!i6Var.S || i6Var.Y != f18103n)) {
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
        Color.colorToHSV(k10.f17794c, M03);
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
            if ((i10 < f18329za || i10 >= Ga) && i10 != D9 && i10 != N9 && i10 != E9 && i10 != Pd && i10 != Qd) {
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
                        h6Var = (h6) i6Var.f17839c0.get(tL_theme.f17332id);
                    } else {
                        return;
                    }
                }
                if (h6Var != null) {
                    TLRPC.TL_theme tL_theme2 = h6Var.f17806r;
                    if (tL_theme2 != null) {
                        i6Var.f17839c0.remove(tL_theme2.f17332id);
                    }
                    h6Var.f17806r = tL_theme;
                    h6Var.f17808t = i10;
                    i6Var.f17839c0.put(tL_theme.f17332id, h6Var);
                    if (!i6.a(h6Var, themeSettings)) {
                        File d10 = h6Var.d();
                        if (d10 != null) {
                            d10.delete();
                        }
                        i6.i(h6Var, themeSettings);
                        i6 i6Var2 = I;
                        if (i6Var2 == i6Var && i6Var2.Y == h6Var.f17792a) {
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
                    h6Var.f17805q = z11;
                    i6Var.T = false;
                } else {
                    return;
                }
            } else {
                if (i6Var != null) {
                    str = i6Var.m();
                    hashMap.remove(str);
                } else {
                    str = "remote" + tL_theme.f17332id;
                    i6Var = (i6) hashMap.get(str);
                }
                if (i6Var == null) {
                    return;
                }
                i6Var.F = tL_theme;
                i6Var.f17834a = tL_theme.title;
                File file = new File(i6Var.f17836b);
                File file2 = new File(ApplicationLoader.getFilesDirFixed(), r6.t(str, ".attheme"));
                if (!file.equals(file2)) {
                    try {
                        AndroidUtilities.copyFile(file, file2);
                        i6Var.f17836b = file2.getAbsolutePath();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (z10) {
                    i6Var.G = false;
                    i6Var.f17844g0 = null;
                    i6Var.f17845h0 = null;
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

    public static g20 D0() {
        if (zl == null) {
            ?? obj = new Object();
            obj.f23214a = new f20[4];
            obj.f23221k = 1.0f;
            obj.f23222l = new ArrayList();
            obj.f23223m = new Paint(1);
            obj.f23224n = new Path();
            for (int i10 = 0; i10 < 4; i10++) {
                obj.f23214a[i10] = new f20(i10);
            }
            zl = obj;
        }
        return zl;
    }

    public static void D1(i6 i6Var) {
        Collections.sort(i6Var.f17837b0, new a4.e(19));
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
                if (f18048k) {
                    f18048k = false;
                    AndroidUtilities.cancelRunOnUIThread(f18085m);
                }
                if (f18029j) {
                    f18029j = false;
                    AndroidUtilities.cancelRunOnUIThread(f18068l);
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
                f18010i = 0L;
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
                        } else if (k10 != null && (tL_theme = k10.f17806r) != null) {
                            i10 = UserConfig.selectedAccount;
                        }
                        if (tL_theme.document != null) {
                            A++;
                            TL_account.getTheme gettheme = new TL_account.getTheme();
                            gettheme.document_id = tL_theme.document.f17201id;
                            gettheme.format = "android";
                            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                            tL_inputTheme.access_hash = tL_theme.access_hash;
                            tL_inputTheme.f17266id = tL_theme.f17332id;
                            gettheme.theme = tL_inputTheme;
                            ConnectionsManager.getInstance(i10).sendRequest(gettheme, new wa(k10, i6Var, tL_theme, 6));
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
        if (f18119o != 0) {
            if (p2Var != null) {
                try {
                    wc a02 = wc.a0(p2Var);
                    int i10 = R.raw.auto_night_off;
                    if (f18119o == 3) {
                        string = LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff);
                    } else {
                        string = LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff);
                    }
                    a02.I(i10, string, LocaleController.getString("Settings", R.string.Settings), 5000, false, new q(p2Var, 17)).j();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            f18119o = 0;
            q1();
            A();
        }
    }

    public static void G(SparseIntArray sparseIntArray, i6 i6Var) {
        if (i6Var != null && i6Var.f17847j0 == -1) {
            int i10 = f17928d6;
            if (i0.a.f(i0.a.d(0.5f, F0(sparseIntArray, i10), F0(sparseIntArray, i10))) < 0.5d) {
                i6Var.f17847j0 = 1;
            } else {
                i6Var.f17847j0 = 0;
            }
        }
    }

    public static org.telegram.ui.Cells.z G0(int i10, int i11) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i11 & 16777215) | 419430400}), null, b0(i10, -1));
    }

    public static void G1(MessageObject messageObject) {
        k8 k8Var = f17927d5;
        if (k8Var == null) {
            return;
        }
        if (k8Var.f24658i != null && messageObject != null) {
            if (f17945e5 == null) {
                f17945e5 = new HashMap();
            }
            f17945e5.put(messageObject, f17927d5);
            f17927d5.e(false, true, null);
            AndroidUtilities.runOnUIThread(new q(messageObject, 18), 200L);
            f17927d5 = null;
            return;
        }
        k8Var.f24658i = null;
    }

    public static u6 H(i6 i6Var, SparseIntArray sparseIntArray, String str, int i10, boolean z10) {
        boolean z11;
        File file;
        boolean z12;
        float f10;
        float f11;
        if (i6Var.S && i6Var.Y == f18103n) {
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
        if (k10 != null && k10.f17805q) {
            z12 = true;
        } else {
            z12 = false;
        }
        c6 c6Var = i6Var.f17846i0;
        if (c6Var != null) {
            f11 = c6Var.f17582k;
        } else if (k10 != null) {
            f11 = k10.f17804p;
        } else {
            f10 = i6Var.f17853y;
            return I(i6Var, c6Var, sparseIntArray, file, str, ql.get(f17981g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
        }
        f10 = f11 * 100.0f;
        return I(i6Var, c6Var, sparseIntArray, file, str, ql.get(f17981g5, -1), (int) f10, i10, z11, false, false, z12, null, z10);
    }

    public static String H0() {
        c6 c6Var = I.f17846i0;
        if (c6Var != null) {
            return c6Var.f17577c;
        }
        if (d1()) {
            return "t";
        }
        return "d";
    }

    public static bi.u6 I(org.telegram.ui.ActionBar.i6 r24, org.telegram.ui.ActionBar.c6 r25, android.util.SparseIntArray r26, java.io.File r27, java.lang.String r28, int r29, int r30, int r31, boolean r32, boolean r33, boolean r34, boolean r35, org.telegram.tgnet.TLRPC.Document r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.j6.I(org.telegram.ui.ActionBar.i6, org.telegram.ui.ActionBar.c6, android.util.SparseIntArray, java.io.File, java.lang.String, int, int, int, boolean, boolean, boolean, boolean, org.telegram.tgnet.TLRPC$Document, boolean):bi.u6");
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
        if (!z10 && f18088m3 == null) {
            Resources resources = context.getResources();
            f17996h3 = resources.getDrawable(R.drawable.video_muted);
            f18071l3 = resources.getDrawable(R.drawable.media_live_on).mutate();
            f18088m3 = new h5(0, false, false, null);
            f18107n3 = new h5(0, false, true, null);
            f18123o3 = new h5(0, true, false, null);
            f18141p3 = new h5(0, true, true, null);
            f18159q3 = new h5(1, false, false, null);
            f18177r3 = new h5(1, false, true, null);
            f18196s3 = new h5(1, true, false, null);
            f18215t3 = new h5(1, true, true, null);
            ?? obj = new Object();
            obj.f24010a = new Path();
            obj.f24011b = -1.0f;
            obj.f24014g = new ArrayList();
            obj.f24012c = 0.293f;
            obj.d = -26.0f;
            obj.e = -28.0f;
            obj.f24013f = 1.0f;
            f18286x3 = obj;
            obj.a("M 34.141 16.042 C 37.384 17.921 40.886 20.001 44.211 21.965 C 46.139 23.104 49.285 24.729 49.586 25.917 C 50.289 28.687 48.484 30 46.274 30 L 6 30.021 C 3.79 30.021 2.075 30.023 2 26.021 L 2.009 3.417 C 2.009 0.417 5.326 -0.58 7.068 0.417 C 10.545 2.406 25.024 10.761 34.141 16.042 Z", 166.0f);
            f18286x3.a("M 37.843 17.769 C 41.143 19.508 44.131 21.164 47.429 23.117 C 48.542 23.775 49.623 24.561 49.761 25.993 C 50.074 28.708 48.557 30 46.347 30 L 6 30.012 C 3.79 30.012 2 28.222 2 26.012 L 2.009 4.609 C 2.009 1.626 5.276 0.664 7.074 1.541 C 10.608 3.309 28.488 12.842 37.843 17.769 Z", 200.0f);
            f18286x3.a("M 40.644 18.756 C 43.986 20.389 49.867 23.108 49.884 25.534 C 49.897 27.154 49.88 24.441 49.894 26.059 C 49.911 28.733 48.6 30 46.39 30 L 6 30.013 C 3.79 30.013 2 28.223 2 26.013 L 2.008 5.52 C 2.008 2.55 5.237 1.614 7.079 2.401 C 10.656 4 31.106 14.097 40.644 18.756 Z", 217.0f);
            f18286x3.a("M 43.782 19.218 C 47.117 20.675 50.075 21.538 50.041 24.796 C 50.022 26.606 50.038 24.309 50.039 26.104 C 50.038 28.736 48.663 30 46.453 30 L 6 29.986 C 3.79 29.986 2 28.196 2 25.986 L 2.008 6.491 C 2.008 3.535 5.196 2.627 7.085 3.316 C 10.708 4.731 33.992 14.944 43.782 19.218 Z", 234.0f);
            f18286x3.a("M 47.421 16.941 C 50.544 18.191 50.783 19.91 50.769 22.706 C 50.761 24.484 50.76 23.953 50.79 26.073 C 50.814 27.835 49.334 30 47.124 30 L 5 30.01 C 2.79 30.01 1 28.22 1 26.01 L 1.001 10.823 C 1.001 8.218 3.532 6.895 5.572 7.26 C 7.493 8.01 47.421 16.941 47.421 16.941 Z", 267.0f);
            f18286x3.a("M 47.641 17.125 C 50.641 18.207 51.09 19.935 51.078 22.653 C 51.07 24.191 51.062 21.23 51.088 23.063 C 51.109 24.886 49.587 27 47.377 27 L 5 27.009 C 2.79 27.009 1 25.219 1 23.009 L 0.983 11.459 C 0.983 8.908 3.414 7.522 5.476 7.838 C 7.138 8.486 47.641 17.125 47.641 17.125 Z", 300.0f);
            f18286x3.a("M 48 7 C 50.21 7 52 8.79 52 11 C 52 19 52 19 52 19 C 52 21.21 50.21 23 48 23 L 4 23 C 1.79 23 0 21.21 0 19 L 0 11 C 0 8.79 1.79 7 4 7 C 48 7 48 7 48 7 Z", 383.0f);
            y3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            f18322z3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            A3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            B3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            F3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            H3 = resources.getDrawable(R.drawable.msg_check_s).mutate();
            C3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            D3 = resources.getDrawable(R.drawable.msg_halfcheck).mutate();
            G3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            I3 = resources.getDrawable(R.drawable.msg_halfcheck_s).mutate();
            E3 = new sc0();
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
            f17869a4 = resources.getDrawable(R.drawable.msg_views).mutate();
            f17889b4 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            J3 = resources.getDrawable(R.drawable.msg_views).mutate();
            K3 = resources.getDrawable(R.drawable.msg_reply_small).mutate();
            f17908c4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f17926d4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f17944e4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f17962f4 = resources.getDrawable(R.drawable.msg_actions).mutate();
            f17980g4 = resources.getDrawable(R.drawable.video_actions);
            f17997h4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            f18015i4 = resources.getDrawable(R.drawable.msg_instant).mutate();
            f18033j4 = resources.getDrawable(R.drawable.msg_warning);
            f18053k4 = resources.getDrawable(R.drawable.list_mute).mutate();
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
            f18089m4 = resources.getDrawable(R.drawable.bot_file);
            f18108n4 = resources.getDrawable(R.drawable.bot_music);
            f18124o4 = resources.getDrawable(R.drawable.bot_location);
            f18252v4 = resources.getDrawable(R.drawable.bot_link);
            f18287x4 = resources.getDrawable(R.drawable.bot_lines);
            f18269w4 = resources.getDrawable(R.drawable.bot_card);
            f18304y4 = resources.getDrawable(R.drawable.bot_webview);
            f18323z4 = resources.getDrawable(R.drawable.bot_invite);
            A4 = resources.getDrawable(R.drawable.permission_locked);
            B4 = resources.getDrawable(R.drawable.msg_msgbubble);
            C4 = resources.getDrawable(R.drawable.msg_msgbubble2);
            D4 = resources.getDrawable(R.drawable.msg_arrowright);
            E4 = resources.getDrawable(R.drawable.gradient_left);
            F4 = resources.getDrawable(R.drawable.gradient_right);
            f18142p4 = resources.getDrawable(R.drawable.header_shadow).mutate();
            R4 = resources.getDrawable(R.drawable.nophotos3);
            f18160q4 = resources.getDrawable(R.drawable.filled_button_share).mutate();
            f18178r4 = resources.getDrawable(R.drawable.filled_button_reply);
            f18197s4 = resources.getDrawable(R.drawable.msg_voiceclose).mutate();
            f18216t4 = resources.getDrawable(R.drawable.media_more).mutate();
            f18234u4 = resources.getDrawable(R.drawable.filled_open_message);
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
            f17890b5 = resources.getDrawable(R.drawable.filled_fire).mutate();
            f17909c5 = resources.getDrawable(R.drawable.msg_round_gif_m).mutate();
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
            vq L10 = L(AndroidUtilities.dp(44.0f), R.drawable.msg_contact);
            Drawable[] drawableArr7 = T4;
            drawableArr7[0] = L10;
            drawableArr7[1] = L(AndroidUtilities.dp(44.0f), R.drawable.msg_contact);
            Drawable mutate5 = resources.getDrawable(R.drawable.msg_location).mutate();
            Drawable[] drawableArr8 = S4;
            drawableArr8[0] = mutate5;
            drawableArr8[1] = resources.getDrawable(R.drawable.msg_location).mutate();
            f18014i3 = context.getResources().getDrawable(R.drawable.compose_panel_shadow).mutate();
            j3 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            j5 j5Var = new j5(0);
            Paint paint = new Paint(1);
            j5Var.f17864b = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
            f18052k3 = j5Var;
            jl.clear();
            kl.clear();
            Drawable drawable = f18287x4;
            int i12 = f18061kc;
            d(i12, "drawableBotInline", drawable);
            d(i12, "drawableBotWebView", f18304y4);
            d(i12, "drawableBotLock", A4);
            d(i12, "drawableBotLink", f18252v4);
            d(i12, "drawable_botInvite", f18323z4);
            d(i12, "drawableGoIcon", f18234u4);
            d(i12, "drawableCommentSticker", C4);
            d(Gc, "drawableMsgError", f18033j4);
            d(-1, "drawableMsgIn", f18088m3);
            d(-1, "drawableMsgInSelected", f18107n3);
            d(-1, "drawableMsgInMedia", f18159q3);
            d(-1, "drawableMsgInMediaSelected", f18177r3);
            d(Dc, "drawableMsgInInstant", f17997h4);
            d(-1, "drawableMsgOut", f18123o3);
            d(-1, "drawableMsgOutSelected", f18141p3);
            d(-1, "drawableMsgOutMedia", f18196s3);
            d(-1, "drawableMsgOutMediaSelected", f18215t3);
            Drawable drawable2 = drawableArr4[0];
            int i13 = Va;
            d(i13, "drawableMsgOutCallAudio", drawable2);
            Drawable drawable3 = drawableArr5[0];
            int i14 = Wa;
            d(i14, "drawableMsgOutCallAudioSelected", drawable3);
            d(i13, "drawableMsgOutCallVideo", drawableArr4[1]);
            d(i14, "drawableMsgOutCallVideo", drawableArr5[1]);
            d(Ja, "drawableMsgOutCheck", y3);
            d(Ka, "drawableMsgOutCheckSelected", f18322z3);
            Drawable drawable4 = A3;
            int i15 = La;
            d(i15, "drawableMsgOutCheckRead", drawable4);
            Drawable drawable5 = B3;
            int i16 = Ma;
            d(i16, "drawableMsgOutCheckReadSelected", drawable5);
            d(i15, "drawableMsgOutHalfCheck", C3);
            d(i16, "drawableMsgOutHalfCheckSelected", D3);
            d(i13, "drawableMsgOutInstant", f18015i4);
            d(Ta, "drawableMsgOutMenu", f17944e4);
            d(Ua, "drawableMsgOutMenuSelected", f17962f4);
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
            int i19 = f18023ic;
            d(i19, "drawableMsgStickerCheck", drawable8);
            d(i19, "drawableMsgStickerHalfCheck", I3);
            d(i19, "drawableMsgStickerPinned", Y3);
            d(i19, "drawableMsgStickerReplies", K3);
            d(i19, "drawableMsgStickerViews", J3);
            d(i12, "drawableReplyIcon", f18178r4);
            d(i12, "drawableCloseIcon", f18197s4);
            d(i12, "drawableMoreIcon", f18216t4);
            d(i12, "drawableShareIcon", f18160q4);
            d(f18131oc, "drawableMuteIcon", f18053k4);
            d(f18149pc, "drawableLockIcon", l4);
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
            f17925d3.setTextSize(AndroidUtilities.dp(f14));
            X2.setTextSize(AndroidUtilities.dp(f13));
            U2.setTextSize(AndroidUtilities.dp(f14));
            V2.setTextSize(AndroidUtilities.dp(12.0f));
            T2.setTextSize(AndroidUtilities.dp(12.0f));
            K2.setTextSize(AndroidUtilities.dp(13.0f));
            L2.setTextSize(AndroidUtilities.dp(13.0f));
            M2.setTextSize(AndroidUtilities.dp(13.0f));
            X1.setStrokeWidth(AndroidUtilities.dp(f10));
            Z1.setStrokeWidth(AndroidUtilities.dp(1.1f));
            f18195s2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            f18214t2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            f18232u2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 3));
            f18250v2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize)));
            f17961f3.setTextSize(AndroidUtilities.dp(15.0f));
            f17979g3.setTextSize(AndroidUtilities.dp(13.0f));
            f18051k2.setStrokeWidth(AndroidUtilities.dp(f11));
            f18070l2.setStrokeWidth(AndroidUtilities.dp(2.33f));
            f17943e3.setTextSize(AndroidUtilities.dp(f12));
            f17943e3.setTypeface(AndroidUtilities.bold());
        }
    }

    public static org.telegram.ui.Cells.z J0(f6 f6Var, boolean z10) {
        int v02 = v0(f18017i6, f6Var);
        if (z10) {
            return I0(v02, f17928d6, f6Var);
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
        int w02 = w0(null, f18017i6, false);
        if (z10) {
            return I0(w02, f17928d6, null);
        }
        return f0(w02, 2, -1);
    }

    public static vq L(int i10, int i11) {
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
        vq vqVar = new vq(shapeDrawable, drawable);
        vqVar.h = i10;
        vqVar.f28577n = i10;
        return vqVar;
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
        f18318z.setColor(-1);
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
            paint3.setPathEffect(g90.c());
            Paint paint4 = new Paint();
            V1 = paint4;
            paint4.setPathEffect(g90.c());
            Paint paint5 = new Paint();
            W1 = paint5;
            paint5.setPathEffect(g90.c());
            Paint paint6 = new Paint(1);
            f18051k2 = paint6;
            paint6.setStrokeCap(cap);
            f18051k2.setStyle(style);
            f18051k2.setColor(-1610612737);
            Paint paint7 = new Paint(1);
            f18070l2 = paint7;
            paint7.setStrokeCap(cap);
            f18070l2.setStyle(style);
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
            f17925d3 = textPaint12;
            textPaint12.setTypeface(AndroidUtilities.bold());
            f17907c3 = new TextPaint(1);
            f17943e3 = new TextPaint(1);
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
            f17887b2 = new Paint(1);
            f17906c2 = new Paint(1);
            Paint paint10 = new Paint(1);
            f17924d2 = paint10;
            paint10.setStyle(style);
            f17924d2.setStrokeCap(cap);
            f18195s2 = new TextPaint(1);
            f18214t2 = new TextPaint(1);
            f18232u2 = new TextPaint(1);
            f18195s2.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint14 = new TextPaint(1);
            f18250v2 = textPaint14;
            textPaint14.setTypeface(AndroidUtilities.bold());
            Paint paint11 = new Paint(1);
            f17995h2 = paint11;
            paint11.setColor(352321536);
            f18013i2 = new Paint(1);
            TextPaint textPaint15 = new TextPaint(1);
            f17961f3 = textPaint15;
            textPaint15.setTypeface(AndroidUtilities.bold());
            f17979g3 = new TextPaint(1);
            f18032j2 = new Paint();
            new Paint(1);
            f18087m2 = new Paint(1);
            f18106n2 = new Paint(1);
            f17942e2 = new Paint(1);
            f17960f2 = new Paint(7);
            f17978g2 = new Paint(7);
            e(Hc, f17942e2, "paintChatMessageBackgroundSelected");
            Paint paint12 = f17960f2;
            int i10 = f18079lc;
            e(i10, paint12, "paintChatActionBackground");
            e(i10, f17995h2, "paintChatActionBackgroundDarken");
            e(f18097mc, f17978g2, "paintChatActionBackgroundSelected");
            TextPaint textPaint16 = f18195s2;
            int i11 = f18023ic;
            e(i11, textPaint16, "paintChatActionText");
            e(i11, f18214t2, "paintChatActionText2");
            e(i11, f18232u2, "paintChatActionText3");
            e(Nc, Q2, "paintChatBotButton");
            e(Sd, f18032j2, "paintChatComposeBackground");
            e(wc, f18013i2, "paintChatTimeBackground");
        }
    }

    public static i6 N0(String str) {
        return (i6) H.get(str);
    }

    public static void O() {
        synchronized (f17903c) {
            try {
                if (f18122o2 == null) {
                    f18122o2 = new TextPaint(1);
                    f18285x2 = new TextPaint(1);
                    f18303y2 = new TextPaint[6];
                    f18321z2 = new TextPaint(1);
                    A2 = new TextPaint(1);
                    B2 = new TextPaint(1);
                    TextPaint textPaint = new TextPaint(1);
                    f18267w2 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint2 = new TextPaint(1);
                    W2 = textPaint2;
                    textPaint2.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint3 = new TextPaint(1);
                    Y2 = textPaint3;
                    textPaint3.setTypeface(AndroidUtilities.bold());
                    Z2 = new TextPaint(1);
                    f17868a3 = new TextPaint(1);
                    f17888b3 = new TextPaint(1);
                    f17907c3 = new TextPaint(1);
                    TextPaint textPaint4 = new TextPaint(1);
                    f17925d3 = textPaint4;
                    textPaint4.setTypeface(AndroidUtilities.bold());
                    X2 = new TextPaint(1);
                    U2 = new TextPaint(1);
                    T2 = new TextPaint(1);
                    TextPaint textPaint5 = new TextPaint(1);
                    f18140p2 = textPaint5;
                    Typeface typeface = Typeface.MONOSPACE;
                    textPaint5.setTypeface(typeface);
                    TextPaint textPaint6 = new TextPaint(1);
                    f18158q2 = textPaint6;
                    textPaint6.setTypeface(typeface);
                    TextPaint textPaint7 = new TextPaint(1);
                    f18176r2 = textPaint7;
                    textPaint7.setTypeface(typeface);
                    new TextPaint(1);
                    V2 = new TextPaint(1);
                }
                float[] fArr = {0.68f, 0.46f, 0.34f, 0.28f, 0.22f, 0.19f};
                int i10 = 0;
                while (true) {
                    TextPaint[] textPaintArr = f18303y2;
                    if (i10 < textPaintArr.length) {
                        textPaintArr[i10] = new TextPaint(1);
                        f18303y2[i10].setTextSize(AndroidUtilities.dp(fArr[i10] * 120.0f));
                        i10++;
                    } else {
                        f18321z2.setTextSize(AndroidUtilities.dp(46.0f));
                        A2.setTextSize(AndroidUtilities.dp(38.0f));
                        B2.setTextSize(AndroidUtilities.dp(30.0f));
                        f18122o2.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
                        f18285x2.setTextSize(AndroidUtilities.dp(14.0f));
                        f18267w2.setTextSize(AndroidUtilities.dp(15.0f));
                        float f10 = ((SharedConfig.fontSize * 2) + 10) / 3.0f;
                        W2.setTextSize(AndroidUtilities.dp(f10));
                        Y2.setTextSize(AndroidUtilities.dp(f10));
                        Z2.setTextSize(AndroidUtilities.dp(f10));
                        float f11 = f10 - 1.0f;
                        f17868a3.setTextSize(AndroidUtilities.dp(f11));
                        f17888b3.setTextSize(AndroidUtilities.dp(f10));
                        V2.setTextSize(AndroidUtilities.dp(12.0f));
                        f17925d3.setTextSize(AndroidUtilities.dp(f11));
                        f17907c3.setTextSize(AndroidUtilities.dp(f10 - 2.0f));
                        X2.setTextSize(AndroidUtilities.dp(f10));
                        U2.setTextSize(AndroidUtilities.dp(f11));
                        f18140p2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 1), SharedConfig.fontSize - 2)));
                        f18158q2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 3)));
                        f18176r2.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 5)));
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
        if (f18049k0 == null) {
            Paint paint = new Paint();
            f18049k0 = paint;
            paint.setStrokeWidth(1.0f);
            Paint paint2 = new Paint();
            f18069l0 = paint2;
            paint2.setStrokeWidth(1.0f);
            f18156q0 = new Paint(1);
            Paint paint3 = new Paint(1);
            f18120o0 = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            f18120o0.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f18120o0.setStrokeCap(Paint.Cap.ROUND);
            Paint paint4 = new Paint(1);
            f18104n0 = paint4;
            paint4.setColor(0);
            f18104n0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            f18138p0 = new Paint(1);
            Paint paint5 = new Paint();
            m0 = paint5;
            paint5.setPathEffect(g90.c());
            Resources resources = context.getResources();
            Drawable drawable = resources.getDrawable(R.drawable.chats_saved);
            Drawable[] drawableArr = f18174r0;
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
            hj0 hj0Var = f18231u1;
            if (hj0Var != null) {
                hj0Var.setCallback(null);
                f18231u1.C(false);
            }
            hj0 hj0Var2 = f18249v1;
            if (hj0Var2 != null) {
                hj0Var2.C(false);
            }
            hj0 hj0Var3 = f18266w1;
            if (hj0Var3 != null) {
                hj0Var3.C(false);
            }
            hj0 hj0Var4 = f18284x1;
            if (hj0Var4 != null) {
                hj0Var4.C(false);
            }
            hj0 hj0Var5 = f18302y1;
            if (hj0Var5 != null) {
                hj0Var5.C(false);
            }
            hj0 hj0Var6 = f18320z1;
            if (hj0Var6 != null) {
                hj0Var6.C(false);
            }
            f18231u1 = new hj0(R.raw.chats_archiveavatar, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f18249v1 = new hj0(R.raw.chats_archive, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f18266w1 = new hj0(R.raw.chats_unarchive, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f18284x1 = new hj0(R.raw.chats_hide, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f18302y1 = new hj0(R.raw.chats_unhide, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            f18320z1 = new hj0(R.raw.chat_audio_record_delete, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), false, null);
            H1 = new hj0(R.raw.swipe_mute, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            I1 = new hj0(R.raw.swipe_unmute, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            L1 = new hj0(R.raw.swipe_read, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            M1 = new hj0(R.raw.swipe_unread, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            J1 = new hj0(R.raw.swipe_delete, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            O1 = new hj0(R.raw.swipe_unpin, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            N1 = new hj0(R.raw.swipe_pin, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            K1 = new hj0(R.raw.swipe_community_ungroup, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
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

    public static lc0 Q(int i10, int i11) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        lc0 lc0Var = new lc0(z10, -2368069, -9722489, -2762611, -7817084);
        if (i10 <= 0 || i11 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            i11 = Math.max(point2.x, point2.y);
        }
        lc0Var.t(SvgHelper.getBitmap(R.raw.default_pattern, i10, i11, -16777216, 1.0f, SvgHelper.ScaleMode.ByWidth), 34);
        lc0Var.u(lc0Var.f());
        return lc0Var;
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
                sparseIntArray.put(f17981g5, i12);
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
            f18265w0 = new Paint(1);
            f18212t0 = new Paint(1);
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
            f18230u0 = new Paint();
            f18248v0 = new Paint(1);
            f18301y0 = new Paint(1);
            f18283x0 = new Paint(1);
            f18319z0 = new Paint(1);
            f17867a1 = resources.getDrawable(R.drawable.list_secret);
            f17886b1 = resources.getDrawable(R.drawable.msg_mini_lock2);
            T0 = resources.getDrawable(R.drawable.list_check).mutate();
            S0 = resources.getDrawable(R.drawable.community_cards).mutate();
            U0 = resources.getDrawable(R.drawable.minithumb_play).mutate();
            V0 = resources.getDrawable(R.drawable.list_check).mutate();
            W0 = resources.getDrawable(R.drawable.list_halfcheck);
            X0 = new sc0();
            Y0 = resources.getDrawable(R.drawable.list_warning_sign);
            Z0 = resources.getDrawable(R.drawable.list_reorder).mutate();
            f17905c1 = resources.getDrawable(R.drawable.list_mute).mutate();
            f17923d1 = resources.getDrawable(R.drawable.list_unmute).mutate();
            f17941e1 = resources.getDrawable(R.drawable.mini_ephemeral_hidden_16).mutate();
            f17959f1 = resources.getDrawable(R.drawable.verified_area).mutate();
            f17977g1 = new hm0(0);
            f17994h1 = new hm0(1);
            f18012i1 = resources.getDrawable(R.drawable.verified_check).mutate();
            f18086m1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            f18105n1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            f18121o1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            f18139p1 = resources.getDrawable(R.drawable.filled_chatlist_mention).mutate();
            f18157q1 = resources.getDrawable(R.drawable.filled_chatlist_reaction).mutate();
            f18175r1 = resources.getDrawable(R.drawable.filled_chatlist_poll).mutate();
            f18031j1 = resources.getDrawable(R.drawable.list_pin);
            f18050k1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            l1 = resources.getDrawable(R.drawable.msg_pin_mini).mutate();
            f18213t1 = resources.getDrawable(R.drawable.msg_mini_forumarrow);
            f18193s0 = resources.getDrawable(R.drawable.preview_arrow);
            RectF rectF = new RectF();
            Path path = new Path();
            Path[] pathArr = f17870a5;
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
        return T(context, w0(null, f18235u5, false), w0(null, f18253v5, false));
    }

    public static Paint S0(String str) {
        if (Objects.equals(str, "paintDivider")) {
            return f18049k0;
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

    public static Paint T0(String str, f6 f6Var) {
        Paint F10;
        if (f6Var != null && (F10 = f6Var.F(str)) != null) {
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
        f18318z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new x5(i11, i12, i13, i14, f10));
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
        f18318z.setColor(-1);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new g6(i11, i12));
    }

    public static String Y0(c6 c6Var) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (c6Var == null || TextUtils.isEmpty(c6Var.f17577c) || c6Var.f17577c.equals("d")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (c6Var.f17580i) {
            sb2.append("blur");
        }
        if (c6Var.f17581j) {
            if (sb2.length() > 0) {
                sb2.append("+");
            }
            sb2.append("motion");
        }
        int i10 = c6Var.d;
        if (i10 == 0) {
            str3 = "https://attheme.org?slug=" + c6Var.f17577c;
        } else {
            String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (c6Var.d >> 8)) & 255), Byte.valueOf((byte) (c6Var.d & 255))).toLowerCase();
            int i11 = c6Var.e;
            if (i11 != 0) {
                str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (c6Var.e >> 8)) & 255), Byte.valueOf((byte) (c6Var.e & 255))).toLowerCase();
            } else {
                str = null;
            }
            int i12 = c6Var.f17578f;
            if (i12 != 0) {
                str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (c6Var.f17578f >> 8)) & 255), Byte.valueOf((byte) (c6Var.f17578f & 255))).toLowerCase();
            } else {
                str2 = null;
            }
            int i13 = c6Var.f17579g;
            if (i13 != 0) {
                str4 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (c6Var.f17579g >> 8)) & 255), Byte.valueOf((byte) (c6Var.f17579g & 255))).toLowerCase();
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
                g10.append(c6Var.h);
                lowerCase = g10.toString();
            }
            str3 = "https://attheme.org?slug=" + c6Var.f17577c + "&intensity=" + ((int) (c6Var.f17582k * 100.0f)) + "&bg_color=" + lowerCase;
        }
        if (sb2.length() > 0) {
            StringBuilder g11 = w.f.g(str3, "&mode=");
            g11.append(sb2.toString());
            return g11.toString();
        }
        return str3;
    }

    public static org.telegram.ui.Cells.z Z(int i10, int i11, int i12, int i13) {
        f18318z.setColor(-1);
        float f10 = i12;
        float f11 = i13;
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), c0(AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), i10), new g6(f10, f11));
    }

    public static boolean Z0() {
        if (P && I.f17846i0 != null) {
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
        f18318z.setColor(-1);
        ?? drawable = new Drawable();
        drawable.f17749a = new Path();
        drawable.f17750b = r1;
        drawable.f17751c = true;
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
            M02[1] = w7.q.a(f12 + f10, 0.0f, 1.0f);
        }
        M02[2] = w7.q.a(M02[2] + f11, 0.0f, 1.0f);
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
        if (!i6Var.S || i6Var.Y != f18103n) {
            if (rl.indexOfKey(Nd) < 0 && f17976g0 <= 0 && TextUtils.isEmpty(f17993h0)) {
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
        int i11 = f18184ra;
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
        int i10 = f18184ra;
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
            int i17 = f17876ab;
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
        i6 i6Var = h6Var.f17793b;
        if (i6Var != null) {
            if (i6Var.m().equals("Blue") && h6Var.f17792a == 99) {
                return true;
            }
            if (h6Var.f17793b.m().equals("Day") && h6Var.f17792a == 9) {
                return true;
            }
            if ((h6Var.f17793b.m().equals("Night") || h6Var.f17793b.m().equals("Dark Blue")) && h6Var.f17792a == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void h(Drawable drawable) {
        boolean z10;
        Bitmap bitmap;
        if (f17942e2 == null) {
            return;
        }
        int i10 = rl.get(Hc);
        if ((drawable instanceof lc0) && SharedConfig.getDevicePerformanceClass() != 0 && i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && Y != (bitmap = ((lc0) drawable).f24949k)) {
            Y = bitmap;
            Bitmap bitmap2 = Y;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            Z = new BitmapShader(bitmap2, tileMode, tileMode);
            if (f17866a0 == null) {
                f17866a0 = new Matrix();
            }
        }
        if (Z != null && i10 == 0 && z10) {
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 2.5f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.75f);
            f17942e2.setShader(Z);
            f17942e2.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            f17942e2.setAlpha(64);
            return;
        }
        Paint paint = f17942e2;
        if (i10 == 0) {
            i10 = 1073741824;
        }
        paint.setColor(i10);
        f17942e2.setColorFilter(null);
        f17942e2.setShader(null);
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
                ConnectionsManager.getInstance(i10).sendRequest(getthemes, new di.t2(i10, 3));
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
        if (f17960f2 == null) {
            return;
        }
        X = f17904c0;
        f17885b0 = f17922d0;
        SparseIntArray sparseIntArray = rl;
        int i12 = f18079lc;
        int indexOfKey = sparseIntArray.indexOfKey(i12);
        if (indexOfKey >= 0) {
            i10 = rl.valueAt(indexOfKey);
        } else {
            i10 = X;
        }
        int indexOfKey2 = rl.indexOfKey(f18097mc);
        if (indexOfKey2 >= 0) {
            i11 = rl.valueAt(indexOfKey2);
        } else {
            i11 = f17885b0;
        }
        boolean z10 = drawable instanceof lc0;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z10) {
                bitmap = ((lc0) drawable).f24949k;
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
                if (f17866a0 == null) {
                    f17866a0 = new Matrix();
                }
            }
            w1(-1, Y3);
            w1(-1, H3);
            w1(-1, I3);
            w1(-1, J3);
            w1(-1, K3);
            f18195s2.setColor(-1);
            f18214t2.setColor(-1);
            f18232u2.setColor(-1);
            f18195s2.linkColor = -1;
            f18250v2.setColor(-1);
            Q2.setColor(-1);
            w1(-1, C4);
            w1(-1, f18160q4);
            w1(-1, f18178r4);
            w1(-1, f18234u4);
            w1(-1, f18287x4);
            w1(-1, f18304y4);
            w1(-1, A4);
            w1(-1, f18323z4);
            w1(-1, f18252v4);
        } else {
            Y = null;
            Z = null;
            Drawable drawable2 = Y3;
            int i13 = f18023ic;
            x1(i13, drawable2);
            x1(i13, H3);
            x1(i13, I3);
            x1(i13, J3);
            x1(i13, K3);
            f18195s2.setColor(w0(null, i13, false));
            f18214t2.setColor(w0(null, i13, false));
            f18195s2.linkColor = w0(null, f18041jc, false);
            f18250v2.setColor(w0(null, i13, false));
            Drawable drawable3 = C4;
            int i14 = f18061kc;
            x1(i14, drawable3);
            x1(i14, f18160q4);
            x1(i14, f18178r4);
            x1(i14, f18234u4);
            x1(i14, f18287x4);
            x1(i14, f18304y4);
            x1(i14, A4);
            x1(i14, f18323z4);
            x1(i14, f18252v4);
            Q2.setColor(w0(null, Nc, false));
        }
        f17960f2.setColor(i10);
        f17978g2.setColor(i11);
        if (Z != null && (rl.indexOfKey(i12) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix2 = new ColorMatrix();
            if (z10) {
                float f14 = -0.06f;
                if (((lc0) drawable).f24955q >= 0.0f) {
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
            f17960f2.setFilterBitmap(true);
            f17960f2.setShader(Z);
            f17960f2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
            f17960f2.setAlpha(255);
            f17978g2.setFilterBitmap(true);
            f17978g2.setShader(Z);
            ColorMatrix colorMatrix3 = new ColorMatrix(colorMatrix2);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.26f);
            e1();
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix3, 0.92f);
            f17978g2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
            f17978g2.setAlpha(255);
            f17995h2.setAlpha(0);
            return;
        }
        f17960f2.setColorFilter(null);
        f17960f2.setShader(null);
        f17978g2.setColorFilter(null);
        f17978g2.setShader(null);
        f17995h2.setAlpha(21);
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
        if (f18122o2 != null && f18088m3 != null && !z10) {
            K2.setColor(w0(null, Jc, false));
            J2.setColor(w0(null, Ic, false));
            Q2.setColor(w0(null, Nc, false));
            U1.setColor(w0(null, Ld, false));
            V1.setColor(w0(null, Mb, false));
            W1.setColor(w0(null, Md, false));
            f17887b2.setColor(w0(null, Fc, false));
            Paint paint = f17906c2;
            int i10 = f18147pa;
            paint.setColor(w0(null, i10, false));
            f17924d2.setColor(w0(null, i10, false));
            TextPaint textPaint = f18195s2;
            int i11 = f18023ic;
            textPaint.setColor(w0(null, i11, false));
            f18214t2.setColor(w0(null, i11, false));
            f18232u2.setColor(w0(null, i11, false));
            f18195s2.linkColor = w0(null, f18041jc, false);
            f18250v2.setColor(w0(null, i11, false));
            f17961f3.setColor(w0(null, G6, false));
            Paint paint2 = f18032j2;
            int i12 = Sd;
            paint2.setColor(w0(null, i12, false));
            f18013i2.setColor(w0(null, wc, false));
            x1(f18062kd, f17996h3);
            h5 h5Var = f18088m3;
            int i13 = f18184ra;
            x1(i13, h5Var);
            h5 h5Var2 = f18107n3;
            int i14 = f17934dc;
            x1(i14, h5Var2);
            x1(i13, f18159q3);
            x1(i14, f18177r3);
            x1(Ja, y3);
            x1(Ka, f18322z3);
            Drawable drawable = A3;
            int i15 = La;
            x1(i15, drawable);
            Drawable drawable2 = B3;
            int i16 = Ma;
            x1(i16, drawable2);
            x1(i15, C3);
            x1(i16, D3);
            Drawable drawable3 = F3;
            int i17 = f18205sc;
            x1(i17, drawable3);
            x1(i17, G3);
            x1(i11, H3);
            x1(i11, I3);
            x1(i11, J3);
            x1(i11, K3);
            x1(i11, L3);
            Drawable drawable4 = f18160q4;
            int i18 = f18061kc;
            x1(i18, drawable4);
            x1(i18, f18178r4);
            x1(i18, f18234u4);
            x1(i18, f18287x4);
            x1(i18, f18304y4);
            Drawable drawable5 = A4;
            int i19 = f18149pc;
            x1(i19, drawable5);
            x1(i18, f18323z4);
            x1(i18, f18252v4);
            Drawable drawable6 = M3;
            int i20 = xc;
            x1(i20, drawable6);
            Drawable drawable7 = N3;
            int i21 = f18312yc;
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
            int i24 = f18331zc;
            x1(i24, drawable10);
            x1(i11, Y3);
            x1(i24, f17869a4);
            x1(i24, f17889b4);
            x1(Ac, f17908c4);
            x1(Bc, f17926d4);
            x1(Ta, f17944e4);
            x1(Ua, f17962f4);
            x1(Cc, f17980g4);
            Drawable drawable11 = f18015i4;
            int i25 = Va;
            x1(i25, drawable11);
            Drawable drawable12 = f17997h4;
            int i26 = Dc;
            x1(i26, drawable12);
            x1(Gc, f18033j4);
            x1(f18131oc, f18053k4);
            x1(i19, l4);
            Drawable drawable13 = f18089m4;
            int i27 = Ge;
            x1(i27, drawable13);
            x1(i27, f18108n4);
            x1(i27, f18124o4);
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
            int i30 = f18181r7;
            x1(i30, drawable15);
            x1(f18165qa, Q4);
            x1(i30, V4);
            Drawable drawable16 = W4;
            int i31 = Di;
            x1(i31, drawable16);
            x1(i30, X4);
            x1(i31, Y4);
            int i32 = 0;
            while (true) {
                ww0[] ww0VarArr = f18233u3;
                if (i32 >= ww0VarArr.length) {
                    break;
                }
                x1(f18146p9, ww0VarArr[i32]);
                i32++;
            }
            for (int i33 = 0; i33 < 5; i33++) {
                Drawable[][] drawableArr = U4;
                v1(drawableArr[i33][0], w0(null, f18025ie, false), false);
                v1(drawableArr[i33][0], w0(null, f18242uc, false), true);
                v1(drawableArr[i33][1], w0(null, f18043je, false), false);
                v1(drawableArr[i33][1], w0(null, f18259vc, false), true);
            }
            Drawable[] drawableArr2 = T4;
            v1(drawableArr2[0], w0(null, f18188re, false), false);
            v1(drawableArr2[0], w0(null, f18207se, false), true);
            v1(drawableArr2[1], w0(null, Qb, false), false);
            v1(drawableArr2[1], w0(null, Rb, false), true);
            Drawable[] drawableArr3 = S4;
            w1(w0(null, f18169qe, false), drawableArr3[0]);
            w1(w0(null, Pb, false), drawableArr3[1]);
            Drawable[] drawableArr4 = M4;
            w1(w0(null, Kc, false), drawableArr4[0]);
            w1(w0(null, Xa, false), drawableArr4[1]);
            Drawable[] drawableArr5 = N4;
            w1(w0(null, i20, false), drawableArr5[0]);
            w1(w0(null, i22, false), drawableArr5[1]);
            x1(Td, f18014i3);
            x1(i12, j3);
            int i34 = -1;
            if (w0(null, f18330zb, false) == -1) {
                i34 = w0(null, Aa, false);
            }
            w1(i34, K4[1]);
            w1(i34, L4[1]);
            w1(w0(null, f17932da, false), R4);
            if (!z11 && !f17884b) {
                Drawable drawable17 = f17940e0;
                if (drawable17 != null) {
                    i(drawable17);
                }
                h(f17940e0);
            }
        }
    }

    public static boolean j0(i6 i6Var, h6 h6Var, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (h6Var == null || i6Var == null || i6Var.f17837b0 == null) {
            return false;
        }
        if (h6Var.f17792a == i6Var.Y) {
            z11 = true;
        } else {
            z11 = false;
        }
        File d10 = h6Var.d();
        if (d10 != null) {
            d10.delete();
        }
        i6Var.f17835a0.remove(h6Var.f17792a);
        i6Var.f17837b0.remove(h6Var);
        TLRPC.TL_theme tL_theme = h6Var.f17806r;
        if (tL_theme != null) {
            i6Var.f17839c0.remove(tL_theme.f17332id);
        }
        c6 c6Var = h6Var.f17812y;
        if (c6Var != null) {
            c6.a(c6Var);
        }
        if (z11) {
            i6Var.u(((h6) i6Var.f17837b0.get(0)).f17792a);
        }
        if (z10) {
            t1(i6Var, true, false, false, false, false);
            if (h6Var.f17806r != null) {
                MessagesController messagesController = MessagesController.getInstance(h6Var.f17808t);
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
        Paint paint = f18049k0;
        if (paint == null) {
            return;
        }
        paint.setColor(w0(null, f17929d7, false));
        m0.setColor(w0(null, K6, false));
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = f18174r0;
            int length = drawableArr.length;
            int i11 = J7;
            if (i10 < length) {
                x1(i11, drawableArr[i10]);
                i10++;
            } else {
                hj0 hj0Var = f18231u1;
                hj0Var.f23646a0 = true;
                int i12 = M7;
                hj0Var.Q(w0(null, i12, true), "Arrow1");
                f18231u1.Q(w0(null, i12, true), "Arrow2");
                f18231u1.Q(w0(null, i11, true), "Box2");
                f18231u1.Q(w0(null, i11, true), "Box1");
                f18231u1.o();
                C1 = false;
                f18231u1.J(true);
                hj0 hj0Var2 = f18284x1;
                hj0Var2.f23646a0 = true;
                int i13 = f17948e9;
                hj0Var2.Q(w0(null, i13, true), "Arrow");
                f18284x1.Q(w0(null, i13, true), "Line");
                f18284x1.o();
                hj0 hj0Var3 = f18302y1;
                hj0Var3.f23646a0 = true;
                hj0Var3.Q(w0(null, i13, true), "Arrow");
                f18302y1.Q(w0(null, i13, true), "Line");
                f18302y1.o();
                hj0 hj0Var4 = f18320z1;
                hj0Var4.f23646a0 = true;
                int i14 = f17913c9;
                hj0Var4.Q(w0(null, i14, true), "Line 1");
                f18320z1.Q(w0(null, i14, true), "Line 2");
                f18320z1.Q(w0(null, i14, true), "Line 3");
                f18320z1.Q(w0(null, i13, true), "Cup Red");
                f18320z1.Q(w0(null, i13, true), "Box");
                f18320z1.o();
                B1 = false;
                hj0 hj0Var5 = f18249v1;
                hj0Var5.f23646a0 = true;
                hj0Var5.Q(w0(null, i14, true), "Arrow");
                f18249v1.Q(w0(null, i13, true), "Box2");
                f18249v1.Q(w0(null, i13, true), "Box1");
                f18249v1.o();
                A1 = false;
                hj0 hj0Var6 = f18266w1;
                hj0Var6.f23646a0 = true;
                hj0Var6.Q(w0(null, i13, true), "Arrow1");
                f18266w1.Q(w0(null, f17931d9, true), "Arrow2");
                f18266w1.Q(w0(null, i13, true), "Box2");
                f18266w1.Q(w0(null, i13, true), "Box1");
                f18266w1.o();
                int w02 = w0(null, G6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                f18251v3 = new PorterDuffColorFilter(w02, mode);
                f18268w3 = new PorterDuffColorFilter(w0(null, f17969fc, false), mode);
                qg.d1.d().b();
                return;
            }
        }
    }

    public static i6 k0(File file, String str, TLRPC.TL_theme tL_theme) {
        String[] split;
        try {
            i6 i6Var = new i6();
            i6Var.f17834a = str;
            i6Var.F = tL_theme;
            i6Var.f17836b = file.getAbsolutePath();
            i6Var.E = UserConfig.selectedAccount;
            String[] strArr = new String[1];
            G(Q0(new File(i6Var.f17836b), null, strArr), i6Var);
            if (!TextUtils.isEmpty(strArr[0])) {
                String str2 = strArr[0];
                File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                i6Var.f17838c = new File(filesDirFixed, Utilities.MD5(str2) + ".wp").getAbsolutePath();
                Uri parse = Uri.parse(str2);
                i6Var.e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        if ("blur".equals(split[i10])) {
                            i6Var.h = true;
                        } else if ("motion".equals(split[i10])) {
                            i6Var.f17848n = true;
                        }
                    }
                }
                String queryParameter2 = parse.getQueryParameter("intensity");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String queryParameter3 = parse.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            i6Var.f17849r = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                            if (queryParameter3.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(6))) {
                                i6Var.f17850s = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter3.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(13))) {
                                i6Var.v = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter3.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(20))) {
                                i6Var.f17851w = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String queryParameter4 = parse.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            i6Var.f17852x = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        i6Var.f17853y = Utilities.parseInt((CharSequence) queryParameter2).intValue();
                    }
                    if (i6Var.f17853y == 0) {
                        i6Var.f17853y = 50;
                    }
                }
                return i6Var;
            }
            f17993h0 = null;
            return i6Var;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static Drawable k1(c6 c6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable drawable;
        u6 I10 = I(I, c6Var, rl, file, f17993h0, f17976g0, i10, S, z11, O, P, z10, document, false);
        Boolean bool = (Boolean) I10.f3721c;
        if (bool != null) {
            z12 = bool.booleanValue();
        } else {
            z12 = f18011i0;
        }
        f18011i0 = z12;
        Boolean bool2 = (Boolean) I10.d;
        if (bool2 != null) {
            z13 = bool2.booleanValue();
        } else {
            z13 = f18030j0;
        }
        f18030j0 = z13;
        Boolean bool3 = (Boolean) I10.e;
        if (bool3 != null) {
            z14 = bool3.booleanValue();
        } else {
            z14 = W;
        }
        W = z14;
        Drawable drawable2 = (Drawable) I10.f3719a;
        if (drawable2 != null) {
            drawable = drawable2;
        } else {
            drawable = f17940e0;
        }
        f17940e0 = drawable;
        int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(drawable2);
        int i11 = calcDrawableColor[0];
        f17904c0 = i11;
        X = i11;
        int i12 = calcDrawableColor[1];
        f17922d0 = i12;
        f17885b0 = i12;
        Drawable drawable3 = f17940e0;
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
                        f18010i = SystemClock.elapsedRealtime();
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
            if (i6Var4 != null && i6Var4.q() && f18119o != 0 && (i6Var = L) != null) {
                i6Var4 = i6Var;
            }
            i6 i6Var5 = I;
            if (i6Var5 != i6Var4) {
                if (i6Var5 == null || (i6Var4 != null && i6Var5.q() != i6Var4.q())) {
                    R = false;
                    f18010i = SystemClock.elapsedRealtime();
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
        return i0.a.k(i10, w7.q.b((int) (Color.alpha(i10) * f10), 0, 255));
    }

    public static void m(Paint paint) {
        paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), f17865a);
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
            int i11 = f18146p9;
            int i12 = f17985g9;
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
                int w03 = w0(null, f18094m9, false);
                textPaint2.linkColor = w03;
                textPaint2.setColor(w03);
                f18230u0.setColor(w0(null, f18221t9, false));
                f18248v0.setColor(w0(null, f18202s9, false));
                I0.setColor(w0(null, f18164q9, false));
                J0.setColor(w0(null, f18183r9, false));
                TextPaint textPaint3 = K0;
                int i15 = il;
                textPaint3.setColor(w0(null, i15, false));
                TextPaint textPaint4 = L0;
                int i16 = W8;
                textPaint4.setColor(w0(null, i16, false));
                M0.setColor(w0(null, i16, false));
                TextPaint textPaint5 = N0;
                int i17 = f17966f9;
                textPaint5.setColor(w0(null, i17, false));
                O0.setColor(w0(null, i17, false));
                Paint paint = f18265w0;
                int i18 = U8;
                paint.setColor(w0(null, i18, false));
                Paint paint2 = f18301y0;
                int i19 = V8;
                paint2.setColor(w0(null, i19, false));
                f18319z0.setColor(w0(null, i11, false));
                f18283x0.setColor(w0(null, f18292x9, false));
                P0.setColor(w0(null, f18143p6, false));
                Q0.setColor(w0(null, A6, false));
                x1(f17874a9, f17867a1);
                Drawable drawable = f17886b1;
                int i20 = f17894b9;
                x1(i20, drawable);
                x1(f18239u9, T0);
                x1(G6, S0);
                Drawable drawable2 = V0;
                int i21 = v9;
                x1(i21, drawable2);
                x1(i21, W0);
                x1(f18274w9, X0);
                x1(f18309y9, Y0);
                x1(i20, f18031j1);
                x1(i20, f18050k1);
                x1(i15, l1);
                x1(i20, Z0);
                Drawable drawable3 = f17905c1;
                int i22 = B9;
                x1(i22, drawable3);
                x1(i22, f17923d1);
                x1(i22, f17941e1);
                x1(i18, f18086m1);
                x1(Z5, f18105n1);
                x1(zj, f18121o1);
                x1(i19, f18139p1);
                x1(i19, f18157q1);
                x1(i19, f18175r1);
                x1(i12, f18213t1);
                x1(f18328z9, f17959f1);
                x1(A9, f18012i1);
                x1(A8, f18194s1);
                hm0 hm0Var = f17977g1;
                int i23 = f18038j9;
                x1(i23, hm0Var);
                x1(i23, f17994h1);
                return;
            }
        }
    }

    public static ColorFilter n0(f6 f6Var) {
        if (f6Var != null) {
            return f6Var.w();
        }
        return f18251v3;
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
            o1(!(LaunchActivity.R() instanceof eo));
        }
        k();
        n();
        p();
        j(false, z10);
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.c4(3, !O));
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

    public static k8 o0(MessageObject messageObject) {
        HashMap hashMap = f17945e5;
        if (hashMap != null && messageObject != null) {
            return (k8) hashMap.get(messageObject);
        }
        return null;
    }

    public static void o1(boolean z10) {
        q9 q9Var = V;
        if (q9Var != null) {
            q9Var.dispose();
            V = null;
        }
        Drawable drawable = f17940e0;
        if (drawable instanceof lc0) {
            S = ((lc0) drawable).f24947i;
        } else {
            S = 0;
        }
        f17940e0 = null;
        f17958f0 = null;
        j1(z10);
    }

    public static void p() {
        if (Q1 == null) {
            return;
        }
        P1.setColor(w0(null, G6, false));
        P1.linkColor = w0(null, J6, false);
        x1(f18336zh, Q1);
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
        r(Y, Z, f17866a0, i10, i11, f10, f11);
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
        edit.putInt("selectedAutoNightType", f18119o);
        edit.putBoolean("autoNightScheduleByLocation", f18137p);
        edit.putFloat("autoNightBrighnessThreshold", f18155q);
        edit.putInt("autoNightDayStartTime", f18173r);
        edit.putInt("autoNightDayEndTime", f18192s);
        edit.putInt("autoNightSunriseTime", v);
        edit.putString("autoNightCityName", f18264w);
        edit.putInt("autoNightSunsetTime", f18211t);
        edit.putLong("autoNightLocationLatitude3", Double.doubleToRawLongBits(f18282x));
        edit.putLong("autoNightLocationLongitude3", Double.doubleToRawLongBits(f18300y));
        edit.putInt("autoNightLastSunCheckDay", f18229u);
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
            if (view2 instanceof pd1) {
                Bitmap bitmap = Y;
                if (bitmap != null) {
                    float width = bitmap.getWidth();
                    i10 = (int) ((((view2.getMeasuredWidth() - (Math.max(view2.getMeasuredWidth() / width, view2.getMeasuredHeight() / Y.getHeight()) * width)) / 2.0f) - ((pd1) view2).I) + i10);
                } else {
                    i10 = (int) (i10 + (-((pd1) view2).I));
                }
                i11 = (int) (i11 + (-((pd1) view2).J));
            }
            if (f6Var != null) {
                f6Var.l(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
                return;
            }
            q(i10, i11 - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
        }
    }

    public static Drawable s0() {
        Drawable drawable = f17958f0;
        if (drawable != null) {
            return drawable;
        }
        return f17940e0;
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
                    jSONObject.put("name", i6Var.f17834a);
                    jSONObject.put("path", i6Var.f17836b);
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
                if (i6Var2 == null || (arrayList = i6Var2.f17837b0) == null || arrayList.isEmpty()) {
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

    public static ww0 t0(int i10) {
        if (i10 < 0 || i10 > 5) {
            return null;
        }
        ww0[] ww0VarArr = f18233u3;
        ww0 ww0Var = ww0VarArr[i10];
        if (ww0Var != null) {
            return ww0Var;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                ww0VarArr[5] = new xp();
                            }
                        } else {
                            ww0VarArr[4] = new fm0(true);
                        }
                    } else {
                        ww0VarArr[3] = new qg0(null, true);
                    }
                } else {
                    ww0VarArr[2] = new ip0(true);
                }
            } else {
                ww0VarArr[1] = new xp(true);
            }
        } else {
            ww0VarArr[0] = new t51(true);
        }
        ww0 ww0Var2 = ww0VarArr[i10];
        ww0Var2.d();
        ww0Var2.b(w0(null, f18146p9, false));
        return ww0Var2;
    }

    public static void t1(i6 i6Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        if (z10) {
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            if (!z12) {
                int size = i6Var.f17837b0.size();
                int max = Math.max(0, size - i6Var.W);
                SerializedData serializedData = new SerializedData(((max * 16) + 2) * 4);
                serializedData.writeInt32(9);
                serializedData.writeInt32(max);
                for (int i10 = 0; i10 < size; i10++) {
                    h6 h6Var = (h6) i6Var.f17837b0.get(i10);
                    int i11 = h6Var.f17792a;
                    if (i11 >= 100) {
                        serializedData.writeInt32(i11);
                        serializedData.writeInt32(h6Var.f17794c);
                        serializedData.writeInt32(h6Var.d);
                        serializedData.writeInt32(h6Var.e);
                        serializedData.writeInt32(h6Var.f17795f);
                        serializedData.writeInt32(h6Var.f17796g);
                        serializedData.writeInt32(h6Var.h);
                        serializedData.writeBool(h6Var.f17797i);
                        serializedData.writeInt64(h6Var.f17798j);
                        serializedData.writeInt64(h6Var.f17799k);
                        serializedData.writeInt64(h6Var.f17800l);
                        serializedData.writeInt64(h6Var.f17801m);
                        serializedData.writeInt32(h6Var.f17802n);
                        serializedData.writeInt64(0L);
                        serializedData.writeDouble(h6Var.f17804p);
                        serializedData.writeBool(h6Var.f17805q);
                        serializedData.writeString(h6Var.f17803o);
                        if (h6Var.f17806r != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        serializedData.writeBool(z15);
                        if (h6Var.f17806r != null) {
                            serializedData.writeInt32(h6Var.f17808t);
                            h6Var.f17806r.serializeToStream(serializedData);
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
                    h6 h6Var2 = (h6) i6Var.f17835a0.get(i6Var.Y);
                    i6Var.f17835a0.remove(h6Var2.f17792a);
                    i6Var.f17837b0.remove(h6Var2);
                    TLRPC.TL_theme tL_theme = h6Var2.f17806r;
                    if (tL_theme != null) {
                        i6Var.f17839c0.remove(tL_theme.f17332id);
                    }
                }
                i6Var.Y = i6Var.Z;
                h6 k10 = i6Var.k(false);
                if (k10 != null) {
                    i6Var.f17846i0 = k10.f17812y;
                } else {
                    i6Var.f17846i0 = null;
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
                i6Var.f17834a = str;
                i6Var.F = tL_theme;
                i6Var.f17836b = file.getAbsolutePath();
                i6Var.E = UserConfig.selectedAccount;
                M = A0();
                O = true;
                P = false;
                t(i6Var, false, false);
                return i6Var;
            }
            if (tL_theme != null) {
                str2 = "remote" + tL_theme.f17332id;
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
                i6Var2.f17834a = str;
                i6Var2.E = UserConfig.selectedAccount;
                ArrayList arrayList = F;
                arrayList.add(i6Var2);
                G.add(i6Var2);
                Collections.sort(arrayList, new a4.e(18));
            } else {
                hashMap.remove(str2);
            }
            i6Var2.F = tL_theme;
            i6Var2.f17836b = file2.getAbsolutePath();
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
        int i12 = f18201s8;
        int i13 = f17872a7;
        int i14 = Qd;
        int i15 = Pd;
        int i16 = Od;
        int i17 = Nd;
        if (i10 == i17 || i10 == i16 || i10 == i15 || i10 == i14 || i10 == f17928d6 || i10 == i13 || i10 == i12 || i10 == M8) {
            i11 |= -16777216;
        }
        if (z10) {
            rl.delete(i10);
        } else {
            rl.put(i10, i11);
        }
        if (i10 == Hc) {
            h(f17940e0);
        } else if (i10 != f18079lc && i10 != f18097mc) {
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
            Drawable drawable = f17940e0;
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
            return f6Var.F0(i10);
        }
        return w0(null, i10, false);
    }

    public static void v1(Drawable drawable, int i10, boolean z10) {
        Drawable drawable2;
        if (!(drawable instanceof vq)) {
            return;
        }
        if (z10) {
            drawable2 = ((vq) drawable).f28574b;
        } else {
            drawable2 = ((vq) drawable).f28573a;
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
        if (drawable instanceof ww0) {
            ((ww0) drawable).b(i10);
        } else if (drawable instanceof sc0) {
            ((sc0) drawable).a(i10);
        } else if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i10);
        } else if (drawable instanceof hm0) {
            ((hm0) drawable).b(i10);
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

    public static k8 x0() {
        if (f17927d5 == null) {
            f17927d5 = new k8();
        }
        return f17927d5;
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
                    float[] fArr = g6Var.f17750b;
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
                    g6Var.f17751c = true;
                    g6Var.invalidateSelf();
                    return;
                }
            }
        }
    }
}
