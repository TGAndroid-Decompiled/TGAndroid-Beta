package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Wallet.WalletEngine2;
public class an extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, sw, ma0, org.telegram.ui.Components.tj, org.telegram.ui.Components.qg, pg.b, org.telegram.ui.Components.e40, te.b {
    public static int f45108ld = 22;
    public static float f45109md = 1.4f;
    public static int f45110nd = 10;
    public static Pattern f45111od;
    public static Pattern f45112pd;
    public static Pattern f45113qd;
    public static final int[] f45114rd = {org.telegram.messenger.ns.f25606y, org.telegram.messenger.ns.f25613z, org.telegram.messenger.ns.A, org.telegram.messenger.ns.B, org.telegram.messenger.ns.Z, org.telegram.messenger.ns.C0, org.telegram.messenger.ns.f25573t0, org.telegram.messenger.ns.W0, org.telegram.messenger.ns.f25487e1, org.telegram.messenger.ns.T1, org.telegram.messenger.ns.G, org.telegram.messenger.ns.f25572t, org.telegram.messenger.ns.U, org.telegram.messenger.ns.E0, org.telegram.messenger.ns.F0, org.telegram.messenger.ns.f25618z4, org.telegram.messenger.ns.f25501g3, org.telegram.messenger.ns.f25551p4, org.telegram.messenger.ns.L};
    public static boolean f45115sd = false;
    public static final Rect f45116td = new Rect();
    public aj A0;
    public int A1;
    public hi.l3 A2;
    public boolean A3;
    public int A4;
    public org.telegram.messenger.bj A5;
    public int A6;
    public int A7;
    public String A8;
    public VelocityTracker A9;
    public ym Aa;
    public hk Ab;
    public boolean Ac;
    public cj B0;
    public int B1;
    public hi.l3 B2;
    public boolean B3;
    public int B4;
    public org.telegram.messenger.gj B5;
    public int B6;
    public boolean B7;
    public String B8;
    public boolean B9;
    public zh.d Ba;
    public boolean Bb;
    public boolean Bc;
    public dj C0;
    public org.telegram.ui.Components.xb C1;
    public hi.l3 C2;
    public boolean C3;
    public gh C4;
    public qm C5;
    public int C6;
    public boolean C7;
    public org.telegram.messenger.gj C8;
    public boolean C9;
    public final org.telegram.messenger.i3 Ca;
    public boolean Cb;
    public boolean Cc;
    public jl D0;
    public ak D1;
    public hi.l3 D2;
    public TLRPC.User D3;
    public final SparseArray D4;
    public boolean D5;
    public boolean D6;
    public boolean D7;
    public org.telegram.messenger.gj D8;
    public tk D9;
    public TLRPC.TL_channels_sendAsPeers Da;
    public boolean Db;
    public y8 Dc;
    public oi E;
    public vj E0;
    public nj E1;
    public org.telegram.ui.Cells.q1 E2;
    public TLRPC.Chat E3;
    public final ArrayList E4;
    public org.telegram.messenger.gj E5;
    public final ArrayList E6;
    public int E7;
    public int E8;
    public boolean E9;
    public TL_account.resolvedBusinessChatLinks Ea;
    public ArrayList Eb;
    public int Ec;
    public final xe.b F;
    public boolean F0;
    public hi.i1 F1;
    public int F2;
    public ch.p0 F3;
    public int F4;
    public int F5;
    public final SparseArray[] F6;
    public int F7;
    public boolean F8;
    public float F9;
    public boolean Fa;
    public ValueAnimator Fb;
    public TLRPC.DraftMessage Fc;
    public final xe.b G;
    public org.telegram.ui.Components.z70 G0;
    public int G1;
    public int G2;
    public boolean G3;
    public boolean G4;
    public org.telegram.messenger.gj G5;
    public final SparseArray G6;
    public boolean G7;
    public boolean G8;
    public kj G9;
    public boolean Ga;
    public boolean Gb;
    public boolean Gc;
    public final dh.g H;
    public TextView H0;
    public boolean H1;
    public hi.l3 H2;
    public boolean H3;
    public boolean H4;
    public boolean H5;
    public final SparseArray H6;
    public ye H7;
    public String H8;
    public org.telegram.ui.Cells.q1 H9;
    public float Ha;
    public Boolean Hb;
    public ValueAnimator Hc;
    public final int I;
    public org.telegram.ui.ActionBar.l2 I0;
    public org.telegram.ui.Components.w20 I1;
    public hi.l3 I2;
    public String I3;
    public int I4;
    public boolean I5;
    public final HashMap I6;
    public String I7;
    public tj I8;
    public org.telegram.ui.Components.nz I9;
    public final tf Ia;
    public boolean Ib;
    public di Ic;
    public final ui.f J;
    public RadialProgressView J0;
    public org.telegram.ui.ActionBar.t1 J1;
    public hi.l3 J2;
    public String J3;
    public final ArrayList J4;
    public boolean J5;
    public final SparseArray J6;
    public boolean J7;
    public org.telegram.ui.Cells.q1 J8;
    public boolean J9;
    public final ek Ja;
    public final int[] Jb;
    public boolean Jc;
    public final ui.f K;
    public final int K0;
    public hi.l3 K1;
    public org.telegram.ui.Components.ip K2;
    public int K3;
    public final HashMap K4;
    public boolean K5;
    public final a0.h K6;
    public boolean K7;
    public j4 K8;
    public boolean K9;
    public int Ka;
    public org.telegram.ui.Cells.q1 Kb;
    public int Kc;
    public dh.c L;
    public int L0;
    public hi.l3 L1;
    public View L2;
    public int L3;
    public org.telegram.messenger.gj L4;
    public int L5;
    public final ArrayList L6;
    public int L7;
    public TextureView L8;
    public ValueAnimator L9;
    public int La;
    public org.telegram.ui.Cells.q1 Lb;
    public int Lc;
    public dh.c M;
    public int M0;
    public hi.l3 M1;
    public nk M2;
    public int M3;
    public int M4;
    public int M5;
    public final SparseArray M6;
    public int M7;
    public boolean M8;
    public ValueAnimator M9;
    public ye Ma;
    public int Mb;
    public int Mc;
    public final ui.g N;
    public int N0;
    public hi.l3 N1;
    public hi.n5 N2;
    public UndoView N3;
    public int N4;
    public TLRPC.PhotoSize N5;
    public final a0.h N6;
    public int N7;
    public final ye N8;
    public boolean N9;
    public boolean Na;
    public boolean Nb;
    public int Nc;
    public dh.c O;
    public int O0;
    public hi.l3 O1;
    public org.telegram.ui.Components.ge0 O2;
    public mk O3;
    public final ArrayList O4;
    public TLRPC.PhotoSize O5;
    public final a0.h O6;
    public int O7;
    public final ui.b O8;
    public float O9;
    public boolean Oa;
    public int Ob;
    public int Oc;
    public org.telegram.ui.ActionBar.t1 P;
    public Drawable P0;
    public hi.l3 P1;
    public boolean P2;
    public org.telegram.ui.Components.xb P3;
    public ye P4;
    public TLObject P5;
    public final int[] P6;
    public int P7;
    public dh.c P8;
    public float P9;
    public long Pa;
    public HashMap Pb;
    public boolean Pc;
    public boolean Q;
    public Drawable Q0;
    public zk Q1;
    public final org.telegram.ui.Components.i9[] Q2;
    public boolean Q3;
    public boolean Q4;
    public int Q5;
    public final int[] Q6;
    public int Q7;
    public Bitmap Q8;
    public int Q9;
    public int Qa;
    public ye Qb;
    public long Qc;
    public FrameLayout R;
    public Drawable R0;
    public float R1;
    public final zm[] R2;
    public int R3;
    public boolean R4;
    public int R5;
    public final int[] R6;
    public boolean R7;
    public BitmapShader R8;
    public int R9;
    public int Ra;
    public int Rb;
    public TLRPC.TL_messages_discussionMessage Rc;
    public hi.n5 S;
    public boolean S0;
    public TL_stories.TL_premium_boostsStatus S1;
    public final org.telegram.ui.ActionBar.j5[] S2;
    public boolean S3;
    public boolean S4;
    public boolean S5;
    public final int[] S6;
    public int S7;
    public Paint S8;
    public float S9;
    public yj Sa;
    public org.telegram.ui.ActionBar.t1 Sb;
    public TLRPC.messages_Messages Sc;
    public tj T;
    public int T0;
    public org.telegram.messenger.e3 T1;
    public final pm[] T2;
    public org.telegram.messenger.n6 T3;
    public int T4;
    public TLRPC.PhotoSize T5;
    public final boolean[] T6;
    public int T7;
    public Matrix T8;
    public float T9;
    public zj Ta;
    public int Tb;
    public boolean Tc;
    public jh.f U;
    public final Set U0;
    public boolean U1;
    public NumberTextView U2;
    public boolean U3;
    public ArrayList U4;
    public TLRPC.PhotoSize U5;
    public final boolean[] U6;
    public int U7;
    public Paint U8;
    public float U9;
    public boolean Ua;
    public int Ub;
    public sm Uc;
    public View V;
    public final Set V0;
    public yd V1;
    public int V2;
    public org.telegram.messenger.gj V3;
    public int V4;
    public TLObject V5;
    public final boolean[] V6;
    public boolean V7;
    public final Paint V8;
    public float V9;
    public float Va;
    public boolean Vb;
    public lm Vc;
    public FrameLayout W;
    public AnimatorSet W0;
    public ImageView W1;
    public final AnimatorSet[] W2;
    public int W3;
    public HashMap W4;
    public int W5;
    public boolean W6;
    public boolean W7;
    public float W8;
    public float W9;
    public int Wa;
    public int Wb;
    public di.h6 Wc;
    public FrameLayout X;
    public boolean X0;
    public jj X1;
    public boolean X2;
    public org.telegram.messenger.gj X3;
    public final SparseArray X4;
    public TLRPC.WebPage X5;
    public boolean X6;
    public boolean X7;
    public boolean X8;
    public TLRPC.Document X9;
    public int Xa;
    public boolean Xb;
    public boolean Xc;
    public final jh.l Y;
    public hi.l3 Y0;
    public fi.p2 Y1;
    public ImageView Y2;
    public org.telegram.messenger.gj Y3;
    public int Y4;
    public ArrayList Y5;
    public boolean Y6;
    public int Y7;
    public View Y8;
    public boolean Y9;
    public h6.m Ya;
    public int Yb;
    public boolean Yc;
    public lh.f Z;
    public hi.l3 Z0;
    public ai.k0 Z1;
    public RadialProgressView Z2;
    public bi.g2 Z3;
    public final int[] Z4;
    public String Z5;
    public boolean Z6;
    public boolean Z7;
    public float Z8;
    public boolean Z9;
    public ValueAnimator Za;
    public int Zb;
    public float Zc;
    public int f45117a;
    public qj f45118a0;
    public hi.l3 f45119a1;
    public TextView f45120a2;
    public ImageView f45121a3;
    public di.c1 f45122a4;
    public int f45123a5;
    public m9.u f45124a6;
    public int f45125a7;
    public org.telegram.messenger.gj f45126a8;
    public float f45127a9;
    public long f45128aa;
    public float f45129ab;
    public int f45130ac;
    public float f45131ad;
    public boolean f45132b;
    public rj f45133b0;
    public org.telegram.ui.Components.rg f45134b1;
    public boolean f45135b2;
    public AnimatorSet f45136b3;
    public jg.l1 f45137b4;
    public boolean f45138b5;
    public TLRPC.ChatInvite f45139b6;
    public int f45140b7;
    public org.telegram.messenger.gj f45141b8;
    public Integer f45142b9;
    public int f45143ba;
    public lk f45144bb;
    public CharacterStyle f45145bc;
    public final te.a bd;
    public boolean f45146c;
    public bi.g2 f45147c0;
    public boolean f45148c1;
    public TextView f45149c2;
    public FrameLayout f45150c3;
    public jh.e f45151c4;
    public int f45152c5;
    public yd f45153c6;
    public long f45154c7;
    public int f45155c8;
    public int f45156c9;
    public int f45157ca;
    public final uk f45158cb;
    public String f45159cc;
    public final te.a f45160cd;
    public boolean d;
    public int f45161d0;
    public uj f45162d1;
    public TextView d2;
    public xj f45163d3;
    public int f45164d4;
    public int f45165d5;
    public final LongSparseIntArray f45166d6;
    public boolean f45167d7;
    public boolean f45168d8;
    public boolean f45169d9;
    public int f45170da;
    public final bl f45171db;
    public vf.b dc;
    public final te.a f45172dd;
    public TLRPC.Chat f45173e;
    public org.telegram.ui.ActionBar.o0 f45174e0;
    public lh.c f45175e1;
    public bk f45176e2;
    public TextView f45177e3;
    public TL_account.TL_businessChatLink f45178e4;
    public boolean f45179e5;
    public boolean f45180e6;
    public long f45181e7;
    public boolean f45182e8;
    public AnimatorSet f45183e9;
    public int f45184ea;
    public ArrayList eb;
    public boolean f45185ec;
    public final te.a f45186ed;
    public TLRPC.User f45187f;
    public er f45188f0;
    public FrameLayout f45189f1;
    public TextView f45190f2;
    public TextView f45191f3;
    public String f45192f4;
    public boolean f45193f5;
    public boolean f45194f6;
    public final ArrayList f45195f7;
    public long f45196f8;
    public org.telegram.ui.ActionBar.g1 f45197f9;
    public boolean fa;
    public final rh f45198fb;
    public yd fc;
    public final te.a f45199fd;
    public org.telegram.ui.ActionBar.x f45200g0;
    public LinearLayout f45201g1;
    public org.telegram.ui.Components.p11 f45202g2;
    public tj f45203g3;
    public int f45204g4;
    public AnimatorSet f45205g5;
    public long f45206g6;
    public final Paint f45207g7;
    public String f45208g8;
    public boolean f45209g9;
    public boolean f45210ga;
    public final wh f45211gb;
    public boolean f45212gc;
    public final te.a f45213gd;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.o0 f45214h0;
    public org.telegram.ui.Components.xn f45215h1;
    public kg.e f45216h2;
    public ImageView f45217h3;
    public int f45218h4;
    public final SparseIntArray f45219h5;
    public boolean f45220h6;
    public final Paint h7;
    public Integer f45221h8;
    public int f45222h9;
    public boolean f45223ha;
    public final ni f45224hb;
    public boolean f45225hc;
    public final te.a f45226hd;
    public org.telegram.ui.ActionBar.o0 f45227i0;
    public bi f45228i1;
    public org.telegram.ui.Components.z70 f45229i2;
    public ImageView f45230i3;
    public boolean f45231i4;
    public final SparseIntArray f45232i5;
    public boolean f45233i6;
    public final ColorMatrix i7;
    public byte[] f45234i8;
    public int f45235i9;
    public org.telegram.ui.Components.ji f45236ia;
    public final mm f45237ib;
    public final RectF f45238ic;
    public final m6.n f45239id;
    public org.telegram.ui.ActionBar.q0 f45240j0;
    public kg.w1 f45241j1;
    public ImageView f45242j2;
    public org.telegram.ui.Components.h6 j3;
    public String f45243j4;
    public boolean f45244j5;
    public boolean f45245j6;
    public final m.b3 f45246j7;
    public int f45247j8;
    public org.telegram.ui.ActionBar.z0[] f45248j9;
    public float f45249ja;
    public final uf f45250jb;
    public org.telegram.ui.ActionBar.t1 f45251jc;
    public sh.b f45252jd;
    public org.telegram.ui.ActionBar.q0 f45253k0;
    public kg.z f45254k1;
    public ki.m f45255k2;
    public org.telegram.ui.Components.h6 f45256k3;
    public byte[] f45257k4;
    public boolean f45258k5;
    public long f45259k6;
    public final org.telegram.ui.ActionBar.r4 f45260k7;
    public int f45261k8;
    public org.telegram.ui.ActionBar.z0 f45262k9;
    public float f45263ka;
    public final uf kb;
    public long f45264kc;
    public final Rect f45265kd;
    public org.telegram.ui.ActionBar.q0 f45266l0;
    public jh.k l1;
    public TextView f45267l2;
    public org.telegram.ui.Components.h6 f45268l3;
    public String f45269l4;
    public boolean f45270l5;
    public Long f45271l6;
    public long f45272l7;
    public yd f45273l8;
    public final oj f45274l9;
    public wo f45275la;
    public boolean f45276lb;
    public final uf f45277lc;
    public org.telegram.ui.ActionBar.q0 m0;
    public ol f45278m1;
    public lj f45279m2;
    public ij f45280m3;
    public org.telegram.messenger.gj f45281m4;
    public boolean f45282m5;
    public int f45283m6;
    public int f45284m7;
    public String f45285m8;
    public kl f45286m9;
    public Animator ma;
    public boolean mb;
    public int f45287mc;
    public boolean f45288n;
    public org.telegram.ui.Components.v01 f45289n0;
    public org.telegram.ui.Components.tn n1;
    public FrameLayout f45290n2;
    public gj f45291n3;
    public org.telegram.messenger.gj f45292n4;
    public boolean f45293n5;
    public final SparseArray[] f45294n6;
    public int f45295n7;
    public org.telegram.messenger.r3 f45296n8;
    public wj f45297n9;
    public boolean f45298na;
    public long f45299nb;
    public boolean f45300nc;
    public org.telegram.ui.ActionBar.o0 f45301o0;
    public final ArrayList f45302o1;
    public lj f45303o2;
    public org.telegram.ui.Cells.t0 f45304o3;
    public boolean o4;
    public boolean f45305o5;
    public final SparseArray[] f45306o6;
    public final Matrix f45307o7;
    public boolean f45308o8;
    public int f45309o9;
    public boolean f45310oa;
    public xi.e f45311ob;
    public Pattern f45312oc;
    public org.telegram.ui.ActionBar.q0 f45313p0;
    public ui f45314p1;
    public FrameLayout f45315p2;
    public int f45316p3;
    public ArrayList f45317p4;
    public long f45318p5;
    public final SparseArray[] f45319p6;
    public LinearGradient f45320p7;
    public boolean f45321p8;
    public int f45322p9;
    public an f45323pa;
    public boolean f45324pb;
    public org.telegram.messenger.gj f45325pc;
    public org.telegram.ui.ActionBar.x f45326q0;
    public org.telegram.ui.Components.h6 f45327q1;
    public TextView f45328q2;
    public org.telegram.ui.Components.w40 f45329q3;
    public org.telegram.messenger.gj f45330q4;
    public boolean f45331q5;
    public boolean f45332q6;
    public int f45333q7;
    public TLRPC.ChatFull f45334q8;
    public int f45335q9;
    public float f45336qa;
    public int f45337qb;
    public qe f45338qc;
    public long f45339r;
    public boolean f45340r0;
    public tg f45341r1;
    public org.telegram.ui.Components.pz f45342r2;
    public View f45343r3;
    public TLRPC.TL_forumTopic f45344r4;
    public boolean f45345r5;
    public int f45346r6;
    public int f45347r7;
    public TLRPC.UserFull f45348r8;
    public boolean f45349r9;
    public AnimatorSet f45350ra;
    public int f45351rb;
    public ArrayList f45352rc;
    public final HashMap f45353s;
    public RadialProgressView f45354s0;
    public org.telegram.ui.Components.rw0 f45355s1;
    public org.telegram.ui.Components.cv0 f45356s2;
    public boolean f45357s3;
    public long f45358s4;
    public boolean s5;
    public int f45359s6;
    public final Paint f45360s7;
    public org.telegram.ui.Cells.d6 f45361s8;
    public boolean s9;
    public final xj f45362sa;
    public boolean f45363sb;
    public final k8.a f45364sc;
    public org.telegram.ui.ActionBar.o0 f45365t0;
    public org.telegram.ui.ActionBar.o0 f45366t1;
    public hi.l3 f45367t2;
    public boolean f45368t3;
    public int f45369t4;
    public org.telegram.messenger.gj f45370t5;
    public int t6;
    public final Matrix f45371t7;
    public ww0 f45372t8;
    public pl f45373t9;
    public wh.i f45374ta;
    public boolean f45375tb;
    public final jh.a f45376tc;
    public org.telegram.ui.ActionBar.o0 f45377u0;
    public org.telegram.ui.ActionBar.o0 f45378u1;
    public hi.l3 f45379u2;
    public boolean f45380u3;
    public TLRPC.Chat f45381u4;
    public org.telegram.messenger.gj f45382u5;
    public int f45383u6;
    public LinearGradient f45384u7;
    public final a0.h f45385u8;
    public View f45386u9;
    public ch.r f45387ua;
    public a0.h f45388ub;
    public boolean f45389uc;
    public org.telegram.ui.ActionBar.o0 f45390v0;
    public org.telegram.ui.ActionBar.o0 f45391v1;
    public hi.l3 f45392v2;
    public AnimatorSet f45393v3;
    public boolean f45394v4;
    public org.telegram.messenger.bj f45395v5;
    public int f45396v6;
    public boolean f45397v7;
    public String f45398v8;
    public boolean f45399v9;
    public pz0 f45400va;
    public a0.h f45401vb;
    public boolean f45402vc;
    public final vi f45403w;
    public org.telegram.ui.ActionBar.o0 f45404w0;
    public org.telegram.ui.ActionBar.o0 f45405w1;
    public boolean f45406w2;
    public ValueAnimator f45407w3;
    public boolean f45408w4;
    public org.telegram.messenger.kj f45409w5;
    public int f45410w6;
    public boolean f45411w7;
    public long f45412w8;
    public boolean f45413w9;
    public boolean f45414wa;
    public boolean f45415wb;
    public boolean wc;
    public oi f45416x;
    public ClippingImageView f45417x0;
    public org.telegram.ui.Components.io f45418x1;
    public hi.l3 f45419x2;
    public float f45420x3;
    public boolean f45421x4;
    public org.telegram.messenger.lj f45422x5;
    public int f45423x6;
    public int f45424x7;
    public String f45425x8;
    public boolean f45426x9;
    public org.telegram.ui.Components.ep f45427xa;
    public boolean f45428xb;
    public long xc;
    public oi f45429y;
    public org.telegram.ui.Components.fz0 f45430y0;
    public lh.h f45431y1;
    public boolean f45432y2;
    public boolean f45433y3;
    public boolean f45434y4;
    public org.telegram.messenger.gj f45435y5;
    public final ArrayList f45436y6;
    public boolean f45437y7;
    public boolean f45438y8;
    public float f45439y9;
    public ym ya;
    public Paint f45440yb;
    public boolean f45441yc;
    public jh.g f45442z0;
    public boolean f45443z1;
    public hi.l3 f45444z2;
    public boolean f45445z3;
    public int f45446z4;
    public org.telegram.messenger.bj f45447z5;
    public boolean f45448z6;
    public boolean f45449z7;
    public boolean f45450z8;
    public float f45451z9;
    public an f45452za;
    public long f45453zb;
    public boolean f45454zc;

    public an(Bundle bundle) {
        super(bundle);
        this.f45117a = 0;
        this.f45146c = false;
        this.d = false;
        this.f45353s = new HashMap();
        this.f45403w = new vi(this, new ye(this, 25));
        xe.b bVar = new xe.b();
        this.F = bVar;
        xe.b bVar2 = new xe.b();
        this.G = bVar2;
        this.Y = new jh.l();
        this.K0 = org.telegram.ui.ActionBar.j6.Ji;
        this.T0 = -1;
        this.U0 = Collections.newSetFromMap(new WeakHashMap());
        this.V0 = Collections.newSetFromMap(new WeakHashMap());
        this.f45302o1 = new ArrayList();
        this.Q2 = new org.telegram.ui.Components.i9[2];
        this.R2 = new zm[2];
        this.S2 = new org.telegram.ui.ActionBar.j5[2];
        this.T2 = new pm[2];
        this.W2 = new AnimatorSet[2];
        this.X2 = false;
        this.f45316p3 = 500;
        this.f45178e4 = null;
        this.f45218h4 = -1;
        this.o4 = true;
        this.D4 = new SparseArray();
        this.E4 = new ArrayList();
        this.J4 = new ArrayList();
        this.K4 = new HashMap();
        this.M4 = -1;
        this.N4 = 0;
        this.O4 = new ArrayList(10);
        this.U4 = new ArrayList();
        this.W4 = new HashMap();
        this.X4 = new SparseArray();
        this.Z4 = new int[1];
        this.f45219h5 = new SparseIntArray();
        this.f45232i5 = new SparseIntArray();
        this.f45331q5 = true;
        this.s5 = true;
        this.H5 = true;
        this.K5 = true;
        this.f45166d6 = new LongSparseIntArray();
        this.f45283m6 = 1;
        this.f45294n6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f45306o6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f45319p6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f45436y6 = new ArrayList();
        this.f45448z6 = true;
        this.B6 = Integer.MIN_VALUE;
        this.E6 = new ArrayList();
        this.F6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.G6 = new SparseArray();
        this.H6 = new SparseArray();
        this.I6 = new HashMap();
        this.J6 = new SparseArray();
        this.K6 = new a0.h();
        this.L6 = new ArrayList();
        this.M6 = new SparseArray();
        this.N6 = new a0.h();
        this.O6 = new a0.h();
        this.P6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.Q6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.R6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.S6 = new int[2];
        this.T6 = new boolean[2];
        this.U6 = new boolean[2];
        this.V6 = new boolean[]{true, true};
        this.X6 = true;
        this.Y6 = true;
        this.f45140b7 = 0;
        this.f45195f7 = new ArrayList();
        this.f45207g7 = new Paint(1);
        this.h7 = new Paint(1);
        this.i7 = new ColorMatrix();
        this.f45246j7 = new m.b3();
        this.f45260k7 = new org.telegram.ui.ActionBar.r4(0, false, false, new hj(this, 0));
        this.f45307o7 = new Matrix();
        Paint paint = new Paint(1);
        this.f45360s7 = paint;
        this.f45371t7 = new Matrix();
        this.E7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.O7 = Integer.MAX_VALUE;
        this.P7 = -1;
        this.X7 = true;
        this.f45155c8 = Integer.MAX_VALUE;
        this.f45247j8 = -1;
        this.f45261k8 = -10000;
        this.f45385u8 = new a0.h();
        this.N8 = new ye(this, 27);
        ui.b bVar3 = new ui.b();
        this.O8 = bVar3;
        this.P8 = new dh.c(bVar3, bVar3, bVar3);
        this.V8 = new Paint(1);
        this.W8 = 0.0f;
        this.Z8 = 1.0f;
        this.f45127a9 = 0.0f;
        this.f45209g9 = true;
        this.f45274l9 = new oj(this);
        this.J9 = true;
        this.f45362sa = new xj(this, 0);
        this.Ca = new org.telegram.messenger.i3(this);
        this.Ia = new tf(this, 0);
        this.Ja = new ek(this);
        this.La = -1;
        this.f45158cb = new uk(this);
        this.f45171db = new bl(this);
        this.f45198fb = new rh(this);
        this.f45211gb = new wh(this);
        this.f45224hb = new ni(this);
        this.f45237ib = new mm(this);
        this.f45250jb = new uf(this, 4);
        this.kb = new uf(this, 6);
        this.Jb = new int[2];
        this.f45238ic = new RectF();
        this.f45277lc = new uf(this, 8);
        this.f45364sc = new k8.a(9);
        this.f45376tc = new Object();
        this.Jc = false;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.bd = new te.a(0, this, erVar, 320L, false);
        this.f45160cd = new te.a(1, this, erVar, 520L, false);
        this.f45172dd = new te.a(2, this, erVar, 520L, false);
        this.f45186ed = new te.a(3, this, erVar, 320L, false);
        this.f45199fd = new te.a(4, this, erVar, 320L, false);
        this.f45213gd = new te.a(5, this, erVar, 320L, false);
        this.f45226hd = new te.a(6, this, erVar, 320L, false);
        uf ufVar = new uf(this, 10);
        ?? obj = new Object();
        obj.f20518b = new float[32];
        obj.f20517a = 1;
        obj.d = new te.j(obj, se.a.f56572a, 240L);
        obj.f20519c = ufVar;
        this.f45239id = obj;
        this.f45265kd = new Rect();
        ?? obj2 = new Object();
        this.N = obj2;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.gz.f()) {
            dh.g gVar = new dh.g(false);
            this.H = gVar;
            this.I = Math.max(0, org.telegram.messenger.g0.L(48.0f) - Math.min(org.telegram.messenger.g0.f23604n, org.telegram.messenger.g0.f23603m));
            ui.f fVar = new ui.f(obj2);
            this.K = fVar;
            fVar.d = gVar;
            fVar.f58439e = -3;
            fVar.f58440f = obj2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.M = cVar;
            cVar.f8097k = true;
            if (org.telegram.messenger.qc.e(262144)) {
                ui.f fVar2 = new ui.f(obj2);
                this.J = fVar2;
                fVar2.d = gVar;
                fVar2.f58439e = -2;
                fVar2.f58440f = obj2;
                dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
                this.L = cVar2;
                cVar2.f8097k = true;
            } else {
                this.J = null;
                this.L = this.M;
            }
        } else {
            this.H = null;
            this.I = 0;
            this.J = null;
            this.K = null;
            this.L = new dh.c(obj2, obj2, obj2);
            this.M = new dh.c(obj2, obj2, obj2);
        }
        dh.c cVar3 = new dh.c(obj2, obj2, obj2);
        this.O = cVar3;
        cVar3.f8094g = bVar;
        this.L.f8094g = bVar;
        this.M.f8094g = bVar;
        this.P8.f8094g = new xe.b();
        this.O.f8093f = bVar2;
        this.L.f8093f = bVar2;
        this.M.f8093f = bVar2;
        this.P8.f8093f = bVar2;
    }

    public static void A0(an anVar) {
        if (anVar.f45325pc == null) {
            return;
        }
        qy0[] qy0VarArr = {qy0.d1(anVar.getParentActivity(), anVar, true, anVar.resourceProvider, new li.v(18, anVar, qy0VarArr))};
    }

    public static void A1(an anVar, ArrayList arrayList, long j3, org.telegram.ui.Components.ok0 ok0Var, boolean z10, int i7) {
        if (z10) {
            org.telegram.messenger.ez.C(anVar.currentAccount).q0(arrayList, j3, false, false, true, i7, 0, null, -1, 0L, 0L, null);
            org.telegram.messenger.g0.i3(new bg.j0(anVar, j3, 4), 400L);
            ok0Var.dismiss();
        }
    }

    public static void B0(an anVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = org.telegram.messenger.np.s1(anVar.currentAccount).o1(user.f28200id);
                    ConnectionsManager.getInstance(anVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new v7(4, anVar, user));
                }
            }
        }
    }

    public static void B1(an anVar, String str) {
        if (org.telegram.messenger.np.s1(anVar.currentAccount).L2(false)) {
            anVar.getParentActivity();
            vf.c.o(str);
            return;
        }
        org.telegram.ui.Components.t4.l0(anVar.getParentActivity(), anVar.Aa, str, false, new of(anVar, str, 0));
    }

    public static void C0(an anVar, org.telegram.messenger.bj bjVar, org.telegram.messenger.gj gjVar, int i7, int i10) {
        if (bjVar != null) {
            ArrayList arrayList = bjVar.d;
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.ez.C(anVar.currentAccount).u((org.telegram.messenger.gj) arrayList.get(0), anVar, i7, i10);
                return;
            }
        }
        org.telegram.messenger.ez.C(anVar.currentAccount).u(gjVar, anVar, i7, i10);
    }

    public static void C1(an anVar, String str) {
        Uri parse = Uri.parse(str);
        e40.b(anVar.getParentActivity(), anVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void C8(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        int i7 = 6;
        if (z10) {
            menu.add(2131296496, 2131296502, 6, org.telegram.messenger.hd.M0(2131746440, null));
            i7 = 7;
        }
        if (z13) {
            menu.add(2131296496, 2131296508, i7, org.telegram.messenger.hd.M0(2131745262, null));
            i7++;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131753671, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.y31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, i7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131749087, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y31(org.telegram.messenger.g0.o1("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i10 = i7 + 2;
        menu.add(2131296496, 2131296497, i7 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131748350, null));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.y31(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(2131296496, 2131296499, i10, spannableStringBuilder3);
            i10 = i7 + 3;
        }
        if (encryptedChat == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131744437, null));
            ?? obj = new Object();
            obj.f41484a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.xy0(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i11 = i10 + 1;
            menu.add(2131296496, 2131296509, i10, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131743889, null));
            ?? obj2 = new Object();
            obj2.f41484a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.xy0(obj2, 0), 0, spannableStringBuilder5.length(), 33);
            i10 += 2;
            menu.add(2131296496, 2131296512, i11, spannableStringBuilder5);
        }
        if (z11) {
            menu.add(2131296496, 2131296498, i10, org.telegram.messenger.hd.M0(2131751744, null));
            i10++;
        }
        if (z10 && encryptedChat == null) {
            menu.add(2131296496, 2131296493, i10, org.telegram.messenger.hd.M0(2131750590, null));
            i10++;
        }
        menu.add(2131296496, 2131296503, i10, org.telegram.messenger.hd.M0(2131746337, null));
    }

    public static void D0(an anVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.np.s1(anVar.currentAccount).o1(user.f28200id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(anVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new wg(anVar, tL_attachMenuBot, user, 1), 66);
    }

    public static void D1(an anVar) {
        org.telegram.messenger.np messagesController = anVar.getMessagesController();
        long j3 = anVar.f45259k6;
        long j10 = anVar.f45154c7;
        int i7 = anVar.classGuid;
        int i10 = anVar.f45204g4;
        long j11 = anVar.f45358s4;
        int i11 = anVar.B4;
        int i12 = anVar.f45283m6;
        anVar.f45283m6 = i12 + 1;
        messagesController.Y2(j3, j10, false, 30, 0, 0, true, 0, i7, 0, i10, j11, i11, i12, anVar.f45408w4);
    }

    public static void E0(an anVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, cf cfVar) {
        String str4;
        if (anVar.f45382u5 != null && i7 < arrayList.size() && anVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            org.telegram.messenger.gj gjVar = anVar.f45382u5;
            if (gjVar != null) {
                TLRPC.Message message = gjVar.f23817k;
            }
            org.telegram.ui.Components.p21.U0(anVar.getParentActivity(), anVar, inputPeer, iArr[0], anVar.f45382u5.M2, str, str4, charSequence, z10, cfVar, new uf(anVar, 11)).f29710p0 = false;
            anVar.P7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(anVar.currentAccount).f25270e7;
            int i10 = sharedPreferences.getInt("dialog_show_translate_count" + anVar.a(), 5);
            if (i10 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.np.s1(anVar.currentAccount).f25270e7.edit();
                edit.putInt("dialog_show_translate_count" + anVar.a(), i10 - 1).apply();
                anVar.zd(true);
            }
        }
    }

    public static boolean E1(org.telegram.ui.an r14, org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.E1(org.telegram.ui.an, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static void F0(org.telegram.ui.an r8, java.lang.String r9, android.text.style.CharacterStyle r10, org.telegram.messenger.gj r11, org.telegram.ui.Cells.q1 r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.F0(org.telegram.ui.an, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.gj, org.telegram.ui.Cells.q1, int, int):void");
    }

    public static void F1(an anVar, View view, int i7) {
        org.telegram.ui.Components.p5 p5Var;
        TLRPC.User user;
        char c10;
        tj tjVar;
        tj tjVar2;
        if (i7 != 0) {
            jg.h1 adapter = anVar.X1.getAdapter();
            if (adapter.f17147x0 != null && !adapter.f17128i0) {
                return;
            }
            int i10 = i7 - 1;
            Object J = anVar.X1.getAdapter().J(i10);
            int i11 = anVar.X1.getAdapter().Y;
            int i12 = anVar.X1.getAdapter().Z;
            if (anVar.X1.getAdapter().G != null && i10 == 1) {
                anVar.f45118a0.d1(i11, i12, anVar.X1.getAdapter().G + "@" + org.telegram.messenger.t3.K(anVar.f45173e, false) + " ", false);
            } else if (anVar.X1.getAdapter().G != null && i10 == 0) {
                anVar.f45118a0.d1(i11, i12, a8.p0.s(new StringBuilder(), anVar.X1.getAdapter().G, " "), false);
            } else if (J instanceof kg.u1) {
                if (!anVar.getUserConfig().q()) {
                    anVar.showDialog(new ug.x0(anVar, anVar.getParentActivity(), anVar.currentAccount, true, 31, false, null));
                    return;
                }
                kg.u1 u1Var = (kg.u1) J;
                org.telegram.ui.Components.t4.X(anVar.currentAccount, Math.max(1, u1Var.a()), anVar.f45259k6, new li.v(14, anVar, u1Var));
            } else {
                org.telegram.messenger.cj cjVar = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (anVar.f45204g4 != 0 || !anVar.t7(view)) {
                        if (view instanceof org.telegram.ui.Cells.w7) {
                            cjVar = ((org.telegram.ui.Cells.w7) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.t4.X(anVar.currentAccount, 1, anVar.a(), new di.i2(anVar, tL_document, org.telegram.messenger.gj.U(tL_document), anVar.X1.getAdapter().L(i10), cjVar, 3));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (anVar.C3 && (tjVar2 = anVar.f45203g3) != null && tjVar2.getVisibility() == 0) {
                        anVar.Db(chat, null);
                        return;
                    }
                    String K = org.telegram.messenger.t3.K(chat, false);
                    if (K != null) {
                        anVar.f45118a0.d1(i11, i12, a8.p0.p("@", K, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (anVar.C3 && (tjVar = anVar.f45203g3) != null && tjVar.getVisibility() == 0) {
                        anVar.Db(null, user2);
                    } else if (org.telegram.messenger.q10.n(user2) != null) {
                        anVar.f45118a0.d1(i11, i12, "@" + org.telegram.messenger.q10.n(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(r.b.v(org.telegram.messenger.q10.j(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.i41("" + user2.f28200id, 3, null), 0, spannableString.length(), 33);
                        anVar.f45118a0.d1(i11, i12, spannableString, false);
                    }
                } else if (J instanceof jg.e1) {
                    if (anVar.X1.getAdapter().K != null && anVar.f45204g4 != 1) {
                        jg.e1 e1Var = (jg.e1) J;
                        org.telegram.messenger.cz b10 = org.telegram.messenger.cz.b(e1Var.f17066a, anVar.f45259k6, anVar.E5, anVar.f45281m4, null, false, null, null, null, true, 0, 0, null, false);
                        b10.K = anVar.Y8();
                        b10.X = e1Var.f17067b;
                        b10.R = anVar.j9();
                        b10.T = anVar.f45422x5;
                        anVar.getSendMessagesHelper().r0(b10);
                        anVar.f45118a0.setFieldText("");
                        anVar.D9(false);
                    }
                } else if (J instanceof String) {
                    if (anVar.X1.getAdapter().K != null) {
                        if (anVar.f45204g4 == 1) {
                            org.telegram.ui.Components.t4.J(anVar.getParentActivity(), anVar.f45259k6, new m2.d(14, anVar, (String) J), anVar.Aa);
                            return;
                        } else if (!anVar.t7(view)) {
                            org.telegram.ui.Components.t4.X(anVar.currentAccount, 1, anVar.f45259k6, new li.v(15, anVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    anVar.f45118a0.d1(i11, i12, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (anVar.f45118a0.getFieldText() != null) {
                        if (anVar.f45204g4 == 1 || !anVar.t7(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (anVar.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c10 = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c10 = 2;
                                } else {
                                    c10 = 0;
                                }
                                if (c10 != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.Aa);
                                    String M0 = org.telegram.messenger.hd.M0(2131745596, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                    t1Var.S = M0;
                                    if (c10 == 1) {
                                        t1Var.U = org.telegram.messenger.hd.M0(2131750475, null);
                                    } else {
                                        t1Var.U = org.telegram.messenger.hd.M0(2131749103, null);
                                    }
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747831, null), null);
                                    anVar.showDialog(t1Var);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(anVar.X1.getAdapter().S);
                                anVar.eb = arrayList;
                                PhotoViewer.p1().I2(null, anVar, anVar.Aa);
                                PhotoViewer.p1().f2(arrayList, anVar.X1.getAdapter().M(i10), 3, false, anVar.f45198fb, anVar);
                                return;
                            }
                            org.telegram.ui.Components.t4.X(anVar.currentAccount, 1, anVar.a(), new li.v(16, anVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    u5 u5Var = new u5(23, anVar, (TLRPC.TL_inlineBotWebView) J);
                    if (anVar.Ib) {
                        u5Var.run();
                    } else {
                        wc1.a(anVar.getParentActivity(), new li.v(17, anVar, u5Var), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    jj jjVar = anVar.X1;
                    if (jjVar != null && (user = jjVar.getAdapter().f17147x0) != null) {
                        anVar.f45118a0.setFieldText("");
                        long j3 = anVar.f45259k6;
                        if (j3 == user.f28200id) {
                            anVar.f45412w8 = j3;
                            anVar.getMessagesController().A4(tL_inlineBotSwitchPM.start_param, anVar.f45187f);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f28200id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", anVar.f45259k6);
                        if (anVar.getMessagesController().E(bundle, anVar, null, null)) {
                            anVar.presentFragment(new an(bundle));
                        }
                    }
                } else if (J instanceof org.telegram.messenger.oi) {
                    String str = ((org.telegram.messenger.oi) J).f25764a;
                    qj qjVar = anVar.f45118a0;
                    qjVar.X();
                    qjVar.V0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            anVar.f45118a0.d1(i11, i12, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = anVar.f45118a0.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document e11 = org.telegram.ui.Components.g5.e(anVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(org.telegram.messenger.gj.U(e11));
                            if (e11 != null) {
                                p5Var = new org.telegram.ui.Components.p5(e11, fontMetricsInt);
                            } else {
                                p5Var = new org.telegram.ui.Components.p5(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(p5Var, 0, spannableString2.length(), 33);
                            anVar.f45118a0.d1(i11, i12, spannableString2, false);
                            anVar.X1.o(false);
                        }
                    }
                    anVar.f45118a0.d1(i11, i12, str, true);
                    anVar.X1.o(false);
                }
            }
        }
    }

    public static void G0(an anVar) {
        long j3;
        ArrayList arrayList = anVar.f45436y6;
        arrayList.add(Integer.valueOf(anVar.f45283m6));
        if (anVar.f45204g4 == 7) {
            org.telegram.messenger.na a10 = org.telegram.messenger.na.a(anVar.currentAccount);
            String str = anVar.J3;
            int i7 = anVar.classGuid;
            int i10 = anVar.f45164d4;
            int i11 = anVar.f45283m6;
            anVar.f45283m6 = i11 + 1;
            a10.e(i7, i10, i11, str);
        } else if (anVar.N7 != 0) {
            org.telegram.messenger.np messagesController = anVar.getMessagesController();
            long j10 = anVar.f45259k6;
            long j11 = anVar.f45154c7;
            int i12 = anVar.N7;
            int i13 = anVar.classGuid;
            int i14 = anVar.f45204g4;
            long j12 = anVar.f45358s4;
            int i15 = anVar.B4;
            int i16 = anVar.f45283m6;
            anVar.f45283m6 = i16 + 1;
            messagesController.Y2(j10, j11, false, 30, 0, i12, true, 0, i13, 4, i14, j12, i15, i16, anVar.f45408w4);
        } else if (anVar.L7 != 0 && (!anVar.fa() || anVar.L7 == anVar.f45155c8 || anVar.f45408w4)) {
            int i17 = anVar.A7;
            if (i17 != 0) {
                anVar.f45154c7 = i17;
                org.telegram.messenger.np messagesController2 = anVar.getMessagesController();
                long j13 = anVar.f45154c7;
                boolean z10 = anVar.f45437y7;
                int i18 = anVar.f45424x7;
                int i19 = anVar.L7;
                int i20 = anVar.classGuid;
                int i21 = anVar.f45204g4;
                long j14 = anVar.f45358s4;
                int i22 = anVar.B4;
                int i23 = anVar.f45283m6;
                anVar.f45283m6 = i23 + 1;
                messagesController2.Y2(j13, 0L, z10, i18, i19, 0, true, 0, i20, 3, i21, j14, i22, i23, anVar.f45408w4);
            } else {
                org.telegram.messenger.np messagesController3 = anVar.getMessagesController();
                long j15 = anVar.f45259k6;
                long j16 = anVar.f45154c7;
                boolean z11 = anVar.f45437y7;
                int i24 = anVar.f45424x7;
                int i25 = anVar.L7;
                int i26 = anVar.classGuid;
                int i27 = anVar.f45204g4;
                long j17 = anVar.f45358s4;
                int i28 = anVar.B4;
                int i29 = anVar.f45283m6;
                anVar.f45283m6 = i29 + 1;
                messagesController3.Y2(j15, j16, z11, i24, i25, 0, true, 0, i26, 3, i27, j17, i28, i29, anVar.f45408w4);
            }
        } else if (anVar.f45449z7) {
            anVar.f45283m6++;
        } else {
            org.telegram.messenger.np messagesController4 = anVar.getMessagesController();
            long j18 = anVar.f45259k6;
            long j19 = anVar.f45154c7;
            boolean z12 = anVar.f45437y7;
            int i30 = anVar.f45424x7;
            int i31 = anVar.L7;
            int i32 = anVar.classGuid;
            int i33 = anVar.f45204g4;
            long j20 = anVar.f45358s4;
            int i34 = anVar.B4;
            int i35 = anVar.f45283m6;
            anVar.f45283m6 = i35 + 1;
            messagesController4.Y2(j18, j19, z12, i30, i31, 0, true, 0, i32, 2, i33, j20, i34, i35, anVar.f45408w4);
        }
        int i36 = anVar.f45204g4;
        if (i36 == 0 || (i36 == 3 && anVar.e9() == anVar.getUserConfig().e())) {
            if (anVar.fa() && !anVar.f45408w4) {
                return;
            }
            arrayList.add(Integer.valueOf(anVar.f45283m6));
            org.telegram.messenger.np messagesController5 = anVar.getMessagesController();
            long j21 = anVar.f45259k6;
            long j22 = anVar.f45154c7;
            int i37 = anVar.classGuid;
            if (anVar.f45204g4 == 3) {
                j3 = 0;
            } else {
                j3 = anVar.f45358s4;
            }
            long j23 = j3;
            int i38 = anVar.B4;
            int i39 = anVar.f45283m6;
            anVar.f45283m6 = i39 + 1;
            messagesController5.Y2(j21, j22, false, 1, 0, 0, true, 0, i37, 2, 1, j23, i38, i39, anVar.f45408w4);
        }
    }

    public static void G1(an anVar, long j3, long j10) {
        di.v8.y(anVar.currentAccount, false).C(j3, j10, new di.m4(anVar, j3, j10, 1));
    }

    public static boolean H0(an anVar) {
        org.telegram.messenger.gj gjVar = anVar.f45325pc;
        if (gjVar == null) {
            return false;
        }
        if (org.telegram.messenger.g0.g(gjVar.T0)) {
            new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(anVar.getParentActivity()), anVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static void H1(an anVar, TLRPC.Document document) {
        anVar.K4.put(document, 0);
        org.telegram.messenger.ez.C(anVar.currentAccount).v0(document, null, anVar.f45259k6, null, null, null, anVar.C5, null, true, 0, 0, false, null, anVar.Y8(), 0L, anVar.j9(), anVar.f45422x5);
    }

    public static void I1(an anVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i7, org.telegram.messenger.gj gjVar, int i10, int i11, org.telegram.messenger.gj gjVar2) {
        boolean z10;
        int i12;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i13 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            anVar.Pc = true;
            anVar.A0.g1();
            Bundle bundle = new Bundle();
            final long B0 = org.telegram.messenger.gj.B0(((org.telegram.messenger.gj) arrayList.get(0)).f23817k);
            bundle.putLong("chat_id", -B0);
            bundle.putInt("message_id", Math.max(1, tL_messages_discussionMessage.read_inbox_max_id));
            bundle.putInt("unread_count", tL_messages_discussionMessage.unread_count);
            if (messages_messages != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            bundle.putBoolean("historyPreloaded", z10);
            an anVar2 = new an(bundle);
            anVar2.Vb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i7 != 0) {
                anVar2.f45155c8 = i7;
            }
            if (gjVar != null && (messageReplies = gjVar.f23817k.replies) != null && (messageReplies2 = anVar2.f45281m4.f23817k.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (gjVar != null && (tL_messageReactions = gjVar.f23817k.reactions) != null) {
                anVar2.f45281m4.f23817k.reactions = tL_messageReactions;
            }
            ci.p0 p0Var = new ci.p0(anVar, new boolean[]{false}, i10, anVar2, 18);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i14 = message.f28072id;
                        i12 = i11;
                        if (i14 > i12 && !message.out) {
                            i13 = i14;
                            break;
                        }
                    }
                }
                i12 = i11;
                final int classGuid = anVar2.getClassGuid();
                org.telegram.messenger.ns.f(anVar.currentAccount).b(new fi(anVar, classGuid, p0Var, anVar2), org.telegram.messenger.ns.D);
                final int i15 = i12;
                Utilities.d.c(new Runnable() {
                    @Override
                    public final void run() {
                        int i16;
                        int i17;
                        an anVar3 = an.this;
                        org.telegram.messenger.np messagesController = anVar3.getMessagesController();
                        TLRPC.messages_Messages messages_messages2 = messages_messages;
                        int size2 = messages_messages2.messages.size();
                        int i18 = i7;
                        if (i18 > 0) {
                            i16 = i18;
                        } else {
                            i16 = i15;
                        }
                        if (i18 > 0) {
                            i17 = 3;
                        } else {
                            i17 = 2;
                        }
                        int i19 = i17;
                        messagesController.K3(messages_messages2, size2, B0, 0L, 30, i16, 0, false, classGuid, i13, 0, 0, 0, i19, true, 0, ((org.telegram.messenger.gj) i5.c.h(1, arrayList)).e1(), 1, false, 0, true, anVar3.f45408w4, null);
                    }
                });
                return;
            }
            p0Var.run();
            return;
        }
        anVar.Oc = 0;
        anVar.Pc = false;
        anVar.A0.g1();
        if (gjVar2 != null) {
            anVar.Ja(gjVar2);
        } else if (anVar.getParentActivity() != null) {
            org.telegram.ui.Components.cc.a0(anVar).t(org.telegram.messenger.hd.M0(2131752330, null), anVar.Aa).j();
        }
    }

    public static Integer I8(ArrayList arrayList, int i7, int[] iArr) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        Integer num = (Integer) arrayList.get(0);
        if (i7 >= num.intValue()) {
            iArr[0] = 0;
            return num;
        }
        int size = arrayList.size();
        int i10 = size - 1;
        Integer num2 = (Integer) arrayList.get(i10);
        if (i7 <= num2.intValue()) {
            iArr[0] = i10;
            return num2;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            i12 = (i11 + size) / 2;
            Integer num3 = (Integer) arrayList.get(i12);
            if (num3.intValue() == i7) {
                iArr[0] = i12;
                return num3;
            } else if (i7 < num3.intValue()) {
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    Integer num4 = (Integer) arrayList.get(i13);
                    if (i7 > num4.intValue()) {
                        iArr[0] = i13;
                        return num4;
                    }
                }
                i11 = i12 + 1;
            } else if (i12 > 0 && i7 < ((Integer) arrayList.get(i12 - 1)).intValue()) {
                iArr[0] = i12;
                return num3;
            } else {
                size = i12;
            }
        }
        iArr[0] = i12;
        return (Integer) arrayList.get(i12);
    }

    public static void J0(an anVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i7) {
        org.telegram.messenger.ez.C(anVar.currentAccount).v0(tL_document, str, anVar.f45259k6, anVar.E5, anVar.f45281m4, null, anVar.C5, null, z10, i7, 0, false, obj, anVar.Y8(), 0L, anVar.j9(), anVar.f45422x5);
    }

    public static void J1(an anVar) {
        SparseArray[] sparseArrayArr = anVar.f45294n6;
        org.telegram.messenger.gj gjVar = null;
        for (int i7 = 1; i7 >= 0; i7--) {
            if (gjVar == null && sparseArrayArr[i7].size() != 0) {
                gjVar = (org.telegram.messenger.gj) anVar.F6[i7].get(sparseArrayArr[i7].keyAt(0));
            }
            sparseArrayArr[i7].clear();
            anVar.f45306o6[i7].clear();
            anVar.f45319p6[i7].clear();
        }
        if (anVar.getParentActivity() != null && gjVar != null && ((org.telegram.messenger.gj.R4(gjVar.f23817k) || gjVar.h4()) && gjVar.F0() != null)) {
            TLRPC.Document F0 = gjVar.F0();
            org.telegram.messenger.w7.G(anVar.currentAccount);
            File J = org.telegram.messenger.w7.J(F0, null, false, true);
            TLRPC.Message message = gjVar.f23817k;
            if (message != null && message.attachPath != null && (J == null || !J.exists())) {
                J = new File(gjVar.f23817k.attachPath);
            }
            if (J != null && J.exists()) {
                Intent intent = new Intent("android.intent.action.SEND");
                if (!org.telegram.messenger.gj.L4(gjVar.f23817k) && !gjVar.h4()) {
                    intent.setType(gjVar.t1());
                } else {
                    intent.setType("video/mp4");
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        Activity parentActivity = anVar.getParentActivity();
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.t0.d();
                        sb2.append("org.telegram.messenger.beta");
                        sb2.append(".provider");
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.d(parentActivity, sb2.toString(), J));
                        intent.setFlags(1);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(J));
                }
                anVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131745459, null)), 500);
            }
        }
        anVar.B9();
        anVar.gd(0, true);
        anVar.Gd(false);
        anVar.td();
    }

    public static void K0(an anVar, TLRPC.Document document) {
        anVar.K4.put(document, 0);
        org.telegram.messenger.ez.C(anVar.currentAccount).v0(document, null, anVar.f45259k6, null, null, null, anVar.C5, null, true, 0, 0, false, null, anVar.Y8(), 0L, anVar.j9(), anVar.f45422x5);
    }

    public static void L0(an anVar) {
        if (anVar.f45280m3.getAlpha() != 0.0f && !anVar.actionBar.x() && !anVar.Y9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(anVar.f45280m3.getCustomDate() * 1000);
            int i7 = calendar.get(1);
            int i10 = calendar.get(2);
            int i11 = calendar.get(5);
            calendar.clear();
            calendar.set(i7, i10, i11);
            anVar.ha((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static void M0(an anVar, int i7, org.telegram.messenger.gj gjVar) {
        if (i7 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f28092id = anVar.getMessagesController().q1(anVar.f45187f);
            anVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new be(anVar, 4));
            return;
        }
        org.telegram.messenger.cz g10 = org.telegram.messenger.cz.g(anVar.getUserConfig().f(), anVar.f45259k6, gjVar, anVar.f45281m4, null, null, true, 0, 0);
        g10.K = anVar.Y8();
        org.telegram.messenger.ez.C(anVar.currentAccount).r0(g10);
        if (anVar.f45204g4 == 0) {
            anVar.ra(false);
        }
        anVar.D9(false);
    }

    public static void M2(long j3, an anVar) {
        int i7;
        boolean z10;
        org.telegram.messenger.sv svVar;
        if (j3 != anVar.e9()) {
            anVar.getConnectionsManager().cancelRequestsForGuid(anVar.classGuid);
            anVar.getMessagesStorage().k(anVar.classGuid);
            anVar.classGuid = ConnectionsManager.generateClassGuid();
            anVar.sb();
            anVar.f45409w5 = null;
            anVar.L7 = 0;
            anVar.E7 = -1;
            anVar.B7 = false;
            anVar.C7 = true;
            anVar.f45436y6.clear();
            if (j3 != 0) {
                i7 = 3;
            } else {
                i7 = 0;
            }
            anVar.f45204g4 = i7;
            anVar.f45358s4 = j3;
            if (i7 == 3) {
                org.telegram.messenger.tv G1 = anVar.getMessagesController().G1();
                long b10 = anVar.b();
                ArrayList arrayList = G1.f26740j;
                int i10 = 0;
                while (true) {
                    if (i10 < arrayList.size()) {
                        svVar = (org.telegram.messenger.sv) arrayList.get(i10);
                        if (svVar.f26569a == b10) {
                            break;
                        }
                        i10++;
                    } else {
                        svVar = null;
                        break;
                    }
                }
                if (svVar != null && !svVar.f26575i) {
                    G1.f(b10, null);
                }
            }
            anVar.L8();
            anVar.wd(true);
            ui uiVar = anVar.f45314p1;
            if (uiVar != null) {
                uiVar.n(true);
                anVar.f45314p1.b();
            }
            org.telegram.ui.Components.v01 v01Var = anVar.f45289n0;
            if (v01Var != null) {
                v01Var.setCurrentTopic(j3);
                org.telegram.ui.Components.v01 v01Var2 = anVar.f45289n0;
                if (anVar.f45240j0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v01Var2.setMenuAvailable(z10);
            }
            anVar.zd(true);
            anVar.Pc(true);
            anVar.E9(true);
            anVar.D9(true);
            qj qjVar = anVar.f45118a0;
            if (qjVar != null) {
                qjVar.y0(false);
                anVar.f45118a0.a2(true);
            }
            anVar.N6(true, true);
            sm smVar = anVar.Uc;
            if (smVar != null && anVar.actionBar.f29304o0) {
                smVar.k(null);
            }
        }
    }

    public static void N0(an anVar) {
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.gj gjVar2;
        org.telegram.messenger.ij ijVar;
        ArrayList arrayList;
        String a02;
        anVar.f45422x5 = null;
        int i7 = anVar.Rb;
        if (i7 == 2) {
            anVar.C5 = null;
            anVar.E5 = null;
            org.telegram.messenger.kj kjVar = anVar.f45409w5;
            if (kjVar != null) {
                kjVar.f(null, null, anVar.f45259k6, null);
            }
            anVar.B8();
        } else if (i7 == 3) {
            org.telegram.messenger.kj kjVar2 = anVar.f45409w5;
            if (kjVar2 != null && !kjVar2.c() && (ijVar = anVar.f45409w5.f24704b) != null && (arrayList = ijVar.f24403e) != null) {
                int size = arrayList.size();
                long j3 = 0;
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) anVar.f45409w5.f24704b.f24403e.get(i10);
                    if (j3 == 0) {
                        j10 = org.telegram.messenger.gj.B0(gjVar3.f23817k);
                        j3 = gjVar3.Z0();
                    } else if (j3 != gjVar3.Z0()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.Aa);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.J0 = true;
                if (j10 > 0) {
                    TLRPC.User a22 = anVar.getMessagesController().a2(Long.valueOf(j10));
                    if (a22 != null) {
                        a02 = org.telegram.messenger.hd.a0("CancelForwardPrivate", null, 2131752583, org.telegram.messenger.hd.G(anVar.f45409w5.f24704b.f24403e.size(), "MessagesBold", new Object[0]), org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat M0 = anVar.getMessagesController().M0(Long.valueOf(-j10));
                    if (M0 != null) {
                        a02 = org.telegram.messenger.hd.a0("CancelForwardChat", null, 2131752584, org.telegram.messenger.hd.G(anVar.f45409w5.f24704b.f24403e.size(), "MessagesBold", new Object[0]), M0.title);
                    } else {
                        return;
                    }
                }
                t1Var.U = org.telegram.messenger.g0.X2(a02);
                t1Var.S = org.telegram.messenger.hd.G(anVar.f45409w5.f24704b.f24403e.size(), "messages", new Object[0]);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752582, null), new ce(anVar, 6));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131745343, null), new ce(anVar, 7));
                anVar.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, anVar.getResourceProvider());
                }
            }
        } else if (i7 == 4) {
            anVar.X5 = null;
            org.telegram.messenger.kj kjVar3 = anVar.f45409w5;
            if (kjVar3 != null) {
                int i11 = anVar.currentAccount;
                org.telegram.messenger.gj gjVar4 = anVar.E5;
                if (gjVar4 == anVar.f45281m4) {
                    gjVar2 = null;
                } else {
                    gjVar2 = gjVar4;
                }
                kjVar3.e(i11, null, null, gjVar2, anVar.C5, anVar.G5);
            }
            qj qjVar = anVar.f45118a0;
            qjVar.F3 = null;
            qjVar.G3 = false;
            anVar.z8();
            anVar.B8();
        } else {
            if (org.telegram.messenger.t3.c0(anVar.f45173e) && !anVar.f45408w4 && (gjVar = anVar.E5) != null) {
                long b22 = org.telegram.messenger.gj.b2(anVar.currentAccount, gjVar.f23817k, true, false);
                if (b22 != 0) {
                    anVar.getMediaDataController().D(anVar.f45259k6, b22, false);
                }
            }
            anVar.gc(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void N2(an anVar, Canvas canvas) {
        float f10;
        org.telegram.ui.ActionBar.q0 o92 = anVar.o9();
        if (o92 == null) {
            return;
        }
        View view = (View) o92.getParent();
        float x10 = anVar.actionBar.getX();
        org.telegram.ui.Components.v01 v01Var = anVar.f45289n0;
        if (v01Var != null) {
            f10 = v01Var.getProgress() * anVar.f45289n0.getContentWidth();
        } else {
            f10 = 0.0f;
        }
        float x11 = (o92.getX() + (view.getX() + (x10 - f10))) - anVar.f45289n0.getX();
        float y10 = (o92.getY() + (view.getY() + anVar.actionBar.getY())) - anVar.f45289n0.getY();
        if (anVar.f45440yb == null) {
            anVar.f45440yb = new Paint(1);
        }
        anVar.f45440yb.setColor(org.telegram.ui.ActionBar.j6.r1(anVar.f45289n0.getProgress(), anVar.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6)));
        canvas.drawCircle((o92.getWidth() / 2.0f) + x11, (o92.getHeight() / 2.0f) + y10, org.telegram.messenger.g0.L(23.0f), anVar.f45440yb);
        canvas.save();
        canvas.translate(x11, y10);
        o92.draw(canvas);
        canvas.restore();
    }

    public static void O0(an anVar, int i7) {
        org.telegram.ui.ActionBar.o4 o4Var = anVar.parentLayout;
        if (o4Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.e2 backgroundFragment = o4Var.getBackgroundFragment();
        if (backgroundFragment instanceof an) {
            an anVar2 = (an) backgroundFragment;
            if (anVar2.a() == anVar.f45259k6) {
                anVar.finishFragment();
                anVar2.l(i7, 0, true, 0, true, 0);
                return;
            }
        }
        anVar.presentFragment(ta(i7, anVar.f45259k6));
    }

    public static void O1(an anVar) {
        int i7;
        if (anVar.a() == anVar.getUserConfig().e() && anVar.getUserConfig().q() && anVar.Ab == null) {
            hk hkVar = new hk(anVar, anVar, anVar.getParentActivity(), anVar.currentAccount, anVar.Aa);
            anVar.Ab = hkVar;
            hkVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(0.0f));
            anVar.Ab.setDelegate(new ik(anVar));
            anVar.Ab.setTop(true);
            int i10 = 0;
            anVar.Ab.setClipChildren(false);
            anVar.Ab.setClipToPadding(false);
            anVar.Ab.setVisibility(0);
            hk hkVar2 = anVar.Ab;
            if (hkVar2.getSelectedReactions().isEmpty()) {
                i7 = 2131745872;
            } else {
                i7 = 2131745871;
            }
            hkVar2.setHint(org.telegram.messenger.hd.M0(i7, null));
            anVar.f45278m1.addView(anVar.Ab, c8.ja.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            anVar.Ab.p(null, null, true);
            anVar.Ab.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
            anVar.Ab.setScaleY(0.4f);
            anVar.Ab.setScaleX(0.4f);
            anVar.Ab.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.er.h).start();
            anVar.td();
            hk hkVar3 = anVar.Ab;
            float f10 = anVar.S9;
            ak akVar = anVar.D1;
            if (akVar != null) {
                i10 = akVar.getCurrentHeight();
            }
            hkVar3.setTranslationY(f10 + i10);
        }
    }

    public static void P0(an anVar, CharSequence charSequence, org.telegram.messenger.np npVar, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.h41[] h41VarArr;
        if (anVar.W5 != 0) {
            anVar.getConnectionsManager().cancelRequest(anVar.W5, true);
            anVar.W5 = 0;
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = null;
        try {
            Matcher matcher = org.telegram.messenger.g0.S.matcher(charSequence);
            while (matcher.find()) {
                if (matcher.start() <= 0 || charSequence.charAt(matcher.start() - 1) != '@') {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(charSequence.subSequence(matcher.start(), matcher.end()));
                }
            }
            if ((charSequence instanceof Spannable) && (h41VarArr = (org.telegram.ui.Components.h41[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.h41.class)) != null && h41VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.h41 h41Var : h41VarArr) {
                    arrayList.add(h41Var.getURL());
                }
            }
            if (arrayList != null && anVar.Y5 != null && arrayList.size() == anVar.Y5.size()) {
                boolean z12 = true;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i7), (CharSequence) anVar.Y5.get(i7))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            anVar.Y5 = arrayList;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                org.telegram.messenger.g0.h3(new uf(anVar, 3));
                return;
            }
        }
        if (arrayList == null) {
            org.telegram.messenger.g0.h3(new uf(anVar, 2));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (anVar.h != null && npVar.H2 == 2) {
            org.telegram.messenger.g0.h3(new he(anVar, npVar, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = anVar.X5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i10 = anVar.Ob + 1;
            anVar.Ob = i10;
            vf vfVar = new vf(anVar, i10, getwebpagepreview, 0);
            if (anVar.Pb == null) {
                anVar.Pb = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) anVar.Pb.get(getwebpagepreview.message);
            if (webPage2 != null) {
                vfVar.a(Boolean.TRUE, webPage2);
                return;
            }
            n6 n6Var = new n6(anVar, getwebpagepreview, vfVar, 1);
            if (anVar.W5 != 0) {
                anVar.getConnectionsManager().cancelRequest(anVar.W5, true);
            }
            anVar.W5 = anVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new d3.b(1), new bi.e4(11, anVar, n6Var));
            anVar.getConnectionsManager().bindRequestToGuid(anVar.W5, anVar.classGuid);
        }
    }

    public static org.telegram.ui.uq0 P1(org.telegram.ui.an r14, org.telegram.messenger.gj r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.P1(org.telegram.ui.an, org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.uq0");
    }

    public static void Q0(an anVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        org.telegram.messenger.np.s1(anVar.currentAccount).f25270e7.edit().putLong("dialog_join_requested_time_" + anVar.f45259k6, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (org.telegram.messenger.t3.T(anVar.f45173e) && !anVar.f45173e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i7 = org.telegram.ui.Components.e70.f34241u1;
            org.telegram.ui.Components.e70.J0(context, anVar, org.telegram.ui.Components.cc.a0(anVar), z10);
        }
        anVar.cc(false, true);
    }

    public static TLRPC.TL_message R7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28072id = message.f28072id;
        tL_message.from_id = message.from_id;
        tL_message.from_boosts_applied = message.from_boosts_applied;
        tL_message.peer_id = message.peer_id;
        tL_message.saved_peer_id = message.saved_peer_id;
        tL_message.date = message.date;
        tL_message.expire_date = message.expire_date;
        tL_message.action = message.action;
        tL_message.message = message.message;
        tL_message.flags = message.flags;
        tL_message.flags2 = message.flags2;
        tL_message.mentioned = message.mentioned;
        tL_message.media_unread = message.media_unread;
        tL_message.out = message.out;
        tL_message.unread = message.unread;
        tL_message.entities = message.entities;
        tL_message.via_bot_name = message.via_bot_name;
        tL_message.reply_markup = message.reply_markup;
        tL_message.views = message.views;
        tL_message.forwards = message.forwards;
        tL_message.replies = message.replies;
        tL_message.edit_date = message.edit_date;
        tL_message.silent = message.silent;
        tL_message.post = message.post;
        tL_message.from_scheduled = message.from_scheduled;
        tL_message.legacy = message.legacy;
        tL_message.edit_hide = message.edit_hide;
        tL_message.pinned = message.pinned;
        tL_message.fwd_from = message.fwd_from;
        tL_message.via_bot_id = message.via_bot_id;
        tL_message.via_business_bot_id = message.via_business_bot_id;
        tL_message.reply_to = message.reply_to;
        tL_message.post_author = message.post_author;
        tL_message.grouped_id = message.grouped_id;
        tL_message.reactions = message.reactions;
        tL_message.restriction_reason = message.restriction_reason;
        tL_message.ttl_period = message.ttl_period;
        tL_message.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
        tL_message.effect = message.effect;
        tL_message.noforwards = message.noforwards;
        tL_message.invert_media = message.invert_media;
        tL_message.offline = message.offline;
        tL_message.factcheck = message.factcheck;
        tL_message.send_state = message.send_state;
        tL_message.fwd_msg_id = message.fwd_msg_id;
        tL_message.params = message.params;
        tL_message.random_id = message.random_id;
        tL_message.local_id = message.local_id;
        tL_message.dialog_id = message.dialog_id;
        tL_message.ttl = message.ttl;
        tL_message.destroyTime = message.destroyTime;
        tL_message.destroyTimeMillis = message.destroyTimeMillis;
        tL_message.layer = message.layer;
        tL_message.seq_in = message.seq_in;
        tL_message.seq_out = message.seq_out;
        tL_message.with_my_score = message.with_my_score;
        tL_message.replyMessage = message.replyMessage;
        tL_message.reqId = message.reqId;
        tL_message.realId = message.realId;
        tL_message.stickerVerified = message.stickerVerified;
        tL_message.isThreadMessage = message.isThreadMessage;
        tL_message.voiceTranscription = message.voiceTranscription;
        tL_message.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
        tL_message.voiceTranscriptionRated = message.voiceTranscriptionRated;
        tL_message.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
        tL_message.voiceTranscriptionForce = message.voiceTranscriptionForce;
        tL_message.voiceTranscriptionId = message.voiceTranscriptionId;
        tL_message.premiumEffectWasPlayed = message.premiumEffectWasPlayed;
        tL_message.originalLanguage = message.originalLanguage;
        tL_message.translatedToLanguage = message.translatedToLanguage;
        tL_message.translatedText = message.translatedText;
        tL_message.replyStory = message.replyStory;
        tL_message.quick_reply_shortcut = message.quick_reply_shortcut;
        return tL_message;
    }

    public static boolean R9(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    public static void S0(org.telegram.ui.an r7, java.lang.String r8, org.telegram.messenger.gj r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.S0(org.telegram.ui.an, java.lang.String, org.telegram.messenger.gj, boolean):void");
    }

    public static void T0(an anVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, n6 n6Var) {
        try {
            a0.h hVar = new a0.h();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f28072id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new org.telegram.messenger.gj(anVar.currentAccount, tL_message, false, false));
            hVar.k(arrayList, org.telegram.messenger.m5.o(tL_webPageAttributeStory.peer));
            anVar.getMessagesController().P1().f12327k.d(hVar, new zg(0, hVar, n6Var), anVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void U0(an anVar) {
        anVar.W7(false);
        if (!anVar.fragmentBeginToShow) {
            aj ajVar = anVar.A0;
            ajVar.X1 = false;
            ajVar.Y1 = 0;
            ajVar.setEmptyView(anVar.f45189f1);
            aj ajVar2 = anVar.A0;
            ajVar2.X1 = true;
            ajVar2.Y1 = 1;
            return;
        }
        anVar.A0.setEmptyView(anVar.f45189f1);
    }

    public static void V0(an anVar, TLRPC.ReactionCount reactionCount) {
        anVar.P7(true);
        org.telegram.ui.Components.ul0.c(anVar.getParentActivity(), anVar.currentAccount, reactionCount.reaction, anVar.Aa);
    }

    public static void W0(an anVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j3;
        org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(anVar.currentAccount);
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f28169id;
        long e10 = anVar.getUserConfig().e();
        long j10 = anVar.f45259k6;
        if (e10 == j10) {
            j3 = 0;
        } else {
            j3 = -j10;
        }
        Long valueOf = Long.valueOf(j3);
        Boolean bool = Boolean.TRUE;
        f10.k(org.telegram.messenger.ns.f25592w, arrayList, valueOf, bool, bool);
    }

    public static void X0(an anVar, org.telegram.ui.Cells.q1 q1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        int i7;
        org.telegram.ui.Components.m60 I = org.telegram.ui.Components.m60.I(anVar, q1Var);
        org.telegram.ui.Components.ok0 ok0Var = new org.telegram.ui.Components.ok0(anVar.getParentActivity(), anVar.Aa);
        I.f37106p = new de(ok0Var, 0);
        if (z10 && ((org.telegram.messenger.h0) anVar.getMessagesController().f25448y7.f25852j0.f14544b).f24006c) {
            I.c(2131231275, org.telegram.messenger.hd.M0(2131743017, null), new ee(anVar, str, 5), false);
        }
        boolean z11 = true;
        I.c(2131232104, org.telegram.messenger.hd.M0(2131743152, null), new ie(anVar, ok0Var, str, 1), false);
        if (z10) {
            I.c(2131232355, org.telegram.messenger.hd.M0(2131742963, null), new ee(anVar, str, 6), false);
            I.k();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i10 = anVar.currentAccount;
                long j3 = user.f28200id;
                u5 u5Var = new u5(20, anVar, userArr);
                TLObject e22 = org.telegram.messenger.np.s1(i10).e2(j3);
                boolean z12 = e22 instanceof TLRPC.User;
                if (!(e22 instanceof TLRPC.Chat) || !org.telegram.messenger.t3.V((TLRPC.Chat) e22)) {
                    z11 = false;
                }
                if (z12) {
                    i7 = 2131743546;
                } else if (z11) {
                    i7 = 2131743560;
                } else {
                    i7 = 2131743553;
                }
                I.n(e22, org.telegram.messenger.hd.M0(i7, null), u5Var);
            } else {
                I.p(13, -1, org.telegram.messenger.hd.M0(2131743198, null));
            }
        }
        ok0Var.e(I);
        ok0Var.f(q1Var, characterStyle, null, false);
        anVar.showDialog(ok0Var);
    }

    public static ArrayList X7(ArrayList arrayList, boolean z10, CharSequence charSequence) {
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.dz dzVar = (org.telegram.messenger.dz) arrayList.get(i7);
            String str = dzVar.f23189c;
            if (str == null) {
                if (dzVar.f23187a != null) {
                    try {
                        File q02 = org.telegram.messenger.g0.q0("", z10);
                        InputStream openInputStream = org.telegram.messenger.t0.f26600b.getContentResolver().openInputStream(dzVar.f23187a);
                        FileOutputStream fileOutputStream = new FileOutputStream(q02);
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = openInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                            fileOutputStream.flush();
                        }
                        openInputStream.close();
                        fileOutputStream.close();
                        str = q02.getAbsolutePath();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else {
                    str = null;
                }
            }
            String str2 = str;
            if (str2 != null) {
                Pair N0 = org.telegram.messenger.g0.N0(str2);
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, str2, ((Integer) N0.first).intValue(), dzVar.f23199o, 0, 0);
                ffVar.n(N0);
                if (i7 == arrayList.size() - 1 && charSequence != null) {
                    ffVar.f27707a = charSequence;
                }
                arrayList2.add(ffVar);
            }
        }
        return arrayList2;
    }

    public static CharSequence X8(org.telegram.messenger.gj gjVar, org.telegram.messenger.bj bjVar, int[] iArr) {
        if (gjVar == null) {
            return null;
        }
        String F1 = org.telegram.messenger.np.s1(gjVar.K1).F1(gjVar.f23817k.restriction_reason);
        if (!TextUtils.isEmpty(F1)) {
            return F1;
        }
        if (gjVar.T4() && !org.telegram.ui.Components.x11.k(gjVar)) {
            return gjVar.i2();
        }
        CharSequence charSequence = gjVar.f23875z;
        if (charSequence != null) {
            return charSequence;
        }
        if (bjVar == null) {
            return null;
        }
        ArrayList arrayList = bjVar.d;
        int size = arrayList.size();
        CharSequence charSequence2 = null;
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(i7);
            CharSequence charSequence3 = gjVar2.f23875z;
            if (charSequence3 != null) {
                if (charSequence2 != null) {
                    return null;
                }
                if (iArr != null) {
                    iArr[0] = gjVar2.e1();
                }
                charSequence2 = charSequence3;
            }
        }
        return charSequence2;
    }

    public static void Y0(an anVar, Object[] objArr, org.telegram.ui.Components.bw0 bw0Var, boolean z10, TLRPC.StickerSet stickerSet) {
        int i7;
        if (objArr.length > 2) {
            Object obj = objArr[2];
            if (obj instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) obj;
                if (objArr.length > 3) {
                    Object obj2 = objArr[3];
                    if (obj2 instanceof String) {
                        document.localThumbPath = (String) obj2;
                    }
                }
                org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(bw0Var.f29685c, anVar.resourceProvider);
                if (z10) {
                    i7 = 2131744844;
                } else {
                    i7 = 2131744845;
                }
                org.telegram.ui.Components.xb q10 = ccVar.q(document, org.telegram.messenger.hd.a0(null, null, i7, stickerSet.title));
                q10.f41643j = 2750;
                q10.k(true);
            }
        }
    }

    public static void Z(an anVar) {
        int i7;
        String str;
        int i10;
        Activity parentActivity = anVar.getParentActivity();
        int i11 = anVar.currentAccount;
        long j3 = anVar.f45259k6;
        ym ymVar = anVar.Aa;
        int i12 = org.telegram.ui.Components.xn.M;
        org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, (Context) parentActivity, (org.telegram.ui.ActionBar.e6) ymVar, false);
        u2Var.Q(org.telegram.ui.ActionBar.j6.f28922h5);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624078, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i13 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i13, ymVar));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i13);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(imageView, L2, M, null, ymVar);
        linearLayout.addView((View) imageView, c8.ja.t(80, 80, 1, 0, 16, 0, 16));
        boolean D3 = org.telegram.messenger.np.s1(i11).D3();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.U(textView, i14, ymVar);
        textView.setTextSize(1, 20.0f);
        if (D3) {
            i7 = 2131747036;
        } else {
            i7 = 2131747037;
        }
        textView.setText(org.telegram.messenger.hd.M0(i7, null));
        linearLayout.addView(textView, c8.ja.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(textView2, i14, ymVar);
        textView2.setTextSize(1, 14.0f);
        if (j3 > 0) {
            str = org.telegram.messenger.q10.j(org.telegram.messenger.np.s1(i11).a2(Long.valueOf(j3)), true);
        } else {
            str = "";
        }
        if (D3) {
            i10 = 2131747034;
        } else {
            i10 = 2131747035;
        }
        org.telegram.messenger.k5.q(null, null, i10, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, c8.ja.t(-1, -2, 1, 12, 9, 12, 19));
        if (!D3) {
            ug.q0 q0Var = new ug.q0(parentActivity, ymVar, true);
            q0Var.setOnClickListener(new org.telegram.ui.Components.w2(u2Var, 1));
            q0Var.c(org.telegram.messenger.hd.M0(2131747038, null), false, false);
            linearLayout.addView(q0Var, c8.ja.t(-1, 48, 1, 0, 0, 0, 4));
        }
        u2Var.O = linearLayout;
        u2Var.show();
    }

    public static void Z0(an anVar) {
        if (org.telegram.messenger.g0.g(anVar.f45325pc.X0)) {
            org.telegram.messenger.i20.s(null, 2131744194, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(anVar.getParentActivity()), anVar.resourceProvider));
        }
    }

    public static FrameLayout Z7(int i7, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(org.telegram.messenger.g0.L(48.0f));
        frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(4.0f));
        di.ub ubVar = new di.ub(context, 13);
        int i10 = 3;
        ubVar.setMaxLines(3);
        ubVar.setGravity(3);
        ubVar.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.q6.U(ubVar, org.telegram.ui.ActionBar.j6.E8, e6Var);
        ubVar.setTextSize(1, i7);
        ubVar.setMaxWidth(org.telegram.messenger.g0.L(170.0f));
        ubVar.setText(charSequence);
        if (org.telegram.messenger.hd.f24101a0) {
            i10 = 5;
        }
        frameLayout.addView(ubVar, c8.ja.e(-1, -2, i10 | 16));
        return frameLayout;
    }

    public static SpannableStringBuilder Z8(long j3, org.telegram.messenger.gj gjVar, boolean z10) {
        TLRPC.Chat M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            long Z0 = gjVar.Z0();
            int i7 = gjVar.K1;
            if (j3 != Z0) {
                int i10 = (Z0 > 0L ? 1 : (Z0 == 0L ? 0 : -1));
                if (i10 > 0) {
                    TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(Z0));
                    if (a22 != null) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)).append((CharSequence) ":\n");
                    }
                } else if (i10 < 0 && (M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-Z0))) != null) {
                    spannableStringBuilder.append((CharSequence) M0.title).append((CharSequence) ":\n");
                }
            }
        }
        String F1 = org.telegram.messenger.np.s1(gjVar.K1).F1(gjVar.f23817k.restriction_reason);
        if (!TextUtils.isEmpty(F1)) {
            spannableStringBuilder.append((CharSequence) F1);
            return spannableStringBuilder;
        }
        CharSequence charSequence = gjVar.f23875z;
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(gjVar.v);
        return spannableStringBuilder;
    }

    public static void a0(an anVar, String str) {
        if (anVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", org.telegram.messenger.g5.r(anVar.currentAccount).s(1));
            anVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void a1(an anVar) {
        if (!anVar.t7(anVar.f45118a0.getSendButton())) {
            if (anVar.getMediaController().I(anVar.f45382u5)) {
                anVar.getMediaController().q(true, true, false, false);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = anVar.getMessagesController().j1(anVar.f45259k6);
            if (anVar.f45395v5 != null) {
                for (int i7 = 0; i7 < anVar.f45395v5.d.size(); i7++) {
                    tL_messages_sendScheduledMessages.f28169id.add(Integer.valueOf(((org.telegram.messenger.gj) anVar.f45395v5.d.get(i7)).e1()));
                }
            } else {
                tL_messages_sendScheduledMessages.f28169id.add(Integer.valueOf(anVar.f45382u5.e1()));
            }
            ConnectionsManager.getInstance(anVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new v7(6, anVar, tL_messages_sendScheduledMessages));
        }
    }

    public static org.telegram.messenger.gj a2(an anVar) {
        View view = anVar.f45386u9;
        if (view instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) view).getMessageObject();
        }
        if (view instanceof org.telegram.ui.Cells.t0) {
            return ((org.telegram.ui.Cells.t0) view).getMessageObject();
        }
        return null;
    }

    public static bi.m1 a5(an anVar, org.telegram.messenger.gj gjVar) {
        if (gjVar != null && !gjVar.N3() && gjVar.l4() && gjVar.f23817k.ttl == Integer.MAX_VALUE) {
            long V = anVar.getMessagesController().V(gjVar.e1(), anVar.f45259k6);
            gjVar.I0 = true;
            if (gjVar.P3() || (!gjVar.g4() && !gjVar.S4())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(gjVar);
                anVar.bd(arrayList, true);
            }
            return new bi.m1(anVar, V, gjVar, 17);
        }
        return null;
    }

    public static void b0(an anVar, org.telegram.ui.Components.m60 m60Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) m60Var.A;
        org.telegram.ui.Components.io ioVar = new org.telegram.ui.Components.io(anVar.getParentActivity(), anVar.currentAccount, actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack(), false, new ji.j(anVar, m60Var, false, 14), anVar.getResourceProvider());
        ioVar.e(anVar.f45259k6, anVar.b(), null);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(ioVar.f35678f);
        m60Var.f37103n0 = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(b10);
    }

    public static void c0(an anVar, int i7) {
        if (i7 != 0) {
            org.telegram.messenger.g0.h3(new oe(anVar, i7, 7));
        } else {
            anVar.actionBar.setSubtitle(org.telegram.messenger.hd.M0(2131748192, null));
        }
    }

    public static void c1(an anVar, long j3, boolean z10) {
        if (!anVar.U4.isEmpty()) {
            SharedPreferences.Editor edit = org.telegram.messenger.np.s1(anVar.currentAccount).f25270e7.edit();
            edit.putInt("pin_" + anVar.f45259k6, ((Integer) anVar.U4.get(0)).intValue()).commit();
            anVar.U4.clear();
            anVar.W4.clear();
            anVar.Y4 = 0;
            anVar.f45152c5 = 0;
            anVar.f45165d5 = 0;
            anVar.gd(0, true);
        }
        if (org.telegram.messenger.t3.p0(anVar.f45173e) && org.telegram.messenger.t3.A(anVar.currentAccount, anVar.f45173e, 24)) {
            if (j3 != 0) {
                org.telegram.messenger.vr messagesStorage = anVar.getMessagesStorage();
                messagesStorage.f27220a.c(new org.telegram.messenger.sp(1, -anVar.f45173e.f28051id, j3, messagesStorage));
                anVar.getMessagesController().i0(j3, 0, anVar.getMessagesController().j1(-anVar.f45173e.f28051id));
                anVar.getMessagesController().f25383r7.s(anVar.f45173e.f28051id, j3);
            }
        } else {
            anVar.getMessagesController().X(1, anVar.f45259k6, z10);
            org.telegram.messenger.vr messagesStorage2 = anVar.getMessagesStorage();
            long j10 = anVar.f45259k6;
            messagesStorage2.getClass();
            messagesStorage2.I(new org.telegram.messenger.up(messagesStorage2, j10, 2));
            org.telegram.messenger.h00 h00Var = anVar.getMessagesController().f25383r7;
            h00Var.getClass();
            org.telegram.messenger.g0.h3(new di.sb((Object) h00Var, -anVar.f45259k6, true, 4));
        }
        anVar.f45166d6.put(j3, 0);
        org.telegram.ui.Components.p11 p11Var = anVar.f45202g2;
        if (p11Var != null) {
            p11Var.setAllTopicsHidden(false);
        }
        if (j3 == anVar.f45358s4) {
            anVar.N7(false, null);
            anVar.D0.O(false);
        }
    }

    public static void d0(long j3, an anVar) {
        if (di.v8.y(anVar.currentAccount, false).p().amount < j3) {
            new di.cb(anVar.getParentActivity(), anVar.getResourceProvider(), j3, 13, org.telegram.messenger.m5.t(anVar.a()), new ye(anVar, 21), anVar.a()).show();
        } else {
            new di.db(anVar.getParentActivity(), anVar.resourceProvider).show();
        }
    }

    public static void d1(an anVar, int i7) {
        if (anVar.fragmentView != null) {
            org.telegram.ui.Cells.z J8 = anVar.J8(i7, false);
            if (J8 instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) J8;
                ch.q0 q0Var = q1Var.O;
                TLRPC.MessagePeerReaction K1 = q1Var.getMessageObject().K1();
                if (K1 != null && (q0Var.H || K1.big)) {
                    ch.l0.d(anVar, null, J8, null, 0.0f, 0.0f, ch.p0.d(K1.reaction), anVar.currentAccount, !K1.big ? 1 : 0);
                    ch.l0.f();
                }
                q0Var.H = false;
                org.telegram.messenger.gj gjVar = q1Var.Q5;
                if (gjVar != null) {
                    gjVar.h5();
                }
            } else if (J8 instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) J8;
                ch.q0 q0Var2 = t0Var.F0;
                TLRPC.MessagePeerReaction K12 = t0Var.getMessageObject().K1();
                if (K12 != null && (q0Var2.H || K12.big)) {
                    ch.l0.d(anVar, null, J8, null, 0.0f, 0.0f, ch.p0.d(K12.reaction), anVar.currentAccount, !K12.big ? 1 : 0);
                    ch.l0.f();
                }
                q0Var2.H = false;
                org.telegram.messenger.gj gjVar2 = t0Var.Q0;
                if (gjVar2 != null) {
                    gjVar2.h5();
                }
            }
        }
    }

    public static void e0(an anVar) {
        if (anVar.f45293n5) {
            anVar.f45293n5 = false;
            MediaController B = MediaController.B();
            if (B.J() && !B.K() && B.f22350h1 == anVar.classGuid) {
                B.D0(false);
            }
        }
    }

    public static void e1(an anVar, org.telegram.messenger.gj gjVar, Long l10, Runnable runnable) {
        di.v8.y(anVar.currentAccount, false).j0(gjVar, l10.longValue(), runnable, false);
    }

    public static void e2(an anVar, float f10) {
        View view = anVar.f45386u9;
        if (view instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).setSlidingOffset(f10);
        } else if (view instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) view).setWalletSlidingOffset(f10);
        }
    }

    public static void f0(an anVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int L;
        int L2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            org.telegram.messenger.np.s1(anVar.currentAccount).Y3(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (anVar.j() != null) {
                tLObject2 = anVar.j();
            } else {
                tLObject2 = anVar.f45173e;
            }
            if (!org.telegram.messenger.si.t(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = anVar.f45187f;
                if (user2 != null && user2.bot && user.f28200id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.k5.o(null, 2131753104, org.telegram.ui.Components.cc.a0(anVar), null);
                } else if (user2 != null && user2.bot && user.f28200id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.k5.o(null, 2131753107, org.telegram.ui.Components.cc.a0(anVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.k5.o(null, 2131753103, org.telegram.ui.Components.cc.a0(anVar), null);
                } else {
                    TLRPC.Chat chat = anVar.f45173e;
                    if (chat != null && !org.telegram.messenger.t3.V(chat)) {
                        org.telegram.messenger.k5.o(null, 2131753105, org.telegram.ui.Components.cc.a0(anVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = anVar.f45173e;
                    if (chat2 != null && org.telegram.messenger.t3.V(chat2)) {
                        org.telegram.messenger.k5.o(null, 2131753106, org.telegram.ui.Components.cc.a0(anVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                anVar.za(user.f28200id, anVar.B8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(anVar.getParentActivity());
                o6Var.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28944ia, false));
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.L5, o6Var, null);
                o6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(anVar.getParentActivity());
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.W = o6Var;
                t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("BotRequestAttachPermission", null, 2131752996, org.telegram.messenger.q10.p(user)));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753153, null), new a1.d(anVar, user, atomicBoolean, tL_attachMenuBot, 8));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(5, anVar.getParentActivity(), anVar.getResourceProvider());
                    c2Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    c2Var.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
                    c2Var.setMultiline(true);
                    c2Var.e(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131747780, org.telegram.messenger.q10.p(user))), "", true, false, false);
                    if (org.telegram.messenger.hd.f24101a0) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(8.0f);
                    }
                    if (org.telegram.messenger.hd.f24101a0) {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(16.0f);
                    }
                    c2Var.setPadding(L, 0, L2, 0);
                    c2Var.setOnClickListener(new org.telegram.messenger.video.e(19, c2Var, atomicBoolean));
                    t1Var.H = 6;
                    alertDialog$Builder.o(c2Var);
                }
                alertDialog$Builder.p();
            } else {
                wc1.a(anVar.getParentActivity(), new x(anVar, user, tL_attachMenuBot, 4), null);
            }
        }
    }

    public static void f1(an anVar, TLRPC.TL_game tL_game, org.telegram.messenger.gj gjVar, String str, long j3) {
        anVar.tc(tL_game, gjVar, str, false, j3);
        SharedPreferences.Editor edit = org.telegram.messenger.np.s1(anVar.currentAccount).f25270e7.edit();
        edit.putBoolean("askgame_" + j3, false).commit();
    }

    public static void f2(an anVar) {
        long j3;
        wo woVar = anVar.f45275la;
        if (woVar != null) {
            if (anVar.f45408w4) {
                if (woVar.I != null) {
                    if (anVar.getParentLayout() != null) {
                        org.telegram.ui.Components.a9.a(anVar, anVar.getParentLayout().getFragmentStack().indexOf(anVar), anVar.f45173e, anVar.f45187f, anVar.f45344r4, anVar.f45259k6, anVar.Ra, anVar.Qa);
                    }
                    TLRPC.Chat chat = anVar.f45173e;
                    TLRPC.TL_forumTopic tL_forumTopic = anVar.f45275la.I;
                    long j10 = anVar.f45259k6;
                    int i7 = anVar.Qa;
                    int i10 = anVar.Ra;
                    if (anVar.getParentLayout() != null) {
                        org.telegram.ui.Components.a9.a(anVar, anVar.getParentLayout().getFragmentStack().indexOf(anVar), chat, null, tL_forumTopic, j10, i7, i10);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", anVar.f45275la.f52941a);
                    bundle.putInt("dialog_filter_id", anVar.f45275la.f52943b);
                    bundle.putBoolean("pulled", true);
                    an g10 = qg.c.g(anVar, -anVar.f45259k6, anVar.f45275la.I, 0, bundle);
                    g10.f45298na = true;
                    f45115sd = true;
                    anVar.presentFragment(g10, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = woVar.H;
            long j11 = 0;
            if (chat2 == null) {
                j3 = 0;
            } else {
                j3 = chat2.f28051id;
            }
            if (j3 != 0) {
                anVar.I6();
                wo woVar2 = anVar.f45275la;
                TLRPC.Chat chat3 = woVar2.H;
                long j12 = woVar2.f52942a0;
                int i11 = woVar2.f52941a;
                int i12 = woVar2.f52943b;
                if (anVar.getParentLayout() != null) {
                    org.telegram.ui.Components.a9.a(anVar, anVar.getParentLayout().getFragmentStack().indexOf(anVar), chat3, null, null, j12, i11, i12);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = anVar.f45275la.H;
                if (chat4 != null) {
                    j11 = chat4.f28051id;
                }
                bundle2.putLong("chat_id", j11);
                bundle2.putInt("dialog_folder_id", anVar.f45275la.f52941a);
                bundle2.putInt("dialog_filter_id", anVar.f45275la.f52943b);
                bundle2.putBoolean("pulled", true);
                org.telegram.messenger.np.s1(anVar.currentAccount).f25270e7.edit().remove("diditem" + anVar.f45275la.f52942a0).apply();
                an anVar2 = new an(bundle2);
                ArrayList arrayList = anVar.Eb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = anVar.Eb;
                    anVar2.Eb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                anVar2.f45298na = true;
                f45115sd = true;
                anVar.presentFragment(anVar2, true);
            }
        }
    }

    public static void f5(an anVar, org.telegram.ui.Cells.q1 q1Var) {
        uh.a aVar;
        int i7;
        int i10;
        te.a aVar2 = anVar.f45172dd;
        if (anVar.f45118a0 != null && !aVar2.f57082f && q1Var.getMessageObject() != null) {
            ol olVar = anVar.f45278m1;
            RectF rectF = org.telegram.messenger.g0.P;
            jh.k.c(q1Var, olVar, rectF);
            Rect rect = org.telegram.messenger.g0.Q;
            org.telegram.ui.Cells.w1 w1Var = q1Var.f31211x2;
            if (w1Var != null && (aVar = w1Var.f31860l) != null && w1Var.f31867s) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((anVar.f45278m1.getMeasuredHeight() - anVar.A0.getPaddingBottom()) + anVar.Zc) - org.telegram.messenger.g0.L(2.0f)));
                org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
                if (anVar.f45252jd == null) {
                    anVar.f45252jd = new sh.b(anVar.getParentActivity(), anVar.resourceProvider, anVar);
                    int indexOfChild = anVar.f45278m1.indexOfChild(anVar.A0);
                    if (indexOfChild >= 0) {
                        anVar.f45278m1.addView(anVar.f45252jd, indexOfChild + 1, c8.ja.g());
                    } else {
                        anVar.f45278m1.addView(anVar.f45252jd, c8.ja.g());
                    }
                }
                if (messageObject.P3()) {
                    if (q1Var.y2()) {
                        i10 = org.telegram.ui.ActionBar.j6.f28873ec;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f28964jc;
                    }
                    anVar.T0 = i10;
                } else {
                    if (q1Var.y2()) {
                        i7 = org.telegram.ui.ActionBar.j6.fe;
                    } else {
                        i7 = org.telegram.ui.ActionBar.j6.f28875ee;
                    }
                    anVar.T0 = i7;
                }
                anVar.f45252jd.setColor(anVar.getThemedColor(anVar.T0));
                anVar.f45252jd.setCellToWatch(q1Var);
                ((te.a) anVar.f45252jd.f56847b.f12459b).a(false, false);
                anVar.f45252jd.setAnimatedVisibility(aVar2.f57081e);
                anVar.f45252jd.f56847b.setOnClickListener(new hi.p5(new ye(anVar, 26), 28));
                sh.b bVar = anVar.f45252jd;
                bVar.f56853s = new ye(anVar, 28);
                bi.u uVar = bVar.f56846a;
                uVar.setOnKeyListener(new sf(anVar, 0));
                uVar.setOnEditorActionListener(new fa(anVar, 1));
                anVar.f45118a0.f32286s6 = uVar;
                org.telegram.messenger.g0.i3(new f0(anVar, measuredHeight, uVar, 5), 100L);
                aVar2.a(true, true);
            }
        }
    }

    public static void g0(an anVar, int i7, int i10, int i11, int i12) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j3;
        int[] iArr3 = anVar.R6;
        int[] iArr4 = anVar.Q6;
        boolean[] zArr = anVar.V6;
        int[] iArr5 = anVar.P6;
        int[] iArr6 = anVar.S6;
        boolean[] zArr2 = anVar.U6;
        ArrayList arrayList = anVar.f45436y6;
        if ((i7 - i10) - i11 <= i12 && !anVar.X6) {
            boolean[] zArr3 = anVar.T6;
            if (!zArr3[0]) {
                anVar.X6 = true;
                arrayList.add(Integer.valueOf(anVar.f45283m6));
                if (anVar.I6.size() != 0) {
                    org.telegram.messenger.np messagesController = anVar.getMessagesController();
                    j3 = 0;
                    long j10 = anVar.f45259k6;
                    c10 = 0;
                    long j11 = anVar.f45154c7;
                    int i13 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i14 = iArr6[0];
                    int i15 = anVar.classGuid;
                    int i16 = anVar.f45204g4;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j12 = anVar.f45358s4;
                    int i17 = anVar.B4;
                    int i18 = anVar.f45283m6;
                    anVar.f45283m6 = i18 + 1;
                    messagesController.Y2(j10, j11, false, 50, i13, 0, z10, i14, i15, 0, i16, j12, i17, i18, anVar.f45408w4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j3 = 0;
                    org.telegram.messenger.np messagesController2 = anVar.getMessagesController();
                    long j13 = anVar.f45259k6;
                    long j14 = anVar.f45154c7;
                    boolean z11 = !zArr2[0];
                    int i19 = iArr6[0];
                    int i20 = anVar.classGuid;
                    int i21 = anVar.f45204g4;
                    long j15 = anVar.f45358s4;
                    int i22 = anVar.B4;
                    int i23 = anVar.f45283m6;
                    anVar.f45283m6 = i23 + 1;
                    messagesController2.Y2(j13, j14, false, 50, 0, 0, z11, i19, i20, 0, i21, j15, i22, i23, anVar.f45408w4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j3 = 0;
                if (anVar.f45154c7 != 0 && !zArr3[1]) {
                    anVar.X6 = true;
                    arrayList.add(Integer.valueOf(anVar.f45283m6));
                    org.telegram.messenger.np messagesController3 = anVar.getMessagesController();
                    long j16 = anVar.f45154c7;
                    int i24 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i25 = iArr6[1];
                    int i26 = anVar.classGuid;
                    int i27 = anVar.f45204g4;
                    long j17 = anVar.f45358s4;
                    int i28 = anVar.B4;
                    int i29 = anVar.f45283m6;
                    anVar.f45283m6 = i29 + 1;
                    messagesController3.Y2(j16, 0L, false, 50, i24, 0, z12, i25, i26, 0, i27, j17, i28, i29, anVar.f45408w4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j3 = 0;
        }
        if (i11 > 0 && !anVar.Z7 && i10 <= 10) {
            if (anVar.f45154c7 != j3 && !zArr[1]) {
                arrayList.add(Integer.valueOf(anVar.f45283m6));
                org.telegram.messenger.np messagesController4 = anVar.getMessagesController();
                long j18 = anVar.f45154c7;
                int i30 = iArr2[1];
                int i31 = iArr[1];
                int i32 = anVar.classGuid;
                int i33 = anVar.f45204g4;
                long j19 = anVar.f45358s4;
                int i34 = anVar.B4;
                int i35 = anVar.f45283m6;
                anVar.f45283m6 = i35 + 1;
                messagesController4.Y2(j18, 0L, false, 50, i30, 0, true, i31, i32, 1, i33, j19, i34, i35, anVar.f45408w4);
                anVar.Z7 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(anVar.f45283m6));
                org.telegram.messenger.np messagesController5 = anVar.getMessagesController();
                long j20 = anVar.f45259k6;
                long j21 = anVar.f45154c7;
                int i36 = iArr2[c10];
                int i37 = iArr[c10];
                int i38 = anVar.classGuid;
                int i39 = anVar.f45204g4;
                long j22 = anVar.f45358s4;
                int i40 = anVar.B4;
                int i41 = anVar.f45283m6;
                anVar.f45283m6 = i41 + 1;
                messagesController5.Y2(j20, j21, false, 50, i36, 0, true, i37, i38, 1, i39, j22, i40, i41, anVar.f45408w4);
                anVar.Z7 = true;
            }
        }
    }

    public static void g1(org.telegram.ui.an r12, org.telegram.ui.sj r13, boolean[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.g1(org.telegram.ui.an, org.telegram.ui.sj, boolean[]):void");
    }

    public static void h0(org.telegram.ui.an r19, final org.telegram.ui.qy0[] r20, final org.telegram.ui.Components.m60 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.h0(org.telegram.ui.an, org.telegram.ui.qy0[], org.telegram.ui.Components.m60):void");
    }

    public static void h1(an anVar) {
        if (anVar.f45204g4 == 0 && anVar.getMessagesController().O6 > anVar.getConnectionsManager().getCurrentTime() && !b.a(anVar.currentAccount, anVar.f45187f)) {
            b.c(anVar.currentAccount, anVar.getParentActivity(), anVar.getResourceProvider());
        }
    }

    public static void i0(an anVar, int i7, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.gj gjVar2;
        if (anVar.Ob != i7) {
            return;
        }
        if (bool.booleanValue()) {
            anVar.X5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                anVar.X5 = null;
                org.telegram.messenger.kj kjVar = anVar.f45409w5;
                if (kjVar != null) {
                    int i10 = anVar.currentAccount;
                    CharSequence fieldText = anVar.f45118a0.getFieldText();
                    org.telegram.messenger.gj gjVar3 = anVar.E5;
                    if (gjVar3 == anVar.f45281m4) {
                        gjVar2 = null;
                    } else {
                        gjVar2 = gjVar3;
                    }
                    kjVar.e(i10, null, fieldText, gjVar2, anVar.C5, anVar.G5);
                }
                anVar.B8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                anVar.Z5 = str;
            }
            if (anVar.h != null && z10) {
                webPage.url = str;
            }
            org.telegram.messenger.kj kjVar2 = anVar.f45409w5;
            if (kjVar2 != null) {
                int i11 = anVar.currentAccount;
                CharSequence fieldText2 = anVar.f45118a0.getFieldText();
                org.telegram.messenger.gj gjVar4 = anVar.E5;
                if (gjVar4 == anVar.f45281m4) {
                    gjVar = null;
                } else {
                    gjVar = gjVar4;
                }
                kjVar2.e(i11, null, fieldText2, gjVar, anVar.C5, anVar.G5);
            }
            anVar.lc(true, anVar.X5, false);
            return;
        }
        anVar.X5 = null;
        anVar.B8();
    }

    public static void i1(an anVar, int i7) {
        dh.g gVar = anVar.H;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                ti.a e10 = anVar.glassEngine.e();
                float L = org.telegram.messenger.g0.L(48.0f);
                float L2 = org.telegram.messenger.g0.L(48.0f);
                int i10 = 0;
                while (i10 < e10.f57662b) {
                    RectF rectF = (RectF) e10.f57661a.get(i10);
                    rectF.inset(-L, -L2);
                    if (rectF.isEmpty()) {
                        e10.d(i10);
                    } else {
                        i10++;
                    }
                }
                e10.b(anVar.A0.getY(), anVar.A0.getWidth(), anVar.A0.getY() + anVar.A0.getHeight());
                gVar.h(e10);
            }
            ol olVar = anVar.f45278m1;
            gVar.e(olVar.f49995q0, olVar.getWidth(), anVar.f45278m1.getHeight());
        }
    }

    public static void j0(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            org.telegram.messenger.si.b0(anVar.currentAccount).E0(false, true, null);
            anVar.za(user.f28200id, anVar.B8, false);
        }
    }

    public static void j1(an anVar) {
        anVar.f45427xa = null;
        anVar.A0.setOnInterceptTouchListener(null);
        anVar.Pb(anVar.f45278m1, true);
        org.telegram.messenger.d4.f(anVar.currentAccount).f23024a.clear();
    }

    public static void k0(an anVar, boolean[] zArr, Context context) {
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.gj gjVar2 = anVar.E5;
        if (gjVar2 == null || !org.telegram.messenger.gj.c3(gjVar2.f23817k)) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i7 = anVar.Rb;
            if (i7 == 5) {
                int i10 = anVar.currentAccount;
                long j3 = anVar.f45259k6;
                org.telegram.messenger.lj ljVar = anVar.f45422x5;
                if (ljVar == null) {
                    ljVar = org.telegram.messenger.lj.a();
                }
                new di.s0(context, i10, j3, ljVar, anVar, anVar.getResourceProvider(), 0, new ke(anVar, 1)).show();
            } else if (i7 == 1 && (gjVar = anVar.G5) != null) {
                if (gjVar.p5() && !z10) {
                    org.telegram.messenger.lj ljVar2 = anVar.f45422x5;
                    if (ljVar2 == null) {
                        ljVar2 = org.telegram.messenger.lj.a();
                    }
                    anVar.Ac(ljVar2);
                } else if (anVar.G5.t() && anVar.F5 == 0) {
                    if (anVar.Y1 == null) {
                        anVar.U7();
                    }
                    anVar.Y1.w1(-1, anVar.G5);
                    anVar.Aa();
                } else {
                    anVar.l(anVar.G5.e1(), 0, true, 0, true, 0);
                }
            } else if (anVar.f45409w5 != null) {
                if (i7 == 2) {
                    if (!org.telegram.messenger.m5.C(anVar.f45259k6) && !anVar.f45409w5.f24721u && anVar.f45204g4 != 5) {
                        int i11 = org.telegram.messenger.gz.f23929a;
                        SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                        org.telegram.messenger.gz.Q = true;
                        edit.putBoolean("replyingOptionsHintShown", true);
                        edit.apply();
                        anVar.Fa(0);
                        return;
                    }
                    org.telegram.messenger.gj gjVar3 = anVar.E5;
                    if (gjVar3 != null) {
                        anVar.l(gjVar3.e1(), 0, true, 0, true, 0);
                    }
                } else if (i7 == 3) {
                    int i12 = org.telegram.messenger.gz.f23929a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.np.e1().edit();
                    org.telegram.messenger.gz.P = true;
                    edit2.putBoolean("forwardingOptionsHintShown", true);
                    edit2.apply();
                    anVar.Fa(1);
                } else if (i7 == 4) {
                    anVar.Fa(2);
                }
            }
        }
    }

    public static void k1(an anVar) {
        org.telegram.ui.Components.c30.h.a();
        anVar.showDialog(new bi.s2(anVar.getParentActivity(), anVar.currentAccount, anVar.a(), null, null));
    }

    public static void k2(an anVar, View view, boolean z10, float f10, float f11) {
        org.telegram.messenger.gj gjVar;
        int i7;
        int i10;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            gjVar = q1Var.getMessageObject();
            q1Var.f30996h1 = f10;
            q1Var.f31009i1 = f11;
            org.telegram.ui.Components.k90 k90Var = q1Var.Ta;
            float f12 = q1Var.f31009i1;
            k90Var.h = q1Var.getTranslationX() + f10;
            k90Var.f36346i = f12;
            k90Var.f36349l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.t0) {
            gjVar = ((org.telegram.ui.Cells.t0) view).getMessageObject();
        } else {
            gjVar = null;
        }
        int a92 = anVar.a9(gjVar);
        if ((gjVar == null || ((i10 = gjVar.D) != 30 && i10 != 18 && i10 != 25)) && a92 >= 2 && a92 != 20 && a92 != 21) {
            if (gjVar == null || ((i7 = gjVar.D) != 27 && i7 != 30)) {
                if (gjVar == null || !gjVar.X4()) {
                    if (gjVar == null || (!gjVar.r4() && !org.telegram.messenger.gj.c3(gjVar.f23817k))) {
                        anVar.K6(gjVar, z10, true);
                        anVar.Lc();
                        anVar.Gd(false);
                    }
                }
            }
        }
    }

    public static void l0(an anVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j3;
        ug.g1 g1Var = new ug.g1(anVar, anVar.currentAccount, user, null, null, anVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j3 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j3 = tL_emojiStatusCollectible.document_id;
            g1Var.f58111z2 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(anVar.getParentActivity());
        org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(160.0f), 4, i9Var, false);
        i9Var.setImageDrawable(e5Var);
        i9Var.addOnAttachStateChangeListener(new e5(e5Var, 1));
        e5Var.j(j3, false);
        g1Var.A2 = true;
        g1Var.f58109x2 = i9Var;
        anVar.showDialog(g1Var);
    }

    public static void l1(an anVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        an anVar2;
        int i7;
        int i10;
        TLRPC.TL_forumTopic f10;
        jh.a aVar = anVar.f45376tc;
        if (num.intValue() != anVar.b()) {
            anVar.Tc = false;
            qe qeVar = anVar.f45338qc;
            if (qeVar != null) {
                org.telegram.messenger.g0.r(qeVar);
                anVar.f45338qc.run();
                anVar.f45338qc = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.p11 p11Var = anVar.f45202g2;
            long intValue = num.intValue();
            ArrayList l10 = org.telegram.messenger.np.s1(p11Var.f38152e).f25383r7.l(-p11Var.f38154f);
            if (l10 != null) {
                int size = l10.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = l10.get(i11);
                    i11++;
                    tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                    if (tL_forumTopic.f28103id == intValue) {
                        break;
                    }
                }
            }
            tL_forumTopic = null;
            if (tL_forumTopic == null) {
                message = null;
            } else {
                message = tL_forumTopic.topicStartMessage;
            }
            if (message == null && tL_forumTopic != null && (f10 = anVar.getMessagesController().f25383r7.f(-anVar.a(), tL_forumTopic.f28103id)) != null) {
                message = f10.topicStartMessage;
                tL_forumTopic2 = f10;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                anVar.f45453zb = SystemClock.uptimeMillis();
                anVar.G7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    anVar.vb(anVar.b());
                } else if (anVar.b() == 0) {
                    anVar.vb(num.intValue());
                } else {
                    anVar.E7 = -1;
                }
                anVar.getConnectionsManager().cancelRequestsForGuid(anVar.classGuid);
                anVar.getMessagesStorage().k(anVar.classGuid);
                anVar.classGuid = ConnectionsManager.generateClassGuid();
                anVar.sb();
                anVar.f45409w5 = null;
                anVar.L7 = 0;
                anVar.B7 = false;
                anVar.C7 = true;
                anVar.X7 = true;
                anVar.Y7 = 0;
                anVar.f45126a8 = null;
                anVar.f45436y6.clear();
                anVar.f45146c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new org.telegram.messenger.gj(anVar.getCurrentAccount(), message, false, false));
                    anVar2 = anVar;
                    anVar2.Vb(arrayList, anVar.f45173e, tL_forumTopic2.f28103id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    anVar2 = anVar;
                    anVar2.f45344r4 = null;
                    anVar2.f45317p4 = null;
                    anVar2.f45281m4 = null;
                    anVar2.E5 = null;
                    anVar2.f45446z4 = 0;
                    anVar2.A4 = 0;
                    anVar2.B4 = 0;
                    anVar2.f45358s4 = 0L;
                    anVar2.f45369t4 = 0;
                    anVar2.f45381u4 = null;
                    anVar2.f45408w4 = false;
                    anVar2.f45394v4 = false;
                }
                jl jlVar = anVar2.D0;
                if (jlVar != null) {
                    if (jlVar.J >= 0 && !jlVar.N()) {
                        jl jlVar2 = anVar2.D0;
                        jlVar2.s(jlVar2.J);
                    } else {
                        jl jlVar3 = anVar2.D0;
                        if (jlVar3.J < 0 && jlVar3.N()) {
                            anVar2.D0.i(0);
                        }
                    }
                    anVar2.D0.T();
                }
                anVar2.L8();
                anVar2.wd(true);
                anVar2.f45314p1.n(true);
                if (tL_forumTopic2 != null) {
                    anVar2.Cd();
                } else {
                    anVar2.f45314p1.b();
                }
                anVar2.f45202g2.setCurrentTopic(anVar2.b());
                anVar2.zd(true);
                anVar2.Pc(true);
                anVar2.getMessagesController().K4(-anVar2.a(), anVar2.b());
                anVar2.hb();
                anVar2.E9(true);
                anVar2.D9(true);
                anVar2.N6(true, true);
                if (anVar2.f45118a0 != null) {
                    if (!org.telegram.messenger.q10.u(anVar2.f45187f)) {
                        anVar2.f45118a0.y0(false);
                    }
                    anVar2.f45118a0.a2(true);
                }
                if (tL_forumTopic2 != null) {
                    anVar2.getMessagesController().f25383r7.k(anVar2.f45259k6, tL_forumTopic2.f28103id);
                }
                if (tL_forumTopic2 != null) {
                    i7 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i7 = 0;
                }
                anVar2.A1 = i7;
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i10 = 0;
                }
                anVar2.B1 = i10;
                anVar2.jd(false);
                anVar2.id(false);
                anVar2.Ad();
                sm smVar = anVar2.Uc;
                if (smVar != null && anVar2.actionBar.f29304o0) {
                    smVar.k(null);
                }
                if (org.telegram.messenger.q10.u(anVar2.f45187f)) {
                    anVar2.getMediaDataController().I0(org.telegram.messenger.ur.a(anVar2.f45259k6, num.intValue()), true);
                }
            }
        }
    }

    public static void l2(an anVar, int i7) {
        int i10;
        boolean z10;
        ArrayList arrayList = anVar.L6;
        SparseArray[] sparseArrayArr = anVar.f45294n6;
        if (!anVar.f45276lb && (i10 = i7 - anVar.D0.K) >= 0 && i10 < arrayList.size()) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i10);
            if (sparseArrayArr[0].get(gjVar.e1(), null) == null && sparseArrayArr[1].get(gjVar.e1(), null) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            SparseArray sparseArray = new SparseArray();
            for (int i11 = 0; i11 < sparseArrayArr[0].size(); i11++) {
                sparseArray.put(sparseArrayArr[0].keyAt(i11), (org.telegram.messenger.gj) sparseArrayArr[0].valueAt(i11));
            }
            for (int i12 = 0; i12 < sparseArrayArr[1].size(); i12++) {
                sparseArray.put(sparseArrayArr[1].keyAt(i12), (org.telegram.messenger.gj) sparseArrayArr[1].valueAt(i12));
            }
            org.telegram.ui.Components.uj0 uj0Var = anVar.A0;
            ?? obj = new Object();
            obj.d = anVar;
            obj.f19658b = z10;
            obj.f19659c = sparseArray;
            if (!uj0Var.f40048c2) {
                uj0Var.f40064l2 = new int[2];
                new HashSet();
                uj0Var.n1(uj0Var, true);
                uj0Var.f40055g2 = obj;
                uj0Var.f40048c2 = true;
                uj0Var.f40053f2 = i7;
                uj0Var.f40051e2 = i7;
            }
        }
    }

    public static void m0(an anVar) {
        org.telegram.ui.Cells.q1 q1Var;
        zk zkVar;
        int i7;
        if (!anVar.f45389uc && anVar.U3 && anVar.A0.H && anVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = anVar.A0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = anVar.A0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        q1Var = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f23817k != null && q1Var.getMessageObject().f23817k.video_processing_pending) {
                            if (q1Var.getCurrentPosition() != null) {
                                if (q1Var.getMessageObject() != null && (q1Var.getCurrentPosition().f27753l & 8) != 0) {
                                    int i10 = q1Var.getCurrentPosition().f27753l;
                                    if (q1Var.getMessageObject().P3()) {
                                        i7 = 1;
                                    } else {
                                        i7 = 2;
                                    }
                                    if ((i10 & i7) == 0) {
                                        continue;
                                    }
                                }
                            }
                            q1Var.getLocationInWindow(iArr);
                            float timeY = q1Var.getTimeY() + iArr[1];
                            if (timeY >= org.telegram.messenger.g0.L(240.0f) && timeY <= (org.telegram.messenger.g0.f23609q.y - org.telegram.messenger.g0.L(25.0f)) - org.telegram.messenger.g0.f23604n) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    q1Var = null;
                    break;
                }
            }
            if (q1Var != null) {
                anVar.f45389uc = true;
                zk zkVar2 = new zk(anVar, anVar.getParentActivity());
                zkVar2.r(true);
                zkVar2.L = Layout.Alignment.ALIGN_CENTER;
                zkVar2.d = 3500L;
                zkVar2.U = true;
                zkVar2.f14554e = true;
                zkVar2.h = org.telegram.messenger.g0.L(150.0f);
                zkVar2.s(8.0f);
                anVar.Q1 = zkVar2;
                zkVar2.u(org.telegram.messenger.hd.M0(2131743598, null));
                anVar.Q1.l(anVar.L);
                anVar.f45278m1.addView(anVar.Q1, c8.ja.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                q1Var.getLocationInWindow(iArr);
                anVar.R1 = q1Var.getTimeY() + iArr[1];
                anVar.Q1.setTranslationY(((-zkVar.getTop()) - org.telegram.messenger.g0.L(120.0f)) + anVar.R1);
                anVar.Q1.p(0.0f, (q1Var.A9 / 2.0f) + (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + q1Var.C9);
                anVar.Q1.w();
                return;
            }
            org.telegram.messenger.g0.r(new yd(anVar, 3));
            org.telegram.messenger.g0.i3(new yd(anVar, 3), 2000L);
        }
    }

    public static void m1(an anVar, long j3, long j10, Long l10) {
        int i7;
        String str;
        if (anVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = anVar.getParentActivity();
        String M0 = org.telegram.messenger.hd.M0(2131746291, null);
        if (org.telegram.messenger.t3.p0(anVar.f45173e)) {
            i7 = 2131746295;
        } else {
            i7 = 2131746296;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i7, org.telegram.messenger.m5.t(j3)));
        if (l10.longValue() > 0) {
            str = org.telegram.messenger.hd.H(',', "RemoveMessageFeeRefund", (int) l10.longValue());
        } else {
            str = null;
        }
        org.telegram.ui.Components.t4.f0(parentActivity, M0, X2, str, org.telegram.messenger.hd.M0(2131751817, null), new rg(anVar, j3, j10, l10, 0), anVar.resourceProvider, true);
    }

    public static boolean m2(an anVar, View view, RectF rectF) {
        RectF rectF2 = anVar.f45238ic;
        if (rectF != null && anVar.A0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void n0(an anVar) {
        if (anVar.f45135b2) {
            anVar.getMessagesController().d(0, 0, anVar.f45259k6);
            anVar.h8();
            anVar.N3.j(23, anVar.f45259k6, null);
            SharedPreferences.Editor edit = org.telegram.messenger.np.s1(anVar.currentAccount).f25270e7.edit();
            edit.putBoolean("dialog_bar_archived" + anVar.f45259k6, false);
            edit.putBoolean("dialog_bar_block" + anVar.f45259k6, false);
            edit.putBoolean("dialog_bar_report" + anVar.f45259k6, false);
            edit.commit();
            anVar.zd(false);
            org.telegram.messenger.at notificationsController = anVar.getNotificationsController();
            long j3 = anVar.f45259k6;
            long b10 = anVar.b();
            SharedPreferences.Editor edit2 = notificationsController.getAccountInstance().d().edit();
            String v = org.telegram.messenger.at.v(j3, b10, false);
            SharedPreferences.Editor remove = edit2.remove("notify2_" + v);
            remove.remove("custom_" + v);
            notificationsController.getMessagesStorage().E1(j3, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsController.getMessagesController().R.f(j3);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
            edit2.commit();
            notificationsController.getNotificationsController().c0(j3, b10, true);
        } else if (anVar.f45120a2.getTag() != null && ((Integer) anVar.f45120a2.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = anVar.f45334q8;
            if (chatFull != null && chatFull.participants != null) {
                a0.h hVar = new a0.h();
                for (int i7 = 0; i7 < anVar.f45334q8.participants.participants.size(); i7++) {
                    hVar.k(null, anVar.f45334q8.participants.participants.get(i7).user_id);
                }
                long j10 = anVar.f45334q8.f28052id;
                org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(anVar.getParentActivity(), anVar.currentAccount, hVar, anVar.f45334q8.f28052id, anVar, anVar.Aa);
                a60Var.f32872g2 = new ce(anVar, 25);
                a60Var.show();
            }
        } else if (anVar.f45120a2.getTag() != null) {
            anVar.Yb(1, null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", anVar.f45187f.f28200id);
            bundle.putBoolean("addContact", true);
            pr prVar = new pr(bundle);
            prVar.P = new ce(anVar, 26);
            anVar.presentFragment(prVar);
        }
    }

    public static void n1(an anVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = anVar.getMessagesController().j1(anVar.f45259k6);
                tL_messages_getHistory.offset_date = anVar.N7 + 86400;
                tL_messages_getHistory.limit = 1;
                anVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new v7(3, anVar, tLObject));
                return;
            }
            anVar.actionBar.setSubtitle(org.telegram.messenger.hd.M0(2131748192, null));
        }
    }

    public static void o1(an anVar, cg.a aVar, Runnable runnable) {
        if (!anVar.isFinished) {
            if (cg.a.m(di.v8.x(anVar.currentAccount, aVar.f4985a).p()).f4986b < aVar.f4986b) {
                cg.b bVar = aVar.f4985a;
                if (bVar == cg.b.f4987a) {
                    new di.cb(anVar.getParentActivity(), anVar.getResourceProvider(), aVar.a(), 13, qg.c.h(anVar.currentAccount, anVar.a()), null, anVar.a()).show();
                    return;
                } else if (bVar == cg.b.f4988b) {
                    new ii.e(anVar.getParentActivity(), anVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void p0(an anVar, long j3, long j10) {
        org.telegram.messenger.f2.b(anVar.currentAccount).h(j3, j10, false);
        anVar.f45338qc = null;
    }

    public static void p1(an anVar, org.telegram.ui.Components.m60 m60Var) {
        if (anVar.f45325pc == null) {
            return;
        }
        m60Var.u();
        anVar.ma(anVar.f45325pc, false, true);
        vf.c.s(anVar.getParentActivity(), Uri.parse(anVar.f45325pc.T0), true, false, false, null, null, false, org.telegram.messenger.np.s1(anVar.currentAccount).f25269e6, false, false);
    }

    public static void p4(an anVar, org.telegram.ui.Cells.f0 f0Var) {
        String charSequence;
        if (org.telegram.messenger.np.s1(anVar.currentAccount).f25400t7.s()) {
            CharSequence text = f0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            org.telegram.messenger.b6.d(charSequence, new a7(anVar, f0Var, text, 3), new w0(f0Var, 16), false);
            return;
        }
        f0Var.setClickable(false);
    }

    public static void q0(an anVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            di.mb.m1(anVar.getParentActivity(), anVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, anVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            anVar.presentFragment(new jl0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void q1(an anVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.np.s1(anVar.currentAccount).o1(user.f28200id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(anVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new wg(anVar, tL_attachMenuBot, user, 0), 66);
    }

    public static void q2(an anVar, org.telegram.ui.Cells.q1 q1Var, int i7, int i10, int i11) {
        if (!anVar.C2.W || anVar.Lb != q1Var || anVar.Mb != i11) {
            org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
            if (messageObject != null && (org.telegram.messenger.gj.m1(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) org.telegram.messenger.gj.m1(messageObject);
                if (org.telegram.messenger.gj.W4(tL_messageMediaPoll) && !org.telegram.messenger.gj.U4(tL_messageMediaPoll)) {
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    if (!poll.closed && poll.hide_results_until_close) {
                        anVar.C2.u(org.telegram.messenger.hd.M0(2131747159, null));
                        anVar.Lb = q1Var;
                        anVar.Mb = i11;
                        anVar.C2.x(anVar.v9(q1Var, i10), anVar.w9(q1Var, i11), true);
                    }
                }
            }
            if (i7 == -1) {
                anVar.C2.u(org.telegram.messenger.hd.M0(2131747158, null));
                anVar.Lb = q1Var;
                anVar.Mb = i11;
                anVar.C2.x(anVar.v9(q1Var, i10), anVar.w9(q1Var, i11), true);
            }
        }
    }

    public static void q4(an anVar) {
        if (anVar.X3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i7 = anVar.f45204g4;
        if (i7 == 3) {
            tL_message.message = org.telegram.messenger.hd.M0(2131745894, null);
        } else if (i7 == 9) {
            tL_message.message = org.telegram.messenger.hd.M0(2131742893, null);
        } else {
            tL_message.message = org.telegram.messenger.hd.M0(2131752671, null);
        }
        tL_message.f28072id = 0;
        org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(anVar.currentAccount, tL_message, false, false);
        anVar.X3 = gjVar;
        gjVar.D = 10;
        gjVar.U = 1;
    }

    public static void r0(an anVar) {
        TLRPC.ChatFull chatFull = anVar.f45334q8;
        if (chatFull != null && !anVar.H5) {
            TLRPC.Chat chat = anVar.f45173e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && anVar.visibleDialog == null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(anVar.currentAccount).f25270e7;
                int i7 = sharedPreferences.getInt("group_convert_time", 0);
                boolean z10 = org.telegram.messenger.r2.f26198a;
                int currentTime = anVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i7) >= 604800 && anVar.visibleDialog == null && anVar.getParentActivity() != null) {
                    sharedPreferences.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = anVar.getParentActivity();
                    ce ceVar = new ce(anVar, 15);
                    ce ceVar2 = new ce(anVar, 16);
                    Pattern pattern = org.telegram.ui.Components.t4.f39507a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String y22 = org.telegram.messenger.g0.y2(null, 2131624038);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new bg.p0(10));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(org.telegram.messenger.qz.e(org.telegram.messenger.g0.L(320.0f), org.telegram.messenger.g0.L(127.17949f), y22)));
                    frameLayout.addView(view, c8.ja.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.W = frameLayout;
                    t1Var.P0 = 0.3974359f;
                    t1Var.S = org.telegram.messenger.hd.M0(2131749564, null);
                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749565, null));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749566, null), ceVar);
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), ceVar2);
                    anVar.showDialog(t1Var);
                }
            }
        }
    }

    public static void r1(an anVar) {
        if (org.telegram.messenger.g0.g(anVar.f45325pc.W0)) {
            org.telegram.messenger.i20.s(null, 2131744194, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(anVar.getParentActivity()), anVar.resourceProvider));
        }
    }

    public static void r4(an anVar) {
        if (anVar.Y3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.hd.M0(2131742894, null);
        tL_message.f28072id = 0;
        org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(anVar.currentAccount, tL_message, false, false);
        anVar.Y3 = gjVar;
        gjVar.D = 10;
        gjVar.U = 1;
    }

    public static void s0(an anVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, cf cfVar) {
        String str4;
        org.telegram.ui.Components.h21 h21Var;
        if (anVar.f45382u5 != null && i7 < arrayList.size() && anVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = anVar.getParentActivity();
            int i10 = iArr[0];
            uf ufVar = new uf(anVar, 14);
            String[] strArr = org.telegram.ui.Components.p21.S1;
            if (parentActivity == null) {
                h21Var = null;
            } else {
                org.telegram.ui.Components.h21 h21Var2 = new org.telegram.ui.Components.h21(parentActivity, str, str4, inputPeer, i10, richMessage, ufVar);
                h21Var2.S0(z10);
                h21Var2.N1 = anVar;
                h21Var2.O1 = cfVar;
                if (anVar.getParentActivity() != null) {
                    anVar.showDialog(h21Var2);
                }
                h21Var = h21Var2;
            }
            h21Var.f29710p0 = false;
            anVar.P7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(anVar.currentAccount).f25270e7;
            int i11 = sharedPreferences.getInt("dialog_show_translate_count" + anVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.np.s1(anVar.currentAccount).f25270e7.edit();
                edit.putInt("dialog_show_translate_count" + anVar.a(), i11 - 1).apply();
                anVar.zd(true);
            }
        }
    }

    public static void s1(an anVar, Context context) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.rg rgVar;
        String str;
        SparseArray[] sparseArrayArr = anVar.f45294n6;
        if (anVar.getParentActivity() != null && anVar.f45249ja == 0.0f) {
            if (anVar.f45204g4 == 3) {
                Bundle bundle = new Bundle();
                long e92 = anVar.e9();
                if (e92 >= 0) {
                    bundle.putLong("user_id", e92);
                } else {
                    bundle.putLong("chat_id", -e92);
                }
                anVar.presentFragment(new an(bundle));
                return;
            }
            boolean z12 = false;
            if (anVar.Y9()) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < sparseArrayArr[0].size(); i7++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i7)));
                }
                anVar.cc(true, true);
                byte[] bArr = anVar.f45257k4;
                String str2 = anVar.f45269l4;
                ke keVar = new ke(anVar, 2);
                int i10 = my0.f49340w1;
                int currentAccount = anVar.getCurrentAccount();
                Activity parentActivity = anVar.getParentActivity();
                long a10 = anVar.a();
                if (parentActivity != null) {
                    my0.J0(currentAccount, parentActivity, a10, false, false, arrayList, org.telegram.ui.Components.cc.a0(anVar), anVar.getResourceProvider(), bArr, str2, keVar);
                }
            } else if (anVar.f45204g4 == 2) {
                anVar.finishFragment();
                kl klVar = anVar.f45286m9;
                if (anVar.E0.getTag() == null) {
                    z12 = true;
                }
                klVar.Y(true, z12);
            } else {
                TLRPC.User user = anVar.f45187f;
                if (user != null && user.f28200id == 489000) {
                    anVar.Ic(true);
                } else if (user != null && anVar.f45288n) {
                    if (user.bot) {
                        String str3 = anVar.f45398v8;
                        anVar.f45398v8 = null;
                        anVar.getMessagesController().g5(new ee(anVar, str3, 3), anVar.f45187f.f28200id);
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.Aa);
                    String M0 = org.telegram.messenger.hd.M0(2131754065, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.U = M0;
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), new ce(anVar, 8));
                    t1Var.S = org.telegram.messenger.hd.M0(2131689472, null);
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    anVar.showDialog(t1Var);
                } else if (org.telegram.messenger.q10.z(user)) {
                    anVar.Ic(true);
                } else {
                    TLRPC.User user2 = anVar.f45187f;
                    if (user2 != null && user2.bot && (str = anVar.f45398v8) != null) {
                        if (str.length() != 0) {
                            anVar.getMessagesController().A4(anVar.f45398v8, anVar.f45187f);
                        } else {
                            anVar.getSendMessagesHelper().r0(org.telegram.messenger.cz.b("/start", anVar.f45259k6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        anVar.f45398v8 = null;
                        anVar.Pc(false);
                        return;
                    }
                    if (org.telegram.messenger.t3.T(anVar.f45173e)) {
                        TLRPC.Chat chat = anVar.f45173e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (org.telegram.messenger.t3.r0(chat)) {
                                if (anVar.f45173e.join_request) {
                                    anVar.cc(true, true);
                                    org.telegram.messenger.np.s1(anVar.currentAccount).m(anVar.f45173e.f28051id, org.telegram.messenger.m10.i(anVar.currentAccount).f(), 0, null, null, true, new yd(anVar, 20), new m2.d(13, anVar, context), null);
                                    return;
                                }
                                yd ydVar = anVar.f45153c6;
                                if (ydVar != null) {
                                    org.telegram.messenger.g0.r(ydVar);
                                    anVar.f45153c6 = null;
                                }
                                anVar.cc(true, true);
                                anVar.getMessagesController().n(anVar.f45173e.f28051id, anVar.getUserConfig().f(), null, anVar, null);
                                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.I4, new Object[0]);
                                ai.k0 k0Var = anVar.Z1;
                                if (k0Var != null && (rgVar = anVar.f45134b1) != null && rgVar.d(k0Var) && anVar.f45149c2.getVisibility() != 8 && anVar.f45149c2.getTag(2131296585) != null) {
                                    org.telegram.messenger.np.s1(anVar.currentAccount).f25270e7.edit().putInt("dialog_bar_vis3" + anVar.f45259k6, 3).commit();
                                    anVar.getNotificationCenter().k(org.telegram.messenger.ns.Q0, Long.valueOf(anVar.f45259k6));
                                    return;
                                }
                                return;
                            }
                            anVar.Ic(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = anVar.f45334q8;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = anVar.f45173e;
                    TLRPC.User user3 = anVar.f45187f;
                    if (anVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.t4.r(anVar, false, chat2, user3, z11, true, false, z10, new ce(anVar, 9));
                }
            }
        }
    }

    public static void s2(an anVar) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj primaryMessageObject;
        TLRPC.Message message;
        if (anVar.O1 != null) {
            return;
        }
        org.telegram.ui.Cells.q1 q1Var2 = null;
        for (int childCount = anVar.A0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = anVar.A0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.q1) && (primaryMessageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.f23817k) != null && message.via_business_bot_id != 0) {
                q1Var2 = q1Var;
            }
        }
        anVar.bc(q1Var2);
    }

    public static void t0(an anVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (anVar.getParentActivity() != null) {
            TLRPC.Chat chat = anVar.f45173e;
            if (chat != null) {
                if (org.telegram.messenger.t3.j(chat) && !anVar.f45173e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (anVar.h == null && (userFull = anVar.f45348r8) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.Aa);
                String M0 = org.telegram.messenger.hd.M0(2131743842, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131743843, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131743844, null), new ce(anVar, 22));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                anVar.showDialog(t1Var);
            } else if (!anVar.U4.isEmpty()) {
                org.telegram.messenger.np.s1(anVar.currentAccount).f25270e7.edit().putInt("pin_" + anVar.f45259k6, ((Integer) anVar.U4.get(0)).intValue()).commit();
                anVar.gd(0, true);
            }
        }
    }

    public static void t1(an anVar, String str) {
        if (org.telegram.messenger.np.s1(anVar.currentAccount).L2(true)) {
            vf.c.n(anVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.t4.l0(anVar.getParentActivity(), anVar.Aa, str, true, new of(anVar, str, 1));
        }
    }

    public static an ta(int i7, long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("message_id", i7);
        return new an(bundle);
    }

    public static org.telegram.ui.Components.go u0(an anVar, Context context) {
        org.telegram.ui.Components.io ioVar = new org.telegram.ui.Components.io(context, anVar.currentAccount, anVar.f45240j0.getPopupLayout().getSwipeBack(), false, new xi(anVar), anVar.getResourceProvider());
        anVar.f45418x1 = ioVar;
        ioVar.e(anVar.f45259k6, anVar.b(), null);
        return anVar.f45418x1.f35678f;
    }

    public static void u1(an anVar, long j3, long j10, Long l10, Boolean bool) {
        boolean z10 = false;
        di.v8 y10 = di.v8.y(anVar.currentAccount, false);
        if (l10.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        }
        y10.g0(j3, j10, z10, true);
    }

    public static an ua(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new an(bundle);
    }

    public static void v0(an anVar) {
        if (org.telegram.messenger.np.s1(anVar.currentAccount).r2(anVar.f45259k6, anVar.b(), null)) {
            anVar.yd(true);
            org.telegram.messenger.g0.i3(new yd(anVar, 9), 150L);
            anVar.f45240j0.V(null, null);
            if (anVar.getParentActivity() != null) {
                org.telegram.ui.Components.cc.z(anVar, 4, 0, anVar.Aa).j();
                return;
            }
            return;
        }
        View view = anVar.f45366t1.f29429j;
        if (view instanceof org.telegram.ui.ActionBar.z0) {
            ((org.telegram.ui.ActionBar.z0) view).b();
        }
    }

    public static void v1(an anVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j3;
        TLRPC.User user = anVar.X1.getAdapter().f17147x0;
        int i7 = anVar.currentAccount;
        TLRPC.User user2 = anVar.f45187f;
        if (user2 != null) {
            j3 = user2.f28200id;
        } else {
            j3 = anVar.f45173e.f28051id;
        }
        ki.k4 b10 = ki.k4.b(i7, j3, user.f28200id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, anVar.j9(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && launchActivity.N() != null && LaunchActivity.H1.N().k(b10) != null) {
            return;
        }
        String F1 = org.telegram.messenger.np.s1(anVar.currentAccount).F1(user.restriction_reason);
        if (!TextUtils.isEmpty(F1)) {
            org.telegram.messenger.np.s1(anVar.currentAccount);
            org.telegram.messenger.np.S4(F1, anVar);
            return;
        }
        ki.x2 x2Var = new ki.x2(anVar.getParentActivity(), anVar.getResourceProvider());
        x2Var.B(false);
        x2Var.C0 = true;
        x2Var.m0 = anVar.getParentActivity();
        x2Var.x(anVar, b10);
        x2Var.show();
    }

    public static void w0(an anVar, View view, boolean[] zArr, org.telegram.ui.ActionBar.g1 g1Var, View view2) {
        int i7;
        int i10;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            i7 = 0;
        } else {
            i7 = rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom;
        }
        if (i7 > 0 && !zArr[0] && g1Var == anVar.f45197f9 && g1Var.isShowing() && view2.isLaidOut()) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int height = (view2.getHeight() + iArr[1]) - (view.getHeight() - i7);
            int i11 = org.telegram.messenger.g0.f23603m;
            int i12 = anVar.f45235i9;
            if (height > 0) {
                i10 = org.telegram.messenger.g0.L(8.0f) + height;
            } else {
                i10 = 0;
            }
            int max = Math.max(i11, i12 - i10);
            if (max != anVar.f45235i9) {
                zArr[0] = true;
                int i13 = anVar.f45222h9;
                anVar.f45235i9 = max;
                g1Var.update(i13, max, -1, -1);
            }
        }
    }

    public static void w1(an anVar, int i7) {
        if (anVar.f45204g4 == 7) {
            Object E = anVar.f45137b4.E(i7);
            if (i7 == 0) {
                anVar.f45137b4.getClass();
            }
            if (E instanceof org.telegram.messenger.gj) {
                anVar.Ia((org.telegram.messenger.gj) E);
            }
        } else if (anVar.F3 != null) {
            if (i7 >= 0 && i7 < anVar.getMediaDataController().Z0.size()) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) anVar.getMediaDataController().Z0.get(i7);
                anVar.G3 = false;
                anVar.Rb(false, true, false);
                org.telegram.messenger.si mediaDataController = anVar.getMediaDataController();
                if (i7 >= 0) {
                    if (i7 < mediaDataController.Z0.size()) {
                        mediaDataController.f26474f1 = i7;
                    }
                } else {
                    mediaDataController.getClass();
                }
                anVar.nd(anVar.getMediaDataController().c0(), anVar.getMediaDataController().f26474f1, anVar.getMediaDataController().j0());
                org.telegram.messenger.g0.h3(new fe(anVar, gjVar, 2));
            }
        } else {
            org.telegram.messenger.si mediaDataController2 = anVar.getMediaDataController();
            int i10 = anVar.classGuid;
            ArrayList arrayList = mediaDataController2.Z0;
            if (i7 >= 0 && i7 < arrayList.size()) {
                mediaDataController2.f26474f1 = i7;
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(i7);
                mediaDataController2.getNotificationCenter().k(org.telegram.messenger.ns.H0, Integer.valueOf(i10), Integer.valueOf(gjVar2.e1()), Integer.valueOf(mediaDataController2.c0()), Long.valueOf(org.telegram.messenger.gj.B0(gjVar2.f23817k)), Integer.valueOf(mediaDataController2.f26474f1), Integer.valueOf(mediaDataController2.j0()), Boolean.TRUE);
            }
            anVar.sc(false);
        }
    }

    public static void x0(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            org.telegram.messenger.si.b0(anVar.currentAccount).E0(false, true, null);
            anVar.za(user.f28200id, anVar.B8, false);
        }
    }

    public static void x1(an anVar, Long l10, Boolean bool) {
        int i7;
        int i10;
        if (l10.longValue() != anVar.b()) {
            anVar.f45453zb = SystemClock.uptimeMillis();
            anVar.G7 = bool.booleanValue();
            if (l10.longValue() == 0) {
                anVar.vb(anVar.b());
            } else if (anVar.b() == 0) {
                anVar.vb(l10.longValue());
            } else {
                anVar.E7 = -1;
            }
            anVar.getConnectionsManager().cancelRequestsForGuid(anVar.classGuid);
            anVar.getMessagesStorage().k(anVar.classGuid);
            anVar.classGuid = ConnectionsManager.generateClassGuid();
            anVar.sb();
            anVar.f45409w5 = null;
            anVar.L7 = 0;
            anVar.B7 = false;
            anVar.C7 = true;
            anVar.X7 = true;
            anVar.Y7 = 0;
            anVar.f45126a8 = null;
            anVar.f45436y6.clear();
            anVar.f45358s4 = l10.longValue();
            TLRPC.TL_forumTopic f10 = anVar.getMessagesController().f25383r7.f(-anVar.a(), l10.longValue());
            if (l10.longValue() != 0 && f10 != null) {
                int i11 = f10.read_inbox_max_id;
                anVar.f45446z4 = i11;
                anVar.A4 = f10.read_outbox_max_id;
                anVar.B4 = Math.max(1, i11);
                anVar.getMessagesController().f25383r7.k(anVar.f45259k6, org.telegram.messenger.m5.o(f10.from_id));
            } else {
                anVar.f45344r4 = null;
                anVar.f45317p4 = null;
                anVar.f45281m4 = null;
                anVar.E5 = null;
                anVar.f45446z4 = 0;
                anVar.A4 = 0;
                anVar.B4 = 0;
                anVar.f45358s4 = 0L;
                anVar.f45369t4 = 0;
                anVar.f45381u4 = null;
                anVar.f45408w4 = false;
                anVar.f45394v4 = false;
            }
            anVar.L8();
            anVar.wd(true);
            anVar.f45314p1.n(true);
            anVar.f45314p1.b();
            anVar.f45202g2.setCurrentTopic(l10.longValue());
            anVar.zd(true);
            anVar.Pc(true);
            anVar.getMessagesController().K4(-anVar.a(), anVar.b());
            anVar.F9(true);
            anVar.D9(true);
            qj qjVar = anVar.f45118a0;
            if (qjVar != null) {
                qjVar.y0(false);
                anVar.f45118a0.a2(true);
            }
            anVar.N6(true, true);
            if (f10 != null) {
                i7 = f10.unread_reactions_count;
            } else {
                i7 = 0;
            }
            anVar.A1 = i7;
            if (f10 != null) {
                i10 = f10.unread_poll_votes_count;
            } else {
                i10 = 0;
            }
            anVar.B1 = i10;
            anVar.jd(false);
            anVar.id(false);
            anVar.Ad();
            sm smVar = anVar.Uc;
            if (smVar != null && anVar.actionBar.f29304o0) {
                smVar.k(null);
            }
        }
    }

    public static void y0(long j3, an anVar) {
        if (di.v8.y(anVar.currentAccount, false).p().amount < j3) {
            new di.cb(anVar.getParentActivity(), anVar.getResourceProvider(), j3, 13, org.telegram.messenger.m5.t(anVar.a()), new ye(anVar, 21), anVar.a()).show();
        } else {
            new di.db(anVar.getParentActivity(), anVar.resourceProvider).show();
        }
    }

    public static void y1(an anVar, long j3, boolean z10, boolean z11) {
        if (!org.telegram.messenger.g0.E1(anVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.gy0.c(anVar.getParentActivity(), anVar.currentAccount, -j3, anVar.getUserConfig().f(), null, z10, z11, anVar.getResourceProvider());
    }

    public static void z0(an anVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, cf cfVar) {
        String str3;
        if (anVar.f45382u5 != null && i7 < arrayList.size() && anVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            org.telegram.messenger.gj gjVar = anVar.f45382u5;
            if (gjVar != null) {
                TLRPC.Message message = gjVar.f23817k;
            }
            org.telegram.ui.Components.p21.U0(anVar.getParentActivity(), anVar, inputPeer, iArr[0], anVar.f45382u5.M2, strArr[0], str3, charSequence, z10, cfVar, new ye(anVar, 15)).f29710p0 = false;
            anVar.P7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(anVar.currentAccount).f25270e7;
            int i10 = sharedPreferences.getInt("dialog_show_translate_count" + anVar.a(), 5);
            if (i10 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.np.s1(anVar.currentAccount).f25270e7.edit();
                edit.putInt("dialog_show_translate_count" + anVar.a(), i10 - 1).apply();
                anVar.zd(true);
            }
        }
    }

    public static void z1(long j3, an anVar) {
        anVar.getMediaDataController().G0(j3, j3, true, anVar.classGuid, null);
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void A7() {
        boolean z10;
        hi.i1 i1Var;
        if (this.f45452za != null) {
            return;
        }
        int i7 = 0;
        if (this.f45199fd.f57081e >= 1.0f && ((i1Var = this.F1) == null || i1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        bi.o2 o2Var = this.f45278m1.M;
        if (!z10) {
            i7 = 4;
        }
        o2Var.setVisibility(i7);
    }

    public final org.telegram.ui.Components.v01 A8() {
        long b10;
        boolean z10;
        if (this.f45289n0 == null && getParentActivity() != null && this.f45278m1 != null) {
            org.telegram.ui.Components.v01 v01Var = new org.telegram.ui.Components.v01(getParentActivity(), this.currentAccount, a(), this.Aa, new dk(this));
            this.f45289n0 = v01Var;
            this.f45278m1.addView(v01Var, c8.ja.c(-1.0f, -1));
        }
        org.telegram.ui.Components.v01 v01Var2 = this.f45289n0;
        if (v01Var2 != null) {
            if (Z9()) {
                b10 = e9();
            } else {
                b10 = b();
            }
            v01Var2.setCurrentTopic(b10);
            org.telegram.ui.Components.v01 v01Var3 = this.f45289n0;
            if (this.f45240j0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            v01Var3.setMenuAvailable(z10);
        }
        return this.f45289n0;
    }

    public final boolean A9() {
        pl plVar = this.f45373t9;
        if (plVar != null && plVar.x()) {
            return true;
        }
        return false;
    }

    public final void Aa() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            qj qjVar = this.f45118a0;
            if (qjVar == null || TextUtils.isEmpty(qjVar.getSlowModeTimer())) {
                qj qjVar2 = this.f45118a0;
                if (qjVar2 != null && qjVar2.H6.f57082f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                U7();
                fi.p2 p2Var = this.Y1;
                if (!z10 && this.f45204g4 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                p2Var.P3 = z11;
                p2Var.f36447e2.i0();
                TLRPC.Chat chat = this.f45173e;
                if ((chat == null || this.f45422x5 == null) && !z10 && this.f45204g4 != 9) {
                    if (chat != null && !org.telegram.messenger.t3.N(chat) && this.f45173e.slowmode_enabled) {
                        this.Y1.y1(10, true);
                    } else {
                        this.Y1.y1(-1, true);
                    }
                } else {
                    this.Y1.y1(1, true);
                }
                fi.p2 p2Var2 = this.Y1;
                p2Var2.Q2 = true;
                p2Var2.f36506v3.setVisibility(0);
                p2Var2.O2 = 0;
                p2Var2.A1 = false;
                p2Var2.B1 = false;
                p2Var2.d2 = true;
                p2Var2.E1 = null;
                org.telegram.ui.ActionBar.q0 q0Var = p2Var2.f36460i3;
                if (q0Var != null) {
                    p2Var2.f36457h3.setTranslationY(0.0f);
                    q0Var.setVisibility(8);
                }
                this.Y1.e1();
                this.Y1.a1().setText(this.f45118a0.getFieldText());
                fi.p2 p2Var3 = this.Y1;
                p2Var3.f36496t1 = this.Aa;
                showDialog(p2Var3);
            }
        }
    }

    public final void Ab(boolean z10, yd ydVar) {
        ArrayList arrayList;
        int i7;
        if (this.A0.W1) {
            return;
        }
        this.f45123a5 = 0;
        this.Tb = 0;
        this.f45138b5 = false;
        this.f45297n9.f(0);
        if (this.V6[0] && this.Y7 == 0 && this.L7 == 0) {
            this.f45431y1.d(false);
            if (this.C0.I0() == 0) {
                this.C9 = false;
                dd();
                lb();
                Gd(false);
                return;
            }
            this.D0.T();
            mm mmVar = this.f45237ib;
            mmVar.f49252a = null;
            int i10 = 0;
            while (true) {
                arrayList = this.L6;
                if (i10 >= arrayList.size() || !((org.telegram.messenger.gj) arrayList.get(i10)).r4()) {
                    break;
                }
                i10++;
                z10 = false;
            }
            if (z10 && arrayList != null && !arrayList.isEmpty() && arrayList.get(i10) != null) {
                long c12 = ((org.telegram.messenger.gj) arrayList.get(i10)).c1();
                while (c12 != 0 && (i7 = i10 + 1) < arrayList.size() && c12 == ((org.telegram.messenger.gj) arrayList.get(i7)).c1()) {
                    i10 = i7;
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                i10 = Math.min(i10, arrayList.size() - 1);
            }
            wj wjVar = this.f45297n9;
            mmVar.f49253b = i10;
            mmVar.d = 0;
            boolean z11 = !z10;
            mmVar.f49254c = z11;
            wjVar.d(i10, 0, z11, true);
            this.C9 = false;
            dd();
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = this.Sb;
        if (t1Var != null) {
            t1Var.dismiss();
        }
        fd(false);
        if (ydVar != null) {
            ydVar.run();
        } else {
            pb();
            org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), this.Aa);
            this.Sb = t1Var2;
            t1Var2.setOnCancelListener(this.Ia);
            this.Sb.r(1000L);
        }
        this.f45322p9 = this.f45283m6;
        this.f45349r9 = false;
        this.f45335q9 = 0;
        this.s9 = false;
        ArrayList arrayList2 = this.f45436y6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.f45283m6));
        org.telegram.messenger.g0.i3(new ye(this, 14), 0L);
    }

    public final void Ac(org.telegram.messenger.lj ljVar) {
        if (this.G5 == null) {
            return;
        }
        new di.s0(getParentActivity(), this.currentAccount, this.f45259k6, ljVar, this, getResourceProvider(), 0, new ke(this, 0)).show();
    }

    public final void Ad() {
        int i7;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.o0 o0Var = this.f45404w0;
        if (o0Var != null) {
            TLRPC.Chat chat = this.f45173e;
            if (chat != null && org.telegram.messenger.t3.i(this.currentAccount, chat, this.f45344r4) && (tL_forumTopic = this.f45344r4) != null && !tL_forumTopic.closed) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            o0Var.e(i7);
        }
    }

    public final void B7() {
        float f10;
        org.telegram.ui.Components.ve veVar;
        float inputBubbleHeight = this.U.getInputBubbleHeight() + org.telegram.messenger.g0.L(15.0f) + t9(org.telegram.ui.Components.l11.f36702c) + this.f45403w.d();
        qj qjVar = this.f45118a0;
        if (qjVar != null && (veVar = qjVar.f32246n0) != null) {
            veVar.setTranslationY(-inputBubbleHeight);
        }
        jj jjVar = this.X1;
        if (jjVar != null) {
            if (jjVar.g()) {
                f10 = org.telegram.messenger.g0.L(5.0f);
            } else {
                f10 = -inputBubbleHeight;
            }
            jjVar.setTranslationY(f10);
        }
    }

    public final void B8() {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.lj ljVar = this.f45422x5;
        if (ljVar != null) {
            kc(ljVar);
            return;
        }
        TLRPC.WebPage webPage = this.X5;
        if (webPage != null) {
            lc(true, webPage, false);
            return;
        }
        qm qmVar = this.C5;
        if (qmVar != null) {
            jc(this.E5, qmVar);
            return;
        }
        org.telegram.messenger.gj gjVar = this.E5;
        if (gjVar != null && gjVar != this.f45281m4) {
            ic(gjVar);
            return;
        }
        org.telegram.messenger.kj kjVar = this.f45409w5;
        if (kjVar != null && (ijVar = kjVar.f24704b) != null) {
            hc(ijVar.f24403e);
            return;
        }
        org.telegram.messenger.gj gjVar2 = this.G5;
        if (gjVar2 != null) {
            gc(true, null, gjVar2, null, null, true, 0, null, false, 0L, null, true);
        } else {
            lc(false, null, true);
        }
    }

    public final void B9() {
        org.telegram.ui.Components.ft editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.x()) {
                this.f45239id.h(5, false, true);
                this.actionBar.w();
            } else {
                return;
            }
        }
        this.f45346r6 = 0;
        this.f45383u6 = 0;
        this.f45359s6 = 0;
        this.f45410w6 = 0;
        this.f45423x6 = 0;
        this.f45396v6 = 0;
        qj qjVar = this.f45118a0;
        if (qjVar != null && (editField = qjVar.getEditField()) != null) {
            if (this.f45118a0.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        pl plVar = this.f45373t9;
        if (plVar != null) {
            plVar.f(true);
            SparseArray sparseArray = this.f45373t9.f30449p0;
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i7))).cancel();
            }
            sparseArray.clear();
        }
        tk tkVar = this.D9;
        if (tkVar != null) {
            org.telegram.messenger.g0.r(tkVar.I);
            tkVar.a();
        }
        qj qjVar2 = this.f45118a0;
        if (qjVar2 != null) {
            qjVar2.f32162b0 = false;
        }
        this.E9 = false;
        if (this.Ab != null) {
            J9();
        }
    }

    public final void Ba() {
        ns.p().T = null;
        if (getParentActivity() == null) {
            return;
        }
        U7();
        this.Y1.f36447e2.i0();
        this.Y1.y1(1, false);
        fi.p2 p2Var = this.Y1;
        p2Var.S3 = true;
        p2Var.W0(null);
        this.Y1.e1();
        fi.p2 p2Var2 = this.Y1;
        p2Var2.f36496t1 = this.Aa;
        if (this.visibleDialog != null) {
            p2Var2.show();
        } else {
            showDialog(p2Var2);
        }
    }

    public final void Bb(int r26, int r27, boolean r28, int r29, boolean r30, int r31, java.lang.Integer r32, byte[] r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Bb(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void Bc(org.telegram.messenger.gj gjVar) {
        CharSequence charSequence;
        if (getParentActivity() != null && !getMessagesController().A2(org.telegram.messenger.gj.B0(gjVar.f23817k))) {
            TLRPC.Message message = gjVar.f23817k;
            if (message == null || !message.noforwards) {
                ArrayList arrayList = gjVar.B2;
                boolean z10 = false;
                if (arrayList != null && !arrayList.isEmpty()) {
                    charSequence = gjVar.v;
                    if (gjVar.B2.size() > 1) {
                        z10 = true;
                    }
                } else {
                    charSequence = gjVar.f23875z;
                }
                if (!z10 && charSequence != null) {
                    z10 = true;
                }
                if (z10 && org.telegram.messenger.gz.J <= 2 && !this.E9 && this.F9 <= this.f45118a0.getTop() - org.telegram.messenger.g0.L(60.0f)) {
                    this.E9 = true;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                    int i7 = org.telegram.messenger.gz.J + 1;
                    org.telegram.messenger.gz.J = i7;
                    edit.putInt("textSelectionHintShows", i7);
                    edit.apply();
                    if (this.D9 == null) {
                        tk tkVar = new tk(getParentActivity(), this.Aa, this);
                        this.D9 = tkVar;
                        this.f45278m1.addView(tkVar, c8.ja.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.D9.c();
                }
            }
        }
    }

    public final void Bd() {
        TLRPC.TL_forumTopic tL_forumTopic;
        ui uiVar = this.f45314p1;
        if (uiVar != null && (tL_forumTopic = this.f45344r4) != null) {
            uiVar.setTitle(tL_forumTopic.title);
        }
        Cd();
    }

    public final void C7() {
        float d;
        if (this.A0 != null) {
            if (this.f45276lb && this.f45452za == null) {
                d = org.telegram.messenger.g0.f23604n;
            } else {
                d = this.f45403w.d() + t9(org.telegram.ui.Components.l11.f36702c) + org.telegram.messenger.g0.L(16.0f) + this.Xa + this.Zc;
            }
            int i7 = (int) this.O9;
            org.telegram.ui.Components.p11 p11Var = this.f45202g2;
            if (p11Var != null) {
                p11Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            jh.g gVar = this.f45442z0;
            boolean z10 = this.A0.W1;
            RecyclerView recyclerView = gVar.f17401a;
            int i10 = (int) d;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i7 || paddingBottom != i10) {
                int i11 = paddingTop - i7;
                if (!z10 && i11 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i11 >= 0 || canScrollVertically) && (i11 <= 0 || canScrollVertically2)) {
                        org.telegram.messenger.g0.J(recyclerView, new ai.v0(gVar, i11, 11));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i7, recyclerView.getPaddingRight(), i10);
            }
            jh.e eVar = this.f45151c4;
            if (eVar != null) {
                RectF rectF = eVar.f17380b;
                rectF.set(t9(org.telegram.ui.Components.l11.f36701b), i7 - this.I, 0.0f, d - this.Xa);
                eVar.f17381c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void C9() {
        if (getUserConfig().q()) {
            org.telegram.ui.Components.cc.a0(this).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
            getMessagesController().o0(true);
            ib(this.f45382u5);
            kb(this.f45382u5);
            return;
        }
        showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) this, 3, true));
    }

    public final void Ca(final CharacterStyle characterStyle, final String str, boolean z10, final org.telegram.ui.Cells.q1 q1Var, final org.telegram.messenger.gj gjVar) {
        TLRPC.Message message;
        if (z10) {
            int i7 = -1;
            if (str.startsWith("@")) {
                if (q1Var != null) {
                    q1Var.g3(-1);
                }
                String substring = str.substring(1);
                gi na2 = na(q1Var, characterStyle);
                TLObject f22 = getMessagesController().f2(substring);
                di.z2 z2Var = new di.z2(this, na2, q1Var, substring, characterStyle, 2);
                TL_account.checkUsername checkusername = new TL_account.checkUsername();
                checkusername.username = substring;
                na2.f58805b = new oe(this, getConnectionsManager().sendRequest(checkusername, new di.k7(this, f22, z2Var, substring, na2, 4)), 5);
                na2.d();
                return;
            } else if (characterStyle == null) {
                org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.e6) this.Aa, false);
                u2Var.O();
                if (str.startsWith("video?")) {
                    i7 = Utilities.z(str).intValue();
                }
                final int i10 = i7;
                if (i10 >= 0) {
                    u2Var.P = org.telegram.messenger.g0.g0(i10, false, false);
                    u2Var.Q = false;
                } else {
                    u2Var.P = vf.c.d(str, true);
                    u2Var.Q = false;
                    u2Var.R = true;
                }
                CharSequence[] charSequenceArr = (W9() || !(gjVar == null || (message = gjVar.f23817k) == null || !message.noforwards)) ? new CharSequence[]{org.telegram.messenger.hd.M0(2131747817, null)} : new CharSequence[]{org.telegram.messenger.hd.M0(2131747817, null), org.telegram.messenger.hd.M0(2131751767, null)};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        an.F0(an.this, str, characterStyle, gjVar, q1Var, i10, i11);
                    }
                };
                u2Var.M = charSequenceArr;
                u2Var.L = onClickListener;
                u2Var.I0 = new q5(q1Var, 3);
                showDialog(u2Var);
                return;
            } else {
                if (q1Var != null) {
                    q1Var.g3(-1);
                }
                k8(q1Var, gjVar, characterStyle, str);
                return;
            }
        }
        ma(gjVar, false, false);
        String c10 = vf.c.c(str);
        if (c10 != null) {
            String lowerCase = c10.toLowerCase();
            if (!org.telegram.messenger.t3.O(lowerCase, this.f45173e) && !org.telegram.messenger.q10.r(lowerCase, this.f45187f)) {
                if (str.startsWith("@")) {
                    getMessagesController().y3(lowerCase, this, 0, na(q1Var, characterStyle));
                    return;
                } else {
                    Za(0, str, characterStyle, q1Var, false);
                    return;
                }
            }
            ui uiVar = this.f45314p1;
            if (uiVar != null) {
                uiVar.e(false, false);
            } else {
                Xb();
            }
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            Za(0, str, characterStyle, q1Var, false);
        } else {
            int i11 = this.f45204g4;
            if (i11 != 1 && i11 != 2 && i11 != 7) {
                if (str.contains("@")) {
                    presentFragment(new org.telegram.ui.Components.u20(str, this.resourceProvider));
                    return;
                } else {
                    Ga(str, false);
                    return;
                }
            }
            this.f45286m9.v0(str);
            if (this.f45204g4 != 7) {
                finishFragment();
            }
        }
    }

    public final void Cb(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Cb(java.lang.CharSequence, boolean):void");
    }

    public final void Cc(boolean z10, boolean z11) {
        qj qjVar;
        int i7;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.H2 != null) && this.f45204g4 == 0 && (qjVar = this.f45118a0) != null && qjVar.getAudioVideoButtonContainer() != null && this.f45118a0.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.H2 == null) {
                    int indexOfChild = this.f45278m1.indexOfChild(this.U);
                    if (indexOfChild != -1) {
                        this.H2 = E6(310.0f, 3, indexOfChild + 1, false);
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.H2.f(true);
                    return;
                }
                if (this.f45118a0.M2) {
                    hi.l3 l3Var = this.H2;
                    if (z11) {
                        i7 = 2131749290;
                    } else {
                        i7 = 2131749292;
                    }
                    l3Var.u(org.telegram.messenger.hd.M0(i7, null));
                } else {
                    this.H2.u(org.telegram.messenger.hd.M0(2131749291, null));
                }
                this.H2.y(this.f45118a0.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void Cd() {
        ui uiVar;
        ui uiVar2;
        if (org.telegram.messenger.q10.u(this.f45187f) && (uiVar2 = this.f45314p1) != null) {
            uiVar2.getAvatarImageView().setVisibility(0);
            this.f45314p1.b();
        } else if (this.f45344r4 != null && (uiVar = this.f45314p1) != null) {
            uiVar.getAvatarImageView().setVisibility(0);
            qg.c.p(this.f45314p1.getAvatarImageView(), this.f45344r4, true, true, this.Aa);
        }
    }

    @Override
    public final org.telegram.ui.Components.st0 D() {
        return this.f45278m1;
    }

    public final void D7() {
        FrameLayout frameLayout = this.f45189f1;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.U.getInputBubbleHeight() + this.f45403w.c() + org.telegram.messenger.g0.L(9.0f)) * (-0.5f));
        }
    }

    public final void D8(CharSequence charSequence, ArrayList arrayList) {
        if (this.G5 != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                org.telegram.messenger.gj gjVar = this.G5;
                gjVar.f23873y1 = charSequence;
                gjVar.f23877z1 = arrayList;
            } else if (this.G5.F3()) {
                org.telegram.messenger.gj gjVar2 = this.G5;
                gjVar2.f23873y1 = "";
                gjVar2.f23877z1 = new ArrayList();
            } else {
                qj qjVar = this.f45118a0;
                if (qjVar != null) {
                    this.G5.f23873y1 = qjVar.getFieldText();
                    org.telegram.messenger.gj gjVar3 = this.G5;
                    if (gjVar3.f23873y1 == null && !TextUtils.isEmpty(gjVar3.f23817k.message)) {
                        this.G5.f23873y1 = "";
                    }
                }
            }
        }
    }

    public final void D9(boolean z10) {
        gc(false, null, null, null, null, true, 0, null, false, 0L, null, z10);
    }

    public final void Da(long j3, final org.telegram.messenger.gj gjVar, int i7, final long j10, final int i10, final int i11, final org.telegram.messenger.gj gjVar2) {
        int i12 = i7;
        final TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = org.telegram.messenger.np.l1(M0);
        tL_messages_getDiscussionMessage.msg_id = i12;
        if (org.telegram.messenger.r2.f26198a) {
            org.telegram.messenger.a8.b("getDiscussionMessage chat = " + M0.f28051id + " msg_id = " + i12);
        }
        this.Oc = 0;
        this.Pc = false;
        this.Rc = null;
        this.Sc = null;
        aj ajVar = this.A0;
        if (ajVar != null) {
            ajVar.g1();
        }
        if (this.Nc != -1) {
            getConnectionsManager().cancelRequest(this.Nc, false);
        }
        if (this.Mc != -1) {
            getConnectionsManager().cancelRequest(this.Mc, false);
        }
        if (gjVar2 != null) {
            i12 = gjVar2.e1();
        }
        this.Oc = i12;
        this.Pc = false;
        this.Qc = System.currentTimeMillis();
        aj ajVar2 = this.A0;
        if (ajVar2 != null) {
            ajVar2.g1();
        }
        final int i13 = this.Kc + 1;
        this.Kc = i13;
        this.Mc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final an anVar = an.this;
                final int i14 = i13;
                final int i15 = i10;
                final long j11 = j10;
                final int i16 = i11;
                final org.telegram.messenger.gj gjVar3 = gjVar2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat = M0;
                final org.telegram.messenger.gj gjVar4 = gjVar;
                org.telegram.messenger.g0.h3(new u5(25, anVar, new Runnable(i14, i15, j11, tLObject, i16, gjVar3, tL_messages_getDiscussionMessage2, chat, gjVar4) {
                    public final int f47444b;
                    public final int f47445c;
                    public final TLObject d;
                    public final int f47446e;
                    public final org.telegram.messenger.gj f47447f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f47448n;
                    public final org.telegram.messenger.gj f47449r;

                    {
                        this.d = tLObject;
                        this.f47446e = i16;
                        this.f47447f = gjVar3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.f47448n = chat;
                        this.f47449r = gjVar4;
                    }

                    @Override
                    public final void run() {
                        int i17;
                        final an anVar2 = an.this;
                        if (this.f47444b != anVar2.Kc) {
                            return;
                        }
                        anVar2.Mc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            anVar2.Rc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            anVar2.getMessagesController().Y3(anVar2.Rc.users, false);
                            anVar2.getMessagesController().S3(anVar2.Rc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = anVar2.Rc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i18 = 0; i18 < anVar2.Rc.messages.size(); i18++) {
                                TLRPC.Message message = anVar2.Rc.messages.get(i18);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i19 = this.f47445c;
                        final int i20 = this.f47446e;
                        final org.telegram.messenger.gj gjVar5 = this.f47447f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat2 = this.f47448n;
                        final org.telegram.messenger.gj gjVar6 = this.f47449r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = anVar2.getMessagesController().m1(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f28072id;
                            tL_messages_getReplies.offset_date = 0;
                            tL_messages_getReplies.limit = 30;
                            if (i20 > 0) {
                                tL_messages_getReplies.offset_id = i20;
                                tL_messages_getReplies.add_offset = -15;
                            } else {
                                if (i19 == 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i19;
                                }
                                tL_messages_getReplies.offset_id = i17;
                                tL_messages_getReplies.add_offset = -20;
                            }
                            final int i21 = anVar2.Lc + 1;
                            anVar2.Lc = i21;
                            anVar2.Nc = anVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    org.telegram.messenger.g0.h3(new xg(an.this, i21, tLObject3, tL_error2, i19, gjVar5, tL_messages_getDiscussionMessage3, chat2, i20, gjVar6, 0));
                                }
                            });
                            return;
                        }
                        anVar2.ab(anVar2.Rc, anVar2.Sc, i19, gjVar5, tL_messages_getDiscussionMessage3, chat2, i20, gjVar6);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.Mc, this.classGuid);
    }

    public final void Db(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.D3 = user;
        this.E3 = chat;
        if (this.f45253k0 != null && this.X1 != null) {
            if (user != null || chat != null) {
                if (user != null) {
                    str = user.first_name;
                    if (TextUtils.isEmpty(str)) {
                        str = this.D3.last_name;
                    }
                } else {
                    str = chat.title;
                }
                if (str != null) {
                    if (str.length() > 10) {
                        str = str.substring(0, 10);
                    }
                    this.C3 = false;
                    String M0 = org.telegram.messenger.hd.M0(2131745766, null);
                    SpannableString spannableString = new SpannableString(a8.p0.E(M0, " ", str));
                    spannableString.setSpan(new org.telegram.ui.Components.b00(org.telegram.ui.ActionBar.j6.B8, getResourceProvider()), M0.length() + 1, spannableString.length(), 33);
                    this.f45253k0.setSearchFieldCaption(spannableString);
                    this.X1.getAdapter().U(null, 0, null, false, true);
                    this.f45253k0.setSearchFieldHint(null);
                    this.f45253k0.o();
                    org.telegram.messenger.si mediaDataController = getMediaDataController();
                    this.I3 = "";
                    mediaDataController.X1("", this.f45259k6, this.f45154c7, this.classGuid, 0, this.f45358s4, false, this.D3, this.E3, true, this.F3);
                }
            }
        }
    }

    public final boolean Dc(org.telegram.messenger.gj gjVar) {
        if (this.f45204g4 == 0 && gjVar != null && gjVar.b5()) {
            return true;
        }
        return false;
    }

    public final void Dd() {
        boolean z10;
        int i7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        if (this.m0 == null) {
            return;
        }
        int i10 = 0;
        if (ga() && !this.f45340r0 && ((kVar = this.actionBar) == null || !kVar.x())) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.m0;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        q0Var.setVisibility(i7);
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f45240j0;
        if (q0Var2 != null && (q0Var2.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            ViewGroup.LayoutParams layoutParams = this.f45240j0.getLayoutParams();
            if (!z10) {
                i10 = org.telegram.messenger.g0.L(48.0f);
            }
            if (layoutParams.width != i10) {
                layoutParams.width = i10;
                this.f45240j0.setLayoutParams(layoutParams);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = this.f45240j0;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            q0Var3.setAlpha(f10);
            this.f45240j0.setClickable(!z10);
        }
        ud();
    }

    @Override
    public final void E(float f10, int i7) {
        if (i7 == 2 && f10 == 0.0f) {
            sh.b bVar = this.f45252jd;
            if (bVar != null) {
                this.f45278m1.removeView(bVar);
                this.f45252jd = null;
            }
            qj qjVar = this.f45118a0;
            if (qjVar != null) {
                qjVar.W0();
            }
        }
    }

    public final hi.l3 E6(float f10, int i7, int i10, boolean z10) {
        long j3;
        hi.l3 l3Var = new hi.l3(getParentActivity(), i7);
        l3Var.r(true);
        l3Var.h = org.telegram.messenger.g0.L(f10);
        if (z10) {
            j3 = -1;
        } else {
            j3 = 2300;
        }
        l3Var.d = j3;
        l3Var.U = true;
        l3Var.f14554e = true;
        l3Var.k(z10);
        l3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
        l3Var.f14575v0 = org.telegram.messenger.g0.L(4.0f);
        l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        l3Var.l(this.L);
        FrameLayout.LayoutParams e10 = c8.ja.e(-1, 150, 55);
        if (i10 >= 0) {
            this.f45278m1.addView(l3Var, i10, e10);
            return l3Var;
        }
        this.f45278m1.addView(l3Var, e10);
        return l3Var;
    }

    public final void E7() {
        int i7;
        float f10 = this.f45226hd.f57081e;
        org.telegram.ui.Components.w20 w20Var = this.I1;
        int i10 = 8;
        if (w20Var != null) {
            w20Var.setAlpha(f10);
            org.telegram.ui.Components.w20 w20Var2 = this.I1;
            if (f10 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            w20Var2.setVisibility(i7);
        }
        di.c1 c1Var = this.f45122a4;
        if (c1Var != null) {
            float f11 = 1.0f - f10;
            c1Var.setAlpha(f11);
            di.c1 c1Var2 = this.f45122a4;
            if (f11 > 0.0f) {
                i10 = 0;
            }
            c1Var2.setVisibility(i10);
        }
    }

    public final void E8() {
        CharSequence charSequence;
        qj qjVar = this.f45118a0;
        if (qjVar != null) {
            charSequence = qjVar.getFieldText();
        } else {
            charSequence = null;
        }
        D8(charSequence, null);
    }

    public final void E9(boolean z10) {
        if (this.f45280m3.getTag() != null && !this.f45357s3) {
            if (!this.f45433y3 || this.f45380u3) {
                this.f45280m3.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f45393v3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f45393v3.playTogether(ObjectAnimator.ofFloat(this.f45280m3, View.ALPHA, 0.0f));
                    this.f45393v3.addListener(new ei(this, 5));
                    this.f45393v3.setStartDelay(this.f45316p3);
                    this.f45393v3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f45393v3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f45393v3 = null;
                    }
                    this.f45280m3.setAlpha(0.0f);
                }
                this.f45316p3 = 500;
            }
        }
    }

    public final void Ea(boolean z10) {
        String M0;
        if (!W9() && !z9()) {
            int i7 = 0;
            boolean z11 = false;
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.f45294n6;
                    if (i11 >= sparseArrayArr[i10].size()) {
                        break;
                    }
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sparseArrayArr[i10].valueAt(i11);
                    if (gjVar.D4()) {
                        i7 = 3;
                    } else if (gjVar.T3()) {
                        if (gjVar.Z3()) {
                            i7 = 2;
                        } else {
                            i7 = 1;
                        }
                        if (i7 == 2) {
                            break;
                        }
                    } else if (gjVar.z3()) {
                        z11 = true;
                    }
                    i11++;
                }
                if (i7 == 2) {
                    break;
                }
            }
            ch.r rVar = this.f45387ua;
            if (rVar != null && rVar.d()) {
                this.f45387ua.setHiddenByScroll(true);
            }
            Bundle j3 = org.telegram.ui.Cells.y0.j(3, "onlySelect", "dialogsType", true);
            j3.putInt("messagesCount", this.t6);
            j3.putInt("hasPoll", i7);
            j3.putBoolean("hasInvoice", z11);
            j3.putBoolean("canSelectTopics", true);
            yw ywVar = new yw(j3);
            ywVar.E2 = this;
            presentFragment(ywVar);
            return;
        }
        if (W9()) {
            if (a() > 0) {
                M0 = org.telegram.messenger.hd.M0(2131750534, null);
            } else if (org.telegram.messenger.t3.T(this.f45173e) && !this.f45173e.megagroup) {
                M0 = org.telegram.messenger.hd.M0(2131750536, null);
            } else {
                M0 = org.telegram.messenger.hd.M0(2131750535, null);
            }
        } else {
            M0 = org.telegram.messenger.hd.M0(2131750537, null);
        }
        if (z10) {
            if (this.f45444z2 == null) {
                int indexOfChild = this.f45278m1.indexOfChild(this.U);
                if (indexOfChild != -1) {
                    this.f45444z2 = E6(310.0f, 1, indexOfChild + 1, false);
                } else {
                    return;
                }
            }
            this.f45444z2.u(M0);
            this.f45444z2.y(this.actionBar.getActionMode().j(11), true);
            return;
        }
        if (this.A2 == null) {
            int indexOfChild2 = this.f45278m1.indexOfChild(this.U);
            if (indexOfChild2 == -1) {
                return;
            }
            this.A2 = E6(310.0f, 3, indexOfChild2 + 1, false);
        }
        this.A2.u(M0);
        this.A2.y(this.f45175e1.getForwardButton(), true);
    }

    public final void Eb(View view, org.telegram.messenger.gj gjVar, org.telegram.ui.Components.mi0 mi0Var, View view2, float f10, float f11, ch.p0 p0Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        ch.p0 p0Var2;
        String str;
        TLRPC.Document e10;
        org.telegram.messenger.gj b10;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.z zVar;
        di.h6 h6Var;
        int[] iArr;
        int[] iArr2;
        int i7;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z15;
        TLRPC.TL_messageReactions tL_messageReactions2;
        if (!c() && gjVar != null) {
            if (getMessagesController().v2()) {
                b.b(this.currentAccount);
                return;
            }
            int i10 = 2;
            if (p0Var != null && p0Var.f5184a) {
                P7(true);
                if (view == null) {
                    zVar = J8(gjVar.e1(), true);
                } else {
                    zVar = view;
                }
                String str2 = "";
                if (z11) {
                    if (zVar != null) {
                        try {
                            zVar.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    TLRPC.Message message2 = gjVar.f23817k;
                    if (message2 != null && (tL_messageReactions2 = message2.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    } else {
                        arrayList = null;
                    }
                    long j3 = -di.o8.b(gjVar).f9181a;
                    TLRPC.ChatFull N0 = getMessagesController().N0(j3);
                    if (N0 != null && !N0.paid_reactions_available && (arrayList == null || arrayList.isEmpty())) {
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
                        org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(this);
                        if (M0 != null) {
                            str2 = M0.title;
                        }
                        a02.Q(2131624227, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131745032, str2))).k(true);
                        return;
                    }
                    di.t8 t8Var = di.v8.y(this.currentAccount, false).B;
                    if (t8Var != null) {
                        t8Var.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i11 = this.currentAccount;
                    long j10 = this.f45259k6;
                    if (N0 != null && !N0.paid_reactions_available) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    di.jc jcVar = new di.jc(parentActivity, i11, j10, this, gjVar, arrayList, z15, false, 0L, this.Aa);
                    gjVar.e1();
                    jcVar.Q1 = this;
                    jcVar.R1 = zVar;
                    jcVar.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j11 = -di.o8.b(gjVar).f9181a;
                TLRPC.ChatFull N02 = getMessagesController().N0(j11);
                if (N02 != null && !N02.paid_reactions_available) {
                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(j11));
                    org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(this);
                    if (M02 != null) {
                        str2 = M02.title;
                    }
                    a03.Q(2131624227, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131745032, str2))).k(true);
                    return;
                }
                di.t8 b02 = di.v8.y(this.currentAccount, false).b0(gjVar, this, 1L, true, true, null);
                if (b02 != null && (zVar instanceof org.telegram.ui.Cells.z)) {
                    if (this.Wc == null) {
                        this.Wc = new di.h6(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        h6Var = null;
                    } else {
                        if (this.Wc.getParent() != layoutContainer) {
                            org.telegram.messenger.g0.E2(this.Wc);
                            layoutContainer.addView(this.Wc, c8.ja.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.Wc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.Wc.bringToFront();
                        }
                        h6Var = this.Wc;
                    }
                    h6Var.setMessageCell((org.telegram.ui.Cells.z) zVar);
                    b02.f9487o = h6Var;
                    h6Var.J = false;
                    h6Var.b(1.0f, null);
                    zVar.getLocationInWindow(new int[2]);
                    h6Var.getLocationInWindow(new int[2]);
                    float f12 = (iArr[0] - iArr2[0]) + f10;
                    float f13 = (iArr[1] - iArr2[1]) + f11;
                    if (zVar instanceof org.telegram.ui.Cells.q1) {
                        i7 = ((org.telegram.ui.Cells.q1) zVar).W;
                    } else {
                        i7 = 0;
                    }
                    h6Var.d(f12, f13 + i7, false);
                }
            } else if (a() == getUserConfig().e() && !getUserConfig().q() && (message = gjVar.f23817k) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new ug.x0((org.telegram.ui.ActionBar.e2) this, 24, true).show();
            } else {
                if (gjVar.w2() && p0Var != null) {
                    for (int i12 = 0; i12 < gjVar.f23817k.reactions.results.size(); i12++) {
                        TLRPC.ReactionCount reactionCount = gjVar.f23817k.reactions.results.get(i12);
                        if (p0Var.f(reactionCount.reaction)) {
                            z14 = reactionCount.chosen;
                            break;
                        }
                    }
                }
                z14 = false;
                if (!z14 && (chat = this.f45173e) != null && !org.telegram.messenger.t3.V(chat) && !org.telegram.messenger.t3.w(26, this.f45173e)) {
                    org.telegram.messenger.k5.n(null, 2131745591, org.telegram.ui.Components.cc.a0(this), 2131624007, 36);
                    return;
                }
                ch.l0.b(false);
                int size = gjVar.y0().size();
                boolean H5 = gjVar.H5(p0Var, z11);
                int e12 = gjVar.e1();
                long c12 = gjVar.c1();
                a0.h hVar = this.O6;
                if (hVar.f(c12) != null && (b10 = ((org.telegram.messenger.bj) hVar.f(gjVar.c1())).b(9)) != null) {
                    e12 = b10.e1();
                }
                int i13 = e12;
                if (H5) {
                    org.telegram.ui.Cells.z J8 = J8(i13, true);
                    if (!org.telegram.messenger.gz.f23991w1 && J8 != null && p0Var != null && !getUserConfig().q() && size == 1) {
                        org.telegram.messenger.gz.C(true);
                        long j12 = p0Var.f5189g;
                        if (j12 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.si.b0(this.currentAccount).f26495r.get(p0Var.f5188f);
                            if (tL_availableReaction != null) {
                                e10 = tL_availableReaction.center_icon;
                            }
                        } else {
                            e10 = org.telegram.ui.Components.g5.e(this.currentAccount, j12);
                        }
                        if (e10 != null) {
                            org.telegram.ui.Components.xb q10 = org.telegram.ui.Components.cc.a0(this).q(e10, org.telegram.messenger.hd.M0(2131752218, null));
                            q10.f41643j = 5000;
                            q10.j();
                        }
                    }
                    if (!z10) {
                        int i14 = this.currentAccount;
                        if (mi0Var != null) {
                            if (z11) {
                                i10 = 0;
                            }
                        } else {
                            i10 = 1;
                        }
                        ch.l0.d(this, mi0Var, J8, view2, f10, f11, p0Var, i14, i10);
                    }
                }
                if (H5 && p0Var != null && (str = p0Var.f5188f) != null) {
                    org.telegram.messenger.g0.i2(org.telegram.messenger.hd.a0(null, null, 2131754725, str));
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(gjVar.y0());
                org.telegram.messenger.ez sendMessagesHelper = getSendMessagesHelper();
                if (H5) {
                    p0Var2 = p0Var;
                } else {
                    p0Var2 = null;
                }
                di diVar = new di(this, z13, z10, i13, H5, mi0Var, f10, f11, p0Var, gjVar);
                this.Ic = diVar;
                sendMessagesHelper.s0(gjVar, arrayList2, p0Var2, z11, z12, this, diVar);
                if (z10 || z13) {
                    Yc(gjVar, true);
                    this.Ic.run();
                }
                if (!z13) {
                    org.telegram.messenger.g0.i3(this.Ic, 50L);
                }
            }
        }
    }

    public final void Ec(org.telegram.messenger.gj gjVar, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (gjVar != null && getParentActivity() != null) {
            ch.r rVar = this.f45387ua;
            if (rVar != null && rVar.d()) {
                this.f45387ua.setHiddenByScroll(true);
            }
            if (this.f45253k0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f29304o0) {
                    kVar.n(true);
                    this.f45118a0.u1();
                }
            }
            TLRPC.Message message = gjVar.f23817k;
            if (message != null && (richMessage = message.rich_message) != null) {
                oi.z1 z1Var = new oi.z1(richMessage);
                z1Var.K = this;
                z1Var.f22178r = gjVar;
                presentFragment(z1Var);
                return;
            }
            this.X1.getAdapter().f17126g0 = false;
            this.f45118a0.setVisibility(0);
            gc(true, null, gjVar, null, null, true, 0, null, false, 0L, null, true);
            Pc(false);
            if (!z10) {
                c7();
            }
            if (z10) {
                this.f45422x5 = org.telegram.messenger.lj.b(gjVar.f23817k.suggested_post);
            }
            this.f45118a0.l1(false, false, true);
            gd(0, true);
            Gd(false);
            if (!z10 && !gjVar.f23846r1 && !org.telegram.messenger.gj.b4(gjVar.f23817k) && this.f45204g4 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().j1(this.f45259k6);
                tL_messages_getMessageEditData.f28145id = gjVar.e1();
                this.F5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new be(this, 3));
                return;
            }
            qj qjVar = this.f45118a0;
            org.telegram.ui.Components.he heVar = qjVar.f32247n2;
            if (heVar != null) {
                heVar.setEnabled(true);
                qjVar.f32247n2.g(false);
            }
        }
    }

    public final void Ed() {
        int i7;
        org.telegram.ui.ActionBar.o0 o0Var = this.f45301o0;
        if (o0Var == null) {
            return;
        }
        if (getMessagesController().f25400t7.z(a()) && getMessagesController().f25400t7.t(a())) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        o0Var.e(i7);
    }

    @Override
    public final List F() {
        String M0;
        ArrayList arrayList = new ArrayList();
        if (org.telegram.messenger.t3.T(this.f45173e)) {
            arrayList.add(new pg.a(org.telegram.messenger.hd.M0(2131751612, null)));
            int i7 = this.f45117a;
            if (i7 != 1) {
                if (i7 != 2) {
                    M0 = org.telegram.messenger.hd.M0(2131751609, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131751610, null);
                }
            } else {
                M0 = org.telegram.messenger.hd.M0(2131751611, null);
            }
            arrayList.add(new pg.a(org.telegram.messenger.hd.a0(null, null, 2131751608, M0), new uf(this, 17)));
            arrayList.add(new pg.a(org.telegram.messenger.hd.M0(2131751607, null), new uf(this, 18)));
        }
        if (this.f45187f == null) {
            arrayList.add(new pg.a(org.telegram.messenger.hd.M0(2131751617, null)));
            arrayList.add(new pg.a(org.telegram.messenger.hd.M0(2131751616, null), 0.0f, 255.0f, new q0("", 1)));
            arrayList.add(new pg.a(org.telegram.messenger.hd.M0(2131751615, null), 1.0f, 10.0f, new org.telegram.ui.Cells.f2(this)));
        }
        return arrayList;
    }

    public final void F6(org.telegram.messenger.gj gjVar, Integer num) {
        org.telegram.messenger.gj gjVar2 = gjVar.C;
        if (gjVar2 != null) {
            int e12 = gjVar2.e1();
            SparseArray sparseArray = this.H6;
            ArrayList arrayList = (ArrayList) sparseArray.get(e12);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray.put(e12, arrayList);
            }
            int e13 = gjVar.e1();
            if (!arrayList.contains(Integer.valueOf(e13))) {
                arrayList.add(Integer.valueOf(e13));
            }
            if (num.intValue() != 0) {
                arrayList.remove(num);
            }
        }
    }

    public final void F7() {
        if (this.f45278m1 == null) {
            return;
        }
        this.Zc = Q6(false);
        this.f45131ad = Q6(true);
        this.U.setInputBubbleHeight(this.Zc);
        ed();
        Oc();
        B7();
        y7();
        D7();
        C7();
    }

    public final void F8(boolean z10) {
        TLRPC.Chat chat = this.f45173e;
        if (chat != null && this.f45334q8 != null && !org.telegram.messenger.t3.r0(chat) && !this.f45173e.creator) {
            TLRPC.ChatFull chatFull = this.f45334q8;
            long j3 = chatFull.inviterId;
            if (j3 != 0) {
                this.f45339r = j3;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f45339r = chatParticipant.inviter_id;
                    return;
                }
                long e10 = getUserConfig().e();
                int size = this.f45334q8.participants.participants.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.f45334q8.participants.participants.get(i7);
                    if (chatParticipant2.user_id == e10) {
                        this.f45339r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f45339r == 0) {
                getMessagesController().G(this.f45173e.f28051id, false);
            }
        }
    }

    public final void F9(boolean z10) {
        if (this.f45291n3.getTag() != null && !this.f45368t3) {
            if (!this.f45445z3 || this.f45380u3) {
                this.f45291n3.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f45420x3, 0.0f);
                    this.f45407w3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f45407w3.addUpdateListener(new ae(this, 1));
                    this.f45407w3.addListener(new ei(this, 7));
                    this.f45407w3.setStartDelay(this.f45316p3);
                    this.f45407w3.start();
                } else {
                    ValueAnimator valueAnimator = this.f45407w3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f45407w3 = null;
                    }
                    this.f45420x3 = 0.0f;
                    Tc();
                }
                this.f45316p3 = 500;
            }
        }
    }

    public final void Fa(int i7) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.kj kjVar = this.f45409w5;
        if (kjVar != null && this.f45144bb == null) {
            TLRPC.Peer peer = null;
            if (kjVar.f24705c != null) {
                int i10 = this.currentAccount;
                TLRPC.WebPage webPage = this.X5;
                CharSequence fieldText = this.f45118a0.getFieldText();
                org.telegram.messenger.gj gjVar2 = this.E5;
                if (gjVar2 == this.f45281m4) {
                    gjVar = null;
                } else {
                    gjVar = gjVar2;
                }
                kjVar.e(i10, webPage, fieldText, gjVar, this.C5, this.G5);
            }
            if (!this.f45409w5.c()) {
                this.Db = this.f45118a0.f32209h3;
                Context context = this.f45278m1.getContext();
                dh.c cVar = this.P8;
                org.telegram.messenger.kj kjVar2 = this.f45409w5;
                TLRPC.User user = this.f45187f;
                TLRPC.Chat chat = this.f45173e;
                int i11 = this.currentAccount;
                ym ymVar = this.Aa;
                qm qmVar = this.C5;
                if (qmVar != null && qmVar.f50647f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lk lkVar = new lk(this, context, this, cVar, kjVar2, user, chat, i11, ymVar, i7, z10);
                this.f45144bb = lkVar;
                this.f45409w5.f24723x = lkVar;
                TLRPC.ChatFull chatFull = this.f45334q8;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.Da) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.Da.peers.get(0).peer;
                }
                this.f45144bb.setSendAsPeer(peer);
                s7();
                this.f45278m1.addView(this.f45144bb);
                if (this.Db) {
                    qj qjVar = this.f45118a0;
                    qjVar.U0 = true;
                    org.telegram.ui.Components.sf sfVar = qjVar.V0;
                    if (sfVar != null) {
                        sfVar.u(true);
                    }
                    this.f45118a0.K1();
                    this.S3 = true;
                }
                org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void Fb() {
        h6.m[] mVarArr;
        kh.b bVar;
        kh.a aVar;
        org.telegram.ui.Components.sc[] scVarArr;
        ym ymVar = this.Aa;
        if (ymVar != null) {
            ymVar.t();
        }
        oi oiVar = this.f45429y;
        if (oiVar != null) {
            oiVar.d();
        }
        oi oiVar2 = this.f45416x;
        if (oiVar2 != null) {
            oiVar2.d();
        }
        oi oiVar3 = this.E;
        if (oiVar3 != null) {
            oiVar3.d();
        }
        qj qjVar = this.f45118a0;
        if (qjVar != null) {
            qjVar.updateColors();
        }
        fi.p2 p2Var = this.Y1;
        if (p2Var != null) {
            p2Var.P0();
        }
        aj ajVar = this.A0;
        if (ajVar != null) {
            int childCount = ajVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.A0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) childAt).B0(0);
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    ((org.telegram.ui.Cells.t0) childAt).setInvalidateColors(true);
                }
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var = this.f45197f9;
        if (g1Var != null && g1Var.getContentView() != null) {
            View contentView = this.f45197f9.getContentView();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.G8);
            if (!(contentView.getBackground() instanceof ColorDrawable) || ((ColorDrawable) contentView.getBackground()).getColor() != themedColor) {
                contentView.setBackgroundColor(themedColor);
                contentView.invalidate();
            }
        }
        org.telegram.ui.Components.ge0 ge0Var = this.O2;
        if (ge0Var != null) {
            ge0Var.d();
        }
        rj rjVar = this.f45133b0;
        if (rjVar != null && rjVar.getEditView() != null) {
            for (org.telegram.ui.Components.sc scVar : this.f45133b0.getEditView().f38945a) {
                if (scVar != null) {
                    scVar.d();
                }
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f45240j0;
        if (q0Var != null) {
            q0Var.W();
        }
        lj ljVar = this.f45279m2;
        if (ljVar != null) {
            ljVar.updateColors();
        }
        ui uiVar = this.f45314p1;
        if (uiVar != null) {
            uiVar.updateColors();
        }
        ol olVar = this.f45278m1;
        if (olVar != null) {
            olVar.M();
            bi.o2 o2Var = this.f45278m1.M;
            if (o2Var != null) {
                o2Var.invalidate();
            }
        }
        org.telegram.ui.Components.rg rgVar = this.f45134b1;
        if (rgVar != null) {
            fh.g gVar = rgVar.f38965s;
            if (gVar != null) {
                gVar.updateColors();
            }
            Color.alpha(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
            rgVar.invalidate();
        }
        org.telegram.ui.Components.rw0 rw0Var = this.f45355s1;
        if (rw0Var != null) {
            rw0Var.updateColors();
        }
        ui uiVar2 = this.f45314p1;
        if (uiVar2 != null && uiVar2.getTimeItem() != null) {
            this.f45314p1.getTimeItem().invalidate();
        }
        jh.f fVar = this.U;
        if (fVar != null) {
            fVar.updateColors();
        }
        lh.h hVar = this.f45431y1;
        if (hVar != null) {
            for (h6.m mVar : hVar.f19519e) {
                if (mVar != null && (aVar = (bVar = (kh.b) mVar.f13624b).f18168b) != null) {
                    aVar.updateColors();
                    bVar.invalidate();
                }
            }
        }
        uj ujVar = this.f45162d1;
        if (ujVar != null) {
            ujVar.updateColors();
        }
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
        this.f45278m1.invalidate();
        Iterator it2 = this.F.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void Fc() {
        org.telegram.ui.Components.nz nzVar = this.I9;
        if (nzVar != null && !nzVar.f37763c) {
            nzVar.c(false);
            try {
                this.I9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public final void Fd(org.telegram.messenger.a20 a20Var) {
        int i7;
        int i10;
        aj ajVar = this.A0;
        if (ajVar != null) {
            if (!this.Q4 && this.f45126a8 != null) {
                int childCount = ajVar.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = this.A0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.messenger.gj messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        org.telegram.messenger.gj gjVar = this.f45126a8;
                        if (messageObject == gjVar) {
                            ArrayList arrayList = this.L6;
                            if (arrayList.indexOf(gjVar) >= 0) {
                                i7 = arrayList.indexOf(this.f45126a8) + this.D0.K;
                                i10 = h9(childAt);
                            }
                        }
                    }
                    i11++;
                }
            }
            i7 = -1;
            i10 = 0;
            int childCount2 = this.A0.getChildCount();
            qj qjVar = this.f45118a0;
            if (qjVar != null) {
                qjVar.getEditingMessageObject();
            }
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = this.A0.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt2;
                    org.telegram.messenger.gj messageObject2 = q1Var.getMessageObject();
                    if (((Boolean) a20Var.a(messageObject2)).booleanValue()) {
                        messageObject2.M1 = true;
                        q1Var.x3(messageObject2, q1Var.getCurrentMessagesGroup(), q1Var.I2(), q1Var.J2(), q1Var.A2(), q1Var.E2());
                        jl jlVar = this.D0;
                        this.A0.getClass();
                        jlVar.Q(RecyclerView.R(q1Var));
                    }
                }
            }
            if (i7 != -1) {
                this.C0.h1(i7, i10);
            }
        }
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        boolean z10;
        int i10;
        int i11;
        if (i7 == 0) {
            va();
            return;
        }
        boolean z11 = true;
        int i12 = 4;
        int i13 = 0;
        if (i7 == 1) {
            View view = this.V;
            if (view != null) {
                view.setAlpha(f10);
                View view2 = this.V;
                if (f10 > 0.0f) {
                    i12 = 0;
                }
                view2.setVisibility(i12);
            }
        } else if (i7 == 2) {
            va();
            H7();
            sh.b bVar = this.f45252jd;
            if (bVar != null) {
                bVar.setAnimatedVisibility(this.f45172dd.f57081e);
            }
        } else {
            int i14 = 8;
            if (i7 == 3) {
                te.a aVar = this.f45186ed;
                float f12 = 1.0f - aVar.f57081e;
                this.f45134b1.setAlpha(f12);
                org.telegram.ui.Components.rg rgVar = this.f45134b1;
                if (f12 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                rgVar.setVisibility(i11);
                float f13 = 1.0f - aVar.f57081e;
                org.telegram.ui.Components.p11 p11Var = this.f45202g2;
                if (p11Var != null) {
                    p11Var.setAlpha(f13);
                    org.telegram.ui.Components.p11 p11Var2 = this.f45202g2;
                    if (f13 <= 0.0f) {
                        i13 = 8;
                    }
                    p11Var2.setVisibility(i13);
                }
            } else if (i7 == 4) {
                bi.g2 g2Var = this.Z3;
                te.a aVar2 = this.f45199fd;
                if (g2Var != null) {
                    float f14 = aVar2.f57081e;
                    g2Var.setAlpha(f14);
                    bi.g2 g2Var2 = this.Z3;
                    if (f14 > 0.0f) {
                        i14 = 0;
                    }
                    g2Var2.setVisibility(i14);
                }
                if (aVar2.f57081e < 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lh.f fVar = this.Z;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                fVar.setVisibility(i10);
                A7();
                if (aVar2.f57081e >= 1.0f) {
                    z11 = false;
                }
                aj ajVar = this.A0;
                if (z11) {
                    i12 = 0;
                }
                ajVar.setVisibility(i12);
                H7();
                K7();
                J7();
                this.glassEngine.g();
            } else if (i7 == 5) {
                z7();
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.setSearchFactor(f10);
                }
            } else if (i7 == 6) {
                E7();
            }
        }
    }

    public final void G6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.G6():void");
    }

    public final void G7() {
        int i7;
        an anVar = this.f45452za;
        if (anVar != null) {
            anVar.G7();
        }
        int L = org.telegram.messenger.g0.L(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23603m + ((int) s9(org.telegram.messenger.g0.L(7.0f)));
        ak akVar = this.D1;
        if (akVar != null) {
            i7 = org.telegram.messenger.g0.L(akVar.F * 35.0f);
        } else {
            i7 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(V8() * 43.0f) + L + i7;
        int L3 = org.telegram.messenger.g0.L(60.0f) + ((int) this.f45403w.d());
        di.c1 c1Var = this.f45122a4;
        if (c1Var != null) {
            c1Var.setPadding(0, L2, 0, L3);
        }
        org.telegram.ui.Components.w20 w20Var = this.I1;
        if (w20Var != null) {
            w20Var.f41234e.setPadding(0, L2, 0, L3);
            w20Var.d.setTranslationY((L2 - L3) / 2.0f);
        }
        bi.g2 g2Var = this.Z3;
        if (g2Var != null) {
            lh.f fVar = (lh.f) g2Var.f3545b;
            fVar.setFadeZoneTop(L2);
            fVar.setFadeZoneBottom(L3);
        }
        org.telegram.ui.Components.pz pzVar = this.f45342r2;
        if (pzVar != null) {
            pzVar.setTranslationY(L2);
        }
        org.telegram.ui.Components.cv0 cv0Var = this.f45356s2;
        if (cv0Var != null) {
            cv0Var.f33704a.setTranslationY(((L2 - L3) / 2.0f) + org.telegram.messenger.g0.L(32.0f));
        }
    }

    public final void G8(org.telegram.messenger.gj r75, java.util.ArrayList r76, java.util.ArrayList r77, java.util.ArrayList r78) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.G8(org.telegram.messenger.gj, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void G9(boolean z10) {
        if (!z10) {
            hi.l3 l3Var = this.B2;
            if (l3Var != null) {
                l3Var.f(true);
            }
            hi.l3 l3Var2 = this.f45392v2;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
            hi.l3 l3Var3 = this.f45419x2;
            if (l3Var3 != null) {
                l3Var3.f(true);
            }
        }
        hi.l3 l3Var4 = this.A2;
        if (l3Var4 != null) {
            l3Var4.f(true);
        }
        hi.l3 l3Var5 = this.f45444z2;
        if (l3Var5 != null) {
            l3Var5.f(true);
        }
        hi.l3 l3Var6 = this.I2;
        if (l3Var6 != null) {
            l3Var6.f(true);
        }
        hi.l3 l3Var7 = this.J2;
        if (l3Var7 != null) {
            l3Var7.f(true);
        }
        hi.l3 l3Var8 = this.C2;
        if (l3Var8 != null) {
            l3Var8.f(true);
        }
        hi.l3 l3Var9 = this.D2;
        if (l3Var9 != null) {
            l3Var9.f(true);
        }
        org.telegram.ui.Components.ip ipVar = this.K2;
        if (ipVar != null) {
            ipVar.f(true);
        }
        hi.l3 l3Var10 = this.Y0;
        if (l3Var10 != null) {
            l3Var10.f(true);
        }
        hi.l3 l3Var11 = this.f45119a1;
        if (l3Var11 != null) {
            l3Var11.f(true);
        }
        hi.l3 l3Var12 = this.Z0;
        if (l3Var12 != null) {
            l3Var12.f(true);
        }
    }

    public final void Ga(String str, boolean z10) {
        boolean z11;
        nj njVar;
        boolean z12;
        org.telegram.ui.ActionBar.q0 q0Var;
        int i7;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                d8();
                hi.l3 l3Var = this.K1;
                if (l3Var != null && l3Var.W) {
                    l3Var.f(true);
                    z11 = true;
                } else {
                    z11 = false;
                }
                hi.l3 l3Var2 = this.L1;
                if (l3Var2 != null && l3Var2.W) {
                    l3Var2.f(true);
                    z11 = true;
                }
                if (z11) {
                    org.telegram.messenger.g0.i3(new ee(this, str, 7), 200L);
                    return;
                }
                this.J3 = str;
                this.I3 = str;
                boolean contains = str.contains("@");
                g7(true);
                if (!this.actionBar.f29304o0) {
                    this.f45213gd.a(true, true);
                    org.telegram.ui.ActionBar.q0 q0Var2 = this.f45240j0;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar = this.f45200g0;
                    if (xVar != null) {
                        xVar.e(8);
                    }
                    er erVar = this.f45188f0;
                    if (erVar != null) {
                        erVar.b(false);
                    }
                    if ((this.f45358s4 == 0 || (i7 = this.f45204g4) == 3 || i7 == 8) && (q0Var = this.f45253k0) != null) {
                        q0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var3 = this.f45313p0;
                    if (q0Var3 != null && this.f45210ga) {
                        q0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar2 = this.f45326q0;
                    if (xVar2 != null && this.f45223ha) {
                        xVar2.e(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var4 = this.f45266l0;
                    if (q0Var4 != null) {
                        q0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var5 = this.m0;
                    if (q0Var5 != null) {
                        q0Var5.setVisibility(8);
                    }
                    this.f45340r0 = true;
                    nd(0, 0, -1);
                    Pc(false);
                }
                ak akVar = this.D1;
                if (akVar != null) {
                    if (akVar.F > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        akVar.g(false);
                    }
                }
                ImageView imageView = this.f45230i3;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!org.telegram.messenger.t3.V(this.f45173e) || !org.telegram.messenger.t3.t0(this.f45173e) || this.J3 == null)) {
                    this.G1 = 0;
                } else {
                    this.G1 = 2;
                }
                this.f45244j5 = false;
                if (this.f45164d4 == 3) {
                    org.telegram.messenger.na.a(this.currentAccount).b(3).a();
                } else {
                    org.telegram.messenger.na a10 = org.telegram.messenger.na.a(this.currentAccount);
                    a10.f25177b.a();
                    a10.f25178c.a();
                }
                hi.i1 i1Var = this.F1;
                if (i1Var != null) {
                    i1Var.h.clear();
                }
                org.telegram.ui.ActionBar.q0 q0Var6 = this.f45253k0;
                if (q0Var6 != null) {
                    this.Jc = true;
                    q0Var6.G(false);
                    this.Jc = false;
                }
                org.telegram.ui.ActionBar.q0 q0Var7 = this.f45253k0;
                if (q0Var7 != null) {
                    q0Var7.setSearchFieldCaption(null);
                    this.f45253k0.Q(str, false);
                    this.f45253k0.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745763, null));
                }
                getMediaDataController().X1(this.I3, this.f45259k6, this.f45154c7, this.classGuid, 0, this.f45358s4, false, this.D3, this.E3, false, this.F3);
                gd(0, true);
                this.f45356s2.e(true, true);
                sc(true);
                nj njVar2 = this.E1;
                if (njVar2 != null) {
                    njVar2.b(!contains);
                    pd();
                }
                if ((contains || z10) && this.J3 != null && (njVar = this.E1) != null) {
                    int currentPosition = njVar.f37329a.getCurrentPosition();
                    int i10 = this.G1;
                    if (currentPosition != i10) {
                        this.E1.f37329a.d(i10, i10);
                    }
                }
                org.telegram.messenger.na.a(this.currentAccount).c(this.J3);
                this.I1.f41235f.O(true);
                View currentView = this.F1.getCurrentView();
                if (currentView instanceof cn) {
                    ((cn) currentView).f46216a.rd(this.J3);
                }
            }
        }
    }

    public final void Gb(TLRPC.Document document) {
        String V;
        if (document == null || (V = org.telegram.messenger.gj.V(document, null, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f28057id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = V.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        org.telegram.messenger.cz b10 = org.telegram.messenger.cz.b(V, this.f45259k6, this.E5, this.f45281m4, null, false, arrayList, null, null, true, 0, 0, null, false);
        b10.K = Y8();
        org.telegram.messenger.ez.C(this.currentAccount).r0(b10);
        L6();
    }

    public final void Gc() {
        long j3;
        yd ydVar = this.f45273l8;
        if (ydVar != null) {
            org.telegram.messenger.g0.r(ydVar);
        }
        yd ydVar2 = new yd(this, 18);
        this.f45273l8 = ydVar2;
        if (this.f45208g8 != null) {
            j3 = 2500;
        } else {
            j3 = 1000;
        }
        org.telegram.messenger.g0.i3(ydVar2, j3);
    }

    public final void Gd(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Gd(boolean):void");
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void H6(org.telegram.messenger.gj gjVar, org.telegram.messenger.gj gjVar2) {
        long D1 = gjVar.D1();
        if (D1 != 0) {
            a0.h hVar = this.N6;
            ArrayList arrayList = (ArrayList) hVar.f(D1);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.k5.i(hVar, D1);
            }
            arrayList.add(gjVar);
            if (gjVar2 != null) {
                arrayList.remove(gjVar2);
            }
        }
    }

    public final void H7() {
        int i7;
        float f10 = (1.0f - this.f45199fd.f57081e) * (1.0f - this.f45172dd.f57081e);
        this.f45431y1.setTranslationX((1.0f - f10) * org.telegram.messenger.g0.L(80.0f));
        this.f45431y1.setAlpha(f10);
        lh.h hVar = this.f45431y1;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        hVar.setVisibility(i7);
    }

    public final int H8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.H8():int");
    }

    public final void H9() {
        ValueAnimator valueAnimator = this.Fb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.t0 t0Var = this.f45304o3;
        if (t0Var != null && t0Var.getTag() != null) {
            this.f45304o3.setTag(null);
            org.telegram.ui.Cells.t0 t0Var2 = this.f45304o3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new re(this, t0Var2, 1));
            ofFloat.addListener(new ah.l(16, this, t0Var2));
            ofFloat.setDuration(150L);
            this.Fb = ofFloat;
            ofFloat.start();
        }
    }

    public final boolean Ha(String str, org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, int i7, int i10) {
        jg.o1 o1Var;
        boolean z10;
        Integer num;
        int parseInt;
        int i11;
        Integer num2;
        TLRPC.TL_forumTopic f10;
        if (this.f45173e == null || str == null || this.f45204g4 != 0) {
            return false;
        }
        if (q1Var != null && (characterStyle != null || i10 != 1)) {
            o1Var = new jg.o1(this, i7, i10, characterStyle, q1Var);
        } else {
            o1Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (org.telegram.messenger.t3.K(this.f45173e, false) != null) {
                try {
                    if (f45111od == null) {
                        f45111od = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        f45112pd = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = f45111od.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z10 = false;
                        try {
                            if (org.telegram.messenger.t3.O(matcher.group(2), this.f45173e)) {
                                Uri parse = Uri.parse(str);
                                int intValue = Utilities.z(parse.getQueryParameter("thread")).intValue();
                                int intValue2 = Utilities.z(parse.getQueryParameter("comment")).intValue();
                                String queryParameter = parse.getQueryParameter("task");
                                if (queryParameter != null) {
                                    num = Utilities.z(queryParameter);
                                } else {
                                    num = null;
                                }
                                byte[] g10 = sh.d.g(parse);
                                if (intValue == 0 && intValue2 == 0) {
                                    if (matcher.group(4) != null) {
                                        int parseInt2 = Integer.parseInt(matcher.group(3));
                                        parseInt = Integer.parseInt(matcher.group(4));
                                        i11 = parseInt2;
                                    } else {
                                        parseInt = Integer.parseInt(matcher.group(3));
                                        i11 = 0;
                                    }
                                    if (org.telegram.messenger.t3.c0(this.f45173e) && i11 != b()) {
                                        return false;
                                    }
                                    this.K7 = true;
                                    if (this.f45204g4 == 2) {
                                        this.f45286m9.P0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int V = LaunchActivity.V(parse);
                                    this.P7 = V;
                                    if (V >= 0) {
                                        this.Q7 = parseInt;
                                    }
                                    Bb(parseInt, i7, true, 0, false, 0, num, g10, o1Var);
                                    return true;
                                }
                                return false;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            org.telegram.messenger.a8.g(e, true);
                            return z10;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!str.startsWith("tg:resolve") && !str.startsWith("tg://resolve")) {
                        Matcher matcher2 = f45112pd.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3)) {
                                if (org.telegram.messenger.t3.O(matcher2.group(2), this.f45173e)) {
                                    String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                        this.f45425x8 = queryParameter2;
                                        d7(true);
                                        return true;
                                    }
                                    return z10;
                                }
                                return z10;
                            }
                            return z10;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return z10;
                        }
                    }
                    Uri parse2 = Uri.parse(str.replace("tg:resolve", "tg://telegram.org").replace("tg://resolve", "tg://telegram.org"));
                    String lowerCase = parse2.getQueryParameter("domain").toLowerCase();
                    int intValue3 = Utilities.z(parse2.getQueryParameter("post")).intValue();
                    int intValue4 = Utilities.z(parse2.getQueryParameter("thread")).intValue();
                    int intValue5 = Utilities.z(parse2.getQueryParameter("comment")).intValue();
                    if (org.telegram.messenger.t3.O(lowerCase, this.f45173e) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.f45204g4 == 2) {
                            this.f45286m9.P0(intValue3);
                            finishFragment();
                            return true;
                        }
                        Bb(intValue3, i7, true, 0, false, 0, null, null, o1Var);
                        return true;
                    }
                    return z10;
                } catch (Exception e12) {
                    e = e12;
                    z10 = false;
                }
            } else {
                try {
                    if (f45113qd == null) {
                        f45113qd = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = f45113qd.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.f45173e.f28051id || parseInt3 == 0) {
                        return false;
                    }
                    Uri parse3 = Uri.parse(str);
                    int intValue6 = Utilities.z(parse3.getQueryParameter("thread")).intValue();
                    int intValue7 = Utilities.z(parse3.getQueryParameter("topic")).intValue();
                    int intValue8 = Utilities.z(parse3.getQueryParameter("comment")).intValue();
                    String queryParameter3 = parse3.getQueryParameter("task");
                    if (queryParameter3 != null) {
                        num2 = Utilities.z(queryParameter3);
                    } else {
                        num2 = null;
                    }
                    byte[] g11 = sh.d.g(parse3);
                    if (intValue6 == 0 && intValue7 == 0 && intValue8 == 0) {
                        if (org.telegram.messenger.t3.c0(this.f45173e) && (f10 = getMessagesController().f25383r7.f(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.f45344r4;
                            if (tL_forumTopic == null || tL_forumTopic.f28103id != f10.f28103id) {
                                return false;
                            }
                            return true;
                        }
                        this.K7 = true;
                        if (this.f45204g4 == 2) {
                            this.f45286m9.P0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        Bb(parseInt3, i7, true, 0, false, 0, num2, g11, o1Var);
                        return true;
                    }
                    return false;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return false;
                }
            }
        } else {
            Uri parse4 = Uri.parse(str.replace("tg:privatepost", "tg://telegram.org").replace("tg://privatepost", "tg://telegram.org"));
            int intValue9 = Utilities.z(parse4.getQueryParameter("post")).intValue();
            long longValue = Utilities.A(parse4.getQueryParameter("channel")).longValue();
            int intValue10 = Utilities.z(parse4.getQueryParameter("thread")).intValue();
            long j3 = this.f45173e.f28051id;
            if (longValue != j3 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                Da(j3, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.K7 = true;
            if (this.f45204g4 == 2) {
                this.f45286m9.P0(intValue9);
                finishFragment();
                return true;
            }
            Bb(intValue9, i7, true, 0, false, 0, null, null, o1Var);
            return true;
        }
    }

    public final void Hb(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7, long j3) {
        long j10;
        String str;
        jj jjVar = this.X1;
        if (jjVar == null) {
            return;
        }
        TLRPC.User user = jjVar.getAdapter().f17147x0;
        if (user != null) {
            j10 = user.f28200id;
        } else {
            j10 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f28049id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j10);
        TLRPC.User user2 = this.X1.getAdapter().f17147x0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        org.telegram.messenger.c accountInstance = getAccountInstance();
        long j11 = this.f45259k6;
        org.telegram.messenger.gj gjVar = this.E5;
        org.telegram.messenger.gj gjVar2 = this.f45281m4;
        qm qmVar = this.C5;
        org.telegram.messenger.ez.S(i7, j11, j3, j9(), hashMap, accountInstance, gjVar, gjVar2, Y8(), botInlineResult, null, this, qmVar, z10);
        this.f45118a0.setFieldText("");
        D9(false);
        getMediaDataController().v0(j10, false);
    }

    public final void Hc() {
        org.telegram.messenger.g0.d0(this.A0, new di.t7(5, this, Q9()));
    }

    public final void I6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.a9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.f45173e, this.f45187f, null, this.f45259k6, this.Ra, this.Qa);
    }

    public final void I7() {
        an anVar = this.f45452za;
        if (anVar != null) {
            anVar.I7();
        }
        float f10 = 0.0f;
        if (!this.f45276lb) {
            f10 = org.telegram.messenger.g0.L(1.0f) + this.actionBar.getMeasuredHeight() + 0.0f;
        }
        float s9 = s9(org.telegram.messenger.g0.L(7.0f)) + f10;
        if (this.f45202g2 != null) {
            s9 += t9(org.telegram.ui.Components.l11.f36700a);
        }
        if (this.D1 != null) {
            s9 += org.telegram.messenger.g0.L(35.0f) * this.D1.F;
        }
        this.Z.setFadeZoneTop((int) ((V8() * org.telegram.messenger.g0.L(43.0f)) + s9));
    }

    public final boolean I9(boolean z10) {
        nk nkVar;
        nk nkVar2 = this.M2;
        if (nkVar2 == null || nkVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.rg rgVar = this.f45134b1;
        if (rgVar != null && (nkVar = this.M2) != null) {
            rgVar.i(nkVar, false, z10);
        }
        int i7 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = this.W2;
            if (i7 < animatorSetArr.length) {
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[i7] = null;
                }
                i7++;
            } else {
                this.P2 = false;
                this.M2.setTag(1);
                return true;
            }
        }
    }

    public final void Ia(org.telegram.messenger.gj gjVar) {
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = gjVar.f23817k.peer_id;
        long j3 = peer.channel_id;
        if (j3 != 0) {
            bundle.putLong("chat_id", j3);
        } else {
            long j10 = peer.chat_id;
            if (j10 != 0) {
                bundle.putLong("chat_id", j10);
            } else {
                long j11 = peer.user_id;
                if (j11 != 0) {
                    bundle.putLong("user_id", j11);
                }
            }
        }
        bundle.putInt("message_id", gjVar.L1());
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new an(bundle));
        }
    }

    public final void Ib(ClipData clipData, boolean z10, int i7) {
        int i10 = 0;
        if (this.G5 != null) {
            while (i10 < clipData.getItemCount()) {
                Uri uri = clipData.getItemAt(i10).getUri();
                if (uri != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(uri);
                    Mb(i7, arrayList, z10);
                }
                i10++;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        while (i10 < clipData.getItemCount()) {
            Uri uri2 = clipData.getItemAt(i10).getUri();
            if (uri2 != null) {
                arrayList2.add(uri2);
            }
            i10++;
        }
        Mb(i7, arrayList2, z10);
    }

    public final void Ic(boolean z10) {
        if (!getMessagesController().r2(this.f45259k6, b(), null)) {
            if (z10) {
                getNotificationsController().G(this.f45259k6, b(), true);
                return;
            }
            org.telegram.ui.ActionBar.u2 C = org.telegram.ui.Components.t4.C(this.f45259k6, b(), this, this.Aa);
            boolean V9 = V9();
            C.f29700i0 = V9;
            C.f29707n = V9;
            showDialog(C);
            return;
        }
        getNotificationsController().G(this.f45259k6, b(), false);
        if (!z10) {
            org.telegram.ui.Components.cc.z(this, 4, 0, this.Aa).j();
        }
    }

    public final void J6(org.telegram.messenger.gj gjVar, boolean z10) {
        K6(gjVar, z10, true);
    }

    public final void J7() {
        if (this.f45134b1 != null) {
            this.f45134b1.setPadding(org.telegram.messenger.g0.L(7.0f) + ((int) ((1.0f - V8()) * (1.0f - this.f45199fd.f57081e) * n9())), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final org.telegram.ui.Cells.z J8(int i7, boolean z10) {
        org.telegram.messenger.gj messageObject;
        aj ajVar = this.A0;
        if (ajVar != null) {
            int childCount = ajVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.A0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    messageObject = ((org.telegram.ui.Cells.t0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.e1() == i7) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.O9 - this.Q9) - org.telegram.messenger.g0.L(4.0f) || childAt.getY() > this.A0.getMeasuredHeight() - this.Xa) {
                            return null;
                        }
                    }
                    return (org.telegram.ui.Cells.z) childAt;
                }
            }
            return null;
        }
        return null;
    }

    public final void J9() {
        hk hkVar = this.Ab;
        if (hkVar == null) {
            return;
        }
        this.Ab = null;
        hkVar.e();
        if (hkVar.getReactionsWindow() != null && hkVar.getReactionsWindow().f5008a != null) {
            hkVar.getReactionsWindow().f5008a.animate().alpha(0.0f).setDuration(180L).start();
        }
        hkVar.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new zg(3, this, hkVar)).setDuration(180L).start();
    }

    public final void Ja(org.telegram.messenger.gj gjVar) {
        if (org.telegram.messenger.q10.B(this.f45187f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = gjVar.f23817k.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f45187f.f28200id) {
                l(messageFwdHeader.saved_from_msg_id, gjVar.e1(), true, 0, true, 0);
                return;
            }
        }
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = gjVar.f23817k.fwd_from.saved_from_peer;
        long j3 = peer.channel_id;
        if (j3 != 0) {
            bundle.putLong("chat_id", j3);
        } else {
            long j10 = peer.chat_id;
            if (j10 != 0) {
                bundle.putLong("chat_id", j10);
            } else {
                long j11 = peer.user_id;
                if (j11 != 0) {
                    bundle.putLong("user_id", j11);
                }
            }
        }
        bundle.putInt("message_id", gjVar.f23817k.fwd_from.saved_from_msg_id);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new an(bundle));
        }
    }

    public final void Jb(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
        long j10;
        if (u7()) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.messenger.cz b10 = org.telegram.messenger.cz.b(str, this.f45259k6, null, null, null, true, null, null, null, true, 0, 0, null, false);
                b10.K = Y8();
                b10.O = j3;
                b10.L = z11;
                b10.Q = 0L;
                b10.R = j9();
                b10.T = this.f45422x5;
                org.telegram.messenger.ez.C(this.currentAccount).r0(b10);
                j10 = 0;
            } else {
                j10 = j3;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.messenger.cz g10 = org.telegram.messenger.cz.g((TLRPC.User) obj, this.f45259k6, null, null, null, null, z10, i7, 0);
                g10.K = Y8();
                g10.O = j10;
                g10.L = z11;
                g10.Q = 0L;
                g10.R = j9();
                g10.T = this.f45422x5;
                getSendMessagesHelper().r0(g10);
                j10 = 0;
            }
            L6();
        }
    }

    public final void Jc(org.telegram.ui.ActionBar.o0 o0Var, boolean z10) {
        Set set;
        if (o0Var != null) {
            if (z10) {
                set = this.V0;
            } else {
                set = this.U0;
            }
            set.add(o0Var);
        }
    }

    @Override
    public final boolean K() {
        return this.f45450z8;
    }

    public final void K6(org.telegram.messenger.gj r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.K6(org.telegram.messenger.gj, boolean, boolean):void");
    }

    public final void K7() {
        float f10 = this.S9;
        ak akVar = this.D1;
        if (akVar != null) {
            akVar.setTranslationY(f10);
            f10 += org.telegram.messenger.g0.L(35.0f) * this.D1.F;
        }
        nj njVar = this.E1;
        if (njVar != null) {
            njVar.setTranslationY(f10);
        }
        float V8 = (V8() * org.telegram.messenger.g0.L(43.0f)) + f10;
        org.telegram.ui.Components.p11 p11Var = this.f45202g2;
        org.telegram.ui.Components.l11 l11Var = org.telegram.ui.Components.l11.f36700a;
        if (p11Var != null) {
            p11Var.setSideMenuBackgroundMarginTop((V8() * s9(org.telegram.messenger.g0.L(7.0f))) + V8);
            float t92 = t9(l11Var);
            float a10 = a8.m7.a(this.f45199fd.f57081e);
            float V82 = V8();
            V8 += a8.m7.a(Math.min(c8.i9.a(a8.m7.a(a10), 0.0f, 1.0f), c8.i9.a(a8.m7.a(V82), 0.0f, 1.0f))) * t92;
        }
        org.telegram.ui.Components.rg rgVar = this.f45134b1;
        if (rgVar != null) {
            rgVar.setTranslationY((V8 - org.telegram.messenger.g0.L(5.0f)) - (V8() * t9(l11Var)));
        }
    }

    public final org.telegram.ui.Cells.t0 K8(TL_wallet.walletTransaction wallettransaction) {
        if (this.A0 != null && this.D0 != null) {
            for (int i7 = 0; i7 < this.A0.getChildCount(); i7++) {
                View childAt = this.A0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    if (org.telegram.ui.Wallet.l0.I(t0Var.getMessageObject(), wallettransaction)) {
                        return t0Var;
                    }
                }
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.L6;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (org.telegram.ui.Wallet.l0.I((org.telegram.messenger.gj) arrayList.get(i10), wallettransaction)) {
                    this.A0.C0();
                    this.C0.h1(this.D0.K + i10, 0);
                    return null;
                } else {
                    i10++;
                }
            }
        }
        return null;
    }

    public final void K9() {
        UndoView undoView = this.N3;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.xb xbVar = this.P3;
        if (xbVar != null) {
            xbVar.c(0L, false);
        }
        mk mkVar = this.O3;
        if (mkVar != null) {
            mkVar.d(0, true);
        }
    }

    public final void Ka(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.gj gjVar) {
        org.telegram.ui.Cells.q1 q1Var2;
        boolean z10;
        long j3;
        long j10;
        org.telegram.ui.Components.t5 m10;
        Bitmap m11;
        if (q1Var == null) {
            int childCount = this.A0.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.A0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var2.getMessageObject().T(gjVar)) {
                        break;
                    }
                }
            }
        }
        q1Var2 = q1Var;
        if (org.telegram.messenger.gj.L4(gjVar.f23817k)) {
            Lb(gjVar, true);
        }
        if (org.telegram.messenger.gj.L4(gjVar.f23817k) && !gjVar.D2(true) && org.telegram.messenger.gz.B0 && gjVar.B() && !org.telegram.messenger.m5.C(org.telegram.messenger.gj.B0(gjVar.f23817k)) && !gjVar.f23876z0 && !gjVar.f23872y0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.messenger.w7 fileLoader = getFileLoader();
            TLRPC.Document F0 = gjVar.F0();
            fileLoader.getClass();
            org.telegram.messenger.w7.K.c(new org.telegram.messenger.mg(fileLoader, F0, gjVar, 22));
        }
        PhotoViewer.p1().I2(null, this, this.Aa);
        org.telegram.messenger.gj gjVar2 = MediaController.B().f22377v0;
        if (q1Var2 != null && gjVar2 != null && org.telegram.messenger.gj.L4(gjVar2.f23817k)) {
            getFileLoader().c0(gjVar2.F0(), false);
            if (gjVar2.T(gjVar) && (m10 = q1Var2.getPhotoImage().m()) != null && this.L8 != null && this.I8.getTag() != null && (m11 = m10.m()) != null) {
                try {
                    Bitmap bitmap = this.L8.getBitmap(m11.getWidth(), m11.getHeight());
                    new Canvas(m11).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            MediaController.B().q(true, true, false, gjVar2.T(gjVar));
        }
        if (this.f45204g4 == 1 && (org.telegram.messenger.gj.L4(gjVar.f23817k) || gjVar.D == 1)) {
            PhotoViewer.p1().f42817l4 = this;
            ArrayList arrayList = new ArrayList();
            int size = this.L6.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) this.L6.get(i10);
                if (org.telegram.messenger.gj.L4(gjVar3.f23817k) || gjVar3.D == 1) {
                    arrayList.add(0, gjVar3);
                }
            }
            PhotoViewer.p1().a2(arrayList, arrayList.indexOf(gjVar), this.f45259k6, 0L, b(), this.f45158cb);
        } else {
            PhotoViewer p12 = PhotoViewer.p1();
            int i11 = gjVar.D;
            long j11 = 0;
            if (i11 != 0) {
                j3 = this.f45259k6;
            } else {
                j3 = 0;
            }
            if (i11 != 0) {
                j10 = this.f45154c7;
            } else {
                j10 = 0;
            }
            if (i11 != 0) {
                j11 = b();
            }
            if (!p12.e2(gjVar, this, j3, j10, j11, this.f45158cb) && z10) {
                getFileLoader().f(gjVar.F0());
            }
        }
        G9(false);
        MediaController.B().f22380w0 = null;
    }

    public final void Kb(int i7, ArrayList arrayList, boolean z10, boolean z11) {
        String str;
        String str2;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                ?? obj2 = new Object();
                if (!ffVar.f27708b && (str2 = ffVar.h) != null) {
                    obj2.f23189c = str2;
                } else {
                    String str3 = ffVar.I;
                    if (str3 != null) {
                        obj2.f23189c = str3;
                    }
                }
                obj2.f23190e = ffVar.f27709c;
                obj2.f23191f = ffVar.f27712g;
                obj2.f23200p = ffVar.d();
                obj2.f23199o = ffVar.f27708b;
                obj2.f23201q = ffVar.j();
                obj2.f23209z = ffVar.f27717m;
                obj2.A = ffVar.P;
                CharSequence charSequence = ffVar.f27707a;
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                obj2.d = str;
                obj2.f23193i = ffVar.f27718n;
                obj2.f23194j = ffVar.f27722r;
                obj2.h = ffVar.f27727x;
                obj2.f23195k = ffVar.f27723s;
                obj2.f23202r = ffVar.L;
                obj2.f23207x = ffVar.c();
                arrayList2.add(obj2);
                ffVar.e();
            }
            D8(((org.telegram.messenger.dz) arrayList2.get(0)).d, ((org.telegram.messenger.dz) arrayList2.get(0)).f23193i);
            org.telegram.messenger.ez.X(getAccountInstance(), arrayList2, this.f45259k6, this.E5, this.f45281m4, null, this.C5, z11, true, null, null, z10, i7, 0, ((org.telegram.messenger.dz) arrayList2.get(0)).f23204t, null, Y8(), 0L, false, 0L, j9(), this.f45422x5, null, false);
            L6();
            qj qjVar = this.f45118a0;
            if (qjVar != null) {
                qjVar.setFieldText("");
            }
        }
        if (i7 != 0) {
            if (this.f45218h4 == -1) {
                this.f45218h4 = 0;
            }
            this.f45218h4 = arrayList.size() + this.f45218h4;
            md(true);
        }
    }

    public final void Kc(org.telegram.messenger.gj gjVar) {
        if (gjVar == null) {
            return;
        }
        org.telegram.ui.Components.xb xbVar = this.P3;
        if (xbVar != null) {
            xbVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f45382u5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(gjVar.e1()));
        int i7 = this.f45165d5;
        getNotificationCenter().k(org.telegram.messenger.ns.f25573t0, Long.valueOf(this.f45259k6), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.f45165d5 - 1), Boolean.valueOf(this.f45193f5));
        this.P3 = org.telegram.ui.Components.cc.B(this, false, new ci.p0(this, arrayList2, arrayList, i7, 17), new fe(this, gjVar, 6), this.Aa).j();
    }

    public final void L6() {
        this.f45422x5 = null;
        if (this.f45358s4 == 0 || this.f45408w4) {
            if (this.f45408w4) {
                this.E5 = this.f45281m4;
            } else {
                this.E5 = null;
            }
            this.C5 = null;
            qj qjVar = this.f45118a0;
            if (qjVar != null) {
                qjVar.C1(null, null, null);
            }
        }
        D9(false);
        if (this.f45204g4 == 0) {
            getMediaDataController().D(this.f45259k6, this.f45358s4, true);
        }
    }

    public final void L7() {
        ArrayList arrayList;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i7;
        org.telegram.messenger.gj gjVar;
        TLRPC.MessageReplies messageReplies;
        int indexOf;
        SparseArray sparseArray = this.M6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            int i10 = 0;
            a0.h hVar = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (true) {
                arrayList = this.L6;
                if (i11 >= size) {
                    break;
                }
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) sparseArray.valueAt(i11);
                if (gjVar2.C != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(gjVar2.f23817k.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = gjVar2.C.f23817k.fwd_from) != null && org.telegram.messenger.gj.B1(messageFwdHeader.saved_from_peer) == this.f45259k6 && (i7 = gjVar2.C.f23817k.fwd_from.channel_post) != 0 && (gjVar = (org.telegram.messenger.gj) this.F6[i10].get(i7)) != null && (messageReplies = gjVar.f23817k.replies) != null) {
                        messageReplies.replies++;
                        gjVar.f23819k1 = true;
                        TLRPC.Message message = gjVar2.f23817k;
                        TLRPC.Peer peer = message.from_id;
                        if (peer == null) {
                            peer = message.peer_id;
                        }
                        int size2 = messageReplies.recent_repliers.size();
                        int i12 = i10;
                        while (true) {
                            if (i12 >= size2) {
                                break;
                            } else if (org.telegram.messenger.gj.B1(gjVar.f23817k.replies.recent_repliers.get(i12)) == org.telegram.messenger.gj.B1(peer)) {
                                gjVar.f23817k.replies.recent_repliers.remove(i12);
                                break;
                            } else {
                                i12++;
                            }
                        }
                        gjVar.f23817k.replies.recent_repliers.add(i10, peer);
                        if (!gjVar2.N3()) {
                            gjVar.f23817k.replies.max_id = gjVar2.e1();
                        }
                        org.telegram.messenger.vr messagesStorage = getMessagesStorage();
                        long j3 = this.f45173e.f28051id;
                        int e12 = gjVar.e1();
                        TLRPC.MessageReplies messageReplies2 = gjVar.f23817k.replies;
                        messagesStorage.f27220a.c(new org.telegram.messenger.d8(messagesStorage, e12, j3, 1, messageReplies2.recent_repliers, messageReplies2.max_id));
                        if (gjVar.z2()) {
                            org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) this.O6.f(gjVar.c1());
                            if (bjVar != null) {
                                ArrayList arrayList4 = bjVar.d;
                                if (hVar == null) {
                                    hVar = new a0.h();
                                }
                                hVar.k(bjVar, bjVar.f22707a);
                                int size3 = arrayList4.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    ((org.telegram.messenger.gj) arrayList4.get(i13)).f23819k1 = true;
                                }
                            }
                        } else if (this.D0 != null && (indexOf = arrayList.indexOf(gjVar)) >= 0) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(Integer.valueOf(indexOf + this.D0.K));
                        }
                    }
                }
                i11++;
                i10 = 0;
            }
            if (arrayList2 != null) {
                int size4 = arrayList2.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    sparseArray.remove(((Integer) arrayList2.get(i14)).intValue());
                }
            }
            if (this.D0 != null) {
                if (hVar != null) {
                    int m10 = hVar.m();
                    for (int i15 = 0; i15 < m10; i15++) {
                        org.telegram.messenger.bj bjVar2 = (org.telegram.messenger.bj) hVar.n(i15);
                        int indexOf2 = arrayList.indexOf((org.telegram.messenger.gj) i5.c.h(1, bjVar2.d));
                        if (indexOf2 >= 0) {
                            jl jlVar = this.D0;
                            if (!jlVar.O) {
                                jlVar.k(indexOf2 + jlVar.K, bjVar2.d.size());
                            }
                        }
                    }
                }
                if (arrayList3 != null && !this.D0.O) {
                    int size5 = arrayList3.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        this.D0.g(((Integer) arrayList3.get(i16)).intValue());
                    }
                }
            }
        }
    }

    public final void L8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.L8():void");
    }

    public final void L9() {
        boolean z10;
        nd(0, 0, -1);
        getMediaDataController().X1(this.I3, this.f45259k6, this.f45154c7, this.classGuid, 0, this.f45358s4, false, this.D3, this.E3, true, this.F3);
        if (TextUtils.isEmpty(this.I3) && this.F3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.H3 = z10;
        this.f45340r0 = z10;
        Pc(false);
        qd();
    }

    public final void La(boolean z10) {
        org.telegram.ui.ActionBar.o4 o4Var;
        int i7;
        if (getParentActivity() != null && (o4Var = this.parentLayout) != null && o4Var.getLastFragment() == this && !this.U4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.f45173e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f28051id);
            } else {
                bundle.putLong("user_id", this.f45187f.f28200id);
            }
            bundle.putInt("chatMode", 2);
            an anVar = new an(bundle);
            anVar.U4 = new ArrayList(this.U4);
            anVar.W4 = new HashMap(this.W4);
            int size = this.U4.size();
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = (Integer) this.U4.get(i10);
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.W4.get(num);
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) this.F6[0].get(num.intValue());
                if (gjVar == null) {
                    gjVar = gjVar2;
                } else if (gjVar2 != null) {
                    gjVar.f23876z0 = gjVar2.f23876z0;
                    gjVar.f23872y0 = gjVar2.f23872y0;
                }
                if (gjVar != null) {
                    anVar.W4.put(num, gjVar);
                    anVar.hd();
                }
            }
            anVar.f45152c5 = this.f45152c5;
            if (this.f45408w4) {
                i7 = this.U4.size();
            } else {
                i7 = this.f45165d5;
            }
            anVar.f45165d5 = i7;
            anVar.f45193f5 = this.f45193f5;
            anVar.f45348r8 = this.f45348r8;
            anVar.f45334q8 = this.f45334q8;
            anVar.f45286m9 = new rk(this, anVar);
            if (z10) {
                presentFragmentAsPreview(anVar);
                s7();
                return;
            }
            presentFragment(anVar, false);
        }
    }

    public final fe Lb(org.telegram.messenger.gj gjVar, boolean z10) {
        int i7;
        boolean z11;
        int i10;
        if (gjVar == null || gjVar.N3() || !gjVar.l4()) {
            return null;
        }
        TLRPC.Message message = gjVar.f23817k;
        if (message.destroyTime != 0 || (i7 = message.ttl) <= 0) {
            return null;
        }
        if (z10) {
            if (i7 != Integer.MAX_VALUE) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i7 == Integer.MAX_VALUE) {
                i10 = 0;
            } else {
                i10 = i7;
            }
            message.destroyTime = getConnectionsManager().getCurrentTime() + i10;
            if (this.h != null) {
                getMessagesController().p3(this.f45259k6, i10, gjVar.f23817k.random_id);
                return null;
            }
            getMessagesController().q3(this.f45259k6, gjVar.e1(), null, i10, 0L, z11);
            return null;
        }
        return new fe(this, gjVar, 1);
    }

    public final void Lc() {
        boolean Y9 = Y9();
        SparseArray[] sparseArrayArr = this.f45294n6;
        if (!Y9) {
            if (this.actionBar.x() && this.f45327q1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f45327q1.c(org.telegram.messenger.hd.G(sparseArrayArr[1].size() + sparseArrayArr[0].size(), "MessagesSelected", new Object[0]), true, true);
                    return;
                }
                return;
            }
            return;
        }
        int size = sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (size == 0) {
            this.E0.setText(org.telegram.messenger.hd.M0(2131746213, null));
            this.E0.setAlpha(0.5f);
            this.E0.setEnabled(false);
            return;
        }
        this.E0.setText(org.telegram.messenger.hd.a0(null, null, 2131746214, org.telegram.messenger.hd.G(size, "messages", new Object[0])));
        this.E0.setAlpha(1.0f);
        this.E0.setEnabled(true);
    }

    @Override
    public final long M() {
        return this.f45154c7;
    }

    public final void M6(org.telegram.messenger.gj gjVar) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.Aa);
        String M0 = org.telegram.messenger.hd.M0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
        if (gjVar.D == 3) {
            t1Var.U = org.telegram.messenger.hd.M0(2131748178, null);
        } else {
            t1Var.U = org.telegram.messenger.hd.a0("NoHandleAppInstalled", null, 2131748205, gjVar.F0().mime_type);
        }
        showDialog(t1Var);
    }

    public final void M7(boolean z10) {
        boolean z11;
        this.L6.clear();
        this.I6.clear();
        this.J6.clear();
        this.f45436y6.clear();
        this.O6.b();
        this.f45421x4 = false;
        jl jlVar = this.D0;
        if (jlVar != null) {
            if (jlVar.f48378x < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            wc(z11);
        }
        aj ajVar = this.A0;
        if (ajVar != null) {
            ajVar.setEmptyView(null);
        }
        for (int i7 = 0; i7 < 2; i7++) {
            this.F6[i7].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.Q6;
            int[] iArr2 = this.P6;
            if (encryptedChat == null) {
                iArr2[i7] = Integer.MAX_VALUE;
                iArr[i7] = Integer.MIN_VALUE;
            } else {
                iArr2[i7] = Integer.MIN_VALUE;
                iArr[i7] = Integer.MAX_VALUE;
            }
            this.R6[i7] = Integer.MIN_VALUE;
            this.S6[i7] = 0;
            this.T6[i7] = false;
            this.U6[i7] = false;
            this.V6[i7] = true;
        }
        if (z10) {
            this.X7 = true;
            this.Y6 = true;
            this.X6 = true;
            this.Z7 = false;
        }
        this.f45258k5 = false;
        this.L7 = 0;
        this.K7 = false;
        this.f45140b7 = 0;
        this.f45126a8 = null;
        this.U7 = 0;
        this.V7 = false;
        this.R7 = false;
        jl jlVar2 = this.D0;
        if (jlVar2 != null && !jlVar2.O) {
            jlVar2.O(false);
        }
    }

    public final boolean M8() {
        boolean z10;
        org.telegram.messenger.bj currentMessagesGroup;
        int childCount = this.A0.getChildCount();
        HashMap hashMap = null;
        int i7 = 0;
        while (true) {
            z10 = true;
            if (i7 >= childCount) {
                break;
            }
            View childAt = this.A0.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.q1) && (currentMessagesGroup = ((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.f22708b && !currentMessagesGroup.d.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.f22707a))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.f22707a), currentMessagesGroup);
                    int indexOf = this.L6.indexOf((org.telegram.messenger.gj) i5.c.h(1, currentMessagesGroup.d));
                    if (indexOf >= 0) {
                        jl jlVar = this.D0;
                        jlVar.k(indexOf + jlVar.K, currentMessagesGroup.d.size());
                        this.A0.setItemAnimator(null);
                    }
                }
            }
            i7++;
        }
        if (!org.telegram.messenger.g0.Q1()) {
            return true;
        }
        if (org.telegram.messenger.g0.P1() && org.telegram.messenger.t0.f26600b.getResources().getConfiguration().orientation == 1) {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && !o4Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z10 = false;
        }
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(z10));
        return false;
    }

    public final void M9() {
        if (!this.Z9) {
            this.Z9 = true;
            ol olVar = this.f45278m1;
            if (olVar != null) {
                olVar.invalidate();
            }
            aj ajVar = this.A0;
            if (ajVar != null) {
                ajVar.invalidate();
            }
        }
        UndoView undoView = this.N3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(t9(org.telegram.ui.Components.l11.f36702c) + this.U.getInputBubbleHeight() + this.f45403w.d() + org.telegram.messenger.g0.L(16.0f));
        }
        K7();
    }

    public final void Ma(int i7, boolean z10) {
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && o4Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f28059id);
            } else {
                TLRPC.Chat chat = this.f45173e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f28051id);
                } else {
                    bundle.putLong("user_id", this.f45187f.f28200id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i7);
                bundle.putBoolean("converting_toast", true);
            }
            an anVar = new an(bundle);
            if (this.f45408w4) {
                qg.c.a(anVar, org.telegram.messenger.ur.a(a(), b()));
            }
            anVar.f45286m9 = new wi(this);
            presentFragment(anVar, false);
        }
    }

    public final void Mb(int i7, ArrayList arrayList, boolean z10) {
        String str;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Uri uri = (Uri) arrayList.get(i10);
            String uri2 = uri.toString();
            if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
                try {
                    String str2 = uri2.split("/1/")[1];
                    int indexOf = str2.indexOf("/ACTUAL");
                    if (indexOf != -1) {
                        uri = Uri.parse(URLDecoder.decode(str2.substring(0, indexOf), "UTF-8"));
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            if (!org.telegram.messenger.r2.f26199b) {
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                ArrayList arrayList5 = arrayList4;
                arrayList5.add(uri);
                arrayList4 = arrayList5;
            } else {
                String T0 = org.telegram.messenger.g0.T0(uri);
                if (T0 == null) {
                    String uri3 = uri.toString();
                    String t6 = MediaController.t(-1L, uri, "file");
                    if (t6 == null) {
                        ac();
                    } else {
                        str = uri3;
                        T0 = t6;
                    }
                } else {
                    str = T0;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                }
                arrayList2.add(T0);
                arrayList3.add(str);
            }
        }
        if (arrayList2 == null && arrayList4 == null) {
            return;
        }
        E8();
        org.telegram.messenger.ez.V(i7, this.f45259k6, 0L, 0L, 0L, null, null, arrayList2, arrayList3, arrayList4, null, null, null, getAccountInstance(), this.E5, this.f45281m4, this.G5, null, Y8(), null, this.C5, null, null, z10, false);
        D9(false);
    }

    public final void Mc() {
        Drawable s02;
        ol olVar = this.f45278m1;
        if (olVar != null && this.ya == null) {
            if (this.Aa.h == null || olVar.getBackgroundImage() == null) {
                if (this.f45278m1.getBackgroundImage() == null || org.telegram.messenger.g0.Q1()) {
                    if (S9()) {
                        s02 = this.f45278m1.getCompactBackground();
                    } else {
                        s02 = org.telegram.ui.ActionBar.j6.s0();
                    }
                    ol olVar2 = this.f45278m1;
                    if (!S9()) {
                        boolean z10 = org.telegram.ui.ActionBar.j6.f28935i0;
                    }
                    olVar2.U(s02);
                }
            }
        }
    }

    public final void N6(boolean z10, boolean z11) {
        long j3;
        TLRPC.DraftMessage R;
        Long l10;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j10;
        qm qmVar;
        org.telegram.messenger.gj gjVar;
        TLRPC.TL_forumTopic f10;
        TLRPC.Message message2;
        org.telegram.messenger.gj gjVar2;
        qm qmVar2;
        String str;
        int Y;
        qm qmVar3;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        long j11;
        org.telegram.ui.Components.wy0 wy0Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.p5 p5Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j12;
        TLRPC.Message message3;
        Pair pair;
        Long l11;
        TLRPC.DraftMessage draftMessage;
        if (this.f45118a0 != null) {
            int i7 = this.f45204g4;
            char c10 = '\b';
            if (i7 == 0 || i7 == 8 || (i7 == 3 && getUserConfig().e() == e9())) {
                long j13 = 0;
                if (this.f45204g4 == 8) {
                    if (org.telegram.messenger.t3.p0(this.f45173e)) {
                        if (this.f45358s4 == 0 && org.telegram.messenger.t3.A(this.currentAccount, this.f45173e, 24)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.wy0 wy0Var2 = null;
                ?? r72 = 0;
                if (T9()) {
                    a0.h hVar = (a0.h) getMediaDataController().f26500s1.f(this.f45259k6);
                    if (hVar != null && hVar.m() > 0) {
                        pair = new Pair(Long.valueOf(hVar.j(0)), hVar.n(0));
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        l11 = (Long) pair.first;
                        draftMessage = (TLRPC.DraftMessage) pair.second;
                    } else {
                        l11 = null;
                        draftMessage = null;
                    }
                    R = draftMessage;
                    l10 = l11;
                } else {
                    org.telegram.messenger.si mediaDataController = getMediaDataController();
                    long j14 = this.f45259k6;
                    if (this.f45204g4 == 3) {
                        j3 = 0;
                    } else {
                        j3 = this.f45358s4;
                    }
                    R = mediaDataController.R(j14, j3);
                    l10 = null;
                }
                qj qjVar = this.f45118a0;
                if (R != null) {
                    richMessage = R.rich_message;
                } else {
                    richMessage = null;
                }
                qjVar.setRichDraftPreview(richMessage);
                org.telegram.messenger.ni S = org.telegram.messenger.si.b0(this.currentAccount).S(this.f45259k6, b());
                if (R != null && (inputReplyTo = R.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    org.telegram.messenger.si mediaDataController2 = getMediaDataController();
                    long j15 = this.f45259k6;
                    if (l10 != null) {
                        j12 = l10.longValue();
                    } else {
                        j12 = this.f45358s4;
                    }
                    a0.h hVar2 = (a0.h) mediaDataController2.f26502t1.f(j15);
                    if (hVar2 == null) {
                        message3 = null;
                    } else {
                        message3 = (TLRPC.Message) hVar2.f(j12);
                    }
                    message = message3;
                } else {
                    message = null;
                }
                if ((!z11 || R == null) && this.f45118a0.getFieldText() != null && (this.f45204g4 != 0 || getUserConfig().e() != a() || R == null || this.Ec >= R.date)) {
                    if (z10 && R == null) {
                        this.f45118a0.setFieldText("");
                        this.f45118a0.setEffectId(0L);
                        D9(true);
                    }
                } else if (S != null) {
                    this.f45118a0.setVoiceDraft(S);
                } else if (R != null) {
                    this.Ec = R.date;
                    qj qjVar2 = this.f45118a0;
                    qjVar2.F3 = null;
                    qjVar2.G3 = !R.no_webpage;
                    if (!R.entities.isEmpty()) {
                        ?? valueOf = SpannableStringBuilder.valueOf(R.message);
                        Collections.sort(R.entities, org.telegram.messenger.si.f26456e2);
                        int i10 = 0;
                        while (i10 < R.entities.size()) {
                            TLRPC.MessageEntity messageEntity = R.entities.get(i10);
                            boolean z12 = messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName;
                            char c11 = c10;
                            long j16 = j13;
                            if (!z12 && !(messageEntity instanceof TLRPC.TL_messageEntityMentionName)) {
                                if (!(messageEntity instanceof TLRPC.TL_messageEntityCode) && !(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj = new Object();
                                        obj.f41484a |= 1;
                                        org.telegram.ui.Components.xy0 xy0Var = new org.telegram.ui.Components.xy0(obj, r72);
                                        int i11 = messageEntity.offset;
                                        org.telegram.messenger.si.f(xy0Var, i11, messageEntity.length + i11, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj2 = new Object();
                                        obj2.f41484a |= 2;
                                        org.telegram.ui.Components.xy0 xy0Var2 = new org.telegram.ui.Components.xy0(obj2, r72);
                                        int i12 = messageEntity.offset;
                                        org.telegram.messenger.si.f(xy0Var2, i12, messageEntity.length + i12, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj3 = new Object();
                                        obj3.f41484a |= 8;
                                        org.telegram.ui.Components.xy0 xy0Var3 = new org.telegram.ui.Components.xy0(obj3, r72);
                                        int i13 = messageEntity.offset;
                                        org.telegram.messenger.si.f(xy0Var3, i13, messageEntity.length + i13, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj4 = new Object();
                                        obj4.f41484a |= 16;
                                        org.telegram.ui.Components.xy0 xy0Var4 = new org.telegram.ui.Components.xy0(obj4, r72);
                                        int i14 = messageEntity.offset;
                                        org.telegram.messenger.si.f(xy0Var4, i14, messageEntity.length + i14, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.h41 h41Var = new org.telegram.ui.Components.h41(messageEntity.url, wy0Var2);
                                        int i15 = messageEntity.offset;
                                        valueOf.setSpan(h41Var, i15, messageEntity.length + i15, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj5 = new Object();
                                        obj5.f41484a |= 256;
                                        org.telegram.ui.Components.xy0 xy0Var5 = new org.telegram.ui.Components.xy0(obj5, r72);
                                        int i16 = messageEntity.offset;
                                        org.telegram.messenger.si.f(xy0Var5, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i17 = messageEntity.offset;
                                        org.telegram.ui.Components.xg0.c(valueOf, i17, messageEntity.length + i17, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.f45118a0.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, r72);
                                            fontMetricsInt = wy0Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            p5Var = new org.telegram.ui.Components.p5(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                        } else {
                                            p5Var = new org.telegram.ui.Components.p5(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i18 = messageEntity.offset;
                                        valueOf.setSpan(p5Var, i18, messageEntity.length + i18, 33);
                                    }
                                    wy0Var = wy0Var2;
                                } else {
                                    ?? obj6 = new Object();
                                    obj6.f41484a |= 4;
                                    org.telegram.ui.Components.xy0 xy0Var6 = new org.telegram.ui.Components.xy0(obj6, 0);
                                    int i19 = messageEntity.offset;
                                    org.telegram.messenger.si.f(xy0Var6, i19, messageEntity.length + i19, valueOf, true);
                                }
                                wy0Var = null;
                            } else {
                                if (z12) {
                                    j11 = ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id;
                                } else {
                                    j11 = ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id;
                                }
                                if (messageEntity.offset + messageEntity.length < valueOf.length() && valueOf.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                    messageEntity.length++;
                                }
                                wy0Var = null;
                                org.telegram.ui.Components.i41 i41Var = new org.telegram.ui.Components.i41(a8.p0.o(j11, ""), 3, null);
                                int i20 = messageEntity.offset;
                                valueOf.setSpan(i41Var, i20, messageEntity.length + i20, 33);
                            }
                            i10++;
                            wy0Var2 = wy0Var;
                            c10 = c11;
                            j13 = j16;
                            r72 = 0;
                        }
                        j10 = j13;
                        qmVar = wy0Var2;
                        str2 = valueOf;
                    } else {
                        j10 = 0;
                        qmVar = null;
                        str2 = R.message;
                    }
                    this.f45118a0.v1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.f45118a0.setSelection(R.message.indexOf(10) + 1);
                        org.telegram.messenger.g0.i3(new yd(this, 5), 700L);
                    }
                    this.f45118a0.setEffectId(R.effect);
                    if (R != null && (suggestedPost = R.suggested_post) != null) {
                        org.telegram.messenger.lj b10 = org.telegram.messenger.lj.b(suggestedPost);
                        this.f45422x5 = b10;
                        kc(b10);
                    }
                    gjVar = this.E5;
                    if (gjVar != null || this.f45281m4 == gjVar) {
                        if (message == null && ((gjVar2 = this.f45281m4) == null || gjVar2.e1() != message.f28072id)) {
                            org.telegram.messenger.gj gjVar3 = new org.telegram.messenger.gj(this.currentAccount, message, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.E5 = gjVar3;
                            TLRPC.InputReplyTo inputReplyTo2 = R.reply_to;
                            if (inputReplyTo2 != null) {
                                int i21 = inputReplyTo2.flags;
                                if ((i21 & 4) != 0 || inputReplyTo2.quote_rich != null) {
                                    ArrayList<TL_iv.RichText> arrayList = inputReplyTo2.quote_rich;
                                    int i22 = -1;
                                    if (arrayList != null) {
                                        int i23 = inputReplyTo2.quote_offset;
                                        if (arrayList.isEmpty()) {
                                            qmVar3 = qmVar;
                                        } else {
                                            org.telegram.messenger.gj.B0(gjVar3.f23817k);
                                            ?? obj7 = new Object();
                                            obj7.f50643a = gjVar3;
                                            obj7.f50644b = -1;
                                            obj7.f50645c = -1;
                                            obj7.d = -1;
                                            obj7.f50653m = true;
                                            obj7.e(i23, arrayList);
                                            qmVar3 = obj7;
                                        }
                                        this.C5 = qmVar3;
                                    } else {
                                        String str3 = inputReplyTo2.quote_text;
                                        if ((i21 & 16) != 0) {
                                            i22 = inputReplyTo2.quote_offset;
                                        }
                                        TLRPC.Message message4 = gjVar3.f23817k;
                                        if (message4 == null || (str = message4.message) == null || str3 == null || (Y = org.telegram.messenger.gj.Y(i22, str, str3)) < 0) {
                                            qmVar2 = qmVar;
                                        } else {
                                            org.telegram.messenger.gj.B0(gjVar3.f23817k);
                                            qmVar2 = new qm(Y, str3.length() + Y, gjVar3);
                                        }
                                        this.C5 = qmVar2;
                                    }
                                }
                            }
                            k7(false);
                            qm qmVar4 = this.C5;
                            if (qmVar4 != null) {
                                jc(this.E5, qmVar4);
                            } else {
                                ic(this.E5);
                            }
                            Pc(false);
                            return;
                        } else if (l10 == null && l10.longValue() != j10 && this.f45173e != null && (f10 = getMessagesController().f25383r7.f(this.f45173e.f28051id, l10.longValue())) != null && (message2 = f10.topicStartMessage) != null) {
                            org.telegram.messenger.gj gjVar4 = new org.telegram.messenger.gj(this.currentAccount, message2, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.E5 = gjVar4;
                            gjVar4.f23815j1 = f10;
                            ic(gjVar4);
                            Pc(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                j10 = 0;
                qmVar = null;
                if (R != null) {
                    org.telegram.messenger.lj b102 = org.telegram.messenger.lj.b(suggestedPost);
                    this.f45422x5 = b102;
                    kc(b102);
                }
                gjVar = this.E5;
                if (gjVar != null) {
                }
                if (message == null) {
                }
                if (l10 == null) {
                }
            }
        }
    }

    public final void N7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.Q6;
        if (z10) {
            if (org.telegram.messenger.r2.f26198a) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.Y6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                i5.c.r(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i7 = dialog.top_message;
            int i10 = iArr[0];
            if (i7 > i10) {
                this.U7 = Math.max(i10 + 1, dialog.read_inbox_max_id);
            }
            this.V6[0] = false;
            this.W6 = false;
            jl jlVar = this.D0;
            if (jlVar != null && jlVar.G < 0) {
                jlVar.i(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i11 = dialog2.unread_count;
            this.A6 = i11;
            this.C6 = dialog2.unread_mentions_count;
            if (this.B6 != i11) {
                lh.h hVar = this.f45431y1;
                if (hVar != null) {
                    hVar.c(1, i11, this.f45180e6);
                }
                this.B6 = this.A6;
                dd();
            }
            int i12 = this.C6;
            int i13 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i12 != i13) {
                this.C6 = i13;
                if (i13 <= 0) {
                    this.C6 = 0;
                    this.D6 = true;
                    rc(false);
                } else {
                    lh.h hVar2 = this.f45431y1;
                    if (hVar2 != null) {
                        hVar2.c(2, i13, true);
                    }
                    rc(true);
                }
            }
            p7(false);
            return;
        }
        this.L6.clear();
        this.f45436y6.clear();
        this.I6.clear();
        this.J6.clear();
        this.O6.b();
        this.f45421x4 = false;
        for (int i14 = 1; i14 >= 0; i14--) {
            this.F6[i14].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.P6;
            if (encryptedChat == null) {
                iArr2[i14] = Integer.MAX_VALUE;
                iArr[i14] = Integer.MIN_VALUE;
            } else {
                iArr2[i14] = Integer.MIN_VALUE;
                iArr[i14] = Integer.MAX_VALUE;
            }
            this.R6[i14] = Integer.MIN_VALUE;
            this.S6[i14] = 0;
            this.f45294n6[i14].clear();
            this.f45306o6[i14].clear();
            this.f45319p6[i14].clear();
        }
        B9();
        gd(0, true);
        if (this.C8 != null) {
            this.C8 = null;
            qj qjVar = this.f45118a0;
            if (qjVar != null) {
                qjVar.p1(null, true, false);
            }
        }
        if (this.R != null) {
            wc(false);
            W7(false);
            this.A0.setEmptyView(this.f45189f1);
        }
        jl jlVar2 = this.D0;
        if (jlVar2 != null) {
            jlVar2.O(false);
        }
        if (this.h == null && (user = this.f45187f) != null && user.bot && this.f45398v8 == null) {
            this.f45398v8 = "";
            Pc(false);
        }
    }

    public final void N8(ArrayList arrayList, boolean z10, boolean z11, boolean z12, int i7, long j3) {
        boolean z13;
        if (!arrayList.isEmpty() && u7()) {
            boolean z14 = false;
            if (i7 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.f45204g4 == 1) {
                z14 = true;
            }
            if (z13 == z14) {
                this.K9 = true;
                jl jlVar = this.D0;
                if (jlVar != null) {
                    jlVar.K(true);
                }
            }
            int q02 = getSendMessagesHelper().q0(arrayList, this.f45259k6, z10, z11, z12, i7, 0, this.f45281m4, -1, j3, j9(), this.f45422x5);
            org.telegram.ui.Components.t4.q0(q02, this, this.Aa);
            if (q02 != 0) {
                org.telegram.messenger.g0.h3(new ye(this, 23));
            }
        }
    }

    public final void N9() {
        boolean z10;
        Rect rect;
        if (this.f45278m1 != null) {
            if (this.f45337qb <= 0 && this.f45351rb <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            vi viVar = this.f45403w;
            float c10 = viVar.c();
            te.k kVar = viVar.f56030b;
            int max = (int) Math.max(0.0f, (c10 * kVar.f57107a) - org.telegram.messenger.g0.L(29.0f));
            ol olVar = this.f45278m1;
            bi.o2 o2Var = olVar.M;
            Rect rect2 = this.f45265kd;
            if (o2Var != null) {
                rect2.set(0, 0, olVar.getMeasuredWidth(), this.f45278m1.getMeasuredHeight() - max);
                this.f45278m1.M.setClipBounds(rect2);
            }
            if (this.A0 != null) {
                rect2.set(0, 0, this.f45278m1.getMeasuredWidth(), this.f45278m1.getMeasuredHeight() - max);
                rect2.offset(0, -this.A0.getTop());
                aj ajVar = this.A0;
                if (ajVar.Y0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                ajVar.setClipBounds(rect);
            }
            if (this.Z != null) {
                rect2.set(0, 0, this.f45278m1.getMeasuredWidth(), this.f45278m1.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(viVar.f56037w, viVar.c() * kVar.f57107a) - org.telegram.messenger.g0.L(29.0f))));
                lh.f fVar = this.Z;
                if (z10) {
                    rect2 = null;
                }
                fVar.setClipBounds(rect2);
            }
        }
    }

    public final void Na(TLRPC.Chat chat) {
        boolean z10;
        hi.l3 l3Var = this.K1;
        if (l3Var != null && l3Var.W) {
            l3Var.f(true);
            z10 = true;
        } else {
            z10 = false;
        }
        hi.l3 l3Var2 = this.L1;
        if (l3Var2 != null && l3Var2.W) {
            l3Var2.f(true);
            z10 = true;
        }
        if (z10) {
            org.telegram.messenger.g0.i3(new u5(27, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f29304o0) {
            this.f45213gd.a(true, true);
            org.telegram.ui.ActionBar.q0 q0Var = this.f45240j0;
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f45200g0;
            if (xVar != null) {
                xVar.e(8);
            }
            er erVar = this.f45188f0;
            if (erVar != null) {
                erVar.b(false);
            }
            org.telegram.ui.ActionBar.q0 q0Var2 = this.f45253k0;
            if (q0Var2 != null) {
                q0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = this.f45313p0;
            if (q0Var3 != null && this.f45210ga) {
                q0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f45326q0;
            if (xVar2 != null && this.f45223ha) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = this.f45266l0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var5 = this.m0;
            if (q0Var5 != null) {
                q0Var5.setVisibility(8);
            }
            this.f45340r0 = true;
            nd(0, 0, -1);
            Pc(false);
            ImageView imageView = this.f45217h3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f45230i3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var6 = this.f45253k0;
        if (q0Var6 != null) {
            this.Jc = true;
            this.f45244j5 = false;
            q0Var6.G(false);
            this.Jc = false;
        }
        Db(chat, null);
        gd(0, true);
    }

    public final void Nb(org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.q1 q1Var, int i7, boolean z10) {
        boolean z11;
        org.telegram.messenger.bj u92 = u9(gjVar);
        boolean z12 = false;
        if (u92 != null) {
            ArrayList arrayList = u92.d;
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (this.f45294n6[i7].indexOfKey(((org.telegram.messenger.gj) arrayList.get(i10)).e1()) < 0) {
                        break;
                    }
                    i10++;
                } else {
                    u92 = null;
                    break;
                }
            }
        }
        if (u92 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var.setDrawSelectionBackground(z11);
        if (u92 == null) {
            z12 = true;
        }
        q1Var.m3(true, z12, z10);
    }

    public final void Nc() {
        TLRPC.User user;
        boolean z10;
        if (this.f45240j0 != null && (user = this.f45187f) != null && this.h == null && user.bot) {
            a0.h hVar = this.f45385u8;
            boolean z11 = false;
            if (hVar.m() != 0) {
                boolean z12 = false;
                z10 = false;
                for (int i7 = 0; i7 < hVar.m(); i7++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i7);
                    for (int i10 = 0; i10 < botInfo.commands.size(); i10++) {
                        TLRPC.BotCommand botCommand = botInfo.commands.get(i10);
                        if (botCommand.command.toLowerCase().equals("help")) {
                            z12 = true;
                        } else if (botCommand.command.toLowerCase().equals("settings")) {
                            z10 = true;
                        }
                        if (!z10 || !z12) {
                        }
                    }
                }
                z11 = z12;
            } else {
                z10 = false;
            }
            if (z11) {
                this.f45240j0.T(30);
            } else {
                this.f45240j0.u(30);
            }
            if (z10) {
                this.f45240j0.T(31);
            } else {
                this.f45240j0.u(31);
            }
        }
    }

    public final boolean O6() {
        if (!org.telegram.messenger.t3.u0(this.f45173e)) {
            TLRPC.User user = this.f45187f;
            if (!org.telegram.messenger.q10.u(user) || !user.bot_forum_sidebar) {
                if (!org.telegram.messenger.q10.u(this.f45187f) && !org.telegram.messenger.t3.a(this.f45173e)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void O7(boolean z10) {
        for (int i7 = 1; i7 >= 0; i7--) {
            this.f45294n6[i7].clear();
            this.f45306o6[i7].clear();
            this.f45319p6[i7].clear();
        }
        B9();
        gd(0, true);
        Gd(z10);
        td();
    }

    public final int O8() {
        return this.f45204g4;
    }

    public final void O9() {
        this.Na = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void Oa(String str) {
        boolean z10;
        boolean z11;
        String str2;
        int i7;
        org.telegram.ui.ActionBar.q0 q0Var;
        int i10;
        hi.l3 l3Var = this.K1;
        if (l3Var != null && l3Var.W) {
            l3Var.f(true);
            z10 = true;
        } else {
            z10 = false;
        }
        hi.l3 l3Var2 = this.L1;
        if (l3Var2 != null && l3Var2.W) {
            l3Var2.f(true);
            z10 = true;
        }
        if (z10) {
            org.telegram.messenger.g0.i3(new ee(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f29304o0) {
            this.f45213gd.a(true, true);
            org.telegram.ui.ActionBar.q0 q0Var2 = this.f45240j0;
            if (q0Var2 != null) {
                q0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f45200g0;
            if (xVar != null) {
                xVar.e(8);
            }
            er erVar = this.f45188f0;
            if (erVar != null) {
                erVar.b(false);
            }
            if ((this.f45358s4 == 0 || (i10 = this.f45204g4) == 3 || i10 == 8) && (q0Var = this.f45253k0) != null) {
                q0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = this.f45313p0;
            if (q0Var3 != null && this.f45210ga) {
                q0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f45326q0;
            if (xVar2 != null && this.f45223ha) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = this.f45266l0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var5 = this.m0;
            if (q0Var5 != null) {
                q0Var5.setVisibility(8);
            }
            this.f45340r0 = true;
            nd(0, 0, -1);
            Pc(false);
        }
        if ((this.f45358s4 == 0 || this.f45408w4 || (i7 = this.f45204g4) == 3 || i7 == 8) && !org.telegram.messenger.q10.z(this.f45187f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f45244j5 = z11;
            org.telegram.ui.ActionBar.q0 q0Var6 = this.f45253k0;
            if (q0Var6 != null) {
                q0Var6.G(z11);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var7 = this.f45253k0;
        if (q0Var7 != null) {
            q0Var7.Q(str, false);
        }
        org.telegram.messenger.si mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.I3 = str2;
        mediaDataController.X1(str2, this.f45259k6, this.f45154c7, this.classGuid, 0, this.f45358s4, false, this.D3, this.E3, !TextUtils.isEmpty(str), this.F3);
        gd(0, true);
    }

    public final void Ob(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.Aa != null && this.ya == null) {
            ig.b c10 = ig.b.c(chatTheme);
            org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.currentAccount);
            f10.s(this.f45259k6, ig.b.c(chatTheme), chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                f10.p(chatTheme);
                org.telegram.ui.ActionBar.p3 i7 = f10.i(c10);
                if (i7 == null) {
                    i7 = new org.telegram.ui.ActionBar.p3(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    i7.k();
                    i7.m(this.currentAccount);
                }
                org.telegram.ui.ActionBar.p3 p3Var = i7;
                ym ymVar = this.Aa;
                TLRPC.WallPaper wallPaper = ymVar.f53546g;
                if (this.f45206g6 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ymVar.r(p3Var, wallPaper, z11, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                ce ceVar = new ce(this, 14);
                String str = c10.f15934b;
                if (c10.b()) {
                    ceVar.onComplete(null);
                } else if (!TextUtils.isEmpty(str)) {
                    org.telegram.ui.ActionBar.p3 p3Var2 = (org.telegram.ui.ActionBar.p3) f10.f23027e.get(str);
                    if (p3Var2 != null) {
                        p3Var2.k();
                        ceVar.onComplete(p3Var2);
                    } else {
                        ceVar.onComplete(null);
                    }
                } else {
                    f10.q(new org.telegram.messenger.c4(c10, ceVar), false);
                }
            }
            TLRPC.WallPaper d = f10.d(this.f45259k6);
            ym ymVar2 = this.Aa;
            org.telegram.ui.ActionBar.p3 p3Var3 = ymVar2.f53545f;
            if (this.f45206g6 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ymVar2.r(p3Var3, d, z10, null, false);
        }
    }

    public final void Oc() {
        if (this.f45202g2 == null) {
            return;
        }
        this.f45202g2.setSideMenuBackgroundMarginBottom(((this.U.getInputBubbleHeight() + org.telegram.messenger.g0.L(9.0f)) - org.telegram.messenger.g0.L(5.0f)) + this.f45403w.d());
    }

    @Override
    public final boolean P(yw ywVar) {
        return false;
    }

    public final int P6(int i7) {
        org.telegram.messenger.gj messageObject;
        int i10;
        int height = this.A0.getHeight();
        int i11 = 0;
        long j3 = 0;
        while (true) {
            View T0 = this.A0.T0(i7);
            if (T0 == null) {
                break;
            }
            if (T0 instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) T0;
                messageObject = q1Var.getMessageObject();
                i10 = q1Var.getAdditionalPaddingHeight();
            } else if (T0 instanceof org.telegram.ui.Cells.t0) {
                messageObject = ((org.telegram.ui.Cells.t0) T0).getMessageObject();
                i10 = 0;
            } else {
                continue;
                i7++;
            }
            if (messageObject != null) {
                long c12 = messageObject.c1();
                boolean N3 = messageObject.N3();
                if (j3 != 0 && j3 != c12) {
                    break;
                }
                height = Math.min(height, T0.getTop());
                i11 = Math.max(i11, T0.getBottom() - i10);
                if (!N3) {
                    continue;
                } else if (c12 == 0) {
                    break;
                } else {
                    j3 = c12;
                }
            } else {
                continue;
            }
            i7++;
        }
        return Math.max(0, i11 - height);
    }

    public final void P7(boolean z10) {
        this.f45209g9 = z10;
        org.telegram.ui.ActionBar.g1 g1Var = this.f45197f9;
        if (g1Var != null) {
            g1Var.dismiss();
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.Hc;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Hc.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.Hc = ofFloat;
            ofFloat.addUpdateListener(new ae(this, 0));
            this.Hc.setDuration(150L);
            this.Hc.start();
        }
    }

    public final r0.k1 P8(r0.k1 k1Var) {
        fi.p2 p2Var;
        r0.a1 w0Var;
        if (k1Var != null && (p2Var = this.Y1) != null) {
            if ((p2Var.isShowing() && !this.Y1.J) || this.Y1.f36493s2) {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 34) {
                    w0Var = new r0.z0(k1Var);
                } else if (i7 >= 30) {
                    w0Var = new r0.y0(k1Var);
                } else if (i7 >= 29) {
                    w0Var = new r0.x0(k1Var);
                } else {
                    w0Var = new r0.w0(k1Var);
                }
                w0Var.c(8, i0.c.f15573e);
                w0Var.i(8, false);
                return w0Var.b();
            }
            return k1Var;
        }
        return k1Var;
    }

    public final void P9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().e() && !getUserConfig().q() && (user = this.f45187f) != null && user.contact_require_premium) {
            boolean isEmpty = this.L6.isEmpty();
            if (getMessagesController().J2(a()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isEmpty != z10) {
                getMessagesController().n2(this.classGuid, a());
            }
        }
    }

    public final void Pa(TLRPC.User user) {
        boolean z10;
        hi.l3 l3Var = this.K1;
        if (l3Var != null && l3Var.W) {
            l3Var.f(true);
            z10 = true;
        } else {
            z10 = false;
        }
        hi.l3 l3Var2 = this.L1;
        if (l3Var2 != null && l3Var2.W) {
            l3Var2.f(true);
            z10 = true;
        }
        if (z10) {
            org.telegram.messenger.g0.i3(new eg(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f29304o0) {
            this.f45213gd.a(true, true);
            org.telegram.ui.ActionBar.q0 q0Var = this.f45240j0;
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f45200g0;
            if (xVar != null) {
                xVar.e(8);
            }
            er erVar = this.f45188f0;
            if (erVar != null) {
                erVar.b(false);
            }
            org.telegram.ui.ActionBar.q0 q0Var2 = this.f45253k0;
            if (q0Var2 != null) {
                q0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = this.f45313p0;
            if (q0Var3 != null && this.f45210ga) {
                q0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f45326q0;
            if (xVar2 != null && this.f45223ha) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = this.f45266l0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var5 = this.m0;
            if (q0Var5 != null) {
                q0Var5.setVisibility(8);
            }
            this.f45340r0 = true;
            nd(0, 0, -1);
            Pc(false);
            ImageView imageView = this.f45217h3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f45230i3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var6 = this.f45253k0;
        if (q0Var6 != null) {
            this.Jc = true;
            this.f45244j5 = false;
            q0Var6.G(false);
            this.Jc = false;
        }
        Db(null, user);
        gd(0, true);
    }

    public final void Pb(View view, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                Pb(viewGroup.getChildAt(i7), z10);
            }
        }
        if (view != this.A0 && view != this.f45278m1) {
            view.setEnabled(z10);
        }
    }

    public final void Pc(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Pc(boolean):void");
    }

    public final float Q6(boolean z10) {
        float f10;
        float f11;
        float f12;
        qj qjVar = this.f45118a0;
        float f13 = 0.0f;
        if (qjVar != null) {
            if (z10) {
                f10 = qjVar.J6;
            } else {
                f10 = qjVar.I6;
            }
        } else {
            f10 = 0.0f;
        }
        float max = Math.max(f10, org.telegram.messenger.g0.L(44.0f));
        float L = org.telegram.messenger.g0.L(44.0f);
        te.a aVar = this.f45172dd;
        m6.n nVar = this.f45239id;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(nVar.f20517a) == 1) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(nVar.f20517a) == 0) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (aVar.f57082f) {
                f13 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) nVar.f20518b;
            float f14 = fArr[1];
            f11 = 1.0f - fArr[0];
            f13 = aVar.f57081e;
            f12 = f14;
        }
        if (!this.f45276lb && !isInPreviewMode()) {
            return org.telegram.messenger.g0.T1(Math.max(org.telegram.messenger.g0.T1(L, max, f12) * f11, org.telegram.messenger.g0.L(44.0f)), -org.telegram.messenger.g0.L(7.0f), f13);
        }
        return org.telegram.messenger.g0.T1(L, max, f12) * f11;
    }

    public final long Q7(org.telegram.messenger.gj gjVar) {
        if (this.f45204g4 == 3) {
            return 0L;
        }
        if (org.telegram.messenger.t3.c0(this.f45173e) && !this.f45408w4 && gjVar != null) {
            TLRPC.TL_forumTopic tL_forumTopic = gjVar.f23815j1;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f28103id;
            }
            return org.telegram.messenger.gj.b2(this.currentAccount, gjVar.f23817k, org.telegram.messenger.t3.c0(this.f45173e), false);
        }
        return this.f45358s4;
    }

    public final TLRPC.ChatFull Q8() {
        return this.f45334q8;
    }

    public final boolean Q9() {
        if (this.f45202g2 != null && this.f45358s4 == 0) {
            return true;
        }
        return false;
    }

    public final void Qa(long j3) {
        int i7 = 0;
        if (j3 < 0) {
            if (j3 == a()) {
                this.f45314p1.e(true, false);
            } else if (getMessagesController().p2(j3)) {
                showDialog(new li.d0(this, -j3, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j3);
                if (getMessagesController().E(bundle, this, null, null)) {
                    presentFragment(new an(bundle));
                }
            }
        } else if (j3 != getUserConfig().e()) {
            if (j3 == a()) {
                this.f45314p1.e(true, false);
                return;
            }
            Bundle j10 = a8.p0.j(j3, "user_id");
            if (this.h != null && j3 == this.f45187f.f28200id) {
                j10.putLong("dialog_id", this.f45259k6);
            }
            ProfileActivity profileActivity = new ProfileActivity(j10, null);
            TLRPC.User user = this.f45187f;
            if (user != null && user.f28200id == j3) {
                i7 = 1;
            }
            profileActivity.i5(i7);
            presentFragment(profileActivity);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", j3);
            bundle2.putBoolean("my_profile", true);
            presentFragment(new ProfileActivity(bundle2, null));
        }
    }

    public final void Qb(boolean z10) {
        Rb(z10, false, true);
    }

    public final void Qc() {
        Pc(false);
    }

    public final boolean R6(org.telegram.messenger.gj gjVar) {
        if (!W9()) {
            TLRPC.Message message = gjVar.f23817k;
            if ((message == null || !message.noforwards) && !gjVar.g4() && !gjVar.S4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final TLRPC.UserFull R8() {
        return this.f45348r8;
    }

    public final void Ra(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap r10 = org.telegram.messenger.ez.r(1, str);
            PhotoViewer.p1().I2(null, this, this.Aa);
            ArrayList arrayList = new ArrayList();
            org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, str, 0, true, 0, 0);
            ffVar.f27707a = charSequence;
            arrayList.add(ffVar);
            if (PhotoViewer.p1().P1()) {
                PhotoViewer.p1().z0(false, false);
            }
            PhotoViewer.p1().f2(arrayList, 0, 0, false, new vk(this, r10, arrayList), this);
            return;
        }
        D8(charSequence, null);
        org.telegram.messenger.c accountInstance = getAccountInstance();
        long j3 = this.f45259k6;
        org.telegram.messenger.gj gjVar = this.E5;
        org.telegram.messenger.gj gjVar2 = this.f45281m4;
        qm qmVar = this.C5;
        org.telegram.messenger.ez.b0(0, 0, 0, j3, 0L, 0L, j9(), null, str, null, null, accountInstance, gjVar, gjVar2, this.G5, this.f45422x5, Y8(), null, null, null, qmVar, true, false, false);
        L6();
    }

    public final void Rb(boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Rb(boolean, boolean, boolean):void");
    }

    public final void Rc() {
        int i7;
        org.telegram.ui.Components.cb cbVar;
        bk bkVar;
        qj qjVar;
        if (this.Z9 && this.A0 != null) {
            float f10 = 0.0f;
            if (this.La <= 0 || this.f45129ab != 0.0f) {
                float s9 = s9(org.telegram.messenger.g0.L(7.0f));
                ak akVar = this.D1;
                if (akVar != null) {
                    i7 = org.telegram.messenger.g0.L(akVar.F * 35.0f);
                } else {
                    i7 = 0;
                }
                float V8 = (V8() * org.telegram.messenger.g0.L(43.0f)) + s9 + i7;
                float f11 = this.O9;
                this.P9 = V8;
                this.O9 = t9(org.telegram.ui.Components.l11.f36700a) + org.telegram.messenger.g0.L(4.0f) + this.R9 + V8;
                if (this.actionBar.getVisibility() == 0 || this.f45452za != null) {
                    this.O9 += this.actionBar.getMeasuredHeight();
                }
                this.Q9 = 0;
                this.O9 = this.O9 + this.Wa + this.S9;
                if (this.f45129ab != 0.0f && (qjVar = this.f45118a0) != null && qjVar.getVisibility() == 0) {
                    float f12 = this.O9;
                    float measuredHeight = this.f45129ab * (this.f45118a0.getMeasuredHeight() - org.telegram.messenger.g0.L(44.0f));
                    this.O9 = f12 - measuredHeight;
                    f10 = measuredHeight;
                }
                org.telegram.ui.Cells.t0 t0Var = this.f45304o3;
                if (t0Var != null) {
                    t0Var.setTranslationY(((this.A0.getTranslationY() + this.O9) + this.W9) - org.telegram.messenger.g0.L(30.0f));
                    float f13 = this.O9;
                    float f14 = this.W9;
                    this.O9 = f13 + f14;
                    this.Q9 = (int) (this.Q9 + f14);
                }
                ij ijVar = this.f45280m3;
                if (ijVar != null) {
                    ijVar.setTranslationY((((this.A0.getTranslationY() - f10) + this.O9) + this.U9) - org.telegram.messenger.g0.L(4.0f));
                }
                Tc();
                aj ajVar = this.A0;
                if (ajVar != null && this.C0 != null && this.D0 != null) {
                    int paddingTop = ajVar.getPaddingTop();
                    int paddingBottom = this.A0.getPaddingBottom();
                    C7();
                    if (this.A0.getPaddingTop() != paddingTop || this.A0.getPaddingBottom() != paddingBottom) {
                        O9();
                    }
                    this.A0.setTopGlowOffset((int) ((this.O9 - this.Q9) - org.telegram.messenger.g0.L(4.0f)));
                    if (f11 != this.O9) {
                        int childCount = this.A0.getChildCount();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= childCount) {
                                break;
                            }
                            View childAt = this.A0.getChildAt(i10);
                            this.A0.getClass();
                            if (RecyclerView.R(childAt) == this.D0.b() - 1) {
                                float f15 = this.O9;
                                if (childAt.getTop() > f15) {
                                    this.A0.scrollBy(0, (int) (childAt.getTop() - f15));
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!fa() && !this.Q4 && this.f45126a8 != null && this.A0 != null && ((bkVar = this.f45176e2) == null || bkVar.getVisibility() != 0)) {
                        this.A0.scrollBy(0, (int) (f11 - this.O9));
                    }
                }
                this.Z9 = false;
                org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.f41635w;
                if (xbVar != null && (cbVar = xbVar.f41639e) != null) {
                    cbVar.updatePosition();
                }
                C7();
            }
        }
    }

    public final boolean S6() {
        if (!X9() && !getMessagesController().y2(a())) {
            if ((!getMessagesController().t2(a()) || this.f45408w4) && getMessagesController().N1(a()) <= 0 && this.h == null) {
                uj ujVar = this.f45162d1;
                if (ujVar == null || ujVar.getVisibility() != 0) {
                    if (!fa() || this.f45408w4) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void S7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.S7():void");
    }

    public final ArrayList S8() {
        jl jlVar = this.D0;
        if (jlVar != null) {
            return jlVar.Q;
        }
        return null;
    }

    public final boolean S9() {
        if (!org.telegram.messenger.gz.H0 && !this.f45415wb) {
            return false;
        }
        return true;
    }

    public final void Sa() {
        this.f45194f6 = true;
        this.fragmentBeginToShow = true;
        this.f45350ra = null;
        this.f45278m1.invalidate();
        this.f45278m1.setSkipBackgroundDrawing(false);
        this.f45310oa = false;
        this.fragmentView.setAlpha(1.0f);
        this.f45314p1.setTranslationY(0.0f);
        this.f45314p1.getAvatarImageView().setScaleX(1.0f);
        this.f45314p1.getAvatarImageView().setScaleY(1.0f);
        this.f45314p1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void Sb(int i7, int i10, String str) {
        this.f45155c8 = i7;
        this.f45182e8 = true;
        this.f45196f8 = 0L;
        this.f45208g8 = str;
        this.f45247j8 = i10;
        this.f45168d8 = true;
    }

    public final void Sc(boolean z10) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z11;
        org.telegram.messenger.bj bjVar;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.messenger.gj gjVar;
        ArrayList arrayList2 = new ArrayList(org.telegram.messenger.si.b0(this.currentAccount).Z0);
        if (this.f45401vb == null) {
            this.f45401vb = new a0.h();
        }
        a0.h hVar2 = this.f45388ub;
        if (hVar2 == null) {
            this.f45388ub = new a0.h();
        } else {
            hVar2.b();
        }
        this.D0.Q.clear();
        this.f45401vb.b();
        a0.h hVar3 = null;
        a0.h hVar4 = null;
        int i7 = 0;
        while (true) {
            int size = arrayList2.size();
            hVar = this.O6;
            arrayList = this.L6;
            z11 = true;
            if (i7 >= size) {
                break;
            }
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList2.get(i7);
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    gjVar = (org.telegram.messenger.gj) arrayList.get(i10);
                    if (org.telegram.messenger.gj.B0(gjVar.f23817k) == org.telegram.messenger.gj.B0(gjVar2.f23817k) && gjVar.e1() == gjVar2.e1()) {
                        break;
                    }
                    i10++;
                } else {
                    gjVar = null;
                    break;
                }
            }
            if (gjVar2.f23827m1 == 0) {
                if (gjVar == null) {
                    gjVar2.K(true);
                } else {
                    gjVar2.f23876z0 = gjVar.f23876z0;
                    gjVar2.f23872y0 = gjVar.f23872y0;
                }
            }
            if (gjVar != null) {
                gjVar2.f23831n2 = gjVar.f23831n2;
                if (this.D0.O && gjVar2.f23827m1 != 0) {
                    gjVar.N(gjVar2);
                } else {
                    gjVar2.N(gjVar);
                }
            } else if (gjVar2.f23827m1 == 0) {
                int i11 = f45110nd;
                f45110nd = i11 + 1;
                gjVar2.f23827m1 = i11;
            }
            gjVar2.W2 = null;
            TLRPC.Message message2 = gjVar2.f23817k;
            if (message2 != null) {
                message2.out = true;
            }
            gjVar2.P3();
            if (gjVar2.z2()) {
                org.telegram.messenger.bj bjVar2 = (org.telegram.messenger.bj) hVar.f(gjVar2.d1());
                if (bjVar2 == null) {
                    bjVar2 = new org.telegram.messenger.bj();
                    bjVar2.f22718n = this.mb;
                    long c12 = gjVar2.c1();
                    bjVar2.f22707a = c12;
                    hVar.k(bjVar2, c12);
                } else if (hVar3 == null || hVar3.h(gjVar2.c1()) < 0) {
                    if (hVar4 == null) {
                        hVar4 = new a0.h();
                    }
                    hVar4.k(bjVar2, gjVar2.c1());
                }
                ArrayList arrayList3 = bjVar2.d;
                if (hVar3 == null) {
                    hVar3 = new a0.h();
                }
                hVar3.k(bjVar2, bjVar2.f22707a);
                if (bjVar2.d(gjVar2) == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList3.size()) {
                            if (((org.telegram.messenger.gj) arrayList3.get(i12)).e1() == gjVar2.e1()) {
                                break;
                            }
                            i12++;
                        } else {
                            arrayList3.add(gjVar2);
                            break;
                        }
                    }
                }
            } else if (gjVar2.d1() != 0) {
                gjVar2.f23817k.grouped_id = 0L;
                gjVar2.f23789e = 0L;
            }
            this.D0.Q.add(gjVar2);
            this.f45401vb.k(gjVar2, gjVar2.e1());
            i7++;
        }
        if (hVar3 != null) {
            for (int i13 = 0; i13 < hVar3.m(); i13++) {
                org.telegram.messenger.bj bjVar3 = (org.telegram.messenger.bj) hVar3.n(i13);
                Collections.sort(bjVar3.d, new org.telegram.messenger.gl(29));
                bjVar3.a();
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (this.F3 != null && TextUtils.isEmpty(this.I3)) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList.get(i14);
                if (gjVar3 != null && (message = gjVar3.f23817k) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= gjVar3.f23817k.reactions.results.size()) {
                            break;
                        } else if (this.F3.f(gjVar3.f23817k.reactions.results.get(i15).reaction)) {
                            arrayList4.add(gjVar3);
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
        }
        for (int i16 = 0; i16 < arrayList4.size(); i16++) {
            org.telegram.messenger.gj gjVar4 = (org.telegram.messenger.gj) arrayList4.get(i16);
            if (!this.f45401vb.d(gjVar4.e1())) {
                gjVar4.W2 = null;
                TLRPC.Message message3 = gjVar4.f23817k;
                if (message3 != null) {
                    message3.out = true;
                }
                this.D0.Q.add(gjVar4);
                this.f45401vb.k(gjVar4, gjVar4.e1());
            }
        }
        int i17 = 0;
        while (i17 < this.D0.Q.size()) {
            org.telegram.messenger.gj gjVar5 = (org.telegram.messenger.gj) this.D0.Q.get(i17);
            if (gjVar5.z2() && (bjVar = (org.telegram.messenger.bj) hVar.f(gjVar5.c1())) != null) {
                ArrayList arrayList5 = bjVar.d;
                for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                    org.telegram.messenger.gj gjVar6 = (org.telegram.messenger.gj) arrayList5.get(size2);
                    if (gjVar6 != gjVar5 && !this.f45401vb.d(gjVar6.e1())) {
                        this.D0.Q.add(i17, gjVar6);
                        this.f45401vb.k(gjVar6, gjVar6.e1());
                        i17++;
                    }
                }
            }
            i17++;
        }
        Collections.sort(this.D0.Q, new me(0));
        org.telegram.messenger.gj gjVar7 = null;
        int i18 = 0;
        while (i18 < this.D0.Q.size()) {
            org.telegram.messenger.gj gjVar8 = (org.telegram.messenger.gj) this.D0.Q.get(i18);
            if (this.mb && gjVar8 != null && i18 == 0) {
                fb(i18, gjVar8);
                i18++;
            }
            if (!this.mb && gjVar7 != null && gjVar8.X != gjVar7.X) {
                fb(i18, gjVar7);
                i18++;
            }
            a0.h hVar5 = this.f45388ub;
            int i19 = gjVar8.X;
            ArrayList arrayList6 = (ArrayList) hVar5.f(i19);
            if (arrayList6 == null) {
                arrayList6 = org.telegram.messenger.k5.i(this.f45388ub, i19);
            }
            arrayList6.add(gjVar8);
            if (this.mb && gjVar7 != null && i19 != gjVar7.X) {
                fb(i18, gjVar8);
                i18++;
            }
            if (!this.mb && i18 >= this.D0.Q.size() - 1) {
                fb(this.D0.Q.size(), gjVar8);
                i18++;
            }
            i18++;
            gjVar7 = gjVar8;
        }
        this.D0.P = org.telegram.messenger.si.b0(this.currentAccount).W1();
        if (z10) {
            this.D0.T();
            this.D0.O(true);
            if (this.D0.O ? getMediaDataController().M0 == 0 || !this.D0.Q.isEmpty() : !this.X6 || !arrayList.isEmpty() || this.D0.f48378x >= 0) {
                z11 = false;
            }
            wc(z11);
            if (this.A0 != null) {
                W7(false);
                if (this.D0.O ? !(getMediaDataController().M0 == 0 && this.D0.Q.isEmpty()) : !(!this.X6 && arrayList.isEmpty() && this.D0.f48378x < 0)) {
                    this.f45189f1.setVisibility(8);
                    this.A0.setEmptyView(null);
                    return;
                }
                this.A0.setEmptyView(this.f45189f1);
                aj ajVar = this.A0;
                ajVar.K0(ajVar.w1());
            }
        }
    }

    public final boolean T6() {
        if (this.h == null) {
            uj ujVar = this.f45162d1;
            if (ujVar == null || ujVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void T7() {
        if (this.f45190f2 == null && getParentActivity() != null) {
            f8();
            if (this.f45134b1 != null) {
                TextView textView = new TextView(getParentActivity());
                this.f45190f2 = textView;
                textView.setGravity(17);
                this.f45190f2.setTextSize(1, 14.0f);
                this.f45190f2.setTypeface(org.telegram.messenger.g0.o());
                TextView textView2 = this.f45190f2;
                int i7 = org.telegram.ui.ActionBar.j6.Fi;
                org.telegram.ui.ActionBar.q6.U(textView2, i7, getResourceProvider());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "icon");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(2131232478, 0), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131745516, null));
                this.f45190f2.setText(spannableStringBuilder);
                TextView textView3 = this.f45190f2;
                int r12 = org.telegram.ui.ActionBar.j6.r1(0.1f, getThemedColor(i7));
                int L = org.telegram.messenger.g0.L(3.0f);
                org.telegram.ui.ActionBar.q6.Q(textView3, org.telegram.ui.ActionBar.j6.Y(org.telegram.messenger.g0.L(15.0f), r12, L, L, L, L), null, org.telegram.ui.ActionBar.q6.K(0.1f, i7), getResourceProvider());
                this.f45190f2.setOnClickListener(new le(this, 20));
                c8.na.b(this.f45190f2, 0.04f, 1.5f);
                this.f45134b1.addView(this.f45190f2, c8.ja.r(-1, 36, 83));
                this.f45134b1.h(12, this.f45190f2);
                this.f45134b1.g(this.f45190f2);
            }
        }
    }

    public final ri.q T8() {
        an anVar = this.f45452za;
        if (anVar != null) {
            return anVar.T8();
        }
        return this.glassEngine;
    }

    public final boolean T9() {
        if (!org.telegram.messenger.t3.c0(this.f45173e) || this.f45408w4) {
            if (org.telegram.messenger.t3.p0(this.f45173e) && b() == 0 && !this.f45231i4) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void Ta(long j3, boolean z10) {
        if (this.f45202g2 != null && org.telegram.messenger.q10.u(this.f45187f)) {
            this.f45202g2.setAllTopicsHidden(true);
        }
        this.f45166d6.put(j3, 1);
        h8();
        UndoView undoView = this.N3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f45259k6, 0, new mg(this, j3, z10), new bg.j0(this, j3, 3));
        this.D0.O(false);
    }

    public final void Tb(long j3) {
        this.f45358s4 = j3;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28072id = (int) j3;
        new org.telegram.messenger.gj(this.currentAccount, tL_message, false, false);
    }

    public final void Tc() {
        int i7;
        gj gjVar = this.f45291n3;
        if (gjVar == null) {
            return;
        }
        gjVar.setTranslationX(n9() / 2.0f);
        this.f45291n3.setTranslationY((((this.A0.getTranslationY() + this.O9) + this.V9) - org.telegram.messenger.g0.L(4.0f)) + org.telegram.messenger.g0.L(28.0f));
        float i10 = Utilities.i(org.telegram.messenger.g0.z1(this.V9, -this.f45291n3.getHeight(), 0.0f), 1.0f, 0.0f);
        this.f45291n3.setAlpha(this.f45420x3 * i10);
        gj gjVar2 = this.f45291n3;
        if (this.f45420x3 * i10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        gjVar2.setVisibility(i7);
        float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, i10);
        this.f45291n3.setScaleX(T1);
        this.f45291n3.setScaleY(T1);
    }

    public final boolean U6(org.telegram.messenger.gj gjVar) {
        if (this.f45204g4 != 8) {
            if (gjVar != null && org.telegram.messenger.t3.c0(this.f45173e)) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f25383r7.f(this.f45173e.f28051id, org.telegram.messenger.gj.b2(this.currentAccount, gjVar.f23817k, true, false));
                if (this.f45204g4 == 8 || (f10 != null && (!f10.closed || org.telegram.messenger.t3.i(this.currentAccount, this.f45173e, f10)))) {
                    return true;
                }
                return false;
            } else if (gjVar == null || !org.telegram.messenger.t3.p0(this.f45173e) || !org.telegram.messenger.t3.A(this.currentAccount, this.f45173e, 24) || org.telegram.messenger.gj.u1(gjVar.f23817k) == 0) {
                return false;
            }
        }
        return true;
    }

    public final void U7() {
        if (getParentActivity() != null && getParentActivity() != null && this.Y1 == null) {
            fi.p2 p2Var = new fi.p2(this, getParentActivity(), this, this.Aa, 2);
            this.Y1 = p2Var;
            p2Var.U1 = a();
            fi.p2 p2Var2 = this.Y1;
            p2Var2.d2 = true;
            p2Var2.X3 = new sk(this);
        }
    }

    public final org.telegram.messenger.bj U8(long j3) {
        return (org.telegram.messenger.bj) this.O6.f(j3);
    }

    public final boolean U9() {
        return org.telegram.messenger.q10.u(this.f45187f);
    }

    public final boolean Ua() {
        if (this.U4.size() != 1 || this.f45292n4 == null || ((Integer) this.U4.get(0)).intValue() != this.f45292n4.e1()) {
            return false;
        }
        return true;
    }

    public final void Ub(View view) {
        View view2 = this.Y8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof org.telegram.ui.Cells.t0)) {
                ((org.telegram.ui.Cells.t0) view2).setInvalidateWithParent(null);
            }
            this.Y8 = view;
            if (view instanceof org.telegram.ui.Cells.t0) {
                ((org.telegram.ui.Cells.t0) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void Uc() {
        boolean z10;
        int i7;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().e() && (userFull = this.f45348r8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().q()) && this.f45348r8.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f45201g1 != null) {
            if (z10 && this.f45228i1 == null) {
                bi biVar = new bi(getParentActivity(), getResourceProvider(), this);
                this.f45228i1 = biVar;
                c8.na.b(biVar, 0.02f, 1.2f);
                this.f45228i1.setOnClickListener(new le(this, 12));
            }
            bi biVar2 = this.f45228i1;
            if (biVar2 != null) {
                if (!z10) {
                    biVar2.setVisibility(8);
                    return;
                }
                biVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f45348r8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f45348r8.business_intro.title)) {
                    i7 = 2131749501;
                } else {
                    i7 = 2131749502;
                }
                String a02 = org.telegram.messenger.hd.a0(null, null, i7, org.telegram.messenger.q10.j(this.f45187f, true));
                int indexOf = a02.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                if (indexOf > 0) {
                    a02 = a02.substring(0, indexOf) + a02.substring(indexOf + 2);
                    int indexOf2 = a02.indexOf("**");
                    if (indexOf2 > 0) {
                        a02 = a02.substring(0, indexOf2) + a02.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(a02);
                        tw0 tw0Var = new tw0(a02.substring(indexOf, indexOf2));
                        if (tw0Var.f51680c != -1) {
                            tw0Var.f51680c = -1;
                            tw0Var.invalidateSelf();
                        }
                        tw0Var.a(503316480);
                        tw0Var.setBounds(0, 0, tw0Var.getIntrinsicWidth(), org.telegram.messenger.g0.L(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(tw0Var), indexOf, indexOf2, 33);
                    }
                }
                this.f45228i1.setCustomText(spannableStringBuilder);
                this.f45228i1.setOverrideTextMaxWidth(hi.l3.a(a02, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.f45228i1.getParent() != null && (!z10 || this.f45228i1.getParent() != this.f45201g1)) {
                    ((ViewGroup) this.f45228i1.getParent()).removeView(this.f45228i1);
                }
                if (z10) {
                    ViewParent parent = this.f45228i1.getParent();
                    LinearLayout linearLayout = this.f45201g1;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.f45228i1, c8.ja.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    public final void V6(boolean z10) {
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.User user2;
        boolean z11;
        final boolean z12;
        float f10;
        float f11;
        float f12;
        float f13;
        int i7;
        float f14;
        float f15;
        float f16;
        float f17;
        int i10;
        TLRPC.EncryptedChat encryptedChat = this.h;
        boolean z13 = true;
        int i11 = 8;
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.f45173e != null && (this.f45204g4 != 0 || this.f45358s4 != 0 || (chatFull = this.f45334q8) == null || chatFull.ttl_period == 0)) || ((user = this.f45187f) != null && (org.telegram.messenger.q10.x(user) || (this.h == null && ((userFull = this.f45348r8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.o0 o0Var = this.f45174e0;
            if (o0Var != null) {
                o0Var.e(8);
            }
            ui uiVar = this.f45314p1;
            if (uiVar != null) {
                uiVar.f39346a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.o0 o0Var2 = this.f45174e0;
            if (o0Var2 != null) {
                o0Var2.e(0);
            }
            ui uiVar2 = this.f45314p1;
            if (uiVar2 != null) {
                uiVar2.f39346a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.o0 o0Var3 = this.f45390v0;
        if (o0Var3 != null) {
            TLRPC.Chat chat = this.f45173e;
            if (chat != null && chat.forum) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            o0Var3.e(i10);
        }
        ui uiVar3 = this.f45314p1;
        if (uiVar3 != null) {
            TLRPC.Chat chat2 = this.f45173e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f45187f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            uiVar3.setCommunityItemVisible(z11);
            final ui uiVar4 = this.f45314p1;
            TLRPC.Chat chat3 = this.f45173e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = uiVar4.F;
            ImageView imageView2 = uiVar4.E;
            if (imageView2 != null && imageView != null) {
                uiVar4.f39364n0 = z12;
                float f18 = 1.1f;
                float f19 = 1.0f;
                if (!z10) {
                    int i12 = 4;
                    if (z12) {
                        i7 = 0;
                    } else {
                        i7 = 4;
                    }
                    imageView2.setVisibility(i7);
                    if (z12) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    imageView2.setAlpha(f14);
                    if (z12) {
                        f15 = 1.1f;
                    } else {
                        f15 = 0.0f;
                    }
                    imageView2.setScaleX(f15);
                    if (!z12) {
                        f18 = 0.0f;
                    }
                    imageView2.setScaleY(f18);
                    if (z12) {
                        i12 = 0;
                    }
                    imageView.setVisibility(i12);
                    if (z12) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    imageView.setAlpha(f16);
                    if (z12) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    imageView.setScaleX(f17);
                    if (!z12) {
                        f19 = 0.0f;
                    }
                    imageView.setScaleY(f19);
                } else {
                    if (z12) {
                        imageView2.setVisibility(0);
                        imageView.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = imageView2.animate();
                    if (z12) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f10);
                    if (z12) {
                        f11 = 1.1f;
                    } else {
                        f11 = 0.0f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                    if (!z12) {
                        f18 = 0.0f;
                    }
                    scaleX.scaleY(f18).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    boolean z14 = z12;
                                    sn snVar = uiVar4;
                                    if (!z14) {
                                        snVar.E.setVisibility(4);
                                        return;
                                    } else {
                                        snVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    sn snVar2 = uiVar4;
                                    if (!z15) {
                                        snVar2.F.setVisibility(4);
                                        return;
                                    } else {
                                        snVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                    ViewPropertyAnimator animate2 = imageView.animate();
                    if (z12) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    ViewPropertyAnimator alpha2 = animate2.alpha(f12);
                    if (z12) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                    if (!z12) {
                        f19 = 0.0f;
                    }
                    scaleX2.scaleY(f19).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    boolean z14 = z12;
                                    sn snVar = uiVar4;
                                    if (!z14) {
                                        snVar.E.setVisibility(4);
                                        return;
                                    } else {
                                        snVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    sn snVar2 = uiVar4;
                                    if (!z15) {
                                        snVar2.F.setVisibility(4);
                                        return;
                                    } else {
                                        snVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.f45314p1.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.f45348r8;
                if (userFull2 != null) {
                    this.f45314p1.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.f45334q8;
                    if (chatFull3 != null) {
                        this.f45314p1.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f45377u0 != null && (chatFull2 = this.f45334q8) != null) {
            if (!chatFull2.can_delete_channel && org.telegram.messenger.t3.T(this.f45173e)) {
                TLRPC.Chat chat4 = this.f45173e;
                if (!chat4.megagroup || org.telegram.messenger.t3.t0(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.o0 o0Var4 = this.f45377u0;
            if (z13) {
                i11 = 0;
            }
            o0Var4.e(i11);
        }
        s();
    }

    public final void V7(org.telegram.messenger.gj gjVar, org.telegram.messenger.bj bjVar, boolean z10) {
        uf ufVar;
        if (gjVar == null) {
            SparseArray[] sparseArrayArr = this.f45294n6;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f45187f;
        TLRPC.Chat chat = this.f45173e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.f45334q8;
        long j3 = this.f45154c7;
        int b10 = (int) b();
        int i7 = this.f45204g4;
        ye yeVar = new ye(this, 29);
        if (z10) {
            ufVar = new uf(this, 0);
        } else {
            ufVar = null;
        }
        uf ufVar2 = ufVar;
        org.telegram.ui.Components.t4.y(this, user, chat, encryptedChat, chatFull, j3, gjVar, this.f45294n6, bjVar, b10, i7, null, yeVar, ufVar2, this.Aa);
    }

    public final float V8() {
        an anVar = this.f45452za;
        if (anVar == null) {
            anVar = this;
        }
        nj njVar = anVar.E1;
        if (njVar == null) {
            return 0.0f;
        }
        return njVar.f37330b;
    }

    public boolean V9() {
        if (this.f45278m1.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f)) {
            return true;
        }
        return false;
    }

    public final void Va() {
        org.telegram.ui.Cells.q1 q1Var;
        this.f45172dd.a(false, true);
        sh.b bVar = this.f45252jd;
        if (bVar != null && (q1Var = bVar.f56851n) != null && q1Var.getDelegate() != null) {
            bVar.f56851n.getDelegate().F1(bVar.f56851n, false);
        }
        qj qjVar = this.f45118a0;
        if (qjVar != null) {
            qjVar.l1(true, true, false);
            this.f45118a0.f32286s6 = null;
        }
    }

    public final void Vb(ArrayList arrayList, TLRPC.Chat chat, int i7, int i10, int i11, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.f45344r4 = tL_forumTopic;
        this.f45317p4 = arrayList;
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList);
        this.f45281m4 = gjVar;
        this.E5 = gjVar;
        this.f45446z4 = i10;
        this.A4 = i11;
        this.B4 = Math.max(1, i10);
        this.f45358s4 = this.f45281m4.e1();
        this.f45369t4 = i7;
        this.f45381u4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45408w4 = z10;
        org.telegram.messenger.gj gjVar2 = this.E5;
        TLRPC.MessageFwdHeader messageFwdHeader = gjVar2.f23817k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45394v4 = z11;
        if (z10) {
            gjVar2.f23836p = true;
        }
        hd();
        zd(false);
        Pc(false);
    }

    public final void Vc() {
        final long j3;
        int i7;
        boolean z10;
        int i10;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String a02;
        if (this.f45215h1 == null) {
            return;
        }
        String str = null;
        if (org.telegram.messenger.t3.p0(this.f45173e)) {
            if (this.f45173e != null) {
                chat = getMessagesController().v1(this.f45173e.f28051id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.f45173e) != null && !org.telegram.messenger.t3.A(this.currentAccount, chat2, 24)) {
                final long j10 = this.f45173e.send_paid_messages_stars;
                int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i11 > 0) {
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131744349, org.telegram.messenger.m5.t(-chat.f28051id), org.telegram.messenger.hd.E(j10, ','));
                } else {
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131744332, org.telegram.messenger.m5.t(-chat.f28051id));
                }
                SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(di.mb.U0(a02, 1.0f, null));
                if (i11 > 0) {
                    str = org.telegram.messenger.hd.M0(2131748472, null);
                }
                this.f45215h1.c(true, true, V2, str, new View.OnClickListener(this) {
                    public final an f48985b;

                    {
                        this.f48985b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                an.d0(j10, this.f48985b);
                                return;
                            default:
                                an.y0(j10, this.f48985b);
                                return;
                        }
                    }
                });
                return;
            }
            this.f45215h1.c(false, false, null, null, null);
        } else if (a() != getUserConfig().e()) {
            TLRPC.UserFull userFull = this.f45348r8;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.xn xnVar = this.f45215h1;
                boolean z11 = !getUserConfig().q();
                if (getMessagesController().D3()) {
                    i10 = 2131748581;
                } else {
                    i10 = 2131748582;
                }
                xnVar.c(z11, false, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i10, org.telegram.messenger.m5.t(this.f45259k6))), org.telegram.messenger.hd.M0(2131748538, null), new bi.o(11));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.xn xnVar2 = this.f45215h1;
                if (i7 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xnVar2.c(z10, false, org.telegram.messenger.g0.V2(di.mb.U0(org.telegram.messenger.hd.a0(null, null, 2131748580, org.telegram.messenger.m5.t(this.f45259k6), org.telegram.messenger.hd.E(this.f45348r8.send_paid_messages_stars, ',')), 1.0f, null)), org.telegram.messenger.hd.M0(2131748472, null), new View.OnClickListener(this) {
                    public final an f48985b;

                    {
                        this.f48985b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                an.d0(j3, this.f48985b);
                                return;
                            default:
                                an.y0(j3, this.f48985b);
                                return;
                        }
                    }
                });
            } else {
                this.f45215h1.c(false, false, null, null, null);
            }
        } else {
            this.f45215h1.c(false, false, null, null, null);
        }
    }

    public final void W6() {
        if (this.f45276lb) {
            return;
        }
        if (Y9()) {
            org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
    }

    public final void W7(boolean z10) {
        TLRPC.User user;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.User user2;
        TLRPC.Chat chat;
        Paint paint;
        int i7;
        TL_account.TL_businessIntro tL_businessIntro2;
        if ((this.f45189f1 == null || z10) && getParentActivity() != null) {
            FrameLayout frameLayout = this.f45189f1;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
                this.f45189f1 = frameLayout2;
                frameLayout2.setVisibility(4);
                this.f45278m1.addView(this.f45189f1, 3, c8.ja.e(-1, -2, 17));
            } else {
                frameLayout.removeAllViews();
            }
            this.f45189f1.setTranslationX(n9() / 2.0f);
            int i10 = 1;
            String str = null;
            if (this.D0.O) {
                TextView textView = new TextView(getParentActivity());
                this.f45328q2 = textView;
                textView.setText(org.telegram.messenger.hd.M0(2131748210, null));
                this.f45328q2.setTextSize(1, 14.0f);
                this.f45328q2.setGravity(17);
                org.telegram.ui.ActionBar.q6.U(this.f45328q2, org.telegram.ui.ActionBar.j6.Zc, getResourceProvider());
                this.f45328q2.setBackground(new org.telegram.ui.ActionBar.v5(this.f45328q2, this.f45278m1, org.telegram.messenger.g0.L(6.0f), getThemedPaint("paintChatActionBackground")));
                this.f45328q2.setTypeface(org.telegram.messenger.g0.o());
                this.f45328q2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(3.0f));
                this.f45189f1.addView(this.f45328q2, new FrameLayout.LayoutParams(-2, -2, 17));
            } else if (X9()) {
                kg.w1 w1Var = new kg.w1(getParentActivity(), this.f45204g4, this.f45358s4, this.f45192f4, getResourceProvider());
                this.f45241j1 = w1Var;
                int L = org.telegram.messenger.g0.L(24.0f);
                kg.w1 w1Var2 = this.f45241j1;
                ol olVar = this.f45278m1;
                Paint themedPaint = getThemedPaint("paintChatActionBackground");
                int i11 = org.telegram.ui.ActionBar.j6.f28784a;
                w1Var.setBackground(new org.telegram.ui.ActionBar.v5(w1Var2, olVar, L, themedPaint));
                this.f45189f1.addView(this.f45241j1, c8.ja.e(-2, -2, 17));
                this.l1.d(this.f45241j1, this.f45278m1, new org.telegram.messenger.fd(25), false);
            } else if (this.f45204g4 == 6) {
                Activity parentActivity = getParentActivity();
                TL_account.TL_businessChatLink tL_businessChatLink = this.f45178e4;
                org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
                ?? linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                int i12 = org.telegram.ui.ActionBar.j6.Zc;
                org.telegram.ui.ActionBar.j6.w0(i12, resourceProvider);
                org.telegram.ui.ActionBar.j6.v0(i12);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(2131231096);
                linearLayout.addView(imageView, c8.ja.t(78, 78, 49, 17, 17, 17, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextAlignment(4);
                textView2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.q6.U(textView2, i12, resourceProvider);
                textView2.setGravity(1);
                textView2.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131752702, null)));
                linearLayout.addView(textView2, c8.ja.t(-2, -2, 49, 17, 0, 17, 9));
                TextView textView3 = new TextView(parentActivity);
                textView3.setTextAlignment(4);
                textView3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.q6.U(textView3, i12, resourceProvider);
                textView3.setTypeface(textView3.getTypeface(), 1);
                textView3.setGravity(1);
                textView3.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                String str2 = tL_businessChatLink.link;
                kg.y[] yVarArr = kg.y.f18141e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                textView3.setText(str2);
                textView3.setBackground(org.telegram.ui.ActionBar.j6.b0(503316480, 503316480, 5, 5));
                textView3.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
                textView3.setOnClickListener(new ai.t2(23, tL_businessChatLink, this));
                linearLayout.addView(textView3, c8.ja.t(-2, -2, 49, 17, 0, 17, 17));
                this.f45254k1 = linearLayout;
                linearLayout.setBackground(new org.telegram.ui.ActionBar.v5(this.f45254k1, this.f45278m1, org.telegram.messenger.g0.L(24.0f), getThemedPaint("paintChatActionBackground")));
                this.f45189f1.addView(this.f45254k1, c8.ja.e(-2, -2, 17));
            } else if ((this.X9 != null && this.f45187f != null && !this.f45288n) || (this.f45348r8 != null && a() != getUserConfig().e() && ((this.f45348r8.contact_require_premium && !getUserConfig().q()) || this.f45348r8.send_paid_messages_stars > di.v8.y(this.currentAccount, false).p().amount))) {
                this.f45215h1 = new zh(this, getParentActivity(), this.currentAccount, this.X9, this.Aa);
                Vc();
                this.f45215h1.setListener(new ce(this, 4));
                LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                this.f45201g1 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f45201g1.setGravity(17);
                this.f45201g1.addView(this.f45215h1, c8.ja.e(-2, -2, 17));
                this.f45189f1.addView(this.f45201g1, c8.ja.e(-1, -2, 17));
                TLRPC.UserFull userFull = this.f45348r8;
                if (userFull != null && (tL_businessIntro2 = userFull.business_intro) != null) {
                    this.f45215h1.d(tL_businessIntro2.title, tL_businessIntro2.description);
                    this.f45215h1.setSticker(this.f45348r8.business_intro.sticker);
                }
                Uc();
            } else if (this.h == null) {
                if (this.f45408w4 && this.f45204g4 == 0) {
                    Activity parentActivity2 = getParentActivity();
                    ol olVar2 = this.f45278m1;
                    ym ymVar = this.Aa;
                    LinearLayout linearLayout3 = new LinearLayout(parentActivity2);
                    int L2 = org.telegram.messenger.g0.L(18.0f);
                    if (ymVar != null) {
                        paint = ymVar.d("paintChatActionBackground");
                    } else {
                        paint = null;
                    }
                    if (paint == null) {
                        paint = org.telegram.ui.ActionBar.j6.V0("paintChatActionBackground");
                    }
                    int i13 = org.telegram.ui.ActionBar.j6.f28784a;
                    linearLayout3.setBackground(new org.telegram.ui.ActionBar.v5(linearLayout3, olVar2, L2, paint));
                    linearLayout3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
                    linearLayout3.setOrientation(1);
                    org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(parentActivity2);
                    if (org.telegram.ui.ActionBar.j6.i1(ymVar)) {
                        i7 = org.telegram.ui.ActionBar.j6.Ja;
                    } else {
                        i7 = org.telegram.ui.ActionBar.j6.Zc;
                    }
                    TextView textView4 = new TextView(parentActivity2);
                    org.telegram.messenger.i20.o(textView4, 1, 15.0f);
                    org.telegram.ui.ActionBar.q6.U(textView4, i7, ymVar);
                    textView4.setGravity(1);
                    textView4.setMaxWidth(org.telegram.messenger.g0.L(210.0f));
                    textView4.setText(org.telegram.messenger.hd.M0(2131754272, null));
                    TextView textView5 = new TextView(parentActivity2);
                    textView5.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.q6.U(textView5, i7, ymVar);
                    textView5.setGravity(1);
                    textView5.setMaxWidth(org.telegram.messenger.g0.L(160.0f));
                    textView5.setText(org.telegram.messenger.hd.M0(2131744019, null));
                    linearLayout3.addView(i9Var, c8.ja.t(58, 58, 1, 0, 8, 0, 8));
                    linearLayout3.addView(textView4, c8.ja.t(-2, -2, 1, 0, 0, 2, 0));
                    linearLayout3.addView(textView5, c8.ja.r(-2, -2, 1));
                    TLRPC.Document T = org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24934t0).T("🥳");
                    if (T != null) {
                        org.telegram.messenger.pz d = org.telegram.messenger.t5.d(T.thumbs, org.telegram.ui.ActionBar.j6.f28832c7, 0.2f, false);
                        if (d != null) {
                            d.f26029e = 512;
                            d.f26030f = 512;
                        }
                        i9Var.k(org.telegram.messenger.gc.b(T), null, "tgs", d, null);
                    }
                    this.f45189f1.addView(linearLayout3, new FrameLayout.LayoutParams(-2, -2, 17));
                } else if (!fa() && this.f45204g4 == 0 && (((user2 = this.f45187f) != null && user2.self) || ((chat = this.f45173e) != null && chat.creator && !org.telegram.messenger.t3.V(chat)))) {
                    Activity parentActivity3 = getParentActivity();
                    ol olVar3 = this.f45278m1;
                    if (this.f45173e == null) {
                        i10 = 2;
                    }
                    org.telegram.ui.Components.tn tnVar = new org.telegram.ui.Components.tn(parentActivity3, olVar3, i10, this.Aa);
                    this.n1 = tnVar;
                    this.f45189f1.addView(tnVar, new FrameLayout.LayoutParams(-2, -2, 17));
                    if (this.f45173e != null) {
                        this.n1.setStatusText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749438, null)));
                    }
                } else {
                    if (fa() && this.f45204g4 == 0) {
                        str = this.f45394v4 ? org.telegram.messenger.hd.M0(2131748226, null) : org.telegram.messenger.hd.M0(2131748168, null);
                    } else if (this.f45204g4 == 1) {
                        str = org.telegram.messenger.hd.M0(2131748161, null);
                    } else {
                        TLRPC.User user3 = this.f45187f;
                        if (user3 != null) {
                            long j3 = user3.f28200id;
                            if (j3 != 777000 && j3 != 429000 && j3 != 4244000 && org.telegram.messenger.np.F2(user3)) {
                                str = org.telegram.messenger.hd.M0(2131749532, null);
                            }
                        }
                        if (this.f45204g4 != 8 && ((user = this.f45187f) == null || user.self || user.deleted || this.f45288n)) {
                            str = org.telegram.messenger.hd.M0(2131748193, null);
                        }
                    }
                    if (str == null) {
                        this.f45215h1 = new ai(this, getParentActivity(), this.currentAccount, this.X9, this.Aa);
                        Vc();
                        this.f45215h1.setListener(new ce(this, 5));
                        TLRPC.UserFull userFull2 = this.f45348r8;
                        if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null) {
                            this.f45215h1.d(tL_businessIntro.title, tL_businessIntro.description);
                            this.f45215h1.setSticker(this.f45348r8.business_intro.sticker);
                        }
                        LinearLayout linearLayout4 = new LinearLayout(getParentActivity());
                        this.f45201g1 = linearLayout4;
                        linearLayout4.setOrientation(1);
                        this.f45201g1.setGravity(17);
                        this.f45201g1.addView(this.f45215h1, c8.ja.e(-2, -2, 17));
                        this.f45189f1.addView(this.f45201g1, c8.ja.e(-1, -2, 17));
                        Uc();
                        return;
                    }
                    TextView textView6 = new TextView(getParentActivity());
                    this.f45328q2 = textView6;
                    textView6.setText(str);
                    this.f45328q2.setTextSize(1, 14.0f);
                    this.f45328q2.setGravity(17);
                    org.telegram.ui.ActionBar.q6.U(this.f45328q2, org.telegram.ui.ActionBar.j6.Zc, getResourceProvider());
                    this.f45328q2.setBackground(new org.telegram.ui.ActionBar.v5(this.f45328q2, this.f45278m1, org.telegram.messenger.g0.L(30.0f), getThemedPaint("paintChatActionBackground")));
                    this.f45328q2.setTypeface(org.telegram.messenger.g0.o());
                    this.f45328q2.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(3.0f));
                    this.f45189f1.addView(this.f45328q2, new FrameLayout.LayoutParams(-2, -2, 17));
                }
            } else {
                this.n1 = new org.telegram.ui.Components.tn(getParentActivity(), this.f45278m1, 0, this.Aa);
                if (this.h.admin_id == getUserConfig().e()) {
                    this.n1.setStatusText(org.telegram.messenger.hd.a0(null, null, 2131751133, org.telegram.messenger.q10.j(this.f45187f, true)));
                } else {
                    this.n1.setStatusText(org.telegram.messenger.hd.a0(null, null, 2131751134, org.telegram.messenger.q10.j(this.f45187f, true)));
                }
                this.f45189f1.addView(this.n1, new FrameLayout.LayoutParams(-2, -2, 17));
            }
        }
    }

    public final int W8(org.telegram.messenger.gj gjVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.H9 == null) {
            this.H9 = new org.telegram.ui.Cells.q1(getParentActivity(), this.currentAccount, true, this.Ya, this.Aa);
        }
        org.telegram.ui.Cells.q1 q1Var = this.H9;
        if (this.f45173e == null && !org.telegram.messenger.q10.B(this.f45187f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        q1Var.f30975f6 = z11;
        org.telegram.ui.Cells.q1 q1Var2 = this.H9;
        int i7 = this.f45204g4;
        if (i7 == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        q1Var2.f31001h6 = z12;
        if (i7 == 3 && this.f45276lb) {
            z13 = true;
        } else {
            z13 = false;
        }
        q1Var2.f31014i6 = z13;
        TLRPC.User user = this.f45187f;
        if (user != null && user.bot) {
            z14 = true;
        } else {
            z14 = false;
        }
        q1Var2.f31026j6 = z14;
        if (org.telegram.messenger.t3.T(this.f45173e) && this.f45173e.megagroup) {
            z15 = true;
        }
        q1Var2.f31040k6 = z15;
        this.H9.W6 = Q9();
        this.H9.X6 = ba();
        this.H9.Y6 = aa();
        return this.H9.r0(gjVar, (org.telegram.messenger.bj) this.O6.f(gjVar.c1()), z10);
    }

    public final boolean W9() {
        if (this.f45173e != null) {
            return getMessagesController().o2(this.f45173e);
        }
        org.telegram.messenger.np messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.f45348r8;
        messagesController.getClass();
        return org.telegram.messenger.np.K2(userFull);
    }

    public final void Wa(org.telegram.ui.Cells.q1 q1Var) {
        sh.b bVar;
        if (this.f45172dd.f57082f && (bVar = this.f45252jd) != null && bVar.f56851n == q1Var) {
            Editable text = bVar.f56846a.getText();
            int length = text.length();
            if (length != 0 && length <= ((org.telegram.messenger.j0) getMessagesController().f25448y7.I.f15881b).f24493c) {
                org.telegram.messenger.ez C = org.telegram.messenger.ez.C(this.currentAccount);
                org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
                sh.c attachedMedia = this.f45252jd.getAttachedMedia();
                if (messageObject != null) {
                    TLRPC.MessageMedia m12 = org.telegram.messenger.gj.m1(messageObject);
                    if (m12 instanceof TLRPC.TL_messageMediaPoll) {
                        long B0 = org.telegram.messenger.gj.B0(messageObject.f23817k);
                        messageObject.e1();
                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
                        tL_inputPollAnswer.text = new TLRPC.TL_textWithEntities();
                        tL_inputPollAnswer.option = r9;
                        byte[] bArr = {(byte) (((TLRPC.TL_messageMediaPoll) m12).poll.answers.size() + 48)};
                        CharSequence[] charSequenceArr = {text};
                        tL_inputPollAnswer.text.entities = C.getMediaDataController().W(charSequenceArr, true, true);
                        tL_inputPollAnswer.text.text = charSequenceArr[0].toString();
                        if (attachedMedia instanceof th.d) {
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(((th.d) attachedMedia).f57648c);
                            org.telegram.messenger.ez.X(C.getAccountInstance(), arrayList, B0, null, null, null, null, false, false, messageObject, tL_inputPollAnswer, false, 0, 0, false, null, null, 0L, false, 0L, 0L, null, null, false);
                        } else if (attachedMedia instanceof th.h) {
                            th.h hVar = (th.h) attachedMedia;
                            C.t(messageObject, tL_inputPollAnswer, null, null, (TLRPC.TL_document) hVar.f57659b, null, null, null, false, false, hVar.f57660c);
                        } else if (attachedMedia instanceof th.f) {
                            tL_inputPollAnswer.input_media = cg.d.h(((th.f) attachedMedia).f57656b);
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else if (attachedMedia instanceof th.e) {
                            TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                            tL_inputMediaWebPage.url = ((th.e) attachedMedia).f57649b;
                            tL_inputMediaWebPage.optional = true;
                            tL_inputPollAnswer.input_media = tL_inputMediaWebPage;
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else {
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        }
                    }
                }
                Va();
                return;
            }
            org.telegram.messenger.g0.E3(this.f45252jd.f56846a);
        }
    }

    public final void Wb(ol olVar) {
        if (this.f45240j0 != null && !this.inPreviewMode && !this.f45276lb && this.f45452za == null && (this.fragmentView instanceof FrameLayout)) {
            ui.f fVar = this.K;
            if (fVar != null) {
                ui.f fVar2 = this.J;
                if (fVar2 == null) {
                    fVar2 = fVar;
                }
                ui.d dVar = new ui.d(fVar2, fVar);
                dh.c cVar = new dh.c(dVar, dVar, dVar);
                cVar.f8097k = true;
                cVar.f8096j = T8();
                cVar.h = this.l1;
                cVar.f8095i = olVar;
                cVar.f8094g = this.F;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                kVar.X0 = cVar;
                kVar.Y0 = dVar;
            }
            this.actionBar.setMenuRise(org.telegram.messenger.g0.L(8.0f));
            this.f45240j0.setSubMenuOverlayProvider(new ne(0, this));
        }
    }

    public final void Wc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Wc(boolean):void");
    }

    public final void X6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.X6():void");
    }

    public final boolean X9() {
        int i7 = this.f45204g4;
        if (i7 != 5 && i7 != 9) {
            return false;
        }
        return true;
    }

    public final void Xa(org.telegram.ui.Cells.z zVar, TLRPC.ReactionCount reactionCount, float f10, float f11) {
        org.telegram.messenger.gj messageObject;
        boolean z10;
        boolean z11;
        TLRPC.Message message;
        ch.p0 d = ch.p0.d(reactionCount.reaction);
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            messageObject = ((org.telegram.ui.Cells.q1) zVar).getPrimaryMessageObject();
        } else if (zVar instanceof org.telegram.ui.Cells.t0) {
            messageObject = ((org.telegram.ui.Cells.t0) zVar).getMessageObject();
        } else {
            return;
        }
        org.telegram.messenger.gj gjVar = messageObject;
        Eb(zVar, gjVar, null, null, f10, f11, d, false, false, false, false);
        if (gjVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (gjVar.f23817k != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 & z11) {
            boolean z12 = this.D0.O;
            if (z12) {
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) this.F6[0].get(gjVar.e1());
                if (gjVar2 != null && (message = gjVar2.f23817k) != null) {
                    message.reactions = gjVar.f23817k.reactions;
                }
            } else if (!z12 && this.F3 != null) {
                Sc(false);
            }
        }
        if (this.D0.O && !gjVar.v2(this.F3)) {
            org.telegram.messenger.bj u92 = u9(gjVar);
            if (u92 != null) {
                ArrayList arrayList = u92.d;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    getMediaDataController().M1(((org.telegram.messenger.gj) arrayList.get(i7)).e1());
                }
            } else {
                getMediaDataController().M1(gjVar.e1());
            }
            jg.l1 l1Var = this.f45137b4;
            if (l1Var != null) {
                l1Var.f();
            }
            Sc(true);
        }
    }

    public final void Xb() {
        org.telegram.messenger.g0.F3(5.0f, this.A0, null);
        org.telegram.messenger.p2.APP_ERROR.a();
        qj qjVar = this.f45118a0;
        for (int i7 = 0; i7 < qjVar.getChildCount(); i7++) {
            org.telegram.messenger.g0.F3(5.0f, qjVar.getChildAt(i7), null);
        }
        org.telegram.ui.ActionBar.k actionBar = getActionBar();
        for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
            org.telegram.messenger.g0.F3(5.0f, actionBar.getChildAt(i10), null);
        }
    }

    public final void Xc() {
        org.telegram.messenger.gj gjVar;
        if (this.f45187f != null) {
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                aj ajVar = this.A0;
                if (ajVar != null) {
                    int childCount = ajVar.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = this.A0.getChildAt(i7);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            gjVar = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        } else {
                            gjVar = null;
                        }
                        if (gjVar != null && gjVar.e1() < 0) {
                            long j3 = gjVar.f23817k.random_id;
                            if (j3 != 0) {
                                arrayList.add(Long.valueOf(j3));
                            }
                        }
                    }
                }
                MediaController.B();
                return;
            }
            org.telegram.messenger.gj gjVar2 = SecretMediaViewer.f().f43285g0;
            if (gjVar2 != null && !gjVar2.N3()) {
                MediaController.B();
                gjVar2.e1();
            }
        }
    }

    public final void Y6(int i7, View view, boolean z10) {
        int i10;
        if (view != null) {
            float f10 = (1.0f - this.f45172dd.f57081e) * (1.0f - this.bd.f57081e) * ((float[]) this.f45239id.f20518b)[i7];
            view.setAlpha(f10);
            if (z10) {
                if (f10 > 0.0f) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if (view.getVisibility() != i10) {
                    view.setVisibility(i10);
                }
            }
        }
    }

    public final boolean Y7(android.view.View r95, boolean r96, boolean r97, float r98, float r99, boolean r100, boolean r101, boolean r102) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Y7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final org.telegram.messenger.fw Y8() {
        ?? obj = new Object();
        int i7 = this.f45204g4;
        if (i7 == 9) {
            obj.f20470a = this.Pa;
        }
        if (i7 == 5) {
            String str = this.f45192f4;
            int d92 = d9();
            obj.f20472c = str;
            obj.f20471b = d92;
        }
        return new org.telegram.messenger.fw(obj);
    }

    public final boolean Y9() {
        return !TextUtils.isEmpty(this.f45243j4);
    }

    public final void Ya(java.util.ArrayList r44, long r45, boolean r47, boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Ya(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void Yb(int i7, org.telegram.messenger.gj gjVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.Aa);
        String M0 = org.telegram.messenger.hd.M0(2131745420, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        TLRPC.User user = this.f45187f;
        if (user != null) {
            if (user.bot) {
                t1Var.U = org.telegram.messenger.hd.M0(2131754069, null);
            } else {
                String h = org.telegram.messenger.k5.h(new StringBuilder("+"), getUserConfig().f().phone, pf.b.c());
                TLRPC.User user2 = this.f45187f;
                t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AreYouSureShareMyContactInfoUser", null, 2131754067, h, org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name)));
            }
        } else {
            t1Var.U = org.telegram.messenger.hd.M0(2131754070, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745461, null), new ai.q1(this, i7, gjVar, 6));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        showDialog(t1Var);
    }

    public final void Yc(org.telegram.messenger.gj gjVar, boolean z10) {
        if (this.D0 == null) {
            return;
        }
        getNotificationCenter().d(new di.m6(this, gjVar, z10, 14));
    }

    public final boolean Z6() {
        boolean z10;
        TLRPC.ChatFull chatFull = this.f45334q8;
        if (chatFull != null && chatFull.boosts_unrestrict > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
            ug.j0.w1(this, this.S1, this.T1, this.f45259k6, false);
        }
        return z10;
    }

    public final boolean Z9() {
        int i7 = this.f45204g4;
        if (((i7 == 0 && this.f45358s4 == 0) || i7 == 3) && this.f45259k6 == getUserConfig().e() && !Y9()) {
            return true;
        }
        return false;
    }

    public final void Za(int i7, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.wy0 wy0Var;
        String K0;
        boolean z12;
        boolean z13 = false;
        try {
            K0 = org.telegram.messenger.g0.K0(str, false);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.h != null) {
            if (getMessagesController().H2 == 1) {
            }
            if (z10 && !org.telegram.messenger.g0.I3(str)) {
                if (i7 == 0) {
                    vf.c.r(getParentActivity(), Uri.parse(str), true, true, na(q1Var, characterStyle));
                    return;
                } else if (i7 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f45412w8 == 0) {
                        z13 = true;
                    }
                    vf.c.r(parentActivity, parse, z13, true, na(q1Var, characterStyle));
                    return;
                } else if (i7 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f45412w8 == 0) {
                        z13 = true;
                    }
                    vf.c.r(parentActivity2, parse2, z13, true, na(q1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i7 == 0 && i7 != 2) {
                if (i7 == 1) {
                    org.telegram.ui.Components.t4.o0(this, str, true, true, false, false, na(q1Var, characterStyle), null, this.Aa);
                    return;
                }
                return;
            } else {
                if (!(characterStyle instanceof org.telegram.ui.Components.h41) && (wy0Var = ((org.telegram.ui.Components.h41) characterStyle).f35164a) != null && (wy0Var.f41484a & 1024) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.t4.o0(this, str, true, true, true, z11, na(q1Var, characterStyle), null, this.Aa);
            }
        }
        if (getMessagesController().f25277f4.contains(K0)) {
            org.telegram.messenger.ez sendMessagesHelper = getSendMessagesHelper();
            if (i7 != 0 && i7 != 2) {
                z12 = false;
                sendMessagesHelper.getClass();
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                tL_messages_requestUrlAuth.url = str;
                tL_messages_requestUrlAuth.flags |= 4;
                sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, new org.telegram.messenger.p4(sendMessagesHelper, tL_messages_requestUrlAuth, this, str, z12), 2);
                return;
            }
            z12 = true;
            sendMessagesHelper.getClass();
            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth2 = new TLRPC.TL_messages_requestUrlAuth();
            tL_messages_requestUrlAuth2.url = str;
            tL_messages_requestUrlAuth2.flags |= 4;
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_requestUrlAuth2, new org.telegram.messenger.p4(sendMessagesHelper, tL_messages_requestUrlAuth2, this, str, z12), 2);
            return;
        }
        if (z10) {
        }
        if (i7 == 0) {
        }
        if (!(characterStyle instanceof org.telegram.ui.Components.h41)) {
        }
        z11 = false;
        org.telegram.ui.Components.t4.o0(this, str, true, true, true, z11, na(q1Var, characterStyle), null, this.Aa);
    }

    public final boolean Zb() {
        if (T9() && this.E5 == null && this.G5 == null) {
            if (this.f45204g4 != 8 && T9() && this.f45173e != null) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f25383r7.f(this.f45173e.f28051id, 1L);
                if (this.f45204g4 != 8) {
                    if (f10 != null) {
                        if (f10.closed && !org.telegram.messenger.t3.i(this.currentAccount, this.f45173e, f10)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void Zc(org.telegram.messenger.gj gjVar, boolean z10) {
        org.telegram.messenger.gj gjVar2;
        if (this.D0 != null && this.fragmentView != null) {
            org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) this.O6.f(gjVar.c1());
            if (bjVar != null) {
                ArrayList arrayList = bjVar.d;
                cj cjVar = this.B0;
                if (cjVar != null) {
                    cjVar.V(bjVar);
                }
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((org.telegram.messenger.gj) arrayList.get(i7)).M1 = true;
                    if (z10) {
                        ((org.telegram.messenger.gj) arrayList.get(i7)).H = true;
                    }
                }
                this.D0.O(true);
                return;
            }
            org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) this.F6[0].get(gjVar.e1());
            if (z10) {
                gjVar.M1 = true;
                gjVar.H = true;
            }
            if (this.D0.O) {
                a0.h hVar = this.f45401vb;
                if (hVar != null) {
                    gjVar2 = (org.telegram.messenger.gj) hVar.f(gjVar.e1());
                } else {
                    gjVar2 = null;
                }
                int indexOf = this.D0.Q.indexOf(gjVar2);
                if (gjVar2 != null && z10) {
                    gjVar2.M1 = true;
                    gjVar2.H = true;
                }
                if (indexOf >= 0) {
                    jl jlVar = this.D0;
                    jlVar.g(jlVar.K + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.L6.indexOf(gjVar3);
            if (indexOf2 >= 0) {
                jl jlVar2 = this.D0;
                jlVar2.g(jlVar2.K + indexOf2);
            }
        }
    }

    public long a() {
        return this.f45259k6;
    }

    public final void a7(boolean z10) {
        if (this.f45181e7 == 0) {
            if (z10 && !this.f45195f7.isEmpty()) {
                this.f45181e7 = System.currentTimeMillis();
            } else {
                this.f45181e7 = 1L;
            }
            da();
            aj ajVar = this.A0;
            if (ajVar != null) {
                ajVar.invalidate();
            }
        }
    }

    public final org.telegram.ui.Components.de0 a8(View view, org.telegram.ui.Components.ce0 ce0Var) {
        dh.c cVar;
        ui.d dVar;
        gh.a k10;
        ol olVar;
        org.telegram.ui.ActionBar.g5 simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay == null || getParentActivity() == null) {
            return null;
        }
        ui.f fVar = this.K;
        if (fVar != null) {
            ui.f fVar2 = this.J;
            if (fVar2 == null) {
                fVar2 = fVar;
            }
            ui.d dVar2 = new ui.d(fVar2, fVar);
            cVar = new dh.c(dVar2, dVar2, dVar2);
            cVar.f8097k = true;
            cVar.f8096j = T8();
            jh.k kVar = this.l1;
            an anVar = this.f45452za;
            if (anVar != null) {
                olVar = anVar.f45278m1;
            } else {
                olVar = this.f45278m1;
            }
            cVar.h = kVar;
            cVar.f8095i = olVar;
            cVar.f8094g = this.F;
            dVar = dVar2;
        } else {
            cVar = this.M;
            dVar = null;
        }
        dh.c cVar2 = cVar;
        if (cVar2 == null) {
            return null;
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null && kVar2.getMenuGlassColorProvider() != null) {
            k10 = this.actionBar.getMenuGlassColorProvider();
        } else {
            k10 = c8.g0.k(this.Aa);
        }
        return new org.telegram.ui.Components.de0(getParentActivity(), view, ce0Var, simpleMenuOverlay, cVar2, dVar, k10, this.f45416x, this.Aa);
    }

    public final int a9(org.telegram.messenger.gj r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.a9(org.telegram.messenger.gj):int");
    }

    public final boolean aa() {
        org.telegram.ui.Components.p11 p11Var = this.f45202g2;
        if (p11Var != null && p11Var.U && p11Var.f38145a.f57082f) {
            return true;
        }
        return false;
    }

    public final void ab(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.gj r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.gj r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.ab(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.gj):void");
    }

    public final void ac() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.cc.a0(this).t(org.telegram.messenger.hd.M0(2131743833, null), this.Aa).j();
    }

    public final void ad() {
        org.telegram.ui.ActionBar.g1 g1Var;
        int i7;
        if (this.h != null) {
            return;
        }
        aj ajVar = this.A0;
        jj jjVar = this.X1;
        if ((jjVar != null && jjVar.J) || ((g1Var = this.f45197f9) != null && g1Var.isShowing())) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        ajVar.setImportantForAccessibility(i7);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29059og));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.K5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29088q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28940i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28922h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.X9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28853da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29053oa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28944ia));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29035na));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29000la));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28982ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28962ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28838cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28914gg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28799ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29249yf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29174uf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29211wf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29192vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28987kg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ol));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29039nf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29146t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29204w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29269zf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28801ag));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29187v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29168u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29092q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29072p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29052o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28981k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29017m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28943i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28961j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28794a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29056od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28926ha));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28908ga));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28872ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28931hf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28986kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28967jf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29019md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28800af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29003ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29268ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ac));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29248ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29266zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29229xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29246yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29210we));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29173ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29190vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29153te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29171uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29134se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29151tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29116re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29132sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29097qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29114rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29077pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29095qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29020me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29057oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29018mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28985ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29002lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28966je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28983kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28948ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28837cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28930he));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28912ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28873ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28910gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28856de));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28839ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28964jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28875ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28819be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28946ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28928hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29038nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29267zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29247yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29228xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29209wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29093qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29109r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29265zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29191vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29172ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29152td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29133sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29115rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29096qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29076pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28984kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28965jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28855dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28798ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29131sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29113rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29112ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29051o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29033n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29016m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28998l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28980k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28960j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28942i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28911gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28892fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29073pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return !this.inPreviewMode;
    }

    @Override
    public final boolean allowPresentFragment() {
        return !this.inPreviewMode;
    }

    @Override
    public final long b() {
        int i7;
        if (!this.f45408w4 && (i7 = this.f45204g4) != 3 && i7 != 5 && i7 != 8) {
            return 0L;
        }
        return this.f45358s4;
    }

    public final void b7(CharSequence charSequence) {
        boolean z10;
        TLRPC.WebPage webPage;
        org.telegram.messenger.gj gjVar;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        org.telegram.messenger.gj gjVar2 = this.G5;
        if (gjVar2 != null && (message = gjVar2.f23817k) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f45409w5 != null && gjVar2 != null) {
            int i7 = gjVar2.D;
            if ((i7 == 0 || i7 == 19) && (webPage = this.X5) != null) {
                String str = webPage.url;
                if (str != null) {
                    try {
                        SpannableString valueOf = SpannableString.valueOf(charSequence);
                        try {
                            org.telegram.messenger.g0.c(valueOf, 1, false, true);
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
                            if (org.telegram.messenger.kj.a(uRLSpan.getURL(), str)) {
                                return;
                            }
                        }
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                if (z10) {
                    this.X5 = null;
                    qj qjVar = this.f45118a0;
                    if (qjVar != null) {
                        qjVar.F3 = null;
                        qjVar.G3 = true;
                    }
                    org.telegram.messenger.kj kjVar = this.f45409w5;
                    if (kjVar != null) {
                        int i10 = this.currentAccount;
                        CharSequence fieldText = qjVar.getFieldText();
                        org.telegram.messenger.gj gjVar3 = this.E5;
                        if (gjVar3 == this.f45281m4) {
                            gjVar = null;
                        } else {
                            gjVar = gjVar3;
                        }
                        kjVar.e(i10, null, fieldText, gjVar, this.C5, this.G5);
                    }
                    z8();
                    B8();
                }
            }
        }
    }

    public final void b8() {
        if (this.h == null && this.M2 == null && getParentActivity() != null) {
            nk nkVar = new nk(this, getParentActivity());
            this.M2 = nkVar;
            nkVar.setTag(1);
            this.f45134b1.addView(this.M2, c8.ja.o(-1, 48));
            this.f45134b1.h(1, this.M2);
            this.f45134b1.g(this.M2);
            this.M2.setOnClickListener(new le(this, 17));
            this.M2.setEnabled(!isInPreviewMode());
            this.M2.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
            org.telegram.ui.Components.ge0 ge0Var = new org.telegram.ui.Components.ge0(getParentActivity(), this.Aa);
            this.O2 = ge0Var;
            this.M2.addView(ge0Var, c8.ja.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.M2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.U2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.U2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.We));
            this.U2.setTypeface(org.telegram.messenger.g0.o());
            this.M2.addView(this.U2, c8.ja.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            for (int i7 = 0; i7 < 2; i7++) {
                zm zmVar = new zm(this, getParentActivity());
                zm[] zmVarArr = this.R2;
                zmVarArr[i7] = zmVar;
                zmVar.setTextSize(14);
                org.telegram.ui.ActionBar.q6.X(zmVarArr[i7], org.telegram.ui.ActionBar.j6.We, getResourceProvider());
                zmVarArr[i7].setTypeface(org.telegram.messenger.g0.o());
                this.M2.addView(zmVarArr[i7], c8.ja.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                ok okVar = new ok(0, getParentActivity(), this);
                org.telegram.ui.ActionBar.j5[] j5VarArr = this.S2;
                j5VarArr[i7] = okVar;
                okVar.setTextSize(14);
                org.telegram.ui.ActionBar.q6.X(j5VarArr[i7], org.telegram.ui.ActionBar.j6.Xe, getResourceProvider());
                this.M2.addView(j5VarArr[i7], c8.ja.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                pm pmVar = new pm(this, getParentActivity());
                pm[] pmVarArr = this.T2;
                pmVarArr[i7] = pmVar;
                this.M2.addView(pmVar, c8.ja.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                pk pkVar = new pk(getParentActivity());
                pkVar.J = new xh.f();
                pkVar.I = new Path();
                pkVar.K = new float[8];
                org.telegram.ui.Components.i9[] i9VarArr = this.Q2;
                i9VarArr[i7] = pkVar;
                pkVar.setBlurAllowed(true);
                i9VarArr[i7].setRoundRadius(org.telegram.messenger.g0.L(2.0f));
                this.M2.addView(i9VarArr[i7], c8.ja.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i7 == 1) {
                    zmVarArr[i7].setVisibility(4);
                    pmVarArr[i7].setVisibility(4);
                    j5VarArr[i7].setVisibility(4);
                    i9VarArr[i7].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.f45121a3 = imageView;
            imageView.setImageResource(2131232298);
            ImageView imageView2 = this.f45121a3;
            int i10 = org.telegram.ui.ActionBar.j6.Ue;
            org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.q6.s(imageView2, i10, resourceProvider, mode);
            ImageView imageView3 = this.f45121a3;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.f45121a3.setContentDescription(org.telegram.messenger.hd.M0(2131754723, null));
            this.f45121a3.setVisibility(4);
            this.f45121a3.setAlpha(0.0f);
            this.f45121a3.setScaleX(0.4f);
            this.f45121a3.setScaleY(0.4f);
            ImageView imageView4 = this.f45121a3;
            int i11 = org.telegram.ui.ActionBar.j6.f29223x7;
            org.telegram.ui.ActionBar.q6.Q(imageView4, org.telegram.ui.ActionBar.j6.h0(getThemedColor(i11) & 436207615, 1, -1), null, org.telegram.ui.ActionBar.q6.g(i11, 25), getResourceProvider());
            this.M2.addView(this.f45121a3, c8.ja.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.f45121a3.setOnClickListener(new le(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.Y2 = imageView5;
            imageView5.setImageResource(2131231983);
            org.telegram.ui.ActionBar.q6.s(this.Y2, i10, getResourceProvider(), mode);
            this.Y2.setScaleType(scaleType);
            this.Y2.setVisibility(8);
            this.Y2.setContentDescription(org.telegram.messenger.hd.M0(2131752041, null));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.Aa);
            this.Z2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.Z2.setSize(org.telegram.messenger.g0.L(16.0f));
            this.Z2.setStrokeWidth(2.0f);
            this.Z2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ve));
            this.M2.addView(this.Z2, c8.ja.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.ActionBar.q6.Q(this.Y2, org.telegram.ui.ActionBar.j6.h0(getThemedColor(i11) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)), null, org.telegram.ui.ActionBar.q6.g(i11, 25), getResourceProvider());
            this.M2.addView(this.Y2, c8.ja.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.Y2.setOnClickListener(new le(this, 19));
            fd(false);
        }
    }

    public final int b9() {
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        int i7 = 0;
        if (o4Var == null || o4Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i7 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.parentLayout.getFragmentStack().get(i7);
                if (e2Var != this && (e2Var instanceof an) && ((an) e2Var).f45259k6 == this.f45259k6) {
                    break;
                }
                i7++;
            } else {
                i7 = indexOf;
                break;
            }
        }
        return i7 - indexOf;
    }

    public final boolean ba() {
        org.telegram.ui.Components.p11 p11Var = this.f45202g2;
        if (p11Var != null) {
            return p11Var.f38149c;
        }
        if (org.telegram.messenger.t3.c0(this.f45173e) && O6()) {
            return true;
        }
        return false;
    }

    public final void bb(java.util.ArrayList r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.bb(java.util.ArrayList, boolean):void");
    }

    public final void bc(org.telegram.ui.Cells.q1 q1Var) {
        if (getParentActivity() != null && q1Var != null && q1Var.f31243z9 != null && q1Var.getPrimaryMessageObject() != null && q1Var.getPrimaryMessageObject().f23817k != null && q1Var.getPrimaryMessageObject().f23817k.via_business_bot_id != 0 && !getMessagesController().f25280f7.getBoolean("bizbothint", false)) {
            getMessagesController().f25280f7.edit().putBoolean("bizbothint", true).apply();
            if (!this.f45375tb) {
                this.f45375tb = true;
                if (this.O1 != null) {
                    return;
                }
                hi.l3 l3Var = new hi.l3(getParentActivity(), 3);
                l3Var.r(true);
                l3Var.L = Layout.Alignment.ALIGN_NORMAL;
                l3Var.d = -1L;
                l3Var.U = true;
                l3Var.f14554e = true;
                l3Var.k(true);
                l3Var.s(8.0f);
                this.O1 = l3Var;
                l3Var.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748598, null)));
                this.O1.l(this.L);
                hi.l3 l3Var2 = this.O1;
                l3Var2.h = hi.l3.a(l3Var2.getText(), this.O1.getTextPaint());
                this.f45278m1.addView(this.O1, c8.ja.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.f45278m1.post(new u5(22, this, q1Var));
            }
        }
    }

    public final void bd(ArrayList arrayList, boolean z10) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            this.D0.R((org.telegram.messenger.gj) arrayList.get(i7), false, z10);
        }
    }

    @Override
    public final boolean c() {
        if (this.f45204g4 == 1) {
            return true;
        }
        return false;
    }

    public final void c7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.c7():void");
    }

    public final void c8() {
        int i7;
        int i10;
        if (this.f45203g3 == null && getParentActivity() != null) {
            tj tjVar = new tj(this, getParentActivity(), 1);
            this.f45203g3 = tjVar;
            tjVar.setClickable(false);
            this.f45203g3.setWillNotDraw(false);
            this.f45239id.h(4, false, false);
            this.f45203g3.setClipToPadding(false);
            org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getParentActivity(), true, true, true);
            this.j3 = h6Var;
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
            h6Var.b(0.25f, 280L, erVar);
            this.j3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.j3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.q6.Y(this.j3, org.telegram.ui.ActionBar.j6.qf, getResourceProvider());
            this.j3.setGravity(3);
            this.f45203g3.addView(this.j3, c8.ja.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.W.addView(this.f45203g3, c8.ja.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(getParentActivity(), true, false, true);
            this.f45256k3 = h6Var2;
            h6Var2.b(0.0f, 420L, erVar);
            this.f45256k3.setScaleProperty(0.7f);
            this.f45256k3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f45256k3.setGravity(5);
            this.f45256k3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.q6.Y(this.f45256k3, org.telegram.ui.ActionBar.j6.f29049o6, getResourceProvider());
            org.telegram.ui.Components.h6 h6Var3 = this.f45256k3;
            if (this.f45199fd.f57082f) {
                i7 = 2131745818;
            } else {
                i7 = 2131745817;
            }
            h6Var3.setText(org.telegram.messenger.hd.M0(i7, null));
            org.telegram.ui.Components.h6 h6Var4 = this.f45256k3;
            h6Var4.f35178n = false;
            h6Var4.setPadding(org.telegram.messenger.g0.L(15.33f), 0, org.telegram.messenger.g0.L(15.33f), 0);
            this.f45256k3.setOnClickListener(new le(this, 2));
            this.f45256k3.setAlpha(0.5f);
            this.f45256k3.setClickable(false);
            this.f45203g3.addView(this.f45256k3, c8.ja.e(-2, -1, 117));
            org.telegram.ui.Components.h6 h6Var5 = new org.telegram.ui.Components.h6(getParentActivity(), true, true, true);
            this.f45268l3 = h6Var5;
            h6Var5.setGravity(17);
            this.f45268l3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.q6.Y(this.f45268l3, org.telegram.ui.ActionBar.j6.f29135sf, getResourceProvider());
            this.f45268l3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            org.telegram.ui.Components.h6 h6Var6 = this.f45268l3;
            int i11 = org.telegram.ui.ActionBar.j6.f28849d6;
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.j6.f28941i6;
            org.telegram.ui.ActionBar.q6.Q(h6Var6, org.telegram.ui.ActionBar.j6.i0(themedColor, org.telegram.ui.ActionBar.j6.w(themedColor2, getThemedColor(i12))), org.telegram.ui.ActionBar.q6.M(i11), org.telegram.ui.ActionBar.q6.p(i11, i12), getResourceProvider());
            org.telegram.ui.Components.h6 h6Var7 = this.f45268l3;
            if (this.D0.O) {
                i10 = 2131745883;
            } else {
                i10 = 2131745866;
            }
            h6Var7.setText(org.telegram.messenger.hd.M0(i10, null));
            this.f45268l3.setOnClickListener(new le(this, 3));
            this.f45268l3.setVisibility(8);
            this.f45268l3.setAlpha(0.0f);
            this.f45203g3.addView(this.f45268l3, c8.ja.e(-1, -1, 119));
            TLRPC.Chat chat = this.f45173e;
            if (chat != null && ((!org.telegram.messenger.t3.T(chat) || this.f45173e.megagroup) && this.f45204g4 != 7 && !org.telegram.messenger.t3.p0(this.f45173e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.f45230i3 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f45230i3.setImageResource(2131232418);
                org.telegram.ui.ActionBar.q6.s(this.f45230i3, org.telegram.ui.ActionBar.j6.f29078pf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.f45230i3;
                int i13 = org.telegram.ui.ActionBar.j6.f29262z8;
                org.telegram.ui.ActionBar.q6.Q(imageView2, org.telegram.ui.ActionBar.j6.h0(getThemedColor(i13), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i13), getResourceProvider());
                this.f45203g3.addView(this.f45230i3, c8.ja.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.f45230i3.setOnClickListener(new le(this, 4));
                this.f45230i3.setContentDescription(org.telegram.messenger.hd.M0(2131754780, null));
            }
            if (this.f45204g4 != 7) {
                ImageView imageView3 = new ImageView(getParentActivity());
                this.f45217h3 = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.f45217h3.setImageResource(2131232077);
                org.telegram.ui.ActionBar.q6.s(this.f45217h3, org.telegram.ui.ActionBar.j6.f29078pf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView4 = this.f45217h3;
                int i14 = org.telegram.ui.ActionBar.j6.f29262z8;
                org.telegram.ui.ActionBar.q6.Q(imageView4, org.telegram.ui.ActionBar.j6.h0(getThemedColor(i14), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i14), getResourceProvider());
                this.f45203g3.addView(this.f45217h3, c8.ja.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.f45217h3.setOnClickListener(new le(this, 5));
                this.f45217h3.setContentDescription(org.telegram.messenger.hd.M0(2131749065, null));
            }
        }
    }

    public final int c9() {
        return Math.max(this.f45152c5, this.f45165d5);
    }

    public final boolean ca() {
        if (this.m0 != null && ga()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.v01 v01Var;
        wh.i iVar;
        org.telegram.ui.Components.ud udVar;
        if ((this.f45204g4 != 5 || (!this.L6.isEmpty() && this.f45358s4 != 0)) && (((v01Var = this.f45289n0) == null || (v01Var.f40230y <= 0.0f && !v01Var.V)) && !this.f45426x9 && !this.f45199fd.f57082f && this.J9)) {
            qj qjVar = this.f45118a0;
            if (!qjVar.f32248n3 && ((!qjVar.f32178d1 || (udVar = qjVar.f32193f1) == null || udVar.getVisibility() != 0) && ((!qjVar.v0() || !qjVar.m0.f18180w) && !org.telegram.ui.ActionBar.e2.hasSheets(qjVar.f32319x3) && this.f45249ja == 0.0f && ((iVar = this.f45374ta) == null || !iVar.a())))) {
                return true;
            }
        }
        return false;
    }

    public final void cb(int i7) {
        boolean z10;
        int i10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z11 = false;
        if (i7 == 0) {
            int i11 = Build.VERSION.SDK_INT;
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q02 = org.telegram.messenger.g0.q0(null, false);
                if (q02 != null) {
                    if (i11 >= 24) {
                        Activity parentActivity = getParentActivity();
                        org.telegram.messenger.t0.d();
                        intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q02));
                    }
                    this.f45285m8 = q02.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        try {
            if (i7 == 1) {
                Activity parentActivity2 = getParentActivity();
                if (Build.VERSION.SDK_INT >= 33) {
                    if (parentActivity2.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (parentActivity2.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                if (org.telegram.messenger.t3.T(this.f45173e) && (tL_chatBannedRights = this.f45173e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                nm0 nm0Var = new nm0(0, z10, true, this);
                if (this.f45204g4 == 9) {
                    nm0Var.H = 1;
                    nm0Var.I = true;
                } else {
                    TLRPC.Chat chat = this.f45173e;
                    if (chat != null && !org.telegram.messenger.t3.N(chat) && this.f45173e.slowmode_enabled) {
                        nm0Var.H = 10;
                        nm0Var.I = true;
                    } else {
                        org.telegram.messenger.gj gjVar = this.G5;
                        if (gjVar != null) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if (gjVar == null) {
                            z11 = true;
                        }
                        nm0Var.H = i10;
                        nm0Var.I = z11;
                    }
                }
                nm0Var.W = new wi(this);
                presentFragment(nm0Var);
            } else if (i7 == 2) {
                int i12 = Build.VERSION.SDK_INT;
                if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                try {
                    Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                    File s02 = org.telegram.messenger.g0.s0(false);
                    if (s02 != null) {
                        if (i12 >= 24) {
                            Activity parentActivity3 = getParentActivity();
                            org.telegram.messenger.t0.d();
                            intent2.putExtra("output", FileProvider.d(parentActivity3, "org.telegram.messenger.beta.provider", s02));
                            intent2.addFlags(2);
                            intent2.addFlags(1);
                        } else {
                            intent2.putExtra("output", Uri.fromFile(s02));
                        }
                        intent2.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                        this.f45285m8 = s02.getAbsolutePath();
                    }
                    startActivityForResult(intent2, 2);
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void cc(boolean z10, boolean z11) {
        int i7;
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        Object obj;
        if (!z10 || this.J0.getTag() == null) {
            if (!z10 && this.J0.getTag() == null) {
                return;
            }
            AnimatorSet animatorSet = this.W0;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W0 = null;
            }
            RadialProgressView radialProgressView = this.J0;
            if (z10) {
                num = 1;
            }
            radialProgressView.setTag(num);
            float f17 = 0.1f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.W0 = animatorSet2;
                if (z10) {
                    this.J0.setVisibility(0);
                    AnimatorSet animatorSet3 = this.W0;
                    vj vjVar = this.E0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vjVar, property, 0.1f);
                    vj vjVar2 = this.E0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(vjVar2, property2, 0.1f);
                    vj vjVar3 = this.E0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(vjVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.J0, property, 1.0f), ObjectAnimator.ofFloat(this.J0, property2, 1.0f), ObjectAnimator.ofFloat(this.J0, property3, 1.0f));
                    this.W0.setStartDelay(200L);
                } else {
                    if (this.F0) {
                        obj = this.G0;
                    } else {
                        obj = this.E0;
                    }
                    RadialProgressView radialProgressView2 = this.J0;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(radialProgressView2, property4, 0.1f);
                    RadialProgressView radialProgressView3 = this.J0;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(radialProgressView3, property5, 0.1f);
                    RadialProgressView radialProgressView4 = this.J0;
                    Property property6 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(radialProgressView4, property6, 0.0f), ObjectAnimator.ofFloat(obj, property4, 1.0f), ObjectAnimator.ofFloat(obj, property5, 1.0f), ObjectAnimator.ofFloat(obj, property6, 1.0f));
                }
                this.W0.addListener(new bi.v4(29, this, z10));
                this.W0.setDuration(150L);
                this.W0.start();
                return;
            }
            RadialProgressView radialProgressView5 = this.J0;
            if (z10) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            radialProgressView5.setVisibility(i7);
            RadialProgressView radialProgressView6 = this.J0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            radialProgressView6.setScaleX(f10);
            RadialProgressView radialProgressView7 = this.J0;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            radialProgressView7.setScaleY(f11);
            this.J0.setAlpha(1.0f);
            vj vjVar4 = this.E0;
            if (!z10 && !this.F0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            vjVar4.setVisibility(i10);
            org.telegram.ui.Components.z70 z70Var = this.G0;
            if (!z10 && this.F0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            z70Var.setVisibility(i11);
            vj vjVar5 = this.E0;
            if (!z10 && !this.F0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            vjVar5.setScaleX(f12);
            org.telegram.ui.Components.z70 z70Var2 = this.G0;
            if (!z10 && this.F0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            z70Var2.setScaleX(f13);
            vj vjVar6 = this.E0;
            if (!z10 && !this.F0) {
                f14 = 1.0f;
            } else {
                f14 = 0.1f;
            }
            vjVar6.setScaleY(f14);
            org.telegram.ui.Components.z70 z70Var3 = this.G0;
            if (!z10 && this.F0) {
                f17 = 1.0f;
            }
            z70Var3.setScaleY(f17);
            vj vjVar7 = this.E0;
            if (!z10 && !this.F0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            vjVar7.setAlpha(f15);
            org.telegram.ui.Components.z70 z70Var4 = this.G0;
            if (!z10 && this.F0) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            z70Var4.setAlpha(f16);
        }
    }

    public final void cd() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.cd():void");
    }

    @Override
    public final android.view.View createView(android.content.Context r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.createView(android.content.Context):android.view.View");
    }

    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        org.telegram.messenger.cz d = org.telegram.messenger.cz.d(messageMedia, this.f45259k6, this.E5, this.f45281m4, null, null, z10, i10);
        d.K = Y8();
        d.Q = j3;
        d.R = j9();
        d.T = this.f45422x5;
        getSendMessagesHelper().r0(d);
        if (this.f45204g4 == 0) {
            ra(false);
        }
        if (i7 == 0 || i7 == 1) {
            L6();
        }
        if (this.H5) {
            this.f45220h6 = true;
        }
    }

    public final void d7(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        org.telegram.messenger.r3 r3Var = this.f45296n8;
        if (r3Var != null && (((str = this.f45425x8) != null || this.f45438y8) && this.f45180e6)) {
            org.telegram.ui.Components.voip.c2.l(this.f45173e, str, this.f45321p8, Boolean.valueOf(!r3Var.f26208b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f45425x8 = null;
            this.f45438y8 = false;
            return;
        }
        if (this.f45425x8 != null && z10 && (chatFull = this.f45334q8) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.k5.n(null, 2131748913, org.telegram.ui.Components.cc.a0(this), 2131624080, 36);
            this.f45425x8 = null;
        }
        this.f45308o8 = !this.f45180e6;
    }

    public final void d8() {
        if (this.f45356s2 == null && this.I1 == null) {
            org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(getParentActivity(), this.Aa);
            this.f45342r2 = pzVar;
            pzVar.setViewType(7);
            org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(getParentActivity(), this.f45342r2, 1, null);
            this.f45356s2 = cv0Var;
            cv0Var.setClickable(true);
            this.f45356s2.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
            this.f45356s2.setVisibility(8);
            this.f45356s2.addView(this.f45342r2, 0);
            this.f45356s2.e(true, false);
            this.Z3.addView(this.f45356s2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.w20 w20Var = new org.telegram.ui.Components.w20(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.I1 = w20Var;
            w20Var.setOnHashtagClickListener(new ke(this, 3));
            this.I1.setOnScrollListener(new g3(this, 6));
            this.I1.setVisibility(8);
            this.Z3.addView(this.I1, -1, -1);
            G7();
            E7();
        }
    }

    public final int d9() {
        if (this.f45204g4 == 5) {
            return (int) this.f45358s4;
        }
        return 0;
    }

    public final boolean da() {
        boolean z10;
        boolean z11;
        float f10;
        FrameLayout frameLayout;
        if (!this.f45146c && !this.d && this.f45187f == null && this.A0 != null && org.telegram.messenger.gz.c()) {
            if (this.Hb == null) {
                this.Hb = Boolean.valueOf(org.telegram.messenger.qc.e(360928));
            }
            if (this.Hb.booleanValue()) {
                int i7 = Integer.MAX_VALUE;
                int i10 = 0;
                for (int i11 = 0; i11 < this.A0.getChildCount(); i11++) {
                    i10 += this.A0.getChildAt(i11).getHeight();
                    int top = this.A0.getChildAt(i11).getTop();
                    if (top < i7) {
                        i7 = top;
                    }
                }
                float f11 = i7;
                if (f11 <= this.O9) {
                    a7(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.T6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.L6;
                if ((!z12 || ((this.f45154c7 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.X6 && f11 > this.O9 && (!arrayList.isEmpty() ? i10 != 0 : this.Gb)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || !this.inTransitionAnimation || (frameLayout = this.f45189f1) == null || frameLayout.getVisibility() != 0 || this.f45189f1.getChildCount() <= 0) {
                    if (!z10 && this.f45181e7 == 0) {
                        a7(this.fragmentBeginToShow);
                    }
                    if (org.telegram.messenger.gz.o() != 0 && !this.f45298na && this.fragmentBeginToShow) {
                        if (z10 && this.f45181e7 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Drawable m10 = this.Aa.m();
                        ol olVar = this.f45278m1;
                        if (olVar != null) {
                            m10 = olVar.getBackgroundImage();
                        }
                        if (m10 instanceof org.telegram.ui.Components.ra0) {
                            org.telegram.ui.Components.ra0 ra0Var = (org.telegram.ui.Components.ra0) m10;
                            if (ra0Var.N != z11) {
                                if (!z11) {
                                    ra0Var.c();
                                }
                                float f12 = 1.0f;
                                if (!z11 && ra0Var.N) {
                                    ra0Var.h = 1.0f - ((ra0Var.h - (((int) (f10 / 0.125f)) * 0.125f)) / 0.125f);
                                    ra0Var.d = true;
                                }
                                ra0Var.N = z11;
                                if (z11) {
                                    f12 = 1.5f;
                                }
                                ra0Var.M = f12;
                                ra0Var.y();
                            } else if (z11) {
                                ra0Var.y();
                            }
                        }
                    }
                    if (z10 || (this.f45181e7 != 0 && System.currentTimeMillis() - this.f45181e7 <= 200)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void db(int r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.db(int):void");
    }

    public final void dc(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.hd.M0(2131752713, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131752714, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751406, null), new te(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, getResourceProvider());
        }
    }

    public final void dd() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f45431y1 == null) {
            return;
        }
        boolean z13 = false;
        if (this.C9 && !A9() && !this.f45118a0.J0() && !this.f45276lb && (!this.H3 || getMediaDataController().Z0.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f45206g6 != 0 && SystemClock.elapsedRealtime() >= this.f45206g6 + 150) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f45443z1 = false;
        } else {
            this.S7 = 0;
            this.A6 = 0;
            z11 = true;
        }
        qj qjVar = this.f45118a0;
        if (qjVar != null && qjVar.a()) {
            z12 = true;
        } else {
            z12 = false;
        }
        lh.h hVar = this.f45431y1;
        if (z10 && !z12) {
            z13 = true;
        }
        hVar.e(1, z13, z11);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, final Object... objArr) {
        long j3;
        org.telegram.messenger.gj gjVar;
        TLRPC.MessageReplies messageReplies;
        org.telegram.messenger.gj gjVar2;
        org.telegram.ui.ActionBar.o4 o4Var;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull b22;
        TLRPC.User a22;
        boolean z10;
        TLRPC.User a23;
        ui uiVar;
        qj qjVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.ft editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.bw0 bw0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i11;
        qj qjVar2;
        an anVar = this;
        if (i7 == org.telegram.messenger.ns.D) {
            anVar.t8(objArr);
            return;
        }
        if (i7 == org.telegram.messenger.ns.f25519j4) {
            aj ajVar = anVar.A0;
            if (ajVar != null) {
                ajVar.g1();
            }
            org.telegram.ui.Components.ji jiVar = anVar.f45236ia;
            if (jiVar != null) {
                jiVar.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z13 = false;
            r2 = false;
            boolean z14 = false;
            int i12 = 0;
            if (i7 == org.telegram.messenger.ns.I) {
                if (((Integer) objArr[0]).intValue() == anVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        anVar.finishFragment();
                        b.b(anVar.currentAccount);
                    }
                }
            } else if (i7 == org.telegram.messenger.ns.f25570s3) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                fi.p2 p2Var = anVar.Y1;
                if (p2Var != null && p2Var.isShowing()) {
                    anVar.Y1.a(true);
                }
                if (z11 && (qjVar2 = anVar.f45118a0) != null && qjVar2.G0()) {
                    anVar.f45118a0.y0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f28071id = stickerSet2.f28078id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = anVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.bw0) && (tL_messages_stickerSet = (bw0Var = (org.telegram.ui.Components.bw0) dialog).N1) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f28078id == stickerSet2.f28078id) {
                            bw0Var.N1 = (TLRPC.TL_messages_stickerSet) objArr[1];
                            if (bw0Var.f33410o1 != null) {
                                bw0Var.a1();
                                bw0Var.Z0();
                                bw0Var.f33410o1.f();
                            }
                            bw0Var.Y0();
                            org.telegram.messenger.si.b0(bw0Var.f29679a).q1(bw0Var.N1);
                            bw0Var.J0();
                            if (objArr.length > 2) {
                                Object obj3 = objArr[2];
                                if (obj3 instanceof TLRPC.Document) {
                                    TLRPC.Document document = (TLRPC.Document) obj3;
                                    if (objArr.length > 3) {
                                        Object obj4 = objArr[3];
                                        if (obj4 instanceof String) {
                                            document.localThumbPath = (String) obj4;
                                        }
                                    }
                                    org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(bw0Var.f29685c, anVar.resourceProvider);
                                    if (z12) {
                                        i11 = 2131744844;
                                    } else {
                                        i11 = 2131744845;
                                    }
                                    org.telegram.ui.Components.xb q10 = ccVar.q(document, org.telegram.messenger.hd.a0(null, null, i11, stickerSet2.title));
                                    q10.f41643j = 2750;
                                    q10.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.bw0 bw0Var2 = new org.telegram.ui.Components.bw0(anVar.getParentActivity(), anVar, tL_inputStickerSetID, null, anVar.f45118a0, anVar.Aa);
                            final boolean z15 = z12;
                            anVar = this;
                            bw0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    an.Y0(an.this, objArr, bw0Var2, z15, stickerSet2);
                                }
                            });
                            anVar.showDialog(bw0Var2);
                        }
                    }
                }
            } else if (i7 == org.telegram.messenger.ns.f25514i4) {
                aj ajVar2 = anVar.A0;
                if (ajVar2 != null) {
                    ajVar2.g1();
                }
                TextView textView = anVar.f45191f3;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.ActionBar.j5 j5Var = anVar.S2[i13];
                    if (j5Var != null) {
                        j5Var.invalidate();
                    }
                }
                jj jjVar = anVar.X1;
                if (jjVar != null) {
                    jjVar.getListView().g1();
                }
                di.c1 c1Var = anVar.f45122a4;
                if (c1Var != null) {
                    c1Var.g1();
                }
                UndoView undoView = anVar.N3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                qj qjVar3 = anVar.f45118a0;
                if (qjVar3 != null && (editField = qjVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                pm[] pmVarArr = anVar.T2;
                pm pmVar = pmVarArr[0];
                if (pmVar != null) {
                    pmVar.invalidate();
                }
                pm pmVar2 = pmVarArr[1];
                if (pmVar2 != null) {
                    pmVar2.invalidate();
                }
            } else if (i7 == org.telegram.messenger.ns.T1) {
                ConnectionsManager.getInstance(i10).getConnectionState();
            } else if (i7 == org.telegram.messenger.ns.f25499g1) {
                Long l10 = (Long) objArr[0];
                if (anVar.f45334q8 != null && (chat = anVar.f45173e) != null && chat.f28051id == l10.longValue()) {
                    anVar.f45334q8.online_count = ((Integer) objArr[1]).intValue();
                    ui uiVar2 = anVar.f45314p1;
                    if (uiVar2 != null) {
                        uiVar2.m();
                        anVar.f45314p1.n(false);
                    }
                }
            } else if (i7 == org.telegram.messenger.ns.G) {
                if (((Long) objArr[0]).longValue() == anVar.f45259k6 && (qjVar = anVar.f45118a0) != null) {
                    qjVar.k2(false, true);
                }
            } else if (i7 == org.telegram.messenger.ns.f25513i3) {
                qj qjVar4 = anVar.f45118a0;
                if (qjVar4 != null) {
                    qjVar4.l2();
                }
            } else if (i7 == org.telegram.messenger.ns.f25559r) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i14 = org.telegram.messenger.np.D8;
                int i15 = intValue & 1;
                if (i15 != 0 || (intValue & 16) != 0 || (524288 & intValue) != 0) {
                    if (anVar.f45173e != null) {
                        TLRPC.Chat M0 = anVar.getMessagesController().M0(Long.valueOf(anVar.f45173e.f28051id));
                        if (M0 != null) {
                            anVar.f45173e = M0;
                        }
                    } else if (anVar.f45187f != null && (a22 = anVar.getMessagesController().a2(Long.valueOf(anVar.f45187f.f28200id))) != null) {
                        anVar.f45187f = a22;
                    }
                    anVar.wd(true);
                }
                if (!anVar.fa() && ((intValue & 32) != 0 || (intValue & 4) != 0)) {
                    if (anVar.f45173e != null && (uiVar = anVar.f45314p1) != null) {
                        uiVar.m();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((intValue & 2) != 0 || (intValue & 8) != 0 || i15 != 0) {
                    anVar.s();
                    anVar.Gd(false);
                }
                if ((intValue & 64) != 0) {
                    z10 = true;
                }
                if ((intValue & 8192) != 0 && anVar.f45173e != null) {
                    anVar.W9();
                    TLRPC.Chat M02 = anVar.getMessagesController().M0(Long.valueOf(anVar.f45173e.f28051id));
                    if (M02 != null) {
                        anVar.f45173e = M02;
                        anVar.W9();
                        z10 = !anVar.fa();
                        anVar.Pc(false);
                        qj qjVar5 = anVar.f45118a0;
                        if (qjVar5 != null) {
                            qjVar5.r1(anVar.currentAccount, anVar.f45259k6);
                        }
                        org.telegram.messenger.n6 n6Var = anVar.T3;
                        if (n6Var != null) {
                            n6Var.g();
                        }
                    }
                }
                TLRPC.User user = anVar.f45187f;
                if (user != null && org.telegram.messenger.q10.u(user) && (a23 = anVar.getMessagesController().a2(Long.valueOf(anVar.f45187f.f28200id))) != null) {
                    anVar.f45187f = a23;
                }
                if (anVar.f45202g2 != null) {
                    boolean O6 = anVar.O6();
                    org.telegram.ui.Components.p11 p11Var = anVar.f45202g2;
                    if (p11Var.f38149c != O6) {
                        p11Var.setTabsEnabled(O6);
                        if (anVar.f45289n0 != null && !anVar.ga()) {
                            anVar.f45289n0.d();
                        }
                        anVar.Dd();
                    }
                }
                ui uiVar3 = anVar.f45314p1;
                if (uiVar3 != null && z10) {
                    uiVar3.n(true);
                }
                if ((intValue & 130) != 0) {
                    anVar.zd(true);
                }
                org.telegram.ui.ActionBar.q0 q0Var = anVar.f45240j0;
                if (q0Var != null) {
                    if (org.telegram.messenger.t3.T(anVar.f45173e) && !org.telegram.messenger.t3.p0(anVar.f45173e)) {
                        long j10 = anVar.f45173e.linked_monoforum_id;
                        if (j10 != 0 && org.telegram.messenger.t3.z(anVar.currentAccount, 24, -j10)) {
                            z13 = true;
                        }
                    }
                    q0Var.R(70, z13);
                }
            } else if (i7 == 1) {
                org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!anVar.f45276lb) {
                    if (longValue == anVar.f45259k6) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i16 = anVar.f45204g4;
                        if (intValue2 != i16 && i16 != 3 && i16 != 8) {
                            if (i16 != 1 && intValue2 == 1 && !anVar.isPaused && LaunchActivity.T() == anVar && anVar.f45409w5 == null && !arrayList.isEmpty() && ((org.telegram.messenger.gj) arrayList.get(0)).e1() < 0) {
                                int e12 = ((org.telegram.messenger.gj) arrayList.get(0)).e1();
                                if (((org.telegram.messenger.gj) arrayList.get(0)).f23817k != null && ((org.telegram.messenger.gj) arrayList.get(0)).f23817k.video_processing_pending) {
                                    z14 = true;
                                }
                                anVar.Ma(e12, z14);
                            }
                            org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            if (!booleanValue && !anVar.Xc && anVar.f45187f != null && anVar.a() != anVar.getUserConfig().e() && (b22 = anVar.getMessagesController().b2(anVar.f45187f.f28200id)) != null && b22.send_paid_messages_stars > 0) {
                                int size = arrayList.size();
                                while (true) {
                                    if (i12 >= size) {
                                        break;
                                    }
                                    org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList.get(i12);
                                    if (gjVar3.e1() > 0 && !gjVar3.N3() && !gjVar3.r4()) {
                                        anVar.Xc = true;
                                        anVar.getMessagesController().W2(anVar.f45187f, anVar.classGuid, true, null);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                            anVar.bb(arrayList, true);
                        }
                    } else if (org.telegram.messenger.t3.T(anVar.f45173e) && !anVar.f45173e.megagroup && (chatFull = anVar.f45334q8) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size2 = arrayList.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            org.telegram.messenger.gj gjVar4 = (org.telegram.messenger.gj) arrayList.get(i17);
                            if (gjVar4.e4()) {
                                anVar.M6.put(gjVar4.e1(), gjVar4);
                            }
                        }
                        anVar.L7();
                    }
                    org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i7 == org.telegram.messenger.ns.F) {
                anVar.la(true);
            } else if (i7 == org.telegram.messenger.ns.E) {
                anVar.G6();
            } else if (i7 == org.telegram.messenger.ns.f25572t) {
                if (objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == anVar.f45259k6) {
                        anVar.finishFragment();
                    }
                } else if (org.telegram.messenger.g0.Q1() && (o4Var = anVar.parentLayout) != null && o4Var.getFragmentStack().size() > 1) {
                    anVar.finishFragment();
                } else {
                    anVar.removeSelfFromStack(true);
                }
            } else if (i7 == org.telegram.messenger.ns.f25579u) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == anVar.a() && (booleanValue2 || anVar.parentLayout.getLastFragment() != anVar)) {
                    if (anVar.parentLayout.getLastFragment() == anVar) {
                        anVar.finishFragment();
                    } else {
                        anVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i18 = org.telegram.messenger.ns.B;
                SparseArray[] sparseArrayArr = anVar.F6;
                if (i7 == i18) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat2 = anVar.f45173e;
                    if (chat2 != null && chat2.f28051id == longValue3 && (gjVar2 = (org.telegram.messenger.gj) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && gjVar2.x2()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (anVar.H5) {
                            gh ghVar = anVar.C4;
                            if (ghVar != null) {
                                org.telegram.messenger.g0.r(ghVar);
                                anVar.C4 = null;
                            }
                            gjVar2.f23817k.replies.read_max_id = intValue3;
                        } else {
                            gh ghVar2 = new gh(anVar, gjVar2, intValue3);
                            anVar.C4 = ghVar2;
                            org.telegram.messenger.g0.i3(ghVar2, 500L);
                        }
                    }
                } else if (i7 == org.telegram.messenger.ns.C) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat3 = anVar.f45173e;
                    if (chat3 != null && chat3.f28051id == longValue4 && (gjVar = (org.telegram.messenger.gj) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = gjVar.f23817k.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer z16 = anVar.getMessagesController().z1(org.telegram.messenger.t3.M(anVar.f45173e, anVar.getMessagesController().N0(anVar.f45173e.f28051id), false));
                            int size3 = gjVar.f23817k.replies.recent_repliers.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 >= size3) {
                                    break;
                                } else if (org.telegram.messenger.gj.B1(gjVar.f23817k.replies.recent_repliers.get(i19)) == org.telegram.messenger.gj.B1(z16)) {
                                    gjVar.f23817k.replies.recent_repliers.remove(i19);
                                    break;
                                } else {
                                    i19++;
                                }
                            }
                            gjVar.f23817k.replies.recent_repliers.add(0, z16);
                        }
                        TLRPC.MessageReplies messageReplies2 = gjVar.f23817k.replies;
                        if (messageReplies2.replies < 0) {
                            messageReplies2.replies = 0;
                        }
                    }
                } else {
                    int i20 = org.telegram.messenger.ns.A;
                    int i21 = org.telegram.messenger.ns.f25613z;
                    if ((i7 == i21 || i7 == i20) && anVar.f45259k6 == ((Long) objArr[0]).longValue()) {
                        if (i7 == i21) {
                            j3 = ((Integer) objArr[1]).intValue();
                        } else if (i7 == i20) {
                            j3 = ((Long) objArr[1]).longValue();
                        } else {
                            j3 = 0;
                        }
                        long j11 = anVar.f45358s4;
                        if (j3 == j11 || j11 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i22 = anVar.f45446z4;
                            ArrayList arrayList2 = anVar.L6;
                            if (intValue4 > i22) {
                                anVar.f45446z4 = intValue4;
                                int size4 = arrayList2.size();
                                for (int i23 = 0; i23 < size4; i23++) {
                                    org.telegram.messenger.gj gjVar5 = (org.telegram.messenger.gj) arrayList2.get(i23);
                                    int e13 = gjVar5.e1();
                                    if (!gjVar5.N3() && e13 > 0 && e13 <= anVar.f45446z4) {
                                        if (!gjVar5.F4()) {
                                            break;
                                        }
                                        gjVar5.I5();
                                        jl jlVar = anVar.D0;
                                        if (jlVar != null) {
                                            jlVar.M(gjVar5);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > anVar.A4) {
                                anVar.A4 = intValue5;
                                int size5 = arrayList2.size();
                                for (int i24 = 0; i24 < size5; i24++) {
                                    org.telegram.messenger.gj gjVar6 = (org.telegram.messenger.gj) arrayList2.get(i24);
                                    int e14 = gjVar6.e1();
                                    if (gjVar6.N3() && e14 > 0 && e14 <= anVar.A4) {
                                        if (!gjVar6.F4()) {
                                            break;
                                        }
                                        gjVar6.I5();
                                        jl jlVar2 = anVar.D0;
                                        if (jlVar2 != null) {
                                            jlVar2.R(gjVar6, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        anVar.o8(i7, objArr);
        anVar.p8(i7, objArr);
        anVar.q8(i7, objArr);
        anVar.r8(i7, objArr);
        anVar.s8(i7, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        fi.p2 p2Var = this.Y1;
        if (p2Var != null && this.visibleDialog == p2Var) {
            p2Var.f36447e2.d0(false);
            this.Y1.L();
            this.Y1.f36447e2.g0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.Y1 && dialog != this.f45427xa && !(dialog instanceof ki.x2) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e7() {
        TLRPC.ChatFull N0;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet Y;
        if (this.N1 == null && org.telegram.messenger.t3.n0(this.f45173e) && (N0 = getMessagesController().N0(this.f45173e.f28051id)) != null && this.f45118a0 != null && getParentActivity() != null && (stickerSet = N0.emojiset) != null) {
            uj ujVar = this.f45162d1;
            if (ujVar == null || ujVar.getVisibility() != 0) {
                org.telegram.ui.Components.c30 c30Var = org.telegram.ui.Components.c30.f33485n;
                if (c30Var.c()) {
                    long j3 = stickerSet.thumb_document_id;
                    if (j3 == 0 && (Y = getMediaDataController().Y(stickerSet)) != null && !Y.documents.isEmpty()) {
                        j3 = Y.documents.get(0).f28057id;
                    }
                    if (j3 != 0 && getParentActivity() != null) {
                        c30Var.b();
                        hi.l3 l3Var = new hi.l3(getParentActivity(), 3);
                        this.N1 = l3Var;
                        l3Var.k(true);
                        this.N1.r(true);
                        hi.l3 l3Var2 = this.N1;
                        l3Var2.L = Layout.Alignment.ALIGN_CENTER;
                        l3Var2.s(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(j3, this.N1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.N1.u(org.telegram.messenger.g0.K2(org.telegram.messenger.hd.M0(2131749442, null), spannableStringBuilder, "%s"));
                        hi.l3 l3Var3 = this.N1;
                        l3Var3.h = hi.l3.a(l3Var3.getText(), this.N1.getTextPaint());
                        hi.l3 l3Var4 = this.N1;
                        l3Var4.d = -1L;
                        l3Var4.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                        this.N1.l(this.L);
                        org.telegram.messenger.g0.i3(new yd(this, 2), 300L);
                    }
                }
            }
        }
    }

    public final TextureView e8(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        org.telegram.messenger.g0.r(this.N8);
        if (this.I8 == null) {
            tj tjVar = new tj(this, getParentActivity(), 2);
            this.I8 = tjVar;
            tjVar.setOutlineProvider(new fh.a(this, 1));
            this.I8.setClipToOutline(true);
            this.I8.setWillNotDraw(false);
            j4 j4Var = new j4(getParentActivity());
            this.K8 = j4Var;
            j4Var.setBackgroundColor(0);
            if (z10) {
                this.I8.addView(this.K8, c8.ja.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.L8 = textureView;
            textureView.setOpaque(false);
            this.K8.addView(this.L8, c8.ja.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.I8.getParent();
        if (viewGroup != null && viewGroup != this.f45278m1) {
            viewGroup.removeView(this.I8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.f45278m1.addView(this.I8, 1, new FrameLayout.LayoutParams(org.telegram.messenger.g0.g3(ba(), S9()), org.telegram.messenger.g0.g3(ba(), S9())));
        }
        this.I8.setTag(null);
        this.K8.setDrawingReady(false);
        return this.L8;
    }

    public final long e9() {
        if (this.f45204g4 == 3) {
            return this.f45358s4;
        }
        return 0L;
    }

    public final boolean ea() {
        if (getUserConfig().e() == a() && !getMessagesController().G1().f26734b && getUserConfig().q()) {
            return true;
        }
        return false;
    }

    public final boolean eb(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f45412w8 == 0 || tL_inlineButtonTypeSwitchInline.same_peer || this.parentLayout == null) {
            return false;
        }
        String str = "@" + this.f45187f.username + " " + tL_inlineButtonTypeSwitchInline.query;
        if (this.f45412w8 == this.f45259k6) {
            this.f45412w8 = 0L;
            this.f45118a0.setFieldText(str);
            return true;
        }
        getMediaDataController().Q1(this.f45412w8, 0, str, null, null, null, null, 0L, false, false, null);
        if (this.parentLayout.getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if ((e2Var instanceof an) && ((an) e2Var).f45259k6 == this.f45412w8) {
                finishFragment();
                return true;
            }
            Bundle bundle = new Bundle();
            if (org.telegram.messenger.m5.C(this.f45412w8)) {
                bundle.putInt("enc_id", (int) (this.f45412w8 & 4294967295L));
            } else if (org.telegram.messenger.m5.E(this.f45412w8)) {
                bundle.putLong("user_id", this.f45412w8);
            } else {
                bundle.putLong("chat_id", -this.f45412w8);
            }
            I6();
            presentFragment(new an(bundle), true);
        }
        return true;
    }

    public final void ec() {
        TLRPC.Chat chat = this.f45173e;
        if (chat != null) {
            if (org.telegram.messenger.t3.n0(chat)) {
                if (org.telegram.messenger.t3.N(this.f45173e)) {
                    j40 j40Var = new j40(a());
                    j40Var.m0 = this;
                    presentFragment(j40Var);
                    return;
                }
                return;
            } else if (org.telegram.messenger.t3.w(1, this.f45173e)) {
                qc qcVar = new qc(a());
                qcVar.m0 = this;
                presentFragment(qcVar);
                return;
            } else {
                return;
            }
        }
        this.f45427xa = new org.telegram.ui.Components.ep(this, this.Aa);
        this.A0.setOnInterceptTouchListener(new org.telegram.messenger.fd(26));
        Pb(this.f45278m1, false);
        showDialog(this.f45427xa, new ge(this, 1));
    }

    public final void ed() {
        lh.h hVar = this.f45431y1;
        vi viVar = this.f45403w;
        if (hVar != null) {
            this.f45431y1.setTranslationY((((-viVar.d()) - this.U.getInputBubbleHeight()) - t9(org.telegram.ui.Components.l11.f36702c)) - org.telegram.messenger.g0.L(13.0f));
        }
        if (this.f45355s1 != null) {
            this.f45355s1.setTranslationY((-viVar.d()) - org.telegram.messenger.g0.L(16.0f));
        }
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.extendActionMode(android.view.Menu):boolean");
    }

    public final void f7() {
        ArrayList arrayList;
        int i7;
        if (this.mb) {
            int i10 = -1;
            int i11 = 0;
            long j3 = 0;
            while (true) {
                arrayList = this.L6;
                if (i11 >= arrayList.size()) {
                    break;
                }
                long d12 = ((org.telegram.messenger.gj) arrayList.get(i11)).d1();
                if (j3 != d12) {
                    if (i10 >= 0 && j3 != 0 && (i7 = i11 - i10) > 1) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 = 0; i12 < i7; i12++) {
                            arrayList2.add((org.telegram.messenger.gj) arrayList.remove(i10));
                        }
                        Collections.sort(arrayList2, new me(2));
                        arrayList.addAll(i10, arrayList2);
                    }
                    i10 = i11;
                    j3 = d12;
                }
                i11++;
            }
            if (i10 >= 0 && j3 != 0 && arrayList.size() - i10 > 1) {
                int size = arrayList.size() - i10;
                ArrayList arrayList3 = new ArrayList();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList3.add((org.telegram.messenger.gj) arrayList.remove(i10));
                }
                arrayList.addAll(i10, arrayList3);
            }
        }
    }

    public final void f8() {
        if (this.f45278m1 != null && this.Z1 == null && getParentActivity() != null) {
            this.Z1 = new ai.k0(2, getParentActivity(), this);
            M9();
            this.Z1.setClickable(true);
            this.f45134b1.addView(this.Z1, c8.ja.o(-1, 44));
            this.f45134b1.h(2, this.Z1);
            this.f45134b1.g(this.Z1);
            TextView textView = new TextView(getParentActivity());
            this.f45149c2 = textView;
            int i7 = org.telegram.ui.ActionBar.j6.f29090q7;
            org.telegram.ui.ActionBar.q6.U(textView, i7, getResourceProvider());
            TextView textView2 = this.f45149c2;
            float L = org.telegram.messenger.g0.L(18.0f);
            int L2 = org.telegram.messenger.g0.L(4.0f);
            org.telegram.ui.ActionBar.q6.Q(textView2, org.telegram.ui.ActionBar.j6.Y(L, getThemedColor(i7) & 436207615, L2, L2, L2, L2), null, org.telegram.ui.ActionBar.q6.g(i7, 25), getResourceProvider());
            this.f45149c2.setTag(Integer.valueOf(i7));
            this.f45149c2.setTextSize(1, 14.0f);
            this.f45149c2.setTypeface(org.telegram.messenger.g0.o());
            this.f45149c2.setSingleLine(true);
            this.f45149c2.setMaxLines(1);
            this.f45149c2.setGravity(17);
            this.Z1.addView(this.f45149c2, c8.ja.e(-1, -1, 51));
            this.f45149c2.setOnClickListener(new le(this, 13));
            org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(getParentActivity(), this.Aa);
            this.f45229i2 = z70Var;
            org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.Xe, getResourceProvider());
            this.f45229i2.setTextSize(1, 13.3f);
            this.f45229i2.setDisablePaddingsOffset(true);
            org.telegram.ui.ActionBar.q6.G(this.f45229i2, org.telegram.ui.ActionBar.j6.Zl, getResourceProvider());
            this.f45229i2.setGravity(17);
            this.f45229i2.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            this.f45134b1.addView(this.f45229i2, c8.ja.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.f45134b1.h(8, this.f45229i2);
            this.f45134b1.g(this.f45229i2);
            TextView textView3 = new TextView(getParentActivity());
            this.f45120a2 = textView3;
            int i10 = org.telegram.ui.ActionBar.j6.Ye;
            org.telegram.ui.ActionBar.q6.U(textView3, i10, getResourceProvider());
            this.f45120a2.setVisibility(8);
            this.f45120a2.setTextSize(1, 14.0f);
            this.f45120a2.setTypeface(org.telegram.messenger.g0.o());
            this.f45120a2.setSingleLine(true);
            this.f45120a2.setMaxLines(1);
            this.f45120a2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            this.f45120a2.setGravity(17);
            TextView textView4 = this.f45120a2;
            int themedColor = getThemedColor(i10) & 436207615;
            int L3 = org.telegram.messenger.g0.L(4.0f);
            org.telegram.ui.ActionBar.q6.Q(textView4, org.telegram.ui.ActionBar.j6.Y(org.telegram.messenger.g0.L(18.0f), themedColor, L3, L3, L3, L3), null, org.telegram.ui.ActionBar.q6.g(i10, 25), getResourceProvider());
            this.Z1.addView(this.f45120a2, c8.ja.e(-1, -1, 51));
            this.f45120a2.setOnClickListener(new le(this, 14));
            TextView textView5 = new TextView(getParentActivity());
            this.d2 = textView5;
            org.telegram.ui.ActionBar.q6.U(textView5, i10, getResourceProvider());
            this.d2.setVisibility(8);
            this.d2.setTextSize(1, 14.0f);
            this.d2.setTypeface(org.telegram.messenger.g0.o());
            this.d2.setSingleLine(true);
            this.d2.setMaxLines(1);
            this.d2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            this.d2.setGravity(17);
            this.d2.setText(org.telegram.messenger.hd.M0(2131746084, null));
            org.telegram.ui.ActionBar.q6.Q(this.d2, org.telegram.ui.ActionBar.j6.h0(getThemedColor(i10) & 436207615, 3, -1), null, org.telegram.ui.ActionBar.q6.g(i10, 25), getResourceProvider());
            this.f45134b1.addView(this.d2, c8.ja.o(-1, 48));
            this.f45134b1.h(4, this.d2);
            this.f45134b1.g(this.d2);
            this.d2.setOnClickListener(new le(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.f45242j2 = imageView;
            imageView.setImageResource(2131231983);
            this.f45242j2.setContentDescription(org.telegram.messenger.hd.M0(2131752041, null));
            ImageView imageView2 = this.f45242j2;
            int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
            org.telegram.ui.ActionBar.q6.Q(imageView2, org.telegram.ui.ActionBar.j6.O(getThemedColor(i11), 0, 0), null, org.telegram.ui.ActionBar.q6.M(i11), getResourceProvider());
            org.telegram.ui.ActionBar.q6.s(this.f45242j2, org.telegram.ui.ActionBar.j6.Ue, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.f45242j2.setScaleType(ImageView.ScaleType.CENTER);
            this.Z1.addView(this.f45242j2, c8.ja.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.f45242j2.setOnClickListener(new le(this, 16));
        }
    }

    public final int f9(int i7) {
        return (int) org.telegram.ui.Cells.y0.v((((this.A0.getMeasuredHeight() - this.Xa) - this.O9) - this.f45403w.e()) - org.telegram.messenger.g0.L(53.0f), i7, 2.0f, -org.telegram.messenger.g0.L(2.0f));
    }

    public final boolean fa() {
        if (this.f45281m4 != null) {
            return true;
        }
        return false;
    }

    public final void fb(int i7, org.telegram.messenger.gj gjVar) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.hd.u(gjVar.f23817k.date, false);
        tL_message.f28072id = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(gjVar.f23817k.date * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
        org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(this.currentAccount, tL_message, false, false);
        gjVar2.D = 10;
        gjVar2.U = 1;
        gjVar2.f23823l0 = true;
        gjVar2.f23827m1 = q9(gjVar.X);
        this.D0.Q.add(i7, gjVar2);
    }

    public final void fc(boolean z10, org.telegram.messenger.gj gjVar, ArrayList arrayList, TLRPC.WebPage webPage, boolean z11, int i7, qm qmVar, boolean z12, long j3) {
        gc(z10, gjVar, null, arrayList, webPage, z11, i7, qmVar, z12, j3, null, true);
    }

    public final void fd(boolean z10) {
        boolean z11;
        Object[] objArr;
        Object[] objArr2;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Integer num;
        boolean z17;
        float f10;
        float f11;
        float f12;
        int i7;
        float f13;
        float f14;
        float f15;
        int i10;
        float f16;
        float f17;
        float f18;
        int i11;
        Integer num2;
        Integer num3;
        Integer num4;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        if ((!fa() || this.f45408w4) && this.f45121a3 != null) {
            if (!this.f45194f6) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (this.U4.size() > 1 && !this.X2) {
                objArr = 1;
            } else {
                objArr = null;
            }
            if (this.f45121a3.getTag() != null) {
                objArr2 = 1;
            } else {
                objArr2 = null;
            }
            if (this.Z2.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.Y2.getTag() != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (objArr == null && !this.f45185ec && !this.X2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (objArr != null && !this.f45185ec && !this.X2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.f45185ec && !this.X2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (objArr2 == objArr && z12 == z16 && z13 == z14) {
                z17 = false;
            } else {
                AnimatorSet animatorSet = this.f45136b3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f45136b3 = null;
                }
                if (z11) {
                    if (objArr != null) {
                        this.f45121a3.setVisibility(0);
                    } else if (z14) {
                        this.Y2.setVisibility(0);
                    }
                    if (z16) {
                        this.Z2.setVisibility(0);
                        this.Z2.setAlpha(0.0f);
                        this.Z2.setScaleX(0.4f);
                        this.Z2.setScaleY(0.4f);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.f45136b3 = animatorSet2;
                    ImageView imageView = this.f45121a3;
                    Property property = View.ALPHA;
                    if (z15) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, f19);
                    ImageView imageView2 = this.f45121a3;
                    Property property2 = View.SCALE_X;
                    if (z15) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.4f;
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property2, f20);
                    ImageView imageView3 = this.f45121a3;
                    Property property3 = View.SCALE_Y;
                    if (z15) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.4f;
                    }
                    z17 = false;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, property3, f21);
                    ImageView imageView4 = this.Y2;
                    if (z14) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    num = 1;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView4, property, f22);
                    ImageView imageView5 = this.Y2;
                    if (z14) {
                        f23 = 1.0f;
                    } else {
                        f23 = 0.4f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView5, property2, f23);
                    ImageView imageView6 = this.Y2;
                    if (z14) {
                        f24 = 1.0f;
                    } else {
                        f24 = 0.4f;
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView6, property3, f24);
                    RadialProgressView radialProgressView = this.Z2;
                    if (!z16) {
                        f25 = 0.0f;
                    } else {
                        f25 = 1.0f;
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(radialProgressView, property, f25);
                    RadialProgressView radialProgressView2 = this.Z2;
                    if (!z16) {
                        f26 = 0.4f;
                    } else {
                        f26 = 1.0f;
                    }
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(radialProgressView2, property2, f26);
                    RadialProgressView radialProgressView3 = this.Z2;
                    if (!z16) {
                        f27 = 0.4f;
                    } else {
                        f27 = 1.0f;
                    }
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(radialProgressView3, property3, f27));
                    this.f45136b3.setInterpolator(org.telegram.ui.Components.er.h);
                    this.f45136b3.setDuration(360L);
                    this.f45136b3.addListener(new al(this, z14, z15, z16));
                    this.f45136b3.start();
                } else {
                    num = 1;
                    z17 = false;
                    ImageView imageView7 = this.Y2;
                    if (z14) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    imageView7.setAlpha(f10);
                    ImageView imageView8 = this.Y2;
                    if (z14) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.4f;
                    }
                    imageView8.setScaleX(f11);
                    ImageView imageView9 = this.Y2;
                    if (z14) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.4f;
                    }
                    imageView9.setScaleY(f12);
                    ImageView imageView10 = this.Y2;
                    if (z14) {
                        i7 = 0;
                    } else {
                        i7 = 4;
                    }
                    imageView10.setVisibility(i7);
                    ImageView imageView11 = this.f45121a3;
                    if (z15) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    imageView11.setAlpha(f13);
                    ImageView imageView12 = this.f45121a3;
                    if (z15) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.4f;
                    }
                    imageView12.setScaleX(f14);
                    ImageView imageView13 = this.f45121a3;
                    if (z15) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.4f;
                    }
                    imageView13.setScaleY(f15);
                    ImageView imageView14 = this.f45121a3;
                    if (z15) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView14.setVisibility(i10);
                    RadialProgressView radialProgressView4 = this.Z2;
                    if (z16) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    radialProgressView4.setAlpha(f16);
                    RadialProgressView radialProgressView5 = this.Z2;
                    if (z16) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.4f;
                    }
                    radialProgressView5.setScaleX(f17);
                    RadialProgressView radialProgressView6 = this.Z2;
                    if (z16) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.4f;
                    }
                    radialProgressView6.setScaleY(f18);
                    RadialProgressView radialProgressView7 = this.Z2;
                    if (z16) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    radialProgressView7.setVisibility(i11);
                }
                ImageView imageView15 = this.Y2;
                if (z14) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                imageView15.setTag(num2);
                ImageView imageView16 = this.f45121a3;
                if (objArr != null) {
                    num3 = num;
                } else {
                    num3 = null;
                }
                imageView16.setTag(num3);
                RadialProgressView radialProgressView8 = this.Z2;
                if (z16) {
                    num4 = num;
                } else {
                    num4 = null;
                }
                radialProgressView8.setTag(num4);
            }
            if (this.O2 != null) {
                if (fa() && !this.f45408w4) {
                    boolean z18 = z17;
                    this.O2.c(z18 ? 1 : 0, 1, z18);
                    return;
                }
                this.O2.c((this.U4.size() - 1) - Collections.binarySearch(this.U4, Integer.valueOf(this.Y4), Comparator$CC.reverseOrder()), this.U4.size(), z11);
            }
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.g1 g1Var = this.f45197f9;
        if (g1Var != null) {
            g1Var.f28555e = false;
            P7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.f45173e;
    }

    public final void g7(boolean z10) {
        jg.l1 l1Var;
        if (this.f45164d4 == 2 && (l1Var = this.f45137b4) != null) {
            String str = this.J3;
            hi.e1 e1Var = l1Var.F;
            if (!TextUtils.equals(l1Var.f17189y, str)) {
                String trim = str.trim();
                String str2 = null;
                if (trim.charAt(0) != '$' && trim.charAt(0) != '#') {
                    trim = null;
                } else {
                    int indexOf = trim.indexOf(64);
                    if (indexOf >= 0) {
                        String substring = trim.substring(0, indexOf);
                        str2 = trim.substring(indexOf + 1);
                        trim = substring;
                    }
                }
                org.telegram.messenger.g0.r(e1Var);
                fi.d6 d6Var = l1Var.E;
                if (d6Var != null && d6Var.I != 0) {
                    ConnectionsManager.getInstance(d6Var.f11940c).cancelRequest(d6Var.I, true);
                    d6Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    l1Var.f17189y = str;
                    l1Var.E = new fi.d6(l1Var.f17185r, str2, trim);
                    if (z10) {
                        e1Var.run();
                    } else {
                        org.telegram.messenger.g0.i3(e1Var, 1000L);
                    }
                }
                fi.d6 d6Var2 = l1Var.E;
                if (d6Var2 != null && d6Var2.J > 0) {
                    l1Var.f();
                }
            }
        }
    }

    public final void g8() {
        int i7;
        if (this.f45202g2 == null && getParentActivity() != null) {
            if (this.M2 == null) {
                b8();
            }
            org.telegram.ui.Components.p11 p11Var = new org.telegram.ui.Components.p11(getParentActivity(), this, this.currentAccount, a(), O6(), getResourceProvider());
            this.f45202g2 = p11Var;
            p11Var.S = new yd(this, 6);
            p11Var.setSideMenuBackgroundDrawable(this.L.c(p11Var, c8.g0.o(this.Aa), false));
            org.telegram.ui.Components.p11 p11Var2 = this.f45202g2;
            p11Var2.setTopMenuBackgroundDrawable(this.L.c(p11Var2, c8.g0.o(this.Aa), false));
            this.f45202g2.setCurrentTopic(b());
            this.f45202g2.setOnNewTopicSelected(new yd(this, 8));
            this.f45202g2.setOnTopicSelected(new je(this, 0));
            this.f45202g2.setOnDialogSelected(new je(this, 1));
            int indexOfChild = this.f45278m1.indexOfChild(this.Z);
            if (indexOfChild >= 0) {
                i7 = indexOfChild + 1;
            } else {
                i7 = 8;
            }
            this.f45278m1.addView(this.f45202g2, i7, c8.ja.f(-1.0f, -1, 51, 0, -org.telegram.messenger.g0.L(5.0f), 0, 0));
            this.f45202g2.p();
            Dd();
            jj jjVar = this.X1;
            if (jjVar != null) {
                jjVar.bringToFront();
            }
        }
    }

    public final int g9(org.telegram.messenger.gj gjVar) {
        return f9(W8(gjVar, !TextUtils.isEmpty(this.f45208g8))) - yb(gjVar);
    }

    public final boolean ga() {
        if (Z9()) {
            return getMessagesController().G1().e();
        }
        org.telegram.ui.Components.p11 p11Var = this.f45202g2;
        if (p11Var == null || !p11Var.f38145a.f57082f) {
            return false;
        }
        if (!org.telegram.messenger.t3.u0(this.f45173e)) {
            TLRPC.User user = this.f45187f;
            if (!org.telegram.messenger.q10.u(user) || !user.bot_forum_sidebar) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void gb(Bundle bundle, org.telegram.messenger.gj gjVar) {
        TLRPC.Peer peer;
        TLRPC.Chat chat = this.f45173e;
        if (chat != null && org.telegram.messenger.t3.V(chat) && !org.telegram.messenger.t3.p0(this.f45173e)) {
            TLRPC.Chat chat2 = this.f45173e;
            if (chat2.broadcast_messages_allowed && chat2.linked_monoforum_id != 0 && getMessagesController().M0(Long.valueOf(this.f45173e.linked_monoforum_id)) != null && !org.telegram.messenger.t3.z(this.currentAccount, 24, -this.f45173e.linked_monoforum_id)) {
                org.telegram.messenger.np messagesController = getMessagesController();
                TLRPC.Chat chat3 = this.f45173e;
                long j3 = chat3.f28051id;
                long j10 = chat3.linked_monoforum_id;
                ConcurrentHashMap concurrentHashMap = messagesController.f25272f;
                concurrentHashMap.put(Long.valueOf(j3), Long.valueOf(j10));
                concurrentHashMap.put(Long.valueOf(j10), Long.valueOf(j3));
                bundle.putLong("reply_to_channel_direct", -this.f45173e.linked_monoforum_id);
                return;
            }
        }
        TLRPC.Message message = gjVar.f23817k;
        if (message != null) {
            peer = message.from_id;
        } else {
            peer = null;
        }
        long o4 = org.telegram.messenger.m5.o(peer);
        int i7 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
        if (i7 != 0 && o4 != a() && o4 != getUserConfig().e() && i7 > 0) {
            bundle.putLong("reply_to_author", o4);
        }
    }

    public final void gc(boolean r34, org.telegram.messenger.gj r35, org.telegram.messenger.gj r36, java.util.ArrayList r37, org.telegram.tgnet.TLRPC.WebPage r38, boolean r39, int r40, org.telegram.ui.qm r41, boolean r42, long r43, org.telegram.messenger.lj r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.gc(boolean, org.telegram.messenger.gj, org.telegram.messenger.gj, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.qm, boolean, long, org.telegram.messenger.lj, boolean):void");
    }

    public final void gd(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.gd(int, boolean):void");
    }

    @Override
    public final org.telegram.ui.ActionBar.k4 getBackButtonState() {
        return org.telegram.ui.ActionBar.k4.f29337a;
    }

    @Override
    public final org.telegram.ui.ActionBar.m3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.m3.f29381c;
    }

    @Override
    public final org.telegram.messenger.r3 getGroupCall() {
        org.telegram.messenger.r3 r3Var;
        if (this.f45204g4 == 0 && (r3Var = this.f45296n8) != null && (r3Var.f26208b instanceof TLRPC.TL_groupCall)) {
            return r3Var;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.f45204g4 == 2) {
            ArrayList arrayList = this.L6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(80.0f) + W8((org.telegram.messenger.gj) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.Aa;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        View view;
        org.telegram.ui.Components.ly lyVar;
        org.telegram.ui.Components.ly lyVar2;
        org.telegram.ui.Components.ly lyVar3;
        org.telegram.ui.Components.ly lyVar4;
        org.telegram.ui.Components.ly lyVar5;
        org.telegram.ui.Components.ly lyVar6;
        org.telegram.ui.Components.ly lyVar7;
        org.telegram.ui.Components.ly lyVar8;
        org.telegram.ui.Components.ly lyVar9;
        org.telegram.ui.Components.ly lyVar10;
        org.telegram.ui.Components.ly lyVar11;
        View view2;
        org.telegram.ui.Components.ly lyVar12 = null;
        if (this.f45397v7) {
            return null;
        }
        int i7 = 0;
        if (this.f45414wa) {
            this.f45414wa = false;
            return null;
        }
        g6 g6Var = new g6(1, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ge));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.He));
        Y9();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.F8));
        ui uiVar = this.f45314p1;
        if (uiVar != null) {
            j5Var = uiVar.getTitleTextView();
        } else {
            j5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(j5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.A8));
        ui uiVar2 = this.f45314p1;
        if (uiVar2 != null) {
            j5Var2 = uiVar2.getTitleTextView();
        } else {
            j5Var2 = null;
        }
        int i10 = org.telegram.ui.ActionBar.j6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.s6(j5Var2, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        ui uiVar3 = this.f45314p1;
        if (uiVar3 != null) {
            view = uiVar3.getSubtitleTextView();
        } else {
            view = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(i10, view));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.C8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.s6(kVar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 2097152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29224x8));
        org.telegram.ui.ActionBar.r4 r4Var = (org.telegram.ui.ActionBar.r4) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.r4 r4Var2 = (org.telegram.ui.ActionBar.r4) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.r4 r4Var3 = (org.telegram.ui.ActionBar.r4) getThemedDrawable("drawableMsgInSelected");
        org.telegram.ui.ActionBar.r4 r4Var4 = (org.telegram.ui.ActionBar.r4) getThemedDrawable("drawableMsgInMediaSelected");
        org.telegram.ui.ActionBar.r4 r4Var5 = (org.telegram.ui.ActionBar.r4) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.r4 r4Var6 = (org.telegram.ui.ActionBar.r4) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.r4 r4Var7 = (org.telegram.ui.ActionBar.r4) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.r4 r4Var8 = (org.telegram.ui.ActionBar.r4) getThemedDrawable("drawableMsgOutMediaSelected");
        if (r4Var != null) {
            Drawable[] drawableArr = r4Var.A;
            int i12 = org.telegram.ui.ActionBar.j6.f29149ta;
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.r6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, r4Var2.A, (org.telegram.ui.ActionBar.r6) null, i12));
            Drawable[] drawableArr2 = r4Var5.A;
            int i13 = org.telegram.ui.ActionBar.j6.f29150tb;
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, drawableArr2, (org.telegram.ui.ActionBar.r6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, r4Var6.A, (org.telegram.ui.ActionBar.r6) null, i13));
        }
        if (!this.Aa.q(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{r4Var5, r4Var6}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29170ub));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{r4Var5, r4Var6}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29189vb));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{r4Var5, r4Var6}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29208wb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{r4Var7, r4Var8}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28929hd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28947id));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28797ac));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28818bc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29037nc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29075pc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29055oc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28913gf));
        this.Aa.getClass();
        tj tjVar = this.f45203g3;
        Paint themedPaint = getThemedPaint("paintChatComposeBackground");
        int i14 = org.telegram.ui.ActionBar.j6.Je;
        arrayList.add(new org.telegram.ui.ActionBar.s6(tjVar, 0, (Class[]) null, themedPaint, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.T, 0, (Class[]) null, getThemedPaint("paintChatComposeBackground"), (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f45118a0, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ol));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f45118a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Qe));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f45118a0, 0, new Class[]{ChatActivityEnterView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Re));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f45118a0, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28821bg));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f45118a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28877eg));
        qj qjVar = this.f45118a0;
        int i15 = org.telegram.ui.ActionBar.j6.f28858dg;
        arrayList.add(new org.telegram.ui.ActionBar.s6(qjVar, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f45118a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f45118a0, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28894fg));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f45118a0, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Uf));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f45118a0, 0, new Class[]{ChatActivityEnterView.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Xf));
        qj qjVar2 = this.f45118a0;
        if (qjVar2 != null) {
            lyVar = qjVar2.getEmojiView();
        } else {
            lyVar = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(lyVar, 0, new Class[]{org.telegram.ui.Components.ly.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Cf));
        qj qjVar3 = this.f45118a0;
        if (qjVar3 != null) {
            lyVar2 = qjVar3.getEmojiView();
        } else {
            lyVar2 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(lyVar2, 0, new Class[]{org.telegram.ui.Components.ly.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Df));
        qj qjVar4 = this.f45118a0;
        if (qjVar4 != null) {
            lyVar3 = qjVar4.getEmojiView();
        } else {
            lyVar3 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(lyVar3, 0, new Class[]{org.telegram.ui.Components.ly.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Ef));
        qj qjVar5 = this.f45118a0;
        if (qjVar5 != null) {
            lyVar4 = qjVar5.getEmojiView();
        } else {
            lyVar4 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(lyVar4, 0, new Class[]{org.telegram.ui.Components.ly.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Gf));
        qj qjVar6 = this.f45118a0;
        if (qjVar6 != null) {
            lyVar5 = qjVar6.getEmojiView();
        } else {
            lyVar5 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(lyVar5, 0, new Class[]{org.telegram.ui.Components.ly.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Hf));
        qj qjVar7 = this.f45118a0;
        if (qjVar7 != null) {
            lyVar6 = qjVar7.getEmojiView();
        } else {
            lyVar6 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(lyVar6, 0, new Class[]{org.telegram.ui.Components.ly.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Jf));
        qj qjVar8 = this.f45118a0;
        if (qjVar8 != null) {
            lyVar7 = qjVar8.getEmojiView();
        } else {
            lyVar7 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(lyVar7, 0, new Class[]{org.telegram.ui.Components.ly.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Kf));
        qj qjVar9 = this.f45118a0;
        if (qjVar9 != null) {
            lyVar8 = qjVar9.getEmojiView();
        } else {
            lyVar8 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(lyVar8, 0, new Class[]{org.telegram.ui.Components.ly.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Of));
        qj qjVar10 = this.f45118a0;
        if (qjVar10 != null) {
            lyVar9 = qjVar10.getEmojiView();
        } else {
            lyVar9 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(lyVar9, 0, new Class[]{org.telegram.ui.Components.ly.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Ff));
        qj qjVar11 = this.f45118a0;
        if (qjVar11 != null) {
            lyVar10 = qjVar11.getEmojiView();
        } else {
            lyVar10 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(lyVar10, 0, new Class[]{org.telegram.ui.Components.ly.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Bf));
        qj qjVar12 = this.f45118a0;
        if (qjVar12 != null) {
            lyVar11 = qjVar12.getEmojiView();
        } else {
            lyVar11 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(lyVar11, 0, new Class[]{org.telegram.ui.Components.ly.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Mf));
        qj qjVar13 = this.f45118a0;
        if (qjVar13 != null) {
            lyVar12 = qjVar13.getEmojiView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(lyVar12, 0, new Class[]{org.telegram.ui.Components.ly.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.If));
        qj qjVar14 = this.f45118a0;
        if (qjVar14 != null) {
            org.telegram.ui.Components.j31 trendingStickersAlert = qjVar14.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.V());
            }
            arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (String[]) null, new Drawable[]{this.f45118a0.getStickersArrowDrawable()}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Nl));
        }
        for (int i16 = 0; i16 < 2; i16++) {
            if (i16 == 0) {
                view2 = this.N3;
            } else {
                view2 = this.O3;
            }
            arrayList.add(new org.telegram.ui.ActionBar.s6(view2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.wj));
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Pf));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Qf));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Rf));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29185v7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29166u7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29242y7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.O2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.f28849d6));
        NumberTextView numberTextView = this.U2;
        int i17 = org.telegram.ui.ActionBar.j6.We;
        arrayList.add(new org.telegram.ui.ActionBar.s6(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i17));
        ImageView imageView = this.f45217h3;
        int i18 = org.telegram.ui.ActionBar.j6.f29262z8;
        arrayList.add(new org.telegram.ui.ActionBar.s6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f45230i3, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.n1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 131072, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29230xf));
        hi.n5 n5Var = this.S;
        int i19 = org.telegram.ui.ActionBar.j6.f28838cd;
        arrayList.add(new org.telegram.ui.ActionBar.s6(n5Var, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f45328q2, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.n1, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28978k6));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29005lg));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29022mg));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Lh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ph));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Uh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Wh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Zh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28803ai));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28823bi));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28792a7));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.tk));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.vk));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.uk));
        int i20 = org.telegram.ui.ActionBar.j6.wk;
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i20));
        zh.d dVar = this.Ba;
        if (dVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(dVar.f61415g, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.s6(dVar.h, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ue));
        }
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.ActionBar.s6) obj).f29608n = this.Aa;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.Aa.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint d = this.Aa.d(str);
        if (d != null) {
            return d;
        }
        return org.telegram.ui.ActionBar.j6.V0(str);
    }

    public final void h7() {
        this.U.d();
        ed();
        Oc();
        B7();
        y7();
        D7();
        C7();
        G7();
        N9();
        boolean z10 = true;
        if (this.f45403w.f56036s == 1) {
            z10 = false;
        }
        if (this.f45363sb != z10) {
            this.f45363sb = z10;
            checkSystemBarColors();
        }
    }

    public final void h8() {
        if (this.N3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.Aa);
            this.N3 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
            this.f45278m1.addView(this.N3, c8.ja.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final int h9(View view) {
        org.telegram.messenger.a8.b("getScrollingOffsetForView view=" + view + " results in {" + ((this.A0.getMeasuredHeight() - view.getBottom()) - this.A0.getPaddingBottom()) + "} chatHeight=" + this.A0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.A0.getPaddingBottom());
        return (this.A0.getMeasuredHeight() - view.getBottom()) - this.A0.getPaddingBottom();
    }

    public final void ha(int i7) {
        int i10;
        TLRPC.Message message;
        int i11;
        ArrayList arrayList = this.L6;
        if (!arrayList.isEmpty()) {
            int i12 = 1;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList);
            if ((((org.telegram.messenger.gj) arrayList.get(0)).f23817k.date >= i7 && gjVar.f23817k.date <= i7) || (gjVar.f23817k.date >= i7 && this.T6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(size);
                    if (gjVar2.f23817k.date >= i7 && gjVar2.e1() != 0) {
                        int e12 = gjVar2.e1();
                        if (org.telegram.messenger.gj.B0(gjVar2.f23817k) != this.f45154c7) {
                            i12 = 0;
                        }
                        l(e12, 0, false, i12, true, 0);
                        return;
                    }
                }
            } else if (!org.telegram.messenger.m5.C(this.f45259k6)) {
                int N0 = this.C0.N0();
                int L0 = this.C0.L0();
                while (true) {
                    if (L0 <= N0) {
                        jl jlVar = this.D0;
                        int i13 = jlVar.K;
                        if (L0 >= i13 && L0 < jlVar.L && (message = ((org.telegram.messenger.gj) arrayList.get(L0 - i13)).f23817k) != null) {
                            if (message.date < i7) {
                                i11 = 1;
                            } else {
                                i11 = 0;
                            }
                            if (z()) {
                                i11 ^= 1;
                            }
                            i10 = i11 ^ 1;
                        } else {
                            L0++;
                        }
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                this.f45297n9.f(i10);
                org.telegram.ui.ActionBar.t1 t1Var = this.Sb;
                if (t1Var != null) {
                    t1Var.dismiss();
                }
                fd(false);
                org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), this.Aa);
                this.Sb = t1Var2;
                t1Var2.setOnCancelListener(this.Ia);
                this.Sb.r(1000L);
                int i14 = this.f45283m6;
                this.f45322p9 = i14;
                this.f45349r9 = false;
                this.f45436y6.add(Integer.valueOf(i14));
                this.f45335q9 = 0;
                this.s9 = false;
                org.telegram.messenger.np messagesController = getMessagesController();
                long j3 = this.f45259k6;
                long j10 = this.f45154c7;
                int i15 = this.classGuid;
                int i16 = this.f45204g4;
                long j11 = this.f45358s4;
                int i17 = this.B4;
                int i18 = this.f45283m6;
                this.f45283m6 = i18 + 1;
                messagesController.Y2(j3, j10, false, 30, 0, i7, true, 0, i15, 4, i16, j11, i17, i18, this.f45408w4);
                this.f45280m3.setAlpha(0.0f);
                this.f45280m3.setTag(null);
                this.f45420x3 = 0.0f;
                Tc();
                this.f45291n3.setTag(null);
            }
        }
    }

    public final void hb() {
        int i7;
        this.U4.clear();
        this.W4.clear();
        this.Y4 = 0;
        this.f45152c5 = 0;
        this.f45165d5 = 0;
        gd(0, true);
        org.telegram.messenger.si mediaDataController = getMediaDataController();
        long a10 = a();
        TLRPC.ChatFull chatFull = this.f45334q8;
        if (chatFull == null) {
            i7 = 0;
        } else {
            i7 = chatFull.pinned_msg_id;
        }
        mediaDataController.Q0(0, i7, a10);
        this.f45179e5 = true;
        hd();
    }

    public final void hc(ArrayList arrayList) {
        fc(true, null, arrayList, null, true, 0, null, false, 0L);
    }

    public final void hd() {
        org.telegram.messenger.gj gjVar;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f45408w4 && !this.W4.isEmpty() && this.U4.size() == 1 && ((Integer) this.U4.get(0)).intValue() == b() + 1) {
            gjVar = (org.telegram.messenger.gj) this.W4.get(this.U4.get(0));
        } else {
            gjVar = null;
        }
        this.f45292n4 = gjVar;
        if (this.f45408w4 && gjVar != null && (message = gjVar.f23817k) != null && (tL_forumTopic = this.f45344r4) != null && !org.telegram.messenger.gj.v5(tL_forumTopic.from_id, message.from_id)) {
            TLRPC.Chat chat = this.f45173e;
            TLRPC.Peer peer = this.f45292n4.f23817k.from_id;
            if (chat != null || peer != null) {
                if (chat != null && peer != null) {
                    if (org.telegram.messenger.t3.T(chat) && (peer instanceof TLRPC.TL_peerChannel)) {
                        if (chat.f28051id == peer.channel_id) {
                            return;
                        }
                    } else if (!org.telegram.messenger.t3.T(chat) && (peer instanceof TLRPC.TL_peerChat) && chat.f28051id == peer.chat_id) {
                        return;
                    }
                }
                this.f45292n4 = null;
            }
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        org.telegram.messenger.gj gjVar = this.f45281m4;
        if (gjVar != null && gjVar.M1() == 0 && org.telegram.messenger.t3.n(this.f45173e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public final void i7() {
        TLRPC.Chat M0;
        long j3 = getArguments().getInt("search_from_user_id", 0);
        if (j3 != 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
            if (a22 != null) {
                Oa("");
                ImageView imageView = this.f45230i3;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                Db(null, a22);
                return;
            }
            return;
        }
        long j10 = getArguments().getInt("search_from_chat_id", 0);
        if (j10 != 0 && (M0 = getMessagesController().M0(Long.valueOf(j10))) != null) {
            Oa("");
            ImageView imageView2 = this.f45230i3;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            Db(M0, null);
        }
    }

    public final ArrayList i8(org.telegram.messenger.gj gjVar, boolean z10) {
        ArrayList j3 = org.telegram.messenger.k5.j(gjVar);
        int e12 = gjVar.e1();
        gjVar.A0();
        if (e12 != 0) {
            ArrayList arrayList = this.L6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(size);
                if ((org.telegram.messenger.gj.B0(gjVar2.f23817k) != this.f45154c7 || org.telegram.messenger.gj.B0(gjVar.f23817k) == this.f45154c7) && (((this.h == null && gjVar2.e1() > e12) || (this.h != null && gjVar2.e1() < e12)) && ((org.telegram.messenger.gj.R4(gjVar2.f23817k) || gjVar2.h4()) && !gjVar2.S4() && !gjVar2.g4() && (!z10 || (gjVar2.f23817k.media_unread && !gjVar2.N3()))))) {
                    j3.add(gjVar2);
                }
            }
        }
        return j3;
    }

    public final sm i9() {
        if (this.Uc == null) {
            this.Uc = new sm(this);
        }
        return this.Uc;
    }

    public final void ia(org.telegram.ui.ActionBar.g1 g1Var) {
        if (Build.VERSION.SDK_INT >= 30 && g1Var != null && g1Var.isShowing()) {
            View contentView = g1Var.getContentView();
            View rootView = contentView.getRootView();
            final boolean[] zArr = new boolean[1];
            final ai.b bVar = new ai.b(this, rootView, zArr, g1Var, contentView);
            rootView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    zArr[0] = false;
                    view.post(bVar);
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
            rootView.addOnLayoutChangeListener(new lg(bVar, 0));
            rootView.requestApplyInsets();
        }
    }

    public final void ib(org.telegram.messenger.gj gjVar) {
        if (gjVar == this.f45325pc) {
            this.f45325pc = null;
            zd(true);
            return;
        }
        org.telegram.messenger.jp O1 = getMessagesController().O1(this.f45259k6);
        if (O1 != null) {
            O1.f24584a.remove(gjVar);
        }
    }

    public final void ic(org.telegram.messenger.gj gjVar) {
        gc(true, gjVar, null, null, null, true, 0, null, false, 0L, null, true);
    }

    public final void id(boolean z10) {
        boolean z11;
        int i7;
        if (getParentActivity() == null) {
            return;
        }
        if (this.B1 > 0 && ((i7 = this.f45204g4) == 0 || i7 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45431y1.e(4, z11, z10);
        this.f45431y1.c(4, this.B1, z10);
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z10;
        int x02;
        if (Y9()) {
            org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                x02 = resourceProvider.f(org.telegram.ui.ActionBar.j6.f29205w8);
            } else {
                x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29205w8, true);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z10 = org.telegram.ui.ActionBar.j6.I.q();
        } else {
            z10 = this.f45212gc;
        }
        return !z10;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        org.telegram.ui.Components.v01 v01Var;
        lk lkVar;
        wh.i iVar;
        if ((this.f45204g4 == 5 && (this.L6.isEmpty() || this.f45358s4 == 0)) || (((v01Var = this.f45289n0) != null && (v01Var.f40230y > 0.0f || v01Var.V)) || this.f45426x9 || this.f45199fd.f57082f || !this.J9 || (((lkVar = this.f45144bb) != null && lkVar.f35955s) || ((iVar = this.f45374ta) != null && iVar.a())))) {
            return false;
        }
        return true;
    }

    public TLRPC.User j() {
        return this.f45187f;
    }

    public final void j7() {
        org.telegram.messenger.gj gjVar;
        if (!this.Q4 && (gjVar = this.f45126a8) != null) {
            if (this.L6.indexOf(gjVar) >= 0) {
                this.R4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.P4 != null) {
        } else {
            ye yeVar = new ye(this, 20);
            this.P4 = yeVar;
            org.telegram.messenger.g0.h3(yeVar);
        }
    }

    public final void j8(final int i7, final int i10, final boolean z10) {
        this.D0.N.clear();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.L6;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i11);
            int i12 = gjVar.f23817k.date;
            if (i12 <= i7 || i12 >= i10) {
                this.D0.N.add(gjVar);
            }
            i11++;
        }
        aj ajVar = this.A0;
        if (ajVar != null) {
            ajVar.setEmptyView(null);
        }
        if (this.D0.N.isEmpty()) {
            wc(true);
        }
        jl jlVar = this.D0;
        jlVar.M = true;
        jlVar.O(true);
        h8();
        UndoView undoView = this.N3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f45259k6, 81, new Runnable() {
            @Override
            public final void run() {
                long j3;
                an anVar = an.this;
                org.telegram.messenger.np messagesController = anVar.getMessagesController();
                long j10 = anVar.f45259k6;
                if (org.telegram.messenger.t3.T(anVar.f45173e)) {
                    j3 = anVar.f45259k6;
                } else {
                    j3 = 0;
                }
                messagesController.d0(j10, j3, i7, i10, z10, new uf(anVar, 21));
            }
        }, new uf(this, 19));
    }

    public final long j9() {
        org.telegram.messenger.gj gjVar;
        TLRPC.Message message;
        org.telegram.messenger.gj gjVar2;
        TLRPC.Message message2;
        if (!org.telegram.messenger.t3.p0(this.f45173e) || !org.telegram.messenger.t3.A(this.currentAccount, this.f45173e, 24)) {
            return 0L;
        }
        long j3 = this.f45358s4;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 == 0 && (gjVar2 = this.G5) != null && (message2 = gjVar2.f23817k) != null) {
            return org.telegram.messenger.m5.o(message2.saved_peer_id);
        }
        if (i7 == 0 && (gjVar = this.E5) != null && (message = gjVar.f23817k) != null) {
            return org.telegram.messenger.m5.o(message.saved_peer_id);
        }
        return j3;
    }

    public final void ja(ArrayList arrayList) {
        org.telegram.ui.Components.p11 p11Var;
        if (arrayList != null && (p11Var = this.f45202g2) != null && p11Var.U) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
                if (gjVar != null && gjVar.D == 36) {
                    TLRPC.MessageMedia n1 = org.telegram.messenger.gj.n1(gjVar.f23817k);
                    ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.f54338a;
                    if (n1 instanceof TLRPC.TL_messageMediaWidget) {
                        if (!gjVar.U2) {
                            gjVar.U2 = true;
                            gjVar.n0(null);
                        }
                    }
                }
                if (gjVar != null && gjVar.P2() && !gjVar.P3() && gjVar.c1() != 0 && !gjVar.U2) {
                    gjVar.U2 = true;
                    gjVar.n0(null);
                }
            }
        }
    }

    public final void jb(org.telegram.messenger.gj gjVar) {
        ArrayList arrayList = this.L6;
        int indexOf = arrayList.indexOf(gjVar);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            jl jlVar = this.D0;
            if (jlVar != null && !jlVar.O) {
                jlVar.s(jlVar.K + indexOf);
            }
        }
    }

    public final void jc(org.telegram.messenger.gj gjVar, qm qmVar) {
        fc(true, gjVar, null, null, true, 0, qmVar, false, 0L);
    }

    public final void jd(boolean z10) {
        boolean z11;
        int i7;
        if (getParentActivity() == null) {
            return;
        }
        if (this.A1 > 0 && ((i7 = this.f45204g4) == 0 || i7 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45431y1.e(3, z11, z10);
        this.f45431y1.c(3, this.A1, z10);
    }

    public final void k7(boolean z10) {
        if (this.E5 != null) {
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.L6;
                if (i7 < arrayList.size()) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
                    if (gjVar != null && gjVar.e1() == this.E5.e1() && org.telegram.messenger.gj.B0(gjVar.f23817k) == org.telegram.messenger.gj.B0(this.E5.f23817k)) {
                        this.E5 = gjVar;
                        qm qmVar = this.C5;
                        if (qmVar != null) {
                            qmVar.a(gjVar);
                        }
                        if (z10) {
                            org.telegram.messenger.kj kjVar = this.f45409w5;
                            if (kjVar != null) {
                                org.telegram.messenger.gj gjVar2 = this.E5;
                                org.telegram.messenger.bj bjVar = this.A5;
                                if (bjVar == null) {
                                    bjVar = U8(gjVar2.c1());
                                }
                                kjVar.f(gjVar2, bjVar, this.f45259k6, this.C5);
                            }
                            B8();
                            return;
                        }
                        return;
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k8(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.gj gjVar, CharacterStyle characterStyle, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        org.telegram.ui.Cells.q1 q1Var2;
        CharacterStyle characterStyle2;
        int i7;
        org.telegram.messenger.gj gjVar2;
        int i10;
        TLRPC.WebPage webPage;
        int i11;
        int i12;
        org.telegram.ui.Components.m60 I = org.telegram.ui.Components.m60.I(this, q1Var);
        org.telegram.ui.Components.ok0 ok0Var = new org.telegram.ui.Components.ok0(getParentActivity(), this.Aa);
        I.f37106p = new de(ok0Var, 0);
        if (!str.startsWith("video?") && !vf.c.g(Uri.parse(str), false, null)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean N2 = getMessagesController().N2(str);
        if (N2 && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!str.startsWith("#") && !str.startsWith("$")) {
            z12 = false;
        } else {
            z12 = true;
        }
        boolean startsWith = str.startsWith("mailto:");
        if (!startsWith) {
            if (z11 && !z12) {
                i11 = 2131231925;
            } else {
                i11 = 2131232266;
            }
            if (z11 && !z12) {
                i12 = 2131747791;
            } else {
                i12 = 2131747817;
            }
            String M0 = org.telegram.messenger.hd.M0(i12, null);
            z15 = z10;
            i7 = 2131232266;
            di.x1 x1Var = new di.x1(this, str, characterStyle, gjVar, q1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            q1Var2 = q1Var;
            I.c(i11, M0, x1Var, false);
        } else {
            z13 = z11;
            z14 = z12;
            z15 = z10;
            q1Var2 = q1Var;
            characterStyle2 = characterStyle;
            i7 = 2131232266;
        }
        if ((z13 && !z14) || startsWith) {
            I.c(i7, org.telegram.messenger.hd.M0(2131747793, null), new ee(this, str, 0), false);
        } else if (!startsWith && !z14 && !z13 && z15 && !N2) {
            I.c(2131231925, org.telegram.messenger.hd.M0(2131747791, null), new ee(this, str, 1), false);
        }
        TLRPC.MessageMedia m12 = org.telegram.messenger.gj.m1(gjVar);
        if ((m12 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = m12.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            gjVar2 = gjVar;
            I.c(2131231834, org.telegram.messenger.hd.M0(2131747790, null), new fe(this, gjVar2, 0), false);
        } else {
            gjVar2 = gjVar;
        }
        if (z14) {
            i10 = 2131751763;
        } else if (startsWith) {
            i10 = 2131751761;
        } else {
            i10 = 2131751762;
        }
        I.c(2131232104, org.telegram.messenger.hd.M0(i10, null), new aa.c0(this, str, gjVar2, startsWith, 26), false);
        if (N2 && !z14 && !startsWith && !str.startsWith("tg:")) {
            I.c(2131232505, org.telegram.messenger.hd.M0(2131742941, null), new ee(this, str, 2), false);
        }
        ok0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            ok0Var.f(q1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.h41) {
            String d = vf.c.d(((org.telegram.ui.Components.h41) characterStyle2).getURL(), true);
            if (d.length() > 204) {
                d = d.substring(0, 204) + "…";
            }
            SpannableString spannableString2 = new SpannableString(d);
            spannableString2.setSpan(characterStyle2, 0, spannableString2.length(), 33);
            ok0Var.f(q1Var2, characterStyle2, spannableString2, false);
        } else {
            ok0Var.f(q1Var2, characterStyle2, null, false);
        }
        showDialog(ok0Var);
    }

    public final int k9() {
        return this.f45278m1.getBackgroundSizeY();
    }

    public final void ka() {
        this.Q4 = true;
        if (this.D6) {
            org.telegram.messenger.vr messagesStorage = getMessagesStorage();
            messagesStorage.f27220a.c(new org.telegram.messenger.t8(messagesStorage, b(), this.f45259k6, new ag(this, 1), 5));
            return;
        }
        org.telegram.messenger.vr messagesStorage2 = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().j1(this.f45259k6);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f45408w4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f45358s4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.C6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new v7(5, this, messagesStorage2));
    }

    public final void kb(org.telegram.messenger.gj gjVar) {
        ArrayList arrayList = this.L6;
        int indexOf = arrayList.indexOf(gjVar);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            jl jlVar = this.D0;
            if (jlVar != null && !jlVar.O) {
                jlVar.P(jlVar.K + indexOf, true);
            }
        }
    }

    public final void kc(org.telegram.messenger.lj ljVar) {
        gc(true, null, null, null, null, true, 0, null, false, 0L, ljVar, true);
    }

    public final void kd(boolean z10) {
        String M0;
        if (this.f45204g4 != 3 && !org.telegram.messenger.q10.u(this.f45187f)) {
            ui uiVar = this.f45314p1;
            if (uiVar != null && this.f45358s4 != 0) {
                if (this.f45408w4) {
                    Bd();
                } else if (this.f45394v4) {
                    org.telegram.messenger.gj gjVar = this.f45281m4;
                    if (gjVar != null && gjVar.x2()) {
                        this.f45314p1.setTitle(org.telegram.messenger.hd.G(this.f45281m4.M1(), "Comments", new Object[0]));
                    } else {
                        this.f45314p1.setTitle(org.telegram.messenger.hd.M0(2131751996, null));
                    }
                } else {
                    org.telegram.messenger.gj gjVar2 = this.f45281m4;
                    if (gjVar2 != null) {
                        uiVar.setTitle(org.telegram.messenger.hd.G(gjVar2.M1(), "Replies", new Object[0]));
                    }
                }
            }
            if (this.f45330q4 != null) {
                if (this.f45281m4.M1() == 0) {
                    if (this.f45394v4) {
                        M0 = org.telegram.messenger.hd.M0(2131748226, null);
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131748168, null);
                    }
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131751375, null);
                }
                org.telegram.messenger.gj gjVar3 = this.f45330q4;
                gjVar3.f23817k.message = M0;
                gjVar3.v = M0;
                if (z10) {
                    this.D0.R(gjVar3, true, false);
                }
            }
        }
    }

    @Override
    public final void l(int i7, int i10, boolean z10, int i11, boolean z11, int i12) {
        Bb(i7, i10, z10, i11, z11, i12, null, null, null);
    }

    public final void l7() {
        uj ujVar;
        tj tjVar;
        tj tjVar2;
        qj qjVar = this.f45118a0;
        if (qjVar != null && qjVar.f32210h4) {
            MediaController.B().O = false;
            return;
        }
        TLRPC.Chat chat = this.f45173e;
        if (chat != null && !org.telegram.messenger.t3.v(chat)) {
            MediaController.B().O = false;
        } else if (!org.telegram.messenger.t0.f26608x && (((ujVar = this.f45162d1) == null || ujVar.getVisibility() != 0) && (((tjVar = this.T) == null || tjVar.getVisibility() != 0) && ((tjVar2 = this.f45203g3) == null || tjVar2.getVisibility() != 0)))) {
            MediaController.B().O = true;
        } else {
            MediaController.B().O = false;
        }
    }

    public final void l8(CharacterStyle characterStyle, boolean z10, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.q1 q1Var) {
        Object[] objArr;
        int i7;
        TLRPC.WebPage webPage;
        boolean z11;
        int i10;
        org.telegram.messenger.gj gjVar2;
        org.telegram.messenger.gj gjVar3;
        org.telegram.messenger.gj gjVar4;
        TLRPC.WebPage webPage2;
        org.telegram.messenger.gj gjVar5;
        org.telegram.ui.Cells.q1 q1Var2;
        org.telegram.messenger.gj messageObject;
        ArrayList arrayList;
        org.telegram.messenger.bj bjVar;
        TLRPC.Message message;
        if (characterStyle != null && getParentActivity() != null) {
            boolean z12 = true;
            boolean z13 = true;
            char c10 = 1;
            char c11 = 1;
            if (!W9() && (gjVar == null || (message = gjVar.f23817k) == null || !message.noforwards)) {
                objArr = null;
            } else {
                objArr = 1;
            }
            org.telegram.ui.Cells.q1 q1Var3 = null;
            if (characterStyle instanceof org.telegram.ui.Components.e41) {
                if (objArr == null || a() == 489000) {
                    org.telegram.ui.Components.e41 e41Var = (org.telegram.ui.Components.e41) characterStyle;
                    org.telegram.messenger.g0.g(e41Var.f34186a.subSequence(e41Var.f34187b, e41Var.f34188c).toString());
                    h8();
                    UndoView undoView = this.N3;
                    if (undoView != null) {
                        undoView.j(58, 0L, null);
                    }
                }
                if (z10 && q1Var != null) {
                    q1Var.g3(-1);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.i41) {
                TLRPC.User a22 = getMessagesController().a2(Utilities.A(((org.telegram.ui.Components.i41) characterStyle).getURL()));
                if (a22 != null) {
                    org.telegram.messenger.np.s1(this.currentAccount).z3(a22, null, this, 0);
                }
                if (z10 && q1Var != null) {
                    q1Var.g3(-1);
                }
                ma(gjVar, false, false);
            } else if (characterStyle instanceof org.telegram.ui.Components.d00) {
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = ((org.telegram.ui.Components.d00) characterStyle).f33774b;
                if (tL_messageEntityFormattedDate == null || (messageObject = q1Var.getMessageObject()) == null) {
                    q1Var2 = q1Var;
                } else {
                    if (messageObject.c1() != 0 && (bjVar = (org.telegram.messenger.bj) this.O6.f(messageObject.c1())) != null) {
                        arrayList = bjVar.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.k5.j(messageObject);
                    }
                    ArrayList arrayList2 = arrayList;
                    long e10 = getUserConfig().e();
                    String A = org.telegram.messenger.hd.A(tL_messageEntityFormattedDate, System.currentTimeMillis(), Locale.getDefault(), true);
                    org.telegram.ui.Components.m60 I = org.telegram.ui.Components.m60.I(this, q1Var);
                    org.telegram.ui.Components.ok0 ok0Var = new org.telegram.ui.Components.ok0(getParentActivity(), this.Aa);
                    I.f37106p = new de(ok0Var, 0);
                    I.c(2131232104, org.telegram.messenger.hd.M0(2131746332, null), new ie(this, ok0Var, A, 0), false);
                    q1Var2 = q1Var;
                    I.c(2131232078, org.telegram.messenger.hd.M0(2131746333, null), new di.j6((org.telegram.messenger.is) this, (Object) I, (Object) messageObject, (Object) q1Var, A, (Object) tL_messageEntityFormattedDate, (Object) ok0Var, 4), false);
                    I.c(2131232263, org.telegram.messenger.hd.M0(2131746331, null), new ai.e(this, I, e10, tL_messageEntityFormattedDate, arrayList2, ok0Var, 7), false);
                    SpannableString spannableString = new SpannableString(A);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    ok0Var.e(I);
                    ok0Var.f(q1Var2, characterStyle, spannableString, false);
                    showDialog(ok0Var);
                }
                if (q1Var2 != null) {
                    q1Var2.g3(-1);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.f41) {
                String url = ((org.telegram.ui.Components.f41) characterStyle).getURL();
                if (url != null && url.startsWith("tel:")) {
                    m8(q1Var, characterStyle, url.substring(4));
                    if (z10 && q1Var != null) {
                        q1Var.g3(-1);
                    }
                } else if (gjVar != null && url.startsWith("/")) {
                    if (org.telegram.ui.Components.c41.h) {
                        qj qjVar = this.f45118a0;
                        TLRPC.Chat chat = this.f45173e;
                        if (chat == null || !chat.megagroup) {
                            z13 = false;
                        }
                        qjVar.q1(gjVar, url, z10, z13);
                        if (!z10 && this.f45118a0.getFieldText() == null) {
                            D9(false);
                        }
                    }
                    if (z10 && q1Var != null) {
                        q1Var.g3(-1);
                    }
                } else {
                    SparseArray[] sparseArrayArr = this.F6;
                    if (gjVar != null && url.startsWith("video") && !z10) {
                        int intValue = Utilities.z(url).intValue();
                        if (gjVar.e5()) {
                            webPage2 = gjVar.f23817k.media.webpage;
                            gjVar4 = gjVar;
                        } else {
                            org.telegram.messenger.gj gjVar6 = gjVar.C;
                            if (gjVar6 != null && gjVar6.e5()) {
                                gjVar4 = gjVar.C;
                                webPage2 = gjVar4.f23817k.media.webpage;
                            } else {
                                gjVar4 = gjVar;
                                webPage2 = null;
                            }
                        }
                        if (webPage2 != null) {
                            org.telegram.ui.Components.bu.N0(this, gjVar4, this.f45158cb, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_url, webPage2.embed_width, webPage2.embed_height, intValue, V9());
                            return;
                        }
                        if (!org.telegram.messenger.gj.L4(gjVar4.f23817k) && (gjVar5 = gjVar4.C) != null) {
                            if (org.telegram.messenger.gj.B0(gjVar5.f23817k) == this.f45259k6) {
                                c10 = 0;
                            }
                            org.telegram.messenger.gj gjVar7 = (org.telegram.messenger.gj) sparseArrayArr[c10].get(gjVar4.C.e1());
                            if (gjVar7 == null) {
                                gjVar4 = gjVar4.C;
                            } else {
                                gjVar4 = gjVar7;
                            }
                        } else {
                            q1Var3 = q1Var;
                        }
                        gjVar4.f23782c0 = intValue / ((float) gjVar4.L0());
                        Ka(q1Var3, gjVar4);
                    } else if (gjVar != null && url.startsWith("audio")) {
                        int intValue2 = Utilities.z(url).intValue();
                        if (!gjVar.I3() && (gjVar3 = gjVar.C) != null) {
                            if (org.telegram.messenger.gj.B0(gjVar3.f23817k) == this.f45259k6) {
                                c11 = 0;
                            }
                            gjVar2 = (org.telegram.messenger.gj) sparseArrayArr[c11].get(gjVar.C.e1());
                        } else {
                            gjVar2 = gjVar;
                        }
                        if (gjVar2 != null) {
                            float f10 = intValue2;
                            float L0 = f10 / ((float) gjVar2.L0());
                            MediaController mediaController = getMediaController();
                            if (mediaController.I(gjVar2)) {
                                gjVar2.f23777b0 = L0;
                                mediaController.i0(gjVar2, L0);
                                if (mediaController.H()) {
                                    mediaController.S(gjVar2);
                                }
                            } else {
                                gjVar2.f23782c0 = f10 / ((float) gjVar2.L0());
                                mediaController.S(gjVar2);
                            }
                            if (z10 && q1Var != null) {
                                q1Var.g3(-1);
                            }
                            if (!org.telegram.messenger.gj.R4(gjVar2.f23817k)) {
                                showDialog(new org.telegram.ui.Components.y7(getParentActivity(), this.Aa));
                            }
                        }
                    } else if (url.startsWith("tonaddress:")) {
                        String substring = url.substring(11);
                        org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(this.currentAccount);
                        boolean isValidAddress = WalletEngine2.isValidAddress(substring);
                        TLRPC.User[] userArr = new TLRPC.User[1];
                        di.m3 m3Var = new di.m3(this, q1Var, isValidAddress, substring, userArr, characterStyle);
                        if (isValidAddress) {
                            gi na2 = na(q1Var, characterStyle);
                            boolean[] zArr = {false};
                            if (na2 != null) {
                                na2.f58805b = new fq0(zArr, 23);
                                na2.d();
                            }
                            x10.Z(new di.z2(this, zArr, na2, userArr, m3Var, 1), substring);
                        } else {
                            m3Var.run();
                        }
                        if (q1Var != null) {
                            q1Var.g3(-1);
                        }
                    } else if (url.startsWith("card:")) {
                        String substring2 = url.substring(5);
                        gi na3 = na(q1Var, characterStyle);
                        TLRPC.TL_payments_getBankCardData tL_payments_getBankCardData = new TLRPC.TL_payments_getBankCardData();
                        tL_payments_getBankCardData.number = substring2;
                        na3.f58805b = new oe(this, getConnectionsManager().sendRequest(tL_payments_getBankCardData, new di.k7(this, na3, q1Var, substring2, characterStyle, 3), null, null, 0, getMessagesController().O3, 1, true), 2);
                        na3.d();
                        q1Var.g3(-1);
                    } else {
                        Ca(characterStyle, url, z10, q1Var, gjVar);
                    }
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (url2 != null && url2.startsWith("tel:")) {
                    m8(q1Var, characterStyle, url2.substring(4));
                } else if (z10) {
                    k8(q1Var, gjVar, characterStyle, url2);
                    if (q1Var != null) {
                        q1Var.g3(-1);
                    }
                } else {
                    ma(gjVar, false, false);
                    if (url2 != null && url2.matches("(?i)^(https?://)?(t\\.me|telegram\\.me|telegram\\.dog)/getpremium([/?#].*)?$")) {
                        Activity parentActivity = getParentActivity();
                        if (!url2.contains("://")) {
                            url2 = "https://".concat(url2);
                        }
                        vf.c.t(parentActivity, url2);
                        return;
                    }
                    boolean z14 = characterStyle instanceof org.telegram.ui.Components.h41;
                    if ((z14 && (url2 == null || !url2.startsWith("mailto:"))) || org.telegram.messenger.g0.I3(url2)) {
                        if (gjVar != null) {
                            i10 = gjVar.e1();
                        } else {
                            i10 = 0;
                        }
                        if (Ha(url2, q1Var, characterStyle, i10, 1)) {
                            return;
                        }
                    } else {
                        if (gjVar != null) {
                            TLRPC.MessageMedia messageMedia = gjVar.f23817k.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                                String lowerCase = url2.toLowerCase();
                                String lowerCase2 = gjVar.f23817k.media.webpage.url.toLowerCase();
                                if ((lowerCase.contains("telegram.org/blog") || vf.c.i(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(gjVar) == null) {
                                        createArticleViewer(false).L(gjVar, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        if (gjVar != null) {
                            i7 = gjVar.e1();
                        } else {
                            i7 = 0;
                        }
                        if (!Ha(url2, q1Var, characterStyle, i7, 1)) {
                            z12 = z14;
                        } else {
                            return;
                        }
                    }
                    if (vf.c.z(url2)) {
                        z11 = false;
                    } else {
                        z11 = z12;
                    }
                    Za(2, url2, characterStyle, q1Var, z11);
                }
            }
        }
    }

    public final float l9(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.f45278m1.getBackgroundTranslationY()) - ((1.0f - this.T9) * this.O9);
    }

    public final void la(boolean z10) {
        TLRPC.Chat chat;
        if (this.Da == null && (chat = this.f45173e) != null && org.telegram.messenger.t3.k(chat) && this.f45118a0 != null && !org.telegram.messenger.t3.p0(this.f45173e)) {
            TLRPC.TL_channels_sendAsPeers M1 = getMessagesController().M1(this.f45259k6, false);
            this.Da = M1;
            if (M1 != null) {
                this.f45118a0.k2(false, z10);
            }
        }
    }

    public final void lb() {
        if (this.f45208g8 == null && this.f45221h8 == null && this.f45234i8 == null) {
            yd ydVar = this.f45273l8;
            if (ydVar != null) {
                org.telegram.messenger.g0.r(ydVar);
                this.f45273l8 = null;
            }
            this.f45155c8 = Integer.MAX_VALUE;
            this.f45182e8 = false;
            this.f45196f8 = 0L;
            this.f45208g8 = null;
            this.f45221h8 = null;
            this.f45234i8 = null;
        }
    }

    public final void lc(boolean z10, TLRPC.WebPage webPage, boolean z11) {
        fc(z10, null, null, webPage, true, 0, null, z11, 0L);
    }

    public final void ld(int i7, org.telegram.messenger.gj gjVar) {
        org.telegram.messenger.gj gjVar2;
        SparseArray sparseArray = this.H6;
        ArrayList arrayList = (ArrayList) sparseArray.get(i7);
        if (arrayList == null) {
            return;
        }
        if (gjVar == null) {
            gjVar2 = new org.telegram.messenger.gj(this.currentAccount, new TLRPC.TL_messageEmpty(), false, false);
        } else {
            gjVar2 = null;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) this.F6[0].get(((Integer) arrayList.get(i10)).intValue());
            if (gjVar3 != null) {
                if (gjVar == null) {
                    gjVar3.C = gjVar2;
                } else {
                    gjVar3.C = gjVar;
                }
                jl jlVar = this.D0;
                if (jlVar != null) {
                    jlVar.R(gjVar3, true, false);
                }
            }
        }
        if (gjVar == null) {
            sparseArray.remove(i7);
        }
    }

    public final boolean m7(boolean z10, boolean z11) {
        qj qjVar = this.f45118a0;
        if (qjVar == null || !qjVar.I0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.Aa);
            boolean z12 = this.f45118a0.f32178d1;
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            if (z12) {
                t1Var.S = org.telegram.messenger.hd.M0(2131751395, null);
                t1Var.U = org.telegram.messenger.hd.M0(2131751396, null);
            } else {
                t1Var.S = org.telegram.messenger.hd.M0(2131751392, null);
                t1Var.U = org.telegram.messenger.hd.M0(2131751393, null);
            }
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751394, null), new ab.z(5, this, z11));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751771, null), null);
            showDialog(t1Var);
            return true;
        }
        return true;
    }

    public final void m8(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, String str) {
        gi na2 = na(q1Var, characterStyle);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) getContactsController().f23685l0.get(pf.b.d(str, false));
        di.i2 i2Var = new di.i2(this, q1Var, str, tL_contact, characterStyle, 2);
        if (tL_contact != null) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(tL_contact.user_id));
            if (a22 != null) {
                i2Var.a(a22);
                return;
            } else {
                getMessagesStorage().f27220a.c(new o1(this, tL_contact, i2Var, 15));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = pf.b.d(str, false);
        na2.f58805b = new oe(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new z9(this, na2, i2Var, 3)), 0);
        na2.d();
    }

    public final float m9() {
        org.telegram.ui.Components.p11 p11Var = this.f45202g2;
        if (p11Var != null) {
            return p11Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void ma(org.telegram.messenger.gj gjVar, boolean z10, boolean z11) {
        if (gjVar != null && gjVar.r4()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = gjVar.R0;
            tL_messages_clickSponsoredMessage.media = z10;
            tL_messages_clickSponsoredMessage.fullscreen = z11;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void mb(boolean z10) {
        org.telegram.messenger.gj gjVar = this.f45126a8;
        if (gjVar != null) {
            if (z10) {
                boolean[] zArr = this.V6;
                zArr[1] = true;
                zArr[0] = true;
                this.Y7 = 0;
                this.f45140b7 = 0;
            }
            this.U7 = 0;
            this.V7 = false;
            jb(gjVar);
            this.f45126a8 = null;
        }
    }

    public final void mc(boolean z10) {
        if (this.f45280m3 != null && !X9()) {
            if (this.f45280m3.getTag() == null) {
                AnimatorSet animatorSet = this.f45393v3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.f45280m3.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f45393v3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f45393v3.playTogether(ObjectAnimator.ofFloat(this.f45280m3, View.ALPHA, 1.0f));
                this.f45393v3.addListener(new ei(this, 4));
                this.f45393v3.start();
            }
            if (!z10) {
                O9();
                this.f45316p3 = 1000;
            }
        }
    }

    public final void md(boolean z10) {
        qj qjVar = this.f45118a0;
        if (qjVar != null) {
            qjVar.i2(z10);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        boolean z12;
        String str2 = null;
        D8(str, null);
        if (u7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                org.telegram.messenger.cz b10 = org.telegram.messenger.cz.b(str, this.f45259k6, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                b10.K = Y8();
                z12 = z11;
                b10.L = z12;
                b10.Q = j10;
                b10.R = j9();
                b10.T = this.f45422x5;
                org.telegram.messenger.ez.C(this.currentAccount).r0(b10);
            } else {
                z12 = z11;
                str2 = str;
            }
            getSendMessagesHelper().q0(arrayList3, this.f45259k6, false, false, true, 0, 0, null, -1, j10, j9(), this.f45422x5);
            org.telegram.messenger.c accountInstance = getAccountInstance();
            long j11 = this.f45259k6;
            org.telegram.messenger.gj gjVar = this.E5;
            org.telegram.messenger.gj gjVar2 = this.f45281m4;
            qm qmVar = this.C5;
            String str3 = str2;
            org.telegram.messenger.ez.V(i7, j11, j3, j10, j9(), str3, null, arrayList, arrayList, null, arrayList2, null, null, accountInstance, gjVar, gjVar2, this.G5, this.f45422x5, Y8(), null, qmVar, null, null, z10, z12);
            L6();
        }
    }

    public final void n7() {
        if (!this.f45402vc) {
            this.f45402vc = true;
            if (!this.wc && this.f45204g4 == 0 && !getMessagesController().G1().f26734b && getMessagesController().G1().c() > 2) {
                if (this.K1 != null && org.telegram.messenger.np.e1().getInt("savedhint", 0) < 1) {
                    this.K1.w();
                    this.wc = true;
                    org.telegram.messenger.np.e1().edit().putInt("savedhint", org.telegram.messenger.np.e1().getInt("savedhint", 0) + 1).putInt("savedsearchhint", org.telegram.messenger.np.e1().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.L1 != null && org.telegram.messenger.np.e1().getInt("savedsearchhint", 0) < 1) {
                    this.L1.w();
                    this.wc = true;
                    org.telegram.messenger.np.e1().edit().putInt("savedsearchhint", org.telegram.messenger.np.e1().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    o7();
                }
            }
        }
    }

    public final void n8(org.telegram.ui.Cells.z r31, final org.telegram.tgnet.TLRPC.ReactionCount r32, boolean r33, float r34, float r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.n8(org.telegram.ui.Cells.z, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final int n9() {
        return (int) (m9() * org.telegram.messenger.g0.L(71.0f));
    }

    public final gi na(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle) {
        vf.b bVar = this.dc;
        if (bVar != null) {
            bVar.a(true);
            this.dc = null;
        }
        if (characterStyle != null && q1Var != null && q1Var.getMessageObject() != null) {
            gi giVar = new gi(this, q1Var.getMessageObject().e1(), characterStyle, q1Var, 0);
            this.dc = giVar;
            return giVar;
        }
        this.dc = null;
        return null;
    }

    public final void nb(int r25, java.util.ArrayList r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.nb(int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void nc(boolean z10) {
        if (this.f45291n3 != null && !X9()) {
            if (this.f45291n3.getTag() == null) {
                ValueAnimator valueAnimator = this.f45407w3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f45291n3.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f45420x3, 1.0f);
                this.f45407w3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f45407w3.addUpdateListener(new ae(this, 2));
                this.f45407w3.addListener(new ei(this, 6));
                this.f45407w3.start();
            }
            if (!z10) {
                O9();
                this.f45316p3 = 1000;
            }
        }
    }

    public final void nd(int i7, int i10, int i11) {
        float f10;
        int i12;
        boolean z10;
        boolean z11;
        lh.h hVar = this.f45431y1;
        boolean z12 = false;
        if (hVar != null) {
            int i13 = 2;
            if (this.mb) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            if ((i12 & i7) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.b(6).f3232c = z10;
            h6.m mVar = hVar.f19519e[6];
            if (mVar != null) {
                ((kh.b) mVar.f13624b).b(z10, true);
            }
            lh.h hVar2 = this.f45431y1;
            if (this.mb) {
                i13 = 1;
            }
            if ((i7 & i13) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar2.b(5).f3232c = z11;
            h6.m mVar2 = hVar2.f19519e[5];
            if (mVar2 != null) {
                ((kh.b) mVar2.f13624b).b(z11, true);
            }
        }
        this.L3 = i11;
        this.M3 = i10;
        od();
        org.telegram.ui.Components.h6 h6Var = this.f45256k3;
        if (h6Var != null) {
            if (i11 > 0) {
                z12 = true;
            }
            h6Var.setClickable(z12);
            ViewPropertyAnimator animate = this.f45256k3.animate();
            if (i11 > 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            animate.alpha(f10).start();
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.f45204g4 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((e2Var instanceof an) && ((an) e2Var).V9()) {
                return false;
            }
        }
        return this.Y6;
    }

    public final void o7() {
        org.telegram.ui.Cells.q1 q1Var;
        hi.l3 l3Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        hi.l3 l3Var2 = this.M1;
        if (l3Var2 != null && !l3Var2.W && !this.f45441yc && this.f45402vc && !this.f45199fd.f57082f && System.currentTimeMillis() - this.xc > 1800 && org.telegram.messenger.np.e1().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.A0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.A0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        q1Var = (org.telegram.ui.Cells.q1) childAt;
                        ch.q0 q0Var = q1Var.O;
                        org.telegram.messenger.gj primaryMessageObject = q1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.f23817k) == null || (tL_messageReactions = message.reactions) == null) {
                            z10 = false;
                        } else {
                            z10 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z10 && !q0Var.f5207s.isEmpty()) {
                            q1Var.getLocationInWindow(iArr);
                            float f10 = iArr[1] + q0Var.f5193c;
                            if (f10 >= org.telegram.messenger.g0.L(240.0f) && f10 <= (org.telegram.messenger.g0.f23609q.y - org.telegram.messenger.g0.L(25.0f)) - org.telegram.messenger.g0.f23604n) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    q1Var = null;
                    break;
                }
            }
            if (q1Var != null) {
                ch.q0 q0Var2 = q1Var.O;
                this.f45441yc = true;
                q1Var.getLocationInWindow(iArr);
                this.M1.setTranslationY(((iArr[1] - l3Var.getTop()) - org.telegram.messenger.g0.L(120.0f)) + q0Var2.f5193c);
                this.M1.p(0.0f, (((ch.n0) q0Var2.f5207s.get(0)).f5167z / 2.0f) + (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + q0Var2.f5192b);
                this.M1.w();
                org.telegram.messenger.np.e1().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            org.telegram.messenger.g0.r(new yd(this, 23));
            org.telegram.messenger.g0.i3(new yd(this, 23), 2000L);
        }
    }

    public final void o8(int r32, java.lang.Object... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.o8(int, java.lang.Object[]):void");
    }

    public final org.telegram.ui.ActionBar.q0 o9() {
        org.telegram.ui.ActionBar.q0 q0Var = this.m0;
        if (q0Var != null && q0Var.getVisibility() == 0 && this.m0.getWidth() != 0 && this.actionBar != null && (this.m0.getParent() instanceof View)) {
            return this.m0;
        }
        return null;
    }

    public final void oa(org.telegram.messenger.gj gjVar) {
        if (gjVar != null && gjVar.r4() && !gjVar.f23857u0) {
            gjVar.f23857u0 = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = gjVar.R0;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().getClass();
        }
    }

    public final void ob() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().k(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.L7 = 0;
        this.B7 = false;
        this.C7 = true;
        this.f45436y6.clear();
    }

    public final boolean oc() {
        qj qjVar = this.f45118a0;
        if (qjVar != null && qjVar.getVisibility() == 0) {
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            if (!e12.getBoolean("gifhint", false)) {
                e12.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f45367t2 == null) {
                    if (!this.s5) {
                        qj qjVar2 = this.f45118a0;
                        if (qjVar2 != null) {
                            qjVar2.X();
                            org.telegram.messenger.si.b0(qjVar2.R).V0(0, true, true, false);
                            org.telegram.ui.Components.sf sfVar = qjVar2.V0;
                            sfVar.M(false, false);
                            sfVar.R(false, false);
                            sfVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        ol olVar = this.f45278m1;
                        int indexOfChild = olVar.indexOfChild(this.U);
                        if (indexOfChild != -1) {
                            qj qjVar3 = this.f45118a0;
                            qjVar3.X();
                            org.telegram.messenger.si.b0(qjVar3.R).V0(0, true, true, false);
                            org.telegram.ui.Components.sf sfVar2 = qjVar3.V0;
                            sfVar2.M(false, false);
                            sfVar2.R(false, false);
                            sfVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.L2 = view;
                            view.setBackgroundResource(2131232675);
                            int i7 = indexOfChild + 1;
                            olVar.addView(this.L2, i7, c8.ja.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            hi.l3 E6 = E6(310.0f, 3, i7, false);
                            this.f45367t2 = E6;
                            E6.d = 2300L;
                            E6.u(org.telegram.messenger.hd.M0(2131744268, null));
                            this.L2.setAlpha(0.0f);
                            this.L2.animate().alpha(1.0f).setDuration(300L).start();
                            View emojiButton = this.f45118a0.getEmojiButton();
                            if (emojiButton != null) {
                                this.f45367t2.y(emojiButton, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void od() {
        org.telegram.ui.Components.h6 h6Var = this.j3;
        if (h6Var != null) {
            boolean z10 = !org.telegram.messenger.hd.f24101a0;
            int i7 = this.L3;
            if (i7 < 0) {
                h6Var.c("", z10, true);
            } else if (i7 == 0) {
                h6Var.c(org.telegram.messenger.hd.M0(2131748167, null), z10, true);
            } else if (this.G3) {
                h6Var.c(org.telegram.messenger.hd.G(i7, "TaggedMessages", new Object[0]), z10, true);
            } else if (this.f45204g4 != 7 && !this.f45199fd.f57082f) {
                h6Var.c(org.telegram.messenger.hd.a0(null, null, 2131747829, Integer.valueOf(this.M3 + 1), Integer.valueOf(this.L3)), z10, true);
            } else {
                h6Var.c(org.telegram.messenger.hd.G(i7, "SearchMessagesResultCount", org.telegram.messenger.hd.E(i7, ' ')), z10, true);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int r12, int r13, final android.content.Intent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.onActivityResultFragment(int, int, android.content.Intent):void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.w40 w40Var;
        org.telegram.ui.ActionBar.t1 t1Var;
        org.telegram.ui.Components.xe xeVar;
        org.telegram.ui.ActionBar.t1 t1Var2;
        org.telegram.ui.Components.ve veVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        pl plVar;
        ch.q qVar;
        org.telegram.ui.ActionBar.g5 g5Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getOpenMenuOverlay() != null) {
            if (z10 && (g5Var = this.actionBar.f29275a1) != null) {
                g5Var.a(true);
                return false;
            }
        } else {
            org.telegram.ui.Components.v01 v01Var = this.f45289n0;
            if (v01Var != null && v01Var.f40230y > 0.0f) {
                if (z10) {
                    v01Var.d();
                    return false;
                }
            } else {
                org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.f41635w;
                if (xbVar != null) {
                    org.telegram.ui.Components.cb cbVar = xbVar.f41639e;
                    if (cbVar instanceof org.telegram.ui.Components.ib) {
                        if (z10) {
                            ((org.telegram.ui.Components.ib) cbVar).f();
                            xbVar.b();
                            return false;
                        }
                    }
                }
                pz0 pz0Var = this.f45400va;
                if (pz0Var != null && !pz0Var.f50404c0) {
                    if (z10) {
                        pz0Var.dismiss();
                        return false;
                    }
                } else if (hasShownSheet()) {
                    if (z10) {
                        closeSheet();
                        return false;
                    }
                } else {
                    ch.r rVar = this.f45387ua;
                    if (rVar != null && (qVar = rVar.f5215b) != null && qVar.getReactionsWindow() != null) {
                        if (z10) {
                            rVar.f5215b.e();
                            return false;
                        }
                    } else if (ns.p().E) {
                        if (z10) {
                            ns.p().n();
                            return false;
                        }
                    } else {
                        lk lkVar = this.f45144bb;
                        if (lkVar != null && lkVar.f35955s) {
                            if (z10) {
                                lkVar.a(true);
                                return false;
                            }
                        } else if (this.f45199fd.f57082f) {
                            if (z10) {
                                sc(false);
                                return false;
                            }
                        } else if (this.f45197f9 != null) {
                            if (z10) {
                                P7(true);
                                return false;
                            }
                        } else if (!m7(z10, false)) {
                            if (A9()) {
                                if (z10 && (plVar = this.f45373t9) != null && plVar.x()) {
                                    this.f45373t9.f(false);
                                    return false;
                                }
                            } else {
                                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                if (kVar2 != null && kVar2.x()) {
                                    if (z10) {
                                        O7(false);
                                        return false;
                                    }
                                } else {
                                    qj qjVar = this.f45118a0;
                                    if (qjVar != null && qjVar.G0() && (qjVar.N2 != 1 || (tL_replyKeyboardMarkup = qjVar.V2) == null || !tL_replyKeyboardMarkup.is_persistent || qjVar.U2 == null)) {
                                        if (z10) {
                                            this.f45118a0.y0(true);
                                            return false;
                                        }
                                    } else {
                                        qj qjVar2 = this.f45118a0;
                                        if (qjVar2 != null && qjVar2.y()) {
                                            if (z10) {
                                                qj qjVar3 = this.f45118a0;
                                                ki.a0 a0Var = qjVar3.m0;
                                                if (a0Var != null) {
                                                    a0Var.setOpened(false);
                                                }
                                                if (!qjVar3.v0() && (veVar = qjVar3.f32246n0) != null) {
                                                    veVar.c();
                                                    return false;
                                                }
                                            }
                                        } else {
                                            qj qjVar4 = this.f45118a0;
                                            if (qjVar4 != null && (xeVar = qjVar4.F0) != null && (t1Var2 = xeVar.f34690b2) != null && t1Var2.isShowing()) {
                                                if (z10) {
                                                    xeVar.f34690b2.dismiss();
                                                    return false;
                                                }
                                            } else if (this.f45204g4 == 6 && (t1Var = kg.v.f18119e) != null && t1Var.isShowing()) {
                                                if (z10) {
                                                    kg.v.f18119e.dismiss();
                                                    return false;
                                                }
                                            } else if (org.telegram.messenger.t3.p0(this.f45173e) && !this.f45231i4 && this.f45202g2 != null && b() != 0) {
                                                if (z10) {
                                                    this.f45202g2.n(0L, this.G7);
                                                    return false;
                                                }
                                            } else if (this.f45204g4 == 5 && !"hello".equalsIgnoreCase(this.f45192f4) && !"away".equalsIgnoreCase(this.f45192f4) && (this.L6.isEmpty() || this.f45358s4 == 0)) {
                                                if (z10) {
                                                    xc();
                                                    return false;
                                                }
                                            } else if (this.f45204g4 == 6 && this.f45118a0.z()) {
                                                if (z10) {
                                                    dc(new uf(this, 13));
                                                    return false;
                                                }
                                            } else {
                                                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                                                if (kVar3 != null && kVar3.f29304o0) {
                                                    if (z10) {
                                                        kVar3.n(true);
                                                        return false;
                                                    }
                                                } else if (this.f45172dd.f57082f) {
                                                    if (z10) {
                                                        Va();
                                                    }
                                                } else {
                                                    if (z10 && (w40Var = this.f45329q3) != null) {
                                                        w40Var.a(false);
                                                    }
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ArrayList arrayList;
        J9();
        if (!getMessagesController().D3() && getMessagesController().f25398t4 <= 0 && getMessagesController().f25313j7 < 2 && !getUserConfig().q() && (arrayList = this.L6) != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
                if (gjVar != null && !gjVar.P3() && ((org.telegram.messenger.gj.R4(gjVar.f23817k) || gjVar.h4()) && !gjVar.F4() && (gjVar.f23817k.media_unread || org.telegram.messenger.t3.V(this.f45173e)))) {
                    org.telegram.ui.Components.x11.t(gjVar, false);
                }
            }
        }
        this.U3 = false;
        K9();
        ArrayList arrayList2 = org.telegram.ui.Components.x11.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        vf.b bVar = this.dc;
        if (bVar != null) {
            bVar.a(false);
            this.dc = null;
        }
        this.T3.e();
        super.onBecomeFullyHidden();
    }

    @Override
    public void onBecomeFullyVisible() {
        this.U3 = true;
        super.onBecomeFullyVisible();
        if (this.Q) {
            showDialog(this.P);
        }
        if (this.Db) {
            qj qjVar = this.f45118a0;
            if (qjVar != null) {
                qjVar.X0();
                qj qjVar2 = this.f45118a0;
                qjVar2.U0 = false;
                org.telegram.ui.Components.sf sfVar = qjVar2.V0;
                if (sfVar != null) {
                    sfVar.u(false);
                }
            }
            this.Db = false;
        }
        if (this.K1 != null) {
            org.telegram.messenger.g0.i3(new yd(this, 1), 600L);
        }
        if (this.G4 && !this.H4) {
            this.H4 = true;
            org.telegram.ui.Components.xb I = org.telegram.ui.Components.cc.a0(this).I(2131623993, org.telegram.messenger.hd.M0(2131743597, null), org.telegram.messenger.hd.M0(2131743599, null));
            I.f41643j = 5000;
            I.v = new yd(this, 3);
            I.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        ch.r rVar = this.f45387ua;
        if (rVar != null && rVar.d()) {
            this.f45387ua.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.gj gjVar;
        long j3;
        long j10;
        ui uiVar = this.f45314p1;
        if (uiVar != null) {
            ViewTreeObserver viewTreeObserver = uiVar.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new lh(this, viewTreeObserver));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        P7(true);
        if (!org.telegram.messenger.g0.Q1()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.A1() || !PhotoViewer.p1().P1()) && (gjVar = MediaController.B().f22377v0) != null && org.telegram.messenger.gj.L4(gjVar.f23817k)) {
                    PhotoViewer.p1().I2(null, this, this.Aa);
                    getFileLoader().c0(gjVar.F0(), false);
                    MediaController.B().q(true, true, false, true);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i7 = gjVar.D;
                    long j11 = 0;
                    if (i7 != 0) {
                        j3 = this.f45259k6;
                    } else {
                        j3 = 0;
                    }
                    if (i7 != 0) {
                        j10 = this.f45154c7;
                    } else {
                        j10 = 0;
                    }
                    if (i7 != 0) {
                        j11 = b();
                    }
                    if (p12.d2(gjVar, null, null, null, null, null, null, 0, this.f45158cb, null, j3, j10, j11, false, null, null)) {
                        PhotoViewer.p1().f42817l4 = this;
                    }
                    G9(false);
                    MediaController.B().f22380w0 = null;
                }
            } else if (PhotoViewer.A1() && PhotoViewer.p1().f42823m2) {
                PhotoViewer p13 = PhotoViewer.p1();
                if (p13.G2.d0()) {
                    if (p13.Z2) {
                        p13.G2.s0(false);
                    }
                    MediaController B = MediaController.B();
                    org.telegram.ui.Components.u51 u51Var = p13.G2;
                    org.telegram.messenger.gj gjVar2 = p13.T4;
                    if (u51Var != null && gjVar2 != null) {
                        int i10 = gjVar2.K1;
                        org.telegram.messenger.w7.G(i10).c0(gjVar2.F0(), true);
                        B.G0 = false;
                        B.r();
                        B.F0 = u51Var;
                        B.f22377v0 = gjVar2;
                        int i11 = B.f22360n0 + 1;
                        B.f22360n0 = i11;
                        u51Var.K = new org.telegram.messenger.ke(B, i11, gjVar2, 1);
                        B.Q0 = false;
                        TextureView textureView = B.H0;
                        if (textureView != null) {
                            u51Var.A0(textureView);
                        }
                        B.j(gjVar2);
                        B.n0();
                        B.f22349h0 = false;
                        org.telegram.messenger.gj gjVar3 = B.f22377v0;
                        B.f22377v0 = gjVar2;
                        if (!org.telegram.messenger.gz.k(true)) {
                            B.w0(B.f22370s);
                        }
                        B.v0(B.f22377v0);
                        org.telegram.messenger.ns.f(i10).k(org.telegram.messenger.ns.f25506h2, gjVar2, gjVar3);
                    }
                    p13.G2 = null;
                }
                PhotoViewer.p1().z0(false, true);
            }
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        ValueAnimator ofFloat;
        int measuredHeight;
        int measuredHeight2;
        int measuredHeight3;
        int measuredHeight4;
        xj xjVar = this.f45362sa;
        float f10 = 0.0f;
        if (z10 && this.f45298na && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (e2Var instanceof an) {
                this.Q4 = true;
                an anVar = (an) e2Var;
                anVar.f45323pa = this;
                this.fragmentView.setAlpha(0.0f);
                this.f45278m1.setSkipBackgroundDrawing(true);
                this.f45314p1.setTranslationY(org.telegram.messenger.g0.L(8.0f));
                this.f45314p1.getAvatarImageView().setAlpha(0.0f);
                this.f45314p1.getAvatarImageView().setTranslationY(-org.telegram.messenger.g0.L(8.0f));
                this.f45310oa = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                qj qjVar = this.f45118a0;
                if (qjVar != null) {
                    qjVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f23609q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                tj tjVar = this.T;
                if (tjVar != null) {
                    tjVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f23609q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                qj qjVar2 = this.f45118a0;
                if (qjVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = qjVar2.getMeasuredHeight();
                }
                tj tjVar2 = this.T;
                if (tjVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = tjVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                qj qjVar3 = anVar.f45118a0;
                if (qjVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = qjVar3.getMeasuredHeight();
                }
                tj tjVar3 = this.T;
                if (tjVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = tjVar3.getMeasuredHeight();
                }
                this.f45263ka = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new ch.v(9, this, anVar));
                Rc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.f45350ra = animatorSet;
                animatorSet.addListener(new hi.z4(this, anVar, runnable));
                this.f45350ra.setDuration(300L);
                this.f45350ra.setInterpolator(org.telegram.ui.Components.er.f34420f);
                this.f45350ra.playTogether(ofFloat2);
                org.telegram.messenger.g0.i3(xjVar, 200L);
                return this.f45350ra;
            }
        }
        if (this.Fa && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (e2Var2 instanceof u91) {
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                e2Var2.getFragmentView().getWidth();
                if (!z10) {
                    f10 = 1.0f;
                }
                this.Ha = f10;
                ofFloat.addUpdateListener(new ii(0, this));
                this.Ga = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                ol olVar = this.f45278m1;
                if (olVar != null) {
                    olVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f45350ra = animatorSet2;
                animatorSet2.addListener(new ji(this, z10, runnable));
                this.f45350ra.setDuration(150L);
                this.f45350ra.playTogether(ofFloat);
                if (z10) {
                    org.telegram.messenger.g0.i3(xjVar, 200L);
                } else {
                    this.f45350ra.start();
                }
                return this.f45350ra;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.t1 t1Var = this.P;
        if (t1Var != null && dialog == t1Var) {
            getMessagesController().X(0, this.f45259k6, false);
            org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
            if (o4Var != null && !o4Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.e2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z10;
        org.telegram.ui.Components.qs0 qs0Var;
        long j3 = this.f45259k6;
        int[] iArr = org.telegram.ui.Components.x11.N;
        ArrayList arrayList = new ArrayList(org.telegram.ui.Components.x11.S.values());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
            if (org.telegram.messenger.gj.B0(gjVar.f23817k) == j3) {
                org.telegram.ui.Components.x11.v(gjVar);
            }
        }
        super.onFragmentDestroy();
        jh.e eVar = this.f45151c4;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f17388x;
            int size2 = longSparseArray.size();
            for (int i10 = 0; i10 < size2; i10++) {
                jh.d dVar = (jh.d) longSparseArray.valueAt(i10);
                if (dVar.f17374i) {
                    eVar.f17387w.add(dVar.a());
                }
            }
            if (org.telegram.messenger.r2.f26198a) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            eVar.a();
        }
        qj qjVar = this.f45118a0;
        if (qjVar != null) {
            qjVar.Q0();
        }
        ui uiVar = this.f45314p1;
        if (uiVar != null && (qs0Var = uiVar.f39352d0) != null) {
            qs0Var.b(uiVar.H);
        }
        jj jjVar = this.X1;
        if (jjVar != null && jjVar.getAdapter() != null) {
            this.X1.getAdapter().P();
        }
        fi.p2 p2Var = this.Y1;
        if (p2Var != null) {
            p2Var.L();
        }
        org.telegram.ui.Components.w40 w40Var = this.f45329q3;
        if (w40Var != null) {
            w40Var.c(true);
        }
        ns p10 = ns.p();
        if (p10.f49666l == this.G9) {
            p10.W = null;
            p10.f49653a0 = null;
            p10.Y = null;
            p10.f49666l = null;
            p10.f49657c0 = null;
            p10.t();
        }
        getNotificationCenter().j(this.f45143ba);
        org.telegram.messenger.ns.e().j(this.f45157ca);
        getNotificationCenter().j(this.f45170da);
        getNotificationCenter().j(this.f45184ea);
        K9();
        yd ydVar = this.f45153c6;
        if (ydVar != null) {
            org.telegram.messenger.g0.r(ydVar);
            this.f45153c6 = null;
        }
        org.telegram.messenger.ns notificationCenter = getNotificationCenter();
        ek ekVar = this.Ja;
        notificationCenter.getClass();
        boolean z11 = org.telegram.messenger.r2.f26198a;
        if (Thread.currentThread() == org.telegram.messenger.t0.d.getLooper().getThread()) {
            if (notificationCenter.h.remove(ekVar)) {
                notificationCenter.o();
            }
            org.telegram.messenger.np messagesController = getMessagesController();
            long j10 = this.f45259k6;
            if (this.f45204g4 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            messagesController.L4(j10, z10, false);
            xi.e eVar2 = this.f45311ob;
            if (eVar2 != null) {
                eVar2.b();
                this.f45311ob = null;
            }
            getNotificationCenter().n(this, org.telegram.messenger.ns.f25572t);
            if (this.f45204g4 == 0 && org.telegram.messenger.g0.Q1()) {
                getNotificationCenter().k(org.telegram.messenger.ns.f25504h0, Long.valueOf(this.f45259k6), Long.valueOf(b()), Boolean.TRUE);
            }
            if (this.f45187f != null) {
                MediaController B = MediaController.B();
                if (B.T1 == null) {
                    B.T1 = new androidx.emoji2.text.j(B);
                }
                B.T1.f2254b = 0;
                org.telegram.messenger.t0.d.postDelayed(B.T1, 5000L);
            }
            org.telegram.messenger.n6 n6Var = this.T3;
            if (n6Var != null) {
                n6Var.e();
            }
            if (this.f45187f != null) {
                getMessagesController().f25377r1.remove(Long.valueOf(this.f45187f.f28200id));
            }
            org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
            fi.p2 p2Var2 = this.Y1;
            if (p2Var2 != null) {
                p2Var2.j1();
                this.Y1 = null;
            }
            org.telegram.messenger.g0.P3(getParentActivity());
            if (org.telegram.messenger.t3.T(this.f45173e)) {
                getMessagesController().W4(this.f45173e, this.classGuid, true, null);
                TLRPC.ChatFull chatFull = this.f45334q8;
                if (chatFull != null && chatFull.linked_chat_id != 0) {
                    getMessagesController().W4(getMessagesController().M0(Long.valueOf(this.f45334q8.linked_chat_id)), this.classGuid, true, null);
                }
            }
            pl plVar = this.f45373t9;
            if (plVar != null) {
                plVar.f(false);
            }
            cj cjVar = this.B0;
            if (cjVar != null) {
                cjVar.N();
            }
            yj yjVar = this.Sa;
            if (yjVar != null) {
                yjVar.b();
            }
            this.f45427xa = null;
            org.telegram.ui.ActionBar.o4 parentLayout = getParentLayout();
            if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!f45115sd ? 1 : 0);
                org.telegram.ui.ActionBar.o4 parentLayout2 = getParentLayout();
                if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                    int i11 = 0;
                    while (i11 < parentLayout2.getPulledDialogs().size()) {
                        if (((org.telegram.ui.Components.z8) parentLayout2.getPulledDialogs().get(i11)).f42299b > indexOf) {
                            parentLayout2.getPulledDialogs().remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                }
            }
            f45115sd = false;
            vf.b bVar = this.dc;
            if (bVar != null) {
                bVar.a(false);
                this.dc = null;
            }
            org.telegram.messenger.i3 i3Var = this.Ca;
            an anVar = i3Var.f24273a;
            ArrayList arrayList2 = i3Var.f24277f;
            ArrayList arrayList3 = i3Var.f24276e;
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                anVar.getConnectionsManager().cancelRequest(((Integer) arrayList3.get(i12)).intValue(), false);
            }
            arrayList3.clear();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                anVar.getConnectionsManager().cancelRequest(((Integer) arrayList2.get(i13)).intValue(), false);
            }
            arrayList2.clear();
            ww0 ww0Var = this.f45372t8;
            if (ww0Var != null) {
                ww0Var.b(true);
                this.f45372t8 = null;
            }
            di.h6 h6Var = this.Wc;
            if (h6Var != null) {
                h6Var.setMessageCell(null);
                org.telegram.messenger.g0.E2(this.Wc);
                this.Wc = null;
                return;
            }
            return;
        }
        throw new RuntimeException("removePostponeNotificationsCallback allowed only from MAIN thread");
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.Nb = true;
        org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
        if (gjVar != null && org.telegram.messenger.gj.L4(gjVar.f23817k)) {
            MediaController.B().q(true, true, false, false);
        } else {
            MediaController.B().p0(this.L8, null, null, false);
        }
        di.h6 h6Var = this.Wc;
        if (h6Var != null) {
            h6Var.setMessageCell(null);
            org.telegram.messenger.g0.E2(this.Wc);
            this.Wc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        fi.p2 p2Var;
        fi.p2 p2Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ki kiVar;
        qj qjVar = this.f45118a0;
        boolean z12 = false;
        if (qjVar != null && i7 == 2 && qjVar.R3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                org.telegram.messenger.ez.C(qjVar.R).o0(qjVar.Q3, qjVar.R3);
            }
            qjVar.R3 = null;
            qjVar.Q3 = null;
        }
        jj jjVar = this.X1;
        if (jjVar != null && jjVar.getAdapter() != null) {
            jg.h1 adapter = this.X1.getAdapter();
            if (i7 == 2) {
                TLRPC.User user = adapter.f17147x0;
                if (user != null && user.bot_inline_geo) {
                    if (iArr.length > 0 && iArr[0] == 0) {
                        adapter.J0.o();
                    } else {
                        adapter.Q();
                    }
                }
            } else {
                adapter.getClass();
            }
        }
        if (i7 == 4) {
            fi.p2 p2Var3 = this.Y1;
            if (p2Var3 != null) {
                p2Var3.f36447e2.b0();
            }
            org.telegram.ui.Components.ep epVar = this.f45427xa;
            if (epVar != null && (kiVar = epVar.S1) != null) {
                kiVar.f36447e2.b0();
            }
        } else if ((i7 == 5 || i7 == 30) && (p2Var = this.Y1) != null) {
            if (i7 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                p2Var.q1();
            }
        } else if ((i7 == 17 || i7 == 18) && (p2Var2 = this.Y1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = p2Var2.f36447e2;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.X(z12);
            this.Y1.f36447e2.b0();
        } else if (i7 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.Aa);
                String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131747312, null);
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747300, null), new dh(this));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                alertDialog$Builder.p();
            }
        } else if (i7 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            cb(0);
        } else if (i7 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            cb(2);
        } else if (((i7 != 101 && i7 != 102) || this.f45187f == null) && (i7 != 103 || this.f45173e == null)) {
        } else {
            int i10 = 0;
            while (true) {
                if (i10 < iArr.length) {
                    if (iArr[i10] != 0) {
                        z10 = false;
                        break;
                    }
                    i10++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (iArr.length > 0 && z10) {
                if (i7 == 103) {
                    org.telegram.ui.Components.voip.c2.l(this.f45173e, null, this.f45321p8, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f45187f;
                if (i7 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.f45348r8;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.c2.m(user2, z11, z12, getParentActivity(), getMessagesController().b2(this.f45187f.f28200id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.c2.h(getParentActivity(), null, i7);
        }
    }

    @Override
    public final void onResume() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.onResume():void");
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        int themedColor;
        int themedColor2;
        int themedColor3;
        int themedColor4;
        int i10;
        try {
            super.onThemeColorsChanged();
            ui.f fVar = this.J;
            if (fVar != null) {
                Iterator it = fVar.f58444w.iterator();
                while (it.hasNext()) {
                    fh.e eVar = ((fh.g) it.next()).f11350g0;
                    if (eVar != null) {
                        eVar.h = true;
                    }
                }
            }
            ui.f fVar2 = this.K;
            if (fVar2 != null) {
                Iterator it2 = fVar2.f58444w.iterator();
                while (it2.hasNext()) {
                    fh.e eVar2 = ((fh.g) it2.next()).f11350g0;
                    if (eVar2 != null) {
                        eVar2.h = true;
                    }
                }
            }
            Paint paint = this.V8;
            if (paint != null) {
                paint.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.f29129s8));
            }
            RadialProgressView radialProgressView = this.f45354s0;
            if (radialProgressView != null) {
                if (S9()) {
                    i10 = org.telegram.ui.ActionBar.j6.Ka;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.Zc;
                }
                radialProgressView.setProgressColor(getThemedColor(i10));
            }
            uj ujVar = this.f45162d1;
            if (ujVar != null) {
                ujVar.setAccentColor(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
            }
            org.telegram.ui.ActionBar.l2 l2Var = this.I0;
            if (l2Var != null && l2Var.getBackground() != null && ((themedColor4 = getThemedColor(org.telegram.ui.ActionBar.j6.Fi)) != this.L0 || this.Cb != org.telegram.ui.ActionBar.j6.I.q())) {
                this.L0 = themedColor4;
                this.Cb = org.telegram.ui.ActionBar.j6.I.q();
                Drawable background = this.I0.getBackground();
                org.telegram.ui.ActionBar.j6.H1(background, themedColor4, false);
                org.telegram.ui.ActionBar.j6.H1(background, org.telegram.ui.ActionBar.y5.b(themedColor4), true);
            }
            Fb();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Set<org.telegram.ui.ActionBar.o0> set = this.V0;
        Set<org.telegram.ui.ActionBar.o0> set2 = this.U0;
        try {
            RadialProgressView radialProgressView2 = this.J0;
            if (radialProgressView2 != null) {
                radialProgressView2.setProgressColor(getThemedColor(this.K0));
            }
            NumberTextView numberTextView = this.U2;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.We));
            }
            RadialProgressView radialProgressView3 = this.Z2;
            if (radialProgressView3 != null) {
                radialProgressView3.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ve));
            }
            org.telegram.ui.Components.z70 z70Var = this.f45229i2;
            if (z70Var != null && this.S0) {
                z70Var.setEmojiColor(getThemedColor(org.telegram.ui.ActionBar.j6.Xe));
            }
            if (this.P0 != null && (themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.f29241y6)) != this.M0) {
                this.M0 = themedColor3;
                this.P0.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
            }
            if (this.Q0 != null && (themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Fi)) != this.N0) {
                this.N0 = themedColor2;
                this.Q0.setTint(themedColor2);
            }
            if (this.R0 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.H6)) != this.O0) {
                this.O0 = themedColor;
                this.R0.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            sh.b bVar = this.f45252jd;
            if (bVar != null && (i7 = this.T0) >= 0) {
                bVar.setColor(getThemedColor(i7));
            }
            if (!set2.isEmpty()) {
                int themedColor5 = getThemedColor(org.telegram.ui.ActionBar.j6.f29070p7);
                for (org.telegram.ui.ActionBar.o0 o0Var : set2) {
                    if (o0Var != null) {
                        o0Var.a(themedColor5, themedColor5);
                    }
                }
            }
            if (!set.isEmpty()) {
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29070p7, false);
                for (org.telegram.ui.ActionBar.o0 o0Var2 : set) {
                    if (o0Var2 != null) {
                        o0Var2.a(x02, x02);
                    }
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.uc ucVar;
        super.onTransitionAnimationStart(z10, z11);
        System.currentTimeMillis();
        int i7 = org.telegram.messenger.ns.K2;
        int i10 = org.telegram.messenger.ns.G0;
        int i11 = org.telegram.messenger.ns.f25572t;
        int i12 = org.telegram.messenger.ns.f25566s;
        if (z10) {
            if (!this.f45194f6) {
                this.f45194f6 = true;
                cd();
            }
            iArr = this.f45143ba == 0 ? new int[]{i12, i11, i10, i7, org.telegram.messenger.ns.D} : new int[]{i12, i11, i10, i7};
            this.f45180e6 = false;
            if (!z11) {
                this.f45206g6 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = org.telegram.messenger.q10.B(this.f45187f) ? new int[]{i12, i11, i10, i7, org.telegram.messenger.ns.V} : null;
            qj qjVar = this.f45118a0;
            if (qjVar != null && (ucVar = qjVar.A2) != null) {
                org.telegram.messenger.g0.r(ucVar);
                qjVar.A2 = null;
            }
        }
        s7();
        this.f45143ba = getNotificationCenter().q(iArr, this.f45143ba, true);
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        D8(((org.telegram.messenger.dz) arrayList.get(0)).d, ((org.telegram.messenger.dz) arrayList.get(0)).f23193i);
        org.telegram.messenger.ez.X(getAccountInstance(), arrayList, this.f45259k6, this.E5, this.f45281m4, null, this.C5, true, false, this.G5, null, z10, i7, 0, ((org.telegram.messenger.dz) arrayList.get(0)).f23204t, null, Y8(), 0L, false, j3, j9(), this.f45422x5, null, false);
        L6();
        if (i7 != 0) {
            if (this.f45218h4 == -1) {
                this.f45218h4 = 0;
            }
            this.f45218h4 = arrayList.size() + this.f45218h4;
            md(true);
        }
    }

    public final void p7(boolean z10) {
        int i7;
        if (this.C0 != null && !this.H5 && !this.D0.M && !this.f45411w7) {
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < this.A0.getChildCount(); i13++) {
                int R = RecyclerView.R(this.A0.getChildAt(i13));
                if (R != -1) {
                    if (i12 == -1 || R < i12) {
                        i12 = R;
                    }
                    if (i11 == -1 || R > i11) {
                        i11 = R;
                    }
                    i10++;
                }
            }
            jl jlVar = this.D0;
            if (jlVar.O) {
                int i14 = jlVar.F;
                if (i14 >= 0 && i12 >= 0 && i14 >= i12 && i14 <= i11) {
                    getMediaDataController().O0();
                    return;
                }
                return;
            }
            int b10 = jlVar.b();
            if (z10) {
                i7 = 25;
            } else {
                i7 = 5;
            }
            int i15 = i7;
            if (this.f45204g4 == 7) {
                if ((b10 - i12) - i10 <= i15 && !this.X6 && !this.T6[0]) {
                    this.X6 = true;
                    this.f45436y6.add(Integer.valueOf(this.f45283m6));
                    org.telegram.messenger.na a10 = org.telegram.messenger.na.a(this.currentAccount);
                    String str = this.J3;
                    int i16 = this.classGuid;
                    int i17 = this.f45164d4;
                    int i18 = this.f45283m6;
                    this.f45283m6 = i18 + 1;
                    a10.e(i16, i17, i18, str);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.h3(new org.telegram.messenger.gr(this, b10, i12, i10, i15, 1));
        }
    }

    public final void p8(int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.p8(int, java.lang.Object[]):void");
    }

    public final int p9(int i7) {
        SparseIntArray sparseIntArray = this.f45232i5;
        int i10 = sparseIntArray.get(i7, -1);
        if (i10 == -1) {
            int i11 = f45110nd;
            f45110nd = i11 + 1;
            sparseIntArray.put(i7, i11);
            return i11;
        }
        return i10;
    }

    public final boolean pa() {
        org.telegram.messenger.gj gjVar;
        org.telegram.ui.Components.t5 t5Var;
        org.telegram.messenger.gj gjVar2;
        ImageReceiver photoImage;
        org.telegram.ui.Components.t5 m10;
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var;
        boolean z11;
        if (this.A0 != null && ((gjVar = MediaController.B().f22377v0) == null || org.telegram.messenger.gj.L4(gjVar.f23817k))) {
            hi.l3 l3Var = this.I2;
            ArrayList arrayList = null;
            if (l3Var != null && l3Var.W && (q1Var = this.Kb) != null) {
                ImageReceiver photoImage2 = q1Var.getPhotoImage();
                t5Var = photoImage2.m();
                if (t5Var != null) {
                    gjVar2 = q1Var.getMessageObject();
                    if (photoImage2.A() + q1Var.getTop() > this.A0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.M8 = z11;
                } else {
                    gjVar2 = null;
                }
            } else {
                t5Var = null;
                gjVar2 = null;
            }
            if (gjVar2 == null) {
                int childCount = this.A0.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = this.A0.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        org.telegram.messenger.gj messageObject = q1Var2.getMessageObject();
                        boolean h42 = messageObject.h4();
                        if (!messageObject.g4() && !messageObject.S4() && ((org.telegram.messenger.gj.L4(messageObject.f23817k) || h42) && messageObject.f23845r0 == null && (m10 = (photoImage = q1Var2.getPhotoImage()).m()) != null)) {
                            float top = childAt.getTop() + photoImage.M0;
                            float f10 = photoImage.O0 + top;
                            if (f10 >= 0.0f && top <= this.A0.getMeasuredHeight()) {
                                if (gjVar2 != null && top < 0.0f) {
                                    break;
                                }
                                if (top >= 0.0f && f10 <= this.A0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.M8 = z10;
                                if (top >= 0.0f && f10 <= this.A0.getMeasuredHeight()) {
                                    gjVar2 = messageObject;
                                    t5Var = m10;
                                    break;
                                }
                                gjVar2 = messageObject;
                                t5Var = m10;
                            }
                        }
                    }
                    i7++;
                }
            }
            if (gjVar2 != null && !MediaController.B().I(gjVar2)) {
                G9(true);
                if (gjVar2.h4()) {
                    boolean S = MediaController.B().S(gjVar2);
                    MediaController B = MediaController.B();
                    if (S) {
                        arrayList = i8(gjVar2, false);
                    }
                    B.r0(arrayList, false);
                    return S;
                }
                org.telegram.messenger.gz.D(true);
                gjVar2.f23777b0 = t5Var.n();
                gjVar2.f23786d0 = t5Var.o();
                t5Var.stop();
                if (PhotoViewer.J1(gjVar2)) {
                    PhotoViewer.f42713g9.J0();
                }
                return MediaController.B().S(gjVar2);
            }
        }
        return false;
    }

    public final void pb() {
        this.f45145bc = null;
        this.Zb = 0;
        this.f45130ac = -1;
        this.f45159cc = null;
        this.dc = null;
        this.f45431y1.d(false);
    }

    public final void pc() {
        TLRPC.ChatFull chatFull = this.f45334q8;
        if (chatFull != null && !this.H5) {
            TLRPC.Chat chat = this.f45173e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                org.telegram.messenger.g0.i3(new yd(this, 17), 1000L);
            }
        }
    }

    public final void pd() {
        d8();
        String str = this.J3;
        if (str != null) {
            this.f45356s2.f33707e.setText(org.telegram.messenger.hd.a0(null, null, 2131749354, str));
            this.f45122a4.setEmptyView(this.f45356s2);
            return;
        }
        this.f45122a4.setEmptyView(null);
        this.f45356s2.setVisibility(8);
    }

    @Override
    public final boolean q() {
        return this.N9;
    }

    public final void q7(org.telegram.messenger.gj gjVar) {
        if (gjVar.D == 4 && !this.G8) {
            int i7 = org.telegram.messenger.gz.f23929a;
            if (!org.telegram.messenger.np.e1().contains("mapPreviewType")) {
                this.G8 = true;
                org.telegram.ui.Components.t4.p0(getParentActivity(), this.currentAccount, new yd(this, 12), true, this.Aa);
            }
        }
    }

    public final void q8(int r34, final java.lang.Object... r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.q8(int, java.lang.Object[]):void");
    }

    public final int q9(int i7) {
        SparseIntArray sparseIntArray = this.f45219h5;
        int i10 = sparseIntArray.get(i7, -1);
        if (i10 == -1) {
            int i11 = f45110nd;
            f45110nd = i11 + 1;
            sparseIntArray.put(i7, i11);
            return i11;
        }
        return i10;
    }

    public final void qa(org.telegram.messenger.gj gjVar) {
        org.telegram.ui.ActionBar.e2 e2Var;
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var == null) {
            return;
        }
        long j3 = gjVar.f23817k.action.channel_id;
        if (o4Var.getFragmentStack().size() > 0) {
            e2Var = (org.telegram.ui.ActionBar.e2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            e2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.o4 o4Var2 = this.parentLayout;
        if (indexOf > 0 && !(e2Var instanceof an) && !(e2Var instanceof ProfileActivity) && this.f45173e.creator) {
            int size = o4Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) o4Var2.getFragmentStack().get(indexOf);
                if (e2Var2 instanceof an) {
                    ((ActionBarLayout) o4Var2).c(indexOf, new an(a8.p0.j(j3, "chat_id")));
                    e2Var2.removeSelfFromStack();
                } else if (e2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) o4Var2).c(indexOf, new ProfileActivity(a8.p0.j(j3, "chat_id"), null));
                    e2Var2.removeSelfFromStack();
                } else if (e2Var2 instanceof qn) {
                    ((ActionBarLayout) o4Var2).c(indexOf, new qn(a8.p0.j(j3, "chat_id")));
                    e2Var2.removeSelfFromStack();
                } else if (e2Var2 instanceof qq) {
                    if (((qq) e2Var2).f50722e1 == 0) {
                        Bundle arguments = e2Var2.getArguments();
                        arguments.putLong("chat_id", j3);
                        ((ActionBarLayout) o4Var2).c(indexOf, new qq(arguments));
                    }
                    e2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.m5(this, e2Var, gjVar, o4Var2, 5));
        }
        org.telegram.messenger.g0.i3(new bg.j0(this, j3, 2), 1000L);
    }

    public final void qb(org.telegram.ui.Cells.q1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.qb(org.telegram.ui.Cells.q1):void");
    }

    public final void qc(org.telegram.messenger.gj gjVar, CharSequence charSequence, int i7) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.xb G = org.telegram.ui.Components.cc.a0(this).G(2131623982, 9999, charSequence);
        G.f41643j = max;
        G.v = new oe(this, i7, 3);
        G.k(true);
        this.V3 = gjVar;
        this.W3 = i7;
    }

    public final void qd() {
        boolean z10;
        if (this.f45431y1 == null) {
            return;
        }
        if ((!getMediaDataController().Z0.isEmpty() && this.H3 && !this.G3) || (this.f45204g4 == 7 && this.f45164d4 == 2 && !this.L6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45431y1.e(6, z10, true);
        this.f45431y1.e(5, z10, true);
        if (z10) {
            this.f45431y1.e(1, false, true);
        }
        if (!z10) {
            this.S7 = 0;
        }
        this.f45278m1.invalidate();
    }

    @Override
    public final org.telegram.ui.Components.sn r() {
        return this.f45314p1;
    }

    public final void r7(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.r7(boolean):void");
    }

    public final void r8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.r8(int, java.lang.Object[]):void");
    }

    public final long r9() {
        return this.f45358s4;
    }

    public final void ra(boolean z10) {
        int i7;
        if (this.A0 != null) {
            ArrayList arrayList = this.L6;
            if (!arrayList.isEmpty() && !this.Sa.f46469n) {
                if (z10) {
                    i7 = 0;
                    while (i7 < arrayList.size() && ((org.telegram.messenger.gj) arrayList.get(i7)).r4()) {
                        i7++;
                    }
                } else {
                    i7 = 0;
                }
                this.C0.h1(i7, 0);
                this.A0.C0();
            }
        }
    }

    public final void rb() {
        org.telegram.ui.Components.ra0 j3;
        ym ymVar = this.Aa;
        if (ymVar != null) {
            Drawable m10 = ymVar.m();
            if (this.fragmentView != null) {
                m10 = this.f45278m1.getBackgroundImage();
            }
            if (m10 instanceof dn) {
                m10 = ((dn) m10).c(true);
            }
            if (m10 instanceof org.telegram.ui.Components.ra0) {
                ((org.telegram.ui.Components.ra0) m10).w(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.r4) && (j3 = ((org.telegram.ui.ActionBar.r4) themedDrawable).j()) != null) {
                j3.w(false);
            }
        }
    }

    public final void rc(boolean z10) {
        boolean z11;
        lh.h hVar = this.f45431y1;
        if (hVar != null) {
            if (z10 && !org.telegram.messenger.t3.p0(this.f45173e)) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar.e(2, z11, true);
            if (!z10) {
                this.S7 = 0;
            }
        }
    }

    public final void rd(String str) {
        if (this.f45204g4 == 7 && !TextUtils.equals(this.J3, str)) {
            d8();
            sc(true);
            this.J3 = str;
            this.I3 = str;
            g7(false);
            M7(true);
            this.f45181e7 = 0L;
            this.B7 = false;
            org.telegram.messenger.na.a(this.currentAccount).b(this.f45164d4).a();
            this.f45137b4.f();
            this.f45122a4.requestLayout();
            if (this.f45122a4.getLayoutManager() != null) {
                this.f45122a4.getLayoutManager().n0(0);
            }
            pd();
            this.f45356s2.e(true, true);
            L8();
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.f45285m8 = bundle.getString("path");
    }

    @Override
    public final void s() {
        if (!this.f45408w4) {
            if (this.f45187f != null) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f45187f.f28200id));
                if (a22 != null) {
                    this.f45187f = a22;
                } else {
                    return;
                }
            } else if (this.f45173e != null) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f45173e.f28051id));
                if (M0 != null) {
                    this.f45173e = M0;
                } else {
                    return;
                }
            }
            ui uiVar = this.f45314p1;
            if (uiVar != null) {
                uiVar.b();
            }
        }
    }

    public final void s7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.s7():void");
    }

    public final void s8(int r31, java.lang.Object... r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.s8(int, java.lang.Object[]):void");
    }

    public final float s9(float f10) {
        an anVar = this.f45452za;
        if (anVar == null) {
            anVar = this;
        }
        org.telegram.ui.Components.rg rgVar = anVar.f45134b1;
        if (rgVar == null) {
            return 0.0f;
        }
        return rgVar.c(f10);
    }

    public final boolean sa() {
        qj qjVar = this.f45118a0;
        boolean z10 = qjVar.f32209h3;
        if (z10) {
            qjVar.K1();
            this.S3 = true;
        }
        org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z10;
    }

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        ye yeVar = this.Ma;
        if (yeVar != null) {
            org.telegram.messenger.g0.r(yeVar);
        }
        qj qjVar = this.f45118a0;
        if (qjVar != null && this.f45278m1 != null && qjVar.getAdjustPanLayoutHelper() != null && !this.f45118a0.getAdjustPanLayoutHelper().f28649f) {
            this.La = this.f45278m1.getKeyboardHeight();
        } else {
            this.La = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.f45285m8;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void sb() {
        boolean z10;
        org.telegram.messenger.gj gjVar;
        CharSequence charSequence;
        boolean z11;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j3;
        uj ujVar;
        qj qjVar = this.f45118a0;
        if (qjVar != null && qjVar.f32234l2) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.f45270l5 && qjVar != null && (ujVar = this.f45162d1) != null && ujVar.getVisibility() != 0) {
            gjVar = this.E5;
            charSequence = org.telegram.messenger.g0.n1(this.f45118a0.getDraftMessage());
            z10 = this.f45118a0.G3;
        } else {
            z10 = true;
            gjVar = null;
            charSequence = null;
        }
        if (this.D5) {
            charSequence = null;
        }
        CharSequence[] charSequenceArr = {charSequence};
        org.telegram.messenger.si mediaDataController = getMediaDataController();
        TLRPC.EncryptedChat encryptedChat = this.h;
        if (encryptedChat != null && org.telegram.messenger.g0.X0(encryptedChat.layer) < 101) {
            z11 = false;
        } else {
            z11 = true;
        }
        ArrayList W = mediaDataController.W(charSequenceArr, z11, false);
        long Q7 = Q7(gjVar);
        TLRPC.DraftMessage R = getMediaDataController().R(this.f45259k6, Q7);
        if (R != null) {
            richMessage = R.rich_message;
        } else {
            richMessage = null;
        }
        org.telegram.messenger.si mediaDataController2 = getMediaDataController();
        long j10 = this.f45259k6;
        CharSequence charSequence2 = charSequenceArr[0];
        if (gjVar != null && !gjVar.f23836p && gjVar.f23815j1 == null && !this.D5) {
            message = gjVar.f23817k;
        } else {
            message = null;
        }
        qm qmVar = this.C5;
        org.telegram.messenger.lj ljVar = this.f45422x5;
        if (ljVar != null) {
            suggestedPost = ljVar.c();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        qj qjVar2 = this.f45118a0;
        if (qjVar2 != null) {
            j3 = qjVar2.getEffectId();
        } else {
            j3 = 0;
        }
        mediaDataController2.Q1(j10, Q7, charSequence2, W, message, qmVar, suggestedPost2, j3, !z10, false, richMessage);
    }

    public final void sc(boolean z10) {
        int i7;
        if (this.Z3 != null) {
            te.a aVar = this.f45199fd;
            if (aVar.f57082f != z10) {
                aVar.a(z10, true);
                if (!z10 && this.f45204g4 == 7) {
                    v4.b0 b0Var = (v4.b0) this.f45122a4.getLayoutManager();
                    Object E = this.f45137b4.E((b0Var.N0() + b0Var.L0()) / 2);
                    Object E2 = this.f45137b4.E(b0Var.L0());
                    Object E3 = this.f45137b4.E(b0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.D0.L();
                        int L0 = this.C0.L0();
                        int N0 = this.C0.N0();
                        int i10 = ((org.telegram.messenger.gj) E).f23817k.f28072id;
                        int i11 = ((org.telegram.messenger.gj) E2).f23817k.f28072id;
                        int i12 = ((org.telegram.messenger.gj) E3).f23817k.f28072id;
                        int i13 = -1;
                        boolean z11 = false;
                        boolean z12 = false;
                        for (int i14 = 0; i14 < L.size(); i14++) {
                            if (((org.telegram.messenger.gj) L.get(i14)).f23817k.f28072id == i11) {
                                int i15 = this.D0.K + i14;
                                if (L0 <= i15 && N0 >= i15) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    break;
                                }
                            }
                            if (((org.telegram.messenger.gj) L.get(i14)).f23817k.f28072id == i12) {
                                int i16 = this.D0.K + i14;
                                if (L0 <= i16 && N0 >= i16) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    break;
                                }
                            }
                            if (((org.telegram.messenger.gj) L.get(i14)).f23817k.f28072id == i10) {
                                i13 = i14;
                            }
                        }
                        if (!z11 && !z12 && i13 != -1) {
                            this.C0.h1(this.D0.K + i13, (this.A0.getHeight() - W8((org.telegram.messenger.gj) L.get(i13), true)) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.h6 h6Var = this.f45256k3;
                if (h6Var != null) {
                    if (aVar.f57082f) {
                        i7 = 2131745818;
                    } else {
                        i7 = 2131745817;
                    }
                    h6Var.c(org.telegram.messenger.hd.M0(i7, null), !org.telegram.messenger.hd.f24101a0, true);
                }
                hi.l3 l3Var = this.M1;
                if (l3Var != null && l3Var.W) {
                    l3Var.f(true);
                }
                zk zkVar = this.Q1;
                if (zkVar != null && zkVar.W) {
                    zkVar.f(true);
                }
                qj qjVar = this.f45118a0;
                if (qjVar != null) {
                    qjVar.x0();
                }
                od();
            }
        }
    }

    public final void sd() {
        qj qjVar;
        if (this.T != null) {
            this.H0.setBackground(null);
            this.H0.setOnClickListener(null);
            boolean z10 = true;
            if (this.f45204g4 == 3 && e9() == 2666000) {
                this.H0.setText(org.telegram.messenger.hd.M0(2131753882, null));
                this.T.setVisibility(0);
                this.X1.setVisibility(8);
                this.X1.setTag(null);
                ad();
                org.telegram.ui.Components.rw0 rw0Var = this.f45355s1;
                if (rw0Var != null) {
                    rw0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.f45173e;
                if (chat != null && !org.telegram.messenger.t3.n(chat)) {
                    TLRPC.Chat chat2 = this.f45173e;
                    if (!org.telegram.messenger.t3.p(chat2) && !org.telegram.messenger.t3.u(chat2) && !org.telegram.messenger.t3.s(chat2) && !org.telegram.messenger.t3.v(chat2) && !org.telegram.messenger.t3.l(chat2) && !org.telegram.messenger.t3.o(chat2) && !org.telegram.messenger.t3.t(chat2)) {
                        TLRPC.Chat chat3 = this.f45173e;
                        if (!chat3.gigagroup && (!org.telegram.messenger.t3.T(chat3) || this.f45173e.megagroup)) {
                            TLRPC.Chat chat4 = this.f45173e;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat4.default_banned_rights;
                            if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                                if (org.telegram.messenger.t3.s0(chat4)) {
                                    Drawable mutate = getParentActivity().getDrawable(2131231127).mutate();
                                    int i7 = org.telegram.ui.ActionBar.j6.Fi;
                                    mutate.setTint(getThemedColor(i7));
                                    this.Q0 = mutate;
                                    this.N0 = getThemedColor(i7);
                                    mutate.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
                                    org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(null, mutate, org.telegram.messenger.g0.L(-6.0f), org.telegram.messenger.g0.L(-6.0f));
                                    int L = org.telegram.messenger.g0.L(14.0f);
                                    int L2 = org.telegram.messenger.g0.L(14.0f);
                                    fqVar.f34672e = L;
                                    fqVar.f34673f = L2;
                                    int L3 = org.telegram.messenger.g0.L(14.0f);
                                    int L4 = org.telegram.messenger.g0.L(14.0f);
                                    fqVar.h = L3;
                                    fqVar.f34674n = L4;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131753581, null, new StringBuilder("d ")));
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.b00(i7, getResourceProvider()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.y31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new ImageSpan(fqVar, 1), 0, 1, 33);
                                    TextView textView = this.H0;
                                    int i10 = org.telegram.ui.ActionBar.j6.f28941i6;
                                    org.telegram.ui.ActionBar.q6.Q(textView, org.telegram.ui.ActionBar.j6.i0(0, org.telegram.ui.ActionBar.j6.x0(null, i10, false)), null, org.telegram.ui.ActionBar.q6.M(i10), null);
                                    this.H0.setText(spannableStringBuilder);
                                    this.H0.setOnClickListener(new le(this, 0));
                                } else {
                                    this.H0.setText(org.telegram.messenger.hd.M0(2131749534, null));
                                }
                            } else if (org.telegram.messenger.g0.D1(chat4.banned_rights)) {
                                this.H0.setText(org.telegram.messenger.hd.M0(2131745597, null));
                            } else {
                                this.H0.setText(org.telegram.messenger.hd.a0("SendMessageRestricted", null, 2131745598, org.telegram.messenger.hd.v(this.f45173e.banned_rights.until_date)));
                            }
                            this.T.setVisibility(0);
                            this.X1.setVisibility(8);
                            this.X1.setTag(null);
                            ad();
                            org.telegram.ui.Components.rw0 rw0Var2 = this.f45355s1;
                            if (rw0Var2 != null) {
                                rw0Var2.f();
                            }
                        }
                    }
                }
                W7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.n1 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.H0.setText(org.telegram.messenger.hd.M0(2131751129, null));
                        this.T.setVisibility(0);
                        this.f45118a0.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        org.telegram.messenger.k5.q("AwaitingEncryption", null, 2131753757, new Object[]{a8.p0.s(new StringBuilder("<b>"), this.f45187f.first_name, "</b>")}, this.H0);
                        this.T.setVisibility(0);
                        this.f45118a0.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.H0.setText(org.telegram.messenger.hd.M0(2131751128, null));
                        this.T.setVisibility(0);
                        this.f45118a0.setVisibility(4);
                        this.f45118a0.setFieldText("");
                        getMediaDataController().D(this.f45259k6, this.f45358s4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.T.setVisibility(4);
                            if (!this.inPreviewMode && !this.f45276lb && this.f45204g4 != 3) {
                                this.f45118a0.setVisibility(0);
                            }
                        }
                        z10 = false;
                    }
                    l7();
                    V6(false);
                } else {
                    this.T.setVisibility(4);
                    if (this.f45355s1 != null && (qjVar = this.f45118a0) != null && qjVar.w0()) {
                        this.f45355s1.e();
                        return;
                    }
                    return;
                }
            }
            if (this.inPreviewMode) {
                this.T.setVisibility(4);
            }
            if (z10) {
                this.f45118a0.y0(false);
                if (getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
                }
            }
        }
    }

    @Override
    public final void setInMenuMode(boolean z10) {
        int i7;
        super.setInMenuMode(z10);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            org.telegram.ui.ActionBar.y s5 = kVar.s();
            if (this.inMenuMode) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            s5.setVisibility(i7);
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        boolean z11;
        boolean z12;
        org.telegram.messenger.gj gjVar;
        TLRPC.Message message;
        long j3;
        org.telegram.ui.ActionBar.x1 x1Var;
        float f10;
        float f11;
        qj qjVar;
        int i7;
        float f12;
        super.setInPreviewMode(z10);
        int i10 = 8;
        boolean z13 = true;
        if (this.f45187f != null && this.f45326q0 != null) {
            TLRPC.UserFull b22 = getMessagesController().b2(this.f45187f.f28200id);
            if (b22 != null && b22.phone_calls_available) {
                this.f45223ha = !this.inPreviewMode;
                this.f45326q0.e(0);
            } else {
                this.f45223ha = false;
                this.f45326q0.e(8);
            }
        }
        ui uiVar = this.f45314p1;
        float f13 = 0.0f;
        if (uiVar != null) {
            uiVar.setOccupyStatusBar(!z10);
            ui uiVar2 = this.f45314p1;
            if (!this.inPreviewMode) {
                f12 = 52.0f;
            } else {
                f12 = 0.0f;
            }
            uiVar2.setLayoutParams(c8.ja.d(-2, -1.0f, 51, f12, 0.0f, 52.0f, 0.0f));
        }
        qj qjVar2 = this.f45118a0;
        if (qjVar2 != null) {
            if (!z10) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            qjVar2.setVisibility(i7);
        }
        org.telegram.ui.Components.rw0 rw0Var = this.f45355s1;
        if (rw0Var != null) {
            if (this.f45331q5 && !z10 && ((qjVar = this.f45118a0) == null || !qjVar.f32210h4)) {
                i10 = 0;
            }
            rw0Var.setVisibility(i10);
        }
        jj jjVar = this.X1;
        if (jjVar != null) {
            ViewPropertyAnimator animate = jjVar.animate();
            if (!this.f45118a0.f32210h4 && !isInPreviewMode()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate.alpha(f11).setInterpolator(org.telegram.ui.Components.er.f34420f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z10) {
                x1Var = new org.telegram.ui.ActionBar.x1(false);
            } else {
                x1Var = null;
            }
            kVar.setBackButtonDrawable(x1Var);
            org.telegram.ui.ActionBar.q0 q0Var = this.f45240j0;
            if (q0Var != null) {
                if (!z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                q0Var.setAlpha(f10);
            }
            org.telegram.ui.ActionBar.x xVar = this.f45200g0;
            if (xVar != null) {
                if (!z10) {
                    f13 = 1.0f;
                }
                xVar.f29847i = f13;
                org.telegram.ui.ActionBar.q0 q0Var2 = xVar.f29851m;
                if (q0Var2 != null) {
                    q0Var2.setAlpha(f13);
                }
            }
        }
        aj ajVar = this.A0;
        if (ajVar != null) {
            int childCount = ajVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.A0.getChildAt(i11);
                boolean z14 = childAt instanceof org.telegram.ui.Cells.q1;
                if (z14) {
                    gjVar = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    gjVar = ((org.telegram.ui.Cells.t0) childAt).getMessageObject();
                } else {
                    gjVar = null;
                }
                if (gjVar != null && (message = gjVar.f23817k) != null && message.media_unread && message.mentioned) {
                    if (!org.telegram.messenger.gj.R4(message) && !gjVar.h4()) {
                        int i12 = this.C6 - 1;
                        this.C6 = i12;
                        if (i12 <= 0) {
                            this.C6 = 0;
                            this.D6 = true;
                            rc(false);
                        } else {
                            this.f45431y1.c(2, i12, true);
                        }
                        org.telegram.messenger.np messagesController = getMessagesController();
                        int e12 = gjVar.e1();
                        if (org.telegram.messenger.t3.T(this.f45173e)) {
                            j3 = this.f45173e.f28051id;
                        } else {
                            j3 = 0;
                        }
                        messagesController.n3(j3, e12, this.f45259k6);
                        gjVar.f23817k.media_unread = false;
                    }
                    if (z14) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        q1Var.setHighlighted(false);
                        q1Var.p3();
                    }
                }
            }
            this.A0.setItemAnimator(null);
        }
        Pc(false);
        sd();
        lj ljVar = this.f45279m2;
        if (ljVar != null) {
            if (!z10 && !this.f45276lb) {
                z12 = true;
            } else {
                z12 = false;
            }
            ljVar.setEnabled(z12);
        }
        lj ljVar2 = this.f45303o2;
        if (ljVar2 != null) {
            if (!z10 && !this.f45276lb) {
                z11 = true;
            } else {
                z11 = false;
            }
            ljVar2.setEnabled(z11);
        }
        nk nkVar = this.M2;
        if (nkVar != null) {
            nkVar.setEnabled(!isInPreviewMode());
        }
        ol olVar = this.f45278m1;
        if (olVar != null) {
            olVar.setOccupyStatusBar((this.inBubbleMode || this.f45276lb || this.inPreviewMode) ? false : false);
        }
    }

    public final boolean t7(View view) {
        CharSequence slowModeTimer = this.f45118a0.getSlowModeTimer();
        if (slowModeTimer != null) {
            zc(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void t8(java.lang.Object... r82) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.t8(java.lang.Object[]):void");
    }

    public final float t9(org.telegram.ui.Components.l11 l11Var) {
        float f10;
        org.telegram.ui.Components.p11 p11Var = this.f45202g2;
        if (p11Var != null) {
            float L = org.telegram.messenger.g0.L(7.0f);
            float k10 = p11Var.k(l11Var);
            if (l11Var == org.telegram.ui.Components.l11.f36701b) {
                f10 = 64.0f;
            } else {
                f10 = 36.0f;
            }
            return (org.telegram.messenger.g0.L(f10) + L) * k10;
        }
        return 0.0f;
    }

    public final void tb() {
        org.telegram.ui.Cells.q1 q1Var = null;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i7 >= this.A0.getChildCount()) {
                break;
            }
            View childAt = this.A0.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.z1) && childAt.getBottom() > 0 && childAt.getTop() < this.A0.getHeight()) {
                q1Var = childAt;
                break;
            }
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                int min = Math.min(q1Var2.getBottom(), this.A0.getHeight()) - Math.max(0, q1Var2.getTop());
                if (min > i10) {
                    q1Var = q1Var2;
                    i10 = min;
                }
            }
            i7++;
        }
        if (q1Var != null) {
            dj djVar = this.C0;
            this.A0.getClass();
            djVar.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) this.O9), false);
        }
    }

    public final void tc(TLRPC.TL_game tL_game, org.telegram.messenger.gj gjVar, String str, boolean z10, long j3) {
        String str2;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.Aa);
            String M0 = org.telegram.messenger.hd.M0(2131689472, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            if (a22 != null) {
                str3 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
            }
            t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131753015, str3);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), new di.o3(this, tL_game, gjVar, str, j3));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            showDialog(t1Var);
            return;
        }
        String n10 = org.telegram.messenger.q10.n(a22);
        if (!org.telegram.messenger.g0.Q1()) {
            String str4 = Build.MANUFACTURER;
            String str5 = Build.MODEL;
            if (!"samsung".equals(str4) || !"GT-I9500".equals(str5)) {
                if (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) == this) {
                    if (a22 == null || TextUtils.isEmpty(n10)) {
                        str2 = "";
                    } else {
                        str2 = n10;
                    }
                    presentFragment(new zc1(str, str2, tL_game.title, tL_game.short_name, gjVar));
                    return;
                }
                return;
            }
        }
        Activity parentActivity = getParentActivity();
        String str6 = tL_game.short_name;
        if (a22 != null && n10 != null) {
            str3 = n10;
        }
        zc1.a0(str, gjVar, parentActivity, str6, str3);
    }

    public final void td() {
        boolean z10;
        int i7;
        int i10;
        org.telegram.messenger.yi yiVar;
        int i11 = (a() > getUserConfig().e() ? 1 : (a() == getUserConfig().e() ? 0 : -1));
        SparseArray[] sparseArrayArr = this.f45294n6;
        if (i11 == 0) {
            ArrayList<org.telegram.messenger.gj> arrayList = new ArrayList<>();
            for (int i12 = 0; i12 < sparseArrayArr.length; i12++) {
                for (int i13 = 0; i13 < sparseArrayArr[i12].size(); i13++) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sparseArrayArr[i12].valueAt(i13);
                    if (gjVar.z2()) {
                        org.telegram.messenger.bj u92 = u9(gjVar);
                        if (u92 != null) {
                            yiVar = u92.d(gjVar);
                        } else {
                            yiVar = null;
                        }
                        if (yiVar != null) {
                            if (!yiVar.h) {
                            }
                        }
                    }
                    arrayList.add(gjVar);
                }
            }
            hk hkVar = this.Ab;
            if (hkVar != null) {
                hkVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.Ab.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                hk hkVar2 = this.Ab;
                if (isEmpty) {
                    i10 = 2131745872;
                } else {
                    i10 = 2131745871;
                }
                hkVar2.setHint(org.telegram.messenger.hd.M0(i10, null));
                org.telegram.messenger.g0.i3(new yd(this, 14), 120L);
            } else {
                z10 = !org.telegram.ui.Components.mi0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.q0 j3 = this.actionBar.p(null).j(28);
            if (j3 != null) {
                if (z10) {
                    i7 = 2131231898;
                } else {
                    i7 = 2131231900;
                }
                org.telegram.ui.Components.fh0 fh0Var = j3.f29528y;
                if (fh0Var != null && j3.E != i7) {
                    j3.E = i7;
                    org.telegram.messenger.g0.Q3(fh0Var, i7);
                }
            }
        }
        if (this.f45387ua != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                arrayList2.add((org.telegram.messenger.gj) sparseArray.valueAt(i14));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                arrayList2.add((org.telegram.messenger.gj) sparseArray2.valueAt(i15));
            }
            this.f45387ua.setSelectedMessages(arrayList2);
        }
    }

    @Override
    public final void u(final org.telegram.messenger.ff ffVar, final org.telegram.messenger.g20 g20Var, final boolean z10, final int i7, final int i10, final boolean z11, long j3) {
        if (ffVar == null) {
            return;
        }
        this.f45160cd.a(false, true);
        org.telegram.messenger.gj gjVar = this.G5;
        if (gjVar != null && gjVar.p5() && !org.telegram.messenger.t3.z(this.currentAccount, 24, org.telegram.messenger.gj.B0(this.G5.f23817k))) {
            org.telegram.messenger.lj ljVar = this.f45422x5;
            if (ljVar == null) {
                ljVar = org.telegram.messenger.lj.b(this.G5.f23817k.suggested_post);
            }
            if (!di.v8.T(this.currentAccount, ljVar.f24838a)) {
                Ac(ljVar);
                return;
            }
        }
        if (g20Var != null && g20Var.f23650s) {
            ye yeVar = new ye(this, 24);
            this.H7 = yeVar;
            org.telegram.messenger.g0.i3(yeVar, 3000L);
        }
        D8(ffVar.f27707a, ffVar.f27718n);
        org.telegram.ui.Components.t4.Y(this.currentAccount, a(), 1, new org.telegram.messenger.z10() {
            @Override
            public final void a(Object obj) {
                Long l10 = (Long) obj;
                an anVar = an.this;
                org.telegram.messenger.gj gjVar2 = anVar.G5;
                org.telegram.messenger.ff ffVar2 = ffVar;
                org.telegram.messenger.g20 g20Var2 = g20Var;
                boolean z12 = z10;
                int i11 = i7;
                int i12 = i10;
                boolean z13 = z11;
                if (gjVar2 != null && gjVar2.p5()) {
                    org.telegram.messenger.lj ljVar2 = anVar.f45422x5;
                    if (ljVar2 == null) {
                        ljVar2 = org.telegram.messenger.lj.b(anVar.G5.f23817k.suggested_post);
                    }
                    org.telegram.messenger.lj ljVar3 = ljVar2;
                    if (ffVar2.f27708b) {
                        org.telegram.messenger.c accountInstance = anVar.getAccountInstance();
                        String str = ffVar2.I;
                        String str2 = ffVar2.f27712g;
                        TLRPC.Photo photo = ffVar2.f27710e;
                        long j10 = anVar.f45259k6;
                        org.telegram.messenger.gj gjVar3 = anVar.G5;
                        org.telegram.messenger.gj gjVar4 = anVar.f45281m4;
                        qm qmVar = anVar.C5;
                        ArrayList arrayList = ffVar2.f27718n;
                        int i13 = ffVar2.f27727x;
                        boolean z14 = ffVar2.M;
                        org.telegram.messenger.ez.b0(i13, i11, i12, j10, ffVar2.f27728y, l10.longValue(), anVar.j9(), ffVar2.f27707a, str, str2, arrayList, accountInstance, gjVar3, gjVar4, null, ljVar3, anVar.Y8(), g20Var2, photo, null, qmVar, z12, z13, z14);
                    } else if (ffVar2.h != null) {
                        org.telegram.messenger.ez.Z(anVar.getAccountInstance(), ffVar2.h, ffVar2.f27709c, null, anVar.f45259k6, anVar.G5, anVar.f45281m4, anVar.C5, ffVar2.f27718n, ffVar2.f27722r, null, ffVar2.f27727x, null, g20Var2, z12, i11, z13, ffVar2.f27707a, anVar.Y8(), ffVar2.f27728y, l10.longValue(), anVar.j9(), ljVar3);
                    } else if (ffVar2.I != null) {
                        org.telegram.messenger.ez.Z(anVar.getAccountInstance(), ffVar2.I, ffVar2.f27709c, null, anVar.f45259k6, anVar.G5, anVar.f45281m4, anVar.C5, ffVar2.f27718n, ffVar2.f27722r, null, ffVar2.f27727x, null, g20Var2, z12, i11, z13, ffVar2.f27707a, anVar.Y8(), ffVar2.f27728y, l10.longValue(), anVar.j9(), ljVar3);
                    }
                } else if (ffVar2.f27708b) {
                    org.telegram.messenger.c accountInstance2 = anVar.getAccountInstance();
                    String str3 = ffVar2.I;
                    String str4 = ffVar2.f27712g;
                    TLRPC.Photo photo2 = ffVar2.f27710e;
                    long j11 = anVar.f45259k6;
                    org.telegram.messenger.gj gjVar5 = anVar.E5;
                    org.telegram.messenger.gj gjVar6 = anVar.f45281m4;
                    qm qmVar2 = anVar.C5;
                    ArrayList arrayList2 = ffVar2.f27718n;
                    int i14 = ffVar2.f27727x;
                    org.telegram.messenger.gj gjVar7 = anVar.G5;
                    boolean z15 = ffVar2.M;
                    org.telegram.messenger.ez.b0(i14, i11, i12, j11, ffVar2.f27728y, l10.longValue(), anVar.j9(), ffVar2.f27707a, str3, str4, arrayList2, accountInstance2, gjVar5, gjVar6, gjVar7, anVar.f45422x5, anVar.Y8(), g20Var2, photo2, null, qmVar2, z12, z13, z15);
                } else if (ffVar2.h != null) {
                    org.telegram.messenger.ez.Z(anVar.getAccountInstance(), ffVar2.h, ffVar2.f27709c, null, anVar.f45259k6, anVar.E5, anVar.f45281m4, anVar.C5, ffVar2.f27718n, ffVar2.f27722r, null, ffVar2.f27727x, anVar.G5, g20Var2, z12, i11, z13, ffVar2.f27707a, anVar.Y8(), ffVar2.f27728y, l10.longValue(), anVar.j9(), anVar.f45422x5);
                } else if (ffVar2.I != null) {
                    org.telegram.messenger.ez.Z(anVar.getAccountInstance(), ffVar2.I, ffVar2.f27709c, null, anVar.f45259k6, anVar.E5, anVar.f45281m4, anVar.C5, ffVar2.f27718n, ffVar2.f27722r, null, ffVar2.f27727x, anVar.G5, g20Var2, z12, i11, z13, ffVar2.f27707a, anVar.Y8(), ffVar2.f27728y, l10.longValue(), anVar.j9(), anVar.f45422x5);
                }
                anVar.L6();
            }
        }, j3);
    }

    public final boolean u7() {
        CharSequence slowModeTimer = this.f45118a0.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131745310, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("SlowModeHint", null, 2131745311, slowModeTimer));
        i5.c.C(null, 2131747831, alertDialog$Builder, null);
        return false;
    }

    public final void u8(int i7, ArrayList arrayList, boolean z10) {
        ArrayList arrayList2;
        an anVar;
        int i10;
        an anVar2 = this;
        ArrayList arrayList3 = arrayList;
        if (!arrayList3.isEmpty() && anVar2.u7()) {
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 < arrayList3.size()) {
                    org.telegram.messenger.dz dzVar = (org.telegram.messenger.dz) arrayList3.get(i11);
                    if (dzVar.f23197m == null && dzVar.f23195k == null) {
                        break;
                    }
                    i11++;
                } else if (!TextUtils.isEmpty(((org.telegram.messenger.dz) arrayList3.get(0)).d)) {
                    org.telegram.messenger.cz b10 = org.telegram.messenger.cz.b(((org.telegram.messenger.dz) arrayList3.get(0)).d, anVar2.f45259k6, anVar2.E5, anVar2.f45281m4, null, false, ((org.telegram.messenger.dz) arrayList3.get(0)).f23193i, null, null, z10, i7, 0, null, false);
                    b10.K = anVar2.Y8();
                    org.telegram.messenger.ez.C(anVar2.currentAccount).r0(b10);
                }
            }
            int i12 = 0;
            while (i12 < arrayList3.size()) {
                org.telegram.messenger.dz dzVar2 = (org.telegram.messenger.dz) arrayList3.get(i12);
                if (dzVar2.f23197m != null && dzVar2.f23195k == null) {
                    org.telegram.messenger.c accountInstance = anVar2.getAccountInstance();
                    TLRPC.BotInlineResult botInlineResult = dzVar2.f23197m;
                    HashMap hashMap = dzVar2.f23198n;
                    int i13 = i12;
                    org.telegram.messenger.ez.S(i7, anVar2.f45259k6, 0L, anVar2.j9(), hashMap, accountInstance, anVar2.E5, anVar2.f45281m4, anVar2.Y8(), botInlineResult, null, anVar2, anVar2.C5, z10);
                    arrayList2 = arrayList;
                    anVar = anVar2;
                    arrayList2.remove(i13);
                    i10 = i13 - 1;
                } else {
                    arrayList2 = arrayList3;
                    anVar = anVar2;
                    i10 = i12;
                }
                i12 = i10 + 1;
                anVar2 = anVar;
                arrayList3 = arrayList2;
                z11 = false;
            }
            ArrayList arrayList4 = arrayList3;
            an anVar3 = anVar2;
            if (!arrayList4.isEmpty()) {
                anVar3.D8(((org.telegram.messenger.dz) arrayList4.get(0)).d, ((org.telegram.messenger.dz) arrayList4.get(0)).f23193i);
                org.telegram.messenger.ez.X(anVar3.getAccountInstance(), arrayList4, anVar3.f45259k6, anVar3.E5, anVar3.f45281m4, null, anVar3.C5, false, true, anVar3.G5, null, z10, i7, 0, ((org.telegram.messenger.dz) arrayList4.get(0)).f23204t, null, anVar3.Y8(), 0L, false, 0L, anVar3.j9(), anVar3.f45422x5, null, false);
                L6();
                if (i7 != 0) {
                    if (this.f45218h4 == -1) {
                        this.f45218h4 = 0;
                    }
                    this.f45218h4 = arrayList.size() + this.f45218h4;
                    md(true);
                }
            }
        }
    }

    public final org.telegram.messenger.bj u9(org.telegram.messenger.gj gjVar) {
        if (gjVar.c1() == 0) {
            return null;
        }
        org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) this.O6.f(gjVar.c1());
        if (bjVar != null && (bjVar.d.size() <= 1 || bjVar.d(gjVar) == null)) {
            return null;
        }
        return bjVar;
    }

    public final void ub(org.telegram.messenger.gj r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.ub(org.telegram.messenger.gj):void");
    }

    public final void uc(boolean z10) {
        if (z10) {
            if (this.fc == null) {
                yd ydVar = new yd(this, 13);
                this.fc = ydVar;
                org.telegram.messenger.g0.i3(ydVar, 100L);
                return;
            }
            return;
        }
        yd ydVar2 = this.fc;
        if (ydVar2 != null) {
            org.telegram.messenger.g0.r(ydVar2);
        }
        this.fc = null;
        this.f45185ec = false;
        fd(true);
    }

    public final void ud() {
        lh.h hVar;
        org.telegram.ui.ActionBar.x xVar;
        qj qjVar = this.f45118a0;
        if (qjVar != null) {
            if (this.f45204g4 != 1 && !this.f45394v4 && !ca()) {
                hVar = null;
            } else {
                hVar = this.f45431y1;
            }
            qjVar.setSideButtonsForAttach(hVar);
            boolean ca2 = ca();
            if (this.f45428xb != ca2) {
                this.f45428xb = ca2;
                org.telegram.ui.ActionBar.q0 q0Var = this.f45240j0;
                if ((q0Var != null && q0Var.getVisibility() == 0) || ((xVar = this.f45200g0) != null && xVar.f29850l == 0)) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (!kVar.f29304o0 && !kVar.x()) {
                        if (this.f45118a0.w0() && TextUtils.isEmpty(this.f45118a0.getSlowModeTimer()) && !ca()) {
                            org.telegram.ui.ActionBar.x xVar2 = this.f45200g0;
                            if (xVar2 != null) {
                                xVar2.e(0);
                            }
                            org.telegram.ui.ActionBar.q0 q0Var2 = this.f45240j0;
                            if (q0Var2 != null) {
                                q0Var2.setVisibility(8);
                            }
                            er erVar = this.f45188f0;
                            if (erVar != null) {
                                erVar.b(true);
                            }
                        } else {
                            org.telegram.ui.ActionBar.x xVar3 = this.f45200g0;
                            if (xVar3 != null) {
                                xVar3.e(8);
                            }
                            org.telegram.ui.ActionBar.q0 q0Var3 = this.f45240j0;
                            if (q0Var3 != null) {
                                q0Var3.setVisibility(0);
                            }
                            er erVar2 = this.f45188f0;
                            if (erVar2 != null) {
                                erVar2.b(false);
                            }
                        }
                        ui uiVar = this.f45314p1;
                        if (uiVar != null) {
                            uiVar.f39362l0 = false;
                        }
                    }
                }
            }
        }
    }

    public final void v7(Runnable runnable, cg.a aVar, boolean z10) {
        if (aVar != null && z10) {
            o1 o1Var = new o1(this, aVar, runnable, 20);
            di.v8 x10 = di.v8.x(this.currentAccount, aVar.f4985a);
            if (!x10.f9601e) {
                x10.q(o1Var, true, true);
                return;
            } else {
                o1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void v8(View view) {
        w8(view, false);
    }

    public final float v9(org.telegram.ui.Cells.q1 q1Var, float f10) {
        int[] iArr = this.Jb;
        q1Var.getLocationInWindow(iArr);
        int i7 = iArr[0];
        this.f45278m1.getLocationInWindow(iArr);
        return (i7 - iArr[0]) + f10;
    }

    public final void va() {
        Y6(5, this.f45175e1, true);
        Y6(1, this.f45118a0, false);
        Y6(4, this.f45203g3, true);
        Y6(3, this.f45162d1, false);
        Y6(2, this.T, false);
        float f10 = this.f45172dd.f57081e;
        m6.n nVar = this.f45239id;
        float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, f10, 1.0f - ((float[]) nVar.f20518b)[5], 1.0f);
        lh.c cVar = this.f45175e1;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(t6);
        }
        qj qjVar = this.f45118a0;
        if (qjVar != null) {
            qjVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * t6);
        }
        tj tjVar = this.f45203g3;
        if (tjVar != null) {
            tjVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * t6);
        }
        uj ujVar = this.f45162d1;
        if (ujVar != null) {
            ujVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * t6);
        }
        tj tjVar2 = this.T;
        if (tjVar2 != null) {
            tjVar2.setTranslationY(org.telegram.messenger.g0.L(54.0f) * t6);
        }
        jh.f fVar = this.U;
        if (fVar != null) {
            fVar.setInputBubbleAlpha((int) ((1.0f - t6) * 255.0f));
            this.U.setInputBubbleTranslationY(org.telegram.messenger.g0.L(54.0f) * t6);
        }
        uj ujVar2 = this.f45162d1;
        te.a aVar = this.bd;
        if (ujVar2 != null) {
            ujVar2.setTotalVisibilityFactor((1.0f - aVar.f57081e) * ((float[]) nVar.f20518b)[3]);
        }
        wo woVar = this.f45275la;
        if (woVar != null) {
            float f11 = aVar.f57081e;
            if (woVar.T != f11) {
                woVar.T = f11;
                this.fragmentView.invalidate();
            }
        }
        F7();
    }

    public final void vb(long j3) {
        dj djVar;
        org.telegram.messenger.gj messageObject;
        int h92;
        int abs;
        int i7 = -1;
        if (this.A0 != null && (djVar = this.C0) != null && djVar.f58498y < 0) {
            int i10 = 0;
            if (this.V6[0] && djVar.L0() == 0) {
                this.E7 = -1;
                return;
            }
            int i11 = Integer.MAX_VALUE;
            for (int childCount = this.A0.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.A0.getChildAt(childCount);
                this.A0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.Y1() == j3 && (abs = Math.abs((h92 = h9(childAt)))) < i11) {
                    i7 = messageObject.e1();
                    i10 = h92;
                    i11 = abs;
                }
            }
            this.E7 = i7;
            this.F7 = i10;
            return;
        }
        this.E7 = -1;
    }

    public final void vc(boolean z10) {
        float f10;
        int i7;
        int i10;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= org.telegram.messenger.np.s1(this.currentAccount).F5 * 1000) {
            ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
            if (!org.telegram.messenger.m10.i(this.currentAccount).q() && !org.telegram.messenger.np.s1(this.currentAccount).D3()) {
                if (z10) {
                    f10 = org.telegram.messenger.np.s1(this.currentAccount).D5;
                } else {
                    f10 = org.telegram.messenger.np.s1(this.currentAccount).E5;
                }
                SpannableString spannableString = new SpannableString(Double.toString(Math.round(f10 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                spannableString.setSpan(new org.telegram.ui.Components.y31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(this);
                    if (z10) {
                        i7 = 2131743802;
                    } else {
                        i7 = 2131751348;
                    }
                    String M0 = org.telegram.messenger.hd.M0(i7, null);
                    if (z10) {
                        i10 = 2131743801;
                    } else {
                        i10 = 2131751347;
                    }
                    org.telegram.ui.Components.xb I = a02.I(2131624211, M0, org.telegram.messenger.g0.K2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(i10, null), new se(this, z10, 0)), spannableString, "%d"));
                    I.f41643j = 8000;
                    I.k(true);
                }
            }
        }
    }

    public final void vd(boolean z10, boolean z11) {
        boolean z12;
        org.telegram.messenger.gj gjVar;
        org.telegram.ui.Wallet.a4 a4Var;
        if (this.fragmentView != null && !this.H5) {
            int childCount = this.A0.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 < childCount) {
                    View childAt = this.A0.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.t0) {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                        org.telegram.messenger.gj messageObject = t0Var.getMessageObject();
                        if (this.f45155c8 != Integer.MAX_VALUE && messageObject != null && messageObject.e1() == this.f45155c8 && t0Var.V()) {
                            org.telegram.ui.Wallet.c4 c4Var = t0Var.J0;
                            if (!c4Var.f43584h0 && (c4Var.f43579e0 == 0 || (a4Var = c4Var.f43577d0) == null || a4Var.c())) {
                                c4Var.e();
                                org.telegram.ui.Wallet.a4 a4Var2 = c4Var.f43577d0;
                                a4Var2.getClass();
                                a4Var2.v = Math.max(0L, 600L);
                                org.telegram.ui.Wallet.a4 a4Var3 = c4Var.f43577d0;
                                a4Var3.f33865b = -1L;
                                a4Var3.f33866c = -1L;
                                c4Var.f43579e0 = SystemClock.elapsedRealtime();
                                c4Var.f43581f0 = false;
                                c4Var.f43571a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        org.telegram.messenger.gj messageObject2 = q1Var.getMessageObject();
                        if (this.I8 != null && ((messageObject2.h4() || org.telegram.messenger.gj.L4(messageObject2.f23817k)) && !messageObject2.T4() && MediaController.B().I(messageObject2))) {
                            ImageReceiver photoImage = q1Var.getPhotoImage();
                            this.I8.setTranslationX(q1Var.getX() + photoImage.L0);
                            this.I8.setTranslationY((this.A0.getY() + ((q1Var.getY() + q1Var.getPaddingTop()) + photoImage.M0)) - this.I8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.I8.getLayoutParams();
                            if (messageObject2.h4()) {
                                this.I8.setTag(2131296591, null);
                                if (layoutParams.width != org.telegram.messenger.g0.g3(ba(), S9()) || layoutParams.height != org.telegram.messenger.g0.g3(ba(), S9())) {
                                    int g32 = org.telegram.messenger.g0.g3(ba(), S9());
                                    layoutParams.height = g32;
                                    layoutParams.width = g32;
                                    this.K8.setResizeMode(0);
                                    this.I8.setLayoutParams(layoutParams);
                                }
                                float g33 = ((org.telegram.messenger.g0.f23615x * 2) + org.telegram.messenger.g0.g3(ba(), S9())) / org.telegram.messenger.g0.g3(ba(), S9());
                                float g34 = q1Var.getPhotoImage().N0 / org.telegram.messenger.g0.g3(ba(), S9());
                                if (this.I8.getScaleX() != g34) {
                                    this.I8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.I8.setPivotX(0.0f);
                                this.I8.setPivotY(0.0f);
                                this.I8.setScaleX(g34);
                                this.I8.setScaleY(g34);
                                this.L8.setScaleX(g33);
                                this.L8.setScaleY(g33);
                            } else {
                                this.I8.setTag(2131296591, photoImage);
                                if (layoutParams.width != photoImage.N0 || layoutParams.height != photoImage.O0) {
                                    this.K8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.N0;
                                    layoutParams.height = (int) photoImage.O0;
                                    this.I8.setLayoutParams(layoutParams);
                                }
                                this.L8.setScaleX(1.0f);
                                this.L8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.I8.invalidate();
                            z12 = true;
                        }
                    }
                    i7++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z10 && this.I8 != null && (gjVar = MediaController.B().f22377v0) != null && gjVar.T == 0) {
                if (!z12) {
                    if (this.B3 && org.telegram.messenger.gj.L4(gjVar.f23817k)) {
                        MediaController.B().q(true, true, false, false);
                        return;
                    }
                    this.I8.setTranslationY((-org.telegram.messenger.g0.g3(ba(), S9())) - 100);
                    this.fragmentView.invalidate();
                    if (gjVar.h4() || org.telegram.messenger.gj.L4(gjVar.f23817k)) {
                        if (!this.B3 && PipRoundVideoView.G == null) {
                            if (z11) {
                                l(gjVar.e1(), 0, false, 0, true, 0);
                            }
                        } else {
                            MediaController.B().k0(false);
                        }
                    }
                } else {
                    MediaController.B().k0(true);
                    if (!gjVar.h4() && !this.M8) {
                        this.A0.invalidate();
                    }
                }
            }
        }
    }

    public final void w7() {
        if (this.O3 != null) {
            return;
        }
        mk mkVar = new mk(this, getParentActivity(), this, this.Aa);
        this.O3 = mkVar;
        this.f45278m1.addView(mkVar, 17, c8.ja.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void w8(View view, boolean z10) {
        boolean z11;
        Ub(view);
        if (view != this.f45431y1) {
            z11 = true;
        } else {
            z11 = false;
        }
        x8(z10, z11, 0.2f);
    }

    public final float w9(org.telegram.ui.Cells.q1 q1Var, float f10) {
        int[] iArr = this.Jb;
        q1Var.getLocationInWindow(iArr);
        int i7 = iArr[1];
        this.f45278m1.getLocationInWindow(iArr);
        return (i7 - iArr[1]) + f10;
    }

    public final void wa(boolean z10, boolean z11) {
        if (this.S3) {
            org.telegram.messenger.g0.i3(new yd(this, 24), 200L);
            if (z11) {
                this.S3 = false;
            }
        }
        if (z10 && !this.f45276lb) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
    }

    public final void wb() {
        int i7;
        int i10;
        aj ajVar = this.A0;
        if (ajVar != null && this.C0 != null) {
            for (int childCount = ajVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.A0.getChildAt(childCount);
                this.A0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i7 = h9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        i7 = h9(childAt);
                        break;
                    }
                }
            }
        }
        i7 = 0;
        i10 = -1;
        if (i10 >= 0) {
            this.C0.h1(i10, i7);
        }
    }

    public final void wc(boolean z10) {
        if (this.R != null) {
            if (!org.telegram.messenger.g0.Q1() && !this.f45394v4 && this.f45187f == null) {
                if (this.Hb == null) {
                    this.Hb = Boolean.valueOf(org.telegram.messenger.qc.e(360928));
                }
                if (this.Hb.booleanValue()) {
                    this.Gb = z10;
                    return;
                }
            }
            int i7 = 0;
            if (this.f45194f6 && org.telegram.messenger.gz.c()) {
                if (z10 == this.Gb) {
                    return;
                }
                this.Gb = z10;
                if (z10) {
                    if (this.R.getVisibility() != 0) {
                        this.R.setVisibility(0);
                        this.R.setAlpha(0.0f);
                        this.R.setScaleX(0.3f);
                        this.R.setScaleY(0.3f);
                    }
                    this.R.animate().setListener(null).cancel();
                    this.R.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    return;
                }
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new ei(this, 3)).start();
                return;
            }
            this.Gb = z10;
            FrameLayout frameLayout = this.R;
            if (!z10) {
                i7 = 4;
            }
            frameLayout.setVisibility(i7);
        }
    }

    public final void wd(boolean z10) {
        TLRPC.Chat M0;
        TLRPC.User user;
        TLRPC.Chat chat;
        ui uiVar = this.f45314p1;
        if (uiVar == null) {
            return;
        }
        int i7 = this.f45204g4;
        if (i7 == 8 && (chat = this.f45173e) != null) {
            if (this.f45231i4) {
                String i10 = qg.c.i(this.currentAccount, chat, false);
                TLRPC.Chat chat2 = this.f45173e;
                uiVar.h(i10, chat2.scam, chat2.fake, chat2.verified, false, null, z10);
            } else if (org.telegram.messenger.t3.p0(chat)) {
                int i11 = (this.f45358s4 > 0L ? 1 : (this.f45358s4 == 0L ? 0 : -1));
                if (i11 == 0) {
                    TLRPC.Chat chat3 = this.f45173e;
                    if (chat3.linked_monoforum_id != 0) {
                        TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.f45173e.linked_monoforum_id));
                        if (M02 == null) {
                            M02 = this.f45173e;
                        }
                        this.f45314p1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(M02.title)), M02.scam, M02.fake, M02.verified, false, M02.emoji_status, z10);
                    } else {
                        ui uiVar2 = this.f45314p1;
                        String F2 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat3.title));
                        TLRPC.Chat chat4 = this.f45173e;
                        uiVar2.h(F2, chat4.scam, chat4.fake, chat4.verified, false, chat4.emoji_status, z10);
                    }
                } else if (i11 > 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f45358s4));
                    this.f45314p1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.q10.p(a22))), a22.scam, a22.fake, a22.verified, a22.premium, a22.emoji_status, z10);
                } else {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(-this.f45358s4));
                    if (M03 == null) {
                        M03 = this.f45173e;
                    }
                    this.f45314p1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(M03.title)), M03.scam, M03.fake, M03.verified, false, M03.emoji_status, z10);
                }
            } else {
                ui uiVar3 = this.f45314p1;
                String F22 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(this.f45173e.title));
                TLRPC.Chat chat5 = this.f45173e;
                uiVar3.h(F22, chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            if (i7 == 9) {
                uiVar.setTitle(org.telegram.messenger.hd.M0(2131742898, null));
            } else if (i7 == 5) {
                if ("hello".equalsIgnoreCase(this.f45192f4)) {
                    this.f45314p1.setTitle(org.telegram.messenger.hd.M0(2131752775, null));
                } else if ("away".equalsIgnoreCase(this.f45192f4)) {
                    this.f45314p1.setTitle(org.telegram.messenger.hd.M0(2131752838, null));
                } else {
                    this.f45314p1.setTitle(this.f45192f4);
                }
            } else if (i7 == 6) {
                if (!TextUtils.isEmpty(this.f45178e4.title)) {
                    this.f45314p1.setTitle(this.f45178e4.title);
                } else {
                    this.f45314p1.setTitle(org.telegram.messenger.hd.M0(2131752716, null));
                }
            } else if (i7 == 3) {
                long j3 = this.f45358s4;
                if (j3 > 0) {
                    user = getMessagesController().a2(Long.valueOf(j3));
                    M0 = null;
                } else {
                    M0 = getMessagesController().M0(Long.valueOf(-j3));
                    user = null;
                }
                if (org.telegram.messenger.q10.z(user)) {
                    this.f45314p1.setTitle(org.telegram.messenger.hd.M0(2131746266, null));
                } else if (org.telegram.messenger.q10.s(user)) {
                    this.f45314p1.setTitle(org.telegram.messenger.hd.M0(2131754252, null));
                } else if (org.telegram.messenger.q10.B(user)) {
                    this.f45314p1.setTitle(org.telegram.messenger.hd.M0(2131748303, null));
                } else if (user != null) {
                    this.f45314p1.setTitle(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.q10.p(user))));
                } else if (M0 != null) {
                    this.f45314p1.setTitle(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(M0.title)));
                } else {
                    this.f45314p1.setTitle("");
                }
            } else if (fa() && !org.telegram.messenger.q10.u(this.f45187f)) {
                if (this.f45408w4) {
                    Bd();
                } else if (this.f45394v4) {
                    if (this.f45281m4.x2()) {
                        this.f45314p1.setTitle(org.telegram.messenger.hd.G(this.f45281m4.M1(), "Comments", new Object[0]));
                    } else {
                        this.f45314p1.setTitle(org.telegram.messenger.hd.M0(2131751996, null));
                    }
                } else {
                    this.f45314p1.setTitle(org.telegram.messenger.hd.G(this.f45281m4.M1(), "Replies", new Object[0]));
                }
            } else if (org.telegram.messenger.q10.z(this.f45187f)) {
                this.f45314p1.setTitle(org.telegram.messenger.hd.M0(2131746266, null));
            } else if (org.telegram.messenger.q10.s(this.f45187f)) {
                this.f45314p1.setTitle(org.telegram.messenger.hd.M0(2131754252, null));
            } else {
                int i12 = this.f45204g4;
                if (i12 == 1) {
                    if (org.telegram.messenger.q10.B(this.f45187f)) {
                        this.f45314p1.setTitle(org.telegram.messenger.hd.M0(2131746322, null));
                    } else {
                        this.f45314p1.setTitle(org.telegram.messenger.hd.M0(2131745848, null));
                    }
                } else if (i12 == 2) {
                    this.f45314p1.setTitle(org.telegram.messenger.hd.G(c9(), "PinnedMessagesCount", new Object[0]));
                } else {
                    TLRPC.Chat chat6 = this.f45173e;
                    if (chat6 != null) {
                        ui uiVar4 = this.f45314p1;
                        String F23 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat6.title));
                        TLRPC.Chat chat7 = this.f45173e;
                        uiVar4.h(F23, chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                    } else {
                        TLRPC.User user2 = this.f45187f;
                        if (user2 != null) {
                            if (user2.self) {
                                this.f45314p1.setTitle(org.telegram.messenger.hd.M0(2131745901, null));
                            } else if (!org.telegram.messenger.np.F2(user2) && getContactsController().f23680g0.get(Long.valueOf(this.f45187f.f28200id)) == null && (getContactsController().f23680g0.size() != 0 || !getContactsController().y())) {
                                if (!TextUtils.isEmpty(this.f45187f.phone)) {
                                    ui uiVar5 = this.f45314p1;
                                    String h = org.telegram.messenger.k5.h(new StringBuilder("+"), this.f45187f.phone, pf.b.c());
                                    TLRPC.User user3 = this.f45187f;
                                    boolean z11 = user3.scam;
                                    boolean z12 = user3.fake;
                                    boolean z13 = user3.verified;
                                    org.telegram.messenger.np messagesController = getMessagesController();
                                    TLRPC.User user4 = this.f45187f;
                                    messagesController.getClass();
                                    uiVar5.h(h, z11, z12, z13, org.telegram.messenger.np.B2(user4), this.f45187f.emoji_status, z10);
                                } else {
                                    ui uiVar6 = this.f45314p1;
                                    String F24 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.q10.p(this.f45187f)));
                                    TLRPC.User user5 = this.f45187f;
                                    boolean z14 = user5.scam;
                                    boolean z15 = user5.fake;
                                    boolean z16 = user5.verified;
                                    org.telegram.messenger.np messagesController2 = getMessagesController();
                                    TLRPC.User user6 = this.f45187f;
                                    messagesController2.getClass();
                                    uiVar6.h(F24, z14, z15, z16, org.telegram.messenger.np.B2(user6), this.f45187f.emoji_status, z10);
                                }
                            } else {
                                ui uiVar7 = this.f45314p1;
                                String F25 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.q10.p(this.f45187f)));
                                TLRPC.User user7 = this.f45187f;
                                boolean z17 = user7.scam;
                                boolean z18 = user7.fake;
                                boolean z19 = user7.verified;
                                org.telegram.messenger.np messagesController3 = getMessagesController();
                                TLRPC.User user8 = this.f45187f;
                                messagesController3.getClass();
                                boolean B2 = org.telegram.messenger.np.B2(user8);
                                if (!org.telegram.messenger.np.F2(this.f45187f)) {
                                    emojiStatus = this.f45187f.emoji_status;
                                }
                                uiVar7.h(F25, z17, z18, z19, B2, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f45314p1.getTitleTextView().getText());
        yd(false);
    }

    public final void x7(boolean z10) {
        long j3;
        if (System.currentTimeMillis() - this.f45264kc > 1000) {
            z10 = true;
        }
        uf ufVar = this.f45277lc;
        org.telegram.messenger.g0.r(ufVar);
        if (z10) {
            j3 = 0;
        } else {
            j3 = 150;
        }
        org.telegram.messenger.g0.i3(ufVar, j3);
    }

    public final void x8(boolean z10, boolean z11, float f10) {
        boolean z12;
        ValueAnimator ofFloat;
        lh.h hVar;
        org.telegram.ui.Cells.q1 q1Var;
        if (f10 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view = this.Y8;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
            q1Var2.setInvalidatesParent(z12);
            if (z12) {
                qb(q1Var2);
            }
        }
        this.f45278m1.invalidate();
        this.A0.invalidate();
        AnimatorSet animatorSet = this.f45183e9;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f45183e9.cancel();
        }
        this.f45183e9 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.W8, f10);
        float f11 = 1.0f;
        if (z12) {
            this.Z8 = 1.0f;
            this.f45127a9 = 0.0f;
            ValueAnimator valueAnimator = this.Hc;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.X8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.ok0.d(new je(this, 3));
            }
        } else {
            float f12 = this.W8;
            this.f45127a9 = f12 / max;
            this.X8 = false;
            ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new pf(this, max, 0));
        if ((!z12 || z11) && (hVar = this.f45431y1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f11 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hVar, property, f11));
        }
        this.f45183e9.playTogether(arrayList);
        this.f45183e9.setInterpolator(org.telegram.ui.Components.er.h);
        this.f45183e9.setDuration(320L);
        View view2 = this.Y8;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            q1Var = (org.telegram.ui.Cells.q1) view2;
        } else {
            q1Var = null;
        }
        this.f45183e9.addListener(new androidx.fragment.app.g(this, z12, q1Var, 6));
        if (this.Y8 != null && this.Z8 <= 0.0f) {
            Ub(null);
        }
        this.f45183e9.start();
    }

    public final void x9(boolean z10) {
        int i7;
        int i10;
        if (this.f45204g4 == 7) {
            org.telegram.messenger.na a10 = org.telegram.messenger.na.a(this.currentAccount);
            int i11 = this.classGuid;
            int i12 = this.K3;
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i13 = i12 + i10;
            org.telegram.messenger.ma b10 = a10.b(this.f45164d4);
            if (i13 >= 0 && i13 < b10.f24997a.size()) {
                b10.f25006l = i13;
                org.telegram.messenger.ns.f(a10.f25176a).k(org.telegram.messenger.ns.I0, Integer.valueOf(i11), Integer.valueOf(b10.f25007m), Boolean.valueOf(b10.f25008n), Integer.valueOf(b10.b()), Integer.valueOf(b10.f25006l), Integer.valueOf(((org.telegram.messenger.gj) b10.f24997a.get(i13)).f23817k.f28072id));
                return;
            }
            return;
        }
        org.telegram.messenger.si mediaDataController = getMediaDataController();
        long j3 = this.f45259k6;
        long j10 = this.f45154c7;
        int i14 = this.classGuid;
        boolean z11 = this.mb;
        if (!z10 ? !z11 : z11) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        mediaDataController.X1(null, j3, j10, i14, i7, this.f45358s4, false, this.D3, this.E3, true, this.F3);
        sc(false);
    }

    public final void xa() {
        this.Q4 = true;
        pl plVar = this.f45373t9;
        org.telegram.messenger.g0.r(plVar.f31745f0);
        plVar.f31771z = false;
        yd ydVar = new yd(this, 10);
        int i7 = this.U7;
        if (i7 != 0) {
            Bb(i7, 0, false, this.T7, true, 0, null, null, ydVar);
            return;
        }
        int i10 = this.S7;
        if (i10 > 0) {
            Bb(i10, 0, true, this.T7, true, 0, null, null, ydVar);
            return;
        }
        Ab(!this.Bb, ydVar);
        this.Bb = false;
        if (!this.U4.isEmpty()) {
            this.f45138b5 = true;
            this.f45123a5 = ((Integer) this.U4.get(0)).intValue();
        }
    }

    public final boolean xb() {
        qj qjVar = this.f45118a0;
        if (qjVar != null && qjVar.J0() && !this.f45118a0.f32178d1 && !MediaController.B().K()) {
            this.f45293n5 = true;
            qj qjVar2 = this.f45118a0;
            this.f45305o5 = qjVar2.P;
            this.f45318p5 = qjVar2.getRecordTimerStartTime();
            return true;
        }
        return false;
    }

    public final void xc() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.hd.M0(2131752657, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131752658, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new ce(this, 10));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        showDialog(t1Var);
    }

    public final void xd() {
        yd(false);
    }

    @Override
    public final boolean y(final org.telegram.ui.yw r24, final java.util.ArrayList r25, final java.lang.CharSequence r26, boolean r27, final boolean r28, final int r29, final int r30, org.telegram.ui.u91 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.y(org.telegram.ui.yw, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.u91):boolean");
    }

    public final void y7() {
        int t92 = (int) (t9(org.telegram.ui.Components.l11.f36702c) + this.U.getInputBubbleHeight() + this.f45403w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        this.Z.setFadeZoneBottom(t92);
        int b10 = c8.i9.b(org.telegram.messenger.g0.L(36.0f) + (this.f45278m1.getMeasuredHeight() - t92), 0, this.f45278m1.getMeasuredHeight());
        int measuredWidth = this.f45278m1.getMeasuredWidth();
        Rect rect = f45116td;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.Wa, this.A0.getMeasuredWidth(), org.telegram.messenger.g0.L(36.0f) + ((this.A0.getMeasuredHeight() - this.Xa) - t92));
    }

    public final void y8(Runnable runnable) {
        org.telegram.messenger.ns.f(this.currentAccount).d(runnable);
    }

    public final void y9() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.y9():void");
    }

    public final int yb(org.telegram.messenger.gj r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.yb(org.telegram.messenger.gj):int");
    }

    public final void yc() {
        String str;
        if (this.f45251jc != null) {
            return;
        }
        if (this.E5 != null) {
            str = getMessagesController().c1(this.E5.R1());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.hd.M0(2131743811, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743812, str));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751335, null), new ce(this, 19));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new ce(this, 20));
        t1Var.setOnDismissListener(new ge(this, 8));
        this.f45251jc = alertDialog$Builder.p();
    }

    public final void yd(boolean z10) {
        Drawable mutate;
        Drawable drawable;
        org.telegram.ui.ActionBar.o0 o0Var;
        if (this.f45314p1 != null) {
            int i7 = this.f45204g4;
            if (i7 == 0 || i7 == 8) {
                boolean r22 = getMessagesController().r2(this.f45259k6, b(), null);
                if (z10) {
                    r22 = !r22;
                }
                this.R0 = null;
                if (!org.telegram.messenger.t3.e0(this.currentAccount, this.f45173e) && !org.telegram.messenger.t3.f0(this.currentAccount, this.f45187f)) {
                    if (!org.telegram.messenger.q10.z(this.f45187f) && ((!fa() || this.f45408w4) && r22)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(2131231942).mutate();
                    int i10 = org.telegram.ui.ActionBar.j6.H6;
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
                    this.R0 = mutate;
                    this.O0 = getThemedColor(i10);
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.f45173e;
                    if (chat != null) {
                        drawable = this.f45314p1.c(org.telegram.messenger.m5.c(chat));
                    } else {
                        TLRPC.User user = this.f45187f;
                        if (user != null && !org.telegram.messenger.q10.B(user)) {
                            drawable = this.f45314p1.c(org.telegram.messenger.m5.c(this.f45187f));
                        } else {
                            drawable = null;
                        }
                    }
                }
                this.f45314p1.j(drawable, mutate);
                if (!z10 && (o0Var = this.f45366t1) != null) {
                    if (r22) {
                        if (o0Var.f29432m != 8) {
                            o0Var.f29432m = 8;
                            View view = o0Var.f29429j;
                            if (view instanceof org.telegram.ui.ActionBar.z0) {
                                ((org.telegram.ui.ActionBar.z0) view).getRightIcon().setVisibility(o0Var.f29432m);
                            }
                        }
                        this.f45366t1.d(org.telegram.messenger.hd.M0(2131743849, null));
                        this.f45366t1.b(2131232257);
                    } else {
                        if (o0Var.f29432m != 0) {
                            o0Var.f29432m = 0;
                            View view2 = o0Var.f29429j;
                            if (view2 instanceof org.telegram.ui.ActionBar.z0) {
                                ((org.telegram.ui.ActionBar.z0) view2).getRightIcon().setVisibility(o0Var.f29432m);
                            }
                        }
                        if (getMessagesController().s2(this.f45259k6, b())) {
                            this.f45366t1.d(org.telegram.messenger.hd.M0(2131748314, null));
                            this.f45366t1.b(2131232413);
                        } else {
                            this.f45366t1.d(org.telegram.messenger.hd.M0(2131748314, null));
                            this.f45366t1.b(2131232367);
                        }
                    }
                }
                org.telegram.ui.Components.io ioVar = this.f45418x1;
                if (ioVar != null) {
                    ioVar.e(this.f45259k6, b(), null);
                }
            }
        }
    }

    @Override
    public final boolean z() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void z7() {
        int i7;
        if (this.f45314p1 != null) {
            float actionModeFactor = (1.0f - this.f45213gd.f57081e) * (1.0f - this.actionBar.getActionModeFactor());
            float T1 = org.telegram.messenger.g0.T1(0.95f, 1.0f, actionModeFactor);
            this.f45314p1.setScaleX(T1);
            this.f45314p1.setScaleY(T1);
            this.f45314p1.setAlpha(actionModeFactor);
            ui uiVar = this.f45314p1;
            if (actionModeFactor > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            uiVar.setVisibility(i7);
        }
    }

    public final void z8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        org.telegram.messenger.gj gjVar = this.G5;
        if (gjVar != null && (message = gjVar.f23817k) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final boolean z9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.f45294n6;
        for (int i7 = 0; i7 < sparseArrayArr.length; i7++) {
            try {
                for (int i10 = 0; i10 < sparseArrayArr[i7].size(); i10++) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sparseArrayArr[i7].valueAt(i10);
                    if (gjVar != null && (message = gjVar.f23817k) != null && message.noforwards) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void za(long j3, String str, boolean z10) {
        Aa();
        fi.p2 p2Var = this.Y1;
        if (p2Var != null) {
            p2Var.C1(j3, str, z10, false);
        }
    }

    public final void zb() {
        Ab(false, null);
    }

    public final void zc(View view, CharSequence charSequence, boolean z10) {
        hi.l3 l3Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((l3Var = this.B2) != null && l3Var.W)) {
                this.B2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("SlowModeHint", null, 2131745311, charSequence)));
                if (z10) {
                    this.B2.y(view, true);
                }
            }
        }
    }

    public final void zd(boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.zd(boolean):void");
    }

    public void ya(boolean z10) {
    }

    @Override
    public final void T() {
    }
}
